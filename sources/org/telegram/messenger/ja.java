package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public final /* synthetic */ class ja implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object n;

    public /* synthetic */ ja(ma maVar, int[] iArr, la laVar, TLRPC.messages_Messages messages_messages, ArrayList arrayList, int i7, int i10) {
        this.d = maVar;
        this.e = iArr;
        this.f = laVar;
        this.h = messages_messages;
        this.n = arrayList;
        this.b = i7;
        this.c = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        int i10 = this.b;
        Object obj = this.n;
        int i11 = this.c;
        Object obj2 = this.h;
        Object obj3 = this.f;
        Object obj4 = this.e;
        Object obj5 = this.d;
        int i12 = 2;
        switch (i7) {
            case 0:
                la laVar = (la) obj3;
                TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) obj2;
                ArrayList arrayList = (ArrayList) obj;
                int i13 = ((ma) obj5).a;
                int i14 = ((int[]) obj4)[0];
                int i15 = laVar.d;
                HashMap hashMap = laVar.b;
                if (i14 == i15) {
                    laVar.d = -1;
                    laVar.f = false;
                    laVar.g = messages_messages.next_rate;
                    int size = arrayList.size();
                    int i16 = 0;
                    while (i16 < size) {
                        Object obj6 = arrayList.get(i16);
                        i16++;
                        fj fjVar = (fj) obj6;
                        int i17 = i12;
                        ka kaVar = new ka(fjVar.k);
                        Integer num = (Integer) hashMap.get(kaVar);
                        if (num == null) {
                            int i18 = laVar.j;
                            laVar.j = i18 - 1;
                            num = Integer.valueOf(i18);
                            hashMap.put(kaVar, num);
                            laVar.a.add(fjVar);
                        }
                        TLRPC.Message message = fjVar.k;
                        message.realId = message.id;
                        message.id = num.intValue();
                        i12 = i17;
                    }
                    int i19 = i12;
                    if (!messages_messages.messages.isEmpty()) {
                        TLRPC.Message message2 = (TLRPC.Message) i5.c.h(1, messages_messages.messages);
                        laVar.h = message2.realId;
                        laVar.i = message2.peer_id;
                    }
                    tr.a0(i13).m1(messages_messages.users, messages_messages.chats, true, true);
                    mp.u1(i13).f4(messages_messages.users, false);
                    mp.u1(i13).Z3(messages_messages.chats, false);
                    laVar.n = messages_messages.messages.size() < 21;
                    laVar.m = Math.max(messages_messages.count, messages_messages.messages.size());
                    ks f10 = ks.f(i13);
                    Integer valueOf = Integer.valueOf(arrayList.size());
                    Integer valueOf2 = Integer.valueOf(i19);
                    Integer valueOf3 = Integer.valueOf(i10);
                    Integer valueOf4 = Integer.valueOf(i11);
                    Object[] objArr = new Object[15];
                    objArr[0] = 0L;
                    objArr[1] = valueOf;
                    objArr[i19] = arrayList;
                    objArr[3] = Boolean.FALSE;
                    objArr[4] = 0;
                    objArr[5] = 0;
                    objArr[6] = 0;
                    objArr[7] = 0;
                    objArr[8] = valueOf2;
                    objArr[9] = Boolean.TRUE;
                    objArr[10] = valueOf3;
                    objArr[11] = valueOf4;
                    objArr[12] = 0;
                    objArr[13] = 0;
                    objArr[14] = 7;
                    f10.k(14, objArr);
                    ks f11 = ks.f(i13);
                    Integer valueOf5 = Integer.valueOf(i10);
                    Integer valueOf6 = Integer.valueOf(laVar.m);
                    Boolean valueOf7 = Boolean.valueOf(laVar.n);
                    Integer valueOf8 = Integer.valueOf(laVar.b());
                    Integer valueOf9 = Integer.valueOf(laVar.l);
                    Object[] objArr2 = new Object[6];
                    objArr2[0] = valueOf5;
                    objArr2[1] = valueOf6;
                    objArr2[i19] = valueOf7;
                    objArr2[3] = valueOf8;
                    objArr2[4] = valueOf9;
                    objArr2[5] = 0;
                    f11.k(71, objArr2);
                    break;
                }
                break;
            case 1:
                ri riVar = (ri) obj5;
                boolean[] zArr = (boolean[]) obj4;
                TLRPC.StickerSet stickerSet = (TLRPC.StickerSet) obj3;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj2;
                Runnable runnable = (Runnable) obj;
                long[] jArr = riVar.Y;
                ArrayList[] arrayListArr = riVar.H;
                if (!zArr[0]) {
                    zArr[0] = true;
                    riVar.j1(stickerSet.id, false);
                    stickerSet.archived = false;
                    int i20 = this.b;
                    arrayListArr[i20].add(i11, tL_messages_stickerSet);
                    riVar.J.k(tL_messages_stickerSet, stickerSet.id);
                    riVar.K.k(tL_messages_stickerSet, stickerSet.id);
                    String str = stickerSet.short_name;
                    if (str != null) {
                        riVar.O.put(str.toLowerCase(), tL_messages_stickerSet);
                    }
                    riVar.U.l(stickerSet.id);
                    long s5 = ri.s(arrayListArr[i20]);
                    jArr[i20] = s5;
                    riVar.O1(i20, riVar.Z[i20], s5, arrayListArr[i20]);
                    if (runnable != null) {
                        runnable.run();
                    }
                    riVar.getNotificationCenter().k(60, Integer.valueOf(i20), Boolean.TRUE);
                    break;
                }
                break;
            default:
                p4.v vVar = (p4.v) obj4;
                p4.k1 k1Var = (p4.k1) obj3;
                p4.d0 d0Var = (p4.d0) obj2;
                p4.c1 c1Var = (p4.c1) obj;
                ab.c0 c0Var = ((p4.e1) obj5).b;
                if (c0Var.A(vVar)) {
                    if (k1Var == null) {
                        if (!c0Var.D(vVar, i11)) {
                            p4.e1.r1(d0Var, vVar, i10, new p4.o1(-4));
                            break;
                        }
                    } else if (!c0Var.F(vVar, k1Var)) {
                        p4.e1.r1(d0Var, vVar, i10, new p4.o1(-4));
                        break;
                    }
                    c1Var.k(d0Var, vVar, i10);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ ja(ri riVar, boolean[] zArr, TLRPC.StickerSet stickerSet, int i7, int i10, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, Runnable runnable) {
        this.d = riVar;
        this.e = zArr;
        this.f = stickerSet;
        this.b = i7;
        this.c = i10;
        this.h = tL_messages_stickerSet;
        this.n = runnable;
    }

    public /* synthetic */ ja(p4.e1 e1Var, p4.v vVar, p4.k1 k1Var, p4.d0 d0Var, int i7, int i10, p4.c1 c1Var) {
        this.d = e1Var;
        this.e = vVar;
        this.f = k1Var;
        this.h = d0Var;
        this.b = i7;
        this.c = i10;
        this.n = c1Var;
    }
}
