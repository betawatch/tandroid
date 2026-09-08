package org.telegram.ui;

import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final /* synthetic */ class lg1 implements org.telegram.ui.ActionBar.a2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ TwoStepVerificationActivity b;

    public /* synthetic */ lg1(TwoStepVerificationActivity twoStepVerificationActivity, int i10) {
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
                twoStepVerificationActivity.getConnectionsManager().sendRequest(declinepasswordreset, new mg1(twoStepVerificationActivity, 2));
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
