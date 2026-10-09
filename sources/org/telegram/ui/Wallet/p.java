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
import org.telegram.ui.ii1;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
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

    public /* synthetic */ p(k0 k0Var, String str, Utilities.Callback callback, TL_wallet.nftItem nftitem, String str2, String str3, byte[] bArr, long j3, TLRPC.User user, String str4, Utilities.Callback callback2, int i10) {
        this.a = i10;
        this.b = k0Var;
        this.c = str;
        this.d = callback;
        this.e = nftitem;
        this.f = str2;
        this.h = str3;
        this.n = bArr;
        this.r = j3;
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
                k0 k0Var = (k0) obj8;
                Utilities.Callback callback = (Utilities.Callback) obj4;
                String str = this.c;
                p pVar = new p(k0Var, str, callback, (TL_wallet.nftItem) obj2, (String) obj7, (String) obj6, (byte[]) obj, this.r, (TLRPC.User) tLObject, (String) obj5, (Utilities.Callback) obj3, 1);
                if (k0Var.H() && !k0Var.G()) {
                    k0.E("send " + str + ": asking passcode");
                    org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                    if (U != null) {
                        org.telegram.ui.ActionBar.l2 l2Var = new org.telegram.ui.ActionBar.l2();
                        l2Var.a = true;
                        boolean[] zArr = {false};
                        x xVar = new x(zArr, callback);
                        xVar.V = new ii1(3, zArr, pVar);
                        U.showAsSheet(xVar, l2Var);
                        break;
                    }
                } else {
                    pVar.run();
                    break;
                }
                break;
            case 1:
                final k0 k0Var2 = (k0) obj8;
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
                k0.E(sb2.toString());
                final long j3 = this.r;
                k0Var2.x(new Utilities.Callback2() { // from class: org.telegram.ui.Wallet.s
                    /* JADX WARN: Removed duplicated region for block: B:50:0x012e  */
                    /* JADX WARN: Removed duplicated region for block: B:52:0x0142  */
                    @Override // org.telegram.messenger.Utilities.Callback2
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final void run(Object obj9, Object obj10) {
                        long j10;
                        MessageObject messageObject;
                        String str6;
                        h0 h0Var = (h0) obj9;
                        String str7 = (String) obj10;
                        k0 k0Var3 = k0.this;
                        int i12 = k0Var3.a;
                        Utilities.Callback callback4 = callback2;
                        if (str7 != null) {
                            callback4.run(str7);
                            return;
                        }
                        if (h0Var == null) {
                            callback4.run("NULL_ERROR");
                            return;
                        }
                        if (k0Var3.b == null) {
                            callback4.run("NULL_ENGINE");
                            return;
                        }
                        TL_wallet.nftItem nftitem2 = nftitem;
                        if (nftitem2 != null) {
                            if (!k0.b(str2, k0Var3.r())) {
                                callback4.run("WALLET_CHANGED");
                                return;
                            }
                        }
                        j0 z10 = k0Var3.z();
                        TL_wallet.walletTransaction wallettransaction = new TL_wallet.walletTransaction();
                        wallettransaction.incoming = false;
                        wallettransaction.pending = true;
                        String str8 = str3;
                        wallettransaction.comment = str8;
                        wallettransaction.comment_encrypted = false;
                        byte[] bArr2 = bArr;
                        wallettransaction.comment_encrypted_preparing = (nftitem2 != null || bArr2 == null || TextUtils.isEmpty(str8)) ? false : true;
                        wallettransaction.date = ConnectionsManager.getInstance(i12).getCurrentTime();
                        long j11 = j3;
                        wallettransaction.amount = j11;
                        wallettransaction.nft = nftitem2;
                        TLRPC.User user2 = user;
                        String str9 = str5;
                        wallettransaction.peer = k0.g(user2, str9, str4);
                        m6 m6Var = new m6(k0Var3, wallettransaction, nftitem2, z10, 4);
                        long nextLong = Utilities.random.nextLong();
                        wallettransaction.random_id = nextLong;
                        k0Var3.p.add(0, wallettransaction);
                        if (nftitem2 != null) {
                            if (k0Var3.o == null) {
                                k0Var3.o = new c0(k0Var3);
                            }
                            c0 c0Var = k0Var3.o;
                            c0Var.c.add(wallettransaction);
                            c0Var.g();
                            c0Var.f();
                        }
                        z10.h();
                        z10.f();
                        k0Var3.P();
                        SendMessagesHelper sendMessagesHelper = SendMessagesHelper.getInstance(i12);
                        if (user2 == null || user2.id == UserConfig.getInstance(i12).getClientUserId() || nftitem2 != null) {
                            j10 = j11;
                            messageObject = null;
                        } else {
                            j10 = j11;
                            messageObject = sendMessagesHelper.createSendingGramTransfer(user2, str9, j10, wallettransaction.comment, wallettransaction.comment_encrypted, wallettransaction.comment_encrypted_preparing, nextLong);
                        }
                        wallettransaction.localMessageId = messageObject == null ? 0 : messageObject.getId();
                        Utilities.Callback callback5 = callback3;
                        if (callback5 != null) {
                            callback5.run(wallettransaction);
                        }
                        callback4.run(null);
                        TL_update.TL_updateWalletGaslessInfo tL_updateWalletGaslessInfo = k0Var3.f;
                        if (tL_updateWalletGaslessInfo != null && !TextUtils.isEmpty(tL_updateWalletGaslessInfo.relayer_address)) {
                            TL_update.TL_updateWalletGaslessInfo tL_updateWalletGaslessInfo2 = k0Var3.f;
                            if (tL_updateWalletGaslessInfo2.available) {
                                str6 = tL_updateWalletGaslessInfo2.relayer_address;
                                k0.E("prepare sending");
                                t tVar = new t(k0Var3, m6Var, sendMessagesHelper, messageObject, wallettransaction, str9, z10, nextLong, user2);
                                if (nftitem2 == null) {
                                    k0Var3.b.prepareSendNFT(h0Var, str9, nftitem2.address, str8, new d(tVar, 2));
                                    return;
                                } else {
                                    k0Var3.b.prepareSend(h0Var, str9, j10, str8, bArr2, str6, tVar);
                                    return;
                                }
                            }
                        }
                        str6 = null;
                        k0.E("prepare sending");
                        t tVar2 = new t(k0Var3, m6Var, sendMessagesHelper, messageObject, wallettransaction, str9, z10, nextLong, user2);
                        if (nftitem2 == null) {
                        }
                    }
                }, false, true);
                break;
            default:
                yh.m5 m5Var = (yh.m5) obj8;
                TLObject tLObject2 = (TLObject) obj7;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj6;
                Utilities.Callback2 callback22 = (Utilities.Callback2) obj5;
                TLRPC.TL_inputInvoicePremiumGiftStars tL_inputInvoicePremiumGiftStars = (TLRPC.TL_inputInvoicePremiumGiftStars) obj4;
                Context context = (Context) obj3;
                org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) obj2;
                TLObject tLObject3 = (TLObject) obj;
                TLRPC.TL_textWithEntities tL_textWithEntities = (TLRPC.TL_textWithEntities) tLObject;
                if (!(tLObject2 instanceof TLRPC.TL_payments_paymentFormStars)) {
                    yh.m5.e(tL_error == null ? "NO_PAYMENT_FORM" : tL_error.text);
                    callback22.run(Boolean.FALSE, null);
                    break;
                } else {
                    TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars = (TLRPC.TL_payments_paymentFormStars) tLObject2;
                    TL_stars.TL_payments_sendStarsForm tL_payments_sendStarsForm = new TL_stars.TL_payments_sendStarsForm();
                    tL_payments_sendStarsForm.form_id = tL_payments_paymentFormStars.form_id;
                    tL_payments_sendStarsForm.invoice = tL_inputInvoicePremiumGiftStars;
                    ArrayList<TLRPC.TL_labeledPrice> arrayList = tL_payments_paymentFormStars.invoice.prices;
                    int size = arrayList.size();
                    long j10 = 0;
                    while (i11 < size) {
                        TLRPC.TL_labeledPrice tL_labeledPrice = arrayList.get(i11);
                        i11++;
                        j10 += tL_labeledPrice.amount;
                    }
                    ConnectionsManager.getInstance(m5Var.a).sendRequest(tL_payments_sendStarsForm, new yh.k4(m5Var, callback22, context, e6Var, j10, this.c, this.r, tLObject3, tL_textWithEntities));
                    break;
                }
        }
    }

    public /* synthetic */ p(yh.m5 m5Var, TLObject tLObject, TLRPC.TL_error tL_error, Utilities.Callback2 callback2, TLRPC.TL_inputInvoicePremiumGiftStars tL_inputInvoicePremiumGiftStars, Context context, org.telegram.ui.ActionBar.e6 e6Var, String str, long j3, TLObject tLObject2, TLRPC.TL_textWithEntities tL_textWithEntities) {
        this.a = 2;
        this.b = m5Var;
        this.f = tLObject;
        this.h = tL_error;
        this.v = callback2;
        this.d = tL_inputInvoicePremiumGiftStars;
        this.w = context;
        this.e = e6Var;
        this.c = str;
        this.r = j3;
        this.n = tLObject2;
        this.s = tL_textWithEntities;
    }
}
