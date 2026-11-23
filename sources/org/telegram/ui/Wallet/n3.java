package org.telegram.ui.Wallet;

import org.telegram.ui.TwoStepVerificationActivity;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final class n3 extends TwoStepVerificationActivity {
    public final /* synthetic */ m.b3 e0;

    public n3(m.b3 b3Var) {
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
