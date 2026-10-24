package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_aicompose;
import org.telegram.tgnet.tl.TL_wallet;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final /* synthetic */ class o implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ o(Object obj, int i10, int i11) {
        this.a = i11;
        this.c = obj;
        this.b = i10;
    }

    @Override // org.telegram.messenger.Utilities.Callback2
    public final void run(Object obj, Object obj2) {
        String str;
        int i10 = this.a;
        int i11 = this.b;
        Object obj3 = this.c;
        switch (i10) {
            case 0:
                q qVar = (q) obj3;
                TL_aicompose.aiComposeToneExample aicomposetoneexample = (TL_aicompose.aiComposeToneExample) obj;
                if (aicomposetoneexample != null) {
                    qVar.i0[i11] = aicomposetoneexample;
                    qVar.g0.N(true);
                    break;
                } else {
                    qVar.getClass();
                    break;
                }
            case 1:
                org.telegram.ui.Wallet.n0 n0Var = (org.telegram.ui.Wallet.n0) obj3;
                TL_wallet.walletTransactions wallettransactions = (TL_wallet.walletTransactions) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (n0Var.d && n0Var.e == i11) {
                    n0Var.g = -1;
                    AndroidUtilities.cancelRunOnUIThread(n0Var.h);
                    StringBuilder sb2 = new StringBuilder("[gram-wallet-polling] account=");
                    sb2.append(n0Var.a);
                    sb2.append(" msg_hash=");
                    sb2.append(n0Var.b);
                    sb2.append(" transactions=");
                    sb2.append(wallettransactions == null ? "none" : Integer.valueOf(wallettransactions.transactions.size()));
                    sb2.append(" errorCode=");
                    sb2.append(tL_error != null ? Integer.valueOf(tL_error.code) : "none");
                    FileLog.d(sb2.toString());
                    if (tL_error == null && wallettransactions != null) {
                        org.telegram.ui.ql0 ql0Var = n0Var.c;
                        org.telegram.ui.Wallet.l0 l0Var = (org.telegram.ui.Wallet.l0) ql0Var.b;
                        TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) ql0Var.c;
                        int i12 = l0Var.a;
                        Iterator<TL_wallet.walletTransaction> it = wallettransactions.transactions.iterator();
                        if (it.hasNext()) {
                            TL_wallet.walletTransaction next = it.next();
                            MessagesController.getInstance(i12).putUsers(wallettransactions.users, false);
                            MessagesController.getInstance(i12).putChats(wallettransactions.chats, false);
                            l0Var.b(wallettransaction, next);
                            l0Var.C();
                            n0Var.b();
                            break;
                        }
                    }
                    if (n0Var.d && n0Var.e == i11) {
                        n0Var.a();
                        break;
                    }
                }
                break;
            default:
                ArrayList arrayList = (ArrayList) obj;
                b71 b71Var = (b71) obj2;
                org.telegram.ui.Wallet.o5 o5Var = ((org.telegram.ui.Wallet.i4) obj3).b;
                if (i11 == 0) {
                    b71Var.U();
                    org.telegram.ui.Wallet.k0 k0Var = o5Var.C0;
                    boolean z10 = (k0Var == null || k0Var.c.isEmpty()) ? false : true;
                    if (z10) {
                        for (int i13 = 0; i13 < o5Var.C0.c.size(); i13++) {
                            TL_wallet.walletTransaction wallettransaction2 = (TL_wallet.walletTransaction) o5Var.C0.c.get(i13);
                            org.telegram.ui.Wallet.e3 e3Var = o5Var.C0.a;
                            int i14 = org.telegram.ui.Wallet.d3.a;
                            m61 J = m61.J(org.telegram.ui.Wallet.d3.class);
                            org.telegram.ui.Wallet.c3 c3Var = new org.telegram.ui.Wallet.c3(wallettransaction2);
                            c3Var.set(wallettransaction2);
                            c3Var.id = wallettransaction2.id;
                            c3Var.random_id = wallettransaction2.random_id;
                            c3Var.gasless = wallettransaction2.gasless;
                            c3Var.gaslessMessageBodyHash = wallettransaction2.gaslessMessageBodyHash;
                            c3Var.normalMessageBodyHash = wallettransaction2.normalMessageBodyHash;
                            c3Var.nft = wallettransaction2.nft;
                            J.G = c3Var;
                            J.H = e3Var;
                            TL_wallet.WalletTransactionPeer walletTransactionPeer = wallettransaction2.peer;
                            J.l = walletTransactionPeer == null ? null : e3Var.a(walletTransactionPeer.address);
                            arrayList.add(J);
                        }
                    }
                    org.telegram.ui.Wallet.k0 k0Var2 = o5Var.C0;
                    if (k0Var2 != null && !k0Var2.h) {
                        arrayList.add(m61.o(-1, 37));
                        arrayList.add(m61.o(-2, 37));
                        arrayList.add(m61.o(-3, 37));
                    }
                    b71Var.T();
                    if (z10) {
                        long j10 = o5Var.getMessagesController().config.walletTransferMinNanos.get();
                        if (j10 > 0) {
                            arrayList.add(m61.B(LocaleController.formatSpannable(R.string.WalletHiddenTransactions, org.telegram.ui.Wallet.l0.r(j10, false))));
                            break;
                        }
                    }
                } else {
                    org.telegram.ui.Wallet.d0 d0Var = o5Var.D0;
                    if (d0Var != null) {
                        ArrayList arrayList2 = d0Var.a;
                        int size = arrayList2.size();
                        int i15 = 0;
                        while (i15 < size) {
                            Object obj4 = arrayList2.get(i15);
                            i15++;
                            TL_wallet.nftItem nftitem = (TL_wallet.nftItem) obj4;
                            if (o5Var.j0.isEmpty() || ((str = nftitem.name) != null && str.toLowerCase(Locale.ROOT).contains(o5Var.j0))) {
                                if (nftitem.gift != null) {
                                    org.telegram.ui.Wallet.t7 t7Var = o5Var.i0;
                                    int i16 = org.telegram.ui.Wallet.f7.a;
                                    m61 J2 = m61.J(org.telegram.ui.Wallet.f7.class);
                                    J2.u = 1;
                                    J2.G = nftitem;
                                    J2.H = t7Var;
                                    arrayList.add(J2);
                                } else {
                                    int i17 = org.telegram.ui.Wallet.b.a;
                                    m61 J3 = m61.J(org.telegram.ui.Wallet.b.class);
                                    J3.G = nftitem;
                                    J3.u = 1;
                                    arrayList.add(J3);
                                }
                            }
                        }
                        if (arrayList.isEmpty() && !o5Var.j0.isEmpty()) {
                            org.telegram.ui.Wallet.d0 d0Var2 = o5Var.D0;
                            if (!d0Var2.i && d0Var2.g) {
                                arrayList.add(m61.q(LocaleController.getString(R.string.NoResult)));
                            }
                        }
                        org.telegram.ui.Wallet.d0 d0Var3 = o5Var.D0;
                        if (d0Var3.i) {
                            for (int i18 = 0; i18 < 3; i18++) {
                                m61 o10 = m61.o((-1) - i18, 35);
                                o10.u = 1;
                                arrayList.add(o10);
                            }
                            break;
                        } else if (d0Var3.k != null) {
                            arrayList.add(m61.e(-10001, LocaleController.getString(R.string.Retry)));
                            break;
                        }
                    }
                }
                break;
        }
    }
}
