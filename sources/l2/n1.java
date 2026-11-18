package l2;

import a8.la;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public final class n1 {
    public final b a;
    public final int b;
    public final b c;
    public int d = 0;
    public boolean e = false;
    public boolean f = false;

    public n1(b bVar, b bVar2, int i7) {
        this.a = bVar;
        this.b = i7;
        this.c = bVar2;
    }

    public static void b(b bVar) {
        int i7 = bVar.n;
        if (i7 == 2) {
            la.p(i7 == 2);
            bVar.n = 1;
            bVar.t();
        }
    }

    public static boolean h(b bVar) {
        return bVar.n != 0;
    }

    public static void l(b bVar, long j3) {
        bVar.E = true;
        if (bVar instanceof z2.e) {
            z2.e eVar = (z2.e) bVar;
            la.p(eVar.E);
            eVar.b0 = j3;
        }
    }

    public final void a(b bVar, i iVar) {
        la.p(this.a == bVar || this.c == bVar);
        if (h(bVar)) {
            if (bVar == ((b) iVar.e)) {
                iVar.f = null;
                iVar.e = null;
                iVar.a = true;
            }
            b(bVar);
            la.p(bVar.n == 1);
            bVar.c.g0();
            bVar.n = 0;
            bVar.r = null;
            bVar.s = null;
            bVar.E = false;
            bVar.n();
            bVar.H = null;
        }
    }

    public final int c() {
        boolean h = h(this.a);
        b bVar = this.c;
        return (h ? 1 : 0) + ((bVar == null || !h(bVar)) ? 0 : 1);
    }

    public final b d(u0 u0Var) {
        x2.d1 d1Var;
        if (u0Var != null && (d1Var = u0Var.c[this.b]) != null) {
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
    
        if (r9.y >= r1.e()) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean e(u0 u0Var, b bVar) {
        if (bVar != null) {
            x2.d1[] d1VarArr = u0Var.c;
            int i7 = this.b;
            x2.d1 d1Var = d1VarArr[i7];
            x2.d1 d1Var2 = bVar.r;
            if (d1Var2 != null) {
                if (d1Var2 == d1Var) {
                    if (d1Var != null && !bVar.k()) {
                        u0 u0Var2 = u0Var.m;
                        if (u0Var.g.h) {
                            if (u0Var2 != null) {
                                if (u0Var2.e) {
                                    if (!(bVar instanceof z2.e)) {
                                        if (!(bVar instanceof v2.b)) {
                                        }
                                    }
                                    return true;
                                }
                            }
                        }
                    }
                }
                u0 u0Var3 = u0Var.m;
                if (u0Var3 == null || u0Var3.c[i7] != bVar.r) {
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

    public final void i(boolean z10) {
        if (z10) {
            if (this.e) {
                b bVar = this.a;
                la.p(bVar.n == 0);
                bVar.c.g0();
                bVar.r();
                this.e = false;
                return;
            }
            return;
        }
        if (this.f) {
            b bVar2 = this.c;
            bVar2.getClass();
            la.p(bVar2.n == 0);
            bVar2.c.g0();
            bVar2.r();
            this.f = false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int j(b bVar, u0 u0Var, a3.y yVar, i iVar) {
        b bVar2;
        int i7;
        if (bVar == null || bVar.n == 0 || (bVar == (bVar2 = this.a) && ((i7 = this.d) == 2 || i7 == 4))) {
            return 1;
        }
        if (bVar == this.c && this.d == 3) {
            return 1;
        }
        x2.d1 d1Var = bVar.r;
        x2.d1[] d1VarArr = u0Var.c;
        int i10 = this.b;
        Object[] objArr = d1Var != d1VarArr[i10];
        boolean b10 = yVar.b(i10);
        if (!b10 || objArr != false) {
            if (!bVar.E) {
                a3.u uVar = yVar.c[i10];
                int length = uVar != null ? uVar.length() : 0;
                e2.u[] uVarArr = new e2.u[length];
                for (int i11 = 0; i11 < length; i11++) {
                    uVar.getClass();
                    uVarArr[i11] = uVar.g(i11);
                }
                x2.d1 d1Var2 = u0Var.c[i10];
                d1Var2.getClass();
                bVar.y(uVarArr, d1Var2, u0Var.e(), u0Var.p, u0Var.g.a);
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
            la.p(i10 == 1);
            bVar.n = 2;
            bVar.s();
            return;
        }
        b bVar2 = this.c;
        if (bVar2 == null || (i7 = bVar2.n) != 1 || this.d == 3) {
            return;
        }
        la.p(i7 == 1);
        bVar2.n = 2;
        bVar2.s();
    }
}
