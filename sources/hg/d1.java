package hg;

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
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.sk;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.e3;
import org.telegram.ui.ActionBar.m2;
import org.telegram.ui.Components.da0;
import org.telegram.ui.Components.f90;
import org.telegram.ui.Components.g90;
import org.telegram.ui.Components.l80;
import org.telegram.ui.Components.ns0;
import org.telegram.ui.Components.zc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.Wallet.WalletEngine2;
import org.telegram.ui.a90;
import org.telegram.ui.ah0;
import org.telegram.ui.ap0;
import org.telegram.ui.br;
import org.telegram.ui.c90;
import org.telegram.ui.d20;
import org.telegram.ui.db0;
import org.telegram.ui.fo;
import org.telegram.ui.jg0;
import org.telegram.ui.jh;
import org.telegram.ui.k4;
import org.telegram.ui.kg1;
import org.telegram.ui.l90;
import org.telegram.ui.n9;
import org.telegram.ui.o90;
import org.telegram.ui.p60;
import org.telegram.ui.tf;
import org.telegram.ui.x8;
import org.telegram.ui.yw0;
import org.telegram.ui.yy;
import org.telegram.ui.z60;
import yh.n4;
import zh.n5;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final /* synthetic */ class d1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object n;

    public /* synthetic */ d1(int i10, ArrayList arrayList, ArrayList arrayList2, Integer num, MediaController.AlbumEntry albumEntry, MediaController.AlbumEntry albumEntry2, MediaController.AlbumEntry albumEntry3) {
        this.a = 1;
        this.b = i10;
        this.c = arrayList;
        this.d = arrayList2;
        this.e = num;
        this.f = albumEntry;
        this.h = albumEntry2;
        this.n = albumEntry3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:118:0x03d1, code lost:
    
        if (r4.chat.has_geo != false) goto L111;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        d20 d20Var;
        ap0 ap0Var;
        c6 c6Var;
        zc a02;
        int i10;
        int i11;
        String h;
        JSONObject jSONObject;
        TL_wallet.tonConnectSession tonconnectsession;
        JSONObject put;
        int i12 = this.a;
        int i13 = this.b;
        boolean z10 = false;
        z10 = false;
        Object obj = this.n;
        Object obj2 = this.h;
        Object obj3 = this.f;
        Object obj4 = this.e;
        Object obj5 = this.c;
        Object obj6 = this.d;
        switch (i12) {
            case 0:
                ArrayList arrayList = (ArrayList) obj5;
                a0.h hVar = (a0.h) obj4;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj3;
                TLObject tLObject = (TLObject) obj2;
                MessagesController messagesController = (MessagesController) obj;
                j1 j1Var = ((e1) obj6).h;
                if (j1Var.j0 != 0 && i13 == j1Var.i0 && j1Var.y != null && j1Var.x != null) {
                    j1Var.Y(hVar, arrayList, false);
                    if (tL_error == null) {
                        TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject;
                        messagesController.putUsers(tL_channels_channelParticipants.users, false);
                        messagesController.putChats(tL_channels_channelParticipants.chats, false);
                        j1Var.x.isEmpty();
                        if (!tL_channels_channelParticipants.participants.isEmpty()) {
                            long clientUserId = UserConfig.getInstance(j1Var.f).getClientUserId();
                            for (int i14 = 0; i14 < tL_channels_channelParticipants.participants.size(); i14++) {
                                long peerId = MessageObject.getPeerId(tL_channels_channelParticipants.participants.get(i14).peer);
                                if (j1Var.y.h(peerId) < 0 && ((peerId != 0 || j1Var.y.h(clientUserId) < 0) && (j1Var.k0 || (peerId != clientUserId && peerId != 0)))) {
                                    if (peerId >= 0) {
                                        TLRPC.User user = messagesController.getUser(Long.valueOf(peerId));
                                        if (user == null) {
                                            break;
                                        } else {
                                            j1Var.x.add(user);
                                        }
                                    } else {
                                        TLRPC.Chat chat = messagesController.getChat(Long.valueOf(-peerId));
                                        if (chat == null) {
                                            break;
                                        } else {
                                            j1Var.x.add(chat);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    j1Var.l();
                    j1Var.V.a(!j1Var.x.isEmpty());
                }
                j1Var.j0 = 0;
                break;
            case 1:
                MediaController.lambda$broadcastNewPhotos$59(this.b, (ArrayList) obj5, (ArrayList) obj6, (Integer) obj4, (MediaController.AlbumEntry) obj3, (MediaController.AlbumEntry) obj2, (MediaController.AlbumEntry) obj);
                break;
            case 2:
                ((SendMessagesHelper) obj6).lambda$performSendDelayedMessage$56((TLObject) obj2, (TLRPC.InputFile) obj5, (TLRPC.InputMedia) obj4, (SendMessagesHelper.DelayedMessage) obj3, this.b, (String) obj);
                break;
            case 3:
                k4 k4Var = (k4) obj6;
                pf.c cVar = (pf.c) obj5;
                TLObject tLObject2 = (TLObject) obj2;
                String str = (String) obj4;
                org.telegram.ui.g0 g0Var = (org.telegram.ui.g0) obj3;
                TLRPC.TL_messages_getWebPage tL_messages_getWebPage = (TLRPC.TL_messages_getWebPage) obj;
                if (k4Var.F0 != 0 && i13 == k4Var.H0) {
                    if (cVar != null) {
                        cVar.b();
                    }
                    k4Var.F0 = 0;
                    k4Var.b0(false);
                    if (k4Var.V) {
                        if (tLObject2 instanceof TLRPC.TL_messages_webPage) {
                            TLRPC.TL_messages_webPage tL_messages_webPage = (TLRPC.TL_messages_webPage) tLObject2;
                            MessagesController.getInstance(k4Var.X).putUsers(tL_messages_webPage.users, false);
                            MessagesController.getInstance(k4Var.X).putChats(tL_messages_webPage.chats, false);
                            TLRPC.WebPage webPage = tL_messages_webPage.webpage;
                            if (webPage == null || !(webPage.cached_page instanceof TL_iv.TL_page)) {
                                if (!((Boolean) g0Var.run()).booleanValue()) {
                                    if (MessagesController.getInstance(k4Var.X).isWebBrowserOpenInApp(tL_messages_getWebPage.url)) {
                                        k4Var.g(1, tL_messages_getWebPage.url);
                                        break;
                                    } else {
                                        pf.d.r(k4Var.L, tL_messages_getWebPage.url);
                                        break;
                                    }
                                }
                            } else {
                                k4Var.h(webPage, str, 1);
                                break;
                            }
                        } else {
                            if (tLObject2 instanceof TLRPC.TL_webPage) {
                                TLRPC.TL_webPage tL_webPage = (TLRPC.TL_webPage) tLObject2;
                                if (tL_webPage.cached_page instanceof TL_iv.TL_page) {
                                    k4Var.h(tL_webPage, str, 1);
                                    break;
                                }
                            }
                            if (!((Boolean) g0Var.run()).booleanValue()) {
                                if (MessagesController.getInstance(k4Var.X).isWebBrowserOpenInApp(tL_messages_getWebPage.url)) {
                                    k4Var.g(1, tL_messages_getWebPage.url);
                                    break;
                                } else {
                                    pf.d.r(k4Var.L, tL_messages_getWebPage.url);
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
                int i15 = this.b;
                ConnectionsManager.getInstance(i15).sendRequest(togglegroupcallsettings, new x8(i15, inputGroupCall, (String[]) obj5, (FrameLayout) obj4, (da0) obj3, (e3) obj2, (c6) obj));
                break;
            case 5:
                TLObject tLObject3 = (TLObject) obj2;
                org.telegram.ui.ActionBar.a2 a2Var = (org.telegram.ui.ActionBar.a2) obj6;
                Context context = (Context) obj5;
                TL_phone.exportGroupCallInvite exportgroupcallinvite = (TL_phone.exportGroupCallInvite) obj4;
                c6 c6Var2 = (c6) obj3;
                z60 z60Var = (z60) obj;
                if (tLObject3 instanceof TL_phone.exportedGroupCallInvite) {
                    a2Var.dismiss();
                    n9.o0(context, this.b, exportgroupcallinvite.call, ((TL_phone.exportedGroupCallInvite) tLObject3).link, c6Var2, true, true);
                } else {
                    a2Var.dismiss();
                }
                AndroidUtilities.runOnUIThread(z60Var);
                break;
            case 6:
                TLObject tLObject4 = (TLObject) obj2;
                ArrayList arrayList2 = (ArrayList) obj5;
                AtomicInteger atomicInteger = (AtomicInteger) obj6;
                ArrayList arrayList3 = (ArrayList) obj4;
                br brVar = (br) obj;
                if (((TLRPC.TL_error) obj3) == null && (tLObject4 instanceof TLRPC.TL_channels_channelParticipants)) {
                    arrayList2.set(i13, (TLRPC.TL_channels_channelParticipants) tLObject4);
                }
                atomicInteger.getAndIncrement();
                if (atomicInteger.get() == arrayList3.size()) {
                    brVar.run();
                    break;
                }
                break;
            case 7:
                TLObject tLObject5 = (TLObject) obj2;
                TLRPC.Document document = (TLRPC.Document) obj5;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj3;
                TLRPC.TL_stickers_addStickerToSet tL_stickers_addStickerToSet = (TLRPC.TL_stickers_addStickerToSet) obj;
                ((org.telegram.ui.ActionBar.a2) obj6).dismiss();
                if (tLObject5 instanceof TLRPC.TL_messages_stickerSet) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject5;
                    MediaDataController.getInstance(i13).putStickerSet(tL_messages_stickerSet);
                    if (!MediaDataController.getInstance(i13).isStickerPackInstalled(tL_messages_stickerSet.set.id)) {
                        MediaDataController.getInstance(i13).toggleStickerSet(null, tLObject5, 2, null, false, false);
                    }
                    AndroidUtilities.runOnUIThread(new g90(23, tLObject5, document), 250L);
                    break;
                } else if (tL_error2 != null) {
                    if (FileRefController.isFileRefError(tL_error2.text)) {
                        FileRefController.getInstance(i13).requestReference(obj4, tL_stickers_addStickerToSet);
                        break;
                    } else {
                        zc.d0(tL_error2);
                        break;
                    }
                }
                break;
            case 8:
                p60.a((org.telegram.ui.ActionBar.a2) obj6, (pf.c) obj5, (TLObject) obj2, this.b, (Context) obj4, (TLRPC.TL_inputGroupCallSlug) obj, (TLRPC.TL_error) obj3);
                break;
            case 9:
                LaunchActivity launchActivity = (LaunchActivity) obj6;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj3;
                TLObject tLObject6 = (TLObject) obj2;
                org.telegram.ui.ActionBar.a2 a2Var2 = (org.telegram.ui.ActionBar.a2) obj5;
                d20 d20Var2 = (d20) obj4;
                String str2 = (String) obj;
                ArrayList arrayList4 = launchActivity.d0;
                if (!launchActivity.isFinishing()) {
                    if (tL_error3 != null || launchActivity.q0 == null) {
                        d20Var = d20Var2;
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(launchActivity);
                        String string = LocaleController.getString(R.string.AppName);
                        org.telegram.ui.ActionBar.a2 a2Var3 = alertDialog$Builder.a;
                        a2Var3.R = string;
                        if (tL_error3.text.startsWith("FLOOD_WAIT")) {
                            a2Var3.T = LocaleController.getString(R.string.FloodWait);
                        } else if (tL_error3.text.startsWith("INVITE_HASH_EXPIRED")) {
                            a2Var3.R = LocaleController.getString(R.string.ExpiredLink);
                            a2Var3.T = LocaleController.getString(R.string.InviteExpired);
                        } else {
                            a2Var3.T = LocaleController.getString(R.string.JoinToGroupErrorNotExist);
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
                            MessagesController.getInstance(i13).putChat(chatInvite.chat, false);
                            ArrayList arrayList5 = new ArrayList();
                            arrayList5.add(chatInvite.chat);
                            int i16 = 1;
                            MessagesStorage.getInstance(i13).putUsersAndChats(null, arrayList5, false, true);
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", chatInvite.chat.id);
                            if (arrayList4.isEmpty() || MessagesController.getInstance(i13).checkCanOpenChat(bundle, (m2) i2.d.h(1, arrayList4))) {
                                boolean[] zArr = new boolean[1];
                                a2Var2.setOnCancelListener(new jh(i16, zArr));
                                if (!chatInvite.chat.forum) {
                                    MessagesController.getInstance(i13).ensureMessagesLoaded(-chatInvite.chat.id, 0, new db0(launchActivity, d20Var2, zArr, bundle, chatInvite));
                                    break;
                                } else {
                                    Bundle bundle2 = new Bundle();
                                    bundle2.putLong("chat_id", chatInvite.chat.id);
                                    launchActivity.p0(kg1.F0(launchActivity, bundle2));
                                }
                            }
                            d20Var = d20Var2;
                        }
                        d20Var = d20Var2;
                        TL_stars.TL_starsSubscriptionPricing tL_starsSubscriptionPricing = chatInvite.subscription_pricing;
                        if (tL_starsSubscriptionPricing == null || chatInvite.can_refulfill_subscription) {
                            m2 m2Var = (m2) i2.d.h(1, arrayList4);
                            m2Var.showDialog(new f90(launchActivity, chatInvite, str2, m2Var, m2Var instanceof fo ? ((fo) m2Var).ea : null));
                        } else {
                            long j10 = tL_starsSubscriptionPricing.amount;
                            MessagesController.getInstance(i13).putChat(chatInvite.chat, false);
                            n5.y(launchActivity.O, false).j0(str2, chatInvite, new gi.o0(launchActivity, j10, 2));
                        }
                    }
                    try {
                        d20Var.run();
                        break;
                    } catch (Exception e) {
                        FileLog.e(e);
                        return;
                    }
                }
                break;
            case 10:
                LaunchActivity launchActivity2 = (LaunchActivity) obj6;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) obj3;
                TLObject tLObject7 = (TLObject) obj2;
                TLRPC.TL_inputInvoiceSlug tL_inputInvoiceSlug = (TLRPC.TL_inputInvoiceSlug) obj5;
                d20 d20Var3 = (d20) obj4;
                String str3 = (String) obj;
                ArrayList arrayList6 = launchActivity2.d0;
                if (tL_error4 != null) {
                    if ("SUBSCRIPTION_ALREADY_ACTIVE".equalsIgnoreCase(tL_error4.text)) {
                        a02 = zc.a0((m2) i2.d.h(1, arrayList6));
                        i10 = R.string.PaymentInvoiceSubscriptionLinkAlreadyPaid;
                        c6Var = null;
                    } else {
                        c6Var = null;
                        a02 = zc.a0((m2) i2.d.h(1, arrayList6));
                        i10 = R.string.PaymentInvoiceLinkInvalid;
                    }
                    sk.q(i10, a02, c6Var);
                } else if (!launchActivity2.isFinishing()) {
                    if (tLObject7 instanceof TLRPC.TL_payments_paymentFormStars) {
                        n4 n4Var = launchActivity2.Y0;
                        launchActivity2.Y0 = null;
                        n5.y(launchActivity2.O, false).Y(null, tL_inputInvoiceSlug, (TLRPC.TL_payments_paymentFormStars) tLObject7, new a90(d20Var3, 1), new o90(n4Var, z10 ? 1 : 0));
                        break;
                    } else {
                        if (tLObject7 instanceof TLRPC.PaymentForm) {
                            TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject7;
                            MessagesController.getInstance(i13).putUsers(paymentForm.users, false);
                            ap0Var = new ap0(paymentForm, null, str3, launchActivity2.O().getLastFragment());
                        } else {
                            ap0Var = tLObject7 instanceof TLRPC.PaymentReceipt ? new ap0((TLRPC.PaymentReceipt) tLObject7) : null;
                        }
                        if (ap0Var != null) {
                            n4 n4Var2 = launchActivity2.Y0;
                            if (n4Var2 != null) {
                                launchActivity2.Y0 = null;
                                ap0Var.Z0 = new tf(9, n4Var2);
                            }
                            launchActivity2.p0(ap0Var);
                        }
                    }
                }
                try {
                    d20Var3.run();
                    break;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
            case 11:
                LaunchActivity launchActivity3 = (LaunchActivity) obj6;
                yy yyVar = (yy) obj5;
                m2 m2Var2 = (m2) obj4;
                TLRPC.User user2 = (TLRPC.User) obj3;
                String str4 = (String) obj;
                Pattern pattern = LaunchActivity.B1;
                if (((TLObject) obj2) instanceof TLRPC.TL_boolTrue) {
                    MediaDataController.getInstance(i13).loadAttachMenuBots(false, true, new l90(launchActivity3, yyVar, m2Var2, user2, str4, 1));
                    break;
                }
                break;
            case 12:
                jg0 jg0Var = (jg0) obj6;
                String str5 = (String) obj5;
                c5.i iVar = (c5.i) obj4;
                List list = (List) obj3;
                String str6 = (String) obj2;
                String str7 = (String) obj;
                ah0 ah0Var = jg0Var.v;
                StringBuilder v = a1.g.v("LoginBilling queried \"", str5, "\" product: ");
                v.append(BillingController.getResponseCodeString(iVar.a));
                FileLog.d(v.toString());
                if (iVar.a != 0) {
                    jg0Var.e = "BILLING_" + BillingController.getResponseCodeString(iVar.a);
                    new zc(ah0Var.Z, null).H(R.raw.error, LocaleController.formatString(R.string.UnknownErrorCode, BillingController.getResponseCodeString(iVar.a)));
                    break;
                } else if (list != null && !list.isEmpty()) {
                    c5.p pVar = (c5.p) list.get(0);
                    c5.l a2 = pVar.a();
                    TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode = new TLRPC.TL_inputStorePaymentAuthCode();
                    tL_inputStorePaymentAuthCode.currency = a2.c;
                    tL_inputStorePaymentAuthCode.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_inputStorePaymentAuthCode.currency)) * (a2.b / Math.pow(10.0d, 6.0d)));
                    tL_inputStorePaymentAuthCode.phone_code_hash = TextUtils.isEmpty(str6) ? "" : str6;
                    tL_inputStorePaymentAuthCode.phone_number = str7;
                    int i17 = this.b;
                    tL_inputStorePaymentAuthCode.premium_days = i17;
                    StringBuilder v10 = a1.g.v("LoginBilling found \"", str5, "\" product, with currency=");
                    v10.append(tL_inputStorePaymentAuthCode.currency);
                    v10.append(" amount=");
                    v10.append(tL_inputStorePaymentAuthCode.amount);
                    v10.append("; phone=");
                    v10.append(str7);
                    v10.append(", phone_code_hash=");
                    v10.append(str6);
                    FileLog.d(v10.toString());
                    TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore = new TLRPC.TL_payments_canPurchaseStore();
                    tL_payments_canPurchaseStore.purpose = tL_inputStorePaymentAuthCode;
                    i11 = ((m2) ah0Var).currentAccount;
                    ConnectionsManager.getInstance(i11).sendRequest(tL_payments_canPurchaseStore, new x8(jg0Var, a2, i17, pVar, tL_inputStorePaymentAuthCode, str5, tL_payments_canPurchaseStore, 3), 10);
                    break;
                } else {
                    jg0Var.e = "PRODUCT_NOT_FOUND";
                    new zc(ah0Var.Z, null).H(R.raw.error, LocaleController.formatString(R.string.UnknownErrorCode, "PRODUCT_NOT_FOUND"));
                    break;
                }
            case 13:
                ProfileActivity profileActivity = (ProfileActivity) obj6;
                View view = (View) obj5;
                String str8 = (String) obj4;
                boolean[] zArr2 = (boolean[]) obj3;
                String[] strArr = (String[]) obj2;
                String str9 = (String) obj;
                if (profileActivity.getParentActivity() != null) {
                    l80 H = l80.H(profileActivity, view);
                    H.W(profileActivity.a.V0(view, false));
                    H.w = false;
                    H.c(R.drawable.msg_copy, LocaleController.getString(R.string.Copy), new c90(profileActivity, str8, i13, 7), false);
                    H.l(R.drawable.msg_translate, LocaleController.getString(R.string.TranslateMessage), new yw0(profileActivity, strArr, str9, str8, 6), zArr2[0]);
                    H.Z();
                    break;
                }
                break;
            case 14:
                org.telegram.ui.Wallet.e2 e2Var = (org.telegram.ui.Wallet.e2) obj6;
                org.telegram.ui.Wallet.a2 a2Var4 = (org.telegram.ui.Wallet.a2) obj5;
                String str10 = (String) obj3;
                org.telegram.ui.Wallet.h0 h0Var = (org.telegram.ui.Wallet.h0) obj2;
                Utilities.Callback callback = (Utilities.Callback) obj;
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    String str11 = a2Var4.d;
                    tonconnectsession = a2Var4.a;
                    JSONObject put2 = jSONObject2.put("id", str11);
                    if (i13 < 0) {
                        put2.put("result", obj4);
                    } else {
                        if (str10 == null) {
                            str10 = "Could not complete request";
                        }
                        put2.put("error", new JSONObject().put("code", i13).put("message", str10));
                    }
                    JSONObject put3 = new JSONObject().put("body", WalletEngine2.tonConnectCrypto(h0Var, tonconnectsession, a2Var4.h, a2Var4.g, new JSONObject().put("encrypt", put2)).getString("body")).put("traceId", a2Var4.i);
                    if (i13 < 0 && "disconnect".equals(a2Var4.e)) {
                        z10 = true;
                    }
                    put = put3.put("disconnect", z10);
                } catch (Exception e10) {
                    h = org.telegram.ui.Wallet.e2.h("encrypt response", e10);
                    jSONObject = null;
                }
                if (!MessagesController.getMainSettings(e2Var.a).edit().putString(org.telegram.ui.Wallet.e2.j(tonconnectsession.id, a2Var4.b), put.toString()).commit()) {
                    throw new IllegalStateException("Could not save TON Connect response");
                }
                jSONObject = put;
                h = null;
                AndroidUtilities.runOnUIThread(new l90(e2Var, jSONObject, callback, h, a2Var4, 26));
                break;
            case 15:
                org.telegram.ui.web.c1 c1Var = (org.telegram.ui.web.c1) obj6;
                String str12 = (String) obj5;
                TLObject tLObject8 = (TLObject) obj2;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) obj3;
                org.telegram.ui.web.z0 z0Var = (org.telegram.ui.web.z0) obj4;
                bi.n9 n9Var = (bi.n9) obj;
                c1Var.getClass();
                try {
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put("req_id", str12);
                    if (tLObject8 instanceof TLRPC.TL_dataJSON) {
                        jSONObject3.put("result", new JSONTokener(((TLRPC.TL_dataJSON) tLObject8).data).nextValue());
                    } else if (tL_error5 != null) {
                        jSONObject3.put("error", tL_error5.text);
                    }
                    org.telegram.ui.web.c1.w(i13, z0Var, n9Var, "custom_method_invoked", jSONObject3);
                    break;
                } catch (Exception e11) {
                    FileLog.e(e11);
                    c1Var.Y(null);
                    return;
                }
            default:
                StringBuilder sb2 = new StringBuilder();
                a1.g.A(sb2, MessagesController.getInstance(i13).linkPrefix, "/", (String) obj5, "/c/");
                sb2.append(((TL_stars.TL_starGiftCollection) obj4).collection_id);
                String sb3 = sb2.toString();
                new yh.x1((ns0) obj6, (Context) obj3, sb3, sb3, (c6) obj2, (m2) obj).show();
                break;
        }
    }

    public /* synthetic */ d1(Object obj, int i10, Serializable serializable, Object obj2, Object obj3, Object obj4, Object obj5, int i11) {
        this.a = i11;
        this.d = obj;
        this.b = i10;
        this.c = serializable;
        this.e = obj2;
        this.f = obj3;
        this.h = obj4;
        this.n = obj5;
    }

    public /* synthetic */ d1(SendMessagesHelper sendMessagesHelper, TLObject tLObject, TLRPC.InputFile inputFile, TLRPC.InputMedia inputMedia, SendMessagesHelper.DelayedMessage delayedMessage, int i10, String str) {
        this.a = 2;
        this.d = sendMessagesHelper;
        this.h = tLObject;
        this.c = inputFile;
        this.e = inputMedia;
        this.f = delayedMessage;
        this.b = i10;
        this.n = str;
    }

    public /* synthetic */ d1(TLObject tLObject, org.telegram.ui.ActionBar.a2 a2Var, Context context, int i10, TL_phone.exportGroupCallInvite exportgroupcallinvite, c6 c6Var, z60 z60Var) {
        this.a = 5;
        this.h = tLObject;
        this.d = a2Var;
        this.c = context;
        this.b = i10;
        this.e = exportgroupcallinvite;
        this.f = c6Var;
        this.n = z60Var;
    }

    public /* synthetic */ d1(TLRPC.TL_error tL_error, TLObject tLObject, ArrayList arrayList, int i10, AtomicInteger atomicInteger, ArrayList arrayList2, br brVar) {
        this.a = 6;
        this.f = tL_error;
        this.h = tLObject;
        this.c = arrayList;
        this.b = i10;
        this.d = atomicInteger;
        this.e = arrayList2;
        this.n = brVar;
    }

    public /* synthetic */ d1(org.telegram.ui.ActionBar.a2 a2Var, TLObject tLObject, int i10, TLRPC.Document document, TLRPC.TL_error tL_error, Object obj, TLRPC.TL_stickers_addStickerToSet tL_stickers_addStickerToSet) {
        this.a = 7;
        this.d = a2Var;
        this.h = tLObject;
        this.b = i10;
        this.c = document;
        this.f = tL_error;
        this.e = obj;
        this.n = tL_stickers_addStickerToSet;
    }

    public /* synthetic */ d1(org.telegram.ui.ActionBar.a2 a2Var, pf.c cVar, TLObject tLObject, int i10, Context context, TLRPC.TL_inputGroupCallSlug tL_inputGroupCallSlug, TLRPC.TL_error tL_error) {
        this.a = 8;
        this.d = a2Var;
        this.c = cVar;
        this.h = tLObject;
        this.b = i10;
        this.e = context;
        this.n = tL_inputGroupCallSlug;
        this.f = tL_error;
    }

    public /* synthetic */ d1(k4 k4Var, int i10, pf.c cVar, TLObject tLObject, String str, org.telegram.ui.g0 g0Var, TLRPC.TL_messages_getWebPage tL_messages_getWebPage) {
        this.a = 3;
        this.d = k4Var;
        this.b = i10;
        this.c = cVar;
        this.h = tLObject;
        this.e = str;
        this.f = g0Var;
        this.n = tL_messages_getWebPage;
    }

    public /* synthetic */ d1(LaunchActivity launchActivity, TLObject tLObject, int i10, yy yyVar, m2 m2Var, TLRPC.User user, String str) {
        this.a = 11;
        this.d = launchActivity;
        this.h = tLObject;
        this.b = i10;
        this.c = yyVar;
        this.e = m2Var;
        this.f = user;
        this.n = str;
    }

    public /* synthetic */ d1(LaunchActivity launchActivity, TLRPC.TL_error tL_error, TLObject tLObject, int i10, org.telegram.ui.ActionBar.a2 a2Var, d20 d20Var, String str) {
        this.a = 9;
        this.d = launchActivity;
        this.f = tL_error;
        this.h = tLObject;
        this.b = i10;
        this.c = a2Var;
        this.e = d20Var;
        this.n = str;
    }

    public /* synthetic */ d1(LaunchActivity launchActivity, TLRPC.TL_error tL_error, TLObject tLObject, TLRPC.TL_inputInvoiceSlug tL_inputInvoiceSlug, d20 d20Var, int i10, String str) {
        this.a = 10;
        this.d = launchActivity;
        this.f = tL_error;
        this.h = tLObject;
        this.c = tL_inputInvoiceSlug;
        this.e = d20Var;
        this.b = i10;
        this.n = str;
    }

    public /* synthetic */ d1(jg0 jg0Var, String str, c5.i iVar, List list, String str2, String str3, int i10) {
        this.a = 12;
        this.d = jg0Var;
        this.c = str;
        this.e = iVar;
        this.f = list;
        this.h = str2;
        this.n = str3;
        this.b = i10;
    }

    public /* synthetic */ d1(ProfileActivity profileActivity, View view, String str, int i10, boolean[] zArr, String[] strArr, String str2) {
        this.a = 13;
        this.d = profileActivity;
        this.c = view;
        this.e = str;
        this.b = i10;
        this.f = zArr;
        this.h = strArr;
        this.n = str2;
    }

    public /* synthetic */ d1(org.telegram.ui.Wallet.e2 e2Var, org.telegram.ui.Wallet.a2 a2Var, int i10, Object obj, String str, org.telegram.ui.Wallet.h0 h0Var, Utilities.Callback callback) {
        this.a = 14;
        this.d = e2Var;
        this.c = a2Var;
        this.b = i10;
        this.e = obj;
        this.f = str;
        this.h = h0Var;
        this.n = callback;
    }

    public /* synthetic */ d1(org.telegram.ui.web.c1 c1Var, String str, TLObject tLObject, TLRPC.TL_error tL_error, int i10, org.telegram.ui.web.z0 z0Var, bi.n9 n9Var) {
        this.a = 15;
        this.d = c1Var;
        this.c = str;
        this.h = tLObject;
        this.f = tL_error;
        this.b = i10;
        this.e = z0Var;
        this.n = n9Var;
    }
}
