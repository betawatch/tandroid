package org.telegram.messenger;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_update;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class gy implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ qz b;
    public final /* synthetic */ TLRPC.TL_error c;
    public final /* synthetic */ TLObject d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ TLObject f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object n;

    public /* synthetic */ gy(qz qzVar, TLRPC.TL_error tL_error, TLObject tLObject, boolean z10, ArrayList arrayList, ArrayList arrayList2, TLObject tLObject2) {
        this.b = qzVar;
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
        int i10;
        TLRPC.TL_error tL_error;
        boolean z10;
        qz qzVar;
        String str;
        int i11;
        boolean z11;
        TLRPC.Message message;
        int i12;
        a0.h hVar;
        ArrayList arrayList;
        final jj jjVar;
        TLRPC.Message message2;
        int i13;
        ArrayList arrayList2;
        char c10;
        final int[] iArr;
        final int[] iArr2;
        qz qzVar2;
        TLRPC.TL_error tL_error2;
        boolean z12;
        SparseArray sparseArray;
        a0.h hVar2;
        ArrayList<TLRPC.Update> arrayList3;
        ArrayList arrayList4;
        int i14;
        String K1;
        int i15;
        TLRPC.MessageReplyHeader messageReplyHeader;
        a0.h hVar3;
        int i16;
        int i17;
        a0.h hVar4;
        qz qzVar3;
        a0.h hVar5 = null;
        int i18 = 1;
        switch (this.a) {
            case 0:
                qz qzVar4 = this.b;
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
                    int i19 = 0;
                    boolean z14 = z13;
                    qz qzVar5 = qzVar4;
                    while (i19 < arrayList7.size()) {
                        TLRPC.Update update = arrayList7.get(i19);
                        if (update instanceof TL_update.TL_updateMessageID) {
                            TL_update.TL_updateMessageID tL_updateMessageID = (TL_update.TL_updateMessageID) update;
                            hVar6.k(Integer.valueOf(tL_updateMessageID.id), tL_updateMessageID.random_id);
                            arrayList7.remove(i19);
                            i19--;
                            tL_error2 = tL_error3;
                        } else {
                            TLRPC.TL_error tL_error4 = tL_error3;
                            if (update instanceof TL_update.TL_updateNewMessage) {
                                TL_update.TL_updateNewMessage tL_updateNewMessage = (TL_update.TL_updateNewMessage) update;
                                TLRPC.Message message3 = tL_updateNewMessage.message;
                                sparseArray2.put(message3.id, message3);
                                tL_error2 = tL_error4;
                                Utilities.d.c(new ry(qzVar5, tL_updateNewMessage, 1));
                                arrayList7.remove(i19);
                                i19--;
                                z12 = z13;
                                sparseArray = sparseArray2;
                                hVar2 = hVar6;
                                arrayList3 = arrayList7;
                                arrayList4 = arrayList8;
                                i15 = 1;
                            } else {
                                tL_error2 = tL_error4;
                                if (update instanceof TL_update.TL_updateNewEphemeralMessage) {
                                    TL_update.TL_updateNewEphemeralMessage tL_updateNewEphemeralMessage = (TL_update.TL_updateNewEphemeralMessage) update;
                                    TLRPC.TL_message b10 = rf.s.b(tL_updateNewEphemeralMessage.message);
                                    sparseArray2.put(b10.id, b10);
                                    arrayList8.add(tL_updateNewEphemeralMessage.message);
                                    arrayList7.remove(i19);
                                    i19--;
                                } else {
                                    if (update instanceof TL_update.TL_updateNewChannelMessage) {
                                        TL_update.TL_updateNewChannelMessage tL_updateNewChannelMessage = (TL_update.TL_updateNewChannelMessage) update;
                                        long U1 = vp.U1(tL_updateNewChannelMessage);
                                        TLRPC.Chat L0 = qzVar5.getMessagesController().L0(Long.valueOf(U1));
                                        if ((L0 != null && !L0.megagroup) || (messageReplyHeader = tL_updateNewChannelMessage.message.reply_to) == null || (messageReplyHeader.reply_to_top_id == 0 && messageReplyHeader.reply_to_msg_id == 0)) {
                                            i16 = 1;
                                        } else {
                                            if (hVar5 == null) {
                                                hVar5 = new a0.h();
                                            }
                                            long B0 = jj.B0(tL_updateNewChannelMessage.message);
                                            SparseArray sparseArray3 = (SparseArray) hVar5.f(B0);
                                            if (sparseArray3 == null) {
                                                sparseArray3 = new SparseArray();
                                                hVar5.k(sparseArray3, B0);
                                            }
                                            TLRPC.MessageReplyHeader messageReplyHeader2 = tL_updateNewChannelMessage.message.reply_to;
                                            int i20 = messageReplyHeader2.reply_to_top_id;
                                            if (i20 == 0) {
                                                i20 = messageReplyHeader2.reply_to_msg_id;
                                            }
                                            TLRPC.MessageReplies messageReplies = (TLRPC.MessageReplies) sparseArray3.get(i20);
                                            if (messageReplies == null) {
                                                messageReplies = new TLRPC.TL_messageReplies();
                                                sparseArray3.put(i20, messageReplies);
                                            }
                                            TLRPC.Peer peer = tL_updateNewChannelMessage.message.from_id;
                                            if (peer != null) {
                                                hVar3 = hVar5;
                                                messageReplies.recent_repliers.add(0, peer);
                                            } else {
                                                hVar3 = hVar5;
                                            }
                                            i16 = 1;
                                            messageReplies.replies++;
                                            hVar5 = hVar3;
                                        }
                                        TLRPC.Message message4 = tL_updateNewChannelMessage.message;
                                        sparseArray2.put(message4.id, message4);
                                        Utilities.d.c(new tw(qzVar5, tL_updateNewChannelMessage, i16));
                                        arrayList7.remove(i19);
                                        int i21 = i19 - 1;
                                        if (tL_updateNewChannelMessage.message.pinned) {
                                            qz qzVar6 = qzVar5;
                                            i17 = i21;
                                            arrayList3 = arrayList7;
                                            hVar4 = hVar6;
                                            arrayList4 = arrayList8;
                                            z12 = z13;
                                            sparseArray = sparseArray2;
                                            qzVar3 = qzVar6;
                                            Utilities.d.c(new uw(qzVar6, tL_updateNewChannelMessage, U1, 1));
                                        } else {
                                            i17 = i21;
                                            z12 = z13;
                                            sparseArray = sparseArray2;
                                            hVar4 = hVar6;
                                            arrayList3 = arrayList7;
                                            arrayList4 = arrayList8;
                                            qzVar3 = qzVar5;
                                        }
                                        hVar2 = hVar4;
                                        i19 = i17;
                                        qzVar5 = qzVar3;
                                    } else {
                                        z12 = z13;
                                        sparseArray = sparseArray2;
                                        hVar2 = hVar6;
                                        arrayList3 = arrayList7;
                                        arrayList4 = arrayList8;
                                        if (update instanceof TL_update.TL_updateNewScheduledMessage) {
                                            TLRPC.Message message5 = ((TL_update.TL_updateNewScheduledMessage) update).message;
                                            sparseArray.put(message5.id, message5);
                                            arrayList3.remove(i19);
                                            i19--;
                                            i15 = 1;
                                            z14 = true;
                                            i19 += i15;
                                            arrayList7 = arrayList3;
                                            hVar6 = hVar2;
                                            sparseArray2 = sparseArray;
                                            arrayList8 = arrayList4;
                                            z13 = z12;
                                            tL_error3 = tL_error2;
                                            i18 = i15;
                                            qzVar5 = qzVar5;
                                        } else {
                                            qzVar5 = qzVar5;
                                            if (update instanceof TL_update.TL_updateQuickReplyMessage) {
                                                ag.i3 f7 = ag.i3.f(qzVar5.currentAccount);
                                                if (arrayList5.isEmpty()) {
                                                    i14 = 0;
                                                    K1 = null;
                                                } else {
                                                    i14 = 0;
                                                    K1 = jj.K1(((jj) arrayList5.get(0)).k);
                                                }
                                                f7.j(update, K1, (arrayList5.isEmpty() ? null : Integer.valueOf(jj.J1(((jj) arrayList5.get(i14)).k))).intValue());
                                                TLRPC.Message message6 = ((TL_update.TL_updateQuickReplyMessage) update).message;
                                                sparseArray.put(message6.id, message6);
                                                arrayList3.remove(i19);
                                                i19--;
                                                i15 = 1;
                                            }
                                        }
                                    }
                                    i15 = 1;
                                    i19 += i15;
                                    arrayList7 = arrayList3;
                                    hVar6 = hVar2;
                                    sparseArray2 = sparseArray;
                                    arrayList8 = arrayList4;
                                    z13 = z12;
                                    tL_error3 = tL_error2;
                                    i18 = i15;
                                    qzVar5 = qzVar5;
                                }
                            }
                            z14 = false;
                            i19 += i15;
                            arrayList7 = arrayList3;
                            hVar6 = hVar2;
                            sparseArray2 = sparseArray;
                            arrayList8 = arrayList4;
                            z13 = z12;
                            tL_error3 = tL_error2;
                            i18 = i15;
                            qzVar5 = qzVar5;
                        }
                        z12 = z13;
                        sparseArray = sparseArray2;
                        hVar2 = hVar6;
                        arrayList3 = arrayList7;
                        arrayList4 = arrayList8;
                        i15 = 1;
                        i19 += i15;
                        arrayList7 = arrayList3;
                        hVar6 = hVar2;
                        sparseArray2 = sparseArray;
                        arrayList8 = arrayList4;
                        z13 = z12;
                        tL_error3 = tL_error2;
                        i18 = i15;
                        qzVar5 = qzVar5;
                    }
                    TLRPC.TL_error tL_error5 = tL_error3;
                    int i22 = i18;
                    boolean z15 = z13;
                    final SparseArray sparseArray4 = sparseArray2;
                    a0.h hVar7 = hVar6;
                    ArrayList arrayList9 = arrayList8;
                    int i23 = 2;
                    if (!arrayList9.isEmpty()) {
                        qzVar5.getMessagesStorage().f1(arrayList9, i22);
                    }
                    char c11 = 3;
                    if (hVar5 != null) {
                        qzVar5.getMessagesStorage().a1(null, null, hVar5, i22);
                        zs notificationCenter = qzVar5.getNotificationCenter();
                        Object[] objArr = new Object[4];
                        i11 = 0;
                        objArr[0] = null;
                        objArr[i22] = null;
                        objArr[2] = hVar5;
                        objArr[3] = Boolean.TRUE;
                        notificationCenter.k(77, objArr);
                    } else {
                        i11 = 0;
                    }
                    int[] iArr3 = new int[i22];
                    iArr3[i11] = i11;
                    int[] iArr4 = {i11};
                    final ArrayList arrayList10 = new ArrayList();
                    int i24 = 0;
                    qz qzVar7 = qzVar5;
                    while (i24 < arrayList5.size()) {
                        jj jjVar2 = (jj) arrayList5.get(i24);
                        String str2 = (String) arrayList6.get(i24);
                        TLRPC.Message message7 = jjVar2.k;
                        char c12 = c11;
                        int i25 = message7.id;
                        i10 = i23;
                        final ArrayList arrayList11 = new ArrayList();
                        int i26 = i24;
                        Integer num = (Integer) hVar7.f(message7.random_id);
                        if (num == null || (message = (TLRPC.Message) sparseArray4.get(num.intValue())) == null) {
                            z11 = z15;
                            z10 = true;
                            Utilities.d.c(new vw(qzVar7, updates, 1));
                            tL_error = tL_error5;
                            r12 = z11;
                            qzVar = qzVar7;
                        } else {
                            jj.B0(message);
                            arrayList11.add(message);
                            if ((message.flags & 33554432) != 0) {
                                TLRPC.Message message8 = jjVar2.k;
                                i12 = i25;
                                message8.ttl_period = message.ttl_period;
                                message8.flags |= 33554432;
                            } else {
                                i12 = i25;
                            }
                            if (tLObject2 instanceof TLRPC.TL_messages_sendMedia) {
                                jjVar = jjVar2;
                                ArrayList arrayList12 = arrayList6;
                                i13 = i26;
                                c10 = 4;
                                hVar = hVar7;
                                arrayList2 = arrayList10;
                                message2 = message7;
                                qzVar7.z0((jj) arrayList5.get(0), message, message.id, arrayList12, false, -1, message.params);
                                arrayList = arrayList12;
                            } else {
                                hVar = hVar7;
                                arrayList = arrayList6;
                                jjVar = jjVar2;
                                message2 = message7;
                                i13 = i26;
                                arrayList2 = arrayList10;
                                c10 = 4;
                                qzVar7.z0(jjVar, message, message.id, Collections.singletonList(str2), false, -1, message.params);
                            }
                            final int p12 = jjVar.p1();
                            message2.id = message.id;
                            int i27 = message.quick_reply_shortcut_id;
                            message2.quick_reply_shortcut_id = i27;
                            if (i27 != 0) {
                                message2.flags |= TLObject.FLAG_30;
                            }
                            final long j10 = message.grouped_id;
                            if (z15) {
                                iArr = iArr3;
                                iArr2 = iArr4;
                                qzVar2 = qzVar7;
                            } else {
                                iArr = iArr3;
                                iArr2 = iArr4;
                                Integer num2 = (Integer) qzVar7.getMessagesController().P.get(Long.valueOf(message.dialog_id));
                                if (num2 == null) {
                                    qzVar2 = qzVar7;
                                    num2 = Integer.valueOf(qzVar7.getMessagesStorage().U(message.dialog_id, message.out));
                                    qzVar2.getMessagesController().P.put(Long.valueOf(message.dialog_id), num2);
                                } else {
                                    qzVar2 = qzVar7;
                                }
                                message.unread = num2.intValue() < message.id;
                            }
                            iArr[0] = iArr[0] + 1;
                            arrayList2.add(Integer.valueOf(i12));
                            qzVar2.getStatsController().k(w0.f(), 1, 1);
                            message2.send_state = 0;
                            message2.errorAllowedPriceStars = 0L;
                            message2.errorNewPriceStars = 0L;
                            zs notificationCenter2 = qzVar2.getNotificationCenter();
                            Integer valueOf = Integer.valueOf(i12);
                            Integer valueOf2 = Integer.valueOf(message2.id);
                            Long valueOf3 = Long.valueOf(message2.dialog_id);
                            Long valueOf4 = Long.valueOf(j10);
                            Integer valueOf5 = Integer.valueOf(p12);
                            Boolean valueOf6 = Boolean.valueOf(z14);
                            ArrayList arrayList13 = arrayList2;
                            Object[] objArr2 = new Object[7];
                            objArr2[0] = valueOf;
                            objArr2[1] = valueOf2;
                            objArr2[i10] = message2;
                            objArr2[c12] = valueOf3;
                            objArr2[c10] = valueOf4;
                            objArr2[5] = valueOf5;
                            objArr2[6] = valueOf6;
                            notificationCenter2.k(21, objArr2);
                            zs notificationCenter3 = qzVar2.getNotificationCenter();
                            Integer valueOf7 = Integer.valueOf(i12);
                            Integer valueOf8 = Integer.valueOf(message2.id);
                            Long valueOf9 = Long.valueOf(message2.dialog_id);
                            Long valueOf10 = Long.valueOf(j10);
                            Integer valueOf11 = Integer.valueOf(p12);
                            Boolean valueOf12 = Boolean.valueOf(z14);
                            Object[] objArr3 = new Object[7];
                            objArr3[0] = valueOf7;
                            objArr3[1] = valueOf8;
                            objArr3[i10] = message2;
                            objArr3[c12] = valueOf9;
                            objArr3[c10] = valueOf10;
                            objArr3[5] = valueOf11;
                            objArr3[6] = valueOf12;
                            notificationCenter3.k(22, objArr3);
                            final int i28 = i12;
                            final TLRPC.Message message9 = message2;
                            final qz qzVar8 = qzVar2;
                            final boolean z16 = z14;
                            final boolean z17 = z15;
                            arrayList10 = arrayList13;
                            qzVar7 = qzVar8;
                            qzVar2.getMessagesStorage().a.c(new Runnable() { // from class: org.telegram.messenger.uy
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
                                    boolean d52 = jj.d5(message10);
                                    final boolean z19 = z16;
                                    if (d52) {
                                        r13 = 9;
                                    } else {
                                        if (message10.quick_reply_shortcut_id == 0 && message10.quick_reply_shortcut == null) {
                                            z18 = z19;
                                            final qz qzVar9 = qz.this;
                                            hs messagesStorage = qzVar9.getMessagesStorage();
                                            long j11 = message10.random_id;
                                            long C1 = jj.C1(message10.peer_id);
                                            final int i29 = i28;
                                            boolean z20 = z18;
                                            messagesStorage.a2(j11, C1, Integer.valueOf(i29), message10.id, 0, z20 ? 1 : 0, message10.quick_reply_shortcut_id);
                                            qzVar9.getMessagesStorage().j1(arrayList11, true, false, false, 0, false, z20 ? 1 : 0, message10.quick_reply_shortcut_id);
                                            if (jj.e3(message10)) {
                                                long C12 = jj.C1(message10.peer_id);
                                                ArrayList arrayList14 = new ArrayList(1);
                                                arrayList14.add(Integer.valueOf(message10.id));
                                                qzVar9.getMessagesStorage().P0(C12, arrayList14, false, false, z20 ? 1 : 0, (int) jj.a2(qzVar9.currentAccount, message10, 0));
                                                qzVar9.getMessagesStorage().R1(C12, -C12, arrayList14, null);
                                                i0.g3(new cx(qzVar9, C12, arrayList14, 1));
                                            }
                                            final int[] iArr5 = iArr2;
                                            final int[] iArr6 = iArr;
                                            final boolean z21 = z17;
                                            final jj jjVar3 = jjVar;
                                            final SparseArray sparseArray5 = sparseArray4;
                                            final ArrayList arrayList15 = arrayList10;
                                            final long j12 = j10;
                                            final int i30 = p12;
                                            i0.g3(new Runnable() { // from class: org.telegram.messenger.nx
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    boolean z22;
                                                    int i31;
                                                    int[] iArr7 = iArr5;
                                                    int i32 = iArr7[0] + 1;
                                                    iArr7[0] = i32;
                                                    int i33 = iArr6[0];
                                                    qz qzVar10 = qz.this;
                                                    boolean z23 = z21;
                                                    boolean z24 = z19;
                                                    if (i32 != i33 || z23 == z24) {
                                                        z22 = z24;
                                                    } else {
                                                        long B02 = jj.B0(jjVar3.k);
                                                        if (z24) {
                                                            SparseArray sparseArray6 = sparseArray5;
                                                            if (sparseArray6.size() > 1) {
                                                                i31 = sparseArray6.keyAt(0);
                                                                z22 = z24;
                                                                qzVar10.getMessagesController().b0(arrayList15, null, null, B02, false, z23 ? 1 : 0, false, 0L, null, 0, (z22 || z23) ? false : true, i31);
                                                            }
                                                        }
                                                        i31 = 0;
                                                        z22 = z24;
                                                        qzVar10.getMessagesController().b0(arrayList15, null, null, B02, false, z23 ? 1 : 0, false, 0L, null, 0, (z22 || z23) ? false : true, i31);
                                                    }
                                                    ui mediaDataController = qzVar10.getMediaDataController();
                                                    TLRPC.Message message11 = message10;
                                                    mediaDataController.w0(message11.dialog_id);
                                                    zs notificationCenter4 = qzVar10.getNotificationCenter();
                                                    int i34 = i29;
                                                    Integer valueOf13 = Integer.valueOf(i34);
                                                    Integer valueOf14 = Integer.valueOf(message11.id);
                                                    Long valueOf15 = Long.valueOf(message11.dialog_id);
                                                    long j13 = j12;
                                                    Long valueOf16 = Long.valueOf(j13);
                                                    int i35 = i30;
                                                    notificationCenter4.k(zs.K, valueOf13, valueOf14, message11, valueOf15, valueOf16, Integer.valueOf(i35), Boolean.valueOf(z22));
                                                    qzVar10.getNotificationCenter().k(zs.L, Integer.valueOf(i34), Integer.valueOf(message11.id), message11, Long.valueOf(message11.dialog_id), Long.valueOf(j13), Integer.valueOf(i35), Boolean.valueOf(z22));
                                                    qzVar10.d0(i34);
                                                    qzVar10.i0(i34, z23);
                                                }
                                            });
                                        }
                                        r13 = 5;
                                    }
                                    z18 = r13;
                                    final qz qzVar92 = qz.this;
                                    hs messagesStorage2 = qzVar92.getMessagesStorage();
                                    long j112 = message10.random_id;
                                    long C13 = jj.C1(message10.peer_id);
                                    final int i292 = i28;
                                    boolean z202 = z18;
                                    messagesStorage2.a2(j112, C13, Integer.valueOf(i292), message10.id, 0, z202 ? 1 : 0, message10.quick_reply_shortcut_id);
                                    qzVar92.getMessagesStorage().j1(arrayList11, true, false, false, 0, false, z202 ? 1 : 0, message10.quick_reply_shortcut_id);
                                    if (jj.e3(message10)) {
                                    }
                                    final int[] iArr52 = iArr2;
                                    final int[] iArr62 = iArr;
                                    final boolean z212 = z17;
                                    final jj jjVar32 = jjVar;
                                    final SparseArray sparseArray52 = sparseArray4;
                                    final ArrayList arrayList152 = arrayList10;
                                    final long j122 = j10;
                                    final int i302 = p12;
                                    i0.g3(new Runnable() { // from class: org.telegram.messenger.nx
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            boolean z22;
                                            int i31;
                                            int[] iArr7 = iArr52;
                                            int i32 = iArr7[0] + 1;
                                            iArr7[0] = i32;
                                            int i33 = iArr62[0];
                                            qz qzVar10 = qz.this;
                                            boolean z23 = z212;
                                            boolean z24 = z19;
                                            if (i32 != i33 || z23 == z24) {
                                                z22 = z24;
                                            } else {
                                                long B02 = jj.B0(jjVar32.k);
                                                if (z24) {
                                                    SparseArray sparseArray6 = sparseArray52;
                                                    if (sparseArray6.size() > 1) {
                                                        i31 = sparseArray6.keyAt(0);
                                                        z22 = z24;
                                                        qzVar10.getMessagesController().b0(arrayList152, null, null, B02, false, z23 ? 1 : 0, false, 0L, null, 0, (z22 || z23) ? false : true, i31);
                                                    }
                                                }
                                                i31 = 0;
                                                z22 = z24;
                                                qzVar10.getMessagesController().b0(arrayList152, null, null, B02, false, z23 ? 1 : 0, false, 0L, null, 0, (z22 || z23) ? false : true, i31);
                                            }
                                            ui mediaDataController = qzVar10.getMediaDataController();
                                            TLRPC.Message message11 = message10;
                                            mediaDataController.w0(message11.dialog_id);
                                            zs notificationCenter4 = qzVar10.getNotificationCenter();
                                            int i34 = i292;
                                            Integer valueOf13 = Integer.valueOf(i34);
                                            Integer valueOf14 = Integer.valueOf(message11.id);
                                            Long valueOf15 = Long.valueOf(message11.dialog_id);
                                            long j13 = j122;
                                            Long valueOf16 = Long.valueOf(j13);
                                            int i35 = i302;
                                            notificationCenter4.k(zs.K, valueOf13, valueOf14, message11, valueOf15, valueOf16, Integer.valueOf(i35), Boolean.valueOf(z22));
                                            qzVar10.getNotificationCenter().k(zs.L, Integer.valueOf(i34), Integer.valueOf(message11.id), message11, Long.valueOf(message11.dialog_id), Long.valueOf(j13), Integer.valueOf(i35), Boolean.valueOf(z22));
                                            qzVar10.d0(i34);
                                            qzVar10.i0(i34, z23);
                                        }
                                    });
                                }
                            });
                            int i29 = i13 + 1;
                            z15 = z17;
                            z14 = z16;
                            iArr4 = iArr2;
                            iArr3 = iArr;
                            i23 = i10;
                            hVar7 = hVar;
                            arrayList6 = arrayList;
                            i24 = i29;
                            c11 = c12;
                        }
                    }
                    i10 = i23;
                    z11 = z15;
                    z10 = false;
                    Utilities.d.c(new vw(qzVar7, updates, 1));
                    tL_error = tL_error5;
                    r12 = z11;
                    qzVar = qzVar7;
                } else {
                    r12 = z13;
                    i10 = 2;
                    tL_error = tL_error3;
                    org.telegram.ui.Components.s4.e0(qzVar4.currentAccount, tL_error, null, tLObject2, new Object[0]);
                    z10 = true;
                    qzVar = qzVar4;
                }
                if (z10) {
                    int i30 = 0;
                    while (i30 < arrayList5.size()) {
                        jj jjVar3 = (jj) arrayList5.get(i30);
                        TLRPC.Message message10 = jjVar3.k;
                        qzVar.getMessagesStorage().N0(r12, message10);
                        int i31 = i10;
                        message10.send_state = i31;
                        if (r12 == 0 && tL_error != null && (str = tL_error.text) != null && str.startsWith("ALLOW_PAYMENT_REQUIRED_")) {
                            rh.e6.y(qzVar.currentAccount, false);
                            message10.errorAllowedPriceStars = rh.e6.o(tLObject2);
                            message10.errorNewPriceStars = Long.parseLong(tL_error.text.substring(23));
                            rh.e6.y(qzVar.currentAccount, false).d0(Arrays.asList(jjVar3));
                            qzVar.getMessagesStorage().X1(jj.B0(message10), message10);
                        }
                        qzVar.getNotificationCenter().k(23, Integer.valueOf(message10.id));
                        qzVar.d0(message10.id);
                        qzVar.i0(message10.id, r12);
                        i30++;
                        i10 = i31;
                    }
                    break;
                }
                break;
            default:
                qz qzVar9 = this.b;
                TLRPC.TL_error tL_error6 = this.c;
                TLRPC.Message message11 = (TLRPC.Message) this.h;
                TLObject tLObject3 = this.d;
                jj jjVar4 = (jj) this.n;
                boolean z18 = this.e;
                TLObject tLObject4 = this.f;
                if (tL_error6 != null) {
                    org.telegram.ui.Components.s4.e0(qzVar9.currentAccount, tL_error6, null, tLObject4, new Object[0]);
                    qzVar9.i0(message11.id, z18);
                    qzVar9.l0(jjVar4);
                    break;
                } else {
                    String str3 = message11.attachPath;
                    TLRPC.Updates updates2 = (TLRPC.Updates) tLObject3;
                    ArrayList<TLRPC.Update> arrayList14 = updates2.updates;
                    message11.send_state = 0;
                    ArrayList arrayList15 = new ArrayList();
                    arrayList15.add(message11);
                    qzVar9.getMessagesStorage().j1(arrayList15, false, true, false, 0, false, 0, 0L);
                    x00 x00Var = qzVar9.getMessagesController().r7;
                    TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) x00Var.e.f(x00.p(message11.id, -message11.dialog_id));
                    if (tL_forumTopic != null) {
                        tL_forumTopic.topMessage = message11;
                        x00Var.y(-message11.dialog_id, true);
                    }
                    Utilities.d.c(new vy(qzVar9, updates2, message11, z18, 1));
                    break;
                }
        }
    }

    public /* synthetic */ gy(qz qzVar, TLRPC.TL_error tL_error, TLRPC.Message message, TLObject tLObject, jj jjVar, String str, HashMap hashMap, boolean z10, TLObject tLObject2) {
        this.b = qzVar;
        this.c = tL_error;
        this.h = message;
        this.d = tLObject;
        this.n = jjVar;
        this.e = z10;
        this.f = tLObject2;
    }
}
