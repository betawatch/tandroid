package li;

import android.text.Editable;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.dg;
import org.telegram.messenger.e8;
import org.telegram.messenger.gc;
import org.telegram.messenger.id;
import org.telegram.messenger.ij;
import org.telegram.messenger.qb;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.messenger.t10;
import org.telegram.messenger.w7;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Cells.i9;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.bj;
import org.telegram.ui.Components.di;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.an;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes4.dex */
public final /* synthetic */ class g0 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;

    public /* synthetic */ g0(j2.n nVar, g1 g1Var, int i7, i9 i9Var, i0 i0Var, int i10) {
        this.d = nVar;
        this.e = g1Var;
        this.b = i7;
        this.f = i9Var;
        this.h = i0Var;
        this.c = i10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v11, types: [org.telegram.messenger.id] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v4, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r7v7, types: [org.telegram.messenger.id] */
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
                g1 g1Var = (g1) obj3;
                i9 i9Var = (i9) obj2;
                i0 i0Var = (i0) obj;
                j0 j0Var = (j0) ((j2.n) obj4).c;
                if (g1Var.length() >= i13 && g1Var.getSelectionStart() != g1Var.getSelectionEnd() && i9Var.j0(i0Var.S0(), 0, i12, i13)) {
                    j0Var.d = true;
                    g1Var.setSelection(i13);
                    j0Var.d = false;
                    break;
                }
                break;
            case 1:
                ij ijVar = null;
                qb qbVar = (qb) obj4;
                File file = (File) obj3;
                String str5 = (String) obj2;
                qbVar.getClass();
                if (file != null && ((str5.endsWith(".mp4") || str5.endsWith(".jpg")) && (E = w7.E(obj)) != null)) {
                    if (obj instanceof ij) {
                        ijVar = (ij) obj;
                    }
                    long j3 = E.a;
                    if (org.telegram.messenger.b6.k(j3 >= 0 ? 1 : org.telegram.messenger.t3.V(qp.s1(i13).M0(Long.valueOf(-j3))) ? 4 : 2, E, ijVar, i13)) {
                        org.telegram.messenger.g0.e(file.toString());
                    }
                }
                qs.f(i13).k(qs.Y1, str5, file);
                gc gcVar = qbVar.b;
                gcVar.s.c(new dg(gcVar, str5, this.c, file, 5));
                break;
            case 2:
                bj bjVar = (bj) obj4;
                ArrayList arrayList = (ArrayList) obj2;
                ArrayList arrayList2 = (ArrayList) obj;
                bjVar.getClass();
                String lowerCase = ((String) obj3).trim().toLowerCase();
                if (lowerCase.length() != 0) {
                    String S0 = id.E0().S0(lowerCase, true, false);
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
                    bj bjVar2 = bjVar;
                    ArrayList arrayList4 = new ArrayList();
                    LongSparseIntArray longSparseIntArray = new LongSparseIntArray();
                    int i15 = 0;
                    while (true) {
                        String str6 = " ";
                        if (i15 >= arrayList.size()) {
                            bj bjVar3 = bjVar2;
                            String[] strArr3 = strArr2;
                            int i16 = 0;
                            while (i16 < arrayList2.size()) {
                                TLRPC.TL_contact tL_contact = (TLRPC.TL_contact) arrayList2.get(i16);
                                if (longSparseIntArray.indexOfKey(tL_contact.user_id) >= 0) {
                                    str = str6;
                                    i7 = i16;
                                } else {
                                    i7 = i16;
                                    TLRPC.User a22 = qp.s1(i13).a2(Long.valueOf(tL_contact.user_id));
                                    String lowerCase2 = org.telegram.messenger.g5.m(0, a22.first_name, a22.last_name).toLowerCase();
                                    String S02 = id.E0().S0(lowerCase2, true, false);
                                    if (lowerCase2.equals(S02)) {
                                        S02 = null;
                                    }
                                    char c10 = 0;
                                    int i17 = 0;
                                    while (i17 < i14) {
                                        String str7 = strArr3[i17];
                                        if (lowerCase2.startsWith(str7) || jg.g.A(str6, str7, lowerCase2) || (S02 != null && (S02.startsWith(str7) || jg.g.A(str6, str7, S02)))) {
                                            str = str6;
                                            c10 = 1;
                                        } else {
                                            str = str6;
                                            String n11 = t10.n(a22);
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
                                                arrayList4.add(org.telegram.messenger.g0.r0("@" + t10.n(a22), null, "@" + str7));
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
                            org.telegram.messenger.g0.h3(new ai.a1(bjVar3, this.c, arrayList3, arrayList4, 19));
                            break;
                        } else {
                            org.telegram.messenger.d5 d5Var = (org.telegram.messenger.d5) arrayList.get(i15);
                            bj bjVar4 = bjVar2;
                            String lowerCase3 = org.telegram.messenger.g5.m(r62, d5Var.i, d5Var.j).toLowerCase();
                            ArrayList arrayList5 = arrayList;
                            String S03 = id.E0().S0(lowerCase3, true, r62);
                            TLRPC.User user = d5Var.m;
                            if (user != null) {
                                strArr = strArr2;
                                String lowerCase4 = org.telegram.messenger.g5.m(r62, user.first_name, user.last_name).toLowerCase();
                                str3 = id.E0().S0(lowerCase3, true, r62);
                                str2 = lowerCase4;
                            } else {
                                strArr = strArr2;
                                str2 = null;
                                str3 = null;
                            }
                            if (lowerCase3.equals(S03)) {
                                S03 = null;
                            }
                            boolean z9 = r62;
                            int i18 = r62;
                            while (i18 < i14) {
                                int i19 = i18;
                                String str8 = strArr[i19];
                                if ((str2 == null || !(str2.startsWith(str8) || jg.g.A(" ", str8, str2))) && (str3 == null || !(str3.startsWith(str8) || jg.g.A(" ", str8, str3)))) {
                                    str4 = str2;
                                    TLRPC.User user2 = d5Var.m;
                                    r92 = (user2 == null || (n10 = t10.n(user2)) == null || !n10.startsWith(str8)) ? (lowerCase3.startsWith(str8) || jg.g.A(" ", str8, lowerCase3) || (S03 != null && (S03.startsWith(str8) || jg.g.A(" ", str8, S03)))) ? 3 : z9 : 2;
                                } else {
                                    str4 = str2;
                                    r92 = 1;
                                }
                                String str9 = lowerCase3;
                                if (r92 == 0 || (d5Var.e.isEmpty() && d5Var.g.isEmpty())) {
                                    lowerCase3 = str9;
                                    z9 = r92;
                                    str2 = str4;
                                    i18 = i19 + 1;
                                } else {
                                    if (r92 == 3) {
                                        arrayList4.add(org.telegram.messenger.g0.r0(d5Var.i, d5Var.j, str8));
                                    } else if (r92 == 1) {
                                        TLRPC.User user3 = d5Var.m;
                                        arrayList4.add(org.telegram.messenger.g0.r0(user3.first_name, user3.last_name, str8));
                                    } else {
                                        arrayList4.add(org.telegram.messenger.g0.r0("@" + t10.n(d5Var.m), null, "@" + str8));
                                    }
                                    TLRPC.User user4 = d5Var.m;
                                    if (user4 != null) {
                                        longSparseIntArray.put(user4.id, 1);
                                    }
                                    arrayList3.add(d5Var);
                                    i15++;
                                    bjVar2 = bjVar4;
                                    arrayList = arrayList5;
                                    strArr2 = strArr;
                                    r62 = 0;
                                }
                            }
                            i15++;
                            bjVar2 = bjVar4;
                            arrayList = arrayList5;
                            strArr2 = strArr;
                            r62 = 0;
                        }
                    }
                } else {
                    bjVar.h = -1;
                    org.telegram.messenger.g0.h3(new ai.a1(bjVar, bjVar.h, new ArrayList(), new ArrayList(), 19));
                    break;
                }
                break;
            case 3:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) obj4;
                org.telegram.ui.ActionBar.f2 f2Var = (org.telegram.ui.ActionBar.f2) obj3;
                ArrayList arrayList6 = (ArrayList) obj2;
                an anVar = (an) obj;
                boolean z10 = ChatAttachAlertPhotoLayout.q1;
                di diVar = chatAttachAlertPhotoLayout.b;
                if (!diVar.w1 || diVar.x1) {
                    i10 = i13;
                } else {
                    PhotoViewer.p1().H2(null, f2Var, null);
                    PhotoViewer p12 = PhotoViewer.p1();
                    p12.h = 0;
                    p12.n = false;
                    i10 = 3;
                }
                if (diVar.y1) {
                    i10 = 13;
                }
                PhotoViewer.p1().e2(arrayList6, this.c, i10, false, chatAttachAlertPhotoLayout.h1, diVar.y1 ? null : anVar);
                PhotoViewer.p1().u2(diVar.H1);
                if (diVar.w1 && !diVar.x1) {
                    PhotoViewer.p1().O = false;
                } else if (diVar.K2 != 0) {
                    PhotoViewer.p1().O = true;
                    PhotoViewer.p1().P = diVar.L2 != null;
                }
                if (diVar.x1) {
                    PhotoViewer.p1().S0(null, null, false, diVar.A1);
                }
                if (ChatAttachAlertPhotoLayout.V()) {
                    PhotoViewer p13 = PhotoViewer.p1();
                    Editable text = diVar.a1().getText();
                    p13.o7 = true;
                    p13.p7 = text;
                    p13.x2(null, text, false, false);
                    p13.q3(null);
                    break;
                }
                break;
            default:
                final p4.v vVar = (p4.v) obj3;
                final p4.d0 d0Var = (p4.d0) obj2;
                final p4.a1 a1Var = (p4.a1) obj;
                ui.e eVar = ((p4.c1) obj4).b;
                if (!eVar.G(vVar, i13)) {
                    p4.c1.r1(d0Var, vVar, i12, new p4.m1(-4));
                    break;
                } else {
                    pb.b bVar = d0Var.e;
                    d0Var.s(vVar);
                    bVar.getClass();
                    if (i13 != 27) {
                        eVar.f(vVar, i13, new p4.g() { // from class: p4.v0
                            @Override // p4.g
                            public final m9.y run() {
                                return (m9.y) a1.this.l(d0Var, vVar, i12);
                            }
                        });
                        break;
                    } else {
                        a1Var.l(d0Var, vVar, i12);
                        eVar.f(vVar, i13, new p4.u0());
                        break;
                    }
                }
        }
    }

    public /* synthetic */ g0(qb qbVar, File file, String str, int i7, Object obj, int i10) {
        this.d = qbVar;
        this.e = file;
        this.f = str;
        this.b = i7;
        this.h = obj;
        this.c = i10;
    }

    public /* synthetic */ g0(bj bjVar, String str, ArrayList arrayList, ArrayList arrayList2, int i7, int i10) {
        this.d = bjVar;
        this.e = str;
        this.f = arrayList;
        this.h = arrayList2;
        this.b = i7;
        this.c = i10;
    }

    public /* synthetic */ g0(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, int i7, org.telegram.ui.ActionBar.f2 f2Var, ArrayList arrayList, int i10, an anVar) {
        this.d = chatAttachAlertPhotoLayout;
        this.b = i7;
        this.e = f2Var;
        this.f = arrayList;
        this.c = i10;
        this.h = anVar;
    }

    public /* synthetic */ g0(p4.c1 c1Var, p4.v vVar, int i7, p4.d0 d0Var, int i10, p4.a1 a1Var) {
        this.d = c1Var;
        this.e = vVar;
        this.b = i7;
        this.f = d0Var;
        this.c = i10;
        this.h = a1Var;
    }
}
