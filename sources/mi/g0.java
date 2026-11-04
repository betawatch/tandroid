package mi;

import android.text.Editable;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.bd;
import org.telegram.messenger.e8;
import org.telegram.messenger.hp;
import org.telegram.messenger.hs;
import org.telegram.messenger.jb;
import org.telegram.messenger.l10;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.messenger.vf;
import org.telegram.messenger.w7;
import org.telegram.messenger.zb;
import org.telegram.messenger.zi;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Cells.h9;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.aj;
import org.telegram.ui.Components.bi;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.wm;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes4.dex */
public final /* synthetic */ class g0 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;

    public /* synthetic */ g0(h0 h0Var, h1 h1Var, int i3, h9 h9Var, j0 j0Var, int i10) {
        this.d = h0Var;
        this.e = h1Var;
        this.b = i3;
        this.f = h9Var;
        this.h = j0Var;
        this.c = i10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v11, types: [org.telegram.messenger.bd] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r7v12, types: [org.telegram.messenger.bd] */
    /* JADX WARN: Type inference failed for: r9v20 */
    /* JADX WARN: Type inference failed for: r9v22 */
    /* JADX WARN: Type inference failed for: r9v27 */
    /* JADX WARN: Type inference failed for: r9v28 */
    /* JADX WARN: Type inference failed for: r9v31 */
    @Override // java.lang.Runnable
    public final void run() {
        e8 E;
        ArrayList arrayList;
        int i3;
        String[] strArr;
        String str;
        String str2;
        String str3;
        ?? r9;
        String n4;
        int i10;
        int i11 = this.a;
        final int i12 = this.c;
        ?? r62 = 0;
        Object obj = this.h;
        Object obj2 = this.f;
        Object obj3 = this.e;
        int i13 = this.b;
        Object obj4 = this.d;
        switch (i11) {
            case 0:
                h1 h1Var = (h1) obj3;
                h9 h9Var = (h9) obj2;
                j0 j0Var = (j0) obj;
                k0 k0Var = (k0) ((h0) obj4).c;
                if (h1Var.length() >= i13 && h1Var.getSelectionStart() != h1Var.getSelectionEnd() && h9Var.j0(j0Var.e1(), 0, i12, i13)) {
                    k0Var.d = true;
                    h1Var.setSelection(i13);
                    k0Var.d = false;
                    break;
                }
                break;
            case 1:
                final o4.v vVar = (o4.v) obj3;
                final o4.e0 e0Var = (o4.e0) obj2;
                final o4.f1 f1Var = (o4.f1) obj;
                ui.f fVar = ((o4.h1) obj4).b;
                if (fVar.w(vVar, i13)) {
                    kb.a aVar = e0Var.e;
                    e0Var.s(vVar);
                    aVar.getClass();
                    if (i13 == 27) {
                        f1Var.i(e0Var, vVar, i12);
                        fVar.b(vVar, i13, new o4.y0());
                        break;
                    } else {
                        fVar.b(vVar, i13, new o4.g() { // from class: o4.z0
                            @Override // o4.g
                            public final l9.y run() {
                                return (l9.y) f1.this.i(e0Var, vVar, i12);
                            }
                        });
                        break;
                    }
                } else {
                    o4.h1.R0(e0Var, vVar, i12, new o4.r1(-4));
                    break;
                }
            case 2:
                jb jbVar = (jb) obj4;
                File file = (File) obj3;
                String str4 = (String) obj2;
                jbVar.getClass();
                if (file != null && ((str4.endsWith(".mp4") || str4.endsWith(".jpg")) && (E = w7.E(obj)) != null)) {
                    zi ziVar = obj instanceof zi ? (zi) obj : null;
                    long j10 = E.a;
                    if (org.telegram.messenger.b6.k(j10 >= 0 ? 1 : org.telegram.messenger.t3.V(hp.s1(i13).M0(Long.valueOf(-j10))) ? 4 : 2, E, ziVar, i13)) {
                        org.telegram.messenger.g0.e(file.toString());
                    }
                }
                hs.f(i13).k(hs.Y1, str4, file);
                zb zbVar = jbVar.b;
                zbVar.s.c(new vf(zbVar, str4, this.c, file, 5));
                break;
            case 3:
                aj ajVar = (aj) obj4;
                ArrayList arrayList2 = (ArrayList) obj2;
                ajVar.getClass();
                String lowerCase = ((String) obj3).trim().toLowerCase();
                if (lowerCase.length() == 0) {
                    ajVar.h = -1;
                    org.telegram.messenger.g0.h3(new bi.q0(ajVar, ajVar.h, new ArrayList(), new ArrayList(), 20));
                    break;
                } else {
                    String S0 = bd.E0().S0(lowerCase, true, false);
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
                    aj ajVar2 = ajVar;
                    ArrayList arrayList4 = new ArrayList();
                    LongSparseIntArray longSparseIntArray = new LongSparseIntArray();
                    int i15 = 0;
                    while (i15 < arrayList2.size()) {
                        org.telegram.messenger.d5 d5Var = (org.telegram.messenger.d5) arrayList2.get(i15);
                        aj ajVar3 = ajVar2;
                        String lowerCase2 = org.telegram.messenger.g5.m(r62, d5Var.i, d5Var.j).toLowerCase();
                        ArrayList arrayList5 = arrayList2;
                        String S02 = bd.E0().S0(lowerCase2, true, r62);
                        TLRPC.User user = d5Var.m;
                        if (user != null) {
                            strArr = strArr2;
                            String lowerCase3 = org.telegram.messenger.g5.m(r62, user.first_name, user.last_name).toLowerCase();
                            str2 = bd.E0().S0(lowerCase2, true, r62);
                            str = lowerCase3;
                        } else {
                            strArr = strArr2;
                            str = null;
                            str2 = null;
                        }
                        if (lowerCase2.equals(S02)) {
                            S02 = null;
                        }
                        boolean z10 = r62;
                        int i16 = r62;
                        while (i16 < i14) {
                            int i17 = i16;
                            String str5 = strArr[i17];
                            if ((str == null || !(str.startsWith(str5) || k2.p1.z(" ", str5, str))) && (str2 == null || !(str2.startsWith(str5) || k2.p1.z(" ", str5, str2)))) {
                                str3 = str;
                                TLRPC.User user2 = d5Var.m;
                                r9 = (user2 == null || (n4 = l10.n(user2)) == null || !n4.startsWith(str5)) ? (lowerCase2.startsWith(str5) || k2.p1.z(" ", str5, lowerCase2) || (S02 != null && (S02.startsWith(str5) || k2.p1.z(" ", str5, S02)))) ? 3 : z10 : 2;
                            } else {
                                str3 = str;
                                r9 = 1;
                            }
                            String str6 = lowerCase2;
                            if (r9 == 0 || (d5Var.e.isEmpty() && d5Var.g.isEmpty())) {
                                lowerCase2 = str6;
                                z10 = r9;
                                str = str3;
                                i16 = i17 + 1;
                            } else {
                                if (r9 == 3) {
                                    arrayList4.add(org.telegram.messenger.g0.r0(d5Var.i, d5Var.j, str5));
                                } else if (r9 == 1) {
                                    TLRPC.User user3 = d5Var.m;
                                    arrayList4.add(org.telegram.messenger.g0.r0(user3.first_name, user3.last_name, str5));
                                } else {
                                    arrayList4.add(org.telegram.messenger.g0.r0("@" + l10.n(d5Var.m), null, "@" + str5));
                                }
                                TLRPC.User user4 = d5Var.m;
                                if (user4 != null) {
                                    longSparseIntArray.put(user4.id, 1);
                                }
                                arrayList3.add(d5Var);
                                i15++;
                                ajVar2 = ajVar3;
                                arrayList2 = arrayList5;
                                strArr2 = strArr;
                                r62 = 0;
                            }
                        }
                        i15++;
                        ajVar2 = ajVar3;
                        arrayList2 = arrayList5;
                        strArr2 = strArr;
                        r62 = 0;
                    }
                    aj ajVar4 = ajVar2;
                    String[] strArr3 = strArr2;
                    int i18 = 0;
                    for (ArrayList arrayList6 = (ArrayList) obj; i18 < arrayList6.size(); arrayList6 = arrayList) {
                        TLRPC.TL_contact tL_contact = (TLRPC.TL_contact) arrayList6.get(i18);
                        if (longSparseIntArray.indexOfKey(tL_contact.user_id) >= 0) {
                            i3 = i18;
                            arrayList = arrayList6;
                        } else {
                            arrayList = arrayList6;
                            TLRPC.User a22 = hp.s1(i13).a2(Long.valueOf(tL_contact.user_id));
                            String lowerCase4 = org.telegram.messenger.g5.m(0, a22.first_name, a22.last_name).toLowerCase();
                            String S03 = bd.E0().S0(lowerCase4, true, false);
                            if (lowerCase4.equals(S03)) {
                                S03 = null;
                            }
                            char c2 = 0;
                            int i19 = 0;
                            while (i19 < i14) {
                                String str7 = strArr3[i19];
                                if (lowerCase4.startsWith(str7) || k2.p1.z(" ", str7, lowerCase4) || (S03 != null && (S03.startsWith(str7) || k2.p1.z(" ", str7, S03)))) {
                                    i3 = i18;
                                    c2 = 1;
                                } else {
                                    i3 = i18;
                                    String n10 = l10.n(a22);
                                    if (n10 != null && n10.startsWith(str7)) {
                                        c2 = 2;
                                    }
                                }
                                if (c2 == 0 || a22.phone == null) {
                                    i19++;
                                    i18 = i3;
                                } else {
                                    if (c2 == 1) {
                                        arrayList4.add(org.telegram.messenger.g0.r0(a22.first_name, a22.last_name, str7));
                                    } else {
                                        arrayList4.add(org.telegram.messenger.g0.r0("@" + l10.n(a22), null, "@" + str7));
                                    }
                                    arrayList3.add(a22);
                                    i18 = i3 + 1;
                                }
                            }
                            i3 = i18;
                        }
                        i18 = i3 + 1;
                    }
                    org.telegram.messenger.g0.h3(new bi.q0(ajVar4, this.c, arrayList3, arrayList4, 20));
                    break;
                }
                break;
            default:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) obj4;
                org.telegram.ui.ActionBar.d2 d2Var = (org.telegram.ui.ActionBar.d2) obj3;
                ArrayList arrayList7 = (ArrayList) obj2;
                wm wmVar = (wm) obj;
                boolean z11 = ChatAttachAlertPhotoLayout.r1;
                bi biVar = chatAttachAlertPhotoLayout.b;
                if (!biVar.x1 || biVar.y1) {
                    i10 = i13;
                } else {
                    PhotoViewer.v1().N2(null, d2Var, null);
                    PhotoViewer v12 = PhotoViewer.v1();
                    v12.h = 0;
                    v12.n = false;
                    i10 = 3;
                }
                if (biVar.z1) {
                    i10 = 13;
                }
                PhotoViewer.v1().j2(arrayList7, this.c, i10, false, chatAttachAlertPhotoLayout.i1, biVar.z1 ? null : wmVar);
                PhotoViewer.v1().A2(biVar.I1);
                if (biVar.x1 && !biVar.y1) {
                    PhotoViewer.v1().P = false;
                } else if (biVar.L2 != 0) {
                    PhotoViewer.v1().P = true;
                    PhotoViewer.v1().Q = biVar.M2 != null;
                }
                if (biVar.y1) {
                    PhotoViewer.v1().Z0(null, null, false, biVar.B1);
                }
                if (ChatAttachAlertPhotoLayout.V()) {
                    PhotoViewer v13 = PhotoViewer.v1();
                    Editable text = biVar.a1().getText();
                    v13.q7 = true;
                    v13.r7 = text;
                    v13.D2(null, text, false, false);
                    v13.w3(null);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ g0(o4.h1 h1Var, o4.v vVar, int i3, o4.e0 e0Var, int i10, o4.f1 f1Var) {
        this.d = h1Var;
        this.e = vVar;
        this.b = i3;
        this.f = e0Var;
        this.c = i10;
        this.h = f1Var;
    }

    public /* synthetic */ g0(jb jbVar, File file, String str, int i3, Object obj, int i10) {
        this.d = jbVar;
        this.e = file;
        this.f = str;
        this.b = i3;
        this.h = obj;
        this.c = i10;
    }

    public /* synthetic */ g0(aj ajVar, String str, ArrayList arrayList, ArrayList arrayList2, int i3, int i10) {
        this.d = ajVar;
        this.e = str;
        this.f = arrayList;
        this.h = arrayList2;
        this.b = i3;
        this.c = i10;
    }

    public /* synthetic */ g0(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, int i3, org.telegram.ui.ActionBar.d2 d2Var, ArrayList arrayList, int i10, wm wmVar) {
        this.d = chatAttachAlertPhotoLayout;
        this.b = i3;
        this.e = d2Var;
        this.f = arrayList;
        this.c = i10;
        this.h = wmVar;
    }
}
