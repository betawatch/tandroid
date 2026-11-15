package org.telegram.messenger;

import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.TLMethod;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes.dex */
public final /* synthetic */ class uh implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ int c;
    public final /* synthetic */ long d;
    public final /* synthetic */ c1 e;
    public final /* synthetic */ Object f;

    public /* synthetic */ uh(c1 c1Var, long j3, long j10, Object obj, int i7, int i10) {
        this.a = i10;
        this.e = c1Var;
        this.b = j3;
        this.d = j10;
        this.f = obj;
        this.c = i7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                si siVar = (si) this.e;
                long j3 = this.b;
                long j10 = this.d;
                z10 z10Var = (z10) this.f;
                int i7 = this.c;
                try {
                    TL_bots.BotInfo H0 = siVar.H0(j3, j10);
                    if (H0 != null) {
                        g0.h3(new cg(siVar, z10Var, H0, i7, 7));
                    } else if (z10Var != null) {
                        g0.h3(new qf(z10Var, 0));
                    }
                    break;
                } catch (Exception e10) {
                    a8.g(e10, true);
                    return;
                }
            case 1:
                np npVar = (np) this.e;
                long j11 = this.b;
                TLRPC.TL_messages_chatFull tL_messages_chatFull = (TLRPC.TL_messages_chatFull) this.f;
                int i10 = this.c;
                long j12 = this.d;
                LongSparseIntArray longSparseIntArray = npVar.H0;
                a0.h hVar = npVar.m1;
                TLRPC.ChatFull chatFull = (TLRPC.ChatFull) hVar.f(j11);
                if (chatFull != null) {
                    tL_messages_chatFull.full_chat.inviterId = chatFull.inviterId;
                }
                hVar.k(tL_messages_chatFull.full_chat, j11);
                long j13 = -j11;
                npVar.t7.M(j13);
                TLRPC.PeerNotifySettings peerNotifySettings = tL_messages_chatFull.full_chat.notify_settings;
                bt btVar = npVar.getNotificationsController().h0;
                btVar.getClass();
                if (peerNotifySettings != null) {
                    Utilities.e.c(new t8(btVar, j13, 0L, peerNotifySettings, 6));
                }
                for (int i11 = 0; i11 < tL_messages_chatFull.full_chat.bot_info.size(); i11++) {
                    npVar.getMediaDataController().D1(j13, tL_messages_chatFull.full_chat.bot_info.get(i11));
                }
                int indexOfKey = longSparseIntArray.indexOfKey(j13);
                if (tL_messages_chatFull.full_chat.blocked) {
                    if (indexOfKey < 0) {
                        longSparseIntArray.put(j13, 1);
                        npVar.getNotificationCenter().k(43, new Object[0]);
                    }
                } else if (indexOfKey >= 0) {
                    longSparseIntArray.removeAt(indexOfKey);
                    npVar.getNotificationCenter().k(43, new Object[0]);
                }
                npVar.r.k(tL_messages_chatFull.full_chat.exported_invite, j11);
                npVar.t1.remove(Long.valueOf(j11));
                npVar.x1.put(j11, System.currentTimeMillis());
                npVar.Y3(tL_messages_chatFull.users, false);
                npVar.S3(tL_messages_chatFull.chats, false);
                if (tL_messages_chatFull.full_chat.stickerset != null) {
                    npVar.getMediaDataController().Y(tL_messages_chatFull.full_chat.stickerset);
                }
                if (tL_messages_chatFull.full_chat.emojiset != null) {
                    npVar.getMediaDataController().Y(tL_messages_chatFull.full_chat.emojiset);
                }
                npVar.getNotificationCenter().k(30, tL_messages_chatFull.full_chat, Integer.valueOf(i10), Boolean.FALSE, Boolean.TRUE);
                TLRPC.Dialog dialog = (TLRPC.Dialog) npVar.R.f(j13);
                if (dialog != null) {
                    TLRPC.ChatFull chatFull2 = tL_messages_chatFull.full_chat;
                    if ((chatFull2.flags & 2048) != 0) {
                        int i12 = dialog.folder_id;
                        int i13 = chatFull2.folder_id;
                        if (i12 != i13) {
                            dialog.folder_id = i13;
                            npVar.U4(null);
                            npVar.getNotificationCenter().k(3, new Object[0]);
                        }
                    }
                    int i14 = dialog.ttl_period;
                    int i15 = tL_messages_chatFull.full_chat.ttl_period;
                    if (i14 != i15) {
                        dialog.ttl_period = i15;
                        npVar.getNotificationCenter().k(3, new Object[0]);
                    }
                    boolean z10 = dialog.view_forum_as_messages;
                    boolean z11 = tL_messages_chatFull.full_chat.view_forum_as_messages;
                    if (z10 != z11) {
                        dialog.view_forum_as_messages = z11;
                        vr messagesStorage = npVar.getMessagesStorage();
                        messagesStorage.a.c(new wp(1, j12, messagesStorage, tL_messages_chatFull.full_chat.view_forum_as_messages));
                        break;
                    }
                }
                break;
            default:
                ((vr) this.e).getMessagesController().a0(null, null, null, this.b, true, 0, false, this.d, (TLMethod) this.f, this.c);
                break;
        }
    }

    public /* synthetic */ uh(np npVar, long j3, TLRPC.TL_messages_chatFull tL_messages_chatFull, int i7, long j10) {
        this.a = 1;
        this.e = npVar;
        this.b = j3;
        this.f = tL_messages_chatFull;
        this.c = i7;
        this.d = j10;
    }
}
