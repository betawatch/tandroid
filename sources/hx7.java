// default package

import org.telegram.ui.PasscodeActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class hx7 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ PasscodeActivity b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ hx7(PasscodeActivity passcodeActivity, boolean z, byte b) {
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
                    t56 t56Var = passcodeActivity.V;
                    if (t56Var != null) {
                        gm.c3(t56Var);
                        passcodeActivity.V = null;
                    }
                } else {
                    passcodeActivity.finishFragment();
                }
                nm7.e().k(51, new Object[0]);
                break;
            default:
                passcodeActivity.x.e(true, z);
                gm.r(passcodeActivity.U);
                break;
        }
    }
}
