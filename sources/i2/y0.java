package i2;

import android.util.Pair;
import ei.z1;
import java.util.ArrayList;
import v7.u6;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes.dex */
public final class y0 {
    public final j2.e c;
    public final e2.i0 d;
    public final e1.c e;
    public long f;
    public int g;
    public boolean h;
    public w0 i;
    public w0 j;
    public w0 k;
    public w0 l;
    public w0 m;
    public int n;
    public Object o;
    public long p;
    public final b2.l1 a = new b2.l1();
    public final b2.n1 b = new b2.n1();
    public ArrayList q = new ArrayList();

    public y0(j2.e eVar, e2.i0 i0Var, e1.c cVar) {
        this.c = eVar;
        this.d = i0Var;
        this.e = cVar;
    }

    public static u2.h0 o(b2.o1 o1Var, Object obj, long j10, long j11, b2.n1 n1Var, b2.l1 l1Var) {
        o1Var.g(obj, l1Var);
        o1Var.n(l1Var.c, n1Var);
        o1Var.b(obj);
        int i10 = l1Var.g.a;
        if (i10 != 0) {
            if (i10 == 1) {
                l1Var.f(0);
            }
            l1Var.g.getClass();
            l1Var.g(0);
        }
        o1Var.g(obj, l1Var);
        int c10 = l1Var.c(j10);
        return c10 == -1 ? new u2.h0(obj, j11, l1Var.b(j10)) : new u2.h0(c10, l1Var.e(c10), -1, j11, obj);
    }

    public final w0 a() {
        w0 w0Var = this.i;
        if (w0Var == null) {
            return null;
        }
        if (w0Var == this.j) {
            this.j = w0Var.m;
        }
        if (w0Var == this.k) {
            this.k = w0Var.m;
        }
        w0Var.i();
        int i10 = this.n - 1;
        this.n = i10;
        if (i10 == 0) {
            this.l = null;
            w0 w0Var2 = this.i;
            this.o = w0Var2.b;
            this.p = w0Var2.g.a.d;
        }
        this.i = this.i.m;
        l();
        return this.i;
    }

    public final void b() {
        if (this.n == 0) {
            return;
        }
        w0 w0Var = this.i;
        w0Var.getClass();
        this.o = w0Var.b;
        this.p = w0Var.g.a.d;
        while (w0Var != null) {
            w0Var.i();
            w0Var = w0Var.m;
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
    public final x0 c(b2.o1 o1Var, w0 w0Var, long j10) {
        b2.o1 o1Var2;
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
        long q6;
        x0 x0Var = w0Var.g;
        long j22 = (w0Var.p + x0Var.f) - j10;
        if (x0Var.i) {
            x0 x0Var2 = w0Var.g;
            u2.h0 h0Var = x0Var2.a;
            long j23 = x0Var2.d;
            int d = o1Var.d(o1Var.b(h0Var.a), this.a, this.b, this.g, this.h);
            if (d != -1) {
                b2.l1 l1Var = this.a;
                int i10 = o1Var.f(d, l1Var, true).c;
                Object obj2 = l1Var.b;
                obj2.getClass();
                long j24 = h0Var.d;
                b2.n1 n1Var = this.b;
                if (o1Var.m(i10, n1Var, 0L).n == d) {
                    int i11 = l1Var.c;
                    if (l1Var.d == -9223372036854775807L) {
                        o1Var.n(i11, n1Var);
                        if (n1Var.i && !n1Var.k) {
                            j20 = Math.max(0L, j22);
                            j21 = o1Var.j(this.b, this.a, i10, -9223372036854775807L, j20);
                            if (j21 != null) {
                                Object obj3 = j21.first;
                                long longValue = ((Long) j21.second).longValue();
                                w0 w0Var2 = w0Var.m;
                                if (w0Var2 == null || !w0Var2.b.equals(obj3)) {
                                    q6 = q(obj3);
                                    if (q6 == -1) {
                                        q6 = this.f;
                                        this.f = 1 + q6;
                                    }
                                } else {
                                    q6 = w0Var2.g.a.d;
                                }
                                obj = obj3;
                                j16 = longValue;
                                j19 = q6;
                                j18 = j20;
                                j17 = -9223372036854775807L;
                            }
                        }
                    }
                    j20 = -9223372036854775807L;
                    j21 = o1Var.j(this.b, this.a, i10, -9223372036854775807L, j20);
                    if (j21 != null) {
                    }
                } else {
                    obj = obj2;
                    j16 = 0;
                    j17 = 0;
                    j18 = -9223372036854775807L;
                    j19 = j24;
                }
                u2.h0 o10 = o(o1Var, obj, j16, j19, this.b, this.a);
                if (j17 != -9223372036854775807L && j23 != -9223372036854775807L) {
                    int i12 = o1Var.g(h0Var.a, l1Var).g.a;
                    l1Var.g.getClass();
                    if (i12 > 0) {
                        l1Var.g(0);
                    }
                }
                return d(o1Var, o10, j17, j16, j18);
            }
            return null;
        }
        u2.h0 h0Var2 = x0Var.a;
        Object obj4 = h0Var2.a;
        int i13 = h0Var2.e;
        b2.l1 l1Var2 = this.a;
        o1Var.g(obj4, l1Var2);
        boolean z10 = x0Var.h;
        if (!h0Var2.b()) {
            if (i13 != -1) {
                l1Var2.f(i13);
            }
            int e = l1Var2.e(i13);
            l1Var2.g(i13);
            if (e != l1Var2.g.a(i13).a) {
                return e(o1Var, h0Var2.a, h0Var2.e, e, x0Var.f, h0Var2.d, z10);
            }
            o1Var.g(obj4, l1Var2);
            l1Var2.d(i13);
            l1Var2.g.a(i13).getClass();
            return f(o1Var, h0Var2.a, 0L, -9223372036854775807L, x0Var.f, h0Var2.d, false);
        }
        int i14 = h0Var2.b;
        int i15 = l1Var2.g.a(i14).a;
        if (i15 == -1) {
            return null;
        }
        int a2 = l1Var2.g.a(i14).a(h0Var2.c);
        if (a2 < i15) {
            return e(o1Var, h0Var2.a, i14, a2, x0Var.d, h0Var2.d, z10);
        }
        long j25 = x0Var.d;
        if (j25 == -9223372036854775807L) {
            int i16 = l1Var2.c;
            if (l1Var2.d == -9223372036854775807L) {
                b2.n1 n1Var2 = this.b;
                o1Var.n(i16, n1Var2);
                if (n1Var2.i && !n1Var2.k) {
                    j14 = Math.max(0L, j22);
                    j11 = 0;
                    o1Var2 = o1Var;
                    j15 = o1Var2.j(this.b, l1Var2, l1Var2.c, -9223372036854775807L, j14);
                    if (j15 != null) {
                        return null;
                    }
                    j13 = ((Long) j15.second).longValue();
                    j12 = j14;
                }
            }
            j14 = -9223372036854775807L;
            j11 = 0;
            o1Var2 = o1Var;
            j15 = o1Var2.j(this.b, l1Var2, l1Var2.c, -9223372036854775807L, j14);
            if (j15 != null) {
            }
        } else {
            o1Var2 = o1Var;
            j11 = 0;
            j12 = -9223372036854775807L;
            j13 = j25;
        }
        int i17 = h0Var2.b;
        o1Var2.g(obj4, l1Var2);
        l1Var2.d(i17);
        l1Var2.g.a(i17).getClass();
        return f(o1Var2, h0Var2.a, Math.max(j11, j13), j12, x0Var.d, h0Var2.d, z10);
    }

    public final x0 d(b2.o1 o1Var, u2.h0 h0Var, long j10, long j11, long j12) {
        o1Var.g(h0Var.a, this.a);
        return h0Var.b() ? e(o1Var, h0Var.a, h0Var.b, h0Var.c, j10, h0Var.d, false) : f(o1Var, h0Var.a, j11, j12, j10, h0Var.d, false);
    }

    public final x0 e(b2.o1 o1Var, Object obj, int i10, int i11, long j10, long j11, boolean z10) {
        u2.h0 h0Var = new u2.h0(i10, i11, -1, j11, obj);
        b2.l1 l1Var = this.a;
        long a2 = o1Var.g(obj, l1Var).a(i10, i11);
        if (i11 == l1Var.e(i10)) {
            l1Var.g.getClass();
        }
        l1Var.g(i10);
        long j12 = 0;
        if (a2 != -9223372036854775807L && 0 >= a2) {
            j12 = Math.max(0L, a2 - 1);
        }
        return new x0(h0Var, j12, -9223372036854775807L, j10, -9223372036854775807L, a2, z10, false, false, false, false);
    }

    public final x0 f(b2.o1 o1Var, Object obj, long j10, long j11, long j12, long j13, boolean z10) {
        long j14;
        b2.l1 l1Var = this.a;
        o1Var.g(obj, l1Var);
        int b10 = l1Var.b(j10);
        boolean z11 = false;
        if (b10 != -1) {
            l1Var.g(b10);
        } else if (l1Var.g.a > 0) {
            l1Var.g(0);
        }
        u2.h0 h0Var = new u2.h0(obj, j13, b10);
        if (!h0Var.b() && b10 == -1) {
            z11 = true;
        }
        boolean j15 = j(o1Var, h0Var);
        boolean i10 = i(o1Var, h0Var, z11);
        if (b10 != -1) {
            l1Var.g(b10);
        }
        if (b10 != -1) {
            l1Var.f(b10);
        }
        if (b10 != -1) {
            l1Var.d(b10);
            j14 = 0;
        } else {
            j14 = -9223372036854775807L;
        }
        long j16 = (j14 == -9223372036854775807L || j14 == Long.MIN_VALUE) ? l1Var.d : j14;
        return new x0(h0Var, (j16 == -9223372036854775807L || j10 < j16) ? j10 : Math.max(0L, j16 - 1), j11, j12, j14, j16, z10, false, z11, j15, i10);
    }

    public final w0 g() {
        return this.k;
    }

    public final x0 h(b2.o1 o1Var, x0 x0Var) {
        long j10;
        u2.h0 h0Var = x0Var.a;
        boolean b10 = h0Var.b();
        int i10 = h0Var.e;
        boolean z10 = !b10 && i10 == -1;
        int i11 = h0Var.b;
        boolean j11 = j(o1Var, h0Var);
        boolean i12 = i(o1Var, h0Var, z10);
        Object obj = h0Var.a;
        b2.l1 l1Var = this.a;
        o1Var.g(obj, l1Var);
        if (h0Var.b() || i10 == -1) {
            j10 = -9223372036854775807L;
        } else {
            l1Var.d(i10);
            j10 = 0;
        }
        long a2 = h0Var.b() ? l1Var.a(i11, h0Var.c) : (j10 == -9223372036854775807L || j10 == Long.MIN_VALUE) ? l1Var.d : j10;
        if (h0Var.b()) {
            l1Var.g(i11);
        } else if (i10 != -1) {
            l1Var.g(i10);
        }
        return new x0(h0Var, x0Var.b, x0Var.c, x0Var.d, j10, a2, x0Var.g, false, z10, j11, i12);
    }

    public final boolean i(b2.o1 o1Var, u2.h0 h0Var, boolean z10) {
        int b10 = o1Var.b(h0Var.a);
        if (!o1Var.m(o1Var.f(b10, this.a, false).c, this.b, 0L).i) {
            if (o1Var.d(b10, this.a, this.b, this.g, this.h) == -1 && z10) {
                return true;
            }
        }
        return false;
    }

    public final boolean j(b2.o1 o1Var, u2.h0 h0Var) {
        boolean z10 = !h0Var.b() && h0Var.e == -1;
        Object obj = h0Var.a;
        if (z10) {
            if (o1Var.m(o1Var.g(obj, this.a).c, this.b, 0L).o == o1Var.b(obj)) {
                return true;
            }
        }
        return false;
    }

    public final void k() {
        w0 w0Var = this.m;
        if (w0Var == null || w0Var.h()) {
            this.m = null;
            for (int i10 = 0; i10 < this.q.size(); i10++) {
                w0 w0Var2 = (w0) this.q.get(i10);
                if (!w0Var2.h()) {
                    this.m = w0Var2;
                    return;
                }
            }
        }
    }

    public final void l() {
        e9.k0 t10 = e9.n0.t();
        for (w0 w0Var = this.i; w0Var != null; w0Var = w0Var.m) {
            t10.c(w0Var.g.a);
        }
        w0 w0Var2 = this.j;
        this.d.d(new z1(this, t10, w0Var2 == null ? null : w0Var2.g.a, 20));
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, u2.h1] */
    public final void m(long j10) {
        w0 w0Var = this.l;
        if (w0Var != null) {
            u6.p(w0Var.m == null);
            if (w0Var.e) {
                w0Var.a.u(j10 - w0Var.p);
            }
        }
    }

    public final int n(w0 w0Var) {
        w0Var.getClass();
        int i10 = 0;
        if (w0Var.equals(this.l)) {
            return 0;
        }
        this.l = w0Var;
        while (true) {
            w0Var = w0Var.m;
            if (w0Var == null) {
                break;
            }
            if (w0Var == this.j) {
                w0 w0Var2 = this.i;
                this.j = w0Var2;
                this.k = w0Var2;
                i10 = 3;
            }
            if (w0Var == this.k) {
                this.k = this.j;
                i10 |= 2;
            }
            w0Var.i();
            this.n--;
        }
        w0 w0Var3 = this.l;
        w0Var3.getClass();
        if (w0Var3.m != null) {
            w0Var3.b();
            w0Var3.m = null;
            w0Var3.c();
        }
        l();
        return i10;
    }

    public final u2.h0 p(b2.o1 o1Var, Object obj, long j10) {
        long q6;
        int b10;
        Object obj2 = obj;
        b2.l1 l1Var = this.a;
        int i10 = o1Var.g(obj2, l1Var).c;
        Object obj3 = this.o;
        if (obj3 == null || (b10 = o1Var.b(obj3)) == -1 || o1Var.f(b10, l1Var, false).c != i10) {
            w0 w0Var = this.i;
            while (true) {
                if (w0Var == null) {
                    w0 w0Var2 = this.i;
                    while (true) {
                        if (w0Var2 != null) {
                            int b11 = o1Var.b(w0Var2.b);
                            if (b11 != -1 && o1Var.f(b11, l1Var, false).c == i10) {
                                q6 = w0Var2.g.a.d;
                                break;
                            }
                            w0Var2 = w0Var2.m;
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
                    if (w0Var.b.equals(obj2)) {
                        q6 = w0Var.g.a.d;
                        break;
                    }
                    w0Var = w0Var.m;
                }
            }
        } else {
            q6 = this.p;
        }
        o1Var.g(obj2, l1Var);
        int i11 = l1Var.c;
        b2.n1 n1Var = this.b;
        o1Var.n(i11, n1Var);
        boolean z10 = false;
        for (int b12 = o1Var.b(obj); b12 >= n1Var.n; b12--) {
            o1Var.f(b12, l1Var, true);
            boolean z11 = l1Var.g.a > 0;
            z10 |= z11;
            if (l1Var.c(l1Var.d) != -1) {
                obj2 = l1Var.b;
                obj2.getClass();
            }
            if (z10 && (!z11 || l1Var.d != 0)) {
                break;
            }
        }
        return o(o1Var, obj2, j10, q6, this.b, this.a);
    }

    public final long q(Object obj) {
        for (int i10 = 0; i10 < this.q.size(); i10++) {
            w0 w0Var = (w0) this.q.get(i10);
            if (w0Var.b.equals(obj)) {
                return w0Var.g.a.d;
            }
        }
        return -1L;
    }

    public final int r(b2.o1 o1Var) {
        b2.o1 o1Var2;
        w0 w0Var;
        w0 w0Var2 = this.i;
        if (w0Var2 == null) {
            return 0;
        }
        int b10 = o1Var.b(w0Var2.b);
        while (true) {
            o1Var2 = o1Var;
            b10 = o1Var2.d(b10, this.a, this.b, this.g, this.h);
            while (true) {
                w0Var2.getClass();
                w0Var = w0Var2.m;
                if (w0Var == null || w0Var2.g.i) {
                    break;
                }
                w0Var2 = w0Var;
            }
            if (b10 == -1 || w0Var == null || o1Var2.b(w0Var.b) != b10) {
                break;
            }
            w0Var2 = w0Var;
            o1Var = o1Var2;
        }
        int n10 = n(w0Var2);
        w0Var2.g = h(o1Var2, w0Var2.g);
        return n10;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d9 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int s(b2.o1 o1Var, long j10, long j11, long j12) {
        long j13;
        int i10;
        x0 b10;
        int i11;
        w0 w0Var = this.i;
        w0 w0Var2 = null;
        while (w0Var != null) {
            x0 x0Var = w0Var.g;
            if (w0Var2 != null) {
                x0 c10 = c(o1Var, w0Var2, j10);
                if (c10 != null) {
                    long j14 = c10.b;
                    u2.h0 h0Var = x0Var.a;
                    long j15 = x0Var.c;
                    j13 = -9223372036854775807L;
                    long j16 = x0Var.b;
                    i10 = 0;
                    if (h0Var.equals(c10.a)) {
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
                return n(w0Var2);
            }
            b10 = h(o1Var, x0Var);
            j13 = -9223372036854775807L;
            i10 = 0;
            long j18 = b10.f;
            long j19 = x0Var.d;
            long j20 = x0Var.f;
            w0Var.g = b10.a(j19);
            if (j20 != j18) {
                w0Var.k();
                long j21 = j18 == j13 ? Long.MAX_VALUE : j18 + w0Var.p;
                int i12 = 1;
                int i13 = (w0Var != this.j || w0Var.g.h || (j11 != Long.MIN_VALUE && j11 < j21)) ? i10 : 1;
                int i14 = (w0Var != this.k || (j12 != Long.MIN_VALUE && j12 < j21)) ? i10 : 1;
                int n10 = n(w0Var);
                if (n10 != 0) {
                    return n10;
                }
                if (j20 == j13 && x0Var.e == Long.MIN_VALUE) {
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
                w0Var2 = w0Var;
                w0Var = w0Var.m;
            }
        }
        return 0;
    }
}
