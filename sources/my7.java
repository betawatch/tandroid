// default package

import org.telegram.ui.PasscodeActivity;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class my7 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ PasscodeActivity b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ my7(PasscodeActivity passcodeActivity, boolean z, byte b) {
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
                    w56 w56Var = passcodeActivity.V;
                    if (w56Var != null) {
                        hl.c3(w56Var);
                        passcodeActivity.V = null;
                    }
                } else {
                    passcodeActivity.finishFragment();
                }
                jn7.e().k(51, new Object[0]);
                break;
            default:
                passcodeActivity.x.e(true, z);
                hl.r(passcodeActivity.U);
                break;
        }
    }
}
