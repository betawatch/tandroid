package org.telegram.messenger;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class kh implements Runnable {
    public final /* synthetic */ int a = 2;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object n;

    public /* synthetic */ kh(cf cfVar, boolean z10, TLRPC.PhotoSize photoSize, jj jjVar, TLRPC.Photo photo, boolean z11, TLRPC.Document document) {
        this.d = cfVar;
        this.b = z10;
        this.e = photoSize;
        this.f = jjVar;
        this.h = photo;
        this.c = z11;
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
        int i10;
        int i11;
        Runnable runnable;
        ui uiVar;
        String str2;
        ui uiVar2;
        ArrayList arrayList;
        int i12;
        int i13;
        TLRPC.StickerSetCovered stickerSetCovered;
        TLRPC.TL_documentAttributeCustomEmoji tL_documentAttributeCustomEmoji;
        TLRPC.StickerSet stickerSet;
        String str3;
        int i14;
        int i15;
        TLRPC.TL_documentAttributeCustomEmoji tL_documentAttributeCustomEmoji2;
        TLRPC.StickerSet stickerSet2;
        String str4;
        Runnable runnable2;
        String str5;
        int i16;
        TLRPC.Document document;
        int i17;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        int i18 = this.a;
        Object obj = this.n;
        boolean z10 = this.c;
        Object obj2 = this.h;
        Object obj3 = this.f;
        Object obj4 = this.e;
        boolean z11 = this.b;
        Object obj5 = this.d;
        int i19 = 0;
        switch (i18) {
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
                boolean z12 = d20.i(uiVar3.currentAccount).q() || z11;
                if (z10) {
                    str = d20.i(uiVar3.currentAccount).e0;
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
                int i20 = 0;
                while (i20 < min) {
                    String str6 = ((qi) arrayList2.get(i20)).a;
                    if (TextUtils.isEmpty(str6)) {
                        arrayList = arrayList3;
                        i11 = min;
                        runnable = runnable3;
                        uiVar2 = uiVar3;
                        i10 = i19;
                    } else {
                        arrayList5.clear();
                        i10 = i19;
                        String str7 = "animated_";
                        if (k6.i != null) {
                            int i21 = i10;
                            while (true) {
                                ArrayList arrayList6 = k6.i;
                                i11 = min;
                                if (i21 < arrayList6.size()) {
                                    if (((String) arrayList6.get(i21)).startsWith("animated_")) {
                                        try {
                                            i17 = i21;
                                            try {
                                                TLRPC.Document e = org.telegram.ui.Components.f5.e(uiVar3.currentAccount, Long.parseLong(((String) arrayList6.get(i21)).substring(9)));
                                                String V = jj.V(e, null, null);
                                                if (e != null && V != null && V.contains(str6) && ((z12 || jj.m3(e)) && !hashSet.contains(Long.valueOf(e.id)))) {
                                                    hashSet.add(Long.valueOf(e.id));
                                                    arrayList5.add(e);
                                                }
                                            } catch (Exception unused) {
                                            }
                                        } catch (Exception unused2) {
                                        }
                                        if (arrayList5.size() >= intValue) {
                                            i21 = i17 + 1;
                                            min = i11;
                                        }
                                    }
                                    i17 = i21;
                                    if (arrayList5.size() >= intValue) {
                                    }
                                }
                            }
                        } else {
                            i11 = min;
                        }
                        if (arrayList5.size() < intValue && arrayListArr[i10] != null) {
                            int i22 = i10;
                            while (i22 < arrayListArr[i10].size()) {
                                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) arrayListArr[i10].get(i22);
                                if (tL_messages_stickerSet2 == null || tL_messages_stickerSet2.packs == null) {
                                    i14 = i22;
                                    runnable = runnable3;
                                    if (tL_messages_stickerSet2 != null && tL_messages_stickerSet2.documents != null) {
                                        int i23 = i10;
                                        while (i23 < tL_messages_stickerSet2.documents.size()) {
                                            TLRPC.Document document2 = tL_messages_stickerSet2.documents.get(i23);
                                            if (document2 == null || document2.attributes == null || arrayList5.contains(document2)) {
                                                i15 = i23;
                                            } else {
                                                i15 = i23;
                                                int i24 = i10;
                                                while (true) {
                                                    if (i24 < document2.attributes.size()) {
                                                        TLRPC.DocumentAttribute documentAttribute = document2.attributes.get(i24);
                                                        int i25 = i24;
                                                        if (documentAttribute instanceof TLRPC.TL_documentAttributeCustomEmoji) {
                                                            tL_documentAttributeCustomEmoji2 = (TLRPC.TL_documentAttributeCustomEmoji) documentAttribute;
                                                        } else {
                                                            i24 = i25 + 1;
                                                        }
                                                    } else {
                                                        tL_documentAttributeCustomEmoji2 = null;
                                                    }
                                                }
                                                if (tL_documentAttributeCustomEmoji2 != null && !TextUtils.isEmpty(tL_documentAttributeCustomEmoji2.alt) && tL_documentAttributeCustomEmoji2.alt.contains(str6) && (z12 || tL_documentAttributeCustomEmoji2.free || ((stickerSet2 = tL_messages_stickerSet2.set) != null && (str4 = stickerSet2.short_name) != null && str4.equals(str)))) {
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
                                                                    i12 = i10;
                                                                    while (i12 < arrayList3.size()) {
                                                                        TLRPC.StickerSetCovered stickerSetCovered2 = (TLRPC.StickerSetCovered) arrayList3.get(i12);
                                                                        if (stickerSetCovered2 != null) {
                                                                            ArrayList<TLRPC.Document> arrayList7 = stickerSetCovered2 instanceof TLRPC.TL_stickerSetFullCovered ? ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered2).documents : stickerSetCovered2.covers;
                                                                            if (arrayList7 != null) {
                                                                                uiVar2 = uiVar;
                                                                                int i26 = i10;
                                                                                while (true) {
                                                                                    if (i26 < arrayList7.size()) {
                                                                                        TLRPC.Document document3 = arrayList7.get(i26);
                                                                                        arrayList = arrayList3;
                                                                                        if (document3 == null || document3.attributes == null || arrayList5.contains(document3)) {
                                                                                            i13 = i12;
                                                                                        } else {
                                                                                            i13 = i12;
                                                                                            int i27 = i10;
                                                                                            while (true) {
                                                                                                if (i27 < document3.attributes.size()) {
                                                                                                    TLRPC.DocumentAttribute documentAttribute2 = document3.attributes.get(i27);
                                                                                                    int i28 = i27;
                                                                                                    if (documentAttribute2 instanceof TLRPC.TL_documentAttributeCustomEmoji) {
                                                                                                        tL_documentAttributeCustomEmoji = (TLRPC.TL_documentAttributeCustomEmoji) documentAttribute2;
                                                                                                    } else {
                                                                                                        i27 = i28 + 1;
                                                                                                    }
                                                                                                } else {
                                                                                                    tL_documentAttributeCustomEmoji = null;
                                                                                                }
                                                                                            }
                                                                                            if (tL_documentAttributeCustomEmoji != null && !TextUtils.isEmpty(tL_documentAttributeCustomEmoji.alt) && tL_documentAttributeCustomEmoji.alt.contains(str6) && (z12 || tL_documentAttributeCustomEmoji.free || ((stickerSet = stickerSetCovered2.set) != null && (str3 = stickerSet.short_name) != null && str3.equals(str)))) {
                                                                                                stickerSetCovered = stickerSetCovered2;
                                                                                                if (hashSet.contains(Long.valueOf(document3.id))) {
                                                                                                    continue;
                                                                                                } else {
                                                                                                    hashSet.add(Long.valueOf(document3.id));
                                                                                                    arrayList5.add(document3);
                                                                                                    if (arrayList5.size() >= intValue) {
                                                                                                    }
                                                                                                }
                                                                                                i26++;
                                                                                                stickerSetCovered2 = stickerSetCovered;
                                                                                                arrayList3 = arrayList;
                                                                                                i12 = i13;
                                                                                            }
                                                                                        }
                                                                                        stickerSetCovered = stickerSetCovered2;
                                                                                        i26++;
                                                                                        stickerSetCovered2 = stickerSetCovered;
                                                                                        arrayList3 = arrayList;
                                                                                        i12 = i13;
                                                                                    } else {
                                                                                        arrayList = arrayList3;
                                                                                        i13 = i12;
                                                                                    }
                                                                                }
                                                                                if (arrayList5.size() < intValue) {
                                                                                    i12 = i13 + 1;
                                                                                    uiVar = uiVar2;
                                                                                    arrayList3 = arrayList;
                                                                                } else if (!arrayList5.isEmpty()) {
                                                                                    String str8 = ((qi) arrayList2.get(i20)).b;
                                                                                    for (int i29 = i10; i29 < arrayList5.size(); i29++) {
                                                                                        TLRPC.Document document4 = (TLRPC.Document) arrayList5.get(i29);
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
                                                                        i13 = i12;
                                                                        i12 = i13 + 1;
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
                                                                i22 = i14 + 1;
                                                                str7 = str2;
                                                                runnable3 = runnable;
                                                            }
                                                        }
                                                    }
                                                    uiVar3 = uiVar;
                                                    i23 = i15 + 1;
                                                    str7 = str2;
                                                }
                                            }
                                            uiVar = uiVar3;
                                            str2 = str7;
                                            uiVar3 = uiVar;
                                            i23 = i15 + 1;
                                            str7 = str2;
                                        }
                                    }
                                } else {
                                    i14 = i22;
                                    int i30 = i10;
                                    while (i30 < tL_messages_stickerSet2.packs.size()) {
                                        TLRPC.TL_stickerPack tL_stickerPack = tL_messages_stickerSet2.packs.get(i30);
                                        int i31 = i30;
                                        if (tL_stickerPack == null || (str5 = tL_stickerPack.emoticon) == null || !str5.contains(str6)) {
                                            runnable2 = runnable3;
                                        } else {
                                            runnable2 = runnable3;
                                            int i32 = i10;
                                            while (i32 < tL_stickerPack.documents.size()) {
                                                long longValue = tL_stickerPack.documents.get(i32).longValue();
                                                TLRPC.TL_stickerPack tL_stickerPack2 = tL_stickerPack;
                                                int i33 = i10;
                                                while (true) {
                                                    if (i33 < tL_messages_stickerSet2.documents.size()) {
                                                        document = tL_messages_stickerSet2.documents.get(i33);
                                                        i16 = i32;
                                                        int i34 = i33;
                                                        if (document == null || document.id != longValue) {
                                                            i33 = i34 + 1;
                                                            i32 = i16;
                                                        }
                                                    } else {
                                                        i16 = i32;
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
                                                i32 = i16 + 1;
                                                tL_stickerPack = tL_stickerPack2;
                                            }
                                        }
                                        i30 = i31 + 1;
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
                            i12 = i10;
                            while (i12 < arrayList3.size()) {
                            }
                        }
                        uiVar2 = uiVar;
                        arrayList = arrayList3;
                        if (!arrayList5.isEmpty()) {
                        }
                    }
                    i20++;
                    i19 = i10;
                    min = i11;
                    uiVar3 = uiVar2;
                    arrayList3 = arrayList;
                    runnable3 = runnable;
                }
                arrayList2.addAll(i19, arrayList4);
                runnable3.run();
                break;
            case 1:
                vp vpVar = (vp) obj5;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj3;
                org.telegram.ui.ActionBar.k2 k2Var = (org.telegram.ui.ActionBar.k2) obj2;
                TLObject tLObject = (TLObject) obj;
                if (((gp) obj4).a(tL_error)) {
                    org.telegram.ui.Components.s4.e0(vpVar.currentAccount, tL_error, k2Var, tLObject, Boolean.valueOf(z11 && !z10));
                    break;
                }
                break;
            default:
                cf cfVar = (cf) obj5;
                TLRPC.PhotoSize photoSize = (TLRPC.PhotoSize) obj4;
                jj jjVar = (jj) obj3;
                TLRPC.Photo photo = (TLRPC.Photo) obj2;
                TLRPC.Document document5 = (TLRPC.Document) obj;
                c cVar = cfVar.a;
                HashMap hashMap = cfVar.d;
                if (z11) {
                    hashMap.put(b8.r(null, photoSize), jjVar);
                    b8.G(cVar.a).W(ic.i(photoSize, photo), jjVar, "jpg", 3, 0);
                }
                if (z10) {
                    hashMap.put(b8.r(null, document5), jjVar);
                    b8.G(cVar.a).X(document5, jjVar, 3, 0);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ kh(ui uiVar, Integer num, ArrayList arrayList, boolean z10, boolean z11, ArrayList[] arrayListArr, Runnable runnable) {
        this.d = uiVar;
        this.e = num;
        this.f = arrayList;
        this.b = z10;
        this.c = z11;
        this.h = arrayListArr;
        this.n = runnable;
    }

    public /* synthetic */ kh(vp vpVar, gp gpVar, TLRPC.TL_error tL_error, org.telegram.ui.ActionBar.k2 k2Var, TLObject tLObject, boolean z10, boolean z11) {
        this.d = vpVar;
        this.e = gpVar;
        this.f = tL_error;
        this.h = k2Var;
        this.n = tLObject;
        this.b = z10;
        this.c = z11;
    }
}
