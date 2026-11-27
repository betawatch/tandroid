// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class h02 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ n12 b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ h02(n12 n12Var, boolean z, byte b) {
        this.a = b;
        this.b = n12Var;
        this.c = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        boolean z = this.c;
        n12 n12Var = this.b;
        switch (b) {
            case 0:
                if (!z) {
                    n12Var.Z2.setVisibility(8);
                    break;
                }
                break;
            case 1:
                if (!z) {
                    n12Var.v1.setVisibility(8);
                    break;
                }
                break;
            case 2:
                if (!z) {
                    n12Var.x1.setVisibility(8);
                    break;
                }
                break;
            default:
                if (!z) {
                    n12Var.getClass();
                    break;
                } else {
                    n12Var.u3.setVisibility(4);
                    break;
                }
        }
    }
}
