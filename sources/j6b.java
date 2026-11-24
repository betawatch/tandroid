// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class j6b implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ n6b b;

    public /* synthetic */ j6b(n6b n6bVar, byte b) {
        this.a = b;
        this.b = n6bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        n6b n6bVar = this.b;
        switch (b) {
            case 0:
                n6bVar.b();
                break;
            case 1:
                gm.c3(new j6b(n6bVar, (byte) 0));
                break;
            case 2:
                n6bVar.dismiss();
                break;
            default:
                eg9 eg9Var = n6bVar.I;
                if (eg9Var != null) {
                    eg9Var.a(null);
                    n6bVar.I = null;
                }
                n6bVar.dismiss();
                break;
        }
    }
}
