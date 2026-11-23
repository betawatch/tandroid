package org.telegram.messenger;

import android.graphics.Typeface;
import android.util.SparseArray;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes.dex */
public final /* synthetic */ class ym implements Runnable {
    public final /* synthetic */ np a;
    public final /* synthetic */ TLRPC.TL_messages_dialogs b;
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ TLRPC.messages_Dialogs d;
    public final /* synthetic */ int e;
    public final /* synthetic */ ArrayList f;
    public final /* synthetic */ ArrayList h;
    public final /* synthetic */ ArrayList n;
    public final /* synthetic */ Runnable r;

    public /* synthetic */ ym(np npVar, TLRPC.TL_messages_dialogs tL_messages_dialogs, ArrayList arrayList, TLRPC.messages_Dialogs messages_dialogs, int i7, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, Runnable runnable) {
        this.a = npVar;
        this.b = tL_messages_dialogs;
        this.c = arrayList;
        this.d = messages_dialogs;
        this.e = i7;
        this.f = arrayList2;
        this.h = arrayList3;
        this.n = arrayList4;
        this.r = runnable;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00b2, code lost:
    
        if (r12 == (-r11.id)) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00c9, code lost:
    
        if (r11.migrated_to != null) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00f7  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        TLRPC.TL_messages_dialogs tL_messages_dialogs;
        SparseArray sparseArray;
        np npVar;
        ConcurrentHashMap concurrentHashMap;
        np npVar2;
        TLRPC.User user;
        SparseArray sparseArray2;
        TLRPC.Chat chat;
        Integer num;
        Integer num2;
        ArrayList arrayList;
        TLRPC.Message message;
        int i7;
        Integer num3;
        long B0;
        ArrayList arrayList2;
        np npVar3 = this.a;
        ConcurrentHashMap concurrentHashMap2 = npVar3.Q;
        ConcurrentHashMap concurrentHashMap3 = npVar3.P;
        final a0.h hVar = new a0.h();
        final a0.h hVar2 = new a0.h();
        a0.h hVar3 = new a0.h();
        a0.h hVar4 = new a0.h();
        Integer num4 = 0;
        int i10 = 0;
        while (true) {
            tL_messages_dialogs = this.b;
            if (i10 >= tL_messages_dialogs.users.size()) {
                break;
            }
            TLRPC.User user2 = tL_messages_dialogs.users.get(i10);
            hVar3.k(user2, user2.id);
            i10++;
        }
        for (int i11 = 0; i11 < tL_messages_dialogs.chats.size(); i11++) {
            TLRPC.Chat chat2 = tL_messages_dialogs.chats.get(i11);
            hVar4.k(chat2, chat2.id);
        }
        final ArrayList arrayList3 = this.c;
        if (arrayList3 != null) {
            sparseArray = new SparseArray();
            int size = arrayList3.size();
            for (int i12 = 0; i12 < size; i12++) {
                TLRPC.EncryptedChat encryptedChat = (TLRPC.EncryptedChat) arrayList3.get(i12);
                sparseArray.put(encryptedChat.id, encryptedChat);
            }
        } else {
            sparseArray = null;
        }
        ArrayList arrayList4 = new ArrayList();
        int i13 = 0;
        while (i13 < tL_messages_dialogs.messages.size()) {
            TLRPC.Message message2 = tL_messages_dialogs.messages.get(i13);
            TLRPC.Peer peer = message2.peer_id;
            int i14 = i13;
            long j3 = peer.channel_id;
            if (j3 != 0) {
                TLRPC.Chat chat3 = (TLRPC.Chat) hVar4.f(j3);
                if (chat3 != null && chat3.left) {
                    long j10 = npVar3.C2;
                    if (j10 != 0) {
                    }
                    arrayList2 = arrayList4;
                    num3 = num4;
                }
                num3 = num4;
                gj gjVar = new gj(npVar3.currentAccount, message2, hVar3, hVar4, false, false);
                arrayList4.add(gjVar);
                B0 = gj.B0(gjVar.k);
                if (hVar2.d(B0)) {
                    arrayList2 = arrayList4;
                    ArrayList arrayList5 = new ArrayList(1);
                    arrayList5.add(gjVar);
                    hVar2.k(arrayList5, B0);
                } else {
                    ((ArrayList) hVar2.f(B0)).add(gjVar);
                    arrayList2 = arrayList4;
                }
            } else {
                long j11 = peer.chat_id;
                if (j11 != 0) {
                    TLRPC.Chat chat4 = (TLRPC.Chat) hVar4.f(j11);
                    if (chat4 != null) {
                    }
                }
                num3 = num4;
                gj gjVar2 = new gj(npVar3.currentAccount, message2, hVar3, hVar4, false, false);
                arrayList4.add(gjVar2);
                B0 = gj.B0(gjVar2.k);
                if (hVar2.d(B0)) {
                }
            }
            i13 = i14 + 1;
            arrayList4 = arrayList2;
            num4 = num3;
        }
        Integer num5 = num4;
        int i15 = 0;
        while (i15 < tL_messages_dialogs.dialogs.size()) {
            TLRPC.Dialog dialog = tL_messages_dialogs.dialogs.get(i15);
            n5.x(dialog);
            long j12 = dialog.id;
            if (j12 == 0 || (n5.C(j12) && sparseArray != null && sparseArray.get((int) (dialog.id & 4294967295L)) == null)) {
                sparseArray2 = sparseArray;
            } else {
                long j13 = npVar3.C2;
                if (j13 != 0) {
                    sparseArray2 = sparseArray;
                    if (j13 == dialog.id) {
                        npVar3.A2 = dialog;
                    }
                } else {
                    sparseArray2 = sparseArray;
                }
                if (dialog.last_message_date == 0 && (arrayList = (ArrayList) hVar2.f(dialog.id)) != null) {
                    int i16 = TLObject.FLAG_31;
                    for (int i17 = 0; i17 < arrayList.size(); i17++) {
                        gj gjVar3 = (gj) arrayList.get(i17);
                        if (gjVar3 != null && (message = gjVar3.k) != null && i16 < (i7 = message.date)) {
                            i16 = i7;
                        }
                    }
                    if (i16 > Integer.MIN_VALUE) {
                        dialog.last_message_date = i16;
                    }
                }
                if (n5.y(dialog)) {
                    TLRPC.Chat chat5 = (TLRPC.Chat) hVar4.f(-dialog.id);
                    if (chat5 != null && chat5.left) {
                        long j14 = npVar3.C2;
                        if (j14 != 0) {
                            if (j14 != dialog.id) {
                            }
                        }
                    }
                    npVar3.Z0.put(-dialog.id, dialog.pts);
                    hVar.k(dialog, dialog.id);
                    num = (Integer) concurrentHashMap3.get(Long.valueOf(dialog.id));
                    if (num == null) {
                        num = num5;
                    }
                    concurrentHashMap3.put(Long.valueOf(dialog.id), Integer.valueOf(Math.max(num.intValue(), dialog.read_inbox_max_id)));
                    num2 = (Integer) concurrentHashMap2.get(Long.valueOf(dialog.id));
                    if (num2 == null) {
                        num2 = num5;
                    }
                    concurrentHashMap2.put(Long.valueOf(dialog.id), Integer.valueOf(Math.max(num2.intValue(), dialog.read_outbox_max_id)));
                } else {
                    long j15 = dialog.id;
                    if (j15 < 0 && (chat = (TLRPC.Chat) hVar4.f(-j15)) != null && chat.migrated_to != null) {
                    }
                    hVar.k(dialog, dialog.id);
                    num = (Integer) concurrentHashMap3.get(Long.valueOf(dialog.id));
                    if (num == null) {
                    }
                    concurrentHashMap3.put(Long.valueOf(dialog.id), Integer.valueOf(Math.max(num.intValue(), dialog.read_inbox_max_id)));
                    num2 = (Integer) concurrentHashMap2.get(Long.valueOf(dialog.id));
                    if (num2 == null) {
                    }
                    concurrentHashMap2.put(Long.valueOf(dialog.id), Integer.valueOf(Math.max(num2.intValue(), dialog.read_outbox_max_id)));
                }
            }
            i15++;
            sparseArray = sparseArray2;
        }
        final TLRPC.messages_Dialogs messages_dialogs = this.d;
        if (messages_dialogs == null || messages_dialogs.dialogs.isEmpty()) {
            npVar = npVar3;
        } else {
            fc.X(messages_dialogs.messages);
            int i18 = 0;
            while (i18 < messages_dialogs.messages.size()) {
                TLRPC.Message message3 = messages_dialogs.messages.get(i18);
                TLRPC.MessageAction messageAction = message3.action;
                if ((messageAction instanceof TLRPC.TL_messageActionChatDeleteUser) && (user = (TLRPC.User) hVar3.f(messageAction.user_id)) != null && user.bot) {
                    message3.reply_markup = new TLRPC.TL_replyKeyboardHide();
                    message3.flags |= 64;
                }
                TLRPC.MessageAction messageAction2 = message3.action;
                if ((messageAction2 instanceof TLRPC.TL_messageActionChatMigrateTo) || (messageAction2 instanceof TLRPC.TL_messageActionChannelCreate)) {
                    concurrentHashMap = concurrentHashMap2;
                    npVar2 = npVar3;
                    message3.unread = false;
                    message3.media_unread = false;
                } else {
                    ConcurrentHashMap concurrentHashMap4 = message3.out ? concurrentHashMap2 : concurrentHashMap3;
                    Integer num6 = (Integer) concurrentHashMap4.get(Long.valueOf(message3.dialog_id));
                    if (num6 == null) {
                        concurrentHashMap = concurrentHashMap2;
                        npVar2 = npVar3;
                        num6 = Integer.valueOf(npVar3.getMessagesStorage().U(message3.dialog_id, message3.out));
                        concurrentHashMap4.put(Long.valueOf(message3.dialog_id), num6);
                    } else {
                        concurrentHashMap = concurrentHashMap2;
                        npVar2 = npVar3;
                    }
                    message3.unread = num6.intValue() < message3.id;
                }
                i18++;
                npVar3 = npVar2;
                concurrentHashMap2 = concurrentHashMap;
            }
            npVar = npVar3;
            npVar.getMessagesStorage().d1(messages_dialogs, 0);
        }
        final int i19 = this.e;
        final ArrayList arrayList6 = this.f;
        final ArrayList arrayList7 = this.h;
        final ArrayList arrayList8 = this.n;
        final Runnable runnable = this.r;
        final np npVar4 = npVar;
        g0.g3(new Runnable() { // from class: org.telegram.messenger.ln
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r2v1 */
            /* JADX WARN: Type inference failed for: r2v4 */
            @Override // java.lang.Runnable
            public final void run() {
                np npVar5;
                int i20;
                int i21;
                TLRPC.messages_Dialogs messages_dialogs2;
                int i22;
                int i23;
                np npVar6;
                np npVar7;
                ln lnVar = this;
                np npVar8 = np.this;
                ArrayList arrayList9 = npVar8.y;
                a10 a10Var = npVar8.v7;
                SparseArray sparseArray3 = npVar8.T0;
                a0.h hVar5 = npVar8.S;
                a0.h hVar6 = npVar8.T;
                SparseArray sparseArray4 = npVar8.V;
                a0.h hVar7 = npVar8.R;
                int i24 = i19;
                boolean z10 = true;
                if (i24 != 2) {
                    npVar8.Q0 = arrayList6;
                    sparseArray3.clear();
                    int size2 = npVar8.Q0.size();
                    for (int i25 = 0; i25 < size2; i25++) {
                        so soVar = (so) npVar8.Q0.get(i25);
                        sparseArray3.put(soVar.a, soVar);
                    }
                    Iterator it = npVar8.F7.iterator();
                    boolean z11 = false;
                    while (it.hasNext()) {
                        int intValue = ((Integer) it.next()).intValue();
                        if (intValue != 0 && sparseArray3.get(intValue) == null) {
                            it.remove();
                            z11 = true;
                        }
                    }
                    if (z11) {
                        npVar8.I4();
                    }
                    Collections.sort(npVar8.Q0, new el(4));
                    npVar8.f4(arrayList7, true);
                    npVar8.Z3(arrayList8, true);
                    npVar8.V0 = true;
                    npVar8.getNotificationCenter().k(ls.O2, new Object[0]);
                    if (i24 == 0) {
                        npVar8.i3(false, null);
                    }
                    TLRPC.messages_Dialogs messages_dialogs3 = messages_dialogs;
                    if (messages_dialogs3 != null && !messages_dialogs3.dialogs.isEmpty()) {
                        npVar8.r(messages_dialogs3.dialogs);
                    }
                    ArrayList arrayList10 = arrayList3;
                    if (arrayList10 != null) {
                        int i26 = 0;
                        while (i26 < arrayList10.size()) {
                            TLRPC.EncryptedChat encryptedChat2 = (TLRPC.EncryptedChat) arrayList10.get(i26);
                            if (encryptedChat2 instanceof TLRPC.TL_encryptedChat) {
                                int i27 = encryptedChat2.layer;
                                Typeface typeface = g0.a;
                                if ((i27 & 65535) < 151) {
                                    npVar8.getSecretChatHelper().w(encryptedChat2, null);
                                }
                                z10 = true;
                            }
                            npVar8.b4(encryptedChat2, z10);
                            i26++;
                            z10 = true;
                        }
                    }
                    int i28 = 0;
                    while (true) {
                        a0.h hVar8 = hVar;
                        if (i28 >= hVar8.m()) {
                            break;
                        }
                        long j16 = hVar8.j(i28);
                        TLRPC.Dialog dialog2 = (TLRPC.Dialog) hVar8.n(i28);
                        TLRPC.Dialog dialog3 = (TLRPC.Dialog) hVar7.f(j16);
                        if (messages_dialogs3 == null || !messages_dialogs3.dialogs.contains(dialog2)) {
                            messages_dialogs2 = messages_dialogs3;
                            i22 = i24;
                        } else {
                            messages_dialogs2 = messages_dialogs3;
                            i22 = i24;
                            npVar8.getMediaDataController().D1(dialog2.id, 0L, dialog2.draft);
                            if (dialog2.draft instanceof TLRPC.TL_draftMessage) {
                                npVar8.getMediaDataController().W1(dialog2.id, 0L, dialog2.draft, null, false);
                            }
                            if (dialog3 != null) {
                                dialog3.notify_settings = dialog2.notify_settings;
                            }
                        }
                        ArrayList arrayList11 = (ArrayList) hVar2.f(dialog2.id);
                        if (dialog3 == null) {
                            hVar7.k(dialog2, j16);
                            hVar5.k(arrayList11, j16);
                            if (arrayList11 != null) {
                                for (int i29 = 0; i29 < arrayList11.size(); i29++) {
                                    gj gjVar4 = (gj) arrayList11.get(i29);
                                    if (gjVar4 != null && gjVar4.k.peer_id.channel_id == 0) {
                                        sparseArray4.put(gjVar4.e1(), gjVar4);
                                        long j17 = gjVar4.k.random_id;
                                        if (j17 != 0) {
                                            hVar6.k(gjVar4, j17);
                                        }
                                    }
                                }
                            }
                            a10Var.d(j16);
                            npVar6 = npVar8;
                            i23 = i28;
                        } else {
                            dialog3.pinned = dialog2.pinned;
                            dialog3.pinnedNum = dialog2.pinnedNum;
                            ArrayList arrayList12 = (ArrayList) hVar5.f(j16);
                            int i30 = 0;
                            while (true) {
                                i23 = i28;
                                if (arrayList12 == null || i30 >= arrayList12.size()) {
                                    break;
                                }
                                if (arrayList12.get(i30) != null && ((gj) arrayList12.get(i30)).Z) {
                                    break;
                                }
                                i30++;
                                i28 = i23;
                            }
                            if (arrayList12 != null && dialog3.top_message <= 0) {
                                hVar7.k(dialog2, j16);
                                hVar5.k(arrayList11, j16);
                                int i31 = 0;
                                while (i31 < arrayList12.size()) {
                                    gj gjVar5 = (gj) arrayList12.get(i31);
                                    if (gjVar5 == null) {
                                        npVar7 = npVar8;
                                    } else {
                                        npVar7 = npVar8;
                                        if (gjVar5.k.peer_id.channel_id == 0) {
                                            sparseArray4.remove(gjVar5.e1());
                                        }
                                        long j18 = gjVar5.k.random_id;
                                        if (j18 != 0) {
                                            hVar6.l(j18);
                                        }
                                    }
                                    i31++;
                                    npVar8 = npVar7;
                                }
                                npVar6 = npVar8;
                                if (arrayList11 != null) {
                                    for (int i32 = 0; i32 < arrayList11.size(); i32++) {
                                        gj gjVar6 = (gj) arrayList11.get(i32);
                                        if (gjVar6 != null && gjVar6.k.peer_id.channel_id == 0) {
                                            int i33 = 0;
                                            while (true) {
                                                if (i33 >= arrayList12.size()) {
                                                    break;
                                                }
                                                gj gjVar7 = (gj) arrayList12.get(i33);
                                                if (gjVar7 != null && gjVar7.e1() == gjVar6.e1()) {
                                                    gjVar6.Z = gjVar7.Z;
                                                    break;
                                                }
                                                i33++;
                                            }
                                            sparseArray4.put(gjVar6.e1(), gjVar6);
                                            long j19 = gjVar6.k.random_id;
                                            if (j19 != 0) {
                                                hVar6.k(gjVar6, j19);
                                            }
                                        }
                                    }
                                }
                                a10Var.d(j16);
                            }
                            npVar6 = npVar8;
                            if (dialog2.top_message < dialog3.top_message) {
                                if ((arrayList12 == null) == (arrayList11 == null)) {
                                    if (arrayList12 != null) {
                                        if (arrayList11 != null) {
                                            if (arrayList12.size() == arrayList11.size()) {
                                            }
                                        }
                                    }
                                }
                            }
                            hVar7.k(dialog2, j16);
                            hVar5.k(arrayList11, j16);
                            if (arrayList12 != null) {
                                for (int i34 = 0; i34 < arrayList12.size(); i34++) {
                                    gj gjVar8 = (gj) arrayList12.get(i34);
                                    if (gjVar8 != null) {
                                        if (gjVar8.k.peer_id.channel_id == 0) {
                                            sparseArray4.remove(gjVar8.e1());
                                        }
                                        long j20 = gjVar8.k.random_id;
                                        if (j20 != 0) {
                                            hVar6.l(j20);
                                        }
                                    }
                                }
                            }
                            if (arrayList11 != null) {
                                for (int i35 = 0; i35 < arrayList11.size(); i35++) {
                                    gj gjVar9 = (gj) arrayList11.get(i35);
                                    if (gjVar9 != null && gjVar9.k.peer_id.channel_id == 0) {
                                        int i36 = 0;
                                        while (true) {
                                            if (arrayList12 == null || i36 >= arrayList12.size()) {
                                                break;
                                            }
                                            gj gjVar10 = (gj) arrayList12.get(i36);
                                            if (gjVar10 != null && gjVar10.e1() == gjVar9.e1()) {
                                                gjVar9.Z = gjVar10.Z;
                                                break;
                                            }
                                            i36++;
                                        }
                                        sparseArray4.put(gjVar9.e1(), gjVar9);
                                        long j21 = gjVar9.k.random_id;
                                        if (j21 != 0) {
                                            hVar6.k(gjVar9, j21);
                                        }
                                    }
                                }
                            }
                            a10Var.d(j16);
                        }
                        i28 = i23 + 1;
                        lnVar = this;
                        npVar8 = npVar6;
                        messages_dialogs3 = messages_dialogs2;
                        i24 = i22;
                    }
                    np npVar9 = npVar8;
                    i20 = i24;
                    arrayList9.clear();
                    int m10 = hVar7.m();
                    int i37 = 0;
                    while (i37 < m10) {
                        TLRPC.Dialog dialog4 = (TLRPC.Dialog) hVar7.n(i37);
                        np npVar10 = npVar9;
                        if (npVar10.E0.h(dialog4.id) < 0) {
                            arrayList9.add(dialog4);
                        }
                        i37++;
                        npVar9 = npVar10;
                    }
                    npVar5 = npVar9;
                    npVar5.f5(null);
                    i21 = 0;
                    npVar5.getNotificationCenter().k(ls.s, new Object[0]);
                } else {
                    npVar5 = npVar8;
                    i20 = i24;
                    i21 = 0;
                }
                if (i20 != 0) {
                    npVar5.getUserConfig().Q = true;
                    npVar5.getUserConfig().v(i21);
                    npVar5.getNotificationCenter().k(ls.R2, new Object[i21]);
                }
                npVar5.p3();
                Runnable runnable2 = runnable;
                if (runnable2 != null) {
                    runnable2.run();
                }
            }
        });
    }
}
