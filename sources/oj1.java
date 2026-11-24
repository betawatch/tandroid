// default package

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.TwoStepVerificationActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class oj1 implements c5c {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ik1 b;
    public final /* synthetic */ TwoStepVerificationActivity c;

    public /* synthetic */ oj1(ik1 ik1Var, TwoStepVerificationActivity twoStepVerificationActivity, byte b) {
        this.a = b;
        this.b = ik1Var;
        this.c = twoStepVerificationActivity;
    }

    @Override // c5c
    public final void h(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        byte b = this.a;
        TwoStepVerificationActivity twoStepVerificationActivity = this.c;
        ik1 ik1Var = this.b;
        switch (b) {
            case 0:
                ik1Var.G(false, tL_inputCheckPasswordSRP, twoStepVerificationActivity);
                break;
            case 1:
                ik1Var.G(true, tL_inputCheckPasswordSRP, twoStepVerificationActivity);
                break;
            default:
                ik1Var.G(true, tL_inputCheckPasswordSRP, twoStepVerificationActivity);
                break;
        }
    }
}
