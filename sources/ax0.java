// default package

import org.telegram.ui.ActionBar.e;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class ax0 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ nx0 b;

    public /* synthetic */ ax0(nx0 nx0Var, byte b) {
        this.a = b;
        this.b = nx0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        nx0 nx0Var = this.b;
        switch (b) {
            case 0:
                ex0 ex0Var = nx0Var.c;
                hl.B2(ex0Var);
                nx0Var.i1.getLayoutContainer().addView(ex0Var);
                break;
            case 1:
                nx0Var.dismiss();
                break;
            case 2:
                try {
                    nx0Var.H();
                    break;
                } catch (Exception e) {
                    cc4.g(e, true);
                    return;
                }
            case 3:
                nx0Var.dismiss();
                e S = LaunchActivity.S();
                if (S != null) {
                    S.presentFragment(new PremiumPreviewFragment(0, "create_bot"));
                    break;
                }
                break;
            case 4:
                nx0Var.dismiss();
                jn7.f(yac.t0).k(jn7.V2, new Object[0]);
                hl.d3(new pg6((byte) 18), 220L);
                break;
            default:
                nx0Var.c0 = true;
                nx0Var.d0 = true;
                break;
        }
    }
}
