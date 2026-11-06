package jg;

import android.text.TextUtils;
import android.util.LongSparseArray;
import bi.g2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import org.telegram.messenger.i6;
import org.telegram.messenger.ui;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.g31;
import org.telegram.ui.Components.op;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class b2 implements Runnable {
    public final /* synthetic */ d2 a;

    public b2(d2 d2Var) {
        this.a = d2Var;
    }

    public final void a() {
        d2 d2Var = this.a;
        if (d2Var.Q) {
            return;
        }
        d2Var.Q = true;
        d2Var.I.clear();
        d2Var.J.clear();
        d2Var.F.clear();
        d2Var.E.clear();
        d2Var.G.clear();
        d2Var.H.clear();
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
        int i11;
        int A1;
        HashMap hashMap;
        int A12;
        int i12;
        String str;
        d2 d2Var = this.a;
        HashMap hashMap2 = d2Var.G;
        HashMap hashMap3 = d2Var.H;
        HashMap hashMap4 = d2Var.I;
        ArrayList arrayList = d2Var.F;
        g31 g31Var = d2Var.e;
        int i13 = d2Var.c;
        if (TextUtils.isEmpty(d2Var.R)) {
            return;
        }
        op progressDrawable = g31Var.b.h.getProgressDrawable();
        progressDrawable.e = true;
        progressDrawable.b = System.currentTimeMillis();
        progressDrawable.invalidateSelf();
        d2Var.Q = false;
        int i14 = d2Var.P + 1;
        d2Var.P = i14;
        ArrayList arrayList2 = new ArrayList(0);
        LongSparseArray longSparseArray = new LongSparseArray(0);
        HashMap hashMap5 = ui.b0(i13).d0;
        if (d2Var.R.length() <= 14) {
            String str2 = d2Var.R;
            int length = str2.length();
            i10 = 1;
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
            i7 = i13;
            ArrayList arrayList3 = hashMap5 != null ? (ArrayList) hashMap5.get(str2.toString()) : null;
            if (arrayList3 != null && !arrayList3.isEmpty()) {
                a();
                arrayList2.addAll(arrayList3);
                int i19 = 0;
                for (int size = arrayList3.size(); i19 < size; size = size) {
                    TLRPC.Document document = (TLRPC.Document) arrayList3.get(i19);
                    longSparseArray.put(document.id, document);
                    i19++;
                    arrayList3 = arrayList3;
                }
                hashMap4.put(arrayList2, d2Var.R);
                d2Var.J.add(arrayList2);
            }
        } else {
            i7 = i13;
            i10 = 1;
        }
        if (hashMap5 == null || hashMap5.isEmpty() || d2Var.R.length() <= i10) {
            i11 = 0;
        } else {
            String[] G0 = org.telegram.messenger.g0.G0();
            if (Arrays.equals(g31Var.a.b(), G0)) {
                i11 = 0;
            } else {
                i11 = 0;
                ui.b0(i7).M(G0, false);
            }
            g31Var.a.i(G0);
            ui.b0(i7).U(g31Var.a.b(), d2Var.R, false, new a2(this, i14, hashMap5, i11), false);
        }
        ArrayList s02 = ui.b0(i7).s0(i11);
        int size2 = s02.size();
        int i20 = i11;
        while (i20 < size2) {
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) s02.get(i20);
            int A13 = org.telegram.messenger.g0.A1(tL_messages_stickerSet.set.title, d2Var.R);
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
                if (str3 != null && (A12 = org.telegram.messenger.g0.A1(str3, d2Var.R)) >= 0 && (A12 == 0 || tL_messages_stickerSet.set.short_name.charAt(A12 - 1) == ' ')) {
                    a();
                    arrayList.add(tL_messages_stickerSet);
                    hashMap2.put(tL_messages_stickerSet, Boolean.TRUE);
                }
            }
            i20++;
            hashMap4 = hashMap;
        }
        HashMap hashMap6 = hashMap4;
        ArrayList s03 = ui.b0(i7).s0(3);
        int size3 = s03.size();
        for (int i21 = 0; i21 < size3; i21++) {
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) s03.get(i21);
            int A14 = org.telegram.messenger.g0.A1(tL_messages_stickerSet2.set.title, d2Var.R);
            if (A14 < 0) {
                String str4 = tL_messages_stickerSet2.set.short_name;
                if (str4 != null && (A1 = org.telegram.messenger.g0.A1(str4, d2Var.R)) >= 0 && (A1 == 0 || tL_messages_stickerSet2.set.short_name.charAt(A1 - 1) == ' ')) {
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
            g31Var.b(true);
        }
        TLRPC.TL_messages_searchStickerSets tL_messages_searchStickerSets = new TLRPC.TL_messages_searchStickerSets();
        tL_messages_searchStickerSets.q = d2Var.R;
        d2Var.N = ConnectionsManager.getInstance(i7).sendRequest(tL_messages_searchStickerSets, new bi.j(18, this, tL_messages_searchStickerSets));
        if (i6.h(d2Var.R)) {
            TLRPC.TL_messages_getStickers tL_messages_getStickers = new TLRPC.TL_messages_getStickers();
            tL_messages_getStickers.emoticon = d2Var.R;
            tL_messages_getStickers.hash = 0L;
            d2Var.O = ConnectionsManager.getInstance(i7).sendRequest(tL_messages_getStickers, new g2(this, tL_messages_getStickers, arrayList2, longSparseArray, 8));
        }
        d2Var.f();
    }
}
