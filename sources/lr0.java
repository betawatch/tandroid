// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
