package h9;

import a8.ia;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public final class z1 extends r0 {
    public static final z1 n;
    public final transient q1 e;
    public final transient int f;
    public transient q0 h;

    static {
        q1 q1Var = new q1();
        q1Var.d(3);
        n = new z1(q1Var);
    }

    public z1(q1 q1Var) {
        this.e = q1Var;
        long j3 = 0;
        int i7 = 0;
        while (true) {
            int i10 = q1Var.c;
            if (i7 >= i10) {
                this.f = c8.e1.e(j3);
                return;
            } else {
                ia.j(i7, i10);
                j3 += q1Var.b[i7];
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
