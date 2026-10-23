package org.telegram.ui.Wallet;

import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.ta0;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes4.dex */
public final class q2 extends TwoStepVerificationActivity {
    public final /* synthetic */ ta0 d0;

    public q2(ta0 ta0Var) {
        this.d0 = ta0Var;
    }

    @Override // org.telegram.ui.TwoStepVerificationActivity, org.telegram.ui.ActionBar.o2
    public final void onFragmentDestroy() {
        ta0 ta0Var = this.d0;
        if (((Runnable) ta0Var.d) != null && !ta0Var.c) {
            ta0Var.b();
        }
        super.onFragmentDestroy();
    }
}
