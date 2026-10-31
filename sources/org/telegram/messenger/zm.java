package org.telegram.messenger;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class zm implements Runnable {
    public final /* synthetic */ int a = 3;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object n;

    public /* synthetic */ zm(vp vpVar, TLRPC.updates_ChannelDifference updates_channeldifference, long j10, TLRPC.Chat chat, a0.h hVar, int i10, long j11) {
        this.e = vpVar;
        this.f = updates_channeldifference;
        this.b = j10;
        this.h = chat;
        this.n = hVar;
        this.d = i10;
        this.c = j11;
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
        long j10;
        long j11;
        boolean z10;
        int i10;
        boolean z11;
        a0.h hVar;
        jj jjVar;
        ArrayList arrayList;
        TLRPC.Chat chat;
        long j12;
        long j13;
        TLRPC.Message message;
        ArrayList arrayList2;
        long j14;
        boolean z12;
        int i11 = this.a;
        boolean z13 = false;
        Object obj = this.n;
        Object obj2 = this.f;
        Object obj3 = this.h;
        Object obj4 = this.e;
        switch (i11) {
            case 0:
                vp vpVar = (vp) obj4;
                TLRPC.updates_ChannelDifference updates_channeldifference = (TLRPC.updates_ChannelDifference) obj2;
                TLRPC.Chat chat2 = (TLRPC.Chat) obj3;
                a0.h hVar2 = (a0.h) obj;
                ConcurrentHashMap concurrentHashMap = vpVar.P;
                ConcurrentHashMap concurrentHashMap2 = vpVar.O;
                boolean z14 = updates_channeldifference instanceof TLRPC.TL_updates_channelDifference;
                long j15 = this.b;
                if (z14 || (updates_channeldifference instanceof TLRPC.TL_updates_channelDifferenceEmpty)) {
                    long j16 = j15;
                    if (updates_channeldifference.new_messages.isEmpty()) {
                        j10 = j16;
                    } else {
                        a0.h hVar3 = new a0.h();
                        hc.X(updates_channeldifference.new_messages);
                        ArrayList arrayList3 = new ArrayList();
                        long j17 = -j16;
                        Integer num = (Integer) concurrentHashMap2.get(Long.valueOf(j17));
                        if (num == null) {
                            num = Integer.valueOf(vpVar.getMessagesStorage().U(j17, false));
                            concurrentHashMap2.put(Long.valueOf(j17), num);
                        }
                        Integer num2 = num;
                        Integer num3 = (Integer) concurrentHashMap.get(Long.valueOf(j17));
                        if (num3 == null) {
                            num3 = Integer.valueOf(vpVar.getMessagesStorage().U(j17, true));
                            concurrentHashMap.put(Long.valueOf(j17), num3);
                        }
                        int i12 = 0;
                        while (i12 < updates_channeldifference.new_messages.size()) {
                            TLRPC.Message message2 = updates_channeldifference.new_messages.get(i12);
                            if (message2 instanceof TLRPC.TL_messageEmpty) {
                                i10 = i12;
                                j13 = j16;
                                hVar = hVar3;
                                arrayList = arrayList3;
                                chat = chat2;
                                j12 = j17;
                            } else {
                                if (chat2 == null || !chat2.left) {
                                    i10 = i12;
                                    if ((message2.out ? num3 : num2).intValue() < message2.id && !(message2.action instanceof TLRPC.TL_messageActionChannelCreate)) {
                                        z11 = true;
                                        message2.unread = z11;
                                        boolean contains = vpVar.u0.contains(Long.valueOf(j17));
                                        hVar = hVar3;
                                        arrayList = arrayList3;
                                        chat = chat2;
                                        j12 = j17;
                                        j13 = j16;
                                        jjVar = new jj(vpVar.currentAccount, message2, hVar2, (a0.h) null, contains, contains);
                                        message = jjVar.k;
                                        if ((message.out || message.from_scheduled) && jjVar.F4()) {
                                            arrayList.add(jjVar);
                                        }
                                        arrayList2 = (ArrayList) hVar.f(j12);
                                        if (arrayList2 == null) {
                                            arrayList2 = m5.i(hVar, j12);
                                        }
                                        arrayList2.add(jjVar);
                                    }
                                } else {
                                    i10 = i12;
                                }
                                z11 = false;
                                message2.unread = z11;
                                boolean contains2 = vpVar.u0.contains(Long.valueOf(j17));
                                hVar = hVar3;
                                arrayList = arrayList3;
                                chat = chat2;
                                j12 = j17;
                                j13 = j16;
                                jjVar = new jj(vpVar.currentAccount, message2, hVar2, (a0.h) null, contains2, contains2);
                                message = jjVar.k;
                                if (message.out) {
                                }
                                arrayList.add(jjVar);
                                arrayList2 = (ArrayList) hVar.f(j12);
                                if (arrayList2 == null) {
                                }
                                arrayList2.add(jjVar);
                            }
                            arrayList3 = arrayList;
                            j17 = j12;
                            chat2 = chat;
                            i12 = i10 + 1;
                            j16 = j13;
                            hVar3 = hVar;
                        }
                        j10 = j16;
                        i0.g3(new gm(vpVar, hVar3, 2));
                        vpVar.getMessagesStorage().a.c(new kg(vpVar, arrayList3, updates_channeldifference, 12));
                    }
                    if (!updates_channeldifference.other_updates.isEmpty()) {
                        vpVar.K3(updates_channeldifference.other_updates, updates_channeldifference.users, updates_channeldifference.chats, true, 0);
                    }
                    j11 = j10;
                    z10 = true;
                    vpVar.C3(1, j11);
                    hs messagesStorage = vpVar.getMessagesStorage();
                    messagesStorage.a.c(new gq(messagesStorage, updates_channeldifference.pts, j11, 5));
                } else if (updates_channeldifference instanceof TLRPC.TL_updates_channelDifferenceTooLong) {
                    long j18 = -j15;
                    Integer num4 = (Integer) concurrentHashMap2.get(Long.valueOf(j18));
                    if (num4 == null) {
                        num4 = Integer.valueOf(vpVar.getMessagesStorage().U(j18, false));
                        concurrentHashMap2.put(Long.valueOf(j18), num4);
                    }
                    Integer num5 = (Integer) concurrentHashMap.get(Long.valueOf(j18));
                    if (num5 == null) {
                        num5 = Integer.valueOf(vpVar.getMessagesStorage().U(j18, true));
                        concurrentHashMap.put(Long.valueOf(j18), num5);
                    }
                    for (int i13 = 0; i13 < updates_channeldifference.messages.size(); i13++) {
                        TLRPC.Message message3 = updates_channeldifference.messages.get(i13);
                        message3.dialog_id = j18;
                        if (!(message3.action instanceof TLRPC.TL_messageActionChannelCreate) && (chat2 == null || !chat2.left)) {
                            if ((message3.out ? num5 : num4).intValue() < message3.id) {
                                z12 = true;
                                message3.unread = z12;
                            }
                        }
                        z12 = false;
                        message3.unread = z12;
                    }
                    hs messagesStorage2 = vpVar.getMessagesStorage();
                    j11 = j15;
                    messagesStorage2.a.c(new d2(messagesStorage2, j15, this.d, (TLRPC.TL_updates_channelDifferenceTooLong) updates_channeldifference, new wk(vpVar, j15, 14)));
                    vpVar.Z0.e(j11);
                    vpVar.Y0.put(j11, updates_channeldifference.pts);
                    if ((updates_channeldifference.flags & 2) != 0) {
                        vpVar.z0.put(j11, ((int) (System.currentTimeMillis() / 1000)) + updates_channeldifference.timeout);
                    }
                    if (!updates_channeldifference.isFinal) {
                        vpVar.H0(j11);
                    }
                    if (v2.a) {
                        f8.b("received channel difference with pts = " + updates_channeldifference.pts + " channelId = " + j11);
                        f8.b("new_messages = " + updates_channeldifference.new_messages.size() + " messages = " + updates_channeldifference.messages.size() + " users = " + updates_channeldifference.users.size() + " chats = " + updates_channeldifference.chats.size() + " other updates = " + updates_channeldifference.other_updates.size());
                    }
                    j14 = this.c;
                    if (j14 != 0) {
                        vpVar.getMessagesStorage().q1(j14);
                    }
                    if (!z13) {
                        i0.g3(new wk(vpVar, j11, 4));
                        break;
                    }
                } else {
                    z10 = true;
                    j11 = j15;
                }
                z13 = z10;
                vpVar.Z0.e(j11);
                vpVar.Y0.put(j11, updates_channeldifference.pts);
                if ((updates_channeldifference.flags & 2) != 0) {
                }
                if (!updates_channeldifference.isFinal) {
                }
                if (v2.a) {
                }
                j14 = this.c;
                if (j14 != 0) {
                }
                if (!z13) {
                }
                break;
            case 1:
                qz qzVar = (qz) obj4;
                TLRPC.Message message4 = (TLRPC.Message) obj2;
                ArrayList arrayList4 = (ArrayList) obj3;
                jj jjVar2 = (jj) obj;
                hs messagesStorage3 = qzVar.getMessagesStorage();
                int i14 = this.d;
                Integer valueOf = Integer.valueOf(i14);
                int i15 = message4.id;
                int i16 = message4.date;
                long j19 = this.b;
                long j20 = this.c;
                messagesStorage3.a2(j19, j20, valueOf, i15, i16, 0, 0);
                qzVar.getMessagesStorage().j1(arrayList4, true, false, false, 0, false, 0, 0L);
                i0.g3(new d2(qzVar, jjVar2, message4, j20, i14));
                break;
            case 2:
                c cVar = (c) obj4;
                int i17 = WearReplyReceiver.a;
                vp.r1(cVar.a).U3((TLRPC.User) obj2, true, false);
                WearReplyReceiver.a(cVar, (CharSequence) obj3, this.b, this.c, this.d, (int[]) obj);
                break;
            default:
                c cVar2 = (c) obj4;
                int i18 = WearReplyReceiver.a;
                vp.r1(cVar2.a).N3((TLRPC.Chat) obj3, true);
                WearReplyReceiver.a(cVar2, (CharSequence) obj2, this.b, this.c, this.d, (int[]) obj);
                break;
        }
    }

    public /* synthetic */ zm(qz qzVar, long j10, long j11, int i10, TLRPC.Message message, ArrayList arrayList, jj jjVar) {
        this.e = qzVar;
        this.b = j10;
        this.c = j11;
        this.d = i10;
        this.f = message;
        this.h = arrayList;
        this.n = jjVar;
    }

    public /* synthetic */ zm(WearReplyReceiver wearReplyReceiver, c cVar, TLRPC.Chat chat, CharSequence charSequence, long j10, long j11, int i10, int[] iArr) {
        this.e = cVar;
        this.h = chat;
        this.f = charSequence;
        this.b = j10;
        this.c = j11;
        this.d = i10;
        this.n = iArr;
    }

    public /* synthetic */ zm(WearReplyReceiver wearReplyReceiver, c cVar, TLRPC.User user, CharSequence charSequence, long j10, long j11, int i10, int[] iArr) {
        this.e = cVar;
        this.f = user;
        this.h = charSequence;
        this.b = j10;
        this.c = j11;
        this.d = i10;
        this.n = iArr;
    }
}
