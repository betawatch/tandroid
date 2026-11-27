// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes3.dex */
public final /* synthetic */ class i72 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ zt3 b;

    public /* synthetic */ i72(zt3 zt3Var, byte b) {
        this.a = b;
        this.b = zt3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        zt3 zt3Var = this.b;
        switch (b) {
            case 0:
                yt3 yt3Var = zt3Var.d;
                yt3Var.requestFocus();
                hl.E3(yt3Var);
                break;
            default:
                hl.t1(zt3Var.d);
                break;
        }
    }
}
