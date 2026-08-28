package org.telegram.ui;

import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class lf1 extends ag1 {
    public final /* synthetic */ TwoStepVerificationActivity g0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lf1(TwoStepVerificationActivity twoStepVerificationActivity, int i9, TL_account.Password password) {
        super(i9, 4, password);
        this.g0 = twoStepVerificationActivity;
    }

    @Override // org.telegram.ui.ag1
    public final void A0() {
        this.g0.J = true;
    }
}
