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

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public final /* synthetic */ class ay implements Runnable {
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

    public /* synthetic */ ay(gz gzVar, TLRPC.TL_error tL_error, TLRPC.Message message, TLObject tLObject, ij ijVar, String str, HashMap hashMap, boolean z9, TLObject tLObject2) {
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
        ij ijVar;
        ?? r62;
        TLRPC.TL_error tL_error;
        TLObject tLObject;
        boolean z9;
        gz gzVar;
        String str;
        int i7;
        TLObject tLObject2;
        Long l10;
        TLRPC.TL_error tL_error2;
        long j3;
        boolean z10;
        boolean z11;
        int i10;
        ?? r10;
        gz gzVar2;
        boolean z12;
        int i11;
        ArrayList<TLRPC.Update> arrayList;
        ArrayList arrayList2;
        String str2;
        boolean z13;
        TLRPC.Updates updates;
        gz gzVar3;
        TLRPC.MessageReplyHeader messageReplyHeader;
        long j10;
        ArrayList<TLRPC.Update> arrayList3;
        a0.h hVar;
        TLRPC.Message message4;
        gz gzVar4;
        ArrayList arrayList4;
        int i12;
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
                    for (int i13 = 0; i13 < arrayList5.size(); i13++) {
                        TLRPC.Update update = arrayList5.get(i13);
                        if (update instanceof TL_update.TL_updateEditMessage) {
                            message2 = ((TL_update.TL_updateEditMessage) update).message;
                        } else if (update instanceof TL_update.TL_updateEditChannelMessage) {
                            message2 = ((TL_update.TL_updateEditChannelMessage) update).message;
                        } else if (update instanceof TL_update.TL_updateNewScheduledMessage) {
                            message2 = ((TL_update.TL_updateNewScheduledMessage) update).message;
                        } else if (update instanceof TL_update.TL_updateQuickReplyMessage) {
                            kg.t1.f(gzVar6.currentAccount).j(update, ij.K1(message5), ij.J1(message5));
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
                    int i14 = message6.id;
                    ArrayList arrayList6 = new ArrayList();
                    boolean z17 = message6.date == 2147483646;
                    if (tLObject5 instanceof TLRPC.TL_updateShortSentMessage) {
                        TLRPC.TL_updateShortSentMessage tL_updateShortSentMessage = (TLRPC.TL_updateShortSentMessage) tLObject5;
                        i7 = i14;
                        tLObject2 = tLObject6;
                        l10 = 0L;
                        tL_error2 = tL_error4;
                        gzVar7.z0(ijVar3, null, tL_updateShortSentMessage.id, Collections.singletonList(null), false, -1, hashMap2);
                        gz gzVar8 = gzVar7;
                        int p12 = ijVar3.p1();
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
                        Utilities.d.c(new yq(19, gzVar8, tL_updateShortSentMessage));
                        arrayList6.add(message6);
                        i10 = p12;
                        j3 = 0;
                        z11 = false;
                        z10 = false;
                        ijVar = ijVar3;
                        gzVar4 = gzVar8;
                    } else {
                        i7 = i14;
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
                            int i16 = 0;
                            boolean z18 = z16;
                            gz gzVar10 = gzVar9;
                            while (i16 < arrayList7.size()) {
                                TLRPC.Update update2 = arrayList7.get(i16);
                                HashMap hashMap4 = hashMap3;
                                if (update2 instanceof TL_update.TL_updateNewMessage) {
                                    TL_update.TL_updateNewMessage tL_updateNewMessage = (TL_update.TL_updateNewMessage) update2;
                                    TLRPC.Message message8 = tL_updateNewMessage.message;
                                    TLRPC.Updates updates4 = updates3;
                                    if (message8.action != null) {
                                        gzVar3 = gzVar10;
                                        arrayList = arrayList7;
                                        arrayList2 = arrayList8;
                                        str2 = str5;
                                        z13 = z18;
                                        updates = updates4;
                                        z18 = z13;
                                        i16++;
                                        arrayList7 = arrayList;
                                        arrayList8 = arrayList2;
                                        str5 = str2;
                                        gzVar10 = gzVar3;
                                        updates3 = updates;
                                        hashMap3 = hashMap4;
                                    } else {
                                        arrayList6.add(message8);
                                        Utilities.d.c(new hy(gzVar10, tL_updateNewMessage, 2));
                                        arrayList7.remove(i16);
                                        i16--;
                                        gzVar3 = gzVar10;
                                        arrayList = arrayList7;
                                        arrayList2 = arrayList8;
                                        updates = updates4;
                                        message7 = message8;
                                        str2 = str5;
                                        i16++;
                                        arrayList7 = arrayList;
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
                                        arrayList7.remove(i16);
                                        i16--;
                                        message7 = b10;
                                        gzVar3 = gzVar10;
                                        arrayList = arrayList7;
                                        arrayList2 = arrayList8;
                                        str2 = str5;
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
                                        Utilities.d.c(new iw(gzVar10, tL_updateNewChannelMessage, 0));
                                        arrayList7.remove(i16);
                                        i16--;
                                        if (tL_updateNewChannelMessage.message.pinned) {
                                            arrayList3 = arrayList7;
                                            arrayList2 = arrayList9;
                                            updates = updates5;
                                            message4 = message9;
                                            long j11 = j10;
                                            str2 = str5;
                                            hVar = hVar3;
                                            Utilities.d.c(new jw(gzVar10, tL_updateNewChannelMessage, j11, 0));
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
                                            gzVar3 = gzVar10;
                                            message7 = message10;
                                            z18 = true;
                                        } else if (update2 instanceof TL_update.TL_updateQuickReplyMessage) {
                                            kg.t1.f(gzVar10.currentAccount).j(update2, ij.K1(ijVar3.k), ij.J1(ijVar3.k));
                                            TLRPC.Message message11 = ((TL_update.TL_updateQuickReplyMessage) update2).message;
                                            arrayList6.add(message11);
                                            arrayList.remove(i16);
                                            i16--;
                                            gzVar3 = gzVar10;
                                            z18 = z13;
                                            message7 = message11;
                                        } else {
                                            if (update2 instanceof TL_update.TL_updateDeleteScheduledMessages) {
                                                TL_update.TL_updateDeleteScheduledMessages tL_updateDeleteScheduledMessages = (TL_update.TL_updateDeleteScheduledMessages) update2;
                                                if (ij.B0(ijVar3.k) == m5.o(tL_updateDeleteScheduledMessages.peer)) {
                                                    ArrayList<Integer> arrayList10 = tL_updateDeleteScheduledMessages.messages;
                                                    int size = arrayList10.size();
                                                    int i19 = 0;
                                                    gz gzVar11 = gzVar10;
                                                    while (i19 < size) {
                                                        Integer num2 = arrayList10.get(i19);
                                                        i19++;
                                                        int intValue = num2.intValue();
                                                        gz gzVar12 = gzVar11;
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
                                                        gzVar11 = gzVar12;
                                                    }
                                                    gzVar3 = gzVar11;
                                                    arrayList.remove(i16);
                                                    i16--;
                                                    z18 = false;
                                                }
                                            }
                                            gzVar3 = gzVar10;
                                            z18 = z13;
                                        }
                                    }
                                    i16++;
                                    arrayList7 = arrayList;
                                    arrayList8 = arrayList2;
                                    str5 = str2;
                                    gzVar10 = gzVar3;
                                    updates3 = updates;
                                    hashMap3 = hashMap4;
                                }
                            }
                            HashMap hashMap5 = hashMap3;
                            TLRPC.Updates updates6 = updates3;
                            gz gzVar13 = gzVar10;
                            ArrayList<TLRPC.Update> arrayList11 = arrayList7;
                            ArrayList arrayList12 = arrayList8;
                            String str6 = str5;
                            boolean z19 = z18;
                            if (arrayList12.isEmpty()) {
                                r10 = 1;
                            } else {
                                r10 = 1;
                                gzVar13.getMessagesStorage().f1(arrayList12, true);
                            }
                            if (hVar2 != null) {
                                gzVar13.getMessagesStorage().a1(null, null, hVar2, r10);
                                qs notificationCenter = gzVar13.getNotificationCenter();
                                Object[] objArr = new Object[4];
                                objArr[0] = null;
                                objArr[r10] = null;
                                objArr[2] = hVar2;
                                objArr[3] = Boolean.TRUE;
                                notificationCenter.k(77, objArr);
                            }
                            if (message7 != null) {
                                ij.B0(message7);
                                boolean z20 = (!z17 || message7.date == 2147483646) ? z19 : false;
                                gc.W(message7);
                                if (!z20) {
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
                                int i21 = message7.quick_reply_shortcut_id;
                                message12.quick_reply_shortcut_id = i21;
                                if (i21 != 0) {
                                    message12.flags |= TLObject.FLAG_30;
                                }
                                TLRPC.Message message13 = message7;
                                gzVar13.z0(ijVar3, message13, message7.id, Collections.singletonList(str6), false, -1, hashMap5);
                                ijVar = ijVar3;
                                gzVar2 = gzVar13;
                                int p13 = ijVar.p1();
                                message6.id = message13.id;
                                i11 = p13;
                                z19 = z20;
                                z12 = false;
                            } else {
                                ijVar = ijVar3;
                                gzVar2 = gzVar13;
                                if (r2.a) {
                                    StringBuilder sb2 = new StringBuilder();
                                    for (int i22 = 0; i22 < arrayList11.size(); i22++) {
                                        sb2.append(arrayList11.get(i22).getClass().getSimpleName());
                                        sb2.append(", ");
                                    }
                                    a8.b("can't find message in updates " + ((Object) sb2));
                                }
                                z12 = true;
                                i11 = 0;
                            }
                            Utilities.d.c(new kw(gzVar2, updates6, 0));
                            z11 = z12;
                            z10 = z19;
                            i10 = i11;
                            gzVar4 = gzVar2;
                        } else {
                            j3 = 0;
                            ijVar = ijVar3;
                            z10 = z16;
                            z11 = false;
                            i10 = 0;
                            gzVar4 = gzVar9;
                        }
                    }
                    if ((ij.o1(message6) instanceof TLRPC.TL_messageMediaGeoLive) && message6.via_bot_id == j3 && TextUtils.isEmpty(message6.via_bot_name)) {
                        sd locationController = gzVar4.getLocationController();
                        ArrayList arrayList13 = locationController.b;
                        a0.h hVar4 = locationController.a;
                        rd rdVar = new rd();
                        z9 = z11;
                        rdVar.a = message6.dialog_id;
                        rdVar.b = message6.id;
                        TLRPC.MessageMedia messageMedia3 = message6.media;
                        rdVar.d = messageMedia3.period;
                        int i23 = messageMedia3.proximity_notification_radius;
                        rdVar.f = i23;
                        rdVar.g = i23;
                        int i24 = locationController.currentAccount;
                        rdVar.e = i24;
                        rdVar.h = new ij(i24, message6, false, false);
                        if (rdVar.d == Integer.MAX_VALUE) {
                            rdVar.c = ConnectionsManager.DEFAULT_DATACENTER_ID;
                        } else {
                            rdVar.c = locationController.getConnectionsManager().getCurrentTime() + rdVar.d;
                        }
                        rd rdVar2 = (rd) hVar4.f(rdVar.a);
                        i12 = i10;
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
                        i12 = i10;
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
                            gzVar4.getMessagesStorage().a.c(new lw(gzVar4, arrayList4, z16, z10, message6, arrayList14, arrayList15, i7));
                            gzVar5 = gzVar4;
                        } else {
                            final boolean z21 = z16;
                            message3 = message6;
                            final int i25 = i7;
                            gzVar4.getNotificationCenter().k(21, Integer.valueOf(i25), Integer.valueOf(message3.id), message3, Long.valueOf(message3.dialog_id), l10, Integer.valueOf(i12), Boolean.valueOf(z21));
                            gz gzVar14 = gzVar4;
                            gzVar4.getNotificationCenter().k(22, Integer.valueOf(i25), Integer.valueOf(message3.id), message3, Long.valueOf(message3.dialog_id), l10, Integer.valueOf(i12), Boolean.valueOf(z21));
                            final int i26 = i12;
                            final ArrayList arrayList16 = arrayList4;
                            final gz gzVar15 = gzVar14;
                            gzVar14.getMessagesStorage().a.c(new Runnable() { // from class: org.telegram.messenger.mw
                                /* JADX WARN: Removed duplicated region for block: B:7:0x0053  */
                                @Override // java.lang.Runnable
                                /*
                                    Code decompiled incorrectly, please refer to instructions dump.
                                */
                                public final void run() {
                                    int i27;
                                    int i28;
                                    TLRPC.Message message14 = message3;
                                    boolean e52 = ij.e5(message14);
                                    boolean z22 = z21;
                                    if (e52) {
                                        i27 = 9;
                                    } else {
                                        if (message14.quick_reply_shortcut_id == 0 && message14.quick_reply_shortcut == null) {
                                            i28 = z22 ? 1 : 0;
                                            gz gzVar16 = gz.this;
                                            yr messagesStorage = gzVar16.getMessagesStorage();
                                            long j13 = message14.random_id;
                                            long C1 = ij.C1(message14.peer_id);
                                            int i29 = i25;
                                            messagesStorage.a2(j13, C1, Integer.valueOf(i29), message14.id, 0, z22 ? 1 : 0, message14.quick_reply_shortcut_id);
                                            gzVar16.getMessagesStorage().j1(arrayList16, true, false, false, 0, false, i28, message14.quick_reply_shortcut_id);
                                            int i30 = i28;
                                            if (ij.f3(message14)) {
                                                long C12 = ij.C1(message14.peer_id);
                                                ArrayList arrayList17 = new ArrayList(1);
                                                arrayList17.add(Integer.valueOf(message14.id));
                                                gzVar16.getMessagesStorage().P0(C12, arrayList17, false, false, i30, (int) ij.a2(gzVar16.currentAccount, message14, 0));
                                                gzVar16.getMessagesStorage().R1(C12, -C12, arrayList17, null);
                                                g0.h3(new rw(gzVar16, C12, arrayList17, 0));
                                            }
                                            g0.h3(new sw(gzVar16, message14, i29, i26, z22));
                                        }
                                        i27 = 5;
                                    }
                                    i28 = i27;
                                    gz gzVar162 = gz.this;
                                    yr messagesStorage2 = gzVar162.getMessagesStorage();
                                    long j132 = message14.random_id;
                                    long C13 = ij.C1(message14.peer_id);
                                    int i292 = i25;
                                    messagesStorage2.a2(j132, C13, Integer.valueOf(i292), message14.id, 0, z22 ? 1 : 0, message14.quick_reply_shortcut_id);
                                    gzVar162.getMessagesStorage().j1(arrayList16, true, false, false, 0, false, i28, message14.quick_reply_shortcut_id);
                                    int i302 = i28;
                                    if (ij.f3(message14)) {
                                    }
                                    g0.h3(new sw(gzVar162, message14, i292, i26, z22));
                                }
                            });
                            gzVar5 = gzVar15;
                            z14 = z21;
                        }
                    }
                    tL_error = tL_error2;
                    tLObject = tLObject2;
                    gzVar = gzVar5;
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
                    gzVar = gzVar16;
                }
                if (z9) {
                    gzVar.getMessagesStorage().N0(r62, message3);
                    message3.send_state = 2;
                    if (tL_error != null && (str = tL_error.text) != null && str.startsWith("ALLOW_PAYMENT_REQUIRED_")) {
                        bi.ea.y(gzVar.currentAccount, false);
                        message3.errorAllowedPriceStars = bi.ea.o(tLObject);
                        message3.errorNewPriceStars = Long.parseLong(tL_error.text.substring(23));
                        bi.ea.y(gzVar.currentAccount, false).d0(Arrays.asList(ijVar));
                        gzVar.getMessagesStorage().X1(ij.B0(message3), message3);
                    }
                    gzVar.getNotificationCenter().k(23, Integer.valueOf(message3.id));
                    gzVar.d0(message3.id);
                    gzVar.i0(message3.id, r62);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ ay(gz gzVar, boolean z9, TLRPC.TL_error tL_error, TLRPC.Message message, TLObject tLObject, ij ijVar, HashMap hashMap, String str, TLObject tLObject2) {
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
