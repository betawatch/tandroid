// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class m91 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ o91 b;

    public /* synthetic */ m91(o91 o91Var, byte b) {
        this.a = b;
        this.b = o91Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        o91 o91Var = this.b;
        switch (b) {
            case 0:
                o91Var.x = false;
                o91Var.c();
                break;
            default:
                o91Var.a.setVisibility(4);
                break;
        }
    }
}
