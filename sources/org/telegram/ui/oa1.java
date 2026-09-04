package org.telegram.ui;

import android.util.SparseIntArray;
import android.view.View;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class oa1 extends s4.o {
    public int b;
    public final ga1 c;
    public final s4.c0 d;
    public final SparseIntArray e = new SparseIntArray();
    public int f = -1;
    public int g = -1;
    public int h = -1;
    public int i = -1;
    public int j = -1;
    public int k = -1;
    public int l = -1;
    public int m = -1;
    public int n = -1;
    public int o = -1;
    public int p = -1;
    public int q = -1;
    public int r = -1;
    public int s = -1;
    public int t = -1;
    public int u = -1;
    public int v = -1;
    public int w = -1;
    public int x = -1;
    public int y = -1;

    public oa1(ga1 ga1Var, s4.c0 c0Var) {
        this.c = ga1Var;
        this.d = c0Var;
    }

    @Override // s4.o
    public final boolean a(int i10, int i11) {
        return this.e.get(i10) == this.c.j(i11);
    }

    @Override // s4.o
    public final boolean b(int i10, int i11) {
        SparseIntArray sparseIntArray = this.e;
        int i12 = sparseIntArray.get(i10);
        ga1 ga1Var = this.c;
        if (i12 == 13 && ga1Var.j(i11) == 13) {
            return true;
        }
        if (sparseIntArray.get(i10) == 10 && ga1Var.j(i11) == 10) {
            return true;
        }
        int i13 = this.x;
        if (i10 >= i13 && i10 <= this.y) {
            return i10 - i13 == i11 - ga1Var.I;
        }
        if (i10 == this.f && i11 == ga1Var.e) {
            return true;
        }
        if (i10 == this.g && i11 == ga1Var.h) {
            return true;
        }
        if (i10 == this.h && i11 == ga1Var.r) {
            return true;
        }
        if (i10 == this.i && i11 == ga1Var.s) {
            return true;
        }
        if (i10 == this.j && i11 == ga1Var.v) {
            return true;
        }
        if (i10 == this.k && i11 == ga1Var.w) {
            return true;
        }
        if (i10 == this.l && i11 == ga1Var.x) {
            return true;
        }
        if (i10 == this.m && i11 == ga1Var.n) {
            return true;
        }
        if (i10 == this.n && i11 == ga1Var.y) {
            return true;
        }
        if (i10 == this.r && i11 == ga1Var.K) {
            return true;
        }
        if (i10 == this.s && i11 == ga1Var.L) {
            return true;
        }
        if (i10 == this.t && i11 == ga1Var.M) {
            return true;
        }
        if (i10 == this.u && i11 == ga1Var.N) {
            return true;
        }
        if (i10 == this.v && i11 == ga1Var.O) {
            return true;
        }
        if (i10 == this.w && i11 == ga1Var.P) {
            return true;
        }
        if (i10 == this.o && i11 == ga1Var.E) {
            return true;
        }
        if (i10 == this.p && i11 == ga1Var.F) {
            return true;
        }
        return i10 == this.q && i11 == ga1Var.G;
    }

    @Override // s4.o
    public final int d() {
        return this.c.c0;
    }

    @Override // s4.o
    public final int e() {
        return this.b;
    }

    public final void f() {
        long j3;
        int i10;
        View m10;
        SparseIntArray sparseIntArray = this.e;
        sparseIntArray.clear();
        ga1 ga1Var = this.c;
        this.b = ga1Var.c0;
        int i11 = 0;
        for (int i12 = 0; i12 < this.b; i12++) {
            sparseIntArray.put(i12, ga1Var.j(i12));
        }
        this.f = ga1Var.e;
        this.g = ga1Var.h;
        this.h = ga1Var.r;
        this.i = ga1Var.s;
        this.j = ga1Var.v;
        this.k = ga1Var.w;
        this.l = ga1Var.x;
        this.m = ga1Var.n;
        this.n = ga1Var.y;
        this.x = ga1Var.I;
        this.y = ga1Var.J;
        this.o = ga1Var.E;
        this.p = ga1Var.F;
        this.q = ga1Var.G;
        this.r = ga1Var.K;
        this.s = ga1Var.L;
        this.t = ga1Var.M;
        this.u = ga1Var.N;
        this.v = ga1Var.O;
        this.w = ga1Var.P;
        ga1Var.E();
        s4.c0 c0Var = this.d;
        int L0 = c0Var.L0();
        int N0 = c0Var.N0();
        while (true) {
            if (L0 > N0) {
                j3 = -1;
                i10 = 0;
                break;
            } else {
                if (ga1Var.i(L0) != -1 && (m10 = c0Var.m(L0)) != null) {
                    j3 = ga1Var.i(L0);
                    i10 = m10.getTop();
                    break;
                }
                L0++;
            }
        }
        s4.o.c(this, true).b(ga1Var);
        if (j3 != -1) {
            while (true) {
                if (i11 >= ga1Var.c0) {
                    i11 = -1;
                    break;
                } else if (ga1Var.i(i11) == j3) {
                    break;
                } else {
                    i11++;
                }
            }
            if (i11 > 0) {
                c0Var.h1(i11, i10);
            }
        }
    }
}
