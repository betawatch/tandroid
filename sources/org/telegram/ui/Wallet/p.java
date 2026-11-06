package org.telegram.ui.Wallet;

import android.text.TextUtils;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.c20;
import org.telegram.messenger.gz;
import org.telegram.messenger.ij;
import org.telegram.messenger.p10;
import org.telegram.messenger.v10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes4.dex */
public final /* synthetic */ class p implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ n0 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ c20 d;
    public final /* synthetic */ TL_wallet.nftItem e;
    public final /* synthetic */ String f;
    public final /* synthetic */ String h;
    public final /* synthetic */ byte[] n;
    public final /* synthetic */ long r;
    public final /* synthetic */ e2 s;
    public final /* synthetic */ TLRPC.User w;
    public final /* synthetic */ String x;
    public final /* synthetic */ c20 y;

    public /* synthetic */ p(n0 n0Var, String str, c20 c20Var, TL_wallet.nftItem nftitem, String str2, String str3, byte[] bArr, long j3, e2 e2Var, TLRPC.User user, String str4, c20 c20Var2, int i7) {
        this.a = i7;
        this.b = n0Var;
        this.c = str;
        this.d = c20Var;
        this.e = nftitem;
        this.f = str2;
        this.h = str3;
        this.n = bArr;
        this.r = j3;
        this.s = e2Var;
        this.w = user;
        this.x = str4;
        this.y = c20Var2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                n0 n0Var = this.b;
                String str = this.c;
                c20 c20Var = this.d;
                p pVar = new p(n0Var, str, c20Var, this.e, this.f, this.h, this.n, this.r, this.s, this.w, this.x, this.y, 1);
                if (n0Var.K() && !n0Var.J()) {
                    n0.H("send " + str + ": asking passcode");
                    org.telegram.ui.ActionBar.f2 T = LaunchActivity.T();
                    if (T != null) {
                        org.telegram.ui.ActionBar.d2 d2Var = new org.telegram.ui.ActionBar.d2();
                        d2Var.a = true;
                        boolean[] zArr = {false};
                        a0 a0Var = new a0(zArr, c20Var);
                        a0Var.V = new n(2, zArr, pVar);
                        T.showAsSheet(a0Var, d2Var);
                        break;
                    }
                } else {
                    pVar.run();
                    break;
                }
                break;
            default:
                StringBuilder sb2 = new StringBuilder("send ");
                final String str2 = this.c;
                sb2.append(str2);
                sb2.append(": ready, get secret phrase");
                n0.H(sb2.toString());
                final n0 n0Var2 = this.b;
                final c20 c20Var2 = this.d;
                final TL_wallet.nftItem nftitem = this.e;
                final String str3 = this.f;
                final String str4 = this.h;
                final byte[] bArr = this.n;
                final long j3 = this.r;
                final e2 e2Var = this.s;
                final TLRPC.User user = this.w;
                final String str5 = this.x;
                final c20 c20Var3 = this.y;
                n0Var2.z(new v10() { // from class: org.telegram.ui.Wallet.s
                    /* JADX WARN: Removed duplicated region for block: B:47:0x012d  */
                    /* JADX WARN: Removed duplicated region for block: B:50:0x0139  */
                    /* JADX WARN: Removed duplicated region for block: B:57:0x0154  */
                    /* JADX WARN: Removed duplicated region for block: B:60:0x0175  */
                    /* JADX WARN: Removed duplicated region for block: B:62:0x0187  */
                    /* JADX WARN: Removed duplicated region for block: B:67:0x012f  */
                    @Override // org.telegram.messenger.v10
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final void a(Object obj, Object obj2) {
                        TL_wallet.nftItem nftitem2;
                        m0 m0Var;
                        TLRPC.User user2;
                        n0 n0Var3;
                        long j10;
                        long j11;
                        ij ijVar;
                        c20 c20Var4;
                        n0 n0Var4;
                        TL_update.TL_updateWalletGaslessInfo tL_updateWalletGaslessInfo;
                        TL_update.TL_updateWalletGaslessInfo tL_updateWalletGaslessInfo2;
                        k0 k0Var = (k0) obj;
                        String str6 = (String) obj2;
                        n0 n0Var5 = n0.this;
                        int i7 = n0Var5.a;
                        c20 c20Var5 = c20Var2;
                        if (str6 != null) {
                            c20Var5.a(str6);
                            return;
                        }
                        if (k0Var == null) {
                            c20Var5.a("NULL_ERROR");
                            return;
                        }
                        if (n0Var5.b == null) {
                            c20Var5.a("NULL_ENGINE");
                            return;
                        }
                        TL_wallet.nftItem nftitem3 = nftitem;
                        if (nftitem3 != null) {
                            if (!n0.b(str3, n0Var5.t())) {
                                c20Var5.a("WALLET_CHANGED");
                                return;
                            }
                        }
                        m0 B = n0Var5.B();
                        TL_wallet.walletTransaction wallettransaction = new TL_wallet.walletTransaction();
                        wallettransaction.incoming = false;
                        wallettransaction.pending = true;
                        String str7 = str4;
                        wallettransaction.comment = str7;
                        wallettransaction.comment_encrypted = false;
                        byte[] bArr2 = bArr;
                        wallettransaction.comment_encrypted_preparing = (nftitem3 != null || bArr2 == null || TextUtils.isEmpty(str7)) ? false : true;
                        wallettransaction.date = ConnectionsManager.getInstance(i7).getCurrentTime();
                        long j12 = j3;
                        wallettransaction.amount = j12;
                        wallettransaction.nft = nftitem3;
                        e2 e2Var2 = e2Var;
                        TLRPC.User user3 = user;
                        String str8 = str2;
                        if (e2Var2 == null || nftitem3 == null) {
                            nftitem2 = nftitem3;
                            m0Var = B;
                            wallettransaction.peer = n0.g(user3, str8, str5);
                        } else {
                            TL_wallet.walletTransactionPeerTelegramGift wallettransactionpeertelegramgift = new TL_wallet.walletTransactionPeerTelegramGift();
                            nftitem2 = nftitem3;
                            m0Var = B;
                            wallettransactionpeertelegramgift.own_profile = user3 != null && user3.id == p10.i(i7).e();
                            wallettransaction.peer = wallettransactionpeertelegramgift;
                        }
                        TL_wallet.nftItem nftitem4 = nftitem2;
                        m0 m0Var2 = m0Var;
                        g7 g7Var = new g7(n0Var5, wallettransaction, nftitem4, m0Var2, 3);
                        long nextLong = Utilities.b.nextLong();
                        wallettransaction.random_id = nextLong;
                        n0Var5.p.add(0, wallettransaction);
                        if (nftitem4 != null) {
                            if (n0Var5.o == null) {
                                n0Var5.o = new f0(n0Var5);
                            }
                            f0 f0Var = n0Var5.o;
                            f0Var.c.add(wallettransaction);
                            f0Var.h();
                            f0Var.g();
                        }
                        m0Var2.k();
                        m0Var2.i();
                        n0Var5.S();
                        gz C = gz.C(i7);
                        if (user3 != null) {
                            n0Var3 = n0Var5;
                            if (user3.id != p10.i(i7).e() && nftitem4 == null) {
                                user2 = user3;
                                j10 = nextLong;
                                j11 = j12;
                                ijVar = C.q(user2, str8, j11, wallettransaction.comment, wallettransaction.comment_encrypted, wallettransaction.comment_encrypted_preparing, j10);
                                wallettransaction.localMessageId = ijVar != null ? 0 : ijVar.f1();
                                c20Var4 = c20Var3;
                                if (c20Var4 != null) {
                                    c20Var4.a(wallettransaction);
                                }
                                String str9 = null;
                                c20Var5.a(null);
                                n0Var4 = n0Var3;
                                tL_updateWalletGaslessInfo = n0Var4.f;
                                if (tL_updateWalletGaslessInfo != null && !TextUtils.isEmpty(tL_updateWalletGaslessInfo.relayer_address)) {
                                    tL_updateWalletGaslessInfo2 = n0Var4.f;
                                    if (tL_updateWalletGaslessInfo2.available) {
                                        str9 = tL_updateWalletGaslessInfo2.relayer_address;
                                    }
                                }
                                n0.H("prepare sending");
                                String str10 = str9;
                                long j13 = j10;
                                final v vVar = new v(n0Var4, g7Var, C, ijVar, wallettransaction, str8, m0Var2, j13, user2);
                                if (e2Var2 == null) {
                                    final int i10 = 0;
                                    n0Var4.b.prepareTonConnectTransfer(k0Var, e2Var2, a8.p0.o(j13, "deposit:"), new v10() { // from class: org.telegram.ui.Wallet.w
                                        @Override // org.telegram.messenger.v10
                                        public final void a(Object obj3, Object obj4) {
                                            TL_wallet.sendTransfer sendtransfer = (TL_wallet.sendTransfer) obj3;
                                            String str11 = (String) obj4;
                                            switch (i10) {
                                                case 0:
                                                    vVar.a(sendtransfer, null, str11);
                                                    break;
                                                default:
                                                    vVar.a(sendtransfer, null, str11);
                                                    break;
                                            }
                                        }
                                    });
                                    return;
                                } else if (nftitem4 == null) {
                                    n0Var4.b.prepareSend(k0Var, str8, j11, str7, bArr2, str10, vVar);
                                    return;
                                } else {
                                    final int i11 = 1;
                                    n0Var4.b.prepareSendNFT(k0Var, str8, nftitem4.address, str7, new v10() { // from class: org.telegram.ui.Wallet.w
                                        @Override // org.telegram.messenger.v10
                                        public final void a(Object obj3, Object obj4) {
                                            TL_wallet.sendTransfer sendtransfer = (TL_wallet.sendTransfer) obj3;
                                            String str11 = (String) obj4;
                                            switch (i11) {
                                                case 0:
                                                    vVar.a(sendtransfer, null, str11);
                                                    break;
                                                default:
                                                    vVar.a(sendtransfer, null, str11);
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
                            n0Var3 = n0Var5;
                        }
                        j10 = nextLong;
                        j11 = j12;
                        ijVar = null;
                        wallettransaction.localMessageId = ijVar != null ? 0 : ijVar.f1();
                        c20Var4 = c20Var3;
                        if (c20Var4 != null) {
                        }
                        String str92 = null;
                        c20Var5.a(null);
                        n0Var4 = n0Var3;
                        tL_updateWalletGaslessInfo = n0Var4.f;
                        if (tL_updateWalletGaslessInfo != null) {
                            tL_updateWalletGaslessInfo2 = n0Var4.f;
                            if (tL_updateWalletGaslessInfo2.available) {
                            }
                        }
                        n0.H("prepare sending");
                        String str102 = str92;
                        long j132 = j10;
                        final v vVar2 = new v(n0Var4, g7Var, C, ijVar, wallettransaction, str8, m0Var2, j132, user2);
                        if (e2Var2 == null) {
                        }
                    }
                }, false, true);
                break;
        }
    }
}
