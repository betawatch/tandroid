package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class cg implements org.telegram.ui.Components.yj0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ eo b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ MessageObject d;

    public /* synthetic */ cg(eo eoVar, boolean z10, MessageObject messageObject, int i10) {
        this.a = i10;
        this.b = eoVar;
        this.c = z10;
        this.d = messageObject;
    }

    @Override // org.telegram.ui.Components.yj0
    public final void a(long j3, TLRPC.MessagePeerReaction messagePeerReaction) {
        switch (this.a) {
            case 0:
                if (messagePeerReaction != null && messagePeerReaction.reaction != null) {
                    final eo eoVar = this.b;
                    if (j3 != eoVar.getUserConfig().getClientUserId() && this.c) {
                        final ArrayList arrayList = new ArrayList(1);
                        arrayList.add(this.d);
                        TLObject userOrChat = eoVar.getMessagesController().getUserOrChat(j3);
                        final ArrayList arrayList2 = new ArrayList(1);
                        arrayList2.add(userOrChat);
                        final TLRPC.ChannelParticipant[] channelParticipantArr = new TLRPC.ChannelParticipant[1];
                        TLRPC.TL_channels_getParticipant tL_channels_getParticipant = new TLRPC.TL_channels_getParticipant();
                        tL_channels_getParticipant.channel = MessagesController.getInputChannel(eoVar.e);
                        tL_channels_getParticipant.participant = MessagesController.getInputPeer(userOrChat);
                        final int i10 = 1;
                        eoVar.getConnectionsManager().sendRequestTyped(tL_channels_getParticipant, new org.telegram.messenger.a(), new Utilities.Callback2() { // from class: org.telegram.ui.lh
                            @Override // org.telegram.messenger.Utilities.Callback2
                            public final void run(Object obj, Object obj2) {
                                TLRPC.TL_channels_channelParticipant tL_channels_channelParticipant = (TLRPC.TL_channels_channelParticipant) obj;
                                switch (i10) {
                                    case 0:
                                        eo eoVar2 = eoVar;
                                        TLRPC.ChannelParticipant[] channelParticipantArr2 = channelParticipantArr;
                                        if (tL_channels_channelParticipant != null) {
                                            eoVar2.getMessagesController().putUsers(tL_channels_channelParticipant.users, false);
                                            eoVar2.getMessagesController().putChats(tL_channels_channelParticipant.chats, false);
                                            channelParticipantArr2[0] = tL_channels_channelParticipant.participant;
                                        } else {
                                            eoVar2.getClass();
                                        }
                                        new org.telegram.ui.Components.ls(eoVar2, eoVar2.e, arrayList, arrayList2, channelParticipantArr2, eoVar2.L6, (int) eoVar2.d(), eoVar2.R3, true, new bi.f0(12)).show();
                                        break;
                                    default:
                                        eo eoVar3 = eoVar;
                                        TLRPC.ChannelParticipant[] channelParticipantArr3 = channelParticipantArr;
                                        if (tL_channels_channelParticipant != null) {
                                            eoVar3.getMessagesController().putUsers(tL_channels_channelParticipant.users, false);
                                            eoVar3.getMessagesController().putChats(tL_channels_channelParticipant.chats, false);
                                            channelParticipantArr3[0] = tL_channels_channelParticipant.participant;
                                        } else {
                                            eoVar3.getClass();
                                        }
                                        new org.telegram.ui.Components.ls(eoVar3, eoVar3.e, arrayList, arrayList2, channelParticipantArr3, eoVar3.L6, (int) eoVar3.d(), eoVar3.R3, true, new bi.f0(12)).show();
                                        break;
                                }
                            }
                        });
                        eoVar.A7(true);
                        break;
                    }
                }
                break;
            default:
                final eo eoVar2 = this.b;
                eoVar2.getClass();
                if (messagePeerReaction != null && messagePeerReaction.reaction != null && j3 != eoVar2.getUserConfig().getClientUserId() && this.c) {
                    final ArrayList arrayList3 = new ArrayList(1);
                    arrayList3.add(this.d);
                    TLObject userOrChat2 = eoVar2.getMessagesController().getUserOrChat(j3);
                    final ArrayList arrayList4 = new ArrayList(1);
                    arrayList4.add(userOrChat2);
                    final TLRPC.ChannelParticipant[] channelParticipantArr2 = new TLRPC.ChannelParticipant[1];
                    TLRPC.TL_channels_getParticipant tL_channels_getParticipant2 = new TLRPC.TL_channels_getParticipant();
                    tL_channels_getParticipant2.channel = MessagesController.getInputChannel(eoVar2.e);
                    tL_channels_getParticipant2.participant = MessagesController.getInputPeer(userOrChat2);
                    final int i11 = 0;
                    eoVar2.getConnectionsManager().sendRequestTyped(tL_channels_getParticipant2, new org.telegram.messenger.a(), new Utilities.Callback2() { // from class: org.telegram.ui.lh
                        @Override // org.telegram.messenger.Utilities.Callback2
                        public final void run(Object obj, Object obj2) {
                            TLRPC.TL_channels_channelParticipant tL_channels_channelParticipant = (TLRPC.TL_channels_channelParticipant) obj;
                            switch (i11) {
                                case 0:
                                    eo eoVar22 = eoVar2;
                                    TLRPC.ChannelParticipant[] channelParticipantArr22 = channelParticipantArr2;
                                    if (tL_channels_channelParticipant != null) {
                                        eoVar22.getMessagesController().putUsers(tL_channels_channelParticipant.users, false);
                                        eoVar22.getMessagesController().putChats(tL_channels_channelParticipant.chats, false);
                                        channelParticipantArr22[0] = tL_channels_channelParticipant.participant;
                                    } else {
                                        eoVar22.getClass();
                                    }
                                    new org.telegram.ui.Components.ls(eoVar22, eoVar22.e, arrayList3, arrayList4, channelParticipantArr22, eoVar22.L6, (int) eoVar22.d(), eoVar22.R3, true, new bi.f0(12)).show();
                                    break;
                                default:
                                    eo eoVar3 = eoVar2;
                                    TLRPC.ChannelParticipant[] channelParticipantArr3 = channelParticipantArr2;
                                    if (tL_channels_channelParticipant != null) {
                                        eoVar3.getMessagesController().putUsers(tL_channels_channelParticipant.users, false);
                                        eoVar3.getMessagesController().putChats(tL_channels_channelParticipant.chats, false);
                                        channelParticipantArr3[0] = tL_channels_channelParticipant.participant;
                                    } else {
                                        eoVar3.getClass();
                                    }
                                    new org.telegram.ui.Components.ls(eoVar3, eoVar3.e, arrayList3, arrayList4, channelParticipantArr3, eoVar3.L6, (int) eoVar3.d(), eoVar3.R3, true, new bi.f0(12)).show();
                                    break;
                            }
                        }
                    });
                    eoVar2.A7(true);
                    break;
                }
                break;
        }
    }
}
