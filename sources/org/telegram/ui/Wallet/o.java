package org.telegram.ui.Wallet;

import android.text.TextUtils;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.d20;
import org.telegram.messenger.j20;
import org.telegram.messenger.jj;
import org.telegram.messenger.q20;
import org.telegram.messenger.qz;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.t11;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class o implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ k0 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ q20 d;
    public final /* synthetic */ TL_wallet.nftItem e;
    public final /* synthetic */ String f;
    public final /* synthetic */ String h;
    public final /* synthetic */ byte[] n;
    public final /* synthetic */ long r;
    public final /* synthetic */ d2 s;
    public final /* synthetic */ TLRPC.User w;
    public final /* synthetic */ String x;
    public final /* synthetic */ q20 y;

    public /* synthetic */ o(k0 k0Var, String str, q20 q20Var, TL_wallet.nftItem nftitem, String str2, String str3, byte[] bArr, long j10, d2 d2Var, TLRPC.User user, String str4, q20 q20Var2, int i10) {
        this.a = i10;
        this.b = k0Var;
        this.c = str;
        this.d = q20Var;
        this.e = nftitem;
        this.f = str2;
        this.h = str3;
        this.n = bArr;
        this.r = j10;
        this.s = d2Var;
        this.w = user;
        this.x = str4;
        this.y = q20Var2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                k0 k0Var = this.b;
                String str = this.c;
                q20 q20Var = this.d;
                o oVar = new o(k0Var, str, q20Var, this.e, this.f, this.h, this.n, this.r, this.s, this.w, this.x, this.y, 1);
                if (k0Var.K() && !k0Var.J()) {
                    k0.H("send " + str + ": asking passcode");
                    org.telegram.ui.ActionBar.k2 T = LaunchActivity.T();
                    if (T != null) {
                        org.telegram.ui.ActionBar.i2 i2Var = new org.telegram.ui.ActionBar.i2();
                        i2Var.a = true;
                        boolean[] zArr = {false};
                        x xVar = new x(zArr, q20Var);
                        xVar.V = new t11(25, zArr, oVar);
                        T.showAsSheet(xVar, i2Var);
                        break;
                    }
                } else {
                    oVar.run();
                    break;
                }
                break;
            default:
                StringBuilder sb2 = new StringBuilder("send ");
                final String str2 = this.c;
                sb2.append(str2);
                sb2.append(": ready, get secret phrase");
                k0.H(sb2.toString());
                final k0 k0Var2 = this.b;
                final q20 q20Var2 = this.d;
                final TL_wallet.nftItem nftitem = this.e;
                final String str3 = this.f;
                final String str4 = this.h;
                final byte[] bArr = this.n;
                final long j10 = this.r;
                final d2 d2Var = this.s;
                final TLRPC.User user = this.w;
                final String str5 = this.x;
                final q20 q20Var3 = this.y;
                k0Var2.z(new j20() { // from class: org.telegram.ui.Wallet.r
                    /* JADX WARN: Removed duplicated region for block: B:47:0x012d  */
                    /* JADX WARN: Removed duplicated region for block: B:50:0x0139  */
                    /* JADX WARN: Removed duplicated region for block: B:57:0x0154  */
                    /* JADX WARN: Removed duplicated region for block: B:60:0x0175  */
                    /* JADX WARN: Removed duplicated region for block: B:62:0x0187  */
                    /* JADX WARN: Removed duplicated region for block: B:67:0x012f  */
                    @Override // org.telegram.messenger.j20
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final void a(Object obj, Object obj2) {
                        TL_wallet.nftItem nftitem2;
                        j0 j0Var;
                        TLRPC.User user2;
                        k0 k0Var3;
                        long j11;
                        long j12;
                        jj jjVar;
                        q20 q20Var4;
                        k0 k0Var4;
                        TL_update.TL_updateWalletGaslessInfo tL_updateWalletGaslessInfo;
                        TL_update.TL_updateWalletGaslessInfo tL_updateWalletGaslessInfo2;
                        h0 h0Var = (h0) obj;
                        String str6 = (String) obj2;
                        k0 k0Var5 = k0.this;
                        int i10 = k0Var5.a;
                        q20 q20Var5 = q20Var2;
                        if (str6 != null) {
                            q20Var5.a(str6);
                            return;
                        }
                        if (h0Var == null) {
                            q20Var5.a("NULL_ERROR");
                            return;
                        }
                        if (k0Var5.b == null) {
                            q20Var5.a("NULL_ENGINE");
                            return;
                        }
                        TL_wallet.nftItem nftitem3 = nftitem;
                        if (nftitem3 != null) {
                            if (!k0.b(str3, k0Var5.t())) {
                                q20Var5.a("WALLET_CHANGED");
                                return;
                            }
                        }
                        j0 B = k0Var5.B();
                        TL_wallet.walletTransaction wallettransaction = new TL_wallet.walletTransaction();
                        wallettransaction.incoming = false;
                        wallettransaction.pending = true;
                        String str7 = str4;
                        wallettransaction.comment = str7;
                        wallettransaction.comment_encrypted = false;
                        byte[] bArr2 = bArr;
                        wallettransaction.comment_encrypted_preparing = (nftitem3 != null || bArr2 == null || TextUtils.isEmpty(str7)) ? false : true;
                        wallettransaction.date = ConnectionsManager.getInstance(i10).getCurrentTime();
                        long j13 = j10;
                        wallettransaction.amount = j13;
                        wallettransaction.nft = nftitem3;
                        d2 d2Var2 = d2Var;
                        TLRPC.User user3 = user;
                        String str8 = str2;
                        if (d2Var2 == null || nftitem3 == null) {
                            nftitem2 = nftitem3;
                            j0Var = B;
                            wallettransaction.peer = k0.g(user3, str8, str5);
                        } else {
                            TL_wallet.walletTransactionPeerTelegramGift wallettransactionpeertelegramgift = new TL_wallet.walletTransactionPeerTelegramGift();
                            nftitem2 = nftitem3;
                            j0Var = B;
                            wallettransactionpeertelegramgift.own_profile = user3 != null && user3.id == d20.i(i10).e();
                            wallettransaction.peer = wallettransactionpeertelegramgift;
                        }
                        TL_wallet.nftItem nftitem4 = nftitem2;
                        j0 j0Var2 = j0Var;
                        k7 k7Var = new k7(k0Var5, wallettransaction, nftitem4, j0Var2, 3);
                        long nextLong = Utilities.b.nextLong();
                        wallettransaction.random_id = nextLong;
                        k0Var5.p.add(0, wallettransaction);
                        if (nftitem4 != null) {
                            if (k0Var5.o == null) {
                                k0Var5.o = new c0(k0Var5);
                            }
                            c0 c0Var = k0Var5.o;
                            c0Var.c.add(wallettransaction);
                            c0Var.h();
                            c0Var.g();
                        }
                        j0Var2.k();
                        j0Var2.i();
                        k0Var5.S();
                        qz C = qz.C(i10);
                        if (user3 != null) {
                            k0Var3 = k0Var5;
                            if (user3.id != d20.i(i10).e() && nftitem4 == null) {
                                user2 = user3;
                                j11 = nextLong;
                                j12 = j13;
                                jjVar = C.q(user2, str8, j12, wallettransaction.comment, wallettransaction.comment_encrypted, wallettransaction.comment_encrypted_preparing, j11);
                                wallettransaction.localMessageId = jjVar != null ? 0 : jjVar.f1();
                                q20Var4 = q20Var3;
                                if (q20Var4 != null) {
                                    q20Var4.a(wallettransaction);
                                }
                                String str9 = null;
                                q20Var5.a(null);
                                k0Var4 = k0Var3;
                                tL_updateWalletGaslessInfo = k0Var4.f;
                                if (tL_updateWalletGaslessInfo != null && !TextUtils.isEmpty(tL_updateWalletGaslessInfo.relayer_address)) {
                                    tL_updateWalletGaslessInfo2 = k0Var4.f;
                                    if (tL_updateWalletGaslessInfo2.available) {
                                        str9 = tL_updateWalletGaslessInfo2.relayer_address;
                                    }
                                }
                                k0.H("prepare sending");
                                String str10 = str9;
                                long j14 = j11;
                                final t tVar = new t(k0Var4, k7Var, C, jjVar, wallettransaction, str8, j0Var2, j14, user2);
                                if (d2Var2 == null) {
                                    final int i11 = 0;
                                    k0Var4.b.prepareTonConnectTransfer(h0Var, d2Var2, a1.g.l(j14, "deposit:"), new j20() { // from class: org.telegram.ui.Wallet.u
                                        @Override // org.telegram.messenger.j20
                                        public final void a(Object obj3, Object obj4) {
                                            TL_wallet.sendTransfer sendtransfer = (TL_wallet.sendTransfer) obj3;
                                            String str11 = (String) obj4;
                                            switch (i11) {
                                                case 0:
                                                    tVar.a(sendtransfer, null, str11);
                                                    break;
                                                default:
                                                    tVar.a(sendtransfer, null, str11);
                                                    break;
                                            }
                                        }
                                    });
                                    return;
                                } else if (nftitem4 == null) {
                                    k0Var4.b.prepareSend(h0Var, str8, j12, str7, bArr2, str10, tVar);
                                    return;
                                } else {
                                    final int i12 = 1;
                                    k0Var4.b.prepareSendNFT(h0Var, str8, nftitem4.address, str7, new j20() { // from class: org.telegram.ui.Wallet.u
                                        @Override // org.telegram.messenger.j20
                                        public final void a(Object obj3, Object obj4) {
                                            TL_wallet.sendTransfer sendtransfer = (TL_wallet.sendTransfer) obj3;
                                            String str11 = (String) obj4;
                                            switch (i12) {
                                                case 0:
                                                    tVar.a(sendtransfer, null, str11);
                                                    break;
                                                default:
                                                    tVar.a(sendtransfer, null, str11);
                                                    break;
                                            }
                                        }
                                    });
                                    return;
                                }
                            }
                            user2 = user3;
                        } else {
                            user2 = user3;
                            k0Var3 = k0Var5;
                        }
                        j11 = nextLong;
                        j12 = j13;
                        jjVar = null;
                        wallettransaction.localMessageId = jjVar != null ? 0 : jjVar.f1();
                        q20Var4 = q20Var3;
                        if (q20Var4 != null) {
                        }
                        String str92 = null;
                        q20Var5.a(null);
                        k0Var4 = k0Var3;
                        tL_updateWalletGaslessInfo = k0Var4.f;
                        if (tL_updateWalletGaslessInfo != null) {
                            tL_updateWalletGaslessInfo2 = k0Var4.f;
                            if (tL_updateWalletGaslessInfo2.available) {
                            }
                        }
                        k0.H("prepare sending");
                        String str102 = str92;
                        long j142 = j11;
                        final t tVar2 = new t(k0Var4, k7Var, C, jjVar, wallettransaction, str8, j0Var2, j142, user2);
                        if (d2Var2 == null) {
                        }
                    }
                }, false, true);
                break;
        }
    }
}
