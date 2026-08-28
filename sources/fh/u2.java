package fh;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import gh.v7;
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
import org.telegram.messenger.ll;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.jg0;
import org.telegram.ui.Components.l80;
import org.telegram.ui.Components.oc;
import org.telegram.ui.Components.p70;
import org.telegram.ui.Components.vq0;
import org.telegram.ui.Components.x60;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.a60;
import org.telegram.ui.bf;
import org.telegram.ui.c80;
import org.telegram.ui.co0;
import org.telegram.ui.dy;
import org.telegram.ui.fg0;
import org.telegram.ui.ga0;
import org.telegram.ui.hr;
import org.telegram.ui.i9;
import org.telegram.ui.ir0;
import org.telegram.ui.jh0;
import org.telegram.ui.jq;
import org.telegram.ui.o80;
import org.telegram.ui.of0;
import org.telegram.ui.qn;
import org.telegram.ui.r50;
import org.telegram.ui.t8;
import org.telegram.ui.vg;
import org.telegram.ui.we1;
import org.telegram.ui.x20;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class u2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object n;

    public /* synthetic */ u2(int i9, FrameLayout frameLayout, TLRPC.InputGroupCall inputGroupCall, org.telegram.ui.ActionBar.f3 f3Var, org.telegram.ui.ActionBar.b6 b6Var, l80 l80Var, String[] strArr) {
        this.a = 5;
        this.c = inputGroupCall;
        this.b = i9;
        this.d = strArr;
        this.e = frameLayout;
        this.f = l80Var;
        this.n = f3Var;
        this.h = b6Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:77:0x028f, code lost:
    
        if (r8.chat.has_geo != false) goto L74;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        x20 x20Var;
        co0 co0Var;
        oc a02;
        int i9;
        int i10;
        int i11 = this.a;
        int i12 = this.b;
        int i13 = 1;
        int i14 = 0;
        Object obj = this.n;
        Object obj2 = this.h;
        Object obj3 = this.f;
        Object obj4 = this.d;
        Object obj5 = this.e;
        Object obj6 = this.c;
        switch (i11) {
            case 0:
                StringBuilder sb2 = new StringBuilder();
                j3.r0.A(sb2, MessagesController.getInstance(i12).linkPrefix, "/", (String) obj4, "/c/");
                sb2.append(((TL_stars.TL_starGiftCollection) obj5).collection_id);
                String sb3 = sb2.toString();
                new f3((vq0) obj6, (Context) obj3, sb3, sb3, (org.telegram.ui.ActionBar.b6) obj2, (org.telegram.ui.ActionBar.o2) obj).show();
                break;
            case 1:
                ArrayList arrayList = (ArrayList) obj4;
                a0.h hVar = (a0.h) obj5;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj3;
                TLObject tLObject = (TLObject) obj2;
                MessagesController messagesController = (MessagesController) obj;
                of.f1 f1Var = ((of.a1) obj6).h;
                if (f1Var.f0 != 0 && i12 == f1Var.e0 && f1Var.y != null && f1Var.x != null) {
                    f1Var.Y(hVar, arrayList, false);
                    if (tL_error == null) {
                        TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject;
                        messagesController.putUsers(tL_channels_channelParticipants.users, false);
                        messagesController.putChats(tL_channels_channelParticipants.chats, false);
                        f1Var.x.isEmpty();
                        if (!tL_channels_channelParticipants.participants.isEmpty()) {
                            long clientUserId = UserConfig.getInstance(f1Var.f).getClientUserId();
                            for (int i15 = 0; i15 < tL_channels_channelParticipants.participants.size(); i15++) {
                                long peerId = MessageObject.getPeerId(tL_channels_channelParticipants.participants.get(i15).peer);
                                if (f1Var.y.h(peerId) < 0 && ((peerId != 0 || f1Var.y.h(clientUserId) < 0) && (f1Var.g0 || (peerId != clientUserId && peerId != 0)))) {
                                    if (peerId >= 0) {
                                        TLRPC.User user = messagesController.getUser(Long.valueOf(peerId));
                                        if (user == null) {
                                            break;
                                        } else {
                                            f1Var.x.add(user);
                                        }
                                    } else {
                                        TLRPC.Chat chat = messagesController.getChat(Long.valueOf(-peerId));
                                        if (chat == null) {
                                            break;
                                        } else {
                                            f1Var.x.add(chat);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    f1Var.l();
                    f1Var.R.a(!f1Var.x.isEmpty());
                }
                f1Var.f0 = 0;
                break;
            case 2:
                MediaController.lambda$broadcastNewPhotos$58(this.b, (ArrayList) obj6, (ArrayList) obj4, (Integer) obj5, (MediaController.AlbumEntry) obj3, (MediaController.AlbumEntry) obj2, (MediaController.AlbumEntry) obj);
                break;
            case 3:
                ((SendMessagesHelper) obj6).lambda$performSendDelayedMessage$53((TLObject) obj5, (TLRPC.InputFile) obj3, (TLRPC.InputMedia) obj2, (SendMessagesHelper.DelayedMessage) obj, this.b, (String) obj4);
                break;
            case 4:
                org.telegram.ui.l4 l4Var = (org.telegram.ui.l4) obj6;
                ve.d dVar = (ve.d) obj5;
                TLObject tLObject2 = (TLObject) obj3;
                String str = (String) obj4;
                org.telegram.ui.h0 h0Var = (org.telegram.ui.h0) obj2;
                TLRPC.TL_messages_getWebPage tL_messages_getWebPage = (TLRPC.TL_messages_getWebPage) obj;
                if (l4Var.B0 != 0 && i12 == l4Var.D0) {
                    if (dVar != null) {
                        dVar.b();
                    }
                    l4Var.B0 = 0;
                    l4Var.b0(false);
                    if (l4Var.R) {
                        if (tLObject2 instanceof TLRPC.TL_messages_webPage) {
                            TLRPC.TL_messages_webPage tL_messages_webPage = (TLRPC.TL_messages_webPage) tLObject2;
                            MessagesController.getInstance(l4Var.T).putUsers(tL_messages_webPage.users, false);
                            MessagesController.getInstance(l4Var.T).putChats(tL_messages_webPage.chats, false);
                            TLRPC.WebPage webPage = tL_messages_webPage.webpage;
                            if (webPage == null || !(webPage.cached_page instanceof TL_iv.TL_page)) {
                                if (!((Boolean) h0Var.run()).booleanValue()) {
                                    if (MessagesController.getInstance(l4Var.T).isWebBrowserOpenInApp(tL_messages_getWebPage.url)) {
                                        l4Var.g(1, tL_messages_getWebPage.url);
                                        break;
                                    } else {
                                        ve.e.s(l4Var.H, tL_messages_getWebPage.url);
                                        break;
                                    }
                                }
                            } else {
                                l4Var.h(webPage, str, 1);
                                break;
                            }
                        } else {
                            if (tLObject2 instanceof TLRPC.TL_webPage) {
                                TLRPC.TL_webPage tL_webPage = (TLRPC.TL_webPage) tLObject2;
                                if (tL_webPage.cached_page instanceof TL_iv.TL_page) {
                                    l4Var.h(tL_webPage, str, 1);
                                    break;
                                }
                            }
                            if (!((Boolean) h0Var.run()).booleanValue()) {
                                if (MessagesController.getInstance(l4Var.T).isWebBrowserOpenInApp(tL_messages_getWebPage.url)) {
                                    l4Var.g(1, tL_messages_getWebPage.url);
                                    break;
                                } else {
                                    ve.e.s(l4Var.H, tL_messages_getWebPage.url);
                                    break;
                                }
                            }
                        }
                    }
                }
                break;
            case 5:
                TLRPC.InputGroupCall inputGroupCall = (TLRPC.InputGroupCall) obj6;
                TL_phone.toggleGroupCallSettings togglegroupcallsettings = new TL_phone.toggleGroupCallSettings();
                togglegroupcallsettings.call = inputGroupCall;
                togglegroupcallsettings.reset_invite_hash = true;
                int i16 = this.b;
                ConnectionsManager.getInstance(i16).sendRequest(togglegroupcallsettings, new t8(i16, (FrameLayout) obj5, inputGroupCall, (org.telegram.ui.ActionBar.f3) obj, (org.telegram.ui.ActionBar.b6) obj2, (l80) obj3, (String[]) obj4));
                break;
            case 6:
                TLObject tLObject3 = (TLObject) obj6;
                org.telegram.ui.ActionBar.c2 c2Var = (org.telegram.ui.ActionBar.c2) obj4;
                Context context = (Context) obj3;
                TL_phone.exportGroupCallInvite exportgroupcallinvite = (TL_phone.exportGroupCallInvite) obj5;
                org.telegram.ui.ActionBar.b6 b6Var = (org.telegram.ui.ActionBar.b6) obj2;
                a60 a60Var = (a60) obj;
                if (tLObject3 instanceof TL_phone.exportedGroupCallInvite) {
                    c2Var.dismiss();
                    i9.n0(context, this.b, exportgroupcallinvite.call, ((TL_phone.exportedGroupCallInvite) tLObject3).link, b6Var, true, true);
                } else {
                    c2Var.dismiss();
                }
                AndroidUtilities.runOnUIThread(a60Var);
                break;
            case 7:
                TLObject tLObject4 = (TLObject) obj4;
                ArrayList arrayList2 = (ArrayList) obj5;
                AtomicInteger atomicInteger = (AtomicInteger) obj3;
                ArrayList arrayList3 = (ArrayList) obj2;
                jq jqVar = (jq) obj;
                if (((TLRPC.TL_error) obj6) == null && (tLObject4 instanceof TLRPC.TL_channels_channelParticipants)) {
                    arrayList2.set(i12, (TLRPC.TL_channels_channelParticipants) tLObject4);
                }
                atomicInteger.getAndIncrement();
                if (atomicInteger.get() == arrayList3.size()) {
                    jqVar.run();
                    break;
                }
                break;
            case 8:
                TLObject tLObject5 = (TLObject) obj4;
                TLRPC.Document document = (TLRPC.Document) obj5;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj3;
                TLRPC.TL_stickers_addStickerToSet tL_stickers_addStickerToSet = (TLRPC.TL_stickers_addStickerToSet) obj;
                ((org.telegram.ui.ActionBar.c2) obj6).dismiss();
                if (tLObject5 instanceof TLRPC.TL_messages_stickerSet) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject5;
                    MediaDataController.getInstance(i12).putStickerSet(tL_messages_stickerSet);
                    if (!MediaDataController.getInstance(i12).isStickerPackInstalled(tL_messages_stickerSet.set.id)) {
                        MediaDataController.getInstance(i12).toggleStickerSet(null, tLObject5, 2, null, false, false);
                    }
                    AndroidUtilities.runOnUIThread(new jg0(tLObject5, document), 250L);
                    break;
                } else if (tL_error2 != null) {
                    if (FileRefController.isFileRefError(tL_error2.text)) {
                        FileRefController.getInstance(i12).requestReference(obj2, tL_stickers_addStickerToSet);
                        break;
                    } else {
                        oc.b0(tL_error2);
                        break;
                    }
                }
                break;
            case 9:
                r50.a((org.telegram.ui.ActionBar.c2) obj6, (ve.d) obj4, (TLObject) obj5, this.b, (Context) obj3, (TLRPC.TL_inputGroupCallSlug) obj2, (TLRPC.TL_error) obj);
                break;
            case 10:
                LaunchActivity launchActivity = (LaunchActivity) obj6;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj5;
                TLObject tLObject6 = (TLObject) obj3;
                org.telegram.ui.ActionBar.c2 c2Var2 = (org.telegram.ui.ActionBar.c2) obj2;
                x20 x20Var2 = (x20) obj;
                String str2 = (String) obj4;
                ArrayList arrayList4 = launchActivity.Z;
                if (!launchActivity.isFinishing()) {
                    if (tL_error3 != null || launchActivity.m0 == null) {
                        x20Var = x20Var2;
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(launchActivity);
                        String string = LocaleController.getString(R.string.AppName);
                        org.telegram.ui.ActionBar.c2 c2Var3 = alertDialog$Builder.a;
                        c2Var3.N = string;
                        if (tL_error3.text.startsWith("FLOOD_WAIT")) {
                            c2Var3.P = LocaleController.getString(R.string.FloodWait);
                        } else if (tL_error3.text.startsWith("INVITE_HASH_EXPIRED")) {
                            c2Var3.N = LocaleController.getString(R.string.ExpiredLink);
                            c2Var3.P = LocaleController.getString(R.string.InviteExpired);
                        } else {
                            c2Var3.P = LocaleController.getString(R.string.JoinToGroupErrorNotExist);
                        }
                        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                        launchActivity.B0(alertDialog$Builder);
                    } else {
                        TLRPC.ChatInvite chatInvite = (TLRPC.ChatInvite) tLObject6;
                        TLRPC.Chat chat2 = chatInvite.chat;
                        if (chat2 != null) {
                            if (ChatObject.isLeftFromChat(chat2)) {
                                TLRPC.Chat chat3 = chatInvite.chat;
                                if (!chat3.kicked) {
                                    if (!ChatObject.isPublic(chat3)) {
                                        if (!(chatInvite instanceof TLRPC.TL_chatInvitePeek)) {
                                            break;
                                        }
                                    }
                                }
                            }
                            MessagesController.getInstance(i12).putChat(chatInvite.chat, false);
                            ArrayList arrayList5 = new ArrayList();
                            arrayList5.add(chatInvite.chat);
                            MessagesStorage.getInstance(i12).putUsersAndChats(null, arrayList5, false, true);
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", chatInvite.chat.id);
                            if (arrayList4.isEmpty() || MessagesController.getInstance(i12).checkCanOpenChat(bundle, (org.telegram.ui.ActionBar.o2) j3.r0.j(1, arrayList4))) {
                                boolean[] zArr = new boolean[1];
                                c2Var2.setOnCancelListener(new vg(i13, zArr));
                                if (!chatInvite.chat.forum) {
                                    MessagesController.getInstance(i12).ensureMessagesLoaded(-chatInvite.chat.id, 0, new ga0(launchActivity, x20Var2, zArr, bundle, chatInvite));
                                    break;
                                } else {
                                    Bundle bundle2 = new Bundle();
                                    bundle2.putLong("chat_id", chatInvite.chat.id);
                                    launchActivity.p0(we1.E0(launchActivity, bundle2));
                                }
                            }
                            x20Var = x20Var2;
                        }
                        x20Var = x20Var2;
                        TL_stars.TL_starsSubscriptionPricing tL_starsSubscriptionPricing = chatInvite.subscription_pricing;
                        if (tL_starsSubscriptionPricing == null || chatInvite.can_refulfill_subscription) {
                            org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) j3.r0.j(1, arrayList4);
                            o2Var.showDialog(new p70(launchActivity, chatInvite, str2, o2Var, o2Var instanceof qn ? ((qn) o2Var).aa : null));
                        } else {
                            long j10 = tL_starsSubscriptionPricing.amount;
                            MessagesController.getInstance(i12).putChat(chatInvite.chat, false);
                            v7.y(launchActivity.K, false).j0(str2, chatInvite, new m(launchActivity, j10, 3));
                        }
                    }
                    try {
                        x20Var.run();
                        break;
                    } catch (Exception e10) {
                        FileLog.e(e10);
                        return;
                    }
                }
                break;
            case 11:
                LaunchActivity launchActivity2 = (LaunchActivity) obj6;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) obj5;
                TLObject tLObject7 = (TLObject) obj3;
                TLRPC.TL_inputInvoiceSlug tL_inputInvoiceSlug = (TLRPC.TL_inputInvoiceSlug) obj2;
                x20 x20Var3 = (x20) obj;
                String str3 = (String) obj4;
                ArrayList arrayList6 = launchActivity2.Z;
                if (tL_error4 != null) {
                    if ("SUBSCRIPTION_ALREADY_ACTIVE".equalsIgnoreCase(tL_error4.text)) {
                        a02 = oc.a0((org.telegram.ui.ActionBar.o2) j3.r0.j(1, arrayList6));
                        i9 = R.string.PaymentInvoiceSubscriptionLinkAlreadyPaid;
                    } else {
                        a02 = oc.a0((org.telegram.ui.ActionBar.o2) j3.r0.j(1, arrayList6));
                        i9 = R.string.PaymentInvoiceLinkInvalid;
                    }
                    ll.p(i9, a02, null);
                } else if (!launchActivity2.isFinishing()) {
                    if (tLObject7 instanceof TLRPC.TL_payments_paymentFormStars) {
                        j6 j6Var = launchActivity2.U0;
                        launchActivity2.U0 = null;
                        v7.y(launchActivity2.K, false).Y(null, tL_inputInvoiceSlug, (TLRPC.TL_payments_paymentFormStars) tLObject7, new c80(x20Var3, 1), new o80(j6Var, i14));
                        break;
                    } else {
                        if (tLObject7 instanceof TLRPC.PaymentForm) {
                            TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject7;
                            MessagesController.getInstance(i12).putUsers(paymentForm.users, false);
                            co0Var = new co0(paymentForm, null, str3, launchActivity2.O().getLastFragment());
                        } else {
                            co0Var = tLObject7 instanceof TLRPC.PaymentReceipt ? new co0((TLRPC.PaymentReceipt) tLObject7) : null;
                        }
                        if (co0Var != null) {
                            j6 j6Var2 = launchActivity2.U0;
                            if (j6Var2 != null) {
                                launchActivity2.U0 = null;
                                co0Var.V0 = new bf(9, j6Var2);
                            }
                            launchActivity2.p0(co0Var);
                        }
                    }
                }
                try {
                    x20Var3.run();
                    break;
                } catch (Exception e11) {
                    FileLog.e(e11);
                    return;
                }
            case 12:
                LaunchActivity launchActivity3 = (LaunchActivity) obj6;
                dy dyVar = (dy) obj3;
                org.telegram.ui.ActionBar.o2 o2Var2 = (org.telegram.ui.ActionBar.o2) obj;
                TLRPC.User user2 = (TLRPC.User) obj2;
                String str4 = (String) obj4;
                Pattern pattern = LaunchActivity.x1;
                if (((TLObject) obj5) instanceof TLRPC.TL_boolTrue) {
                    MediaDataController.getInstance(i12).loadAttachMenuBots(false, true, new hr(launchActivity3, dyVar, o2Var2, user2, str4, 10));
                    break;
                }
                break;
            case 13:
                of0 of0Var = (of0) obj6;
                String str5 = (String) obj4;
                n2.g gVar = (n2.g) obj5;
                List list = (List) obj3;
                String str6 = (String) obj2;
                String str7 = (String) obj;
                fg0 fg0Var = of0Var.v;
                StringBuilder t10 = aa.d.t("LoginBilling queried \"", str5, "\" product: ");
                t10.append(BillingController.getResponseCodeString(gVar.a));
                FileLog.d(t10.toString());
                if (gVar.a != 0) {
                    of0Var.e = "BILLING_" + BillingController.getResponseCodeString(gVar.a);
                    new oc(fg0Var.V, null).H(R.raw.error, LocaleController.formatString(R.string.UnknownErrorCode, BillingController.getResponseCodeString(gVar.a)));
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
                    StringBuilder t11 = aa.d.t("LoginBilling found \"", str5, "\" product, with currency=");
                    t11.append(tL_inputStorePaymentAuthCode.currency);
                    t11.append(" amount=");
                    t11.append(tL_inputStorePaymentAuthCode.amount);
                    t11.append("; phone=");
                    t11.append(str7);
                    t11.append(", phone_code_hash=");
                    t11.append(str6);
                    FileLog.d(t11.toString());
                    TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore = new TLRPC.TL_payments_canPurchaseStore();
                    tL_payments_canPurchaseStore.purpose = tL_inputStorePaymentAuthCode;
                    i10 = ((org.telegram.ui.ActionBar.o2) fg0Var).currentAccount;
                    ConnectionsManager.getInstance(i10).sendRequest(tL_payments_canPurchaseStore, new t8(of0Var, a2, i17, lVar, tL_inputStorePaymentAuthCode, str5, tL_payments_canPurchaseStore, 3), 10);
                    break;
                } else {
                    of0Var.e = "PRODUCT_NOT_FOUND";
                    new oc(fg0Var.V, null).H(R.raw.error, LocaleController.formatString(R.string.UnknownErrorCode, "PRODUCT_NOT_FOUND"));
                    break;
                }
                break;
            default:
                ProfileActivity profileActivity = (ProfileActivity) obj6;
                View view = (View) obj5;
                String str8 = (String) obj4;
                boolean[] zArr2 = (boolean[]) obj3;
                String[] strArr = (String[]) obj2;
                String str9 = (String) obj;
                if (profileActivity.getParentActivity() != null) {
                    x60 H = x60.H(profileActivity, view);
                    H.W(profileActivity.a.V0(view, false));
                    H.w = false;
                    H.c(R.drawable.msg_copy, LocaleController.getString(R.string.Copy), new jh0(profileActivity, str8, i12, 6), false);
                    H.l(R.drawable.msg_translate, LocaleController.getString(R.string.TranslateMessage), new ir0(profileActivity, strArr, str9, str8, 7), zArr2[0]);
                    H.Z();
                    break;
                }
                break;
        }
    }

    public /* synthetic */ u2(int i9, ArrayList arrayList, ArrayList arrayList2, Integer num, MediaController.AlbumEntry albumEntry, MediaController.AlbumEntry albumEntry2, MediaController.AlbumEntry albumEntry3) {
        this.a = 2;
        this.b = i9;
        this.c = arrayList;
        this.d = arrayList2;
        this.e = num;
        this.f = albumEntry;
        this.h = albumEntry2;
        this.n = albumEntry3;
    }

    public /* synthetic */ u2(Object obj, int i9, Serializable serializable, Object obj2, Object obj3, Object obj4, Object obj5, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = i9;
        this.d = serializable;
        this.e = obj2;
        this.f = obj3;
        this.h = obj4;
        this.n = obj5;
    }

    public /* synthetic */ u2(Object obj, Object obj2, Object obj3, int i9, Object obj4, Object obj5, Object obj6, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = i9;
        this.f = obj4;
        this.h = obj5;
        this.n = obj6;
    }

    public /* synthetic */ u2(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, TLObject tLObject, TLObject tLObject2, TLObject tLObject3, Object obj, int i9, String str, int i10) {
        this.a = i10;
        this.c = notificationCenterDelegate;
        this.e = tLObject;
        this.f = tLObject2;
        this.h = tLObject3;
        this.n = obj;
        this.b = i9;
        this.d = str;
    }

    public /* synthetic */ u2(TLObject tLObject, org.telegram.ui.ActionBar.c2 c2Var, Context context, int i9, TL_phone.exportGroupCallInvite exportgroupcallinvite, org.telegram.ui.ActionBar.b6 b6Var, a60 a60Var) {
        this.a = 6;
        this.c = tLObject;
        this.d = c2Var;
        this.f = context;
        this.b = i9;
        this.e = exportgroupcallinvite;
        this.h = b6Var;
        this.n = a60Var;
    }

    public /* synthetic */ u2(org.telegram.ui.ActionBar.c2 c2Var, TLObject tLObject, int i9, TLRPC.Document document, TLRPC.TL_error tL_error, Object obj, TLRPC.TL_stickers_addStickerToSet tL_stickers_addStickerToSet) {
        this.a = 8;
        this.c = c2Var;
        this.d = tLObject;
        this.b = i9;
        this.e = document;
        this.f = tL_error;
        this.h = obj;
        this.n = tL_stickers_addStickerToSet;
    }

    public /* synthetic */ u2(org.telegram.ui.l4 l4Var, int i9, ve.d dVar, TLObject tLObject, String str, org.telegram.ui.h0 h0Var, TLRPC.TL_messages_getWebPage tL_messages_getWebPage) {
        this.a = 4;
        this.c = l4Var;
        this.b = i9;
        this.e = dVar;
        this.f = tLObject;
        this.d = str;
        this.h = h0Var;
        this.n = tL_messages_getWebPage;
    }

    public /* synthetic */ u2(LaunchActivity launchActivity, TLObject tLObject, int i9, dy dyVar, org.telegram.ui.ActionBar.o2 o2Var, TLRPC.User user, String str) {
        this.a = 12;
        this.c = launchActivity;
        this.e = tLObject;
        this.b = i9;
        this.f = dyVar;
        this.n = o2Var;
        this.h = user;
        this.d = str;
    }

    public /* synthetic */ u2(LaunchActivity launchActivity, TLRPC.TL_error tL_error, TLObject tLObject, int i9, org.telegram.ui.ActionBar.c2 c2Var, x20 x20Var, String str) {
        this.a = 10;
        this.c = launchActivity;
        this.e = tL_error;
        this.f = tLObject;
        this.b = i9;
        this.h = c2Var;
        this.n = x20Var;
        this.d = str;
    }

    public /* synthetic */ u2(of0 of0Var, String str, n2.g gVar, List list, String str2, String str3, int i9) {
        this.a = 13;
        this.c = of0Var;
        this.d = str;
        this.e = gVar;
        this.f = list;
        this.h = str2;
        this.n = str3;
        this.b = i9;
    }

    public /* synthetic */ u2(ProfileActivity profileActivity, View view, String str, int i9, boolean[] zArr, String[] strArr, String str2) {
        this.a = 14;
        this.c = profileActivity;
        this.e = view;
        this.d = str;
        this.b = i9;
        this.f = zArr;
        this.h = strArr;
        this.n = str2;
    }
}
