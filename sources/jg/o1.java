package jg;

import android.content.Context;
import android.text.style.CharacterStyle;
import hi.u5;
import hi.w4;
import java.util.ArrayList;
import java.util.HashMap;
import ki.d4;
import ki.u3;
import oi.d5;
import oi.l5;
import oi.t5;
import oi.z5;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.bz;
import org.telegram.messenger.f5;
import org.telegram.messenger.fj;
import org.telegram.messenger.gd;
import org.telegram.messenger.i5;
import org.telegram.messenger.ks;
import org.telegram.messenger.mp;
import org.telegram.messenger.o10;
import org.telegram.messenger.ri;
import org.telegram.messenger.tr;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Cells.i9;
import org.telegram.ui.StickersActivity;
import org.telegram.ui.Wallet.p6;
import org.telegram.ui.Wallet.q6;
import org.telegram.ui.Wallet.s6;
import org.telegram.ui.bn;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
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
                    org.telegram.messenger.g0.g3(new ai.g1(s1Var, i14, new ArrayList(), new ArrayList(), s1Var.I, 5));
                    break;
                } else {
                    String S0 = gd.E0().S0(lowerCase, true, false);
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
                        TLRPC.User c22 = mp.u1(i12).c2(Long.valueOf(((TLRPC.TL_contact) arrayList2.get(i16)).user_id));
                        if (s1Var.w || !c22.self) {
                            String[] strArr3 = new String[3];
                            i7 = i12;
                            strArr3[0] = i5.m(0, c22.first_name, c22.last_name).toLowerCase();
                            arrayList = arrayList2;
                            String S02 = gd.E0().S0(strArr3[0], true, false);
                            strArr3[1] = S02;
                            if (strArr3[0].equals(S02)) {
                                strArr3[1] = str2;
                            }
                            if (o10.A(c22)) {
                                strArr3[2] = gd.M0(2131746071, str2).toLowerCase();
                            } else {
                                String str3 = str2;
                                if (c22.self) {
                                    strArr3[2] = gd.M0(2131745706, str3).toLowerCase();
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
                                        String o4 = o10.o(c22);
                                        c11 = (c10 == 0 || o4 == null || !o4.startsWith(str4)) ? c10 : (char) 2;
                                        if (c11 == 0) {
                                            z10 = true;
                                            if (c11 == 1) {
                                                arrayList4.add(org.telegram.messenger.g0.r0(c22.first_name, c22.last_name, str4));
                                                str = null;
                                            } else {
                                                str = null;
                                                arrayList4.add(org.telegram.messenger.g0.r0("@" + o10.o(c22), null, "@" + str4));
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
                                String o42 = o10.o(c22);
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
                        if ((S0 != null && (r1Var2.a.toLowerCase().contains(S0) || r1Var2.a.toLowerCase().contains(S0))) || r1Var2.a.toLowerCase().contains(lowerCase) || r1Var2.a.toLowerCase().contains(lowerCase)) {
                            arrayList5.add(r1Var2.b);
                        }
                    }
                    org.telegram.messenger.g0.g3(new ai.g1(s1Var, i14, arrayList3, arrayList4, arrayList5, 5));
                    break;
                }
                break;
            case 1:
                TLRPC.Document document = (TLRPC.Document) obj2;
                d4.g(i13, (TLRPC.User) obj3, document, i12, new u3((org.telegram.ui.web.o) obj, document, i11));
                break;
            case 2:
                oi.e1 e1Var = (oi.e1) obj2;
                i9 i9Var = (i9) obj;
                oi.p0 p0Var = ((oi.m0) obj3).a;
                if (e1Var.length() >= i13 && e1Var.getSelectionStart() != e1Var.getSelectionEnd() && i9Var.j0(p0Var, 0, i12, i13)) {
                    p0Var.n = true;
                    e1Var.setSelection(i13);
                    p0Var.n = false;
                    break;
                }
                break;
            case 3:
                oi.e1 e1Var2 = (oi.e1) obj2;
                i9 i9Var2 = (i9) obj;
                d5 d5Var = (d5) ((w4) obj3).b;
                if (e1Var2.length() >= i13 && e1Var2.getSelectionStart() != e1Var2.getSelectionEnd()) {
                    if (i9Var2.x()) {
                        d5Var.x = true;
                        e1Var2.setSelection(i13);
                        d5Var.x = false;
                        break;
                    } else if (i9Var2.j0(d5Var, 0, i12, i13)) {
                        d5Var.x = true;
                        e1Var2.setSelection(i13);
                        d5Var.x = false;
                        break;
                    }
                }
                break;
            case 4:
                oi.e1 e1Var3 = (oi.e1) obj2;
                i9 i9Var3 = (i9) obj;
                l5 l5Var = (l5) ((u5) obj3).b;
                if (e1Var3.length() >= i13 && e1Var3.getSelectionStart() != e1Var3.getSelectionEnd() && i9Var3.j0(l5Var, 0, i12, i13)) {
                    l5Var.H = true;
                    e1Var3.setSelection(i13);
                    l5Var.H = false;
                    break;
                }
                break;
            case 5:
                oi.e1 e1Var4 = (oi.e1) obj2;
                i9 i9Var4 = (i9) obj;
                z5 z5Var = ((t5) obj3).a;
                if (e1Var4.length() >= i13 && e1Var4.getSelectionStart() != e1Var4.getSelectionEnd()) {
                    if (i9Var4.x()) {
                        z5Var.G = true;
                        e1Var4.setSelection(i13);
                        z5Var.G = false;
                        break;
                    } else if (i9Var4.j0(z5Var, 0, i12, i13)) {
                        z5Var.G = true;
                        e1Var4.setSelection(i13);
                        z5Var.G = false;
                        break;
                    }
                }
                break;
            case 6:
                oi.e1 e1Var5 = (oi.e1) obj2;
                i9 i9Var5 = (i9) obj;
                z5 z5Var2 = ((oi.u5) obj3).a;
                if (e1Var5.length() >= i13 && e1Var5.getSelectionStart() != e1Var5.getSelectionEnd()) {
                    if (i9Var5.x()) {
                        z5Var2.n = true;
                        e1Var5.setSelection(i13);
                        z5Var2.n = false;
                        break;
                    } else if (i9Var5.j0(z5Var2, 1, i12, i13)) {
                        z5Var2.n = true;
                        e1Var5.setSelection(i13);
                        z5Var2.n = false;
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
                    tr.a0(i12).m1(messages_messages.users, messages_messages.chats, true, true);
                    mp.u1(i12).f4(messages_messages.users, false);
                    mp.u1(i12).Z3(messages_messages.chats, false);
                    int size2 = messages_messages.messages.size();
                    int i22 = 0;
                    for (int i23 = 0; i23 < size2; i23++) {
                        fj fjVar = new fj(i12, messages_messages.messages.get(i23), false, true);
                        if (!fjVar.S4() && !hashMap.containsKey(Integer.valueOf(fjVar.e1()))) {
                            arrayList7.add(0, fjVar);
                            hashMap.put(Integer.valueOf(fjVar.e1()), fjVar);
                            i22++;
                        }
                    }
                    mediaController.t0();
                    mediaController.Y0 = false;
                    mediaController.D0.e = arrayList7.size() == mediaController.D0.d;
                    if (bz.N0) {
                        mediaController.g();
                    }
                    if (i22 != 0) {
                        ks.f(mediaController.v0.K1).k(74, Integer.valueOf(i22));
                        break;
                    }
                }
                break;
            case 8:
                ri riVar = (ri) obj3;
                TLObject tLObject2 = (TLObject) obj2;
                StickersActivity stickersActivity = (StickersActivity) obj;
                int i24 = this.c;
                if (i13 != 0) {
                    if (tLObject2 instanceof TLRPC.TL_messages_stickerSetInstallResultArchive) {
                        riVar.E1(stickersActivity, true, i24, (TLRPC.TL_messages_stickerSetInstallResultArchive) tLObject2);
                    }
                    riVar.e1(i24, false, false, true, null);
                    break;
                } else {
                    riVar.d1(i24, false, true);
                    break;
                }
            case 9:
                bn bnVar = (bn) obj3;
                bnVar.ac = i13;
                bnVar.bc = i12;
                bnVar.cc = (CharacterStyle) obj2;
                ((org.telegram.ui.Cells.q1) obj).invalidate();
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

    public /* synthetic */ o1(bn bnVar, int i7, int i10, CharacterStyle characterStyle, org.telegram.ui.Cells.q1 q1Var) {
        this.a = 9;
        this.d = bnVar;
        this.b = i7;
        this.c = i10;
        this.e = characterStyle;
        this.f = q1Var;
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
