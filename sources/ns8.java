// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final /* synthetic */ class ns8 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ts8 b;

    public /* synthetic */ ns8(ts8 ts8Var, byte b) {
        this.a = b;
        this.b = ts8Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        ts8 ts8Var = this.b;
        switch (b) {
            case 0:
                ts8Var.e0 = true;
                break;
            case 1:
                ts8Var.u();
                break;
            default:
                if (!ts8Var.k0) {
                    rr6 rr6Var = ts8Var.J;
                    rr6Var.getClass();
                    rr6Var.b(ts8Var);
                    break;
                }
                break;
        }
    }
}
