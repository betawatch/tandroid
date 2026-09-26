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

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final /* synthetic */ class dz implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ ez b;

    public /* synthetic */ dz(ez ezVar, int i10) {
        this.a = i10;
        this.b = ezVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:85:0x01c3, code lost:
    
        if (r8.charAt(r11) <= 57343) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01dd, code lost:
    
        if (r8.charAt(r11) != 9794) goto L78;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v11, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r8v7, types: [java.lang.CharSequence] */
    @Override // org.telegram.messenger.Utilities.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run(Object obj) {
        int indexOfIgnoreCase;
        int indexOfIgnoreCase2;
        int i10 = this.a;
        int i11 = 0;
        ez ezVar = this.b;
        switch (i10) {
            case 0:
                ezVar.a((Runnable) obj, true);
                break;
            case 1:
                Runnable runnable = (Runnable) obj;
                ArrayList arrayList = ezVar.s;
                LongSparseArray longSparseArray = ezVar.v;
                gz gzVar = ezVar.w;
                HashMap<String, ArrayList<TLRPC.Document>> allStickers = MediaDataController.getInstance(gzVar.Q.c1).getAllStickers();
                HashSet hashSet = new HashSet();
                ArrayList arrayList2 = new ArrayList();
                for (ArrayList<TLRPC.Document> arrayList3 : allStickers.values()) {
                    int size = arrayList3.size();
                    int i12 = 0;
                    while (i12 < size) {
                        TLRPC.Document document = arrayList3.get(i12);
                        i12++;
                        TLRPC.Document document2 = document;
                        if (!hashSet.contains(Long.valueOf(document2.id)) && MessageObject.isPremiumSticker(document2)) {
                            hashSet.add(Long.valueOf(document2.id));
                            arrayList2.add(document2);
                            longSparseArray.put(document2.id, document2);
                        }
                    }
                }
                ArrayList<TLRPC.StickerSetCovered> featuredStickerSets = MediaDataController.getInstance(gzVar.Q.c1).getFeaturedStickerSets();
                int size2 = featuredStickerSets.size();
                int i13 = 0;
                while (i13 < size2) {
                    TLRPC.StickerSetCovered stickerSetCovered = featuredStickerSets.get(i13);
                    i13++;
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
                        int i14 = 0;
                        while (i14 < size3) {
                            TLRPC.Document document5 = arrayList4.get(i14);
                            i14++;
                            TLRPC.Document document6 = document5;
                            ArrayList arrayList5 = arrayList;
                            if (!hashSet.contains(Long.valueOf(document6.id)) && MessageObject.isPremiumSticker(document6)) {
                                hashSet.add(Long.valueOf(document6.id));
                                arrayList2.add(document6);
                                longSparseArray.put(document6.id, document6);
                            }
                            arrayList = arrayList5;
                        }
                    }
                    arrayList = arrayList;
                }
                ArrayList arrayList6 = arrayList;
                if (!arrayList2.isEmpty()) {
                    arrayList6.addAll(arrayList2);
                    ezVar.f.put(arrayList6, gzVar.N);
                    ezVar.h.add(arrayList6);
                }
                runnable.run();
                break;
            case 2:
                ezVar.a((Runnable) obj, false);
                break;
            case 3:
                MediaDataController.getInstance(ezVar.w.Q.c1).searchStickerSets(false, ezVar.a, new org.telegram.ui.oc(25, ezVar, (Runnable) obj));
                break;
            case 4:
                Runnable runnable2 = (Runnable) obj;
                gz gzVar2 = ezVar.w;
                ArrayList arrayList7 = ezVar.s;
                if (ezVar.a.length() <= 14) {
                    HashMap<String, ArrayList<TLRPC.Document>> allStickers2 = MediaDataController.getInstance(gzVar2.Q.c1).getAllStickers();
                    String str = ezVar.a;
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
                    ArrayList<TLRPC.Document> arrayList8 = allStickers2 != null ? allStickers2.get(str2.toString()) : null;
                    if (arrayList8 != null && !arrayList8.isEmpty()) {
                        arrayList7.addAll(arrayList8);
                        int size4 = arrayList8.size();
                        while (i11 < size4) {
                            TLRPC.Document document7 = arrayList8.get(i11);
                            ezVar.v.put(document7.id, document7);
                            i11++;
                        }
                        ezVar.f.put(arrayList7, gzVar2.N);
                        ezVar.h.add(arrayList7);
                    }
                }
                runnable2.run();
                break;
            case 5:
                Runnable runnable3 = (Runnable) obj;
                gz gzVar3 = ezVar.w;
                lz lzVar = gzVar3.Q;
                int i18 = lzVar.c1;
                HashMap<String, ArrayList<TLRPC.Document>> allStickers3 = MediaDataController.getInstance(i18).getAllStickers();
                if (allStickers3 != null && !allStickers3.isEmpty() && ezVar.a.length() > 1) {
                    String[] currentKeyboardLanguage = AndroidUtilities.getCurrentKeyboardLanguage();
                    if (!Arrays.equals(lzVar.W0, currentKeyboardLanguage)) {
                        MediaDataController.getInstance(i18).fetchNewEmojiKeywords(currentKeyboardLanguage);
                    }
                    lzVar.W0 = currentKeyboardLanguage;
                    MediaDataController.getInstance(i18).getEmojiSuggestions(lzVar.W0, gzVar3.N, true, new ai.q5(ezVar, allStickers3, runnable3, 29), false);
                    break;
                } else {
                    runnable3.run();
                    break;
                }
            case 6:
                Runnable runnable4 = (Runnable) obj;
                HashMap hashMap = ezVar.d;
                HashMap hashMap2 = ezVar.e;
                ArrayList arrayList9 = ezVar.c;
                gz gzVar4 = ezVar.w;
                ArrayList<TLRPC.TL_messages_stickerSet> stickerSets = MediaDataController.getInstance(gzVar4.Q.c1).getStickerSets(0);
                lz lzVar2 = gzVar4.Q;
                int i19 = lzVar2.c1;
                int i20 = lzVar2.c1;
                MessagesController.getInstance(i19).filterPremiumStickers(stickerSets);
                int size5 = stickerSets.size();
                for (int i21 = 0; i21 < size5; i21++) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = stickerSets.get(i21);
                    int indexOfIgnoreCase3 = AndroidUtilities.indexOfIgnoreCase(tL_messages_stickerSet.set.title, gzVar4.N);
                    if (indexOfIgnoreCase3 < 0) {
                        String str3 = tL_messages_stickerSet.set.short_name;
                        if (str3 != null && (indexOfIgnoreCase2 = AndroidUtilities.indexOfIgnoreCase(str3, gzVar4.N)) >= 0 && (indexOfIgnoreCase2 == 0 || tL_messages_stickerSet.set.short_name.charAt(indexOfIgnoreCase2 - 1) == ' ')) {
                            arrayList9.add(tL_messages_stickerSet);
                            hashMap.put(tL_messages_stickerSet, Boolean.TRUE);
                        }
                    } else if (indexOfIgnoreCase3 == 0 || tL_messages_stickerSet.set.title.charAt(indexOfIgnoreCase3 - 1) == ' ') {
                        arrayList9.add(tL_messages_stickerSet);
                        hashMap2.put(tL_messages_stickerSet, Integer.valueOf(indexOfIgnoreCase3));
                    }
                }
                ArrayList<TLRPC.TL_messages_stickerSet> stickerSets2 = MediaDataController.getInstance(i20).getStickerSets(3);
                MessagesController.getInstance(i20).filterPremiumStickers(stickerSets2);
                int size6 = stickerSets2.size();
                while (i11 < size6) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = stickerSets2.get(i11);
                    int indexOfIgnoreCase4 = AndroidUtilities.indexOfIgnoreCase(tL_messages_stickerSet2.set.title, gzVar4.N);
                    if (indexOfIgnoreCase4 < 0) {
                        String str4 = tL_messages_stickerSet2.set.short_name;
                        if (str4 != null && (indexOfIgnoreCase = AndroidUtilities.indexOfIgnoreCase(str4, gzVar4.N)) >= 0 && (indexOfIgnoreCase == 0 || tL_messages_stickerSet2.set.short_name.charAt(indexOfIgnoreCase - 1) == ' ')) {
                            arrayList9.add(tL_messages_stickerSet2);
                            hashMap.put(tL_messages_stickerSet2, Boolean.TRUE);
                        }
                    } else if (indexOfIgnoreCase4 == 0 || tL_messages_stickerSet2.set.title.charAt(indexOfIgnoreCase4 - 1) == ' ') {
                        arrayList9.add(tL_messages_stickerSet2);
                        hashMap2.put(tL_messages_stickerSet2, Integer.valueOf(indexOfIgnoreCase4));
                    }
                    i11++;
                }
                runnable4.run();
                break;
            default:
                Runnable runnable5 = (Runnable) obj;
                gz gzVar5 = ezVar.w;
                if (Emoji.fullyConsistsOfEmojis(gzVar5.N)) {
                    TLRPC.TL_messages_getStickers tL_messages_getStickers = new TLRPC.TL_messages_getStickers();
                    tL_messages_getStickers.emoticon = ezVar.a;
                    tL_messages_getStickers.hash = 0L;
                    gzVar5.L = ConnectionsManager.getInstance(gzVar5.Q.c1).sendRequest(tL_messages_getStickers, new ai.s5(ezVar, tL_messages_getStickers, runnable5, 9));
                    break;
                } else {
                    runnable5.run();
                    break;
                }
        }
    }
}
