package org.telegram.ui.Wallet;

import org.telegram.ui.TwoStepVerificationActivity;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class f3 extends TwoStepVerificationActivity {
    public final /* synthetic */ cg.u0 e0;

    public f3(cg.u0 u0Var) {
        this.e0 = u0Var;
    }

    @Override // org.telegram.ui.TwoStepVerificationActivity, org.telegram.ui.ActionBar.d2
    public final void onFragmentDestroy() {
        cg.u0 u0Var = this.e0;
        if (((Runnable) u0Var.d) != null && !u0Var.c) {
            u0Var.a();
        }
        super.onFragmentDestroy();
    }
}
