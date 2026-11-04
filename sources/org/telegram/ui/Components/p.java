package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_aicompose;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.na1;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class p implements org.telegram.messenger.n10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ p(Object obj, int i3, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = i3;
    }

    @Override // org.telegram.messenger.n10
    public final void a(Object obj, Object obj2) {
        String str;
        int i3 = this.a;
        int i10 = this.b;
        Object obj3 = this.c;
        switch (i3) {
            case 0:
                r rVar = (r) obj3;
                TL_aicompose.aiComposeToneExample aicomposetoneexample = (TL_aicompose.aiComposeToneExample) obj;
                if (aicomposetoneexample != null) {
                    rVar.b2[i10] = aicomposetoneexample;
                    rVar.Z1.O(true);
                    break;
                } else {
                    rVar.getClass();
                    break;
                }
            case 1:
                org.telegram.ui.Wallet.m0 m0Var = (org.telegram.ui.Wallet.m0) obj3;
                TL_wallet.walletTransactions wallettransactions = (TL_wallet.walletTransactions) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (m0Var.d && m0Var.e == i10) {
                    m0Var.g = -1;
                    org.telegram.messenger.g0.r(m0Var.h);
                    StringBuilder sb2 = new StringBuilder("[gram-wallet-polling] account=");
                    sb2.append(m0Var.a);
                    sb2.append(" msg_hash=");
                    sb2.append(m0Var.b);
                    sb2.append(" transactions=");
                    sb2.append(wallettransactions == null ? "none" : Integer.valueOf(wallettransactions.transactions.size()));
                    sb2.append(" errorCode=");
                    sb2.append(tL_error != null ? Integer.valueOf(tL_error.code) : "none");
                    org.telegram.messenger.a8.b(sb2.toString());
                    if (tL_error == null && wallettransactions != null) {
                        na1 na1Var = m0Var.c;
                        org.telegram.ui.Wallet.k0 k0Var = (org.telegram.ui.Wallet.k0) na1Var.b;
                        TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) na1Var.c;
                        int i11 = k0Var.a;
                        Iterator<TL_wallet.walletTransaction> it = wallettransactions.transactions.iterator();
                        if (it.hasNext()) {
                            TL_wallet.walletTransaction next = it.next();
                            org.telegram.messenger.hp.s1(i11).Y3(wallettransactions.users, false);
                            org.telegram.messenger.hp.s1(i11).S3(wallettransactions.chats, false);
                            k0Var.c(wallettransaction, next);
                            k0Var.E();
                            m0Var.b();
                            break;
                        }
                    }
                    if (m0Var.d && m0Var.e == i10) {
                        m0Var.a();
                        break;
                    }
                }
                break;
            default:
                ArrayList arrayList = (ArrayList) obj;
                f41 f41Var = (f41) obj2;
                org.telegram.ui.Wallet.w5 w5Var = (org.telegram.ui.Wallet.w5) ((ci.o4) obj3).c;
                if (i10 == 0) {
                    f41Var.V();
                    org.telegram.ui.Wallet.j0 j0Var = w5Var.E0;
                    boolean z10 = (j0Var == null || j0Var.c.isEmpty()) ? false : true;
                    if (z10) {
                        for (int i12 = 0; i12 < w5Var.E0.c.size(); i12++) {
                            TL_wallet.walletTransaction wallettransaction2 = (TL_wallet.walletTransaction) w5Var.E0.c.get(i12);
                            org.telegram.ui.Wallet.t3 t3Var = w5Var.E0.a;
                            int i13 = org.telegram.ui.Wallet.s3.b;
                            r31 K = r31.K(org.telegram.ui.Wallet.s3.class);
                            org.telegram.ui.Wallet.r3 r3Var = new org.telegram.ui.Wallet.r3(wallettransaction2);
                            r3Var.set(wallettransaction2);
                            r3Var.id = wallettransaction2.id;
                            r3Var.random_id = wallettransaction2.random_id;
                            r3Var.gasless = wallettransaction2.gasless;
                            r3Var.gaslessMessageBodyHash = wallettransaction2.gaslessMessageBodyHash;
                            r3Var.normalMessageBodyHash = wallettransaction2.normalMessageBodyHash;
                            r3Var.nft = wallettransaction2.nft;
                            K.G = r3Var;
                            K.H = t3Var;
                            TL_wallet.WalletTransactionPeer walletTransactionPeer = wallettransaction2.peer;
                            K.l = walletTransactionPeer == null ? null : t3Var.a(walletTransactionPeer.address);
                            arrayList.add(K);
                        }
                    }
                    org.telegram.ui.Wallet.j0 j0Var2 = w5Var.E0;
                    if (j0Var2 != null && !j0Var2.h) {
                        arrayList.add(r31.q(-1, 37));
                        arrayList.add(r31.q(-2, 37));
                        arrayList.add(r31.q(-3, 37));
                    }
                    f41Var.U();
                    if (z10) {
                        long j10 = ((org.telegram.messenger.l0) w5Var.getMessagesController().x7.l0.b).c;
                        if (j10 > 0) {
                            arrayList.add(r31.C(org.telegram.messenger.bd.V(null, null, 2131743108, org.telegram.ui.Wallet.k0.s(j10, false))));
                            break;
                        }
                    }
                } else {
                    org.telegram.ui.Wallet.c0 c0Var = w5Var.F0;
                    if (c0Var != null) {
                        ArrayList arrayList2 = c0Var.a;
                        int size = arrayList2.size();
                        int i14 = 0;
                        while (i14 < size) {
                            Object obj4 = arrayList2.get(i14);
                            i14++;
                            TL_wallet.nftItem nftitem = (TL_wallet.nftItem) obj4;
                            if (w5Var.l0.isEmpty() || ((str = nftitem.name) != null && str.toLowerCase(Locale.ROOT).contains(w5Var.l0))) {
                                if (nftitem.gift != null) {
                                    org.telegram.ui.Wallet.b8 b8Var = w5Var.k0;
                                    int i15 = org.telegram.ui.Wallet.n7.b;
                                    r31 K2 = r31.K(org.telegram.ui.Wallet.n7.class);
                                    K2.u = 1;
                                    K2.G = nftitem;
                                    K2.H = b8Var;
                                    arrayList.add(K2);
                                } else {
                                    int i16 = org.telegram.ui.Wallet.b.b;
                                    r31 K3 = r31.K(org.telegram.ui.Wallet.b.class);
                                    K3.G = nftitem;
                                    K3.u = 1;
                                    arrayList.add(K3);
                                }
                            }
                        }
                        if (arrayList.isEmpty() && !w5Var.l0.isEmpty()) {
                            org.telegram.ui.Wallet.c0 c0Var2 = w5Var.F0;
                            if (!c0Var2.i && c0Var2.g) {
                                arrayList.add(r31.r(org.telegram.messenger.bd.M0(2131748175, null)));
                            }
                        }
                        org.telegram.ui.Wallet.c0 c0Var3 = w5Var.F0;
                        if (c0Var3.i) {
                            for (int i17 = 0; i17 < 3; i17++) {
                                r31 q10 = r31.q((-1) - i17, 35);
                                q10.u = 1;
                                arrayList.add(q10);
                            }
                            break;
                        } else if (c0Var3.k != null) {
                            arrayList.add(r31.e(-10001, org.telegram.messenger.bd.M0(2131746062, null)));
                            break;
                        }
                    }
                }
                break;
        }
    }
}
