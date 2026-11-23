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

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes.dex */
public final /* synthetic */ class tx implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ az b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ TLRPC.TL_error d;
    public final /* synthetic */ TLRPC.Message e;
    public final /* synthetic */ TLObject f;
    public final /* synthetic */ gj h;
    public final /* synthetic */ HashMap n;
    public final /* synthetic */ String r;
    public final /* synthetic */ TLObject s;

    public /* synthetic */ tx(az azVar, TLRPC.TL_error tL_error, TLRPC.Message message, TLObject tLObject, gj gjVar, String str, HashMap hashMap, boolean z10, TLObject tLObject2) {
        this.b = azVar;
        this.d = tL_error;
        this.e = message;
        this.f = tLObject;
        this.h = gjVar;
        this.r = str;
        this.n = hashMap;
        this.c = z10;
        this.s = tLObject2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:219:0x06db  */
    /* JADX WARN: Type inference failed for: r17v0 */
    /* JADX WARN: Type inference failed for: r17v1 */
    /* JADX WARN: Type inference failed for: r17v2 */
    /* JADX WARN: Type inference failed for: r1v15, types: [org.telegram.messenger.ur] */
    /* JADX WARN: Type inference failed for: r5v4, types: [org.telegram.messenger.az, org.telegram.messenger.c1] */
    /* JADX WARN: Type inference failed for: r5v48 */
    /* JADX WARN: Type inference failed for: r5v49 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v91 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        TLRPC.Message message;
        TLRPC.Message message2;
        gj gjVar;
        int i7;
        final TLRPC.Message message3;
        ?? r62;
        TLRPC.TL_error tL_error;
        TLObject tLObject;
        boolean z10;
        ?? r52;
        String str;
        int i10;
        TLRPC.TL_error tL_error2;
        Long l10;
        TLObject tLObject2;
        long j3;
        char c10;
        int i11;
        boolean z11;
        boolean z12;
        final int i12;
        az azVar;
        boolean z13;
        int i13;
        HashMap hashMap;
        String str2;
        TLRPC.Updates updates;
        ArrayList<TLRPC.Update> arrayList;
        ArrayList arrayList2;
        az azVar2;
        int i14;
        TLRPC.MessageReplyHeader messageReplyHeader;
        long j10;
        ArrayList<TLRPC.Update> arrayList3;
        a0.h hVar;
        TLRPC.Message message4;
        final az azVar3;
        char c11;
        boolean z14;
        switch (this.a) {
            case 0:
                az azVar4 = this.b;
                TLRPC.TL_error tL_error3 = this.d;
                TLRPC.Message message5 = this.e;
                TLObject tLObject3 = this.f;
                gj gjVar2 = this.h;
                String str3 = this.r;
                HashMap hashMap2 = this.n;
                boolean z15 = this.c;
                TLObject tLObject4 = this.s;
                if (tL_error3 != null) {
                    org.telegram.ui.Components.c5.c0(azVar4.currentAccount, tL_error3, null, tLObject4, new Object[0]);
                    azVar4.i0(message5.id, z15);
                    azVar4.l0(gjVar2);
                    break;
                } else {
                    String str4 = message5.attachPath;
                    TLRPC.Updates updates2 = (TLRPC.Updates) tLObject3;
                    ArrayList<TLRPC.Update> arrayList4 = updates2.updates;
                    for (int i15 = 0; i15 < arrayList4.size(); i15++) {
                        TLRPC.Update update = arrayList4.get(i15);
                        if (update instanceof TL_update.TL_updateEditMessage) {
                            message2 = ((TL_update.TL_updateEditMessage) update).message;
                        } else if (update instanceof TL_update.TL_updateEditChannelMessage) {
                            message2 = ((TL_update.TL_updateEditChannelMessage) update).message;
                        } else if (update instanceof TL_update.TL_updateNewScheduledMessage) {
                            message2 = ((TL_update.TL_updateNewScheduledMessage) update).message;
                        } else if (update instanceof TL_update.TL_updateQuickReplyMessage) {
                            kg.v1.f(azVar4.currentAccount).j(update, gj.J1(message5), gj.I1(message5));
                            message2 = ((TL_update.TL_updateQuickReplyMessage) update).message;
                        }
                        message = message2;
                        if (message != null) {
                            fc.W(message);
                            azVar4.z0(gjVar2, message, message.id, Collections.singletonList(str3), false, -1, hashMap2);
                        }
                        Utilities.d.c(new fy(azVar4, updates2, message5, z15, 0));
                        break;
                    }
                    message = null;
                    if (message != null) {
                    }
                    Utilities.d.c(new fy(azVar4, updates2, message5, z15, 0));
                }
            default:
                az azVar5 = this.b;
                boolean z16 = this.c;
                TLRPC.TL_error tL_error4 = this.d;
                TLRPC.Message message6 = this.e;
                TLObject tLObject5 = this.f;
                gj gjVar3 = this.h;
                HashMap hashMap3 = this.n;
                String str5 = this.r;
                TLObject tLObject6 = this.s;
                if (tL_error4 == null) {
                    int i16 = 1;
                    int i17 = message6.id;
                    final ArrayList arrayList5 = new ArrayList();
                    boolean z17 = message6.date == 2147483646;
                    if (tLObject5 instanceof TLRPC.TL_updateShortSentMessage) {
                        TLRPC.TL_updateShortSentMessage tL_updateShortSentMessage = (TLRPC.TL_updateShortSentMessage) tLObject5;
                        i10 = i17;
                        tL_error2 = tL_error4;
                        l10 = 0L;
                        tLObject2 = tLObject6;
                        azVar5.z0(gjVar3, null, tL_updateShortSentMessage.id, Collections.singletonList(null), false, -1, hashMap3);
                        az azVar6 = azVar5;
                        int o12 = gjVar3.o1();
                        int i18 = tL_updateShortSentMessage.id;
                        message6.id = i18;
                        message6.local_id = i18;
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
                            fc.W(message6);
                        }
                        TLRPC.MessageMedia messageMedia2 = tL_updateShortSentMessage.media;
                        if (((messageMedia2 instanceof TLRPC.TL_messageMediaGame) || (messageMedia2 instanceof TLRPC.TL_messageMediaInvoice)) && !TextUtils.isEmpty(tL_updateShortSentMessage.message)) {
                            message6.message = tL_updateShortSentMessage.message;
                        }
                        if (!message6.entities.isEmpty()) {
                            message6.flags |= 128;
                        }
                        Integer num = (Integer) azVar6.getMessagesController().Q.get(Long.valueOf(message6.dialog_id));
                        if (num == null) {
                            num = Integer.valueOf(azVar6.getMessagesStorage().U(message6.dialog_id, message6.out));
                            azVar6.getMessagesController().Q.put(Long.valueOf(message6.dialog_id), num);
                        }
                        message6.unread = num.intValue() < message6.id;
                        Utilities.d.c(new sq(21, azVar6, tL_updateShortSentMessage));
                        arrayList5.add(message6);
                        i12 = o12;
                        gjVar = gjVar3;
                        j3 = 0;
                        z12 = false;
                        z11 = false;
                        c10 = 4;
                        i11 = 2;
                        azVar3 = azVar6;
                    } else {
                        i10 = i17;
                        HashMap hashMap4 = hashMap3;
                        tL_error2 = tL_error4;
                        l10 = 0L;
                        az azVar7 = azVar5;
                        tLObject2 = tLObject6;
                        if (tLObject5 instanceof TLRPC.Updates) {
                            TLRPC.Updates updates3 = (TLRPC.Updates) tLObject5;
                            ArrayList<TLRPC.Update> arrayList6 = updates3.updates;
                            ArrayList arrayList7 = new ArrayList();
                            boolean z18 = z16;
                            j3 = 0;
                            TLRPC.Message message7 = null;
                            a0.h hVar2 = null;
                            int i19 = 0;
                            az azVar8 = azVar7;
                            while (i19 < arrayList6.size()) {
                                TLRPC.Update update2 = arrayList6.get(i19);
                                if (update2 instanceof TL_update.TL_updateNewMessage) {
                                    TL_update.TL_updateNewMessage tL_updateNewMessage = (TL_update.TL_updateNewMessage) update2;
                                    TLRPC.Message message8 = tL_updateNewMessage.message;
                                    hashMap = hashMap4;
                                    if (message8.action != null) {
                                        updates = updates3;
                                        azVar2 = azVar8;
                                        arrayList = arrayList6;
                                        arrayList2 = arrayList7;
                                        str2 = str5;
                                        i14 = 1;
                                    } else {
                                        arrayList5.add(message8);
                                        str2 = str5;
                                        Utilities.d.c(new cy(azVar8, tL_updateNewMessage, 2));
                                        arrayList6.remove(i19);
                                        i19--;
                                        updates = updates3;
                                        azVar2 = azVar8;
                                        arrayList = arrayList6;
                                        arrayList2 = arrayList7;
                                        message7 = message8;
                                        i14 = i16;
                                    }
                                } else {
                                    hashMap = hashMap4;
                                    str2 = str5;
                                    if (update2 instanceof TL_update.TL_updateNewEphemeralMessage) {
                                        TL_update.TL_updateNewEphemeralMessage tL_updateNewEphemeralMessage = (TL_update.TL_updateNewEphemeralMessage) update2;
                                        TLRPC.TL_message b10 = bg.x.b(tL_updateNewEphemeralMessage.message);
                                        arrayList5.add(b10);
                                        arrayList7.add(tL_updateNewEphemeralMessage.message);
                                        arrayList6.remove(i19);
                                        i19--;
                                        message7 = b10;
                                        updates = updates3;
                                        azVar2 = azVar8;
                                        arrayList = arrayList6;
                                        arrayList2 = arrayList7;
                                        i14 = i16;
                                    } else {
                                        if (update2 instanceof TL_update.TL_updateNewChannelMessage) {
                                            TL_update.TL_updateNewChannelMessage tL_updateNewChannelMessage = (TL_update.TL_updateNewChannelMessage) update2;
                                            ArrayList arrayList8 = arrayList7;
                                            long X1 = np.X1(tL_updateNewChannelMessage);
                                            TLRPC.Chat O0 = azVar8.getMessagesController().O0(Long.valueOf(X1));
                                            if (!(O0 == null || O0.megagroup) || (messageReplyHeader = tL_updateNewChannelMessage.message.reply_to) == null || (messageReplyHeader.reply_to_top_id == 0 && messageReplyHeader.reply_to_msg_id == 0)) {
                                                j10 = X1;
                                            } else {
                                                if (hVar2 == null) {
                                                    hVar2 = new a0.h();
                                                }
                                                j10 = X1;
                                                long B0 = gj.B0(tL_updateNewChannelMessage.message);
                                                SparseArray sparseArray = (SparseArray) hVar2.f(B0);
                                                if (sparseArray == null) {
                                                    sparseArray = new SparseArray();
                                                    hVar2.k(sparseArray, B0);
                                                }
                                                TLRPC.MessageReplyHeader messageReplyHeader2 = tL_updateNewChannelMessage.message.reply_to;
                                                int i20 = messageReplyHeader2.reply_to_top_id;
                                                if (i20 == 0) {
                                                    i20 = messageReplyHeader2.reply_to_msg_id;
                                                }
                                                TLRPC.MessageReplies messageReplies = (TLRPC.MessageReplies) sparseArray.get(i20);
                                                if (messageReplies == null) {
                                                    messageReplies = new TLRPC.TL_messageReplies();
                                                    sparseArray.put(i20, messageReplies);
                                                }
                                                TLRPC.Peer peer = tL_updateNewChannelMessage.message.from_id;
                                                if (peer != null) {
                                                    messageReplies.recent_repliers.add(0, peer);
                                                }
                                                messageReplies.replies++;
                                            }
                                            a0.h hVar3 = hVar2;
                                            TLRPC.Message message9 = tL_updateNewChannelMessage.message;
                                            arrayList5.add(message9);
                                            Utilities.d.c(new dy(azVar8, tL_updateNewChannelMessage, i16));
                                            arrayList6.remove(i19);
                                            i19--;
                                            if (tL_updateNewChannelMessage.message.pinned) {
                                                arrayList3 = arrayList6;
                                                arrayList2 = arrayList8;
                                                updates = updates3;
                                                hVar = hVar3;
                                                long j11 = j10;
                                                message4 = message9;
                                                Utilities.d.c(new dw(azVar8, tL_updateNewChannelMessage, j11, 0));
                                            } else {
                                                arrayList2 = arrayList8;
                                                updates = updates3;
                                                arrayList3 = arrayList6;
                                                hVar = hVar3;
                                                message4 = message9;
                                            }
                                            azVar2 = azVar8;
                                            arrayList = arrayList3;
                                            hVar2 = hVar;
                                            message7 = message4;
                                        } else {
                                            updates = updates3;
                                            arrayList = arrayList6;
                                            arrayList2 = arrayList7;
                                            if (update2 instanceof TL_update.TL_updateNewScheduledMessage) {
                                                TL_update.TL_updateNewScheduledMessage tL_updateNewScheduledMessage = (TL_update.TL_updateNewScheduledMessage) update2;
                                                int i21 = 0;
                                                while (true) {
                                                    if (i21 < arrayList5.size()) {
                                                        if (((TLRPC.Message) arrayList5.get(i21)).id == tL_updateNewScheduledMessage.message.id) {
                                                            arrayList5.remove(i21);
                                                        } else {
                                                            i21++;
                                                        }
                                                    }
                                                }
                                                TLRPC.Message message10 = tL_updateNewScheduledMessage.message;
                                                arrayList5.add(message10);
                                                arrayList.remove(i19);
                                                i19--;
                                                azVar2 = azVar8;
                                                message7 = message10;
                                                i14 = 1;
                                                z18 = true;
                                            } else {
                                                if (update2 instanceof TL_update.TL_updateQuickReplyMessage) {
                                                    kg.v1.f(azVar8.currentAccount).j(update2, gj.J1(gjVar3.k), gj.I1(gjVar3.k));
                                                    TLRPC.Message message11 = ((TL_update.TL_updateQuickReplyMessage) update2).message;
                                                    arrayList5.add(message11);
                                                    arrayList.remove(i19);
                                                    i19--;
                                                    azVar2 = azVar8;
                                                    message7 = message11;
                                                } else {
                                                    if (update2 instanceof TL_update.TL_updateDeleteScheduledMessages) {
                                                        TL_update.TL_updateDeleteScheduledMessages tL_updateDeleteScheduledMessages = (TL_update.TL_updateDeleteScheduledMessages) update2;
                                                        if (gj.B0(gjVar3.k) == n5.o(tL_updateDeleteScheduledMessages.peer)) {
                                                            ArrayList<Integer> arrayList9 = tL_updateDeleteScheduledMessages.messages;
                                                            int size = arrayList9.size();
                                                            int i22 = 0;
                                                            az azVar9 = azVar8;
                                                            while (i22 < size) {
                                                                Integer num2 = arrayList9.get(i22);
                                                                i22++;
                                                                int intValue = num2.intValue();
                                                                az azVar10 = azVar9;
                                                                int i23 = 0;
                                                                while (true) {
                                                                    if (i23 >= arrayList5.size()) {
                                                                        break;
                                                                    } else if (((TLRPC.Message) arrayList5.get(i23)).id == intValue) {
                                                                        arrayList5.remove(i23);
                                                                    } else {
                                                                        i23++;
                                                                    }
                                                                }
                                                                azVar9 = azVar10;
                                                            }
                                                            azVar2 = azVar9;
                                                            arrayList.remove(i19);
                                                            i19--;
                                                        }
                                                    }
                                                    azVar2 = azVar8;
                                                }
                                                i14 = 1;
                                            }
                                        }
                                        i14 = 1;
                                        z18 = false;
                                    }
                                }
                                i19 += i14;
                                arrayList6 = arrayList;
                                i16 = i14;
                                arrayList7 = arrayList2;
                                str5 = str2;
                                azVar8 = azVar2;
                                updates3 = updates;
                                hashMap4 = hashMap;
                            }
                            HashMap hashMap5 = hashMap4;
                            TLRPC.Updates updates4 = updates3;
                            az azVar11 = azVar8;
                            ArrayList<TLRPC.Update> arrayList10 = arrayList6;
                            ArrayList arrayList11 = arrayList7;
                            String str6 = str5;
                            boolean z19 = i16;
                            if (!arrayList11.isEmpty()) {
                                azVar11.getMessagesStorage().f1(arrayList11, z19);
                            }
                            if (hVar2 != null) {
                                azVar11.getMessagesStorage().a1(null, null, hVar2, z19);
                                ls notificationCenter = azVar11.getNotificationCenter();
                                c10 = 4;
                                Object[] objArr = new Object[4];
                                objArr[0] = null;
                                objArr[z19 ? 1 : 0] = null;
                                objArr[2] = hVar2;
                                objArr[3] = Boolean.TRUE;
                                notificationCenter.k(77, objArr);
                            } else {
                                c10 = 4;
                            }
                            if (message7 != null) {
                                gj.B0(message7);
                                if (z17 && message7.date != 2147483646) {
                                    z18 = false;
                                }
                                fc.W(message7);
                                if (!z18) {
                                    Integer num3 = (Integer) azVar11.getMessagesController().Q.get(Long.valueOf(message7.dialog_id));
                                    if (num3 == null) {
                                        num3 = Integer.valueOf(azVar11.getMessagesStorage().U(message7.dialog_id, message7.out));
                                        azVar11.getMessagesController().Q.put(Long.valueOf(message7.dialog_id), num3);
                                    }
                                    message7.unread = num3.intValue() < message7.id;
                                }
                                TLRPC.Message message12 = gjVar3.k;
                                message12.post_author = message7.post_author;
                                if ((message7.flags & 33554432) != 0) {
                                    message12.ttl_period = message7.ttl_period;
                                    message12.flags |= 33554432;
                                }
                                message12.entities = message7.entities;
                                int i24 = message7.quick_reply_shortcut_id;
                                message12.quick_reply_shortcut_id = i24;
                                if (i24 != 0) {
                                    message12.flags |= TLObject.FLAG_30;
                                }
                                TLRPC.Message message13 = message7;
                                i11 = 2;
                                azVar11.z0(gjVar3, message13, message7.id, Collections.singletonList(str6), false, -1, hashMap5);
                                gjVar = gjVar3;
                                azVar = azVar11;
                                int o13 = gjVar.o1();
                                message6.id = message13.id;
                                i13 = o13;
                                z13 = false;
                            } else {
                                gjVar = gjVar3;
                                i11 = 2;
                                azVar = azVar11;
                                if (s2.a) {
                                    StringBuilder sb2 = new StringBuilder();
                                    for (int i25 = 0; i25 < arrayList10.size(); i25++) {
                                        sb2.append(arrayList10.get(i25).getClass().getSimpleName());
                                        sb2.append(", ");
                                    }
                                    a8.b("can't find message in updates " + ((Object) sb2));
                                }
                                z13 = true;
                                i13 = 0;
                            }
                            Utilities.d.c(new ew(azVar, updates4, 0));
                            z12 = z13;
                            i12 = i13;
                            z11 = z18;
                            azVar3 = azVar;
                        } else {
                            gjVar = gjVar3;
                            j3 = 0;
                            c10 = 4;
                            i11 = 2;
                            z11 = z16;
                            z12 = false;
                            i12 = 0;
                            azVar3 = azVar7;
                        }
                    }
                    if ((gj.n1(message6) instanceof TLRPC.TL_messageMediaGeoLive) && message6.via_bot_id == j3 && TextUtils.isEmpty(message6.via_bot_name)) {
                        rd locationController = azVar3.getLocationController();
                        ArrayList arrayList12 = locationController.b;
                        a0.h hVar4 = locationController.a;
                        qd qdVar = new qd();
                        c11 = c10;
                        i7 = i11;
                        qdVar.a = message6.dialog_id;
                        qdVar.b = message6.id;
                        TLRPC.MessageMedia messageMedia3 = message6.media;
                        qdVar.d = messageMedia3.period;
                        int i26 = messageMedia3.proximity_notification_radius;
                        qdVar.f = i26;
                        qdVar.g = i26;
                        int i27 = locationController.currentAccount;
                        qdVar.e = i27;
                        qdVar.h = new gj(i27, message6, false, false);
                        if (qdVar.d == Integer.MAX_VALUE) {
                            qdVar.c = ConnectionsManager.DEFAULT_DATACENTER_ID;
                        } else {
                            qdVar.c = locationController.getConnectionsManager().getCurrentTime() + qdVar.d;
                        }
                        qd qdVar2 = (qd) hVar4.f(qdVar.a);
                        hVar4.k(qdVar, qdVar.a);
                        if (qdVar2 != null) {
                            arrayList12.remove(qdVar2);
                        }
                        arrayList12.add(qdVar);
                        locationController.l(qdVar, 0);
                        locationController.w = SystemClock.elapsedRealtime() - 25000;
                        g0.g3(new zf(locationController, qdVar2, qdVar, 28));
                    } else {
                        c11 = c10;
                        i7 = i11;
                    }
                    if (z12) {
                        z14 = z16;
                        z10 = z12;
                        message3 = message6;
                    } else {
                        azVar3.getStatsController().k(t0.f(), 1, 1);
                        message6.send_state = 0;
                        long j12 = j3;
                        message6.errorNewPriceStars = j12;
                        message6.errorAllowedPriceStars = j12;
                        if (z16 != z11) {
                            ArrayList arrayList13 = new ArrayList();
                            arrayList13.add(Integer.valueOf(i10));
                            ArrayList arrayList14 = new ArrayList();
                            arrayList14.add(new gj(gjVar.K1, gjVar.k, true, true));
                            z14 = z16;
                            message3 = message6;
                            azVar3.getMessagesStorage().a.c(new fw(azVar3, arrayList5, z16, z11, message6, arrayList13, arrayList14, i10));
                            z10 = z12;
                        } else {
                            final boolean z20 = z16;
                            message3 = message6;
                            final int i28 = i10;
                            ls notificationCenter2 = azVar3.getNotificationCenter();
                            Integer valueOf = Integer.valueOf(i28);
                            Integer valueOf2 = Integer.valueOf(message3.id);
                            Long valueOf3 = Long.valueOf(message3.dialog_id);
                            Integer valueOf4 = Integer.valueOf(i12);
                            Boolean valueOf5 = Boolean.valueOf(z20);
                            z10 = z12;
                            Object[] objArr2 = new Object[7];
                            objArr2[0] = valueOf;
                            objArr2[1] = valueOf2;
                            objArr2[i7] = message3;
                            objArr2[3] = valueOf3;
                            objArr2[c11] = l10;
                            objArr2[5] = valueOf4;
                            objArr2[6] = valueOf5;
                            notificationCenter2.k(21, objArr2);
                            ls notificationCenter3 = azVar3.getNotificationCenter();
                            Integer valueOf6 = Integer.valueOf(i28);
                            Integer valueOf7 = Integer.valueOf(message3.id);
                            Long valueOf8 = Long.valueOf(message3.dialog_id);
                            Integer valueOf9 = Integer.valueOf(i12);
                            Boolean valueOf10 = Boolean.valueOf(z20);
                            Object[] objArr3 = new Object[7];
                            objArr3[0] = valueOf6;
                            objArr3[1] = valueOf7;
                            objArr3[i7] = message3;
                            objArr3[3] = valueOf8;
                            objArr3[c11] = l10;
                            objArr3[5] = valueOf9;
                            objArr3[6] = valueOf10;
                            notificationCenter3.k(22, objArr3);
                            azVar3.getMessagesStorage().a.c(new Runnable() { // from class: org.telegram.messenger.gw
                                /* JADX WARN: Removed duplicated region for block: B:7:0x0053  */
                                @Override // java.lang.Runnable
                                /*
                                    Code decompiled incorrectly, please refer to instructions dump.
                                */
                                public final void run() {
                                    int i29;
                                    int i30;
                                    TLRPC.Message message14 = message3;
                                    boolean d52 = gj.d5(message14);
                                    boolean z21 = z20;
                                    if (d52) {
                                        i29 = 9;
                                    } else {
                                        if (message14.quick_reply_shortcut_id == 0 && message14.quick_reply_shortcut == null) {
                                            i30 = z21 ? 1 : 0;
                                            az azVar12 = az.this;
                                            ur messagesStorage = azVar12.getMessagesStorage();
                                            long j13 = message14.random_id;
                                            long B1 = gj.B1(message14.peer_id);
                                            int i31 = i28;
                                            messagesStorage.a2(j13, B1, Integer.valueOf(i31), message14.id, 0, z21 ? 1 : 0, message14.quick_reply_shortcut_id);
                                            azVar12.getMessagesStorage().j1(arrayList5, true, false, false, 0, false, i30, message14.quick_reply_shortcut_id);
                                            int i32 = i30;
                                            if (gj.e3(message14)) {
                                                long B12 = gj.B1(message14.peer_id);
                                                ArrayList arrayList15 = new ArrayList(1);
                                                arrayList15.add(Integer.valueOf(message14.id));
                                                azVar12.getMessagesStorage().P0(B12, arrayList15, false, false, i32, (int) gj.Z1(azVar12.currentAccount, message14, 0));
                                                azVar12.getMessagesStorage().R1(B12, -B12, arrayList15, null);
                                                g0.g3(new kw(azVar12, B12, arrayList15, 0));
                                            }
                                            g0.g3(new bi.t4(azVar12, message14, i31, i12, z21));
                                        }
                                        i29 = 5;
                                    }
                                    i30 = i29;
                                    az azVar122 = az.this;
                                    ur messagesStorage2 = azVar122.getMessagesStorage();
                                    long j132 = message14.random_id;
                                    long B13 = gj.B1(message14.peer_id);
                                    int i312 = i28;
                                    messagesStorage2.a2(j132, B13, Integer.valueOf(i312), message14.id, 0, z21 ? 1 : 0, message14.quick_reply_shortcut_id);
                                    azVar122.getMessagesStorage().j1(arrayList5, true, false, false, 0, false, i30, message14.quick_reply_shortcut_id);
                                    int i322 = i30;
                                    if (gj.e3(message14)) {
                                    }
                                    g0.g3(new bi.t4(azVar122, message14, i312, i12, z21));
                                }
                            });
                            z14 = z20;
                        }
                    }
                    tL_error = tL_error2;
                    tLObject = tLObject2;
                    r52 = azVar3;
                    r62 = z14;
                } else {
                    gjVar = gjVar3;
                    az azVar12 = azVar5;
                    i7 = 2;
                    message3 = message6;
                    r62 = z16;
                    tL_error = tL_error4;
                    tLObject = tLObject6;
                    org.telegram.ui.Components.c5.c0(azVar12.currentAccount, tL_error, null, tLObject, new Object[0]);
                    z10 = true;
                    r52 = azVar12;
                }
                if (z10) {
                    r52.getMessagesStorage().N0(r62, message3);
                    message3.send_state = i7;
                    if (tL_error != null && (str = tL_error.text) != null && str.startsWith("ALLOW_PAYMENT_REQUIRED_")) {
                        di.y8.y(r52.currentAccount, false);
                        message3.errorAllowedPriceStars = di.y8.o(tLObject);
                        message3.errorNewPriceStars = Long.parseLong(tL_error.text.substring(23));
                        di.y8.y(r52.currentAccount, false).d0(Arrays.asList(gjVar));
                        r52.getMessagesStorage().X1(gj.B0(message3), message3);
                    }
                    r52.getNotificationCenter().k(23, Integer.valueOf(message3.id));
                    r52.d0(message3.id);
                    r52.i0(message3.id, r62);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ tx(az azVar, boolean z10, TLRPC.TL_error tL_error, TLRPC.Message message, TLObject tLObject, gj gjVar, HashMap hashMap, String str, TLObject tLObject2) {
        this.b = azVar;
        this.c = z10;
        this.d = tL_error;
        this.e = message;
        this.f = tLObject;
        this.h = gjVar;
        this.n = hashMap;
        this.r = str;
        this.s = tLObject2;
    }
}
