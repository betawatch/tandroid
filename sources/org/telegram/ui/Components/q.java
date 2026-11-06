package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_aicompose;
import org.telegram.tgnet.tl.TL_wallet;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final /* synthetic */ class q implements org.telegram.messenger.v10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ q(Object obj, int i7, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = i7;
    }

    @Override // org.telegram.messenger.v10
    public final void a(Object obj, Object obj2) {
        String str;
        int i7 = this.a;
        int i10 = this.b;
        Object obj3 = this.c;
        switch (i7) {
            case 0:
                s sVar = (s) obj3;
                TL_aicompose.aiComposeToneExample aicomposetoneexample = (TL_aicompose.aiComposeToneExample) obj;
                if (aicomposetoneexample != null) {
                    sVar.a2[i10] = aicomposetoneexample;
                    sVar.Y1.O(true);
                    break;
                } else {
                    sVar.getClass();
                    break;
                }
            case 1:
                org.telegram.ui.Wallet.p0 p0Var = (org.telegram.ui.Wallet.p0) obj3;
                TL_wallet.walletTransactions wallettransactions = (TL_wallet.walletTransactions) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (p0Var.d && p0Var.e == i10) {
                    p0Var.g = -1;
                    org.telegram.messenger.g0.r(p0Var.h);
                    StringBuilder sb2 = new StringBuilder("[gram-wallet-polling] account=");
                    sb2.append(p0Var.a);
                    sb2.append(" msg_hash=");
                    sb2.append(p0Var.b);
                    sb2.append(" transactions=");
                    sb2.append(wallettransactions == null ? "none" : Integer.valueOf(wallettransactions.transactions.size()));
                    sb2.append(" errorCode=");
                    sb2.append(tL_error != null ? Integer.valueOf(tL_error.code) : "none");
                    org.telegram.messenger.a8.b(sb2.toString());
                    if (tL_error == null && wallettransactions != null) {
                        org.telegram.ui.lk0 lk0Var = p0Var.c;
                        org.telegram.ui.Wallet.n0 n0Var = (org.telegram.ui.Wallet.n0) lk0Var.b;
                        TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) lk0Var.c;
                        int i11 = n0Var.a;
                        Iterator<TL_wallet.walletTransaction> it = wallettransactions.transactions.iterator();
                        if (it.hasNext()) {
                            TL_wallet.walletTransaction next = it.next();
                            org.telegram.messenger.qp.s1(i11).Y3(wallettransactions.users, false);
                            org.telegram.messenger.qp.s1(i11).S3(wallettransactions.chats, false);
                            n0Var.c(wallettransaction, next);
                            n0Var.E();
                            p0Var.b();
                            break;
                        }
                    }
                    if (p0Var.d && p0Var.e == i10) {
                        p0Var.a();
                        break;
                    }
                }
                break;
            default:
                ArrayList arrayList = (ArrayList) obj;
                f41 f41Var = (f41) obj2;
                org.telegram.ui.Wallet.y5 y5Var = (org.telegram.ui.Wallet.y5) ((bi.g5) obj3).c;
                if (i10 == 0) {
                    f41Var.V();
                    org.telegram.ui.Wallet.m0 m0Var = y5Var.D0;
                    boolean z9 = (m0Var == null || m0Var.c.isEmpty()) ? false : true;
                    if (z9) {
                        for (int i12 = 0; i12 < y5Var.D0.c.size(); i12++) {
                            TL_wallet.walletTransaction wallettransaction2 = (TL_wallet.walletTransaction) y5Var.D0.c.get(i12);
                            org.telegram.ui.Wallet.v3 v3Var = y5Var.D0.a;
                            int i13 = org.telegram.ui.Wallet.u3.b;
                            r31 K = r31.K(org.telegram.ui.Wallet.u3.class);
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
                    org.telegram.ui.Wallet.m0 m0Var2 = y5Var.D0;
                    if (m0Var2 != null && !m0Var2.h) {
                        arrayList.add(r31.q(-1, 37));
                        arrayList.add(r31.q(-2, 37));
                        arrayList.add(r31.q(-3, 37));
                    }
                    f41Var.U();
                    if (z9) {
                        long j3 = ((org.telegram.messenger.l0) y5Var.getMessagesController().x7.l0.b).c;
                        if (j3 > 0) {
                            arrayList.add(r31.C(org.telegram.messenger.hd.V(null, null, 2131743099, org.telegram.ui.Wallet.n0.s(j3, false))));
                            break;
                        }
                    }
                } else {
                    org.telegram.ui.Wallet.f0 f0Var = y5Var.E0;
                    if (f0Var != null) {
                        ArrayList arrayList2 = f0Var.a;
                        int size = arrayList2.size();
                        int i14 = 0;
                        while (i14 < size) {
                            Object obj4 = arrayList2.get(i14);
                            i14++;
                            TL_wallet.nftItem nftitem = (TL_wallet.nftItem) obj4;
                            if (y5Var.k0.isEmpty() || ((str = nftitem.name) != null && str.toLowerCase(Locale.ROOT).contains(y5Var.k0))) {
                                if (nftitem.gift != null) {
                                    org.telegram.ui.Wallet.c8 c8Var = y5Var.j0;
                                    int i15 = org.telegram.ui.Wallet.o7.b;
                                    r31 K2 = r31.K(org.telegram.ui.Wallet.o7.class);
                                    K2.u = 1;
                                    K2.G = nftitem;
                                    K2.H = c8Var;
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
                        if (arrayList.isEmpty() && !y5Var.k0.isEmpty()) {
                            org.telegram.ui.Wallet.f0 f0Var2 = y5Var.E0;
                            if (!f0Var2.i && f0Var2.g) {
                                arrayList.add(r31.r(org.telegram.messenger.hd.M0(2131748166, null)));
                            }
                        }
                        org.telegram.ui.Wallet.f0 f0Var3 = y5Var.E0;
                        if (f0Var3.i) {
                            for (int i17 = 0; i17 < 3; i17++) {
                                r31 q10 = r31.q((-1) - i17, 35);
                                q10.u = 1;
                                arrayList.add(q10);
                            }
                            break;
                        } else if (f0Var3.k != null) {
                            arrayList.add(r31.e(-10001, org.telegram.messenger.hd.M0(2131746053, null)));
                            break;
                        }
                    }
                }
                break;
        }
    }
}
