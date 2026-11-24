// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes3.dex */
public final /* synthetic */ class gk9 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ jk9 b;

    public /* synthetic */ gk9(jk9 jk9Var, byte b) {
        this.a = b;
        this.b = jk9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        jk9 jk9Var = this.b;
        switch (b) {
            case 0:
                if (jk9Var.W != 0) {
                    jk9Var.V = true;
                    break;
                }
                break;
            default:
                jk9Var.c();
                break;
        }
    }
}
