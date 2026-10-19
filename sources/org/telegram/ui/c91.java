package org.telegram.ui;

import android.util.SparseIntArray;
import android.view.View;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class c91 extends s4.o {
    public int b;
    public final u81 c;
    public final s4.b0 d;
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

    public c91(u81 u81Var, s4.b0 b0Var) {
        this.c = u81Var;
        this.d = b0Var;
    }

    @Override // s4.o
    public final boolean a(int i10, int i11) {
        return this.e.get(i10) == this.c.j(i11);
    }

    @Override // s4.o
    public final boolean b(int i10, int i11) {
        SparseIntArray sparseIntArray = this.e;
        int i12 = sparseIntArray.get(i10);
        u81 u81Var = this.c;
        if (i12 == 13 && u81Var.j(i11) == 13) {
            return true;
        }
        if (sparseIntArray.get(i10) == 10 && u81Var.j(i11) == 10) {
            return true;
        }
        int i13 = this.x;
        if (i10 >= i13 && i10 <= this.y) {
            return i10 - i13 == i11 - u81Var.I;
        }
        if (i10 == this.f && i11 == u81Var.e) {
            return true;
        }
        if (i10 == this.g && i11 == u81Var.h) {
            return true;
        }
        if (i10 == this.h && i11 == u81Var.r) {
            return true;
        }
        if (i10 == this.i && i11 == u81Var.s) {
            return true;
        }
        if (i10 == this.j && i11 == u81Var.v) {
            return true;
        }
        if (i10 == this.k && i11 == u81Var.w) {
            return true;
        }
        if (i10 == this.l && i11 == u81Var.x) {
            return true;
        }
        if (i10 == this.m && i11 == u81Var.n) {
            return true;
        }
        if (i10 == this.n && i11 == u81Var.y) {
            return true;
        }
        if (i10 == this.r && i11 == u81Var.K) {
            return true;
        }
        if (i10 == this.s && i11 == u81Var.L) {
            return true;
        }
        if (i10 == this.t && i11 == u81Var.M) {
            return true;
        }
        if (i10 == this.u && i11 == u81Var.N) {
            return true;
        }
        if (i10 == this.v && i11 == u81Var.O) {
            return true;
        }
        if (i10 == this.w && i11 == u81Var.P) {
            return true;
        }
        if (i10 == this.o && i11 == u81Var.E) {
            return true;
        }
        if (i10 == this.p && i11 == u81Var.F) {
            return true;
        }
        return i10 == this.q && i11 == u81Var.G;
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
        int i10;
        long j10;
        View m10;
        SparseIntArray sparseIntArray = this.e;
        sparseIntArray.clear();
        u81 u81Var = this.c;
        this.b = u81Var.c0;
        int i11 = 0;
        for (int i12 = 0; i12 < this.b; i12++) {
            sparseIntArray.put(i12, u81Var.j(i12));
        }
        this.f = u81Var.e;
        this.g = u81Var.h;
        this.h = u81Var.r;
        this.i = u81Var.s;
        this.j = u81Var.v;
        this.k = u81Var.w;
        this.l = u81Var.x;
        this.m = u81Var.n;
        this.n = u81Var.y;
        this.x = u81Var.I;
        this.y = u81Var.J;
        this.o = u81Var.E;
        this.p = u81Var.F;
        this.q = u81Var.G;
        this.r = u81Var.K;
        this.s = u81Var.L;
        this.t = u81Var.M;
        this.u = u81Var.N;
        this.v = u81Var.O;
        this.w = u81Var.P;
        u81Var.E();
        s4.b0 b0Var = this.d;
        int L0 = b0Var.L0();
        int N0 = b0Var.N0();
        while (true) {
            if (L0 > N0) {
                i10 = 0;
                j10 = -1;
                break;
            } else {
                if (u81Var.i(L0) != -1 && (m10 = b0Var.m(L0)) != null) {
                    j10 = u81Var.i(L0);
                    i10 = m10.getTop();
                    break;
                }
                L0++;
            }
        }
        s4.o.c(this, true).c(u81Var);
        if (j10 != -1) {
            while (true) {
                if (i11 >= u81Var.c0) {
                    i11 = -1;
                    break;
                } else if (u81Var.i(i11) == j10) {
                    break;
                } else {
                    i11++;
                }
            }
            if (i11 > 0) {
                b0Var.h1(i11, i10);
            }
        }
    }
}
