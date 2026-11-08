package a8;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public abstract class a9 {
    public static void a(int i7, int i10) {
        String a10;
        if (i7 < 0 || i7 >= i10) {
            if (i7 < 0) {
                a10 = b9.a("%s (%s) must not be negative", "index", Integer.valueOf(i7));
            } else {
                if (i10 < 0) {
                    throw new IllegalArgumentException(jg.g.j(i10, "negative size: "));
                }
                a10 = b9.a("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i7), Integer.valueOf(i10));
            }
            throw new IndexOutOfBoundsException(a10);
        }
    }

    public static void b(int i7, int i10) {
        if (i7 < 0 || i7 > i10) {
            throw new IndexOutOfBoundsException(d(i7, i10, "index"));
        }
    }

    public static void c(int i7, int i10, int i11) {
        if (i7 < 0 || i10 < i7 || i10 > i11) {
            throw new IndexOutOfBoundsException((i7 < 0 || i7 > i11) ? d(i7, i11, "start index") : (i10 < 0 || i10 > i11) ? d(i10, i11, "end index") : b9.a("end index (%s) must not be less than start index (%s)", Integer.valueOf(i10), Integer.valueOf(i7)));
        }
    }

    public static String d(int i7, int i10, String str) {
        if (i7 < 0) {
            return b9.a("%s (%s) must not be negative", str, Integer.valueOf(i7));
        }
        if (i10 >= 0) {
            return b9.a("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i7), Integer.valueOf(i10));
        }
        throw new IllegalArgumentException(jg.g.j(i10, "negative size: "));
    }
}
