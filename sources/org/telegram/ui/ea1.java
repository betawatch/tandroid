package org.telegram.ui;

import android.util.SparseIntArray;
import android.view.View;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class ea1 extends s4.o {
    public int b;
    public final w91 c;
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

    public ea1(w91 w91Var, s4.c0 c0Var) {
        this.c = w91Var;
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
        w91 w91Var = this.c;
        if (i12 == 13 && w91Var.j(i11) == 13) {
            return true;
        }
        if (sparseIntArray.get(i10) == 10 && w91Var.j(i11) == 10) {
            return true;
        }
        int i13 = this.x;
        if (i10 >= i13 && i10 <= this.y) {
            return i10 - i13 == i11 - w91Var.I;
        }
        if (i10 == this.f && i11 == w91Var.e) {
            return true;
        }
        if (i10 == this.g && i11 == w91Var.h) {
            return true;
        }
        if (i10 == this.h && i11 == w91Var.r) {
            return true;
        }
        if (i10 == this.i && i11 == w91Var.s) {
            return true;
        }
        if (i10 == this.j && i11 == w91Var.v) {
            return true;
        }
        if (i10 == this.k && i11 == w91Var.w) {
            return true;
        }
        if (i10 == this.l && i11 == w91Var.x) {
            return true;
        }
        if (i10 == this.m && i11 == w91Var.n) {
            return true;
        }
        if (i10 == this.n && i11 == w91Var.y) {
            return true;
        }
        if (i10 == this.r && i11 == w91Var.K) {
            return true;
        }
        if (i10 == this.s && i11 == w91Var.L) {
            return true;
        }
        if (i10 == this.t && i11 == w91Var.M) {
            return true;
        }
        if (i10 == this.u && i11 == w91Var.N) {
            return true;
        }
        if (i10 == this.v && i11 == w91Var.O) {
            return true;
        }
        if (i10 == this.w && i11 == w91Var.P) {
            return true;
        }
        if (i10 == this.o && i11 == w91Var.E) {
            return true;
        }
        if (i10 == this.p && i11 == w91Var.F) {
            return true;
        }
        return i10 == this.q && i11 == w91Var.G;
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
        w91 w91Var = this.c;
        this.b = w91Var.c0;
        int i11 = 0;
        for (int i12 = 0; i12 < this.b; i12++) {
            sparseIntArray.put(i12, w91Var.j(i12));
        }
        this.f = w91Var.e;
        this.g = w91Var.h;
        this.h = w91Var.r;
        this.i = w91Var.s;
        this.j = w91Var.v;
        this.k = w91Var.w;
        this.l = w91Var.x;
        this.m = w91Var.n;
        this.n = w91Var.y;
        this.x = w91Var.I;
        this.y = w91Var.J;
        this.o = w91Var.E;
        this.p = w91Var.F;
        this.q = w91Var.G;
        this.r = w91Var.K;
        this.s = w91Var.L;
        this.t = w91Var.M;
        this.u = w91Var.N;
        this.v = w91Var.O;
        this.w = w91Var.P;
        w91Var.E();
        s4.c0 c0Var = this.d;
        int L0 = c0Var.L0();
        int N0 = c0Var.N0();
        while (true) {
            if (L0 > N0) {
                j3 = -1;
                i10 = 0;
                break;
            } else {
                if (w91Var.i(L0) != -1 && (m10 = c0Var.m(L0)) != null) {
                    j3 = w91Var.i(L0);
                    i10 = m10.getTop();
                    break;
                }
                L0++;
            }
        }
        s4.o.c(this, true).b(w91Var);
        if (j3 != -1) {
            while (true) {
                if (i11 >= w91Var.c0) {
                    i11 = -1;
                    break;
                } else if (w91Var.i(i11) == j3) {
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
