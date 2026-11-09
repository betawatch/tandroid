package e2;

import a8.ia;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes.dex */
public final class j1 extends l1 {
    public final h9.i0 e;
    public final h9.i0 f;
    public final int[] g;
    public final int[] h;

    public j1(h9.t1 t1Var, h9.t1 t1Var2, int[] iArr) {
        ia.f(t1Var.d == iArr.length);
        this.e = t1Var;
        this.f = t1Var2;
        this.g = iArr;
        this.h = new int[iArr.length];
        for (int i7 = 0; i7 < iArr.length; i7++) {
            this.h[iArr[i7]] = i7;
        }
    }

    @Override // e2.l1
    public final int a(boolean z9) {
        if (p()) {
            return -1;
        }
        if (z9) {
            return this.g[0];
        }
        return 0;
    }

    @Override // e2.l1
    public final int b(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // e2.l1
    public final int c(boolean z9) {
        if (p()) {
            return -1;
        }
        h9.i0 i0Var = this.e;
        if (!z9) {
            return i0Var.size() - 1;
        }
        return this.g[i0Var.size() - 1];
    }

    @Override // e2.l1
    public final int e(int i7, int i10, boolean z9) {
        if (i10 == 1) {
            return i7;
        }
        if (i7 == c(z9)) {
            if (i10 == 2) {
                return a(z9);
            }
            return -1;
        }
        if (!z9) {
            return i7 + 1;
        }
        return this.g[this.h[i7] + 1];
    }

    @Override // e2.l1
    public final i1 f(int i7, i1 i1Var, boolean z9) {
        i1 i1Var2 = (i1) this.f.get(i7);
        i1Var.h(i1Var2.a, i1Var2.b, i1Var2.c, i1Var2.d, i1Var2.e, i1Var2.g, i1Var2.f);
        return i1Var;
    }

    @Override // e2.l1
    public final int h() {
        return this.f.size();
    }

    @Override // e2.l1
    public final int k(int i7, int i10, boolean z9) {
        if (i10 == 1) {
            return i7;
        }
        if (i7 == a(z9)) {
            if (i10 == 2) {
                return c(z9);
            }
            return -1;
        }
        if (!z9) {
            return i7 - 1;
        }
        return this.g[this.h[i7] - 1];
    }

    @Override // e2.l1
    public final Object l(int i7) {
        throw new UnsupportedOperationException();
    }

    @Override // e2.l1
    public final k1 m(int i7, k1 k1Var, long j3) {
        k1 k1Var2 = (k1) this.e.get(i7);
        k1Var.b(k1Var2.a, k1Var2.c, k1Var2.d, k1Var2.e, k1Var2.f, k1Var2.g, k1Var2.h, k1Var2.i, k1Var2.j, k1Var2.l, k1Var2.m, k1Var2.n, k1Var2.o, k1Var2.p);
        k1Var.k = k1Var2.k;
        return k1Var;
    }

    @Override // e2.l1
    public final int o() {
        return this.e.size();
    }
}
