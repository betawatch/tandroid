package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class kf implements org.telegram.ui.Components.rh0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ cn b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ org.telegram.messenger.ij d;

    public /* synthetic */ kf(cn cnVar, boolean z9, org.telegram.messenger.ij ijVar, int i7) {
        this.a = i7;
        this.b = cnVar;
        this.c = z9;
        this.d = ijVar;
    }

    @Override // org.telegram.ui.Components.rh0
    public final void d(long j3, TLRPC.MessagePeerReaction messagePeerReaction) {
        switch (this.a) {
            case 0:
                if (messagePeerReaction != null && messagePeerReaction.reaction != null) {
                    final cn cnVar = this.b;
                    if (j3 != cnVar.getUserConfig().e() && this.c) {
                        final ArrayList arrayList = new ArrayList(1);
                        arrayList.add(this.d);
                        TLObject e22 = cnVar.getMessagesController().e2(j3);
                        final ArrayList arrayList2 = new ArrayList(1);
                        arrayList2.add(e22);
                        final TLRPC.ChannelParticipant[] channelParticipantArr = new TLRPC.ChannelParticipant[1];
                        TLRPC.TL_channels_getParticipant tL_channels_getParticipant = new TLRPC.TL_channels_getParticipant();
                        tL_channels_getParticipant.channel = org.telegram.messenger.qp.i1(cnVar.e);
                        tL_channels_getParticipant.participant = org.telegram.messenger.qp.k1(e22);
                        final int i7 = 0;
                        cnVar.getConnectionsManager().sendRequestTyped(tL_channels_getParticipant, new d3.b(1), new org.telegram.messenger.v10() { // from class: org.telegram.ui.kg
                            @Override // org.telegram.messenger.v10
                            public final void a(Object obj, Object obj2) {
                                TLRPC.TL_channels_channelParticipant tL_channels_channelParticipant = (TLRPC.TL_channels_channelParticipant) obj;
                                switch (i7) {
                                    case 0:
                                        cn cnVar2 = cnVar;
                                        TLRPC.ChannelParticipant[] channelParticipantArr2 = channelParticipantArr;
                                        if (tL_channels_channelParticipant != null) {
                                            cnVar2.getMessagesController().Y3(tL_channels_channelParticipant.users, false);
                                            cnVar2.getMessagesController().S3(tL_channels_channelParticipant.chats, false);
                                            channelParticipantArr2[0] = tL_channels_channelParticipant.participant;
                                        } else {
                                            cnVar2.getClass();
                                        }
                                        new org.telegram.ui.Components.lr(cnVar2, cnVar2.e, arrayList, arrayList2, channelParticipantArr2, cnVar2.b7, (int) cnVar2.b(), cnVar2.f4, true, new org.telegram.messenger.rc(14)).show();
                                        break;
                                    default:
                                        cn cnVar3 = cnVar;
                                        TLRPC.ChannelParticipant[] channelParticipantArr3 = channelParticipantArr;
                                        if (tL_channels_channelParticipant != null) {
                                            cnVar3.getMessagesController().Y3(tL_channels_channelParticipant.users, false);
                                            cnVar3.getMessagesController().S3(tL_channels_channelParticipant.chats, false);
                                            channelParticipantArr3[0] = tL_channels_channelParticipant.participant;
                                        } else {
                                            cnVar3.getClass();
                                        }
                                        new org.telegram.ui.Components.lr(cnVar3, cnVar3.e, arrayList, arrayList2, channelParticipantArr3, cnVar3.b7, (int) cnVar3.b(), cnVar3.f4, true, new org.telegram.messenger.rc(14)).show();
                                        break;
                                }
                            }
                        });
                        cnVar.P7(true);
                        break;
                    }
                }
                break;
            default:
                final cn cnVar2 = this.b;
                cnVar2.getClass();
                if (messagePeerReaction != null && messagePeerReaction.reaction != null && j3 != cnVar2.getUserConfig().e() && this.c) {
                    final ArrayList arrayList3 = new ArrayList(1);
                    arrayList3.add(this.d);
                    TLObject e23 = cnVar2.getMessagesController().e2(j3);
                    final ArrayList arrayList4 = new ArrayList(1);
                    arrayList4.add(e23);
                    final TLRPC.ChannelParticipant[] channelParticipantArr2 = new TLRPC.ChannelParticipant[1];
                    TLRPC.TL_channels_getParticipant tL_channels_getParticipant2 = new TLRPC.TL_channels_getParticipant();
                    tL_channels_getParticipant2.channel = org.telegram.messenger.qp.i1(cnVar2.e);
                    tL_channels_getParticipant2.participant = org.telegram.messenger.qp.k1(e23);
                    final int i10 = 1;
                    cnVar2.getConnectionsManager().sendRequestTyped(tL_channels_getParticipant2, new d3.b(1), new org.telegram.messenger.v10() { // from class: org.telegram.ui.kg
                        @Override // org.telegram.messenger.v10
                        public final void a(Object obj, Object obj2) {
                            TLRPC.TL_channels_channelParticipant tL_channels_channelParticipant = (TLRPC.TL_channels_channelParticipant) obj;
                            switch (i10) {
                                case 0:
                                    cn cnVar22 = cnVar2;
                                    TLRPC.ChannelParticipant[] channelParticipantArr22 = channelParticipantArr2;
                                    if (tL_channels_channelParticipant != null) {
                                        cnVar22.getMessagesController().Y3(tL_channels_channelParticipant.users, false);
                                        cnVar22.getMessagesController().S3(tL_channels_channelParticipant.chats, false);
                                        channelParticipantArr22[0] = tL_channels_channelParticipant.participant;
                                    } else {
                                        cnVar22.getClass();
                                    }
                                    new org.telegram.ui.Components.lr(cnVar22, cnVar22.e, arrayList3, arrayList4, channelParticipantArr22, cnVar22.b7, (int) cnVar22.b(), cnVar22.f4, true, new org.telegram.messenger.rc(14)).show();
                                    break;
                                default:
                                    cn cnVar3 = cnVar2;
                                    TLRPC.ChannelParticipant[] channelParticipantArr3 = channelParticipantArr2;
                                    if (tL_channels_channelParticipant != null) {
                                        cnVar3.getMessagesController().Y3(tL_channels_channelParticipant.users, false);
                                        cnVar3.getMessagesController().S3(tL_channels_channelParticipant.chats, false);
                                        channelParticipantArr3[0] = tL_channels_channelParticipant.participant;
                                    } else {
                                        cnVar3.getClass();
                                    }
                                    new org.telegram.ui.Components.lr(cnVar3, cnVar3.e, arrayList3, arrayList4, channelParticipantArr3, cnVar3.b7, (int) cnVar3.b(), cnVar3.f4, true, new org.telegram.messenger.rc(14)).show();
                                    break;
                            }
                        }
                    });
                    cnVar2.P7(true);
                    break;
                }
                break;
        }
    }
}
