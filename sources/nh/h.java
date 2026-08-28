package nh;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final /* synthetic */ class h implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ o b;

    public /* synthetic */ h(o oVar, int i9) {
        this.a = i9;
        this.b = oVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i9 = this.a;
        o oVar = this.b;
        switch (i9) {
            case 0:
                o.V(oVar);
                break;
            default:
                oVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_CHAT));
                break;
        }
    }
}
