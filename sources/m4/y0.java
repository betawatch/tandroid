package m4;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.hs;
import org.telegram.messenger.jj;
import org.telegram.messenger.ma;
import org.telegram.messenger.na;
import org.telegram.messenger.oa;
import org.telegram.messenger.ui;
import org.telegram.messenger.vp;
import org.telegram.messenger.zs;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class y0 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object n;

    public /* synthetic */ y0(j1 j1Var, w wVar, p1 p1Var, f0 f0Var, int i10, int i11, h1 h1Var) {
        this.d = j1Var;
        this.e = wVar;
        this.f = p1Var;
        this.h = f0Var;
        this.b = i10;
        this.c = i11;
        this.n = h1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        int i11 = this.b;
        Object obj = this.n;
        Object obj2 = this.h;
        int i12 = this.c;
        Object obj3 = this.f;
        Object obj4 = this.e;
        Object obj5 = this.d;
        int i13 = 2;
        switch (i10) {
            case 0:
                w wVar = (w) obj4;
                p1 p1Var = (p1) obj3;
                f0 f0Var = (f0) obj2;
                h1 h1Var = (h1) obj;
                xa.n nVar = ((j1) obj5).b;
                if (nVar.L(wVar)) {
                    if (p1Var == null) {
                        if (!nVar.N(wVar, i12)) {
                            j1.R0(f0Var, wVar, i11, new t1(-4));
                            break;
                        }
                    } else if (!nVar.O(wVar, p1Var)) {
                        j1.R0(f0Var, wVar, i11, new t1(-4));
                        break;
                    }
                    h1Var.f(f0Var, wVar, i11);
                    break;
                }
                break;
            case 1:
                na naVar = (na) obj3;
                TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) obj2;
                ArrayList arrayList = (ArrayList) obj;
                int i14 = ((oa) obj5).a;
                int i15 = ((int[]) obj4)[0];
                int i16 = naVar.d;
                HashMap hashMap = naVar.b;
                if (i15 == i16) {
                    naVar.d = -1;
                    naVar.f = false;
                    naVar.g = messages_messages.next_rate;
                    int size = arrayList.size();
                    int i17 = 0;
                    while (i17 < size) {
                        Object obj6 = arrayList.get(i17);
                        i17++;
                        jj jjVar = (jj) obj6;
                        int i18 = i13;
                        ma maVar = new ma(jjVar.k);
                        Integer num = (Integer) hashMap.get(maVar);
                        if (num == null) {
                            int i19 = naVar.j;
                            naVar.j = i19 - 1;
                            num = Integer.valueOf(i19);
                            hashMap.put(maVar, num);
                            naVar.a.add(jjVar);
                        }
                        TLRPC.Message message = jjVar.k;
                        message.realId = message.id;
                        message.id = num.intValue();
                        i13 = i18;
                    }
                    int i20 = i13;
                    if (!messages_messages.messages.isEmpty()) {
                        TLRPC.Message message2 = (TLRPC.Message) i0.a.g(1, messages_messages.messages);
                        naVar.h = message2.realId;
                        naVar.i = message2.peer_id;
                    }
                    hs.a0(i14).m1(messages_messages.users, messages_messages.chats, true, true);
                    vp.r1(i14).V3(messages_messages.users, false);
                    vp.r1(i14).P3(messages_messages.chats, false);
                    naVar.n = messages_messages.messages.size() < 21;
                    naVar.m = Math.max(messages_messages.count, messages_messages.messages.size());
                    zs f7 = zs.f(i14);
                    Integer valueOf = Integer.valueOf(arrayList.size());
                    Integer valueOf2 = Integer.valueOf(i20);
                    Integer valueOf3 = Integer.valueOf(i11);
                    Integer valueOf4 = Integer.valueOf(i12);
                    Object[] objArr = new Object[15];
                    objArr[0] = 0L;
                    objArr[1] = valueOf;
                    objArr[i20] = arrayList;
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
                    f7.k(14, objArr);
                    zs f10 = zs.f(i14);
                    Integer valueOf5 = Integer.valueOf(i11);
                    Integer valueOf6 = Integer.valueOf(naVar.m);
                    Boolean valueOf7 = Boolean.valueOf(naVar.n);
                    Integer valueOf8 = Integer.valueOf(naVar.b());
                    Integer valueOf9 = Integer.valueOf(naVar.l);
                    Object[] objArr2 = new Object[6];
                    objArr2[0] = valueOf5;
                    objArr2[1] = valueOf6;
                    objArr2[i20] = valueOf7;
                    objArr2[3] = valueOf8;
                    objArr2[4] = valueOf9;
                    objArr2[5] = 0;
                    f10.k(71, objArr2);
                    break;
                }
                break;
            default:
                ui uiVar = (ui) obj5;
                boolean[] zArr = (boolean[]) obj4;
                TLRPC.StickerSet stickerSet = (TLRPC.StickerSet) obj3;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj2;
                Runnable runnable = (Runnable) obj;
                long[] jArr = uiVar.X;
                ArrayList[] arrayListArr = uiVar.G;
                if (!zArr[0]) {
                    zArr[0] = true;
                    uiVar.g1(stickerSet.id, false);
                    stickerSet.archived = false;
                    int i21 = this.b;
                    arrayListArr[i21].add(i12, tL_messages_stickerSet);
                    uiVar.I.k(tL_messages_stickerSet, stickerSet.id);
                    uiVar.J.k(tL_messages_stickerSet, stickerSet.id);
                    String str = stickerSet.short_name;
                    if (str != null) {
                        uiVar.N.put(str.toLowerCase(), tL_messages_stickerSet);
                    }
                    uiVar.T.l(stickerSet.id);
                    long q6 = ui.q(arrayListArr[i21]);
                    jArr[i21] = q6;
                    uiVar.J1(i21, uiVar.Y[i21], q6, arrayListArr[i21]);
                    if (runnable != null) {
                        runnable.run();
                    }
                    uiVar.getNotificationCenter().k(60, Integer.valueOf(i21), Boolean.TRUE);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ y0(oa oaVar, int[] iArr, na naVar, TLRPC.messages_Messages messages_messages, ArrayList arrayList, int i10, int i11) {
        this.d = oaVar;
        this.e = iArr;
        this.f = naVar;
        this.h = messages_messages;
        this.n = arrayList;
        this.b = i10;
        this.c = i11;
    }

    public /* synthetic */ y0(ui uiVar, boolean[] zArr, TLRPC.StickerSet stickerSet, int i10, int i11, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, Runnable runnable) {
        this.d = uiVar;
        this.e = zArr;
        this.f = stickerSet;
        this.b = i10;
        this.c = i11;
        this.h = tL_messages_stickerSet;
        this.n = runnable;
    }
}
