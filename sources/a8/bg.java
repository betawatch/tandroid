package a8;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public abstract class bg {
    public static void a(int i10, int i11) {
        String b10;
        if (i10 < 0 || i10 >= i11) {
            if (i10 < 0) {
                b10 = rg.b("%s (%s) must not be negative", "index", Integer.valueOf(i10));
            } else {
                if (i11 < 0) {
                    throw new IllegalArgumentException(ic.a.i(i11, "negative size: "));
                }
                b10 = rg.b("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i10), Integer.valueOf(i11));
            }
            throw new IndexOutOfBoundsException(b10);
        }
    }

    public static void b(int i10, int i11, int i12) {
        if (i10 < 0 || i11 < i10 || i11 > i12) {
            throw new IndexOutOfBoundsException((i10 < 0 || i10 > i12) ? c(i10, i12, "start index") : (i11 < 0 || i11 > i12) ? c(i11, i12, "end index") : rg.b("end index (%s) must not be less than start index (%s)", Integer.valueOf(i11), Integer.valueOf(i10)));
        }
    }

    public static String c(int i10, int i11, String str) {
        if (i10 < 0) {
            return rg.b("%s (%s) must not be negative", str, Integer.valueOf(i10));
        }
        if (i11 >= 0) {
            return rg.b("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i10), Integer.valueOf(i11));
        }
        throw new IllegalArgumentException(ic.a.i(i11, "negative size: "));
    }
}
