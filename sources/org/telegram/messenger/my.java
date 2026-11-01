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

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final /* synthetic */ class my implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ rz b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ TLRPC.TL_error d;
    public final /* synthetic */ TLRPC.Message e;
    public final /* synthetic */ TLObject f;
    public final /* synthetic */ kj h;
    public final /* synthetic */ HashMap n;
    public final /* synthetic */ String r;
    public final /* synthetic */ TLObject s;

    public /* synthetic */ my(rz rzVar, TLRPC.TL_error tL_error, TLRPC.Message message, TLObject tLObject, kj kjVar, String str, HashMap hashMap, boolean z10, TLObject tLObject2) {
        this.b = rzVar;
        this.d = tL_error;
        this.e = message;
        this.f = tLObject;
        this.h = kjVar;
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
        kj kjVar;
        ?? r62;
        TLRPC.TL_error tL_error;
        TLObject tLObject;
        boolean z10;
        rz rzVar;
        String str;
        int i10;
        TLObject tLObject2;
        Long l4;
        TLRPC.TL_error tL_error2;
        long j10;
        boolean z11;
        boolean z12;
        int i11;
        ?? r10;
        rz rzVar2;
        boolean z13;
        int i12;
        ArrayList<TLRPC.Update> arrayList;
        ArrayList arrayList2;
        String str2;
        boolean z14;
        TLRPC.Updates updates;
        rz rzVar3;
        TLRPC.MessageReplyHeader messageReplyHeader;
        long j11;
        ArrayList<TLRPC.Update> arrayList3;
        a0.h hVar;
        TLRPC.Message message4;
        rz rzVar4;
        ArrayList arrayList4;
        int i13;
        boolean z15;
        rz rzVar5;
        switch (this.a) {
            case 0:
                rz rzVar6 = this.b;
                TLRPC.TL_error tL_error3 = this.d;
                TLRPC.Message message5 = this.e;
                TLObject tLObject3 = this.f;
                kj kjVar2 = this.h;
                String str3 = this.r;
                HashMap hashMap = this.n;
                boolean z16 = this.c;
                TLObject tLObject4 = this.s;
                if (tL_error3 != null) {
                    org.telegram.ui.Components.s4.e0(rzVar6.currentAccount, tL_error3, null, tLObject4, new Object[0]);
                    rzVar6.i0(message5.id, z16);
                    rzVar6.l0(kjVar2);
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
                            ag.i3.f(rzVar6.currentAccount).j(update, kj.K1(message5), kj.J1(message5));
                            message2 = ((TL_update.TL_updateQuickReplyMessage) update).message;
                        }
                        message = message2;
                        if (message != null) {
                            ic.W(message);
                            rzVar6.z0(kjVar2, message, message.id, Collections.singletonList(str3), false, -1, hashMap);
                        }
                        Utilities.d.c(new wy(rzVar6, updates2, message5, z16, 0));
                        break;
                    }
                    message = null;
                    if (message != null) {
                    }
                    Utilities.d.c(new wy(rzVar6, updates2, message5, z16, 0));
                }
            default:
                rz rzVar7 = this.b;
                boolean z17 = this.c;
                TLRPC.TL_error tL_error4 = this.d;
                TLRPC.Message message6 = this.e;
                TLObject tLObject5 = this.f;
                kj kjVar3 = this.h;
                HashMap hashMap2 = this.n;
                String str5 = this.r;
                TLObject tLObject6 = this.s;
                if (tL_error4 == null) {
                    int i15 = message6.id;
                    ArrayList arrayList6 = new ArrayList();
                    boolean z18 = message6.date == 2147483646;
                    if (tLObject5 instanceof TLRPC.TL_updateShortSentMessage) {
                        TLRPC.TL_updateShortSentMessage tL_updateShortSentMessage = (TLRPC.TL_updateShortSentMessage) tLObject5;
                        i10 = i15;
                        tLObject2 = tLObject6;
                        l4 = 0L;
                        tL_error2 = tL_error4;
                        rzVar7.z0(kjVar3, null, tL_updateShortSentMessage.id, Collections.singletonList(null), false, -1, hashMap2);
                        rz rzVar8 = rzVar7;
                        int p12 = kjVar3.p1();
                        int i16 = tL_updateShortSentMessage.id;
                        message6.id = i16;
                        message6.local_id = i16;
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
                            ic.W(message6);
                        }
                        TLRPC.MessageMedia messageMedia2 = tL_updateShortSentMessage.media;
                        if (((messageMedia2 instanceof TLRPC.TL_messageMediaGame) || (messageMedia2 instanceof TLRPC.TL_messageMediaInvoice)) && !TextUtils.isEmpty(tL_updateShortSentMessage.message)) {
                            message6.message = tL_updateShortSentMessage.message;
                        }
                        if (!message6.entities.isEmpty()) {
                            message6.flags |= 128;
                        }
                        Integer num = (Integer) rzVar8.getMessagesController().P.get(Long.valueOf(message6.dialog_id));
                        if (num == null) {
                            num = Integer.valueOf(rzVar8.getMessagesStorage().U(message6.dialog_id, message6.out));
                            rzVar8.getMessagesController().P.put(Long.valueOf(message6.dialog_id), num);
                        }
                        message6.unread = num.intValue() < message6.id;
                        Utilities.d.c(new ir(17, rzVar8, tL_updateShortSentMessage));
                        arrayList6.add(message6);
                        i11 = p12;
                        j10 = 0;
                        z12 = false;
                        z11 = false;
                        kjVar = kjVar3;
                        rzVar4 = rzVar8;
                    } else {
                        i10 = i15;
                        HashMap hashMap3 = hashMap2;
                        tLObject2 = tLObject6;
                        l4 = 0L;
                        rz rzVar9 = rzVar7;
                        tL_error2 = tL_error4;
                        if (tLObject5 instanceof TLRPC.Updates) {
                            TLRPC.Updates updates3 = (TLRPC.Updates) tLObject5;
                            ArrayList<TLRPC.Update> arrayList7 = updates3.updates;
                            ArrayList arrayList8 = new ArrayList();
                            j10 = 0;
                            TLRPC.Message message7 = null;
                            a0.h hVar2 = null;
                            int i17 = 0;
                            boolean z19 = z17;
                            rz rzVar10 = rzVar9;
                            while (i17 < arrayList7.size()) {
                                TLRPC.Update update2 = arrayList7.get(i17);
                                HashMap hashMap4 = hashMap3;
                                if (update2 instanceof TL_update.TL_updateNewMessage) {
                                    TL_update.TL_updateNewMessage tL_updateNewMessage = (TL_update.TL_updateNewMessage) update2;
                                    TLRPC.Message message8 = tL_updateNewMessage.message;
                                    TLRPC.Updates updates4 = updates3;
                                    if (message8.action != null) {
                                        rzVar3 = rzVar10;
                                        arrayList = arrayList7;
                                        arrayList2 = arrayList8;
                                        str2 = str5;
                                        z14 = z19;
                                        updates = updates4;
                                        z19 = z14;
                                        i17++;
                                        arrayList7 = arrayList;
                                        arrayList8 = arrayList2;
                                        str5 = str2;
                                        rzVar10 = rzVar3;
                                        updates3 = updates;
                                        hashMap3 = hashMap4;
                                    } else {
                                        arrayList6.add(message8);
                                        Utilities.d.c(new sy(rzVar10, tL_updateNewMessage, 2));
                                        arrayList7.remove(i17);
                                        i17--;
                                        rzVar3 = rzVar10;
                                        arrayList = arrayList7;
                                        arrayList2 = arrayList8;
                                        updates = updates4;
                                        message7 = message8;
                                        str2 = str5;
                                        i17++;
                                        arrayList7 = arrayList;
                                        arrayList8 = arrayList2;
                                        str5 = str2;
                                        rzVar10 = rzVar3;
                                        updates3 = updates;
                                        hashMap3 = hashMap4;
                                    }
                                } else {
                                    TLRPC.Updates updates5 = updates3;
                                    if (update2 instanceof TL_update.TL_updateNewEphemeralMessage) {
                                        TL_update.TL_updateNewEphemeralMessage tL_updateNewEphemeralMessage = (TL_update.TL_updateNewEphemeralMessage) update2;
                                        TLRPC.TL_message b10 = rf.s.b(tL_updateNewEphemeralMessage.message);
                                        arrayList6.add(b10);
                                        arrayList8.add(tL_updateNewEphemeralMessage.message);
                                        arrayList7.remove(i17);
                                        i17--;
                                        message7 = b10;
                                        rzVar3 = rzVar10;
                                        arrayList = arrayList7;
                                        arrayList2 = arrayList8;
                                        str2 = str5;
                                        updates = updates5;
                                    } else if (update2 instanceof TL_update.TL_updateNewChannelMessage) {
                                        TL_update.TL_updateNewChannelMessage tL_updateNewChannelMessage = (TL_update.TL_updateNewChannelMessage) update2;
                                        ArrayList arrayList9 = arrayList8;
                                        long U1 = wp.U1(tL_updateNewChannelMessage);
                                        TLRPC.Chat L0 = rzVar10.getMessagesController().L0(Long.valueOf(U1));
                                        if (!(L0 == null || L0.megagroup) || (messageReplyHeader = tL_updateNewChannelMessage.message.reply_to) == null || (messageReplyHeader.reply_to_top_id == 0 && messageReplyHeader.reply_to_msg_id == 0)) {
                                            j11 = U1;
                                        } else {
                                            if (hVar2 == null) {
                                                hVar2 = new a0.h();
                                            }
                                            j11 = U1;
                                            long B0 = kj.B0(tL_updateNewChannelMessage.message);
                                            SparseArray sparseArray = (SparseArray) hVar2.f(B0);
                                            if (sparseArray == null) {
                                                sparseArray = new SparseArray();
                                                hVar2.k(sparseArray, B0);
                                            }
                                            TLRPC.MessageReplyHeader messageReplyHeader2 = tL_updateNewChannelMessage.message.reply_to;
                                            int i18 = messageReplyHeader2.reply_to_top_id;
                                            if (i18 == 0) {
                                                i18 = messageReplyHeader2.reply_to_msg_id;
                                            }
                                            TLRPC.MessageReplies messageReplies = (TLRPC.MessageReplies) sparseArray.get(i18);
                                            if (messageReplies == null) {
                                                messageReplies = new TLRPC.TL_messageReplies();
                                                sparseArray.put(i18, messageReplies);
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
                                        Utilities.d.c(new uw(rzVar10, tL_updateNewChannelMessage, 0));
                                        arrayList7.remove(i17);
                                        i17--;
                                        if (tL_updateNewChannelMessage.message.pinned) {
                                            arrayList3 = arrayList7;
                                            arrayList2 = arrayList9;
                                            updates = updates5;
                                            message4 = message9;
                                            long j12 = j11;
                                            str2 = str5;
                                            hVar = hVar3;
                                            Utilities.d.c(new vw(rzVar10, tL_updateNewChannelMessage, j12, 0));
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
                                        rzVar3 = rzVar10;
                                    } else {
                                        arrayList = arrayList7;
                                        arrayList2 = arrayList8;
                                        str2 = str5;
                                        z14 = z19;
                                        updates = updates5;
                                        if (update2 instanceof TL_update.TL_updateNewScheduledMessage) {
                                            TL_update.TL_updateNewScheduledMessage tL_updateNewScheduledMessage = (TL_update.TL_updateNewScheduledMessage) update2;
                                            int i19 = 0;
                                            while (true) {
                                                if (i19 < arrayList6.size()) {
                                                    if (((TLRPC.Message) arrayList6.get(i19)).id == tL_updateNewScheduledMessage.message.id) {
                                                        arrayList6.remove(i19);
                                                    } else {
                                                        i19++;
                                                    }
                                                }
                                            }
                                            TLRPC.Message message10 = tL_updateNewScheduledMessage.message;
                                            arrayList6.add(message10);
                                            arrayList.remove(i17);
                                            i17--;
                                            rzVar3 = rzVar10;
                                            message7 = message10;
                                            z19 = true;
                                        } else if (update2 instanceof TL_update.TL_updateQuickReplyMessage) {
                                            ag.i3.f(rzVar10.currentAccount).j(update2, kj.K1(kjVar3.k), kj.J1(kjVar3.k));
                                            TLRPC.Message message11 = ((TL_update.TL_updateQuickReplyMessage) update2).message;
                                            arrayList6.add(message11);
                                            arrayList.remove(i17);
                                            i17--;
                                            rzVar3 = rzVar10;
                                            z19 = z14;
                                            message7 = message11;
                                        } else {
                                            if (update2 instanceof TL_update.TL_updateDeleteScheduledMessages) {
                                                TL_update.TL_updateDeleteScheduledMessages tL_updateDeleteScheduledMessages = (TL_update.TL_updateDeleteScheduledMessages) update2;
                                                if (kj.B0(kjVar3.k) == o5.o(tL_updateDeleteScheduledMessages.peer)) {
                                                    ArrayList<Integer> arrayList10 = tL_updateDeleteScheduledMessages.messages;
                                                    int size = arrayList10.size();
                                                    int i20 = 0;
                                                    rz rzVar11 = rzVar10;
                                                    while (i20 < size) {
                                                        Integer num2 = arrayList10.get(i20);
                                                        i20++;
                                                        int intValue = num2.intValue();
                                                        rz rzVar12 = rzVar11;
                                                        int i21 = 0;
                                                        while (true) {
                                                            if (i21 >= arrayList6.size()) {
                                                                break;
                                                            } else if (((TLRPC.Message) arrayList6.get(i21)).id == intValue) {
                                                                arrayList6.remove(i21);
                                                            } else {
                                                                i21++;
                                                            }
                                                        }
                                                        rzVar11 = rzVar12;
                                                    }
                                                    rzVar3 = rzVar11;
                                                    arrayList.remove(i17);
                                                    i17--;
                                                    z19 = false;
                                                }
                                            }
                                            rzVar3 = rzVar10;
                                            z19 = z14;
                                        }
                                    }
                                    i17++;
                                    arrayList7 = arrayList;
                                    arrayList8 = arrayList2;
                                    str5 = str2;
                                    rzVar10 = rzVar3;
                                    updates3 = updates;
                                    hashMap3 = hashMap4;
                                }
                            }
                            HashMap hashMap5 = hashMap3;
                            TLRPC.Updates updates6 = updates3;
                            rz rzVar13 = rzVar10;
                            ArrayList<TLRPC.Update> arrayList11 = arrayList7;
                            ArrayList arrayList12 = arrayList8;
                            String str6 = str5;
                            boolean z20 = z19;
                            if (arrayList12.isEmpty()) {
                                r10 = 1;
                            } else {
                                r10 = 1;
                                rzVar13.getMessagesStorage().f1(arrayList12, true);
                            }
                            if (hVar2 != null) {
                                rzVar13.getMessagesStorage().a1(null, null, hVar2, r10);
                                at notificationCenter = rzVar13.getNotificationCenter();
                                Object[] objArr = new Object[4];
                                objArr[0] = null;
                                objArr[r10] = null;
                                objArr[2] = hVar2;
                                objArr[3] = Boolean.TRUE;
                                notificationCenter.k(77, objArr);
                            }
                            if (message7 != null) {
                                kj.B0(message7);
                                boolean z21 = (!z18 || message7.date == 2147483646) ? z20 : false;
                                ic.W(message7);
                                if (!z21) {
                                    Integer num3 = (Integer) rzVar13.getMessagesController().P.get(Long.valueOf(message7.dialog_id));
                                    if (num3 == null) {
                                        num3 = Integer.valueOf(rzVar13.getMessagesStorage().U(message7.dialog_id, message7.out));
                                        rzVar13.getMessagesController().P.put(Long.valueOf(message7.dialog_id), num3);
                                    }
                                    message7.unread = num3.intValue() < message7.id;
                                }
                                TLRPC.Message message12 = kjVar3.k;
                                message12.post_author = message7.post_author;
                                if ((message7.flags & 33554432) != 0) {
                                    message12.ttl_period = message7.ttl_period;
                                    message12.flags |= 33554432;
                                }
                                message12.entities = message7.entities;
                                int i22 = message7.quick_reply_shortcut_id;
                                message12.quick_reply_shortcut_id = i22;
                                if (i22 != 0) {
                                    message12.flags |= TLObject.FLAG_30;
                                }
                                TLRPC.Message message13 = message7;
                                rzVar13.z0(kjVar3, message13, message7.id, Collections.singletonList(str6), false, -1, hashMap5);
                                kjVar = kjVar3;
                                rzVar2 = rzVar13;
                                int p13 = kjVar.p1();
                                message6.id = message13.id;
                                i12 = p13;
                                z20 = z21;
                                z13 = false;
                            } else {
                                kjVar = kjVar3;
                                rzVar2 = rzVar13;
                                if (v2.a) {
                                    StringBuilder sb2 = new StringBuilder();
                                    for (int i23 = 0; i23 < arrayList11.size(); i23++) {
                                        sb2.append(arrayList11.get(i23).getClass().getSimpleName());
                                        sb2.append(", ");
                                    }
                                    f8.b("can't find message in updates " + ((Object) sb2));
                                }
                                z13 = true;
                                i12 = 0;
                            }
                            Utilities.d.c(new ww(rzVar2, updates6, 0));
                            z12 = z13;
                            z11 = z20;
                            i11 = i12;
                            rzVar4 = rzVar2;
                        } else {
                            j10 = 0;
                            kjVar = kjVar3;
                            z11 = z17;
                            z12 = false;
                            i11 = 0;
                            rzVar4 = rzVar9;
                        }
                    }
                    if ((kj.o1(message6) instanceof TLRPC.TL_messageMediaGeoLive) && message6.via_bot_id == j10 && TextUtils.isEmpty(message6.via_bot_name)) {
                        od locationController = rzVar4.getLocationController();
                        ArrayList arrayList13 = locationController.b;
                        a0.h hVar4 = locationController.a;
                        nd ndVar = new nd();
                        z10 = z12;
                        ndVar.a = message6.dialog_id;
                        ndVar.b = message6.id;
                        TLRPC.MessageMedia messageMedia3 = message6.media;
                        ndVar.d = messageMedia3.period;
                        int i24 = messageMedia3.proximity_notification_radius;
                        ndVar.f = i24;
                        ndVar.g = i24;
                        int i25 = locationController.currentAccount;
                        ndVar.e = i25;
                        ndVar.h = new kj(i25, message6, false, false);
                        if (ndVar.d == Integer.MAX_VALUE) {
                            ndVar.c = ConnectionsManager.DEFAULT_DATACENTER_ID;
                        } else {
                            ndVar.c = locationController.getConnectionsManager().getCurrentTime() + ndVar.d;
                        }
                        nd ndVar2 = (nd) hVar4.f(ndVar.a);
                        i13 = i11;
                        arrayList4 = arrayList6;
                        hVar4.k(ndVar, ndVar.a);
                        if (ndVar2 != null) {
                            arrayList13.remove(ndVar2);
                        }
                        arrayList13.add(ndVar);
                        locationController.l(ndVar, 0);
                        locationController.w = SystemClock.elapsedRealtime() - 25000;
                        i0.g3(new ng(locationController, ndVar2, ndVar, 28));
                    } else {
                        z10 = z12;
                        arrayList4 = arrayList6;
                        i13 = i11;
                    }
                    if (z10) {
                        z15 = z17;
                        message3 = message6;
                        rzVar5 = rzVar4;
                    } else {
                        rzVar4.getStatsController().k(w0.f(), 1, 1);
                        message6.send_state = 0;
                        long j13 = j10;
                        message6.errorNewPriceStars = j13;
                        message6.errorAllowedPriceStars = j13;
                        if (z17 != z11) {
                            ArrayList arrayList14 = new ArrayList();
                            arrayList14.add(Integer.valueOf(i10));
                            ArrayList arrayList15 = new ArrayList();
                            arrayList15.add(new kj(kjVar.I1, kjVar.k, true, true));
                            z15 = z17;
                            message3 = message6;
                            rzVar4.getMessagesStorage().a.c(new xw(rzVar4, arrayList4, z17, z11, message6, arrayList14, arrayList15, i10));
                            rzVar5 = rzVar4;
                        } else {
                            final boolean z22 = z17;
                            message3 = message6;
                            final int i26 = i10;
                            rzVar4.getNotificationCenter().k(21, Integer.valueOf(i26), Integer.valueOf(message3.id), message3, Long.valueOf(message3.dialog_id), l4, Integer.valueOf(i13), Boolean.valueOf(z22));
                            rz rzVar14 = rzVar4;
                            rzVar4.getNotificationCenter().k(22, Integer.valueOf(i26), Integer.valueOf(message3.id), message3, Long.valueOf(message3.dialog_id), l4, Integer.valueOf(i13), Boolean.valueOf(z22));
                            final int i27 = i13;
                            final ArrayList arrayList16 = arrayList4;
                            final rz rzVar15 = rzVar14;
                            rzVar14.getMessagesStorage().a.c(new Runnable() { // from class: org.telegram.messenger.yw
                                /* JADX WARN: Removed duplicated region for block: B:7:0x0053  */
                                @Override // java.lang.Runnable
                                /*
                                    Code decompiled incorrectly, please refer to instructions dump.
                                */
                                public final void run() {
                                    int i28;
                                    int i29;
                                    TLRPC.Message message14 = message3;
                                    boolean d52 = kj.d5(message14);
                                    boolean z23 = z22;
                                    if (d52) {
                                        i28 = 9;
                                    } else {
                                        if (message14.quick_reply_shortcut_id == 0 && message14.quick_reply_shortcut == null) {
                                            i29 = z23 ? 1 : 0;
                                            rz rzVar16 = rz.this;
                                            is messagesStorage = rzVar16.getMessagesStorage();
                                            long j14 = message14.random_id;
                                            long C1 = kj.C1(message14.peer_id);
                                            int i30 = i26;
                                            messagesStorage.a2(j14, C1, Integer.valueOf(i30), message14.id, 0, z23 ? 1 : 0, message14.quick_reply_shortcut_id);
                                            rzVar16.getMessagesStorage().j1(arrayList16, true, false, false, 0, false, i29, message14.quick_reply_shortcut_id);
                                            int i31 = i29;
                                            if (kj.e3(message14)) {
                                                long C12 = kj.C1(message14.peer_id);
                                                ArrayList arrayList17 = new ArrayList(1);
                                                arrayList17.add(Integer.valueOf(message14.id));
                                                rzVar16.getMessagesStorage().P0(C12, arrayList17, false, false, i31, (int) kj.a2(rzVar16.currentAccount, message14, 0));
                                                rzVar16.getMessagesStorage().R1(C12, -C12, arrayList17, null);
                                                i0.g3(new dx(rzVar16, C12, arrayList17, 0));
                                            }
                                            i0.g3(new ex(rzVar16, message14, i30, i27, z23));
                                        }
                                        i28 = 5;
                                    }
                                    i29 = i28;
                                    rz rzVar162 = rz.this;
                                    is messagesStorage2 = rzVar162.getMessagesStorage();
                                    long j142 = message14.random_id;
                                    long C13 = kj.C1(message14.peer_id);
                                    int i302 = i26;
                                    messagesStorage2.a2(j142, C13, Integer.valueOf(i302), message14.id, 0, z23 ? 1 : 0, message14.quick_reply_shortcut_id);
                                    rzVar162.getMessagesStorage().j1(arrayList16, true, false, false, 0, false, i29, message14.quick_reply_shortcut_id);
                                    int i312 = i29;
                                    if (kj.e3(message14)) {
                                    }
                                    i0.g3(new ex(rzVar162, message14, i302, i27, z23));
                                }
                            });
                            rzVar5 = rzVar15;
                            z15 = z22;
                        }
                    }
                    tL_error = tL_error2;
                    tLObject = tLObject2;
                    rzVar = rzVar5;
                    r62 = z15;
                } else {
                    message3 = message6;
                    kjVar = kjVar3;
                    rz rzVar16 = rzVar7;
                    r62 = z17;
                    tL_error = tL_error4;
                    tLObject = tLObject6;
                    org.telegram.ui.Components.s4.e0(rzVar16.currentAccount, tL_error, null, tLObject, new Object[0]);
                    z10 = true;
                    rzVar = rzVar16;
                }
                if (z10) {
                    rzVar.getMessagesStorage().N0(r62, message3);
                    message3.send_state = 2;
                    if (tL_error != null && (str = tL_error.text) != null && str.startsWith("ALLOW_PAYMENT_REQUIRED_")) {
                        rh.e6.y(rzVar.currentAccount, false);
                        message3.errorAllowedPriceStars = rh.e6.o(tLObject);
                        message3.errorNewPriceStars = Long.parseLong(tL_error.text.substring(23));
                        rh.e6.y(rzVar.currentAccount, false).d0(Arrays.asList(kjVar));
                        rzVar.getMessagesStorage().X1(kj.B0(message3), message3);
                    }
                    rzVar.getNotificationCenter().k(23, Integer.valueOf(message3.id));
                    rzVar.d0(message3.id);
                    rzVar.i0(message3.id, r62);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ my(rz rzVar, boolean z10, TLRPC.TL_error tL_error, TLRPC.Message message, TLObject tLObject, kj kjVar, HashMap hashMap, String str, TLObject tLObject2) {
        this.b = rzVar;
        this.c = z10;
        this.d = tL_error;
        this.e = message;
        this.f = tLObject;
        this.h = kjVar;
        this.n = hashMap;
        this.r = str;
        this.s = tLObject2;
    }
}
