package h9;

import a8.ja;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
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
                p1 p1Var = ((y1) q0Var.e).e;
                ja.j(i7, p1Var.c);
                return new o1(p1Var, i7);
            default:
                p1 p1Var2 = ((y1) q0Var.e).e;
                ja.j(i7, p1Var2.c);
                return p1Var2.a[i7];
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
