package org.telegram.ui.Components;

import android.text.TextUtils;
import android.util.LongSparseArray;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class ey implements org.telegram.messenger.z10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ fy b;

    public /* synthetic */ ey(fy fyVar, int i7) {
        this.a = i7;
        this.b = fyVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:85:0x01c1, code lost:
    
        if (r7.charAt(r10) <= 57343) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01de, code lost:
    
        if (r7.charAt(r10) != 9794) goto L81;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v12, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r7v8, types: [java.lang.CharSequence] */
    @Override // org.telegram.messenger.z10
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Object obj) {
        int A1;
        int A12;
        int i7 = this.a;
        int i10 = 3;
        fy fyVar = this.b;
        switch (i7) {
            case 0:
                fyVar.a((Runnable) obj, true);
                break;
            case 1:
                Runnable runnable = (Runnable) obj;
                ArrayList arrayList = fyVar.s;
                LongSparseArray longSparseArray = fyVar.w;
                gy gyVar = fyVar.x;
                HashMap hashMap = org.telegram.messenger.si.b0(gyVar.R.d1).e0;
                HashSet hashSet = new HashSet();
                ArrayList arrayList2 = new ArrayList();
                for (ArrayList arrayList3 : hashMap.values()) {
                    int size = arrayList3.size();
                    int i11 = 0;
                    while (i11 < size) {
                        Object obj2 = arrayList3.get(i11);
                        i11++;
                        TLRPC.Document document = (TLRPC.Document) obj2;
                        if (!hashSet.contains(Long.valueOf(document.id)) && org.telegram.messenger.gj.X3(document)) {
                            hashSet.add(Long.valueOf(document.id));
                            arrayList2.add(document);
                            longSparseArray.put(document.id, document);
                        }
                    }
                }
                ArrayList arrayList4 = org.telegram.messenger.si.b0(gyVar.R.d1).t0[0];
                int size2 = arrayList4.size();
                int i12 = 0;
                while (i12 < size2) {
                    Object obj3 = arrayList4.get(i12);
                    i12++;
                    TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) obj3;
                    TLRPC.Document document2 = stickerSetCovered.cover;
                    if (document2 != null && !hashSet.contains(Long.valueOf(document2.id)) && org.telegram.messenger.gj.X3(stickerSetCovered.cover)) {
                        hashSet.add(Long.valueOf(stickerSetCovered.cover.id));
                        arrayList2.add(stickerSetCovered.cover);
                        TLRPC.Document document3 = stickerSetCovered.cover;
                        longSparseArray.put(document3.id, document3);
                    }
                    ArrayList<TLRPC.Document> arrayList5 = stickerSetCovered.covers;
                    if (arrayList5 != null) {
                        int size3 = arrayList5.size();
                        int i13 = 0;
                        while (i13 < size3) {
                            TLRPC.Document document4 = arrayList5.get(i13);
                            i13++;
                            TLRPC.Document document5 = document4;
                            Runnable runnable2 = runnable;
                            if (!hashSet.contains(Long.valueOf(document5.id)) && org.telegram.messenger.gj.X3(document5)) {
                                hashSet.add(Long.valueOf(document5.id));
                                arrayList2.add(document5);
                                longSparseArray.put(document5.id, document5);
                            }
                            runnable = runnable2;
                        }
                    }
                    runnable = runnable;
                }
                Runnable runnable3 = runnable;
                if (!arrayList2.isEmpty()) {
                    arrayList.addAll(arrayList2);
                    fyVar.f.put(arrayList, gyVar.O);
                    fyVar.h.add(arrayList);
                }
                runnable3.run();
                break;
            case 2:
                fyVar.a((Runnable) obj, false);
                break;
            case 3:
                org.telegram.messenger.si.b0(fyVar.x.R.d1).Y1(false, fyVar.a, new gh(6, fyVar, (Runnable) obj));
                break;
            case 4:
                Runnable runnable4 = (Runnable) obj;
                gy gyVar2 = fyVar.x;
                ArrayList arrayList6 = fyVar.s;
                if (fyVar.a.length() <= 14) {
                    HashMap hashMap2 = org.telegram.messenger.si.b0(gyVar2.R.d1).e0;
                    String str = fyVar.a;
                    int length = str.length();
                    int i14 = 0;
                    String str2 = str;
                    while (i14 < length) {
                        if (i14 < length - 1) {
                            if (str2.charAt(i14) == 55356) {
                                int i15 = i14 + 1;
                                if (str2.charAt(i15) >= 57339) {
                                    break;
                                }
                            }
                            if (str2.charAt(i14) == 8205) {
                                int i16 = i14 + 1;
                                if (str2.charAt(i16) != 9792) {
                                    break;
                                }
                                length -= 2;
                                str2 = TextUtils.concat(str2.subSequence(0, i14), str2.subSequence(i14 + 2, str2.length()));
                                i14--;
                                i14++;
                                str2 = str2;
                            }
                        }
                        if (str2.charAt(i14) == 65039) {
                            length--;
                            str2 = TextUtils.concat(str2.subSequence(0, i14), str2.subSequence(i14 + 1, str2.length()));
                            i14--;
                            i14++;
                            str2 = str2;
                        } else {
                            i14++;
                            str2 = str2;
                        }
                    }
                    ArrayList arrayList7 = hashMap2 != null ? (ArrayList) hashMap2.get(str2.toString()) : null;
                    if (arrayList7 != null && !arrayList7.isEmpty()) {
                        arrayList6.addAll(arrayList7);
                        int size4 = arrayList7.size();
                        for (int i17 = 0; i17 < size4; i17++) {
                            TLRPC.Document document6 = (TLRPC.Document) arrayList7.get(i17);
                            fyVar.w.put(document6.id, document6);
                        }
                        fyVar.f.put(arrayList6, gyVar2.O);
                        fyVar.h.add(arrayList6);
                    }
                }
                runnable4.run();
                break;
            case 5:
                Runnable runnable5 = (Runnable) obj;
                gy gyVar3 = fyVar.x;
                ly lyVar = gyVar3.R;
                int i18 = lyVar.d1;
                HashMap hashMap3 = org.telegram.messenger.si.b0(i18).e0;
                if (hashMap3 != null && !hashMap3.isEmpty() && fyVar.a.length() > 1) {
                    String[] G0 = org.telegram.messenger.g0.G0();
                    if (!Arrays.equals(lyVar.X0, G0)) {
                        org.telegram.messenger.si.b0(i18).M(G0, false);
                    }
                    lyVar.X0 = G0;
                    org.telegram.messenger.si.b0(i18).U(lyVar.X0, gyVar3.O, true, new km(fyVar, hashMap3, runnable5, i10), false);
                    break;
                } else {
                    runnable5.run();
                    break;
                }
            case 6:
                Runnable runnable6 = (Runnable) obj;
                HashMap hashMap4 = fyVar.d;
                HashMap hashMap5 = fyVar.e;
                ArrayList arrayList8 = fyVar.c;
                gy gyVar4 = fyVar.x;
                ArrayList s02 = org.telegram.messenger.si.b0(gyVar4.R.d1).s0(0);
                ly lyVar2 = gyVar4.R;
                int i19 = lyVar2.d1;
                int i20 = lyVar2.d1;
                org.telegram.messenger.np.s1(i19).w0(s02);
                int size5 = s02.size();
                for (int i21 = 0; i21 < size5; i21++) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) s02.get(i21);
                    int A13 = org.telegram.messenger.g0.A1(tL_messages_stickerSet.set.title, gyVar4.O);
                    if (A13 < 0) {
                        String str3 = tL_messages_stickerSet.set.short_name;
                        if (str3 != null && (A12 = org.telegram.messenger.g0.A1(str3, gyVar4.O)) >= 0 && (A12 == 0 || tL_messages_stickerSet.set.short_name.charAt(A12 - 1) == ' ')) {
                            arrayList8.add(tL_messages_stickerSet);
                            hashMap4.put(tL_messages_stickerSet, Boolean.TRUE);
                        }
                    } else if (A13 == 0 || tL_messages_stickerSet.set.title.charAt(A13 - 1) == ' ') {
                        arrayList8.add(tL_messages_stickerSet);
                        hashMap5.put(tL_messages_stickerSet, Integer.valueOf(A13));
                    }
                }
                ArrayList s03 = org.telegram.messenger.si.b0(i20).s0(3);
                org.telegram.messenger.np.s1(i20).w0(s03);
                int size6 = s03.size();
                for (int i22 = 0; i22 < size6; i22++) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) s03.get(i22);
                    int A14 = org.telegram.messenger.g0.A1(tL_messages_stickerSet2.set.title, gyVar4.O);
                    if (A14 < 0) {
                        String str4 = tL_messages_stickerSet2.set.short_name;
                        if (str4 != null && (A1 = org.telegram.messenger.g0.A1(str4, gyVar4.O)) >= 0 && (A1 == 0 || tL_messages_stickerSet2.set.short_name.charAt(A1 - 1) == ' ')) {
                            arrayList8.add(tL_messages_stickerSet2);
                            hashMap4.put(tL_messages_stickerSet2, Boolean.TRUE);
                        }
                    } else if (A14 == 0 || tL_messages_stickerSet2.set.title.charAt(A14 - 1) == ' ') {
                        arrayList8.add(tL_messages_stickerSet2);
                        hashMap5.put(tL_messages_stickerSet2, Integer.valueOf(A14));
                    }
                }
                runnable6.run();
                break;
            default:
                Runnable runnable7 = (Runnable) obj;
                gy gyVar5 = fyVar.x;
                if (org.telegram.messenger.j6.d(gyVar5.O)) {
                    TLRPC.TL_messages_getStickers tL_messages_getStickers = new TLRPC.TL_messages_getStickers();
                    tL_messages_getStickers.emoticon = fyVar.a;
                    tL_messages_getStickers.hash = 0L;
                    gyVar5.M = ConnectionsManager.getInstance(gyVar5.R.d1).sendRequest(tL_messages_getStickers, new bi.j6(fyVar, tL_messages_getStickers, runnable7, 15));
                    break;
                } else {
                    runnable7.run();
                    break;
                }
        }
    }
}
