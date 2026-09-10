package b2;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class i1 extends k1 {
    public final e9.i0 e;
    public final e9.i0 f;
    public final int[] g;
    public final int[] h;

    public i1(e9.a1 a1Var, e9.a1 a1Var2, int[] iArr) {
        e2.d.b(a1Var.d == iArr.length);
        this.e = a1Var;
        this.f = a1Var2;
        this.g = iArr;
        this.h = new int[iArr.length];
        for (int i10 = 0; i10 < iArr.length; i10++) {
            this.h[iArr[i10]] = i10;
        }
    }

    @Override // b2.k1
    public final int a(boolean z10) {
        if (p()) {
            return -1;
        }
        if (z10) {
            return this.g[0];
        }
        return 0;
    }

    @Override // b2.k1
    public final int b(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // b2.k1
    public final int c(boolean z10) {
        if (p()) {
            return -1;
        }
        e9.i0 i0Var = this.e;
        if (!z10) {
            return i0Var.size() - 1;
        }
        return this.g[i0Var.size() - 1];
    }

    @Override // b2.k1
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

    @Override // b2.k1
    public final h1 f(int i10, h1 h1Var, boolean z10) {
        h1 h1Var2 = (h1) this.f.get(i10);
        h1Var.h(h1Var2.a, h1Var2.b, h1Var2.c, h1Var2.d, h1Var2.e, h1Var2.g, h1Var2.f);
        return h1Var;
    }

    @Override // b2.k1
    public final int h() {
        return this.f.size();
    }

    @Override // b2.k1
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

    @Override // b2.k1
    public final Object l(int i10) {
        throw new UnsupportedOperationException();
    }

    @Override // b2.k1
    public final j1 m(int i10, j1 j1Var, long j3) {
        j1 j1Var2 = (j1) this.e.get(i10);
        j1Var.b(j1Var2.a, j1Var2.c, j1Var2.d, j1Var2.e, j1Var2.f, j1Var2.g, j1Var2.h, j1Var2.i, j1Var2.j, j1Var2.l, j1Var2.m, j1Var2.n, j1Var2.o, j1Var2.p);
        j1Var.k = j1Var2.k;
        return j1Var;
    }

    @Override // b2.k1
    public final int o() {
        return this.e.size();
    }
}
