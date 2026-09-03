package j3;

import android.util.Pair;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class h1 {
    public final m2 a = new m2();
    public final n2 b = new n2();
    public final k3.f c;
    public final h5.a0 d;
    public long e;
    public int f;
    public boolean g;
    public f1 h;
    public f1 i;
    public f1 j;
    public int k;
    public Object l;
    public long m;

    public h1(k3.f fVar, h5.a0 a0Var) {
        this.c = fVar;
        this.d = a0Var;
    }

    public static o4.v m(o2 o2Var, Object obj, long j10, long j11, n2 n2Var, m2 m2Var) {
        o2Var.g(obj, m2Var);
        o2Var.n(m2Var.c, n2Var);
        int b10 = o2Var.b(obj);
        Object obj2 = obj;
        while (true) {
            int i10 = m2Var.h.a;
            if (i10 == 0) {
                break;
            }
            if ((i10 == 1 && m2Var.g(0)) || !m2Var.h(m2Var.h.d)) {
                break;
            }
            long j12 = 0;
            if (m2Var.c(0L) != -1) {
                break;
            }
            if (m2Var.d != 0) {
                int i11 = i10 - (m2Var.g(i10 + (-1)) ? 2 : 1);
                for (int i12 = 0; i12 <= i11; i12++) {
                    j12 += m2Var.h.a(i12).h;
                }
                if (m2Var.d > j12) {
                    break;
                }
            }
            if (b10 > n2Var.C) {
                break;
            }
            o2Var.f(b10, m2Var, true);
            obj2 = m2Var.b;
            obj2.getClass();
            b10++;
        }
        o2Var.g(obj2, m2Var);
        int c3 = m2Var.c(j10);
        return c3 == -1 ? new o4.v(obj2, j11, m2Var.b(j10)) : new o4.v(c3, m2Var.f(c3), -1, j11, obj2);
    }

    public final f1 a() {
        f1 f1Var = this.h;
        if (f1Var == null) {
            return null;
        }
        if (f1Var == this.i) {
            this.i = f1Var.l;
        }
        f1Var.f();
        int i10 = this.k - 1;
        this.k = i10;
        if (i10 == 0) {
            this.j = null;
            f1 f1Var2 = this.h;
            this.l = f1Var2.b;
            this.m = f1Var2.f.a.d;
        }
        this.h = this.h.l;
        k();
        return this.h;
    }

    public final void b() {
        if (this.k == 0) {
            return;
        }
        f1 f1Var = this.h;
        h5.a.j(f1Var);
        this.l = f1Var.b;
        this.m = f1Var.f.a.d;
        while (f1Var != null) {
            f1Var.f();
            f1Var = f1Var.l;
        }
        this.h = null;
        this.j = null;
        this.i = null;
        this.k = 0;
        k();
    }

    public final g1 c(o2 o2Var, f1 f1Var, long j10) {
        Object obj;
        long j11;
        long j12;
        long j13;
        g1 g1Var = f1Var.f;
        o4.v vVar = g1Var.a;
        long j14 = g1Var.c;
        int d = o2Var.d(o2Var.b(vVar.a), this.a, this.b, this.f, this.g);
        if (d == -1) {
            return null;
        }
        m2 m2Var = this.a;
        int i10 = o2Var.f(d, m2Var, true).c;
        Object obj2 = m2Var.b;
        obj2.getClass();
        long j15 = vVar.d;
        long j16 = 0;
        if (o2Var.m(i10, this.b, 0L).B == d) {
            Pair j17 = o2Var.j(this.b, this.a, i10, -9223372036854775807L, Math.max(0L, j10));
            if (j17 == null) {
                return null;
            }
            Object obj3 = j17.first;
            long longValue = ((Long) j17.second).longValue();
            f1 f1Var2 = f1Var.l;
            if (f1Var2 == null || !f1Var2.b.equals(obj3)) {
                j15 = this.e;
                this.e = 1 + j15;
            } else {
                j15 = f1Var2.f.a.d;
            }
            obj = obj3;
            j11 = longValue;
            j16 = -9223372036854775807L;
        } else {
            obj = obj2;
            j11 = 0;
        }
        o4.v m9 = m(o2Var, obj, j11, j15, this.b, this.a);
        if (j16 != -9223372036854775807L && j14 != -9223372036854775807L) {
            int i11 = o2Var.g(vVar.a, m2Var).h.a;
            int i12 = m2Var.h.d;
            boolean z4 = i11 > 0 && m2Var.h(i12) && (i11 > 1 || m2Var.d(i12) != Long.MIN_VALUE);
            if (m9.a() && z4) {
                j12 = j11;
                j13 = j14;
                return e(o2Var, m9, j13, j12);
            }
            if (z4) {
                j12 = j14;
                j13 = j16;
                return e(o2Var, m9, j13, j12);
            }
        }
        j12 = j11;
        j13 = j16;
        return e(o2Var, m9, j13, j12);
    }

    public final g1 d(o2 o2Var, f1 f1Var, long j10) {
        m2 m2Var;
        o2 o2Var2;
        g1 g1Var = f1Var.f;
        long j11 = (f1Var.o + g1Var.e) - j10;
        if (g1Var.g) {
            return c(o2Var, f1Var, j11);
        }
        o4.v vVar = g1Var.a;
        Object obj = vVar.a;
        int i10 = vVar.e;
        m2 m2Var2 = this.a;
        o2Var.g(obj, m2Var2);
        if (!vVar.a()) {
            if (i10 != -1 && m2Var2.g(i10)) {
                return c(o2Var, f1Var, j11);
            }
            int f10 = m2Var2.f(i10);
            boolean z4 = m2Var2.h(i10) && m2Var2.e(i10, f10) == 3;
            if (f10 != m2Var2.h.a(i10).b && !z4) {
                return f(o2Var, vVar.a, vVar.e, f10, g1Var.e, vVar.d);
            }
            o2Var.g(obj, m2Var2);
            long d = m2Var2.d(i10);
            return g(o2Var, vVar.a, d == Long.MIN_VALUE ? m2Var2.d : m2Var2.h.a(i10).h + d, g1Var.e, vVar.d);
        }
        int i11 = vVar.b;
        int i12 = m2Var2.h.a(i11).b;
        if (i12 == -1) {
            return null;
        }
        int a2 = m2Var2.h.a(i11).a(vVar.c);
        if (a2 < i12) {
            return f(o2Var, vVar.a, i11, a2, g1Var.c, vVar.d);
        }
        long j12 = g1Var.c;
        if (j12 == -9223372036854775807L) {
            Pair j13 = o2Var.j(this.b, m2Var2, m2Var2.c, -9223372036854775807L, Math.max(0L, j11));
            m2Var = m2Var2;
            o2Var2 = o2Var;
            if (j13 == null) {
                return null;
            }
            j12 = ((Long) j13.second).longValue();
        } else {
            m2Var = m2Var2;
            o2Var2 = o2Var;
        }
        int i13 = vVar.b;
        o2Var2.g(obj, m2Var);
        long d10 = m2Var.d(i13);
        return g(o2Var, vVar.a, Math.max(d10 == Long.MIN_VALUE ? m2Var.d : m2Var.h.a(i13).h + d10, j12), g1Var.c, vVar.d);
    }

    public final g1 e(o2 o2Var, o4.v vVar, long j10, long j11) {
        o2Var.g(vVar.a, this.a);
        return vVar.a() ? f(o2Var, vVar.a, vVar.b, vVar.c, j10, vVar.d) : g(o2Var, vVar.a, j11, j10, vVar.d);
    }

    public final g1 f(o2 o2Var, Object obj, int i10, int i11, long j10, long j11) {
        o4.v vVar = new o4.v(i10, i11, -1, j11, obj);
        m2 m2Var = this.a;
        long a2 = o2Var.g(obj, m2Var).a(i10, i11);
        long j12 = i11 == m2Var.f(i10) ? m2Var.h.b : 0L;
        boolean h = m2Var.h(i10);
        if (a2 != -9223372036854775807L && j12 >= a2) {
            j12 = Math.max(0L, a2 - 1);
        }
        return new g1(vVar, j12, j10, -9223372036854775807L, a2, h, false, false, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002d, code lost:
    
        if (r5.h(r11.d) != false) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final g1 g(o2 o2Var, Object obj, long j10, long j11, long j12) {
        p4.a a2;
        int i10;
        boolean z4;
        long j13;
        long j14;
        long j15;
        long j16 = j10;
        m2 m2Var = this.a;
        o2Var.g(obj, m2Var);
        int b10 = m2Var.b(j16);
        boolean z10 = b10 != -1 && m2Var.g(b10);
        if (b10 == -1) {
            p4.b bVar = m2Var.h;
            if (bVar.a > 0) {
            }
            z4 = false;
            break;
        }
        if (m2Var.h(b10) && m2Var.d(b10) == m2Var.d && (i10 = (a2 = m2Var.h.a(b10)).b) != -1) {
            for (int i11 = 0; i11 < i10; i11++) {
                int i12 = a2.e[i11];
                if (i12 != 0 && i12 != 1) {
                }
            }
            b10 = -1;
            z4 = true;
        }
        z4 = false;
        break;
        o4.v vVar = new o4.v(obj, j12, b10);
        boolean z11 = !vVar.a() && b10 == -1;
        boolean j17 = j(o2Var, vVar);
        boolean i13 = i(o2Var, vVar, z11);
        boolean z12 = (b10 == -1 || !m2Var.h(b10) || z10) ? false : true;
        if (b10 == -1 || z10) {
            if (!z4) {
                j13 = -9223372036854775807L;
                j15 = (j13 != -9223372036854775807L || j13 == Long.MIN_VALUE) ? m2Var.d : j13;
                if (j15 != -9223372036854775807L && j16 >= j15) {
                    j16 = Math.max(0L, j15 - ((i13 && z4) ? 0 : 1));
                }
                return new g1(vVar, j16, j11, j13, j15, z12, z11, j17, i13);
            }
            j14 = m2Var.d;
        } else {
            j14 = m2Var.d(b10);
        }
        j13 = j14;
        if (j13 != -9223372036854775807L) {
        }
        if (j15 != -9223372036854775807L) {
            j16 = Math.max(0L, j15 - ((i13 && z4) ? 0 : 1));
        }
        return new g1(vVar, j16, j11, j13, j15, z12, z11, j17, i13);
    }

    public final g1 h(o2 o2Var, g1 g1Var) {
        o4.v vVar = g1Var.a;
        boolean a2 = vVar.a();
        int i10 = vVar.e;
        boolean z4 = !a2 && i10 == -1;
        int i11 = vVar.b;
        boolean j10 = j(o2Var, vVar);
        boolean i12 = i(o2Var, vVar, z4);
        Object obj = vVar.a;
        m2 m2Var = this.a;
        o2Var.g(obj, m2Var);
        long d = (vVar.a() || i10 == -1) ? -9223372036854775807L : m2Var.d(i10);
        return new g1(vVar, g1Var.b, g1Var.c, d, vVar.a() ? m2Var.a(i11, vVar.c) : (d == -9223372036854775807L || d == Long.MIN_VALUE) ? m2Var.d : d, vVar.a() ? m2Var.h(i11) : i10 != -1 && m2Var.h(i10), z4, j10, i12);
    }

    public final boolean i(o2 o2Var, o4.v vVar, boolean z4) {
        int b10 = o2Var.b(vVar.a);
        if (!o2Var.m(o2Var.f(b10, this.a, false).c, this.b, 0L).r) {
            if (o2Var.d(b10, this.a, this.b, this.f, this.g) == -1 && z4) {
                return true;
            }
        }
        return false;
    }

    public final boolean j(o2 o2Var, o4.v vVar) {
        boolean z4 = !vVar.a() && vVar.e == -1;
        Object obj = vVar.a;
        if (z4) {
            if (o2Var.m(o2Var.g(obj, this.a).c, this.b, 0L).C == o2Var.b(obj)) {
                return true;
            }
        }
        return false;
    }

    public final void k() {
        s8.t tVar = s8.v.b;
        s8.s sVar = new s8.s();
        for (f1 f1Var = this.h; f1Var != null; f1Var = f1Var.l) {
            sVar.b(f1Var.f.a);
        }
        f1 f1Var2 = this.i;
        this.d.c(new androidx.car.app.utils.b(this, sVar, f1Var2 == null ? null : f1Var2.f.a, 12));
    }

    public final boolean l(f1 f1Var) {
        boolean z4 = false;
        h5.a.i(f1Var != null);
        if (f1Var.equals(this.j)) {
            return false;
        }
        this.j = f1Var;
        while (true) {
            f1Var = f1Var.l;
            if (f1Var == null) {
                break;
            }
            if (f1Var == this.i) {
                this.i = this.h;
                z4 = true;
            }
            f1Var.f();
            this.k--;
        }
        f1 f1Var2 = this.j;
        if (f1Var2.l != null) {
            f1Var2.b();
            f1Var2.l = null;
            f1Var2.c();
        }
        k();
        return z4;
    }

    public final o4.v n(o2 o2Var, Object obj, long j10) {
        long j11;
        int b10;
        Object obj2 = obj;
        m2 m2Var = this.a;
        int i10 = o2Var.g(obj2, m2Var).c;
        Object obj3 = this.l;
        if (obj3 == null || (b10 = o2Var.b(obj3)) == -1 || o2Var.f(b10, m2Var, false).c != i10) {
            f1 f1Var = this.h;
            while (true) {
                if (f1Var == null) {
                    f1 f1Var2 = this.h;
                    while (true) {
                        if (f1Var2 != null) {
                            int b11 = o2Var.b(f1Var2.b);
                            if (b11 != -1 && o2Var.f(b11, m2Var, false).c == i10) {
                                j11 = f1Var2.f.a.d;
                                break;
                            }
                            f1Var2 = f1Var2.l;
                        } else {
                            j11 = this.e;
                            this.e = 1 + j11;
                            if (this.h == null) {
                                this.l = obj2;
                                this.m = j11;
                            }
                        }
                    }
                } else {
                    if (f1Var.b.equals(obj2)) {
                        j11 = f1Var.f.a.d;
                        break;
                    }
                    f1Var = f1Var.l;
                }
            }
        } else {
            j11 = this.m;
        }
        o2Var.g(obj2, m2Var);
        int i11 = m2Var.c;
        n2 n2Var = this.b;
        o2Var.n(i11, n2Var);
        boolean z4 = false;
        for (int b12 = o2Var.b(obj); b12 >= n2Var.B; b12--) {
            o2Var.f(b12, m2Var, true);
            boolean z10 = m2Var.h.a > 0;
            z4 |= z10;
            if (m2Var.c(m2Var.d) != -1) {
                obj2 = m2Var.b;
                obj2.getClass();
            }
            if (z4 && (!z10 || m2Var.d != 0)) {
                break;
            }
        }
        return m(o2Var, obj2, j10, j11, this.b, this.a);
    }

    public final boolean o(o2 o2Var) {
        o2 o2Var2;
        f1 f1Var;
        f1 f1Var2 = this.h;
        if (f1Var2 == null) {
            return true;
        }
        int b10 = o2Var.b(f1Var2.b);
        while (true) {
            o2Var2 = o2Var;
            b10 = o2Var2.d(b10, this.a, this.b, this.f, this.g);
            while (true) {
                f1Var = f1Var2.l;
                if (f1Var == null || f1Var2.f.g) {
                    break;
                }
                f1Var2 = f1Var;
            }
            if (b10 == -1 || f1Var == null || o2Var2.b(f1Var.b) != b10) {
                break;
            }
            f1Var2 = f1Var;
            o2Var = o2Var2;
        }
        boolean l10 = l(f1Var2);
        f1Var2.f = h(o2Var2, f1Var2.f);
        return !l10;
    }

    public final boolean p(o2 o2Var, long j10) {
        boolean l10;
        g1 g1Var;
        f1 f1Var = null;
        for (f1 f1Var2 = this.h; f1Var2 != null; f1Var2 = f1Var2.l) {
            g1 g1Var2 = f1Var2.f;
            if (f1Var != null) {
                g1 d = d(o2Var, f1Var, j10);
                if (d == null) {
                    l10 = l(f1Var);
                } else if (g1Var2.b == d.b && g1Var2.a.equals(d.a)) {
                    g1Var = d;
                } else {
                    l10 = l(f1Var);
                }
                return !l10;
            }
            g1Var = h(o2Var, g1Var2);
            f1Var2.f = g1Var.a(g1Var2.c);
            f1Var = f1Var2;
        }
        return true;
    }
}
