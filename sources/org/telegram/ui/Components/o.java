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

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
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
                    qVar.h0[i11] = aicomposetoneexample;
                    qVar.f0.N(true);
                    break;
                } else {
                    qVar.getClass();
                    break;
                }
            case 1:
                org.telegram.ui.Wallet.o0 o0Var = (org.telegram.ui.Wallet.o0) obj3;
                TL_wallet.walletTransactions wallettransactions = (TL_wallet.walletTransactions) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (o0Var.d && o0Var.e == i11) {
                    o0Var.g = -1;
                    AndroidUtilities.cancelRunOnUIThread(o0Var.h);
                    StringBuilder sb2 = new StringBuilder("[gram-wallet-polling] account=");
                    sb2.append(o0Var.a);
                    sb2.append(" msg_hash=");
                    sb2.append(o0Var.b);
                    sb2.append(" transactions=");
                    sb2.append(wallettransactions == null ? "none" : Integer.valueOf(wallettransactions.transactions.size()));
                    sb2.append(" errorCode=");
                    sb2.append(tL_error != null ? Integer.valueOf(tL_error.code) : "none");
                    FileLog.d(sb2.toString());
                    if (tL_error == null && wallettransactions != null) {
                        org.telegram.ui.gn0 gn0Var = o0Var.c;
                        org.telegram.ui.Wallet.m0 m0Var = (org.telegram.ui.Wallet.m0) gn0Var.b;
                        TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) gn0Var.c;
                        int i12 = m0Var.a;
                        Iterator<TL_wallet.walletTransaction> it = wallettransactions.transactions.iterator();
                        if (it.hasNext()) {
                            TL_wallet.walletTransaction next = it.next();
                            MessagesController.getInstance(i12).putUsers(wallettransactions.users, false);
                            MessagesController.getInstance(i12).putChats(wallettransactions.chats, false);
                            m0Var.b(wallettransaction, next);
                            m0Var.C();
                            o0Var.b();
                            break;
                        }
                    }
                    if (o0Var.d && o0Var.e == i11) {
                        o0Var.a();
                        break;
                    }
                }
                break;
            default:
                ArrayList arrayList = (ArrayList) obj;
                s61 s61Var = (s61) obj2;
                org.telegram.ui.Wallet.m5 m5Var = ((org.telegram.ui.Wallet.i4) obj3).b;
                if (i11 == 0) {
                    s61Var.U();
                    org.telegram.ui.Wallet.l0 l0Var = m5Var.E0;
                    boolean z10 = (l0Var == null || l0Var.c.isEmpty()) ? false : true;
                    if (z10) {
                        for (int i13 = 0; i13 < m5Var.E0.c.size(); i13++) {
                            TL_wallet.walletTransaction wallettransaction2 = (TL_wallet.walletTransaction) m5Var.E0.c.get(i13);
                            org.telegram.ui.Wallet.d3 d3Var = m5Var.E0.a;
                            int i14 = org.telegram.ui.Wallet.c3.a;
                            f61 J = f61.J(org.telegram.ui.Wallet.c3.class);
                            org.telegram.ui.Wallet.b3 b3Var = new org.telegram.ui.Wallet.b3(wallettransaction2);
                            b3Var.set(wallettransaction2);
                            b3Var.id = wallettransaction2.id;
                            b3Var.random_id = wallettransaction2.random_id;
                            b3Var.gasless = wallettransaction2.gasless;
                            b3Var.gaslessMessageBodyHash = wallettransaction2.gaslessMessageBodyHash;
                            b3Var.normalMessageBodyHash = wallettransaction2.normalMessageBodyHash;
                            b3Var.nft = wallettransaction2.nft;
                            J.G = b3Var;
                            J.H = d3Var;
                            TL_wallet.WalletTransactionPeer walletTransactionPeer = wallettransaction2.peer;
                            J.l = walletTransactionPeer == null ? null : d3Var.a(walletTransactionPeer.address);
                            arrayList.add(J);
                        }
                    }
                    org.telegram.ui.Wallet.l0 l0Var2 = m5Var.E0;
                    if (l0Var2 != null && !l0Var2.h) {
                        arrayList.add(f61.o(-1, 37));
                        arrayList.add(f61.o(-2, 37));
                        arrayList.add(f61.o(-3, 37));
                    }
                    s61Var.T();
                    if (z10) {
                        long j10 = m5Var.getMessagesController().config.walletTransferMinNanos.get();
                        if (j10 > 0) {
                            arrayList.add(f61.B(LocaleController.formatSpannable(R.string.WalletHiddenTransactions, org.telegram.ui.Wallet.m0.r(j10, false))));
                            break;
                        }
                    }
                } else {
                    org.telegram.ui.Wallet.e0 e0Var = m5Var.F0;
                    if (e0Var != null) {
                        ArrayList arrayList2 = e0Var.a;
                        int size = arrayList2.size();
                        int i15 = 0;
                        while (i15 < size) {
                            Object obj4 = arrayList2.get(i15);
                            i15++;
                            TL_wallet.nftItem nftitem = (TL_wallet.nftItem) obj4;
                            if (m5Var.l0.isEmpty() || ((str = nftitem.name) != null && str.toLowerCase(Locale.ROOT).contains(m5Var.l0))) {
                                if (nftitem.gift != null) {
                                    org.telegram.ui.Wallet.z7 z7Var = m5Var.k0;
                                    int i16 = org.telegram.ui.Wallet.l7.a;
                                    f61 J2 = f61.J(org.telegram.ui.Wallet.l7.class);
                                    J2.u = 1;
                                    J2.G = nftitem;
                                    J2.H = z7Var;
                                    arrayList.add(J2);
                                } else {
                                    int i17 = org.telegram.ui.Wallet.b.a;
                                    f61 J3 = f61.J(org.telegram.ui.Wallet.b.class);
                                    J3.G = nftitem;
                                    J3.u = 1;
                                    arrayList.add(J3);
                                }
                            }
                        }
                        if (arrayList.isEmpty() && !m5Var.l0.isEmpty()) {
                            org.telegram.ui.Wallet.e0 e0Var2 = m5Var.F0;
                            if (!e0Var2.i && e0Var2.g) {
                                arrayList.add(f61.q(LocaleController.getString(R.string.NoResult)));
                            }
                        }
                        org.telegram.ui.Wallet.e0 e0Var3 = m5Var.F0;
                        if (e0Var3.i) {
                            for (int i18 = 0; i18 < 3; i18++) {
                                f61 o10 = f61.o((-1) - i18, 35);
                                o10.u = 1;
                                arrayList.add(o10);
                            }
                            break;
                        } else if (e0Var3.k != null) {
                            arrayList.add(f61.e(-10001, LocaleController.getString(R.string.Retry)));
                            break;
                        }
                    }
                }
                break;
        }
    }
}
