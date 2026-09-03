package org.telegram.ui;

import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class gg1 extends wg1 {
    public final /* synthetic */ TwoStepVerificationActivity h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gg1(TwoStepVerificationActivity twoStepVerificationActivity, int i10, TL_account.Password password) {
        super(i10, 4, password);
        this.h0 = twoStepVerificationActivity;
    }

    @Override // org.telegram.ui.wg1
    public final void B0() {
        this.h0.K = true;
    }
}
