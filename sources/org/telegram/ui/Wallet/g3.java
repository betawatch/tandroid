package org.telegram.ui.Wallet;

import org.telegram.ui.TwoStepVerificationActivity;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes4.dex */
public final class g3 extends TwoStepVerificationActivity {
    public final /* synthetic */ bg.v0 d0;

    public g3(bg.v0 v0Var) {
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
