// default package

import org.telegram.ui.PasscodeActivity;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class ev7 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ PasscodeActivity b;

    public /* synthetic */ ev7(PasscodeActivity passcodeActivity, byte b) {
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
                vc4 vc4Var = passcodeActivity.W;
                if (vc4Var != null) {
                    gl.c3(vc4Var);
                    passcodeActivity.W = null;
                }
                passcodeActivity.finishFragment();
                break;
            case 2:
                passcodeActivity.presentFragment(new PasscodeActivity(0), true);
                t36 t36Var = passcodeActivity.V;
                if (t36Var != null) {
                    gl.c3(t36Var);
                    passcodeActivity.V = null;
                    break;
                }
                break;
            case 3:
                gl.d3(new ev7(passcodeActivity, (byte) 4), passcodeActivity.p0() ? 150L : 1000L);
                break;
            case 4:
                if (passcodeActivity.p0()) {
                    for (sj2 sj2Var : passcodeActivity.n.f) {
                        sj2Var.A(0.0f);
                    }
                    break;
                } else {
                    passcodeActivity.f.a(0.0f);
                    break;
                }
            case 5:
                passcodeActivity.S = false;
                gl.R3(passcodeActivity.r, false);
                break;
            default:
                passcodeActivity.w0();
                break;
        }
    }
}
