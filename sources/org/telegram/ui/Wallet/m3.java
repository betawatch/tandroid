package org.telegram.ui.Wallet;

import org.telegram.ui.TwoStepVerificationActivity;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes4.dex */
public final class m3 extends TwoStepVerificationActivity {
    public final /* synthetic */ m.b3 e0;

    public m3(m.b3 b3Var) {
        this.e0 = b3Var;
    }

    @Override // org.telegram.ui.TwoStepVerificationActivity, org.telegram.ui.ActionBar.g2
    public final void onFragmentDestroy() {
        m.b3 b3Var = this.e0;
        if ((((Runnable) b3Var.c) != null || ((Runnable) b3Var.d) != null) && !b3Var.b) {
            b3Var.b();
        }
        super.onFragmentDestroy();
    }
}
