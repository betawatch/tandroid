package org.telegram.ui.Wallet;

import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.na0;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes4.dex */
public final class r2 extends TwoStepVerificationActivity {
    public final /* synthetic */ na0 d0;

    public r2(na0 na0Var) {
        this.d0 = na0Var;
    }

    @Override // org.telegram.ui.TwoStepVerificationActivity, org.telegram.ui.ActionBar.n2
    public final void onFragmentDestroy() {
        na0 na0Var = this.d0;
        if (((Runnable) na0Var.d) != null && !na0Var.c) {
            na0Var.b();
        }
        super.onFragmentDestroy();
    }
}
