// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes3.dex */
public final /* synthetic */ class hi4 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ mi4 b;
    public final /* synthetic */ ae9 c;

    public /* synthetic */ hi4(mi4 mi4Var, ae9 ae9Var, byte b) {
        this.a = b;
        this.b = mi4Var;
        this.c = ae9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        ae9 ae9Var = this.c;
        mi4 mi4Var = this.b;
        mi4Var.getClass();
        switch (b) {
            case 0:
                gl.d3(new hi4(mi4Var, ae9Var, (byte) 1), 320L);
                break;
            default:
                ae9Var.a(new hj3(mi4Var, (byte) 9));
                break;
        }
    }
}
