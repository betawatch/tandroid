package org.telegram.ui.Wallet;

import org.telegram.ui.TwoStepVerificationActivity;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
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
