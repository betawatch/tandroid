package org.telegram.ui;

import android.util.SparseIntArray;
import android.view.View;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class g91 extends f2.q {
    public int b;
    public final y81 c;
    public final f2.j0 d;
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

    public g91(y81 y81Var, f2.j0 j0Var) {
        this.c = y81Var;
        this.d = j0Var;
    }

    @Override // f2.q
    public final boolean a(int i10, int i11) {
        return this.e.get(i10) == this.c.j(i11);
    }

    @Override // f2.q
    public final boolean b(int i10, int i11) {
        SparseIntArray sparseIntArray = this.e;
        int i12 = sparseIntArray.get(i10);
        y81 y81Var = this.c;
        if (i12 == 13 && y81Var.j(i11) == 13) {
            return true;
        }
        if (sparseIntArray.get(i10) == 10 && y81Var.j(i11) == 10) {
            return true;
        }
        int i13 = this.x;
        if (i10 >= i13 && i10 <= this.y) {
            return i10 - i13 == i11 - y81Var.E;
        }
        if (i10 == this.f && i11 == y81Var.e) {
            return true;
        }
        if (i10 == this.g && i11 == y81Var.h) {
            return true;
        }
        if (i10 == this.h && i11 == y81Var.r) {
            return true;
        }
        if (i10 == this.i && i11 == y81Var.s) {
            return true;
        }
        if (i10 == this.j && i11 == y81Var.v) {
            return true;
        }
        if (i10 == this.k && i11 == y81Var.w) {
            return true;
        }
        if (i10 == this.l && i11 == y81Var.x) {
            return true;
        }
        if (i10 == this.m && i11 == y81Var.n) {
            return true;
        }
        if (i10 == this.n && i11 == y81Var.y) {
            return true;
        }
        if (i10 == this.r && i11 == y81Var.G) {
            return true;
        }
        if (i10 == this.s && i11 == y81Var.H) {
            return true;
        }
        if (i10 == this.t && i11 == y81Var.I) {
            return true;
        }
        if (i10 == this.u && i11 == y81Var.J) {
            return true;
        }
        if (i10 == this.v && i11 == y81Var.K) {
            return true;
        }
        if (i10 == this.w && i11 == y81Var.L) {
            return true;
        }
        if (i10 == this.o && i11 == y81Var.A) {
            return true;
        }
        if (i10 == this.p && i11 == y81Var.B) {
            return true;
        }
        return i10 == this.q && i11 == y81Var.C;
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
        y81 y81Var = this.c;
        this.b = y81Var.Y;
        int i11 = 0;
        for (int i12 = 0; i12 < this.b; i12++) {
            sparseIntArray.put(i12, y81Var.j(i12));
        }
        this.f = y81Var.e;
        this.g = y81Var.h;
        this.h = y81Var.r;
        this.i = y81Var.s;
        this.j = y81Var.v;
        this.k = y81Var.w;
        this.l = y81Var.x;
        this.m = y81Var.n;
        this.n = y81Var.y;
        this.x = y81Var.E;
        this.y = y81Var.F;
        this.o = y81Var.A;
        this.p = y81Var.B;
        this.q = y81Var.C;
        this.r = y81Var.G;
        this.s = y81Var.H;
        this.t = y81Var.I;
        this.u = y81Var.J;
        this.v = y81Var.K;
        this.w = y81Var.L;
        y81Var.E();
        f2.j0 j0Var = this.d;
        int L0 = j0Var.L0();
        int N0 = j0Var.N0();
        while (true) {
            if (L0 > N0) {
                j10 = -1;
                i10 = 0;
                break;
            } else {
                if (y81Var.i(L0) != -1 && (m10 = j0Var.m(L0)) != null) {
                    j10 = y81Var.i(L0);
                    i10 = m10.getTop();
                    break;
                }
                L0++;
            }
        }
        f2.q.c(this, true).b(y81Var);
        if (j10 != -1) {
            while (true) {
                if (i11 >= y81Var.Y) {
                    i11 = -1;
                    break;
                } else if (y81Var.i(i11) == j10) {
                    break;
                } else {
                    i11++;
                }
            }
            if (i11 > 0) {
                j0Var.h1(i11, i10);
            }
        }
    }
}
