package i2;

import v7.u6;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes.dex */
public final class q1 {
    public final b a;
    public final int b;
    public final b c;
    public int d = 0;
    public boolean e = false;
    public boolean f = false;

    public q1(b bVar, b bVar2, int i10) {
        this.a = bVar;
        this.b = i10;
        this.c = bVar2;
    }

    public static void b(b bVar) {
        int i10 = bVar.n;
        if (i10 == 2) {
            u6.p(i10 == 2);
            bVar.n = 1;
            bVar.t();
        }
    }

    public static boolean h(b bVar) {
        return bVar.n != 0;
    }

    public static void l(b bVar, long j10) {
        bVar.y = true;
        if (bVar instanceof w2.e) {
            w2.e eVar = (w2.e) bVar;
            u6.p(eVar.y);
            eVar.a0 = j10;
        }
    }

    public final void a(b bVar, k kVar) {
        u6.p(this.a == bVar || this.c == bVar);
        if (h(bVar)) {
            if (bVar == kVar.c) {
                kVar.d = null;
                kVar.c = null;
                kVar.e = true;
            }
            b(bVar);
            u6.p(bVar.n == 1);
            bVar.c.A();
            bVar.n = 0;
            bVar.r = null;
            bVar.s = null;
            bVar.y = false;
            bVar.n();
            bVar.G = null;
        }
    }

    public final int c() {
        boolean h = h(this.a);
        b bVar = this.c;
        return (h ? 1 : 0) + ((bVar == null || !h(bVar)) ? 0 : 1);
    }

    public final b d(x0 x0Var) {
        u2.d1 d1Var;
        if (x0Var != null && (d1Var = x0Var.c[this.b]) != null) {
            b bVar = this.a;
            if (bVar.r == d1Var) {
                return bVar;
            }
            b bVar2 = this.c;
            if (bVar2 != null && bVar2.r == d1Var) {
                return bVar2;
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0036, code lost:
    
        if (r9.x >= r1.e()) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean e(x0 x0Var, b bVar) {
        if (bVar != null) {
            u2.d1[] d1VarArr = x0Var.c;
            int i10 = this.b;
            u2.d1 d1Var = d1VarArr[i10];
            u2.d1 d1Var2 = bVar.r;
            if (d1Var2 != null) {
                if (d1Var2 == d1Var) {
                    if (d1Var != null && !bVar.k()) {
                        x0 x0Var2 = x0Var.m;
                        if (x0Var.g.h) {
                            if (x0Var2 != null) {
                                if (x0Var2.e) {
                                    if (!(bVar instanceof w2.e)) {
                                        if (!(bVar instanceof s2.b)) {
                                        }
                                    }
                                    return true;
                                }
                            }
                        }
                    }
                }
                x0 x0Var3 = x0Var.m;
                if (x0Var3 == null || x0Var3.c[i10] != bVar.r) {
                    return false;
                }
            }
        }
        return true;
    }

    public final boolean f() {
        int i10 = this.d;
        return i10 == 2 || i10 == 4 || i10 == 3;
    }

    public final boolean g() {
        int i10 = this.d;
        if (i10 == 0 || i10 == 2 || i10 == 4) {
            return h(this.a);
        }
        b bVar = this.c;
        bVar.getClass();
        return bVar.n != 0;
    }

    public final void i(boolean z10) {
        if (z10) {
            if (this.e) {
                b bVar = this.a;
                u6.p(bVar.n == 0);
                bVar.c.A();
                bVar.r();
                this.e = false;
                return;
            }
            return;
        }
        if (this.f) {
            b bVar2 = this.c;
            bVar2.getClass();
            u6.p(bVar2.n == 0);
            bVar2.c.A();
            bVar2.r();
            this.f = false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int j(b bVar, x0 x0Var, x2.t tVar, k kVar) {
        b bVar2;
        int i10;
        if (bVar == null || bVar.n == 0 || (bVar == (bVar2 = this.a) && ((i10 = this.d) == 2 || i10 == 4))) {
            return 1;
        }
        if (bVar == this.c && this.d == 3) {
            return 1;
        }
        u2.d1 d1Var = bVar.r;
        u2.d1[] d1VarArr = x0Var.c;
        int i11 = this.b;
        Object[] objArr = d1Var != d1VarArr[i11];
        boolean b10 = tVar.b(i11);
        if (!b10 || objArr != false) {
            if (!bVar.y) {
                x2.p pVar = tVar.c[i11];
                int length = pVar != null ? pVar.length() : 0;
                b2.w[] wVarArr = new b2.w[length];
                for (int i12 = 0; i12 < length; i12++) {
                    pVar.getClass();
                    wVarArr[i12] = pVar.f(i12);
                }
                u2.d1 d1Var2 = x0Var.c[i11];
                d1Var2.getClass();
                bVar.y(wVarArr, d1Var2, x0Var.e(), x0Var.p, x0Var.g.a);
                return 3;
            }
            if (!bVar.l()) {
                return 0;
            }
            a(bVar, kVar);
            if (!b10 || f()) {
                i(bVar == bVar2);
                return 1;
            }
        }
        return 1;
    }

    public final void k() {
        if (!h(this.a)) {
            i(true);
        }
        b bVar = this.c;
        if (bVar == null || bVar.n != 0) {
            return;
        }
        i(false);
    }

    public final void m() {
        int i10;
        b bVar = this.a;
        int i11 = bVar.n;
        if (i11 == 1 && this.d != 4) {
            u6.p(i11 == 1);
            bVar.n = 2;
            bVar.s();
            return;
        }
        b bVar2 = this.c;
        if (bVar2 == null || (i10 = bVar2.n) != 1 || this.d == 3) {
            return;
        }
        u6.p(i10 == 1);
        bVar2.n = 2;
        bVar2.s();
    }
}
