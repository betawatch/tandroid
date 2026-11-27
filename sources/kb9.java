// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class kb9 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ mb9 b;

    public /* synthetic */ kb9(mb9 mb9Var, byte b) {
        this.a = b;
        this.b = mb9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        mb9 mb9Var = this.b;
        switch (b) {
            case 0:
                int i = mb9Var.a;
                nb9 nb9Var = mb9Var.w;
                if (i != 0) {
                    nb9Var.onBackPressed();
                    break;
                } else {
                    nb9Var.dismiss();
                    break;
                }
            default:
                hl.E3(mb9Var.n.d);
                break;
        }
    }
}
