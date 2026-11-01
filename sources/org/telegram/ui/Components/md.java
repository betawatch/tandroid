package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.nb1;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class md implements org.telegram.ui.th0, org.telegram.ui.tx {
    public final /* synthetic */ ChatActivityEnterView a;
    public final /* synthetic */ org.telegram.messenger.kj b;
    public final /* synthetic */ TL_keyboard.TL_buttonTypeRequestPeer c;

    public /* synthetic */ md(ChatActivityEnterView chatActivityEnterView, org.telegram.messenger.kj kjVar, TL_keyboard.TL_buttonTypeRequestPeer tL_buttonTypeRequestPeer) {
        this.a = chatActivityEnterView;
        this.b = kjVar;
        this.c = tL_buttonTypeRequestPeer;
    }

    @Override // org.telegram.ui.tx
    public /* synthetic */ boolean H() {
        return false;
    }

    @Override // org.telegram.ui.tx
    public /* synthetic */ boolean O(org.telegram.ui.zx zxVar) {
        return false;
    }

    @Override // org.telegram.ui.th0
    public void a(ArrayList arrayList) {
        int i10 = ChatActivityEnterView.s5;
        if (arrayList.isEmpty()) {
            return;
        }
        TLRPC.TL_messages_sendBotRequestedPeer tL_messages_sendBotRequestedPeer = new TLRPC.TL_messages_sendBotRequestedPeer();
        ChatActivityEnterView chatActivityEnterView = this.a;
        org.telegram.messenger.wp r12 = org.telegram.messenger.wp.r1(chatActivityEnterView.Q);
        org.telegram.messenger.kj kjVar = this.b;
        tL_messages_sendBotRequestedPeer.peer = r12.l1(kjVar.k.peer_id);
        tL_messages_sendBotRequestedPeer.flags |= 1;
        tL_messages_sendBotRequestedPeer.msg_id = kjVar.f1();
        tL_messages_sendBotRequestedPeer.button_id = this.c.button_id;
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            tL_messages_sendBotRequestedPeer.requested_peers.add(org.telegram.messenger.wp.r1(chatActivityEnterView.Q).i1(((Long) obj).longValue()));
        }
        ConnectionsManager.getInstance(chatActivityEnterView.Q).sendRequest(tL_messages_sendBotRequestedPeer, null);
    }

    @Override // org.telegram.ui.tx
    public boolean z(org.telegram.ui.zx zxVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, nb1 nb1Var) {
        int i12 = ChatActivityEnterView.s5;
        if (!arrayList.isEmpty()) {
            TLRPC.TL_messages_sendBotRequestedPeer tL_messages_sendBotRequestedPeer = new TLRPC.TL_messages_sendBotRequestedPeer();
            ChatActivityEnterView chatActivityEnterView = this.a;
            org.telegram.messenger.wp r12 = org.telegram.messenger.wp.r1(chatActivityEnterView.Q);
            org.telegram.messenger.kj kjVar = this.b;
            tL_messages_sendBotRequestedPeer.peer = r12.l1(kjVar.k.peer_id);
            tL_messages_sendBotRequestedPeer.flags |= 1;
            tL_messages_sendBotRequestedPeer.msg_id = kjVar.f1();
            tL_messages_sendBotRequestedPeer.button_id = this.c.button_id;
            HashSet hashSet = new HashSet();
            int size = arrayList.size();
            int i13 = 0;
            while (i13 < size) {
                Object obj = arrayList.get(i13);
                i13++;
                hashSet.add(Long.valueOf(((org.telegram.messenger.hs) obj).a));
            }
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                tL_messages_sendBotRequestedPeer.requested_peers.add(org.telegram.messenger.wp.r1(chatActivityEnterView.Q).i1(((Long) it.next()).longValue()));
            }
            ConnectionsManager.getInstance(chatActivityEnterView.Q).sendRequest(tL_messages_sendBotRequestedPeer, null);
        }
        zxVar.finishFragment();
        return true;
    }
}
