// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class exb implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ fxb b;

    public /* synthetic */ exb(fxb fxbVar, byte b) {
        this.a = b;
        this.b = fxbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        fxb fxbVar = this.b;
        switch (b) {
            case 0:
                fxbVar.F = null;
                if (fxbVar.G != -1) {
                    fxbVar.H.getNotificationCenter().j(fxbVar.G);
                    fxbVar.G = -1;
                    break;
                }
                break;
            default:
                fxbVar.F = null;
                if (fxbVar.G != -1) {
                    fxbVar.H.getNotificationCenter().j(fxbVar.G);
                    fxbVar.G = -1;
                    break;
                }
                break;
        }
    }
}
