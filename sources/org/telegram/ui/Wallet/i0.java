package org.telegram.ui.Wallet;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.hp;
import org.telegram.messenger.n10;
import org.telegram.tgnet.tl.TL_wallet;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class i0 implements n10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ j0 b;
    public final /* synthetic */ TL_wallet.getTransactions c;

    public /* synthetic */ i0(j0 j0Var, TL_wallet.getTransactions gettransactions, int i3) {
        this.a = i3;
        this.b = j0Var;
        this.c = gettransactions;
    }

    @Override // org.telegram.messenger.n10
    public final void a(Object obj, Object obj2) {
        boolean z10;
        boolean z11;
        switch (this.a) {
            case 0:
                TL_wallet.walletTransactions wallettransactions = (TL_wallet.walletTransactions) obj;
                j0 j0Var = this.b;
                int i3 = j0Var.l.a;
                j0Var.k = -1;
                if (wallettransactions != null) {
                    int i10 = 0;
                    hp.s1(i3).Y3(wallettransactions.users, false);
                    hp.s1(i3).S3(wallettransactions.chats, false);
                    ArrayList<TL_wallet.walletTransaction> arrayList = wallettransactions.transactions;
                    int size = arrayList.size();
                    while (i10 < size) {
                        TL_wallet.walletTransaction wallettransaction = arrayList.get(i10);
                        i10++;
                        TL_wallet.walletTransaction wallettransaction2 = wallettransaction;
                        if (wallettransaction2 != null) {
                            TL_wallet.walletTransaction c2 = j0Var.c(wallettransaction2);
                            j0Var.e(wallettransaction2);
                            if (c2 != null) {
                                c2.set(wallettransaction2);
                                if (!TextUtils.equals(c2.id, wallettransaction2.id)) {
                                    c2.id = wallettransaction2.id;
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
                int i11 = j0Var2.l.a;
                ArrayList arrayList2 = j0Var2.b;
                j0Var2.j = -1;
                j0Var2.i = false;
                if (wallettransactions2 != null) {
                    hp.s1(i11).Y3(wallettransactions2.users, false);
                    hp.s1(i11).S3(wallettransactions2.chats, false);
                    ArrayList<TL_wallet.walletTransaction> arrayList3 = wallettransactions2.transactions;
                    int size2 = arrayList3.size();
                    int i12 = 0;
                    while (true) {
                        if (i12 < size2) {
                            TL_wallet.walletTransaction wallettransaction3 = arrayList3.get(i12);
                            i12++;
                            if (j0Var2.c(wallettransaction3) != null) {
                                boolean z12 = false;
                                for (int size3 = wallettransactions2.transactions.size() - 1; size3 >= 0; size3--) {
                                    TL_wallet.walletTransaction wallettransaction4 = wallettransactions2.transactions.get(size3);
                                    TL_wallet.walletTransaction c10 = j0Var2.c(wallettransaction4);
                                    j0Var2.e(wallettransaction4);
                                    if (c10 != null) {
                                        boolean z13 = c10.set(wallettransaction4);
                                        if (!TextUtils.equals(c10.id, wallettransaction4.id)) {
                                            c10.id = wallettransaction4.id;
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
                            int i13 = 0;
                            while (i13 < size4) {
                                Object obj3 = arrayList2.get(i13);
                                i13++;
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
                            int i14 = 0;
                            while (i14 < size5) {
                                TL_wallet.walletTransaction wallettransaction6 = arrayList5.get(i14);
                                i14++;
                                j0Var2.e(wallettransaction6);
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
