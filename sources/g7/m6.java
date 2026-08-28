package g7;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public abstract class m6 {
    public static void a(int i9, int i10, int i11) {
        if (i9 < 0 || i10 > i11) {
            StringBuilder o6 = e2.c.o("fromIndex: ", i9, ", toIndex: ", i10, ", size: ");
            o6.append(i11);
            throw new IndexOutOfBoundsException(o6.toString());
        }
        if (i9 > i10) {
            throw new IllegalArgumentException(aa.d.k(i9, i10, "fromIndex: ", " > toIndex: "));
        }
    }
}
