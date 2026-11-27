// default package

import org.telegram.ui.TwoStepVerificationActivity;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
