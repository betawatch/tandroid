package b2;

import v7.u6;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes.dex */
public final class m1 extends o1 {
    public final e9.n0 e;
    public final e9.n0 f;
    public final int[] g;
    public final int[] h;

    public m1(e9.x1 x1Var, e9.x1 x1Var2, int[] iArr) {
        u6.g(x1Var.d == iArr.length);
        this.e = x1Var;
        this.f = x1Var2;
        this.g = iArr;
        this.h = new int[iArr.length];
        for (int i10 = 0; i10 < iArr.length; i10++) {
            this.h[iArr[i10]] = i10;
        }
    }

    @Override // b2.o1
    public final int a(boolean z10) {
        if (p()) {
            return -1;
        }
        if (z10) {
            return this.g[0];
        }
        return 0;
    }

    @Override // b2.o1
    public final int b(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // b2.o1
    public final int c(boolean z10) {
        if (p()) {
            return -1;
        }
        e9.n0 n0Var = this.e;
        if (!z10) {
            return n0Var.size() - 1;
        }
        return this.g[n0Var.size() - 1];
    }

    @Override // b2.o1
    public final int e(int i10, int i11, boolean z10) {
        if (i11 == 1) {
            return i10;
        }
        if (i10 == c(z10)) {
            if (i11 == 2) {
                return a(z10);
            }
            return -1;
        }
        if (!z10) {
            return i10 + 1;
        }
        return this.g[this.h[i10] + 1];
    }

    @Override // b2.o1
    public final l1 f(int i10, l1 l1Var, boolean z10) {
        l1 l1Var2 = (l1) this.f.get(i10);
        l1Var.h(l1Var2.a, l1Var2.b, l1Var2.c, l1Var2.d, l1Var2.e, l1Var2.g, l1Var2.f);
        return l1Var;
    }

    @Override // b2.o1
    public final int h() {
        return this.f.size();
    }

    @Override // b2.o1
    public final int k(int i10, int i11, boolean z10) {
        if (i11 == 1) {
            return i10;
        }
        if (i10 == a(z10)) {
            if (i11 == 2) {
                return c(z10);
            }
            return -1;
        }
        if (!z10) {
            return i10 - 1;
        }
        return this.g[this.h[i10] - 1];
    }

    @Override // b2.o1
    public final Object l(int i10) {
        throw new UnsupportedOperationException();
    }

    @Override // b2.o1
    public final n1 m(int i10, n1 n1Var, long j10) {
        n1 n1Var2 = (n1) this.e.get(i10);
        n1Var.b(n1Var2.a, n1Var2.c, n1Var2.d, n1Var2.e, n1Var2.f, n1Var2.g, n1Var2.h, n1Var2.i, n1Var2.j, n1Var2.l, n1Var2.m, n1Var2.n, n1Var2.o, n1Var2.p);
        n1Var.k = n1Var2.k;
        return n1Var;
    }

    @Override // b2.o1
    public final int o() {
        return this.e.size();
    }
}
