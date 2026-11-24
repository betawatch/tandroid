// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class ao7 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ lo7 b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;

    public /* synthetic */ ao7(lo7 lo7Var, long j, long j2, byte b) {
        this.a = b;
        this.b = lo7Var;
        this.c = j;
        this.d = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        long j = this.d;
        long j2 = this.c;
        lo7 lo7Var = this.b;
        switch (b) {
            case 0:
                lo7Var.G = j2;
                lo7Var.H = j;
                break;
            default:
                lo7Var.i(j2, j);
                break;
        }
    }
}
