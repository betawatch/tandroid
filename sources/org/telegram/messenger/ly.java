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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class ly implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ qz b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ TLRPC.TL_error d;
    public final /* synthetic */ TLRPC.Message e;
    public final /* synthetic */ TLObject f;
    public final /* synthetic */ jj h;
    public final /* synthetic */ HashMap n;
    public final /* synthetic */ String r;
    public final /* synthetic */ TLObject s;

    public /* synthetic */ ly(qz qzVar, TLRPC.TL_error tL_error, TLRPC.Message message, TLObject tLObject, jj jjVar, String str, HashMap hashMap, boolean z10, TLObject tLObject2) {
        this.b = qzVar;
        this.d = tL_error;
        this.e = message;
        this.f = tLObject;
        this.h = jjVar;
        this.r = str;
        this.n = hashMap;
        this.c = z10;
        this.s = tLObject2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:221:0x06df  */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r10v19 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v79 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        TLRPC.Message message;
        TLRPC.Message message2;
        final TLRPC.Message message3;
        jj jjVar;
        ?? r62;
        TLRPC.TL_error tL_error;
        TLObject tLObject;
        boolean z10;
        qz qzVar;
        String str;
        int i10;
        TLObject tLObject2;
        Long l4;
        TLRPC.TL_error tL_error2;
        long j10;
        boolean z11;
        boolean z12;
        int i11;
        ?? r10;
        qz qzVar2;
        boolean z13;
        int i12;
        ArrayList<TLRPC.Update> arrayList;
        ArrayList arrayList2;
        String str2;
        boolean z14;
        TLRPC.Updates updates;
        qz qzVar3;
        TLRPC.MessageReplyHeader messageReplyHeader;
        long j11;
        ArrayList<TLRPC.Update> arrayList3;
        a0.h hVar;
        TLRPC.Message message4;
        qz qzVar4;
        ArrayList arrayList4;
        int i13;
        boolean z15;
        qz qzVar5;
        switch (this.a) {
            case 0:
                qz qzVar6 = this.b;
                TLRPC.TL_error tL_error3 = this.d;
                TLRPC.Message message5 = this.e;
                TLObject tLObject3 = this.f;
                jj jjVar2 = this.h;
                String str3 = this.r;
                HashMap hashMap = this.n;
                boolean z16 = this.c;
                TLObject tLObject4 = this.s;
                if (tL_error3 != null) {
                    org.telegram.ui.Components.s4.e0(qzVar6.currentAccount, tL_error3, null, tLObject4, new Object[0]);
                    qzVar6.i0(message5.id, z16);
                    qzVar6.l0(jjVar2);
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
                            ag.i3.f(qzVar6.currentAccount).j(update, jj.K1(message5), jj.J1(message5));
                            message2 = ((TL_update.TL_updateQuickReplyMessage) update).message;
                        }
                        message = message2;
                        if (message != null) {
                            hc.W(message);
                            qzVar6.z0(jjVar2, message, message.id, Collections.singletonList(str3), false, -1, hashMap);
                        }
                        Utilities.d.c(new vy(qzVar6, updates2, message5, z16, 0));
                        break;
                    }
                    message = null;
                    if (message != null) {
                    }
                    Utilities.d.c(new vy(qzVar6, updates2, message5, z16, 0));
                }
            default:
                qz qzVar7 = this.b;
                boolean z17 = this.c;
                TLRPC.TL_error tL_error4 = this.d;
                TLRPC.Message message6 = this.e;
                TLObject tLObject5 = this.f;
                jj jjVar3 = this.h;
                HashMap hashMap2 = this.n;
                String str5 = this.r;
                TLObject tLObject6 = this.s;
                if (tL_error4 == null) {
                    int i15 = message6.id;
                    ArrayList arrayList6 = new ArrayList();
                    boolean z18 = message6.date == 2147483646;
                    if (tLObject5 instanceof TLRPC.TL_updateShortSentMessage) {
                        TLRPC.TL_updateShortSentMessage tL_updateShortSentMessage = (TLRPC.TL_updateShortSentMessage) tLObject5;
                        i10 = i15;
                        tLObject2 = tLObject6;
                        l4 = 0L;
                        tL_error2 = tL_error4;
                        qzVar7.z0(jjVar3, null, tL_updateShortSentMessage.id, Collections.singletonList(null), false, -1, hashMap2);
                        qz qzVar8 = qzVar7;
                        int p12 = jjVar3.p1();
                        int i16 = tL_updateShortSentMessage.id;
                        message6.id = i16;
                        message6.local_id = i16;
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
                            hc.W(message6);
                        }
                        TLRPC.MessageMedia messageMedia2 = tL_updateShortSentMessage.media;
                        if (((messageMedia2 instanceof TLRPC.TL_messageMediaGame) || (messageMedia2 instanceof TLRPC.TL_messageMediaInvoice)) && !TextUtils.isEmpty(tL_updateShortSentMessage.message)) {
                            message6.message = tL_updateShortSentMessage.message;
                        }
                        if (!message6.entities.isEmpty()) {
                            message6.flags |= 128;
                        }
                        Integer num = (Integer) qzVar8.getMessagesController().P.get(Long.valueOf(message6.dialog_id));
                        if (num == null) {
                            num = Integer.valueOf(qzVar8.getMessagesStorage().U(message6.dialog_id, message6.out));
                            qzVar8.getMessagesController().P.put(Long.valueOf(message6.dialog_id), num);
                        }
                        message6.unread = num.intValue() < message6.id;
                        Utilities.d.c(new hr(17, qzVar8, tL_updateShortSentMessage));
                        arrayList6.add(message6);
                        i11 = p12;
                        j10 = 0;
                        z12 = false;
                        z11 = false;
                        jjVar = jjVar3;
                        qzVar4 = qzVar8;
                    } else {
                        i10 = i15;
                        HashMap hashMap3 = hashMap2;
                        tLObject2 = tLObject6;
                        l4 = 0L;
                        qz qzVar9 = qzVar7;
                        tL_error2 = tL_error4;
                        if (tLObject5 instanceof TLRPC.Updates) {
                            TLRPC.Updates updates3 = (TLRPC.Updates) tLObject5;
                            ArrayList<TLRPC.Update> arrayList7 = updates3.updates;
                            ArrayList arrayList8 = new ArrayList();
                            j10 = 0;
                            TLRPC.Message message7 = null;
                            a0.h hVar2 = null;
                            int i17 = 0;
                            boolean z19 = z17;
                            qz qzVar10 = qzVar9;
                            while (i17 < arrayList7.size()) {
                                TLRPC.Update update2 = arrayList7.get(i17);
                                HashMap hashMap4 = hashMap3;
                                if (update2 instanceof TL_update.TL_updateNewMessage) {
                                    TL_update.TL_updateNewMessage tL_updateNewMessage = (TL_update.TL_updateNewMessage) update2;
                                    TLRPC.Message message8 = tL_updateNewMessage.message;
                                    TLRPC.Updates updates4 = updates3;
                                    if (message8.action != null) {
                                        qzVar3 = qzVar10;
                                        arrayList = arrayList7;
                                        arrayList2 = arrayList8;
                                        str2 = str5;
                                        z14 = z19;
                                        updates = updates4;
                                        z19 = z14;
                                        i17++;
                                        arrayList7 = arrayList;
                                        arrayList8 = arrayList2;
                                        str5 = str2;
                                        qzVar10 = qzVar3;
                                        updates3 = updates;
                                        hashMap3 = hashMap4;
                                    } else {
                                        arrayList6.add(message8);
                                        Utilities.d.c(new ry(qzVar10, tL_updateNewMessage, 2));
                                        arrayList7.remove(i17);
                                        i17--;
                                        qzVar3 = qzVar10;
                                        arrayList = arrayList7;
                                        arrayList2 = arrayList8;
                                        updates = updates4;
                                        message7 = message8;
                                        str2 = str5;
                                        i17++;
                                        arrayList7 = arrayList;
                                        arrayList8 = arrayList2;
                                        str5 = str2;
                                        qzVar10 = qzVar3;
                                        updates3 = updates;
                                        hashMap3 = hashMap4;
                                    }
                                } else {
                                    TLRPC.Updates updates5 = updates3;
                                    if (update2 instanceof TL_update.TL_updateNewEphemeralMessage) {
                                        TL_update.TL_updateNewEphemeralMessage tL_updateNewEphemeralMessage = (TL_update.TL_updateNewEphemeralMessage) update2;
                                        TLRPC.TL_message b10 = rf.s.b(tL_updateNewEphemeralMessage.message);
                                        arrayList6.add(b10);
                                        arrayList8.add(tL_updateNewEphemeralMessage.message);
                                        arrayList7.remove(i17);
                                        i17--;
                                        message7 = b10;
                                        qzVar3 = qzVar10;
                                        arrayList = arrayList7;
                                        arrayList2 = arrayList8;
                                        str2 = str5;
                                        updates = updates5;
                                    } else if (update2 instanceof TL_update.TL_updateNewChannelMessage) {
                                        TL_update.TL_updateNewChannelMessage tL_updateNewChannelMessage = (TL_update.TL_updateNewChannelMessage) update2;
                                        ArrayList arrayList9 = arrayList8;
                                        long U1 = vp.U1(tL_updateNewChannelMessage);
                                        TLRPC.Chat L0 = qzVar10.getMessagesController().L0(Long.valueOf(U1));
                                        if (!(L0 == null || L0.megagroup) || (messageReplyHeader = tL_updateNewChannelMessage.message.reply_to) == null || (messageReplyHeader.reply_to_top_id == 0 && messageReplyHeader.reply_to_msg_id == 0)) {
                                            j11 = U1;
                                        } else {
                                            if (hVar2 == null) {
                                                hVar2 = new a0.h();
                                            }
                                            j11 = U1;
                                            long B0 = jj.B0(tL_updateNewChannelMessage.message);
                                            SparseArray sparseArray = (SparseArray) hVar2.f(B0);
                                            if (sparseArray == null) {
                                                sparseArray = new SparseArray();
                                                hVar2.k(sparseArray, B0);
                                            }
                                            TLRPC.MessageReplyHeader messageReplyHeader2 = tL_updateNewChannelMessage.message.reply_to;
                                            int i18 = messageReplyHeader2.reply_to_top_id;
                                            if (i18 == 0) {
                                                i18 = messageReplyHeader2.reply_to_msg_id;
                                            }
                                            TLRPC.MessageReplies messageReplies = (TLRPC.MessageReplies) sparseArray.get(i18);
                                            if (messageReplies == null) {
                                                messageReplies = new TLRPC.TL_messageReplies();
                                                sparseArray.put(i18, messageReplies);
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
                                        Utilities.d.c(new tw(qzVar10, tL_updateNewChannelMessage, 0));
                                        arrayList7.remove(i17);
                                        i17--;
                                        if (tL_updateNewChannelMessage.message.pinned) {
                                            arrayList3 = arrayList7;
                                            arrayList2 = arrayList9;
                                            updates = updates5;
                                            message4 = message9;
                                            long j12 = j11;
                                            str2 = str5;
                                            hVar = hVar3;
                                            Utilities.d.c(new uw(qzVar10, tL_updateNewChannelMessage, j12, 0));
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
                                        qzVar3 = qzVar10;
                                    } else {
                                        arrayList = arrayList7;
                                        arrayList2 = arrayList8;
                                        str2 = str5;
                                        z14 = z19;
                                        updates = updates5;
                                        if (update2 instanceof TL_update.TL_updateNewScheduledMessage) {
                                            TL_update.TL_updateNewScheduledMessage tL_updateNewScheduledMessage = (TL_update.TL_updateNewScheduledMessage) update2;
                                            int i19 = 0;
                                            while (true) {
                                                if (i19 < arrayList6.size()) {
                                                    if (((TLRPC.Message) arrayList6.get(i19)).id == tL_updateNewScheduledMessage.message.id) {
                                                        arrayList6.remove(i19);
                                                    } else {
                                                        i19++;
                                                    }
                                                }
                                            }
                                            TLRPC.Message message10 = tL_updateNewScheduledMessage.message;
                                            arrayList6.add(message10);
                                            arrayList.remove(i17);
                                            i17--;
                                            qzVar3 = qzVar10;
                                            message7 = message10;
                                            z19 = true;
                                        } else if (update2 instanceof TL_update.TL_updateQuickReplyMessage) {
                                            ag.i3.f(qzVar10.currentAccount).j(update2, jj.K1(jjVar3.k), jj.J1(jjVar3.k));
                                            TLRPC.Message message11 = ((TL_update.TL_updateQuickReplyMessage) update2).message;
                                            arrayList6.add(message11);
                                            arrayList.remove(i17);
                                            i17--;
                                            qzVar3 = qzVar10;
                                            z19 = z14;
                                            message7 = message11;
                                        } else {
                                            if (update2 instanceof TL_update.TL_updateDeleteScheduledMessages) {
                                                TL_update.TL_updateDeleteScheduledMessages tL_updateDeleteScheduledMessages = (TL_update.TL_updateDeleteScheduledMessages) update2;
                                                if (jj.B0(jjVar3.k) == o5.o(tL_updateDeleteScheduledMessages.peer)) {
                                                    ArrayList<Integer> arrayList10 = tL_updateDeleteScheduledMessages.messages;
                                                    int size = arrayList10.size();
                                                    int i20 = 0;
                                                    qz qzVar11 = qzVar10;
                                                    while (i20 < size) {
                                                        Integer num2 = arrayList10.get(i20);
                                                        i20++;
                                                        int intValue = num2.intValue();
                                                        qz qzVar12 = qzVar11;
                                                        int i21 = 0;
                                                        while (true) {
                                                            if (i21 >= arrayList6.size()) {
                                                                break;
                                                            } else if (((TLRPC.Message) arrayList6.get(i21)).id == intValue) {
                                                                arrayList6.remove(i21);
                                                            } else {
                                                                i21++;
                                                            }
                                                        }
                                                        qzVar11 = qzVar12;
                                                    }
                                                    qzVar3 = qzVar11;
                                                    arrayList.remove(i17);
                                                    i17--;
                                                    z19 = false;
                                                }
                                            }
                                            qzVar3 = qzVar10;
                                            z19 = z14;
                                        }
                                    }
                                    i17++;
                                    arrayList7 = arrayList;
                                    arrayList8 = arrayList2;
                                    str5 = str2;
                                    qzVar10 = qzVar3;
                                    updates3 = updates;
                                    hashMap3 = hashMap4;
                                }
                            }
                            HashMap hashMap5 = hashMap3;
                            TLRPC.Updates updates6 = updates3;
                            qz qzVar13 = qzVar10;
                            ArrayList<TLRPC.Update> arrayList11 = arrayList7;
                            ArrayList arrayList12 = arrayList8;
                            String str6 = str5;
                            boolean z20 = z19;
                            if (arrayList12.isEmpty()) {
                                r10 = 1;
                            } else {
                                r10 = 1;
                                qzVar13.getMessagesStorage().f1(arrayList12, true);
                            }
                            if (hVar2 != null) {
                                qzVar13.getMessagesStorage().a1(null, null, hVar2, r10);
                                zs notificationCenter = qzVar13.getNotificationCenter();
                                Object[] objArr = new Object[4];
                                objArr[0] = null;
                                objArr[r10] = null;
                                objArr[2] = hVar2;
                                objArr[3] = Boolean.TRUE;
                                notificationCenter.k(77, objArr);
                            }
                            if (message7 != null) {
                                jj.B0(message7);
                                boolean z21 = (!z18 || message7.date == 2147483646) ? z20 : false;
                                hc.W(message7);
                                if (!z21) {
                                    Integer num3 = (Integer) qzVar13.getMessagesController().P.get(Long.valueOf(message7.dialog_id));
                                    if (num3 == null) {
                                        num3 = Integer.valueOf(qzVar13.getMessagesStorage().U(message7.dialog_id, message7.out));
                                        qzVar13.getMessagesController().P.put(Long.valueOf(message7.dialog_id), num3);
                                    }
                                    message7.unread = num3.intValue() < message7.id;
                                }
                                TLRPC.Message message12 = jjVar3.k;
                                message12.post_author = message7.post_author;
                                if ((message7.flags & 33554432) != 0) {
                                    message12.ttl_period = message7.ttl_period;
                                    message12.flags |= 33554432;
                                }
                                message12.entities = message7.entities;
                                int i22 = message7.quick_reply_shortcut_id;
                                message12.quick_reply_shortcut_id = i22;
                                if (i22 != 0) {
                                    message12.flags |= TLObject.FLAG_30;
                                }
                                TLRPC.Message message13 = message7;
                                qzVar13.z0(jjVar3, message13, message7.id, Collections.singletonList(str6), false, -1, hashMap5);
                                jjVar = jjVar3;
                                qzVar2 = qzVar13;
                                int p13 = jjVar.p1();
                                message6.id = message13.id;
                                i12 = p13;
                                z20 = z21;
                                z13 = false;
                            } else {
                                jjVar = jjVar3;
                                qzVar2 = qzVar13;
                                if (v2.a) {
                                    StringBuilder sb2 = new StringBuilder();
                                    for (int i23 = 0; i23 < arrayList11.size(); i23++) {
                                        sb2.append(arrayList11.get(i23).getClass().getSimpleName());
                                        sb2.append(", ");
                                    }
                                    f8.b("can't find message in updates " + ((Object) sb2));
                                }
                                z13 = true;
                                i12 = 0;
                            }
                            Utilities.d.c(new vw(qzVar2, updates6, 0));
                            z12 = z13;
                            z11 = z20;
                            i11 = i12;
                            qzVar4 = qzVar2;
                        } else {
                            j10 = 0;
                            jjVar = jjVar3;
                            z11 = z17;
                            z12 = false;
                            i11 = 0;
                            qzVar4 = qzVar9;
                        }
                    }
                    if ((jj.o1(message6) instanceof TLRPC.TL_messageMediaGeoLive) && message6.via_bot_id == j10 && TextUtils.isEmpty(message6.via_bot_name)) {
                        nd locationController = qzVar4.getLocationController();
                        ArrayList arrayList13 = locationController.b;
                        a0.h hVar4 = locationController.a;
                        md mdVar = new md();
                        z10 = z12;
                        mdVar.a = message6.dialog_id;
                        mdVar.b = message6.id;
                        TLRPC.MessageMedia messageMedia3 = message6.media;
                        mdVar.d = messageMedia3.period;
                        int i24 = messageMedia3.proximity_notification_radius;
                        mdVar.f = i24;
                        mdVar.g = i24;
                        int i25 = locationController.currentAccount;
                        mdVar.e = i25;
                        mdVar.h = new jj(i25, message6, false, false);
                        if (mdVar.d == Integer.MAX_VALUE) {
                            mdVar.c = ConnectionsManager.DEFAULT_DATACENTER_ID;
                        } else {
                            mdVar.c = locationController.getConnectionsManager().getCurrentTime() + mdVar.d;
                        }
                        md mdVar2 = (md) hVar4.f(mdVar.a);
                        i13 = i11;
                        arrayList4 = arrayList6;
                        hVar4.k(mdVar, mdVar.a);
                        if (mdVar2 != null) {
                            arrayList13.remove(mdVar2);
                        }
                        arrayList13.add(mdVar);
                        locationController.l(mdVar, 0);
                        locationController.w = SystemClock.elapsedRealtime() - 25000;
                        i0.g3(new mg(locationController, mdVar2, mdVar, 28));
                    } else {
                        z10 = z12;
                        arrayList4 = arrayList6;
                        i13 = i11;
                    }
                    if (z10) {
                        z15 = z17;
                        message3 = message6;
                        qzVar5 = qzVar4;
                    } else {
                        qzVar4.getStatsController().k(w0.f(), 1, 1);
                        message6.send_state = 0;
                        long j13 = j10;
                        message6.errorNewPriceStars = j13;
                        message6.errorAllowedPriceStars = j13;
                        if (z17 != z11) {
                            ArrayList arrayList14 = new ArrayList();
                            arrayList14.add(Integer.valueOf(i10));
                            ArrayList arrayList15 = new ArrayList();
                            arrayList15.add(new jj(jjVar.I1, jjVar.k, true, true));
                            z15 = z17;
                            message3 = message6;
                            qzVar4.getMessagesStorage().a.c(new ww(qzVar4, arrayList4, z17, z11, message6, arrayList14, arrayList15, i10));
                            qzVar5 = qzVar4;
                        } else {
                            final boolean z22 = z17;
                            message3 = message6;
                            final int i26 = i10;
                            qzVar4.getNotificationCenter().k(21, Integer.valueOf(i26), Integer.valueOf(message3.id), message3, Long.valueOf(message3.dialog_id), l4, Integer.valueOf(i13), Boolean.valueOf(z22));
                            qz qzVar14 = qzVar4;
                            qzVar4.getNotificationCenter().k(22, Integer.valueOf(i26), Integer.valueOf(message3.id), message3, Long.valueOf(message3.dialog_id), l4, Integer.valueOf(i13), Boolean.valueOf(z22));
                            final int i27 = i13;
                            final ArrayList arrayList16 = arrayList4;
                            final qz qzVar15 = qzVar14;
                            qzVar14.getMessagesStorage().a.c(new Runnable() { // from class: org.telegram.messenger.xw
                                /* JADX WARN: Removed duplicated region for block: B:7:0x0053  */
                                @Override // java.lang.Runnable
                                /*
                                    Code decompiled incorrectly, please refer to instructions dump.
                                */
                                public final void run() {
                                    int i28;
                                    int i29;
                                    TLRPC.Message message14 = message3;
                                    boolean d52 = jj.d5(message14);
                                    boolean z23 = z22;
                                    if (d52) {
                                        i28 = 9;
                                    } else {
                                        if (message14.quick_reply_shortcut_id == 0 && message14.quick_reply_shortcut == null) {
                                            i29 = z23 ? 1 : 0;
                                            qz qzVar16 = qz.this;
                                            hs messagesStorage = qzVar16.getMessagesStorage();
                                            long j14 = message14.random_id;
                                            long C1 = jj.C1(message14.peer_id);
                                            int i30 = i26;
                                            messagesStorage.a2(j14, C1, Integer.valueOf(i30), message14.id, 0, z23 ? 1 : 0, message14.quick_reply_shortcut_id);
                                            qzVar16.getMessagesStorage().j1(arrayList16, true, false, false, 0, false, i29, message14.quick_reply_shortcut_id);
                                            int i31 = i29;
                                            if (jj.e3(message14)) {
                                                long C12 = jj.C1(message14.peer_id);
                                                ArrayList arrayList17 = new ArrayList(1);
                                                arrayList17.add(Integer.valueOf(message14.id));
                                                qzVar16.getMessagesStorage().P0(C12, arrayList17, false, false, i31, (int) jj.a2(qzVar16.currentAccount, message14, 0));
                                                qzVar16.getMessagesStorage().R1(C12, -C12, arrayList17, null);
                                                i0.g3(new cx(qzVar16, C12, arrayList17, 0));
                                            }
                                            i0.g3(new dx(qzVar16, message14, i30, i27, z23));
                                        }
                                        i28 = 5;
                                    }
                                    i29 = i28;
                                    qz qzVar162 = qz.this;
                                    hs messagesStorage2 = qzVar162.getMessagesStorage();
                                    long j142 = message14.random_id;
                                    long C13 = jj.C1(message14.peer_id);
                                    int i302 = i26;
                                    messagesStorage2.a2(j142, C13, Integer.valueOf(i302), message14.id, 0, z23 ? 1 : 0, message14.quick_reply_shortcut_id);
                                    qzVar162.getMessagesStorage().j1(arrayList16, true, false, false, 0, false, i29, message14.quick_reply_shortcut_id);
                                    int i312 = i29;
                                    if (jj.e3(message14)) {
                                    }
                                    i0.g3(new dx(qzVar162, message14, i302, i27, z23));
                                }
                            });
                            qzVar5 = qzVar15;
                            z15 = z22;
                        }
                    }
                    tL_error = tL_error2;
                    tLObject = tLObject2;
                    qzVar = qzVar5;
                    r62 = z15;
                } else {
                    message3 = message6;
                    jjVar = jjVar3;
                    qz qzVar16 = qzVar7;
                    r62 = z17;
                    tL_error = tL_error4;
                    tLObject = tLObject6;
                    org.telegram.ui.Components.s4.e0(qzVar16.currentAccount, tL_error, null, tLObject, new Object[0]);
                    z10 = true;
                    qzVar = qzVar16;
                }
                if (z10) {
                    qzVar.getMessagesStorage().N0(r62, message3);
                    message3.send_state = 2;
                    if (tL_error != null && (str = tL_error.text) != null && str.startsWith("ALLOW_PAYMENT_REQUIRED_")) {
                        rh.e6.y(qzVar.currentAccount, false);
                        message3.errorAllowedPriceStars = rh.e6.o(tLObject);
                        message3.errorNewPriceStars = Long.parseLong(tL_error.text.substring(23));
                        rh.e6.y(qzVar.currentAccount, false).d0(Arrays.asList(jjVar));
                        qzVar.getMessagesStorage().X1(jj.B0(message3), message3);
                    }
                    qzVar.getNotificationCenter().k(23, Integer.valueOf(message3.id));
                    qzVar.d0(message3.id);
                    qzVar.i0(message3.id, r62);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ ly(qz qzVar, boolean z10, TLRPC.TL_error tL_error, TLRPC.Message message, TLObject tLObject, jj jjVar, HashMap hashMap, String str, TLObject tLObject2) {
        this.b = qzVar;
        this.c = z10;
        this.d = tL_error;
        this.e = message;
        this.f = tLObject;
        this.h = jjVar;
        this.n = hashMap;
        this.r = str;
        this.s = tLObject2;
    }
}
