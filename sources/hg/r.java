package hg;

import android.util.Pair;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoadOperation;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final /* synthetic */ class r implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ TLObject f;

    public /* synthetic */ r(Object obj, Object obj2, int i10, int i11, TLObject tLObject, int i12) {
        this.a = i12;
        this.b = obj;
        this.c = obj2;
        this.d = i10;
        this.e = i11;
        this.f = tLObject;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                i0 i0Var = (i0) this.b;
                String str = (String) this.c;
                TLRPC.TL_messages_search tL_messages_search = (TLRPC.TL_messages_search) this.f;
                ArrayList arrayList = new ArrayList();
                if (tL_error == null) {
                    TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                    a0.i iVar = new a0.i();
                    a0.i iVar2 = new a0.i();
                    int i10 = 0;
                    for (int i11 = 0; i11 < messages_messages.chats.size(); i11++) {
                        TLRPC.Chat chat = messages_messages.chats.get(i11);
                        iVar.k(chat, chat.id);
                    }
                    for (int i12 = 0; i12 < messages_messages.users.size(); i12++) {
                        TLRPC.User user = messages_messages.users.get(i12);
                        iVar2.k(user, user.id);
                    }
                    while (i10 < messages_messages.messages.size()) {
                        a0.i iVar3 = iVar;
                        MessageObject messageObject = new MessageObject(i0Var.s0, messages_messages.messages.get(i10), iVar2, iVar3, false, true);
                        arrayList.add(messageObject);
                        messageObject.setQuery(str);
                        i10++;
                        iVar = iVar3;
                    }
                }
                AndroidUtilities.runOnUIThread(new s(i0Var, this.d, this.e, tL_error, str, tLObject, tL_messages_search, arrayList, 0));
                break;
            case 1:
                i0 i0Var2 = (i0) this.b;
                String str2 = (String) this.c;
                TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal = (TLRPC.TL_messages_searchGlobal) this.f;
                int i13 = i0Var2.s0;
                ArrayList arrayList2 = new ArrayList();
                if (tL_error == null) {
                    TLRPC.messages_Messages messages_messages2 = (TLRPC.messages_Messages) tLObject;
                    a0.i iVar4 = new a0.i();
                    a0.i iVar5 = new a0.i();
                    for (int i14 = 0; i14 < messages_messages2.chats.size(); i14++) {
                        TLRPC.Chat chat2 = messages_messages2.chats.get(i14);
                        iVar4.k(chat2, chat2.id);
                    }
                    for (int i15 = 0; i15 < messages_messages2.users.size(); i15++) {
                        TLRPC.User user2 = messages_messages2.users.get(i15);
                        iVar5.k(user2, user2.id);
                    }
                    int i16 = 0;
                    while (i16 < messages_messages2.messages.size()) {
                        a0.i iVar6 = iVar4;
                        MessageObject messageObject2 = new MessageObject(i0Var2.s0, messages_messages2.messages.get(i16), iVar5, iVar6, false, true);
                        arrayList2.add(messageObject2);
                        messageObject2.setQuery(str2);
                        i16++;
                        iVar4 = iVar6;
                    }
                }
                HashSet hashSet = new HashSet();
                if (tL_error == null) {
                    TLRPC.messages_Messages messages_messages3 = (TLRPC.messages_Messages) tLObject;
                    for (int i17 = 0; i17 < messages_messages3.messages.size(); i17++) {
                        TLRPC.Message message = messages_messages3.messages.get(i17);
                        long dialogId = MessageObject.getDialogId(message);
                        if ((message.out ? MessagesController.getInstance(i13).dialogs_read_outbox_max : MessagesController.getInstance(i13).dialogs_read_inbox_max).get(Long.valueOf(dialogId)) == null) {
                            hashSet.add(new Pair(Boolean.valueOf(message.out), Long.valueOf(dialogId)));
                        }
                    }
                }
                s sVar = new s(i0Var2, this.d, this.e, tL_error, str2, tLObject, tL_messages_searchGlobal, arrayList2, 1);
                if (hashSet.isEmpty()) {
                    AndroidUtilities.runOnUIThread(sVar);
                    break;
                } else {
                    MessagesStorage.getInstance(i13).getStorageQueue().postRunnable(new a3.j0(i0Var2, hashSet, sVar, 29));
                    break;
                }
            default:
                ((FileLoadOperation) this.b).lambda$startDownloadRequest$29((FileLoadOperation.RequestInfo) this.c, this.d, this.e, this.f, tLObject, tL_error);
                break;
        }
    }
}
