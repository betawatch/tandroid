// default package

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.SparseArray;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final /* synthetic */ class d6a implements Runnable {
    public final /* synthetic */ byte a = 3;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object n;

    public /* synthetic */ d6a(mg2 mg2Var, TLRPC.TL_error tL_error, TLObject tLObject, int[] iArr, ArrayList arrayList, boolean z, TLRPC.User user) {
        this.b = mg2Var;
        this.c = tL_error;
        this.d = tLObject;
        this.f = iArr;
        this.h = arrayList;
        this.e = z;
        this.n = user;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v49 */
    @Override // java.lang.Runnable
    public final void run() {
        ?? r4;
        int i;
        boolean z;
        r7a r7aVar;
        String str;
        int i2;
        boolean z2;
        boolean z3;
        TLRPC.Message message;
        zh6 zh6Var;
        int i3;
        final r47 r47Var;
        ArrayList arrayList;
        final SparseArray sparseArray;
        ArrayList arrayList2;
        char c;
        boolean z4;
        r7a r7aVar2;
        zh6 zh6Var2;
        ArrayList<TLRPC.Update> arrayList3;
        ArrayList arrayList4;
        int i4;
        String J1;
        int i5;
        TLRPC.MessageReplyHeader messageReplyHeader;
        zh6 zh6Var3;
        byte b;
        r7a r7aVar3;
        ArrayList arrayList5;
        int i6 = 1;
        switch (this.a) {
            case 0:
                r7a r7aVar4 = (r7a) this.b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.c;
                TLObject tLObject = (TLObject) this.d;
                boolean z5 = this.e;
                ArrayList arrayList6 = (ArrayList) this.h;
                ArrayList arrayList7 = (ArrayList) this.n;
                TLObject tLObject2 = (TLObject) this.f;
                if (tL_error == null) {
                    SparseArray sparseArray2 = new SparseArray();
                    zh6 zh6Var4 = new zh6();
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                    ArrayList<TLRPC.Update> arrayList8 = updates.updates;
                    ArrayList arrayList9 = new ArrayList();
                    final boolean z6 = z5;
                    int i7 = 0;
                    zh6 zh6Var5 = null;
                    r7a r7aVar5 = r7aVar4;
                    while (i7 < arrayList8.size()) {
                        TLRPC.Update update = arrayList8.get(i7);
                        if (update instanceof TL_update.TL_updateMessageID) {
                            TL_update.TL_updateMessageID tL_updateMessageID = (TL_update.TL_updateMessageID) update;
                            zh6Var4.k(tL_updateMessageID.random_id, Integer.valueOf(tL_updateMessageID.id));
                            arrayList8.remove(i7);
                            i7--;
                            z4 = z5;
                            zh6Var2 = zh6Var4;
                            arrayList3 = arrayList8;
                            arrayList4 = arrayList9;
                            r7aVar2 = r7aVar5;
                        } else {
                            r7a r7aVar6 = r7aVar5;
                            if (update instanceof TL_update.TL_updateNewMessage) {
                                TL_update.TL_updateNewMessage tL_updateNewMessage = (TL_update.TL_updateNewMessage) update;
                                TLRPC.Message message2 = tL_updateNewMessage.message;
                                sparseArray2.put(message2.id, message2);
                                z4 = z5;
                                Utilities.d.c(new h5a(r7aVar6, tL_updateNewMessage, (byte) 1));
                                arrayList8.remove(i7);
                                i7--;
                                r7aVar2 = r7aVar6;
                                zh6Var2 = zh6Var4;
                                arrayList3 = arrayList8;
                                arrayList4 = arrayList9;
                            } else {
                                z4 = z5;
                                if (update instanceof TL_update.TL_updateNewEphemeralMessage) {
                                    TL_update.TL_updateNewEphemeralMessage tL_updateNewEphemeralMessage = (TL_update.TL_updateNewEphemeralMessage) update;
                                    TLRPC.TL_message b2 = o44.b(tL_updateNewEphemeralMessage.message);
                                    sparseArray2.put(b2.id, b2);
                                    arrayList9.add(tL_updateNewEphemeralMessage.message);
                                    arrayList8.remove(i7);
                                    i7--;
                                    r7aVar2 = r7aVar6;
                                    zh6Var2 = zh6Var4;
                                    arrayList3 = arrayList8;
                                    arrayList4 = arrayList9;
                                } else if (update instanceof TL_update.TL_updateNewChannelMessage) {
                                    TL_update.TL_updateNewChannelMessage tL_updateNewChannelMessage = (TL_update.TL_updateNewChannelMessage) update;
                                    long S1 = uc7.S1(tL_updateNewChannelMessage);
                                    TLRPC.Chat M0 = r7aVar6.getMessagesController().M0(Long.valueOf(S1));
                                    if ((M0 != null && !M0.megagroup) || (messageReplyHeader = tL_updateNewChannelMessage.message.reply_to) == null || (messageReplyHeader.reply_to_top_id == 0 && messageReplyHeader.reply_to_msg_id == 0)) {
                                        zh6Var3 = zh6Var4;
                                        b = 1;
                                    } else {
                                        if (zh6Var5 == null) {
                                            zh6Var5 = new zh6();
                                        }
                                        long B0 = r47.B0(tL_updateNewChannelMessage.message);
                                        SparseArray sparseArray3 = (SparseArray) zh6Var5.f(B0);
                                        if (sparseArray3 == null) {
                                            sparseArray3 = new SparseArray();
                                            zh6Var5.k(B0, sparseArray3);
                                        }
                                        TLRPC.MessageReplyHeader messageReplyHeader2 = tL_updateNewChannelMessage.message.reply_to;
                                        int i8 = messageReplyHeader2.reply_to_top_id;
                                        if (i8 == 0) {
                                            i8 = messageReplyHeader2.reply_to_msg_id;
                                        }
                                        TLRPC.MessageReplies messageReplies = (TLRPC.MessageReplies) sparseArray3.get(i8);
                                        if (messageReplies == null) {
                                            messageReplies = new TLRPC.TL_messageReplies();
                                            sparseArray3.put(i8, messageReplies);
                                        }
                                        TLRPC.Peer peer = tL_updateNewChannelMessage.message.from_id;
                                        if (peer != null) {
                                            zh6Var3 = zh6Var4;
                                            messageReplies.recent_repliers.add(0, peer);
                                        } else {
                                            zh6Var3 = zh6Var4;
                                        }
                                        b = 1;
                                        messageReplies.replies++;
                                    }
                                    zh6 zh6Var6 = zh6Var5;
                                    TLRPC.Message message3 = tL_updateNewChannelMessage.message;
                                    sparseArray2.put(message3.id, message3);
                                    Utilities.d.c(new i5a(r7aVar6, tL_updateNewChannelMessage, b));
                                    arrayList8.remove(i7);
                                    int i9 = i7 - 1;
                                    if (tL_updateNewChannelMessage.message.pinned) {
                                        arrayList3 = arrayList8;
                                        arrayList4 = arrayList9;
                                        zh6Var2 = zh6Var3;
                                        r7aVar3 = r7aVar6;
                                        Utilities.d.c(new j5a(r7aVar6, tL_updateNewChannelMessage, S1, (byte) 1));
                                    } else {
                                        r7aVar3 = r7aVar6;
                                        arrayList3 = arrayList8;
                                        arrayList4 = arrayList9;
                                        zh6Var2 = zh6Var3;
                                    }
                                    zh6Var5 = zh6Var6;
                                    i7 = i9;
                                    r7aVar2 = r7aVar3;
                                } else {
                                    r7aVar2 = r7aVar6;
                                    zh6Var2 = zh6Var4;
                                    arrayList3 = arrayList8;
                                    arrayList4 = arrayList9;
                                    if (update instanceof TL_update.TL_updateNewScheduledMessage) {
                                        TLRPC.Message message4 = ((TL_update.TL_updateNewScheduledMessage) update).message;
                                        sparseArray2.put(message4.id, message4);
                                        arrayList3.remove(i7);
                                        i7--;
                                        i5 = 1;
                                        z6 = true;
                                        i7 += i5;
                                        zh6Var4 = zh6Var2;
                                        arrayList8 = arrayList3;
                                        i6 = i5;
                                        arrayList9 = arrayList4;
                                        z5 = z4;
                                        r7aVar5 = r7aVar2;
                                    } else {
                                        r7aVar2 = r7aVar2;
                                        if (update instanceof TL_update.TL_updateQuickReplyMessage) {
                                            b19 f = b19.f(r7aVar2.currentAccount);
                                            if (arrayList6.isEmpty()) {
                                                J1 = null;
                                                i4 = 0;
                                            } else {
                                                i4 = 0;
                                                J1 = r47.J1(((r47) arrayList6.get(0)).k);
                                            }
                                            f.j(update, J1, (arrayList6.isEmpty() ? null : Integer.valueOf(r47.I1(((r47) arrayList6.get(i4)).k))).intValue());
                                            TLRPC.Message message5 = ((TL_update.TL_updateQuickReplyMessage) update).message;
                                            sparseArray2.put(message5.id, message5);
                                            arrayList3.remove(i7);
                                            i7--;
                                            r7aVar2 = r7aVar2;
                                        }
                                    }
                                }
                            }
                            i5 = 1;
                            z6 = false;
                            i7 += i5;
                            zh6Var4 = zh6Var2;
                            arrayList8 = arrayList3;
                            i6 = i5;
                            arrayList9 = arrayList4;
                            z5 = z4;
                            r7aVar5 = r7aVar2;
                        }
                        i5 = 1;
                        i7 += i5;
                        zh6Var4 = zh6Var2;
                        arrayList8 = arrayList3;
                        i6 = i5;
                        arrayList9 = arrayList4;
                        z5 = z4;
                        r7aVar5 = r7aVar2;
                    }
                    final boolean z7 = z5;
                    int i10 = i6;
                    zh6 zh6Var7 = zh6Var4;
                    ArrayList arrayList10 = arrayList9;
                    i = 2;
                    if (!arrayList10.isEmpty()) {
                        r7aVar5.getMessagesStorage().c1(arrayList10, i10);
                    }
                    char c2 = 3;
                    if (zh6Var5 != null) {
                        r7aVar5.getMessagesStorage().X0(null, null, zh6Var5, i10);
                        jn7 notificationCenter = r7aVar5.getNotificationCenter();
                        Object[] objArr = new Object[4];
                        i2 = 0;
                        objArr[0] = null;
                        objArr[i10] = null;
                        objArr[2] = zh6Var5;
                        objArr[3] = Boolean.TRUE;
                        notificationCenter.k(78, objArr);
                    } else {
                        i2 = 0;
                    }
                    int[] iArr = new int[i10];
                    iArr[i2] = i2;
                    final int[] iArr2 = {i2};
                    final ArrayList arrayList11 = new ArrayList();
                    int i11 = 0;
                    r7a r7aVar7 = r7aVar5;
                    while (i11 < arrayList6.size()) {
                        r47 r47Var2 = (r47) arrayList6.get(i11);
                        String str2 = (String) arrayList7.get(i11);
                        char c3 = c2;
                        final TLRPC.Message message6 = r47Var2.k;
                        final int i12 = message6.id;
                        final ArrayList arrayList12 = new ArrayList();
                        final int[] iArr3 = iArr;
                        Integer num = (Integer) zh6Var7.f(message6.random_id);
                        if (num == null || (message = (TLRPC.Message) sparseArray2.get(num.intValue())) == null) {
                            z2 = z7;
                            z3 = true;
                            Utilities.d.c(new k5a(r7aVar7, updates, (byte) 1));
                            z = z3;
                            r4 = z2;
                            r7aVar = r7aVar7;
                        } else {
                            r47.B0(message);
                            arrayList12.add(message);
                            if ((message.flags & 33554432) != 0) {
                                TLRPC.Message message7 = r47Var2.k;
                                zh6Var = zh6Var7;
                                message7.ttl_period = message.ttl_period;
                                message7.flags |= 33554432;
                            } else {
                                zh6Var = zh6Var7;
                            }
                            if (tLObject2 instanceof TLRPC.TL_messages_sendMedia) {
                                r47Var = r47Var2;
                                ArrayList arrayList13 = arrayList7;
                                sparseArray = sparseArray2;
                                i3 = i11;
                                arrayList2 = arrayList11;
                                c = 4;
                                r7aVar7.y0((r47) arrayList6.get(0), message, message.id, arrayList13, false, -1, message.params);
                                arrayList = arrayList13;
                            } else {
                                i3 = i11;
                                r47Var = r47Var2;
                                arrayList = arrayList7;
                                sparseArray = sparseArray2;
                                arrayList2 = arrayList11;
                                c = 4;
                                r7aVar7.y0(r47Var, message, message.id, Collections.singletonList(str2), false, -1, message.params);
                            }
                            final int o1 = r47Var.o1();
                            message6.id = message.id;
                            int i13 = message.quick_reply_shortcut_id;
                            message6.quick_reply_shortcut_id = i13;
                            if (i13 != 0) {
                                message6.flags |= TLObject.FLAG_30;
                            }
                            final long j = message.grouped_id;
                            if (!z7) {
                                Integer num2 = (Integer) r7aVar7.getMessagesController().Q.get(Long.valueOf(message.dialog_id));
                                if (num2 == null) {
                                    num2 = Integer.valueOf(r7aVar7.getMessagesStorage().S(message.dialog_id, message.out));
                                    r7aVar7.getMessagesController().Q.put(Long.valueOf(message.dialog_id), num2);
                                }
                                message.unread = num2.intValue() < message.id;
                            }
                            iArr3[0] = iArr3[0] + 1;
                            arrayList2.add(Integer.valueOf(i12));
                            r7aVar7.getStatsController().i(a.f(), 1, 1);
                            message6.send_state = 0;
                            message6.errorAllowedPriceStars = 0L;
                            message6.errorNewPriceStars = 0L;
                            jn7 notificationCenter2 = r7aVar7.getNotificationCenter();
                            Integer valueOf = Integer.valueOf(i12);
                            Integer valueOf2 = Integer.valueOf(message6.id);
                            Long valueOf3 = Long.valueOf(message6.dialog_id);
                            Long valueOf4 = Long.valueOf(j);
                            Integer valueOf5 = Integer.valueOf(o1);
                            Boolean valueOf6 = Boolean.valueOf(z6);
                            arrayList11 = arrayList2;
                            final r7a r7aVar8 = r7aVar7;
                            Object[] objArr2 = new Object[7];
                            objArr2[0] = valueOf;
                            objArr2[1] = valueOf2;
                            objArr2[2] = message6;
                            objArr2[c3] = valueOf3;
                            objArr2[c] = valueOf4;
                            objArr2[5] = valueOf5;
                            objArr2[6] = valueOf6;
                            notificationCenter2.k(21, objArr2);
                            jn7 notificationCenter3 = r7aVar8.getNotificationCenter();
                            Integer valueOf7 = Integer.valueOf(i12);
                            Integer valueOf8 = Integer.valueOf(message6.id);
                            Long valueOf9 = Long.valueOf(message6.dialog_id);
                            Long valueOf10 = Long.valueOf(j);
                            Integer valueOf11 = Integer.valueOf(o1);
                            Boolean valueOf12 = Boolean.valueOf(z6);
                            Object[] objArr3 = new Object[7];
                            objArr3[0] = valueOf7;
                            objArr3[1] = valueOf8;
                            objArr3[2] = message6;
                            objArr3[c3] = valueOf9;
                            objArr3[c] = valueOf10;
                            objArr3[5] = valueOf11;
                            objArr3[6] = valueOf12;
                            notificationCenter3.k(22, objArr3);
                            r7aVar7 = r7aVar8;
                            r7aVar8.getMessagesStorage().a.c(new Runnable() { // from class: q6a
                                /* JADX WARN: Multi-variable type inference failed */
                                /* JADX WARN: Removed duplicated region for block: B:7:0x0061  */
                                /* JADX WARN: Type inference failed for: r1v2 */
                                /* JADX WARN: Type inference failed for: r1v5 */
                                /* JADX WARN: Type inference failed for: r1v6 */
                                @Override // java.lang.Runnable
                                /*
                                    Code decompiled incorrectly, please refer to instructions dump.
                                */
                                public final void run() {
                                    ?? r1;
                                    boolean z8;
                                    final TLRPC.Message message8 = message6;
                                    boolean c5 = r47.c5(message8);
                                    final boolean z9 = z6;
                                    if (c5) {
                                        r1 = 9;
                                    } else {
                                        if (message8.quick_reply_shortcut_id == 0 && message8.quick_reply_shortcut == null) {
                                            z8 = z9;
                                            final r7a r7aVar9 = r7a.this;
                                            jf7 messagesStorage = r7aVar9.getMessagesStorage();
                                            long j2 = message8.random_id;
                                            long B1 = r47.B1(message8.peer_id);
                                            final int i14 = i12;
                                            boolean z10 = z8;
                                            messagesStorage.X1(j2, B1, Integer.valueOf(i14), message8.id, 0, z10 ? 1 : 0, message8.quick_reply_shortcut_id);
                                            r7aVar9.getMessagesStorage().g1(arrayList12, true, false, false, 0, false, z10 ? 1 : 0, message8.quick_reply_shortcut_id);
                                            if (r47.e3(message8)) {
                                                long B12 = r47.B1(message8.peer_id);
                                                ArrayList arrayList14 = new ArrayList(1);
                                                arrayList14.add(Integer.valueOf(message8.id));
                                                r7aVar9.getMessagesStorage().M0(B12, arrayList14, false, false, z10 ? 1 : 0, (int) r47.Z1(r7aVar9.currentAccount, message8, 0));
                                                r7aVar9.getMessagesStorage().O1(B12, -B12, arrayList14, null);
                                                hl.c3(new p5a(r7aVar9, B12, arrayList14, (byte) 2));
                                            }
                                            final int[] iArr4 = iArr2;
                                            final int[] iArr5 = iArr3;
                                            final boolean z11 = z7;
                                            final r47 r47Var3 = r47Var;
                                            final SparseArray sparseArray4 = sparseArray;
                                            final ArrayList arrayList15 = arrayList11;
                                            final long j3 = j;
                                            final int i15 = o1;
                                            hl.c3(new Runnable() { // from class: d5a
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    boolean z12;
                                                    int i16;
                                                    int[] iArr6 = iArr4;
                                                    int i17 = iArr6[0] + 1;
                                                    iArr6[0] = i17;
                                                    int i18 = iArr5[0];
                                                    r7a r7aVar10 = r7a.this;
                                                    boolean z13 = z11;
                                                    boolean z14 = z9;
                                                    if (i17 != i18 || z13 == z14) {
                                                        z12 = z14;
                                                    } else {
                                                        long B02 = r47.B0(r47Var3.k);
                                                        if (z14) {
                                                            SparseArray sparseArray5 = sparseArray4;
                                                            if (sparseArray5.size() > 1) {
                                                                i16 = sparseArray5.keyAt(0);
                                                                z12 = z14;
                                                                r7aVar10.getMessagesController().Z(arrayList15, null, null, B02, false, z13 ? 1 : 0, false, 0L, null, 0, (z12 || z13) ? false : true, i16);
                                                            }
                                                        }
                                                        i16 = 0;
                                                        z12 = z14;
                                                        r7aVar10.getMessagesController().Z(arrayList15, null, null, B02, false, z13 ? 1 : 0, false, 0L, null, 0, (z12 || z13) ? false : true, i16);
                                                    }
                                                    ls6 mediaDataController = r7aVar10.getMediaDataController();
                                                    TLRPC.Message message9 = message8;
                                                    mediaDataController.x0(message9.dialog_id);
                                                    jn7 notificationCenter4 = r7aVar10.getNotificationCenter();
                                                    int i19 = i14;
                                                    Integer valueOf13 = Integer.valueOf(i19);
                                                    Integer valueOf14 = Integer.valueOf(message9.id);
                                                    Long valueOf15 = Long.valueOf(message9.dialog_id);
                                                    long j4 = j3;
                                                    Long valueOf16 = Long.valueOf(j4);
                                                    int i20 = i15;
                                                    notificationCenter4.k(jn7.J, valueOf13, valueOf14, message9, valueOf15, valueOf16, Integer.valueOf(i20), Boolean.valueOf(z12));
                                                    r7aVar10.getNotificationCenter().k(jn7.K, Integer.valueOf(i19), Integer.valueOf(message9.id), message9, Long.valueOf(message9.dialog_id), Long.valueOf(j4), Integer.valueOf(i20), Boolean.valueOf(z12));
                                                    r7aVar10.c0(i19);
                                                    r7aVar10.h0(i19, z13);
                                                }
                                            });
                                        }
                                        r1 = 5;
                                    }
                                    z8 = r1;
                                    final r7a r7aVar92 = r7a.this;
                                    jf7 messagesStorage2 = r7aVar92.getMessagesStorage();
                                    long j22 = message8.random_id;
                                    long B13 = r47.B1(message8.peer_id);
                                    final int i142 = i12;
                                    boolean z102 = z8;
                                    messagesStorage2.X1(j22, B13, Integer.valueOf(i142), message8.id, 0, z102 ? 1 : 0, message8.quick_reply_shortcut_id);
                                    r7aVar92.getMessagesStorage().g1(arrayList12, true, false, false, 0, false, z102 ? 1 : 0, message8.quick_reply_shortcut_id);
                                    if (r47.e3(message8)) {
                                    }
                                    final int[] iArr42 = iArr2;
                                    final int[] iArr52 = iArr3;
                                    final boolean z112 = z7;
                                    final r47 r47Var32 = r47Var;
                                    final SparseArray sparseArray42 = sparseArray;
                                    final ArrayList arrayList152 = arrayList11;
                                    final long j32 = j;
                                    final int i152 = o1;
                                    hl.c3(new Runnable() { // from class: d5a
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            boolean z12;
                                            int i16;
                                            int[] iArr6 = iArr42;
                                            int i17 = iArr6[0] + 1;
                                            iArr6[0] = i17;
                                            int i18 = iArr52[0];
                                            r7a r7aVar10 = r7a.this;
                                            boolean z13 = z112;
                                            boolean z14 = z9;
                                            if (i17 != i18 || z13 == z14) {
                                                z12 = z14;
                                            } else {
                                                long B02 = r47.B0(r47Var32.k);
                                                if (z14) {
                                                    SparseArray sparseArray5 = sparseArray42;
                                                    if (sparseArray5.size() > 1) {
                                                        i16 = sparseArray5.keyAt(0);
                                                        z12 = z14;
                                                        r7aVar10.getMessagesController().Z(arrayList152, null, null, B02, false, z13 ? 1 : 0, false, 0L, null, 0, (z12 || z13) ? false : true, i16);
                                                    }
                                                }
                                                i16 = 0;
                                                z12 = z14;
                                                r7aVar10.getMessagesController().Z(arrayList152, null, null, B02, false, z13 ? 1 : 0, false, 0L, null, 0, (z12 || z13) ? false : true, i16);
                                            }
                                            ls6 mediaDataController = r7aVar10.getMediaDataController();
                                            TLRPC.Message message9 = message8;
                                            mediaDataController.x0(message9.dialog_id);
                                            jn7 notificationCenter4 = r7aVar10.getNotificationCenter();
                                            int i19 = i142;
                                            Integer valueOf13 = Integer.valueOf(i19);
                                            Integer valueOf14 = Integer.valueOf(message9.id);
                                            Long valueOf15 = Long.valueOf(message9.dialog_id);
                                            long j4 = j32;
                                            Long valueOf16 = Long.valueOf(j4);
                                            int i20 = i152;
                                            notificationCenter4.k(jn7.J, valueOf13, valueOf14, message9, valueOf15, valueOf16, Integer.valueOf(i20), Boolean.valueOf(z12));
                                            r7aVar10.getNotificationCenter().k(jn7.K, Integer.valueOf(i19), Integer.valueOf(message9.id), message9, Long.valueOf(message9.dialog_id), Long.valueOf(j4), Integer.valueOf(i20), Boolean.valueOf(z12));
                                            r7aVar10.c0(i19);
                                            r7aVar10.h0(i19, z13);
                                        }
                                    });
                                }
                            });
                            i11 = i3 + 1;
                            c2 = c3;
                            iArr = iArr3;
                            sparseArray2 = sparseArray;
                            zh6Var7 = zh6Var;
                            arrayList7 = arrayList;
                        }
                    }
                    z2 = z7;
                    z3 = false;
                    Utilities.d.c(new k5a(r7aVar7, updates, (byte) 1));
                    z = z3;
                    r4 = z2;
                    r7aVar = r7aVar7;
                } else {
                    r4 = z5;
                    i = 2;
                    jj.c0(r7aVar4.currentAccount, tL_error, null, tLObject2, new Object[0]);
                    z = true;
                    r7aVar = r7aVar4;
                }
                if (z) {
                    int i14 = 0;
                    while (i14 < arrayList6.size()) {
                        r47 r47Var3 = (r47) arrayList6.get(i14);
                        TLRPC.Message message8 = r47Var3.k;
                        r7aVar.getMessagesStorage().K0(r4, message8);
                        int i15 = i;
                        message8.send_state = i15;
                        if (r4 == 0 && tL_error != null && (str = tL_error.text) != null && str.startsWith("ALLOW_PAYMENT_REQUIRED_")) {
                            jxa.v(r7aVar.currentAccount, false);
                            message8.errorAllowedPriceStars = jxa.l(tLObject2);
                            message8.errorNewPriceStars = Long.parseLong(tL_error.text.substring(23));
                            jxa.v(r7aVar.currentAccount, false).e0(Arrays.asList(r47Var3));
                            r7aVar.getMessagesStorage().U1(r47.B0(message8), message8);
                        }
                        r7aVar.getNotificationCenter().k(23, Integer.valueOf(message8.id));
                        r7aVar.c0(message8.id);
                        r7aVar.h0(message8.id, r4);
                        i14++;
                        i = i15;
                    }
                    break;
                }
                break;
            case 1:
                r7a r7aVar9 = (r7a) this.b;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.c;
                TLRPC.Message message9 = (TLRPC.Message) this.h;
                TLObject tLObject3 = (TLObject) this.d;
                r47 r47Var4 = (r47) this.n;
                boolean z8 = this.e;
                TLObject tLObject4 = (TLObject) this.f;
                if (tL_error2 != null) {
                    jj.c0(r7aVar9.currentAccount, tL_error2, null, tLObject4, new Object[0]);
                    r7aVar9.h0(message9.id, z8);
                    r7aVar9.k0(r47Var4);
                    break;
                } else {
                    String str3 = message9.attachPath;
                    TLRPC.Updates updates2 = (TLRPC.Updates) tLObject3;
                    ArrayList<TLRPC.Update> arrayList14 = updates2.updates;
                    message9.send_state = 0;
                    ArrayList arrayList15 = new ArrayList();
                    arrayList15.add(message9);
                    r7aVar9.getMessagesStorage().g1(arrayList15, false, true, false, 0, false, 0, 0L);
                    qyb qybVar = r7aVar9.getMessagesController().g4;
                    TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) qybVar.e.f(qyb.p(message9.id, -message9.dialog_id));
                    if (tL_forumTopic != null) {
                        tL_forumTopic.topMessage = message9;
                        qybVar.y(-message9.dialog_id, true);
                    }
                    Utilities.d.c(new e5a(r7aVar9, updates2, message9, z8, (byte) 0));
                    break;
                }
            case 2:
                ((mg2) this.b).c0((TLRPC.TL_error) this.c, (TLObject) this.d, (int[]) this.f, (ArrayList) this.h, this.e, (TLRPC.User) this.n);
                break;
            case 3:
                e17 e17Var = (e17) this.b;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.c;
                TLObject tLObject5 = (TLObject) this.d;
                TLRPC.TL_chatInviteImporter tL_chatInviteImporter = (TLRPC.TL_chatInviteImporter) this.f;
                boolean z9 = this.e;
                TLRPC.User user = (TLRPC.User) this.h;
                TLRPC.TL_messages_hideChatJoinRequest tL_messages_hideChatJoinRequest = (TLRPC.TL_messages_hideChatJoinRequest) this.n;
                int i16 = e17Var.k;
                ArrayList arrayList16 = e17Var.e;
                e eVar = e17Var.g;
                if (eVar != null && eVar.getParentActivity() != null) {
                    if (tL_error3 != null) {
                        jj.c0(i16, tL_error3, eVar, tL_messages_hideChatJoinRequest, new Object[0]);
                        break;
                    } else {
                        TLRPC.TL_updates tL_updates = (TLRPC.TL_updates) tLObject5;
                        if (!tL_updates.chats.isEmpty()) {
                            uc7.s1(i16).e3(0, tL_updates.chats.get(0).id, true);
                        }
                        int i17 = 0;
                        while (true) {
                            if (i17 < arrayList16.size()) {
                                if (((TLRPC.TL_chatInviteImporter) arrayList16.get(i17)).user_id == tL_chatInviteImporter.user_id) {
                                    arrayList16.remove(i17);
                                } else {
                                    i17++;
                                }
                            }
                        }
                        x07 x07Var = e17Var.f;
                        e17 e17Var2 = x07Var.c;
                        int i18 = 0;
                        while (true) {
                            arrayList5 = e17Var2.c;
                            if (i18 >= arrayList5.size()) {
                                i18 = -1;
                            } else if (((TLRPC.TL_chatInviteImporter) arrayList5.get(i18)).user_id != tL_chatInviteImporter.user_id) {
                                i18++;
                            }
                        }
                        if (i18 >= 0) {
                            arrayList5.remove(i18);
                            x07Var.s((!x07Var.c.B ? 1 : 0) + i18);
                            if (arrayList5.isEmpty()) {
                                x07Var.s(1);
                            }
                        }
                        e17Var.f(e17Var.t, false, true);
                        if (z9) {
                            h21 h21Var = new h21(eVar.getParentActivity(), eVar.getResourceProvider());
                            de0 de0Var = h21Var.a;
                            de0Var.setRoundRadius(hl.L(15.0f));
                            de0Var.f(user, new rb0(0, user));
                            String k = lbc.k(user, true);
                            String a0 = e17Var.a ? ob6.a0("HasBeenAddedToChannel", null, 2131749118, k) : ob6.a0("HasBeenAddedToGroup", null, 2131749117, k);
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(a0);
                            int indexOf = a0.indexOf(k);
                            spannableStringBuilder.setSpan(new y7c(hl.o()), indexOf, k.length() + indexOf, 18);
                            h21Var.b.setText(spannableStringBuilder);
                            if (arrayList16.isEmpty()) {
                                v21.g(eVar, h21Var, 2750).j();
                            } else {
                                v21.f(e17Var.h, h21Var, 2750).j();
                            }
                        }
                        s6 u = eVar.getActionBar().u();
                        if (TextUtils.isEmpty(e17Var.t) && e17Var.l) {
                            u.j(0).setVisibility(arrayList16.isEmpty() ? 8 : 0);
                            break;
                        }
                    }
                }
                break;
            case 4:
                File file = (File) this.b;
                ArrayList arrayList17 = (ArrayList) this.h;
                e eVar2 = (e) this.c;
                zu1 zu1Var = (zu1) this.d;
                TLRPC.Document document = (TLRPC.Document) this.f;
                boolean z10 = this.e;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) this.n;
                arrayList17.add(new no6(0, file.getAbsolutePath(), 0, false, 0, 0));
                PhotoViewer.q0().T1(eVar2.getParentActivity(), null, eVar2.getResourceProvider());
                PhotoViewer.q0().o1(arrayList17, 0, 11, false, new i4b(), zu1Var);
                PhotoViewer.q0().U(document, z10 ? document : null, false, null);
                rw2.e().T = z10 ? tL_messages_stickerSet : null;
                break;
            default:
                ((o7c) this.b).z0((TLRPC.TL_error) this.c, this.e, (TLObject) this.d, (byte[]) this.f, (String) this.h, (TL_account.passwordInputSettings) this.n);
                break;
        }
    }

    public /* synthetic */ d6a(e17 e17Var, TLRPC.TL_error tL_error, TLObject tLObject, TLRPC.TL_chatInviteImporter tL_chatInviteImporter, boolean z, TLRPC.User user, TLRPC.TL_messages_hideChatJoinRequest tL_messages_hideChatJoinRequest) {
        this.b = e17Var;
        this.c = tL_error;
        this.d = tLObject;
        this.f = tL_chatInviteImporter;
        this.e = z;
        this.h = user;
        this.n = tL_messages_hideChatJoinRequest;
    }

    public /* synthetic */ d6a(r7a r7aVar, TLRPC.TL_error tL_error, TLObject tLObject, boolean z, ArrayList arrayList, ArrayList arrayList2, TLObject tLObject2) {
        this.b = r7aVar;
        this.c = tL_error;
        this.d = tLObject;
        this.e = z;
        this.h = arrayList;
        this.n = arrayList2;
        this.f = tLObject2;
    }

    public /* synthetic */ d6a(r7a r7aVar, TLRPC.TL_error tL_error, TLRPC.Message message, TLObject tLObject, r47 r47Var, String str, HashMap hashMap, boolean z, TLObject tLObject2) {
        this.b = r7aVar;
        this.c = tL_error;
        this.h = message;
        this.d = tLObject;
        this.n = r47Var;
        this.e = z;
        this.f = tLObject2;
    }

    public /* synthetic */ d6a(o7c o7cVar, TLRPC.TL_error tL_error, boolean z, TLObject tLObject, byte[] bArr, String str, TL_account.passwordInputSettings passwordinputsettings) {
        this.b = o7cVar;
        this.c = tL_error;
        this.e = z;
        this.d = tLObject;
        this.f = bArr;
        this.h = str;
        this.n = passwordinputsettings;
    }

    public /* synthetic */ d6a(File file, ArrayList arrayList, e eVar, zu1 zu1Var, TLRPC.Document document, boolean z, TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        this.b = file;
        this.h = arrayList;
        this.c = eVar;
        this.d = zu1Var;
        this.f = document;
        this.e = z;
        this.n = tL_messages_stickerSet;
    }
}
