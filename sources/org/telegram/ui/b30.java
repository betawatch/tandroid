package org.telegram.ui;

import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class b30 implements org.telegram.ui.ActionBar.q1, org.telegram.ui.Components.t60 {
    public final /* synthetic */ h30 a;

    public /* synthetic */ b30(h30 h30Var) {
        this.a = h30Var;
    }

    @Override // org.telegram.ui.Components.t60
    public void a(TLRPC.InputPeer inputPeer, boolean z10, boolean z11, boolean z12) {
        c40 c40Var = this.a.b;
        org.telegram.messenger.r3 r3Var = c40Var.V2;
        org.telegram.messenger.c cVar = c40Var.o1;
        if (r3Var == null) {
            return;
        }
        boolean z13 = inputPeer instanceof TLRPC.TL_inputPeerUser;
        TLObject a22 = z13 ? org.telegram.messenger.np.s1(cVar.a).a2(Long.valueOf(inputPeer.user_id)) : inputPeer instanceof TLRPC.TL_inputPeerChat ? org.telegram.messenger.np.s1(cVar.a).M0(Long.valueOf(inputPeer.chat_id)) : org.telegram.messenger.np.s1(cVar.a).M0(Long.valueOf(inputPeer.channel_id));
        if (!c40Var.V2.j()) {
            if (VoIPService.getSharedInstance() == null || !z10) {
                return;
            }
            VoIPService.getSharedInstance().setGroupCallPeer(inputPeer);
            c40Var.w2 = a22;
            return;
        }
        c40Var.n1().k(0L, 37, a22, c40Var.U2, null, null);
        if (inputPeer instanceof TLRPC.TL_inputPeerChannel) {
            TLRPC.TL_peerChannel tL_peerChannel = new TLRPC.TL_peerChannel();
            c40Var.v2 = tL_peerChannel;
            tL_peerChannel.channel_id = inputPeer.channel_id;
        } else if (z13) {
            TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
            c40Var.v2 = tL_peerUser;
            tL_peerUser.user_id = inputPeer.user_id;
        } else if (inputPeer instanceof TLRPC.TL_inputPeerChat) {
            TLRPC.TL_peerChat tL_peerChat = new TLRPC.TL_peerChat();
            c40Var.v2 = tL_peerChat;
            tL_peerChat.chat_id = inputPeer.chat_id;
        }
        c40Var.T2 = inputPeer;
        TLRPC.ChatFull N0 = org.telegram.messenger.np.s1(cVar.a).N0(c40Var.l1());
        if (N0 != null) {
            N0.groupcall_default_join_as = c40Var.v2;
            if (N0 instanceof TLRPC.TL_chatFull) {
                N0.flags |= 32768;
            } else {
                N0.flags |= 67108864;
            }
        }
        TL_phone.saveDefaultGroupCallJoinAs savedefaultgroupcalljoinas = new TL_phone.saveDefaultGroupCallJoinAs();
        savedefaultgroupcalljoinas.peer = org.telegram.messenger.np.l1(c40Var.U2);
        savedefaultgroupcalljoinas.join_as = inputPeer;
        ConnectionsManager.getInstance(cVar.a).sendRequest(savedefaultgroupcalljoinas, new fi.m5(9));
        c40Var.O1();
    }

    @Override // org.telegram.ui.ActionBar.q1
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        h30 h30Var = this.a;
        c40 c40Var = h30Var.b;
        org.telegram.messenger.r3 r3Var = c40Var.V2;
        org.telegram.messenger.c cVar = c40Var.o1;
        if (r3Var.j()) {
            int i10 = cVar.a;
            TLRPC.ChatFull N0 = org.telegram.messenger.np.s1(i10).N0(c40Var.l1());
            if (N0 != null) {
                N0.flags &= -2097153;
                N0.call = null;
                org.telegram.messenger.ns.f(i10).k(org.telegram.messenger.ns.w2, Long.valueOf(c40Var.l1()), Long.valueOf(c40Var.V2.b.id), Boolean.FALSE);
            }
            TL_phone.discardGroupCall discardgroupcall = new TL_phone.discardGroupCall();
            org.telegram.messenger.r3 r3Var2 = c40Var.V2;
            discardgroupcall.call = r3Var2.g(r3Var2.a);
            ConnectionsManager.getInstance(i10).sendRequest(discardgroupcall, new l(h30Var, 9));
        } else if (VoIPService.getSharedInstance() != null) {
            VoIPService.getSharedInstance().hangUp(1);
        }
        c40Var.dismiss();
        org.telegram.messenger.ns.e().k(org.telegram.messenger.ns.v2, new Object[0]);
    }
}
