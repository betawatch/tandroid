// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final /* synthetic */ class cb6 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ls5 b;
    public final /* synthetic */ lb6 c;

    public /* synthetic */ cb6(ls5 ls5Var, lb6 lb6Var, byte b) {
        this.a = b;
        this.b = ls5Var;
        this.c = lb6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        lb6 lb6Var = this.c;
        ls5 ls5Var = this.b;
        switch (b) {
            case 0:
                ls5Var.run();
                lb6Var.a();
                break;
            default:
                ls5Var.run();
                lb6Var.a();
                break;
        }
    }
}
