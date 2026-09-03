package gg;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class q0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ b1 b;

    public /* synthetic */ q0(b1 b1Var, int i10) {
        this.a = i10;
        this.b = b1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        b1 b1Var = this.b;
        switch (i10) {
            case 0:
                AndroidUtilities.hideKeyboard(b1Var.d);
                break;
            case 1:
                b1Var.getClass();
                NotificationCenter.getInstance(UserConfig.selectedAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.boostByChannelCreated, b1Var.Y, Boolean.TRUE);
                break;
            case 2:
                b1Var.getClass();
                NotificationCenter.getInstance(UserConfig.selectedAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.boostByChannelCreated, b1Var.Y, Boolean.FALSE);
                break;
            case 3:
                b1.R(b1Var);
                break;
            default:
                b1.S(b1Var);
                break;
        }
    }
}
