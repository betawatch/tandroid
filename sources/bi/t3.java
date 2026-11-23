package bi;

import android.content.Context;
import android.text.Editable;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.eg;
import org.telegram.messenger.fc;
import org.telegram.messenger.gj;
import org.telegram.messenger.hd;
import org.telegram.messenger.ls;
import org.telegram.messenger.np;
import org.telegram.messenger.p10;
import org.telegram.messenger.pb;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Cells.j9;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.rj;
import org.telegram.ui.Components.ui;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.bn;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class t3 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;

    public /* synthetic */ t3(Context context, int i7, int i10, TLRPC.TL_messageActionStarGiftOnchainOffer tL_messageActionStarGiftOnchainOffer, org.telegram.ui.ActionBar.h6 h6Var, s3 s3Var) {
        this.d = context;
        this.b = i7;
        this.c = i10;
        this.e = tL_messageActionStarGiftOnchainOffer;
        this.f = h6Var;
        this.h = s3Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v21 */
    /* JADX WARN: Type inference failed for: r10v23 */
    /* JADX WARN: Type inference failed for: r10v28 */
    /* JADX WARN: Type inference failed for: r10v29 */
    /* JADX WARN: Type inference failed for: r10v32 */
    /* JADX WARN: Type inference failed for: r13v12, types: [org.telegram.messenger.hd] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v4, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r7v7, types: [org.telegram.messenger.hd] */
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
                s3 s3Var = (s3) obj;
                i4.f((Context) obj4, this.b, this.c, (TLRPC.TL_messageActionStarGiftOnchainOffer) obj3, (org.telegram.ui.ActionBar.h6) obj2, s3Var.k(), new o3(s3Var, 3));
                break;
            case 1:
                oi.f1 f1Var = (oi.f1) obj3;
                j9 j9Var = (j9) obj2;
                oi.h0 h0Var = (oi.h0) obj;
                oi.i0 i0Var = (oi.i0) ((ji.l) obj4).c;
                if (f1Var.length() >= i13 && f1Var.getSelectionStart() != f1Var.getSelectionEnd() && j9Var.j0(h0Var.a1(), 0, i12, i13)) {
                    i0Var.d = true;
                    f1Var.setSelection(i13);
                    i0Var.d = false;
                    break;
                }
                break;
            case 2:
                pb pbVar = (pb) obj4;
                File file = (File) obj3;
                String str5 = (String) obj2;
                pbVar.getClass();
                if (file != null && ((str5.endsWith(".mp4") || str5.endsWith(".jpg")) && (E = org.telegram.messenger.w7.E(obj)) != null)) {
                    gj gjVar = obj instanceof gj ? (gj) obj : null;
                    long j3 = E.a;
                    if (org.telegram.messenger.c6.m(j3 >= 0 ? 1 : org.telegram.messenger.v3.V(np.u1(i13).O0(Long.valueOf(-j3))) ? 4 : 2, E, gjVar, i13)) {
                        org.telegram.messenger.g0.e(file.toString());
                    }
                }
                ls.f(i13).k(ls.Y1, str5, file);
                fc fcVar = pbVar.b;
                fcVar.s.c(new eg(fcVar, str5, this.c, file, 5));
                break;
            case 3:
                rj rjVar = (rj) obj4;
                ArrayList arrayList = (ArrayList) obj2;
                ArrayList arrayList2 = (ArrayList) obj;
                rjVar.getClass();
                String lowerCase = ((String) obj3).trim().toLowerCase();
                if (lowerCase.length() == 0) {
                    rjVar.h = -1;
                    org.telegram.messenger.g0.g3(new ai.b1(rjVar, rjVar.h, new ArrayList(), new ArrayList(), 21));
                    break;
                } else {
                    String T0 = hd.E0().T0(lowerCase, true, false);
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
                    rj rjVar2 = rjVar;
                    ArrayList arrayList4 = new ArrayList();
                    LongSparseIntArray longSparseIntArray = new LongSparseIntArray();
                    int i15 = 0;
                    while (i15 < arrayList.size()) {
                        org.telegram.messenger.f5 f5Var = (org.telegram.messenger.f5) arrayList.get(i15);
                        rj rjVar3 = rjVar2;
                        String lowerCase2 = org.telegram.messenger.i5.m(r62, f5Var.i, f5Var.j).toLowerCase();
                        ArrayList arrayList5 = arrayList;
                        String T02 = hd.E0().T0(lowerCase2, true, r62);
                        TLRPC.User user = f5Var.m;
                        if (user != null) {
                            strArr = strArr2;
                            String lowerCase3 = org.telegram.messenger.i5.m(r62, user.first_name, user.last_name).toLowerCase();
                            str3 = hd.E0().T0(lowerCase2, true, r62);
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
                                r10 = (user2 == null || (o4 = p10.o(user2)) == null || !o4.startsWith(str6)) ? (lowerCase2.startsWith(str6) || i5.c.B(" ", str6, lowerCase2) || (T02 != null && (T02.startsWith(str6) || i5.c.B(" ", str6, T02)))) ? 3 : z10 : 2;
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
                                    arrayList4.add(org.telegram.messenger.g0.r0("@" + p10.o(f5Var.m), null, "@" + str6));
                                }
                                TLRPC.User user4 = f5Var.m;
                                if (user4 != null) {
                                    longSparseIntArray.put(user4.id, 1);
                                }
                                arrayList3.add(f5Var);
                                i15++;
                                rjVar2 = rjVar3;
                                arrayList = arrayList5;
                                strArr2 = strArr;
                                r62 = 0;
                            }
                        }
                        i15++;
                        rjVar2 = rjVar3;
                        arrayList = arrayList5;
                        strArr2 = strArr;
                        r62 = 0;
                    }
                    rj rjVar4 = rjVar2;
                    String[] strArr3 = strArr2;
                    for (int i18 = 0; i18 < arrayList2.size(); i18 = i7 + 1) {
                        TLRPC.TL_contact tL_contact = (TLRPC.TL_contact) arrayList2.get(i18);
                        if (longSparseIntArray.indexOfKey(tL_contact.user_id) >= 0) {
                            i7 = i18;
                        } else {
                            i7 = i18;
                            TLRPC.User c22 = np.u1(i13).c2(Long.valueOf(tL_contact.user_id));
                            String lowerCase4 = org.telegram.messenger.i5.m(0, c22.first_name, c22.last_name).toLowerCase();
                            String T03 = hd.E0().T0(lowerCase4, true, false);
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
                                    String o10 = p10.o(c22);
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
                                        arrayList4.add(org.telegram.messenger.g0.r0("@" + p10.o(c22), null, "@" + str8));
                                    }
                                    arrayList3.add(c22);
                                }
                            }
                        }
                    }
                    org.telegram.messenger.g0.g3(new ai.b1(rjVar4, this.c, arrayList3, arrayList4, 21));
                    break;
                }
                break;
            case 4:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) obj4;
                org.telegram.ui.ActionBar.g2 g2Var = (org.telegram.ui.ActionBar.g2) obj3;
                ArrayList arrayList6 = (ArrayList) obj2;
                bn bnVar = (bn) obj;
                boolean z11 = ChatAttachAlertPhotoLayout.r1;
                ui uiVar = chatAttachAlertPhotoLayout.b;
                if (!uiVar.A1 || uiVar.B1) {
                    i10 = i13;
                } else {
                    PhotoViewer.p1().I2(null, g2Var, null);
                    PhotoViewer p12 = PhotoViewer.p1();
                    p12.h = 0;
                    p12.n = false;
                    i10 = 3;
                }
                if (uiVar.C1) {
                    i10 = 13;
                }
                PhotoViewer.p1().f2(arrayList6, this.c, i10, false, chatAttachAlertPhotoLayout.i1, uiVar.C1 ? null : bnVar);
                PhotoViewer.p1().v2(uiVar.L1);
                if (uiVar.A1 && !uiVar.B1) {
                    PhotoViewer.p1().P = false;
                } else if (uiVar.O2 != 0) {
                    PhotoViewer.p1().P = true;
                    PhotoViewer.p1().Q = uiVar.P2 != null;
                }
                if (uiVar.B1) {
                    PhotoViewer.p1().S0(null, null, false, uiVar.E1);
                }
                if (ChatAttachAlertPhotoLayout.W()) {
                    PhotoViewer p13 = PhotoViewer.p1();
                    Editable text = uiVar.b1().getText();
                    p13.p7 = true;
                    p13.q7 = text;
                    p13.y2(null, text, false, false);
                    p13.r3(null);
                    break;
                }
                break;
            default:
                final p4.v vVar = (p4.v) obj3;
                final p4.e0 e0Var = (p4.e0) obj2;
                final p4.c1 c1Var = (p4.c1) obj;
                ab.c0 c0Var = ((p4.e1) obj4).b;
                if (c0Var.C(vVar, i13)) {
                    w7.s sVar = e0Var.e;
                    e0Var.s(vVar);
                    sVar.getClass();
                    if (i13 == 27) {
                        c1Var.k(e0Var, vVar, i12);
                        c0Var.c(vVar, i13, new p4.w0());
                        break;
                    } else {
                        c0Var.c(vVar, i13, new p4.g() { // from class: p4.x0
                            @Override // p4.g
                            public final m9.y run() {
                                return (m9.y) c1.this.k(e0Var, vVar, i12);
                            }
                        });
                        break;
                    }
                } else {
                    p4.e1.r1(e0Var, vVar, i12, new p4.o1(-4));
                    break;
                }
        }
    }

    public /* synthetic */ t3(ji.l lVar, oi.f1 f1Var, int i7, j9 j9Var, oi.h0 h0Var, int i10) {
        this.d = lVar;
        this.e = f1Var;
        this.b = i7;
        this.f = j9Var;
        this.h = h0Var;
        this.c = i10;
    }

    public /* synthetic */ t3(pb pbVar, File file, String str, int i7, Object obj, int i10) {
        this.d = pbVar;
        this.e = file;
        this.f = str;
        this.b = i7;
        this.h = obj;
        this.c = i10;
    }

    public /* synthetic */ t3(rj rjVar, String str, ArrayList arrayList, ArrayList arrayList2, int i7, int i10) {
        this.d = rjVar;
        this.e = str;
        this.f = arrayList;
        this.h = arrayList2;
        this.b = i7;
        this.c = i10;
    }

    public /* synthetic */ t3(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, int i7, org.telegram.ui.ActionBar.g2 g2Var, ArrayList arrayList, int i10, bn bnVar) {
        this.d = chatAttachAlertPhotoLayout;
        this.b = i7;
        this.e = g2Var;
        this.f = arrayList;
        this.c = i10;
        this.h = bnVar;
    }

    public /* synthetic */ t3(p4.e1 e1Var, p4.v vVar, int i7, p4.e0 e0Var, int i10, p4.c1 c1Var) {
        this.d = e1Var;
        this.e = vVar;
        this.b = i7;
        this.f = e0Var;
        this.c = i10;
        this.h = c1Var;
    }
}
