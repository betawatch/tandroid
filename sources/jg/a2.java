package jg;

import android.text.TextUtils;
import android.util.LongSparseArray;
import bi.v2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import org.telegram.messenger.j6;
import org.telegram.messenger.si;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.l31;
import org.telegram.ui.Components.wp;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class a2 implements Runnable {
    public final /* synthetic */ c2 a;

    public a2(c2 c2Var) {
        this.a = c2Var;
    }

    public final void a() {
        c2 c2Var = this.a;
        if (c2Var.R) {
            return;
        }
        c2Var.R = true;
        c2Var.J.clear();
        c2Var.K.clear();
        c2Var.G.clear();
        c2Var.F.clear();
        c2Var.H.clear();
        c2Var.I.clear();
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
        int i7;
        int i10;
        int A1;
        HashMap hashMap;
        int A12;
        int i11;
        String str;
        c2 c2Var = this.a;
        HashMap hashMap2 = c2Var.H;
        HashMap hashMap3 = c2Var.I;
        HashMap hashMap4 = c2Var.J;
        ArrayList arrayList = c2Var.G;
        l31 l31Var = c2Var.e;
        int i12 = c2Var.c;
        if (TextUtils.isEmpty(c2Var.S)) {
            return;
        }
        wp progressDrawable = l31Var.b.h.getProgressDrawable();
        progressDrawable.e = true;
        progressDrawable.b = System.currentTimeMillis();
        progressDrawable.invalidateSelf();
        c2Var.R = false;
        int i13 = c2Var.Q + 1;
        c2Var.Q = i13;
        ArrayList arrayList2 = new ArrayList(0);
        LongSparseArray longSparseArray = new LongSparseArray(0);
        HashMap hashMap5 = si.b0(i12).e0;
        if (c2Var.S.length() <= 14) {
            String str2 = c2Var.S;
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
            i7 = i12;
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
                hashMap4.put(arrayList2, c2Var.S);
                c2Var.K.add(arrayList2);
            }
        } else {
            i7 = i12;
            i10 = 1;
        }
        if (hashMap5 != null && !hashMap5.isEmpty() && c2Var.S.length() > i10) {
            String[] G0 = org.telegram.messenger.g0.G0();
            if (!Arrays.equals(l31Var.a.b(), G0)) {
                si.b0(i7).M(G0, false);
            }
            l31Var.a.i(G0);
            si.b0(i7).U(l31Var.a.b(), c2Var.S, false, new ai.q1(this, i13, hashMap5, 1), false);
        }
        ArrayList s02 = si.b0(i7).s0(0);
        int size2 = s02.size();
        int i19 = 0;
        while (i19 < size2) {
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) s02.get(i19);
            int A13 = org.telegram.messenger.g0.A1(tL_messages_stickerSet.set.title, c2Var.S);
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
                if (str3 != null && (A12 = org.telegram.messenger.g0.A1(str3, c2Var.S)) >= 0 && (A12 == 0 || tL_messages_stickerSet.set.short_name.charAt(A12 - 1) == ' ')) {
                    a();
                    arrayList.add(tL_messages_stickerSet);
                    hashMap2.put(tL_messages_stickerSet, Boolean.TRUE);
                }
            }
            i19++;
            hashMap4 = hashMap;
        }
        HashMap hashMap6 = hashMap4;
        ArrayList s03 = si.b0(i7).s0(3);
        int size3 = s03.size();
        for (int i20 = 0; i20 < size3; i20++) {
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) s03.get(i20);
            int A14 = org.telegram.messenger.g0.A1(tL_messages_stickerSet2.set.title, c2Var.S);
            if (A14 < 0) {
                String str4 = tL_messages_stickerSet2.set.short_name;
                if (str4 != null && (A1 = org.telegram.messenger.g0.A1(str4, c2Var.S)) >= 0 && (A1 == 0 || tL_messages_stickerSet2.set.short_name.charAt(A1 - 1) == ' ')) {
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
            l31Var.b(true);
        }
        TLRPC.TL_messages_searchStickerSets tL_messages_searchStickerSets = new TLRPC.TL_messages_searchStickerSets();
        tL_messages_searchStickerSets.q = c2Var.S;
        c2Var.O = ConnectionsManager.getInstance(i7).sendRequest(tL_messages_searchStickerSets, new v2(18, this, tL_messages_searchStickerSets));
        if (j6.h(c2Var.S)) {
            TLRPC.TL_messages_getStickers tL_messages_getStickers = new TLRPC.TL_messages_getStickers();
            tL_messages_getStickers.emoticon = c2Var.S;
            tL_messages_getStickers.hash = 0L;
            c2Var.P = ConnectionsManager.getInstance(i7).sendRequest(tL_messages_getStickers, new bi.l1(this, tL_messages_getStickers, arrayList2, longSparseArray, 9));
        }
        c2Var.f();
    }
}
