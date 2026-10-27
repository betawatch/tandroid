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
import org.telegram.ui.bh1;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
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
                    qVar.g0.O(true);
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
                        bh1 bh1Var = n0Var.c;
                        org.telegram.ui.Wallet.l0 l0Var = (org.telegram.ui.Wallet.l0) bh1Var.b;
                        TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) bh1Var.c;
                        int i12 = l0Var.a;
                        Iterator<TL_wallet.walletTransaction> it = wallettransactions.transactions.iterator();
                        if (it.hasNext()) {
                            TL_wallet.walletTransaction next = it.next();
                            MessagesController.getInstance(i12).putUsers(wallettransactions.users, false);
                            MessagesController.getInstance(i12).putChats(wallettransactions.chats, false);
                            l0Var.c(wallettransaction, next);
                            l0Var.E();
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
                k71 k71Var = (k71) obj2;
                org.telegram.ui.Wallet.m5 m5Var = ((org.telegram.ui.Wallet.h4) obj3).b;
                if (i11 == 0) {
                    k71Var.V();
                    org.telegram.ui.Wallet.k0 k0Var = m5Var.D0;
                    boolean z10 = (k0Var == null || k0Var.c.isEmpty()) ? false : true;
                    if (z10) {
                        for (int i13 = 0; i13 < m5Var.D0.c.size(); i13++) {
                            TL_wallet.walletTransaction wallettransaction2 = (TL_wallet.walletTransaction) m5Var.D0.c.get(i13);
                            org.telegram.ui.Wallet.e3 e3Var = m5Var.D0.a;
                            int i14 = org.telegram.ui.Wallet.d3.a;
                            u61 K = u61.K(org.telegram.ui.Wallet.d3.class);
                            org.telegram.ui.Wallet.c3 c3Var = new org.telegram.ui.Wallet.c3(wallettransaction2);
                            c3Var.set(wallettransaction2);
                            c3Var.id = wallettransaction2.id;
                            c3Var.random_id = wallettransaction2.random_id;
                            c3Var.gasless = wallettransaction2.gasless;
                            c3Var.gaslessMessageBodyHash = wallettransaction2.gaslessMessageBodyHash;
                            c3Var.normalMessageBodyHash = wallettransaction2.normalMessageBodyHash;
                            c3Var.nft = wallettransaction2.nft;
                            K.G = c3Var;
                            K.H = e3Var;
                            TL_wallet.WalletTransactionPeer walletTransactionPeer = wallettransaction2.peer;
                            K.l = walletTransactionPeer == null ? null : e3Var.a(walletTransactionPeer.address);
                            arrayList.add(K);
                        }
                    }
                    org.telegram.ui.Wallet.k0 k0Var2 = m5Var.D0;
                    if (k0Var2 != null && !k0Var2.h) {
                        arrayList.add(u61.q(-1, 37));
                        arrayList.add(u61.q(-2, 37));
                        arrayList.add(u61.q(-3, 37));
                    }
                    k71Var.U();
                    if (z10) {
                        long j10 = m5Var.getMessagesController().config.walletTransferMinNanos.get();
                        if (j10 > 0) {
                            arrayList.add(u61.C(LocaleController.formatSpannable(R.string.WalletHiddenTransactions, org.telegram.ui.Wallet.l0.s(j10, false))));
                            break;
                        }
                    }
                } else {
                    org.telegram.ui.Wallet.d0 d0Var = m5Var.E0;
                    if (d0Var != null) {
                        ArrayList arrayList2 = d0Var.a;
                        int size = arrayList2.size();
                        int i15 = 0;
                        while (i15 < size) {
                            Object obj4 = arrayList2.get(i15);
                            i15++;
                            TL_wallet.nftItem nftitem = (TL_wallet.nftItem) obj4;
                            if (m5Var.k0.isEmpty() || ((str = nftitem.name) != null && str.toLowerCase(Locale.ROOT).contains(m5Var.k0))) {
                                if (nftitem.gift != null) {
                                    org.telegram.ui.Wallet.t7 t7Var = m5Var.j0;
                                    int i16 = org.telegram.ui.Wallet.f7.a;
                                    u61 K2 = u61.K(org.telegram.ui.Wallet.f7.class);
                                    K2.u = 1;
                                    K2.G = nftitem;
                                    K2.H = t7Var;
                                    arrayList.add(K2);
                                } else {
                                    int i17 = org.telegram.ui.Wallet.b.a;
                                    u61 K3 = u61.K(org.telegram.ui.Wallet.b.class);
                                    K3.G = nftitem;
                                    K3.u = 1;
                                    arrayList.add(K3);
                                }
                            }
                        }
                        if (arrayList.isEmpty() && !m5Var.k0.isEmpty()) {
                            org.telegram.ui.Wallet.d0 d0Var2 = m5Var.E0;
                            if (!d0Var2.i && d0Var2.g) {
                                arrayList.add(u61.r(LocaleController.getString(R.string.NoResult)));
                            }
                        }
                        org.telegram.ui.Wallet.d0 d0Var3 = m5Var.E0;
                        if (d0Var3.i) {
                            for (int i18 = 0; i18 < 3; i18++) {
                                u61 q5 = u61.q((-1) - i18, 35);
                                q5.u = 1;
                                arrayList.add(q5);
                            }
                            break;
                        } else if (d0Var3.k != null) {
                            arrayList.add(u61.e(-10001, LocaleController.getString(R.string.Retry)));
                            break;
                        }
                    }
                }
                break;
        }
    }
}
