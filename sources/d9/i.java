package d9;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes.dex */
public abstract class i implements m {
    public static String a(char c10) {
        char[] cArr = new char[6];
        cArr[0] = '\\';
        cArr[1] = 'u';
        cArr[2] = 0;
        cArr[3] = 0;
        cArr[4] = 0;
        cArr[5] = 0;
        for (int i10 = 0; i10 < 4; i10++) {
            cArr[5 - i10] = "0123456789ABCDEF".charAt(c10 & 15);
            c10 = (char) (c10 >> 4);
        }
        return String.copyValueOf(cArr);
    }

    public static i b(String str) {
        int length = str.length();
        return length != 0 ? length != 1 ? length != 2 ? new c(str) : new f(str.charAt(0), str.charAt(1)) : new e(str.charAt(0), 0) : b.f;
    }

    public abstract boolean c(char c10);

    public i d() {
        return new c(this);
    }
}
