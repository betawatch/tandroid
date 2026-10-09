package org.telegram.ui.Wallet;

import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.ib0;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final class p2 extends TwoStepVerificationActivity {
    public final /* synthetic */ ib0 d0;

    public p2(ib0 ib0Var) {
        this.d0 = ib0Var;
    }

    @Override // org.telegram.ui.TwoStepVerificationActivity, org.telegram.ui.ActionBar.n2
    public final void onFragmentDestroy() {
        ib0 ib0Var = this.d0;
        if (((Runnable) ib0Var.d) != null && !ib0Var.c) {
            ib0Var.b();
        }
        super.onFragmentDestroy();
    }
}
