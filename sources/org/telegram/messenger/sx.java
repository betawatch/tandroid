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

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes.dex */
public final /* synthetic */ class sx implements Runnable {
    public final /* synthetic */ gz a;
    public final /* synthetic */ TLRPC.TL_messages_forwardMessages b;
    public final /* synthetic */ long c;
    public final /* synthetic */ int d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ a0.h h;
    public final /* synthetic */ ArrayList n;
    public final /* synthetic */ ArrayList r;
    public final /* synthetic */ ij s;
    public final /* synthetic */ TLRPC.Peer w;

    public /* synthetic */ sx(int i7, long j3, a0.h hVar, ArrayList arrayList, ArrayList arrayList2, ij ijVar, gz gzVar, TLRPC.Peer peer, TLRPC.TL_messages_forwardMessages tL_messages_forwardMessages, boolean z9, boolean z10) {
        this.a = gzVar;
        this.b = tL_messages_forwardMessages;
        this.c = j3;
        this.d = i7;
        this.e = z9;
        this.f = z10;
        this.h = hVar;
        this.n = arrayList;
        this.r = arrayList2;
        this.s = ijVar;
        this.w = peer;
    }

    @Override // java.lang.Runnable
    public final void run() {
        final gz gzVar = this.a;
        ConnectionsManager connectionsManager = gzVar.getConnectionsManager();
        final int i7 = this.d;
        final long j3 = this.c;
        final a0.h hVar = this.h;
        final ArrayList arrayList = this.n;
        final ArrayList arrayList2 = this.r;
        final ij ijVar = this.s;
        final TLRPC.Peer peer = this.w;
        final TLRPC.TL_messages_forwardMessages tL_messages_forwardMessages = this.b;
        final boolean z9 = this.e;
        final boolean z10 = this.f;
        connectionsManager.sendRequest(tL_messages_forwardMessages, new RequestDelegate() { // from class: org.telegram.messenger.ny
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
                int i10;
                ?? r52;
                ArrayList arrayList3;
                ArrayList arrayList4;
                int i11;
                String str;
                String str2;
                boolean z11;
                TLRPC.Updates updates;
                TLRPC.Message message;
                ArrayList arrayList5;
                int i12;
                TLRPC.Message message2;
                int i13;
                boolean z12;
                long j10;
                SparseLongArray sparseLongArray;
                final int i14;
                ArrayList arrayList6;
                final long j11;
                TLRPC.Updates updates2;
                ArrayList arrayList7;
                final TLRPC.Message message3;
                int indexOf;
                final gz gzVar2 = gzVar;
                int i15 = i7;
                ArrayList arrayList8 = arrayList;
                ArrayList arrayList9 = arrayList2;
                TLRPC.TL_messages_forwardMessages tL_messages_forwardMessages2 = tL_messages_forwardMessages;
                if (tL_error == null) {
                    SparseLongArray sparseLongArray2 = new SparseLongArray();
                    TLRPC.Updates updates3 = (TLRPC.Updates) tLObject;
                    int i16 = 0;
                    while (i16 < updates3.updates.size()) {
                        TLRPC.Update update = updates3.updates.get(i16);
                        if (update instanceof TL_update.TL_updateMessageID) {
                            TL_update.TL_updateMessageID tL_updateMessageID = (TL_update.TL_updateMessageID) update;
                            sparseLongArray2.put(tL_updateMessageID.id, tL_updateMessageID.random_id);
                            updates3.updates.remove(i16);
                            i16--;
                        }
                        i16++;
                    }
                    gzVar2.getNotificationCenter().m(qs.k3, sparseLongArray2);
                    ConcurrentHashMap concurrentHashMap = gzVar2.getMessagesController().P;
                    long j12 = j3;
                    Integer num = (Integer) concurrentHashMap.get(Long.valueOf(j12));
                    if (num == null) {
                        num = Integer.valueOf(gzVar2.getMessagesStorage().U(j12, true));
                        gzVar2.getMessagesController().P.put(Long.valueOf(j12), num);
                    }
                    Integer num2 = num;
                    ArrayList arrayList10 = new ArrayList();
                    int i17 = 0;
                    int i18 = 0;
                    while (i17 < updates3.updates.size()) {
                        TLRPC.Update update2 = updates3.updates.get(i17);
                        boolean z13 = update2 instanceof TL_update.TL_updateNewMessage;
                        long j13 = j12;
                        if (z13 || (update2 instanceof TL_update.TL_updateNewChannelMessage) || (update2 instanceof TL_update.TL_updateNewScheduledMessage) || (update2 instanceof TL_update.TL_updateQuickReplyMessage)) {
                            int i19 = i15 != 0 ? 1 : 0;
                            updates3.updates.remove(i17);
                            int i20 = i17 - 1;
                            if (z13) {
                                TL_update.TL_updateNewMessage tL_updateNewMessage = (TL_update.TL_updateNewMessage) update2;
                                message = tL_updateNewMessage.message;
                                updates = updates3;
                                gzVar2.getMessagesController().M3(tL_updateNewMessage.pts, -1, tL_updateNewMessage.pts_count);
                            } else {
                                updates = updates3;
                                if (update2 instanceof TL_update.TL_updateNewScheduledMessage) {
                                    arrayList5 = arrayList10;
                                    i12 = i19;
                                    message2 = ((TL_update.TL_updateNewScheduledMessage) update2).message;
                                    i13 = 1;
                                    if (z9 && message2.date != 2147483646) {
                                        i13 = 0;
                                    }
                                    gc.W(message2);
                                    if (i13 == 0) {
                                        message2.unread = num2.intValue() < message2.id;
                                    }
                                    if (z10) {
                                        z12 = true;
                                        message2.out = true;
                                        message2.unread = false;
                                        message2.media_unread = false;
                                    } else {
                                        z12 = true;
                                    }
                                    j10 = sparseLongArray2.get(message2.id);
                                    if (j10 != 0 || (message3 = (TLRPC.Message) hVar.f(j10)) == null || (indexOf = arrayList8.indexOf(message3)) == -1) {
                                        sparseLongArray = sparseLongArray2;
                                        i14 = i15;
                                        arrayList6 = arrayList9;
                                        j11 = j13;
                                        updates2 = updates;
                                        arrayList7 = arrayList8;
                                        i18 = i18;
                                        i17 = i20;
                                    } else {
                                        ij ijVar2 = (ij) arrayList9.get(indexOf);
                                        arrayList8.remove(indexOf);
                                        arrayList9.remove(indexOf);
                                        final int i21 = message3.id;
                                        final ArrayList arrayList11 = new ArrayList();
                                        arrayList11.add(message2);
                                        TLRPC.Message message4 = ijVar2.k;
                                        sparseLongArray = sparseLongArray2;
                                        message4.post_author = message2.post_author;
                                        if ((message2.flags & 33554432) != 0) {
                                            message4.ttl_period = message2.ttl_period;
                                            message4.flags |= 33554432;
                                        }
                                        gz gzVar3 = gzVar2;
                                        arrayList6 = arrayList9;
                                        updates2 = updates;
                                        int i22 = i15;
                                        arrayList7 = arrayList8;
                                        int i23 = i12;
                                        j11 = j13;
                                        gzVar3.z0(ijVar2, message2, message2.id, Collections.singletonList(null), true, -1, message2.params);
                                        final int o12 = ijVar2.o1();
                                        message3.id = message2.id;
                                        int i24 = i18 + 1;
                                        if (i23 != i13) {
                                            gzVar2 = gzVar3;
                                            g0.h3(new uw(gzVar2, arrayList11, i13, i21, message3, i23, message2, ijVar, i22, 0));
                                            i14 = i22;
                                        } else {
                                            gzVar2 = gzVar3;
                                            p5 p5Var = gzVar2.getMessagesStorage().a;
                                            final TLRPC.Peer peer2 = peer;
                                            final TLRPC.Message message5 = message2;
                                            i14 = i22;
                                            p5Var.c(new Runnable() { // from class: org.telegram.messenger.vw
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    final gz gzVar4;
                                                    final int i25 = i14;
                                                    int i26 = i25 != 0 ? 1 : 0;
                                                    final TLRPC.Message message6 = message5;
                                                    if (ij.d5(message6)) {
                                                        i26 = 9;
                                                    } else if (message6.quick_reply_shortcut_id != 0 || message6.quick_reply_shortcut != null) {
                                                        i26 = 5;
                                                    }
                                                    int i27 = i26;
                                                    gz gzVar5 = gz.this;
                                                    yr messagesStorage = gzVar5.getMessagesStorage();
                                                    final TLRPC.Message message7 = message3;
                                                    long j14 = message7.random_id;
                                                    long B1 = ij.B1(peer2);
                                                    final int i28 = i21;
                                                    messagesStorage.a2(j14, B1, Integer.valueOf(i28), message7.id, 0, i25 != 0 ? 1 : 0, message6.quick_reply_shortcut_id);
                                                    gzVar5.getMessagesStorage().j1(arrayList11, true, false, false, 0, false, i27, message6.quick_reply_shortcut_id);
                                                    if (ij.e3(message7)) {
                                                        long B12 = ij.B1(message7.peer_id);
                                                        ArrayList arrayList12 = new ArrayList(1);
                                                        arrayList12.add(Integer.valueOf(message7.id));
                                                        gzVar5.getMessagesStorage().P0(B12, arrayList12, false, false, i27, (int) ij.Z1(gzVar5.currentAccount, message7, 0));
                                                        gzVar5.getMessagesStorage().R1(B12, -B12, arrayList12, null);
                                                        gzVar4 = gzVar5;
                                                        g0.h3(new pw(gzVar5, B12, arrayList12, 2));
                                                    } else {
                                                        gzVar4 = gzVar5;
                                                    }
                                                    final long j15 = j11;
                                                    final int i29 = o12;
                                                    g0.h3(new Runnable() { // from class: org.telegram.messenger.cx
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            message7.send_state = 0;
                                                            gz gzVar6 = gz.this;
                                                            ui mediaDataController = gzVar6.getMediaDataController();
                                                            long j16 = j15;
                                                            mediaDataController.w0(j16);
                                                            qs notificationCenter = gzVar6.getNotificationCenter();
                                                            int i30 = i28;
                                                            Integer valueOf = Integer.valueOf(i30);
                                                            TLRPC.Message message8 = message6;
                                                            Integer valueOf2 = Integer.valueOf(message8.id);
                                                            Long valueOf3 = Long.valueOf(j16);
                                                            int i31 = i29;
                                                            Integer valueOf4 = Integer.valueOf(i31);
                                                            int i32 = i25;
                                                            notificationCenter.k(qs.K, valueOf, valueOf2, message8, valueOf3, 0L, valueOf4, Boolean.valueOf(i32 != 0));
                                                            gzVar6.getNotificationCenter().k(qs.L, Integer.valueOf(i30), Integer.valueOf(message8.id), message8, Long.valueOf(j16), 0L, Integer.valueOf(i31), Boolean.valueOf(i32 != 0));
                                                            gzVar6.d0(i30);
                                                            gzVar6.i0(i30, i32 != 0);
                                                        }
                                                    });
                                                }
                                            });
                                        }
                                        i17 = i20;
                                        i18 = i24;
                                    }
                                } else if (update2 instanceof TL_update.TL_updateQuickReplyMessage) {
                                    kg.t1.f(gzVar2.currentAccount).j(update2, null, 0);
                                    message = ((TL_update.TL_updateQuickReplyMessage) update2).message;
                                } else if (update2 instanceof TL_update.TL_updateNewEphemeralMessage) {
                                    TL_update.TL_updateNewEphemeralMessage tL_updateNewEphemeralMessage = (TL_update.TL_updateNewEphemeralMessage) update2;
                                    message = bg.w.b(tL_updateNewEphemeralMessage.message);
                                    arrayList10.add(tL_updateNewEphemeralMessage.message);
                                } else {
                                    TL_update.TL_updateNewChannelMessage tL_updateNewChannelMessage = (TL_update.TL_updateNewChannelMessage) update2;
                                    message = tL_updateNewChannelMessage.message;
                                    arrayList5 = arrayList10;
                                    i12 = i19;
                                    gzVar2.getMessagesController().L3(tL_updateNewChannelMessage.pts, tL_updateNewChannelMessage.pts_count, message.peer_id.channel_id);
                                    message2 = message;
                                    i13 = 0;
                                    if (z9) {
                                        i13 = 0;
                                    }
                                    gc.W(message2);
                                    if (i13 == 0) {
                                    }
                                    if (z10) {
                                    }
                                    j10 = sparseLongArray2.get(message2.id);
                                    if (j10 != 0) {
                                    }
                                    sparseLongArray = sparseLongArray2;
                                    i14 = i15;
                                    arrayList6 = arrayList9;
                                    j11 = j13;
                                    updates2 = updates;
                                    arrayList7 = arrayList8;
                                    i18 = i18;
                                    i17 = i20;
                                }
                            }
                            arrayList5 = arrayList10;
                            i12 = i19;
                            message2 = message;
                            i13 = 0;
                            if (z9) {
                            }
                            gc.W(message2);
                            if (i13 == 0) {
                            }
                            if (z10) {
                            }
                            j10 = sparseLongArray2.get(message2.id);
                            if (j10 != 0) {
                            }
                            sparseLongArray = sparseLongArray2;
                            i14 = i15;
                            arrayList6 = arrayList9;
                            j11 = j13;
                            updates2 = updates;
                            arrayList7 = arrayList8;
                            i18 = i18;
                            i17 = i20;
                        } else {
                            sparseLongArray = sparseLongArray2;
                            arrayList5 = arrayList10;
                            arrayList6 = arrayList9;
                            j11 = j13;
                            updates2 = updates3;
                            i14 = i15;
                            arrayList7 = arrayList8;
                        }
                        i17++;
                        i15 = i14;
                        updates3 = updates2;
                        arrayList9 = arrayList6;
                        arrayList8 = arrayList7;
                        sparseLongArray2 = sparseLongArray;
                        arrayList10 = arrayList5;
                        j12 = j11;
                    }
                    ArrayList arrayList12 = arrayList10;
                    int i25 = i18;
                    arrayList3 = arrayList8;
                    arrayList4 = arrayList9;
                    TLRPC.Updates updates4 = updates3;
                    i10 = i15;
                    if (!arrayList12.isEmpty()) {
                        gzVar2.getMessagesStorage().f1(arrayList12, true);
                    }
                    if (updates4.updates.isEmpty()) {
                        z11 = false;
                    } else {
                        z11 = false;
                        gzVar2.getMessagesController().O3(updates4, false);
                    }
                    i11 = 1;
                    gzVar2.getStatsController().k(t0.f(), 1, i25);
                    r52 = z11;
                } else {
                    i10 = i15;
                    r52 = 0;
                    arrayList3 = arrayList8;
                    arrayList4 = arrayList9;
                    i11 = 1;
                    g0.h3(new ng(gzVar2, tL_error, tL_messages_forwardMessages2, 4));
                }
                int i26 = r52;
                while (i26 < arrayList3.size()) {
                    ArrayList arrayList13 = arrayList3;
                    TLRPC.Message message6 = (TLRPC.Message) arrayList13.get(i26);
                    gzVar2.getMessagesStorage().N0(i10 != 0 ? i11 : r52, message6);
                    if (tL_error != null && (str2 = tL_error.text) != null && str2.startsWith("ALLOW_PAYMENT_REQUIRED_")) {
                        bi.ea.y(gzVar2.currentAccount, r52);
                        message6.errorAllowedPriceStars = bi.ea.o(tL_messages_forwardMessages2);
                        message6.errorNewPriceStars = Long.parseLong(tL_error.text.substring(23)) / tL_messages_forwardMessages2.id.size();
                        gzVar2.getMessagesStorage().X1(ij.B0(message6), message6);
                    }
                    g0.h3(new ww(gzVar2, message6, i10, r52));
                    i26++;
                    arrayList3 = arrayList13;
                }
                if (tL_error == null || (str = tL_error.text) == null || !str.startsWith("ALLOW_PAYMENT_REQUIRED_")) {
                    return;
                }
                g0.h3(new b4(11, gzVar2, arrayList4));
            }
        }, 68);
    }
}
