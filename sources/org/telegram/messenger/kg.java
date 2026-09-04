package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public final /* synthetic */ class kg implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ TLObject f;

    public /* synthetic */ kg(MessagesStorage messagesStorage, long j3, boolean z10, TLRPC.InputPeer inputPeer, long j10) {
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
                zh.s5 s5Var = (zh.s5) obj;
                int i11 = s5Var.a;
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
                        s5Var.b0(-j3, j10, this.d);
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ kg(zh.s5 s5Var, TLObject tLObject, long j3, long j10, boolean z10) {
        this.e = s5Var;
        this.f = tLObject;
        this.b = j3;
        this.c = j10;
        this.d = z10;
    }
}
