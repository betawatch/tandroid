// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class gva implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ hva b;
    public final /* synthetic */ long c;

    public /* synthetic */ gva(hva hvaVar, long j, byte b) {
        this.a = b;
        this.b = hvaVar;
        this.c = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        hva hvaVar = this.b;
        switch (b) {
            case 0:
                hvaVar.q.b0(hvaVar.b, hvaVar.c, this.c, true, true, hvaVar.n);
                break;
            default:
                hvaVar.q.b0(hvaVar.b, hvaVar.c, this.c, true, true, hvaVar.n);
                break;
        }
    }
}
