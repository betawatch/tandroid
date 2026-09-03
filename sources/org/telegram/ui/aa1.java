package org.telegram.ui;

import android.util.SparseIntArray;
import android.view.View;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class aa1 extends f2.q {
    public int b;
    public final s91 c;
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

    public aa1(s91 s91Var, f2.j0 j0Var) {
        this.c = s91Var;
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
        s91 s91Var = this.c;
        if (i12 == 13 && s91Var.j(i11) == 13) {
            return true;
        }
        if (sparseIntArray.get(i10) == 10 && s91Var.j(i11) == 10) {
            return true;
        }
        int i13 = this.x;
        if (i10 >= i13 && i10 <= this.y) {
            return i10 - i13 == i11 - s91Var.F;
        }
        if (i10 == this.f && i11 == s91Var.e) {
            return true;
        }
        if (i10 == this.g && i11 == s91Var.h) {
            return true;
        }
        if (i10 == this.h && i11 == s91Var.r) {
            return true;
        }
        if (i10 == this.i && i11 == s91Var.s) {
            return true;
        }
        if (i10 == this.j && i11 == s91Var.v) {
            return true;
        }
        if (i10 == this.k && i11 == s91Var.w) {
            return true;
        }
        if (i10 == this.l && i11 == s91Var.x) {
            return true;
        }
        if (i10 == this.m && i11 == s91Var.n) {
            return true;
        }
        if (i10 == this.n && i11 == s91Var.y) {
            return true;
        }
        if (i10 == this.r && i11 == s91Var.H) {
            return true;
        }
        if (i10 == this.s && i11 == s91Var.I) {
            return true;
        }
        if (i10 == this.t && i11 == s91Var.J) {
            return true;
        }
        if (i10 == this.u && i11 == s91Var.K) {
            return true;
        }
        if (i10 == this.v && i11 == s91Var.L) {
            return true;
        }
        if (i10 == this.w && i11 == s91Var.M) {
            return true;
        }
        if (i10 == this.o && i11 == s91Var.B) {
            return true;
        }
        if (i10 == this.p && i11 == s91Var.C) {
            return true;
        }
        return i10 == this.q && i11 == s91Var.D;
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
        s91 s91Var = this.c;
        this.b = s91Var.Z;
        int i11 = 0;
        for (int i12 = 0; i12 < this.b; i12++) {
            sparseIntArray.put(i12, s91Var.j(i12));
        }
        this.f = s91Var.e;
        this.g = s91Var.h;
        this.h = s91Var.r;
        this.i = s91Var.s;
        this.j = s91Var.v;
        this.k = s91Var.w;
        this.l = s91Var.x;
        this.m = s91Var.n;
        this.n = s91Var.y;
        this.x = s91Var.F;
        this.y = s91Var.G;
        this.o = s91Var.B;
        this.p = s91Var.C;
        this.q = s91Var.D;
        this.r = s91Var.H;
        this.s = s91Var.I;
        this.t = s91Var.J;
        this.u = s91Var.K;
        this.v = s91Var.L;
        this.w = s91Var.M;
        s91Var.E();
        f2.j0 j0Var = this.d;
        int L0 = j0Var.L0();
        int N0 = j0Var.N0();
        while (true) {
            if (L0 > N0) {
                j10 = -1;
                i10 = 0;
                break;
            } else {
                if (s91Var.i(L0) != -1 && (m9 = j0Var.m(L0)) != null) {
                    j10 = s91Var.i(L0);
                    i10 = m9.getTop();
                    break;
                }
                L0++;
            }
        }
        f2.q.c(this, true).b(s91Var);
        if (j10 != -1) {
            while (true) {
                if (i11 >= s91Var.Z) {
                    i11 = -1;
                    break;
                } else if (s91Var.i(i11) == j10) {
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
