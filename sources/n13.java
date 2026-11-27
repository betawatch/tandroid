// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
