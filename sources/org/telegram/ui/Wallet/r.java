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
import org.telegram.ui.m71;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes4.dex */
public final /* synthetic */ class r implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ m0 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ Utilities.Callback d;
    public final /* synthetic */ TL_wallet.nftItem e;
    public final /* synthetic */ String f;
    public final /* synthetic */ String h;
    public final /* synthetic */ byte[] n;
    public final /* synthetic */ long r;
    public final /* synthetic */ TLRPC.User s;
    public final /* synthetic */ String v;
    public final /* synthetic */ Utilities.Callback w;
    public final /* synthetic */ e2 x;

    public /* synthetic */ r(m0 m0Var, String str, Utilities.Callback callback, TL_wallet.nftItem nftitem, String str2, String str3, byte[] bArr, long j10, TLRPC.User user, String str4, Utilities.Callback callback2, e2 e2Var, int i10) {
        this.a = i10;
        this.b = m0Var;
        this.c = str;
        this.d = callback;
        this.e = nftitem;
        this.f = str2;
        this.h = str3;
        this.n = bArr;
        this.r = j10;
        this.s = user;
        this.v = str4;
        this.w = callback2;
        this.x = e2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                m0 m0Var = this.b;
                String str = this.c;
                Utilities.Callback callback = this.d;
                r rVar = new r(m0Var, str, callback, this.e, this.f, this.h, this.n, this.r, this.s, this.v, this.w, this.x, 1);
                if (m0Var.I() && !m0Var.H()) {
                    m0.F("send " + str + ": asking passcode");
                    org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                    if (U != null) {
                        org.telegram.ui.ActionBar.l2 l2Var = new org.telegram.ui.ActionBar.l2();
                        l2Var.a = true;
                        boolean[] zArr = {false};
                        z zVar = new z(zArr, callback);
                        zVar.V = new m71(25, zArr, rVar);
                        U.showAsSheet(zVar, l2Var);
                        break;
                    }
                } else {
                    rVar.run();
                    break;
                }
                break;
            default:
                StringBuilder sb2 = new StringBuilder("send ");
                final String str2 = this.c;
                sb2.append(str2);
                sb2.append(": ready, get secret phrase");
                m0.F(sb2.toString());
                final m0 m0Var2 = this.b;
                final Utilities.Callback callback2 = this.d;
                final TL_wallet.nftItem nftitem = this.e;
                final String str3 = this.f;
                final String str4 = this.h;
                final byte[] bArr = this.n;
                final long j10 = this.r;
                final TLRPC.User user = this.s;
                final String str5 = this.v;
                final Utilities.Callback callback3 = this.w;
                final e2 e2Var = this.x;
                m0Var2.y(new Utilities.Callback2() { // from class: org.telegram.ui.Wallet.s
                    /* JADX WARN: Removed duplicated region for block: B:50:0x0130  */
                    /* JADX WARN: Removed duplicated region for block: B:52:0x0144  */
                    @Override // org.telegram.messenger.Utilities.Callback2
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final void run(Object obj, Object obj2) {
                        long j11;
                        MessageObject messageObject;
                        String str6;
                        e2 e2Var2;
                        j0 j0Var = (j0) obj;
                        String str7 = (String) obj2;
                        m0 m0Var3 = m0.this;
                        int i10 = m0Var3.a;
                        Utilities.Callback callback4 = callback2;
                        if (str7 != null) {
                            callback4.run(str7);
                            return;
                        }
                        if (j0Var == null) {
                            callback4.run("NULL_ERROR");
                            return;
                        }
                        if (m0Var3.b == null) {
                            callback4.run("NULL_ENGINE");
                            return;
                        }
                        TL_wallet.nftItem nftitem2 = nftitem;
                        if (nftitem2 != null) {
                            if (!m0.a(str3, m0Var3.s())) {
                                callback4.run("WALLET_CHANGED");
                                return;
                            }
                        }
                        l0 A = m0Var3.A();
                        TL_wallet.walletTransaction wallettransaction = new TL_wallet.walletTransaction();
                        wallettransaction.incoming = false;
                        wallettransaction.pending = true;
                        String str8 = str4;
                        wallettransaction.comment = str8;
                        wallettransaction.comment_encrypted = false;
                        byte[] bArr2 = bArr;
                        wallettransaction.comment_encrypted_preparing = (nftitem2 != null || bArr2 == null || TextUtils.isEmpty(str8)) ? false : true;
                        wallettransaction.date = ConnectionsManager.getInstance(i10).getCurrentTime();
                        long j12 = j10;
                        wallettransaction.amount = j12;
                        wallettransaction.nft = nftitem2;
                        TLRPC.User user2 = user;
                        String str9 = str2;
                        wallettransaction.peer = m0.f(user2, str9, str5);
                        c7 c7Var = new c7(m0Var3, wallettransaction, nftitem2, A, 3);
                        long nextLong = Utilities.random.nextLong();
                        wallettransaction.random_id = nextLong;
                        m0Var3.p.add(0, wallettransaction);
                        if (nftitem2 != null) {
                            if (m0Var3.o == null) {
                                m0Var3.o = new e0(m0Var3);
                            }
                            e0 e0Var = m0Var3.o;
                            e0Var.c.add(wallettransaction);
                            e0Var.h();
                            e0Var.g();
                        }
                        A.j();
                        A.h();
                        m0Var3.Q();
                        SendMessagesHelper sendMessagesHelper = SendMessagesHelper.getInstance(i10);
                        if (user2 == null || user2.id == UserConfig.getInstance(i10).getClientUserId() || nftitem2 != null) {
                            j11 = j12;
                            messageObject = null;
                        } else {
                            j11 = j12;
                            messageObject = sendMessagesHelper.createSendingGramTransfer(user2, str9, j11, wallettransaction.comment, wallettransaction.comment_encrypted, wallettransaction.comment_encrypted_preparing, nextLong);
                        }
                        wallettransaction.localMessageId = messageObject == null ? 0 : messageObject.getId();
                        Utilities.Callback callback5 = callback3;
                        if (callback5 != null) {
                            callback5.run(wallettransaction);
                        }
                        callback4.run(null);
                        TL_update.TL_updateWalletGaslessInfo tL_updateWalletGaslessInfo = m0Var3.f;
                        if (tL_updateWalletGaslessInfo != null && !TextUtils.isEmpty(tL_updateWalletGaslessInfo.relayer_address)) {
                            TL_update.TL_updateWalletGaslessInfo tL_updateWalletGaslessInfo2 = m0Var3.f;
                            if (tL_updateWalletGaslessInfo2.available) {
                                str6 = tL_updateWalletGaslessInfo2.relayer_address;
                                m0.F("prepare sending");
                                final t tVar = new t(m0Var3, c7Var, sendMessagesHelper, messageObject, wallettransaction, str9, A, nextLong, user2);
                                e2Var2 = e2Var;
                                if (e2Var2 == null) {
                                    final int i11 = 0;
                                    m0Var3.b.prepareTonConnectTransfer(j0Var, e2Var2, a1.g.o(nextLong, "deposit:"), new Utilities.Callback2() { // from class: org.telegram.ui.Wallet.u
                                        @Override // org.telegram.messenger.Utilities.Callback2
                                        public final void run(Object obj3, Object obj4) {
                                            TL_wallet.sendTransfer sendtransfer = (TL_wallet.sendTransfer) obj3;
                                            String str10 = (String) obj4;
                                            switch (i11) {
                                                case 0:
                                                    tVar.run(sendtransfer, null, str10);
                                                    break;
                                                default:
                                                    tVar.run(sendtransfer, null, str10);
                                                    break;
                                            }
                                        }
                                    });
                                    return;
                                } else if (nftitem2 == null) {
                                    m0Var3.b.prepareSend(j0Var, str9, j11, str8, bArr2, str6, tVar);
                                    return;
                                } else {
                                    final int i12 = 1;
                                    m0Var3.b.prepareSendNFT(j0Var, str9, nftitem2.address, str8, new Utilities.Callback2() { // from class: org.telegram.ui.Wallet.u
                                        @Override // org.telegram.messenger.Utilities.Callback2
                                        public final void run(Object obj3, Object obj4) {
                                            TL_wallet.sendTransfer sendtransfer = (TL_wallet.sendTransfer) obj3;
                                            String str10 = (String) obj4;
                                            switch (i12) {
                                                case 0:
                                                    tVar.run(sendtransfer, null, str10);
                                                    break;
                                                default:
                                                    tVar.run(sendtransfer, null, str10);
                                                    break;
                                            }
                                        }
                                    });
                                    return;
                                }
                            }
                        }
                        str6 = null;
                        m0.F("prepare sending");
                        final t tVar2 = new t(m0Var3, c7Var, sendMessagesHelper, messageObject, wallettransaction, str9, A, nextLong, user2);
                        e2Var2 = e2Var;
                        if (e2Var2 == null) {
                        }
                    }
                }, false, true);
                break;
        }
    }
}
