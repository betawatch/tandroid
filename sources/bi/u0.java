package bi;

import android.content.Context;
import android.text.style.CharacterStyle;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.cd;
import org.telegram.messenger.h20;
import org.telegram.messenger.hs;
import org.telegram.messenger.jj;
import org.telegram.messenger.tz;
import org.telegram.messenger.ui;
import org.telegram.messenger.vp;
import org.telegram.messenger.zs;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Cells.k9;
import org.telegram.ui.StickersActivity;
import org.telegram.ui.un;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes4.dex */
public final /* synthetic */ class u0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;

    public /* synthetic */ u0(int i10, int i11, int i12, Object obj, Object obj2, TLObject tLObject) {
        this.a = i12;
        this.f = obj;
        this.c = i10;
        this.b = tLObject;
        this.d = obj2;
        this.e = i11;
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x0172 A[LOOP:1: B:34:0x0104->B:53:0x0172, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0138 A[SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        e2.a0 a0Var;
        ArrayList arrayList;
        int i10;
        String str;
        int i11 = this.a;
        int i12 = this.c;
        int i13 = this.e;
        Object obj = this.d;
        Object obj2 = this.b;
        Object obj3 = this.f;
        switch (i11) {
            case 0:
                n1 n1Var = (n1) obj2;
                k9 k9Var = (k9) obj;
                y0 y0Var = ((v0) obj3).a;
                if (n1Var.length() >= i12 && n1Var.getSelectionStart() != n1Var.getSelectionEnd() && k9Var.j0(y0Var, 0, i13, i12)) {
                    y0Var.n = true;
                    n1Var.setSelection(i12);
                    y0Var.n = false;
                    break;
                }
                break;
            case 1:
                n1 n1Var2 = (n1) obj2;
                k9 k9Var2 = (k9) obj;
                r5 r5Var = (r5) ((a4.l) obj3).b;
                if (n1Var2.length() >= i12 && n1Var2.getSelectionStart() != n1Var2.getSelectionEnd()) {
                    if (k9Var2.x()) {
                        r5Var.x = true;
                        n1Var2.setSelection(i12);
                        r5Var.x = false;
                        break;
                    } else if (k9Var2.j0(r5Var, 0, i13, i12)) {
                        r5Var.x = true;
                        n1Var2.setSelection(i12);
                        r5Var.x = false;
                        break;
                    }
                }
                break;
            case 2:
                n1 n1Var3 = (n1) obj2;
                k9 k9Var3 = (k9) obj;
                z5 z5Var = (z5) ((k6.h) obj3).b;
                if (n1Var3.length() >= i12 && n1Var3.getSelectionStart() != n1Var3.getSelectionEnd() && k9Var3.j0(z5Var, 0, i13, i12)) {
                    z5Var.G = true;
                    n1Var3.setSelection(i12);
                    z5Var.G = false;
                    break;
                }
                break;
            case 3:
                n1 n1Var4 = (n1) obj2;
                k9 k9Var4 = (k9) obj;
                q6 q6Var = ((k6) obj3).a;
                if (n1Var4.length() >= i12 && n1Var4.getSelectionStart() != n1Var4.getSelectionEnd()) {
                    if (k9Var4.x()) {
                        q6Var.F = true;
                        n1Var4.setSelection(i12);
                        q6Var.F = false;
                        break;
                    } else if (k9Var4.j0(q6Var, 0, i13, i12)) {
                        q6Var.F = true;
                        n1Var4.setSelection(i12);
                        q6Var.F = false;
                        break;
                    }
                }
                break;
            case 4:
                n1 n1Var5 = (n1) obj2;
                k9 k9Var5 = (k9) obj;
                q6 q6Var2 = ((l6) obj3).a;
                if (n1Var5.length() >= i12 && n1Var5.getSelectionStart() != n1Var5.getSelectionEnd()) {
                    if (k9Var5.x()) {
                        q6Var2.n = true;
                        n1Var5.setSelection(i12);
                        q6Var2.n = false;
                        break;
                    } else if (k9Var5.j0(q6Var2, 1, i13, i12)) {
                        q6Var2.n = true;
                        n1Var5.setSelection(i12);
                        q6Var2.n = false;
                        break;
                    }
                }
                break;
            case 5:
                MediaController mediaController = (MediaController) obj3;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                TLObject tLObject = (TLObject) obj;
                ArrayList arrayList2 = mediaController.R0;
                HashMap hashMap = mediaController.S0;
                if (mediaController.Z0 == i12 && (a0Var = mediaController.C0) != null && mediaController.u0 != null && tL_error == null) {
                    mediaController.X0 = false;
                    TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                    a0Var.f = messages_messages.next_rate;
                    hs.a0(i13).m1(messages_messages.users, messages_messages.chats, true, true);
                    vp.r1(i13).V3(messages_messages.users, false);
                    vp.r1(i13).P3(messages_messages.chats, false);
                    int size = messages_messages.messages.size();
                    int i14 = 0;
                    for (int i15 = 0; i15 < size; i15++) {
                        jj jjVar = new jj(i13, messages_messages.messages.get(i15), false, true);
                        if (!jjVar.S4() && !hashMap.containsKey(Integer.valueOf(jjVar.f1()))) {
                            arrayList2.add(0, jjVar);
                            hashMap.put(Integer.valueOf(jjVar.f1()), jjVar);
                            i14++;
                        }
                    }
                    mediaController.t0();
                    mediaController.X0 = false;
                    mediaController.C0.e = arrayList2.size() == mediaController.C0.d;
                    if (tz.N0) {
                        mediaController.g();
                    }
                    if (i14 != 0) {
                        zs.f(mediaController.u0.I1).k(74, Integer.valueOf(i14));
                        break;
                    }
                }
                break;
            case 6:
                ui uiVar = (ui) obj3;
                TLObject tLObject2 = (TLObject) obj2;
                StickersActivity stickersActivity = (StickersActivity) obj;
                int i16 = this.e;
                if (i12 != 0) {
                    if (tLObject2 instanceof TLRPC.TL_messages_stickerSetInstallResultArchive) {
                        uiVar.A1(stickersActivity, true, i16, (TLRPC.TL_messages_stickerSetInstallResultArchive) tLObject2);
                    }
                    uiVar.b1(i16, false, false, true, null);
                    break;
                } else {
                    uiVar.a1(i16, false, true);
                    break;
                }
            case 7:
                un unVar = (un) obj3;
                unVar.Rb = i12;
                unVar.Sb = i13;
                unVar.Tb = (CharacterStyle) obj2;
                ((org.telegram.ui.Cells.q1) obj).invalidate();
                break;
            case 8:
                org.telegram.ui.Wallet.d6 d6Var = (org.telegram.ui.Wallet.d6) obj;
                org.telegram.messenger.i0.g3(new org.telegram.ui.Wallet.g((org.telegram.ui.Wallet.g6) obj3, new org.telegram.ui.Wallet.c6(((Context) obj2).getApplicationContext(), i12, i13, d6Var), d6Var, 15));
                break;
            case 9:
                TLRPC.Document document = (TLRPC.Document) obj2;
                xh.q3.g(i12, (TLRPC.User) obj3, document, i13, new xh.j3((org.telegram.ui.web.o) obj, document, 0));
                break;
            default:
                zf.f1 f1Var = (zf.f1) obj3;
                ArrayList arrayList3 = (ArrayList) obj;
                f1Var.getClass();
                String lowerCase = ((String) obj2).trim().toLowerCase();
                int length = lowerCase.length();
                int i17 = this.c;
                if (length == 0) {
                    org.telegram.messenger.i0.g3(new i2.g1(f1Var, i17, new ArrayList(), new ArrayList(), f1Var.H, 25));
                    break;
                } else {
                    String R0 = cd.D0().R0(lowerCase, true, false);
                    if (lowerCase.equals(R0) || R0.length() == 0) {
                        R0 = null;
                    }
                    int i18 = (R0 != null ? 1 : 0) + 1;
                    String[] strArr = new String[i18];
                    strArr[0] = lowerCase;
                    if (R0 != null) {
                        strArr[1] = R0;
                    }
                    ArrayList arrayList4 = new ArrayList();
                    ArrayList arrayList5 = new ArrayList();
                    ArrayList arrayList6 = new ArrayList();
                    int i19 = 0;
                    String str2 = null;
                    while (i19 < arrayList3.size()) {
                        String[] strArr2 = strArr;
                        TLRPC.User Z1 = vp.r1(i13).Z1(Long.valueOf(((TLRPC.TL_contact) arrayList3.get(i19)).user_id));
                        if (f1Var.w || !Z1.self) {
                            String[] strArr3 = new String[3];
                            arrayList = arrayList3;
                            strArr3[0] = org.telegram.messenger.i5.m(0, Z1.first_name, Z1.last_name).toLowerCase();
                            i10 = i17;
                            String R02 = cd.D0().R0(strArr3[0], true, false);
                            strArr3[1] = R02;
                            if (strArr3[0].equals(R02)) {
                                strArr3[1] = str2;
                            }
                            if (h20.z(Z1)) {
                                strArr3[2] = cd.L0(2131746281, str2).toLowerCase();
                            } else {
                                String str3 = str2;
                                if (Z1.self) {
                                    strArr3[2] = cd.L0(2131745918, str3).toLowerCase();
                                }
                            }
                            char c10 = 0;
                            int i20 = 0;
                            while (true) {
                                if (i20 < i18) {
                                    String str4 = strArr2[i20];
                                    char c11 = c10;
                                    for (int i21 = 0; i21 < 3; i21++) {
                                        String str5 = strArr3[i21];
                                        if (str5 != null && (str5.startsWith(str4) || sc.e.y(" ", str4, str5))) {
                                            c11 = 1;
                                            String n10 = h20.n(Z1);
                                            c10 = (c11 == 0 || n10 == null || !n10.startsWith(str4)) ? c11 : (char) 2;
                                            if (c10 == 0) {
                                                if (c10 == 1) {
                                                    arrayList5.add(org.telegram.messenger.i0.r0(Z1.first_name, Z1.last_name, str4));
                                                    str = null;
                                                } else {
                                                    str = null;
                                                    arrayList5.add(org.telegram.messenger.i0.r0("@" + h20.n(Z1), null, "@" + str4));
                                                }
                                                arrayList4.add(Z1);
                                            } else {
                                                i20++;
                                            }
                                        }
                                    }
                                    String n102 = h20.n(Z1);
                                    if (c11 == 0) {
                                    }
                                    if (c10 == 0) {
                                    }
                                } else {
                                    str = null;
                                }
                            }
                        } else {
                            arrayList = arrayList3;
                            i10 = i17;
                            str = str2;
                        }
                        i19++;
                        str2 = str;
                        strArr = strArr2;
                        arrayList3 = arrayList;
                        i17 = i10;
                    }
                    int i22 = i17;
                    if (f1Var.G == null) {
                        f1Var.G = new ArrayList();
                        ArrayList arrayList7 = org.telegram.messenger.i5.r(i13).a0;
                        int size2 = arrayList7.size();
                        int i23 = 0;
                        while (i23 < size2) {
                            Object obj4 = arrayList7.get(i23);
                            i23++;
                            org.telegram.messenger.f5 f5Var = (org.telegram.messenger.f5) obj4;
                            zf.e1 e1Var = new zf.e1();
                            e1Var.b = f5Var;
                            e1Var.a = (f5Var.i + " " + f5Var.j).toLowerCase();
                            (f5Var.j + " " + f5Var.i).toLowerCase();
                            f1Var.G.add(e1Var);
                        }
                    }
                    for (int i24 = 0; i24 < f1Var.G.size(); i24++) {
                        zf.e1 e1Var2 = (zf.e1) f1Var.G.get(i24);
                        if ((R0 != null && (e1Var2.a.toLowerCase().contains(R0) || e1Var2.a.toLowerCase().contains(R0))) || e1Var2.a.toLowerCase().contains(lowerCase) || e1Var2.a.toLowerCase().contains(lowerCase)) {
                            arrayList6.add(e1Var2.b);
                        }
                    }
                    org.telegram.messenger.i0.g3(new i2.g1(f1Var, i22, arrayList4, arrayList5, arrayList6, 25));
                    break;
                }
                break;
        }
    }

    public /* synthetic */ u0(int i10, TLRPC.User user, TLRPC.Document document, int i11, org.telegram.ui.web.o oVar) {
        this.a = 9;
        this.c = i10;
        this.f = user;
        this.b = document;
        this.e = i11;
        this.d = oVar;
    }

    public /* synthetic */ u0(Object obj, Object obj2, int i10, Object obj3, int i11, int i12) {
        this.a = i12;
        this.f = obj;
        this.b = obj2;
        this.c = i10;
        this.d = obj3;
        this.e = i11;
    }

    public /* synthetic */ u0(un unVar, int i10, int i11, CharacterStyle characterStyle, org.telegram.ui.Cells.q1 q1Var) {
        this.a = 7;
        this.f = unVar;
        this.c = i10;
        this.e = i11;
        this.b = characterStyle;
        this.d = q1Var;
    }

    public /* synthetic */ u0(org.telegram.ui.Wallet.g6 g6Var, Context context, int i10, int i11, org.telegram.ui.Wallet.d6 d6Var) {
        this.a = 8;
        this.f = g6Var;
        this.b = context;
        this.c = i10;
        this.e = i11;
        this.d = d6Var;
    }
}
