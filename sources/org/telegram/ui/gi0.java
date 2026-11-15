package org.telegram.ui;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class gi0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ PasscodeActivity b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ gi0(PasscodeActivity passcodeActivity, boolean z10, int i7) {
        this.a = i7;
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
                    m90 m90Var = passcodeActivity.V;
                    if (m90Var != null) {
                        org.telegram.messenger.g0.h3(m90Var);
                        passcodeActivity.V = null;
                    }
                } else {
                    passcodeActivity.finishFragment();
                }
                org.telegram.messenger.ns.e().k(50, new Object[0]);
                break;
            default:
                PasscodeActivity passcodeActivity2 = this.b;
                passcodeActivity2.x.e(true, this.c);
                org.telegram.messenger.g0.r(passcodeActivity2.U);
                break;
        }
    }
}
