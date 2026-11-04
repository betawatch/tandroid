package org.telegram.messenger;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_update;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class nx implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ yy b;
    public final /* synthetic */ TLRPC.TL_error c;
    public final /* synthetic */ TLObject d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ TLObject f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object n;

    public /* synthetic */ nx(yy yyVar, TLRPC.TL_error tL_error, TLObject tLObject, boolean z10, ArrayList arrayList, ArrayList arrayList2, TLObject tLObject2) {
        this.b = yyVar;
        this.c = tL_error;
        this.d = tLObject;
        this.e = z10;
        this.h = arrayList;
        this.n = arrayList2;
        this.f = tLObject2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v46 */
    @Override // java.lang.Runnable
    public final void run() {
        ?? r12;
        int i3;
        TLRPC.TL_error tL_error;
        boolean z10;
        yy yyVar;
        String str;
        int i10;
        boolean z11;
        TLRPC.Message message;
        int i11;
        a0.h hVar;
        ArrayList arrayList;
        final zi ziVar;
        TLRPC.Message message2;
        int i12;
        ArrayList arrayList2;
        char c2;
        final int[] iArr;
        final int[] iArr2;
        yy yyVar2;
        TLRPC.TL_error tL_error2;
        boolean z12;
        SparseArray sparseArray;
        a0.h hVar2;
        ArrayList<TLRPC.Update> arrayList3;
        ArrayList arrayList4;
        int i13;
        String K1;
        int i14;
        TLRPC.MessageReplyHeader messageReplyHeader;
        a0.h hVar3;
        int i15;
        int i16;
        a0.h hVar4;
        yy yyVar3;
        a0.h hVar5 = null;
        int i17 = 1;
        switch (this.a) {
            case 0:
                yy yyVar4 = this.b;
                TLRPC.TL_error tL_error3 = this.c;
                TLObject tLObject = this.d;
                boolean z13 = this.e;
                ArrayList arrayList5 = (ArrayList) this.h;
                ArrayList arrayList6 = (ArrayList) this.n;
                TLObject tLObject2 = this.f;
                if (tL_error3 == null) {
                    SparseArray sparseArray2 = new SparseArray();
                    a0.h hVar6 = new a0.h();
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                    ArrayList<TLRPC.Update> arrayList7 = updates.updates;
                    ArrayList arrayList8 = new ArrayList();
                    int i18 = 0;
                    boolean z14 = z13;
                    yy yyVar5 = yyVar4;
                    while (i18 < arrayList7.size()) {
                        TLRPC.Update update = arrayList7.get(i18);
                        if (update instanceof TL_update.TL_updateMessageID) {
                            TL_update.TL_updateMessageID tL_updateMessageID = (TL_update.TL_updateMessageID) update;
                            hVar6.k(Integer.valueOf(tL_updateMessageID.id), tL_updateMessageID.random_id);
                            arrayList7.remove(i18);
                            i18--;
                            tL_error2 = tL_error3;
                        } else {
                            TLRPC.TL_error tL_error4 = tL_error3;
                            if (update instanceof TL_update.TL_updateNewMessage) {
                                TL_update.TL_updateNewMessage tL_updateNewMessage = (TL_update.TL_updateNewMessage) update;
                                TLRPC.Message message3 = tL_updateNewMessage.message;
                                sparseArray2.put(message3.id, message3);
                                tL_error2 = tL_error4;
                                Utilities.d.c(new yx(yyVar5, tL_updateNewMessage, 1));
                                arrayList7.remove(i18);
                                i18--;
                                z12 = z13;
                                sparseArray = sparseArray2;
                                hVar2 = hVar6;
                                arrayList3 = arrayList7;
                                arrayList4 = arrayList8;
                                i14 = 1;
                            } else {
                                tL_error2 = tL_error4;
                                if (update instanceof TL_update.TL_updateNewEphemeralMessage) {
                                    TL_update.TL_updateNewEphemeralMessage tL_updateNewEphemeralMessage = (TL_update.TL_updateNewEphemeralMessage) update;
                                    TLRPC.TL_message b10 = cg.v.b(tL_updateNewEphemeralMessage.message);
                                    sparseArray2.put(b10.id, b10);
                                    arrayList8.add(tL_updateNewEphemeralMessage.message);
                                    arrayList7.remove(i18);
                                    i18--;
                                } else {
                                    if (update instanceof TL_update.TL_updateNewChannelMessage) {
                                        TL_update.TL_updateNewChannelMessage tL_updateNewChannelMessage = (TL_update.TL_updateNewChannelMessage) update;
                                        long V1 = hp.V1(tL_updateNewChannelMessage);
                                        TLRPC.Chat M0 = yyVar5.getMessagesController().M0(Long.valueOf(V1));
                                        if ((M0 != null && !M0.megagroup) || (messageReplyHeader = tL_updateNewChannelMessage.message.reply_to) == null || (messageReplyHeader.reply_to_top_id == 0 && messageReplyHeader.reply_to_msg_id == 0)) {
                                            i15 = 1;
                                        } else {
                                            if (hVar5 == null) {
                                                hVar5 = new a0.h();
                                            }
                                            long B0 = zi.B0(tL_updateNewChannelMessage.message);
                                            SparseArray sparseArray3 = (SparseArray) hVar5.f(B0);
                                            if (sparseArray3 == null) {
                                                sparseArray3 = new SparseArray();
                                                hVar5.k(sparseArray3, B0);
                                            }
                                            TLRPC.MessageReplyHeader messageReplyHeader2 = tL_updateNewChannelMessage.message.reply_to;
                                            int i19 = messageReplyHeader2.reply_to_top_id;
                                            if (i19 == 0) {
                                                i19 = messageReplyHeader2.reply_to_msg_id;
                                            }
                                            TLRPC.MessageReplies messageReplies = (TLRPC.MessageReplies) sparseArray3.get(i19);
                                            if (messageReplies == null) {
                                                messageReplies = new TLRPC.TL_messageReplies();
                                                sparseArray3.put(i19, messageReplies);
                                            }
                                            TLRPC.Peer peer = tL_updateNewChannelMessage.message.from_id;
                                            if (peer != null) {
                                                hVar3 = hVar5;
                                                messageReplies.recent_repliers.add(0, peer);
                                            } else {
                                                hVar3 = hVar5;
                                            }
                                            i15 = 1;
                                            messageReplies.replies++;
                                            hVar5 = hVar3;
                                        }
                                        TLRPC.Message message4 = tL_updateNewChannelMessage.message;
                                        sparseArray2.put(message4.id, message4);
                                        Utilities.d.c(new aw(yyVar5, tL_updateNewChannelMessage, i15));
                                        arrayList7.remove(i18);
                                        int i20 = i18 - 1;
                                        if (tL_updateNewChannelMessage.message.pinned) {
                                            yy yyVar6 = yyVar5;
                                            i16 = i20;
                                            arrayList3 = arrayList7;
                                            hVar4 = hVar6;
                                            arrayList4 = arrayList8;
                                            z12 = z13;
                                            sparseArray = sparseArray2;
                                            yyVar3 = yyVar6;
                                            Utilities.d.c(new bw(yyVar6, tL_updateNewChannelMessage, V1, 1));
                                        } else {
                                            i16 = i20;
                                            z12 = z13;
                                            sparseArray = sparseArray2;
                                            hVar4 = hVar6;
                                            arrayList3 = arrayList7;
                                            arrayList4 = arrayList8;
                                            yyVar3 = yyVar5;
                                        }
                                        hVar2 = hVar4;
                                        i18 = i16;
                                        yyVar5 = yyVar3;
                                    } else {
                                        z12 = z13;
                                        sparseArray = sparseArray2;
                                        hVar2 = hVar6;
                                        arrayList3 = arrayList7;
                                        arrayList4 = arrayList8;
                                        if (update instanceof TL_update.TL_updateNewScheduledMessage) {
                                            TLRPC.Message message5 = ((TL_update.TL_updateNewScheduledMessage) update).message;
                                            sparseArray.put(message5.id, message5);
                                            arrayList3.remove(i18);
                                            i18--;
                                            i14 = 1;
                                            z14 = true;
                                            i18 += i14;
                                            arrayList7 = arrayList3;
                                            hVar6 = hVar2;
                                            sparseArray2 = sparseArray;
                                            arrayList8 = arrayList4;
                                            z13 = z12;
                                            tL_error3 = tL_error2;
                                            i17 = i14;
                                            yyVar5 = yyVar5;
                                        } else {
                                            yyVar5 = yyVar5;
                                            if (update instanceof TL_update.TL_updateQuickReplyMessage) {
                                                lg.u1 f10 = lg.u1.f(yyVar5.currentAccount);
                                                if (arrayList5.isEmpty()) {
                                                    i13 = 0;
                                                    K1 = null;
                                                } else {
                                                    i13 = 0;
                                                    K1 = zi.K1(((zi) arrayList5.get(0)).k);
                                                }
                                                f10.j(update, K1, (arrayList5.isEmpty() ? null : Integer.valueOf(zi.J1(((zi) arrayList5.get(i13)).k))).intValue());
                                                TLRPC.Message message6 = ((TL_update.TL_updateQuickReplyMessage) update).message;
                                                sparseArray.put(message6.id, message6);
                                                arrayList3.remove(i18);
                                                i18--;
                                                i14 = 1;
                                            }
                                        }
                                    }
                                    i14 = 1;
                                    i18 += i14;
                                    arrayList7 = arrayList3;
                                    hVar6 = hVar2;
                                    sparseArray2 = sparseArray;
                                    arrayList8 = arrayList4;
                                    z13 = z12;
                                    tL_error3 = tL_error2;
                                    i17 = i14;
                                    yyVar5 = yyVar5;
                                }
                            }
                            z14 = false;
                            i18 += i14;
                            arrayList7 = arrayList3;
                            hVar6 = hVar2;
                            sparseArray2 = sparseArray;
                            arrayList8 = arrayList4;
                            z13 = z12;
                            tL_error3 = tL_error2;
                            i17 = i14;
                            yyVar5 = yyVar5;
                        }
                        z12 = z13;
                        sparseArray = sparseArray2;
                        hVar2 = hVar6;
                        arrayList3 = arrayList7;
                        arrayList4 = arrayList8;
                        i14 = 1;
                        i18 += i14;
                        arrayList7 = arrayList3;
                        hVar6 = hVar2;
                        sparseArray2 = sparseArray;
                        arrayList8 = arrayList4;
                        z13 = z12;
                        tL_error3 = tL_error2;
                        i17 = i14;
                        yyVar5 = yyVar5;
                    }
                    TLRPC.TL_error tL_error5 = tL_error3;
                    int i21 = i17;
                    boolean z15 = z13;
                    final SparseArray sparseArray4 = sparseArray2;
                    a0.h hVar7 = hVar6;
                    ArrayList arrayList9 = arrayList8;
                    int i22 = 2;
                    if (!arrayList9.isEmpty()) {
                        yyVar5.getMessagesStorage().f1(arrayList9, i21);
                    }
                    char c10 = 3;
                    if (hVar5 != null) {
                        yyVar5.getMessagesStorage().a1(null, null, hVar5, i21);
                        hs notificationCenter = yyVar5.getNotificationCenter();
                        Object[] objArr = new Object[4];
                        i10 = 0;
                        objArr[0] = null;
                        objArr[i21] = null;
                        objArr[2] = hVar5;
                        objArr[3] = Boolean.TRUE;
                        notificationCenter.k(77, objArr);
                    } else {
                        i10 = 0;
                    }
                    int[] iArr3 = new int[i21];
                    iArr3[i10] = i10;
                    int[] iArr4 = {i10};
                    final ArrayList arrayList10 = new ArrayList();
                    int i23 = 0;
                    yy yyVar7 = yyVar5;
                    while (i23 < arrayList5.size()) {
                        zi ziVar2 = (zi) arrayList5.get(i23);
                        String str2 = (String) arrayList6.get(i23);
                        TLRPC.Message message7 = ziVar2.k;
                        char c11 = c10;
                        int i24 = message7.id;
                        i3 = i22;
                        final ArrayList arrayList11 = new ArrayList();
                        int i25 = i23;
                        Integer num = (Integer) hVar7.f(message7.random_id);
                        if (num == null || (message = (TLRPC.Message) sparseArray4.get(num.intValue())) == null) {
                            z11 = z15;
                            z10 = true;
                            Utilities.d.c(new cw(yyVar7, updates, 1));
                            tL_error = tL_error5;
                            r12 = z11;
                            yyVar = yyVar7;
                        } else {
                            zi.B0(message);
                            arrayList11.add(message);
                            if ((message.flags & 33554432) != 0) {
                                TLRPC.Message message8 = ziVar2.k;
                                i11 = i24;
                                message8.ttl_period = message.ttl_period;
                                message8.flags |= 33554432;
                            } else {
                                i11 = i24;
                            }
                            if (tLObject2 instanceof TLRPC.TL_messages_sendMedia) {
                                ziVar = ziVar2;
                                ArrayList arrayList12 = arrayList6;
                                i12 = i25;
                                c2 = 4;
                                hVar = hVar7;
                                arrayList2 = arrayList10;
                                message2 = message7;
                                yyVar7.z0((zi) arrayList5.get(0), message, message.id, arrayList12, false, -1, message.params);
                                arrayList = arrayList12;
                            } else {
                                hVar = hVar7;
                                arrayList = arrayList6;
                                ziVar = ziVar2;
                                message2 = message7;
                                i12 = i25;
                                arrayList2 = arrayList10;
                                c2 = 4;
                                yyVar7.z0(ziVar, message, message.id, Collections.singletonList(str2), false, -1, message.params);
                            }
                            final int p12 = ziVar.p1();
                            message2.id = message.id;
                            int i26 = message.quick_reply_shortcut_id;
                            message2.quick_reply_shortcut_id = i26;
                            if (i26 != 0) {
                                message2.flags |= TLObject.FLAG_30;
                            }
                            final long j10 = message.grouped_id;
                            if (z15) {
                                iArr = iArr3;
                                iArr2 = iArr4;
                                yyVar2 = yyVar7;
                            } else {
                                iArr = iArr3;
                                iArr2 = iArr4;
                                Integer num2 = (Integer) yyVar7.getMessagesController().Q.get(Long.valueOf(message.dialog_id));
                                if (num2 == null) {
                                    yyVar2 = yyVar7;
                                    num2 = Integer.valueOf(yyVar7.getMessagesStorage().U(message.dialog_id, message.out));
                                    yyVar2.getMessagesController().Q.put(Long.valueOf(message.dialog_id), num2);
                                } else {
                                    yyVar2 = yyVar7;
                                }
                                message.unread = num2.intValue() < message.id;
                            }
                            iArr[0] = iArr[0] + 1;
                            arrayList2.add(Integer.valueOf(i11));
                            yyVar2.getStatsController().k(t0.f(), 1, 1);
                            message2.send_state = 0;
                            message2.errorAllowedPriceStars = 0L;
                            message2.errorNewPriceStars = 0L;
                            hs notificationCenter2 = yyVar2.getNotificationCenter();
                            Integer valueOf = Integer.valueOf(i11);
                            Integer valueOf2 = Integer.valueOf(message2.id);
                            Long valueOf3 = Long.valueOf(message2.dialog_id);
                            Long valueOf4 = Long.valueOf(j10);
                            Integer valueOf5 = Integer.valueOf(p12);
                            Boolean valueOf6 = Boolean.valueOf(z14);
                            ArrayList arrayList13 = arrayList2;
                            Object[] objArr2 = new Object[7];
                            objArr2[0] = valueOf;
                            objArr2[1] = valueOf2;
                            objArr2[i3] = message2;
                            objArr2[c11] = valueOf3;
                            objArr2[c2] = valueOf4;
                            objArr2[5] = valueOf5;
                            objArr2[6] = valueOf6;
                            notificationCenter2.k(21, objArr2);
                            hs notificationCenter3 = yyVar2.getNotificationCenter();
                            Integer valueOf7 = Integer.valueOf(i11);
                            Integer valueOf8 = Integer.valueOf(message2.id);
                            Long valueOf9 = Long.valueOf(message2.dialog_id);
                            Long valueOf10 = Long.valueOf(j10);
                            Integer valueOf11 = Integer.valueOf(p12);
                            Boolean valueOf12 = Boolean.valueOf(z14);
                            Object[] objArr3 = new Object[7];
                            objArr3[0] = valueOf7;
                            objArr3[1] = valueOf8;
                            objArr3[i3] = message2;
                            objArr3[c11] = valueOf9;
                            objArr3[c2] = valueOf10;
                            objArr3[5] = valueOf11;
                            objArr3[6] = valueOf12;
                            notificationCenter3.k(22, objArr3);
                            final int i27 = i11;
                            final TLRPC.Message message9 = message2;
                            final yy yyVar8 = yyVar2;
                            final boolean z16 = z14;
                            final boolean z17 = z15;
                            arrayList10 = arrayList13;
                            yyVar7 = yyVar8;
                            yyVar2.getMessagesStorage().a.c(new Runnable() { // from class: org.telegram.messenger.cy
                                /* JADX WARN: Multi-variable type inference failed */
                                /* JADX WARN: Removed duplicated region for block: B:7:0x0063  */
                                /* JADX WARN: Type inference failed for: r1v2 */
                                /* JADX WARN: Type inference failed for: r1v7 */
                                /* JADX WARN: Type inference failed for: r1v8 */
                                @Override // java.lang.Runnable
                                /*
                                    Code decompiled incorrectly, please refer to instructions dump.
                                */
                                public final void run() {
                                    ?? r13;
                                    boolean z18;
                                    final TLRPC.Message message10 = message9;
                                    boolean e52 = zi.e5(message10);
                                    final boolean z19 = z16;
                                    if (e52) {
                                        r13 = 9;
                                    } else {
                                        if (message10.quick_reply_shortcut_id == 0 && message10.quick_reply_shortcut == null) {
                                            z18 = z19;
                                            final yy yyVar9 = yy.this;
                                            qr messagesStorage = yyVar9.getMessagesStorage();
                                            long j11 = message10.random_id;
                                            long C1 = zi.C1(message10.peer_id);
                                            final int i28 = i27;
                                            boolean z20 = z18;
                                            messagesStorage.a2(j11, C1, Integer.valueOf(i28), message10.id, 0, z20 ? 1 : 0, message10.quick_reply_shortcut_id);
                                            yyVar9.getMessagesStorage().j1(arrayList11, true, false, false, 0, false, z20 ? 1 : 0, message10.quick_reply_shortcut_id);
                                            if (zi.f3(message10)) {
                                                long C12 = zi.C1(message10.peer_id);
                                                ArrayList arrayList14 = new ArrayList(1);
                                                arrayList14.add(Integer.valueOf(message10.id));
                                                yyVar9.getMessagesStorage().P0(C12, arrayList14, false, false, z20 ? 1 : 0, (int) zi.a2(yyVar9.currentAccount, message10, 0));
                                                yyVar9.getMessagesStorage().R1(C12, -C12, arrayList14, null);
                                                g0.h3(new jw(yyVar9, C12, arrayList14, 1));
                                            }
                                            final int[] iArr5 = iArr2;
                                            final int[] iArr6 = iArr;
                                            final boolean z21 = z17;
                                            final zi ziVar3 = ziVar;
                                            final SparseArray sparseArray5 = sparseArray4;
                                            final ArrayList arrayList15 = arrayList10;
                                            final long j12 = j10;
                                            final int i29 = p12;
                                            g0.h3(new Runnable() { // from class: org.telegram.messenger.uw
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    boolean z22;
                                                    int i30;
                                                    int[] iArr7 = iArr5;
                                                    int i31 = iArr7[0] + 1;
                                                    iArr7[0] = i31;
                                                    int i32 = iArr6[0];
                                                    yy yyVar10 = yy.this;
                                                    boolean z23 = z21;
                                                    boolean z24 = z19;
                                                    if (i31 != i32 || z23 == z24) {
                                                        z22 = z24;
                                                    } else {
                                                        long B02 = zi.B0(ziVar3.k);
                                                        if (z24) {
                                                            SparseArray sparseArray6 = sparseArray5;
                                                            if (sparseArray6.size() > 1) {
                                                                i30 = sparseArray6.keyAt(0);
                                                                z22 = z24;
                                                                yyVar10.getMessagesController().b0(arrayList15, null, null, B02, false, z23 ? 1 : 0, false, 0L, null, 0, (z22 || z23) ? false : true, i30);
                                                            }
                                                        }
                                                        i30 = 0;
                                                        z22 = z24;
                                                        yyVar10.getMessagesController().b0(arrayList15, null, null, B02, false, z23 ? 1 : 0, false, 0L, null, 0, (z22 || z23) ? false : true, i30);
                                                    }
                                                    li mediaDataController = yyVar10.getMediaDataController();
                                                    TLRPC.Message message11 = message10;
                                                    mediaDataController.w0(message11.dialog_id);
                                                    hs notificationCenter4 = yyVar10.getNotificationCenter();
                                                    int i33 = i28;
                                                    Integer valueOf13 = Integer.valueOf(i33);
                                                    Integer valueOf14 = Integer.valueOf(message11.id);
                                                    Long valueOf15 = Long.valueOf(message11.dialog_id);
                                                    long j13 = j12;
                                                    Long valueOf16 = Long.valueOf(j13);
                                                    int i34 = i29;
                                                    notificationCenter4.k(hs.K, valueOf13, valueOf14, message11, valueOf15, valueOf16, Integer.valueOf(i34), Boolean.valueOf(z22));
                                                    yyVar10.getNotificationCenter().k(hs.L, Integer.valueOf(i33), Integer.valueOf(message11.id), message11, Long.valueOf(message11.dialog_id), Long.valueOf(j13), Integer.valueOf(i34), Boolean.valueOf(z22));
                                                    yyVar10.d0(i33);
                                                    yyVar10.i0(i33, z23);
                                                }
                                            });
                                        }
                                        r13 = 5;
                                    }
                                    z18 = r13;
                                    final yy yyVar92 = yy.this;
                                    qr messagesStorage2 = yyVar92.getMessagesStorage();
                                    long j112 = message10.random_id;
                                    long C13 = zi.C1(message10.peer_id);
                                    final int i282 = i27;
                                    boolean z202 = z18;
                                    messagesStorage2.a2(j112, C13, Integer.valueOf(i282), message10.id, 0, z202 ? 1 : 0, message10.quick_reply_shortcut_id);
                                    yyVar92.getMessagesStorage().j1(arrayList11, true, false, false, 0, false, z202 ? 1 : 0, message10.quick_reply_shortcut_id);
                                    if (zi.f3(message10)) {
                                    }
                                    final int[] iArr52 = iArr2;
                                    final int[] iArr62 = iArr;
                                    final boolean z212 = z17;
                                    final zi ziVar32 = ziVar;
                                    final SparseArray sparseArray52 = sparseArray4;
                                    final ArrayList arrayList152 = arrayList10;
                                    final long j122 = j10;
                                    final int i292 = p12;
                                    g0.h3(new Runnable() { // from class: org.telegram.messenger.uw
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            boolean z22;
                                            int i30;
                                            int[] iArr7 = iArr52;
                                            int i31 = iArr7[0] + 1;
                                            iArr7[0] = i31;
                                            int i32 = iArr62[0];
                                            yy yyVar10 = yy.this;
                                            boolean z23 = z212;
                                            boolean z24 = z19;
                                            if (i31 != i32 || z23 == z24) {
                                                z22 = z24;
                                            } else {
                                                long B02 = zi.B0(ziVar32.k);
                                                if (z24) {
                                                    SparseArray sparseArray6 = sparseArray52;
                                                    if (sparseArray6.size() > 1) {
                                                        i30 = sparseArray6.keyAt(0);
                                                        z22 = z24;
                                                        yyVar10.getMessagesController().b0(arrayList152, null, null, B02, false, z23 ? 1 : 0, false, 0L, null, 0, (z22 || z23) ? false : true, i30);
                                                    }
                                                }
                                                i30 = 0;
                                                z22 = z24;
                                                yyVar10.getMessagesController().b0(arrayList152, null, null, B02, false, z23 ? 1 : 0, false, 0L, null, 0, (z22 || z23) ? false : true, i30);
                                            }
                                            li mediaDataController = yyVar10.getMediaDataController();
                                            TLRPC.Message message11 = message10;
                                            mediaDataController.w0(message11.dialog_id);
                                            hs notificationCenter4 = yyVar10.getNotificationCenter();
                                            int i33 = i282;
                                            Integer valueOf13 = Integer.valueOf(i33);
                                            Integer valueOf14 = Integer.valueOf(message11.id);
                                            Long valueOf15 = Long.valueOf(message11.dialog_id);
                                            long j13 = j122;
                                            Long valueOf16 = Long.valueOf(j13);
                                            int i34 = i292;
                                            notificationCenter4.k(hs.K, valueOf13, valueOf14, message11, valueOf15, valueOf16, Integer.valueOf(i34), Boolean.valueOf(z22));
                                            yyVar10.getNotificationCenter().k(hs.L, Integer.valueOf(i33), Integer.valueOf(message11.id), message11, Long.valueOf(message11.dialog_id), Long.valueOf(j13), Integer.valueOf(i34), Boolean.valueOf(z22));
                                            yyVar10.d0(i33);
                                            yyVar10.i0(i33, z23);
                                        }
                                    });
                                }
                            });
                            int i28 = i12 + 1;
                            z15 = z17;
                            z14 = z16;
                            iArr4 = iArr2;
                            iArr3 = iArr;
                            i22 = i3;
                            hVar7 = hVar;
                            arrayList6 = arrayList;
                            i23 = i28;
                            c10 = c11;
                        }
                    }
                    i3 = i22;
                    z11 = z15;
                    z10 = false;
                    Utilities.d.c(new cw(yyVar7, updates, 1));
                    tL_error = tL_error5;
                    r12 = z11;
                    yyVar = yyVar7;
                } else {
                    r12 = z13;
                    i3 = 2;
                    tL_error = tL_error3;
                    org.telegram.ui.Components.t4.e0(yyVar4.currentAccount, tL_error, null, tLObject2, new Object[0]);
                    z10 = true;
                    yyVar = yyVar4;
                }
                if (z10) {
                    int i29 = 0;
                    while (i29 < arrayList5.size()) {
                        zi ziVar3 = (zi) arrayList5.get(i29);
                        TLRPC.Message message10 = ziVar3.k;
                        yyVar.getMessagesStorage().N0(r12, message10);
                        int i30 = i3;
                        message10.send_state = i30;
                        if (r12 == 0 && tL_error != null && (str = tL_error.text) != null && str.startsWith("ALLOW_PAYMENT_REQUIRED_")) {
                            ci.e9.y(yyVar.currentAccount, false);
                            message10.errorAllowedPriceStars = ci.e9.o(tLObject2);
                            message10.errorNewPriceStars = Long.parseLong(tL_error.text.substring(23));
                            ci.e9.y(yyVar.currentAccount, false).d0(Arrays.asList(ziVar3));
                            yyVar.getMessagesStorage().X1(zi.B0(message10), message10);
                        }
                        yyVar.getNotificationCenter().k(23, Integer.valueOf(message10.id));
                        yyVar.d0(message10.id);
                        yyVar.i0(message10.id, r12);
                        i29++;
                        i3 = i30;
                    }
                    break;
                }
                break;
            default:
                yy yyVar9 = this.b;
                TLRPC.TL_error tL_error6 = this.c;
                TLRPC.Message message11 = (TLRPC.Message) this.h;
                TLObject tLObject3 = this.d;
                zi ziVar4 = (zi) this.n;
                boolean z18 = this.e;
                TLObject tLObject4 = this.f;
                if (tL_error6 != null) {
                    org.telegram.ui.Components.t4.e0(yyVar9.currentAccount, tL_error6, null, tLObject4, new Object[0]);
                    yyVar9.i0(message11.id, z18);
                    yyVar9.l0(ziVar4);
                    break;
                } else {
                    String str3 = message11.attachPath;
                    TLRPC.Updates updates2 = (TLRPC.Updates) tLObject3;
                    ArrayList<TLRPC.Update> arrayList14 = updates2.updates;
                    message11.send_state = 0;
                    ArrayList arrayList15 = new ArrayList();
                    arrayList15.add(message11);
                    yyVar9.getMessagesStorage().j1(arrayList15, false, true, false, 0, false, 0, 0L);
                    c00 c00Var = yyVar9.getMessagesController().q7;
                    TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) c00Var.e.f(c00.p(message11.id, -message11.dialog_id));
                    if (tL_forumTopic != null) {
                        tL_forumTopic.topMessage = message11;
                        c00Var.y(-message11.dialog_id, true);
                    }
                    Utilities.d.c(new dy(yyVar9, updates2, message11, z18, 1));
                    break;
                }
        }
    }

    public /* synthetic */ nx(yy yyVar, TLRPC.TL_error tL_error, TLRPC.Message message, TLObject tLObject, zi ziVar, String str, HashMap hashMap, boolean z10, TLObject tLObject2) {
        this.b = yyVar;
        this.c = tL_error;
        this.h = message;
        this.d = tLObject;
        this.n = ziVar;
        this.e = z10;
        this.f = tLObject2;
    }
}
