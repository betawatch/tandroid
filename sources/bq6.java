// default package

import android.util.SparseArray;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class bq6 implements Runnable {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ long c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ pg0 h;
    public final /* synthetic */ Object n;

    public /* synthetic */ bq6(hs6 hs6Var, boolean z, ArrayList arrayList, int i, long j, int i2, Runnable runnable) {
        this.h = hs6Var;
        this.f = z;
        this.b = arrayList;
        this.d = i;
        this.c = j;
        this.e = i2;
        this.n = runnable;
    }

    /* JADX WARN: Code restructure failed: missing block: B:191:0x018b, code lost:
    
        if (r5 == 0) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0184, code lost:
    
        if (java.lang.Math.abs((java.lang.System.currentTimeMillis() / 1000) - r4) < 3600) goto L101;
     */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0116  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        hs6 hs6Var;
        int i;
        int i2;
        vh6 vh6Var;
        ArrayList arrayList;
        hs6 hs6Var2;
        vh6 vh6Var2;
        String str;
        int i3;
        boolean z;
        long j;
        SparseArray sparseArray;
        boolean z2;
        LongSparseIntArray longSparseIntArray;
        long j2;
        byte b = this.a;
        boolean z3 = this.f;
        Object obj = this.n;
        pg0 pg0Var = this.h;
        switch (b) {
            case 0:
                hs6 hs6Var3 = (hs6) pg0Var;
                final Runnable runnable = (Runnable) obj;
                ArrayList arrayList2 = this.b;
                int i4 = this.d;
                final long j3 = this.c;
                int i5 = this.e;
                if (z3) {
                    if (arrayList2 != null) {
                        boolean z4 = e21.a;
                        break;
                    }
                    gm.d3(new o77((Object) hs6Var3, (Object) arrayList2, j3, i5, (byte) 8), (arrayList2 != null || z3) ? 0L : 1000L);
                    if (arrayList2 == null) {
                        if (runnable != null) {
                            runnable.run();
                            break;
                        }
                    }
                } else if (arrayList2 == null) {
                    break;
                }
                if (arrayList2 != null) {
                    try {
                        final ArrayList arrayList3 = new ArrayList();
                        vh6 vh6Var3 = new vh6();
                        final HashMap hashMap = new HashMap();
                        final vh6 vh6Var4 = new vh6();
                        final vh6 vh6Var5 = new vh6();
                        final HashMap hashMap2 = new HashMap();
                        int i6 = 0;
                        while (i6 < arrayList2.size()) {
                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) arrayList2.get(i6);
                            if (tL_messages_stickerSet != null) {
                                arrayList = arrayList2;
                                hs6Var2 = hs6Var3;
                                if (hs6Var3.U.h(tL_messages_stickerSet.set.id) < 0) {
                                    arrayList3.add(tL_messages_stickerSet);
                                    vh6Var3.k(tL_messages_stickerSet, tL_messages_stickerSet.set.id);
                                    hashMap.put(tL_messages_stickerSet.set.short_name, tL_messages_stickerSet);
                                    for (int i7 = 0; i7 < tL_messages_stickerSet.documents.size(); i7++) {
                                        TLRPC.Document document = tL_messages_stickerSet.documents.get(i7);
                                        if (document != null && !(document instanceof TLRPC.TL_documentEmpty)) {
                                            vh6Var5.k(document, document.id);
                                        }
                                    }
                                    if (!tL_messages_stickerSet.set.archived) {
                                        int i8 = 0;
                                        while (i8 < tL_messages_stickerSet.packs.size()) {
                                            TLRPC.TL_stickerPack tL_stickerPack = tL_messages_stickerSet.packs.get(i8);
                                            if (tL_stickerPack == null || (str = tL_stickerPack.emoticon) == null) {
                                                vh6Var2 = vh6Var3;
                                            } else {
                                                vh6Var2 = vh6Var3;
                                                String replace = str.replace("️", "");
                                                tL_stickerPack.emoticon = replace;
                                                ArrayList arrayList4 = (ArrayList) hashMap2.get(replace);
                                                if (arrayList4 == null) {
                                                    arrayList4 = new ArrayList();
                                                    hashMap2.put(tL_stickerPack.emoticon, arrayList4);
                                                }
                                                int i9 = 0;
                                                while (i9 < tL_stickerPack.documents.size()) {
                                                    Long l = tL_stickerPack.documents.get(i9);
                                                    int i10 = i5;
                                                    int i11 = i4;
                                                    if (vh6Var4.h(l.longValue()) < 0) {
                                                        i3 = i8;
                                                        vh6Var4.k(tL_stickerPack.emoticon, l.longValue());
                                                    } else {
                                                        i3 = i8;
                                                    }
                                                    TLRPC.Document document2 = (TLRPC.Document) vh6Var5.f(l.longValue());
                                                    if (document2 != null) {
                                                        arrayList4.add(document2);
                                                    }
                                                    i9++;
                                                    i8 = i3;
                                                    i5 = i10;
                                                    i4 = i11;
                                                }
                                            }
                                            i8++;
                                            vh6Var3 = vh6Var2;
                                            i5 = i5;
                                            i4 = i4;
                                        }
                                    }
                                }
                                vh6Var = vh6Var3;
                            } else {
                                vh6Var = vh6Var3;
                                arrayList = arrayList2;
                                hs6Var2 = hs6Var3;
                            }
                            i6++;
                            vh6Var3 = vh6Var;
                            hs6Var3 = hs6Var2;
                            arrayList2 = arrayList;
                            i5 = i5;
                            i4 = i4;
                        }
                        final vh6 vh6Var6 = vh6Var3;
                        hs6 hs6Var4 = hs6Var3;
                        int i12 = i5;
                        int i13 = i4;
                        if (z3) {
                            hs6Var = hs6Var4;
                            i = i12;
                            i2 = i13;
                        } else {
                            hs6Var = hs6Var4;
                            i = i12;
                            i2 = i13;
                            hs6Var.M1(i, i2, j3, arrayList3);
                        }
                        final hs6 hs6Var5 = hs6Var;
                        final int i14 = i;
                        final int i15 = i2;
                        gm.c3(new Runnable() { // from class: rq6
                            @Override // java.lang.Runnable
                            public final void run() {
                                int i16;
                                hs6 hs6Var6 = hs6.this;
                                vh6 vh6Var7 = hs6Var6.K;
                                ConcurrentHashMap concurrentHashMap = hs6Var6.O;
                                vh6 vh6Var8 = hs6Var6.J;
                                ArrayList[] arrayListArr = hs6Var6.H;
                                int i17 = 0;
                                while (true) {
                                    i16 = i14;
                                    if (i17 >= arrayListArr[i16].size()) {
                                        break;
                                    }
                                    TLRPC.StickerSet stickerSet = ((TLRPC.TL_messages_stickerSet) arrayListArr[i16].get(i17)).set;
                                    vh6Var8.l(stickerSet.id);
                                    concurrentHashMap.remove(stickerSet.short_name);
                                    if (i16 != 3 && i16 != 6 && i16 != 4) {
                                        vh6Var7.l(stickerSet.id);
                                    }
                                    i17++;
                                }
                                int i18 = 0;
                                while (true) {
                                    vh6 vh6Var9 = vh6Var6;
                                    if (i18 >= vh6Var9.m()) {
                                        break;
                                    }
                                    vh6Var8.k((TLRPC.TL_messages_stickerSet) vh6Var9.n(i18), vh6Var9.j(i18));
                                    if (i16 != 3 && i16 != 6 && i16 != 4) {
                                        vh6Var7.k((TLRPC.TL_messages_stickerSet) vh6Var9.n(i18), vh6Var9.j(i18));
                                    }
                                    i18++;
                                }
                                concurrentHashMap.putAll(hashMap);
                                arrayListArr[i16] = arrayList3;
                                hs6Var6.Y[i16] = j3;
                                hs6Var6.Z[i16] = i15;
                                hs6Var6.I[i16] = vh6Var5;
                                HashMap hashMap3 = hashMap2;
                                if (i16 == 0) {
                                    hs6Var6.e0 = hashMap3;
                                    hs6Var6.d0 = vh6Var4;
                                } else if (i16 == 3) {
                                    hs6Var6.f0 = hashMap3;
                                }
                                hs6Var6.getNotificationCenter().k(nm7.x0, Integer.valueOf(i16), Boolean.TRUE);
                                Runnable runnable2 = runnable;
                                if (runnable2 != null) {
                                    runnable2.run();
                                }
                            }
                        });
                        break;
                    } catch (Throwable th) {
                        fc4.g(th, true);
                        if (runnable != null) {
                            runnable.run();
                            return;
                        }
                        return;
                    }
                } else if (z3) {
                    if (runnable != null) {
                        runnable.run();
                        break;
                    }
                } else {
                    gm.c3(new cu((Object) hs6Var3, i5, i4, (byte) 11));
                    hs6Var3.M1(i5, i4, 0L, null);
                    if (runnable != null) {
                        runnable.run();
                        break;
                    }
                }
                break;
            default:
                lo7 lo7Var = (lo7) pg0Var;
                LongSparseIntArray longSparseIntArray2 = (LongSparseIntArray) obj;
                ArrayList arrayList5 = lo7Var.b;
                vh6 vh6Var7 = lo7Var.c;
                ArrayList arrayList6 = lo7Var.a;
                ArrayList arrayList7 = this.b;
                if (longSparseIntArray2 != null) {
                    for (int i16 = 0; i16 < longSparseIntArray2.size(); i16++) {
                        long keyAt = longSparseIntArray2.keyAt(i16);
                        int i17 = longSparseIntArray2.get(keyAt);
                        int i18 = 0;
                        while (i18 < arrayList6.size()) {
                            k47 k47Var = (k47) arrayList6.get(i18);
                            TLRPC.Message message = k47Var.k;
                            if (message.from_scheduled || k47.B0(message) != keyAt || k47Var.e1() > i17 || k47Var.J) {
                                z2 = z3;
                                longSparseIntArray = longSparseIntArray2;
                            } else {
                                if (lo7.y(k47Var)) {
                                    lo7Var.K--;
                                }
                                arrayList7.add(k47Var);
                                boolean z5 = k47Var.J;
                                TLRPC.Message message2 = k47Var.k;
                                if (z5) {
                                    z2 = z3;
                                    j2 = k47.B0(message2);
                                } else {
                                    z2 = z3;
                                    long j4 = message2.peer_id.channel_id;
                                    j2 = j4 != 0 ? -j4 : 0L;
                                }
                                SparseArray sparseArray2 = (SparseArray) vh6Var7.f(j2);
                                longSparseIntArray = longSparseIntArray2;
                                if (sparseArray2 != null) {
                                    sparseArray2.remove(k47Var.e1());
                                    if (sparseArray2.size() == 0) {
                                        vh6Var7.l(j2);
                                    }
                                }
                                arrayList5.remove(k47Var);
                                arrayList6.remove(i18);
                                i18--;
                            }
                            i18++;
                            z3 = z2;
                            longSparseIntArray2 = longSparseIntArray;
                        }
                    }
                }
                boolean z6 = z3;
                long j5 = this.c;
                if (j5 != 0) {
                    int i19 = this.d;
                    int i20 = this.e;
                    if (i19 != 0 || i20 != 0) {
                        int i21 = 0;
                        while (i21 < arrayList6.size()) {
                            k47 k47Var2 = (k47) arrayList6.get(i21);
                            if (k47.B0(k47Var2.k) == j5 && !k47Var2.J) {
                                if (i20 != 0) {
                                    if (k47Var2.k.date > i20) {
                                    }
                                    if (lo7.y(k47Var2)) {
                                        lo7Var.K--;
                                    }
                                    z = k47Var2.J;
                                    TLRPC.Message message3 = k47Var2.k;
                                    if (z) {
                                        j = k47.B0(message3);
                                    } else {
                                        long j6 = message3.peer_id.channel_id;
                                        j = j6 != 0 ? -j6 : 0L;
                                    }
                                    sparseArray = (SparseArray) vh6Var7.f(j);
                                    if (sparseArray != null) {
                                        sparseArray.remove(k47Var2.e1());
                                        if (sparseArray.size() == 0) {
                                            vh6Var7.l(j);
                                        }
                                    }
                                    arrayList6.remove(i21);
                                    arrayList5.remove(k47Var2);
                                    arrayList7.add(k47Var2);
                                    i21--;
                                } else if (z6) {
                                    if (k47Var2.e1() != i19 && i19 >= 0) {
                                    }
                                    if (lo7.y(k47Var2)) {
                                    }
                                    z = k47Var2.J;
                                    TLRPC.Message message32 = k47Var2.k;
                                    if (z) {
                                    }
                                    sparseArray = (SparseArray) vh6Var7.f(j);
                                    if (sparseArray != null) {
                                    }
                                    arrayList6.remove(i21);
                                    arrayList5.remove(k47Var2);
                                    arrayList7.add(k47Var2);
                                    i21--;
                                } else {
                                    if (k47Var2.e1() > i19 && i19 >= 0) {
                                    }
                                    if (lo7.y(k47Var2)) {
                                    }
                                    z = k47Var2.J;
                                    TLRPC.Message message322 = k47Var2.k;
                                    if (z) {
                                    }
                                    sparseArray = (SparseArray) vh6Var7.f(j);
                                    if (sparseArray != null) {
                                    }
                                    arrayList6.remove(i21);
                                    arrayList5.remove(k47Var2);
                                    arrayList7.add(k47Var2);
                                    i21--;
                                }
                            }
                            i21++;
                        }
                    }
                }
                if (!arrayList7.isEmpty()) {
                    gm.c3(new bo7(lo7Var, arrayList7, (byte) 2));
                    break;
                }
                break;
        }
    }

    public /* synthetic */ bq6(lo7 lo7Var, LongSparseIntArray longSparseIntArray, ArrayList arrayList, long j, int i, int i2, boolean z) {
        this.h = lo7Var;
        this.n = longSparseIntArray;
        this.b = arrayList;
        this.c = j;
        this.d = i;
        this.e = i2;
        this.f = z;
    }
}
