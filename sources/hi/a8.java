package hi;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.mp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes4.dex */
public final /* synthetic */ class a8 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ l8 b;

    public /* synthetic */ a8(l8 l8Var, int i7) {
        this.a = i7;
        this.b = l8Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        o8 o8Var;
        int i7 = this.a;
        int i10 = 0;
        l8 l8Var = this.b;
        int i11 = 1;
        switch (i7) {
            case 0:
                HashMap hashMap = l8Var.d;
                ArrayList arrayList = l8Var.c;
                q8 q8Var = l8Var.a0;
                d dVar = l8Var.w;
                if (!dVar.R) {
                    int i12 = q8.Y1;
                    int i13 = q8Var.a;
                    HashMap hashMap2 = q8Var.p1;
                    ArrayList arrayList2 = q8Var.o1;
                    HashMap hashMap3 = q8Var.t1;
                    ArrayList arrayList3 = q8Var.s1;
                    mp u12 = mp.u1(i13);
                    int i14 = l8Var.a;
                    if (i14 == 5) {
                        c8 c8Var = q8Var.Q1;
                        if (c8Var != null) {
                            c8Var.a(arrayList);
                        }
                        q8Var.dismiss();
                        break;
                    } else if (i14 == 1) {
                        TLRPC.TL_editCloseFriends tL_editCloseFriends = new TLRPC.TL_editCloseFriends();
                        tL_editCloseFriends.id.addAll(arrayList);
                        dVar.setLoading(true);
                        ConnectionsManager.getInstance(q8Var.a).sendRequest(tL_editCloseFriends, new bi.k1(17, l8Var, u12));
                        break;
                    } else if (i14 == 0) {
                        int i15 = q8Var.I1;
                        if (i15 == 3) {
                            o8Var = new o8(q8Var.I1, q8Var.a, new ArrayList(q8.S0(arrayList3, hashMap3)));
                            ArrayList arrayList4 = o8Var.c;
                            arrayList4.clear();
                            arrayList4.addAll(arrayList3);
                            HashMap hashMap4 = o8Var.d;
                            hashMap4.clear();
                            hashMap4.putAll(hashMap3);
                        } else if (i15 == 2) {
                            o8Var = new o8(i15, q8Var.a, q8Var.r1);
                        } else if (i15 == 4) {
                            o8Var = new o8(q8Var.I1, q8Var.a, new ArrayList(q8.S0(arrayList2, hashMap2)));
                            ArrayList arrayList5 = o8Var.c;
                            arrayList5.clear();
                            arrayList5.addAll(arrayList2);
                            HashMap hashMap5 = o8Var.d;
                            hashMap5.clear();
                            hashMap5.putAll(hashMap2);
                        } else {
                            o8Var = new o8(i15, q8Var.a, (ArrayList) null);
                        }
                        q8Var.O0(o8Var, new fi.o3(q8Var, 1), false);
                        break;
                    } else if (i14 == 2) {
                        if (q8Var.U1) {
                            q8Var.N0();
                            q8Var.O0(new o8(2, q8Var.a, arrayList), new fi.o3(q8Var, 1), false);
                            break;
                        } else {
                            q8Var.N0();
                            q8Var.m1.A(0);
                            break;
                        }
                    } else if (i14 != 3) {
                        int i16 = 6;
                        if (i14 == 6) {
                            HashSet S0 = q8.S0(arrayList, hashMap);
                            dVar.setLoading(true);
                            fi.p6 R1 = mp.u1(q8Var.a).R1();
                            b8 b8Var = new b8(l8Var, i11);
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
                                TLRPC.InputPeer l1 = mp.u1(i17).l1(l10.longValue());
                                if (!(l1 instanceof TLRPC.TL_inputPeerEmpty)) {
                                    hashSet.add(l10);
                                    tL_contacts_setBlocked.id.add(l1);
                                }
                            }
                            R1.N = hashSet.size() + R1.N;
                            tL_contacts_setBlocked.limit = Math.max(tL_contacts_setBlocked.limit, hashSet.size());
                            ConnectionsManager.getInstance(i17).sendRequest(tL_contacts_setBlocked, new ai.e1(b8Var, i16));
                            break;
                        } else {
                            q8Var.I1 = i14;
                            q8Var.N0();
                            q8Var.m1.A(0);
                            break;
                        }
                    } else if (q8Var.U1) {
                        HashSet S02 = q8.S0(arrayList, hashMap);
                        if (!S02.isEmpty()) {
                            q8Var.N0();
                            o8 o8Var2 = new o8(3, q8Var.a, new ArrayList(S02));
                            ArrayList arrayList6 = o8Var2.c;
                            arrayList6.clear();
                            arrayList6.addAll(arrayList);
                            HashMap hashMap6 = o8Var2.d;
                            hashMap6.clear();
                            hashMap6.putAll(hashMap);
                            q8Var.O0(o8Var2, new b8(l8Var, i10), false);
                            break;
                        }
                    } else if (!q8.S0(arrayList, hashMap).isEmpty()) {
                        q8Var.I1 = 3;
                        q8Var.N0();
                        q8Var.m1.A(0);
                        break;
                    }
                }
                break;
            case 1:
                q8 q8Var2 = l8Var.a0;
                if (q8Var2.J1) {
                    q8Var2.H1 = 5;
                    q8Var2.m1.A(1);
                    break;
                } else {
                    q8 q8Var3 = new q8(l8Var.getContext(), q8Var2.J0);
                    q8Var3.Q1 = new c8(l8Var, i11);
                    q8Var3.L1 = q8Var2.L1;
                    q8Var3.show();
                    break;
                }
            default:
                HashMap hashMap7 = l8Var.d;
                a0.h hVar = l8Var.b;
                ArrayList arrayList7 = l8Var.c;
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
                l8Var.a0.E1.clear();
                l8Var.y.d.a();
                l8Var.g(true);
                l8Var.f(true);
                break;
        }
    }
}
