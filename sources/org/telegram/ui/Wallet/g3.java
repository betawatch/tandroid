package org.telegram.ui.Wallet;

import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.aa0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class g3 extends TwoStepVerificationActivity {
    public final /* synthetic */ aa0 d0;

    public g3(aa0 aa0Var) {
        this.d0 = aa0Var;
    }

    @Override // org.telegram.ui.TwoStepVerificationActivity, org.telegram.ui.ActionBar.k2
    public final void onFragmentDestroy() {
        aa0 aa0Var = this.d0;
        if (((Runnable) aa0Var.d) != null && !aa0Var.c) {
            aa0Var.a();
        }
        super.onFragmentDestroy();
    }
}
