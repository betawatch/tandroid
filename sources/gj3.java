// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class gj3 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ oj3 b;

    public /* synthetic */ gj3(oj3 oj3Var, byte b) {
        this.a = b;
        this.b = oj3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        oj3 oj3Var = this.b;
        switch (b) {
            case 0:
                for (bj3 bj3Var : oj3Var.S.f0) {
                    ((t26) bj3Var.a.getLayoutManager()).u = false;
                }
                break;
            default:
                oj3Var.K();
                break;
        }
    }
}
