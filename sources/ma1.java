// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class ma1 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ oa1 b;

    public /* synthetic */ ma1(oa1 oa1Var, byte b) {
        this.a = b;
        this.b = oa1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        oa1 oa1Var = this.b;
        switch (b) {
            case 0:
                oa1Var.x = false;
                oa1Var.c();
                break;
            default:
                oa1Var.a.setVisibility(4);
                break;
        }
    }
}
