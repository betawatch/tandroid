// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final /* synthetic */ class c82 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ su3 b;

    public /* synthetic */ c82(su3 su3Var, byte b) {
        this.a = b;
        this.b = su3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        su3 su3Var = this.b;
        switch (b) {
            case 0:
                ru3 ru3Var = su3Var.d;
                ru3Var.requestFocus();
                gm.E3(ru3Var);
                break;
            default:
                gm.t1(su3Var.d);
                break;
        }
    }
}
