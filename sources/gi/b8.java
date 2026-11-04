package gi;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.hp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class b8 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ o8 b;

    public /* synthetic */ b8(o8 o8Var, int i3) {
        this.a = i3;
        this.b = o8Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        r8 r8Var;
        int i3 = this.a;
        int i10 = 5;
        int i11 = 0;
        o8 o8Var = this.b;
        int i12 = 1;
        switch (i3) {
            case 0:
                HashMap hashMap = o8Var.d;
                ArrayList arrayList = o8Var.c;
                t8 t8Var = o8Var.a0;
                d dVar = o8Var.w;
                if (!dVar.R) {
                    int i13 = t8.V1;
                    int i14 = t8Var.a;
                    HashMap hashMap2 = t8Var.m1;
                    ArrayList arrayList2 = t8Var.l1;
                    HashMap hashMap3 = t8Var.q1;
                    ArrayList arrayList3 = t8Var.p1;
                    hp s12 = hp.s1(i14);
                    int i15 = o8Var.a;
                    if (i15 == 5) {
                        d8 d8Var = t8Var.N1;
                        if (d8Var != null) {
                            d8Var.a(arrayList);
                        }
                        t8Var.dismiss();
                        break;
                    } else if (i15 == 1) {
                        TLRPC.TL_editCloseFriends tL_editCloseFriends = new TLRPC.TL_editCloseFriends();
                        tL_editCloseFriends.id.addAll(arrayList);
                        dVar.setLoading(true);
                        ConnectionsManager.getInstance(t8Var.a).sendRequest(tL_editCloseFriends, new ai.f3(17, o8Var, s12));
                        break;
                    } else if (i15 == 0) {
                        int i16 = t8Var.F1;
                        if (i16 == 3) {
                            r8Var = new r8(t8Var.F1, t8Var.a, new ArrayList(t8.R0(arrayList3, hashMap3)));
                            ArrayList arrayList4 = r8Var.c;
                            arrayList4.clear();
                            arrayList4.addAll(arrayList3);
                            HashMap hashMap4 = r8Var.d;
                            hashMap4.clear();
                            hashMap4.putAll(hashMap3);
                        } else if (i16 == 2) {
                            r8Var = new r8(i16, t8Var.a, t8Var.o1);
                        } else if (i16 == 4) {
                            r8Var = new r8(t8Var.F1, t8Var.a, new ArrayList(t8.R0(arrayList2, hashMap2)));
                            ArrayList arrayList5 = r8Var.c;
                            arrayList5.clear();
                            arrayList5.addAll(arrayList2);
                            HashMap hashMap5 = r8Var.d;
                            hashMap5.clear();
                            hashMap5.putAll(hashMap2);
                        } else {
                            r8Var = new r8(i16, t8Var.a, (ArrayList) null);
                        }
                        t8Var.N0(r8Var, new ei.y3(t8Var, 1), false);
                        break;
                    } else if (i15 == 2) {
                        if (t8Var.R1) {
                            t8Var.M0();
                            t8Var.N0(new r8(2, t8Var.a, arrayList), new ei.y3(t8Var, 1), false);
                            break;
                        } else {
                            t8Var.M0();
                            t8Var.j1.D(0);
                            break;
                        }
                    } else if (i15 != 3) {
                        if (i15 == 6) {
                            HashSet R0 = t8.R0(arrayList, hashMap);
                            dVar.setLoading(true);
                            ei.z6 P1 = hp.s1(t8Var.a).P1();
                            c8 c8Var = new c8(o8Var, i12);
                            int i17 = P1.a;
                            TLRPC.TL_contacts_setBlocked tL_contacts_setBlocked = new TLRPC.TL_contacts_setBlocked();
                            tL_contacts_setBlocked.my_stories_from = true;
                            HashSet hashSet = P1.L;
                            tL_contacts_setBlocked.limit = hashSet.size();
                            int size = P1.N - hashSet.size();
                            P1.N = size;
                            if (size < 0) {
                                P1.N = 0;
                            }
                            hashSet.clear();
                            Iterator it = R0.iterator();
                            while (it.hasNext()) {
                                Long l10 = (Long) it.next();
                                TLRPC.InputPeer j12 = hp.s1(i17).j1(l10.longValue());
                                if (!(j12 instanceof TLRPC.TL_inputPeerEmpty)) {
                                    hashSet.add(l10);
                                    tL_contacts_setBlocked.id.add(j12);
                                }
                            }
                            P1.N = hashSet.size() + P1.N;
                            tL_contacts_setBlocked.limit = Math.max(tL_contacts_setBlocked.limit, hashSet.size());
                            ConnectionsManager.getInstance(i17).sendRequest(tL_contacts_setBlocked, new ci.d0(c8Var, i10));
                            break;
                        } else {
                            t8Var.F1 = i15;
                            t8Var.M0();
                            t8Var.j1.D(0);
                            break;
                        }
                    } else if (t8Var.R1) {
                        HashSet R02 = t8.R0(arrayList, hashMap);
                        if (!R02.isEmpty()) {
                            t8Var.M0();
                            r8 r8Var2 = new r8(3, t8Var.a, new ArrayList(R02));
                            ArrayList arrayList6 = r8Var2.c;
                            arrayList6.clear();
                            arrayList6.addAll(arrayList);
                            HashMap hashMap6 = r8Var2.d;
                            hashMap6.clear();
                            hashMap6.putAll(hashMap);
                            t8Var.N0(r8Var2, new c8(o8Var, i11), false);
                            break;
                        }
                    } else if (!t8.R0(arrayList, hashMap).isEmpty()) {
                        t8Var.F1 = 3;
                        t8Var.M0();
                        t8Var.j1.D(0);
                        break;
                    }
                }
                break;
            case 1:
                t8 t8Var2 = o8Var.a0;
                if (t8Var2.G1) {
                    t8Var2.E1 = 5;
                    t8Var2.j1.D(1);
                    break;
                } else {
                    t8 t8Var3 = new t8(o8Var.getContext(), t8Var2.J0);
                    t8Var3.N1 = new d8(o8Var, i12);
                    t8Var3.I1 = t8Var2.I1;
                    t8Var3.show();
                    break;
                }
            default:
                HashMap hashMap7 = o8Var.d;
                a0.h hVar = o8Var.b;
                ArrayList arrayList7 = o8Var.c;
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
                o8Var.a0.B1.clear();
                o8Var.y.d.a();
                o8Var.g(true);
                o8Var.f(true);
                break;
        }
    }
}
