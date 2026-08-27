package org.telegram.ui;

import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class kf1 extends zf1 {
    public final /* synthetic */ TwoStepVerificationActivity g0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kf1(TwoStepVerificationActivity twoStepVerificationActivity, int i10, TL_account.Password password) {
        super(i10, 4, password);
        this.g0 = twoStepVerificationActivity;
    }

    @Override // org.telegram.ui.zf1
    public final void B0() {
        this.g0.J = true;
    }
}
