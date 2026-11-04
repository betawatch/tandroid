package org.telegram.messenger;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class dh implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object n;

    public /* synthetic */ dh(ve veVar, boolean z10, TLRPC.PhotoSize photoSize, zi ziVar, TLRPC.Photo photo, boolean z11, TLRPC.Document document) {
        this.d = veVar;
        this.b = z10;
        this.e = photoSize;
        this.f = ziVar;
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
        int i3;
        int i10;
        Runnable runnable;
        li liVar;
        String str2;
        li liVar2;
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
        boolean z10 = this.c;
        Object obj2 = this.h;
        Object obj3 = this.f;
        Object obj4 = this.e;
        boolean z11 = this.b;
        Object obj5 = this.d;
        int i18 = 0;
        switch (i17) {
            case 0:
                li liVar3 = (li) obj5;
                Integer num = (Integer) obj4;
                ArrayList arrayList2 = (ArrayList) obj3;
                ArrayList[] arrayListArr = (ArrayList[]) obj2;
                Runnable runnable3 = (Runnable) obj;
                ArrayList arrayList3 = liVar3.t0[1];
                ArrayList arrayList4 = new ArrayList();
                HashSet hashSet = new HashSet();
                ArrayList arrayList5 = new ArrayList();
                int intValue = num == null ? arrayList2.size() > 5 ? 1 : arrayList2.size() > 2 ? 2 : 3 : num.intValue();
                int min = num == null ? Math.min(15, arrayList2.size()) : arrayList2.size();
                boolean z12 = h10.i(liVar3.currentAccount).q() || z11;
                if (z10) {
                    str = h10.i(liVar3.currentAccount).f0;
                    if (arrayListArr[0] != null) {
                        if (str != null) {
                            tL_messages_stickerSet = li.b0(liVar3.currentAccount).p0(str);
                            if (tL_messages_stickerSet == null) {
                                tL_messages_stickerSet = li.b0(liVar3.currentAccount).n0(str);
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
                    String str6 = ((hi) arrayList2.get(i19)).a;
                    if (TextUtils.isEmpty(str6)) {
                        arrayList = arrayList3;
                        i10 = min;
                        runnable = runnable3;
                        liVar2 = liVar3;
                        i3 = i18;
                    } else {
                        arrayList5.clear();
                        i3 = i18;
                        String str7 = "animated_";
                        if (i6.i != null) {
                            int i20 = i3;
                            while (true) {
                                ArrayList arrayList6 = i6.i;
                                i10 = min;
                                if (i20 < arrayList6.size()) {
                                    if (((String) arrayList6.get(i20)).startsWith("animated_")) {
                                        try {
                                            i16 = i20;
                                            try {
                                                TLRPC.Document e10 = org.telegram.ui.Components.g5.e(liVar3.currentAccount, Long.parseLong(((String) arrayList6.get(i20)).substring(9)));
                                                String V = zi.V(e10, null, null);
                                                if (e10 != null && V != null && V.contains(str6) && ((z12 || zi.n3(e10)) && !hashSet.contains(Long.valueOf(e10.id)))) {
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
                        if (arrayList5.size() < intValue && arrayListArr[i3] != null) {
                            int i21 = i3;
                            while (i21 < arrayListArr[i3].size()) {
                                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) arrayListArr[i3].get(i21);
                                if (tL_messages_stickerSet2 == null || tL_messages_stickerSet2.packs == null) {
                                    i13 = i21;
                                    runnable = runnable3;
                                    if (tL_messages_stickerSet2 != null && tL_messages_stickerSet2.documents != null) {
                                        int i22 = i3;
                                        while (i22 < tL_messages_stickerSet2.documents.size()) {
                                            TLRPC.Document document2 = tL_messages_stickerSet2.documents.get(i22);
                                            if (document2 == null || document2.attributes == null || arrayList5.contains(document2)) {
                                                i14 = i22;
                                            } else {
                                                i14 = i22;
                                                int i23 = i3;
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
                                                if (tL_documentAttributeCustomEmoji2 != null && !TextUtils.isEmpty(tL_documentAttributeCustomEmoji2.alt) && tL_documentAttributeCustomEmoji2.alt.contains(str6) && (z12 || tL_documentAttributeCustomEmoji2.free || ((stickerSet2 = tL_messages_stickerSet2.set) != null && (str4 = stickerSet2.short_name) != null && str4.equals(str)))) {
                                                    liVar = liVar3;
                                                    str2 = str7;
                                                    if (hashSet.contains(Long.valueOf(document2.id))) {
                                                        continue;
                                                    } else {
                                                        hashSet.add(Long.valueOf(document2.id));
                                                        arrayList5.add(document2);
                                                        if (arrayList5.size() >= intValue) {
                                                            if (arrayList5.size() < intValue) {
                                                                if (arrayList5.size() < intValue && arrayList3 != null) {
                                                                    i11 = i3;
                                                                    while (i11 < arrayList3.size()) {
                                                                        TLRPC.StickerSetCovered stickerSetCovered2 = (TLRPC.StickerSetCovered) arrayList3.get(i11);
                                                                        if (stickerSetCovered2 != null) {
                                                                            ArrayList<TLRPC.Document> arrayList7 = stickerSetCovered2 instanceof TLRPC.TL_stickerSetFullCovered ? ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered2).documents : stickerSetCovered2.covers;
                                                                            if (arrayList7 != null) {
                                                                                liVar2 = liVar;
                                                                                int i25 = i3;
                                                                                while (true) {
                                                                                    if (i25 < arrayList7.size()) {
                                                                                        TLRPC.Document document3 = arrayList7.get(i25);
                                                                                        arrayList = arrayList3;
                                                                                        if (document3 == null || document3.attributes == null || arrayList5.contains(document3)) {
                                                                                            i12 = i11;
                                                                                        } else {
                                                                                            i12 = i11;
                                                                                            int i26 = i3;
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
                                                                                    liVar = liVar2;
                                                                                    arrayList3 = arrayList;
                                                                                } else if (!arrayList5.isEmpty()) {
                                                                                    String str8 = ((hi) arrayList2.get(i19)).b;
                                                                                    for (int i28 = i3; i28 < arrayList5.size(); i28++) {
                                                                                        TLRPC.Document document4 = (TLRPC.Document) arrayList5.get(i28);
                                                                                        if (document4 != null) {
                                                                                            hi hiVar = new hi();
                                                                                            hiVar.a = str2 + document4.id;
                                                                                            hiVar.b = str8;
                                                                                            arrayList4.add(hiVar);
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                        liVar2 = liVar;
                                                                        arrayList = arrayList3;
                                                                        i12 = i11;
                                                                        i11 = i12 + 1;
                                                                        liVar = liVar2;
                                                                        arrayList3 = arrayList;
                                                                    }
                                                                }
                                                                liVar2 = liVar;
                                                                arrayList = arrayList3;
                                                                if (!arrayList5.isEmpty()) {
                                                                }
                                                            } else {
                                                                liVar3 = liVar;
                                                                i21 = i13 + 1;
                                                                str7 = str2;
                                                                runnable3 = runnable;
                                                            }
                                                        }
                                                    }
                                                    liVar3 = liVar;
                                                    i22 = i14 + 1;
                                                    str7 = str2;
                                                }
                                            }
                                            liVar = liVar3;
                                            str2 = str7;
                                            liVar3 = liVar;
                                            i22 = i14 + 1;
                                            str7 = str2;
                                        }
                                    }
                                } else {
                                    i13 = i21;
                                    int i29 = i3;
                                    while (i29 < tL_messages_stickerSet2.packs.size()) {
                                        TLRPC.TL_stickerPack tL_stickerPack = tL_messages_stickerSet2.packs.get(i29);
                                        int i30 = i29;
                                        if (tL_stickerPack == null || (str5 = tL_stickerPack.emoticon) == null || !str5.contains(str6)) {
                                            runnable2 = runnable3;
                                        } else {
                                            runnable2 = runnable3;
                                            int i31 = i3;
                                            while (i31 < tL_stickerPack.documents.size()) {
                                                long longValue = tL_stickerPack.documents.get(i31).longValue();
                                                TLRPC.TL_stickerPack tL_stickerPack2 = tL_stickerPack;
                                                int i32 = i3;
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
                                liVar = liVar3;
                                str2 = str7;
                                if (arrayList5.size() < intValue) {
                                }
                            }
                        }
                        runnable = runnable3;
                        liVar = liVar3;
                        str2 = str7;
                        if (arrayList5.size() < intValue) {
                            i11 = i3;
                            while (i11 < arrayList3.size()) {
                            }
                        }
                        liVar2 = liVar;
                        arrayList = arrayList3;
                        if (!arrayList5.isEmpty()) {
                        }
                    }
                    i19++;
                    i18 = i3;
                    min = i10;
                    liVar3 = liVar2;
                    arrayList3 = arrayList;
                    runnable3 = runnable;
                }
                arrayList2.addAll(i18, arrayList4);
                runnable3.run();
                break;
            case 1:
                hp hpVar = (hp) obj5;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj3;
                org.telegram.ui.ActionBar.d2 d2Var = (org.telegram.ui.ActionBar.d2) obj2;
                TLObject tLObject = (TLObject) obj;
                if (((so) obj4).a(tL_error)) {
                    org.telegram.ui.Components.t4.e0(hpVar.currentAccount, tL_error, d2Var, tLObject, Boolean.valueOf(z11 && !z10));
                    break;
                }
                break;
            default:
                ve veVar = (ve) obj5;
                TLRPC.PhotoSize photoSize = (TLRPC.PhotoSize) obj4;
                zi ziVar = (zi) obj3;
                TLRPC.Photo photo = (TLRPC.Photo) obj2;
                TLRPC.Document document5 = (TLRPC.Document) obj;
                c cVar = veVar.a;
                HashMap hashMap = veVar.d;
                if (z11) {
                    hashMap.put(w7.r(null, photoSize), ziVar);
                    w7.G(cVar.a).W(ac.i(photoSize, photo), ziVar, "jpg", 3, 0);
                }
                if (z10) {
                    hashMap.put(w7.r(null, document5), ziVar);
                    w7.G(cVar.a).X(document5, ziVar, 3, 0);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ dh(li liVar, Integer num, ArrayList arrayList, boolean z10, boolean z11, ArrayList[] arrayListArr, Runnable runnable) {
        this.d = liVar;
        this.e = num;
        this.f = arrayList;
        this.b = z10;
        this.c = z11;
        this.h = arrayListArr;
        this.n = runnable;
    }

    public /* synthetic */ dh(hp hpVar, so soVar, TLRPC.TL_error tL_error, org.telegram.ui.ActionBar.d2 d2Var, TLObject tLObject, boolean z10, boolean z11) {
        this.d = hpVar;
        this.e = soVar;
        this.f = tL_error;
        this.h = d2Var;
        this.n = tLObject;
        this.b = z10;
        this.c = z11;
    }
}
