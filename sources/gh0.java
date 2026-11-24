// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class gh0 implements fh0 {
    public final /* synthetic */ gja a;

    public gh0(gja gjaVar) {
        this.a = gjaVar;
    }

    @Override // fh0
    public final void a(ot2 ot2Var) {
        boolean c = ot2Var.c();
        gja gjaVar = this.a;
        if (c) {
            gjaVar.j(null, gjaVar.E);
            return;
        }
        oo8 oo8Var = gjaVar.u;
        if (oo8Var != null) {
            ((g05) oo8Var.b).onConnectionFailed(ot2Var);
        }
    }
}
