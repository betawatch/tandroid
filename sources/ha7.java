// default package

import android.graphics.Typeface;
import android.util.SparseArray;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class ha7 implements Runnable {
    public final /* synthetic */ oc7 a;
    public final /* synthetic */ TLRPC.TL_messages_dialogs b;
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ TLRPC.TL_messages_dialogs d;
    public final /* synthetic */ byte e;
    public final /* synthetic */ ArrayList f;
    public final /* synthetic */ ArrayList h;
    public final /* synthetic */ ArrayList n;
    public final /* synthetic */ Runnable r;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ ha7(oc7 oc7Var, TLRPC.TL_messages_dialogs tL_messages_dialogs, ArrayList arrayList, TLRPC.TL_messages_dialogs tL_messages_dialogs2, int i, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, Runnable runnable) {
        this.a = oc7Var;
        this.b = tL_messages_dialogs;
        this.c = arrayList;
        this.d = tL_messages_dialogs2;
        this.e = i;
        this.f = arrayList2;
        this.h = arrayList3;
        this.n = arrayList4;
        this.r = runnable;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00b7, code lost:
    
        if (r10 != (-r5.id)) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00d5, code lost:
    
        r6 = r22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00d3, code lost:
    
        if (r5.migrated_to != null) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00fe  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        TLRPC.TL_messages_dialogs tL_messages_dialogs;
        SparseArray sparseArray;
        TLRPC.User user;
        int i;
        TLRPC.Chat chat;
        Integer num;
        Integer num2;
        ArrayList arrayList;
        TLRPC.Message message;
        int i2;
        ArrayList arrayList2;
        int i3;
        ArrayList arrayList3;
        long B0;
        final oc7 oc7Var = this.a;
        ConcurrentHashMap concurrentHashMap = oc7Var.Q;
        ConcurrentHashMap concurrentHashMap2 = oc7Var.P;
        final vh6 vh6Var = new vh6();
        final vh6 vh6Var2 = new vh6();
        vh6 vh6Var3 = new vh6();
        vh6 vh6Var4 = new vh6();
        Integer num3 = 0;
        int i4 = 0;
        while (true) {
            tL_messages_dialogs = this.b;
            if (i4 >= tL_messages_dialogs.users.size()) {
                break;
            }
            TLRPC.User user2 = tL_messages_dialogs.users.get(i4);
            vh6Var3.k(user2, user2.id);
            i4++;
        }
        for (int i5 = 0; i5 < tL_messages_dialogs.chats.size(); i5++) {
            TLRPC.Chat chat2 = tL_messages_dialogs.chats.get(i5);
            vh6Var4.k(chat2, chat2.id);
        }
        ArrayList arrayList4 = this.c;
        if (arrayList4 != null) {
            sparseArray = new SparseArray();
            int size = arrayList4.size();
            for (int i6 = 0; i6 < size; i6++) {
                TLRPC.EncryptedChat encryptedChat = (TLRPC.EncryptedChat) arrayList4.get(i6);
                sparseArray.put(encryptedChat.id, encryptedChat);
            }
        } else {
            sparseArray = null;
        }
        SparseArray sparseArray2 = sparseArray;
        ArrayList arrayList5 = new ArrayList();
        int i7 = 0;
        while (i7 < tL_messages_dialogs.messages.size()) {
            TLRPC.Message message2 = tL_messages_dialogs.messages.get(i7);
            TLRPC.Peer peer = message2.peer_id;
            Integer num4 = num3;
            ArrayList arrayList6 = arrayList4;
            long j = peer.channel_id;
            if (j != 0) {
                TLRPC.Chat chat3 = (TLRPC.Chat) vh6Var4.f(j);
                if (chat3 == null || !chat3.left) {
                    arrayList2 = arrayList5;
                    i3 = i7;
                } else {
                    arrayList3 = arrayList5;
                    i3 = i7;
                    long j2 = oc7Var.s2;
                    if (j2 != 0) {
                        arrayList2 = arrayList3;
                    }
                }
                arrayList3 = arrayList2;
                k47 k47Var = new k47(oc7Var.currentAccount, message2, vh6Var3, vh6Var4, false, false);
                arrayList3.add(k47Var);
                B0 = k47.B0(k47Var.k);
                if (vh6Var2.d(B0)) {
                    ArrayList arrayList7 = new ArrayList(1);
                    arrayList7.add(k47Var);
                    vh6Var2.k(arrayList7, B0);
                } else {
                    ((ArrayList) vh6Var2.f(B0)).add(k47Var);
                }
            } else {
                arrayList2 = arrayList5;
                i3 = i7;
                long j3 = peer.chat_id;
                if (j3 != 0) {
                    TLRPC.Chat chat4 = (TLRPC.Chat) vh6Var4.f(j3);
                    if (chat4 != null) {
                    }
                }
                arrayList3 = arrayList2;
                k47 k47Var2 = new k47(oc7Var.currentAccount, message2, vh6Var3, vh6Var4, false, false);
                arrayList3.add(k47Var2);
                B0 = k47.B0(k47Var2.k);
                if (vh6Var2.d(B0)) {
                }
            }
            i7 = i3 + 1;
            arrayList5 = arrayList3;
            num3 = num4;
            arrayList4 = arrayList6;
        }
        Integer num5 = num3;
        final ArrayList arrayList8 = arrayList4;
        for (int i8 = 0; i8 < tL_messages_dialogs.dialogs.size(); i8 = i + 1) {
            TLRPC.Dialog dialog = tL_messages_dialogs.dialogs.get(i8);
            pg3.w(dialog);
            long j4 = dialog.id;
            if (j4 == 0 || (pg3.B(j4) && sparseArray2 != null && sparseArray2.get((int) (dialog.id & 4294967295L)) == null)) {
                i = i8;
            } else {
                long j5 = oc7Var.s2;
                if (j5 != 0) {
                    i = i8;
                    if (j5 == dialog.id) {
                        oc7Var.q2 = dialog;
                    }
                } else {
                    i = i8;
                }
                if (dialog.last_message_date == 0 && (arrayList = (ArrayList) vh6Var2.f(dialog.id)) != null) {
                    int i9 = TLObject.FLAG_31;
                    for (int i10 = 0; i10 < arrayList.size(); i10++) {
                        k47 k47Var3 = (k47) arrayList.get(i10);
                        if (k47Var3 != null && (message = k47Var3.k) != null && i9 < (i2 = message.date)) {
                            i9 = i2;
                        }
                    }
                    if (i9 > Integer.MIN_VALUE) {
                        dialog.last_message_date = i9;
                    }
                }
                boolean x = pg3.x(dialog);
                long j6 = dialog.id;
                if (x) {
                    TLRPC.Chat chat5 = (TLRPC.Chat) vh6Var4.f(-j6);
                    if (chat5 != null && chat5.left) {
                        long j7 = oc7Var.s2;
                        if (j7 != 0) {
                            if (j7 != dialog.id) {
                            }
                        }
                    }
                    oc7Var.P0.put(-dialog.id, dialog.pts);
                    vh6Var.k(dialog, dialog.id);
                    num = (Integer) concurrentHashMap2.get(Long.valueOf(dialog.id));
                    if (num == null) {
                        num = num5;
                    }
                    concurrentHashMap2.put(Long.valueOf(dialog.id), Integer.valueOf(Math.max(num.intValue(), dialog.read_inbox_max_id)));
                    num2 = (Integer) concurrentHashMap.get(Long.valueOf(dialog.id));
                    if (num2 == null) {
                        num2 = num5;
                    }
                    concurrentHashMap.put(Long.valueOf(dialog.id), Integer.valueOf(Math.max(num2.intValue(), dialog.read_outbox_max_id)));
                } else {
                    if (j6 < 0 && (chat = (TLRPC.Chat) vh6Var4.f(-j6)) != null && chat.migrated_to != null) {
                    }
                    vh6Var.k(dialog, dialog.id);
                    num = (Integer) concurrentHashMap2.get(Long.valueOf(dialog.id));
                    if (num == null) {
                    }
                    concurrentHashMap2.put(Long.valueOf(dialog.id), Integer.valueOf(Math.max(num.intValue(), dialog.read_inbox_max_id)));
                    num2 = (Integer) concurrentHashMap.get(Long.valueOf(dialog.id));
                    if (num2 == null) {
                    }
                    concurrentHashMap.put(Long.valueOf(dialog.id), Integer.valueOf(Math.max(num2.intValue(), dialog.read_outbox_max_id)));
                }
            }
        }
        final TLRPC.TL_messages_dialogs tL_messages_dialogs2 = this.d;
        if (tL_messages_dialogs2 != null && !tL_messages_dialogs2.dialogs.isEmpty()) {
            fn5.S(tL_messages_dialogs2.messages);
            for (int i11 = 0; i11 < tL_messages_dialogs2.messages.size(); i11++) {
                TLRPC.Message message3 = tL_messages_dialogs2.messages.get(i11);
                TLRPC.MessageAction messageAction = message3.action;
                if ((messageAction instanceof TLRPC.TL_messageActionChatDeleteUser) && (user = (TLRPC.User) vh6Var3.f(messageAction.user_id)) != null && user.bot) {
                    message3.reply_markup = new TLRPC.TL_replyKeyboardHide();
                    message3.flags |= 64;
                }
                TLRPC.MessageAction messageAction2 = message3.action;
                if ((messageAction2 instanceof TLRPC.TL_messageActionChatMigrateTo) || (messageAction2 instanceof TLRPC.TL_messageActionChannelCreate)) {
                    message3.unread = false;
                    message3.media_unread = false;
                } else {
                    ConcurrentHashMap concurrentHashMap3 = message3.out ? concurrentHashMap : concurrentHashMap2;
                    Integer num6 = (Integer) concurrentHashMap3.get(Long.valueOf(message3.dialog_id));
                    if (num6 == null) {
                        num6 = Integer.valueOf(oc7Var.getMessagesStorage().S(message3.dialog_id, message3.out));
                        concurrentHashMap3.put(Long.valueOf(message3.dialog_id), num6);
                    }
                    message3.unread = num6.intValue() < message3.id;
                }
            }
            oc7Var.getMessagesStorage().a1(tL_messages_dialogs2, 0);
        }
        final byte b = this.e;
        final ArrayList arrayList9 = this.f;
        final ArrayList arrayList10 = this.h;
        final ArrayList arrayList11 = this.n;
        final Runnable runnable = this.r;
        gm.c3(new Runnable() { // from class: qa7
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r2v1 */
            /* JADX WARN: Type inference failed for: r2v4 */
            @Override // java.lang.Runnable
            public final void run() {
                oc7 oc7Var2;
                byte b2;
                int i12;
                TLRPC.TL_messages_dialogs tL_messages_dialogs3;
                byte b3;
                oc7 oc7Var3;
                int i13;
                oc7 oc7Var4;
                qa7 qa7Var = this;
                oc7 oc7Var5 = oc7.this;
                ArrayList arrayList12 = oc7Var5.y;
                b3c b3cVar = oc7Var5.i4;
                SparseArray sparseArray3 = oc7Var5.J0;
                vh6 vh6Var5 = oc7Var5.S;
                vh6 vh6Var6 = oc7Var5.T;
                SparseArray sparseArray4 = oc7Var5.V;
                vh6 vh6Var7 = oc7Var5.R;
                byte b4 = b;
                boolean z = true;
                if (b4 != 2) {
                    oc7Var5.G0 = arrayList9;
                    sparseArray3.clear();
                    int size2 = oc7Var5.G0.size();
                    for (int i14 = 0; i14 < size2; i14++) {
                        ub7 ub7Var = (ub7) oc7Var5.G0.get(i14);
                        sparseArray3.put(ub7Var.a, ub7Var);
                    }
                    Iterator it = oc7Var5.o4.iterator();
                    boolean z2 = false;
                    while (it.hasNext()) {
                        int intValue = ((Integer) it.next()).intValue();
                        if (intValue != 0 && sparseArray3.get(intValue) == null) {
                            it.remove();
                            z2 = true;
                        }
                    }
                    if (z2) {
                        oc7Var5.E4();
                    }
                    Collections.sort(oc7Var5.G0, new tk6((byte) 20));
                    oc7Var5.d4(arrayList10, true);
                    oc7Var5.X3(arrayList11, true);
                    oc7Var5.L0 = true;
                    oc7Var5.getNotificationCenter().k(nm7.O2, new Object[0]);
                    if (b4 == 0) {
                        oc7Var5.g3(false, null);
                    }
                    TLRPC.TL_messages_dialogs tL_messages_dialogs4 = tL_messages_dialogs2;
                    if (tL_messages_dialogs4 != null && !tL_messages_dialogs4.dialogs.isEmpty()) {
                        oc7Var5.n(tL_messages_dialogs4.dialogs);
                    }
                    ArrayList arrayList13 = arrayList8;
                    if (arrayList13 != null) {
                        int i15 = 0;
                        while (i15 < arrayList13.size()) {
                            TLRPC.EncryptedChat encryptedChat2 = (TLRPC.EncryptedChat) arrayList13.get(i15);
                            if (encryptedChat2 instanceof TLRPC.TL_encryptedChat) {
                                int i16 = encryptedChat2.layer;
                                Typeface typeface = gm.a;
                                if ((i16 & 65535) < 151) {
                                    oc7Var5.getSecretChatHelper().w(encryptedChat2, null);
                                }
                                z = true;
                            }
                            oc7Var5.Z3(encryptedChat2, z);
                            i15++;
                            z = true;
                        }
                    }
                    int i17 = 0;
                    while (true) {
                        vh6 vh6Var8 = vh6Var;
                        if (i17 >= vh6Var8.m()) {
                            break;
                        }
                        long j8 = vh6Var8.j(i17);
                        TLRPC.Dialog dialog2 = (TLRPC.Dialog) vh6Var8.n(i17);
                        TLRPC.Dialog dialog3 = (TLRPC.Dialog) vh6Var7.f(j8);
                        if (tL_messages_dialogs4 == null || !tL_messages_dialogs4.dialogs.contains(dialog2)) {
                            tL_messages_dialogs3 = tL_messages_dialogs4;
                            b3 = b4;
                        } else {
                            tL_messages_dialogs3 = tL_messages_dialogs4;
                            b3 = b4;
                            oc7Var5.getMediaDataController().B1(dialog2.id, 0L, dialog2.draft);
                            if (dialog2.draft instanceof TLRPC.TL_draftMessage) {
                                oc7Var5.getMediaDataController().U1(dialog2.id, 0L, dialog2.draft, null, false);
                            }
                            if (dialog3 != null) {
                                dialog3.notify_settings = dialog2.notify_settings;
                            }
                        }
                        ArrayList arrayList14 = (ArrayList) vh6Var2.f(dialog2.id);
                        if (dialog3 == null) {
                            vh6Var7.k(dialog2, j8);
                            vh6Var5.k(arrayList14, j8);
                            if (arrayList14 != null) {
                                for (int i18 = 0; i18 < arrayList14.size(); i18++) {
                                    k47 k47Var4 = (k47) arrayList14.get(i18);
                                    if (k47Var4 != null && k47Var4.k.peer_id.channel_id == 0) {
                                        sparseArray4.put(k47Var4.e1(), k47Var4);
                                        long j9 = k47Var4.k.random_id;
                                        if (j9 != 0) {
                                            vh6Var6.k(k47Var4, j9);
                                        }
                                    }
                                }
                            }
                            b3cVar.c(j8);
                            oc7Var3 = oc7Var5;
                            i13 = i17;
                        } else {
                            dialog3.pinned = dialog2.pinned;
                            dialog3.pinnedNum = dialog2.pinnedNum;
                            ArrayList arrayList15 = (ArrayList) vh6Var5.f(j8);
                            int i19 = 0;
                            while (arrayList15 != null) {
                                i13 = i17;
                                if (i19 < arrayList15.size()) {
                                    if (arrayList15.get(i19) == null || !((k47) arrayList15.get(i19)).Z) {
                                        i19++;
                                        i17 = i13;
                                    }
                                } else if (dialog3.top_message <= 0) {
                                    vh6Var7.k(dialog2, j8);
                                    vh6Var5.k(arrayList14, j8);
                                    int i20 = 0;
                                    while (i20 < arrayList15.size()) {
                                        k47 k47Var5 = (k47) arrayList15.get(i20);
                                        if (k47Var5 == null) {
                                            oc7Var4 = oc7Var5;
                                        } else {
                                            oc7Var4 = oc7Var5;
                                            if (k47Var5.k.peer_id.channel_id == 0) {
                                                sparseArray4.remove(k47Var5.e1());
                                            }
                                            long j10 = k47Var5.k.random_id;
                                            if (j10 != 0) {
                                                vh6Var6.l(j10);
                                            }
                                        }
                                        i20++;
                                        oc7Var5 = oc7Var4;
                                    }
                                    oc7Var3 = oc7Var5;
                                    if (arrayList14 != null) {
                                        for (int i21 = 0; i21 < arrayList14.size(); i21++) {
                                            k47 k47Var6 = (k47) arrayList14.get(i21);
                                            if (k47Var6 != null && k47Var6.k.peer_id.channel_id == 0) {
                                                int i22 = 0;
                                                while (true) {
                                                    if (i22 >= arrayList15.size()) {
                                                        break;
                                                    }
                                                    k47 k47Var7 = (k47) arrayList15.get(i22);
                                                    if (k47Var7 != null && k47Var7.e1() == k47Var6.e1()) {
                                                        k47Var6.Z = k47Var7.Z;
                                                        break;
                                                    }
                                                    i22++;
                                                }
                                                sparseArray4.put(k47Var6.e1(), k47Var6);
                                                long j11 = k47Var6.k.random_id;
                                                if (j11 != 0) {
                                                    vh6Var6.k(k47Var6, j11);
                                                }
                                            }
                                        }
                                    }
                                    b3cVar.c(j8);
                                }
                                oc7Var3 = oc7Var5;
                                break;
                            }
                            oc7Var3 = oc7Var5;
                            i13 = i17;
                            if (dialog2.top_message < dialog3.top_message) {
                                if ((arrayList15 == null) == (arrayList14 == null)) {
                                    if (arrayList15 != null) {
                                        if (arrayList14 != null) {
                                            if (arrayList15.size() == arrayList14.size()) {
                                            }
                                        }
                                    }
                                }
                            }
                            vh6Var7.k(dialog2, j8);
                            vh6Var5.k(arrayList14, j8);
                            if (arrayList15 != null) {
                                for (int i23 = 0; i23 < arrayList15.size(); i23++) {
                                    k47 k47Var8 = (k47) arrayList15.get(i23);
                                    if (k47Var8 != null) {
                                        if (k47Var8.k.peer_id.channel_id == 0) {
                                            sparseArray4.remove(k47Var8.e1());
                                        }
                                        long j12 = k47Var8.k.random_id;
                                        if (j12 != 0) {
                                            vh6Var6.l(j12);
                                        }
                                    }
                                }
                            }
                            if (arrayList14 != null) {
                                for (int i24 = 0; i24 < arrayList14.size(); i24++) {
                                    k47 k47Var9 = (k47) arrayList14.get(i24);
                                    if (k47Var9 != null && k47Var9.k.peer_id.channel_id == 0) {
                                        int i25 = 0;
                                        while (true) {
                                            if (arrayList15 == null || i25 >= arrayList15.size()) {
                                                break;
                                            }
                                            k47 k47Var10 = (k47) arrayList15.get(i25);
                                            if (k47Var10 != null && k47Var10.e1() == k47Var9.e1()) {
                                                k47Var9.Z = k47Var10.Z;
                                                break;
                                            }
                                            i25++;
                                        }
                                        sparseArray4.put(k47Var9.e1(), k47Var9);
                                        long j13 = k47Var9.k.random_id;
                                        if (j13 != 0) {
                                            vh6Var6.k(k47Var9, j13);
                                        }
                                    }
                                }
                            }
                            b3cVar.c(j8);
                        }
                        i17 = i13 + 1;
                        qa7Var = this;
                        oc7Var5 = oc7Var3;
                        tL_messages_dialogs4 = tL_messages_dialogs3;
                        b4 = b3;
                    }
                    oc7 oc7Var6 = oc7Var5;
                    b2 = b4;
                    arrayList12.clear();
                    int m = vh6Var7.m();
                    int i26 = 0;
                    while (i26 < m) {
                        TLRPC.Dialog dialog4 = (TLRPC.Dialog) vh6Var7.n(i26);
                        oc7 oc7Var7 = oc7Var6;
                        if (oc7Var7.u0.h(dialog4.id) < 0) {
                            arrayList12.add(dialog4);
                        }
                        i26++;
                        oc7Var6 = oc7Var7;
                    }
                    oc7Var2 = oc7Var6;
                    oc7Var2.b5(null);
                    i12 = 0;
                    oc7Var2.getNotificationCenter().k(nm7.r, new Object[0]);
                } else {
                    oc7Var2 = oc7Var5;
                    b2 = b4;
                    i12 = 0;
                }
                if (b2 != 0) {
                    oc7Var2.getUserConfig().Q = true;
                    oc7Var2.getUserConfig().u(i12);
                    oc7Var2.getNotificationCenter().k(nm7.R2, new Object[i12]);
                }
                oc7Var2.m3();
                Runnable runnable2 = runnable;
                if (runnable2 != null) {
                    runnable2.run();
                }
            }
        });
    }
}
