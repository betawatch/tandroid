package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final /* synthetic */ class bg implements org.telegram.ui.Components.oj0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ co b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ MessageObject d;

    public /* synthetic */ bg(co coVar, boolean z10, MessageObject messageObject, int i10) {
        this.a = i10;
        this.b = coVar;
        this.c = z10;
        this.d = messageObject;
    }

    @Override // org.telegram.ui.Components.oj0
    public final void a(long j3, TLRPC.MessagePeerReaction messagePeerReaction) {
        switch (this.a) {
            case 0:
                if (messagePeerReaction != null && messagePeerReaction.reaction != null) {
                    final co coVar = this.b;
                    if (j3 != coVar.getUserConfig().getClientUserId() && this.c) {
                        final ArrayList arrayList = new ArrayList(1);
                        arrayList.add(this.d);
                        TLObject userOrChat = coVar.getMessagesController().getUserOrChat(j3);
                        final ArrayList arrayList2 = new ArrayList(1);
                        arrayList2.add(userOrChat);
                        final TLRPC.ChannelParticipant[] channelParticipantArr = new TLRPC.ChannelParticipant[1];
                        TLRPC.TL_channels_getParticipant tL_channels_getParticipant = new TLRPC.TL_channels_getParticipant();
                        tL_channels_getParticipant.channel = MessagesController.getInputChannel(coVar.e);
                        tL_channels_getParticipant.participant = MessagesController.getInputPeer(userOrChat);
                        final int i10 = 1;
                        coVar.getConnectionsManager().sendRequestTyped(tL_channels_getParticipant, new org.telegram.messenger.a(), new Utilities.Callback2() { // from class: org.telegram.ui.lh
                            @Override // org.telegram.messenger.Utilities.Callback2
                            public final void run(Object obj, Object obj2) {
                                TLRPC.TL_channels_channelParticipant tL_channels_channelParticipant = (TLRPC.TL_channels_channelParticipant) obj;
                                switch (i10) {
                                    case 0:
                                        co coVar2 = coVar;
                                        TLRPC.ChannelParticipant[] channelParticipantArr2 = channelParticipantArr;
                                        if (tL_channels_channelParticipant != null) {
                                            coVar2.getMessagesController().putUsers(tL_channels_channelParticipant.users, false);
                                            coVar2.getMessagesController().putChats(tL_channels_channelParticipant.chats, false);
                                            channelParticipantArr2[0] = tL_channels_channelParticipant.participant;
                                        } else {
                                            coVar2.getClass();
                                        }
                                        new org.telegram.ui.Components.es(coVar2, coVar2.e, arrayList, arrayList2, channelParticipantArr2, coVar2.L6, (int) coVar2.d(), coVar2.R3, true, new ah.j(18)).show();
                                        break;
                                    default:
                                        co coVar3 = coVar;
                                        TLRPC.ChannelParticipant[] channelParticipantArr3 = channelParticipantArr;
                                        if (tL_channels_channelParticipant != null) {
                                            coVar3.getMessagesController().putUsers(tL_channels_channelParticipant.users, false);
                                            coVar3.getMessagesController().putChats(tL_channels_channelParticipant.chats, false);
                                            channelParticipantArr3[0] = tL_channels_channelParticipant.participant;
                                        } else {
                                            coVar3.getClass();
                                        }
                                        new org.telegram.ui.Components.es(coVar3, coVar3.e, arrayList, arrayList2, channelParticipantArr3, coVar3.L6, (int) coVar3.d(), coVar3.R3, true, new ah.j(18)).show();
                                        break;
                                }
                            }
                        });
                        coVar.A7(true);
                        break;
                    }
                }
                break;
            default:
                final co coVar2 = this.b;
                coVar2.getClass();
                if (messagePeerReaction != null && messagePeerReaction.reaction != null && j3 != coVar2.getUserConfig().getClientUserId() && this.c) {
                    final ArrayList arrayList3 = new ArrayList(1);
                    arrayList3.add(this.d);
                    TLObject userOrChat2 = coVar2.getMessagesController().getUserOrChat(j3);
                    final ArrayList arrayList4 = new ArrayList(1);
                    arrayList4.add(userOrChat2);
                    final TLRPC.ChannelParticipant[] channelParticipantArr2 = new TLRPC.ChannelParticipant[1];
                    TLRPC.TL_channels_getParticipant tL_channels_getParticipant2 = new TLRPC.TL_channels_getParticipant();
                    tL_channels_getParticipant2.channel = MessagesController.getInputChannel(coVar2.e);
                    tL_channels_getParticipant2.participant = MessagesController.getInputPeer(userOrChat2);
                    final int i11 = 0;
                    coVar2.getConnectionsManager().sendRequestTyped(tL_channels_getParticipant2, new org.telegram.messenger.a(), new Utilities.Callback2() { // from class: org.telegram.ui.lh
                        @Override // org.telegram.messenger.Utilities.Callback2
                        public final void run(Object obj, Object obj2) {
                            TLRPC.TL_channels_channelParticipant tL_channels_channelParticipant = (TLRPC.TL_channels_channelParticipant) obj;
                            switch (i11) {
                                case 0:
                                    co coVar22 = coVar2;
                                    TLRPC.ChannelParticipant[] channelParticipantArr22 = channelParticipantArr2;
                                    if (tL_channels_channelParticipant != null) {
                                        coVar22.getMessagesController().putUsers(tL_channels_channelParticipant.users, false);
                                        coVar22.getMessagesController().putChats(tL_channels_channelParticipant.chats, false);
                                        channelParticipantArr22[0] = tL_channels_channelParticipant.participant;
                                    } else {
                                        coVar22.getClass();
                                    }
                                    new org.telegram.ui.Components.es(coVar22, coVar22.e, arrayList3, arrayList4, channelParticipantArr22, coVar22.L6, (int) coVar22.d(), coVar22.R3, true, new ah.j(18)).show();
                                    break;
                                default:
                                    co coVar3 = coVar2;
                                    TLRPC.ChannelParticipant[] channelParticipantArr3 = channelParticipantArr2;
                                    if (tL_channels_channelParticipant != null) {
                                        coVar3.getMessagesController().putUsers(tL_channels_channelParticipant.users, false);
                                        coVar3.getMessagesController().putChats(tL_channels_channelParticipant.chats, false);
                                        channelParticipantArr3[0] = tL_channels_channelParticipant.participant;
                                    } else {
                                        coVar3.getClass();
                                    }
                                    new org.telegram.ui.Components.es(coVar3, coVar3.e, arrayList3, arrayList4, channelParticipantArr3, coVar3.L6, (int) coVar3.d(), coVar3.R3, true, new ah.j(18)).show();
                                    break;
                            }
                        }
                    });
                    coVar2.A7(true);
                    break;
                }
                break;
        }
    }
}
