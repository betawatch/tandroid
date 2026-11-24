// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final /* synthetic */ class fc implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ jc b;

    public /* synthetic */ fc(jc jcVar, byte b) {
        this.a = b;
        this.b = jcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        jc jcVar = this.b;
        switch (b) {
            case 0:
                jcVar.Z0();
                break;
            default:
                su3 su3Var = jcVar.g2;
                su3Var.d.requestFocus();
                gm.E3(su3Var.d);
                break;
        }
    }
}
