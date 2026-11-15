package org.telegram.ui;

import android.util.SparseIntArray;
import android.view.View;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class m41 extends v4.o {
    public int b;
    public final e41 c;
    public final v4.b0 d;
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

    public m41(e41 e41Var, v4.b0 b0Var) {
        this.c = e41Var;
        this.d = b0Var;
    }

    @Override // v4.o
    public final boolean a(int i7, int i10) {
        return this.e.get(i7) == this.c.d(i10);
    }

    @Override // v4.o
    public final boolean b(int i7, int i10) {
        SparseIntArray sparseIntArray = this.e;
        int i11 = sparseIntArray.get(i7);
        e41 e41Var = this.c;
        if (i11 == 13 && e41Var.d(i10) == 13) {
            return true;
        }
        if (sparseIntArray.get(i7) == 10 && e41Var.d(i10) == 10) {
            return true;
        }
        int i12 = this.x;
        if (i7 >= i12 && i7 <= this.y) {
            return i7 - i12 == i10 - e41Var.J;
        }
        if (i7 == this.f && i10 == e41Var.e) {
            return true;
        }
        if (i7 == this.g && i10 == e41Var.h) {
            return true;
        }
        if (i7 == this.h && i10 == e41Var.r) {
            return true;
        }
        if (i7 == this.i && i10 == e41Var.s) {
            return true;
        }
        if (i7 == this.j && i10 == e41Var.w) {
            return true;
        }
        if (i7 == this.k && i10 == e41Var.x) {
            return true;
        }
        if (i7 == this.l && i10 == e41Var.y) {
            return true;
        }
        if (i7 == this.m && i10 == e41Var.n) {
            return true;
        }
        if (i7 == this.n && i10 == e41Var.E) {
            return true;
        }
        if (i7 == this.r && i10 == e41Var.L) {
            return true;
        }
        if (i7 == this.s && i10 == e41Var.M) {
            return true;
        }
        if (i7 == this.t && i10 == e41Var.N) {
            return true;
        }
        if (i7 == this.u && i10 == e41Var.O) {
            return true;
        }
        if (i7 == this.v && i10 == e41Var.P) {
            return true;
        }
        if (i7 == this.w && i10 == e41Var.Q) {
            return true;
        }
        if (i7 == this.o && i10 == e41Var.F) {
            return true;
        }
        if (i7 == this.p && i10 == e41Var.G) {
            return true;
        }
        return i7 == this.q && i10 == e41Var.H;
    }

    @Override // v4.o
    public final int d() {
        return this.c.d0;
    }

    @Override // v4.o
    public final int e() {
        return this.b;
    }

    public final void f() {
        int i7;
        long j3;
        View m10;
        SparseIntArray sparseIntArray = this.e;
        sparseIntArray.clear();
        e41 e41Var = this.c;
        this.b = e41Var.d0;
        int i10 = 0;
        for (int i11 = 0; i11 < this.b; i11++) {
            sparseIntArray.put(i11, e41Var.d(i11));
        }
        this.f = e41Var.e;
        this.g = e41Var.h;
        this.h = e41Var.r;
        this.i = e41Var.s;
        this.j = e41Var.w;
        this.k = e41Var.x;
        this.l = e41Var.y;
        this.m = e41Var.n;
        this.n = e41Var.E;
        this.x = e41Var.J;
        this.y = e41Var.K;
        this.o = e41Var.F;
        this.p = e41Var.G;
        this.q = e41Var.H;
        this.r = e41Var.L;
        this.s = e41Var.M;
        this.t = e41Var.N;
        this.u = e41Var.O;
        this.v = e41Var.P;
        this.w = e41Var.Q;
        e41Var.E();
        v4.b0 b0Var = this.d;
        int L0 = b0Var.L0();
        int N0 = b0Var.N0();
        while (true) {
            if (L0 > N0) {
                i7 = 0;
                j3 = -1;
                break;
            } else {
                if (e41Var.c(L0) != -1 && (m10 = b0Var.m(L0)) != null) {
                    j3 = e41Var.c(L0);
                    i7 = m10.getTop();
                    break;
                }
                L0++;
            }
        }
        v4.o.c(this, true).c(e41Var);
        if (j3 != -1) {
            while (true) {
                if (i10 >= e41Var.d0) {
                    i10 = -1;
                    break;
                } else if (e41Var.c(i10) == j3) {
                    break;
                } else {
                    i10++;
                }
            }
            if (i10 > 0) {
                b0Var.h1(i10, i7);
            }
        }
    }
}
