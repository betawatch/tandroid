// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final /* synthetic */ class c23 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ d23 b;
    public final /* synthetic */ d03 c;

    public /* synthetic */ c23(d23 d23Var, d03 d03Var, byte b) {
        this.a = b;
        this.b = d23Var;
        this.c = d03Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        d03 d03Var = this.c;
        d23 d23Var = this.b;
        switch (b) {
            case 0:
                o13 o13Var = d23Var.f;
                if (o13Var != null) {
                    o13Var.M(d03Var);
                    return;
                } else {
                    rp5.e("callback");
                    throw null;
                }
            case 1:
                o13 o13Var2 = d23Var.f;
                if (o13Var2 != null) {
                    o13Var2.M(d03Var);
                    return;
                } else {
                    rp5.e("callback");
                    throw null;
                }
            default:
                o13 o13Var3 = d23Var.f;
                if (o13Var3 != null) {
                    o13Var3.M(d03Var);
                    return;
                } else {
                    rp5.e("callback");
                    throw null;
                }
        }
    }
}
