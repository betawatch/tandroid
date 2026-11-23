package org.telegram.messenger;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
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

    public /* synthetic */ kh(af afVar, boolean z10, TLRPC.PhotoSize photoSize, fj fjVar, TLRPC.Photo photo, boolean z11, TLRPC.Document document) {
        this.d = afVar;
        this.b = z10;
        this.e = photoSize;
        this.f = fjVar;
        this.h = photo;
        this.c = z11;
        this.n = document;
    }

    /* JADX WARN: Removed duplicated region for block: B:185:0x0354  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0419 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:236:0x041f  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0411 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01bc A[LOOP:1: B:55:0x014b->B:63:0x01bc, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01cb A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01df  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        String str;
        int i7;
        Runnable runnable;
        ArrayList[] arrayListArr;
        String str2;
        ArrayList arrayList;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        TLRPC.StickerSetCovered stickerSetCovered;
        ArrayList<TLRPC.Document> arrayList2;
        TLRPC.TL_documentAttributeCustomEmoji tL_documentAttributeCustomEmoji;
        TLRPC.StickerSet stickerSet;
        String str3;
        int i15;
        int i16;
        int i17;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        TLRPC.TL_documentAttributeCustomEmoji tL_documentAttributeCustomEmoji2;
        String str4;
        String str5;
        String str6;
        int i18;
        TLRPC.Document document;
        int i19;
        TLRPC.Document e10;
        String V;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2;
        int i20 = this.a;
        Object obj = this.n;
        boolean z10 = this.c;
        Object obj2 = this.h;
        Object obj3 = this.f;
        Object obj4 = this.e;
        boolean z11 = this.b;
        Object obj5 = this.d;
        int i21 = 0;
        switch (i20) {
            case 0:
                ri riVar = (ri) obj5;
                Integer num = (Integer) obj4;
                ArrayList arrayList3 = (ArrayList) obj3;
                ArrayList[] arrayListArr2 = (ArrayList[]) obj2;
                Runnable runnable2 = (Runnable) obj;
                ArrayList arrayList4 = riVar.t0[1];
                ArrayList arrayList5 = new ArrayList();
                HashSet hashSet = new HashSet();
                ArrayList arrayList6 = new ArrayList();
                int intValue = num == null ? arrayList3.size() > 5 ? 1 : arrayList3.size() > 2 ? 2 : 3 : num.intValue();
                int min = num == null ? Math.min(15, arrayList3.size()) : arrayList3.size();
                boolean z12 = i10.i(riVar.currentAccount).q() || z11;
                if (z10) {
                    str = i10.i(riVar.currentAccount).f0;
                    if (arrayListArr2[0] != null) {
                        if (str != null) {
                            tL_messages_stickerSet2 = ri.d0(riVar.currentAccount).r0(str);
                            if (tL_messages_stickerSet2 == null) {
                                tL_messages_stickerSet2 = ri.d0(riVar.currentAccount).p0(str);
                            }
                        } else {
                            tL_messages_stickerSet2 = null;
                        }
                        if (tL_messages_stickerSet2 != null) {
                            arrayListArr2[0].add(tL_messages_stickerSet2);
                        }
                    }
                } else {
                    str = null;
                }
                int i22 = 0;
                while (i22 < min) {
                    int i23 = i21;
                    String replace = ((ni) arrayList3.get(i22)).a == null ? null : ((ni) arrayList3.get(i22)).a.replace("️", "");
                    if (TextUtils.isEmpty(replace)) {
                        arrayList = arrayList4;
                        i10 = intValue;
                        i7 = min;
                        runnable = runnable2;
                        arrayListArr = arrayListArr2;
                        str2 = str;
                    } else {
                        arrayList6.clear();
                        if (j6.i != null) {
                            i7 = min;
                            runnable = runnable2;
                            int i24 = i23;
                            while (true) {
                                ArrayList arrayList7 = j6.i;
                                arrayListArr = arrayListArr2;
                                if (i24 < arrayList7.size()) {
                                    if (((String) arrayList7.get(i24)).startsWith("animated_")) {
                                        try {
                                            int i25 = i24;
                                            try {
                                                i19 = i25;
                                                try {
                                                    e10 = org.telegram.ui.Components.o5.e(riVar.currentAccount, Long.parseLong(((String) arrayList7.get(i24)).substring(9)));
                                                    V = fj.V(e10, null, null);
                                                } catch (Exception unused) {
                                                }
                                            } catch (Exception unused2) {
                                                i19 = i25;
                                            }
                                        } catch (Exception unused3) {
                                        }
                                        if (e10 != null && V != null && V.replace("️", "").contains(replace) && (z12 || fj.m3(e10))) {
                                            str2 = str;
                                            try {
                                                if (!hashSet.contains(Long.valueOf(e10.id))) {
                                                    hashSet.add(Long.valueOf(e10.id));
                                                    arrayList6.add(e10);
                                                }
                                            } catch (Exception unused4) {
                                            }
                                            if (arrayList6.size() < intValue) {
                                                i24 = i19 + 1;
                                                str = str2;
                                                arrayListArr2 = arrayListArr;
                                            }
                                        }
                                        str2 = str;
                                        if (arrayList6.size() < intValue) {
                                        }
                                    }
                                    i19 = i24;
                                    str2 = str;
                                    if (arrayList6.size() < intValue) {
                                    }
                                }
                            }
                            if (arrayList6.size() < intValue && arrayListArr[i23] != null) {
                                for (i15 = i23; i15 < arrayListArr[i23].size(); i15 = i16 + 1) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = (TLRPC.TL_messages_stickerSet) arrayListArr[i23].get(i15);
                                    if (tL_messages_stickerSet3 == null || tL_messages_stickerSet3.packs == null) {
                                        i16 = i15;
                                        String str7 = str2;
                                        if (tL_messages_stickerSet3 != null && tL_messages_stickerSet3.documents != null) {
                                            int i26 = i23;
                                            while (i26 < tL_messages_stickerSet3.documents.size()) {
                                                TLRPC.Document document2 = tL_messages_stickerSet3.documents.get(i26);
                                                if (document2 == null || document2.attributes == null || arrayList6.contains(document2)) {
                                                    i17 = i26;
                                                } else {
                                                    i17 = i26;
                                                    int i27 = i23;
                                                    while (true) {
                                                        if (i27 < document2.attributes.size()) {
                                                            TLRPC.DocumentAttribute documentAttribute = document2.attributes.get(i27);
                                                            int i28 = i27;
                                                            if (documentAttribute instanceof TLRPC.TL_documentAttributeCustomEmoji) {
                                                                tL_documentAttributeCustomEmoji2 = (TLRPC.TL_documentAttributeCustomEmoji) documentAttribute;
                                                            } else {
                                                                i27 = i28 + 1;
                                                            }
                                                        } else {
                                                            tL_documentAttributeCustomEmoji2 = null;
                                                        }
                                                    }
                                                    if (tL_documentAttributeCustomEmoji2 != null && !TextUtils.isEmpty(tL_documentAttributeCustomEmoji2.alt) && tL_documentAttributeCustomEmoji2.alt.replace("️", "").contains(replace)) {
                                                        if (z12 || tL_documentAttributeCustomEmoji2.free) {
                                                            str2 = str7;
                                                            tL_messages_stickerSet = tL_messages_stickerSet3;
                                                        } else {
                                                            TLRPC.StickerSet stickerSet2 = tL_messages_stickerSet3.set;
                                                            if (stickerSet2 != null && (str4 = stickerSet2.short_name) != null) {
                                                                str2 = str7;
                                                                tL_messages_stickerSet = tL_messages_stickerSet3;
                                                                if (!str4.equals(str2)) {
                                                                    continue;
                                                                    i26 = i17 + 1;
                                                                    tL_messages_stickerSet3 = tL_messages_stickerSet;
                                                                    str7 = str2;
                                                                }
                                                            }
                                                        }
                                                        if (hashSet.contains(Long.valueOf(document2.id))) {
                                                            continue;
                                                        } else {
                                                            hashSet.add(Long.valueOf(document2.id));
                                                            arrayList6.add(document2);
                                                            if (arrayList6.size() >= intValue) {
                                                            }
                                                        }
                                                        i26 = i17 + 1;
                                                        tL_messages_stickerSet3 = tL_messages_stickerSet;
                                                        str7 = str2;
                                                    }
                                                }
                                                str2 = str7;
                                                tL_messages_stickerSet = tL_messages_stickerSet3;
                                                i26 = i17 + 1;
                                                tL_messages_stickerSet3 = tL_messages_stickerSet;
                                                str7 = str2;
                                            }
                                        }
                                        str2 = str7;
                                    } else {
                                        i16 = i15;
                                        int i29 = i23;
                                        while (i29 < tL_messages_stickerSet3.packs.size()) {
                                            TLRPC.TL_stickerPack tL_stickerPack = tL_messages_stickerSet3.packs.get(i29);
                                            int i30 = i29;
                                            if (tL_stickerPack == null || (str6 = tL_stickerPack.emoticon) == null || !str6.replace("️", "").contains(replace)) {
                                                str5 = str2;
                                            } else {
                                                str5 = str2;
                                                int i31 = i23;
                                                while (i31 < tL_stickerPack.documents.size()) {
                                                    long longValue = tL_stickerPack.documents.get(i31).longValue();
                                                    TLRPC.TL_stickerPack tL_stickerPack2 = tL_stickerPack;
                                                    int i32 = i23;
                                                    while (true) {
                                                        if (i32 < tL_messages_stickerSet3.documents.size()) {
                                                            document = tL_messages_stickerSet3.documents.get(i32);
                                                            i18 = i31;
                                                            int i33 = i32;
                                                            if (document == null || document.id != longValue) {
                                                                i32 = i33 + 1;
                                                                i31 = i18;
                                                            }
                                                        } else {
                                                            i18 = i31;
                                                            document = null;
                                                        }
                                                    }
                                                    if (document != null && document.attributes != null && !arrayList6.contains(document) && !hashSet.contains(Long.valueOf(document.id))) {
                                                        hashSet.add(Long.valueOf(document.id));
                                                        arrayList6.add(document);
                                                        if (arrayList6.size() >= intValue) {
                                                            break;
                                                        }
                                                    }
                                                    i31 = i18 + 1;
                                                    tL_stickerPack = tL_stickerPack2;
                                                }
                                            }
                                            i29 = i30 + 1;
                                            str2 = str5;
                                        }
                                    }
                                    if (arrayList6.size() < intValue) {
                                    }
                                }
                            }
                            if (arrayList6.size() < intValue && arrayList4 != null) {
                                i13 = i23;
                                while (i13 < arrayList4.size()) {
                                    TLRPC.StickerSetCovered stickerSetCovered2 = (TLRPC.StickerSetCovered) arrayList4.get(i13);
                                    if (stickerSetCovered2 != null) {
                                        ArrayList<TLRPC.Document> arrayList8 = stickerSetCovered2 instanceof TLRPC.TL_stickerSetFullCovered ? ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered2).documents : stickerSetCovered2.covers;
                                        if (arrayList8 != null) {
                                            arrayList = arrayList4;
                                            i14 = i13;
                                            int i34 = i23;
                                            while (i34 < arrayList8.size()) {
                                                TLRPC.Document document3 = arrayList8.get(i34);
                                                int i35 = i34;
                                                if (document3 == null || document3.attributes == null || arrayList6.contains(document3)) {
                                                    stickerSetCovered = stickerSetCovered2;
                                                    arrayList2 = arrayList8;
                                                } else {
                                                    arrayList2 = arrayList8;
                                                    int i36 = i23;
                                                    while (true) {
                                                        if (i36 < document3.attributes.size()) {
                                                            TLRPC.DocumentAttribute documentAttribute2 = document3.attributes.get(i36);
                                                            int i37 = i36;
                                                            if (documentAttribute2 instanceof TLRPC.TL_documentAttributeCustomEmoji) {
                                                                tL_documentAttributeCustomEmoji = (TLRPC.TL_documentAttributeCustomEmoji) documentAttribute2;
                                                            } else {
                                                                i36 = i37 + 1;
                                                            }
                                                        } else {
                                                            tL_documentAttributeCustomEmoji = null;
                                                        }
                                                    }
                                                    if (tL_documentAttributeCustomEmoji == null || TextUtils.isEmpty(tL_documentAttributeCustomEmoji.alt) || !tL_documentAttributeCustomEmoji.alt.replace("️", "").contains(replace) || !(z12 || tL_documentAttributeCustomEmoji.free || !((stickerSet = stickerSetCovered2.set) == null || (str3 = stickerSet.short_name) == null || !str3.equals(str2)))) {
                                                        stickerSetCovered = stickerSetCovered2;
                                                    } else {
                                                        stickerSetCovered = stickerSetCovered2;
                                                        if (hashSet.contains(Long.valueOf(document3.id))) {
                                                            continue;
                                                        } else {
                                                            hashSet.add(Long.valueOf(document3.id));
                                                            arrayList6.add(document3);
                                                            if (arrayList6.size() >= intValue) {
                                                                if (arrayList6.size() < intValue) {
                                                                    if (!arrayList6.isEmpty()) {
                                                                        String str8 = ((ni) arrayList3.get(i22)).b;
                                                                        int i38 = i23;
                                                                        while (i38 < arrayList6.size()) {
                                                                            TLRPC.Document document4 = (TLRPC.Document) arrayList6.get(i38);
                                                                            if (document4 != null) {
                                                                                ni niVar = new ni();
                                                                                StringBuilder sb2 = new StringBuilder("animated_");
                                                                                i11 = intValue;
                                                                                i12 = i38;
                                                                                sb2.append(document4.id);
                                                                                niVar.a = sb2.toString();
                                                                                niVar.b = str8;
                                                                                arrayList5.add(niVar);
                                                                            } else {
                                                                                i11 = intValue;
                                                                                i12 = i38;
                                                                            }
                                                                            i38 = i12 + 1;
                                                                            intValue = i11;
                                                                        }
                                                                    }
                                                                    i10 = intValue;
                                                                } else {
                                                                    i13 = i14 + 1;
                                                                    arrayList4 = arrayList;
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                                stickerSetCovered2 = stickerSetCovered;
                                                i34 = i35 + 1;
                                                arrayList8 = arrayList2;
                                            }
                                            if (arrayList6.size() < intValue) {
                                            }
                                        }
                                    }
                                    arrayList = arrayList4;
                                    i14 = i13;
                                    i13 = i14 + 1;
                                    arrayList4 = arrayList;
                                }
                            }
                            arrayList = arrayList4;
                            if (!arrayList6.isEmpty()) {
                            }
                            i10 = intValue;
                        } else {
                            i7 = min;
                            runnable = runnable2;
                            arrayListArr = arrayListArr2;
                        }
                        str2 = str;
                        if (arrayList6.size() < intValue) {
                            while (i15 < arrayListArr[i23].size()) {
                            }
                        }
                        if (arrayList6.size() < intValue) {
                            i13 = i23;
                            while (i13 < arrayList4.size()) {
                            }
                        }
                        arrayList = arrayList4;
                        if (!arrayList6.isEmpty()) {
                        }
                        i10 = intValue;
                    }
                    i22++;
                    str = str2;
                    intValue = i10;
                    i21 = i23;
                    min = i7;
                    runnable2 = runnable;
                    arrayListArr2 = arrayListArr;
                    arrayList4 = arrayList;
                }
                arrayList3.addAll(i21, arrayList5);
                runnable2.run();
                break;
            case 1:
                mp mpVar = (mp) obj5;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj3;
                org.telegram.ui.ActionBar.g2 g2Var = (org.telegram.ui.ActionBar.g2) obj2;
                TLObject tLObject = (TLObject) obj;
                if (((xo) obj4).d(tL_error)) {
                    org.telegram.ui.Components.b5.c0(mpVar.currentAccount, tL_error, g2Var, tLObject, Boolean.valueOf(z11 && !z10));
                    break;
                }
                break;
            default:
                af afVar = (af) obj5;
                TLRPC.PhotoSize photoSize = (TLRPC.PhotoSize) obj4;
                fj fjVar = (fj) obj3;
                TLRPC.Photo photo = (TLRPC.Photo) obj2;
                TLRPC.Document document5 = (TLRPC.Document) obj;
                c cVar = afVar.a;
                HashMap hashMap = afVar.d;
                if (z11) {
                    hashMap.put(w7.r(null, photoSize), fjVar);
                    w7.G(cVar.a).V(fc.i(photoSize, photo), fjVar, "jpg", 3, 0);
                }
                if (z10) {
                    hashMap.put(w7.r(null, document5), fjVar);
                    w7.G(cVar.a).W(document5, fjVar, 3, 0);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ kh(ri riVar, Integer num, ArrayList arrayList, boolean z10, boolean z11, ArrayList[] arrayListArr, Runnable runnable) {
        this.d = riVar;
        this.e = num;
        this.f = arrayList;
        this.b = z10;
        this.c = z11;
        this.h = arrayListArr;
        this.n = runnable;
    }

    public /* synthetic */ kh(mp mpVar, xo xoVar, TLRPC.TL_error tL_error, org.telegram.ui.ActionBar.g2 g2Var, TLObject tLObject, boolean z10, boolean z11) {
        this.d = mpVar;
        this.e = xoVar;
        this.f = tL_error;
        this.h = g2Var;
        this.n = tLObject;
        this.b = z10;
        this.c = z11;
    }
}
