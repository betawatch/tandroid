// default package

import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.a;
import org.telegram.messenger.support.SparseLongArray;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_update;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final /* synthetic */ class o6a implements Runnable {
    public final /* synthetic */ r7a a;
    public final /* synthetic */ TLRPC.TL_messages_forwardMessages b;
    public final /* synthetic */ long c;
    public final /* synthetic */ int d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ zh6 h;
    public final /* synthetic */ ArrayList n;
    public final /* synthetic */ ArrayList r;
    public final /* synthetic */ r47 s;
    public final /* synthetic */ TLRPC.Peer w;

    public /* synthetic */ o6a(int i, long j, zh6 zh6Var, r47 r47Var, r7a r7aVar, ArrayList arrayList, ArrayList arrayList2, TLRPC.Peer peer, TLRPC.TL_messages_forwardMessages tL_messages_forwardMessages, boolean z, boolean z2) {
        this.a = r7aVar;
        this.b = tL_messages_forwardMessages;
        this.c = j;
        this.d = i;
        this.e = z;
        this.f = z2;
        this.h = zh6Var;
        this.n = arrayList;
        this.r = arrayList2;
        this.s = r47Var;
        this.w = peer;
    }

    @Override // java.lang.Runnable
    public final void run() {
        final r7a r7aVar = this.a;
        ConnectionsManager connectionsManager = r7aVar.getConnectionsManager();
        final int i = this.d;
        final long j = this.c;
        final zh6 zh6Var = this.h;
        final r47 r47Var = this.s;
        final ArrayList arrayList = this.n;
        final ArrayList arrayList2 = this.r;
        final TLRPC.Peer peer = this.w;
        final TLRPC.TL_messages_forwardMessages tL_messages_forwardMessages = this.b;
        final boolean z = this.e;
        final boolean z2 = this.f;
        connectionsManager.sendRequest(tL_messages_forwardMessages, new RequestDelegate() { // from class: b7a
            /* JADX WARN: Removed duplicated region for block: B:39:0x0131  */
            /* JADX WARN: Removed duplicated region for block: B:44:0x013e  */
            /* JADX WARN: Removed duplicated region for block: B:51:0x0150  */
            /* JADX WARN: Removed duplicated region for block: B:54:0x0163  */
            /* JADX WARN: Type inference failed for: r5v0 */
            /* JADX WARN: Type inference failed for: r5v1, types: [boolean, byte] */
            /* JADX WARN: Type inference failed for: r5v37 */
            @Override // org.telegram.tgnet.RequestDelegate
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                int i2;
                ?? r5;
                ArrayList arrayList3;
                ArrayList arrayList4;
                int i3;
                String str;
                String str2;
                boolean z3;
                TLRPC.Updates updates;
                TLRPC.Message message;
                ArrayList arrayList5;
                int i4;
                TLRPC.Message message2;
                int i5;
                long j2;
                SparseLongArray sparseLongArray;
                final int i6;
                ArrayList arrayList6;
                final long j3;
                TLRPC.Updates updates2;
                ArrayList arrayList7;
                final TLRPC.Message message3;
                int indexOf;
                final r7a r7aVar2 = r7aVar;
                int i7 = i;
                ArrayList arrayList8 = arrayList;
                ArrayList arrayList9 = arrayList2;
                TLRPC.TL_messages_forwardMessages tL_messages_forwardMessages2 = tL_messages_forwardMessages;
                if (tL_error == null) {
                    SparseLongArray sparseLongArray2 = new SparseLongArray();
                    TLRPC.Updates updates3 = (TLRPC.Updates) tLObject;
                    int i8 = 0;
                    while (i8 < updates3.updates.size()) {
                        TLRPC.Update update = updates3.updates.get(i8);
                        if (update instanceof TL_update.TL_updateMessageID) {
                            TL_update.TL_updateMessageID tL_updateMessageID = (TL_update.TL_updateMessageID) update;
                            sparseLongArray2.put(tL_updateMessageID.id, tL_updateMessageID.random_id);
                            updates3.updates.remove(i8);
                            i8--;
                        }
                        i8++;
                    }
                    r7aVar2.getNotificationCenter().m(jn7.m3, sparseLongArray2);
                    ConcurrentHashMap concurrentHashMap = r7aVar2.getMessagesController().Q;
                    long j4 = j;
                    Integer num = (Integer) concurrentHashMap.get(Long.valueOf(j4));
                    if (num == null) {
                        num = Integer.valueOf(r7aVar2.getMessagesStorage().U(j4, true));
                        r7aVar2.getMessagesController().Q.put(Long.valueOf(j4), num);
                    }
                    Integer num2 = num;
                    ArrayList arrayList10 = new ArrayList();
                    int i9 = 0;
                    int i10 = 0;
                    while (i9 < updates3.updates.size()) {
                        TLRPC.Update update2 = updates3.updates.get(i9);
                        boolean z4 = update2 instanceof TL_update.TL_updateNewMessage;
                        long j5 = j4;
                        if (z4 || (update2 instanceof TL_update.TL_updateNewChannelMessage) || (update2 instanceof TL_update.TL_updateNewScheduledMessage) || (update2 instanceof TL_update.TL_updateQuickReplyMessage)) {
                            int i11 = i7 != 0 ? 1 : 0;
                            updates3.updates.remove(i9);
                            int i12 = i9 - 1;
                            if (z4) {
                                TL_update.TL_updateNewMessage tL_updateNewMessage = (TL_update.TL_updateNewMessage) update2;
                                message = tL_updateNewMessage.message;
                                updates = updates3;
                                r7aVar2.getMessagesController().W3(tL_updateNewMessage.pts, -1, tL_updateNewMessage.pts_count);
                            } else {
                                updates = updates3;
                                if (update2 instanceof TL_update.TL_updateNewScheduledMessage) {
                                    arrayList5 = arrayList10;
                                    i4 = i11;
                                    message2 = ((TL_update.TL_updateNewScheduledMessage) update2).message;
                                    i5 = 1;
                                    if (z && message2.date != 2147483646) {
                                        i5 = 0;
                                    }
                                    in5.R(message2);
                                    if (i5 == 0) {
                                        message2.unread = num2.intValue() < message2.id;
                                    }
                                    if (z2) {
                                        message2.out = true;
                                        message2.unread = false;
                                        message2.media_unread = false;
                                    }
                                    j2 = sparseLongArray2.get(message2.id);
                                    if (j2 != 0 || (message3 = (TLRPC.Message) zh6Var.f(j2)) == null || (indexOf = arrayList8.indexOf(message3)) == -1) {
                                        sparseLongArray = sparseLongArray2;
                                        i6 = i7;
                                        arrayList6 = arrayList9;
                                        j3 = j5;
                                        updates2 = updates;
                                        arrayList7 = arrayList8;
                                        i10 = i10;
                                        i9 = i12;
                                    } else {
                                        r47 r47Var2 = (r47) arrayList9.get(indexOf);
                                        arrayList8.remove(indexOf);
                                        arrayList9.remove(indexOf);
                                        final int i13 = message3.id;
                                        final ArrayList arrayList11 = new ArrayList();
                                        arrayList11.add(message2);
                                        TLRPC.Message message4 = r47Var2.k;
                                        sparseLongArray = sparseLongArray2;
                                        message4.post_author = message2.post_author;
                                        if ((message2.flags & 33554432) != 0) {
                                            message4.ttl_period = message2.ttl_period;
                                            message4.flags |= 33554432;
                                        }
                                        r7a r7aVar3 = r7aVar2;
                                        arrayList6 = arrayList9;
                                        updates2 = updates;
                                        int i14 = i7;
                                        arrayList7 = arrayList8;
                                        int i15 = i4;
                                        j3 = j5;
                                        r7aVar3.y0(r47Var2, message2, message2.id, Collections.singletonList(null), true, -1, message2.params);
                                        final int o1 = r47Var2.o1();
                                        message3.id = message2.id;
                                        int i16 = i10 + 1;
                                        if (i15 != i5) {
                                            r7aVar2 = r7aVar3;
                                            hl.c3(new u5a(r7aVar2, arrayList11, i5, i13, message3, i15, message2, r47Var, i14, (byte) 0));
                                            i6 = i14;
                                        } else {
                                            r7aVar2 = r7aVar3;
                                            to3 to3Var = r7aVar2.getMessagesStorage().a;
                                            final TLRPC.Peer peer2 = peer;
                                            final TLRPC.Message message5 = message2;
                                            i6 = i14;
                                            to3Var.c(new Runnable() { // from class: v5a
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    final r7a r7aVar4;
                                                    final int i17 = i6;
                                                    int i18 = i17 != 0 ? 1 : 0;
                                                    final TLRPC.Message message6 = message5;
                                                    if (r47.c5(message6)) {
                                                        i18 = 9;
                                                    } else if (message6.quick_reply_shortcut_id != 0 || message6.quick_reply_shortcut != null) {
                                                        i18 = 5;
                                                    }
                                                    int i19 = i18;
                                                    r7a r7aVar5 = r7a.this;
                                                    kf7 messagesStorage = r7aVar5.getMessagesStorage();
                                                    final TLRPC.Message message7 = message3;
                                                    long j6 = message7.random_id;
                                                    long B1 = r47.B1(peer2);
                                                    final int i20 = i13;
                                                    messagesStorage.c2(j6, B1, Integer.valueOf(i20), message7.id, 0, i17 != 0 ? 1 : 0, message6.quick_reply_shortcut_id);
                                                    r7aVar5.getMessagesStorage().k1(arrayList11, true, false, false, 0, false, i19, message6.quick_reply_shortcut_id);
                                                    if (r47.e3(message7)) {
                                                        long B12 = r47.B1(message7.peer_id);
                                                        ArrayList arrayList12 = new ArrayList(1);
                                                        arrayList12.add(Integer.valueOf(message7.id));
                                                        r7aVar5.getMessagesStorage().P0(B12, arrayList12, false, false, i19, (int) r47.Z1(r7aVar5.currentAccount, message7, 0));
                                                        r7aVar5.getMessagesStorage().T1(B12, -B12, arrayList12, null);
                                                        r7aVar4 = r7aVar5;
                                                        hl.c3(new p5a(r7aVar5, B12, arrayList12, (byte) 1));
                                                    } else {
                                                        r7aVar4 = r7aVar5;
                                                    }
                                                    final long j7 = j3;
                                                    final int i21 = o1;
                                                    hl.c3(new Runnable() { // from class: z5a
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            message7.send_state = 0;
                                                            r7a r7aVar6 = r7a.this;
                                                            ls6 mediaDataController = r7aVar6.getMediaDataController();
                                                            long j8 = j7;
                                                            mediaDataController.x0(j8);
                                                            jn7 notificationCenter = r7aVar6.getNotificationCenter();
                                                            int i22 = i20;
                                                            Integer valueOf = Integer.valueOf(i22);
                                                            TLRPC.Message message8 = message6;
                                                            Integer valueOf2 = Integer.valueOf(message8.id);
                                                            Long valueOf3 = Long.valueOf(j8);
                                                            int i23 = i21;
                                                            Integer valueOf4 = Integer.valueOf(i23);
                                                            int i24 = i17;
                                                            notificationCenter.k(jn7.J, valueOf, valueOf2, message8, valueOf3, 0L, valueOf4, Boolean.valueOf(i24 != 0));
                                                            r7aVar6.getNotificationCenter().k(jn7.K, Integer.valueOf(i22), Integer.valueOf(message8.id), message8, Long.valueOf(j8), 0L, Integer.valueOf(i23), Boolean.valueOf(i24 != 0));
                                                            r7aVar6.c0(i22);
                                                            r7aVar6.h0(i22, i24 != 0);
                                                        }
                                                    });
                                                }
                                            });
                                        }
                                        i9 = i12;
                                        i10 = i16;
                                    }
                                } else if (update2 instanceof TL_update.TL_updateQuickReplyMessage) {
                                    b19.f(r7aVar2.currentAccount).j(update2, null, 0);
                                    message = ((TL_update.TL_updateQuickReplyMessage) update2).message;
                                } else if (update2 instanceof TL_update.TL_updateNewEphemeralMessage) {
                                    TL_update.TL_updateNewEphemeralMessage tL_updateNewEphemeralMessage = (TL_update.TL_updateNewEphemeralMessage) update2;
                                    message = o44.b(tL_updateNewEphemeralMessage.message);
                                    arrayList10.add(tL_updateNewEphemeralMessage.message);
                                } else {
                                    TL_update.TL_updateNewChannelMessage tL_updateNewChannelMessage = (TL_update.TL_updateNewChannelMessage) update2;
                                    message = tL_updateNewChannelMessage.message;
                                    arrayList5 = arrayList10;
                                    i4 = i11;
                                    r7aVar2.getMessagesController().V3(tL_updateNewChannelMessage.pts, tL_updateNewChannelMessage.pts_count, message.peer_id.channel_id);
                                    message2 = message;
                                    i5 = 0;
                                    if (z) {
                                        i5 = 0;
                                    }
                                    in5.R(message2);
                                    if (i5 == 0) {
                                    }
                                    if (z2) {
                                    }
                                    j2 = sparseLongArray2.get(message2.id);
                                    if (j2 != 0) {
                                    }
                                    sparseLongArray = sparseLongArray2;
                                    i6 = i7;
                                    arrayList6 = arrayList9;
                                    j3 = j5;
                                    updates2 = updates;
                                    arrayList7 = arrayList8;
                                    i10 = i10;
                                    i9 = i12;
                                }
                            }
                            arrayList5 = arrayList10;
                            i4 = i11;
                            message2 = message;
                            i5 = 0;
                            if (z) {
                            }
                            in5.R(message2);
                            if (i5 == 0) {
                            }
                            if (z2) {
                            }
                            j2 = sparseLongArray2.get(message2.id);
                            if (j2 != 0) {
                            }
                            sparseLongArray = sparseLongArray2;
                            i6 = i7;
                            arrayList6 = arrayList9;
                            j3 = j5;
                            updates2 = updates;
                            arrayList7 = arrayList8;
                            i10 = i10;
                            i9 = i12;
                        } else {
                            sparseLongArray = sparseLongArray2;
                            arrayList5 = arrayList10;
                            arrayList6 = arrayList9;
                            j3 = j5;
                            updates2 = updates3;
                            i6 = i7;
                            arrayList7 = arrayList8;
                        }
                        i9++;
                        i7 = i6;
                        updates3 = updates2;
                        arrayList9 = arrayList6;
                        arrayList8 = arrayList7;
                        sparseLongArray2 = sparseLongArray;
                        arrayList10 = arrayList5;
                        j4 = j3;
                    }
                    ArrayList arrayList12 = arrayList10;
                    int i17 = i10;
                    arrayList3 = arrayList8;
                    arrayList4 = arrayList9;
                    TLRPC.Updates updates4 = updates3;
                    i2 = i7;
                    if (!arrayList12.isEmpty()) {
                        r7aVar2.getMessagesStorage().g1(arrayList12, true);
                    }
                    if (updates4.updates.isEmpty()) {
                        z3 = false;
                    } else {
                        z3 = false;
                        r7aVar2.getMessagesController().Y3(updates4, false);
                    }
                    i3 = 1;
                    r7aVar2.getStatsController().i(a.f(), 1, i17);
                    r5 = z3;
                } else {
                    i2 = i7;
                    r5 = 0;
                    arrayList3 = arrayList8;
                    arrayList4 = arrayList9;
                    i3 = 1;
                    hl.c3(new es6((Object) r7aVar2, (Object) tL_error, (Object) tL_messages_forwardMessages2, (byte) 4));
                }
                int i18 = r5;
                while (i18 < arrayList3.size()) {
                    ArrayList arrayList13 = arrayList3;
                    TLRPC.Message message6 = (TLRPC.Message) arrayList13.get(i18);
                    r7aVar2.getMessagesStorage().N0(i2 != 0 ? i3 : r5, message6);
                    if (tL_error != null && (str2 = tL_error.text) != null && str2.startsWith("ALLOW_PAYMENT_REQUIRED_")) {
                        jxa.v(r7aVar2.currentAccount, r5);
                        message6.errorAllowedPriceStars = jxa.l(tL_messages_forwardMessages2);
                        message6.errorNewPriceStars = Long.parseLong(tL_error.text.substring(23)) / tL_messages_forwardMessages2.id.size();
                        r7aVar2.getMessagesStorage().Z1(r47.B0(message6), message6);
                    }
                    hl.c3(new w5a(r7aVar2, message6, i2, r5));
                    i18++;
                    arrayList3 = arrayList13;
                }
                if (tL_error == null || (str = tL_error.text) == null || !str.startsWith("ALLOW_PAYMENT_REQUIRED_")) {
                    return;
                }
                hl.c3(new ve2(r7aVar2, arrayList4, (byte) 11));
            }
        }, 68);
    }
}
