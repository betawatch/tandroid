// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class gwa implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Runnable b;
    public final /* synthetic */ Runnable c;

    public /* synthetic */ gwa(Runnable runnable, Runnable runnable2, byte b) {
        this.a = b;
        this.b = runnable;
        this.c = runnable2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        Runnable runnable = this.c;
        Runnable runnable2 = this.b;
        switch (b) {
            case 0:
                runnable2.run();
                runnable.run();
                break;
            default:
                jlb.b(runnable2);
                if (runnable != null) {
                    gm.c3(runnable);
                    break;
                }
                break;
        }
    }
}
