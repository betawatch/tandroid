package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class kf implements org.telegram.ui.Components.fi0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ bn b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ org.telegram.messenger.fj d;

    public /* synthetic */ kf(bn bnVar, boolean z10, org.telegram.messenger.fj fjVar, int i7) {
        this.a = i7;
        this.b = bnVar;
        this.c = z10;
        this.d = fjVar;
    }

    @Override // org.telegram.ui.Components.fi0
    public final void a(long j3, TLRPC.MessagePeerReaction messagePeerReaction) {
        switch (this.a) {
            case 0:
                if (messagePeerReaction != null && messagePeerReaction.reaction != null) {
                    final bn bnVar = this.b;
                    if (j3 != bnVar.getUserConfig().e() && this.c) {
                        final ArrayList arrayList = new ArrayList(1);
                        arrayList.add(this.d);
                        TLObject g22 = bnVar.getMessagesController().g2(j3);
                        final ArrayList arrayList2 = new ArrayList(1);
                        arrayList2.add(g22);
                        final TLRPC.ChannelParticipant[] channelParticipantArr = new TLRPC.ChannelParticipant[1];
                        TLRPC.TL_channels_getParticipant tL_channels_getParticipant = new TLRPC.TL_channels_getParticipant();
                        tL_channels_getParticipant.channel = org.telegram.messenger.mp.k1(bnVar.e);
                        tL_channels_getParticipant.participant = org.telegram.messenger.mp.m1(g22);
                        final int i7 = 0;
                        bnVar.getConnectionsManager().sendRequestTyped(tL_channels_getParticipant, new d3.b(1), new org.telegram.messenger.p10() { // from class: org.telegram.ui.jg
                            @Override // org.telegram.messenger.p10
                            public final void a(Object obj, Object obj2) {
                                TLRPC.TL_channels_channelParticipant tL_channels_channelParticipant = (TLRPC.TL_channels_channelParticipant) obj;
                                switch (i7) {
                                    case 0:
                                        bn bnVar2 = bnVar;
                                        TLRPC.ChannelParticipant[] channelParticipantArr2 = channelParticipantArr;
                                        if (tL_channels_channelParticipant != null) {
                                            bnVar2.getMessagesController().f4(tL_channels_channelParticipant.users, false);
                                            bnVar2.getMessagesController().Z3(tL_channels_channelParticipant.chats, false);
                                            channelParticipantArr2[0] = tL_channels_channelParticipant.participant;
                                        } else {
                                            bnVar2.getClass();
                                        }
                                        new org.telegram.ui.Components.xr(bnVar2, bnVar2.e, arrayList, arrayList2, channelParticipantArr2, bnVar2.d7, (int) bnVar2.b(), bnVar2.g4, true, new org.telegram.messenger.j2(20)).show();
                                        break;
                                    default:
                                        bn bnVar3 = bnVar;
                                        TLRPC.ChannelParticipant[] channelParticipantArr3 = channelParticipantArr;
                                        if (tL_channels_channelParticipant != null) {
                                            bnVar3.getMessagesController().f4(tL_channels_channelParticipant.users, false);
                                            bnVar3.getMessagesController().Z3(tL_channels_channelParticipant.chats, false);
                                            channelParticipantArr3[0] = tL_channels_channelParticipant.participant;
                                        } else {
                                            bnVar3.getClass();
                                        }
                                        new org.telegram.ui.Components.xr(bnVar3, bnVar3.e, arrayList, arrayList2, channelParticipantArr3, bnVar3.d7, (int) bnVar3.b(), bnVar3.g4, true, new org.telegram.messenger.j2(20)).show();
                                        break;
                                }
                            }
                        });
                        bnVar.P7(true);
                        break;
                    }
                }
                break;
            default:
                final bn bnVar2 = this.b;
                bnVar2.getClass();
                if (messagePeerReaction != null && messagePeerReaction.reaction != null && j3 != bnVar2.getUserConfig().e() && this.c) {
                    final ArrayList arrayList3 = new ArrayList(1);
                    arrayList3.add(this.d);
                    TLObject g23 = bnVar2.getMessagesController().g2(j3);
                    final ArrayList arrayList4 = new ArrayList(1);
                    arrayList4.add(g23);
                    final TLRPC.ChannelParticipant[] channelParticipantArr2 = new TLRPC.ChannelParticipant[1];
                    TLRPC.TL_channels_getParticipant tL_channels_getParticipant2 = new TLRPC.TL_channels_getParticipant();
                    tL_channels_getParticipant2.channel = org.telegram.messenger.mp.k1(bnVar2.e);
                    tL_channels_getParticipant2.participant = org.telegram.messenger.mp.m1(g23);
                    final int i10 = 1;
                    bnVar2.getConnectionsManager().sendRequestTyped(tL_channels_getParticipant2, new d3.b(1), new org.telegram.messenger.p10() { // from class: org.telegram.ui.jg
                        @Override // org.telegram.messenger.p10
                        public final void a(Object obj, Object obj2) {
                            TLRPC.TL_channels_channelParticipant tL_channels_channelParticipant = (TLRPC.TL_channels_channelParticipant) obj;
                            switch (i10) {
                                case 0:
                                    bn bnVar22 = bnVar2;
                                    TLRPC.ChannelParticipant[] channelParticipantArr22 = channelParticipantArr2;
                                    if (tL_channels_channelParticipant != null) {
                                        bnVar22.getMessagesController().f4(tL_channels_channelParticipant.users, false);
                                        bnVar22.getMessagesController().Z3(tL_channels_channelParticipant.chats, false);
                                        channelParticipantArr22[0] = tL_channels_channelParticipant.participant;
                                    } else {
                                        bnVar22.getClass();
                                    }
                                    new org.telegram.ui.Components.xr(bnVar22, bnVar22.e, arrayList3, arrayList4, channelParticipantArr22, bnVar22.d7, (int) bnVar22.b(), bnVar22.g4, true, new org.telegram.messenger.j2(20)).show();
                                    break;
                                default:
                                    bn bnVar3 = bnVar2;
                                    TLRPC.ChannelParticipant[] channelParticipantArr3 = channelParticipantArr2;
                                    if (tL_channels_channelParticipant != null) {
                                        bnVar3.getMessagesController().f4(tL_channels_channelParticipant.users, false);
                                        bnVar3.getMessagesController().Z3(tL_channels_channelParticipant.chats, false);
                                        channelParticipantArr3[0] = tL_channels_channelParticipant.participant;
                                    } else {
                                        bnVar3.getClass();
                                    }
                                    new org.telegram.ui.Components.xr(bnVar3, bnVar3.e, arrayList3, arrayList4, channelParticipantArr3, bnVar3.d7, (int) bnVar3.b(), bnVar3.g4, true, new org.telegram.messenger.j2(20)).show();
                                    break;
                            }
                        }
                    });
                    bnVar2.P7(true);
                    break;
                }
                break;
        }
    }
}
