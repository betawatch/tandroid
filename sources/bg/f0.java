package bg;

import gh.u7;
import gh.v7;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.lg;
import org.telegram.messenger.voip.ConferenceCall;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.Components.jg0;
import org.telegram.ui.Components.ui0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.jq;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class f0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ f0(u7 u7Var, MessagesController messagesController, long j10) {
        this.a = 2;
        this.d = u7Var;
        this.c = messagesController;
        this.b = j10;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i9 = this.a;
        long j10 = this.b;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (i9) {
            case 0:
                MessagesController messagesController = (MessagesController) obj2;
                l2 l2Var = (l2) obj;
                if (tLObject instanceof TLRPC.TL_contacts_found) {
                    TLRPC.TL_contacts_found tL_contacts_found = (TLRPC.TL_contacts_found) tLObject;
                    messagesController.putChats(tL_contacts_found.chats, false);
                    ArrayList arrayList = new ArrayList();
                    for (int i10 = 0; i10 < tL_contacts_found.chats.size(); i10++) {
                        TLRPC.Chat chat = tL_contacts_found.chats.get(i10);
                        TLRPC.InputPeer inputPeer = MessagesController.getInputPeer(chat);
                        if (chat.id != j10 && ChatObject.isBoostSupported(chat)) {
                            arrayList.add(inputPeer);
                        }
                    }
                    AndroidUtilities.runOnUIThread(new a1.e(10, l2Var, arrayList));
                    break;
                }
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new gh.e2((v7) obj2, (Object) tLObject, this.b, obj, 4));
                break;
            case 2:
                u7 u7Var = (u7) obj;
                u7Var.getClass();
                AndroidUtilities.runOnUIThread(new fh.m1(u7Var, tLObject, (MessagesController) obj2, tL_error, this.b, 6));
                break;
            case 3:
                ih.f1 f1Var = (ih.f1) obj2;
                int[] iArr = (int[]) obj;
                int i11 = f1Var.e;
                if (tLObject instanceof TL_phone.groupParticipants) {
                    TL_phone.groupParticipants groupparticipants = (TL_phone.groupParticipants) tLObject;
                    MessagesController.getInstance(i11).putUsers(groupparticipants.users, false);
                    MessagesController.getInstance(i11).putChats(groupparticipants.chats, false);
                    if (f1Var.A != null) {
                        UserConfig.getInstance(i11).getClientUserId();
                        ArrayList arrayList2 = new ArrayList();
                        for (int i12 : iArr) {
                            ArrayList<TLRPC.GroupCallParticipant> arrayList3 = groupparticipants.participants;
                            int size = arrayList3.size();
                            int i13 = 0;
                            while (true) {
                                if (i13 < size) {
                                    TLRPC.GroupCallParticipant groupCallParticipant = arrayList3.get(i13);
                                    i13++;
                                    TLRPC.GroupCallParticipant groupCallParticipant2 = groupCallParticipant;
                                    if (groupCallParticipant2.source == i12) {
                                        arrayList2.add(new VoIPService.RequestedParticipant(groupCallParticipant2, i12));
                                    }
                                }
                            }
                        }
                        f1Var.A.onMediaDescriptionAvailable(j10, (VoIPService.RequestedParticipant[]) arrayList2.toArray(new VoIPService.RequestedParticipant[0]));
                        break;
                    }
                }
                break;
            case 4:
                ((ConferenceCall) obj2).lambda$requestLastBlock$3(this.b, (Runnable) obj, tLObject, tL_error);
                break;
            case 5:
                final ui0 ui0Var = (ui0) obj2;
                TLRPC.Chat chat2 = (TLRPC.Chat) obj;
                int i14 = ui0Var.f;
                if (tLObject instanceof Vector) {
                    final ArrayList arrayList4 = new ArrayList();
                    final ArrayList arrayList5 = new ArrayList();
                    ArrayList<T> arrayList6 = ((Vector) tLObject).objects;
                    int size2 = arrayList6.size();
                    int i15 = 0;
                    while (i15 < size2) {
                        Object obj3 = arrayList6.get(i15);
                        i15++;
                        if (obj3 instanceof Long) {
                            Long l10 = (Long) obj3;
                            if (j10 != l10.longValue()) {
                                arrayList4.add(l10);
                                arrayList5.add(0);
                            }
                        } else if (obj3 instanceof TLRPC.TL_readParticipantDate) {
                            TLRPC.TL_readParticipantDate tL_readParticipantDate = (TLRPC.TL_readParticipantDate) obj3;
                            long j11 = tL_readParticipantDate.user_id;
                            int i16 = tL_readParticipantDate.date;
                            if (j10 != j11) {
                                arrayList4.add(Long.valueOf(j11));
                                arrayList5.add(Integer.valueOf(i16));
                            }
                        }
                    }
                    arrayList4.add(Long.valueOf(j10));
                    arrayList5.add(0);
                    final ArrayList arrayList7 = new ArrayList();
                    final jg0 jg0Var = new jg0(5, ui0Var, arrayList7);
                    if (ChatObject.isChannel(chat2)) {
                        TLRPC.TL_channels_getParticipants tL_channels_getParticipants = new TLRPC.TL_channels_getParticipants();
                        tL_channels_getParticipants.limit = MessagesController.getInstance(i14).chatReadMarkSizeThreshold;
                        tL_channels_getParticipants.offset = 0;
                        tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsRecent();
                        tL_channels_getParticipants.channel = MessagesController.getInstance(i14).getInputChannel(chat2.id);
                        final int i17 = 0;
                        ConnectionsManager.getInstance(i14).sendRequest(tL_channels_getParticipants, new RequestDelegate() { // from class: org.telegram.ui.Components.ri0
                            @Override // org.telegram.tgnet.RequestDelegate
                            public final void run(final TLObject tLObject2, TLRPC.TL_error tL_error2) {
                                switch (i17) {
                                    case 0:
                                        final int i18 = 0;
                                        final ui0 ui0Var2 = ui0Var;
                                        final ArrayList arrayList8 = arrayList4;
                                        final ArrayList arrayList9 = arrayList7;
                                        final ArrayList arrayList10 = arrayList5;
                                        final jg0 jg0Var2 = jg0Var;
                                        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Components.si0
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                switch (i18) {
                                                    case 0:
                                                        TLObject tLObject3 = tLObject2;
                                                        if (tLObject3 != null) {
                                                            TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject3;
                                                            for (int i19 = 0; i19 < tL_channels_channelParticipants.users.size(); i19++) {
                                                                TLRPC.User user = tL_channels_channelParticipants.users.get(i19);
                                                                MessagesController.getInstance(ui0Var2.f).putUser(user, false);
                                                                int indexOf = arrayList8.indexOf(Long.valueOf(user.id));
                                                                if (!user.self && indexOf >= 0) {
                                                                    arrayList9.add(new ti0(((Integer) arrayList10.get(indexOf)).intValue(), user));
                                                                }
                                                            }
                                                        }
                                                        jg0Var2.run();
                                                        break;
                                                    default:
                                                        TLObject tLObject4 = tLObject2;
                                                        if (tLObject4 != null) {
                                                            TLRPC.TL_messages_chatFull tL_messages_chatFull = (TLRPC.TL_messages_chatFull) tLObject4;
                                                            for (int i20 = 0; i20 < tL_messages_chatFull.users.size(); i20++) {
                                                                TLRPC.User user2 = tL_messages_chatFull.users.get(i20);
                                                                MessagesController.getInstance(ui0Var2.f).putUser(user2, false);
                                                                int indexOf2 = arrayList8.indexOf(Long.valueOf(user2.id));
                                                                if (!user2.self && indexOf2 >= 0) {
                                                                    arrayList9.add(new ti0(((Integer) arrayList10.get(indexOf2)).intValue(), user2));
                                                                }
                                                            }
                                                        }
                                                        jg0Var2.run();
                                                        break;
                                                }
                                            }
                                        });
                                        break;
                                    default:
                                        final int i19 = 1;
                                        final ui0 ui0Var3 = ui0Var;
                                        final ArrayList arrayList11 = arrayList4;
                                        final ArrayList arrayList12 = arrayList7;
                                        final ArrayList arrayList13 = arrayList5;
                                        final jg0 jg0Var3 = jg0Var;
                                        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Components.si0
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                switch (i19) {
                                                    case 0:
                                                        TLObject tLObject3 = tLObject2;
                                                        if (tLObject3 != null) {
                                                            TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject3;
                                                            for (int i192 = 0; i192 < tL_channels_channelParticipants.users.size(); i192++) {
                                                                TLRPC.User user = tL_channels_channelParticipants.users.get(i192);
                                                                MessagesController.getInstance(ui0Var3.f).putUser(user, false);
                                                                int indexOf = arrayList11.indexOf(Long.valueOf(user.id));
                                                                if (!user.self && indexOf >= 0) {
                                                                    arrayList12.add(new ti0(((Integer) arrayList13.get(indexOf)).intValue(), user));
                                                                }
                                                            }
                                                        }
                                                        jg0Var3.run();
                                                        break;
                                                    default:
                                                        TLObject tLObject4 = tLObject2;
                                                        if (tLObject4 != null) {
                                                            TLRPC.TL_messages_chatFull tL_messages_chatFull = (TLRPC.TL_messages_chatFull) tLObject4;
                                                            for (int i20 = 0; i20 < tL_messages_chatFull.users.size(); i20++) {
                                                                TLRPC.User user2 = tL_messages_chatFull.users.get(i20);
                                                                MessagesController.getInstance(ui0Var3.f).putUser(user2, false);
                                                                int indexOf2 = arrayList11.indexOf(Long.valueOf(user2.id));
                                                                if (!user2.self && indexOf2 >= 0) {
                                                                    arrayList12.add(new ti0(((Integer) arrayList13.get(indexOf2)).intValue(), user2));
                                                                }
                                                            }
                                                        }
                                                        jg0Var3.run();
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
                        tL_messages_getFullChat.chat_id = chat2.id;
                        final int i18 = 1;
                        ConnectionsManager.getInstance(i14).sendRequest(tL_messages_getFullChat, new RequestDelegate() { // from class: org.telegram.ui.Components.ri0
                            @Override // org.telegram.tgnet.RequestDelegate
                            public final void run(final TLObject tLObject2, TLRPC.TL_error tL_error2) {
                                switch (i18) {
                                    case 0:
                                        final int i182 = 0;
                                        final ui0 ui0Var2 = ui0Var;
                                        final ArrayList arrayList8 = arrayList4;
                                        final ArrayList arrayList9 = arrayList7;
                                        final ArrayList arrayList10 = arrayList5;
                                        final jg0 jg0Var2 = jg0Var;
                                        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Components.si0
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                switch (i182) {
                                                    case 0:
                                                        TLObject tLObject3 = tLObject2;
                                                        if (tLObject3 != null) {
                                                            TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject3;
                                                            for (int i192 = 0; i192 < tL_channels_channelParticipants.users.size(); i192++) {
                                                                TLRPC.User user = tL_channels_channelParticipants.users.get(i192);
                                                                MessagesController.getInstance(ui0Var2.f).putUser(user, false);
                                                                int indexOf = arrayList8.indexOf(Long.valueOf(user.id));
                                                                if (!user.self && indexOf >= 0) {
                                                                    arrayList9.add(new ti0(((Integer) arrayList10.get(indexOf)).intValue(), user));
                                                                }
                                                            }
                                                        }
                                                        jg0Var2.run();
                                                        break;
                                                    default:
                                                        TLObject tLObject4 = tLObject2;
                                                        if (tLObject4 != null) {
                                                            TLRPC.TL_messages_chatFull tL_messages_chatFull = (TLRPC.TL_messages_chatFull) tLObject4;
                                                            for (int i20 = 0; i20 < tL_messages_chatFull.users.size(); i20++) {
                                                                TLRPC.User user2 = tL_messages_chatFull.users.get(i20);
                                                                MessagesController.getInstance(ui0Var2.f).putUser(user2, false);
                                                                int indexOf2 = arrayList8.indexOf(Long.valueOf(user2.id));
                                                                if (!user2.self && indexOf2 >= 0) {
                                                                    arrayList9.add(new ti0(((Integer) arrayList10.get(indexOf2)).intValue(), user2));
                                                                }
                                                            }
                                                        }
                                                        jg0Var2.run();
                                                        break;
                                                }
                                            }
                                        });
                                        break;
                                    default:
                                        final int i19 = 1;
                                        final ui0 ui0Var3 = ui0Var;
                                        final ArrayList arrayList11 = arrayList4;
                                        final ArrayList arrayList12 = arrayList7;
                                        final ArrayList arrayList13 = arrayList5;
                                        final jg0 jg0Var3 = jg0Var;
                                        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Components.si0
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                switch (i19) {
                                                    case 0:
                                                        TLObject tLObject3 = tLObject2;
                                                        if (tLObject3 != null) {
                                                            TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject3;
                                                            for (int i192 = 0; i192 < tL_channels_channelParticipants.users.size(); i192++) {
                                                                TLRPC.User user = tL_channels_channelParticipants.users.get(i192);
                                                                MessagesController.getInstance(ui0Var3.f).putUser(user, false);
                                                                int indexOf = arrayList11.indexOf(Long.valueOf(user.id));
                                                                if (!user.self && indexOf >= 0) {
                                                                    arrayList12.add(new ti0(((Integer) arrayList13.get(indexOf)).intValue(), user));
                                                                }
                                                            }
                                                        }
                                                        jg0Var3.run();
                                                        break;
                                                    default:
                                                        TLObject tLObject4 = tLObject2;
                                                        if (tLObject4 != null) {
                                                            TLRPC.TL_messages_chatFull tL_messages_chatFull = (TLRPC.TL_messages_chatFull) tLObject4;
                                                            for (int i20 = 0; i20 < tL_messages_chatFull.users.size(); i20++) {
                                                                TLRPC.User user2 = tL_messages_chatFull.users.get(i20);
                                                                MessagesController.getInstance(ui0Var3.f).putUser(user2, false);
                                                                int indexOf2 = arrayList11.indexOf(Long.valueOf(user2.id));
                                                                if (!user2.self && indexOf2 >= 0) {
                                                                    arrayList12.add(new ti0(((Integer) arrayList13.get(indexOf2)).intValue(), user2));
                                                                }
                                                            }
                                                        }
                                                        jg0Var3.run();
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
            default:
                Pattern pattern = LaunchActivity.x1;
                AndroidUtilities.runOnUIThread(new lg(tLObject, (MessagesController) obj2, this.b, (jq) obj, 9));
                break;
        }
    }

    public /* synthetic */ f0(ih.f1 f1Var, int[] iArr, long j10) {
        this.a = 3;
        this.c = f1Var;
        this.d = iArr;
        this.b = j10;
    }

    public /* synthetic */ f0(Object obj, long j10, Object obj2, int i9) {
        this.a = i9;
        this.c = obj;
        this.b = j10;
        this.d = obj2;
    }
}
