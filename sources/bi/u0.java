package bi;

import android.app.Activity;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.text.TextUtils;
import android.util.LongSparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.camera.CameraSession;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.nm0;
import org.telegram.ui.Components.v91;
import org.telegram.ui.Components.zr;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.cp;
import org.telegram.ui.hn;
import org.telegram.ui.iq;
import org.telegram.ui.lr;
import org.telegram.ui.mr;
import org.telegram.ui.oo;
import org.telegram.ui.ro0;
import org.telegram.ui.wn;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final /* synthetic */ class u0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ u0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
        this.b = obj5;
    }

    private final void a() {
        org.telegram.ui.nd ndVar = (org.telegram.ui.nd) this.c;
        String str = (String) this.d;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.b;
        TLObject tLObject = (TLObject) this.e;
        TLRPC.TL_channels_checkUsername tL_channels_checkUsername = (TLRPC.TL_channels_checkUsername) this.f;
        ndVar.X = 0;
        String str2 = ndVar.Y;
        if (str2 == null || !str2.equals(str)) {
            return;
        }
        if (tL_error == null && (tLObject instanceof TLRPC.TL_boolTrue)) {
            ndVar.V.setText(LocaleController.formatString("LinkAvailable", R.string.LinkAvailable, str));
            org.telegram.ui.Cells.w1 w1Var = ndVar.V;
            int i10 = org.telegram.ui.ActionBar.y6.w6;
            w1Var.setTag(Integer.valueOf(i10));
            org.telegram.ui.ActionBar.f7.V(ndVar.V, i10, null);
            ndVar.a0 = true;
            return;
        }
        if (tL_error != null && "USERNAME_INVALID".equals(tL_error.text) && tL_channels_checkUsername.username.length() == 4) {
            ndVar.V.setText(LocaleController.getString(R.string.UsernameInvalidShort));
            org.telegram.ui.ActionBar.f7.V(ndVar.V, org.telegram.ui.ActionBar.y6.p7, null);
        } else if (tL_error != null && "USERNAME_PURCHASE_AVAILABLE".equals(tL_error.text)) {
            if (tL_channels_checkUsername.username.length() == 4) {
                ndVar.V.setText(LocaleController.getString(R.string.UsernameInvalidShortPurchase));
            } else {
                ndVar.V.setText(LocaleController.getString(R.string.UsernameInUsePurchase));
            }
            org.telegram.ui.ActionBar.f7.V(ndVar.V, org.telegram.ui.ActionBar.y6.F6, null);
        } else if (tL_error == null || !"CHANNELS_ADMIN_PUBLIC_TOO_MUCH".equals(tL_error.text)) {
            org.telegram.ui.ActionBar.f7.V(ndVar.V, org.telegram.ui.ActionBar.y6.p7, null);
            ndVar.V.setText(LocaleController.getString(R.string.LinkInUse));
        } else {
            org.telegram.ui.ActionBar.f7.V(ndVar.V, org.telegram.ui.ActionBar.y6.p7, null);
            ndVar.k0 = false;
            ndVar.h0();
        }
        ndVar.a0 = false;
    }

    private final void b() {
        wn wnVar = (wn) this.c;
        boolean[] zArr = (boolean[]) this.d;
        boolean[] zArr2 = (boolean[]) this.e;
        ImageView imageView = (ImageView) this.f;
        ImageView imageView2 = (ImageView) this.b;
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        long[] jArr = {-1};
        m4.v0 v0Var = new m4.v0(jArr, zArr2, imageView, imageView2, 14);
        TLRPC.TL_messages_rateTranscribedAudio tL_messages_rateTranscribedAudio = new TLRPC.TL_messages_rateTranscribedAudio();
        tL_messages_rateTranscribedAudio.msg_id = wnVar.t5.getId();
        tL_messages_rateTranscribedAudio.peer = wnVar.getMessagesController().getInputPeer(wnVar.t5.messageOwner.peer_id);
        tL_messages_rateTranscribedAudio.transcription_id = wnVar.t5.messageOwner.voiceTranscriptionId;
        tL_messages_rateTranscribedAudio.good = zArr2[0];
        wnVar.getConnectionsManager().sendRequest(tL_messages_rateTranscribedAudio, new org.telegram.ui.ea(wnVar, v0Var, jArr, 4));
        AndroidUtilities.runOnUIThread(v0Var, 150L);
    }

    private final void c() {
        hn hnVar = (hn) this.c;
        TLRPC.Message message = (TLRPC.Message) this.d;
        org.telegram.ui.ActionBar.e2[] e2VarArr = (org.telegram.ui.ActionBar.e2[]) this.e;
        MessageObject messageObject = (MessageObject) this.f;
        org.telegram.ui.u5 u5Var = (org.telegram.ui.u5) this.b;
        wn wnVar = hnVar.a;
        if (message.suggested_post.schedule_date != 0) {
            wnVar.getMessagesController().approveSuggestedMessage(DialogObject.getPeerDialogId(messageObject.messageOwner.peer_id), messageObject.messageOwner.id, 0);
            return;
        }
        e2VarArr[0].setOnDismissListener(null);
        org.telegram.ui.ActionBar.k3 k3Var = org.telegram.ui.Components.g5.S(wnVar.getParentActivity(), 0L, new m4.s0(20, hnVar, messageObject), wnVar.getResourceProvider(), 1).a;
        k3Var.show();
        k3Var.setOnDismissListener(u5Var);
    }

    private final void d() {
        cp cpVar = (cp) this.c;
        String str = (String) this.d;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.b;
        TLObject tLObject = (TLObject) this.e;
        TLRPC.TL_channels_checkUsername tL_channels_checkUsername = (TLRPC.TL_channels_checkUsername) this.f;
        cpVar.h0 = 0;
        String str2 = cpVar.i0;
        if (str2 == null || !str2.equals(str)) {
            return;
        }
        if (tL_error == null && (tLObject instanceof TLRPC.TL_boolTrue)) {
            cpVar.h.setText(LocaleController.formatString("LinkAvailable", R.string.LinkAvailable, str));
            cpVar.h.setTextColorByKey(org.telegram.ui.ActionBar.y6.w6);
            cpVar.k0 = true;
            return;
        }
        if (tL_error != null && "USERNAME_INVALID".equals(tL_error.text) && tL_channels_checkUsername.username.length() == 4) {
            cpVar.h.setText(LocaleController.getString(R.string.UsernameInvalidShort));
            org.telegram.ui.ActionBar.f7.V(cpVar.h.getTextView(), org.telegram.ui.ActionBar.y6.p7, null);
        } else if (tL_error != null && "USERNAME_PURCHASE_AVAILABLE".equals(tL_error.text)) {
            if (tL_channels_checkUsername.username.length() == 4) {
                cpVar.h.setText(LocaleController.getString(R.string.UsernameInvalidShortPurchase));
            } else {
                cpVar.h.setText(LocaleController.getString(R.string.UsernameInUsePurchase));
            }
            org.telegram.ui.ActionBar.f7.V(cpVar.h.getTextView(), org.telegram.ui.ActionBar.y6.F6, null);
        } else if (tL_error == null || !"CHANNELS_ADMIN_PUBLIC_TOO_MUCH".equals(tL_error.text)) {
            cpVar.h.setText(LocaleController.getString(R.string.LinkInUse));
            cpVar.h.setTextColorByKey(org.telegram.ui.ActionBar.y6.p7);
        } else {
            cpVar.c0 = false;
            cpVar.b0();
        }
        cpVar.k0 = false;
    }

    private final void f() {
        iq.Z((iq) this.c, (TLRPC.TL_error) this.b, (TLRPC.InputCheckPasswordSRP) this.d, (TwoStepVerificationActivity) this.e, (TLRPC.TL_channels_editCreator) this.f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:217:0x059e  */
    /* JADX WARN: Type inference failed for: r10v10, types: [org.telegram.SQLite.SQLiteCursor] */
    /* JADX WARN: Type inference failed for: r6v7, types: [org.telegram.tgnet.InputSerializedData, org.telegram.tgnet.NativeByteBuffer] */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v49, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8, types: [boolean, int] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        long j10;
        int i10;
        int i11;
        boolean z10;
        ArrayList arrayList;
        int i12;
        int i13;
        TLRPC.MessageMedia messageMedia;
        TLRPC.Document document;
        long j11;
        di.q4 q4Var;
        di.x9 x9Var;
        org.telegram.ui.ActionBar.u6 u6Var;
        int i14;
        int i15;
        int i16 = 13;
        int i17 = 2;
        ro0 ro0Var = null;
        r10 = null;
        TLRPC.TL_documentAttributeVideo tL_documentAttributeVideo = null;
        ro0 ro0Var2 = null;
        r10 = null;
        TL_stars.SavedStarGift savedStarGift = null;
        SQLiteCursor sQLiteCursor = null;
        ro0 ro0Var3 = null;
        int i18 = 1;
        int i19 = 0;
        switch (this.a) {
            case 0:
                b1 b1Var = (b1) this.c;
                qf.c cVar = (qf.c) this.d;
                org.telegram.ui.ActionBar.e2 e2Var = (org.telegram.ui.ActionBar.e2) this.e;
                TLRPC.Updates updates = (TLRPC.Updates) this.f;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.b;
                a2 a2Var = b1Var.r0;
                if (a2Var != null) {
                    a2Var.run();
                }
                cVar.c(false);
                e2Var.dismiss();
                b1Var.dismiss();
                org.telegram.ui.ActionBar.r2 U = LaunchActivity.U();
                if (U != null) {
                    if (updates == null) {
                        org.telegram.ui.Components.wc.b0(U).g0(tL_error, false);
                        return;
                    }
                    org.telegram.ui.Components.qc M = org.telegram.ui.Components.wc.b0(U).M(LocaleController.getString(R.string.GiftOfferSentTitle), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftOfferSentText, b1Var.a0, DialogObject.getShortName(b1Var.b0))), R.raw.forward);
                    M.u = true;
                    M.j();
                    return;
                }
                return;
            case 1:
                ca caVar = (ca) this.c;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.b;
                org.telegram.ui.Wallet.r1 r1Var = (org.telegram.ui.Wallet.r1) this.d;
                TLObject tLObject = (TLObject) this.e;
                TLRPC.TL_inputInvoiceStars tL_inputInvoiceStars = (TLRPC.TL_inputInvoiceStars) this.f;
                if (tL_error2 != null) {
                    r1Var.run(Boolean.FALSE, tL_error2.text);
                    return;
                }
                if (tLObject instanceof TLRPC.PaymentForm) {
                    TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject;
                    paymentForm.invoice.recurring = true;
                    MessagesController.getInstance(caVar.a).putUsers(paymentForm.users, false);
                    ro0Var = new ro0(paymentForm, tL_inputInvoiceStars, null);
                } else if (tLObject instanceof TLRPC.PaymentReceipt) {
                    ro0Var = new ro0((TLRPC.PaymentReceipt) tLObject);
                }
                if (ro0Var == null) {
                    r1Var.run(Boolean.FALSE, "UNKNOWN_RESPONSE");
                    return;
                }
                ro0Var.Z0 = new a1.c(r1Var, 11);
                org.telegram.ui.ActionBar.r2 R = LaunchActivity.R();
                if (R == null) {
                    return;
                }
                if (!AndroidUtilities.hasDialogOnTop(R)) {
                    R.presentFragment(ro0Var);
                    return;
                }
                org.telegram.ui.ActionBar.p2 p2Var = new org.telegram.ui.ActionBar.p2();
                p2Var.a = true;
                R.showAsSheet(ro0Var, p2Var);
                return;
            case 2:
                ca caVar2 = (ca) this.c;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.b;
                lc lcVar = (lc) this.d;
                TLObject tLObject2 = (TLObject) this.e;
                TLRPC.TL_inputInvoiceStars tL_inputInvoiceStars2 = (TLRPC.TL_inputInvoiceStars) this.f;
                if (tL_error3 != null) {
                    lcVar.run(Boolean.FALSE, tL_error3.text);
                    return;
                }
                if (tLObject2 instanceof TLRPC.PaymentForm) {
                    TLRPC.PaymentForm paymentForm2 = (TLRPC.PaymentForm) tLObject2;
                    paymentForm2.invoice.recurring = true;
                    MessagesController.getInstance(caVar2.a).putUsers(paymentForm2.users, false);
                    ro0Var3 = new ro0(paymentForm2, tL_inputInvoiceStars2, null);
                } else if (tLObject2 instanceof TLRPC.PaymentReceipt) {
                    ro0Var3 = new ro0((TLRPC.PaymentReceipt) tLObject2);
                }
                if (ro0Var3 == null) {
                    lcVar.run(Boolean.FALSE, "UNKNOWN_RESPONSE");
                    return;
                }
                ro0Var3.Z0 = new a1.c(lcVar, 12);
                org.telegram.ui.ActionBar.r2 R2 = LaunchActivity.R();
                if (R2 == null) {
                    return;
                }
                if (!AndroidUtilities.hasDialogOnTop(R2)) {
                    R2.presentFragment(ro0Var3);
                    return;
                }
                org.telegram.ui.ActionBar.p2 p2Var2 = new org.telegram.ui.ActionBar.p2();
                p2Var2.a = true;
                R2.showAsSheet(ro0Var3, p2Var2);
                return;
            case 3:
                ca caVar3 = (ca) this.c;
                boolean[] zArr = (boolean[]) this.d;
                String str = (String) this.e;
                TLRPC.ChatInvite chatInvite = (TLRPC.ChatInvite) this.f;
                Utilities.Callback2 callback2 = (Utilities.Callback2) this.b;
                zArr[0] = true;
                caVar3.Z(str, chatInvite, new ai.e(callback2, 8));
                return;
            case 4:
                MessagesStorage messagesStorage = (MessagesStorage) this.c;
                ArrayList arrayList2 = (ArrayList) this.d;
                ArrayList<TLRPC.Chat> arrayList3 = (ArrayList) this.e;
                ArrayList<TLRPC.User> arrayList4 = (ArrayList) this.f;
                a1.c cVar2 = (a1.c) this.b;
                try {
                    try {
                        ?? r72 = 0;
                        ?? queryFinalized = messagesStorage.getDatabase().queryFinalized("SELECT data, hash, time FROM star_gifts2 ORDER BY pos ASC", new Object[0]);
                        int i20 = 0;
                        j10 = 0;
                        while (queryFinalized.next()) {
                            try {
                                ?? byteBufferValue = queryFinalized.byteBufferValue(r72);
                                if (byteBufferValue != 0) {
                                    TL_stars.StarGift TLdeserialize = TL_stars.StarGift.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(r72), r72);
                                    if (TLdeserialize != null) {
                                        arrayList2.add(TLdeserialize);
                                    }
                                    byteBufferValue.reuse();
                                    i20 = (int) queryFinalized.longValue(1);
                                    j10 = queryFinalized.longValue(2);
                                }
                                r72 = 0;
                            } catch (Exception e) {
                                e = e;
                                i10 = i20;
                                sQLiteCursor = queryFinalized;
                                FileLog.e(e);
                                if (sQLiteCursor != null) {
                                    sQLiteCursor.dispose();
                                }
                                i11 = i10;
                                AndroidUtilities.runOnUIThread(new a9(cVar2, arrayList2, i11, j10, arrayList4, arrayList3));
                                return;
                            }
                        }
                        ArrayList<Long> arrayList5 = new ArrayList<>();
                        ArrayList arrayList6 = new ArrayList();
                        int size = arrayList2.size();
                        int i21 = 0;
                        while (i21 < size) {
                            Object obj = arrayList2.get(i21);
                            i21++;
                            TLRPC.Peer peer = ((TL_stars.StarGift) obj).released_by;
                            if (peer != null) {
                                long peerDialogId = DialogObject.getPeerDialogId(peer);
                                if (peerDialogId > 0) {
                                    arrayList5.add(Long.valueOf(peerDialogId));
                                } else if (peerDialogId < 0) {
                                    arrayList6.add(Long.valueOf(-peerDialogId));
                                }
                            }
                        }
                        if (!arrayList6.isEmpty()) {
                            messagesStorage.getChatsInternal(TextUtils.join(",", arrayList6), arrayList3);
                        }
                        if (!arrayList5.isEmpty()) {
                            messagesStorage.getUsersInternal(arrayList5, arrayList4);
                        }
                        queryFinalized.dispose();
                        i11 = i20;
                    } catch (Throwable th2) {
                        if (sQLiteCursor != null) {
                            sQLiteCursor.dispose();
                        }
                        throw th2;
                    }
                } catch (Exception e10) {
                    e = e10;
                    j10 = 0;
                    i10 = 0;
                }
                AndroidUtilities.runOnUIThread(new a9(cVar2, arrayList2, i11, j10, arrayList4, arrayList3));
                return;
            case 5:
                ca caVar4 = (ca) this.c;
                org.telegram.ui.ActionBar.e2 e2Var2 = (org.telegram.ui.ActionBar.e2) this.e;
                TLObject tLObject3 = (TLObject) this.d;
                TL_stars.InputSavedStarGift inputSavedStarGift = (TL_stars.InputSavedStarGift) this.f;
                Utilities.Callback callback = (Utilities.Callback) this.b;
                int i22 = caVar4.a;
                e2Var2.dismiss();
                if (tLObject3 instanceof TL_stars.TL_payments_savedStarGifts) {
                    TL_stars.TL_payments_savedStarGifts tL_payments_savedStarGifts = (TL_stars.TL_payments_savedStarGifts) tLObject3;
                    MessagesController.getInstance(i22).putUsers(tL_payments_savedStarGifts.users, false);
                    MessagesController.getInstance(i22).putChats(tL_payments_savedStarGifts.chats, false);
                    for (int i23 = 0; i23 < tL_payments_savedStarGifts.gifts.size(); i23++) {
                        TL_stars.SavedStarGift savedStarGift2 = tL_payments_savedStarGifts.gifts.get(i23);
                        if (((inputSavedStarGift instanceof TL_stars.TL_inputSavedStarGiftUser) && ((TL_stars.TL_inputSavedStarGiftUser) inputSavedStarGift).msg_id == savedStarGift2.msg_id) || ((inputSavedStarGift instanceof TL_stars.TL_inputSavedStarGiftChat) && ((TL_stars.TL_inputSavedStarGiftChat) inputSavedStarGift).saved_id == savedStarGift2.saved_id)) {
                            savedStarGift = savedStarGift2;
                        }
                    }
                }
                callback.run(savedStarGift);
                return;
            case 6:
                ca caVar5 = (ca) this.c;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) this.b;
                Utilities.Callback2 callback22 = (Utilities.Callback2) this.d;
                TLObject tLObject4 = (TLObject) this.e;
                TLRPC.TL_inputInvoiceStars tL_inputInvoiceStars3 = (TLRPC.TL_inputInvoiceStars) this.f;
                if (tL_error4 != null) {
                    callback22.run(Boolean.FALSE, tL_error4.text);
                    return;
                }
                if (tLObject4 instanceof TLRPC.PaymentForm) {
                    TLRPC.PaymentForm paymentForm3 = (TLRPC.PaymentForm) tLObject4;
                    paymentForm3.invoice.recurring = true;
                    MessagesController.getInstance(caVar5.a).putUsers(paymentForm3.users, false);
                    ro0Var2 = new ro0(paymentForm3, tL_inputInvoiceStars3, null);
                } else if (tLObject4 instanceof TLRPC.PaymentReceipt) {
                    ro0Var2 = new ro0((TLRPC.PaymentReceipt) tLObject4);
                }
                if (ro0Var2 == null) {
                    callback22.run(Boolean.FALSE, "UNKNOWN_RESPONSE");
                    return;
                }
                ro0Var2.Z0 = new a1.c(callback22, 10);
                org.telegram.ui.ActionBar.r2 R3 = LaunchActivity.R();
                if (R3 == null) {
                    return;
                }
                if (!AndroidUtilities.hasDialogOnTop(R3)) {
                    R3.presentFragment(ro0Var2);
                    return;
                }
                org.telegram.ui.ActionBar.p2 p2Var3 = new org.telegram.ui.ActionBar.p2();
                p2Var3.a = true;
                R3.showAsSheet(ro0Var2, p2Var3);
                return;
            case 7:
                List list = (List) this.c;
                Utilities.Callback2 callback23 = (Utilities.Callback2) this.d;
                TLRPC.TL_inputStorePaymentStarsTopup tL_inputStorePaymentStarsTopup = (TLRPC.TL_inputStorePaymentStarsTopup) this.e;
                TL_stars.TL_starsTopupOption tL_starsTopupOption = (TL_stars.TL_starsTopupOption) this.f;
                Activity activity = (Activity) this.b;
                if (list.isEmpty()) {
                    FileLog.d("StarsController.buy queryProductDetails done: no products");
                    AndroidUtilities.runOnUIThread(new o7(2, callback23));
                    return;
                }
                d5.o oVar = (d5.o) list.get(0);
                d5.l a2 = oVar.a();
                if (a2 == null) {
                    FileLog.d("StarsController.buy queryProductDetails done: no details");
                    AndroidUtilities.runOnUIThread(new o7(3, callback23));
                    return;
                }
                tL_inputStorePaymentStarsTopup.currency = a2.c;
                tL_inputStorePaymentStarsTopup.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsTopupOption.currency)) * (a2.b / Math.pow(10.0d, 6.0d)));
                BillingController.getInstance().addResultListener(oVar.c, new n7(callback23, 0));
                BillingController.getInstance().setOnCanceled(new o7(false ? 1 : 0, callback23));
                FileLog.d("StarsController.buy launchBillingFlow");
                BillingController billingController = BillingController.getInstance();
                AccountInstance accountInstance = AccountInstance.getInstance(UserConfig.selectedAccount);
                rf.b bVar = new rf.b(i16, false ? 1 : 0);
                bVar.R((d5.o) list.get(0));
                billingController.launchBillingFlow(activity, accountInstance, tL_inputStorePaymentStarsTopup, Collections.singletonList(bVar.E()));
                return;
            case 8:
                di.q qVar = (di.q) this.c;
                di.r rVar = (di.r) this.d;
                Long l4 = (Long) this.e;
                fi.sb sbVar = (fi.sb) this.f;
                Runnable runnable = (Runnable) this.b;
                if (qVar == null) {
                    qVar = rVar.e(l4.longValue());
                }
                sbVar.X(fi.nb.c(qVar));
                runnable.run();
                return;
            case 9:
                di.q4 q4Var2 = (di.q4) this.c;
                Runnable runnable2 = (Runnable) this.d;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) this.b;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) this.e;
                fi.l9 l9Var = (fi.l9) this.f;
                org.telegram.ui.ActionBar.u6 u6Var2 = q4Var2.q0;
                di.q3 q3Var = q4Var2.R0;
                if (runnable2 != null) {
                    runnable2.run();
                }
                if (tL_error5 == null || "STORY_NOT_MODIFIED".equals(tL_error5.text)) {
                    storyItem.parsedPrivacy = l9Var;
                    ArrayList arrayList7 = l9Var.b;
                    int i24 = l9Var.a;
                    ArrayList arrayList8 = l9Var.c;
                    ArrayList<TLRPC.PrivacyRule> arrayList9 = new ArrayList<>();
                    while (i19 < arrayList7.size()) {
                        TLRPC.InputPrivacyRule inputPrivacyRule = (TLRPC.InputPrivacyRule) arrayList7.get(i19);
                        if (inputPrivacyRule instanceof TLRPC.TL_inputPrivacyValueAllowAll) {
                            arrayList9.add(new TLRPC.TL_privacyValueAllowAll());
                        } else if (inputPrivacyRule instanceof TLRPC.TL_inputPrivacyValueAllowCloseFriends) {
                            arrayList9.add(new TLRPC.TL_privacyValueAllowCloseFriends());
                        } else if (inputPrivacyRule instanceof TLRPC.TL_inputPrivacyValueAllowContacts) {
                            arrayList9.add(new TLRPC.TL_privacyValueAllowContacts());
                        } else {
                            if (inputPrivacyRule instanceof TLRPC.TL_inputPrivacyValueDisallowUsers) {
                                TLRPC.TL_inputPrivacyValueDisallowUsers tL_inputPrivacyValueDisallowUsers = (TLRPC.TL_inputPrivacyValueDisallowUsers) inputPrivacyRule;
                                TLRPC.TL_privacyValueDisallowUsers tL_privacyValueDisallowUsers = new TLRPC.TL_privacyValueDisallowUsers();
                                int i25 = 0;
                                while (i25 < tL_inputPrivacyValueDisallowUsers.users.size()) {
                                    i25 = c3.h0.j(tL_inputPrivacyValueDisallowUsers.users.get(i25).user_id, tL_privacyValueDisallowUsers.users, i25, 1);
                                    i19 = i19;
                                    arrayList7 = arrayList7;
                                }
                                arrayList = arrayList7;
                                i12 = i19;
                                arrayList9.add(tL_privacyValueDisallowUsers);
                            } else {
                                arrayList = arrayList7;
                                i12 = i19;
                                if (inputPrivacyRule instanceof TLRPC.TL_inputPrivacyValueAllowUsers) {
                                    TLRPC.TL_inputPrivacyValueAllowUsers tL_inputPrivacyValueAllowUsers = (TLRPC.TL_inputPrivacyValueAllowUsers) inputPrivacyRule;
                                    TLRPC.TL_privacyValueAllowUsers tL_privacyValueAllowUsers = new TLRPC.TL_privacyValueAllowUsers();
                                    for (int i26 = 0; i26 < tL_inputPrivacyValueAllowUsers.users.size(); i26 = c3.h0.j(tL_inputPrivacyValueAllowUsers.users.get(i26).user_id, tL_privacyValueAllowUsers.users, i26, 1)) {
                                    }
                                    i13 = 1;
                                    arrayList9.add(tL_privacyValueAllowUsers);
                                    i19 = i12 + 1;
                                    i18 = i13;
                                    arrayList7 = arrayList;
                                }
                            }
                            i13 = 1;
                            i19 = i12 + 1;
                            i18 = i13;
                            arrayList7 = arrayList;
                        }
                        arrayList = arrayList7;
                        i13 = i18;
                        i12 = i19;
                        i19 = i12 + 1;
                        i18 = i13;
                        arrayList7 = arrayList;
                    }
                    int i27 = i18;
                    storyItem.privacy = arrayList9;
                    storyItem.close_friends = i24 == i27;
                    storyItem.contacts = i24 == 2;
                    storyItem.selected_contacts = i24 == 3;
                    MessagesController.getInstance(q4Var2.r2).getStoriesController().s0(storyItem.dialogId, storyItem, true);
                    q4Var2.R3 = true;
                    if (i24 == 4) {
                        new org.telegram.ui.Components.wc(q3Var, u6Var2).R(R.raw.contact_check, 36, LocaleController.getString("StorySharedToEveryone")).j();
                    } else if (i24 == 1) {
                        new org.telegram.ui.Components.wc(q3Var, u6Var2).R(R.raw.contact_check, 36, LocaleController.getString("StorySharedToCloseFriends")).j();
                    } else if (i24 == 2) {
                        if (arrayList8.isEmpty()) {
                            new org.telegram.ui.Components.wc(q3Var, u6Var2).R(R.raw.contact_check, 36, LocaleController.getString("StorySharedToAllContacts")).j();
                        } else {
                            new org.telegram.ui.Components.wc(q3Var, u6Var2).R(R.raw.contact_check, 36, LocaleController.formatPluralString("StorySharedToAllContactsExcluded", arrayList8.size(), new Object[0])).j();
                        }
                    } else if (i24 == 3) {
                        HashSet hashSet = new HashSet();
                        hashSet.addAll(arrayList8);
                        Iterator it = l9Var.d.values().iterator();
                        while (it.hasNext()) {
                            hashSet.addAll((ArrayList) it.next());
                        }
                        z10 = false;
                        new org.telegram.ui.Components.wc(q3Var, u6Var2).R(R.raw.contact_check, 36, LocaleController.formatPluralString("StorySharedToContacts", hashSet.size(), new Object[0])).j();
                    }
                    z10 = false;
                } else {
                    org.telegram.messenger.t.q(R.string.UnknownError, new org.telegram.ui.Components.wc(q3Var, u6Var2), R.raw.error, 36);
                    z10 = false;
                }
                q4Var2.d1(z10);
                return;
            case 10:
                di.h4 h4Var = (di.h4) this.c;
                Activity activity2 = (Activity) this.d;
                TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) this.e;
                di.y9 y9Var = (di.y9) this.f;
                di.n4 n4Var = (di.n4) this.b;
                fi.sb D = fi.sb.D(activity2, h4Var.l.r2);
                di.p4 p4Var = h4Var.l.B2;
                long j12 = (p4Var == null || (x9Var = (di.x9) p4Var.c) == null) ? 0L : x9Var.currentPosition;
                fi.w7 n10 = fi.w7.n(h4Var.l.D1.h(), h4Var.l.D1.a);
                di.q4 q4Var3 = h4Var.l;
                n10.e = q4Var3.q1;
                TL_stories.StoryItem storyItem3 = q4Var3.D1.a;
                if (storyItem3 != null && (messageMedia = storyItem3.media) != null && (document = messageMedia.document) != null) {
                    int i28 = 0;
                    while (true) {
                        if (i28 < document.attributes.size()) {
                            if (document.attributes.get(i28) instanceof TLRPC.TL_documentAttributeVideo) {
                                tL_documentAttributeVideo = (TLRPC.TL_documentAttributeVideo) document.attributes.get(i28);
                            } else {
                                i28++;
                            }
                        }
                    }
                    if (tL_documentAttributeVideo != null) {
                        j11 = (long) (tL_documentAttributeVideo.video_start_ts * 1000.0d);
                        n10.e0 = j11;
                        fi.w7 g7 = n10.g();
                        g7.b0 = true;
                        q4Var = h4Var.l;
                        TL_stories.StoryItem storyItem4 = q4Var.D1.a;
                        g7.c0 = storyItem4.media.document;
                        g7.d0 = new v3(h4Var, storyItem4, storyItem2, i17);
                        if (q4Var.G0()) {
                            di.q4 q4Var4 = h4Var.l;
                            g7.J0 = q4Var4.q1;
                            g7.L0 = MessagesController.toInputMedia(q4Var4.D1.a.media);
                            di.z6 z6Var = y9Var.O0;
                            if (z6Var instanceof di.s6) {
                                g7.K0 = ((di.s6) z6Var).E;
                            }
                        }
                        D.R(fi.nb.d(y9Var), g7, j12);
                        D.Q = new di.z3(h4Var, i17);
                        D.R = new di.d4(h4Var, n4Var, i19);
                        return;
                    }
                }
                j11 = 0;
                n10.e0 = j11;
                fi.w7 g72 = n10.g();
                g72.b0 = true;
                q4Var = h4Var.l;
                TL_stories.StoryItem storyItem42 = q4Var.D1.a;
                g72.c0 = storyItem42.media.document;
                g72.d0 = new v3(h4Var, storyItem42, storyItem2, i17);
                if (q4Var.G0()) {
                }
                D.R(fi.nb.d(y9Var), g72, j12);
                D.Q = new di.z3(h4Var, i17);
                D.R = new di.d4(h4Var, n4Var, i19);
                return;
            case 11:
                di.c5 c5Var = (di.c5) this.c;
                TLRPC.User user = (TLRPC.User) this.d;
                String str2 = (String) this.e;
                org.telegram.ui.Cells.s6 s6Var = (org.telegram.ui.Cells.s6) this.f;
                TL_stories.StoryView storyView = (TL_stories.StoryView) this.b;
                ArrayList<TLRPC.User> arrayList10 = new ArrayList<>();
                arrayList10.add(user);
                di.t5 t5Var = c5Var.b;
                ContactsController.getInstance(t5Var.v).deleteContact(arrayList10, false);
                ic.a.s(R.string.DeletedFromYourContacts, new Object[]{str2}, new org.telegram.ui.Components.wc(t5Var, t5Var.s), R.raw.ic_ban, 36);
                s6Var.a(t5Var.d(storyView) ? 1.0f : 0.5f, true);
                return;
            case 12:
                fi.g9 g9Var = (fi.g9) this.c;
                org.telegram.ui.ActionBar.e2 e2Var3 = (org.telegram.ui.ActionBar.e2) this.e;
                TLObject tLObject5 = (TLObject) this.d;
                TL_phone.getGroupCallStreamRtmpUrl getgroupcallstreamrtmpurl = (TL_phone.getGroupCallStreamRtmpUrl) this.f;
                TLRPC.TL_error tL_error6 = (TLRPC.TL_error) this.b;
                fi.n9 n9Var = g9Var.W;
                e2Var3.dismiss();
                if (!(tLObject5 instanceof TL_phone.groupCallStreamRtmpUrl)) {
                    if (tL_error6 != null) {
                        org.telegram.ui.ActionBar.h3 h3Var = n9Var.container;
                        u6Var = ((org.telegram.ui.ActionBar.k3) n9Var).resourcesProvider;
                        new org.telegram.ui.Components.wc(h3Var, u6Var).g0(tL_error6, true);
                        return;
                    }
                    return;
                }
                zr[] zrVarArr = new zr[1];
                Context context = g9Var.getContext();
                i14 = ((org.telegram.ui.ActionBar.k3) n9Var).currentAccount;
                zr zrVar = new zr(context, i14, getgroupcallstreamrtmpurl, (TL_phone.groupCallStreamRtmpUrl) tLObject5, n9Var.L ? null : new ai.n1(i16, g9Var, zrVarArr), new di.b());
                zrVarArr[0] = zrVar;
                zrVar.show();
                return;
            case 13:
                fi.cc.a((fi.cc) this.c, (ViewGroup) this.d, (org.telegram.ui.ActionBar.u6) this.e, (org.telegram.ui.Components.la) this.f, (View) this.b);
                return;
            case 14:
                ig.b2 b2Var = (ig.b2) this.c;
                TLRPC.TL_messages_getStickers tL_messages_getStickers = (TLRPC.TL_messages_getStickers) this.d;
                TLObject tLObject6 = (TLObject) this.e;
                ArrayList arrayList11 = (ArrayList) this.f;
                LongSparseArray longSparseArray = (LongSparseArray) this.b;
                b2Var.getClass();
                String str3 = tL_messages_getStickers.emoticon;
                ig.d2 d2Var = b2Var.a;
                if (str3.equals(d2Var.R)) {
                    d2Var.O = 0;
                    if (tLObject6 instanceof TLRPC.TL_messages_stickers) {
                        TLRPC.TL_messages_stickers tL_messages_stickers = (TLRPC.TL_messages_stickers) tLObject6;
                        int size2 = arrayList11.size();
                        int size3 = tL_messages_stickers.stickers.size();
                        while (i19 < size3) {
                            TLRPC.Document document2 = tL_messages_stickers.stickers.get(i19);
                            if (longSparseArray.indexOfKey(document2.id) < 0) {
                                arrayList11.add(document2);
                            }
                            i19++;
                        }
                        if (size2 != arrayList11.size()) {
                            d2Var.I.put(arrayList11, d2Var.R);
                            if (size2 == 0) {
                                d2Var.J.add(arrayList11);
                            }
                            d2Var.l();
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 15:
                jg.c2 c2Var = (jg.c2) this.c;
                ArrayList<TLRPC.User> arrayList12 = (ArrayList) this.d;
                ArrayList<TLRPC.Chat> arrayList13 = (ArrayList) this.e;
                ArrayList arrayList14 = (ArrayList) this.f;
                Runnable runnable3 = (Runnable) this.b;
                c2Var.e = false;
                int i29 = c2Var.a;
                MessagesController.getInstance(i29).putUsers(arrayList12, true);
                MessagesController.getInstance(i29).putChats(arrayList13, true);
                ArrayList arrayList15 = c2Var.b;
                arrayList15.clear();
                arrayList15.addAll(arrayList14);
                if (runnable3 != null) {
                    runnable3.run();
                } else {
                    c2Var.i(null, false);
                }
                NotificationCenter.getInstance(i29).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                return;
            case 16:
                jg.c2 c2Var2 = (jg.c2) this.c;
                ArrayList<TLRPC.User> arrayList16 = (ArrayList) this.d;
                ArrayList<TLRPC.Chat> arrayList17 = (ArrayList) this.e;
                jg.b2 b2Var2 = (jg.b2) this.f;
                MessageObject messageObject = (MessageObject) this.b;
                int i30 = c2Var2.a;
                MessagesController.getInstance(i30).putUsers(arrayList16, true);
                MessagesController.getInstance(i30).putChats(arrayList17, true);
                b2Var2.e = messageObject;
                if (messageObject != null) {
                    messageObject.applyQuickReply(b2Var2.b, b2Var2.a);
                }
                c2Var2.l();
                NotificationCenter.getInstance(i30).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                return;
            case 17:
                jg.c2 c2Var3 = (jg.c2) this.c;
                TLObject tLObject7 = (TLObject) this.d;
                ArrayList<Integer> arrayList18 = (ArrayList) this.e;
                TLRPC.TL_messages_sendQuickReplyMessages tL_messages_sendQuickReplyMessages = (TLRPC.TL_messages_sendQuickReplyMessages) this.f;
                TLRPC.TL_error tL_error7 = (TLRPC.TL_error) this.b;
                c2Var3.getClass();
                if (!(tLObject7 instanceof TLRPC.TL_messages_messages)) {
                    FileLog.e("received " + tLObject7 + " " + tL_error7 + " on getQuickReplyMessages when trying to send quick reply");
                    return;
                }
                ArrayList<TLRPC.Message> arrayList19 = ((TLRPC.TL_messages_messages) tLObject7).messages;
                arrayList18.clear();
                int size4 = arrayList19.size();
                int i31 = 0;
                while (i31 < size4) {
                    TLRPC.Message message = arrayList19.get(i31);
                    i31++;
                    arrayList18.add(Integer.valueOf(message.id));
                }
                tL_messages_sendQuickReplyMessages.id = arrayList18;
                while (i19 < arrayList18.size()) {
                    tL_messages_sendQuickReplyMessages.random_id.add(Long.valueOf(Utilities.random.nextLong()));
                    i19++;
                }
                ConnectionsManager.getInstance(c2Var3.a).sendRequest(tL_messages_sendQuickReplyMessages, null);
                return;
            case 18:
                ((m4.h) this.d).run().a(new ai.e0((com.google.firebase.messaging.q) this.c, (AtomicBoolean) this.e, (m4.i) this.f, (AtomicBoolean) this.b, 28), k9.r.a);
                return;
            case 19:
                ((CameraController) this.c).lambda$open$10((CameraSession) this.d, (Runnable) this.e, (SurfaceTexture) this.f, (Runnable) this.b);
                return;
            case 20:
                org.telegram.ui.x7 x7Var = (org.telegram.ui.x7) this.c;
                ci.a aVar = (ci.a) this.d;
                TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio = (TLRPC.TL_documentAttributeAudio) this.e;
                String str4 = (String) this.f;
                String str5 = (String) this.b;
                x7Var.getClass();
                aVar.e.a = false;
                tL_documentAttributeAudio.title = str4;
                tL_documentAttributeAudio.performer = str5;
                v91 v91Var = x7Var.n;
                for (int i32 = 0; i32 < v91Var.getViewPages().length; i32++) {
                    nm0 c10 = x7Var.c(v91Var.getViewPages()[i32]);
                    if (c10 != null && ((org.telegram.ui.j7) c10.getAdapter()).d == 3) {
                        org.telegram.ui.j7 j7Var = (org.telegram.ui.j7) c10.getAdapter();
                        int i33 = 0;
                        while (true) {
                            if (i33 >= j7Var.e.size()) {
                                break;
                            } else if (((org.telegram.ui.q7) j7Var.e.get(i33)).d == aVar) {
                                j7Var.m(i33);
                            } else {
                                i33++;
                            }
                        }
                    }
                }
                return;
            case 21:
                org.telegram.ui.ta taVar = (org.telegram.ui.ta) this.c;
                String str6 = (String) this.d;
                TLRPC.TL_error tL_error8 = (TLRPC.TL_error) this.b;
                TLObject tLObject8 = (TLObject) this.e;
                TL_account.checkUsername checkusername = (TL_account.checkUsername) this.f;
                taVar.e = 0;
                String str7 = taVar.f;
                if (str7 == null || !str7.equals(str6)) {
                    return;
                }
                if (tL_error8 == null && (tLObject8 instanceof TLRPC.TL_boolTrue)) {
                    org.telegram.ui.Cells.w1 w1Var = taVar.G;
                    if (w1Var != null) {
                        w1Var.setText(LocaleController.formatString("UsernameAvailable", R.string.UsernameAvailable, str6));
                        org.telegram.ui.Cells.w1 w1Var2 = taVar.G;
                        int i34 = org.telegram.ui.ActionBar.y6.w6;
                        w1Var2.setTag(Integer.valueOf(i34));
                        org.telegram.ui.ActionBar.f7.V(taVar.G, i34, null);
                        org.telegram.ui.sa saVar = taVar.F;
                        if (saVar != null) {
                            org.telegram.ui.sa.a(saVar);
                            return;
                        }
                        return;
                    }
                    return;
                }
                if (taVar.G != null) {
                    if (tL_error8 != null && "USERNAME_INVALID".equals(tL_error8.text) && checkusername.username.length() == 4) {
                        taVar.G.setText(LocaleController.getString(R.string.UsernameInvalidShort));
                        org.telegram.ui.Cells.w1 w1Var3 = taVar.G;
                        int i35 = org.telegram.ui.ActionBar.y6.p7;
                        w1Var3.setTag(Integer.valueOf(i35));
                        org.telegram.ui.ActionBar.f7.V(taVar.G, i35, null);
                    } else if (tL_error8 == null || !"USERNAME_PURCHASE_AVAILABLE".equals(tL_error8.text)) {
                        taVar.G.setText(LocaleController.getString(R.string.UsernameInUse));
                        org.telegram.ui.Cells.w1 w1Var4 = taVar.G;
                        int i36 = org.telegram.ui.ActionBar.y6.p7;
                        w1Var4.setTag(Integer.valueOf(i36));
                        org.telegram.ui.ActionBar.f7.V(taVar.G, i36, null);
                    } else {
                        if (checkusername.username.length() == 4) {
                            taVar.G.setText(LocaleController.getString(R.string.UsernameInvalidShortPurchase));
                        } else {
                            taVar.G.setText(LocaleController.getString(R.string.UsernameInUsePurchase));
                        }
                        org.telegram.ui.Cells.w1 w1Var5 = taVar.G;
                        int i37 = org.telegram.ui.ActionBar.y6.F6;
                        w1Var5.setTag(Integer.valueOf(i37));
                        org.telegram.ui.ActionBar.f7.V(taVar.G, i37, null);
                    }
                    org.telegram.ui.sa saVar2 = taVar.F;
                    if (saVar2 != null) {
                        org.telegram.ui.sa.a(saVar2);
                        return;
                    }
                    return;
                }
                return;
            case 22:
                org.telegram.ui.qb qbVar = (org.telegram.ui.qb) this.c;
                TLRPC.TL_chatInviteExported tL_chatInviteExported = (TLRPC.TL_chatInviteExported) this.d;
                TLRPC.TL_messages_exportedChatInvite tL_messages_exportedChatInvite = (TLRPC.TL_messages_exportedChatInvite) this.f;
                boolean[] zArr2 = (boolean[]) this.b;
                org.telegram.ui.ActionBar.e2 e2Var4 = (org.telegram.ui.ActionBar.e2) this.e;
                org.telegram.ui.wb wbVar = qbVar.a.n;
                wbVar.A0 = false;
                wbVar.y0.put(tL_chatInviteExported.link, tL_messages_exportedChatInvite == null ? 0 : tL_messages_exportedChatInvite);
                if (zArr2[0]) {
                    return;
                }
                e2Var4.dismiss();
                if (tL_messages_exportedChatInvite != null) {
                    org.telegram.ui.wb.B0(wbVar, tL_messages_exportedChatInvite, wbVar.z0);
                    return;
                } else {
                    org.telegram.messenger.t.q(R.string.LinkHashExpired, org.telegram.ui.Components.wc.b0(wbVar), R.raw.linkbroken, 36);
                    return;
                }
            case 23:
                org.telegram.ui.bd bdVar = (org.telegram.ui.bd) this.c;
                boolean[] zArr3 = (boolean[]) this.d;
                int[] iArr = (int[]) this.e;
                int[] iArr2 = (int[]) this.f;
                TLRPC.TL_error tL_error9 = (TLRPC.TL_error) this.b;
                if (zArr3[0] || (i15 = iArr[0]) >= iArr2[0]) {
                    return;
                }
                if (tL_error9 != null) {
                    zArr3[0] = true;
                    if ("BOOSTS_REQUIRED".equals(tL_error9.text)) {
                        bdVar.getMessagesController().getBoostsController().userCanBoostChannel(bdVar.a, bdVar.c, new org.telegram.ui.gc(bdVar, i18));
                        return;
                    } else {
                        bdVar.P.setLoading(false);
                        ic.a.s(R.string.UnknownErrorCode, new Object[]{tL_error9.text}, org.telegram.ui.Components.wc.b0(bdVar), R.raw.error, 36);
                        return;
                    }
                }
                int i38 = i15 + 1;
                iArr[0] = i38;
                if (i38 == iArr2[0]) {
                    bdVar.finishFragment();
                    org.telegram.ui.ActionBar.r2 r2Var = bdVar.l0;
                    if (r2Var != null) {
                        if (r2Var instanceof oo) {
                            ((oo) r2Var).p0();
                        }
                        org.telegram.messenger.t.q(bdVar.d ? R.string.GroupAppearanceUpdated : R.string.ChannelAppearanceUpdated, org.telegram.ui.Components.wc.b0(bdVar.l0), R.raw.contact_check, 36);
                        bdVar.l0 = null;
                    }
                    bdVar.P.setLoading(false);
                    return;
                }
                return;
            case 24:
                a();
                return;
            case 25:
                b();
                return;
            case 26:
                c();
                return;
            case 27:
                d();
                return;
            case 28:
                f();
                return;
            default:
                lr lrVar = (lr) this.c;
                ArrayList arrayList20 = (ArrayList) this.d;
                a0.h hVar = (a0.h) this.e;
                ArrayList arrayList21 = (ArrayList) this.f;
                ArrayList arrayList22 = (ArrayList) this.b;
                ig.a2 a2Var2 = lrVar.h;
                mr mrVar = lrVar.y;
                if (mrVar.n1) {
                    lrVar.s = false;
                    lrVar.d = arrayList20;
                    lrVar.e = hVar;
                    lrVar.f = arrayList21;
                    a2Var2.f(arrayList20, null);
                    if (!ChatObject.isChannel(mrVar.n)) {
                        ArrayList arrayList23 = a2Var2.g;
                        arrayList23.clear();
                        arrayList23.addAll(arrayList22);
                    }
                    int i39 = lrVar.r;
                    lrVar.l();
                    if (lrVar.r > i39) {
                        mrVar.z0(i39);
                    }
                    if (a2Var2.e() || lrVar.r != 0) {
                        return;
                    }
                    mrVar.b.e(false, true);
                    return;
                }
                return;
        }
    }

    public /* synthetic */ u0(Object obj, Object obj2, TLRPC.TL_error tL_error, TLObject tLObject, Object obj3, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.b = tL_error;
        this.e = tLObject;
        this.f = obj3;
    }

    public /* synthetic */ u0(Object obj, TLRPC.TL_error tL_error, Object obj2, Object obj3, TLObject tLObject, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = tL_error;
        this.d = obj2;
        this.e = obj3;
        this.f = tLObject;
    }

    public /* synthetic */ u0(Object obj, org.telegram.ui.ActionBar.e2 e2Var, TLObject tLObject, TLObject tLObject2, Object obj2, int i10) {
        this.a = i10;
        this.c = obj;
        this.e = e2Var;
        this.d = tLObject;
        this.f = tLObject2;
        this.b = obj2;
    }

    public /* synthetic */ u0(org.telegram.ui.qb qbVar, TLRPC.TL_chatInviteExported tL_chatInviteExported, TLRPC.TL_messages_exportedChatInvite tL_messages_exportedChatInvite, boolean[] zArr, org.telegram.ui.ActionBar.e2 e2Var) {
        this.a = 22;
        this.c = qbVar;
        this.d = tL_chatInviteExported;
        this.f = tL_messages_exportedChatInvite;
        this.b = zArr;
        this.e = e2Var;
    }
}
