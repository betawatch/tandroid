package bg;

import android.app.Activity;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.text.TextUtils;
import android.util.LongSparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import fh.k6;
import fh.u6;
import fh.w5;
import gh.i3;
import gh.q5;
import gh.v7;
import gh.w6;
import ih.b4;
import ih.f4;
import ih.g5;
import ih.h4;
import ih.i4;
import ih.l3;
import ih.l9;
import ih.m9;
import ih.n6;
import ih.q4;
import ih.u3;
import ih.v3;
import ih.x3;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kh.a8;
import kh.n9;
import kh.r9;
import kh.rb;
import kh.t9;
import kh.wb;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.camera.CameraSession;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.ba;
import org.telegram.ui.Components.cr;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.n71;
import org.telegram.ui.Components.oc;
import org.telegram.ui.Components.wk0;
import org.telegram.ui.Components.y4;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.bc;
import org.telegram.ui.bq;
import org.telegram.ui.cn;
import org.telegram.ui.co0;
import org.telegram.ui.e7;
import org.telegram.ui.ho;
import org.telegram.ui.id;
import org.telegram.ui.jb;
import org.telegram.ui.l7;
import org.telegram.ui.la;
import org.telegram.ui.ma;
import org.telegram.ui.pb;
import org.telegram.ui.qn;
import org.telegram.ui.r5;
import org.telegram.ui.r7;
import org.telegram.ui.vo;
import org.telegram.ui.xc;
import org.telegram.ui.y9;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class o0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ o0(g3 g3Var, TLObject tLObject, TLRPC.UserFull userFull, TL_account.TL_birthday tL_birthday, TLRPC.TL_error tL_error) {
        this.a = 3;
        this.e = g3Var;
        this.c = tLObject;
        this.f = userFull;
        this.d = tL_birthday;
        this.b = tL_error;
    }

    private final void a() {
        id idVar = (id) this.e;
        String str = (String) this.f;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.b;
        TLObject tLObject = (TLObject) this.c;
        TLRPC.TL_channels_checkUsername tL_channels_checkUsername = (TLRPC.TL_channels_checkUsername) this.d;
        idVar.S = 0;
        String str2 = idVar.T;
        if (str2 == null || !str2.equals(str)) {
            return;
        }
        if (tL_error == null && (tLObject instanceof TLRPC.TL_boolTrue)) {
            idVar.Q.setText(LocaleController.formatString("LinkAvailable", R.string.LinkAvailable, str));
            org.telegram.ui.Cells.x1 x1Var = idVar.Q;
            int i9 = f6.w6;
            x1Var.setTag(Integer.valueOf(i9));
            idVar.Q.setTextColor(f6.w0(null, i9, false));
            idVar.V = true;
            return;
        }
        if (tL_error != null && "USERNAME_INVALID".equals(tL_error.text) && tL_channels_checkUsername.username.length() == 4) {
            idVar.Q.setText(LocaleController.getString(R.string.UsernameInvalidShort));
            idVar.Q.setTextColor(f6.w0(null, f6.p7, false));
        } else if (tL_error != null && "USERNAME_PURCHASE_AVAILABLE".equals(tL_error.text)) {
            if (tL_channels_checkUsername.username.length() == 4) {
                idVar.Q.setText(LocaleController.getString(R.string.UsernameInvalidShortPurchase));
            } else {
                idVar.Q.setText(LocaleController.getString(R.string.UsernameInUsePurchase));
            }
            idVar.Q.setTextColor(f6.w0(null, f6.F6, false));
        } else if (tL_error == null || !"CHANNELS_ADMIN_PUBLIC_TOO_MUCH".equals(tL_error.text)) {
            idVar.Q.setTextColor(f6.w0(null, f6.p7, false));
            idVar.Q.setText(LocaleController.getString(R.string.LinkInUse));
        } else {
            idVar.Q.setTextColor(f6.w0(null, f6.p7, false));
            idVar.f0 = false;
            idVar.e0();
        }
        idVar.V = false;
    }

    private final void b() {
        cn cnVar = (cn) this.b;
        TLRPC.Message message = (TLRPC.Message) this.e;
        org.telegram.ui.ActionBar.c2[] c2VarArr = (org.telegram.ui.ActionBar.c2[]) this.f;
        MessageObject messageObject = (MessageObject) this.c;
        r5 r5Var = (r5) this.d;
        qn qnVar = cnVar.a;
        if (message.suggested_post.schedule_date != 0) {
            qnVar.getMessagesController().approveSuggestedMessage(DialogObject.getPeerDialogId(messageObject.messageOwner.peer_id), messageObject.messageOwner.id, 0);
            return;
        }
        c2VarArr[0].setOnDismissListener(null);
        org.telegram.ui.ActionBar.f3 f3Var = y4.T(qnVar.getParentActivity(), 0L, new v3(20, cnVar, messageObject), qnVar.getResourceProvider(), 1).a;
        f3Var.show();
        f3Var.setOnDismissListener(r5Var);
    }

    private final void c() {
        vo voVar = (vo) this.e;
        String str = (String) this.f;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.b;
        TLObject tLObject = (TLObject) this.c;
        TLRPC.TL_channels_checkUsername tL_channels_checkUsername = (TLRPC.TL_channels_checkUsername) this.d;
        voVar.d0 = 0;
        String str2 = voVar.e0;
        if (str2 == null || !str2.equals(str)) {
            return;
        }
        if (tL_error == null && (tLObject instanceof TLRPC.TL_boolTrue)) {
            voVar.f.setText(LocaleController.formatString("LinkAvailable", R.string.LinkAvailable, str));
            voVar.f.setTextColorByKey(f6.w6);
            voVar.g0 = true;
            return;
        }
        if (tL_error != null && "USERNAME_INVALID".equals(tL_error.text) && tL_channels_checkUsername.username.length() == 4) {
            voVar.f.setText(LocaleController.getString(R.string.UsernameInvalidShort));
            voVar.f.setTextColor(f6.w0(null, f6.p7, false));
        } else if (tL_error != null && "USERNAME_PURCHASE_AVAILABLE".equals(tL_error.text)) {
            if (tL_channels_checkUsername.username.length() == 4) {
                voVar.f.setText(LocaleController.getString(R.string.UsernameInvalidShortPurchase));
            } else {
                voVar.f.setText(LocaleController.getString(R.string.UsernameInUsePurchase));
            }
            voVar.f.setTextColor(f6.w0(null, f6.F6, false));
        } else if (tL_error == null || !"CHANNELS_ADMIN_PUBLIC_TOO_MUCH".equals(tL_error.text)) {
            voVar.f.setText(LocaleController.getString(R.string.LinkInUse));
            voVar.f.setTextColorByKey(f6.p7);
        } else {
            voVar.Y = false;
            voVar.Y();
        }
        voVar.g0 = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:384:0x0924, code lost:
    
        if (r11 == 0) goto L327;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:175:0x04ab  */
    /* JADX WARN: Removed duplicated region for block: B:389:0x0932  */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v13 */
    /* JADX WARN: Type inference failed for: r11v15, types: [org.telegram.SQLite.SQLiteCursor] */
    /* JADX WARN: Type inference failed for: r11v38 */
    /* JADX WARN: Type inference failed for: r3v26, types: [org.telegram.tgnet.InputSerializedData, org.telegram.tgnet.NativeByteBuffer] */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r7v19 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        co0 co0Var;
        co0 co0Var2;
        SQLiteCursor sQLiteCursor;
        long j10;
        int i9;
        ?? r11;
        SQLiteCursor sQLiteCursor2;
        TL_stars.SavedStarGift savedStarGift;
        co0 co0Var3;
        boolean z10;
        ArrayList arrayList;
        TLRPC.MessageMedia messageMedia;
        TLRPC.Document document;
        TLRPC.TL_documentAttributeVideo tL_documentAttributeVideo;
        long j11;
        i4 i4Var;
        l9 l9Var;
        b6 b6Var;
        int i10;
        int i11;
        int i12 = 23;
        int i13 = 5;
        int i14 = 4;
        int i15 = 0;
        switch (this.a) {
            case 0:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.b;
                Utilities.Callback callback = (Utilities.Callback) this.e;
                TLObject tLObject = (TLObject) this.c;
                MessagesController messagesController = (MessagesController) this.d;
                Utilities.Callback callback2 = (Utilities.Callback) this.f;
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
            case 1:
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.b;
                org.telegram.messenger.w wVar = (org.telegram.messenger.w) this.e;
                TLObject tLObject2 = (TLObject) this.c;
                MessagesController messagesController2 = (MessagesController) this.d;
                org.telegram.messenger.g2 g2Var = (org.telegram.messenger.g2) this.f;
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
            case 2:
                TLObject tLObject3 = (TLObject) this.c;
                MessagesController messagesController3 = (MessagesController) this.d;
                j1 j1Var = (j1) this.e;
                p pVar = (p) this.f;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.b;
                if (tLObject3 instanceof TLRPC.TL_payments_checkedGiftCode) {
                    TLRPC.TL_payments_checkedGiftCode tL_payments_checkedGiftCode = (TLRPC.TL_payments_checkedGiftCode) tLObject3;
                    messagesController3.putChats(tL_payments_checkedGiftCode.chats, false);
                    messagesController3.putUsers(tL_payments_checkedGiftCode.users, false);
                    j1Var.run(tL_payments_checkedGiftCode);
                }
                pVar.run(tL_error3);
                return;
            case 3:
                g3.Q((g3) this.e, (TLObject) this.c, (TLRPC.UserFull) this.f, (TL_account.TL_birthday) this.d, (TLRPC.TL_error) this.b);
                return;
            case 4:
                u6 u6Var = (u6) this.e;
                TLObject tLObject4 = (TLObject) this.c;
                TLRPC.TL_inputStorePaymentGiftPremium tL_inputStorePaymentGiftPremium = (TLRPC.TL_inputStorePaymentGiftPremium) this.f;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) this.b;
                TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore = (TLRPC.TL_payments_canPurchaseStore) this.d;
                int i16 = u6Var.U;
                org.telegram.ui.ActionBar.o2 o2Var = u6Var.n;
                if (!(tLObject4 instanceof TLRPC.TL_boolTrue)) {
                    if (tL_error4 != null) {
                        y4.f0(i16, tL_error4, o2Var, tL_payments_canPurchaseStore, new Object[0]);
                        return;
                    }
                    return;
                } else {
                    BillingController billingController = BillingController.getInstance();
                    Activity parentActivity = o2Var.getParentActivity();
                    AccountInstance accountInstance = AccountInstance.getInstance(i16);
                    g5.b bVar = new g5.b(i12);
                    bVar.t(u6Var.a0.h);
                    billingController.launchBillingFlow(parentActivity, accountInstance, tL_inputStorePaymentGiftPremium, Collections.singletonList(bVar.h()));
                    return;
                }
            case 5:
                gh.o0 o0Var = (gh.o0) this.e;
                ve.d dVar = (ve.d) this.f;
                org.telegram.ui.ActionBar.c2 c2Var = (org.telegram.ui.ActionBar.c2) this.c;
                TLRPC.Updates updates = (TLRPC.Updates) this.d;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) this.b;
                gh.v1 v1Var = o0Var.m0;
                if (v1Var != null) {
                    v1Var.run();
                }
                dVar.c(false);
                c2Var.dismiss();
                o0Var.dismiss();
                org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                if (U != null) {
                    if (updates == null) {
                        oc.a0(U).d0(tL_error5, false);
                        return;
                    }
                    gc M = oc.a0(U).M(LocaleController.getString(R.string.GiftOfferSentTitle), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftOfferSentText, o0Var.V, DialogObject.getShortName(o0Var.W))), R.raw.forward);
                    M.t = true;
                    M.j();
                    return;
                }
                return;
            case 6:
                v7 v7Var = (v7) this.e;
                TLRPC.TL_error tL_error6 = (TLRPC.TL_error) this.b;
                y0 y0Var = (y0) this.f;
                TLObject tLObject5 = (TLObject) this.c;
                TLRPC.TL_inputInvoiceStars tL_inputInvoiceStars = (TLRPC.TL_inputInvoiceStars) this.d;
                if (tL_error6 != null) {
                    y0Var.run(Boolean.FALSE, tL_error6.text);
                    return;
                }
                if (tLObject5 instanceof TLRPC.PaymentForm) {
                    TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject5;
                    paymentForm.invoice.recurring = true;
                    MessagesController.getInstance(v7Var.a).putUsers(paymentForm.users, false);
                    co0Var = new co0(paymentForm, tL_inputInvoiceStars, null);
                } else {
                    co0Var = tLObject5 instanceof TLRPC.PaymentReceipt ? new co0((TLRPC.PaymentReceipt) tLObject5) : null;
                }
                if (co0Var == null) {
                    y0Var.run(Boolean.FALSE, "UNKNOWN_RESPONSE");
                    return;
                }
                co0Var.V0 = new i3(y0Var, i13);
                org.telegram.ui.ActionBar.o2 R = LaunchActivity.R();
                if (R == null) {
                    return;
                }
                if (!AndroidUtilities.hasDialogOnTop(R)) {
                    R.presentFragment(co0Var);
                    return;
                }
                org.telegram.ui.ActionBar.m2 m2Var = new org.telegram.ui.ActionBar.m2();
                m2Var.a = true;
                R.showAsSheet(co0Var, m2Var);
                return;
            case 7:
                v7 v7Var2 = (v7) this.e;
                TLRPC.TL_error tL_error7 = (TLRPC.TL_error) this.b;
                w5 w5Var = (w5) this.f;
                TLObject tLObject6 = (TLObject) this.c;
                TLRPC.TL_inputInvoiceStars tL_inputInvoiceStars2 = (TLRPC.TL_inputInvoiceStars) this.d;
                if (tL_error7 != null) {
                    w5Var.run(Boolean.FALSE, tL_error7.text);
                    return;
                }
                if (tLObject6 instanceof TLRPC.PaymentForm) {
                    TLRPC.PaymentForm paymentForm2 = (TLRPC.PaymentForm) tLObject6;
                    paymentForm2.invoice.recurring = true;
                    MessagesController.getInstance(v7Var2.a).putUsers(paymentForm2.users, false);
                    co0Var2 = new co0(paymentForm2, tL_inputInvoiceStars2, null);
                } else {
                    co0Var2 = tLObject6 instanceof TLRPC.PaymentReceipt ? new co0((TLRPC.PaymentReceipt) tLObject6) : null;
                }
                if (co0Var2 == null) {
                    w5Var.run(Boolean.FALSE, "UNKNOWN_RESPONSE");
                    return;
                }
                co0Var2.V0 = new i3(w5Var, 6);
                org.telegram.ui.ActionBar.o2 R2 = LaunchActivity.R();
                if (R2 == null) {
                    return;
                }
                if (!AndroidUtilities.hasDialogOnTop(R2)) {
                    R2.presentFragment(co0Var2);
                    return;
                }
                org.telegram.ui.ActionBar.m2 m2Var2 = new org.telegram.ui.ActionBar.m2();
                m2Var2.a = true;
                R2.showAsSheet(co0Var2, m2Var2);
                return;
            case 8:
                v7 v7Var3 = (v7) this.b;
                boolean[] zArr = (boolean[]) this.e;
                String str = (String) this.f;
                TLRPC.ChatInvite chatInvite = (TLRPC.ChatInvite) this.c;
                Utilities.Callback2 callback22 = (Utilities.Callback2) this.d;
                zArr[0] = true;
                v7Var3.Z(str, chatInvite, new bh.c(callback22, 17));
                return;
            case 9:
                MessagesStorage messagesStorage = (MessagesStorage) this.b;
                ArrayList arrayList2 = (ArrayList) this.e;
                ArrayList<TLRPC.Chat> arrayList3 = (ArrayList) this.f;
                ArrayList<TLRPC.User> arrayList4 = (ArrayList) this.c;
                i3 i3Var = (i3) this.d;
                try {
                    ?? r72 = 0;
                    r11 = messagesStorage.getDatabase().queryFinalized("SELECT data, hash, time FROM star_gifts2 ORDER BY pos ASC", new Object[0]);
                    j10 = 0;
                    i9 = 0;
                    while (r11.next()) {
                        try {
                            try {
                                ?? byteBufferValue = r11.byteBufferValue(r72);
                                if (byteBufferValue != 0) {
                                    TL_stars.StarGift TLdeserialize = TL_stars.StarGift.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(r72), r72);
                                    if (TLdeserialize != null) {
                                        arrayList2.add(TLdeserialize);
                                    }
                                    byteBufferValue.reuse();
                                    i9 = (int) r11.longValue(1);
                                    j10 = r11.longValue(2);
                                }
                                r72 = 0;
                            } catch (Exception e10) {
                                e = e10;
                                r11 = r11;
                                FileLog.e(e);
                                sQLiteCursor2 = r11;
                                break;
                            }
                        } catch (Throwable th) {
                            th = th;
                            sQLiteCursor = r11;
                            if (sQLiteCursor != null) {
                                sQLiteCursor.dispose();
                            }
                            throw th;
                        }
                    }
                    ArrayList<Long> arrayList5 = new ArrayList<>();
                    ArrayList arrayList6 = new ArrayList();
                    int size = arrayList2.size();
                    int i17 = 0;
                    while (i17 < size) {
                        Object obj = arrayList2.get(i17);
                        i17++;
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
                    sQLiteCursor2 = r11;
                    if (!arrayList5.isEmpty()) {
                        messagesStorage.getUsersInternal(arrayList5, arrayList4);
                        sQLiteCursor2 = r11;
                    }
                } catch (Exception e11) {
                    e = e11;
                    j10 = 0;
                    i9 = 0;
                    r11 = 0;
                } catch (Throwable th2) {
                    th = th2;
                    sQLiteCursor = null;
                    if (sQLiteCursor != null) {
                    }
                    throw th;
                }
                sQLiteCursor2.dispose();
                AndroidUtilities.runOnUIThread(new w6(i3Var, arrayList2, i9, j10, arrayList4, arrayList3));
                return;
            case 10:
                v7 v7Var4 = (v7) this.b;
                org.telegram.ui.ActionBar.c2 c2Var2 = (org.telegram.ui.ActionBar.c2) this.f;
                TLObject tLObject7 = (TLObject) this.c;
                TL_stars.InputSavedStarGift inputSavedStarGift = (TL_stars.InputSavedStarGift) this.d;
                Utilities.Callback callback3 = (Utilities.Callback) this.e;
                int i18 = v7Var4.a;
                c2Var2.dismiss();
                if (tLObject7 instanceof TL_stars.TL_payments_savedStarGifts) {
                    TL_stars.TL_payments_savedStarGifts tL_payments_savedStarGifts = (TL_stars.TL_payments_savedStarGifts) tLObject7;
                    MessagesController.getInstance(i18).putUsers(tL_payments_savedStarGifts.users, false);
                    MessagesController.getInstance(i18).putChats(tL_payments_savedStarGifts.chats, false);
                    for (int i19 = 0; i19 < tL_payments_savedStarGifts.gifts.size(); i19++) {
                        TL_stars.SavedStarGift savedStarGift2 = tL_payments_savedStarGifts.gifts.get(i19);
                        if (((inputSavedStarGift instanceof TL_stars.TL_inputSavedStarGiftUser) && ((TL_stars.TL_inputSavedStarGiftUser) inputSavedStarGift).msg_id == savedStarGift2.msg_id) || ((inputSavedStarGift instanceof TL_stars.TL_inputSavedStarGiftChat) && ((TL_stars.TL_inputSavedStarGiftChat) inputSavedStarGift).saved_id == savedStarGift2.saved_id)) {
                            savedStarGift = savedStarGift2;
                            callback3.run(savedStarGift);
                            return;
                        }
                    }
                }
                savedStarGift = null;
                callback3.run(savedStarGift);
                return;
            case 11:
                v7 v7Var5 = (v7) this.e;
                TLRPC.TL_error tL_error8 = (TLRPC.TL_error) this.b;
                Utilities.Callback2 callback23 = (Utilities.Callback2) this.f;
                TLObject tLObject8 = (TLObject) this.c;
                TLRPC.TL_inputInvoiceStars tL_inputInvoiceStars3 = (TLRPC.TL_inputInvoiceStars) this.d;
                if (tL_error8 != null) {
                    callback23.run(Boolean.FALSE, tL_error8.text);
                    return;
                }
                if (tLObject8 instanceof TLRPC.PaymentForm) {
                    TLRPC.PaymentForm paymentForm3 = (TLRPC.PaymentForm) tLObject8;
                    paymentForm3.invoice.recurring = true;
                    MessagesController.getInstance(v7Var5.a).putUsers(paymentForm3.users, false);
                    co0Var3 = new co0(paymentForm3, tL_inputInvoiceStars3, null);
                } else {
                    co0Var3 = tLObject8 instanceof TLRPC.PaymentReceipt ? new co0((TLRPC.PaymentReceipt) tLObject8) : null;
                }
                if (co0Var3 == null) {
                    callback23.run(Boolean.FALSE, "UNKNOWN_RESPONSE");
                    return;
                }
                co0Var3.V0 = new i3(callback23, 4);
                org.telegram.ui.ActionBar.o2 R3 = LaunchActivity.R();
                if (R3 == null) {
                    return;
                }
                if (!AndroidUtilities.hasDialogOnTop(R3)) {
                    R3.presentFragment(co0Var3);
                    return;
                }
                org.telegram.ui.ActionBar.m2 m2Var3 = new org.telegram.ui.ActionBar.m2();
                m2Var3.a = true;
                R3.showAsSheet(co0Var3, m2Var3);
                return;
            case 12:
                List list = (List) this.b;
                Utilities.Callback2 callback24 = (Utilities.Callback2) this.e;
                TLRPC.TL_inputStorePaymentStarsTopup tL_inputStorePaymentStarsTopup = (TLRPC.TL_inputStorePaymentStarsTopup) this.f;
                TL_stars.TL_starsTopupOption tL_starsTopupOption = (TL_stars.TL_starsTopupOption) this.c;
                Activity activity = (Activity) this.d;
                if (list.isEmpty()) {
                    FileLog.d("StarsController.buy queryProductDetails done: no products");
                    AndroidUtilities.runOnUIThread(new q5(2, callback24));
                    return;
                }
                n2.l lVar = (n2.l) list.get(0);
                n2.i a2 = lVar.a();
                if (a2 == null) {
                    FileLog.d("StarsController.buy queryProductDetails done: no details");
                    AndroidUtilities.runOnUIThread(new q5(3, callback24));
                    return;
                }
                tL_inputStorePaymentStarsTopup.currency = a2.c;
                tL_inputStorePaymentStarsTopup.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsTopupOption.currency)) * (a2.b / Math.pow(10.0d, 6.0d)));
                BillingController.getInstance().addResultListener(lVar.c, new k6(callback24, 1));
                BillingController.getInstance().setOnCanceled(new q5(0, callback24));
                FileLog.d("StarsController.buy launchBillingFlow");
                BillingController billingController2 = BillingController.getInstance();
                AccountInstance accountInstance2 = AccountInstance.getInstance(UserConfig.selectedAccount);
                g5.b bVar2 = new g5.b(i12);
                bVar2.t((n2.l) list.get(0));
                billingController2.launchBillingFlow(activity, accountInstance2, tL_inputStorePaymentStarsTopup, Collections.singletonList(bVar2.h()));
                return;
            case 13:
                ih.q qVar = (ih.q) this.b;
                ih.r rVar = (ih.r) this.e;
                Long l10 = (Long) this.f;
                wb wbVar = (wb) this.c;
                Runnable runnable = (Runnable) this.d;
                if (qVar == null) {
                    qVar = rVar.e(l10.longValue());
                }
                wbVar.Y(rb.c(qVar));
                runnable.run();
                return;
            case 14:
                i4 i4Var2 = (i4) this.e;
                Runnable runnable2 = (Runnable) this.f;
                TLRPC.TL_error tL_error9 = (TLRPC.TL_error) this.b;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) this.c;
                r9 r9Var = (r9) this.d;
                b6 b6Var2 = i4Var2.x0;
                l3 l3Var = i4Var2.Y0;
                if (runnable2 != null) {
                    runnable2.run();
                }
                if (tL_error9 == null || "STORY_NOT_MODIFIED".equals(tL_error9.text)) {
                    storyItem.parsedPrivacy = r9Var;
                    ArrayList arrayList7 = r9Var.b;
                    int i20 = r9Var.a;
                    ArrayList arrayList8 = r9Var.c;
                    ArrayList<TLRPC.PrivacyRule> arrayList9 = new ArrayList<>();
                    int i21 = 0;
                    while (i21 < arrayList7.size()) {
                        TLRPC.InputPrivacyRule inputPrivacyRule = (TLRPC.InputPrivacyRule) arrayList7.get(i21);
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
                                int i22 = 0;
                                while (i22 < tL_inputPrivacyValueDisallowUsers.users.size()) {
                                    i22 = aa.d.g(tL_inputPrivacyValueDisallowUsers.users.get(i22).user_id, tL_privacyValueDisallowUsers.users, i22, 1);
                                    tL_inputPrivacyValueDisallowUsers = tL_inputPrivacyValueDisallowUsers;
                                    arrayList7 = arrayList7;
                                }
                                arrayList = arrayList7;
                                arrayList9.add(tL_privacyValueDisallowUsers);
                            } else {
                                arrayList = arrayList7;
                                if (inputPrivacyRule instanceof TLRPC.TL_inputPrivacyValueAllowUsers) {
                                    TLRPC.TL_privacyValueAllowUsers tL_privacyValueAllowUsers = new TLRPC.TL_privacyValueAllowUsers();
                                    int i23 = 0;
                                    for (TLRPC.TL_inputPrivacyValueAllowUsers tL_inputPrivacyValueAllowUsers = (TLRPC.TL_inputPrivacyValueAllowUsers) inputPrivacyRule; i23 < tL_inputPrivacyValueAllowUsers.users.size(); tL_inputPrivacyValueAllowUsers = tL_inputPrivacyValueAllowUsers) {
                                        i23 = aa.d.g(tL_inputPrivacyValueAllowUsers.users.get(i23).user_id, tL_privacyValueAllowUsers.users, i23, 1);
                                    }
                                    arrayList9.add(tL_privacyValueAllowUsers);
                                    i21++;
                                    arrayList7 = arrayList;
                                }
                            }
                            i21++;
                            arrayList7 = arrayList;
                        }
                        arrayList = arrayList7;
                        i21++;
                        arrayList7 = arrayList;
                    }
                    storyItem.privacy = arrayList9;
                    storyItem.close_friends = i20 == 1;
                    storyItem.contacts = i20 == 2;
                    storyItem.selected_contacts = i20 == 3;
                    MessagesController.getInstance(i4Var2.y2).getStoriesController().p0(storyItem.dialogId, storyItem, true);
                    i4Var2.X3 = true;
                    if (i20 == 4) {
                        new oc(l3Var, b6Var2).Q(R.raw.contact_check, 36, LocaleController.getString("StorySharedToEveryone")).j();
                    } else if (i20 == 1) {
                        new oc(l3Var, b6Var2).Q(R.raw.contact_check, 36, LocaleController.getString("StorySharedToCloseFriends")).j();
                    } else if (i20 == 2) {
                        if (arrayList8.isEmpty()) {
                            new oc(l3Var, b6Var2).Q(R.raw.contact_check, 36, LocaleController.getString("StorySharedToAllContacts")).j();
                        } else {
                            new oc(l3Var, b6Var2).Q(R.raw.contact_check, 36, LocaleController.formatPluralString("StorySharedToAllContactsExcluded", arrayList8.size(), new Object[0])).j();
                        }
                    } else if (i20 == 3) {
                        HashSet hashSet = new HashSet();
                        hashSet.addAll(arrayList8);
                        Iterator it = r9Var.d.values().iterator();
                        while (it.hasNext()) {
                            hashSet.addAll((ArrayList) it.next());
                        }
                        z10 = false;
                        new oc(l3Var, b6Var2).Q(R.raw.contact_check, 36, LocaleController.formatPluralString("StorySharedToContacts", hashSet.size(), new Object[0])).j();
                        i4Var2.f1(z10);
                        return;
                    }
                } else {
                    org.telegram.messenger.l0.p(R.string.UnknownError, new oc(l3Var, b6Var2), R.raw.error, 36);
                }
                z10 = false;
                i4Var2.f1(z10);
                return;
            case 15:
                b4 b4Var = (b4) this.b;
                Activity activity2 = (Activity) this.e;
                TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) this.f;
                m9 m9Var = (m9) this.c;
                f4 f4Var = (f4) this.d;
                wb E = wb.E(activity2, b4Var.l.y2);
                h4 h4Var = b4Var.l.I2;
                long j12 = (h4Var == null || (l9Var = h4Var.b) == null) ? 0L : l9Var.currentPosition;
                a8 n10 = a8.n(b4Var.l.K1.h(), b4Var.l.K1.a);
                i4 i4Var3 = b4Var.l;
                n10.e = i4Var3.x1;
                TL_stories.StoryItem storyItem3 = i4Var3.K1.a;
                if (storyItem3 != null && (messageMedia = storyItem3.media) != null && (document = messageMedia.document) != null) {
                    int i24 = 0;
                    while (true) {
                        if (i24 >= document.attributes.size()) {
                            tL_documentAttributeVideo = null;
                        } else if (document.attributes.get(i24) instanceof TLRPC.TL_documentAttributeVideo) {
                            tL_documentAttributeVideo = (TLRPC.TL_documentAttributeVideo) document.attributes.get(i24);
                        } else {
                            i24++;
                        }
                    }
                    if (tL_documentAttributeVideo != null) {
                        j11 = (long) (tL_documentAttributeVideo.video_start_ts * 1000.0d);
                        n10.e0 = j11;
                        a8 g10 = n10.g();
                        g10.b0 = true;
                        i4Var = b4Var.l;
                        TL_stories.StoryItem storyItem4 = i4Var.K1.a;
                        g10.c0 = storyItem4.media.document;
                        g10.d0 = new fh.i(b4Var, storyItem4, storyItem2, i13);
                        if (i4Var.I0()) {
                            i4 i4Var4 = b4Var.l;
                            g10.J0 = i4Var4.x1;
                            g10.L0 = MessagesController.toInputMedia(i4Var4.K1.a.media);
                            n6 n6Var = m9Var.K0;
                            if (n6Var instanceof ih.f6) {
                                g10.K0 = ((ih.f6) n6Var).E;
                            }
                        }
                        E.S(rb.d(m9Var), g10, j12);
                        E.M = new u3(b4Var, 2);
                        E.N = new x3(b4Var, f4Var, i15);
                        return;
                    }
                }
                j11 = 0;
                n10.e0 = j11;
                a8 g102 = n10.g();
                g102.b0 = true;
                i4Var = b4Var.l;
                TL_stories.StoryItem storyItem42 = i4Var.K1.a;
                g102.c0 = storyItem42.media.document;
                g102.d0 = new fh.i(b4Var, storyItem42, storyItem2, i13);
                if (i4Var.I0()) {
                }
                E.S(rb.d(m9Var), g102, j12);
                E.M = new u3(b4Var, 2);
                E.N = new x3(b4Var, f4Var, i15);
                return;
            case 16:
                q4 q4Var = (q4) this.b;
                TLRPC.User user = (TLRPC.User) this.e;
                String str2 = (String) this.f;
                org.telegram.ui.Cells.n6 n6Var2 = (org.telegram.ui.Cells.n6) this.c;
                TL_stories.StoryView storyView = (TL_stories.StoryView) this.d;
                ArrayList<TLRPC.User> arrayList10 = new ArrayList<>();
                arrayList10.add(user);
                g5 g5Var = q4Var.b;
                ContactsController.getInstance(g5Var.v).deleteContact(arrayList10, false);
                org.telegram.ui.Cells.j2.q(R.string.DeletedFromYourContacts, new Object[]{str2}, new oc(g5Var, g5Var.s), R.raw.ic_ban, 36);
                n6Var2.a(g5Var.d(storyView) ? 1.0f : 0.5f, true);
                return;
            case 17:
                n9 n9Var = (n9) this.e;
                org.telegram.ui.ActionBar.c2 c2Var3 = (org.telegram.ui.ActionBar.c2) this.f;
                TLObject tLObject9 = (TLObject) this.c;
                TL_phone.getGroupCallStreamRtmpUrl getgroupcallstreamrtmpurl = (TL_phone.getGroupCallStreamRtmpUrl) this.d;
                TLRPC.TL_error tL_error10 = (TLRPC.TL_error) this.b;
                t9 t9Var = n9Var.S;
                c2Var3.dismiss();
                if (!(tLObject9 instanceof TL_phone.groupCallStreamRtmpUrl)) {
                    if (tL_error10 != null) {
                        org.telegram.ui.ActionBar.d3 d3Var = t9Var.container;
                        b6Var = ((org.telegram.ui.ActionBar.f3) t9Var).resourcesProvider;
                        new oc(d3Var, b6Var).d0(tL_error10, true);
                        return;
                    }
                    return;
                }
                cr[] crVarArr = new cr[1];
                Context context = n9Var.getContext();
                i10 = ((org.telegram.ui.ActionBar.f3) t9Var).currentAccount;
                cr crVar = new cr(context, i10, getgroupcallstreamrtmpurl, (TL_phone.groupCallStreamRtmpUrl) tLObject9, t9Var.H ? null : new fh.f1(14, n9Var, crVarArr), new ih.b());
                crVarArr[0] = crVar;
                crVar.show();
                return;
            case 18:
                kh.gc.a((kh.gc) this.b, (ViewGroup) this.e, (b6) this.f, (ba) this.c, (View) this.d);
                return;
            case 19:
                of.w1 w1Var = (of.w1) this.b;
                TLRPC.TL_messages_getStickers tL_messages_getStickers = (TLRPC.TL_messages_getStickers) this.e;
                TLObject tLObject10 = (TLObject) this.c;
                ArrayList arrayList11 = (ArrayList) this.f;
                LongSparseArray longSparseArray = (LongSparseArray) this.d;
                w1Var.getClass();
                String str3 = tL_messages_getStickers.emoticon;
                of.y1 y1Var = w1Var.a;
                if (str3.equals(y1Var.N)) {
                    y1Var.K = 0;
                    if (tLObject10 instanceof TLRPC.TL_messages_stickers) {
                        TLRPC.TL_messages_stickers tL_messages_stickers = (TLRPC.TL_messages_stickers) tLObject10;
                        int size2 = arrayList11.size();
                        int size3 = tL_messages_stickers.stickers.size();
                        while (i15 < size3) {
                            TLRPC.Document document2 = tL_messages_stickers.stickers.get(i15);
                            if (longSparseArray.indexOfKey(document2.id) < 0) {
                                arrayList11.add(document2);
                            }
                            i15++;
                        }
                        if (size2 != arrayList11.size()) {
                            y1Var.E.put(arrayList11, y1Var.N);
                            if (size2 == 0) {
                                y1Var.F.add(arrayList11);
                            }
                            y1Var.l();
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 20:
                ((CameraController) this.b).lambda$open$10((CameraSession) this.e, (Runnable) this.f, (SurfaceTexture) this.c, (Runnable) this.d);
                return;
            case 21:
                r7 r7Var = (r7) this.b;
                hh.a aVar = (hh.a) this.e;
                TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio = (TLRPC.TL_documentAttributeAudio) this.f;
                String str4 = (String) this.c;
                String str5 = (String) this.d;
                r7Var.getClass();
                aVar.e.a = false;
                tL_documentAttributeAudio.title = str4;
                tL_documentAttributeAudio.performer = str5;
                n71 n71Var = r7Var.h;
                for (int i25 = 0; i25 < n71Var.getViewPages().length; i25++) {
                    wk0 wk0Var = (wk0) n71Var.getViewPages()[i25];
                    if (wk0Var != null && ((e7) wk0Var.getAdapter()).d == 3) {
                        e7 e7Var = (e7) wk0Var.getAdapter();
                        int i26 = 0;
                        while (true) {
                            if (i26 >= e7Var.e.size()) {
                                break;
                            } else if (((l7) e7Var.e.get(i26)).d == aVar) {
                                e7Var.m(i26);
                            } else {
                                i26++;
                            }
                        }
                    }
                }
                return;
            case 22:
                ma maVar = (ma) this.e;
                String str6 = (String) this.f;
                TLRPC.TL_error tL_error11 = (TLRPC.TL_error) this.b;
                TLObject tLObject11 = (TLObject) this.c;
                TL_account.checkUsername checkusername = (TL_account.checkUsername) this.d;
                maVar.e = 0;
                String str7 = maVar.f;
                if (str7 == null || !str7.equals(str6)) {
                    return;
                }
                if (tL_error11 == null && (tLObject11 instanceof TLRPC.TL_boolTrue)) {
                    org.telegram.ui.Cells.x1 x1Var = maVar.C;
                    if (x1Var != null) {
                        x1Var.setText(LocaleController.formatString("UsernameAvailable", R.string.UsernameAvailable, str6));
                        org.telegram.ui.Cells.x1 x1Var2 = maVar.C;
                        int i27 = f6.w6;
                        x1Var2.setTag(Integer.valueOf(i27));
                        maVar.C.setTextColor(f6.w0(null, i27, false));
                        la laVar = maVar.B;
                        if (laVar != null) {
                            la.a(laVar);
                            return;
                        }
                        return;
                    }
                    return;
                }
                if (maVar.C != null) {
                    if (tL_error11 != null && "USERNAME_INVALID".equals(tL_error11.text) && checkusername.username.length() == 4) {
                        maVar.C.setText(LocaleController.getString(R.string.UsernameInvalidShort));
                        org.telegram.ui.Cells.x1 x1Var3 = maVar.C;
                        int i28 = f6.p7;
                        x1Var3.setTag(Integer.valueOf(i28));
                        maVar.C.setTextColor(f6.w0(null, i28, false));
                    } else if (tL_error11 == null || !"USERNAME_PURCHASE_AVAILABLE".equals(tL_error11.text)) {
                        maVar.C.setText(LocaleController.getString(R.string.UsernameInUse));
                        org.telegram.ui.Cells.x1 x1Var4 = maVar.C;
                        int i29 = f6.p7;
                        x1Var4.setTag(Integer.valueOf(i29));
                        maVar.C.setTextColor(f6.w0(null, i29, false));
                    } else {
                        if (checkusername.username.length() == 4) {
                            maVar.C.setText(LocaleController.getString(R.string.UsernameInvalidShortPurchase));
                        } else {
                            maVar.C.setText(LocaleController.getString(R.string.UsernameInUsePurchase));
                        }
                        org.telegram.ui.Cells.x1 x1Var5 = maVar.C;
                        int i30 = f6.F6;
                        x1Var5.setTag(Integer.valueOf(i30));
                        maVar.C.setTextColor(f6.w0(null, i30, false));
                    }
                    la laVar2 = maVar.B;
                    if (laVar2 != null) {
                        la.a(laVar2);
                        return;
                    }
                    return;
                }
                return;
            case 23:
                jb jbVar = (jb) this.b;
                TLRPC.TL_chatInviteExported tL_chatInviteExported = (TLRPC.TL_chatInviteExported) this.e;
                TLRPC.TL_messages_exportedChatInvite tL_messages_exportedChatInvite = (TLRPC.TL_messages_exportedChatInvite) this.f;
                boolean[] zArr2 = (boolean[]) this.c;
                org.telegram.ui.ActionBar.c2 c2Var4 = (org.telegram.ui.ActionBar.c2) this.d;
                pb pbVar = jbVar.a.n;
                pbVar.A0 = false;
                pbVar.y0.put(tL_chatInviteExported.link, tL_messages_exportedChatInvite == null ? 0 : tL_messages_exportedChatInvite);
                if (zArr2[0]) {
                    return;
                }
                c2Var4.dismiss();
                if (tL_messages_exportedChatInvite != null) {
                    pb.z0(pbVar, tL_messages_exportedChatInvite, pbVar.z0);
                    return;
                } else {
                    org.telegram.messenger.l0.p(R.string.LinkHashExpired, oc.a0(pbVar), R.raw.linkbroken, 36);
                    return;
                }
            case 24:
                xc xcVar = (xc) this.e;
                boolean[] zArr3 = (boolean[]) this.f;
                int[] iArr = (int[]) this.c;
                int[] iArr2 = (int[]) this.d;
                TLRPC.TL_error tL_error12 = (TLRPC.TL_error) this.b;
                if (zArr3[0] || (i11 = iArr[0]) >= iArr2[0]) {
                    return;
                }
                if (tL_error12 != null) {
                    zArr3[0] = true;
                    if ("BOOSTS_REQUIRED".equals(tL_error12.text)) {
                        xcVar.getMessagesController().getBoostsController().userCanBoostChannel(xcVar.a, xcVar.c, new bc(xcVar, i15));
                        return;
                    } else {
                        xcVar.L.setLoading(false);
                        org.telegram.ui.Cells.j2.q(R.string.UnknownErrorCode, new Object[]{tL_error12.text}, oc.a0(xcVar), R.raw.error, 36);
                        return;
                    }
                }
                int i31 = i11 + 1;
                iArr[0] = i31;
                if (i31 == iArr2[0]) {
                    xcVar.finishFragment();
                    org.telegram.ui.ActionBar.o2 o2Var2 = xcVar.h0;
                    if (o2Var2 != null) {
                        if (o2Var2 instanceof ho) {
                            ((ho) o2Var2).n0();
                        }
                        org.telegram.messenger.l0.p(xcVar.d ? R.string.GroupAppearanceUpdated : R.string.ChannelAppearanceUpdated, oc.a0(xcVar.h0), R.raw.contact_check, 36);
                        xcVar.h0 = null;
                    }
                    xcVar.L.setLoading(false);
                    return;
                }
                return;
            case 25:
                a();
                return;
            case 26:
                qn qnVar = (qn) this.b;
                boolean[] zArr4 = (boolean[]) this.e;
                boolean[] zArr5 = (boolean[]) this.f;
                ImageView imageView = (ImageView) this.c;
                ImageView imageView2 = (ImageView) this.d;
                if (zArr4[0]) {
                    return;
                }
                zArr4[0] = true;
                long[] jArr = {-1};
                org.telegram.ui.k6 k6Var = new org.telegram.ui.k6((Object) jArr, zArr5, (Object) imageView, (Object) imageView2, 6);
                TLRPC.TL_messages_rateTranscribedAudio tL_messages_rateTranscribedAudio = new TLRPC.TL_messages_rateTranscribedAudio();
                tL_messages_rateTranscribedAudio.msg_id = qnVar.Z4.getId();
                tL_messages_rateTranscribedAudio.peer = qnVar.getMessagesController().getInputPeer(qnVar.Z4.messageOwner.peer_id);
                tL_messages_rateTranscribedAudio.transcription_id = qnVar.Z4.messageOwner.voiceTranscriptionId;
                tL_messages_rateTranscribedAudio.good = zArr5[0];
                qnVar.getConnectionsManager().sendRequest(tL_messages_rateTranscribedAudio, new y9(qnVar, k6Var, jArr, i14));
                AndroidUtilities.runOnUIThread(k6Var, 150L);
                return;
            case 27:
                b();
                return;
            case 28:
                c();
                return;
            default:
                bq.X((bq) this.e, (TLRPC.TL_error) this.b, (TLRPC.InputCheckPasswordSRP) this.f, (TwoStepVerificationActivity) this.c, (TLRPC.TL_channels_editCreator) this.d);
                return;
        }
    }

    public /* synthetic */ o0(u6 u6Var, TLObject tLObject, TLRPC.TL_inputStorePaymentGiftPremium tL_inputStorePaymentGiftPremium, TLRPC.TL_error tL_error, TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore) {
        this.a = 4;
        this.e = u6Var;
        this.c = tLObject;
        this.f = tL_inputStorePaymentGiftPremium;
        this.b = tL_error;
        this.d = tL_payments_canPurchaseStore;
    }

    public /* synthetic */ o0(v7 v7Var, org.telegram.ui.ActionBar.c2 c2Var, TLObject tLObject, TL_stars.InputSavedStarGift inputSavedStarGift, Utilities.Callback callback) {
        this.a = 10;
        this.b = v7Var;
        this.f = c2Var;
        this.c = tLObject;
        this.d = inputSavedStarGift;
        this.e = callback;
    }

    public /* synthetic */ o0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i9) {
        this.a = i9;
        this.b = obj;
        this.e = obj2;
        this.f = obj3;
        this.c = obj4;
        this.d = obj5;
    }

    public /* synthetic */ o0(Object obj, Object obj2, Object obj3, Object obj4, TLRPC.TL_error tL_error, int i9) {
        this.a = i9;
        this.e = obj;
        this.f = obj2;
        this.c = obj3;
        this.d = obj4;
        this.b = tL_error;
    }

    public /* synthetic */ o0(Object obj, Object obj2, TLRPC.TL_error tL_error, TLObject tLObject, Object obj3, int i9) {
        this.a = i9;
        this.e = obj;
        this.f = obj2;
        this.b = tL_error;
        this.c = tLObject;
        this.d = obj3;
    }

    public /* synthetic */ o0(Object obj, TLRPC.TL_error tL_error, Object obj2, Object obj3, TLObject tLObject, int i9) {
        this.a = i9;
        this.e = obj;
        this.b = tL_error;
        this.f = obj2;
        this.c = obj3;
        this.d = tLObject;
    }

    public /* synthetic */ o0(of.w1 w1Var, TLRPC.TL_messages_getStickers tL_messages_getStickers, TLObject tLObject, ArrayList arrayList, LongSparseArray longSparseArray) {
        this.a = 19;
        this.b = w1Var;
        this.e = tL_messages_getStickers;
        this.c = tLObject;
        this.f = arrayList;
        this.d = longSparseArray;
    }

    public /* synthetic */ o0(TLObject tLObject, MessagesController messagesController, j1 j1Var, p pVar, TLRPC.TL_error tL_error) {
        this.a = 2;
        this.c = tLObject;
        this.d = messagesController;
        this.e = j1Var;
        this.f = pVar;
        this.b = tL_error;
    }

    public /* synthetic */ o0(TLRPC.TL_error tL_error, Utilities.Callback callback, TLObject tLObject, MessagesController messagesController, Utilities.Callback callback2, int i9) {
        this.a = i9;
        this.b = tL_error;
        this.e = callback;
        this.c = tLObject;
        this.d = messagesController;
        this.f = callback2;
    }
}
