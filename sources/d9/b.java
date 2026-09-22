package d9;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes.dex */
public final class b extends a {
    public final char a;

    public b(char c10) {
        this.a = c10;
    }

    @Override // d9.a
    public final boolean a(char c10) {
        return c10 == this.a;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CharMatcher.is('");
        char[] cArr = new char[6];
        cArr[0] = '\\';
        cArr[1] = 'u';
        cArr[2] = 0;
        cArr[3] = 0;
        cArr[4] = 0;
        cArr[5] = 0;
        char c10 = this.a;
        for (int i10 = 0; i10 < 4; i10++) {
            cArr[5 - i10] = "0123456789ABCDEF".charAt(c10 & 15);
            c10 = (char) (c10 >> 4);
        }
        sb2.append(String.copyValueOf(cArr));
        sb2.append("')");
        return sb2.toString();
    }
}
