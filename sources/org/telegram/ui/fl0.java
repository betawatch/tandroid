package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class fl0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ PasscodeActivity b;

    public /* synthetic */ fl0(PasscodeActivity passcodeActivity, int i10) {
        this.a = i10;
        this.b = passcodeActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                PasscodeActivity passcodeActivity = this.b;
                passcodeActivity.n.postDelayed(passcodeActivity.S, 3000L);
                passcodeActivity.R = true;
                break;
            case 1:
                PasscodeActivity passcodeActivity2 = this.b;
                zc1 zc1Var = passcodeActivity2.V;
                if (zc1Var != null) {
                    AndroidUtilities.runOnUIThread(zc1Var);
                    passcodeActivity2.V = null;
                }
                passcodeActivity2.finishFragment();
                break;
            case 2:
                PasscodeActivity passcodeActivity3 = new PasscodeActivity(0);
                PasscodeActivity passcodeActivity4 = this.b;
                passcodeActivity4.presentFragment(passcodeActivity3, true);
                hb0 hb0Var = passcodeActivity4.U;
                if (hb0Var != null) {
                    AndroidUtilities.runOnUIThread(hb0Var);
                    passcodeActivity4.U = null;
                    break;
                }
                break;
            case 3:
                PasscodeActivity passcodeActivity5 = this.b;
                AndroidUtilities.runOnUIThread(new fl0(passcodeActivity5, 4), passcodeActivity5.o0() ? 150L : 1000L);
                break;
            case 4:
                PasscodeActivity passcodeActivity6 = this.b;
                if (passcodeActivity6.o0()) {
                    for (xr xrVar : passcodeActivity6.n.f) {
                        xrVar.i(0.0f);
                    }
                    break;
                } else {
                    passcodeActivity6.f.a(0.0f);
                    break;
                }
            case 5:
                PasscodeActivity passcodeActivity7 = this.b;
                passcodeActivity7.R = false;
                AndroidUtilities.updateViewVisibilityAnimated(passcodeActivity7.r, false);
                break;
            default:
                this.b.u0();
                break;
        }
    }
}
