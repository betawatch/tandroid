// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class du7 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ gu7 b;

    public /* synthetic */ du7(gu7 gu7Var, byte b) {
        this.a = b;
        this.b = gu7Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        gu7 gu7Var = this.b;
        switch (b) {
            case 0:
                gu7Var.c = null;
                u39 u39Var = gu7Var.a;
                if (u39Var != null) {
                    u39Var.i0();
                    break;
                }
                break;
            default:
                gu7Var.b();
                break;
        }
    }
}
