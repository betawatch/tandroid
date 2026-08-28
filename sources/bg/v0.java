package bg;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class v0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ h1 b;

    public /* synthetic */ v0(h1 h1Var, int i9) {
        this.a = i9;
        this.b = h1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i9 = this.a;
        h1 h1Var = this.b;
        switch (i9) {
            case 0:
                AndroidUtilities.hideKeyboard(h1Var.d);
                break;
            case 1:
                h1Var.getClass();
                NotificationCenter.getInstance(UserConfig.selectedAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.boostByChannelCreated, h1Var.X, Boolean.TRUE);
                break;
            case 2:
                h1Var.getClass();
                NotificationCenter.getInstance(UserConfig.selectedAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.boostByChannelCreated, h1Var.X, Boolean.FALSE);
                break;
            case 3:
                h1.Q(h1Var);
                break;
            default:
                h1.R(h1Var);
                break;
        }
    }
}
