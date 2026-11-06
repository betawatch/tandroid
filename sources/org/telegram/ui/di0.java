package org.telegram.ui;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final /* synthetic */ class di0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ PasscodeActivity b;

    public /* synthetic */ di0(PasscodeActivity passcodeActivity, int i7) {
        this.a = i7;
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
                org.telegram.ui.Wallet.n nVar = passcodeActivity2.V;
                if (nVar != null) {
                    org.telegram.messenger.g0.h3(nVar);
                    passcodeActivity2.V = null;
                }
                passcodeActivity2.finishFragment();
                break;
            case 2:
                PasscodeActivity passcodeActivity3 = new PasscodeActivity(0);
                PasscodeActivity passcodeActivity4 = this.b;
                passcodeActivity4.presentFragment(passcodeActivity3, true);
                l90 l90Var = passcodeActivity4.U;
                if (l90Var != null) {
                    org.telegram.messenger.g0.h3(l90Var);
                    passcodeActivity4.U = null;
                    break;
                }
                break;
            case 3:
                PasscodeActivity passcodeActivity5 = this.b;
                org.telegram.messenger.g0.i3(new di0(passcodeActivity5, 4), passcodeActivity5.s0() ? 150L : 1000L);
                break;
            case 4:
                PasscodeActivity passcodeActivity6 = this.b;
                if (passcodeActivity6.s0()) {
                    for (br brVar : passcodeActivity6.n.f) {
                        brVar.z(0.0f);
                    }
                    break;
                } else {
                    passcodeActivity6.f.a(0.0f);
                    break;
                }
            case 5:
                PasscodeActivity passcodeActivity7 = this.b;
                passcodeActivity7.R = false;
                org.telegram.messenger.g0.X3(passcodeActivity7.r, false);
                break;
            default:
                this.b.y0();
                break;
        }
    }
}
