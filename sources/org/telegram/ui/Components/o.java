package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_aicompose;
import org.telegram.tgnet.tl.TL_wallet;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class o implements org.telegram.messenger.s10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ o(Object obj, int i7, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = i7;
    }

    @Override // org.telegram.messenger.s10
    public final void a(Object obj, Object obj2) {
        String str;
        int i7 = this.a;
        int i10 = this.b;
        Object obj3 = this.c;
        switch (i7) {
            case 0:
                q qVar = (q) obj3;
                TL_aicompose.aiComposeToneExample aicomposetoneexample = (TL_aicompose.aiComposeToneExample) obj;
                if (aicomposetoneexample != null) {
                    qVar.e2[i10] = aicomposetoneexample;
                    qVar.c2.O(true);
                    break;
                } else {
                    qVar.getClass();
                    break;
                }
            case 1:
                org.telegram.ui.Wallet.n0 n0Var = (org.telegram.ui.Wallet.n0) obj3;
                TL_wallet.walletTransactions wallettransactions = (TL_wallet.walletTransactions) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (n0Var.d && n0Var.e == i10) {
                    n0Var.g = -1;
                    org.telegram.messenger.g0.r(n0Var.h);
                    StringBuilder sb2 = new StringBuilder("[gram-wallet-polling] account=");
                    sb2.append(n0Var.a);
                    sb2.append(" msg_hash=");
                    sb2.append(n0Var.b);
                    sb2.append(" transactions=");
                    sb2.append(wallettransactions == null ? "none" : Integer.valueOf(wallettransactions.transactions.size()));
                    sb2.append(" errorCode=");
                    sb2.append(tL_error != null ? Integer.valueOf(tL_error.code) : "none");
                    org.telegram.messenger.a8.b(sb2.toString());
                    if (tL_error == null && wallettransactions != null) {
                        org.telegram.ui.xi0 xi0Var = n0Var.c;
                        org.telegram.ui.Wallet.l0 l0Var = (org.telegram.ui.Wallet.l0) xi0Var.b;
                        TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) xi0Var.c;
                        int i11 = l0Var.a;
                        Iterator<TL_wallet.walletTransaction> it = wallettransactions.transactions.iterator();
                        if (it.hasNext()) {
                            TL_wallet.walletTransaction next = it.next();
                            org.telegram.messenger.np.s1(i11).Y3(wallettransactions.users, false);
                            org.telegram.messenger.np.s1(i11).S3(wallettransactions.chats, false);
                            l0Var.c(wallettransaction, next);
                            l0Var.E();
                            n0Var.b();
                            break;
                        }
                    }
                    if (n0Var.d && n0Var.e == i10) {
                        n0Var.a();
                        break;
                    }
                }
                break;
            default:
                ArrayList arrayList = (ArrayList) obj;
                p41 p41Var = (p41) obj2;
                org.telegram.ui.Wallet.y5 y5Var = (org.telegram.ui.Wallet.y5) ((di.f4) obj3).c;
                if (i10 == 0) {
                    p41Var.V();
                    org.telegram.ui.Wallet.k0 k0Var = y5Var.E0;
                    boolean z10 = (k0Var == null || k0Var.c.isEmpty()) ? false : true;
                    if (z10) {
                        for (int i12 = 0; i12 < y5Var.E0.c.size(); i12++) {
                            TL_wallet.walletTransaction wallettransaction2 = (TL_wallet.walletTransaction) y5Var.E0.c.get(i12);
                            org.telegram.ui.Wallet.u3 u3Var = y5Var.E0.a;
                            int i13 = org.telegram.ui.Wallet.t3.b;
                            b41 K = b41.K(org.telegram.ui.Wallet.t3.class);
                            org.telegram.ui.Wallet.s3 s3Var = new org.telegram.ui.Wallet.s3(wallettransaction2);
                            s3Var.set(wallettransaction2);
                            s3Var.id = wallettransaction2.id;
                            s3Var.random_id = wallettransaction2.random_id;
                            s3Var.gasless = wallettransaction2.gasless;
                            s3Var.gaslessMessageBodyHash = wallettransaction2.gaslessMessageBodyHash;
                            s3Var.normalMessageBodyHash = wallettransaction2.normalMessageBodyHash;
                            s3Var.nft = wallettransaction2.nft;
                            K.G = s3Var;
                            K.H = u3Var;
                            TL_wallet.WalletTransactionPeer walletTransactionPeer = wallettransaction2.peer;
                            K.l = walletTransactionPeer == null ? null : u3Var.a(walletTransactionPeer.address);
                            arrayList.add(K);
                        }
                    }
                    org.telegram.ui.Wallet.k0 k0Var2 = y5Var.E0;
                    if (k0Var2 != null && !k0Var2.h) {
                        arrayList.add(b41.q(-1, 37));
                        arrayList.add(b41.q(-2, 37));
                        arrayList.add(b41.q(-3, 37));
                    }
                    p41Var.U();
                    if (z10) {
                        long j3 = ((org.telegram.messenger.l0) y5Var.getMessagesController().y7.l0.b).c;
                        if (j3 > 0) {
                            arrayList.add(b41.C(org.telegram.messenger.hd.V(null, null, 2131743098, org.telegram.ui.Wallet.l0.s(j3, false))));
                            break;
                        }
                    }
                } else {
                    org.telegram.ui.Wallet.d0 d0Var = y5Var.F0;
                    if (d0Var != null) {
                        ArrayList arrayList2 = d0Var.a;
                        int size = arrayList2.size();
                        int i14 = 0;
                        while (i14 < size) {
                            Object obj4 = arrayList2.get(i14);
                            i14++;
                            TL_wallet.nftItem nftitem = (TL_wallet.nftItem) obj4;
                            if (y5Var.l0.isEmpty() || ((str = nftitem.name) != null && str.toLowerCase(Locale.ROOT).contains(y5Var.l0))) {
                                if (nftitem.gift != null) {
                                    org.telegram.ui.Wallet.c8 c8Var = y5Var.k0;
                                    int i15 = org.telegram.ui.Wallet.o7.b;
                                    b41 K2 = b41.K(org.telegram.ui.Wallet.o7.class);
                                    K2.u = 1;
                                    K2.G = nftitem;
                                    K2.H = c8Var;
                                    arrayList.add(K2);
                                } else {
                                    int i16 = org.telegram.ui.Wallet.b.b;
                                    b41 K3 = b41.K(org.telegram.ui.Wallet.b.class);
                                    K3.G = nftitem;
                                    K3.u = 1;
                                    arrayList.add(K3);
                                }
                            }
                        }
                        if (arrayList.isEmpty() && !y5Var.l0.isEmpty()) {
                            org.telegram.ui.Wallet.d0 d0Var2 = y5Var.F0;
                            if (!d0Var2.i && d0Var2.g) {
                                arrayList.add(b41.r(org.telegram.messenger.hd.M0(2131748167, null)));
                            }
                        }
                        org.telegram.ui.Wallet.d0 d0Var3 = y5Var.F0;
                        if (d0Var3.i) {
                            for (int i17 = 0; i17 < 3; i17++) {
                                b41 q10 = b41.q((-1) - i17, 35);
                                q10.u = 1;
                                arrayList.add(q10);
                            }
                            break;
                        } else if (d0Var3.k != null) {
                            arrayList.add(b41.e(-10001, org.telegram.messenger.hd.M0(2131746052, null)));
                            break;
                        }
                    }
                }
                break;
        }
    }
}
