// default package

import org.telegram.ui.PasscodeActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class gx7 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ PasscodeActivity b;

    public /* synthetic */ gx7(PasscodeActivity passcodeActivity, byte b) {
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
                ve4 ve4Var = passcodeActivity.W;
                if (ve4Var != null) {
                    gm.c3(ve4Var);
                    passcodeActivity.W = null;
                }
                passcodeActivity.finishFragment();
                break;
            case 2:
                passcodeActivity.presentFragment(new PasscodeActivity(0), true);
                t56 t56Var = passcodeActivity.V;
                if (t56Var != null) {
                    gm.c3(t56Var);
                    passcodeActivity.V = null;
                    break;
                }
                break;
            case 3:
                gm.d3(new gx7(passcodeActivity, (byte) 4), passcodeActivity.q0() ? 150L : 1000L);
                break;
            case 4:
                if (passcodeActivity.q0()) {
                    for (gl2 gl2Var : passcodeActivity.n.f) {
                        gl2Var.A(0.0f);
                    }
                    break;
                } else {
                    passcodeActivity.f.a(0.0f);
                    break;
                }
            case 5:
                passcodeActivity.S = false;
                gm.R3(passcodeActivity.r, false);
                break;
            default:
                passcodeActivity.x0();
                break;
        }
    }
}
