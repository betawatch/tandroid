package org.telegram.ui;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class jj0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ PasscodeActivity b;

    public /* synthetic */ jj0(PasscodeActivity passcodeActivity, int i10) {
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
                y01 y01Var = passcodeActivity2.V;
                if (y01Var != null) {
                    org.telegram.messenger.i0.g3(y01Var);
                    passcodeActivity2.V = null;
                }
                passcodeActivity2.finishFragment();
                break;
            case 2:
                PasscodeActivity passcodeActivity3 = new PasscodeActivity(0);
                PasscodeActivity passcodeActivity4 = this.b;
                passcodeActivity4.presentFragment(passcodeActivity3, true);
                pa0 pa0Var = passcodeActivity4.U;
                if (pa0Var != null) {
                    org.telegram.messenger.i0.g3(pa0Var);
                    passcodeActivity4.U = null;
                    break;
                }
                break;
            case 3:
                PasscodeActivity passcodeActivity5 = this.b;
                org.telegram.messenger.i0.h3(new jj0(passcodeActivity5, 4), passcodeActivity5.s0() ? 150L : 1000L);
                break;
            case 4:
                PasscodeActivity passcodeActivity6 = this.b;
                if (passcodeActivity6.s0()) {
                    for (bs bsVar : passcodeActivity6.n.f) {
                        bsVar.z(0.0f);
                    }
                    break;
                } else {
                    passcodeActivity6.f.a(0.0f);
                    break;
                }
            case 5:
                PasscodeActivity passcodeActivity7 = this.b;
                passcodeActivity7.R = false;
                org.telegram.messenger.i0.W3(passcodeActivity7.r, false);
                break;
            default:
                this.b.y0();
                break;
        }
    }
}
