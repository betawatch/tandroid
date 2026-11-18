package l2;

import a8.la;
import android.util.Pair;
import java.util.ArrayList;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes.dex */
public final class w0 {
    public final m2.d c;
    public final h2.i0 d;
    public final ki.e e;
    public long f;
    public int g;
    public boolean h;
    public u0 i;
    public u0 j;
    public u0 k;
    public u0 l;
    public u0 m;
    public int n;
    public Object o;
    public long p;
    public final e2.i1 a = new e2.i1();
    public final e2.k1 b = new e2.k1();
    public ArrayList q = new ArrayList();

    public w0(m2.d dVar, h2.i0 i0Var, ki.e eVar) {
        this.c = dVar;
        this.d = i0Var;
        this.e = eVar;
    }

    public static x2.g0 o(e2.l1 l1Var, Object obj, long j3, long j10, e2.k1 k1Var, e2.i1 i1Var) {
        l1Var.g(obj, i1Var);
        l1Var.n(i1Var.c, k1Var);
        l1Var.b(obj);
        int i7 = i1Var.g.a;
        if (i7 != 0) {
            if (i7 == 1) {
                i1Var.f(0);
            }
            i1Var.g.getClass();
            i1Var.g(0);
        }
        l1Var.g(obj, i1Var);
        int c10 = i1Var.c(j3);
        return c10 == -1 ? new x2.g0(obj, j10, i1Var.b(j3)) : new x2.g0(c10, i1Var.e(c10), -1, j10, obj);
    }

    public final u0 a() {
        u0 u0Var = this.i;
        if (u0Var == null) {
            return null;
        }
        if (u0Var == this.j) {
            this.j = u0Var.m;
        }
        if (u0Var == this.k) {
            this.k = u0Var.m;
        }
        u0Var.i();
        int i7 = this.n - 1;
        this.n = i7;
        if (i7 == 0) {
            this.l = null;
            u0 u0Var2 = this.i;
            this.o = u0Var2.b;
            this.p = u0Var2.g.a.d;
        }
        this.i = this.i.m;
        l();
        return this.i;
    }

    public final void b() {
        if (this.n == 0) {
            return;
        }
        u0 u0Var = this.i;
        u0Var.getClass();
        this.o = u0Var.b;
        this.p = u0Var.g.a.d;
        while (u0Var != null) {
            u0Var.i();
            u0Var = u0Var.m;
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
    public final v0 c(e2.l1 l1Var, u0 u0Var, long j3) {
        e2.l1 l1Var2;
        long j10;
        long j11;
        long j12;
        long j13;
        Pair j14;
        Object obj;
        long j15;
        long j16;
        long j17;
        long j18;
        long j19;
        Pair j20;
        long q10;
        v0 v0Var = u0Var.g;
        long j21 = (u0Var.p + v0Var.f) - j3;
        if (v0Var.i) {
            v0 v0Var2 = u0Var.g;
            x2.g0 g0Var = v0Var2.a;
            long j22 = v0Var2.d;
            int d = l1Var.d(l1Var.b(g0Var.a), this.a, this.b, this.g, this.h);
            if (d != -1) {
                e2.i1 i1Var = this.a;
                int i7 = l1Var.f(d, i1Var, true).c;
                Object obj2 = i1Var.b;
                obj2.getClass();
                long j23 = g0Var.d;
                e2.k1 k1Var = this.b;
                if (l1Var.m(i7, k1Var, 0L).n == d) {
                    int i10 = i1Var.c;
                    if (i1Var.d == -9223372036854775807L) {
                        l1Var.n(i10, k1Var);
                        if (k1Var.i && !k1Var.k) {
                            j19 = Math.max(0L, j21);
                            j20 = l1Var.j(this.b, this.a, i7, -9223372036854775807L, j19);
                            if (j20 != null) {
                                Object obj3 = j20.first;
                                long longValue = ((Long) j20.second).longValue();
                                u0 u0Var2 = u0Var.m;
                                if (u0Var2 == null || !u0Var2.b.equals(obj3)) {
                                    q10 = q(obj3);
                                    if (q10 == -1) {
                                        q10 = this.f;
                                        this.f = 1 + q10;
                                    }
                                } else {
                                    q10 = u0Var2.g.a.d;
                                }
                                obj = obj3;
                                j15 = longValue;
                                j18 = q10;
                                j17 = j19;
                                j16 = -9223372036854775807L;
                            }
                        }
                    }
                    j19 = -9223372036854775807L;
                    j20 = l1Var.j(this.b, this.a, i7, -9223372036854775807L, j19);
                    if (j20 != null) {
                    }
                } else {
                    obj = obj2;
                    j15 = 0;
                    j16 = 0;
                    j17 = -9223372036854775807L;
                    j18 = j23;
                }
                x2.g0 o4 = o(l1Var, obj, j15, j18, this.b, this.a);
                if (j16 != -9223372036854775807L && j22 != -9223372036854775807L) {
                    int i11 = l1Var.g(g0Var.a, i1Var).g.a;
                    i1Var.g.getClass();
                    if (i11 > 0) {
                        i1Var.g(0);
                    }
                }
                return d(l1Var, o4, j16, j15, j17);
            }
            return null;
        }
        x2.g0 g0Var2 = v0Var.a;
        Object obj4 = g0Var2.a;
        int i12 = g0Var2.e;
        e2.i1 i1Var2 = this.a;
        l1Var.g(obj4, i1Var2);
        boolean z10 = v0Var.h;
        if (!g0Var2.b()) {
            if (i12 != -1) {
                i1Var2.f(i12);
            }
            int e10 = i1Var2.e(i12);
            i1Var2.g(i12);
            if (e10 != i1Var2.g.a(i12).a) {
                return e(l1Var, g0Var2.a, g0Var2.e, e10, v0Var.f, g0Var2.d, z10);
            }
            l1Var.g(obj4, i1Var2);
            i1Var2.d(i12);
            i1Var2.g.a(i12).getClass();
            return f(l1Var, g0Var2.a, 0L, -9223372036854775807L, v0Var.f, g0Var2.d, false);
        }
        int i13 = g0Var2.b;
        int i14 = i1Var2.g.a(i13).a;
        if (i14 == -1) {
            return null;
        }
        int a10 = i1Var2.g.a(i13).a(g0Var2.c);
        if (a10 < i14) {
            return e(l1Var, g0Var2.a, i13, a10, v0Var.d, g0Var2.d, z10);
        }
        long j24 = v0Var.d;
        if (j24 == -9223372036854775807L) {
            int i15 = i1Var2.c;
            if (i1Var2.d == -9223372036854775807L) {
                e2.k1 k1Var2 = this.b;
                l1Var.n(i15, k1Var2);
                if (k1Var2.i && !k1Var2.k) {
                    j13 = Math.max(0L, j21);
                    j10 = 0;
                    l1Var2 = l1Var;
                    j14 = l1Var2.j(this.b, i1Var2, i1Var2.c, -9223372036854775807L, j13);
                    if (j14 != null) {
                        return null;
                    }
                    j12 = ((Long) j14.second).longValue();
                    j11 = j13;
                }
            }
            j13 = -9223372036854775807L;
            j10 = 0;
            l1Var2 = l1Var;
            j14 = l1Var2.j(this.b, i1Var2, i1Var2.c, -9223372036854775807L, j13);
            if (j14 != null) {
            }
        } else {
            l1Var2 = l1Var;
            j10 = 0;
            j11 = -9223372036854775807L;
            j12 = j24;
        }
        int i16 = g0Var2.b;
        l1Var2.g(obj4, i1Var2);
        i1Var2.d(i16);
        i1Var2.g.a(i16).getClass();
        return f(l1Var2, g0Var2.a, Math.max(j10, j12), j11, v0Var.d, g0Var2.d, z10);
    }

    public final v0 d(e2.l1 l1Var, x2.g0 g0Var, long j3, long j10, long j11) {
        l1Var.g(g0Var.a, this.a);
        return g0Var.b() ? e(l1Var, g0Var.a, g0Var.b, g0Var.c, j3, g0Var.d, false) : f(l1Var, g0Var.a, j10, j11, j3, g0Var.d, false);
    }

    public final v0 e(e2.l1 l1Var, Object obj, int i7, int i10, long j3, long j10, boolean z10) {
        x2.g0 g0Var = new x2.g0(i7, i10, -1, j10, obj);
        e2.i1 i1Var = this.a;
        long a10 = l1Var.g(obj, i1Var).a(i7, i10);
        if (i10 == i1Var.e(i7)) {
            i1Var.g.getClass();
        }
        i1Var.g(i7);
        long j11 = 0;
        if (a10 != -9223372036854775807L && 0 >= a10) {
            j11 = Math.max(0L, a10 - 1);
        }
        return new v0(g0Var, j11, -9223372036854775807L, j3, -9223372036854775807L, a10, z10, false, false, false, false);
    }

    public final v0 f(e2.l1 l1Var, Object obj, long j3, long j10, long j11, long j12, boolean z10) {
        long j13;
        e2.i1 i1Var = this.a;
        l1Var.g(obj, i1Var);
        int b10 = i1Var.b(j3);
        boolean z11 = false;
        if (b10 != -1) {
            i1Var.g(b10);
        } else if (i1Var.g.a > 0) {
            i1Var.g(0);
        }
        x2.g0 g0Var = new x2.g0(obj, j12, b10);
        if (!g0Var.b() && b10 == -1) {
            z11 = true;
        }
        boolean j14 = j(l1Var, g0Var);
        boolean i7 = i(l1Var, g0Var, z11);
        if (b10 != -1) {
            i1Var.g(b10);
        }
        if (b10 != -1) {
            i1Var.f(b10);
        }
        if (b10 != -1) {
            i1Var.d(b10);
            j13 = 0;
        } else {
            j13 = -9223372036854775807L;
        }
        long j15 = (j13 == -9223372036854775807L || j13 == Long.MIN_VALUE) ? i1Var.d : j13;
        return new v0(g0Var, (j15 == -9223372036854775807L || j3 < j15) ? j3 : Math.max(0L, j15 - 1), j10, j11, j13, j15, z10, false, z11, j14, i7);
    }

    public final u0 g() {
        return this.k;
    }

    public final v0 h(e2.l1 l1Var, v0 v0Var) {
        long j3;
        x2.g0 g0Var = v0Var.a;
        boolean b10 = g0Var.b();
        int i7 = g0Var.e;
        boolean z10 = !b10 && i7 == -1;
        int i10 = g0Var.b;
        boolean j10 = j(l1Var, g0Var);
        boolean i11 = i(l1Var, g0Var, z10);
        Object obj = g0Var.a;
        e2.i1 i1Var = this.a;
        l1Var.g(obj, i1Var);
        if (g0Var.b() || i7 == -1) {
            j3 = -9223372036854775807L;
        } else {
            i1Var.d(i7);
            j3 = 0;
        }
        long a10 = g0Var.b() ? i1Var.a(i10, g0Var.c) : (j3 == -9223372036854775807L || j3 == Long.MIN_VALUE) ? i1Var.d : j3;
        if (g0Var.b()) {
            i1Var.g(i10);
        } else if (i7 != -1) {
            i1Var.g(i7);
        }
        return new v0(g0Var, v0Var.b, v0Var.c, v0Var.d, j3, a10, v0Var.g, false, z10, j10, i11);
    }

    public final boolean i(e2.l1 l1Var, x2.g0 g0Var, boolean z10) {
        int b10 = l1Var.b(g0Var.a);
        if (!l1Var.m(l1Var.f(b10, this.a, false).c, this.b, 0L).i) {
            if (l1Var.d(b10, this.a, this.b, this.g, this.h) == -1 && z10) {
                return true;
            }
        }
        return false;
    }

    public final boolean j(e2.l1 l1Var, x2.g0 g0Var) {
        boolean z10 = !g0Var.b() && g0Var.e == -1;
        Object obj = g0Var.a;
        if (z10) {
            if (l1Var.m(l1Var.g(obj, this.a).c, this.b, 0L).o == l1Var.b(obj)) {
                return true;
            }
        }
        return false;
    }

    public final void k() {
        u0 u0Var = this.m;
        if (u0Var == null || u0Var.h()) {
            this.m = null;
            for (int i7 = 0; i7 < this.q.size(); i7++) {
                u0 u0Var2 = (u0) this.q.get(i7);
                if (!u0Var2.h()) {
                    this.m = u0Var2;
                    return;
                }
            }
        }
    }

    public final void l() {
        h9.f0 p10 = h9.i0.p();
        for (u0 u0Var = this.i; u0Var != null; u0Var = u0Var.m) {
            p10.c(u0Var.g.a);
        }
        u0 u0Var2 = this.j;
        this.d.d(new kg.i0(this, p10, u0Var2 == null ? null : u0Var2.g.a, 9));
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, x2.f1] */
    public final void m(long j3) {
        u0 u0Var = this.l;
        if (u0Var != null) {
            la.p(u0Var.m == null);
            if (u0Var.e) {
                u0Var.a.u(j3 - u0Var.p);
            }
        }
    }

    public final int n(u0 u0Var) {
        u0Var.getClass();
        int i7 = 0;
        if (u0Var.equals(this.l)) {
            return 0;
        }
        this.l = u0Var;
        while (true) {
            u0Var = u0Var.m;
            if (u0Var == null) {
                break;
            }
            if (u0Var == this.j) {
                u0 u0Var2 = this.i;
                this.j = u0Var2;
                this.k = u0Var2;
                i7 = 3;
            }
            if (u0Var == this.k) {
                this.k = this.j;
                i7 |= 2;
            }
            u0Var.i();
            this.n--;
        }
        u0 u0Var3 = this.l;
        u0Var3.getClass();
        if (u0Var3.m != null) {
            u0Var3.b();
            u0Var3.m = null;
            u0Var3.c();
        }
        l();
        return i7;
    }

    public final x2.g0 p(e2.l1 l1Var, Object obj, long j3) {
        long q10;
        int b10;
        Object obj2 = obj;
        e2.i1 i1Var = this.a;
        int i7 = l1Var.g(obj2, i1Var).c;
        Object obj3 = this.o;
        if (obj3 == null || (b10 = l1Var.b(obj3)) == -1 || l1Var.f(b10, i1Var, false).c != i7) {
            u0 u0Var = this.i;
            while (true) {
                if (u0Var == null) {
                    u0 u0Var2 = this.i;
                    while (true) {
                        if (u0Var2 != null) {
                            int b11 = l1Var.b(u0Var2.b);
                            if (b11 != -1 && l1Var.f(b11, i1Var, false).c == i7) {
                                q10 = u0Var2.g.a.d;
                                break;
                            }
                            u0Var2 = u0Var2.m;
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
                    if (u0Var.b.equals(obj2)) {
                        q10 = u0Var.g.a.d;
                        break;
                    }
                    u0Var = u0Var.m;
                }
            }
        } else {
            q10 = this.p;
        }
        l1Var.g(obj2, i1Var);
        int i10 = i1Var.c;
        e2.k1 k1Var = this.b;
        l1Var.n(i10, k1Var);
        boolean z10 = false;
        for (int b12 = l1Var.b(obj); b12 >= k1Var.n; b12--) {
            l1Var.f(b12, i1Var, true);
            boolean z11 = i1Var.g.a > 0;
            z10 |= z11;
            if (i1Var.c(i1Var.d) != -1) {
                obj2 = i1Var.b;
                obj2.getClass();
            }
            if (z10 && (!z11 || i1Var.d != 0)) {
                break;
            }
        }
        return o(l1Var, obj2, j3, q10, this.b, this.a);
    }

    public final long q(Object obj) {
        for (int i7 = 0; i7 < this.q.size(); i7++) {
            u0 u0Var = (u0) this.q.get(i7);
            if (u0Var.b.equals(obj)) {
                return u0Var.g.a.d;
            }
        }
        return -1L;
    }

    public final int r(e2.l1 l1Var) {
        e2.l1 l1Var2;
        u0 u0Var;
        u0 u0Var2 = this.i;
        if (u0Var2 == null) {
            return 0;
        }
        int b10 = l1Var.b(u0Var2.b);
        while (true) {
            l1Var2 = l1Var;
            b10 = l1Var2.d(b10, this.a, this.b, this.g, this.h);
            while (true) {
                u0Var2.getClass();
                u0Var = u0Var2.m;
                if (u0Var == null || u0Var2.g.i) {
                    break;
                }
                u0Var2 = u0Var;
            }
            if (b10 == -1 || u0Var == null || l1Var2.b(u0Var.b) != b10) {
                break;
            }
            u0Var2 = u0Var;
            l1Var = l1Var2;
        }
        int n10 = n(u0Var2);
        u0Var2.g = h(l1Var2, u0Var2.g);
        return n10;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d9 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int s(e2.l1 l1Var, long j3, long j10, long j11) {
        long j12;
        int i7;
        v0 b10;
        int i10;
        u0 u0Var = this.i;
        u0 u0Var2 = null;
        while (u0Var != null) {
            v0 v0Var = u0Var.g;
            if (u0Var2 != null) {
                v0 c10 = c(l1Var, u0Var2, j3);
                if (c10 != null) {
                    long j13 = c10.b;
                    x2.g0 g0Var = v0Var.a;
                    long j14 = v0Var.c;
                    j12 = -9223372036854775807L;
                    long j15 = v0Var.b;
                    i7 = 0;
                    if (g0Var.equals(c10.a)) {
                        if (j15 != j13) {
                            if (j14 != -9223372036854775807L) {
                                long j16 = c10.c;
                                if (j16 != -9223372036854775807L) {
                                    if (Math.abs((j13 - j16) - (j15 - j14)) >= 5000000) {
                                    }
                                }
                            }
                        }
                        b10 = j15 != j13 ? c10.b(j15, j14) : c10;
                    }
                }
                return n(u0Var2);
            }
            b10 = h(l1Var, v0Var);
            j12 = -9223372036854775807L;
            i7 = 0;
            long j17 = b10.f;
            long j18 = v0Var.d;
            long j19 = v0Var.f;
            u0Var.g = b10.a(j18);
            if (j19 != j17) {
                u0Var.k();
                long j20 = j17 == j12 ? Long.MAX_VALUE : j17 + u0Var.p;
                int i11 = 1;
                int i12 = (u0Var != this.j || u0Var.g.h || (j10 != Long.MIN_VALUE && j10 < j20)) ? i7 : 1;
                int i13 = (u0Var != this.k || (j11 != Long.MIN_VALUE && j11 < j20)) ? i7 : 1;
                int n10 = n(u0Var);
                if (n10 != 0) {
                    return n10;
                }
                if (j19 == j12 && v0Var.e == Long.MIN_VALUE) {
                    long j21 = b10.e;
                    if (j21 != j12 && j21 != Long.MIN_VALUE) {
                        i10 = 1;
                        if (i12 != 0 || (j19 == j12 && i10 == 0)) {
                            i11 = i7;
                        }
                        return i13 == 0 ? i11 | 2 : i11;
                    }
                }
                i10 = i7;
                if (i12 != 0) {
                }
                i11 = i7;
                if (i13 == 0) {
                }
            } else {
                u0Var2 = u0Var;
                u0Var = u0Var.m;
            }
        }
        return 0;
    }
}
