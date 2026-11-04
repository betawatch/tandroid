package k2;

import b8.zb;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class r1 {
    public final b a;
    public final int b;
    public final b c;
    public int d = 0;
    public boolean e = false;
    public boolean f = false;

    public r1(b bVar, b bVar2, int i3) {
        this.a = bVar;
        this.b = i3;
        this.c = bVar2;
    }

    public static void b(b bVar) {
        int i3 = bVar.n;
        if (i3 == 2) {
            zb.p(i3 == 2);
            bVar.n = 1;
            bVar.t();
        }
    }

    public static boolean h(b bVar) {
        return bVar.n != 0;
    }

    public static void l(b bVar, long j10) {
        bVar.E = true;
        if (bVar instanceof y2.e) {
            y2.e eVar = (y2.e) bVar;
            zb.p(eVar.E);
            eVar.b0 = j10;
        }
    }

    public final void a(b bVar, i iVar) {
        zb.p(this.a == bVar || this.c == bVar);
        if (h(bVar)) {
            if (bVar == iVar.c) {
                iVar.d = null;
                iVar.c = null;
                iVar.e = true;
            }
            b(bVar);
            zb.p(bVar.n == 1);
            bVar.c.q();
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

    public final b d(x0 x0Var) {
        w2.d1 d1Var;
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
    
        if (r9.y >= r1.e()) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean e(x0 x0Var, b bVar) {
        if (bVar != null) {
            w2.d1[] d1VarArr = x0Var.c;
            int i3 = this.b;
            w2.d1 d1Var = d1VarArr[i3];
            w2.d1 d1Var2 = bVar.r;
            if (d1Var2 != null) {
                if (d1Var2 == d1Var) {
                    if (d1Var != null && !bVar.k()) {
                        x0 x0Var2 = x0Var.m;
                        if (x0Var.g.h) {
                            if (x0Var2 != null) {
                                if (x0Var2.e) {
                                    if (!(bVar instanceof y2.e)) {
                                        if (!(bVar instanceof u2.b)) {
                                        }
                                    }
                                    return true;
                                }
                            }
                        }
                    }
                }
                x0 x0Var3 = x0Var.m;
                if (x0Var3 == null || x0Var3.c[i3] != bVar.r) {
                    return false;
                }
            }
        }
        return true;
    }

    public final boolean f() {
        int i3 = this.d;
        return i3 == 2 || i3 == 4 || i3 == 3;
    }

    public final boolean g() {
        int i3 = this.d;
        if (i3 == 0 || i3 == 2 || i3 == 4) {
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
                zb.p(bVar.n == 0);
                bVar.c.q();
                bVar.r();
                this.e = false;
                return;
            }
            return;
        }
        if (this.f) {
            b bVar2 = this.c;
            bVar2.getClass();
            zb.p(bVar2.n == 0);
            bVar2.c.q();
            bVar2.r();
            this.f = false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int j(b bVar, x0 x0Var, z2.t tVar, i iVar) {
        b bVar2;
        int i3;
        if (bVar == null || bVar.n == 0 || (bVar == (bVar2 = this.a) && ((i3 = this.d) == 2 || i3 == 4))) {
            return 1;
        }
        if (bVar == this.c && this.d == 3) {
            return 1;
        }
        w2.d1 d1Var = bVar.r;
        w2.d1[] d1VarArr = x0Var.c;
        int i10 = this.b;
        Object[] objArr = d1Var != d1VarArr[i10];
        boolean b10 = tVar.b(i10);
        if (!b10 || objArr != false) {
            if (!bVar.E) {
                z2.p pVar = tVar.c[i10];
                int length = pVar != null ? pVar.length() : 0;
                d2.v[] vVarArr = new d2.v[length];
                for (int i11 = 0; i11 < length; i11++) {
                    pVar.getClass();
                    vVarArr[i11] = pVar.g(i11);
                }
                w2.d1 d1Var2 = x0Var.c[i10];
                d1Var2.getClass();
                bVar.y(vVarArr, d1Var2, x0Var.e(), x0Var.p, x0Var.g.a);
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
        int i3;
        b bVar = this.a;
        int i10 = bVar.n;
        if (i10 == 1 && this.d != 4) {
            zb.p(i10 == 1);
            bVar.n = 2;
            bVar.s();
            return;
        }
        b bVar2 = this.c;
        if (bVar2 == null || (i3 = bVar2.n) != 1 || this.d == 3) {
            return;
        }
        zb.p(i3 == 1);
        bVar2.n = 2;
        bVar2.s();
    }
}
