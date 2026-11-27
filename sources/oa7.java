// default package

import android.graphics.Typeface;
import android.util.SparseArray;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final /* synthetic */ class oa7 implements Runnable {
    public final /* synthetic */ uc7 a;
    public final /* synthetic */ TLRPC.TL_messages_dialogs b;
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ TLRPC.TL_messages_dialogs d;
    public final /* synthetic */ byte e;
    public final /* synthetic */ ArrayList f;
    public final /* synthetic */ ArrayList h;
    public final /* synthetic */ ArrayList n;
    public final /* synthetic */ Runnable r;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ oa7(uc7 uc7Var, TLRPC.TL_messages_dialogs tL_messages_dialogs, ArrayList arrayList, TLRPC.TL_messages_dialogs tL_messages_dialogs2, int i, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, Runnable runnable) {
        this.a = uc7Var;
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
        final uc7 uc7Var = this.a;
        ConcurrentHashMap concurrentHashMap = uc7Var.Q;
        ConcurrentHashMap concurrentHashMap2 = uc7Var.P;
        final zh6 zh6Var = new zh6();
        final zh6 zh6Var2 = new zh6();
        zh6 zh6Var3 = new zh6();
        zh6 zh6Var4 = new zh6();
        Integer num3 = 0;
        int i4 = 0;
        while (true) {
            tL_messages_dialogs = this.b;
            if (i4 >= tL_messages_dialogs.users.size()) {
                break;
            }
            TLRPC.User user2 = tL_messages_dialogs.users.get(i4);
            zh6Var3.k(user2.id, user2);
            i4++;
        }
        for (int i5 = 0; i5 < tL_messages_dialogs.chats.size(); i5++) {
            TLRPC.Chat chat2 = tL_messages_dialogs.chats.get(i5);
            zh6Var4.k(chat2.id, chat2);
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
                TLRPC.Chat chat3 = (TLRPC.Chat) zh6Var4.f(j);
                if (chat3 == null || !chat3.left) {
                    arrayList2 = arrayList5;
                    i3 = i7;
                } else {
                    arrayList3 = arrayList5;
                    i3 = i7;
                    long j2 = uc7Var.s2;
                    if (j2 != 0) {
                        arrayList2 = arrayList3;
                    }
                }
                arrayList3 = arrayList2;
                r47 r47Var = new r47(uc7Var.currentAccount, message2, zh6Var3, zh6Var4, false, false);
                arrayList3.add(r47Var);
                B0 = r47.B0(r47Var.k);
                if (zh6Var2.d(B0)) {
                    ArrayList arrayList7 = new ArrayList(1);
                    arrayList7.add(r47Var);
                    zh6Var2.k(B0, arrayList7);
                } else {
                    ((ArrayList) zh6Var2.f(B0)).add(r47Var);
                }
            } else {
                arrayList2 = arrayList5;
                i3 = i7;
                long j3 = peer.chat_id;
                if (j3 != 0) {
                    TLRPC.Chat chat4 = (TLRPC.Chat) zh6Var4.f(j3);
                    if (chat4 != null) {
                    }
                }
                arrayList3 = arrayList2;
                r47 r47Var2 = new r47(uc7Var.currentAccount, message2, zh6Var3, zh6Var4, false, false);
                arrayList3.add(r47Var2);
                B0 = r47.B0(r47Var2.k);
                if (zh6Var2.d(B0)) {
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
            wf3.w(dialog);
            long j4 = dialog.id;
            if (j4 == 0 || (wf3.B(j4) && sparseArray2 != null && sparseArray2.get((int) (dialog.id & 4294967295L)) == null)) {
                i = i8;
            } else {
                long j5 = uc7Var.s2;
                if (j5 != 0) {
                    i = i8;
                    if (j5 == dialog.id) {
                        uc7Var.q2 = dialog;
                    }
                } else {
                    i = i8;
                }
                if (dialog.last_message_date == 0 && (arrayList = (ArrayList) zh6Var2.f(dialog.id)) != null) {
                    int i9 = TLObject.FLAG_31;
                    for (int i10 = 0; i10 < arrayList.size(); i10++) {
                        r47 r47Var3 = (r47) arrayList.get(i10);
                        if (r47Var3 != null && (message = r47Var3.k) != null && i9 < (i2 = message.date)) {
                            i9 = i2;
                        }
                    }
                    if (i9 > Integer.MIN_VALUE) {
                        dialog.last_message_date = i9;
                    }
                }
                boolean x = wf3.x(dialog);
                long j6 = dialog.id;
                if (x) {
                    TLRPC.Chat chat5 = (TLRPC.Chat) zh6Var4.f(-j6);
                    if (chat5 != null && chat5.left) {
                        long j7 = uc7Var.s2;
                        if (j7 != 0) {
                            if (j7 != dialog.id) {
                            }
                        }
                    }
                    uc7Var.P0.put(-dialog.id, dialog.pts);
                    zh6Var.k(dialog.id, dialog);
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
                    if (j6 < 0 && (chat = (TLRPC.Chat) zh6Var4.f(-j6)) != null && chat.migrated_to != null) {
                    }
                    zh6Var.k(dialog.id, dialog);
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
            in5.S(tL_messages_dialogs2.messages);
            for (int i11 = 0; i11 < tL_messages_dialogs2.messages.size(); i11++) {
                TLRPC.Message message3 = tL_messages_dialogs2.messages.get(i11);
                TLRPC.MessageAction messageAction = message3.action;
                if ((messageAction instanceof TLRPC.TL_messageActionChatDeleteUser) && (user = (TLRPC.User) zh6Var3.f(messageAction.user_id)) != null && user.bot) {
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
                        num6 = Integer.valueOf(uc7Var.getMessagesStorage().U(message3.dialog_id, message3.out));
                        concurrentHashMap3.put(Long.valueOf(message3.dialog_id), num6);
                    }
                    message3.unread = num6.intValue() < message3.id;
                }
            }
            uc7Var.getMessagesStorage().e1(tL_messages_dialogs2, 0);
        }
        final byte b = this.e;
        final ArrayList arrayList9 = this.f;
        final ArrayList arrayList10 = this.h;
        final ArrayList arrayList11 = this.n;
        final Runnable runnable = this.r;
        hl.c3(new Runnable() { // from class: za7
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r2v1 */
            /* JADX WARN: Type inference failed for: r2v4 */
            @Override // java.lang.Runnable
            public final void run() {
                uc7 uc7Var2;
                byte b2;
                int i12;
                TLRPC.TL_messages_dialogs tL_messages_dialogs3;
                byte b3;
                uc7 uc7Var3;
                int i13;
                uc7 uc7Var4;
                za7 za7Var = this;
                uc7 uc7Var5 = uc7.this;
                ArrayList arrayList12 = uc7Var5.y;
                a5c a5cVar = uc7Var5.j4;
                SparseArray sparseArray3 = uc7Var5.J0;
                zh6 zh6Var5 = uc7Var5.S;
                zh6 zh6Var6 = uc7Var5.T;
                SparseArray sparseArray4 = uc7Var5.V;
                zh6 zh6Var7 = uc7Var5.R;
                byte b4 = b;
                boolean z = true;
                if (b4 != 2) {
                    uc7Var5.G0 = arrayList9;
                    sparseArray3.clear();
                    int size2 = uc7Var5.G0.size();
                    for (int i14 = 0; i14 < size2; i14++) {
                        ac7 ac7Var = (ac7) uc7Var5.G0.get(i14);
                        sparseArray3.put(ac7Var.a, ac7Var);
                    }
                    Iterator it = uc7Var5.o4.iterator();
                    boolean z2 = false;
                    while (it.hasNext()) {
                        int intValue = ((Integer) it.next()).intValue();
                        if (intValue != 0 && sparseArray3.get(intValue) == null) {
                            it.remove();
                            z2 = true;
                        }
                    }
                    if (z2) {
                        uc7Var5.K4();
                    }
                    Collections.sort(uc7Var5.G0, new vk6((byte) 20));
                    uc7Var5.j4(arrayList10, true);
                    uc7Var5.c4(arrayList11, true);
                    uc7Var5.L0 = true;
                    uc7Var5.getNotificationCenter().k(jn7.O2, new Object[0]);
                    if (b4 == 0) {
                        uc7Var5.k3(false, null);
                    }
                    TLRPC.TL_messages_dialogs tL_messages_dialogs4 = tL_messages_dialogs2;
                    if (tL_messages_dialogs4 != null && !tL_messages_dialogs4.dialogs.isEmpty()) {
                        uc7Var5.n(tL_messages_dialogs4.dialogs);
                    }
                    ArrayList arrayList13 = arrayList8;
                    if (arrayList13 != null) {
                        int i15 = 0;
                        while (i15 < arrayList13.size()) {
                            TLRPC.EncryptedChat encryptedChat2 = (TLRPC.EncryptedChat) arrayList13.get(i15);
                            if (encryptedChat2 instanceof TLRPC.TL_encryptedChat) {
                                int i16 = encryptedChat2.layer;
                                Typeface typeface = hl.a;
                                if ((i16 & 65535) < 151) {
                                    uc7Var5.getSecretChatHelper().w(encryptedChat2, null);
                                }
                                z = true;
                            }
                            uc7Var5.f4(encryptedChat2, z);
                            i15++;
                            z = true;
                        }
                    }
                    int i17 = 0;
                    while (true) {
                        zh6 zh6Var8 = zh6Var;
                        if (i17 >= zh6Var8.m()) {
                            break;
                        }
                        long j8 = zh6Var8.j(i17);
                        TLRPC.Dialog dialog2 = (TLRPC.Dialog) zh6Var8.n(i17);
                        TLRPC.Dialog dialog3 = (TLRPC.Dialog) zh6Var7.f(j8);
                        if (tL_messages_dialogs4 == null || !tL_messages_dialogs4.dialogs.contains(dialog2)) {
                            tL_messages_dialogs3 = tL_messages_dialogs4;
                            b3 = b4;
                        } else {
                            tL_messages_dialogs3 = tL_messages_dialogs4;
                            b3 = b4;
                            uc7Var5.getMediaDataController().B1(dialog2.id, 0L, dialog2.draft);
                            if (dialog2.draft instanceof TLRPC.TL_draftMessage) {
                                uc7Var5.getMediaDataController().U1(dialog2.id, 0L, dialog2.draft, null, false);
                            }
                            if (dialog3 != null) {
                                dialog3.notify_settings = dialog2.notify_settings;
                            }
                        }
                        ArrayList arrayList14 = (ArrayList) zh6Var2.f(dialog2.id);
                        if (dialog3 == null) {
                            zh6Var7.k(j8, dialog2);
                            zh6Var5.k(j8, arrayList14);
                            if (arrayList14 != null) {
                                for (int i18 = 0; i18 < arrayList14.size(); i18++) {
                                    r47 r47Var4 = (r47) arrayList14.get(i18);
                                    if (r47Var4 != null && r47Var4.k.peer_id.channel_id == 0) {
                                        sparseArray4.put(r47Var4.e1(), r47Var4);
                                        long j9 = r47Var4.k.random_id;
                                        if (j9 != 0) {
                                            zh6Var6.k(j9, r47Var4);
                                        }
                                    }
                                }
                            }
                            a5cVar.c(j8);
                            uc7Var3 = uc7Var5;
                            i13 = i17;
                        } else {
                            dialog3.pinned = dialog2.pinned;
                            dialog3.pinnedNum = dialog2.pinnedNum;
                            ArrayList arrayList15 = (ArrayList) zh6Var5.f(j8);
                            int i19 = 0;
                            while (arrayList15 != null) {
                                i13 = i17;
                                if (i19 < arrayList15.size()) {
                                    if (arrayList15.get(i19) == null || !((r47) arrayList15.get(i19)).Z) {
                                        i19++;
                                        i17 = i13;
                                    }
                                } else if (dialog3.top_message <= 0) {
                                    zh6Var7.k(j8, dialog2);
                                    zh6Var5.k(j8, arrayList14);
                                    int i20 = 0;
                                    while (i20 < arrayList15.size()) {
                                        r47 r47Var5 = (r47) arrayList15.get(i20);
                                        if (r47Var5 == null) {
                                            uc7Var4 = uc7Var5;
                                        } else {
                                            uc7Var4 = uc7Var5;
                                            if (r47Var5.k.peer_id.channel_id == 0) {
                                                sparseArray4.remove(r47Var5.e1());
                                            }
                                            long j10 = r47Var5.k.random_id;
                                            if (j10 != 0) {
                                                zh6Var6.l(j10);
                                            }
                                        }
                                        i20++;
                                        uc7Var5 = uc7Var4;
                                    }
                                    uc7Var3 = uc7Var5;
                                    if (arrayList14 != null) {
                                        for (int i21 = 0; i21 < arrayList14.size(); i21++) {
                                            r47 r47Var6 = (r47) arrayList14.get(i21);
                                            if (r47Var6 != null && r47Var6.k.peer_id.channel_id == 0) {
                                                int i22 = 0;
                                                while (true) {
                                                    if (i22 >= arrayList15.size()) {
                                                        break;
                                                    }
                                                    r47 r47Var7 = (r47) arrayList15.get(i22);
                                                    if (r47Var7 != null && r47Var7.e1() == r47Var6.e1()) {
                                                        r47Var6.Z = r47Var7.Z;
                                                        break;
                                                    }
                                                    i22++;
                                                }
                                                sparseArray4.put(r47Var6.e1(), r47Var6);
                                                long j11 = r47Var6.k.random_id;
                                                if (j11 != 0) {
                                                    zh6Var6.k(j11, r47Var6);
                                                }
                                            }
                                        }
                                    }
                                    a5cVar.c(j8);
                                }
                                uc7Var3 = uc7Var5;
                                break;
                            }
                            uc7Var3 = uc7Var5;
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
                            zh6Var7.k(j8, dialog2);
                            zh6Var5.k(j8, arrayList14);
                            if (arrayList15 != null) {
                                for (int i23 = 0; i23 < arrayList15.size(); i23++) {
                                    r47 r47Var8 = (r47) arrayList15.get(i23);
                                    if (r47Var8 != null) {
                                        if (r47Var8.k.peer_id.channel_id == 0) {
                                            sparseArray4.remove(r47Var8.e1());
                                        }
                                        long j12 = r47Var8.k.random_id;
                                        if (j12 != 0) {
                                            zh6Var6.l(j12);
                                        }
                                    }
                                }
                            }
                            if (arrayList14 != null) {
                                for (int i24 = 0; i24 < arrayList14.size(); i24++) {
                                    r47 r47Var9 = (r47) arrayList14.get(i24);
                                    if (r47Var9 != null && r47Var9.k.peer_id.channel_id == 0) {
                                        int i25 = 0;
                                        while (true) {
                                            if (arrayList15 == null || i25 >= arrayList15.size()) {
                                                break;
                                            }
                                            r47 r47Var10 = (r47) arrayList15.get(i25);
                                            if (r47Var10 != null && r47Var10.e1() == r47Var9.e1()) {
                                                r47Var9.Z = r47Var10.Z;
                                                break;
                                            }
                                            i25++;
                                        }
                                        sparseArray4.put(r47Var9.e1(), r47Var9);
                                        long j13 = r47Var9.k.random_id;
                                        if (j13 != 0) {
                                            zh6Var6.k(j13, r47Var9);
                                        }
                                    }
                                }
                            }
                            a5cVar.c(j8);
                        }
                        i17 = i13 + 1;
                        za7Var = this;
                        uc7Var5 = uc7Var3;
                        tL_messages_dialogs4 = tL_messages_dialogs3;
                        b4 = b3;
                    }
                    uc7 uc7Var6 = uc7Var5;
                    b2 = b4;
                    arrayList12.clear();
                    int m = zh6Var7.m();
                    int i26 = 0;
                    while (i26 < m) {
                        TLRPC.Dialog dialog4 = (TLRPC.Dialog) zh6Var7.n(i26);
                        uc7 uc7Var7 = uc7Var6;
                        if (uc7Var7.u0.h(dialog4.id) < 0) {
                            arrayList12.add(dialog4);
                        }
                        i26++;
                        uc7Var6 = uc7Var7;
                    }
                    uc7Var2 = uc7Var6;
                    uc7Var2.h5(null);
                    i12 = 0;
                    uc7Var2.getNotificationCenter().k(jn7.r, new Object[0]);
                } else {
                    uc7Var2 = uc7Var5;
                    b2 = b4;
                    i12 = 0;
                }
                if (b2 != 0) {
                    uc7Var2.getUserConfig().Q = true;
                    uc7Var2.getUserConfig().u(i12);
                    uc7Var2.getNotificationCenter().k(jn7.R2, new Object[i12]);
                }
                uc7Var2.q3();
                Runnable runnable2 = runnable;
                if (runnable2 != null) {
                    runnable2.run();
                }
            }
        });
    }
}
