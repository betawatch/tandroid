package i2;

import a8.yb;
import android.util.Pair;
import java.util.ArrayList;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class a1 {
    public final j2.e c;
    public final e2.i0 d;
    public final e1.c e;
    public long f;
    public int g;
    public boolean h;
    public y0 i;
    public y0 j;
    public y0 k;
    public y0 l;
    public y0 m;
    public int n;
    public Object o;
    public long p;
    public final b2.m1 a = new b2.m1();
    public final b2.o1 b = new b2.o1();
    public ArrayList q = new ArrayList();

    public a1(j2.e eVar, e2.i0 i0Var, e1.c cVar) {
        this.c = eVar;
        this.d = i0Var;
        this.e = cVar;
    }

    public static u2.g0 o(b2.p1 p1Var, Object obj, long j10, long j11, b2.o1 o1Var, b2.m1 m1Var) {
        p1Var.g(obj, m1Var);
        p1Var.n(m1Var.c, o1Var);
        p1Var.b(obj);
        int i10 = m1Var.g.a;
        if (i10 != 0) {
            if (i10 == 1) {
                m1Var.f(0);
            }
            m1Var.g.getClass();
            m1Var.g(0);
        }
        p1Var.g(obj, m1Var);
        int c10 = m1Var.c(j10);
        return c10 == -1 ? new u2.g0(obj, j11, m1Var.b(j10)) : new u2.g0(c10, m1Var.e(c10), -1, j11, obj);
    }

    public final y0 a() {
        y0 y0Var = this.i;
        if (y0Var == null) {
            return null;
        }
        if (y0Var == this.j) {
            this.j = y0Var.m;
        }
        if (y0Var == this.k) {
            this.k = y0Var.m;
        }
        y0Var.i();
        int i10 = this.n - 1;
        this.n = i10;
        if (i10 == 0) {
            this.l = null;
            y0 y0Var2 = this.i;
            this.o = y0Var2.b;
            this.p = y0Var2.g.a.d;
        }
        this.i = this.i.m;
        l();
        return this.i;
    }

    public final void b() {
        if (this.n == 0) {
            return;
        }
        y0 y0Var = this.i;
        y0Var.getClass();
        this.o = y0Var.b;
        this.p = y0Var.g.a.d;
        while (y0Var != null) {
            y0Var.i();
            y0Var = y0Var.m;
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
    public final z0 c(b2.p1 p1Var, y0 y0Var, long j10) {
        b2.p1 p1Var2;
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
        long q5;
        z0 z0Var = y0Var.g;
        long j22 = (y0Var.p + z0Var.f) - j10;
        if (z0Var.i) {
            z0 z0Var2 = y0Var.g;
            u2.g0 g0Var = z0Var2.a;
            long j23 = z0Var2.d;
            int d = p1Var.d(p1Var.b(g0Var.a), this.a, this.b, this.g, this.h);
            if (d != -1) {
                b2.m1 m1Var = this.a;
                int i10 = p1Var.f(d, m1Var, true).c;
                Object obj2 = m1Var.b;
                obj2.getClass();
                long j24 = g0Var.d;
                b2.o1 o1Var = this.b;
                if (p1Var.m(i10, o1Var, 0L).n == d) {
                    int i11 = m1Var.c;
                    if (m1Var.d == -9223372036854775807L) {
                        p1Var.n(i11, o1Var);
                        if (o1Var.i && !o1Var.k) {
                            j20 = Math.max(0L, j22);
                            j21 = p1Var.j(this.b, this.a, i10, -9223372036854775807L, j20);
                            if (j21 != null) {
                                Object obj3 = j21.first;
                                long longValue = ((Long) j21.second).longValue();
                                y0 y0Var2 = y0Var.m;
                                if (y0Var2 == null || !y0Var2.b.equals(obj3)) {
                                    q5 = q(obj3);
                                    if (q5 == -1) {
                                        q5 = this.f;
                                        this.f = 1 + q5;
                                    }
                                } else {
                                    q5 = y0Var2.g.a.d;
                                }
                                obj = obj3;
                                j16 = longValue;
                                j19 = q5;
                                j18 = j20;
                                j17 = -9223372036854775807L;
                            }
                        }
                    }
                    j20 = -9223372036854775807L;
                    j21 = p1Var.j(this.b, this.a, i10, -9223372036854775807L, j20);
                    if (j21 != null) {
                    }
                } else {
                    obj = obj2;
                    j16 = 0;
                    j17 = 0;
                    j18 = -9223372036854775807L;
                    j19 = j24;
                }
                u2.g0 o10 = o(p1Var, obj, j16, j19, this.b, this.a);
                if (j17 != -9223372036854775807L && j23 != -9223372036854775807L) {
                    int i12 = p1Var.g(g0Var.a, m1Var).g.a;
                    m1Var.g.getClass();
                    if (i12 > 0) {
                        m1Var.g(0);
                    }
                }
                return d(p1Var, o10, j17, j16, j18);
            }
            return null;
        }
        u2.g0 g0Var2 = z0Var.a;
        Object obj4 = g0Var2.a;
        int i13 = g0Var2.e;
        b2.m1 m1Var2 = this.a;
        p1Var.g(obj4, m1Var2);
        boolean z10 = z0Var.h;
        if (!g0Var2.b()) {
            if (i13 != -1) {
                m1Var2.f(i13);
            }
            int e = m1Var2.e(i13);
            m1Var2.g(i13);
            if (e != m1Var2.g.a(i13).a) {
                return e(p1Var, g0Var2.a, g0Var2.e, e, z0Var.f, g0Var2.d, z10);
            }
            p1Var.g(obj4, m1Var2);
            m1Var2.d(i13);
            m1Var2.g.a(i13).getClass();
            return f(p1Var, g0Var2.a, 0L, -9223372036854775807L, z0Var.f, g0Var2.d, false);
        }
        int i14 = g0Var2.b;
        int i15 = m1Var2.g.a(i14).a;
        if (i15 == -1) {
            return null;
        }
        int a2 = m1Var2.g.a(i14).a(g0Var2.c);
        if (a2 < i15) {
            return e(p1Var, g0Var2.a, i14, a2, z0Var.d, g0Var2.d, z10);
        }
        long j25 = z0Var.d;
        if (j25 == -9223372036854775807L) {
            int i16 = m1Var2.c;
            if (m1Var2.d == -9223372036854775807L) {
                b2.o1 o1Var2 = this.b;
                p1Var.n(i16, o1Var2);
                if (o1Var2.i && !o1Var2.k) {
                    j14 = Math.max(0L, j22);
                    j11 = 0;
                    p1Var2 = p1Var;
                    j15 = p1Var2.j(this.b, m1Var2, m1Var2.c, -9223372036854775807L, j14);
                    if (j15 != null) {
                        return null;
                    }
                    j13 = ((Long) j15.second).longValue();
                    j12 = j14;
                }
            }
            j14 = -9223372036854775807L;
            j11 = 0;
            p1Var2 = p1Var;
            j15 = p1Var2.j(this.b, m1Var2, m1Var2.c, -9223372036854775807L, j14);
            if (j15 != null) {
            }
        } else {
            p1Var2 = p1Var;
            j11 = 0;
            j12 = -9223372036854775807L;
            j13 = j25;
        }
        int i17 = g0Var2.b;
        p1Var2.g(obj4, m1Var2);
        m1Var2.d(i17);
        m1Var2.g.a(i17).getClass();
        return f(p1Var2, g0Var2.a, Math.max(j11, j13), j12, z0Var.d, g0Var2.d, z10);
    }

    public final z0 d(b2.p1 p1Var, u2.g0 g0Var, long j10, long j11, long j12) {
        p1Var.g(g0Var.a, this.a);
        return g0Var.b() ? e(p1Var, g0Var.a, g0Var.b, g0Var.c, j10, g0Var.d, false) : f(p1Var, g0Var.a, j11, j12, j10, g0Var.d, false);
    }

    public final z0 e(b2.p1 p1Var, Object obj, int i10, int i11, long j10, long j11, boolean z10) {
        u2.g0 g0Var = new u2.g0(i10, i11, -1, j11, obj);
        b2.m1 m1Var = this.a;
        long a2 = p1Var.g(obj, m1Var).a(i10, i11);
        if (i11 == m1Var.e(i10)) {
            m1Var.g.getClass();
        }
        m1Var.g(i10);
        long j12 = 0;
        if (a2 != -9223372036854775807L && 0 >= a2) {
            j12 = Math.max(0L, a2 - 1);
        }
        return new z0(g0Var, j12, -9223372036854775807L, j10, -9223372036854775807L, a2, z10, false, false, false, false);
    }

    public final z0 f(b2.p1 p1Var, Object obj, long j10, long j11, long j12, long j13, boolean z10) {
        long j14;
        b2.m1 m1Var = this.a;
        p1Var.g(obj, m1Var);
        int b10 = m1Var.b(j10);
        boolean z11 = false;
        if (b10 != -1) {
            m1Var.g(b10);
        } else if (m1Var.g.a > 0) {
            m1Var.g(0);
        }
        u2.g0 g0Var = new u2.g0(obj, j13, b10);
        if (!g0Var.b() && b10 == -1) {
            z11 = true;
        }
        boolean j15 = j(p1Var, g0Var);
        boolean i10 = i(p1Var, g0Var, z11);
        if (b10 != -1) {
            m1Var.g(b10);
        }
        if (b10 != -1) {
            m1Var.f(b10);
        }
        if (b10 != -1) {
            m1Var.d(b10);
            j14 = 0;
        } else {
            j14 = -9223372036854775807L;
        }
        long j16 = (j14 == -9223372036854775807L || j14 == Long.MIN_VALUE) ? m1Var.d : j14;
        return new z0(g0Var, (j16 == -9223372036854775807L || j10 < j16) ? j10 : Math.max(0L, j16 - 1), j11, j12, j14, j16, z10, false, z11, j15, i10);
    }

    public final y0 g() {
        return this.k;
    }

    public final z0 h(b2.p1 p1Var, z0 z0Var) {
        long j10;
        u2.g0 g0Var = z0Var.a;
        boolean b10 = g0Var.b();
        int i10 = g0Var.e;
        boolean z10 = !b10 && i10 == -1;
        int i11 = g0Var.b;
        boolean j11 = j(p1Var, g0Var);
        boolean i12 = i(p1Var, g0Var, z10);
        Object obj = g0Var.a;
        b2.m1 m1Var = this.a;
        p1Var.g(obj, m1Var);
        if (g0Var.b() || i10 == -1) {
            j10 = -9223372036854775807L;
        } else {
            m1Var.d(i10);
            j10 = 0;
        }
        long a2 = g0Var.b() ? m1Var.a(i11, g0Var.c) : (j10 == -9223372036854775807L || j10 == Long.MIN_VALUE) ? m1Var.d : j10;
        if (g0Var.b()) {
            m1Var.g(i11);
        } else if (i10 != -1) {
            m1Var.g(i10);
        }
        return new z0(g0Var, z0Var.b, z0Var.c, z0Var.d, j10, a2, z0Var.g, false, z10, j11, i12);
    }

    public final boolean i(b2.p1 p1Var, u2.g0 g0Var, boolean z10) {
        int b10 = p1Var.b(g0Var.a);
        if (!p1Var.m(p1Var.f(b10, this.a, false).c, this.b, 0L).i) {
            if (p1Var.d(b10, this.a, this.b, this.g, this.h) == -1 && z10) {
                return true;
            }
        }
        return false;
    }

    public final boolean j(b2.p1 p1Var, u2.g0 g0Var) {
        boolean z10 = !g0Var.b() && g0Var.e == -1;
        Object obj = g0Var.a;
        if (z10) {
            if (p1Var.m(p1Var.g(obj, this.a).c, this.b, 0L).o == p1Var.b(obj)) {
                return true;
            }
        }
        return false;
    }

    public final void k() {
        y0 y0Var = this.m;
        if (y0Var == null || y0Var.h()) {
            this.m = null;
            for (int i10 = 0; i10 < this.q.size(); i10++) {
                y0 y0Var2 = (y0) this.q.get(i10);
                if (!y0Var2.h()) {
                    this.m = y0Var2;
                    return;
                }
            }
        }
    }

    public final void l() {
        f9.f0 t10 = f9.i0.t();
        for (y0 y0Var = this.i; y0Var != null; y0Var = y0Var.m) {
            t10.c(y0Var.g.a);
        }
        y0 y0Var2 = this.j;
        this.d.d(new e2.m0(this, t10, y0Var2 == null ? null : y0Var2.g.a, 15));
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, u2.f1] */
    public final void m(long j10) {
        y0 y0Var = this.l;
        if (y0Var != null) {
            yb.p(y0Var.m == null);
            if (y0Var.e) {
                y0Var.a.s(j10 - y0Var.p);
            }
        }
    }

    public final int n(y0 y0Var) {
        y0Var.getClass();
        int i10 = 0;
        if (y0Var.equals(this.l)) {
            return 0;
        }
        this.l = y0Var;
        while (true) {
            y0Var = y0Var.m;
            if (y0Var == null) {
                break;
            }
            if (y0Var == this.j) {
                y0 y0Var2 = this.i;
                this.j = y0Var2;
                this.k = y0Var2;
                i10 = 3;
            }
            if (y0Var == this.k) {
                this.k = this.j;
                i10 |= 2;
            }
            y0Var.i();
            this.n--;
        }
        y0 y0Var3 = this.l;
        y0Var3.getClass();
        if (y0Var3.m != null) {
            y0Var3.b();
            y0Var3.m = null;
            y0Var3.c();
        }
        l();
        return i10;
    }

    public final u2.g0 p(b2.p1 p1Var, Object obj, long j10) {
        long q5;
        int b10;
        Object obj2 = obj;
        b2.m1 m1Var = this.a;
        int i10 = p1Var.g(obj2, m1Var).c;
        Object obj3 = this.o;
        if (obj3 == null || (b10 = p1Var.b(obj3)) == -1 || p1Var.f(b10, m1Var, false).c != i10) {
            y0 y0Var = this.i;
            while (true) {
                if (y0Var == null) {
                    y0 y0Var2 = this.i;
                    while (true) {
                        if (y0Var2 != null) {
                            int b11 = p1Var.b(y0Var2.b);
                            if (b11 != -1 && p1Var.f(b11, m1Var, false).c == i10) {
                                q5 = y0Var2.g.a.d;
                                break;
                            }
                            y0Var2 = y0Var2.m;
                        } else {
                            q5 = q(obj2);
                            if (q5 == -1) {
                                q5 = this.f;
                                this.f = 1 + q5;
                                if (this.i == null) {
                                    this.o = obj2;
                                    this.p = q5;
                                }
                            }
                        }
                    }
                } else {
                    if (y0Var.b.equals(obj2)) {
                        q5 = y0Var.g.a.d;
                        break;
                    }
                    y0Var = y0Var.m;
                }
            }
        } else {
            q5 = this.p;
        }
        p1Var.g(obj2, m1Var);
        int i11 = m1Var.c;
        b2.o1 o1Var = this.b;
        p1Var.n(i11, o1Var);
        boolean z10 = false;
        for (int b12 = p1Var.b(obj); b12 >= o1Var.n; b12--) {
            p1Var.f(b12, m1Var, true);
            boolean z11 = m1Var.g.a > 0;
            z10 |= z11;
            if (m1Var.c(m1Var.d) != -1) {
                obj2 = m1Var.b;
                obj2.getClass();
            }
            if (z10 && (!z11 || m1Var.d != 0)) {
                break;
            }
        }
        return o(p1Var, obj2, j10, q5, this.b, this.a);
    }

    public final long q(Object obj) {
        for (int i10 = 0; i10 < this.q.size(); i10++) {
            y0 y0Var = (y0) this.q.get(i10);
            if (y0Var.b.equals(obj)) {
                return y0Var.g.a.d;
            }
        }
        return -1L;
    }

    public final int r(b2.p1 p1Var) {
        b2.p1 p1Var2;
        y0 y0Var;
        y0 y0Var2 = this.i;
        if (y0Var2 == null) {
            return 0;
        }
        int b10 = p1Var.b(y0Var2.b);
        while (true) {
            p1Var2 = p1Var;
            b10 = p1Var2.d(b10, this.a, this.b, this.g, this.h);
            while (true) {
                y0Var2.getClass();
                y0Var = y0Var2.m;
                if (y0Var == null || y0Var2.g.i) {
                    break;
                }
                y0Var2 = y0Var;
            }
            if (b10 == -1 || y0Var == null || p1Var2.b(y0Var.b) != b10) {
                break;
            }
            y0Var2 = y0Var;
            p1Var = p1Var2;
        }
        int n10 = n(y0Var2);
        y0Var2.g = h(p1Var2, y0Var2.g);
        return n10;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d9 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int s(b2.p1 p1Var, long j10, long j11, long j12) {
        long j13;
        int i10;
        z0 b10;
        int i11;
        y0 y0Var = this.i;
        y0 y0Var2 = null;
        while (y0Var != null) {
            z0 z0Var = y0Var.g;
            if (y0Var2 != null) {
                z0 c10 = c(p1Var, y0Var2, j10);
                if (c10 != null) {
                    long j14 = c10.b;
                    u2.g0 g0Var = z0Var.a;
                    long j15 = z0Var.c;
                    j13 = -9223372036854775807L;
                    long j16 = z0Var.b;
                    i10 = 0;
                    if (g0Var.equals(c10.a)) {
                        if (j16 != j14) {
                            if (j15 != -9223372036854775807L) {
                                long j17 = c10.c;
                                if (j17 != -9223372036854775807L) {
                                    if (Math.abs((j14 - j17) - (j16 - j15)) >= 5000000) {
                                    }
                                }
                            }
                        }
                        b10 = j16 != j14 ? c10.b(j16, j15) : c10;
                    }
                }
                return n(y0Var2);
            }
            b10 = h(p1Var, z0Var);
            j13 = -9223372036854775807L;
            i10 = 0;
            long j18 = b10.f;
            long j19 = z0Var.d;
            long j20 = z0Var.f;
            y0Var.g = b10.a(j19);
            if (j20 != j18) {
                y0Var.k();
                long j21 = j18 == j13 ? Long.MAX_VALUE : j18 + y0Var.p;
                int i12 = 1;
                int i13 = (y0Var != this.j || y0Var.g.h || (j11 != Long.MIN_VALUE && j11 < j21)) ? i10 : 1;
                int i14 = (y0Var != this.k || (j12 != Long.MIN_VALUE && j12 < j21)) ? i10 : 1;
                int n10 = n(y0Var);
                if (n10 != 0) {
                    return n10;
                }
                if (j20 == j13 && z0Var.e == Long.MIN_VALUE) {
                    long j22 = b10.e;
                    if (j22 != j13 && j22 != Long.MIN_VALUE) {
                        i11 = 1;
                        if (i13 != 0 || (j20 == j13 && i11 == 0)) {
                            i12 = i10;
                        }
                        return i14 == 0 ? i12 | 2 : i12;
                    }
                }
                i11 = i10;
                if (i13 != 0) {
                }
                i12 = i10;
                if (i14 == 0) {
                }
            } else {
                y0Var2 = y0Var;
                y0Var = y0Var.m;
            }
        }
        return 0;
    }
}
