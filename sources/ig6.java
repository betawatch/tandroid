// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class ig6 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ rg6 b;
    public final /* synthetic */ int c;

    public /* synthetic */ ig6(rg6 rg6Var, int i, byte b) {
        this.a = b;
        this.b = rg6Var;
        this.c = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        int i = this.c;
        rg6 rg6Var = this.b;
        switch (b) {
            case 0:
                gm.c3(new ig6(rg6Var, i, (byte) 1));
                break;
            case 1:
                rg6Var.z(i);
                break;
            default:
                rg6Var.f.f[i].D(1.0f);
                break;
        }
    }
}
