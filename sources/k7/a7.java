package k7;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public abstract class a7 {
    public static boolean a(String str, String str2) {
        int i10;
        char c3;
        int length = str.length();
        if (str == str2) {
            return true;
        }
        if (length == str2.length()) {
            while (i10 < length) {
                char charAt = str.charAt(i10);
                char charAt2 = str2.charAt(i10);
                i10 = (charAt == charAt2 || ((c3 = (char) ((charAt | ' ') + (-97))) < 26 && c3 == ((char) ((charAt2 | ' ') + (-97))))) ? i10 + 1 : 0;
            }
            return true;
        }
        return false;
    }

    public static String b(String str) {
        int length = str.length();
        int i10 = 0;
        while (i10 < length) {
            char charAt = str.charAt(i10);
            if (charAt >= 'A' && charAt <= 'Z') {
                char[] charArray = str.toCharArray();
                while (i10 < length) {
                    char c3 = charArray[i10];
                    if (c3 >= 'A' && c3 <= 'Z') {
                        charArray[i10] = (char) (c3 ^ ' ');
                    }
                    i10++;
                }
                return String.valueOf(charArray);
            }
            i10++;
        }
        return str;
    }

    public static String c(String str) {
        int length = str.length();
        int i10 = 0;
        while (i10 < length) {
            char charAt = str.charAt(i10);
            if (charAt >= 'a' && charAt <= 'z') {
                char[] charArray = str.toCharArray();
                while (i10 < length) {
                    char c3 = charArray[i10];
                    if (c3 >= 'a' && c3 <= 'z') {
                        charArray[i10] = (char) (c3 ^ ' ');
                    }
                    i10++;
                }
                return String.valueOf(charArray);
            }
            i10++;
        }
        return str;
    }
}
