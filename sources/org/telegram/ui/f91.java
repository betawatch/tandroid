package org.telegram.ui;

import android.util.SparseIntArray;
import android.view.View;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class f91 extends f2.s {
    public int b;
    public final x81 c;
    public final f2.m0 d;
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

    public f91(x81 x81Var, f2.m0 m0Var) {
        this.c = x81Var;
        this.d = m0Var;
    }

    @Override // f2.s
    public final boolean a(int i9, int i10) {
        return this.e.get(i9) == this.c.j(i10);
    }

    @Override // f2.s
    public final boolean b(int i9, int i10) {
        SparseIntArray sparseIntArray = this.e;
        int i11 = sparseIntArray.get(i9);
        x81 x81Var = this.c;
        if (i11 == 13 && x81Var.j(i10) == 13) {
            return true;
        }
        if (sparseIntArray.get(i9) == 10 && x81Var.j(i10) == 10) {
            return true;
        }
        int i12 = this.x;
        if (i9 >= i12 && i9 <= this.y) {
            return i9 - i12 == i10 - x81Var.E;
        }
        if (i9 == this.f && i10 == x81Var.e) {
            return true;
        }
        if (i9 == this.g && i10 == x81Var.h) {
            return true;
        }
        if (i9 == this.h && i10 == x81Var.r) {
            return true;
        }
        if (i9 == this.i && i10 == x81Var.s) {
            return true;
        }
        if (i9 == this.j && i10 == x81Var.v) {
            return true;
        }
        if (i9 == this.k && i10 == x81Var.w) {
            return true;
        }
        if (i9 == this.l && i10 == x81Var.x) {
            return true;
        }
        if (i9 == this.m && i10 == x81Var.n) {
            return true;
        }
        if (i9 == this.n && i10 == x81Var.y) {
            return true;
        }
        if (i9 == this.r && i10 == x81Var.G) {
            return true;
        }
        if (i9 == this.s && i10 == x81Var.H) {
            return true;
        }
        if (i9 == this.t && i10 == x81Var.I) {
            return true;
        }
        if (i9 == this.u && i10 == x81Var.J) {
            return true;
        }
        if (i9 == this.v && i10 == x81Var.K) {
            return true;
        }
        if (i9 == this.w && i10 == x81Var.L) {
            return true;
        }
        if (i9 == this.o && i10 == x81Var.A) {
            return true;
        }
        if (i9 == this.p && i10 == x81Var.B) {
            return true;
        }
        return i9 == this.q && i10 == x81Var.C;
    }

    @Override // f2.s
    public final int d() {
        return this.c.Y;
    }

    @Override // f2.s
    public final int e() {
        return this.b;
    }

    public final void f() {
        long j10;
        int i9;
        View m10;
        SparseIntArray sparseIntArray = this.e;
        sparseIntArray.clear();
        x81 x81Var = this.c;
        this.b = x81Var.Y;
        int i10 = 0;
        for (int i11 = 0; i11 < this.b; i11++) {
            sparseIntArray.put(i11, x81Var.j(i11));
        }
        this.f = x81Var.e;
        this.g = x81Var.h;
        this.h = x81Var.r;
        this.i = x81Var.s;
        this.j = x81Var.v;
        this.k = x81Var.w;
        this.l = x81Var.x;
        this.m = x81Var.n;
        this.n = x81Var.y;
        this.x = x81Var.E;
        this.y = x81Var.F;
        this.o = x81Var.A;
        this.p = x81Var.B;
        this.q = x81Var.C;
        this.r = x81Var.G;
        this.s = x81Var.H;
        this.t = x81Var.I;
        this.u = x81Var.J;
        this.v = x81Var.K;
        this.w = x81Var.L;
        x81Var.E();
        f2.m0 m0Var = this.d;
        int L0 = m0Var.L0();
        int N0 = m0Var.N0();
        while (true) {
            if (L0 > N0) {
                j10 = -1;
                i9 = 0;
                break;
            } else {
                if (x81Var.i(L0) != -1 && (m10 = m0Var.m(L0)) != null) {
                    j10 = x81Var.i(L0);
                    i9 = m10.getTop();
                    break;
                }
                L0++;
            }
        }
        f2.s.c(this, true).b(x81Var);
        if (j10 != -1) {
            while (true) {
                if (i10 >= x81Var.Y) {
                    i10 = -1;
                    break;
                } else if (x81Var.i(i10) == j10) {
                    break;
                } else {
                    i10++;
                }
            }
            if (i10 > 0) {
                m0Var.h1(i10, i9);
            }
        }
    }
}
