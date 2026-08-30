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
import org.telegram.ui.Components.e90;
import org.telegram.ui.Components.h80;
import org.telegram.ui.Components.i80;
import org.telegram.ui.Components.jy0;
import org.telegram.ui.Components.o70;
import org.telegram.ui.Components.or0;
import org.telegram.ui.Components.qc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.a30;
import org.telegram.ui.a90;
import org.telegram.ui.f60;
import org.telegram.ui.g00;
import org.telegram.ui.gf;
import org.telegram.ui.jo0;
import org.telegram.ui.kf1;
import org.telegram.ui.l9;
import org.telegram.ui.ng0;
import org.telegram.ui.o60;
import org.telegram.ui.o80;
import org.telegram.ui.oy;
import org.telegram.ui.ra0;
import org.telegram.ui.rq;
import org.telegram.ui.w8;
import org.telegram.ui.wf0;
import org.telegram.ui.xn;
import org.telegram.ui.yh;
import org.telegram.ui.zg;
import org.telegram.ui.zt0;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final /* synthetic */ class m2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object n;

    public /* synthetic */ m2(int i10, FrameLayout frameLayout, TLRPC.InputGroupCall inputGroupCall, org.telegram.ui.ActionBar.g3 g3Var, org.telegram.ui.ActionBar.f6 f6Var, e90 e90Var, String[] strArr) {
        this.a = 4;
        this.c = inputGroupCall;
        this.b = i10;
        this.d = strArr;
        this.e = frameLayout;
        this.f = e90Var;
        this.n = g3Var;
        this.h = f6Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:125:0x033f, code lost:
    
        if (r8.chat.has_geo != false) goto L114;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        g00 g00Var;
        jo0 jo0Var;
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
                yh.x(sb, MessagesController.getInstance(i13).linkPrefix, "/", (String) obj5, "/c/");
                sb.append(((TL_stars.TL_starGiftCollection) obj4).collection_id);
                String sb2 = sb.toString();
                new u2((or0) obj6, (Context) obj3, sb2, sb2, (org.telegram.ui.ActionBar.f6) obj2, (org.telegram.ui.ActionBar.p2) obj).show();
                break;
            case 1:
                MediaController.lambda$broadcastNewPhotos$58(this.b, (ArrayList) obj6, (ArrayList) obj5, (Integer) obj4, (MediaController.AlbumEntry) obj3, (MediaController.AlbumEntry) obj2, (MediaController.AlbumEntry) obj);
                break;
            case 2:
                ((SendMessagesHelper) obj6).lambda$performSendDelayedMessage$53((TLObject) obj4, (TLRPC.InputFile) obj3, (TLRPC.InputMedia) obj2, (SendMessagesHelper.DelayedMessage) obj, this.b, (String) obj5);
                break;
            case 3:
                org.telegram.ui.l4 l4Var = (org.telegram.ui.l4) obj6;
                af.f fVar = (af.f) obj4;
                TLObject tLObject = (TLObject) obj3;
                String str = (String) obj5;
                org.telegram.ui.h0 h0Var = (org.telegram.ui.h0) obj2;
                TLRPC.TL_messages_getWebPage tL_messages_getWebPage = (TLRPC.TL_messages_getWebPage) obj;
                if (l4Var.C0 != 0 && i13 == l4Var.E0) {
                    if (fVar != null) {
                        fVar.b();
                    }
                    l4Var.C0 = 0;
                    l4Var.b0(false);
                    if (l4Var.S) {
                        if (tLObject instanceof TLRPC.TL_messages_webPage) {
                            TLRPC.TL_messages_webPage tL_messages_webPage = (TLRPC.TL_messages_webPage) tLObject;
                            MessagesController.getInstance(l4Var.U).putUsers(tL_messages_webPage.users, false);
                            MessagesController.getInstance(l4Var.U).putChats(tL_messages_webPage.chats, false);
                            TLRPC.WebPage webPage = tL_messages_webPage.webpage;
                            if (webPage == null || !(webPage.cached_page instanceof TL_iv.TL_page)) {
                                if (!((Boolean) h0Var.run()).booleanValue()) {
                                    if (MessagesController.getInstance(l4Var.U).isWebBrowserOpenInApp(tL_messages_getWebPage.url)) {
                                        l4Var.g(1, tL_messages_getWebPage.url);
                                        break;
                                    } else {
                                        af.g.s(l4Var.I, tL_messages_getWebPage.url);
                                        break;
                                    }
                                }
                            } else {
                                l4Var.h(webPage, str, 1);
                                break;
                            }
                        } else {
                            if (tLObject instanceof TLRPC.TL_webPage) {
                                TLRPC.TL_webPage tL_webPage = (TLRPC.TL_webPage) tLObject;
                                if (tL_webPage.cached_page instanceof TL_iv.TL_page) {
                                    l4Var.h(tL_webPage, str, 1);
                                    break;
                                }
                            }
                            if (!((Boolean) h0Var.run()).booleanValue()) {
                                if (MessagesController.getInstance(l4Var.U).isWebBrowserOpenInApp(tL_messages_getWebPage.url)) {
                                    l4Var.g(1, tL_messages_getWebPage.url);
                                    break;
                                } else {
                                    af.g.s(l4Var.I, tL_messages_getWebPage.url);
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
                ConnectionsManager.getInstance(i16).sendRequest(togglegroupcallsettings, new w8(i16, (FrameLayout) obj4, inputGroupCall, (org.telegram.ui.ActionBar.g3) obj, (org.telegram.ui.ActionBar.f6) obj2, (e90) obj3, (String[]) obj5));
                break;
            case 5:
                TLObject tLObject2 = (TLObject) obj6;
                org.telegram.ui.ActionBar.d2 d2Var = (org.telegram.ui.ActionBar.d2) obj5;
                Context context = (Context) obj3;
                TL_phone.exportGroupCallInvite exportgroupcallinvite = (TL_phone.exportGroupCallInvite) obj4;
                org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) obj2;
                o60 o60Var = (o60) obj;
                if (tLObject2 instanceof TL_phone.exportedGroupCallInvite) {
                    d2Var.dismiss();
                    l9.o0(context, this.b, exportgroupcallinvite.call, ((TL_phone.exportedGroupCallInvite) tLObject2).link, f6Var, true, true);
                } else {
                    d2Var.dismiss();
                }
                AndroidUtilities.runOnUIThread(o60Var);
                break;
            case 6:
                TLObject tLObject3 = (TLObject) obj5;
                ArrayList arrayList = (ArrayList) obj4;
                AtomicInteger atomicInteger = (AtomicInteger) obj3;
                ArrayList arrayList2 = (ArrayList) obj2;
                rq rqVar = (rq) obj;
                if (((TLRPC.TL_error) obj6) == null && (tLObject3 instanceof TLRPC.TL_channels_channelParticipants)) {
                    arrayList.set(i13, (TLRPC.TL_channels_channelParticipants) tLObject3);
                }
                atomicInteger.getAndIncrement();
                if (atomicInteger.get() == arrayList2.size()) {
                    rqVar.run();
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
                    AndroidUtilities.runOnUIThread(new i80(23, tLObject4, document), 250L);
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
                f60.a((org.telegram.ui.ActionBar.d2) obj6, (af.f) obj5, (TLObject) obj4, this.b, (Context) obj3, (TLRPC.TL_inputGroupCallSlug) obj2, (TLRPC.TL_error) obj);
                break;
            case 9:
                LaunchActivity launchActivity = (LaunchActivity) obj6;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj4;
                TLObject tLObject5 = (TLObject) obj3;
                org.telegram.ui.ActionBar.d2 d2Var2 = (org.telegram.ui.ActionBar.d2) obj2;
                g00 g00Var2 = (g00) obj;
                String str2 = (String) obj5;
                ArrayList arrayList3 = launchActivity.a0;
                if (!launchActivity.isFinishing()) {
                    if (tL_error2 != null || launchActivity.n0 == null) {
                        g00Var = g00Var2;
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
                            if (arrayList3.isEmpty() || MessagesController.getInstance(i13).checkCanOpenChat(bundle, (org.telegram.ui.ActionBar.p2) a2.i(1, arrayList3))) {
                                boolean[] zArr = new boolean[1];
                                d2Var2.setOnCancelListener(new zg(i15, zArr));
                                if (!chatInvite.chat.forum) {
                                    MessagesController.getInstance(i13).ensureMessagesLoaded(-chatInvite.chat.id, 0, new ra0(launchActivity, g00Var2, zArr, bundle, chatInvite));
                                    break;
                                } else {
                                    Bundle bundle2 = new Bundle();
                                    bundle2.putLong("chat_id", chatInvite.chat.id);
                                    launchActivity.p0(kf1.F0(launchActivity, bundle2));
                                }
                            }
                            g00Var = g00Var2;
                        }
                        g00Var = g00Var2;
                        TL_stars.TL_starsSubscriptionPricing tL_starsSubscriptionPricing = chatInvite.subscription_pricing;
                        if (tL_starsSubscriptionPricing == null || chatInvite.can_refulfill_subscription) {
                            org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) a2.i(1, arrayList3);
                            p2Var.showDialog(new h80(launchActivity, chatInvite, str2, p2Var, p2Var instanceof xn ? ((xn) p2Var).ba : null));
                        } else {
                            long j10 = tL_starsSubscriptionPricing.amount;
                            MessagesController.getInstance(i13).putChat(chatInvite.chat, false);
                            t7.y(launchActivity.L, false).j0(str2, chatInvite, new l(launchActivity, j10, 2));
                        }
                    }
                    try {
                        g00Var.run();
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
                g00 g00Var3 = (g00) obj;
                String str3 = (String) obj5;
                ArrayList arrayList5 = launchActivity2.a0;
                if (tL_error3 != null) {
                    if ("SUBSCRIPTION_ALREADY_ACTIVE".equalsIgnoreCase(tL_error3.text)) {
                        a02 = qc.a0((org.telegram.ui.ActionBar.p2) a2.i(1, arrayList5));
                        i10 = R.string.PaymentInvoiceSubscriptionLinkAlreadyPaid;
                    } else {
                        a02 = qc.a0((org.telegram.ui.ActionBar.p2) a2.i(1, arrayList5));
                        i10 = R.string.PaymentInvoiceLinkInvalid;
                    }
                    org.telegram.messenger.y3.s(i10, a02, null);
                } else if (!launchActivity2.isFinishing()) {
                    if (tLObject6 instanceof TLRPC.TL_payments_paymentFormStars) {
                        u5 u5Var = launchActivity2.V0;
                        launchActivity2.V0 = null;
                        t7.y(launchActivity2.L, false).Y(null, tL_inputInvoiceSlug, (TLRPC.TL_payments_paymentFormStars) tLObject6, new o80(g00Var3, 1), new a90(u5Var, i14));
                        break;
                    } else {
                        if (tLObject6 instanceof TLRPC.PaymentForm) {
                            TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject6;
                            MessagesController.getInstance(i13).putUsers(paymentForm.users, false);
                            jo0Var = new jo0(paymentForm, null, str3, launchActivity2.O().getLastFragment());
                        } else {
                            jo0Var = tLObject6 instanceof TLRPC.PaymentReceipt ? new jo0((TLRPC.PaymentReceipt) tLObject6) : null;
                        }
                        if (jo0Var != null) {
                            u5 u5Var2 = launchActivity2.V0;
                            if (u5Var2 != null) {
                                launchActivity2.V0 = null;
                                jo0Var.W0 = new gf(9, u5Var2);
                            }
                            launchActivity2.p0(jo0Var);
                        }
                    }
                }
                try {
                    g00Var3.run();
                    break;
                } catch (Exception e6) {
                    FileLog.e(e6);
                    return;
                }
            case 11:
                LaunchActivity launchActivity3 = (LaunchActivity) obj6;
                oy oyVar = (oy) obj3;
                org.telegram.ui.ActionBar.p2 p2Var2 = (org.telegram.ui.ActionBar.p2) obj;
                TLRPC.User user = (TLRPC.User) obj2;
                String str4 = (String) obj5;
                Pattern pattern = LaunchActivity.y1;
                if (((TLObject) obj4) instanceof TLRPC.TL_boolTrue) {
                    MediaDataController.getInstance(i13).loadAttachMenuBots(false, true, new jy0(launchActivity3, oyVar, p2Var2, user, str4, 7));
                    break;
                }
                break;
            case 12:
                wf0 wf0Var = (wf0) obj6;
                String str5 = (String) obj5;
                p2.h hVar = (p2.h) obj4;
                List list = (List) obj3;
                String str6 = (String) obj2;
                String str7 = (String) obj;
                ng0 ng0Var = wf0Var.v;
                StringBuilder t6 = android.support.v4.media.a.t("LoginBilling queried \"", str5, "\" product: ");
                t6.append(BillingController.getResponseCodeString(hVar.a));
                FileLog.d(t6.toString());
                if (hVar.a != 0) {
                    wf0Var.e = "BILLING_" + BillingController.getResponseCodeString(hVar.a);
                    new qc(ng0Var.W, null).H(R.raw.error, LocaleController.formatString(R.string.UnknownErrorCode, BillingController.getResponseCodeString(hVar.a)));
                    break;
                } else if (list != null && !list.isEmpty()) {
                    p2.n nVar = (p2.n) list.get(0);
                    p2.k a2 = nVar.a();
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
                    i11 = ((org.telegram.ui.ActionBar.p2) ng0Var).currentAccount;
                    ConnectionsManager.getInstance(i11).sendRequest(tL_payments_canPurchaseStore, new w8(wf0Var, a2, i17, nVar, tL_inputStorePaymentAuthCode, str5, tL_payments_canPurchaseStore, 3), 10);
                    break;
                } else {
                    wf0Var.e = "PRODUCT_NOT_FOUND";
                    new qc(ng0Var.W, null).H(R.raw.error, LocaleController.formatString(R.string.UnknownErrorCode, "PRODUCT_NOT_FOUND"));
                    break;
                }
            case 13:
                ProfileActivity profileActivity = (ProfileActivity) obj6;
                View view = (View) obj4;
                String str8 = (String) obj5;
                boolean[] zArr2 = (boolean[]) obj3;
                String[] strArr = (String[]) obj2;
                String str9 = (String) obj;
                if (profileActivity.getParentActivity() != null) {
                    o70 H = o70.H(profileActivity, view);
                    H.W(profileActivity.a.V0(view, false));
                    H.w = false;
                    H.c(R.drawable.msg_copy, LocaleController.getString(R.string.Copy), new zt0(profileActivity, str8, i13, 3), false);
                    H.l(R.drawable.msg_translate, LocaleController.getString(R.string.TranslateMessage), new a30(profileActivity, strArr, str9, str8, 29), zArr2[0]);
                    H.Z();
                    break;
                }
                break;
            default:
                ArrayList arrayList6 = (ArrayList) obj5;
                a0.h hVar2 = (a0.h) obj4;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) obj3;
                TLObject tLObject7 = (TLObject) obj2;
                MessagesController messagesController = (MessagesController) obj;
                tf.u0 u0Var = ((tf.p0) obj6).h;
                if (u0Var.g0 != 0 && i13 == u0Var.f0 && u0Var.y != null && u0Var.x != null) {
                    u0Var.Y(hVar2, arrayList6, false);
                    if (tL_error4 == null) {
                        TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject7;
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

    public /* synthetic */ m2(int i10, ArrayList arrayList, ArrayList arrayList2, Integer num, MediaController.AlbumEntry albumEntry, MediaController.AlbumEntry albumEntry2, MediaController.AlbumEntry albumEntry3) {
        this.a = 1;
        this.b = i10;
        this.c = arrayList;
        this.d = arrayList2;
        this.e = num;
        this.f = albumEntry;
        this.h = albumEntry2;
        this.n = albumEntry3;
    }

    public /* synthetic */ m2(Object obj, int i10, Serializable serializable, Object obj2, Object obj3, Object obj4, Object obj5, int i11) {
        this.a = i11;
        this.c = obj;
        this.b = i10;
        this.d = serializable;
        this.e = obj2;
        this.f = obj3;
        this.h = obj4;
        this.n = obj5;
    }

    public /* synthetic */ m2(Object obj, Object obj2, Object obj3, int i10, Object obj4, Object obj5, Object obj6, int i11) {
        this.a = i11;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = i10;
        this.f = obj4;
        this.h = obj5;
        this.n = obj6;
    }

    public /* synthetic */ m2(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, TLObject tLObject, TLObject tLObject2, TLObject tLObject3, Object obj, int i10, String str, int i11) {
        this.a = i11;
        this.c = notificationCenterDelegate;
        this.e = tLObject;
        this.f = tLObject2;
        this.h = tLObject3;
        this.n = obj;
        this.b = i10;
        this.d = str;
    }

    public /* synthetic */ m2(TLObject tLObject, org.telegram.ui.ActionBar.d2 d2Var, Context context, int i10, TL_phone.exportGroupCallInvite exportgroupcallinvite, org.telegram.ui.ActionBar.f6 f6Var, o60 o60Var) {
        this.a = 5;
        this.c = tLObject;
        this.d = d2Var;
        this.f = context;
        this.b = i10;
        this.e = exportgroupcallinvite;
        this.h = f6Var;
        this.n = o60Var;
    }

    public /* synthetic */ m2(org.telegram.ui.ActionBar.d2 d2Var, TLObject tLObject, int i10, TLRPC.Document document, TLRPC.TL_error tL_error, Object obj, TLRPC.TL_stickers_addStickerToSet tL_stickers_addStickerToSet) {
        this.a = 7;
        this.c = d2Var;
        this.d = tLObject;
        this.b = i10;
        this.e = document;
        this.f = tL_error;
        this.h = obj;
        this.n = tL_stickers_addStickerToSet;
    }

    public /* synthetic */ m2(org.telegram.ui.l4 l4Var, int i10, af.f fVar, TLObject tLObject, String str, org.telegram.ui.h0 h0Var, TLRPC.TL_messages_getWebPage tL_messages_getWebPage) {
        this.a = 3;
        this.c = l4Var;
        this.b = i10;
        this.e = fVar;
        this.f = tLObject;
        this.d = str;
        this.h = h0Var;
        this.n = tL_messages_getWebPage;
    }

    public /* synthetic */ m2(LaunchActivity launchActivity, TLObject tLObject, int i10, oy oyVar, org.telegram.ui.ActionBar.p2 p2Var, TLRPC.User user, String str) {
        this.a = 11;
        this.c = launchActivity;
        this.e = tLObject;
        this.b = i10;
        this.f = oyVar;
        this.n = p2Var;
        this.h = user;
        this.d = str;
    }

    public /* synthetic */ m2(LaunchActivity launchActivity, TLRPC.TL_error tL_error, TLObject tLObject, int i10, org.telegram.ui.ActionBar.d2 d2Var, g00 g00Var, String str) {
        this.a = 9;
        this.c = launchActivity;
        this.e = tL_error;
        this.f = tLObject;
        this.b = i10;
        this.h = d2Var;
        this.n = g00Var;
        this.d = str;
    }

    public /* synthetic */ m2(wf0 wf0Var, String str, p2.h hVar, List list, String str2, String str3, int i10) {
        this.a = 12;
        this.c = wf0Var;
        this.d = str;
        this.e = hVar;
        this.f = list;
        this.h = str2;
        this.n = str3;
        this.b = i10;
    }

    public /* synthetic */ m2(ProfileActivity profileActivity, View view, String str, int i10, boolean[] zArr, String[] strArr, String str2) {
        this.a = 13;
        this.c = profileActivity;
        this.e = view;
        this.d = str;
        this.b = i10;
        this.f = zArr;
        this.h = strArr;
        this.n = str2;
    }
}
