package hi;

import android.content.Context;
import android.text.style.CharacterStyle;
import bi.ub;
import java.util.ArrayList;
import java.util.HashMap;
import li.a6;
import li.e5;
import li.m5;
import li.u5;
import li.v5;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.d5;
import org.telegram.messenger.g5;
import org.telegram.messenger.hd;
import org.telegram.messenger.ij;
import org.telegram.messenger.iz;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.messenger.t10;
import org.telegram.messenger.ui;
import org.telegram.messenger.yr;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Cells.i9;
import org.telegram.ui.StickersActivity;
import org.telegram.ui.Wallet.c6;
import org.telegram.ui.Wallet.z5;
import org.telegram.ui.an;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes4.dex */
public final /* synthetic */ class j4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ j4(int i7, int i10, int i11, Object obj, Object obj2, TLObject tLObject) {
        this.a = i11;
        this.d = obj;
        this.b = i7;
        this.e = tLObject;
        this.f = obj2;
        this.c = i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:167:0x0361 A[LOOP:2: B:148:0x02f4->B:167:0x0361, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0327 A[SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        ArrayList arrayList;
        boolean z9;
        String str;
        char c10;
        h2.a0 a0Var;
        int i7 = this.a;
        int i10 = this.c;
        int i11 = this.b;
        Object obj = this.f;
        Object obj2 = this.e;
        Object obj3 = this.d;
        switch (i7) {
            case 0:
                TLRPC.Document document = (TLRPC.Document) obj2;
                o4.g(i11, (TLRPC.User) obj3, document, i10, new e4((org.telegram.ui.web.n) obj, document, 0));
                break;
            case 1:
                jg.s1 s1Var = (jg.s1) obj3;
                ArrayList arrayList2 = (ArrayList) obj;
                s1Var.getClass();
                String lowerCase = ((String) obj2).trim().toLowerCase();
                int length = lowerCase.length();
                int i12 = this.b;
                if (length == 0) {
                    org.telegram.messenger.g0.h3(new ub(s1Var, i12, new ArrayList(), new ArrayList(), s1Var.H, 5));
                    break;
                } else {
                    String S0 = hd.E0().S0(lowerCase, true, false);
                    if (lowerCase.equals(S0) || S0.length() == 0) {
                        S0 = null;
                    }
                    int i13 = (S0 != null ? 1 : 0) + 1;
                    String[] strArr = new String[i13];
                    strArr[0] = lowerCase;
                    if (S0 != null) {
                        strArr[1] = S0;
                    }
                    ArrayList arrayList3 = new ArrayList();
                    ArrayList arrayList4 = new ArrayList();
                    String[] strArr2 = strArr;
                    ArrayList arrayList5 = new ArrayList();
                    int i14 = 0;
                    String str2 = null;
                    while (i14 < arrayList2.size()) {
                        String[] strArr3 = strArr2;
                        int i15 = i14;
                        TLRPC.User a22 = qp.s1(i10).a2(Long.valueOf(((TLRPC.TL_contact) arrayList2.get(i14)).user_id));
                        if (s1Var.w || !a22.self) {
                            String[] strArr4 = new String[3];
                            strArr4[0] = g5.m(0, a22.first_name, a22.last_name).toLowerCase();
                            arrayList = arrayList2;
                            String S02 = hd.E0().S0(strArr4[0], true, false);
                            strArr4[1] = S02;
                            if (strArr4[0].equals(S02)) {
                                strArr4[1] = str2;
                            }
                            if (t10.z(a22)) {
                                strArr4[2] = hd.M0(2131746265, str2).toLowerCase();
                            } else {
                                String str3 = str2;
                                if (a22.self) {
                                    strArr4[2] = hd.M0(2131745902, str3).toLowerCase();
                                }
                            }
                            int i16 = 0;
                            char c11 = 0;
                            while (true) {
                                if (i16 < i13) {
                                    String str4 = strArr3[i16];
                                    int i17 = i16;
                                    for (int i18 = 0; i18 < 3; i18++) {
                                        String str5 = strArr4[i18];
                                        if (str5 != null && (str5.startsWith(str4) || jg.g.A(" ", str4, str5))) {
                                            c10 = 1;
                                            String n10 = t10.n(a22);
                                            c11 = (c10 == 0 || n10 == null || !n10.startsWith(str4)) ? c10 : (char) 2;
                                            if (c11 == 0) {
                                                z9 = true;
                                                if (c11 == 1) {
                                                    arrayList4.add(org.telegram.messenger.g0.r0(a22.first_name, a22.last_name, str4));
                                                    str = null;
                                                } else {
                                                    str = null;
                                                    arrayList4.add(org.telegram.messenger.g0.r0("@" + t10.n(a22), null, "@" + str4));
                                                }
                                                arrayList3.add(a22);
                                            } else {
                                                i16 = i17 + 1;
                                            }
                                        }
                                    }
                                    c10 = c11;
                                    String n102 = t10.n(a22);
                                    if (c10 == 0) {
                                    }
                                    if (c11 == 0) {
                                    }
                                } else {
                                    z9 = true;
                                    str = null;
                                }
                            }
                        } else {
                            arrayList = arrayList2;
                            str = str2;
                            z9 = true;
                        }
                        str2 = str;
                        strArr2 = strArr3;
                        arrayList2 = arrayList;
                        i14 = i15 + 1;
                    }
                    if (s1Var.G == null) {
                        s1Var.G = new ArrayList();
                        ArrayList arrayList6 = g5.r(i10).a0;
                        int size = arrayList6.size();
                        int i19 = 0;
                        while (i19 < size) {
                            Object obj4 = arrayList6.get(i19);
                            i19++;
                            d5 d5Var = (d5) obj4;
                            jg.r1 r1Var = new jg.r1();
                            r1Var.b = d5Var;
                            r1Var.a = (d5Var.i + " " + d5Var.j).toLowerCase();
                            (d5Var.j + " " + d5Var.i).toLowerCase();
                            s1Var.G.add(r1Var);
                        }
                    }
                    for (int i20 = 0; i20 < s1Var.G.size(); i20++) {
                        jg.r1 r1Var2 = (jg.r1) s1Var.G.get(i20);
                        if ((S0 != null && (r1Var2.a.toLowerCase().contains(S0) || r1Var2.a.toLowerCase().contains(S0))) || r1Var2.a.toLowerCase().contains(lowerCase) || r1Var2.a.toLowerCase().contains(lowerCase)) {
                            arrayList5.add(r1Var2.b);
                        }
                    }
                    org.telegram.messenger.g0.h3(new ub(s1Var, i12, arrayList3, arrayList4, arrayList5, 5));
                    break;
                }
                break;
            case 2:
                li.g1 g1Var = (li.g1) obj2;
                i9 i9Var = (i9) obj;
                li.r0 r0Var = ((li.o0) obj3).a;
                if (g1Var.length() >= i11 && g1Var.getSelectionStart() != g1Var.getSelectionEnd() && i9Var.j0(r0Var, 0, i10, i11)) {
                    r0Var.n = true;
                    g1Var.setSelection(i11);
                    r0Var.n = false;
                    break;
                }
                break;
            case 3:
                li.g1 g1Var2 = (li.g1) obj2;
                i9 i9Var2 = (i9) obj;
                e5 e5Var = (e5) ((h9.f1) obj3).b;
                if (g1Var2.length() >= i11 && g1Var2.getSelectionStart() != g1Var2.getSelectionEnd()) {
                    if (i9Var2.x()) {
                        e5Var.x = true;
                        g1Var2.setSelection(i11);
                        e5Var.x = false;
                        break;
                    } else if (i9Var2.j0(e5Var, 0, i10, i11)) {
                        e5Var.x = true;
                        g1Var2.setSelection(i11);
                        e5Var.x = false;
                        break;
                    }
                }
                break;
            case 4:
                li.g1 g1Var3 = (li.g1) obj2;
                i9 i9Var3 = (i9) obj;
                m5 m5Var = (m5) ((g6.d0) obj3).b;
                if (g1Var3.length() >= i11 && g1Var3.getSelectionStart() != g1Var3.getSelectionEnd() && i9Var3.j0(m5Var, 0, i10, i11)) {
                    m5Var.G = true;
                    g1Var3.setSelection(i11);
                    m5Var.G = false;
                    break;
                }
                break;
            case 5:
                li.g1 g1Var4 = (li.g1) obj2;
                i9 i9Var4 = (i9) obj;
                a6 a6Var = ((u5) obj3).a;
                if (g1Var4.length() >= i11 && g1Var4.getSelectionStart() != g1Var4.getSelectionEnd()) {
                    if (i9Var4.x()) {
                        a6Var.F = true;
                        g1Var4.setSelection(i11);
                        a6Var.F = false;
                        break;
                    } else if (i9Var4.j0(a6Var, 0, i10, i11)) {
                        a6Var.F = true;
                        g1Var4.setSelection(i11);
                        a6Var.F = false;
                        break;
                    }
                }
                break;
            case 6:
                li.g1 g1Var5 = (li.g1) obj2;
                i9 i9Var5 = (i9) obj;
                a6 a6Var2 = ((v5) obj3).a;
                if (g1Var5.length() >= i11 && g1Var5.getSelectionStart() != g1Var5.getSelectionEnd()) {
                    if (i9Var5.x()) {
                        a6Var2.n = true;
                        g1Var5.setSelection(i11);
                        a6Var2.n = false;
                        break;
                    } else if (i9Var5.j0(a6Var2, 1, i10, i11)) {
                        a6Var2.n = true;
                        g1Var5.setSelection(i11);
                        a6Var2.n = false;
                        break;
                    }
                }
                break;
            case 7:
                MediaController mediaController = (MediaController) obj3;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                TLObject tLObject = (TLObject) obj;
                ArrayList arrayList7 = mediaController.R0;
                HashMap hashMap = mediaController.S0;
                if (mediaController.Z0 == i11 && (a0Var = mediaController.C0) != null && mediaController.u0 != null && tL_error == null) {
                    mediaController.X0 = false;
                    TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                    a0Var.f = messages_messages.next_rate;
                    yr.a0(i10).m1(messages_messages.users, messages_messages.chats, true, true);
                    qp.s1(i10).Y3(messages_messages.users, false);
                    qp.s1(i10).S3(messages_messages.chats, false);
                    int size2 = messages_messages.messages.size();
                    int i21 = 0;
                    for (int i22 = 0; i22 < size2; i22++) {
                        ij ijVar = new ij(i10, messages_messages.messages.get(i22), false, true);
                        if (!ijVar.T4() && !hashMap.containsKey(Integer.valueOf(ijVar.f1()))) {
                            arrayList7.add(0, ijVar);
                            hashMap.put(Integer.valueOf(ijVar.f1()), ijVar);
                            i21++;
                        }
                    }
                    mediaController.t0();
                    mediaController.X0 = false;
                    mediaController.C0.e = arrayList7.size() == mediaController.C0.d;
                    if (iz.N0) {
                        mediaController.g();
                    }
                    if (i21 != 0) {
                        qs.f(mediaController.u0.I1).k(74, Integer.valueOf(i21));
                        break;
                    }
                }
                break;
            case 8:
                ui uiVar = (ui) obj3;
                TLObject tLObject2 = (TLObject) obj2;
                StickersActivity stickersActivity = (StickersActivity) obj;
                int i23 = this.c;
                if (i11 != 0) {
                    if (tLObject2 instanceof TLRPC.TL_messages_stickerSetInstallResultArchive) {
                        uiVar.A1(stickersActivity, true, i23, (TLRPC.TL_messages_stickerSetInstallResultArchive) tLObject2);
                    }
                    uiVar.b1(i23, false, false, true, null);
                    break;
                } else {
                    uiVar.a1(i23, false, true);
                    break;
                }
            case 9:
                an anVar = (an) obj3;
                anVar.Wb = i11;
                anVar.Xb = i10;
                anVar.Yb = (CharacterStyle) obj2;
                ((org.telegram.ui.Cells.q1) obj).invalidate();
                break;
            default:
                org.telegram.ui.Wallet.a6 a6Var3 = (org.telegram.ui.Wallet.a6) obj;
                org.telegram.messenger.g0.h3(new org.telegram.ui.Wallet.g((c6) obj3, new z5(((Context) obj2).getApplicationContext(), i11, i10, a6Var3), a6Var3, 15));
                break;
        }
    }

    public /* synthetic */ j4(int i7, TLRPC.User user, TLRPC.Document document, int i10, org.telegram.ui.web.n nVar) {
        this.a = 0;
        this.b = i7;
        this.d = user;
        this.e = document;
        this.c = i10;
        this.f = nVar;
    }

    public /* synthetic */ j4(Object obj, Object obj2, int i7, Object obj3, int i10, int i11) {
        this.a = i11;
        this.d = obj;
        this.e = obj2;
        this.b = i7;
        this.f = obj3;
        this.c = i10;
    }

    public /* synthetic */ j4(an anVar, int i7, int i10, CharacterStyle characterStyle, org.telegram.ui.Cells.q1 q1Var) {
        this.a = 9;
        this.d = anVar;
        this.b = i7;
        this.c = i10;
        this.e = characterStyle;
        this.f = q1Var;
    }

    public /* synthetic */ j4(c6 c6Var, Context context, int i7, int i10, org.telegram.ui.Wallet.a6 a6Var) {
        this.a = 10;
        this.d = c6Var;
        this.e = context;
        this.b = i7;
        this.c = i10;
        this.f = a6Var;
    }
}
