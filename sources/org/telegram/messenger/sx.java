package org.telegram.messenger;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_update;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final /* synthetic */ class sx implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ ez b;
    public final /* synthetic */ TLRPC.TL_error c;
    public final /* synthetic */ TLObject d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ TLObject f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object n;

    public /* synthetic */ sx(ez ezVar, TLRPC.TL_error tL_error, TLObject tLObject, boolean z10, ArrayList arrayList, ArrayList arrayList2, TLObject tLObject2) {
        this.b = ezVar;
        this.c = tL_error;
        this.d = tLObject;
        this.e = z10;
        this.h = arrayList;
        this.n = arrayList2;
        this.f = tLObject2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v30 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v61 */
    @Override // java.lang.Runnable
    public final void run() {
        ?? r12;
        int i7;
        TLRPC.TL_error tL_error;
        boolean z10;
        ez ezVar;
        String str;
        int i10;
        int i11;
        boolean z11;
        TLRPC.Message message;
        char c10;
        TLRPC.Message message2;
        gj gjVar;
        ArrayList arrayList;
        int i12;
        ArrayList arrayList2;
        ArrayList arrayList3;
        TLRPC.Message message3;
        int i13;
        a0.h hVar;
        final int[] iArr;
        int i14;
        SparseArray sparseArray;
        TLRPC.TL_error tL_error2;
        boolean z12;
        SparseArray sparseArray2;
        a0.h hVar2;
        ArrayList<TLRPC.Update> arrayList4;
        ArrayList arrayList5;
        int i15;
        String J1;
        TLRPC.MessageReplyHeader messageReplyHeader;
        a0.h hVar3;
        int i16;
        a0.h hVar4;
        a0.h hVar5 = null;
        switch (this.a) {
            case 0:
                ez ezVar2 = this.b;
                TLRPC.TL_error tL_error3 = this.c;
                TLObject tLObject = this.d;
                boolean z13 = this.e;
                ArrayList arrayList6 = (ArrayList) this.h;
                ArrayList arrayList7 = (ArrayList) this.n;
                TLObject tLObject2 = this.f;
                if (tL_error3 == null) {
                    SparseArray sparseArray3 = new SparseArray();
                    a0.h hVar6 = new a0.h();
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                    ArrayList<TLRPC.Update> arrayList8 = updates.updates;
                    ArrayList arrayList9 = new ArrayList();
                    int i17 = 0;
                    boolean z14 = z13;
                    ez ezVar3 = ezVar2;
                    while (i17 < arrayList8.size()) {
                        TLRPC.Update update = arrayList8.get(i17);
                        if (update instanceof TL_update.TL_updateMessageID) {
                            TL_update.TL_updateMessageID tL_updateMessageID = (TL_update.TL_updateMessageID) update;
                            hVar6.k(Integer.valueOf(tL_updateMessageID.id), tL_updateMessageID.random_id);
                            arrayList8.remove(i17);
                            i17--;
                            tL_error2 = tL_error3;
                        } else {
                            TLRPC.TL_error tL_error4 = tL_error3;
                            if (update instanceof TL_update.TL_updateNewMessage) {
                                TL_update.TL_updateNewMessage tL_updateNewMessage = (TL_update.TL_updateNewMessage) update;
                                TLRPC.Message message4 = tL_updateNewMessage.message;
                                sparseArray3.put(message4.id, message4);
                                tL_error2 = tL_error4;
                                Utilities.d.c(new gy(ezVar3, tL_updateNewMessage, 0));
                                arrayList8.remove(i17);
                                i17--;
                                z12 = z13;
                                sparseArray2 = sparseArray3;
                                hVar2 = hVar6;
                                arrayList4 = arrayList8;
                                arrayList5 = arrayList9;
                            } else {
                                tL_error2 = tL_error4;
                                if (update instanceof TL_update.TL_updateNewEphemeralMessage) {
                                    TL_update.TL_updateNewEphemeralMessage tL_updateNewEphemeralMessage = (TL_update.TL_updateNewEphemeralMessage) update;
                                    TLRPC.TL_message b10 = bg.w.b(tL_updateNewEphemeralMessage.message);
                                    sparseArray3.put(b10.id, b10);
                                    arrayList9.add(tL_updateNewEphemeralMessage.message);
                                    arrayList8.remove(i17);
                                    i17--;
                                } else {
                                    if (update instanceof TL_update.TL_updateNewChannelMessage) {
                                        TL_update.TL_updateNewChannelMessage tL_updateNewChannelMessage = (TL_update.TL_updateNewChannelMessage) update;
                                        long V1 = np.V1(tL_updateNewChannelMessage);
                                        TLRPC.Chat M0 = ezVar3.getMessagesController().M0(Long.valueOf(V1));
                                        if ((M0 == null || M0.megagroup) && (messageReplyHeader = tL_updateNewChannelMessage.message.reply_to) != null && (messageReplyHeader.reply_to_top_id != 0 || messageReplyHeader.reply_to_msg_id != 0)) {
                                            if (hVar5 == null) {
                                                hVar5 = new a0.h();
                                            }
                                            long B0 = gj.B0(tL_updateNewChannelMessage.message);
                                            SparseArray sparseArray4 = (SparseArray) hVar5.f(B0);
                                            if (sparseArray4 == null) {
                                                sparseArray4 = new SparseArray();
                                                hVar5.k(sparseArray4, B0);
                                            }
                                            TLRPC.MessageReplyHeader messageReplyHeader2 = tL_updateNewChannelMessage.message.reply_to;
                                            int i18 = messageReplyHeader2.reply_to_top_id;
                                            if (i18 == 0) {
                                                i18 = messageReplyHeader2.reply_to_msg_id;
                                            }
                                            TLRPC.MessageReplies messageReplies = (TLRPC.MessageReplies) sparseArray4.get(i18);
                                            if (messageReplies == null) {
                                                messageReplies = new TLRPC.TL_messageReplies();
                                                sparseArray4.put(i18, messageReplies);
                                            }
                                            TLRPC.Peer peer = tL_updateNewChannelMessage.message.from_id;
                                            if (peer != null) {
                                                hVar3 = hVar5;
                                                messageReplies.recent_repliers.add(0, peer);
                                            } else {
                                                hVar3 = hVar5;
                                            }
                                            messageReplies.replies++;
                                            hVar5 = hVar3;
                                        }
                                        TLRPC.Message message5 = tL_updateNewChannelMessage.message;
                                        sparseArray3.put(message5.id, message5);
                                        Utilities.d.c(new hy(ezVar3, tL_updateNewChannelMessage, 0));
                                        arrayList8.remove(i17);
                                        int i19 = i17 - 1;
                                        if (tL_updateNewChannelMessage.message.pinned) {
                                            ez ezVar4 = ezVar3;
                                            i16 = i19;
                                            arrayList4 = arrayList8;
                                            hVar4 = hVar6;
                                            arrayList5 = arrayList9;
                                            z12 = z13;
                                            sparseArray2 = sparseArray3;
                                            ezVar3 = ezVar4;
                                            Utilities.d.c(new gw(ezVar4, tL_updateNewChannelMessage, V1, 1));
                                        } else {
                                            i16 = i19;
                                            z12 = z13;
                                            sparseArray2 = sparseArray3;
                                            hVar4 = hVar6;
                                            arrayList4 = arrayList8;
                                            arrayList5 = arrayList9;
                                            ezVar3 = ezVar3;
                                        }
                                        hVar2 = hVar4;
                                        i17 = i16;
                                    } else {
                                        z12 = z13;
                                        sparseArray2 = sparseArray3;
                                        hVar2 = hVar6;
                                        arrayList4 = arrayList8;
                                        arrayList5 = arrayList9;
                                        if (update instanceof TL_update.TL_updateNewScheduledMessage) {
                                            TLRPC.Message message6 = ((TL_update.TL_updateNewScheduledMessage) update).message;
                                            sparseArray2.put(message6.id, message6);
                                            arrayList4.remove(i17);
                                            i17--;
                                            z14 = true;
                                        } else if (update instanceof TL_update.TL_updateQuickReplyMessage) {
                                            kg.v1 f10 = kg.v1.f(ezVar3.currentAccount);
                                            if (arrayList6.isEmpty()) {
                                                i15 = 0;
                                                J1 = null;
                                            } else {
                                                i15 = 0;
                                                J1 = gj.J1(((gj) arrayList6.get(0)).k);
                                            }
                                            f10.j(update, J1, (arrayList6.isEmpty() ? null : Integer.valueOf(gj.I1(((gj) arrayList6.get(i15)).k))).intValue());
                                            TLRPC.Message message7 = ((TL_update.TL_updateQuickReplyMessage) update).message;
                                            sparseArray2.put(message7.id, message7);
                                            arrayList4.remove(i17);
                                            i17--;
                                        }
                                    }
                                    i17++;
                                    arrayList8 = arrayList4;
                                    hVar6 = hVar2;
                                    sparseArray3 = sparseArray2;
                                    arrayList9 = arrayList5;
                                    z13 = z12;
                                    tL_error3 = tL_error2;
                                    ezVar3 = ezVar3;
                                }
                            }
                            z14 = false;
                            i17++;
                            arrayList8 = arrayList4;
                            hVar6 = hVar2;
                            sparseArray3 = sparseArray2;
                            arrayList9 = arrayList5;
                            z13 = z12;
                            tL_error3 = tL_error2;
                            ezVar3 = ezVar3;
                        }
                        z12 = z13;
                        sparseArray2 = sparseArray3;
                        hVar2 = hVar6;
                        arrayList4 = arrayList8;
                        arrayList5 = arrayList9;
                        i17++;
                        arrayList8 = arrayList4;
                        hVar6 = hVar2;
                        sparseArray3 = sparseArray2;
                        arrayList9 = arrayList5;
                        z13 = z12;
                        tL_error3 = tL_error2;
                        ezVar3 = ezVar3;
                    }
                    TLRPC.TL_error tL_error5 = tL_error3;
                    boolean z15 = z13;
                    final SparseArray sparseArray5 = sparseArray3;
                    a0.h hVar7 = hVar6;
                    ArrayList arrayList10 = arrayList9;
                    int i20 = 2;
                    if (arrayList10.isEmpty()) {
                        i10 = 1;
                    } else {
                        i10 = 1;
                        ezVar3.getMessagesStorage().f1(arrayList10, true);
                    }
                    char c11 = 3;
                    char c12 = 4;
                    if (hVar5 != null) {
                        ezVar3.getMessagesStorage().a1(null, null, hVar5, i10);
                        ns notificationCenter = ezVar3.getNotificationCenter();
                        Object[] objArr = new Object[4];
                        i11 = 0;
                        objArr[0] = null;
                        objArr[i10] = null;
                        objArr[2] = hVar5;
                        objArr[3] = Boolean.TRUE;
                        notificationCenter.k(77, objArr);
                    } else {
                        i11 = 0;
                    }
                    int[] iArr2 = new int[i10];
                    iArr2[i11] = i11;
                    int[] iArr3 = {i11};
                    final ArrayList arrayList11 = new ArrayList();
                    int i21 = 0;
                    ez ezVar5 = ezVar3;
                    while (i21 < arrayList6.size()) {
                        gj gjVar2 = (gj) arrayList6.get(i21);
                        String str2 = (String) arrayList7.get(i21);
                        TLRPC.Message message8 = gjVar2.k;
                        int i22 = message8.id;
                        char c13 = c11;
                        ArrayList arrayList12 = new ArrayList();
                        i7 = i20;
                        ArrayList arrayList13 = arrayList6;
                        Integer num = (Integer) hVar7.f(message8.random_id);
                        if (num == null || (message = (TLRPC.Message) sparseArray5.get(num.intValue())) == null) {
                            z11 = z15;
                            arrayList6 = arrayList13;
                            z10 = true;
                            Utilities.d.c(new hw(ezVar5, updates, 1));
                            tL_error = tL_error5;
                            r12 = z11;
                            ezVar = ezVar5;
                        } else {
                            gj.B0(message);
                            arrayList12.add(message);
                            if ((message.flags & 33554432) != 0) {
                                TLRPC.Message message9 = gjVar2.k;
                                c10 = c12;
                                message9.ttl_period = message.ttl_period;
                                message9.flags |= 33554432;
                            } else {
                                c10 = c12;
                            }
                            if (tLObject2 instanceof TLRPC.TL_messages_sendMedia) {
                                arrayList6 = arrayList13;
                                gj gjVar3 = (gj) arrayList6.get(0);
                                i12 = i21;
                                int i23 = message.id;
                                arrayList = arrayList12;
                                HashMap<String, String> hashMap = message.params;
                                arrayList2 = arrayList11;
                                i13 = i22;
                                message2 = message;
                                gjVar = gjVar2;
                                ArrayList arrayList14 = arrayList7;
                                message3 = message8;
                                ezVar5.z0(gjVar3, message2, i23, arrayList14, false, -1, hashMap);
                                arrayList3 = arrayList14;
                            } else {
                                message2 = message;
                                gjVar = gjVar2;
                                arrayList = arrayList12;
                                i12 = i21;
                                arrayList2 = arrayList11;
                                arrayList6 = arrayList13;
                                arrayList3 = arrayList7;
                                message3 = message8;
                                i13 = i22;
                                ezVar5.z0(gjVar, message2, message2.id, Collections.singletonList(str2), false, -1, message2.params);
                            }
                            final int o12 = gjVar.o1();
                            message3.id = message2.id;
                            int i24 = message2.quick_reply_shortcut_id;
                            message3.quick_reply_shortcut_id = i24;
                            if (i24 != 0) {
                                message3.flags |= TLObject.FLAG_30;
                            }
                            final long j3 = message2.grouped_id;
                            if (z15) {
                                hVar = hVar7;
                                iArr = iArr2;
                                i14 = i12;
                                sparseArray = sparseArray5;
                            } else {
                                hVar = hVar7;
                                iArr = iArr2;
                                Integer num2 = (Integer) ezVar5.getMessagesController().Q.get(Long.valueOf(message2.dialog_id));
                                if (num2 == null) {
                                    i14 = i12;
                                    sparseArray = sparseArray5;
                                    num2 = Integer.valueOf(ezVar5.getMessagesStorage().U(message2.dialog_id, message2.out));
                                    ezVar5.getMessagesController().Q.put(Long.valueOf(message2.dialog_id), num2);
                                } else {
                                    i14 = i12;
                                    sparseArray = sparseArray5;
                                }
                                message2.unread = num2.intValue() < message2.id;
                            }
                            iArr[0] = iArr[0] + 1;
                            arrayList2.add(Integer.valueOf(i13));
                            ezVar5.getStatsController().k(t0.f(), 1, 1);
                            message3.send_state = 0;
                            message3.errorAllowedPriceStars = 0L;
                            message3.errorNewPriceStars = 0L;
                            ns notificationCenter2 = ezVar5.getNotificationCenter();
                            Integer valueOf = Integer.valueOf(i13);
                            Integer valueOf2 = Integer.valueOf(message3.id);
                            Long valueOf3 = Long.valueOf(message3.dialog_id);
                            Long valueOf4 = Long.valueOf(j3);
                            Integer valueOf5 = Integer.valueOf(o12);
                            Boolean valueOf6 = Boolean.valueOf(z14);
                            ArrayList arrayList15 = arrayList2;
                            Object[] objArr2 = new Object[7];
                            objArr2[0] = valueOf;
                            objArr2[1] = valueOf2;
                            objArr2[i7] = message3;
                            objArr2[c13] = valueOf3;
                            objArr2[c10] = valueOf4;
                            objArr2[5] = valueOf5;
                            objArr2[6] = valueOf6;
                            notificationCenter2.k(21, objArr2);
                            ns notificationCenter3 = ezVar5.getNotificationCenter();
                            Integer valueOf7 = Integer.valueOf(i13);
                            Integer valueOf8 = Integer.valueOf(message3.id);
                            Long valueOf9 = Long.valueOf(message3.dialog_id);
                            Long valueOf10 = Long.valueOf(j3);
                            Integer valueOf11 = Integer.valueOf(o12);
                            Boolean valueOf12 = Boolean.valueOf(z14);
                            Object[] objArr3 = new Object[7];
                            objArr3[0] = valueOf7;
                            objArr3[1] = valueOf8;
                            objArr3[i7] = message3;
                            objArr3[c13] = valueOf9;
                            objArr3[c10] = valueOf10;
                            objArr3[5] = valueOf11;
                            objArr3[6] = valueOf12;
                            notificationCenter3.k(22, objArr3);
                            sparseArray5 = sparseArray;
                            final ez ezVar6 = ezVar5;
                            final boolean z16 = z14;
                            final int[] iArr4 = iArr3;
                            final boolean z17 = z15;
                            final ArrayList arrayList16 = arrayList;
                            final gj gjVar4 = gjVar;
                            final TLRPC.Message message10 = message3;
                            final int i25 = i13;
                            arrayList11 = arrayList15;
                            ezVar5 = ezVar6;
                            ezVar5.getMessagesStorage().a.c(new Runnable() { // from class: org.telegram.messenger.iy
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
                                    final TLRPC.Message message11 = message10;
                                    boolean d52 = gj.d5(message11);
                                    final boolean z19 = z16;
                                    if (d52) {
                                        r13 = 9;
                                    } else {
                                        if (message11.quick_reply_shortcut_id == 0 && message11.quick_reply_shortcut == null) {
                                            z18 = z19;
                                            final ez ezVar7 = ez.this;
                                            vr messagesStorage = ezVar7.getMessagesStorage();
                                            long j10 = message11.random_id;
                                            long B1 = gj.B1(message11.peer_id);
                                            final int i26 = i25;
                                            boolean z20 = z18;
                                            messagesStorage.a2(j10, B1, Integer.valueOf(i26), message11.id, 0, z20 ? 1 : 0, message11.quick_reply_shortcut_id);
                                            ezVar7.getMessagesStorage().j1(arrayList16, true, false, false, 0, false, z20 ? 1 : 0, message11.quick_reply_shortcut_id);
                                            if (gj.e3(message11)) {
                                                long B12 = gj.B1(message11.peer_id);
                                                ArrayList arrayList17 = new ArrayList(1);
                                                arrayList17.add(Integer.valueOf(message11.id));
                                                ezVar7.getMessagesStorage().P0(B12, arrayList17, false, false, z20 ? 1 : 0, (int) gj.Z1(ezVar7.currentAccount, message11, 0));
                                                ezVar7.getMessagesStorage().R1(B12, -B12, arrayList17, null);
                                                g0.h3(new nw(ezVar7, B12, arrayList17, 1));
                                            }
                                            final int[] iArr5 = iArr4;
                                            final int[] iArr6 = iArr;
                                            final boolean z21 = z17;
                                            final gj gjVar5 = gjVar4;
                                            final SparseArray sparseArray6 = sparseArray5;
                                            final ArrayList arrayList18 = arrayList11;
                                            final long j11 = j3;
                                            final int i27 = o12;
                                            g0.h3(new Runnable() { // from class: org.telegram.messenger.yw
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    boolean z22;
                                                    int i28;
                                                    int[] iArr7 = iArr5;
                                                    int i29 = iArr7[0] + 1;
                                                    iArr7[0] = i29;
                                                    int i30 = iArr6[0];
                                                    ez ezVar8 = ez.this;
                                                    boolean z23 = z21;
                                                    boolean z24 = z19;
                                                    if (i29 != i30 || z23 == z24) {
                                                        z22 = z24;
                                                    } else {
                                                        long B02 = gj.B0(gjVar5.k);
                                                        if (z24) {
                                                            SparseArray sparseArray7 = sparseArray6;
                                                            if (sparseArray7.size() > 1) {
                                                                i28 = sparseArray7.keyAt(0);
                                                                z22 = z24;
                                                                ezVar8.getMessagesController().b0(arrayList18, null, null, B02, false, z23 ? 1 : 0, false, 0L, null, 0, (z22 || z23) ? false : true, i28);
                                                            }
                                                        }
                                                        i28 = 0;
                                                        z22 = z24;
                                                        ezVar8.getMessagesController().b0(arrayList18, null, null, B02, false, z23 ? 1 : 0, false, 0L, null, 0, (z22 || z23) ? false : true, i28);
                                                    }
                                                    si mediaDataController = ezVar8.getMediaDataController();
                                                    TLRPC.Message message12 = message11;
                                                    mediaDataController.w0(message12.dialog_id);
                                                    ns notificationCenter4 = ezVar8.getNotificationCenter();
                                                    int i31 = i26;
                                                    Integer valueOf13 = Integer.valueOf(i31);
                                                    Integer valueOf14 = Integer.valueOf(message12.id);
                                                    Long valueOf15 = Long.valueOf(message12.dialog_id);
                                                    long j12 = j11;
                                                    Long valueOf16 = Long.valueOf(j12);
                                                    int i32 = i27;
                                                    notificationCenter4.k(ns.K, valueOf13, valueOf14, message12, valueOf15, valueOf16, Integer.valueOf(i32), Boolean.valueOf(z22));
                                                    ezVar8.getNotificationCenter().k(ns.L, Integer.valueOf(i31), Integer.valueOf(message12.id), message12, Long.valueOf(message12.dialog_id), Long.valueOf(j12), Integer.valueOf(i32), Boolean.valueOf(z22));
                                                    ezVar8.d0(i31);
                                                    ezVar8.i0(i31, z23);
                                                }
                                            });
                                        }
                                        r13 = 5;
                                    }
                                    z18 = r13;
                                    final ez ezVar72 = ez.this;
                                    vr messagesStorage2 = ezVar72.getMessagesStorage();
                                    long j102 = message11.random_id;
                                    long B13 = gj.B1(message11.peer_id);
                                    final int i262 = i25;
                                    boolean z202 = z18;
                                    messagesStorage2.a2(j102, B13, Integer.valueOf(i262), message11.id, 0, z202 ? 1 : 0, message11.quick_reply_shortcut_id);
                                    ezVar72.getMessagesStorage().j1(arrayList16, true, false, false, 0, false, z202 ? 1 : 0, message11.quick_reply_shortcut_id);
                                    if (gj.e3(message11)) {
                                    }
                                    final int[] iArr52 = iArr4;
                                    final int[] iArr62 = iArr;
                                    final boolean z212 = z17;
                                    final gj gjVar52 = gjVar4;
                                    final SparseArray sparseArray62 = sparseArray5;
                                    final ArrayList arrayList182 = arrayList11;
                                    final long j112 = j3;
                                    final int i272 = o12;
                                    g0.h3(new Runnable() { // from class: org.telegram.messenger.yw
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            boolean z22;
                                            int i28;
                                            int[] iArr7 = iArr52;
                                            int i29 = iArr7[0] + 1;
                                            iArr7[0] = i29;
                                            int i30 = iArr62[0];
                                            ez ezVar8 = ez.this;
                                            boolean z23 = z212;
                                            boolean z24 = z19;
                                            if (i29 != i30 || z23 == z24) {
                                                z22 = z24;
                                            } else {
                                                long B02 = gj.B0(gjVar52.k);
                                                if (z24) {
                                                    SparseArray sparseArray7 = sparseArray62;
                                                    if (sparseArray7.size() > 1) {
                                                        i28 = sparseArray7.keyAt(0);
                                                        z22 = z24;
                                                        ezVar8.getMessagesController().b0(arrayList182, null, null, B02, false, z23 ? 1 : 0, false, 0L, null, 0, (z22 || z23) ? false : true, i28);
                                                    }
                                                }
                                                i28 = 0;
                                                z22 = z24;
                                                ezVar8.getMessagesController().b0(arrayList182, null, null, B02, false, z23 ? 1 : 0, false, 0L, null, 0, (z22 || z23) ? false : true, i28);
                                            }
                                            si mediaDataController = ezVar8.getMediaDataController();
                                            TLRPC.Message message12 = message11;
                                            mediaDataController.w0(message12.dialog_id);
                                            ns notificationCenter4 = ezVar8.getNotificationCenter();
                                            int i31 = i262;
                                            Integer valueOf13 = Integer.valueOf(i31);
                                            Integer valueOf14 = Integer.valueOf(message12.id);
                                            Long valueOf15 = Long.valueOf(message12.dialog_id);
                                            long j12 = j112;
                                            Long valueOf16 = Long.valueOf(j12);
                                            int i32 = i272;
                                            notificationCenter4.k(ns.K, valueOf13, valueOf14, message12, valueOf15, valueOf16, Integer.valueOf(i32), Boolean.valueOf(z22));
                                            ezVar8.getNotificationCenter().k(ns.L, Integer.valueOf(i31), Integer.valueOf(message12.id), message12, Long.valueOf(message12.dialog_id), Long.valueOf(j12), Integer.valueOf(i32), Boolean.valueOf(z22));
                                            ezVar8.d0(i31);
                                            ezVar8.i0(i31, z23);
                                        }
                                    });
                                }
                            });
                            i21 = i14 + 1;
                            z15 = z17;
                            z14 = z16;
                            iArr3 = iArr4;
                            iArr2 = iArr;
                            c11 = c13;
                            arrayList7 = arrayList3;
                            i20 = i7;
                            c12 = c10;
                            hVar7 = hVar;
                        }
                    }
                    i7 = i20;
                    z11 = z15;
                    z10 = false;
                    Utilities.d.c(new hw(ezVar5, updates, 1));
                    tL_error = tL_error5;
                    r12 = z11;
                    ezVar = ezVar5;
                } else {
                    r12 = z13;
                    i7 = 2;
                    tL_error = tL_error3;
                    org.telegram.ui.Components.t4.c0(ezVar2.currentAccount, tL_error, null, tLObject2, new Object[0]);
                    z10 = true;
                    ezVar = ezVar2;
                }
                if (z10) {
                    int i26 = 0;
                    while (i26 < arrayList6.size()) {
                        gj gjVar5 = (gj) arrayList6.get(i26);
                        TLRPC.Message message11 = gjVar5.k;
                        ezVar.getMessagesStorage().N0(r12, message11);
                        int i27 = i7;
                        message11.send_state = i27;
                        if (r12 == 0 && tL_error != null && (str = tL_error.text) != null && str.startsWith("ALLOW_PAYMENT_REQUIRED_")) {
                            di.u8.y(ezVar.currentAccount, false);
                            message11.errorAllowedPriceStars = di.u8.o(tLObject2);
                            message11.errorNewPriceStars = Long.parseLong(tL_error.text.substring(23));
                            di.u8.y(ezVar.currentAccount, false).d0(Arrays.asList(gjVar5));
                            ezVar.getMessagesStorage().X1(gj.B0(message11), message11);
                        }
                        ezVar.getNotificationCenter().k(23, Integer.valueOf(message11.id));
                        ezVar.d0(message11.id);
                        ezVar.i0(message11.id, r12);
                        i26++;
                        i7 = i27;
                    }
                    break;
                }
                break;
            default:
                ez ezVar7 = this.b;
                TLRPC.TL_error tL_error6 = this.c;
                TLRPC.Message message12 = (TLRPC.Message) this.h;
                TLObject tLObject3 = this.d;
                gj gjVar6 = (gj) this.n;
                boolean z18 = this.e;
                TLObject tLObject4 = this.f;
                if (tL_error6 != null) {
                    org.telegram.ui.Components.t4.c0(ezVar7.currentAccount, tL_error6, null, tLObject4, new Object[0]);
                    ezVar7.i0(message12.id, z18);
                    ezVar7.l0(gjVar6);
                    break;
                } else {
                    String str3 = message12.attachPath;
                    TLRPC.Updates updates2 = (TLRPC.Updates) tLObject3;
                    ArrayList<TLRPC.Update> arrayList17 = updates2.updates;
                    message12.send_state = 0;
                    ArrayList arrayList18 = new ArrayList();
                    arrayList18.add(message12);
                    ezVar7.getMessagesStorage().j1(arrayList18, false, true, false, 0, false, 0, 0L);
                    h00 h00Var = ezVar7.getMessagesController().r7;
                    TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) h00Var.e.f(h00.p(message12.id, -message12.dialog_id));
                    if (tL_forumTopic != null) {
                        tL_forumTopic.topMessage = message12;
                        h00Var.y(-message12.dialog_id, true);
                    }
                    Utilities.d.c(new jy(ezVar7, updates2, message12, z18, 1));
                    break;
                }
        }
    }

    public /* synthetic */ sx(ez ezVar, TLRPC.TL_error tL_error, TLRPC.Message message, TLObject tLObject, gj gjVar, String str, HashMap hashMap, boolean z10, TLObject tLObject2) {
        this.b = ezVar;
        this.c = tL_error;
        this.h = message;
        this.d = tLObject;
        this.n = gjVar;
        this.e = z10;
        this.f = tLObject2;
    }
}
