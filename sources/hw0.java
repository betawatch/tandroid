// default package

import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes3.dex */
public final class hw0 extends d6 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ xw0 b;

    public /* synthetic */ hw0(xw0 xw0Var, byte b) {
        this.a = b;
        this.b = xw0Var;
    }

    @Override // d6
    public final void b(int i) {
        byte b = this.a;
        xw0 xw0Var = this.b;
        switch (b) {
            case 0:
                if (i != -1) {
                    if (i == R.id.menu_collapse_bot) {
                        xw0Var.z0 = true;
                        xw0Var.m(true);
                        break;
                    }
                } else if (!xw0Var.E.A()) {
                    xw0Var.v();
                    break;
                }
                break;
            default:
                if (i == -1) {
                    xw0Var.v();
                    break;
                }
                break;
        }
    }
}
