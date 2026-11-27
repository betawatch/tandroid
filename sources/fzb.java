// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class fzb implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ gzb b;

    public /* synthetic */ fzb(gzb gzbVar, byte b) {
        this.a = b;
        this.b = gzbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        gzb gzbVar = this.b;
        switch (b) {
            case 0:
                gzbVar.F = null;
                if (gzbVar.G != -1) {
                    gzbVar.H.getNotificationCenter().j(gzbVar.G);
                    gzbVar.G = -1;
                    break;
                }
                break;
            default:
                gzbVar.F = null;
                if (gzbVar.G != -1) {
                    gzbVar.H.getNotificationCenter().j(gzbVar.G);
                    gzbVar.G = -1;
                    break;
                }
                break;
        }
    }
}
