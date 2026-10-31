package org.telegram.ui;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class mj0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ PasscodeActivity b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ mj0(PasscodeActivity passcodeActivity, boolean z10, int i10) {
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
                    qa0 qa0Var = passcodeActivity.U;
                    if (qa0Var != null) {
                        org.telegram.messenger.i0.g3(qa0Var);
                        passcodeActivity.U = null;
                    }
                } else {
                    passcodeActivity.finishFragment();
                }
                org.telegram.messenger.zs.e().k(50, new Object[0]);
                break;
            default:
                PasscodeActivity passcodeActivity2 = this.b;
                passcodeActivity2.x.e(true, this.c);
                org.telegram.messenger.i0.r(passcodeActivity2.T);
                break;
        }
    }
}
