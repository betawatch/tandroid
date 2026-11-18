package org.telegram.ui.Wallet;

import org.telegram.ui.TwoStepVerificationActivity;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes4.dex */
public final class m3 extends TwoStepVerificationActivity {
    public final /* synthetic */ m.b3 e0;

    public m3(m.b3 b3Var) {
        this.e0 = b3Var;
    }

    @Override // org.telegram.ui.TwoStepVerificationActivity, org.telegram.ui.ActionBar.h2
    public final void onFragmentDestroy() {
        m.b3 b3Var = this.e0;
        if ((((Runnable) b3Var.c) != null || ((Runnable) b3Var.d) != null) && !b3Var.b) {
            b3Var.b();
        }
        super.onFragmentDestroy();
    }
}
