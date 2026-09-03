package kh;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Pattern;
import lh.t7;
import nh.j7;
import org.json.JSONObject;
import org.json.JSONTokener;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.FileRefController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.f90;
import org.telegram.ui.Components.i80;
import org.telegram.ui.Components.jy0;
import org.telegram.ui.Components.or0;
import org.telegram.ui.Components.p70;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.z80;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.ai;
import org.telegram.ui.bh;
import org.telegram.ui.c30;
import org.telegram.ui.c90;
import org.telegram.ui.gu0;
import org.telegram.ui.h60;
import org.telegram.ui.jf;
import org.telegram.ui.lo0;
import org.telegram.ui.n9;
import org.telegram.ui.pg0;
import org.telegram.ui.q60;
import org.telegram.ui.q80;
import org.telegram.ui.qy;
import org.telegram.ui.sf1;
import org.telegram.ui.ta0;
import org.telegram.ui.tq;
import org.telegram.ui.w10;
import org.telegram.ui.y8;
import org.telegram.ui.yf0;
import org.telegram.ui.zn;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final /* synthetic */ class l2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object n;

    public /* synthetic */ l2(int i10, FrameLayout frameLayout, TLRPC.InputGroupCall inputGroupCall, org.telegram.ui.ActionBar.g3 g3Var, f6 f6Var, f90 f90Var, String[] strArr) {
        this.a = 4;
        this.c = inputGroupCall;
        this.b = i10;
        this.d = strArr;
        this.e = frameLayout;
        this.f = f90Var;
        this.n = g3Var;
        this.h = f6Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:139:0x038d, code lost:
    
        if (r8.chat.has_geo != false) goto L126;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        w10 w10Var;
        lo0 lo0Var;
        qc a02;
        int i10;
        int i11;
        int i12 = this.a;
        int i13 = this.b;
        int i14 = 0;
        int i15 = 1;
        Object obj = this.n;
        Object obj2 = this.h;
        Object obj3 = this.f;
        Object obj4 = this.e;
        Object obj5 = this.d;
        Object obj6 = this.c;
        switch (i12) {
            case 0:
                StringBuilder sb = new StringBuilder();
                ai.w(sb, MessagesController.getInstance(i13).linkPrefix, "/", (String) obj5, "/c/");
                sb.append(((TL_stars.TL_starGiftCollection) obj4).collection_id);
                String sb2 = sb.toString();
                new t2((or0) obj6, (Context) obj3, sb2, sb2, (f6) obj2, (org.telegram.ui.ActionBar.p2) obj).show();
                break;
            case 1:
                MediaController.lambda$broadcastNewPhotos$58(this.b, (ArrayList) obj6, (ArrayList) obj5, (Integer) obj4, (MediaController.AlbumEntry) obj3, (MediaController.AlbumEntry) obj2, (MediaController.AlbumEntry) obj);
                break;
            case 2:
                ((SendMessagesHelper) obj6).lambda$performSendDelayedMessage$53((TLObject) obj4, (TLRPC.InputFile) obj3, (TLRPC.InputMedia) obj2, (SendMessagesHelper.DelayedMessage) obj, this.b, (String) obj5);
                break;
            case 3:
                org.telegram.ui.n4 n4Var = (org.telegram.ui.n4) obj6;
                ze.c cVar = (ze.c) obj4;
                TLObject tLObject = (TLObject) obj3;
                String str = (String) obj5;
                org.telegram.ui.i0 i0Var = (org.telegram.ui.i0) obj2;
                TLRPC.TL_messages_getWebPage tL_messages_getWebPage = (TLRPC.TL_messages_getWebPage) obj;
                if (n4Var.C0 != 0 && i13 == n4Var.E0) {
                    if (cVar != null) {
                        cVar.b();
                    }
                    n4Var.C0 = 0;
                    n4Var.b0(false);
                    if (n4Var.S) {
                        if (tLObject instanceof TLRPC.TL_messages_webPage) {
                            TLRPC.TL_messages_webPage tL_messages_webPage = (TLRPC.TL_messages_webPage) tLObject;
                            MessagesController.getInstance(n4Var.U).putUsers(tL_messages_webPage.users, false);
                            MessagesController.getInstance(n4Var.U).putChats(tL_messages_webPage.chats, false);
                            TLRPC.WebPage webPage = tL_messages_webPage.webpage;
                            if (webPage == null || !(webPage.cached_page instanceof TL_iv.TL_page)) {
                                if (!((Boolean) i0Var.run()).booleanValue()) {
                                    if (MessagesController.getInstance(n4Var.U).isWebBrowserOpenInApp(tL_messages_getWebPage.url)) {
                                        n4Var.g(1, tL_messages_getWebPage.url);
                                        break;
                                    } else {
                                        ze.d.s(n4Var.I, tL_messages_getWebPage.url);
                                        break;
                                    }
                                }
                            } else {
                                n4Var.h(webPage, str, 1);
                                break;
                            }
                        } else {
                            if (tLObject instanceof TLRPC.TL_webPage) {
                                TLRPC.TL_webPage tL_webPage = (TLRPC.TL_webPage) tLObject;
                                if (tL_webPage.cached_page instanceof TL_iv.TL_page) {
                                    n4Var.h(tL_webPage, str, 1);
                                    break;
                                }
                            }
                            if (!((Boolean) i0Var.run()).booleanValue()) {
                                if (MessagesController.getInstance(n4Var.U).isWebBrowserOpenInApp(tL_messages_getWebPage.url)) {
                                    n4Var.g(1, tL_messages_getWebPage.url);
                                    break;
                                } else {
                                    ze.d.s(n4Var.I, tL_messages_getWebPage.url);
                                    break;
                                }
                            }
                        }
                    }
                }
                break;
            case 4:
                TLRPC.InputGroupCall inputGroupCall = (TLRPC.InputGroupCall) obj6;
                TL_phone.toggleGroupCallSettings togglegroupcallsettings = new TL_phone.toggleGroupCallSettings();
                togglegroupcallsettings.call = inputGroupCall;
                togglegroupcallsettings.reset_invite_hash = true;
                int i16 = this.b;
                ConnectionsManager.getInstance(i16).sendRequest(togglegroupcallsettings, new y8(i16, (FrameLayout) obj4, inputGroupCall, (org.telegram.ui.ActionBar.g3) obj, (f6) obj2, (f90) obj3, (String[]) obj5));
                break;
            case 5:
                TLObject tLObject2 = (TLObject) obj6;
                org.telegram.ui.ActionBar.d2 d2Var = (org.telegram.ui.ActionBar.d2) obj5;
                Context context = (Context) obj3;
                TL_phone.exportGroupCallInvite exportgroupcallinvite = (TL_phone.exportGroupCallInvite) obj4;
                f6 f6Var = (f6) obj2;
                q60 q60Var = (q60) obj;
                if (tLObject2 instanceof TL_phone.exportedGroupCallInvite) {
                    d2Var.dismiss();
                    n9.o0(context, this.b, exportgroupcallinvite.call, ((TL_phone.exportedGroupCallInvite) tLObject2).link, f6Var, true, true);
                } else {
                    d2Var.dismiss();
                }
                AndroidUtilities.runOnUIThread(q60Var);
                break;
            case 6:
                TLObject tLObject3 = (TLObject) obj5;
                ArrayList arrayList = (ArrayList) obj4;
                AtomicInteger atomicInteger = (AtomicInteger) obj3;
                ArrayList arrayList2 = (ArrayList) obj2;
                tq tqVar = (tq) obj;
                if (((TLRPC.TL_error) obj6) == null && (tLObject3 instanceof TLRPC.TL_channels_channelParticipants)) {
                    arrayList.set(i13, (TLRPC.TL_channels_channelParticipants) tLObject3);
                }
                atomicInteger.getAndIncrement();
                if (atomicInteger.get() == arrayList2.size()) {
                    tqVar.run();
                    break;
                }
                break;
            case 7:
                TLObject tLObject4 = (TLObject) obj5;
                TLRPC.Document document = (TLRPC.Document) obj4;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj3;
                TLRPC.TL_stickers_addStickerToSet tL_stickers_addStickerToSet = (TLRPC.TL_stickers_addStickerToSet) obj;
                ((org.telegram.ui.ActionBar.d2) obj6).dismiss();
                if (tLObject4 instanceof TLRPC.TL_messages_stickerSet) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject4;
                    MediaDataController.getInstance(i13).putStickerSet(tL_messages_stickerSet);
                    if (!MediaDataController.getInstance(i13).isStickerPackInstalled(tL_messages_stickerSet.set.id)) {
                        MediaDataController.getInstance(i13).toggleStickerSet(null, tLObject4, 2, null, false, false);
                    }
                    AndroidUtilities.runOnUIThread(new z80(22, tLObject4, document), 250L);
                    break;
                } else if (tL_error != null) {
                    if (FileRefController.isFileRefError(tL_error.text)) {
                        FileRefController.getInstance(i13).requestReference(obj2, tL_stickers_addStickerToSet);
                        break;
                    } else {
                        qc.b0(tL_error);
                        break;
                    }
                }
                break;
            case 8:
                h60.a((org.telegram.ui.ActionBar.d2) obj6, (ze.c) obj5, (TLObject) obj4, this.b, (Context) obj3, (TLRPC.TL_inputGroupCallSlug) obj2, (TLRPC.TL_error) obj);
                break;
            case 9:
                LaunchActivity launchActivity = (LaunchActivity) obj6;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj4;
                TLObject tLObject5 = (TLObject) obj3;
                org.telegram.ui.ActionBar.d2 d2Var2 = (org.telegram.ui.ActionBar.d2) obj2;
                w10 w10Var2 = (w10) obj;
                String str2 = (String) obj5;
                ArrayList arrayList3 = launchActivity.a0;
                if (!launchActivity.isFinishing()) {
                    if (tL_error2 != null || launchActivity.n0 == null) {
                        w10Var = w10Var2;
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(launchActivity);
                        String string = LocaleController.getString(R.string.AppName);
                        org.telegram.ui.ActionBar.d2 d2Var3 = alertDialog$Builder.a;
                        d2Var3.O = string;
                        if (tL_error2.text.startsWith("FLOOD_WAIT")) {
                            d2Var3.Q = LocaleController.getString(R.string.FloodWait);
                        } else if (tL_error2.text.startsWith("INVITE_HASH_EXPIRED")) {
                            d2Var3.O = LocaleController.getString(R.string.ExpiredLink);
                            d2Var3.Q = LocaleController.getString(R.string.InviteExpired);
                        } else {
                            d2Var3.Q = LocaleController.getString(R.string.JoinToGroupErrorNotExist);
                        }
                        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                        launchActivity.B0(alertDialog$Builder);
                    } else {
                        TLRPC.ChatInvite chatInvite = (TLRPC.ChatInvite) tLObject5;
                        TLRPC.Chat chat = chatInvite.chat;
                        if (chat != null) {
                            if (ChatObject.isLeftFromChat(chat)) {
                                TLRPC.Chat chat2 = chatInvite.chat;
                                if (!chat2.kicked) {
                                    if (!ChatObject.isPublic(chat2)) {
                                        if (!(chatInvite instanceof TLRPC.TL_chatInvitePeek)) {
                                            break;
                                        }
                                    }
                                }
                            }
                            MessagesController.getInstance(i13).putChat(chatInvite.chat, false);
                            ArrayList arrayList4 = new ArrayList();
                            arrayList4.add(chatInvite.chat);
                            MessagesStorage.getInstance(i13).putUsersAndChats(null, arrayList4, false, true);
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", chatInvite.chat.id);
                            if (arrayList3.isEmpty() || MessagesController.getInstance(i13).checkCanOpenChat(bundle, (org.telegram.ui.ActionBar.p2) kf.k0.i(1, arrayList3))) {
                                boolean[] zArr = new boolean[1];
                                d2Var2.setOnCancelListener(new bh(i15, zArr));
                                if (!chatInvite.chat.forum) {
                                    MessagesController.getInstance(i13).ensureMessagesLoaded(-chatInvite.chat.id, 0, new ta0(launchActivity, w10Var2, zArr, bundle, chatInvite));
                                    break;
                                } else {
                                    Bundle bundle2 = new Bundle();
                                    bundle2.putLong("chat_id", chatInvite.chat.id);
                                    launchActivity.p0(sf1.F0(launchActivity, bundle2));
                                }
                            }
                            w10Var = w10Var2;
                        }
                        w10Var = w10Var2;
                        TL_stars.TL_starsSubscriptionPricing tL_starsSubscriptionPricing = chatInvite.subscription_pricing;
                        if (tL_starsSubscriptionPricing == null || chatInvite.can_refulfill_subscription) {
                            org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) kf.k0.i(1, arrayList3);
                            p2Var.showDialog(new i80(launchActivity, chatInvite, str2, p2Var, p2Var instanceof zn ? ((zn) p2Var).ba : null));
                        } else {
                            long j10 = tL_starsSubscriptionPricing.amount;
                            MessagesController.getInstance(i13).putChat(chatInvite.chat, false);
                            t7.y(launchActivity.L, false).j0(str2, chatInvite, new l(launchActivity, j10, 2));
                        }
                    }
                    try {
                        w10Var.run();
                        break;
                    } catch (Exception e) {
                        FileLog.e(e);
                        return;
                    }
                }
                break;
            case 10:
                LaunchActivity launchActivity2 = (LaunchActivity) obj6;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj4;
                TLObject tLObject6 = (TLObject) obj3;
                TLRPC.TL_inputInvoiceSlug tL_inputInvoiceSlug = (TLRPC.TL_inputInvoiceSlug) obj2;
                w10 w10Var3 = (w10) obj;
                String str3 = (String) obj5;
                ArrayList arrayList5 = launchActivity2.a0;
                if (tL_error3 != null) {
                    if ("SUBSCRIPTION_ALREADY_ACTIVE".equalsIgnoreCase(tL_error3.text)) {
                        a02 = qc.a0((org.telegram.ui.ActionBar.p2) kf.k0.i(1, arrayList5));
                        i10 = R.string.PaymentInvoiceSubscriptionLinkAlreadyPaid;
                    } else {
                        a02 = qc.a0((org.telegram.ui.ActionBar.p2) kf.k0.i(1, arrayList5));
                        i10 = R.string.PaymentInvoiceLinkInvalid;
                    }
                    org.telegram.messenger.y3.s(i10, a02, null);
                } else if (!launchActivity2.isFinishing()) {
                    if (tLObject6 instanceof TLRPC.TL_payments_paymentFormStars) {
                        t5 t5Var = launchActivity2.V0;
                        launchActivity2.V0 = null;
                        t7.y(launchActivity2.L, false).Y(null, tL_inputInvoiceSlug, (TLRPC.TL_payments_paymentFormStars) tLObject6, new q80(w10Var3, 1), new c90(t5Var, i14));
                        break;
                    } else {
                        if (tLObject6 instanceof TLRPC.PaymentForm) {
                            TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject6;
                            MessagesController.getInstance(i13).putUsers(paymentForm.users, false);
                            lo0Var = new lo0(paymentForm, null, str3, launchActivity2.O().getLastFragment());
                        } else {
                            lo0Var = tLObject6 instanceof TLRPC.PaymentReceipt ? new lo0((TLRPC.PaymentReceipt) tLObject6) : null;
                        }
                        if (lo0Var != null) {
                            t5 t5Var2 = launchActivity2.V0;
                            if (t5Var2 != null) {
                                launchActivity2.V0 = null;
                                lo0Var.W0 = new jf(9, t5Var2);
                            }
                            launchActivity2.p0(lo0Var);
                        }
                    }
                }
                try {
                    w10Var3.run();
                    break;
                } catch (Exception e6) {
                    FileLog.e(e6);
                    return;
                }
            case 11:
                LaunchActivity launchActivity3 = (LaunchActivity) obj6;
                qy qyVar = (qy) obj3;
                org.telegram.ui.ActionBar.p2 p2Var2 = (org.telegram.ui.ActionBar.p2) obj;
                TLRPC.User user = (TLRPC.User) obj2;
                String str4 = (String) obj5;
                Pattern pattern = LaunchActivity.y1;
                if (((TLObject) obj4) instanceof TLRPC.TL_boolTrue) {
                    MediaDataController.getInstance(i13).loadAttachMenuBots(false, true, new jy0(launchActivity3, qyVar, p2Var2, user, str4, 7));
                    break;
                }
                break;
            case 12:
                yf0 yf0Var = (yf0) obj6;
                String str5 = (String) obj5;
                p2.h hVar = (p2.h) obj4;
                List list = (List) obj3;
                String str6 = (String) obj2;
                String str7 = (String) obj;
                pg0 pg0Var = yf0Var.v;
                StringBuilder t6 = android.support.v4.media.a.t("LoginBilling queried \"", str5, "\" product: ");
                t6.append(BillingController.getResponseCodeString(hVar.a));
                FileLog.d(t6.toString());
                if (hVar.a != 0) {
                    yf0Var.e = "BILLING_" + BillingController.getResponseCodeString(hVar.a);
                    new qc(pg0Var.W, null).H(R.raw.error, LocaleController.formatString(R.string.UnknownErrorCode, BillingController.getResponseCodeString(hVar.a)));
                    break;
                } else if (list != null && !list.isEmpty()) {
                    p2.n nVar = (p2.n) list.get(0);
                    p2.j a2 = nVar.a();
                    TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode = new TLRPC.TL_inputStorePaymentAuthCode();
                    tL_inputStorePaymentAuthCode.currency = a2.c;
                    tL_inputStorePaymentAuthCode.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_inputStorePaymentAuthCode.currency)) * (a2.b / Math.pow(10.0d, 6.0d)));
                    tL_inputStorePaymentAuthCode.phone_code_hash = TextUtils.isEmpty(str6) ? "" : str6;
                    tL_inputStorePaymentAuthCode.phone_number = str7;
                    int i17 = this.b;
                    tL_inputStorePaymentAuthCode.premium_days = i17;
                    StringBuilder t9 = android.support.v4.media.a.t("LoginBilling found \"", str5, "\" product, with currency=");
                    t9.append(tL_inputStorePaymentAuthCode.currency);
                    t9.append(" amount=");
                    t9.append(tL_inputStorePaymentAuthCode.amount);
                    t9.append("; phone=");
                    t9.append(str7);
                    t9.append(", phone_code_hash=");
                    t9.append(str6);
                    FileLog.d(t9.toString());
                    TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore = new TLRPC.TL_payments_canPurchaseStore();
                    tL_payments_canPurchaseStore.purpose = tL_inputStorePaymentAuthCode;
                    i11 = ((org.telegram.ui.ActionBar.p2) pg0Var).currentAccount;
                    ConnectionsManager.getInstance(i11).sendRequest(tL_payments_canPurchaseStore, new y8(yf0Var, a2, i17, nVar, tL_inputStorePaymentAuthCode, str5, tL_payments_canPurchaseStore, 3), 10);
                    break;
                } else {
                    yf0Var.e = "PRODUCT_NOT_FOUND";
                    new qc(pg0Var.W, null).H(R.raw.error, LocaleController.formatString(R.string.UnknownErrorCode, "PRODUCT_NOT_FOUND"));
                    break;
                }
                break;
            case 13:
                ProfileActivity profileActivity = (ProfileActivity) obj6;
                View view = (View) obj4;
                String str8 = (String) obj5;
                boolean[] zArr2 = (boolean[]) obj3;
                String[] strArr = (String[]) obj2;
                String str9 = (String) obj;
                if (profileActivity.getParentActivity() != null) {
                    p70 H = p70.H(profileActivity, view);
                    H.W(profileActivity.a.U0(view, false));
                    H.w = false;
                    H.c(R.drawable.msg_copy, LocaleController.getString(R.string.Copy), new gu0(profileActivity, str8, i13, 3), false);
                    H.l(R.drawable.msg_translate, LocaleController.getString(R.string.TranslateMessage), new c30(profileActivity, strArr, str9, str8, 29), zArr2[0]);
                    H.Z();
                    break;
                }
                break;
            case 14:
                org.telegram.ui.web.c1 c1Var = (org.telegram.ui.web.c1) obj6;
                String str10 = (String) obj5;
                TLObject tLObject7 = (TLObject) obj4;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) obj3;
                org.telegram.ui.web.y0 y0Var = (org.telegram.ui.web.y0) obj2;
                j7 j7Var = (j7) obj;
                c1Var.getClass();
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("req_id", str10);
                    if (tLObject7 instanceof TLRPC.TL_dataJSON) {
                        jSONObject.put("result", new JSONTokener(((TLRPC.TL_dataJSON) tLObject7).data).nextValue());
                    } else if (tL_error4 != null) {
                        jSONObject.put("error", tL_error4.text);
                    }
                    org.telegram.ui.web.c1.x(i13, y0Var, j7Var, "custom_method_invoked", jSONObject);
                    break;
                } catch (Exception e10) {
                    FileLog.e(e10);
                    c1Var.Z(null);
                    return;
                }
            default:
                ArrayList arrayList6 = (ArrayList) obj5;
                a0.h hVar2 = (a0.h) obj4;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) obj3;
                TLObject tLObject8 = (TLObject) obj2;
                MessagesController messagesController = (MessagesController) obj;
                tf.u0 u0Var = ((tf.p0) obj6).h;
                if (u0Var.g0 != 0 && i13 == u0Var.f0 && u0Var.y != null && u0Var.x != null) {
                    u0Var.Y(hVar2, arrayList6, false);
                    if (tL_error5 == null) {
                        TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject8;
                        messagesController.putUsers(tL_channels_channelParticipants.users, false);
                        messagesController.putChats(tL_channels_channelParticipants.chats, false);
                        u0Var.x.isEmpty();
                        if (!tL_channels_channelParticipants.participants.isEmpty()) {
                            long clientUserId = UserConfig.getInstance(u0Var.f).getClientUserId();
                            for (int i18 = 0; i18 < tL_channels_channelParticipants.participants.size(); i18++) {
                                long peerId = MessageObject.getPeerId(tL_channels_channelParticipants.participants.get(i18).peer);
                                if (u0Var.y.h(peerId) < 0 && ((peerId != 0 || u0Var.y.h(clientUserId) < 0) && (u0Var.h0 || (peerId != clientUserId && peerId != 0)))) {
                                    if (peerId >= 0) {
                                        TLRPC.User user2 = messagesController.getUser(Long.valueOf(peerId));
                                        if (user2 == null) {
                                            break;
                                        } else {
                                            u0Var.x.add(user2);
                                        }
                                    } else {
                                        TLRPC.Chat chat3 = messagesController.getChat(Long.valueOf(-peerId));
                                        if (chat3 == null) {
                                            break;
                                        } else {
                                            u0Var.x.add(chat3);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    u0Var.l();
                    u0Var.S.a(!u0Var.x.isEmpty());
                }
                u0Var.g0 = 0;
                break;
        }
    }

    public /* synthetic */ l2(int i10, ArrayList arrayList, ArrayList arrayList2, Integer num, MediaController.AlbumEntry albumEntry, MediaController.AlbumEntry albumEntry2, MediaController.AlbumEntry albumEntry3) {
        this.a = 1;
        this.b = i10;
        this.c = arrayList;
        this.d = arrayList2;
        this.e = num;
        this.f = albumEntry;
        this.h = albumEntry2;
        this.n = albumEntry3;
    }

    public /* synthetic */ l2(Object obj, int i10, Serializable serializable, Object obj2, Object obj3, Object obj4, Object obj5, int i11) {
        this.a = i11;
        this.c = obj;
        this.b = i10;
        this.d = serializable;
        this.e = obj2;
        this.f = obj3;
        this.h = obj4;
        this.n = obj5;
    }

    public /* synthetic */ l2(Object obj, Object obj2, Object obj3, int i10, Object obj4, Object obj5, Object obj6, int i11) {
        this.a = i11;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = i10;
        this.f = obj4;
        this.h = obj5;
        this.n = obj6;
    }

    public /* synthetic */ l2(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, TLObject tLObject, TLObject tLObject2, TLObject tLObject3, Object obj, int i10, String str, int i11) {
        this.a = i11;
        this.c = notificationCenterDelegate;
        this.e = tLObject;
        this.f = tLObject2;
        this.h = tLObject3;
        this.n = obj;
        this.b = i10;
        this.d = str;
    }

    public /* synthetic */ l2(TLObject tLObject, org.telegram.ui.ActionBar.d2 d2Var, Context context, int i10, TL_phone.exportGroupCallInvite exportgroupcallinvite, f6 f6Var, q60 q60Var) {
        this.a = 5;
        this.c = tLObject;
        this.d = d2Var;
        this.f = context;
        this.b = i10;
        this.e = exportgroupcallinvite;
        this.h = f6Var;
        this.n = q60Var;
    }

    public /* synthetic */ l2(org.telegram.ui.ActionBar.d2 d2Var, TLObject tLObject, int i10, TLRPC.Document document, TLRPC.TL_error tL_error, Object obj, TLRPC.TL_stickers_addStickerToSet tL_stickers_addStickerToSet) {
        this.a = 7;
        this.c = d2Var;
        this.d = tLObject;
        this.b = i10;
        this.e = document;
        this.f = tL_error;
        this.h = obj;
        this.n = tL_stickers_addStickerToSet;
    }

    public /* synthetic */ l2(org.telegram.ui.n4 n4Var, int i10, ze.c cVar, TLObject tLObject, String str, org.telegram.ui.i0 i0Var, TLRPC.TL_messages_getWebPage tL_messages_getWebPage) {
        this.a = 3;
        this.c = n4Var;
        this.b = i10;
        this.e = cVar;
        this.f = tLObject;
        this.d = str;
        this.h = i0Var;
        this.n = tL_messages_getWebPage;
    }

    public /* synthetic */ l2(LaunchActivity launchActivity, TLObject tLObject, int i10, qy qyVar, org.telegram.ui.ActionBar.p2 p2Var, TLRPC.User user, String str) {
        this.a = 11;
        this.c = launchActivity;
        this.e = tLObject;
        this.b = i10;
        this.f = qyVar;
        this.n = p2Var;
        this.h = user;
        this.d = str;
    }

    public /* synthetic */ l2(LaunchActivity launchActivity, TLRPC.TL_error tL_error, TLObject tLObject, int i10, org.telegram.ui.ActionBar.d2 d2Var, w10 w10Var, String str) {
        this.a = 9;
        this.c = launchActivity;
        this.e = tL_error;
        this.f = tLObject;
        this.b = i10;
        this.h = d2Var;
        this.n = w10Var;
        this.d = str;
    }

    public /* synthetic */ l2(yf0 yf0Var, String str, p2.h hVar, List list, String str2, String str3, int i10) {
        this.a = 12;
        this.c = yf0Var;
        this.d = str;
        this.e = hVar;
        this.f = list;
        this.h = str2;
        this.n = str3;
        this.b = i10;
    }

    public /* synthetic */ l2(ProfileActivity profileActivity, View view, String str, int i10, boolean[] zArr, String[] strArr, String str2) {
        this.a = 13;
        this.c = profileActivity;
        this.e = view;
        this.d = str;
        this.b = i10;
        this.f = zArr;
        this.h = strArr;
        this.n = str2;
    }

    public /* synthetic */ l2(org.telegram.ui.web.c1 c1Var, String str, TLObject tLObject, TLRPC.TL_error tL_error, int i10, org.telegram.ui.web.y0 y0Var, j7 j7Var) {
        this.a = 14;
        this.c = c1Var;
        this.d = str;
        this.e = tLObject;
        this.f = tL_error;
        this.b = i10;
        this.h = y0Var;
        this.n = j7Var;
    }
}
