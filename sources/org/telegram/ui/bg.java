package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final /* synthetic */ class bg implements org.telegram.ui.Components.oj0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ bo b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ MessageObject d;

    public /* synthetic */ bg(bo boVar, boolean z10, MessageObject messageObject, int i10) {
        this.a = i10;
        this.b = boVar;
        this.c = z10;
        this.d = messageObject;
    }

    @Override // org.telegram.ui.Components.oj0
    public final void a(long j3, TLRPC.MessagePeerReaction messagePeerReaction) {
        switch (this.a) {
            case 0:
                if (messagePeerReaction != null && messagePeerReaction.reaction != null) {
                    final bo boVar = this.b;
                    if (j3 != boVar.getUserConfig().getClientUserId() && this.c) {
                        final ArrayList arrayList = new ArrayList(1);
                        arrayList.add(this.d);
                        TLObject userOrChat = boVar.getMessagesController().getUserOrChat(j3);
                        final ArrayList arrayList2 = new ArrayList(1);
                        arrayList2.add(userOrChat);
                        final TLRPC.ChannelParticipant[] channelParticipantArr = new TLRPC.ChannelParticipant[1];
                        TLRPC.TL_channels_getParticipant tL_channels_getParticipant = new TLRPC.TL_channels_getParticipant();
                        tL_channels_getParticipant.channel = MessagesController.getInputChannel(boVar.e);
                        tL_channels_getParticipant.participant = MessagesController.getInputPeer(userOrChat);
                        final int i10 = 1;
                        boVar.getConnectionsManager().sendRequestTyped(tL_channels_getParticipant, new org.telegram.messenger.a(), new Utilities.Callback2() { // from class: org.telegram.ui.kh
                            @Override // org.telegram.messenger.Utilities.Callback2
                            public final void run(Object obj, Object obj2) {
                                TLRPC.TL_channels_channelParticipant tL_channels_channelParticipant = (TLRPC.TL_channels_channelParticipant) obj;
                                switch (i10) {
                                    case 0:
                                        bo boVar2 = boVar;
                                        TLRPC.ChannelParticipant[] channelParticipantArr2 = channelParticipantArr;
                                        if (tL_channels_channelParticipant != null) {
                                            boVar2.getMessagesController().putUsers(tL_channels_channelParticipant.users, false);
                                            boVar2.getMessagesController().putChats(tL_channels_channelParticipant.chats, false);
                                            channelParticipantArr2[0] = tL_channels_channelParticipant.participant;
                                        } else {
                                            boVar2.getClass();
                                        }
                                        new org.telegram.ui.Components.fs(boVar2, boVar2.e, arrayList, arrayList2, channelParticipantArr2, boVar2.L6, (int) boVar2.d(), boVar2.R3, true, new ai.f(17)).show();
                                        break;
                                    default:
                                        bo boVar3 = boVar;
                                        TLRPC.ChannelParticipant[] channelParticipantArr3 = channelParticipantArr;
                                        if (tL_channels_channelParticipant != null) {
                                            boVar3.getMessagesController().putUsers(tL_channels_channelParticipant.users, false);
                                            boVar3.getMessagesController().putChats(tL_channels_channelParticipant.chats, false);
                                            channelParticipantArr3[0] = tL_channels_channelParticipant.participant;
                                        } else {
                                            boVar3.getClass();
                                        }
                                        new org.telegram.ui.Components.fs(boVar3, boVar3.e, arrayList, arrayList2, channelParticipantArr3, boVar3.L6, (int) boVar3.d(), boVar3.R3, true, new ai.f(17)).show();
                                        break;
                                }
                            }
                        });
                        boVar.A7(true);
                        break;
                    }
                }
                break;
            default:
                final bo boVar2 = this.b;
                boVar2.getClass();
                if (messagePeerReaction != null && messagePeerReaction.reaction != null && j3 != boVar2.getUserConfig().getClientUserId() && this.c) {
                    final ArrayList arrayList3 = new ArrayList(1);
                    arrayList3.add(this.d);
                    TLObject userOrChat2 = boVar2.getMessagesController().getUserOrChat(j3);
                    final ArrayList arrayList4 = new ArrayList(1);
                    arrayList4.add(userOrChat2);
                    final TLRPC.ChannelParticipant[] channelParticipantArr2 = new TLRPC.ChannelParticipant[1];
                    TLRPC.TL_channels_getParticipant tL_channels_getParticipant2 = new TLRPC.TL_channels_getParticipant();
                    tL_channels_getParticipant2.channel = MessagesController.getInputChannel(boVar2.e);
                    tL_channels_getParticipant2.participant = MessagesController.getInputPeer(userOrChat2);
                    final int i11 = 0;
                    boVar2.getConnectionsManager().sendRequestTyped(tL_channels_getParticipant2, new org.telegram.messenger.a(), new Utilities.Callback2() { // from class: org.telegram.ui.kh
                        @Override // org.telegram.messenger.Utilities.Callback2
                        public final void run(Object obj, Object obj2) {
                            TLRPC.TL_channels_channelParticipant tL_channels_channelParticipant = (TLRPC.TL_channels_channelParticipant) obj;
                            switch (i11) {
                                case 0:
                                    bo boVar22 = boVar2;
                                    TLRPC.ChannelParticipant[] channelParticipantArr22 = channelParticipantArr2;
                                    if (tL_channels_channelParticipant != null) {
                                        boVar22.getMessagesController().putUsers(tL_channels_channelParticipant.users, false);
                                        boVar22.getMessagesController().putChats(tL_channels_channelParticipant.chats, false);
                                        channelParticipantArr22[0] = tL_channels_channelParticipant.participant;
                                    } else {
                                        boVar22.getClass();
                                    }
                                    new org.telegram.ui.Components.fs(boVar22, boVar22.e, arrayList3, arrayList4, channelParticipantArr22, boVar22.L6, (int) boVar22.d(), boVar22.R3, true, new ai.f(17)).show();
                                    break;
                                default:
                                    bo boVar3 = boVar2;
                                    TLRPC.ChannelParticipant[] channelParticipantArr3 = channelParticipantArr2;
                                    if (tL_channels_channelParticipant != null) {
                                        boVar3.getMessagesController().putUsers(tL_channels_channelParticipant.users, false);
                                        boVar3.getMessagesController().putChats(tL_channels_channelParticipant.chats, false);
                                        channelParticipantArr3[0] = tL_channels_channelParticipant.participant;
                                    } else {
                                        boVar3.getClass();
                                    }
                                    new org.telegram.ui.Components.fs(boVar3, boVar3.e, arrayList3, arrayList4, channelParticipantArr3, boVar3.L6, (int) boVar3.d(), boVar3.R3, true, new ai.f(17)).show();
                                    break;
                            }
                        }
                    });
                    boVar2.A7(true);
                    break;
                }
                break;
        }
    }
}
