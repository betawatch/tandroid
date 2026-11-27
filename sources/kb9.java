// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
