package org.telegram.ui;

import android.util.SparseIntArray;
import android.view.View;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class e41 extends u4.o {
    public int b;
    public final w31 c;
    public final u4.b0 d;
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

    public e41(w31 w31Var, u4.b0 b0Var) {
        this.c = w31Var;
        this.d = b0Var;
    }

    @Override // u4.o
    public final boolean a(int i3, int i10) {
        return this.e.get(i3) == this.c.d(i10);
    }

    @Override // u4.o
    public final boolean b(int i3, int i10) {
        SparseIntArray sparseIntArray = this.e;
        int i11 = sparseIntArray.get(i3);
        w31 w31Var = this.c;
        if (i11 == 13 && w31Var.d(i10) == 13) {
            return true;
        }
        if (sparseIntArray.get(i3) == 10 && w31Var.d(i10) == 10) {
            return true;
        }
        int i12 = this.x;
        if (i3 >= i12 && i3 <= this.y) {
            return i3 - i12 == i10 - w31Var.J;
        }
        if (i3 == this.f && i10 == w31Var.e) {
            return true;
        }
        if (i3 == this.g && i10 == w31Var.h) {
            return true;
        }
        if (i3 == this.h && i10 == w31Var.r) {
            return true;
        }
        if (i3 == this.i && i10 == w31Var.s) {
            return true;
        }
        if (i3 == this.j && i10 == w31Var.w) {
            return true;
        }
        if (i3 == this.k && i10 == w31Var.x) {
            return true;
        }
        if (i3 == this.l && i10 == w31Var.y) {
            return true;
        }
        if (i3 == this.m && i10 == w31Var.n) {
            return true;
        }
        if (i3 == this.n && i10 == w31Var.E) {
            return true;
        }
        if (i3 == this.r && i10 == w31Var.L) {
            return true;
        }
        if (i3 == this.s && i10 == w31Var.M) {
            return true;
        }
        if (i3 == this.t && i10 == w31Var.N) {
            return true;
        }
        if (i3 == this.u && i10 == w31Var.O) {
            return true;
        }
        if (i3 == this.v && i10 == w31Var.P) {
            return true;
        }
        if (i3 == this.w && i10 == w31Var.Q) {
            return true;
        }
        if (i3 == this.o && i10 == w31Var.F) {
            return true;
        }
        if (i3 == this.p && i10 == w31Var.G) {
            return true;
        }
        return i3 == this.q && i10 == w31Var.H;
    }

    @Override // u4.o
    public final int d() {
        return this.c.d0;
    }

    @Override // u4.o
    public final int e() {
        return this.b;
    }

    public final void f() {
        int i3;
        long j10;
        View m10;
        SparseIntArray sparseIntArray = this.e;
        sparseIntArray.clear();
        w31 w31Var = this.c;
        this.b = w31Var.d0;
        int i10 = 0;
        for (int i11 = 0; i11 < this.b; i11++) {
            sparseIntArray.put(i11, w31Var.d(i11));
        }
        this.f = w31Var.e;
        this.g = w31Var.h;
        this.h = w31Var.r;
        this.i = w31Var.s;
        this.j = w31Var.w;
        this.k = w31Var.x;
        this.l = w31Var.y;
        this.m = w31Var.n;
        this.n = w31Var.E;
        this.x = w31Var.J;
        this.y = w31Var.K;
        this.o = w31Var.F;
        this.p = w31Var.G;
        this.q = w31Var.H;
        this.r = w31Var.L;
        this.s = w31Var.M;
        this.t = w31Var.N;
        this.u = w31Var.O;
        this.v = w31Var.P;
        this.w = w31Var.Q;
        w31Var.E();
        u4.b0 b0Var = this.d;
        int L0 = b0Var.L0();
        int N0 = b0Var.N0();
        while (true) {
            if (L0 > N0) {
                i3 = 0;
                j10 = -1;
                break;
            } else {
                if (w31Var.c(L0) != -1 && (m10 = b0Var.m(L0)) != null) {
                    j10 = w31Var.c(L0);
                    i3 = m10.getTop();
                    break;
                }
                L0++;
            }
        }
        u4.o.c(this, true).c(w31Var);
        if (j10 != -1) {
            while (true) {
                if (i10 >= w31Var.d0) {
                    i10 = -1;
                    break;
                } else if (w31Var.c(i10) == j10) {
                    break;
                } else {
                    i10++;
                }
            }
            if (i10 > 0) {
                b0Var.h1(i10, i3);
            }
        }
    }
}
