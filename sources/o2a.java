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
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final /* synthetic */ class o2a implements Runnable {
    public final /* synthetic */ byte a = 4;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object n;

    public /* synthetic */ o2a(uf2 uf2Var, TLRPC.TL_error tL_error, TLObject tLObject, int[] iArr, ArrayList arrayList, boolean z, TLRPC.User user) {
        this.b = uf2Var;
        this.c = tL_error;
        this.d = tLObject;
        this.f = iArr;
        this.h = arrayList;
        this.e = z;
        this.n = user;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v88 */
    /* JADX WARN: Type inference failed for: r5v89 */
    @Override // java.lang.Runnable
    public final void run() {
        ?? r5;
        int i;
        boolean z;
        z3a z3aVar;
        String str;
        int i2;
        int i3;
        boolean z2;
        TLRPC.Updates updates;
        z3a z3aVar2;
        TLRPC.Message message;
        vf6 vf6Var;
        final int[] iArr;
        int i4;
        final k27 k27Var;
        ArrayList arrayList;
        final SparseArray sparseArray;
        TLRPC.Updates updates2;
        z3a z3aVar3;
        TLRPC.Message message2;
        ArrayList arrayList2;
        boolean z3;
        TLRPC.Updates updates3;
        z3a z3aVar4;
        vf6 vf6Var2;
        ArrayList<TLRPC.Update> arrayList3;
        ArrayList arrayList4;
        int i5;
        String J1;
        TLRPC.MessageReplyHeader messageReplyHeader;
        int i6;
        ArrayList arrayList5;
        ArrayList arrayList6;
        boolean z4 = true;
        switch (this.a) {
            case 0:
                z3a z3aVar5 = (z3a) this.b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.c;
                TLObject tLObject = (TLObject) this.d;
                boolean z5 = this.e;
                ArrayList arrayList7 = (ArrayList) this.h;
                ArrayList arrayList8 = (ArrayList) this.n;
                TLObject tLObject2 = (TLObject) this.f;
                if (tL_error == null) {
                    SparseArray sparseArray2 = new SparseArray();
                    vf6 vf6Var3 = new vf6();
                    TLRPC.Updates updates4 = (TLRPC.Updates) tLObject;
                    ArrayList<TLRPC.Update> arrayList9 = updates4.updates;
                    ArrayList arrayList10 = new ArrayList();
                    vf6 vf6Var4 = null;
                    final boolean z6 = z5;
                    i = 2;
                    int i7 = 0;
                    z3a z3aVar6 = z3aVar5;
                    while (i7 < arrayList9.size()) {
                        TLRPC.Update update = arrayList9.get(i7);
                        if (update instanceof TL_update.TL_updateMessageID) {
                            TL_update.TL_updateMessageID tL_updateMessageID = (TL_update.TL_updateMessageID) update;
                            vf6Var3.k(Integer.valueOf(tL_updateMessageID.id), tL_updateMessageID.random_id);
                            arrayList9.remove(i7);
                            i7--;
                            z3 = z4;
                            updates3 = updates4;
                            vf6Var2 = vf6Var3;
                            arrayList3 = arrayList9;
                            arrayList4 = arrayList10;
                            z3aVar4 = z3aVar6;
                        } else {
                            boolean z7 = z4;
                            z3a z3aVar7 = z3aVar6;
                            if (update instanceof TL_update.TL_updateNewMessage) {
                                TL_update.TL_updateNewMessage tL_updateNewMessage = (TL_update.TL_updateNewMessage) update;
                                TLRPC.Message message3 = tL_updateNewMessage.message;
                                sparseArray2.put(message3.id, message3);
                                z3 = z7;
                                updates3 = updates4;
                                Utilities.d.c(new b3a(z3aVar7, tL_updateNewMessage, (byte) 0));
                                arrayList9.remove(i7);
                                i7--;
                                z3aVar4 = z3aVar7;
                                vf6Var2 = vf6Var3;
                                arrayList3 = arrayList9;
                                arrayList4 = arrayList10;
                            } else {
                                z3 = z7;
                                updates3 = updates4;
                                if (update instanceof TL_update.TL_updateNewEphemeralMessage) {
                                    TL_update.TL_updateNewEphemeralMessage tL_updateNewEphemeralMessage = (TL_update.TL_updateNewEphemeralMessage) update;
                                    TLRPC.TL_message b = t34.b(tL_updateNewEphemeralMessage.message);
                                    sparseArray2.put(b.id, b);
                                    arrayList10.add(tL_updateNewEphemeralMessage.message);
                                    arrayList9.remove(i7);
                                    i7--;
                                    z3aVar4 = z3aVar7;
                                    vf6Var2 = vf6Var3;
                                    arrayList3 = arrayList9;
                                    arrayList4 = arrayList10;
                                } else if (update instanceof TL_update.TL_updateNewChannelMessage) {
                                    TL_update.TL_updateNewChannelMessage tL_updateNewChannelMessage = (TL_update.TL_updateNewChannelMessage) update;
                                    long Q1 = na7.Q1(tL_updateNewChannelMessage);
                                    TLRPC.Chat K0 = z3aVar7.getMessagesController().K0(Long.valueOf(Q1));
                                    if ((K0 != null && !K0.megagroup) || (messageReplyHeader = tL_updateNewChannelMessage.message.reply_to) == null || (messageReplyHeader.reply_to_top_id == 0 && messageReplyHeader.reply_to_msg_id == 0)) {
                                        vf6Var2 = vf6Var3;
                                    } else {
                                        if (vf6Var4 == null) {
                                            vf6Var4 = new vf6();
                                        }
                                        long B0 = k27.B0(tL_updateNewChannelMessage.message);
                                        SparseArray sparseArray3 = (SparseArray) vf6Var4.f(B0);
                                        if (sparseArray3 == null) {
                                            sparseArray3 = new SparseArray();
                                            vf6Var4.k(sparseArray3, B0);
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
                                            vf6Var2 = vf6Var3;
                                            messageReplies.recent_repliers.add(0, peer);
                                        } else {
                                            vf6Var2 = vf6Var3;
                                        }
                                        messageReplies.replies++;
                                    }
                                    TLRPC.Message message4 = tL_updateNewChannelMessage.message;
                                    sparseArray2.put(message4.id, message4);
                                    Utilities.d.c(new c3a(z3aVar7, tL_updateNewChannelMessage, (byte) 0));
                                    arrayList9.remove(i7);
                                    int i9 = i7 - 1;
                                    if (tL_updateNewChannelMessage.message.pinned) {
                                        arrayList5 = arrayList10;
                                        arrayList3 = arrayList9;
                                        i6 = i9;
                                        z3aVar4 = z3aVar7;
                                        Utilities.d.c(new k1a(z3aVar7, tL_updateNewChannelMessage, Q1, (byte) 1));
                                    } else {
                                        z3aVar4 = z3aVar7;
                                        i6 = i9;
                                        arrayList3 = arrayList9;
                                        arrayList5 = arrayList10;
                                    }
                                    arrayList4 = arrayList5;
                                    i7 = i6;
                                } else {
                                    z3aVar4 = z3aVar7;
                                    vf6Var2 = vf6Var3;
                                    arrayList3 = arrayList9;
                                    arrayList4 = arrayList10;
                                    if (update instanceof TL_update.TL_updateNewScheduledMessage) {
                                        TLRPC.Message message5 = ((TL_update.TL_updateNewScheduledMessage) update).message;
                                        sparseArray2.put(message5.id, message5);
                                        arrayList3.remove(i7);
                                        i7--;
                                        z6 = z3;
                                    } else if (update instanceof TL_update.TL_updateQuickReplyMessage) {
                                        ox8 f = ox8.f(z3aVar4.currentAccount);
                                        if (arrayList7.isEmpty()) {
                                            i5 = 0;
                                            J1 = null;
                                        } else {
                                            i5 = 0;
                                            J1 = k27.J1(((k27) arrayList7.get(0)).k);
                                        }
                                        f.j(update, J1, (arrayList7.isEmpty() ? null : Integer.valueOf(k27.I1(((k27) arrayList7.get(i5)).k))).intValue());
                                        TLRPC.Message message6 = ((TL_update.TL_updateQuickReplyMessage) update).message;
                                        sparseArray2.put(message6.id, message6);
                                        arrayList3.remove(i7);
                                        i7--;
                                        z3aVar4 = z3aVar4;
                                    }
                                }
                            }
                            z6 = false;
                        }
                        i7++;
                        arrayList9 = arrayList3;
                        arrayList10 = arrayList4;
                        updates4 = updates3;
                        z4 = z3;
                        vf6Var3 = vf6Var2;
                        z3aVar6 = z3aVar4;
                    }
                    boolean z8 = z4;
                    TLRPC.Updates updates5 = updates4;
                    vf6 vf6Var5 = vf6Var3;
                    ArrayList arrayList11 = arrayList10;
                    if (arrayList11.isEmpty()) {
                        i2 = z8;
                    } else {
                        boolean z9 = z8;
                        z3aVar6.getMessagesStorage().c1(arrayList11, z9);
                        i2 = z9;
                    }
                    char c = 3;
                    char c2 = 4;
                    if (vf6Var4 != null) {
                        z3aVar6.getMessagesStorage().X0(null, null, vf6Var4, i2);
                        kk7 notificationCenter = z3aVar6.getNotificationCenter();
                        Object[] objArr = new Object[4];
                        i3 = 0;
                        objArr[0] = null;
                        objArr[i2] = null;
                        objArr[2] = vf6Var4;
                        objArr[3] = Boolean.TRUE;
                        notificationCenter.k(77, objArr);
                    } else {
                        i3 = 0;
                    }
                    int[] iArr2 = new int[i2];
                    vf6 vf6Var6 = vf6Var5;
                    iArr2[i3] = i3;
                    final int[] iArr3 = {i3};
                    final ArrayList arrayList12 = new ArrayList();
                    int i10 = 0;
                    z3a z3aVar8 = z3aVar6;
                    while (i10 < arrayList7.size()) {
                        k27 k27Var2 = (k27) arrayList7.get(i10);
                        String str2 = (String) arrayList8.get(i10);
                        final TLRPC.Message message7 = k27Var2.k;
                        char c3 = c;
                        final int i11 = message7.id;
                        char c4 = c2;
                        final ArrayList arrayList13 = new ArrayList();
                        z3a z3aVar9 = z3aVar8;
                        Integer num = (Integer) vf6Var6.f(message7.random_id);
                        if (num == null || (message = (TLRPC.Message) sparseArray2.get(num.intValue())) == null) {
                            z2 = z5;
                            updates = updates5;
                            z3aVar2 = z3aVar9;
                            z = true;
                            Utilities.d.c(new l1a(z3aVar2, updates, (byte) 1));
                            z3aVar = z3aVar2;
                            r5 = z2;
                        } else {
                            k27.B0(message);
                            arrayList13.add(message);
                            if ((message.flags & 33554432) != 0) {
                                TLRPC.Message message8 = k27Var2.k;
                                message8.ttl_period = message.ttl_period;
                                message8.flags |= 33554432;
                            }
                            if (tLObject2 instanceof TLRPC.TL_messages_sendMedia) {
                                k27 k27Var3 = (k27) arrayList7.get(0);
                                int i12 = i10;
                                int i13 = message.id;
                                k27Var = k27Var2;
                                ArrayList arrayList14 = arrayList8;
                                sparseArray = sparseArray2;
                                HashMap<String, String> hashMap = message.params;
                                vf6Var = vf6Var6;
                                iArr = iArr2;
                                updates2 = updates5;
                                i4 = i12;
                                message2 = message;
                                z3aVar3 = z3aVar9;
                                arrayList2 = arrayList12;
                                z3aVar3.y0(k27Var3, message2, i13, arrayList14, false, -1, hashMap);
                                arrayList = arrayList14;
                            } else {
                                vf6Var = vf6Var6;
                                iArr = iArr2;
                                i4 = i10;
                                k27Var = k27Var2;
                                arrayList = arrayList8;
                                sparseArray = sparseArray2;
                                updates2 = updates5;
                                z3aVar3 = z3aVar9;
                                message2 = message;
                                arrayList2 = arrayList12;
                                z3aVar3.y0(k27Var, message2, message2.id, Collections.singletonList(str2), false, -1, message2.params);
                            }
                            final int o1 = k27Var.o1();
                            message7.id = message2.id;
                            int i14 = message2.quick_reply_shortcut_id;
                            message7.quick_reply_shortcut_id = i14;
                            if (i14 != 0) {
                                message7.flags |= TLObject.FLAG_30;
                            }
                            final long j = message2.grouped_id;
                            if (!z5) {
                                Integer num2 = (Integer) z3aVar3.getMessagesController().Q.get(Long.valueOf(message2.dialog_id));
                                if (num2 == null) {
                                    num2 = Integer.valueOf(z3aVar3.getMessagesStorage().S(message2.dialog_id, message2.out));
                                    z3aVar3.getMessagesController().Q.put(Long.valueOf(message2.dialog_id), num2);
                                }
                                message2.unread = num2.intValue() < message2.id;
                            }
                            iArr[0] = iArr[0] + 1;
                            arrayList2.add(Integer.valueOf(i11));
                            z3aVar3.getStatsController().i(a.f(), 1, 1);
                            message7.send_state = 0;
                            message7.errorAllowedPriceStars = 0L;
                            message7.errorNewPriceStars = 0L;
                            kk7 notificationCenter2 = z3aVar3.getNotificationCenter();
                            Integer valueOf = Integer.valueOf(i11);
                            Integer valueOf2 = Integer.valueOf(message7.id);
                            Long valueOf3 = Long.valueOf(message7.dialog_id);
                            Long valueOf4 = Long.valueOf(j);
                            Integer valueOf5 = Integer.valueOf(o1);
                            Boolean valueOf6 = Boolean.valueOf(z6);
                            arrayList12 = arrayList2;
                            final z3a z3aVar10 = z3aVar3;
                            Object[] objArr2 = new Object[7];
                            objArr2[0] = valueOf;
                            objArr2[1] = valueOf2;
                            objArr2[2] = message7;
                            objArr2[c3] = valueOf3;
                            objArr2[c4] = valueOf4;
                            objArr2[5] = valueOf5;
                            objArr2[6] = valueOf6;
                            notificationCenter2.k(21, objArr2);
                            kk7 notificationCenter3 = z3aVar10.getNotificationCenter();
                            Integer valueOf7 = Integer.valueOf(i11);
                            Integer valueOf8 = Integer.valueOf(message7.id);
                            Long valueOf9 = Long.valueOf(message7.dialog_id);
                            Long valueOf10 = Long.valueOf(j);
                            Integer valueOf11 = Integer.valueOf(o1);
                            Boolean valueOf12 = Boolean.valueOf(z6);
                            Object[] objArr3 = new Object[7];
                            objArr3[0] = valueOf7;
                            objArr3[1] = valueOf8;
                            objArr3[2] = message7;
                            objArr3[c3] = valueOf9;
                            objArr3[c4] = valueOf10;
                            objArr3[5] = valueOf11;
                            objArr3[6] = valueOf12;
                            notificationCenter3.k(22, objArr3);
                            co3 co3Var = z3aVar10.getMessagesStorage().a;
                            final boolean z10 = z5;
                            z3aVar8 = z3aVar10;
                            co3Var.c(new Runnable() { // from class: d3a
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
                                    boolean z11;
                                    final TLRPC.Message message9 = message7;
                                    boolean c5 = k27.c5(message9);
                                    final boolean z12 = z6;
                                    if (c5) {
                                        r1 = 9;
                                    } else {
                                        if (message9.quick_reply_shortcut_id == 0 && message9.quick_reply_shortcut == null) {
                                            z11 = z12;
                                            final z3a z3aVar11 = z3a.this;
                                            ad7 messagesStorage = z3aVar11.getMessagesStorage();
                                            long j2 = message9.random_id;
                                            long B1 = k27.B1(message9.peer_id);
                                            final int i15 = i11;
                                            boolean z13 = z11;
                                            messagesStorage.X1(j2, B1, Integer.valueOf(i15), message9.id, 0, z13 ? 1 : 0, message9.quick_reply_shortcut_id);
                                            z3aVar11.getMessagesStorage().g1(arrayList13, true, false, false, 0, false, z13 ? 1 : 0, message9.quick_reply_shortcut_id);
                                            if (k27.e3(message9)) {
                                                long B12 = k27.B1(message9.peer_id);
                                                ArrayList arrayList15 = new ArrayList(1);
                                                arrayList15.add(Integer.valueOf(message9.id));
                                                z3aVar11.getMessagesStorage().M0(B12, arrayList15, false, false, z13 ? 1 : 0, (int) k27.Z1(z3aVar11.currentAccount, message9, 0));
                                                z3aVar11.getMessagesStorage().O1(B12, -B12, arrayList15, null);
                                                gl.d3(new q1a(z3aVar11, B12, arrayList15, (byte) 1));
                                            }
                                            final int[] iArr4 = iArr3;
                                            final int[] iArr5 = iArr;
                                            final boolean z14 = z10;
                                            final k27 k27Var4 = k27Var;
                                            final SparseArray sparseArray4 = sparseArray;
                                            final ArrayList arrayList16 = arrayList12;
                                            final long j3 = j;
                                            final int i16 = o1;
                                            gl.d3(new Runnable() { // from class: z1a
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    boolean z15;
                                                    int i17;
                                                    int[] iArr6 = iArr4;
                                                    int i18 = iArr6[0] + 1;
                                                    iArr6[0] = i18;
                                                    int i19 = iArr5[0];
                                                    z3a z3aVar12 = z3a.this;
                                                    boolean z16 = z14;
                                                    boolean z17 = z12;
                                                    if (i18 != i19 || z16 == z17) {
                                                        z15 = z17;
                                                    } else {
                                                        long B02 = k27.B0(k27Var4.k);
                                                        if (z17) {
                                                            SparseArray sparseArray5 = sparseArray4;
                                                            if (sparseArray5.size() > 1) {
                                                                i17 = sparseArray5.keyAt(0);
                                                                z15 = z17;
                                                                z3aVar12.getMessagesController().X(arrayList16, null, null, B02, false, z16 ? 1 : 0, false, 0L, null, 0, (z15 || z16) ? false : true, i17);
                                                            }
                                                        }
                                                        i17 = 0;
                                                        z15 = z17;
                                                        z3aVar12.getMessagesController().X(arrayList16, null, null, B02, false, z16 ? 1 : 0, false, 0L, null, 0, (z15 || z16) ? false : true, i17);
                                                    }
                                                    hq6 mediaDataController = z3aVar12.getMediaDataController();
                                                    TLRPC.Message message10 = message9;
                                                    mediaDataController.x0(message10.dialog_id);
                                                    kk7 notificationCenter4 = z3aVar12.getNotificationCenter();
                                                    int i20 = i15;
                                                    Integer valueOf13 = Integer.valueOf(i20);
                                                    Integer valueOf14 = Integer.valueOf(message10.id);
                                                    Long valueOf15 = Long.valueOf(message10.dialog_id);
                                                    long j4 = j3;
                                                    Long valueOf16 = Long.valueOf(j4);
                                                    int i21 = i16;
                                                    notificationCenter4.k(kk7.J, valueOf13, valueOf14, message10, valueOf15, valueOf16, Integer.valueOf(i21), Boolean.valueOf(z15));
                                                    z3aVar12.getNotificationCenter().k(kk7.K, Integer.valueOf(i20), Integer.valueOf(message10.id), message10, Long.valueOf(message10.dialog_id), Long.valueOf(j4), Integer.valueOf(i21), Boolean.valueOf(z15));
                                                    z3aVar12.c0(i20);
                                                    z3aVar12.h0(i20, z16);
                                                }
                                            });
                                        }
                                        r1 = 5;
                                    }
                                    z11 = r1;
                                    final z3a z3aVar112 = z3a.this;
                                    ad7 messagesStorage2 = z3aVar112.getMessagesStorage();
                                    long j22 = message9.random_id;
                                    long B13 = k27.B1(message9.peer_id);
                                    final int i152 = i11;
                                    boolean z132 = z11;
                                    messagesStorage2.X1(j22, B13, Integer.valueOf(i152), message9.id, 0, z132 ? 1 : 0, message9.quick_reply_shortcut_id);
                                    z3aVar112.getMessagesStorage().g1(arrayList13, true, false, false, 0, false, z132 ? 1 : 0, message9.quick_reply_shortcut_id);
                                    if (k27.e3(message9)) {
                                    }
                                    final int[] iArr42 = iArr3;
                                    final int[] iArr52 = iArr;
                                    final boolean z142 = z10;
                                    final k27 k27Var42 = k27Var;
                                    final SparseArray sparseArray42 = sparseArray;
                                    final ArrayList arrayList162 = arrayList12;
                                    final long j32 = j;
                                    final int i162 = o1;
                                    gl.d3(new Runnable() { // from class: z1a
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            boolean z15;
                                            int i17;
                                            int[] iArr6 = iArr42;
                                            int i18 = iArr6[0] + 1;
                                            iArr6[0] = i18;
                                            int i19 = iArr52[0];
                                            z3a z3aVar12 = z3a.this;
                                            boolean z16 = z142;
                                            boolean z17 = z12;
                                            if (i18 != i19 || z16 == z17) {
                                                z15 = z17;
                                            } else {
                                                long B02 = k27.B0(k27Var42.k);
                                                if (z17) {
                                                    SparseArray sparseArray5 = sparseArray42;
                                                    if (sparseArray5.size() > 1) {
                                                        i17 = sparseArray5.keyAt(0);
                                                        z15 = z17;
                                                        z3aVar12.getMessagesController().X(arrayList162, null, null, B02, false, z16 ? 1 : 0, false, 0L, null, 0, (z15 || z16) ? false : true, i17);
                                                    }
                                                }
                                                i17 = 0;
                                                z15 = z17;
                                                z3aVar12.getMessagesController().X(arrayList162, null, null, B02, false, z16 ? 1 : 0, false, 0L, null, 0, (z15 || z16) ? false : true, i17);
                                            }
                                            hq6 mediaDataController = z3aVar12.getMediaDataController();
                                            TLRPC.Message message10 = message9;
                                            mediaDataController.x0(message10.dialog_id);
                                            kk7 notificationCenter4 = z3aVar12.getNotificationCenter();
                                            int i20 = i152;
                                            Integer valueOf13 = Integer.valueOf(i20);
                                            Integer valueOf14 = Integer.valueOf(message10.id);
                                            Long valueOf15 = Long.valueOf(message10.dialog_id);
                                            long j4 = j32;
                                            Long valueOf16 = Long.valueOf(j4);
                                            int i21 = i162;
                                            notificationCenter4.k(kk7.J, valueOf13, valueOf14, message10, valueOf15, valueOf16, Integer.valueOf(i21), Boolean.valueOf(z15));
                                            z3aVar12.getNotificationCenter().k(kk7.K, Integer.valueOf(i20), Integer.valueOf(message10.id), message10, Long.valueOf(message10.dialog_id), Long.valueOf(j4), Integer.valueOf(i21), Boolean.valueOf(z15));
                                            z3aVar12.c0(i20);
                                            z3aVar12.h0(i20, z16);
                                        }
                                    });
                                }
                            });
                            i10 = i4 + 1;
                            z5 = z10;
                            updates5 = updates2;
                            iArr2 = iArr;
                            sparseArray2 = sparseArray;
                            c = c3;
                            c2 = c4;
                            vf6Var6 = vf6Var;
                            arrayList8 = arrayList;
                        }
                    }
                    z2 = z5;
                    updates = updates5;
                    z = false;
                    z3aVar2 = z3aVar8;
                    Utilities.d.c(new l1a(z3aVar2, updates, (byte) 1));
                    z3aVar = z3aVar2;
                    r5 = z2;
                } else {
                    r5 = z5;
                    i = 2;
                    ij.c0(z3aVar5.currentAccount, tL_error, null, tLObject2, new Object[0]);
                    z = true;
                    z3aVar = z3aVar5;
                }
                if (z) {
                    int i15 = 0;
                    while (i15 < arrayList7.size()) {
                        k27 k27Var4 = (k27) arrayList7.get(i15);
                        TLRPC.Message message9 = k27Var4.k;
                        z3aVar.getMessagesStorage().K0(r5, message9);
                        int i16 = i;
                        message9.send_state = i16;
                        if (r5 == 0 && tL_error != null && (str = tL_error.text) != null && str.startsWith("ALLOW_PAYMENT_REQUIRED_")) {
                            gta.v(z3aVar.currentAccount, false);
                            message9.errorAllowedPriceStars = gta.l(tLObject2);
                            message9.errorNewPriceStars = Long.parseLong(tL_error.text.substring(23));
                            gta.v(z3aVar.currentAccount, false).d0(Arrays.asList(k27Var4));
                            z3aVar.getMessagesStorage().U1(k27.B0(message9), message9);
                        }
                        z3aVar.getNotificationCenter().k(23, Integer.valueOf(message9.id));
                        z3aVar.c0(message9.id);
                        z3aVar.h0(message9.id, r5);
                        i15++;
                        i = i16;
                    }
                    break;
                }
                break;
            case 1:
                z3a z3aVar11 = (z3a) this.b;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.c;
                TLRPC.Message message10 = (TLRPC.Message) this.h;
                TLObject tLObject3 = (TLObject) this.d;
                k27 k27Var5 = (k27) this.n;
                boolean z11 = this.e;
                TLObject tLObject4 = (TLObject) this.f;
                if (tL_error2 != null) {
                    ij.c0(z3aVar11.currentAccount, tL_error2, null, tLObject4, new Object[0]);
                    z3aVar11.h0(message10.id, z11);
                    z3aVar11.k0(k27Var5);
                    break;
                } else {
                    String str3 = message10.attachPath;
                    TLRPC.Updates updates6 = (TLRPC.Updates) tLObject3;
                    ArrayList<TLRPC.Update> arrayList15 = updates6.updates;
                    message10.send_state = 0;
                    ArrayList arrayList16 = new ArrayList();
                    arrayList16.add(message10);
                    z3aVar11.getMessagesStorage().g1(arrayList16, false, true, false, 0, false, 0, 0L);
                    pub pubVar = z3aVar11.getMessagesController().g4;
                    TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) pubVar.e.f(pub.p(message10.id, -message10.dialog_id));
                    if (tL_forumTopic != null) {
                        tL_forumTopic.topMessage = message10;
                        pubVar.y(-message10.dialog_id, true);
                    }
                    Utilities.d.c(new e3a(z3aVar11, updates6, message10, z11, (byte) 1));
                    break;
                }
            case 2:
                ((uf2) this.b).c0((TLRPC.TL_error) this.c, (TLObject) this.d, (int[]) this.f, (ArrayList) this.h, this.e, (TLRPC.User) this.n);
                break;
            case 3:
                xy6 xy6Var = (xy6) this.b;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.c;
                TLObject tLObject5 = (TLObject) this.d;
                TLRPC.TL_chatInviteImporter tL_chatInviteImporter = (TLRPC.TL_chatInviteImporter) this.f;
                boolean z12 = this.e;
                TLRPC.User user = (TLRPC.User) this.h;
                TLRPC.TL_messages_hideChatJoinRequest tL_messages_hideChatJoinRequest = (TLRPC.TL_messages_hideChatJoinRequest) this.n;
                int i17 = xy6Var.k;
                ArrayList arrayList17 = xy6Var.e;
                d dVar = xy6Var.g;
                if (dVar != null && dVar.getParentActivity() != null) {
                    if (tL_error3 != null) {
                        ij.c0(i17, tL_error3, dVar, tL_messages_hideChatJoinRequest, new Object[0]);
                        break;
                    } else {
                        TLRPC.TL_updates tL_updates = (TLRPC.TL_updates) tLObject5;
                        if (!tL_updates.chats.isEmpty()) {
                            na7.q1(i17).X2(0, tL_updates.chats.get(0).id, true);
                        }
                        int i18 = 0;
                        while (true) {
                            if (i18 < arrayList17.size()) {
                                if (((TLRPC.TL_chatInviteImporter) arrayList17.get(i18)).user_id == tL_chatInviteImporter.user_id) {
                                    arrayList17.remove(i18);
                                } else {
                                    i18++;
                                }
                            }
                        }
                        qy6 qy6Var = xy6Var.f;
                        xy6 xy6Var2 = qy6Var.c;
                        int i19 = 0;
                        while (true) {
                            arrayList6 = xy6Var2.c;
                            if (i19 < arrayList6.size()) {
                                xy6 xy6Var3 = xy6Var2;
                                if (((TLRPC.TL_chatInviteImporter) arrayList6.get(i19)).user_id != tL_chatInviteImporter.user_id) {
                                    i19++;
                                    xy6Var2 = xy6Var3;
                                }
                            } else {
                                i19 = -1;
                            }
                        }
                        if (i19 >= 0) {
                            arrayList6.remove(i19);
                            qy6Var.r((!qy6Var.c.B ? 1 : 0) + i19);
                            if (arrayList6.isEmpty()) {
                                qy6Var.r(1);
                            }
                        }
                        xy6Var.f(xy6Var.t, false, true);
                        if (z12) {
                            y11 y11Var = new y11(dVar.getParentActivity(), dVar.getResourceProvider());
                            be0 be0Var = y11Var.a;
                            be0Var.setRoundRadius(gl.L(15.0f));
                            be0Var.f(user, new pb0(0, user));
                            String k = l7c.k(user, true);
                            String a0 = xy6Var.a ? k96.a0("HasBeenAddedToChannel", null, 2131749172, k) : k96.a0("HasBeenAddedToGroup", null, 2131749171, k);
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(a0);
                            int indexOf = a0.indexOf(k);
                            spannableStringBuilder.setSpan(new z3c(gl.o()), indexOf, k.length() + indexOf, 18);
                            y11Var.b.setText(spannableStringBuilder);
                            if (arrayList17.isEmpty()) {
                                m21.g(dVar, y11Var, 2750).j();
                            } else {
                                m21.f(xy6Var.h, y11Var, 2750).j();
                            }
                        }
                        r6 t = dVar.getActionBar().t();
                        if (TextUtils.isEmpty(xy6Var.t) && xy6Var.l) {
                            t.j(0).setVisibility(arrayList17.isEmpty() ? 8 : 0);
                            break;
                        }
                    }
                }
                break;
            case 4:
                File file = (File) this.b;
                ArrayList arrayList18 = (ArrayList) this.h;
                d dVar2 = (d) this.c;
                mu1 mu1Var = (mu1) this.d;
                TLRPC.Document document = (TLRPC.Document) this.f;
                boolean z13 = this.e;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) this.n;
                arrayList18.add(new jm6(0, file.getAbsolutePath(), 0, false, 0, 0));
                PhotoViewer.r0().S1(dVar2.getParentActivity(), null, dVar2.getResourceProvider());
                PhotoViewer.r0().n1(arrayList18, 0, 11, false, new k0b(), mu1Var);
                PhotoViewer.r0().V(document, z13 ? document : null, false, null);
                xv2.e().T = z13 ? tL_messages_stickerSet : null;
                break;
            default:
                ((p3c) this.b).y0((TLRPC.TL_error) this.c, this.e, (TLObject) this.d, (byte[]) this.f, (String) this.h, (TL_account.passwordInputSettings) this.n);
                break;
        }
    }

    public /* synthetic */ o2a(xy6 xy6Var, TLRPC.TL_error tL_error, TLObject tLObject, TLRPC.TL_chatInviteImporter tL_chatInviteImporter, boolean z, TLRPC.User user, TLRPC.TL_messages_hideChatJoinRequest tL_messages_hideChatJoinRequest) {
        this.b = xy6Var;
        this.c = tL_error;
        this.d = tLObject;
        this.f = tL_chatInviteImporter;
        this.e = z;
        this.h = user;
        this.n = tL_messages_hideChatJoinRequest;
    }

    public /* synthetic */ o2a(z3a z3aVar, TLRPC.TL_error tL_error, TLObject tLObject, boolean z, ArrayList arrayList, ArrayList arrayList2, TLObject tLObject2) {
        this.b = z3aVar;
        this.c = tL_error;
        this.d = tLObject;
        this.e = z;
        this.h = arrayList;
        this.n = arrayList2;
        this.f = tLObject2;
    }

    public /* synthetic */ o2a(z3a z3aVar, TLRPC.TL_error tL_error, TLRPC.Message message, TLObject tLObject, k27 k27Var, String str, HashMap hashMap, boolean z, TLObject tLObject2) {
        this.b = z3aVar;
        this.c = tL_error;
        this.h = message;
        this.d = tLObject;
        this.n = k27Var;
        this.e = z;
        this.f = tLObject2;
    }

    public /* synthetic */ o2a(p3c p3cVar, TLRPC.TL_error tL_error, boolean z, TLObject tLObject, byte[] bArr, String str, TL_account.passwordInputSettings passwordinputsettings) {
        this.b = p3cVar;
        this.c = tL_error;
        this.e = z;
        this.d = tLObject;
        this.f = bArr;
        this.h = str;
        this.n = passwordinputsettings;
    }

    public /* synthetic */ o2a(File file, ArrayList arrayList, d dVar, mu1 mu1Var, TLRPC.Document document, boolean z, TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        this.b = file;
        this.h = arrayList;
        this.c = dVar;
        this.d = mu1Var;
        this.f = document;
        this.e = z;
        this.n = tL_messages_stickerSet;
    }
}
