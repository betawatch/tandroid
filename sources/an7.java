// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final /* synthetic */ class an7 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ jn7 b;

    public /* synthetic */ an7(jn7 jn7Var, byte b) {
        this.a = b;
        this.b = jn7Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        jn7 jn7Var = this.b;
        switch (b) {
            case 0:
            case 2:
                jn7Var.c();
                break;
            case 1:
                jn7Var.getClass();
                jn7Var.i = new an7(jn7Var, (byte) 2);
                break;
            default:
                jn7Var.o();
                break;
        }
    }
}
