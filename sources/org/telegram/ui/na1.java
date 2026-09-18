package org.telegram.ui;

import android.util.SparseIntArray;
import android.view.View;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class na1 extends s4.o {
    public int b;
    public final fa1 c;
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

    public na1(fa1 fa1Var, s4.c0 c0Var) {
        this.c = fa1Var;
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
        fa1 fa1Var = this.c;
        if (i12 == 13 && fa1Var.j(i11) == 13) {
            return true;
        }
        if (sparseIntArray.get(i10) == 10 && fa1Var.j(i11) == 10) {
            return true;
        }
        int i13 = this.x;
        if (i10 >= i13 && i10 <= this.y) {
            return i10 - i13 == i11 - fa1Var.I;
        }
        if (i10 == this.f && i11 == fa1Var.e) {
            return true;
        }
        if (i10 == this.g && i11 == fa1Var.h) {
            return true;
        }
        if (i10 == this.h && i11 == fa1Var.r) {
            return true;
        }
        if (i10 == this.i && i11 == fa1Var.s) {
            return true;
        }
        if (i10 == this.j && i11 == fa1Var.v) {
            return true;
        }
        if (i10 == this.k && i11 == fa1Var.w) {
            return true;
        }
        if (i10 == this.l && i11 == fa1Var.x) {
            return true;
        }
        if (i10 == this.m && i11 == fa1Var.n) {
            return true;
        }
        if (i10 == this.n && i11 == fa1Var.y) {
            return true;
        }
        if (i10 == this.r && i11 == fa1Var.K) {
            return true;
        }
        if (i10 == this.s && i11 == fa1Var.L) {
            return true;
        }
        if (i10 == this.t && i11 == fa1Var.M) {
            return true;
        }
        if (i10 == this.u && i11 == fa1Var.N) {
            return true;
        }
        if (i10 == this.v && i11 == fa1Var.O) {
            return true;
        }
        if (i10 == this.w && i11 == fa1Var.P) {
            return true;
        }
        if (i10 == this.o && i11 == fa1Var.E) {
            return true;
        }
        if (i10 == this.p && i11 == fa1Var.F) {
            return true;
        }
        return i10 == this.q && i11 == fa1Var.G;
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
        fa1 fa1Var = this.c;
        this.b = fa1Var.c0;
        int i11 = 0;
        for (int i12 = 0; i12 < this.b; i12++) {
            sparseIntArray.put(i12, fa1Var.j(i12));
        }
        this.f = fa1Var.e;
        this.g = fa1Var.h;
        this.h = fa1Var.r;
        this.i = fa1Var.s;
        this.j = fa1Var.v;
        this.k = fa1Var.w;
        this.l = fa1Var.x;
        this.m = fa1Var.n;
        this.n = fa1Var.y;
        this.x = fa1Var.I;
        this.y = fa1Var.J;
        this.o = fa1Var.E;
        this.p = fa1Var.F;
        this.q = fa1Var.G;
        this.r = fa1Var.K;
        this.s = fa1Var.L;
        this.t = fa1Var.M;
        this.u = fa1Var.N;
        this.v = fa1Var.O;
        this.w = fa1Var.P;
        fa1Var.E();
        s4.c0 c0Var = this.d;
        int L0 = c0Var.L0();
        int N0 = c0Var.N0();
        while (true) {
            if (L0 > N0) {
                j3 = -1;
                i10 = 0;
                break;
            } else {
                if (fa1Var.i(L0) != -1 && (m10 = c0Var.m(L0)) != null) {
                    j3 = fa1Var.i(L0);
                    i10 = m10.getTop();
                    break;
                }
                L0++;
            }
        }
        s4.o.c(this, true).b(fa1Var);
        if (j3 != -1) {
            while (true) {
                if (i11 >= fa1Var.c0) {
                    i11 = -1;
                    break;
                } else if (fa1Var.i(i11) == j3) {
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
