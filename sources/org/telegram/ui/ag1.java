package org.telegram.ui;

import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class ag1 extends qg1 {
    public final /* synthetic */ TwoStepVerificationActivity h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ag1(TwoStepVerificationActivity twoStepVerificationActivity, int i10, TL_account.Password password) {
        super(i10, 4, password);
        this.h0 = twoStepVerificationActivity;
    }

    @Override // org.telegram.ui.qg1
    public final void B0() {
        this.h0.K = true;
    }
}
