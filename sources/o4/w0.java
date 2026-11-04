package o4;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.fa;
import org.telegram.messenger.ga;
import org.telegram.messenger.ha;
import org.telegram.messenger.hp;
import org.telegram.messenger.hs;
import org.telegram.messenger.li;
import org.telegram.messenger.qr;
import org.telegram.messenger.zi;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class w0 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object n;

    public /* synthetic */ w0(h1 h1Var, v vVar, n1 n1Var, e0 e0Var, int i3, int i10, f1 f1Var) {
        this.d = h1Var;
        this.e = vVar;
        this.f = n1Var;
        this.h = e0Var;
        this.b = i3;
        this.c = i10;
        this.n = f1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i3 = this.a;
        int i10 = this.b;
        Object obj = this.n;
        Object obj2 = this.h;
        int i11 = this.c;
        Object obj3 = this.f;
        Object obj4 = this.e;
        Object obj5 = this.d;
        int i12 = 2;
        switch (i3) {
            case 0:
                v vVar = (v) obj4;
                n1 n1Var = (n1) obj3;
                e0 e0Var = (e0) obj2;
                f1 f1Var = (f1) obj;
                ui.f fVar = ((h1) obj5).b;
                if (fVar.t(vVar)) {
                    if (n1Var == null) {
                        if (!fVar.x(vVar, i11)) {
                            h1.R0(e0Var, vVar, i10, new r1(-4));
                            break;
                        }
                    } else if (!fVar.y(vVar, n1Var)) {
                        h1.R0(e0Var, vVar, i10, new r1(-4));
                        break;
                    }
                    f1Var.i(e0Var, vVar, i10);
                    break;
                }
                break;
            case 1:
                ga gaVar = (ga) obj3;
                TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) obj2;
                ArrayList arrayList = (ArrayList) obj;
                int i13 = ((ha) obj5).a;
                int i14 = ((int[]) obj4)[0];
                int i15 = gaVar.d;
                HashMap hashMap = gaVar.b;
                if (i14 == i15) {
                    gaVar.d = -1;
                    gaVar.f = false;
                    gaVar.g = messages_messages.next_rate;
                    int size = arrayList.size();
                    int i16 = 0;
                    while (i16 < size) {
                        Object obj6 = arrayList.get(i16);
                        i16++;
                        zi ziVar = (zi) obj6;
                        int i17 = i12;
                        fa faVar = new fa(ziVar.k);
                        Integer num = (Integer) hashMap.get(faVar);
                        if (num == null) {
                            int i18 = gaVar.j;
                            gaVar.j = i18 - 1;
                            num = Integer.valueOf(i18);
                            hashMap.put(faVar, num);
                            gaVar.a.add(ziVar);
                        }
                        TLRPC.Message message = ziVar.k;
                        message.realId = message.id;
                        message.id = num.intValue();
                        i12 = i17;
                    }
                    int i19 = i12;
                    if (!messages_messages.messages.isEmpty()) {
                        TLRPC.Message message2 = (TLRPC.Message) k2.p1.h(1, messages_messages.messages);
                        gaVar.h = message2.realId;
                        gaVar.i = message2.peer_id;
                    }
                    qr.a0(i13).m1(messages_messages.users, messages_messages.chats, true, true);
                    hp.s1(i13).Y3(messages_messages.users, false);
                    hp.s1(i13).S3(messages_messages.chats, false);
                    gaVar.n = messages_messages.messages.size() < 21;
                    gaVar.m = Math.max(messages_messages.count, messages_messages.messages.size());
                    hs f10 = hs.f(i13);
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
                    hs f11 = hs.f(i13);
                    Integer valueOf5 = Integer.valueOf(i10);
                    Integer valueOf6 = Integer.valueOf(gaVar.m);
                    Boolean valueOf7 = Boolean.valueOf(gaVar.n);
                    Integer valueOf8 = Integer.valueOf(gaVar.b());
                    Integer valueOf9 = Integer.valueOf(gaVar.l);
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
            default:
                li liVar = (li) obj5;
                boolean[] zArr = (boolean[]) obj4;
                TLRPC.StickerSet stickerSet = (TLRPC.StickerSet) obj3;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj2;
                Runnable runnable = (Runnable) obj;
                long[] jArr = liVar.Y;
                ArrayList[] arrayListArr = liVar.H;
                if (!zArr[0]) {
                    zArr[0] = true;
                    liVar.g1(stickerSet.id, false);
                    stickerSet.archived = false;
                    int i20 = this.b;
                    arrayListArr[i20].add(i11, tL_messages_stickerSet);
                    liVar.J.k(tL_messages_stickerSet, stickerSet.id);
                    liVar.K.k(tL_messages_stickerSet, stickerSet.id);
                    String str = stickerSet.short_name;
                    if (str != null) {
                        liVar.O.put(str.toLowerCase(), tL_messages_stickerSet);
                    }
                    liVar.U.l(stickerSet.id);
                    long q10 = li.q(arrayListArr[i20]);
                    jArr[i20] = q10;
                    liVar.J1(i20, liVar.Z[i20], q10, arrayListArr[i20]);
                    if (runnable != null) {
                        runnable.run();
                    }
                    liVar.getNotificationCenter().k(60, Integer.valueOf(i20), Boolean.TRUE);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ w0(ha haVar, int[] iArr, ga gaVar, TLRPC.messages_Messages messages_messages, ArrayList arrayList, int i3, int i10) {
        this.d = haVar;
        this.e = iArr;
        this.f = gaVar;
        this.h = messages_messages;
        this.n = arrayList;
        this.b = i3;
        this.c = i10;
    }

    public /* synthetic */ w0(li liVar, boolean[] zArr, TLRPC.StickerSet stickerSet, int i3, int i10, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, Runnable runnable) {
        this.d = liVar;
        this.e = zArr;
        this.f = stickerSet;
        this.b = i3;
        this.c = i10;
        this.h = tL_messages_stickerSet;
        this.n = runnable;
    }
}
