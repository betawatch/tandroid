package org.telegram.ui;

import android.util.SparseIntArray;
import android.view.View;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class ba1 extends f2.q {
    public int b;
    public final t91 c;
    public final f2.i0 d;
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

    public ba1(t91 t91Var, f2.i0 i0Var) {
        this.c = t91Var;
        this.d = i0Var;
    }

    @Override // f2.q
    public final boolean a(int i10, int i11) {
        return this.e.get(i10) == this.c.j(i11);
    }

    @Override // f2.q
    public final boolean b(int i10, int i11) {
        SparseIntArray sparseIntArray = this.e;
        int i12 = sparseIntArray.get(i10);
        t91 t91Var = this.c;
        if (i12 == 13 && t91Var.j(i11) == 13) {
            return true;
        }
        if (sparseIntArray.get(i10) == 10 && t91Var.j(i11) == 10) {
            return true;
        }
        int i13 = this.x;
        if (i10 >= i13 && i10 <= this.y) {
            return i10 - i13 == i11 - t91Var.F;
        }
        if (i10 == this.f && i11 == t91Var.e) {
            return true;
        }
        if (i10 == this.g && i11 == t91Var.h) {
            return true;
        }
        if (i10 == this.h && i11 == t91Var.r) {
            return true;
        }
        if (i10 == this.i && i11 == t91Var.s) {
            return true;
        }
        if (i10 == this.j && i11 == t91Var.v) {
            return true;
        }
        if (i10 == this.k && i11 == t91Var.w) {
            return true;
        }
        if (i10 == this.l && i11 == t91Var.x) {
            return true;
        }
        if (i10 == this.m && i11 == t91Var.n) {
            return true;
        }
        if (i10 == this.n && i11 == t91Var.y) {
            return true;
        }
        if (i10 == this.r && i11 == t91Var.H) {
            return true;
        }
        if (i10 == this.s && i11 == t91Var.I) {
            return true;
        }
        if (i10 == this.t && i11 == t91Var.J) {
            return true;
        }
        if (i10 == this.u && i11 == t91Var.K) {
            return true;
        }
        if (i10 == this.v && i11 == t91Var.L) {
            return true;
        }
        if (i10 == this.w && i11 == t91Var.M) {
            return true;
        }
        if (i10 == this.o && i11 == t91Var.B) {
            return true;
        }
        if (i10 == this.p && i11 == t91Var.C) {
            return true;
        }
        return i10 == this.q && i11 == t91Var.D;
    }

    @Override // f2.q
    public final int d() {
        return this.c.Z;
    }

    @Override // f2.q
    public final int e() {
        return this.b;
    }

    public final void f() {
        long j10;
        int i10;
        View m9;
        SparseIntArray sparseIntArray = this.e;
        sparseIntArray.clear();
        t91 t91Var = this.c;
        this.b = t91Var.Z;
        int i11 = 0;
        for (int i12 = 0; i12 < this.b; i12++) {
            sparseIntArray.put(i12, t91Var.j(i12));
        }
        this.f = t91Var.e;
        this.g = t91Var.h;
        this.h = t91Var.r;
        this.i = t91Var.s;
        this.j = t91Var.v;
        this.k = t91Var.w;
        this.l = t91Var.x;
        this.m = t91Var.n;
        this.n = t91Var.y;
        this.x = t91Var.F;
        this.y = t91Var.G;
        this.o = t91Var.B;
        this.p = t91Var.C;
        this.q = t91Var.D;
        this.r = t91Var.H;
        this.s = t91Var.I;
        this.t = t91Var.J;
        this.u = t91Var.K;
        this.v = t91Var.L;
        this.w = t91Var.M;
        t91Var.E();
        f2.i0 i0Var = this.d;
        int L0 = i0Var.L0();
        int N0 = i0Var.N0();
        while (true) {
            if (L0 > N0) {
                j10 = -1;
                i10 = 0;
                break;
            } else {
                if (t91Var.i(L0) != -1 && (m9 = i0Var.m(L0)) != null) {
                    j10 = t91Var.i(L0);
                    i10 = m9.getTop();
                    break;
                }
                L0++;
            }
        }
        f2.q.c(this, true).b(t91Var);
        if (j10 != -1) {
            while (true) {
                if (i11 >= t91Var.Z) {
                    i11 = -1;
                    break;
                } else if (t91Var.i(i11) == j10) {
                    break;
                } else {
                    i11++;
                }
            }
            if (i11 > 0) {
                i0Var.h1(i11, i10);
            }
        }
    }
}
