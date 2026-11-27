// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class aa2 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ na2 b;

    public /* synthetic */ aa2(na2 na2Var, byte b) {
        this.a = b;
        this.b = na2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        na2 na2Var = this.b;
        switch (b) {
            case 0:
                id idVar = na2Var.r;
                if (idVar != null) {
                    idVar.setOnCancelListener(new cs0(na2Var, (byte) 6));
                    na2Var.showDialog(na2Var.r);
                    break;
                }
                break;
            case 1:
                na2Var.getMessagesController().e3(0, na2Var.F, true);
                break;
            default:
                na2Var.getMessagesController().e3(0, na2Var.F, true);
                break;
        }
    }
}
