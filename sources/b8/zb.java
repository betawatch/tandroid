package b8;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public abstract class zb {
    public static String a(int i3, int i10, String str) {
        if (i3 < 0) {
            return ac.a("%s (%s) must not be negative", str, Integer.valueOf(i3));
        }
        if (i10 >= 0) {
            return ac.a("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i3), Integer.valueOf(i10));
        }
        throw new IllegalArgumentException(k2.p1.i(i10, "negative size: "));
    }

    public static void b(int i3, int i10, String str, boolean z10) {
        if (!z10) {
            throw new IllegalArgumentException(ac.a(str, Integer.valueOf(i3), Integer.valueOf(i10)));
        }
    }

    public static void c(int i3, String str, boolean z10) {
        if (!z10) {
            throw new IllegalArgumentException(ac.a(str, Integer.valueOf(i3)));
        }
    }

    public static void d(long j10, String str, boolean z10) {
        if (!z10) {
            throw new IllegalArgumentException(ac.a(str, Long.valueOf(j10)));
        }
    }

    public static void e(String str, boolean z10) {
        if (!z10) {
            throw new IllegalArgumentException(String.valueOf(str));
        }
    }

    public static void f(boolean z10) {
        if (!z10) {
            throw new IllegalArgumentException();
        }
    }

    public static void g(boolean z10, String str, long j10, long j11) {
        if (!z10) {
            throw new IllegalArgumentException(ac.a(str, Long.valueOf(j10), Long.valueOf(j11)));
        }
    }

    public static void h(boolean z10, String str, Object obj) {
        if (!z10) {
            throw new IllegalArgumentException(ac.a(str, obj));
        }
    }

    public static void i(boolean z10, String str, Object obj, Comparable comparable) {
        if (!z10) {
            throw new IllegalArgumentException(ac.a(str, obj, comparable));
        }
    }

    public static void j(int i3, int i10) {
        String a10;
        if (i3 < 0 || i3 >= i10) {
            if (i3 < 0) {
                a10 = ac.a("%s (%s) must not be negative", "index", Integer.valueOf(i3));
            } else {
                if (i10 < 0) {
                    throw new IllegalArgumentException(k2.p1.i(i10, "negative size: "));
                }
                a10 = ac.a("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i3), Integer.valueOf(i10));
            }
            throw new IndexOutOfBoundsException(a10);
        }
    }

    public static void k(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static void l(k2.x0 x0Var) {
        x0Var.getClass();
    }

    public static void m(int i3, int i10) {
        if (i3 < 0 || i3 > i10) {
            throw new IndexOutOfBoundsException(a(i3, i10, "index"));
        }
    }

    public static void n(int i3, int i10, int i11) {
        if (i3 < 0 || i10 < i3 || i10 > i11) {
            throw new IndexOutOfBoundsException((i3 < 0 || i3 > i11) ? a(i3, i11, "start index") : (i10 < 0 || i10 > i11) ? a(i10, i11, "end index") : ac.a("end index (%s) must not be less than start index (%s)", Integer.valueOf(i10), Integer.valueOf(i3)));
        }
    }

    public static void o(String str, boolean z10) {
        if (!z10) {
            throw new IllegalStateException(String.valueOf(str));
        }
    }

    public static void p(boolean z10) {
        if (!z10) {
            throw new IllegalStateException();
        }
    }
}
