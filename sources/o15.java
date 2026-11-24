// default package

import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.TwoStepVerificationActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class o15 implements ee {
    public final /* synthetic */ byte a;
    public final /* synthetic */ TwoStepVerificationActivity b;

    public /* synthetic */ o15(TwoStepVerificationActivity twoStepVerificationActivity, byte b) {
        this.a = b;
        this.b = twoStepVerificationActivity;
    }

    @Override // ee
    public final void r(he heVar, int i) {
        byte b = this.a;
        TwoStepVerificationActivity twoStepVerificationActivity = this.b;
        switch (b) {
            case 0:
                twoStepVerificationActivity.presentFragment(new p5c(6, null));
                break;
            case 1:
                twoStepVerificationActivity.finishFragment();
                break;
            case 2:
                twoStepVerificationActivity.getConnectionsManager().sendRequest(new TL_account.declinePasswordReset(), new t4c(twoStepVerificationActivity, (byte) 2));
                break;
            case 3:
                twoStepVerificationActivity.d0();
                break;
            case 4:
                twoStepVerificationActivity.z0();
                break;
            default:
                twoStepVerificationActivity.z0();
                break;
        }
    }
}
