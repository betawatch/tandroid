// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes3.dex */
public final /* synthetic */ class ej8 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ jj8 b;

    public /* synthetic */ ej8(jj8 jj8Var, byte b) {
        this.a = b;
        this.b = jj8Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        jj8 jj8Var = this.b;
        switch (b) {
            case 0:
                hj2 hj2Var = jj8Var.h;
                if (hj2Var != null) {
                    hj2Var.close();
                    break;
                }
                break;
            default:
                jj8Var.a();
                break;
        }
    }
}
