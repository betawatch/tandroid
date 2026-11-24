// default package

import android.graphics.Typeface;
import android.util.SparseArray;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final /* synthetic */ class g87 implements Runnable {
    public final /* synthetic */ na7 a;
    public final /* synthetic */ TLRPC.TL_messages_dialogs b;
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ TLRPC.TL_messages_dialogs d;
    public final /* synthetic */ byte e;
    public final /* synthetic */ ArrayList f;
    public final /* synthetic */ ArrayList h;
    public final /* synthetic */ ArrayList n;
    public final /* synthetic */ Runnable r;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ g87(na7 na7Var, TLRPC.TL_messages_dialogs tL_messages_dialogs, ArrayList arrayList, TLRPC.TL_messages_dialogs tL_messages_dialogs2, int i, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, Runnable runnable) {
        this.a = na7Var;
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
        final na7 na7Var = this.a;
        ConcurrentHashMap concurrentHashMap = na7Var.Q;
        ConcurrentHashMap concurrentHashMap2 = na7Var.P;
        final vf6 vf6Var = new vf6();
        final vf6 vf6Var2 = new vf6();
        vf6 vf6Var3 = new vf6();
        vf6 vf6Var4 = new vf6();
        Integer num3 = 0;
        int i4 = 0;
        while (true) {
            tL_messages_dialogs = this.b;
            if (i4 >= tL_messages_dialogs.users.size()) {
                break;
            }
            TLRPC.User user2 = tL_messages_dialogs.users.get(i4);
            vf6Var3.k(user2, user2.id);
            i4++;
        }
        for (int i5 = 0; i5 < tL_messages_dialogs.chats.size(); i5++) {
            TLRPC.Chat chat2 = tL_messages_dialogs.chats.get(i5);
            vf6Var4.k(chat2, chat2.id);
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
                TLRPC.Chat chat3 = (TLRPC.Chat) vf6Var4.f(j);
                if (chat3 == null || !chat3.left) {
                    arrayList2 = arrayList5;
                    i3 = i7;
                } else {
                    arrayList3 = arrayList5;
                    i3 = i7;
                    long j2 = na7Var.s2;
                    if (j2 != 0) {
                        arrayList2 = arrayList3;
                    }
                }
                arrayList3 = arrayList2;
                k27 k27Var = new k27(na7Var.currentAccount, message2, vf6Var3, vf6Var4, false, false);
                arrayList3.add(k27Var);
                B0 = k27.B0(k27Var.k);
                if (vf6Var2.d(B0)) {
                    ArrayList arrayList7 = new ArrayList(1);
                    arrayList7.add(k27Var);
                    vf6Var2.k(arrayList7, B0);
                } else {
                    ((ArrayList) vf6Var2.f(B0)).add(k27Var);
                }
            } else {
                arrayList2 = arrayList5;
                i3 = i7;
                long j3 = peer.chat_id;
                if (j3 != 0) {
                    TLRPC.Chat chat4 = (TLRPC.Chat) vf6Var4.f(j3);
                    if (chat4 != null) {
                    }
                }
                arrayList3 = arrayList2;
                k27 k27Var2 = new k27(na7Var.currentAccount, message2, vf6Var3, vf6Var4, false, false);
                arrayList3.add(k27Var2);
                B0 = k27.B0(k27Var2.k);
                if (vf6Var2.d(B0)) {
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
            cf3.w(dialog);
            long j4 = dialog.id;
            if (j4 == 0 || (cf3.B(j4) && sparseArray2 != null && sparseArray2.get((int) (dialog.id & 4294967295L)) == null)) {
                i = i8;
            } else {
                long j5 = na7Var.s2;
                if (j5 != 0) {
                    i = i8;
                    if (j5 == dialog.id) {
                        na7Var.q2 = dialog;
                    }
                } else {
                    i = i8;
                }
                if (dialog.last_message_date == 0 && (arrayList = (ArrayList) vf6Var2.f(dialog.id)) != null) {
                    int i9 = TLObject.FLAG_31;
                    for (int i10 = 0; i10 < arrayList.size(); i10++) {
                        k27 k27Var3 = (k27) arrayList.get(i10);
                        if (k27Var3 != null && (message = k27Var3.k) != null && i9 < (i2 = message.date)) {
                            i9 = i2;
                        }
                    }
                    if (i9 > Integer.MIN_VALUE) {
                        dialog.last_message_date = i9;
                    }
                }
                boolean x = cf3.x(dialog);
                long j6 = dialog.id;
                if (x) {
                    TLRPC.Chat chat5 = (TLRPC.Chat) vf6Var4.f(-j6);
                    if (chat5 != null && chat5.left) {
                        long j7 = na7Var.s2;
                        if (j7 != 0) {
                            if (j7 != dialog.id) {
                            }
                        }
                    }
                    na7Var.P0.put(-dialog.id, dialog.pts);
                    vf6Var.k(dialog, dialog.id);
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
                    if (j6 < 0 && (chat = (TLRPC.Chat) vf6Var4.f(-j6)) != null && chat.migrated_to != null) {
                    }
                    vf6Var.k(dialog, dialog.id);
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
            fl5.S(tL_messages_dialogs2.messages);
            for (int i11 = 0; i11 < tL_messages_dialogs2.messages.size(); i11++) {
                TLRPC.Message message3 = tL_messages_dialogs2.messages.get(i11);
                TLRPC.MessageAction messageAction = message3.action;
                if ((messageAction instanceof TLRPC.TL_messageActionChatDeleteUser) && (user = (TLRPC.User) vf6Var3.f(messageAction.user_id)) != null && user.bot) {
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
                        num6 = Integer.valueOf(na7Var.getMessagesStorage().S(message3.dialog_id, message3.out));
                        concurrentHashMap3.put(Long.valueOf(message3.dialog_id), num6);
                    }
                    message3.unread = num6.intValue() < message3.id;
                }
            }
            na7Var.getMessagesStorage().a1(tL_messages_dialogs2, 0);
        }
        final byte b = this.e;
        final ArrayList arrayList9 = this.f;
        final ArrayList arrayList10 = this.h;
        final ArrayList arrayList11 = this.n;
        final Runnable runnable = this.r;
        gl.d3(new Runnable() { // from class: p87
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r2v1 */
            /* JADX WARN: Type inference failed for: r2v4 */
            @Override // java.lang.Runnable
            public final void run() {
                na7 na7Var2;
                byte b2;
                int i12;
                TLRPC.TL_messages_dialogs tL_messages_dialogs3;
                byte b3;
                na7 na7Var3;
                int i13;
                na7 na7Var4;
                p87 p87Var = this;
                na7 na7Var5 = na7.this;
                ArrayList arrayList12 = na7Var5.y;
                b1c b1cVar = na7Var5.i4;
                SparseArray sparseArray3 = na7Var5.J0;
                vf6 vf6Var5 = na7Var5.S;
                vf6 vf6Var6 = na7Var5.T;
                SparseArray sparseArray4 = na7Var5.V;
                vf6 vf6Var7 = na7Var5.R;
                byte b4 = b;
                boolean z = true;
                if (b4 != 2) {
                    na7Var5.G0 = arrayList9;
                    sparseArray3.clear();
                    int size2 = na7Var5.G0.size();
                    for (int i14 = 0; i14 < size2; i14++) {
                        t97 t97Var = (t97) na7Var5.G0.get(i14);
                        sparseArray3.put(t97Var.a, t97Var);
                    }
                    Iterator it = na7Var5.n4.iterator();
                    boolean z2 = false;
                    while (it.hasNext()) {
                        int intValue = ((Integer) it.next()).intValue();
                        if (intValue != 0 && sparseArray3.get(intValue) == null) {
                            it.remove();
                            z2 = true;
                        }
                    }
                    if (z2) {
                        na7Var5.B4();
                    }
                    Collections.sort(na7Var5.G0, new el6((byte) 19));
                    na7Var5.a4(arrayList10, true);
                    na7Var5.U3(arrayList11, true);
                    na7Var5.L0 = true;
                    na7Var5.getNotificationCenter().k(kk7.N2, new Object[0]);
                    if (b4 == 0) {
                        na7Var5.d3(false, null);
                    }
                    TLRPC.TL_messages_dialogs tL_messages_dialogs4 = tL_messages_dialogs2;
                    if (tL_messages_dialogs4 != null && !tL_messages_dialogs4.dialogs.isEmpty()) {
                        na7Var5.n(tL_messages_dialogs4.dialogs);
                    }
                    ArrayList arrayList13 = arrayList8;
                    if (arrayList13 != null) {
                        int i15 = 0;
                        while (i15 < arrayList13.size()) {
                            TLRPC.EncryptedChat encryptedChat2 = (TLRPC.EncryptedChat) arrayList13.get(i15);
                            if (encryptedChat2 instanceof TLRPC.TL_encryptedChat) {
                                int i16 = encryptedChat2.layer;
                                Typeface typeface = gl.a;
                                if ((i16 & 65535) < 151) {
                                    na7Var5.getSecretChatHelper().w(encryptedChat2, null);
                                }
                                z = true;
                            }
                            na7Var5.W3(encryptedChat2, z);
                            i15++;
                            z = true;
                        }
                    }
                    int i17 = 0;
                    while (true) {
                        vf6 vf6Var8 = vf6Var;
                        if (i17 >= vf6Var8.m()) {
                            break;
                        }
                        long j8 = vf6Var8.j(i17);
                        TLRPC.Dialog dialog2 = (TLRPC.Dialog) vf6Var8.n(i17);
                        TLRPC.Dialog dialog3 = (TLRPC.Dialog) vf6Var7.f(j8);
                        if (tL_messages_dialogs4 == null || !tL_messages_dialogs4.dialogs.contains(dialog2)) {
                            tL_messages_dialogs3 = tL_messages_dialogs4;
                            b3 = b4;
                        } else {
                            tL_messages_dialogs3 = tL_messages_dialogs4;
                            b3 = b4;
                            na7Var5.getMediaDataController().B1(dialog2.id, 0L, dialog2.draft);
                            if (dialog2.draft instanceof TLRPC.TL_draftMessage) {
                                na7Var5.getMediaDataController().U1(dialog2.id, 0L, dialog2.draft, null, false);
                            }
                            if (dialog3 != null) {
                                dialog3.notify_settings = dialog2.notify_settings;
                            }
                        }
                        ArrayList arrayList14 = (ArrayList) vf6Var2.f(dialog2.id);
                        if (dialog3 == null) {
                            vf6Var7.k(dialog2, j8);
                            vf6Var5.k(arrayList14, j8);
                            if (arrayList14 != null) {
                                for (int i18 = 0; i18 < arrayList14.size(); i18++) {
                                    k27 k27Var4 = (k27) arrayList14.get(i18);
                                    if (k27Var4 != null && k27Var4.k.peer_id.channel_id == 0) {
                                        sparseArray4.put(k27Var4.e1(), k27Var4);
                                        long j9 = k27Var4.k.random_id;
                                        if (j9 != 0) {
                                            vf6Var6.k(k27Var4, j9);
                                        }
                                    }
                                }
                            }
                            b1cVar.c(j8);
                            na7Var3 = na7Var5;
                            i13 = i17;
                        } else {
                            dialog3.pinned = dialog2.pinned;
                            dialog3.pinnedNum = dialog2.pinnedNum;
                            ArrayList arrayList15 = (ArrayList) vf6Var5.f(j8);
                            int i19 = 0;
                            while (arrayList15 != null) {
                                i13 = i17;
                                if (i19 < arrayList15.size()) {
                                    if (arrayList15.get(i19) == null || !((k27) arrayList15.get(i19)).Z) {
                                        i19++;
                                        i17 = i13;
                                    }
                                } else if (dialog3.top_message <= 0) {
                                    vf6Var7.k(dialog2, j8);
                                    vf6Var5.k(arrayList14, j8);
                                    int i20 = 0;
                                    while (i20 < arrayList15.size()) {
                                        k27 k27Var5 = (k27) arrayList15.get(i20);
                                        if (k27Var5 == null) {
                                            na7Var4 = na7Var5;
                                        } else {
                                            na7Var4 = na7Var5;
                                            if (k27Var5.k.peer_id.channel_id == 0) {
                                                sparseArray4.remove(k27Var5.e1());
                                            }
                                            long j10 = k27Var5.k.random_id;
                                            if (j10 != 0) {
                                                vf6Var6.l(j10);
                                            }
                                        }
                                        i20++;
                                        na7Var5 = na7Var4;
                                    }
                                    na7Var3 = na7Var5;
                                    if (arrayList14 != null) {
                                        for (int i21 = 0; i21 < arrayList14.size(); i21++) {
                                            k27 k27Var6 = (k27) arrayList14.get(i21);
                                            if (k27Var6 != null && k27Var6.k.peer_id.channel_id == 0) {
                                                int i22 = 0;
                                                while (true) {
                                                    if (i22 >= arrayList15.size()) {
                                                        break;
                                                    }
                                                    k27 k27Var7 = (k27) arrayList15.get(i22);
                                                    if (k27Var7 != null && k27Var7.e1() == k27Var6.e1()) {
                                                        k27Var6.Z = k27Var7.Z;
                                                        break;
                                                    }
                                                    i22++;
                                                }
                                                sparseArray4.put(k27Var6.e1(), k27Var6);
                                                long j11 = k27Var6.k.random_id;
                                                if (j11 != 0) {
                                                    vf6Var6.k(k27Var6, j11);
                                                }
                                            }
                                        }
                                    }
                                    b1cVar.c(j8);
                                }
                                na7Var3 = na7Var5;
                                break;
                            }
                            na7Var3 = na7Var5;
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
                            vf6Var7.k(dialog2, j8);
                            vf6Var5.k(arrayList14, j8);
                            if (arrayList15 != null) {
                                for (int i23 = 0; i23 < arrayList15.size(); i23++) {
                                    k27 k27Var8 = (k27) arrayList15.get(i23);
                                    if (k27Var8 != null) {
                                        if (k27Var8.k.peer_id.channel_id == 0) {
                                            sparseArray4.remove(k27Var8.e1());
                                        }
                                        long j12 = k27Var8.k.random_id;
                                        if (j12 != 0) {
                                            vf6Var6.l(j12);
                                        }
                                    }
                                }
                            }
                            if (arrayList14 != null) {
                                for (int i24 = 0; i24 < arrayList14.size(); i24++) {
                                    k27 k27Var9 = (k27) arrayList14.get(i24);
                                    if (k27Var9 != null && k27Var9.k.peer_id.channel_id == 0) {
                                        int i25 = 0;
                                        while (true) {
                                            if (arrayList15 == null || i25 >= arrayList15.size()) {
                                                break;
                                            }
                                            k27 k27Var10 = (k27) arrayList15.get(i25);
                                            if (k27Var10 != null && k27Var10.e1() == k27Var9.e1()) {
                                                k27Var9.Z = k27Var10.Z;
                                                break;
                                            }
                                            i25++;
                                        }
                                        sparseArray4.put(k27Var9.e1(), k27Var9);
                                        long j13 = k27Var9.k.random_id;
                                        if (j13 != 0) {
                                            vf6Var6.k(k27Var9, j13);
                                        }
                                    }
                                }
                            }
                            b1cVar.c(j8);
                        }
                        i17 = i13 + 1;
                        p87Var = this;
                        na7Var5 = na7Var3;
                        tL_messages_dialogs4 = tL_messages_dialogs3;
                        b4 = b3;
                    }
                    na7 na7Var6 = na7Var5;
                    b2 = b4;
                    arrayList12.clear();
                    int m = vf6Var7.m();
                    int i26 = 0;
                    while (i26 < m) {
                        TLRPC.Dialog dialog4 = (TLRPC.Dialog) vf6Var7.n(i26);
                        na7 na7Var7 = na7Var6;
                        if (na7Var7.u0.h(dialog4.id) < 0) {
                            arrayList12.add(dialog4);
                        }
                        i26++;
                        na7Var6 = na7Var7;
                    }
                    na7Var2 = na7Var6;
                    na7Var2.Y4(null);
                    i12 = 0;
                    na7Var2.getNotificationCenter().k(kk7.r, new Object[0]);
                } else {
                    na7Var2 = na7Var5;
                    b2 = b4;
                    i12 = 0;
                }
                if (b2 != 0) {
                    na7Var2.getUserConfig().Q = true;
                    na7Var2.getUserConfig().u(i12);
                    na7Var2.getNotificationCenter().k(kk7.Q2, new Object[i12]);
                }
                na7Var2.j3();
                Runnable runnable2 = runnable;
                if (runnable2 != null) {
                    runnable2.run();
                }
            }
        });
    }
}
