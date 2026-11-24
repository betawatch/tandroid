// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class kf implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ sc7 b;

    public /* synthetic */ kf(sc7 sc7Var, byte b) {
        this.a = b;
        this.b = sc7Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        sc7 sc7Var = this.b;
        switch (b) {
            case 0:
                sc7Var.k(false);
                break;
            case 1:
                sc7Var.k(false);
                break;
            default:
                sc7Var.k(true);
                break;
        }
    }
}
