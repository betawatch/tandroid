// default package

import org.telegram.ui.TwoStepVerificationActivity;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
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
