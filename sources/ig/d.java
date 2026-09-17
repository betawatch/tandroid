package ig;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class d implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ e b;

    public /* synthetic */ d(e eVar, int i10) {
        this.a = i10;
        this.b = eVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        e eVar = this.b;
        switch (i10) {
            case 0:
                eVar.a();
                break;
            case 1:
                eVar.getClass();
                TL_account.disablePeerConnectedBot disablepeerconnectedbot = new TL_account.disablePeerConnectedBot();
                int i11 = eVar.a;
                disablepeerconnectedbot.peer = MessagesController.getInstance(i11).getInputPeer(eVar.s);
                ConnectionsManager.getInstance(i11).sendRequest(disablepeerconnectedbot, null);
                MessagesController.getNotificationsSettings(i11).edit().remove("dialog_botid" + eVar.s).remove("dialog_boturl" + eVar.s).remove("dialog_botflags" + eVar.s).apply();
                NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.peerSettingsDidLoad, Long.valueOf(eVar.s));
                f.a(i11).f = false;
                break;
            default:
                of.f.s(eVar.getContext(), eVar.x);
                break;
        }
    }
}
