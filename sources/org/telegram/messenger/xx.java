package org.telegram.messenger;

import android.os.SystemClock;
import android.text.TextUtils;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_update;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final /* synthetic */ class xx implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ ez b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ TLRPC.TL_error d;
    public final /* synthetic */ TLRPC.Message e;
    public final /* synthetic */ TLObject f;
    public final /* synthetic */ gj h;
    public final /* synthetic */ HashMap n;
    public final /* synthetic */ String r;
    public final /* synthetic */ TLObject s;

    public /* synthetic */ xx(ez ezVar, TLRPC.TL_error tL_error, TLRPC.Message message, TLObject tLObject, gj gjVar, String str, HashMap hashMap, boolean z10, TLObject tLObject2) {
        this.b = ezVar;
        this.d = tL_error;
        this.e = message;
        this.f = tLObject;
        this.h = gjVar;
        this.r = str;
        this.n = hashMap;
        this.c = z10;
        this.s = tLObject2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:219:0x06e6  */
    /* JADX WARN: Type inference failed for: r17v0 */
    /* JADX WARN: Type inference failed for: r17v1 */
    /* JADX WARN: Type inference failed for: r17v2 */
    /* JADX WARN: Type inference failed for: r1v15, types: [org.telegram.messenger.vr] */
    /* JADX WARN: Type inference failed for: r5v4, types: [org.telegram.messenger.c1, org.telegram.messenger.ez] */
    /* JADX WARN: Type inference failed for: r5v55 */
    /* JADX WARN: Type inference failed for: r5v56 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v78 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        TLRPC.Message message;
        TLRPC.Message message2;
        final TLRPC.Message message3;
        gj gjVar;
        ?? r62;
        TLRPC.TL_error tL_error;
        TLObject tLObject;
        boolean z10;
        ?? r52;
        String str;
        int i7;
        TLObject tLObject2;
        Long l10;
        TLRPC.TL_error tL_error2;
        long j3;
        boolean z11;
        boolean z12;
        int i10;
        ez ezVar;
        boolean z13;
        int i11;
        ArrayList<TLRPC.Update> arrayList;
        ArrayList arrayList2;
        String str2;
        boolean z14;
        TLRPC.Updates updates;
        ez ezVar2;
        ez ezVar3;
        int i12;
        TLRPC.MessageReplyHeader messageReplyHeader;
        long j10;
        ArrayList<TLRPC.Update> arrayList3;
        a0.h hVar;
        TLRPC.Message message4;
        ez ezVar4;
        ArrayList arrayList4;
        int i13;
        boolean z15;
        ez ezVar5;
        switch (this.a) {
            case 0:
                ez ezVar6 = this.b;
                TLRPC.TL_error tL_error3 = this.d;
                TLRPC.Message message5 = this.e;
                TLObject tLObject3 = this.f;
                gj gjVar2 = this.h;
                String str3 = this.r;
                HashMap hashMap = this.n;
                boolean z16 = this.c;
                TLObject tLObject4 = this.s;
                if (tL_error3 != null) {
                    org.telegram.ui.Components.t4.c0(ezVar6.currentAccount, tL_error3, null, tLObject4, new Object[0]);
                    ezVar6.i0(message5.id, z16);
                    ezVar6.l0(gjVar2);
                    break;
                } else {
                    String str4 = message5.attachPath;
                    TLRPC.Updates updates2 = (TLRPC.Updates) tLObject3;
                    ArrayList<TLRPC.Update> arrayList5 = updates2.updates;
                    for (int i14 = 0; i14 < arrayList5.size(); i14++) {
                        TLRPC.Update update = arrayList5.get(i14);
                        if (update instanceof TL_update.TL_updateEditMessage) {
                            message2 = ((TL_update.TL_updateEditMessage) update).message;
                        } else if (update instanceof TL_update.TL_updateEditChannelMessage) {
                            message2 = ((TL_update.TL_updateEditChannelMessage) update).message;
                        } else if (update instanceof TL_update.TL_updateNewScheduledMessage) {
                            message2 = ((TL_update.TL_updateNewScheduledMessage) update).message;
                        } else if (update instanceof TL_update.TL_updateQuickReplyMessage) {
                            kg.v1.f(ezVar6.currentAccount).j(update, gj.J1(message5), gj.I1(message5));
                            message2 = ((TL_update.TL_updateQuickReplyMessage) update).message;
                        }
                        message = message2;
                        if (message != null) {
                            fc.W(message);
                            ezVar6.z0(gjVar2, message, message.id, Collections.singletonList(str3), false, -1, hashMap);
                        }
                        Utilities.d.c(new jy(ezVar6, updates2, message5, z16, 0));
                        break;
                    }
                    message = null;
                    if (message != null) {
                    }
                    Utilities.d.c(new jy(ezVar6, updates2, message5, z16, 0));
                }
            default:
                ez ezVar7 = this.b;
                boolean z17 = this.c;
                TLRPC.TL_error tL_error4 = this.d;
                TLRPC.Message message6 = this.e;
                TLObject tLObject5 = this.f;
                gj gjVar3 = this.h;
                HashMap hashMap2 = this.n;
                String str5 = this.r;
                TLObject tLObject6 = this.s;
                if (tL_error4 == null) {
                    int i15 = 1;
                    int i16 = message6.id;
                    ArrayList arrayList6 = new ArrayList();
                    boolean z18 = message6.date == 2147483646;
                    if (tLObject5 instanceof TLRPC.TL_updateShortSentMessage) {
                        TLRPC.TL_updateShortSentMessage tL_updateShortSentMessage = (TLRPC.TL_updateShortSentMessage) tLObject5;
                        i7 = i16;
                        tLObject2 = tLObject6;
                        l10 = 0L;
                        tL_error2 = tL_error4;
                        ezVar7.z0(gjVar3, null, tL_updateShortSentMessage.id, Collections.singletonList(null), false, -1, hashMap2);
                        ez ezVar8 = ezVar7;
                        int o12 = gjVar3.o1();
                        int i17 = tL_updateShortSentMessage.id;
                        message6.id = i17;
                        message6.local_id = i17;
                        message6.date = tL_updateShortSentMessage.date;
                        message6.entities = tL_updateShortSentMessage.entities;
                        message6.out = tL_updateShortSentMessage.out;
                        if ((tL_updateShortSentMessage.flags & 33554432) != 0) {
                            message6.ttl_period = tL_updateShortSentMessage.ttl_period;
                            message6.flags |= 33554432;
                        }
                        TLRPC.MessageMedia messageMedia = tL_updateShortSentMessage.media;
                        if (messageMedia != null) {
                            message6.media = messageMedia;
                            message6.flags |= 512;
                            fc.W(message6);
                        }
                        TLRPC.MessageMedia messageMedia2 = tL_updateShortSentMessage.media;
                        if (((messageMedia2 instanceof TLRPC.TL_messageMediaGame) || (messageMedia2 instanceof TLRPC.TL_messageMediaInvoice)) && !TextUtils.isEmpty(tL_updateShortSentMessage.message)) {
                            message6.message = tL_updateShortSentMessage.message;
                        }
                        if (!message6.entities.isEmpty()) {
                            message6.flags |= 128;
                        }
                        Integer num = (Integer) ezVar8.getMessagesController().Q.get(Long.valueOf(message6.dialog_id));
                        if (num == null) {
                            num = Integer.valueOf(ezVar8.getMessagesStorage().U(message6.dialog_id, message6.out));
                            ezVar8.getMessagesController().Q.put(Long.valueOf(message6.dialog_id), num);
                        }
                        message6.unread = num.intValue() < message6.id;
                        Utilities.d.c(new pq(20, ezVar8, tL_updateShortSentMessage));
                        arrayList6.add(message6);
                        i10 = o12;
                        j3 = 0;
                        z12 = false;
                        z11 = false;
                        gjVar = gjVar3;
                        ezVar4 = ezVar8;
                    } else {
                        i7 = i16;
                        HashMap hashMap3 = hashMap2;
                        tLObject2 = tLObject6;
                        l10 = 0L;
                        ez ezVar9 = ezVar7;
                        tL_error2 = tL_error4;
                        if (tLObject5 instanceof TLRPC.Updates) {
                            TLRPC.Updates updates3 = (TLRPC.Updates) tLObject5;
                            ArrayList<TLRPC.Update> arrayList7 = updates3.updates;
                            ArrayList arrayList8 = new ArrayList();
                            j3 = 0;
                            TLRPC.Message message7 = null;
                            a0.h hVar2 = null;
                            int i18 = 0;
                            boolean z19 = z17;
                            ez ezVar10 = ezVar9;
                            while (i18 < arrayList7.size()) {
                                TLRPC.Update update2 = arrayList7.get(i18);
                                HashMap hashMap4 = hashMap3;
                                if (update2 instanceof TL_update.TL_updateNewMessage) {
                                    TL_update.TL_updateNewMessage tL_updateNewMessage = (TL_update.TL_updateNewMessage) update2;
                                    TLRPC.Message message8 = tL_updateNewMessage.message;
                                    TLRPC.Updates updates4 = updates3;
                                    if (message8.action != null) {
                                        ezVar2 = ezVar10;
                                        arrayList = arrayList7;
                                        arrayList2 = arrayList8;
                                        str2 = str5;
                                        z14 = z19;
                                        updates = updates4;
                                        z19 = z14;
                                        ezVar3 = ezVar2;
                                    } else {
                                        arrayList6.add(message8);
                                        Utilities.d.c(new gy(ezVar10, tL_updateNewMessage, 2));
                                        arrayList7.remove(i18);
                                        i18--;
                                        ezVar3 = ezVar10;
                                        arrayList = arrayList7;
                                        arrayList2 = arrayList8;
                                        i12 = i15;
                                        updates = updates4;
                                        message7 = message8;
                                        str2 = str5;
                                        i18 += i12;
                                        arrayList7 = arrayList;
                                        i15 = i12;
                                        arrayList8 = arrayList2;
                                        str5 = str2;
                                        ezVar10 = ezVar3;
                                        updates3 = updates;
                                        hashMap3 = hashMap4;
                                    }
                                } else {
                                    TLRPC.Updates updates5 = updates3;
                                    if (update2 instanceof TL_update.TL_updateNewEphemeralMessage) {
                                        TL_update.TL_updateNewEphemeralMessage tL_updateNewEphemeralMessage = (TL_update.TL_updateNewEphemeralMessage) update2;
                                        TLRPC.TL_message b10 = bg.w.b(tL_updateNewEphemeralMessage.message);
                                        arrayList6.add(b10);
                                        arrayList8.add(tL_updateNewEphemeralMessage.message);
                                        arrayList7.remove(i18);
                                        i18--;
                                        message7 = b10;
                                        ezVar3 = ezVar10;
                                        arrayList = arrayList7;
                                        arrayList2 = arrayList8;
                                        str2 = str5;
                                        i12 = i15;
                                        updates = updates5;
                                    } else if (update2 instanceof TL_update.TL_updateNewChannelMessage) {
                                        TL_update.TL_updateNewChannelMessage tL_updateNewChannelMessage = (TL_update.TL_updateNewChannelMessage) update2;
                                        ArrayList arrayList9 = arrayList8;
                                        long V1 = np.V1(tL_updateNewChannelMessage);
                                        TLRPC.Chat M0 = ezVar10.getMessagesController().M0(Long.valueOf(V1));
                                        if (!(M0 == null || M0.megagroup) || (messageReplyHeader = tL_updateNewChannelMessage.message.reply_to) == null || (messageReplyHeader.reply_to_top_id == 0 && messageReplyHeader.reply_to_msg_id == 0)) {
                                            j10 = V1;
                                        } else {
                                            if (hVar2 == null) {
                                                hVar2 = new a0.h();
                                            }
                                            j10 = V1;
                                            long B0 = gj.B0(tL_updateNewChannelMessage.message);
                                            SparseArray sparseArray = (SparseArray) hVar2.f(B0);
                                            if (sparseArray == null) {
                                                sparseArray = new SparseArray();
                                                hVar2.k(sparseArray, B0);
                                            }
                                            TLRPC.MessageReplyHeader messageReplyHeader2 = tL_updateNewChannelMessage.message.reply_to;
                                            int i19 = messageReplyHeader2.reply_to_top_id;
                                            if (i19 == 0) {
                                                i19 = messageReplyHeader2.reply_to_msg_id;
                                            }
                                            TLRPC.MessageReplies messageReplies = (TLRPC.MessageReplies) sparseArray.get(i19);
                                            if (messageReplies == null) {
                                                messageReplies = new TLRPC.TL_messageReplies();
                                                sparseArray.put(i19, messageReplies);
                                            }
                                            TLRPC.Peer peer = tL_updateNewChannelMessage.message.from_id;
                                            if (peer != null) {
                                                messageReplies.recent_repliers.add(0, peer);
                                            }
                                            messageReplies.replies++;
                                        }
                                        a0.h hVar3 = hVar2;
                                        TLRPC.Message message9 = tL_updateNewChannelMessage.message;
                                        arrayList6.add(message9);
                                        Utilities.d.c(new hy(ezVar10, tL_updateNewChannelMessage, i15));
                                        arrayList7.remove(i18);
                                        i18--;
                                        if (tL_updateNewChannelMessage.message.pinned) {
                                            arrayList3 = arrayList7;
                                            arrayList2 = arrayList9;
                                            updates = updates5;
                                            message4 = message9;
                                            long j11 = j10;
                                            str2 = str5;
                                            hVar = hVar3;
                                            Utilities.d.c(new gw(ezVar10, tL_updateNewChannelMessage, j11, 0));
                                        } else {
                                            arrayList2 = arrayList9;
                                            arrayList3 = arrayList7;
                                            str2 = str5;
                                            hVar = hVar3;
                                            updates = updates5;
                                            message4 = message9;
                                        }
                                        arrayList = arrayList3;
                                        message7 = message4;
                                        hVar2 = hVar;
                                        z19 = false;
                                        ezVar3 = ezVar10;
                                    } else {
                                        arrayList = arrayList7;
                                        arrayList2 = arrayList8;
                                        str2 = str5;
                                        z14 = z19;
                                        updates = updates5;
                                        if (update2 instanceof TL_update.TL_updateNewScheduledMessage) {
                                            TL_update.TL_updateNewScheduledMessage tL_updateNewScheduledMessage = (TL_update.TL_updateNewScheduledMessage) update2;
                                            int i20 = 0;
                                            while (true) {
                                                if (i20 < arrayList6.size()) {
                                                    if (((TLRPC.Message) arrayList6.get(i20)).id == tL_updateNewScheduledMessage.message.id) {
                                                        arrayList6.remove(i20);
                                                    } else {
                                                        i20++;
                                                    }
                                                }
                                            }
                                            TLRPC.Message message10 = tL_updateNewScheduledMessage.message;
                                            arrayList6.add(message10);
                                            arrayList.remove(i18);
                                            i18--;
                                            ezVar3 = ezVar10;
                                            message7 = message10;
                                            i12 = 1;
                                            z19 = true;
                                        } else if (update2 instanceof TL_update.TL_updateQuickReplyMessage) {
                                            kg.v1.f(ezVar10.currentAccount).j(update2, gj.J1(gjVar3.k), gj.I1(gjVar3.k));
                                            TLRPC.Message message11 = ((TL_update.TL_updateQuickReplyMessage) update2).message;
                                            arrayList6.add(message11);
                                            arrayList.remove(i18);
                                            i18--;
                                            ezVar3 = ezVar10;
                                            z19 = z14;
                                            message7 = message11;
                                        } else {
                                            if (update2 instanceof TL_update.TL_updateDeleteScheduledMessages) {
                                                TL_update.TL_updateDeleteScheduledMessages tL_updateDeleteScheduledMessages = (TL_update.TL_updateDeleteScheduledMessages) update2;
                                                if (gj.B0(gjVar3.k) == m5.o(tL_updateDeleteScheduledMessages.peer)) {
                                                    ArrayList<Integer> arrayList10 = tL_updateDeleteScheduledMessages.messages;
                                                    int size = arrayList10.size();
                                                    int i21 = 0;
                                                    ez ezVar11 = ezVar10;
                                                    while (i21 < size) {
                                                        Integer num2 = arrayList10.get(i21);
                                                        i21++;
                                                        int intValue = num2.intValue();
                                                        ez ezVar12 = ezVar11;
                                                        int i22 = 0;
                                                        while (true) {
                                                            if (i22 >= arrayList6.size()) {
                                                                break;
                                                            } else if (((TLRPC.Message) arrayList6.get(i22)).id == intValue) {
                                                                arrayList6.remove(i22);
                                                            } else {
                                                                i22++;
                                                            }
                                                        }
                                                        ezVar11 = ezVar12;
                                                    }
                                                    ezVar3 = ezVar11;
                                                    arrayList.remove(i18);
                                                    i18--;
                                                    i12 = 1;
                                                    z19 = false;
                                                }
                                            }
                                            ezVar2 = ezVar10;
                                            z19 = z14;
                                            ezVar3 = ezVar2;
                                        }
                                    }
                                    i18 += i12;
                                    arrayList7 = arrayList;
                                    i15 = i12;
                                    arrayList8 = arrayList2;
                                    str5 = str2;
                                    ezVar10 = ezVar3;
                                    updates3 = updates;
                                    hashMap3 = hashMap4;
                                }
                                i12 = 1;
                                i18 += i12;
                                arrayList7 = arrayList;
                                i15 = i12;
                                arrayList8 = arrayList2;
                                str5 = str2;
                                ezVar10 = ezVar3;
                                updates3 = updates;
                                hashMap3 = hashMap4;
                            }
                            HashMap hashMap5 = hashMap3;
                            TLRPC.Updates updates6 = updates3;
                            ez ezVar13 = ezVar10;
                            ArrayList<TLRPC.Update> arrayList11 = arrayList7;
                            ArrayList arrayList12 = arrayList8;
                            String str6 = str5;
                            boolean z20 = z19;
                            boolean z21 = i15;
                            if (!arrayList12.isEmpty()) {
                                ezVar13.getMessagesStorage().f1(arrayList12, z21);
                            }
                            if (hVar2 != null) {
                                ezVar13.getMessagesStorage().a1(null, null, hVar2, z21);
                                ns notificationCenter = ezVar13.getNotificationCenter();
                                Object[] objArr = new Object[4];
                                objArr[0] = null;
                                objArr[z21 ? 1 : 0] = null;
                                objArr[2] = hVar2;
                                objArr[3] = Boolean.TRUE;
                                notificationCenter.k(77, objArr);
                            }
                            if (message7 != null) {
                                gj.B0(message7);
                                boolean z22 = (!z18 || message7.date == 2147483646) ? z20 : false;
                                fc.W(message7);
                                if (!z22) {
                                    Integer num3 = (Integer) ezVar13.getMessagesController().Q.get(Long.valueOf(message7.dialog_id));
                                    if (num3 == null) {
                                        num3 = Integer.valueOf(ezVar13.getMessagesStorage().U(message7.dialog_id, message7.out));
                                        ezVar13.getMessagesController().Q.put(Long.valueOf(message7.dialog_id), num3);
                                    }
                                    message7.unread = num3.intValue() < message7.id;
                                }
                                TLRPC.Message message12 = gjVar3.k;
                                message12.post_author = message7.post_author;
                                if ((message7.flags & 33554432) != 0) {
                                    message12.ttl_period = message7.ttl_period;
                                    message12.flags |= 33554432;
                                }
                                message12.entities = message7.entities;
                                int i23 = message7.quick_reply_shortcut_id;
                                message12.quick_reply_shortcut_id = i23;
                                if (i23 != 0) {
                                    message12.flags |= TLObject.FLAG_30;
                                }
                                TLRPC.Message message13 = message7;
                                ezVar13.z0(gjVar3, message13, message7.id, Collections.singletonList(str6), false, -1, hashMap5);
                                gjVar = gjVar3;
                                ezVar = ezVar13;
                                int o13 = gjVar.o1();
                                message6.id = message13.id;
                                i11 = o13;
                                z20 = z22;
                                z13 = false;
                            } else {
                                gjVar = gjVar3;
                                ezVar = ezVar13;
                                if (r2.a) {
                                    StringBuilder sb2 = new StringBuilder();
                                    for (int i24 = 0; i24 < arrayList11.size(); i24++) {
                                        sb2.append(arrayList11.get(i24).getClass().getSimpleName());
                                        sb2.append(", ");
                                    }
                                    a8.b("can't find message in updates " + ((Object) sb2));
                                }
                                z13 = true;
                                i11 = 0;
                            }
                            Utilities.d.c(new hw(ezVar, updates6, 0));
                            z12 = z13;
                            z11 = z20;
                            i10 = i11;
                            ezVar4 = ezVar;
                        } else {
                            j3 = 0;
                            gjVar = gjVar3;
                            z11 = z17;
                            z12 = false;
                            i10 = 0;
                            ezVar4 = ezVar9;
                        }
                    }
                    if ((gj.n1(message6) instanceof TLRPC.TL_messageMediaGeoLive) && message6.via_bot_id == j3 && TextUtils.isEmpty(message6.via_bot_name)) {
                        rd locationController = ezVar4.getLocationController();
                        ArrayList arrayList13 = locationController.b;
                        a0.h hVar4 = locationController.a;
                        qd qdVar = new qd();
                        z10 = z12;
                        qdVar.a = message6.dialog_id;
                        qdVar.b = message6.id;
                        TLRPC.MessageMedia messageMedia3 = message6.media;
                        qdVar.d = messageMedia3.period;
                        int i25 = messageMedia3.proximity_notification_radius;
                        qdVar.f = i25;
                        qdVar.g = i25;
                        int i26 = locationController.currentAccount;
                        qdVar.e = i26;
                        qdVar.h = new gj(i26, message6, false, false);
                        if (qdVar.d == Integer.MAX_VALUE) {
                            qdVar.c = ConnectionsManager.DEFAULT_DATACENTER_ID;
                        } else {
                            qdVar.c = locationController.getConnectionsManager().getCurrentTime() + qdVar.d;
                        }
                        qd qdVar2 = (qd) hVar4.f(qdVar.a);
                        i13 = i10;
                        arrayList4 = arrayList6;
                        hVar4.k(qdVar, qdVar.a);
                        if (qdVar2 != null) {
                            arrayList13.remove(qdVar2);
                        }
                        arrayList13.add(qdVar);
                        locationController.l(qdVar, 0);
                        locationController.w = SystemClock.elapsedRealtime() - 25000;
                        g0.h3(new mg(locationController, qdVar2, qdVar, 28));
                    } else {
                        z10 = z12;
                        arrayList4 = arrayList6;
                        i13 = i10;
                    }
                    if (z10) {
                        z15 = z17;
                        message3 = message6;
                        ezVar5 = ezVar4;
                    } else {
                        ezVar4.getStatsController().k(t0.f(), 1, 1);
                        message6.send_state = 0;
                        long j12 = j3;
                        message6.errorNewPriceStars = j12;
                        message6.errorAllowedPriceStars = j12;
                        if (z17 != z11) {
                            ArrayList arrayList14 = new ArrayList();
                            arrayList14.add(Integer.valueOf(i7));
                            ArrayList arrayList15 = new ArrayList();
                            arrayList15.add(new gj(gjVar.K1, gjVar.k, true, true));
                            z15 = z17;
                            message3 = message6;
                            ezVar4.getMessagesStorage().a.c(new iw(ezVar4, arrayList4, z17, z11, message6, arrayList14, arrayList15, i7));
                            ezVar5 = ezVar4;
                        } else {
                            final boolean z23 = z17;
                            message3 = message6;
                            final int i27 = i7;
                            ezVar4.getNotificationCenter().k(21, Integer.valueOf(i27), Integer.valueOf(message3.id), message3, Long.valueOf(message3.dialog_id), l10, Integer.valueOf(i13), Boolean.valueOf(z23));
                            ez ezVar14 = ezVar4;
                            ezVar4.getNotificationCenter().k(22, Integer.valueOf(i27), Integer.valueOf(message3.id), message3, Long.valueOf(message3.dialog_id), l10, Integer.valueOf(i13), Boolean.valueOf(z23));
                            final int i28 = i13;
                            final ArrayList arrayList16 = arrayList4;
                            final ez ezVar15 = ezVar14;
                            ezVar14.getMessagesStorage().a.c(new Runnable() { // from class: org.telegram.messenger.jw
                                /* JADX WARN: Removed duplicated region for block: B:7:0x0053  */
                                @Override // java.lang.Runnable
                                /*
                                    Code decompiled incorrectly, please refer to instructions dump.
                                */
                                public final void run() {
                                    int i29;
                                    int i30;
                                    TLRPC.Message message14 = message3;
                                    boolean d52 = gj.d5(message14);
                                    boolean z24 = z23;
                                    if (d52) {
                                        i29 = 9;
                                    } else {
                                        if (message14.quick_reply_shortcut_id == 0 && message14.quick_reply_shortcut == null) {
                                            i30 = z24 ? 1 : 0;
                                            ez ezVar16 = ez.this;
                                            vr messagesStorage = ezVar16.getMessagesStorage();
                                            long j13 = message14.random_id;
                                            long B1 = gj.B1(message14.peer_id);
                                            int i31 = i27;
                                            messagesStorage.a2(j13, B1, Integer.valueOf(i31), message14.id, 0, z24 ? 1 : 0, message14.quick_reply_shortcut_id);
                                            ezVar16.getMessagesStorage().j1(arrayList16, true, false, false, 0, false, i30, message14.quick_reply_shortcut_id);
                                            int i32 = i30;
                                            if (gj.e3(message14)) {
                                                long B12 = gj.B1(message14.peer_id);
                                                ArrayList arrayList17 = new ArrayList(1);
                                                arrayList17.add(Integer.valueOf(message14.id));
                                                ezVar16.getMessagesStorage().P0(B12, arrayList17, false, false, i32, (int) gj.Z1(ezVar16.currentAccount, message14, 0));
                                                ezVar16.getMessagesStorage().R1(B12, -B12, arrayList17, null);
                                                g0.h3(new nw(ezVar16, B12, arrayList17, 0));
                                            }
                                            g0.h3(new pw(ezVar16, message14, i31, i28, z24));
                                        }
                                        i29 = 5;
                                    }
                                    i30 = i29;
                                    ez ezVar162 = ez.this;
                                    vr messagesStorage2 = ezVar162.getMessagesStorage();
                                    long j132 = message14.random_id;
                                    long B13 = gj.B1(message14.peer_id);
                                    int i312 = i27;
                                    messagesStorage2.a2(j132, B13, Integer.valueOf(i312), message14.id, 0, z24 ? 1 : 0, message14.quick_reply_shortcut_id);
                                    ezVar162.getMessagesStorage().j1(arrayList16, true, false, false, 0, false, i30, message14.quick_reply_shortcut_id);
                                    int i322 = i30;
                                    if (gj.e3(message14)) {
                                    }
                                    g0.h3(new pw(ezVar162, message14, i312, i28, z24));
                                }
                            });
                            ezVar5 = ezVar15;
                            z15 = z23;
                        }
                    }
                    tL_error = tL_error2;
                    tLObject = tLObject2;
                    r52 = ezVar5;
                    r62 = z15;
                } else {
                    message3 = message6;
                    gjVar = gjVar3;
                    ez ezVar16 = ezVar7;
                    r62 = z17;
                    tL_error = tL_error4;
                    tLObject = tLObject6;
                    org.telegram.ui.Components.t4.c0(ezVar16.currentAccount, tL_error, null, tLObject, new Object[0]);
                    z10 = true;
                    r52 = ezVar16;
                }
                if (z10) {
                    r52.getMessagesStorage().N0(r62, message3);
                    message3.send_state = 2;
                    if (tL_error != null && (str = tL_error.text) != null && str.startsWith("ALLOW_PAYMENT_REQUIRED_")) {
                        di.u8.y(r52.currentAccount, false);
                        message3.errorAllowedPriceStars = di.u8.o(tLObject);
                        message3.errorNewPriceStars = Long.parseLong(tL_error.text.substring(23));
                        di.u8.y(r52.currentAccount, false).d0(Arrays.asList(gjVar));
                        r52.getMessagesStorage().X1(gj.B0(message3), message3);
                    }
                    r52.getNotificationCenter().k(23, Integer.valueOf(message3.id));
                    r52.d0(message3.id);
                    r52.i0(message3.id, r62);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ xx(ez ezVar, boolean z10, TLRPC.TL_error tL_error, TLRPC.Message message, TLObject tLObject, gj gjVar, HashMap hashMap, String str, TLObject tLObject2) {
        this.b = ezVar;
        this.c = z10;
        this.d = tL_error;
        this.e = message;
        this.f = tLObject;
        this.h = gjVar;
        this.n = hashMap;
        this.r = str;
        this.s = tLObject2;
    }
}
