package org.telegram.ui.Components;

import android.text.TextUtils;
import android.util.LongSparseArray;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class oy implements org.telegram.messenger.q20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ py b;

    public /* synthetic */ oy(py pyVar, int i10) {
        this.a = i10;
        this.b = pyVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:85:0x01bf, code lost:
    
        if (r8.charAt(r11) <= 57343) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01d9, code lost:
    
        if (r8.charAt(r11) != 9794) goto L78;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v11, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r8v7, types: [java.lang.CharSequence] */
    @Override // org.telegram.messenger.q20
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Object obj) {
        int A1;
        int A12;
        int i10 = this.a;
        int i11 = 0;
        py pyVar = this.b;
        switch (i10) {
            case 0:
                pyVar.a((Runnable) obj, true);
                break;
            case 1:
                Runnable runnable = (Runnable) obj;
                ArrayList arrayList = pyVar.s;
                LongSparseArray longSparseArray = pyVar.w;
                qy qyVar = pyVar.x;
                HashMap hashMap = org.telegram.messenger.ui.b0(qyVar.Q.c1).d0;
                HashSet hashSet = new HashSet();
                ArrayList arrayList2 = new ArrayList();
                for (ArrayList arrayList3 : hashMap.values()) {
                    int size = arrayList3.size();
                    int i12 = 0;
                    while (i12 < size) {
                        Object obj2 = arrayList3.get(i12);
                        i12++;
                        TLRPC.Document document = (TLRPC.Document) obj2;
                        if (!hashSet.contains(Long.valueOf(document.id)) && org.telegram.messenger.jj.X3(document)) {
                            hashSet.add(Long.valueOf(document.id));
                            arrayList2.add(document);
                            longSparseArray.put(document.id, document);
                        }
                    }
                }
                ArrayList arrayList4 = org.telegram.messenger.ui.b0(qyVar.Q.c1).s0[0];
                int size2 = arrayList4.size();
                int i13 = 0;
                while (i13 < size2) {
                    Object obj3 = arrayList4.get(i13);
                    i13++;
                    TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) obj3;
                    TLRPC.Document document2 = stickerSetCovered.cover;
                    if (document2 != null && !hashSet.contains(Long.valueOf(document2.id)) && org.telegram.messenger.jj.X3(stickerSetCovered.cover)) {
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
                            py pyVar2 = pyVar;
                            if (!hashSet.contains(Long.valueOf(document5.id)) && org.telegram.messenger.jj.X3(document5)) {
                                hashSet.add(Long.valueOf(document5.id));
                                arrayList2.add(document5);
                                longSparseArray.put(document5.id, document5);
                            }
                            pyVar = pyVar2;
                        }
                    }
                    pyVar = pyVar;
                    i11 = 0;
                }
                py pyVar3 = pyVar;
                if (!arrayList2.isEmpty()) {
                    arrayList.addAll(arrayList2);
                    pyVar3.f.put(arrayList, qyVar.N);
                    pyVar3.h.add(arrayList);
                }
                runnable.run();
                break;
            case 2:
                pyVar.a((Runnable) obj, false);
                break;
            case 3:
                org.telegram.messenger.ui.b0(pyVar.x.Q.c1).Y1(false, pyVar.a, new vg(9, pyVar, (Runnable) obj));
                break;
            case 4:
                Runnable runnable2 = (Runnable) obj;
                qy qyVar2 = pyVar.x;
                ArrayList arrayList6 = pyVar.s;
                if (pyVar.a.length() <= 14) {
                    HashMap hashMap2 = org.telegram.messenger.ui.b0(qyVar2.Q.c1).d0;
                    String str = pyVar.a;
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
                            pyVar.w.put(document6.id, document6);
                            i11++;
                        }
                        pyVar.f.put(arrayList6, qyVar2.N);
                        pyVar.h.add(arrayList6);
                    }
                }
                runnable2.run();
                break;
            case 5:
                Runnable runnable3 = (Runnable) obj;
                qy qyVar3 = pyVar.x;
                vy vyVar = qyVar3.Q;
                int i18 = vyVar.c1;
                HashMap hashMap3 = org.telegram.messenger.ui.b0(i18).d0;
                if (hashMap3 != null && !hashMap3.isEmpty() && pyVar.a.length() > 1) {
                    String[] G0 = org.telegram.messenger.i0.G0();
                    if (!Arrays.equals(vyVar.W0, G0)) {
                        org.telegram.messenger.ui.b0(i18).M(G0, false);
                    }
                    vyVar.W0 = G0;
                    org.telegram.messenger.ui.b0(i18).U(vyVar.W0, qyVar3.N, true, new androidx.car.app.utils.a(pyVar, hashMap3, runnable3, 24), false);
                    break;
                } else {
                    runnable3.run();
                    break;
                }
                break;
            case 6:
                Runnable runnable4 = (Runnable) obj;
                HashMap hashMap4 = pyVar.d;
                HashMap hashMap5 = pyVar.e;
                ArrayList arrayList8 = pyVar.c;
                qy qyVar4 = pyVar.x;
                ArrayList s02 = org.telegram.messenger.ui.b0(qyVar4.Q.c1).s0(0);
                vy vyVar2 = qyVar4.Q;
                int i19 = vyVar2.c1;
                int i20 = vyVar2.c1;
                org.telegram.messenger.vp.r1(i19).w0(s02);
                int size5 = s02.size();
                for (int i21 = 0; i21 < size5; i21++) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) s02.get(i21);
                    int A13 = org.telegram.messenger.i0.A1(tL_messages_stickerSet.set.title, qyVar4.N);
                    if (A13 < 0) {
                        String str3 = tL_messages_stickerSet.set.short_name;
                        if (str3 != null && (A12 = org.telegram.messenger.i0.A1(str3, qyVar4.N)) >= 0 && (A12 == 0 || tL_messages_stickerSet.set.short_name.charAt(A12 - 1) == ' ')) {
                            arrayList8.add(tL_messages_stickerSet);
                            hashMap4.put(tL_messages_stickerSet, Boolean.TRUE);
                        }
                    } else if (A13 == 0 || tL_messages_stickerSet.set.title.charAt(A13 - 1) == ' ') {
                        arrayList8.add(tL_messages_stickerSet);
                        hashMap5.put(tL_messages_stickerSet, Integer.valueOf(A13));
                    }
                }
                ArrayList s03 = org.telegram.messenger.ui.b0(i20).s0(3);
                org.telegram.messenger.vp.r1(i20).w0(s03);
                int size6 = s03.size();
                while (i11 < size6) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) s03.get(i11);
                    int A14 = org.telegram.messenger.i0.A1(tL_messages_stickerSet2.set.title, qyVar4.N);
                    if (A14 < 0) {
                        String str4 = tL_messages_stickerSet2.set.short_name;
                        if (str4 != null && (A1 = org.telegram.messenger.i0.A1(str4, qyVar4.N)) >= 0 && (A1 == 0 || tL_messages_stickerSet2.set.short_name.charAt(A1 - 1) == ' ')) {
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
                qy qyVar5 = pyVar.x;
                if (org.telegram.messenger.k6.d(qyVar5.N)) {
                    TLRPC.TL_messages_getStickers tL_messages_getStickers = new TLRPC.TL_messages_getStickers();
                    tL_messages_getStickers.emoticon = pyVar.a;
                    tL_messages_getStickers.hash = 0L;
                    qyVar5.L = ConnectionsManager.getInstance(qyVar5.Q.c1).sendRequest(tL_messages_getStickers, new ag.p0(pyVar, tL_messages_getStickers, runnable5, 10));
                    break;
                } else {
                    runnable5.run();
                    break;
                }
        }
    }
}
