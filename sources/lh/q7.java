package lh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.ic;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final /* synthetic */ class q7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ s7 b;

    public /* synthetic */ q7(s7 s7Var, int i10) {
        this.a = i10;
        this.b = s7Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        s7 s7Var = this.b;
        switch (i10) {
            case 0:
                s7Var.b();
                break;
            case 1:
                s7Var.a();
                break;
            default:
                ic icVar = s7Var.d;
                t7 t7Var = s7Var.q;
                q7 q7Var = s7Var.p;
                MessageObject messageObject = s7Var.b;
                if (!s7Var.l) {
                    s7Var.l = true;
                    messageObject.addPaidReactions((int) s7Var.k, true, s7Var.c());
                    long j10 = t7Var.g;
                    int i11 = t7Var.a;
                    t7Var.g = j10 + s7Var.k;
                    NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starBalanceUpdated, new Object[0]);
                    s7Var.k = 0L;
                    NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didUpdateReactions, Long.valueOf(messageObject.getDialogId()), Integer.valueOf(messageObject.getId()), messageObject.messageOwner.reactions);
                }
                if (!s7Var.m) {
                    s7Var.m = true;
                    s7Var.f.b = 5000L;
                    AndroidUtilities.cancelRunOnUIThread(q7Var);
                    AndroidUtilities.runOnUIThread(q7Var, 5000L);
                    icVar.k(true);
                    icVar.v = q7Var;
                }
                s7Var.e.b.setText(s7Var.d());
                break;
        }
    }
}
