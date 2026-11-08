package l2;

import a8.ia;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class r1 {
    public final b a;
    public final int b;
    public final b c;
    public int d = 0;
    public boolean e = false;
    public boolean f = false;

    public r1(b bVar, b bVar2, int i7) {
        this.a = bVar;
        this.b = i7;
        this.c = bVar2;
    }

    public static void b(b bVar) {
        int i7 = bVar.n;
        if (i7 == 2) {
            ia.p(i7 == 2);
            bVar.n = 1;
            bVar.t();
        }
    }

    public static boolean h(b bVar) {
        return bVar.n != 0;
    }

    public static void l(b bVar, long j3) {
        bVar.D = true;
        if (bVar instanceof z2.f) {
            z2.f fVar = (z2.f) bVar;
            ia.p(fVar.D);
            fVar.a0 = j3;
        }
    }

    public final void a(b bVar, i iVar) {
        ia.p(this.a == bVar || this.c == bVar);
        if (h(bVar)) {
            if (bVar == ((b) iVar.e)) {
                iVar.f = null;
                iVar.e = null;
                iVar.a = true;
            }
            b(bVar);
            ia.p(bVar.n == 1);
            bVar.c.A();
            bVar.n = 0;
            bVar.r = null;
            bVar.s = null;
            bVar.D = false;
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
        x2.c1 c1Var;
        if (x0Var != null && (c1Var = x0Var.c[this.b]) != null) {
            b bVar = this.a;
            if (bVar.r == c1Var) {
                return bVar;
            }
            b bVar2 = this.c;
            if (bVar2 != null && bVar2.r == c1Var) {
                return bVar2;
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0036, code lost:
    
        if (r9.y >= r1.e()) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean e(x0 x0Var, b bVar) {
        if (bVar != null) {
            x2.c1[] c1VarArr = x0Var.c;
            int i7 = this.b;
            x2.c1 c1Var = c1VarArr[i7];
            x2.c1 c1Var2 = bVar.r;
            if (c1Var2 != null) {
                if (c1Var2 == c1Var) {
                    if (c1Var != null && !bVar.k()) {
                        x0 x0Var2 = x0Var.m;
                        if (x0Var.g.h) {
                            if (x0Var2 != null) {
                                if (x0Var2.e) {
                                    if (!(bVar instanceof z2.f)) {
                                        if (!(bVar instanceof v2.b)) {
                                        }
                                    }
                                    return true;
                                }
                            }
                        }
                    }
                }
                x0 x0Var3 = x0Var.m;
                if (x0Var3 == null || x0Var3.c[i7] != bVar.r) {
                    return false;
                }
            }
        }
        return true;
    }

    public final boolean f() {
        int i7 = this.d;
        return i7 == 2 || i7 == 4 || i7 == 3;
    }

    public final boolean g() {
        int i7 = this.d;
        if (i7 == 0 || i7 == 2 || i7 == 4) {
            return h(this.a);
        }
        b bVar = this.c;
        bVar.getClass();
        return bVar.n != 0;
    }

    public final void i(boolean z9) {
        if (z9) {
            if (this.e) {
                b bVar = this.a;
                ia.p(bVar.n == 0);
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
            ia.p(bVar2.n == 0);
            bVar2.c.A();
            bVar2.r();
            this.f = false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int j(b bVar, x0 x0Var, a3.y yVar, i iVar) {
        b bVar2;
        int i7;
        if (bVar == null || bVar.n == 0 || (bVar == (bVar2 = this.a) && ((i7 = this.d) == 2 || i7 == 4))) {
            return 1;
        }
        if (bVar == this.c && this.d == 3) {
            return 1;
        }
        x2.c1 c1Var = bVar.r;
        x2.c1[] c1VarArr = x0Var.c;
        int i10 = this.b;
        Object[] objArr = c1Var != c1VarArr[i10];
        boolean b10 = yVar.b(i10);
        if (!b10 || objArr != false) {
            if (!bVar.D) {
                a3.u uVar = yVar.c[i10];
                int length = uVar != null ? uVar.length() : 0;
                e2.u[] uVarArr = new e2.u[length];
                for (int i11 = 0; i11 < length; i11++) {
                    uVar.getClass();
                    uVarArr[i11] = uVar.g(i11);
                }
                x2.c1 c1Var2 = x0Var.c[i10];
                c1Var2.getClass();
                bVar.y(uVarArr, c1Var2, x0Var.e(), x0Var.p, x0Var.g.a);
                return 3;
            }
            if (!bVar.l()) {
                return 0;
            }
            a(bVar, iVar);
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
        int i7;
        b bVar = this.a;
        int i10 = bVar.n;
        if (i10 == 1 && this.d != 4) {
            ia.p(i10 == 1);
            bVar.n = 2;
            bVar.s();
            return;
        }
        b bVar2 = this.c;
        if (bVar2 == null || (i7 = bVar2.n) != 1 || this.d == 3) {
            return;
        }
        ia.p(i7 == 1);
        bVar2.n = 2;
        bVar2.s();
    }
}
