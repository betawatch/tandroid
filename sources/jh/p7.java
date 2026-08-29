package jh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.mc;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final /* synthetic */ class p7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ r7 b;

    public /* synthetic */ p7(r7 r7Var, int i10) {
        this.a = i10;
        this.b = r7Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        r7 r7Var = this.b;
        switch (i10) {
            case 0:
                r7Var.b();
                break;
            case 1:
                r7Var.a();
                break;
            default:
                mc mcVar = r7Var.d;
                s7 s7Var = r7Var.q;
                p7 p7Var = r7Var.p;
                MessageObject messageObject = r7Var.b;
                if (!r7Var.l) {
                    r7Var.l = true;
                    messageObject.addPaidReactions((int) r7Var.k, true, r7Var.c());
                    long j10 = s7Var.g;
                    int i11 = s7Var.a;
                    s7Var.g = j10 + r7Var.k;
                    NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starBalanceUpdated, new Object[0]);
                    r7Var.k = 0L;
                    NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didUpdateReactions, Long.valueOf(messageObject.getDialogId()), Integer.valueOf(messageObject.getId()), messageObject.messageOwner.reactions);
                }
                if (!r7Var.m) {
                    r7Var.m = true;
                    r7Var.f.b = 5000L;
                    AndroidUtilities.cancelRunOnUIThread(p7Var);
                    AndroidUtilities.runOnUIThread(p7Var, 5000L);
                    mcVar.k(true);
                    mcVar.v = p7Var;
                }
                r7Var.e.b.setText(r7Var.d());
                break;
        }
    }
}
