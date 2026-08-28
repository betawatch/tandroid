package g7;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public abstract class b0 {
    public static boolean a(String str, String str2) {
        int i9;
        char c10;
        int length = str.length();
        if (str == str2) {
            return true;
        }
        if (length == str2.length()) {
            while (i9 < length) {
                char charAt = str.charAt(i9);
                char charAt2 = str2.charAt(i9);
                i9 = (charAt == charAt2 || ((c10 = (char) ((charAt | ' ') + (-97))) < 26 && c10 == ((char) ((charAt2 | ' ') + (-97))))) ? i9 + 1 : 0;
            }
            return true;
        }
        return false;
    }

    public static String b(String str) {
        int length = str.length();
        int i9 = 0;
        while (i9 < length) {
            char charAt = str.charAt(i9);
            if (charAt >= 'A' && charAt <= 'Z') {
                char[] charArray = str.toCharArray();
                while (i9 < length) {
                    char c10 = charArray[i9];
                    if (c10 >= 'A' && c10 <= 'Z') {
                        charArray[i9] = (char) (c10 ^ ' ');
                    }
                    i9++;
                }
                return String.valueOf(charArray);
            }
            i9++;
        }
        return str;
    }

    public static String c(String str) {
        int length = str.length();
        int i9 = 0;
        while (i9 < length) {
            char charAt = str.charAt(i9);
            if (charAt >= 'a' && charAt <= 'z') {
                char[] charArray = str.toCharArray();
                while (i9 < length) {
                    char c10 = charArray[i9];
                    if (c10 >= 'a' && c10 <= 'z') {
                        charArray[i9] = (char) (c10 ^ ' ');
                    }
                    i9++;
                }
                return String.valueOf(charArray);
            }
            i9++;
        }
        return str;
    }
}
