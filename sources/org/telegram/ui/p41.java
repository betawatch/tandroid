package org.telegram.ui;

import android.util.SparseIntArray;
import android.view.View;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class p41 extends v4.o {
    public int b;
    public final h41 c;
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

    public p41(h41 h41Var, v4.c0 c0Var) {
        this.c = h41Var;
        this.d = c0Var;
    }

    @Override // v4.o
    public final boolean a(int i7, int i10) {
        return this.e.get(i7) == this.c.d(i10);
    }

    @Override // v4.o
    public final boolean b(int i7, int i10) {
        SparseIntArray sparseIntArray = this.e;
        int i11 = sparseIntArray.get(i7);
        h41 h41Var = this.c;
        if (i11 == 13 && h41Var.d(i10) == 13) {
            return true;
        }
        if (sparseIntArray.get(i7) == 10 && h41Var.d(i10) == 10) {
            return true;
        }
        int i12 = this.x;
        if (i7 >= i12 && i7 <= this.y) {
            return i7 - i12 == i10 - h41Var.J;
        }
        if (i7 == this.f && i10 == h41Var.e) {
            return true;
        }
        if (i7 == this.g && i10 == h41Var.h) {
            return true;
        }
        if (i7 == this.h && i10 == h41Var.r) {
            return true;
        }
        if (i7 == this.i && i10 == h41Var.s) {
            return true;
        }
        if (i7 == this.j && i10 == h41Var.w) {
            return true;
        }
        if (i7 == this.k && i10 == h41Var.x) {
            return true;
        }
        if (i7 == this.l && i10 == h41Var.y) {
            return true;
        }
        if (i7 == this.m && i10 == h41Var.n) {
            return true;
        }
        if (i7 == this.n && i10 == h41Var.E) {
            return true;
        }
        if (i7 == this.r && i10 == h41Var.L) {
            return true;
        }
        if (i7 == this.s && i10 == h41Var.M) {
            return true;
        }
        if (i7 == this.t && i10 == h41Var.N) {
            return true;
        }
        if (i7 == this.u && i10 == h41Var.O) {
            return true;
        }
        if (i7 == this.v && i10 == h41Var.P) {
            return true;
        }
        if (i7 == this.w && i10 == h41Var.Q) {
            return true;
        }
        if (i7 == this.o && i10 == h41Var.F) {
            return true;
        }
        if (i7 == this.p && i10 == h41Var.G) {
            return true;
        }
        return i7 == this.q && i10 == h41Var.H;
    }

    @Override // v4.o
    public final int d() {
        return this.c.d0;
    }

    @Override // v4.o
    public final int e() {
        return this.b;
    }

    public final void f() {
        int i7;
        long j3;
        View m10;
        SparseIntArray sparseIntArray = this.e;
        sparseIntArray.clear();
        h41 h41Var = this.c;
        this.b = h41Var.d0;
        int i10 = 0;
        for (int i11 = 0; i11 < this.b; i11++) {
            sparseIntArray.put(i11, h41Var.d(i11));
        }
        this.f = h41Var.e;
        this.g = h41Var.h;
        this.h = h41Var.r;
        this.i = h41Var.s;
        this.j = h41Var.w;
        this.k = h41Var.x;
        this.l = h41Var.y;
        this.m = h41Var.n;
        this.n = h41Var.E;
        this.x = h41Var.J;
        this.y = h41Var.K;
        this.o = h41Var.F;
        this.p = h41Var.G;
        this.q = h41Var.H;
        this.r = h41Var.L;
        this.s = h41Var.M;
        this.t = h41Var.N;
        this.u = h41Var.O;
        this.v = h41Var.P;
        this.w = h41Var.Q;
        h41Var.E();
        v4.c0 c0Var = this.d;
        int L0 = c0Var.L0();
        int N0 = c0Var.N0();
        while (true) {
            if (L0 > N0) {
                i7 = 0;
                j3 = -1;
                break;
            } else {
                if (h41Var.c(L0) != -1 && (m10 = c0Var.m(L0)) != null) {
                    j3 = h41Var.c(L0);
                    i7 = m10.getTop();
                    break;
                }
                L0++;
            }
        }
        v4.o.c(this, true).c(h41Var);
        if (j3 != -1) {
            while (true) {
                if (i10 >= h41Var.d0) {
                    i10 = -1;
                    break;
                } else if (h41Var.c(i10) == j3) {
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
