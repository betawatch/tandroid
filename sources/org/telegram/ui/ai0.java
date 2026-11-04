package org.telegram.ui;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ai0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ PasscodeActivity b;

    public /* synthetic */ ai0(PasscodeActivity passcodeActivity, int i3) {
        this.a = i3;
        this.b = passcodeActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                PasscodeActivity passcodeActivity = this.b;
                passcodeActivity.n.postDelayed(passcodeActivity.T, 3000L);
                passcodeActivity.S = true;
                break;
            case 1:
                PasscodeActivity passcodeActivity2 = this.b;
                ma1 ma1Var = passcodeActivity2.W;
                if (ma1Var != null) {
                    org.telegram.messenger.g0.h3(ma1Var);
                    passcodeActivity2.W = null;
                }
                passcodeActivity2.finishFragment();
                break;
            case 2:
                PasscodeActivity passcodeActivity3 = new PasscodeActivity(0);
                PasscodeActivity passcodeActivity4 = this.b;
                passcodeActivity4.presentFragment(passcodeActivity3, true);
                i90 i90Var = passcodeActivity4.V;
                if (i90Var != null) {
                    org.telegram.messenger.g0.h3(i90Var);
                    passcodeActivity4.V = null;
                    break;
                }
                break;
            case 3:
                PasscodeActivity passcodeActivity5 = this.b;
                org.telegram.messenger.g0.i3(new ai0(passcodeActivity5, 4), passcodeActivity5.s0() ? 150L : 1000L);
                break;
            case 4:
                PasscodeActivity passcodeActivity6 = this.b;
                if (passcodeActivity6.s0()) {
                    for (zq zqVar : passcodeActivity6.n.f) {
                        zqVar.z(0.0f);
                    }
                    break;
                } else {
                    passcodeActivity6.f.a(0.0f);
                    break;
                }
            case 5:
                PasscodeActivity passcodeActivity7 = this.b;
                passcodeActivity7.S = false;
                org.telegram.messenger.g0.X3(passcodeActivity7.r, false);
                break;
            default:
                this.b.y0();
                break;
        }
    }
}
