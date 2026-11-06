package c8;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public abstract class hb {
    public static void a(int i7, int i10) {
        String a10;
        if (i7 < 0 || i7 >= i10) {
            if (i7 < 0) {
                a10 = ib.a("%s (%s) must not be negative", "index", Integer.valueOf(i7));
            } else {
                if (i10 < 0) {
                    StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 15);
                    sb2.append("negative size: ");
                    sb2.append(i10);
                    throw new IllegalArgumentException(sb2.toString());
                }
                a10 = ib.a("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i7), Integer.valueOf(i10));
            }
            throw new IndexOutOfBoundsException(a10);
        }
    }

    public static void b(int i7, int i10, int i11) {
        if (i7 < 0 || i10 < i7 || i10 > i11) {
            throw new IndexOutOfBoundsException((i7 < 0 || i7 > i11) ? c(i7, i11, "start index") : (i10 < 0 || i10 > i11) ? c(i10, i11, "end index") : ib.a("end index (%s) must not be less than start index (%s)", Integer.valueOf(i10), Integer.valueOf(i7)));
        }
    }

    public static String c(int i7, int i10, String str) {
        if (i7 < 0) {
            return ib.a("%s (%s) must not be negative", str, Integer.valueOf(i7));
        }
        if (i10 >= 0) {
            return ib.a("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i7), Integer.valueOf(i10));
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 15);
        sb2.append("negative size: ");
        sb2.append(i10);
        throw new IllegalArgumentException(sb2.toString());
    }
}
