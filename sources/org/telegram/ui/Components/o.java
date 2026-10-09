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

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
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
                org.telegram.ui.Wallet.m0 m0Var = (org.telegram.ui.Wallet.m0) obj3;
                TL_wallet.walletTransactions wallettransactions = (TL_wallet.walletTransactions) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (m0Var.d && m0Var.e == i12) {
                    m0Var.g = -1;
                    AndroidUtilities.cancelRunOnUIThread(m0Var.h);
                    StringBuilder sb2 = new StringBuilder("[gram-wallet-polling] account=");
                    sb2.append(m0Var.a);
                    sb2.append(" msg_hash=");
                    sb2.append(m0Var.b);
                    sb2.append(" transactions=");
                    sb2.append(wallettransactions == null ? "none" : Integer.valueOf(wallettransactions.transactions.size()));
                    sb2.append(" errorCode=");
                    sb2.append(tL_error != null ? Integer.valueOf(tL_error.code) : "none");
                    FileLog.d(sb2.toString());
                    if (tL_error == null && wallettransactions != null) {
                        org.telegram.ui.ls0 ls0Var = m0Var.c;
                        org.telegram.ui.Wallet.k0 k0Var = (org.telegram.ui.Wallet.k0) ls0Var.b;
                        TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) ls0Var.c;
                        int i13 = k0Var.a;
                        Iterator<TL_wallet.walletTransaction> it = wallettransactions.transactions.iterator();
                        if (it.hasNext()) {
                            TL_wallet.walletTransaction next = it.next();
                            MessagesController.getInstance(i13).putUsers(wallettransactions.users, false);
                            MessagesController.getInstance(i13).putChats(wallettransactions.chats, false);
                            k0Var.c(wallettransaction, next);
                            k0Var.B();
                            m0Var.b();
                            break;
                        }
                    }
                    if (m0Var.d && m0Var.e == i12) {
                        m0Var.a();
                        break;
                    }
                }
                break;
            default:
                ArrayList arrayList = (ArrayList) obj;
                c71 c71Var = (c71) obj2;
                org.telegram.ui.Wallet.a5 a5Var = ((org.telegram.ui.Wallet.w3) obj3).a;
                if (i12 == 0) {
                    c71Var.U();
                    org.telegram.ui.Wallet.j0 j0Var = a5Var.z0;
                    boolean z10 = (j0Var == null || j0Var.c.isEmpty()) ? false : true;
                    if (z10) {
                        for (int i14 = 0; i14 < a5Var.z0.c.size(); i14++) {
                            TL_wallet.walletTransaction wallettransaction2 = (TL_wallet.walletTransaction) a5Var.z0.c.get(i14);
                            org.telegram.ui.Wallet.w2 w2Var = a5Var.z0.a;
                            int i15 = org.telegram.ui.Wallet.v2.a;
                            p61 J = p61.J(org.telegram.ui.Wallet.v2.class);
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
                    org.telegram.ui.Wallet.j0 j0Var2 = a5Var.z0;
                    if (j0Var2 != null && !j0Var2.g) {
                        arrayList.add(p61.o(-1, 37));
                        arrayList.add(p61.o(-2, 37));
                        arrayList.add(p61.o(-3, 37));
                    }
                    c71Var.T();
                    if (z10) {
                        long j3 = a5Var.getMessagesController().config.walletTransferMinNanos.get();
                        if (j3 > 0) {
                            arrayList.add(p61.B(LocaleController.formatSpannable(R.string.WalletHiddenTransactions, org.telegram.ui.Wallet.k0.q(j3, false))));
                            break;
                        }
                    }
                } else if (a5Var.A0 != null) {
                    c71Var.U();
                    ArrayList arrayList2 = a5Var.A0.a;
                    int size = arrayList2.size();
                    while (i11 < size) {
                        Object obj4 = arrayList2.get(i11);
                        i11++;
                        int i16 = org.telegram.ui.Wallet.b.a;
                        p61 J2 = p61.J(org.telegram.ui.Wallet.b.class);
                        J2.G = (TL_wallet.nftItem) obj4;
                        arrayList.add(J2);
                    }
                    org.telegram.ui.Wallet.c0 c0Var = a5Var.A0;
                    if (c0Var.i) {
                        arrayList.add(p61.o(-1, 38));
                    } else if (c0Var.k != null) {
                        arrayList.add(p61.e(-10001, LocaleController.getString(R.string.Retry)));
                    }
                    c71Var.T();
                    break;
                }
                break;
        }
    }
}
