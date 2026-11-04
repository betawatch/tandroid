package d2;

import b8.zb;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class l1 extends n1 {
    public final g9.i0 e;
    public final g9.i0 f;
    public final int[] g;
    public final int[] h;

    public l1(g9.s1 s1Var, g9.s1 s1Var2, int[] iArr) {
        zb.f(s1Var.d == iArr.length);
        this.e = s1Var;
        this.f = s1Var2;
        this.g = iArr;
        this.h = new int[iArr.length];
        for (int i3 = 0; i3 < iArr.length; i3++) {
            this.h[iArr[i3]] = i3;
        }
    }

    @Override // d2.n1
    public final int a(boolean z10) {
        if (p()) {
            return -1;
        }
        if (z10) {
            return this.g[0];
        }
        return 0;
    }

    @Override // d2.n1
    public final int b(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // d2.n1
    public final int c(boolean z10) {
        if (p()) {
            return -1;
        }
        g9.i0 i0Var = this.e;
        if (!z10) {
            return i0Var.size() - 1;
        }
        return this.g[i0Var.size() - 1];
    }

    @Override // d2.n1
    public final int e(int i3, int i10, boolean z10) {
        if (i10 == 1) {
            return i3;
        }
        if (i3 == c(z10)) {
            if (i10 == 2) {
                return a(z10);
            }
            return -1;
        }
        if (!z10) {
            return i3 + 1;
        }
        return this.g[this.h[i3] + 1];
    }

    @Override // d2.n1
    public final k1 f(int i3, k1 k1Var, boolean z10) {
        k1 k1Var2 = (k1) this.f.get(i3);
        k1Var.h(k1Var2.a, k1Var2.b, k1Var2.c, k1Var2.d, k1Var2.e, k1Var2.g, k1Var2.f);
        return k1Var;
    }

    @Override // d2.n1
    public final int h() {
        return this.f.size();
    }

    @Override // d2.n1
    public final int k(int i3, int i10, boolean z10) {
        if (i10 == 1) {
            return i3;
        }
        if (i3 == a(z10)) {
            if (i10 == 2) {
                return c(z10);
            }
            return -1;
        }
        if (!z10) {
            return i3 - 1;
        }
        return this.g[this.h[i3] - 1];
    }

    @Override // d2.n1
    public final Object l(int i3) {
        throw new UnsupportedOperationException();
    }

    @Override // d2.n1
    public final m1 m(int i3, m1 m1Var, long j10) {
        m1 m1Var2 = (m1) this.e.get(i3);
        m1Var.b(m1Var2.a, m1Var2.c, m1Var2.d, m1Var2.e, m1Var2.f, m1Var2.g, m1Var2.h, m1Var2.i, m1Var2.j, m1Var2.l, m1Var2.m, m1Var2.n, m1Var2.o, m1Var2.p);
        m1Var.k = m1Var2.k;
        return m1Var;
    }

    @Override // d2.n1
    public final int o() {
        return this.e.size();
    }
}
