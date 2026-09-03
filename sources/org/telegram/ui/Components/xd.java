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
import org.telegram.ui.sf1;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class xd implements org.telegram.ui.hj0, org.telegram.ui.jy {
    public final /* synthetic */ ChatActivityEnterView a;
    public final /* synthetic */ MessageObject b;
    public final /* synthetic */ TL_keyboard.TL_buttonTypeRequestPeer c;

    public /* synthetic */ xd(ChatActivityEnterView chatActivityEnterView, MessageObject messageObject, TL_keyboard.TL_buttonTypeRequestPeer tL_buttonTypeRequestPeer) {
        this.a = chatActivityEnterView;
        this.b = messageObject;
        this.c = tL_buttonTypeRequestPeer;
    }

    @Override // org.telegram.ui.jy
    public /* synthetic */ boolean C() {
        return false;
    }

    @Override // org.telegram.ui.jy
    public /* synthetic */ boolean J(org.telegram.ui.py pyVar) {
        return false;
    }

    @Override // org.telegram.ui.hj0
    public void a(ArrayList arrayList) {
        int i10 = ChatActivityEnterView.j5;
        if (arrayList.isEmpty()) {
            return;
        }
        TLRPC.TL_messages_sendBotRequestedPeer tL_messages_sendBotRequestedPeer = new TLRPC.TL_messages_sendBotRequestedPeer();
        ChatActivityEnterView chatActivityEnterView = this.a;
        MessagesController messagesController = MessagesController.getInstance(chatActivityEnterView.N);
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
            tL_messages_sendBotRequestedPeer.requested_peers.add(MessagesController.getInstance(chatActivityEnterView.N).getInputPeer(((Long) obj).longValue()));
        }
        ConnectionsManager.getInstance(chatActivityEnterView.N).sendRequest(tL_messages_sendBotRequestedPeer, null);
    }

    @Override // org.telegram.ui.jy
    public boolean v(org.telegram.ui.py pyVar, ArrayList arrayList, CharSequence charSequence, boolean z4, boolean z10, int i10, int i11, sf1 sf1Var) {
        int i12 = ChatActivityEnterView.j5;
        if (!arrayList.isEmpty()) {
            TLRPC.TL_messages_sendBotRequestedPeer tL_messages_sendBotRequestedPeer = new TLRPC.TL_messages_sendBotRequestedPeer();
            ChatActivityEnterView chatActivityEnterView = this.a;
            MessagesController messagesController = MessagesController.getInstance(chatActivityEnterView.N);
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
                tL_messages_sendBotRequestedPeer.requested_peers.add(MessagesController.getInstance(chatActivityEnterView.N).getInputPeer(((Long) it.next()).longValue()));
            }
            ConnectionsManager.getInstance(chatActivityEnterView.N).sendRequest(tL_messages_sendBotRequestedPeer, null);
        }
        pyVar.finishFragment();
        return true;
    }
}
