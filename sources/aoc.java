// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final /* synthetic */ class aoc implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boc b;

    public /* synthetic */ aoc(boc bocVar, byte b) {
        this.a = b;
        this.b = bocVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        boc bocVar = this.b;
        switch (b) {
            case 0:
                gm.c3(new aoc(bocVar, (byte) 1));
                break;
            default:
                bocVar.a();
                break;
        }
    }
}
