package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_aicompose;
import org.telegram.tgnet.tl.TL_wallet;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class p implements org.telegram.messenger.j20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ p(Object obj, int i10, int i11) {
        this.a = i11;
        this.c = obj;
        this.b = i10;
    }

    @Override // org.telegram.messenger.j20
    public final void a(Object obj, Object obj2) {
        String str;
        int i10 = this.a;
        int i11 = this.b;
        Object obj3 = this.c;
        switch (i10) {
            case 0:
                r rVar = (r) obj3;
                TL_aicompose.aiComposeToneExample aicomposetoneexample = (TL_aicompose.aiComposeToneExample) obj;
                if (aicomposetoneexample != null) {
                    rVar.a2[i11] = aicomposetoneexample;
                    rVar.Y1.O(true);
                    break;
                } else {
                    rVar.getClass();
                    break;
                }
            case 1:
                org.telegram.ui.Wallet.m0 m0Var = (org.telegram.ui.Wallet.m0) obj3;
                TL_wallet.walletTransactions wallettransactions = (TL_wallet.walletTransactions) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (m0Var.d && m0Var.e == i11) {
                    m0Var.g = -1;
                    org.telegram.messenger.i0.r(m0Var.h);
                    StringBuilder sb2 = new StringBuilder("[gram-wallet-polling] account=");
                    sb2.append(m0Var.a);
                    sb2.append(" msg_hash=");
                    sb2.append(m0Var.b);
                    sb2.append(" transactions=");
                    sb2.append(wallettransactions == null ? "none" : Integer.valueOf(wallettransactions.transactions.size()));
                    sb2.append(" errorCode=");
                    sb2.append(tL_error != null ? Integer.valueOf(tL_error.code) : "none");
                    org.telegram.messenger.f8.b(sb2.toString());
                    if (tL_error == null && wallettransactions != null) {
                        org.telegram.ui.ep0 ep0Var = m0Var.c;
                        org.telegram.ui.Wallet.k0 k0Var = (org.telegram.ui.Wallet.k0) ep0Var.b;
                        TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) ep0Var.c;
                        int i12 = k0Var.a;
                        Iterator<TL_wallet.walletTransaction> it = wallettransactions.transactions.iterator();
                        if (it.hasNext()) {
                            TL_wallet.walletTransaction next = it.next();
                            org.telegram.messenger.vp.r1(i12).V3(wallettransactions.users, false);
                            org.telegram.messenger.vp.r1(i12).P3(wallettransactions.chats, false);
                            k0Var.c(wallettransaction, next);
                            k0Var.E();
                            m0Var.b();
                            break;
                        }
                    }
                    if (m0Var.d && m0Var.e == i11) {
                        m0Var.a();
                        break;
                    }
                }
                break;
            default:
                ArrayList arrayList = (ArrayList) obj;
                p51 p51Var = (p51) obj2;
                org.telegram.ui.Wallet.b6 b6Var = (org.telegram.ui.Wallet.b6) ((mg.s) obj3).c;
                if (i11 == 0) {
                    p51Var.V();
                    org.telegram.ui.Wallet.j0 j0Var = b6Var.D0;
                    boolean z10 = (j0Var == null || j0Var.c.isEmpty()) ? false : true;
                    if (z10) {
                        for (int i13 = 0; i13 < b6Var.D0.c.size(); i13++) {
                            TL_wallet.walletTransaction wallettransaction2 = (TL_wallet.walletTransaction) b6Var.D0.c.get(i13);
                            org.telegram.ui.Wallet.v3 v3Var = b6Var.D0.a;
                            int i14 = org.telegram.ui.Wallet.u3.b;
                            a51 K = a51.K(org.telegram.ui.Wallet.u3.class);
                            org.telegram.ui.Wallet.t3 t3Var = new org.telegram.ui.Wallet.t3(wallettransaction2);
                            t3Var.set(wallettransaction2);
                            t3Var.id = wallettransaction2.id;
                            t3Var.random_id = wallettransaction2.random_id;
                            t3Var.gasless = wallettransaction2.gasless;
                            t3Var.gaslessMessageBodyHash = wallettransaction2.gaslessMessageBodyHash;
                            t3Var.normalMessageBodyHash = wallettransaction2.normalMessageBodyHash;
                            t3Var.nft = wallettransaction2.nft;
                            K.G = t3Var;
                            K.H = v3Var;
                            TL_wallet.WalletTransactionPeer walletTransactionPeer = wallettransaction2.peer;
                            K.l = walletTransactionPeer == null ? null : v3Var.a(walletTransactionPeer.address);
                            arrayList.add(K);
                        }
                    }
                    org.telegram.ui.Wallet.j0 j0Var2 = b6Var.D0;
                    if (j0Var2 != null && !j0Var2.h) {
                        arrayList.add(a51.q(-1, 37));
                        arrayList.add(a51.q(-2, 37));
                        arrayList.add(a51.q(-3, 37));
                    }
                    p51Var.U();
                    if (z10) {
                        long j10 = b6Var.getMessagesController().y7.l0.a.c;
                        if (j10 > 0) {
                            arrayList.add(a51.C(org.telegram.messenger.cd.V(null, null, 2131743124, org.telegram.ui.Wallet.k0.s(j10, false))));
                            break;
                        }
                    }
                } else {
                    org.telegram.ui.Wallet.c0 c0Var = b6Var.E0;
                    if (c0Var != null) {
                        ArrayList arrayList2 = c0Var.a;
                        int size = arrayList2.size();
                        int i15 = 0;
                        while (i15 < size) {
                            Object obj4 = arrayList2.get(i15);
                            i15++;
                            TL_wallet.nftItem nftitem = (TL_wallet.nftItem) obj4;
                            if (b6Var.k0.isEmpty() || ((str = nftitem.name) != null && str.toLowerCase(Locale.ROOT).contains(b6Var.k0))) {
                                if (nftitem.gift != null) {
                                    org.telegram.ui.Wallet.h8 h8Var = b6Var.j0;
                                    int i16 = org.telegram.ui.Wallet.t7.b;
                                    a51 K2 = a51.K(org.telegram.ui.Wallet.t7.class);
                                    K2.u = 1;
                                    K2.G = nftitem;
                                    K2.H = h8Var;
                                    arrayList.add(K2);
                                } else {
                                    int i17 = org.telegram.ui.Wallet.b.b;
                                    a51 K3 = a51.K(org.telegram.ui.Wallet.b.class);
                                    K3.G = nftitem;
                                    K3.u = 1;
                                    arrayList.add(K3);
                                }
                            }
                        }
                        if (arrayList.isEmpty() && !b6Var.k0.isEmpty()) {
                            org.telegram.ui.Wallet.c0 c0Var2 = b6Var.E0;
                            if (!c0Var2.i && c0Var2.g) {
                                arrayList.add(a51.r(org.telegram.messenger.cd.L0(2131748183, null)));
                            }
                        }
                        org.telegram.ui.Wallet.c0 c0Var3 = b6Var.E0;
                        if (c0Var3.i) {
                            for (int i18 = 0; i18 < 3; i18++) {
                                a51 q6 = a51.q((-1) - i18, 35);
                                q6.u = 1;
                                arrayList.add(q6);
                            }
                            break;
                        } else if (c0Var3.k != null) {
                            arrayList.add(a51.e(-10001, org.telegram.messenger.cd.L0(2131746069, null)));
                            break;
                        }
                    }
                }
                break;
        }
    }
}
