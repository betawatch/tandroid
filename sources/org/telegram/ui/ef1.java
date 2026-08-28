package org.telegram.ui;

import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ef1 implements org.telegram.ui.ActionBar.b2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ TwoStepVerificationActivity b;

    public /* synthetic */ ef1(TwoStepVerificationActivity twoStepVerificationActivity, int i9) {
        this.a = i9;
        this.b = twoStepVerificationActivity;
    }

    @Override // org.telegram.ui.ActionBar.b2
    public final void f(org.telegram.ui.ActionBar.c2 c2Var, int i9) {
        switch (this.a) {
            case 0:
                this.b.finishFragment();
                break;
            case 1:
                TL_account.declinePasswordReset declinepasswordreset = new TL_account.declinePasswordReset();
                TwoStepVerificationActivity twoStepVerificationActivity = this.b;
                twoStepVerificationActivity.getConnectionsManager().sendRequest(declinepasswordreset, new ff1(twoStepVerificationActivity, 2));
                break;
            case 2:
                this.b.j0();
                break;
            case 3:
                this.b.t0();
                break;
            default:
                this.b.t0();
                break;
        }
    }
}
