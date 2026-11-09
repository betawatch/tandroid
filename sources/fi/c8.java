package fi;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.qp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class c8 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ n8 b;

    public /* synthetic */ c8(n8 n8Var, int i7) {
        this.a = i7;
        this.b = n8Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        q8 q8Var;
        int i7 = this.a;
        int i10 = 5;
        int i11 = 0;
        n8 n8Var = this.b;
        int i12 = 1;
        switch (i7) {
            case 0:
                HashMap hashMap = n8Var.d;
                ArrayList arrayList = n8Var.c;
                s8 s8Var = n8Var.W;
                d dVar = n8Var.w;
                if (!dVar.Q) {
                    int i13 = s8.U1;
                    int i14 = s8Var.a;
                    HashMap hashMap2 = s8Var.l1;
                    ArrayList arrayList2 = s8Var.k1;
                    HashMap hashMap3 = s8Var.p1;
                    ArrayList arrayList3 = s8Var.o1;
                    qp s12 = qp.s1(i14);
                    int i15 = n8Var.a;
                    if (i15 == 5) {
                        e8 e8Var = s8Var.M1;
                        if (e8Var != null) {
                            e8Var.a(arrayList);
                        }
                        s8Var.dismiss();
                        break;
                    } else if (i15 == 1) {
                        TLRPC.TL_editCloseFriends tL_editCloseFriends = new TLRPC.TL_editCloseFriends();
                        tL_editCloseFriends.id.addAll(arrayList);
                        dVar.setLoading(true);
                        ConnectionsManager.getInstance(s8Var.a).sendRequest(tL_editCloseFriends, new bi.j(14, n8Var, s12));
                        break;
                    } else if (i15 == 0) {
                        int i16 = s8Var.E1;
                        if (i16 == 3) {
                            q8Var = new q8(s8Var.E1, s8Var.a, new ArrayList(s8.R0(arrayList3, hashMap3)));
                            ArrayList arrayList4 = q8Var.c;
                            arrayList4.clear();
                            arrayList4.addAll(arrayList3);
                            HashMap hashMap4 = q8Var.d;
                            hashMap4.clear();
                            hashMap4.putAll(hashMap3);
                        } else if (i16 == 2) {
                            q8Var = new q8(i16, s8Var.a, s8Var.n1);
                        } else if (i16 == 4) {
                            q8Var = new q8(s8Var.E1, s8Var.a, new ArrayList(s8.R0(arrayList2, hashMap2)));
                            ArrayList arrayList5 = q8Var.c;
                            arrayList5.clear();
                            arrayList5.addAll(arrayList2);
                            HashMap hashMap5 = q8Var.d;
                            hashMap5.clear();
                            hashMap5.putAll(hashMap2);
                        } else {
                            q8Var = new q8(i16, s8Var.a, (ArrayList) null);
                        }
                        s8Var.N0(q8Var, new di.x3(s8Var, 1), false);
                        break;
                    } else if (i15 == 2) {
                        if (s8Var.Q1) {
                            s8Var.M0();
                            s8Var.N0(new q8(2, s8Var.a, arrayList), new di.x3(s8Var, 1), false);
                            break;
                        } else {
                            s8Var.M0();
                            s8Var.i1.E(0);
                            break;
                        }
                    } else if (i15 != 3) {
                        if (i15 == 6) {
                            HashSet R0 = s8.R0(arrayList, hashMap);
                            dVar.setLoading(true);
                            di.z6 P1 = qp.s1(s8Var.a).P1();
                            d8 d8Var = new d8(n8Var, i12);
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
                                TLRPC.InputPeer j12 = qp.s1(i17).j1(l10.longValue());
                                if (!(j12 instanceof TLRPC.TL_inputPeerEmpty)) {
                                    hashSet.add(l10);
                                    tL_contacts_setBlocked.id.add(j12);
                                }
                            }
                            P1.N = hashSet.size() + P1.N;
                            tL_contacts_setBlocked.limit = Math.max(tL_contacts_setBlocked.limit, hashSet.size());
                            ConnectionsManager.getInstance(i17).sendRequest(tL_contacts_setBlocked, new bi.j0(d8Var, i10));
                            break;
                        } else {
                            s8Var.E1 = i15;
                            s8Var.M0();
                            s8Var.i1.E(0);
                            break;
                        }
                    } else if (s8Var.Q1) {
                        HashSet R02 = s8.R0(arrayList, hashMap);
                        if (!R02.isEmpty()) {
                            s8Var.M0();
                            q8 q8Var2 = new q8(3, s8Var.a, new ArrayList(R02));
                            ArrayList arrayList6 = q8Var2.c;
                            arrayList6.clear();
                            arrayList6.addAll(arrayList);
                            HashMap hashMap6 = q8Var2.d;
                            hashMap6.clear();
                            hashMap6.putAll(hashMap);
                            s8Var.N0(q8Var2, new d8(n8Var, i11), false);
                            break;
                        }
                    } else if (!s8.R0(arrayList, hashMap).isEmpty()) {
                        s8Var.E1 = 3;
                        s8Var.M0();
                        s8Var.i1.E(0);
                        break;
                    }
                }
                break;
            case 1:
                s8 s8Var2 = n8Var.W;
                if (s8Var2.F1) {
                    s8Var2.D1 = 5;
                    s8Var2.i1.E(1);
                    break;
                } else {
                    s8 s8Var3 = new s8(n8Var.getContext(), s8Var2.I0);
                    s8Var3.M1 = new e8(n8Var, i12);
                    s8Var3.H1 = s8Var2.H1;
                    s8Var3.show();
                    break;
                }
            default:
                HashMap hashMap7 = n8Var.d;
                a0.h hVar = n8Var.b;
                ArrayList arrayList7 = n8Var.c;
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
                n8Var.W.A1.clear();
                n8Var.y.d.a();
                n8Var.g(true);
                n8Var.f(true);
                break;
        }
    }
}
