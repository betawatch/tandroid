// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class bz8 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ jo0 b;
    public final /* synthetic */ ry8 c;

    public /* synthetic */ bz8(jo0 jo0Var, ry8 ry8Var, byte b) {
        this.a = b;
        this.b = jo0Var;
        this.c = ry8Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        ry8 ry8Var = this.c;
        jo0 jo0Var = this.b;
        switch (b) {
            case 0:
                gl.c3(new bz8(jo0Var, ry8Var, (byte) 1));
                break;
            default:
                jo0Var.removeView(ry8Var);
                break;
        }
    }
}
