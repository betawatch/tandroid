// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class bx4 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ux4 b;
    public final /* synthetic */ qac c;

    public /* synthetic */ bx4(ux4 ux4Var, qac qacVar, byte b) {
        this.a = b;
        this.b = ux4Var;
        this.c = qacVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        qac qacVar = this.c;
        ux4 ux4Var = this.b;
        switch (b) {
            case 0:
                if (qacVar != null) {
                    qacVar.a(Boolean.FALSE);
                }
                ux4Var.dismiss();
                break;
            case 1:
                if (qacVar != null) {
                    qacVar.a(Boolean.FALSE);
                }
                ux4Var.dismiss();
                break;
            default:
                if (qacVar != null) {
                    qacVar.a(Boolean.FALSE);
                }
                ux4Var.dismiss();
                break;
        }
    }
}
