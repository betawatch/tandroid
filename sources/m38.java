// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final /* synthetic */ class m38 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Runnable b;
    public final /* synthetic */ long c;

    public /* synthetic */ m38(Runnable runnable, long j, byte b) {
        this.a = b;
        this.b = runnable;
        this.c = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                Runnable runnable = this.b;
                gm.r(runnable);
                gm.d3(runnable, Math.max(0L, 32 - (System.currentTimeMillis() - this.c)));
                break;
            case 1:
                Runnable runnable2 = this.b;
                gm.r(runnable2);
                gm.d3(runnable2, Math.max(0L, 32 - (System.currentTimeMillis() - this.c)));
                break;
            default:
                Runnable runnable3 = this.b;
                gm.r(runnable3);
                gm.d3(runnable3, Math.max(0L, 32 - (System.currentTimeMillis() - this.c)));
                break;
        }
    }
}
