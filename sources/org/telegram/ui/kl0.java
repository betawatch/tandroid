package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final /* synthetic */ class kl0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ PasscodeActivity b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ kl0(PasscodeActivity passcodeActivity, boolean z10, int i10) {
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
                    ac0 ac0Var = passcodeActivity.Q;
                    if (ac0Var != null) {
                        AndroidUtilities.runOnUIThread(ac0Var);
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
