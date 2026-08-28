package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.we1;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class xd implements org.telegram.ui.aj0, org.telegram.ui.wx {
    public final /* synthetic */ ChatActivityEnterView a;
    public final /* synthetic */ MessageObject b;
    public final /* synthetic */ TL_keyboard.TL_buttonTypeRequestPeer c;

    public /* synthetic */ xd(ChatActivityEnterView chatActivityEnterView, MessageObject messageObject, TL_keyboard.TL_buttonTypeRequestPeer tL_buttonTypeRequestPeer) {
        this.a = chatActivityEnterView;
        this.b = messageObject;
        this.c = tL_buttonTypeRequestPeer;
    }

    @Override // org.telegram.ui.wx
    public /* synthetic */ boolean C() {
        return false;
    }

    @Override // org.telegram.ui.wx
    public /* synthetic */ boolean I(org.telegram.ui.dy dyVar) {
        return false;
    }

    @Override // org.telegram.ui.aj0
    public void a(ArrayList arrayList) {
        int i9 = ChatActivityEnterView.i5;
        if (arrayList.isEmpty()) {
            return;
        }
        TLRPC.TL_messages_sendBotRequestedPeer tL_messages_sendBotRequestedPeer = new TLRPC.TL_messages_sendBotRequestedPeer();
        ChatActivityEnterView chatActivityEnterView = this.a;
        MessagesController messagesController = MessagesController.getInstance(chatActivityEnterView.M);
        MessageObject messageObject = this.b;
        tL_messages_sendBotRequestedPeer.peer = messagesController.getInputPeer(messageObject.messageOwner.peer_id);
        tL_messages_sendBotRequestedPeer.flags |= 1;
        tL_messages_sendBotRequestedPeer.msg_id = messageObject.getId();
        tL_messages_sendBotRequestedPeer.button_id = this.c.button_id;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            tL_messages_sendBotRequestedPeer.requested_peers.add(MessagesController.getInstance(chatActivityEnterView.M).getInputPeer(((Long) obj).longValue()));
        }
        ConnectionsManager.getInstance(chatActivityEnterView.M).sendRequest(tL_messages_sendBotRequestedPeer, null);
    }

    @Override // org.telegram.ui.wx
    public boolean v(org.telegram.ui.dy dyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i9, int i10, we1 we1Var) {
        int i11 = ChatActivityEnterView.i5;
        if (!arrayList.isEmpty()) {
            TLRPC.TL_messages_sendBotRequestedPeer tL_messages_sendBotRequestedPeer = new TLRPC.TL_messages_sendBotRequestedPeer();
            ChatActivityEnterView chatActivityEnterView = this.a;
            MessagesController messagesController = MessagesController.getInstance(chatActivityEnterView.M);
            MessageObject messageObject = this.b;
            tL_messages_sendBotRequestedPeer.peer = messagesController.getInputPeer(messageObject.messageOwner.peer_id);
            tL_messages_sendBotRequestedPeer.flags |= 1;
            tL_messages_sendBotRequestedPeer.msg_id = messageObject.getId();
            tL_messages_sendBotRequestedPeer.button_id = this.c.button_id;
            HashSet hashSet = new HashSet();
            int size = arrayList.size();
            int i12 = 0;
            while (i12 < size) {
                Object obj = arrayList.get(i12);
                i12++;
                hashSet.add(Long.valueOf(((MessagesStorage.TopicKey) obj).dialogId));
            }
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                tL_messages_sendBotRequestedPeer.requested_peers.add(MessagesController.getInstance(chatActivityEnterView.M).getInputPeer(((Long) it.next()).longValue()));
            }
            ConnectionsManager.getInstance(chatActivityEnterView.M).sendRequest(tL_messages_sendBotRequestedPeer, null);
        }
        dyVar.finishFragment();
        return true;
    }
}
