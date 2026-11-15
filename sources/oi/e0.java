package oi;

import android.text.Editable;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.cg;
import org.telegram.messenger.e8;
import org.telegram.messenger.fc;
import org.telegram.messenger.gj;
import org.telegram.messenger.hd;
import org.telegram.messenger.np;
import org.telegram.messenger.ns;
import org.telegram.messenger.pb;
import org.telegram.messenger.q10;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.messenger.w7;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Cells.h9;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.ij;
import org.telegram.ui.Components.ki;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.an;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes4.dex */
public final /* synthetic */ class e0 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;

    public /* synthetic */ e0(ji.j jVar, e1 e1Var, int i7, h9 h9Var, g0 g0Var, int i10) {
        this.d = jVar;
        this.e = e1Var;
        this.b = i7;
        this.f = h9Var;
        this.h = g0Var;
        this.c = i10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v11, types: [org.telegram.messenger.hd] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v4, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r7v7, types: [org.telegram.messenger.hd] */
    /* JADX WARN: Type inference failed for: r9v21 */
    /* JADX WARN: Type inference failed for: r9v23 */
    /* JADX WARN: Type inference failed for: r9v28 */
    /* JADX WARN: Type inference failed for: r9v29 */
    /* JADX WARN: Type inference failed for: r9v32 */
    @Override // java.lang.Runnable
    public final void run() {
        e8 E;
        int i7;
        String str;
        String[] strArr;
        String str2;
        String str3;
        String str4;
        ?? r92;
        String n10;
        int i10;
        int i11 = this.a;
        final int i12 = this.c;
        ?? r62 = 0;
        Object obj = this.h;
        Object obj2 = this.f;
        int i13 = this.b;
        Object obj3 = this.e;
        Object obj4 = this.d;
        switch (i11) {
            case 0:
                e1 e1Var = (e1) obj3;
                h9 h9Var = (h9) obj2;
                g0 g0Var = (g0) obj;
                h0 h0Var = (h0) ((ji.j) obj4).c;
                if (e1Var.length() >= i13 && e1Var.getSelectionStart() != e1Var.getSelectionEnd() && h9Var.j0(g0Var.N(), 0, i12, i13)) {
                    h0Var.d = true;
                    e1Var.setSelection(i13);
                    h0Var.d = false;
                    break;
                }
                break;
            case 1:
                gj gjVar = null;
                pb pbVar = (pb) obj4;
                File file = (File) obj3;
                String str5 = (String) obj2;
                pbVar.getClass();
                if (file != null && ((str5.endsWith(".mp4") || str5.endsWith(".jpg")) && (E = w7.E(obj)) != null)) {
                    if (obj instanceof gj) {
                        gjVar = (gj) obj;
                    }
                    long j3 = E.a;
                    if (org.telegram.messenger.b6.m(j3 >= 0 ? 1 : org.telegram.messenger.t3.V(np.s1(i13).M0(Long.valueOf(-j3))) ? 4 : 2, E, gjVar, i13)) {
                        org.telegram.messenger.g0.e(file.toString());
                    }
                }
                ns.f(i13).k(ns.Y1, str5, file);
                fc fcVar = pbVar.b;
                fcVar.s.c(new cg(fcVar, str5, this.c, file, 5));
                break;
            case 2:
                ij ijVar = (ij) obj4;
                ArrayList arrayList = (ArrayList) obj2;
                ArrayList arrayList2 = (ArrayList) obj;
                ijVar.getClass();
                String lowerCase = ((String) obj3).trim().toLowerCase();
                if (lowerCase.length() != 0) {
                    String S0 = hd.E0().S0(lowerCase, true, false);
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
                    ij ijVar2 = ijVar;
                    ArrayList arrayList4 = new ArrayList();
                    LongSparseIntArray longSparseIntArray = new LongSparseIntArray();
                    int i15 = 0;
                    while (true) {
                        String str6 = " ";
                        if (i15 >= arrayList.size()) {
                            ij ijVar3 = ijVar2;
                            String[] strArr3 = strArr2;
                            int i16 = 0;
                            while (i16 < arrayList2.size()) {
                                TLRPC.TL_contact tL_contact = (TLRPC.TL_contact) arrayList2.get(i16);
                                if (longSparseIntArray.indexOfKey(tL_contact.user_id) >= 0) {
                                    str = str6;
                                    i7 = i16;
                                } else {
                                    i7 = i16;
                                    TLRPC.User a22 = np.s1(i13).a2(Long.valueOf(tL_contact.user_id));
                                    String lowerCase2 = org.telegram.messenger.g5.m(0, a22.first_name, a22.last_name).toLowerCase();
                                    String S02 = hd.E0().S0(lowerCase2, true, false);
                                    if (lowerCase2.equals(S02)) {
                                        S02 = null;
                                    }
                                    char c10 = 0;
                                    int i17 = 0;
                                    while (i17 < i14) {
                                        String str7 = strArr3[i17];
                                        if (lowerCase2.startsWith(str7) || i5.c.A(str6, str7, lowerCase2) || (S02 != null && (S02.startsWith(str7) || i5.c.A(str6, str7, S02)))) {
                                            str = str6;
                                            c10 = 1;
                                        } else {
                                            str = str6;
                                            String n11 = q10.n(a22);
                                            if (n11 != null && n11.startsWith(str7)) {
                                                c10 = 2;
                                            }
                                        }
                                        if (c10 == 0 || a22.phone == null) {
                                            i17++;
                                            str6 = str;
                                        } else {
                                            if (c10 == 1) {
                                                arrayList4.add(org.telegram.messenger.g0.r0(a22.first_name, a22.last_name, str7));
                                            } else {
                                                arrayList4.add(org.telegram.messenger.g0.r0("@" + q10.n(a22), null, "@" + str7));
                                            }
                                            arrayList3.add(a22);
                                            i16 = i7 + 1;
                                            str6 = str;
                                        }
                                    }
                                    str = str6;
                                }
                                i16 = i7 + 1;
                                str6 = str;
                            }
                            org.telegram.messenger.g0.h3(new ci.p0(ijVar3, this.c, arrayList3, arrayList4, 19));
                            break;
                        } else {
                            org.telegram.messenger.d5 d5Var = (org.telegram.messenger.d5) arrayList.get(i15);
                            ij ijVar4 = ijVar2;
                            String lowerCase3 = org.telegram.messenger.g5.m(r62, d5Var.i, d5Var.j).toLowerCase();
                            ArrayList arrayList5 = arrayList;
                            String S03 = hd.E0().S0(lowerCase3, true, r62);
                            TLRPC.User user = d5Var.m;
                            if (user != null) {
                                strArr = strArr2;
                                String lowerCase4 = org.telegram.messenger.g5.m(r62, user.first_name, user.last_name).toLowerCase();
                                str3 = hd.E0().S0(lowerCase3, true, r62);
                                str2 = lowerCase4;
                            } else {
                                strArr = strArr2;
                                str2 = null;
                                str3 = null;
                            }
                            if (lowerCase3.equals(S03)) {
                                S03 = null;
                            }
                            boolean z10 = r62;
                            int i18 = r62;
                            while (i18 < i14) {
                                int i19 = i18;
                                String str8 = strArr[i19];
                                if ((str2 == null || !(str2.startsWith(str8) || i5.c.A(" ", str8, str2))) && (str3 == null || !(str3.startsWith(str8) || i5.c.A(" ", str8, str3)))) {
                                    str4 = str2;
                                    TLRPC.User user2 = d5Var.m;
                                    r92 = (user2 == null || (n10 = q10.n(user2)) == null || !n10.startsWith(str8)) ? (lowerCase3.startsWith(str8) || i5.c.A(" ", str8, lowerCase3) || (S03 != null && (S03.startsWith(str8) || i5.c.A(" ", str8, S03)))) ? 3 : z10 : 2;
                                } else {
                                    str4 = str2;
                                    r92 = 1;
                                }
                                String str9 = lowerCase3;
                                if (r92 == 0 || (d5Var.e.isEmpty() && d5Var.g.isEmpty())) {
                                    lowerCase3 = str9;
                                    z10 = r92;
                                    str2 = str4;
                                    i18 = i19 + 1;
                                } else {
                                    if (r92 == 3) {
                                        arrayList4.add(org.telegram.messenger.g0.r0(d5Var.i, d5Var.j, str8));
                                    } else if (r92 == 1) {
                                        TLRPC.User user3 = d5Var.m;
                                        arrayList4.add(org.telegram.messenger.g0.r0(user3.first_name, user3.last_name, str8));
                                    } else {
                                        arrayList4.add(org.telegram.messenger.g0.r0("@" + q10.n(d5Var.m), null, "@" + str8));
                                    }
                                    TLRPC.User user4 = d5Var.m;
                                    if (user4 != null) {
                                        longSparseIntArray.put(user4.id, 1);
                                    }
                                    arrayList3.add(d5Var);
                                    i15++;
                                    ijVar2 = ijVar4;
                                    arrayList = arrayList5;
                                    strArr2 = strArr;
                                    r62 = 0;
                                }
                            }
                            i15++;
                            ijVar2 = ijVar4;
                            arrayList = arrayList5;
                            strArr2 = strArr;
                            r62 = 0;
                        }
                    }
                } else {
                    ijVar.h = -1;
                    org.telegram.messenger.g0.h3(new ci.p0(ijVar, ijVar.h, new ArrayList(), new ArrayList(), 19));
                    break;
                }
                break;
            case 3:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) obj4;
                org.telegram.ui.ActionBar.e2 e2Var = (org.telegram.ui.ActionBar.e2) obj3;
                ArrayList arrayList6 = (ArrayList) obj2;
                an anVar = (an) obj;
                boolean z11 = ChatAttachAlertPhotoLayout.r1;
                ki kiVar = chatAttachAlertPhotoLayout.b;
                if (!kiVar.A1 || kiVar.B1) {
                    i10 = i13;
                } else {
                    PhotoViewer.p1().I2(null, e2Var, null);
                    PhotoViewer p12 = PhotoViewer.p1();
                    p12.h = 0;
                    p12.n = false;
                    i10 = 3;
                }
                if (kiVar.C1) {
                    i10 = 13;
                }
                PhotoViewer.p1().f2(arrayList6, this.c, i10, false, chatAttachAlertPhotoLayout.i1, kiVar.C1 ? null : anVar);
                PhotoViewer.p1().v2(kiVar.L1);
                if (kiVar.A1 && !kiVar.B1) {
                    PhotoViewer.p1().P = false;
                } else if (kiVar.O2 != 0) {
                    PhotoViewer.p1().P = true;
                    PhotoViewer.p1().Q = kiVar.P2 != null;
                }
                if (kiVar.B1) {
                    PhotoViewer.p1().S0(null, null, false, kiVar.E1);
                }
                if (ChatAttachAlertPhotoLayout.W()) {
                    PhotoViewer p13 = PhotoViewer.p1();
                    Editable text = kiVar.a1().getText();
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
                final p4.a1 a1Var = (p4.a1) obj;
                ab.c0 c0Var = ((p4.c1) obj4).b;
                if (!c0Var.z(vVar, i13)) {
                    p4.c1.r1(d0Var, vVar, i12, new p4.m1(-4));
                    break;
                } else {
                    w7.s sVar = d0Var.e;
                    d0Var.s(vVar);
                    sVar.getClass();
                    if (i13 != 27) {
                        c0Var.c(vVar, i13, new p4.g() { // from class: p4.v0
                            @Override // p4.g
                            public final m9.y run() {
                                return (m9.y) a1.this.k(d0Var, vVar, i12);
                            }
                        });
                        break;
                    } else {
                        a1Var.k(d0Var, vVar, i12);
                        c0Var.c(vVar, i13, new p4.u0());
                        break;
                    }
                }
        }
    }

    public /* synthetic */ e0(pb pbVar, File file, String str, int i7, Object obj, int i10) {
        this.d = pbVar;
        this.e = file;
        this.f = str;
        this.b = i7;
        this.h = obj;
        this.c = i10;
    }

    public /* synthetic */ e0(ij ijVar, String str, ArrayList arrayList, ArrayList arrayList2, int i7, int i10) {
        this.d = ijVar;
        this.e = str;
        this.f = arrayList;
        this.h = arrayList2;
        this.b = i7;
        this.c = i10;
    }

    public /* synthetic */ e0(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, int i7, org.telegram.ui.ActionBar.e2 e2Var, ArrayList arrayList, int i10, an anVar) {
        this.d = chatAttachAlertPhotoLayout;
        this.b = i7;
        this.e = e2Var;
        this.f = arrayList;
        this.c = i10;
        this.h = anVar;
    }

    public /* synthetic */ e0(p4.c1 c1Var, p4.v vVar, int i7, p4.d0 d0Var, int i10, p4.a1 a1Var) {
        this.d = c1Var;
        this.e = vVar;
        this.b = i7;
        this.f = d0Var;
        this.c = i10;
        this.h = a1Var;
    }
}
