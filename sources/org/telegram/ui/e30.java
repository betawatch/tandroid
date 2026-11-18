package org.telegram.ui;

import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class e30 implements org.telegram.ui.ActionBar.r1, org.telegram.ui.Components.e70 {
    public final /* synthetic */ k30 a;

    public /* synthetic */ e30(k30 k30Var) {
        this.a = k30Var;
    }

    @Override // org.telegram.ui.Components.e70
    public void a(TLRPC.InputPeer inputPeer, boolean z10, boolean z11, boolean z12) {
        f40 f40Var = this.a.b;
        org.telegram.messenger.t3 t3Var = f40Var.V2;
        org.telegram.messenger.c cVar = f40Var.o1;
        if (t3Var == null) {
            return;
        }
        boolean z13 = inputPeer instanceof TLRPC.TL_inputPeerUser;
        TLObject c22 = z13 ? org.telegram.messenger.mp.u1(cVar.a).c2(Long.valueOf(inputPeer.user_id)) : inputPeer instanceof TLRPC.TL_inputPeerChat ? org.telegram.messenger.mp.u1(cVar.a).O0(Long.valueOf(inputPeer.chat_id)) : org.telegram.messenger.mp.u1(cVar.a).O0(Long.valueOf(inputPeer.channel_id));
        if (!f40Var.V2.j()) {
            if (VoIPService.getSharedInstance() == null || !z10) {
                return;
            }
            VoIPService.getSharedInstance().setGroupCallPeer(inputPeer);
            f40Var.w2 = c22;
            return;
        }
        f40Var.o1().k(0L, 37, c22, f40Var.U2, null, null);
        if (inputPeer instanceof TLRPC.TL_inputPeerChannel) {
            TLRPC.TL_peerChannel tL_peerChannel = new TLRPC.TL_peerChannel();
            f40Var.v2 = tL_peerChannel;
            tL_peerChannel.channel_id = inputPeer.channel_id;
        } else if (z13) {
            TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
            f40Var.v2 = tL_peerUser;
            tL_peerUser.user_id = inputPeer.user_id;
        } else if (inputPeer instanceof TLRPC.TL_inputPeerChat) {
            TLRPC.TL_peerChat tL_peerChat = new TLRPC.TL_peerChat();
            f40Var.v2 = tL_peerChat;
            tL_peerChat.chat_id = inputPeer.chat_id;
        }
        f40Var.T2 = inputPeer;
        TLRPC.ChatFull P0 = org.telegram.messenger.mp.u1(cVar.a).P0(f40Var.m1());
        if (P0 != null) {
            P0.groupcall_default_join_as = f40Var.v2;
            if (P0 instanceof TLRPC.TL_chatFull) {
                P0.flags |= 32768;
            } else {
                P0.flags |= 67108864;
            }
        }
        TL_phone.saveDefaultGroupCallJoinAs savedefaultgroupcalljoinas = new TL_phone.saveDefaultGroupCallJoinAs();
        savedefaultgroupcalljoinas.peer = org.telegram.messenger.mp.n1(f40Var.U2);
        savedefaultgroupcalljoinas.join_as = inputPeer;
        ConnectionsManager.getInstance(cVar.a).sendRequest(savedefaultgroupcalljoinas, new fi.k5(9));
        f40Var.P1();
    }

    @Override // org.telegram.ui.ActionBar.r1
    public void h(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        k30 k30Var = this.a;
        f40 f40Var = k30Var.b;
        org.telegram.messenger.t3 t3Var = f40Var.V2;
        org.telegram.messenger.c cVar = f40Var.o1;
        if (t3Var.j()) {
            int i10 = cVar.a;
            TLRPC.ChatFull P0 = org.telegram.messenger.mp.u1(i10).P0(f40Var.m1());
            if (P0 != null) {
                P0.flags &= -2097153;
                P0.call = null;
                org.telegram.messenger.ks.f(i10).k(org.telegram.messenger.ks.w2, Long.valueOf(f40Var.m1()), Long.valueOf(f40Var.V2.b.id), Boolean.FALSE);
            }
            TL_phone.discardGroupCall discardgroupcall = new TL_phone.discardGroupCall();
            org.telegram.messenger.t3 t3Var2 = f40Var.V2;
            discardgroupcall.call = t3Var2.g(t3Var2.a);
            ConnectionsManager.getInstance(i10).sendRequest(discardgroupcall, new l(k30Var, 9));
        } else if (VoIPService.getSharedInstance() != null) {
            VoIPService.getSharedInstance().hangUp(1);
        }
        f40Var.dismiss();
        org.telegram.messenger.ks.e().k(org.telegram.messenger.ks.v2, new Object[0]);
    }
}
