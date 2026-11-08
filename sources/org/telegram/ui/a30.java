package org.telegram.ui;

import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class a30 implements org.telegram.ui.ActionBar.r1, org.telegram.ui.Components.r60 {
    public final /* synthetic */ h30 a;

    public /* synthetic */ a30(h30 h30Var) {
        this.a = h30Var;
    }

    @Override // org.telegram.ui.Components.r60
    public void a(TLRPC.InputPeer inputPeer, boolean z9, boolean z10, boolean z11) {
        c40 c40Var = this.a.b;
        org.telegram.messenger.r3 r3Var = c40Var.R2;
        org.telegram.messenger.c cVar = c40Var.k1;
        if (r3Var == null) {
            return;
        }
        boolean z12 = inputPeer instanceof TLRPC.TL_inputPeerUser;
        TLObject a22 = z12 ? org.telegram.messenger.qp.s1(cVar.a).a2(Long.valueOf(inputPeer.user_id)) : inputPeer instanceof TLRPC.TL_inputPeerChat ? org.telegram.messenger.qp.s1(cVar.a).M0(Long.valueOf(inputPeer.chat_id)) : org.telegram.messenger.qp.s1(cVar.a).M0(Long.valueOf(inputPeer.channel_id));
        if (!c40Var.R2.j()) {
            if (VoIPService.getSharedInstance() == null || !z9) {
                return;
            }
            VoIPService.getSharedInstance().setGroupCallPeer(inputPeer);
            c40Var.s2 = a22;
            return;
        }
        c40Var.n1().k(0L, 37, a22, c40Var.Q2, null, null);
        if (inputPeer instanceof TLRPC.TL_inputPeerChannel) {
            TLRPC.TL_peerChannel tL_peerChannel = new TLRPC.TL_peerChannel();
            c40Var.r2 = tL_peerChannel;
            tL_peerChannel.channel_id = inputPeer.channel_id;
        } else if (z12) {
            TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
            c40Var.r2 = tL_peerUser;
            tL_peerUser.user_id = inputPeer.user_id;
        } else if (inputPeer instanceof TLRPC.TL_inputPeerChat) {
            TLRPC.TL_peerChat tL_peerChat = new TLRPC.TL_peerChat();
            c40Var.r2 = tL_peerChat;
            tL_peerChat.chat_id = inputPeer.chat_id;
        }
        c40Var.P2 = inputPeer;
        TLRPC.ChatFull N0 = org.telegram.messenger.qp.s1(cVar.a).N0(c40Var.l1());
        if (N0 != null) {
            N0.groupcall_default_join_as = c40Var.r2;
            if (N0 instanceof TLRPC.TL_chatFull) {
                N0.flags |= 32768;
            } else {
                N0.flags |= 67108864;
            }
        }
        TL_phone.saveDefaultGroupCallJoinAs savedefaultgroupcalljoinas = new TL_phone.saveDefaultGroupCallJoinAs();
        savedefaultgroupcalljoinas.peer = org.telegram.messenger.qp.l1(c40Var.Q2);
        savedefaultgroupcalljoinas.join_as = inputPeer;
        ConnectionsManager.getInstance(cVar.a).sendRequest(savedefaultgroupcalljoinas, new di.u5(9));
        c40Var.O1();
    }

    @Override // org.telegram.ui.ActionBar.r1
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        h30 h30Var = this.a;
        c40 c40Var = h30Var.b;
        org.telegram.messenger.r3 r3Var = c40Var.R2;
        org.telegram.messenger.c cVar = c40Var.k1;
        if (r3Var.j()) {
            int i10 = cVar.a;
            TLRPC.ChatFull N0 = org.telegram.messenger.qp.s1(i10).N0(c40Var.l1());
            if (N0 != null) {
                N0.flags &= -2097153;
                N0.call = null;
                org.telegram.messenger.qs.f(i10).k(org.telegram.messenger.qs.w2, Long.valueOf(c40Var.l1()), Long.valueOf(c40Var.R2.b.id), Boolean.FALSE);
            }
            TL_phone.discardGroupCall discardgroupcall = new TL_phone.discardGroupCall();
            org.telegram.messenger.r3 r3Var2 = c40Var.R2;
            discardgroupcall.call = r3Var2.g(r3Var2.a);
            ConnectionsManager.getInstance(i10).sendRequest(discardgroupcall, new l(h30Var, 9));
        } else if (VoIPService.getSharedInstance() != null) {
            VoIPService.getSharedInstance().hangUp(1);
        }
        c40Var.dismiss();
        org.telegram.messenger.qs.e().k(org.telegram.messenger.qs.v2, new Object[0]);
    }
}
