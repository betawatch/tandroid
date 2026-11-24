// default package

import org.telegram.ui.TwoStepVerificationActivity;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class hi1 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ zi1 b;
    public final /* synthetic */ uxa c;
    public final /* synthetic */ TwoStepVerificationActivity d;

    public /* synthetic */ hi1(zi1 zi1Var, uxa uxaVar, TwoStepVerificationActivity twoStepVerificationActivity, byte b) {
        this.a = b;
        this.b = zi1Var;
        this.c = uxaVar;
        this.d = twoStepVerificationActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        TwoStepVerificationActivity twoStepVerificationActivity = this.d;
        uxa uxaVar = this.c;
        zi1 zi1Var = this.b;
        switch (b) {
            case 0:
                zi1Var.A0.setLoading(false);
                uxaVar.presentFragment(twoStepVerificationActivity);
                break;
            case 1:
                zi1Var.G0.setLoading(false);
                uxaVar.presentFragment(twoStepVerificationActivity);
                break;
            default:
                zi1Var.G0.setLoading(false);
                uxaVar.presentFragment(twoStepVerificationActivity);
                break;
        }
    }
}
