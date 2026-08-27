package cg;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class r0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ d1 b;

    public /* synthetic */ r0(d1 d1Var, int i10) {
        this.a = i10;
        this.b = d1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        d1 d1Var = this.b;
        switch (i10) {
            case 0:
                AndroidUtilities.hideKeyboard(d1Var.d);
                break;
            case 1:
                d1Var.getClass();
                NotificationCenter.getInstance(UserConfig.selectedAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.boostByChannelCreated, d1Var.X, Boolean.TRUE);
                break;
            case 2:
                d1Var.getClass();
                NotificationCenter.getInstance(UserConfig.selectedAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.boostByChannelCreated, d1Var.X, Boolean.FALSE);
                break;
            case 3:
                d1.R(d1Var);
                break;
            default:
                d1.S(d1Var);
                break;
        }
    }
}
