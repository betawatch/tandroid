package org.telegram.ui.Wallet;

import android.app.Activity;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.ad;
import org.telegram.ui.Components.f90;
import org.telegram.ui.Components.tc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.vo0;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final /* synthetic */ class q6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ q6(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v21, types: [org.telegram.ui.ActionBar.n2] */
    /* JADX WARN: Type inference failed for: r17v0 */
    /* JADX WARN: Type inference failed for: r17v1, types: [int] */
    /* JADX WARN: Type inference failed for: r17v2 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9, types: [int] */
    /* JADX WARN: Type inference failed for: r6v0, types: [org.telegram.SQLite.SQLiteCursor] */
    /* JADX WARN: Type inference failed for: r6v27 */
    /* JADX WARN: Type inference failed for: r6v3, types: [org.telegram.ui.ActionBar.n2, org.telegram.ui.vo0] */
    /* JADX WARN: Type inference failed for: r6v4 */
    @Override // java.lang.Runnable
    public final void run() {
        long j3;
        long j10;
        ?? r17;
        int i10 = this.a;
        int i11 = 25;
        int i12 = 7;
        int i13 = 2;
        ?? r62 = 0;
        SQLiteCursor sQLiteCursor = null;
        vo0 vo0Var = null;
        r6 = null;
        TL_stars.SavedStarGift savedStarGift = null;
        vo0 vo0Var2 = null;
        Object obj = this.f;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.c;
        Object obj5 = this.b;
        boolean z10 = false;
        int i14 = 0;
        switch (i10) {
            case 0:
                ((WalletEngine2) obj5).lambda$prepareSend$49((Utilities.Callback3) obj4, (TL_wallet.sendTransfer) obj3, (String) obj2, (String) obj);
                return;
            case 1:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj5;
                Utilities.Callback callback = (Utilities.Callback) obj4;
                TLObject tLObject = (TLObject) obj3;
                MessagesController messagesController = (MessagesController) obj2;
                Utilities.Callback callback2 = (Utilities.Callback) obj;
                if (tL_error != null) {
                    callback.run(tL_error);
                    return;
                } else {
                    if (tLObject instanceof TL_stories.TL_premium_myBoosts) {
                        TL_stories.TL_premium_myBoosts tL_premium_myBoosts = (TL_stories.TL_premium_myBoosts) tLObject;
                        messagesController.putUsers(tL_premium_myBoosts.users, false);
                        messagesController.putChats(tL_premium_myBoosts.chats, false);
                        callback2.run(tL_premium_myBoosts);
                        return;
                    }
                    return;
                }
            case 2:
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj5;
                org.telegram.messenger.w wVar = (org.telegram.messenger.w) obj4;
                TLObject tLObject2 = (TLObject) obj3;
                MessagesController messagesController2 = (MessagesController) obj2;
                org.telegram.messenger.g2 g2Var = (org.telegram.messenger.g2) obj;
                if (tL_error2 != null) {
                    wVar.run(tL_error2);
                    return;
                } else {
                    if (tLObject2 instanceof TL_stories.TL_premium_myBoosts) {
                        TL_stories.TL_premium_myBoosts tL_premium_myBoosts2 = (TL_stories.TL_premium_myBoosts) tLObject2;
                        messagesController2.putUsers(tL_premium_myBoosts2.users, false);
                        messagesController2.putChats(tL_premium_myBoosts2.chats, false);
                        g2Var.run(tL_premium_myBoosts2);
                        return;
                    }
                    return;
                }
            case 3:
                TLObject tLObject3 = (TLObject) obj5;
                MessagesController messagesController3 = (MessagesController) obj4;
                ai.f4 f4Var = (ai.f4) obj3;
                tg.f fVar = (tg.f) obj2;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj;
                if (tLObject3 instanceof TLRPC.TL_payments_checkedGiftCode) {
                    TLRPC.TL_payments_checkedGiftCode tL_payments_checkedGiftCode = (TLRPC.TL_payments_checkedGiftCode) tLObject3;
                    messagesController3.putChats(tL_payments_checkedGiftCode.chats, false);
                    messagesController3.putUsers(tL_payments_checkedGiftCode.users, false);
                    f4Var.run(tL_payments_checkedGiftCode);
                }
                fVar.run(tL_error3);
                return;
            case 4:
                tg.m1.S((tg.m1) obj5, (TLObject) obj4, (TLRPC.UserFull) obj3, (TL_account.TL_birthday) obj2, (TLRPC.TL_error) obj);
                return;
            case 5:
                xh.z4 z4Var = (xh.z4) obj5;
                TLRPC.TL_inputStorePaymentGiftPremium tL_inputStorePaymentGiftPremium = (TLRPC.TL_inputStorePaymentGiftPremium) obj3;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) obj2;
                TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore = (TLRPC.TL_payments_canPurchaseStore) obj;
                int i15 = z4Var.Y;
                org.telegram.ui.ActionBar.n2 n2Var = z4Var.n;
                if (!(((TLObject) obj4) instanceof TLRPC.TL_boolTrue)) {
                    if (tL_error4 != null) {
                        org.telegram.ui.Components.g5.e0(i15, tL_error4, n2Var, tL_payments_canPurchaseStore, new Object[0]);
                        return;
                    }
                    return;
                } else {
                    BillingController billingController = BillingController.getInstance();
                    Activity parentActivity = n2Var.getParentActivity();
                    AccountInstance accountInstance = AccountInstance.getInstance(i15);
                    pf.b bVar = new pf.b(i12, z10);
                    bVar.T(z4Var.e0.h);
                    billingController.launchBillingFlow(parentActivity, accountInstance, tL_inputStorePaymentGiftPremium, Collections.singletonList(bVar.A()));
                    return;
                }
            case 6:
                yh.y yVar = (yh.y) obj5;
                of.e eVar = (of.e) obj4;
                org.telegram.ui.ActionBar.b2 b2Var = (org.telegram.ui.ActionBar.b2) obj3;
                TLRPC.Updates updates = (TLRPC.Updates) obj2;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) obj;
                yh.a1 a1Var = yVar.q0;
                if (a1Var != null) {
                    a1Var.run();
                }
                eVar.c(false);
                b2Var.dismiss();
                yVar.dismiss();
                org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                if (U != null) {
                    if (updates == null) {
                        ad.a0(U).f0(tL_error5, false);
                        return;
                    }
                    tc M = ad.a0(U).M(LocaleController.getString(R.string.GiftOfferSentTitle), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftOfferSentText, yVar.Z, DialogObject.getShortName(yVar.a0))), R.raw.forward);
                    M.t = true;
                    M.j();
                    return;
                }
                return;
            case 7:
                yh.m5 m5Var = (yh.m5) obj5;
                TLRPC.TL_error tL_error6 = (TLRPC.TL_error) obj4;
                qh.r rVar = (qh.r) obj3;
                TLObject tLObject4 = (TLObject) obj2;
                TLRPC.TL_inputInvoiceStars tL_inputInvoiceStars = (TLRPC.TL_inputInvoiceStars) obj;
                if (tL_error6 != null) {
                    rVar.run(Boolean.FALSE, tL_error6.text);
                    return;
                }
                if (tLObject4 instanceof TLRPC.PaymentForm) {
                    TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject4;
                    paymentForm.invoice.recurring = true;
                    MessagesController.getInstance(m5Var.a).putUsers(paymentForm.users, false);
                    r62 = new vo0(paymentForm, tL_inputInvoiceStars, null);
                } else if (tLObject4 instanceof TLRPC.PaymentReceipt) {
                    r62 = new vo0((TLRPC.PaymentReceipt) tLObject4);
                }
                if (r62 == 0) {
                    rVar.run(Boolean.FALSE, "UNKNOWN_RESPONSE");
                    return;
                }
                r62.Z0 = new r5.d(rVar, i11);
                ?? R = LaunchActivity.R();
                if (R == 0) {
                    return;
                }
                if (!AndroidUtilities.hasDialogOnTop(R)) {
                    R.presentFragment(r62);
                    return;
                }
                org.telegram.ui.ActionBar.l2 l2Var = new org.telegram.ui.ActionBar.l2();
                l2Var.a = true;
                R.showAsSheet(r62, l2Var);
                return;
            case 8:
                yh.m5 m5Var2 = (yh.m5) obj5;
                TLRPC.TL_error tL_error7 = (TLRPC.TL_error) obj4;
                f90 f90Var = (f90) obj3;
                TLObject tLObject5 = (TLObject) obj2;
                TLRPC.TL_inputInvoiceStars tL_inputInvoiceStars2 = (TLRPC.TL_inputInvoiceStars) obj;
                if (tL_error7 != null) {
                    f90Var.run(Boolean.FALSE, tL_error7.text);
                    return;
                }
                if (tLObject5 instanceof TLRPC.PaymentForm) {
                    TLRPC.PaymentForm paymentForm2 = (TLRPC.PaymentForm) tLObject5;
                    paymentForm2.invoice.recurring = true;
                    MessagesController.getInstance(m5Var2.a).putUsers(paymentForm2.users, false);
                    vo0Var2 = new vo0(paymentForm2, tL_inputInvoiceStars2, null);
                } else if (tLObject5 instanceof TLRPC.PaymentReceipt) {
                    vo0Var2 = new vo0((TLRPC.PaymentReceipt) tLObject5);
                }
                if (vo0Var2 == null) {
                    f90Var.run(Boolean.FALSE, "UNKNOWN_RESPONSE");
                    return;
                }
                vo0Var2.Z0 = new r5.d(f90Var, 26);
                org.telegram.ui.ActionBar.n2 R2 = LaunchActivity.R();
                if (R2 == null) {
                    return;
                }
                if (!AndroidUtilities.hasDialogOnTop(R2)) {
                    R2.presentFragment(vo0Var2);
                    return;
                }
                org.telegram.ui.ActionBar.l2 l2Var2 = new org.telegram.ui.ActionBar.l2();
                l2Var2.a = true;
                R2.showAsSheet(vo0Var2, l2Var2);
                return;
            case 9:
                ((boolean[]) obj4)[0] = true;
                ((yh.m5) obj5).Z((String) obj2, (TLRPC.ChatInvite) obj3, new hi.a((Utilities.Callback2) obj, i11));
                return;
            case 10:
                MessagesStorage messagesStorage = (MessagesStorage) obj5;
                ArrayList arrayList = (ArrayList) obj4;
                ArrayList<TLRPC.Chat> arrayList2 = (ArrayList) obj3;
                ArrayList<TLRPC.User> arrayList3 = (ArrayList) obj2;
                r5.d dVar = (r5.d) obj;
                try {
                    try {
                        sQLiteCursor = messagesStorage.getDatabase().queryFinalized("SELECT data, hash, time FROM star_gifts2 ORDER BY pos ASC", new Object[0]);
                        ?? r42 = 0;
                        long j11 = 0;
                        while (sQLiteCursor.next()) {
                            try {
                                NativeByteBuffer byteBufferValue = sQLiteCursor.byteBufferValue(0);
                                if (byteBufferValue != null) {
                                    TL_stars.StarGift TLdeserialize = TL_stars.StarGift.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                                    if (TLdeserialize != null) {
                                        arrayList.add(TLdeserialize);
                                    }
                                    byteBufferValue.reuse();
                                    r42 = (int) sQLiteCursor.longValue(1);
                                    j11 = sQLiteCursor.longValue(2);
                                }
                            } catch (Exception e7) {
                                e = e7;
                                z10 = r42;
                                j3 = j11;
                                FileLog.e(e);
                                if (sQLiteCursor != null) {
                                    sQLiteCursor.dispose();
                                }
                                j10 = j3;
                                r17 = z10;
                                AndroidUtilities.runOnUIThread(new ei.p3(dVar, arrayList, (int) r17, j10, arrayList3, arrayList2));
                                return;
                            }
                        }
                        ArrayList<Long> arrayList4 = new ArrayList<>();
                        ArrayList arrayList5 = new ArrayList();
                        int size = arrayList.size();
                        while (i14 < size) {
                            Object obj6 = arrayList.get(i14);
                            i14++;
                            TLRPC.Peer peer = ((TL_stars.StarGift) obj6).released_by;
                            if (peer != null) {
                                long peerDialogId = DialogObject.getPeerDialogId(peer);
                                if (peerDialogId > 0) {
                                    arrayList4.add(Long.valueOf(peerDialogId));
                                } else if (peerDialogId < 0) {
                                    arrayList5.add(Long.valueOf(-peerDialogId));
                                }
                            }
                        }
                        if (!arrayList5.isEmpty()) {
                            messagesStorage.getChatsInternal(TextUtils.join(",", arrayList5), arrayList2);
                        }
                        if (!arrayList4.isEmpty()) {
                            messagesStorage.getUsersInternal(arrayList4, arrayList3);
                        }
                        sQLiteCursor.dispose();
                        j10 = j11;
                        r17 = r42;
                    } catch (Throwable th2) {
                        if (0 != 0) {
                            r62.dispose();
                        }
                        throw th2;
                    }
                } catch (Exception e10) {
                    e = e10;
                    j3 = 0;
                }
                AndroidUtilities.runOnUIThread(new ei.p3(dVar, arrayList, (int) r17, j10, arrayList3, arrayList2));
                return;
            case 11:
                TLObject tLObject6 = (TLObject) obj3;
                TL_stars.InputSavedStarGift inputSavedStarGift = (TL_stars.InputSavedStarGift) obj2;
                Utilities.Callback callback3 = (Utilities.Callback) obj;
                int i16 = ((yh.m5) obj5).a;
                ((org.telegram.ui.ActionBar.b2) obj4).dismiss();
                if (tLObject6 instanceof TL_stars.TL_payments_savedStarGifts) {
                    TL_stars.TL_payments_savedStarGifts tL_payments_savedStarGifts = (TL_stars.TL_payments_savedStarGifts) tLObject6;
                    MessagesController.getInstance(i16).putUsers(tL_payments_savedStarGifts.users, false);
                    MessagesController.getInstance(i16).putChats(tL_payments_savedStarGifts.chats, false);
                    for (int i17 = 0; i17 < tL_payments_savedStarGifts.gifts.size(); i17++) {
                        TL_stars.SavedStarGift savedStarGift2 = tL_payments_savedStarGifts.gifts.get(i17);
                        if (((inputSavedStarGift instanceof TL_stars.TL_inputSavedStarGiftUser) && ((TL_stars.TL_inputSavedStarGiftUser) inputSavedStarGift).msg_id == savedStarGift2.msg_id) || ((inputSavedStarGift instanceof TL_stars.TL_inputSavedStarGiftChat) && ((TL_stars.TL_inputSavedStarGiftChat) inputSavedStarGift).saved_id == savedStarGift2.saved_id)) {
                            savedStarGift = savedStarGift2;
                        }
                    }
                }
                callback3.run(savedStarGift);
                return;
            case 12:
                yh.m5 m5Var3 = (yh.m5) obj5;
                TLRPC.TL_error tL_error8 = (TLRPC.TL_error) obj4;
                Utilities.Callback2 callback22 = (Utilities.Callback2) obj3;
                TLObject tLObject7 = (TLObject) obj2;
                TLRPC.TL_inputInvoiceStars tL_inputInvoiceStars3 = (TLRPC.TL_inputInvoiceStars) obj;
                if (tL_error8 != null) {
                    callback22.run(Boolean.FALSE, tL_error8.text);
                    return;
                }
                if (tLObject7 instanceof TLRPC.PaymentForm) {
                    TLRPC.PaymentForm paymentForm3 = (TLRPC.PaymentForm) tLObject7;
                    paymentForm3.invoice.recurring = true;
                    MessagesController.getInstance(m5Var3.a).putUsers(paymentForm3.users, false);
                    vo0Var = new vo0(paymentForm3, tL_inputInvoiceStars3, null);
                } else if (tLObject7 instanceof TLRPC.PaymentReceipt) {
                    vo0Var = new vo0((TLRPC.PaymentReceipt) tLObject7);
                }
                if (vo0Var == null) {
                    callback22.run(Boolean.FALSE, "UNKNOWN_RESPONSE");
                    return;
                }
                vo0Var.Z0 = new r5.d(callback22, 24);
                org.telegram.ui.ActionBar.n2 R3 = LaunchActivity.R();
                if (R3 == null) {
                    return;
                }
                if (!AndroidUtilities.hasDialogOnTop(R3)) {
                    R3.presentFragment(vo0Var);
                    return;
                }
                org.telegram.ui.ActionBar.l2 l2Var3 = new org.telegram.ui.ActionBar.l2();
                l2Var3.a = true;
                R3.showAsSheet(vo0Var, l2Var3);
                return;
            default:
                List list = (List) obj5;
                Utilities.Callback2 callback23 = (Utilities.Callback2) obj4;
                TLRPC.TL_inputStorePaymentStarsTopup tL_inputStorePaymentStarsTopup = (TLRPC.TL_inputStorePaymentStarsTopup) obj3;
                TL_stars.TL_starsTopupOption tL_starsTopupOption = (TL_stars.TL_starsTopupOption) obj2;
                Activity activity = (Activity) obj;
                if (list.isEmpty()) {
                    FileLog.d("StarsController.buy queryProductDetails done: no products");
                    AndroidUtilities.runOnUIThread(new yh.x3(i13, callback23));
                    return;
                }
                c5.o oVar = (c5.o) list.get(0);
                c5.k a2 = oVar.a();
                if (a2 == null) {
                    FileLog.d("StarsController.buy queryProductDetails done: no details");
                    AndroidUtilities.runOnUIThread(new yh.x3(3, callback23));
                    return;
                }
                tL_inputStorePaymentStarsTopup.currency = a2.c;
                tL_inputStorePaymentStarsTopup.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsTopupOption.currency)) * (a2.b / Math.pow(10.0d, 6.0d)));
                BillingController.getInstance().addResultListener(oVar.c, new ci.c5(callback23, 6));
                BillingController.getInstance().setOnCanceled(new yh.x3(z10 ? 1 : 0, callback23));
                FileLog.d("StarsController.buy launchBillingFlow");
                BillingController billingController2 = BillingController.getInstance();
                AccountInstance accountInstance2 = AccountInstance.getInstance(UserConfig.selectedAccount);
                pf.b bVar2 = new pf.b(i12, z10);
                bVar2.T((c5.o) list.get(0));
                billingController2.launchBillingFlow(activity, accountInstance2, tL_inputStorePaymentStarsTopup, Collections.singletonList(bVar2.A()));
                return;
        }
    }

    public /* synthetic */ q6(yh.m5 m5Var, boolean[] zArr, String str, TLRPC.ChatInvite chatInvite, Utilities.Callback2 callback2) {
        this.a = 9;
        this.b = m5Var;
        this.c = zArr;
        this.e = str;
        this.d = chatInvite;
        this.f = callback2;
    }
}
