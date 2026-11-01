package org.telegram.ui;

import android.util.SparseIntArray;
import android.view.View;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class f61 extends s4.n {
    public int b;
    public final x51 c;
    public final s4.a0 d;
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

    public f61(x51 x51Var, s4.a0 a0Var) {
        this.c = x51Var;
        this.d = a0Var;
    }

    @Override // s4.n
    public final boolean a(int i10, int i11) {
        return this.e.get(i10) == this.c.d(i11);
    }

    @Override // s4.n
    public final boolean b(int i10, int i11) {
        SparseIntArray sparseIntArray = this.e;
        int i12 = sparseIntArray.get(i10);
        x51 x51Var = this.c;
        if (i12 == 13 && x51Var.d(i11) == 13) {
            return true;
        }
        if (sparseIntArray.get(i10) == 10 && x51Var.d(i11) == 10) {
            return true;
        }
        int i13 = this.x;
        if (i10 >= i13 && i10 <= this.y) {
            return i10 - i13 == i11 - x51Var.I;
        }
        if (i10 == this.f && i11 == x51Var.e) {
            return true;
        }
        if (i10 == this.g && i11 == x51Var.h) {
            return true;
        }
        if (i10 == this.h && i11 == x51Var.r) {
            return true;
        }
        if (i10 == this.i && i11 == x51Var.s) {
            return true;
        }
        if (i10 == this.j && i11 == x51Var.w) {
            return true;
        }
        if (i10 == this.k && i11 == x51Var.x) {
            return true;
        }
        if (i10 == this.l && i11 == x51Var.y) {
            return true;
        }
        if (i10 == this.m && i11 == x51Var.n) {
            return true;
        }
        if (i10 == this.n && i11 == x51Var.D) {
            return true;
        }
        if (i10 == this.r && i11 == x51Var.K) {
            return true;
        }
        if (i10 == this.s && i11 == x51Var.L) {
            return true;
        }
        if (i10 == this.t && i11 == x51Var.M) {
            return true;
        }
        if (i10 == this.u && i11 == x51Var.N) {
            return true;
        }
        if (i10 == this.v && i11 == x51Var.O) {
            return true;
        }
        if (i10 == this.w && i11 == x51Var.P) {
            return true;
        }
        if (i10 == this.o && i11 == x51Var.E) {
            return true;
        }
        if (i10 == this.p && i11 == x51Var.F) {
            return true;
        }
        return i10 == this.q && i11 == x51Var.G;
    }

    @Override // s4.n
    public final int d() {
        return this.c.c0;
    }

    @Override // s4.n
    public final int e() {
        return this.b;
    }

    public final void f() {
        int i10;
        long j10;
        View m10;
        SparseIntArray sparseIntArray = this.e;
        sparseIntArray.clear();
        x51 x51Var = this.c;
        this.b = x51Var.c0;
        int i11 = 0;
        for (int i12 = 0; i12 < this.b; i12++) {
            sparseIntArray.put(i12, x51Var.d(i12));
        }
        this.f = x51Var.e;
        this.g = x51Var.h;
        this.h = x51Var.r;
        this.i = x51Var.s;
        this.j = x51Var.w;
        this.k = x51Var.x;
        this.l = x51Var.y;
        this.m = x51Var.n;
        this.n = x51Var.D;
        this.x = x51Var.I;
        this.y = x51Var.J;
        this.o = x51Var.E;
        this.p = x51Var.F;
        this.q = x51Var.G;
        this.r = x51Var.K;
        this.s = x51Var.L;
        this.t = x51Var.M;
        this.u = x51Var.N;
        this.v = x51Var.O;
        this.w = x51Var.P;
        x51Var.E();
        s4.a0 a0Var = this.d;
        int L0 = a0Var.L0();
        int N0 = a0Var.N0();
        while (true) {
            if (L0 > N0) {
                i10 = 0;
                j10 = -1;
                break;
            } else {
                if (x51Var.c(L0) != -1 && (m10 = a0Var.m(L0)) != null) {
                    j10 = x51Var.c(L0);
                    i10 = m10.getTop();
                    break;
                }
                L0++;
            }
        }
        s4.n.c(this, true).c(x51Var);
        if (j10 != -1) {
            while (true) {
                if (i11 >= x51Var.c0) {
                    i11 = -1;
                    break;
                } else if (x51Var.c(i11) == j10) {
                    break;
                } else {
                    i11++;
                }
            }
            if (i11 > 0) {
                a0Var.h1(i11, i10);
            }
        }
    }
}
