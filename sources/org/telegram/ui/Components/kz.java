package org.telegram.ui.Components;

import android.text.TextUtils;
import android.util.LongSparseArray;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class kz implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ lz b;

    public /* synthetic */ kz(lz lzVar, int i10) {
        this.a = i10;
        this.b = lzVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:85:0x01c1, code lost:
    
        if (r7.charAt(r10) <= 57343) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01de, code lost:
    
        if (r7.charAt(r10) != 9794) goto L81;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v13, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.lang.CharSequence] */
    @Override // org.telegram.messenger.Utilities.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run(Object obj) {
        int indexOfIgnoreCase;
        int indexOfIgnoreCase2;
        int i10 = this.a;
        int i11 = 1;
        lz lzVar = this.b;
        switch (i10) {
            case 0:
                lzVar.b((Runnable) obj, true);
                break;
            case 1:
                int i12 = 0;
                Runnable runnable = (Runnable) obj;
                ArrayList arrayList = lzVar.s;
                LongSparseArray longSparseArray = lzVar.v;
                nz nzVar = lzVar.w;
                HashMap<String, ArrayList<TLRPC.Document>> allStickers = MediaDataController.getInstance(nzVar.Q.c1).getAllStickers();
                HashSet hashSet = new HashSet();
                ArrayList arrayList2 = new ArrayList();
                for (ArrayList<TLRPC.Document> arrayList3 : allStickers.values()) {
                    int size = arrayList3.size();
                    int i13 = 0;
                    while (i13 < size) {
                        TLRPC.Document document = arrayList3.get(i13);
                        i13++;
                        TLRPC.Document document2 = document;
                        if (!hashSet.contains(Long.valueOf(document2.id)) && MessageObject.isPremiumSticker(document2)) {
                            hashSet.add(Long.valueOf(document2.id));
                            arrayList2.add(document2);
                            longSparseArray.put(document2.id, document2);
                        }
                    }
                }
                ArrayList<TLRPC.StickerSetCovered> featuredStickerSets = MediaDataController.getInstance(nzVar.Q.c1).getFeaturedStickerSets();
                int size2 = featuredStickerSets.size();
                int i14 = 0;
                while (i14 < size2) {
                    TLRPC.StickerSetCovered stickerSetCovered = featuredStickerSets.get(i14);
                    int i15 = i14 + 1;
                    TLRPC.StickerSetCovered stickerSetCovered2 = stickerSetCovered;
                    TLRPC.Document document3 = stickerSetCovered2.cover;
                    if (document3 != null && !hashSet.contains(Long.valueOf(document3.id)) && MessageObject.isPremiumSticker(stickerSetCovered2.cover)) {
                        hashSet.add(Long.valueOf(stickerSetCovered2.cover.id));
                        arrayList2.add(stickerSetCovered2.cover);
                        TLRPC.Document document4 = stickerSetCovered2.cover;
                        longSparseArray.put(document4.id, document4);
                    }
                    ArrayList<TLRPC.Document> arrayList4 = stickerSetCovered2.covers;
                    if (arrayList4 != null) {
                        int size3 = arrayList4.size();
                        int i16 = i12;
                        while (i16 < size3) {
                            TLRPC.Document document5 = arrayList4.get(i16);
                            i16++;
                            TLRPC.Document document6 = document5;
                            int i17 = i15;
                            if (!hashSet.contains(Long.valueOf(document6.id)) && MessageObject.isPremiumSticker(document6)) {
                                hashSet.add(Long.valueOf(document6.id));
                                arrayList2.add(document6);
                                longSparseArray.put(document6.id, document6);
                            }
                            i15 = i17;
                        }
                    }
                    i14 = i15;
                    i12 = 0;
                }
                if (!arrayList2.isEmpty()) {
                    arrayList.addAll(arrayList2);
                    lzVar.f.put(arrayList, nzVar.N);
                    lzVar.h.add(arrayList);
                }
                runnable.run();
                break;
            case 2:
                lzVar.b((Runnable) obj, false);
                break;
            case 3:
                MediaDataController.getInstance(lzVar.w.Q.c1).searchStickerSets(false, lzVar.a, new oy(3, lzVar, (Runnable) obj));
                break;
            case 4:
                Runnable runnable2 = (Runnable) obj;
                nz nzVar2 = lzVar.w;
                ArrayList arrayList5 = lzVar.s;
                if (lzVar.a.length() <= 14) {
                    HashMap<String, ArrayList<TLRPC.Document>> allStickers2 = MediaDataController.getInstance(nzVar2.Q.c1).getAllStickers();
                    String str = lzVar.a;
                    int length = str.length();
                    int i18 = 0;
                    String str2 = str;
                    while (i18 < length) {
                        if (i18 < length - 1) {
                            if (str2.charAt(i18) == 55356) {
                                int i19 = i18 + 1;
                                if (str2.charAt(i19) >= 57339) {
                                    break;
                                }
                            }
                            if (str2.charAt(i18) == 8205) {
                                int i20 = i18 + 1;
                                if (str2.charAt(i20) != 9792) {
                                    break;
                                }
                                length -= 2;
                                str2 = TextUtils.concat(str2.subSequence(0, i18), str2.subSequence(i18 + 2, str2.length()));
                                i18--;
                                i18++;
                                str2 = str2;
                            }
                        }
                        if (str2.charAt(i18) == 65039) {
                            length--;
                            str2 = TextUtils.concat(str2.subSequence(0, i18), str2.subSequence(i18 + 1, str2.length()));
                            i18--;
                            i18++;
                            str2 = str2;
                        } else {
                            i18++;
                            str2 = str2;
                        }
                    }
                    ArrayList<TLRPC.Document> arrayList6 = allStickers2 != null ? allStickers2.get(str2.toString()) : null;
                    if (arrayList6 != null && !arrayList6.isEmpty()) {
                        arrayList5.addAll(arrayList6);
                        int size4 = arrayList6.size();
                        for (int i21 = 0; i21 < size4; i21++) {
                            TLRPC.Document document7 = arrayList6.get(i21);
                            lzVar.v.put(document7.id, document7);
                        }
                        lzVar.f.put(arrayList5, nzVar2.N);
                        lzVar.h.add(arrayList5);
                    }
                }
                runnable2.run();
                break;
            case 5:
                Runnable runnable3 = (Runnable) obj;
                nz nzVar3 = lzVar.w;
                sz szVar = nzVar3.Q;
                int i22 = szVar.c1;
                HashMap<String, ArrayList<TLRPC.Document>> allStickers3 = MediaDataController.getInstance(i22).getAllStickers();
                if (allStickers3 != null && !allStickers3.isEmpty() && lzVar.a.length() > 1) {
                    String[] currentKeyboardLanguage = AndroidUtilities.getCurrentKeyboardLanguage();
                    if (!Arrays.equals(szVar.W0, currentKeyboardLanguage)) {
                        MediaDataController.getInstance(i22).fetchNewEmojiKeywords(currentKeyboardLanguage);
                    }
                    szVar.W0 = currentKeyboardLanguage;
                    MediaDataController.getInstance(i22).getEmojiSuggestions(szVar.W0, nzVar3.N, true, new qy(lzVar, allStickers3, runnable3, i11), false);
                    break;
                } else {
                    runnable3.run();
                    break;
                }
                break;
            case 6:
                Runnable runnable4 = (Runnable) obj;
                HashMap hashMap = lzVar.d;
                HashMap hashMap2 = lzVar.e;
                ArrayList arrayList7 = lzVar.c;
                nz nzVar4 = lzVar.w;
                ArrayList<TLRPC.TL_messages_stickerSet> stickerSets = MediaDataController.getInstance(nzVar4.Q.c1).getStickerSets(0);
                sz szVar2 = nzVar4.Q;
                int i23 = szVar2.c1;
                int i24 = szVar2.c1;
                MessagesController.getInstance(i23).filterPremiumStickers(stickerSets);
                int size5 = stickerSets.size();
                for (int i25 = 0; i25 < size5; i25++) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = stickerSets.get(i25);
                    int indexOfIgnoreCase3 = AndroidUtilities.indexOfIgnoreCase(tL_messages_stickerSet.set.title, nzVar4.N);
                    if (indexOfIgnoreCase3 < 0) {
                        String str3 = tL_messages_stickerSet.set.short_name;
                        if (str3 != null && (indexOfIgnoreCase2 = AndroidUtilities.indexOfIgnoreCase(str3, nzVar4.N)) >= 0 && (indexOfIgnoreCase2 == 0 || tL_messages_stickerSet.set.short_name.charAt(indexOfIgnoreCase2 - 1) == ' ')) {
                            arrayList7.add(tL_messages_stickerSet);
                            hashMap.put(tL_messages_stickerSet, Boolean.TRUE);
                        }
                    } else if (indexOfIgnoreCase3 == 0 || tL_messages_stickerSet.set.title.charAt(indexOfIgnoreCase3 - 1) == ' ') {
                        arrayList7.add(tL_messages_stickerSet);
                        hashMap2.put(tL_messages_stickerSet, Integer.valueOf(indexOfIgnoreCase3));
                    }
                }
                ArrayList<TLRPC.TL_messages_stickerSet> stickerSets2 = MediaDataController.getInstance(i24).getStickerSets(3);
                MessagesController.getInstance(i24).filterPremiumStickers(stickerSets2);
                int size6 = stickerSets2.size();
                for (int i26 = 0; i26 < size6; i26++) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = stickerSets2.get(i26);
                    int indexOfIgnoreCase4 = AndroidUtilities.indexOfIgnoreCase(tL_messages_stickerSet2.set.title, nzVar4.N);
                    if (indexOfIgnoreCase4 < 0) {
                        String str4 = tL_messages_stickerSet2.set.short_name;
                        if (str4 != null && (indexOfIgnoreCase = AndroidUtilities.indexOfIgnoreCase(str4, nzVar4.N)) >= 0 && (indexOfIgnoreCase == 0 || tL_messages_stickerSet2.set.short_name.charAt(indexOfIgnoreCase - 1) == ' ')) {
                            arrayList7.add(tL_messages_stickerSet2);
                            hashMap.put(tL_messages_stickerSet2, Boolean.TRUE);
                        }
                    } else if (indexOfIgnoreCase4 == 0 || tL_messages_stickerSet2.set.title.charAt(indexOfIgnoreCase4 - 1) == ' ') {
                        arrayList7.add(tL_messages_stickerSet2);
                        hashMap2.put(tL_messages_stickerSet2, Integer.valueOf(indexOfIgnoreCase4));
                    }
                }
                runnable4.run();
                break;
            default:
                Runnable runnable5 = (Runnable) obj;
                nz nzVar5 = lzVar.w;
                if (Emoji.fullyConsistsOfEmojis(nzVar5.N)) {
                    TLRPC.TL_messages_getStickers tL_messages_getStickers = new TLRPC.TL_messages_getStickers();
                    tL_messages_getStickers.emoticon = lzVar.a;
                    tL_messages_getStickers.hash = 0L;
                    nzVar5.L = ConnectionsManager.getInstance(nzVar5.Q.c1).sendRequest(tL_messages_getStickers, new bi.h2(lzVar, tL_messages_getStickers, runnable5, 14));
                    break;
                } else {
                    runnable5.run();
                    break;
                }
        }
    }
}
