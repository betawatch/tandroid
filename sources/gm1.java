// default package

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class gm1 implements zz8 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ mu1 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ k27 d;

    public /* synthetic */ gm1(mu1 mu1Var, boolean z, k27 k27Var, byte b) {
        this.a = b;
        this.b = mu1Var;
        this.c = z;
        this.d = k27Var;
    }

    @Override // zz8
    public final void l(long j, TLRPC.MessagePeerReaction messagePeerReaction) {
        byte b = this.a;
        byte b2 = 0;
        k27 k27Var = this.d;
        boolean z = this.c;
        switch (b) {
            case 0:
                if (messagePeerReaction != null && messagePeerReaction.reaction != null) {
                    final mu1 mu1Var = this.b;
                    if (j != mu1Var.getUserConfig().e() && z) {
                        final ArrayList arrayList = new ArrayList(1);
                        arrayList.add(k27Var);
                        TLObject Z1 = mu1Var.getMessagesController().Z1(j);
                        final ArrayList arrayList2 = new ArrayList(1);
                        arrayList2.add(Z1);
                        final TLRPC.ChannelParticipant[] channelParticipantArr = new TLRPC.ChannelParticipant[1];
                        TLRPC.TL_channels_getParticipant tL_channels_getParticipant = new TLRPC.TL_channels_getParticipant();
                        tL_channels_getParticipant.channel = na7.g1(mu1Var.e);
                        tL_channels_getParticipant.participant = na7.i1(Z1);
                        final byte b3 = 0;
                        mu1Var.getConnectionsManager().sendRequestTyped(tL_channels_getParticipant, new hc(b2), new i8c() { // from class: kn1
                            @Override // i8c
                            public final void a(Object obj, Object obj2) {
                                switch (b3) {
                                    case 0:
                                        TLRPC.TL_channels_channelParticipant tL_channels_channelParticipant = (TLRPC.TL_channels_channelParticipant) obj;
                                        mu1 mu1Var2 = mu1Var;
                                        TLRPC.ChannelParticipant[] channelParticipantArr2 = channelParticipantArr;
                                        if (tL_channels_channelParticipant != null) {
                                            mu1Var2.getMessagesController().b4(tL_channels_channelParticipant.users, false);
                                            mu1Var2.getMessagesController().V3(tL_channels_channelParticipant.chats, false);
                                            channelParticipantArr2[0] = tL_channels_channelParticipant.participant;
                                        }
                                        new sd3(mu1Var2, mu1Var2.e, arrayList, arrayList2, channelParticipantArr2, mu1Var2.d7, (int) mu1Var2.d(), mu1Var2.g4, true, new jc((byte) 10)).show();
                                        break;
                                    default:
                                        TLRPC.TL_channels_channelParticipant tL_channels_channelParticipant2 = (TLRPC.TL_channels_channelParticipant) obj;
                                        mu1 mu1Var3 = mu1Var;
                                        TLRPC.ChannelParticipant[] channelParticipantArr3 = channelParticipantArr;
                                        if (tL_channels_channelParticipant2 != null) {
                                            mu1Var3.getMessagesController().b4(tL_channels_channelParticipant2.users, false);
                                            mu1Var3.getMessagesController().V3(tL_channels_channelParticipant2.chats, false);
                                            channelParticipantArr3[0] = tL_channels_channelParticipant2.participant;
                                        } else {
                                            mu1Var3.getClass();
                                        }
                                        new sd3(mu1Var3, mu1Var3.e, arrayList, arrayList2, channelParticipantArr3, mu1Var3.d7, (int) mu1Var3.d(), mu1Var3.g4, true, new jc((byte) 10)).show();
                                        break;
                                }
                            }
                        });
                        mu1Var.G5(true);
                        break;
                    }
                }
                break;
            default:
                final mu1 mu1Var2 = this.b;
                mu1Var2.getClass();
                if (messagePeerReaction != null && messagePeerReaction.reaction != null && j != mu1Var2.getUserConfig().e() && z) {
                    final ArrayList arrayList3 = new ArrayList(1);
                    arrayList3.add(k27Var);
                    TLObject Z12 = mu1Var2.getMessagesController().Z1(j);
                    final ArrayList arrayList4 = new ArrayList(1);
                    arrayList4.add(Z12);
                    final TLRPC.ChannelParticipant[] channelParticipantArr2 = new TLRPC.ChannelParticipant[1];
                    TLRPC.TL_channels_getParticipant tL_channels_getParticipant2 = new TLRPC.TL_channels_getParticipant();
                    tL_channels_getParticipant2.channel = na7.g1(mu1Var2.e);
                    tL_channels_getParticipant2.participant = na7.i1(Z12);
                    final byte b4 = 1;
                    mu1Var2.getConnectionsManager().sendRequestTyped(tL_channels_getParticipant2, new hc(b2), new i8c() { // from class: kn1
                        @Override // i8c
                        public final void a(Object obj, Object obj2) {
                            switch (b4) {
                                case 0:
                                    TLRPC.TL_channels_channelParticipant tL_channels_channelParticipant = (TLRPC.TL_channels_channelParticipant) obj;
                                    mu1 mu1Var22 = mu1Var2;
                                    TLRPC.ChannelParticipant[] channelParticipantArr22 = channelParticipantArr2;
                                    if (tL_channels_channelParticipant != null) {
                                        mu1Var22.getMessagesController().b4(tL_channels_channelParticipant.users, false);
                                        mu1Var22.getMessagesController().V3(tL_channels_channelParticipant.chats, false);
                                        channelParticipantArr22[0] = tL_channels_channelParticipant.participant;
                                    }
                                    new sd3(mu1Var22, mu1Var22.e, arrayList3, arrayList4, channelParticipantArr22, mu1Var22.d7, (int) mu1Var22.d(), mu1Var22.g4, true, new jc((byte) 10)).show();
                                    break;
                                default:
                                    TLRPC.TL_channels_channelParticipant tL_channels_channelParticipant2 = (TLRPC.TL_channels_channelParticipant) obj;
                                    mu1 mu1Var3 = mu1Var2;
                                    TLRPC.ChannelParticipant[] channelParticipantArr3 = channelParticipantArr2;
                                    if (tL_channels_channelParticipant2 != null) {
                                        mu1Var3.getMessagesController().b4(tL_channels_channelParticipant2.users, false);
                                        mu1Var3.getMessagesController().V3(tL_channels_channelParticipant2.chats, false);
                                        channelParticipantArr3[0] = tL_channels_channelParticipant2.participant;
                                    } else {
                                        mu1Var3.getClass();
                                    }
                                    new sd3(mu1Var3, mu1Var3.e, arrayList3, arrayList4, channelParticipantArr3, mu1Var3.d7, (int) mu1Var3.d(), mu1Var3.g4, true, new jc((byte) 10)).show();
                                    break;
                            }
                        }
                    });
                    mu1Var2.G5(true);
                    break;
                }
                break;
        }
    }
}
