package hc;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
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
    v(new int[]{0, 0, 0}, 9),
    w(new int[]{8, 10, 12}, 13);

    public final int[] a;
    public final int b;

    f(int[] iArr, int i10) {
        this.a = iArr;
        this.b = i10;
    }

    public final int a(g gVar) {
        int i10 = gVar.a;
        return this.a[i10 <= 9 ? (char) 0 : i10 <= 26 ? (char) 1 : (char) 2];
    }
}
