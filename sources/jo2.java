// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class jo2 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ po2 b;
    public final /* synthetic */ long c;

    public /* synthetic */ jo2(po2 po2Var, long j, byte b) {
        this.a = b;
        this.b = po2Var;
        this.c = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        long j = this.c;
        po2 po2Var = this.b;
        switch (b) {
            case 0:
                po2Var.a0(j);
                break;
            default:
                po2Var.presentFragment(yv1.ga(j));
                break;
        }
    }
}
