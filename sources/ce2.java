// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class ce2 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ke2 b;
    public final /* synthetic */ long c;

    public /* synthetic */ ce2(ke2 ke2Var, long j, byte b) {
        this.a = b;
        this.b = ke2Var;
        this.c = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        long j = this.c;
        ke2 ke2Var = this.b;
        switch (b) {
            case 0:
                ke2Var.n = j;
                ke2Var.r = true;
                ke2Var.d0();
                break;
            default:
                ke2Var.i0(j);
                break;
        }
    }
}
