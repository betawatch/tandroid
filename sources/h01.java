// default package

import android.content.Context;
import java.util.ArrayList;
import java.util.TreeMap;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class h01 implements Runnable {
    public final /* synthetic */ byte a = 2;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;

    public /* synthetic */ h01(w01 w01Var, int i, u01 u01Var, int i2, m01 m01Var, n01 n01Var) {
        this.d = w01Var;
        this.b = i;
        this.e = u01Var;
        this.c = i2;
        this.f = m01Var;
        this.h = n01Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v18 */
    /* JADX WARN: Type inference failed for: r10v20 */
    /* JADX WARN: Type inference failed for: r10v25 */
    /* JADX WARN: Type inference failed for: r10v26 */
    /* JADX WARN: Type inference failed for: r10v29 */
    /* JADX WARN: Type inference failed for: r13v14, types: [jb6] */
    /* JADX WARN: Type inference failed for: r6v10, types: [jb6] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v6, types: [boolean, int] */
    @Override // java.lang.Runnable
    public final void run() {
        int i;
        String str;
        String str2;
        String str3;
        ?? r10;
        String p;
        byte b = this.a;
        int i2 = this.c;
        byte b2 = 3;
        ?? r7 = 0;
        int i3 = this.b;
        Object obj = this.h;
        Object obj2 = this.f;
        Object obj3 = this.e;
        Object obj4 = this.d;
        switch (b) {
            case 0:
                w01 w01Var = (w01) obj4;
                u01 u01Var = (u01) obj3;
                m01 m01Var = (m01) obj2;
                n01 n01Var = (n01) obj;
                if (i3 == w01Var.b) {
                    int i4 = u01Var.f;
                    String str4 = u01Var.a;
                    if (i4 == i2) {
                        TreeMap treeMap = w01Var.d;
                        long j = m01Var.a;
                        if (treeMap.get(Long.valueOf(j)) == m01Var && m01Var.k.get(str4) == u01Var && u01Var.d != null) {
                            l01 l01Var = w01Var.a;
                            long h = l01Var.h();
                            u01Var.d = null;
                            w01Var.v--;
                            byte b3 = n01Var.a;
                            if (b3 == 0) {
                                u01Var.i = n01Var.b;
                                int i5 = n01Var.c;
                                u01Var.j = i5;
                                m01Var.l += i5;
                                w01Var.x(u01Var.c, i5);
                                w01Var.J.put(str4, Integer.valueOf(u01Var.c));
                                w01Var.i(m01Var, h);
                                break;
                            } else if (b3 == 1) {
                                w01Var.A(u01Var.g, h, u01Var.h);
                                u01Var.e = l01Var.j(new tv0(w01Var, m01Var, u01Var, (byte) 5), 100L);
                                break;
                            } else if (b3 == 2) {
                                StringBuilder o = wi8.o(j, "resync at video ", " ch ");
                                o.append(u01Var.b);
                                l01Var.d(o.toString());
                                w01Var.z(n01Var.d);
                                break;
                            } else if (b3 == 3) {
                                l01Var.d("rejoin needed at video " + j);
                                w01Var.e(false);
                                w01Var.c = (byte) 3;
                                w01Var.o = h;
                                l01Var.f();
                                break;
                            }
                        }
                    }
                }
                break;
            case 1:
                s32 s32Var = (s32) obj4;
                ArrayList arrayList = (ArrayList) obj2;
                ArrayList arrayList2 = (ArrayList) obj;
                s32Var.getClass();
                String lowerCase = ((String) obj3).trim().toLowerCase();
                if (lowerCase.length() != 0) {
                    String S0 = jb6.D0().S0(lowerCase, true, false);
                    if (lowerCase.equals(S0) || S0.length() == 0) {
                        S0 = null;
                    }
                    int i6 = (S0 != null ? 1 : 0) + 1;
                    String[] strArr = new String[i6];
                    strArr[0] = lowerCase;
                    if (S0 != null) {
                        strArr[1] = S0;
                    }
                    ArrayList arrayList3 = new ArrayList();
                    ArrayList arrayList4 = new ArrayList();
                    LongSparseIntArray longSparseIntArray = new LongSparseIntArray();
                    int i7 = 0;
                    while (i7 < arrayList.size()) {
                        yv2 yv2Var = (yv2) arrayList.get(i7);
                        s32 s32Var2 = s32Var;
                        String lowerCase2 = bw2.m(r7, yv2Var.i, yv2Var.j).toLowerCase();
                        ArrayList arrayList5 = arrayList;
                        String S02 = jb6.D0().S0(lowerCase2, true, r7);
                        TLRPC.User user = yv2Var.m;
                        String[] strArr2 = strArr;
                        if (user != null) {
                            String lowerCase3 = bw2.m(r7, user.first_name, user.last_name).toLowerCase();
                            str2 = jb6.D0().S0(lowerCase2, true, r7);
                            str = lowerCase3;
                        } else {
                            str = null;
                            str2 = null;
                        }
                        if (lowerCase2.equals(S02)) {
                            S02 = null;
                        }
                        boolean z = r7;
                        int i8 = r7;
                        while (i8 < i6) {
                            int i9 = i8;
                            String str5 = strArr2[i9];
                            if ((str == null || !(str.startsWith(str5) || hg9.s(" ", str5, str))) && (str2 == null || !(str2.startsWith(str5) || hg9.s(" ", str5, str2)))) {
                                str3 = str;
                                TLRPC.User user2 = yv2Var.m;
                                r10 = (user2 == null || (p = m9c.p(user2)) == null || !p.startsWith(str5)) ? (lowerCase2.startsWith(str5) || hg9.s(" ", str5, lowerCase2) || (S02 != null && (S02.startsWith(str5) || hg9.s(" ", str5, S02)))) ? 3 : z : 2;
                            } else {
                                str3 = str;
                                r10 = 1;
                            }
                            String str6 = lowerCase2;
                            if (r10 == 0 || (yv2Var.e.isEmpty() && yv2Var.g.isEmpty())) {
                                lowerCase2 = str6;
                                z = r10;
                                str = str3;
                                i8 = i9 + 1;
                            } else {
                                if (r10 == 3) {
                                    arrayList4.add(gm.r0(yv2Var.i, yv2Var.j, str5));
                                } else {
                                    TLRPC.User user3 = yv2Var.m;
                                    if (r10 == 1) {
                                        arrayList4.add(gm.r0(user3.first_name, user3.last_name, str5));
                                    } else {
                                        arrayList4.add(gm.r0("@" + m9c.p(user3), null, "@" + str5));
                                    }
                                }
                                TLRPC.User user4 = yv2Var.m;
                                if (user4 != null) {
                                    longSparseIntArray.put(user4.id, 1);
                                }
                                arrayList3.add(yv2Var);
                                i7++;
                                s32Var = s32Var2;
                                arrayList = arrayList5;
                                strArr = strArr2;
                                r7 = 0;
                            }
                        }
                        i7++;
                        s32Var = s32Var2;
                        arrayList = arrayList5;
                        strArr = strArr2;
                        r7 = 0;
                    }
                    s32 s32Var3 = s32Var;
                    String[] strArr3 = strArr;
                    int i10 = 0;
                    while (i10 < arrayList2.size()) {
                        TLRPC.TL_contact tL_contact = (TLRPC.TL_contact) arrayList2.get(i10);
                        if (longSparseIntArray.indexOfKey(tL_contact.user_id) < 0) {
                            TLRPC.User W1 = oc7.r1(i3).W1(Long.valueOf(tL_contact.user_id));
                            String lowerCase4 = bw2.m(0, W1.first_name, W1.last_name).toLowerCase();
                            String S03 = jb6.D0().S0(lowerCase4, true, false);
                            if (lowerCase4.equals(S03)) {
                                S03 = null;
                            }
                            int i11 = 0;
                            char c = 0;
                            while (i11 < i6) {
                                String str7 = strArr3[i11];
                                if (lowerCase4.startsWith(str7) || hg9.s(" ", str7, lowerCase4) || (S03 != null && (S03.startsWith(str7) || hg9.s(" ", str7, S03)))) {
                                    i = i10;
                                    c = 1;
                                } else {
                                    i = i10;
                                    String p2 = m9c.p(W1);
                                    if (p2 != null && p2.startsWith(str7)) {
                                        c = 2;
                                    }
                                }
                                if (c == 0 || W1.phone == null) {
                                    i11++;
                                    i10 = i;
                                } else {
                                    if (c == 1) {
                                        arrayList4.add(gm.r0(W1.first_name, W1.last_name, str7));
                                    } else {
                                        arrayList4.add(gm.r0("@" + m9c.p(W1), null, "@" + str7));
                                    }
                                    arrayList3.add(W1);
                                    i10 = i + 1;
                                }
                            }
                        }
                        i = i10;
                        i10 = i + 1;
                    }
                    gm.c3(new up6((Object) s32Var3, this.c, (Object) arrayList3, (Object) arrayList4, (byte) 14));
                    break;
                } else {
                    s32Var.h = -1;
                    gm.c3(new up6((Object) s32Var, s32Var.h, (Object) new ArrayList(), (Object) new ArrayList(), (byte) 14));
                    break;
                }
                break;
            case 2:
                pr7 pr7Var = (pr7) obj;
                yr7.e(this.b, this.c, pr7Var.j(), new lr7(pr7Var, b2), (ylb) obj2, (Context) obj4, (TLRPC.TL_messageActionStarGiftOnchainOffer) obj3);
                break;
            default:
                ne9 ne9Var = (ne9) obj3;
                gkb gkbVar = (gkb) obj2;
                rd9 rd9Var = (rd9) obj;
                sd9 sd9Var = (sd9) ((wm4) obj4).c;
                if (ne9Var.length() >= i3 && ne9Var.getSelectionStart() != ne9Var.getSelectionEnd() && gkbVar.i0(rd9Var.Y0(), 0, i2, i3)) {
                    sd9Var.d = true;
                    ne9Var.setSelection(i3);
                    sd9Var.d = false;
                    break;
                }
                break;
        }
    }

    public /* synthetic */ h01(s32 s32Var, String str, ArrayList arrayList, ArrayList arrayList2, int i, int i2) {
        this.d = s32Var;
        this.e = str;
        this.f = arrayList;
        this.h = arrayList2;
        this.b = i;
        this.c = i2;
    }

    public /* synthetic */ h01(wm4 wm4Var, ne9 ne9Var, int i, gkb gkbVar, rd9 rd9Var, int i2) {
        this.d = wm4Var;
        this.e = ne9Var;
        this.b = i;
        this.f = gkbVar;
        this.h = rd9Var;
        this.c = i2;
    }

    public /* synthetic */ h01(Context context, int i, int i2, TLRPC.TL_messageActionStarGiftOnchainOffer tL_messageActionStarGiftOnchainOffer, ylb ylbVar, pr7 pr7Var) {
        this.d = context;
        this.b = i;
        this.c = i2;
        this.e = tL_messageActionStarGiftOnchainOffer;
        this.f = ylbVar;
        this.h = pr7Var;
    }
}
