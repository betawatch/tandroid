package org.telegram.ui;

import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class nf1 extends cg1 {
    public final /* synthetic */ TwoStepVerificationActivity g0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nf1(TwoStepVerificationActivity twoStepVerificationActivity, int i10, TL_account.Password password) {
        super(i10, 4, password);
        this.g0 = twoStepVerificationActivity;
    }

    @Override // org.telegram.ui.cg1
    public final void B0() {
        this.g0.J = true;
    }
}
