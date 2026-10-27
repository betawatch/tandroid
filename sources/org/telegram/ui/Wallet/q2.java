package org.telegram.ui.Wallet;

import org.telegram.ui.TwoStepVerificationActivity;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class q2 extends TwoStepVerificationActivity {
    public final /* synthetic */ ag.b1 d0;

    public q2(ag.b1 b1Var) {
        this.d0 = b1Var;
    }

    @Override // org.telegram.ui.TwoStepVerificationActivity, org.telegram.ui.ActionBar.r2
    public final void onFragmentDestroy() {
        ag.b1 b1Var = this.d0;
        if (((Runnable) b1Var.d) != null && !b1Var.c) {
            b1Var.b();
        }
        super.onFragmentDestroy();
    }
}
