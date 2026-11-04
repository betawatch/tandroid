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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class sx implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ yy b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ TLRPC.TL_error d;
    public final /* synthetic */ TLRPC.Message e;
    public final /* synthetic */ TLObject f;
    public final /* synthetic */ zi h;
    public final /* synthetic */ HashMap n;
    public final /* synthetic */ String r;
    public final /* synthetic */ TLObject s;

    public /* synthetic */ sx(yy yyVar, TLRPC.TL_error tL_error, TLRPC.Message message, TLObject tLObject, zi ziVar, String str, HashMap hashMap, boolean z10, TLObject tLObject2) {
        this.b = yyVar;
        this.d = tL_error;
        this.e = message;
        this.f = tLObject;
        this.h = ziVar;
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
        zi ziVar;
        ?? r62;
        TLRPC.TL_error tL_error;
        TLObject tLObject;
        boolean z10;
        yy yyVar;
        String str;
        int i3;
        TLObject tLObject2;
        Long l10;
        TLRPC.TL_error tL_error2;
        long j10;
        boolean z11;
        boolean z12;
        int i10;
        ?? r10;
        yy yyVar2;
        boolean z13;
        int i11;
        ArrayList<TLRPC.Update> arrayList;
        ArrayList arrayList2;
        String str2;
        boolean z14;
        TLRPC.Updates updates;
        yy yyVar3;
        TLRPC.MessageReplyHeader messageReplyHeader;
        long j11;
        ArrayList<TLRPC.Update> arrayList3;
        a0.h hVar;
        TLRPC.Message message4;
        yy yyVar4;
        ArrayList arrayList4;
        int i12;
        boolean z15;
        yy yyVar5;
        switch (this.a) {
            case 0:
                yy yyVar6 = this.b;
                TLRPC.TL_error tL_error3 = this.d;
                TLRPC.Message message5 = this.e;
                TLObject tLObject3 = this.f;
                zi ziVar2 = this.h;
                String str3 = this.r;
                HashMap hashMap = this.n;
                boolean z16 = this.c;
                TLObject tLObject4 = this.s;
                if (tL_error3 != null) {
                    org.telegram.ui.Components.t4.e0(yyVar6.currentAccount, tL_error3, null, tLObject4, new Object[0]);
                    yyVar6.i0(message5.id, z16);
                    yyVar6.l0(ziVar2);
                    break;
                } else {
                    String str4 = message5.attachPath;
                    TLRPC.Updates updates2 = (TLRPC.Updates) tLObject3;
                    ArrayList<TLRPC.Update> arrayList5 = updates2.updates;
                    for (int i13 = 0; i13 < arrayList5.size(); i13++) {
                        TLRPC.Update update = arrayList5.get(i13);
                        if (update instanceof TL_update.TL_updateEditMessage) {
                            message2 = ((TL_update.TL_updateEditMessage) update).message;
                        } else if (update instanceof TL_update.TL_updateEditChannelMessage) {
                            message2 = ((TL_update.TL_updateEditChannelMessage) update).message;
                        } else if (update instanceof TL_update.TL_updateNewScheduledMessage) {
                            message2 = ((TL_update.TL_updateNewScheduledMessage) update).message;
                        } else if (update instanceof TL_update.TL_updateQuickReplyMessage) {
                            lg.u1.f(yyVar6.currentAccount).j(update, zi.K1(message5), zi.J1(message5));
                            message2 = ((TL_update.TL_updateQuickReplyMessage) update).message;
                        }
                        message = message2;
                        if (message != null) {
                            zb.W(message);
                            yyVar6.z0(ziVar2, message, message.id, Collections.singletonList(str3), false, -1, hashMap);
                        }
                        Utilities.d.c(new dy(yyVar6, updates2, message5, z16, 0));
                        break;
                    }
                    message = null;
                    if (message != null) {
                    }
                    Utilities.d.c(new dy(yyVar6, updates2, message5, z16, 0));
                }
            default:
                yy yyVar7 = this.b;
                boolean z17 = this.c;
                TLRPC.TL_error tL_error4 = this.d;
                TLRPC.Message message6 = this.e;
                TLObject tLObject5 = this.f;
                zi ziVar3 = this.h;
                HashMap hashMap2 = this.n;
                String str5 = this.r;
                TLObject tLObject6 = this.s;
                if (tL_error4 == null) {
                    int i14 = message6.id;
                    ArrayList arrayList6 = new ArrayList();
                    boolean z18 = message6.date == 2147483646;
                    if (tLObject5 instanceof TLRPC.TL_updateShortSentMessage) {
                        TLRPC.TL_updateShortSentMessage tL_updateShortSentMessage = (TLRPC.TL_updateShortSentMessage) tLObject5;
                        i3 = i14;
                        tLObject2 = tLObject6;
                        l10 = 0L;
                        tL_error2 = tL_error4;
                        yyVar7.z0(ziVar3, null, tL_updateShortSentMessage.id, Collections.singletonList(null), false, -1, hashMap2);
                        yy yyVar8 = yyVar7;
                        int p12 = ziVar3.p1();
                        int i15 = tL_updateShortSentMessage.id;
                        message6.id = i15;
                        message6.local_id = i15;
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
                            zb.W(message6);
                        }
                        TLRPC.MessageMedia messageMedia2 = tL_updateShortSentMessage.media;
                        if (((messageMedia2 instanceof TLRPC.TL_messageMediaGame) || (messageMedia2 instanceof TLRPC.TL_messageMediaInvoice)) && !TextUtils.isEmpty(tL_updateShortSentMessage.message)) {
                            message6.message = tL_updateShortSentMessage.message;
                        }
                        if (!message6.entities.isEmpty()) {
                            message6.flags |= 128;
                        }
                        Integer num = (Integer) yyVar8.getMessagesController().Q.get(Long.valueOf(message6.dialog_id));
                        if (num == null) {
                            num = Integer.valueOf(yyVar8.getMessagesStorage().U(message6.dialog_id, message6.out));
                            yyVar8.getMessagesController().Q.put(Long.valueOf(message6.dialog_id), num);
                        }
                        message6.unread = num.intValue() < message6.id;
                        Utilities.d.c(new pq(19, yyVar8, tL_updateShortSentMessage));
                        arrayList6.add(message6);
                        i10 = p12;
                        j10 = 0;
                        z12 = false;
                        z11 = false;
                        ziVar = ziVar3;
                        yyVar4 = yyVar8;
                    } else {
                        i3 = i14;
                        HashMap hashMap3 = hashMap2;
                        tLObject2 = tLObject6;
                        l10 = 0L;
                        yy yyVar9 = yyVar7;
                        tL_error2 = tL_error4;
                        if (tLObject5 instanceof TLRPC.Updates) {
                            TLRPC.Updates updates3 = (TLRPC.Updates) tLObject5;
                            ArrayList<TLRPC.Update> arrayList7 = updates3.updates;
                            ArrayList arrayList8 = new ArrayList();
                            j10 = 0;
                            TLRPC.Message message7 = null;
                            a0.h hVar2 = null;
                            int i16 = 0;
                            boolean z19 = z17;
                            yy yyVar10 = yyVar9;
                            while (i16 < arrayList7.size()) {
                                TLRPC.Update update2 = arrayList7.get(i16);
                                HashMap hashMap4 = hashMap3;
                                if (update2 instanceof TL_update.TL_updateNewMessage) {
                                    TL_update.TL_updateNewMessage tL_updateNewMessage = (TL_update.TL_updateNewMessage) update2;
                                    TLRPC.Message message8 = tL_updateNewMessage.message;
                                    TLRPC.Updates updates4 = updates3;
                                    if (message8.action != null) {
                                        yyVar3 = yyVar10;
                                        arrayList = arrayList7;
                                        arrayList2 = arrayList8;
                                        str2 = str5;
                                        z14 = z19;
                                        updates = updates4;
                                        z19 = z14;
                                        i16++;
                                        arrayList7 = arrayList;
                                        arrayList8 = arrayList2;
                                        str5 = str2;
                                        yyVar10 = yyVar3;
                                        updates3 = updates;
                                        hashMap3 = hashMap4;
                                    } else {
                                        arrayList6.add(message8);
                                        Utilities.d.c(new yx(yyVar10, tL_updateNewMessage, 2));
                                        arrayList7.remove(i16);
                                        i16--;
                                        yyVar3 = yyVar10;
                                        arrayList = arrayList7;
                                        arrayList2 = arrayList8;
                                        updates = updates4;
                                        message7 = message8;
                                        str2 = str5;
                                        i16++;
                                        arrayList7 = arrayList;
                                        arrayList8 = arrayList2;
                                        str5 = str2;
                                        yyVar10 = yyVar3;
                                        updates3 = updates;
                                        hashMap3 = hashMap4;
                                    }
                                } else {
                                    TLRPC.Updates updates5 = updates3;
                                    if (update2 instanceof TL_update.TL_updateNewEphemeralMessage) {
                                        TL_update.TL_updateNewEphemeralMessage tL_updateNewEphemeralMessage = (TL_update.TL_updateNewEphemeralMessage) update2;
                                        TLRPC.TL_message b10 = cg.v.b(tL_updateNewEphemeralMessage.message);
                                        arrayList6.add(b10);
                                        arrayList8.add(tL_updateNewEphemeralMessage.message);
                                        arrayList7.remove(i16);
                                        i16--;
                                        message7 = b10;
                                        yyVar3 = yyVar10;
                                        arrayList = arrayList7;
                                        arrayList2 = arrayList8;
                                        str2 = str5;
                                        updates = updates5;
                                    } else if (update2 instanceof TL_update.TL_updateNewChannelMessage) {
                                        TL_update.TL_updateNewChannelMessage tL_updateNewChannelMessage = (TL_update.TL_updateNewChannelMessage) update2;
                                        ArrayList arrayList9 = arrayList8;
                                        long V1 = hp.V1(tL_updateNewChannelMessage);
                                        TLRPC.Chat M0 = yyVar10.getMessagesController().M0(Long.valueOf(V1));
                                        if (!(M0 == null || M0.megagroup) || (messageReplyHeader = tL_updateNewChannelMessage.message.reply_to) == null || (messageReplyHeader.reply_to_top_id == 0 && messageReplyHeader.reply_to_msg_id == 0)) {
                                            j11 = V1;
                                        } else {
                                            if (hVar2 == null) {
                                                hVar2 = new a0.h();
                                            }
                                            j11 = V1;
                                            long B0 = zi.B0(tL_updateNewChannelMessage.message);
                                            SparseArray sparseArray = (SparseArray) hVar2.f(B0);
                                            if (sparseArray == null) {
                                                sparseArray = new SparseArray();
                                                hVar2.k(sparseArray, B0);
                                            }
                                            TLRPC.MessageReplyHeader messageReplyHeader2 = tL_updateNewChannelMessage.message.reply_to;
                                            int i17 = messageReplyHeader2.reply_to_top_id;
                                            if (i17 == 0) {
                                                i17 = messageReplyHeader2.reply_to_msg_id;
                                            }
                                            TLRPC.MessageReplies messageReplies = (TLRPC.MessageReplies) sparseArray.get(i17);
                                            if (messageReplies == null) {
                                                messageReplies = new TLRPC.TL_messageReplies();
                                                sparseArray.put(i17, messageReplies);
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
                                        Utilities.d.c(new aw(yyVar10, tL_updateNewChannelMessage, 0));
                                        arrayList7.remove(i16);
                                        i16--;
                                        if (tL_updateNewChannelMessage.message.pinned) {
                                            arrayList3 = arrayList7;
                                            arrayList2 = arrayList9;
                                            updates = updates5;
                                            message4 = message9;
                                            long j12 = j11;
                                            str2 = str5;
                                            hVar = hVar3;
                                            Utilities.d.c(new bw(yyVar10, tL_updateNewChannelMessage, j12, 0));
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
                                        yyVar3 = yyVar10;
                                    } else {
                                        arrayList = arrayList7;
                                        arrayList2 = arrayList8;
                                        str2 = str5;
                                        z14 = z19;
                                        updates = updates5;
                                        if (update2 instanceof TL_update.TL_updateNewScheduledMessage) {
                                            TL_update.TL_updateNewScheduledMessage tL_updateNewScheduledMessage = (TL_update.TL_updateNewScheduledMessage) update2;
                                            int i18 = 0;
                                            while (true) {
                                                if (i18 < arrayList6.size()) {
                                                    if (((TLRPC.Message) arrayList6.get(i18)).id == tL_updateNewScheduledMessage.message.id) {
                                                        arrayList6.remove(i18);
                                                    } else {
                                                        i18++;
                                                    }
                                                }
                                            }
                                            TLRPC.Message message10 = tL_updateNewScheduledMessage.message;
                                            arrayList6.add(message10);
                                            arrayList.remove(i16);
                                            i16--;
                                            yyVar3 = yyVar10;
                                            message7 = message10;
                                            z19 = true;
                                        } else if (update2 instanceof TL_update.TL_updateQuickReplyMessage) {
                                            lg.u1.f(yyVar10.currentAccount).j(update2, zi.K1(ziVar3.k), zi.J1(ziVar3.k));
                                            TLRPC.Message message11 = ((TL_update.TL_updateQuickReplyMessage) update2).message;
                                            arrayList6.add(message11);
                                            arrayList.remove(i16);
                                            i16--;
                                            yyVar3 = yyVar10;
                                            z19 = z14;
                                            message7 = message11;
                                        } else {
                                            if (update2 instanceof TL_update.TL_updateDeleteScheduledMessages) {
                                                TL_update.TL_updateDeleteScheduledMessages tL_updateDeleteScheduledMessages = (TL_update.TL_updateDeleteScheduledMessages) update2;
                                                if (zi.B0(ziVar3.k) == m5.o(tL_updateDeleteScheduledMessages.peer)) {
                                                    ArrayList<Integer> arrayList10 = tL_updateDeleteScheduledMessages.messages;
                                                    int size = arrayList10.size();
                                                    int i19 = 0;
                                                    yy yyVar11 = yyVar10;
                                                    while (i19 < size) {
                                                        Integer num2 = arrayList10.get(i19);
                                                        i19++;
                                                        int intValue = num2.intValue();
                                                        yy yyVar12 = yyVar11;
                                                        int i20 = 0;
                                                        while (true) {
                                                            if (i20 >= arrayList6.size()) {
                                                                break;
                                                            } else if (((TLRPC.Message) arrayList6.get(i20)).id == intValue) {
                                                                arrayList6.remove(i20);
                                                            } else {
                                                                i20++;
                                                            }
                                                        }
                                                        yyVar11 = yyVar12;
                                                    }
                                                    yyVar3 = yyVar11;
                                                    arrayList.remove(i16);
                                                    i16--;
                                                    z19 = false;
                                                }
                                            }
                                            yyVar3 = yyVar10;
                                            z19 = z14;
                                        }
                                    }
                                    i16++;
                                    arrayList7 = arrayList;
                                    arrayList8 = arrayList2;
                                    str5 = str2;
                                    yyVar10 = yyVar3;
                                    updates3 = updates;
                                    hashMap3 = hashMap4;
                                }
                            }
                            HashMap hashMap5 = hashMap3;
                            TLRPC.Updates updates6 = updates3;
                            yy yyVar13 = yyVar10;
                            ArrayList<TLRPC.Update> arrayList11 = arrayList7;
                            ArrayList arrayList12 = arrayList8;
                            String str6 = str5;
                            boolean z20 = z19;
                            if (arrayList12.isEmpty()) {
                                r10 = 1;
                            } else {
                                r10 = 1;
                                yyVar13.getMessagesStorage().f1(arrayList12, true);
                            }
                            if (hVar2 != null) {
                                yyVar13.getMessagesStorage().a1(null, null, hVar2, r10);
                                hs notificationCenter = yyVar13.getNotificationCenter();
                                Object[] objArr = new Object[4];
                                objArr[0] = null;
                                objArr[r10] = null;
                                objArr[2] = hVar2;
                                objArr[3] = Boolean.TRUE;
                                notificationCenter.k(77, objArr);
                            }
                            if (message7 != null) {
                                zi.B0(message7);
                                boolean z21 = (!z18 || message7.date == 2147483646) ? z20 : false;
                                zb.W(message7);
                                if (!z21) {
                                    Integer num3 = (Integer) yyVar13.getMessagesController().Q.get(Long.valueOf(message7.dialog_id));
                                    if (num3 == null) {
                                        num3 = Integer.valueOf(yyVar13.getMessagesStorage().U(message7.dialog_id, message7.out));
                                        yyVar13.getMessagesController().Q.put(Long.valueOf(message7.dialog_id), num3);
                                    }
                                    message7.unread = num3.intValue() < message7.id;
                                }
                                TLRPC.Message message12 = ziVar3.k;
                                message12.post_author = message7.post_author;
                                if ((message7.flags & 33554432) != 0) {
                                    message12.ttl_period = message7.ttl_period;
                                    message12.flags |= 33554432;
                                }
                                message12.entities = message7.entities;
                                int i21 = message7.quick_reply_shortcut_id;
                                message12.quick_reply_shortcut_id = i21;
                                if (i21 != 0) {
                                    message12.flags |= TLObject.FLAG_30;
                                }
                                TLRPC.Message message13 = message7;
                                yyVar13.z0(ziVar3, message13, message7.id, Collections.singletonList(str6), false, -1, hashMap5);
                                ziVar = ziVar3;
                                yyVar2 = yyVar13;
                                int p13 = ziVar.p1();
                                message6.id = message13.id;
                                i11 = p13;
                                z20 = z21;
                                z13 = false;
                            } else {
                                ziVar = ziVar3;
                                yyVar2 = yyVar13;
                                if (r2.a) {
                                    StringBuilder sb2 = new StringBuilder();
                                    for (int i22 = 0; i22 < arrayList11.size(); i22++) {
                                        sb2.append(arrayList11.get(i22).getClass().getSimpleName());
                                        sb2.append(", ");
                                    }
                                    a8.b("can't find message in updates " + ((Object) sb2));
                                }
                                z13 = true;
                                i11 = 0;
                            }
                            Utilities.d.c(new cw(yyVar2, updates6, 0));
                            z12 = z13;
                            z11 = z20;
                            i10 = i11;
                            yyVar4 = yyVar2;
                        } else {
                            j10 = 0;
                            ziVar = ziVar3;
                            z11 = z17;
                            z12 = false;
                            i10 = 0;
                            yyVar4 = yyVar9;
                        }
                    }
                    if ((zi.o1(message6) instanceof TLRPC.TL_messageMediaGeoLive) && message6.via_bot_id == j10 && TextUtils.isEmpty(message6.via_bot_name)) {
                        ld locationController = yyVar4.getLocationController();
                        ArrayList arrayList13 = locationController.b;
                        a0.h hVar4 = locationController.a;
                        kd kdVar = new kd();
                        z10 = z12;
                        kdVar.a = message6.dialog_id;
                        kdVar.b = message6.id;
                        TLRPC.MessageMedia messageMedia3 = message6.media;
                        kdVar.d = messageMedia3.period;
                        int i23 = messageMedia3.proximity_notification_radius;
                        kdVar.f = i23;
                        kdVar.g = i23;
                        int i24 = locationController.currentAccount;
                        kdVar.e = i24;
                        kdVar.h = new zi(i24, message6, false, false);
                        if (kdVar.d == Integer.MAX_VALUE) {
                            kdVar.c = ConnectionsManager.DEFAULT_DATACENTER_ID;
                        } else {
                            kdVar.c = locationController.getConnectionsManager().getCurrentTime() + kdVar.d;
                        }
                        kd kdVar2 = (kd) hVar4.f(kdVar.a);
                        i12 = i10;
                        arrayList4 = arrayList6;
                        hVar4.k(kdVar, kdVar.a);
                        if (kdVar2 != null) {
                            arrayList13.remove(kdVar2);
                        }
                        arrayList13.add(kdVar);
                        locationController.l(kdVar, 0);
                        locationController.w = SystemClock.elapsedRealtime() - 25000;
                        g0.h3(new fg(locationController, kdVar2, kdVar, 28));
                    } else {
                        z10 = z12;
                        arrayList4 = arrayList6;
                        i12 = i10;
                    }
                    if (z10) {
                        z15 = z17;
                        message3 = message6;
                        yyVar5 = yyVar4;
                    } else {
                        yyVar4.getStatsController().k(t0.f(), 1, 1);
                        message6.send_state = 0;
                        long j13 = j10;
                        message6.errorNewPriceStars = j13;
                        message6.errorAllowedPriceStars = j13;
                        if (z17 != z11) {
                            ArrayList arrayList14 = new ArrayList();
                            arrayList14.add(Integer.valueOf(i3));
                            ArrayList arrayList15 = new ArrayList();
                            arrayList15.add(new zi(ziVar.I1, ziVar.k, true, true));
                            z15 = z17;
                            message3 = message6;
                            yyVar4.getMessagesStorage().a.c(new dw(yyVar4, arrayList4, z17, z11, message6, arrayList14, arrayList15, i3));
                            yyVar5 = yyVar4;
                        } else {
                            final boolean z22 = z17;
                            message3 = message6;
                            final int i25 = i3;
                            yyVar4.getNotificationCenter().k(21, Integer.valueOf(i25), Integer.valueOf(message3.id), message3, Long.valueOf(message3.dialog_id), l10, Integer.valueOf(i12), Boolean.valueOf(z22));
                            yy yyVar14 = yyVar4;
                            yyVar4.getNotificationCenter().k(22, Integer.valueOf(i25), Integer.valueOf(message3.id), message3, Long.valueOf(message3.dialog_id), l10, Integer.valueOf(i12), Boolean.valueOf(z22));
                            final int i26 = i12;
                            final ArrayList arrayList16 = arrayList4;
                            final yy yyVar15 = yyVar14;
                            yyVar14.getMessagesStorage().a.c(new Runnable() { // from class: org.telegram.messenger.ew
                                /* JADX WARN: Removed duplicated region for block: B:7:0x0053  */
                                @Override // java.lang.Runnable
                                /*
                                    Code decompiled incorrectly, please refer to instructions dump.
                                */
                                public final void run() {
                                    int i27;
                                    int i28;
                                    TLRPC.Message message14 = message3;
                                    boolean e52 = zi.e5(message14);
                                    boolean z23 = z22;
                                    if (e52) {
                                        i27 = 9;
                                    } else {
                                        if (message14.quick_reply_shortcut_id == 0 && message14.quick_reply_shortcut == null) {
                                            i28 = z23 ? 1 : 0;
                                            yy yyVar16 = yy.this;
                                            qr messagesStorage = yyVar16.getMessagesStorage();
                                            long j14 = message14.random_id;
                                            long C1 = zi.C1(message14.peer_id);
                                            int i29 = i25;
                                            messagesStorage.a2(j14, C1, Integer.valueOf(i29), message14.id, 0, z23 ? 1 : 0, message14.quick_reply_shortcut_id);
                                            yyVar16.getMessagesStorage().j1(arrayList16, true, false, false, 0, false, i28, message14.quick_reply_shortcut_id);
                                            int i30 = i28;
                                            if (zi.f3(message14)) {
                                                long C12 = zi.C1(message14.peer_id);
                                                ArrayList arrayList17 = new ArrayList(1);
                                                arrayList17.add(Integer.valueOf(message14.id));
                                                yyVar16.getMessagesStorage().P0(C12, arrayList17, false, false, i30, (int) zi.a2(yyVar16.currentAccount, message14, 0));
                                                yyVar16.getMessagesStorage().R1(C12, -C12, arrayList17, null);
                                                g0.h3(new jw(yyVar16, C12, arrayList17, 0));
                                            }
                                            g0.h3(new kw(yyVar16, message14, i29, i26, z23));
                                        }
                                        i27 = 5;
                                    }
                                    i28 = i27;
                                    yy yyVar162 = yy.this;
                                    qr messagesStorage2 = yyVar162.getMessagesStorage();
                                    long j142 = message14.random_id;
                                    long C13 = zi.C1(message14.peer_id);
                                    int i292 = i25;
                                    messagesStorage2.a2(j142, C13, Integer.valueOf(i292), message14.id, 0, z23 ? 1 : 0, message14.quick_reply_shortcut_id);
                                    yyVar162.getMessagesStorage().j1(arrayList16, true, false, false, 0, false, i28, message14.quick_reply_shortcut_id);
                                    int i302 = i28;
                                    if (zi.f3(message14)) {
                                    }
                                    g0.h3(new kw(yyVar162, message14, i292, i26, z23));
                                }
                            });
                            yyVar5 = yyVar15;
                            z15 = z22;
                        }
                    }
                    tL_error = tL_error2;
                    tLObject = tLObject2;
                    yyVar = yyVar5;
                    r62 = z15;
                } else {
                    message3 = message6;
                    ziVar = ziVar3;
                    yy yyVar16 = yyVar7;
                    r62 = z17;
                    tL_error = tL_error4;
                    tLObject = tLObject6;
                    org.telegram.ui.Components.t4.e0(yyVar16.currentAccount, tL_error, null, tLObject, new Object[0]);
                    z10 = true;
                    yyVar = yyVar16;
                }
                if (z10) {
                    yyVar.getMessagesStorage().N0(r62, message3);
                    message3.send_state = 2;
                    if (tL_error != null && (str = tL_error.text) != null && str.startsWith("ALLOW_PAYMENT_REQUIRED_")) {
                        ci.e9.y(yyVar.currentAccount, false);
                        message3.errorAllowedPriceStars = ci.e9.o(tLObject);
                        message3.errorNewPriceStars = Long.parseLong(tL_error.text.substring(23));
                        ci.e9.y(yyVar.currentAccount, false).d0(Arrays.asList(ziVar));
                        yyVar.getMessagesStorage().X1(zi.B0(message3), message3);
                    }
                    yyVar.getNotificationCenter().k(23, Integer.valueOf(message3.id));
                    yyVar.d0(message3.id);
                    yyVar.i0(message3.id, r62);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ sx(yy yyVar, boolean z10, TLRPC.TL_error tL_error, TLRPC.Message message, TLObject tLObject, zi ziVar, HashMap hashMap, String str, TLObject tLObject2) {
        this.b = yyVar;
        this.c = z10;
        this.d = tL_error;
        this.e = message;
        this.f = tLObject;
        this.h = ziVar;
        this.n = hashMap;
        this.r = str;
        this.s = tLObject2;
    }
}
