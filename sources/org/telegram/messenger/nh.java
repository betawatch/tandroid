package org.telegram.messenger;

import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.TLMethod;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class nh implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ int c;
    public final /* synthetic */ long d;
    public final /* synthetic */ c1 e;
    public final /* synthetic */ Object f;

    public /* synthetic */ nh(c1 c1Var, long j10, long j11, Object obj, int i3, int i10) {
        this.a = i10;
        this.e = c1Var;
        this.b = j10;
        this.d = j11;
        this.f = obj;
        this.c = i3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                li liVar = (li) this.e;
                long j10 = this.b;
                long j11 = this.d;
                u10 u10Var = (u10) this.f;
                int i3 = this.c;
                try {
                    TL_bots.BotInfo H0 = liVar.H0(j10, j11);
                    if (H0 != null) {
                        g0.h3(new vf(liVar, u10Var, H0, i3, 7));
                    } else if (u10Var != null) {
                        g0.h3(new jf(u10Var, 0));
                    }
                    break;
                } catch (Exception e10) {
                    a8.g(e10, true);
                    return;
                }
            case 1:
                hp hpVar = (hp) this.e;
                long j12 = this.b;
                TLRPC.TL_messages_chatFull tL_messages_chatFull = (TLRPC.TL_messages_chatFull) this.f;
                int i10 = this.c;
                long j13 = this.d;
                LongSparseIntArray longSparseIntArray = hpVar.H0;
                a0.h hVar = hpVar.m1;
                TLRPC.ChatFull chatFull = (TLRPC.ChatFull) hVar.f(j12);
                if (chatFull != null) {
                    tL_messages_chatFull.full_chat.inviterId = chatFull.inviterId;
                }
                hVar.k(tL_messages_chatFull.full_chat, j12);
                long j14 = -j12;
                hpVar.s7.M(j14);
                TLRPC.PeerNotifySettings peerNotifySettings = tL_messages_chatFull.full_chat.notify_settings;
                ws wsVar = hpVar.getNotificationsController().h0;
                wsVar.getClass();
                if (peerNotifySettings != null) {
                    Utilities.e.c(new t8(wsVar, j14, 0L, peerNotifySettings, 6));
                }
                for (int i11 = 0; i11 < tL_messages_chatFull.full_chat.bot_info.size(); i11++) {
                    hpVar.getMediaDataController().D1(j14, tL_messages_chatFull.full_chat.bot_info.get(i11));
                }
                int indexOfKey = longSparseIntArray.indexOfKey(j14);
                if (tL_messages_chatFull.full_chat.blocked) {
                    if (indexOfKey < 0) {
                        longSparseIntArray.put(j14, 1);
                        hpVar.getNotificationCenter().k(43, new Object[0]);
                    }
                } else if (indexOfKey >= 0) {
                    longSparseIntArray.removeAt(indexOfKey);
                    hpVar.getNotificationCenter().k(43, new Object[0]);
                }
                hpVar.r.k(tL_messages_chatFull.full_chat.exported_invite, j12);
                hpVar.t1.remove(Long.valueOf(j12));
                hpVar.x1.put(j12, System.currentTimeMillis());
                hpVar.Y3(tL_messages_chatFull.users, false);
                hpVar.S3(tL_messages_chatFull.chats, false);
                if (tL_messages_chatFull.full_chat.stickerset != null) {
                    hpVar.getMediaDataController().Y(tL_messages_chatFull.full_chat.stickerset);
                }
                if (tL_messages_chatFull.full_chat.emojiset != null) {
                    hpVar.getMediaDataController().Y(tL_messages_chatFull.full_chat.emojiset);
                }
                hpVar.getNotificationCenter().k(30, tL_messages_chatFull.full_chat, Integer.valueOf(i10), Boolean.FALSE, Boolean.TRUE);
                TLRPC.Dialog dialog = (TLRPC.Dialog) hpVar.R.f(j14);
                if (dialog != null) {
                    TLRPC.ChatFull chatFull2 = tL_messages_chatFull.full_chat;
                    if ((chatFull2.flags & 2048) != 0) {
                        int i12 = dialog.folder_id;
                        int i13 = chatFull2.folder_id;
                        if (i12 != i13) {
                            dialog.folder_id = i13;
                            hpVar.T4(null);
                            hpVar.getNotificationCenter().k(3, new Object[0]);
                        }
                    }
                    int i14 = dialog.ttl_period;
                    int i15 = tL_messages_chatFull.full_chat.ttl_period;
                    if (i14 != i15) {
                        dialog.ttl_period = i15;
                        hpVar.getNotificationCenter().k(3, new Object[0]);
                    }
                    boolean z10 = dialog.view_forum_as_messages;
                    boolean z11 = tL_messages_chatFull.full_chat.view_forum_as_messages;
                    if (z10 != z11) {
                        dialog.view_forum_as_messages = z11;
                        qr messagesStorage = hpVar.getMessagesStorage();
                        messagesStorage.a.c(new qp(1, j13, messagesStorage, tL_messages_chatFull.full_chat.view_forum_as_messages));
                        break;
                    }
                }
                break;
            default:
                ((qr) this.e).getMessagesController().a0(null, null, null, this.b, true, 0, false, this.d, (TLMethod) this.f, this.c);
                break;
        }
    }

    public /* synthetic */ nh(hp hpVar, long j10, TLRPC.TL_messages_chatFull tL_messages_chatFull, int i3, long j11) {
        this.a = 1;
        this.e = hpVar;
        this.b = j10;
        this.f = tL_messages_chatFull;
        this.c = i3;
        this.d = j11;
    }
}
