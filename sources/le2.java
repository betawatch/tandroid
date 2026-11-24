// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class le2 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ kf2 b;

    public /* synthetic */ le2(kf2 kf2Var, byte b) {
        this.a = b;
        this.b = kf2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        kf2 kf2Var = this.b;
        switch (b) {
            case 0:
                kf2Var.t0();
                break;
            default:
                kf2Var.getMessagesController().Y2(0, kf2Var.N, true);
                break;
        }
    }
}
