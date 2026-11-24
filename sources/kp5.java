// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class kp5 extends mo5 {
    public final /* synthetic */ vo5 c;

    public kp5(vo5 vo5Var) {
        this.c = vo5Var;
    }

    @Override // java.util.List
    public final Object get(int i) {
        vo5 vo5Var = this.c;
        switch (vo5Var.d) {
            case 0:
                zp7 zp7Var = ((e89) vo5Var.e).e;
                jte.j(i, zp7Var.c);
                return new yp7(zp7Var, i);
            default:
                zp7 zp7Var2 = ((e89) vo5Var.e).e;
                jte.j(i, zp7Var2.c);
                return zp7Var2.a[i];
        }
    }

    @Override // go5
    public final boolean m() {
        return this.c.m();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.c.size();
    }
}
