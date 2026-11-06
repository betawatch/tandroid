package org.telegram.ui.Wallet;

import org.telegram.ui.TwoStepVerificationActivity;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes4.dex */
public final class h3 extends TwoStepVerificationActivity {
    public final /* synthetic */ bg.v0 d0;

    public h3(bg.v0 v0Var) {
        this.d0 = v0Var;
    }

    @Override // org.telegram.ui.TwoStepVerificationActivity, org.telegram.ui.ActionBar.f2
    public final void onFragmentDestroy() {
        bg.v0 v0Var = this.d0;
        if (((Runnable) v0Var.d) != null && !v0Var.c) {
            v0Var.a();
        }
        super.onFragmentDestroy();
    }
}
