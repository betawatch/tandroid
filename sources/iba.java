// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class iba implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ tba b;

    public /* synthetic */ iba(tba tbaVar, byte b) {
        this.a = b;
        this.b = tbaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        tba tbaVar = this.b;
        switch (b) {
            case 0:
                tbaVar.b0();
                break;
            case 1:
                m01.u(tbaVar.getParentActivity(), ob6.M0(2131752119, null));
                break;
            default:
                tbaVar.c.g3.O(true);
                break;
        }
    }
}
