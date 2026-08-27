package cg;

import android.app.Activity;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import gh.m6;
import gh.p5;
import hh.u7;
import hh.v6;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import jh.b4;
import jh.b6;
import jh.c5;
import jh.d4;
import jh.e4;
import jh.h9;
import jh.i9;
import jh.j3;
import jh.j6;
import jh.m4;
import jh.r3;
import jh.t3;
import jh.x3;
import lh.cc;
import lh.k9;
import lh.nb;
import lh.o9;
import lh.q9;
import lh.sb;
import lh.z7;
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
import org.telegram.ui.ActionBar.c3;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.e3;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Cells.k6;
import org.telegram.ui.Cells.pa;
import org.telegram.ui.Components.ar;
import org.telegram.ui.Components.ec;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.p71;
import org.telegram.ui.Components.y4;
import org.telegram.ui.Components.z9;
import org.telegram.ui.Components.zk0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.dn;
import org.telegram.ui.do0;
import org.telegram.ui.dq;
import org.telegram.ui.f7;
import org.telegram.ui.id;
import org.telegram.ui.jo;
import org.telegram.ui.kb;
import org.telegram.ui.kr;
import org.telegram.ui.lr;
import org.telegram.ui.m7;
import org.telegram.ui.ma;
import org.telegram.ui.na;
import org.telegram.ui.qb;
import org.telegram.ui.rn;
import org.telegram.ui.s5;
import org.telegram.ui.s7;
import org.telegram.ui.xc;
import org.telegram.ui.xo;
import org.telegram.ui.yf;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class k0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ k0(y2 y2Var, TLObject tLObject, TLRPC.UserFull userFull, TL_account.TL_birthday tL_birthday, TLRPC.TL_error tL_error) {
        this.a = 3;
        this.e = y2Var;
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
            org.telegram.ui.Cells.w1 w1Var = idVar.Q;
            int i10 = g6.w6;
            w1Var.setTag(Integer.valueOf(i10));
            idVar.Q.setTextColor(g6.w0(null, i10, false));
            idVar.V = true;
            return;
        }
        if (tL_error != null && "USERNAME_INVALID".equals(tL_error.text) && tL_channels_checkUsername.username.length() == 4) {
            idVar.Q.setText(LocaleController.getString(R.string.UsernameInvalidShort));
            idVar.Q.setTextColor(g6.w0(null, g6.p7, false));
        } else if (tL_error != null && "USERNAME_PURCHASE_AVAILABLE".equals(tL_error.text)) {
            if (tL_channels_checkUsername.username.length() == 4) {
                idVar.Q.setText(LocaleController.getString(R.string.UsernameInvalidShortPurchase));
            } else {
                idVar.Q.setText(LocaleController.getString(R.string.UsernameInUsePurchase));
            }
            idVar.Q.setTextColor(g6.w0(null, g6.F6, false));
        } else if (tL_error == null || !"CHANNELS_ADMIN_PUBLIC_TOO_MUCH".equals(tL_error.text)) {
            idVar.Q.setTextColor(g6.w0(null, g6.p7, false));
            idVar.Q.setText(LocaleController.getString(R.string.LinkInUse));
        } else {
            idVar.Q.setTextColor(g6.w0(null, g6.p7, false));
            idVar.f0 = false;
            idVar.f0();
        }
        idVar.V = false;
    }

    private final void b() {
        xo xoVar = (xo) this.e;
        String str = (String) this.f;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.b;
        TLObject tLObject = (TLObject) this.c;
        TLRPC.TL_channels_checkUsername tL_channels_checkUsername = (TLRPC.TL_channels_checkUsername) this.d;
        xoVar.d0 = 0;
        String str2 = xoVar.e0;
        if (str2 == null || !str2.equals(str)) {
            return;
        }
        if (tL_error == null && (tLObject instanceof TLRPC.TL_boolTrue)) {
            xoVar.f.setText(LocaleController.formatString("LinkAvailable", R.string.LinkAvailable, str));
            xoVar.f.setTextColorByKey(g6.w6);
            xoVar.g0 = true;
            return;
        }
        if (tL_error != null && "USERNAME_INVALID".equals(tL_error.text) && tL_channels_checkUsername.username.length() == 4) {
            xoVar.f.setText(LocaleController.getString(R.string.UsernameInvalidShort));
            xoVar.f.setTextColor(g6.w0(null, g6.p7, false));
        } else if (tL_error != null && "USERNAME_PURCHASE_AVAILABLE".equals(tL_error.text)) {
            if (tL_channels_checkUsername.username.length() == 4) {
                xoVar.f.setText(LocaleController.getString(R.string.UsernameInvalidShortPurchase));
            } else {
                xoVar.f.setText(LocaleController.getString(R.string.UsernameInUsePurchase));
            }
            xoVar.f.setTextColor(g6.w0(null, g6.F6, false));
        } else if (tL_error == null || !"CHANNELS_ADMIN_PUBLIC_TOO_MUCH".equals(tL_error.text)) {
            xoVar.f.setText(LocaleController.getString(R.string.LinkInUse));
            xoVar.f.setTextColorByKey(g6.p7);
        } else {
            xoVar.Y = false;
            xoVar.Z();
        }
        xoVar.g0 = false;
    }

    private final void c() {
        dq.Y((dq) this.e, (TLRPC.TL_error) this.b, (TLRPC.InputCheckPasswordSRP) this.f, (TwoStepVerificationActivity) this.c, (TLRPC.TL_channels_editCreator) this.d);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:173:0x04d4  */
    /* JADX WARN: Type inference failed for: r0v35, types: [org.telegram.ui.ActionBar.n2] */
    /* JADX WARN: Type inference failed for: r10v0, types: [org.telegram.SQLite.SQLiteCursor] */
    /* JADX WARN: Type inference failed for: r10v2, types: [org.telegram.ui.ActionBar.n2, org.telegram.ui.do0] */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v33 */
    /* JADX WARN: Type inference failed for: r10v9, types: [org.telegram.SQLite.SQLiteCursor] */
    /* JADX WARN: Type inference failed for: r6v17, types: [org.telegram.tgnet.InputSerializedData, org.telegram.tgnet.NativeByteBuffer] */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v53, types: [java.lang.Integer] */
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
        e4 e4Var;
        h9 h9Var;
        c6 c6Var;
        int i13;
        int i14;
        int i15 = 22;
        int i16 = 4;
        int i17 = 2;
        ?? r10 = 0;
        SQLiteCursor sQLiteCursor = null;
        TLRPC.TL_documentAttributeVideo tL_documentAttributeVideo = null;
        do0 do0Var = null;
        r10 = null;
        TL_stars.SavedStarGift savedStarGift = null;
        do0 do0Var2 = null;
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
                org.telegram.messenger.h2 h2Var = (org.telegram.messenger.h2) this.f;
                if (tL_error2 != null) {
                    wVar.run(tL_error2);
                    return;
                } else {
                    if (tLObject2 instanceof TL_stories.TL_premium_myBoosts) {
                        TL_stories.TL_premium_myBoosts tL_premium_myBoosts2 = (TL_stories.TL_premium_myBoosts) tLObject2;
                        messagesController2.putUsers(tL_premium_myBoosts2.users, false);
                        messagesController2.putChats(tL_premium_myBoosts2.chats, false);
                        h2Var.run(tL_premium_myBoosts2);
                        return;
                    }
                    return;
                }
            case 2:
                TLObject tLObject3 = (TLObject) this.c;
                MessagesController messagesController3 = (MessagesController) this.d;
                e1 e1Var = (e1) this.e;
                m mVar = (m) this.f;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.b;
                if (tLObject3 instanceof TLRPC.TL_payments_checkedGiftCode) {
                    TLRPC.TL_payments_checkedGiftCode tL_payments_checkedGiftCode = (TLRPC.TL_payments_checkedGiftCode) tLObject3;
                    messagesController3.putChats(tL_payments_checkedGiftCode.chats, false);
                    messagesController3.putUsers(tL_payments_checkedGiftCode.users, false);
                    e1Var.run(tL_payments_checkedGiftCode);
                }
                mVar.run(tL_error3);
                return;
            case 3:
                y2.R((y2) this.e, (TLObject) this.c, (TLRPC.UserFull) this.f, (TL_account.TL_birthday) this.d, (TLRPC.TL_error) this.b);
                return;
            case 4:
                m6 m6Var = (m6) this.e;
                TLObject tLObject4 = (TLObject) this.c;
                TLRPC.TL_inputStorePaymentGiftPremium tL_inputStorePaymentGiftPremium = (TLRPC.TL_inputStorePaymentGiftPremium) this.f;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) this.b;
                TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore = (TLRPC.TL_payments_canPurchaseStore) this.d;
                int i19 = m6Var.U;
                org.telegram.ui.ActionBar.n2 n2Var = m6Var.n;
                if (!(tLObject4 instanceof TLRPC.TL_boolTrue)) {
                    if (tL_error4 != null) {
                        y4.f0(i19, tL_error4, n2Var, tL_payments_canPurchaseStore, new Object[0]);
                        return;
                    }
                    return;
                } else {
                    BillingController billingController = BillingController.getInstance();
                    Activity parentActivity = n2Var.getParentActivity();
                    AccountInstance accountInstance = AccountInstance.getInstance(i19);
                    g5.b bVar = new g5.b(i15);
                    bVar.t(m6Var.a0.h);
                    billingController.launchBillingFlow(parentActivity, accountInstance, tL_inputStorePaymentGiftPremium, Collections.singletonList(bVar.i()));
                    return;
                }
            case 5:
                hh.o0 o0Var = (hh.o0) this.e;
                we.d dVar = (we.d) this.f;
                org.telegram.ui.ActionBar.b2 b2Var = (org.telegram.ui.ActionBar.b2) this.c;
                TLRPC.Updates updates = (TLRPC.Updates) this.d;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) this.b;
                hh.v1 v1Var = o0Var.m0;
                if (v1Var != null) {
                    v1Var.run();
                }
                dVar.c(false);
                b2Var.dismiss();
                o0Var.dismiss();
                org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                if (U != null) {
                    if (updates == null) {
                        mc.a0(U).d0(tL_error5, false);
                        return;
                    }
                    ec M = mc.a0(U).M(LocaleController.getString(R.string.GiftOfferSentTitle), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftOfferSentText, o0Var.V, DialogObject.getShortName(o0Var.W))), R.raw.forward);
                    M.t = true;
                    M.j();
                    return;
                }
                return;
            case 6:
                u7 u7Var = (u7) this.e;
                TLRPC.TL_error tL_error6 = (TLRPC.TL_error) this.b;
                u0 u0Var = (u0) this.f;
                TLObject tLObject5 = (TLObject) this.c;
                TLRPC.TL_inputInvoiceStars tL_inputInvoiceStars = (TLRPC.TL_inputInvoiceStars) this.d;
                if (tL_error6 != null) {
                    u0Var.run(Boolean.FALSE, tL_error6.text);
                    return;
                }
                if (tLObject5 instanceof TLRPC.PaymentForm) {
                    TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject5;
                    paymentForm.invoice.recurring = true;
                    MessagesController.getInstance(u7Var.a).putUsers(paymentForm.users, false);
                    r10 = new do0(paymentForm, tL_inputInvoiceStars, null);
                } else if (tLObject5 instanceof TLRPC.PaymentReceipt) {
                    r10 = new do0((TLRPC.PaymentReceipt) tLObject5);
                }
                if (r10 == 0) {
                    u0Var.run(Boolean.FALSE, "UNKNOWN_RESPONSE");
                    return;
                }
                r10.V0 = new h3.x(u0Var, 11);
                ?? R = LaunchActivity.R();
                if (R == 0) {
                    return;
                }
                if (!AndroidUtilities.hasDialogOnTop(R)) {
                    R.presentFragment(r10);
                    return;
                }
                org.telegram.ui.ActionBar.l2 l2Var = new org.telegram.ui.ActionBar.l2();
                l2Var.a = true;
                R.showAsSheet(r10, l2Var);
                return;
            case 7:
                u7 u7Var2 = (u7) this.e;
                TLRPC.TL_error tL_error7 = (TLRPC.TL_error) this.b;
                p5 p5Var = (p5) this.f;
                TLObject tLObject6 = (TLObject) this.c;
                TLRPC.TL_inputInvoiceStars tL_inputInvoiceStars2 = (TLRPC.TL_inputInvoiceStars) this.d;
                if (tL_error7 != null) {
                    p5Var.run(Boolean.FALSE, tL_error7.text);
                    return;
                }
                if (tLObject6 instanceof TLRPC.PaymentForm) {
                    TLRPC.PaymentForm paymentForm2 = (TLRPC.PaymentForm) tLObject6;
                    paymentForm2.invoice.recurring = true;
                    MessagesController.getInstance(u7Var2.a).putUsers(paymentForm2.users, false);
                    do0Var2 = new do0(paymentForm2, tL_inputInvoiceStars2, null);
                } else if (tLObject6 instanceof TLRPC.PaymentReceipt) {
                    do0Var2 = new do0((TLRPC.PaymentReceipt) tLObject6);
                }
                if (do0Var2 == null) {
                    p5Var.run(Boolean.FALSE, "UNKNOWN_RESPONSE");
                    return;
                }
                do0Var2.V0 = new h3.x(p5Var, 12);
                org.telegram.ui.ActionBar.n2 R2 = LaunchActivity.R();
                if (R2 == null) {
                    return;
                }
                if (!AndroidUtilities.hasDialogOnTop(R2)) {
                    R2.presentFragment(do0Var2);
                    return;
                }
                org.telegram.ui.ActionBar.l2 l2Var2 = new org.telegram.ui.ActionBar.l2();
                l2Var2.a = true;
                R2.showAsSheet(do0Var2, l2Var2);
                return;
            case 8:
                u7 u7Var3 = (u7) this.b;
                boolean[] zArr = (boolean[]) this.e;
                String str = (String) this.f;
                TLRPC.ChatInvite chatInvite = (TLRPC.ChatInvite) this.c;
                Utilities.Callback2 callback22 = (Utilities.Callback2) this.d;
                zArr[0] = true;
                u7Var3.Z(str, chatInvite, new ch.c(callback22, 17));
                return;
            case 9:
                MessagesStorage messagesStorage = (MessagesStorage) this.b;
                ArrayList arrayList2 = (ArrayList) this.e;
                ArrayList<TLRPC.Chat> arrayList3 = (ArrayList) this.f;
                ArrayList<TLRPC.User> arrayList4 = (ArrayList) this.c;
                h3.x xVar = (h3.x) this.d;
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
                            } catch (Exception e9) {
                                e = e9;
                                i10 = i20;
                                sQLiteCursor = queryFinalized;
                                FileLog.e(e);
                                if (sQLiteCursor != null) {
                                    sQLiteCursor.dispose();
                                }
                                i11 = i10;
                                AndroidUtilities.runOnUIThread(new v6(xVar, arrayList2, i11, j10, arrayList4, arrayList3));
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
                    } catch (Throwable th) {
                        if (0 != 0) {
                            r10.dispose();
                        }
                        throw th;
                    }
                } catch (Exception e10) {
                    e = e10;
                    j10 = 0;
                    i10 = 0;
                }
                AndroidUtilities.runOnUIThread(new v6(xVar, arrayList2, i11, j10, arrayList4, arrayList3));
                return;
            case 10:
                u7 u7Var4 = (u7) this.b;
                org.telegram.ui.ActionBar.b2 b2Var2 = (org.telegram.ui.ActionBar.b2) this.f;
                TLObject tLObject7 = (TLObject) this.c;
                TL_stars.InputSavedStarGift inputSavedStarGift = (TL_stars.InputSavedStarGift) this.d;
                Utilities.Callback callback3 = (Utilities.Callback) this.e;
                int i22 = u7Var4.a;
                b2Var2.dismiss();
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
                u7 u7Var5 = (u7) this.e;
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
                    MessagesController.getInstance(u7Var5.a).putUsers(paymentForm3.users, false);
                    do0Var = new do0(paymentForm3, tL_inputInvoiceStars3, null);
                } else if (tLObject8 instanceof TLRPC.PaymentReceipt) {
                    do0Var = new do0((TLRPC.PaymentReceipt) tLObject8);
                }
                if (do0Var == null) {
                    callback23.run(Boolean.FALSE, "UNKNOWN_RESPONSE");
                    return;
                }
                do0Var.V0 = new h3.x(callback23, 10);
                org.telegram.ui.ActionBar.n2 R3 = LaunchActivity.R();
                if (R3 == null) {
                    return;
                }
                if (!AndroidUtilities.hasDialogOnTop(R3)) {
                    R3.presentFragment(do0Var);
                    return;
                }
                org.telegram.ui.ActionBar.l2 l2Var3 = new org.telegram.ui.ActionBar.l2();
                l2Var3.a = true;
                R3.showAsSheet(do0Var, l2Var3);
                return;
            case 12:
                List list = (List) this.b;
                Utilities.Callback2 callback24 = (Utilities.Callback2) this.e;
                TLRPC.TL_inputStorePaymentStarsTopup tL_inputStorePaymentStarsTopup = (TLRPC.TL_inputStorePaymentStarsTopup) this.f;
                TL_stars.TL_starsTopupOption tL_starsTopupOption = (TL_stars.TL_starsTopupOption) this.c;
                Activity activity = (Activity) this.d;
                if (list.isEmpty()) {
                    FileLog.d("StarsController.buy queryProductDetails done: no products");
                    AndroidUtilities.runOnUIThread(new hh.p5(2, callback24));
                    return;
                }
                n2.l lVar = (n2.l) list.get(0);
                n2.i a2 = lVar.a();
                if (a2 == null) {
                    FileLog.d("StarsController.buy queryProductDetails done: no details");
                    AndroidUtilities.runOnUIThread(new hh.p5(3, callback24));
                    return;
                }
                tL_inputStorePaymentStarsTopup.currency = a2.c;
                tL_inputStorePaymentStarsTopup.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsTopupOption.currency)) * (a2.b / Math.pow(10.0d, 6.0d)));
                BillingController.getInstance().addResultListener(lVar.c, new gh.c6(callback24, 1));
                BillingController.getInstance().setOnCanceled(new hh.p5(0, callback24));
                FileLog.d("StarsController.buy launchBillingFlow");
                BillingController billingController2 = BillingController.getInstance();
                AccountInstance accountInstance2 = AccountInstance.getInstance(UserConfig.selectedAccount);
                g5.b bVar2 = new g5.b(i15);
                bVar2.t((n2.l) list.get(0));
                billingController2.launchBillingFlow(activity, accountInstance2, tL_inputStorePaymentStarsTopup, Collections.singletonList(bVar2.i()));
                return;
            case 13:
                jh.o oVar = (jh.o) this.b;
                jh.p pVar = (jh.p) this.e;
                Long l10 = (Long) this.f;
                sb sbVar = (sb) this.c;
                Runnable runnable = (Runnable) this.d;
                if (oVar == null) {
                    oVar = pVar.e(l10.longValue());
                }
                sbVar.Y(nb.c(oVar));
                runnable.run();
                return;
            case 14:
                e4 e4Var2 = (e4) this.e;
                Runnable runnable2 = (Runnable) this.f;
                TLRPC.TL_error tL_error9 = (TLRPC.TL_error) this.b;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) this.c;
                o9 o9Var = (o9) this.d;
                c6 c6Var2 = e4Var2.x0;
                j3 j3Var = e4Var2.Y0;
                if (runnable2 != null) {
                    runnable2.run();
                }
                if (tL_error9 == null || "STORY_NOT_MODIFIED".equals(tL_error9.text)) {
                    storyItem.parsedPrivacy = o9Var;
                    ArrayList arrayList7 = o9Var.b;
                    int i24 = o9Var.a;
                    ArrayList arrayList8 = o9Var.c;
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
                                    i25 = com.google.android.recaptcha.internal.a.f(tL_inputPrivacyValueDisallowUsers.users.get(i25).user_id, tL_privacyValueDisallowUsers.users, i25, 1);
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
                                    for (int i26 = 0; i26 < tL_inputPrivacyValueAllowUsers.users.size(); i26 = com.google.android.recaptcha.internal.a.f(tL_inputPrivacyValueAllowUsers.users.get(i26).user_id, tL_privacyValueAllowUsers.users, i26, 1)) {
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
                    MessagesController.getInstance(e4Var2.y2).getStoriesController().p0(storyItem.dialogId, storyItem, true);
                    e4Var2.X3 = true;
                    if (i24 == 4) {
                        new mc(j3Var, c6Var2).Q(R.raw.contact_check, 36, LocaleController.getString("StorySharedToEveryone")).j();
                    } else if (i24 == 1) {
                        new mc(j3Var, c6Var2).Q(R.raw.contact_check, 36, LocaleController.getString("StorySharedToCloseFriends")).j();
                    } else if (i24 == 2) {
                        if (arrayList8.isEmpty()) {
                            new mc(j3Var, c6Var2).Q(R.raw.contact_check, 36, LocaleController.getString("StorySharedToAllContacts")).j();
                        } else {
                            new mc(j3Var, c6Var2).Q(R.raw.contact_check, 36, LocaleController.formatPluralString("StorySharedToAllContactsExcluded", arrayList8.size(), new Object[0])).j();
                        }
                    } else if (i24 == 3) {
                        HashSet hashSet = new HashSet();
                        hashSet.addAll(arrayList8);
                        Iterator it = o9Var.d.values().iterator();
                        while (it.hasNext()) {
                            hashSet.addAll((ArrayList) it.next());
                        }
                        z10 = false;
                        new mc(j3Var, c6Var2).Q(R.raw.contact_check, 36, LocaleController.formatPluralString("StorySharedToContacts", hashSet.size(), new Object[0])).j();
                        e4Var2.f1(z10);
                        return;
                    }
                } else {
                    org.telegram.messenger.y1.q(R.string.UnknownError, new mc(j3Var, c6Var2), R.raw.error, 36);
                }
                z10 = false;
                e4Var2.f1(z10);
                return;
            case 15:
                x3 x3Var = (x3) this.b;
                Activity activity2 = (Activity) this.e;
                TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) this.f;
                i9 i9Var = (i9) this.c;
                b4 b4Var = (b4) this.d;
                sb E = sb.E(activity2, x3Var.l.y2);
                d4 d4Var = x3Var.l.I2;
                long j12 = (d4Var == null || (h9Var = d4Var.b) == null) ? 0L : h9Var.currentPosition;
                z7 n10 = z7.n(x3Var.l.K1.h(), x3Var.l.K1.a);
                e4 e4Var3 = x3Var.l;
                n10.e = e4Var3.x1;
                TL_stories.StoryItem storyItem3 = e4Var3.K1.a;
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
                        z7 g10 = n10.g();
                        g10.b0 = true;
                        e4Var = x3Var.l;
                        TL_stories.StoryItem storyItem4 = e4Var.K1.a;
                        g10.c0 = storyItem4.media.document;
                        g10.d0 = new gh.i(x3Var, storyItem4, storyItem2, 5);
                        if (e4Var.I0()) {
                            e4 e4Var4 = x3Var.l;
                            g10.J0 = e4Var4.x1;
                            g10.L0 = MessagesController.toInputMedia(e4Var4.K1.a.media);
                            j6 j6Var = i9Var.K0;
                            if (j6Var instanceof b6) {
                                g10.K0 = ((b6) j6Var).E;
                            }
                        }
                        E.S(nb.d(i9Var), g10, j12);
                        E.M = new r3(x3Var, i17);
                        E.N = new t3(x3Var, b4Var, i18);
                        return;
                    }
                }
                j11 = 0;
                n10.e0 = j11;
                z7 g102 = n10.g();
                g102.b0 = true;
                e4Var = x3Var.l;
                TL_stories.StoryItem storyItem42 = e4Var.K1.a;
                g102.c0 = storyItem42.media.document;
                g102.d0 = new gh.i(x3Var, storyItem42, storyItem2, 5);
                if (e4Var.I0()) {
                }
                E.S(nb.d(i9Var), g102, j12);
                E.M = new r3(x3Var, i17);
                E.N = new t3(x3Var, b4Var, i18);
                return;
            case 16:
                m4 m4Var = (m4) this.b;
                TLRPC.User user = (TLRPC.User) this.e;
                String str2 = (String) this.f;
                k6 k6Var = (k6) this.c;
                TL_stories.StoryView storyView = (TL_stories.StoryView) this.d;
                ArrayList<TLRPC.User> arrayList10 = new ArrayList<>();
                arrayList10.add(user);
                c5 c5Var = m4Var.b;
                ContactsController.getInstance(c5Var.v).deleteContact(arrayList10, false);
                pa.r(R.string.DeletedFromYourContacts, new Object[]{str2}, new mc(c5Var, c5Var.s), R.raw.ic_ban, 36);
                k6Var.a(c5Var.d(storyView) ? 1.0f : 0.5f, true);
                return;
            case 17:
                k9 k9Var = (k9) this.e;
                org.telegram.ui.ActionBar.b2 b2Var3 = (org.telegram.ui.ActionBar.b2) this.f;
                TLObject tLObject9 = (TLObject) this.c;
                TL_phone.getGroupCallStreamRtmpUrl getgroupcallstreamrtmpurl = (TL_phone.getGroupCallStreamRtmpUrl) this.d;
                TLRPC.TL_error tL_error10 = (TLRPC.TL_error) this.b;
                q9 q9Var = k9Var.S;
                b2Var3.dismiss();
                if (!(tLObject9 instanceof TL_phone.groupCallStreamRtmpUrl)) {
                    if (tL_error10 != null) {
                        c3 c3Var = q9Var.container;
                        c6Var = ((e3) q9Var).resourcesProvider;
                        new mc(c3Var, c6Var).d0(tL_error10, true);
                        return;
                    }
                    return;
                }
                ar[] arVarArr = new ar[1];
                Context context = k9Var.getContext();
                i13 = ((e3) q9Var).currentAccount;
                ar arVar = new ar(context, i13, getgroupcallstreamrtmpurl, (TL_phone.groupCallStreamRtmpUrl) tLObject9, q9Var.H ? null : new gh.d1(14, k9Var, arVarArr), new jh.b());
                arVarArr[0] = arVar;
                arVar.show();
                return;
            case 18:
                cc.a((cc) this.b, (ViewGroup) this.e, (c6) this.f, (z9) this.c, (View) this.d);
                return;
            case 19:
                ((CameraController) this.b).lambda$open$10((CameraSession) this.e, (Runnable) this.f, (SurfaceTexture) this.c, (Runnable) this.d);
                return;
            case 20:
                s7 s7Var = (s7) this.b;
                ih.a aVar = (ih.a) this.e;
                TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio = (TLRPC.TL_documentAttributeAudio) this.f;
                String str3 = (String) this.c;
                String str4 = (String) this.d;
                s7Var.getClass();
                aVar.e.a = false;
                tL_documentAttributeAudio.title = str3;
                tL_documentAttributeAudio.performer = str4;
                p71 p71Var = s7Var.h;
                for (int i28 = 0; i28 < p71Var.getViewPages().length; i28++) {
                    zk0 zk0Var = (zk0) p71Var.getViewPages()[i28];
                    if (zk0Var != null && ((f7) zk0Var.getAdapter()).d == 3) {
                        f7 f7Var = (f7) zk0Var.getAdapter();
                        int i29 = 0;
                        while (true) {
                            if (i29 >= f7Var.e.size()) {
                                break;
                            } else if (((m7) f7Var.e.get(i29)).d == aVar) {
                                f7Var.m(i29);
                            } else {
                                i29++;
                            }
                        }
                    }
                }
                return;
            case 21:
                na naVar = (na) this.e;
                String str5 = (String) this.f;
                TLRPC.TL_error tL_error11 = (TLRPC.TL_error) this.b;
                TLObject tLObject10 = (TLObject) this.c;
                TL_account.checkUsername checkusername = (TL_account.checkUsername) this.d;
                naVar.e = 0;
                String str6 = naVar.f;
                if (str6 == null || !str6.equals(str5)) {
                    return;
                }
                if (tL_error11 == null && (tLObject10 instanceof TLRPC.TL_boolTrue)) {
                    org.telegram.ui.Cells.w1 w1Var = naVar.C;
                    if (w1Var != null) {
                        w1Var.setText(LocaleController.formatString("UsernameAvailable", R.string.UsernameAvailable, str5));
                        org.telegram.ui.Cells.w1 w1Var2 = naVar.C;
                        int i30 = g6.w6;
                        w1Var2.setTag(Integer.valueOf(i30));
                        naVar.C.setTextColor(g6.w0(null, i30, false));
                        ma maVar = naVar.B;
                        if (maVar != null) {
                            ma.a(maVar);
                            return;
                        }
                        return;
                    }
                    return;
                }
                if (naVar.C != null) {
                    if (tL_error11 != null && "USERNAME_INVALID".equals(tL_error11.text) && checkusername.username.length() == 4) {
                        naVar.C.setText(LocaleController.getString(R.string.UsernameInvalidShort));
                        org.telegram.ui.Cells.w1 w1Var3 = naVar.C;
                        int i31 = g6.p7;
                        w1Var3.setTag(Integer.valueOf(i31));
                        naVar.C.setTextColor(g6.w0(null, i31, false));
                    } else if (tL_error11 == null || !"USERNAME_PURCHASE_AVAILABLE".equals(tL_error11.text)) {
                        naVar.C.setText(LocaleController.getString(R.string.UsernameInUse));
                        org.telegram.ui.Cells.w1 w1Var4 = naVar.C;
                        int i32 = g6.p7;
                        w1Var4.setTag(Integer.valueOf(i32));
                        naVar.C.setTextColor(g6.w0(null, i32, false));
                    } else {
                        if (checkusername.username.length() == 4) {
                            naVar.C.setText(LocaleController.getString(R.string.UsernameInvalidShortPurchase));
                        } else {
                            naVar.C.setText(LocaleController.getString(R.string.UsernameInUsePurchase));
                        }
                        org.telegram.ui.Cells.w1 w1Var5 = naVar.C;
                        int i33 = g6.F6;
                        w1Var5.setTag(Integer.valueOf(i33));
                        naVar.C.setTextColor(g6.w0(null, i33, false));
                    }
                    ma maVar2 = naVar.B;
                    if (maVar2 != null) {
                        ma.a(maVar2);
                        return;
                    }
                    return;
                }
                return;
            case 22:
                kb kbVar = (kb) this.b;
                TLRPC.TL_chatInviteExported tL_chatInviteExported = (TLRPC.TL_chatInviteExported) this.e;
                TLRPC.TL_messages_exportedChatInvite tL_messages_exportedChatInvite = (TLRPC.TL_messages_exportedChatInvite) this.f;
                boolean[] zArr2 = (boolean[]) this.c;
                org.telegram.ui.ActionBar.b2 b2Var4 = (org.telegram.ui.ActionBar.b2) this.d;
                qb qbVar = kbVar.a.n;
                qbVar.A0 = false;
                qbVar.y0.put(tL_chatInviteExported.link, tL_messages_exportedChatInvite == null ? 0 : tL_messages_exportedChatInvite);
                if (zArr2[0]) {
                    return;
                }
                b2Var4.dismiss();
                if (tL_messages_exportedChatInvite != null) {
                    qb.A0(qbVar, tL_messages_exportedChatInvite, qbVar.z0);
                    return;
                } else {
                    org.telegram.messenger.y1.q(R.string.LinkHashExpired, mc.a0(qbVar), R.raw.linkbroken, 36);
                    return;
                }
            case 23:
                xc xcVar = (xc) this.e;
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
                        xcVar.getMessagesController().getBoostsController().userCanBoostChannel(xcVar.a, xcVar.c, new org.telegram.ui.cc(xcVar, i18));
                        return;
                    } else {
                        xcVar.L.setLoading(false);
                        pa.r(R.string.UnknownErrorCode, new Object[]{tL_error12.text}, mc.a0(xcVar), R.raw.error, 36);
                        return;
                    }
                }
                int i34 = i14 + 1;
                iArr[0] = i34;
                if (i34 == iArr2[0]) {
                    xcVar.finishFragment();
                    org.telegram.ui.ActionBar.n2 n2Var2 = xcVar.h0;
                    if (n2Var2 != null) {
                        if (n2Var2 instanceof jo) {
                            ((jo) n2Var2).o0();
                        }
                        org.telegram.messenger.y1.q(xcVar.d ? R.string.GroupAppearanceUpdated : R.string.ChannelAppearanceUpdated, mc.a0(xcVar.h0), R.raw.contact_check, 36);
                        xcVar.h0 = null;
                    }
                    xcVar.L.setLoading(false);
                    return;
                }
                return;
            case 24:
                a();
                return;
            case 25:
                rn rnVar = (rn) this.b;
                boolean[] zArr4 = (boolean[]) this.e;
                boolean[] zArr5 = (boolean[]) this.f;
                ImageView imageView = (ImageView) this.c;
                ImageView imageView2 = (ImageView) this.d;
                if (zArr4[0]) {
                    return;
                }
                zArr4[0] = true;
                long[] jArr = {-1};
                yf yfVar = new yf(jArr, zArr5, imageView, imageView2, 2);
                TLRPC.TL_messages_rateTranscribedAudio tL_messages_rateTranscribedAudio = new TLRPC.TL_messages_rateTranscribedAudio();
                tL_messages_rateTranscribedAudio.msg_id = rnVar.Z4.getId();
                tL_messages_rateTranscribedAudio.peer = rnVar.getMessagesController().getInputPeer(rnVar.Z4.messageOwner.peer_id);
                tL_messages_rateTranscribedAudio.transcription_id = rnVar.Z4.messageOwner.voiceTranscriptionId;
                tL_messages_rateTranscribedAudio.good = zArr5[0];
                rnVar.getConnectionsManager().sendRequest(tL_messages_rateTranscribedAudio, new org.telegram.ui.z9(rnVar, yfVar, jArr, i16));
                AndroidUtilities.runOnUIThread(yfVar, 150L);
                return;
            case 26:
                dn dnVar = (dn) this.b;
                TLRPC.Message message = (TLRPC.Message) this.e;
                org.telegram.ui.ActionBar.b2[] b2VarArr = (org.telegram.ui.ActionBar.b2[]) this.f;
                MessageObject messageObject = (MessageObject) this.c;
                s5 s5Var = (s5) this.d;
                rn rnVar2 = dnVar.a;
                if (message.suggested_post.schedule_date != 0) {
                    rnVar2.getMessagesController().approveSuggestedMessage(DialogObject.getPeerDialogId(messageObject.messageOwner.peer_id), messageObject.messageOwner.id, 0);
                    return;
                }
                b2VarArr[0].setOnDismissListener(null);
                e3 e3Var = y4.T(rnVar2.getParentActivity(), 0L, new jh.z1(20, dnVar, messageObject), rnVar2.getResourceProvider(), 1).a;
                e3Var.show();
                e3Var.setOnDismissListener(s5Var);
                return;
            case 27:
                b();
                return;
            case 28:
                c();
                return;
            default:
                kr krVar = (kr) this.b;
                ArrayList arrayList11 = (ArrayList) this.e;
                a0.h hVar = (a0.h) this.f;
                ArrayList arrayList12 = (ArrayList) this.c;
                ArrayList arrayList13 = (ArrayList) this.d;
                pf.j1 j1Var = krVar.h;
                lr lrVar = krVar.y;
                if (lrVar.k1) {
                    krVar.s = false;
                    krVar.d = arrayList11;
                    krVar.e = hVar;
                    krVar.f = arrayList12;
                    j1Var.f(arrayList11, null);
                    if (!ChatObject.isChannel(lrVar.r)) {
                        ArrayList arrayList14 = j1Var.g;
                        arrayList14.clear();
                        arrayList14.addAll(arrayList13);
                    }
                    int i35 = krVar.r;
                    krVar.l();
                    if (krVar.r > i35) {
                        lrVar.y0(i35);
                    }
                    if (j1Var.e() || krVar.r != 0) {
                        return;
                    }
                    lrVar.b.e(false, true);
                    return;
                }
                return;
        }
    }

    public /* synthetic */ k0(m6 m6Var, TLObject tLObject, TLRPC.TL_inputStorePaymentGiftPremium tL_inputStorePaymentGiftPremium, TLRPC.TL_error tL_error, TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore) {
        this.a = 4;
        this.e = m6Var;
        this.c = tLObject;
        this.f = tL_inputStorePaymentGiftPremium;
        this.b = tL_error;
        this.d = tL_payments_canPurchaseStore;
    }

    public /* synthetic */ k0(u7 u7Var, org.telegram.ui.ActionBar.b2 b2Var, TLObject tLObject, TL_stars.InputSavedStarGift inputSavedStarGift, Utilities.Callback callback) {
        this.a = 10;
        this.b = u7Var;
        this.f = b2Var;
        this.c = tLObject;
        this.d = inputSavedStarGift;
        this.e = callback;
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

    public /* synthetic */ k0(TLObject tLObject, MessagesController messagesController, e1 e1Var, m mVar, TLRPC.TL_error tL_error) {
        this.a = 2;
        this.c = tLObject;
        this.d = messagesController;
        this.e = e1Var;
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
