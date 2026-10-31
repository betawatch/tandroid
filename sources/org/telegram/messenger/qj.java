package org.telegram.messenger;

import android.util.SparseArray;
import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class qj implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ f1 c;
    public final /* synthetic */ Object d;

    public /* synthetic */ qj(f1 f1Var, long j10, Object obj, int i10) {
        this.a = i10;
        this.c = f1Var;
        this.b = j10;
        this.d = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        Integer num;
        Integer num2;
        Integer num3;
        switch (this.a) {
            case 0:
                vp vpVar = (vp) this.c;
                long j10 = this.b;
                rp rpVar = (rp) this.d;
                vpVar.getClass();
                Integer num4 = null;
                if (tLObject instanceof TLRPC.messages_SponsoredMessages) {
                    TLRPC.messages_SponsoredMessages messages_sponsoredmessages = (TLRPC.messages_SponsoredMessages) tLObject;
                    if (messages_sponsoredmessages.messages.isEmpty()) {
                        num3 = null;
                    } else {
                        if ((messages_sponsoredmessages instanceof TLRPC.TL_messages_sponsoredMessages) && (messages_sponsoredmessages.flags & 1) > 0) {
                            num4 = Integer.valueOf(messages_sponsoredmessages.posts_between);
                        }
                        ArrayList arrayList = new ArrayList();
                        i0.g3(new oi(16, vpVar, messages_sponsoredmessages));
                        a0.h hVar = new a0.h();
                        a0.h hVar2 = new a0.h();
                        int i10 = 0;
                        for (int i11 = 0; i11 < messages_sponsoredmessages.users.size(); i11++) {
                            TLRPC.User user = messages_sponsoredmessages.users.get(i11);
                            hVar.k(user, user.id);
                        }
                        for (int i12 = 0; i12 < messages_sponsoredmessages.chats.size(); i12++) {
                            TLRPC.Chat chat = messages_sponsoredmessages.chats.get(i12);
                            hVar2.k(chat, chat.id);
                        }
                        int size = messages_sponsoredmessages.messages.size();
                        int i13 = -10000000;
                        while (i10 < size) {
                            TLRPC.TL_sponsoredMessage tL_sponsoredMessage = messages_sponsoredmessages.messages.get(i10);
                            TLRPC.TL_message tL_message = new TLRPC.TL_message();
                            if (!tL_sponsoredMessage.entities.isEmpty()) {
                                tL_message.entities = tL_sponsoredMessage.entities;
                                tL_message.flags |= 128;
                            }
                            tL_message.peer_id = vpVar.y1(j10);
                            tL_message.flags |= 256;
                            tL_message.date = vpVar.getConnectionsManager().getCurrentTime();
                            int i14 = i13 - 1;
                            tL_message.id = i13;
                            tL_message.message = tL_sponsoredMessage.message;
                            TLRPC.MessageMedia messageMedia = tL_sponsoredMessage.media;
                            if (messageMedia != null) {
                                tL_message.flags |= 512;
                            }
                            tL_message.media = messageMedia;
                            jj jjVar = new jj(vpVar.currentAccount, (TLRPC.Message) tL_message, hVar, hVar2, true, true);
                            jjVar.P0 = tL_sponsoredMessage.random_id;
                            jjVar.Q0 = tL_sponsoredMessage.title;
                            jjVar.R0 = tL_sponsoredMessage.url;
                            jjVar.S0 = tL_sponsoredMessage.recommended;
                            jjVar.T0 = tL_sponsoredMessage.photo;
                            jjVar.U0 = tL_sponsoredMessage.sponsor_info;
                            jjVar.V0 = tL_sponsoredMessage.additional_info;
                            jjVar.W0 = tL_sponsoredMessage.button_text;
                            jjVar.Z0 = tL_sponsoredMessage.can_report;
                            jjVar.X0 = tL_sponsoredMessage.color;
                            jjVar.Y0 = tL_sponsoredMessage.media;
                            jjVar.K5();
                            jjVar.z2 = new ArrayList();
                            jjVar.r0(true);
                            arrayList.add(jjVar);
                            i10++;
                            i13 = i14;
                        }
                        num3 = num4;
                        num4 = arrayList;
                    }
                    num2 = num3;
                    num = num4;
                } else {
                    num = null;
                    num2 = null;
                }
                i0.g3(new ym(vpVar, num, j10, rpVar, num2, 1));
                break;
            case 1:
                ui uiVar = (ui) this.c;
                long j11 = this.b;
                TLRPC.TL_messages_getMessages tL_messages_getMessages = (TLRPC.TL_messages_getMessages) this.d;
                if (tL_error == null) {
                    TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                    ui.K1(messages_messages.messages);
                    if (!messages_messages.messages.isEmpty()) {
                        hc.X(messages_messages.messages);
                        uiVar.k(messages_messages.messages, messages_messages.users, messages_messages.chats, false, false);
                        uiVar.getMessagesStorage().m1(messages_messages.users, messages_messages.chats, true, true);
                        ArrayList<TLRPC.Message> arrayList2 = messages_messages.messages;
                        if (!arrayList2.isEmpty()) {
                            uiVar.getMessagesStorage().a.c(new d4(uiVar, arrayList2, j11, 14));
                            break;
                        }
                    }
                }
                uiVar.getMessagesStorage().c2(j11, tL_messages_getMessages.id, false, -1, 0, false, null);
                break;
            case 2:
                vp vpVar2 = (vp) this.c;
                long j12 = this.b;
                TLRPC.Chat chat2 = (TLRPC.Chat) this.d;
                if (tLObject != null) {
                    TLRPC.TL_messages_peerDialogs tL_messages_peerDialogs = (TLRPC.TL_messages_peerDialogs) tLObject;
                    if (!tL_messages_peerDialogs.dialogs.isEmpty() && !tL_messages_peerDialogs.chats.isEmpty()) {
                        TLRPC.TL_dialog tL_dialog = (TLRPC.TL_dialog) tL_messages_peerDialogs.dialogs.get(0);
                        TLRPC.TL_messages_dialogs tL_messages_dialogs = new TLRPC.TL_messages_dialogs();
                        tL_messages_dialogs.dialogs.addAll(tL_messages_peerDialogs.dialogs);
                        tL_messages_dialogs.messages.addAll(tL_messages_peerDialogs.messages);
                        tL_messages_dialogs.users.addAll(tL_messages_peerDialogs.users);
                        tL_messages_dialogs.chats.addAll(tL_messages_peerDialogs.chats);
                        vpVar2.G3(tL_messages_dialogs, null, null, tL_dialog.folder_id, 0, 1, vpVar2.P7, false, false, false);
                    }
                }
                if (j12 != 0) {
                    vpVar2.getMessagesStorage().q1(j12);
                }
                vpVar2.b1.e(chat2.id);
                break;
            case 3:
                vp vpVar3 = (vp) this.c;
                long j13 = this.b;
                TLRPC.TL_messages_getMessagesViews tL_messages_getMessagesViews = (TLRPC.TL_messages_getMessagesViews) this.d;
                if (tLObject != null) {
                    TLRPC.TL_messages_messageViews tL_messages_messageViews = (TLRPC.TL_messages_messageViews) tLObject;
                    a0.h hVar3 = new a0.h();
                    a0.h hVar4 = new a0.h();
                    a0.h hVar5 = new a0.h();
                    SparseIntArray sparseIntArray = (SparseIntArray) hVar3.f(j13);
                    SparseIntArray sparseIntArray2 = (SparseIntArray) hVar4.f(j13);
                    SparseArray sparseArray = (SparseArray) hVar5.f(j13);
                    for (int i15 = 0; i15 < tL_messages_getMessagesViews.id.size() && i15 < tL_messages_messageViews.views.size(); i15++) {
                        TLRPC.TL_messageViews tL_messageViews = tL_messages_messageViews.views.get(i15);
                        if ((tL_messageViews.flags & 1) != 0) {
                            if (sparseIntArray == null) {
                                sparseIntArray = new SparseIntArray();
                                hVar3.k(sparseIntArray, j13);
                            }
                            sparseIntArray.put(tL_messages_getMessagesViews.id.get(i15).intValue(), tL_messageViews.views);
                        }
                        if ((tL_messageViews.flags & 2) != 0) {
                            if (sparseIntArray2 == null) {
                                sparseIntArray2 = new SparseIntArray();
                                hVar4.k(sparseIntArray2, j13);
                            }
                            sparseIntArray2.put(tL_messages_getMessagesViews.id.get(i15).intValue(), tL_messageViews.forwards);
                        }
                        if ((tL_messageViews.flags & 4) != 0) {
                            if (sparseArray == null) {
                                sparseArray = new SparseArray();
                                hVar5.k(sparseArray, j13);
                            }
                            sparseArray.put(tL_messages_getMessagesViews.id.get(i15).intValue(), tL_messageViews.replies);
                        }
                    }
                    vpVar3.getMessagesStorage().m1(tL_messages_messageViews.users, tL_messages_messageViews.chats, true, true);
                    vpVar3.getMessagesStorage().a1(hVar3, hVar4, hVar5, false);
                    i0.g3(new cn(vpVar3, tL_messages_messageViews, hVar3, hVar4, hVar5, 9));
                    break;
                }
                break;
            case 4:
                vp vpVar4 = (vp) this.c;
                long j14 = this.b;
                TLRPC.TL_messages_setChatAvailableReactions tL_messages_setChatAvailableReactions = (TLRPC.TL_messages_setChatAvailableReactions) this.d;
                if (tLObject != null) {
                    vpVar4.L3((TLRPC.Updates) tLObject, false);
                    TLRPC.ChatFull M0 = vpVar4.M0(j14);
                    if (M0 != null) {
                        if (M0 instanceof TLRPC.TL_chatFull) {
                            M0.flags |= 262144;
                        }
                        if (M0 instanceof TLRPC.TL_channelFull) {
                            M0.flags |= TLObject.FLAG_30;
                        }
                        M0.available_reactions = tL_messages_setChatAvailableReactions.available_reactions;
                        vpVar4.getMessagesStorage().N1(M0, false);
                    }
                    i0.g3(new wk(vpVar4, j14, 17));
                    break;
                }
                break;
            case 5:
                i0.g3(new wm((vp) this.c, tLObject, this.b, (Runnable) this.d, 5));
                break;
            case 6:
                vp vpVar5 = (vp) this.c;
                TLRPC.TL_channels_inviteToChannel tL_channels_inviteToChannel = (TLRPC.TL_channels_inviteToChannel) this.d;
                long j15 = this.b;
                if (tL_error != null) {
                    i0.g3(new mg(vpVar5, tL_error, tL_channels_inviteToChannel, 1));
                    break;
                } else if (tLObject instanceof TLRPC.TL_messages_invitedUsers) {
                    TLRPC.TL_messages_invitedUsers tL_messages_invitedUsers = (TLRPC.TL_messages_invitedUsers) tLObject;
                    vpVar5.L3(tL_messages_invitedUsers.updates, false);
                    i0.g3(new d4(vpVar5, tL_messages_invitedUsers, j15, 4));
                    break;
                }
                break;
            case 7:
                vp vpVar6 = (vp) this.c;
                ph.h1 h1Var = (ph.h1) this.d;
                long j16 = this.b;
                if (tLObject instanceof TLRPC.TL_exportedContactToken) {
                    vpVar6.Y7 = (TLRPC.TL_exportedContactToken) tLObject;
                    i0.h3(new oi(22, vpVar6, h1Var), Math.max(0L, 0 - (System.currentTimeMillis() - j16)));
                    break;
                } else {
                    vpVar6.X7 = false;
                    break;
                }
            case 8:
                vp vpVar7 = (vp) this.c;
                TLRPC.InputPeer inputPeer = (TLRPC.InputPeer) this.d;
                long j17 = this.b;
                TLRPC.messages_Messages messages_messages2 = (TLRPC.messages_Messages) tLObject;
                if (messages_messages2 != null) {
                    int i16 = messages_messages2.count;
                    if (i16 == 0) {
                        i16 = messages_messages2.messages.size();
                    }
                    int i17 = i16;
                    hs messagesStorage = vpVar7.getMessagesStorage();
                    messagesStorage.a.c(new ir(messagesStorage, 0L, -inputPeer.channel_id, i17, 7));
                }
                if (j17 != 0) {
                    vpVar7.getMessagesStorage().q1(j17);
                    break;
                }
                break;
            case 9:
                vp vpVar8 = (vp) this.c;
                TLRPC.Dialog dialog = (TLRPC.Dialog) this.d;
                long j18 = this.b;
                if (tLObject != null) {
                    TLRPC.messages_Messages messages_messages3 = (TLRPC.messages_Messages) tLObject;
                    vpVar8.b4(messages_messages3.messages, dialog.id);
                    if (messages_messages3.messages.isEmpty()) {
                        i0.g3(new wn(vpVar8, dialog, 0));
                    } else {
                        if (v2.a) {
                            f8.b("checkLastDialogMessage for " + dialog.id + " has message");
                        }
                        TLRPC.TL_messages_dialogs tL_messages_dialogs2 = new TLRPC.TL_messages_dialogs();
                        TLRPC.Message message = messages_messages3.messages.get(0);
                        TLRPC.TL_dialog tL_dialog2 = new TLRPC.TL_dialog();
                        tL_dialog2.flags = dialog.flags;
                        tL_dialog2.top_message = message.id;
                        tL_dialog2.last_message_date = message.date;
                        tL_dialog2.notify_settings = dialog.notify_settings;
                        tL_dialog2.pts = dialog.pts;
                        tL_dialog2.unread_count = dialog.unread_count;
                        tL_dialog2.unread_mark = dialog.unread_mark;
                        tL_dialog2.unread_mentions_count = dialog.unread_mentions_count;
                        tL_dialog2.unread_reactions_count = dialog.unread_reactions_count;
                        tL_dialog2.unread_poll_votes_count = dialog.unread_poll_votes_count;
                        tL_dialog2.read_inbox_max_id = dialog.read_inbox_max_id;
                        tL_dialog2.read_outbox_max_id = dialog.read_outbox_max_id;
                        tL_dialog2.pinned = dialog.pinned;
                        tL_dialog2.pinnedNum = dialog.pinnedNum;
                        tL_dialog2.folder_id = dialog.folder_id;
                        long j19 = dialog.id;
                        tL_dialog2.id = j19;
                        message.dialog_id = j19;
                        tL_messages_dialogs2.users.addAll(messages_messages3.users);
                        tL_messages_dialogs2.chats.addAll(messages_messages3.chats);
                        tL_messages_dialogs2.dialogs.add(tL_dialog2);
                        tL_messages_dialogs2.messages.addAll(messages_messages3.messages);
                        tL_messages_dialogs2.count = 1;
                        Utilities.d.c(new wf((Object) vpVar8, (Object) tL_messages_dialogs2, false, 1));
                        vpVar8.getMessagesStorage().j1(messages_messages3.messages, true, true, false, vpVar8.getDownloadController().l(), true, 0, 0L);
                    }
                }
                if (j18 != 0) {
                    vpVar8.getMessagesStorage().q1(j18);
                }
                i0.g3(new wn(vpVar8, dialog, 1));
                break;
            case 10:
                i0.g3(new ym((t10) this.c, (n10) this.d, tLObject, tL_error, this.b, 6));
                break;
            default:
                i0.g3(new ym((t10) this.c, (o10) this.d, tLObject, tL_error, this.b, 5));
                break;
        }
    }

    public /* synthetic */ qj(f1 f1Var, Object obj, long j10, int i10) {
        this.a = i10;
        this.c = f1Var;
        this.d = obj;
        this.b = j10;
    }
}
