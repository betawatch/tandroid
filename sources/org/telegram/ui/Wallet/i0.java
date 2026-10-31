package org.telegram.ui.Wallet;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.j20;
import org.telegram.messenger.vp;
import org.telegram.tgnet.tl.TL_wallet;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class i0 implements j20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ j0 b;
    public final /* synthetic */ TL_wallet.getTransactions c;

    public /* synthetic */ i0(j0 j0Var, TL_wallet.getTransactions gettransactions, int i10) {
        this.a = i10;
        this.b = j0Var;
        this.c = gettransactions;
    }

    @Override // org.telegram.messenger.j20
    public final void a(Object obj, Object obj2) {
        boolean z10;
        boolean z11;
        switch (this.a) {
            case 0:
                TL_wallet.walletTransactions wallettransactions = (TL_wallet.walletTransactions) obj;
                j0 j0Var = this.b;
                int i10 = j0Var.l.a;
                j0Var.k = -1;
                if (wallettransactions != null) {
                    int i11 = 0;
                    vp.r1(i10).V3(wallettransactions.users, false);
                    vp.r1(i10).P3(wallettransactions.chats, false);
                    ArrayList<TL_wallet.walletTransaction> arrayList = wallettransactions.transactions;
                    int size = arrayList.size();
                    while (i11 < size) {
                        TL_wallet.walletTransaction wallettransaction = arrayList.get(i11);
                        i11++;
                        TL_wallet.walletTransaction wallettransaction2 = wallettransaction;
                        if (wallettransaction2 != null) {
                            TL_wallet.walletTransaction c10 = j0Var.c(wallettransaction2);
                            j0Var.e(wallettransaction2);
                            if (c10 != null) {
                                c10.set(wallettransaction2);
                                if (!TextUtils.equals(c10.id, wallettransaction2.id)) {
                                    c10.id = wallettransaction2.id;
                                }
                            } else {
                                j0Var.b.add(wallettransaction2);
                            }
                        }
                    }
                    j0Var.g = wallettransactions.next_offset;
                    if (wallettransactions.transactions.size() < this.c.limit) {
                        j0Var.h = true;
                    }
                } else {
                    j0Var.h = true;
                }
                j0Var.k();
                j0Var.i();
                break;
            default:
                j0 j0Var2 = this.b;
                HashMap hashMap = j0Var2.f;
                HashSet hashSet = j0Var2.d;
                TL_wallet.walletTransactions wallettransactions2 = (TL_wallet.walletTransactions) obj;
                int i12 = j0Var2.l.a;
                ArrayList arrayList2 = j0Var2.b;
                j0Var2.j = -1;
                j0Var2.i = false;
                if (wallettransactions2 != null) {
                    vp.r1(i12).V3(wallettransactions2.users, false);
                    vp.r1(i12).P3(wallettransactions2.chats, false);
                    ArrayList<TL_wallet.walletTransaction> arrayList3 = wallettransactions2.transactions;
                    int size2 = arrayList3.size();
                    int i13 = 0;
                    while (true) {
                        if (i13 < size2) {
                            TL_wallet.walletTransaction wallettransaction3 = arrayList3.get(i13);
                            i13++;
                            if (j0Var2.c(wallettransaction3) != null) {
                                boolean z12 = false;
                                for (int size3 = wallettransactions2.transactions.size() - 1; size3 >= 0; size3--) {
                                    TL_wallet.walletTransaction wallettransaction4 = wallettransactions2.transactions.get(size3);
                                    TL_wallet.walletTransaction c11 = j0Var2.c(wallettransaction4);
                                    j0Var2.e(wallettransaction4);
                                    if (c11 != null) {
                                        boolean z13 = c11.set(wallettransaction4);
                                        if (!TextUtils.equals(c11.id, wallettransaction4.id)) {
                                            c11.id = wallettransaction4.id;
                                            z13 = true;
                                        }
                                        if (!z13) {
                                        }
                                    } else {
                                        arrayList2.add(0, wallettransaction4);
                                    }
                                    z12 = true;
                                }
                                r4 = z12;
                            }
                        } else {
                            ArrayList arrayList4 = new ArrayList();
                            int size4 = arrayList2.size();
                            int i14 = 0;
                            while (i14 < size4) {
                                Object obj3 = arrayList2.get(i14);
                                i14++;
                                TL_wallet.walletTransaction wallettransaction5 = (TL_wallet.walletTransaction) obj3;
                                Iterator it = hashSet.iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        z11 = false;
                                    } else if (hashMap.get((String) it.next()) == wallettransaction5) {
                                        z11 = true;
                                    }
                                }
                                if (z11) {
                                    arrayList4.add(wallettransaction5);
                                }
                            }
                            ArrayList<TL_wallet.walletTransaction> arrayList5 = wallettransactions2.transactions;
                            int size5 = arrayList5.size();
                            int i15 = 0;
                            while (i15 < size5) {
                                TL_wallet.walletTransaction wallettransaction6 = arrayList5.get(i15);
                                i15++;
                                j0Var2.e(wallettransaction6);
                            }
                            arrayList2.clear();
                            arrayList2.addAll(wallettransactions2.transactions);
                            int size6 = arrayList4.size();
                            int i16 = 0;
                            while (i16 < size6) {
                                Object obj4 = arrayList4.get(i16);
                                i16++;
                                TL_wallet.walletTransaction wallettransaction7 = (TL_wallet.walletTransaction) obj4;
                                Iterator it2 = hashSet.iterator();
                                while (true) {
                                    if (!it2.hasNext()) {
                                        z10 = false;
                                    } else if (hashMap.get((String) it2.next()) == wallettransaction7) {
                                        z10 = true;
                                    }
                                }
                                if (z10) {
                                    j0Var2.f(wallettransaction7);
                                }
                            }
                            j0Var2.g = wallettransactions2.next_offset;
                            j0Var2.h = wallettransactions2.transactions.size() < this.c.limit;
                            r4 = true;
                        }
                    }
                }
                if (r4) {
                    j0Var2.k();
                    j0Var2.i();
                    break;
                }
                break;
        }
    }
}
