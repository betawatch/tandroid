package ai;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes4.dex */
public final /* synthetic */ class ca implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ea b;

    public /* synthetic */ ca(ea eaVar, int i10) {
        this.a = i10;
        this.b = eaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        ea eaVar = this.b;
        switch (i10) {
            case 0:
                eaVar.b();
                break;
            case 1:
                eaVar.a();
                break;
            default:
                org.telegram.ui.Components.qc qcVar = eaVar.d;
                fa faVar = eaVar.q;
                ca caVar = eaVar.p;
                MessageObject messageObject = eaVar.b;
                if (!eaVar.l) {
                    eaVar.l = true;
                    messageObject.addPaidReactions((int) eaVar.k, true, eaVar.c());
                    long j10 = faVar.g;
                    int i11 = faVar.a;
                    faVar.g = j10 + eaVar.k;
                    NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starBalanceUpdated, new Object[0]);
                    eaVar.k = 0L;
                    NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didUpdateReactions, Long.valueOf(messageObject.getDialogId()), Integer.valueOf(messageObject.getId()), messageObject.messageOwner.reactions);
                }
                if (!eaVar.m) {
                    eaVar.m = true;
                    eaVar.f.b = 5000L;
                    AndroidUtilities.cancelRunOnUIThread(caVar);
                    AndroidUtilities.runOnUIThread(caVar, 5000L);
                    qcVar.k(true);
                    qcVar.v = caVar;
                }
                eaVar.e.b.setText(eaVar.d());
                break;
        }
    }
}
