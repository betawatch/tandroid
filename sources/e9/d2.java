package e9;

import v7.b8;
import v7.u6;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes.dex */
public final class d2 extends w0 {
    public static final d2 n;
    public final transient u1 e;
    public final transient int f;
    public transient v0 h;

    static {
        u1 u1Var = new u1();
        u1Var.d(3);
        n = new d2(u1Var);
    }

    public d2(u1 u1Var) {
        this.e = u1Var;
        long j10 = 0;
        int i10 = 0;
        while (true) {
            int i11 = u1Var.c;
            if (i10 >= i11) {
                this.f = b8.e(j10);
                return;
            } else {
                u6.j(i10, i11);
                j10 += u1Var.b[i10];
                i10++;
            }
        }
    }

    @Override // e9.i0
    public final boolean q() {
        throw null;
    }

    @Override // e9.w0
    public final y0 s() {
        v0 v0Var = this.h;
        if (v0Var != null) {
            return v0Var;
        }
        v0 v0Var2 = new v0(this, 1);
        this.h = v0Var2;
        return v0Var2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.f;
    }
}
