package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class hg implements org.telegram.ui.Components.pk0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ fo b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ MessageObject d;

    public /* synthetic */ hg(fo foVar, boolean z10, MessageObject messageObject, int i10) {
        this.a = i10;
        this.b = foVar;
        this.c = z10;
        this.d = messageObject;
    }

    @Override // org.telegram.ui.Components.pk0
    public final void e(long j10, TLRPC.MessagePeerReaction messagePeerReaction) {
        switch (this.a) {
            case 0:
                if (messagePeerReaction != null && messagePeerReaction.reaction != null) {
                    final fo foVar = this.b;
                    if (j10 != foVar.getUserConfig().getClientUserId() && this.c) {
                        final ArrayList arrayList = new ArrayList(1);
                        arrayList.add(this.d);
                        TLObject userOrChat = foVar.getMessagesController().getUserOrChat(j10);
                        final ArrayList arrayList2 = new ArrayList(1);
                        arrayList2.add(userOrChat);
                        final TLRPC.ChannelParticipant[] channelParticipantArr = new TLRPC.ChannelParticipant[1];
                        TLRPC.TL_channels_getParticipant tL_channels_getParticipant = new TLRPC.TL_channels_getParticipant();
                        tL_channels_getParticipant.channel = MessagesController.getInputChannel(foVar.e);
                        tL_channels_getParticipant.participant = MessagesController.getInputPeer(userOrChat);
                        final int i10 = 0;
                        foVar.getConnectionsManager().sendRequestTyped(tL_channels_getParticipant, new org.telegram.messenger.a(), new Utilities.Callback2() { // from class: org.telegram.ui.nh
                            @Override // org.telegram.messenger.Utilities.Callback2
                            public final void run(Object obj, Object obj2) {
                                TLRPC.TL_channels_channelParticipant tL_channels_channelParticipant = (TLRPC.TL_channels_channelParticipant) obj;
                                switch (i10) {
                                    case 0:
                                        fo foVar2 = foVar;
                                        TLRPC.ChannelParticipant[] channelParticipantArr2 = channelParticipantArr;
                                        if (tL_channels_channelParticipant != null) {
                                            foVar2.getMessagesController().putUsers(tL_channels_channelParticipant.users, false);
                                            foVar2.getMessagesController().putChats(tL_channels_channelParticipant.chats, false);
                                            channelParticipantArr2[0] = tL_channels_channelParticipant.participant;
                                        } else {
                                            foVar2.getClass();
                                        }
                                        new org.telegram.ui.Components.ss(foVar2, foVar2.e, arrayList, arrayList2, channelParticipantArr2, foVar2.L6, (int) foVar2.d(), foVar2.R3, true, new ah.j(18)).show();
                                        break;
                                    default:
                                        fo foVar3 = foVar;
                                        TLRPC.ChannelParticipant[] channelParticipantArr3 = channelParticipantArr;
                                        if (tL_channels_channelParticipant != null) {
                                            foVar3.getMessagesController().putUsers(tL_channels_channelParticipant.users, false);
                                            foVar3.getMessagesController().putChats(tL_channels_channelParticipant.chats, false);
                                            channelParticipantArr3[0] = tL_channels_channelParticipant.participant;
                                        } else {
                                            foVar3.getClass();
                                        }
                                        new org.telegram.ui.Components.ss(foVar3, foVar3.e, arrayList, arrayList2, channelParticipantArr3, foVar3.L6, (int) foVar3.d(), foVar3.R3, true, new ah.j(18)).show();
                                        break;
                                }
                            }
                        });
                        foVar.D7(true);
                        break;
                    }
                }
                break;
            default:
                final fo foVar2 = this.b;
                foVar2.getClass();
                if (messagePeerReaction != null && messagePeerReaction.reaction != null && j10 != foVar2.getUserConfig().getClientUserId() && this.c) {
                    final ArrayList arrayList3 = new ArrayList(1);
                    arrayList3.add(this.d);
                    TLObject userOrChat2 = foVar2.getMessagesController().getUserOrChat(j10);
                    final ArrayList arrayList4 = new ArrayList(1);
                    arrayList4.add(userOrChat2);
                    final TLRPC.ChannelParticipant[] channelParticipantArr2 = new TLRPC.ChannelParticipant[1];
                    TLRPC.TL_channels_getParticipant tL_channels_getParticipant2 = new TLRPC.TL_channels_getParticipant();
                    tL_channels_getParticipant2.channel = MessagesController.getInputChannel(foVar2.e);
                    tL_channels_getParticipant2.participant = MessagesController.getInputPeer(userOrChat2);
                    final int i11 = 1;
                    foVar2.getConnectionsManager().sendRequestTyped(tL_channels_getParticipant2, new org.telegram.messenger.a(), new Utilities.Callback2() { // from class: org.telegram.ui.nh
                        @Override // org.telegram.messenger.Utilities.Callback2
                        public final void run(Object obj, Object obj2) {
                            TLRPC.TL_channels_channelParticipant tL_channels_channelParticipant = (TLRPC.TL_channels_channelParticipant) obj;
                            switch (i11) {
                                case 0:
                                    fo foVar22 = foVar2;
                                    TLRPC.ChannelParticipant[] channelParticipantArr22 = channelParticipantArr2;
                                    if (tL_channels_channelParticipant != null) {
                                        foVar22.getMessagesController().putUsers(tL_channels_channelParticipant.users, false);
                                        foVar22.getMessagesController().putChats(tL_channels_channelParticipant.chats, false);
                                        channelParticipantArr22[0] = tL_channels_channelParticipant.participant;
                                    } else {
                                        foVar22.getClass();
                                    }
                                    new org.telegram.ui.Components.ss(foVar22, foVar22.e, arrayList3, arrayList4, channelParticipantArr22, foVar22.L6, (int) foVar22.d(), foVar22.R3, true, new ah.j(18)).show();
                                    break;
                                default:
                                    fo foVar3 = foVar2;
                                    TLRPC.ChannelParticipant[] channelParticipantArr3 = channelParticipantArr2;
                                    if (tL_channels_channelParticipant != null) {
                                        foVar3.getMessagesController().putUsers(tL_channels_channelParticipant.users, false);
                                        foVar3.getMessagesController().putChats(tL_channels_channelParticipant.chats, false);
                                        channelParticipantArr3[0] = tL_channels_channelParticipant.participant;
                                    } else {
                                        foVar3.getClass();
                                    }
                                    new org.telegram.ui.Components.ss(foVar3, foVar3.e, arrayList3, arrayList4, channelParticipantArr3, foVar3.L6, (int) foVar3.d(), foVar3.R3, true, new ah.j(18)).show();
                                    break;
                            }
                        }
                    });
                    foVar2.D7(true);
                    break;
                }
                break;
        }
    }
}
