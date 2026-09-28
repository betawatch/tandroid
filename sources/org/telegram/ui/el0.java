package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes3.dex */
public final /* synthetic */ class el0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ PasscodeActivity b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ el0(PasscodeActivity passcodeActivity, boolean z10, int i10) {
        this.a = i10;
        this.b = passcodeActivity;
        this.c = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                PasscodeActivity passcodeActivity = this.b;
                passcodeActivity.getMediaDataController().buildShortcuts();
                if (this.c) {
                    passcodeActivity.presentFragment(new PasscodeActivity(0), true);
                    ub0 ub0Var = passcodeActivity.Q;
                    if (ub0Var != null) {
                        AndroidUtilities.runOnUIThread(ub0Var);
                        passcodeActivity.Q = null;
                    }
                } else {
                    passcodeActivity.finishFragment();
                }
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetPasscode, new Object[0]);
                break;
            default:
                PasscodeActivity passcodeActivity2 = this.b;
                passcodeActivity2.w.e(true, this.c);
                AndroidUtilities.cancelRunOnUIThread(passcodeActivity2.P);
                break;
        }
    }
}
