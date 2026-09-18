package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final /* synthetic */ class ml0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ PasscodeActivity b;

    public /* synthetic */ ml0(PasscodeActivity passcodeActivity, int i10) {
        this.a = i10;
        this.b = passcodeActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                PasscodeActivity passcodeActivity = this.b;
                passcodeActivity.n.postDelayed(passcodeActivity.O, 3000L);
                passcodeActivity.N = true;
                break;
            case 1:
                PasscodeActivity passcodeActivity2 = new PasscodeActivity(0);
                PasscodeActivity passcodeActivity3 = this.b;
                passcodeActivity3.presentFragment(passcodeActivity2, true);
                bc0 bc0Var = passcodeActivity3.Q;
                if (bc0Var != null) {
                    AndroidUtilities.runOnUIThread(bc0Var);
                    passcodeActivity3.Q = null;
                    break;
                }
                break;
            case 2:
                PasscodeActivity passcodeActivity4 = this.b;
                AndroidUtilities.runOnUIThread(new ml0(passcodeActivity4, 3), passcodeActivity4.e0() ? 150L : 1000L);
                break;
            case 3:
                PasscodeActivity passcodeActivity5 = this.b;
                if (passcodeActivity5.e0()) {
                    for (gs gsVar : passcodeActivity5.n.f) {
                        gsVar.i(0.0f);
                    }
                    break;
                } else {
                    passcodeActivity5.f.a(0.0f);
                    break;
                }
            case 4:
                PasscodeActivity passcodeActivity6 = this.b;
                passcodeActivity6.N = false;
                AndroidUtilities.updateViewVisibilityAnimated(passcodeActivity6.r, false);
                break;
            default:
                this.b.k0();
                break;
        }
    }
}
