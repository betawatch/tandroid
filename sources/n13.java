// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final /* synthetic */ class n13 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ r13 b;
    public final /* synthetic */ w03 c;

    public /* synthetic */ n13(r13 r13Var, w03 w03Var, byte b) {
        this.a = b;
        this.b = r13Var;
        this.c = w03Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        Object obj = this.c;
        r13 r13Var = this.b;
        switch (b) {
            case 0:
                h23 h23Var = r13Var.f;
                if (h23Var != null) {
                    h23Var.B(obj);
                    return;
                } else {
                    ur5.e("callback");
                    throw null;
                }
            default:
                h23 h23Var2 = r13Var.f;
                if (h23Var2 == null) {
                    ur5.e("callback");
                    throw null;
                }
                if (obj == null) {
                    obj = new v03("No provider data returned", (byte) 2);
                }
                h23Var2.B(obj);
                return;
        }
    }
}
