package org.telegram.ui;

import android.util.SparseIntArray;
import android.view.View;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes3.dex */
public final class ga1 extends s4.o {
    public int b;
    public final y91 c;
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

    public ga1(y91 y91Var, s4.c0 c0Var) {
        this.c = y91Var;
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
        y91 y91Var = this.c;
        if (i12 == 13 && y91Var.j(i11) == 13) {
            return true;
        }
        if (sparseIntArray.get(i10) == 10 && y91Var.j(i11) == 10) {
            return true;
        }
        int i13 = this.x;
        if (i10 >= i13 && i10 <= this.y) {
            return i10 - i13 == i11 - y91Var.I;
        }
        if (i10 == this.f && i11 == y91Var.e) {
            return true;
        }
        if (i10 == this.g && i11 == y91Var.h) {
            return true;
        }
        if (i10 == this.h && i11 == y91Var.r) {
            return true;
        }
        if (i10 == this.i && i11 == y91Var.s) {
            return true;
        }
        if (i10 == this.j && i11 == y91Var.v) {
            return true;
        }
        if (i10 == this.k && i11 == y91Var.w) {
            return true;
        }
        if (i10 == this.l && i11 == y91Var.x) {
            return true;
        }
        if (i10 == this.m && i11 == y91Var.n) {
            return true;
        }
        if (i10 == this.n && i11 == y91Var.y) {
            return true;
        }
        if (i10 == this.r && i11 == y91Var.K) {
            return true;
        }
        if (i10 == this.s && i11 == y91Var.L) {
            return true;
        }
        if (i10 == this.t && i11 == y91Var.M) {
            return true;
        }
        if (i10 == this.u && i11 == y91Var.N) {
            return true;
        }
        if (i10 == this.v && i11 == y91Var.O) {
            return true;
        }
        if (i10 == this.w && i11 == y91Var.P) {
            return true;
        }
        if (i10 == this.o && i11 == y91Var.E) {
            return true;
        }
        if (i10 == this.p && i11 == y91Var.F) {
            return true;
        }
        return i10 == this.q && i11 == y91Var.G;
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
        y91 y91Var = this.c;
        this.b = y91Var.c0;
        int i11 = 0;
        for (int i12 = 0; i12 < this.b; i12++) {
            sparseIntArray.put(i12, y91Var.j(i12));
        }
        this.f = y91Var.e;
        this.g = y91Var.h;
        this.h = y91Var.r;
        this.i = y91Var.s;
        this.j = y91Var.v;
        this.k = y91Var.w;
        this.l = y91Var.x;
        this.m = y91Var.n;
        this.n = y91Var.y;
        this.x = y91Var.I;
        this.y = y91Var.J;
        this.o = y91Var.E;
        this.p = y91Var.F;
        this.q = y91Var.G;
        this.r = y91Var.K;
        this.s = y91Var.L;
        this.t = y91Var.M;
        this.u = y91Var.N;
        this.v = y91Var.O;
        this.w = y91Var.P;
        y91Var.E();
        s4.c0 c0Var = this.d;
        int L0 = c0Var.L0();
        int N0 = c0Var.N0();
        while (true) {
            if (L0 > N0) {
                j3 = -1;
                i10 = 0;
                break;
            } else {
                if (y91Var.i(L0) != -1 && (m10 = c0Var.m(L0)) != null) {
                    j3 = y91Var.i(L0);
                    i10 = m10.getTop();
                    break;
                }
                L0++;
            }
        }
        s4.o.c(this, true).b(y91Var);
        if (j3 != -1) {
            while (true) {
                if (i11 >= y91Var.c0) {
                    i11 = -1;
                    break;
                } else if (y91Var.i(i11) == j3) {
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
