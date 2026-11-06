package org.telegram.ui.Components;

import android.text.TextUtils;
import android.util.LongSparseArray;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final /* synthetic */ class yx implements org.telegram.messenger.c20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ zx b;

    public /* synthetic */ yx(zx zxVar, int i7) {
        this.a = i7;
        this.b = zxVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:85:0x01bc, code lost:
    
        if (r9.charAt(r12) <= 57343) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01d6, code lost:
    
        if (r9.charAt(r12) != 9794) goto L78;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v11, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r9v7, types: [java.lang.CharSequence] */
    @Override // org.telegram.messenger.c20
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Object obj) {
        int A1;
        int A12;
        int i7 = this.a;
        int i10 = 2;
        int i11 = 0;
        zx zxVar = this.b;
        switch (i7) {
            case 0:
                zxVar.a((Runnable) obj, true);
                break;
            case 1:
                Runnable runnable = (Runnable) obj;
                ArrayList arrayList = zxVar.s;
                LongSparseArray longSparseArray = zxVar.w;
                ay ayVar = zxVar.x;
                HashMap hashMap = org.telegram.messenger.ui.b0(ayVar.Q.c1).d0;
                HashSet hashSet = new HashSet();
                ArrayList arrayList2 = new ArrayList();
                for (ArrayList arrayList3 : hashMap.values()) {
                    int size = arrayList3.size();
                    int i12 = 0;
                    while (i12 < size) {
                        Object obj2 = arrayList3.get(i12);
                        i12++;
                        TLRPC.Document document = (TLRPC.Document) obj2;
                        if (!hashSet.contains(Long.valueOf(document.id)) && org.telegram.messenger.ij.Y3(document)) {
                            hashSet.add(Long.valueOf(document.id));
                            arrayList2.add(document);
                            longSparseArray.put(document.id, document);
                        }
                    }
                }
                ArrayList arrayList4 = org.telegram.messenger.ui.b0(ayVar.Q.c1).s0[0];
                int size2 = arrayList4.size();
                int i13 = 0;
                while (i13 < size2) {
                    Object obj3 = arrayList4.get(i13);
                    i13++;
                    TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) obj3;
                    TLRPC.Document document2 = stickerSetCovered.cover;
                    if (document2 != null && !hashSet.contains(Long.valueOf(document2.id)) && org.telegram.messenger.ij.Y3(stickerSetCovered.cover)) {
                        hashSet.add(Long.valueOf(stickerSetCovered.cover.id));
                        arrayList2.add(stickerSetCovered.cover);
                        TLRPC.Document document3 = stickerSetCovered.cover;
                        longSparseArray.put(document3.id, document3);
                    }
                    ArrayList<TLRPC.Document> arrayList5 = stickerSetCovered.covers;
                    if (arrayList5 != null) {
                        int size3 = arrayList5.size();
                        int i14 = i11;
                        while (i14 < size3) {
                            TLRPC.Document document4 = arrayList5.get(i14);
                            i14++;
                            TLRPC.Document document5 = document4;
                            ay ayVar2 = ayVar;
                            if (!hashSet.contains(Long.valueOf(document5.id)) && org.telegram.messenger.ij.Y3(document5)) {
                                hashSet.add(Long.valueOf(document5.id));
                                arrayList2.add(document5);
                                longSparseArray.put(document5.id, document5);
                            }
                            ayVar = ayVar2;
                        }
                    }
                    ayVar = ayVar;
                    i11 = 0;
                }
                ay ayVar3 = ayVar;
                if (!arrayList2.isEmpty()) {
                    arrayList.addAll(arrayList2);
                    zxVar.f.put(arrayList, ayVar3.N);
                    zxVar.h.add(arrayList);
                }
                runnable.run();
                break;
            case 2:
                zxVar.a((Runnable) obj, false);
                break;
            case 3:
                org.telegram.messenger.ui.b0(zxVar.x.Q.c1).Y1(false, zxVar.a, new ex(1, zxVar, (Runnable) obj));
                break;
            case 4:
                Runnable runnable2 = (Runnable) obj;
                ay ayVar4 = zxVar.x;
                ArrayList arrayList6 = zxVar.s;
                if (zxVar.a.length() <= 14) {
                    HashMap hashMap2 = org.telegram.messenger.ui.b0(ayVar4.Q.c1).d0;
                    String str = zxVar.a;
                    int length = str.length();
                    int i15 = 0;
                    String str2 = str;
                    while (i15 < length) {
                        if (i15 < length - 1) {
                            if (str2.charAt(i15) == 55356) {
                                int i16 = i15 + 1;
                                if (str2.charAt(i16) >= 57339) {
                                    break;
                                }
                            }
                            if (str2.charAt(i15) == 8205) {
                                int i17 = i15 + 1;
                                if (str2.charAt(i17) != 9792) {
                                    break;
                                }
                                length -= 2;
                                str2 = TextUtils.concat(str2.subSequence(0, i15), str2.subSequence(i15 + 2, str2.length()));
                                i15--;
                                i15++;
                                str2 = str2;
                            }
                        }
                        if (str2.charAt(i15) == 65039) {
                            length--;
                            str2 = TextUtils.concat(str2.subSequence(0, i15), str2.subSequence(i15 + 1, str2.length()));
                            i15--;
                            i15++;
                            str2 = str2;
                        } else {
                            i15++;
                            str2 = str2;
                        }
                    }
                    ArrayList arrayList7 = hashMap2 != null ? (ArrayList) hashMap2.get(str2.toString()) : null;
                    if (arrayList7 != null && !arrayList7.isEmpty()) {
                        arrayList6.addAll(arrayList7);
                        int size4 = arrayList7.size();
                        while (i11 < size4) {
                            TLRPC.Document document6 = (TLRPC.Document) arrayList7.get(i11);
                            zxVar.w.put(document6.id, document6);
                            i11++;
                        }
                        zxVar.f.put(arrayList6, ayVar4.N);
                        zxVar.h.add(arrayList6);
                    }
                }
                runnable2.run();
                break;
            case 5:
                Runnable runnable3 = (Runnable) obj;
                ay ayVar5 = zxVar.x;
                gy gyVar = ayVar5.Q;
                int i18 = gyVar.c1;
                HashMap hashMap3 = org.telegram.messenger.ui.b0(i18).d0;
                if (hashMap3 != null && !hashMap3.isEmpty() && zxVar.a.length() > 1) {
                    String[] G0 = org.telegram.messenger.g0.G0();
                    if (!Arrays.equals(gyVar.W0, G0)) {
                        org.telegram.messenger.ui.b0(i18).M(G0, false);
                    }
                    gyVar.W0 = G0;
                    org.telegram.messenger.ui.b0(i18).U(gyVar.W0, ayVar5.N, true, new hr(zxVar, hashMap3, runnable3, i10), false);
                    break;
                } else {
                    runnable3.run();
                    break;
                }
            case 6:
                Runnable runnable4 = (Runnable) obj;
                HashMap hashMap4 = zxVar.d;
                HashMap hashMap5 = zxVar.e;
                ArrayList arrayList8 = zxVar.c;
                ay ayVar6 = zxVar.x;
                ArrayList s02 = org.telegram.messenger.ui.b0(ayVar6.Q.c1).s0(0);
                gy gyVar2 = ayVar6.Q;
                int i19 = gyVar2.c1;
                int i20 = gyVar2.c1;
                org.telegram.messenger.qp.s1(i19).w0(s02);
                int size5 = s02.size();
                for (int i21 = 0; i21 < size5; i21++) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) s02.get(i21);
                    int A13 = org.telegram.messenger.g0.A1(tL_messages_stickerSet.set.title, ayVar6.N);
                    if (A13 < 0) {
                        String str3 = tL_messages_stickerSet.set.short_name;
                        if (str3 != null && (A12 = org.telegram.messenger.g0.A1(str3, ayVar6.N)) >= 0 && (A12 == 0 || tL_messages_stickerSet.set.short_name.charAt(A12 - 1) == ' ')) {
                            arrayList8.add(tL_messages_stickerSet);
                            hashMap4.put(tL_messages_stickerSet, Boolean.TRUE);
                        }
                    } else if (A13 == 0 || tL_messages_stickerSet.set.title.charAt(A13 - 1) == ' ') {
                        arrayList8.add(tL_messages_stickerSet);
                        hashMap5.put(tL_messages_stickerSet, Integer.valueOf(A13));
                    }
                }
                ArrayList s03 = org.telegram.messenger.ui.b0(i20).s0(3);
                org.telegram.messenger.qp.s1(i20).w0(s03);
                int size6 = s03.size();
                while (i11 < size6) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) s03.get(i11);
                    int A14 = org.telegram.messenger.g0.A1(tL_messages_stickerSet2.set.title, ayVar6.N);
                    if (A14 < 0) {
                        String str4 = tL_messages_stickerSet2.set.short_name;
                        if (str4 != null && (A1 = org.telegram.messenger.g0.A1(str4, ayVar6.N)) >= 0 && (A1 == 0 || tL_messages_stickerSet2.set.short_name.charAt(A1 - 1) == ' ')) {
                            arrayList8.add(tL_messages_stickerSet2);
                            hashMap4.put(tL_messages_stickerSet2, Boolean.TRUE);
                        }
                    } else if (A14 == 0 || tL_messages_stickerSet2.set.title.charAt(A14 - 1) == ' ') {
                        arrayList8.add(tL_messages_stickerSet2);
                        hashMap5.put(tL_messages_stickerSet2, Integer.valueOf(A14));
                    }
                    i11++;
                }
                runnable4.run();
                break;
            default:
                Runnable runnable5 = (Runnable) obj;
                ay ayVar7 = zxVar.x;
                if (org.telegram.messenger.i6.d(ayVar7.N)) {
                    TLRPC.TL_messages_getStickers tL_messages_getStickers = new TLRPC.TL_messages_getStickers();
                    tL_messages_getStickers.emoticon = zxVar.a;
                    tL_messages_getStickers.hash = 0L;
                    ayVar7.L = ConnectionsManager.getInstance(ayVar7.Q.c1).sendRequest(tL_messages_getStickers, new bi.f2(zxVar, tL_messages_getStickers, runnable5, 14));
                    break;
                } else {
                    runnable5.run();
                    break;
                }
        }
    }
}
