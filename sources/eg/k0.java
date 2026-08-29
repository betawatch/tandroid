package eg;

import android.app.Activity;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import ih.e6;
import ih.i5;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import jh.n5;
import jh.s7;
import jh.t6;
import lh.a4;
import lh.c4;
import lh.d4;
import lh.h3;
import lh.h9;
import lh.i9;
import lh.k6;
import lh.m4;
import lh.p3;
import lh.s3;
import lh.w3;
import nh.bb;
import nh.c9;
import nh.e9;
import nh.gb;
import nh.o7;
import nh.qb;
import nh.y8;
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
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.d3;
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Cells.l6;
import org.telegram.ui.Components.c5;
import org.telegram.ui.Components.fr;
import org.telegram.ui.Components.ga;
import org.telegram.ui.Components.jl0;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.tc;
import org.telegram.ui.Components.z71;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.ac;
import org.telegram.ui.bo0;
import org.telegram.ui.d7;
import org.telegram.ui.dq;
import org.telegram.ui.fn;
import org.telegram.ui.gg;
import org.telegram.ui.hd;
import org.telegram.ui.ib;
import org.telegram.ui.ir;
import org.telegram.ui.jr;
import org.telegram.ui.k7;
import org.telegram.ui.ka;
import org.telegram.ui.ko;
import org.telegram.ui.la;
import org.telegram.ui.ob;
import org.telegram.ui.q7;
import org.telegram.ui.s5;
import org.telegram.ui.th;
import org.telegram.ui.tn;
import org.telegram.ui.vc;
import org.telegram.ui.x9;
import org.telegram.ui.yo;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class k0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ k0(w2 w2Var, TLObject tLObject, TLRPC.UserFull userFull, TL_account.TL_birthday tL_birthday, TLRPC.TL_error tL_error) {
        this.a = 3;
        this.e = w2Var;
        this.c = tLObject;
        this.f = userFull;
        this.d = tL_birthday;
        this.b = tL_error;
    }

    private final void a() {
        hd hdVar = (hd) this.e;
        String str = (String) this.f;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.b;
        TLObject tLObject = (TLObject) this.c;
        TLRPC.TL_channels_checkUsername tL_channels_checkUsername = (TLRPC.TL_channels_checkUsername) this.d;
        hdVar.S = 0;
        String str2 = hdVar.T;
        if (str2 == null || !str2.equals(str)) {
            return;
        }
        if (tL_error == null && (tLObject instanceof TLRPC.TL_boolTrue)) {
            hdVar.Q.setText(LocaleController.formatString("LinkAvailable", R.string.LinkAvailable, str));
            org.telegram.ui.Cells.w1 w1Var = hdVar.Q;
            int i10 = g6.w6;
            w1Var.setTag(Integer.valueOf(i10));
            hdVar.Q.setTextColor(g6.w0(null, i10, false));
            hdVar.V = true;
            return;
        }
        if (tL_error != null && "USERNAME_INVALID".equals(tL_error.text) && tL_channels_checkUsername.username.length() == 4) {
            hdVar.Q.setText(LocaleController.getString(R.string.UsernameInvalidShort));
            hdVar.Q.setTextColor(g6.w0(null, g6.p7, false));
        } else if (tL_error != null && "USERNAME_PURCHASE_AVAILABLE".equals(tL_error.text)) {
            if (tL_channels_checkUsername.username.length() == 4) {
                hdVar.Q.setText(LocaleController.getString(R.string.UsernameInvalidShortPurchase));
            } else {
                hdVar.Q.setText(LocaleController.getString(R.string.UsernameInUsePurchase));
            }
            hdVar.Q.setTextColor(g6.w0(null, g6.F6, false));
        } else if (tL_error == null || !"CHANNELS_ADMIN_PUBLIC_TOO_MUCH".equals(tL_error.text)) {
            hdVar.Q.setTextColor(g6.w0(null, g6.p7, false));
            hdVar.Q.setText(LocaleController.getString(R.string.LinkInUse));
        } else {
            hdVar.Q.setTextColor(g6.w0(null, g6.p7, false));
            hdVar.f0 = false;
            hdVar.f0();
        }
        hdVar.V = false;
    }

    private final void b() {
        yo yoVar = (yo) this.e;
        String str = (String) this.f;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.b;
        TLObject tLObject = (TLObject) this.c;
        TLRPC.TL_channels_checkUsername tL_channels_checkUsername = (TLRPC.TL_channels_checkUsername) this.d;
        yoVar.d0 = 0;
        String str2 = yoVar.e0;
        if (str2 == null || !str2.equals(str)) {
            return;
        }
        if (tL_error == null && (tLObject instanceof TLRPC.TL_boolTrue)) {
            yoVar.f.setText(LocaleController.formatString("LinkAvailable", R.string.LinkAvailable, str));
            yoVar.f.setTextColorByKey(g6.w6);
            yoVar.g0 = true;
            return;
        }
        if (tL_error != null && "USERNAME_INVALID".equals(tL_error.text) && tL_channels_checkUsername.username.length() == 4) {
            yoVar.f.setText(LocaleController.getString(R.string.UsernameInvalidShort));
            yoVar.f.setTextColor(g6.w0(null, g6.p7, false));
        } else if (tL_error != null && "USERNAME_PURCHASE_AVAILABLE".equals(tL_error.text)) {
            if (tL_channels_checkUsername.username.length() == 4) {
                yoVar.f.setText(LocaleController.getString(R.string.UsernameInvalidShortPurchase));
            } else {
                yoVar.f.setText(LocaleController.getString(R.string.UsernameInUsePurchase));
            }
            yoVar.f.setTextColor(g6.w0(null, g6.F6, false));
        } else if (tL_error == null || !"CHANNELS_ADMIN_PUBLIC_TOO_MUCH".equals(tL_error.text)) {
            yoVar.f.setText(LocaleController.getString(R.string.LinkInUse));
            yoVar.f.setTextColorByKey(g6.p7);
        } else {
            yoVar.Y = false;
            yoVar.Z();
        }
        yoVar.g0 = false;
    }

    private final void c() {
        dq.Y((dq) this.e, (TLRPC.TL_error) this.b, (TLRPC.InputCheckPasswordSRP) this.f, (TwoStepVerificationActivity) this.c, (TLRPC.TL_channels_editCreator) this.d);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:173:0x04d4  */
    /* JADX WARN: Type inference failed for: r0v35, types: [org.telegram.ui.ActionBar.o2] */
    /* JADX WARN: Type inference failed for: r10v0, types: [org.telegram.SQLite.SQLiteCursor] */
    /* JADX WARN: Type inference failed for: r10v2, types: [org.telegram.ui.ActionBar.o2, org.telegram.ui.bo0] */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v33 */
    /* JADX WARN: Type inference failed for: r10v9, types: [org.telegram.SQLite.SQLiteCursor] */
    /* JADX WARN: Type inference failed for: r6v17, types: [org.telegram.tgnet.InputSerializedData, org.telegram.tgnet.NativeByteBuffer] */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v52, types: [java.lang.Integer] */
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
        TLRPC.MessageMedia messageMedia;
        TLRPC.Document document;
        long j11;
        d4 d4Var;
        h9 h9Var;
        c6 c6Var;
        int i13;
        int i14;
        int i15 = 16;
        int i16 = 4;
        int i17 = 2;
        ?? r10 = 0;
        SQLiteCursor sQLiteCursor = null;
        TLRPC.TL_documentAttributeVideo tL_documentAttributeVideo = null;
        bo0 bo0Var = null;
        r10 = null;
        TL_stars.SavedStarGift savedStarGift = null;
        bo0 bo0Var2 = null;
        int i18 = 0;
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
                d1 d1Var = (d1) this.e;
                m mVar = (m) this.f;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.b;
                if (tLObject3 instanceof TLRPC.TL_payments_checkedGiftCode) {
                    TLRPC.TL_payments_checkedGiftCode tL_payments_checkedGiftCode = (TLRPC.TL_payments_checkedGiftCode) tLObject3;
                    messagesController3.putChats(tL_payments_checkedGiftCode.chats, false);
                    messagesController3.putUsers(tL_payments_checkedGiftCode.users, false);
                    d1Var.run(tL_payments_checkedGiftCode);
                }
                mVar.run(tL_error3);
                return;
            case 3:
                w2.R((w2) this.e, (TLObject) this.c, (TLRPC.UserFull) this.f, (TL_account.TL_birthday) this.d, (TLRPC.TL_error) this.b);
                return;
            case 4:
                e6 e6Var = (e6) this.e;
                TLObject tLObject4 = (TLObject) this.c;
                TLRPC.TL_inputStorePaymentGiftPremium tL_inputStorePaymentGiftPremium = (TLRPC.TL_inputStorePaymentGiftPremium) this.f;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) this.b;
                TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore = (TLRPC.TL_payments_canPurchaseStore) this.d;
                int i19 = e6Var.U;
                org.telegram.ui.ActionBar.o2 o2Var = e6Var.n;
                if (!(tLObject4 instanceof TLRPC.TL_boolTrue)) {
                    if (tL_error4 != null) {
                        c5.f0(i19, tL_error4, o2Var, tL_payments_canPurchaseStore, new Object[0]);
                        return;
                    }
                    return;
                } else {
                    BillingController billingController = BillingController.getInstance();
                    Activity parentActivity = o2Var.getParentActivity();
                    AccountInstance accountInstance = AccountInstance.getInstance(i19);
                    oc.i iVar = new oc.i(i15);
                    iVar.i2(e6Var.a0.h);
                    billingController.launchBillingFlow(parentActivity, accountInstance, tL_inputStorePaymentGiftPremium, Collections.singletonList(iVar.M1()));
                    return;
                }
            case 5:
                jh.n0 n0Var = (jh.n0) this.e;
                ye.c cVar = (ye.c) this.f;
                org.telegram.ui.ActionBar.c2 c2Var = (org.telegram.ui.ActionBar.c2) this.c;
                TLRPC.Updates updates = (TLRPC.Updates) this.d;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) this.b;
                jh.t1 t1Var = n0Var.m0;
                if (t1Var != null) {
                    t1Var.run();
                }
                cVar.c(false);
                c2Var.dismiss();
                n0Var.dismiss();
                org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                if (U != null) {
                    if (updates == null) {
                        tc.a0(U).d0(tL_error5, false);
                        return;
                    }
                    mc M = tc.a0(U).M(LocaleController.getString(R.string.GiftOfferSentTitle), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftOfferSentText, n0Var.V, DialogObject.getShortName(n0Var.W))), R.raw.forward);
                    M.t = true;
                    M.j();
                    return;
                }
                return;
            case 6:
                s7 s7Var = (s7) this.e;
                TLRPC.TL_error tL_error6 = (TLRPC.TL_error) this.b;
                bh.v vVar = (bh.v) this.f;
                TLObject tLObject5 = (TLObject) this.c;
                TLRPC.TL_inputInvoiceStars tL_inputInvoiceStars = (TLRPC.TL_inputInvoiceStars) this.d;
                if (tL_error6 != null) {
                    vVar.run(Boolean.FALSE, tL_error6.text);
                    return;
                }
                if (tLObject5 instanceof TLRPC.PaymentForm) {
                    TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject5;
                    paymentForm.invoice.recurring = true;
                    MessagesController.getInstance(s7Var.a).putUsers(paymentForm.users, false);
                    r10 = new bo0(paymentForm, tL_inputInvoiceStars, null);
                } else if (tLObject5 instanceof TLRPC.PaymentReceipt) {
                    r10 = new bo0((TLRPC.PaymentReceipt) tLObject5);
                }
                if (r10 == 0) {
                    vVar.run(Boolean.FALSE, "UNKNOWN_RESPONSE");
                    return;
                }
                r10.V0 = new n(vVar, 24);
                ?? R = LaunchActivity.R();
                if (R == 0) {
                    return;
                }
                if (!AndroidUtilities.hasDialogOnTop(R)) {
                    R.presentFragment(r10);
                    return;
                }
                org.telegram.ui.ActionBar.m2 m2Var = new org.telegram.ui.ActionBar.m2();
                m2Var.a = true;
                R.showAsSheet(r10, m2Var);
                return;
            case 7:
                s7 s7Var2 = (s7) this.e;
                TLRPC.TL_error tL_error7 = (TLRPC.TL_error) this.b;
                i5 i5Var = (i5) this.f;
                TLObject tLObject6 = (TLObject) this.c;
                TLRPC.TL_inputInvoiceStars tL_inputInvoiceStars2 = (TLRPC.TL_inputInvoiceStars) this.d;
                if (tL_error7 != null) {
                    i5Var.run(Boolean.FALSE, tL_error7.text);
                    return;
                }
                if (tLObject6 instanceof TLRPC.PaymentForm) {
                    TLRPC.PaymentForm paymentForm2 = (TLRPC.PaymentForm) tLObject6;
                    paymentForm2.invoice.recurring = true;
                    MessagesController.getInstance(s7Var2.a).putUsers(paymentForm2.users, false);
                    bo0Var2 = new bo0(paymentForm2, tL_inputInvoiceStars2, null);
                } else if (tLObject6 instanceof TLRPC.PaymentReceipt) {
                    bo0Var2 = new bo0((TLRPC.PaymentReceipt) tLObject6);
                }
                if (bo0Var2 == null) {
                    i5Var.run(Boolean.FALSE, "UNKNOWN_RESPONSE");
                    return;
                }
                bo0Var2.V0 = new n(i5Var, 25);
                org.telegram.ui.ActionBar.o2 R2 = LaunchActivity.R();
                if (R2 == null) {
                    return;
                }
                if (!AndroidUtilities.hasDialogOnTop(R2)) {
                    R2.presentFragment(bo0Var2);
                    return;
                }
                org.telegram.ui.ActionBar.m2 m2Var2 = new org.telegram.ui.ActionBar.m2();
                m2Var2.a = true;
                R2.showAsSheet(bo0Var2, m2Var2);
                return;
            case 8:
                s7 s7Var3 = (s7) this.b;
                boolean[] zArr = (boolean[]) this.e;
                String str = (String) this.f;
                TLRPC.ChatInvite chatInvite = (TLRPC.ChatInvite) this.c;
                Utilities.Callback2 callback22 = (Utilities.Callback2) this.d;
                zArr[0] = true;
                s7Var3.Z(str, chatInvite, new bg.t1(callback22, 18));
                return;
            case 9:
                MessagesStorage messagesStorage = (MessagesStorage) this.b;
                ArrayList arrayList2 = (ArrayList) this.e;
                ArrayList<TLRPC.Chat> arrayList3 = (ArrayList) this.f;
                ArrayList<TLRPC.User> arrayList4 = (ArrayList) this.c;
                n nVar = (n) this.d;
                try {
                    try {
                        ?? r72 = 0;
                        ?? queryFinalized = messagesStorage.getDatabase().queryFinalized("SELECT data, hash, time FROM star_gifts2 ORDER BY pos ASC", new Object[0]);
                        j10 = 0;
                        int i20 = 0;
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
                            } catch (Exception e10) {
                                e = e10;
                                i10 = i20;
                                sQLiteCursor = queryFinalized;
                                FileLog.e(e);
                                if (sQLiteCursor != null) {
                                    sQLiteCursor.dispose();
                                }
                                i11 = i10;
                                AndroidUtilities.runOnUIThread(new t6(nVar, arrayList2, i11, j10, arrayList4, arrayList3));
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
                        if (0 != 0) {
                            r10.dispose();
                        }
                        throw th2;
                    }
                } catch (Exception e11) {
                    e = e11;
                    j10 = 0;
                    i10 = 0;
                }
                AndroidUtilities.runOnUIThread(new t6(nVar, arrayList2, i11, j10, arrayList4, arrayList3));
                return;
            case 10:
                s7 s7Var4 = (s7) this.b;
                org.telegram.ui.ActionBar.c2 c2Var2 = (org.telegram.ui.ActionBar.c2) this.f;
                TLObject tLObject7 = (TLObject) this.c;
                TL_stars.InputSavedStarGift inputSavedStarGift = (TL_stars.InputSavedStarGift) this.d;
                Utilities.Callback callback3 = (Utilities.Callback) this.e;
                int i22 = s7Var4.a;
                c2Var2.dismiss();
                if (tLObject7 instanceof TL_stars.TL_payments_savedStarGifts) {
                    TL_stars.TL_payments_savedStarGifts tL_payments_savedStarGifts = (TL_stars.TL_payments_savedStarGifts) tLObject7;
                    MessagesController.getInstance(i22).putUsers(tL_payments_savedStarGifts.users, false);
                    MessagesController.getInstance(i22).putChats(tL_payments_savedStarGifts.chats, false);
                    for (int i23 = 0; i23 < tL_payments_savedStarGifts.gifts.size(); i23++) {
                        TL_stars.SavedStarGift savedStarGift2 = tL_payments_savedStarGifts.gifts.get(i23);
                        if (((inputSavedStarGift instanceof TL_stars.TL_inputSavedStarGiftUser) && ((TL_stars.TL_inputSavedStarGiftUser) inputSavedStarGift).msg_id == savedStarGift2.msg_id) || ((inputSavedStarGift instanceof TL_stars.TL_inputSavedStarGiftChat) && ((TL_stars.TL_inputSavedStarGiftChat) inputSavedStarGift).saved_id == savedStarGift2.saved_id)) {
                            savedStarGift = savedStarGift2;
                        }
                    }
                }
                callback3.run(savedStarGift);
                return;
            case 11:
                s7 s7Var5 = (s7) this.e;
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
                    MessagesController.getInstance(s7Var5.a).putUsers(paymentForm3.users, false);
                    bo0Var = new bo0(paymentForm3, tL_inputInvoiceStars3, null);
                } else if (tLObject8 instanceof TLRPC.PaymentReceipt) {
                    bo0Var = new bo0((TLRPC.PaymentReceipt) tLObject8);
                }
                if (bo0Var == null) {
                    callback23.run(Boolean.FALSE, "UNKNOWN_RESPONSE");
                    return;
                }
                bo0Var.V0 = new n(callback23, 23);
                org.telegram.ui.ActionBar.o2 R3 = LaunchActivity.R();
                if (R3 == null) {
                    return;
                }
                if (!AndroidUtilities.hasDialogOnTop(R3)) {
                    R3.presentFragment(bo0Var);
                    return;
                }
                org.telegram.ui.ActionBar.m2 m2Var3 = new org.telegram.ui.ActionBar.m2();
                m2Var3.a = true;
                R3.showAsSheet(bo0Var, m2Var3);
                return;
            case 12:
                List list = (List) this.b;
                Utilities.Callback2 callback24 = (Utilities.Callback2) this.e;
                TLRPC.TL_inputStorePaymentStarsTopup tL_inputStorePaymentStarsTopup = (TLRPC.TL_inputStorePaymentStarsTopup) this.f;
                TL_stars.TL_starsTopupOption tL_starsTopupOption = (TL_stars.TL_starsTopupOption) this.c;
                Activity activity = (Activity) this.d;
                if (list.isEmpty()) {
                    FileLog.d("StarsController.buy queryProductDetails done: no products");
                    AndroidUtilities.runOnUIThread(new n5(2, callback24));
                    return;
                }
                p2.l lVar = (p2.l) list.get(0);
                p2.i a2 = lVar.a();
                if (a2 == null) {
                    FileLog.d("StarsController.buy queryProductDetails done: no details");
                    AndroidUtilities.runOnUIThread(new n5(3, callback24));
                    return;
                }
                tL_inputStorePaymentStarsTopup.currency = a2.c;
                tL_inputStorePaymentStarsTopup.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsTopupOption.currency)) * (a2.b / Math.pow(10.0d, 6.0d)));
                BillingController.getInstance().addResultListener(lVar.c, new ag.p(callback24, 2));
                BillingController.getInstance().setOnCanceled(new n5(0, callback24));
                FileLog.d("StarsController.buy launchBillingFlow");
                BillingController billingController2 = BillingController.getInstance();
                AccountInstance accountInstance2 = AccountInstance.getInstance(UserConfig.selectedAccount);
                oc.i iVar2 = new oc.i(i15);
                iVar2.i2((p2.l) list.get(0));
                billingController2.launchBillingFlow(activity, accountInstance2, tL_inputStorePaymentStarsTopup, Collections.singletonList(iVar2.M1()));
                return;
            case 13:
                lh.o oVar = (lh.o) this.b;
                lh.p pVar = (lh.p) this.e;
                Long l10 = (Long) this.f;
                gb gbVar = (gb) this.c;
                Runnable runnable = (Runnable) this.d;
                if (oVar == null) {
                    oVar = pVar.e(l10.longValue());
                }
                gbVar.Y(bb.c(oVar));
                runnable.run();
                return;
            case 14:
                d4 d4Var2 = (d4) this.e;
                Runnable runnable2 = (Runnable) this.f;
                TLRPC.TL_error tL_error9 = (TLRPC.TL_error) this.b;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) this.c;
                c9 c9Var = (c9) this.d;
                c6 c6Var2 = d4Var2.x0;
                h3 h3Var = d4Var2.Y0;
                if (runnable2 != null) {
                    runnable2.run();
                }
                if (tL_error9 == null || "STORY_NOT_MODIFIED".equals(tL_error9.text)) {
                    storyItem.parsedPrivacy = c9Var;
                    ArrayList arrayList7 = c9Var.b;
                    int i24 = c9Var.a;
                    ArrayList arrayList8 = c9Var.c;
                    ArrayList<TLRPC.PrivacyRule> arrayList9 = new ArrayList<>();
                    while (i18 < arrayList7.size()) {
                        TLRPC.InputPrivacyRule inputPrivacyRule = (TLRPC.InputPrivacyRule) arrayList7.get(i18);
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
                                    i25 = a4.w.g(tL_inputPrivacyValueDisallowUsers.users.get(i25).user_id, tL_privacyValueDisallowUsers.users, i25, 1);
                                    i18 = i18;
                                    arrayList7 = arrayList7;
                                }
                                arrayList = arrayList7;
                                i12 = i18;
                                arrayList9.add(tL_privacyValueDisallowUsers);
                            } else {
                                arrayList = arrayList7;
                                i12 = i18;
                                if (inputPrivacyRule instanceof TLRPC.TL_inputPrivacyValueAllowUsers) {
                                    TLRPC.TL_inputPrivacyValueAllowUsers tL_inputPrivacyValueAllowUsers = (TLRPC.TL_inputPrivacyValueAllowUsers) inputPrivacyRule;
                                    TLRPC.TL_privacyValueAllowUsers tL_privacyValueAllowUsers = new TLRPC.TL_privacyValueAllowUsers();
                                    for (int i26 = 0; i26 < tL_inputPrivacyValueAllowUsers.users.size(); i26 = a4.w.g(tL_inputPrivacyValueAllowUsers.users.get(i26).user_id, tL_privacyValueAllowUsers.users, i26, 1)) {
                                    }
                                    arrayList9.add(tL_privacyValueAllowUsers);
                                    i18 = i12 + 1;
                                    arrayList7 = arrayList;
                                }
                            }
                            i18 = i12 + 1;
                            arrayList7 = arrayList;
                        }
                        arrayList = arrayList7;
                        i12 = i18;
                        i18 = i12 + 1;
                        arrayList7 = arrayList;
                    }
                    storyItem.privacy = arrayList9;
                    storyItem.close_friends = i24 == 1;
                    storyItem.contacts = i24 == 2;
                    storyItem.selected_contacts = i24 == 3;
                    MessagesController.getInstance(d4Var2.y2).getStoriesController().p0(storyItem.dialogId, storyItem, true);
                    d4Var2.X3 = true;
                    if (i24 == 4) {
                        new tc(h3Var, c6Var2).Q(R.raw.contact_check, 36, LocaleController.getString("StorySharedToEveryone")).j();
                    } else if (i24 == 1) {
                        new tc(h3Var, c6Var2).Q(R.raw.contact_check, 36, LocaleController.getString("StorySharedToCloseFriends")).j();
                    } else if (i24 == 2) {
                        if (arrayList8.isEmpty()) {
                            new tc(h3Var, c6Var2).Q(R.raw.contact_check, 36, LocaleController.getString("StorySharedToAllContacts")).j();
                        } else {
                            new tc(h3Var, c6Var2).Q(R.raw.contact_check, 36, LocaleController.formatPluralString("StorySharedToAllContactsExcluded", arrayList8.size(), new Object[0])).j();
                        }
                    } else if (i24 == 3) {
                        HashSet hashSet = new HashSet();
                        hashSet.addAll(arrayList8);
                        Iterator it = c9Var.d.values().iterator();
                        while (it.hasNext()) {
                            hashSet.addAll((ArrayList) it.next());
                        }
                        z10 = false;
                        new tc(h3Var, c6Var2).Q(R.raw.contact_check, 36, LocaleController.formatPluralString("StorySharedToContacts", hashSet.size(), new Object[0])).j();
                        d4Var2.f1(z10);
                        return;
                    }
                } else {
                    j7.l1.v(R.string.UnknownError, new tc(h3Var, c6Var2), R.raw.error, 36);
                }
                z10 = false;
                d4Var2.f1(z10);
                return;
            case 15:
                w3 w3Var = (w3) this.b;
                Activity activity2 = (Activity) this.e;
                TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) this.f;
                i9 i9Var = (i9) this.c;
                a4 a4Var = (a4) this.d;
                gb E = gb.E(activity2, w3Var.l.y2);
                c4 c4Var = w3Var.l.I2;
                long j12 = (c4Var == null || (h9Var = c4Var.b) == null) ? 0L : h9Var.currentPosition;
                o7 n10 = o7.n(w3Var.l.K1.h(), w3Var.l.K1.a);
                d4 d4Var3 = w3Var.l;
                n10.e = d4Var3.x1;
                TL_stories.StoryItem storyItem3 = d4Var3.K1.a;
                if (storyItem3 != null && (messageMedia = storyItem3.media) != null && (document = messageMedia.document) != null) {
                    int i27 = 0;
                    while (true) {
                        if (i27 < document.attributes.size()) {
                            if (document.attributes.get(i27) instanceof TLRPC.TL_documentAttributeVideo) {
                                tL_documentAttributeVideo = (TLRPC.TL_documentAttributeVideo) document.attributes.get(i27);
                            } else {
                                i27++;
                            }
                        }
                    }
                    if (tL_documentAttributeVideo != null) {
                        j11 = (long) (tL_documentAttributeVideo.video_start_ts * 1000.0d);
                        n10.e0 = j11;
                        o7 g10 = n10.g();
                        g10.b0 = true;
                        d4Var = w3Var.l;
                        TL_stories.StoryItem storyItem4 = d4Var.K1.a;
                        g10.c0 = storyItem4.media.document;
                        g10.d0 = new ih.i(w3Var, storyItem4, storyItem2, 5);
                        if (d4Var.I0()) {
                            d4 d4Var4 = w3Var.l;
                            g10.J0 = d4Var4.x1;
                            g10.L0 = MessagesController.toInputMedia(d4Var4.K1.a.media);
                            k6 k6Var = i9Var.K0;
                            if (k6Var instanceof lh.c6) {
                                g10.K0 = ((lh.c6) k6Var).E;
                            }
                        }
                        E.S(bb.d(i9Var), g10, j12);
                        E.M = new p3(w3Var, i17);
                        E.N = new s3(w3Var, a4Var, i18);
                        return;
                    }
                }
                j11 = 0;
                n10.e0 = j11;
                o7 g102 = n10.g();
                g102.b0 = true;
                d4Var = w3Var.l;
                TL_stories.StoryItem storyItem42 = d4Var.K1.a;
                g102.c0 = storyItem42.media.document;
                g102.d0 = new ih.i(w3Var, storyItem42, storyItem2, 5);
                if (d4Var.I0()) {
                }
                E.S(bb.d(i9Var), g102, j12);
                E.M = new p3(w3Var, i17);
                E.N = new s3(w3Var, a4Var, i18);
                return;
            case 16:
                m4 m4Var = (m4) this.b;
                TLRPC.User user = (TLRPC.User) this.e;
                String str2 = (String) this.f;
                l6 l6Var = (l6) this.c;
                TL_stories.StoryView storyView = (TL_stories.StoryView) this.d;
                ArrayList<TLRPC.User> arrayList10 = new ArrayList<>();
                arrayList10.add(user);
                lh.c5 c5Var = m4Var.b;
                ContactsController.getInstance(c5Var.v).deleteContact(arrayList10, false);
                th.r(R.string.DeletedFromYourContacts, new Object[]{str2}, new tc(c5Var, c5Var.s), R.raw.ic_ban, 36);
                l6Var.a(c5Var.d(storyView) ? 1.0f : 0.5f, true);
                return;
            case 17:
                y8 y8Var = (y8) this.e;
                org.telegram.ui.ActionBar.c2 c2Var3 = (org.telegram.ui.ActionBar.c2) this.f;
                TLObject tLObject9 = (TLObject) this.c;
                TL_phone.getGroupCallStreamRtmpUrl getgroupcallstreamrtmpurl = (TL_phone.getGroupCallStreamRtmpUrl) this.d;
                TLRPC.TL_error tL_error10 = (TLRPC.TL_error) this.b;
                e9 e9Var = y8Var.S;
                c2Var3.dismiss();
                if (!(tLObject9 instanceof TL_phone.groupCallStreamRtmpUrl)) {
                    if (tL_error10 != null) {
                        d3 d3Var = e9Var.container;
                        c6Var = ((f3) e9Var).resourcesProvider;
                        new tc(d3Var, c6Var).d0(tL_error10, true);
                        return;
                    }
                    return;
                }
                fr[] frVarArr = new fr[1];
                Context context = y8Var.getContext();
                i13 = ((f3) e9Var).currentAccount;
                fr frVar = new fr(context, i13, getgroupcallstreamrtmpurl, (TL_phone.groupCallStreamRtmpUrl) tLObject9, e9Var.H ? null : new ih.b1(14, y8Var, frVarArr), new lh.b());
                frVarArr[0] = frVar;
                frVar.show();
                return;
            case 18:
                qb.a((qb) this.b, (ViewGroup) this.e, (c6) this.f, (ga) this.c, (View) this.d);
                return;
            case 19:
                ((CameraController) this.b).lambda$open$10((CameraSession) this.e, (Runnable) this.f, (SurfaceTexture) this.c, (Runnable) this.d);
                return;
            case 20:
                q7 q7Var = (q7) this.b;
                kh.a aVar = (kh.a) this.e;
                TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio = (TLRPC.TL_documentAttributeAudio) this.f;
                String str3 = (String) this.c;
                String str4 = (String) this.d;
                q7Var.getClass();
                aVar.e.a = false;
                tL_documentAttributeAudio.title = str3;
                tL_documentAttributeAudio.performer = str4;
                z71 z71Var = q7Var.h;
                for (int i28 = 0; i28 < z71Var.getViewPages().length; i28++) {
                    jl0 jl0Var = (jl0) z71Var.getViewPages()[i28];
                    if (jl0Var != null && ((d7) jl0Var.getAdapter()).d == 3) {
                        d7 d7Var = (d7) jl0Var.getAdapter();
                        int i29 = 0;
                        while (true) {
                            if (i29 >= d7Var.e.size()) {
                                break;
                            } else if (((k7) d7Var.e.get(i29)).d == aVar) {
                                d7Var.m(i29);
                            } else {
                                i29++;
                            }
                        }
                    }
                }
                return;
            case 21:
                la laVar = (la) this.e;
                String str5 = (String) this.f;
                TLRPC.TL_error tL_error11 = (TLRPC.TL_error) this.b;
                TLObject tLObject10 = (TLObject) this.c;
                TL_account.checkUsername checkusername = (TL_account.checkUsername) this.d;
                laVar.e = 0;
                String str6 = laVar.f;
                if (str6 == null || !str6.equals(str5)) {
                    return;
                }
                if (tL_error11 == null && (tLObject10 instanceof TLRPC.TL_boolTrue)) {
                    org.telegram.ui.Cells.w1 w1Var = laVar.C;
                    if (w1Var != null) {
                        w1Var.setText(LocaleController.formatString("UsernameAvailable", R.string.UsernameAvailable, str5));
                        org.telegram.ui.Cells.w1 w1Var2 = laVar.C;
                        int i30 = g6.w6;
                        w1Var2.setTag(Integer.valueOf(i30));
                        laVar.C.setTextColor(g6.w0(null, i30, false));
                        ka kaVar = laVar.B;
                        if (kaVar != null) {
                            ka.a(kaVar);
                            return;
                        }
                        return;
                    }
                    return;
                }
                if (laVar.C != null) {
                    if (tL_error11 != null && "USERNAME_INVALID".equals(tL_error11.text) && checkusername.username.length() == 4) {
                        laVar.C.setText(LocaleController.getString(R.string.UsernameInvalidShort));
                        org.telegram.ui.Cells.w1 w1Var3 = laVar.C;
                        int i31 = g6.p7;
                        w1Var3.setTag(Integer.valueOf(i31));
                        laVar.C.setTextColor(g6.w0(null, i31, false));
                    } else if (tL_error11 == null || !"USERNAME_PURCHASE_AVAILABLE".equals(tL_error11.text)) {
                        laVar.C.setText(LocaleController.getString(R.string.UsernameInUse));
                        org.telegram.ui.Cells.w1 w1Var4 = laVar.C;
                        int i32 = g6.p7;
                        w1Var4.setTag(Integer.valueOf(i32));
                        laVar.C.setTextColor(g6.w0(null, i32, false));
                    } else {
                        if (checkusername.username.length() == 4) {
                            laVar.C.setText(LocaleController.getString(R.string.UsernameInvalidShortPurchase));
                        } else {
                            laVar.C.setText(LocaleController.getString(R.string.UsernameInUsePurchase));
                        }
                        org.telegram.ui.Cells.w1 w1Var5 = laVar.C;
                        int i33 = g6.F6;
                        w1Var5.setTag(Integer.valueOf(i33));
                        laVar.C.setTextColor(g6.w0(null, i33, false));
                    }
                    ka kaVar2 = laVar.B;
                    if (kaVar2 != null) {
                        ka.a(kaVar2);
                        return;
                    }
                    return;
                }
                return;
            case 22:
                ib ibVar = (ib) this.b;
                TLRPC.TL_chatInviteExported tL_chatInviteExported = (TLRPC.TL_chatInviteExported) this.e;
                TLRPC.TL_messages_exportedChatInvite tL_messages_exportedChatInvite = (TLRPC.TL_messages_exportedChatInvite) this.f;
                boolean[] zArr2 = (boolean[]) this.c;
                org.telegram.ui.ActionBar.c2 c2Var4 = (org.telegram.ui.ActionBar.c2) this.d;
                ob obVar = ibVar.a.n;
                obVar.A0 = false;
                obVar.y0.put(tL_chatInviteExported.link, tL_messages_exportedChatInvite == null ? 0 : tL_messages_exportedChatInvite);
                if (zArr2[0]) {
                    return;
                }
                c2Var4.dismiss();
                if (tL_messages_exportedChatInvite != null) {
                    ob.A0(obVar, tL_messages_exportedChatInvite, obVar.z0);
                    return;
                } else {
                    j7.l1.v(R.string.LinkHashExpired, tc.a0(obVar), R.raw.linkbroken, 36);
                    return;
                }
            case 23:
                vc vcVar = (vc) this.e;
                boolean[] zArr3 = (boolean[]) this.f;
                int[] iArr = (int[]) this.c;
                int[] iArr2 = (int[]) this.d;
                TLRPC.TL_error tL_error12 = (TLRPC.TL_error) this.b;
                if (zArr3[0] || (i14 = iArr[0]) >= iArr2[0]) {
                    return;
                }
                if (tL_error12 != null) {
                    zArr3[0] = true;
                    if ("BOOSTS_REQUIRED".equals(tL_error12.text)) {
                        vcVar.getMessagesController().getBoostsController().userCanBoostChannel(vcVar.a, vcVar.c, new ac(vcVar, i18));
                        return;
                    } else {
                        vcVar.L.setLoading(false);
                        th.r(R.string.UnknownErrorCode, new Object[]{tL_error12.text}, tc.a0(vcVar), R.raw.error, 36);
                        return;
                    }
                }
                int i34 = i14 + 1;
                iArr[0] = i34;
                if (i34 == iArr2[0]) {
                    vcVar.finishFragment();
                    org.telegram.ui.ActionBar.o2 o2Var2 = vcVar.h0;
                    if (o2Var2 != null) {
                        if (o2Var2 instanceof ko) {
                            ((ko) o2Var2).o0();
                        }
                        j7.l1.v(vcVar.d ? R.string.GroupAppearanceUpdated : R.string.ChannelAppearanceUpdated, tc.a0(vcVar.h0), R.raw.contact_check, 36);
                        vcVar.h0 = null;
                    }
                    vcVar.L.setLoading(false);
                    return;
                }
                return;
            case 24:
                a();
                return;
            case 25:
                tn tnVar = (tn) this.b;
                boolean[] zArr4 = (boolean[]) this.e;
                boolean[] zArr5 = (boolean[]) this.f;
                ImageView imageView = (ImageView) this.c;
                ImageView imageView2 = (ImageView) this.d;
                if (zArr4[0]) {
                    return;
                }
                zArr4[0] = true;
                long[] jArr = {-1};
                gg ggVar = new gg(jArr, zArr5, imageView, imageView2, 0);
                TLRPC.TL_messages_rateTranscribedAudio tL_messages_rateTranscribedAudio = new TLRPC.TL_messages_rateTranscribedAudio();
                tL_messages_rateTranscribedAudio.msg_id = tnVar.Z4.getId();
                tL_messages_rateTranscribedAudio.peer = tnVar.getMessagesController().getInputPeer(tnVar.Z4.messageOwner.peer_id);
                tL_messages_rateTranscribedAudio.transcription_id = tnVar.Z4.messageOwner.voiceTranscriptionId;
                tL_messages_rateTranscribedAudio.good = zArr5[0];
                tnVar.getConnectionsManager().sendRequest(tL_messages_rateTranscribedAudio, new x9(tnVar, ggVar, jArr, i16));
                AndroidUtilities.runOnUIThread(ggVar, 150L);
                return;
            case 26:
                fn fnVar = (fn) this.b;
                TLRPC.Message message = (TLRPC.Message) this.e;
                org.telegram.ui.ActionBar.c2[] c2VarArr = (org.telegram.ui.ActionBar.c2[]) this.f;
                MessageObject messageObject = (MessageObject) this.c;
                s5 s5Var = (s5) this.d;
                tn tnVar2 = fnVar.a;
                if (message.suggested_post.schedule_date != 0) {
                    tnVar2.getMessagesController().approveSuggestedMessage(DialogObject.getPeerDialogId(messageObject.messageOwner.peer_id), messageObject.messageOwner.id, 0);
                    return;
                }
                c2VarArr[0].setOnDismissListener(null);
                f3 f3Var = c5.T(tnVar2.getParentActivity(), 0L, new kg.w(20, fnVar, messageObject), tnVar2.getResourceProvider(), 1).a;
                f3Var.show();
                f3Var.setOnDismissListener(s5Var);
                return;
            case 27:
                b();
                return;
            case 28:
                c();
                return;
            default:
                ir irVar = (ir) this.b;
                ArrayList arrayList11 = (ArrayList) this.e;
                a0.h hVar = (a0.h) this.f;
                ArrayList arrayList12 = (ArrayList) this.c;
                ArrayList arrayList13 = (ArrayList) this.d;
                rf.k1 k1Var = irVar.h;
                jr jrVar = irVar.y;
                if (jrVar.k1) {
                    irVar.s = false;
                    irVar.d = arrayList11;
                    irVar.e = hVar;
                    irVar.f = arrayList12;
                    k1Var.f(arrayList11, null);
                    if (!ChatObject.isChannel(jrVar.r)) {
                        ArrayList arrayList14 = k1Var.g;
                        arrayList14.clear();
                        arrayList14.addAll(arrayList13);
                    }
                    int i35 = irVar.r;
                    irVar.l();
                    if (irVar.r > i35) {
                        jrVar.y0(i35);
                    }
                    if (k1Var.e() || irVar.r != 0) {
                        return;
                    }
                    jrVar.b.e(false, true);
                    return;
                }
                return;
        }
    }

    public /* synthetic */ k0(e6 e6Var, TLObject tLObject, TLRPC.TL_inputStorePaymentGiftPremium tL_inputStorePaymentGiftPremium, TLRPC.TL_error tL_error, TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore) {
        this.a = 4;
        this.e = e6Var;
        this.c = tLObject;
        this.f = tL_inputStorePaymentGiftPremium;
        this.b = tL_error;
        this.d = tL_payments_canPurchaseStore;
    }

    public /* synthetic */ k0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i10) {
        this.a = i10;
        this.b = obj;
        this.e = obj2;
        this.f = obj3;
        this.c = obj4;
        this.d = obj5;
    }

    public /* synthetic */ k0(Object obj, Object obj2, Object obj3, Object obj4, TLRPC.TL_error tL_error, int i10) {
        this.a = i10;
        this.e = obj;
        this.f = obj2;
        this.c = obj3;
        this.d = obj4;
        this.b = tL_error;
    }

    public /* synthetic */ k0(Object obj, Object obj2, TLRPC.TL_error tL_error, TLObject tLObject, Object obj3, int i10) {
        this.a = i10;
        this.e = obj;
        this.f = obj2;
        this.b = tL_error;
        this.c = tLObject;
        this.d = obj3;
    }

    public /* synthetic */ k0(Object obj, TLRPC.TL_error tL_error, Object obj2, Object obj3, TLObject tLObject, int i10) {
        this.a = i10;
        this.e = obj;
        this.b = tL_error;
        this.f = obj2;
        this.c = obj3;
        this.d = tLObject;
    }

    public /* synthetic */ k0(s7 s7Var, org.telegram.ui.ActionBar.c2 c2Var, TLObject tLObject, TL_stars.InputSavedStarGift inputSavedStarGift, Utilities.Callback callback) {
        this.a = 10;
        this.b = s7Var;
        this.f = c2Var;
        this.c = tLObject;
        this.d = inputSavedStarGift;
        this.e = callback;
    }

    public /* synthetic */ k0(TLObject tLObject, MessagesController messagesController, d1 d1Var, m mVar, TLRPC.TL_error tL_error) {
        this.a = 2;
        this.c = tLObject;
        this.d = messagesController;
        this.e = d1Var;
        this.f = mVar;
        this.b = tL_error;
    }

    public /* synthetic */ k0(TLRPC.TL_error tL_error, Utilities.Callback callback, TLObject tLObject, MessagesController messagesController, Utilities.Callback callback2, int i10) {
        this.a = i10;
        this.b = tL_error;
        this.e = callback;
        this.c = tLObject;
        this.d = messagesController;
        this.f = callback2;
    }
}
