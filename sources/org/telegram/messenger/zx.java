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

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes.dex */
public final /* synthetic */ class zx implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ gz b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ TLRPC.TL_error d;
    public final /* synthetic */ TLRPC.Message e;
    public final /* synthetic */ TLObject f;
    public final /* synthetic */ ij h;
    public final /* synthetic */ HashMap n;
    public final /* synthetic */ String r;
    public final /* synthetic */ TLObject s;

    public /* synthetic */ zx(gz gzVar, TLRPC.TL_error tL_error, TLRPC.Message message, TLObject tLObject, ij ijVar, String str, HashMap hashMap, boolean z9, TLObject tLObject2) {
        this.b = gzVar;
        this.d = tL_error;
        this.e = message;
        this.f = tLObject;
        this.h = ijVar;
        this.r = str;
        this.n = hashMap;
        this.c = z9;
        this.s = tLObject2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:219:0x06e6  */
    /* JADX WARN: Type inference failed for: r17v0 */
    /* JADX WARN: Type inference failed for: r17v1 */
    /* JADX WARN: Type inference failed for: r17v2 */
    /* JADX WARN: Type inference failed for: r1v15, types: [org.telegram.messenger.yr] */
    /* JADX WARN: Type inference failed for: r5v4, types: [org.telegram.messenger.c1, org.telegram.messenger.gz] */
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
        ij ijVar;
        ?? r62;
        TLRPC.TL_error tL_error;
        TLObject tLObject;
        boolean z9;
        ?? r52;
        String str;
        int i7;
        TLObject tLObject2;
        Long l10;
        TLRPC.TL_error tL_error2;
        long j3;
        boolean z10;
        boolean z11;
        int i10;
        gz gzVar;
        boolean z12;
        int i11;
        ArrayList<TLRPC.Update> arrayList;
        ArrayList arrayList2;
        String str2;
        boolean z13;
        TLRPC.Updates updates;
        gz gzVar2;
        gz gzVar3;
        int i12;
        TLRPC.MessageReplyHeader messageReplyHeader;
        long j10;
        ArrayList<TLRPC.Update> arrayList3;
        a0.h hVar;
        TLRPC.Message message4;
        gz gzVar4;
        ArrayList arrayList4;
        int i13;
        boolean z14;
        gz gzVar5;
        switch (this.a) {
            case 0:
                gz gzVar6 = this.b;
                TLRPC.TL_error tL_error3 = this.d;
                TLRPC.Message message5 = this.e;
                TLObject tLObject3 = this.f;
                ij ijVar2 = this.h;
                String str3 = this.r;
                HashMap hashMap = this.n;
                boolean z15 = this.c;
                TLObject tLObject4 = this.s;
                if (tL_error3 != null) {
                    org.telegram.ui.Components.v4.c0(gzVar6.currentAccount, tL_error3, null, tLObject4, new Object[0]);
                    gzVar6.i0(message5.id, z15);
                    gzVar6.l0(ijVar2);
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
                            kg.t1.f(gzVar6.currentAccount).j(update, ij.J1(message5), ij.I1(message5));
                            message2 = ((TL_update.TL_updateQuickReplyMessage) update).message;
                        }
                        message = message2;
                        if (message != null) {
                            gc.W(message);
                            gzVar6.z0(ijVar2, message, message.id, Collections.singletonList(str3), false, -1, hashMap);
                        }
                        Utilities.d.c(new ly(gzVar6, updates2, message5, z15, 0));
                        break;
                    }
                    message = null;
                    if (message != null) {
                    }
                    Utilities.d.c(new ly(gzVar6, updates2, message5, z15, 0));
                }
            default:
                gz gzVar7 = this.b;
                boolean z16 = this.c;
                TLRPC.TL_error tL_error4 = this.d;
                TLRPC.Message message6 = this.e;
                TLObject tLObject5 = this.f;
                ij ijVar3 = this.h;
                HashMap hashMap2 = this.n;
                String str5 = this.r;
                TLObject tLObject6 = this.s;
                if (tL_error4 == null) {
                    int i15 = 1;
                    int i16 = message6.id;
                    ArrayList arrayList6 = new ArrayList();
                    boolean z17 = message6.date == 2147483646;
                    if (tLObject5 instanceof TLRPC.TL_updateShortSentMessage) {
                        TLRPC.TL_updateShortSentMessage tL_updateShortSentMessage = (TLRPC.TL_updateShortSentMessage) tLObject5;
                        i7 = i16;
                        tLObject2 = tLObject6;
                        l10 = 0L;
                        tL_error2 = tL_error4;
                        gzVar7.z0(ijVar3, null, tL_updateShortSentMessage.id, Collections.singletonList(null), false, -1, hashMap2);
                        gz gzVar8 = gzVar7;
                        int o12 = ijVar3.o1();
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
                            gc.W(message6);
                        }
                        TLRPC.MessageMedia messageMedia2 = tL_updateShortSentMessage.media;
                        if (((messageMedia2 instanceof TLRPC.TL_messageMediaGame) || (messageMedia2 instanceof TLRPC.TL_messageMediaInvoice)) && !TextUtils.isEmpty(tL_updateShortSentMessage.message)) {
                            message6.message = tL_updateShortSentMessage.message;
                        }
                        if (!message6.entities.isEmpty()) {
                            message6.flags |= 128;
                        }
                        Integer num = (Integer) gzVar8.getMessagesController().P.get(Long.valueOf(message6.dialog_id));
                        if (num == null) {
                            num = Integer.valueOf(gzVar8.getMessagesStorage().U(message6.dialog_id, message6.out));
                            gzVar8.getMessagesController().P.put(Long.valueOf(message6.dialog_id), num);
                        }
                        message6.unread = num.intValue() < message6.id;
                        Utilities.d.c(new zq(19, gzVar8, tL_updateShortSentMessage));
                        arrayList6.add(message6);
                        i10 = o12;
                        j3 = 0;
                        z11 = false;
                        z10 = false;
                        ijVar = ijVar3;
                        gzVar4 = gzVar8;
                    } else {
                        i7 = i16;
                        HashMap hashMap3 = hashMap2;
                        tLObject2 = tLObject6;
                        l10 = 0L;
                        gz gzVar9 = gzVar7;
                        tL_error2 = tL_error4;
                        if (tLObject5 instanceof TLRPC.Updates) {
                            TLRPC.Updates updates3 = (TLRPC.Updates) tLObject5;
                            ArrayList<TLRPC.Update> arrayList7 = updates3.updates;
                            ArrayList arrayList8 = new ArrayList();
                            j3 = 0;
                            TLRPC.Message message7 = null;
                            a0.h hVar2 = null;
                            int i18 = 0;
                            boolean z18 = z16;
                            gz gzVar10 = gzVar9;
                            while (i18 < arrayList7.size()) {
                                TLRPC.Update update2 = arrayList7.get(i18);
                                HashMap hashMap4 = hashMap3;
                                if (update2 instanceof TL_update.TL_updateNewMessage) {
                                    TL_update.TL_updateNewMessage tL_updateNewMessage = (TL_update.TL_updateNewMessage) update2;
                                    TLRPC.Message message8 = tL_updateNewMessage.message;
                                    TLRPC.Updates updates4 = updates3;
                                    if (message8.action != null) {
                                        gzVar2 = gzVar10;
                                        arrayList = arrayList7;
                                        arrayList2 = arrayList8;
                                        str2 = str5;
                                        z13 = z18;
                                        updates = updates4;
                                        z18 = z13;
                                        gzVar3 = gzVar2;
                                    } else {
                                        arrayList6.add(message8);
                                        Utilities.d.c(new iy(gzVar10, tL_updateNewMessage, 2));
                                        arrayList7.remove(i18);
                                        i18--;
                                        gzVar3 = gzVar10;
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
                                        gzVar10 = gzVar3;
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
                                        gzVar3 = gzVar10;
                                        arrayList = arrayList7;
                                        arrayList2 = arrayList8;
                                        str2 = str5;
                                        i12 = i15;
                                        updates = updates5;
                                    } else if (update2 instanceof TL_update.TL_updateNewChannelMessage) {
                                        TL_update.TL_updateNewChannelMessage tL_updateNewChannelMessage = (TL_update.TL_updateNewChannelMessage) update2;
                                        ArrayList arrayList9 = arrayList8;
                                        long V1 = qp.V1(tL_updateNewChannelMessage);
                                        TLRPC.Chat M0 = gzVar10.getMessagesController().M0(Long.valueOf(V1));
                                        if (!(M0 == null || M0.megagroup) || (messageReplyHeader = tL_updateNewChannelMessage.message.reply_to) == null || (messageReplyHeader.reply_to_top_id == 0 && messageReplyHeader.reply_to_msg_id == 0)) {
                                            j10 = V1;
                                        } else {
                                            if (hVar2 == null) {
                                                hVar2 = new a0.h();
                                            }
                                            j10 = V1;
                                            long B0 = ij.B0(tL_updateNewChannelMessage.message);
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
                                        Utilities.d.c(new jy(gzVar10, tL_updateNewChannelMessage, i15));
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
                                            Utilities.d.c(new iw(gzVar10, tL_updateNewChannelMessage, j11, 0));
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
                                        z18 = false;
                                        gzVar3 = gzVar10;
                                    } else {
                                        arrayList = arrayList7;
                                        arrayList2 = arrayList8;
                                        str2 = str5;
                                        z13 = z18;
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
                                            gzVar3 = gzVar10;
                                            message7 = message10;
                                            i12 = 1;
                                            z18 = true;
                                        } else if (update2 instanceof TL_update.TL_updateQuickReplyMessage) {
                                            kg.t1.f(gzVar10.currentAccount).j(update2, ij.J1(ijVar3.k), ij.I1(ijVar3.k));
                                            TLRPC.Message message11 = ((TL_update.TL_updateQuickReplyMessage) update2).message;
                                            arrayList6.add(message11);
                                            arrayList.remove(i18);
                                            i18--;
                                            gzVar3 = gzVar10;
                                            z18 = z13;
                                            message7 = message11;
                                        } else {
                                            if (update2 instanceof TL_update.TL_updateDeleteScheduledMessages) {
                                                TL_update.TL_updateDeleteScheduledMessages tL_updateDeleteScheduledMessages = (TL_update.TL_updateDeleteScheduledMessages) update2;
                                                if (ij.B0(ijVar3.k) == m5.o(tL_updateDeleteScheduledMessages.peer)) {
                                                    ArrayList<Integer> arrayList10 = tL_updateDeleteScheduledMessages.messages;
                                                    int size = arrayList10.size();
                                                    int i21 = 0;
                                                    gz gzVar11 = gzVar10;
                                                    while (i21 < size) {
                                                        Integer num2 = arrayList10.get(i21);
                                                        i21++;
                                                        int intValue = num2.intValue();
                                                        gz gzVar12 = gzVar11;
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
                                                        gzVar11 = gzVar12;
                                                    }
                                                    gzVar3 = gzVar11;
                                                    arrayList.remove(i18);
                                                    i18--;
                                                    i12 = 1;
                                                    z18 = false;
                                                }
                                            }
                                            gzVar2 = gzVar10;
                                            z18 = z13;
                                            gzVar3 = gzVar2;
                                        }
                                    }
                                    i18 += i12;
                                    arrayList7 = arrayList;
                                    i15 = i12;
                                    arrayList8 = arrayList2;
                                    str5 = str2;
                                    gzVar10 = gzVar3;
                                    updates3 = updates;
                                    hashMap3 = hashMap4;
                                }
                                i12 = 1;
                                i18 += i12;
                                arrayList7 = arrayList;
                                i15 = i12;
                                arrayList8 = arrayList2;
                                str5 = str2;
                                gzVar10 = gzVar3;
                                updates3 = updates;
                                hashMap3 = hashMap4;
                            }
                            HashMap hashMap5 = hashMap3;
                            TLRPC.Updates updates6 = updates3;
                            gz gzVar13 = gzVar10;
                            ArrayList<TLRPC.Update> arrayList11 = arrayList7;
                            ArrayList arrayList12 = arrayList8;
                            String str6 = str5;
                            boolean z19 = z18;
                            boolean z20 = i15;
                            if (!arrayList12.isEmpty()) {
                                gzVar13.getMessagesStorage().f1(arrayList12, z20);
                            }
                            if (hVar2 != null) {
                                gzVar13.getMessagesStorage().a1(null, null, hVar2, z20);
                                qs notificationCenter = gzVar13.getNotificationCenter();
                                Object[] objArr = new Object[4];
                                objArr[0] = null;
                                objArr[z20 ? 1 : 0] = null;
                                objArr[2] = hVar2;
                                objArr[3] = Boolean.TRUE;
                                notificationCenter.k(77, objArr);
                            }
                            if (message7 != null) {
                                ij.B0(message7);
                                boolean z21 = (!z17 || message7.date == 2147483646) ? z19 : false;
                                gc.W(message7);
                                if (!z21) {
                                    Integer num3 = (Integer) gzVar13.getMessagesController().P.get(Long.valueOf(message7.dialog_id));
                                    if (num3 == null) {
                                        num3 = Integer.valueOf(gzVar13.getMessagesStorage().U(message7.dialog_id, message7.out));
                                        gzVar13.getMessagesController().P.put(Long.valueOf(message7.dialog_id), num3);
                                    }
                                    message7.unread = num3.intValue() < message7.id;
                                }
                                TLRPC.Message message12 = ijVar3.k;
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
                                gzVar13.z0(ijVar3, message13, message7.id, Collections.singletonList(str6), false, -1, hashMap5);
                                ijVar = ijVar3;
                                gzVar = gzVar13;
                                int o13 = ijVar.o1();
                                message6.id = message13.id;
                                i11 = o13;
                                z19 = z21;
                                z12 = false;
                            } else {
                                ijVar = ijVar3;
                                gzVar = gzVar13;
                                if (r2.a) {
                                    StringBuilder sb2 = new StringBuilder();
                                    for (int i24 = 0; i24 < arrayList11.size(); i24++) {
                                        sb2.append(arrayList11.get(i24).getClass().getSimpleName());
                                        sb2.append(", ");
                                    }
                                    a8.b("can't find message in updates " + ((Object) sb2));
                                }
                                z12 = true;
                                i11 = 0;
                            }
                            Utilities.d.c(new jw(gzVar, updates6, 0));
                            z11 = z12;
                            z10 = z19;
                            i10 = i11;
                            gzVar4 = gzVar;
                        } else {
                            j3 = 0;
                            ijVar = ijVar3;
                            z10 = z16;
                            z11 = false;
                            i10 = 0;
                            gzVar4 = gzVar9;
                        }
                    }
                    if ((ij.n1(message6) instanceof TLRPC.TL_messageMediaGeoLive) && message6.via_bot_id == j3 && TextUtils.isEmpty(message6.via_bot_name)) {
                        sd locationController = gzVar4.getLocationController();
                        ArrayList arrayList13 = locationController.b;
                        a0.h hVar4 = locationController.a;
                        rd rdVar = new rd();
                        z9 = z11;
                        rdVar.a = message6.dialog_id;
                        rdVar.b = message6.id;
                        TLRPC.MessageMedia messageMedia3 = message6.media;
                        rdVar.d = messageMedia3.period;
                        int i25 = messageMedia3.proximity_notification_radius;
                        rdVar.f = i25;
                        rdVar.g = i25;
                        int i26 = locationController.currentAccount;
                        rdVar.e = i26;
                        rdVar.h = new ij(i26, message6, false, false);
                        if (rdVar.d == Integer.MAX_VALUE) {
                            rdVar.c = ConnectionsManager.DEFAULT_DATACENTER_ID;
                        } else {
                            rdVar.c = locationController.getConnectionsManager().getCurrentTime() + rdVar.d;
                        }
                        rd rdVar2 = (rd) hVar4.f(rdVar.a);
                        i13 = i10;
                        arrayList4 = arrayList6;
                        hVar4.k(rdVar, rdVar.a);
                        if (rdVar2 != null) {
                            arrayList13.remove(rdVar2);
                        }
                        arrayList13.add(rdVar);
                        locationController.l(rdVar, 0);
                        locationController.w = SystemClock.elapsedRealtime() - 25000;
                        g0.h3(new ng(locationController, rdVar2, rdVar, 28));
                    } else {
                        z9 = z11;
                        arrayList4 = arrayList6;
                        i13 = i10;
                    }
                    if (z9) {
                        z14 = z16;
                        message3 = message6;
                        gzVar5 = gzVar4;
                    } else {
                        gzVar4.getStatsController().k(t0.f(), 1, 1);
                        message6.send_state = 0;
                        long j12 = j3;
                        message6.errorNewPriceStars = j12;
                        message6.errorAllowedPriceStars = j12;
                        if (z16 != z10) {
                            ArrayList arrayList14 = new ArrayList();
                            arrayList14.add(Integer.valueOf(i7));
                            ArrayList arrayList15 = new ArrayList();
                            arrayList15.add(new ij(ijVar.I1, ijVar.k, true, true));
                            z14 = z16;
                            message3 = message6;
                            gzVar4.getMessagesStorage().a.c(new kw(gzVar4, arrayList4, z16, z10, message6, arrayList14, arrayList15, i7));
                            gzVar5 = gzVar4;
                        } else {
                            final boolean z22 = z16;
                            message3 = message6;
                            final int i27 = i7;
                            gzVar4.getNotificationCenter().k(21, Integer.valueOf(i27), Integer.valueOf(message3.id), message3, Long.valueOf(message3.dialog_id), l10, Integer.valueOf(i13), Boolean.valueOf(z22));
                            gz gzVar14 = gzVar4;
                            gzVar4.getNotificationCenter().k(22, Integer.valueOf(i27), Integer.valueOf(message3.id), message3, Long.valueOf(message3.dialog_id), l10, Integer.valueOf(i13), Boolean.valueOf(z22));
                            final int i28 = i13;
                            final ArrayList arrayList16 = arrayList4;
                            final gz gzVar15 = gzVar14;
                            gzVar14.getMessagesStorage().a.c(new Runnable() { // from class: org.telegram.messenger.lw
                                /* JADX WARN: Removed duplicated region for block: B:7:0x0053  */
                                @Override // java.lang.Runnable
                                /*
                                    Code decompiled incorrectly, please refer to instructions dump.
                                */
                                public final void run() {
                                    int i29;
                                    int i30;
                                    TLRPC.Message message14 = message3;
                                    boolean d52 = ij.d5(message14);
                                    boolean z23 = z22;
                                    if (d52) {
                                        i29 = 9;
                                    } else {
                                        if (message14.quick_reply_shortcut_id == 0 && message14.quick_reply_shortcut == null) {
                                            i30 = z23 ? 1 : 0;
                                            gz gzVar16 = gz.this;
                                            yr messagesStorage = gzVar16.getMessagesStorage();
                                            long j13 = message14.random_id;
                                            long B1 = ij.B1(message14.peer_id);
                                            int i31 = i27;
                                            messagesStorage.a2(j13, B1, Integer.valueOf(i31), message14.id, 0, z23 ? 1 : 0, message14.quick_reply_shortcut_id);
                                            gzVar16.getMessagesStorage().j1(arrayList16, true, false, false, 0, false, i30, message14.quick_reply_shortcut_id);
                                            int i32 = i30;
                                            if (ij.e3(message14)) {
                                                long B12 = ij.B1(message14.peer_id);
                                                ArrayList arrayList17 = new ArrayList(1);
                                                arrayList17.add(Integer.valueOf(message14.id));
                                                gzVar16.getMessagesStorage().P0(B12, arrayList17, false, false, i32, (int) ij.Z1(gzVar16.currentAccount, message14, 0));
                                                gzVar16.getMessagesStorage().R1(B12, -B12, arrayList17, null);
                                                g0.h3(new pw(gzVar16, B12, arrayList17, 0));
                                            }
                                            g0.h3(new rw(gzVar16, message14, i31, i28, z23));
                                        }
                                        i29 = 5;
                                    }
                                    i30 = i29;
                                    gz gzVar162 = gz.this;
                                    yr messagesStorage2 = gzVar162.getMessagesStorage();
                                    long j132 = message14.random_id;
                                    long B13 = ij.B1(message14.peer_id);
                                    int i312 = i27;
                                    messagesStorage2.a2(j132, B13, Integer.valueOf(i312), message14.id, 0, z23 ? 1 : 0, message14.quick_reply_shortcut_id);
                                    gzVar162.getMessagesStorage().j1(arrayList16, true, false, false, 0, false, i30, message14.quick_reply_shortcut_id);
                                    int i322 = i30;
                                    if (ij.e3(message14)) {
                                    }
                                    g0.h3(new rw(gzVar162, message14, i312, i28, z23));
                                }
                            });
                            gzVar5 = gzVar15;
                            z14 = z22;
                        }
                    }
                    tL_error = tL_error2;
                    tLObject = tLObject2;
                    r52 = gzVar5;
                    r62 = z14;
                } else {
                    message3 = message6;
                    ijVar = ijVar3;
                    gz gzVar16 = gzVar7;
                    r62 = z16;
                    tL_error = tL_error4;
                    tLObject = tLObject6;
                    org.telegram.ui.Components.v4.c0(gzVar16.currentAccount, tL_error, null, tLObject, new Object[0]);
                    z9 = true;
                    r52 = gzVar16;
                }
                if (z9) {
                    r52.getMessagesStorage().N0(r62, message3);
                    message3.send_state = 2;
                    if (tL_error != null && (str = tL_error.text) != null && str.startsWith("ALLOW_PAYMENT_REQUIRED_")) {
                        bi.ea.y(r52.currentAccount, false);
                        message3.errorAllowedPriceStars = bi.ea.o(tLObject);
                        message3.errorNewPriceStars = Long.parseLong(tL_error.text.substring(23));
                        bi.ea.y(r52.currentAccount, false).d0(Arrays.asList(ijVar));
                        r52.getMessagesStorage().X1(ij.B0(message3), message3);
                    }
                    r52.getNotificationCenter().k(23, Integer.valueOf(message3.id));
                    r52.d0(message3.id);
                    r52.i0(message3.id, r62);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ zx(gz gzVar, boolean z9, TLRPC.TL_error tL_error, TLRPC.Message message, TLObject tLObject, ij ijVar, HashMap hashMap, String str, TLObject tLObject2) {
        this.b = gzVar;
        this.c = z9;
        this.d = tL_error;
        this.e = message;
        this.f = tLObject;
        this.h = ijVar;
        this.n = hashMap;
        this.r = str;
        this.s = tLObject2;
    }
}
