package org.telegram.ui;

import android.util.SparseIntArray;
import android.view.View;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final class ia1 extends s4.o {
    public int b;
    public final aa1 c;
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

    public ia1(aa1 aa1Var, s4.c0 c0Var) {
        this.c = aa1Var;
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
        aa1 aa1Var = this.c;
        if (i12 == 13 && aa1Var.j(i11) == 13) {
            return true;
        }
        if (sparseIntArray.get(i10) == 10 && aa1Var.j(i11) == 10) {
            return true;
        }
        int i13 = this.x;
        if (i10 >= i13 && i10 <= this.y) {
            return i10 - i13 == i11 - aa1Var.I;
        }
        if (i10 == this.f && i11 == aa1Var.e) {
            return true;
        }
        if (i10 == this.g && i11 == aa1Var.h) {
            return true;
        }
        if (i10 == this.h && i11 == aa1Var.r) {
            return true;
        }
        if (i10 == this.i && i11 == aa1Var.s) {
            return true;
        }
        if (i10 == this.j && i11 == aa1Var.v) {
            return true;
        }
        if (i10 == this.k && i11 == aa1Var.w) {
            return true;
        }
        if (i10 == this.l && i11 == aa1Var.x) {
            return true;
        }
        if (i10 == this.m && i11 == aa1Var.n) {
            return true;
        }
        if (i10 == this.n && i11 == aa1Var.y) {
            return true;
        }
        if (i10 == this.r && i11 == aa1Var.K) {
            return true;
        }
        if (i10 == this.s && i11 == aa1Var.L) {
            return true;
        }
        if (i10 == this.t && i11 == aa1Var.M) {
            return true;
        }
        if (i10 == this.u && i11 == aa1Var.N) {
            return true;
        }
        if (i10 == this.v && i11 == aa1Var.O) {
            return true;
        }
        if (i10 == this.w && i11 == aa1Var.P) {
            return true;
        }
        if (i10 == this.o && i11 == aa1Var.E) {
            return true;
        }
        if (i10 == this.p && i11 == aa1Var.F) {
            return true;
        }
        return i10 == this.q && i11 == aa1Var.G;
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
        aa1 aa1Var = this.c;
        this.b = aa1Var.c0;
        int i11 = 0;
        for (int i12 = 0; i12 < this.b; i12++) {
            sparseIntArray.put(i12, aa1Var.j(i12));
        }
        this.f = aa1Var.e;
        this.g = aa1Var.h;
        this.h = aa1Var.r;
        this.i = aa1Var.s;
        this.j = aa1Var.v;
        this.k = aa1Var.w;
        this.l = aa1Var.x;
        this.m = aa1Var.n;
        this.n = aa1Var.y;
        this.x = aa1Var.I;
        this.y = aa1Var.J;
        this.o = aa1Var.E;
        this.p = aa1Var.F;
        this.q = aa1Var.G;
        this.r = aa1Var.K;
        this.s = aa1Var.L;
        this.t = aa1Var.M;
        this.u = aa1Var.N;
        this.v = aa1Var.O;
        this.w = aa1Var.P;
        aa1Var.E();
        s4.c0 c0Var = this.d;
        int L0 = c0Var.L0();
        int N0 = c0Var.N0();
        while (true) {
            if (L0 > N0) {
                j3 = -1;
                i10 = 0;
                break;
            } else {
                if (aa1Var.i(L0) != -1 && (m10 = c0Var.m(L0)) != null) {
                    j3 = aa1Var.i(L0);
                    i10 = m10.getTop();
                    break;
                }
                L0++;
            }
        }
        s4.o.c(this, true).b(aa1Var);
        if (j3 != -1) {
            while (true) {
                if (i11 >= aa1Var.c0) {
                    i11 = -1;
                    break;
                } else if (aa1Var.i(i11) == j3) {
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
