package c8;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public abstract class b0 {
    public static void a(int i7, int i10, int i11) {
        if (i7 < 0 || i10 > i11) {
            StringBuilder o4 = jg.g.o("fromIndex: ", i7, ", toIndex: ", i10, ", size: ");
            o4.append(i11);
            throw new IndexOutOfBoundsException(o4.toString());
        }
        if (i7 > i10) {
            throw new IllegalArgumentException(a8.p0.m(i7, i10, "fromIndex: ", " > toIndex: "));
        }
    }
}
