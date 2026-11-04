package org.telegram.messenger;

import android.text.TextUtils;
import j$.util.concurrent.ConcurrentHashMap;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class z4 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ c1 e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;

    public /* synthetic */ z4(g5 g5Var, int i3, ArrayList arrayList, ArrayList arrayList2, a0.h hVar, boolean z10) {
        this.e = g5Var;
        this.b = i3;
        this.c = arrayList;
        this.f = arrayList2;
        this.h = hVar;
        this.d = z10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:71:0x01b2, code lost:
    
        if (java.lang.Math.abs((java.lang.System.currentTimeMillis() / 1000) - r7.getUserConfig().r) >= 86400) goto L68;
     */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0127 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00f1  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        long j10;
        HashMap hashMap;
        HashMap hashMap2;
        int i3;
        a0.h hVar;
        int i10;
        ConcurrentHashMap concurrentHashMap;
        int i11;
        boolean z10;
        int i12;
        TLRPC.InputMedia inputMedia;
        TLRPC.InputMedia inputMedia2;
        int i13 = this.a;
        Object obj = this.h;
        Object obj2 = this.f;
        c1 c1Var = this.e;
        int i14 = 1;
        switch (i13) {
            case 0:
                long j11 = 0;
                final g5 g5Var = (g5) c1Var;
                ArrayList arrayList = (ArrayList) obj2;
                a0.h hVar2 = (a0.h) obj;
                ArrayList arrayList2 = g5Var.x;
                if (r2.a) {
                    a8.b("done loading contacts");
                }
                int i15 = this.b;
                final ArrayList arrayList3 = this.c;
                if (i15 == 1) {
                    if (!arrayList3.isEmpty()) {
                        j10 = 1000;
                        break;
                    } else {
                        j10 = 1000;
                    }
                    ArrayList arrayList4 = new ArrayList(arrayList3);
                    Collections.sort(arrayList4, new o0.a(4));
                    int size = arrayList4.size();
                    int i16 = -1;
                    int i17 = -1;
                    while (i17 < size) {
                        j11 = i17 == i16 ? li.p(j11, g5Var.getUserConfig().h) : li.p(j11, ((TLRPC.TL_contact) arrayList4.get(i17)).user_id);
                        i17++;
                        i16 = -1;
                    }
                    g5Var.A(j11, false);
                    if (arrayList3.isEmpty()) {
                        g0.h3(new x4(g5Var, 8));
                        break;
                    }
                } else {
                    j10 = 1000;
                }
                if (i15 == 0) {
                    g5Var.getUserConfig().r = (int) (System.currentTimeMillis() / j10);
                    g5Var.getUserConfig().v(false);
                }
                int i18 = 0;
                final boolean z11 = false;
                while (i18 < arrayList3.size()) {
                    TLRPC.TL_contact tL_contact = (TLRPC.TL_contact) arrayList3.get(i18);
                    if (hp.s1(g5Var.currentAccount).a2(Long.valueOf(tL_contact.user_id)) == null && tL_contact.user_id != g5Var.getUserConfig().e()) {
                        arrayList3.remove(i18);
                        i18--;
                        z11 = true;
                    }
                    i18++;
                }
                if (i15 != 1) {
                    g5Var.getMessagesStorage().m1(arrayList, null, true, true);
                    g5Var.getMessagesStorage().c1(arrayList3, i15 != 2);
                }
                Collator u10 = g5.u();
                Collections.sort(arrayList3, new t4(hVar2, u10, i14));
                ConcurrentHashMap concurrentHashMap2 = new ConcurrentHashMap(20, 1.0f, 2);
                final HashMap hashMap3 = new HashMap();
                final HashMap hashMap4 = new HashMap();
                final ArrayList arrayList5 = new ArrayList();
                final ArrayList arrayList6 = new ArrayList();
                if (g5Var.r) {
                    hashMap = null;
                    hashMap2 = null;
                } else {
                    hashMap = new HashMap();
                    hashMap2 = new HashMap();
                }
                int i19 = 0;
                while (i19 < arrayList3.size()) {
                    TLRPC.TL_contact tL_contact2 = (TLRPC.TL_contact) arrayList3.get(i19);
                    ArrayList arrayList7 = arrayList2;
                    int i20 = i19;
                    TLRPC.User user = (TLRPC.User) hVar2.f(tL_contact2.user_id);
                    if (user == null) {
                        i3 = i15;
                        hVar = hVar2;
                        concurrentHashMap = concurrentHashMap2;
                    } else {
                        i3 = i15;
                        a0.h hVar3 = hVar2;
                        concurrentHashMap2.put(Long.valueOf(tL_contact2.user_id), tL_contact2);
                        if (hashMap == null || TextUtils.isEmpty(user.phone)) {
                            hVar = hVar3;
                            i10 = 0;
                        } else {
                            hashMap.put(user.phone, tL_contact2);
                            hVar = hVar3;
                            i10 = 0;
                            hashMap2.put(user.phone.substring(Math.max(0, r4.length() - 7)), tL_contact2);
                        }
                        String j12 = l10.j(user, true);
                        concurrentHashMap = concurrentHashMap2;
                        if (j12.length() > 1) {
                            j12 = j12.substring(i10, 1);
                        }
                        String upperCase = j12.length() == 0 ? "#" : j12.toUpperCase();
                        String str = (String) g5Var.F.get(upperCase);
                        if (str != null) {
                            upperCase = str;
                        }
                        ArrayList arrayList8 = (ArrayList) hashMap3.get(upperCase);
                        if (arrayList8 == null) {
                            arrayList8 = new ArrayList();
                            hashMap3.put(upperCase, arrayList8);
                            arrayList5.add(upperCase);
                        }
                        arrayList8.add(tL_contact2);
                        if (user.mutual_contact) {
                            ArrayList arrayList9 = (ArrayList) hashMap4.get(upperCase);
                            if (arrayList9 == null) {
                                arrayList9 = new ArrayList();
                                hashMap4.put(upperCase, arrayList9);
                                arrayList6.add(upperCase);
                            }
                            arrayList9.add(tL_contact2);
                        }
                    }
                    i19 = i20 + 1;
                    hVar2 = hVar;
                    concurrentHashMap2 = concurrentHashMap;
                    i15 = i3;
                    arrayList2 = arrayList7;
                }
                ArrayList arrayList10 = arrayList2;
                final int i21 = i15;
                final ConcurrentHashMap concurrentHashMap3 = concurrentHashMap2;
                Collections.sort(arrayList5, new u4(u10, 4));
                Collections.sort(arrayList6, new u4(u10, 5));
                final boolean z12 = this.d;
                g0.h3(new Runnable() { // from class: org.telegram.messenger.a5
                    @Override // java.lang.Runnable
                    public final void run() {
                        g5 g5Var2 = g5.this;
                        ArrayList arrayList11 = arrayList3;
                        ConcurrentHashMap concurrentHashMap4 = concurrentHashMap3;
                        HashMap hashMap5 = hashMap3;
                        HashMap hashMap6 = hashMap4;
                        ArrayList arrayList12 = arrayList5;
                        ArrayList arrayList13 = arrayList6;
                        int i22 = i21;
                        boolean z13 = z12;
                        boolean z14 = z11;
                        g5Var2.f0 = arrayList11;
                        g5Var2.g0 = concurrentHashMap4;
                        g5Var2.h0 = hashMap5;
                        g5Var2.j0 = hashMap6;
                        g5Var2.i0 = arrayList12;
                        g5Var2.k0 = arrayList13;
                        g5Var2.n = true;
                        if (i22 != 2) {
                            synchronized (g5Var2.c) {
                                g5Var2.b = false;
                            }
                        }
                        Utilities.h.c(new w4(g5Var2, new ArrayList(g5Var2.f0), 0));
                        g5Var2.N();
                        g5Var2.getNotificationCenter().k(hs.O, new Object[0]);
                        if (i22 == 1 || z13) {
                            g5Var2.J(false);
                        } else {
                            g5Var2.L();
                        }
                        if (z14) {
                            g5Var2.A(0L, false);
                        }
                    }
                });
                if (!arrayList10.isEmpty() && g5Var.h && g5Var.r) {
                    g5Var.c(arrayList10, null, null, null);
                    arrayList10.clear();
                }
                if (hashMap != null) {
                    g0.h3(new b5(g5Var, hashMap, hashMap2, 0));
                    break;
                } else {
                    g5Var.h = true;
                    break;
                }
                break;
            default:
                yy yyVar = (yy) c1Var;
                TLObject tLObject = (TLObject) obj2;
                ky kyVar = (ky) obj;
                boolean z13 = tLObject instanceof TLRPC.TL_messages_sendMultiMedia;
                int i22 = this.b;
                ArrayList arrayList11 = this.c;
                boolean z14 = this.d;
                if (z13) {
                    TLRPC.TL_messages_sendMultiMedia tL_messages_sendMultiMedia = (TLRPC.TL_messages_sendMultiMedia) tLObject;
                    int size2 = tL_messages_sendMultiMedia.multi_media.size();
                    z10 = false;
                    for (int i23 = 0; i23 < size2; i23++) {
                        if (i22 < 0 ? kyVar.y.get(i23) != null : i22 == i23) {
                            yyVar.i0(((zi) arrayList11.get(i23)).f1(), z14);
                            TLRPC.TL_inputSingleMedia tL_inputSingleMedia = tL_messages_sendMultiMedia.multi_media.get(i23);
                            TLRPC.InputMedia inputMedia3 = tL_inputSingleMedia.media;
                            if (inputMedia3 instanceof TLRPC.TL_inputMediaPhoto) {
                                tL_inputSingleMedia.media = (TLRPC.InputMedia) kyVar.A.get(i23);
                            } else if (inputMedia3 instanceof TLRPC.TL_inputMediaDocument) {
                                tL_inputSingleMedia.media = (TLRPC.InputMedia) kyVar.A.get(i23);
                            }
                            kyVar.o = (b20) kyVar.w.get(i23);
                            kyVar.l = (String) kyVar.v.get(i23);
                            TLRPC.PhotoSize photoSize = (TLRPC.PhotoSize) kyVar.u.get(i23);
                            kyVar.g = photoSize;
                            kyVar.p = true;
                            if (tL_inputSingleMedia.media.file == null || photoSize != null) {
                                z10 = true;
                            }
                            yyVar.M(kyVar, i23);
                        }
                    }
                    i11 = 0;
                } else {
                    i11 = 0;
                    if (tLObject instanceof TLRPC.TL_messages_sendMedia) {
                        TLRPC.TL_inputMediaPaidMedia tL_inputMediaPaidMedia = (TLRPC.TL_inputMediaPaidMedia) ((TLRPC.TL_messages_sendMedia) tLObject).media;
                        int size3 = tL_inputMediaPaidMedia.extended_media.size();
                        z10 = false;
                        for (0; i12 < size3; i12 + 1) {
                            if (i22 >= 0) {
                                i12 = i22 != i12 ? i12 + 1 : 0;
                                yyVar.i0(((zi) arrayList11.get(i12)).f1(), z14);
                                inputMedia = tL_inputMediaPaidMedia.extended_media.get(i12);
                                if (inputMedia instanceof TLRPC.TL_inputMediaPhoto) {
                                    if (inputMedia instanceof TLRPC.TL_inputMediaDocument) {
                                        ArrayList<TLRPC.InputMedia> arrayList12 = tL_inputMediaPaidMedia.extended_media;
                                        inputMedia2 = (TLRPC.InputMedia) kyVar.A.get(i12);
                                        arrayList12.set(i12, inputMedia2);
                                    }
                                    kyVar.o = (b20) kyVar.w.get(i12);
                                    kyVar.l = (String) kyVar.v.get(i12);
                                    TLRPC.PhotoSize photoSize2 = (TLRPC.PhotoSize) kyVar.u.get(i12);
                                    kyVar.g = photoSize2;
                                    kyVar.p = true;
                                    if (inputMedia.file != null || photoSize2 != null) {
                                        z10 = true;
                                    }
                                    yyVar.M(kyVar, i12);
                                } else {
                                    ArrayList<TLRPC.InputMedia> arrayList13 = tL_inputMediaPaidMedia.extended_media;
                                    inputMedia2 = (TLRPC.InputMedia) kyVar.A.get(i12);
                                    arrayList13.set(i12, inputMedia2);
                                }
                                inputMedia = inputMedia2;
                                kyVar.o = (b20) kyVar.w.get(i12);
                                kyVar.l = (String) kyVar.v.get(i12);
                                TLRPC.PhotoSize photoSize22 = (TLRPC.PhotoSize) kyVar.u.get(i12);
                                kyVar.g = photoSize22;
                                kyVar.p = true;
                                if (inputMedia.file != null) {
                                }
                                z10 = true;
                                yyVar.M(kyVar, i12);
                            } else {
                                if (kyVar.y.get(i12) == null) {
                                }
                                yyVar.i0(((zi) arrayList11.get(i12)).f1(), z14);
                                inputMedia = tL_inputMediaPaidMedia.extended_media.get(i12);
                                if (inputMedia instanceof TLRPC.TL_inputMediaPhoto) {
                                }
                                inputMedia = inputMedia2;
                                kyVar.o = (b20) kyVar.w.get(i12);
                                kyVar.l = (String) kyVar.v.get(i12);
                                TLRPC.PhotoSize photoSize222 = (TLRPC.PhotoSize) kyVar.u.get(i12);
                                kyVar.g = photoSize222;
                                kyVar.p = true;
                                if (inputMedia.file != null) {
                                }
                                z10 = true;
                                yyVar.M(kyVar, i12);
                            }
                        }
                    } else {
                        z10 = false;
                    }
                }
                if (!z10) {
                    for (int i24 = i11; i24 < arrayList11.size(); i24++) {
                        TLRPC.Message message = ((zi) arrayList11.get(i24)).k;
                        yyVar.getMessagesStorage().N0(z14 ? 1 : 0, message);
                        message.send_state = 2;
                        message.errorAllowedPriceStars = 0L;
                        message.errorNewPriceStars = 0L;
                        hs notificationCenter = yyVar.getNotificationCenter();
                        Object[] objArr = new Object[1];
                        objArr[i11] = Integer.valueOf(message.id);
                        notificationCenter.k(23, objArr);
                        yyVar.d0(message.id);
                        yyVar.i0(message.id, z14);
                    }
                    break;
                }
                break;
        }
    }

    public /* synthetic */ z4(yy yyVar, TLObject tLObject, int i3, ky kyVar, ArrayList arrayList, boolean z10) {
        this.e = yyVar;
        this.f = tLObject;
        this.b = i3;
        this.h = kyVar;
        this.c = arrayList;
        this.d = z10;
    }
}
