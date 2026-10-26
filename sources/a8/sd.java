package a8;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public abstract class sd {
    public static void a(int i10, int i11, int i12) {
        if (i10 < 0 || i11 > i12) {
            StringBuilder n10 = c3.h0.n("fromIndex: ", i10, ", toIndex: ", i11, ", size: ");
            n10.append(i12);
            throw new IndexOutOfBoundsException(n10.toString());
        }
        if (i10 > i11) {
            throw new IllegalArgumentException(a1.g.l(i10, i11, "fromIndex: ", " > toIndex: "));
        }
    }
}
