// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class lr0 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ rr0 b;

    public /* synthetic */ lr0(rr0 rr0Var, byte b) {
        this.a = b;
        this.b = rr0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        rr0 rr0Var = this.b;
        switch (b) {
            case 0:
                rr0Var.k0();
                break;
            default:
                rr0Var.getSendMessagesHelper().q0(p7a.b("/start", rr0Var.a, null, null, null, false, null, null, null, true, 0, 0, null, false));
                break;
        }
    }
}
