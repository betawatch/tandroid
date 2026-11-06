package gc;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public enum d {
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

    d(int[] iArr, int i7) {
        this.a = iArr;
        this.b = i7;
    }

    public final int a(e eVar) {
        int i7 = eVar.a;
        return this.a[i7 <= 9 ? (char) 0 : i7 <= 26 ? (char) 1 : (char) 2];
    }
}
