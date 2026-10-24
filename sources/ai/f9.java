package ai;

import android.content.Context;
import android.util.Pair;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.TopicsController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.sn;
import org.telegram.ui.uh0;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes4.dex */
public final /* synthetic */ class f9 implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;

    public /* synthetic */ f9(int i10, long j10, Context context, TL_payments.connectedBotStarRef connectedbotstarref, org.telegram.ui.ActionBar.h3 h3Var, org.telegram.ui.ActionBar.g6 g6Var) {
        this.b = i10;
        this.d = context;
        this.c = j10;
        this.e = connectedbotstarref;
        this.f = h3Var;
        this.h = g6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long j10;
        switch (this.a) {
            case 0:
                ((a1.c) this.d).run((ArrayList) this.e, Integer.valueOf(this.b), Long.valueOf(this.c), (ArrayList) this.f, (ArrayList) this.h);
                break;
            case 1:
                int i10 = this.b;
                Context context = (Context) this.d;
                long j11 = this.c;
                TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) this.e;
                k0.g(i10).f(context, j11, connectedbotstarref.bot_id, new gi.i3(i10, j11, context, connectedbotstarref, (org.telegram.ui.ActionBar.h3) this.f, (org.telegram.ui.ActionBar.g6) this.h));
                break;
            case 2:
                ((TopicsController) this.d).lambda$loadTopics$5((TLRPC.TL_messages_forumTopics) this.e, this.c, (TLRPC.TL_messages_forumTopics) this.f, (a0.h) this.h, this.b);
                break;
            case 3:
                org.telegram.ui.Cells.g6.a((org.telegram.ui.Cells.g6) this.d, (TLObject) this.f, (MessagesStorage) this.h, this.c, this.b, (ArrayList) this.e);
                break;
            case 4:
                TLObject tLObject = (TLObject) this.d;
                int i11 = this.b;
                ei.d dVar = (ei.d) this.e;
                org.telegram.ui.ActionBar.h3 h3Var = (org.telegram.ui.ActionBar.h3) this.f;
                long j12 = this.c;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.h;
                TLRPC.GroupCall groupCall = null;
                if (tLObject instanceof TLRPC.Updates) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                    MessagesController.getInstance(i11).putUsers(updates.users, false);
                    MessagesController.getInstance(i11).putChats(updates.chats, false);
                    ArrayList findUpdates = MessagesController.findUpdates(updates, TL_update.TL_updateGroupCall.class);
                    int size = findUpdates.size();
                    int i12 = 0;
                    while (i12 < size) {
                        Object obj = findUpdates.get(i12);
                        i12++;
                        groupCall = ((TL_update.TL_updateGroupCall) obj).call;
                    }
                    Utilities.stageQueue.postRunnable(new org.telegram.tgnet.g(i11, updates, 1));
                    if (groupCall != null && LaunchActivity.J1 != null) {
                        h3Var.dismiss();
                        SendMessagesHelper.getInstance(i11).sendMessage(SendMessagesHelper.SendMessageParams.of(groupCall.invite_link, j12));
                        org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                        if (U != null) {
                            if (U instanceof sn) {
                                sn snVar = (sn) U;
                                if (snVar.a() == j12 && snVar.d4 == 0) {
                                }
                            }
                            U.presentFragment(sn.W9(j12));
                            break;
                        }
                    } else {
                        dVar.setLoading(false);
                        break;
                    }
                } else if (tLObject instanceof TL_phone.groupCall) {
                    TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject;
                    MessagesController.getInstance(i11).putUsers(groupcall.users, false);
                    MessagesController.getInstance(i11).putChats(groupcall.chats, false);
                    if (LaunchActivity.J1 == null) {
                        dVar.setLoading(false);
                        break;
                    } else {
                        TLRPC.TL_inputGroupCall tL_inputGroupCall = new TLRPC.TL_inputGroupCall();
                        TLRPC.GroupCall groupCall2 = groupcall.call;
                        tL_inputGroupCall.id = groupCall2.id;
                        tL_inputGroupCall.access_hash = groupCall2.access_hash;
                        h3Var.dismiss();
                        org.telegram.ui.Components.voip.d2.g(LaunchActivity.J1, i11, tL_inputGroupCall, false, groupcall.call, null);
                        SendMessagesHelper.getInstance(i11).sendMessage(SendMessagesHelper.SendMessageParams.of(groupcall.call.invite_link, j12));
                        break;
                    }
                } else if (tL_error != null) {
                    org.telegram.ui.Cells.b1.s(h3Var.topBulletinContainer, null, tL_error, false);
                    break;
                }
                break;
            default:
                final uh0 uh0Var = (uh0) this.d;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.e;
                TLObject tLObject2 = (TLObject) this.f;
                long j13 = this.c;
                final int i13 = this.b;
                TLRPC.Chat chat = (TLRPC.Chat) this.h;
                if (tL_error2 != null || !(tLObject2 instanceof Vector)) {
                    uh0Var.b();
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
                                MessagesController.getInstance(i13).getUser(valueOf);
                                arrayList3.add(new Pair(valueOf, Integer.valueOf(i15)));
                                arrayList.add(valueOf);
                            }
                        } else {
                            j10 = j14;
                            if (obj2 instanceof Long) {
                                Long l4 = (Long) obj2;
                                if (j10 != l4.longValue()) {
                                    if (l4.longValue() > 0) {
                                        MessagesController.getInstance(i13).getUser(l4);
                                        arrayList3.add(new Pair(l4, 0));
                                        arrayList.add(l4);
                                    } else {
                                        MessagesController.getInstance(i13).getChat(Long.valueOf(-l4.longValue()));
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
                            uh0Var.a.add((Long) pair.first);
                            uh0Var.b.add((Integer) pair.second);
                            uh0Var.c.add((TLObject) hashMap.get(pair.first));
                        }
                        uh0Var.b();
                        break;
                    } else if (ChatObject.isChannel(chat)) {
                        TLRPC.TL_channels_getParticipants tL_channels_getParticipants = new TLRPC.TL_channels_getParticipants();
                        tL_channels_getParticipants.limit = MessagesController.getInstance(i13).chatReadMarkSizeThreshold;
                        tL_channels_getParticipants.offset = 0;
                        tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsRecent();
                        tL_channels_getParticipants.channel = MessagesController.getInstance(i13).getInputChannel(chat.id);
                        final int i17 = 0;
                        ConnectionsManager.getInstance(i13).sendRequest(tL_channels_getParticipants, new RequestDelegate() { // from class: org.telegram.ui.rh0
                            @Override // org.telegram.tgnet.RequestDelegate
                            public final void run(final TLObject tLObject3, TLRPC.TL_error tL_error3) {
                                switch (i17) {
                                    case 0:
                                        final int i18 = 0;
                                        final uh0 uh0Var2 = uh0Var;
                                        final int i19 = i13;
                                        final HashMap hashMap2 = hashMap;
                                        final ArrayList arrayList4 = arrayList3;
                                        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.sh0
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                switch (i18) {
                                                    case 0:
                                                        uh0 uh0Var3 = uh0Var2;
                                                        TLObject tLObject4 = tLObject3;
                                                        if (tLObject4 != null) {
                                                            uh0Var3.getClass();
                                                            TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject4;
                                                            int i20 = 0;
                                                            int i21 = 0;
                                                            while (true) {
                                                                int size3 = tL_channels_channelParticipants.users.size();
                                                                HashMap hashMap3 = hashMap2;
                                                                if (i21 < size3) {
                                                                    TLRPC.User user = tL_channels_channelParticipants.users.get(i21);
                                                                    MessagesController.getInstance(i19).putUser(user, false);
                                                                    hashMap3.put(Long.valueOf(user.id), user);
                                                                    i21++;
                                                                } else {
                                                                    while (true) {
                                                                        ArrayList arrayList5 = arrayList4;
                                                                        if (i20 < arrayList5.size()) {
                                                                            Pair pair2 = (Pair) arrayList5.get(i20);
                                                                            uh0Var3.a.add((Long) pair2.first);
                                                                            uh0Var3.b.add((Integer) pair2.second);
                                                                            uh0Var3.c.add((TLObject) hashMap3.get(pair2.first));
                                                                            i20++;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        uh0Var3.b();
                                                        break;
                                                    default:
                                                        uh0 uh0Var4 = uh0Var2;
                                                        TLObject tLObject5 = tLObject3;
                                                        if (tLObject5 != null) {
                                                            uh0Var4.getClass();
                                                            TLRPC.TL_messages_chatFull tL_messages_chatFull = (TLRPC.TL_messages_chatFull) tLObject5;
                                                            int i22 = 0;
                                                            int i23 = 0;
                                                            while (true) {
                                                                int size4 = tL_messages_chatFull.users.size();
                                                                HashMap hashMap4 = hashMap2;
                                                                if (i23 < size4) {
                                                                    TLRPC.User user2 = tL_messages_chatFull.users.get(i23);
                                                                    MessagesController.getInstance(i19).putUser(user2, false);
                                                                    hashMap4.put(Long.valueOf(user2.id), user2);
                                                                    i23++;
                                                                } else {
                                                                    while (true) {
                                                                        ArrayList arrayList6 = arrayList4;
                                                                        if (i22 < arrayList6.size()) {
                                                                            Pair pair3 = (Pair) arrayList6.get(i22);
                                                                            uh0Var4.a.add((Long) pair3.first);
                                                                            uh0Var4.b.add((Integer) pair3.second);
                                                                            uh0Var4.c.add((TLObject) hashMap4.get(pair3.first));
                                                                            i22++;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        uh0Var4.b();
                                                        break;
                                                }
                                            }
                                        });
                                        break;
                                    default:
                                        final int i20 = 1;
                                        final uh0 uh0Var3 = uh0Var;
                                        final int i21 = i13;
                                        final HashMap hashMap3 = hashMap;
                                        final ArrayList arrayList5 = arrayList3;
                                        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.sh0
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                switch (i20) {
                                                    case 0:
                                                        uh0 uh0Var32 = uh0Var3;
                                                        TLObject tLObject4 = tLObject3;
                                                        if (tLObject4 != null) {
                                                            uh0Var32.getClass();
                                                            TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject4;
                                                            int i202 = 0;
                                                            int i212 = 0;
                                                            while (true) {
                                                                int size3 = tL_channels_channelParticipants.users.size();
                                                                HashMap hashMap32 = hashMap3;
                                                                if (i212 < size3) {
                                                                    TLRPC.User user = tL_channels_channelParticipants.users.get(i212);
                                                                    MessagesController.getInstance(i21).putUser(user, false);
                                                                    hashMap32.put(Long.valueOf(user.id), user);
                                                                    i212++;
                                                                } else {
                                                                    while (true) {
                                                                        ArrayList arrayList52 = arrayList5;
                                                                        if (i202 < arrayList52.size()) {
                                                                            Pair pair2 = (Pair) arrayList52.get(i202);
                                                                            uh0Var32.a.add((Long) pair2.first);
                                                                            uh0Var32.b.add((Integer) pair2.second);
                                                                            uh0Var32.c.add((TLObject) hashMap32.get(pair2.first));
                                                                            i202++;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        uh0Var32.b();
                                                        break;
                                                    default:
                                                        uh0 uh0Var4 = uh0Var3;
                                                        TLObject tLObject5 = tLObject3;
                                                        if (tLObject5 != null) {
                                                            uh0Var4.getClass();
                                                            TLRPC.TL_messages_chatFull tL_messages_chatFull = (TLRPC.TL_messages_chatFull) tLObject5;
                                                            int i22 = 0;
                                                            int i23 = 0;
                                                            while (true) {
                                                                int size4 = tL_messages_chatFull.users.size();
                                                                HashMap hashMap4 = hashMap3;
                                                                if (i23 < size4) {
                                                                    TLRPC.User user2 = tL_messages_chatFull.users.get(i23);
                                                                    MessagesController.getInstance(i21).putUser(user2, false);
                                                                    hashMap4.put(Long.valueOf(user2.id), user2);
                                                                    i23++;
                                                                } else {
                                                                    while (true) {
                                                                        ArrayList arrayList6 = arrayList5;
                                                                        if (i22 < arrayList6.size()) {
                                                                            Pair pair3 = (Pair) arrayList6.get(i22);
                                                                            uh0Var4.a.add((Long) pair3.first);
                                                                            uh0Var4.b.add((Integer) pair3.second);
                                                                            uh0Var4.c.add((TLObject) hashMap4.get(pair3.first));
                                                                            i22++;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        uh0Var4.b();
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
                        ConnectionsManager.getInstance(i13).sendRequest(tL_messages_getFullChat, new RequestDelegate() { // from class: org.telegram.ui.rh0
                            @Override // org.telegram.tgnet.RequestDelegate
                            public final void run(final TLObject tLObject3, TLRPC.TL_error tL_error3) {
                                switch (i18) {
                                    case 0:
                                        final int i182 = 0;
                                        final uh0 uh0Var2 = uh0Var;
                                        final int i19 = i13;
                                        final HashMap hashMap2 = hashMap;
                                        final ArrayList arrayList4 = arrayList3;
                                        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.sh0
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                switch (i182) {
                                                    case 0:
                                                        uh0 uh0Var32 = uh0Var2;
                                                        TLObject tLObject4 = tLObject3;
                                                        if (tLObject4 != null) {
                                                            uh0Var32.getClass();
                                                            TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject4;
                                                            int i202 = 0;
                                                            int i212 = 0;
                                                            while (true) {
                                                                int size3 = tL_channels_channelParticipants.users.size();
                                                                HashMap hashMap32 = hashMap2;
                                                                if (i212 < size3) {
                                                                    TLRPC.User user = tL_channels_channelParticipants.users.get(i212);
                                                                    MessagesController.getInstance(i19).putUser(user, false);
                                                                    hashMap32.put(Long.valueOf(user.id), user);
                                                                    i212++;
                                                                } else {
                                                                    while (true) {
                                                                        ArrayList arrayList52 = arrayList4;
                                                                        if (i202 < arrayList52.size()) {
                                                                            Pair pair2 = (Pair) arrayList52.get(i202);
                                                                            uh0Var32.a.add((Long) pair2.first);
                                                                            uh0Var32.b.add((Integer) pair2.second);
                                                                            uh0Var32.c.add((TLObject) hashMap32.get(pair2.first));
                                                                            i202++;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        uh0Var32.b();
                                                        break;
                                                    default:
                                                        uh0 uh0Var4 = uh0Var2;
                                                        TLObject tLObject5 = tLObject3;
                                                        if (tLObject5 != null) {
                                                            uh0Var4.getClass();
                                                            TLRPC.TL_messages_chatFull tL_messages_chatFull = (TLRPC.TL_messages_chatFull) tLObject5;
                                                            int i22 = 0;
                                                            int i23 = 0;
                                                            while (true) {
                                                                int size4 = tL_messages_chatFull.users.size();
                                                                HashMap hashMap4 = hashMap2;
                                                                if (i23 < size4) {
                                                                    TLRPC.User user2 = tL_messages_chatFull.users.get(i23);
                                                                    MessagesController.getInstance(i19).putUser(user2, false);
                                                                    hashMap4.put(Long.valueOf(user2.id), user2);
                                                                    i23++;
                                                                } else {
                                                                    while (true) {
                                                                        ArrayList arrayList6 = arrayList4;
                                                                        if (i22 < arrayList6.size()) {
                                                                            Pair pair3 = (Pair) arrayList6.get(i22);
                                                                            uh0Var4.a.add((Long) pair3.first);
                                                                            uh0Var4.b.add((Integer) pair3.second);
                                                                            uh0Var4.c.add((TLObject) hashMap4.get(pair3.first));
                                                                            i22++;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        uh0Var4.b();
                                                        break;
                                                }
                                            }
                                        });
                                        break;
                                    default:
                                        final int i20 = 1;
                                        final uh0 uh0Var3 = uh0Var;
                                        final int i21 = i13;
                                        final HashMap hashMap3 = hashMap;
                                        final ArrayList arrayList5 = arrayList3;
                                        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.sh0
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                switch (i20) {
                                                    case 0:
                                                        uh0 uh0Var32 = uh0Var3;
                                                        TLObject tLObject4 = tLObject3;
                                                        if (tLObject4 != null) {
                                                            uh0Var32.getClass();
                                                            TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject4;
                                                            int i202 = 0;
                                                            int i212 = 0;
                                                            while (true) {
                                                                int size3 = tL_channels_channelParticipants.users.size();
                                                                HashMap hashMap32 = hashMap3;
                                                                if (i212 < size3) {
                                                                    TLRPC.User user = tL_channels_channelParticipants.users.get(i212);
                                                                    MessagesController.getInstance(i21).putUser(user, false);
                                                                    hashMap32.put(Long.valueOf(user.id), user);
                                                                    i212++;
                                                                } else {
                                                                    while (true) {
                                                                        ArrayList arrayList52 = arrayList5;
                                                                        if (i202 < arrayList52.size()) {
                                                                            Pair pair2 = (Pair) arrayList52.get(i202);
                                                                            uh0Var32.a.add((Long) pair2.first);
                                                                            uh0Var32.b.add((Integer) pair2.second);
                                                                            uh0Var32.c.add((TLObject) hashMap32.get(pair2.first));
                                                                            i202++;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        uh0Var32.b();
                                                        break;
                                                    default:
                                                        uh0 uh0Var4 = uh0Var3;
                                                        TLObject tLObject5 = tLObject3;
                                                        if (tLObject5 != null) {
                                                            uh0Var4.getClass();
                                                            TLRPC.TL_messages_chatFull tL_messages_chatFull = (TLRPC.TL_messages_chatFull) tLObject5;
                                                            int i22 = 0;
                                                            int i23 = 0;
                                                            while (true) {
                                                                int size4 = tL_messages_chatFull.users.size();
                                                                HashMap hashMap4 = hashMap3;
                                                                if (i23 < size4) {
                                                                    TLRPC.User user2 = tL_messages_chatFull.users.get(i23);
                                                                    MessagesController.getInstance(i21).putUser(user2, false);
                                                                    hashMap4.put(Long.valueOf(user2.id), user2);
                                                                    i23++;
                                                                } else {
                                                                    while (true) {
                                                                        ArrayList arrayList6 = arrayList5;
                                                                        if (i22 < arrayList6.size()) {
                                                                            Pair pair3 = (Pair) arrayList6.get(i22);
                                                                            uh0Var4.a.add((Long) pair3.first);
                                                                            uh0Var4.b.add((Integer) pair3.second);
                                                                            uh0Var4.c.add((TLObject) hashMap4.get(pair3.first));
                                                                            i22++;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        uh0Var4.b();
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

    public /* synthetic */ f9(a1.c cVar, ArrayList arrayList, int i10, long j10, ArrayList arrayList2, ArrayList arrayList3) {
        this.d = cVar;
        this.e = arrayList;
        this.b = i10;
        this.c = j10;
        this.f = arrayList2;
        this.h = arrayList3;
    }

    public /* synthetic */ f9(TopicsController topicsController, TLRPC.TL_messages_forumTopics tL_messages_forumTopics, long j10, TLRPC.TL_messages_forumTopics tL_messages_forumTopics2, a0.h hVar, int i10) {
        this.d = topicsController;
        this.e = tL_messages_forumTopics;
        this.c = j10;
        this.f = tL_messages_forumTopics2;
        this.h = hVar;
        this.b = i10;
    }

    public /* synthetic */ f9(TLObject tLObject, int i10, ei.d dVar, org.telegram.ui.ActionBar.h3 h3Var, long j10, TLRPC.TL_error tL_error) {
        this.d = tLObject;
        this.b = i10;
        this.e = dVar;
        this.f = h3Var;
        this.c = j10;
        this.h = tL_error;
    }

    public /* synthetic */ f9(org.telegram.ui.Cells.g6 g6Var, TLObject tLObject, MessagesStorage messagesStorage, long j10, int i10, ArrayList arrayList) {
        this.d = g6Var;
        this.f = tLObject;
        this.h = messagesStorage;
        this.c = j10;
        this.b = i10;
        this.e = arrayList;
    }

    public /* synthetic */ f9(uh0 uh0Var, TLRPC.TL_error tL_error, TLObject tLObject, long j10, int i10, TLRPC.Chat chat) {
        this.d = uh0Var;
        this.e = tL_error;
        this.f = tLObject;
        this.c = j10;
        this.b = i10;
        this.h = chat;
    }
}
