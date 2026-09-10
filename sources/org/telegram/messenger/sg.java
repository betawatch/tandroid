package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final /* synthetic */ class sg implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ TLObject f;

    public /* synthetic */ sg(MessagesStorage messagesStorage, long j3, boolean z10, TLRPC.InputPeer inputPeer, long j10) {
        this.e = messagesStorage;
        this.b = j3;
        this.d = z10;
        this.f = inputPeer;
        this.c = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        TLRPC.PeerSettings peerSettings;
        int i10 = this.a;
        TLObject tLObject = this.f;
        Object obj = this.e;
        switch (i10) {
            case 0:
                ((MessagesStorage) obj).lambda$loadPendingTasks$15(this.b, this.d, (TLRPC.InputPeer) tLObject, this.c);
                break;
            default:
                xh.v5 v5Var = (xh.v5) obj;
                int i11 = v5Var.a;
                if (tLObject instanceof TLRPC.TL_boolTrue) {
                    long j3 = this.b;
                    long j10 = this.c;
                    if (j3 == 0) {
                        TLRPC.UserFull userFull = MessagesController.getInstance(i11).getUserFull(j10);
                        if (userFull != null && (peerSettings = userFull.settings) != null) {
                            peerSettings.flags &= -16385;
                            peerSettings.charge_paid_message_stars = 0L;
                        }
                        MessagesController.getNotificationsSettings(i11).edit().putLong(a4.a.o(j10, "dialog_bar_paying_"), 0L).apply();
                        MessagesController.getInstance(i11).loadPeerSettings(MessagesController.getInstance(i11).getUser(Long.valueOf(j10)), MessagesController.getInstance(i11).getChat(Long.valueOf(-j10)), true);
                        ContactsController.getInstance(i11).loadPrivacySettings(true);
                        NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.messagesFeeUpdated, Long.valueOf(j10));
                        break;
                    } else {
                        v5Var.b0(-j3, j10, this.d);
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ sg(xh.v5 v5Var, TLObject tLObject, long j3, long j10, boolean z10) {
        this.e = v5Var;
        this.f = tLObject;
        this.b = j3;
        this.c = j10;
        this.d = z10;
    }
}
