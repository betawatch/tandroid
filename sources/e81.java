// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class e81 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ z81 b;

    public /* synthetic */ e81(z81 z81Var, byte b) {
        this.a = b;
        this.b = z81Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        z81 z81Var = this.b;
        switch (b) {
            case 0:
                z81Var.k0(false);
                break;
            default:
                z81Var.b0();
                break;
        }
    }
}
