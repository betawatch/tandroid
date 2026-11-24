// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class i3c implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ p3c b;
    public final /* synthetic */ byte[] c;

    public /* synthetic */ i3c(p3c p3cVar, byte[] bArr, byte b) {
        this.a = b;
        this.b = p3cVar;
        this.c = bArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        byte[] bArr = this.c;
        p3c p3cVar = this.b;
        switch (b) {
            case 0:
                p3cVar.r0(bArr);
                break;
            default:
                p3cVar.A0();
                p3cVar.W = bArr;
                p3cVar.getMessagesController().m4(0L, "VALIDATE_PASSWORD");
                p3c p3cVar2 = new p3c(9, p3cVar.V);
                p3cVar2.I = p3cVar.I;
                p3cVar2.H = p3cVar.H;
                p3cVar.presentFragment(p3cVar2, true);
                break;
        }
    }
}
