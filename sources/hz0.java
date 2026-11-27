// default package

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.MediaController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final /* synthetic */ class hz0 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ hz0(int i, TLRPC.User user, TLRPC.Document document, int i2, yt0 yt0Var) {
        this.a = (byte) 9;
        this.c = i;
        this.b = user;
        this.f = document;
        this.d = i2;
        this.e = yt0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x017f A[LOOP:1: B:36:0x0115->B:55:0x017f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0146 A[SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        oo6 oo6Var;
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
                xz0 xz0Var = (xz0) obj3;
                sz0 sz0Var = (sz0) obj2;
                oz0 oz0Var = (oz0) obj;
                byte b2 = oz0Var.a;
                ArrayList arrayList = xz0Var.P;
                mz0 mz0Var = xz0Var.a;
                if (i3 == xz0Var.b) {
                    int i5 = sz0Var.g;
                    tz0 tz0Var = sz0Var.a;
                    if (i5 == i4 && sz0Var.e != null && arrayList.contains(sz0Var)) {
                        sz0Var.e = null;
                        xz0Var.v--;
                        if (b2 == 1) {
                            xz0Var.A(sz0Var.h, mz0Var.h(), sz0Var.i);
                            sz0Var.f = mz0Var.j(new a30(xz0Var, sz0Var, (byte) 24), 100L);
                            break;
                        } else {
                            arrayList.remove(sz0Var);
                            if (b2 == 0) {
                                xz0Var.x(sz0Var.d, oz0Var.c);
                                wz0 wz0Var = new wz0(sz0Var.b, sz0Var.c, sz0Var.d, oz0Var.b, oz0Var.c);
                                ArrayList arrayList2 = tz0Var.f;
                                for (int i6 = 0; i6 < arrayList2.size(); i6++) {
                                    if (((wz0) arrayList2.get(i6)).a.equals(sz0Var.b)) {
                                        arrayList2.set(i6, wz0Var);
                                    }
                                }
                                tz0 tz0Var2 = new tz0(tz0Var.a, 0, null, 0, tz0Var.e);
                                tz0Var2.f.add(wz0Var);
                                mz0Var.b(tz0Var2);
                                break;
                            }
                        }
                    }
                }
                break;
            case 1:
                xz0 xz0Var2 = (xz0) obj3;
                nz0 nz0Var = (nz0) obj2;
                oz0 oz0Var2 = (oz0) obj;
                if (i3 == xz0Var2.b) {
                    int i7 = nz0Var.e;
                    long j = nz0Var.a;
                    if (i7 == i4 && xz0Var2.d.get(Long.valueOf(j)) == nz0Var && nz0Var.c != null) {
                        boolean z = xz0Var2.F;
                        mz0 mz0Var2 = xz0Var2.a;
                        long h = mz0Var2.h();
                        nz0Var.c = null;
                        xz0Var2.v--;
                        byte b3 = oz0Var2.a;
                        int i8 = oz0Var2.c;
                        if (b3 != 0) {
                            if (b3 != 1) {
                                if (b3 != 2) {
                                    if (b3 == 3) {
                                        mz0Var2.c("rejoin needed at " + j);
                                        xz0Var2.e(false);
                                        xz0Var2.c = (byte) 3;
                                        xz0Var2.o = h;
                                        mz0Var2.f();
                                        break;
                                    }
                                } else {
                                    xz0Var2.A(nz0Var.f, h, nz0Var.g);
                                    mz0Var2.c("resync at " + j);
                                    if (z) {
                                        xz0Var2.z(oz0Var2.d);
                                        break;
                                    } else {
                                        xz0Var2.e(false);
                                        xz0.d(xz0Var2.l);
                                        xz0Var2.l = null;
                                        xz0Var2.y();
                                        break;
                                    }
                                }
                            } else {
                                xz0Var2.A(nz0Var.f, h, nz0Var.g);
                                nz0Var.d = mz0Var2.j(new a30(xz0Var2, nz0Var, (byte) 23), 100L);
                                break;
                            }
                        } else {
                            nz0Var.h = oz0Var2.b;
                            nz0Var.i = i8;
                            nz0Var.j = oz0Var2.e;
                            if (z) {
                                nz0Var.l += i8;
                                HashMap hashMap = oz0Var2.f;
                                if (hashMap != null) {
                                    xz0Var2.I = hashMap;
                                    xz0Var2.v(nz0Var, hashMap);
                                }
                                xz0Var2.i(nz0Var, h);
                                break;
                            } else {
                                l54 k = xz0Var2.k();
                                double max = h - Math.max(nz0Var.f, xz0Var2.w);
                                if (nz0Var.g) {
                                    max -= k.b();
                                }
                                k.c(max, i8);
                                xz0Var2.x(nz0Var.b, i8);
                                xz0Var2.w = h;
                                xz0Var2.x = nz0Var.b;
                                xz0Var2.j();
                                xz0Var2.w();
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
                if (mediaController.a1 == i3 && (oo6Var = mediaController.D0) != null && mediaController.v0 != null && tL_error == null) {
                    mediaController.Y0 = false;
                    TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                    oo6Var.h = messages_messages.next_rate;
                    jf7.Y(i4).j1(messages_messages.users, messages_messages.chats, true, true);
                    uc7.s1(i4).j4(messages_messages.users, false);
                    uc7.s1(i4).c4(messages_messages.chats, false);
                    int size = messages_messages.messages.size();
                    int i9 = 0;
                    for (int i10 = 0; i10 < size; i10++) {
                        r47 r47Var = new r47(i4, messages_messages.messages.get(i10), false, true);
                        if (!r47Var.R4() && !hashMap2.containsKey(Integer.valueOf(r47Var.e1()))) {
                            arrayList3.add(0, r47Var);
                            hashMap2.put(Integer.valueOf(r47Var.e1()), r47Var);
                            i9++;
                        }
                    }
                    mediaController.x0();
                    mediaController.Y0 = false;
                    mediaController.D0.g = arrayList3.size() == mediaController.D0.f;
                    if (xea.J0) {
                        mediaController.b();
                    }
                    if (i9 != 0) {
                        jn7.f(mediaController.v0.K1).k(75, Integer.valueOf(i9));
                        break;
                    }
                }
                break;
            case 3:
                dg9 dg9Var = (dg9) obj2;
                amb ambVar = (amb) obj;
                rf9 rf9Var = ((of9) obj3).a;
                if (dg9Var.length() >= i3 && dg9Var.getSelectionStart() != dg9Var.getSelectionEnd() && ambVar.i0(rf9Var, 0, i4, i3)) {
                    rf9Var.n = true;
                    dg9Var.setSelection(i3);
                    rf9Var.n = false;
                    break;
                }
                break;
            case 4:
                dg9 dg9Var2 = (dg9) obj2;
                amb ambVar2 = (amb) obj;
                pl9 pl9Var = (pl9) ((ve9) obj3).b;
                if (dg9Var2.length() >= i3 && dg9Var2.getSelectionStart() != dg9Var2.getSelectionEnd()) {
                    if (ambVar2.w()) {
                        pl9Var.x = true;
                        dg9Var2.setSelection(i3);
                        pl9Var.x = false;
                        break;
                    } else if (ambVar2.i0(pl9Var, 0, i4, i3)) {
                        pl9Var.x = true;
                        dg9Var2.setSelection(i3);
                        pl9Var.x = false;
                        break;
                    }
                }
                break;
            case 5:
                dg9 dg9Var3 = (dg9) obj2;
                amb ambVar3 = (amb) obj;
                xl9 xl9Var = (xl9) ((i09) obj3).b;
                if (dg9Var3.length() >= i3 && dg9Var3.getSelectionStart() != dg9Var3.getSelectionEnd() && ambVar3.i0(xl9Var, 0, i4, i3)) {
                    xl9Var.H = true;
                    dg9Var3.setSelection(i3);
                    xl9Var.H = false;
                    break;
                }
                break;
            case 6:
                dg9 dg9Var4 = (dg9) obj2;
                amb ambVar4 = (amb) obj;
                km9 km9Var = ((fm9) obj3).a;
                if (dg9Var4.length() >= i3 && dg9Var4.getSelectionStart() != dg9Var4.getSelectionEnd()) {
                    if (ambVar4.w()) {
                        km9Var.G = true;
                        dg9Var4.setSelection(i3);
                        km9Var.G = false;
                        break;
                    } else if (ambVar4.i0(km9Var, 0, i4, i3)) {
                        km9Var.G = true;
                        dg9Var4.setSelection(i3);
                        km9Var.G = false;
                        break;
                    }
                }
                break;
            case 7:
                dg9 dg9Var5 = (dg9) obj2;
                amb ambVar5 = (amb) obj;
                km9 km9Var2 = ((gm9) obj3).a;
                if (dg9Var5.length() >= i3 && dg9Var5.getSelectionStart() != dg9Var5.getSelectionEnd()) {
                    if (ambVar5.w()) {
                        km9Var2.n = true;
                        dg9Var5.setSelection(i3);
                        km9Var2.n = false;
                        break;
                    } else if (ambVar5.i0(km9Var2, 1, i4, i3)) {
                        km9Var2.n = true;
                        dg9Var5.setSelection(i3);
                        km9Var2.n = false;
                        break;
                    }
                }
                break;
            case 8:
                lv9 lv9Var = (lv9) obj3;
                ArrayList arrayList4 = (ArrayList) obj;
                lv9Var.getClass();
                String lowerCase = ((String) obj2).trim().toLowerCase();
                int length = lowerCase.length();
                int i11 = this.c;
                if (length == 0) {
                    hl.c3(new l77((Object) lv9Var, i11, (Object) new ArrayList(), (Object) new ArrayList(), (Object) lv9Var.I, (byte) 23));
                    break;
                } else {
                    String S0 = ob6.D0().S0(lowerCase, true, false);
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
                        TLRPC.User X1 = uc7.s1(i4).X1(Long.valueOf(((TLRPC.TL_contact) arrayList4.get(i13)).user_id));
                        if (lv9Var.w || !X1.self) {
                            String[] strArr4 = new String[i2];
                            strArr4[0] = lv2.m(0, X1.first_name, X1.last_name).toLowerCase();
                            strArr = strArr3;
                            String S02 = ob6.D0().S0(strArr4[0], true, false);
                            strArr4[1] = S02;
                            if (strArr4[0].equals(S02)) {
                                strArr4[1] = null;
                            }
                            if (lbc.B(X1)) {
                                strArr4[2] = ob6.M0(2131745993, null).toLowerCase();
                            } else if (X1.self) {
                                strArr4[2] = ob6.M0(2131745629, null).toLowerCase();
                            }
                            boolean z2 = false;
                            int i15 = 0;
                            while (true) {
                                if (i15 < i12) {
                                    String str = strArr[i15];
                                    i = i12;
                                    for (int i16 = 0; i16 < 3; i16++) {
                                        String str2 = strArr4[i16];
                                        if (str2 != null && (str2.startsWith(str) || uh9.t(" ", str, str2))) {
                                            z2 = true;
                                            String p = lbc.p(X1);
                                            if (!z2 && p != null && p.startsWith(str)) {
                                                z2 = 2;
                                            }
                                            if (z2) {
                                                i15++;
                                                i12 = i;
                                            } else {
                                                if (z2) {
                                                    arrayList6.add(hl.r0(X1.first_name, X1.last_name, str));
                                                } else {
                                                    arrayList6.add(hl.r0("@" + lbc.p(X1), null, "@" + str));
                                                }
                                                arrayList5.add(X1);
                                            }
                                        }
                                    }
                                    String p2 = lbc.p(X1);
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
                    if (lv9Var.H == null) {
                        lv9Var.H = new ArrayList();
                        ArrayList arrayList8 = lv2.r(i4).b0;
                        int size2 = arrayList8.size();
                        int i17 = 0;
                        while (i17 < size2) {
                            Object obj4 = arrayList8.get(i17);
                            i17++;
                            iv2 iv2Var = (iv2) obj4;
                            kv9 kv9Var = new kv9();
                            kv9Var.b = iv2Var;
                            kv9Var.a = (iv2Var.i + " " + iv2Var.j).toLowerCase();
                            (iv2Var.j + " " + iv2Var.i).toLowerCase();
                            lv9Var.H.add(kv9Var);
                        }
                    }
                    for (int i18 = 0; i18 < lv9Var.H.size(); i18++) {
                        kv9 kv9Var2 = (kv9) lv9Var.H.get(i18);
                        if ((S0 != null && (kv9Var2.a.toLowerCase().contains(S0) || kv9Var2.a.toLowerCase().contains(S0))) || kv9Var2.a.toLowerCase().contains(lowerCase) || kv9Var2.a.toLowerCase().contains(lowerCase)) {
                            arrayList7.add(kv9Var2.b);
                        }
                    }
                    hl.c3(new l77((Object) lv9Var, i11, (Object) arrayList5, (Object) arrayList6, (Object) arrayList7, (byte) 23));
                    break;
                }
                break;
            default:
                TLRPC.Document document = (TLRPC.Document) obj2;
                oca.g(i3, (TLRPC.User) obj3, document, i4, new hca((yt0) obj, document, (byte) 0));
                break;
        }
    }

    public /* synthetic */ hz0(xz0 xz0Var, int i, Object obj, int i2, oz0 oz0Var, byte b) {
        this.a = b;
        this.b = xz0Var;
        this.c = i;
        this.f = obj;
        this.d = i2;
        this.e = oz0Var;
    }

    public /* synthetic */ hz0(Object obj, Object obj2, int i, Object obj3, int i2, byte b) {
        this.a = b;
        this.b = obj;
        this.f = obj2;
        this.c = i;
        this.e = obj3;
        this.d = i2;
    }

    public /* synthetic */ hz0(MediaController mediaController, int i, TLRPC.TL_error tL_error, TLObject tLObject, int i2) {
        this.a = (byte) 2;
        this.b = mediaController;
        this.c = i;
        this.f = tL_error;
        this.e = tLObject;
        this.d = i2;
    }
}
