package onboarding;

public class Problem2 {
    public static String solution(String cryptogram) {

        // loop을 돌며 반복을 제외한 최종 문자열을 얻는다.
        String answer = Loop(cryptogram);

        // 얻은 최종 문자열을 리턴한다.
        return answer;
    }

    // 순회 돌면서, 매 인덱스마다 다음 인덱스와 비교하여, 같으면 제거하고,
    // 제거한 새로운 input으로 루프를 다시 순회한다.
    // 같은 부분을 제거하면, 비교하는 인덱스 바로 앞의 인덱스로 이동하여 다시 비교한다.
    // 끝까지 도달할 때까지 최대한 한 번만 순회하도록 한다.
    public static String Loop(String input)
    {
        // implement
        return input;
    }

    // 겹치는 해당 인덱스와 다음 인덱스까지의 내용을 삭제한
    // 새로운 문자열을 반환한다.
    public static String removeRepeated(String str, int index)
    {
        // 문자열의 시작부터 동등 비교가 일어난 해당 인덱스 전까지 구한다.
        String str1 = str.substring(0, index);

        // 동등 비교가 일어난 해당 인덱스와 그 다음 인덱스를 제외해야 하므로
        // 인덱스로부터 2번 건너뛴 순서부터 문자열 끝까지 구한다.
        String str2 = str.substring(index + 2, str.length());

        // str1의 뒤에 str2를 붙인 새로운 문자열을 반환한다.
        return str1.concat(str2);
    }

}
