package org.telegram.messenger;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final /* synthetic */ class pg implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ long c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ c1 h;
    public final /* synthetic */ Object n;

    public /* synthetic */ pg(ui uiVar, boolean z9, ArrayList arrayList, int i7, long j3, int i10, Runnable runnable) {
        this.h = uiVar;
        this.f = z9;
        this.b = arrayList;
        this.d = i7;
        this.c = j3;
        this.e = i10;
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
        long j3;
        int i7;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        String str;
        a0.h hVar;
        long j10;
        SparseArray sparseArray;
        boolean z9;
        LongSparseIntArray longSparseIntArray;
        long j11;
        int i10 = this.a;
        boolean z10 = this.f;
        Object obj = this.n;
        c1 c1Var = this.h;
        switch (i10) {
            case 0:
                ui uiVar = (ui) c1Var;
                Runnable runnable = (Runnable) obj;
                ArrayList arrayList4 = this.b;
                int i11 = this.d;
                long j12 = this.c;
                int i12 = this.e;
                if (z10) {
                    if (arrayList4 != null) {
                        boolean z11 = r2.a;
                        break;
                    }
                    j3 = j12;
                    i7 = i12;
                    arrayList = arrayList4;
                    g0.i3(new ik(i7, 3, j3, uiVar, arrayList4), (arrayList == null || z10) ? 0L : 1000L);
                    if (arrayList == null) {
                        if (runnable != null) {
                            runnable.run();
                            break;
                        }
                    }
                    if (arrayList == null) {
                        int i13 = i7;
                        if (z10) {
                            if (runnable != null) {
                                runnable.run();
                                break;
                            }
                        } else {
                            g0.h3(new jg.r(uiVar, i13, i11, 4));
                            uiVar.J1(i13, i11, 0L, null);
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
                            int i14 = 0;
                            while (i14 < arrayList.size()) {
                                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) arrayList.get(i14);
                                if (tL_messages_stickerSet != null) {
                                    arrayList3 = arrayList;
                                    if (uiVar.T.h(tL_messages_stickerSet.set.id) < 0) {
                                        arrayList5.add(tL_messages_stickerSet);
                                        hVar2.k(tL_messages_stickerSet, tL_messages_stickerSet.set.id);
                                        hashMap.put(tL_messages_stickerSet.set.short_name, tL_messages_stickerSet);
                                        for (int i15 = 0; i15 < tL_messages_stickerSet.documents.size(); i15++) {
                                            TLRPC.Document document = tL_messages_stickerSet.documents.get(i15);
                                            if (document != null && !(document instanceof TLRPC.TL_documentEmpty)) {
                                                hVar4.k(document, document.id);
                                            }
                                        }
                                        if (!tL_messages_stickerSet.set.archived) {
                                            int i16 = 0;
                                            while (i16 < tL_messages_stickerSet.packs.size()) {
                                                TLRPC.TL_stickerPack tL_stickerPack = tL_messages_stickerSet.packs.get(i16);
                                                if (tL_stickerPack != null && (str = tL_stickerPack.emoticon) != null) {
                                                    String replace = str.replace("️", "");
                                                    tL_stickerPack.emoticon = replace;
                                                    ArrayList arrayList6 = (ArrayList) hashMap2.get(replace);
                                                    if (arrayList6 == null) {
                                                        arrayList6 = new ArrayList();
                                                        hashMap2.put(tL_stickerPack.emoticon, arrayList6);
                                                    }
                                                    int i17 = 0;
                                                    while (i17 < tL_stickerPack.documents.size()) {
                                                        Long l10 = tL_stickerPack.documents.get(i17);
                                                        ArrayList arrayList7 = arrayList5;
                                                        int i18 = i16;
                                                        if (hVar3.h(l10.longValue()) < 0) {
                                                            hVar = hVar2;
                                                            hVar3.k(tL_stickerPack.emoticon, l10.longValue());
                                                        } else {
                                                            hVar = hVar2;
                                                        }
                                                        TLRPC.Document document2 = (TLRPC.Document) hVar4.f(l10.longValue());
                                                        if (document2 != null) {
                                                            arrayList6.add(document2);
                                                        }
                                                        i17++;
                                                        i16 = i18;
                                                        arrayList5 = arrayList7;
                                                        hVar2 = hVar;
                                                    }
                                                }
                                                i16++;
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
                                i14++;
                                arrayList5 = arrayList2;
                                hVar2 = hVar2;
                                arrayList = arrayList3;
                            }
                            ArrayList arrayList8 = arrayList5;
                            a0.h hVar5 = hVar2;
                            if (!z10) {
                                uiVar.J1(i7, i11, j3, arrayList8);
                            }
                            g0.h3(new p7(uiVar, i7, hVar5, hashMap, arrayList8, j3, i11, hVar4, hashMap2, hVar3, runnable));
                            break;
                        } catch (Throwable th2) {
                            a8.g(th2, true);
                            if (runnable != null) {
                                runnable.run();
                                return;
                            }
                            return;
                        }
                    }
                }
                if (z10 || arrayList4 != null || j12 != 0) {
                    j3 = j12;
                    i7 = i12;
                    arrayList = arrayList4;
                    if (arrayList == null) {
                    }
                }
                j3 = j12;
                i7 = i12;
                arrayList = arrayList4;
                g0.i3(new ik(i7, 3, j3, uiVar, arrayList4), (arrayList == null || z10) ? 0L : 1000L);
                if (arrayList == null) {
                }
                if (arrayList == null) {
                }
                break;
            default:
                dt dtVar = (dt) c1Var;
                LongSparseIntArray longSparseIntArray2 = (LongSparseIntArray) obj;
                ArrayList arrayList9 = dtVar.b;
                a0.h hVar6 = dtVar.c;
                ArrayList arrayList10 = dtVar.a;
                ArrayList arrayList11 = this.b;
                if (longSparseIntArray2 != null) {
                    for (int i19 = 0; i19 < longSparseIntArray2.size(); i19++) {
                        long keyAt = longSparseIntArray2.keyAt(i19);
                        int i20 = longSparseIntArray2.get(keyAt);
                        int i21 = 0;
                        while (i21 < arrayList10.size()) {
                            ij ijVar = (ij) arrayList10.get(i21);
                            TLRPC.Message message = ijVar.k;
                            if (message.from_scheduled || ij.B0(message) != keyAt || ijVar.f1() > i20 || ijVar.J) {
                                z9 = z10;
                                longSparseIntArray = longSparseIntArray2;
                            } else {
                                if (dt.E(ijVar)) {
                                    dtVar.J--;
                                }
                                arrayList11.add(ijVar);
                                if (ijVar.J) {
                                    z9 = z10;
                                    j11 = ij.B0(ijVar.k);
                                } else {
                                    z9 = z10;
                                    long j13 = ijVar.k.peer_id.channel_id;
                                    j11 = j13 != 0 ? -j13 : 0L;
                                }
                                SparseArray sparseArray2 = (SparseArray) hVar6.f(j11);
                                longSparseIntArray = longSparseIntArray2;
                                if (sparseArray2 != null) {
                                    sparseArray2.remove(ijVar.f1());
                                    if (sparseArray2.size() == 0) {
                                        hVar6.l(j11);
                                    }
                                }
                                arrayList9.remove(ijVar);
                                arrayList10.remove(i21);
                                i21--;
                            }
                            i21++;
                            z10 = z9;
                            longSparseIntArray2 = longSparseIntArray;
                        }
                    }
                }
                boolean z12 = z10;
                long j14 = this.c;
                if (j14 != 0) {
                    int i22 = this.d;
                    int i23 = this.e;
                    if (i22 != 0 || i23 != 0) {
                        int i24 = 0;
                        while (i24 < arrayList10.size()) {
                            ij ijVar2 = (ij) arrayList10.get(i24);
                            if (ij.B0(ijVar2.k) == j14 && !ijVar2.J) {
                                if (i23 != 0) {
                                    if (ijVar2.k.date > i23) {
                                    }
                                    if (dt.E(ijVar2)) {
                                        dtVar.J--;
                                    }
                                    if (ijVar2.J) {
                                        j10 = ij.B0(ijVar2.k);
                                    } else {
                                        long j15 = ijVar2.k.peer_id.channel_id;
                                        j10 = j15 != 0 ? -j15 : 0L;
                                    }
                                    sparseArray = (SparseArray) hVar6.f(j10);
                                    if (sparseArray != null) {
                                        sparseArray.remove(ijVar2.f1());
                                        if (sparseArray.size() == 0) {
                                            hVar6.l(j10);
                                        }
                                    }
                                    arrayList10.remove(i24);
                                    arrayList9.remove(ijVar2);
                                    arrayList11.add(ijVar2);
                                    i24--;
                                } else if (z12) {
                                    if (ijVar2.f1() != i22 && i22 >= 0) {
                                    }
                                    if (dt.E(ijVar2)) {
                                    }
                                    if (ijVar2.J) {
                                    }
                                    sparseArray = (SparseArray) hVar6.f(j10);
                                    if (sparseArray != null) {
                                    }
                                    arrayList10.remove(i24);
                                    arrayList9.remove(ijVar2);
                                    arrayList11.add(ijVar2);
                                    i24--;
                                } else {
                                    if (ijVar2.f1() > i22 && i22 >= 0) {
                                    }
                                    if (dt.E(ijVar2)) {
                                    }
                                    if (ijVar2.J) {
                                    }
                                    sparseArray = (SparseArray) hVar6.f(j10);
                                    if (sparseArray != null) {
                                    }
                                    arrayList10.remove(i24);
                                    arrayList9.remove(ijVar2);
                                    arrayList11.add(ijVar2);
                                    i24--;
                                }
                            }
                            i24++;
                        }
                    }
                }
                if (!arrayList11.isEmpty()) {
                    g0.h3(new ts(dtVar, arrayList11, 2));
                    break;
                }
                break;
        }
    }

    public /* synthetic */ pg(dt dtVar, LongSparseIntArray longSparseIntArray, ArrayList arrayList, long j3, int i7, int i10, boolean z9) {
        this.h = dtVar;
        this.n = longSparseIntArray;
        this.b = arrayList;
        this.c = j3;
        this.d = i7;
        this.e = i10;
        this.f = z9;
    }
}
