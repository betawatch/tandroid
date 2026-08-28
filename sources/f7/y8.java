package f7;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public abstract class y8 {
    public static void a(int i9, int i10) {
        String b10;
        if (i9 < 0 || i9 >= i10) {
            if (i9 < 0) {
                b10 = g9.b("%s (%s) must not be negative", "index", Integer.valueOf(i9));
            } else {
                if (i10 < 0) {
                    throw new IllegalArgumentException(j3.r0.l(i10, "negative size: "));
                }
                b10 = g9.b("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i9), Integer.valueOf(i10));
            }
            throw new IndexOutOfBoundsException(b10);
        }
    }

    public static void b(int i9, int i10, int i11) {
        if (i9 < 0 || i10 < i9 || i10 > i11) {
            throw new IndexOutOfBoundsException((i9 < 0 || i9 > i11) ? c(i9, i11, "start index") : (i10 < 0 || i10 > i11) ? c(i10, i11, "end index") : g9.b("end index (%s) must not be less than start index (%s)", Integer.valueOf(i10), Integer.valueOf(i9)));
        }
    }

    public static String c(int i9, int i10, String str) {
        if (i9 < 0) {
            return g9.b("%s (%s) must not be negative", str, Integer.valueOf(i9));
        }
        if (i10 >= 0) {
            return g9.b("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i9), Integer.valueOf(i10));
        }
        throw new IllegalArgumentException(j3.r0.l(i10, "negative size: "));
    }
}
