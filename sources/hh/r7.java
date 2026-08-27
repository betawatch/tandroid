package hh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.ec;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final /* synthetic */ class r7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ t7 b;

    public /* synthetic */ r7(t7 t7Var, int i10) {
        this.a = i10;
        this.b = t7Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        t7 t7Var = this.b;
        switch (i10) {
            case 0:
                t7Var.b();
                break;
            case 1:
                t7Var.a();
                break;
            default:
                ec ecVar = t7Var.d;
                u7 u7Var = t7Var.q;
                r7 r7Var = t7Var.p;
                MessageObject messageObject = t7Var.b;
                if (!t7Var.l) {
                    t7Var.l = true;
                    messageObject.addPaidReactions((int) t7Var.k, true, t7Var.c());
                    long j10 = u7Var.g;
                    int i11 = u7Var.a;
                    u7Var.g = j10 + t7Var.k;
                    NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starBalanceUpdated, new Object[0]);
                    t7Var.k = 0L;
                    NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didUpdateReactions, Long.valueOf(messageObject.getDialogId()), Integer.valueOf(messageObject.getId()), messageObject.messageOwner.reactions);
                }
                if (!t7Var.m) {
                    t7Var.m = true;
                    t7Var.f.b = 5000L;
                    AndroidUtilities.cancelRunOnUIThread(r7Var);
                    AndroidUtilities.runOnUIThread(r7Var, 5000L);
                    ecVar.k(true);
                    ecVar.v = r7Var;
                }
                t7Var.e.b.setText(t7Var.d());
                break;
        }
    }
}
