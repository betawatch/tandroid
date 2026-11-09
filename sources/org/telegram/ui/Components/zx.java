package org.telegram.ui.Components;

import android.text.TextUtils;
import android.util.LongSparseArray;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class zx implements org.telegram.messenger.c20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ay b;

    public /* synthetic */ zx(ay ayVar, int i7) {
        this.a = i7;
        this.b = ayVar;
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
        ay ayVar = this.b;
        switch (i7) {
            case 0:
                ayVar.a((Runnable) obj, true);
                break;
            case 1:
                Runnable runnable = (Runnable) obj;
                ArrayList arrayList = ayVar.s;
                LongSparseArray longSparseArray = ayVar.w;
                cy cyVar = ayVar.x;
                HashMap hashMap = org.telegram.messenger.ui.b0(cyVar.Q.c1).d0;
                HashSet hashSet = new HashSet();
                ArrayList arrayList2 = new ArrayList();
                for (ArrayList arrayList3 : hashMap.values()) {
                    int size = arrayList3.size();
                    int i12 = 0;
                    while (i12 < size) {
                        Object obj2 = arrayList3.get(i12);
                        i12++;
                        TLRPC.Document document = (TLRPC.Document) obj2;
                        if (!hashSet.contains(Long.valueOf(document.id)) && org.telegram.messenger.ij.X3(document)) {
                            hashSet.add(Long.valueOf(document.id));
                            arrayList2.add(document);
                            longSparseArray.put(document.id, document);
                        }
                    }
                }
                ArrayList arrayList4 = org.telegram.messenger.ui.b0(cyVar.Q.c1).s0[0];
                int size2 = arrayList4.size();
                int i13 = 0;
                while (i13 < size2) {
                    Object obj3 = arrayList4.get(i13);
                    i13++;
                    TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) obj3;
                    TLRPC.Document document2 = stickerSetCovered.cover;
                    if (document2 != null && !hashSet.contains(Long.valueOf(document2.id)) && org.telegram.messenger.ij.X3(stickerSetCovered.cover)) {
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
                            cy cyVar2 = cyVar;
                            if (!hashSet.contains(Long.valueOf(document5.id)) && org.telegram.messenger.ij.X3(document5)) {
                                hashSet.add(Long.valueOf(document5.id));
                                arrayList2.add(document5);
                                longSparseArray.put(document5.id, document5);
                            }
                            cyVar = cyVar2;
                        }
                    }
                    cyVar = cyVar;
                    i11 = 0;
                }
                cy cyVar3 = cyVar;
                if (!arrayList2.isEmpty()) {
                    arrayList.addAll(arrayList2);
                    ayVar.f.put(arrayList, cyVar3.N);
                    ayVar.h.add(arrayList);
                }
                runnable.run();
                break;
            case 2:
                ayVar.a((Runnable) obj, false);
                break;
            case 3:
                org.telegram.messenger.ui.b0(ayVar.x.Q.c1).Y1(false, ayVar.a, new fx(1, ayVar, (Runnable) obj));
                break;
            case 4:
                Runnable runnable2 = (Runnable) obj;
                cy cyVar4 = ayVar.x;
                ArrayList arrayList6 = ayVar.s;
                if (ayVar.a.length() <= 14) {
                    HashMap hashMap2 = org.telegram.messenger.ui.b0(cyVar4.Q.c1).d0;
                    String str = ayVar.a;
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
                            ayVar.w.put(document6.id, document6);
                            i11++;
                        }
                        ayVar.f.put(arrayList6, cyVar4.N);
                        ayVar.h.add(arrayList6);
                    }
                }
                runnable2.run();
                break;
            case 5:
                Runnable runnable3 = (Runnable) obj;
                cy cyVar5 = ayVar.x;
                hy hyVar = cyVar5.Q;
                int i18 = hyVar.c1;
                HashMap hashMap3 = org.telegram.messenger.ui.b0(i18).d0;
                if (hashMap3 != null && !hashMap3.isEmpty() && ayVar.a.length() > 1) {
                    String[] G0 = org.telegram.messenger.g0.G0();
                    if (!Arrays.equals(hyVar.W0, G0)) {
                        org.telegram.messenger.ui.b0(i18).M(G0, false);
                    }
                    hyVar.W0 = G0;
                    org.telegram.messenger.ui.b0(i18).U(hyVar.W0, cyVar5.N, true, new hr(ayVar, hashMap3, runnable3, i10), false);
                    break;
                } else {
                    runnable3.run();
                    break;
                }
            case 6:
                Runnable runnable4 = (Runnable) obj;
                HashMap hashMap4 = ayVar.d;
                HashMap hashMap5 = ayVar.e;
                ArrayList arrayList8 = ayVar.c;
                cy cyVar6 = ayVar.x;
                ArrayList s02 = org.telegram.messenger.ui.b0(cyVar6.Q.c1).s0(0);
                hy hyVar2 = cyVar6.Q;
                int i19 = hyVar2.c1;
                int i20 = hyVar2.c1;
                org.telegram.messenger.qp.s1(i19).w0(s02);
                int size5 = s02.size();
                for (int i21 = 0; i21 < size5; i21++) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) s02.get(i21);
                    int A13 = org.telegram.messenger.g0.A1(tL_messages_stickerSet.set.title, cyVar6.N);
                    if (A13 < 0) {
                        String str3 = tL_messages_stickerSet.set.short_name;
                        if (str3 != null && (A12 = org.telegram.messenger.g0.A1(str3, cyVar6.N)) >= 0 && (A12 == 0 || tL_messages_stickerSet.set.short_name.charAt(A12 - 1) == ' ')) {
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
                    int A14 = org.telegram.messenger.g0.A1(tL_messages_stickerSet2.set.title, cyVar6.N);
                    if (A14 < 0) {
                        String str4 = tL_messages_stickerSet2.set.short_name;
                        if (str4 != null && (A1 = org.telegram.messenger.g0.A1(str4, cyVar6.N)) >= 0 && (A1 == 0 || tL_messages_stickerSet2.set.short_name.charAt(A1 - 1) == ' ')) {
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
                cy cyVar7 = ayVar.x;
                if (org.telegram.messenger.i6.d(cyVar7.N)) {
                    TLRPC.TL_messages_getStickers tL_messages_getStickers = new TLRPC.TL_messages_getStickers();
                    tL_messages_getStickers.emoticon = ayVar.a;
                    tL_messages_getStickers.hash = 0L;
                    cyVar7.L = ConnectionsManager.getInstance(cyVar7.Q.c1).sendRequest(tL_messages_getStickers, new bi.f2(ayVar, tL_messages_getStickers, runnable5, 14));
                    break;
                } else {
                    runnable5.run();
                    break;
                }
        }
    }
}
