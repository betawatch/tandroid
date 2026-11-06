package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final /* synthetic */ class kf implements org.telegram.ui.Components.qh0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ an b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ org.telegram.messenger.ij d;

    public /* synthetic */ kf(an anVar, boolean z9, org.telegram.messenger.ij ijVar, int i7) {
        this.a = i7;
        this.b = anVar;
        this.c = z9;
        this.d = ijVar;
    }

    @Override // org.telegram.ui.Components.qh0
    public final void b(long j3, TLRPC.MessagePeerReaction messagePeerReaction) {
        switch (this.a) {
            case 0:
                if (messagePeerReaction != null && messagePeerReaction.reaction != null) {
                    final an anVar = this.b;
                    if (j3 != anVar.getUserConfig().e() && this.c) {
                        final ArrayList arrayList = new ArrayList(1);
                        arrayList.add(this.d);
                        TLObject e22 = anVar.getMessagesController().e2(j3);
                        final ArrayList arrayList2 = new ArrayList(1);
                        arrayList2.add(e22);
                        final TLRPC.ChannelParticipant[] channelParticipantArr = new TLRPC.ChannelParticipant[1];
                        TLRPC.TL_channels_getParticipant tL_channels_getParticipant = new TLRPC.TL_channels_getParticipant();
                        tL_channels_getParticipant.channel = org.telegram.messenger.qp.i1(anVar.e);
                        tL_channels_getParticipant.participant = org.telegram.messenger.qp.k1(e22);
                        final int i7 = 0;
                        anVar.getConnectionsManager().sendRequestTyped(tL_channels_getParticipant, new d3.b(1), new org.telegram.messenger.v10() { // from class: org.telegram.ui.mg
                            @Override // org.telegram.messenger.v10
                            public final void a(Object obj, Object obj2) {
                                TLRPC.TL_channels_channelParticipant tL_channels_channelParticipant = (TLRPC.TL_channels_channelParticipant) obj;
                                switch (i7) {
                                    case 0:
                                        an anVar2 = anVar;
                                        TLRPC.ChannelParticipant[] channelParticipantArr2 = channelParticipantArr;
                                        if (tL_channels_channelParticipant != null) {
                                            anVar2.getMessagesController().Y3(tL_channels_channelParticipant.users, false);
                                            anVar2.getMessagesController().S3(tL_channels_channelParticipant.chats, false);
                                            channelParticipantArr2[0] = tL_channels_channelParticipant.participant;
                                        } else {
                                            anVar2.getClass();
                                        }
                                        new org.telegram.ui.Components.lr(anVar2, anVar2.e, arrayList, arrayList2, channelParticipantArr2, anVar2.b7, (int) anVar2.b(), anVar2.f4, true, new org.telegram.messenger.pd(12)).show();
                                        break;
                                    default:
                                        an anVar3 = anVar;
                                        TLRPC.ChannelParticipant[] channelParticipantArr3 = channelParticipantArr;
                                        if (tL_channels_channelParticipant != null) {
                                            anVar3.getMessagesController().Y3(tL_channels_channelParticipant.users, false);
                                            anVar3.getMessagesController().S3(tL_channels_channelParticipant.chats, false);
                                            channelParticipantArr3[0] = tL_channels_channelParticipant.participant;
                                        } else {
                                            anVar3.getClass();
                                        }
                                        new org.telegram.ui.Components.lr(anVar3, anVar3.e, arrayList, arrayList2, channelParticipantArr3, anVar3.b7, (int) anVar3.b(), anVar3.f4, true, new org.telegram.messenger.pd(12)).show();
                                        break;
                                }
                            }
                        });
                        anVar.O7(true);
                        break;
                    }
                }
                break;
            default:
                final an anVar2 = this.b;
                anVar2.getClass();
                if (messagePeerReaction != null && messagePeerReaction.reaction != null && j3 != anVar2.getUserConfig().e() && this.c) {
                    final ArrayList arrayList3 = new ArrayList(1);
                    arrayList3.add(this.d);
                    TLObject e23 = anVar2.getMessagesController().e2(j3);
                    final ArrayList arrayList4 = new ArrayList(1);
                    arrayList4.add(e23);
                    final TLRPC.ChannelParticipant[] channelParticipantArr2 = new TLRPC.ChannelParticipant[1];
                    TLRPC.TL_channels_getParticipant tL_channels_getParticipant2 = new TLRPC.TL_channels_getParticipant();
                    tL_channels_getParticipant2.channel = org.telegram.messenger.qp.i1(anVar2.e);
                    tL_channels_getParticipant2.participant = org.telegram.messenger.qp.k1(e23);
                    final int i10 = 1;
                    anVar2.getConnectionsManager().sendRequestTyped(tL_channels_getParticipant2, new d3.b(1), new org.telegram.messenger.v10() { // from class: org.telegram.ui.mg
                        @Override // org.telegram.messenger.v10
                        public final void a(Object obj, Object obj2) {
                            TLRPC.TL_channels_channelParticipant tL_channels_channelParticipant = (TLRPC.TL_channels_channelParticipant) obj;
                            switch (i10) {
                                case 0:
                                    an anVar22 = anVar2;
                                    TLRPC.ChannelParticipant[] channelParticipantArr22 = channelParticipantArr2;
                                    if (tL_channels_channelParticipant != null) {
                                        anVar22.getMessagesController().Y3(tL_channels_channelParticipant.users, false);
                                        anVar22.getMessagesController().S3(tL_channels_channelParticipant.chats, false);
                                        channelParticipantArr22[0] = tL_channels_channelParticipant.participant;
                                    } else {
                                        anVar22.getClass();
                                    }
                                    new org.telegram.ui.Components.lr(anVar22, anVar22.e, arrayList3, arrayList4, channelParticipantArr22, anVar22.b7, (int) anVar22.b(), anVar22.f4, true, new org.telegram.messenger.pd(12)).show();
                                    break;
                                default:
                                    an anVar3 = anVar2;
                                    TLRPC.ChannelParticipant[] channelParticipantArr3 = channelParticipantArr2;
                                    if (tL_channels_channelParticipant != null) {
                                        anVar3.getMessagesController().Y3(tL_channels_channelParticipant.users, false);
                                        anVar3.getMessagesController().S3(tL_channels_channelParticipant.chats, false);
                                        channelParticipantArr3[0] = tL_channels_channelParticipant.participant;
                                    } else {
                                        anVar3.getClass();
                                    }
                                    new org.telegram.ui.Components.lr(anVar3, anVar3.e, arrayList3, arrayList4, channelParticipantArr3, anVar3.b7, (int) anVar3.b(), anVar3.f4, true, new org.telegram.messenger.pd(12)).show();
                                    break;
                            }
                        }
                    });
                    anVar2.O7(true);
                    break;
                }
                break;
        }
    }
}
