// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class n21 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ t11 b;

    public /* synthetic */ n21(t11 t11Var, byte b) {
        this.a = b;
        this.b = t11Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        t11 t11Var = this.b;
        switch (b) {
            case 0:
                t11Var.performHapticFeedback(3, 2);
                break;
            default:
                t11Var.performHapticFeedback(3, 2);
                break;
        }
    }
}
