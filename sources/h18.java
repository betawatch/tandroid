// default package

import org.telegram.ui.TwoStepVerificationActivity;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
