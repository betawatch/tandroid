// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final /* synthetic */ class mh0 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ oh0 b;

    public /* synthetic */ mh0(oh0 oh0Var, byte b) {
        this.a = b;
        this.b = oh0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        oh0 oh0Var = this.b;
        switch (b) {
            case 0:
                oh0Var.a(null, false);
                break;
            default:
                oh0Var.b(true);
                break;
        }
    }
}
