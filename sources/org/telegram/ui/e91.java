package org.telegram.ui;

import android.util.SparseIntArray;
import android.view.View;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final class e91 extends s4.o {
    public int b;
    public final w81 c;
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

    public e91(w81 w81Var, s4.b0 b0Var) {
        this.c = w81Var;
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
        w81 w81Var = this.c;
        if (i12 == 13 && w81Var.j(i11) == 13) {
            return true;
        }
        if (sparseIntArray.get(i10) == 10 && w81Var.j(i11) == 10) {
            return true;
        }
        int i13 = this.x;
        if (i10 >= i13 && i10 <= this.y) {
            return i10 - i13 == i11 - w81Var.I;
        }
        if (i10 == this.f && i11 == w81Var.e) {
            return true;
        }
        if (i10 == this.g && i11 == w81Var.h) {
            return true;
        }
        if (i10 == this.h && i11 == w81Var.r) {
            return true;
        }
        if (i10 == this.i && i11 == w81Var.s) {
            return true;
        }
        if (i10 == this.j && i11 == w81Var.v) {
            return true;
        }
        if (i10 == this.k && i11 == w81Var.w) {
            return true;
        }
        if (i10 == this.l && i11 == w81Var.x) {
            return true;
        }
        if (i10 == this.m && i11 == w81Var.n) {
            return true;
        }
        if (i10 == this.n && i11 == w81Var.y) {
            return true;
        }
        if (i10 == this.r && i11 == w81Var.K) {
            return true;
        }
        if (i10 == this.s && i11 == w81Var.L) {
            return true;
        }
        if (i10 == this.t && i11 == w81Var.M) {
            return true;
        }
        if (i10 == this.u && i11 == w81Var.N) {
            return true;
        }
        if (i10 == this.v && i11 == w81Var.O) {
            return true;
        }
        if (i10 == this.w && i11 == w81Var.P) {
            return true;
        }
        if (i10 == this.o && i11 == w81Var.E) {
            return true;
        }
        if (i10 == this.p && i11 == w81Var.F) {
            return true;
        }
        return i10 == this.q && i11 == w81Var.G;
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
        w81 w81Var = this.c;
        this.b = w81Var.c0;
        int i11 = 0;
        for (int i12 = 0; i12 < this.b; i12++) {
            sparseIntArray.put(i12, w81Var.j(i12));
        }
        this.f = w81Var.e;
        this.g = w81Var.h;
        this.h = w81Var.r;
        this.i = w81Var.s;
        this.j = w81Var.v;
        this.k = w81Var.w;
        this.l = w81Var.x;
        this.m = w81Var.n;
        this.n = w81Var.y;
        this.x = w81Var.I;
        this.y = w81Var.J;
        this.o = w81Var.E;
        this.p = w81Var.F;
        this.q = w81Var.G;
        this.r = w81Var.K;
        this.s = w81Var.L;
        this.t = w81Var.M;
        this.u = w81Var.N;
        this.v = w81Var.O;
        this.w = w81Var.P;
        w81Var.E();
        s4.b0 b0Var = this.d;
        int L0 = b0Var.L0();
        int N0 = b0Var.N0();
        while (true) {
            if (L0 > N0) {
                i10 = 0;
                j10 = -1;
                break;
            } else {
                if (w81Var.i(L0) != -1 && (m10 = b0Var.m(L0)) != null) {
                    j10 = w81Var.i(L0);
                    i10 = m10.getTop();
                    break;
                }
                L0++;
            }
        }
        s4.o.c(this, true).c(w81Var);
        if (j10 != -1) {
            while (true) {
                if (i11 >= w81Var.c0) {
                    i11 = -1;
                    break;
                } else if (w81Var.i(i11) == j10) {
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
