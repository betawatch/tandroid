package ai;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes4.dex */
public final /* synthetic */ class da implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ fa b;

    public /* synthetic */ da(fa faVar, int i10) {
        this.a = i10;
        this.b = faVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        fa faVar = this.b;
        switch (i10) {
            case 0:
                faVar.b();
                break;
            case 1:
                faVar.a();
                break;
            default:
                org.telegram.ui.Components.qc qcVar = faVar.d;
                ga gaVar = faVar.q;
                da daVar = faVar.p;
                MessageObject messageObject = faVar.b;
                if (!faVar.l) {
                    faVar.l = true;
                    messageObject.addPaidReactions((int) faVar.k, true, faVar.c());
                    long j10 = gaVar.g;
                    int i11 = gaVar.a;
                    gaVar.g = j10 + faVar.k;
                    NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starBalanceUpdated, new Object[0]);
                    faVar.k = 0L;
                    NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didUpdateReactions, Long.valueOf(messageObject.getDialogId()), Integer.valueOf(messageObject.getId()), messageObject.messageOwner.reactions);
                }
                if (!faVar.m) {
                    faVar.m = true;
                    faVar.f.b = 5000L;
                    AndroidUtilities.cancelRunOnUIThread(daVar);
                    AndroidUtilities.runOnUIThread(daVar, 5000L);
                    qcVar.k(true);
                    qcVar.v = daVar;
                }
                faVar.e.b.setText(faVar.d());
                break;
        }
    }
}
