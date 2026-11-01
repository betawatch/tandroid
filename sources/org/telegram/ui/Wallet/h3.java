package org.telegram.ui.Wallet;

import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.z90;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class h3 extends TwoStepVerificationActivity {
    public final /* synthetic */ z90 d0;

    public h3(z90 z90Var) {
        this.d0 = z90Var;
    }

    @Override // org.telegram.ui.TwoStepVerificationActivity, org.telegram.ui.ActionBar.k2
    public final void onFragmentDestroy() {
        z90 z90Var = this.d0;
        if (((Runnable) z90Var.d) != null && !z90Var.c) {
            z90Var.a();
        }
        super.onFragmentDestroy();
    }
}
