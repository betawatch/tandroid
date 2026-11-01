package ac;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public enum f {
    c(new int[]{0, 0, 0}, 0),
    d(new int[]{10, 12, 14}, 1),
    e(new int[]{9, 11, 13}, 2),
    f(new int[]{0, 0, 0}, 3),
    h(new int[]{8, 16, 16}, 4),
    n(new int[]{0, 0, 0}, 7),
    r(new int[]{8, 10, 12}, 8),
    s(new int[]{0, 0, 0}, 5),
    w(new int[]{0, 0, 0}, 9),
    x(new int[]{8, 10, 12}, 13);

    public final int[] a;
    public final int b;

    f(int[] iArr, int i10) {
        this.a = iArr;
        this.b = i10;
    }

    public final int a(h hVar) {
        int i10 = hVar.a;
        return this.a[i10 <= 9 ? (char) 0 : i10 <= 26 ? (char) 1 : (char) 2];
    }
}
