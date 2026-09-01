package hg;

import android.app.Activity;
import android.graphics.SurfaceTexture;
import android.text.TextUtils;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import lh.e6;
import lh.i5;
import mh.m5;
import mh.n5;
import mh.t7;
import mh.u6;
import n7.qa;
import oh.c4;
import oh.d6;
import oh.e4;
import oh.e5;
import oh.f4;
import oh.h9;
import oh.i9;
import oh.j3;
import oh.l6;
import oh.o4;
import oh.r3;
import oh.u3;
import oh.y3;
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
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.h3;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Cells.n6;
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.m81;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.tl0;
import org.telegram.ui.Components.yx0;
import org.telegram.ui.Components.z4;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.ba;
import org.telegram.ui.bd;
import org.telegram.ui.ec;
import org.telegram.ui.ep;
import org.telegram.ui.h7;
import org.telegram.ui.jn;
import org.telegram.ui.kq;
import org.telegram.ui.lo0;
import org.telegram.ui.mb;
import org.telegram.ui.nd;
import org.telegram.ui.o7;
import org.telegram.ui.oa;
import org.telegram.ui.pa;
import org.telegram.ui.po;
import org.telegram.ui.pr;
import org.telegram.ui.qr;
import org.telegram.ui.sb;
import org.telegram.ui.u7;
import org.telegram.ui.v5;
import org.telegram.ui.xn;
import org.telegram.ui.yh;
import qh.b8;
import qh.ca;
import qh.s6;
import qh.x9;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class j0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ j0(int i10, Object obj, Object obj2, Object obj3, Object obj4, TLRPC.TL_error tL_error) {
        this.a = i10;
        this.e = obj;
        this.f = obj2;
        this.c = obj3;
        this.d = obj4;
        this.b = tL_error;
    }

    private final void a() {
        xn xnVar = (xn) this.b;
        boolean[] zArr = (boolean[]) this.e;
        boolean[] zArr2 = (boolean[]) this.f;
        ImageView imageView = (ImageView) this.c;
        ImageView imageView2 = (ImageView) this.d;
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        long[] jArr = {-1};
        androidx.car.app.utils.c cVar = new androidx.car.app.utils.c(jArr, zArr2, imageView, imageView2, 28);
        TLRPC.TL_messages_rateTranscribedAudio tL_messages_rateTranscribedAudio = new TLRPC.TL_messages_rateTranscribedAudio();
        tL_messages_rateTranscribedAudio.msg_id = xnVar.a5.getId();
        tL_messages_rateTranscribedAudio.peer = xnVar.getMessagesController().getInputPeer(xnVar.a5.messageOwner.peer_id);
        tL_messages_rateTranscribedAudio.transcription_id = xnVar.a5.messageOwner.voiceTranscriptionId;
        tL_messages_rateTranscribedAudio.good = zArr2[0];
        xnVar.getConnectionsManager().sendRequest(tL_messages_rateTranscribedAudio, new ba(xnVar, cVar, jArr, 4));
        AndroidUtilities.runOnUIThread(cVar, 150L);
    }

    private final void b() {
        jn jnVar = (jn) this.b;
        TLRPC.Message message = (TLRPC.Message) this.e;
        org.telegram.ui.ActionBar.d2[] d2VarArr = (org.telegram.ui.ActionBar.d2[]) this.f;
        MessageObject messageObject = (MessageObject) this.c;
        v5 v5Var = (v5) this.d;
        xn xnVar = jnVar.a;
        if (message.suggested_post.schedule_date != 0) {
            xnVar.getMessagesController().approveSuggestedMessage(DialogObject.getPeerDialogId(messageObject.messageOwner.peer_id), messageObject.messageOwner.id, 0);
            return;
        }
        d2VarArr[0].setOnDismissListener(null);
        h3 h3Var = z4.T(xnVar.getParentActivity(), 0L, new ng.w(19, jnVar, messageObject), xnVar.getResourceProvider(), 1).a;
        h3Var.show();
        h3Var.setOnDismissListener(v5Var);
    }

    private final void c() {
        ep epVar = (ep) this.e;
        String str = (String) this.f;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.b;
        TLObject tLObject = (TLObject) this.c;
        TLRPC.TL_channels_checkUsername tL_channels_checkUsername = (TLRPC.TL_channels_checkUsername) this.d;
        epVar.e0 = 0;
        String str2 = epVar.f0;
        if (str2 == null || !str2.equals(str)) {
            return;
        }
        if (tL_error == null && (tLObject instanceof TLRPC.TL_boolTrue)) {
            epVar.f.setText(LocaleController.formatString("LinkAvailable", R.string.LinkAvailable, str));
            epVar.f.setTextColorByKey(k6.w6);
            epVar.h0 = true;
            return;
        }
        if (tL_error != null && "USERNAME_INVALID".equals(tL_error.text) && tL_channels_checkUsername.username.length() == 4) {
            epVar.f.setText(LocaleController.getString(R.string.UsernameInvalidShort));
            epVar.f.setTextColor(k6.w0(null, k6.p7, false));
        } else if (tL_error != null && "USERNAME_PURCHASE_AVAILABLE".equals(tL_error.text)) {
            if (tL_channels_checkUsername.username.length() == 4) {
                epVar.f.setText(LocaleController.getString(R.string.UsernameInvalidShortPurchase));
            } else {
                epVar.f.setText(LocaleController.getString(R.string.UsernameInUsePurchase));
            }
            epVar.f.setTextColor(k6.w0(null, k6.F6, false));
        } else if (tL_error == null || !"CHANNELS_ADMIN_PUBLIC_TOO_MUCH".equals(tL_error.text)) {
            epVar.f.setText(LocaleController.getString(R.string.LinkInUse));
            epVar.f.setTextColorByKey(k6.p7);
        } else {
            epVar.Z = false;
            epVar.Z();
        }
        epVar.h0 = false;
    }

    private final void e() {
        pr prVar = (pr) this.b;
        ArrayList arrayList = (ArrayList) this.e;
        a0.h hVar = (a0.h) this.f;
        ArrayList arrayList2 = (ArrayList) this.c;
        ArrayList arrayList3 = (ArrayList) this.d;
        uf.k1 k1Var = prVar.h;
        qr qrVar = prVar.y;
        if (qrVar.l1) {
            prVar.s = false;
            prVar.d = arrayList;
            prVar.e = hVar;
            prVar.f = arrayList2;
            k1Var.f(arrayList, null);
            if (!ChatObject.isChannel(qrVar.r)) {
                ArrayList arrayList4 = k1Var.g;
                arrayList4.clear();
                arrayList4.addAll(arrayList3);
            }
            int i10 = prVar.r;
            prVar.l();
            if (prVar.r > i10) {
                qrVar.y0(i10);
            }
            if (k1Var.e() || prVar.r != 0) {
                return;
            }
            qrVar.b.e(false, true);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:182:0x04c6  */
    /* JADX WARN: Removed duplicated region for block: B:365:0x0959  */
    /* JADX WARN: Type inference failed for: r0v35, types: [org.telegram.ui.ActionBar.p2] */
    /* JADX WARN: Type inference failed for: r12v0, types: [org.telegram.SQLite.SQLiteCursor] */
    /* JADX WARN: Type inference failed for: r12v2, types: [org.telegram.ui.ActionBar.p2, org.telegram.ui.lo0] */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v30 */
    /* JADX WARN: Type inference failed for: r12v9, types: [org.telegram.SQLite.SQLiteCursor] */
    /* JADX WARN: Type inference failed for: r3v30, types: [org.telegram.tgnet.InputSerializedData, org.telegram.tgnet.NativeByteBuffer] */
    /* JADX WARN: Type inference failed for: r7v24, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v13 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        m5 m5Var;
        ArrayList arrayList;
        long j10;
        int i10;
        long j11;
        int i11;
        boolean z4;
        ArrayList arrayList2;
        int i12;
        TLRPC.MessageMedia messageMedia;
        TLRPC.Document document;
        long j12;
        f4 f4Var;
        h9 h9Var;
        int i13;
        int i14 = 23;
        int i15 = 2;
        ?? r12 = 0;
        SQLiteCursor sQLiteCursor = null;
        TLRPC.TL_documentAttributeVideo tL_documentAttributeVideo = null;
        lo0 lo0Var = null;
        r12 = null;
        TL_stars.SavedStarGift savedStarGift = null;
        lo0 lo0Var2 = null;
        int i16 = 0;
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
                c1 c1Var = (c1) this.e;
                m mVar = (m) this.f;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.b;
                if (tLObject3 instanceof TLRPC.TL_payments_checkedGiftCode) {
                    TLRPC.TL_payments_checkedGiftCode tL_payments_checkedGiftCode = (TLRPC.TL_payments_checkedGiftCode) tLObject3;
                    messagesController3.putChats(tL_payments_checkedGiftCode.chats, false);
                    messagesController3.putUsers(tL_payments_checkedGiftCode.users, false);
                    c1Var.run(tL_payments_checkedGiftCode);
                }
                mVar.run(tL_error3);
                return;
            case 3:
                v2.R((v2) this.e, (TLObject) this.c, (TLRPC.UserFull) this.f, (TL_account.TL_birthday) this.d, (TLRPC.TL_error) this.b);
                return;
            case 4:
                e6 e6Var = (e6) this.e;
                TLObject tLObject4 = (TLObject) this.c;
                TLRPC.TL_inputStorePaymentGiftPremium tL_inputStorePaymentGiftPremium = (TLRPC.TL_inputStorePaymentGiftPremium) this.f;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) this.b;
                TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore = (TLRPC.TL_payments_canPurchaseStore) this.d;
                int i17 = e6Var.V;
                org.telegram.ui.ActionBar.p2 p2Var = e6Var.n;
                if (!(tLObject4 instanceof TLRPC.TL_boolTrue)) {
                    if (tL_error4 != null) {
                        z4.f0(i17, tL_error4, p2Var, tL_payments_canPurchaseStore, new Object[0]);
                        return;
                    }
                    return;
                } else {
                    BillingController billingController = BillingController.getInstance();
                    Activity parentActivity = p2Var.getParentActivity();
                    AccountInstance accountInstance = AccountInstance.getInstance(i17);
                    qa qaVar = new qa(i14);
                    qaVar.i1(e6Var.b0.h);
                    billingController.launchBillingFlow(parentActivity, accountInstance, tL_inputStorePaymentGiftPremium, Collections.singletonList(qaVar.O0()));
                    return;
                }
            case 5:
                mh.m0 m0Var = (mh.m0) this.e;
                af.f fVar = (af.f) this.f;
                org.telegram.ui.ActionBar.d2 d2Var = (org.telegram.ui.ActionBar.d2) this.c;
                TLRPC.Updates updates = (TLRPC.Updates) this.d;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) this.b;
                mh.s1 s1Var = m0Var.n0;
                if (s1Var != null) {
                    s1Var.run();
                }
                fVar.c(false);
                d2Var.dismiss();
                m0Var.dismiss();
                org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
                if (U != null) {
                    if (updates == null) {
                        qc.a0(U).d0(tL_error5, false);
                        return;
                    }
                    ic M = qc.a0(U).M(LocaleController.getString(R.string.GiftOfferSentTitle), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftOfferSentText, m0Var.W, DialogObject.getShortName(m0Var.X))), R.raw.forward);
                    M.t = true;
                    M.j();
                    return;
                }
                return;
            case 6:
                t7 t7Var = (t7) this.e;
                TLRPC.TL_error tL_error6 = (TLRPC.TL_error) this.b;
                eh.w wVar2 = (eh.w) this.f;
                TLObject tLObject5 = (TLObject) this.c;
                TLRPC.TL_inputInvoiceStars tL_inputInvoiceStars = (TLRPC.TL_inputInvoiceStars) this.d;
                if (tL_error6 != null) {
                    wVar2.run(Boolean.FALSE, tL_error6.text);
                    return;
                }
                if (tLObject5 instanceof TLRPC.PaymentForm) {
                    TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject5;
                    paymentForm.invoice.recurring = true;
                    MessagesController.getInstance(t7Var.a).putUsers(paymentForm.users, false);
                    r12 = new lo0(paymentForm, tL_inputInvoiceStars, null);
                } else if (tLObject5 instanceof TLRPC.PaymentReceipt) {
                    r12 = new lo0((TLRPC.PaymentReceipt) tLObject5);
                }
                if (r12 == 0) {
                    wVar2.run(Boolean.FALSE, "UNKNOWN_RESPONSE");
                    return;
                }
                r12.W0 = new m5(wVar2, 2);
                ?? R = LaunchActivity.R();
                if (R == 0) {
                    return;
                }
                if (!AndroidUtilities.hasDialogOnTop(R)) {
                    R.presentFragment(r12);
                    return;
                }
                org.telegram.ui.ActionBar.n2 n2Var = new org.telegram.ui.ActionBar.n2();
                n2Var.a = true;
                R.showAsSheet(r12, n2Var);
                return;
            case 7:
                t7 t7Var2 = (t7) this.e;
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
                    MessagesController.getInstance(t7Var2.a).putUsers(paymentForm2.users, false);
                    lo0Var2 = new lo0(paymentForm2, tL_inputInvoiceStars2, null);
                } else if (tLObject6 instanceof TLRPC.PaymentReceipt) {
                    lo0Var2 = new lo0((TLRPC.PaymentReceipt) tLObject6);
                }
                if (lo0Var2 == null) {
                    i5Var.run(Boolean.FALSE, "UNKNOWN_RESPONSE");
                    return;
                }
                lo0Var2.W0 = new m5(i5Var, 3);
                org.telegram.ui.ActionBar.p2 R2 = LaunchActivity.R();
                if (R2 == null) {
                    return;
                }
                if (!AndroidUtilities.hasDialogOnTop(R2)) {
                    R2.presentFragment(lo0Var2);
                    return;
                }
                org.telegram.ui.ActionBar.n2 n2Var2 = new org.telegram.ui.ActionBar.n2();
                n2Var2.a = true;
                R2.showAsSheet(lo0Var2, n2Var2);
                return;
            case 8:
                t7 t7Var3 = (t7) this.b;
                boolean[] zArr = (boolean[]) this.e;
                String str = (String) this.f;
                TLRPC.ChatInvite chatInvite = (TLRPC.ChatInvite) this.c;
                Utilities.Callback2 callback22 = (Utilities.Callback2) this.d;
                zArr[0] = true;
                t7Var3.Z(str, chatInvite, new eg.p1(callback22, 18));
                return;
            case 9:
                MessagesStorage messagesStorage = (MessagesStorage) this.b;
                ArrayList arrayList3 = (ArrayList) this.e;
                ArrayList<TLRPC.Chat> arrayList4 = (ArrayList) this.f;
                ArrayList<TLRPC.User> arrayList5 = (ArrayList) this.c;
                m5 m5Var2 = (m5) this.d;
                try {
                    try {
                        ?? r82 = 0;
                        ?? queryFinalized = messagesStorage.getDatabase().queryFinalized("SELECT data, hash, time FROM star_gifts2 ORDER BY pos ASC", new Object[0]);
                        long j13 = 0;
                        int i18 = 0;
                        while (queryFinalized.next()) {
                            try {
                                try {
                                    ?? byteBufferValue = queryFinalized.byteBufferValue(r82);
                                    if (byteBufferValue != 0) {
                                        TL_stars.StarGift TLdeserialize = TL_stars.StarGift.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(r82), r82);
                                        if (TLdeserialize != null) {
                                            arrayList3.add(TLdeserialize);
                                        }
                                        byteBufferValue.reuse();
                                        int longValue = (int) queryFinalized.longValue(1);
                                        try {
                                            j13 = queryFinalized.longValue(2);
                                            i18 = longValue;
                                        } catch (Exception e6) {
                                            e = e6;
                                            i10 = longValue;
                                            m5Var = m5Var2;
                                            arrayList = arrayList3;
                                            j10 = j13;
                                            sQLiteCursor = queryFinalized;
                                            FileLog.e(e);
                                            if (sQLiteCursor != null) {
                                                sQLiteCursor.dispose();
                                            }
                                            j11 = j10;
                                            i11 = i10;
                                            AndroidUtilities.runOnUIThread(new u6(m5Var, arrayList, i11, j11, arrayList5, arrayList4));
                                            return;
                                        }
                                    }
                                    r82 = 0;
                                } catch (Exception e10) {
                                    e = e10;
                                    i10 = i18;
                                }
                            } catch (Exception e11) {
                                e = e11;
                                m5Var = m5Var2;
                                arrayList = arrayList3;
                            }
                        }
                        ArrayList<Long> arrayList6 = new ArrayList<>();
                        ArrayList arrayList7 = new ArrayList();
                        int size = arrayList3.size();
                        int i19 = 0;
                        while (i19 < size) {
                            Object obj = arrayList3.get(i19);
                            i19++;
                            TLRPC.Peer peer = ((TL_stars.StarGift) obj).released_by;
                            if (peer != null) {
                                m5Var = m5Var2;
                                arrayList = arrayList3;
                                try {
                                    long peerDialogId = DialogObject.getPeerDialogId(peer);
                                    if (peerDialogId > 0) {
                                        arrayList6.add(Long.valueOf(peerDialogId));
                                    } else if (peerDialogId < 0) {
                                        arrayList7.add(Long.valueOf(-peerDialogId));
                                    }
                                } catch (Exception e12) {
                                    e = e12;
                                    i10 = i18;
                                    j10 = j13;
                                    sQLiteCursor = queryFinalized;
                                    FileLog.e(e);
                                    if (sQLiteCursor != null) {
                                    }
                                    j11 = j10;
                                    i11 = i10;
                                    AndroidUtilities.runOnUIThread(new u6(m5Var, arrayList, i11, j11, arrayList5, arrayList4));
                                    return;
                                }
                            } else {
                                m5Var = m5Var2;
                                arrayList = arrayList3;
                            }
                            arrayList3 = arrayList;
                            m5Var2 = m5Var;
                        }
                        m5Var = m5Var2;
                        arrayList = arrayList3;
                        if (!arrayList7.isEmpty()) {
                            messagesStorage.getChatsInternal(TextUtils.join(",", arrayList7), arrayList4);
                        }
                        if (!arrayList6.isEmpty()) {
                            messagesStorage.getUsersInternal(arrayList6, arrayList5);
                        }
                        queryFinalized.dispose();
                        j11 = j13;
                        i11 = i18;
                    } catch (Throwable th2) {
                        if (0 != 0) {
                            r12.dispose();
                        }
                        throw th2;
                    }
                } catch (Exception e13) {
                    e = e13;
                    m5Var = m5Var2;
                    arrayList = arrayList3;
                    j10 = 0;
                    i10 = 0;
                }
                AndroidUtilities.runOnUIThread(new u6(m5Var, arrayList, i11, j11, arrayList5, arrayList4));
                return;
            case 10:
                t7 t7Var4 = (t7) this.b;
                org.telegram.ui.ActionBar.d2 d2Var2 = (org.telegram.ui.ActionBar.d2) this.f;
                TLObject tLObject7 = (TLObject) this.c;
                TL_stars.InputSavedStarGift inputSavedStarGift = (TL_stars.InputSavedStarGift) this.d;
                Utilities.Callback callback3 = (Utilities.Callback) this.e;
                int i20 = t7Var4.a;
                d2Var2.dismiss();
                if (tLObject7 instanceof TL_stars.TL_payments_savedStarGifts) {
                    TL_stars.TL_payments_savedStarGifts tL_payments_savedStarGifts = (TL_stars.TL_payments_savedStarGifts) tLObject7;
                    MessagesController.getInstance(i20).putUsers(tL_payments_savedStarGifts.users, false);
                    MessagesController.getInstance(i20).putChats(tL_payments_savedStarGifts.chats, false);
                    for (int i21 = 0; i21 < tL_payments_savedStarGifts.gifts.size(); i21++) {
                        TL_stars.SavedStarGift savedStarGift2 = tL_payments_savedStarGifts.gifts.get(i21);
                        if (((inputSavedStarGift instanceof TL_stars.TL_inputSavedStarGiftUser) && ((TL_stars.TL_inputSavedStarGiftUser) inputSavedStarGift).msg_id == savedStarGift2.msg_id) || ((inputSavedStarGift instanceof TL_stars.TL_inputSavedStarGiftChat) && ((TL_stars.TL_inputSavedStarGiftChat) inputSavedStarGift).saved_id == savedStarGift2.saved_id)) {
                            savedStarGift = savedStarGift2;
                        }
                    }
                }
                callback3.run(savedStarGift);
                return;
            case 11:
                t7 t7Var5 = (t7) this.e;
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
                    MessagesController.getInstance(t7Var5.a).putUsers(paymentForm3.users, false);
                    lo0Var = new lo0(paymentForm3, tL_inputInvoiceStars3, null);
                } else if (tLObject8 instanceof TLRPC.PaymentReceipt) {
                    lo0Var = new lo0((TLRPC.PaymentReceipt) tLObject8);
                }
                if (lo0Var == null) {
                    callback23.run(Boolean.FALSE, "UNKNOWN_RESPONSE");
                    return;
                }
                lo0Var.W0 = new m5(callback23, 1);
                org.telegram.ui.ActionBar.p2 R3 = LaunchActivity.R();
                if (R3 == null) {
                    return;
                }
                if (!AndroidUtilities.hasDialogOnTop(R3)) {
                    R3.presentFragment(lo0Var);
                    return;
                }
                org.telegram.ui.ActionBar.n2 n2Var3 = new org.telegram.ui.ActionBar.n2();
                n2Var3.a = true;
                R3.showAsSheet(lo0Var, n2Var3);
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
                p2.m mVar2 = (p2.m) list.get(0);
                p2.j a2 = mVar2.a();
                if (a2 == null) {
                    FileLog.d("StarsController.buy queryProductDetails done: no details");
                    AndroidUtilities.runOnUIThread(new n5(3, callback24));
                    return;
                }
                tL_inputStorePaymentStarsTopup.currency = a2.c;
                tL_inputStorePaymentStarsTopup.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsTopupOption.currency)) * (a2.b / Math.pow(10.0d, 6.0d)));
                BillingController.getInstance().addResultListener(mVar2.c, new dg.o(callback24, 2));
                BillingController.getInstance().setOnCanceled(new n5(0, callback24));
                FileLog.d("StarsController.buy launchBillingFlow");
                BillingController billingController2 = BillingController.getInstance();
                AccountInstance accountInstance2 = AccountInstance.getInstance(UserConfig.selectedAccount);
                qa qaVar2 = new qa(i14);
                qaVar2.i1((p2.m) list.get(0));
                billingController2.launchBillingFlow(activity, accountInstance2, tL_inputStorePaymentStarsTopup, Collections.singletonList(qaVar2.O0()));
                return;
            case 13:
                oh.o oVar = (oh.o) this.b;
                oh.p pVar = (oh.p) this.e;
                Long l10 = (Long) this.f;
                ca caVar = (ca) this.c;
                Runnable runnable = (Runnable) this.d;
                if (oVar == null) {
                    oVar = pVar.e(l10.longValue());
                }
                caVar.Y(x9.c(oVar));
                runnable.run();
                return;
            case 14:
                f4 f4Var2 = (f4) this.e;
                Runnable runnable2 = (Runnable) this.f;
                TLRPC.TL_error tL_error9 = (TLRPC.TL_error) this.b;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) this.c;
                b8 b8Var = (b8) this.d;
                g6 g6Var = f4Var2.y0;
                j3 j3Var = f4Var2.Z0;
                if (runnable2 != null) {
                    runnable2.run();
                }
                if (tL_error9 == null || "STORY_NOT_MODIFIED".equals(tL_error9.text)) {
                    storyItem.parsedPrivacy = b8Var;
                    ArrayList arrayList8 = b8Var.b;
                    int i22 = b8Var.a;
                    ArrayList arrayList9 = b8Var.c;
                    ArrayList<TLRPC.PrivacyRule> arrayList10 = new ArrayList<>();
                    while (i16 < arrayList8.size()) {
                        TLRPC.InputPrivacyRule inputPrivacyRule = (TLRPC.InputPrivacyRule) arrayList8.get(i16);
                        if (inputPrivacyRule instanceof TLRPC.TL_inputPrivacyValueAllowAll) {
                            arrayList10.add(new TLRPC.TL_privacyValueAllowAll());
                        } else if (inputPrivacyRule instanceof TLRPC.TL_inputPrivacyValueAllowCloseFriends) {
                            arrayList10.add(new TLRPC.TL_privacyValueAllowCloseFriends());
                        } else if (inputPrivacyRule instanceof TLRPC.TL_inputPrivacyValueAllowContacts) {
                            arrayList10.add(new TLRPC.TL_privacyValueAllowContacts());
                        } else {
                            if (inputPrivacyRule instanceof TLRPC.TL_inputPrivacyValueDisallowUsers) {
                                TLRPC.TL_inputPrivacyValueDisallowUsers tL_inputPrivacyValueDisallowUsers = (TLRPC.TL_inputPrivacyValueDisallowUsers) inputPrivacyRule;
                                TLRPC.TL_privacyValueDisallowUsers tL_privacyValueDisallowUsers = new TLRPC.TL_privacyValueDisallowUsers();
                                int i23 = 0;
                                while (i23 < tL_inputPrivacyValueDisallowUsers.users.size()) {
                                    i23 = android.support.v4.media.a.g(tL_inputPrivacyValueDisallowUsers.users.get(i23).user_id, tL_privacyValueDisallowUsers.users, i23, 1);
                                    i16 = i16;
                                    arrayList8 = arrayList8;
                                }
                                arrayList2 = arrayList8;
                                i12 = i16;
                                arrayList10.add(tL_privacyValueDisallowUsers);
                            } else {
                                arrayList2 = arrayList8;
                                i12 = i16;
                                if (inputPrivacyRule instanceof TLRPC.TL_inputPrivacyValueAllowUsers) {
                                    TLRPC.TL_inputPrivacyValueAllowUsers tL_inputPrivacyValueAllowUsers = (TLRPC.TL_inputPrivacyValueAllowUsers) inputPrivacyRule;
                                    TLRPC.TL_privacyValueAllowUsers tL_privacyValueAllowUsers = new TLRPC.TL_privacyValueAllowUsers();
                                    for (int i24 = 0; i24 < tL_inputPrivacyValueAllowUsers.users.size(); i24 = android.support.v4.media.a.g(tL_inputPrivacyValueAllowUsers.users.get(i24).user_id, tL_privacyValueAllowUsers.users, i24, 1)) {
                                    }
                                    arrayList10.add(tL_privacyValueAllowUsers);
                                    i16 = i12 + 1;
                                    arrayList8 = arrayList2;
                                }
                            }
                            i16 = i12 + 1;
                            arrayList8 = arrayList2;
                        }
                        arrayList2 = arrayList8;
                        i12 = i16;
                        i16 = i12 + 1;
                        arrayList8 = arrayList2;
                    }
                    storyItem.privacy = arrayList10;
                    storyItem.close_friends = i22 == 1;
                    storyItem.contacts = i22 == 2;
                    storyItem.selected_contacts = i22 == 3;
                    MessagesController.getInstance(f4Var2.z2).getStoriesController().p0(storyItem.dialogId, storyItem, true);
                    f4Var2.Y3 = true;
                    if (i22 == 4) {
                        new qc(j3Var, g6Var).Q(R.raw.contact_check, 36, LocaleController.getString("StorySharedToEveryone")).j();
                    } else if (i22 == 1) {
                        new qc(j3Var, g6Var).Q(R.raw.contact_check, 36, LocaleController.getString("StorySharedToCloseFriends")).j();
                    } else if (i22 == 2) {
                        if (arrayList9.isEmpty()) {
                            new qc(j3Var, g6Var).Q(R.raw.contact_check, 36, LocaleController.getString("StorySharedToAllContacts")).j();
                        } else {
                            new qc(j3Var, g6Var).Q(R.raw.contact_check, 36, LocaleController.formatPluralString("StorySharedToAllContactsExcluded", arrayList9.size(), new Object[0])).j();
                        }
                    } else if (i22 == 3) {
                        HashSet hashSet = new HashSet();
                        hashSet.addAll(arrayList9);
                        Iterator it = b8Var.d.values().iterator();
                        while (it.hasNext()) {
                            hashSet.addAll((ArrayList) it.next());
                        }
                        z4 = false;
                        new qc(j3Var, g6Var).Q(R.raw.contact_check, 36, LocaleController.formatPluralString("StorySharedToContacts", hashSet.size(), new Object[0])).j();
                        f4Var2.f1(z4);
                        return;
                    }
                } else {
                    l.d.v(R.string.UnknownError, new qc(j3Var, g6Var), R.raw.error, 36);
                }
                z4 = false;
                f4Var2.f1(z4);
                return;
            case 15:
                y3 y3Var = (y3) this.b;
                Activity activity2 = (Activity) this.e;
                TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) this.f;
                i9 i9Var = (i9) this.c;
                c4 c4Var = (c4) this.d;
                ca E = ca.E(activity2, y3Var.l.z2);
                e4 e4Var = y3Var.l.J2;
                long j14 = (e4Var == null || (h9Var = e4Var.b) == null) ? 0L : h9Var.currentPosition;
                s6 n10 = s6.n(y3Var.l.L1.h(), y3Var.l.L1.a);
                f4 f4Var3 = y3Var.l;
                n10.e = f4Var3.y1;
                TL_stories.StoryItem storyItem3 = f4Var3.L1.a;
                if (storyItem3 != null && (messageMedia = storyItem3.media) != null && (document = messageMedia.document) != null) {
                    int i25 = 0;
                    while (true) {
                        if (i25 < document.attributes.size()) {
                            if (document.attributes.get(i25) instanceof TLRPC.TL_documentAttributeVideo) {
                                tL_documentAttributeVideo = (TLRPC.TL_documentAttributeVideo) document.attributes.get(i25);
                            } else {
                                i25++;
                            }
                        }
                    }
                    if (tL_documentAttributeVideo != null) {
                        j12 = (long) (tL_documentAttributeVideo.video_start_ts * 1000.0d);
                        n10.e0 = j12;
                        s6 g10 = n10.g();
                        g10.b0 = true;
                        f4Var = y3Var.l;
                        TL_stories.StoryItem storyItem4 = f4Var.L1.a;
                        g10.c0 = storyItem4.media.document;
                        g10.d0 = new lh.h(y3Var, storyItem4, storyItem2, 5);
                        if (f4Var.I0()) {
                            f4 f4Var4 = y3Var.l;
                            g10.J0 = f4Var4.y1;
                            g10.L0 = MessagesController.toInputMedia(f4Var4.L1.a.media);
                            l6 l6Var = i9Var.L0;
                            if (l6Var instanceof d6) {
                                g10.K0 = ((d6) l6Var).E;
                            }
                        }
                        E.S(x9.d(i9Var), g10, j14);
                        E.N = new r3(y3Var, i15);
                        E.O = new u3(y3Var, c4Var, i16);
                        return;
                    }
                }
                j12 = 0;
                n10.e0 = j12;
                s6 g102 = n10.g();
                g102.b0 = true;
                f4Var = y3Var.l;
                TL_stories.StoryItem storyItem42 = f4Var.L1.a;
                g102.c0 = storyItem42.media.document;
                g102.d0 = new lh.h(y3Var, storyItem42, storyItem2, 5);
                if (f4Var.I0()) {
                }
                E.S(x9.d(i9Var), g102, j14);
                E.N = new r3(y3Var, i15);
                E.O = new u3(y3Var, c4Var, i16);
                return;
            case 16:
                o4 o4Var = (o4) this.b;
                TLRPC.User user = (TLRPC.User) this.e;
                String str2 = (String) this.f;
                n6 n6Var = (n6) this.c;
                TL_stories.StoryView storyView = (TL_stories.StoryView) this.d;
                ArrayList<TLRPC.User> arrayList11 = new ArrayList<>();
                arrayList11.add(user);
                e5 e5Var = o4Var.b;
                ContactsController.getInstance(e5Var.v).deleteContact(arrayList11, false);
                yh.s(R.string.DeletedFromYourContacts, new Object[]{str2}, new qc(e5Var, e5Var.s), R.raw.ic_ban, 36);
                n6Var.a(e5Var.d(storyView) ? 1.0f : 0.5f, true);
                return;
            case 17:
                ((CameraController) this.b).lambda$open$10((CameraSession) this.e, (Runnable) this.f, (SurfaceTexture) this.c, (Runnable) this.d);
                return;
            case 18:
                u7 u7Var = (u7) this.b;
                nh.a aVar = (nh.a) this.e;
                TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio = (TLRPC.TL_documentAttributeAudio) this.f;
                String str3 = (String) this.c;
                String str4 = (String) this.d;
                u7Var.getClass();
                aVar.e.a = false;
                tL_documentAttributeAudio.title = str3;
                tL_documentAttributeAudio.performer = str4;
                m81 m81Var = u7Var.h;
                for (int i26 = 0; i26 < m81Var.getViewPages().length; i26++) {
                    tl0 tl0Var = (tl0) m81Var.getViewPages()[i26];
                    if (tl0Var != null && ((h7) tl0Var.getAdapter()).d == 3) {
                        h7 h7Var = (h7) tl0Var.getAdapter();
                        int i27 = 0;
                        while (true) {
                            if (i27 >= h7Var.e.size()) {
                                break;
                            } else if (((o7) h7Var.e.get(i27)).d == aVar) {
                                h7Var.m(i27);
                            } else {
                                i27++;
                            }
                        }
                    }
                }
                return;
            case 19:
                pa paVar = (pa) this.e;
                String str5 = (String) this.f;
                TLRPC.TL_error tL_error10 = (TLRPC.TL_error) this.b;
                TLObject tLObject9 = (TLObject) this.c;
                TL_account.checkUsername checkusername = (TL_account.checkUsername) this.d;
                paVar.e = 0;
                String str6 = paVar.f;
                if (str6 == null || !str6.equals(str5)) {
                    return;
                }
                if (tL_error10 == null && (tLObject9 instanceof TLRPC.TL_boolTrue)) {
                    org.telegram.ui.Cells.x1 x1Var = paVar.D;
                    if (x1Var != null) {
                        x1Var.setText(LocaleController.formatString("UsernameAvailable", R.string.UsernameAvailable, str5));
                        org.telegram.ui.Cells.x1 x1Var2 = paVar.D;
                        int i28 = k6.w6;
                        x1Var2.setTag(Integer.valueOf(i28));
                        paVar.D.setTextColor(k6.w0(null, i28, false));
                        oa oaVar = paVar.C;
                        if (oaVar != null) {
                            oa.a(oaVar);
                            return;
                        }
                        return;
                    }
                    return;
                }
                if (paVar.D != null) {
                    if (tL_error10 != null && "USERNAME_INVALID".equals(tL_error10.text) && checkusername.username.length() == 4) {
                        paVar.D.setText(LocaleController.getString(R.string.UsernameInvalidShort));
                        org.telegram.ui.Cells.x1 x1Var3 = paVar.D;
                        int i29 = k6.p7;
                        x1Var3.setTag(Integer.valueOf(i29));
                        paVar.D.setTextColor(k6.w0(null, i29, false));
                    } else if (tL_error10 == null || !"USERNAME_PURCHASE_AVAILABLE".equals(tL_error10.text)) {
                        paVar.D.setText(LocaleController.getString(R.string.UsernameInUse));
                        org.telegram.ui.Cells.x1 x1Var4 = paVar.D;
                        int i30 = k6.p7;
                        x1Var4.setTag(Integer.valueOf(i30));
                        paVar.D.setTextColor(k6.w0(null, i30, false));
                    } else {
                        if (checkusername.username.length() == 4) {
                            paVar.D.setText(LocaleController.getString(R.string.UsernameInvalidShortPurchase));
                        } else {
                            paVar.D.setText(LocaleController.getString(R.string.UsernameInUsePurchase));
                        }
                        org.telegram.ui.Cells.x1 x1Var5 = paVar.D;
                        int i31 = k6.F6;
                        x1Var5.setTag(Integer.valueOf(i31));
                        paVar.D.setTextColor(k6.w0(null, i31, false));
                    }
                    oa oaVar2 = paVar.C;
                    if (oaVar2 != null) {
                        oa.a(oaVar2);
                        return;
                    }
                    return;
                }
                return;
            case 20:
                mb mbVar = (mb) this.b;
                TLRPC.TL_chatInviteExported tL_chatInviteExported = (TLRPC.TL_chatInviteExported) this.e;
                TLRPC.TL_messages_exportedChatInvite tL_messages_exportedChatInvite = (TLRPC.TL_messages_exportedChatInvite) this.f;
                boolean[] zArr2 = (boolean[]) this.c;
                org.telegram.ui.ActionBar.d2 d2Var3 = (org.telegram.ui.ActionBar.d2) this.d;
                sb sbVar = mbVar.a.n;
                sbVar.B0 = false;
                sbVar.z0.put(tL_chatInviteExported.link, tL_messages_exportedChatInvite == null ? 0 : tL_messages_exportedChatInvite);
                if (zArr2[0]) {
                    return;
                }
                d2Var3.dismiss();
                if (tL_messages_exportedChatInvite != null) {
                    sb.A0(sbVar, tL_messages_exportedChatInvite, sbVar.A0);
                    return;
                } else {
                    l.d.v(R.string.LinkHashExpired, qc.a0(sbVar), R.raw.linkbroken, 36);
                    return;
                }
            case 21:
                bd bdVar = (bd) this.e;
                boolean[] zArr3 = (boolean[]) this.f;
                int[] iArr = (int[]) this.c;
                int[] iArr2 = (int[]) this.d;
                TLRPC.TL_error tL_error11 = (TLRPC.TL_error) this.b;
                if (zArr3[0] || (i13 = iArr[0]) >= iArr2[0]) {
                    return;
                }
                if (tL_error11 != null) {
                    zArr3[0] = true;
                    if ("BOOSTS_REQUIRED".equals(tL_error11.text)) {
                        bdVar.getMessagesController().getBoostsController().userCanBoostChannel(bdVar.a, bdVar.c, new ec(bdVar, i16));
                        return;
                    } else {
                        bdVar.M.setLoading(false);
                        yh.s(R.string.UnknownErrorCode, new Object[]{tL_error11.text}, qc.a0(bdVar), R.raw.error, 36);
                        return;
                    }
                }
                int i32 = i13 + 1;
                iArr[0] = i32;
                if (i32 == iArr2[0]) {
                    bdVar.finishFragment();
                    org.telegram.ui.ActionBar.p2 p2Var2 = bdVar.i0;
                    if (p2Var2 != null) {
                        if (p2Var2 instanceof po) {
                            ((po) p2Var2).o0();
                        }
                        l.d.v(bdVar.d ? R.string.GroupAppearanceUpdated : R.string.ChannelAppearanceUpdated, qc.a0(bdVar.i0), R.raw.contact_check, 36);
                        bdVar.i0 = null;
                    }
                    bdVar.M.setLoading(false);
                    return;
                }
                return;
            case 22:
                nd ndVar = (nd) this.e;
                String str7 = (String) this.f;
                TLRPC.TL_error tL_error12 = (TLRPC.TL_error) this.b;
                TLObject tLObject10 = (TLObject) this.c;
                TLRPC.TL_channels_checkUsername tL_channels_checkUsername = (TLRPC.TL_channels_checkUsername) this.d;
                ndVar.T = 0;
                String str8 = ndVar.U;
                if (str8 == null || !str8.equals(str7)) {
                    return;
                }
                if (tL_error12 == null && (tLObject10 instanceof TLRPC.TL_boolTrue)) {
                    ndVar.R.setText(LocaleController.formatString("LinkAvailable", R.string.LinkAvailable, str7));
                    org.telegram.ui.Cells.x1 x1Var6 = ndVar.R;
                    int i33 = k6.w6;
                    x1Var6.setTag(Integer.valueOf(i33));
                    ndVar.R.setTextColor(k6.w0(null, i33, false));
                    ndVar.W = true;
                    return;
                }
                if (tL_error12 != null && "USERNAME_INVALID".equals(tL_error12.text) && tL_channels_checkUsername.username.length() == 4) {
                    ndVar.R.setText(LocaleController.getString(R.string.UsernameInvalidShort));
                    ndVar.R.setTextColor(k6.w0(null, k6.p7, false));
                } else if (tL_error12 != null && "USERNAME_PURCHASE_AVAILABLE".equals(tL_error12.text)) {
                    if (tL_channels_checkUsername.username.length() == 4) {
                        ndVar.R.setText(LocaleController.getString(R.string.UsernameInvalidShortPurchase));
                    } else {
                        ndVar.R.setText(LocaleController.getString(R.string.UsernameInUsePurchase));
                    }
                    ndVar.R.setTextColor(k6.w0(null, k6.F6, false));
                } else if (tL_error12 == null || !"CHANNELS_ADMIN_PUBLIC_TOO_MUCH".equals(tL_error12.text)) {
                    ndVar.R.setTextColor(k6.w0(null, k6.p7, false));
                    ndVar.R.setText(LocaleController.getString(R.string.LinkInUse));
                } else {
                    ndVar.R.setTextColor(k6.w0(null, k6.p7, false));
                    ndVar.g0 = false;
                    ndVar.f0();
                }
                ndVar.W = false;
                return;
            case 23:
                a();
                return;
            case 24:
                b();
                return;
            case 25:
                c();
                return;
            case 26:
                kq.Y((kq) this.e, (TLRPC.TL_error) this.b, (TLRPC.InputCheckPasswordSRP) this.f, (TwoStepVerificationActivity) this.c, (TLRPC.TL_channels_editCreator) this.d);
                return;
            case 27:
                e();
                return;
            case 28:
                View view = (View) this.b;
                View view2 = (View) this.e;
                WindowManager windowManager = (WindowManager) this.f;
                View view3 = (View) this.c;
                View view4 = (View) this.d;
                view.setVisibility(8);
                view2.setVisibility(8);
                windowManager.removeView(view);
                windowManager.removeView(view2);
                windowManager.removeView(view3);
                windowManager.removeView(view4);
                return;
            default:
                yx0 yx0Var = (yx0) this.e;
                String str9 = (String) this.f;
                TLRPC.TL_error tL_error13 = (TLRPC.TL_error) this.b;
                TLObject tLObject11 = (TLObject) this.c;
                TextView textView = (TextView) this.d;
                yx0Var.m0 = 0;
                String str10 = yx0Var.l0;
                if (str10 == null || !str10.equals(str9)) {
                    return;
                }
                if (tL_error13 == null && (tLObject11 instanceof TLRPC.TL_boolTrue)) {
                    textView.setText(LocaleController.getString(R.string.ImportStickersLinkAvailable));
                    textView.setTextColor(yx0Var.getThemedColor(k6.w6));
                    yx0Var.n0 = true;
                    return;
                } else {
                    textView.setText(LocaleController.getString(R.string.ImportStickersLinkTaken));
                    textView.setTextColor(yx0Var.getThemedColor(k6.p7));
                    yx0Var.n0 = false;
                    return;
                }
        }
    }

    public /* synthetic */ j0(v2 v2Var, TLObject tLObject, TLRPC.UserFull userFull, TL_account.TL_birthday tL_birthday, TLRPC.TL_error tL_error) {
        this.a = 3;
        this.e = v2Var;
        this.c = tLObject;
        this.f = userFull;
        this.d = tL_birthday;
        this.b = tL_error;
    }

    public /* synthetic */ j0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i10) {
        this.a = i10;
        this.b = obj;
        this.e = obj2;
        this.f = obj3;
        this.c = obj4;
        this.d = obj5;
    }

    public /* synthetic */ j0(Object obj, Object obj2, TLRPC.TL_error tL_error, TLObject tLObject, Object obj3, int i10) {
        this.a = i10;
        this.e = obj;
        this.f = obj2;
        this.b = tL_error;
        this.c = tLObject;
        this.d = obj3;
    }

    public /* synthetic */ j0(Object obj, TLRPC.TL_error tL_error, Object obj2, Object obj3, TLObject tLObject, int i10) {
        this.a = i10;
        this.e = obj;
        this.b = tL_error;
        this.f = obj2;
        this.c = obj3;
        this.d = tLObject;
    }

    public /* synthetic */ j0(e6 e6Var, TLObject tLObject, TLRPC.TL_inputStorePaymentGiftPremium tL_inputStorePaymentGiftPremium, TLRPC.TL_error tL_error, TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore) {
        this.a = 4;
        this.e = e6Var;
        this.c = tLObject;
        this.f = tL_inputStorePaymentGiftPremium;
        this.b = tL_error;
        this.d = tL_payments_canPurchaseStore;
    }

    public /* synthetic */ j0(t7 t7Var, org.telegram.ui.ActionBar.d2 d2Var, TLObject tLObject, TL_stars.InputSavedStarGift inputSavedStarGift, Utilities.Callback callback) {
        this.a = 10;
        this.b = t7Var;
        this.f = d2Var;
        this.c = tLObject;
        this.d = inputSavedStarGift;
        this.e = callback;
    }

    public /* synthetic */ j0(TLObject tLObject, MessagesController messagesController, c1 c1Var, m mVar, TLRPC.TL_error tL_error) {
        this.a = 2;
        this.c = tLObject;
        this.d = messagesController;
        this.e = c1Var;
        this.f = mVar;
        this.b = tL_error;
    }

    public /* synthetic */ j0(TLRPC.TL_error tL_error, Utilities.Callback callback, TLObject tLObject, MessagesController messagesController, Utilities.Callback callback2, int i10) {
        this.a = i10;
        this.b = tL_error;
        this.e = callback;
        this.c = tLObject;
        this.d = messagesController;
        this.f = callback2;
    }
}
