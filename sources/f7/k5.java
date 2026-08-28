package f7;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public abstract class k5 {
    public static String a(String str) {
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
