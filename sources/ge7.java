// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public enum ge7 {
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
    public final byte b;

    /* JADX WARN: Multi-variable type inference failed */
    ge7(int[] iArr, int i) {
        this.a = iArr;
        this.b = i;
    }

    public final int a(x9c x9cVar) {
        byte b = x9cVar.a;
        return this.a[b <= 9 ? (char) 0 : b <= 26 ? (char) 1 : (char) 2];
    }
}
