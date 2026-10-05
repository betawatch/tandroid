package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final /* synthetic */ class hl0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ PasscodeActivity b;

    public /* synthetic */ hl0(PasscodeActivity passcodeActivity, int i10) {
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
                yb0 yb0Var = passcodeActivity3.Q;
                if (yb0Var != null) {
                    AndroidUtilities.runOnUIThread(yb0Var);
                    passcodeActivity3.Q = null;
                    break;
                }
                break;
            case 2:
                PasscodeActivity passcodeActivity4 = this.b;
                AndroidUtilities.runOnUIThread(new hl0(passcodeActivity4, 3), passcodeActivity4.k0() ? 150L : 1000L);
                break;
            case 3:
                PasscodeActivity passcodeActivity5 = this.b;
                if (passcodeActivity5.k0()) {
                    for (es esVar : passcodeActivity5.n.f) {
                        esVar.i(0.0f);
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
                this.b.q0();
                break;
        }
    }
}
