// default package

import org.telegram.ui.TwoStepVerificationActivity;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
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
