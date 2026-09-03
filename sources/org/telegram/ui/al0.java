package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class al0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ PasscodeActivity b;

    public /* synthetic */ al0(PasscodeActivity passcodeActivity, int i10) {
        this.a = i10;
        this.b = passcodeActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                PasscodeActivity passcodeActivity = this.b;
                passcodeActivity.n.postDelayed(passcodeActivity.L, 3000L);
                passcodeActivity.K = true;
                break;
            case 1:
                PasscodeActivity passcodeActivity2 = new PasscodeActivity(0);
                PasscodeActivity passcodeActivity3 = this.b;
                passcodeActivity3.presentFragment(passcodeActivity2, true);
                sb0 sb0Var = passcodeActivity3.N;
                if (sb0Var != null) {
                    AndroidUtilities.runOnUIThread(sb0Var);
                    passcodeActivity3.N = null;
                    break;
                }
                break;
            case 2:
                PasscodeActivity passcodeActivity4 = this.b;
                AndroidUtilities.runOnUIThread(new al0(passcodeActivity4, 3), passcodeActivity4.e0() ? 150L : 1000L);
                break;
            case 3:
                PasscodeActivity passcodeActivity5 = this.b;
                if (passcodeActivity5.e0()) {
                    for (ds dsVar : passcodeActivity5.n.f) {
                        dsVar.i(0.0f);
                    }
                    break;
                } else {
                    passcodeActivity5.f.a(0.0f);
                    break;
                }
            case 4:
                PasscodeActivity passcodeActivity6 = this.b;
                passcodeActivity6.K = false;
                AndroidUtilities.updateViewVisibilityAnimated(passcodeActivity6.r, false);
                break;
            default:
                this.b.k0();
                break;
        }
    }
}
