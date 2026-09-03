package org.telegram.messenger;

import android.util.Pair;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.FileLoadOperation;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.n71;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final /* synthetic */ class u2 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ TLObject f;

    public /* synthetic */ u2(Object obj, Object obj2, int i10, int i11, TLObject tLObject, int i12) {
        this.a = i12;
        this.d = obj;
        this.e = obj2;
        this.b = i10;
        this.c = i11;
        this.f = tLObject;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                ((FileLoadOperation) this.d).lambda$startDownloadRequest$29((FileLoadOperation.RequestInfo) this.e, this.b, this.c, this.f, tLObject, tL_error);
                break;
            case 1:
                uf.z zVar = (uf.z) this.d;
                String str = (String) this.e;
                TLRPC.TL_messages_search tL_messages_search = (TLRPC.TL_messages_search) this.f;
                ArrayList arrayList = new ArrayList();
                if (tL_error == null) {
                    TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                    a0.h hVar = new a0.h();
                    a0.h hVar2 = new a0.h();
                    for (int i10 = 0; i10 < messages_messages.chats.size(); i10++) {
                        TLRPC.Chat chat = messages_messages.chats.get(i10);
                        hVar.k(chat, chat.id);
                    }
                    for (int i11 = 0; i11 < messages_messages.users.size(); i11++) {
                        TLRPC.User user = messages_messages.users.get(i11);
                        hVar2.k(user, user.id);
                    }
                    for (int i12 = 0; i12 < messages_messages.messages.size(); i12++) {
                        MessageObject messageObject = new MessageObject(zVar.p0, messages_messages.messages.get(i12), hVar2, hVar, false, true);
                        arrayList.add(messageObject);
                        messageObject.setQuery(str);
                    }
                }
                AndroidUtilities.runOnUIThread(new o7(zVar, this.b, this.c, tL_error, str, tLObject, tL_messages_search, arrayList, 1));
                break;
            default:
                uf.z zVar2 = (uf.z) this.d;
                String str2 = (String) this.e;
                TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal = (TLRPC.TL_messages_searchGlobal) this.f;
                int i13 = zVar2.p0;
                ArrayList arrayList2 = new ArrayList();
                if (tL_error == null) {
                    TLRPC.messages_Messages messages_messages2 = (TLRPC.messages_Messages) tLObject;
                    a0.h hVar3 = new a0.h();
                    a0.h hVar4 = new a0.h();
                    for (int i14 = 0; i14 < messages_messages2.chats.size(); i14++) {
                        TLRPC.Chat chat2 = messages_messages2.chats.get(i14);
                        hVar3.k(chat2, chat2.id);
                    }
                    for (int i15 = 0; i15 < messages_messages2.users.size(); i15++) {
                        TLRPC.User user2 = messages_messages2.users.get(i15);
                        hVar4.k(user2, user2.id);
                    }
                    for (int i16 = 0; i16 < messages_messages2.messages.size(); i16++) {
                        MessageObject messageObject2 = new MessageObject(zVar2.p0, messages_messages2.messages.get(i16), hVar4, hVar3, false, true);
                        arrayList2.add(messageObject2);
                        messageObject2.setQuery(str2);
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
                o7 o7Var = new o7(zVar2, this.b, this.c, tL_error, str2, tLObject, tL_messages_searchGlobal, arrayList2, 2);
                if (hashSet.isEmpty()) {
                    AndroidUtilities.runOnUIThread(o7Var);
                    break;
                } else {
                    MessagesStorage.getInstance(i13).getStorageQueue().postRunnable(new n71(zVar2, hashSet, o7Var, 26));
                    break;
                }
        }
    }
}
