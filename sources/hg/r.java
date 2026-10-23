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

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
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
                h0 h0Var = (h0) this.b;
                String str = (String) this.c;
                TLRPC.TL_messages_search tL_messages_search = (TLRPC.TL_messages_search) this.f;
                ArrayList arrayList = new ArrayList();
                if (tL_error == null) {
                    TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                    a0.h hVar = new a0.h();
                    a0.h hVar2 = new a0.h();
                    int i10 = 0;
                    for (int i11 = 0; i11 < messages_messages.chats.size(); i11++) {
                        TLRPC.Chat chat = messages_messages.chats.get(i11);
                        hVar.k(chat, chat.id);
                    }
                    for (int i12 = 0; i12 < messages_messages.users.size(); i12++) {
                        TLRPC.User user = messages_messages.users.get(i12);
                        hVar2.k(user, user.id);
                    }
                    while (i10 < messages_messages.messages.size()) {
                        a0.h hVar3 = hVar;
                        MessageObject messageObject = new MessageObject(h0Var.s0, messages_messages.messages.get(i10), hVar2, hVar3, false, true);
                        arrayList.add(messageObject);
                        messageObject.setQuery(str);
                        i10++;
                        hVar = hVar3;
                    }
                }
                AndroidUtilities.runOnUIThread(new t(h0Var, this.d, this.e, tL_error, str, tLObject, tL_messages_search, arrayList, 0));
                break;
            case 1:
                h0 h0Var2 = (h0) this.b;
                String str2 = (String) this.c;
                TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal = (TLRPC.TL_messages_searchGlobal) this.f;
                int i13 = h0Var2.s0;
                ArrayList arrayList2 = new ArrayList();
                if (tL_error == null) {
                    TLRPC.messages_Messages messages_messages2 = (TLRPC.messages_Messages) tLObject;
                    a0.h hVar4 = new a0.h();
                    a0.h hVar5 = new a0.h();
                    for (int i14 = 0; i14 < messages_messages2.chats.size(); i14++) {
                        TLRPC.Chat chat2 = messages_messages2.chats.get(i14);
                        hVar4.k(chat2, chat2.id);
                    }
                    for (int i15 = 0; i15 < messages_messages2.users.size(); i15++) {
                        TLRPC.User user2 = messages_messages2.users.get(i15);
                        hVar5.k(user2, user2.id);
                    }
                    int i16 = 0;
                    while (i16 < messages_messages2.messages.size()) {
                        a0.h hVar6 = hVar4;
                        MessageObject messageObject2 = new MessageObject(h0Var2.s0, messages_messages2.messages.get(i16), hVar5, hVar6, false, true);
                        arrayList2.add(messageObject2);
                        messageObject2.setQuery(str2);
                        i16++;
                        hVar4 = hVar6;
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
                t tVar = new t(h0Var2, this.d, this.e, tL_error, str2, tLObject, tL_messages_searchGlobal, arrayList2, 1);
                if (hashSet.isEmpty()) {
                    AndroidUtilities.runOnUIThread(tVar);
                    break;
                } else {
                    MessagesStorage.getInstance(i13).getStorageQueue().postRunnable(new ei.z1(h0Var2, hashSet, tVar, 15));
                    break;
                }
            default:
                ((FileLoadOperation) this.b).lambda$startDownloadRequest$30((FileLoadOperation.RequestInfo) this.c, this.d, this.e, this.f, tLObject, tL_error);
                break;
        }
    }
}
