// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class cf2 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ bg2 b;

    public /* synthetic */ cf2(bg2 bg2Var, byte b) {
        this.a = b;
        this.b = bg2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        bg2 bg2Var = this.b;
        switch (b) {
            case 0:
                bg2Var.t0();
                break;
            default:
                bg2Var.getMessagesController().e3(0, bg2Var.N, true);
                break;
        }
    }
}
