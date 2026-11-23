package org.telegram.ui.Wallet;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.fj;
import org.telegram.messenger.i10;
import org.telegram.messenger.p10;
import org.telegram.messenger.w10;
import org.telegram.messenger.zy;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final /* synthetic */ class n implements Runnable {
    public final /* synthetic */ w10 E;
    public final /* synthetic */ l2 F;
    public final /* synthetic */ int a;
    public final /* synthetic */ v0 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ w10 d;
    public final /* synthetic */ TL_wallet.nftItem e;
    public final /* synthetic */ String f;
    public final /* synthetic */ String h;
    public final /* synthetic */ byte[] n;
    public final /* synthetic */ long r;
    public final /* synthetic */ q0 s;
    public final /* synthetic */ l2 w;
    public final /* synthetic */ TLRPC.User x;
    public final /* synthetic */ String y;

    public /* synthetic */ n(v0 v0Var, String str, w10 w10Var, TL_wallet.nftItem nftitem, String str2, String str3, byte[] bArr, long j3, q0 q0Var, l2 l2Var, TLRPC.User user, String str4, w10 w10Var2, l2 l2Var2, int i7) {
        this.a = i7;
        this.b = v0Var;
        this.c = str;
        this.d = w10Var;
        this.e = nftitem;
        this.f = str2;
        this.h = str3;
        this.n = bArr;
        this.r = j3;
        this.s = q0Var;
        this.w = l2Var;
        this.x = user;
        this.y = str4;
        this.E = w10Var2;
        this.F = l2Var2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                v0 v0Var = this.b;
                String str = this.c;
                w10 w10Var = this.d;
                n nVar = new n(v0Var, str, w10Var, this.e, this.f, this.h, this.n, this.r, this.s, this.w, this.x, this.y, this.E, this.F, 1);
                if (v0Var.S() && !v0Var.R()) {
                    v0.P("send " + str + ": asking passcode");
                    org.telegram.ui.ActionBar.g2 T = LaunchActivity.T();
                    if (T != null) {
                        org.telegram.ui.ActionBar.e2 e2Var = new org.telegram.ui.ActionBar.e2();
                        e2Var.a = true;
                        boolean[] zArr = {false};
                        g0 g0Var = new g0(zArr, w10Var);
                        g0Var.W = new r(1, zArr, nVar);
                        T.showAsSheet(g0Var, e2Var);
                        break;
                    } else {
                        w10Var.a("PASSCODE_FAILED");
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
                v0.P(sb2.toString());
                final v0 v0Var2 = this.b;
                final w10 w10Var2 = this.d;
                final TL_wallet.nftItem nftitem = this.e;
                final String str3 = this.f;
                final String str4 = this.h;
                final byte[] bArr = this.n;
                final long j3 = this.r;
                final q0 q0Var = this.s;
                final l2 l2Var = this.w;
                final TLRPC.User user = this.x;
                final String str5 = this.y;
                final w10 w10Var3 = this.E;
                final l2 l2Var2 = this.F;
                v0Var2.F(false, true, true, new p10() { // from class: org.telegram.ui.Wallet.u
                    @Override // org.telegram.messenger.p10
                    public final void a(Object obj, Object obj2) {
                        v0 v0Var3;
                        TL_wallet.nftItem nftitem2;
                        TLRPC.User user2;
                        long j10;
                        long j11;
                        fj fjVar;
                        l2 l2Var3;
                        TL_wallet.nftItem nftitem3;
                        s0 s0Var = (s0) obj;
                        String str6 = (String) obj2;
                        v0 v0Var4 = v0.this;
                        int i7 = v0Var4.a;
                        w10 w10Var4 = w10Var2;
                        if (str6 != null) {
                            w10Var4.a(str6);
                            return;
                        }
                        if (s0Var == null) {
                            w10Var4.a("NULL_ERROR");
                            return;
                        }
                        if (v0Var4.b == null) {
                            w10Var4.a("NULL_ENGINE");
                            return;
                        }
                        TL_wallet.nftItem nftitem4 = nftitem;
                        if (nftitem4 != null) {
                            if (!v0.c(str3, v0Var4.y())) {
                                w10Var4.a("WALLET_CHANGED");
                                return;
                            }
                        }
                        u0 H = v0Var4.H();
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
                        q0 q0Var2 = q0Var;
                        l2 l2Var4 = l2Var;
                        TLRPC.User user3 = user;
                        String str8 = str2;
                        if (q0Var2 == null || q0Var2.h == null) {
                            v0Var3 = v0Var4;
                            nftitem2 = nftitem4;
                            if (l2Var4 == null || nftitem2 == null) {
                                wallettransaction.peer = v0.i(user3, str8, str5);
                            } else {
                                TL_wallet.walletTransactionPeerTelegramGift wallettransactionpeertelegramgift = new TL_wallet.walletTransactionPeerTelegramGift();
                                wallettransactionpeertelegramgift.own_profile = user3 != null && user3.id == i10.i(i7).e();
                                wallettransaction.peer = wallettransactionpeertelegramgift;
                            }
                        } else {
                            TL_wallet.walletTransactionPeerOnchainGift wallettransactionpeeronchaingift = new TL_wallet.walletTransactionPeerOnchainGift();
                            TL_wallet.WalletOnchainGiftAction walletOnchainGiftAction = q0Var2.h;
                            wallettransactionpeeronchaingift.action = walletOnchainGiftAction;
                            wallettransactionpeeronchaingift.address = g3.a(walletOnchainGiftAction);
                            wallettransaction.peer = wallettransactionpeeronchaingift;
                            TL_stars.StarGift starGift = q0Var2.i;
                            if (starGift instanceof TL_stars.TL_starGiftUnique) {
                                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) starGift;
                                ArrayList arrayList = v0Var4.B().b;
                                v0Var3 = v0Var4;
                                int size = arrayList.size();
                                nftitem2 = nftitem4;
                                int i10 = 0;
                                while (true) {
                                    if (i10 < size) {
                                        Object obj3 = arrayList.get(i10);
                                        int i11 = i10 + 1;
                                        int i12 = size;
                                        TL_wallet.nftItem nftitem5 = (TL_wallet.nftItem) obj3;
                                        if ((nftitem5.gift instanceof TL_stars.TL_starGiftUnique) && v0.c(nftitem5.address, tL_starGiftUnique.gift_address)) {
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
                                v0Var3 = v0Var4;
                                nftitem2 = nftitem4;
                                nftitem3 = null;
                            }
                            wallettransaction.nft = nftitem3;
                            TL_wallet.WalletOnchainGiftAction walletOnchainGiftAction2 = wallettransactionpeeronchaingift.action;
                            wallettransaction.amount = ((walletOnchainGiftAction2 instanceof TL_wallet.walletOnchainGiftActionOfferAccept) || (walletOnchainGiftAction2 instanceof TL_wallet.walletOnchainGiftActionOfferCancel)) ? 0L : -Math.abs(j12);
                        }
                        v0 v0Var5 = v0Var3;
                        TL_wallet.nftItem nftitem6 = nftitem2;
                        w7 w7Var = new w7(v0Var5, wallettransaction, nftitem6, H, 4);
                        long nextLong = Utilities.b.nextLong();
                        wallettransaction.random_id = nextLong;
                        v0Var5.p.add(0, wallettransaction);
                        if (nftitem6 != null) {
                            m0 B = v0Var5.B();
                            B.c.add(wallettransaction);
                            B.j();
                            B.h();
                        }
                        H.k();
                        H.i();
                        v0Var5.a0();
                        zy C = zy.C(i7);
                        if (user3 == null || user3.id == i10.i(i7).e() || nftitem6 != null) {
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
                        w10 w10Var5 = w10Var3;
                        if (w10Var5 != null) {
                            w10Var5.a(wallettransaction);
                        }
                        String str10 = null;
                        w10Var4.a(null);
                        TL_update.TL_updateWalletGaslessInfo tL_updateWalletGaslessInfo = v0Var5.f;
                        if (tL_updateWalletGaslessInfo != null && !TextUtils.isEmpty(tL_updateWalletGaslessInfo.relayer_address)) {
                            TL_update.TL_updateWalletGaslessInfo tL_updateWalletGaslessInfo2 = v0Var5.f;
                            if (tL_updateWalletGaslessInfo2.available) {
                                str10 = tL_updateWalletGaslessInfo2.relayer_address;
                            }
                        }
                        v0.P("prepare sending");
                        long j13 = j10;
                        final b0 b0Var = new b0(v0Var5, w7Var, C, fjVar, wallettransaction, str8, H, j13, user2);
                        if (l2Var4 != null && (l2Var3 = l2Var2) != null) {
                            final int i13 = 0;
                            v0Var5.b.prepareTonConnectTransferPair(s0Var, l2Var4, l2Var3, a8.p0.o(j13, "prepared:"), new p10() { // from class: org.telegram.ui.Wallet.c0
                                @Override // org.telegram.messenger.p10
                                public final void a(Object obj4, Object obj5) {
                                    TL_wallet.sendTransfer sendtransfer = (TL_wallet.sendTransfer) obj4;
                                    String str11 = (String) obj5;
                                    switch (i13) {
                                        case 0:
                                            b0Var.a(sendtransfer, null, str11);
                                            break;
                                        case 1:
                                            b0Var.a(sendtransfer, null, str11);
                                            break;
                                        default:
                                            b0Var.a(sendtransfer, null, str11);
                                            break;
                                    }
                                }
                            });
                            return;
                        }
                        String str11 = str10;
                        if (l2Var4 != null) {
                            final int i14 = 1;
                            v0Var5.b.prepareTonConnectTransfer(s0Var, l2Var4, a8.p0.o(j13, "deposit:"), new p10() { // from class: org.telegram.ui.Wallet.c0
                                @Override // org.telegram.messenger.p10
                                public final void a(Object obj4, Object obj5) {
                                    TL_wallet.sendTransfer sendtransfer = (TL_wallet.sendTransfer) obj4;
                                    String str112 = (String) obj5;
                                    switch (i14) {
                                        case 0:
                                            b0Var.a(sendtransfer, null, str112);
                                            break;
                                        case 1:
                                            b0Var.a(sendtransfer, null, str112);
                                            break;
                                        default:
                                            b0Var.a(sendtransfer, null, str112);
                                            break;
                                    }
                                }
                            });
                        } else if (nftitem6 == null) {
                            v0Var5.b.prepareSend(s0Var, str8, j11, str7, bArr2, str11, b0Var);
                        } else {
                            final int i15 = 2;
                            v0Var5.b.prepareSendNFT(s0Var, str8, nftitem6.address, str7, new p10() { // from class: org.telegram.ui.Wallet.c0
                                @Override // org.telegram.messenger.p10
                                public final void a(Object obj4, Object obj5) {
                                    TL_wallet.sendTransfer sendtransfer = (TL_wallet.sendTransfer) obj4;
                                    String str112 = (String) obj5;
                                    switch (i15) {
                                        case 0:
                                            b0Var.a(sendtransfer, null, str112);
                                            break;
                                        case 1:
                                            b0Var.a(sendtransfer, null, str112);
                                            break;
                                        default:
                                            b0Var.a(sendtransfer, null, str112);
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
