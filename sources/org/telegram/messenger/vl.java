package org.telegram.messenger;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class vl implements Runnable {
    public final /* synthetic */ int a = 3;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object n;

    public /* synthetic */ vl(hp hpVar, TLRPC.updates_ChannelDifference updates_channeldifference, long j10, TLRPC.Chat chat, a0.h hVar, int i3, long j11) {
        this.e = hpVar;
        this.f = updates_channeldifference;
        this.b = j10;
        this.h = chat;
        this.n = hVar;
        this.d = i3;
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
        int i3;
        boolean z11;
        a0.h hVar;
        zi ziVar;
        ArrayList arrayList;
        TLRPC.Chat chat;
        long j12;
        long j13;
        TLRPC.Message message;
        ArrayList arrayList2;
        long j14;
        boolean z12;
        int i10 = this.a;
        boolean z13 = false;
        Object obj = this.n;
        Object obj2 = this.f;
        Object obj3 = this.h;
        Object obj4 = this.e;
        switch (i10) {
            case 0:
                hp hpVar = (hp) obj4;
                TLRPC.updates_ChannelDifference updates_channeldifference = (TLRPC.updates_ChannelDifference) obj2;
                TLRPC.Chat chat2 = (TLRPC.Chat) obj3;
                a0.h hVar2 = (a0.h) obj;
                ConcurrentHashMap concurrentHashMap = hpVar.Q;
                ConcurrentHashMap concurrentHashMap2 = hpVar.P;
                boolean z14 = updates_channeldifference instanceof TLRPC.TL_updates_channelDifference;
                long j15 = this.b;
                if (z14 || (updates_channeldifference instanceof TLRPC.TL_updates_channelDifferenceEmpty)) {
                    long j16 = j15;
                    if (updates_channeldifference.new_messages.isEmpty()) {
                        j10 = j16;
                    } else {
                        a0.h hVar3 = new a0.h();
                        zb.X(updates_channeldifference.new_messages);
                        ArrayList arrayList3 = new ArrayList();
                        long j17 = -j16;
                        Integer num = (Integer) concurrentHashMap2.get(Long.valueOf(j17));
                        if (num == null) {
                            num = Integer.valueOf(hpVar.getMessagesStorage().U(j17, false));
                            concurrentHashMap2.put(Long.valueOf(j17), num);
                        }
                        Integer num2 = num;
                        Integer num3 = (Integer) concurrentHashMap.get(Long.valueOf(j17));
                        if (num3 == null) {
                            num3 = Integer.valueOf(hpVar.getMessagesStorage().U(j17, true));
                            concurrentHashMap.put(Long.valueOf(j17), num3);
                        }
                        int i11 = 0;
                        while (i11 < updates_channeldifference.new_messages.size()) {
                            TLRPC.Message message2 = updates_channeldifference.new_messages.get(i11);
                            if (message2 instanceof TLRPC.TL_messageEmpty) {
                                i3 = i11;
                                j13 = j16;
                                hVar = hVar3;
                                arrayList = arrayList3;
                                chat = chat2;
                                j12 = j17;
                            } else {
                                if (chat2 == null || !chat2.left) {
                                    i3 = i11;
                                    if ((message2.out ? num3 : num2).intValue() < message2.id && !(message2.action instanceof TLRPC.TL_messageActionChannelCreate)) {
                                        z11 = true;
                                        message2.unread = z11;
                                        boolean contains = hpVar.v0.contains(Long.valueOf(j17));
                                        hVar = hVar3;
                                        arrayList = arrayList3;
                                        chat = chat2;
                                        j12 = j17;
                                        j13 = j16;
                                        ziVar = new zi(hpVar.currentAccount, message2, hVar2, (a0.h) null, contains, contains);
                                        message = ziVar.k;
                                        if ((message.out || message.from_scheduled) && ziVar.G4()) {
                                            arrayList.add(ziVar);
                                        }
                                        arrayList2 = (ArrayList) hVar.f(j12);
                                        if (arrayList2 == null) {
                                            arrayList2 = k5.j(hVar, j12);
                                        }
                                        arrayList2.add(ziVar);
                                    }
                                } else {
                                    i3 = i11;
                                }
                                z11 = false;
                                message2.unread = z11;
                                boolean contains2 = hpVar.v0.contains(Long.valueOf(j17));
                                hVar = hVar3;
                                arrayList = arrayList3;
                                chat = chat2;
                                j12 = j17;
                                j13 = j16;
                                ziVar = new zi(hpVar.currentAccount, message2, hVar2, (a0.h) null, contains2, contains2);
                                message = ziVar.k;
                                if (message.out) {
                                }
                                arrayList.add(ziVar);
                                arrayList2 = (ArrayList) hVar.f(j12);
                                if (arrayList2 == null) {
                                }
                                arrayList2.add(ziVar);
                            }
                            arrayList3 = arrayList;
                            j17 = j12;
                            chat2 = chat;
                            i11 = i3 + 1;
                            j16 = j13;
                            hVar3 = hVar;
                        }
                        j10 = j16;
                        g0.h3(new gl(hpVar, hVar3, 2));
                        hpVar.getMessagesStorage().a.c(new dg(hpVar, arrayList3, updates_channeldifference, 12));
                    }
                    if (!updates_channeldifference.other_updates.isEmpty()) {
                        hpVar.N3(updates_channeldifference.other_updates, updates_channeldifference.users, updates_channeldifference.chats, true, 0);
                    }
                    j11 = j10;
                    z10 = true;
                    hpVar.F3(1, j11);
                    qr messagesStorage = hpVar.getMessagesStorage();
                    messagesStorage.a.c(new rp(messagesStorage, updates_channeldifference.pts, j11, 5));
                } else if (updates_channeldifference instanceof TLRPC.TL_updates_channelDifferenceTooLong) {
                    long j18 = -j15;
                    Integer num4 = (Integer) concurrentHashMap2.get(Long.valueOf(j18));
                    if (num4 == null) {
                        num4 = Integer.valueOf(hpVar.getMessagesStorage().U(j18, false));
                        concurrentHashMap2.put(Long.valueOf(j18), num4);
                    }
                    Integer num5 = (Integer) concurrentHashMap.get(Long.valueOf(j18));
                    if (num5 == null) {
                        num5 = Integer.valueOf(hpVar.getMessagesStorage().U(j18, true));
                        concurrentHashMap.put(Long.valueOf(j18), num5);
                    }
                    for (int i12 = 0; i12 < updates_channeldifference.messages.size(); i12++) {
                        TLRPC.Message message3 = updates_channeldifference.messages.get(i12);
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
                    qr messagesStorage2 = hpVar.getMessagesStorage();
                    j11 = j15;
                    messagesStorage2.a.c(new z1(messagesStorage2, j15, this.d, (TLRPC.TL_updates_channelDifferenceTooLong) updates_channeldifference, new dk(hpVar, j15, 14)));
                    hpVar.a1.e(j11);
                    hpVar.Z0.put(j11, updates_channeldifference.pts);
                    if ((updates_channeldifference.flags & 2) != 0) {
                        hpVar.A0.put(j11, ((int) (System.currentTimeMillis() / 1000)) + updates_channeldifference.timeout);
                    }
                    if (!updates_channeldifference.isFinal) {
                        hpVar.I0(j11);
                    }
                    if (r2.a) {
                        a8.b("received channel difference with pts = " + updates_channeldifference.pts + " channelId = " + j11);
                        a8.b("new_messages = " + updates_channeldifference.new_messages.size() + " messages = " + updates_channeldifference.messages.size() + " users = " + updates_channeldifference.users.size() + " chats = " + updates_channeldifference.chats.size() + " other updates = " + updates_channeldifference.other_updates.size());
                    }
                    j14 = this.c;
                    if (j14 != 0) {
                        hpVar.getMessagesStorage().q1(j14);
                    }
                    if (!z13) {
                        g0.h3(new dk(hpVar, j11, 4));
                        break;
                    }
                } else {
                    z10 = true;
                    j11 = j15;
                }
                z13 = z10;
                hpVar.a1.e(j11);
                hpVar.Z0.put(j11, updates_channeldifference.pts);
                if ((updates_channeldifference.flags & 2) != 0) {
                }
                if (!updates_channeldifference.isFinal) {
                }
                if (r2.a) {
                }
                j14 = this.c;
                if (j14 != 0) {
                }
                if (!z13) {
                }
                break;
            case 1:
                yy yyVar = (yy) obj4;
                TLRPC.Message message4 = (TLRPC.Message) obj2;
                ArrayList arrayList4 = (ArrayList) obj3;
                zi ziVar2 = (zi) obj;
                qr messagesStorage3 = yyVar.getMessagesStorage();
                int i13 = this.d;
                Integer valueOf = Integer.valueOf(i13);
                int i14 = message4.id;
                int i15 = message4.date;
                long j19 = this.b;
                long j20 = this.c;
                messagesStorage3.a2(j19, j20, valueOf, i14, i15, 0, 0);
                yyVar.getMessagesStorage().j1(arrayList4, true, false, false, 0, false, 0, 0L);
                g0.h3(new z1(yyVar, ziVar2, message4, j20, i13));
                break;
            case 2:
                c cVar = (c) obj4;
                int i16 = WearReplyReceiver.a;
                hp.s1(cVar.a).X3((TLRPC.User) obj2, true, false);
                WearReplyReceiver.a(cVar, (CharSequence) obj3, this.b, this.c, this.d, (int[]) obj);
                break;
            default:
                c cVar2 = (c) obj4;
                int i17 = WearReplyReceiver.a;
                hp.s1(cVar2.a).Q3((TLRPC.Chat) obj3, true);
                WearReplyReceiver.a(cVar2, (CharSequence) obj2, this.b, this.c, this.d, (int[]) obj);
                break;
        }
    }

    public /* synthetic */ vl(yy yyVar, long j10, long j11, int i3, TLRPC.Message message, ArrayList arrayList, zi ziVar) {
        this.e = yyVar;
        this.b = j10;
        this.c = j11;
        this.d = i3;
        this.f = message;
        this.h = arrayList;
        this.n = ziVar;
    }

    public /* synthetic */ vl(WearReplyReceiver wearReplyReceiver, c cVar, TLRPC.Chat chat, CharSequence charSequence, long j10, long j11, int i3, int[] iArr) {
        this.e = cVar;
        this.h = chat;
        this.f = charSequence;
        this.b = j10;
        this.c = j11;
        this.d = i3;
        this.n = iArr;
    }

    public /* synthetic */ vl(WearReplyReceiver wearReplyReceiver, c cVar, TLRPC.User user, CharSequence charSequence, long j10, long j11, int i3, int[] iArr) {
        this.e = cVar;
        this.f = user;
        this.h = charSequence;
        this.b = j10;
        this.c = j11;
        this.d = i3;
        this.n = iArr;
    }
}
