package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class bl0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ PasscodeActivity b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ bl0(PasscodeActivity passcodeActivity, boolean z4, int i10) {
        this.a = i10;
        this.b = passcodeActivity;
        this.c = z4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                PasscodeActivity passcodeActivity = this.b;
                passcodeActivity.getMediaDataController().buildShortcuts();
                if (this.c) {
                    passcodeActivity.presentFragment(new PasscodeActivity(0), true);
                    sb0 sb0Var = passcodeActivity.N;
                    if (sb0Var != null) {
                        AndroidUtilities.runOnUIThread(sb0Var);
                        passcodeActivity.N = null;
                    }
                } else {
                    passcodeActivity.finishFragment();
                }
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetPasscode, new Object[0]);
                break;
            default:
                PasscodeActivity passcodeActivity2 = this.b;
                passcodeActivity2.w.e(true, this.c);
                AndroidUtilities.cancelRunOnUIThread(passcodeActivity2.M);
                break;
        }
    }
}
