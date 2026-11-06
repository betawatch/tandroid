package org.telegram.messenger;

import android.text.TextUtils;
import j$.util.concurrent.ConcurrentHashMap;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public final /* synthetic */ class z4 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ c1 e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;

    public /* synthetic */ z4(g5 g5Var, int i7, ArrayList arrayList, ArrayList arrayList2, a0.h hVar, boolean z9) {
        this.e = g5Var;
        this.b = i7;
        this.c = arrayList;
        this.f = arrayList2;
        this.h = hVar;
        this.d = z9;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0127 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00f1  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i7;
        long j3;
        HashMap hashMap;
        HashMap hashMap2;
        ArrayList arrayList;
        a0.h hVar;
        int i10;
        ConcurrentHashMap concurrentHashMap;
        int i11;
        long p10;
        int i12;
        boolean z9;
        int i13;
        TLRPC.InputMedia inputMedia;
        TLRPC.InputMedia inputMedia2;
        int i14 = this.a;
        Object obj = this.h;
        Object obj2 = this.f;
        c1 c1Var = this.e;
        int i15 = 1;
        switch (i14) {
            case 0:
                long j10 = 0;
                final g5 g5Var = (g5) c1Var;
                ArrayList arrayList2 = (ArrayList) obj2;
                a0.h hVar2 = (a0.h) obj;
                ArrayList arrayList3 = g5Var.x;
                if (r2.a) {
                    a8.b("done loading contacts");
                }
                int i16 = this.b;
                ArrayList arrayList4 = this.c;
                if (i16 == 1) {
                    if (arrayList4.isEmpty()) {
                        j3 = 1000;
                    } else {
                        j3 = 1000;
                        if (Math.abs((System.currentTimeMillis() / 1000) - g5Var.getUserConfig().r) < 86400) {
                            i7 = i16;
                        }
                    }
                    ArrayList arrayList5 = new ArrayList(arrayList4);
                    Collections.sort(arrayList5, new jg.x(14));
                    int size = arrayList5.size();
                    int i17 = -1;
                    while (i17 < size) {
                        if (i17 == -1) {
                            i11 = i16;
                            p10 = ui.p(j10, g5Var.getUserConfig().h);
                        } else {
                            i11 = i16;
                            p10 = ui.p(j10, ((TLRPC.TL_contact) arrayList5.get(i17)).user_id);
                        }
                        j10 = p10;
                        i17++;
                        i16 = i11;
                    }
                    i7 = i16;
                    g5Var.A(j10, false);
                    if (arrayList4.isEmpty()) {
                        g0.h3(new x4(g5Var, 8));
                        break;
                    }
                } else {
                    i7 = i16;
                    j3 = 1000;
                }
                if (i7 == 0) {
                    g5Var.getUserConfig().r = (int) (System.currentTimeMillis() / j3);
                    g5Var.getUserConfig().v(false);
                }
                int i18 = 0;
                final boolean z10 = false;
                while (i18 < arrayList4.size()) {
                    TLRPC.TL_contact tL_contact = (TLRPC.TL_contact) arrayList4.get(i18);
                    if (qp.s1(g5Var.currentAccount).a2(Long.valueOf(tL_contact.user_id)) == null && tL_contact.user_id != g5Var.getUserConfig().e()) {
                        arrayList4.remove(i18);
                        i18--;
                        z10 = true;
                    }
                    i18++;
                }
                int i19 = i7;
                if (i19 != 1) {
                    g5Var.getMessagesStorage().m1(arrayList2, null, true, true);
                    g5Var.getMessagesStorage().c1(arrayList4, i19 != 2);
                }
                Collator u10 = g5.u();
                Collections.sort(arrayList4, new t4(hVar2, u10, i15));
                ConcurrentHashMap concurrentHashMap2 = new ConcurrentHashMap(20, 1.0f, 2);
                final HashMap hashMap3 = new HashMap();
                final HashMap hashMap4 = new HashMap();
                final ArrayList arrayList6 = new ArrayList();
                final ArrayList arrayList7 = new ArrayList();
                if (g5Var.r) {
                    hashMap = null;
                    hashMap2 = null;
                } else {
                    hashMap = new HashMap();
                    hashMap2 = new HashMap();
                }
                int i20 = 0;
                while (i20 < arrayList4.size()) {
                    TLRPC.TL_contact tL_contact2 = (TLRPC.TL_contact) arrayList4.get(i20);
                    int i21 = i20;
                    int i22 = i19;
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
                            i10 = 0;
                        } else {
                            hashMap.put(user.phone, tL_contact2);
                            hVar = hVar2;
                            i10 = 0;
                            hashMap2.put(user.phone.substring(Math.max(0, r3.length() - 7)), tL_contact2);
                        }
                        String j11 = t10.j(user, true);
                        concurrentHashMap = concurrentHashMap2;
                        if (j11.length() > 1) {
                            j11 = j11.substring(i10, 1);
                        }
                        String upperCase = j11.length() == 0 ? "#" : j11.toUpperCase();
                        String str = (String) g5Var.E.get(upperCase);
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
                    i20 = i21 + 1;
                    hVar2 = hVar;
                    arrayList4 = arrayList;
                    concurrentHashMap2 = concurrentHashMap;
                    i19 = i22;
                }
                final int i23 = i19;
                final ArrayList arrayList10 = arrayList4;
                final ConcurrentHashMap concurrentHashMap3 = concurrentHashMap2;
                Collections.sort(arrayList6, new u4(u10, 4));
                Collections.sort(arrayList7, new u4(u10, 5));
                final boolean z11 = this.d;
                g0.h3(new Runnable() { // from class: org.telegram.messenger.a5
                    @Override // java.lang.Runnable
                    public final void run() {
                        g5 g5Var2 = g5.this;
                        ArrayList arrayList11 = arrayList10;
                        ConcurrentHashMap concurrentHashMap4 = concurrentHashMap3;
                        HashMap hashMap5 = hashMap3;
                        HashMap hashMap6 = hashMap4;
                        ArrayList arrayList12 = arrayList6;
                        ArrayList arrayList13 = arrayList7;
                        int i24 = i23;
                        boolean z12 = z11;
                        boolean z13 = z10;
                        g5Var2.e0 = arrayList11;
                        g5Var2.f0 = concurrentHashMap4;
                        g5Var2.g0 = hashMap5;
                        g5Var2.i0 = hashMap6;
                        g5Var2.h0 = arrayList12;
                        g5Var2.j0 = arrayList13;
                        g5Var2.n = true;
                        if (i24 != 2) {
                            synchronized (g5Var2.c) {
                                g5Var2.b = false;
                            }
                        }
                        Utilities.h.c(new w4(g5Var2, new ArrayList(g5Var2.e0), 0));
                        g5Var2.N();
                        g5Var2.getNotificationCenter().k(qs.O, new Object[0]);
                        if (i24 == 1 || z12) {
                            g5Var2.J(false);
                        } else {
                            g5Var2.L();
                        }
                        if (z13) {
                            g5Var2.A(0L, false);
                        }
                    }
                });
                if (!arrayList3.isEmpty() && g5Var.h && g5Var.r) {
                    g5Var.c(arrayList3, null, null, null);
                    arrayList3.clear();
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
                gz gzVar = (gz) c1Var;
                TLObject tLObject = (TLObject) obj2;
                sy syVar = (sy) obj;
                boolean z12 = tLObject instanceof TLRPC.TL_messages_sendMultiMedia;
                int i24 = this.b;
                ArrayList arrayList11 = this.c;
                boolean z13 = this.d;
                if (z12) {
                    TLRPC.TL_messages_sendMultiMedia tL_messages_sendMultiMedia = (TLRPC.TL_messages_sendMultiMedia) tLObject;
                    int size2 = tL_messages_sendMultiMedia.multi_media.size();
                    z9 = false;
                    for (int i25 = 0; i25 < size2; i25++) {
                        if (i24 < 0 ? syVar.y.get(i25) != null : i24 == i25) {
                            gzVar.i0(((ij) arrayList11.get(i25)).f1(), z13);
                            TLRPC.TL_inputSingleMedia tL_inputSingleMedia = tL_messages_sendMultiMedia.multi_media.get(i25);
                            TLRPC.InputMedia inputMedia3 = tL_inputSingleMedia.media;
                            if (inputMedia3 instanceof TLRPC.TL_inputMediaPhoto) {
                                tL_inputSingleMedia.media = (TLRPC.InputMedia) syVar.A.get(i25);
                            } else if (inputMedia3 instanceof TLRPC.TL_inputMediaDocument) {
                                tL_inputSingleMedia.media = (TLRPC.InputMedia) syVar.A.get(i25);
                            }
                            syVar.o = (j20) syVar.w.get(i25);
                            syVar.l = (String) syVar.v.get(i25);
                            TLRPC.PhotoSize photoSize = (TLRPC.PhotoSize) syVar.u.get(i25);
                            syVar.g = photoSize;
                            syVar.p = true;
                            if (tL_inputSingleMedia.media.file == null || photoSize != null) {
                                z9 = true;
                            }
                            gzVar.M(syVar, i25);
                        }
                    }
                    i12 = 0;
                } else {
                    i12 = 0;
                    if (tLObject instanceof TLRPC.TL_messages_sendMedia) {
                        TLRPC.TL_inputMediaPaidMedia tL_inputMediaPaidMedia = (TLRPC.TL_inputMediaPaidMedia) ((TLRPC.TL_messages_sendMedia) tLObject).media;
                        int size3 = tL_inputMediaPaidMedia.extended_media.size();
                        z9 = false;
                        for (0; i13 < size3; i13 + 1) {
                            if (i24 >= 0) {
                                i13 = i24 != i13 ? i13 + 1 : 0;
                                gzVar.i0(((ij) arrayList11.get(i13)).f1(), z13);
                                inputMedia = tL_inputMediaPaidMedia.extended_media.get(i13);
                                if (inputMedia instanceof TLRPC.TL_inputMediaPhoto) {
                                    if (inputMedia instanceof TLRPC.TL_inputMediaDocument) {
                                        ArrayList<TLRPC.InputMedia> arrayList12 = tL_inputMediaPaidMedia.extended_media;
                                        inputMedia2 = (TLRPC.InputMedia) syVar.A.get(i13);
                                        arrayList12.set(i13, inputMedia2);
                                    }
                                    syVar.o = (j20) syVar.w.get(i13);
                                    syVar.l = (String) syVar.v.get(i13);
                                    TLRPC.PhotoSize photoSize2 = (TLRPC.PhotoSize) syVar.u.get(i13);
                                    syVar.g = photoSize2;
                                    syVar.p = true;
                                    if (inputMedia.file != null || photoSize2 != null) {
                                        z9 = true;
                                    }
                                    gzVar.M(syVar, i13);
                                } else {
                                    ArrayList<TLRPC.InputMedia> arrayList13 = tL_inputMediaPaidMedia.extended_media;
                                    inputMedia2 = (TLRPC.InputMedia) syVar.A.get(i13);
                                    arrayList13.set(i13, inputMedia2);
                                }
                                inputMedia = inputMedia2;
                                syVar.o = (j20) syVar.w.get(i13);
                                syVar.l = (String) syVar.v.get(i13);
                                TLRPC.PhotoSize photoSize22 = (TLRPC.PhotoSize) syVar.u.get(i13);
                                syVar.g = photoSize22;
                                syVar.p = true;
                                if (inputMedia.file != null) {
                                }
                                z9 = true;
                                gzVar.M(syVar, i13);
                            } else {
                                if (syVar.y.get(i13) == null) {
                                }
                                gzVar.i0(((ij) arrayList11.get(i13)).f1(), z13);
                                inputMedia = tL_inputMediaPaidMedia.extended_media.get(i13);
                                if (inputMedia instanceof TLRPC.TL_inputMediaPhoto) {
                                }
                                inputMedia = inputMedia2;
                                syVar.o = (j20) syVar.w.get(i13);
                                syVar.l = (String) syVar.v.get(i13);
                                TLRPC.PhotoSize photoSize222 = (TLRPC.PhotoSize) syVar.u.get(i13);
                                syVar.g = photoSize222;
                                syVar.p = true;
                                if (inputMedia.file != null) {
                                }
                                z9 = true;
                                gzVar.M(syVar, i13);
                            }
                        }
                    } else {
                        z9 = false;
                    }
                }
                if (!z9) {
                    for (int i26 = i12; i26 < arrayList11.size(); i26++) {
                        TLRPC.Message message = ((ij) arrayList11.get(i26)).k;
                        gzVar.getMessagesStorage().N0(z13 ? 1 : 0, message);
                        message.send_state = 2;
                        message.errorAllowedPriceStars = 0L;
                        message.errorNewPriceStars = 0L;
                        qs notificationCenter = gzVar.getNotificationCenter();
                        Object[] objArr = new Object[1];
                        objArr[i12] = Integer.valueOf(message.id);
                        notificationCenter.k(23, objArr);
                        gzVar.d0(message.id);
                        gzVar.i0(message.id, z13);
                    }
                    break;
                }
                break;
        }
    }

    public /* synthetic */ z4(gz gzVar, TLObject tLObject, int i7, sy syVar, ArrayList arrayList, boolean z9) {
        this.e = gzVar;
        this.f = tLObject;
        this.b = i7;
        this.h = syVar;
        this.c = arrayList;
        this.d = z9;
    }
}
