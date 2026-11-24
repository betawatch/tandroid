// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final /* synthetic */ class a23 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ d23 b;
    public final /* synthetic */ Throwable c;

    public /* synthetic */ a23(d23 d23Var, Throwable th, byte b) {
        this.a = b;
        this.b = d23Var;
        this.c = th;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        Throwable th = this.c;
        d23 d23Var = this.b;
        switch (b) {
            case 0:
                o13 o13Var = d23Var.f;
                if (o13Var != null) {
                    o13Var.M(new z03(new h1((byte) 26), th.getMessage()));
                    return;
                } else {
                    rp5.e("callback");
                    throw null;
                }
            default:
                o13 o13Var2 = d23Var.f;
                if (o13Var2 != null) {
                    o13Var2.M(new c03(th.getMessage(), (byte) 2));
                    return;
                } else {
                    rp5.e("callback");
                    throw null;
                }
        }
    }
}
