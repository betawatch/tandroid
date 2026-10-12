package org.telegram.ui.Wallet;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.je1;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public final /* synthetic */ class p implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ String c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object n;
    public final /* synthetic */ long r;
    public final /* synthetic */ TLObject s;
    public final /* synthetic */ Object v;
    public final /* synthetic */ Object w;

    public /* synthetic */ p(j0 j0Var, String str, Utilities.Callback callback, TL_wallet.nftItem nftitem, String str2, String str3, byte[] bArr, long j10, TLRPC.User user, String str4, Utilities.Callback callback2, int i10) {
        this.a = i10;
        this.b = j0Var;
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
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        TLObject tLObject = this.s;
        Object obj = this.n;
        Object obj2 = this.e;
        Object obj3 = this.w;
        Object obj4 = this.d;
        Object obj5 = this.v;
        Object obj6 = this.h;
        Object obj7 = this.f;
        Object obj8 = this.b;
        int i11 = 0;
        switch (i10) {
            case 0:
                j0 j0Var = (j0) obj8;
                Utilities.Callback callback = (Utilities.Callback) obj4;
                String str = this.c;
                p pVar = new p(j0Var, str, callback, (TL_wallet.nftItem) obj2, (String) obj7, (String) obj6, (byte[]) obj, this.r, (TLRPC.User) tLObject, (String) obj5, (Utilities.Callback) obj3, 1);
                if (j0Var.H() && !j0Var.G()) {
                    j0.E("send " + str + ": asking passcode");
                    org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
                    if (U != null) {
                        org.telegram.ui.ActionBar.k2 k2Var = new org.telegram.ui.ActionBar.k2();
                        k2Var.a = true;
                        boolean[] zArr = {false};
                        w wVar = new w(zArr, callback);
                        wVar.V = new je1(14, zArr, pVar);
                        U.showAsSheet(wVar, k2Var);
                        break;
                    }
                } else {
                    pVar.run();
                    break;
                }
                break;
            case 1:
                final j0 j0Var2 = (j0) obj8;
                final Utilities.Callback callback2 = (Utilities.Callback) obj4;
                final TL_wallet.nftItem nftitem = (TL_wallet.nftItem) obj2;
                final String str2 = (String) obj7;
                final String str3 = (String) obj6;
                final byte[] bArr = (byte[]) obj;
                final TLRPC.User user = (TLRPC.User) tLObject;
                final String str4 = (String) obj5;
                final Utilities.Callback callback3 = (Utilities.Callback) obj3;
                StringBuilder sb2 = new StringBuilder("send ");
                final String str5 = this.c;
                sb2.append(str5);
                sb2.append(": ready, get secret phrase");
                j0.E(sb2.toString());
                final long j10 = this.r;
                j0Var2.x(new Utilities.Callback2() { // from class: org.telegram.ui.Wallet.r
                    /* JADX WARN: Removed duplicated region for block: B:50:0x012e  */
                    /* JADX WARN: Removed duplicated region for block: B:52:0x0142  */
                    @Override // org.telegram.messenger.Utilities.Callback2
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final void run(Object obj9, Object obj10) {
                        long j11;
                        MessageObject messageObject;
                        String str6;
                        g0 g0Var = (g0) obj9;
                        String str7 = (String) obj10;
                        j0 j0Var3 = j0.this;
                        int i12 = j0Var3.a;
                        Utilities.Callback callback4 = callback2;
                        if (str7 != null) {
                            callback4.run(str7);
                            return;
                        }
                        if (g0Var == null) {
                            callback4.run("NULL_ERROR");
                            return;
                        }
                        if (j0Var3.b == null) {
                            callback4.run("NULL_ENGINE");
                            return;
                        }
                        TL_wallet.nftItem nftitem2 = nftitem;
                        if (nftitem2 != null) {
                            if (!j0.b(str2, j0Var3.r())) {
                                callback4.run("WALLET_CHANGED");
                                return;
                            }
                        }
                        i0 z10 = j0Var3.z();
                        TL_wallet.walletTransaction wallettransaction = new TL_wallet.walletTransaction();
                        wallettransaction.incoming = false;
                        wallettransaction.pending = true;
                        String str8 = str3;
                        wallettransaction.comment = str8;
                        wallettransaction.comment_encrypted = false;
                        byte[] bArr2 = bArr;
                        wallettransaction.comment_encrypted_preparing = (nftitem2 != null || bArr2 == null || TextUtils.isEmpty(str8)) ? false : true;
                        wallettransaction.date = ConnectionsManager.getInstance(i12).getCurrentTime();
                        long j12 = j10;
                        wallettransaction.amount = j12;
                        wallettransaction.nft = nftitem2;
                        TLRPC.User user2 = user;
                        String str9 = str5;
                        wallettransaction.peer = j0.g(user2, str9, str4);
                        l6 l6Var = new l6(j0Var3, wallettransaction, nftitem2, z10, 4);
                        long nextLong = Utilities.random.nextLong();
                        wallettransaction.random_id = nextLong;
                        j0Var3.p.add(0, wallettransaction);
                        if (nftitem2 != null) {
                            if (j0Var3.o == null) {
                                j0Var3.o = new b0(j0Var3);
                            }
                            b0 b0Var = j0Var3.o;
                            b0Var.c.add(wallettransaction);
                            b0Var.g();
                            b0Var.f();
                        }
                        z10.h();
                        z10.f();
                        j0Var3.P();
                        SendMessagesHelper sendMessagesHelper = SendMessagesHelper.getInstance(i12);
                        if (user2 == null || user2.id == UserConfig.getInstance(i12).getClientUserId() || nftitem2 != null) {
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
                        TL_update.TL_updateWalletGaslessInfo tL_updateWalletGaslessInfo = j0Var3.f;
                        if (tL_updateWalletGaslessInfo != null && !TextUtils.isEmpty(tL_updateWalletGaslessInfo.relayer_address)) {
                            TL_update.TL_updateWalletGaslessInfo tL_updateWalletGaslessInfo2 = j0Var3.f;
                            if (tL_updateWalletGaslessInfo2.available) {
                                str6 = tL_updateWalletGaslessInfo2.relayer_address;
                                j0.E("prepare sending");
                                s sVar = new s(j0Var3, l6Var, sendMessagesHelper, messageObject, wallettransaction, str9, z10, nextLong, user2);
                                if (nftitem2 == null) {
                                    j0Var3.b.prepareSendNFT(g0Var, str9, nftitem2.address, str8, new d(sVar, 2));
                                    return;
                                } else {
                                    j0Var3.b.prepareSend(g0Var, str9, j11, str8, bArr2, str6, sVar);
                                    return;
                                }
                            }
                        }
                        str6 = null;
                        j0.E("prepare sending");
                        s sVar2 = new s(j0Var3, l6Var, sendMessagesHelper, messageObject, wallettransaction, str9, z10, nextLong, user2);
                        if (nftitem2 == null) {
                        }
                    }
                }, false, true);
                break;
            default:
                zh.n5 n5Var = (zh.n5) obj8;
                TLObject tLObject2 = (TLObject) obj7;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj6;
                Utilities.Callback2 callback22 = (Utilities.Callback2) obj5;
                TLRPC.TL_inputInvoicePremiumGiftStars tL_inputInvoicePremiumGiftStars = (TLRPC.TL_inputInvoicePremiumGiftStars) obj4;
                Context context = (Context) obj3;
                org.telegram.ui.ActionBar.c6 c6Var = (org.telegram.ui.ActionBar.c6) obj2;
                TLObject tLObject3 = (TLObject) obj;
                TLRPC.TL_textWithEntities tL_textWithEntities = (TLRPC.TL_textWithEntities) tLObject;
                if (!(tLObject2 instanceof TLRPC.TL_payments_paymentFormStars)) {
                    zh.n5.e(tL_error == null ? "NO_PAYMENT_FORM" : tL_error.text);
                    callback22.run(Boolean.FALSE, null);
                    break;
                } else {
                    TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars = (TLRPC.TL_payments_paymentFormStars) tLObject2;
                    TL_stars.TL_payments_sendStarsForm tL_payments_sendStarsForm = new TL_stars.TL_payments_sendStarsForm();
                    tL_payments_sendStarsForm.form_id = tL_payments_paymentFormStars.form_id;
                    tL_payments_sendStarsForm.invoice = tL_inputInvoicePremiumGiftStars;
                    ArrayList<TLRPC.TL_labeledPrice> arrayList = tL_payments_paymentFormStars.invoice.prices;
                    int size = arrayList.size();
                    long j11 = 0;
                    while (i11 < size) {
                        TLRPC.TL_labeledPrice tL_labeledPrice = arrayList.get(i11);
                        i11++;
                        j11 += tL_labeledPrice.amount;
                    }
                    ConnectionsManager.getInstance(n5Var.a).sendRequest(tL_payments_sendStarsForm, new zh.k4(n5Var, callback22, context, c6Var, j11, this.c, this.r, tLObject3, tL_textWithEntities));
                    break;
                }
        }
    }

    public /* synthetic */ p(zh.n5 n5Var, TLObject tLObject, TLRPC.TL_error tL_error, Utilities.Callback2 callback2, TLRPC.TL_inputInvoicePremiumGiftStars tL_inputInvoicePremiumGiftStars, Context context, org.telegram.ui.ActionBar.c6 c6Var, String str, long j10, TLObject tLObject2, TLRPC.TL_textWithEntities tL_textWithEntities) {
        this.a = 2;
        this.b = n5Var;
        this.f = tLObject;
        this.h = tL_error;
        this.v = callback2;
        this.d = tL_inputInvoicePremiumGiftStars;
        this.w = context;
        this.e = c6Var;
        this.c = str;
        this.r = j10;
        this.n = tLObject2;
        this.s = tL_textWithEntities;
    }
}
