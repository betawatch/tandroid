package org.telegram.messenger;

import android.content.Context;
import android.util.Pair;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.pg0;
import org.telegram.ui.wa1;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final /* synthetic */ class o00 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;

    public /* synthetic */ o00(int i10, long j10, Context context, TL_payments.connectedBotStarRef connectedbotstarref, org.telegram.ui.ActionBar.z2 z2Var, org.telegram.ui.ActionBar.p6 p6Var) {
        this.a = 5;
        this.c = i10;
        this.d = context;
        this.b = j10;
        this.e = connectedbotstarref;
        this.f = z2Var;
        this.h = p6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long j10;
        switch (this.a) {
            case 0:
                y00 y00Var = (y00) this.d;
                TLRPC.TL_messages_forumTopics tL_messages_forumTopics = (TLRPC.TL_messages_forumTopics) this.e;
                long j11 = this.b;
                TLRPC.TL_messages_forumTopics tL_messages_forumTopics2 = (TLRPC.TL_messages_forumTopics) this.f;
                a0.h hVar = (a0.h) this.h;
                int i10 = this.c;
                y00Var.getMessagesStorage().m1(tL_messages_forumTopics.users, tL_messages_forumTopics.chats, true, true);
                y00Var.getMessagesController().V3(tL_messages_forumTopics.users, false);
                y00Var.getMessagesController().P3(tL_messages_forumTopics.chats, false);
                y00Var.c.put(j11, 0);
                y00Var.u(j11, tL_messages_forumTopics2.topics, hVar, false, i10, tL_messages_forumTopics.count);
                y00Var.y(j11, true);
                y00Var.getMessagesStorage().C1(y00Var.getConnectionsManager().getCurrentTime(), -j11, (List) y00Var.a.f(j11), true);
                y00Var.getMessagesStorage().j1(tL_messages_forumTopics2.messages, false, true, false, 0, false, 0, 0L);
                if (tL_messages_forumTopics2.topics.isEmpty() || i10 != 1) {
                    if (y00Var.l(j11) == null || y00Var.l(j11).size() < tL_messages_forumTopics2.count) {
                        y00Var.h.l(j11);
                        y00Var.o(j11);
                        break;
                    }
                } else {
                    TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) i0.a.g(1, tL_messages_forumTopics2.topics);
                    TLRPC.Message message = (TLRPC.Message) hVar.f(tL_forumTopic.top_message);
                    y00Var.x(j11, tL_forumTopic.id, tL_forumTopic.top_message, message != null ? message.date : 0);
                    break;
                }
                break;
            case 1:
                org.telegram.ui.Cells.i6.a((org.telegram.ui.Cells.i6) this.d, (TLObject) this.e, (is) this.f, this.b, this.c, (ArrayList) this.h);
                break;
            case 2:
                TLObject tLObject = (TLObject) this.d;
                int i11 = this.c;
                vh.d dVar = (vh.d) this.e;
                org.telegram.ui.ActionBar.z2 z2Var = (org.telegram.ui.ActionBar.z2) this.f;
                long j12 = this.b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.h;
                TLRPC.GroupCall groupCall = null;
                if (tLObject instanceof TLRPC.Updates) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                    wp.r1(i11).V3(updates.users, false);
                    wp.r1(i11).P3(updates.chats, false);
                    ArrayList y02 = wp.y0(updates, TL_update.TL_updateGroupCall.class);
                    int size = y02.size();
                    int i12 = 0;
                    while (i12 < size) {
                        Object obj = y02.get(i12);
                        i12++;
                        groupCall = ((TL_update.TL_updateGroupCall) obj).call;
                    }
                    Utilities.d.c(new org.telegram.tgnet.h(i11, updates, 1));
                    if (groupCall != null && LaunchActivity.I1 != null) {
                        z2Var.dismiss();
                        rz.C(i11).r0(pz.a(j12, groupCall.invite_link));
                        org.telegram.ui.ActionBar.k2 T = LaunchActivity.T();
                        if (T != null) {
                            if (T instanceof org.telegram.ui.un) {
                                org.telegram.ui.un unVar = (org.telegram.ui.un) T;
                                if (unVar.a() == j12 && unVar.f4 == 0) {
                                }
                            }
                            T.presentFragment(org.telegram.ui.un.ma(j12));
                            break;
                        }
                    } else {
                        dVar.setLoading(false);
                        break;
                    }
                } else if (tLObject instanceof TL_phone.groupCall) {
                    TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject;
                    wp.r1(i11).V3(groupcall.users, false);
                    wp.r1(i11).P3(groupcall.chats, false);
                    if (LaunchActivity.I1 == null) {
                        dVar.setLoading(false);
                        break;
                    } else {
                        TLRPC.TL_inputGroupCall tL_inputGroupCall = new TLRPC.TL_inputGroupCall();
                        TLRPC.GroupCall groupCall2 = groupcall.call;
                        tL_inputGroupCall.id = groupCall2.id;
                        tL_inputGroupCall.access_hash = groupCall2.access_hash;
                        z2Var.dismiss();
                        org.telegram.ui.Components.voip.n1.g(LaunchActivity.I1, i11, tL_inputGroupCall, false, groupcall.call, null);
                        rz.C(i11).r0(pz.a(j12, groupcall.call.invite_link));
                        break;
                    }
                } else if (tL_error != null) {
                    org.telegram.ui.Cells.f1.s(z2Var.E, null, tL_error, false);
                    break;
                }
                break;
            case 3:
                final pg0 pg0Var = (pg0) this.d;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.e;
                TLObject tLObject2 = (TLObject) this.f;
                long j13 = this.b;
                final int i13 = this.c;
                TLRPC.Chat chat = (TLRPC.Chat) this.h;
                if (tL_error2 != null || !(tLObject2 instanceof Vector)) {
                    pg0Var.b();
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
                            j10 = j14;
                            long j15 = tL_readParticipantDate.user_id;
                            Long valueOf = Long.valueOf(j15);
                            if (j10 != j15) {
                                wp.r1(i13).Z1(valueOf);
                                arrayList3.add(new Pair(valueOf, Integer.valueOf(i15)));
                                arrayList.add(valueOf);
                            }
                        } else {
                            j10 = j14;
                            if (obj2 instanceof Long) {
                                Long l4 = (Long) obj2;
                                if (j10 != l4.longValue()) {
                                    if (l4.longValue() > 0) {
                                        wp.r1(i13).Z1(l4);
                                        arrayList3.add(new Pair(l4, 0));
                                        arrayList.add(l4);
                                    } else {
                                        wp.r1(i13).L0(Long.valueOf(-l4.longValue()));
                                        arrayList3.add(new Pair(l4, 0));
                                        arrayList2.add(l4);
                                    }
                                }
                            }
                        }
                        i14++;
                        j14 = j10;
                    }
                    if (arrayList.isEmpty()) {
                        for (int i16 = 0; i16 < arrayList3.size(); i16++) {
                            Pair pair = (Pair) arrayList3.get(i16);
                            pg0Var.a.add((Long) pair.first);
                            pg0Var.b.add((Integer) pair.second);
                            pg0Var.c.add((TLObject) hashMap.get(pair.first));
                        }
                        pg0Var.b();
                        break;
                    } else if (w3.T(chat)) {
                        TLRPC.TL_channels_getParticipants tL_channels_getParticipants = new TLRPC.TL_channels_getParticipants();
                        tL_channels_getParticipants.limit = wp.r1(i13).p3;
                        tL_channels_getParticipants.offset = 0;
                        tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsRecent();
                        tL_channels_getParticipants.channel = wp.r1(i13).g1(chat.id);
                        final int i17 = 0;
                        ConnectionsManager.getInstance(i13).sendRequest(tL_channels_getParticipants, new RequestDelegate() { // from class: org.telegram.ui.mg0
                            @Override // org.telegram.tgnet.RequestDelegate
                            public final void run(final TLObject tLObject3, TLRPC.TL_error tL_error3) {
                                switch (i17) {
                                    case 0:
                                        final int i18 = 0;
                                        final pg0 pg0Var2 = pg0Var;
                                        final int i19 = i13;
                                        final HashMap hashMap2 = hashMap;
                                        final ArrayList arrayList4 = arrayList3;
                                        org.telegram.messenger.i0.g3(new Runnable() { // from class: org.telegram.ui.ng0
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                switch (i18) {
                                                    case 0:
                                                        pg0 pg0Var3 = pg0Var2;
                                                        TLObject tLObject4 = tLObject3;
                                                        if (tLObject4 != null) {
                                                            pg0Var3.getClass();
                                                            TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject4;
                                                            int i20 = 0;
                                                            int i21 = 0;
                                                            while (true) {
                                                                int size3 = tL_channels_channelParticipants.users.size();
                                                                HashMap hashMap3 = hashMap2;
                                                                if (i21 < size3) {
                                                                    TLRPC.User user = tL_channels_channelParticipants.users.get(i21);
                                                                    org.telegram.messenger.wp.r1(i19).U3(user, false, false);
                                                                    hashMap3.put(Long.valueOf(user.id), user);
                                                                    i21++;
                                                                } else {
                                                                    while (true) {
                                                                        ArrayList arrayList5 = arrayList4;
                                                                        if (i20 < arrayList5.size()) {
                                                                            Pair pair2 = (Pair) arrayList5.get(i20);
                                                                            pg0Var3.a.add((Long) pair2.first);
                                                                            pg0Var3.b.add((Integer) pair2.second);
                                                                            pg0Var3.c.add((TLObject) hashMap3.get(pair2.first));
                                                                            i20++;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        pg0Var3.b();
                                                        break;
                                                    default:
                                                        pg0 pg0Var4 = pg0Var2;
                                                        TLObject tLObject5 = tLObject3;
                                                        if (tLObject5 != null) {
                                                            pg0Var4.getClass();
                                                            TLRPC.TL_messages_chatFull tL_messages_chatFull = (TLRPC.TL_messages_chatFull) tLObject5;
                                                            int i22 = 0;
                                                            int i23 = 0;
                                                            while (true) {
                                                                int size4 = tL_messages_chatFull.users.size();
                                                                HashMap hashMap4 = hashMap2;
                                                                if (i23 < size4) {
                                                                    TLRPC.User user2 = tL_messages_chatFull.users.get(i23);
                                                                    org.telegram.messenger.wp.r1(i19).U3(user2, false, false);
                                                                    hashMap4.put(Long.valueOf(user2.id), user2);
                                                                    i23++;
                                                                } else {
                                                                    while (true) {
                                                                        ArrayList arrayList6 = arrayList4;
                                                                        if (i22 < arrayList6.size()) {
                                                                            Pair pair3 = (Pair) arrayList6.get(i22);
                                                                            pg0Var4.a.add((Long) pair3.first);
                                                                            pg0Var4.b.add((Integer) pair3.second);
                                                                            pg0Var4.c.add((TLObject) hashMap4.get(pair3.first));
                                                                            i22++;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        pg0Var4.b();
                                                        break;
                                                }
                                            }
                                        });
                                        break;
                                    default:
                                        final int i20 = 1;
                                        final pg0 pg0Var3 = pg0Var;
                                        final int i21 = i13;
                                        final HashMap hashMap3 = hashMap;
                                        final ArrayList arrayList5 = arrayList3;
                                        org.telegram.messenger.i0.g3(new Runnable() { // from class: org.telegram.ui.ng0
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                switch (i20) {
                                                    case 0:
                                                        pg0 pg0Var32 = pg0Var3;
                                                        TLObject tLObject4 = tLObject3;
                                                        if (tLObject4 != null) {
                                                            pg0Var32.getClass();
                                                            TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject4;
                                                            int i202 = 0;
                                                            int i212 = 0;
                                                            while (true) {
                                                                int size3 = tL_channels_channelParticipants.users.size();
                                                                HashMap hashMap32 = hashMap3;
                                                                if (i212 < size3) {
                                                                    TLRPC.User user = tL_channels_channelParticipants.users.get(i212);
                                                                    org.telegram.messenger.wp.r1(i21).U3(user, false, false);
                                                                    hashMap32.put(Long.valueOf(user.id), user);
                                                                    i212++;
                                                                } else {
                                                                    while (true) {
                                                                        ArrayList arrayList52 = arrayList5;
                                                                        if (i202 < arrayList52.size()) {
                                                                            Pair pair2 = (Pair) arrayList52.get(i202);
                                                                            pg0Var32.a.add((Long) pair2.first);
                                                                            pg0Var32.b.add((Integer) pair2.second);
                                                                            pg0Var32.c.add((TLObject) hashMap32.get(pair2.first));
                                                                            i202++;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        pg0Var32.b();
                                                        break;
                                                    default:
                                                        pg0 pg0Var4 = pg0Var3;
                                                        TLObject tLObject5 = tLObject3;
                                                        if (tLObject5 != null) {
                                                            pg0Var4.getClass();
                                                            TLRPC.TL_messages_chatFull tL_messages_chatFull = (TLRPC.TL_messages_chatFull) tLObject5;
                                                            int i22 = 0;
                                                            int i23 = 0;
                                                            while (true) {
                                                                int size4 = tL_messages_chatFull.users.size();
                                                                HashMap hashMap4 = hashMap3;
                                                                if (i23 < size4) {
                                                                    TLRPC.User user2 = tL_messages_chatFull.users.get(i23);
                                                                    org.telegram.messenger.wp.r1(i21).U3(user2, false, false);
                                                                    hashMap4.put(Long.valueOf(user2.id), user2);
                                                                    i23++;
                                                                } else {
                                                                    while (true) {
                                                                        ArrayList arrayList6 = arrayList5;
                                                                        if (i22 < arrayList6.size()) {
                                                                            Pair pair3 = (Pair) arrayList6.get(i22);
                                                                            pg0Var4.a.add((Long) pair3.first);
                                                                            pg0Var4.b.add((Integer) pair3.second);
                                                                            pg0Var4.c.add((TLObject) hashMap4.get(pair3.first));
                                                                            i22++;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        pg0Var4.b();
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
                        ConnectionsManager.getInstance(i13).sendRequest(tL_messages_getFullChat, new RequestDelegate() { // from class: org.telegram.ui.mg0
                            @Override // org.telegram.tgnet.RequestDelegate
                            public final void run(final TLObject tLObject3, TLRPC.TL_error tL_error3) {
                                switch (i18) {
                                    case 0:
                                        final int i182 = 0;
                                        final pg0 pg0Var2 = pg0Var;
                                        final int i19 = i13;
                                        final HashMap hashMap2 = hashMap;
                                        final ArrayList arrayList4 = arrayList3;
                                        org.telegram.messenger.i0.g3(new Runnable() { // from class: org.telegram.ui.ng0
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                switch (i182) {
                                                    case 0:
                                                        pg0 pg0Var32 = pg0Var2;
                                                        TLObject tLObject4 = tLObject3;
                                                        if (tLObject4 != null) {
                                                            pg0Var32.getClass();
                                                            TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject4;
                                                            int i202 = 0;
                                                            int i212 = 0;
                                                            while (true) {
                                                                int size3 = tL_channels_channelParticipants.users.size();
                                                                HashMap hashMap32 = hashMap2;
                                                                if (i212 < size3) {
                                                                    TLRPC.User user = tL_channels_channelParticipants.users.get(i212);
                                                                    org.telegram.messenger.wp.r1(i19).U3(user, false, false);
                                                                    hashMap32.put(Long.valueOf(user.id), user);
                                                                    i212++;
                                                                } else {
                                                                    while (true) {
                                                                        ArrayList arrayList52 = arrayList4;
                                                                        if (i202 < arrayList52.size()) {
                                                                            Pair pair2 = (Pair) arrayList52.get(i202);
                                                                            pg0Var32.a.add((Long) pair2.first);
                                                                            pg0Var32.b.add((Integer) pair2.second);
                                                                            pg0Var32.c.add((TLObject) hashMap32.get(pair2.first));
                                                                            i202++;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        pg0Var32.b();
                                                        break;
                                                    default:
                                                        pg0 pg0Var4 = pg0Var2;
                                                        TLObject tLObject5 = tLObject3;
                                                        if (tLObject5 != null) {
                                                            pg0Var4.getClass();
                                                            TLRPC.TL_messages_chatFull tL_messages_chatFull = (TLRPC.TL_messages_chatFull) tLObject5;
                                                            int i22 = 0;
                                                            int i23 = 0;
                                                            while (true) {
                                                                int size4 = tL_messages_chatFull.users.size();
                                                                HashMap hashMap4 = hashMap2;
                                                                if (i23 < size4) {
                                                                    TLRPC.User user2 = tL_messages_chatFull.users.get(i23);
                                                                    org.telegram.messenger.wp.r1(i19).U3(user2, false, false);
                                                                    hashMap4.put(Long.valueOf(user2.id), user2);
                                                                    i23++;
                                                                } else {
                                                                    while (true) {
                                                                        ArrayList arrayList6 = arrayList4;
                                                                        if (i22 < arrayList6.size()) {
                                                                            Pair pair3 = (Pair) arrayList6.get(i22);
                                                                            pg0Var4.a.add((Long) pair3.first);
                                                                            pg0Var4.b.add((Integer) pair3.second);
                                                                            pg0Var4.c.add((TLObject) hashMap4.get(pair3.first));
                                                                            i22++;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        pg0Var4.b();
                                                        break;
                                                }
                                            }
                                        });
                                        break;
                                    default:
                                        final int i20 = 1;
                                        final pg0 pg0Var3 = pg0Var;
                                        final int i21 = i13;
                                        final HashMap hashMap3 = hashMap;
                                        final ArrayList arrayList5 = arrayList3;
                                        org.telegram.messenger.i0.g3(new Runnable() { // from class: org.telegram.ui.ng0
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                switch (i20) {
                                                    case 0:
                                                        pg0 pg0Var32 = pg0Var3;
                                                        TLObject tLObject4 = tLObject3;
                                                        if (tLObject4 != null) {
                                                            pg0Var32.getClass();
                                                            TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject4;
                                                            int i202 = 0;
                                                            int i212 = 0;
                                                            while (true) {
                                                                int size3 = tL_channels_channelParticipants.users.size();
                                                                HashMap hashMap32 = hashMap3;
                                                                if (i212 < size3) {
                                                                    TLRPC.User user = tL_channels_channelParticipants.users.get(i212);
                                                                    org.telegram.messenger.wp.r1(i21).U3(user, false, false);
                                                                    hashMap32.put(Long.valueOf(user.id), user);
                                                                    i212++;
                                                                } else {
                                                                    while (true) {
                                                                        ArrayList arrayList52 = arrayList5;
                                                                        if (i202 < arrayList52.size()) {
                                                                            Pair pair2 = (Pair) arrayList52.get(i202);
                                                                            pg0Var32.a.add((Long) pair2.first);
                                                                            pg0Var32.b.add((Integer) pair2.second);
                                                                            pg0Var32.c.add((TLObject) hashMap32.get(pair2.first));
                                                                            i202++;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        pg0Var32.b();
                                                        break;
                                                    default:
                                                        pg0 pg0Var4 = pg0Var3;
                                                        TLObject tLObject5 = tLObject3;
                                                        if (tLObject5 != null) {
                                                            pg0Var4.getClass();
                                                            TLRPC.TL_messages_chatFull tL_messages_chatFull = (TLRPC.TL_messages_chatFull) tLObject5;
                                                            int i22 = 0;
                                                            int i23 = 0;
                                                            while (true) {
                                                                int size4 = tL_messages_chatFull.users.size();
                                                                HashMap hashMap4 = hashMap3;
                                                                if (i23 < size4) {
                                                                    TLRPC.User user2 = tL_messages_chatFull.users.get(i23);
                                                                    org.telegram.messenger.wp.r1(i21).U3(user2, false, false);
                                                                    hashMap4.put(Long.valueOf(user2.id), user2);
                                                                    i23++;
                                                                } else {
                                                                    while (true) {
                                                                        ArrayList arrayList6 = arrayList5;
                                                                        if (i22 < arrayList6.size()) {
                                                                            Pair pair3 = (Pair) arrayList6.get(i22);
                                                                            pg0Var4.a.add((Long) pair3.first);
                                                                            pg0Var4.b.add((Integer) pair3.second);
                                                                            pg0Var4.c.add((TLObject) hashMap4.get(pair3.first));
                                                                            i22++;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        pg0Var4.b();
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
            case 4:
                ((rh.d0) this.d).k((ArrayList) this.e, Integer.valueOf(this.c), Long.valueOf(this.b), (ArrayList) this.f, (ArrayList) this.h);
                break;
            default:
                int i19 = this.c;
                Context context = (Context) this.d;
                long j16 = this.b;
                TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) this.e;
                rh.r.g(i19).f(context, j16, connectedbotstarref.bot_id, new wa1(i19, j16, context, connectedbotstarref, (org.telegram.ui.ActionBar.z2) this.f, (org.telegram.ui.ActionBar.p6) this.h));
                break;
        }
    }

    public /* synthetic */ o00(Object obj, TLObject tLObject, Object obj2, long j10, int i10, Object obj3, int i11) {
        this.a = i11;
        this.d = obj;
        this.e = tLObject;
        this.f = obj2;
        this.b = j10;
        this.c = i10;
        this.h = obj3;
    }

    public /* synthetic */ o00(y00 y00Var, TLRPC.TL_messages_forumTopics tL_messages_forumTopics, long j10, TLRPC.TL_messages_forumTopics tL_messages_forumTopics2, a0.h hVar, int i10) {
        this.a = 0;
        this.d = y00Var;
        this.e = tL_messages_forumTopics;
        this.b = j10;
        this.f = tL_messages_forumTopics2;
        this.h = hVar;
        this.c = i10;
    }

    public /* synthetic */ o00(TLObject tLObject, int i10, vh.d dVar, org.telegram.ui.ActionBar.z2 z2Var, long j10, TLRPC.TL_error tL_error) {
        this.a = 2;
        this.d = tLObject;
        this.c = i10;
        this.e = dVar;
        this.f = z2Var;
        this.b = j10;
        this.h = tL_error;
    }

    public /* synthetic */ o00(rh.d0 d0Var, ArrayList arrayList, int i10, long j10, ArrayList arrayList2, ArrayList arrayList3) {
        this.a = 4;
        this.d = d0Var;
        this.e = arrayList;
        this.c = i10;
        this.b = j10;
        this.f = arrayList2;
        this.h = arrayList3;
    }
}
