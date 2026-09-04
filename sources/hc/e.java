package hc;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public enum e {
    c(new int[]{0, 0, 0}, 0),
    d(new int[]{10, 12, 14}, 1),
    e(new int[]{9, 11, 13}, 2),
    f(new int[]{0, 0, 0}, 3),
    h(new int[]{8, 16, 16}, 4),
    n(new int[]{0, 0, 0}, 7),
    r(new int[]{8, 10, 12}, 8),
    s(new int[]{0, 0, 0}, 5),
    v(new int[]{0, 0, 0}, 9),
    w(new int[]{8, 10, 12}, 13);

    public final int[] a;
    public final int b;

    e(int[] iArr, int i10) {
        this.a = iArr;
        this.b = i10;
    }

    public final int a(f fVar) {
        int i10 = fVar.a;
        return this.a[i10 <= 9 ? (char) 0 : i10 <= 26 ? (char) 1 : (char) 2];
    }
}
