// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class fb6 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ob6 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ jz5 d;

    public /* synthetic */ fb6(ob6 ob6Var, String str, jz5 jz5Var, byte b) {
        this.a = b;
        this.b = ob6Var;
        this.c = str;
        this.d = jz5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        byte b2 = 1;
        jz5 jz5Var = this.d;
        String str = this.c;
        ob6 ob6Var = this.b;
        switch (b) {
            case 0:
                hl.c3(new fb6(ob6Var, str, jz5Var, b2));
                break;
            default:
                uc7.e1().edit().putBoolean("langpack_patched" + str, true).apply();
                jz5Var.run();
                ob6Var.Q = false;
                break;
        }
    }
}
