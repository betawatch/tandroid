package a8;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public abstract class yb {
    public static String a(int i10, int i11, String str) {
        if (i10 < 0) {
            return zb.a("%s (%s) must not be negative", str, Integer.valueOf(i10));
        }
        if (i11 >= 0) {
            return zb.a("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i10), Integer.valueOf(i11));
        }
        throw new IllegalArgumentException(ic.a.i(i11, "negative size: "));
    }

    public static void b(int i10, String str, boolean z10) {
        if (!z10) {
            throw new IllegalArgumentException(zb.a(str, Integer.valueOf(i10)));
        }
    }

    public static void c(long j10, String str, boolean z10) {
        if (!z10) {
            throw new IllegalArgumentException(zb.a(str, Long.valueOf(j10)));
        }
    }

    public static void d(String str, int i10, int i11, boolean z10) {
        if (!z10) {
            throw new IllegalArgumentException(zb.a(str, Integer.valueOf(i10), Integer.valueOf(i11)));
        }
    }

    public static void e(String str, long j10, long j11, boolean z10) {
        if (!z10) {
            throw new IllegalArgumentException(zb.a(str, Long.valueOf(j10), Long.valueOf(j11)));
        }
    }

    public static void f(String str, boolean z10) {
        if (!z10) {
            throw new IllegalArgumentException(String.valueOf(str));
        }
    }

    public static void g(boolean z10) {
        if (!z10) {
            throw new IllegalArgumentException();
        }
    }

    public static void h(boolean z10, String str, Object obj) {
        if (!z10) {
            throw new IllegalArgumentException(zb.a(str, obj));
        }
    }

    public static void i(boolean z10, String str, Object obj, Comparable comparable) {
        if (!z10) {
            throw new IllegalArgumentException(zb.a(str, obj, comparable));
        }
    }

    public static void j(int i10, int i11) {
        String a2;
        if (i10 < 0 || i10 >= i11) {
            if (i10 < 0) {
                a2 = zb.a("%s (%s) must not be negative", "index", Integer.valueOf(i10));
            } else {
                if (i11 < 0) {
                    throw new IllegalArgumentException(ic.a.i(i11, "negative size: "));
                }
                a2 = zb.a("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i10), Integer.valueOf(i11));
            }
            throw new IndexOutOfBoundsException(a2);
        }
    }

    public static void k(i2.y0 y0Var) {
        y0Var.getClass();
    }

    public static void l(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static void m(int i10, int i11) {
        if (i10 < 0 || i10 > i11) {
            throw new IndexOutOfBoundsException(a(i10, i11, "index"));
        }
    }

    public static void n(int i10, int i11, int i12) {
        if (i10 < 0 || i11 < i10 || i11 > i12) {
            throw new IndexOutOfBoundsException((i10 < 0 || i10 > i12) ? a(i10, i12, "start index") : (i11 < 0 || i11 > i12) ? a(i11, i12, "end index") : zb.a("end index (%s) must not be less than start index (%s)", Integer.valueOf(i11), Integer.valueOf(i10)));
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
