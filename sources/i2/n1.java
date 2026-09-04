package i2;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public final class n1 {
    public final f a;
    public final int b;
    public final f c;
    public int d = 0;
    public boolean e = false;
    public boolean f = false;

    public n1(f fVar, f fVar2, int i10) {
        this.a = fVar;
        this.b = i10;
        this.c = fVar2;
    }

    public static void b(f fVar) {
        int i10 = fVar.n;
        if (i10 == 2) {
            e2.d.g(i10 == 2);
            fVar.n = 1;
            fVar.t();
        }
    }

    public static boolean h(f fVar) {
        return fVar.n != 0;
    }

    public static void l(f fVar, long j3) {
        fVar.y = true;
        if (fVar instanceof w2.e) {
            w2.e eVar = (w2.e) fVar;
            e2.d.g(eVar.y);
            eVar.a0 = j3;
        }
    }

    public final void a(f fVar, a3.p pVar) {
        e2.d.g(this.a == fVar || this.c == fVar);
        if (h(fVar)) {
            if (fVar == ((f) pVar.e)) {
                pVar.f = null;
                pVar.e = null;
                pVar.a = true;
            }
            b(fVar);
            e2.d.g(fVar.n == 1);
            fVar.c.A();
            fVar.n = 0;
            fVar.r = null;
            fVar.s = null;
            fVar.y = false;
            fVar.n();
            fVar.G = null;
        }
    }

    public final int c() {
        boolean h = h(this.a);
        f fVar = this.c;
        return (h ? 1 : 0) + ((fVar == null || !h(fVar)) ? 0 : 1);
    }

    public final f d(t0 t0Var) {
        u2.b1 b1Var;
        if (t0Var != null && (b1Var = t0Var.c[this.b]) != null) {
            f fVar = this.a;
            if (fVar.r == b1Var) {
                return fVar;
            }
            f fVar2 = this.c;
            if (fVar2 != null && fVar2.r == b1Var) {
                return fVar2;
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
    public final boolean e(t0 t0Var, f fVar) {
        if (fVar != null) {
            u2.b1[] b1VarArr = t0Var.c;
            int i10 = this.b;
            u2.b1 b1Var = b1VarArr[i10];
            u2.b1 b1Var2 = fVar.r;
            if (b1Var2 != null) {
                if (b1Var2 == b1Var) {
                    if (b1Var != null && !fVar.k()) {
                        t0 t0Var2 = t0Var.m;
                        if (t0Var.g.g) {
                            if (t0Var2 != null) {
                                if (t0Var2.e) {
                                    if (!(fVar instanceof w2.e)) {
                                        if (!(fVar instanceof s2.b)) {
                                        }
                                    }
                                    return true;
                                }
                            }
                        }
                    }
                }
                t0 t0Var3 = t0Var.m;
                if (t0Var3 == null || t0Var3.c[i10] != fVar.r) {
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
        f fVar = this.c;
        fVar.getClass();
        return fVar.n != 0;
    }

    public final void i(boolean z10) {
        if (z10) {
            if (this.e) {
                f fVar = this.a;
                e2.d.g(fVar.n == 0);
                fVar.c.A();
                fVar.r();
                this.e = false;
                return;
            }
            return;
        }
        if (this.f) {
            f fVar2 = this.c;
            fVar2.getClass();
            e2.d.g(fVar2.n == 0);
            fVar2.c.A();
            fVar2.r();
            this.f = false;
        }
    }

    public final int j(f fVar, t0 t0Var, x2.v vVar, a3.p pVar) {
        f fVar2;
        int i10;
        if (fVar == null || fVar.n == 0 || (fVar == (fVar2 = this.a) && ((i10 = this.d) == 2 || i10 == 4))) {
            return 1;
        }
        if (fVar == this.c && this.d == 3) {
            return 1;
        }
        u2.b1 b1Var = fVar.r;
        u2.b1[] b1VarArr = t0Var.c;
        int i11 = this.b;
        boolean z10 = b1Var != b1VarArr[i11];
        boolean b10 = vVar.b(i11);
        if (!b10 || z10) {
            if (!fVar.y) {
                x2.r rVar = vVar.c[i11];
                int length = rVar != null ? rVar.length() : 0;
                b2.s[] sVarArr = new b2.s[length];
                for (int i12 = 0; i12 < length; i12++) {
                    rVar.getClass();
                    sVarArr[i12] = rVar.f(i12);
                }
                u2.b1 b1Var2 = t0Var.c[i11];
                b1Var2.getClass();
                fVar.x(sVarArr, b1Var2, t0Var.e(), t0Var.p, t0Var.g.a);
                return 3;
            }
            if (!fVar.l()) {
                return 0;
            }
            a(fVar, pVar);
            if (!b10 || f()) {
                i(fVar == fVar2);
                return 1;
            }
        }
        return 1;
    }

    public final void k() {
        if (!h(this.a)) {
            i(true);
        }
        f fVar = this.c;
        if (fVar == null || fVar.n != 0) {
            return;
        }
        i(false);
    }

    public final void m() {
        int i10;
        f fVar = this.a;
        int i11 = fVar.n;
        if (i11 == 1 && this.d != 4) {
            e2.d.g(i11 == 1);
            fVar.n = 2;
            fVar.s();
            return;
        }
        f fVar2 = this.c;
        if (fVar2 == null || (i10 = fVar2.n) != 1 || this.d == 3) {
            return;
        }
        e2.d.g(i10 == 1);
        fVar2.n = 2;
        fVar2.s();
    }
}
