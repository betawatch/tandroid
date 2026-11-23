package hi;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.np;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes4.dex */
public final /* synthetic */ class z7 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ k8 b;

    public /* synthetic */ z7(k8 k8Var, int i7) {
        this.a = i7;
        this.b = k8Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        n8 n8Var;
        int i7 = this.a;
        int i10 = 0;
        k8 k8Var = this.b;
        int i11 = 1;
        switch (i7) {
            case 0:
                HashMap hashMap = k8Var.d;
                ArrayList arrayList = k8Var.c;
                p8 p8Var = k8Var.a0;
                e eVar = k8Var.w;
                if (!eVar.R) {
                    int i12 = p8.Y1;
                    int i13 = p8Var.a;
                    HashMap hashMap2 = p8Var.p1;
                    ArrayList arrayList2 = p8Var.o1;
                    HashMap hashMap3 = p8Var.t1;
                    ArrayList arrayList3 = p8Var.s1;
                    np u12 = np.u1(i13);
                    int i14 = k8Var.a;
                    if (i14 == 5) {
                        b8 b8Var = p8Var.Q1;
                        if (b8Var != null) {
                            b8Var.a(arrayList);
                        }
                        p8Var.dismiss();
                        break;
                    } else if (i14 == 1) {
                        TLRPC.TL_editCloseFriends tL_editCloseFriends = new TLRPC.TL_editCloseFriends();
                        tL_editCloseFriends.id.addAll(arrayList);
                        eVar.setLoading(true);
                        ConnectionsManager.getInstance(p8Var.a).sendRequest(tL_editCloseFriends, new bi.o1(17, k8Var, u12));
                        break;
                    } else if (i14 == 0) {
                        int i15 = p8Var.I1;
                        if (i15 == 3) {
                            n8Var = new n8(p8Var.I1, p8Var.a, new ArrayList(p8.S0(arrayList3, hashMap3)));
                            ArrayList arrayList4 = n8Var.c;
                            arrayList4.clear();
                            arrayList4.addAll(arrayList3);
                            HashMap hashMap4 = n8Var.d;
                            hashMap4.clear();
                            hashMap4.putAll(hashMap3);
                        } else if (i15 == 2) {
                            n8Var = new n8(i15, p8Var.a, p8Var.r1);
                        } else if (i15 == 4) {
                            n8Var = new n8(p8Var.I1, p8Var.a, new ArrayList(p8.S0(arrayList2, hashMap2)));
                            ArrayList arrayList5 = n8Var.c;
                            arrayList5.clear();
                            arrayList5.addAll(arrayList2);
                            HashMap hashMap5 = n8Var.d;
                            hashMap5.clear();
                            hashMap5.putAll(hashMap2);
                        } else {
                            n8Var = new n8(i15, p8Var.a, (ArrayList) null);
                        }
                        p8Var.O0(n8Var, new fi.o3(p8Var, 1), false);
                        break;
                    } else if (i14 == 2) {
                        if (p8Var.U1) {
                            p8Var.N0();
                            p8Var.O0(new n8(2, p8Var.a, arrayList), new fi.o3(p8Var, 1), false);
                            break;
                        } else {
                            p8Var.N0();
                            p8Var.m1.A(0);
                            break;
                        }
                    } else if (i14 != 3) {
                        int i16 = 6;
                        if (i14 == 6) {
                            HashSet S0 = p8.S0(arrayList, hashMap);
                            eVar.setLoading(true);
                            fi.p6 R1 = np.u1(p8Var.a).R1();
                            a8 a8Var = new a8(k8Var, i11);
                            int i17 = R1.a;
                            TLRPC.TL_contacts_setBlocked tL_contacts_setBlocked = new TLRPC.TL_contacts_setBlocked();
                            tL_contacts_setBlocked.my_stories_from = true;
                            HashSet hashSet = R1.L;
                            tL_contacts_setBlocked.limit = hashSet.size();
                            int size = R1.N - hashSet.size();
                            R1.N = size;
                            if (size < 0) {
                                R1.N = 0;
                            }
                            hashSet.clear();
                            Iterator it = S0.iterator();
                            while (it.hasNext()) {
                                Long l10 = (Long) it.next();
                                TLRPC.InputPeer l1 = np.u1(i17).l1(l10.longValue());
                                if (!(l1 instanceof TLRPC.TL_inputPeerEmpty)) {
                                    hashSet.add(l10);
                                    tL_contacts_setBlocked.id.add(l1);
                                }
                            }
                            R1.N = hashSet.size() + R1.N;
                            tL_contacts_setBlocked.limit = Math.max(tL_contacts_setBlocked.limit, hashSet.size());
                            ConnectionsManager.getInstance(i17).sendRequest(tL_contacts_setBlocked, new ai.g1(a8Var, i16));
                            break;
                        } else {
                            p8Var.I1 = i14;
                            p8Var.N0();
                            p8Var.m1.A(0);
                            break;
                        }
                    } else if (p8Var.U1) {
                        HashSet S02 = p8.S0(arrayList, hashMap);
                        if (!S02.isEmpty()) {
                            p8Var.N0();
                            n8 n8Var2 = new n8(3, p8Var.a, new ArrayList(S02));
                            ArrayList arrayList6 = n8Var2.c;
                            arrayList6.clear();
                            arrayList6.addAll(arrayList);
                            HashMap hashMap6 = n8Var2.d;
                            hashMap6.clear();
                            hashMap6.putAll(hashMap);
                            p8Var.O0(n8Var2, new a8(k8Var, i10), false);
                            break;
                        }
                    } else if (!p8.S0(arrayList, hashMap).isEmpty()) {
                        p8Var.I1 = 3;
                        p8Var.N0();
                        p8Var.m1.A(0);
                        break;
                    }
                }
                break;
            case 1:
                p8 p8Var2 = k8Var.a0;
                if (p8Var2.J1) {
                    p8Var2.H1 = 5;
                    p8Var2.m1.A(1);
                    break;
                } else {
                    p8 p8Var3 = new p8(k8Var.getContext(), p8Var2.J0);
                    p8Var3.Q1 = new b8(k8Var, i11);
                    p8Var3.L1 = p8Var2.L1;
                    p8Var3.show();
                    break;
                }
            default:
                HashMap hashMap7 = k8Var.d;
                a0.h hVar = k8Var.b;
                ArrayList arrayList7 = k8Var.c;
                int size2 = arrayList7.size();
                int i18 = 0;
                while (i18 < size2) {
                    Object obj = arrayList7.get(i18);
                    i18++;
                    hVar.k(Boolean.FALSE, ((Long) obj).longValue());
                }
                for (ArrayList arrayList8 : hashMap7.values()) {
                    int size3 = arrayList8.size();
                    int i19 = 0;
                    while (i19 < size3) {
                        Object obj2 = arrayList8.get(i19);
                        i19++;
                        hVar.k(Boolean.FALSE, ((Long) obj2).longValue());
                    }
                }
                arrayList7.clear();
                hashMap7.clear();
                k8Var.a0.E1.clear();
                k8Var.y.d.a();
                k8Var.g(true);
                k8Var.f(true);
                break;
        }
    }
}
