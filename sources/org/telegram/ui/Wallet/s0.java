package org.telegram.ui.Wallet;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.mp;
import org.telegram.messenger.q10;
import org.telegram.tgnet.tl.TL_wallet;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes4.dex */
public final /* synthetic */ class s0 implements q10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ t0 b;
    public final /* synthetic */ TL_wallet.getTransactions c;

    public /* synthetic */ s0(t0 t0Var, TL_wallet.getTransactions gettransactions, int i7) {
        this.a = i7;
        this.b = t0Var;
        this.c = gettransactions;
    }

    @Override // org.telegram.messenger.q10
    public final void a(Object obj, Object obj2) {
        boolean z10;
        boolean z11;
        boolean z12;
        switch (this.a) {
            case 0:
                TL_wallet.walletTransactions wallettransactions = (TL_wallet.walletTransactions) obj;
                t0 t0Var = this.b;
                int i7 = t0Var.m.a;
                t0Var.l = -1;
                int i10 = 0;
                t0Var.k = false;
                if (wallettransactions != null) {
                    mp.u1(i7).f4(wallettransactions.users, false);
                    mp.u1(i7).Z3(wallettransactions.chats, false);
                    int size = wallettransactions.transactions.size();
                    u0.p(wallettransactions.transactions);
                    ArrayList<TL_wallet.walletTransaction> arrayList = wallettransactions.transactions;
                    int size2 = arrayList.size();
                    while (i10 < size2) {
                        TL_wallet.walletTransaction wallettransaction = arrayList.get(i10);
                        i10++;
                        TL_wallet.walletTransaction wallettransaction2 = wallettransaction;
                        if (wallettransaction2 != null) {
                            TL_wallet.walletTransaction c10 = t0Var.c(wallettransaction2);
                            t0Var.e(wallettransaction2);
                            if (c10 != null) {
                                c10.set(wallettransaction2);
                                if (!TextUtils.equals(c10.id, wallettransaction2.id)) {
                                    c10.id = wallettransaction2.id;
                                }
                            } else {
                                t0Var.b.add(wallettransaction2);
                            }
                        }
                    }
                    String str = wallettransactions.next_offset;
                    t0Var.g = str;
                    if (size < this.c.limit || TextUtils.isEmpty(str)) {
                        t0Var.h = true;
                    }
                } else {
                    t0Var.h = true;
                }
                t0Var.k();
                t0Var.i();
                break;
            default:
                t0 t0Var2 = this.b;
                HashMap hashMap = t0Var2.f;
                HashSet hashSet = t0Var2.d;
                TL_wallet.walletTransactions wallettransactions2 = (TL_wallet.walletTransactions) obj;
                ArrayList arrayList2 = t0Var2.b;
                u0 u0Var = t0Var2.m;
                int i11 = u0Var.a;
                h hVar = u0Var.I;
                t0Var2.j = -1;
                t0Var2.i = false;
                if (wallettransactions2 != null) {
                    mp.u1(i11).f4(wallettransactions2.users, false);
                    mp.u1(i11).Z3(wallettransactions2.chats, false);
                    int size3 = wallettransactions2.transactions.size();
                    u0.p(wallettransactions2.transactions);
                    ArrayList<TL_wallet.walletTransaction> arrayList3 = wallettransactions2.transactions;
                    int size4 = arrayList3.size();
                    int i12 = 0;
                    while (true) {
                        if (i12 < size4) {
                            TL_wallet.walletTransaction wallettransaction3 = arrayList3.get(i12);
                            i12++;
                            if (t0Var2.c(wallettransaction3) != null) {
                                boolean z13 = false;
                                for (int size5 = wallettransactions2.transactions.size() - 1; size5 >= 0; size5--) {
                                    TL_wallet.walletTransaction wallettransaction4 = wallettransactions2.transactions.get(size5);
                                    TL_wallet.walletTransaction c11 = t0Var2.c(wallettransaction4);
                                    t0Var2.e(wallettransaction4);
                                    if (c11 != null) {
                                        boolean a10 = u0.a(c11);
                                        boolean z14 = c11.set(wallettransaction4);
                                        if (!TextUtils.equals(c11.id, wallettransaction4.id)) {
                                            c11.id = wallettransaction4.id;
                                            z14 = true;
                                        }
                                        if (z14) {
                                            z13 = true;
                                        }
                                        if (!a10 && u0.a(c11)) {
                                            org.telegram.messenger.g0.r(hVar);
                                            org.telegram.messenger.g0.h3(hVar, 300L);
                                        }
                                    } else {
                                        arrayList2.add(0, wallettransaction4);
                                        if (u0.a(wallettransaction4)) {
                                            org.telegram.messenger.g0.r(hVar);
                                            org.telegram.messenger.g0.h3(hVar, 300L);
                                        }
                                        z13 = true;
                                    }
                                }
                                z10 = z13;
                            }
                        } else {
                            boolean z15 = !arrayList2.isEmpty() || t0Var2.h;
                            boolean z16 = t0Var2.k;
                            if (z16) {
                                t0Var2.a();
                            }
                            ArrayList arrayList4 = new ArrayList();
                            int size6 = arrayList2.size();
                            int i13 = 0;
                            while (i13 < size6) {
                                Object obj3 = arrayList2.get(i13);
                                i13++;
                                TL_wallet.walletTransaction wallettransaction5 = (TL_wallet.walletTransaction) obj3;
                                Iterator it = hashSet.iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        z12 = false;
                                    } else if (hashMap.get((String) it.next()) == wallettransaction5) {
                                        z12 = true;
                                    }
                                }
                                if (z12) {
                                    arrayList4.add(wallettransaction5);
                                }
                            }
                            ArrayList<TL_wallet.walletTransaction> arrayList5 = wallettransactions2.transactions;
                            int size7 = arrayList5.size();
                            int i14 = 0;
                            while (i14 < size7) {
                                TL_wallet.walletTransaction wallettransaction6 = arrayList5.get(i14);
                                i14++;
                                TL_wallet.walletTransaction wallettransaction7 = wallettransaction6;
                                t0Var2.e(wallettransaction7);
                                if (z15 && u0.a(wallettransaction7)) {
                                    org.telegram.messenger.g0.r(hVar);
                                    org.telegram.messenger.g0.h3(hVar, 300L);
                                }
                            }
                            arrayList2.clear();
                            arrayList2.addAll(wallettransactions2.transactions);
                            int size8 = arrayList4.size();
                            int i15 = 0;
                            while (i15 < size8) {
                                Object obj4 = arrayList4.get(i15);
                                i15++;
                                TL_wallet.walletTransaction wallettransaction8 = (TL_wallet.walletTransaction) obj4;
                                Iterator it2 = hashSet.iterator();
                                while (true) {
                                    if (!it2.hasNext()) {
                                        z11 = false;
                                    } else if (hashMap.get((String) it2.next()) == wallettransaction8) {
                                        z11 = true;
                                    }
                                }
                                if (z11) {
                                    t0Var2.f(wallettransaction8);
                                }
                            }
                            String str2 = wallettransactions2.next_offset;
                            t0Var2.g = str2;
                            t0Var2.h = size3 < this.c.limit || TextUtils.isEmpty(str2);
                            if (z16) {
                                t0Var2.h();
                            }
                            z10 = true;
                        }
                    }
                } else {
                    z10 = false;
                }
                if (z10) {
                    t0Var2.k();
                    t0Var2.i();
                    break;
                }
                break;
        }
    }
}
