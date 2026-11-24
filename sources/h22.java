// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class h22 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ j22 b;

    public /* synthetic */ h22(j22 j22Var, byte b) {
        this.a = b;
        this.b = j22Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        j22 j22Var = this.b;
        switch (b) {
            case 0:
                if (j22Var.f != null) {
                    j22Var.w = yjb.k(new StringBuilder("+"), j22Var.f.phone, p38.f());
                    j22Var.s = j22Var.f;
                    gl.c3(new h22(j22Var, (byte) 1));
                    break;
                }
                break;
            default:
                j22Var.c.l(j22Var.w, false);
                break;
        }
    }
}
