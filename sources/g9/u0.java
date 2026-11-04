package g9;

import b8.zb;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class u0 extends i0 {
    public final /* synthetic */ q0 c;

    public u0(q0 q0Var) {
        this.c = q0Var;
    }

    @Override // java.util.List
    public final Object get(int i3) {
        q0 q0Var = this.c;
        switch (q0Var.d) {
            case 0:
                p1 p1Var = ((y1) q0Var.e).e;
                zb.j(i3, p1Var.c);
                return new o1(p1Var, i3);
            default:
                p1 p1Var2 = ((y1) q0Var.e).e;
                zb.j(i3, p1Var2.c);
                return p1Var2.a[i3];
        }
    }

    @Override // g9.d0
    public final boolean m() {
        return this.c.m();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.c.size();
    }
}
