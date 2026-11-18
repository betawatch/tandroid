package org.telegram.ui.Wallet;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.fj;
import org.telegram.messenger.j10;
import org.telegram.messenger.q10;
import org.telegram.messenger.x10;
import org.telegram.messenger.zy;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.b31;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes4.dex */
public final /* synthetic */ class n implements Runnable {
    public final /* synthetic */ x10 E;
    public final /* synthetic */ k2 F;
    public final /* synthetic */ int a;
    public final /* synthetic */ u0 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ x10 d;
    public final /* synthetic */ TL_wallet.nftItem e;
    public final /* synthetic */ String f;
    public final /* synthetic */ String h;
    public final /* synthetic */ byte[] n;
    public final /* synthetic */ long r;
    public final /* synthetic */ p0 s;
    public final /* synthetic */ k2 w;
    public final /* synthetic */ TLRPC.User x;
    public final /* synthetic */ String y;

    public /* synthetic */ n(u0 u0Var, String str, x10 x10Var, TL_wallet.nftItem nftitem, String str2, String str3, byte[] bArr, long j3, p0 p0Var, k2 k2Var, TLRPC.User user, String str4, x10 x10Var2, k2 k2Var2, int i7) {
        this.a = i7;
        this.b = u0Var;
        this.c = str;
        this.d = x10Var;
        this.e = nftitem;
        this.f = str2;
        this.h = str3;
        this.n = bArr;
        this.r = j3;
        this.s = p0Var;
        this.w = k2Var;
        this.x = user;
        this.y = str4;
        this.E = x10Var2;
        this.F = k2Var2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                u0 u0Var = this.b;
                String str = this.c;
                x10 x10Var = this.d;
                n nVar = new n(u0Var, str, x10Var, this.e, this.f, this.h, this.n, this.r, this.s, this.w, this.x, this.y, this.E, this.F, 1);
                if (u0Var.S() && !u0Var.R()) {
                    u0.P("send " + str + ": asking passcode");
                    org.telegram.ui.ActionBar.h2 T = LaunchActivity.T();
                    if (T != null) {
                        org.telegram.ui.ActionBar.f2 f2Var = new org.telegram.ui.ActionBar.f2();
                        f2Var.a = true;
                        boolean[] zArr = {false};
                        f0 f0Var = new f0(zArr, x10Var);
                        f0Var.W = new b31(25, zArr, nVar);
                        T.showAsSheet(f0Var, f2Var);
                        break;
                    } else {
                        x10Var.a("PASSCODE_FAILED");
                        break;
                    }
                } else {
                    nVar.run();
                    break;
                }
                break;
            default:
                StringBuilder sb2 = new StringBuilder("send ");
                final String str2 = this.c;
                sb2.append(str2);
                sb2.append(": ready, get secret phrase");
                u0.P(sb2.toString());
                final u0 u0Var2 = this.b;
                final x10 x10Var2 = this.d;
                final TL_wallet.nftItem nftitem = this.e;
                final String str3 = this.f;
                final String str4 = this.h;
                final byte[] bArr = this.n;
                final long j3 = this.r;
                final p0 p0Var = this.s;
                final k2 k2Var = this.w;
                final TLRPC.User user = this.x;
                final String str5 = this.y;
                final x10 x10Var3 = this.E;
                final k2 k2Var2 = this.F;
                u0Var2.F(false, true, true, new q10() { // from class: org.telegram.ui.Wallet.t
                    @Override // org.telegram.messenger.q10
                    public final void a(Object obj, Object obj2) {
                        u0 u0Var3;
                        TL_wallet.nftItem nftitem2;
                        TLRPC.User user2;
                        long j10;
                        long j11;
                        fj fjVar;
                        k2 k2Var3;
                        TL_wallet.nftItem nftitem3;
                        r0 r0Var = (r0) obj;
                        String str6 = (String) obj2;
                        u0 u0Var4 = u0.this;
                        int i7 = u0Var4.a;
                        x10 x10Var4 = x10Var2;
                        if (str6 != null) {
                            x10Var4.a(str6);
                            return;
                        }
                        if (r0Var == null) {
                            x10Var4.a("NULL_ERROR");
                            return;
                        }
                        if (u0Var4.b == null) {
                            x10Var4.a("NULL_ENGINE");
                            return;
                        }
                        TL_wallet.nftItem nftitem4 = nftitem;
                        if (nftitem4 != null) {
                            if (!u0.c(str3, u0Var4.y())) {
                                x10Var4.a("WALLET_CHANGED");
                                return;
                            }
                        }
                        t0 H = u0Var4.H();
                        TL_wallet.walletTransaction wallettransaction = new TL_wallet.walletTransaction();
                        wallettransaction.incoming = false;
                        wallettransaction.pending = true;
                        String str7 = str4;
                        wallettransaction.comment = str7;
                        wallettransaction.comment_encrypted = false;
                        byte[] bArr2 = bArr;
                        wallettransaction.comment_encrypted_preparing = (nftitem4 != null || bArr2 == null || TextUtils.isEmpty(str7)) ? false : true;
                        wallettransaction.date = ConnectionsManager.getInstance(i7).getCurrentTime();
                        long j12 = j3;
                        wallettransaction.amount = j12;
                        wallettransaction.nft = nftitem4;
                        p0 p0Var2 = p0Var;
                        k2 k2Var4 = k2Var;
                        TLRPC.User user3 = user;
                        String str8 = str2;
                        if (p0Var2 == null || p0Var2.h == null) {
                            u0Var3 = u0Var4;
                            nftitem2 = nftitem4;
                            if (k2Var4 == null || nftitem2 == null) {
                                wallettransaction.peer = u0.i(user3, str8, str5);
                            } else {
                                TL_wallet.walletTransactionPeerTelegramGift wallettransactionpeertelegramgift = new TL_wallet.walletTransactionPeerTelegramGift();
                                wallettransactionpeertelegramgift.own_profile = user3 != null && user3.id == j10.i(i7).e();
                                wallettransaction.peer = wallettransactionpeertelegramgift;
                            }
                        } else {
                            TL_wallet.walletTransactionPeerOnchainGift wallettransactionpeeronchaingift = new TL_wallet.walletTransactionPeerOnchainGift();
                            TL_wallet.WalletOnchainGiftAction walletOnchainGiftAction = p0Var2.h;
                            wallettransactionpeeronchaingift.action = walletOnchainGiftAction;
                            wallettransactionpeeronchaingift.address = f3.a(walletOnchainGiftAction);
                            wallettransaction.peer = wallettransactionpeeronchaingift;
                            TL_stars.StarGift starGift = p0Var2.i;
                            if (starGift instanceof TL_stars.TL_starGiftUnique) {
                                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) starGift;
                                ArrayList arrayList = u0Var4.B().b;
                                u0Var3 = u0Var4;
                                int size = arrayList.size();
                                nftitem2 = nftitem4;
                                int i10 = 0;
                                while (true) {
                                    if (i10 < size) {
                                        Object obj3 = arrayList.get(i10);
                                        int i11 = i10 + 1;
                                        int i12 = size;
                                        TL_wallet.nftItem nftitem5 = (TL_wallet.nftItem) obj3;
                                        if ((nftitem5.gift instanceof TL_stars.TL_starGiftUnique) && u0.c(nftitem5.address, tL_starGiftUnique.gift_address)) {
                                            nftitem3 = nftitem5;
                                            break;
                                        } else {
                                            size = i12;
                                            i10 = i11;
                                        }
                                    } else {
                                        nftitem3 = new TL_wallet.nftItem();
                                        String str9 = tL_starGiftUnique.gift_address;
                                        if (str9 == null) {
                                            str9 = "";
                                        }
                                        nftitem3.address = str9;
                                        nftitem3.owner_address = "";
                                        nftitem3.index = "";
                                        nftitem3.name = tL_starGiftUnique.title + " #" + tL_starGiftUnique.num;
                                        nftitem3.gift = tL_starGiftUnique;
                                    }
                                }
                            } else {
                                u0Var3 = u0Var4;
                                nftitem2 = nftitem4;
                                nftitem3 = null;
                            }
                            wallettransaction.nft = nftitem3;
                            TL_wallet.WalletOnchainGiftAction walletOnchainGiftAction2 = wallettransactionpeeronchaingift.action;
                            wallettransaction.amount = ((walletOnchainGiftAction2 instanceof TL_wallet.walletOnchainGiftActionOfferAccept) || (walletOnchainGiftAction2 instanceof TL_wallet.walletOnchainGiftActionOfferCancel)) ? 0L : -Math.abs(j12);
                        }
                        u0 u0Var5 = u0Var3;
                        TL_wallet.nftItem nftitem6 = nftitem2;
                        v7 v7Var = new v7(u0Var5, wallettransaction, nftitem6, H, 4);
                        long nextLong = Utilities.b.nextLong();
                        wallettransaction.random_id = nextLong;
                        u0Var5.p.add(0, wallettransaction);
                        if (nftitem6 != null) {
                            l0 B = u0Var5.B();
                            B.c.add(wallettransaction);
                            B.j();
                            B.h();
                        }
                        H.k();
                        H.i();
                        u0Var5.a0();
                        zy C = zy.C(i7);
                        if (user3 == null || user3.id == j10.i(i7).e() || nftitem6 != null) {
                            user2 = user3;
                            j10 = nextLong;
                            j11 = j12;
                            fjVar = null;
                        } else {
                            user2 = user3;
                            j10 = nextLong;
                            j11 = j12;
                            fjVar = C.q(user2, str8, j11, wallettransaction.comment, wallettransaction.comment_encrypted, wallettransaction.comment_encrypted_preparing, j10);
                        }
                        wallettransaction.localMessageId = fjVar == null ? 0 : fjVar.e1();
                        x10 x10Var5 = x10Var3;
                        if (x10Var5 != null) {
                            x10Var5.a(wallettransaction);
                        }
                        String str10 = null;
                        x10Var4.a(null);
                        TL_update.TL_updateWalletGaslessInfo tL_updateWalletGaslessInfo = u0Var5.f;
                        if (tL_updateWalletGaslessInfo != null && !TextUtils.isEmpty(tL_updateWalletGaslessInfo.relayer_address)) {
                            TL_update.TL_updateWalletGaslessInfo tL_updateWalletGaslessInfo2 = u0Var5.f;
                            if (tL_updateWalletGaslessInfo2.available) {
                                str10 = tL_updateWalletGaslessInfo2.relayer_address;
                            }
                        }
                        u0.P("prepare sending");
                        long j13 = j10;
                        final a0 a0Var = new a0(u0Var5, v7Var, C, fjVar, wallettransaction, str8, H, j13, user2);
                        if (k2Var4 != null && (k2Var3 = k2Var2) != null) {
                            final int i13 = 0;
                            u0Var5.b.prepareTonConnectTransferPair(r0Var, k2Var4, k2Var3, a8.p0.o(j13, "prepared:"), new q10() { // from class: org.telegram.ui.Wallet.b0
                                @Override // org.telegram.messenger.q10
                                public final void a(Object obj4, Object obj5) {
                                    TL_wallet.sendTransfer sendtransfer = (TL_wallet.sendTransfer) obj4;
                                    String str11 = (String) obj5;
                                    switch (i13) {
                                        case 0:
                                            a0Var.a(sendtransfer, null, str11);
                                            break;
                                        case 1:
                                            a0Var.a(sendtransfer, null, str11);
                                            break;
                                        default:
                                            a0Var.a(sendtransfer, null, str11);
                                            break;
                                    }
                                }
                            });
                            return;
                        }
                        String str11 = str10;
                        if (k2Var4 != null) {
                            final int i14 = 1;
                            u0Var5.b.prepareTonConnectTransfer(r0Var, k2Var4, a8.p0.o(j13, "deposit:"), new q10() { // from class: org.telegram.ui.Wallet.b0
                                @Override // org.telegram.messenger.q10
                                public final void a(Object obj4, Object obj5) {
                                    TL_wallet.sendTransfer sendtransfer = (TL_wallet.sendTransfer) obj4;
                                    String str112 = (String) obj5;
                                    switch (i14) {
                                        case 0:
                                            a0Var.a(sendtransfer, null, str112);
                                            break;
                                        case 1:
                                            a0Var.a(sendtransfer, null, str112);
                                            break;
                                        default:
                                            a0Var.a(sendtransfer, null, str112);
                                            break;
                                    }
                                }
                            });
                        } else if (nftitem6 == null) {
                            u0Var5.b.prepareSend(r0Var, str8, j11, str7, bArr2, str11, a0Var);
                        } else {
                            final int i15 = 2;
                            u0Var5.b.prepareSendNFT(r0Var, str8, nftitem6.address, str7, new q10() { // from class: org.telegram.ui.Wallet.b0
                                @Override // org.telegram.messenger.q10
                                public final void a(Object obj4, Object obj5) {
                                    TL_wallet.sendTransfer sendtransfer = (TL_wallet.sendTransfer) obj4;
                                    String str112 = (String) obj5;
                                    switch (i15) {
                                        case 0:
                                            a0Var.a(sendtransfer, null, str112);
                                            break;
                                        case 1:
                                            a0Var.a(sendtransfer, null, str112);
                                            break;
                                        default:
                                            a0Var.a(sendtransfer, null, str112);
                                            break;
                                    }
                                }
                            });
                        }
                    }
                });
                break;
        }
    }
}
