package org.telegram.ui;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class kj0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ PasscodeActivity b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ kj0(PasscodeActivity passcodeActivity, boolean z10, int i10) {
        this.a = i10;
        this.b = passcodeActivity;
        this.c = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                PasscodeActivity passcodeActivity = this.b;
                passcodeActivity.getMediaDataController().m();
                if (this.c) {
                    passcodeActivity.presentFragment(new PasscodeActivity(0), true);
                    pa0 pa0Var = passcodeActivity.U;
                    if (pa0Var != null) {
                        org.telegram.messenger.i0.g3(pa0Var);
                        passcodeActivity.U = null;
                    }
                } else {
                    passcodeActivity.finishFragment();
                }
                org.telegram.messenger.at.e().k(50, new Object[0]);
                break;
            default:
                PasscodeActivity passcodeActivity2 = this.b;
                passcodeActivity2.x.e(true, this.c);
                org.telegram.messenger.i0.r(passcodeActivity2.T);
                break;
        }
    }
}
