// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes3.dex */
public final /* synthetic */ class mca implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ nca b;

    public /* synthetic */ mca(nca ncaVar, byte b) {
        this.a = b;
        this.b = ncaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        nca ncaVar = this.b;
        switch (b) {
            case 0:
                if (ncaVar.x) {
                    ncaVar.d();
                    break;
                }
                break;
            default:
                ncaVar.invalidateSelf();
                break;
        }
    }
}
