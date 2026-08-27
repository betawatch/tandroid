package h3;

import android.util.Pair;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public abstract class s2 implements g {
    public static final o2 a = new o2();

    static {
        int i10 = d5.g0.a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
    }

    public int a(boolean z10) {
        return p() ? -1 : 0;
    }

    public abstract int b(Object obj);

    public int c(boolean z10) {
        if (p()) {
            return -1;
        }
        return o() - 1;
    }

    public final int d(int i10, p2 p2Var, r2 r2Var, int i11, boolean z10) {
        int i12 = f(i10, p2Var, false).c;
        if (m(i12, r2Var, 0L).B != i10) {
            return i10 + 1;
        }
        int e9 = e(i12, i11, z10);
        if (e9 == -1) {
            return -1;
        }
        return m(e9, r2Var, 0L).A;
    }

    public int e(int i10, int i11, boolean z10) {
        if (i11 == 0) {
            if (i10 == c(z10)) {
                return -1;
            }
            return i10 + 1;
        }
        if (i11 == 1) {
            return i10;
        }
        if (i11 == 2) {
            return i10 == c(z10) ? a(z10) : i10 + 1;
        }
        throw new IllegalStateException();
    }

    public final boolean equals(Object obj) {
        int c10;
        if (this != obj) {
            if (obj instanceof s2) {
                s2 s2Var = (s2) obj;
                if (s2Var.o() == o() && s2Var.h() == h()) {
                    r2 r2Var = new r2();
                    p2 p2Var = new p2();
                    r2 r2Var2 = new r2();
                    p2 p2Var2 = new p2();
                    int i10 = 0;
                    while (true) {
                        if (i10 >= o()) {
                            int i11 = 0;
                            while (true) {
                                if (i11 >= h()) {
                                    int a2 = a(true);
                                    if (a2 == s2Var.a(true) && (c10 = c(true)) == s2Var.c(true)) {
                                        while (a2 != c10) {
                                            int e9 = e(a2, 0, true);
                                            if (e9 == s2Var.e(a2, 0, true)) {
                                                a2 = e9;
                                            }
                                        }
                                    }
                                } else {
                                    if (!f(i11, p2Var, true).equals(s2Var.f(i11, p2Var2, true))) {
                                        break;
                                    }
                                    i11++;
                                }
                            }
                        } else {
                            if (!m(i10, r2Var, 0L).equals(s2Var.m(i10, r2Var2, 0L))) {
                                break;
                            }
                            i10++;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public abstract p2 f(int i10, p2 p2Var, boolean z10);

    public p2 g(Object obj, p2 p2Var) {
        return f(b(obj), p2Var, true);
    }

    public abstract int h();

    public final int hashCode() {
        r2 r2Var = new r2();
        p2 p2Var = new p2();
        int o10 = o() + 217;
        for (int i10 = 0; i10 < o(); i10++) {
            o10 = (o10 * 31) + m(i10, r2Var, 0L).hashCode();
        }
        int h = h() + (o10 * 31);
        for (int i11 = 0; i11 < h(); i11++) {
            h = (h * 31) + f(i11, p2Var, true).hashCode();
        }
        int a2 = a(true);
        while (a2 != -1) {
            h = (h * 31) + a2;
            a2 = e(a2, 0, true);
        }
        return h;
    }

    public final Pair i(r2 r2Var, p2 p2Var, int i10, long j10) {
        Pair j11 = j(r2Var, p2Var, i10, j10, 0L);
        j11.getClass();
        return j11;
    }

    public final Pair j(r2 r2Var, p2 p2Var, int i10, long j10, long j11) {
        d5.a.h(i10, o());
        m(i10, r2Var, j11);
        if (j10 == -9223372036854775807L) {
            j10 = r2Var.x;
            if (j10 == -9223372036854775807L) {
                return null;
            }
        }
        int i11 = r2Var.A;
        f(i11, p2Var, false);
        while (i11 < r2Var.B && p2Var.e != j10) {
            int i12 = i11 + 1;
            if (f(i12, p2Var, false).e > j10) {
                break;
            }
            i11 = i12;
        }
        f(i11, p2Var, true);
        long j12 = j10 - p2Var.e;
        long j13 = p2Var.d;
        if (j13 != -9223372036854775807L) {
            j12 = Math.min(j12, j13 - 1);
        }
        long max = Math.max(0L, j12);
        Object obj = p2Var.b;
        obj.getClass();
        return Pair.create(obj, Long.valueOf(max));
    }

    public int k(int i10, int i11, boolean z10) {
        if (i11 == 0) {
            if (i10 == a(z10)) {
                return -1;
            }
            return i10 - 1;
        }
        if (i11 == 1) {
            return i10;
        }
        if (i11 == 2) {
            return i10 == a(z10) ? c(z10) : i10 - 1;
        }
        throw new IllegalStateException();
    }

    public abstract Object l(int i10);

    public abstract r2 m(int i10, r2 r2Var, long j10);

    public final void n(int i10, r2 r2Var) {
        m(i10, r2Var, 0L);
    }

    public abstract int o();

    public final boolean p() {
        return o() == 0;
    }
}
