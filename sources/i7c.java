// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class i7c implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ o7c b;
    public final /* synthetic */ byte[] c;

    public /* synthetic */ i7c(o7c o7cVar, byte[] bArr, byte b) {
        this.a = b;
        this.b = o7cVar;
        this.c = bArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        byte[] bArr = this.c;
        o7c o7cVar = this.b;
        switch (b) {
            case 0:
                o7cVar.r0(bArr);
                break;
            default:
                o7cVar.B0();
                o7cVar.W = bArr;
                o7cVar.getMessagesController().v4(0L, "VALIDATE_PASSWORD");
                o7c o7cVar2 = new o7c(9, o7cVar.V);
                o7cVar2.I = o7cVar.I;
                o7cVar2.H = o7cVar.H;
                o7cVar.presentFragment(o7cVar2, true);
                break;
        }
    }
}
