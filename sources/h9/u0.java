package h9;

import a8.ia;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes.dex */
public final class u0 extends i0 {
    public final /* synthetic */ q0 c;

    public u0(q0 q0Var) {
        this.c = q0Var;
    }

    @Override // java.util.List
    public final Object get(int i7) {
        q0 q0Var = this.c;
        switch (q0Var.d) {
            case 0:
                q1 q1Var = ((z1) q0Var.e).e;
                ia.j(i7, q1Var.c);
                return new p1(q1Var, i7);
            default:
                q1 q1Var2 = ((z1) q0Var.e).e;
                ia.j(i7, q1Var2.c);
                return q1Var2.a[i7];
        }
    }

    @Override // h9.d0
    public final boolean m() {
        return this.c.m();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.c.size();
    }
}
