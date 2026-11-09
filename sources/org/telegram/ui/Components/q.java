package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_aicompose;
import org.telegram.tgnet.tl.TL_wallet;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
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
                        org.telegram.ui.nk0 nk0Var = n0Var.c;
                        org.telegram.ui.Wallet.l0 l0Var = (org.telegram.ui.Wallet.l0) nk0Var.b;
                        TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) nk0Var.c;
                        int i11 = l0Var.a;
                        Iterator<TL_wallet.walletTransaction> it = wallettransactions.transactions.iterator();
                        if (it.hasNext()) {
                            TL_wallet.walletTransaction next = it.next();
                            org.telegram.messenger.qp.s1(i11).Y3(wallettransactions.users, false);
                            org.telegram.messenger.qp.s1(i11).S3(wallettransactions.chats, false);
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
                m41 m41Var = (m41) obj2;
                org.telegram.ui.Wallet.w5 w5Var = (org.telegram.ui.Wallet.w5) ((bi.g5) obj3).c;
                if (i10 == 0) {
                    m41Var.V();
                    org.telegram.ui.Wallet.k0 k0Var = w5Var.D0;
                    boolean z9 = (k0Var == null || k0Var.c.isEmpty()) ? false : true;
                    if (z9) {
                        for (int i12 = 0; i12 < w5Var.D0.c.size(); i12++) {
                            TL_wallet.walletTransaction wallettransaction2 = (TL_wallet.walletTransaction) w5Var.D0.c.get(i12);
                            org.telegram.ui.Wallet.t3 t3Var = w5Var.D0.a;
                            int i13 = org.telegram.ui.Wallet.s3.b;
                            y31 K = y31.K(org.telegram.ui.Wallet.s3.class);
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
                    org.telegram.ui.Wallet.k0 k0Var2 = w5Var.D0;
                    if (k0Var2 != null && !k0Var2.h) {
                        arrayList.add(y31.q(-1, 37));
                        arrayList.add(y31.q(-2, 37));
                        arrayList.add(y31.q(-3, 37));
                    }
                    m41Var.U();
                    if (z9) {
                        long j3 = ((org.telegram.messenger.l0) w5Var.getMessagesController().x7.l0.b).c;
                        if (j3 > 0) {
                            arrayList.add(y31.C(org.telegram.messenger.id.V(null, null, 2131743098, org.telegram.ui.Wallet.l0.s(j3, false))));
                            break;
                        }
                    }
                } else {
                    org.telegram.ui.Wallet.d0 d0Var = w5Var.E0;
                    if (d0Var != null) {
                        ArrayList arrayList2 = d0Var.a;
                        int size = arrayList2.size();
                        int i14 = 0;
                        while (i14 < size) {
                            Object obj4 = arrayList2.get(i14);
                            i14++;
                            TL_wallet.nftItem nftitem = (TL_wallet.nftItem) obj4;
                            if (w5Var.k0.isEmpty() || ((str = nftitem.name) != null && str.toLowerCase(Locale.ROOT).contains(w5Var.k0))) {
                                if (nftitem.gift != null) {
                                    org.telegram.ui.Wallet.a8 a8Var = w5Var.j0;
                                    int i15 = org.telegram.ui.Wallet.m7.b;
                                    y31 K2 = y31.K(org.telegram.ui.Wallet.m7.class);
                                    K2.u = 1;
                                    K2.G = nftitem;
                                    K2.H = a8Var;
                                    arrayList.add(K2);
                                } else {
                                    int i16 = org.telegram.ui.Wallet.b.b;
                                    y31 K3 = y31.K(org.telegram.ui.Wallet.b.class);
                                    K3.G = nftitem;
                                    K3.u = 1;
                                    arrayList.add(K3);
                                }
                            }
                        }
                        if (arrayList.isEmpty() && !w5Var.k0.isEmpty()) {
                            org.telegram.ui.Wallet.d0 d0Var2 = w5Var.E0;
                            if (!d0Var2.i && d0Var2.g) {
                                arrayList.add(y31.r(org.telegram.messenger.id.M0(2131748167, null)));
                            }
                        }
                        org.telegram.ui.Wallet.d0 d0Var3 = w5Var.E0;
                        if (d0Var3.i) {
                            for (int i17 = 0; i17 < 3; i17++) {
                                y31 q10 = y31.q((-1) - i17, 35);
                                q10.u = 1;
                                arrayList.add(q10);
                            }
                            break;
                        } else if (d0Var3.k != null) {
                            arrayList.add(y31.e(-10001, org.telegram.messenger.id.M0(2131746052, null)));
                            break;
                        }
                    }
                }
                break;
        }
    }
}
