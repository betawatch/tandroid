package jg;

import android.content.Context;
import android.text.style.CharacterStyle;
import java.util.ArrayList;
import java.util.HashMap;
import ki.i4;
import ki.z3;
import oi.c5;
import oi.k5;
import oi.s5;
import oi.t5;
import oi.y5;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.d5;
import org.telegram.messenger.g5;
import org.telegram.messenger.gj;
import org.telegram.messenger.gz;
import org.telegram.messenger.hd;
import org.telegram.messenger.np;
import org.telegram.messenger.ns;
import org.telegram.messenger.q10;
import org.telegram.messenger.si;
import org.telegram.messenger.vr;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Cells.h9;
import org.telegram.ui.StickersActivity;
import org.telegram.ui.Wallet.a6;
import org.telegram.ui.Wallet.c6;
import org.telegram.ui.Wallet.z5;
import org.telegram.ui.an;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class o1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ o1(int i7, int i10, int i11, Object obj, Object obj2, TLObject tLObject) {
        this.a = i11;
        this.d = obj;
        this.b = i7;
        this.e = tLObject;
        this.f = obj2;
        this.c = i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:170:0x0370 A[LOOP:2: B:151:0x0302->B:170:0x0370, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0336 A[SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i7;
        ArrayList arrayList;
        String str;
        char c10;
        boolean z10;
        h2.a0 a0Var;
        int i10 = this.a;
        int i11 = 0;
        int i12 = this.c;
        int i13 = this.b;
        Object obj = this.f;
        Object obj2 = this.e;
        Object obj3 = this.d;
        switch (i10) {
            case 0:
                s1 s1Var = (s1) obj3;
                ArrayList arrayList2 = (ArrayList) obj;
                s1Var.getClass();
                String lowerCase = ((String) obj2).trim().toLowerCase();
                int length = lowerCase.length();
                int i14 = this.b;
                if (length == 0) {
                    org.telegram.messenger.g0.h3(new ai.f1(s1Var, i14, new ArrayList(), new ArrayList(), s1Var.I, 5));
                    break;
                } else {
                    String S0 = hd.E0().S0(lowerCase, true, false);
                    if (lowerCase.equals(S0) || S0.length() == 0) {
                        S0 = null;
                    }
                    int i15 = (S0 != null ? 1 : 0) + 1;
                    String[] strArr = new String[i15];
                    strArr[0] = lowerCase;
                    if (S0 != null) {
                        strArr[1] = S0;
                    }
                    ArrayList arrayList3 = new ArrayList();
                    ArrayList arrayList4 = new ArrayList();
                    ArrayList arrayList5 = new ArrayList();
                    int i16 = 0;
                    String str2 = null;
                    while (i16 < arrayList2.size()) {
                        String[] strArr2 = strArr;
                        TLRPC.User a22 = np.s1(i12).a2(Long.valueOf(((TLRPC.TL_contact) arrayList2.get(i16)).user_id));
                        if (s1Var.w || !a22.self) {
                            String[] strArr3 = new String[3];
                            i7 = i12;
                            strArr3[0] = g5.m(0, a22.first_name, a22.last_name).toLowerCase();
                            arrayList = arrayList2;
                            String S02 = hd.E0().S0(strArr3[0], true, false);
                            strArr3[1] = S02;
                            if (strArr3[0].equals(S02)) {
                                strArr3[1] = str2;
                            }
                            if (q10.z(a22)) {
                                strArr3[2] = hd.M0(2131746266, str2).toLowerCase();
                            } else {
                                String str3 = str2;
                                if (a22.self) {
                                    strArr3[2] = hd.M0(2131745901, str3).toLowerCase();
                                }
                            }
                            char c11 = 0;
                            for (int i17 = 0; i17 < i15; i17++) {
                                String str4 = strArr2[i17];
                                char c12 = c11;
                                for (int i18 = 0; i18 < 3; i18++) {
                                    String str5 = strArr3[i18];
                                    if (str5 != null && (str5.startsWith(str4) || i5.c.A(" ", str4, str5))) {
                                        c10 = 1;
                                        String n10 = q10.n(a22);
                                        c11 = (c10 == 0 || n10 == null || !n10.startsWith(str4)) ? c10 : (char) 2;
                                        if (c11 == 0) {
                                            z10 = true;
                                            if (c11 == 1) {
                                                arrayList4.add(org.telegram.messenger.g0.r0(a22.first_name, a22.last_name, str4));
                                                str = null;
                                            } else {
                                                str = null;
                                                arrayList4.add(org.telegram.messenger.g0.r0("@" + q10.n(a22), null, "@" + str4));
                                            }
                                            arrayList3.add(a22);
                                            i16++;
                                            str2 = str;
                                            arrayList2 = arrayList;
                                            strArr = strArr2;
                                            i12 = i7;
                                        }
                                    }
                                }
                                c10 = c12;
                                String n102 = q10.n(a22);
                                if (c10 == 0) {
                                }
                                if (c11 == 0) {
                                }
                            }
                            str = null;
                        } else {
                            i7 = i12;
                            arrayList = arrayList2;
                            str = str2;
                        }
                        z10 = true;
                        i16++;
                        str2 = str;
                        arrayList2 = arrayList;
                        strArr = strArr2;
                        i12 = i7;
                    }
                    int i19 = i12;
                    if (s1Var.H == null) {
                        s1Var.H = new ArrayList();
                        ArrayList arrayList6 = g5.r(i19).b0;
                        int size = arrayList6.size();
                        int i20 = 0;
                        while (i20 < size) {
                            Object obj4 = arrayList6.get(i20);
                            i20++;
                            d5 d5Var = (d5) obj4;
                            r1 r1Var = new r1();
                            r1Var.b = d5Var;
                            r1Var.a = (d5Var.i + " " + d5Var.j).toLowerCase();
                            (d5Var.j + " " + d5Var.i).toLowerCase();
                            s1Var.H.add(r1Var);
                        }
                    }
                    for (int i21 = 0; i21 < s1Var.H.size(); i21++) {
                        r1 r1Var2 = (r1) s1Var.H.get(i21);
                        if ((S0 != null && (r1Var2.a.toLowerCase().contains(S0) || r1Var2.a.toLowerCase().contains(S0))) || r1Var2.a.toLowerCase().contains(lowerCase) || r1Var2.a.toLowerCase().contains(lowerCase)) {
                            arrayList5.add(r1Var2.b);
                        }
                    }
                    org.telegram.messenger.g0.h3(new ai.f1(s1Var, i14, arrayList3, arrayList4, arrayList5, 5));
                    break;
                }
                break;
            case 1:
                TLRPC.Document document = (TLRPC.Document) obj2;
                i4.g(i13, (TLRPC.User) obj3, document, i12, new z3((org.telegram.ui.web.o) obj, document, i11));
                break;
            case 2:
                oi.e1 e1Var = (oi.e1) obj2;
                h9 h9Var = (h9) obj;
                oi.p0 p0Var = ((oi.m0) obj3).a;
                if (e1Var.length() >= i13 && e1Var.getSelectionStart() != e1Var.getSelectionEnd() && h9Var.j0(p0Var, 0, i12, i13)) {
                    p0Var.n = true;
                    e1Var.setSelection(i13);
                    p0Var.n = false;
                    break;
                }
                break;
            case 3:
                oi.e1 e1Var2 = (oi.e1) obj2;
                h9 h9Var2 = (h9) obj;
                c5 c5Var = (c5) ((gc.b) obj3).b;
                if (e1Var2.length() >= i13 && e1Var2.getSelectionStart() != e1Var2.getSelectionEnd()) {
                    if (h9Var2.x()) {
                        c5Var.x = true;
                        e1Var2.setSelection(i13);
                        c5Var.x = false;
                        break;
                    } else if (h9Var2.j0(c5Var, 0, i12, i13)) {
                        c5Var.x = true;
                        e1Var2.setSelection(i13);
                        c5Var.x = false;
                        break;
                    }
                }
                break;
            case 4:
                oi.e1 e1Var3 = (oi.e1) obj2;
                h9 h9Var3 = (h9) obj;
                k5 k5Var = (k5) ((ia.d) obj3).b;
                if (e1Var3.length() >= i13 && e1Var3.getSelectionStart() != e1Var3.getSelectionEnd() && h9Var3.j0(k5Var, 0, i12, i13)) {
                    k5Var.H = true;
                    e1Var3.setSelection(i13);
                    k5Var.H = false;
                    break;
                }
                break;
            case 5:
                oi.e1 e1Var4 = (oi.e1) obj2;
                h9 h9Var4 = (h9) obj;
                y5 y5Var = ((s5) obj3).a;
                if (e1Var4.length() >= i13 && e1Var4.getSelectionStart() != e1Var4.getSelectionEnd()) {
                    if (h9Var4.x()) {
                        y5Var.G = true;
                        e1Var4.setSelection(i13);
                        y5Var.G = false;
                        break;
                    } else if (h9Var4.j0(y5Var, 0, i12, i13)) {
                        y5Var.G = true;
                        e1Var4.setSelection(i13);
                        y5Var.G = false;
                        break;
                    }
                }
                break;
            case 6:
                oi.e1 e1Var5 = (oi.e1) obj2;
                h9 h9Var5 = (h9) obj;
                y5 y5Var2 = ((t5) obj3).a;
                if (e1Var5.length() >= i13 && e1Var5.getSelectionStart() != e1Var5.getSelectionEnd()) {
                    if (h9Var5.x()) {
                        y5Var2.n = true;
                        e1Var5.setSelection(i13);
                        y5Var2.n = false;
                        break;
                    } else if (h9Var5.j0(y5Var2, 1, i12, i13)) {
                        y5Var2.n = true;
                        e1Var5.setSelection(i13);
                        y5Var2.n = false;
                        break;
                    }
                }
                break;
            case 7:
                MediaController mediaController = (MediaController) obj3;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                TLObject tLObject = (TLObject) obj;
                ArrayList arrayList7 = mediaController.S0;
                HashMap hashMap = mediaController.T0;
                if (mediaController.a1 == i13 && (a0Var = mediaController.D0) != null && mediaController.v0 != null && tL_error == null) {
                    mediaController.Y0 = false;
                    TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                    a0Var.f = messages_messages.next_rate;
                    vr.a0(i12).m1(messages_messages.users, messages_messages.chats, true, true);
                    np.s1(i12).Y3(messages_messages.users, false);
                    np.s1(i12).S3(messages_messages.chats, false);
                    int size2 = messages_messages.messages.size();
                    int i22 = 0;
                    for (int i23 = 0; i23 < size2; i23++) {
                        gj gjVar = new gj(i12, messages_messages.messages.get(i23), false, true);
                        if (!gjVar.S4() && !hashMap.containsKey(Integer.valueOf(gjVar.e1()))) {
                            arrayList7.add(0, gjVar);
                            hashMap.put(Integer.valueOf(gjVar.e1()), gjVar);
                            i22++;
                        }
                    }
                    mediaController.t0();
                    mediaController.Y0 = false;
                    mediaController.D0.e = arrayList7.size() == mediaController.D0.d;
                    if (gz.N0) {
                        mediaController.g();
                    }
                    if (i22 != 0) {
                        ns.f(mediaController.v0.K1).k(74, Integer.valueOf(i22));
                        break;
                    }
                }
                break;
            case 8:
                si siVar = (si) obj3;
                TLObject tLObject2 = (TLObject) obj2;
                StickersActivity stickersActivity = (StickersActivity) obj;
                int i24 = this.c;
                if (i13 != 0) {
                    if (tLObject2 instanceof TLRPC.TL_messages_stickerSetInstallResultArchive) {
                        siVar.A1(stickersActivity, true, i24, (TLRPC.TL_messages_stickerSetInstallResultArchive) tLObject2);
                    }
                    siVar.b1(i24, false, false, true, null);
                    break;
                } else {
                    siVar.a1(i24, false, true);
                    break;
                }
            case 9:
                an anVar = (an) obj3;
                anVar.Zb = i13;
                anVar.ac = i12;
                anVar.bc = (CharacterStyle) obj2;
                ((org.telegram.ui.Cells.q1) obj).invalidate();
                break;
            default:
                a6 a6Var = (a6) obj;
                org.telegram.messenger.g0.h3(new org.telegram.ui.Wallet.g((c6) obj3, new z5(((Context) obj2).getApplicationContext(), i13, i12, a6Var), a6Var, 16));
                break;
        }
    }

    public /* synthetic */ o1(int i7, TLRPC.User user, TLRPC.Document document, int i10, org.telegram.ui.web.o oVar) {
        this.a = 1;
        this.b = i7;
        this.d = user;
        this.e = document;
        this.c = i10;
        this.f = oVar;
    }

    public /* synthetic */ o1(Object obj, Object obj2, int i7, Object obj3, int i10, int i11) {
        this.a = i11;
        this.d = obj;
        this.e = obj2;
        this.b = i7;
        this.f = obj3;
        this.c = i10;
    }

    public /* synthetic */ o1(an anVar, int i7, int i10, CharacterStyle characterStyle, org.telegram.ui.Cells.q1 q1Var) {
        this.a = 9;
        this.d = anVar;
        this.b = i7;
        this.c = i10;
        this.e = characterStyle;
        this.f = q1Var;
    }

    public /* synthetic */ o1(c6 c6Var, Context context, int i7, int i10, a6 a6Var) {
        this.a = 10;
        this.d = c6Var;
        this.e = context;
        this.b = i7;
        this.c = i10;
        this.f = a6Var;
    }
}
