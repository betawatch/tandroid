// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
