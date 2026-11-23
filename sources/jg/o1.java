package jg;

import android.content.Context;
import android.text.style.CharacterStyle;
import hi.t5;
import hi.w4;
import java.util.ArrayList;
import java.util.HashMap;
import ki.c4;
import ki.t3;
import oi.a6;
import oi.e5;
import oi.m5;
import oi.u5;
import oi.v5;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.cz;
import org.telegram.messenger.f5;
import org.telegram.messenger.gj;
import org.telegram.messenger.hd;
import org.telegram.messenger.i5;
import org.telegram.messenger.ls;
import org.telegram.messenger.np;
import org.telegram.messenger.p10;
import org.telegram.messenger.si;
import org.telegram.messenger.ur;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Cells.j9;
import org.telegram.ui.StickersActivity;
import org.telegram.ui.Wallet.p6;
import org.telegram.ui.Wallet.q6;
import org.telegram.ui.Wallet.s6;
import org.telegram.ui.bn;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
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
                    org.telegram.messenger.g0.g3(new ai.i1(s1Var, i14, new ArrayList(), new ArrayList(), s1Var.I, 5));
                    break;
                } else {
                    String T0 = hd.E0().T0(lowerCase, true, false);
                    if (lowerCase.equals(T0) || T0.length() == 0) {
                        T0 = null;
                    }
                    int i15 = (T0 != null ? 1 : 0) + 1;
                    String[] strArr = new String[i15];
                    strArr[0] = lowerCase;
                    if (T0 != null) {
                        strArr[1] = T0;
                    }
                    ArrayList arrayList3 = new ArrayList();
                    ArrayList arrayList4 = new ArrayList();
                    ArrayList arrayList5 = new ArrayList();
                    int i16 = 0;
                    String str2 = null;
                    while (i16 < arrayList2.size()) {
                        String[] strArr2 = strArr;
                        TLRPC.User c22 = np.u1(i12).c2(Long.valueOf(((TLRPC.TL_contact) arrayList2.get(i16)).user_id));
                        if (s1Var.w || !c22.self) {
                            String[] strArr3 = new String[3];
                            i7 = i12;
                            strArr3[0] = i5.m(0, c22.first_name, c22.last_name).toLowerCase();
                            arrayList = arrayList2;
                            String T02 = hd.E0().T0(strArr3[0], true, false);
                            strArr3[1] = T02;
                            if (strArr3[0].equals(T02)) {
                                strArr3[1] = str2;
                            }
                            if (p10.A(c22)) {
                                strArr3[2] = hd.N0(2131746070, str2).toLowerCase();
                            } else {
                                String str3 = str2;
                                if (c22.self) {
                                    strArr3[2] = hd.N0(2131745705, str3).toLowerCase();
                                }
                            }
                            char c11 = 0;
                            for (int i17 = 0; i17 < i15; i17++) {
                                String str4 = strArr2[i17];
                                char c12 = c11;
                                for (int i18 = 0; i18 < 3; i18++) {
                                    String str5 = strArr3[i18];
                                    if (str5 != null && (str5.startsWith(str4) || i5.c.B(" ", str4, str5))) {
                                        c10 = 1;
                                        String o4 = p10.o(c22);
                                        c11 = (c10 == 0 || o4 == null || !o4.startsWith(str4)) ? c10 : (char) 2;
                                        if (c11 == 0) {
                                            z10 = true;
                                            if (c11 == 1) {
                                                arrayList4.add(org.telegram.messenger.g0.r0(c22.first_name, c22.last_name, str4));
                                                str = null;
                                            } else {
                                                str = null;
                                                arrayList4.add(org.telegram.messenger.g0.r0("@" + p10.o(c22), null, "@" + str4));
                                            }
                                            arrayList3.add(c22);
                                            i16++;
                                            str2 = str;
                                            arrayList2 = arrayList;
                                            strArr = strArr2;
                                            i12 = i7;
                                        }
                                    }
                                }
                                c10 = c12;
                                String o42 = p10.o(c22);
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
                        ArrayList arrayList6 = i5.r(i19).b0;
                        int size = arrayList6.size();
                        int i20 = 0;
                        while (i20 < size) {
                            Object obj4 = arrayList6.get(i20);
                            i20++;
                            f5 f5Var = (f5) obj4;
                            r1 r1Var = new r1();
                            r1Var.b = f5Var;
                            r1Var.a = (f5Var.i + " " + f5Var.j).toLowerCase();
                            (f5Var.j + " " + f5Var.i).toLowerCase();
                            s1Var.H.add(r1Var);
                        }
                    }
                    for (int i21 = 0; i21 < s1Var.H.size(); i21++) {
                        r1 r1Var2 = (r1) s1Var.H.get(i21);
                        if ((T0 != null && (r1Var2.a.toLowerCase().contains(T0) || r1Var2.a.toLowerCase().contains(T0))) || r1Var2.a.toLowerCase().contains(lowerCase) || r1Var2.a.toLowerCase().contains(lowerCase)) {
                            arrayList5.add(r1Var2.b);
                        }
                    }
                    org.telegram.messenger.g0.g3(new ai.i1(s1Var, i14, arrayList3, arrayList4, arrayList5, 5));
                    break;
                }
                break;
            case 1:
                TLRPC.Document document = (TLRPC.Document) obj2;
                c4.g(i13, (TLRPC.User) obj3, document, i12, new t3((org.telegram.ui.web.o) obj, document, i11));
                break;
            case 2:
                oi.f1 f1Var = (oi.f1) obj2;
                j9 j9Var = (j9) obj;
                oi.q0 q0Var = ((oi.n0) obj3).a;
                if (f1Var.length() >= i13 && f1Var.getSelectionStart() != f1Var.getSelectionEnd() && j9Var.j0(q0Var, 0, i12, i13)) {
                    q0Var.n = true;
                    f1Var.setSelection(i13);
                    q0Var.n = false;
                    break;
                }
                break;
            case 3:
                oi.f1 f1Var2 = (oi.f1) obj2;
                j9 j9Var2 = (j9) obj;
                e5 e5Var = (e5) ((w4) obj3).b;
                if (f1Var2.length() >= i13 && f1Var2.getSelectionStart() != f1Var2.getSelectionEnd()) {
                    if (j9Var2.x()) {
                        e5Var.x = true;
                        f1Var2.setSelection(i13);
                        e5Var.x = false;
                        break;
                    } else if (j9Var2.j0(e5Var, 0, i12, i13)) {
                        e5Var.x = true;
                        f1Var2.setSelection(i13);
                        e5Var.x = false;
                        break;
                    }
                }
                break;
            case 4:
                oi.f1 f1Var3 = (oi.f1) obj2;
                j9 j9Var3 = (j9) obj;
                m5 m5Var = (m5) ((t5) obj3).b;
                if (f1Var3.length() >= i13 && f1Var3.getSelectionStart() != f1Var3.getSelectionEnd() && j9Var3.j0(m5Var, 0, i12, i13)) {
                    m5Var.H = true;
                    f1Var3.setSelection(i13);
                    m5Var.H = false;
                    break;
                }
                break;
            case 5:
                oi.f1 f1Var4 = (oi.f1) obj2;
                j9 j9Var4 = (j9) obj;
                a6 a6Var = ((u5) obj3).a;
                if (f1Var4.length() >= i13 && f1Var4.getSelectionStart() != f1Var4.getSelectionEnd()) {
                    if (j9Var4.x()) {
                        a6Var.G = true;
                        f1Var4.setSelection(i13);
                        a6Var.G = false;
                        break;
                    } else if (j9Var4.j0(a6Var, 0, i12, i13)) {
                        a6Var.G = true;
                        f1Var4.setSelection(i13);
                        a6Var.G = false;
                        break;
                    }
                }
                break;
            case 6:
                oi.f1 f1Var5 = (oi.f1) obj2;
                j9 j9Var5 = (j9) obj;
                a6 a6Var2 = ((v5) obj3).a;
                if (f1Var5.length() >= i13 && f1Var5.getSelectionStart() != f1Var5.getSelectionEnd()) {
                    if (j9Var5.x()) {
                        a6Var2.n = true;
                        f1Var5.setSelection(i13);
                        a6Var2.n = false;
                        break;
                    } else if (j9Var5.j0(a6Var2, 1, i12, i13)) {
                        a6Var2.n = true;
                        f1Var5.setSelection(i13);
                        a6Var2.n = false;
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
                    ur.a0(i12).m1(messages_messages.users, messages_messages.chats, true, true);
                    np.u1(i12).f4(messages_messages.users, false);
                    np.u1(i12).Z3(messages_messages.chats, false);
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
                    if (cz.N0) {
                        mediaController.g();
                    }
                    if (i22 != 0) {
                        ls.f(mediaController.v0.K1).k(74, Integer.valueOf(i22));
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
                        siVar.E1(stickersActivity, true, i24, (TLRPC.TL_messages_stickerSetInstallResultArchive) tLObject2);
                    }
                    siVar.e1(i24, false, false, true, null);
                    break;
                } else {
                    siVar.d1(i24, false, true);
                    break;
                }
            case 9:
                bn bnVar = (bn) obj3;
                bnVar.ac = i13;
                bnVar.bc = i12;
                bnVar.cc = (CharacterStyle) obj2;
                ((org.telegram.ui.Cells.r1) obj).invalidate();
                break;
            default:
                q6 q6Var = (q6) obj;
                org.telegram.messenger.g0.g3(new org.telegram.ui.Wallet.p((s6) obj3, new p6(((Context) obj2).getApplicationContext(), i13, i12, q6Var), q6Var, 16));
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

    public /* synthetic */ o1(bn bnVar, int i7, int i10, CharacterStyle characterStyle, org.telegram.ui.Cells.r1 r1Var) {
        this.a = 9;
        this.d = bnVar;
        this.b = i7;
        this.c = i10;
        this.e = characterStyle;
        this.f = r1Var;
    }

    public /* synthetic */ o1(s6 s6Var, Context context, int i7, int i10, q6 q6Var) {
        this.a = 10;
        this.d = s6Var;
        this.e = context;
        this.b = i7;
        this.c = i10;
        this.f = q6Var;
    }
}
