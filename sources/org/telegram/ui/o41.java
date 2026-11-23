package org.telegram.ui;

import android.util.SparseIntArray;
import android.view.View;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class o41 extends v4.p {
    public int b;
    public final g41 c;
    public final v4.c0 d;
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

    public o41(g41 g41Var, v4.c0 c0Var) {
        this.c = g41Var;
        this.d = c0Var;
    }

    @Override // v4.p
    public final boolean a(int i7, int i10) {
        return this.e.get(i7) == this.c.d(i10);
    }

    @Override // v4.p
    public final boolean b(int i7, int i10) {
        SparseIntArray sparseIntArray = this.e;
        int i11 = sparseIntArray.get(i7);
        g41 g41Var = this.c;
        if (i11 == 13 && g41Var.d(i10) == 13) {
            return true;
        }
        if (sparseIntArray.get(i7) == 10 && g41Var.d(i10) == 10) {
            return true;
        }
        int i12 = this.x;
        if (i7 >= i12 && i7 <= this.y) {
            return i7 - i12 == i10 - g41Var.J;
        }
        if (i7 == this.f && i10 == g41Var.e) {
            return true;
        }
        if (i7 == this.g && i10 == g41Var.h) {
            return true;
        }
        if (i7 == this.h && i10 == g41Var.r) {
            return true;
        }
        if (i7 == this.i && i10 == g41Var.s) {
            return true;
        }
        if (i7 == this.j && i10 == g41Var.w) {
            return true;
        }
        if (i7 == this.k && i10 == g41Var.x) {
            return true;
        }
        if (i7 == this.l && i10 == g41Var.y) {
            return true;
        }
        if (i7 == this.m && i10 == g41Var.n) {
            return true;
        }
        if (i7 == this.n && i10 == g41Var.E) {
            return true;
        }
        if (i7 == this.r && i10 == g41Var.L) {
            return true;
        }
        if (i7 == this.s && i10 == g41Var.M) {
            return true;
        }
        if (i7 == this.t && i10 == g41Var.N) {
            return true;
        }
        if (i7 == this.u && i10 == g41Var.O) {
            return true;
        }
        if (i7 == this.v && i10 == g41Var.P) {
            return true;
        }
        if (i7 == this.w && i10 == g41Var.Q) {
            return true;
        }
        if (i7 == this.o && i10 == g41Var.F) {
            return true;
        }
        if (i7 == this.p && i10 == g41Var.G) {
            return true;
        }
        return i7 == this.q && i10 == g41Var.H;
    }

    @Override // v4.p
    public final int d() {
        return this.c.d0;
    }

    @Override // v4.p
    public final int e() {
        return this.b;
    }

    public final void f() {
        int i7;
        long j3;
        View m10;
        SparseIntArray sparseIntArray = this.e;
        sparseIntArray.clear();
        g41 g41Var = this.c;
        this.b = g41Var.d0;
        int i10 = 0;
        for (int i11 = 0; i11 < this.b; i11++) {
            sparseIntArray.put(i11, g41Var.d(i11));
        }
        this.f = g41Var.e;
        this.g = g41Var.h;
        this.h = g41Var.r;
        this.i = g41Var.s;
        this.j = g41Var.w;
        this.k = g41Var.x;
        this.l = g41Var.y;
        this.m = g41Var.n;
        this.n = g41Var.E;
        this.x = g41Var.J;
        this.y = g41Var.K;
        this.o = g41Var.F;
        this.p = g41Var.G;
        this.q = g41Var.H;
        this.r = g41Var.L;
        this.s = g41Var.M;
        this.t = g41Var.N;
        this.u = g41Var.O;
        this.v = g41Var.P;
        this.w = g41Var.Q;
        g41Var.E();
        v4.c0 c0Var = this.d;
        int L0 = c0Var.L0();
        int N0 = c0Var.N0();
        while (true) {
            if (L0 > N0) {
                i7 = 0;
                j3 = -1;
                break;
            } else {
                if (g41Var.c(L0) != -1 && (m10 = c0Var.m(L0)) != null) {
                    j3 = g41Var.c(L0);
                    i7 = m10.getTop();
                    break;
                }
                L0++;
            }
        }
        v4.p.c(this, true).c(g41Var);
        if (j3 != -1) {
            while (true) {
                if (i10 >= g41Var.d0) {
                    i10 = -1;
                    break;
                } else if (g41Var.c(i10) == j3) {
                    break;
                } else {
                    i10++;
                }
            }
            if (i10 > 0) {
                c0Var.h1(i10, i7);
            }
        }
    }
}
