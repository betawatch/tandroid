package org.telegram.ui;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ei0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ PasscodeActivity b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ ei0(PasscodeActivity passcodeActivity, boolean z9, int i7) {
        this.a = i7;
        this.b = passcodeActivity;
        this.c = z9;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                PasscodeActivity passcodeActivity = this.b;
                passcodeActivity.getMediaDataController().m();
                if (this.c) {
                    passcodeActivity.presentFragment(new PasscodeActivity(0), true);
                    l90 l90Var = passcodeActivity.U;
                    if (l90Var != null) {
                        org.telegram.messenger.g0.h3(l90Var);
                        passcodeActivity.U = null;
                    }
                } else {
                    passcodeActivity.finishFragment();
                }
                org.telegram.messenger.qs.e().k(50, new Object[0]);
                break;
            default:
                PasscodeActivity passcodeActivity2 = this.b;
                passcodeActivity2.x.e(true, this.c);
                org.telegram.messenger.g0.r(passcodeActivity2.T);
                break;
        }
    }
}
