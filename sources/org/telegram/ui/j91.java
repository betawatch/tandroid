package org.telegram.ui;

import android.util.SparseIntArray;
import android.view.View;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class j91 extends s4.p {
    public int b;
    public final b91 c;
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

    public j91(b91 b91Var, s4.c0 c0Var) {
        this.c = b91Var;
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
        b91 b91Var = this.c;
        if (i12 == 13 && b91Var.j(i11) == 13) {
            return true;
        }
        if (sparseIntArray.get(i10) == 10 && b91Var.j(i11) == 10) {
            return true;
        }
        int i13 = this.x;
        if (i10 >= i13 && i10 <= this.y) {
            return i10 - i13 == i11 - b91Var.I;
        }
        if (i10 == this.f && i11 == b91Var.e) {
            return true;
        }
        if (i10 == this.g && i11 == b91Var.h) {
            return true;
        }
        if (i10 == this.h && i11 == b91Var.r) {
            return true;
        }
        if (i10 == this.i && i11 == b91Var.s) {
            return true;
        }
        if (i10 == this.j && i11 == b91Var.v) {
            return true;
        }
        if (i10 == this.k && i11 == b91Var.w) {
            return true;
        }
        if (i10 == this.l && i11 == b91Var.x) {
            return true;
        }
        if (i10 == this.m && i11 == b91Var.n) {
            return true;
        }
        if (i10 == this.n && i11 == b91Var.y) {
            return true;
        }
        if (i10 == this.r && i11 == b91Var.K) {
            return true;
        }
        if (i10 == this.s && i11 == b91Var.L) {
            return true;
        }
        if (i10 == this.t && i11 == b91Var.M) {
            return true;
        }
        if (i10 == this.u && i11 == b91Var.N) {
            return true;
        }
        if (i10 == this.v && i11 == b91Var.O) {
            return true;
        }
        if (i10 == this.w && i11 == b91Var.P) {
            return true;
        }
        if (i10 == this.o && i11 == b91Var.E) {
            return true;
        }
        if (i10 == this.p && i11 == b91Var.F) {
            return true;
        }
        return i10 == this.q && i11 == b91Var.G;
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
        b91 b91Var = this.c;
        this.b = b91Var.c0;
        int i11 = 0;
        for (int i12 = 0; i12 < this.b; i12++) {
            sparseIntArray.put(i12, b91Var.j(i12));
        }
        this.f = b91Var.e;
        this.g = b91Var.h;
        this.h = b91Var.r;
        this.i = b91Var.s;
        this.j = b91Var.v;
        this.k = b91Var.w;
        this.l = b91Var.x;
        this.m = b91Var.n;
        this.n = b91Var.y;
        this.x = b91Var.I;
        this.y = b91Var.J;
        this.o = b91Var.E;
        this.p = b91Var.F;
        this.q = b91Var.G;
        this.r = b91Var.K;
        this.s = b91Var.L;
        this.t = b91Var.M;
        this.u = b91Var.N;
        this.v = b91Var.O;
        this.w = b91Var.P;
        b91Var.E();
        s4.c0 c0Var = this.d;
        int L0 = c0Var.L0();
        int N0 = c0Var.N0();
        while (true) {
            if (L0 > N0) {
                i10 = 0;
                j10 = -1;
                break;
            } else {
                if (b91Var.i(L0) != -1 && (m10 = c0Var.m(L0)) != null) {
                    j10 = b91Var.i(L0);
                    i10 = m10.getTop();
                    break;
                }
                L0++;
            }
        }
        s4.p.c(this, true).c(b91Var);
        if (j10 != -1) {
            while (true) {
                if (i11 >= b91Var.c0) {
                    i11 = -1;
                    break;
                } else if (b91Var.i(i11) == j10) {
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
