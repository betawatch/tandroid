package org.telegram.ui;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class fi0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ PasscodeActivity b;

    public /* synthetic */ fi0(PasscodeActivity passcodeActivity, int i7) {
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
                fy0 fy0Var = passcodeActivity2.W;
                if (fy0Var != null) {
                    org.telegram.messenger.g0.h3(fy0Var);
                    passcodeActivity2.W = null;
                }
                passcodeActivity2.finishFragment();
                break;
            case 2:
                PasscodeActivity passcodeActivity3 = new PasscodeActivity(0);
                PasscodeActivity passcodeActivity4 = this.b;
                passcodeActivity4.presentFragment(passcodeActivity3, true);
                m90 m90Var = passcodeActivity4.V;
                if (m90Var != null) {
                    org.telegram.messenger.g0.h3(m90Var);
                    passcodeActivity4.V = null;
                    break;
                }
                break;
            case 3:
                PasscodeActivity passcodeActivity5 = this.b;
                org.telegram.messenger.g0.i3(new fi0(passcodeActivity5, 4), passcodeActivity5.s0() ? 150L : 1000L);
                break;
            case 4:
                PasscodeActivity passcodeActivity6 = this.b;
                if (passcodeActivity6.s0()) {
                    for (dr drVar : passcodeActivity6.n.f) {
                        drVar.A(0.0f);
                    }
                    break;
                } else {
                    passcodeActivity6.f.a(0.0f);
                    break;
                }
            case 5:
                PasscodeActivity passcodeActivity7 = this.b;
                passcodeActivity7.S = false;
                org.telegram.messenger.g0.W3(passcodeActivity7.r, false);
                break;
            default:
                this.b.y0();
                break;
        }
    }
}
