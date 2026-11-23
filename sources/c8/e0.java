package c8;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public abstract class e0 {
    public static void a(int i7, int i10, int i11) {
        if (i7 < 0 || i10 > i11) {
            StringBuilder n10 = i5.c.n("fromIndex: ", i7, ", toIndex: ", i10, ", size: ");
            n10.append(i11);
            throw new IndexOutOfBoundsException(n10.toString());
        }
        if (i7 > i10) {
            throw new IllegalArgumentException(a8.p0.m(i7, i10, "fromIndex: ", " > toIndex: "));
        }
    }
}
