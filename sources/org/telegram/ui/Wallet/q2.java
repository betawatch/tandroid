package org.telegram.ui.Wallet;

import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.mb0;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public final class q2 extends TwoStepVerificationActivity {
    public final /* synthetic */ mb0 d0;

    public q2(mb0 mb0Var) {
        this.d0 = mb0Var;
    }

    @Override // org.telegram.ui.TwoStepVerificationActivity, org.telegram.ui.ActionBar.m2
    public final void onFragmentDestroy() {
        mb0 mb0Var = this.d0;
        if (((Runnable) mb0Var.d) != null && !mb0Var.c) {
            mb0Var.b();
        }
        super.onFragmentDestroy();
    }
}
