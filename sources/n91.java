// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class n91 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ia1 b;

    public /* synthetic */ n91(ia1 ia1Var, byte b) {
        this.a = b;
        this.b = ia1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        ia1 ia1Var = this.b;
        switch (b) {
            case 0:
                ia1Var.k0(false);
                break;
            default:
                ia1Var.c0();
                break;
        }
    }
}
