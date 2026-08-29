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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class xy implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ yy b;

    public /* synthetic */ xy(yy yyVar, int i10) {
        this.a = i10;
        this.b = yyVar;
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
        yy yyVar = this.b;
        switch (i10) {
            case 0:
                yyVar.a((Runnable) obj, true);
                break;
            case 1:
                Runnable runnable = (Runnable) obj;
                ArrayList arrayList = yyVar.s;
                LongSparseArray longSparseArray = yyVar.v;
                az azVar = yyVar.w;
                HashMap<String, ArrayList<TLRPC.Document>> allStickers = MediaDataController.getInstance(azVar.M.Y0).getAllStickers();
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
                ArrayList<TLRPC.StickerSetCovered> featuredStickerSets = MediaDataController.getInstance(azVar.M.Y0).getFeaturedStickerSets();
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
                    yyVar.f.put(arrayList6, azVar.J);
                    yyVar.h.add(arrayList6);
                }
                runnable.run();
                break;
            case 2:
                yyVar.a((Runnable) obj, false);
                break;
            case 3:
                MediaDataController.getInstance(yyVar.w.M.Y0).searchStickerSets(false, yyVar.a, new org.telegram.ui.tm(13, yyVar, (Runnable) obj));
                break;
            case 4:
                Runnable runnable2 = (Runnable) obj;
                az azVar2 = yyVar.w;
                ArrayList arrayList7 = yyVar.s;
                if (yyVar.a.length() <= 14) {
                    HashMap<String, ArrayList<TLRPC.Document>> allStickers2 = MediaDataController.getInstance(azVar2.M.Y0).getAllStickers();
                    String str = yyVar.a;
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
                            yyVar.v.put(document7.id, document7);
                            i11++;
                        }
                        yyVar.f.put(arrayList7, azVar2.J);
                        yyVar.h.add(arrayList7);
                    }
                }
                runnable2.run();
                break;
            case 5:
                Runnable runnable3 = (Runnable) obj;
                az azVar3 = yyVar.w;
                fz fzVar = azVar3.M;
                int i18 = fzVar.Y0;
                HashMap<String, ArrayList<TLRPC.Document>> allStickers3 = MediaDataController.getInstance(i18).getAllStickers();
                if (allStickers3 != null && !allStickers3.isEmpty() && yyVar.a.length() > 1) {
                    String[] currentKeyboardLanguage = AndroidUtilities.getCurrentKeyboardLanguage();
                    if (!Arrays.equals(fzVar.S0, currentKeyboardLanguage)) {
                        MediaDataController.getInstance(i18).fetchNewEmojiKeywords(currentKeyboardLanguage);
                    }
                    fzVar.S0 = currentKeyboardLanguage;
                    MediaDataController.getInstance(i18).getEmojiSuggestions(fzVar.S0, azVar3.J, true, new androidx.car.app.utils.a(yyVar, allStickers3, runnable3, 26), false);
                    break;
                } else {
                    runnable3.run();
                    break;
                }
            case 6:
                Runnable runnable4 = (Runnable) obj;
                HashMap hashMap = yyVar.d;
                HashMap hashMap2 = yyVar.e;
                ArrayList arrayList9 = yyVar.c;
                az azVar4 = yyVar.w;
                ArrayList<TLRPC.TL_messages_stickerSet> stickerSets = MediaDataController.getInstance(azVar4.M.Y0).getStickerSets(0);
                fz fzVar2 = azVar4.M;
                int i19 = fzVar2.Y0;
                int i20 = fzVar2.Y0;
                MessagesController.getInstance(i19).filterPremiumStickers(stickerSets);
                int size5 = stickerSets.size();
                for (int i21 = 0; i21 < size5; i21++) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = stickerSets.get(i21);
                    int indexOfIgnoreCase3 = AndroidUtilities.indexOfIgnoreCase(tL_messages_stickerSet.set.title, azVar4.J);
                    if (indexOfIgnoreCase3 < 0) {
                        String str3 = tL_messages_stickerSet.set.short_name;
                        if (str3 != null && (indexOfIgnoreCase2 = AndroidUtilities.indexOfIgnoreCase(str3, azVar4.J)) >= 0 && (indexOfIgnoreCase2 == 0 || tL_messages_stickerSet.set.short_name.charAt(indexOfIgnoreCase2 - 1) == ' ')) {
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
                    int indexOfIgnoreCase4 = AndroidUtilities.indexOfIgnoreCase(tL_messages_stickerSet2.set.title, azVar4.J);
                    if (indexOfIgnoreCase4 < 0) {
                        String str4 = tL_messages_stickerSet2.set.short_name;
                        if (str4 != null && (indexOfIgnoreCase = AndroidUtilities.indexOfIgnoreCase(str4, azVar4.J)) >= 0 && (indexOfIgnoreCase == 0 || tL_messages_stickerSet2.set.short_name.charAt(indexOfIgnoreCase - 1) == ' ')) {
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
                az azVar5 = yyVar.w;
                if (Emoji.fullyConsistsOfEmojis(azVar5.J)) {
                    TLRPC.TL_messages_getStickers tL_messages_getStickers = new TLRPC.TL_messages_getStickers();
                    tL_messages_getStickers.emoticon = yyVar.a;
                    tL_messages_getStickers.hash = 0L;
                    azVar5.H = ConnectionsManager.getInstance(azVar5.M.Y0).sendRequest(tL_messages_getStickers, new eg.z(yyVar, tL_messages_getStickers, runnable5, 15));
                    break;
                } else {
                    runnable5.run();
                    break;
                }
        }
    }
}
