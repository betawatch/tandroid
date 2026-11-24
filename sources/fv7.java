// default package

import org.telegram.ui.PasscodeActivity;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class fv7 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ PasscodeActivity b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ fv7(PasscodeActivity passcodeActivity, boolean z, byte b) {
        this.a = b;
        this.b = passcodeActivity;
        this.c = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        boolean z = this.c;
        PasscodeActivity passcodeActivity = this.b;
        switch (b) {
            case 0:
                passcodeActivity.getMediaDataController().o();
                if (z) {
                    passcodeActivity.presentFragment(new PasscodeActivity(0), true);
                    t36 t36Var = passcodeActivity.V;
                    if (t36Var != null) {
                        gl.c3(t36Var);
                        passcodeActivity.V = null;
                    }
                } else {
                    passcodeActivity.finishFragment();
                }
                kk7.e().k(50, new Object[0]);
                break;
            default:
                passcodeActivity.x.e(true, z);
                gl.r(passcodeActivity.U);
                break;
        }
    }
}
