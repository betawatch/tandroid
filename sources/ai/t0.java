package ai;

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
import org.telegram.ui.Components.l91;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.xr;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.dn;
import org.telegram.ui.dq;
import org.telegram.ui.io0;
import org.telegram.ui.ir;
import org.telegram.ui.jr;
import org.telegram.ui.ko;
import org.telegram.ui.sn;
import org.telegram.ui.yo;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes4.dex */
public final /* synthetic */ class t0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ t0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
        this.b = obj5;
    }

    private final void a() {
        org.telegram.ui.md mdVar = (org.telegram.ui.md) this.c;
        String str = (String) this.d;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.b;
        TLObject tLObject = (TLObject) this.e;
        TLRPC.TL_channels_checkUsername tL_channels_checkUsername = (TLRPC.TL_channels_checkUsername) this.f;
        mdVar.X = 0;
        String str2 = mdVar.Y;
        if (str2 == null || !str2.equals(str)) {
            return;
        }
        if (tL_error == null && (tLObject instanceof TLRPC.TL_boolTrue)) {
            mdVar.V.setText(LocaleController.formatString("LinkAvailable", R.string.LinkAvailable, str));
            org.telegram.ui.Cells.x1 x1Var = mdVar.V;
            int i10 = org.telegram.ui.ActionBar.k6.w6;
            x1Var.setTag(Integer.valueOf(i10));
            org.telegram.ui.ActionBar.r6.W(mdVar.V, i10, null);
            mdVar.a0 = true;
            return;
        }
        if (tL_error != null && "USERNAME_INVALID".equals(tL_error.text) && tL_channels_checkUsername.username.length() == 4) {
            mdVar.V.setText(LocaleController.getString(R.string.UsernameInvalidShort));
            org.telegram.ui.ActionBar.r6.W(mdVar.V, org.telegram.ui.ActionBar.k6.p7, null);
        } else if (tL_error != null && "USERNAME_PURCHASE_AVAILABLE".equals(tL_error.text)) {
            if (tL_channels_checkUsername.username.length() == 4) {
                mdVar.V.setText(LocaleController.getString(R.string.UsernameInvalidShortPurchase));
            } else {
                mdVar.V.setText(LocaleController.getString(R.string.UsernameInUsePurchase));
            }
            org.telegram.ui.ActionBar.r6.W(mdVar.V, org.telegram.ui.ActionBar.k6.F6, null);
        } else if (tL_error == null || !"CHANNELS_ADMIN_PUBLIC_TOO_MUCH".equals(tL_error.text)) {
            org.telegram.ui.ActionBar.r6.W(mdVar.V, org.telegram.ui.ActionBar.k6.p7, null);
            mdVar.V.setText(LocaleController.getString(R.string.LinkInUse));
        } else {
            org.telegram.ui.ActionBar.r6.W(mdVar.V, org.telegram.ui.ActionBar.k6.p7, null);
            mdVar.k0 = false;
            mdVar.g0();
        }
        mdVar.a0 = false;
    }

    private final void b() {
        sn snVar = (sn) this.c;
        boolean[] zArr = (boolean[]) this.d;
        boolean[] zArr2 = (boolean[]) this.e;
        ImageView imageView = (ImageView) this.f;
        ImageView imageView2 = (ImageView) this.b;
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        long[] jArr = {-1};
        org.telegram.messenger.camera.i iVar = new org.telegram.messenger.camera.i(jArr, zArr2, imageView, imageView2, 11);
        TLRPC.TL_messages_rateTranscribedAudio tL_messages_rateTranscribedAudio = new TLRPC.TL_messages_rateTranscribedAudio();
        tL_messages_rateTranscribedAudio.msg_id = snVar.p5.getId();
        tL_messages_rateTranscribedAudio.peer = snVar.getMessagesController().getInputPeer(snVar.p5.messageOwner.peer_id);
        tL_messages_rateTranscribedAudio.transcription_id = snVar.p5.messageOwner.voiceTranscriptionId;
        tL_messages_rateTranscribedAudio.good = zArr2[0];
        snVar.getConnectionsManager().sendRequest(tL_messages_rateTranscribedAudio, new org.telegram.ui.ca(snVar, iVar, jArr, 4));
        AndroidUtilities.runOnUIThread(iVar, 150L);
    }

    private final void c() {
        dn dnVar = (dn) this.c;
        TLRPC.Message message = (TLRPC.Message) this.d;
        org.telegram.ui.ActionBar.c2[] c2VarArr = (org.telegram.ui.ActionBar.c2[]) this.e;
        MessageObject messageObject = (MessageObject) this.f;
        org.telegram.ui.v5 v5Var = (org.telegram.ui.v5) this.b;
        sn snVar = dnVar.a;
        if (message.suggested_post.schedule_date != 0) {
            snVar.getMessagesController().approveSuggestedMessage(DialogObject.getPeerDialogId(messageObject.messageOwner.peer_id), messageObject.messageOwner.id, 0);
            return;
        }
        c2VarArr[0].setOnDismissListener(null);
        org.telegram.ui.ActionBar.h3 h3Var = org.telegram.ui.Components.f5.T(snVar.getParentActivity(), 0L, new m4.w0(17, dnVar, messageObject), snVar.getResourceProvider(), 1).a;
        h3Var.show();
        h3Var.setOnDismissListener(v5Var);
    }

    private final void d() {
        yo yoVar = (yo) this.c;
        String str = (String) this.d;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.b;
        TLObject tLObject = (TLObject) this.e;
        TLRPC.TL_channels_checkUsername tL_channels_checkUsername = (TLRPC.TL_channels_checkUsername) this.f;
        yoVar.i0 = 0;
        String str2 = yoVar.j0;
        if (str2 == null || !str2.equals(str)) {
            return;
        }
        if (tL_error == null && (tLObject instanceof TLRPC.TL_boolTrue)) {
            yoVar.f.setText(LocaleController.formatString("LinkAvailable", R.string.LinkAvailable, str));
            yoVar.f.setTextColorByKey(org.telegram.ui.ActionBar.k6.w6);
            yoVar.l0 = true;
            return;
        }
        if (tL_error != null && "USERNAME_INVALID".equals(tL_error.text) && tL_channels_checkUsername.username.length() == 4) {
            yoVar.f.setText(LocaleController.getString(R.string.UsernameInvalidShort));
            org.telegram.ui.ActionBar.r6.W(yoVar.f.getTextView(), org.telegram.ui.ActionBar.k6.p7, null);
        } else if (tL_error != null && "USERNAME_PURCHASE_AVAILABLE".equals(tL_error.text)) {
            if (tL_channels_checkUsername.username.length() == 4) {
                yoVar.f.setText(LocaleController.getString(R.string.UsernameInvalidShortPurchase));
            } else {
                yoVar.f.setText(LocaleController.getString(R.string.UsernameInUsePurchase));
            }
            org.telegram.ui.ActionBar.r6.W(yoVar.f.getTextView(), org.telegram.ui.ActionBar.k6.F6, null);
        } else if (tL_error == null || !"CHANNELS_ADMIN_PUBLIC_TOO_MUCH".equals(tL_error.text)) {
            yoVar.f.setText(LocaleController.getString(R.string.LinkInUse));
            yoVar.f.setTextColorByKey(org.telegram.ui.ActionBar.k6.p7);
        } else {
            yoVar.d0 = false;
            yoVar.a0();
        }
        yoVar.l0 = false;
    }

    private final void f() {
        dq.Y((dq) this.c, (TLRPC.TL_error) this.b, (TLRPC.InputCheckPasswordSRP) this.d, (TwoStepVerificationActivity) this.e, (TLRPC.TL_channels_editCreator) this.f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:217:0x059e  */
    /* JADX WARN: Type inference failed for: r10v10, types: [org.telegram.SQLite.SQLiteCursor] */
    /* JADX WARN: Type inference failed for: r6v7, types: [org.telegram.tgnet.InputSerializedData, org.telegram.tgnet.NativeByteBuffer] */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v50, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9, types: [boolean, int] */
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
        ci.p4 p4Var;
        ci.y9 y9Var;
        org.telegram.ui.ActionBar.g6 g6Var;
        int i14;
        int i15;
        int i16 = 9;
        int i17 = 2;
        io0 io0Var = null;
        r10 = null;
        TLRPC.TL_documentAttributeVideo tL_documentAttributeVideo = null;
        io0 io0Var2 = null;
        r10 = null;
        TL_stars.SavedStarGift savedStarGift = null;
        SQLiteCursor sQLiteCursor = null;
        io0 io0Var3 = null;
        int i18 = 1;
        int i19 = 0;
        switch (this.a) {
            case 0:
                b1 b1Var = (b1) this.c;
                pf.c cVar = (pf.c) this.d;
                org.telegram.ui.ActionBar.c2 c2Var = (org.telegram.ui.ActionBar.c2) this.e;
                TLRPC.Updates updates = (TLRPC.Updates) this.f;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.b;
                d2 d2Var = b1Var.r0;
                if (d2Var != null) {
                    d2Var.run();
                }
                cVar.c(false);
                c2Var.dismiss();
                b1Var.dismiss();
                org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                if (U != null) {
                    if (updates == null) {
                        org.telegram.ui.Components.xc.a0(U).f0(tL_error, false);
                        return;
                    }
                    org.telegram.ui.Components.qc M = org.telegram.ui.Components.xc.a0(U).M(LocaleController.getString(R.string.GiftOfferSentTitle), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftOfferSentText, b1Var.a0, DialogObject.getShortName(b1Var.b0))), R.raw.forward);
                    M.t = true;
                    M.j();
                    return;
                }
                return;
            case 1:
                ha haVar = (ha) this.c;
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
                    MessagesController.getInstance(haVar.a).putUsers(paymentForm.users, false);
                    io0Var = new io0(paymentForm, tL_inputInvoiceStars, null);
                } else if (tLObject instanceof TLRPC.PaymentReceipt) {
                    io0Var = new io0((TLRPC.PaymentReceipt) tLObject);
                }
                if (io0Var == null) {
                    r1Var.run(Boolean.FALSE, "UNKNOWN_RESPONSE");
                    return;
                }
                io0Var.Z0 = new a1.c(r1Var, i16);
                org.telegram.ui.ActionBar.o2 R = LaunchActivity.R();
                if (R == null) {
                    return;
                }
                if (!AndroidUtilities.hasDialogOnTop(R)) {
                    R.presentFragment(io0Var);
                    return;
                }
                org.telegram.ui.ActionBar.m2 m2Var = new org.telegram.ui.ActionBar.m2();
                m2Var.a = true;
                R.showAsSheet(io0Var, m2Var);
                return;
            case 2:
                ha haVar2 = (ha) this.c;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.b;
                uc ucVar = (uc) this.d;
                TLObject tLObject2 = (TLObject) this.e;
                TLRPC.TL_inputInvoiceStars tL_inputInvoiceStars2 = (TLRPC.TL_inputInvoiceStars) this.f;
                if (tL_error3 != null) {
                    ucVar.run(Boolean.FALSE, tL_error3.text);
                    return;
                }
                if (tLObject2 instanceof TLRPC.PaymentForm) {
                    TLRPC.PaymentForm paymentForm2 = (TLRPC.PaymentForm) tLObject2;
                    paymentForm2.invoice.recurring = true;
                    MessagesController.getInstance(haVar2.a).putUsers(paymentForm2.users, false);
                    io0Var3 = new io0(paymentForm2, tL_inputInvoiceStars2, null);
                } else if (tLObject2 instanceof TLRPC.PaymentReceipt) {
                    io0Var3 = new io0((TLRPC.PaymentReceipt) tLObject2);
                }
                if (io0Var3 == null) {
                    ucVar.run(Boolean.FALSE, "UNKNOWN_RESPONSE");
                    return;
                }
                io0Var3.Z0 = new a1.c(ucVar, 10);
                org.telegram.ui.ActionBar.o2 R2 = LaunchActivity.R();
                if (R2 == null) {
                    return;
                }
                if (!AndroidUtilities.hasDialogOnTop(R2)) {
                    R2.presentFragment(io0Var3);
                    return;
                }
                org.telegram.ui.ActionBar.m2 m2Var2 = new org.telegram.ui.ActionBar.m2();
                m2Var2.a = true;
                R2.showAsSheet(io0Var3, m2Var2);
                return;
            case 3:
                ha haVar3 = (ha) this.c;
                boolean[] zArr = (boolean[]) this.d;
                String str = (String) this.e;
                TLRPC.ChatInvite chatInvite = (TLRPC.ChatInvite) this.f;
                Utilities.Callback2 callback2 = (Utilities.Callback2) this.b;
                zArr[0] = true;
                haVar3.Z(str, chatInvite, new q(callback2, 5));
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
                                AndroidUtilities.runOnUIThread(new f9(cVar2, arrayList2, i11, j10, arrayList4, arrayList3));
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
                } catch (Exception e7) {
                    e = e7;
                    j10 = 0;
                    i10 = 0;
                }
                AndroidUtilities.runOnUIThread(new f9(cVar2, arrayList2, i11, j10, arrayList4, arrayList3));
                return;
            case 5:
                ha haVar4 = (ha) this.c;
                org.telegram.ui.ActionBar.c2 c2Var2 = (org.telegram.ui.ActionBar.c2) this.e;
                TLObject tLObject3 = (TLObject) this.d;
                TL_stars.InputSavedStarGift inputSavedStarGift = (TL_stars.InputSavedStarGift) this.f;
                Utilities.Callback callback = (Utilities.Callback) this.b;
                int i22 = haVar4.a;
                c2Var2.dismiss();
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
                ha haVar5 = (ha) this.c;
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
                    MessagesController.getInstance(haVar5.a).putUsers(paymentForm3.users, false);
                    io0Var2 = new io0(paymentForm3, tL_inputInvoiceStars3, null);
                } else if (tLObject4 instanceof TLRPC.PaymentReceipt) {
                    io0Var2 = new io0((TLRPC.PaymentReceipt) tLObject4);
                }
                if (io0Var2 == null) {
                    callback22.run(Boolean.FALSE, "UNKNOWN_RESPONSE");
                    return;
                }
                io0Var2.Z0 = new a1.c(callback22, 8);
                org.telegram.ui.ActionBar.o2 R3 = LaunchActivity.R();
                if (R3 == null) {
                    return;
                }
                if (!AndroidUtilities.hasDialogOnTop(R3)) {
                    R3.presentFragment(io0Var2);
                    return;
                }
                org.telegram.ui.ActionBar.m2 m2Var3 = new org.telegram.ui.ActionBar.m2();
                m2Var3.a = true;
                R3.showAsSheet(io0Var2, m2Var3);
                return;
            case 7:
                List list = (List) this.c;
                Utilities.Callback2 callback23 = (Utilities.Callback2) this.d;
                TLRPC.TL_inputStorePaymentStarsTopup tL_inputStorePaymentStarsTopup = (TLRPC.TL_inputStorePaymentStarsTopup) this.e;
                TL_stars.TL_starsTopupOption tL_starsTopupOption = (TL_stars.TL_starsTopupOption) this.f;
                Activity activity = (Activity) this.b;
                if (list.isEmpty()) {
                    FileLog.d("StarsController.buy queryProductDetails done: no products");
                    AndroidUtilities.runOnUIThread(new s7(2, callback23));
                    return;
                }
                c5.p pVar = (c5.p) list.get(0);
                c5.l a2 = pVar.a();
                if (a2 == null) {
                    FileLog.d("StarsController.buy queryProductDetails done: no details");
                    AndroidUtilities.runOnUIThread(new s7(3, callback23));
                    return;
                }
                tL_inputStorePaymentStarsTopup.currency = a2.c;
                tL_inputStorePaymentStarsTopup.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsTopupOption.currency)) * (a2.b / Math.pow(10.0d, 6.0d)));
                BillingController.getInstance().addResultListener(pVar.c, new r7(callback23, 0));
                BillingController.getInstance().setOnCanceled(new s7(false ? 1 : 0, callback23));
                FileLog.d("StarsController.buy launchBillingFlow");
                BillingController billingController = BillingController.getInstance();
                AccountInstance accountInstance = AccountInstance.getInstance(UserConfig.selectedAccount);
                n4.s sVar = new n4.s(i16, false ? 1 : 0);
                sVar.G((c5.p) list.get(0));
                billingController.launchBillingFlow(activity, accountInstance, tL_inputStorePaymentStarsTopup, Collections.singletonList(sVar.k()));
                return;
            case 8:
                ci.q qVar = (ci.q) this.c;
                ci.r rVar = (ci.r) this.d;
                Long l4 = (Long) this.e;
                ei.vb vbVar = (ei.vb) this.f;
                Runnable runnable = (Runnable) this.b;
                if (qVar == null) {
                    qVar = rVar.e(l4.longValue());
                }
                vbVar.X(ei.qb.c(qVar));
                runnable.run();
                return;
            case 9:
                ci.p4 p4Var2 = (ci.p4) this.c;
                Runnable runnable2 = (Runnable) this.d;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) this.b;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) this.e;
                ei.p9 p9Var = (ei.p9) this.f;
                org.telegram.ui.ActionBar.g6 g6Var2 = p4Var2.B0;
                ci.q3 q3Var = p4Var2.c1;
                if (runnable2 != null) {
                    runnable2.run();
                }
                if (tL_error5 == null || "STORY_NOT_MODIFIED".equals(tL_error5.text)) {
                    storyItem.parsedPrivacy = p9Var;
                    ArrayList arrayList7 = p9Var.b;
                    int i24 = p9Var.a;
                    ArrayList arrayList8 = p9Var.c;
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
                                    i25 = com.google.android.gms.internal.play_billing.k3.h(tL_inputPrivacyValueDisallowUsers.users.get(i25).user_id, tL_privacyValueDisallowUsers.users, i25, 1);
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
                                    for (int i26 = 0; i26 < tL_inputPrivacyValueAllowUsers.users.size(); i26 = com.google.android.gms.internal.play_billing.k3.h(tL_inputPrivacyValueAllowUsers.users.get(i26).user_id, tL_privacyValueAllowUsers.users, i26, 1)) {
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
                    MessagesController.getInstance(p4Var2.C2).getStoriesController().p0(storyItem.dialogId, storyItem, true);
                    p4Var2.b4 = true;
                    if (i24 == 4) {
                        new org.telegram.ui.Components.xc(q3Var, g6Var2).Q(R.raw.contact_check, 36, LocaleController.getString("StorySharedToEveryone")).j();
                    } else if (i24 == 1) {
                        new org.telegram.ui.Components.xc(q3Var, g6Var2).Q(R.raw.contact_check, 36, LocaleController.getString("StorySharedToCloseFriends")).j();
                    } else if (i24 == 2) {
                        if (arrayList8.isEmpty()) {
                            new org.telegram.ui.Components.xc(q3Var, g6Var2).Q(R.raw.contact_check, 36, LocaleController.getString("StorySharedToAllContacts")).j();
                        } else {
                            new org.telegram.ui.Components.xc(q3Var, g6Var2).Q(R.raw.contact_check, 36, LocaleController.formatPluralString("StorySharedToAllContactsExcluded", arrayList8.size(), new Object[0])).j();
                        }
                    } else if (i24 == 3) {
                        HashSet hashSet = new HashSet();
                        hashSet.addAll(arrayList8);
                        Iterator it = p9Var.d.values().iterator();
                        while (it.hasNext()) {
                            hashSet.addAll((ArrayList) it.next());
                        }
                        z10 = false;
                        new org.telegram.ui.Components.xc(q3Var, g6Var2).Q(R.raw.contact_check, 36, LocaleController.formatPluralString("StorySharedToContacts", hashSet.size(), new Object[0])).j();
                    }
                    z10 = false;
                } else {
                    org.telegram.messenger.v0.p(R.string.UnknownError, new org.telegram.ui.Components.xc(q3Var, g6Var2), R.raw.error, 36);
                    z10 = false;
                }
                p4Var2.e1(z10);
                return;
            case 10:
                ci.g4 g4Var = (ci.g4) this.c;
                Activity activity2 = (Activity) this.d;
                TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) this.e;
                ci.z9 z9Var = (ci.z9) this.f;
                ci.m4 m4Var = (ci.m4) this.b;
                ei.vb D = ei.vb.D(activity2, g4Var.l.C2);
                ci.o4 o4Var = g4Var.l.M2;
                long j12 = (o4Var == null || (y9Var = (ci.y9) o4Var.c) == null) ? 0L : y9Var.currentPosition;
                ei.a8 n10 = ei.a8.n(g4Var.l.O1.h(), g4Var.l.O1.a);
                ci.p4 p4Var3 = g4Var.l;
                n10.e = p4Var3.B1;
                TL_stories.StoryItem storyItem3 = p4Var3.O1.a;
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
                        ei.a8 g10 = n10.g();
                        g10.b0 = true;
                        p4Var = g4Var.l;
                        TL_stories.StoryItem storyItem4 = p4Var.O1.a;
                        g10.c0 = storyItem4.media.document;
                        g10.d0 = new a4(g4Var, storyItem4, storyItem2, i17);
                        if (p4Var.H0()) {
                            ci.p4 p4Var4 = g4Var.l;
                            g10.J0 = p4Var4.B1;
                            g10.L0 = MessagesController.toInputMedia(p4Var4.O1.a.media);
                            ci.z6 z6Var = z9Var.O0;
                            if (z6Var instanceof ci.s6) {
                                g10.K0 = ((ci.s6) z6Var).E;
                            }
                        }
                        D.R(ei.qb.d(z9Var), g10, j12);
                        D.Q = new ci.z3(g4Var, i17);
                        D.R = new ci.c4(g4Var, m4Var, i19);
                        return;
                    }
                }
                j11 = 0;
                n10.e0 = j11;
                ei.a8 g102 = n10.g();
                g102.b0 = true;
                p4Var = g4Var.l;
                TL_stories.StoryItem storyItem42 = p4Var.O1.a;
                g102.c0 = storyItem42.media.document;
                g102.d0 = new a4(g4Var, storyItem42, storyItem2, i17);
                if (p4Var.H0()) {
                }
                D.R(ei.qb.d(z9Var), g102, j12);
                D.Q = new ci.z3(g4Var, i17);
                D.R = new ci.c4(g4Var, m4Var, i19);
                return;
            case 11:
                ci.c5 c5Var = (ci.c5) this.c;
                TLRPC.User user = (TLRPC.User) this.d;
                String str2 = (String) this.e;
                org.telegram.ui.Cells.o6 o6Var = (org.telegram.ui.Cells.o6) this.f;
                TL_stories.StoryView storyView = (TL_stories.StoryView) this.b;
                ArrayList<TLRPC.User> arrayList10 = new ArrayList<>();
                arrayList10.add(user);
                ci.t5 t5Var = c5Var.b;
                ContactsController.getInstance(t5Var.v).deleteContact(arrayList10, false);
                i2.o1.t(R.string.DeletedFromYourContacts, new Object[]{str2}, new org.telegram.ui.Components.xc(t5Var, t5Var.s), R.raw.ic_ban, 36);
                o6Var.a(t5Var.d(storyView) ? 1.0f : 0.5f, true);
                return;
            case 12:
                ei.k9 k9Var = (ei.k9) this.c;
                org.telegram.ui.ActionBar.c2 c2Var3 = (org.telegram.ui.ActionBar.c2) this.e;
                TLObject tLObject5 = (TLObject) this.d;
                TL_phone.getGroupCallStreamRtmpUrl getgroupcallstreamrtmpurl = (TL_phone.getGroupCallStreamRtmpUrl) this.f;
                TLRPC.TL_error tL_error6 = (TLRPC.TL_error) this.b;
                ei.r9 r9Var = k9Var.W;
                c2Var3.dismiss();
                if (!(tLObject5 instanceof TL_phone.groupCallStreamRtmpUrl)) {
                    if (tL_error6 != null) {
                        org.telegram.ui.ActionBar.e3 e3Var = r9Var.container;
                        g6Var = ((org.telegram.ui.ActionBar.h3) r9Var).resourcesProvider;
                        new org.telegram.ui.Components.xc(e3Var, g6Var).f0(tL_error6, true);
                        return;
                    }
                    return;
                }
                xr[] xrVarArr = new xr[1];
                Context context = k9Var.getContext();
                i14 = ((org.telegram.ui.ActionBar.h3) r9Var).currentAccount;
                xr xrVar = new xr(context, i14, getgroupcallstreamrtmpurl, (TL_phone.groupCallStreamRtmpUrl) tLObject5, r9Var.L ? null : new o2(12, k9Var, xrVarArr), new ci.b());
                xrVarArr[0] = xrVar;
                xrVar.show();
                return;
            case 13:
                ei.gc.a((ei.gc) this.c, (ViewGroup) this.d, (org.telegram.ui.ActionBar.g6) this.e, (org.telegram.ui.Components.ja) this.f, (View) this.b);
                return;
            case 14:
                hg.c2 c2Var4 = (hg.c2) this.c;
                TLRPC.TL_messages_getStickers tL_messages_getStickers = (TLRPC.TL_messages_getStickers) this.d;
                TLObject tLObject6 = (TLObject) this.e;
                ArrayList arrayList11 = (ArrayList) this.f;
                LongSparseArray longSparseArray = (LongSparseArray) this.b;
                c2Var4.getClass();
                String str3 = tL_messages_getStickers.emoticon;
                hg.e2 e2Var = c2Var4.a;
                if (str3.equals(e2Var.R)) {
                    e2Var.O = 0;
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
                            e2Var.I.put(arrayList11, e2Var.R);
                            if (size2 == 0) {
                                e2Var.J.add(arrayList11);
                            }
                            e2Var.l();
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 15:
                ig.z1 z1Var = (ig.z1) this.c;
                ArrayList<TLRPC.User> arrayList12 = (ArrayList) this.d;
                ArrayList<TLRPC.Chat> arrayList13 = (ArrayList) this.e;
                ArrayList arrayList14 = (ArrayList) this.f;
                Runnable runnable3 = (Runnable) this.b;
                z1Var.e = false;
                int i29 = z1Var.a;
                MessagesController.getInstance(i29).putUsers(arrayList12, true);
                MessagesController.getInstance(i29).putChats(arrayList13, true);
                ArrayList arrayList15 = z1Var.b;
                arrayList15.clear();
                arrayList15.addAll(arrayList14);
                if (runnable3 != null) {
                    runnable3.run();
                } else {
                    z1Var.i(null, false);
                }
                NotificationCenter.getInstance(i29).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                return;
            case 16:
                ig.z1 z1Var2 = (ig.z1) this.c;
                ArrayList<TLRPC.User> arrayList16 = (ArrayList) this.d;
                ArrayList<TLRPC.Chat> arrayList17 = (ArrayList) this.e;
                ig.y1 y1Var = (ig.y1) this.f;
                MessageObject messageObject = (MessageObject) this.b;
                int i30 = z1Var2.a;
                MessagesController.getInstance(i30).putUsers(arrayList16, true);
                MessagesController.getInstance(i30).putChats(arrayList17, true);
                y1Var.e = messageObject;
                if (messageObject != null) {
                    messageObject.applyQuickReply(y1Var.b, y1Var.a);
                }
                z1Var2.l();
                NotificationCenter.getInstance(i30).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                return;
            case 17:
                ig.z1 z1Var3 = (ig.z1) this.c;
                TLObject tLObject7 = (TLObject) this.d;
                ArrayList<Integer> arrayList18 = (ArrayList) this.e;
                TLRPC.TL_messages_sendQuickReplyMessages tL_messages_sendQuickReplyMessages = (TLRPC.TL_messages_sendQuickReplyMessages) this.f;
                TLRPC.TL_error tL_error7 = (TLRPC.TL_error) this.b;
                z1Var3.getClass();
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
                ConnectionsManager.getInstance(z1Var3.a).sendRequest(tL_messages_sendQuickReplyMessages, null);
                return;
            case 18:
                ((m4.g) this.d).run().a(new y0((qi.e) this.c, (AtomicBoolean) this.e, (m4.h) this.f, (AtomicBoolean) this.b, 25), j9.r.a);
                return;
            case 19:
                ((CameraController) this.c).lambda$open$10((CameraSession) this.d, (Runnable) this.e, (SurfaceTexture) this.f, (Runnable) this.b);
                return;
            case 20:
                org.telegram.ui.v7 v7Var = (org.telegram.ui.v7) this.c;
                bi.b bVar = (bi.b) this.d;
                TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio = (TLRPC.TL_documentAttributeAudio) this.e;
                String str4 = (String) this.f;
                String str5 = (String) this.b;
                v7Var.getClass();
                bVar.e.a = false;
                tL_documentAttributeAudio.title = str4;
                tL_documentAttributeAudio.performer = str5;
                l91 l91Var = v7Var.n;
                for (int i32 = 0; i32 < l91Var.getViewPages().length; i32++) {
                    mm0 mm0Var = (mm0) l91Var.getViewPages()[i32];
                    if (mm0Var != null && ((org.telegram.ui.i7) mm0Var.getAdapter()).d == 3) {
                        org.telegram.ui.i7 i7Var = (org.telegram.ui.i7) mm0Var.getAdapter();
                        int i33 = 0;
                        while (true) {
                            if (i33 >= i7Var.e.size()) {
                                break;
                            } else if (((org.telegram.ui.p7) i7Var.e.get(i33)).d == bVar) {
                                i7Var.m(i33);
                            } else {
                                i33++;
                            }
                        }
                    }
                }
                return;
            case 21:
                org.telegram.ui.sa saVar = (org.telegram.ui.sa) this.c;
                String str6 = (String) this.d;
                TLRPC.TL_error tL_error8 = (TLRPC.TL_error) this.b;
                TLObject tLObject8 = (TLObject) this.e;
                TL_account.checkUsername checkusername = (TL_account.checkUsername) this.f;
                saVar.e = 0;
                String str7 = saVar.f;
                if (str7 == null || !str7.equals(str6)) {
                    return;
                }
                if (tL_error8 == null && (tLObject8 instanceof TLRPC.TL_boolTrue)) {
                    org.telegram.ui.Cells.x1 x1Var = saVar.G;
                    if (x1Var != null) {
                        x1Var.setText(LocaleController.formatString("UsernameAvailable", R.string.UsernameAvailable, str6));
                        org.telegram.ui.Cells.x1 x1Var2 = saVar.G;
                        int i34 = org.telegram.ui.ActionBar.k6.w6;
                        x1Var2.setTag(Integer.valueOf(i34));
                        org.telegram.ui.ActionBar.r6.W(saVar.G, i34, null);
                        org.telegram.ui.ra raVar = saVar.F;
                        if (raVar != null) {
                            org.telegram.ui.ra.a(raVar);
                            return;
                        }
                        return;
                    }
                    return;
                }
                if (saVar.G != null) {
                    if (tL_error8 != null && "USERNAME_INVALID".equals(tL_error8.text) && checkusername.username.length() == 4) {
                        saVar.G.setText(LocaleController.getString(R.string.UsernameInvalidShort));
                        org.telegram.ui.Cells.x1 x1Var3 = saVar.G;
                        int i35 = org.telegram.ui.ActionBar.k6.p7;
                        x1Var3.setTag(Integer.valueOf(i35));
                        org.telegram.ui.ActionBar.r6.W(saVar.G, i35, null);
                    } else if (tL_error8 == null || !"USERNAME_PURCHASE_AVAILABLE".equals(tL_error8.text)) {
                        saVar.G.setText(LocaleController.getString(R.string.UsernameInUse));
                        org.telegram.ui.Cells.x1 x1Var4 = saVar.G;
                        int i36 = org.telegram.ui.ActionBar.k6.p7;
                        x1Var4.setTag(Integer.valueOf(i36));
                        org.telegram.ui.ActionBar.r6.W(saVar.G, i36, null);
                    } else {
                        if (checkusername.username.length() == 4) {
                            saVar.G.setText(LocaleController.getString(R.string.UsernameInvalidShortPurchase));
                        } else {
                            saVar.G.setText(LocaleController.getString(R.string.UsernameInUsePurchase));
                        }
                        org.telegram.ui.Cells.x1 x1Var5 = saVar.G;
                        int i37 = org.telegram.ui.ActionBar.k6.F6;
                        x1Var5.setTag(Integer.valueOf(i37));
                        org.telegram.ui.ActionBar.r6.W(saVar.G, i37, null);
                    }
                    org.telegram.ui.ra raVar2 = saVar.F;
                    if (raVar2 != null) {
                        org.telegram.ui.ra.a(raVar2);
                        return;
                    }
                    return;
                }
                return;
            case 22:
                org.telegram.ui.pb pbVar = (org.telegram.ui.pb) this.c;
                TLRPC.TL_chatInviteExported tL_chatInviteExported = (TLRPC.TL_chatInviteExported) this.d;
                TLRPC.TL_messages_exportedChatInvite tL_messages_exportedChatInvite = (TLRPC.TL_messages_exportedChatInvite) this.f;
                boolean[] zArr2 = (boolean[]) this.b;
                org.telegram.ui.ActionBar.c2 c2Var5 = (org.telegram.ui.ActionBar.c2) this.e;
                org.telegram.ui.vb vbVar2 = pbVar.a.n;
                vbVar2.A0 = false;
                vbVar2.y0.put(tL_chatInviteExported.link, tL_messages_exportedChatInvite == null ? 0 : tL_messages_exportedChatInvite);
                if (zArr2[0]) {
                    return;
                }
                c2Var5.dismiss();
                if (tL_messages_exportedChatInvite != null) {
                    org.telegram.ui.vb.A0(vbVar2, tL_messages_exportedChatInvite, vbVar2.z0);
                    return;
                } else {
                    org.telegram.messenger.v0.p(R.string.LinkHashExpired, org.telegram.ui.Components.xc.a0(vbVar2), R.raw.linkbroken, 36);
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
                        bdVar.getMessagesController().getBoostsController().userCanBoostChannel(bdVar.a, bdVar.c, new org.telegram.ui.fc(bdVar, i18));
                        return;
                    } else {
                        bdVar.P.setLoading(false);
                        i2.o1.t(R.string.UnknownErrorCode, new Object[]{tL_error9.text}, org.telegram.ui.Components.xc.a0(bdVar), R.raw.error, 36);
                        return;
                    }
                }
                int i38 = i15 + 1;
                iArr[0] = i38;
                if (i38 == iArr2[0]) {
                    bdVar.finishFragment();
                    org.telegram.ui.ActionBar.o2 o2Var = bdVar.l0;
                    if (o2Var != null) {
                        if (o2Var instanceof ko) {
                            ((ko) o2Var).o0();
                        }
                        org.telegram.messenger.v0.p(bdVar.d ? R.string.GroupAppearanceUpdated : R.string.ChannelAppearanceUpdated, org.telegram.ui.Components.xc.a0(bdVar.l0), R.raw.contact_check, 36);
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
                ir irVar = (ir) this.c;
                ArrayList arrayList20 = (ArrayList) this.d;
                a0.h hVar = (a0.h) this.e;
                ArrayList arrayList21 = (ArrayList) this.f;
                ArrayList arrayList22 = (ArrayList) this.b;
                hg.a2 a2Var = irVar.h;
                jr jrVar = irVar.y;
                if (jrVar.o1) {
                    irVar.s = false;
                    irVar.d = arrayList20;
                    irVar.e = hVar;
                    irVar.f = arrayList21;
                    a2Var.f(arrayList20, null);
                    if (!ChatObject.isChannel(jrVar.r)) {
                        ArrayList arrayList23 = a2Var.g;
                        arrayList23.clear();
                        arrayList23.addAll(arrayList22);
                    }
                    int i39 = irVar.r;
                    irVar.l();
                    if (irVar.r > i39) {
                        jrVar.y0(i39);
                    }
                    if (a2Var.e() || irVar.r != 0) {
                        return;
                    }
                    jrVar.b.e(false, true);
                    return;
                }
                return;
        }
    }

    public /* synthetic */ t0(Object obj, Object obj2, TLRPC.TL_error tL_error, TLObject tLObject, Object obj3, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.b = tL_error;
        this.e = tLObject;
        this.f = obj3;
    }

    public /* synthetic */ t0(Object obj, TLRPC.TL_error tL_error, Object obj2, Object obj3, TLObject tLObject, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = tL_error;
        this.d = obj2;
        this.e = obj3;
        this.f = tLObject;
    }

    public /* synthetic */ t0(Object obj, org.telegram.ui.ActionBar.c2 c2Var, TLObject tLObject, TLObject tLObject2, Object obj2, int i10) {
        this.a = i10;
        this.c = obj;
        this.e = c2Var;
        this.d = tLObject;
        this.f = tLObject2;
        this.b = obj2;
    }

    public /* synthetic */ t0(org.telegram.ui.pb pbVar, TLRPC.TL_chatInviteExported tL_chatInviteExported, TLRPC.TL_messages_exportedChatInvite tL_messages_exportedChatInvite, boolean[] zArr, org.telegram.ui.ActionBar.c2 c2Var) {
        this.a = 22;
        this.c = pbVar;
        this.d = tL_chatInviteExported;
        this.f = tL_messages_exportedChatInvite;
        this.b = zArr;
        this.e = c2Var;
    }
}
