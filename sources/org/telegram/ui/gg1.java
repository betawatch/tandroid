package org.telegram.ui;

import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class gg1 extends vg1 {
    public final /* synthetic */ TwoStepVerificationActivity h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gg1(TwoStepVerificationActivity twoStepVerificationActivity, int i10, TL_account.Password password) {
        super(i10, 4, password);
        this.h0 = twoStepVerificationActivity;
    }

    @Override // org.telegram.ui.vg1
    public final void B0() {
        this.h0.K = true;
    }
}
