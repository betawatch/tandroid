package org.telegram.ui.Wallet;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.qp;
import org.telegram.messenger.v10;
import org.telegram.tgnet.tl.TL_wallet;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes4.dex */
public final /* synthetic */ class k0 implements v10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ l0 b;
    public final /* synthetic */ TL_wallet.getTransactions c;

    public /* synthetic */ k0(l0 l0Var, TL_wallet.getTransactions gettransactions, int i7) {
        this.a = i7;
        this.b = l0Var;
        this.c = gettransactions;
    }

    @Override // org.telegram.messenger.v10
    public final void a(Object obj, Object obj2) {
        boolean z9;
        boolean z10;
        switch (this.a) {
            case 0:
                TL_wallet.walletTransactions wallettransactions = (TL_wallet.walletTransactions) obj;
                l0 l0Var = this.b;
                int i7 = l0Var.l.a;
                l0Var.k = -1;
                if (wallettransactions != null) {
                    int i10 = 0;
                    qp.s1(i7).Y3(wallettransactions.users, false);
                    qp.s1(i7).S3(wallettransactions.chats, false);
                    ArrayList<TL_wallet.walletTransaction> arrayList = wallettransactions.transactions;
                    int size = arrayList.size();
                    while (i10 < size) {
                        TL_wallet.walletTransaction wallettransaction = arrayList.get(i10);
                        i10++;
                        TL_wallet.walletTransaction wallettransaction2 = wallettransaction;
                        if (wallettransaction2 != null) {
                            TL_wallet.walletTransaction c10 = l0Var.c(wallettransaction2);
                            l0Var.e(wallettransaction2);
                            if (c10 != null) {
                                c10.set(wallettransaction2);
                                if (!TextUtils.equals(c10.id, wallettransaction2.id)) {
                                    c10.id = wallettransaction2.id;
                                }
                            } else {
                                l0Var.b.add(wallettransaction2);
                            }
                        }
                    }
                    l0Var.g = wallettransactions.next_offset;
                    if (wallettransactions.transactions.size() < this.c.limit) {
                        l0Var.h = true;
                    }
                } else {
                    l0Var.h = true;
                }
                l0Var.k();
                l0Var.i();
                break;
            default:
                l0 l0Var2 = this.b;
                HashMap hashMap = l0Var2.f;
                HashSet hashSet = l0Var2.d;
                TL_wallet.walletTransactions wallettransactions2 = (TL_wallet.walletTransactions) obj;
                int i11 = l0Var2.l.a;
                ArrayList arrayList2 = l0Var2.b;
                l0Var2.j = -1;
                l0Var2.i = false;
                if (wallettransactions2 != null) {
                    qp.s1(i11).Y3(wallettransactions2.users, false);
                    qp.s1(i11).S3(wallettransactions2.chats, false);
                    ArrayList<TL_wallet.walletTransaction> arrayList3 = wallettransactions2.transactions;
                    int size2 = arrayList3.size();
                    int i12 = 0;
                    while (true) {
                        if (i12 < size2) {
                            TL_wallet.walletTransaction wallettransaction3 = arrayList3.get(i12);
                            i12++;
                            if (l0Var2.c(wallettransaction3) != null) {
                                boolean z11 = false;
                                for (int size3 = wallettransactions2.transactions.size() - 1; size3 >= 0; size3--) {
                                    TL_wallet.walletTransaction wallettransaction4 = wallettransactions2.transactions.get(size3);
                                    TL_wallet.walletTransaction c11 = l0Var2.c(wallettransaction4);
                                    l0Var2.e(wallettransaction4);
                                    if (c11 != null) {
                                        boolean z12 = c11.set(wallettransaction4);
                                        if (!TextUtils.equals(c11.id, wallettransaction4.id)) {
                                            c11.id = wallettransaction4.id;
                                            z12 = true;
                                        }
                                        if (!z12) {
                                        }
                                    } else {
                                        arrayList2.add(0, wallettransaction4);
                                    }
                                    z11 = true;
                                }
                                r4 = z11;
                            }
                        } else {
                            ArrayList arrayList4 = new ArrayList();
                            int size4 = arrayList2.size();
                            int i13 = 0;
                            while (i13 < size4) {
                                Object obj3 = arrayList2.get(i13);
                                i13++;
                                TL_wallet.walletTransaction wallettransaction5 = (TL_wallet.walletTransaction) obj3;
                                Iterator it = hashSet.iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        z10 = false;
                                    } else if (hashMap.get((String) it.next()) == wallettransaction5) {
                                        z10 = true;
                                    }
                                }
                                if (z10) {
                                    arrayList4.add(wallettransaction5);
                                }
                            }
                            ArrayList<TL_wallet.walletTransaction> arrayList5 = wallettransactions2.transactions;
                            int size5 = arrayList5.size();
                            int i14 = 0;
                            while (i14 < size5) {
                                TL_wallet.walletTransaction wallettransaction6 = arrayList5.get(i14);
                                i14++;
                                l0Var2.e(wallettransaction6);
                            }
                            arrayList2.clear();
                            arrayList2.addAll(wallettransactions2.transactions);
                            int size6 = arrayList4.size();
                            int i15 = 0;
                            while (i15 < size6) {
                                Object obj4 = arrayList4.get(i15);
                                i15++;
                                TL_wallet.walletTransaction wallettransaction7 = (TL_wallet.walletTransaction) obj4;
                                Iterator it2 = hashSet.iterator();
                                while (true) {
                                    if (!it2.hasNext()) {
                                        z9 = false;
                                    } else if (hashMap.get((String) it2.next()) == wallettransaction7) {
                                        z9 = true;
                                    }
                                }
                                if (z9) {
                                    l0Var2.f(wallettransaction7);
                                }
                            }
                            l0Var2.g = wallettransactions2.next_offset;
                            l0Var2.h = wallettransactions2.transactions.size() < this.c.limit;
                            r4 = true;
                        }
                    }
                }
                if (r4) {
                    l0Var2.k();
                    l0Var2.i();
                    break;
                }
                break;
        }
    }
}
