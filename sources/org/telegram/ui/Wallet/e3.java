package org.telegram.ui.Wallet;

import org.telegram.ui.TwoStepVerificationActivity;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes4.dex */
public final class e3 extends TwoStepVerificationActivity {
    public final /* synthetic */ bg.u0 e0;

    public e3(bg.u0 u0Var) {
        this.e0 = u0Var;
    }

    @Override // org.telegram.ui.TwoStepVerificationActivity, org.telegram.ui.ActionBar.e2
    public final void onFragmentDestroy() {
        bg.u0 u0Var = this.e0;
        if (((Runnable) u0Var.d) != null && !u0Var.c) {
            u0Var.a();
        }
        super.onFragmentDestroy();
    }
}
