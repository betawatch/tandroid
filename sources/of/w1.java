package of;

import android.text.TextUtils;
import android.util.LongSparseArray;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.v31;
import org.telegram.ui.Components.vp;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class w1 implements Runnable {
    public final /* synthetic */ y1 a;

    public w1(y1 y1Var) {
        this.a = y1Var;
    }

    public final void a() {
        y1 y1Var = this.a;
        if (y1Var.M) {
            return;
        }
        y1Var.M = true;
        y1Var.E.clear();
        y1Var.F.clear();
        y1Var.B.clear();
        y1Var.A.clear();
        y1Var.C.clear();
        y1Var.D.clear();
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x007f, code lost:
    
        if (r14.charAt(r7) <= 57343) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x009e, code lost:
    
        if (r14.charAt(r7) != 9794) goto L30;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v27, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r7v37, types: [java.lang.CharSequence] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i9;
        int indexOfIgnoreCase;
        HashMap hashMap;
        int indexOfIgnoreCase2;
        int i10;
        int i11;
        String str;
        y1 y1Var = this.a;
        HashMap hashMap2 = y1Var.C;
        HashMap hashMap3 = y1Var.D;
        HashMap hashMap4 = y1Var.E;
        ArrayList arrayList = y1Var.B;
        v31 v31Var = y1Var.e;
        int i12 = y1Var.c;
        if (TextUtils.isEmpty(y1Var.N)) {
            return;
        }
        vp progressDrawable = v31Var.b.h.getProgressDrawable();
        progressDrawable.e = true;
        progressDrawable.b = System.currentTimeMillis();
        progressDrawable.invalidateSelf();
        y1Var.M = false;
        int i13 = y1Var.L + 1;
        y1Var.L = i13;
        ArrayList arrayList2 = new ArrayList(0);
        LongSparseArray longSparseArray = new LongSparseArray(0);
        HashMap<String, ArrayList<TLRPC.Document>> allStickers = MediaDataController.getInstance(i12).getAllStickers();
        if (y1Var.N.length() <= 14) {
            String str2 = y1Var.N;
            int length = str2.length();
            int i14 = 0;
            while (i14 < length) {
                if (i14 < length - 1) {
                    i10 = i12;
                    if (str2.charAt(i14) == 55356) {
                        int i15 = i14 + 1;
                        i11 = length;
                        if (str2.charAt(i15) >= 57339) {
                        }
                    } else {
                        i11 = length;
                    }
                    if (str2.charAt(i14) == 8205) {
                        int i16 = i14 + 1;
                        if (str2.charAt(i16) != 9792) {
                        }
                        length = i11 - 2;
                        str = TextUtils.concat(str2.subSequence(0, i14), str2.subSequence(i14 + 2, str2.length()));
                        i14--;
                        str2 = str;
                        i14++;
                        i12 = i10;
                    }
                } else {
                    i10 = i12;
                    i11 = length;
                }
                if (str2.charAt(i14) == 65039) {
                    length = i11 - 1;
                    str = TextUtils.concat(str2.subSequence(0, i14), str2.subSequence(i14 + 1, str2.length()));
                    i14--;
                    str2 = str;
                    i14++;
                    i12 = i10;
                } else {
                    length = i11;
                    i14++;
                    i12 = i10;
                }
            }
            i9 = i12;
            ArrayList<TLRPC.Document> arrayList3 = allStickers != null ? allStickers.get(str2.toString()) : null;
            if (arrayList3 != null && !arrayList3.isEmpty()) {
                a();
                arrayList2.addAll(arrayList3);
                int i17 = 0;
                for (int size = arrayList3.size(); i17 < size; size = size) {
                    TLRPC.Document document = arrayList3.get(i17);
                    longSparseArray.put(document.id, document);
                    i17++;
                    arrayList3 = arrayList3;
                }
                hashMap4.put(arrayList2, y1Var.N);
                y1Var.F.add(arrayList2);
            }
        } else {
            i9 = i12;
        }
        if (allStickers != null && !allStickers.isEmpty() && y1Var.N.length() > 1) {
            String[] currentKeyboardLanguage = AndroidUtilities.getCurrentKeyboardLanguage();
            if (!Arrays.equals(v31Var.a.b(), currentKeyboardLanguage)) {
                MediaDataController.getInstance(i9).fetchNewEmojiKeywords(currentKeyboardLanguage);
            }
            v31Var.a.i(currentKeyboardLanguage);
            MediaDataController.getInstance(i9).getEmojiSuggestions(v31Var.a.b(), y1Var.N, false, new c3.e(this, i13, allStickers, 2), false);
        }
        ArrayList<TLRPC.TL_messages_stickerSet> stickerSets = MediaDataController.getInstance(i9).getStickerSets(0);
        int size2 = stickerSets.size();
        int i18 = 0;
        while (i18 < size2) {
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = stickerSets.get(i18);
            int indexOfIgnoreCase3 = AndroidUtilities.indexOfIgnoreCase(tL_messages_stickerSet.set.title, y1Var.N);
            if (indexOfIgnoreCase3 >= 0) {
                if (indexOfIgnoreCase3 != 0) {
                    hashMap = hashMap4;
                    if (tL_messages_stickerSet.set.title.charAt(indexOfIgnoreCase3 - 1) != ' ') {
                    }
                } else {
                    hashMap = hashMap4;
                }
                a();
                arrayList.add(tL_messages_stickerSet);
                hashMap3.put(tL_messages_stickerSet, Integer.valueOf(indexOfIgnoreCase3));
            } else {
                hashMap = hashMap4;
                String str3 = tL_messages_stickerSet.set.short_name;
                if (str3 != null && (indexOfIgnoreCase2 = AndroidUtilities.indexOfIgnoreCase(str3, y1Var.N)) >= 0 && (indexOfIgnoreCase2 == 0 || tL_messages_stickerSet.set.short_name.charAt(indexOfIgnoreCase2 - 1) == ' ')) {
                    a();
                    arrayList.add(tL_messages_stickerSet);
                    hashMap2.put(tL_messages_stickerSet, Boolean.TRUE);
                }
            }
            i18++;
            hashMap4 = hashMap;
        }
        HashMap hashMap5 = hashMap4;
        ArrayList<TLRPC.TL_messages_stickerSet> stickerSets2 = MediaDataController.getInstance(i9).getStickerSets(3);
        int size3 = stickerSets2.size();
        for (int i19 = 0; i19 < size3; i19++) {
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = stickerSets2.get(i19);
            int indexOfIgnoreCase4 = AndroidUtilities.indexOfIgnoreCase(tL_messages_stickerSet2.set.title, y1Var.N);
            if (indexOfIgnoreCase4 < 0) {
                String str4 = tL_messages_stickerSet2.set.short_name;
                if (str4 != null && (indexOfIgnoreCase = AndroidUtilities.indexOfIgnoreCase(str4, y1Var.N)) >= 0 && (indexOfIgnoreCase == 0 || tL_messages_stickerSet2.set.short_name.charAt(indexOfIgnoreCase - 1) == ' ')) {
                    a();
                    arrayList.add(tL_messages_stickerSet2);
                    hashMap2.put(tL_messages_stickerSet2, Boolean.TRUE);
                }
            } else if (indexOfIgnoreCase4 == 0 || tL_messages_stickerSet2.set.title.charAt(indexOfIgnoreCase4 - 1) == ' ') {
                a();
                arrayList.add(tL_messages_stickerSet2);
                hashMap3.put(tL_messages_stickerSet2, Integer.valueOf(indexOfIgnoreCase4));
            }
        }
        if (!arrayList.isEmpty() || !hashMap5.isEmpty()) {
            v31Var.b(true);
        }
        TLRPC.TL_messages_searchStickerSets tL_messages_searchStickerSets = new TLRPC.TL_messages_searchStickerSets();
        tL_messages_searchStickerSets.q = y1Var.N;
        y1Var.J = ConnectionsManager.getInstance(i9).sendRequest(tL_messages_searchStickerSets, new bg.j0(22, this, tL_messages_searchStickerSets));
        if (Emoji.isValidEmoji(y1Var.N)) {
            TLRPC.TL_messages_getStickers tL_messages_getStickers = new TLRPC.TL_messages_getStickers();
            tL_messages_getStickers.emoticon = y1Var.N;
            tL_messages_getStickers.hash = 0L;
            y1Var.K = ConnectionsManager.getInstance(i9).sendRequest(tL_messages_getStickers, new fh.h1(this, tL_messages_getStickers, arrayList2, longSparseArray, 9));
        }
        y1Var.l();
    }
}
