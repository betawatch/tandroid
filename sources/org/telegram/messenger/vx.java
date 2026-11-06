package org.telegram.messenger;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_update;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final /* synthetic */ class vx implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ gz b;
    public final /* synthetic */ TLRPC.TL_error c;
    public final /* synthetic */ TLObject d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ TLObject f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object n;

    public /* synthetic */ vx(gz gzVar, TLRPC.TL_error tL_error, TLObject tLObject, boolean z9, ArrayList arrayList, ArrayList arrayList2, TLObject tLObject2) {
        this.b = gzVar;
        this.c = tL_error;
        this.d = tLObject;
        this.e = z9;
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
        int i7;
        TLRPC.TL_error tL_error;
        boolean z9;
        gz gzVar;
        String str;
        int i10;
        boolean z10;
        TLRPC.Message message;
        int i11;
        a0.h hVar;
        ArrayList arrayList;
        final ij ijVar;
        TLRPC.Message message2;
        int i12;
        ArrayList arrayList2;
        char c10;
        final int[] iArr;
        final int[] iArr2;
        gz gzVar2;
        TLRPC.TL_error tL_error2;
        boolean z11;
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
        gz gzVar3;
        a0.h hVar5 = null;
        int i17 = 1;
        switch (this.a) {
            case 0:
                gz gzVar4 = this.b;
                TLRPC.TL_error tL_error3 = this.c;
                TLObject tLObject = this.d;
                boolean z12 = this.e;
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
                    boolean z13 = z12;
                    gz gzVar5 = gzVar4;
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
                                Utilities.d.c(new hy(gzVar5, tL_updateNewMessage, 1));
                                arrayList7.remove(i18);
                                i18--;
                                z11 = z12;
                                sparseArray = sparseArray2;
                                hVar2 = hVar6;
                                arrayList3 = arrayList7;
                                arrayList4 = arrayList8;
                                i14 = 1;
                            } else {
                                tL_error2 = tL_error4;
                                if (update instanceof TL_update.TL_updateNewEphemeralMessage) {
                                    TL_update.TL_updateNewEphemeralMessage tL_updateNewEphemeralMessage = (TL_update.TL_updateNewEphemeralMessage) update;
                                    TLRPC.TL_message b10 = bg.w.b(tL_updateNewEphemeralMessage.message);
                                    sparseArray2.put(b10.id, b10);
                                    arrayList8.add(tL_updateNewEphemeralMessage.message);
                                    arrayList7.remove(i18);
                                    i18--;
                                } else {
                                    if (update instanceof TL_update.TL_updateNewChannelMessage) {
                                        TL_update.TL_updateNewChannelMessage tL_updateNewChannelMessage = (TL_update.TL_updateNewChannelMessage) update;
                                        long V1 = qp.V1(tL_updateNewChannelMessage);
                                        TLRPC.Chat M0 = gzVar5.getMessagesController().M0(Long.valueOf(V1));
                                        if ((M0 != null && !M0.megagroup) || (messageReplyHeader = tL_updateNewChannelMessage.message.reply_to) == null || (messageReplyHeader.reply_to_top_id == 0 && messageReplyHeader.reply_to_msg_id == 0)) {
                                            i15 = 1;
                                        } else {
                                            if (hVar5 == null) {
                                                hVar5 = new a0.h();
                                            }
                                            long B0 = ij.B0(tL_updateNewChannelMessage.message);
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
                                        Utilities.d.c(new iw(gzVar5, tL_updateNewChannelMessage, i15));
                                        arrayList7.remove(i18);
                                        int i20 = i18 - 1;
                                        if (tL_updateNewChannelMessage.message.pinned) {
                                            gz gzVar6 = gzVar5;
                                            i16 = i20;
                                            arrayList3 = arrayList7;
                                            hVar4 = hVar6;
                                            arrayList4 = arrayList8;
                                            z11 = z12;
                                            sparseArray = sparseArray2;
                                            gzVar3 = gzVar6;
                                            Utilities.d.c(new jw(gzVar6, tL_updateNewChannelMessage, V1, 1));
                                        } else {
                                            i16 = i20;
                                            z11 = z12;
                                            sparseArray = sparseArray2;
                                            hVar4 = hVar6;
                                            arrayList3 = arrayList7;
                                            arrayList4 = arrayList8;
                                            gzVar3 = gzVar5;
                                        }
                                        hVar2 = hVar4;
                                        i18 = i16;
                                        gzVar5 = gzVar3;
                                    } else {
                                        z11 = z12;
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
                                            z13 = true;
                                            i18 += i14;
                                            arrayList7 = arrayList3;
                                            hVar6 = hVar2;
                                            sparseArray2 = sparseArray;
                                            arrayList8 = arrayList4;
                                            z12 = z11;
                                            tL_error3 = tL_error2;
                                            i17 = i14;
                                            gzVar5 = gzVar5;
                                        } else {
                                            gzVar5 = gzVar5;
                                            if (update instanceof TL_update.TL_updateQuickReplyMessage) {
                                                kg.t1 f10 = kg.t1.f(gzVar5.currentAccount);
                                                if (arrayList5.isEmpty()) {
                                                    i13 = 0;
                                                    K1 = null;
                                                } else {
                                                    i13 = 0;
                                                    K1 = ij.K1(((ij) arrayList5.get(0)).k);
                                                }
                                                f10.j(update, K1, (arrayList5.isEmpty() ? null : Integer.valueOf(ij.J1(((ij) arrayList5.get(i13)).k))).intValue());
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
                                    z12 = z11;
                                    tL_error3 = tL_error2;
                                    i17 = i14;
                                    gzVar5 = gzVar5;
                                }
                            }
                            z13 = false;
                            i18 += i14;
                            arrayList7 = arrayList3;
                            hVar6 = hVar2;
                            sparseArray2 = sparseArray;
                            arrayList8 = arrayList4;
                            z12 = z11;
                            tL_error3 = tL_error2;
                            i17 = i14;
                            gzVar5 = gzVar5;
                        }
                        z11 = z12;
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
                        z12 = z11;
                        tL_error3 = tL_error2;
                        i17 = i14;
                        gzVar5 = gzVar5;
                    }
                    TLRPC.TL_error tL_error5 = tL_error3;
                    int i21 = i17;
                    boolean z14 = z12;
                    final SparseArray sparseArray4 = sparseArray2;
                    a0.h hVar7 = hVar6;
                    ArrayList arrayList9 = arrayList8;
                    int i22 = 2;
                    if (!arrayList9.isEmpty()) {
                        gzVar5.getMessagesStorage().f1(arrayList9, i21);
                    }
                    char c11 = 3;
                    if (hVar5 != null) {
                        gzVar5.getMessagesStorage().a1(null, null, hVar5, i21);
                        qs notificationCenter = gzVar5.getNotificationCenter();
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
                    gz gzVar7 = gzVar5;
                    while (i23 < arrayList5.size()) {
                        ij ijVar2 = (ij) arrayList5.get(i23);
                        String str2 = (String) arrayList6.get(i23);
                        TLRPC.Message message7 = ijVar2.k;
                        char c12 = c11;
                        int i24 = message7.id;
                        i7 = i22;
                        final ArrayList arrayList11 = new ArrayList();
                        int i25 = i23;
                        Integer num = (Integer) hVar7.f(message7.random_id);
                        if (num == null || (message = (TLRPC.Message) sparseArray4.get(num.intValue())) == null) {
                            z10 = z14;
                            z9 = true;
                            Utilities.d.c(new kw(gzVar7, updates, 1));
                            tL_error = tL_error5;
                            r12 = z10;
                            gzVar = gzVar7;
                        } else {
                            ij.B0(message);
                            arrayList11.add(message);
                            if ((message.flags & 33554432) != 0) {
                                TLRPC.Message message8 = ijVar2.k;
                                i11 = i24;
                                message8.ttl_period = message.ttl_period;
                                message8.flags |= 33554432;
                            } else {
                                i11 = i24;
                            }
                            if (tLObject2 instanceof TLRPC.TL_messages_sendMedia) {
                                ijVar = ijVar2;
                                ArrayList arrayList12 = arrayList6;
                                i12 = i25;
                                c10 = 4;
                                hVar = hVar7;
                                arrayList2 = arrayList10;
                                message2 = message7;
                                gzVar7.z0((ij) arrayList5.get(0), message, message.id, arrayList12, false, -1, message.params);
                                arrayList = arrayList12;
                            } else {
                                hVar = hVar7;
                                arrayList = arrayList6;
                                ijVar = ijVar2;
                                message2 = message7;
                                i12 = i25;
                                arrayList2 = arrayList10;
                                c10 = 4;
                                gzVar7.z0(ijVar, message, message.id, Collections.singletonList(str2), false, -1, message.params);
                            }
                            final int p12 = ijVar.p1();
                            message2.id = message.id;
                            int i26 = message.quick_reply_shortcut_id;
                            message2.quick_reply_shortcut_id = i26;
                            if (i26 != 0) {
                                message2.flags |= TLObject.FLAG_30;
                            }
                            final long j3 = message.grouped_id;
                            if (z14) {
                                iArr = iArr3;
                                iArr2 = iArr4;
                                gzVar2 = gzVar7;
                            } else {
                                iArr = iArr3;
                                iArr2 = iArr4;
                                Integer num2 = (Integer) gzVar7.getMessagesController().P.get(Long.valueOf(message.dialog_id));
                                if (num2 == null) {
                                    gzVar2 = gzVar7;
                                    num2 = Integer.valueOf(gzVar7.getMessagesStorage().U(message.dialog_id, message.out));
                                    gzVar2.getMessagesController().P.put(Long.valueOf(message.dialog_id), num2);
                                } else {
                                    gzVar2 = gzVar7;
                                }
                                message.unread = num2.intValue() < message.id;
                            }
                            iArr[0] = iArr[0] + 1;
                            arrayList2.add(Integer.valueOf(i11));
                            gzVar2.getStatsController().k(t0.f(), 1, 1);
                            message2.send_state = 0;
                            message2.errorAllowedPriceStars = 0L;
                            message2.errorNewPriceStars = 0L;
                            qs notificationCenter2 = gzVar2.getNotificationCenter();
                            Integer valueOf = Integer.valueOf(i11);
                            Integer valueOf2 = Integer.valueOf(message2.id);
                            Long valueOf3 = Long.valueOf(message2.dialog_id);
                            Long valueOf4 = Long.valueOf(j3);
                            Integer valueOf5 = Integer.valueOf(p12);
                            Boolean valueOf6 = Boolean.valueOf(z13);
                            ArrayList arrayList13 = arrayList2;
                            Object[] objArr2 = new Object[7];
                            objArr2[0] = valueOf;
                            objArr2[1] = valueOf2;
                            objArr2[i7] = message2;
                            objArr2[c12] = valueOf3;
                            objArr2[c10] = valueOf4;
                            objArr2[5] = valueOf5;
                            objArr2[6] = valueOf6;
                            notificationCenter2.k(21, objArr2);
                            qs notificationCenter3 = gzVar2.getNotificationCenter();
                            Integer valueOf7 = Integer.valueOf(i11);
                            Integer valueOf8 = Integer.valueOf(message2.id);
                            Long valueOf9 = Long.valueOf(message2.dialog_id);
                            Long valueOf10 = Long.valueOf(j3);
                            Integer valueOf11 = Integer.valueOf(p12);
                            Boolean valueOf12 = Boolean.valueOf(z13);
                            Object[] objArr3 = new Object[7];
                            objArr3[0] = valueOf7;
                            objArr3[1] = valueOf8;
                            objArr3[i7] = message2;
                            objArr3[c12] = valueOf9;
                            objArr3[c10] = valueOf10;
                            objArr3[5] = valueOf11;
                            objArr3[6] = valueOf12;
                            notificationCenter3.k(22, objArr3);
                            final int i27 = i11;
                            final TLRPC.Message message9 = message2;
                            final gz gzVar8 = gzVar2;
                            final boolean z15 = z13;
                            final boolean z16 = z14;
                            arrayList10 = arrayList13;
                            gzVar7 = gzVar8;
                            gzVar2.getMessagesStorage().a.c(new Runnable() { // from class: org.telegram.messenger.ky
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
                                    boolean z17;
                                    final TLRPC.Message message10 = message9;
                                    boolean e52 = ij.e5(message10);
                                    final boolean z18 = z15;
                                    if (e52) {
                                        r13 = 9;
                                    } else {
                                        if (message10.quick_reply_shortcut_id == 0 && message10.quick_reply_shortcut == null) {
                                            z17 = z18;
                                            final gz gzVar9 = gz.this;
                                            yr messagesStorage = gzVar9.getMessagesStorage();
                                            long j10 = message10.random_id;
                                            long C1 = ij.C1(message10.peer_id);
                                            final int i28 = i27;
                                            boolean z19 = z17;
                                            messagesStorage.a2(j10, C1, Integer.valueOf(i28), message10.id, 0, z19 ? 1 : 0, message10.quick_reply_shortcut_id);
                                            gzVar9.getMessagesStorage().j1(arrayList11, true, false, false, 0, false, z19 ? 1 : 0, message10.quick_reply_shortcut_id);
                                            if (ij.f3(message10)) {
                                                long C12 = ij.C1(message10.peer_id);
                                                ArrayList arrayList14 = new ArrayList(1);
                                                arrayList14.add(Integer.valueOf(message10.id));
                                                gzVar9.getMessagesStorage().P0(C12, arrayList14, false, false, z19 ? 1 : 0, (int) ij.a2(gzVar9.currentAccount, message10, 0));
                                                gzVar9.getMessagesStorage().R1(C12, -C12, arrayList14, null);
                                                g0.h3(new rw(gzVar9, C12, arrayList14, 1));
                                            }
                                            final int[] iArr5 = iArr2;
                                            final int[] iArr6 = iArr;
                                            final boolean z20 = z16;
                                            final ij ijVar3 = ijVar;
                                            final SparseArray sparseArray5 = sparseArray4;
                                            final ArrayList arrayList15 = arrayList10;
                                            final long j11 = j3;
                                            final int i29 = p12;
                                            g0.h3(new Runnable() { // from class: org.telegram.messenger.bx
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    boolean z21;
                                                    int i30;
                                                    int[] iArr7 = iArr5;
                                                    int i31 = iArr7[0] + 1;
                                                    iArr7[0] = i31;
                                                    int i32 = iArr6[0];
                                                    gz gzVar10 = gz.this;
                                                    boolean z22 = z20;
                                                    boolean z23 = z18;
                                                    if (i31 != i32 || z22 == z23) {
                                                        z21 = z23;
                                                    } else {
                                                        long B02 = ij.B0(ijVar3.k);
                                                        if (z23) {
                                                            SparseArray sparseArray6 = sparseArray5;
                                                            if (sparseArray6.size() > 1) {
                                                                i30 = sparseArray6.keyAt(0);
                                                                z21 = z23;
                                                                gzVar10.getMessagesController().b0(arrayList15, null, null, B02, false, z22 ? 1 : 0, false, 0L, null, 0, (z21 || z22) ? false : true, i30);
                                                            }
                                                        }
                                                        i30 = 0;
                                                        z21 = z23;
                                                        gzVar10.getMessagesController().b0(arrayList15, null, null, B02, false, z22 ? 1 : 0, false, 0L, null, 0, (z21 || z22) ? false : true, i30);
                                                    }
                                                    ui mediaDataController = gzVar10.getMediaDataController();
                                                    TLRPC.Message message11 = message10;
                                                    mediaDataController.w0(message11.dialog_id);
                                                    qs notificationCenter4 = gzVar10.getNotificationCenter();
                                                    int i33 = i28;
                                                    Integer valueOf13 = Integer.valueOf(i33);
                                                    Integer valueOf14 = Integer.valueOf(message11.id);
                                                    Long valueOf15 = Long.valueOf(message11.dialog_id);
                                                    long j12 = j11;
                                                    Long valueOf16 = Long.valueOf(j12);
                                                    int i34 = i29;
                                                    notificationCenter4.k(qs.K, valueOf13, valueOf14, message11, valueOf15, valueOf16, Integer.valueOf(i34), Boolean.valueOf(z21));
                                                    gzVar10.getNotificationCenter().k(qs.L, Integer.valueOf(i33), Integer.valueOf(message11.id), message11, Long.valueOf(message11.dialog_id), Long.valueOf(j12), Integer.valueOf(i34), Boolean.valueOf(z21));
                                                    gzVar10.d0(i33);
                                                    gzVar10.i0(i33, z22);
                                                }
                                            });
                                        }
                                        r13 = 5;
                                    }
                                    z17 = r13;
                                    final gz gzVar92 = gz.this;
                                    yr messagesStorage2 = gzVar92.getMessagesStorage();
                                    long j102 = message10.random_id;
                                    long C13 = ij.C1(message10.peer_id);
                                    final int i282 = i27;
                                    boolean z192 = z17;
                                    messagesStorage2.a2(j102, C13, Integer.valueOf(i282), message10.id, 0, z192 ? 1 : 0, message10.quick_reply_shortcut_id);
                                    gzVar92.getMessagesStorage().j1(arrayList11, true, false, false, 0, false, z192 ? 1 : 0, message10.quick_reply_shortcut_id);
                                    if (ij.f3(message10)) {
                                    }
                                    final int[] iArr52 = iArr2;
                                    final int[] iArr62 = iArr;
                                    final boolean z202 = z16;
                                    final ij ijVar32 = ijVar;
                                    final SparseArray sparseArray52 = sparseArray4;
                                    final ArrayList arrayList152 = arrayList10;
                                    final long j112 = j3;
                                    final int i292 = p12;
                                    g0.h3(new Runnable() { // from class: org.telegram.messenger.bx
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            boolean z21;
                                            int i30;
                                            int[] iArr7 = iArr52;
                                            int i31 = iArr7[0] + 1;
                                            iArr7[0] = i31;
                                            int i32 = iArr62[0];
                                            gz gzVar10 = gz.this;
                                            boolean z22 = z202;
                                            boolean z23 = z18;
                                            if (i31 != i32 || z22 == z23) {
                                                z21 = z23;
                                            } else {
                                                long B02 = ij.B0(ijVar32.k);
                                                if (z23) {
                                                    SparseArray sparseArray6 = sparseArray52;
                                                    if (sparseArray6.size() > 1) {
                                                        i30 = sparseArray6.keyAt(0);
                                                        z21 = z23;
                                                        gzVar10.getMessagesController().b0(arrayList152, null, null, B02, false, z22 ? 1 : 0, false, 0L, null, 0, (z21 || z22) ? false : true, i30);
                                                    }
                                                }
                                                i30 = 0;
                                                z21 = z23;
                                                gzVar10.getMessagesController().b0(arrayList152, null, null, B02, false, z22 ? 1 : 0, false, 0L, null, 0, (z21 || z22) ? false : true, i30);
                                            }
                                            ui mediaDataController = gzVar10.getMediaDataController();
                                            TLRPC.Message message11 = message10;
                                            mediaDataController.w0(message11.dialog_id);
                                            qs notificationCenter4 = gzVar10.getNotificationCenter();
                                            int i33 = i282;
                                            Integer valueOf13 = Integer.valueOf(i33);
                                            Integer valueOf14 = Integer.valueOf(message11.id);
                                            Long valueOf15 = Long.valueOf(message11.dialog_id);
                                            long j12 = j112;
                                            Long valueOf16 = Long.valueOf(j12);
                                            int i34 = i292;
                                            notificationCenter4.k(qs.K, valueOf13, valueOf14, message11, valueOf15, valueOf16, Integer.valueOf(i34), Boolean.valueOf(z21));
                                            gzVar10.getNotificationCenter().k(qs.L, Integer.valueOf(i33), Integer.valueOf(message11.id), message11, Long.valueOf(message11.dialog_id), Long.valueOf(j12), Integer.valueOf(i34), Boolean.valueOf(z21));
                                            gzVar10.d0(i33);
                                            gzVar10.i0(i33, z22);
                                        }
                                    });
                                }
                            });
                            int i28 = i12 + 1;
                            z14 = z16;
                            z13 = z15;
                            iArr4 = iArr2;
                            iArr3 = iArr;
                            i22 = i7;
                            hVar7 = hVar;
                            arrayList6 = arrayList;
                            i23 = i28;
                            c11 = c12;
                        }
                    }
                    i7 = i22;
                    z10 = z14;
                    z9 = false;
                    Utilities.d.c(new kw(gzVar7, updates, 1));
                    tL_error = tL_error5;
                    r12 = z10;
                    gzVar = gzVar7;
                } else {
                    r12 = z12;
                    i7 = 2;
                    tL_error = tL_error3;
                    org.telegram.ui.Components.v4.c0(gzVar4.currentAccount, tL_error, null, tLObject2, new Object[0]);
                    z9 = true;
                    gzVar = gzVar4;
                }
                if (z9) {
                    int i29 = 0;
                    while (i29 < arrayList5.size()) {
                        ij ijVar3 = (ij) arrayList5.get(i29);
                        TLRPC.Message message10 = ijVar3.k;
                        gzVar.getMessagesStorage().N0(r12, message10);
                        int i30 = i7;
                        message10.send_state = i30;
                        if (r12 == 0 && tL_error != null && (str = tL_error.text) != null && str.startsWith("ALLOW_PAYMENT_REQUIRED_")) {
                            bi.ea.y(gzVar.currentAccount, false);
                            message10.errorAllowedPriceStars = bi.ea.o(tLObject2);
                            message10.errorNewPriceStars = Long.parseLong(tL_error.text.substring(23));
                            bi.ea.y(gzVar.currentAccount, false).d0(Arrays.asList(ijVar3));
                            gzVar.getMessagesStorage().X1(ij.B0(message10), message10);
                        }
                        gzVar.getNotificationCenter().k(23, Integer.valueOf(message10.id));
                        gzVar.d0(message10.id);
                        gzVar.i0(message10.id, r12);
                        i29++;
                        i7 = i30;
                    }
                    break;
                }
                break;
            default:
                gz gzVar9 = this.b;
                TLRPC.TL_error tL_error6 = this.c;
                TLRPC.Message message11 = (TLRPC.Message) this.h;
                TLObject tLObject3 = this.d;
                ij ijVar4 = (ij) this.n;
                boolean z17 = this.e;
                TLObject tLObject4 = this.f;
                if (tL_error6 != null) {
                    org.telegram.ui.Components.v4.c0(gzVar9.currentAccount, tL_error6, null, tLObject4, new Object[0]);
                    gzVar9.i0(message11.id, z17);
                    gzVar9.l0(ijVar4);
                    break;
                } else {
                    String str3 = message11.attachPath;
                    TLRPC.Updates updates2 = (TLRPC.Updates) tLObject3;
                    ArrayList<TLRPC.Update> arrayList14 = updates2.updates;
                    message11.send_state = 0;
                    ArrayList arrayList15 = new ArrayList();
                    arrayList15.add(message11);
                    gzVar9.getMessagesStorage().j1(arrayList15, false, true, false, 0, false, 0, 0L);
                    k00 k00Var = gzVar9.getMessagesController().q7;
                    TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) k00Var.e.f(k00.p(message11.id, -message11.dialog_id));
                    if (tL_forumTopic != null) {
                        tL_forumTopic.topMessage = message11;
                        k00Var.y(-message11.dialog_id, true);
                    }
                    Utilities.d.c(new ly(gzVar9, updates2, message11, z17, 1));
                    break;
                }
        }
    }

    public /* synthetic */ vx(gz gzVar, TLRPC.TL_error tL_error, TLRPC.Message message, TLObject tLObject, ij ijVar, String str, HashMap hashMap, boolean z9, TLObject tLObject2) {
        this.b = gzVar;
        this.c = tL_error;
        this.h = message;
        this.d = tLObject;
        this.n = ijVar;
        this.e = z9;
        this.f = tLObject2;
    }
}
