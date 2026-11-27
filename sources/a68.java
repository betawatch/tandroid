// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes3.dex */
public final /* synthetic */ class a68 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ j68 b;

    public /* synthetic */ a68(j68 j68Var, byte b) {
        this.a = b;
        this.b = j68Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        j68 j68Var = this.b;
        switch (b) {
            case 0:
                o68 o68Var = j68Var.x;
                k68 k68Var = o68Var.A1;
                if (k68Var != null) {
                    lcb lcbVar = ((ccb) k68Var).d;
                    lcbVar.Z0 = false;
                    lcbVar.U();
                }
                o68Var.c1(false);
                o68Var.R2 = true;
                o68Var.u0.E(true);
                break;
            case 1:
                o68 o68Var2 = j68Var.x;
                o68Var2.D3 = true;
                o68Var2.setActive(false);
                break;
            case 2:
                o68 o68Var3 = j68Var.x;
                o68Var3.D3 = true;
                o68Var3.setActive(false);
                break;
            default:
                ((ccb) j68Var.x.A1).g(false);
                break;
        }
    }
}
