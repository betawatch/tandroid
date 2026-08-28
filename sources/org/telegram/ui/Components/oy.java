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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class oy implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ py b;

    public /* synthetic */ oy(py pyVar, int i9) {
        this.a = i9;
        this.b = pyVar;
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
        int i9 = this.a;
        int i10 = 0;
        py pyVar = this.b;
        switch (i9) {
            case 0:
                pyVar.a((Runnable) obj, true);
                break;
            case 1:
                Runnable runnable = (Runnable) obj;
                ArrayList arrayList = pyVar.s;
                LongSparseArray longSparseArray = pyVar.v;
                ry ryVar = pyVar.w;
                HashMap<String, ArrayList<TLRPC.Document>> allStickers = MediaDataController.getInstance(ryVar.M.Y0).getAllStickers();
                HashSet hashSet = new HashSet();
                ArrayList arrayList2 = new ArrayList();
                for (ArrayList<TLRPC.Document> arrayList3 : allStickers.values()) {
                    int size = arrayList3.size();
                    int i11 = 0;
                    while (i11 < size) {
                        TLRPC.Document document = arrayList3.get(i11);
                        i11++;
                        TLRPC.Document document2 = document;
                        if (!hashSet.contains(Long.valueOf(document2.id)) && MessageObject.isPremiumSticker(document2)) {
                            hashSet.add(Long.valueOf(document2.id));
                            arrayList2.add(document2);
                            longSparseArray.put(document2.id, document2);
                        }
                    }
                }
                ArrayList<TLRPC.StickerSetCovered> featuredStickerSets = MediaDataController.getInstance(ryVar.M.Y0).getFeaturedStickerSets();
                int size2 = featuredStickerSets.size();
                int i12 = 0;
                while (i12 < size2) {
                    TLRPC.StickerSetCovered stickerSetCovered = featuredStickerSets.get(i12);
                    i12++;
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
                        int i13 = 0;
                        while (i13 < size3) {
                            TLRPC.Document document5 = arrayList4.get(i13);
                            i13++;
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
                    pyVar.f.put(arrayList6, ryVar.J);
                    pyVar.h.add(arrayList6);
                }
                runnable.run();
                break;
            case 2:
                pyVar.a((Runnable) obj, false);
                break;
            case 3:
                MediaDataController.getInstance(pyVar.w.M.Y0).searchStickerSets(false, pyVar.a, new org.telegram.ui.df(20, pyVar, (Runnable) obj));
                break;
            case 4:
                Runnable runnable2 = (Runnable) obj;
                ry ryVar2 = pyVar.w;
                ArrayList arrayList7 = pyVar.s;
                if (pyVar.a.length() <= 14) {
                    HashMap<String, ArrayList<TLRPC.Document>> allStickers2 = MediaDataController.getInstance(ryVar2.M.Y0).getAllStickers();
                    String str = pyVar.a;
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
                    ArrayList<TLRPC.Document> arrayList8 = allStickers2 != null ? allStickers2.get(str2.toString()) : null;
                    if (arrayList8 != null && !arrayList8.isEmpty()) {
                        arrayList7.addAll(arrayList8);
                        int size4 = arrayList8.size();
                        while (i10 < size4) {
                            TLRPC.Document document7 = arrayList8.get(i10);
                            pyVar.v.put(document7.id, document7);
                            i10++;
                        }
                        pyVar.f.put(arrayList7, ryVar2.J);
                        pyVar.h.add(arrayList7);
                    }
                }
                runnable2.run();
                break;
            case 5:
                Runnable runnable3 = (Runnable) obj;
                ry ryVar3 = pyVar.w;
                wy wyVar = ryVar3.M;
                int i17 = wyVar.Y0;
                HashMap<String, ArrayList<TLRPC.Document>> allStickers3 = MediaDataController.getInstance(i17).getAllStickers();
                if (allStickers3 != null && !allStickers3.isEmpty() && pyVar.a.length() > 1) {
                    String[] currentKeyboardLanguage = AndroidUtilities.getCurrentKeyboardLanguage();
                    if (!Arrays.equals(wyVar.S0, currentKeyboardLanguage)) {
                        MediaDataController.getInstance(i17).fetchNewEmojiKeywords(currentKeyboardLanguage);
                    }
                    wyVar.S0 = currentKeyboardLanguage;
                    MediaDataController.getInstance(i17).getEmojiSuggestions(wyVar.S0, ryVar3.J, true, new androidx.car.app.utils.a(pyVar, allStickers3, runnable3, 28), false);
                    break;
                } else {
                    runnable3.run();
                    break;
                }
            case 6:
                Runnable runnable4 = (Runnable) obj;
                HashMap hashMap = pyVar.d;
                HashMap hashMap2 = pyVar.e;
                ArrayList arrayList9 = pyVar.c;
                ry ryVar4 = pyVar.w;
                ArrayList<TLRPC.TL_messages_stickerSet> stickerSets = MediaDataController.getInstance(ryVar4.M.Y0).getStickerSets(0);
                wy wyVar2 = ryVar4.M;
                int i18 = wyVar2.Y0;
                int i19 = wyVar2.Y0;
                MessagesController.getInstance(i18).filterPremiumStickers(stickerSets);
                int size5 = stickerSets.size();
                for (int i20 = 0; i20 < size5; i20++) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = stickerSets.get(i20);
                    int indexOfIgnoreCase3 = AndroidUtilities.indexOfIgnoreCase(tL_messages_stickerSet.set.title, ryVar4.J);
                    if (indexOfIgnoreCase3 < 0) {
                        String str3 = tL_messages_stickerSet.set.short_name;
                        if (str3 != null && (indexOfIgnoreCase2 = AndroidUtilities.indexOfIgnoreCase(str3, ryVar4.J)) >= 0 && (indexOfIgnoreCase2 == 0 || tL_messages_stickerSet.set.short_name.charAt(indexOfIgnoreCase2 - 1) == ' ')) {
                            arrayList9.add(tL_messages_stickerSet);
                            hashMap.put(tL_messages_stickerSet, Boolean.TRUE);
                        }
                    } else if (indexOfIgnoreCase3 == 0 || tL_messages_stickerSet.set.title.charAt(indexOfIgnoreCase3 - 1) == ' ') {
                        arrayList9.add(tL_messages_stickerSet);
                        hashMap2.put(tL_messages_stickerSet, Integer.valueOf(indexOfIgnoreCase3));
                    }
                }
                ArrayList<TLRPC.TL_messages_stickerSet> stickerSets2 = MediaDataController.getInstance(i19).getStickerSets(3);
                MessagesController.getInstance(i19).filterPremiumStickers(stickerSets2);
                int size6 = stickerSets2.size();
                while (i10 < size6) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = stickerSets2.get(i10);
                    int indexOfIgnoreCase4 = AndroidUtilities.indexOfIgnoreCase(tL_messages_stickerSet2.set.title, ryVar4.J);
                    if (indexOfIgnoreCase4 < 0) {
                        String str4 = tL_messages_stickerSet2.set.short_name;
                        if (str4 != null && (indexOfIgnoreCase = AndroidUtilities.indexOfIgnoreCase(str4, ryVar4.J)) >= 0 && (indexOfIgnoreCase == 0 || tL_messages_stickerSet2.set.short_name.charAt(indexOfIgnoreCase - 1) == ' ')) {
                            arrayList9.add(tL_messages_stickerSet2);
                            hashMap.put(tL_messages_stickerSet2, Boolean.TRUE);
                        }
                    } else if (indexOfIgnoreCase4 == 0 || tL_messages_stickerSet2.set.title.charAt(indexOfIgnoreCase4 - 1) == ' ') {
                        arrayList9.add(tL_messages_stickerSet2);
                        hashMap2.put(tL_messages_stickerSet2, Integer.valueOf(indexOfIgnoreCase4));
                    }
                    i10++;
                }
                runnable4.run();
                break;
            default:
                Runnable runnable5 = (Runnable) obj;
                ry ryVar5 = pyVar.w;
                if (Emoji.fullyConsistsOfEmojis(ryVar5.J)) {
                    TLRPC.TL_messages_getStickers tL_messages_getStickers = new TLRPC.TL_messages_getStickers();
                    tL_messages_getStickers.emoticon = pyVar.a;
                    tL_messages_getStickers.hash = 0L;
                    ryVar5.H = ConnectionsManager.getInstance(ryVar5.M.Y0).sendRequest(tL_messages_getStickers, new bg.b0(pyVar, tL_messages_getStickers, runnable5, 17));
                    break;
                } else {
                    runnable5.run();
                    break;
                }
        }
    }
}
