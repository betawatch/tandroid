package bi;

import android.content.Context;
import android.text.Editable;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.dg;
import org.telegram.messenger.ec;
import org.telegram.messenger.fj;
import org.telegram.messenger.gd;
import org.telegram.messenger.ks;
import org.telegram.messenger.mp;
import org.telegram.messenger.n10;
import org.telegram.messenger.ob;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Cells.i9;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.qj;
import org.telegram.ui.Components.ti;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.bn;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class v3 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;

    public /* synthetic */ v3(Context context, int i7, int i10, TLRPC.TL_messageActionStarGiftOnchainOffer tL_messageActionStarGiftOnchainOffer, org.telegram.ui.ActionBar.i6 i6Var, u3 u3Var) {
        this.d = context;
        this.b = i7;
        this.c = i10;
        this.e = tL_messageActionStarGiftOnchainOffer;
        this.f = i6Var;
        this.h = u3Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v21 */
    /* JADX WARN: Type inference failed for: r10v23 */
    /* JADX WARN: Type inference failed for: r10v28 */
    /* JADX WARN: Type inference failed for: r10v29 */
    /* JADX WARN: Type inference failed for: r10v32 */
    /* JADX WARN: Type inference failed for: r13v12, types: [org.telegram.messenger.gd] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v4, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r7v7, types: [org.telegram.messenger.gd] */
    @Override // java.lang.Runnable
    public final void run() {
        org.telegram.messenger.d8 E;
        int i7;
        String str;
        String[] strArr;
        String str2;
        String str3;
        String str4;
        ?? r10;
        String o4;
        int i10;
        int i11 = this.a;
        final int i12 = this.c;
        ?? r62 = 0;
        int i13 = this.b;
        Object obj = this.h;
        Object obj2 = this.f;
        Object obj3 = this.e;
        Object obj4 = this.d;
        switch (i11) {
            case 0:
                u3 u3Var = (u3) obj;
                l4.f((Context) obj4, this.b, this.c, (TLRPC.TL_messageActionStarGiftOnchainOffer) obj3, (org.telegram.ui.ActionBar.i6) obj2, u3Var.k(), new q3(u3Var, 3));
                break;
            case 1:
                oi.f1 f1Var = (oi.f1) obj3;
                i9 i9Var = (i9) obj2;
                oi.h0 h0Var = (oi.h0) obj;
                oi.i0 i0Var = (oi.i0) ((j6.k) obj4).c;
                if (f1Var.length() >= i13 && f1Var.getSelectionStart() != f1Var.getSelectionEnd() && i9Var.j0(h0Var.P(), 0, i12, i13)) {
                    i0Var.d = true;
                    f1Var.setSelection(i13);
                    i0Var.d = false;
                    break;
                }
                break;
            case 2:
                ob obVar = (ob) obj4;
                File file = (File) obj3;
                String str5 = (String) obj2;
                obVar.getClass();
                if (file != null && ((str5.endsWith(".mp4") || str5.endsWith(".jpg")) && (E = org.telegram.messenger.w7.E(obj)) != null)) {
                    fj fjVar = obj instanceof fj ? (fj) obj : null;
                    long j3 = E.a;
                    if (org.telegram.messenger.c6.m(j3 >= 0 ? 1 : org.telegram.messenger.v3.V(mp.u1(i13).O0(Long.valueOf(-j3))) ? 4 : 2, E, fjVar, i13)) {
                        org.telegram.messenger.g0.e(file.toString());
                    }
                }
                ks.f(i13).k(ks.Y1, str5, file);
                ec ecVar = obVar.b;
                ecVar.s.c(new dg(ecVar, str5, this.c, file, 5));
                break;
            case 3:
                qj qjVar = (qj) obj4;
                ArrayList arrayList = (ArrayList) obj2;
                ArrayList arrayList2 = (ArrayList) obj;
                qjVar.getClass();
                String lowerCase = ((String) obj3).trim().toLowerCase();
                if (lowerCase.length() == 0) {
                    qjVar.h = -1;
                    org.telegram.messenger.g0.g3(new ai.x0(qjVar, qjVar.h, new ArrayList(), new ArrayList(), 21));
                    break;
                } else {
                    String T0 = gd.E0().T0(lowerCase, true, false);
                    if (lowerCase.equals(T0) || T0.length() == 0) {
                        T0 = null;
                    }
                    int i14 = (T0 != null ? 1 : 0) + 1;
                    String[] strArr2 = new String[i14];
                    strArr2[0] = lowerCase;
                    if (T0 != null) {
                        strArr2[1] = T0;
                    }
                    ArrayList arrayList3 = new ArrayList();
                    qj qjVar2 = qjVar;
                    ArrayList arrayList4 = new ArrayList();
                    LongSparseIntArray longSparseIntArray = new LongSparseIntArray();
                    int i15 = 0;
                    while (i15 < arrayList.size()) {
                        org.telegram.messenger.f5 f5Var = (org.telegram.messenger.f5) arrayList.get(i15);
                        qj qjVar3 = qjVar2;
                        String lowerCase2 = org.telegram.messenger.i5.m(r62, f5Var.i, f5Var.j).toLowerCase();
                        ArrayList arrayList5 = arrayList;
                        String T02 = gd.E0().T0(lowerCase2, true, r62);
                        TLRPC.User user = f5Var.m;
                        if (user != null) {
                            strArr = strArr2;
                            String lowerCase3 = org.telegram.messenger.i5.m(r62, user.first_name, user.last_name).toLowerCase();
                            str3 = gd.E0().T0(lowerCase2, true, r62);
                            str2 = lowerCase3;
                        } else {
                            strArr = strArr2;
                            str2 = null;
                            str3 = null;
                        }
                        if (lowerCase2.equals(T02)) {
                            T02 = null;
                        }
                        boolean z10 = r62;
                        int i16 = r62;
                        while (i16 < i14) {
                            int i17 = i16;
                            String str6 = strArr[i17];
                            if ((str2 == null || !(str2.startsWith(str6) || i5.c.B(" ", str6, str2))) && (str3 == null || !(str3.startsWith(str6) || i5.c.B(" ", str6, str3)))) {
                                str4 = str2;
                                TLRPC.User user2 = f5Var.m;
                                r10 = (user2 == null || (o4 = n10.o(user2)) == null || !o4.startsWith(str6)) ? (lowerCase2.startsWith(str6) || i5.c.B(" ", str6, lowerCase2) || (T02 != null && (T02.startsWith(str6) || i5.c.B(" ", str6, T02)))) ? 3 : z10 : 2;
                            } else {
                                str4 = str2;
                                r10 = 1;
                            }
                            String str7 = lowerCase2;
                            if (r10 == 0 || (f5Var.e.isEmpty() && f5Var.g.isEmpty())) {
                                lowerCase2 = str7;
                                z10 = r10;
                                str2 = str4;
                                i16 = i17 + 1;
                            } else {
                                if (r10 == 3) {
                                    arrayList4.add(org.telegram.messenger.g0.r0(f5Var.i, f5Var.j, str6));
                                } else if (r10 == 1) {
                                    TLRPC.User user3 = f5Var.m;
                                    arrayList4.add(org.telegram.messenger.g0.r0(user3.first_name, user3.last_name, str6));
                                } else {
                                    arrayList4.add(org.telegram.messenger.g0.r0("@" + n10.o(f5Var.m), null, "@" + str6));
                                }
                                TLRPC.User user4 = f5Var.m;
                                if (user4 != null) {
                                    longSparseIntArray.put(user4.id, 1);
                                }
                                arrayList3.add(f5Var);
                                i15++;
                                qjVar2 = qjVar3;
                                arrayList = arrayList5;
                                strArr2 = strArr;
                                r62 = 0;
                            }
                        }
                        i15++;
                        qjVar2 = qjVar3;
                        arrayList = arrayList5;
                        strArr2 = strArr;
                        r62 = 0;
                    }
                    qj qjVar4 = qjVar2;
                    String[] strArr3 = strArr2;
                    for (int i18 = 0; i18 < arrayList2.size(); i18 = i7 + 1) {
                        TLRPC.TL_contact tL_contact = (TLRPC.TL_contact) arrayList2.get(i18);
                        if (longSparseIntArray.indexOfKey(tL_contact.user_id) >= 0) {
                            i7 = i18;
                        } else {
                            i7 = i18;
                            TLRPC.User c22 = mp.u1(i13).c2(Long.valueOf(tL_contact.user_id));
                            String lowerCase4 = org.telegram.messenger.i5.m(0, c22.first_name, c22.last_name).toLowerCase();
                            String T03 = gd.E0().T0(lowerCase4, true, false);
                            if (lowerCase4.equals(T03)) {
                                T03 = null;
                            }
                            char c10 = 0;
                            int i19 = 0;
                            while (i19 < i14) {
                                String str8 = strArr3[i19];
                                if (lowerCase4.startsWith(str8) || i5.c.B(" ", str8, lowerCase4) || (T03 != null && (T03.startsWith(str8) || i5.c.B(" ", str8, T03)))) {
                                    str = lowerCase4;
                                    c10 = 1;
                                } else {
                                    str = lowerCase4;
                                    String o10 = n10.o(c22);
                                    if (o10 != null && o10.startsWith(str8)) {
                                        c10 = 2;
                                    }
                                }
                                if (c10 == 0 || c22.phone == null) {
                                    i19++;
                                    lowerCase4 = str;
                                } else {
                                    if (c10 == 1) {
                                        arrayList4.add(org.telegram.messenger.g0.r0(c22.first_name, c22.last_name, str8));
                                    } else {
                                        arrayList4.add(org.telegram.messenger.g0.r0("@" + n10.o(c22), null, "@" + str8));
                                    }
                                    arrayList3.add(c22);
                                }
                            }
                        }
                    }
                    org.telegram.messenger.g0.g3(new ai.x0(qjVar4, this.c, arrayList3, arrayList4, 21));
                    break;
                }
                break;
            case 4:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) obj4;
                org.telegram.ui.ActionBar.g2 g2Var = (org.telegram.ui.ActionBar.g2) obj3;
                ArrayList arrayList6 = (ArrayList) obj2;
                bn bnVar = (bn) obj;
                boolean z11 = ChatAttachAlertPhotoLayout.r1;
                ti tiVar = chatAttachAlertPhotoLayout.b;
                if (!tiVar.A1 || tiVar.B1) {
                    i10 = i13;
                } else {
                    PhotoViewer.p1().J2(null, g2Var, null);
                    PhotoViewer p12 = PhotoViewer.p1();
                    p12.h = 0;
                    p12.n = false;
                    i10 = 3;
                }
                if (tiVar.C1) {
                    i10 = 13;
                }
                PhotoViewer.p1().g2(arrayList6, this.c, i10, false, chatAttachAlertPhotoLayout.i1, tiVar.C1 ? null : bnVar);
                PhotoViewer.p1().w2(tiVar.L1);
                if (tiVar.A1 && !tiVar.B1) {
                    PhotoViewer.p1().P = false;
                } else if (tiVar.O2 != 0) {
                    PhotoViewer.p1().P = true;
                    PhotoViewer.p1().Q = tiVar.P2 != null;
                }
                if (tiVar.B1) {
                    PhotoViewer.p1().T0(null, null, false, tiVar.E1);
                }
                if (ChatAttachAlertPhotoLayout.W()) {
                    PhotoViewer p13 = PhotoViewer.p1();
                    Editable text = tiVar.b1().getText();
                    p13.v7 = true;
                    p13.w7 = text;
                    p13.z2(null, text, false, false);
                    p13.s3(null);
                    break;
                }
                break;
            default:
                final p4.v vVar = (p4.v) obj3;
                final p4.d0 d0Var = (p4.d0) obj2;
                final p4.b1 b1Var = (p4.b1) obj;
                ab.c0 c0Var = ((p4.d1) obj4).b;
                if (c0Var.D(vVar, i13)) {
                    w7.s sVar = d0Var.e;
                    d0Var.s(vVar);
                    sVar.getClass();
                    if (i13 == 27) {
                        b1Var.j(d0Var, vVar, i12);
                        c0Var.c(vVar, i13, new p4.v0());
                        break;
                    } else {
                        c0Var.c(vVar, i13, new p4.g() { // from class: p4.w0
                            @Override // p4.g
                            public final m9.y run() {
                                return (m9.y) b1.this.j(d0Var, vVar, i12);
                            }
                        });
                        break;
                    }
                } else {
                    p4.d1.r1(d0Var, vVar, i12, new p4.n1(-4));
                    break;
                }
        }
    }

    public /* synthetic */ v3(j6.k kVar, oi.f1 f1Var, int i7, i9 i9Var, oi.h0 h0Var, int i10) {
        this.d = kVar;
        this.e = f1Var;
        this.b = i7;
        this.f = i9Var;
        this.h = h0Var;
        this.c = i10;
    }

    public /* synthetic */ v3(ob obVar, File file, String str, int i7, Object obj, int i10) {
        this.d = obVar;
        this.e = file;
        this.f = str;
        this.b = i7;
        this.h = obj;
        this.c = i10;
    }

    public /* synthetic */ v3(qj qjVar, String str, ArrayList arrayList, ArrayList arrayList2, int i7, int i10) {
        this.d = qjVar;
        this.e = str;
        this.f = arrayList;
        this.h = arrayList2;
        this.b = i7;
        this.c = i10;
    }

    public /* synthetic */ v3(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, int i7, org.telegram.ui.ActionBar.g2 g2Var, ArrayList arrayList, int i10, bn bnVar) {
        this.d = chatAttachAlertPhotoLayout;
        this.b = i7;
        this.e = g2Var;
        this.f = arrayList;
        this.c = i10;
        this.h = bnVar;
    }

    public /* synthetic */ v3(p4.d1 d1Var, p4.v vVar, int i7, p4.d0 d0Var, int i10, p4.b1 b1Var) {
        this.d = d1Var;
        this.e = vVar;
        this.b = i7;
        this.f = d0Var;
        this.c = i10;
        this.h = b1Var;
    }
}
