// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class no0 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ to0 b;

    public /* synthetic */ no0(to0 to0Var, byte b) {
        this.a = b;
        this.b = to0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        to0 to0Var = this.b;
        switch (b) {
            case 0:
                gm.c3(new no0(to0Var, (byte) 1));
                break;
            default:
                to0Var.a(null);
                break;
        }
    }
}
