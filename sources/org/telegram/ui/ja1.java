package org.telegram.ui;

import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class ja1 extends ya1 {
    public final /* synthetic */ TwoStepVerificationActivity k0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ja1(TwoStepVerificationActivity twoStepVerificationActivity, int i7, TL_account.Password password) {
        super(i7, 4, password);
        this.k0 = twoStepVerificationActivity;
    }

    @Override // org.telegram.ui.ya1
    public final void G0() {
        this.k0.N = true;
    }
}
