// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final /* synthetic */ class d4b implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ g4b b;

    public /* synthetic */ d4b(g4b g4bVar, byte b) {
        this.a = b;
        this.b = g4bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        g4b g4bVar = this.b;
        switch (b) {
            case 0:
                g4bVar.e();
                break;
            default:
                g4bVar.b();
                break;
        }
    }
}
