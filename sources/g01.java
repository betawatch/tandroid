// default package

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.MediaController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class g01 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ g01(int i, TLRPC.User user, TLRPC.Document document, int i2, yu0 yu0Var) {
        this.a = (byte) 9;
        this.c = i;
        this.b = user;
        this.f = document;
        this.d = i2;
        this.e = yu0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x017f A[LOOP:1: B:36:0x0115->B:55:0x017f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0146 A[SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        ko6 ko6Var;
        String[] strArr;
        int i;
        byte b = this.a;
        int i2 = 3;
        int i3 = this.c;
        Object obj = this.e;
        int i4 = this.d;
        Object obj2 = this.f;
        Object obj3 = this.b;
        switch (b) {
            case 0:
                w01 w01Var = (w01) obj3;
                r01 r01Var = (r01) obj2;
                n01 n01Var = (n01) obj;
                byte b2 = n01Var.a;
                ArrayList arrayList = w01Var.P;
                l01 l01Var = w01Var.a;
                if (i3 == w01Var.b) {
                    int i5 = r01Var.g;
                    s01 s01Var = r01Var.a;
                    if (i5 == i4 && r01Var.e != null && arrayList.contains(r01Var)) {
                        r01Var.e = null;
                        w01Var.v--;
                        if (b2 == 1) {
                            w01Var.A(r01Var.h, l01Var.h(), r01Var.i);
                            r01Var.f = l01Var.j(new x30(w01Var, r01Var, (byte) 25), 100L);
                            break;
                        } else {
                            arrayList.remove(r01Var);
                            if (b2 == 0) {
                                w01Var.x(r01Var.d, n01Var.c);
                                v01 v01Var = new v01(r01Var.b, r01Var.c, r01Var.d, n01Var.b, n01Var.c);
                                ArrayList arrayList2 = s01Var.f;
                                for (int i6 = 0; i6 < arrayList2.size(); i6++) {
                                    if (((v01) arrayList2.get(i6)).a.equals(r01Var.b)) {
                                        arrayList2.set(i6, v01Var);
                                    }
                                }
                                s01 s01Var2 = new s01(s01Var.a, 0, null, 0, s01Var.e);
                                s01Var2.f.add(v01Var);
                                l01Var.b(s01Var2);
                                break;
                            }
                        }
                    }
                }
                break;
            case 1:
                w01 w01Var2 = (w01) obj3;
                m01 m01Var = (m01) obj2;
                n01 n01Var2 = (n01) obj;
                if (i3 == w01Var2.b) {
                    int i7 = m01Var.e;
                    long j = m01Var.a;
                    if (i7 == i4 && w01Var2.d.get(Long.valueOf(j)) == m01Var && m01Var.c != null) {
                        boolean z = w01Var2.F;
                        l01 l01Var2 = w01Var2.a;
                        long h = l01Var2.h();
                        m01Var.c = null;
                        w01Var2.v--;
                        byte b3 = n01Var2.a;
                        int i8 = n01Var2.c;
                        if (b3 != 0) {
                            if (b3 != 1) {
                                if (b3 != 2) {
                                    if (b3 == 3) {
                                        l01Var2.d("rejoin needed at " + j);
                                        w01Var2.e(false);
                                        w01Var2.c = (byte) 3;
                                        w01Var2.o = h;
                                        l01Var2.f();
                                        break;
                                    }
                                } else {
                                    w01Var2.A(m01Var.f, h, m01Var.g);
                                    l01Var2.d("resync at " + j);
                                    if (z) {
                                        w01Var2.z(n01Var2.d);
                                        break;
                                    } else {
                                        w01Var2.e(false);
                                        w01.d(w01Var2.l);
                                        w01Var2.l = null;
                                        w01Var2.y();
                                        break;
                                    }
                                }
                            } else {
                                w01Var2.A(m01Var.f, h, m01Var.g);
                                m01Var.d = l01Var2.j(new x30(w01Var2, m01Var, (byte) 24), 100L);
                                break;
                            }
                        } else {
                            m01Var.h = n01Var2.b;
                            m01Var.i = i8;
                            m01Var.j = n01Var2.e;
                            if (z) {
                                m01Var.l += i8;
                                HashMap hashMap = n01Var2.f;
                                if (hashMap != null) {
                                    w01Var2.I = hashMap;
                                    w01Var2.v(m01Var, hashMap);
                                }
                                w01Var2.i(m01Var, h);
                                break;
                            } else {
                                a64 k = w01Var2.k();
                                double max = h - Math.max(m01Var.f, w01Var2.w);
                                if (m01Var.g) {
                                    max -= k.b();
                                }
                                k.c(i8, max);
                                w01Var2.x(m01Var.b, i8);
                                w01Var2.w = h;
                                w01Var2.x = m01Var.b;
                                w01Var2.j();
                                w01Var2.w();
                                break;
                            }
                        }
                    }
                }
                break;
            case 2:
                MediaController mediaController = (MediaController) obj3;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                TLObject tLObject = (TLObject) obj;
                String[] strArr2 = MediaController.W1;
                ArrayList arrayList3 = mediaController.S0;
                HashMap hashMap2 = mediaController.T0;
                if (mediaController.a1 == i3 && (ko6Var = mediaController.D0) != null && mediaController.v0 != null && tL_error == null) {
                    mediaController.Y0 = false;
                    TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                    ko6Var.h = messages_messages.next_rate;
                    cf7.Y(i4).j1(messages_messages.users, messages_messages.chats, true, true);
                    oc7.r1(i4).d4(messages_messages.users, false);
                    oc7.r1(i4).X3(messages_messages.chats, false);
                    int size = messages_messages.messages.size();
                    int i9 = 0;
                    for (int i10 = 0; i10 < size; i10++) {
                        k47 k47Var = new k47(i4, messages_messages.messages.get(i10), false, true);
                        if (!k47Var.R4() && !hashMap2.containsKey(Integer.valueOf(k47Var.e1()))) {
                            arrayList3.add(0, k47Var);
                            hashMap2.put(Integer.valueOf(k47Var.e1()), k47Var);
                            i9++;
                        }
                    }
                    mediaController.s0();
                    mediaController.Y0 = false;
                    mediaController.D0.g = arrayList3.size() == mediaController.D0.f;
                    if (gda.J0) {
                        mediaController.b();
                    }
                    if (i9 != 0) {
                        nm7.f(mediaController.v0.K1).k(75, Integer.valueOf(i9));
                        break;
                    }
                }
                break;
            case 3:
                ne9 ne9Var = (ne9) obj2;
                gkb gkbVar = (gkb) obj;
                be9 be9Var = ((yd9) obj3).a;
                if (ne9Var.length() >= i3 && ne9Var.getSelectionStart() != ne9Var.getSelectionEnd() && gkbVar.i0(be9Var, 0, i4, i3)) {
                    be9Var.n = true;
                    ne9Var.setSelection(i3);
                    be9Var.n = false;
                    break;
                }
                break;
            case 4:
                ne9 ne9Var2 = (ne9) obj2;
                gkb gkbVar2 = (gkb) obj;
                ck9 ck9Var = (ck9) ((x59) obj3).b;
                if (ne9Var2.length() >= i3 && ne9Var2.getSelectionStart() != ne9Var2.getSelectionEnd()) {
                    if (gkbVar2.w()) {
                        ck9Var.x = true;
                        ne9Var2.setSelection(i3);
                        ck9Var.x = false;
                        break;
                    } else if (gkbVar2.i0(ck9Var, 0, i4, i3)) {
                        ck9Var.x = true;
                        ne9Var2.setSelection(i3);
                        ck9Var.x = false;
                        break;
                    }
                }
                break;
            case 5:
                ne9 ne9Var3 = (ne9) obj2;
                gkb gkbVar3 = (gkb) obj;
                kk9 kk9Var = (kk9) ((cf9) obj3).b;
                if (ne9Var3.length() >= i3 && ne9Var3.getSelectionStart() != ne9Var3.getSelectionEnd() && gkbVar3.i0(kk9Var, 0, i4, i3)) {
                    kk9Var.H = true;
                    ne9Var3.setSelection(i3);
                    kk9Var.H = false;
                    break;
                }
                break;
            case 6:
                ne9 ne9Var4 = (ne9) obj2;
                gkb gkbVar4 = (gkb) obj;
                xk9 xk9Var = ((sk9) obj3).a;
                if (ne9Var4.length() >= i3 && ne9Var4.getSelectionStart() != ne9Var4.getSelectionEnd()) {
                    if (gkbVar4.w()) {
                        xk9Var.G = true;
                        ne9Var4.setSelection(i3);
                        xk9Var.G = false;
                        break;
                    } else if (gkbVar4.i0(xk9Var, 0, i4, i3)) {
                        xk9Var.G = true;
                        ne9Var4.setSelection(i3);
                        xk9Var.G = false;
                        break;
                    }
                }
                break;
            case 7:
                ne9 ne9Var5 = (ne9) obj2;
                gkb gkbVar5 = (gkb) obj;
                xk9 xk9Var2 = ((tk9) obj3).a;
                if (ne9Var5.length() >= i3 && ne9Var5.getSelectionStart() != ne9Var5.getSelectionEnd()) {
                    if (gkbVar5.w()) {
                        xk9Var2.n = true;
                        ne9Var5.setSelection(i3);
                        xk9Var2.n = false;
                        break;
                    } else if (gkbVar5.i0(xk9Var2, 1, i4, i3)) {
                        xk9Var2.n = true;
                        ne9Var5.setSelection(i3);
                        xk9Var2.n = false;
                        break;
                    }
                }
                break;
            case 8:
                ut9 ut9Var = (ut9) obj3;
                ArrayList arrayList4 = (ArrayList) obj;
                ut9Var.getClass();
                String lowerCase = ((String) obj2).trim().toLowerCase();
                int length = lowerCase.length();
                int i11 = this.c;
                if (length == 0) {
                    gm.c3(new i77((Object) ut9Var, i11, (Object) new ArrayList(), (Object) new ArrayList(), (Object) ut9Var.I, (byte) 23));
                    break;
                } else {
                    String S0 = jb6.D0().S0(lowerCase, true, false);
                    if (lowerCase.equals(S0) || S0.length() == 0) {
                        S0 = null;
                    }
                    int i12 = (S0 != null ? 1 : 0) + 1;
                    String[] strArr3 = new String[i12];
                    strArr3[0] = lowerCase;
                    if (S0 != null) {
                        strArr3[1] = S0;
                    }
                    ArrayList arrayList5 = new ArrayList();
                    ArrayList arrayList6 = new ArrayList();
                    ArrayList arrayList7 = new ArrayList();
                    int i13 = 0;
                    while (i13 < arrayList4.size()) {
                        int i14 = i13;
                        TLRPC.User W1 = oc7.r1(i4).W1(Long.valueOf(((TLRPC.TL_contact) arrayList4.get(i13)).user_id));
                        if (ut9Var.w || !W1.self) {
                            String[] strArr4 = new String[i2];
                            strArr4[0] = bw2.m(0, W1.first_name, W1.last_name).toLowerCase();
                            strArr = strArr3;
                            String S02 = jb6.D0().S0(strArr4[0], true, false);
                            strArr4[1] = S02;
                            if (strArr4[0].equals(S02)) {
                                strArr4[1] = null;
                            }
                            if (m9c.B(W1)) {
                                strArr4[2] = jb6.M0(2131745999, null).toLowerCase();
                            } else if (W1.self) {
                                strArr4[2] = jb6.M0(2131745635, null).toLowerCase();
                            }
                            boolean z2 = false;
                            int i15 = 0;
                            while (true) {
                                if (i15 < i12) {
                                    String str = strArr[i15];
                                    i = i12;
                                    for (int i16 = 0; i16 < 3; i16++) {
                                        String str2 = strArr4[i16];
                                        if (str2 != null && (str2.startsWith(str) || hg9.s(" ", str, str2))) {
                                            z2 = true;
                                            String p = m9c.p(W1);
                                            if (!z2 && p != null && p.startsWith(str)) {
                                                z2 = 2;
                                            }
                                            if (z2) {
                                                i15++;
                                                i12 = i;
                                            } else {
                                                if (z2) {
                                                    arrayList6.add(gm.r0(W1.first_name, W1.last_name, str));
                                                } else {
                                                    arrayList6.add(gm.r0("@" + m9c.p(W1), null, "@" + str));
                                                }
                                                arrayList5.add(W1);
                                            }
                                        }
                                    }
                                    String p2 = m9c.p(W1);
                                    if (!z2) {
                                        z2 = 2;
                                    }
                                    if (z2) {
                                    }
                                } else {
                                    i = i12;
                                }
                            }
                        } else {
                            i = i12;
                            strArr = strArr3;
                        }
                        i13 = i14 + 1;
                        strArr3 = strArr;
                        i12 = i;
                        i2 = 3;
                    }
                    if (ut9Var.H == null) {
                        ut9Var.H = new ArrayList();
                        ArrayList arrayList8 = bw2.r(i4).b0;
                        int size2 = arrayList8.size();
                        int i17 = 0;
                        while (i17 < size2) {
                            Object obj4 = arrayList8.get(i17);
                            i17++;
                            yv2 yv2Var = (yv2) obj4;
                            tt9 tt9Var = new tt9();
                            tt9Var.b = yv2Var;
                            tt9Var.a = (yv2Var.i + " " + yv2Var.j).toLowerCase();
                            (yv2Var.j + " " + yv2Var.i).toLowerCase();
                            ut9Var.H.add(tt9Var);
                        }
                    }
                    for (int i18 = 0; i18 < ut9Var.H.size(); i18++) {
                        tt9 tt9Var2 = (tt9) ut9Var.H.get(i18);
                        if ((S0 != null && (tt9Var2.a.toLowerCase().contains(S0) || tt9Var2.a.toLowerCase().contains(S0))) || tt9Var2.a.toLowerCase().contains(lowerCase) || tt9Var2.a.toLowerCase().contains(lowerCase)) {
                            arrayList7.add(tt9Var2.b);
                        }
                    }
                    gm.c3(new i77((Object) ut9Var, i11, (Object) arrayList5, (Object) arrayList6, (Object) arrayList7, (byte) 23));
                    break;
                }
                break;
            default:
                TLRPC.Document document = (TLRPC.Document) obj2;
                yaa.g(i3, (TLRPC.User) obj3, document, i4, new raa((yu0) obj, document, (byte) 0));
                break;
        }
    }

    public /* synthetic */ g01(w01 w01Var, int i, Object obj, int i2, n01 n01Var, byte b) {
        this.a = b;
        this.b = w01Var;
        this.c = i;
        this.f = obj;
        this.d = i2;
        this.e = n01Var;
    }

    public /* synthetic */ g01(Object obj, Object obj2, int i, Object obj3, int i2, byte b) {
        this.a = b;
        this.b = obj;
        this.f = obj2;
        this.c = i;
        this.e = obj3;
        this.d = i2;
    }

    public /* synthetic */ g01(MediaController mediaController, int i, TLRPC.TL_error tL_error, TLObject tLObject, int i2) {
        this.a = (byte) 2;
        this.b = mediaController;
        this.c = i;
        this.f = tL_error;
        this.e = tLObject;
        this.d = i2;
    }
}
