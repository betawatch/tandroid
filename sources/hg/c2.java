package hg;

import ai.k2;
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
import org.telegram.ui.Components.pq;
import org.telegram.ui.Components.w51;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class c2 implements Runnable {
    public final /* synthetic */ e2 a;

    public c2(e2 e2Var) {
        this.a = e2Var;
    }

    public final void a() {
        e2 e2Var = this.a;
        if (e2Var.Q) {
            return;
        }
        e2Var.Q = true;
        e2Var.I.clear();
        e2Var.J.clear();
        e2Var.F.clear();
        e2Var.E.clear();
        e2Var.G.clear();
        e2Var.H.clear();
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
        int i10;
        int i11;
        int i12;
        int indexOfIgnoreCase;
        HashMap hashMap;
        int indexOfIgnoreCase2;
        int i13;
        String str;
        e2 e2Var = this.a;
        HashMap hashMap2 = e2Var.G;
        HashMap hashMap3 = e2Var.H;
        HashMap hashMap4 = e2Var.I;
        ArrayList arrayList = e2Var.F;
        w51 w51Var = e2Var.e;
        int i14 = e2Var.c;
        if (TextUtils.isEmpty(e2Var.R)) {
            return;
        }
        pq progressDrawable = w51Var.b.h.getProgressDrawable();
        progressDrawable.e = true;
        progressDrawable.b = System.currentTimeMillis();
        progressDrawable.invalidateSelf();
        e2Var.Q = false;
        int i15 = e2Var.P + 1;
        e2Var.P = i15;
        ArrayList arrayList2 = new ArrayList(0);
        LongSparseArray longSparseArray = new LongSparseArray(0);
        HashMap<String, ArrayList<TLRPC.Document>> allStickers = MediaDataController.getInstance(i14).getAllStickers();
        if (e2Var.R.length() <= 14) {
            String str2 = e2Var.R;
            int length = str2.length();
            i11 = 1;
            int i16 = 0;
            while (i16 < length) {
                int i17 = i14;
                if (i16 < length - 1) {
                    if (str2.charAt(i16) == 55356) {
                        int i18 = i16 + 1;
                        i13 = length;
                        if (str2.charAt(i18) >= 57339) {
                        }
                    } else {
                        i13 = length;
                    }
                    if (str2.charAt(i16) == 8205) {
                        int i19 = i16 + 1;
                        if (str2.charAt(i19) != 9792) {
                        }
                        length = i13 - 2;
                        str = TextUtils.concat(str2.subSequence(0, i16), str2.subSequence(i16 + 2, str2.length()));
                        i16--;
                        str2 = str;
                        i16++;
                        i14 = i17;
                    }
                } else {
                    i13 = length;
                }
                if (str2.charAt(i16) == 65039) {
                    length = i13 - 1;
                    str = TextUtils.concat(str2.subSequence(0, i16), str2.subSequence(i16 + 1, str2.length()));
                    i16--;
                    str2 = str;
                    i16++;
                    i14 = i17;
                } else {
                    length = i13;
                    i16++;
                    i14 = i17;
                }
            }
            i10 = i14;
            ArrayList<TLRPC.Document> arrayList3 = allStickers != null ? allStickers.get(str2.toString()) : null;
            if (arrayList3 != null && !arrayList3.isEmpty()) {
                a();
                arrayList2.addAll(arrayList3);
                int i20 = 0;
                for (int size = arrayList3.size(); i20 < size; size = size) {
                    TLRPC.Document document = arrayList3.get(i20);
                    longSparseArray.put(document.id, document);
                    i20++;
                    arrayList3 = arrayList3;
                }
                hashMap4.put(arrayList2, e2Var.R);
                e2Var.J.add(arrayList2);
            }
        } else {
            i10 = i14;
            i11 = 1;
        }
        if (allStickers == null || allStickers.isEmpty() || e2Var.R.length() <= i11) {
            i12 = 0;
        } else {
            String[] currentKeyboardLanguage = AndroidUtilities.getCurrentKeyboardLanguage();
            if (!Arrays.equals(w51Var.a.b(), currentKeyboardLanguage)) {
                MediaDataController.getInstance(i10).fetchNewEmojiKeywords(currentKeyboardLanguage);
            }
            w51Var.a.i(currentKeyboardLanguage);
            i12 = 0;
            MediaDataController.getInstance(i10).getEmojiSuggestions(w51Var.a.b(), e2Var.R, false, new b2(this, i15, allStickers, i12), false);
        }
        ArrayList<TLRPC.TL_messages_stickerSet> stickerSets = MediaDataController.getInstance(i10).getStickerSets(i12);
        int size2 = stickerSets.size();
        int i21 = i12;
        while (i21 < size2) {
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = stickerSets.get(i21);
            int indexOfIgnoreCase3 = AndroidUtilities.indexOfIgnoreCase(tL_messages_stickerSet.set.title, e2Var.R);
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
                if (str3 != null && (indexOfIgnoreCase2 = AndroidUtilities.indexOfIgnoreCase(str3, e2Var.R)) >= 0 && (indexOfIgnoreCase2 == 0 || tL_messages_stickerSet.set.short_name.charAt(indexOfIgnoreCase2 - 1) == ' ')) {
                    a();
                    arrayList.add(tL_messages_stickerSet);
                    hashMap2.put(tL_messages_stickerSet, Boolean.TRUE);
                }
            }
            i21++;
            hashMap4 = hashMap;
        }
        HashMap hashMap5 = hashMap4;
        ArrayList<TLRPC.TL_messages_stickerSet> stickerSets2 = MediaDataController.getInstance(i10).getStickerSets(3);
        int size3 = stickerSets2.size();
        for (int i22 = 0; i22 < size3; i22++) {
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = stickerSets2.get(i22);
            int indexOfIgnoreCase4 = AndroidUtilities.indexOfIgnoreCase(tL_messages_stickerSet2.set.title, e2Var.R);
            if (indexOfIgnoreCase4 < 0) {
                String str4 = tL_messages_stickerSet2.set.short_name;
                if (str4 != null && (indexOfIgnoreCase = AndroidUtilities.indexOfIgnoreCase(str4, e2Var.R)) >= 0 && (indexOfIgnoreCase == 0 || tL_messages_stickerSet2.set.short_name.charAt(indexOfIgnoreCase - 1) == ' ')) {
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
            w51Var.b(true);
        }
        TLRPC.TL_messages_searchStickerSets tL_messages_searchStickerSets = new TLRPC.TL_messages_searchStickerSets();
        tL_messages_searchStickerSets.q = e2Var.R;
        e2Var.N = ConnectionsManager.getInstance(i10).sendRequest(tL_messages_searchStickerSets, new ai.g(19, this, tL_messages_searchStickerSets));
        if (Emoji.isValidEmoji(e2Var.R)) {
            TLRPC.TL_messages_getStickers tL_messages_getStickers = new TLRPC.TL_messages_getStickers();
            tL_messages_getStickers.emoticon = e2Var.R;
            tL_messages_getStickers.hash = 0L;
            e2Var.O = ConnectionsManager.getInstance(i10).sendRequest(tL_messages_getStickers, new k2(this, tL_messages_getStickers, arrayList2, longSparseArray, 8));
        }
        e2Var.l();
    }
}
