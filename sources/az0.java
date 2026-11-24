// default package

import android.content.Context;
import java.util.ArrayList;
import java.util.TreeMap;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final /* synthetic */ class az0 implements Runnable {
    public final /* synthetic */ byte a = 2;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;

    public /* synthetic */ az0(pz0 pz0Var, int i, nz0 nz0Var, int i2, fz0 fz0Var, gz0 gz0Var) {
        this.d = pz0Var;
        this.b = i;
        this.e = nz0Var;
        this.c = i2;
        this.f = fz0Var;
        this.h = gz0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v18 */
    /* JADX WARN: Type inference failed for: r10v20 */
    /* JADX WARN: Type inference failed for: r10v25 */
    /* JADX WARN: Type inference failed for: r10v26 */
    /* JADX WARN: Type inference failed for: r10v29 */
    /* JADX WARN: Type inference failed for: r13v14, types: [k96] */
    /* JADX WARN: Type inference failed for: r6v10, types: [k96] */
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
        String o;
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
                pz0 pz0Var = (pz0) obj4;
                nz0 nz0Var = (nz0) obj3;
                fz0 fz0Var = (fz0) obj2;
                gz0 gz0Var = (gz0) obj;
                if (i3 == pz0Var.b) {
                    int i4 = nz0Var.f;
                    String str4 = nz0Var.a;
                    if (i4 == i2) {
                        TreeMap treeMap = pz0Var.d;
                        long j = fz0Var.a;
                        if (treeMap.get(Long.valueOf(j)) == fz0Var && fz0Var.k.get(str4) == nz0Var && nz0Var.d != null) {
                            ez0 ez0Var = pz0Var.a;
                            long h = ez0Var.h();
                            nz0Var.d = null;
                            pz0Var.v--;
                            byte b3 = gz0Var.a;
                            if (b3 == 0) {
                                nz0Var.i = gz0Var.b;
                                int i5 = gz0Var.c;
                                nz0Var.j = i5;
                                fz0Var.l += i5;
                                pz0Var.x(nz0Var.c, i5);
                                pz0Var.J.put(str4, Integer.valueOf(nz0Var.c));
                                pz0Var.i(fz0Var, h);
                                break;
                            } else if (b3 == 1) {
                                pz0Var.A(nz0Var.g, h, nz0Var.h);
                                nz0Var.e = ez0Var.j(new fv0((Object) pz0Var, (Object) fz0Var, (Object) nz0Var, (byte) 4), 100L);
                                break;
                            } else if (b3 == 2) {
                                StringBuilder o2 = ug8.o(j, "resync at video ", " ch ");
                                o2.append(nz0Var.b);
                                ez0Var.d(o2.toString());
                                pz0Var.z(gz0Var.d);
                                break;
                            } else if (b3 == 3) {
                                ez0Var.d("rejoin needed at video " + j);
                                pz0Var.e(false);
                                pz0Var.c = (byte) 3;
                                pz0Var.o = h;
                                ez0Var.f();
                                break;
                            }
                        }
                    }
                }
                break;
            case 1:
                g22 g22Var = (g22) obj4;
                ArrayList arrayList = (ArrayList) obj2;
                ArrayList arrayList2 = (ArrayList) obj;
                g22Var.getClass();
                String lowerCase = ((String) obj3).trim().toLowerCase();
                if (lowerCase.length() != 0) {
                    String S0 = k96.D0().S0(lowerCase, true, false);
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
                        nu2 nu2Var = (nu2) arrayList.get(i7);
                        g22 g22Var2 = g22Var;
                        String lowerCase2 = qu2.m(r7, nu2Var.i, nu2Var.j).toLowerCase();
                        ArrayList arrayList5 = arrayList;
                        String S02 = k96.D0().S0(lowerCase2, true, r7);
                        TLRPC.User user = nu2Var.m;
                        String[] strArr2 = strArr;
                        if (user != null) {
                            String lowerCase3 = qu2.m(r7, user.first_name, user.last_name).toLowerCase();
                            str2 = k96.D0().S0(lowerCase2, true, r7);
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
                            if ((str == null || !(str.startsWith(str5) || de9.t(" ", str5, str))) && (str2 == null || !(str2.startsWith(str5) || de9.t(" ", str5, str2)))) {
                                str3 = str;
                                TLRPC.User user2 = nu2Var.m;
                                r10 = (user2 == null || (o = l7c.o(user2)) == null || !o.startsWith(str5)) ? (lowerCase2.startsWith(str5) || de9.t(" ", str5, lowerCase2) || (S02 != null && (S02.startsWith(str5) || de9.t(" ", str5, S02)))) ? 3 : z : 2;
                            } else {
                                str3 = str;
                                r10 = 1;
                            }
                            String str6 = lowerCase2;
                            if (r10 == 0 || (nu2Var.e.isEmpty() && nu2Var.g.isEmpty())) {
                                lowerCase2 = str6;
                                z = r10;
                                str = str3;
                                i8 = i9 + 1;
                            } else {
                                if (r10 == 3) {
                                    arrayList4.add(gl.r0(nu2Var.i, nu2Var.j, str5));
                                } else {
                                    TLRPC.User user3 = nu2Var.m;
                                    if (r10 == 1) {
                                        arrayList4.add(gl.r0(user3.first_name, user3.last_name, str5));
                                    } else {
                                        arrayList4.add(gl.r0("@" + l7c.o(user3), null, "@" + str5));
                                    }
                                }
                                TLRPC.User user4 = nu2Var.m;
                                if (user4 != null) {
                                    longSparseIntArray.put(user4.id, 1);
                                }
                                arrayList3.add(nu2Var);
                                i7++;
                                g22Var = g22Var2;
                                arrayList = arrayList5;
                                strArr = strArr2;
                                r7 = 0;
                            }
                        }
                        i7++;
                        g22Var = g22Var2;
                        arrayList = arrayList5;
                        strArr = strArr2;
                        r7 = 0;
                    }
                    g22 g22Var3 = g22Var;
                    String[] strArr3 = strArr;
                    int i10 = 0;
                    while (i10 < arrayList2.size()) {
                        TLRPC.TL_contact tL_contact = (TLRPC.TL_contact) arrayList2.get(i10);
                        if (longSparseIntArray.indexOfKey(tL_contact.user_id) < 0) {
                            TLRPC.User V1 = na7.q1(i3).V1(Long.valueOf(tL_contact.user_id));
                            String lowerCase4 = qu2.m(0, V1.first_name, V1.last_name).toLowerCase();
                            String S03 = k96.D0().S0(lowerCase4, true, false);
                            if (lowerCase4.equals(S03)) {
                                S03 = null;
                            }
                            int i11 = 0;
                            char c = 0;
                            while (i11 < i6) {
                                String str7 = strArr3[i11];
                                if (lowerCase4.startsWith(str7) || de9.t(" ", str7, lowerCase4) || (S03 != null && (S03.startsWith(str7) || de9.t(" ", str7, S03)))) {
                                    i = i10;
                                    c = 1;
                                } else {
                                    i = i10;
                                    String o3 = l7c.o(V1);
                                    if (o3 != null && o3.startsWith(str7)) {
                                        c = 2;
                                    }
                                }
                                if (c == 0 || V1.phone == null) {
                                    i11++;
                                    i10 = i;
                                } else {
                                    if (c == 1) {
                                        arrayList4.add(gl.r0(V1.first_name, V1.last_name, str7));
                                    } else {
                                        arrayList4.add(gl.r0("@" + l7c.o(V1), null, "@" + str7));
                                    }
                                    arrayList3.add(V1);
                                    i10 = i + 1;
                                }
                            }
                        }
                        i = i10;
                        i10 = i + 1;
                    }
                    gl.d3(new tn6((Object) g22Var3, this.c, (Object) arrayList3, (Object) arrayList4, (byte) 14));
                    break;
                } else {
                    g22Var.h = -1;
                    gl.d3(new tn6((Object) g22Var, g22Var.h, (Object) new ArrayList(), (Object) new ArrayList(), (byte) 14));
                    break;
                }
                break;
            case 2:
                mp7 mp7Var = (mp7) obj;
                vp7.e(this.b, this.c, mp7Var.j(), new ip7(mp7Var, b2), (wjb) obj2, (Context) obj4, (TLRPC.TL_messageActionStarGiftOnchainOffer) obj3);
                break;
            default:
                mc9 mc9Var = (mc9) obj3;
                fib fibVar = (fib) obj2;
                rb9 rb9Var = (rb9) obj;
                sb9 sb9Var = (sb9) ((wk4) obj4).c;
                if (mc9Var.length() >= i3 && mc9Var.getSelectionStart() != mc9Var.getSelectionEnd() && fibVar.i0(rb9Var.G0(), 0, i2, i3)) {
                    sb9Var.d = true;
                    mc9Var.setSelection(i3);
                    sb9Var.d = false;
                    break;
                }
                break;
        }
    }

    public /* synthetic */ az0(g22 g22Var, String str, ArrayList arrayList, ArrayList arrayList2, int i, int i2) {
        this.d = g22Var;
        this.e = str;
        this.f = arrayList;
        this.h = arrayList2;
        this.b = i;
        this.c = i2;
    }

    public /* synthetic */ az0(wk4 wk4Var, mc9 mc9Var, int i, fib fibVar, rb9 rb9Var, int i2) {
        this.d = wk4Var;
        this.e = mc9Var;
        this.b = i;
        this.f = fibVar;
        this.h = rb9Var;
        this.c = i2;
    }

    public /* synthetic */ az0(Context context, int i, int i2, TLRPC.TL_messageActionStarGiftOnchainOffer tL_messageActionStarGiftOnchainOffer, wjb wjbVar, mp7 mp7Var) {
        this.d = context;
        this.b = i;
        this.c = i2;
        this.e = tL_messageActionStarGiftOnchainOffer;
        this.f = wjbVar;
        this.h = mp7Var;
    }
}
