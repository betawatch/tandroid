package org.telegram.ui.Wallet;

import org.telegram.ui.TwoStepVerificationActivity;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes4.dex */
public final class f3 extends TwoStepVerificationActivity {
    public final /* synthetic */ bg.v0 d0;

    public f3(bg.v0 v0Var) {
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
