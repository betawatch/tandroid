package org.telegram.messenger;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.support.SparseLongArray;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_update;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class ey implements Runnable {
    public final /* synthetic */ qz a;
    public final /* synthetic */ TLRPC.TL_messages_forwardMessages b;
    public final /* synthetic */ long c;
    public final /* synthetic */ int d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ a0.h h;
    public final /* synthetic */ ArrayList n;
    public final /* synthetic */ ArrayList r;
    public final /* synthetic */ jj s;
    public final /* synthetic */ TLRPC.Peer w;

    public /* synthetic */ ey(int i10, long j10, a0.h hVar, ArrayList arrayList, ArrayList arrayList2, jj jjVar, qz qzVar, TLRPC.Peer peer, TLRPC.TL_messages_forwardMessages tL_messages_forwardMessages, boolean z10, boolean z11) {
        this.a = qzVar;
        this.b = tL_messages_forwardMessages;
        this.c = j10;
        this.d = i10;
        this.e = z10;
        this.f = z11;
        this.h = hVar;
        this.n = arrayList;
        this.r = arrayList2;
        this.s = jjVar;
        this.w = peer;
    }

    @Override // java.lang.Runnable
    public final void run() {
        final qz qzVar = this.a;
        ConnectionsManager connectionsManager = qzVar.getConnectionsManager();
        final int i10 = this.d;
        final long j10 = this.c;
        final a0.h hVar = this.h;
        final ArrayList arrayList = this.n;
        final ArrayList arrayList2 = this.r;
        final jj jjVar = this.s;
        final TLRPC.Peer peer = this.w;
        final TLRPC.TL_messages_forwardMessages tL_messages_forwardMessages = this.b;
        final boolean z10 = this.e;
        final boolean z11 = this.f;
        connectionsManager.sendRequest(tL_messages_forwardMessages, new RequestDelegate() { // from class: org.telegram.messenger.xy
            /* JADX WARN: Removed duplicated region for block: B:39:0x0132  */
            /* JADX WARN: Removed duplicated region for block: B:44:0x013f  */
            /* JADX WARN: Removed duplicated region for block: B:51:0x0150  */
            /* JADX WARN: Removed duplicated region for block: B:54:0x0167  */
            /* JADX WARN: Removed duplicated region for block: B:70:0x0159  */
            /* JADX WARN: Type inference failed for: r5v0 */
            /* JADX WARN: Type inference failed for: r5v1, types: [boolean, int] */
            /* JADX WARN: Type inference failed for: r5v39 */
            @Override // org.telegram.tgnet.RequestDelegate
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                int i11;
                ?? r52;
                ArrayList arrayList3;
                ArrayList arrayList4;
                int i12;
                String str;
                String str2;
                boolean z12;
                TLRPC.Updates updates;
                TLRPC.Message message;
                ArrayList arrayList5;
                int i13;
                TLRPC.Message message2;
                int i14;
                boolean z13;
                long j11;
                SparseLongArray sparseLongArray;
                final int i15;
                ArrayList arrayList6;
                final long j12;
                TLRPC.Updates updates2;
                ArrayList arrayList7;
                final TLRPC.Message message3;
                int indexOf;
                final qz qzVar2 = qzVar;
                int i16 = i10;
                ArrayList arrayList8 = arrayList;
                ArrayList arrayList9 = arrayList2;
                TLRPC.TL_messages_forwardMessages tL_messages_forwardMessages2 = tL_messages_forwardMessages;
                if (tL_error == null) {
                    SparseLongArray sparseLongArray2 = new SparseLongArray();
                    TLRPC.Updates updates3 = (TLRPC.Updates) tLObject;
                    int i17 = 0;
                    while (i17 < updates3.updates.size()) {
                        TLRPC.Update update = updates3.updates.get(i17);
                        if (update instanceof TL_update.TL_updateMessageID) {
                            TL_update.TL_updateMessageID tL_updateMessageID = (TL_update.TL_updateMessageID) update;
                            sparseLongArray2.put(tL_updateMessageID.id, tL_updateMessageID.random_id);
                            updates3.updates.remove(i17);
                            i17--;
                        }
                        i17++;
                    }
                    qzVar2.getNotificationCenter().m(zs.k3, sparseLongArray2);
                    ConcurrentHashMap concurrentHashMap = qzVar2.getMessagesController().P;
                    long j13 = j10;
                    Integer num = (Integer) concurrentHashMap.get(Long.valueOf(j13));
                    if (num == null) {
                        num = Integer.valueOf(qzVar2.getMessagesStorage().U(j13, true));
                        qzVar2.getMessagesController().P.put(Long.valueOf(j13), num);
                    }
                    Integer num2 = num;
                    ArrayList arrayList10 = new ArrayList();
                    int i18 = 0;
                    int i19 = 0;
                    while (i18 < updates3.updates.size()) {
                        TLRPC.Update update2 = updates3.updates.get(i18);
                        boolean z14 = update2 instanceof TL_update.TL_updateNewMessage;
                        long j14 = j13;
                        if (z14 || (update2 instanceof TL_update.TL_updateNewChannelMessage) || (update2 instanceof TL_update.TL_updateNewScheduledMessage) || (update2 instanceof TL_update.TL_updateQuickReplyMessage)) {
                            int i20 = i16 != 0 ? 1 : 0;
                            updates3.updates.remove(i18);
                            int i21 = i18 - 1;
                            if (z14) {
                                TL_update.TL_updateNewMessage tL_updateNewMessage = (TL_update.TL_updateNewMessage) update2;
                                message = tL_updateNewMessage.message;
                                updates = updates3;
                                qzVar2.getMessagesController().J3(tL_updateNewMessage.pts, -1, tL_updateNewMessage.pts_count);
                            } else {
                                updates = updates3;
                                if (update2 instanceof TL_update.TL_updateNewScheduledMessage) {
                                    arrayList5 = arrayList10;
                                    i13 = i20;
                                    message2 = ((TL_update.TL_updateNewScheduledMessage) update2).message;
                                    i14 = 1;
                                    if (z10 && message2.date != 2147483646) {
                                        i14 = 0;
                                    }
                                    hc.W(message2);
                                    if (i14 == 0) {
                                        message2.unread = num2.intValue() < message2.id;
                                    }
                                    if (z11) {
                                        z13 = true;
                                        message2.out = true;
                                        message2.unread = false;
                                        message2.media_unread = false;
                                    } else {
                                        z13 = true;
                                    }
                                    j11 = sparseLongArray2.get(message2.id);
                                    if (j11 != 0 || (message3 = (TLRPC.Message) hVar.f(j11)) == null || (indexOf = arrayList8.indexOf(message3)) == -1) {
                                        sparseLongArray = sparseLongArray2;
                                        i15 = i16;
                                        arrayList6 = arrayList9;
                                        j12 = j14;
                                        updates2 = updates;
                                        arrayList7 = arrayList8;
                                        i19 = i19;
                                        i18 = i21;
                                    } else {
                                        jj jjVar2 = (jj) arrayList9.get(indexOf);
                                        arrayList8.remove(indexOf);
                                        arrayList9.remove(indexOf);
                                        final int i22 = message3.id;
                                        final ArrayList arrayList11 = new ArrayList();
                                        arrayList11.add(message2);
                                        TLRPC.Message message4 = jjVar2.k;
                                        sparseLongArray = sparseLongArray2;
                                        message4.post_author = message2.post_author;
                                        if ((message2.flags & 33554432) != 0) {
                                            message4.ttl_period = message2.ttl_period;
                                            message4.flags |= 33554432;
                                        }
                                        qz qzVar3 = qzVar2;
                                        arrayList6 = arrayList9;
                                        updates2 = updates;
                                        int i23 = i16;
                                        arrayList7 = arrayList8;
                                        int i24 = i13;
                                        j12 = j14;
                                        qzVar3.z0(jjVar2, message2, message2.id, Collections.singletonList(null), true, -1, message2.params);
                                        final int p12 = jjVar2.p1();
                                        message3.id = message2.id;
                                        int i25 = i19 + 1;
                                        if (i24 != i14) {
                                            qzVar2 = qzVar3;
                                            i0.g3(new gx(qzVar2, arrayList11, i14, i22, message3, i24, message2, jjVar, i23, 0));
                                            i15 = i23;
                                        } else {
                                            qzVar2 = qzVar3;
                                            r5 r5Var = qzVar2.getMessagesStorage().a;
                                            final TLRPC.Peer peer2 = peer;
                                            final TLRPC.Message message5 = message2;
                                            i15 = i23;
                                            r5Var.c(new Runnable() { // from class: org.telegram.messenger.hx
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    final qz qzVar4;
                                                    final int i26 = i15;
                                                    int i27 = i26 != 0 ? 1 : 0;
                                                    final TLRPC.Message message6 = message5;
                                                    if (jj.d5(message6)) {
                                                        i27 = 9;
                                                    } else if (message6.quick_reply_shortcut_id != 0 || message6.quick_reply_shortcut != null) {
                                                        i27 = 5;
                                                    }
                                                    int i28 = i27;
                                                    qz qzVar5 = qz.this;
                                                    hs messagesStorage = qzVar5.getMessagesStorage();
                                                    final TLRPC.Message message7 = message3;
                                                    long j15 = message7.random_id;
                                                    long C1 = jj.C1(peer2);
                                                    final int i29 = i22;
                                                    messagesStorage.a2(j15, C1, Integer.valueOf(i29), message7.id, 0, i26 != 0 ? 1 : 0, message6.quick_reply_shortcut_id);
                                                    qzVar5.getMessagesStorage().j1(arrayList11, true, false, false, 0, false, i28, message6.quick_reply_shortcut_id);
                                                    if (jj.e3(message7)) {
                                                        long C12 = jj.C1(message7.peer_id);
                                                        ArrayList arrayList12 = new ArrayList(1);
                                                        arrayList12.add(Integer.valueOf(message7.id));
                                                        qzVar5.getMessagesStorage().P0(C12, arrayList12, false, false, i28, (int) jj.a2(qzVar5.currentAccount, message7, 0));
                                                        qzVar5.getMessagesStorage().R1(C12, -C12, arrayList12, null);
                                                        qzVar4 = qzVar5;
                                                        i0.g3(new cx(qzVar5, C12, arrayList12, 2));
                                                    } else {
                                                        qzVar4 = qzVar5;
                                                    }
                                                    final long j16 = j12;
                                                    final int i30 = p12;
                                                    i0.g3(new Runnable() { // from class: org.telegram.messenger.ox
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            message7.send_state = 0;
                                                            qz qzVar6 = qz.this;
                                                            ui mediaDataController = qzVar6.getMediaDataController();
                                                            long j17 = j16;
                                                            mediaDataController.w0(j17);
                                                            zs notificationCenter = qzVar6.getNotificationCenter();
                                                            int i31 = i29;
                                                            Integer valueOf = Integer.valueOf(i31);
                                                            TLRPC.Message message8 = message6;
                                                            Integer valueOf2 = Integer.valueOf(message8.id);
                                                            Long valueOf3 = Long.valueOf(j17);
                                                            int i32 = i30;
                                                            Integer valueOf4 = Integer.valueOf(i32);
                                                            int i33 = i26;
                                                            notificationCenter.k(zs.K, valueOf, valueOf2, message8, valueOf3, 0L, valueOf4, Boolean.valueOf(i33 != 0));
                                                            qzVar6.getNotificationCenter().k(zs.L, Integer.valueOf(i31), Integer.valueOf(message8.id), message8, Long.valueOf(j17), 0L, Integer.valueOf(i32), Boolean.valueOf(i33 != 0));
                                                            qzVar6.d0(i31);
                                                            qzVar6.i0(i31, i33 != 0);
                                                        }
                                                    });
                                                }
                                            });
                                        }
                                        i18 = i21;
                                        i19 = i25;
                                    }
                                } else if (update2 instanceof TL_update.TL_updateQuickReplyMessage) {
                                    ag.i3.f(qzVar2.currentAccount).j(update2, null, 0);
                                    message = ((TL_update.TL_updateQuickReplyMessage) update2).message;
                                } else if (update2 instanceof TL_update.TL_updateNewEphemeralMessage) {
                                    TL_update.TL_updateNewEphemeralMessage tL_updateNewEphemeralMessage = (TL_update.TL_updateNewEphemeralMessage) update2;
                                    message = rf.s.b(tL_updateNewEphemeralMessage.message);
                                    arrayList10.add(tL_updateNewEphemeralMessage.message);
                                } else {
                                    TL_update.TL_updateNewChannelMessage tL_updateNewChannelMessage = (TL_update.TL_updateNewChannelMessage) update2;
                                    message = tL_updateNewChannelMessage.message;
                                    arrayList5 = arrayList10;
                                    i13 = i20;
                                    qzVar2.getMessagesController().I3(tL_updateNewChannelMessage.pts, tL_updateNewChannelMessage.pts_count, message.peer_id.channel_id);
                                    message2 = message;
                                    i14 = 0;
                                    if (z10) {
                                        i14 = 0;
                                    }
                                    hc.W(message2);
                                    if (i14 == 0) {
                                    }
                                    if (z11) {
                                    }
                                    j11 = sparseLongArray2.get(message2.id);
                                    if (j11 != 0) {
                                    }
                                    sparseLongArray = sparseLongArray2;
                                    i15 = i16;
                                    arrayList6 = arrayList9;
                                    j12 = j14;
                                    updates2 = updates;
                                    arrayList7 = arrayList8;
                                    i19 = i19;
                                    i18 = i21;
                                }
                            }
                            arrayList5 = arrayList10;
                            i13 = i20;
                            message2 = message;
                            i14 = 0;
                            if (z10) {
                            }
                            hc.W(message2);
                            if (i14 == 0) {
                            }
                            if (z11) {
                            }
                            j11 = sparseLongArray2.get(message2.id);
                            if (j11 != 0) {
                            }
                            sparseLongArray = sparseLongArray2;
                            i15 = i16;
                            arrayList6 = arrayList9;
                            j12 = j14;
                            updates2 = updates;
                            arrayList7 = arrayList8;
                            i19 = i19;
                            i18 = i21;
                        } else {
                            sparseLongArray = sparseLongArray2;
                            arrayList5 = arrayList10;
                            arrayList6 = arrayList9;
                            j12 = j14;
                            updates2 = updates3;
                            i15 = i16;
                            arrayList7 = arrayList8;
                        }
                        i18++;
                        i16 = i15;
                        updates3 = updates2;
                        arrayList9 = arrayList6;
                        arrayList8 = arrayList7;
                        sparseLongArray2 = sparseLongArray;
                        arrayList10 = arrayList5;
                        j13 = j12;
                    }
                    ArrayList arrayList12 = arrayList10;
                    int i26 = i19;
                    arrayList3 = arrayList8;
                    arrayList4 = arrayList9;
                    TLRPC.Updates updates4 = updates3;
                    i11 = i16;
                    if (!arrayList12.isEmpty()) {
                        qzVar2.getMessagesStorage().f1(arrayList12, true);
                    }
                    if (updates4.updates.isEmpty()) {
                        z12 = false;
                    } else {
                        z12 = false;
                        qzVar2.getMessagesController().L3(updates4, false);
                    }
                    i12 = 1;
                    qzVar2.getStatsController().k(w0.f(), 1, i26);
                    r52 = z12;
                } else {
                    i11 = i16;
                    r52 = 0;
                    arrayList3 = arrayList8;
                    arrayList4 = arrayList9;
                    i12 = 1;
                    i0.g3(new mg(qzVar2, tL_error, tL_messages_forwardMessages2, 4));
                }
                int i27 = r52;
                while (i27 < arrayList3.size()) {
                    ArrayList arrayList13 = arrayList3;
                    TLRPC.Message message6 = (TLRPC.Message) arrayList13.get(i27);
                    qzVar2.getMessagesStorage().N0(i11 != 0 ? i12 : r52, message6);
                    if (tL_error != null && (str2 = tL_error.text) != null && str2.startsWith("ALLOW_PAYMENT_REQUIRED_")) {
                        rh.e6.y(qzVar2.currentAccount, r52);
                        message6.errorAllowedPriceStars = rh.e6.o(tL_messages_forwardMessages2);
                        message6.errorNewPriceStars = Long.parseLong(tL_error.text.substring(23)) / tL_messages_forwardMessages2.id.size();
                        qzVar2.getMessagesStorage().X1(jj.B0(message6), message6);
                    }
                    i0.g3(new ix(qzVar2, message6, i11, r52));
                    i27++;
                    arrayList3 = arrayList13;
                }
                if (tL_error == null || (str = tL_error.text) == null || !str.startsWith("ALLOW_PAYMENT_REQUIRED_")) {
                    return;
                }
                i0.g3(new e4(9, qzVar2, arrayList4));
            }
        }, 68);
    }
}
