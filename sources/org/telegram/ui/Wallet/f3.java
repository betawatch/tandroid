package org.telegram.ui.Wallet;

import org.telegram.ui.TwoStepVerificationActivity;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
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
