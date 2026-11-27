// default package

import org.telegram.ui.TwoStepVerificationActivity;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class h18 extends TwoStepVerificationActivity {
    public final /* synthetic */ c34 e0;

    public h18(c34 c34Var) {
        this.e0 = c34Var;
    }

    @Override // org.telegram.ui.TwoStepVerificationActivity, org.telegram.ui.ActionBar.e
    public final void onFragmentDestroy() {
        c34 c34Var = this.e0;
        if ((((rj4) c34Var.c) != null || ((g25) c34Var.d) != null) && !c34Var.b) {
            c34Var.f();
        }
        super.onFragmentDestroy();
    }
}
