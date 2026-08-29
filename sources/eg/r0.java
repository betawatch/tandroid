package eg;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class r0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ c1 b;

    public /* synthetic */ r0(c1 c1Var, int i10) {
        this.a = i10;
        this.b = c1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        c1 c1Var = this.b;
        switch (i10) {
            case 0:
                AndroidUtilities.hideKeyboard(c1Var.d);
                break;
            case 1:
                c1Var.getClass();
                NotificationCenter.getInstance(UserConfig.selectedAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.boostByChannelCreated, c1Var.X, Boolean.TRUE);
                break;
            case 2:
                c1Var.getClass();
                NotificationCenter.getInstance(UserConfig.selectedAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.boostByChannelCreated, c1Var.X, Boolean.FALSE);
                break;
            case 3:
                c1.R(c1Var);
                break;
            default:
                c1.S(c1Var);
                break;
        }
    }
}
