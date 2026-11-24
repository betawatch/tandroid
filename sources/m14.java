// default package

import android.text.TextUtils;
import android.util.LongSparseArray;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class m14 implements p8c {
    public final /* synthetic */ byte a;
    public final /* synthetic */ n14 b;

    public /* synthetic */ m14(n14 n14Var, byte b) {
        this.a = b;
        this.b = n14Var;
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
    @Override // p8c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Object obj) {
        LongSparseArray longSparseArray;
        int y1;
        int y12;
        byte b = this.a;
        int i = 0;
        n14 n14Var = this.b;
        switch (b) {
            case 0:
                n14Var.a((Runnable) obj, true);
                break;
            case 1:
                Runnable runnable = (Runnable) obj;
                ArrayList arrayList = n14Var.s;
                LongSparseArray longSparseArray2 = n14Var.w;
                o14 o14Var = n14Var.x;
                t14 t14Var = o14Var.R;
                HashMap hashMap = hq6.d0(t14Var.d1).e0;
                HashSet hashSet = new HashSet();
                ArrayList arrayList2 = new ArrayList();
                for (ArrayList arrayList3 : hashMap.values()) {
                    int size = arrayList3.size();
                    int i2 = 0;
                    while (i2 < size) {
                        Object obj2 = arrayList3.get(i2);
                        i2++;
                        TLRPC.Document document = (TLRPC.Document) obj2;
                        if (!hashSet.contains(Long.valueOf(document.id)) && k27.W3(document)) {
                            hashSet.add(Long.valueOf(document.id));
                            arrayList2.add(document);
                            longSparseArray2.put(document.id, document);
                        }
                    }
                }
                ArrayList arrayList4 = hq6.d0(t14Var.d1).t0[0];
                int size2 = arrayList4.size();
                int i3 = 0;
                while (i3 < size2) {
                    Object obj3 = arrayList4.get(i3);
                    i3++;
                    TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) obj3;
                    TLRPC.Document document2 = stickerSetCovered.cover;
                    if (document2 != null && !hashSet.contains(Long.valueOf(document2.id)) && k27.W3(stickerSetCovered.cover)) {
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
                            if (hashSet.contains(Long.valueOf(document5.id)) || !k27.W3(document5)) {
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
                    n14Var.f.put(arrayList, o14Var.O);
                    n14Var.h.add(arrayList);
                }
                runnable.run();
                break;
            case 2:
                n14Var.a((Runnable) obj, false);
                break;
            case 3:
                hq6.d0(n14Var.x.R.d1).a2(false, n14Var.a, new pz1(n14Var, (Runnable) obj, (byte) 19));
                break;
            case 4:
                Runnable runnable2 = (Runnable) obj;
                o14 o14Var2 = n14Var.x;
                ArrayList arrayList6 = n14Var.s;
                if (n14Var.a.length() <= 14) {
                    HashMap hashMap2 = hq6.d0(o14Var2.R.d1).e0;
                    String str = n14Var.a;
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
                            n14Var.w.put(document6.id, document6);
                            i++;
                        }
                        n14Var.f.put(arrayList6, o14Var2.O);
                        n14Var.h.add(arrayList6);
                    }
                }
                runnable2.run();
                break;
            case 5:
                Runnable runnable3 = (Runnable) obj;
                o14 o14Var3 = n14Var.x;
                t14 t14Var2 = o14Var3.R;
                int i8 = t14Var2.d1;
                HashMap hashMap3 = hq6.d0(t14Var2.d1).e0;
                if (hashMap3 != null && !hashMap3.isEmpty() && n14Var.a.length() > 1) {
                    String[] F0 = gl.F0();
                    if (!Arrays.equals(t14Var2.X0, F0)) {
                        hq6.d0(i8).O(F0, false);
                    }
                    t14Var2.X0 = F0;
                    hq6.d0(i8).W(t14Var2.X0, o14Var3.O, true, new lt2((Object) n14Var, (Object) hashMap3, (Object) runnable3, (byte) 10), false);
                    break;
                } else {
                    runnable3.run();
                    break;
                }
                break;
            case 6:
                Runnable runnable4 = (Runnable) obj;
                HashMap hashMap4 = n14Var.d;
                HashMap hashMap5 = n14Var.e;
                ArrayList arrayList8 = n14Var.c;
                o14 o14Var4 = n14Var.x;
                t14 t14Var3 = o14Var4.R;
                ArrayList t0 = hq6.d0(t14Var3.d1).t0(0);
                int i9 = t14Var3.d1;
                na7.q1(i9).u0(t0);
                int size5 = t0.size();
                for (int i10 = 0; i10 < size5; i10++) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) t0.get(i10);
                    int y13 = gl.y1(tL_messages_stickerSet.set.title, o14Var4.O);
                    if (y13 < 0) {
                        String str3 = tL_messages_stickerSet.set.short_name;
                        if (str3 != null && (y12 = gl.y1(str3, o14Var4.O)) >= 0 && (y12 == 0 || tL_messages_stickerSet.set.short_name.charAt(y12 - 1) == ' ')) {
                            arrayList8.add(tL_messages_stickerSet);
                            hashMap4.put(tL_messages_stickerSet, Boolean.TRUE);
                        }
                    } else if (y13 == 0 || tL_messages_stickerSet.set.title.charAt(y13 - 1) == ' ') {
                        arrayList8.add(tL_messages_stickerSet);
                        hashMap5.put(tL_messages_stickerSet, Integer.valueOf(y13));
                    }
                }
                ArrayList t02 = hq6.d0(i9).t0(3);
                na7.q1(i9).u0(t02);
                int size6 = t02.size();
                while (i < size6) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) t02.get(i);
                    int y14 = gl.y1(tL_messages_stickerSet2.set.title, o14Var4.O);
                    if (y14 < 0) {
                        String str4 = tL_messages_stickerSet2.set.short_name;
                        if (str4 != null && (y1 = gl.y1(str4, o14Var4.O)) >= 0 && (y1 == 0 || tL_messages_stickerSet2.set.short_name.charAt(y1 - 1) == ' ')) {
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
                o14 o14Var5 = n14Var.x;
                if (vu3.d(o14Var5.O)) {
                    TLRPC.TL_messages_getStickers tL_messages_getStickers = new TLRPC.TL_messages_getStickers();
                    tL_messages_getStickers.emoticon = n14Var.a;
                    tL_messages_getStickers.hash = 0L;
                    o14Var5.M = ConnectionsManager.getInstance(o14Var5.R.d1).sendRequest(tL_messages_getStickers, new en0((Object) n14Var, (Object) tL_messages_getStickers, (Object) runnable5, (byte) 24));
                    break;
                } else {
                    runnable5.run();
                    break;
                }
        }
    }
}
