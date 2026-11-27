// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class jj8 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ mj8 b;

    public /* synthetic */ jj8(mj8 mj8Var, byte b) {
        this.a = b;
        this.b = mj8Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        mj8 mj8Var = this.b;
        switch (b) {
            case 0:
                mj8Var.a(true);
                break;
            default:
                mj8Var.d();
                break;
        }
    }
}
