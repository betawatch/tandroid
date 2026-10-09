package org.telegram.ui.Wallet;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_wallet;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final /* synthetic */ class i0 implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ j0 b;
    public final /* synthetic */ TL_wallet.getTransactions c;

    public /* synthetic */ i0(j0 j0Var, TL_wallet.getTransactions gettransactions, int i10) {
        this.a = i10;
        this.b = j0Var;
        this.c = gettransactions;
    }

    @Override // org.telegram.messenger.Utilities.Callback2
    public final void run(Object obj, Object obj2) {
        TL_wallet.walletTransactions wallettransactions = (TL_wallet.walletTransactions) obj;
        switch (this.a) {
            case 0:
                j0 j0Var = this.b;
                HashMap hashMap = j0Var.e;
                int i10 = j0Var.j.a;
                HashSet hashSet = j0Var.d;
                ArrayList arrayList = j0Var.b;
                j0Var.h = -1;
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
                            if (j0.b(wallettransaction.id, arrayList) != null) {
                                boolean z10 = false;
                                for (int size2 = wallettransactions.transactions.size() - 1; size2 >= 0; size2--) {
                                    TL_wallet.walletTransaction wallettransaction2 = wallettransactions.transactions.get(size2);
                                    hashSet.remove(wallettransaction2.id);
                                    hashMap.remove(wallettransaction2.id);
                                    TL_wallet.walletTransaction b10 = j0.b(wallettransaction2.id, arrayList);
                                    if (b10 == null) {
                                        arrayList.add(0, wallettransaction2);
                                    } else if (!b10.set(wallettransaction2)) {
                                    }
                                    z10 = true;
                                }
                                r4 = z10;
                            }
                        } else {
                            ArrayList arrayList3 = new ArrayList();
                            int size3 = arrayList.size();
                            int i12 = 0;
                            while (i12 < size3) {
                                Object obj3 = arrayList.get(i12);
                                i12++;
                                TL_wallet.walletTransaction wallettransaction3 = (TL_wallet.walletTransaction) obj3;
                                if (hashSet.contains(wallettransaction3.id)) {
                                    arrayList3.add(wallettransaction3);
                                }
                            }
                            ArrayList<TL_wallet.walletTransaction> arrayList4 = wallettransactions.transactions;
                            int size4 = arrayList4.size();
                            int i13 = 0;
                            while (i13 < size4) {
                                TL_wallet.walletTransaction wallettransaction4 = arrayList4.get(i13);
                                i13++;
                                TL_wallet.walletTransaction wallettransaction5 = wallettransaction4;
                                hashSet.remove(wallettransaction5.id);
                                hashMap.remove(wallettransaction5.id);
                            }
                            arrayList.clear();
                            arrayList.addAll(wallettransactions.transactions);
                            int size5 = arrayList3.size();
                            int i14 = 0;
                            while (i14 < size5) {
                                Object obj4 = arrayList3.get(i14);
                                i14++;
                                TL_wallet.walletTransaction wallettransaction6 = (TL_wallet.walletTransaction) obj4;
                                if (hashSet.contains(wallettransaction6.id)) {
                                    j0Var.c(wallettransaction6);
                                }
                            }
                            j0Var.f = wallettransactions.next_offset;
                            j0Var.g = wallettransactions.transactions.size() < this.c.limit;
                            r4 = true;
                        }
                    }
                }
                if (r4) {
                    j0Var.h();
                    j0Var.f();
                    break;
                }
                break;
            default:
                j0 j0Var2 = this.b;
                int i15 = j0Var2.j.a;
                j0Var2.i = -1;
                if (wallettransactions != null) {
                    MessagesController.getInstance(i15).putUsers(wallettransactions.users, false);
                    MessagesController.getInstance(i15).putChats(wallettransactions.chats, false);
                    ArrayList<TL_wallet.walletTransaction> arrayList5 = wallettransactions.transactions;
                    int size6 = arrayList5.size();
                    int i16 = 0;
                    while (i16 < size6) {
                        TL_wallet.walletTransaction wallettransaction7 = arrayList5.get(i16);
                        i16++;
                        TL_wallet.walletTransaction wallettransaction8 = wallettransaction7;
                        ArrayList arrayList6 = j0Var2.b;
                        if (wallettransaction8 != null) {
                            int i17 = 0;
                            while (true) {
                                if (i17 < arrayList6.size()) {
                                    TL_wallet.walletTransaction wallettransaction9 = (TL_wallet.walletTransaction) arrayList6.get(i17);
                                    if (TextUtils.equals(wallettransaction9.id, wallettransaction8.id)) {
                                        j0Var2.d.remove(wallettransaction8.id);
                                        j0Var2.e.remove(wallettransaction8.id);
                                        wallettransaction9.set(wallettransaction8);
                                    } else {
                                        i17++;
                                    }
                                } else {
                                    arrayList6.add(wallettransaction8);
                                }
                            }
                        }
                    }
                    j0Var2.f = wallettransactions.next_offset;
                    if (wallettransactions.transactions.size() < this.c.limit) {
                        j0Var2.g = true;
                    }
                } else {
                    j0Var2.g = true;
                }
                j0Var2.h();
                j0Var2.f();
                break;
        }
    }
}
