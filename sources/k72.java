// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class k72 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ v72 b;

    public /* synthetic */ k72(v72 v72Var, byte b) {
        this.a = b;
        this.b = v72Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        v72 v72Var = this.b;
        switch (b) {
            case 0:
                v72 v72Var2 = this.b;
                v72Var2.K(true, 2147483646, 0, 0L, false);
                q67 q67Var = v72Var2.P;
                if (q67Var != null) {
                    q67Var.f(false);
                    v72Var2.P = null;
                    break;
                }
                break;
            case 1:
                v72 v72Var3 = this.b;
                v72Var3.K(false, 0, 0, 0L, false);
                q67 q67Var2 = v72Var3.P;
                if (q67Var2 != null) {
                    q67Var2.f(true);
                    v72Var3.P = null;
                    break;
                }
                break;
            case 2:
                if (!yac.h(v72Var.n).p()) {
                    new xk8(v72Var.b.Z1, v72Var.getContext(), v72Var.n, 43, true).show();
                    break;
                }
                break;
            case 3:
                ui9 ui9Var = v72Var.s;
                if (ui9Var != null) {
                    ui9Var.setSendEnabled(v72Var.r.J3());
                    break;
                }
                break;
            default:
                v72Var.e0();
                break;
        }
    }
}
