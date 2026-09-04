package hg;

import android.text.TextUtils;
import android.util.LongSparseArray;
import bi.c3;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.eq;
import org.telegram.ui.Components.r41;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class d2 implements Runnable {
    public final /* synthetic */ f2 a;

    public d2(f2 f2Var) {
        this.a = f2Var;
    }

    public final void a() {
        f2 f2Var = this.a;
        if (f2Var.Q) {
            return;
        }
        f2Var.Q = true;
        f2Var.I.clear();
        f2Var.J.clear();
        f2Var.F.clear();
        f2Var.E.clear();
        f2Var.G.clear();
        f2Var.H.clear();
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
        int indexOfIgnoreCase;
        HashMap hashMap;
        int indexOfIgnoreCase2;
        int i12;
        String str;
        f2 f2Var = this.a;
        HashMap hashMap2 = f2Var.G;
        HashMap hashMap3 = f2Var.H;
        HashMap hashMap4 = f2Var.I;
        ArrayList arrayList = f2Var.F;
        r41 r41Var = f2Var.e;
        int i13 = f2Var.c;
        if (TextUtils.isEmpty(f2Var.R)) {
            return;
        }
        eq progressDrawable = r41Var.b.h.getProgressDrawable();
        progressDrawable.e = true;
        progressDrawable.b = System.currentTimeMillis();
        progressDrawable.invalidateSelf();
        f2Var.Q = false;
        int i14 = f2Var.P + 1;
        f2Var.P = i14;
        ArrayList arrayList2 = new ArrayList(0);
        LongSparseArray longSparseArray = new LongSparseArray(0);
        HashMap<String, ArrayList<TLRPC.Document>> allStickers = MediaDataController.getInstance(i13).getAllStickers();
        if (f2Var.R.length() <= 14) {
            String str2 = f2Var.R;
            int length = str2.length();
            int i15 = 0;
            while (i15 < length) {
                int i16 = i13;
                if (i15 < length - 1) {
                    if (str2.charAt(i15) == 55356) {
                        int i17 = i15 + 1;
                        i12 = length;
                        if (str2.charAt(i17) >= 57339) {
                        }
                    } else {
                        i12 = length;
                    }
                    if (str2.charAt(i15) == 8205) {
                        int i18 = i15 + 1;
                        if (str2.charAt(i18) != 9792) {
                        }
                        length = i12 - 2;
                        str = TextUtils.concat(str2.subSequence(0, i15), str2.subSequence(i15 + 2, str2.length()));
                        i15--;
                        str2 = str;
                        i15++;
                        i13 = i16;
                    }
                } else {
                    i12 = length;
                }
                if (str2.charAt(i15) == 65039) {
                    length = i12 - 1;
                    str = TextUtils.concat(str2.subSequence(0, i15), str2.subSequence(i15 + 1, str2.length()));
                    i15--;
                    str2 = str;
                    i15++;
                    i13 = i16;
                } else {
                    length = i12;
                    i15++;
                    i13 = i16;
                }
            }
            i10 = i13;
            ArrayList<TLRPC.Document> arrayList3 = allStickers != null ? allStickers.get(str2.toString()) : null;
            if (arrayList3 != null && !arrayList3.isEmpty()) {
                a();
                arrayList2.addAll(arrayList3);
                int i19 = 0;
                for (int size = arrayList3.size(); i19 < size; size = size) {
                    TLRPC.Document document = arrayList3.get(i19);
                    longSparseArray.put(document.id, document);
                    i19++;
                    arrayList3 = arrayList3;
                }
                hashMap4.put(arrayList2, f2Var.R);
                f2Var.J.add(arrayList2);
            }
        } else {
            i10 = i13;
        }
        if (allStickers == null || allStickers.isEmpty() || f2Var.R.length() <= 1) {
            i11 = 0;
        } else {
            String[] currentKeyboardLanguage = AndroidUtilities.getCurrentKeyboardLanguage();
            if (!Arrays.equals(r41Var.a.b(), currentKeyboardLanguage)) {
                MediaDataController.getInstance(i10).fetchNewEmojiKeywords(currentKeyboardLanguage);
            }
            r41Var.a.i(currentKeyboardLanguage);
            i11 = 0;
            MediaDataController.getInstance(i10).getEmojiSuggestions(r41Var.a.b(), f2Var.R, false, new c2(this, i14, allStickers, i11), false);
        }
        ArrayList<TLRPC.TL_messages_stickerSet> stickerSets = MediaDataController.getInstance(i10).getStickerSets(i11);
        int size2 = stickerSets.size();
        int i20 = 0;
        while (i20 < size2) {
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = stickerSets.get(i20);
            int indexOfIgnoreCase3 = AndroidUtilities.indexOfIgnoreCase(tL_messages_stickerSet.set.title, f2Var.R);
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
                if (str3 != null && (indexOfIgnoreCase2 = AndroidUtilities.indexOfIgnoreCase(str3, f2Var.R)) >= 0 && (indexOfIgnoreCase2 == 0 || tL_messages_stickerSet.set.short_name.charAt(indexOfIgnoreCase2 - 1) == ' ')) {
                    a();
                    arrayList.add(tL_messages_stickerSet);
                    hashMap2.put(tL_messages_stickerSet, Boolean.TRUE);
                }
            }
            i20++;
            hashMap4 = hashMap;
        }
        HashMap hashMap5 = hashMap4;
        ArrayList<TLRPC.TL_messages_stickerSet> stickerSets2 = MediaDataController.getInstance(i10).getStickerSets(3);
        int size3 = stickerSets2.size();
        for (int i21 = 0; i21 < size3; i21++) {
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = stickerSets2.get(i21);
            int indexOfIgnoreCase4 = AndroidUtilities.indexOfIgnoreCase(tL_messages_stickerSet2.set.title, f2Var.R);
            if (indexOfIgnoreCase4 < 0) {
                String str4 = tL_messages_stickerSet2.set.short_name;
                if (str4 != null && (indexOfIgnoreCase = AndroidUtilities.indexOfIgnoreCase(str4, f2Var.R)) >= 0 && (indexOfIgnoreCase == 0 || tL_messages_stickerSet2.set.short_name.charAt(indexOfIgnoreCase - 1) == ' ')) {
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
            r41Var.b(true);
        }
        TLRPC.TL_messages_searchStickerSets tL_messages_searchStickerSets = new TLRPC.TL_messages_searchStickerSets();
        tL_messages_searchStickerSets.q = f2Var.R;
        f2Var.N = ConnectionsManager.getInstance(i10).sendRequest(tL_messages_searchStickerSets, new bi.m1(12, this, tL_messages_searchStickerSets));
        if (Emoji.isValidEmoji(f2Var.R)) {
            TLRPC.TL_messages_getStickers tL_messages_getStickers = new TLRPC.TL_messages_getStickers();
            tL_messages_getStickers.emoticon = f2Var.R;
            tL_messages_getStickers.hash = 0L;
            f2Var.O = ConnectionsManager.getInstance(i10).sendRequest(tL_messages_getStickers, new c3(this, tL_messages_getStickers, arrayList2, longSparseArray, 3));
        }
        f2Var.l();
    }
}
