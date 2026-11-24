// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final /* synthetic */ class hm9 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ km9 b;

    public /* synthetic */ hm9(km9 km9Var, byte b) {
        this.a = b;
        this.b = km9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        km9 km9Var = this.b;
        switch (b) {
            case 0:
                if (km9Var.W != 0) {
                    km9Var.V = true;
                    break;
                }
                break;
            default:
                km9Var.c();
                break;
        }
    }
}
