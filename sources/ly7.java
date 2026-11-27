// default package

import org.telegram.ui.PasscodeActivity;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class ly7 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ PasscodeActivity b;

    public /* synthetic */ ly7(PasscodeActivity passcodeActivity, byte b) {
        this.a = b;
        this.b = passcodeActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        PasscodeActivity passcodeActivity = this.b;
        switch (b) {
            case 0:
                passcodeActivity.n.postDelayed(passcodeActivity.T, 3000L);
                passcodeActivity.S = true;
                break;
            case 1:
                se4 se4Var = passcodeActivity.W;
                if (se4Var != null) {
                    hl.c3(se4Var);
                    passcodeActivity.W = null;
                }
                passcodeActivity.finishFragment();
                break;
            case 2:
                passcodeActivity.presentFragment(new PasscodeActivity(0), true);
                w56 w56Var = passcodeActivity.V;
                if (w56Var != null) {
                    hl.c3(w56Var);
                    passcodeActivity.V = null;
                    break;
                }
                break;
            case 3:
                hl.d3(new ly7(passcodeActivity, (byte) 4), passcodeActivity.p0() ? 150L : 1000L);
                break;
            case 4:
                if (passcodeActivity.p0()) {
                    for (ok2 ok2Var : passcodeActivity.n.f) {
                        ok2Var.A(0.0f);
                    }
                    break;
                } else {
                    passcodeActivity.f.a(0.0f);
                    break;
                }
            case 5:
                passcodeActivity.S = false;
                hl.R3(passcodeActivity.r, false);
                break;
            default:
                passcodeActivity.x0();
                break;
        }
    }
}
