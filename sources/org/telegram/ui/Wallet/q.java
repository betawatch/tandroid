package org.telegram.ui.Wallet;

import android.text.TextUtils;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.zc1;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final /* synthetic */ class q implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ l0 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ Utilities.Callback d;
    public final /* synthetic */ TL_wallet.nftItem e;
    public final /* synthetic */ String f;
    public final /* synthetic */ String h;
    public final /* synthetic */ byte[] n;
    public final /* synthetic */ long r;
    public final /* synthetic */ d2 s;
    public final /* synthetic */ TLRPC.User v;
    public final /* synthetic */ String w;
    public final /* synthetic */ Utilities.Callback x;

    public /* synthetic */ q(l0 l0Var, String str, Utilities.Callback callback, TL_wallet.nftItem nftitem, String str2, String str3, byte[] bArr, long j10, d2 d2Var, TLRPC.User user, String str4, Utilities.Callback callback2, int i10) {
        this.a = i10;
        this.b = l0Var;
        this.c = str;
        this.d = callback;
        this.e = nftitem;
        this.f = str2;
        this.h = str3;
        this.n = bArr;
        this.r = j10;
        this.s = d2Var;
        this.v = user;
        this.w = str4;
        this.x = callback2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                l0 l0Var = this.b;
                String str = this.c;
                Utilities.Callback callback = this.d;
                q qVar = new q(l0Var, str, callback, this.e, this.f, this.h, this.n, this.r, this.s, this.v, this.w, this.x, 1);
                if (l0Var.I() && !l0Var.H()) {
                    l0.F("send " + str + ": asking passcode");
                    org.telegram.ui.ActionBar.r2 U = LaunchActivity.U();
                    if (U != null) {
                        org.telegram.ui.ActionBar.p2 p2Var = new org.telegram.ui.ActionBar.p2();
                        p2Var.a = true;
                        boolean[] zArr = {false};
                        y yVar = new y(zArr, callback);
                        yVar.V = new zc1(15, zArr, qVar);
                        U.showAsSheet(yVar, p2Var);
                        break;
                    }
                } else {
                    qVar.run();
                    break;
                }
                break;
            default:
                StringBuilder sb2 = new StringBuilder("send ");
                final String str2 = this.c;
                sb2.append(str2);
                sb2.append(": ready, get secret phrase");
                l0.F(sb2.toString());
                final l0 l0Var2 = this.b;
                final Utilities.Callback callback2 = this.d;
                final TL_wallet.nftItem nftitem = this.e;
                final String str3 = this.f;
                final String str4 = this.h;
                final byte[] bArr = this.n;
                final long j10 = this.r;
                final d2 d2Var = this.s;
                final TLRPC.User user = this.v;
                final String str5 = this.w;
                final Utilities.Callback callback3 = this.x;
                l0Var2.y(new Utilities.Callback2() { // from class: org.telegram.ui.Wallet.r
                    /* JADX WARN: Removed duplicated region for block: B:47:0x012d  */
                    /* JADX WARN: Removed duplicated region for block: B:50:0x0139  */
                    /* JADX WARN: Removed duplicated region for block: B:57:0x0154  */
                    /* JADX WARN: Removed duplicated region for block: B:60:0x0175  */
                    /* JADX WARN: Removed duplicated region for block: B:62:0x0187  */
                    /* JADX WARN: Removed duplicated region for block: B:67:0x012f  */
                    @Override // org.telegram.messenger.Utilities.Callback2
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final void run(Object obj, Object obj2) {
                        TL_wallet.nftItem nftitem2;
                        k0 k0Var;
                        TLRPC.User user2;
                        l0 l0Var3;
                        long j11;
                        long j12;
                        MessageObject messageObject;
                        Utilities.Callback callback4;
                        l0 l0Var4;
                        TL_update.TL_updateWalletGaslessInfo tL_updateWalletGaslessInfo;
                        TL_update.TL_updateWalletGaslessInfo tL_updateWalletGaslessInfo2;
                        i0 i0Var = (i0) obj;
                        String str6 = (String) obj2;
                        l0 l0Var5 = l0.this;
                        int i10 = l0Var5.a;
                        Utilities.Callback callback5 = callback2;
                        if (str6 != null) {
                            callback5.run(str6);
                            return;
                        }
                        if (i0Var == null) {
                            callback5.run("NULL_ERROR");
                            return;
                        }
                        if (l0Var5.b == null) {
                            callback5.run("NULL_ENGINE");
                            return;
                        }
                        TL_wallet.nftItem nftitem3 = nftitem;
                        if (nftitem3 != null) {
                            if (!l0.a(str3, l0Var5.s())) {
                                callback5.run("WALLET_CHANGED");
                                return;
                            }
                        }
                        k0 A = l0Var5.A();
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
                            k0Var = A;
                            wallettransaction.peer = l0.f(user3, str8, str5);
                        } else {
                            TL_wallet.walletTransactionPeerTelegramGift wallettransactionpeertelegramgift = new TL_wallet.walletTransactionPeerTelegramGift();
                            nftitem2 = nftitem3;
                            k0Var = A;
                            wallettransactionpeertelegramgift.own_profile = user3 != null && user3.id == UserConfig.getInstance(i10).getClientUserId();
                            wallettransaction.peer = wallettransactionpeertelegramgift;
                        }
                        TL_wallet.nftItem nftitem4 = nftitem2;
                        k0 k0Var2 = k0Var;
                        w6 w6Var = new w6(l0Var5, wallettransaction, nftitem4, k0Var2, 3);
                        long nextLong = Utilities.random.nextLong();
                        wallettransaction.random_id = nextLong;
                        l0Var5.p.add(0, wallettransaction);
                        if (nftitem4 != null) {
                            if (l0Var5.o == null) {
                                l0Var5.o = new d0(l0Var5);
                            }
                            d0 d0Var = l0Var5.o;
                            d0Var.c.add(wallettransaction);
                            d0Var.h();
                            d0Var.g();
                        }
                        k0Var2.k();
                        k0Var2.i();
                        l0Var5.Q();
                        SendMessagesHelper sendMessagesHelper = SendMessagesHelper.getInstance(i10);
                        if (user3 != null) {
                            l0Var3 = l0Var5;
                            if (user3.id != UserConfig.getInstance(i10).getClientUserId() && nftitem4 == null) {
                                user2 = user3;
                                j11 = nextLong;
                                j12 = j13;
                                messageObject = sendMessagesHelper.createSendingGramTransfer(user2, str8, j12, wallettransaction.comment, wallettransaction.comment_encrypted, wallettransaction.comment_encrypted_preparing, j11);
                                wallettransaction.localMessageId = messageObject != null ? 0 : messageObject.getId();
                                callback4 = callback3;
                                if (callback4 != null) {
                                    callback4.run(wallettransaction);
                                }
                                String str9 = null;
                                callback5.run(null);
                                l0Var4 = l0Var3;
                                tL_updateWalletGaslessInfo = l0Var4.f;
                                if (tL_updateWalletGaslessInfo != null && !TextUtils.isEmpty(tL_updateWalletGaslessInfo.relayer_address)) {
                                    tL_updateWalletGaslessInfo2 = l0Var4.f;
                                    if (tL_updateWalletGaslessInfo2.available) {
                                        str9 = tL_updateWalletGaslessInfo2.relayer_address;
                                    }
                                }
                                l0.F("prepare sending");
                                String str10 = str9;
                                long j14 = j11;
                                final u uVar = new u(l0Var4, w6Var, sendMessagesHelper, messageObject, wallettransaction, str8, k0Var2, j14, user2);
                                if (d2Var2 == null) {
                                    final int i11 = 0;
                                    l0Var4.b.prepareTonConnectTransfer(i0Var, d2Var2, a1.g.o(j14, "deposit:"), new Utilities.Callback2() { // from class: org.telegram.ui.Wallet.v
                                        @Override // org.telegram.messenger.Utilities.Callback2
                                        public final void run(Object obj3, Object obj4) {
                                            TL_wallet.sendTransfer sendtransfer = (TL_wallet.sendTransfer) obj3;
                                            String str11 = (String) obj4;
                                            switch (i11) {
                                                case 0:
                                                    uVar.run(sendtransfer, null, str11);
                                                    break;
                                                default:
                                                    uVar.run(sendtransfer, null, str11);
                                                    break;
                                            }
                                        }
                                    });
                                    return;
                                } else if (nftitem4 == null) {
                                    l0Var4.b.prepareSend(i0Var, str8, j12, str7, bArr2, str10, uVar);
                                    return;
                                } else {
                                    final int i12 = 1;
                                    l0Var4.b.prepareSendNFT(i0Var, str8, nftitem4.address, str7, new Utilities.Callback2() { // from class: org.telegram.ui.Wallet.v
                                        @Override // org.telegram.messenger.Utilities.Callback2
                                        public final void run(Object obj3, Object obj4) {
                                            TL_wallet.sendTransfer sendtransfer = (TL_wallet.sendTransfer) obj3;
                                            String str11 = (String) obj4;
                                            switch (i12) {
                                                case 0:
                                                    uVar.run(sendtransfer, null, str11);
                                                    break;
                                                default:
                                                    uVar.run(sendtransfer, null, str11);
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
                            l0Var3 = l0Var5;
                        }
                        j11 = nextLong;
                        j12 = j13;
                        messageObject = null;
                        wallettransaction.localMessageId = messageObject != null ? 0 : messageObject.getId();
                        callback4 = callback3;
                        if (callback4 != null) {
                        }
                        String str92 = null;
                        callback5.run(null);
                        l0Var4 = l0Var3;
                        tL_updateWalletGaslessInfo = l0Var4.f;
                        if (tL_updateWalletGaslessInfo != null) {
                            tL_updateWalletGaslessInfo2 = l0Var4.f;
                            if (tL_updateWalletGaslessInfo2.available) {
                            }
                        }
                        l0.F("prepare sending");
                        String str102 = str92;
                        long j142 = j11;
                        final u uVar2 = new u(l0Var4, w6Var, sendMessagesHelper, messageObject, wallettransaction, str8, k0Var2, j142, user2);
                        if (d2Var2 == null) {
                        }
                    }
                }, false, true);
                break;
        }
    }
}
