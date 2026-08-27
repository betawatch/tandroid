package g7;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public abstract class f9 {
    public static e7.s a;

    public static synchronized b9 a(y8 y8Var) {
        b9 b9Var;
        synchronized (f9.class) {
            try {
                if (a == null) {
                    a = new e7.s(1);
                }
                b9Var = (b9) a.G(y8Var);
            } catch (Throwable th) {
                throw th;
            }
        }
        return b9Var;
    }

    public static void b(int i10, int i11) {
        String a2;
        if (i10 < 0 || i10 >= i11) {
            if (i10 < 0) {
                a2 = h7.g.a("%s (%s) must not be negative", "index", Integer.valueOf(i10));
            } else {
                if (i11 < 0) {
                    throw new IllegalArgumentException(i0.a.k(i11, "negative size: "));
                }
                a2 = h7.g.a("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i10), Integer.valueOf(i11));
            }
            throw new IndexOutOfBoundsException(a2);
        }
    }

    public static void c(int i10, int i11, int i12) {
        if (i10 < 0 || i11 < i10 || i11 > i12) {
            throw new IndexOutOfBoundsException((i10 < 0 || i10 > i12) ? d(i10, i12, "start index") : (i11 < 0 || i11 > i12) ? d(i11, i12, "end index") : h7.g.a("end index (%s) must not be less than start index (%s)", Integer.valueOf(i11), Integer.valueOf(i10)));
        }
    }

    public static String d(int i10, int i11, String str) {
        if (i10 < 0) {
            return h7.g.a("%s (%s) must not be negative", str, Integer.valueOf(i10));
        }
        if (i11 >= 0) {
            return h7.g.a("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i10), Integer.valueOf(i11));
        }
        throw new IllegalArgumentException(i0.a.k(i11, "negative size: "));
    }
}
