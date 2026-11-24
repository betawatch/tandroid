// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final /* synthetic */ class i5b implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ j5b b;

    public /* synthetic */ i5b(j5b j5bVar, byte b) {
        this.a = b;
        this.b = j5bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        j5b j5bVar = this.b;
        switch (b) {
            case 0:
                k5b k5bVar = j5bVar.v;
                k5bVar.s = 0;
                k5bVar.requestLayout();
                l5b l5bVar = k5bVar.K;
                l5bVar.L(l5bVar.getWidth(), l5bVar.getHeight());
                l5bVar.requestLayout();
                break;
            case 1:
                k5b k5bVar2 = j5bVar.v;
                k5bVar2.s = 0;
                k5bVar2.requestLayout();
                l5b l5bVar2 = k5bVar2.K;
                l5bVar2.L(l5bVar2.getWidth(), l5bVar2.getHeight());
                l5bVar2.requestLayout();
                break;
            case 2:
                j5bVar.v.post(new i5b(j5bVar, (byte) 3));
                break;
            default:
                j5bVar.v.y = true;
                break;
        }
    }
}
