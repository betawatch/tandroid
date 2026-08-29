package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class of implements org.telegram.ui.Components.oj0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ tn b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ MessageObject d;

    public /* synthetic */ of(tn tnVar, boolean z10, MessageObject messageObject, int i10) {
        this.a = i10;
        this.b = tnVar;
        this.c = z10;
        this.d = messageObject;
    }

    @Override // org.telegram.ui.Components.oj0
    public final void a(long j10, TLRPC.MessagePeerReaction messagePeerReaction) {
        switch (this.a) {
            case 0:
                if (messagePeerReaction != null && messagePeerReaction.reaction != null) {
                    final tn tnVar = this.b;
                    if (j10 != tnVar.getUserConfig().getClientUserId() && this.c) {
                        final ArrayList arrayList = new ArrayList(1);
                        arrayList.add(this.d);
                        TLObject userOrChat = tnVar.getMessagesController().getUserOrChat(j10);
                        final ArrayList arrayList2 = new ArrayList(1);
                        arrayList2.add(userOrChat);
                        final TLRPC.ChannelParticipant[] channelParticipantArr = new TLRPC.ChannelParticipant[1];
                        TLRPC.TL_channels_getParticipant tL_channels_getParticipant = new TLRPC.TL_channels_getParticipant();
                        tL_channels_getParticipant.channel = MessagesController.getInputChannel(tnVar.e);
                        tL_channels_getParticipant.participant = MessagesController.getInputPeer(userOrChat);
                        final int i10 = 1;
                        tnVar.getConnectionsManager().sendRequestTyped(tL_channels_getParticipant, new org.telegram.messenger.a(), new Utilities.Callback2() { // from class: org.telegram.ui.yg
                            @Override // org.telegram.messenger.Utilities.Callback2
                            public final void run(Object obj, Object obj2) {
                                TLRPC.TL_channels_channelParticipant tL_channels_channelParticipant = (TLRPC.TL_channels_channelParticipant) obj;
                                switch (i10) {
                                    case 0:
                                        tn tnVar2 = tnVar;
                                        TLRPC.ChannelParticipant[] channelParticipantArr2 = channelParticipantArr;
                                        if (tL_channels_channelParticipant != null) {
                                            tnVar2.getMessagesController().putUsers(tL_channels_channelParticipant.users, false);
                                            tnVar2.getMessagesController().putChats(tL_channels_channelParticipant.chats, false);
                                            channelParticipantArr2[0] = tL_channels_channelParticipant.participant;
                                        } else {
                                            tnVar2.getClass();
                                        }
                                        new org.telegram.ui.Components.as(tnVar2, tnVar2.e, arrayList, arrayList2, channelParticipantArr2, tnVar2.H6, (int) tnVar2.b(), tnVar2.N3, true, new ag.o0(24)).show();
                                        break;
                                    default:
                                        tn tnVar3 = tnVar;
                                        TLRPC.ChannelParticipant[] channelParticipantArr3 = channelParticipantArr;
                                        if (tL_channels_channelParticipant != null) {
                                            tnVar3.getMessagesController().putUsers(tL_channels_channelParticipant.users, false);
                                            tnVar3.getMessagesController().putChats(tL_channels_channelParticipant.chats, false);
                                            channelParticipantArr3[0] = tL_channels_channelParticipant.participant;
                                        } else {
                                            tnVar3.getClass();
                                        }
                                        new org.telegram.ui.Components.as(tnVar3, tnVar3.e, arrayList, arrayList2, channelParticipantArr3, tnVar3.H6, (int) tnVar3.b(), tnVar3.N3, true, new ag.o0(24)).show();
                                        break;
                                }
                            }
                        });
                        tnVar.A7(true);
                        break;
                    }
                }
                break;
            default:
                final tn tnVar2 = this.b;
                tnVar2.getClass();
                if (messagePeerReaction != null && messagePeerReaction.reaction != null && j10 != tnVar2.getUserConfig().getClientUserId() && this.c) {
                    final ArrayList arrayList3 = new ArrayList(1);
                    arrayList3.add(this.d);
                    TLObject userOrChat2 = tnVar2.getMessagesController().getUserOrChat(j10);
                    final ArrayList arrayList4 = new ArrayList(1);
                    arrayList4.add(userOrChat2);
                    final TLRPC.ChannelParticipant[] channelParticipantArr2 = new TLRPC.ChannelParticipant[1];
                    TLRPC.TL_channels_getParticipant tL_channels_getParticipant2 = new TLRPC.TL_channels_getParticipant();
                    tL_channels_getParticipant2.channel = MessagesController.getInputChannel(tnVar2.e);
                    tL_channels_getParticipant2.participant = MessagesController.getInputPeer(userOrChat2);
                    final int i11 = 0;
                    tnVar2.getConnectionsManager().sendRequestTyped(tL_channels_getParticipant2, new org.telegram.messenger.a(), new Utilities.Callback2() { // from class: org.telegram.ui.yg
                        @Override // org.telegram.messenger.Utilities.Callback2
                        public final void run(Object obj, Object obj2) {
                            TLRPC.TL_channels_channelParticipant tL_channels_channelParticipant = (TLRPC.TL_channels_channelParticipant) obj;
                            switch (i11) {
                                case 0:
                                    tn tnVar22 = tnVar2;
                                    TLRPC.ChannelParticipant[] channelParticipantArr22 = channelParticipantArr2;
                                    if (tL_channels_channelParticipant != null) {
                                        tnVar22.getMessagesController().putUsers(tL_channels_channelParticipant.users, false);
                                        tnVar22.getMessagesController().putChats(tL_channels_channelParticipant.chats, false);
                                        channelParticipantArr22[0] = tL_channels_channelParticipant.participant;
                                    } else {
                                        tnVar22.getClass();
                                    }
                                    new org.telegram.ui.Components.as(tnVar22, tnVar22.e, arrayList3, arrayList4, channelParticipantArr22, tnVar22.H6, (int) tnVar22.b(), tnVar22.N3, true, new ag.o0(24)).show();
                                    break;
                                default:
                                    tn tnVar3 = tnVar2;
                                    TLRPC.ChannelParticipant[] channelParticipantArr3 = channelParticipantArr2;
                                    if (tL_channels_channelParticipant != null) {
                                        tnVar3.getMessagesController().putUsers(tL_channels_channelParticipant.users, false);
                                        tnVar3.getMessagesController().putChats(tL_channels_channelParticipant.chats, false);
                                        channelParticipantArr3[0] = tL_channels_channelParticipant.participant;
                                    } else {
                                        tnVar3.getClass();
                                    }
                                    new org.telegram.ui.Components.as(tnVar3, tnVar3.e, arrayList3, arrayList4, channelParticipantArr3, tnVar3.H6, (int) tnVar3.b(), tnVar3.N3, true, new ag.o0(24)).show();
                                    break;
                            }
                        }
                    });
                    tnVar2.A7(true);
                    break;
                }
                break;
        }
    }
}
