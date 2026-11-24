// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class ga8 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ja8 b;

    public /* synthetic */ ga8(ja8 ja8Var, byte b) {
        this.a = b;
        this.b = ja8Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        ja8 ja8Var = this.b;
        switch (b) {
            case 0:
                ja8Var.d.a(false);
                break;
            default:
                Runnable runnable = ja8Var.I;
                ja8Var.I = null;
                if (runnable != null) {
                    runnable.run();
                }
                Runnable runnable2 = ja8Var.J;
                if (runnable2 != null) {
                    runnable2.run();
                    break;
                }
                break;
        }
    }
}
