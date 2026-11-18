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
import org.telegram.messenger.o10;
import org.telegram.messenger.ob;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Cells.j9;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.pj;
import org.telegram.ui.Components.si;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.bn;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class p3 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;

    public /* synthetic */ p3(Context context, int i7, int i10, TLRPC.TL_messageActionStarGiftOnchainOffer tL_messageActionStarGiftOnchainOffer, org.telegram.ui.ActionBar.i6 i6Var, o3 o3Var) {
        this.d = context;
        this.b = i7;
        this.c = i10;
        this.e = tL_messageActionStarGiftOnchainOffer;
        this.f = i6Var;
        this.h = o3Var;
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
        org.telegram.messenger.e8 E;
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
                o3 o3Var = (o3) obj;
                e4.f((Context) obj4, this.b, this.c, (TLRPC.TL_messageActionStarGiftOnchainOffer) obj3, (org.telegram.ui.ActionBar.i6) obj2, o3Var.k(), new k3(o3Var, 3));
                break;
            case 1:
                oi.e1 e1Var = (oi.e1) obj3;
                j9 j9Var = (j9) obj2;
                oi.g0 g0Var = (oi.g0) obj;
                oi.h0 h0Var = (oi.h0) ((ji.j) obj4).c;
                if (e1Var.length() >= i13 && e1Var.getSelectionStart() != e1Var.getSelectionEnd() && j9Var.j0(g0Var.a1(), 0, i12, i13)) {
                    h0Var.d = true;
                    e1Var.setSelection(i13);
                    h0Var.d = false;
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
                pj pjVar = (pj) obj4;
                ArrayList arrayList = (ArrayList) obj2;
                ArrayList arrayList2 = (ArrayList) obj;
                pjVar.getClass();
                String lowerCase = ((String) obj3).trim().toLowerCase();
                if (lowerCase.length() == 0) {
                    pjVar.h = -1;
                    org.telegram.messenger.g0.g3(new t4(pjVar, pjVar.h, new ArrayList(), new ArrayList(), 20));
                    break;
                } else {
                    String S0 = gd.E0().S0(lowerCase, true, false);
                    if (lowerCase.equals(S0) || S0.length() == 0) {
                        S0 = null;
                    }
                    int i14 = (S0 != null ? 1 : 0) + 1;
                    String[] strArr2 = new String[i14];
                    strArr2[0] = lowerCase;
                    if (S0 != null) {
                        strArr2[1] = S0;
                    }
                    ArrayList arrayList3 = new ArrayList();
                    pj pjVar2 = pjVar;
                    ArrayList arrayList4 = new ArrayList();
                    LongSparseIntArray longSparseIntArray = new LongSparseIntArray();
                    int i15 = 0;
                    while (i15 < arrayList.size()) {
                        org.telegram.messenger.f5 f5Var = (org.telegram.messenger.f5) arrayList.get(i15);
                        pj pjVar3 = pjVar2;
                        String lowerCase2 = org.telegram.messenger.i5.m(r62, f5Var.i, f5Var.j).toLowerCase();
                        ArrayList arrayList5 = arrayList;
                        String S02 = gd.E0().S0(lowerCase2, true, r62);
                        TLRPC.User user = f5Var.m;
                        if (user != null) {
                            strArr = strArr2;
                            String lowerCase3 = org.telegram.messenger.i5.m(r62, user.first_name, user.last_name).toLowerCase();
                            str3 = gd.E0().S0(lowerCase2, true, r62);
                            str2 = lowerCase3;
                        } else {
                            strArr = strArr2;
                            str2 = null;
                            str3 = null;
                        }
                        if (lowerCase2.equals(S02)) {
                            S02 = null;
                        }
                        boolean z10 = r62;
                        int i16 = r62;
                        while (i16 < i14) {
                            int i17 = i16;
                            String str6 = strArr[i17];
                            if ((str2 == null || !(str2.startsWith(str6) || i5.c.B(" ", str6, str2))) && (str3 == null || !(str3.startsWith(str6) || i5.c.B(" ", str6, str3)))) {
                                str4 = str2;
                                TLRPC.User user2 = f5Var.m;
                                r10 = (user2 == null || (o4 = o10.o(user2)) == null || !o4.startsWith(str6)) ? (lowerCase2.startsWith(str6) || i5.c.B(" ", str6, lowerCase2) || (S02 != null && (S02.startsWith(str6) || i5.c.B(" ", str6, S02)))) ? 3 : z10 : 2;
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
                                    arrayList4.add(org.telegram.messenger.g0.r0("@" + o10.o(f5Var.m), null, "@" + str6));
                                }
                                TLRPC.User user4 = f5Var.m;
                                if (user4 != null) {
                                    longSparseIntArray.put(user4.id, 1);
                                }
                                arrayList3.add(f5Var);
                                i15++;
                                pjVar2 = pjVar3;
                                arrayList = arrayList5;
                                strArr2 = strArr;
                                r62 = 0;
                            }
                        }
                        i15++;
                        pjVar2 = pjVar3;
                        arrayList = arrayList5;
                        strArr2 = strArr;
                        r62 = 0;
                    }
                    pj pjVar4 = pjVar2;
                    String[] strArr3 = strArr2;
                    for (int i18 = 0; i18 < arrayList2.size(); i18 = i7 + 1) {
                        TLRPC.TL_contact tL_contact = (TLRPC.TL_contact) arrayList2.get(i18);
                        if (longSparseIntArray.indexOfKey(tL_contact.user_id) >= 0) {
                            i7 = i18;
                        } else {
                            i7 = i18;
                            TLRPC.User c22 = mp.u1(i13).c2(Long.valueOf(tL_contact.user_id));
                            String lowerCase4 = org.telegram.messenger.i5.m(0, c22.first_name, c22.last_name).toLowerCase();
                            String S03 = gd.E0().S0(lowerCase4, true, false);
                            if (lowerCase4.equals(S03)) {
                                S03 = null;
                            }
                            char c10 = 0;
                            int i19 = 0;
                            while (i19 < i14) {
                                String str8 = strArr3[i19];
                                if (lowerCase4.startsWith(str8) || i5.c.B(" ", str8, lowerCase4) || (S03 != null && (S03.startsWith(str8) || i5.c.B(" ", str8, S03)))) {
                                    str = lowerCase4;
                                    c10 = 1;
                                } else {
                                    str = lowerCase4;
                                    String o10 = o10.o(c22);
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
                                        arrayList4.add(org.telegram.messenger.g0.r0("@" + o10.o(c22), null, "@" + str8));
                                    }
                                    arrayList3.add(c22);
                                }
                            }
                        }
                    }
                    org.telegram.messenger.g0.g3(new t4(pjVar4, this.c, arrayList3, arrayList4, 20));
                    break;
                }
                break;
            case 4:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) obj4;
                org.telegram.ui.ActionBar.h2 h2Var = (org.telegram.ui.ActionBar.h2) obj3;
                ArrayList arrayList6 = (ArrayList) obj2;
                bn bnVar = (bn) obj;
                boolean z11 = ChatAttachAlertPhotoLayout.r1;
                si siVar = chatAttachAlertPhotoLayout.b;
                if (!siVar.A1 || siVar.B1) {
                    i10 = i13;
                } else {
                    PhotoViewer.p1().I2(null, h2Var, null);
                    PhotoViewer p12 = PhotoViewer.p1();
                    p12.h = 0;
                    p12.n = false;
                    i10 = 3;
                }
                if (siVar.C1) {
                    i10 = 13;
                }
                PhotoViewer.p1().f2(arrayList6, this.c, i10, false, chatAttachAlertPhotoLayout.i1, siVar.C1 ? null : bnVar);
                PhotoViewer.p1().v2(siVar.L1);
                if (siVar.A1 && !siVar.B1) {
                    PhotoViewer.p1().P = false;
                } else if (siVar.O2 != 0) {
                    PhotoViewer.p1().P = true;
                    PhotoViewer.p1().Q = siVar.P2 != null;
                }
                if (siVar.B1) {
                    PhotoViewer.p1().S0(null, null, false, siVar.E1);
                }
                if (ChatAttachAlertPhotoLayout.W()) {
                    PhotoViewer p13 = PhotoViewer.p1();
                    Editable text = siVar.b1().getText();
                    p13.p7 = true;
                    p13.q7 = text;
                    p13.y2(null, text, false, false);
                    p13.r3(null);
                    break;
                }
                break;
            default:
                final p4.v vVar = (p4.v) obj3;
                final p4.d0 d0Var = (p4.d0) obj2;
                final p4.c1 c1Var = (p4.c1) obj;
                ab.c0 c0Var = ((p4.e1) obj4).b;
                if (c0Var.C(vVar, i13)) {
                    w7.s sVar = d0Var.e;
                    d0Var.s(vVar);
                    sVar.getClass();
                    if (i13 == 27) {
                        c1Var.k(d0Var, vVar, i12);
                        c0Var.c(vVar, i13, new p4.w0());
                        break;
                    } else {
                        c0Var.c(vVar, i13, new p4.g() { // from class: p4.x0
                            @Override // p4.g
                            public final m9.y run() {
                                return (m9.y) c1.this.k(d0Var, vVar, i12);
                            }
                        });
                        break;
                    }
                } else {
                    p4.e1.r1(d0Var, vVar, i12, new p4.o1(-4));
                    break;
                }
        }
    }

    public /* synthetic */ p3(ji.j jVar, oi.e1 e1Var, int i7, j9 j9Var, oi.g0 g0Var, int i10) {
        this.d = jVar;
        this.e = e1Var;
        this.b = i7;
        this.f = j9Var;
        this.h = g0Var;
        this.c = i10;
    }

    public /* synthetic */ p3(ob obVar, File file, String str, int i7, Object obj, int i10) {
        this.d = obVar;
        this.e = file;
        this.f = str;
        this.b = i7;
        this.h = obj;
        this.c = i10;
    }

    public /* synthetic */ p3(pj pjVar, String str, ArrayList arrayList, ArrayList arrayList2, int i7, int i10) {
        this.d = pjVar;
        this.e = str;
        this.f = arrayList;
        this.h = arrayList2;
        this.b = i7;
        this.c = i10;
    }

    public /* synthetic */ p3(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, int i7, org.telegram.ui.ActionBar.h2 h2Var, ArrayList arrayList, int i10, bn bnVar) {
        this.d = chatAttachAlertPhotoLayout;
        this.b = i7;
        this.e = h2Var;
        this.f = arrayList;
        this.c = i10;
        this.h = bnVar;
    }

    public /* synthetic */ p3(p4.e1 e1Var, p4.v vVar, int i7, p4.d0 d0Var, int i10, p4.c1 c1Var) {
        this.d = e1Var;
        this.e = vVar;
        this.b = i7;
        this.f = d0Var;
        this.c = i10;
        this.h = c1Var;
    }
}
