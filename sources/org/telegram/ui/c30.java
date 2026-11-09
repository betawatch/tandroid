package org.telegram.ui;

import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class c30 implements org.telegram.ui.ActionBar.r1, org.telegram.ui.Components.s60 {
    public final /* synthetic */ j30 a;

    public /* synthetic */ c30(j30 j30Var) {
        this.a = j30Var;
    }

    @Override // org.telegram.ui.Components.s60
    public void a(TLRPC.InputPeer inputPeer, boolean z9, boolean z10, boolean z11) {
        e40 e40Var = this.a.b;
        org.telegram.messenger.r3 r3Var = e40Var.R2;
        org.telegram.messenger.c cVar = e40Var.k1;
        if (r3Var == null) {
            return;
        }
        boolean z12 = inputPeer instanceof TLRPC.TL_inputPeerUser;
        TLObject a22 = z12 ? org.telegram.messenger.qp.s1(cVar.a).a2(Long.valueOf(inputPeer.user_id)) : inputPeer instanceof TLRPC.TL_inputPeerChat ? org.telegram.messenger.qp.s1(cVar.a).M0(Long.valueOf(inputPeer.chat_id)) : org.telegram.messenger.qp.s1(cVar.a).M0(Long.valueOf(inputPeer.channel_id));
        if (!e40Var.R2.j()) {
            if (VoIPService.getSharedInstance() == null || !z9) {
                return;
            }
            VoIPService.getSharedInstance().setGroupCallPeer(inputPeer);
            e40Var.s2 = a22;
            return;
        }
        e40Var.n1().k(0L, 37, a22, e40Var.Q2, null, null);
        if (inputPeer instanceof TLRPC.TL_inputPeerChannel) {
            TLRPC.TL_peerChannel tL_peerChannel = new TLRPC.TL_peerChannel();
            e40Var.r2 = tL_peerChannel;
            tL_peerChannel.channel_id = inputPeer.channel_id;
        } else if (z12) {
            TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
            e40Var.r2 = tL_peerUser;
            tL_peerUser.user_id = inputPeer.user_id;
        } else if (inputPeer instanceof TLRPC.TL_inputPeerChat) {
            TLRPC.TL_peerChat tL_peerChat = new TLRPC.TL_peerChat();
            e40Var.r2 = tL_peerChat;
            tL_peerChat.chat_id = inputPeer.chat_id;
        }
        e40Var.P2 = inputPeer;
        TLRPC.ChatFull N0 = org.telegram.messenger.qp.s1(cVar.a).N0(e40Var.l1());
        if (N0 != null) {
            N0.groupcall_default_join_as = e40Var.r2;
            if (N0 instanceof TLRPC.TL_chatFull) {
                N0.flags |= 32768;
            } else {
                N0.flags |= 67108864;
            }
        }
        TL_phone.saveDefaultGroupCallJoinAs savedefaultgroupcalljoinas = new TL_phone.saveDefaultGroupCallJoinAs();
        savedefaultgroupcalljoinas.peer = org.telegram.messenger.qp.l1(e40Var.Q2);
        savedefaultgroupcalljoinas.join_as = inputPeer;
        ConnectionsManager.getInstance(cVar.a).sendRequest(savedefaultgroupcalljoinas, new di.v5(9));
        e40Var.O1();
    }

    @Override // org.telegram.ui.ActionBar.r1
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        j30 j30Var = this.a;
        e40 e40Var = j30Var.b;
        org.telegram.messenger.r3 r3Var = e40Var.R2;
        org.telegram.messenger.c cVar = e40Var.k1;
        if (r3Var.j()) {
            int i10 = cVar.a;
            TLRPC.ChatFull N0 = org.telegram.messenger.qp.s1(i10).N0(e40Var.l1());
            if (N0 != null) {
                N0.flags &= -2097153;
                N0.call = null;
                org.telegram.messenger.qs.f(i10).k(org.telegram.messenger.qs.w2, Long.valueOf(e40Var.l1()), Long.valueOf(e40Var.R2.b.id), Boolean.FALSE);
            }
            TL_phone.discardGroupCall discardgroupcall = new TL_phone.discardGroupCall();
            org.telegram.messenger.r3 r3Var2 = e40Var.R2;
            discardgroupcall.call = r3Var2.g(r3Var2.a);
            ConnectionsManager.getInstance(i10).sendRequest(discardgroupcall, new l(j30Var, 9));
        } else if (VoIPService.getSharedInstance() != null) {
            VoIPService.getSharedInstance().hangUp(1);
        }
        e40Var.dismiss();
        org.telegram.messenger.qs.e().k(org.telegram.messenger.qs.v2, new Object[0]);
    }
}
