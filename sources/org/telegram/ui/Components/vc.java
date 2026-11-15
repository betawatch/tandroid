package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.u91;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class vc implements org.telegram.ui.pg0, org.telegram.ui.sw {
    public final /* synthetic */ ChatActivityEnterView a;
    public final /* synthetic */ org.telegram.messenger.gj b;
    public final /* synthetic */ TL_keyboard.TL_buttonTypeRequestPeer c;

    public /* synthetic */ vc(ChatActivityEnterView chatActivityEnterView, org.telegram.messenger.gj gjVar, TL_keyboard.TL_buttonTypeRequestPeer tL_buttonTypeRequestPeer) {
        this.a = chatActivityEnterView;
        this.b = gjVar;
        this.c = tL_buttonTypeRequestPeer;
    }

    @Override // org.telegram.ui.sw
    public /* synthetic */ boolean H() {
        return false;
    }

    @Override // org.telegram.ui.sw
    public /* synthetic */ boolean P(org.telegram.ui.yw ywVar) {
        return false;
    }

    @Override // org.telegram.ui.pg0
    public void a(ArrayList arrayList) {
        int i7 = ChatActivityEnterView.N6;
        if (arrayList.isEmpty()) {
            return;
        }
        TLRPC.TL_messages_sendBotRequestedPeer tL_messages_sendBotRequestedPeer = new TLRPC.TL_messages_sendBotRequestedPeer();
        ChatActivityEnterView chatActivityEnterView = this.a;
        org.telegram.messenger.np s12 = org.telegram.messenger.np.s1(chatActivityEnterView.R);
        org.telegram.messenger.gj gjVar = this.b;
        tL_messages_sendBotRequestedPeer.peer = s12.m1(gjVar.k.peer_id);
        tL_messages_sendBotRequestedPeer.flags |= 1;
        tL_messages_sendBotRequestedPeer.msg_id = gjVar.e1();
        tL_messages_sendBotRequestedPeer.button_id = this.c.button_id;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            tL_messages_sendBotRequestedPeer.requested_peers.add(org.telegram.messenger.np.s1(chatActivityEnterView.R).j1(((Long) obj).longValue()));
        }
        ConnectionsManager.getInstance(chatActivityEnterView.R).sendRequest(tL_messages_sendBotRequestedPeer, null);
    }

    @Override // org.telegram.ui.sw
    public boolean y(org.telegram.ui.yw ywVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i7, int i10, u91 u91Var) {
        int i11 = ChatActivityEnterView.N6;
        if (!arrayList.isEmpty()) {
            TLRPC.TL_messages_sendBotRequestedPeer tL_messages_sendBotRequestedPeer = new TLRPC.TL_messages_sendBotRequestedPeer();
            ChatActivityEnterView chatActivityEnterView = this.a;
            org.telegram.messenger.np s12 = org.telegram.messenger.np.s1(chatActivityEnterView.R);
            org.telegram.messenger.gj gjVar = this.b;
            tL_messages_sendBotRequestedPeer.peer = s12.m1(gjVar.k.peer_id);
            tL_messages_sendBotRequestedPeer.flags |= 1;
            tL_messages_sendBotRequestedPeer.msg_id = gjVar.e1();
            tL_messages_sendBotRequestedPeer.button_id = this.c.button_id;
            HashSet hashSet = new HashSet();
            int size = arrayList.size();
            int i12 = 0;
            while (i12 < size) {
                Object obj = arrayList.get(i12);
                i12++;
                hashSet.add(Long.valueOf(((org.telegram.messenger.ur) obj).a));
            }
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                tL_messages_sendBotRequestedPeer.requested_peers.add(org.telegram.messenger.np.s1(chatActivityEnterView.R).j1(((Long) it.next()).longValue()));
            }
            ConnectionsManager.getInstance(chatActivityEnterView.R).sendRequest(tL_messages_sendBotRequestedPeer, null);
        }
        ywVar.finishFragment();
        return true;
    }
}
