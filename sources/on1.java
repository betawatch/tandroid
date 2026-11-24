// default package

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class on1 implements b29 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ yv1 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ k47 d;

    public /* synthetic */ on1(yv1 yv1Var, boolean z, k47 k47Var, byte b) {
        this.a = b;
        this.b = yv1Var;
        this.c = z;
        this.d = k47Var;
    }

    @Override // b29
    public final void i(long j, TLRPC.MessagePeerReaction messagePeerReaction) {
        byte b = this.a;
        byte b2 = 0;
        k47 k47Var = this.d;
        boolean z = this.c;
        switch (b) {
            case 0:
                if (messagePeerReaction != null && messagePeerReaction.reaction != null) {
                    final yv1 yv1Var = this.b;
                    if (j != yv1Var.getUserConfig().e() && z) {
                        final ArrayList arrayList = new ArrayList(1);
                        arrayList.add(k47Var);
                        TLObject a2 = yv1Var.getMessagesController().a2(j);
                        final ArrayList arrayList2 = new ArrayList(1);
                        arrayList2.add(a2);
                        final TLRPC.ChannelParticipant[] channelParticipantArr = new TLRPC.ChannelParticipant[1];
                        TLRPC.TL_channels_getParticipant tL_channels_getParticipant = new TLRPC.TL_channels_getParticipant();
                        tL_channels_getParticipant.channel = oc7.h1(yv1Var.e);
                        tL_channels_getParticipant.participant = oc7.j1(a2);
                        final byte b3 = 0;
                        yv1Var.getConnectionsManager().sendRequestTyped(tL_channels_getParticipant, new kc(b2), new jac() { // from class: bp1
                            @Override // jac
                            public final void a(Object obj, Object obj2) {
                                switch (b3) {
                                    case 0:
                                        TLRPC.TL_channels_channelParticipant tL_channels_channelParticipant = (TLRPC.TL_channels_channelParticipant) obj;
                                        yv1 yv1Var2 = yv1Var;
                                        TLRPC.ChannelParticipant[] channelParticipantArr2 = channelParticipantArr;
                                        if (tL_channels_channelParticipant != null) {
                                            yv1Var2.getMessagesController().d4(tL_channels_channelParticipant.users, false);
                                            yv1Var2.getMessagesController().X3(tL_channels_channelParticipant.chats, false);
                                            channelParticipantArr2[0] = tL_channels_channelParticipant.participant;
                                        }
                                        new ef3(yv1Var2, yv1Var2.e, arrayList, arrayList2, channelParticipantArr2, yv1Var2.d7, (int) yv1Var2.d(), yv1Var2.g4, true, new jd((byte) 10)).show();
                                        break;
                                    default:
                                        TLRPC.TL_channels_channelParticipant tL_channels_channelParticipant2 = (TLRPC.TL_channels_channelParticipant) obj;
                                        yv1 yv1Var3 = yv1Var;
                                        TLRPC.ChannelParticipant[] channelParticipantArr3 = channelParticipantArr;
                                        if (tL_channels_channelParticipant2 != null) {
                                            yv1Var3.getMessagesController().d4(tL_channels_channelParticipant2.users, false);
                                            yv1Var3.getMessagesController().X3(tL_channels_channelParticipant2.chats, false);
                                            channelParticipantArr3[0] = tL_channels_channelParticipant2.participant;
                                        } else {
                                            yv1Var3.getClass();
                                        }
                                        new ef3(yv1Var3, yv1Var3.e, arrayList, arrayList2, channelParticipantArr3, yv1Var3.d7, (int) yv1Var3.d(), yv1Var3.g4, true, new jd((byte) 10)).show();
                                        break;
                                }
                            }
                        });
                        yv1Var.N5(true);
                        break;
                    }
                }
                break;
            default:
                final yv1 yv1Var2 = this.b;
                yv1Var2.getClass();
                if (messagePeerReaction != null && messagePeerReaction.reaction != null && j != yv1Var2.getUserConfig().e() && z) {
                    final ArrayList arrayList3 = new ArrayList(1);
                    arrayList3.add(k47Var);
                    TLObject a22 = yv1Var2.getMessagesController().a2(j);
                    final ArrayList arrayList4 = new ArrayList(1);
                    arrayList4.add(a22);
                    final TLRPC.ChannelParticipant[] channelParticipantArr2 = new TLRPC.ChannelParticipant[1];
                    TLRPC.TL_channels_getParticipant tL_channels_getParticipant2 = new TLRPC.TL_channels_getParticipant();
                    tL_channels_getParticipant2.channel = oc7.h1(yv1Var2.e);
                    tL_channels_getParticipant2.participant = oc7.j1(a22);
                    final byte b4 = 1;
                    yv1Var2.getConnectionsManager().sendRequestTyped(tL_channels_getParticipant2, new kc(b2), new jac() { // from class: bp1
                        @Override // jac
                        public final void a(Object obj, Object obj2) {
                            switch (b4) {
                                case 0:
                                    TLRPC.TL_channels_channelParticipant tL_channels_channelParticipant = (TLRPC.TL_channels_channelParticipant) obj;
                                    yv1 yv1Var22 = yv1Var2;
                                    TLRPC.ChannelParticipant[] channelParticipantArr22 = channelParticipantArr2;
                                    if (tL_channels_channelParticipant != null) {
                                        yv1Var22.getMessagesController().d4(tL_channels_channelParticipant.users, false);
                                        yv1Var22.getMessagesController().X3(tL_channels_channelParticipant.chats, false);
                                        channelParticipantArr22[0] = tL_channels_channelParticipant.participant;
                                    }
                                    new ef3(yv1Var22, yv1Var22.e, arrayList3, arrayList4, channelParticipantArr22, yv1Var22.d7, (int) yv1Var22.d(), yv1Var22.g4, true, new jd((byte) 10)).show();
                                    break;
                                default:
                                    TLRPC.TL_channels_channelParticipant tL_channels_channelParticipant2 = (TLRPC.TL_channels_channelParticipant) obj;
                                    yv1 yv1Var3 = yv1Var2;
                                    TLRPC.ChannelParticipant[] channelParticipantArr3 = channelParticipantArr2;
                                    if (tL_channels_channelParticipant2 != null) {
                                        yv1Var3.getMessagesController().d4(tL_channels_channelParticipant2.users, false);
                                        yv1Var3.getMessagesController().X3(tL_channels_channelParticipant2.chats, false);
                                        channelParticipantArr3[0] = tL_channels_channelParticipant2.participant;
                                    } else {
                                        yv1Var3.getClass();
                                    }
                                    new ef3(yv1Var3, yv1Var3.e, arrayList3, arrayList4, channelParticipantArr3, yv1Var3.d7, (int) yv1Var3.d(), yv1Var3.g4, true, new jd((byte) 10)).show();
                                    break;
                            }
                        }
                    });
                    yv1Var2.N5(true);
                    break;
                }
                break;
        }
    }
}
