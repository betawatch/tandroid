package ic;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
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
