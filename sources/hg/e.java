package hg;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final /* synthetic */ class e implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ f b;

    public /* synthetic */ e(f fVar, int i10) {
        this.a = i10;
        this.b = fVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        f fVar = this.b;
        switch (i10) {
            case 0:
                fVar.a();
                break;
            case 1:
                fVar.getClass();
                TL_account.disablePeerConnectedBot disablepeerconnectedbot = new TL_account.disablePeerConnectedBot();
                int i11 = fVar.a;
                disablepeerconnectedbot.peer = MessagesController.getInstance(i11).getInputPeer(fVar.s);
                ConnectionsManager.getInstance(i11).sendRequest(disablepeerconnectedbot, null);
                MessagesController.getNotificationsSettings(i11).edit().remove("dialog_botid" + fVar.s).remove("dialog_boturl" + fVar.s).remove("dialog_botflags" + fVar.s).apply();
                NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.peerSettingsDidLoad, Long.valueOf(fVar.s));
                g.a(i11).f = false;
                break;
            default:
                nf.f.s(fVar.getContext(), fVar.x);
                break;
        }
    }
}
