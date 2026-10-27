package a8;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
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
