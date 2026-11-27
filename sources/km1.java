// default package

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class km1 implements n39 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ zu1 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ r47 d;

    public /* synthetic */ km1(zu1 zu1Var, boolean z, r47 r47Var, byte b) {
        this.a = b;
        this.b = zu1Var;
        this.c = z;
        this.d = r47Var;
    }

    @Override // n39
    public final void g(long j, TLRPC.MessagePeerReaction messagePeerReaction) {
        byte b = this.a;
        byte b2 = 0;
        r47 r47Var = this.d;
        boolean z = this.c;
        switch (b) {
            case 0:
                final zu1 zu1Var = this.b;
                zu1Var.getClass();
                if (messagePeerReaction != null && messagePeerReaction.reaction != null && j != zu1Var.getUserConfig().e() && z) {
                    final ArrayList arrayList = new ArrayList(1);
                    arrayList.add(r47Var);
                    TLObject b22 = zu1Var.getMessagesController().b2(j);
                    final ArrayList arrayList2 = new ArrayList(1);
                    arrayList2.add(b22);
                    final TLRPC.ChannelParticipant[] channelParticipantArr = new TLRPC.ChannelParticipant[1];
                    TLRPC.TL_channels_getParticipant tL_channels_getParticipant = new TLRPC.TL_channels_getParticipant();
                    tL_channels_getParticipant.channel = uc7.i1(zu1Var.e);
                    tL_channels_getParticipant.participant = uc7.k1(b22);
                    final byte b3 = 0;
                    zu1Var.getConnectionsManager().sendRequestTyped(tL_channels_getParticipant, new ic(b2), new icc() { // from class: ho1
                        @Override // icc
                        public final void a(Object obj, Object obj2) {
                            switch (b3) {
                                case 0:
                                    TLRPC.TL_channels_channelParticipant tL_channels_channelParticipant = (TLRPC.TL_channels_channelParticipant) obj;
                                    zu1 zu1Var2 = zu1Var;
                                    TLRPC.ChannelParticipant[] channelParticipantArr2 = channelParticipantArr;
                                    if (tL_channels_channelParticipant != null) {
                                        zu1Var2.getMessagesController().j4(tL_channels_channelParticipant.users, false);
                                        zu1Var2.getMessagesController().c4(tL_channels_channelParticipant.chats, false);
                                        channelParticipantArr2[0] = tL_channels_channelParticipant.participant;
                                    } else {
                                        zu1Var2.getClass();
                                    }
                                    new me3(zu1Var2, zu1Var2.e, arrayList, arrayList2, channelParticipantArr2, zu1Var2.d7, (int) zu1Var2.c(), zu1Var2.g4, true, new kc((byte) 10)).show();
                                    break;
                                default:
                                    TLRPC.TL_channels_channelParticipant tL_channels_channelParticipant2 = (TLRPC.TL_channels_channelParticipant) obj;
                                    zu1 zu1Var3 = zu1Var;
                                    TLRPC.ChannelParticipant[] channelParticipantArr3 = channelParticipantArr;
                                    if (tL_channels_channelParticipant2 != null) {
                                        zu1Var3.getMessagesController().j4(tL_channels_channelParticipant2.users, false);
                                        zu1Var3.getMessagesController().c4(tL_channels_channelParticipant2.chats, false);
                                        channelParticipantArr3[0] = tL_channels_channelParticipant2.participant;
                                    }
                                    new me3(zu1Var3, zu1Var3.e, arrayList, arrayList2, channelParticipantArr3, zu1Var3.d7, (int) zu1Var3.c(), zu1Var3.g4, true, new kc((byte) 10)).show();
                                    break;
                            }
                        }
                    });
                    zu1Var.M5(true);
                    break;
                }
                break;
            default:
                if (messagePeerReaction != null && messagePeerReaction.reaction != null) {
                    final zu1 zu1Var2 = this.b;
                    if (j != zu1Var2.getUserConfig().e() && z) {
                        final ArrayList arrayList3 = new ArrayList(1);
                        arrayList3.add(r47Var);
                        TLObject b23 = zu1Var2.getMessagesController().b2(j);
                        final ArrayList arrayList4 = new ArrayList(1);
                        arrayList4.add(b23);
                        final TLRPC.ChannelParticipant[] channelParticipantArr2 = new TLRPC.ChannelParticipant[1];
                        TLRPC.TL_channels_getParticipant tL_channels_getParticipant2 = new TLRPC.TL_channels_getParticipant();
                        tL_channels_getParticipant2.channel = uc7.i1(zu1Var2.e);
                        tL_channels_getParticipant2.participant = uc7.k1(b23);
                        final byte b4 = 1;
                        zu1Var2.getConnectionsManager().sendRequestTyped(tL_channels_getParticipant2, new ic(b2), new icc() { // from class: ho1
                            @Override // icc
                            public final void a(Object obj, Object obj2) {
                                switch (b4) {
                                    case 0:
                                        TLRPC.TL_channels_channelParticipant tL_channels_channelParticipant = (TLRPC.TL_channels_channelParticipant) obj;
                                        zu1 zu1Var22 = zu1Var2;
                                        TLRPC.ChannelParticipant[] channelParticipantArr22 = channelParticipantArr2;
                                        if (tL_channels_channelParticipant != null) {
                                            zu1Var22.getMessagesController().j4(tL_channels_channelParticipant.users, false);
                                            zu1Var22.getMessagesController().c4(tL_channels_channelParticipant.chats, false);
                                            channelParticipantArr22[0] = tL_channels_channelParticipant.participant;
                                        } else {
                                            zu1Var22.getClass();
                                        }
                                        new me3(zu1Var22, zu1Var22.e, arrayList3, arrayList4, channelParticipantArr22, zu1Var22.d7, (int) zu1Var22.c(), zu1Var22.g4, true, new kc((byte) 10)).show();
                                        break;
                                    default:
                                        TLRPC.TL_channels_channelParticipant tL_channels_channelParticipant2 = (TLRPC.TL_channels_channelParticipant) obj;
                                        zu1 zu1Var3 = zu1Var2;
                                        TLRPC.ChannelParticipant[] channelParticipantArr3 = channelParticipantArr2;
                                        if (tL_channels_channelParticipant2 != null) {
                                            zu1Var3.getMessagesController().j4(tL_channels_channelParticipant2.users, false);
                                            zu1Var3.getMessagesController().c4(tL_channels_channelParticipant2.chats, false);
                                            channelParticipantArr3[0] = tL_channels_channelParticipant2.participant;
                                        }
                                        new me3(zu1Var3, zu1Var3.e, arrayList3, arrayList4, channelParticipantArr3, zu1Var3.d7, (int) zu1Var3.c(), zu1Var3.g4, true, new kc((byte) 10)).show();
                                        break;
                                }
                            }
                        });
                        zu1Var2.M5(true);
                        break;
                    }
                }
                break;
        }
    }
}
