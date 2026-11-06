package c8;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
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
