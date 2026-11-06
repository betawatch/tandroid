package org.telegram.ui;

import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
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
