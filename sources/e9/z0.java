package e9;

import v7.u6;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes.dex */
public final class z0 extends n0 {
    public final /* synthetic */ v0 c;

    public z0(v0 v0Var) {
        this.c = v0Var;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        v0 v0Var = this.c;
        switch (v0Var.d) {
            case 0:
                u1 u1Var = ((d2) v0Var.e).e;
                u6.j(i10, u1Var.c);
                return new t1(u1Var, i10);
            default:
                u1 u1Var2 = ((d2) v0Var.e).e;
                u6.j(i10, u1Var2.c);
                return u1Var2.a[i10];
        }
    }

    @Override // e9.i0
    public final boolean q() {
        return this.c.q();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.c.size();
    }
}
