// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class hl9 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ kl9 b;

    public /* synthetic */ hl9(kl9 kl9Var, byte b) {
        this.a = b;
        this.b = kl9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        kl9 kl9Var = this.b;
        switch (b) {
            case 0:
                kl9Var.g(false);
                break;
            default:
                nm7.f(kl9Var.c).k(nm7.i5, new Object[0]);
                break;
        }
    }
}
