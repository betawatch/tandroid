// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class o56 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ v56 b;

    public /* synthetic */ o56(v56 v56Var, byte b) {
        this.a = b;
        this.b = v56Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        v56 v56Var = this.b;
        switch (b) {
            case 0:
                m01.u(v56Var.getParentActivity(), ob6.M0(2131745883, null));
                break;
            case 1:
                v56Var.r.d.requestFocus();
                hl.E3(v56Var.r.d);
                break;
            default:
                v56Var.r.d.clearFocus();
                hl.t1(v56Var.r.d);
                break;
        }
    }
}
