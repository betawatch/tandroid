package org.telegram.ui;

import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final /* synthetic */ class dg1 implements org.telegram.ui.ActionBar.a2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ TwoStepVerificationActivity b;

    public /* synthetic */ dg1(TwoStepVerificationActivity twoStepVerificationActivity, int i10) {
        this.a = i10;
        this.b = twoStepVerificationActivity;
    }

    @Override // org.telegram.ui.ActionBar.a2
    public final void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.a) {
            case 0:
                this.b.finishFragment();
                break;
            case 1:
                TL_account.declinePasswordReset declinepasswordreset = new TL_account.declinePasswordReset();
                TwoStepVerificationActivity twoStepVerificationActivity = this.b;
                twoStepVerificationActivity.getConnectionsManager().sendRequest(declinepasswordreset, new eg1(twoStepVerificationActivity, 2));
                break;
            case 2:
                this.b.k0();
                break;
            case 3:
                this.b.u0();
                break;
            default:
                this.b.u0();
                break;
        }
    }
}
