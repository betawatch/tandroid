// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final /* synthetic */ class joc implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ moc b;

    public /* synthetic */ joc(moc mocVar, byte b) {
        this.a = b;
        this.b = mocVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        moc mocVar = this.b;
        switch (b) {
            case 0:
                mocVar.performClick();
                break;
            default:
                mocVar.h.invalidate();
                mocVar.n.invalidate();
                mocVar.e.invalidate();
                break;
        }
    }
}
