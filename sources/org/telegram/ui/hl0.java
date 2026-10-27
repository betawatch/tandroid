package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
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
                passcodeActivity.n.postDelayed(passcodeActivity.S, 3000L);
                passcodeActivity.R = true;
                break;
            case 1:
                PasscodeActivity passcodeActivity2 = this.b;
                yc1 yc1Var = passcodeActivity2.V;
                if (yc1Var != null) {
                    AndroidUtilities.runOnUIThread(yc1Var);
                    passcodeActivity2.V = null;
                }
                passcodeActivity2.finishFragment();
                break;
            case 2:
                PasscodeActivity passcodeActivity3 = new PasscodeActivity(0);
                PasscodeActivity passcodeActivity4 = this.b;
                passcodeActivity4.presentFragment(passcodeActivity3, true);
                jb0 jb0Var = passcodeActivity4.U;
                if (jb0Var != null) {
                    AndroidUtilities.runOnUIThread(jb0Var);
                    passcodeActivity4.U = null;
                    break;
                }
                break;
            case 3:
                PasscodeActivity passcodeActivity5 = this.b;
                AndroidUtilities.runOnUIThread(new hl0(passcodeActivity5, 4), passcodeActivity5.o0() ? 150L : 1000L);
                break;
            case 4:
                PasscodeActivity passcodeActivity6 = this.b;
                if (passcodeActivity6.o0()) {
                    for (zr zrVar : passcodeActivity6.n.f) {
                        zrVar.i(0.0f);
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
