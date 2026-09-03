package mh;

import org.telegram.messenger.ContactsController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final /* synthetic */ class y6 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ long b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ long d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ TLObject f;

    public /* synthetic */ y6(t7 t7Var, TLObject tLObject, long j10, long j11, boolean z4) {
        this.e = t7Var;
        this.f = tLObject;
        this.b = j10;
        this.d = j11;
        this.c = z4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        TLRPC.PeerSettings peerSettings;
        int i10 = this.a;
        TLObject tLObject = this.f;
        Object obj = this.e;
        switch (i10) {
            case 0:
                t7 t7Var = (t7) obj;
                int i11 = t7Var.a;
                if (tLObject instanceof TLRPC.TL_boolTrue) {
                    long j10 = this.b;
                    long j11 = this.d;
                    if (j10 == 0) {
                        TLRPC.UserFull userFull = MessagesController.getInstance(i11).getUserFull(j11);
                        if (userFull != null && (peerSettings = userFull.settings) != null) {
                            peerSettings.flags &= -16385;
                            peerSettings.charge_paid_message_stars = 0L;
                        }
                        MessagesController.getNotificationsSettings(i11).edit().putLong(android.support.v4.media.a.n(j11, "dialog_bar_paying_"), 0L).apply();
                        MessagesController.getInstance(i11).loadPeerSettings(MessagesController.getInstance(i11).getUser(Long.valueOf(j11)), MessagesController.getInstance(i11).getChat(Long.valueOf(-j11)), true);
                        ContactsController.getInstance(i11).loadPrivacySettings(true);
                        NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.messagesFeeUpdated, Long.valueOf(j11));
                        break;
                    } else {
                        t7Var.b0(-j10, j11, this.c);
                        break;
                    }
                }
                break;
            default:
                ((MessagesStorage) obj).lambda$loadPendingTasks$15(this.b, this.c, (TLRPC.InputPeer) tLObject, this.d);
                break;
        }
    }

    public /* synthetic */ y6(MessagesStorage messagesStorage, long j10, boolean z4, TLRPC.InputPeer inputPeer, long j11) {
        this.e = messagesStorage;
        this.b = j10;
        this.c = z4;
        this.f = inputPeer;
        this.d = j11;
    }
}
