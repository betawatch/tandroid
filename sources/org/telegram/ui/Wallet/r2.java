package org.telegram.ui.Wallet;

import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.pa0;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes4.dex */
public final class r2 extends TwoStepVerificationActivity {
    public final /* synthetic */ pa0 d0;

    public r2(pa0 pa0Var) {
        this.d0 = pa0Var;
    }

    @Override // org.telegram.ui.TwoStepVerificationActivity, org.telegram.ui.ActionBar.n2
    public final void onFragmentDestroy() {
        pa0 pa0Var = this.d0;
        if (((Runnable) pa0Var.d) != null && !pa0Var.c) {
            pa0Var.b();
        }
        super.onFragmentDestroy();
    }
}
