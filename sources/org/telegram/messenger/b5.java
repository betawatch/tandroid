package org.telegram.messenger;

import android.text.TextUtils;
import j$.util.concurrent.ConcurrentHashMap;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class b5 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ f1 e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;

    public /* synthetic */ b5(i5 i5Var, int i10, ArrayList arrayList, ArrayList arrayList2, a0.h hVar, boolean z10) {
        this.e = i5Var;
        this.b = i10;
        this.c = arrayList;
        this.f = arrayList2;
        this.h = hVar;
        this.d = z10;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0127 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00f1  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i10;
        long j10;
        HashMap hashMap;
        HashMap hashMap2;
        ArrayList arrayList;
        a0.h hVar;
        int i11;
        ConcurrentHashMap concurrentHashMap;
        int i12;
        long p5;
        int i13;
        boolean z10;
        int i14;
        TLRPC.InputMedia inputMedia;
        TLRPC.InputMedia inputMedia2;
        int i15 = this.a;
        Object obj = this.h;
        Object obj2 = this.f;
        f1 f1Var = this.e;
        int i16 = 1;
        switch (i15) {
            case 0:
                long j11 = 0;
                final i5 i5Var = (i5) f1Var;
                ArrayList arrayList2 = (ArrayList) obj2;
                a0.h hVar2 = (a0.h) obj;
                ArrayList arrayList3 = i5Var.x;
                if (v2.a) {
                    f8.b("done loading contacts");
                }
                int i17 = this.b;
                ArrayList arrayList4 = this.c;
                if (i17 == 1) {
                    if (arrayList4.isEmpty()) {
                        j10 = 1000;
                    } else {
                        j10 = 1000;
                        if (Math.abs((System.currentTimeMillis() / 1000) - i5Var.getUserConfig().r) < 86400) {
                            i10 = i17;
                        }
                    }
                    ArrayList arrayList5 = new ArrayList(arrayList4);
                    Collections.sort(arrayList5, new a4.d(16));
                    int size = arrayList5.size();
                    int i18 = -1;
                    while (i18 < size) {
                        if (i18 == -1) {
                            i12 = i17;
                            p5 = ui.p(j11, i5Var.getUserConfig().h);
                        } else {
                            i12 = i17;
                            p5 = ui.p(j11, ((TLRPC.TL_contact) arrayList5.get(i18)).user_id);
                        }
                        j11 = p5;
                        i18++;
                        i17 = i12;
                    }
                    i10 = i17;
                    i5Var.A(j11, false);
                    if (arrayList4.isEmpty()) {
                        i0.g3(new a5(i5Var, 8));
                        break;
                    }
                } else {
                    i10 = i17;
                    j10 = 1000;
                }
                if (i10 == 0) {
                    i5Var.getUserConfig().r = (int) (System.currentTimeMillis() / j10);
                    i5Var.getUserConfig().v(false);
                }
                int i19 = 0;
                final boolean z11 = false;
                while (i19 < arrayList4.size()) {
                    TLRPC.TL_contact tL_contact = (TLRPC.TL_contact) arrayList4.get(i19);
                    if (vp.r1(i5Var.currentAccount).Z1(Long.valueOf(tL_contact.user_id)) == null && tL_contact.user_id != i5Var.getUserConfig().e()) {
                        arrayList4.remove(i19);
                        i19--;
                        z11 = true;
                    }
                    i19++;
                }
                int i20 = i10;
                if (i20 != 1) {
                    i5Var.getMessagesStorage().m1(arrayList2, null, true, true);
                    i5Var.getMessagesStorage().c1(arrayList4, i20 != 2);
                }
                Collator u10 = i5.u();
                Collections.sort(arrayList4, new w4(hVar2, u10, i16));
                ConcurrentHashMap concurrentHashMap2 = new ConcurrentHashMap(20, 1.0f, 2);
                final HashMap hashMap3 = new HashMap();
                final HashMap hashMap4 = new HashMap();
                final ArrayList arrayList6 = new ArrayList();
                final ArrayList arrayList7 = new ArrayList();
                if (i5Var.r) {
                    hashMap = null;
                    hashMap2 = null;
                } else {
                    hashMap = new HashMap();
                    hashMap2 = new HashMap();
                }
                int i21 = 0;
                while (i21 < arrayList4.size()) {
                    TLRPC.TL_contact tL_contact2 = (TLRPC.TL_contact) arrayList4.get(i21);
                    int i22 = i21;
                    int i23 = i20;
                    TLRPC.User user = (TLRPC.User) hVar2.f(tL_contact2.user_id);
                    if (user == null) {
                        arrayList = arrayList4;
                        hVar = hVar2;
                        concurrentHashMap = concurrentHashMap2;
                    } else {
                        arrayList = arrayList4;
                        concurrentHashMap2.put(Long.valueOf(tL_contact2.user_id), tL_contact2);
                        if (hashMap == null || TextUtils.isEmpty(user.phone)) {
                            hVar = hVar2;
                            i11 = 0;
                        } else {
                            hashMap.put(user.phone, tL_contact2);
                            hVar = hVar2;
                            i11 = 0;
                            hashMap2.put(user.phone.substring(Math.max(0, r3.length() - 7)), tL_contact2);
                        }
                        String j12 = h20.j(user, true);
                        concurrentHashMap = concurrentHashMap2;
                        if (j12.length() > 1) {
                            j12 = j12.substring(i11, 1);
                        }
                        String upperCase = j12.length() == 0 ? "#" : j12.toUpperCase();
                        String str = (String) i5Var.E.get(upperCase);
                        if (str != null) {
                            upperCase = str;
                        }
                        ArrayList arrayList8 = (ArrayList) hashMap3.get(upperCase);
                        if (arrayList8 == null) {
                            arrayList8 = new ArrayList();
                            hashMap3.put(upperCase, arrayList8);
                            arrayList6.add(upperCase);
                        }
                        arrayList8.add(tL_contact2);
                        if (user.mutual_contact) {
                            ArrayList arrayList9 = (ArrayList) hashMap4.get(upperCase);
                            if (arrayList9 == null) {
                                arrayList9 = new ArrayList();
                                hashMap4.put(upperCase, arrayList9);
                                arrayList7.add(upperCase);
                            }
                            arrayList9.add(tL_contact2);
                        }
                    }
                    i21 = i22 + 1;
                    hVar2 = hVar;
                    arrayList4 = arrayList;
                    concurrentHashMap2 = concurrentHashMap;
                    i20 = i23;
                }
                final int i24 = i20;
                final ArrayList arrayList10 = arrayList4;
                final ConcurrentHashMap concurrentHashMap3 = concurrentHashMap2;
                Collections.sort(arrayList6, new x4(u10, 4));
                Collections.sort(arrayList7, new x4(u10, 5));
                final boolean z12 = this.d;
                i0.g3(new Runnable() { // from class: org.telegram.messenger.c5
                    @Override // java.lang.Runnable
                    public final void run() {
                        i5 i5Var2 = i5.this;
                        ArrayList arrayList11 = arrayList10;
                        ConcurrentHashMap concurrentHashMap4 = concurrentHashMap3;
                        HashMap hashMap5 = hashMap3;
                        HashMap hashMap6 = hashMap4;
                        ArrayList arrayList12 = arrayList6;
                        ArrayList arrayList13 = arrayList7;
                        int i25 = i24;
                        boolean z13 = z12;
                        boolean z14 = z11;
                        i5Var2.e0 = arrayList11;
                        i5Var2.f0 = concurrentHashMap4;
                        i5Var2.g0 = hashMap5;
                        i5Var2.i0 = hashMap6;
                        i5Var2.h0 = arrayList12;
                        i5Var2.j0 = arrayList13;
                        i5Var2.n = true;
                        if (i25 != 2) {
                            synchronized (i5Var2.c) {
                                i5Var2.b = false;
                            }
                        }
                        Utilities.h.c(new z4(i5Var2, new ArrayList(i5Var2.e0), 0));
                        i5Var2.N();
                        i5Var2.getNotificationCenter().k(zs.O, new Object[0]);
                        if (i25 == 1 || z13) {
                            i5Var2.J(false);
                        } else {
                            i5Var2.L();
                        }
                        if (z14) {
                            i5Var2.A(0L, false);
                        }
                    }
                });
                if (!arrayList3.isEmpty() && i5Var.h && i5Var.r) {
                    i5Var.c(arrayList3, null, null, null);
                    arrayList3.clear();
                }
                if (hashMap != null) {
                    i0.g3(new d5(i5Var, hashMap, hashMap2, 0));
                    break;
                } else {
                    i5Var.h = true;
                    break;
                }
                break;
            default:
                qz qzVar = (qz) f1Var;
                TLObject tLObject = (TLObject) obj2;
                cz czVar = (cz) obj;
                boolean z13 = tLObject instanceof TLRPC.TL_messages_sendMultiMedia;
                int i25 = this.b;
                ArrayList arrayList11 = this.c;
                boolean z14 = this.d;
                if (z13) {
                    TLRPC.TL_messages_sendMultiMedia tL_messages_sendMultiMedia = (TLRPC.TL_messages_sendMultiMedia) tLObject;
                    int size2 = tL_messages_sendMultiMedia.multi_media.size();
                    z10 = false;
                    for (int i26 = 0; i26 < size2; i26++) {
                        if (i25 < 0 ? czVar.y.get(i26) != null : i25 == i26) {
                            qzVar.i0(((jj) arrayList11.get(i26)).f1(), z14);
                            TLRPC.TL_inputSingleMedia tL_inputSingleMedia = tL_messages_sendMultiMedia.multi_media.get(i26);
                            TLRPC.InputMedia inputMedia3 = tL_inputSingleMedia.media;
                            if (inputMedia3 instanceof TLRPC.TL_inputMediaPhoto) {
                                tL_inputSingleMedia.media = (TLRPC.InputMedia) czVar.A.get(i26);
                            } else if (inputMedia3 instanceof TLRPC.TL_inputMediaDocument) {
                                tL_inputSingleMedia.media = (TLRPC.InputMedia) czVar.A.get(i26);
                            }
                            czVar.o = (x20) czVar.w.get(i26);
                            czVar.l = (String) czVar.v.get(i26);
                            TLRPC.PhotoSize photoSize = (TLRPC.PhotoSize) czVar.u.get(i26);
                            czVar.g = photoSize;
                            czVar.p = true;
                            if (tL_inputSingleMedia.media.file == null || photoSize != null) {
                                z10 = true;
                            }
                            qzVar.M(czVar, i26);
                        }
                    }
                    i13 = 0;
                } else {
                    i13 = 0;
                    if (tLObject instanceof TLRPC.TL_messages_sendMedia) {
                        TLRPC.TL_inputMediaPaidMedia tL_inputMediaPaidMedia = (TLRPC.TL_inputMediaPaidMedia) ((TLRPC.TL_messages_sendMedia) tLObject).media;
                        int size3 = tL_inputMediaPaidMedia.extended_media.size();
                        z10 = false;
                        for (0; i14 < size3; i14 + 1) {
                            if (i25 >= 0) {
                                i14 = i25 != i14 ? i14 + 1 : 0;
                                qzVar.i0(((jj) arrayList11.get(i14)).f1(), z14);
                                inputMedia = tL_inputMediaPaidMedia.extended_media.get(i14);
                                if (inputMedia instanceof TLRPC.TL_inputMediaPhoto) {
                                    if (inputMedia instanceof TLRPC.TL_inputMediaDocument) {
                                        ArrayList<TLRPC.InputMedia> arrayList12 = tL_inputMediaPaidMedia.extended_media;
                                        inputMedia2 = (TLRPC.InputMedia) czVar.A.get(i14);
                                        arrayList12.set(i14, inputMedia2);
                                    }
                                    czVar.o = (x20) czVar.w.get(i14);
                                    czVar.l = (String) czVar.v.get(i14);
                                    TLRPC.PhotoSize photoSize2 = (TLRPC.PhotoSize) czVar.u.get(i14);
                                    czVar.g = photoSize2;
                                    czVar.p = true;
                                    if (inputMedia.file != null || photoSize2 != null) {
                                        z10 = true;
                                    }
                                    qzVar.M(czVar, i14);
                                } else {
                                    ArrayList<TLRPC.InputMedia> arrayList13 = tL_inputMediaPaidMedia.extended_media;
                                    inputMedia2 = (TLRPC.InputMedia) czVar.A.get(i14);
                                    arrayList13.set(i14, inputMedia2);
                                }
                                inputMedia = inputMedia2;
                                czVar.o = (x20) czVar.w.get(i14);
                                czVar.l = (String) czVar.v.get(i14);
                                TLRPC.PhotoSize photoSize22 = (TLRPC.PhotoSize) czVar.u.get(i14);
                                czVar.g = photoSize22;
                                czVar.p = true;
                                if (inputMedia.file != null) {
                                }
                                z10 = true;
                                qzVar.M(czVar, i14);
                            } else {
                                if (czVar.y.get(i14) == null) {
                                }
                                qzVar.i0(((jj) arrayList11.get(i14)).f1(), z14);
                                inputMedia = tL_inputMediaPaidMedia.extended_media.get(i14);
                                if (inputMedia instanceof TLRPC.TL_inputMediaPhoto) {
                                }
                                inputMedia = inputMedia2;
                                czVar.o = (x20) czVar.w.get(i14);
                                czVar.l = (String) czVar.v.get(i14);
                                TLRPC.PhotoSize photoSize222 = (TLRPC.PhotoSize) czVar.u.get(i14);
                                czVar.g = photoSize222;
                                czVar.p = true;
                                if (inputMedia.file != null) {
                                }
                                z10 = true;
                                qzVar.M(czVar, i14);
                            }
                        }
                    } else {
                        z10 = false;
                    }
                }
                if (!z10) {
                    for (int i27 = i13; i27 < arrayList11.size(); i27++) {
                        TLRPC.Message message = ((jj) arrayList11.get(i27)).k;
                        qzVar.getMessagesStorage().N0(z14 ? 1 : 0, message);
                        message.send_state = 2;
                        message.errorAllowedPriceStars = 0L;
                        message.errorNewPriceStars = 0L;
                        zs notificationCenter = qzVar.getNotificationCenter();
                        Object[] objArr = new Object[1];
                        objArr[i13] = Integer.valueOf(message.id);
                        notificationCenter.k(23, objArr);
                        qzVar.d0(message.id);
                        qzVar.i0(message.id, z14);
                    }
                    break;
                }
                break;
        }
    }

    public /* synthetic */ b5(qz qzVar, TLObject tLObject, int i10, cz czVar, ArrayList arrayList, boolean z10) {
        this.e = qzVar;
        this.f = tLObject;
        this.b = i10;
        this.h = czVar;
        this.c = arrayList;
        this.d = z10;
    }
}
