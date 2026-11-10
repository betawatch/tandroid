package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.z91;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class rd implements org.telegram.ui.sg0, org.telegram.ui.tw {
    public final /* synthetic */ ChatActivityEnterView a;
    public final /* synthetic */ org.telegram.messenger.ij b;
    public final /* synthetic */ TL_keyboard.TL_buttonTypeRequestPeer c;

    public /* synthetic */ rd(ChatActivityEnterView chatActivityEnterView, org.telegram.messenger.ij ijVar, TL_keyboard.TL_buttonTypeRequestPeer tL_buttonTypeRequestPeer) {
        this.a = chatActivityEnterView;
        this.b = ijVar;
        this.c = tL_buttonTypeRequestPeer;
    }

    @Override // org.telegram.ui.tw
    public /* synthetic */ boolean G() {
        return false;
    }

    @Override // org.telegram.ui.tw
    public /* synthetic */ boolean N(org.telegram.ui.zw zwVar) {
        return false;
    }

    @Override // org.telegram.ui.sg0
    public void a(ArrayList arrayList) {
        int i7 = ChatActivityEnterView.s5;
        if (arrayList.isEmpty()) {
            return;
        }
        TLRPC.TL_messages_sendBotRequestedPeer tL_messages_sendBotRequestedPeer = new TLRPC.TL_messages_sendBotRequestedPeer();
        ChatActivityEnterView chatActivityEnterView = this.a;
        org.telegram.messenger.qp s12 = org.telegram.messenger.qp.s1(chatActivityEnterView.Q);
        org.telegram.messenger.ij ijVar = this.b;
        tL_messages_sendBotRequestedPeer.peer = s12.m1(ijVar.k.peer_id);
        tL_messages_sendBotRequestedPeer.flags |= 1;
        tL_messages_sendBotRequestedPeer.msg_id = ijVar.e1();
        tL_messages_sendBotRequestedPeer.button_id = this.c.button_id;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            tL_messages_sendBotRequestedPeer.requested_peers.add(org.telegram.messenger.qp.s1(chatActivityEnterView.Q).j1(((Long) obj).longValue()));
        }
        ConnectionsManager.getInstance(chatActivityEnterView.Q).sendRequest(tL_messages_sendBotRequestedPeer, null);
    }

    @Override // org.telegram.ui.tw
    public boolean y(org.telegram.ui.zw zwVar, ArrayList arrayList, CharSequence charSequence, boolean z9, boolean z10, int i7, int i10, z91 z91Var) {
        int i11 = ChatActivityEnterView.s5;
        if (!arrayList.isEmpty()) {
            TLRPC.TL_messages_sendBotRequestedPeer tL_messages_sendBotRequestedPeer = new TLRPC.TL_messages_sendBotRequestedPeer();
            ChatActivityEnterView chatActivityEnterView = this.a;
            org.telegram.messenger.qp s12 = org.telegram.messenger.qp.s1(chatActivityEnterView.Q);
            org.telegram.messenger.ij ijVar = this.b;
            tL_messages_sendBotRequestedPeer.peer = s12.m1(ijVar.k.peer_id);
            tL_messages_sendBotRequestedPeer.flags |= 1;
            tL_messages_sendBotRequestedPeer.msg_id = ijVar.e1();
            tL_messages_sendBotRequestedPeer.button_id = this.c.button_id;
            HashSet hashSet = new HashSet();
            int size = arrayList.size();
            int i12 = 0;
            while (i12 < size) {
                Object obj = arrayList.get(i12);
                i12++;
                hashSet.add(Long.valueOf(((org.telegram.messenger.xr) obj).a));
            }
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                tL_messages_sendBotRequestedPeer.requested_peers.add(org.telegram.messenger.qp.s1(chatActivityEnterView.Q).j1(((Long) it.next()).longValue()));
            }
            ConnectionsManager.getInstance(chatActivityEnterView.Q).sendRequest(tL_messages_sendBotRequestedPeer, null);
        }
        zwVar.finishFragment();
        return true;
    }
}
