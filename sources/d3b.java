// default package

import android.text.TextUtils;
import android.util.LongSparseArray;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class d3b implements Runnable {
    public final /* synthetic */ e3b a;

    public d3b(e3b e3bVar) {
        this.a = e3bVar;
    }

    public final void a() {
        e3b e3bVar = this.a;
        if (e3bVar.R) {
            return;
        }
        e3bVar.R = true;
        e3bVar.J.clear();
        e3bVar.K.clear();
        e3bVar.G.clear();
        e3bVar.F.clear();
        e3bVar.H.clear();
        e3bVar.I.clear();
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x007d, code lost:
    
        if (r14.charAt(r7) <= 57343) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x009a, code lost:
    
        if (r14.charAt(r7) != 9794) goto L28;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v27, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r7v37, types: [java.lang.CharSequence] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i;
        int i2;
        int y1;
        HashMap hashMap;
        int y12;
        int i3;
        String str;
        e3b e3bVar = this.a;
        HashMap hashMap2 = e3bVar.H;
        HashMap hashMap3 = e3bVar.I;
        HashMap hashMap4 = e3bVar.J;
        ArrayList arrayList = e3bVar.G;
        r3c r3cVar = e3bVar.e;
        int i4 = e3bVar.c;
        if (TextUtils.isEmpty(e3bVar.S)) {
            return;
        }
        kk2 progressDrawable = r3cVar.b.h.getProgressDrawable();
        progressDrawable.e = true;
        progressDrawable.b = System.currentTimeMillis();
        progressDrawable.invalidateSelf();
        e3bVar.R = false;
        int i5 = e3bVar.Q + 1;
        e3bVar.Q = i5;
        ArrayList arrayList2 = new ArrayList(0);
        LongSparseArray longSparseArray = new LongSparseArray(0);
        HashMap hashMap5 = hs6.d0(i4).e0;
        if (e3bVar.S.length() <= 14) {
            String str2 = e3bVar.S;
            int length = str2.length();
            i2 = 1;
            int i6 = 0;
            while (i6 < length) {
                int i7 = i4;
                if (i6 < length - 1) {
                    if (str2.charAt(i6) == 55356) {
                        int i8 = i6 + 1;
                        i3 = length;
                        if (str2.charAt(i8) >= 57339) {
                        }
                    } else {
                        i3 = length;
                    }
                    if (str2.charAt(i6) == 8205) {
                        int i9 = i6 + 1;
                        if (str2.charAt(i9) != 9792) {
                        }
                        length = i3 - 2;
                        str = TextUtils.concat(str2.subSequence(0, i6), str2.subSequence(i6 + 2, str2.length()));
                        i6--;
                        str2 = str;
                        i6++;
                        i4 = i7;
                    }
                } else {
                    i3 = length;
                }
                if (str2.charAt(i6) == 65039) {
                    length = i3 - 1;
                    str = TextUtils.concat(str2.subSequence(0, i6), str2.subSequence(i6 + 1, str2.length()));
                    i6--;
                    str2 = str;
                    i6++;
                    i4 = i7;
                } else {
                    length = i3;
                    i6++;
                    i4 = i7;
                }
            }
            i = i4;
            ArrayList arrayList3 = hashMap5 != null ? (ArrayList) hashMap5.get(str2.toString()) : null;
            if (arrayList3 != null && !arrayList3.isEmpty()) {
                a();
                arrayList2.addAll(arrayList3);
                int i10 = 0;
                for (int size = arrayList3.size(); i10 < size; size = size) {
                    TLRPC.Document document = (TLRPC.Document) arrayList3.get(i10);
                    longSparseArray.put(document.id, document);
                    i10++;
                    arrayList3 = arrayList3;
                }
                hashMap4.put(arrayList2, e3bVar.S);
                e3bVar.K.add(arrayList2);
            }
        } else {
            i = i4;
            i2 = 1;
        }
        if (hashMap5 != null && !hashMap5.isEmpty() && e3bVar.S.length() > i2) {
            String[] F0 = gm.F0();
            if (!Arrays.equals(r3cVar.a.b(), F0)) {
                hs6.d0(i).O(F0, false);
            }
            r3cVar.a.i(F0);
            hs6.d0(i).W(r3cVar.a.b(), e3bVar.S, false, new yg(this, i5, hashMap5, (byte) 18), false);
        }
        ArrayList t0 = hs6.d0(i).t0(0);
        int size2 = t0.size();
        int i11 = 0;
        while (i11 < size2) {
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) t0.get(i11);
            int y13 = gm.y1(tL_messages_stickerSet.set.title, e3bVar.S);
            if (y13 >= 0) {
                if (y13 != 0) {
                    hashMap = hashMap4;
                    if (tL_messages_stickerSet.set.title.charAt(y13 - 1) != ' ') {
                    }
                } else {
                    hashMap = hashMap4;
                }
                a();
                arrayList.add(tL_messages_stickerSet);
                hashMap3.put(tL_messages_stickerSet, Integer.valueOf(y13));
            } else {
                hashMap = hashMap4;
                String str3 = tL_messages_stickerSet.set.short_name;
                if (str3 != null && (y12 = gm.y1(str3, e3bVar.S)) >= 0 && (y12 == 0 || tL_messages_stickerSet.set.short_name.charAt(y12 - 1) == ' ')) {
                    a();
                    arrayList.add(tL_messages_stickerSet);
                    hashMap2.put(tL_messages_stickerSet, Boolean.TRUE);
                }
            }
            i11++;
            hashMap4 = hashMap;
        }
        HashMap hashMap6 = hashMap4;
        ArrayList t02 = hs6.d0(i).t0(3);
        int size3 = t02.size();
        for (int i12 = 0; i12 < size3; i12++) {
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) t02.get(i12);
            int y14 = gm.y1(tL_messages_stickerSet2.set.title, e3bVar.S);
            if (y14 < 0) {
                String str4 = tL_messages_stickerSet2.set.short_name;
                if (str4 != null && (y1 = gm.y1(str4, e3bVar.S)) >= 0 && (y1 == 0 || tL_messages_stickerSet2.set.short_name.charAt(y1 - 1) == ' ')) {
                    a();
                    arrayList.add(tL_messages_stickerSet2);
                    hashMap2.put(tL_messages_stickerSet2, Boolean.TRUE);
                }
            } else if (y14 == 0 || tL_messages_stickerSet2.set.title.charAt(y14 - 1) == ' ') {
                a();
                arrayList.add(tL_messages_stickerSet2);
                hashMap3.put(tL_messages_stickerSet2, Integer.valueOf(y14));
            }
        }
        if (!arrayList.isEmpty() || !hashMap6.isEmpty()) {
            r3cVar.b(true);
        }
        TLRPC.TL_messages_searchStickerSets tL_messages_searchStickerSets = new TLRPC.TL_messages_searchStickerSets();
        tL_messages_searchStickerSets.q = e3bVar.S;
        e3bVar.O = ConnectionsManager.getInstance(i).sendRequest(tL_messages_searchStickerSets, new ara(this, tL_messages_searchStickerSets, (byte) 7));
        if (gw3.h(e3bVar.S)) {
            TLRPC.TL_messages_getStickers tL_messages_getStickers = new TLRPC.TL_messages_getStickers();
            tL_messages_getStickers.emoticon = e3bVar.S;
            tL_messages_getStickers.hash = 0L;
            e3bVar.P = ConnectionsManager.getInstance(i).sendRequest(tL_messages_getStickers, new av0((Object) this, (Object) tL_messages_getStickers, (Object) arrayList2, (Object) longSparseArray, (byte) 25));
        }
        e3bVar.f();
    }
}
