package mg;

import ag.a3;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.messenger.d20;
import org.telegram.messenger.q20;
import org.telegram.messenger.us;
import org.telegram.messenger.voip.ConferenceCall;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.messenger.vp;
import org.telegram.messenger.w3;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.Components.gi0;
import org.telegram.ui.Components.li0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.qq;
import rh.c6;
import rh.e4;
import rh.e6;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class x implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ x(Object obj, long j10, Object obj2, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = j10;
        this.d = obj2;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.a;
        long j10 = this.b;
        int i11 = 0;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (i10) {
            case 0:
                vp vpVar = (vp) obj2;
                r1 r1Var = (r1) obj;
                if (tLObject instanceof TLRPC.TL_contacts_found) {
                    TLRPC.TL_contacts_found tL_contacts_found = (TLRPC.TL_contacts_found) tLObject;
                    vpVar.P3(tL_contacts_found.chats, false);
                    ArrayList arrayList = new ArrayList();
                    while (i11 < tL_contacts_found.chats.size()) {
                        TLRPC.Chat chat = tL_contacts_found.chats.get(i11);
                        TLRPC.InputPeer k12 = vp.k1(chat);
                        if (chat.id != j10 && w3.R(chat)) {
                            arrayList.add(k12);
                        }
                        i11++;
                    }
                    org.telegram.messenger.i0.g3(new k2.u(23, r1Var, arrayList));
                    break;
                }
                break;
            case 1:
                ((ConferenceCall) obj2).lambda$requestLastBlock$3(this.b, (Runnable) obj, tLObject, tL_error);
                break;
            case 2:
                final li0 li0Var = (li0) obj2;
                TLRPC.Chat chat2 = (TLRPC.Chat) obj;
                int i12 = li0Var.f;
                if (tLObject instanceof Vector) {
                    final ArrayList arrayList2 = new ArrayList();
                    final ArrayList arrayList3 = new ArrayList();
                    ArrayList<T> arrayList4 = ((Vector) tLObject).objects;
                    int size = arrayList4.size();
                    int i13 = 0;
                    while (i13 < size) {
                        Object obj3 = arrayList4.get(i13);
                        i13++;
                        if (obj3 instanceof Long) {
                            Long l4 = (Long) obj3;
                            if (j10 != l4.longValue()) {
                                arrayList2.add(l4);
                                arrayList3.add(0);
                            }
                        } else if (obj3 instanceof TLRPC.TL_readParticipantDate) {
                            TLRPC.TL_readParticipantDate tL_readParticipantDate = (TLRPC.TL_readParticipantDate) obj3;
                            long j11 = tL_readParticipantDate.user_id;
                            int i14 = tL_readParticipantDate.date;
                            if (j10 != j11) {
                                arrayList2.add(Long.valueOf(j11));
                                arrayList3.add(Integer.valueOf(i14));
                            }
                        }
                    }
                    arrayList2.add(Long.valueOf(j10));
                    arrayList3.add(0);
                    final ArrayList arrayList5 = new ArrayList();
                    final gi0 gi0Var = new gi0(i11, li0Var, arrayList5);
                    if (w3.T(chat2)) {
                        TLRPC.TL_channels_getParticipants tL_channels_getParticipants = new TLRPC.TL_channels_getParticipants();
                        tL_channels_getParticipants.limit = vp.r1(i12).p3;
                        tL_channels_getParticipants.offset = 0;
                        tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsRecent();
                        tL_channels_getParticipants.channel = vp.r1(i12).g1(chat2.id);
                        final int i15 = 0;
                        ConnectionsManager.getInstance(i12).sendRequest(tL_channels_getParticipants, new RequestDelegate() { // from class: org.telegram.ui.Components.hi0
                            @Override // org.telegram.tgnet.RequestDelegate
                            public final void run(final TLObject tLObject2, TLRPC.TL_error tL_error2) {
                                switch (i15) {
                                    case 0:
                                        final int i16 = 0;
                                        final li0 li0Var2 = li0Var;
                                        final ArrayList arrayList6 = arrayList2;
                                        final ArrayList arrayList7 = arrayList5;
                                        final ArrayList arrayList8 = arrayList3;
                                        final gi0 gi0Var2 = gi0Var;
                                        org.telegram.messenger.i0.g3(new Runnable() { // from class: org.telegram.ui.Components.ii0
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                switch (i16) {
                                                    case 0:
                                                        TLObject tLObject3 = tLObject2;
                                                        if (tLObject3 != null) {
                                                            TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject3;
                                                            for (int i17 = 0; i17 < tL_channels_channelParticipants.users.size(); i17++) {
                                                                TLRPC.User user = tL_channels_channelParticipants.users.get(i17);
                                                                org.telegram.messenger.vp.r1(li0Var2.f).U3(user, false, false);
                                                                int indexOf = arrayList6.indexOf(Long.valueOf(user.id));
                                                                if (!user.self && indexOf >= 0) {
                                                                    arrayList7.add(new ki0(((Integer) arrayList8.get(indexOf)).intValue(), user));
                                                                }
                                                            }
                                                        }
                                                        gi0Var2.run();
                                                        break;
                                                    default:
                                                        TLObject tLObject4 = tLObject2;
                                                        if (tLObject4 != null) {
                                                            TLRPC.TL_messages_chatFull tL_messages_chatFull = (TLRPC.TL_messages_chatFull) tLObject4;
                                                            for (int i18 = 0; i18 < tL_messages_chatFull.users.size(); i18++) {
                                                                TLRPC.User user2 = tL_messages_chatFull.users.get(i18);
                                                                org.telegram.messenger.vp.r1(li0Var2.f).U3(user2, false, false);
                                                                int indexOf2 = arrayList6.indexOf(Long.valueOf(user2.id));
                                                                if (!user2.self && indexOf2 >= 0) {
                                                                    arrayList7.add(new ki0(((Integer) arrayList8.get(indexOf2)).intValue(), user2));
                                                                }
                                                            }
                                                        }
                                                        gi0Var2.run();
                                                        break;
                                                }
                                            }
                                        });
                                        break;
                                    default:
                                        final int i17 = 1;
                                        final li0 li0Var3 = li0Var;
                                        final ArrayList arrayList9 = arrayList2;
                                        final ArrayList arrayList10 = arrayList5;
                                        final ArrayList arrayList11 = arrayList3;
                                        final gi0 gi0Var3 = gi0Var;
                                        org.telegram.messenger.i0.g3(new Runnable() { // from class: org.telegram.ui.Components.ii0
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                switch (i17) {
                                                    case 0:
                                                        TLObject tLObject3 = tLObject2;
                                                        if (tLObject3 != null) {
                                                            TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject3;
                                                            for (int i172 = 0; i172 < tL_channels_channelParticipants.users.size(); i172++) {
                                                                TLRPC.User user = tL_channels_channelParticipants.users.get(i172);
                                                                org.telegram.messenger.vp.r1(li0Var3.f).U3(user, false, false);
                                                                int indexOf = arrayList9.indexOf(Long.valueOf(user.id));
                                                                if (!user.self && indexOf >= 0) {
                                                                    arrayList10.add(new ki0(((Integer) arrayList11.get(indexOf)).intValue(), user));
                                                                }
                                                            }
                                                        }
                                                        gi0Var3.run();
                                                        break;
                                                    default:
                                                        TLObject tLObject4 = tLObject2;
                                                        if (tLObject4 != null) {
                                                            TLRPC.TL_messages_chatFull tL_messages_chatFull = (TLRPC.TL_messages_chatFull) tLObject4;
                                                            for (int i18 = 0; i18 < tL_messages_chatFull.users.size(); i18++) {
                                                                TLRPC.User user2 = tL_messages_chatFull.users.get(i18);
                                                                org.telegram.messenger.vp.r1(li0Var3.f).U3(user2, false, false);
                                                                int indexOf2 = arrayList9.indexOf(Long.valueOf(user2.id));
                                                                if (!user2.self && indexOf2 >= 0) {
                                                                    arrayList10.add(new ki0(((Integer) arrayList11.get(indexOf2)).intValue(), user2));
                                                                }
                                                            }
                                                        }
                                                        gi0Var3.run();
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
                        final int i16 = 1;
                        ConnectionsManager.getInstance(i12).sendRequest(tL_messages_getFullChat, new RequestDelegate() { // from class: org.telegram.ui.Components.hi0
                            @Override // org.telegram.tgnet.RequestDelegate
                            public final void run(final TLObject tLObject2, TLRPC.TL_error tL_error2) {
                                switch (i16) {
                                    case 0:
                                        final int i162 = 0;
                                        final li0 li0Var2 = li0Var;
                                        final ArrayList arrayList6 = arrayList2;
                                        final ArrayList arrayList7 = arrayList5;
                                        final ArrayList arrayList8 = arrayList3;
                                        final gi0 gi0Var2 = gi0Var;
                                        org.telegram.messenger.i0.g3(new Runnable() { // from class: org.telegram.ui.Components.ii0
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                switch (i162) {
                                                    case 0:
                                                        TLObject tLObject3 = tLObject2;
                                                        if (tLObject3 != null) {
                                                            TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject3;
                                                            for (int i172 = 0; i172 < tL_channels_channelParticipants.users.size(); i172++) {
                                                                TLRPC.User user = tL_channels_channelParticipants.users.get(i172);
                                                                org.telegram.messenger.vp.r1(li0Var2.f).U3(user, false, false);
                                                                int indexOf = arrayList6.indexOf(Long.valueOf(user.id));
                                                                if (!user.self && indexOf >= 0) {
                                                                    arrayList7.add(new ki0(((Integer) arrayList8.get(indexOf)).intValue(), user));
                                                                }
                                                            }
                                                        }
                                                        gi0Var2.run();
                                                        break;
                                                    default:
                                                        TLObject tLObject4 = tLObject2;
                                                        if (tLObject4 != null) {
                                                            TLRPC.TL_messages_chatFull tL_messages_chatFull = (TLRPC.TL_messages_chatFull) tLObject4;
                                                            for (int i18 = 0; i18 < tL_messages_chatFull.users.size(); i18++) {
                                                                TLRPC.User user2 = tL_messages_chatFull.users.get(i18);
                                                                org.telegram.messenger.vp.r1(li0Var2.f).U3(user2, false, false);
                                                                int indexOf2 = arrayList6.indexOf(Long.valueOf(user2.id));
                                                                if (!user2.self && indexOf2 >= 0) {
                                                                    arrayList7.add(new ki0(((Integer) arrayList8.get(indexOf2)).intValue(), user2));
                                                                }
                                                            }
                                                        }
                                                        gi0Var2.run();
                                                        break;
                                                }
                                            }
                                        });
                                        break;
                                    default:
                                        final int i17 = 1;
                                        final li0 li0Var3 = li0Var;
                                        final ArrayList arrayList9 = arrayList2;
                                        final ArrayList arrayList10 = arrayList5;
                                        final ArrayList arrayList11 = arrayList3;
                                        final gi0 gi0Var3 = gi0Var;
                                        org.telegram.messenger.i0.g3(new Runnable() { // from class: org.telegram.ui.Components.ii0
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                switch (i17) {
                                                    case 0:
                                                        TLObject tLObject3 = tLObject2;
                                                        if (tLObject3 != null) {
                                                            TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject3;
                                                            for (int i172 = 0; i172 < tL_channels_channelParticipants.users.size(); i172++) {
                                                                TLRPC.User user = tL_channels_channelParticipants.users.get(i172);
                                                                org.telegram.messenger.vp.r1(li0Var3.f).U3(user, false, false);
                                                                int indexOf = arrayList9.indexOf(Long.valueOf(user.id));
                                                                if (!user.self && indexOf >= 0) {
                                                                    arrayList10.add(new ki0(((Integer) arrayList11.get(indexOf)).intValue(), user));
                                                                }
                                                            }
                                                        }
                                                        gi0Var3.run();
                                                        break;
                                                    default:
                                                        TLObject tLObject4 = tLObject2;
                                                        if (tLObject4 != null) {
                                                            TLRPC.TL_messages_chatFull tL_messages_chatFull = (TLRPC.TL_messages_chatFull) tLObject4;
                                                            for (int i18 = 0; i18 < tL_messages_chatFull.users.size(); i18++) {
                                                                TLRPC.User user2 = tL_messages_chatFull.users.get(i18);
                                                                org.telegram.messenger.vp.r1(li0Var3.f).U3(user2, false, false);
                                                                int indexOf2 = arrayList9.indexOf(Long.valueOf(user2.id));
                                                                if (!user2.self && indexOf2 >= 0) {
                                                                    arrayList10.add(new ki0(((Integer) arrayList11.get(indexOf2)).intValue(), user2));
                                                                }
                                                            }
                                                        }
                                                        gi0Var3.run();
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
                Pattern pattern = LaunchActivity.D1;
                org.telegram.messenger.i0.g3(new a3(tLObject, (vp) obj2, this.b, (qq) obj, 9));
                break;
            case 4:
                org.telegram.messenger.i0.g3(new org.telegram.messenger.voip.g((e4) obj2, (gf.e) obj, tLObject, this.b, tL_error));
                break;
            case 5:
                org.telegram.messenger.i0.g3(new a3((e6) obj2, tLObject, this.b, (q20) obj, 22));
                break;
            case 6:
                c6 c6Var = (c6) obj;
                c6Var.getClass();
                org.telegram.messenger.i0.g3(new org.telegram.messenger.voip.g(c6Var, tLObject, (vp) obj2, tL_error, this.b));
                break;
            default:
                th.s0 s0Var = (th.s0) obj2;
                int[] iArr = (int[]) obj;
                int i17 = s0Var.e;
                if (tLObject instanceof TL_phone.groupParticipants) {
                    TL_phone.groupParticipants groupparticipants = (TL_phone.groupParticipants) tLObject;
                    vp.r1(i17).V3(groupparticipants.users, false);
                    vp.r1(i17).P3(groupparticipants.chats, false);
                    if (s0Var.E != null) {
                        d20.i(i17).e();
                        ArrayList arrayList6 = new ArrayList();
                        for (int i18 : iArr) {
                            ArrayList<TLRPC.GroupCallParticipant> arrayList7 = groupparticipants.participants;
                            int size2 = arrayList7.size();
                            int i19 = 0;
                            while (true) {
                                if (i19 < size2) {
                                    TLRPC.GroupCallParticipant groupCallParticipant = arrayList7.get(i19);
                                    i19++;
                                    TLRPC.GroupCallParticipant groupCallParticipant2 = groupCallParticipant;
                                    if (groupCallParticipant2.source == i18) {
                                        arrayList6.add(new VoIPService.RequestedParticipant(groupCallParticipant2, i18));
                                    }
                                }
                            }
                        }
                        s0Var.E.onMediaDescriptionAvailable(j10, (VoIPService.RequestedParticipant[]) arrayList6.toArray(new VoIPService.RequestedParticipant[0]));
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ x(us usVar, Object obj, long j10, int i10) {
        this.a = i10;
        this.c = usVar;
        this.d = obj;
        this.b = j10;
    }

    public /* synthetic */ x(c6 c6Var, vp vpVar, long j10) {
        this.a = 6;
        this.d = c6Var;
        this.c = vpVar;
        this.b = j10;
    }
}
