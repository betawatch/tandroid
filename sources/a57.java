// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class a57 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ b57 b;

    public /* synthetic */ a57(b57 b57Var, byte b) {
        this.a = b;
        this.b = b57Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        b57 b57Var = this.b;
        switch (b) {
            case 0:
                if (b57Var.W != -1) {
                    nm7.f(b57Var.Y.d0.x).j(b57Var.W);
                    b57Var.W = -1;
                    break;
                }
                break;
            case 1:
                b57Var.Y.i();
                break;
            default:
                if (b57Var.W != -1) {
                    nm7.f(b57Var.Y.d0.x).j(b57Var.W);
                    b57Var.W = -1;
                    break;
                }
                break;
        }
    }
}
