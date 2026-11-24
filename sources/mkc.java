// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class mkc implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ rkc b;
    public final /* synthetic */ int c;

    public /* synthetic */ mkc(rkc rkcVar, int i, byte b) {
        this.a = b;
        this.b = rkcVar;
        this.c = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        int i = this.c;
        rkc rkcVar = this.b;
        switch (b) {
            case 0:
                gm.c3(new mkc(rkcVar, i, (byte) 2));
                break;
            case 1:
                gm.c3(new mkc(rkcVar, i, (byte) 3));
                break;
            case 2:
                rkcVar.c(i);
                break;
            default:
                rkcVar.a(i);
                break;
        }
    }
}
