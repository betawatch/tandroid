package org.telegram.ui.Wallet;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_wallet;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final /* synthetic */ class j0 implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ k0 b;
    public final /* synthetic */ TL_wallet.getTransactions c;

    public /* synthetic */ j0(k0 k0Var, TL_wallet.getTransactions gettransactions, int i10) {
        this.a = i10;
        this.b = k0Var;
        this.c = gettransactions;
    }

    @Override // org.telegram.messenger.Utilities.Callback2
    public final void run(Object obj, Object obj2) {
        boolean z10;
        boolean z11;
        switch (this.a) {
            case 0:
                k0 k0Var = this.b;
                HashMap hashMap = k0Var.f;
                HashSet hashSet = k0Var.d;
                TL_wallet.walletTransactions wallettransactions = (TL_wallet.walletTransactions) obj;
                int i10 = k0Var.l.a;
                ArrayList arrayList = k0Var.b;
                k0Var.j = -1;
                k0Var.i = false;
                if (wallettransactions != null) {
                    MessagesController.getInstance(i10).putUsers(wallettransactions.users, false);
                    MessagesController.getInstance(i10).putChats(wallettransactions.chats, false);
                    ArrayList<TL_wallet.walletTransaction> arrayList2 = wallettransactions.transactions;
                    int size = arrayList2.size();
                    int i11 = 0;
                    while (true) {
                        if (i11 < size) {
                            TL_wallet.walletTransaction wallettransaction = arrayList2.get(i11);
                            i11++;
                            if (k0Var.c(wallettransaction) != null) {
                                boolean z12 = false;
                                for (int size2 = wallettransactions.transactions.size() - 1; size2 >= 0; size2--) {
                                    TL_wallet.walletTransaction wallettransaction2 = wallettransactions.transactions.get(size2);
                                    TL_wallet.walletTransaction c10 = k0Var.c(wallettransaction2);
                                    k0Var.e(wallettransaction2);
                                    if (c10 != null) {
                                        boolean z13 = c10.set(wallettransaction2);
                                        if (!TextUtils.equals(c10.id, wallettransaction2.id)) {
                                            c10.id = wallettransaction2.id;
                                            z13 = true;
                                        }
                                        if (!z13) {
                                        }
                                    } else {
                                        arrayList.add(0, wallettransaction2);
                                    }
                                    z12 = true;
                                }
                                r4 = z12;
                            }
                        } else {
                            ArrayList arrayList3 = new ArrayList();
                            int size3 = arrayList.size();
                            int i12 = 0;
                            while (i12 < size3) {
                                Object obj3 = arrayList.get(i12);
                                i12++;
                                TL_wallet.walletTransaction wallettransaction3 = (TL_wallet.walletTransaction) obj3;
                                Iterator it = hashSet.iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        z11 = false;
                                    } else if (hashMap.get((String) it.next()) == wallettransaction3) {
                                        z11 = true;
                                    }
                                }
                                if (z11) {
                                    arrayList3.add(wallettransaction3);
                                }
                            }
                            ArrayList<TL_wallet.walletTransaction> arrayList4 = wallettransactions.transactions;
                            int size4 = arrayList4.size();
                            int i13 = 0;
                            while (i13 < size4) {
                                TL_wallet.walletTransaction wallettransaction4 = arrayList4.get(i13);
                                i13++;
                                k0Var.e(wallettransaction4);
                            }
                            arrayList.clear();
                            arrayList.addAll(wallettransactions.transactions);
                            int size5 = arrayList3.size();
                            int i14 = 0;
                            while (i14 < size5) {
                                Object obj4 = arrayList3.get(i14);
                                i14++;
                                TL_wallet.walletTransaction wallettransaction5 = (TL_wallet.walletTransaction) obj4;
                                Iterator it2 = hashSet.iterator();
                                while (true) {
                                    if (!it2.hasNext()) {
                                        z10 = false;
                                    } else if (hashMap.get((String) it2.next()) == wallettransaction5) {
                                        z10 = true;
                                    }
                                }
                                if (z10) {
                                    k0Var.f(wallettransaction5);
                                }
                            }
                            k0Var.g = wallettransactions.next_offset;
                            k0Var.h = wallettransactions.transactions.size() < this.c.limit;
                            r4 = true;
                        }
                    }
                }
                if (r4) {
                    k0Var.k();
                    k0Var.i();
                    break;
                }
                break;
            default:
                TL_wallet.walletTransactions wallettransactions2 = (TL_wallet.walletTransactions) obj;
                k0 k0Var2 = this.b;
                int i15 = k0Var2.l.a;
                k0Var2.k = -1;
                if (wallettransactions2 != null) {
                    int i16 = 0;
                    MessagesController.getInstance(i15).putUsers(wallettransactions2.users, false);
                    MessagesController.getInstance(i15).putChats(wallettransactions2.chats, false);
                    ArrayList<TL_wallet.walletTransaction> arrayList5 = wallettransactions2.transactions;
                    int size6 = arrayList5.size();
                    while (i16 < size6) {
                        TL_wallet.walletTransaction wallettransaction6 = arrayList5.get(i16);
                        i16++;
                        TL_wallet.walletTransaction wallettransaction7 = wallettransaction6;
                        if (wallettransaction7 != null) {
                            TL_wallet.walletTransaction c11 = k0Var2.c(wallettransaction7);
                            k0Var2.e(wallettransaction7);
                            if (c11 != null) {
                                c11.set(wallettransaction7);
                                if (!TextUtils.equals(c11.id, wallettransaction7.id)) {
                                    c11.id = wallettransaction7.id;
                                }
                            } else {
                                k0Var2.b.add(wallettransaction7);
                            }
                        }
                    }
                    k0Var2.g = wallettransactions2.next_offset;
                    if (wallettransactions2.transactions.size() < this.c.limit) {
                        k0Var2.h = true;
                    }
                } else {
                    k0Var2.h = true;
                }
                k0Var2.k();
                k0Var2.i();
                break;
        }
    }
}
