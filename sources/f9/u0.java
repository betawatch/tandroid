package f9;

import a8.yb;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class u0 extends i0 {
    public final /* synthetic */ q0 c;

    public u0(q0 q0Var) {
        this.c = q0Var;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        q0 q0Var = this.c;
        switch (q0Var.d) {
            case 0:
                p1 p1Var = ((y1) q0Var.e).e;
                yb.j(i10, p1Var.c);
                return new o1(p1Var, i10);
            default:
                p1 p1Var2 = ((y1) q0Var.e).e;
                yb.j(i10, p1Var2.c);
                return p1Var2.a[i10];
        }
    }

    @Override // f9.d0
    public final boolean q() {
        return this.c.q();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.c.size();
    }
}
