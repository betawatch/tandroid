// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class gxa implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ hxa b;
    public final /* synthetic */ long c;

    public /* synthetic */ gxa(hxa hxaVar, long j, byte b) {
        this.a = b;
        this.b = hxaVar;
        this.c = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        hxa hxaVar = this.b;
        switch (b) {
            case 0:
                hxaVar.q.c0(hxaVar.b, hxaVar.c, this.c, true, true, hxaVar.n);
                break;
            default:
                hxaVar.q.c0(hxaVar.b, hxaVar.c, this.c, true, true, hxaVar.n);
                break;
        }
    }
}
