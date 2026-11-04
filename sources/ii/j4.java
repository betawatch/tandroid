package ii;

import android.content.Context;
import android.text.style.CharacterStyle;
import gi.v5;
import java.util.ArrayList;
import java.util.HashMap;
import mi.b6;
import mi.f5;
import mi.n5;
import mi.w5;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.az;
import org.telegram.messenger.bd;
import org.telegram.messenger.d5;
import org.telegram.messenger.g5;
import org.telegram.messenger.hp;
import org.telegram.messenger.hs;
import org.telegram.messenger.l10;
import org.telegram.messenger.li;
import org.telegram.messenger.qr;
import org.telegram.messenger.zi;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Cells.h9;
import org.telegram.ui.StickersActivity;
import org.telegram.ui.Wallet.a6;
import org.telegram.ui.Wallet.x5;
import org.telegram.ui.Wallet.y5;
import org.telegram.ui.wm;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class j4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ j4(int i3, int i10, int i11, Object obj, Object obj2, TLObject tLObject) {
        this.a = i11;
        this.d = obj;
        this.b = i3;
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
        boolean z10;
        String str;
        char c2;
        g2.b0 b0Var;
        int i3 = this.a;
        int i10 = this.c;
        int i11 = this.b;
        Object obj = this.f;
        Object obj2 = this.e;
        Object obj3 = this.d;
        switch (i3) {
            case 0:
                TLRPC.Document document = (TLRPC.Document) obj2;
                o4.g(i11, (TLRPC.User) obj3, document, i10, new e4((org.telegram.ui.web.p) obj, document, 0));
                break;
            case 1:
                kg.o1 o1Var = (kg.o1) obj3;
                ArrayList arrayList2 = (ArrayList) obj;
                o1Var.getClass();
                String lowerCase = ((String) obj2).trim().toLowerCase();
                int length = lowerCase.length();
                int i12 = this.b;
                if (length == 0) {
                    org.telegram.messenger.g0.h3(new ai.p1(o1Var, i12, new ArrayList(), new ArrayList(), o1Var.I, 7));
                    break;
                } else {
                    String S0 = bd.E0().S0(lowerCase, true, false);
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
                        TLRPC.User a22 = hp.s1(i10).a2(Long.valueOf(((TLRPC.TL_contact) arrayList2.get(i14)).user_id));
                        if (o1Var.w || !a22.self) {
                            String[] strArr4 = new String[3];
                            strArr4[0] = g5.m(0, a22.first_name, a22.last_name).toLowerCase();
                            arrayList = arrayList2;
                            String S02 = bd.E0().S0(strArr4[0], true, false);
                            strArr4[1] = S02;
                            if (strArr4[0].equals(S02)) {
                                strArr4[1] = str2;
                            }
                            if (l10.z(a22)) {
                                strArr4[2] = bd.M0(2131746274, str2).toLowerCase();
                            } else {
                                String str3 = str2;
                                if (a22.self) {
                                    strArr4[2] = bd.M0(2131745911, str3).toLowerCase();
                                }
                            }
                            int i16 = 0;
                            char c10 = 0;
                            while (true) {
                                if (i16 < i13) {
                                    String str4 = strArr3[i16];
                                    int i17 = i16;
                                    for (int i18 = 0; i18 < 3; i18++) {
                                        String str5 = strArr4[i18];
                                        if (str5 != null && (str5.startsWith(str4) || k2.p1.z(" ", str4, str5))) {
                                            c2 = 1;
                                            String n4 = l10.n(a22);
                                            c10 = (c2 == 0 || n4 == null || !n4.startsWith(str4)) ? c2 : (char) 2;
                                            if (c10 == 0) {
                                                z10 = true;
                                                if (c10 == 1) {
                                                    arrayList4.add(org.telegram.messenger.g0.r0(a22.first_name, a22.last_name, str4));
                                                    str = null;
                                                } else {
                                                    str = null;
                                                    arrayList4.add(org.telegram.messenger.g0.r0("@" + l10.n(a22), null, "@" + str4));
                                                }
                                                arrayList3.add(a22);
                                            } else {
                                                i16 = i17 + 1;
                                            }
                                        }
                                    }
                                    c2 = c10;
                                    String n42 = l10.n(a22);
                                    if (c2 == 0) {
                                    }
                                    if (c10 == 0) {
                                    }
                                } else {
                                    z10 = true;
                                    str = null;
                                }
                            }
                        } else {
                            arrayList = arrayList2;
                            str = str2;
                            z10 = true;
                        }
                        str2 = str;
                        strArr2 = strArr3;
                        arrayList2 = arrayList;
                        i14 = i15 + 1;
                    }
                    if (o1Var.H == null) {
                        o1Var.H = new ArrayList();
                        ArrayList arrayList6 = g5.r(i10).b0;
                        int size = arrayList6.size();
                        int i19 = 0;
                        while (i19 < size) {
                            Object obj4 = arrayList6.get(i19);
                            i19++;
                            d5 d5Var = (d5) obj4;
                            kg.n1 n1Var = new kg.n1();
                            n1Var.b = d5Var;
                            n1Var.a = (d5Var.i + " " + d5Var.j).toLowerCase();
                            (d5Var.j + " " + d5Var.i).toLowerCase();
                            o1Var.H.add(n1Var);
                        }
                    }
                    for (int i20 = 0; i20 < o1Var.H.size(); i20++) {
                        kg.n1 n1Var2 = (kg.n1) o1Var.H.get(i20);
                        if ((S0 != null && (n1Var2.a.toLowerCase().contains(S0) || n1Var2.a.toLowerCase().contains(S0))) || n1Var2.a.toLowerCase().contains(lowerCase) || n1Var2.a.toLowerCase().contains(lowerCase)) {
                            arrayList5.add(n1Var2.b);
                        }
                    }
                    org.telegram.messenger.g0.h3(new ai.p1(o1Var, i12, arrayList3, arrayList4, arrayList5, 7));
                    break;
                }
                break;
            case 2:
                mi.h1 h1Var = (mi.h1) obj2;
                h9 h9Var = (h9) obj;
                mi.s0 s0Var = ((mi.p0) obj3).a;
                if (h1Var.length() >= i11 && h1Var.getSelectionStart() != h1Var.getSelectionEnd() && h9Var.j0(s0Var, 0, i10, i11)) {
                    s0Var.n = true;
                    h1Var.setSelection(i11);
                    s0Var.n = false;
                    break;
                }
                break;
            case 3:
                mi.h1 h1Var2 = (mi.h1) obj2;
                h9 h9Var2 = (h9) obj;
                f5 f5Var = (f5) ((v5) obj3).b;
                if (h1Var2.length() >= i11 && h1Var2.getSelectionStart() != h1Var2.getSelectionEnd()) {
                    if (h9Var2.x()) {
                        f5Var.x = true;
                        h1Var2.setSelection(i11);
                        f5Var.x = false;
                        break;
                    } else if (h9Var2.j0(f5Var, 0, i10, i11)) {
                        f5Var.x = true;
                        h1Var2.setSelection(i11);
                        f5Var.x = false;
                        break;
                    }
                }
                break;
            case 4:
                mi.h1 h1Var3 = (mi.h1) obj2;
                h9 h9Var3 = (h9) obj;
                n5 n5Var = (n5) ((hi.d) obj3).b;
                if (h1Var3.length() >= i11 && h1Var3.getSelectionStart() != h1Var3.getSelectionEnd() && h9Var3.j0(n5Var, 0, i10, i11)) {
                    n5Var.H = true;
                    h1Var3.setSelection(i11);
                    n5Var.H = false;
                    break;
                }
                break;
            case 5:
                mi.h1 h1Var4 = (mi.h1) obj2;
                h9 h9Var4 = (h9) obj;
                b6 b6Var = ((mi.v5) obj3).a;
                if (h1Var4.length() >= i11 && h1Var4.getSelectionStart() != h1Var4.getSelectionEnd()) {
                    if (h9Var4.x()) {
                        b6Var.G = true;
                        h1Var4.setSelection(i11);
                        b6Var.G = false;
                        break;
                    } else if (h9Var4.j0(b6Var, 0, i10, i11)) {
                        b6Var.G = true;
                        h1Var4.setSelection(i11);
                        b6Var.G = false;
                        break;
                    }
                }
                break;
            case 6:
                mi.h1 h1Var5 = (mi.h1) obj2;
                h9 h9Var5 = (h9) obj;
                b6 b6Var2 = ((w5) obj3).a;
                if (h1Var5.length() >= i11 && h1Var5.getSelectionStart() != h1Var5.getSelectionEnd()) {
                    if (h9Var5.x()) {
                        b6Var2.n = true;
                        h1Var5.setSelection(i11);
                        b6Var2.n = false;
                        break;
                    } else if (h9Var5.j0(b6Var2, 1, i10, i11)) {
                        b6Var2.n = true;
                        h1Var5.setSelection(i11);
                        b6Var2.n = false;
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
                if (mediaController.a1 == i11 && (b0Var = mediaController.D0) != null && mediaController.v0 != null && tL_error == null) {
                    mediaController.Y0 = false;
                    TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                    b0Var.f = messages_messages.next_rate;
                    qr.a0(i10).m1(messages_messages.users, messages_messages.chats, true, true);
                    hp.s1(i10).Y3(messages_messages.users, false);
                    hp.s1(i10).S3(messages_messages.chats, false);
                    int size2 = messages_messages.messages.size();
                    int i21 = 0;
                    for (int i22 = 0; i22 < size2; i22++) {
                        zi ziVar = new zi(i10, messages_messages.messages.get(i22), false, true);
                        if (!ziVar.T4() && !hashMap.containsKey(Integer.valueOf(ziVar.f1()))) {
                            arrayList7.add(0, ziVar);
                            hashMap.put(Integer.valueOf(ziVar.f1()), ziVar);
                            i21++;
                        }
                    }
                    mediaController.t0();
                    mediaController.Y0 = false;
                    mediaController.D0.e = arrayList7.size() == mediaController.D0.d;
                    if (az.N0) {
                        mediaController.g();
                    }
                    if (i21 != 0) {
                        hs.f(mediaController.v0.I1).k(74, Integer.valueOf(i21));
                        break;
                    }
                }
                break;
            case 8:
                li liVar = (li) obj3;
                TLObject tLObject2 = (TLObject) obj2;
                StickersActivity stickersActivity = (StickersActivity) obj;
                int i23 = this.c;
                if (i11 != 0) {
                    if (tLObject2 instanceof TLRPC.TL_messages_stickerSetInstallResultArchive) {
                        liVar.A1(stickersActivity, true, i23, (TLRPC.TL_messages_stickerSetInstallResultArchive) tLObject2);
                    }
                    liVar.b1(i23, false, false, true, null);
                    break;
                } else {
                    liVar.a1(i23, false, true);
                    break;
                }
            case 9:
                wm wmVar = (wm) obj3;
                wmVar.Xb = i11;
                wmVar.Yb = i10;
                wmVar.Zb = (CharacterStyle) obj2;
                ((org.telegram.ui.Cells.q1) obj).invalidate();
                break;
            default:
                y5 y5Var = (y5) obj;
                org.telegram.messenger.g0.h3(new org.telegram.ui.Wallet.g((a6) obj3, new x5(((Context) obj2).getApplicationContext(), i11, i10, y5Var), y5Var, 15));
                break;
        }
    }

    public /* synthetic */ j4(int i3, TLRPC.User user, TLRPC.Document document, int i10, org.telegram.ui.web.p pVar) {
        this.a = 0;
        this.b = i3;
        this.d = user;
        this.e = document;
        this.c = i10;
        this.f = pVar;
    }

    public /* synthetic */ j4(Object obj, Object obj2, int i3, Object obj3, int i10, int i11) {
        this.a = i11;
        this.d = obj;
        this.e = obj2;
        this.b = i3;
        this.f = obj3;
        this.c = i10;
    }

    public /* synthetic */ j4(wm wmVar, int i3, int i10, CharacterStyle characterStyle, org.telegram.ui.Cells.q1 q1Var) {
        this.a = 9;
        this.d = wmVar;
        this.b = i3;
        this.c = i10;
        this.e = characterStyle;
        this.f = q1Var;
    }

    public /* synthetic */ j4(a6 a6Var, Context context, int i3, int i10, y5 y5Var) {
        this.a = 10;
        this.d = a6Var;
        this.e = context;
        this.b = i3;
        this.c = i10;
        this.f = y5Var;
    }
}
