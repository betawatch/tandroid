package org.telegram.messenger;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class og implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ long c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ f1 h;
    public final /* synthetic */ Object n;

    public /* synthetic */ og(ui uiVar, boolean z10, ArrayList arrayList, int i10, long j10, int i11, Runnable runnable) {
        this.h = uiVar;
        this.f = z10;
        this.b = arrayList;
        this.d = i10;
        this.c = j10;
        this.e = i11;
        this.n = runnable;
    }

    /* JADX WARN: Code restructure failed: missing block: B:98:0x018f, code lost:
    
        if (java.lang.Math.abs((java.lang.System.currentTimeMillis() / 1000) - r14) < 3600) goto L89;
     */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x030a  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01c7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x011e  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        long j10;
        int i10;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        String str;
        a0.h hVar;
        long j11;
        SparseArray sparseArray;
        boolean z10;
        LongSparseIntArray longSparseIntArray;
        long j12;
        int i11 = this.a;
        boolean z11 = this.f;
        Object obj = this.n;
        f1 f1Var = this.h;
        switch (i11) {
            case 0:
                ui uiVar = (ui) f1Var;
                Runnable runnable = (Runnable) obj;
                ArrayList arrayList4 = this.b;
                int i12 = this.d;
                long j13 = this.c;
                int i13 = this.e;
                if (z11) {
                    if (arrayList4 != null) {
                        boolean z12 = v2.a;
                        break;
                    }
                    j10 = j13;
                    i10 = i13;
                    arrayList = arrayList4;
                    i0.h3(new rk(i10, 3, j10, uiVar, arrayList4), (arrayList == null || z11) ? 0L : 1000L);
                    if (arrayList == null) {
                        if (runnable != null) {
                            runnable.run();
                            break;
                        }
                    }
                    if (arrayList == null) {
                        int i14 = i10;
                        if (z11) {
                            if (runnable != null) {
                                runnable.run();
                                break;
                            }
                        } else {
                            i0.g3(new i2.u(uiVar, i14, i12, 3));
                            uiVar.J1(i14, i12, 0L, null);
                            if (runnable != null) {
                                runnable.run();
                                break;
                            }
                        }
                    } else {
                        try {
                            ArrayList arrayList5 = new ArrayList();
                            a0.h hVar2 = new a0.h();
                            HashMap hashMap = new HashMap();
                            a0.h hVar3 = new a0.h();
                            a0.h hVar4 = new a0.h();
                            HashMap hashMap2 = new HashMap();
                            int i15 = 0;
                            while (i15 < arrayList.size()) {
                                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) arrayList.get(i15);
                                if (tL_messages_stickerSet != null) {
                                    arrayList3 = arrayList;
                                    if (uiVar.T.h(tL_messages_stickerSet.set.id) < 0) {
                                        arrayList5.add(tL_messages_stickerSet);
                                        hVar2.k(tL_messages_stickerSet, tL_messages_stickerSet.set.id);
                                        hashMap.put(tL_messages_stickerSet.set.short_name, tL_messages_stickerSet);
                                        for (int i16 = 0; i16 < tL_messages_stickerSet.documents.size(); i16++) {
                                            TLRPC.Document document = tL_messages_stickerSet.documents.get(i16);
                                            if (document != null && !(document instanceof TLRPC.TL_documentEmpty)) {
                                                hVar4.k(document, document.id);
                                            }
                                        }
                                        if (!tL_messages_stickerSet.set.archived) {
                                            int i17 = 0;
                                            while (i17 < tL_messages_stickerSet.packs.size()) {
                                                TLRPC.TL_stickerPack tL_stickerPack = tL_messages_stickerSet.packs.get(i17);
                                                if (tL_stickerPack != null && (str = tL_stickerPack.emoticon) != null) {
                                                    String replace = str.replace("️", "");
                                                    tL_stickerPack.emoticon = replace;
                                                    ArrayList arrayList6 = (ArrayList) hashMap2.get(replace);
                                                    if (arrayList6 == null) {
                                                        arrayList6 = new ArrayList();
                                                        hashMap2.put(tL_stickerPack.emoticon, arrayList6);
                                                    }
                                                    int i18 = 0;
                                                    while (i18 < tL_stickerPack.documents.size()) {
                                                        Long l4 = tL_stickerPack.documents.get(i18);
                                                        ArrayList arrayList7 = arrayList5;
                                                        int i19 = i17;
                                                        if (hVar3.h(l4.longValue()) < 0) {
                                                            hVar = hVar2;
                                                            hVar3.k(tL_stickerPack.emoticon, l4.longValue());
                                                        } else {
                                                            hVar = hVar2;
                                                        }
                                                        TLRPC.Document document2 = (TLRPC.Document) hVar4.f(l4.longValue());
                                                        if (document2 != null) {
                                                            arrayList6.add(document2);
                                                        }
                                                        i18++;
                                                        i17 = i19;
                                                        arrayList5 = arrayList7;
                                                        hVar2 = hVar;
                                                    }
                                                }
                                                i17++;
                                                arrayList5 = arrayList5;
                                                hVar2 = hVar2;
                                            }
                                        }
                                    }
                                    arrayList2 = arrayList5;
                                } else {
                                    arrayList2 = arrayList5;
                                    arrayList3 = arrayList;
                                }
                                i15++;
                                arrayList5 = arrayList2;
                                hVar2 = hVar2;
                                arrayList = arrayList3;
                            }
                            ArrayList arrayList8 = arrayList5;
                            a0.h hVar5 = hVar2;
                            if (!z11) {
                                uiVar.J1(i10, i12, j10, arrayList8);
                            }
                            i0.g3(new u7(uiVar, i10, hVar5, hashMap, arrayList8, j10, i12, hVar4, hashMap2, hVar3, runnable));
                            break;
                        } catch (Throwable th2) {
                            f8.g(th2, true);
                            if (runnable != null) {
                                runnable.run();
                                return;
                            }
                            return;
                        }
                    }
                }
                if (z11 || arrayList4 != null || j13 != 0) {
                    j10 = j13;
                    i10 = i13;
                    arrayList = arrayList4;
                    if (arrayList == null) {
                    }
                }
                j10 = j13;
                i10 = i13;
                arrayList = arrayList4;
                i0.h3(new rk(i10, 3, j10, uiVar, arrayList4), (arrayList == null || z11) ? 0L : 1000L);
                if (arrayList == null) {
                }
                if (arrayList == null) {
                }
                break;
            default:
                ot otVar = (ot) f1Var;
                LongSparseIntArray longSparseIntArray2 = (LongSparseIntArray) obj;
                ArrayList arrayList9 = otVar.b;
                a0.h hVar6 = otVar.c;
                ArrayList arrayList10 = otVar.a;
                ArrayList arrayList11 = this.b;
                if (longSparseIntArray2 != null) {
                    for (int i20 = 0; i20 < longSparseIntArray2.size(); i20++) {
                        long keyAt = longSparseIntArray2.keyAt(i20);
                        int i21 = longSparseIntArray2.get(keyAt);
                        int i22 = 0;
                        while (i22 < arrayList10.size()) {
                            jj jjVar = (jj) arrayList10.get(i22);
                            TLRPC.Message message = jjVar.k;
                            if (message.from_scheduled || jj.B0(message) != keyAt || jjVar.f1() > i21 || jjVar.J) {
                                z10 = z11;
                                longSparseIntArray = longSparseIntArray2;
                            } else {
                                if (ot.E(jjVar)) {
                                    otVar.J--;
                                }
                                arrayList11.add(jjVar);
                                if (jjVar.J) {
                                    z10 = z11;
                                    j12 = jj.B0(jjVar.k);
                                } else {
                                    z10 = z11;
                                    long j14 = jjVar.k.peer_id.channel_id;
                                    j12 = j14 != 0 ? -j14 : 0L;
                                }
                                SparseArray sparseArray2 = (SparseArray) hVar6.f(j12);
                                longSparseIntArray = longSparseIntArray2;
                                if (sparseArray2 != null) {
                                    sparseArray2.remove(jjVar.f1());
                                    if (sparseArray2.size() == 0) {
                                        hVar6.l(j12);
                                    }
                                }
                                arrayList9.remove(jjVar);
                                arrayList10.remove(i22);
                                i22--;
                            }
                            i22++;
                            z11 = z10;
                            longSparseIntArray2 = longSparseIntArray;
                        }
                    }
                }
                boolean z13 = z11;
                long j15 = this.c;
                if (j15 != 0) {
                    int i23 = this.d;
                    int i24 = this.e;
                    if (i23 != 0 || i24 != 0) {
                        int i25 = 0;
                        while (i25 < arrayList10.size()) {
                            jj jjVar2 = (jj) arrayList10.get(i25);
                            if (jj.B0(jjVar2.k) == j15 && !jjVar2.J) {
                                if (i24 != 0) {
                                    if (jjVar2.k.date > i24) {
                                    }
                                    if (ot.E(jjVar2)) {
                                        otVar.J--;
                                    }
                                    if (jjVar2.J) {
                                        j11 = jj.B0(jjVar2.k);
                                    } else {
                                        long j16 = jjVar2.k.peer_id.channel_id;
                                        j11 = j16 != 0 ? -j16 : 0L;
                                    }
                                    sparseArray = (SparseArray) hVar6.f(j11);
                                    if (sparseArray != null) {
                                        sparseArray.remove(jjVar2.f1());
                                        if (sparseArray.size() == 0) {
                                            hVar6.l(j11);
                                        }
                                    }
                                    arrayList10.remove(i25);
                                    arrayList9.remove(jjVar2);
                                    arrayList11.add(jjVar2);
                                    i25--;
                                } else if (z13) {
                                    if (jjVar2.f1() != i23 && i23 >= 0) {
                                    }
                                    if (ot.E(jjVar2)) {
                                    }
                                    if (jjVar2.J) {
                                    }
                                    sparseArray = (SparseArray) hVar6.f(j11);
                                    if (sparseArray != null) {
                                    }
                                    arrayList10.remove(i25);
                                    arrayList9.remove(jjVar2);
                                    arrayList11.add(jjVar2);
                                    i25--;
                                } else {
                                    if (jjVar2.f1() > i23 && i23 >= 0) {
                                    }
                                    if (ot.E(jjVar2)) {
                                    }
                                    if (jjVar2.J) {
                                    }
                                    sparseArray = (SparseArray) hVar6.f(j11);
                                    if (sparseArray != null) {
                                    }
                                    arrayList10.remove(i25);
                                    arrayList9.remove(jjVar2);
                                    arrayList11.add(jjVar2);
                                    i25--;
                                }
                            }
                            i25++;
                        }
                    }
                }
                if (!arrayList11.isEmpty()) {
                    i0.g3(new ct(otVar, arrayList11, 2));
                    break;
                }
                break;
        }
    }

    public /* synthetic */ og(ot otVar, LongSparseIntArray longSparseIntArray, ArrayList arrayList, long j10, int i10, int i11, boolean z10) {
        this.h = otVar;
        this.n = longSparseIntArray;
        this.b = arrayList;
        this.c = j10;
        this.d = i10;
        this.e = i11;
        this.f = z10;
    }
}
