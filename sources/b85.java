// default package

import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class b85 implements ee, uv5 {
    public final /* synthetic */ i85 a;

    public /* synthetic */ b85(i85 i85Var) {
        this.a = i85Var;
    }

    @Override // uv5
    public final void a(TLRPC.InputPeer inputPeer, boolean z, boolean z2, boolean z3) {
        g95 g95Var = this.a.b;
        qd2 qd2Var = g95Var.T2;
        j5 j5Var = g95Var.n1;
        if (qd2Var != null) {
            boolean z4 = inputPeer instanceof TLRPC.TL_inputPeerUser;
            TLObject W1 = z4 ? oc7.r1(j5Var.a).W1(Long.valueOf(inputPeer.user_id)) : inputPeer instanceof TLRPC.TL_inputPeerChat ? oc7.r1(j5Var.a).L0(Long.valueOf(inputPeer.chat_id)) : oc7.r1(j5Var.a).L0(Long.valueOf(inputPeer.channel_id));
            if (!g95Var.T2.k()) {
                if (VoIPService.getSharedInstance() == null || !z) {
                    return;
                }
                VoIPService.getSharedInstance().setGroupCallPeer(inputPeer);
                g95Var.v2 = W1;
                return;
            }
            g95Var.c1().k(0L, 37, W1, g95Var.S2, null, null);
            if (inputPeer instanceof TLRPC.TL_inputPeerChannel) {
                TLRPC.TL_peerChannel tL_peerChannel = new TLRPC.TL_peerChannel();
                g95Var.u2 = tL_peerChannel;
                tL_peerChannel.channel_id = inputPeer.channel_id;
            } else if (z4) {
                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                g95Var.u2 = tL_peerUser;
                tL_peerUser.user_id = inputPeer.user_id;
            } else if (inputPeer instanceof TLRPC.TL_inputPeerChat) {
                TLRPC.TL_peerChat tL_peerChat = new TLRPC.TL_peerChat();
                g95Var.u2 = tL_peerChat;
                tL_peerChat.chat_id = inputPeer.chat_id;
            }
            g95Var.R2 = inputPeer;
            TLRPC.ChatFull M0 = oc7.r1(j5Var.a).M0(g95Var.Z0());
            if (M0 != null) {
                M0.groupcall_default_join_as = g95Var.u2;
                boolean z5 = M0 instanceof TLRPC.TL_chatFull;
                int i = M0.flags;
                if (z5) {
                    M0.flags = i | 32768;
                } else {
                    M0.flags = i | 67108864;
                }
            }
            TL_phone.saveDefaultGroupCallJoinAs savedefaultgroupcalljoinas = new TL_phone.saveDefaultGroupCallJoinAs();
            savedefaultgroupcalljoinas.peer = oc7.k1(g95Var.S2);
            savedefaultgroupcalljoinas.join_as = inputPeer;
            ConnectionsManager.getInstance(j5Var.a).sendRequest(savedefaultgroupcalljoinas, new nf2((byte) 0));
            g95Var.E1();
        }
    }

    @Override // ee
    public final void r(he heVar, int i) {
        i85 i85Var = this.a;
        g95 g95Var = i85Var.b;
        qd2 qd2Var = g95Var.T2;
        j5 j5Var = g95Var.n1;
        if (qd2Var.k()) {
            int i2 = j5Var.a;
            int i3 = j5Var.a;
            TLRPC.ChatFull M0 = oc7.r1(i2).M0(g95Var.Z0());
            if (M0 != null) {
                M0.flags &= -2097153;
                M0.call = null;
                nm7.f(i3).k(nm7.w2, Long.valueOf(g95Var.Z0()), Long.valueOf(g95Var.T2.b.id), Boolean.FALSE);
            }
            TL_phone.discardGroupCall discardgroupcall = new TL_phone.discardGroupCall();
            qd2 qd2Var2 = g95Var.T2;
            discardgroupcall.call = qd2Var2.h(qd2Var2.a);
            ConnectionsManager.getInstance(i3).sendRequest(discardgroupcall, new r15(i85Var, (byte) 2));
        } else if (VoIPService.getSharedInstance() != null) {
            VoIPService.getSharedInstance().hangUp(1);
        }
        g95Var.dismiss();
        nm7.e().k(nm7.v2, new Object[0]);
    }
}
