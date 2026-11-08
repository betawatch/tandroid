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

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes4.dex */
public final /* synthetic */ class p implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ m0 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ c20 d;
    public final /* synthetic */ TL_wallet.nftItem e;
    public final /* synthetic */ String f;
    public final /* synthetic */ String h;
    public final /* synthetic */ byte[] n;
    public final /* synthetic */ long r;
    public final /* synthetic */ d2 s;
    public final /* synthetic */ TLRPC.User w;
    public final /* synthetic */ String x;
    public final /* synthetic */ c20 y;

    public /* synthetic */ p(m0 m0Var, String str, c20 c20Var, TL_wallet.nftItem nftitem, String str2, String str3, byte[] bArr, long j3, d2 d2Var, TLRPC.User user, String str4, c20 c20Var2, int i7) {
        this.a = i7;
        this.b = m0Var;
        this.c = str;
        this.d = c20Var;
        this.e = nftitem;
        this.f = str2;
        this.h = str3;
        this.n = bArr;
        this.r = j3;
        this.s = d2Var;
        this.w = user;
        this.x = str4;
        this.y = c20Var2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                m0 m0Var = this.b;
                String str = this.c;
                c20 c20Var = this.d;
                p pVar = new p(m0Var, str, c20Var, this.e, this.f, this.h, this.n, this.r, this.s, this.w, this.x, this.y, 1);
                if (m0Var.K() && !m0Var.J()) {
                    m0.H("send " + str + ": asking passcode");
                    org.telegram.ui.ActionBar.f2 T = LaunchActivity.T();
                    if (T != null) {
                        org.telegram.ui.ActionBar.d2 d2Var = new org.telegram.ui.ActionBar.d2();
                        d2Var.a = true;
                        boolean[] zArr = {false};
                        z zVar = new z(zArr, c20Var);
                        zVar.V = new n(2, zArr, pVar);
                        T.showAsSheet(zVar, d2Var);
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
                m0.H(sb2.toString());
                final m0 m0Var2 = this.b;
                final c20 c20Var2 = this.d;
                final TL_wallet.nftItem nftitem = this.e;
                final String str3 = this.f;
                final String str4 = this.h;
                final byte[] bArr = this.n;
                final long j3 = this.r;
                final d2 d2Var2 = this.s;
                final TLRPC.User user = this.w;
                final String str5 = this.x;
                final c20 c20Var3 = this.y;
                m0Var2.z(new v10() { // from class: org.telegram.ui.Wallet.s
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
                        l0 l0Var;
                        TLRPC.User user2;
                        m0 m0Var3;
                        long j10;
                        long j11;
                        ij ijVar;
                        c20 c20Var4;
                        m0 m0Var4;
                        TL_update.TL_updateWalletGaslessInfo tL_updateWalletGaslessInfo;
                        TL_update.TL_updateWalletGaslessInfo tL_updateWalletGaslessInfo2;
                        j0 j0Var = (j0) obj;
                        String str6 = (String) obj2;
                        m0 m0Var5 = m0.this;
                        int i7 = m0Var5.a;
                        c20 c20Var5 = c20Var2;
                        if (str6 != null) {
                            c20Var5.a(str6);
                            return;
                        }
                        if (j0Var == null) {
                            c20Var5.a("NULL_ERROR");
                            return;
                        }
                        if (m0Var5.b == null) {
                            c20Var5.a("NULL_ENGINE");
                            return;
                        }
                        TL_wallet.nftItem nftitem3 = nftitem;
                        if (nftitem3 != null) {
                            if (!m0.b(str3, m0Var5.t())) {
                                c20Var5.a("WALLET_CHANGED");
                                return;
                            }
                        }
                        l0 B = m0Var5.B();
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
                        d2 d2Var3 = d2Var2;
                        TLRPC.User user3 = user;
                        String str8 = str2;
                        if (d2Var3 == null || nftitem3 == null) {
                            nftitem2 = nftitem3;
                            l0Var = B;
                            wallettransaction.peer = m0.g(user3, str8, str5);
                        } else {
                            TL_wallet.walletTransactionPeerTelegramGift wallettransactionpeertelegramgift = new TL_wallet.walletTransactionPeerTelegramGift();
                            nftitem2 = nftitem3;
                            l0Var = B;
                            wallettransactionpeertelegramgift.own_profile = user3 != null && user3.id == p10.i(i7).e();
                            wallettransaction.peer = wallettransactionpeertelegramgift;
                        }
                        TL_wallet.nftItem nftitem4 = nftitem2;
                        l0 l0Var2 = l0Var;
                        f7 f7Var = new f7(m0Var5, wallettransaction, nftitem4, l0Var2, 3);
                        long nextLong = Utilities.b.nextLong();
                        wallettransaction.random_id = nextLong;
                        m0Var5.p.add(0, wallettransaction);
                        if (nftitem4 != null) {
                            if (m0Var5.o == null) {
                                m0Var5.o = new e0(m0Var5);
                            }
                            e0 e0Var = m0Var5.o;
                            e0Var.c.add(wallettransaction);
                            e0Var.h();
                            e0Var.g();
                        }
                        l0Var2.k();
                        l0Var2.i();
                        m0Var5.S();
                        gz C = gz.C(i7);
                        if (user3 != null) {
                            m0Var3 = m0Var5;
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
                                m0Var4 = m0Var3;
                                tL_updateWalletGaslessInfo = m0Var4.f;
                                if (tL_updateWalletGaslessInfo != null && !TextUtils.isEmpty(tL_updateWalletGaslessInfo.relayer_address)) {
                                    tL_updateWalletGaslessInfo2 = m0Var4.f;
                                    if (tL_updateWalletGaslessInfo2.available) {
                                        str9 = tL_updateWalletGaslessInfo2.relayer_address;
                                    }
                                }
                                m0.H("prepare sending");
                                String str10 = str9;
                                long j13 = j10;
                                final v vVar = new v(m0Var4, f7Var, C, ijVar, wallettransaction, str8, l0Var2, j13, user2);
                                if (d2Var3 == null) {
                                    final int i10 = 0;
                                    m0Var4.b.prepareTonConnectTransfer(j0Var, d2Var3, a8.p0.o(j13, "deposit:"), new v10() { // from class: org.telegram.ui.Wallet.w
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
                                    m0Var4.b.prepareSend(j0Var, str8, j11, str7, bArr2, str10, vVar);
                                    return;
                                } else {
                                    final int i11 = 1;
                                    m0Var4.b.prepareSendNFT(j0Var, str8, nftitem4.address, str7, new v10() { // from class: org.telegram.ui.Wallet.w
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
                            m0Var3 = m0Var5;
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
                        m0Var4 = m0Var3;
                        tL_updateWalletGaslessInfo = m0Var4.f;
                        if (tL_updateWalletGaslessInfo != null) {
                            tL_updateWalletGaslessInfo2 = m0Var4.f;
                            if (tL_updateWalletGaslessInfo2.available) {
                            }
                        }
                        m0.H("prepare sending");
                        String str102 = str92;
                        long j132 = j10;
                        final v vVar2 = new v(m0Var4, f7Var, C, ijVar, wallettransaction, str8, l0Var2, j132, user2);
                        if (d2Var3 == null) {
                        }
                    }
                }, false, true);
                break;
        }
    }
}
