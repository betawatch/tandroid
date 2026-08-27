package gh;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import hh.u7;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Pattern;
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
import org.telegram.ui.Components.b70;
import org.telegram.ui.Components.l20;
import org.telegram.ui.Components.lg0;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.p80;
import org.telegram.ui.Components.t70;
import org.telegram.ui.Components.wq0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.a30;
import org.telegram.ui.bf;
import org.telegram.ui.do0;
import org.telegram.ui.e60;
import org.telegram.ui.ex0;
import org.telegram.ui.g80;
import org.telegram.ui.gy;
import org.telegram.ui.ig0;
import org.telegram.ui.j9;
import org.telegram.ui.ka0;
import org.telegram.ui.lq;
import org.telegram.ui.ol0;
import org.telegram.ui.rf0;
import org.telegram.ui.rn;
import org.telegram.ui.s80;
import org.telegram.ui.u8;
import org.telegram.ui.v50;
import org.telegram.ui.we1;
import org.telegram.ui.xg;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final /* synthetic */ class p2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object n;

    public /* synthetic */ p2(int i10, FrameLayout frameLayout, TLRPC.InputGroupCall inputGroupCall, org.telegram.ui.ActionBar.e3 e3Var, org.telegram.ui.ActionBar.c6 c6Var, p80 p80Var, String[] strArr) {
        this.a = 4;
        this.c = inputGroupCall;
        this.b = i10;
        this.d = strArr;
        this.e = frameLayout;
        this.f = p80Var;
        this.n = e3Var;
        this.h = c6Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:125:0x033f, code lost:
    
        if (r8.chat.has_geo != false) goto L114;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        a30 a30Var;
        do0 do0Var;
        mc a02;
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
                StringBuilder sb2 = new StringBuilder();
                i0.a.z(sb2, MessagesController.getInstance(i13).linkPrefix, "/", (String) obj5, "/c/");
                sb2.append(((TL_stars.TL_starGiftCollection) obj4).collection_id);
                String sb3 = sb2.toString();
                new a3((wq0) obj6, (Context) obj3, sb3, sb3, (org.telegram.ui.ActionBar.c6) obj2, (org.telegram.ui.ActionBar.n2) obj).show();
                break;
            case 1:
                MediaController.lambda$broadcastNewPhotos$58(this.b, (ArrayList) obj6, (ArrayList) obj5, (Integer) obj4, (MediaController.AlbumEntry) obj3, (MediaController.AlbumEntry) obj2, (MediaController.AlbumEntry) obj);
                break;
            case 2:
                ((SendMessagesHelper) obj6).lambda$performSendDelayedMessage$53((TLObject) obj4, (TLRPC.InputFile) obj3, (TLRPC.InputMedia) obj2, (SendMessagesHelper.DelayedMessage) obj, this.b, (String) obj5);
                break;
            case 3:
                org.telegram.ui.m4 m4Var = (org.telegram.ui.m4) obj6;
                we.d dVar = (we.d) obj4;
                TLObject tLObject = (TLObject) obj3;
                String str = (String) obj5;
                org.telegram.ui.i0 i0Var = (org.telegram.ui.i0) obj2;
                TLRPC.TL_messages_getWebPage tL_messages_getWebPage = (TLRPC.TL_messages_getWebPage) obj;
                if (m4Var.B0 != 0 && i13 == m4Var.D0) {
                    if (dVar != null) {
                        dVar.b();
                    }
                    m4Var.B0 = 0;
                    m4Var.b0(false);
                    if (m4Var.R) {
                        if (tLObject instanceof TLRPC.TL_messages_webPage) {
                            TLRPC.TL_messages_webPage tL_messages_webPage = (TLRPC.TL_messages_webPage) tLObject;
                            MessagesController.getInstance(m4Var.T).putUsers(tL_messages_webPage.users, false);
                            MessagesController.getInstance(m4Var.T).putChats(tL_messages_webPage.chats, false);
                            TLRPC.WebPage webPage = tL_messages_webPage.webpage;
                            if (webPage == null || !(webPage.cached_page instanceof TL_iv.TL_page)) {
                                if (!((Boolean) i0Var.run()).booleanValue()) {
                                    if (MessagesController.getInstance(m4Var.T).isWebBrowserOpenInApp(tL_messages_getWebPage.url)) {
                                        m4Var.g(1, tL_messages_getWebPage.url);
                                        break;
                                    } else {
                                        we.e.s(m4Var.H, tL_messages_getWebPage.url);
                                        break;
                                    }
                                }
                            } else {
                                m4Var.h(webPage, str, 1);
                                break;
                            }
                        } else {
                            if (tLObject instanceof TLRPC.TL_webPage) {
                                TLRPC.TL_webPage tL_webPage = (TLRPC.TL_webPage) tLObject;
                                if (tL_webPage.cached_page instanceof TL_iv.TL_page) {
                                    m4Var.h(tL_webPage, str, 1);
                                    break;
                                }
                            }
                            if (!((Boolean) i0Var.run()).booleanValue()) {
                                if (MessagesController.getInstance(m4Var.T).isWebBrowserOpenInApp(tL_messages_getWebPage.url)) {
                                    m4Var.g(1, tL_messages_getWebPage.url);
                                    break;
                                } else {
                                    we.e.s(m4Var.H, tL_messages_getWebPage.url);
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
                ConnectionsManager.getInstance(i16).sendRequest(togglegroupcallsettings, new u8(i16, (FrameLayout) obj4, inputGroupCall, (org.telegram.ui.ActionBar.e3) obj, (org.telegram.ui.ActionBar.c6) obj2, (p80) obj3, (String[]) obj5));
                break;
            case 5:
                TLObject tLObject2 = (TLObject) obj6;
                org.telegram.ui.ActionBar.b2 b2Var = (org.telegram.ui.ActionBar.b2) obj5;
                Context context = (Context) obj3;
                TL_phone.exportGroupCallInvite exportgroupcallinvite = (TL_phone.exportGroupCallInvite) obj4;
                org.telegram.ui.ActionBar.c6 c6Var = (org.telegram.ui.ActionBar.c6) obj2;
                e60 e60Var = (e60) obj;
                if (tLObject2 instanceof TL_phone.exportedGroupCallInvite) {
                    b2Var.dismiss();
                    j9.o0(context, this.b, exportgroupcallinvite.call, ((TL_phone.exportedGroupCallInvite) tLObject2).link, c6Var, true, true);
                } else {
                    b2Var.dismiss();
                }
                AndroidUtilities.runOnUIThread(e60Var);
                break;
            case 6:
                TLObject tLObject3 = (TLObject) obj5;
                ArrayList arrayList = (ArrayList) obj4;
                AtomicInteger atomicInteger = (AtomicInteger) obj3;
                ArrayList arrayList2 = (ArrayList) obj2;
                lq lqVar = (lq) obj;
                if (((TLRPC.TL_error) obj6) == null && (tLObject3 instanceof TLRPC.TL_channels_channelParticipants)) {
                    arrayList.set(i13, (TLRPC.TL_channels_channelParticipants) tLObject3);
                }
                atomicInteger.getAndIncrement();
                if (atomicInteger.get() == arrayList2.size()) {
                    lqVar.run();
                    break;
                }
                break;
            case 7:
                TLObject tLObject4 = (TLObject) obj5;
                TLRPC.Document document = (TLRPC.Document) obj4;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj3;
                TLRPC.TL_stickers_addStickerToSet tL_stickers_addStickerToSet = (TLRPC.TL_stickers_addStickerToSet) obj;
                ((org.telegram.ui.ActionBar.b2) obj6).dismiss();
                if (tLObject4 instanceof TLRPC.TL_messages_stickerSet) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject4;
                    MediaDataController.getInstance(i13).putStickerSet(tL_messages_stickerSet);
                    if (!MediaDataController.getInstance(i13).isStickerPackInstalled(tL_messages_stickerSet.set.id)) {
                        MediaDataController.getInstance(i13).toggleStickerSet(null, tLObject4, 2, null, false, false);
                    }
                    AndroidUtilities.runOnUIThread(new lg0(tLObject4, document), 250L);
                    break;
                } else if (tL_error != null) {
                    if (FileRefController.isFileRefError(tL_error.text)) {
                        FileRefController.getInstance(i13).requestReference(obj2, tL_stickers_addStickerToSet);
                        break;
                    } else {
                        mc.b0(tL_error);
                        break;
                    }
                }
                break;
            case 8:
                v50.a((org.telegram.ui.ActionBar.b2) obj6, (we.d) obj5, (TLObject) obj4, this.b, (Context) obj3, (TLRPC.TL_inputGroupCallSlug) obj2, (TLRPC.TL_error) obj);
                break;
            case 9:
                LaunchActivity launchActivity = (LaunchActivity) obj6;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj4;
                TLObject tLObject5 = (TLObject) obj3;
                org.telegram.ui.ActionBar.b2 b2Var2 = (org.telegram.ui.ActionBar.b2) obj2;
                a30 a30Var2 = (a30) obj;
                String str2 = (String) obj5;
                ArrayList arrayList3 = launchActivity.Z;
                if (!launchActivity.isFinishing()) {
                    if (tL_error2 != null || launchActivity.m0 == null) {
                        a30Var = a30Var2;
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(launchActivity);
                        String string = LocaleController.getString(R.string.AppName);
                        org.telegram.ui.ActionBar.b2 b2Var3 = alertDialog$Builder.a;
                        b2Var3.N = string;
                        if (tL_error2.text.startsWith("FLOOD_WAIT")) {
                            b2Var3.P = LocaleController.getString(R.string.FloodWait);
                        } else if (tL_error2.text.startsWith("INVITE_HASH_EXPIRED")) {
                            b2Var3.N = LocaleController.getString(R.string.ExpiredLink);
                            b2Var3.P = LocaleController.getString(R.string.InviteExpired);
                        } else {
                            b2Var3.P = LocaleController.getString(R.string.JoinToGroupErrorNotExist);
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
                            if (arrayList3.isEmpty() || MessagesController.getInstance(i13).checkCanOpenChat(bundle, (org.telegram.ui.ActionBar.n2) i0.a.i(1, arrayList3))) {
                                boolean[] zArr = new boolean[1];
                                b2Var2.setOnCancelListener(new xg(i15, zArr));
                                if (!chatInvite.chat.forum) {
                                    MessagesController.getInstance(i13).ensureMessagesLoaded(-chatInvite.chat.id, 0, new ka0(launchActivity, a30Var2, zArr, bundle, chatInvite));
                                    break;
                                } else {
                                    Bundle bundle2 = new Bundle();
                                    bundle2.putLong("chat_id", chatInvite.chat.id);
                                    launchActivity.p0(we1.F0(launchActivity, bundle2));
                                }
                            }
                            a30Var = a30Var2;
                        }
                        a30Var = a30Var2;
                        TL_stars.TL_starsSubscriptionPricing tL_starsSubscriptionPricing = chatInvite.subscription_pricing;
                        if (tL_starsSubscriptionPricing == null || chatInvite.can_refulfill_subscription) {
                            org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) i0.a.i(1, arrayList3);
                            n2Var.showDialog(new t70(launchActivity, chatInvite, str2, n2Var, n2Var instanceof rn ? ((rn) n2Var).aa : null));
                        } else {
                            long j10 = tL_starsSubscriptionPricing.amount;
                            MessagesController.getInstance(i13).putChat(chatInvite.chat, false);
                            u7.y(launchActivity.K, false).j0(str2, chatInvite, new m(launchActivity, j10, 3));
                        }
                    }
                    try {
                        a30Var.run();
                        break;
                    } catch (Exception e9) {
                        FileLog.e(e9);
                        return;
                    }
                }
                break;
            case 10:
                LaunchActivity launchActivity2 = (LaunchActivity) obj6;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj4;
                TLObject tLObject6 = (TLObject) obj3;
                TLRPC.TL_inputInvoiceSlug tL_inputInvoiceSlug = (TLRPC.TL_inputInvoiceSlug) obj2;
                a30 a30Var3 = (a30) obj;
                String str3 = (String) obj5;
                ArrayList arrayList5 = launchActivity2.Z;
                if (tL_error3 != null) {
                    if ("SUBSCRIPTION_ALREADY_ACTIVE".equalsIgnoreCase(tL_error3.text)) {
                        a02 = mc.a0((org.telegram.ui.ActionBar.n2) i0.a.i(1, arrayList5));
                        i10 = R.string.PaymentInvoiceSubscriptionLinkAlreadyPaid;
                    } else {
                        a02 = mc.a0((org.telegram.ui.ActionBar.n2) i0.a.i(1, arrayList5));
                        i10 = R.string.PaymentInvoiceLinkInvalid;
                    }
                    org.telegram.messenger.y1.r(i10, a02, null);
                } else if (!launchActivity2.isFinishing()) {
                    if (tLObject6 instanceof TLRPC.TL_payments_paymentFormStars) {
                        b6 b6Var = launchActivity2.U0;
                        launchActivity2.U0 = null;
                        u7.y(launchActivity2.K, false).Y(null, tL_inputInvoiceSlug, (TLRPC.TL_payments_paymentFormStars) tLObject6, new g80(a30Var3, 1), new s80(b6Var, i14));
                        break;
                    } else {
                        if (tLObject6 instanceof TLRPC.PaymentForm) {
                            TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject6;
                            MessagesController.getInstance(i13).putUsers(paymentForm.users, false);
                            do0Var = new do0(paymentForm, null, str3, launchActivity2.O().getLastFragment());
                        } else {
                            do0Var = tLObject6 instanceof TLRPC.PaymentReceipt ? new do0((TLRPC.PaymentReceipt) tLObject6) : null;
                        }
                        if (do0Var != null) {
                            b6 b6Var2 = launchActivity2.U0;
                            if (b6Var2 != null) {
                                launchActivity2.U0 = null;
                                do0Var.V0 = new bf(9, b6Var2);
                            }
                            launchActivity2.p0(do0Var);
                        }
                    }
                }
                try {
                    a30Var3.run();
                    break;
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return;
                }
            case 11:
                LaunchActivity launchActivity3 = (LaunchActivity) obj6;
                gy gyVar = (gy) obj3;
                org.telegram.ui.ActionBar.n2 n2Var2 = (org.telegram.ui.ActionBar.n2) obj;
                TLRPC.User user = (TLRPC.User) obj2;
                String str4 = (String) obj5;
                Pattern pattern = LaunchActivity.x1;
                if (((TLObject) obj4) instanceof TLRPC.TL_boolTrue) {
                    MediaDataController.getInstance(i13).loadAttachMenuBots(false, true, new l20(launchActivity3, gyVar, n2Var2, user, str4, 9));
                    break;
                }
                break;
            case 12:
                rf0 rf0Var = (rf0) obj6;
                String str5 = (String) obj5;
                n2.g gVar = (n2.g) obj4;
                List list = (List) obj3;
                String str6 = (String) obj2;
                String str7 = (String) obj;
                ig0 ig0Var = rf0Var.v;
                StringBuilder r10 = a9.p.r("LoginBilling queried \"", str5, "\" product: ");
                r10.append(BillingController.getResponseCodeString(gVar.a));
                FileLog.d(r10.toString());
                if (gVar.a != 0) {
                    rf0Var.e = "BILLING_" + BillingController.getResponseCodeString(gVar.a);
                    new mc(ig0Var.V, null).H(R.raw.error, LocaleController.formatString(R.string.UnknownErrorCode, BillingController.getResponseCodeString(gVar.a)));
                    break;
                } else if (list != null && !list.isEmpty()) {
                    n2.l lVar = (n2.l) list.get(0);
                    n2.i a2 = lVar.a();
                    TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode = new TLRPC.TL_inputStorePaymentAuthCode();
                    tL_inputStorePaymentAuthCode.currency = a2.c;
                    tL_inputStorePaymentAuthCode.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_inputStorePaymentAuthCode.currency)) * (a2.b / Math.pow(10.0d, 6.0d)));
                    tL_inputStorePaymentAuthCode.phone_code_hash = TextUtils.isEmpty(str6) ? "" : str6;
                    tL_inputStorePaymentAuthCode.phone_number = str7;
                    int i17 = this.b;
                    tL_inputStorePaymentAuthCode.premium_days = i17;
                    StringBuilder r11 = a9.p.r("LoginBilling found \"", str5, "\" product, with currency=");
                    r11.append(tL_inputStorePaymentAuthCode.currency);
                    r11.append(" amount=");
                    r11.append(tL_inputStorePaymentAuthCode.amount);
                    r11.append("; phone=");
                    r11.append(str7);
                    r11.append(", phone_code_hash=");
                    r11.append(str6);
                    FileLog.d(r11.toString());
                    TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore = new TLRPC.TL_payments_canPurchaseStore();
                    tL_payments_canPurchaseStore.purpose = tL_inputStorePaymentAuthCode;
                    i11 = ((org.telegram.ui.ActionBar.n2) ig0Var).currentAccount;
                    ConnectionsManager.getInstance(i11).sendRequest(tL_payments_canPurchaseStore, new u8(rf0Var, a2, i17, lVar, tL_inputStorePaymentAuthCode, str5, tL_payments_canPurchaseStore, 3), 10);
                    break;
                } else {
                    rf0Var.e = "PRODUCT_NOT_FOUND";
                    new mc(ig0Var.V, null).H(R.raw.error, LocaleController.formatString(R.string.UnknownErrorCode, "PRODUCT_NOT_FOUND"));
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
                    b70 H = b70.H(profileActivity, view);
                    H.W(profileActivity.a.V0(view, false));
                    H.w = false;
                    H.c(R.drawable.msg_copy, LocaleController.getString(R.string.Copy), new ol0(profileActivity, str8, i13, 5), false);
                    H.l(R.drawable.msg_translate, LocaleController.getString(R.string.TranslateMessage), new ex0(profileActivity, strArr, str9, str8, 3), zArr2[0]);
                    H.Z();
                    break;
                }
                break;
            default:
                ArrayList arrayList6 = (ArrayList) obj5;
                a0.h hVar = (a0.h) obj4;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) obj3;
                TLObject tLObject7 = (TLObject) obj2;
                MessagesController messagesController = (MessagesController) obj;
                pf.u0 u0Var = ((pf.p0) obj6).h;
                if (u0Var.f0 != 0 && i13 == u0Var.e0 && u0Var.y != null && u0Var.x != null) {
                    u0Var.Y(hVar, arrayList6, false);
                    if (tL_error4 == null) {
                        TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject7;
                        messagesController.putUsers(tL_channels_channelParticipants.users, false);
                        messagesController.putChats(tL_channels_channelParticipants.chats, false);
                        u0Var.x.isEmpty();
                        if (!tL_channels_channelParticipants.participants.isEmpty()) {
                            long clientUserId = UserConfig.getInstance(u0Var.f).getClientUserId();
                            for (int i18 = 0; i18 < tL_channels_channelParticipants.participants.size(); i18++) {
                                long peerId = MessageObject.getPeerId(tL_channels_channelParticipants.participants.get(i18).peer);
                                if (u0Var.y.h(peerId) < 0 && ((peerId != 0 || u0Var.y.h(clientUserId) < 0) && (u0Var.g0 || (peerId != clientUserId && peerId != 0)))) {
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
                    u0Var.R.a(!u0Var.x.isEmpty());
                }
                u0Var.f0 = 0;
                break;
        }
    }

    public /* synthetic */ p2(int i10, ArrayList arrayList, ArrayList arrayList2, Integer num, MediaController.AlbumEntry albumEntry, MediaController.AlbumEntry albumEntry2, MediaController.AlbumEntry albumEntry3) {
        this.a = 1;
        this.b = i10;
        this.c = arrayList;
        this.d = arrayList2;
        this.e = num;
        this.f = albumEntry;
        this.h = albumEntry2;
        this.n = albumEntry3;
    }

    public /* synthetic */ p2(Object obj, int i10, Serializable serializable, Object obj2, Object obj3, Object obj4, Object obj5, int i11) {
        this.a = i11;
        this.c = obj;
        this.b = i10;
        this.d = serializable;
        this.e = obj2;
        this.f = obj3;
        this.h = obj4;
        this.n = obj5;
    }

    public /* synthetic */ p2(Object obj, Object obj2, Object obj3, int i10, Object obj4, Object obj5, Object obj6, int i11) {
        this.a = i11;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = i10;
        this.f = obj4;
        this.h = obj5;
        this.n = obj6;
    }

    public /* synthetic */ p2(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, TLObject tLObject, TLObject tLObject2, TLObject tLObject3, Object obj, int i10, String str, int i11) {
        this.a = i11;
        this.c = notificationCenterDelegate;
        this.e = tLObject;
        this.f = tLObject2;
        this.h = tLObject3;
        this.n = obj;
        this.b = i10;
        this.d = str;
    }

    public /* synthetic */ p2(TLObject tLObject, org.telegram.ui.ActionBar.b2 b2Var, Context context, int i10, TL_phone.exportGroupCallInvite exportgroupcallinvite, org.telegram.ui.ActionBar.c6 c6Var, e60 e60Var) {
        this.a = 5;
        this.c = tLObject;
        this.d = b2Var;
        this.f = context;
        this.b = i10;
        this.e = exportgroupcallinvite;
        this.h = c6Var;
        this.n = e60Var;
    }

    public /* synthetic */ p2(org.telegram.ui.ActionBar.b2 b2Var, TLObject tLObject, int i10, TLRPC.Document document, TLRPC.TL_error tL_error, Object obj, TLRPC.TL_stickers_addStickerToSet tL_stickers_addStickerToSet) {
        this.a = 7;
        this.c = b2Var;
        this.d = tLObject;
        this.b = i10;
        this.e = document;
        this.f = tL_error;
        this.h = obj;
        this.n = tL_stickers_addStickerToSet;
    }

    public /* synthetic */ p2(org.telegram.ui.m4 m4Var, int i10, we.d dVar, TLObject tLObject, String str, org.telegram.ui.i0 i0Var, TLRPC.TL_messages_getWebPage tL_messages_getWebPage) {
        this.a = 3;
        this.c = m4Var;
        this.b = i10;
        this.e = dVar;
        this.f = tLObject;
        this.d = str;
        this.h = i0Var;
        this.n = tL_messages_getWebPage;
    }

    public /* synthetic */ p2(LaunchActivity launchActivity, TLObject tLObject, int i10, gy gyVar, org.telegram.ui.ActionBar.n2 n2Var, TLRPC.User user, String str) {
        this.a = 11;
        this.c = launchActivity;
        this.e = tLObject;
        this.b = i10;
        this.f = gyVar;
        this.n = n2Var;
        this.h = user;
        this.d = str;
    }

    public /* synthetic */ p2(LaunchActivity launchActivity, TLRPC.TL_error tL_error, TLObject tLObject, int i10, org.telegram.ui.ActionBar.b2 b2Var, a30 a30Var, String str) {
        this.a = 9;
        this.c = launchActivity;
        this.e = tL_error;
        this.f = tLObject;
        this.b = i10;
        this.h = b2Var;
        this.n = a30Var;
        this.d = str;
    }

    public /* synthetic */ p2(rf0 rf0Var, String str, n2.g gVar, List list, String str2, String str3, int i10) {
        this.a = 12;
        this.c = rf0Var;
        this.d = str;
        this.e = gVar;
        this.f = list;
        this.h = str2;
        this.n = str3;
        this.b = i10;
    }

    public /* synthetic */ p2(ProfileActivity profileActivity, View view, String str, int i10, boolean[] zArr, String[] strArr, String str2) {
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
