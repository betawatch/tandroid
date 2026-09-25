package fi;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes4.dex */
public final /* synthetic */ class h implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ p b;

    public /* synthetic */ h(p pVar, int i10) {
        this.a = i10;
        this.b = pVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        p pVar = this.b;
        switch (i10) {
            case 0:
                p.W(pVar);
                break;
            default:
                pVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_CHAT));
                break;
        }
    }
}
