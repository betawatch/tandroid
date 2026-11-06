package org.telegram.ui.Wallet;

import org.telegram.ui.TwoStepVerificationActivity;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes4.dex */
public final class h3 extends TwoStepVerificationActivity {
    public final /* synthetic */ bg.v0 d0;

    public h3(bg.v0 v0Var) {
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
