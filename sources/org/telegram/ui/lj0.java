package org.telegram.ui;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class lj0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ PasscodeActivity b;

    public /* synthetic */ lj0(PasscodeActivity passcodeActivity, int i10) {
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
                t11 t11Var = passcodeActivity2.V;
                if (t11Var != null) {
                    org.telegram.messenger.i0.g3(t11Var);
                    passcodeActivity2.V = null;
                }
                passcodeActivity2.finishFragment();
                break;
            case 2:
                PasscodeActivity passcodeActivity3 = new PasscodeActivity(0);
                PasscodeActivity passcodeActivity4 = this.b;
                passcodeActivity4.presentFragment(passcodeActivity3, true);
                qa0 qa0Var = passcodeActivity4.U;
                if (qa0Var != null) {
                    org.telegram.messenger.i0.g3(qa0Var);
                    passcodeActivity4.U = null;
                    break;
                }
                break;
            case 3:
                PasscodeActivity passcodeActivity5 = this.b;
                org.telegram.messenger.i0.h3(new lj0(passcodeActivity5, 4), passcodeActivity5.r0() ? 150L : 1000L);
                break;
            case 4:
                PasscodeActivity passcodeActivity6 = this.b;
                if (passcodeActivity6.r0()) {
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
                this.b.x0();
                break;
        }
    }
}
