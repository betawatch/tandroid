// default package

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.TwoStepVerificationActivity;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class gi1 implements b3c {
    public final /* synthetic */ byte a;
    public final /* synthetic */ zi1 b;
    public final /* synthetic */ TwoStepVerificationActivity c;

    public /* synthetic */ gi1(zi1 zi1Var, TwoStepVerificationActivity twoStepVerificationActivity, byte b) {
        this.a = b;
        this.b = zi1Var;
        this.c = twoStepVerificationActivity;
    }

    @Override // b3c
    public final void g(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        byte b = this.a;
        TwoStepVerificationActivity twoStepVerificationActivity = this.c;
        zi1 zi1Var = this.b;
        switch (b) {
            case 0:
                zi1Var.G(false, tL_inputCheckPasswordSRP, twoStepVerificationActivity);
                break;
            case 1:
                zi1Var.G(true, tL_inputCheckPasswordSRP, twoStepVerificationActivity);
                break;
            default:
                zi1Var.G(true, tL_inputCheckPasswordSRP, twoStepVerificationActivity);
                break;
        }
    }
}
