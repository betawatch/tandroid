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

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final /* synthetic */ class m2a implements Runnable {
    public final /* synthetic */ z3a a;
    public final /* synthetic */ TLRPC.TL_messages_forwardMessages b;
    public final /* synthetic */ long c;
    public final /* synthetic */ int d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ vf6 h;
    public final /* synthetic */ ArrayList n;
    public final /* synthetic */ ArrayList r;
    public final /* synthetic */ k27 s;
    public final /* synthetic */ TLRPC.Peer w;

    public /* synthetic */ m2a(int i, long j, vf6 vf6Var, k27 k27Var, z3a z3aVar, ArrayList arrayList, ArrayList arrayList2, TLRPC.Peer peer, TLRPC.TL_messages_forwardMessages tL_messages_forwardMessages, boolean z, boolean z2) {
        this.a = z3aVar;
        this.b = tL_messages_forwardMessages;
        this.c = j;
        this.d = i;
        this.e = z;
        this.f = z2;
        this.h = vf6Var;
        this.n = arrayList;
        this.r = arrayList2;
        this.s = k27Var;
        this.w = peer;
    }

    @Override // java.lang.Runnable
    public final void run() {
        final z3a z3aVar = this.a;
        ConnectionsManager connectionsManager = z3aVar.getConnectionsManager();
        final int i = this.d;
        final long j = this.c;
        final vf6 vf6Var = this.h;
        final k27 k27Var = this.s;
        final ArrayList arrayList = this.n;
        final ArrayList arrayList2 = this.r;
        final TLRPC.Peer peer = this.w;
        final TLRPC.TL_messages_forwardMessages tL_messages_forwardMessages = this.b;
        final boolean z = this.e;
        final boolean z2 = this.f;
        connectionsManager.sendRequest(tL_messages_forwardMessages, new RequestDelegate() { // from class: g3a
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
                final z3a z3aVar2 = z3aVar;
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
                    z3aVar2.getNotificationCenter().m(kk7.l3, sparseLongArray2);
                    ConcurrentHashMap concurrentHashMap = z3aVar2.getMessagesController().Q;
                    long j4 = j;
                    Integer num = (Integer) concurrentHashMap.get(Long.valueOf(j4));
                    if (num == null) {
                        num = Integer.valueOf(z3aVar2.getMessagesStorage().S(j4, true));
                        z3aVar2.getMessagesController().Q.put(Long.valueOf(j4), num);
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
                                z3aVar2.getMessagesController().O3(tL_updateNewMessage.pts, -1, tL_updateNewMessage.pts_count);
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
                                    fl5.R(message2);
                                    if (i5 == 0) {
                                        message2.unread = num2.intValue() < message2.id;
                                    }
                                    if (z2) {
                                        message2.out = true;
                                        message2.unread = false;
                                        message2.media_unread = false;
                                    }
                                    j2 = sparseLongArray2.get(message2.id);
                                    if (j2 != 0 || (message3 = (TLRPC.Message) vf6Var.f(j2)) == null || (indexOf = arrayList8.indexOf(message3)) == -1) {
                                        sparseLongArray = sparseLongArray2;
                                        i6 = i7;
                                        arrayList6 = arrayList9;
                                        j3 = j5;
                                        updates2 = updates;
                                        arrayList7 = arrayList8;
                                        i10 = i10;
                                        i9 = i12;
                                    } else {
                                        k27 k27Var2 = (k27) arrayList9.get(indexOf);
                                        arrayList8.remove(indexOf);
                                        arrayList9.remove(indexOf);
                                        final int i13 = message3.id;
                                        final ArrayList arrayList11 = new ArrayList();
                                        arrayList11.add(message2);
                                        TLRPC.Message message4 = k27Var2.k;
                                        sparseLongArray = sparseLongArray2;
                                        message4.post_author = message2.post_author;
                                        if ((message2.flags & 33554432) != 0) {
                                            message4.ttl_period = message2.ttl_period;
                                            message4.flags |= 33554432;
                                        }
                                        z3a z3aVar3 = z3aVar2;
                                        arrayList6 = arrayList9;
                                        updates2 = updates;
                                        int i14 = i7;
                                        arrayList7 = arrayList8;
                                        int i15 = i4;
                                        j3 = j5;
                                        z3aVar3.y0(k27Var2, message2, message2.id, Collections.singletonList(null), true, -1, message2.params);
                                        final int o1 = k27Var2.o1();
                                        message3.id = message2.id;
                                        int i16 = i10 + 1;
                                        if (i15 != i5) {
                                            z3aVar2 = z3aVar3;
                                            gl.d3(new u1a(z3aVar2, arrayList11, i5, i13, message3, i15, message2, k27Var, i14, (byte) 0));
                                            i6 = i14;
                                        } else {
                                            z3aVar2 = z3aVar3;
                                            co3 co3Var = z3aVar2.getMessagesStorage().a;
                                            final TLRPC.Peer peer2 = peer;
                                            final TLRPC.Message message5 = message2;
                                            i6 = i14;
                                            co3Var.c(new Runnable() { // from class: v1a
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    final z3a z3aVar4;
                                                    final int i17 = i6;
                                                    int i18 = i17 != 0 ? 1 : 0;
                                                    final TLRPC.Message message6 = message5;
                                                    if (k27.c5(message6)) {
                                                        i18 = 9;
                                                    } else if (message6.quick_reply_shortcut_id != 0 || message6.quick_reply_shortcut != null) {
                                                        i18 = 5;
                                                    }
                                                    int i19 = i18;
                                                    z3a z3aVar5 = z3a.this;
                                                    ad7 messagesStorage = z3aVar5.getMessagesStorage();
                                                    final TLRPC.Message message7 = message3;
                                                    long j6 = message7.random_id;
                                                    long B1 = k27.B1(peer2);
                                                    final int i20 = i13;
                                                    messagesStorage.X1(j6, B1, Integer.valueOf(i20), message7.id, 0, i17 != 0 ? 1 : 0, message6.quick_reply_shortcut_id);
                                                    z3aVar5.getMessagesStorage().g1(arrayList11, true, false, false, 0, false, i19, message6.quick_reply_shortcut_id);
                                                    if (k27.e3(message7)) {
                                                        long B12 = k27.B1(message7.peer_id);
                                                        ArrayList arrayList12 = new ArrayList(1);
                                                        arrayList12.add(Integer.valueOf(message7.id));
                                                        z3aVar5.getMessagesStorage().M0(B12, arrayList12, false, false, i19, (int) k27.Z1(z3aVar5.currentAccount, message7, 0));
                                                        z3aVar5.getMessagesStorage().O1(B12, -B12, arrayList12, null);
                                                        z3aVar4 = z3aVar5;
                                                        gl.d3(new q1a(z3aVar5, B12, arrayList12, (byte) 2));
                                                    } else {
                                                        z3aVar4 = z3aVar5;
                                                    }
                                                    final long j7 = j3;
                                                    final int i21 = o1;
                                                    gl.d3(new Runnable() { // from class: b2a
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            message7.send_state = 0;
                                                            z3a z3aVar6 = z3a.this;
                                                            hq6 mediaDataController = z3aVar6.getMediaDataController();
                                                            long j8 = j7;
                                                            mediaDataController.x0(j8);
                                                            kk7 notificationCenter = z3aVar6.getNotificationCenter();
                                                            int i22 = i20;
                                                            Integer valueOf = Integer.valueOf(i22);
                                                            TLRPC.Message message8 = message6;
                                                            Integer valueOf2 = Integer.valueOf(message8.id);
                                                            Long valueOf3 = Long.valueOf(j8);
                                                            int i23 = i21;
                                                            Integer valueOf4 = Integer.valueOf(i23);
                                                            int i24 = i17;
                                                            notificationCenter.k(kk7.J, valueOf, valueOf2, message8, valueOf3, 0L, valueOf4, Boolean.valueOf(i24 != 0));
                                                            z3aVar6.getNotificationCenter().k(kk7.K, Integer.valueOf(i22), Integer.valueOf(message8.id), message8, Long.valueOf(j8), 0L, Integer.valueOf(i23), Boolean.valueOf(i24 != 0));
                                                            z3aVar6.c0(i22);
                                                            z3aVar6.h0(i22, i24 != 0);
                                                        }
                                                    });
                                                }
                                            });
                                        }
                                        i9 = i12;
                                        i10 = i16;
                                    }
                                } else if (update2 instanceof TL_update.TL_updateQuickReplyMessage) {
                                    ox8.f(z3aVar2.currentAccount).j(update2, null, 0);
                                    message = ((TL_update.TL_updateQuickReplyMessage) update2).message;
                                } else if (update2 instanceof TL_update.TL_updateNewEphemeralMessage) {
                                    TL_update.TL_updateNewEphemeralMessage tL_updateNewEphemeralMessage = (TL_update.TL_updateNewEphemeralMessage) update2;
                                    message = t34.b(tL_updateNewEphemeralMessage.message);
                                    arrayList10.add(tL_updateNewEphemeralMessage.message);
                                } else {
                                    TL_update.TL_updateNewChannelMessage tL_updateNewChannelMessage = (TL_update.TL_updateNewChannelMessage) update2;
                                    message = tL_updateNewChannelMessage.message;
                                    arrayList5 = arrayList10;
                                    i4 = i11;
                                    z3aVar2.getMessagesController().N3(tL_updateNewChannelMessage.pts, tL_updateNewChannelMessage.pts_count, message.peer_id.channel_id);
                                    message2 = message;
                                    i5 = 0;
                                    if (z) {
                                        i5 = 0;
                                    }
                                    fl5.R(message2);
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
                            fl5.R(message2);
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
                        z3aVar2.getMessagesStorage().c1(arrayList12, true);
                    }
                    if (updates4.updates.isEmpty()) {
                        z3 = false;
                    } else {
                        z3 = false;
                        z3aVar2.getMessagesController().Q3(updates4, false);
                    }
                    i3 = 1;
                    z3aVar2.getStatsController().i(a.f(), 1, i17);
                    r5 = z3;
                } else {
                    i2 = i7;
                    r5 = 0;
                    arrayList3 = arrayList8;
                    arrayList4 = arrayList9;
                    i3 = 1;
                    gl.d3(new nn6(z3aVar2, tL_error, tL_messages_forwardMessages2, (byte) 4));
                }
                int i18 = r5;
                while (i18 < arrayList3.size()) {
                    ArrayList arrayList13 = arrayList3;
                    TLRPC.Message message6 = (TLRPC.Message) arrayList13.get(i18);
                    z3aVar2.getMessagesStorage().K0(i2 != 0 ? i3 : r5, message6);
                    if (tL_error != null && (str2 = tL_error.text) != null && str2.startsWith("ALLOW_PAYMENT_REQUIRED_")) {
                        gta.v(z3aVar2.currentAccount, r5);
                        message6.errorAllowedPriceStars = gta.l(tL_messages_forwardMessages2);
                        message6.errorNewPriceStars = Long.parseLong(tL_error.text.substring(23)) / tL_messages_forwardMessages2.id.size();
                        z3aVar2.getMessagesStorage().U1(k27.B0(message6), message6);
                    }
                    gl.d3(new w1a(z3aVar2, message6, i2, r5));
                    i18++;
                    arrayList3 = arrayList13;
                }
                if (tL_error == null || (str = tL_error.text) == null || !str.startsWith("ALLOW_PAYMENT_REQUIRED_")) {
                    return;
                }
                gl.d3(new ee2(z3aVar2, arrayList4, (byte) 11));
            }
        }, 68);
    }
}
