package g7;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public abstract class d0 {
    public static String a(int i9, int i10, String str) {
        if (i9 < 0) {
            return e0.a("%s (%s) must not be negative", str, Integer.valueOf(i9));
        }
        if (i10 >= 0) {
            return e0.a("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i9), Integer.valueOf(i10));
        }
        StringBuilder sb2 = new StringBuilder(26);
        sb2.append("negative size: ");
        sb2.append(i10);
        throw new IllegalArgumentException(sb2.toString());
    }

    public static void b(int i9, int i10) {
        String a2;
        if (i9 < 0 || i9 >= i10) {
            if (i9 < 0) {
                a2 = e0.a("%s (%s) must not be negative", "index", Integer.valueOf(i9));
            } else {
                if (i10 < 0) {
                    StringBuilder sb2 = new StringBuilder(26);
                    sb2.append("negative size: ");
                    sb2.append(i10);
                    throw new IllegalArgumentException(sb2.toString());
                }
                a2 = e0.a("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i9), Integer.valueOf(i10));
            }
            throw new IndexOutOfBoundsException(a2);
        }
    }

    public static void c(int i9, int i10) {
        if (i9 < 0 || i9 > i10) {
            throw new IndexOutOfBoundsException(a(i9, i10, "index"));
        }
    }

    public static void d(int i9, int i10, int i11) {
        if (i9 < 0 || i10 < i9 || i10 > i11) {
            throw new IndexOutOfBoundsException((i9 < 0 || i9 > i11) ? a(i9, i11, "start index") : (i10 < 0 || i10 > i11) ? a(i10, i11, "end index") : e0.a("end index (%s) must not be less than start index (%s)", Integer.valueOf(i10), Integer.valueOf(i9)));
        }
    }
}
