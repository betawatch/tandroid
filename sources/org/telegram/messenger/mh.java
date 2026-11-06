package org.telegram.messenger;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final /* synthetic */ class mh implements Runnable {
    public final /* synthetic */ int a = 2;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object n;

    public /* synthetic */ mh(cf cfVar, boolean z9, TLRPC.PhotoSize photoSize, ij ijVar, TLRPC.Photo photo, boolean z10, TLRPC.Document document) {
        this.d = cfVar;
        this.b = z9;
        this.e = photoSize;
        this.f = ijVar;
        this.h = photo;
        this.c = z10;
        this.n = document;
    }

    /* JADX WARN: Removed duplicated region for block: B:122:0x0309 A[LOOP:2: B:66:0x01ad->B:122:0x0309, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0316 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x03f6  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x042b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x019a A[LOOP:1: B:52:0x0133->B:59:0x019a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01a1 A[SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        String str;
        int i7;
        int i10;
        Runnable runnable;
        ui uiVar;
        String str2;
        ui uiVar2;
        ArrayList arrayList;
        int i11;
        int i12;
        TLRPC.StickerSetCovered stickerSetCovered;
        TLRPC.TL_documentAttributeCustomEmoji tL_documentAttributeCustomEmoji;
        TLRPC.StickerSet stickerSet;
        String str3;
        int i13;
        int i14;
        TLRPC.TL_documentAttributeCustomEmoji tL_documentAttributeCustomEmoji2;
        TLRPC.StickerSet stickerSet2;
        String str4;
        Runnable runnable2;
        String str5;
        int i15;
        TLRPC.Document document;
        int i16;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        int i17 = this.a;
        Object obj = this.n;
        boolean z9 = this.c;
        Object obj2 = this.h;
        Object obj3 = this.f;
        Object obj4 = this.e;
        boolean z10 = this.b;
        Object obj5 = this.d;
        int i18 = 0;
        switch (i17) {
            case 0:
                ui uiVar3 = (ui) obj5;
                Integer num = (Integer) obj4;
                ArrayList arrayList2 = (ArrayList) obj3;
                ArrayList[] arrayListArr = (ArrayList[]) obj2;
                Runnable runnable3 = (Runnable) obj;
                ArrayList arrayList3 = uiVar3.s0[1];
                ArrayList arrayList4 = new ArrayList();
                HashSet hashSet = new HashSet();
                ArrayList arrayList5 = new ArrayList();
                int intValue = num == null ? arrayList2.size() > 5 ? 1 : arrayList2.size() > 2 ? 2 : 3 : num.intValue();
                int min = num == null ? Math.min(15, arrayList2.size()) : arrayList2.size();
                boolean z11 = p10.i(uiVar3.currentAccount).q() || z10;
                if (z9) {
                    str = p10.i(uiVar3.currentAccount).e0;
                    if (arrayListArr[0] != null) {
                        if (str != null) {
                            tL_messages_stickerSet = ui.b0(uiVar3.currentAccount).p0(str);
                            if (tL_messages_stickerSet == null) {
                                tL_messages_stickerSet = ui.b0(uiVar3.currentAccount).n0(str);
                            }
                        } else {
                            tL_messages_stickerSet = null;
                        }
                        if (tL_messages_stickerSet != null) {
                            arrayListArr[0].add(tL_messages_stickerSet);
                        }
                    }
                } else {
                    str = null;
                }
                int i19 = 0;
                while (i19 < min) {
                    String str6 = ((qi) arrayList2.get(i19)).a;
                    if (TextUtils.isEmpty(str6)) {
                        arrayList = arrayList3;
                        i10 = min;
                        runnable = runnable3;
                        uiVar2 = uiVar3;
                        i7 = i18;
                    } else {
                        arrayList5.clear();
                        i7 = i18;
                        String str7 = "animated_";
                        if (i6.i != null) {
                            int i20 = i7;
                            while (true) {
                                ArrayList arrayList6 = i6.i;
                                i10 = min;
                                if (i20 < arrayList6.size()) {
                                    if (((String) arrayList6.get(i20)).startsWith("animated_")) {
                                        try {
                                            i16 = i20;
                                            try {
                                                TLRPC.Document e10 = org.telegram.ui.Components.i5.e(uiVar3.currentAccount, Long.parseLong(((String) arrayList6.get(i20)).substring(9)));
                                                String V = ij.V(e10, null, null);
                                                if (e10 != null && V != null && V.contains(str6) && ((z11 || ij.n3(e10)) && !hashSet.contains(Long.valueOf(e10.id)))) {
                                                    hashSet.add(Long.valueOf(e10.id));
                                                    arrayList5.add(e10);
                                                }
                                            } catch (Exception unused) {
                                            }
                                        } catch (Exception unused2) {
                                        }
                                        if (arrayList5.size() >= intValue) {
                                            i20 = i16 + 1;
                                            min = i10;
                                        }
                                    }
                                    i16 = i20;
                                    if (arrayList5.size() >= intValue) {
                                    }
                                }
                            }
                        } else {
                            i10 = min;
                        }
                        if (arrayList5.size() < intValue && arrayListArr[i7] != null) {
                            int i21 = i7;
                            while (i21 < arrayListArr[i7].size()) {
                                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) arrayListArr[i7].get(i21);
                                if (tL_messages_stickerSet2 == null || tL_messages_stickerSet2.packs == null) {
                                    i13 = i21;
                                    runnable = runnable3;
                                    if (tL_messages_stickerSet2 != null && tL_messages_stickerSet2.documents != null) {
                                        int i22 = i7;
                                        while (i22 < tL_messages_stickerSet2.documents.size()) {
                                            TLRPC.Document document2 = tL_messages_stickerSet2.documents.get(i22);
                                            if (document2 == null || document2.attributes == null || arrayList5.contains(document2)) {
                                                i14 = i22;
                                            } else {
                                                i14 = i22;
                                                int i23 = i7;
                                                while (true) {
                                                    if (i23 < document2.attributes.size()) {
                                                        TLRPC.DocumentAttribute documentAttribute = document2.attributes.get(i23);
                                                        int i24 = i23;
                                                        if (documentAttribute instanceof TLRPC.TL_documentAttributeCustomEmoji) {
                                                            tL_documentAttributeCustomEmoji2 = (TLRPC.TL_documentAttributeCustomEmoji) documentAttribute;
                                                        } else {
                                                            i23 = i24 + 1;
                                                        }
                                                    } else {
                                                        tL_documentAttributeCustomEmoji2 = null;
                                                    }
                                                }
                                                if (tL_documentAttributeCustomEmoji2 != null && !TextUtils.isEmpty(tL_documentAttributeCustomEmoji2.alt) && tL_documentAttributeCustomEmoji2.alt.contains(str6) && (z11 || tL_documentAttributeCustomEmoji2.free || ((stickerSet2 = tL_messages_stickerSet2.set) != null && (str4 = stickerSet2.short_name) != null && str4.equals(str)))) {
                                                    uiVar = uiVar3;
                                                    str2 = str7;
                                                    if (hashSet.contains(Long.valueOf(document2.id))) {
                                                        continue;
                                                    } else {
                                                        hashSet.add(Long.valueOf(document2.id));
                                                        arrayList5.add(document2);
                                                        if (arrayList5.size() >= intValue) {
                                                            if (arrayList5.size() < intValue) {
                                                                if (arrayList5.size() < intValue && arrayList3 != null) {
                                                                    i11 = i7;
                                                                    while (i11 < arrayList3.size()) {
                                                                        TLRPC.StickerSetCovered stickerSetCovered2 = (TLRPC.StickerSetCovered) arrayList3.get(i11);
                                                                        if (stickerSetCovered2 != null) {
                                                                            ArrayList<TLRPC.Document> arrayList7 = stickerSetCovered2 instanceof TLRPC.TL_stickerSetFullCovered ? ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered2).documents : stickerSetCovered2.covers;
                                                                            if (arrayList7 != null) {
                                                                                uiVar2 = uiVar;
                                                                                int i25 = i7;
                                                                                while (true) {
                                                                                    if (i25 < arrayList7.size()) {
                                                                                        TLRPC.Document document3 = arrayList7.get(i25);
                                                                                        arrayList = arrayList3;
                                                                                        if (document3 == null || document3.attributes == null || arrayList5.contains(document3)) {
                                                                                            i12 = i11;
                                                                                        } else {
                                                                                            i12 = i11;
                                                                                            int i26 = i7;
                                                                                            while (true) {
                                                                                                if (i26 < document3.attributes.size()) {
                                                                                                    TLRPC.DocumentAttribute documentAttribute2 = document3.attributes.get(i26);
                                                                                                    int i27 = i26;
                                                                                                    if (documentAttribute2 instanceof TLRPC.TL_documentAttributeCustomEmoji) {
                                                                                                        tL_documentAttributeCustomEmoji = (TLRPC.TL_documentAttributeCustomEmoji) documentAttribute2;
                                                                                                    } else {
                                                                                                        i26 = i27 + 1;
                                                                                                    }
                                                                                                } else {
                                                                                                    tL_documentAttributeCustomEmoji = null;
                                                                                                }
                                                                                            }
                                                                                            if (tL_documentAttributeCustomEmoji != null && !TextUtils.isEmpty(tL_documentAttributeCustomEmoji.alt) && tL_documentAttributeCustomEmoji.alt.contains(str6) && (z11 || tL_documentAttributeCustomEmoji.free || ((stickerSet = stickerSetCovered2.set) != null && (str3 = stickerSet.short_name) != null && str3.equals(str)))) {
                                                                                                stickerSetCovered = stickerSetCovered2;
                                                                                                if (hashSet.contains(Long.valueOf(document3.id))) {
                                                                                                    continue;
                                                                                                } else {
                                                                                                    hashSet.add(Long.valueOf(document3.id));
                                                                                                    arrayList5.add(document3);
                                                                                                    if (arrayList5.size() >= intValue) {
                                                                                                    }
                                                                                                }
                                                                                                i25++;
                                                                                                stickerSetCovered2 = stickerSetCovered;
                                                                                                arrayList3 = arrayList;
                                                                                                i11 = i12;
                                                                                            }
                                                                                        }
                                                                                        stickerSetCovered = stickerSetCovered2;
                                                                                        i25++;
                                                                                        stickerSetCovered2 = stickerSetCovered;
                                                                                        arrayList3 = arrayList;
                                                                                        i11 = i12;
                                                                                    } else {
                                                                                        arrayList = arrayList3;
                                                                                        i12 = i11;
                                                                                    }
                                                                                }
                                                                                if (arrayList5.size() < intValue) {
                                                                                    i11 = i12 + 1;
                                                                                    uiVar = uiVar2;
                                                                                    arrayList3 = arrayList;
                                                                                } else if (!arrayList5.isEmpty()) {
                                                                                    String str8 = ((qi) arrayList2.get(i19)).b;
                                                                                    for (int i28 = i7; i28 < arrayList5.size(); i28++) {
                                                                                        TLRPC.Document document4 = (TLRPC.Document) arrayList5.get(i28);
                                                                                        if (document4 != null) {
                                                                                            qi qiVar = new qi();
                                                                                            qiVar.a = str2 + document4.id;
                                                                                            qiVar.b = str8;
                                                                                            arrayList4.add(qiVar);
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                        uiVar2 = uiVar;
                                                                        arrayList = arrayList3;
                                                                        i12 = i11;
                                                                        i11 = i12 + 1;
                                                                        uiVar = uiVar2;
                                                                        arrayList3 = arrayList;
                                                                    }
                                                                }
                                                                uiVar2 = uiVar;
                                                                arrayList = arrayList3;
                                                                if (!arrayList5.isEmpty()) {
                                                                }
                                                            } else {
                                                                uiVar3 = uiVar;
                                                                i21 = i13 + 1;
                                                                str7 = str2;
                                                                runnable3 = runnable;
                                                            }
                                                        }
                                                    }
                                                    uiVar3 = uiVar;
                                                    i22 = i14 + 1;
                                                    str7 = str2;
                                                }
                                            }
                                            uiVar = uiVar3;
                                            str2 = str7;
                                            uiVar3 = uiVar;
                                            i22 = i14 + 1;
                                            str7 = str2;
                                        }
                                    }
                                } else {
                                    i13 = i21;
                                    int i29 = i7;
                                    while (i29 < tL_messages_stickerSet2.packs.size()) {
                                        TLRPC.TL_stickerPack tL_stickerPack = tL_messages_stickerSet2.packs.get(i29);
                                        int i30 = i29;
                                        if (tL_stickerPack == null || (str5 = tL_stickerPack.emoticon) == null || !str5.contains(str6)) {
                                            runnable2 = runnable3;
                                        } else {
                                            runnable2 = runnable3;
                                            int i31 = i7;
                                            while (i31 < tL_stickerPack.documents.size()) {
                                                long longValue = tL_stickerPack.documents.get(i31).longValue();
                                                TLRPC.TL_stickerPack tL_stickerPack2 = tL_stickerPack;
                                                int i32 = i7;
                                                while (true) {
                                                    if (i32 < tL_messages_stickerSet2.documents.size()) {
                                                        document = tL_messages_stickerSet2.documents.get(i32);
                                                        i15 = i31;
                                                        int i33 = i32;
                                                        if (document == null || document.id != longValue) {
                                                            i32 = i33 + 1;
                                                            i31 = i15;
                                                        }
                                                    } else {
                                                        i15 = i31;
                                                        document = null;
                                                    }
                                                }
                                                if (document != null && document.attributes != null && !arrayList5.contains(document) && !hashSet.contains(Long.valueOf(document.id))) {
                                                    hashSet.add(Long.valueOf(document.id));
                                                    arrayList5.add(document);
                                                    if (arrayList5.size() >= intValue) {
                                                        break;
                                                    }
                                                }
                                                i31 = i15 + 1;
                                                tL_stickerPack = tL_stickerPack2;
                                            }
                                        }
                                        i29 = i30 + 1;
                                        runnable3 = runnable2;
                                    }
                                    runnable = runnable3;
                                }
                                uiVar = uiVar3;
                                str2 = str7;
                                if (arrayList5.size() < intValue) {
                                }
                            }
                        }
                        runnable = runnable3;
                        uiVar = uiVar3;
                        str2 = str7;
                        if (arrayList5.size() < intValue) {
                            i11 = i7;
                            while (i11 < arrayList3.size()) {
                            }
                        }
                        uiVar2 = uiVar;
                        arrayList = arrayList3;
                        if (!arrayList5.isEmpty()) {
                        }
                    }
                    i19++;
                    i18 = i7;
                    min = i10;
                    uiVar3 = uiVar2;
                    arrayList3 = arrayList;
                    runnable3 = runnable;
                }
                arrayList2.addAll(i18, arrayList4);
                runnable3.run();
                break;
            case 1:
                qp qpVar = (qp) obj5;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj3;
                org.telegram.ui.ActionBar.f2 f2Var = (org.telegram.ui.ActionBar.f2) obj2;
                TLObject tLObject = (TLObject) obj;
                if (((bp) obj4).a(tL_error)) {
                    org.telegram.ui.Components.v4.c0(qpVar.currentAccount, tL_error, f2Var, tLObject, Boolean.valueOf(z10 && !z9));
                    break;
                }
                break;
            default:
                cf cfVar = (cf) obj5;
                TLRPC.PhotoSize photoSize = (TLRPC.PhotoSize) obj4;
                ij ijVar = (ij) obj3;
                TLRPC.Photo photo = (TLRPC.Photo) obj2;
                TLRPC.Document document5 = (TLRPC.Document) obj;
                c cVar = cfVar.a;
                HashMap hashMap = cfVar.d;
                if (z10) {
                    hashMap.put(w7.r(null, photoSize), ijVar);
                    w7.G(cVar.a).V(hc.i(photoSize, photo), ijVar, "jpg", 3, 0);
                }
                if (z9) {
                    hashMap.put(w7.r(null, document5), ijVar);
                    w7.G(cVar.a).W(document5, ijVar, 3, 0);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ mh(ui uiVar, Integer num, ArrayList arrayList, boolean z9, boolean z10, ArrayList[] arrayListArr, Runnable runnable) {
        this.d = uiVar;
        this.e = num;
        this.f = arrayList;
        this.b = z9;
        this.c = z10;
        this.h = arrayListArr;
        this.n = runnable;
    }

    public /* synthetic */ mh(qp qpVar, bp bpVar, TLRPC.TL_error tL_error, org.telegram.ui.ActionBar.f2 f2Var, TLObject tLObject, boolean z9, boolean z10) {
        this.d = qpVar;
        this.e = bpVar;
        this.f = tL_error;
        this.h = f2Var;
        this.n = tLObject;
        this.b = z9;
        this.c = z10;
    }
}
