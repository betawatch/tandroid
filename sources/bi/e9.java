package bi;

import org.telegram.messenger.ContactsController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final /* synthetic */ class e9 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ long b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ long d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ TLObject f;

    public /* synthetic */ e9(ca caVar, TLObject tLObject, long j10, long j11, boolean z10) {
        this.e = caVar;
        this.f = tLObject;
        this.b = j10;
        this.d = j11;
        this.c = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        TLRPC.PeerSettings peerSettings;
        int i10 = this.a;
        TLObject tLObject = this.f;
        Object obj = this.e;
        switch (i10) {
            case 0:
                ca caVar = (ca) obj;
                int i11 = caVar.a;
                if (tLObject instanceof TLRPC.TL_boolTrue) {
                    long j10 = this.b;
                    long j11 = this.d;
                    if (j10 == 0) {
                        TLRPC.UserFull userFull = MessagesController.getInstance(i11).getUserFull(j11);
                        if (userFull != null && (peerSettings = userFull.settings) != null) {
                            peerSettings.flags &= -16385;
                            peerSettings.charge_paid_message_stars = 0L;
                        }
                        MessagesController.getNotificationsSettings(i11).edit().putLong(a1.g.o(j11, "dialog_bar_paying_"), 0L).apply();
                        MessagesController.getInstance(i11).loadPeerSettings(MessagesController.getInstance(i11).getUser(Long.valueOf(j11)), MessagesController.getInstance(i11).getChat(Long.valueOf(-j11)), true);
                        ContactsController.getInstance(i11).loadPrivacySettings(true);
                        NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.messagesFeeUpdated, Long.valueOf(j11));
                        break;
                    } else {
                        caVar.b0(-j10, j11, this.c);
                        break;
                    }
                }
                break;
            default:
                ((MessagesStorage) obj).lambda$loadPendingTasks$15(this.b, this.c, (TLRPC.InputPeer) tLObject, this.d);
                break;
        }
    }

    public /* synthetic */ e9(MessagesStorage messagesStorage, long j10, boolean z10, TLRPC.InputPeer inputPeer, long j11) {
        this.e = messagesStorage;
        this.b = j10;
        this.c = z10;
        this.f = inputPeer;
        this.d = j11;
    }
}
