// default package

import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.TwoStepVerificationActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class a5c extends p5c {
    public final /* synthetic */ TwoStepVerificationActivity l0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a5c(TwoStepVerificationActivity twoStepVerificationActivity, int i, TL_account.Password password) {
        super(i, 4, password);
        this.l0 = twoStepVerificationActivity;
    }

    @Override // p5c
    public final void G0() {
        this.l0.O = true;
    }
}
