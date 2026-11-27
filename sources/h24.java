// default package

import android.text.TextUtils;
import android.util.LongSparseArray;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class h24 implements pcc {
    public final /* synthetic */ byte a;
    public final /* synthetic */ i24 b;

    public /* synthetic */ h24(i24 i24Var, byte b) {
        this.a = b;
        this.b = i24Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:85:0x01bd, code lost:
    
        if (r7.charAt(r10) <= 57343) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01d7, code lost:
    
        if (r7.charAt(r10) != 9794) goto L78;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v12, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r7v16, types: [java.lang.CharSequence] */
    @Override // pcc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Object obj) {
        LongSparseArray longSparseArray;
        int y1;
        int y12;
        byte b = this.a;
        int i = 0;
        i24 i24Var = this.b;
        switch (b) {
            case 0:
                i24Var.a((Runnable) obj, true);
                break;
            case 1:
                Runnable runnable = (Runnable) obj;
                ArrayList arrayList = i24Var.s;
                LongSparseArray longSparseArray2 = i24Var.w;
                j24 j24Var = i24Var.x;
                o24 o24Var = j24Var.R;
                HashMap hashMap = ls6.d0(o24Var.d1).e0;
                HashSet hashSet = new HashSet();
                ArrayList arrayList2 = new ArrayList();
                for (ArrayList arrayList3 : hashMap.values()) {
                    int size = arrayList3.size();
                    int i2 = 0;
                    while (i2 < size) {
                        Object obj2 = arrayList3.get(i2);
                        i2++;
                        TLRPC.Document document = (TLRPC.Document) obj2;
                        if (!hashSet.contains(Long.valueOf(document.id)) && r47.W3(document)) {
                            hashSet.add(Long.valueOf(document.id));
                            arrayList2.add(document);
                            longSparseArray2.put(document.id, document);
                        }
                    }
                }
                ArrayList arrayList4 = ls6.d0(o24Var.d1).t0[0];
                int size2 = arrayList4.size();
                int i3 = 0;
                while (i3 < size2) {
                    Object obj3 = arrayList4.get(i3);
                    i3++;
                    TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) obj3;
                    TLRPC.Document document2 = stickerSetCovered.cover;
                    if (document2 != null && !hashSet.contains(Long.valueOf(document2.id)) && r47.W3(stickerSetCovered.cover)) {
                        hashSet.add(Long.valueOf(stickerSetCovered.cover.id));
                        arrayList2.add(stickerSetCovered.cover);
                        TLRPC.Document document3 = stickerSetCovered.cover;
                        longSparseArray2.put(document3.id, document3);
                    }
                    ArrayList<TLRPC.Document> arrayList5 = stickerSetCovered.covers;
                    if (arrayList5 != null) {
                        int size3 = arrayList5.size();
                        int i4 = i;
                        while (i4 < size3) {
                            TLRPC.Document document4 = arrayList5.get(i4);
                            i4++;
                            TLRPC.Document document5 = document4;
                            LongSparseArray longSparseArray3 = longSparseArray2;
                            if (hashSet.contains(Long.valueOf(document5.id)) || !r47.W3(document5)) {
                                longSparseArray = longSparseArray3;
                            } else {
                                hashSet.add(Long.valueOf(document5.id));
                                arrayList2.add(document5);
                                longSparseArray = longSparseArray3;
                                longSparseArray.put(document5.id, document5);
                            }
                            longSparseArray2 = longSparseArray;
                        }
                    }
                    longSparseArray2 = longSparseArray2;
                    i = 0;
                }
                if (!arrayList2.isEmpty()) {
                    arrayList.addAll(arrayList2);
                    i24Var.f.put(arrayList, j24Var.O);
                    i24Var.h.add(arrayList);
                }
                runnable.run();
                break;
            case 2:
                i24Var.a((Runnable) obj, false);
                break;
            case 3:
                ls6.d0(i24Var.x.R.d1).a2(false, i24Var.a, new rx1(i24Var, (Runnable) obj, (byte) 20));
                break;
            case 4:
                Runnable runnable2 = (Runnable) obj;
                j24 j24Var2 = i24Var.x;
                ArrayList arrayList6 = i24Var.s;
                if (i24Var.a.length() <= 14) {
                    HashMap hashMap2 = ls6.d0(j24Var2.R.d1).e0;
                    String str = i24Var.a;
                    int length = str.length();
                    int i5 = 0;
                    String str2 = str;
                    while (i5 < length) {
                        if (i5 < length - 1) {
                            if (str2.charAt(i5) == 55356) {
                                int i6 = i5 + 1;
                                if (str2.charAt(i6) >= 57339) {
                                    break;
                                }
                            }
                            if (str2.charAt(i5) == 8205) {
                                int i7 = i5 + 1;
                                if (str2.charAt(i7) != 9792) {
                                    break;
                                }
                                length -= 2;
                                str2 = TextUtils.concat(str2.subSequence(0, i5), str2.subSequence(i5 + 2, str2.length()));
                                i5--;
                                i5++;
                                str2 = str2;
                            }
                        }
                        if (str2.charAt(i5) == 65039) {
                            length--;
                            str2 = TextUtils.concat(str2.subSequence(0, i5), str2.subSequence(i5 + 1, str2.length()));
                            i5--;
                            i5++;
                            str2 = str2;
                        } else {
                            i5++;
                            str2 = str2;
                        }
                    }
                    ArrayList arrayList7 = hashMap2 != null ? (ArrayList) hashMap2.get(str2.toString()) : null;
                    if (arrayList7 != null && !arrayList7.isEmpty()) {
                        arrayList6.addAll(arrayList7);
                        int size4 = arrayList7.size();
                        while (i < size4) {
                            TLRPC.Document document6 = (TLRPC.Document) arrayList7.get(i);
                            i24Var.w.put(document6.id, document6);
                            i++;
                        }
                        i24Var.f.put(arrayList6, j24Var2.O);
                        i24Var.h.add(arrayList6);
                    }
                }
                runnable2.run();
                break;
            case 5:
                Runnable runnable3 = (Runnable) obj;
                j24 j24Var3 = i24Var.x;
                o24 o24Var2 = j24Var3.R;
                int i8 = o24Var2.d1;
                HashMap hashMap3 = ls6.d0(o24Var2.d1).e0;
                if (hashMap3 != null && !hashMap3.isEmpty() && i24Var.a.length() > 1) {
                    String[] F0 = hl.F0();
                    if (!Arrays.equals(o24Var2.X0, F0)) {
                        ls6.d0(i8).O(F0, false);
                    }
                    o24Var2.X0 = F0;
                    ls6.d0(i8).W(o24Var2.X0, j24Var3.O, true, new fu2((Object) i24Var, (Object) hashMap3, (Object) runnable3, (byte) 10), false);
                    break;
                } else {
                    runnable3.run();
                    break;
                }
                break;
            case 6:
                Runnable runnable4 = (Runnable) obj;
                HashMap hashMap4 = i24Var.d;
                HashMap hashMap5 = i24Var.e;
                ArrayList arrayList8 = i24Var.c;
                j24 j24Var4 = i24Var.x;
                o24 o24Var3 = j24Var4.R;
                ArrayList t0 = ls6.d0(o24Var3.d1).t0(0);
                int i9 = o24Var3.d1;
                uc7.s1(i9).w0(t0);
                int size5 = t0.size();
                for (int i10 = 0; i10 < size5; i10++) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) t0.get(i10);
                    int y13 = hl.y1(tL_messages_stickerSet.set.title, j24Var4.O);
                    if (y13 < 0) {
                        String str3 = tL_messages_stickerSet.set.short_name;
                        if (str3 != null && (y12 = hl.y1(str3, j24Var4.O)) >= 0 && (y12 == 0 || tL_messages_stickerSet.set.short_name.charAt(y12 - 1) == ' ')) {
                            arrayList8.add(tL_messages_stickerSet);
                            hashMap4.put(tL_messages_stickerSet, Boolean.TRUE);
                        }
                    } else if (y13 == 0 || tL_messages_stickerSet.set.title.charAt(y13 - 1) == ' ') {
                        arrayList8.add(tL_messages_stickerSet);
                        hashMap5.put(tL_messages_stickerSet, Integer.valueOf(y13));
                    }
                }
                ArrayList t02 = ls6.d0(i9).t0(3);
                uc7.s1(i9).w0(t02);
                int size6 = t02.size();
                while (i < size6) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) t02.get(i);
                    int y14 = hl.y1(tL_messages_stickerSet2.set.title, j24Var4.O);
                    if (y14 < 0) {
                        String str4 = tL_messages_stickerSet2.set.short_name;
                        if (str4 != null && (y1 = hl.y1(str4, j24Var4.O)) >= 0 && (y1 == 0 || tL_messages_stickerSet2.set.short_name.charAt(y1 - 1) == ' ')) {
                            arrayList8.add(tL_messages_stickerSet2);
                            hashMap4.put(tL_messages_stickerSet2, Boolean.TRUE);
                        }
                    } else if (y14 == 0 || tL_messages_stickerSet2.set.title.charAt(y14 - 1) == ' ') {
                        arrayList8.add(tL_messages_stickerSet2);
                        hashMap5.put(tL_messages_stickerSet2, Integer.valueOf(y14));
                    }
                    i++;
                }
                runnable4.run();
                break;
            default:
                Runnable runnable5 = (Runnable) obj;
                j24 j24Var5 = i24Var.x;
                if (pv3.d(j24Var5.O)) {
                    TLRPC.TL_messages_getStickers tL_messages_getStickers = new TLRPC.TL_messages_getStickers();
                    tL_messages_getStickers.emoticon = i24Var.a;
                    tL_messages_getStickers.hash = 0L;
                    j24Var5.M = ConnectionsManager.getInstance(j24Var5.R.d1).sendRequest(tL_messages_getStickers, new fn0((Object) i24Var, (Object) tL_messages_getStickers, (Object) runnable5, (byte) 24));
                    break;
                } else {
                    runnable5.run();
                    break;
                }
        }
    }
}
