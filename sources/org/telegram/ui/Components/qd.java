package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.m91;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class qd implements org.telegram.ui.jg0, org.telegram.ui.nw {
    public final /* synthetic */ ChatActivityEnterView a;
    public final /* synthetic */ org.telegram.messenger.zi b;
    public final /* synthetic */ TL_keyboard.TL_buttonTypeRequestPeer c;

    public /* synthetic */ qd(ChatActivityEnterView chatActivityEnterView, org.telegram.messenger.zi ziVar, TL_keyboard.TL_buttonTypeRequestPeer tL_buttonTypeRequestPeer) {
        this.a = chatActivityEnterView;
        this.b = ziVar;
        this.c = tL_buttonTypeRequestPeer;
    }

    @Override // org.telegram.ui.nw
    public /* synthetic */ boolean G() {
        return false;
    }

    @Override // org.telegram.ui.nw
    public /* synthetic */ boolean N(org.telegram.ui.uw uwVar) {
        return false;
    }

    @Override // org.telegram.ui.jg0
    public void a(ArrayList arrayList) {
        int i3 = ChatActivityEnterView.t5;
        if (arrayList.isEmpty()) {
            return;
        }
        TLRPC.TL_messages_sendBotRequestedPeer tL_messages_sendBotRequestedPeer = new TLRPC.TL_messages_sendBotRequestedPeer();
        ChatActivityEnterView chatActivityEnterView = this.a;
        org.telegram.messenger.hp s12 = org.telegram.messenger.hp.s1(chatActivityEnterView.R);
        org.telegram.messenger.zi ziVar = this.b;
        tL_messages_sendBotRequestedPeer.peer = s12.m1(ziVar.k.peer_id);
        tL_messages_sendBotRequestedPeer.flags |= 1;
        tL_messages_sendBotRequestedPeer.msg_id = ziVar.f1();
        tL_messages_sendBotRequestedPeer.button_id = this.c.button_id;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            tL_messages_sendBotRequestedPeer.requested_peers.add(org.telegram.messenger.hp.s1(chatActivityEnterView.R).j1(((Long) obj).longValue()));
        }
        ConnectionsManager.getInstance(chatActivityEnterView.R).sendRequest(tL_messages_sendBotRequestedPeer, null);
    }

    @Override // org.telegram.ui.nw
    public boolean y(org.telegram.ui.uw uwVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i3, int i10, m91 m91Var) {
        int i11 = ChatActivityEnterView.t5;
        if (!arrayList.isEmpty()) {
            TLRPC.TL_messages_sendBotRequestedPeer tL_messages_sendBotRequestedPeer = new TLRPC.TL_messages_sendBotRequestedPeer();
            ChatActivityEnterView chatActivityEnterView = this.a;
            org.telegram.messenger.hp s12 = org.telegram.messenger.hp.s1(chatActivityEnterView.R);
            org.telegram.messenger.zi ziVar = this.b;
            tL_messages_sendBotRequestedPeer.peer = s12.m1(ziVar.k.peer_id);
            tL_messages_sendBotRequestedPeer.flags |= 1;
            tL_messages_sendBotRequestedPeer.msg_id = ziVar.f1();
            tL_messages_sendBotRequestedPeer.button_id = this.c.button_id;
            HashSet hashSet = new HashSet();
            int size = arrayList.size();
            int i12 = 0;
            while (i12 < size) {
                Object obj = arrayList.get(i12);
                i12++;
                hashSet.add(Long.valueOf(((org.telegram.messenger.pr) obj).a));
            }
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                tL_messages_sendBotRequestedPeer.requested_peers.add(org.telegram.messenger.hp.s1(chatActivityEnterView.R).j1(((Long) it.next()).longValue()));
            }
            ConnectionsManager.getInstance(chatActivityEnterView.R).sendRequest(tL_messages_sendBotRequestedPeer, null);
        }
        uwVar.finishFragment();
        return true;
    }
}
