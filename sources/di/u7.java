package di;

import android.content.Context;
import android.util.Pair;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.cz;
import org.telegram.messenger.ez;
import org.telegram.messenger.gj;
import org.telegram.messenger.h00;
import org.telegram.messenger.np;
import org.telegram.messenger.ns;
import org.telegram.messenger.vr;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.Components.x11;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.an;
import org.telegram.ui.jf0;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class u7 implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;

    public /* synthetic */ u7(int i7, long j3, Context context, TL_payments.connectedBotStarRef connectedbotstarref, org.telegram.ui.ActionBar.u2 u2Var, org.telegram.ui.ActionBar.e6 e6Var) {
        this.b = i7;
        this.d = context;
        this.c = j3;
        this.e = connectedbotstarref;
        this.f = u2Var;
        this.h = e6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Vector vector;
        int i7;
        long j3;
        TLRPC.GroupCall groupCall = null;
        int i10 = 1;
        switch (this.a) {
            case 0:
                ((a1.c) this.d).m((ArrayList) this.e, Integer.valueOf(this.b), Long.valueOf(this.c), (ArrayList) this.f, (ArrayList) this.h);
                break;
            case 1:
                int i11 = this.b;
                Context context = (Context) this.d;
                long j10 = this.c;
                TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) this.e;
                e0.g(i11).f(context, j10, connectedbotstarref.bot_id, new ki.c3(i11, j10, context, connectedbotstarref, (org.telegram.ui.ActionBar.u2) this.f, (org.telegram.ui.ActionBar.e6) this.h));
                break;
            case 2:
                h00 h00Var = (h00) this.d;
                TLRPC.TL_messages_forumTopics tL_messages_forumTopics = (TLRPC.TL_messages_forumTopics) this.e;
                long j11 = this.c;
                TLRPC.TL_messages_forumTopics tL_messages_forumTopics2 = (TLRPC.TL_messages_forumTopics) this.f;
                a0.h hVar = (a0.h) this.h;
                int i12 = this.b;
                h00Var.getMessagesStorage().m1(tL_messages_forumTopics.users, tL_messages_forumTopics.chats, true, true);
                h00Var.getMessagesController().Y3(tL_messages_forumTopics.users, false);
                h00Var.getMessagesController().S3(tL_messages_forumTopics.chats, false);
                h00Var.c.put(j11, 0);
                h00Var.u(j11, tL_messages_forumTopics2.topics, hVar, false, i12, tL_messages_forumTopics.count);
                h00Var.y(j11, true);
                h00Var.getMessagesStorage().C1(h00Var.getConnectionsManager().getCurrentTime(), -j11, (List) h00Var.a.f(j11), true);
                h00Var.getMessagesStorage().j1(tL_messages_forumTopics2.messages, false, true, false, 0, false, 0, 0L);
                if (tL_messages_forumTopics2.topics.isEmpty() || i12 != 1) {
                    if (h00Var.l(j11) == null || h00Var.l(j11).size() < tL_messages_forumTopics2.count) {
                        h00Var.h.l(j11);
                        h00Var.o(j11);
                        break;
                    }
                } else {
                    TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) i5.c.h(1, tL_messages_forumTopics2.topics);
                    TLRPC.Message message = (TLRPC.Message) hVar.f(tL_forumTopic.top_message);
                    h00Var.x(j11, tL_forumTopic.id, tL_forumTopic.top_message, message != null ? message.date : 0);
                    break;
                }
                break;
            case 3:
                org.telegram.ui.Cells.d6.a((org.telegram.ui.Cells.d6) this.d, (TLObject) this.f, (vr) this.h, this.c, this.b, (ArrayList) this.e);
                break;
            case 4:
                TLObject tLObject = (TLObject) this.d;
                int i13 = this.b;
                hi.d dVar = (hi.d) this.e;
                org.telegram.ui.ActionBar.u2 u2Var = (org.telegram.ui.ActionBar.u2) this.f;
                long j12 = this.c;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.h;
                if (tLObject instanceof TLRPC.Updates) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                    np.s1(i13).Y3(updates.users, false);
                    np.s1(i13).S3(updates.chats, false);
                    ArrayList y02 = np.y0(updates, TL_update.TL_updateGroupCall.class);
                    int size = y02.size();
                    int i14 = 0;
                    while (i14 < size) {
                        Object obj = y02.get(i14);
                        i14++;
                        groupCall = ((TL_update.TL_updateGroupCall) obj).call;
                    }
                    Utilities.d.c(new org.telegram.tgnet.g(i13, updates, i10));
                    if (groupCall != null && LaunchActivity.H1 != null) {
                        u2Var.dismiss();
                        ez.C(i13).r0(cz.a(j12, groupCall.invite_link));
                        org.telegram.ui.ActionBar.e2 T = LaunchActivity.T();
                        if (T != null) {
                            if (T instanceof an) {
                                an anVar = (an) T;
                                if (anVar.a() == j12 && anVar.g4 == 0) {
                                }
                            }
                            T.presentFragment(an.ua(j12));
                            break;
                        }
                    } else {
                        dVar.setLoading(false);
                        break;
                    }
                } else if (tLObject instanceof TL_phone.groupCall) {
                    TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject;
                    np.s1(i13).Y3(groupcall.users, false);
                    np.s1(i13).S3(groupcall.chats, false);
                    if (LaunchActivity.H1 == null) {
                        dVar.setLoading(false);
                        break;
                    } else {
                        TLRPC.TL_inputGroupCall tL_inputGroupCall = new TLRPC.TL_inputGroupCall();
                        TLRPC.GroupCall groupCall2 = groupcall.call;
                        tL_inputGroupCall.id = groupCall2.id;
                        tL_inputGroupCall.access_hash = groupCall2.access_hash;
                        u2Var.dismiss();
                        org.telegram.ui.Components.voip.c2.g(LaunchActivity.H1, i13, tL_inputGroupCall, false, groupcall.call, null);
                        ez.C(i13).r0(cz.a(j12, groupcall.call.invite_link));
                        break;
                    }
                } else if (tL_error != null) {
                    org.telegram.ui.Cells.y0.q(u2Var.F, null, tL_error, false);
                    break;
                }
                break;
            case 5:
                gj gjVar = (gj) this.d;
                TLRPC.Message message2 = (TLRPC.Message) this.e;
                String str = (String) this.f;
                int[] iArr = (int[]) this.h;
                int i15 = this.b;
                long j13 = this.c;
                HashMap hashMap = x11.P;
                if (hashMap != null) {
                    hashMap.remove(Integer.valueOf(x11.p(gjVar)));
                }
                message2.voiceTranscription = str;
                if (iArr.length <= 0) {
                    iArr = null;
                }
                message2.voiceTranscriptionWords = iArr;
                message2.voiceTranscriptionLocal = true;
                message2.voiceTranscriptionFinal = true;
                message2.voiceTranscriptionOpen = true;
                message2.voiceTranscriptionId = 0L;
                x11.o(gjVar);
                vr a02 = vr.a0(i15);
                a02.a.c(new org.telegram.messenger.z1(a02, gjVar.e1(), j13, message2, str, 2));
                ns f10 = ns.f(i15);
                Boolean bool = Boolean.TRUE;
                f10.k(ns.A1, gjVar, null, null, bool, bool);
                break;
            default:
                final jf0 jf0Var = (jf0) this.d;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.e;
                TLObject tLObject2 = (TLObject) this.f;
                long j14 = this.c;
                final int i16 = this.b;
                TLRPC.Chat chat = (TLRPC.Chat) this.h;
                if (tL_error2 != null || !(tLObject2 instanceof Vector)) {
                    jf0Var.b();
                    break;
                } else {
                    Vector vector2 = (Vector) tLObject2;
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    long j15 = j14;
                    final HashMap hashMap2 = new HashMap();
                    final ArrayList arrayList3 = new ArrayList();
                    int size2 = vector2.objects.size();
                    int i17 = 0;
                    while (i17 < size2) {
                        Object obj2 = vector2.objects.get(i17);
                        if (obj2 instanceof TLRPC.TL_readParticipantDate) {
                            TLRPC.TL_readParticipantDate tL_readParticipantDate = (TLRPC.TL_readParticipantDate) obj2;
                            int i18 = tL_readParticipantDate.date;
                            vector = vector2;
                            i7 = i17;
                            long j16 = tL_readParticipantDate.user_id;
                            Long valueOf = Long.valueOf(j16);
                            if (j15 != j16) {
                                np.s1(i16).a2(valueOf);
                                arrayList3.add(new Pair(valueOf, Integer.valueOf(i18)));
                                arrayList.add(valueOf);
                            }
                        } else {
                            vector = vector2;
                            i7 = i17;
                            if (obj2 instanceof Long) {
                                Long l10 = (Long) obj2;
                                if (j15 != l10.longValue()) {
                                    if (l10.longValue() > 0) {
                                        np.s1(i16).a2(l10);
                                        arrayList3.add(new Pair(l10, 0));
                                        arrayList.add(l10);
                                    } else {
                                        j3 = j15;
                                        np.s1(i16).M0(Long.valueOf(-l10.longValue()));
                                        arrayList3.add(new Pair(l10, 0));
                                        arrayList2.add(l10);
                                        i17 = i7 + 1;
                                        vector2 = vector;
                                        j15 = j3;
                                    }
                                }
                            }
                        }
                        j3 = j15;
                        i17 = i7 + 1;
                        vector2 = vector;
                        j15 = j3;
                    }
                    if (arrayList.isEmpty()) {
                        for (int i19 = 0; i19 < arrayList3.size(); i19++) {
                            Pair pair = (Pair) arrayList3.get(i19);
                            jf0Var.a.add((Long) pair.first);
                            jf0Var.b.add((Integer) pair.second);
                            jf0Var.c.add((TLObject) hashMap2.get(pair.first));
                        }
                        jf0Var.b();
                        break;
                    } else if (org.telegram.messenger.t3.T(chat)) {
                        TLRPC.TL_channels_getParticipants tL_channels_getParticipants = new TLRPC.TL_channels_getParticipants();
                        tL_channels_getParticipants.limit = np.s1(i16).q3;
                        tL_channels_getParticipants.offset = 0;
                        tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsRecent();
                        tL_channels_getParticipants.channel = np.s1(i16).h1(chat.id);
                        final int i20 = 0;
                        ConnectionsManager.getInstance(i16).sendRequest(tL_channels_getParticipants, new RequestDelegate() { // from class: org.telegram.ui.gf0
                            @Override // org.telegram.tgnet.RequestDelegate
                            public final void run(final TLObject tLObject3, TLRPC.TL_error tL_error3) {
                                switch (i20) {
                                    case 0:
                                        final int i21 = 0;
                                        final jf0 jf0Var2 = jf0Var;
                                        final int i22 = i16;
                                        final HashMap hashMap3 = hashMap2;
                                        final ArrayList arrayList4 = arrayList3;
                                        org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.hf0
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                switch (i21) {
                                                    case 0:
                                                        jf0 jf0Var3 = jf0Var2;
                                                        TLObject tLObject4 = tLObject3;
                                                        if (tLObject4 != null) {
                                                            jf0Var3.getClass();
                                                            TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject4;
                                                            int i23 = 0;
                                                            int i24 = 0;
                                                            while (true) {
                                                                int size3 = tL_channels_channelParticipants.users.size();
                                                                HashMap hashMap4 = hashMap3;
                                                                if (i24 < size3) {
                                                                    TLRPC.User user = tL_channels_channelParticipants.users.get(i24);
                                                                    org.telegram.messenger.np.s1(i22).X3(user, false, false);
                                                                    hashMap4.put(Long.valueOf(user.id), user);
                                                                    i24++;
                                                                } else {
                                                                    while (true) {
                                                                        ArrayList arrayList5 = arrayList4;
                                                                        if (i23 < arrayList5.size()) {
                                                                            Pair pair2 = (Pair) arrayList5.get(i23);
                                                                            jf0Var3.a.add((Long) pair2.first);
                                                                            jf0Var3.b.add((Integer) pair2.second);
                                                                            jf0Var3.c.add((TLObject) hashMap4.get(pair2.first));
                                                                            i23++;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        jf0Var3.b();
                                                        break;
                                                    default:
                                                        jf0 jf0Var4 = jf0Var2;
                                                        TLObject tLObject5 = tLObject3;
                                                        if (tLObject5 != null) {
                                                            jf0Var4.getClass();
                                                            TLRPC.TL_messages_chatFull tL_messages_chatFull = (TLRPC.TL_messages_chatFull) tLObject5;
                                                            int i25 = 0;
                                                            int i26 = 0;
                                                            while (true) {
                                                                int size4 = tL_messages_chatFull.users.size();
                                                                HashMap hashMap5 = hashMap3;
                                                                if (i26 < size4) {
                                                                    TLRPC.User user2 = tL_messages_chatFull.users.get(i26);
                                                                    org.telegram.messenger.np.s1(i22).X3(user2, false, false);
                                                                    hashMap5.put(Long.valueOf(user2.id), user2);
                                                                    i26++;
                                                                } else {
                                                                    while (true) {
                                                                        ArrayList arrayList6 = arrayList4;
                                                                        if (i25 < arrayList6.size()) {
                                                                            Pair pair3 = (Pair) arrayList6.get(i25);
                                                                            jf0Var4.a.add((Long) pair3.first);
                                                                            jf0Var4.b.add((Integer) pair3.second);
                                                                            jf0Var4.c.add((TLObject) hashMap5.get(pair3.first));
                                                                            i25++;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        jf0Var4.b();
                                                        break;
                                                }
                                            }
                                        });
                                        break;
                                    default:
                                        final int i23 = 1;
                                        final jf0 jf0Var3 = jf0Var;
                                        final int i24 = i16;
                                        final HashMap hashMap4 = hashMap2;
                                        final ArrayList arrayList5 = arrayList3;
                                        org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.hf0
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                switch (i23) {
                                                    case 0:
                                                        jf0 jf0Var32 = jf0Var3;
                                                        TLObject tLObject4 = tLObject3;
                                                        if (tLObject4 != null) {
                                                            jf0Var32.getClass();
                                                            TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject4;
                                                            int i232 = 0;
                                                            int i242 = 0;
                                                            while (true) {
                                                                int size3 = tL_channels_channelParticipants.users.size();
                                                                HashMap hashMap42 = hashMap4;
                                                                if (i242 < size3) {
                                                                    TLRPC.User user = tL_channels_channelParticipants.users.get(i242);
                                                                    org.telegram.messenger.np.s1(i24).X3(user, false, false);
                                                                    hashMap42.put(Long.valueOf(user.id), user);
                                                                    i242++;
                                                                } else {
                                                                    while (true) {
                                                                        ArrayList arrayList52 = arrayList5;
                                                                        if (i232 < arrayList52.size()) {
                                                                            Pair pair2 = (Pair) arrayList52.get(i232);
                                                                            jf0Var32.a.add((Long) pair2.first);
                                                                            jf0Var32.b.add((Integer) pair2.second);
                                                                            jf0Var32.c.add((TLObject) hashMap42.get(pair2.first));
                                                                            i232++;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        jf0Var32.b();
                                                        break;
                                                    default:
                                                        jf0 jf0Var4 = jf0Var3;
                                                        TLObject tLObject5 = tLObject3;
                                                        if (tLObject5 != null) {
                                                            jf0Var4.getClass();
                                                            TLRPC.TL_messages_chatFull tL_messages_chatFull = (TLRPC.TL_messages_chatFull) tLObject5;
                                                            int i25 = 0;
                                                            int i26 = 0;
                                                            while (true) {
                                                                int size4 = tL_messages_chatFull.users.size();
                                                                HashMap hashMap5 = hashMap4;
                                                                if (i26 < size4) {
                                                                    TLRPC.User user2 = tL_messages_chatFull.users.get(i26);
                                                                    org.telegram.messenger.np.s1(i24).X3(user2, false, false);
                                                                    hashMap5.put(Long.valueOf(user2.id), user2);
                                                                    i26++;
                                                                } else {
                                                                    while (true) {
                                                                        ArrayList arrayList6 = arrayList5;
                                                                        if (i25 < arrayList6.size()) {
                                                                            Pair pair3 = (Pair) arrayList6.get(i25);
                                                                            jf0Var4.a.add((Long) pair3.first);
                                                                            jf0Var4.b.add((Integer) pair3.second);
                                                                            jf0Var4.c.add((TLObject) hashMap5.get(pair3.first));
                                                                            i25++;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        jf0Var4.b();
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
                        final int i21 = 1;
                        ConnectionsManager.getInstance(i16).sendRequest(tL_messages_getFullChat, new RequestDelegate() { // from class: org.telegram.ui.gf0
                            @Override // org.telegram.tgnet.RequestDelegate
                            public final void run(final TLObject tLObject3, TLRPC.TL_error tL_error3) {
                                switch (i21) {
                                    case 0:
                                        final int i212 = 0;
                                        final jf0 jf0Var2 = jf0Var;
                                        final int i22 = i16;
                                        final HashMap hashMap3 = hashMap2;
                                        final ArrayList arrayList4 = arrayList3;
                                        org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.hf0
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                switch (i212) {
                                                    case 0:
                                                        jf0 jf0Var32 = jf0Var2;
                                                        TLObject tLObject4 = tLObject3;
                                                        if (tLObject4 != null) {
                                                            jf0Var32.getClass();
                                                            TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject4;
                                                            int i232 = 0;
                                                            int i242 = 0;
                                                            while (true) {
                                                                int size3 = tL_channels_channelParticipants.users.size();
                                                                HashMap hashMap42 = hashMap3;
                                                                if (i242 < size3) {
                                                                    TLRPC.User user = tL_channels_channelParticipants.users.get(i242);
                                                                    org.telegram.messenger.np.s1(i22).X3(user, false, false);
                                                                    hashMap42.put(Long.valueOf(user.id), user);
                                                                    i242++;
                                                                } else {
                                                                    while (true) {
                                                                        ArrayList arrayList52 = arrayList4;
                                                                        if (i232 < arrayList52.size()) {
                                                                            Pair pair2 = (Pair) arrayList52.get(i232);
                                                                            jf0Var32.a.add((Long) pair2.first);
                                                                            jf0Var32.b.add((Integer) pair2.second);
                                                                            jf0Var32.c.add((TLObject) hashMap42.get(pair2.first));
                                                                            i232++;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        jf0Var32.b();
                                                        break;
                                                    default:
                                                        jf0 jf0Var4 = jf0Var2;
                                                        TLObject tLObject5 = tLObject3;
                                                        if (tLObject5 != null) {
                                                            jf0Var4.getClass();
                                                            TLRPC.TL_messages_chatFull tL_messages_chatFull = (TLRPC.TL_messages_chatFull) tLObject5;
                                                            int i25 = 0;
                                                            int i26 = 0;
                                                            while (true) {
                                                                int size4 = tL_messages_chatFull.users.size();
                                                                HashMap hashMap5 = hashMap3;
                                                                if (i26 < size4) {
                                                                    TLRPC.User user2 = tL_messages_chatFull.users.get(i26);
                                                                    org.telegram.messenger.np.s1(i22).X3(user2, false, false);
                                                                    hashMap5.put(Long.valueOf(user2.id), user2);
                                                                    i26++;
                                                                } else {
                                                                    while (true) {
                                                                        ArrayList arrayList6 = arrayList4;
                                                                        if (i25 < arrayList6.size()) {
                                                                            Pair pair3 = (Pair) arrayList6.get(i25);
                                                                            jf0Var4.a.add((Long) pair3.first);
                                                                            jf0Var4.b.add((Integer) pair3.second);
                                                                            jf0Var4.c.add((TLObject) hashMap5.get(pair3.first));
                                                                            i25++;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        jf0Var4.b();
                                                        break;
                                                }
                                            }
                                        });
                                        break;
                                    default:
                                        final int i23 = 1;
                                        final jf0 jf0Var3 = jf0Var;
                                        final int i24 = i16;
                                        final HashMap hashMap4 = hashMap2;
                                        final ArrayList arrayList5 = arrayList3;
                                        org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.hf0
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                switch (i23) {
                                                    case 0:
                                                        jf0 jf0Var32 = jf0Var3;
                                                        TLObject tLObject4 = tLObject3;
                                                        if (tLObject4 != null) {
                                                            jf0Var32.getClass();
                                                            TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject4;
                                                            int i232 = 0;
                                                            int i242 = 0;
                                                            while (true) {
                                                                int size3 = tL_channels_channelParticipants.users.size();
                                                                HashMap hashMap42 = hashMap4;
                                                                if (i242 < size3) {
                                                                    TLRPC.User user = tL_channels_channelParticipants.users.get(i242);
                                                                    org.telegram.messenger.np.s1(i24).X3(user, false, false);
                                                                    hashMap42.put(Long.valueOf(user.id), user);
                                                                    i242++;
                                                                } else {
                                                                    while (true) {
                                                                        ArrayList arrayList52 = arrayList5;
                                                                        if (i232 < arrayList52.size()) {
                                                                            Pair pair2 = (Pair) arrayList52.get(i232);
                                                                            jf0Var32.a.add((Long) pair2.first);
                                                                            jf0Var32.b.add((Integer) pair2.second);
                                                                            jf0Var32.c.add((TLObject) hashMap42.get(pair2.first));
                                                                            i232++;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        jf0Var32.b();
                                                        break;
                                                    default:
                                                        jf0 jf0Var4 = jf0Var3;
                                                        TLObject tLObject5 = tLObject3;
                                                        if (tLObject5 != null) {
                                                            jf0Var4.getClass();
                                                            TLRPC.TL_messages_chatFull tL_messages_chatFull = (TLRPC.TL_messages_chatFull) tLObject5;
                                                            int i25 = 0;
                                                            int i26 = 0;
                                                            while (true) {
                                                                int size4 = tL_messages_chatFull.users.size();
                                                                HashMap hashMap5 = hashMap4;
                                                                if (i26 < size4) {
                                                                    TLRPC.User user2 = tL_messages_chatFull.users.get(i26);
                                                                    org.telegram.messenger.np.s1(i24).X3(user2, false, false);
                                                                    hashMap5.put(Long.valueOf(user2.id), user2);
                                                                    i26++;
                                                                } else {
                                                                    while (true) {
                                                                        ArrayList arrayList6 = arrayList5;
                                                                        if (i25 < arrayList6.size()) {
                                                                            Pair pair3 = (Pair) arrayList6.get(i25);
                                                                            jf0Var4.a.add((Long) pair3.first);
                                                                            jf0Var4.b.add((Integer) pair3.second);
                                                                            jf0Var4.c.add((TLObject) hashMap5.get(pair3.first));
                                                                            i25++;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        jf0Var4.b();
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
        }
    }

    public /* synthetic */ u7(a1.c cVar, ArrayList arrayList, int i7, long j3, ArrayList arrayList2, ArrayList arrayList3) {
        this.d = cVar;
        this.e = arrayList;
        this.b = i7;
        this.c = j3;
        this.f = arrayList2;
        this.h = arrayList3;
    }

    public /* synthetic */ u7(gj gjVar, TLRPC.Message message, String str, int[] iArr, int i7, long j3) {
        this.d = gjVar;
        this.e = message;
        this.f = str;
        this.h = iArr;
        this.b = i7;
        this.c = j3;
    }

    public /* synthetic */ u7(h00 h00Var, TLRPC.TL_messages_forumTopics tL_messages_forumTopics, long j3, TLRPC.TL_messages_forumTopics tL_messages_forumTopics2, a0.h hVar, int i7) {
        this.d = h00Var;
        this.e = tL_messages_forumTopics;
        this.c = j3;
        this.f = tL_messages_forumTopics2;
        this.h = hVar;
        this.b = i7;
    }

    public /* synthetic */ u7(TLObject tLObject, int i7, hi.d dVar, org.telegram.ui.ActionBar.u2 u2Var, long j3, TLRPC.TL_error tL_error) {
        this.d = tLObject;
        this.b = i7;
        this.e = dVar;
        this.f = u2Var;
        this.c = j3;
        this.h = tL_error;
    }

    public /* synthetic */ u7(org.telegram.ui.Cells.d6 d6Var, TLObject tLObject, vr vrVar, long j3, int i7, ArrayList arrayList) {
        this.d = d6Var;
        this.f = tLObject;
        this.h = vrVar;
        this.c = j3;
        this.b = i7;
        this.e = arrayList;
    }

    public /* synthetic */ u7(jf0 jf0Var, TLRPC.TL_error tL_error, TLObject tLObject, long j3, int i7, TLRPC.Chat chat) {
        this.d = jf0Var;
        this.e = tL_error;
        this.f = tLObject;
        this.c = j3;
        this.b = i7;
        this.h = chat;
    }
}
