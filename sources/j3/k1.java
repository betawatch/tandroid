package j3;

import android.util.Pair;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class k1 {
    public final p2 a = new p2();
    public final q2 b = new q2();
    public final k3.f c;
    public final f5.a0 d;
    public long e;
    public int f;
    public boolean g;
    public i1 h;
    public i1 i;
    public i1 j;
    public int k;
    public Object l;
    public long m;

    public k1(k3.f fVar, f5.a0 a0Var) {
        this.c = fVar;
        this.d = a0Var;
    }

    public static l4.c0 l(r2 r2Var, Object obj, long j10, long j11, q2 q2Var, p2 p2Var) {
        r2Var.g(obj, p2Var);
        r2Var.n(p2Var.c, q2Var);
        int b10 = r2Var.b(obj);
        while (p2Var.d == 0) {
            m4.c cVar = p2Var.h;
            if (cVar.a <= 0 || !p2Var.g(cVar.d) || p2Var.c(0L) != -1) {
                break;
            }
            int i10 = b10 + 1;
            if (b10 >= q2Var.B) {
                break;
            }
            r2Var.f(i10, p2Var, true);
            obj = p2Var.b;
            obj.getClass();
            b10 = i10;
        }
        r2Var.g(obj, p2Var);
        Object obj2 = obj;
        int c3 = p2Var.c(j10);
        return c3 == -1 ? new l4.c0(obj2, j11, p2Var.b(j10)) : new l4.c0(c3, p2Var.f(c3), -1, j11, obj2);
    }

    public final i1 a() {
        i1 i1Var = this.h;
        if (i1Var == null) {
            return null;
        }
        if (i1Var == this.i) {
            this.i = i1Var.l;
        }
        i1Var.f();
        int i10 = this.k - 1;
        this.k = i10;
        if (i10 == 0) {
            this.j = null;
            i1 i1Var2 = this.h;
            this.l = i1Var2.b;
            this.m = i1Var2.f.a.d;
        }
        this.h = this.h.l;
        j();
        return this.h;
    }

    public final void b() {
        if (this.k == 0) {
            return;
        }
        i1 i1Var = this.h;
        f5.a.j(i1Var);
        this.l = i1Var.b;
        this.m = i1Var.f.a.d;
        while (i1Var != null) {
            i1Var.f();
            i1Var = i1Var.l;
        }
        this.h = null;
        this.j = null;
        this.i = null;
        this.k = 0;
        j();
    }

    public final j1 c(r2 r2Var, i1 i1Var, long j10) {
        r2 r2Var2;
        long j11;
        Object obj;
        long j12;
        long j13;
        long j14;
        long j15;
        j1 j1Var = i1Var.f;
        long j16 = i1Var.o;
        long j17 = j1Var.e;
        long j18 = j1Var.c;
        l4.c0 c0Var = j1Var.a;
        long j19 = (j16 + j17) - j10;
        boolean z10 = j1Var.g;
        p2 p2Var = this.a;
        if (!z10) {
            Object obj2 = c0Var.a;
            int i10 = c0Var.e;
            r2Var.g(obj2, p2Var);
            if (!c0Var.a()) {
                int f9 = p2Var.f(i10);
                boolean z11 = p2Var.g(i10) && p2Var.e(i10, f9) == 3;
                if (f9 != p2Var.h.a(i10).b && !z11) {
                    return e(r2Var, c0Var.a, c0Var.e, f9, j1Var.e, c0Var.d);
                }
                r2Var.g(obj2, p2Var);
                long d = p2Var.d(i10);
                return f(r2Var, c0Var.a, d == Long.MIN_VALUE ? p2Var.d : d + p2Var.h.a(i10).h, j1Var.e, c0Var.d);
            }
            int i11 = c0Var.b;
            int i12 = p2Var.h.a(i11).b;
            if (i12 == -1) {
                return null;
            }
            int a2 = p2Var.h.a(i11).a(c0Var.c);
            if (a2 < i12) {
                return e(r2Var, c0Var.a, i11, a2, j1Var.c, c0Var.d);
            }
            if (j18 == -9223372036854775807L) {
                r2Var2 = r2Var;
                Pair j20 = r2Var2.j(this.b, p2Var, p2Var.c, -9223372036854775807L, Math.max(0L, j19));
                if (j20 == null) {
                    return null;
                }
                j11 = ((Long) j20.second).longValue();
            } else {
                r2Var2 = r2Var;
                j11 = j18;
            }
            int i13 = c0Var.b;
            r2Var2.g(obj2, p2Var);
            long d10 = p2Var.d(i13);
            return f(r2Var2, c0Var.a, Math.max(d10 == Long.MIN_VALUE ? p2Var.d : d10 + p2Var.h.a(i13).h, j11), j1Var.c, c0Var.d);
        }
        long j21 = 0;
        int d11 = r2Var.d(r2Var.b(c0Var.a), this.a, this.b, this.f, this.g);
        if (d11 == -1) {
            return null;
        }
        int i14 = r2Var.f(d11, p2Var, true).c;
        Object obj3 = p2Var.b;
        obj3.getClass();
        long j22 = c0Var.d;
        if (r2Var.m(i14, this.b, 0L).A == d11) {
            Pair j23 = r2Var.j(this.b, this.a, i14, -9223372036854775807L, Math.max(0L, j19));
            if (j23 == null) {
                return null;
            }
            Object obj4 = j23.first;
            long longValue = ((Long) j23.second).longValue();
            i1 i1Var2 = i1Var.l;
            if (i1Var2 == null || !i1Var2.b.equals(obj4)) {
                j15 = this.e;
                this.e = 1 + j15;
            } else {
                j15 = i1Var2.f.a.d;
            }
            obj = obj4;
            j12 = longValue;
            j22 = j15;
            j21 = -9223372036854775807L;
        } else {
            obj = obj3;
            j12 = 0;
        }
        l4.c0 l10 = l(r2Var, obj, j12, j22, this.b, this.a);
        if (j21 != -9223372036854775807L && j18 != -9223372036854775807L) {
            boolean z12 = r2Var.g(c0Var.a, p2Var).h.a > 0 && p2Var.g(p2Var.h.d);
            if (l10.a() && z12) {
                j13 = j12;
                j14 = j18;
            } else if (z12) {
                j14 = j21;
                j13 = j18;
            }
            return d(r2Var, l10, j14, j13);
        }
        j13 = j12;
        j14 = j21;
        return d(r2Var, l10, j14, j13);
    }

    public final j1 d(r2 r2Var, l4.c0 c0Var, long j10, long j11) {
        r2Var.g(c0Var.a, this.a);
        return c0Var.a() ? e(r2Var, c0Var.a, c0Var.b, c0Var.c, j10, c0Var.d) : f(r2Var, c0Var.a, j11, j10, c0Var.d);
    }

    public final j1 e(r2 r2Var, Object obj, int i10, int i11, long j10, long j11) {
        l4.c0 c0Var = new l4.c0(i10, i11, -1, j11, obj);
        p2 p2Var = this.a;
        long a2 = r2Var.g(obj, p2Var).a(i10, i11);
        long j12 = i11 == p2Var.f(i10) ? p2Var.h.b : 0L;
        boolean g10 = p2Var.g(i10);
        if (a2 != -9223372036854775807L && j12 >= a2) {
            j12 = Math.max(0L, a2 - 1);
        }
        return new j1(c0Var, j12, j10, -9223372036854775807L, a2, g10, false, false, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0021, code lost:
    
        if (r5.g(r10.d) != false) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final j1 f(r2 r2Var, Object obj, long j10, long j11, long j12) {
        m4.b a2;
        int i10;
        boolean z10;
        long j13 = j10;
        p2 p2Var = this.a;
        r2Var.g(obj, p2Var);
        int b10 = p2Var.b(j13);
        if (b10 == -1) {
            m4.c cVar = p2Var.h;
            if (cVar.a > 0) {
            }
            z10 = false;
            break;
        }
        if (p2Var.g(b10) && p2Var.d(b10) == p2Var.d && (i10 = (a2 = p2Var.h.a(b10)).b) != -1) {
            for (int i11 = 0; i11 < i10; i11++) {
                int i12 = a2.e[i11];
                if (i12 != 0 && i12 != 1) {
                }
            }
            b10 = -1;
            z10 = true;
        }
        z10 = false;
        break;
        l4.c0 c0Var = new l4.c0(obj, j12, b10);
        boolean z11 = !c0Var.a() && b10 == -1;
        boolean i13 = i(r2Var, c0Var);
        boolean h = h(r2Var, c0Var, z11);
        boolean z12 = b10 != -1 && p2Var.g(b10);
        long d = b10 != -1 ? p2Var.d(b10) : z10 ? p2Var.d : -9223372036854775807L;
        long j14 = (d == -9223372036854775807L || d == Long.MIN_VALUE) ? p2Var.d : d;
        if (j14 != -9223372036854775807L && j13 >= j14) {
            j13 = Math.max(0L, j14 - ((h || !z10) ? 1 : 0));
        }
        return new j1(c0Var, j13, j11, d, j14, z12, z11, i13, h);
    }

    public final j1 g(r2 r2Var, j1 j1Var) {
        l4.c0 c0Var = j1Var.a;
        boolean a2 = c0Var.a();
        int i10 = c0Var.e;
        boolean z10 = !a2 && i10 == -1;
        int i11 = c0Var.b;
        boolean i12 = i(r2Var, c0Var);
        boolean h = h(r2Var, c0Var, z10);
        Object obj = c0Var.a;
        p2 p2Var = this.a;
        r2Var.g(obj, p2Var);
        long d = (c0Var.a() || i10 == -1) ? -9223372036854775807L : p2Var.d(i10);
        return new j1(c0Var, j1Var.b, j1Var.c, d, c0Var.a() ? p2Var.a(i11, c0Var.c) : (d == -9223372036854775807L || d == Long.MIN_VALUE) ? p2Var.d : d, c0Var.a() ? p2Var.g(i11) : i10 != -1 && p2Var.g(i10), z10, i12, h);
    }

    public final boolean h(r2 r2Var, l4.c0 c0Var, boolean z10) {
        int b10 = r2Var.b(c0Var.a);
        if (!r2Var.m(r2Var.f(b10, this.a, false).c, this.b, 0L).r) {
            if (r2Var.d(b10, this.a, this.b, this.f, this.g) == -1 && z10) {
                return true;
            }
        }
        return false;
    }

    public final boolean i(r2 r2Var, l4.c0 c0Var) {
        boolean z10 = !c0Var.a() && c0Var.e == -1;
        Object obj = c0Var.a;
        if (z10) {
            if (r2Var.m(r2Var.g(obj, this.a).c, this.b, 0L).B == r2Var.b(obj)) {
                return true;
            }
        }
        return false;
    }

    public final void j() {
        q8.x xVar = q8.z.b;
        q8.w wVar = new q8.w();
        for (i1 i1Var = this.h; i1Var != null; i1Var = i1Var.l) {
            wVar.a(i1Var.f.a);
        }
        i1 i1Var2 = this.i;
        this.d.c(new androidx.car.app.utils.b(this, wVar, i1Var2 == null ? null : i1Var2.f.a, 16));
    }

    public final boolean k(i1 i1Var) {
        boolean z10 = false;
        f5.a.i(i1Var != null);
        if (i1Var.equals(this.j)) {
            return false;
        }
        this.j = i1Var;
        while (true) {
            i1Var = i1Var.l;
            if (i1Var == null) {
                break;
            }
            if (i1Var == this.i) {
                this.i = this.h;
                z10 = true;
            }
            i1Var.f();
            this.k--;
        }
        i1 i1Var2 = this.j;
        if (i1Var2.l != null) {
            i1Var2.b();
            i1Var2.l = null;
            i1Var2.c();
        }
        j();
        return z10;
    }

    public final l4.c0 m(r2 r2Var, Object obj, long j10) {
        long j11;
        int b10;
        Object obj2 = obj;
        p2 p2Var = this.a;
        int i10 = r2Var.g(obj2, p2Var).c;
        Object obj3 = this.l;
        if (obj3 == null || (b10 = r2Var.b(obj3)) == -1 || r2Var.f(b10, p2Var, false).c != i10) {
            i1 i1Var = this.h;
            while (true) {
                if (i1Var == null) {
                    i1 i1Var2 = this.h;
                    while (true) {
                        if (i1Var2 != null) {
                            int b11 = r2Var.b(i1Var2.b);
                            if (b11 != -1 && r2Var.f(b11, p2Var, false).c == i10) {
                                j11 = i1Var2.f.a.d;
                                break;
                            }
                            i1Var2 = i1Var2.l;
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
                    if (i1Var.b.equals(obj2)) {
                        j11 = i1Var.f.a.d;
                        break;
                    }
                    i1Var = i1Var.l;
                }
            }
        } else {
            j11 = this.m;
        }
        r2Var.g(obj2, p2Var);
        int i11 = p2Var.c;
        q2 q2Var = this.b;
        r2Var.n(i11, q2Var);
        boolean z10 = false;
        for (int b12 = r2Var.b(obj); b12 >= q2Var.A; b12--) {
            r2Var.f(b12, p2Var, true);
            boolean z11 = p2Var.h.a > 0;
            z10 |= z11;
            if (p2Var.c(p2Var.d) != -1) {
                obj2 = p2Var.b;
                obj2.getClass();
            }
            if (z10 && (!z11 || p2Var.d != 0)) {
                break;
            }
        }
        return l(r2Var, obj2, j10, j11, this.b, this.a);
    }

    public final boolean n(r2 r2Var) {
        r2 r2Var2;
        i1 i1Var;
        i1 i1Var2 = this.h;
        if (i1Var2 == null) {
            return true;
        }
        int b10 = r2Var.b(i1Var2.b);
        while (true) {
            r2Var2 = r2Var;
            b10 = r2Var2.d(b10, this.a, this.b, this.f, this.g);
            while (true) {
                i1Var = i1Var2.l;
                if (i1Var == null || i1Var2.f.g) {
                    break;
                }
                i1Var2 = i1Var;
            }
            if (b10 == -1 || i1Var == null || r2Var2.b(i1Var.b) != b10) {
                break;
            }
            i1Var2 = i1Var;
            r2Var = r2Var2;
        }
        boolean k9 = k(i1Var2);
        i1Var2.f = g(r2Var2, i1Var2.f);
        return !k9;
    }

    public final boolean o(r2 r2Var, long j10) {
        boolean k9;
        j1 j1Var;
        i1 i1Var = null;
        for (i1 i1Var2 = this.h; i1Var2 != null; i1Var2 = i1Var2.l) {
            j1 j1Var2 = i1Var2.f;
            if (i1Var != null) {
                j1 c3 = c(r2Var, i1Var, j10);
                if (c3 == null) {
                    k9 = k(i1Var);
                } else if (j1Var2.b == c3.b && j1Var2.a.equals(c3.a)) {
                    j1Var = c3;
                } else {
                    k9 = k(i1Var);
                }
                return !k9;
            }
            j1Var = g(r2Var, j1Var2);
            i1Var2.f = j1Var.a(j1Var2.c);
            i1Var = i1Var2;
        }
        return true;
    }
}
