package gh;

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
import org.telegram.ui.ph0;
import org.telegram.ui.qn;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class w6 implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;

    public /* synthetic */ w6(int i9, long j10, Context context, TL_payments.connectedBotStarRef connectedbotstarref, org.telegram.ui.ActionBar.f3 f3Var, org.telegram.ui.ActionBar.b6 b6Var) {
        this.b = i9;
        this.d = context;
        this.c = j10;
        this.e = connectedbotstarref;
        this.f = f3Var;
        this.h = b6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long j10;
        switch (this.a) {
            case 0:
                i3 i3Var = (i3) this.d;
                ArrayList arrayList = (ArrayList) this.e;
                int i9 = this.b;
                long j11 = this.c;
                i3Var.run(arrayList, Integer.valueOf(i9), Long.valueOf(j11), (ArrayList) this.f, (ArrayList) this.h);
                break;
            case 1:
                int i10 = this.b;
                Context context = (Context) this.d;
                long j12 = this.c;
                TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) this.e;
                c0.g(i10).f(context, j12, connectedbotstarref.bot_id, new mh.h3(i10, j12, context, connectedbotstarref, (org.telegram.ui.ActionBar.f3) this.f, (org.telegram.ui.ActionBar.b6) this.h));
                break;
            case 2:
                ((TopicsController) this.d).lambda$loadTopics$5((TLRPC.TL_messages_forumTopics) this.e, this.c, (TLRPC.TL_messages_forumTopics) this.f, (a0.h) this.h, this.b);
                break;
            case 3:
                org.telegram.ui.Cells.f6.a((org.telegram.ui.Cells.f6) this.d, (TLObject) this.f, (MessagesStorage) this.h, this.c, this.b, (ArrayList) this.e);
                break;
            case 4:
                TLObject tLObject = (TLObject) this.d;
                int i11 = this.b;
                kh.d dVar = (kh.d) this.e;
                org.telegram.ui.ActionBar.f3 f3Var = (org.telegram.ui.ActionBar.f3) this.f;
                long j13 = this.c;
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
                    if (groupCall != null && LaunchActivity.C1 != null) {
                        f3Var.dismiss();
                        SendMessagesHelper.getInstance(i11).sendMessage(SendMessagesHelper.SendMessageParams.of(groupCall.invite_link, j13));
                        org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                        if (U != null) {
                            if (U instanceof qn) {
                                qn qnVar = (qn) U;
                                if (qnVar.a() == j13 && qnVar.N3 == 0) {
                                }
                            }
                            U.presentFragment(qn.R9(j13));
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
                    if (LaunchActivity.C1 == null) {
                        dVar.setLoading(false);
                        break;
                    } else {
                        TLRPC.TL_inputGroupCall tL_inputGroupCall = new TLRPC.TL_inputGroupCall();
                        TLRPC.GroupCall groupCall2 = groupcall.call;
                        tL_inputGroupCall.id = groupCall2.id;
                        tL_inputGroupCall.access_hash = groupCall2.access_hash;
                        f3Var.dismiss();
                        org.telegram.ui.Components.voip.e2.h(LaunchActivity.C1, i11, tL_inputGroupCall, false, groupcall.call, null);
                        SendMessagesHelper.getInstance(i11).sendMessage(SendMessagesHelper.SendMessageParams.of(groupcall.call.invite_link, j13));
                        break;
                    }
                } else if (tL_error != null) {
                    org.telegram.ui.Cells.j2.s(f3Var.topBulletinContainer, null, tL_error, false);
                    break;
                }
                break;
            default:
                final ph0 ph0Var = (ph0) this.d;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.e;
                TLObject tLObject2 = (TLObject) this.f;
                long j14 = this.c;
                final int i13 = this.b;
                TLRPC.Chat chat = (TLRPC.Chat) this.h;
                if (tL_error2 != null || !(tLObject2 instanceof Vector)) {
                    ph0Var.b();
                    break;
                } else {
                    Vector vector = (Vector) tLObject2;
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList arrayList3 = new ArrayList();
                    long j15 = j14;
                    final HashMap hashMap = new HashMap();
                    final ArrayList arrayList4 = new ArrayList();
                    int size2 = vector.objects.size();
                    int i14 = 0;
                    while (i14 < size2) {
                        Object obj2 = vector.objects.get(i14);
                        if (obj2 instanceof TLRPC.TL_readParticipantDate) {
                            TLRPC.TL_readParticipantDate tL_readParticipantDate = (TLRPC.TL_readParticipantDate) obj2;
                            int i15 = tL_readParticipantDate.date;
                            j10 = j15;
                            long j16 = tL_readParticipantDate.user_id;
                            Long valueOf = Long.valueOf(j16);
                            if (j10 != j16) {
                                MessagesController.getInstance(i13).getUser(valueOf);
                                arrayList4.add(new Pair(valueOf, Integer.valueOf(i15)));
                                arrayList2.add(valueOf);
                            }
                        } else {
                            j10 = j15;
                            if (obj2 instanceof Long) {
                                Long l10 = (Long) obj2;
                                if (j10 != l10.longValue()) {
                                    if (l10.longValue() > 0) {
                                        MessagesController.getInstance(i13).getUser(l10);
                                        arrayList4.add(new Pair(l10, 0));
                                        arrayList2.add(l10);
                                    } else {
                                        MessagesController.getInstance(i13).getChat(Long.valueOf(-l10.longValue()));
                                        arrayList4.add(new Pair(l10, 0));
                                        arrayList3.add(l10);
                                    }
                                }
                            }
                        }
                        i14++;
                        j15 = j10;
                    }
                    if (arrayList2.isEmpty()) {
                        for (int i16 = 0; i16 < arrayList4.size(); i16++) {
                            Pair pair = (Pair) arrayList4.get(i16);
                            ph0Var.a.add((Long) pair.first);
                            ph0Var.b.add((Integer) pair.second);
                            ph0Var.c.add((TLObject) hashMap.get(pair.first));
                        }
                        ph0Var.b();
                        break;
                    } else if (ChatObject.isChannel(chat)) {
                        TLRPC.TL_channels_getParticipants tL_channels_getParticipants = new TLRPC.TL_channels_getParticipants();
                        tL_channels_getParticipants.limit = MessagesController.getInstance(i13).chatReadMarkSizeThreshold;
                        tL_channels_getParticipants.offset = 0;
                        tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsRecent();
                        tL_channels_getParticipants.channel = MessagesController.getInstance(i13).getInputChannel(chat.id);
                        final int i17 = 0;
                        ConnectionsManager.getInstance(i13).sendRequest(tL_channels_getParticipants, new RequestDelegate() { // from class: org.telegram.ui.mh0
                            @Override // org.telegram.tgnet.RequestDelegate
                            public final void run(final TLObject tLObject3, TLRPC.TL_error tL_error3) {
                                switch (i17) {
                                    case 0:
                                        final int i18 = 0;
                                        final ph0 ph0Var2 = ph0Var;
                                        final int i19 = i13;
                                        final HashMap hashMap2 = hashMap;
                                        final ArrayList arrayList5 = arrayList4;
                                        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.nh0
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                switch (i18) {
                                                    case 0:
                                                        ph0 ph0Var3 = ph0Var2;
                                                        TLObject tLObject4 = tLObject3;
                                                        if (tLObject4 != null) {
                                                            ph0Var3.getClass();
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
                                                                        ArrayList arrayList6 = arrayList5;
                                                                        if (i20 < arrayList6.size()) {
                                                                            Pair pair2 = (Pair) arrayList6.get(i20);
                                                                            ph0Var3.a.add((Long) pair2.first);
                                                                            ph0Var3.b.add((Integer) pair2.second);
                                                                            ph0Var3.c.add((TLObject) hashMap3.get(pair2.first));
                                                                            i20++;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        ph0Var3.b();
                                                        break;
                                                    default:
                                                        ph0 ph0Var4 = ph0Var2;
                                                        TLObject tLObject5 = tLObject3;
                                                        if (tLObject5 != null) {
                                                            ph0Var4.getClass();
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
                                                                        ArrayList arrayList7 = arrayList5;
                                                                        if (i22 < arrayList7.size()) {
                                                                            Pair pair3 = (Pair) arrayList7.get(i22);
                                                                            ph0Var4.a.add((Long) pair3.first);
                                                                            ph0Var4.b.add((Integer) pair3.second);
                                                                            ph0Var4.c.add((TLObject) hashMap4.get(pair3.first));
                                                                            i22++;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        ph0Var4.b();
                                                        break;
                                                }
                                            }
                                        });
                                        break;
                                    default:
                                        final int i20 = 1;
                                        final ph0 ph0Var3 = ph0Var;
                                        final int i21 = i13;
                                        final HashMap hashMap3 = hashMap;
                                        final ArrayList arrayList6 = arrayList4;
                                        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.nh0
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                switch (i20) {
                                                    case 0:
                                                        ph0 ph0Var32 = ph0Var3;
                                                        TLObject tLObject4 = tLObject3;
                                                        if (tLObject4 != null) {
                                                            ph0Var32.getClass();
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
                                                                        ArrayList arrayList62 = arrayList6;
                                                                        if (i202 < arrayList62.size()) {
                                                                            Pair pair2 = (Pair) arrayList62.get(i202);
                                                                            ph0Var32.a.add((Long) pair2.first);
                                                                            ph0Var32.b.add((Integer) pair2.second);
                                                                            ph0Var32.c.add((TLObject) hashMap32.get(pair2.first));
                                                                            i202++;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        ph0Var32.b();
                                                        break;
                                                    default:
                                                        ph0 ph0Var4 = ph0Var3;
                                                        TLObject tLObject5 = tLObject3;
                                                        if (tLObject5 != null) {
                                                            ph0Var4.getClass();
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
                                                                        ArrayList arrayList7 = arrayList6;
                                                                        if (i22 < arrayList7.size()) {
                                                                            Pair pair3 = (Pair) arrayList7.get(i22);
                                                                            ph0Var4.a.add((Long) pair3.first);
                                                                            ph0Var4.b.add((Integer) pair3.second);
                                                                            ph0Var4.c.add((TLObject) hashMap4.get(pair3.first));
                                                                            i22++;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        ph0Var4.b();
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
                        ConnectionsManager.getInstance(i13).sendRequest(tL_messages_getFullChat, new RequestDelegate() { // from class: org.telegram.ui.mh0
                            @Override // org.telegram.tgnet.RequestDelegate
                            public final void run(final TLObject tLObject3, TLRPC.TL_error tL_error3) {
                                switch (i18) {
                                    case 0:
                                        final int i182 = 0;
                                        final ph0 ph0Var2 = ph0Var;
                                        final int i19 = i13;
                                        final HashMap hashMap2 = hashMap;
                                        final ArrayList arrayList5 = arrayList4;
                                        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.nh0
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                switch (i182) {
                                                    case 0:
                                                        ph0 ph0Var32 = ph0Var2;
                                                        TLObject tLObject4 = tLObject3;
                                                        if (tLObject4 != null) {
                                                            ph0Var32.getClass();
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
                                                                        ArrayList arrayList62 = arrayList5;
                                                                        if (i202 < arrayList62.size()) {
                                                                            Pair pair2 = (Pair) arrayList62.get(i202);
                                                                            ph0Var32.a.add((Long) pair2.first);
                                                                            ph0Var32.b.add((Integer) pair2.second);
                                                                            ph0Var32.c.add((TLObject) hashMap32.get(pair2.first));
                                                                            i202++;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        ph0Var32.b();
                                                        break;
                                                    default:
                                                        ph0 ph0Var4 = ph0Var2;
                                                        TLObject tLObject5 = tLObject3;
                                                        if (tLObject5 != null) {
                                                            ph0Var4.getClass();
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
                                                                        ArrayList arrayList7 = arrayList5;
                                                                        if (i22 < arrayList7.size()) {
                                                                            Pair pair3 = (Pair) arrayList7.get(i22);
                                                                            ph0Var4.a.add((Long) pair3.first);
                                                                            ph0Var4.b.add((Integer) pair3.second);
                                                                            ph0Var4.c.add((TLObject) hashMap4.get(pair3.first));
                                                                            i22++;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        ph0Var4.b();
                                                        break;
                                                }
                                            }
                                        });
                                        break;
                                    default:
                                        final int i20 = 1;
                                        final ph0 ph0Var3 = ph0Var;
                                        final int i21 = i13;
                                        final HashMap hashMap3 = hashMap;
                                        final ArrayList arrayList6 = arrayList4;
                                        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.nh0
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                switch (i20) {
                                                    case 0:
                                                        ph0 ph0Var32 = ph0Var3;
                                                        TLObject tLObject4 = tLObject3;
                                                        if (tLObject4 != null) {
                                                            ph0Var32.getClass();
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
                                                                        ArrayList arrayList62 = arrayList6;
                                                                        if (i202 < arrayList62.size()) {
                                                                            Pair pair2 = (Pair) arrayList62.get(i202);
                                                                            ph0Var32.a.add((Long) pair2.first);
                                                                            ph0Var32.b.add((Integer) pair2.second);
                                                                            ph0Var32.c.add((TLObject) hashMap32.get(pair2.first));
                                                                            i202++;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        ph0Var32.b();
                                                        break;
                                                    default:
                                                        ph0 ph0Var4 = ph0Var3;
                                                        TLObject tLObject5 = tLObject3;
                                                        if (tLObject5 != null) {
                                                            ph0Var4.getClass();
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
                                                                        ArrayList arrayList7 = arrayList6;
                                                                        if (i22 < arrayList7.size()) {
                                                                            Pair pair3 = (Pair) arrayList7.get(i22);
                                                                            ph0Var4.a.add((Long) pair3.first);
                                                                            ph0Var4.b.add((Integer) pair3.second);
                                                                            ph0Var4.c.add((TLObject) hashMap4.get(pair3.first));
                                                                            i22++;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        ph0Var4.b();
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

    public /* synthetic */ w6(i3 i3Var, ArrayList arrayList, int i9, long j10, ArrayList arrayList2, ArrayList arrayList3) {
        this.d = i3Var;
        this.e = arrayList;
        this.b = i9;
        this.c = j10;
        this.f = arrayList2;
        this.h = arrayList3;
    }

    public /* synthetic */ w6(TopicsController topicsController, TLRPC.TL_messages_forumTopics tL_messages_forumTopics, long j10, TLRPC.TL_messages_forumTopics tL_messages_forumTopics2, a0.h hVar, int i9) {
        this.d = topicsController;
        this.e = tL_messages_forumTopics;
        this.c = j10;
        this.f = tL_messages_forumTopics2;
        this.h = hVar;
        this.b = i9;
    }

    public /* synthetic */ w6(TLObject tLObject, int i9, kh.d dVar, org.telegram.ui.ActionBar.f3 f3Var, long j10, TLRPC.TL_error tL_error) {
        this.d = tLObject;
        this.b = i9;
        this.e = dVar;
        this.f = f3Var;
        this.c = j10;
        this.h = tL_error;
    }

    public /* synthetic */ w6(org.telegram.ui.Cells.f6 f6Var, TLObject tLObject, MessagesStorage messagesStorage, long j10, int i9, ArrayList arrayList) {
        this.d = f6Var;
        this.f = tLObject;
        this.h = messagesStorage;
        this.c = j10;
        this.b = i9;
        this.e = arrayList;
    }

    public /* synthetic */ w6(ph0 ph0Var, TLRPC.TL_error tL_error, TLObject tLObject, long j10, int i9, TLRPC.Chat chat) {
        this.d = ph0Var;
        this.e = tL_error;
        this.f = tLObject;
        this.c = j10;
        this.b = i9;
        this.h = chat;
    }
}
