// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final /* synthetic */ class mk4 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ rk4 b;
    public final /* synthetic */ eg9 c;

    public /* synthetic */ mk4(rk4 rk4Var, eg9 eg9Var, byte b) {
        this.a = b;
        this.b = rk4Var;
        this.c = eg9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        eg9 eg9Var = this.c;
        rk4 rk4Var = this.b;
        rk4Var.getClass();
        switch (b) {
            case 0:
                gm.d3(new mk4(rk4Var, eg9Var, (byte) 1), 320L);
                break;
            default:
                eg9Var.a(new sk3(rk4Var, (byte) 9));
                break;
        }
    }
}
