// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class lb1 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ mb1 b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ lb1(mb1 mb1Var, boolean z, byte b) {
        this.a = b;
        this.b = mb1Var;
        this.c = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        boolean z = this.c;
        mb1 mb1Var = this.b;
        switch (b) {
            case 0:
                if (!z) {
                    mb1Var.Z0.setVisibility(8);
                    break;
                }
                break;
            default:
                if (!z) {
                    mb1Var.V0.setVisibility(8);
                    break;
                }
                break;
        }
    }
}
