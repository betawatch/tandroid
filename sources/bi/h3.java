package bi;

import java.util.ArrayList;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.messenger.voip.ConferenceCall;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.Components.hh0;
import org.telegram.ui.Components.v80;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.rp;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final /* synthetic */ class h3 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ h3(Object obj, long j3, Object obj2, int i7) {
        this.a = i7;
        this.c = obj;
        this.b = j3;
        this.d = obj2;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i7 = this.a;
        long j3 = this.b;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (i7) {
            case 0:
                org.telegram.messenger.g0.h3(new i0((k7) obj2, (vf.b) obj, tLObject, this.b, tL_error, 1));
                break;
            case 1:
                org.telegram.messenger.g0.h3(new w2((ea) obj2, (Object) tLObject, this.b, obj, 7));
                break;
            case 2:
                ca caVar = (ca) obj2;
                caVar.getClass();
                org.telegram.messenger.g0.h3(new i0(caVar, tLObject, (qp) obj, tL_error, this.b));
                break;
            case 3:
                di.g1 g1Var = (di.g1) obj2;
                int[] iArr = (int[]) obj;
                int i10 = g1Var.e;
                if (tLObject instanceof TL_phone.groupParticipants) {
                    TL_phone.groupParticipants groupparticipants = (TL_phone.groupParticipants) tLObject;
                    qp.s1(i10).Y3(groupparticipants.users, false);
                    qp.s1(i10).S3(groupparticipants.chats, false);
                    if (g1Var.E != null) {
                        p10.i(i10).e();
                        ArrayList arrayList = new ArrayList();
                        for (int i11 : iArr) {
                            ArrayList<TLRPC.GroupCallParticipant> arrayList2 = groupparticipants.participants;
                            int size = arrayList2.size();
                            int i12 = 0;
                            while (true) {
                                if (i12 < size) {
                                    TLRPC.GroupCallParticipant groupCallParticipant = arrayList2.get(i12);
                                    i12++;
                                    TLRPC.GroupCallParticipant groupCallParticipant2 = groupCallParticipant;
                                    if (groupCallParticipant2.source == i11) {
                                        arrayList.add(new VoIPService.RequestedParticipant(groupCallParticipant2, i11));
                                    }
                                }
                            }
                        }
                        g1Var.E.onMediaDescriptionAvailable(j3, (VoIPService.RequestedParticipant[]) arrayList.toArray(new VoIPService.RequestedParticipant[0]));
                        break;
                    }
                }
                break;
            case 4:
                ((ConferenceCall) obj2).lambda$requestLastBlock$3(this.b, (Runnable) obj, tLObject, tL_error);
                break;
            case 5:
                final hh0 hh0Var = (hh0) obj2;
                TLRPC.Chat chat = (TLRPC.Chat) obj;
                int i13 = hh0Var.f;
                if (tLObject instanceof Vector) {
                    final ArrayList arrayList3 = new ArrayList();
                    final ArrayList arrayList4 = new ArrayList();
                    ArrayList<T> arrayList5 = ((Vector) tLObject).objects;
                    int size2 = arrayList5.size();
                    int i14 = 0;
                    while (i14 < size2) {
                        Object obj3 = arrayList5.get(i14);
                        i14++;
                        if (obj3 instanceof Long) {
                            Long l10 = (Long) obj3;
                            if (j3 != l10.longValue()) {
                                arrayList3.add(l10);
                                arrayList4.add(0);
                            }
                        } else if (obj3 instanceof TLRPC.TL_readParticipantDate) {
                            TLRPC.TL_readParticipantDate tL_readParticipantDate = (TLRPC.TL_readParticipantDate) obj3;
                            long j10 = tL_readParticipantDate.user_id;
                            int i15 = tL_readParticipantDate.date;
                            if (j3 != j10) {
                                arrayList3.add(Long.valueOf(j10));
                                arrayList4.add(Integer.valueOf(i15));
                            }
                        }
                    }
                    arrayList3.add(Long.valueOf(j3));
                    arrayList4.add(0);
                    final ArrayList arrayList6 = new ArrayList();
                    final v80 v80Var = new v80(6, hh0Var, arrayList6);
                    if (org.telegram.messenger.t3.T(chat)) {
                        TLRPC.TL_channels_getParticipants tL_channels_getParticipants = new TLRPC.TL_channels_getParticipants();
                        tL_channels_getParticipants.limit = qp.s1(i13).p3;
                        tL_channels_getParticipants.offset = 0;
                        tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsRecent();
                        tL_channels_getParticipants.channel = qp.s1(i13).h1(chat.id);
                        final int i16 = 0;
                        ConnectionsManager.getInstance(i13).sendRequest(tL_channels_getParticipants, new RequestDelegate() { // from class: org.telegram.ui.Components.eh0
                            @Override // org.telegram.tgnet.RequestDelegate
                            public final void run(final TLObject tLObject2, TLRPC.TL_error tL_error2) {
                                switch (i16) {
                                    case 0:
                                        final int i17 = 0;
                                        final hh0 hh0Var2 = hh0Var;
                                        final ArrayList arrayList7 = arrayList3;
                                        final ArrayList arrayList8 = arrayList6;
                                        final ArrayList arrayList9 = arrayList4;
                                        final v80 v80Var2 = v80Var;
                                        org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.Components.fh0
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                switch (i17) {
                                                    case 0:
                                                        TLObject tLObject3 = tLObject2;
                                                        if (tLObject3 != null) {
                                                            TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject3;
                                                            for (int i18 = 0; i18 < tL_channels_channelParticipants.users.size(); i18++) {
                                                                TLRPC.User user = tL_channels_channelParticipants.users.get(i18);
                                                                org.telegram.messenger.qp.s1(hh0Var2.f).X3(user, false, false);
                                                                int indexOf = arrayList7.indexOf(Long.valueOf(user.id));
                                                                if (!user.self && indexOf >= 0) {
                                                                    arrayList8.add(new gh0(((Integer) arrayList9.get(indexOf)).intValue(), user));
                                                                }
                                                            }
                                                        }
                                                        v80Var2.run();
                                                        break;
                                                    default:
                                                        TLObject tLObject4 = tLObject2;
                                                        if (tLObject4 != null) {
                                                            TLRPC.TL_messages_chatFull tL_messages_chatFull = (TLRPC.TL_messages_chatFull) tLObject4;
                                                            for (int i19 = 0; i19 < tL_messages_chatFull.users.size(); i19++) {
                                                                TLRPC.User user2 = tL_messages_chatFull.users.get(i19);
                                                                org.telegram.messenger.qp.s1(hh0Var2.f).X3(user2, false, false);
                                                                int indexOf2 = arrayList7.indexOf(Long.valueOf(user2.id));
                                                                if (!user2.self && indexOf2 >= 0) {
                                                                    arrayList8.add(new gh0(((Integer) arrayList9.get(indexOf2)).intValue(), user2));
                                                                }
                                                            }
                                                        }
                                                        v80Var2.run();
                                                        break;
                                                }
                                            }
                                        });
                                        break;
                                    default:
                                        final int i18 = 1;
                                        final hh0 hh0Var3 = hh0Var;
                                        final ArrayList arrayList10 = arrayList3;
                                        final ArrayList arrayList11 = arrayList6;
                                        final ArrayList arrayList12 = arrayList4;
                                        final v80 v80Var3 = v80Var;
                                        org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.Components.fh0
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                switch (i18) {
                                                    case 0:
                                                        TLObject tLObject3 = tLObject2;
                                                        if (tLObject3 != null) {
                                                            TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject3;
                                                            for (int i182 = 0; i182 < tL_channels_channelParticipants.users.size(); i182++) {
                                                                TLRPC.User user = tL_channels_channelParticipants.users.get(i182);
                                                                org.telegram.messenger.qp.s1(hh0Var3.f).X3(user, false, false);
                                                                int indexOf = arrayList10.indexOf(Long.valueOf(user.id));
                                                                if (!user.self && indexOf >= 0) {
                                                                    arrayList11.add(new gh0(((Integer) arrayList12.get(indexOf)).intValue(), user));
                                                                }
                                                            }
                                                        }
                                                        v80Var3.run();
                                                        break;
                                                    default:
                                                        TLObject tLObject4 = tLObject2;
                                                        if (tLObject4 != null) {
                                                            TLRPC.TL_messages_chatFull tL_messages_chatFull = (TLRPC.TL_messages_chatFull) tLObject4;
                                                            for (int i19 = 0; i19 < tL_messages_chatFull.users.size(); i19++) {
                                                                TLRPC.User user2 = tL_messages_chatFull.users.get(i19);
                                                                org.telegram.messenger.qp.s1(hh0Var3.f).X3(user2, false, false);
                                                                int indexOf2 = arrayList10.indexOf(Long.valueOf(user2.id));
                                                                if (!user2.self && indexOf2 >= 0) {
                                                                    arrayList11.add(new gh0(((Integer) arrayList12.get(indexOf2)).intValue(), user2));
                                                                }
                                                            }
                                                        }
                                                        v80Var3.run();
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
                        final int i17 = 1;
                        ConnectionsManager.getInstance(i13).sendRequest(tL_messages_getFullChat, new RequestDelegate() { // from class: org.telegram.ui.Components.eh0
                            @Override // org.telegram.tgnet.RequestDelegate
                            public final void run(final TLObject tLObject2, TLRPC.TL_error tL_error2) {
                                switch (i17) {
                                    case 0:
                                        final int i172 = 0;
                                        final hh0 hh0Var2 = hh0Var;
                                        final ArrayList arrayList7 = arrayList3;
                                        final ArrayList arrayList8 = arrayList6;
                                        final ArrayList arrayList9 = arrayList4;
                                        final v80 v80Var2 = v80Var;
                                        org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.Components.fh0
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                switch (i172) {
                                                    case 0:
                                                        TLObject tLObject3 = tLObject2;
                                                        if (tLObject3 != null) {
                                                            TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject3;
                                                            for (int i182 = 0; i182 < tL_channels_channelParticipants.users.size(); i182++) {
                                                                TLRPC.User user = tL_channels_channelParticipants.users.get(i182);
                                                                org.telegram.messenger.qp.s1(hh0Var2.f).X3(user, false, false);
                                                                int indexOf = arrayList7.indexOf(Long.valueOf(user.id));
                                                                if (!user.self && indexOf >= 0) {
                                                                    arrayList8.add(new gh0(((Integer) arrayList9.get(indexOf)).intValue(), user));
                                                                }
                                                            }
                                                        }
                                                        v80Var2.run();
                                                        break;
                                                    default:
                                                        TLObject tLObject4 = tLObject2;
                                                        if (tLObject4 != null) {
                                                            TLRPC.TL_messages_chatFull tL_messages_chatFull = (TLRPC.TL_messages_chatFull) tLObject4;
                                                            for (int i19 = 0; i19 < tL_messages_chatFull.users.size(); i19++) {
                                                                TLRPC.User user2 = tL_messages_chatFull.users.get(i19);
                                                                org.telegram.messenger.qp.s1(hh0Var2.f).X3(user2, false, false);
                                                                int indexOf2 = arrayList7.indexOf(Long.valueOf(user2.id));
                                                                if (!user2.self && indexOf2 >= 0) {
                                                                    arrayList8.add(new gh0(((Integer) arrayList9.get(indexOf2)).intValue(), user2));
                                                                }
                                                            }
                                                        }
                                                        v80Var2.run();
                                                        break;
                                                }
                                            }
                                        });
                                        break;
                                    default:
                                        final int i18 = 1;
                                        final hh0 hh0Var3 = hh0Var;
                                        final ArrayList arrayList10 = arrayList3;
                                        final ArrayList arrayList11 = arrayList6;
                                        final ArrayList arrayList12 = arrayList4;
                                        final v80 v80Var3 = v80Var;
                                        org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.Components.fh0
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                switch (i18) {
                                                    case 0:
                                                        TLObject tLObject3 = tLObject2;
                                                        if (tLObject3 != null) {
                                                            TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject3;
                                                            for (int i182 = 0; i182 < tL_channels_channelParticipants.users.size(); i182++) {
                                                                TLRPC.User user = tL_channels_channelParticipants.users.get(i182);
                                                                org.telegram.messenger.qp.s1(hh0Var3.f).X3(user, false, false);
                                                                int indexOf = arrayList10.indexOf(Long.valueOf(user.id));
                                                                if (!user.self && indexOf >= 0) {
                                                                    arrayList11.add(new gh0(((Integer) arrayList12.get(indexOf)).intValue(), user));
                                                                }
                                                            }
                                                        }
                                                        v80Var3.run();
                                                        break;
                                                    default:
                                                        TLObject tLObject4 = tLObject2;
                                                        if (tLObject4 != null) {
                                                            TLRPC.TL_messages_chatFull tL_messages_chatFull = (TLRPC.TL_messages_chatFull) tLObject4;
                                                            for (int i19 = 0; i19 < tL_messages_chatFull.users.size(); i19++) {
                                                                TLRPC.User user2 = tL_messages_chatFull.users.get(i19);
                                                                org.telegram.messenger.qp.s1(hh0Var3.f).X3(user2, false, false);
                                                                int indexOf2 = arrayList10.indexOf(Long.valueOf(user2.id));
                                                                if (!user2.self && indexOf2 >= 0) {
                                                                    arrayList11.add(new gh0(((Integer) arrayList12.get(indexOf2)).intValue(), user2));
                                                                }
                                                            }
                                                        }
                                                        v80Var3.run();
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
            case 6:
                String str = LaunchActivity.B1;
                org.telegram.messenger.g0.h3(new w2(tLObject, (qp) obj2, this.b, (rp) obj, 21));
                break;
            default:
                qp qpVar = (qp) obj2;
                wg.t0 t0Var = (wg.t0) obj;
                if (tLObject instanceof TLRPC.TL_contacts_found) {
                    TLRPC.TL_contacts_found tL_contacts_found = (TLRPC.TL_contacts_found) tLObject;
                    qpVar.S3(tL_contacts_found.chats, false);
                    ArrayList arrayList7 = new ArrayList();
                    for (int i18 = 0; i18 < tL_contacts_found.chats.size(); i18++) {
                        TLRPC.Chat chat2 = tL_contacts_found.chats.get(i18);
                        TLRPC.InputPeer l1 = qp.l1(chat2);
                        if (chat2.id != j3 && org.telegram.messenger.t3.R(chat2)) {
                            arrayList7.add(l1);
                        }
                    }
                    org.telegram.messenger.g0.h3(new ti.p(20, t0Var, arrayList7));
                    break;
                }
                break;
        }
    }

    public /* synthetic */ h3(Object obj, Object obj2, long j3, int i7) {
        this.a = i7;
        this.c = obj;
        this.d = obj2;
        this.b = j3;
    }
}
