package org.telegram.ui;

import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class ia1 extends xa1 {
    public final /* synthetic */ TwoStepVerificationActivity l0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ia1(TwoStepVerificationActivity twoStepVerificationActivity, int i7, TL_account.Password password) {
        super(i7, 4, password);
        this.l0 = twoStepVerificationActivity;
    }

    @Override // org.telegram.ui.xa1
    public final void G0() {
        this.l0.O = true;
    }
}
