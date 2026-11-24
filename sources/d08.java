// default package

import org.telegram.ui.TwoStepVerificationActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class d08 extends TwoStepVerificationActivity {
    public final /* synthetic */ s34 e0;

    public d08(s34 s34Var) {
        this.e0 = s34Var;
    }

    @Override // org.telegram.ui.TwoStepVerificationActivity, org.telegram.ui.ActionBar.d
    public final void onFragmentDestroy() {
        s34 s34Var = this.e0;
        if ((((qn4) s34Var.c) != null || ((c25) s34Var.d) != null) && !s34Var.b) {
            s34Var.f();
        }
        super.onFragmentDestroy();
    }
}
