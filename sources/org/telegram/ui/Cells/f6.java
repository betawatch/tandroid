package org.telegram.ui.Cells;

import j$.util.Comparator$-CC;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.jd;
import org.telegram.messenger.vf;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class f6 {
    public final int a;
    public boolean b;
    public boolean c;
    public int e;
    public long f;
    public int g;
    public final ArrayList d = new ArrayList();
    public final ArrayList h = new ArrayList();

    public f6(int i10) {
        this.a = i10;
    }

    public static /* synthetic */ void a(f6 f6Var, TLObject tLObject, MessagesStorage messagesStorage, long j10, int i10, ArrayList arrayList) {
        ArrayList arrayList2 = f6Var.d;
        int i11 = f6Var.a;
        if (!(tLObject instanceof TLRPC.messages_Messages)) {
            if (i10 != f6Var.e) {
                return;
            }
            f6Var.c();
            return;
        }
        TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
        MessagesController.getInstance(i11).putUsers(messages_messages.users, false);
        MessagesController.getInstance(i11).putChats(messages_messages.chats, false);
        messagesStorage.putUsersAndChats(messages_messages.users, messages_messages.chats, true, true);
        messagesStorage.putMessages(messages_messages, -j10, 3, 0, false, 0, 0L);
        if (i10 == f6Var.e && !messages_messages.messages.isEmpty()) {
            arrayList2.clear();
            Collections.sort(arrayList, Comparator$-CC.comparingInt(new lf.d(13)));
            TLRPC.Message message = (TLRPC.Message) kh.a2.i(1, messages_messages.messages);
            long j11 = message.grouped_id;
            if (j11 != 0) {
                ArrayList<TLRPC.Message> arrayList3 = messages_messages.messages;
                int size = arrayList3.size();
                int i12 = 0;
                while (i12 < size) {
                    TLRPC.Message message2 = arrayList3.get(i12);
                    i12++;
                    TLRPC.Message message3 = message2;
                    if (message3.grouped_id == j11) {
                        arrayList2.add(new MessageObject(i11, message3, false, true));
                    }
                }
            } else {
                arrayList2.add(new MessageObject(i11, message, false, true));
            }
            if (arrayList2.isEmpty()) {
                return;
            }
            f6Var.c();
        }
    }

    public static /* synthetic */ void b(f6 f6Var, int i10, ArrayList arrayList, long j10, int i11, MessagesStorage messagesStorage) {
        int i12 = f6Var.a;
        ArrayList arrayList2 = f6Var.d;
        if (i10 != f6Var.e) {
            return;
        }
        if (!arrayList.isEmpty()) {
            arrayList2.clear();
            Collections.sort(arrayList, Comparator$-CC.comparingInt(new lf.d(12)));
            TLRPC.Message message = (TLRPC.Message) arrayList.get(arrayList.size() - 1);
            long j11 = message.grouped_id;
            if (j11 != 0) {
                int size = arrayList.size();
                int i13 = 0;
                while (i13 < size) {
                    Object obj = arrayList.get(i13);
                    i13++;
                    TLRPC.Message message2 = (TLRPC.Message) obj;
                    if (message2.grouped_id == j11) {
                        arrayList2.add(new MessageObject(i12, message2, false, true));
                    }
                }
            } else {
                arrayList2.add(new MessageObject(i12, message, false, true));
            }
            if (!arrayList2.isEmpty()) {
                f6Var.c();
                return;
            }
        }
        TLRPC.TL_channels_getMessages tL_channels_getMessages = new TLRPC.TL_channels_getMessages();
        tL_channels_getMessages.channel = MessagesController.getInstance(i12).getInputChannel(j10);
        for (int i14 = 10; i14 >= 0; i14--) {
            int i15 = i11 - i14;
            if (i15 >= 0) {
                tL_channels_getMessages.id.add(Integer.valueOf(i15));
            }
        }
        ConnectionsManager.getInstance(i12).sendRequest(tL_channels_getMessages, new jd(f6Var, messagesStorage, j10, i10, arrayList));
    }

    public final void c() {
        int i10 = 0;
        this.b = false;
        this.c = true;
        ArrayList arrayList = this.h;
        int size = arrayList.size();
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((Runnable) obj).run();
        }
        arrayList.clear();
    }

    public final void d(TLRPC.UserFull userFull) {
        ArrayList arrayList = this.d;
        if (userFull == null || (userFull.flags2 & 64) == 0) {
            this.e++;
            this.c = true;
            arrayList.clear();
            c();
            return;
        }
        long j10 = userFull.personal_channel_id;
        int i10 = userFull.personal_channel_message;
        if (this.c || this.b) {
            if (this.f == j10 && this.g == i10) {
                return;
            }
            this.c = false;
            arrayList.clear();
        }
        int i11 = this.e + 1;
        this.e = i11;
        this.b = true;
        this.f = j10;
        this.g = i10;
        int i12 = this.a;
        long clientUserId = UserConfig.getInstance(i12).getClientUserId();
        MessagesStorage messagesStorage = MessagesStorage.getInstance(i12);
        messagesStorage.getStorageQueue().postRunnable(new vf(this, i10, messagesStorage, j10, clientUserId, i11));
    }
}
