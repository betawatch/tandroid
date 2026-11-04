package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class gf implements org.telegram.ui.Components.th0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ wm b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ org.telegram.messenger.zi d;

    public /* synthetic */ gf(wm wmVar, boolean z10, org.telegram.messenger.zi ziVar, int i3) {
        this.a = i3;
        this.b = wmVar;
        this.c = z10;
        this.d = ziVar;
    }

    @Override // org.telegram.ui.Components.th0
    public final void f(long j10, TLRPC.MessagePeerReaction messagePeerReaction) {
        switch (this.a) {
            case 0:
                if (messagePeerReaction != null && messagePeerReaction.reaction != null) {
                    final wm wmVar = this.b;
                    if (j10 != wmVar.getUserConfig().e() && this.c) {
                        final ArrayList arrayList = new ArrayList(1);
                        arrayList.add(this.d);
                        TLObject e22 = wmVar.getMessagesController().e2(j10);
                        final ArrayList arrayList2 = new ArrayList(1);
                        arrayList2.add(e22);
                        final TLRPC.ChannelParticipant[] channelParticipantArr = new TLRPC.ChannelParticipant[1];
                        TLRPC.TL_channels_getParticipant tL_channels_getParticipant = new TLRPC.TL_channels_getParticipant();
                        tL_channels_getParticipant.channel = org.telegram.messenger.hp.i1(wmVar.e);
                        tL_channels_getParticipant.participant = org.telegram.messenger.hp.k1(e22);
                        final int i3 = 0;
                        wmVar.getConnectionsManager().sendRequestTyped(tL_channels_getParticipant, new c3.b(1), new org.telegram.messenger.n10() { // from class: org.telegram.ui.ig
                            @Override // org.telegram.messenger.n10
                            public final void a(Object obj, Object obj2) {
                                TLRPC.TL_channels_channelParticipant tL_channels_channelParticipant = (TLRPC.TL_channels_channelParticipant) obj;
                                switch (i3) {
                                    case 0:
                                        wm wmVar2 = wmVar;
                                        TLRPC.ChannelParticipant[] channelParticipantArr2 = channelParticipantArr;
                                        if (tL_channels_channelParticipant != null) {
                                            wmVar2.getMessagesController().Y3(tL_channels_channelParticipant.users, false);
                                            wmVar2.getMessagesController().S3(tL_channels_channelParticipant.chats, false);
                                            channelParticipantArr2[0] = tL_channels_channelParticipant.participant;
                                        } else {
                                            wmVar2.getClass();
                                        }
                                        new org.telegram.ui.Components.lr(wmVar2, wmVar2.e, arrayList, arrayList2, channelParticipantArr2, wmVar2.c7, (int) wmVar2.b(), wmVar2.g4, true, new org.telegram.messenger.hc(16)).show();
                                        break;
                                    default:
                                        wm wmVar3 = wmVar;
                                        TLRPC.ChannelParticipant[] channelParticipantArr3 = channelParticipantArr;
                                        if (tL_channels_channelParticipant != null) {
                                            wmVar3.getMessagesController().Y3(tL_channels_channelParticipant.users, false);
                                            wmVar3.getMessagesController().S3(tL_channels_channelParticipant.chats, false);
                                            channelParticipantArr3[0] = tL_channels_channelParticipant.participant;
                                        } else {
                                            wmVar3.getClass();
                                        }
                                        new org.telegram.ui.Components.lr(wmVar3, wmVar3.e, arrayList, arrayList2, channelParticipantArr3, wmVar3.c7, (int) wmVar3.b(), wmVar3.g4, true, new org.telegram.messenger.hc(16)).show();
                                        break;
                                }
                            }
                        });
                        wmVar.O7(true);
                        break;
                    }
                }
                break;
            default:
                final wm wmVar2 = this.b;
                wmVar2.getClass();
                if (messagePeerReaction != null && messagePeerReaction.reaction != null && j10 != wmVar2.getUserConfig().e() && this.c) {
                    final ArrayList arrayList3 = new ArrayList(1);
                    arrayList3.add(this.d);
                    TLObject e23 = wmVar2.getMessagesController().e2(j10);
                    final ArrayList arrayList4 = new ArrayList(1);
                    arrayList4.add(e23);
                    final TLRPC.ChannelParticipant[] channelParticipantArr2 = new TLRPC.ChannelParticipant[1];
                    TLRPC.TL_channels_getParticipant tL_channels_getParticipant2 = new TLRPC.TL_channels_getParticipant();
                    tL_channels_getParticipant2.channel = org.telegram.messenger.hp.i1(wmVar2.e);
                    tL_channels_getParticipant2.participant = org.telegram.messenger.hp.k1(e23);
                    final int i10 = 1;
                    wmVar2.getConnectionsManager().sendRequestTyped(tL_channels_getParticipant2, new c3.b(1), new org.telegram.messenger.n10() { // from class: org.telegram.ui.ig
                        @Override // org.telegram.messenger.n10
                        public final void a(Object obj, Object obj2) {
                            TLRPC.TL_channels_channelParticipant tL_channels_channelParticipant = (TLRPC.TL_channels_channelParticipant) obj;
                            switch (i10) {
                                case 0:
                                    wm wmVar22 = wmVar2;
                                    TLRPC.ChannelParticipant[] channelParticipantArr22 = channelParticipantArr2;
                                    if (tL_channels_channelParticipant != null) {
                                        wmVar22.getMessagesController().Y3(tL_channels_channelParticipant.users, false);
                                        wmVar22.getMessagesController().S3(tL_channels_channelParticipant.chats, false);
                                        channelParticipantArr22[0] = tL_channels_channelParticipant.participant;
                                    } else {
                                        wmVar22.getClass();
                                    }
                                    new org.telegram.ui.Components.lr(wmVar22, wmVar22.e, arrayList3, arrayList4, channelParticipantArr22, wmVar22.c7, (int) wmVar22.b(), wmVar22.g4, true, new org.telegram.messenger.hc(16)).show();
                                    break;
                                default:
                                    wm wmVar3 = wmVar2;
                                    TLRPC.ChannelParticipant[] channelParticipantArr3 = channelParticipantArr2;
                                    if (tL_channels_channelParticipant != null) {
                                        wmVar3.getMessagesController().Y3(tL_channels_channelParticipant.users, false);
                                        wmVar3.getMessagesController().S3(tL_channels_channelParticipant.chats, false);
                                        channelParticipantArr3[0] = tL_channels_channelParticipant.participant;
                                    } else {
                                        wmVar3.getClass();
                                    }
                                    new org.telegram.ui.Components.lr(wmVar3, wmVar3.e, arrayList3, arrayList4, channelParticipantArr3, wmVar3.c7, (int) wmVar3.b(), wmVar3.g4, true, new org.telegram.messenger.hc(16)).show();
                                    break;
                            }
                        }
                    });
                    wmVar2.O7(true);
                    break;
                }
                break;
        }
    }
}
