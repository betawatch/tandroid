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
import org.telegram.ui.eg1;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final /* synthetic */ class he implements org.telegram.ui.sj0, org.telegram.ui.oy {
    public final /* synthetic */ ChatActivityEnterView a;
    public final /* synthetic */ MessageObject b;
    public final /* synthetic */ TL_keyboard.TL_buttonTypeRequestPeer c;

    public /* synthetic */ he(ChatActivityEnterView chatActivityEnterView, MessageObject messageObject, TL_keyboard.TL_buttonTypeRequestPeer tL_buttonTypeRequestPeer) {
        this.a = chatActivityEnterView;
        this.b = messageObject;
        this.c = tL_buttonTypeRequestPeer;
    }

    @Override // org.telegram.ui.oy
    public /* synthetic */ boolean B() {
        return false;
    }

    @Override // org.telegram.ui.oy
    public /* synthetic */ boolean K(org.telegram.ui.uy uyVar) {
        return false;
    }

    @Override // org.telegram.ui.sj0
    public void a(ArrayList arrayList) {
        int i10 = ChatActivityEnterView.m5;
        if (arrayList.isEmpty()) {
            return;
        }
        TLRPC.TL_messages_sendBotRequestedPeer tL_messages_sendBotRequestedPeer = new TLRPC.TL_messages_sendBotRequestedPeer();
        ChatActivityEnterView chatActivityEnterView = this.a;
        MessagesController messagesController = MessagesController.getInstance(chatActivityEnterView.Q);
        MessageObject messageObject = this.b;
        tL_messages_sendBotRequestedPeer.peer = messagesController.getInputPeer(messageObject.messageOwner.peer_id);
        tL_messages_sendBotRequestedPeer.flags |= 1;
        tL_messages_sendBotRequestedPeer.msg_id = messageObject.getId();
        tL_messages_sendBotRequestedPeer.button_id = this.c.button_id;
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            tL_messages_sendBotRequestedPeer.requested_peers.add(MessagesController.getInstance(chatActivityEnterView.Q).getInputPeer(((Long) obj).longValue()));
        }
        ConnectionsManager.getInstance(chatActivityEnterView.Q).sendRequest(tL_messages_sendBotRequestedPeer, null);
    }

    @Override // org.telegram.ui.oy
    public boolean u(org.telegram.ui.uy uyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, eg1 eg1Var) {
        int i12 = ChatActivityEnterView.m5;
        if (!arrayList.isEmpty()) {
            TLRPC.TL_messages_sendBotRequestedPeer tL_messages_sendBotRequestedPeer = new TLRPC.TL_messages_sendBotRequestedPeer();
            ChatActivityEnterView chatActivityEnterView = this.a;
            MessagesController messagesController = MessagesController.getInstance(chatActivityEnterView.Q);
            MessageObject messageObject = this.b;
            tL_messages_sendBotRequestedPeer.peer = messagesController.getInputPeer(messageObject.messageOwner.peer_id);
            tL_messages_sendBotRequestedPeer.flags |= 1;
            tL_messages_sendBotRequestedPeer.msg_id = messageObject.getId();
            tL_messages_sendBotRequestedPeer.button_id = this.c.button_id;
            HashSet hashSet = new HashSet();
            int size = arrayList.size();
            int i13 = 0;
            while (i13 < size) {
                Object obj = arrayList.get(i13);
                i13++;
                hashSet.add(Long.valueOf(((MessagesStorage.TopicKey) obj).dialogId));
            }
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                tL_messages_sendBotRequestedPeer.requested_peers.add(MessagesController.getInstance(chatActivityEnterView.Q).getInputPeer(((Long) it.next()).longValue()));
            }
            ConnectionsManager.getInstance(chatActivityEnterView.Q).sendRequest(tL_messages_sendBotRequestedPeer, null);
        }
        uyVar.finishFragment();
        return true;
    }
}
