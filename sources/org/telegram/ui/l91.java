package org.telegram.ui;

import android.util.SparseIntArray;
import android.view.View;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class l91 extends s4.p {
    public int b;
    public final d91 c;
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

    public l91(d91 d91Var, s4.c0 c0Var) {
        this.c = d91Var;
        this.d = c0Var;
    }

    @Override // s4.p
    public final boolean a(int i10, int i11) {
        return this.e.get(i10) == this.c.j(i11);
    }

    @Override // s4.p
    public final boolean b(int i10, int i11) {
        SparseIntArray sparseIntArray = this.e;
        int i12 = sparseIntArray.get(i10);
        d91 d91Var = this.c;
        if (i12 == 13 && d91Var.j(i11) == 13) {
            return true;
        }
        if (sparseIntArray.get(i10) == 10 && d91Var.j(i11) == 10) {
            return true;
        }
        int i13 = this.x;
        if (i10 >= i13 && i10 <= this.y) {
            return i10 - i13 == i11 - d91Var.I;
        }
        if (i10 == this.f && i11 == d91Var.e) {
            return true;
        }
        if (i10 == this.g && i11 == d91Var.h) {
            return true;
        }
        if (i10 == this.h && i11 == d91Var.r) {
            return true;
        }
        if (i10 == this.i && i11 == d91Var.s) {
            return true;
        }
        if (i10 == this.j && i11 == d91Var.v) {
            return true;
        }
        if (i10 == this.k && i11 == d91Var.w) {
            return true;
        }
        if (i10 == this.l && i11 == d91Var.x) {
            return true;
        }
        if (i10 == this.m && i11 == d91Var.n) {
            return true;
        }
        if (i10 == this.n && i11 == d91Var.y) {
            return true;
        }
        if (i10 == this.r && i11 == d91Var.K) {
            return true;
        }
        if (i10 == this.s && i11 == d91Var.L) {
            return true;
        }
        if (i10 == this.t && i11 == d91Var.M) {
            return true;
        }
        if (i10 == this.u && i11 == d91Var.N) {
            return true;
        }
        if (i10 == this.v && i11 == d91Var.O) {
            return true;
        }
        if (i10 == this.w && i11 == d91Var.P) {
            return true;
        }
        if (i10 == this.o && i11 == d91Var.E) {
            return true;
        }
        if (i10 == this.p && i11 == d91Var.F) {
            return true;
        }
        return i10 == this.q && i11 == d91Var.G;
    }

    @Override // s4.p
    public final int d() {
        return this.c.c0;
    }

    @Override // s4.p
    public final int e() {
        return this.b;
    }

    public final void f() {
        int i10;
        long j10;
        View m10;
        SparseIntArray sparseIntArray = this.e;
        sparseIntArray.clear();
        d91 d91Var = this.c;
        this.b = d91Var.c0;
        int i11 = 0;
        for (int i12 = 0; i12 < this.b; i12++) {
            sparseIntArray.put(i12, d91Var.j(i12));
        }
        this.f = d91Var.e;
        this.g = d91Var.h;
        this.h = d91Var.r;
        this.i = d91Var.s;
        this.j = d91Var.v;
        this.k = d91Var.w;
        this.l = d91Var.x;
        this.m = d91Var.n;
        this.n = d91Var.y;
        this.x = d91Var.I;
        this.y = d91Var.J;
        this.o = d91Var.E;
        this.p = d91Var.F;
        this.q = d91Var.G;
        this.r = d91Var.K;
        this.s = d91Var.L;
        this.t = d91Var.M;
        this.u = d91Var.N;
        this.v = d91Var.O;
        this.w = d91Var.P;
        d91Var.E();
        s4.c0 c0Var = this.d;
        int L0 = c0Var.L0();
        int N0 = c0Var.N0();
        while (true) {
            if (L0 > N0) {
                i10 = 0;
                j10 = -1;
                break;
            } else {
                if (d91Var.i(L0) != -1 && (m10 = c0Var.m(L0)) != null) {
                    j10 = d91Var.i(L0);
                    i10 = m10.getTop();
                    break;
                }
                L0++;
            }
        }
        s4.p.c(this, true).c(d91Var);
        if (j10 != -1) {
            while (true) {
                if (i11 >= d91Var.c0) {
                    i11 = -1;
                    break;
                } else if (d91Var.i(i11) == j10) {
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
