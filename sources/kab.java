// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes3.dex */
public final /* synthetic */ class kab implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ rbb b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ kab(rbb rbbVar, boolean z, byte b) {
        this.a = b;
        this.b = rbbVar;
        this.c = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        boolean z = this.c;
        rbb rbbVar = this.b;
        switch (b) {
            case 0:
                rbbVar.c(z);
                break;
            case 1:
                if (!z) {
                    rbbVar.K0.b(false, false);
                    break;
                }
                break;
            default:
                rbbVar.S = null;
                rbbVar.e = false;
                rbbVar.o(z);
                break;
        }
    }
}
