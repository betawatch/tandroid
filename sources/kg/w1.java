package kg;

import ai.f3;
import android.text.TextUtils;
import android.util.LongSparseArray;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import org.telegram.messenger.i6;
import org.telegram.messenger.li;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.b31;
import org.telegram.ui.Components.op;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class w1 implements Runnable {
    public final /* synthetic */ y1 a;

    public w1(y1 y1Var) {
        this.a = y1Var;
    }

    public final void a() {
        y1 y1Var = this.a;
        if (y1Var.R) {
            return;
        }
        y1Var.R = true;
        y1Var.J.clear();
        y1Var.K.clear();
        y1Var.G.clear();
        y1Var.F.clear();
        y1Var.H.clear();
        y1Var.I.clear();
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x007d, code lost:
    
        if (r14.charAt(r7) <= 57343) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x009c, code lost:
    
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
        int i3;
        int i10;
        int A1;
        HashMap hashMap;
        int A12;
        int i11;
        String str;
        y1 y1Var = this.a;
        HashMap hashMap2 = y1Var.H;
        HashMap hashMap3 = y1Var.I;
        HashMap hashMap4 = y1Var.J;
        ArrayList arrayList = y1Var.G;
        b31 b31Var = y1Var.e;
        int i12 = y1Var.c;
        if (TextUtils.isEmpty(y1Var.S)) {
            return;
        }
        op progressDrawable = b31Var.b.h.getProgressDrawable();
        progressDrawable.e = true;
        progressDrawable.b = System.currentTimeMillis();
        progressDrawable.invalidateSelf();
        y1Var.R = false;
        int i13 = y1Var.Q + 1;
        y1Var.Q = i13;
        ArrayList arrayList2 = new ArrayList(0);
        LongSparseArray longSparseArray = new LongSparseArray(0);
        HashMap hashMap5 = li.b0(i12).e0;
        if (y1Var.S.length() <= 14) {
            String str2 = y1Var.S;
            int length = str2.length();
            i10 = 1;
            int i14 = 0;
            while (i14 < length) {
                int i15 = i12;
                if (i14 < length - 1) {
                    if (str2.charAt(i14) == 55356) {
                        int i16 = i14 + 1;
                        i11 = length;
                        if (str2.charAt(i16) >= 57339) {
                        }
                    } else {
                        i11 = length;
                    }
                    if (str2.charAt(i14) == 8205) {
                        int i17 = i14 + 1;
                        if (str2.charAt(i17) != 9792) {
                        }
                        length = i11 - 2;
                        str = TextUtils.concat(str2.subSequence(0, i14), str2.subSequence(i14 + 2, str2.length()));
                        i14--;
                        str2 = str;
                        i14++;
                        i12 = i15;
                    }
                } else {
                    i11 = length;
                }
                if (str2.charAt(i14) == 65039) {
                    length = i11 - 1;
                    str = TextUtils.concat(str2.subSequence(0, i14), str2.subSequence(i14 + 1, str2.length()));
                    i14--;
                    str2 = str;
                    i14++;
                    i12 = i15;
                } else {
                    length = i11;
                    i14++;
                    i12 = i15;
                }
            }
            i3 = i12;
            ArrayList arrayList3 = hashMap5 != null ? (ArrayList) hashMap5.get(str2.toString()) : null;
            if (arrayList3 != null && !arrayList3.isEmpty()) {
                a();
                arrayList2.addAll(arrayList3);
                int i18 = 0;
                for (int size = arrayList3.size(); i18 < size; size = size) {
                    TLRPC.Document document = (TLRPC.Document) arrayList3.get(i18);
                    longSparseArray.put(document.id, document);
                    i18++;
                    arrayList3 = arrayList3;
                }
                hashMap4.put(arrayList2, y1Var.S);
                y1Var.K.add(arrayList2);
            }
        } else {
            i3 = i12;
            i10 = 1;
        }
        if (hashMap5 != null && !hashMap5.isEmpty() && y1Var.S.length() > i10) {
            String[] G0 = org.telegram.messenger.g0.G0();
            if (!Arrays.equals(b31Var.a.b(), G0)) {
                li.b0(i3).M(G0, false);
            }
            b31Var.a.i(G0);
            li.b0(i3).U(b31Var.a.b(), y1Var.S, false, new k2.y(this, i13, hashMap5, 1), false);
        }
        ArrayList s02 = li.b0(i3).s0(0);
        int size2 = s02.size();
        int i19 = 0;
        while (i19 < size2) {
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) s02.get(i19);
            int A13 = org.telegram.messenger.g0.A1(tL_messages_stickerSet.set.title, y1Var.S);
            if (A13 >= 0) {
                if (A13 != 0) {
                    hashMap = hashMap4;
                    if (tL_messages_stickerSet.set.title.charAt(A13 - 1) != ' ') {
                    }
                } else {
                    hashMap = hashMap4;
                }
                a();
                arrayList.add(tL_messages_stickerSet);
                hashMap3.put(tL_messages_stickerSet, Integer.valueOf(A13));
            } else {
                hashMap = hashMap4;
                String str3 = tL_messages_stickerSet.set.short_name;
                if (str3 != null && (A12 = org.telegram.messenger.g0.A1(str3, y1Var.S)) >= 0 && (A12 == 0 || tL_messages_stickerSet.set.short_name.charAt(A12 - 1) == ' ')) {
                    a();
                    arrayList.add(tL_messages_stickerSet);
                    hashMap2.put(tL_messages_stickerSet, Boolean.TRUE);
                }
            }
            i19++;
            hashMap4 = hashMap;
        }
        HashMap hashMap6 = hashMap4;
        ArrayList s03 = li.b0(i3).s0(3);
        int size3 = s03.size();
        for (int i20 = 0; i20 < size3; i20++) {
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) s03.get(i20);
            int A14 = org.telegram.messenger.g0.A1(tL_messages_stickerSet2.set.title, y1Var.S);
            if (A14 < 0) {
                String str4 = tL_messages_stickerSet2.set.short_name;
                if (str4 != null && (A1 = org.telegram.messenger.g0.A1(str4, y1Var.S)) >= 0 && (A1 == 0 || tL_messages_stickerSet2.set.short_name.charAt(A1 - 1) == ' ')) {
                    a();
                    arrayList.add(tL_messages_stickerSet2);
                    hashMap2.put(tL_messages_stickerSet2, Boolean.TRUE);
                }
            } else if (A14 == 0 || tL_messages_stickerSet2.set.title.charAt(A14 - 1) == ' ') {
                a();
                arrayList.add(tL_messages_stickerSet2);
                hashMap3.put(tL_messages_stickerSet2, Integer.valueOf(A14));
            }
        }
        if (!arrayList.isEmpty() || !hashMap6.isEmpty()) {
            b31Var.b(true);
        }
        TLRPC.TL_messages_searchStickerSets tL_messages_searchStickerSets = new TLRPC.TL_messages_searchStickerSets();
        tL_messages_searchStickerSets.q = y1Var.S;
        y1Var.O = ConnectionsManager.getInstance(i3).sendRequest(tL_messages_searchStickerSets, new f3(21, this, tL_messages_searchStickerSets));
        if (i6.h(y1Var.S)) {
            TLRPC.TL_messages_getStickers tL_messages_getStickers = new TLRPC.TL_messages_getStickers();
            tL_messages_getStickers.emoticon = y1Var.S;
            tL_messages_getStickers.hash = 0L;
            y1Var.P = ConnectionsManager.getInstance(i3).sendRequest(tL_messages_getStickers, new ai.q1(this, tL_messages_getStickers, arrayList2, longSparseArray, 9));
        }
        y1Var.f();
    }
}
