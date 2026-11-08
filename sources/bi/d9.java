package bi;

import android.content.Context;
import android.util.Pair;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.ez;
import org.telegram.messenger.gz;
import org.telegram.messenger.k00;
import org.telegram.messenger.qp;
import org.telegram.messenger.yr;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.an;
import org.telegram.ui.jf0;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class d9 implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;

    public /* synthetic */ d9(int i7, long j3, Context context, TL_payments.connectedBotStarRef connectedbotstarref, org.telegram.ui.ActionBar.v2 v2Var, org.telegram.ui.ActionBar.f6 f6Var) {
        this.b = i7;
        this.d = context;
        this.c = j3;
        this.e = connectedbotstarref;
        this.f = v2Var;
        this.h = f6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long j3;
        switch (this.a) {
            case 0:
                ((a1.c) this.d).i((ArrayList) this.e, Integer.valueOf(this.b), Long.valueOf(this.c), (ArrayList) this.f, (ArrayList) this.h);
                break;
            case 1:
                int i7 = this.b;
                Context context = (Context) this.d;
                long j10 = this.c;
                TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) this.e;
                n0.g(i7).f(context, j10, connectedbotstarref.bot_id, new hi.f3(i7, j10, context, connectedbotstarref, (org.telegram.ui.ActionBar.v2) this.f, (org.telegram.ui.ActionBar.f6) this.h));
                break;
            case 2:
                k00 k00Var = (k00) this.d;
                TLRPC.TL_messages_forumTopics tL_messages_forumTopics = (TLRPC.TL_messages_forumTopics) this.e;
                long j11 = this.c;
                TLRPC.TL_messages_forumTopics tL_messages_forumTopics2 = (TLRPC.TL_messages_forumTopics) this.f;
                a0.h hVar = (a0.h) this.h;
                int i10 = this.b;
                k00Var.getMessagesStorage().m1(tL_messages_forumTopics.users, tL_messages_forumTopics.chats, true, true);
                k00Var.getMessagesController().Y3(tL_messages_forumTopics.users, false);
                k00Var.getMessagesController().S3(tL_messages_forumTopics.chats, false);
                k00Var.c.put(j11, 0);
                k00Var.u(j11, tL_messages_forumTopics2.topics, hVar, false, i10, tL_messages_forumTopics.count);
                k00Var.y(j11, true);
                k00Var.getMessagesStorage().C1(k00Var.getConnectionsManager().getCurrentTime(), -j11, (List) k00Var.a.f(j11), true);
                k00Var.getMessagesStorage().j1(tL_messages_forumTopics2.messages, false, true, false, 0, false, 0, 0L);
                if (tL_messages_forumTopics2.topics.isEmpty() || i10 != 1) {
                    if (k00Var.l(j11) == null || k00Var.l(j11).size() < tL_messages_forumTopics2.count) {
                        k00Var.h.l(j11);
                        k00Var.o(j11);
                        break;
                    }
                } else {
                    TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) jg.g.i(1, tL_messages_forumTopics2.topics);
                    TLRPC.Message message = (TLRPC.Message) hVar.f(tL_forumTopic.top_message);
                    k00Var.x(j11, tL_forumTopic.id, tL_forumTopic.top_message, message != null ? message.date : 0);
                    break;
                }
                break;
            case 3:
                org.telegram.ui.Cells.e6.a((org.telegram.ui.Cells.e6) this.d, (TLObject) this.f, (yr) this.h, this.c, this.b, (ArrayList) this.e);
                break;
            case 4:
                TLObject tLObject = (TLObject) this.d;
                int i11 = this.b;
                fi.d dVar = (fi.d) this.e;
                org.telegram.ui.ActionBar.v2 v2Var = (org.telegram.ui.ActionBar.v2) this.f;
                long j12 = this.c;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.h;
                TLRPC.GroupCall groupCall = null;
                if (tLObject instanceof TLRPC.Updates) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                    qp.s1(i11).Y3(updates.users, false);
                    qp.s1(i11).S3(updates.chats, false);
                    ArrayList y02 = qp.y0(updates, TL_update.TL_updateGroupCall.class);
                    int size = y02.size();
                    int i12 = 0;
                    while (i12 < size) {
                        Object obj = y02.get(i12);
                        i12++;
                        groupCall = ((TL_update.TL_updateGroupCall) obj).call;
                    }
                    Utilities.d.c(new org.telegram.tgnet.g(i11, updates, 1));
                    if (groupCall != null && LaunchActivity.G1 != null) {
                        v2Var.dismiss();
                        gz.C(i11).r0(ez.a(j12, groupCall.invite_link));
                        org.telegram.ui.ActionBar.f2 T = LaunchActivity.T();
                        if (T != null) {
                            if (T instanceof an) {
                                an anVar = (an) T;
                                if (anVar.a() == j12 && anVar.f4 == 0) {
                                }
                            }
                            T.presentFragment(an.ra(j12));
                            break;
                        }
                    } else {
                        dVar.setLoading(false);
                        break;
                    }
                } else if (tLObject instanceof TL_phone.groupCall) {
                    TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject;
                    qp.s1(i11).Y3(groupcall.users, false);
                    qp.s1(i11).S3(groupcall.chats, false);
                    if (LaunchActivity.G1 == null) {
                        dVar.setLoading(false);
                        break;
                    } else {
                        TLRPC.TL_inputGroupCall tL_inputGroupCall = new TLRPC.TL_inputGroupCall();
                        TLRPC.GroupCall groupCall2 = groupcall.call;
                        tL_inputGroupCall.id = groupCall2.id;
                        tL_inputGroupCall.access_hash = groupCall2.access_hash;
                        v2Var.dismiss();
                        org.telegram.ui.Components.voip.y1.g(LaunchActivity.G1, i11, tL_inputGroupCall, false, groupcall.call, null);
                        gz.C(i11).r0(ez.a(j12, groupcall.call.invite_link));
                        break;
                    }
                } else if (tL_error != null) {
                    org.telegram.ui.Cells.f1.r(v2Var.E, null, tL_error, false);
                    break;
                }
                break;
            default:
                final jf0 jf0Var = (jf0) this.d;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.e;
                TLObject tLObject2 = (TLObject) this.f;
                long j13 = this.c;
                final int i13 = this.b;
                TLRPC.Chat chat = (TLRPC.Chat) this.h;
                if (tL_error2 != null || !(tLObject2 instanceof Vector)) {
                    jf0Var.b();
                    break;
                } else {
                    Vector vector = (Vector) tLObject2;
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    long j14 = j13;
                    final HashMap hashMap = new HashMap();
                    final ArrayList arrayList3 = new ArrayList();
                    int size2 = vector.objects.size();
                    int i14 = 0;
                    while (i14 < size2) {
                        Object obj2 = vector.objects.get(i14);
                        if (obj2 instanceof TLRPC.TL_readParticipantDate) {
                            TLRPC.TL_readParticipantDate tL_readParticipantDate = (TLRPC.TL_readParticipantDate) obj2;
                            int i15 = tL_readParticipantDate.date;
                            j3 = j14;
                            long j15 = tL_readParticipantDate.user_id;
                            Long valueOf = Long.valueOf(j15);
                            if (j3 != j15) {
                                qp.s1(i13).a2(valueOf);
                                arrayList3.add(new Pair(valueOf, Integer.valueOf(i15)));
                                arrayList.add(valueOf);
                            }
                        } else {
                            j3 = j14;
                            if (obj2 instanceof Long) {
                                Long l10 = (Long) obj2;
                                if (j3 != l10.longValue()) {
                                    if (l10.longValue() > 0) {
                                        qp.s1(i13).a2(l10);
                                        arrayList3.add(new Pair(l10, 0));
                                        arrayList.add(l10);
                                    } else {
                                        qp.s1(i13).M0(Long.valueOf(-l10.longValue()));
                                        arrayList3.add(new Pair(l10, 0));
                                        arrayList2.add(l10);
                                    }
                                }
                            }
                        }
                        i14++;
                        j14 = j3;
                    }
                    if (arrayList.isEmpty()) {
                        for (int i16 = 0; i16 < arrayList3.size(); i16++) {
                            Pair pair = (Pair) arrayList3.get(i16);
                            jf0Var.a.add((Long) pair.first);
                            jf0Var.b.add((Integer) pair.second);
                            jf0Var.c.add((TLObject) hashMap.get(pair.first));
                        }
                        jf0Var.b();
                        break;
                    } else if (org.telegram.messenger.t3.T(chat)) {
                        TLRPC.TL_channels_getParticipants tL_channels_getParticipants = new TLRPC.TL_channels_getParticipants();
                        tL_channels_getParticipants.limit = qp.s1(i13).p3;
                        tL_channels_getParticipants.offset = 0;
                        tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsRecent();
                        tL_channels_getParticipants.channel = qp.s1(i13).h1(chat.id);
                        final int i17 = 0;
                        ConnectionsManager.getInstance(i13).sendRequest(tL_channels_getParticipants, new RequestDelegate() { // from class: org.telegram.ui.gf0
                            @Override // org.telegram.tgnet.RequestDelegate
                            public final void run(final TLObject tLObject3, TLRPC.TL_error tL_error3) {
                                switch (i17) {
                                    case 0:
                                        final int i18 = 0;
                                        final jf0 jf0Var2 = jf0Var;
                                        final int i19 = i13;
                                        final HashMap hashMap2 = hashMap;
                                        final ArrayList arrayList4 = arrayList3;
                                        org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.hf0
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                switch (i18) {
                                                    case 0:
                                                        jf0 jf0Var3 = jf0Var2;
                                                        TLObject tLObject4 = tLObject3;
                                                        if (tLObject4 != null) {
                                                            jf0Var3.getClass();
                                                            TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject4;
                                                            int i20 = 0;
                                                            int i21 = 0;
                                                            while (true) {
                                                                int size3 = tL_channels_channelParticipants.users.size();
                                                                HashMap hashMap3 = hashMap2;
                                                                if (i21 < size3) {
                                                                    TLRPC.User user = tL_channels_channelParticipants.users.get(i21);
                                                                    org.telegram.messenger.qp.s1(i19).X3(user, false, false);
                                                                    hashMap3.put(Long.valueOf(user.id), user);
                                                                    i21++;
                                                                } else {
                                                                    while (true) {
                                                                        ArrayList arrayList5 = arrayList4;
                                                                        if (i20 < arrayList5.size()) {
                                                                            Pair pair2 = (Pair) arrayList5.get(i20);
                                                                            jf0Var3.a.add((Long) pair2.first);
                                                                            jf0Var3.b.add((Integer) pair2.second);
                                                                            jf0Var3.c.add((TLObject) hashMap3.get(pair2.first));
                                                                            i20++;
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
                                                            int i22 = 0;
                                                            int i23 = 0;
                                                            while (true) {
                                                                int size4 = tL_messages_chatFull.users.size();
                                                                HashMap hashMap4 = hashMap2;
                                                                if (i23 < size4) {
                                                                    TLRPC.User user2 = tL_messages_chatFull.users.get(i23);
                                                                    org.telegram.messenger.qp.s1(i19).X3(user2, false, false);
                                                                    hashMap4.put(Long.valueOf(user2.id), user2);
                                                                    i23++;
                                                                } else {
                                                                    while (true) {
                                                                        ArrayList arrayList6 = arrayList4;
                                                                        if (i22 < arrayList6.size()) {
                                                                            Pair pair3 = (Pair) arrayList6.get(i22);
                                                                            jf0Var4.a.add((Long) pair3.first);
                                                                            jf0Var4.b.add((Integer) pair3.second);
                                                                            jf0Var4.c.add((TLObject) hashMap4.get(pair3.first));
                                                                            i22++;
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
                                        final int i20 = 1;
                                        final jf0 jf0Var3 = jf0Var;
                                        final int i21 = i13;
                                        final HashMap hashMap3 = hashMap;
                                        final ArrayList arrayList5 = arrayList3;
                                        org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.hf0
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                switch (i20) {
                                                    case 0:
                                                        jf0 jf0Var32 = jf0Var3;
                                                        TLObject tLObject4 = tLObject3;
                                                        if (tLObject4 != null) {
                                                            jf0Var32.getClass();
                                                            TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject4;
                                                            int i202 = 0;
                                                            int i212 = 0;
                                                            while (true) {
                                                                int size3 = tL_channels_channelParticipants.users.size();
                                                                HashMap hashMap32 = hashMap3;
                                                                if (i212 < size3) {
                                                                    TLRPC.User user = tL_channels_channelParticipants.users.get(i212);
                                                                    org.telegram.messenger.qp.s1(i21).X3(user, false, false);
                                                                    hashMap32.put(Long.valueOf(user.id), user);
                                                                    i212++;
                                                                } else {
                                                                    while (true) {
                                                                        ArrayList arrayList52 = arrayList5;
                                                                        if (i202 < arrayList52.size()) {
                                                                            Pair pair2 = (Pair) arrayList52.get(i202);
                                                                            jf0Var32.a.add((Long) pair2.first);
                                                                            jf0Var32.b.add((Integer) pair2.second);
                                                                            jf0Var32.c.add((TLObject) hashMap32.get(pair2.first));
                                                                            i202++;
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
                                                            int i22 = 0;
                                                            int i23 = 0;
                                                            while (true) {
                                                                int size4 = tL_messages_chatFull.users.size();
                                                                HashMap hashMap4 = hashMap3;
                                                                if (i23 < size4) {
                                                                    TLRPC.User user2 = tL_messages_chatFull.users.get(i23);
                                                                    org.telegram.messenger.qp.s1(i21).X3(user2, false, false);
                                                                    hashMap4.put(Long.valueOf(user2.id), user2);
                                                                    i23++;
                                                                } else {
                                                                    while (true) {
                                                                        ArrayList arrayList6 = arrayList5;
                                                                        if (i22 < arrayList6.size()) {
                                                                            Pair pair3 = (Pair) arrayList6.get(i22);
                                                                            jf0Var4.a.add((Long) pair3.first);
                                                                            jf0Var4.b.add((Integer) pair3.second);
                                                                            jf0Var4.c.add((TLObject) hashMap4.get(pair3.first));
                                                                            i22++;
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
                        final int i18 = 1;
                        ConnectionsManager.getInstance(i13).sendRequest(tL_messages_getFullChat, new RequestDelegate() { // from class: org.telegram.ui.gf0
                            @Override // org.telegram.tgnet.RequestDelegate
                            public final void run(final TLObject tLObject3, TLRPC.TL_error tL_error3) {
                                switch (i18) {
                                    case 0:
                                        final int i182 = 0;
                                        final jf0 jf0Var2 = jf0Var;
                                        final int i19 = i13;
                                        final HashMap hashMap2 = hashMap;
                                        final ArrayList arrayList4 = arrayList3;
                                        org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.hf0
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                switch (i182) {
                                                    case 0:
                                                        jf0 jf0Var32 = jf0Var2;
                                                        TLObject tLObject4 = tLObject3;
                                                        if (tLObject4 != null) {
                                                            jf0Var32.getClass();
                                                            TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject4;
                                                            int i202 = 0;
                                                            int i212 = 0;
                                                            while (true) {
                                                                int size3 = tL_channels_channelParticipants.users.size();
                                                                HashMap hashMap32 = hashMap2;
                                                                if (i212 < size3) {
                                                                    TLRPC.User user = tL_channels_channelParticipants.users.get(i212);
                                                                    org.telegram.messenger.qp.s1(i19).X3(user, false, false);
                                                                    hashMap32.put(Long.valueOf(user.id), user);
                                                                    i212++;
                                                                } else {
                                                                    while (true) {
                                                                        ArrayList arrayList52 = arrayList4;
                                                                        if (i202 < arrayList52.size()) {
                                                                            Pair pair2 = (Pair) arrayList52.get(i202);
                                                                            jf0Var32.a.add((Long) pair2.first);
                                                                            jf0Var32.b.add((Integer) pair2.second);
                                                                            jf0Var32.c.add((TLObject) hashMap32.get(pair2.first));
                                                                            i202++;
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
                                                            int i22 = 0;
                                                            int i23 = 0;
                                                            while (true) {
                                                                int size4 = tL_messages_chatFull.users.size();
                                                                HashMap hashMap4 = hashMap2;
                                                                if (i23 < size4) {
                                                                    TLRPC.User user2 = tL_messages_chatFull.users.get(i23);
                                                                    org.telegram.messenger.qp.s1(i19).X3(user2, false, false);
                                                                    hashMap4.put(Long.valueOf(user2.id), user2);
                                                                    i23++;
                                                                } else {
                                                                    while (true) {
                                                                        ArrayList arrayList6 = arrayList4;
                                                                        if (i22 < arrayList6.size()) {
                                                                            Pair pair3 = (Pair) arrayList6.get(i22);
                                                                            jf0Var4.a.add((Long) pair3.first);
                                                                            jf0Var4.b.add((Integer) pair3.second);
                                                                            jf0Var4.c.add((TLObject) hashMap4.get(pair3.first));
                                                                            i22++;
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
                                        final int i20 = 1;
                                        final jf0 jf0Var3 = jf0Var;
                                        final int i21 = i13;
                                        final HashMap hashMap3 = hashMap;
                                        final ArrayList arrayList5 = arrayList3;
                                        org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.hf0
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                switch (i20) {
                                                    case 0:
                                                        jf0 jf0Var32 = jf0Var3;
                                                        TLObject tLObject4 = tLObject3;
                                                        if (tLObject4 != null) {
                                                            jf0Var32.getClass();
                                                            TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject4;
                                                            int i202 = 0;
                                                            int i212 = 0;
                                                            while (true) {
                                                                int size3 = tL_channels_channelParticipants.users.size();
                                                                HashMap hashMap32 = hashMap3;
                                                                if (i212 < size3) {
                                                                    TLRPC.User user = tL_channels_channelParticipants.users.get(i212);
                                                                    org.telegram.messenger.qp.s1(i21).X3(user, false, false);
                                                                    hashMap32.put(Long.valueOf(user.id), user);
                                                                    i212++;
                                                                } else {
                                                                    while (true) {
                                                                        ArrayList arrayList52 = arrayList5;
                                                                        if (i202 < arrayList52.size()) {
                                                                            Pair pair2 = (Pair) arrayList52.get(i202);
                                                                            jf0Var32.a.add((Long) pair2.first);
                                                                            jf0Var32.b.add((Integer) pair2.second);
                                                                            jf0Var32.c.add((TLObject) hashMap32.get(pair2.first));
                                                                            i202++;
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
                                                            int i22 = 0;
                                                            int i23 = 0;
                                                            while (true) {
                                                                int size4 = tL_messages_chatFull.users.size();
                                                                HashMap hashMap4 = hashMap3;
                                                                if (i23 < size4) {
                                                                    TLRPC.User user2 = tL_messages_chatFull.users.get(i23);
                                                                    org.telegram.messenger.qp.s1(i21).X3(user2, false, false);
                                                                    hashMap4.put(Long.valueOf(user2.id), user2);
                                                                    i23++;
                                                                } else {
                                                                    while (true) {
                                                                        ArrayList arrayList6 = arrayList5;
                                                                        if (i22 < arrayList6.size()) {
                                                                            Pair pair3 = (Pair) arrayList6.get(i22);
                                                                            jf0Var4.a.add((Long) pair3.first);
                                                                            jf0Var4.b.add((Integer) pair3.second);
                                                                            jf0Var4.c.add((TLObject) hashMap4.get(pair3.first));
                                                                            i22++;
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
                break;
        }
    }

    public /* synthetic */ d9(a1.c cVar, ArrayList arrayList, int i7, long j3, ArrayList arrayList2, ArrayList arrayList3) {
        this.d = cVar;
        this.e = arrayList;
        this.b = i7;
        this.c = j3;
        this.f = arrayList2;
        this.h = arrayList3;
    }

    public /* synthetic */ d9(k00 k00Var, TLRPC.TL_messages_forumTopics tL_messages_forumTopics, long j3, TLRPC.TL_messages_forumTopics tL_messages_forumTopics2, a0.h hVar, int i7) {
        this.d = k00Var;
        this.e = tL_messages_forumTopics;
        this.c = j3;
        this.f = tL_messages_forumTopics2;
        this.h = hVar;
        this.b = i7;
    }

    public /* synthetic */ d9(TLObject tLObject, int i7, fi.d dVar, org.telegram.ui.ActionBar.v2 v2Var, long j3, TLRPC.TL_error tL_error) {
        this.d = tLObject;
        this.b = i7;
        this.e = dVar;
        this.f = v2Var;
        this.c = j3;
        this.h = tL_error;
    }

    public /* synthetic */ d9(org.telegram.ui.Cells.e6 e6Var, TLObject tLObject, yr yrVar, long j3, int i7, ArrayList arrayList) {
        this.d = e6Var;
        this.f = tLObject;
        this.h = yrVar;
        this.c = j3;
        this.b = i7;
        this.e = arrayList;
    }

    public /* synthetic */ d9(jf0 jf0Var, TLRPC.TL_error tL_error, TLObject tLObject, long j3, int i7, TLRPC.Chat chat) {
        this.d = jf0Var;
        this.e = tL_error;
        this.f = tLObject;
        this.c = j3;
        this.b = i7;
        this.h = chat;
    }
}
