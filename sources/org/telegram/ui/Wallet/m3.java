package org.telegram.ui.Wallet;

import org.telegram.ui.TwoStepVerificationActivity;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
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
