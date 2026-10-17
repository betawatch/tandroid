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
import org.telegram.ui.Components.c91;
import org.telegram.ui.Components.im0;
import org.telegram.ui.Components.xr;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.dq;
import org.telegram.ui.en;
import org.telegram.ui.fo0;
import org.telegram.ui.ir;
import org.telegram.ui.jr;
import org.telegram.ui.ko;
import org.telegram.ui.sn;
import org.telegram.ui.yo;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
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
        org.telegram.ui.od odVar = (org.telegram.ui.od) this.c;
        String str = (String) this.d;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.b;
        TLObject tLObject = (TLObject) this.e;
        TLRPC.TL_channels_checkUsername tL_channels_checkUsername = (TLRPC.TL_channels_checkUsername) this.f;
        odVar.W = 0;
        String str2 = odVar.X;
        if (str2 == null || !str2.equals(str)) {
            return;
        }
        if (tL_error == null && (tLObject instanceof TLRPC.TL_boolTrue)) {
            odVar.U.setText(LocaleController.formatString("LinkAvailable", R.string.LinkAvailable, str));
            org.telegram.ui.Cells.y1 y1Var = odVar.U;
            int i10 = org.telegram.ui.ActionBar.h6.w6;
            y1Var.setTag(Integer.valueOf(i10));
            odVar.U.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i10, false));
            odVar.Z = true;
            return;
        }
        if (tL_error != null && "USERNAME_INVALID".equals(tL_error.text) && tL_channels_checkUsername.username.length() == 4) {
            odVar.U.setText(LocaleController.getString(R.string.UsernameInvalidShort));
            odVar.U.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.p7, false));
        } else if (tL_error != null && "USERNAME_PURCHASE_AVAILABLE".equals(tL_error.text)) {
            if (tL_channels_checkUsername.username.length() == 4) {
                odVar.U.setText(LocaleController.getString(R.string.UsernameInvalidShortPurchase));
            } else {
                odVar.U.setText(LocaleController.getString(R.string.UsernameInUsePurchase));
            }
            odVar.U.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.F6, false));
        } else if (tL_error == null || !"CHANNELS_ADMIN_PUBLIC_TOO_MUCH".equals(tL_error.text)) {
            odVar.U.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.p7, false));
            odVar.U.setText(LocaleController.getString(R.string.LinkInUse));
        } else {
            odVar.U.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.p7, false));
            odVar.j0 = false;
            odVar.f0();
        }
        odVar.Z = false;
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
        tL_messages_rateTranscribedAudio.msg_id = snVar.d5.getId();
        tL_messages_rateTranscribedAudio.peer = snVar.getMessagesController().getInputPeer(snVar.d5.messageOwner.peer_id);
        tL_messages_rateTranscribedAudio.transcription_id = snVar.d5.messageOwner.voiceTranscriptionId;
        tL_messages_rateTranscribedAudio.good = zArr2[0];
        snVar.getConnectionsManager().sendRequest(tL_messages_rateTranscribedAudio, new org.telegram.ui.ea(snVar, iVar, jArr, 4));
        AndroidUtilities.runOnUIThread(iVar, 150L);
    }

    private final void c() {
        en enVar = (en) this.c;
        TLRPC.Message message = (TLRPC.Message) this.d;
        org.telegram.ui.ActionBar.b2[] b2VarArr = (org.telegram.ui.ActionBar.b2[]) this.e;
        MessageObject messageObject = (MessageObject) this.f;
        org.telegram.ui.w5 w5Var = (org.telegram.ui.w5) this.b;
        sn snVar = enVar.a;
        if (message.suggested_post.schedule_date != 0) {
            snVar.getMessagesController().approveSuggestedMessage(DialogObject.getPeerDialogId(messageObject.messageOwner.peer_id), messageObject.messageOwner.id, 0);
            return;
        }
        b2VarArr[0].setOnDismissListener(null);
        org.telegram.ui.ActionBar.f3 f3Var = org.telegram.ui.Components.f5.S(snVar.getParentActivity(), 0L, new m4.y0(16, enVar, messageObject), snVar.getResourceProvider(), 1).a;
        f3Var.show();
        f3Var.setOnDismissListener(w5Var);
    }

    private final void d() {
        yo yoVar = (yo) this.c;
        String str = (String) this.d;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.b;
        TLObject tLObject = (TLObject) this.e;
        TLRPC.TL_channels_checkUsername tL_channels_checkUsername = (TLRPC.TL_channels_checkUsername) this.f;
        yoVar.h0 = 0;
        String str2 = yoVar.i0;
        if (str2 == null || !str2.equals(str)) {
            return;
        }
        if (tL_error == null && (tLObject instanceof TLRPC.TL_boolTrue)) {
            yoVar.f.setText(LocaleController.formatString("LinkAvailable", R.string.LinkAvailable, str));
            yoVar.f.setTextColorByKey(org.telegram.ui.ActionBar.h6.w6);
            yoVar.k0 = true;
            return;
        }
        if (tL_error != null && "USERNAME_INVALID".equals(tL_error.text) && tL_channels_checkUsername.username.length() == 4) {
            yoVar.f.setText(LocaleController.getString(R.string.UsernameInvalidShort));
            yoVar.f.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.p7, false));
        } else if (tL_error != null && "USERNAME_PURCHASE_AVAILABLE".equals(tL_error.text)) {
            if (tL_channels_checkUsername.username.length() == 4) {
                yoVar.f.setText(LocaleController.getString(R.string.UsernameInvalidShortPurchase));
            } else {
                yoVar.f.setText(LocaleController.getString(R.string.UsernameInUsePurchase));
            }
            yoVar.f.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.F6, false));
        } else if (tL_error == null || !"CHANNELS_ADMIN_PUBLIC_TOO_MUCH".equals(tL_error.text)) {
            yoVar.f.setText(LocaleController.getString(R.string.LinkInUse));
            yoVar.f.setTextColorByKey(org.telegram.ui.ActionBar.h6.p7);
        } else {
            yoVar.c0 = false;
            yoVar.Z();
        }
        yoVar.k0 = false;
    }

    private final void f() {
        dq.Y((dq) this.c, (TLRPC.TL_error) this.b, (TLRPC.InputCheckPasswordSRP) this.d, (TwoStepVerificationActivity) this.e, (TLRPC.TL_channels_editCreator) this.f);
    }

    /* JADX WARN: Code restructure failed: missing block: B:427:0x0a27, code lost:
    
        if (r2 == 0) goto L364;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:217:0x05af  */
    /* JADX WARN: Removed duplicated region for block: B:432:0x0a35  */
    /* JADX WARN: Type inference failed for: r2v201 */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r2v28 */
    /* JADX WARN: Type inference failed for: r2v30, types: [org.telegram.SQLite.SQLiteCursor] */
    /* JADX WARN: Type inference failed for: r6v8, types: [org.telegram.tgnet.InputSerializedData, org.telegram.tgnet.NativeByteBuffer] */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v50, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9, types: [boolean, int] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        fo0 fo0Var;
        fo0 fo0Var2;
        SQLiteCursor sQLiteCursor;
        long j10;
        ?? r22;
        int i10;
        SQLiteCursor sQLiteCursor2;
        TL_stars.SavedStarGift savedStarGift;
        fo0 fo0Var3;
        boolean z10;
        ArrayList arrayList;
        int i11;
        TLRPC.MessageMedia messageMedia;
        TLRPC.Document document;
        TLRPC.TL_documentAttributeVideo tL_documentAttributeVideo;
        long j11;
        ci.q4 q4Var;
        ci.z9 z9Var;
        org.telegram.ui.ActionBar.d6 d6Var;
        int i12;
        int i13;
        int i14 = 9;
        int i15 = 3;
        int i16 = 1;
        int i17 = 0;
        switch (this.a) {
            case 0:
                b1 b1Var = (b1) this.c;
                pf.c cVar = (pf.c) this.d;
                org.telegram.ui.ActionBar.b2 b2Var = (org.telegram.ui.ActionBar.b2) this.e;
                TLRPC.Updates updates = (TLRPC.Updates) this.f;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.b;
                b2 b2Var2 = b1Var.q0;
                if (b2Var2 != null) {
                    b2Var2.run();
                }
                cVar.c(false);
                b2Var.dismiss();
                b1Var.dismiss();
                org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                if (U != null) {
                    if (updates == null) {
                        org.telegram.ui.Components.xc.a0(U).f0(tL_error, false);
                        return;
                    }
                    org.telegram.ui.Components.qc M = org.telegram.ui.Components.xc.a0(U).M(LocaleController.getString(R.string.GiftOfferSentTitle), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftOfferSentText, b1Var.Z, DialogObject.getShortName(b1Var.a0))), R.raw.forward);
                    M.t = true;
                    M.j();
                    return;
                }
                return;
            case 1:
                fa faVar = (fa) this.c;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.b;
                org.telegram.ui.Wallet.s1 s1Var = (org.telegram.ui.Wallet.s1) this.d;
                TLObject tLObject = (TLObject) this.e;
                TLRPC.TL_inputInvoiceStars tL_inputInvoiceStars = (TLRPC.TL_inputInvoiceStars) this.f;
                if (tL_error2 != null) {
                    s1Var.run(Boolean.FALSE, tL_error2.text);
                    return;
                }
                if (tLObject instanceof TLRPC.PaymentForm) {
                    TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject;
                    paymentForm.invoice.recurring = true;
                    MessagesController.getInstance(faVar.a).putUsers(paymentForm.users, false);
                    fo0Var = new fo0(paymentForm, tL_inputInvoiceStars, null);
                } else {
                    fo0Var = tLObject instanceof TLRPC.PaymentReceipt ? new fo0((TLRPC.PaymentReceipt) tLObject) : null;
                }
                if (fo0Var == null) {
                    s1Var.run(Boolean.FALSE, "UNKNOWN_RESPONSE");
                    return;
                }
                fo0Var.Z0 = new a1.c(s1Var, i14);
                org.telegram.ui.ActionBar.n2 R = LaunchActivity.R();
                if (R == null) {
                    return;
                }
                if (!AndroidUtilities.hasDialogOnTop(R)) {
                    R.presentFragment(fo0Var);
                    return;
                }
                org.telegram.ui.ActionBar.l2 l2Var = new org.telegram.ui.ActionBar.l2();
                l2Var.a = true;
                R.showAsSheet(fo0Var, l2Var);
                return;
            case 2:
                fa faVar2 = (fa) this.c;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.b;
                sc scVar = (sc) this.d;
                TLObject tLObject2 = (TLObject) this.e;
                TLRPC.TL_inputInvoiceStars tL_inputInvoiceStars2 = (TLRPC.TL_inputInvoiceStars) this.f;
                if (tL_error3 != null) {
                    scVar.run(Boolean.FALSE, tL_error3.text);
                    return;
                }
                if (tLObject2 instanceof TLRPC.PaymentForm) {
                    TLRPC.PaymentForm paymentForm2 = (TLRPC.PaymentForm) tLObject2;
                    paymentForm2.invoice.recurring = true;
                    MessagesController.getInstance(faVar2.a).putUsers(paymentForm2.users, false);
                    fo0Var2 = new fo0(paymentForm2, tL_inputInvoiceStars2, null);
                } else {
                    fo0Var2 = tLObject2 instanceof TLRPC.PaymentReceipt ? new fo0((TLRPC.PaymentReceipt) tLObject2) : null;
                }
                if (fo0Var2 == null) {
                    scVar.run(Boolean.FALSE, "UNKNOWN_RESPONSE");
                    return;
                }
                fo0Var2.Z0 = new a1.c(scVar, 10);
                org.telegram.ui.ActionBar.n2 R2 = LaunchActivity.R();
                if (R2 == null) {
                    return;
                }
                if (!AndroidUtilities.hasDialogOnTop(R2)) {
                    R2.presentFragment(fo0Var2);
                    return;
                }
                org.telegram.ui.ActionBar.l2 l2Var2 = new org.telegram.ui.ActionBar.l2();
                l2Var2.a = true;
                R2.showAsSheet(fo0Var2, l2Var2);
                return;
            case 3:
                fa faVar3 = (fa) this.c;
                boolean[] zArr = (boolean[]) this.d;
                String str = (String) this.e;
                TLRPC.ChatInvite chatInvite = (TLRPC.ChatInvite) this.f;
                Utilities.Callback2 callback2 = (Utilities.Callback2) this.b;
                zArr[0] = true;
                faVar3.Z(str, chatInvite, new q(callback2, 5));
                return;
            case 4:
                MessagesStorage messagesStorage = (MessagesStorage) this.c;
                ArrayList arrayList2 = (ArrayList) this.d;
                ArrayList<TLRPC.Chat> arrayList3 = (ArrayList) this.e;
                ArrayList<TLRPC.User> arrayList4 = (ArrayList) this.f;
                a1.c cVar2 = (a1.c) this.b;
                try {
                    ?? r72 = 0;
                    r22 = messagesStorage.getDatabase().queryFinalized("SELECT data, hash, time FROM star_gifts2 ORDER BY pos ASC", new Object[0]);
                    i10 = 0;
                    j10 = 0;
                    while (r22.next()) {
                        try {
                            try {
                                ?? byteBufferValue = r22.byteBufferValue(r72);
                                if (byteBufferValue != 0) {
                                    TL_stars.StarGift TLdeserialize = TL_stars.StarGift.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(r72), r72);
                                    if (TLdeserialize != null) {
                                        arrayList2.add(TLdeserialize);
                                    }
                                    byteBufferValue.reuse();
                                    i10 = (int) r22.longValue(1);
                                    j10 = r22.longValue(2);
                                }
                                r72 = 0;
                            } catch (Exception e) {
                                e = e;
                                r22 = r22;
                                FileLog.e(e);
                                sQLiteCursor2 = r22;
                                break;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            sQLiteCursor = r22;
                            if (sQLiteCursor != null) {
                                sQLiteCursor.dispose();
                            }
                            throw th;
                        }
                    }
                    ArrayList<Long> arrayList5 = new ArrayList<>();
                    ArrayList arrayList6 = new ArrayList();
                    int size = arrayList2.size();
                    int i18 = 0;
                    while (i18 < size) {
                        Object obj = arrayList2.get(i18);
                        i18++;
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
                    sQLiteCursor2 = r22;
                    if (!arrayList5.isEmpty()) {
                        messagesStorage.getUsersInternal(arrayList5, arrayList4);
                        sQLiteCursor2 = r22;
                    }
                } catch (Exception e7) {
                    e = e7;
                    j10 = 0;
                    r22 = 0;
                    i10 = 0;
                } catch (Throwable th3) {
                    th = th3;
                    sQLiteCursor = null;
                    if (sQLiteCursor != null) {
                    }
                    throw th;
                }
                sQLiteCursor2.dispose();
                AndroidUtilities.runOnUIThread(new e9(cVar2, arrayList2, i10, j10, arrayList4, arrayList3));
                return;
            case 5:
                fa faVar4 = (fa) this.c;
                org.telegram.ui.ActionBar.b2 b2Var3 = (org.telegram.ui.ActionBar.b2) this.e;
                TLObject tLObject3 = (TLObject) this.d;
                TL_stars.InputSavedStarGift inputSavedStarGift = (TL_stars.InputSavedStarGift) this.f;
                Utilities.Callback callback = (Utilities.Callback) this.b;
                int i19 = faVar4.a;
                b2Var3.dismiss();
                if (tLObject3 instanceof TL_stars.TL_payments_savedStarGifts) {
                    TL_stars.TL_payments_savedStarGifts tL_payments_savedStarGifts = (TL_stars.TL_payments_savedStarGifts) tLObject3;
                    MessagesController.getInstance(i19).putUsers(tL_payments_savedStarGifts.users, false);
                    MessagesController.getInstance(i19).putChats(tL_payments_savedStarGifts.chats, false);
                    for (int i20 = 0; i20 < tL_payments_savedStarGifts.gifts.size(); i20++) {
                        TL_stars.SavedStarGift savedStarGift2 = tL_payments_savedStarGifts.gifts.get(i20);
                        if (((inputSavedStarGift instanceof TL_stars.TL_inputSavedStarGiftUser) && ((TL_stars.TL_inputSavedStarGiftUser) inputSavedStarGift).msg_id == savedStarGift2.msg_id) || ((inputSavedStarGift instanceof TL_stars.TL_inputSavedStarGiftChat) && ((TL_stars.TL_inputSavedStarGiftChat) inputSavedStarGift).saved_id == savedStarGift2.saved_id)) {
                            savedStarGift = savedStarGift2;
                            callback.run(savedStarGift);
                            return;
                        }
                    }
                }
                savedStarGift = null;
                callback.run(savedStarGift);
                return;
            case 6:
                fa faVar5 = (fa) this.c;
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
                    MessagesController.getInstance(faVar5.a).putUsers(paymentForm3.users, false);
                    fo0Var3 = new fo0(paymentForm3, tL_inputInvoiceStars3, null);
                } else {
                    fo0Var3 = tLObject4 instanceof TLRPC.PaymentReceipt ? new fo0((TLRPC.PaymentReceipt) tLObject4) : null;
                }
                if (fo0Var3 == null) {
                    callback22.run(Boolean.FALSE, "UNKNOWN_RESPONSE");
                    return;
                }
                fo0Var3.Z0 = new a1.c(callback22, 8);
                org.telegram.ui.ActionBar.n2 R3 = LaunchActivity.R();
                if (R3 == null) {
                    return;
                }
                if (!AndroidUtilities.hasDialogOnTop(R3)) {
                    R3.presentFragment(fo0Var3);
                    return;
                }
                org.telegram.ui.ActionBar.l2 l2Var3 = new org.telegram.ui.ActionBar.l2();
                l2Var3.a = true;
                R3.showAsSheet(fo0Var3, l2Var3);
                return;
            case 7:
                List list = (List) this.c;
                Utilities.Callback2 callback23 = (Utilities.Callback2) this.d;
                TLRPC.TL_inputStorePaymentStarsTopup tL_inputStorePaymentStarsTopup = (TLRPC.TL_inputStorePaymentStarsTopup) this.e;
                TL_stars.TL_starsTopupOption tL_starsTopupOption = (TL_stars.TL_starsTopupOption) this.f;
                Activity activity = (Activity) this.b;
                if (list.isEmpty()) {
                    FileLog.d("StarsController.buy queryProductDetails done: no products");
                    AndroidUtilities.runOnUIThread(new r7(2, callback23));
                    return;
                }
                c5.o oVar = (c5.o) list.get(0);
                c5.l a2 = oVar.a();
                if (a2 == null) {
                    FileLog.d("StarsController.buy queryProductDetails done: no details");
                    AndroidUtilities.runOnUIThread(new r7(3, callback23));
                    return;
                }
                tL_inputStorePaymentStarsTopup.currency = a2.c;
                tL_inputStorePaymentStarsTopup.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsTopupOption.currency)) * (a2.b / Math.pow(10.0d, 6.0d)));
                BillingController.getInstance().addResultListener(oVar.c, new q7(callback23, 0));
                BillingController.getInstance().setOnCanceled(new r7(false ? 1 : 0, callback23));
                FileLog.d("StarsController.buy launchBillingFlow");
                BillingController billingController = BillingController.getInstance();
                AccountInstance accountInstance = AccountInstance.getInstance(UserConfig.selectedAccount);
                n4.s sVar = new n4.s(i14, false ? 1 : 0);
                sVar.K((c5.o) list.get(0));
                billingController.launchBillingFlow(activity, accountInstance, tL_inputStorePaymentStarsTopup, Collections.singletonList(sVar.j()));
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
                ci.q4 q4Var2 = (ci.q4) this.c;
                Runnable runnable2 = (Runnable) this.d;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) this.b;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) this.e;
                ei.p9 p9Var = (ei.p9) this.f;
                org.telegram.ui.ActionBar.d6 d6Var2 = q4Var2.B0;
                ci.r3 r3Var = q4Var2.c1;
                if (runnable2 != null) {
                    runnable2.run();
                }
                if (tL_error5 == null || "STORY_NOT_MODIFIED".equals(tL_error5.text)) {
                    storyItem.parsedPrivacy = p9Var;
                    ArrayList arrayList7 = p9Var.b;
                    int i21 = p9Var.a;
                    ArrayList arrayList8 = p9Var.c;
                    ArrayList<TLRPC.PrivacyRule> arrayList9 = new ArrayList<>();
                    int i22 = 0;
                    while (i22 < arrayList7.size()) {
                        TLRPC.InputPrivacyRule inputPrivacyRule = (TLRPC.InputPrivacyRule) arrayList7.get(i22);
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
                                int i23 = 0;
                                while (i23 < tL_inputPrivacyValueDisallowUsers.users.size()) {
                                    i23 = com.google.android.gms.internal.cast.a6.h(tL_inputPrivacyValueDisallowUsers.users.get(i23).user_id, tL_privacyValueDisallowUsers.users, i23, 1);
                                    tL_inputPrivacyValueDisallowUsers = tL_inputPrivacyValueDisallowUsers;
                                    arrayList7 = arrayList7;
                                }
                                arrayList = arrayList7;
                                arrayList9.add(tL_privacyValueDisallowUsers);
                            } else {
                                arrayList = arrayList7;
                                if (inputPrivacyRule instanceof TLRPC.TL_inputPrivacyValueAllowUsers) {
                                    TLRPC.TL_privacyValueAllowUsers tL_privacyValueAllowUsers = new TLRPC.TL_privacyValueAllowUsers();
                                    int i24 = 0;
                                    for (TLRPC.TL_inputPrivacyValueAllowUsers tL_inputPrivacyValueAllowUsers = (TLRPC.TL_inputPrivacyValueAllowUsers) inputPrivacyRule; i24 < tL_inputPrivacyValueAllowUsers.users.size(); tL_inputPrivacyValueAllowUsers = tL_inputPrivacyValueAllowUsers) {
                                        i24 = com.google.android.gms.internal.cast.a6.h(tL_inputPrivacyValueAllowUsers.users.get(i24).user_id, tL_privacyValueAllowUsers.users, i24, 1);
                                    }
                                    i11 = 1;
                                    arrayList9.add(tL_privacyValueAllowUsers);
                                    i22++;
                                    i16 = i11;
                                    arrayList7 = arrayList;
                                }
                            }
                            i11 = 1;
                            i22++;
                            i16 = i11;
                            arrayList7 = arrayList;
                        }
                        arrayList = arrayList7;
                        i11 = i16;
                        i22++;
                        i16 = i11;
                        arrayList7 = arrayList;
                    }
                    int i25 = i16;
                    storyItem.privacy = arrayList9;
                    storyItem.close_friends = i21 == i25;
                    storyItem.contacts = i21 == 2;
                    storyItem.selected_contacts = i21 == 3;
                    MessagesController.getInstance(q4Var2.C2).getStoriesController().p0(storyItem.dialogId, storyItem, true);
                    q4Var2.b4 = true;
                    if (i21 == 4) {
                        new org.telegram.ui.Components.xc(r3Var, d6Var2).Q(R.raw.contact_check, 36, LocaleController.getString("StorySharedToEveryone")).j();
                    } else if (i21 == 1) {
                        new org.telegram.ui.Components.xc(r3Var, d6Var2).Q(R.raw.contact_check, 36, LocaleController.getString("StorySharedToCloseFriends")).j();
                    } else if (i21 == 2) {
                        if (arrayList8.isEmpty()) {
                            new org.telegram.ui.Components.xc(r3Var, d6Var2).Q(R.raw.contact_check, 36, LocaleController.getString("StorySharedToAllContacts")).j();
                        } else {
                            new org.telegram.ui.Components.xc(r3Var, d6Var2).Q(R.raw.contact_check, 36, LocaleController.formatPluralString("StorySharedToAllContactsExcluded", arrayList8.size(), new Object[0])).j();
                        }
                    } else if (i21 == 3) {
                        HashSet hashSet = new HashSet();
                        hashSet.addAll(arrayList8);
                        Iterator it = p9Var.d.values().iterator();
                        while (it.hasNext()) {
                            hashSet.addAll((ArrayList) it.next());
                        }
                        z10 = false;
                        new org.telegram.ui.Components.xc(r3Var, d6Var2).Q(R.raw.contact_check, 36, LocaleController.formatPluralString("StorySharedToContacts", hashSet.size(), new Object[0])).j();
                    }
                    z10 = false;
                } else {
                    org.telegram.messenger.q.q(R.string.UnknownError, new org.telegram.ui.Components.xc(r3Var, d6Var2), R.raw.error, 36);
                    z10 = false;
                }
                q4Var2.f1(z10);
                return;
            case 10:
                ci.h4 h4Var = (ci.h4) this.c;
                Activity activity2 = (Activity) this.d;
                TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) this.e;
                ci.aa aaVar = (ci.aa) this.f;
                ci.n4 n4Var = (ci.n4) this.b;
                ei.vb D = ei.vb.D(activity2, h4Var.l.C2);
                ci.p4 p4Var = h4Var.l.M2;
                long j12 = (p4Var == null || (z9Var = (ci.z9) p4Var.c) == null) ? 0L : z9Var.currentPosition;
                ei.a8 n10 = ei.a8.n(h4Var.l.O1.h(), h4Var.l.O1.a);
                ci.q4 q4Var3 = h4Var.l;
                n10.e = q4Var3.B1;
                TL_stories.StoryItem storyItem3 = q4Var3.O1.a;
                if (storyItem3 != null && (messageMedia = storyItem3.media) != null && (document = messageMedia.document) != null) {
                    int i26 = 0;
                    while (true) {
                        if (i26 >= document.attributes.size()) {
                            tL_documentAttributeVideo = null;
                        } else if (document.attributes.get(i26) instanceof TLRPC.TL_documentAttributeVideo) {
                            tL_documentAttributeVideo = (TLRPC.TL_documentAttributeVideo) document.attributes.get(i26);
                        } else {
                            i26++;
                        }
                    }
                    if (tL_documentAttributeVideo != null) {
                        j11 = (long) (tL_documentAttributeVideo.video_start_ts * 1000.0d);
                        n10.e0 = j11;
                        ei.a8 g10 = n10.g();
                        g10.b0 = true;
                        q4Var = h4Var.l;
                        TL_stories.StoryItem storyItem4 = q4Var.O1.a;
                        g10.c0 = storyItem4.media.document;
                        g10.d0 = new w3(h4Var, storyItem4, storyItem2, i15);
                        if (q4Var.I0()) {
                            ci.q4 q4Var4 = h4Var.l;
                            g10.J0 = q4Var4.B1;
                            g10.L0 = MessagesController.toInputMedia(q4Var4.O1.a.media);
                            ci.a7 a7Var = aaVar.O0;
                            if (a7Var instanceof ci.t6) {
                                g10.K0 = ((ci.t6) a7Var).E;
                            }
                        }
                        D.R(ei.qb.d(aaVar), g10, j12);
                        D.Q = new ci.a4(h4Var, 2);
                        D.R = new ci.d4(h4Var, n4Var, i17);
                        return;
                    }
                }
                j11 = 0;
                n10.e0 = j11;
                ei.a8 g102 = n10.g();
                g102.b0 = true;
                q4Var = h4Var.l;
                TL_stories.StoryItem storyItem42 = q4Var.O1.a;
                g102.c0 = storyItem42.media.document;
                g102.d0 = new w3(h4Var, storyItem42, storyItem2, i15);
                if (q4Var.I0()) {
                }
                D.R(ei.qb.d(aaVar), g102, j12);
                D.Q = new ci.a4(h4Var, 2);
                D.R = new ci.d4(h4Var, n4Var, i17);
                return;
            case 11:
                ci.d5 d5Var = (ci.d5) this.c;
                TLRPC.User user = (TLRPC.User) this.d;
                String str2 = (String) this.e;
                org.telegram.ui.Cells.n6 n6Var = (org.telegram.ui.Cells.n6) this.f;
                TL_stories.StoryView storyView = (TL_stories.StoryView) this.b;
                ArrayList<TLRPC.User> arrayList10 = new ArrayList<>();
                arrayList10.add(user);
                ci.u5 u5Var = d5Var.b;
                ContactsController.getInstance(u5Var.v).deleteContact(arrayList10, false);
                i0.a.s(R.string.DeletedFromYourContacts, new Object[]{str2}, new org.telegram.ui.Components.xc(u5Var, u5Var.s), R.raw.ic_ban, 36);
                n6Var.a(u5Var.d(storyView) ? 1.0f : 0.5f, true);
                return;
            case 12:
                ei.k9 k9Var = (ei.k9) this.c;
                org.telegram.ui.ActionBar.b2 b2Var4 = (org.telegram.ui.ActionBar.b2) this.e;
                TLObject tLObject5 = (TLObject) this.d;
                TL_phone.getGroupCallStreamRtmpUrl getgroupcallstreamrtmpurl = (TL_phone.getGroupCallStreamRtmpUrl) this.f;
                TLRPC.TL_error tL_error6 = (TLRPC.TL_error) this.b;
                ei.r9 r9Var = k9Var.W;
                b2Var4.dismiss();
                if (!(tLObject5 instanceof TL_phone.groupCallStreamRtmpUrl)) {
                    if (tL_error6 != null) {
                        org.telegram.ui.ActionBar.d3 d3Var = r9Var.container;
                        d6Var = ((org.telegram.ui.ActionBar.f3) r9Var).resourcesProvider;
                        new org.telegram.ui.Components.xc(d3Var, d6Var).f0(tL_error6, true);
                        return;
                    }
                    return;
                }
                xr[] xrVarArr = new xr[1];
                Context context = k9Var.getContext();
                i12 = ((org.telegram.ui.ActionBar.f3) r9Var).currentAccount;
                xr xrVar = new xr(context, i12, getgroupcallstreamrtmpurl, (TL_phone.groupCallStreamRtmpUrl) tLObject5, r9Var.L ? null : new n2(12, k9Var, xrVarArr), new ci.b());
                xrVarArr[0] = xrVar;
                xrVar.show();
                return;
            case 13:
                ei.gc.a((ei.gc) this.c, (ViewGroup) this.d, (org.telegram.ui.ActionBar.d6) this.e, (org.telegram.ui.Components.ja) this.f, (View) this.b);
                return;
            case 14:
                hg.c2 c2Var = (hg.c2) this.c;
                TLRPC.TL_messages_getStickers tL_messages_getStickers = (TLRPC.TL_messages_getStickers) this.d;
                TLObject tLObject6 = (TLObject) this.e;
                ArrayList arrayList11 = (ArrayList) this.f;
                LongSparseArray longSparseArray = (LongSparseArray) this.b;
                c2Var.getClass();
                String str3 = tL_messages_getStickers.emoticon;
                hg.e2 e2Var = c2Var.a;
                if (str3.equals(e2Var.R)) {
                    e2Var.O = 0;
                    if (tLObject6 instanceof TLRPC.TL_messages_stickers) {
                        TLRPC.TL_messages_stickers tL_messages_stickers = (TLRPC.TL_messages_stickers) tLObject6;
                        int size2 = arrayList11.size();
                        int size3 = tL_messages_stickers.stickers.size();
                        while (i17 < size3) {
                            TLRPC.Document document2 = tL_messages_stickers.stickers.get(i17);
                            if (longSparseArray.indexOfKey(document2.id) < 0) {
                                arrayList11.add(document2);
                            }
                            i17++;
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
                ig.y1 y1Var = (ig.y1) this.c;
                ArrayList<TLRPC.User> arrayList12 = (ArrayList) this.d;
                ArrayList<TLRPC.Chat> arrayList13 = (ArrayList) this.e;
                ArrayList arrayList14 = (ArrayList) this.f;
                Runnable runnable3 = (Runnable) this.b;
                y1Var.e = false;
                int i27 = y1Var.a;
                MessagesController.getInstance(i27).putUsers(arrayList12, true);
                MessagesController.getInstance(i27).putChats(arrayList13, true);
                ArrayList arrayList15 = y1Var.b;
                arrayList15.clear();
                arrayList15.addAll(arrayList14);
                if (runnable3 != null) {
                    runnable3.run();
                } else {
                    y1Var.i(null, false);
                }
                NotificationCenter.getInstance(i27).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                return;
            case 16:
                ig.y1 y1Var2 = (ig.y1) this.c;
                ArrayList<TLRPC.User> arrayList16 = (ArrayList) this.d;
                ArrayList<TLRPC.Chat> arrayList17 = (ArrayList) this.e;
                ig.x1 x1Var = (ig.x1) this.f;
                MessageObject messageObject = (MessageObject) this.b;
                int i28 = y1Var2.a;
                MessagesController.getInstance(i28).putUsers(arrayList16, true);
                MessagesController.getInstance(i28).putChats(arrayList17, true);
                x1Var.e = messageObject;
                if (messageObject != null) {
                    messageObject.applyQuickReply(x1Var.b, x1Var.a);
                }
                y1Var2.l();
                NotificationCenter.getInstance(i28).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                return;
            case 17:
                ig.y1 y1Var3 = (ig.y1) this.c;
                TLObject tLObject7 = (TLObject) this.d;
                ArrayList<Integer> arrayList18 = (ArrayList) this.e;
                TLRPC.TL_messages_sendQuickReplyMessages tL_messages_sendQuickReplyMessages = (TLRPC.TL_messages_sendQuickReplyMessages) this.f;
                TLRPC.TL_error tL_error7 = (TLRPC.TL_error) this.b;
                y1Var3.getClass();
                if (!(tLObject7 instanceof TLRPC.TL_messages_messages)) {
                    FileLog.e("received " + tLObject7 + " " + tL_error7 + " on getQuickReplyMessages when trying to send quick reply");
                    return;
                }
                ArrayList<TLRPC.Message> arrayList19 = ((TLRPC.TL_messages_messages) tLObject7).messages;
                arrayList18.clear();
                int size4 = arrayList19.size();
                int i29 = 0;
                while (i29 < size4) {
                    TLRPC.Message message = arrayList19.get(i29);
                    i29++;
                    arrayList18.add(Integer.valueOf(message.id));
                }
                tL_messages_sendQuickReplyMessages.id = arrayList18;
                while (i17 < arrayList18.size()) {
                    tL_messages_sendQuickReplyMessages.random_id.add(Long.valueOf(Utilities.random.nextLong()));
                    i17++;
                }
                ConnectionsManager.getInstance(y1Var3.a).sendRequest(tL_messages_sendQuickReplyMessages, null);
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
                c91 c91Var = v7Var.h;
                for (int i30 = 0; i30 < c91Var.getViewPages().length; i30++) {
                    im0 im0Var = (im0) c91Var.getViewPages()[i30];
                    if (im0Var != null && ((org.telegram.ui.i7) im0Var.getAdapter()).d == 3) {
                        org.telegram.ui.i7 i7Var = (org.telegram.ui.i7) im0Var.getAdapter();
                        int i31 = 0;
                        while (true) {
                            if (i31 >= i7Var.e.size()) {
                                break;
                            } else if (((org.telegram.ui.p7) i7Var.e.get(i31)).d == bVar) {
                                i7Var.m(i31);
                            } else {
                                i31++;
                            }
                        }
                    }
                }
                return;
            case 21:
                org.telegram.ui.ua uaVar = (org.telegram.ui.ua) this.c;
                String str6 = (String) this.d;
                TLRPC.TL_error tL_error8 = (TLRPC.TL_error) this.b;
                TLObject tLObject8 = (TLObject) this.e;
                TL_account.checkUsername checkusername = (TL_account.checkUsername) this.f;
                uaVar.e = 0;
                String str7 = uaVar.f;
                if (str7 == null || !str7.equals(str6)) {
                    return;
                }
                if (tL_error8 == null && (tLObject8 instanceof TLRPC.TL_boolTrue)) {
                    org.telegram.ui.Cells.y1 y1Var4 = uaVar.G;
                    if (y1Var4 != null) {
                        y1Var4.setText(LocaleController.formatString("UsernameAvailable", R.string.UsernameAvailable, str6));
                        org.telegram.ui.Cells.y1 y1Var5 = uaVar.G;
                        int i32 = org.telegram.ui.ActionBar.h6.w6;
                        y1Var5.setTag(Integer.valueOf(i32));
                        uaVar.G.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i32, false));
                        org.telegram.ui.ta taVar = uaVar.F;
                        if (taVar != null) {
                            org.telegram.ui.ta.a(taVar);
                            return;
                        }
                        return;
                    }
                    return;
                }
                if (uaVar.G != null) {
                    if (tL_error8 != null && "USERNAME_INVALID".equals(tL_error8.text) && checkusername.username.length() == 4) {
                        uaVar.G.setText(LocaleController.getString(R.string.UsernameInvalidShort));
                        org.telegram.ui.Cells.y1 y1Var6 = uaVar.G;
                        int i33 = org.telegram.ui.ActionBar.h6.p7;
                        y1Var6.setTag(Integer.valueOf(i33));
                        uaVar.G.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i33, false));
                    } else if (tL_error8 == null || !"USERNAME_PURCHASE_AVAILABLE".equals(tL_error8.text)) {
                        uaVar.G.setText(LocaleController.getString(R.string.UsernameInUse));
                        org.telegram.ui.Cells.y1 y1Var7 = uaVar.G;
                        int i34 = org.telegram.ui.ActionBar.h6.p7;
                        y1Var7.setTag(Integer.valueOf(i34));
                        uaVar.G.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i34, false));
                    } else {
                        if (checkusername.username.length() == 4) {
                            uaVar.G.setText(LocaleController.getString(R.string.UsernameInvalidShortPurchase));
                        } else {
                            uaVar.G.setText(LocaleController.getString(R.string.UsernameInUsePurchase));
                        }
                        org.telegram.ui.Cells.y1 y1Var8 = uaVar.G;
                        int i35 = org.telegram.ui.ActionBar.h6.F6;
                        y1Var8.setTag(Integer.valueOf(i35));
                        uaVar.G.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i35, false));
                    }
                    org.telegram.ui.ta taVar2 = uaVar.F;
                    if (taVar2 != null) {
                        org.telegram.ui.ta.a(taVar2);
                        return;
                    }
                    return;
                }
                return;
            case 22:
                org.telegram.ui.rb rbVar = (org.telegram.ui.rb) this.c;
                TLRPC.TL_chatInviteExported tL_chatInviteExported = (TLRPC.TL_chatInviteExported) this.d;
                TLRPC.TL_messages_exportedChatInvite tL_messages_exportedChatInvite = (TLRPC.TL_messages_exportedChatInvite) this.f;
                boolean[] zArr2 = (boolean[]) this.b;
                org.telegram.ui.ActionBar.b2 b2Var5 = (org.telegram.ui.ActionBar.b2) this.e;
                org.telegram.ui.xb xbVar = rbVar.a.n;
                xbVar.A0 = false;
                xbVar.y0.put(tL_chatInviteExported.link, tL_messages_exportedChatInvite == null ? 0 : tL_messages_exportedChatInvite);
                if (zArr2[0]) {
                    return;
                }
                b2Var5.dismiss();
                if (tL_messages_exportedChatInvite != null) {
                    org.telegram.ui.xb.A0(xbVar, tL_messages_exportedChatInvite, xbVar.z0);
                    return;
                } else {
                    org.telegram.messenger.q.q(R.string.LinkHashExpired, org.telegram.ui.Components.xc.a0(xbVar), R.raw.linkbroken, 36);
                    return;
                }
            case 23:
                org.telegram.ui.dd ddVar = (org.telegram.ui.dd) this.c;
                boolean[] zArr3 = (boolean[]) this.d;
                int[] iArr = (int[]) this.e;
                int[] iArr2 = (int[]) this.f;
                TLRPC.TL_error tL_error9 = (TLRPC.TL_error) this.b;
                if (zArr3[0] || (i13 = iArr[0]) >= iArr2[0]) {
                    return;
                }
                if (tL_error9 != null) {
                    zArr3[0] = true;
                    if ("BOOSTS_REQUIRED".equals(tL_error9.text)) {
                        ddVar.getMessagesController().getBoostsController().userCanBoostChannel(ddVar.a, ddVar.c, new org.telegram.ui.hc(ddVar, i16));
                        return;
                    } else {
                        ddVar.P.setLoading(false);
                        i0.a.s(R.string.UnknownErrorCode, new Object[]{tL_error9.text}, org.telegram.ui.Components.xc.a0(ddVar), R.raw.error, 36);
                        return;
                    }
                }
                int i36 = i13 + 1;
                iArr[0] = i36;
                if (i36 == iArr2[0]) {
                    ddVar.finishFragment();
                    org.telegram.ui.ActionBar.n2 n2Var = ddVar.l0;
                    if (n2Var != null) {
                        if (n2Var instanceof ko) {
                            ((ko) n2Var).o0();
                        }
                        org.telegram.messenger.q.q(ddVar.d ? R.string.GroupAppearanceUpdated : R.string.ChannelAppearanceUpdated, org.telegram.ui.Components.xc.a0(ddVar.l0), R.raw.contact_check, 36);
                        ddVar.l0 = null;
                    }
                    ddVar.P.setLoading(false);
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
                    int i37 = irVar.r;
                    irVar.l();
                    if (irVar.r > i37) {
                        jrVar.y0(i37);
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

    public /* synthetic */ t0(Object obj, org.telegram.ui.ActionBar.b2 b2Var, TLObject tLObject, TLObject tLObject2, Object obj2, int i10) {
        this.a = i10;
        this.c = obj;
        this.e = b2Var;
        this.d = tLObject;
        this.f = tLObject2;
        this.b = obj2;
    }

    public /* synthetic */ t0(org.telegram.ui.rb rbVar, TLRPC.TL_chatInviteExported tL_chatInviteExported, TLRPC.TL_messages_exportedChatInvite tL_messages_exportedChatInvite, boolean[] zArr, org.telegram.ui.ActionBar.b2 b2Var) {
        this.a = 22;
        this.c = rbVar;
        this.d = tL_chatInviteExported;
        this.f = tL_messages_exportedChatInvite;
        this.b = zArr;
        this.e = b2Var;
    }
}
