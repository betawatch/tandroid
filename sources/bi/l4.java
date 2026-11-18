package bi;

import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.e00;
import org.telegram.messenger.fj;
import org.telegram.messenger.gd;
import org.telegram.messenger.ks;
import org.telegram.messenger.mp;
import org.telegram.messenger.tr;
import org.telegram.messenger.xy;
import org.telegram.messenger.zy;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.Components.g21;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.bn;
import org.telegram.ui.mf0;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class l4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;

    public /* synthetic */ l4(int i7, long j3, Context context, TL_payments.connectedBotStarRef connectedbotstarref, org.telegram.ui.ActionBar.x2 x2Var, org.telegram.ui.ActionBar.i6 i6Var) {
        this.a = 2;
        this.b = i7;
        this.d = context;
        this.c = j3;
        this.e = connectedbotstarref;
        this.f = x2Var;
        this.h = i6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7;
        Vector vector;
        TLRPC.GroupCall groupCall = null;
        int i10 = 1;
        switch (this.a) {
            case 0:
                di.k1 k1Var = (di.k1) this.d;
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) this.e;
                Boolean bool = (Boolean) this.f;
                String str = (String) this.h;
                int i11 = this.b;
                long j3 = this.c;
                k1Var.run();
                v4.s(tL_starGiftUnique, gd.a0(null, null, bool.booleanValue() ? 2131749518 : 2131749519, str));
                String str2 = tL_starGiftUnique.slug;
                if (!TextUtils.isEmpty(str2)) {
                    org.telegram.messenger.g0.h3(new k4(i11, 0, j3, str2, true), v4.a[0]);
                    break;
                }
                break;
            case 1:
                ((a1.c) this.d).l((ArrayList) this.e, Integer.valueOf(this.b), Long.valueOf(this.c), (ArrayList) this.f, (ArrayList) this.h);
                break;
            case 2:
                int i12 = this.b;
                Context context = (Context) this.d;
                long j10 = this.c;
                TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) this.e;
                di.e0.g(i12).f(context, j10, connectedbotstarref.bot_id, new w3(i12, j10, context, connectedbotstarref, (org.telegram.ui.ActionBar.x2) this.f, (org.telegram.ui.ActionBar.i6) this.h));
                break;
            case 3:
                e00 e00Var = (e00) this.d;
                TLRPC.TL_messages_forumTopics tL_messages_forumTopics = (TLRPC.TL_messages_forumTopics) this.e;
                long j11 = this.c;
                TLRPC.TL_messages_forumTopics tL_messages_forumTopics2 = (TLRPC.TL_messages_forumTopics) this.f;
                a0.h hVar = (a0.h) this.h;
                int i13 = this.b;
                e00Var.getMessagesStorage().m1(tL_messages_forumTopics.users, tL_messages_forumTopics.chats, true, true);
                e00Var.getMessagesController().f4(tL_messages_forumTopics.users, false);
                e00Var.getMessagesController().Z3(tL_messages_forumTopics.chats, false);
                e00Var.c.put(j11, 0);
                ArrayList<Long> arrayList = tL_messages_forumTopics2.top_icons;
                if (arrayList != null) {
                    e00Var.f.k(arrayList, j11);
                    e00Var.h.put(j11, System.currentTimeMillis());
                }
                e00Var.u(j11, tL_messages_forumTopics2.topics, hVar, false, i13, tL_messages_forumTopics.count);
                e00Var.y(j11, true);
                e00Var.getMessagesStorage().C1(e00Var.getConnectionsManager().getCurrentTime(), -j11, (List) e00Var.a.f(j11), true);
                e00Var.getMessagesStorage().j1(tL_messages_forumTopics2.messages, false, true, false, 0, false, 0, 0L);
                if (tL_messages_forumTopics2.topics.isEmpty() || i13 != 1) {
                    if (e00Var.l(j11) == null || e00Var.l(j11).size() < tL_messages_forumTopics2.count) {
                        e00Var.s.l(j11);
                        e00Var.o(j11);
                        break;
                    }
                } else {
                    TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) i5.c.h(1, tL_messages_forumTopics2.topics);
                    TLRPC.Message message = (TLRPC.Message) hVar.f(tL_forumTopic.top_message);
                    e00Var.x(j11, tL_forumTopic.id, tL_forumTopic.top_message, message == null ? 0 : message.date);
                    break;
                }
                break;
            case 4:
                org.telegram.ui.Cells.e6.a((org.telegram.ui.Cells.e6) this.d, (TLObject) this.e, (tr) this.f, this.c, this.b, (ArrayList) this.h);
                break;
            case 5:
                TLObject tLObject = (TLObject) this.d;
                int i14 = this.b;
                hi.d dVar = (hi.d) this.e;
                org.telegram.ui.ActionBar.x2 x2Var = (org.telegram.ui.ActionBar.x2) this.f;
                long j12 = this.c;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.h;
                if (tLObject instanceof TLRPC.Updates) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                    mp.u1(i14).f4(updates.users, false);
                    mp.u1(i14).Z3(updates.chats, false);
                    ArrayList A0 = mp.A0(updates, TL_update.TL_updateGroupCall.class);
                    int size = A0.size();
                    int i15 = 0;
                    while (i15 < size) {
                        Object obj = A0.get(i15);
                        i15++;
                        groupCall = ((TL_update.TL_updateGroupCall) obj).call;
                    }
                    Utilities.d.c(new org.telegram.tgnet.g(i14, updates, i10));
                    if (groupCall != null && LaunchActivity.H1 != null) {
                        x2Var.dismiss();
                        zy.C(i14).r0(xy.a(j12, groupCall.invite_link));
                        org.telegram.ui.ActionBar.h2 T = LaunchActivity.T();
                        if (T != null) {
                            if (T instanceof bn) {
                                bn bnVar = (bn) T;
                                if (bnVar.a() == j12 && bnVar.g4 == 0) {
                                }
                            }
                            T.presentFragment(bn.ua(j12));
                            break;
                        }
                    } else {
                        dVar.setLoading(false);
                        break;
                    }
                } else if (tLObject instanceof TL_phone.groupCall) {
                    TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject;
                    mp.u1(i14).f4(groupcall.users, false);
                    mp.u1(i14).Z3(groupcall.chats, false);
                    if (LaunchActivity.H1 == null) {
                        dVar.setLoading(false);
                        break;
                    } else {
                        TLRPC.TL_inputGroupCall tL_inputGroupCall = new TLRPC.TL_inputGroupCall();
                        TLRPC.GroupCall groupCall2 = groupcall.call;
                        tL_inputGroupCall.id = groupCall2.id;
                        tL_inputGroupCall.access_hash = groupCall2.access_hash;
                        x2Var.dismiss();
                        org.telegram.ui.Components.voip.b2.g(LaunchActivity.H1, i14, tL_inputGroupCall, false, groupcall.call, null);
                        zy.C(i14).r0(xy.a(j12, groupcall.call.invite_link));
                        break;
                    }
                } else if (tL_error != null) {
                    org.telegram.ui.Cells.c0.t(x2Var.F, null, tL_error, false);
                    break;
                }
                break;
            case 6:
                fj fjVar = (fj) this.d;
                TLRPC.Message message2 = (TLRPC.Message) this.e;
                String str3 = (String) this.h;
                int[] iArr = (int[]) this.f;
                int i16 = this.b;
                long j13 = this.c;
                HashMap hashMap = g21.P;
                if (hashMap != null) {
                    hashMap.remove(Integer.valueOf(g21.p(fjVar)));
                }
                message2.voiceTranscription = str3;
                if (iArr.length <= 0) {
                    iArr = null;
                }
                message2.voiceTranscriptionWords = iArr;
                message2.voiceTranscriptionLocal = true;
                message2.voiceTranscriptionFinal = true;
                message2.voiceTranscriptionOpen = true;
                message2.voiceTranscriptionId = 0L;
                g21.o(fjVar);
                tr a02 = tr.a0(i16);
                a02.a.c(new org.telegram.messenger.z1(a02, fjVar.e1(), j13, message2, str3, 2));
                ks f10 = ks.f(i16);
                Boolean bool2 = Boolean.TRUE;
                f10.k(ks.A1, fjVar, null, null, bool2, bool2);
                break;
            default:
                final mf0 mf0Var = (mf0) this.d;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.e;
                TLObject tLObject2 = (TLObject) this.f;
                long j14 = this.c;
                final int i17 = this.b;
                TLRPC.Chat chat = (TLRPC.Chat) this.h;
                if (tL_error2 != null || !(tLObject2 instanceof Vector)) {
                    mf0Var.b();
                    break;
                } else {
                    Vector vector2 = (Vector) tLObject2;
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList arrayList3 = new ArrayList();
                    final HashMap hashMap2 = new HashMap();
                    final ArrayList arrayList4 = new ArrayList();
                    int size2 = vector2.objects.size();
                    int i18 = 0;
                    while (i18 < size2) {
                        Object obj2 = vector2.objects.get(i18);
                        if (obj2 instanceof TLRPC.TL_readParticipantDate) {
                            TLRPC.TL_readParticipantDate tL_readParticipantDate = (TLRPC.TL_readParticipantDate) obj2;
                            int i19 = tL_readParticipantDate.date;
                            i7 = i18;
                            long j15 = tL_readParticipantDate.user_id;
                            Long valueOf = Long.valueOf(j15);
                            if (j14 != j15) {
                                mp.u1(i17).c2(valueOf);
                                arrayList4.add(new Pair(valueOf, Integer.valueOf(i19)));
                                arrayList2.add(valueOf);
                            }
                        } else {
                            i7 = i18;
                            if (obj2 instanceof Long) {
                                Long l10 = (Long) obj2;
                                if (j14 != l10.longValue()) {
                                    if (l10.longValue() > 0) {
                                        mp.u1(i17).c2(l10);
                                        arrayList4.add(new Pair(l10, 0));
                                        arrayList2.add(l10);
                                    } else {
                                        vector = vector2;
                                        mp.u1(i17).O0(Long.valueOf(-l10.longValue()));
                                        arrayList4.add(new Pair(l10, 0));
                                        arrayList3.add(l10);
                                        i18 = i7 + 1;
                                        vector2 = vector;
                                    }
                                }
                            }
                        }
                        vector = vector2;
                        i18 = i7 + 1;
                        vector2 = vector;
                    }
                    if (arrayList2.isEmpty()) {
                        for (int i20 = 0; i20 < arrayList4.size(); i20++) {
                            Pair pair = (Pair) arrayList4.get(i20);
                            mf0Var.a.add((Long) pair.first);
                            mf0Var.b.add((Integer) pair.second);
                            mf0Var.c.add((TLObject) hashMap2.get(pair.first));
                        }
                        mf0Var.b();
                        break;
                    } else if (org.telegram.messenger.v3.T(chat)) {
                        TLRPC.TL_channels_getParticipants tL_channels_getParticipants = new TLRPC.TL_channels_getParticipants();
                        tL_channels_getParticipants.limit = mp.u1(i17).s3;
                        tL_channels_getParticipants.offset = 0;
                        tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsRecent();
                        tL_channels_getParticipants.channel = mp.u1(i17).j1(chat.id);
                        final int i21 = 0;
                        ConnectionsManager.getInstance(i17).sendRequest(tL_channels_getParticipants, new RequestDelegate() { // from class: org.telegram.ui.jf0
                            @Override // org.telegram.tgnet.RequestDelegate
                            public final void run(final TLObject tLObject3, TLRPC.TL_error tL_error3) {
                                switch (i21) {
                                    case 0:
                                        final int i22 = 0;
                                        final mf0 mf0Var2 = mf0Var;
                                        final int i23 = i17;
                                        final HashMap hashMap3 = hashMap2;
                                        final ArrayList arrayList5 = arrayList4;
                                        org.telegram.messenger.g0.g3(new Runnable() { // from class: org.telegram.ui.kf0
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                switch (i22) {
                                                    case 0:
                                                        mf0 mf0Var3 = mf0Var2;
                                                        TLObject tLObject4 = tLObject3;
                                                        if (tLObject4 != null) {
                                                            mf0Var3.getClass();
                                                            TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject4;
                                                            int i24 = 0;
                                                            int i25 = 0;
                                                            while (true) {
                                                                int size3 = tL_channels_channelParticipants.users.size();
                                                                HashMap hashMap4 = hashMap3;
                                                                if (i25 < size3) {
                                                                    TLRPC.User user = tL_channels_channelParticipants.users.get(i25);
                                                                    org.telegram.messenger.mp.u1(i23).e4(user, false, false);
                                                                    hashMap4.put(Long.valueOf(user.id), user);
                                                                    i25++;
                                                                } else {
                                                                    while (true) {
                                                                        ArrayList arrayList6 = arrayList5;
                                                                        if (i24 < arrayList6.size()) {
                                                                            Pair pair2 = (Pair) arrayList6.get(i24);
                                                                            mf0Var3.a.add((Long) pair2.first);
                                                                            mf0Var3.b.add((Integer) pair2.second);
                                                                            mf0Var3.c.add((TLObject) hashMap4.get(pair2.first));
                                                                            i24++;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        mf0Var3.b();
                                                        break;
                                                    default:
                                                        mf0 mf0Var4 = mf0Var2;
                                                        TLObject tLObject5 = tLObject3;
                                                        if (tLObject5 != null) {
                                                            mf0Var4.getClass();
                                                            TLRPC.TL_messages_chatFull tL_messages_chatFull = (TLRPC.TL_messages_chatFull) tLObject5;
                                                            int i26 = 0;
                                                            int i27 = 0;
                                                            while (true) {
                                                                int size4 = tL_messages_chatFull.users.size();
                                                                HashMap hashMap5 = hashMap3;
                                                                if (i27 < size4) {
                                                                    TLRPC.User user2 = tL_messages_chatFull.users.get(i27);
                                                                    org.telegram.messenger.mp.u1(i23).e4(user2, false, false);
                                                                    hashMap5.put(Long.valueOf(user2.id), user2);
                                                                    i27++;
                                                                } else {
                                                                    while (true) {
                                                                        ArrayList arrayList7 = arrayList5;
                                                                        if (i26 < arrayList7.size()) {
                                                                            Pair pair3 = (Pair) arrayList7.get(i26);
                                                                            mf0Var4.a.add((Long) pair3.first);
                                                                            mf0Var4.b.add((Integer) pair3.second);
                                                                            mf0Var4.c.add((TLObject) hashMap5.get(pair3.first));
                                                                            i26++;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        mf0Var4.b();
                                                        break;
                                                }
                                            }
                                        });
                                        break;
                                    default:
                                        final int i24 = 1;
                                        final mf0 mf0Var3 = mf0Var;
                                        final int i25 = i17;
                                        final HashMap hashMap4 = hashMap2;
                                        final ArrayList arrayList6 = arrayList4;
                                        org.telegram.messenger.g0.g3(new Runnable() { // from class: org.telegram.ui.kf0
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                switch (i24) {
                                                    case 0:
                                                        mf0 mf0Var32 = mf0Var3;
                                                        TLObject tLObject4 = tLObject3;
                                                        if (tLObject4 != null) {
                                                            mf0Var32.getClass();
                                                            TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject4;
                                                            int i242 = 0;
                                                            int i252 = 0;
                                                            while (true) {
                                                                int size3 = tL_channels_channelParticipants.users.size();
                                                                HashMap hashMap42 = hashMap4;
                                                                if (i252 < size3) {
                                                                    TLRPC.User user = tL_channels_channelParticipants.users.get(i252);
                                                                    org.telegram.messenger.mp.u1(i25).e4(user, false, false);
                                                                    hashMap42.put(Long.valueOf(user.id), user);
                                                                    i252++;
                                                                } else {
                                                                    while (true) {
                                                                        ArrayList arrayList62 = arrayList6;
                                                                        if (i242 < arrayList62.size()) {
                                                                            Pair pair2 = (Pair) arrayList62.get(i242);
                                                                            mf0Var32.a.add((Long) pair2.first);
                                                                            mf0Var32.b.add((Integer) pair2.second);
                                                                            mf0Var32.c.add((TLObject) hashMap42.get(pair2.first));
                                                                            i242++;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        mf0Var32.b();
                                                        break;
                                                    default:
                                                        mf0 mf0Var4 = mf0Var3;
                                                        TLObject tLObject5 = tLObject3;
                                                        if (tLObject5 != null) {
                                                            mf0Var4.getClass();
                                                            TLRPC.TL_messages_chatFull tL_messages_chatFull = (TLRPC.TL_messages_chatFull) tLObject5;
                                                            int i26 = 0;
                                                            int i27 = 0;
                                                            while (true) {
                                                                int size4 = tL_messages_chatFull.users.size();
                                                                HashMap hashMap5 = hashMap4;
                                                                if (i27 < size4) {
                                                                    TLRPC.User user2 = tL_messages_chatFull.users.get(i27);
                                                                    org.telegram.messenger.mp.u1(i25).e4(user2, false, false);
                                                                    hashMap5.put(Long.valueOf(user2.id), user2);
                                                                    i27++;
                                                                } else {
                                                                    while (true) {
                                                                        ArrayList arrayList7 = arrayList6;
                                                                        if (i26 < arrayList7.size()) {
                                                                            Pair pair3 = (Pair) arrayList7.get(i26);
                                                                            mf0Var4.a.add((Long) pair3.first);
                                                                            mf0Var4.b.add((Integer) pair3.second);
                                                                            mf0Var4.c.add((TLObject) hashMap5.get(pair3.first));
                                                                            i26++;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        mf0Var4.b();
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
                        final int i22 = 1;
                        ConnectionsManager.getInstance(i17).sendRequest(tL_messages_getFullChat, new RequestDelegate() { // from class: org.telegram.ui.jf0
                            @Override // org.telegram.tgnet.RequestDelegate
                            public final void run(final TLObject tLObject3, TLRPC.TL_error tL_error3) {
                                switch (i22) {
                                    case 0:
                                        final int i222 = 0;
                                        final mf0 mf0Var2 = mf0Var;
                                        final int i23 = i17;
                                        final HashMap hashMap3 = hashMap2;
                                        final ArrayList arrayList5 = arrayList4;
                                        org.telegram.messenger.g0.g3(new Runnable() { // from class: org.telegram.ui.kf0
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                switch (i222) {
                                                    case 0:
                                                        mf0 mf0Var32 = mf0Var2;
                                                        TLObject tLObject4 = tLObject3;
                                                        if (tLObject4 != null) {
                                                            mf0Var32.getClass();
                                                            TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject4;
                                                            int i242 = 0;
                                                            int i252 = 0;
                                                            while (true) {
                                                                int size3 = tL_channels_channelParticipants.users.size();
                                                                HashMap hashMap42 = hashMap3;
                                                                if (i252 < size3) {
                                                                    TLRPC.User user = tL_channels_channelParticipants.users.get(i252);
                                                                    org.telegram.messenger.mp.u1(i23).e4(user, false, false);
                                                                    hashMap42.put(Long.valueOf(user.id), user);
                                                                    i252++;
                                                                } else {
                                                                    while (true) {
                                                                        ArrayList arrayList62 = arrayList5;
                                                                        if (i242 < arrayList62.size()) {
                                                                            Pair pair2 = (Pair) arrayList62.get(i242);
                                                                            mf0Var32.a.add((Long) pair2.first);
                                                                            mf0Var32.b.add((Integer) pair2.second);
                                                                            mf0Var32.c.add((TLObject) hashMap42.get(pair2.first));
                                                                            i242++;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        mf0Var32.b();
                                                        break;
                                                    default:
                                                        mf0 mf0Var4 = mf0Var2;
                                                        TLObject tLObject5 = tLObject3;
                                                        if (tLObject5 != null) {
                                                            mf0Var4.getClass();
                                                            TLRPC.TL_messages_chatFull tL_messages_chatFull = (TLRPC.TL_messages_chatFull) tLObject5;
                                                            int i26 = 0;
                                                            int i27 = 0;
                                                            while (true) {
                                                                int size4 = tL_messages_chatFull.users.size();
                                                                HashMap hashMap5 = hashMap3;
                                                                if (i27 < size4) {
                                                                    TLRPC.User user2 = tL_messages_chatFull.users.get(i27);
                                                                    org.telegram.messenger.mp.u1(i23).e4(user2, false, false);
                                                                    hashMap5.put(Long.valueOf(user2.id), user2);
                                                                    i27++;
                                                                } else {
                                                                    while (true) {
                                                                        ArrayList arrayList7 = arrayList5;
                                                                        if (i26 < arrayList7.size()) {
                                                                            Pair pair3 = (Pair) arrayList7.get(i26);
                                                                            mf0Var4.a.add((Long) pair3.first);
                                                                            mf0Var4.b.add((Integer) pair3.second);
                                                                            mf0Var4.c.add((TLObject) hashMap5.get(pair3.first));
                                                                            i26++;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        mf0Var4.b();
                                                        break;
                                                }
                                            }
                                        });
                                        break;
                                    default:
                                        final int i24 = 1;
                                        final mf0 mf0Var3 = mf0Var;
                                        final int i25 = i17;
                                        final HashMap hashMap4 = hashMap2;
                                        final ArrayList arrayList6 = arrayList4;
                                        org.telegram.messenger.g0.g3(new Runnable() { // from class: org.telegram.ui.kf0
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                switch (i24) {
                                                    case 0:
                                                        mf0 mf0Var32 = mf0Var3;
                                                        TLObject tLObject4 = tLObject3;
                                                        if (tLObject4 != null) {
                                                            mf0Var32.getClass();
                                                            TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject4;
                                                            int i242 = 0;
                                                            int i252 = 0;
                                                            while (true) {
                                                                int size3 = tL_channels_channelParticipants.users.size();
                                                                HashMap hashMap42 = hashMap4;
                                                                if (i252 < size3) {
                                                                    TLRPC.User user = tL_channels_channelParticipants.users.get(i252);
                                                                    org.telegram.messenger.mp.u1(i25).e4(user, false, false);
                                                                    hashMap42.put(Long.valueOf(user.id), user);
                                                                    i252++;
                                                                } else {
                                                                    while (true) {
                                                                        ArrayList arrayList62 = arrayList6;
                                                                        if (i242 < arrayList62.size()) {
                                                                            Pair pair2 = (Pair) arrayList62.get(i242);
                                                                            mf0Var32.a.add((Long) pair2.first);
                                                                            mf0Var32.b.add((Integer) pair2.second);
                                                                            mf0Var32.c.add((TLObject) hashMap42.get(pair2.first));
                                                                            i242++;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        mf0Var32.b();
                                                        break;
                                                    default:
                                                        mf0 mf0Var4 = mf0Var3;
                                                        TLObject tLObject5 = tLObject3;
                                                        if (tLObject5 != null) {
                                                            mf0Var4.getClass();
                                                            TLRPC.TL_messages_chatFull tL_messages_chatFull = (TLRPC.TL_messages_chatFull) tLObject5;
                                                            int i26 = 0;
                                                            int i27 = 0;
                                                            while (true) {
                                                                int size4 = tL_messages_chatFull.users.size();
                                                                HashMap hashMap5 = hashMap4;
                                                                if (i27 < size4) {
                                                                    TLRPC.User user2 = tL_messages_chatFull.users.get(i27);
                                                                    org.telegram.messenger.mp.u1(i25).e4(user2, false, false);
                                                                    hashMap5.put(Long.valueOf(user2.id), user2);
                                                                    i27++;
                                                                } else {
                                                                    while (true) {
                                                                        ArrayList arrayList7 = arrayList6;
                                                                        if (i26 < arrayList7.size()) {
                                                                            Pair pair3 = (Pair) arrayList7.get(i26);
                                                                            mf0Var4.a.add((Long) pair3.first);
                                                                            mf0Var4.b.add((Integer) pair3.second);
                                                                            mf0Var4.c.add((TLObject) hashMap5.get(pair3.first));
                                                                            i26++;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        mf0Var4.b();
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

    public /* synthetic */ l4(a1.c cVar, ArrayList arrayList, int i7, long j3, ArrayList arrayList2, ArrayList arrayList3) {
        this.a = 1;
        this.d = cVar;
        this.e = arrayList;
        this.b = i7;
        this.c = j3;
        this.f = arrayList2;
        this.h = arrayList3;
    }

    public /* synthetic */ l4(di.k1 k1Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, Boolean bool, String str, int i7, long j3) {
        this.a = 0;
        this.d = k1Var;
        this.e = tL_starGiftUnique;
        this.f = bool;
        this.h = str;
        this.b = i7;
        this.c = j3;
    }

    public /* synthetic */ l4(Object obj, TLObject tLObject, Object obj2, long j3, int i7, Object obj3, int i10) {
        this.a = i10;
        this.d = obj;
        this.e = tLObject;
        this.f = obj2;
        this.c = j3;
        this.b = i7;
        this.h = obj3;
    }

    public /* synthetic */ l4(fj fjVar, TLRPC.Message message, String str, int[] iArr, int i7, long j3) {
        this.a = 6;
        this.d = fjVar;
        this.e = message;
        this.h = str;
        this.f = iArr;
        this.b = i7;
        this.c = j3;
    }

    public /* synthetic */ l4(e00 e00Var, TLRPC.TL_messages_forumTopics tL_messages_forumTopics, long j3, TLRPC.TL_messages_forumTopics tL_messages_forumTopics2, a0.h hVar, int i7) {
        this.a = 3;
        this.d = e00Var;
        this.e = tL_messages_forumTopics;
        this.c = j3;
        this.f = tL_messages_forumTopics2;
        this.h = hVar;
        this.b = i7;
    }

    public /* synthetic */ l4(TLObject tLObject, int i7, hi.d dVar, org.telegram.ui.ActionBar.x2 x2Var, long j3, TLRPC.TL_error tL_error) {
        this.a = 5;
        this.d = tLObject;
        this.b = i7;
        this.e = dVar;
        this.f = x2Var;
        this.c = j3;
        this.h = tL_error;
    }
}
