package hi;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.mp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final /* synthetic */ class u8 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ f9 b;

    public /* synthetic */ u8(f9 f9Var, int i7) {
        this.a = i7;
        this.b = f9Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        i9 i9Var;
        int i7 = this.a;
        int i10 = 0;
        f9 f9Var = this.b;
        int i11 = 1;
        switch (i7) {
            case 0:
                HashMap hashMap = f9Var.d;
                ArrayList arrayList = f9Var.c;
                k9 k9Var = f9Var.a0;
                e eVar = f9Var.w;
                if (!eVar.R) {
                    int i12 = k9.Y1;
                    int i13 = k9Var.a;
                    HashMap hashMap2 = k9Var.p1;
                    ArrayList arrayList2 = k9Var.o1;
                    HashMap hashMap3 = k9Var.t1;
                    ArrayList arrayList3 = k9Var.s1;
                    mp u12 = mp.u1(i13);
                    int i14 = f9Var.a;
                    if (i14 == 5) {
                        w8 w8Var = k9Var.Q1;
                        if (w8Var != null) {
                            w8Var.a(arrayList);
                        }
                        k9Var.dismiss();
                        break;
                    } else if (i14 == 1) {
                        TLRPC.TL_editCloseFriends tL_editCloseFriends = new TLRPC.TL_editCloseFriends();
                        tL_editCloseFriends.id.addAll(arrayList);
                        eVar.setLoading(true);
                        ConnectionsManager.getInstance(k9Var.a).sendRequest(tL_editCloseFriends, new bi.o1(17, f9Var, u12));
                        break;
                    } else if (i14 == 0) {
                        int i15 = k9Var.I1;
                        if (i15 == 3) {
                            i9Var = new i9(k9Var.I1, k9Var.a, new ArrayList(k9.S0(arrayList3, hashMap3)));
                            ArrayList arrayList4 = i9Var.c;
                            arrayList4.clear();
                            arrayList4.addAll(arrayList3);
                            HashMap hashMap4 = i9Var.d;
                            hashMap4.clear();
                            hashMap4.putAll(hashMap3);
                        } else if (i15 == 2) {
                            i9Var = new i9(i15, k9Var.a, k9Var.r1);
                        } else if (i15 == 4) {
                            i9Var = new i9(k9Var.I1, k9Var.a, new ArrayList(k9.S0(arrayList2, hashMap2)));
                            ArrayList arrayList5 = i9Var.c;
                            arrayList5.clear();
                            arrayList5.addAll(arrayList2);
                            HashMap hashMap5 = i9Var.d;
                            hashMap5.clear();
                            hashMap5.putAll(hashMap2);
                        } else {
                            i9Var = new i9(i15, k9Var.a, (ArrayList) null);
                        }
                        k9Var.O0(i9Var, new fi.o3(k9Var, 1), false);
                        break;
                    } else if (i14 == 2) {
                        if (k9Var.U1) {
                            k9Var.N0();
                            k9Var.O0(new i9(2, k9Var.a, arrayList), new fi.o3(k9Var, 1), false);
                            break;
                        } else {
                            k9Var.N0();
                            k9Var.m1.C(0);
                            break;
                        }
                    } else if (i14 != 3) {
                        int i16 = 6;
                        if (i14 == 6) {
                            HashSet S0 = k9.S0(arrayList, hashMap);
                            eVar.setLoading(true);
                            fi.p6 R1 = mp.u1(k9Var.a).R1();
                            v8 v8Var = new v8(f9Var, i11);
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
                            ConnectionsManager.getInstance(i17).sendRequest(tL_contacts_setBlocked, new ai.b1(v8Var, i16));
                            break;
                        } else {
                            k9Var.I1 = i14;
                            k9Var.N0();
                            k9Var.m1.C(0);
                            break;
                        }
                    } else if (k9Var.U1) {
                        HashSet S02 = k9.S0(arrayList, hashMap);
                        if (!S02.isEmpty()) {
                            k9Var.N0();
                            i9 i9Var2 = new i9(3, k9Var.a, new ArrayList(S02));
                            ArrayList arrayList6 = i9Var2.c;
                            arrayList6.clear();
                            arrayList6.addAll(arrayList);
                            HashMap hashMap6 = i9Var2.d;
                            hashMap6.clear();
                            hashMap6.putAll(hashMap);
                            k9Var.O0(i9Var2, new v8(f9Var, i10), false);
                            break;
                        }
                    } else if (!k9.S0(arrayList, hashMap).isEmpty()) {
                        k9Var.I1 = 3;
                        k9Var.N0();
                        k9Var.m1.C(0);
                        break;
                    }
                }
                break;
            case 1:
                k9 k9Var2 = f9Var.a0;
                if (k9Var2.J1) {
                    k9Var2.H1 = 5;
                    k9Var2.m1.C(1);
                    break;
                } else {
                    k9 k9Var3 = new k9(f9Var.getContext(), k9Var2.J0);
                    k9Var3.Q1 = new w8(f9Var, i11);
                    k9Var3.L1 = k9Var2.L1;
                    k9Var3.show();
                    break;
                }
            default:
                HashMap hashMap7 = f9Var.d;
                a0.h hVar = f9Var.b;
                ArrayList arrayList7 = f9Var.c;
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
                f9Var.a0.E1.clear();
                f9Var.y.d.a();
                f9Var.g(true);
                f9Var.f(true);
                break;
        }
    }
}
