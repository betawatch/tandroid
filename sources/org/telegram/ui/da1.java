package org.telegram.ui;

import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class da1 implements org.telegram.ui.ActionBar.r1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ TwoStepVerificationActivity b;

    public /* synthetic */ da1(TwoStepVerificationActivity twoStepVerificationActivity, int i7) {
        this.a = i7;
        this.b = twoStepVerificationActivity;
    }

    @Override // org.telegram.ui.ActionBar.r1
    public final void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        switch (this.a) {
            case 0:
                this.b.finishFragment();
                break;
            case 1:
                TL_account.declinePasswordReset declinepasswordreset = new TL_account.declinePasswordReset();
                TwoStepVerificationActivity twoStepVerificationActivity = this.b;
                twoStepVerificationActivity.getConnectionsManager().sendRequest(declinepasswordreset, new ea1(twoStepVerificationActivity, 2));
                break;
            case 2:
                this.b.p0();
                break;
            case 3:
                this.b.z0();
                break;
            default:
                this.b.z0();
                break;
        }
    }
}
