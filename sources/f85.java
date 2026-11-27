// default package

import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class f85 implements fd, zv5 {
    public final /* synthetic */ m85 a;

    public /* synthetic */ f85(m85 m85Var) {
        this.a = m85Var;
    }

    @Override // zv5
    public final void a(TLRPC.InputPeer inputPeer, boolean z, boolean z2, boolean z3) {
        j95 j95Var = this.a.b;
        vc2 vc2Var = j95Var.T2;
        k5 k5Var = j95Var.n1;
        if (vc2Var != null) {
            boolean z4 = inputPeer instanceof TLRPC.TL_inputPeerUser;
            TLObject X1 = z4 ? uc7.s1(k5Var.a).X1(Long.valueOf(inputPeer.user_id)) : inputPeer instanceof TLRPC.TL_inputPeerChat ? uc7.s1(k5Var.a).M0(Long.valueOf(inputPeer.chat_id)) : uc7.s1(k5Var.a).M0(Long.valueOf(inputPeer.channel_id));
            if (!j95Var.T2.k()) {
                if (VoIPService.getSharedInstance() == null || !z) {
                    return;
                }
                VoIPService.getSharedInstance().setGroupCallPeer(inputPeer);
                j95Var.v2 = X1;
                return;
            }
            j95Var.d1().k(0L, 37, X1, j95Var.S2, null, null);
            if (inputPeer instanceof TLRPC.TL_inputPeerChannel) {
                TLRPC.TL_peerChannel tL_peerChannel = new TLRPC.TL_peerChannel();
                j95Var.u2 = tL_peerChannel;
                tL_peerChannel.channel_id = inputPeer.channel_id;
            } else if (z4) {
                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                j95Var.u2 = tL_peerUser;
                tL_peerUser.user_id = inputPeer.user_id;
            } else if (inputPeer instanceof TLRPC.TL_inputPeerChat) {
                TLRPC.TL_peerChat tL_peerChat = new TLRPC.TL_peerChat();
                j95Var.u2 = tL_peerChat;
                tL_peerChat.chat_id = inputPeer.chat_id;
            }
            j95Var.R2 = inputPeer;
            TLRPC.ChatFull N0 = uc7.s1(k5Var.a).N0(j95Var.a1());
            if (N0 != null) {
                N0.groupcall_default_join_as = j95Var.u2;
                boolean z5 = N0 instanceof TLRPC.TL_chatFull;
                int i = N0.flags;
                if (z5) {
                    N0.flags = i | 32768;
                } else {
                    N0.flags = i | 67108864;
                }
            }
            TL_phone.saveDefaultGroupCallJoinAs savedefaultgroupcalljoinas = new TL_phone.saveDefaultGroupCallJoinAs();
            savedefaultgroupcalljoinas.peer = uc7.l1(j95Var.S2);
            savedefaultgroupcalljoinas.join_as = inputPeer;
            ConnectionsManager.getInstance(k5Var.a).sendRequest(savedefaultgroupcalljoinas, new xe2((byte) 0));
            j95Var.F1();
        }
    }

    @Override // fd
    public final void w(id idVar, int i) {
        m85 m85Var = this.a;
        j95 j95Var = m85Var.b;
        vc2 vc2Var = j95Var.T2;
        k5 k5Var = j95Var.n1;
        if (vc2Var.k()) {
            int i2 = k5Var.a;
            int i3 = k5Var.a;
            TLRPC.ChatFull N0 = uc7.s1(i2).N0(j95Var.a1());
            if (N0 != null) {
                N0.flags &= -2097153;
                N0.call = null;
                jn7.f(i3).k(jn7.w2, Long.valueOf(j95Var.a1()), Long.valueOf(j95Var.T2.b.id), Boolean.FALSE);
            }
            TL_phone.discardGroupCall discardgroupcall = new TL_phone.discardGroupCall();
            vc2 vc2Var2 = j95Var.T2;
            discardgroupcall.call = vc2Var2.h(vc2Var2.a);
            ConnectionsManager.getInstance(i3).sendRequest(discardgroupcall, new w15(m85Var, (byte) 2));
        } else if (VoIPService.getSharedInstance() != null) {
            VoIPService.getSharedInstance().hangUp(1);
        }
        j95Var.dismiss();
        jn7.e().k(jn7.v2, new Object[0]);
    }
}
