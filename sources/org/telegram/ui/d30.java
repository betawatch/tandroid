package org.telegram.ui;

import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class d30 implements org.telegram.ui.ActionBar.r1, org.telegram.ui.Components.r60 {
    public final /* synthetic */ k30 a;

    public /* synthetic */ d30(k30 k30Var) {
        this.a = k30Var;
    }

    @Override // org.telegram.ui.Components.r60
    public void a(TLRPC.InputPeer inputPeer, boolean z9, boolean z10, boolean z11) {
        f40 f40Var = this.a.b;
        org.telegram.messenger.r3 r3Var = f40Var.U2;
        org.telegram.messenger.c cVar = f40Var.n1;
        if (r3Var == null) {
            return;
        }
        boolean z12 = inputPeer instanceof TLRPC.TL_inputPeerUser;
        TLObject a22 = z12 ? org.telegram.messenger.qp.s1(cVar.a).a2(Long.valueOf(inputPeer.user_id)) : inputPeer instanceof TLRPC.TL_inputPeerChat ? org.telegram.messenger.qp.s1(cVar.a).M0(Long.valueOf(inputPeer.chat_id)) : org.telegram.messenger.qp.s1(cVar.a).M0(Long.valueOf(inputPeer.channel_id));
        if (!f40Var.U2.j()) {
            if (VoIPService.getSharedInstance() == null || !z9) {
                return;
            }
            VoIPService.getSharedInstance().setGroupCallPeer(inputPeer);
            f40Var.v2 = a22;
            return;
        }
        f40Var.n1().k(0L, 37, a22, f40Var.T2, null, null);
        if (inputPeer instanceof TLRPC.TL_inputPeerChannel) {
            TLRPC.TL_peerChannel tL_peerChannel = new TLRPC.TL_peerChannel();
            f40Var.u2 = tL_peerChannel;
            tL_peerChannel.channel_id = inputPeer.channel_id;
        } else if (z12) {
            TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
            f40Var.u2 = tL_peerUser;
            tL_peerUser.user_id = inputPeer.user_id;
        } else if (inputPeer instanceof TLRPC.TL_inputPeerChat) {
            TLRPC.TL_peerChat tL_peerChat = new TLRPC.TL_peerChat();
            f40Var.u2 = tL_peerChat;
            tL_peerChat.chat_id = inputPeer.chat_id;
        }
        f40Var.S2 = inputPeer;
        TLRPC.ChatFull N0 = org.telegram.messenger.qp.s1(cVar.a).N0(f40Var.l1());
        if (N0 != null) {
            N0.groupcall_default_join_as = f40Var.u2;
            if (N0 instanceof TLRPC.TL_chatFull) {
                N0.flags |= 32768;
            } else {
                N0.flags |= 67108864;
            }
        }
        TL_phone.saveDefaultGroupCallJoinAs savedefaultgroupcalljoinas = new TL_phone.saveDefaultGroupCallJoinAs();
        savedefaultgroupcalljoinas.peer = org.telegram.messenger.qp.l1(f40Var.T2);
        savedefaultgroupcalljoinas.join_as = inputPeer;
        ConnectionsManager.getInstance(cVar.a).sendRequest(savedefaultgroupcalljoinas, new di.v5(9));
        f40Var.O1();
    }

    @Override // org.telegram.ui.ActionBar.r1
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        k30 k30Var = this.a;
        f40 f40Var = k30Var.b;
        org.telegram.messenger.r3 r3Var = f40Var.U2;
        org.telegram.messenger.c cVar = f40Var.n1;
        if (r3Var.j()) {
            int i10 = cVar.a;
            TLRPC.ChatFull N0 = org.telegram.messenger.qp.s1(i10).N0(f40Var.l1());
            if (N0 != null) {
                N0.flags &= -2097153;
                N0.call = null;
                org.telegram.messenger.qs.f(i10).k(org.telegram.messenger.qs.w2, Long.valueOf(f40Var.l1()), Long.valueOf(f40Var.U2.b.id), Boolean.FALSE);
            }
            TL_phone.discardGroupCall discardgroupcall = new TL_phone.discardGroupCall();
            org.telegram.messenger.r3 r3Var2 = f40Var.U2;
            discardgroupcall.call = r3Var2.g(r3Var2.a);
            ConnectionsManager.getInstance(i10).sendRequest(discardgroupcall, new l(k30Var, 9));
        } else if (VoIPService.getSharedInstance() != null) {
            VoIPService.getSharedInstance().hangUp(1);
        }
        f40Var.dismiss();
        org.telegram.messenger.qs.e().k(org.telegram.messenger.qs.v2, new Object[0]);
    }
}
