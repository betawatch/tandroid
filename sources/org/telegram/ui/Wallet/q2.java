package org.telegram.ui.Wallet;

import org.telegram.ui.TwoStepVerificationActivity;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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
