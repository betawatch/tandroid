package i2;

import android.util.Pair;
import hi.y1;
import java.util.ArrayList;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class u0 {
    public final j2.e c;
    public final e2.z d;
    public final y1 e;
    public long f;
    public int g;
    public boolean h;
    public s0 i;
    public s0 j;
    public s0 k;
    public s0 l;
    public s0 m;
    public int n;
    public Object o;
    public long p;
    public final b2.h1 a = new b2.h1();
    public final b2.j1 b = new b2.j1();
    public ArrayList q = new ArrayList();

    public u0(j2.e eVar, e2.z zVar, y1 y1Var) {
        this.c = eVar;
        this.d = zVar;
        this.e = y1Var;
    }

    public static u2.g0 o(b2.k1 k1Var, Object obj, long j3, long j10, b2.j1 j1Var, b2.h1 h1Var) {
        k1Var.g(obj, h1Var);
        k1Var.n(h1Var.c, j1Var);
        k1Var.b(obj);
        int i10 = h1Var.g.a;
        if (i10 != 0) {
            if (i10 == 1) {
                h1Var.f(0);
            }
            h1Var.g.getClass();
            h1Var.g(0);
        }
        k1Var.g(obj, h1Var);
        int c10 = h1Var.c(j3);
        return c10 == -1 ? new u2.g0(obj, j10, h1Var.b(j3)) : new u2.g0(c10, h1Var.e(c10), -1, j10, obj);
    }

    public final s0 a() {
        s0 s0Var = this.i;
        if (s0Var == null) {
            return null;
        }
        if (s0Var == this.j) {
            this.j = s0Var.m;
        }
        if (s0Var == this.k) {
            this.k = s0Var.m;
        }
        s0Var.i();
        int i10 = this.n - 1;
        this.n = i10;
        if (i10 == 0) {
            this.l = null;
            s0 s0Var2 = this.i;
            this.o = s0Var2.b;
            this.p = s0Var2.g.a.d;
        }
        this.i = this.i.m;
        l();
        return this.i;
    }

    public final void b() {
        if (this.n == 0) {
            return;
        }
        s0 s0Var = this.i;
        e2.d.h(s0Var);
        this.o = s0Var.b;
        this.p = s0Var.g.a.d;
        while (s0Var != null) {
            s0Var.i();
            s0Var = s0Var.m;
        }
        this.i = null;
        this.l = null;
        this.j = null;
        this.k = null;
        this.n = 0;
        l();
    }

    public final t0 c(b2.k1 k1Var, s0 s0Var, long j3) {
        b2.h1 h1Var;
        long j10;
        b2.k1 k1Var2;
        Object obj;
        long j11;
        long j12;
        long j13;
        long q6;
        t0 t0Var = s0Var.g;
        long j14 = (s0Var.p + t0Var.e) - j3;
        if (!t0Var.h) {
            u2.g0 g0Var = t0Var.a;
            Object obj2 = g0Var.a;
            int i10 = g0Var.e;
            b2.h1 h1Var2 = this.a;
            k1Var.g(obj2, h1Var2);
            boolean z10 = t0Var.g;
            if (!g0Var.b()) {
                if (i10 != -1) {
                    h1Var2.f(i10);
                }
                int e = h1Var2.e(i10);
                h1Var2.g(i10);
                if (e != h1Var2.g.a(i10).a) {
                    return e(k1Var, g0Var.a, g0Var.e, e, t0Var.e, g0Var.d, z10);
                }
                k1Var.g(obj2, h1Var2);
                h1Var2.d(i10);
                h1Var2.g.a(i10).getClass();
                return f(k1Var, g0Var.a, 0L, t0Var.e, g0Var.d, false);
            }
            int i11 = g0Var.b;
            int i12 = h1Var2.g.a(i11).a;
            if (i12 == -1) {
                return null;
            }
            int a2 = h1Var2.g.a(i11).a(g0Var.c);
            if (a2 < i12) {
                return e(k1Var, g0Var.a, i11, a2, t0Var.c, g0Var.d, z10);
            }
            long j15 = t0Var.c;
            if (j15 == -9223372036854775807L) {
                int i13 = h1Var2.c;
                long max = Math.max(0L, j14);
                j10 = 0;
                Pair j16 = k1Var.j(this.b, h1Var2, i13, -9223372036854775807L, max);
                h1Var = h1Var2;
                k1Var2 = k1Var;
                if (j16 == null) {
                    return null;
                }
                j15 = ((Long) j16.second).longValue();
            } else {
                h1Var = h1Var2;
                j10 = 0;
                k1Var2 = k1Var;
            }
            int i14 = g0Var.b;
            k1Var2.g(obj2, h1Var);
            h1Var.d(i14);
            h1Var.g.a(i14).getClass();
            return f(k1Var, g0Var.a, Math.max(j10, j15), t0Var.c, g0Var.d, z10);
        }
        t0 t0Var2 = s0Var.g;
        u2.g0 g0Var2 = t0Var2.a;
        long j17 = t0Var2.c;
        int d = k1Var.d(k1Var.b(g0Var2.a), this.a, this.b, this.g, this.h);
        if (d != -1) {
            b2.h1 h1Var3 = this.a;
            int i15 = k1Var.f(d, h1Var3, true).c;
            Object obj3 = h1Var3.b;
            obj3.getClass();
            long j18 = g0Var2.d;
            if (k1Var.m(i15, this.b, 0L).n == d) {
                Pair j19 = k1Var.j(this.b, this.a, i15, -9223372036854775807L, Math.max(0L, j14));
                if (j19 != null) {
                    Object obj4 = j19.first;
                    long longValue = ((Long) j19.second).longValue();
                    s0 s0Var2 = s0Var.m;
                    if (s0Var2 == null || !s0Var2.b.equals(obj4)) {
                        q6 = q(obj4);
                        if (q6 == -1) {
                            q6 = this.f;
                            this.f = 1 + q6;
                        }
                    } else {
                        q6 = s0Var2.g.a.d;
                    }
                    obj = obj4;
                    j11 = longValue;
                    j13 = q6;
                    j12 = -9223372036854775807L;
                }
            } else {
                obj = obj3;
                j11 = 0;
                j12 = 0;
                j13 = j18;
            }
            u2.g0 o9 = o(k1Var, obj, j11, j13, this.b, this.a);
            if (j12 != -9223372036854775807L && j17 != -9223372036854775807L) {
                int i16 = k1Var.g(g0Var2.a, h1Var3).g.a;
                h1Var3.g.getClass();
                if (i16 > 0) {
                    h1Var3.g(0);
                }
            }
            return d(k1Var, o9, j12, j11);
        }
        return null;
    }

    public final t0 d(b2.k1 k1Var, u2.g0 g0Var, long j3, long j10) {
        k1Var.g(g0Var.a, this.a);
        return g0Var.b() ? e(k1Var, g0Var.a, g0Var.b, g0Var.c, j3, g0Var.d, false) : f(k1Var, g0Var.a, j10, j3, g0Var.d, false);
    }

    public final t0 e(b2.k1 k1Var, Object obj, int i10, int i11, long j3, long j10, boolean z10) {
        u2.g0 g0Var = new u2.g0(i10, i11, -1, j10, obj);
        b2.h1 h1Var = this.a;
        long a2 = k1Var.g(obj, h1Var).a(i10, i11);
        if (i11 == h1Var.e(i10)) {
            h1Var.g.getClass();
        }
        h1Var.g(i10);
        long j11 = 0;
        if (a2 != -9223372036854775807L && 0 >= a2) {
            j11 = Math.max(0L, a2 - 1);
        }
        return new t0(g0Var, j11, j3, -9223372036854775807L, a2, z10, false, false, false, false);
    }

    public final t0 f(b2.k1 k1Var, Object obj, long j3, long j10, long j11, boolean z10) {
        long j12;
        b2.h1 h1Var = this.a;
        k1Var.g(obj, h1Var);
        int b10 = h1Var.b(j3);
        boolean z11 = false;
        if (b10 != -1) {
            h1Var.g(b10);
        } else if (h1Var.g.a > 0) {
            h1Var.g(0);
        }
        u2.g0 g0Var = new u2.g0(obj, j11, b10);
        if (!g0Var.b() && b10 == -1) {
            z11 = true;
        }
        boolean j13 = j(k1Var, g0Var);
        boolean i10 = i(k1Var, g0Var, z11);
        if (b10 != -1) {
            h1Var.g(b10);
        }
        if (b10 != -1) {
            h1Var.f(b10);
        }
        if (b10 != -1) {
            h1Var.d(b10);
            j12 = 0;
        } else {
            j12 = -9223372036854775807L;
        }
        long j14 = (j12 == -9223372036854775807L || j12 == Long.MIN_VALUE) ? h1Var.d : j12;
        return new t0(g0Var, (j14 == -9223372036854775807L || j3 < j14) ? j3 : Math.max(0L, j14 - 1), j10, j12, j14, z10, false, z11, j13, i10);
    }

    public final s0 g() {
        return this.k;
    }

    public final t0 h(b2.k1 k1Var, t0 t0Var) {
        long j3;
        u2.g0 g0Var = t0Var.a;
        boolean b10 = g0Var.b();
        int i10 = g0Var.e;
        boolean z10 = !b10 && i10 == -1;
        int i11 = g0Var.b;
        boolean j10 = j(k1Var, g0Var);
        boolean i12 = i(k1Var, g0Var, z10);
        Object obj = g0Var.a;
        b2.h1 h1Var = this.a;
        k1Var.g(obj, h1Var);
        if (g0Var.b() || i10 == -1) {
            j3 = -9223372036854775807L;
        } else {
            h1Var.d(i10);
            j3 = 0;
        }
        long a2 = g0Var.b() ? h1Var.a(i11, g0Var.c) : (j3 == -9223372036854775807L || j3 == Long.MIN_VALUE) ? h1Var.d : j3;
        if (g0Var.b()) {
            h1Var.g(i11);
        } else if (i10 != -1) {
            h1Var.g(i10);
        }
        return new t0(g0Var, t0Var.b, t0Var.c, j3, a2, t0Var.f, false, z10, j10, i12);
    }

    public final boolean i(b2.k1 k1Var, u2.g0 g0Var, boolean z10) {
        int b10 = k1Var.b(g0Var.a);
        if (!k1Var.m(k1Var.f(b10, this.a, false).c, this.b, 0L).i) {
            if (k1Var.d(b10, this.a, this.b, this.g, this.h) == -1 && z10) {
                return true;
            }
        }
        return false;
    }

    public final boolean j(b2.k1 k1Var, u2.g0 g0Var) {
        boolean z10 = !g0Var.b() && g0Var.e == -1;
        Object obj = g0Var.a;
        if (z10) {
            if (k1Var.m(k1Var.g(obj, this.a).c, this.b, 0L).o == k1Var.b(obj)) {
                return true;
            }
        }
        return false;
    }

    public final void k() {
        s0 s0Var = this.m;
        if (s0Var == null || s0Var.h()) {
            this.m = null;
            for (int i10 = 0; i10 < this.q.size(); i10++) {
                s0 s0Var2 = (s0) this.q.get(i10);
                if (!s0Var2.h()) {
                    this.m = s0Var2;
                    return;
                }
            }
        }
    }

    public final void l() {
        e9.f0 u10 = e9.i0.u();
        for (s0 s0Var = this.i; s0Var != null; s0Var = s0Var.m) {
            u10.b(s0Var.g.a);
        }
        s0 s0Var2 = this.j;
        this.d.c(new gg.a0(this, u10, s0Var2 == null ? null : s0Var2.g.a, 9));
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, u2.f1] */
    public final void m(long j3) {
        s0 s0Var = this.l;
        if (s0Var != null) {
            e2.d.g(s0Var.m == null);
            if (s0Var.e) {
                s0Var.a.u(j3 - s0Var.p);
            }
        }
    }

    public final int n(s0 s0Var) {
        e2.d.h(s0Var);
        int i10 = 0;
        if (s0Var.equals(this.l)) {
            return 0;
        }
        this.l = s0Var;
        while (true) {
            s0Var = s0Var.m;
            if (s0Var == null) {
                break;
            }
            if (s0Var == this.j) {
                s0 s0Var2 = this.i;
                this.j = s0Var2;
                this.k = s0Var2;
                i10 = 3;
            }
            if (s0Var == this.k) {
                this.k = this.j;
                i10 |= 2;
            }
            s0Var.i();
            this.n--;
        }
        s0 s0Var3 = this.l;
        s0Var3.getClass();
        if (s0Var3.m != null) {
            s0Var3.b();
            s0Var3.m = null;
            s0Var3.c();
        }
        l();
        return i10;
    }

    public final u2.g0 p(b2.k1 k1Var, Object obj, long j3) {
        long q6;
        int b10;
        Object obj2 = obj;
        b2.h1 h1Var = this.a;
        int i10 = k1Var.g(obj2, h1Var).c;
        Object obj3 = this.o;
        if (obj3 == null || (b10 = k1Var.b(obj3)) == -1 || k1Var.f(b10, h1Var, false).c != i10) {
            s0 s0Var = this.i;
            while (true) {
                if (s0Var == null) {
                    s0 s0Var2 = this.i;
                    while (true) {
                        if (s0Var2 != null) {
                            int b11 = k1Var.b(s0Var2.b);
                            if (b11 != -1 && k1Var.f(b11, h1Var, false).c == i10) {
                                q6 = s0Var2.g.a.d;
                                break;
                            }
                            s0Var2 = s0Var2.m;
                        } else {
                            q6 = q(obj2);
                            if (q6 == -1) {
                                q6 = this.f;
                                this.f = 1 + q6;
                                if (this.i == null) {
                                    this.o = obj2;
                                    this.p = q6;
                                }
                            }
                        }
                    }
                } else {
                    if (s0Var.b.equals(obj2)) {
                        q6 = s0Var.g.a.d;
                        break;
                    }
                    s0Var = s0Var.m;
                }
            }
        } else {
            q6 = this.p;
        }
        k1Var.g(obj2, h1Var);
        int i11 = h1Var.c;
        b2.j1 j1Var = this.b;
        k1Var.n(i11, j1Var);
        boolean z10 = false;
        for (int b12 = k1Var.b(obj); b12 >= j1Var.n; b12--) {
            k1Var.f(b12, h1Var, true);
            boolean z11 = h1Var.g.a > 0;
            z10 |= z11;
            if (h1Var.c(h1Var.d) != -1) {
                obj2 = h1Var.b;
                obj2.getClass();
            }
            if (z10 && (!z11 || h1Var.d != 0)) {
                break;
            }
        }
        return o(k1Var, obj2, j3, q6, this.b, this.a);
    }

    public final long q(Object obj) {
        for (int i10 = 0; i10 < this.q.size(); i10++) {
            s0 s0Var = (s0) this.q.get(i10);
            if (s0Var.b.equals(obj)) {
                return s0Var.g.a.d;
            }
        }
        return -1L;
    }

    public final int r(b2.k1 k1Var) {
        b2.k1 k1Var2;
        s0 s0Var;
        s0 s0Var2 = this.i;
        if (s0Var2 == null) {
            return 0;
        }
        int b10 = k1Var.b(s0Var2.b);
        while (true) {
            k1Var2 = k1Var;
            b10 = k1Var2.d(b10, this.a, this.b, this.g, this.h);
            while (true) {
                s0Var2.getClass();
                s0Var = s0Var2.m;
                if (s0Var == null || s0Var2.g.h) {
                    break;
                }
                s0Var2 = s0Var;
            }
            if (b10 == -1 || s0Var == null || k1Var2.b(s0Var.b) != b10) {
                break;
            }
            s0Var2 = s0Var;
            k1Var = k1Var2;
        }
        int n10 = n(s0Var2);
        s0Var2.g = h(k1Var2, s0Var2.g);
        return n10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x00b4, code lost:
    
        return n(r3);
     */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00a6 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int s(b2.k1 k1Var, long j3, long j10, long j11) {
        t0 t0Var;
        boolean z10;
        s0 s0Var = this.i;
        s0 s0Var2 = null;
        while (true) {
            int i10 = 0;
            if (s0Var == null) {
                return 0;
            }
            t0 t0Var2 = s0Var.g;
            if (s0Var2 == null) {
                t0Var = h(k1Var, t0Var2);
            } else {
                t0 c10 = c(k1Var, s0Var2, j3);
                if (c10 == null || t0Var2.b != c10.b || !t0Var2.a.equals(c10.a)) {
                    break;
                }
                t0Var = c10;
            }
            long j12 = t0Var.e;
            long j13 = t0Var2.c;
            long j14 = t0Var2.e;
            s0Var.g = t0Var.a(j13);
            if (j14 != j12) {
                s0Var.k();
                long j15 = j12 == -9223372036854775807L ? Long.MAX_VALUE : j12 + s0Var.p;
                boolean z11 = s0Var == this.j && !s0Var.g.g && (j10 == Long.MIN_VALUE || j10 >= j15);
                boolean z12 = s0Var == this.k && (j11 == Long.MIN_VALUE || j11 >= j15);
                int n10 = n(s0Var);
                if (n10 != 0) {
                    return n10;
                }
                if (j14 == -9223372036854775807L && t0Var2.d == Long.MIN_VALUE) {
                    long j16 = t0Var.d;
                    if (j16 != -9223372036854775807L && j16 != Long.MIN_VALUE) {
                        z10 = true;
                        if (z11 && (j14 != -9223372036854775807L || z10)) {
                            i10 = 1;
                        }
                        return !z12 ? i10 | 2 : i10;
                    }
                }
                z10 = false;
                if (z11) {
                    i10 = 1;
                }
                if (!z12) {
                }
            } else {
                s0Var2 = s0Var;
                s0Var = s0Var.m;
            }
        }
    }
}
