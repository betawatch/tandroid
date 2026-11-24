// default package

import android.util.SparseArray;
import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.voip.ConferenceCall;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class jb7 implements RequestDelegate {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;

    public /* synthetic */ jb7(hva hvaVar, oc7 oc7Var, long j) {
        this.a = (byte) 17;
        this.d = hvaVar;
        this.b = oc7Var;
        this.c = j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:167:0x04fa  */
    @Override // org.telegram.tgnet.RequestDelegate
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        Integer num;
        Integer num2;
        Integer num3;
        long j;
        byte b = 9;
        byte b2 = 1;
        boolean z = false;
        switch (this.a) {
            case 0:
                oc7 oc7Var = (oc7) this.b;
                long j2 = this.c;
                lc7 lc7Var = (lc7) this.d;
                oc7Var.getClass();
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
                        gm.c3(new q87(oc7Var, messages_sponsoredmessages, (byte) 6));
                        vh6 vh6Var = new vh6();
                        vh6 vh6Var2 = new vh6();
                        for (int i = 0; i < messages_sponsoredmessages.users.size(); i++) {
                            TLRPC.User user = messages_sponsoredmessages.users.get(i);
                            vh6Var.k(user, user.id);
                        }
                        for (int i2 = 0; i2 < messages_sponsoredmessages.chats.size(); i2++) {
                            TLRPC.Chat chat = messages_sponsoredmessages.chats.get(i2);
                            vh6Var2.k(chat, chat.id);
                        }
                        int size = messages_sponsoredmessages.messages.size();
                        int i3 = -10000000;
                        int i4 = 0;
                        vh6 vh6Var3 = vh6Var;
                        while (i4 < size) {
                            TLRPC.TL_sponsoredMessage tL_sponsoredMessage = messages_sponsoredmessages.messages.get(i4);
                            TLRPC.TL_message tL_message = new TLRPC.TL_message();
                            if (!tL_sponsoredMessage.entities.isEmpty()) {
                                tL_message.entities = tL_sponsoredMessage.entities;
                                tL_message.flags |= 128;
                            }
                            tL_message.peer_id = oc7Var.x1(j2);
                            tL_message.flags |= 256;
                            tL_message.date = oc7Var.getConnectionsManager().getCurrentTime();
                            int i5 = i3 - 1;
                            tL_message.id = i3;
                            tL_message.message = tL_sponsoredMessage.message;
                            TLRPC.MessageMedia messageMedia = tL_sponsoredMessage.media;
                            if (messageMedia != null) {
                                tL_message.flags |= 512;
                            }
                            tL_message.media = messageMedia;
                            vh6 vh6Var4 = vh6Var3;
                            k47 k47Var = new k47(oc7Var.currentAccount, (TLRPC.Message) tL_message, vh6Var4, vh6Var2, true, true);
                            k47Var.R0 = tL_sponsoredMessage.random_id;
                            k47Var.S0 = tL_sponsoredMessage.title;
                            k47Var.T0 = tL_sponsoredMessage.url;
                            k47Var.U0 = tL_sponsoredMessage.recommended;
                            k47Var.V0 = tL_sponsoredMessage.photo;
                            k47Var.W0 = tL_sponsoredMessage.sponsor_info;
                            k47Var.X0 = tL_sponsoredMessage.additional_info;
                            k47Var.Y0 = tL_sponsoredMessage.button_text;
                            k47Var.b1 = tL_sponsoredMessage.can_report;
                            k47Var.Z0 = tL_sponsoredMessage.color;
                            k47Var.a1 = tL_sponsoredMessage.media;
                            k47Var.K5();
                            k47Var.B2 = new ArrayList();
                            k47Var.r0(true);
                            arrayList.add(k47Var);
                            i4++;
                            vh6Var3 = vh6Var4;
                            i3 = i5;
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
                gm.c3(new r97((Object) oc7Var, (Object) num, j2, (Object) lc7Var, (Object) num2, (byte) 9));
                break;
            case 1:
                oc7 oc7Var2 = (oc7) this.b;
                long j3 = this.c;
                y0a y0aVar = (y0a) this.d;
                if (tLObject instanceof TLRPC.TL_contacts_found) {
                    TLRPC.TL_contacts_found tL_contacts_found = (TLRPC.TL_contacts_found) tLObject;
                    oc7Var2.X3(tL_contacts_found.chats, false);
                    ArrayList arrayList2 = new ArrayList();
                    for (int i6 = 0; i6 < tL_contacts_found.chats.size(); i6++) {
                        TLRPC.Chat chat2 = tL_contacts_found.chats.get(i6);
                        TLRPC.InputPeer k1 = oc7.k1(chat2);
                        if (chat2.id != j3 && sd2.R(chat2)) {
                            arrayList2.add(k1);
                        }
                    }
                    gm.c3(new x30(y0aVar, arrayList2, b));
                    break;
                }
                break;
            case 2:
                ((ConferenceCall) this.b).lambda$requestLastBlock$3(this.c, (Runnable) this.d, tLObject, tL_error);
                break;
            case 3:
                oc7 oc7Var3 = (oc7) this.b;
                long j4 = this.c;
                dt5 dt5Var = (dt5) this.d;
                String str = LaunchActivity.C1;
                gm.c3(new p97(tLObject, oc7Var3, j4, dt5Var));
                break;
            case 4:
                hs6 hs6Var = (hs6) this.b;
                long j5 = this.c;
                TLRPC.TL_messages_getMessages tL_messages_getMessages = (TLRPC.TL_messages_getMessages) this.d;
                if (tL_error == null) {
                    TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                    hs6.N1(messages_messages.messages);
                    if (!messages_messages.messages.isEmpty()) {
                        fn5.S(messages_messages.messages);
                        hs6Var.m(messages_messages.messages, messages_messages.users, messages_messages.chats, false, false);
                        hs6Var.getMessagesStorage().j1(messages_messages.users, messages_messages.chats, true, true);
                        ArrayList<TLRPC.Message> arrayList3 = messages_messages.messages;
                        if (!arrayList3.isEmpty()) {
                            hs6Var.getMessagesStorage().a.c(new hq6((Object) hs6Var, (Object) arrayList3, j5, (byte) 1));
                            break;
                        }
                    }
                }
                hs6Var.getMessagesStorage().Z1(j5, tL_messages_getMessages.id, false, -1, 0, false, null);
                break;
            case 5:
                oc7 oc7Var4 = (oc7) this.b;
                long j6 = this.c;
                TLRPC.Chat chat3 = (TLRPC.Chat) this.d;
                if (tLObject != null) {
                    TLRPC.TL_messages_peerDialogs tL_messages_peerDialogs = (TLRPC.TL_messages_peerDialogs) tLObject;
                    if (!tL_messages_peerDialogs.dialogs.isEmpty() && !tL_messages_peerDialogs.chats.isEmpty()) {
                        TLRPC.TL_dialog tL_dialog = (TLRPC.TL_dialog) tL_messages_peerDialogs.dialogs.get(0);
                        TLRPC.TL_messages_dialogs tL_messages_dialogs = new TLRPC.TL_messages_dialogs();
                        tL_messages_dialogs.dialogs.addAll(tL_messages_peerDialogs.dialogs);
                        tL_messages_dialogs.messages.addAll(tL_messages_peerDialogs.messages);
                        tL_messages_dialogs.users.addAll(tL_messages_peerDialogs.users);
                        tL_messages_dialogs.chats.addAll(tL_messages_peerDialogs.chats);
                        j = j6;
                        oc7Var4.O3(tL_messages_dialogs, null, null, tL_dialog.folder_id, 0, 1, oc7Var4.E4, false, false, false);
                        if (j != 0) {
                            oc7Var4.getMessagesStorage().n1(j);
                        }
                        oc7Var4.S0.e(chat3.id);
                        break;
                    }
                }
                j = j6;
                if (j != 0) {
                }
                oc7Var4.S0.e(chat3.id);
                break;
            case 6:
                oc7 oc7Var5 = (oc7) this.b;
                long j7 = this.c;
                TLRPC.TL_messages_setChatAvailableReactions tL_messages_setChatAvailableReactions = (TLRPC.TL_messages_setChatAvailableReactions) this.d;
                if (tLObject != null) {
                    oc7Var5.T3((TLRPC.Updates) tLObject, false);
                    TLRPC.ChatFull M0 = oc7Var5.M0(j7);
                    if (M0 != null) {
                        if (M0 instanceof TLRPC.TL_chatFull) {
                            M0.flags |= 262144;
                        }
                        if (M0 instanceof TLRPC.TL_channelFull) {
                            M0.flags |= TLObject.FLAG_30;
                        }
                        M0.available_reactions = tL_messages_setChatAvailableReactions.available_reactions;
                        oc7Var5.getMessagesStorage().K1(M0, false);
                    }
                    gm.c3(new r77(oc7Var5, j7, (byte) 18));
                    break;
                }
                break;
            case 7:
                oc7 oc7Var6 = (oc7) this.b;
                long j8 = this.c;
                TLRPC.TL_messages_getMessagesViews tL_messages_getMessagesViews = (TLRPC.TL_messages_getMessagesViews) this.d;
                if (tLObject != null) {
                    TLRPC.TL_messages_messageViews tL_messages_messageViews = (TLRPC.TL_messages_messageViews) tLObject;
                    vh6 vh6Var5 = new vh6();
                    vh6 vh6Var6 = new vh6();
                    vh6 vh6Var7 = new vh6();
                    SparseIntArray sparseIntArray = (SparseIntArray) vh6Var5.f(j8);
                    SparseIntArray sparseIntArray2 = (SparseIntArray) vh6Var6.f(j8);
                    SparseArray sparseArray = (SparseArray) vh6Var7.f(j8);
                    for (int i7 = 0; i7 < tL_messages_getMessagesViews.id.size() && i7 < tL_messages_messageViews.views.size(); i7++) {
                        TLRPC.TL_messageViews tL_messageViews = tL_messages_messageViews.views.get(i7);
                        if ((tL_messageViews.flags & 1) != 0) {
                            if (sparseIntArray == null) {
                                sparseIntArray = new SparseIntArray();
                                vh6Var5.k(sparseIntArray, j8);
                            }
                            sparseIntArray.put(tL_messages_getMessagesViews.id.get(i7).intValue(), tL_messageViews.views);
                        }
                        if ((tL_messageViews.flags & 2) != 0) {
                            if (sparseIntArray2 == null) {
                                sparseIntArray2 = new SparseIntArray();
                                vh6Var6.k(sparseIntArray2, j8);
                            }
                            sparseIntArray2.put(tL_messages_getMessagesViews.id.get(i7).intValue(), tL_messageViews.forwards);
                        }
                        if ((tL_messageViews.flags & 4) != 0) {
                            if (sparseArray == null) {
                                sparseArray = new SparseArray();
                                vh6Var7.k(sparseArray, j8);
                            }
                            sparseArray.put(tL_messages_getMessagesViews.id.get(i7).intValue(), tL_messageViews.replies);
                        }
                    }
                    oc7Var6.getMessagesStorage().j1(tL_messages_messageViews.users, tL_messages_messageViews.chats, true, true);
                    oc7Var6.getMessagesStorage().X0(vh6Var5, vh6Var6, vh6Var7, false);
                    gm.c3(new v15((Object) oc7Var6, (Object) tL_messages_messageViews, (Object) vh6Var5, (Object) vh6Var6, (Object) vh6Var7, (byte) 22));
                    break;
                }
                break;
            case 8:
                oc7 oc7Var7 = (oc7) this.b;
                TLRPC.TL_channels_inviteToChannel tL_channels_inviteToChannel = (TLRPC.TL_channels_inviteToChannel) this.d;
                long j9 = this.c;
                if (tL_error != null) {
                    gm.c3(new op6((Object) oc7Var7, (Object) tL_error, (Object) tL_channels_inviteToChannel, b2));
                    break;
                } else if (tLObject instanceof TLRPC.TL_messages_invitedUsers) {
                    TLRPC.TL_messages_invitedUsers tL_messages_invitedUsers = (TLRPC.TL_messages_invitedUsers) tLObject;
                    oc7Var7.T3(tL_messages_invitedUsers.updates, false);
                    gm.c3(new of2((Object) oc7Var7, (Object) tL_messages_invitedUsers, j9, (byte) 4));
                    break;
                }
                break;
            case 9:
                oc7 oc7Var8 = (oc7) this.b;
                ci7 ci7Var = (ci7) this.d;
                long j10 = this.c;
                if (tLObject instanceof TLRPC.TL_exportedContactToken) {
                    oc7Var8.N4 = (TLRPC.TL_exportedContactToken) tLObject;
                    gm.d3(new q87(oc7Var8, ci7Var, (byte) 12), Math.max(0L, 0 - (System.currentTimeMillis() - j10)));
                    break;
                } else {
                    oc7Var8.M4 = false;
                    break;
                }
            case 10:
                oc7 oc7Var9 = (oc7) this.b;
                TLRPC.InputPeer inputPeer = (TLRPC.InputPeer) this.d;
                long j11 = this.c;
                TLRPC.messages_Messages messages_messages2 = (TLRPC.messages_Messages) tLObject;
                if (messages_messages2 != null) {
                    int i8 = messages_messages2.count;
                    if (i8 == 0) {
                        i8 = messages_messages2.messages.size();
                    }
                    int i9 = i8;
                    cf7 messagesStorage = oc7Var9.getMessagesStorage();
                    messagesStorage.a.c(new ae7(messagesStorage, 0L, -inputPeer.channel_id, i9, (byte) 7));
                }
                if (j11 != 0) {
                    oc7Var9.getMessagesStorage().n1(j11);
                    break;
                }
                break;
            case 11:
                gm.c3(new p97(this.b, (Object) tLObject, this.c, this.d, (byte) 15));
                break;
            case 12:
                oc7 oc7Var10 = (oc7) this.b;
                TLRPC.Dialog dialog = (TLRPC.Dialog) this.d;
                long j12 = this.c;
                if (tLObject != null) {
                    TLRPC.messages_Messages messages_messages3 = (TLRPC.messages_Messages) tLObject;
                    oc7Var10.j4(messages_messages3.messages, dialog.id);
                    if (messages_messages3.messages.isEmpty()) {
                        gm.c3(new ra7(oc7Var10, dialog, false ? 1 : 0));
                    } else {
                        if (e21.a) {
                            fc4.b("checkLastDialogMessage for " + dialog.id + " has message");
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
                        long j13 = dialog.id;
                        tL_dialog2.id = j13;
                        message.dialog_id = j13;
                        tL_messages_dialogs2.users.addAll(messages_messages3.users);
                        tL_messages_dialogs2.chats.addAll(messages_messages3.chats);
                        tL_messages_dialogs2.dialogs.add(tL_dialog2);
                        tL_messages_dialogs2.messages.addAll(messages_messages3.messages);
                        tL_messages_dialogs2.count = 1;
                        Utilities.d.c(new np6(oc7Var10, tL_messages_dialogs2, z, b2));
                        oc7Var10.getMessagesStorage().g1(messages_messages3.messages, true, true, false, oc7Var10.getDownloadController().l(), true, 0, 0L);
                    }
                }
                if (j12 != 0) {
                    oc7Var10.getMessagesStorage().n1(j12);
                }
                gm.c3(new ra7(oc7Var10, dialog, b2));
                break;
            case 13:
                final p19 p19Var = (p19) this.b;
                long j14 = this.c;
                TLRPC.Chat chat4 = (TLRPC.Chat) this.d;
                int i10 = p19Var.f;
                if (tLObject instanceof Vector) {
                    final ArrayList arrayList4 = new ArrayList();
                    final ArrayList arrayList5 = new ArrayList();
                    ArrayList<T> arrayList6 = ((Vector) tLObject).objects;
                    int size2 = arrayList6.size();
                    int i11 = 0;
                    while (i11 < size2) {
                        Object obj = arrayList6.get(i11);
                        i11++;
                        if (obj instanceof Long) {
                            Long l = (Long) obj;
                            if (j14 != l.longValue()) {
                                arrayList4.add(l);
                                arrayList5.add(0);
                            }
                        } else if (obj instanceof TLRPC.TL_readParticipantDate) {
                            TLRPC.TL_readParticipantDate tL_readParticipantDate = (TLRPC.TL_readParticipantDate) obj;
                            long j15 = tL_readParticipantDate.user_id;
                            int i12 = tL_readParticipantDate.date;
                            if (j14 != j15) {
                                arrayList4.add(Long.valueOf(j15));
                                arrayList5.add(Integer.valueOf(i12));
                            }
                        }
                    }
                    arrayList4.add(Long.valueOf(j14));
                    arrayList5.add(0);
                    final ArrayList arrayList7 = new ArrayList();
                    final ey8 ey8Var = new ey8(p19Var, arrayList7, b);
                    if (sd2.T(chat4)) {
                        TLRPC.TL_channels_getParticipants tL_channels_getParticipants = new TLRPC.TL_channels_getParticipants();
                        tL_channels_getParticipants.limit = oc7.r1(i10).l4.N0.f();
                        tL_channels_getParticipants.offset = 0;
                        tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsRecent();
                        tL_channels_getParticipants.channel = oc7.r1(i10).g1(chat4.id);
                        final byte b3 = 0;
                        ConnectionsManager.getInstance(i10).sendRequest(tL_channels_getParticipants, new RequestDelegate() { // from class: m19
                            @Override // org.telegram.tgnet.RequestDelegate
                            public final void run(final TLObject tLObject2, TLRPC.TL_error tL_error2) {
                                switch (b3) {
                                    case 0:
                                        final byte b4 = 0;
                                        final p19 p19Var2 = p19Var;
                                        final ArrayList arrayList8 = arrayList4;
                                        final ArrayList arrayList9 = arrayList7;
                                        final ArrayList arrayList10 = arrayList5;
                                        final ey8 ey8Var2 = ey8Var;
                                        gm.c3(new Runnable() { // from class: n19
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                byte b5 = b4;
                                                ey8 ey8Var3 = ey8Var2;
                                                ArrayList arrayList11 = arrayList10;
                                                ArrayList arrayList12 = arrayList9;
                                                ArrayList arrayList13 = arrayList8;
                                                TLObject tLObject3 = tLObject2;
                                                p19 p19Var3 = p19Var2;
                                                switch (b5) {
                                                    case 0:
                                                        if (tLObject3 != null) {
                                                            TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject3;
                                                            for (int i13 = 0; i13 < tL_channels_channelParticipants.users.size(); i13++) {
                                                                TLRPC.User user2 = tL_channels_channelParticipants.users.get(i13);
                                                                oc7.r1(p19Var3.f).c4(user2, false, false);
                                                                int indexOf = arrayList13.indexOf(Long.valueOf(user2.id));
                                                                if (!user2.self && indexOf >= 0) {
                                                                    arrayList12.add(new o19(((Integer) arrayList11.get(indexOf)).intValue(), user2));
                                                                }
                                                            }
                                                        }
                                                        ey8Var3.run();
                                                        break;
                                                    default:
                                                        if (tLObject3 != null) {
                                                            TLRPC.TL_messages_chatFull tL_messages_chatFull = (TLRPC.TL_messages_chatFull) tLObject3;
                                                            for (int i14 = 0; i14 < tL_messages_chatFull.users.size(); i14++) {
                                                                TLRPC.User user3 = tL_messages_chatFull.users.get(i14);
                                                                oc7.r1(p19Var3.f).c4(user3, false, false);
                                                                int indexOf2 = arrayList13.indexOf(Long.valueOf(user3.id));
                                                                if (!user3.self && indexOf2 >= 0) {
                                                                    arrayList12.add(new o19(((Integer) arrayList11.get(indexOf2)).intValue(), user3));
                                                                }
                                                            }
                                                        }
                                                        ey8Var3.run();
                                                        break;
                                                }
                                            }
                                        });
                                        break;
                                    default:
                                        final byte b5 = 1;
                                        final p19 p19Var3 = p19Var;
                                        final ArrayList arrayList11 = arrayList4;
                                        final ArrayList arrayList12 = arrayList7;
                                        final ArrayList arrayList13 = arrayList5;
                                        final ey8 ey8Var3 = ey8Var;
                                        gm.c3(new Runnable() { // from class: n19
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                byte b52 = b5;
                                                ey8 ey8Var32 = ey8Var3;
                                                ArrayList arrayList112 = arrayList13;
                                                ArrayList arrayList122 = arrayList12;
                                                ArrayList arrayList132 = arrayList11;
                                                TLObject tLObject3 = tLObject2;
                                                p19 p19Var32 = p19Var3;
                                                switch (b52) {
                                                    case 0:
                                                        if (tLObject3 != null) {
                                                            TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject3;
                                                            for (int i13 = 0; i13 < tL_channels_channelParticipants.users.size(); i13++) {
                                                                TLRPC.User user2 = tL_channels_channelParticipants.users.get(i13);
                                                                oc7.r1(p19Var32.f).c4(user2, false, false);
                                                                int indexOf = arrayList132.indexOf(Long.valueOf(user2.id));
                                                                if (!user2.self && indexOf >= 0) {
                                                                    arrayList122.add(new o19(((Integer) arrayList112.get(indexOf)).intValue(), user2));
                                                                }
                                                            }
                                                        }
                                                        ey8Var32.run();
                                                        break;
                                                    default:
                                                        if (tLObject3 != null) {
                                                            TLRPC.TL_messages_chatFull tL_messages_chatFull = (TLRPC.TL_messages_chatFull) tLObject3;
                                                            for (int i14 = 0; i14 < tL_messages_chatFull.users.size(); i14++) {
                                                                TLRPC.User user3 = tL_messages_chatFull.users.get(i14);
                                                                oc7.r1(p19Var32.f).c4(user3, false, false);
                                                                int indexOf2 = arrayList132.indexOf(Long.valueOf(user3.id));
                                                                if (!user3.self && indexOf2 >= 0) {
                                                                    arrayList122.add(new o19(((Integer) arrayList112.get(indexOf2)).intValue(), user3));
                                                                }
                                                            }
                                                        }
                                                        ey8Var32.run();
                                                        break;
                                                }
                                            }
                                        });
                                        break;
                                }
                            }
                        });
                        break;
                    } else {
                        TLRPC.TL_messages_getFullChat tL_messages_getFullChat = new TLRPC.TL_messages_getFullChat();
                        tL_messages_getFullChat.chat_id = chat4.id;
                        final byte b4 = 1;
                        ConnectionsManager.getInstance(i10).sendRequest(tL_messages_getFullChat, new RequestDelegate() { // from class: m19
                            @Override // org.telegram.tgnet.RequestDelegate
                            public final void run(final TLObject tLObject2, TLRPC.TL_error tL_error2) {
                                switch (b4) {
                                    case 0:
                                        final byte b42 = 0;
                                        final p19 p19Var2 = p19Var;
                                        final ArrayList arrayList8 = arrayList4;
                                        final ArrayList arrayList9 = arrayList7;
                                        final ArrayList arrayList10 = arrayList5;
                                        final ey8 ey8Var2 = ey8Var;
                                        gm.c3(new Runnable() { // from class: n19
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                byte b52 = b42;
                                                ey8 ey8Var32 = ey8Var2;
                                                ArrayList arrayList112 = arrayList10;
                                                ArrayList arrayList122 = arrayList9;
                                                ArrayList arrayList132 = arrayList8;
                                                TLObject tLObject3 = tLObject2;
                                                p19 p19Var32 = p19Var2;
                                                switch (b52) {
                                                    case 0:
                                                        if (tLObject3 != null) {
                                                            TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject3;
                                                            for (int i13 = 0; i13 < tL_channels_channelParticipants.users.size(); i13++) {
                                                                TLRPC.User user2 = tL_channels_channelParticipants.users.get(i13);
                                                                oc7.r1(p19Var32.f).c4(user2, false, false);
                                                                int indexOf = arrayList132.indexOf(Long.valueOf(user2.id));
                                                                if (!user2.self && indexOf >= 0) {
                                                                    arrayList122.add(new o19(((Integer) arrayList112.get(indexOf)).intValue(), user2));
                                                                }
                                                            }
                                                        }
                                                        ey8Var32.run();
                                                        break;
                                                    default:
                                                        if (tLObject3 != null) {
                                                            TLRPC.TL_messages_chatFull tL_messages_chatFull = (TLRPC.TL_messages_chatFull) tLObject3;
                                                            for (int i14 = 0; i14 < tL_messages_chatFull.users.size(); i14++) {
                                                                TLRPC.User user3 = tL_messages_chatFull.users.get(i14);
                                                                oc7.r1(p19Var32.f).c4(user3, false, false);
                                                                int indexOf2 = arrayList132.indexOf(Long.valueOf(user3.id));
                                                                if (!user3.self && indexOf2 >= 0) {
                                                                    arrayList122.add(new o19(((Integer) arrayList112.get(indexOf2)).intValue(), user3));
                                                                }
                                                            }
                                                        }
                                                        ey8Var32.run();
                                                        break;
                                                }
                                            }
                                        });
                                        break;
                                    default:
                                        final byte b5 = 1;
                                        final p19 p19Var3 = p19Var;
                                        final ArrayList arrayList11 = arrayList4;
                                        final ArrayList arrayList12 = arrayList7;
                                        final ArrayList arrayList13 = arrayList5;
                                        final ey8 ey8Var3 = ey8Var;
                                        gm.c3(new Runnable() { // from class: n19
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                byte b52 = b5;
                                                ey8 ey8Var32 = ey8Var3;
                                                ArrayList arrayList112 = arrayList13;
                                                ArrayList arrayList122 = arrayList12;
                                                ArrayList arrayList132 = arrayList11;
                                                TLObject tLObject3 = tLObject2;
                                                p19 p19Var32 = p19Var3;
                                                switch (b52) {
                                                    case 0:
                                                        if (tLObject3 != null) {
                                                            TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject3;
                                                            for (int i13 = 0; i13 < tL_channels_channelParticipants.users.size(); i13++) {
                                                                TLRPC.User user2 = tL_channels_channelParticipants.users.get(i13);
                                                                oc7.r1(p19Var32.f).c4(user2, false, false);
                                                                int indexOf = arrayList132.indexOf(Long.valueOf(user2.id));
                                                                if (!user2.self && indexOf >= 0) {
                                                                    arrayList122.add(new o19(((Integer) arrayList112.get(indexOf)).intValue(), user2));
                                                                }
                                                            }
                                                        }
                                                        ey8Var32.run();
                                                        break;
                                                    default:
                                                        if (tLObject3 != null) {
                                                            TLRPC.TL_messages_chatFull tL_messages_chatFull = (TLRPC.TL_messages_chatFull) tLObject3;
                                                            for (int i14 = 0; i14 < tL_messages_chatFull.users.size(); i14++) {
                                                                TLRPC.User user3 = tL_messages_chatFull.users.get(i14);
                                                                oc7.r1(p19Var32.f).c4(user3, false, false);
                                                                int indexOf2 = arrayList132.indexOf(Long.valueOf(user3.id));
                                                                if (!user3.self && indexOf2 >= 0) {
                                                                    arrayList122.add(new o19(((Integer) arrayList112.get(indexOf2)).intValue(), user3));
                                                                }
                                                            }
                                                        }
                                                        ey8Var32.run();
                                                        break;
                                                }
                                            }
                                        });
                                        break;
                                }
                            }
                        });
                        break;
                    }
                }
                break;
            case 14:
                oo9 oo9Var = (oo9) this.b;
                int[] iArr = (int[]) this.d;
                long j16 = this.c;
                int i13 = oo9Var.e;
                if (tLObject instanceof TL_phone.groupParticipants) {
                    TL_phone.groupParticipants groupparticipants = (TL_phone.groupParticipants) tLObject;
                    oc7.r1(i13).d4(groupparticipants.users, false);
                    oc7.r1(i13).X3(groupparticipants.chats, false);
                    if (oo9Var.P != null) {
                        z8c.h(i13).e();
                        ArrayList arrayList8 = new ArrayList();
                        for (int i14 : iArr) {
                            ArrayList<TLRPC.GroupCallParticipant> arrayList9 = groupparticipants.participants;
                            int size3 = arrayList9.size();
                            int i15 = 0;
                            while (true) {
                                if (i15 < size3) {
                                    TLRPC.GroupCallParticipant groupCallParticipant = arrayList9.get(i15);
                                    i15++;
                                    TLRPC.GroupCallParticipant groupCallParticipant2 = groupCallParticipant;
                                    if (groupCallParticipant2.source == i14) {
                                        arrayList8.add(new VoIPService.RequestedParticipant(groupCallParticipant2, i14));
                                    }
                                }
                            }
                        }
                        oo9Var.P.onMediaDescriptionAvailable(j16, (VoIPService.RequestedParticipant[]) arrayList8.toArray(new VoIPService.RequestedParticipant[0]));
                        break;
                    }
                }
                break;
            case 15:
                gm.c3(new r97(this.b, this.d, (Object) tLObject, this.c, (Object) tL_error, (byte) 15));
                break;
            case 16:
                gm.c3(new nz8(this.b, (Object) tLObject, this.c, this.d, (byte) 9));
                break;
            case 17:
                hva hvaVar = (hva) this.d;
                oc7 oc7Var11 = (oc7) this.b;
                long j17 = this.c;
                hvaVar.getClass();
                gm.c3(new r97(hvaVar, tLObject, oc7Var11, tL_error, j17));
                break;
            case 18:
                qwb qwbVar = (qwb) this.b;
                long j18 = this.c;
                dyb dybVar = (dyb) this.d;
                qwbVar.getClass();
                gm.c3(new nz8((Object) qwbVar, (Object) tLObject, j18, (Object) dybVar, (byte) 15));
                break;
            case 19:
                gm.c3(new r97(this.b, this.d, (Object) tLObject, (Object) tL_error, this.c, (byte) 22));
                break;
            default:
                gm.c3(new r97(this.b, this.d, (Object) tLObject, (Object) tL_error, this.c, (byte) 21));
                break;
        }
    }

    public /* synthetic */ jb7(Object obj, long j, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = j;
        this.d = obj2;
    }

    public /* synthetic */ jb7(Object obj, Object obj2, long j, byte b) {
        this.a = b;
        this.b = obj;
        this.d = obj2;
        this.c = j;
    }
}
