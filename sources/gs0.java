// default package

import org.telegram.ui.TwoStepVerificationActivity;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class gs0 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ss0 b;
    public final /* synthetic */ TwoStepVerificationActivity c;

    public /* synthetic */ gs0(ss0 ss0Var, TwoStepVerificationActivity twoStepVerificationActivity, byte b) {
        this.a = b;
        this.b = ss0Var;
        this.c = twoStepVerificationActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        TwoStepVerificationActivity twoStepVerificationActivity = this.c;
        ss0 ss0Var = this.b;
        switch (b) {
            case 0:
                ss0Var.i0.setLoading(false);
                ss0Var.presentFragment(twoStepVerificationActivity);
                break;
            default:
                ss0Var.b0.setLoading(false);
                ss0Var.presentFragment(twoStepVerificationActivity);
                break;
        }
    }
}
