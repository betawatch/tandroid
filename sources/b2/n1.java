package b2;

import a8.yb;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class n1 extends p1 {
    public final f9.i0 e;
    public final f9.i0 f;
    public final int[] g;
    public final int[] h;

    public n1(f9.s1 s1Var, f9.s1 s1Var2, int[] iArr) {
        yb.g(s1Var.d == iArr.length);
        this.e = s1Var;
        this.f = s1Var2;
        this.g = iArr;
        this.h = new int[iArr.length];
        for (int i10 = 0; i10 < iArr.length; i10++) {
            this.h[iArr[i10]] = i10;
        }
    }

    @Override // b2.p1
    public final int a(boolean z10) {
        if (p()) {
            return -1;
        }
        if (z10) {
            return this.g[0];
        }
        return 0;
    }

    @Override // b2.p1
    public final int b(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // b2.p1
    public final int c(boolean z10) {
        if (p()) {
            return -1;
        }
        f9.i0 i0Var = this.e;
        if (!z10) {
            return i0Var.size() - 1;
        }
        return this.g[i0Var.size() - 1];
    }

    @Override // b2.p1
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

    @Override // b2.p1
    public final m1 f(int i10, m1 m1Var, boolean z10) {
        m1 m1Var2 = (m1) this.f.get(i10);
        m1Var.h(m1Var2.a, m1Var2.b, m1Var2.c, m1Var2.d, m1Var2.e, m1Var2.g, m1Var2.f);
        return m1Var;
    }

    @Override // b2.p1
    public final int h() {
        return this.f.size();
    }

    @Override // b2.p1
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

    @Override // b2.p1
    public final Object l(int i10) {
        throw new UnsupportedOperationException();
    }

    @Override // b2.p1
    public final o1 m(int i10, o1 o1Var, long j10) {
        o1 o1Var2 = (o1) this.e.get(i10);
        o1Var.b(o1Var2.a, o1Var2.c, o1Var2.d, o1Var2.e, o1Var2.f, o1Var2.g, o1Var2.h, o1Var2.i, o1Var2.j, o1Var2.l, o1Var2.m, o1Var2.n, o1Var2.o, o1Var2.p);
        o1Var.k = o1Var2.k;
        return o1Var;
    }

    @Override // b2.p1
    public final int o() {
        return this.e.size();
    }
}
