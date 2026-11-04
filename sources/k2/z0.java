package k2;

import android.util.Pair;
import b8.zb;
import ei.h9;
import ei.y8;
import java.util.ArrayList;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class z0 {
    public final l2.f c;
    public final g2.j0 d;
    public final y8 e;
    public long f;
    public int g;
    public boolean h;
    public x0 i;
    public x0 j;
    public x0 k;
    public x0 l;
    public x0 m;
    public int n;
    public Object o;
    public long p;
    public final d2.k1 a = new d2.k1();
    public final d2.m1 b = new d2.m1();
    public ArrayList q = new ArrayList();

    public z0(l2.f fVar, g2.j0 j0Var, y8 y8Var) {
        this.c = fVar;
        this.d = j0Var;
        this.e = y8Var;
    }

    public static w2.g0 o(d2.n1 n1Var, Object obj, long j10, long j11, d2.m1 m1Var, d2.k1 k1Var) {
        n1Var.g(obj, k1Var);
        n1Var.n(k1Var.c, m1Var);
        n1Var.b(obj);
        int i3 = k1Var.g.a;
        if (i3 != 0) {
            if (i3 == 1) {
                k1Var.f(0);
            }
            k1Var.g.getClass();
            k1Var.g(0);
        }
        n1Var.g(obj, k1Var);
        int c2 = k1Var.c(j10);
        return c2 == -1 ? new w2.g0(obj, j11, k1Var.b(j10)) : new w2.g0(c2, k1Var.e(c2), -1, j11, obj);
    }

    public final x0 a() {
        x0 x0Var = this.i;
        if (x0Var == null) {
            return null;
        }
        if (x0Var == this.j) {
            this.j = x0Var.m;
        }
        if (x0Var == this.k) {
            this.k = x0Var.m;
        }
        x0Var.i();
        int i3 = this.n - 1;
        this.n = i3;
        if (i3 == 0) {
            this.l = null;
            x0 x0Var2 = this.i;
            this.o = x0Var2.b;
            this.p = x0Var2.g.a.d;
        }
        this.i = this.i.m;
        l();
        return this.i;
    }

    public final void b() {
        if (this.n == 0) {
            return;
        }
        x0 x0Var = this.i;
        x0Var.getClass();
        this.o = x0Var.b;
        this.p = x0Var.g.a.d;
        while (x0Var != null) {
            x0Var.i();
            x0Var = x0Var.m;
        }
        this.i = null;
        this.l = null;
        this.j = null;
        this.k = null;
        this.n = 0;
        l();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:62:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final y0 c(d2.n1 n1Var, x0 x0Var, long j10) {
        d2.n1 n1Var2;
        long j11;
        long j12;
        long j13;
        long j14;
        Pair j15;
        Object obj;
        long j16;
        long j17;
        long j18;
        long j19;
        long j20;
        Pair j21;
        long q10;
        y0 y0Var = x0Var.g;
        long j22 = (x0Var.p + y0Var.f) - j10;
        if (y0Var.i) {
            y0 y0Var2 = x0Var.g;
            w2.g0 g0Var = y0Var2.a;
            long j23 = y0Var2.d;
            int d = n1Var.d(n1Var.b(g0Var.a), this.a, this.b, this.g, this.h);
            if (d != -1) {
                d2.k1 k1Var = this.a;
                int i3 = n1Var.f(d, k1Var, true).c;
                Object obj2 = k1Var.b;
                obj2.getClass();
                long j24 = g0Var.d;
                d2.m1 m1Var = this.b;
                if (n1Var.m(i3, m1Var, 0L).n == d) {
                    int i10 = k1Var.c;
                    if (k1Var.d == -9223372036854775807L) {
                        n1Var.n(i10, m1Var);
                        if (m1Var.i && !m1Var.k) {
                            j20 = Math.max(0L, j22);
                            j21 = n1Var.j(this.b, this.a, i3, -9223372036854775807L, j20);
                            if (j21 != null) {
                                Object obj3 = j21.first;
                                long longValue = ((Long) j21.second).longValue();
                                x0 x0Var2 = x0Var.m;
                                if (x0Var2 == null || !x0Var2.b.equals(obj3)) {
                                    q10 = q(obj3);
                                    if (q10 == -1) {
                                        q10 = this.f;
                                        this.f = 1 + q10;
                                    }
                                } else {
                                    q10 = x0Var2.g.a.d;
                                }
                                obj = obj3;
                                j16 = longValue;
                                j19 = q10;
                                j18 = j20;
                                j17 = -9223372036854775807L;
                            }
                        }
                    }
                    j20 = -9223372036854775807L;
                    j21 = n1Var.j(this.b, this.a, i3, -9223372036854775807L, j20);
                    if (j21 != null) {
                    }
                } else {
                    obj = obj2;
                    j16 = 0;
                    j17 = 0;
                    j18 = -9223372036854775807L;
                    j19 = j24;
                }
                w2.g0 o10 = o(n1Var, obj, j16, j19, this.b, this.a);
                if (j17 != -9223372036854775807L && j23 != -9223372036854775807L) {
                    int i11 = n1Var.g(g0Var.a, k1Var).g.a;
                    k1Var.g.getClass();
                    if (i11 > 0) {
                        k1Var.g(0);
                    }
                }
                return d(n1Var, o10, j17, j16, j18);
            }
            return null;
        }
        w2.g0 g0Var2 = y0Var.a;
        Object obj4 = g0Var2.a;
        int i12 = g0Var2.e;
        d2.k1 k1Var2 = this.a;
        n1Var.g(obj4, k1Var2);
        boolean z10 = y0Var.h;
        if (!g0Var2.b()) {
            if (i12 != -1) {
                k1Var2.f(i12);
            }
            int e10 = k1Var2.e(i12);
            k1Var2.g(i12);
            if (e10 != k1Var2.g.a(i12).a) {
                return e(n1Var, g0Var2.a, g0Var2.e, e10, y0Var.f, g0Var2.d, z10);
            }
            n1Var.g(obj4, k1Var2);
            k1Var2.d(i12);
            k1Var2.g.a(i12).getClass();
            return f(n1Var, g0Var2.a, 0L, -9223372036854775807L, y0Var.f, g0Var2.d, false);
        }
        int i13 = g0Var2.b;
        int i14 = k1Var2.g.a(i13).a;
        if (i14 == -1) {
            return null;
        }
        int a10 = k1Var2.g.a(i13).a(g0Var2.c);
        if (a10 < i14) {
            return e(n1Var, g0Var2.a, i13, a10, y0Var.d, g0Var2.d, z10);
        }
        long j25 = y0Var.d;
        if (j25 == -9223372036854775807L) {
            int i15 = k1Var2.c;
            if (k1Var2.d == -9223372036854775807L) {
                d2.m1 m1Var2 = this.b;
                n1Var.n(i15, m1Var2);
                if (m1Var2.i && !m1Var2.k) {
                    j14 = Math.max(0L, j22);
                    j11 = 0;
                    n1Var2 = n1Var;
                    j15 = n1Var2.j(this.b, k1Var2, k1Var2.c, -9223372036854775807L, j14);
                    if (j15 != null) {
                        return null;
                    }
                    j13 = ((Long) j15.second).longValue();
                    j12 = j14;
                }
            }
            j14 = -9223372036854775807L;
            j11 = 0;
            n1Var2 = n1Var;
            j15 = n1Var2.j(this.b, k1Var2, k1Var2.c, -9223372036854775807L, j14);
            if (j15 != null) {
            }
        } else {
            n1Var2 = n1Var;
            j11 = 0;
            j12 = -9223372036854775807L;
            j13 = j25;
        }
        int i16 = g0Var2.b;
        n1Var2.g(obj4, k1Var2);
        k1Var2.d(i16);
        k1Var2.g.a(i16).getClass();
        return f(n1Var2, g0Var2.a, Math.max(j11, j13), j12, y0Var.d, g0Var2.d, z10);
    }

    public final y0 d(d2.n1 n1Var, w2.g0 g0Var, long j10, long j11, long j12) {
        n1Var.g(g0Var.a, this.a);
        return g0Var.b() ? e(n1Var, g0Var.a, g0Var.b, g0Var.c, j10, g0Var.d, false) : f(n1Var, g0Var.a, j11, j12, j10, g0Var.d, false);
    }

    public final y0 e(d2.n1 n1Var, Object obj, int i3, int i10, long j10, long j11, boolean z10) {
        w2.g0 g0Var = new w2.g0(i3, i10, -1, j11, obj);
        d2.k1 k1Var = this.a;
        long a10 = n1Var.g(obj, k1Var).a(i3, i10);
        if (i10 == k1Var.e(i3)) {
            k1Var.g.getClass();
        }
        k1Var.g(i3);
        long j12 = 0;
        if (a10 != -9223372036854775807L && 0 >= a10) {
            j12 = Math.max(0L, a10 - 1);
        }
        return new y0(g0Var, j12, -9223372036854775807L, j10, -9223372036854775807L, a10, z10, false, false, false, false);
    }

    public final y0 f(d2.n1 n1Var, Object obj, long j10, long j11, long j12, long j13, boolean z10) {
        long j14;
        d2.k1 k1Var = this.a;
        n1Var.g(obj, k1Var);
        int b10 = k1Var.b(j10);
        boolean z11 = false;
        if (b10 != -1) {
            k1Var.g(b10);
        } else if (k1Var.g.a > 0) {
            k1Var.g(0);
        }
        w2.g0 g0Var = new w2.g0(obj, j13, b10);
        if (!g0Var.b() && b10 == -1) {
            z11 = true;
        }
        boolean j15 = j(n1Var, g0Var);
        boolean i3 = i(n1Var, g0Var, z11);
        if (b10 != -1) {
            k1Var.g(b10);
        }
        if (b10 != -1) {
            k1Var.f(b10);
        }
        if (b10 != -1) {
            k1Var.d(b10);
            j14 = 0;
        } else {
            j14 = -9223372036854775807L;
        }
        long j16 = (j14 == -9223372036854775807L || j14 == Long.MIN_VALUE) ? k1Var.d : j14;
        return new y0(g0Var, (j16 == -9223372036854775807L || j10 < j16) ? j10 : Math.max(0L, j16 - 1), j11, j12, j14, j16, z10, false, z11, j15, i3);
    }

    public final x0 g() {
        return this.k;
    }

    public final y0 h(d2.n1 n1Var, y0 y0Var) {
        long j10;
        w2.g0 g0Var = y0Var.a;
        boolean b10 = g0Var.b();
        int i3 = g0Var.e;
        boolean z10 = !b10 && i3 == -1;
        int i10 = g0Var.b;
        boolean j11 = j(n1Var, g0Var);
        boolean i11 = i(n1Var, g0Var, z10);
        Object obj = g0Var.a;
        d2.k1 k1Var = this.a;
        n1Var.g(obj, k1Var);
        if (g0Var.b() || i3 == -1) {
            j10 = -9223372036854775807L;
        } else {
            k1Var.d(i3);
            j10 = 0;
        }
        long a10 = g0Var.b() ? k1Var.a(i10, g0Var.c) : (j10 == -9223372036854775807L || j10 == Long.MIN_VALUE) ? k1Var.d : j10;
        if (g0Var.b()) {
            k1Var.g(i10);
        } else if (i3 != -1) {
            k1Var.g(i3);
        }
        return new y0(g0Var, y0Var.b, y0Var.c, y0Var.d, j10, a10, y0Var.g, false, z10, j11, i11);
    }

    public final boolean i(d2.n1 n1Var, w2.g0 g0Var, boolean z10) {
        int b10 = n1Var.b(g0Var.a);
        if (!n1Var.m(n1Var.f(b10, this.a, false).c, this.b, 0L).i) {
            if (n1Var.d(b10, this.a, this.b, this.g, this.h) == -1 && z10) {
                return true;
            }
        }
        return false;
    }

    public final boolean j(d2.n1 n1Var, w2.g0 g0Var) {
        boolean z10 = !g0Var.b() && g0Var.e == -1;
        Object obj = g0Var.a;
        if (z10) {
            if (n1Var.m(n1Var.g(obj, this.a).c, this.b, 0L).o == n1Var.b(obj)) {
                return true;
            }
        }
        return false;
    }

    public final void k() {
        x0 x0Var = this.m;
        if (x0Var == null || x0Var.h()) {
            this.m = null;
            for (int i3 = 0; i3 < this.q.size(); i3++) {
                x0 x0Var2 = (x0) this.q.get(i3);
                if (!x0Var2.h()) {
                    this.m = x0Var2;
                    return;
                }
            }
        }
    }

    public final void l() {
        g9.f0 p10 = g9.i0.p();
        for (x0 x0Var = this.i; x0Var != null; x0Var = x0Var.m) {
            p10.c(x0Var.g.a);
        }
        x0 x0Var2 = this.j;
        this.d.d(new h9(this, p10, x0Var2 == null ? null : x0Var2.g.a, 18));
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, w2.f1] */
    public final void m(long j10) {
        x0 x0Var = this.l;
        if (x0Var != null) {
            zb.p(x0Var.m == null);
            if (x0Var.e) {
                x0Var.a.t(j10 - x0Var.p);
            }
        }
    }

    public final int n(x0 x0Var) {
        x0Var.getClass();
        int i3 = 0;
        if (x0Var.equals(this.l)) {
            return 0;
        }
        this.l = x0Var;
        while (true) {
            x0Var = x0Var.m;
            if (x0Var == null) {
                break;
            }
            if (x0Var == this.j) {
                x0 x0Var2 = this.i;
                this.j = x0Var2;
                this.k = x0Var2;
                i3 = 3;
            }
            if (x0Var == this.k) {
                this.k = this.j;
                i3 |= 2;
            }
            x0Var.i();
            this.n--;
        }
        x0 x0Var3 = this.l;
        x0Var3.getClass();
        if (x0Var3.m != null) {
            x0Var3.b();
            x0Var3.m = null;
            x0Var3.c();
        }
        l();
        return i3;
    }

    public final w2.g0 p(d2.n1 n1Var, Object obj, long j10) {
        long q10;
        int b10;
        Object obj2 = obj;
        d2.k1 k1Var = this.a;
        int i3 = n1Var.g(obj2, k1Var).c;
        Object obj3 = this.o;
        if (obj3 == null || (b10 = n1Var.b(obj3)) == -1 || n1Var.f(b10, k1Var, false).c != i3) {
            x0 x0Var = this.i;
            while (true) {
                if (x0Var == null) {
                    x0 x0Var2 = this.i;
                    while (true) {
                        if (x0Var2 != null) {
                            int b11 = n1Var.b(x0Var2.b);
                            if (b11 != -1 && n1Var.f(b11, k1Var, false).c == i3) {
                                q10 = x0Var2.g.a.d;
                                break;
                            }
                            x0Var2 = x0Var2.m;
                        } else {
                            q10 = q(obj2);
                            if (q10 == -1) {
                                q10 = this.f;
                                this.f = 1 + q10;
                                if (this.i == null) {
                                    this.o = obj2;
                                    this.p = q10;
                                }
                            }
                        }
                    }
                } else {
                    if (x0Var.b.equals(obj2)) {
                        q10 = x0Var.g.a.d;
                        break;
                    }
                    x0Var = x0Var.m;
                }
            }
        } else {
            q10 = this.p;
        }
        n1Var.g(obj2, k1Var);
        int i10 = k1Var.c;
        d2.m1 m1Var = this.b;
        n1Var.n(i10, m1Var);
        boolean z10 = false;
        for (int b12 = n1Var.b(obj); b12 >= m1Var.n; b12--) {
            n1Var.f(b12, k1Var, true);
            boolean z11 = k1Var.g.a > 0;
            z10 |= z11;
            if (k1Var.c(k1Var.d) != -1) {
                obj2 = k1Var.b;
                obj2.getClass();
            }
            if (z10 && (!z11 || k1Var.d != 0)) {
                break;
            }
        }
        return o(n1Var, obj2, j10, q10, this.b, this.a);
    }

    public final long q(Object obj) {
        for (int i3 = 0; i3 < this.q.size(); i3++) {
            x0 x0Var = (x0) this.q.get(i3);
            if (x0Var.b.equals(obj)) {
                return x0Var.g.a.d;
            }
        }
        return -1L;
    }

    public final int r(d2.n1 n1Var) {
        d2.n1 n1Var2;
        x0 x0Var;
        x0 x0Var2 = this.i;
        if (x0Var2 == null) {
            return 0;
        }
        int b10 = n1Var.b(x0Var2.b);
        while (true) {
            n1Var2 = n1Var;
            b10 = n1Var2.d(b10, this.a, this.b, this.g, this.h);
            while (true) {
                x0Var2.getClass();
                x0Var = x0Var2.m;
                if (x0Var == null || x0Var2.g.i) {
                    break;
                }
                x0Var2 = x0Var;
            }
            if (b10 == -1 || x0Var == null || n1Var2.b(x0Var.b) != b10) {
                break;
            }
            x0Var2 = x0Var;
            n1Var = n1Var2;
        }
        int n4 = n(x0Var2);
        x0Var2.g = h(n1Var2, x0Var2.g);
        return n4;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d9 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int s(d2.n1 n1Var, long j10, long j11, long j12) {
        long j13;
        int i3;
        y0 b10;
        int i10;
        x0 x0Var = this.i;
        x0 x0Var2 = null;
        while (x0Var != null) {
            y0 y0Var = x0Var.g;
            if (x0Var2 != null) {
                y0 c2 = c(n1Var, x0Var2, j10);
                if (c2 != null) {
                    long j14 = c2.b;
                    w2.g0 g0Var = y0Var.a;
                    long j15 = y0Var.c;
                    j13 = -9223372036854775807L;
                    long j16 = y0Var.b;
                    i3 = 0;
                    if (g0Var.equals(c2.a)) {
                        if (j16 != j14) {
                            if (j15 != -9223372036854775807L) {
                                long j17 = c2.c;
                                if (j17 != -9223372036854775807L) {
                                    if (Math.abs((j14 - j17) - (j16 - j15)) >= 5000000) {
                                    }
                                }
                            }
                        }
                        b10 = j16 != j14 ? c2.b(j16, j15) : c2;
                    }
                }
                return n(x0Var2);
            }
            b10 = h(n1Var, y0Var);
            j13 = -9223372036854775807L;
            i3 = 0;
            long j18 = b10.f;
            long j19 = y0Var.d;
            long j20 = y0Var.f;
            x0Var.g = b10.a(j19);
            if (j20 != j18) {
                x0Var.k();
                long j21 = j18 == j13 ? Long.MAX_VALUE : j18 + x0Var.p;
                int i11 = 1;
                int i12 = (x0Var != this.j || x0Var.g.h || (j11 != Long.MIN_VALUE && j11 < j21)) ? i3 : 1;
                int i13 = (x0Var != this.k || (j12 != Long.MIN_VALUE && j12 < j21)) ? i3 : 1;
                int n4 = n(x0Var);
                if (n4 != 0) {
                    return n4;
                }
                if (j20 == j13 && y0Var.e == Long.MIN_VALUE) {
                    long j22 = b10.e;
                    if (j22 != j13 && j22 != Long.MIN_VALUE) {
                        i10 = 1;
                        if (i12 != 0 || (j20 == j13 && i10 == 0)) {
                            i11 = i3;
                        }
                        return i13 == 0 ? i11 | 2 : i11;
                    }
                }
                i10 = i3;
                if (i12 != 0) {
                }
                i11 = i3;
                if (i13 == 0) {
                }
            } else {
                x0Var2 = x0Var;
                x0Var = x0Var.m;
            }
        }
        return 0;
    }
}
