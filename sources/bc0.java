// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class bc0 extends c6 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ mc0 b;

    public /* synthetic */ bc0(mc0 mc0Var, byte b) {
        this.a = b;
        this.b = mc0Var;
    }

    @Override // c6
    public final void b(int i) {
        byte b = this.a;
        mc0 mc0Var = this.b;
        switch (b) {
            case 0:
                if (i == -1) {
                    mc0Var.i0();
                    break;
                }
                break;
            default:
                if (i == -1) {
                    mc0Var.i0();
                }
                if (i == 1) {
                    mc0Var.k0();
                    break;
                }
                break;
        }
    }
}
