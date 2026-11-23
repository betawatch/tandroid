package org.telegram.ui;

import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class ma1 extends bb1 {
    public final /* synthetic */ TwoStepVerificationActivity l0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ma1(TwoStepVerificationActivity twoStepVerificationActivity, int i7, TL_account.Password password) {
        super(i7, 4, password);
        this.l0 = twoStepVerificationActivity;
    }

    @Override // org.telegram.ui.bb1
    public final void G0() {
        this.l0.O = true;
    }
}
