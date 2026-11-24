// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class l36 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ s36 b;

    public /* synthetic */ l36(s36 s36Var, byte b) {
        this.a = b;
        this.b = s36Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        s36 s36Var = this.b;
        switch (b) {
            case 0:
                d01.t(s36Var.getParentActivity(), k96.M0(2131745963, null));
                break;
            case 1:
                s36Var.r.d.requestFocus();
                gl.E3(s36Var.r.d);
                break;
            default:
                s36Var.r.d.clearFocus();
                gl.t1(s36Var.r.d);
                break;
        }
    }
}
