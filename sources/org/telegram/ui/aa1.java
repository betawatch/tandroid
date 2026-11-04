package org.telegram.ui;

import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class aa1 extends ra1 {
    public final /* synthetic */ TwoStepVerificationActivity l0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aa1(TwoStepVerificationActivity twoStepVerificationActivity, int i3, TL_account.Password password) {
        super(i3, 4, password);
        this.l0 = twoStepVerificationActivity;
    }

    @Override // org.telegram.ui.ra1
    public final void G0() {
        this.l0.O = true;
    }
}
