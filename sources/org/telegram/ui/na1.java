package org.telegram.ui;

import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class na1 extends cb1 {
    public final /* synthetic */ TwoStepVerificationActivity k0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public na1(TwoStepVerificationActivity twoStepVerificationActivity, int i7, TL_account.Password password) {
        super(i7, 4, password);
        this.k0 = twoStepVerificationActivity;
    }

    @Override // org.telegram.ui.cb1
    public final void G0() {
        this.k0.N = true;
    }
}
