package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.pb1;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class md implements org.telegram.ui.vh0, org.telegram.ui.ux {
    public final /* synthetic */ ChatActivityEnterView a;
    public final /* synthetic */ org.telegram.messenger.jj b;
    public final /* synthetic */ TL_keyboard.TL_buttonTypeRequestPeer c;

    public /* synthetic */ md(ChatActivityEnterView chatActivityEnterView, org.telegram.messenger.jj jjVar, TL_keyboard.TL_buttonTypeRequestPeer tL_buttonTypeRequestPeer) {
        this.a = chatActivityEnterView;
        this.b = jjVar;
        this.c = tL_buttonTypeRequestPeer;
    }

    @Override // org.telegram.ui.ux
    public /* synthetic */ boolean G() {
        return false;
    }

    @Override // org.telegram.ui.ux
    public /* synthetic */ boolean N(org.telegram.ui.ay ayVar) {
        return false;
    }

    @Override // org.telegram.ui.vh0
    public void a(ArrayList arrayList) {
        int i10 = ChatActivityEnterView.s5;
        if (arrayList.isEmpty()) {
            return;
        }
        TLRPC.TL_messages_sendBotRequestedPeer tL_messages_sendBotRequestedPeer = new TLRPC.TL_messages_sendBotRequestedPeer();
        ChatActivityEnterView chatActivityEnterView = this.a;
        org.telegram.messenger.vp r12 = org.telegram.messenger.vp.r1(chatActivityEnterView.Q);
        org.telegram.messenger.jj jjVar = this.b;
        tL_messages_sendBotRequestedPeer.peer = r12.l1(jjVar.k.peer_id);
        tL_messages_sendBotRequestedPeer.flags |= 1;
        tL_messages_sendBotRequestedPeer.msg_id = jjVar.f1();
        tL_messages_sendBotRequestedPeer.button_id = this.c.button_id;
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            tL_messages_sendBotRequestedPeer.requested_peers.add(org.telegram.messenger.vp.r1(chatActivityEnterView.Q).i1(((Long) obj).longValue()));
        }
        ConnectionsManager.getInstance(chatActivityEnterView.Q).sendRequest(tL_messages_sendBotRequestedPeer, null);
    }

    @Override // org.telegram.ui.ux
    public boolean y(org.telegram.ui.ay ayVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, pb1 pb1Var) {
        int i12 = ChatActivityEnterView.s5;
        if (!arrayList.isEmpty()) {
            TLRPC.TL_messages_sendBotRequestedPeer tL_messages_sendBotRequestedPeer = new TLRPC.TL_messages_sendBotRequestedPeer();
            ChatActivityEnterView chatActivityEnterView = this.a;
            org.telegram.messenger.vp r12 = org.telegram.messenger.vp.r1(chatActivityEnterView.Q);
            org.telegram.messenger.jj jjVar = this.b;
            tL_messages_sendBotRequestedPeer.peer = r12.l1(jjVar.k.peer_id);
            tL_messages_sendBotRequestedPeer.flags |= 1;
            tL_messages_sendBotRequestedPeer.msg_id = jjVar.f1();
            tL_messages_sendBotRequestedPeer.button_id = this.c.button_id;
            HashSet hashSet = new HashSet();
            int size = arrayList.size();
            int i13 = 0;
            while (i13 < size) {
                Object obj = arrayList.get(i13);
                i13++;
                hashSet.add(Long.valueOf(((org.telegram.messenger.gs) obj).a));
            }
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                tL_messages_sendBotRequestedPeer.requested_peers.add(org.telegram.messenger.vp.r1(chatActivityEnterView.Q).i1(((Long) it.next()).longValue()));
            }
            ConnectionsManager.getInstance(chatActivityEnterView.Q).sendRequest(tL_messages_sendBotRequestedPeer, null);
        }
        ayVar.finishFragment();
        return true;
    }
}
