package org.telegram.ui.Wallet;

import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.nb0;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public final class p2 extends TwoStepVerificationActivity {
    public final /* synthetic */ nb0 d0;

    public p2(nb0 nb0Var) {
        this.d0 = nb0Var;
    }

    @Override // org.telegram.ui.TwoStepVerificationActivity, org.telegram.ui.ActionBar.m2
    public final void onFragmentDestroy() {
        nb0 nb0Var = this.d0;
        if (((Runnable) nb0Var.d) != null && !nb0Var.c) {
            nb0Var.b();
        }
        super.onFragmentDestroy();
    }
}
