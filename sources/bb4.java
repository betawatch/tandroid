// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final /* synthetic */ class bb4 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ gb4 b;

    public /* synthetic */ bb4(gb4 gb4Var, byte b) {
        this.a = b;
        this.b = gb4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        gb4 gb4Var = this.b;
        switch (b) {
            case 0:
                Runnable runnable = gb4Var.l;
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            default:
                Runnable runnable2 = gb4Var.l;
                if (runnable2 != null) {
                    runnable2.run();
                    break;
                }
                break;
        }
    }
}
