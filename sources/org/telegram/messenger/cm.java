package org.telegram.messenger;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes.dex */
public final /* synthetic */ class cm implements Runnable {
    public final /* synthetic */ int a = 3;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object n;

    public /* synthetic */ cm(np npVar, TLRPC.updates_ChannelDifference updates_channeldifference, long j3, TLRPC.Chat chat, a0.h hVar, int i7, long j10) {
        this.e = npVar;
        this.f = updates_channeldifference;
        this.b = j3;
        this.h = chat;
        this.n = hVar;
        this.d = i7;
        this.c = j10;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0345  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x034e  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0241  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        long j3;
        long j10;
        boolean z10;
        int i7;
        boolean z11;
        a0.h hVar;
        gj gjVar;
        ArrayList arrayList;
        TLRPC.Chat chat;
        long j11;
        long j12;
        TLRPC.Message message;
        ArrayList arrayList2;
        long j13;
        boolean z12;
        int i10 = this.a;
        boolean z13 = false;
        Object obj = this.n;
        Object obj2 = this.f;
        Object obj3 = this.h;
        Object obj4 = this.e;
        switch (i10) {
            case 0:
                np npVar = (np) obj4;
                TLRPC.updates_ChannelDifference updates_channeldifference = (TLRPC.updates_ChannelDifference) obj2;
                TLRPC.Chat chat2 = (TLRPC.Chat) obj3;
                a0.h hVar2 = (a0.h) obj;
                ConcurrentHashMap concurrentHashMap = npVar.Q;
                ConcurrentHashMap concurrentHashMap2 = npVar.P;
                boolean z14 = updates_channeldifference instanceof TLRPC.TL_updates_channelDifference;
                long j14 = this.b;
                if (z14 || (updates_channeldifference instanceof TLRPC.TL_updates_channelDifferenceEmpty)) {
                    long j15 = j14;
                    if (updates_channeldifference.new_messages.isEmpty()) {
                        j3 = j15;
                    } else {
                        a0.h hVar3 = new a0.h();
                        fc.X(updates_channeldifference.new_messages);
                        ArrayList arrayList3 = new ArrayList();
                        long j16 = -j15;
                        Integer num = (Integer) concurrentHashMap2.get(Long.valueOf(j16));
                        if (num == null) {
                            num = Integer.valueOf(npVar.getMessagesStorage().U(j16, false));
                            concurrentHashMap2.put(Long.valueOf(j16), num);
                        }
                        Integer num2 = num;
                        Integer num3 = (Integer) concurrentHashMap.get(Long.valueOf(j16));
                        if (num3 == null) {
                            num3 = Integer.valueOf(npVar.getMessagesStorage().U(j16, true));
                            concurrentHashMap.put(Long.valueOf(j16), num3);
                        }
                        int i11 = 0;
                        while (i11 < updates_channeldifference.new_messages.size()) {
                            TLRPC.Message message2 = updates_channeldifference.new_messages.get(i11);
                            if (message2 instanceof TLRPC.TL_messageEmpty) {
                                i7 = i11;
                                j12 = j15;
                                hVar = hVar3;
                                arrayList = arrayList3;
                                chat = chat2;
                                j11 = j16;
                            } else {
                                if (chat2 == null || !chat2.left) {
                                    i7 = i11;
                                    if ((message2.out ? num3 : num2).intValue() < message2.id && !(message2.action instanceof TLRPC.TL_messageActionChannelCreate)) {
                                        z11 = true;
                                        message2.unread = z11;
                                        boolean contains = npVar.v0.contains(Long.valueOf(j16));
                                        hVar = hVar3;
                                        arrayList = arrayList3;
                                        chat = chat2;
                                        j11 = j16;
                                        j12 = j15;
                                        gjVar = new gj(npVar.currentAccount, message2, hVar2, (a0.h) null, contains, contains);
                                        message = gjVar.k;
                                        if ((message.out || message.from_scheduled) && gjVar.F4()) {
                                            arrayList.add(gjVar);
                                        }
                                        arrayList2 = (ArrayList) hVar.f(j11);
                                        if (arrayList2 == null) {
                                            arrayList2 = k5.i(hVar, j11);
                                        }
                                        arrayList2.add(gjVar);
                                    }
                                } else {
                                    i7 = i11;
                                }
                                z11 = false;
                                message2.unread = z11;
                                boolean contains2 = npVar.v0.contains(Long.valueOf(j16));
                                hVar = hVar3;
                                arrayList = arrayList3;
                                chat = chat2;
                                j11 = j16;
                                j12 = j15;
                                gjVar = new gj(npVar.currentAccount, message2, hVar2, (a0.h) null, contains2, contains2);
                                message = gjVar.k;
                                if (message.out) {
                                }
                                arrayList.add(gjVar);
                                arrayList2 = (ArrayList) hVar.f(j11);
                                if (arrayList2 == null) {
                                }
                                arrayList2.add(gjVar);
                            }
                            arrayList3 = arrayList;
                            j16 = j11;
                            chat2 = chat;
                            i11 = i7 + 1;
                            j15 = j12;
                            hVar3 = hVar;
                        }
                        j3 = j15;
                        g0.h3(new nl(npVar, hVar3, 2));
                        npVar.getMessagesStorage().a.c(new kg(npVar, arrayList3, updates_channeldifference, 12));
                    }
                    if (!updates_channeldifference.other_updates.isEmpty()) {
                        npVar.N3(updates_channeldifference.other_updates, updates_channeldifference.users, updates_channeldifference.chats, true, 0);
                    }
                    j10 = j3;
                    z10 = true;
                    npVar.F3(1, j10);
                    vr messagesStorage = npVar.getMessagesStorage();
                    messagesStorage.a.c(new xp(messagesStorage, updates_channeldifference.pts, j10, 5));
                } else if (updates_channeldifference instanceof TLRPC.TL_updates_channelDifferenceTooLong) {
                    long j17 = -j14;
                    Integer num4 = (Integer) concurrentHashMap2.get(Long.valueOf(j17));
                    if (num4 == null) {
                        num4 = Integer.valueOf(npVar.getMessagesStorage().U(j17, false));
                        concurrentHashMap2.put(Long.valueOf(j17), num4);
                    }
                    Integer num5 = (Integer) concurrentHashMap.get(Long.valueOf(j17));
                    if (num5 == null) {
                        num5 = Integer.valueOf(npVar.getMessagesStorage().U(j17, true));
                        concurrentHashMap.put(Long.valueOf(j17), num5);
                    }
                    for (int i12 = 0; i12 < updates_channeldifference.messages.size(); i12++) {
                        TLRPC.Message message3 = updates_channeldifference.messages.get(i12);
                        message3.dialog_id = j17;
                        if (!(message3.action instanceof TLRPC.TL_messageActionChannelCreate) && (chat2 == null || !chat2.left)) {
                            if ((message3.out ? num5 : num4).intValue() < message3.id) {
                                z12 = true;
                                message3.unread = z12;
                            }
                        }
                        z12 = false;
                        message3.unread = z12;
                    }
                    vr messagesStorage2 = npVar.getMessagesStorage();
                    j10 = j14;
                    messagesStorage2.a.c(new z1(messagesStorage2, j14, this.d, (TLRPC.TL_updates_channelDifferenceTooLong) updates_channeldifference, new kk(npVar, j14, 14)));
                    npVar.a1.e(j10);
                    npVar.Z0.put(j10, updates_channeldifference.pts);
                    if ((updates_channeldifference.flags & 2) != 0) {
                        npVar.A0.put(j10, ((int) (System.currentTimeMillis() / 1000)) + updates_channeldifference.timeout);
                    }
                    if (!updates_channeldifference.isFinal) {
                        npVar.I0(j10);
                    }
                    if (r2.a) {
                        a8.b("received channel difference with pts = " + updates_channeldifference.pts + " channelId = " + j10);
                        a8.b("new_messages = " + updates_channeldifference.new_messages.size() + " messages = " + updates_channeldifference.messages.size() + " users = " + updates_channeldifference.users.size() + " chats = " + updates_channeldifference.chats.size() + " other updates = " + updates_channeldifference.other_updates.size());
                    }
                    j13 = this.c;
                    if (j13 != 0) {
                        npVar.getMessagesStorage().q1(j13);
                    }
                    if (!z13) {
                        g0.h3(new kk(npVar, j10, 4));
                        break;
                    }
                } else {
                    z10 = true;
                    j10 = j14;
                }
                z13 = z10;
                npVar.a1.e(j10);
                npVar.Z0.put(j10, updates_channeldifference.pts);
                if ((updates_channeldifference.flags & 2) != 0) {
                }
                if (!updates_channeldifference.isFinal) {
                }
                if (r2.a) {
                }
                j13 = this.c;
                if (j13 != 0) {
                }
                if (!z13) {
                }
                break;
            case 1:
                ez ezVar = (ez) obj4;
                TLRPC.Message message4 = (TLRPC.Message) obj2;
                ArrayList arrayList4 = (ArrayList) obj3;
                gj gjVar2 = (gj) obj;
                vr messagesStorage3 = ezVar.getMessagesStorage();
                int i13 = this.d;
                Integer valueOf = Integer.valueOf(i13);
                int i14 = message4.id;
                int i15 = message4.date;
                long j18 = this.b;
                long j19 = this.c;
                messagesStorage3.a2(j18, j19, valueOf, i14, i15, 0, 0);
                ezVar.getMessagesStorage().j1(arrayList4, true, false, false, 0, false, 0, 0L);
                g0.h3(new z1(ezVar, gjVar2, message4, j19, i13));
                break;
            case 2:
                c cVar = (c) obj4;
                int i16 = WearReplyReceiver.a;
                np.s1(cVar.a).X3((TLRPC.User) obj2, true, false);
                WearReplyReceiver.a(cVar, (CharSequence) obj3, this.b, this.c, this.d, (int[]) obj);
                break;
            default:
                c cVar2 = (c) obj4;
                int i17 = WearReplyReceiver.a;
                np.s1(cVar2.a).Q3((TLRPC.Chat) obj3, true);
                WearReplyReceiver.a(cVar2, (CharSequence) obj2, this.b, this.c, this.d, (int[]) obj);
                break;
        }
    }

    public /* synthetic */ cm(ez ezVar, long j3, long j10, int i7, TLRPC.Message message, ArrayList arrayList, gj gjVar) {
        this.e = ezVar;
        this.b = j3;
        this.c = j10;
        this.d = i7;
        this.f = message;
        this.h = arrayList;
        this.n = gjVar;
    }

    public /* synthetic */ cm(WearReplyReceiver wearReplyReceiver, c cVar, TLRPC.Chat chat, CharSequence charSequence, long j3, long j10, int i7, int[] iArr) {
        this.e = cVar;
        this.h = chat;
        this.f = charSequence;
        this.b = j3;
        this.c = j10;
        this.d = i7;
        this.n = iArr;
    }

    public /* synthetic */ cm(WearReplyReceiver wearReplyReceiver, c cVar, TLRPC.User user, CharSequence charSequence, long j3, long j10, int i7, int[] iArr) {
        this.e = cVar;
        this.f = user;
        this.h = charSequence;
        this.b = j3;
        this.c = j10;
        this.d = i7;
        this.n = iArr;
    }
}
