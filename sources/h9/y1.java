package h9;

import a8.ma;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final class y1 extends r0 {
    public static final y1 n;
    public final transient p1 e;
    public final transient int f;
    public transient q0 h;

    static {
        p1 p1Var = new p1();
        p1Var.d(3);
        n = new y1(p1Var);
    }

    public y1(p1 p1Var) {
        this.e = p1Var;
        long j3 = 0;
        int i7 = 0;
        while (true) {
            int i10 = p1Var.c;
            if (i7 >= i10) {
                this.f = c8.l1.e(j3);
                return;
            } else {
                ma.j(i7, i10);
                j3 += p1Var.b[i7];
                i7++;
            }
        }
    }

    @Override // h9.d0
    public final boolean m() {
        throw null;
    }

    @Override // h9.r0
    public final t0 o() {
        q0 q0Var = this.h;
        if (q0Var != null) {
            return q0Var;
        }
        q0 q0Var2 = new q0(this, 1);
        this.h = q0Var2;
        return q0Var2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.f;
    }
}
