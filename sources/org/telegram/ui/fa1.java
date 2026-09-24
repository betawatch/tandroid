package org.telegram.ui;

import android.util.SparseIntArray;
import android.view.View;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes3.dex */
public final class fa1 extends s4.o {
    public int b;
    public final x91 c;
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

    public fa1(x91 x91Var, s4.c0 c0Var) {
        this.c = x91Var;
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
        x91 x91Var = this.c;
        if (i12 == 13 && x91Var.j(i11) == 13) {
            return true;
        }
        if (sparseIntArray.get(i10) == 10 && x91Var.j(i11) == 10) {
            return true;
        }
        int i13 = this.x;
        if (i10 >= i13 && i10 <= this.y) {
            return i10 - i13 == i11 - x91Var.I;
        }
        if (i10 == this.f && i11 == x91Var.e) {
            return true;
        }
        if (i10 == this.g && i11 == x91Var.h) {
            return true;
        }
        if (i10 == this.h && i11 == x91Var.r) {
            return true;
        }
        if (i10 == this.i && i11 == x91Var.s) {
            return true;
        }
        if (i10 == this.j && i11 == x91Var.v) {
            return true;
        }
        if (i10 == this.k && i11 == x91Var.w) {
            return true;
        }
        if (i10 == this.l && i11 == x91Var.x) {
            return true;
        }
        if (i10 == this.m && i11 == x91Var.n) {
            return true;
        }
        if (i10 == this.n && i11 == x91Var.y) {
            return true;
        }
        if (i10 == this.r && i11 == x91Var.K) {
            return true;
        }
        if (i10 == this.s && i11 == x91Var.L) {
            return true;
        }
        if (i10 == this.t && i11 == x91Var.M) {
            return true;
        }
        if (i10 == this.u && i11 == x91Var.N) {
            return true;
        }
        if (i10 == this.v && i11 == x91Var.O) {
            return true;
        }
        if (i10 == this.w && i11 == x91Var.P) {
            return true;
        }
        if (i10 == this.o && i11 == x91Var.E) {
            return true;
        }
        if (i10 == this.p && i11 == x91Var.F) {
            return true;
        }
        return i10 == this.q && i11 == x91Var.G;
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
        x91 x91Var = this.c;
        this.b = x91Var.c0;
        int i11 = 0;
        for (int i12 = 0; i12 < this.b; i12++) {
            sparseIntArray.put(i12, x91Var.j(i12));
        }
        this.f = x91Var.e;
        this.g = x91Var.h;
        this.h = x91Var.r;
        this.i = x91Var.s;
        this.j = x91Var.v;
        this.k = x91Var.w;
        this.l = x91Var.x;
        this.m = x91Var.n;
        this.n = x91Var.y;
        this.x = x91Var.I;
        this.y = x91Var.J;
        this.o = x91Var.E;
        this.p = x91Var.F;
        this.q = x91Var.G;
        this.r = x91Var.K;
        this.s = x91Var.L;
        this.t = x91Var.M;
        this.u = x91Var.N;
        this.v = x91Var.O;
        this.w = x91Var.P;
        x91Var.E();
        s4.c0 c0Var = this.d;
        int L0 = c0Var.L0();
        int N0 = c0Var.N0();
        while (true) {
            if (L0 > N0) {
                j3 = -1;
                i10 = 0;
                break;
            } else {
                if (x91Var.i(L0) != -1 && (m10 = c0Var.m(L0)) != null) {
                    j3 = x91Var.i(L0);
                    i10 = m10.getTop();
                    break;
                }
                L0++;
            }
        }
        s4.o.c(this, true).b(x91Var);
        if (j3 != -1) {
            while (true) {
                if (i11 >= x91Var.c0) {
                    i11 = -1;
                    break;
                } else if (x91Var.i(i11) == j3) {
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
