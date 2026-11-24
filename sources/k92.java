// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class k92 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ x92 b;

    public /* synthetic */ k92(x92 x92Var, byte b) {
        this.a = b;
        this.b = x92Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        x92 x92Var = this.b;
        switch (b) {
            case 0:
                hd hdVar = x92Var.r;
                if (hdVar != null) {
                    hdVar.setOnCancelListener(new ur0(x92Var, (byte) 6));
                    x92Var.showDialog(x92Var.r);
                    break;
                }
                break;
            case 1:
                x92Var.getMessagesController().Y2(0, x92Var.F, true);
                break;
            default:
                x92Var.getMessagesController().Y2(0, x92Var.F, true);
                break;
        }
    }
}
