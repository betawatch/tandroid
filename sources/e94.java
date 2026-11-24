// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final /* synthetic */ class e94 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ k94 b;

    public /* synthetic */ e94(k94 k94Var, byte b) {
        this.a = b;
        this.b = k94Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        k94 k94Var = this.b;
        switch (b) {
            case 0:
                Runnable runnable = k94Var.l;
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            default:
                Runnable runnable2 = k94Var.l;
                if (runnable2 != null) {
                    runnable2.run();
                    break;
                }
                break;
        }
    }
}
