// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class eu7 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ gu7 b;
    public final /* synthetic */ qx c;

    public /* synthetic */ eu7(gu7 gu7Var, qx qxVar, byte b) {
        this.a = b;
        this.b = gu7Var;
        this.c = qxVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        qx qxVar = this.c;
        gu7 gu7Var = this.b;
        switch (b) {
            case 0:
                gu7Var.p(qxVar, true);
                break;
            default:
                gu7Var.f.f(new eu7(gu7Var, qxVar, (byte) 0));
                break;
        }
    }
}
