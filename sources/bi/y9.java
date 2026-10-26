package bi;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final /* synthetic */ class y9 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ aa b;

    public /* synthetic */ y9(aa aaVar, int i10) {
        this.a = i10;
        this.b = aaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        aa aaVar = this.b;
        switch (i10) {
            case 0:
                aaVar.b();
                break;
            case 1:
                aaVar.a();
                break;
            default:
                org.telegram.ui.Components.qc qcVar = aaVar.d;
                ca caVar = aaVar.q;
                y9 y9Var = aaVar.p;
                MessageObject messageObject = aaVar.b;
                if (!aaVar.l) {
                    aaVar.l = true;
                    messageObject.addPaidReactions((int) aaVar.k, true, aaVar.c());
                    long j10 = caVar.g;
                    int i11 = caVar.a;
                    caVar.g = j10 + aaVar.k;
                    NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starBalanceUpdated, new Object[0]);
                    aaVar.k = 0L;
                    NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didUpdateReactions, Long.valueOf(messageObject.getDialogId()), Integer.valueOf(messageObject.getId()), messageObject.messageOwner.reactions);
                }
                if (!aaVar.m) {
                    aaVar.m = true;
                    aaVar.f.b = 5000L;
                    AndroidUtilities.cancelRunOnUIThread(y9Var);
                    AndroidUtilities.runOnUIThread(y9Var, 5000L);
                    qcVar.k(true);
                    qcVar.w = y9Var;
                }
                aaVar.e.b.setText(aaVar.d());
                break;
        }
    }
}
