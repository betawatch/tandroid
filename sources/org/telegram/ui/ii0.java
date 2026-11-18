package org.telegram.ui;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class ii0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ PasscodeActivity b;

    public /* synthetic */ ii0(PasscodeActivity passcodeActivity, int i7) {
        this.a = i7;
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
                b31 b31Var = passcodeActivity2.W;
                if (b31Var != null) {
                    org.telegram.messenger.g0.g3(b31Var);
                    passcodeActivity2.W = null;
                }
                passcodeActivity2.finishFragment();
                break;
            case 2:
                PasscodeActivity passcodeActivity3 = new PasscodeActivity(0);
                PasscodeActivity passcodeActivity4 = this.b;
                passcodeActivity4.presentFragment(passcodeActivity3, true);
                l90 l90Var = passcodeActivity4.V;
                if (l90Var != null) {
                    org.telegram.messenger.g0.g3(l90Var);
                    passcodeActivity4.V = null;
                    break;
                }
                break;
            case 3:
                PasscodeActivity passcodeActivity5 = this.b;
                org.telegram.messenger.g0.h3(new ii0(passcodeActivity5, 4), passcodeActivity5.s0() ? 150L : 1000L);
                break;
            case 4:
                PasscodeActivity passcodeActivity6 = this.b;
                if (passcodeActivity6.s0()) {
                    for (er erVar : passcodeActivity6.n.f) {
                        erVar.A(0.0f);
                    }
                    break;
                } else {
                    passcodeActivity6.f.a(0.0f);
                    break;
                }
            case 5:
                PasscodeActivity passcodeActivity7 = this.b;
                passcodeActivity7.S = false;
                org.telegram.messenger.g0.V3(passcodeActivity7.r, false);
                break;
            default:
                this.b.y0();
                break;
        }
    }
}
