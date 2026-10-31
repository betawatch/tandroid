package bi;

import android.text.Editable;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.b8;
import org.telegram.messenger.cd;
import org.telegram.messenger.cg;
import org.telegram.messenger.h20;
import org.telegram.messenger.hc;
import org.telegram.messenger.j8;
import org.telegram.messenger.jj;
import org.telegram.messenger.js;
import org.telegram.messenger.rb;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.messenger.vp;
import org.telegram.messenger.zs;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Cells.k9;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.aj;
import org.telegram.ui.Components.bi;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.un;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes4.dex */
public final /* synthetic */ class k0 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;

    public /* synthetic */ k0(hf.b bVar, n1 n1Var, int i10, k9 k9Var, m0 m0Var, int i11) {
        this.d = bVar;
        this.e = n1Var;
        this.b = i10;
        this.f = k9Var;
        this.h = m0Var;
        this.c = i11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v11, types: [org.telegram.messenger.cd] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r7v12, types: [org.telegram.messenger.cd] */
    /* JADX WARN: Type inference failed for: r9v20 */
    /* JADX WARN: Type inference failed for: r9v22 */
    /* JADX WARN: Type inference failed for: r9v27 */
    /* JADX WARN: Type inference failed for: r9v28 */
    /* JADX WARN: Type inference failed for: r9v31 */
    @Override // java.lang.Runnable
    public final void run() {
        j8 E;
        ArrayList arrayList;
        int i10;
        String[] strArr;
        String str;
        String str2;
        String str3;
        ?? r92;
        String n10;
        int i11;
        int i12 = this.a;
        final int i13 = this.c;
        ?? r62 = 0;
        Object obj = this.h;
        Object obj2 = this.f;
        Object obj3 = this.e;
        int i14 = this.b;
        Object obj4 = this.d;
        switch (i12) {
            case 0:
                n1 n1Var = (n1) obj3;
                k9 k9Var = (k9) obj2;
                m0 m0Var = (m0) obj;
                n0 n0Var = (n0) ((hf.b) obj4).c;
                if (n1Var.length() >= i14 && n1Var.getSelectionStart() != n1Var.getSelectionEnd() && k9Var.j0(m0Var.J(), 0, i13, i14)) {
                    n0Var.d = true;
                    n1Var.setSelection(i14);
                    n0Var.d = false;
                    break;
                }
                break;
            case 1:
                final m4.w wVar = (m4.w) obj3;
                final m4.f0 f0Var = (m4.f0) obj2;
                final m4.h1 h1Var = (m4.h1) obj;
                xa.n nVar = ((m4.j1) obj4).b;
                if (nVar.M(wVar, i14)) {
                    oa.d dVar = f0Var.e;
                    f0Var.s(wVar);
                    dVar.getClass();
                    if (i14 == 27) {
                        h1Var.f(f0Var, wVar, i13);
                        nVar.i(wVar, i14, new m4.b1());
                        break;
                    } else {
                        nVar.i(wVar, i14, new m4.h() { // from class: m4.c1
                            @Override // m4.h
                            public final j9.y run() {
                                return (j9.y) h1.this.f(f0Var, wVar, i13);
                            }
                        });
                        break;
                    }
                } else {
                    m4.j1.R0(f0Var, wVar, i13, new m4.t1(-4));
                    break;
                }
            case 2:
                rb rbVar = (rb) obj4;
                File file = (File) obj3;
                String str4 = (String) obj2;
                rbVar.getClass();
                if (file != null && ((str4.endsWith(".mp4") || str4.endsWith(".jpg")) && (E = b8.E(obj)) != null)) {
                    jj jjVar = obj instanceof jj ? (jj) obj : null;
                    long j10 = E.a;
                    if (js.l(j10 >= 0 ? 1 : org.telegram.messenger.w3.V(vp.r1(i14).L0(Long.valueOf(-j10))) ? 4 : 2, E, jjVar, i14)) {
                        org.telegram.messenger.i0.e(file.toString());
                    }
                }
                zs.f(i14).k(zs.Y1, str4, file);
                hc hcVar = rbVar.b;
                hcVar.s.c(new cg(hcVar, str4, this.c, file, 5));
                break;
            case 3:
                aj ajVar = (aj) obj4;
                ArrayList arrayList2 = (ArrayList) obj2;
                ajVar.getClass();
                String lowerCase = ((String) obj3).trim().toLowerCase();
                if (lowerCase.length() == 0) {
                    ajVar.h = -1;
                    org.telegram.messenger.i0.g3(new ag.g3(ajVar, ajVar.h, new ArrayList(), new ArrayList(), 14));
                    break;
                } else {
                    String R0 = cd.D0().R0(lowerCase, true, false);
                    if (lowerCase.equals(R0) || R0.length() == 0) {
                        R0 = null;
                    }
                    int i15 = (R0 != null ? 1 : 0) + 1;
                    String[] strArr2 = new String[i15];
                    strArr2[0] = lowerCase;
                    if (R0 != null) {
                        strArr2[1] = R0;
                    }
                    ArrayList arrayList3 = new ArrayList();
                    aj ajVar2 = ajVar;
                    ArrayList arrayList4 = new ArrayList();
                    LongSparseIntArray longSparseIntArray = new LongSparseIntArray();
                    int i16 = 0;
                    while (i16 < arrayList2.size()) {
                        org.telegram.messenger.f5 f5Var = (org.telegram.messenger.f5) arrayList2.get(i16);
                        aj ajVar3 = ajVar2;
                        String lowerCase2 = org.telegram.messenger.i5.m(r62, f5Var.i, f5Var.j).toLowerCase();
                        ArrayList arrayList5 = arrayList2;
                        String R02 = cd.D0().R0(lowerCase2, true, r62);
                        TLRPC.User user = f5Var.m;
                        if (user != null) {
                            strArr = strArr2;
                            String lowerCase3 = org.telegram.messenger.i5.m(r62, user.first_name, user.last_name).toLowerCase();
                            str2 = cd.D0().R0(lowerCase2, true, r62);
                            str = lowerCase3;
                        } else {
                            strArr = strArr2;
                            str = null;
                            str2 = null;
                        }
                        if (lowerCase2.equals(R02)) {
                            R02 = null;
                        }
                        boolean z10 = r62;
                        int i17 = r62;
                        while (i17 < i15) {
                            int i18 = i17;
                            String str5 = strArr[i18];
                            if ((str == null || !(str.startsWith(str5) || sc.e.y(" ", str5, str))) && (str2 == null || !(str2.startsWith(str5) || sc.e.y(" ", str5, str2)))) {
                                str3 = str;
                                TLRPC.User user2 = f5Var.m;
                                r92 = (user2 == null || (n10 = h20.n(user2)) == null || !n10.startsWith(str5)) ? (lowerCase2.startsWith(str5) || sc.e.y(" ", str5, lowerCase2) || (R02 != null && (R02.startsWith(str5) || sc.e.y(" ", str5, R02)))) ? 3 : z10 : 2;
                            } else {
                                str3 = str;
                                r92 = 1;
                            }
                            String str6 = lowerCase2;
                            if (r92 == 0 || (f5Var.e.isEmpty() && f5Var.g.isEmpty())) {
                                lowerCase2 = str6;
                                z10 = r92;
                                str = str3;
                                i17 = i18 + 1;
                            } else {
                                if (r92 == 3) {
                                    arrayList4.add(org.telegram.messenger.i0.r0(f5Var.i, f5Var.j, str5));
                                } else if (r92 == 1) {
                                    TLRPC.User user3 = f5Var.m;
                                    arrayList4.add(org.telegram.messenger.i0.r0(user3.first_name, user3.last_name, str5));
                                } else {
                                    arrayList4.add(org.telegram.messenger.i0.r0("@" + h20.n(f5Var.m), null, "@" + str5));
                                }
                                TLRPC.User user4 = f5Var.m;
                                if (user4 != null) {
                                    longSparseIntArray.put(user4.id, 1);
                                }
                                arrayList3.add(f5Var);
                                i16++;
                                ajVar2 = ajVar3;
                                arrayList2 = arrayList5;
                                strArr2 = strArr;
                                r62 = 0;
                            }
                        }
                        i16++;
                        ajVar2 = ajVar3;
                        arrayList2 = arrayList5;
                        strArr2 = strArr;
                        r62 = 0;
                    }
                    aj ajVar4 = ajVar2;
                    String[] strArr3 = strArr2;
                    int i19 = 0;
                    for (ArrayList arrayList6 = (ArrayList) obj; i19 < arrayList6.size(); arrayList6 = arrayList) {
                        TLRPC.TL_contact tL_contact = (TLRPC.TL_contact) arrayList6.get(i19);
                        if (longSparseIntArray.indexOfKey(tL_contact.user_id) >= 0) {
                            i10 = i19;
                            arrayList = arrayList6;
                        } else {
                            arrayList = arrayList6;
                            TLRPC.User Z1 = vp.r1(i14).Z1(Long.valueOf(tL_contact.user_id));
                            String lowerCase4 = org.telegram.messenger.i5.m(0, Z1.first_name, Z1.last_name).toLowerCase();
                            String R03 = cd.D0().R0(lowerCase4, true, false);
                            if (lowerCase4.equals(R03)) {
                                R03 = null;
                            }
                            char c10 = 0;
                            int i20 = 0;
                            while (i20 < i15) {
                                String str7 = strArr3[i20];
                                if (lowerCase4.startsWith(str7) || sc.e.y(" ", str7, lowerCase4) || (R03 != null && (R03.startsWith(str7) || sc.e.y(" ", str7, R03)))) {
                                    i10 = i19;
                                    c10 = 1;
                                } else {
                                    i10 = i19;
                                    String n11 = h20.n(Z1);
                                    if (n11 != null && n11.startsWith(str7)) {
                                        c10 = 2;
                                    }
                                }
                                if (c10 == 0 || Z1.phone == null) {
                                    i20++;
                                    i19 = i10;
                                } else {
                                    if (c10 == 1) {
                                        arrayList4.add(org.telegram.messenger.i0.r0(Z1.first_name, Z1.last_name, str7));
                                    } else {
                                        arrayList4.add(org.telegram.messenger.i0.r0("@" + h20.n(Z1), null, "@" + str7));
                                    }
                                    arrayList3.add(Z1);
                                    i19 = i10 + 1;
                                }
                            }
                            i10 = i19;
                        }
                        i19 = i10 + 1;
                    }
                    org.telegram.messenger.i0.g3(new ag.g3(ajVar4, this.c, arrayList3, arrayList4, 14));
                    break;
                }
                break;
            default:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) obj4;
                org.telegram.ui.ActionBar.k2 k2Var = (org.telegram.ui.ActionBar.k2) obj3;
                ArrayList arrayList7 = (ArrayList) obj2;
                un unVar = (un) obj;
                boolean z11 = ChatAttachAlertPhotoLayout.q1;
                bi biVar = chatAttachAlertPhotoLayout.b;
                if (!biVar.w1 || biVar.x1) {
                    i11 = i14;
                } else {
                    PhotoViewer.v1().N2(null, k2Var, null);
                    PhotoViewer v12 = PhotoViewer.v1();
                    v12.h = 0;
                    v12.n = false;
                    i11 = 3;
                }
                if (biVar.y1) {
                    i11 = 13;
                }
                PhotoViewer.v1().j2(arrayList7, this.c, i11, false, chatAttachAlertPhotoLayout.h1, biVar.y1 ? null : unVar);
                PhotoViewer.v1().A2(biVar.H1);
                if (biVar.w1 && !biVar.x1) {
                    PhotoViewer.v1().O = false;
                } else if (biVar.K2 != 0) {
                    PhotoViewer.v1().O = true;
                    PhotoViewer.v1().P = biVar.L2 != null;
                }
                if (biVar.x1) {
                    PhotoViewer.v1().Z0(null, null, false, biVar.A1);
                }
                if (ChatAttachAlertPhotoLayout.U()) {
                    PhotoViewer v13 = PhotoViewer.v1();
                    Editable text = biVar.Z0().getText();
                    v13.p7 = true;
                    v13.q7 = text;
                    v13.D2(null, text, false, false);
                    v13.w3(null);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ k0(m4.j1 j1Var, m4.w wVar, int i10, m4.f0 f0Var, int i11, m4.h1 h1Var) {
        this.d = j1Var;
        this.e = wVar;
        this.b = i10;
        this.f = f0Var;
        this.c = i11;
        this.h = h1Var;
    }

    public /* synthetic */ k0(rb rbVar, File file, String str, int i10, Object obj, int i11) {
        this.d = rbVar;
        this.e = file;
        this.f = str;
        this.b = i10;
        this.h = obj;
        this.c = i11;
    }

    public /* synthetic */ k0(aj ajVar, String str, ArrayList arrayList, ArrayList arrayList2, int i10, int i11) {
        this.d = ajVar;
        this.e = str;
        this.f = arrayList;
        this.h = arrayList2;
        this.b = i10;
        this.c = i11;
    }

    public /* synthetic */ k0(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, int i10, org.telegram.ui.ActionBar.k2 k2Var, ArrayList arrayList, int i11, un unVar) {
        this.d = chatAttachAlertPhotoLayout;
        this.b = i10;
        this.e = k2Var;
        this.f = arrayList;
        this.c = i11;
        this.h = unVar;
    }
}
