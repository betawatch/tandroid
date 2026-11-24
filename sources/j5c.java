// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class j5c implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ p5c b;
    public final /* synthetic */ byte[] c;

    public /* synthetic */ j5c(p5c p5cVar, byte[] bArr, byte b) {
        this.a = b;
        this.b = p5cVar;
        this.c = bArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        byte[] bArr = this.c;
        p5c p5cVar = this.b;
        switch (b) {
            case 0:
                p5cVar.s0(bArr);
                break;
            default:
                p5cVar.B0();
                p5cVar.W = bArr;
                p5cVar.getMessagesController().p4(0L, "VALIDATE_PASSWORD");
                p5c p5cVar2 = new p5c(9, p5cVar.V);
                p5cVar2.I = p5cVar.I;
                p5cVar2.H = p5cVar.H;
                p5cVar.presentFragment(p5cVar2, true);
                break;
        }
    }
}
