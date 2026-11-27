// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class ll7 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ sl7 b;

    public /* synthetic */ ll7(sl7 sl7Var, byte b) {
        this.a = b;
        this.b = sl7Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        sl7 sl7Var = this.b;
        switch (b) {
            case 0:
                hl.t1(sl7Var.l1);
                break;
            default:
                hl.E3(sl7Var.m1.getEditText());
                break;
        }
    }
}
