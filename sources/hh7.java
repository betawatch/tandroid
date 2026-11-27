// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class hh7 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ih7 b;

    public /* synthetic */ hh7(ih7 ih7Var, byte b) {
        this.a = b;
        this.b = ih7Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        ih7 ih7Var = this.b;
        switch (b) {
            case 0:
                ih7Var.x();
                break;
            default:
                ih7Var.m(true);
                break;
        }
    }
}
