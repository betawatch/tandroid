package org.telegram.messenger;

import android.util.SparseArray;
import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final /* synthetic */ class mj implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ c1 c;
    public final /* synthetic */ Object d;

    public /* synthetic */ mj(c1 c1Var, long j3, Object obj, int i7) {
        this.a = i7;
        this.c = c1Var;
        this.b = j3;
        this.d = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        Integer num;
        Integer num2;
        switch (this.a) {
            case 0:
                np npVar = (np) this.c;
                long j3 = this.b;
                jp jpVar = (jp) this.d;
                npVar.getClass();
                Integer num3 = null;
                if (tLObject instanceof TLRPC.messages_SponsoredMessages) {
                    TLRPC.messages_SponsoredMessages messages_sponsoredmessages = (TLRPC.messages_SponsoredMessages) tLObject;
                    if (messages_sponsoredmessages.messages.isEmpty()) {
                        num2 = null;
                    } else {
                        if ((messages_sponsoredmessages instanceof TLRPC.TL_messages_sponsoredMessages) && (messages_sponsoredmessages.flags & 1) > 0) {
                            num3 = Integer.valueOf(messages_sponsoredmessages.posts_between);
                        }
                        ArrayList arrayList = new ArrayList();
                        g0.h3(new fi(11, npVar, messages_sponsoredmessages));
                        a0.h hVar = new a0.h();
                        a0.h hVar2 = new a0.h();
                        int i7 = 0;
                        for (int i10 = 0; i10 < messages_sponsoredmessages.users.size(); i10++) {
                            TLRPC.User user = messages_sponsoredmessages.users.get(i10);
                            hVar.k(user, user.id);
                        }
                        for (int i11 = 0; i11 < messages_sponsoredmessages.chats.size(); i11++) {
                            TLRPC.Chat chat = messages_sponsoredmessages.chats.get(i11);
                            hVar2.k(chat, chat.id);
                        }
                        int size = messages_sponsoredmessages.messages.size();
                        int i12 = -10000000;
                        while (i7 < size) {
                            TLRPC.TL_sponsoredMessage tL_sponsoredMessage = messages_sponsoredmessages.messages.get(i7);
                            TLRPC.TL_message tL_message = new TLRPC.TL_message();
                            if (!tL_sponsoredMessage.entities.isEmpty()) {
                                tL_message.entities = tL_sponsoredMessage.entities;
                                tL_message.flags |= 128;
                            }
                            tL_message.peer_id = npVar.z1(j3);
                            tL_message.flags |= 256;
                            tL_message.date = npVar.getConnectionsManager().getCurrentTime();
                            int i13 = i12 - 1;
                            tL_message.id = i12;
                            tL_message.message = tL_sponsoredMessage.message;
                            TLRPC.MessageMedia messageMedia = tL_sponsoredMessage.media;
                            if (messageMedia != null) {
                                tL_message.flags |= 512;
                            }
                            tL_message.media = messageMedia;
                            gj gjVar = new gj(npVar.currentAccount, (TLRPC.Message) tL_message, hVar, hVar2, true, true);
                            gjVar.R0 = tL_sponsoredMessage.random_id;
                            gjVar.S0 = tL_sponsoredMessage.title;
                            gjVar.T0 = tL_sponsoredMessage.url;
                            gjVar.U0 = tL_sponsoredMessage.recommended;
                            gjVar.V0 = tL_sponsoredMessage.photo;
                            gjVar.W0 = tL_sponsoredMessage.sponsor_info;
                            gjVar.X0 = tL_sponsoredMessage.additional_info;
                            gjVar.Y0 = tL_sponsoredMessage.button_text;
                            gjVar.b1 = tL_sponsoredMessage.can_report;
                            gjVar.Z0 = tL_sponsoredMessage.color;
                            gjVar.a1 = tL_sponsoredMessage.media;
                            gjVar.L5();
                            gjVar.B2 = new ArrayList();
                            gjVar.r0(true);
                            arrayList.add(gjVar);
                            i7++;
                            i12 = i13;
                        }
                        num2 = num3;
                        num3 = arrayList;
                    }
                    num = num2;
                } else {
                    num = null;
                }
                g0.h3(new im(npVar, num3, j3, jpVar, num, 1));
                break;
            case 1:
                si siVar = (si) this.c;
                long j10 = this.b;
                TLRPC.TL_messages_getMessages tL_messages_getMessages = (TLRPC.TL_messages_getMessages) this.d;
                if (tL_error == null) {
                    TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                    si.K1(messages_messages.messages);
                    if (!messages_messages.messages.isEmpty()) {
                        fc.X(messages_messages.messages);
                        siVar.k(messages_messages.messages, messages_messages.users, messages_messages.chats, false, false);
                        siVar.getMessagesStorage().m1(messages_messages.users, messages_messages.chats, true, true);
                        ArrayList<TLRPC.Message> arrayList2 = messages_messages.messages;
                        if (!arrayList2.isEmpty()) {
                            siVar.getMessagesStorage().a.c(new a4(siVar, arrayList2, j10, 14));
                            break;
                        }
                    }
                }
                siVar.getMessagesStorage().c2(j10, tL_messages_getMessages.id, false, -1, 0, false, null);
                break;
            case 2:
                np npVar2 = (np) this.c;
                long j11 = this.b;
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
                        npVar2.J3(tL_messages_dialogs, null, null, tL_dialog.folder_id, 0, 1, npVar2.P7, false, false, false);
                    }
                }
                if (j11 != 0) {
                    npVar2.getMessagesStorage().q1(j11);
                }
                npVar2.c1.e(chat2.id);
                break;
            case 3:
                np npVar3 = (np) this.c;
                long j12 = this.b;
                TLRPC.TL_messages_getMessagesViews tL_messages_getMessagesViews = (TLRPC.TL_messages_getMessagesViews) this.d;
                if (tLObject != null) {
                    TLRPC.TL_messages_messageViews tL_messages_messageViews = (TLRPC.TL_messages_messageViews) tLObject;
                    a0.h hVar3 = new a0.h();
                    a0.h hVar4 = new a0.h();
                    a0.h hVar5 = new a0.h();
                    SparseIntArray sparseIntArray = (SparseIntArray) hVar3.f(j12);
                    SparseIntArray sparseIntArray2 = (SparseIntArray) hVar4.f(j12);
                    SparseArray sparseArray = (SparseArray) hVar5.f(j12);
                    for (int i14 = 0; i14 < tL_messages_getMessagesViews.id.size() && i14 < tL_messages_messageViews.views.size(); i14++) {
                        TLRPC.TL_messageViews tL_messageViews = tL_messages_messageViews.views.get(i14);
                        if ((tL_messageViews.flags & 1) != 0) {
                            if (sparseIntArray == null) {
                                sparseIntArray = new SparseIntArray();
                                hVar3.k(sparseIntArray, j12);
                            }
                            sparseIntArray.put(tL_messages_getMessagesViews.id.get(i14).intValue(), tL_messageViews.views);
                        }
                        if ((tL_messageViews.flags & 2) != 0) {
                            if (sparseIntArray2 == null) {
                                sparseIntArray2 = new SparseIntArray();
                                hVar4.k(sparseIntArray2, j12);
                            }
                            sparseIntArray2.put(tL_messages_getMessagesViews.id.get(i14).intValue(), tL_messageViews.forwards);
                        }
                        if ((tL_messageViews.flags & 4) != 0) {
                            if (sparseArray == null) {
                                sparseArray = new SparseArray();
                                hVar5.k(sparseArray, j12);
                            }
                            sparseArray.put(tL_messages_getMessagesViews.id.get(i14).intValue(), tL_messageViews.replies);
                        }
                    }
                    npVar3.getMessagesStorage().m1(tL_messages_messageViews.users, tL_messages_messageViews.chats, true, true);
                    npVar3.getMessagesStorage().a1(hVar3, hVar4, hVar5, false);
                    g0.h3(new jn(npVar3, tL_messages_messageViews, hVar3, hVar4, hVar5, 8));
                    break;
                }
                break;
            case 4:
                np npVar4 = (np) this.c;
                long j13 = this.b;
                TLRPC.TL_messages_setChatAvailableReactions tL_messages_setChatAvailableReactions = (TLRPC.TL_messages_setChatAvailableReactions) this.d;
                if (tLObject != null) {
                    npVar4.O3((TLRPC.Updates) tLObject, false);
                    TLRPC.ChatFull N0 = npVar4.N0(j13);
                    if (N0 != null) {
                        if (N0 instanceof TLRPC.TL_chatFull) {
                            N0.flags |= 262144;
                        }
                        if (N0 instanceof TLRPC.TL_channelFull) {
                            N0.flags |= TLObject.FLAG_30;
                        }
                        N0.available_reactions = tL_messages_setChatAvailableReactions.available_reactions;
                        npVar4.getMessagesStorage().N1(N0, false);
                    }
                    g0.h3(new kk(npVar4, j13, 16));
                    break;
                }
                break;
            case 5:
                g0.h3(new gm((np) this.c, tLObject, this.b, (Runnable) this.d, 4));
                break;
            case 6:
                np npVar5 = (np) this.c;
                TLRPC.TL_channels_inviteToChannel tL_channels_inviteToChannel = (TLRPC.TL_channels_inviteToChannel) this.d;
                long j14 = this.b;
                if (tL_error != null) {
                    g0.h3(new mg(npVar5, tL_error, tL_channels_inviteToChannel, 1));
                    break;
                } else if (tLObject instanceof TLRPC.TL_messages_invitedUsers) {
                    TLRPC.TL_messages_invitedUsers tL_messages_invitedUsers = (TLRPC.TL_messages_invitedUsers) tLObject;
                    npVar5.O3(tL_messages_invitedUsers.updates, false);
                    g0.h3(new a4(npVar5, tL_messages_invitedUsers, j14, 4));
                    break;
                }
                break;
            case 7:
                np npVar6 = (np) this.c;
                ai.g0 g0Var = (ai.g0) this.d;
                long j15 = this.b;
                if (tLObject instanceof TLRPC.TL_exportedContactToken) {
                    npVar6.Y7 = (TLRPC.TL_exportedContactToken) tLObject;
                    g0.i3(new fi(22, npVar6, g0Var), Math.max(0L, 0 - (System.currentTimeMillis() - j15)));
                    break;
                } else {
                    npVar6.X7 = false;
                    break;
                }
            case 8:
                np npVar7 = (np) this.c;
                TLRPC.InputPeer inputPeer = (TLRPC.InputPeer) this.d;
                long j16 = this.b;
                TLRPC.messages_Messages messages_messages2 = (TLRPC.messages_Messages) tLObject;
                if (messages_messages2 != null) {
                    int i15 = messages_messages2.count;
                    if (i15 == 0) {
                        i15 = messages_messages2.messages.size();
                    }
                    int i16 = i15;
                    vr messagesStorage = npVar7.getMessagesStorage();
                    messagesStorage.a.c(new uq(messagesStorage, 0L, -inputPeer.channel_id, i16, 7));
                }
                if (j16 != 0) {
                    npVar7.getMessagesStorage().q1(j16);
                    break;
                }
                break;
            case 9:
                np npVar8 = (np) this.c;
                TLRPC.Dialog dialog = (TLRPC.Dialog) this.d;
                long j17 = this.b;
                if (tLObject != null) {
                    TLRPC.messages_Messages messages_messages3 = (TLRPC.messages_Messages) tLObject;
                    npVar8.e4(messages_messages3.messages, dialog.id);
                    if (messages_messages3.messages.isEmpty()) {
                        g0.h3(new qn(npVar8, dialog, 0));
                    } else {
                        if (r2.a) {
                            a8.b("checkLastDialogMessage for " + dialog.id + " has message");
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
                        long j18 = dialog.id;
                        tL_dialog2.id = j18;
                        message.dialog_id = j18;
                        tL_messages_dialogs2.users.addAll(messages_messages3.users);
                        tL_messages_dialogs2.chats.addAll(messages_messages3.chats);
                        tL_messages_dialogs2.dialogs.add(tL_dialog2);
                        tL_messages_dialogs2.messages.addAll(messages_messages3.messages);
                        tL_messages_dialogs2.count = 1;
                        Utilities.d.c(new xf((Object) npVar8, (Object) tL_messages_dialogs2, false, 1));
                        npVar8.getMessagesStorage().j1(messages_messages3.messages, true, true, false, npVar8.getDownloadController().l(), true, 0, 0L);
                    }
                }
                if (j17 != 0) {
                    npVar8.getMessagesStorage().q1(j17);
                }
                g0.h3(new qn(npVar8, dialog, 1));
                break;
            case 10:
                h00 h00Var = (h00) this.c;
                long j19 = this.b;
                org.telegram.ui.Components.gh ghVar = (org.telegram.ui.Components.gh) this.d;
                h00Var.getClass();
                g0.h3(new gm(h00Var, tLObject, j19, ghVar, 19));
                break;
            case 11:
                g0.h3(new im((c10) this.c, (w00) this.d, tLObject, tL_error, this.b, 6));
                break;
            default:
                g0.h3(new im((c10) this.c, (x00) this.d, tLObject, tL_error, this.b, 5));
                break;
        }
    }

    public /* synthetic */ mj(c1 c1Var, Object obj, long j3, int i7) {
        this.a = i7;
        this.c = c1Var;
        this.d = obj;
        this.b = j3;
    }
}
