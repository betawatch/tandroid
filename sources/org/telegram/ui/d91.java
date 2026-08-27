package org.telegram.ui;

import android.util.SparseIntArray;
import android.view.View;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class d91 extends f2.q {
    public int b;
    public final v81 c;
    public final f2.k0 d;
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

    public d91(v81 v81Var, f2.k0 k0Var) {
        this.c = v81Var;
        this.d = k0Var;
    }

    @Override // f2.q
    public final boolean a(int i10, int i11) {
        return this.e.get(i10) == this.c.j(i11);
    }

    @Override // f2.q
    public final boolean b(int i10, int i11) {
        SparseIntArray sparseIntArray = this.e;
        int i12 = sparseIntArray.get(i10);
        v81 v81Var = this.c;
        if (i12 == 13 && v81Var.j(i11) == 13) {
            return true;
        }
        if (sparseIntArray.get(i10) == 10 && v81Var.j(i11) == 10) {
            return true;
        }
        int i13 = this.x;
        if (i10 >= i13 && i10 <= this.y) {
            return i10 - i13 == i11 - v81Var.E;
        }
        if (i10 == this.f && i11 == v81Var.e) {
            return true;
        }
        if (i10 == this.g && i11 == v81Var.h) {
            return true;
        }
        if (i10 == this.h && i11 == v81Var.r) {
            return true;
        }
        if (i10 == this.i && i11 == v81Var.s) {
            return true;
        }
        if (i10 == this.j && i11 == v81Var.v) {
            return true;
        }
        if (i10 == this.k && i11 == v81Var.w) {
            return true;
        }
        if (i10 == this.l && i11 == v81Var.x) {
            return true;
        }
        if (i10 == this.m && i11 == v81Var.n) {
            return true;
        }
        if (i10 == this.n && i11 == v81Var.y) {
            return true;
        }
        if (i10 == this.r && i11 == v81Var.G) {
            return true;
        }
        if (i10 == this.s && i11 == v81Var.H) {
            return true;
        }
        if (i10 == this.t && i11 == v81Var.I) {
            return true;
        }
        if (i10 == this.u && i11 == v81Var.J) {
            return true;
        }
        if (i10 == this.v && i11 == v81Var.K) {
            return true;
        }
        if (i10 == this.w && i11 == v81Var.L) {
            return true;
        }
        if (i10 == this.o && i11 == v81Var.A) {
            return true;
        }
        if (i10 == this.p && i11 == v81Var.B) {
            return true;
        }
        return i10 == this.q && i11 == v81Var.C;
    }

    @Override // f2.q
    public final int d() {
        return this.c.Y;
    }

    @Override // f2.q
    public final int e() {
        return this.b;
    }

    public final void f() {
        long j10;
        int i10;
        View m10;
        SparseIntArray sparseIntArray = this.e;
        sparseIntArray.clear();
        v81 v81Var = this.c;
        this.b = v81Var.Y;
        int i11 = 0;
        for (int i12 = 0; i12 < this.b; i12++) {
            sparseIntArray.put(i12, v81Var.j(i12));
        }
        this.f = v81Var.e;
        this.g = v81Var.h;
        this.h = v81Var.r;
        this.i = v81Var.s;
        this.j = v81Var.v;
        this.k = v81Var.w;
        this.l = v81Var.x;
        this.m = v81Var.n;
        this.n = v81Var.y;
        this.x = v81Var.E;
        this.y = v81Var.F;
        this.o = v81Var.A;
        this.p = v81Var.B;
        this.q = v81Var.C;
        this.r = v81Var.G;
        this.s = v81Var.H;
        this.t = v81Var.I;
        this.u = v81Var.J;
        this.v = v81Var.K;
        this.w = v81Var.L;
        v81Var.E();
        f2.k0 k0Var = this.d;
        int L0 = k0Var.L0();
        int N0 = k0Var.N0();
        while (true) {
            if (L0 > N0) {
                j10 = -1;
                i10 = 0;
                break;
            } else {
                if (v81Var.i(L0) != -1 && (m10 = k0Var.m(L0)) != null) {
                    j10 = v81Var.i(L0);
                    i10 = m10.getTop();
                    break;
                }
                L0++;
            }
        }
        f2.q.c(this, true).b(v81Var);
        if (j10 != -1) {
            while (true) {
                if (i11 >= v81Var.Y) {
                    i11 = -1;
                    break;
                } else if (v81Var.i(i11) == j10) {
                    break;
                } else {
                    i11++;
                }
            }
            if (i11 > 0) {
                k0Var.h1(i11, i10);
            }
        }
    }
}
