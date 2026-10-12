package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_aicompose;
import org.telegram.tgnet.tl.TL_wallet;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
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
        int i10 = this.a;
        int i11 = 0;
        int i12 = this.b;
        Object obj3 = this.c;
        switch (i10) {
            case 0:
                q qVar = (q) obj3;
                TL_aicompose.aiComposeToneExample aicomposetoneexample = (TL_aicompose.aiComposeToneExample) obj;
                if (aicomposetoneexample != null) {
                    qVar.h0[i12] = aicomposetoneexample;
                    qVar.f0.N(true);
                    break;
                } else {
                    qVar.getClass();
                    break;
                }
            case 1:
                org.telegram.ui.Wallet.l0 l0Var = (org.telegram.ui.Wallet.l0) obj3;
                TL_wallet.walletTransactions wallettransactions = (TL_wallet.walletTransactions) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (l0Var.d && l0Var.e == i12) {
                    l0Var.g = -1;
                    AndroidUtilities.cancelRunOnUIThread(l0Var.h);
                    StringBuilder sb2 = new StringBuilder("[gram-wallet-polling] account=");
                    sb2.append(l0Var.a);
                    sb2.append(" msg_hash=");
                    sb2.append(l0Var.b);
                    sb2.append(" transactions=");
                    sb2.append(wallettransactions == null ? "none" : Integer.valueOf(wallettransactions.transactions.size()));
                    sb2.append(" errorCode=");
                    sb2.append(tL_error != null ? Integer.valueOf(tL_error.code) : "none");
                    FileLog.d(sb2.toString());
                    if (tL_error == null && wallettransactions != null) {
                        org.telegram.ui.cs0 cs0Var = l0Var.c;
                        org.telegram.ui.Wallet.j0 j0Var = (org.telegram.ui.Wallet.j0) cs0Var.b;
                        TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) cs0Var.c;
                        int i13 = j0Var.a;
                        Iterator<TL_wallet.walletTransaction> it = wallettransactions.transactions.iterator();
                        if (it.hasNext()) {
                            TL_wallet.walletTransaction next = it.next();
                            MessagesController.getInstance(i13).putUsers(wallettransactions.users, false);
                            MessagesController.getInstance(i13).putChats(wallettransactions.chats, false);
                            j0Var.c(wallettransaction, next);
                            j0Var.B();
                            l0Var.b();
                            break;
                        }
                    }
                    if (l0Var.d && l0Var.e == i12) {
                        l0Var.a();
                        break;
                    }
                }
                break;
            default:
                ArrayList arrayList = (ArrayList) obj;
                z61 z61Var = (z61) obj2;
                org.telegram.ui.Wallet.z4 z4Var = ((org.telegram.ui.Wallet.w3) obj3).a;
                if (i12 == 0) {
                    z61Var.U();
                    org.telegram.ui.Wallet.i0 i0Var = z4Var.z0;
                    boolean z10 = (i0Var == null || i0Var.c.isEmpty()) ? false : true;
                    if (z10) {
                        for (int i14 = 0; i14 < z4Var.z0.c.size(); i14++) {
                            TL_wallet.walletTransaction wallettransaction2 = (TL_wallet.walletTransaction) z4Var.z0.c.get(i14);
                            org.telegram.ui.Wallet.w2 w2Var = z4Var.z0.a;
                            int i15 = org.telegram.ui.Wallet.v2.a;
                            l61 J = l61.J(org.telegram.ui.Wallet.v2.class);
                            org.telegram.ui.Wallet.u2 u2Var = new org.telegram.ui.Wallet.u2(wallettransaction2);
                            u2Var.set(wallettransaction2);
                            u2Var.id = wallettransaction2.id;
                            u2Var.random_id = wallettransaction2.random_id;
                            u2Var.gasless = wallettransaction2.gasless;
                            u2Var.gaslessMessageBodyHash = wallettransaction2.gaslessMessageBodyHash;
                            u2Var.normalMessageBodyHash = wallettransaction2.normalMessageBodyHash;
                            u2Var.nft = wallettransaction2.nft;
                            J.G = u2Var;
                            J.H = w2Var;
                            TL_wallet.WalletTransactionPeer walletTransactionPeer = wallettransaction2.peer;
                            J.l = walletTransactionPeer == null ? null : w2Var.a(walletTransactionPeer.address);
                            arrayList.add(J);
                        }
                    }
                    org.telegram.ui.Wallet.i0 i0Var2 = z4Var.z0;
                    if (i0Var2 != null && !i0Var2.g) {
                        arrayList.add(l61.o(-1, 37));
                        arrayList.add(l61.o(-2, 37));
                        arrayList.add(l61.o(-3, 37));
                    }
                    z61Var.T();
                    if (z10) {
                        long j10 = z4Var.getMessagesController().config.walletTransferMinNanos.get();
                        if (j10 > 0) {
                            arrayList.add(l61.B(LocaleController.formatSpannable(R.string.WalletHiddenTransactions, org.telegram.ui.Wallet.j0.q(j10, false))));
                            break;
                        }
                    }
                } else if (z4Var.A0 != null) {
                    z61Var.U();
                    ArrayList arrayList2 = z4Var.A0.a;
                    int size = arrayList2.size();
                    while (i11 < size) {
                        Object obj4 = arrayList2.get(i11);
                        i11++;
                        int i16 = org.telegram.ui.Wallet.b.a;
                        l61 J2 = l61.J(org.telegram.ui.Wallet.b.class);
                        J2.G = (TL_wallet.nftItem) obj4;
                        arrayList.add(J2);
                    }
                    org.telegram.ui.Wallet.b0 b0Var = z4Var.A0;
                    if (b0Var.i) {
                        arrayList.add(l61.o(-1, 38));
                    } else if (b0Var.k != null) {
                        arrayList.add(l61.e(-10001, LocaleController.getString(R.string.Retry)));
                    }
                    z61Var.T();
                    break;
                }
                break;
        }
    }
}
