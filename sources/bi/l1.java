package bi;

import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.voip.ConferenceCall;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.Components.fj0;
import org.telegram.ui.Components.i21;
import org.telegram.ui.Components.zu;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.yq;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes4.dex */
public final /* synthetic */ class l1 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ l1(Object obj, long j3, Object obj2, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = j3;
        this.d = obj2;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        long j3;
        int i10 = this.a;
        int i11 = 29;
        long j10 = this.b;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (i10) {
            case 0:
                t1 t1Var = (t1) obj2;
                int[] iArr = (int[]) obj;
                int i12 = t1Var.e;
                if (tLObject instanceof TL_phone.groupParticipants) {
                    TL_phone.groupParticipants groupparticipants = (TL_phone.groupParticipants) tLObject;
                    MessagesController.getInstance(i12).putUsers(groupparticipants.users, false);
                    MessagesController.getInstance(i12).putChats(groupparticipants.chats, false);
                    if (t1Var.E != null) {
                        UserConfig.getInstance(i12).getClientUserId();
                        ArrayList arrayList = new ArrayList();
                        for (int i13 : iArr) {
                            ArrayList<TLRPC.GroupCallParticipant> arrayList2 = groupparticipants.participants;
                            int size = arrayList2.size();
                            int i14 = 0;
                            while (true) {
                                if (i14 < size) {
                                    TLRPC.GroupCallParticipant groupCallParticipant = arrayList2.get(i14);
                                    i14++;
                                    TLRPC.GroupCallParticipant groupCallParticipant2 = groupCallParticipant;
                                    if (groupCallParticipant2.source == i13) {
                                        arrayList.add(new VoIPService.RequestedParticipant(groupCallParticipant2, i13));
                                    }
                                }
                            }
                        }
                        t1Var.E.onMediaDescriptionAvailable(j10, (VoIPService.RequestedParticipant[]) arrayList.toArray(new VoIPService.RequestedParticipant[0]));
                        break;
                    }
                }
                break;
            case 1:
                ((ConferenceCall) obj2).lambda$requestLastBlock$3(this.b, (Runnable) obj, tLObject, tL_error);
                break;
            case 2:
                final fj0 fj0Var = (fj0) obj2;
                TLRPC.Chat chat = (TLRPC.Chat) obj;
                int i15 = fj0Var.f;
                if (tLObject instanceof Vector) {
                    final ArrayList arrayList3 = new ArrayList();
                    final ArrayList arrayList4 = new ArrayList();
                    ArrayList<T> arrayList5 = ((Vector) tLObject).objects;
                    int size2 = arrayList5.size();
                    int i16 = 0;
                    while (i16 < size2) {
                        Object obj3 = arrayList5.get(i16);
                        i16++;
                        if (obj3 instanceof Long) {
                            Long l4 = (Long) obj3;
                            if (j10 != l4.longValue()) {
                                arrayList3.add(l4);
                                arrayList4.add(0);
                            }
                        } else if (obj3 instanceof TLRPC.TL_readParticipantDate) {
                            TLRPC.TL_readParticipantDate tL_readParticipantDate = (TLRPC.TL_readParticipantDate) obj3;
                            j3 = j10;
                            long j11 = tL_readParticipantDate.user_id;
                            int i17 = tL_readParticipantDate.date;
                            if (j3 != j11) {
                                arrayList3.add(Long.valueOf(j11));
                                arrayList4.add(Integer.valueOf(i17));
                            }
                            j10 = j3;
                        }
                        j3 = j10;
                        j10 = j3;
                    }
                    arrayList3.add(Long.valueOf(j10));
                    arrayList4.add(0);
                    final ArrayList arrayList6 = new ArrayList();
                    final zu zuVar = new zu(i11, fj0Var, arrayList6);
                    if (ChatObject.isChannel(chat)) {
                        TLRPC.TL_channels_getParticipants tL_channels_getParticipants = new TLRPC.TL_channels_getParticipants();
                        tL_channels_getParticipants.limit = MessagesController.getInstance(i15).chatReadMarkSizeThreshold;
                        tL_channels_getParticipants.offset = 0;
                        tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsRecent();
                        tL_channels_getParticipants.channel = MessagesController.getInstance(i15).getInputChannel(chat.id);
                        final int i18 = 0;
                        ConnectionsManager.getInstance(i15).sendRequest(tL_channels_getParticipants, new RequestDelegate() { // from class: org.telegram.ui.Components.cj0
                            @Override // org.telegram.tgnet.RequestDelegate
                            public final void run(final TLObject tLObject2, TLRPC.TL_error tL_error2) {
                                switch (i18) {
                                    case 0:
                                        final int i19 = 0;
                                        final fj0 fj0Var2 = fj0Var;
                                        final ArrayList arrayList7 = arrayList3;
                                        final ArrayList arrayList8 = arrayList6;
                                        final ArrayList arrayList9 = arrayList4;
                                        final zu zuVar2 = zuVar;
                                        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Components.dj0
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                switch (i19) {
                                                    case 0:
                                                        TLObject tLObject3 = tLObject2;
                                                        if (tLObject3 != null) {
                                                            TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject3;
                                                            for (int i20 = 0; i20 < tL_channels_channelParticipants.users.size(); i20++) {
                                                                TLRPC.User user = tL_channels_channelParticipants.users.get(i20);
                                                                MessagesController.getInstance(fj0Var2.f).putUser(user, false);
                                                                int indexOf = arrayList7.indexOf(Long.valueOf(user.id));
                                                                if (!user.self && indexOf >= 0) {
                                                                    arrayList8.add(new ej0(((Integer) arrayList9.get(indexOf)).intValue(), user));
                                                                }
                                                            }
                                                        }
                                                        zuVar2.run();
                                                        break;
                                                    default:
                                                        TLObject tLObject4 = tLObject2;
                                                        if (tLObject4 != null) {
                                                            TLRPC.TL_messages_chatFull tL_messages_chatFull = (TLRPC.TL_messages_chatFull) tLObject4;
                                                            for (int i21 = 0; i21 < tL_messages_chatFull.users.size(); i21++) {
                                                                TLRPC.User user2 = tL_messages_chatFull.users.get(i21);
                                                                MessagesController.getInstance(fj0Var2.f).putUser(user2, false);
                                                                int indexOf2 = arrayList7.indexOf(Long.valueOf(user2.id));
                                                                if (!user2.self && indexOf2 >= 0) {
                                                                    arrayList8.add(new ej0(((Integer) arrayList9.get(indexOf2)).intValue(), user2));
                                                                }
                                                            }
                                                        }
                                                        zuVar2.run();
                                                        break;
                                                }
                                            }
                                        });
                                        break;
                                    default:
                                        final int i20 = 1;
                                        final fj0 fj0Var3 = fj0Var;
                                        final ArrayList arrayList10 = arrayList3;
                                        final ArrayList arrayList11 = arrayList6;
                                        final ArrayList arrayList12 = arrayList4;
                                        final zu zuVar3 = zuVar;
                                        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Components.dj0
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                switch (i20) {
                                                    case 0:
                                                        TLObject tLObject3 = tLObject2;
                                                        if (tLObject3 != null) {
                                                            TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject3;
                                                            for (int i202 = 0; i202 < tL_channels_channelParticipants.users.size(); i202++) {
                                                                TLRPC.User user = tL_channels_channelParticipants.users.get(i202);
                                                                MessagesController.getInstance(fj0Var3.f).putUser(user, false);
                                                                int indexOf = arrayList10.indexOf(Long.valueOf(user.id));
                                                                if (!user.self && indexOf >= 0) {
                                                                    arrayList11.add(new ej0(((Integer) arrayList12.get(indexOf)).intValue(), user));
                                                                }
                                                            }
                                                        }
                                                        zuVar3.run();
                                                        break;
                                                    default:
                                                        TLObject tLObject4 = tLObject2;
                                                        if (tLObject4 != null) {
                                                            TLRPC.TL_messages_chatFull tL_messages_chatFull = (TLRPC.TL_messages_chatFull) tLObject4;
                                                            for (int i21 = 0; i21 < tL_messages_chatFull.users.size(); i21++) {
                                                                TLRPC.User user2 = tL_messages_chatFull.users.get(i21);
                                                                MessagesController.getInstance(fj0Var3.f).putUser(user2, false);
                                                                int indexOf2 = arrayList10.indexOf(Long.valueOf(user2.id));
                                                                if (!user2.self && indexOf2 >= 0) {
                                                                    arrayList11.add(new ej0(((Integer) arrayList12.get(indexOf2)).intValue(), user2));
                                                                }
                                                            }
                                                        }
                                                        zuVar3.run();
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
                        tL_messages_getFullChat.chat_id = chat.id;
                        final int i19 = 1;
                        ConnectionsManager.getInstance(i15).sendRequest(tL_messages_getFullChat, new RequestDelegate() { // from class: org.telegram.ui.Components.cj0
                            @Override // org.telegram.tgnet.RequestDelegate
                            public final void run(final TLObject tLObject2, TLRPC.TL_error tL_error2) {
                                switch (i19) {
                                    case 0:
                                        final int i192 = 0;
                                        final fj0 fj0Var2 = fj0Var;
                                        final ArrayList arrayList7 = arrayList3;
                                        final ArrayList arrayList8 = arrayList6;
                                        final ArrayList arrayList9 = arrayList4;
                                        final zu zuVar2 = zuVar;
                                        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Components.dj0
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                switch (i192) {
                                                    case 0:
                                                        TLObject tLObject3 = tLObject2;
                                                        if (tLObject3 != null) {
                                                            TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject3;
                                                            for (int i202 = 0; i202 < tL_channels_channelParticipants.users.size(); i202++) {
                                                                TLRPC.User user = tL_channels_channelParticipants.users.get(i202);
                                                                MessagesController.getInstance(fj0Var2.f).putUser(user, false);
                                                                int indexOf = arrayList7.indexOf(Long.valueOf(user.id));
                                                                if (!user.self && indexOf >= 0) {
                                                                    arrayList8.add(new ej0(((Integer) arrayList9.get(indexOf)).intValue(), user));
                                                                }
                                                            }
                                                        }
                                                        zuVar2.run();
                                                        break;
                                                    default:
                                                        TLObject tLObject4 = tLObject2;
                                                        if (tLObject4 != null) {
                                                            TLRPC.TL_messages_chatFull tL_messages_chatFull = (TLRPC.TL_messages_chatFull) tLObject4;
                                                            for (int i21 = 0; i21 < tL_messages_chatFull.users.size(); i21++) {
                                                                TLRPC.User user2 = tL_messages_chatFull.users.get(i21);
                                                                MessagesController.getInstance(fj0Var2.f).putUser(user2, false);
                                                                int indexOf2 = arrayList7.indexOf(Long.valueOf(user2.id));
                                                                if (!user2.self && indexOf2 >= 0) {
                                                                    arrayList8.add(new ej0(((Integer) arrayList9.get(indexOf2)).intValue(), user2));
                                                                }
                                                            }
                                                        }
                                                        zuVar2.run();
                                                        break;
                                                }
                                            }
                                        });
                                        break;
                                    default:
                                        final int i20 = 1;
                                        final fj0 fj0Var3 = fj0Var;
                                        final ArrayList arrayList10 = arrayList3;
                                        final ArrayList arrayList11 = arrayList6;
                                        final ArrayList arrayList12 = arrayList4;
                                        final zu zuVar3 = zuVar;
                                        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Components.dj0
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                switch (i20) {
                                                    case 0:
                                                        TLObject tLObject3 = tLObject2;
                                                        if (tLObject3 != null) {
                                                            TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject3;
                                                            for (int i202 = 0; i202 < tL_channels_channelParticipants.users.size(); i202++) {
                                                                TLRPC.User user = tL_channels_channelParticipants.users.get(i202);
                                                                MessagesController.getInstance(fj0Var3.f).putUser(user, false);
                                                                int indexOf = arrayList10.indexOf(Long.valueOf(user.id));
                                                                if (!user.self && indexOf >= 0) {
                                                                    arrayList11.add(new ej0(((Integer) arrayList12.get(indexOf)).intValue(), user));
                                                                }
                                                            }
                                                        }
                                                        zuVar3.run();
                                                        break;
                                                    default:
                                                        TLObject tLObject4 = tLObject2;
                                                        if (tLObject4 != null) {
                                                            TLRPC.TL_messages_chatFull tL_messages_chatFull = (TLRPC.TL_messages_chatFull) tLObject4;
                                                            for (int i21 = 0; i21 < tL_messages_chatFull.users.size(); i21++) {
                                                                TLRPC.User user2 = tL_messages_chatFull.users.get(i21);
                                                                MessagesController.getInstance(fj0Var3.f).putUser(user2, false);
                                                                int indexOf2 = arrayList10.indexOf(Long.valueOf(user2.id));
                                                                if (!user2.self && indexOf2 >= 0) {
                                                                    arrayList11.add(new ej0(((Integer) arrayList12.get(indexOf2)).intValue(), user2));
                                                                }
                                                            }
                                                        }
                                                        zuVar3.run();
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
            case 3:
                Pattern pattern = LaunchActivity.B1;
                AndroidUtilities.runOnUIThread(new i21(tLObject, (MessagesController) obj2, this.b, (yq) obj, 3));
                break;
            case 4:
                MessagesController messagesController = (MessagesController) obj2;
                ug.x0 x0Var = (ug.x0) obj;
                if (tLObject instanceof TLRPC.TL_contacts_found) {
                    TLRPC.TL_contacts_found tL_contacts_found = (TLRPC.TL_contacts_found) tLObject;
                    messagesController.putChats(tL_contacts_found.chats, false);
                    ArrayList arrayList7 = new ArrayList();
                    for (int i20 = 0; i20 < tL_contacts_found.chats.size(); i20++) {
                        TLRPC.Chat chat2 = tL_contacts_found.chats.get(i20);
                        TLRPC.InputPeer inputPeer = MessagesController.getInputPeer(chat2);
                        if (chat2.id != j10 && ChatObject.isBoostSupported(chat2)) {
                            arrayList7.add(inputPeer);
                        }
                    }
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.web.g1(i11, x0Var, arrayList7));
                    break;
                }
                break;
            case 5:
                AndroidUtilities.runOnUIThread(new i21((zh.s5) obj2, tLObject, this.b, (Utilities.Callback) obj, 10));
                break;
            default:
                zh.r5 r5Var = (zh.r5) obj2;
                r5Var.getClass();
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.voip.f(r5Var, tLObject, (MessagesController) obj, tL_error, this.b));
                break;
        }
    }

    public /* synthetic */ l1(Object obj, Object obj2, long j3, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.b = j3;
    }
}
