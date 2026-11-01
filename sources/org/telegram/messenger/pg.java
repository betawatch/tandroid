package org.telegram.messenger;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final /* synthetic */ class pg implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ long c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ f1 h;
    public final /* synthetic */ Object n;

    public /* synthetic */ pg(vi viVar, boolean z10, ArrayList arrayList, int i10, long j10, int i11, Runnable runnable) {
        this.h = viVar;
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
                vi viVar = (vi) f1Var;
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
                    i0.h3(new sk(i10, 3, j10, viVar, arrayList4), (arrayList == null || z11) ? 0L : 1000L);
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
                            i0.g3(new i2.u(viVar, i14, i12, 3));
                            viVar.J1(i14, i12, 0L, null);
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
                                    if (viVar.T.h(tL_messages_stickerSet.set.id) < 0) {
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
                                viVar.J1(i10, i12, j10, arrayList8);
                            }
                            i0.g3(new u7(viVar, i10, hVar5, hashMap, arrayList8, j10, i12, hVar4, hashMap2, hVar3, runnable));
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
                i0.h3(new sk(i10, 3, j10, viVar, arrayList4), (arrayList == null || z11) ? 0L : 1000L);
                if (arrayList == null) {
                }
                if (arrayList == null) {
                }
                break;
            default:
                pt ptVar = (pt) f1Var;
                LongSparseIntArray longSparseIntArray2 = (LongSparseIntArray) obj;
                ArrayList arrayList9 = ptVar.b;
                a0.h hVar6 = ptVar.c;
                ArrayList arrayList10 = ptVar.a;
                ArrayList arrayList11 = this.b;
                if (longSparseIntArray2 != null) {
                    for (int i20 = 0; i20 < longSparseIntArray2.size(); i20++) {
                        long keyAt = longSparseIntArray2.keyAt(i20);
                        int i21 = longSparseIntArray2.get(keyAt);
                        int i22 = 0;
                        while (i22 < arrayList10.size()) {
                            kj kjVar = (kj) arrayList10.get(i22);
                            TLRPC.Message message = kjVar.k;
                            if (message.from_scheduled || kj.B0(message) != keyAt || kjVar.f1() > i21 || kjVar.J) {
                                z10 = z11;
                                longSparseIntArray = longSparseIntArray2;
                            } else {
                                if (pt.E(kjVar)) {
                                    ptVar.J--;
                                }
                                arrayList11.add(kjVar);
                                if (kjVar.J) {
                                    z10 = z11;
                                    j12 = kj.B0(kjVar.k);
                                } else {
                                    z10 = z11;
                                    long j14 = kjVar.k.peer_id.channel_id;
                                    j12 = j14 != 0 ? -j14 : 0L;
                                }
                                SparseArray sparseArray2 = (SparseArray) hVar6.f(j12);
                                longSparseIntArray = longSparseIntArray2;
                                if (sparseArray2 != null) {
                                    sparseArray2.remove(kjVar.f1());
                                    if (sparseArray2.size() == 0) {
                                        hVar6.l(j12);
                                    }
                                }
                                arrayList9.remove(kjVar);
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
                            kj kjVar2 = (kj) arrayList10.get(i25);
                            if (kj.B0(kjVar2.k) == j15 && !kjVar2.J) {
                                if (i24 != 0) {
                                    if (kjVar2.k.date > i24) {
                                    }
                                    if (pt.E(kjVar2)) {
                                        ptVar.J--;
                                    }
                                    if (kjVar2.J) {
                                        j11 = kj.B0(kjVar2.k);
                                    } else {
                                        long j16 = kjVar2.k.peer_id.channel_id;
                                        j11 = j16 != 0 ? -j16 : 0L;
                                    }
                                    sparseArray = (SparseArray) hVar6.f(j11);
                                    if (sparseArray != null) {
                                        sparseArray.remove(kjVar2.f1());
                                        if (sparseArray.size() == 0) {
                                            hVar6.l(j11);
                                        }
                                    }
                                    arrayList10.remove(i25);
                                    arrayList9.remove(kjVar2);
                                    arrayList11.add(kjVar2);
                                    i25--;
                                } else if (z13) {
                                    if (kjVar2.f1() != i23 && i23 >= 0) {
                                    }
                                    if (pt.E(kjVar2)) {
                                    }
                                    if (kjVar2.J) {
                                    }
                                    sparseArray = (SparseArray) hVar6.f(j11);
                                    if (sparseArray != null) {
                                    }
                                    arrayList10.remove(i25);
                                    arrayList9.remove(kjVar2);
                                    arrayList11.add(kjVar2);
                                    i25--;
                                } else {
                                    if (kjVar2.f1() > i23 && i23 >= 0) {
                                    }
                                    if (pt.E(kjVar2)) {
                                    }
                                    if (kjVar2.J) {
                                    }
                                    sparseArray = (SparseArray) hVar6.f(j11);
                                    if (sparseArray != null) {
                                    }
                                    arrayList10.remove(i25);
                                    arrayList9.remove(kjVar2);
                                    arrayList11.add(kjVar2);
                                    i25--;
                                }
                            }
                            i25++;
                        }
                    }
                }
                if (!arrayList11.isEmpty()) {
                    i0.g3(new dt(ptVar, arrayList11, 2));
                    break;
                }
                break;
        }
    }

    public /* synthetic */ pg(pt ptVar, LongSparseIntArray longSparseIntArray, ArrayList arrayList, long j10, int i10, int i11, boolean z10) {
        this.h = ptVar;
        this.n = longSparseIntArray;
        this.b = arrayList;
        this.c = j10;
        this.d = i10;
        this.e = i11;
        this.f = z10;
    }
}
