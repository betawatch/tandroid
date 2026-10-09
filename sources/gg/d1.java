package gg;

import ai.ea;
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
import org.telegram.messenger.bi;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.ad;
import org.telegram.ui.Components.ci0;
import org.telegram.ui.Components.ea0;
import org.telegram.ui.Components.i90;
import org.telegram.ui.Components.p80;
import org.telegram.ui.Components.rs0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.Wallet.WalletEngine2;
import org.telegram.ui.bi0;
import org.telegram.ui.fg0;
import org.telegram.ui.fg1;
import org.telegram.ui.fh;
import org.telegram.ui.g90;
import org.telegram.ui.i4;
import org.telegram.ui.i60;
import org.telegram.ui.j9;
import org.telegram.ui.j90;
import org.telegram.ui.m70;
import org.telegram.ui.of;
import org.telegram.ui.rr0;
import org.telegram.ui.s60;
import org.telegram.ui.t8;
import org.telegram.ui.ty;
import org.telegram.ui.vo0;
import org.telegram.ui.vq;
import org.telegram.ui.w80;
import org.telegram.ui.wg0;
import org.telegram.ui.za0;
import org.telegram.ui.zn;
import xh.p4;
import yh.m5;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
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

    /* JADX WARN: Code restructure failed: missing block: B:118:0x03d2, code lost:
    
        if (r4.chat.has_geo != false) goto L111;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        m70 m70Var;
        vo0 vo0Var;
        e6 e6Var;
        ad a02;
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
                a0.i iVar = (a0.i) obj4;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj3;
                TLObject tLObject = (TLObject) obj2;
                MessagesController messagesController = (MessagesController) obj;
                j1 j1Var = ((e1) obj6).h;
                if (j1Var.j0 != 0 && i13 == j1Var.i0 && j1Var.y != null && j1Var.x != null) {
                    j1Var.Y(iVar, arrayList, false);
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
                MediaController.lambda$broadcastNewPhotos$58(this.b, (ArrayList) obj5, (ArrayList) obj6, (Integer) obj4, (MediaController.AlbumEntry) obj3, (MediaController.AlbumEntry) obj2, (MediaController.AlbumEntry) obj);
                break;
            case 2:
                ((SendMessagesHelper) obj6).lambda$performSendDelayedMessage$56((TLObject) obj2, (TLRPC.InputFile) obj5, (TLRPC.InputMedia) obj4, (SendMessagesHelper.DelayedMessage) obj3, this.b, (String) obj);
                break;
            case 3:
                i4 i4Var = (i4) obj6;
                of.e eVar = (of.e) obj5;
                TLObject tLObject2 = (TLObject) obj2;
                String str = (String) obj4;
                org.telegram.ui.g0 g0Var = (org.telegram.ui.g0) obj3;
                TLRPC.TL_messages_getWebPage tL_messages_getWebPage = (TLRPC.TL_messages_getWebPage) obj;
                if (i4Var.F0 != 0 && i13 == i4Var.H0) {
                    if (eVar != null) {
                        eVar.b();
                    }
                    i4Var.F0 = 0;
                    i4Var.b0(false);
                    if (i4Var.V) {
                        if (tLObject2 instanceof TLRPC.TL_messages_webPage) {
                            TLRPC.TL_messages_webPage tL_messages_webPage = (TLRPC.TL_messages_webPage) tLObject2;
                            MessagesController.getInstance(i4Var.X).putUsers(tL_messages_webPage.users, false);
                            MessagesController.getInstance(i4Var.X).putChats(tL_messages_webPage.chats, false);
                            TLRPC.WebPage webPage = tL_messages_webPage.webpage;
                            if (webPage == null || !(webPage.cached_page instanceof TL_iv.TL_page)) {
                                if (!((Boolean) g0Var.run()).booleanValue()) {
                                    if (MessagesController.getInstance(i4Var.X).isWebBrowserOpenInApp(tL_messages_getWebPage.url)) {
                                        i4Var.g(1, tL_messages_getWebPage.url);
                                        break;
                                    } else {
                                        of.f.s(i4Var.L, tL_messages_getWebPage.url);
                                        break;
                                    }
                                }
                            } else {
                                i4Var.h(webPage, str, 1);
                                break;
                            }
                        } else {
                            if (tLObject2 instanceof TLRPC.TL_webPage) {
                                TLRPC.TL_webPage tL_webPage = (TLRPC.TL_webPage) tLObject2;
                                if (tL_webPage.cached_page instanceof TL_iv.TL_page) {
                                    i4Var.h(tL_webPage, str, 1);
                                    break;
                                }
                            }
                            if (!((Boolean) g0Var.run()).booleanValue()) {
                                if (MessagesController.getInstance(i4Var.X).isWebBrowserOpenInApp(tL_messages_getWebPage.url)) {
                                    i4Var.g(1, tL_messages_getWebPage.url);
                                    break;
                                } else {
                                    of.f.s(i4Var.L, tL_messages_getWebPage.url);
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
                ConnectionsManager.getInstance(i15).sendRequest(togglegroupcallsettings, new t8(i15, inputGroupCall, (String[]) obj5, (FrameLayout) obj4, (ea0) obj3, (f3) obj2, (e6) obj));
                break;
            case 5:
                TLObject tLObject3 = (TLObject) obj2;
                org.telegram.ui.ActionBar.b2 b2Var = (org.telegram.ui.ActionBar.b2) obj6;
                Context context = (Context) obj5;
                TL_phone.exportGroupCallInvite exportgroupcallinvite = (TL_phone.exportGroupCallInvite) obj4;
                e6 e6Var2 = (e6) obj3;
                s60 s60Var = (s60) obj;
                if (tLObject3 instanceof TL_phone.exportedGroupCallInvite) {
                    b2Var.dismiss();
                    j9.o0(context, this.b, exportgroupcallinvite.call, ((TL_phone.exportedGroupCallInvite) tLObject3).link, e6Var2, true, true);
                } else {
                    b2Var.dismiss();
                }
                AndroidUtilities.runOnUIThread(s60Var);
                break;
            case 6:
                TLObject tLObject4 = (TLObject) obj2;
                ArrayList arrayList2 = (ArrayList) obj5;
                AtomicInteger atomicInteger = (AtomicInteger) obj6;
                ArrayList arrayList3 = (ArrayList) obj4;
                vq vqVar = (vq) obj;
                if (((TLRPC.TL_error) obj3) == null && (tLObject4 instanceof TLRPC.TL_channels_channelParticipants)) {
                    arrayList2.set(i13, (TLRPC.TL_channels_channelParticipants) tLObject4);
                }
                atomicInteger.getAndIncrement();
                if (atomicInteger.get() == arrayList3.size()) {
                    vqVar.run();
                    break;
                }
                break;
            case 7:
                TLObject tLObject5 = (TLObject) obj2;
                TLRPC.Document document = (TLRPC.Document) obj5;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj3;
                TLRPC.TL_stickers_addStickerToSet tL_stickers_addStickerToSet = (TLRPC.TL_stickers_addStickerToSet) obj;
                ((org.telegram.ui.ActionBar.b2) obj6).dismiss();
                if (tLObject5 instanceof TLRPC.TL_messages_stickerSet) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject5;
                    MediaDataController.getInstance(i13).putStickerSet(tL_messages_stickerSet);
                    if (!MediaDataController.getInstance(i13).isStickerPackInstalled(tL_messages_stickerSet.set.id)) {
                        MediaDataController.getInstance(i13).toggleStickerSet(null, tLObject5, 2, null, false, false);
                    }
                    AndroidUtilities.runOnUIThread(new ci0(tLObject5, document), 250L);
                    break;
                } else if (tL_error2 != null) {
                    if (FileRefController.isFileRefError(tL_error2.text)) {
                        FileRefController.getInstance(i13).requestReference(obj4, tL_stickers_addStickerToSet);
                        break;
                    } else {
                        ad.d0(tL_error2);
                        break;
                    }
                }
                break;
            case 8:
                i60.a((org.telegram.ui.ActionBar.b2) obj6, (of.e) obj5, (TLObject) obj2, this.b, (Context) obj4, (TLRPC.TL_inputGroupCallSlug) obj, (TLRPC.TL_error) obj3);
                break;
            case 9:
                LaunchActivity launchActivity = (LaunchActivity) obj6;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj3;
                TLObject tLObject6 = (TLObject) obj2;
                org.telegram.ui.ActionBar.b2 b2Var2 = (org.telegram.ui.ActionBar.b2) obj5;
                m70 m70Var2 = (m70) obj4;
                String str2 = (String) obj;
                ArrayList arrayList4 = launchActivity.d0;
                if (!launchActivity.isFinishing()) {
                    if (tL_error3 != null || launchActivity.q0 == null) {
                        m70Var = m70Var2;
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(launchActivity);
                        String string = LocaleController.getString(R.string.AppName);
                        org.telegram.ui.ActionBar.b2 b2Var3 = alertDialog$Builder.a;
                        b2Var3.R = string;
                        if (tL_error3.text.startsWith("FLOOD_WAIT")) {
                            b2Var3.T = LocaleController.getString(R.string.FloodWait);
                        } else if (tL_error3.text.startsWith("INVITE_HASH_EXPIRED")) {
                            b2Var3.R = LocaleController.getString(R.string.ExpiredLink);
                            b2Var3.T = LocaleController.getString(R.string.InviteExpired);
                        } else {
                            b2Var3.T = LocaleController.getString(R.string.JoinToGroupErrorNotExist);
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
                            if (arrayList4.isEmpty() || MessagesController.getInstance(i13).checkCanOpenChat(bundle, (n2) hg.c.g(1, arrayList4))) {
                                boolean[] zArr = new boolean[1];
                                b2Var2.setOnCancelListener(new fh(i16, zArr));
                                if (!chatInvite.chat.forum) {
                                    MessagesController.getInstance(i13).ensureMessagesLoaded(-chatInvite.chat.id, 0, new za0(launchActivity, m70Var2, zArr, bundle, chatInvite));
                                    break;
                                } else {
                                    Bundle bundle2 = new Bundle();
                                    bundle2.putLong("chat_id", chatInvite.chat.id);
                                    launchActivity.p0(fg1.F0(launchActivity, bundle2));
                                }
                            }
                            m70Var = m70Var2;
                        }
                        m70Var = m70Var2;
                        TL_stars.TL_starsSubscriptionPricing tL_starsSubscriptionPricing = chatInvite.subscription_pricing;
                        if (tL_starsSubscriptionPricing == null || chatInvite.can_refulfill_subscription) {
                            n2 n2Var = (n2) hg.c.g(1, arrayList4);
                            n2Var.showDialog(new i90(launchActivity, chatInvite, str2, n2Var, n2Var instanceof zn ? ((zn) n2Var).ea : null));
                        } else {
                            long j3 = tL_starsSubscriptionPricing.amount;
                            MessagesController.getInstance(i13).putChat(chatInvite.chat, false);
                            m5.y(launchActivity.O, false).j0(str2, chatInvite, new fi.o0(launchActivity, j3, 2));
                        }
                    }
                    try {
                        m70Var.run();
                        break;
                    } catch (Exception e7) {
                        FileLog.e(e7);
                        return;
                    }
                }
                break;
            case 10:
                LaunchActivity launchActivity2 = (LaunchActivity) obj6;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) obj3;
                TLObject tLObject7 = (TLObject) obj2;
                TLRPC.TL_inputInvoiceSlug tL_inputInvoiceSlug = (TLRPC.TL_inputInvoiceSlug) obj5;
                m70 m70Var3 = (m70) obj4;
                String str3 = (String) obj;
                ArrayList arrayList6 = launchActivity2.d0;
                if (tL_error4 != null) {
                    if ("SUBSCRIPTION_ALREADY_ACTIVE".equalsIgnoreCase(tL_error4.text)) {
                        a02 = ad.a0((n2) hg.c.g(1, arrayList6));
                        i10 = R.string.PaymentInvoiceSubscriptionLinkAlreadyPaid;
                        e6Var = null;
                    } else {
                        e6Var = null;
                        a02 = ad.a0((n2) hg.c.g(1, arrayList6));
                        i10 = R.string.PaymentInvoiceLinkInvalid;
                    }
                    bi.q(i10, a02, e6Var);
                } else if (!launchActivity2.isFinishing()) {
                    if (tLObject7 instanceof TLRPC.TL_payments_paymentFormStars) {
                        p4 p4Var = launchActivity2.Y0;
                        launchActivity2.Y0 = null;
                        m5.y(launchActivity2.O, false).Y(null, tL_inputInvoiceSlug, (TLRPC.TL_payments_paymentFormStars) tLObject7, new w80(m70Var3, 1), new j90(p4Var, z10 ? 1 : 0));
                        break;
                    } else {
                        if (tLObject7 instanceof TLRPC.PaymentForm) {
                            TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject7;
                            MessagesController.getInstance(i13).putUsers(paymentForm.users, false);
                            vo0Var = new vo0(paymentForm, null, str3, launchActivity2.O().getLastFragment());
                        } else {
                            vo0Var = tLObject7 instanceof TLRPC.PaymentReceipt ? new vo0((TLRPC.PaymentReceipt) tLObject7) : null;
                        }
                        if (vo0Var != null) {
                            p4 p4Var2 = launchActivity2.Y0;
                            if (p4Var2 != null) {
                                launchActivity2.Y0 = null;
                                vo0Var.Z0 = new of(9, p4Var2);
                            }
                            launchActivity2.p0(vo0Var);
                        }
                    }
                }
                try {
                    m70Var3.run();
                    break;
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return;
                }
            case 11:
                LaunchActivity launchActivity3 = (LaunchActivity) obj6;
                ty tyVar = (ty) obj5;
                n2 n2Var2 = (n2) obj4;
                TLRPC.User user2 = (TLRPC.User) obj3;
                String str4 = (String) obj;
                Pattern pattern = LaunchActivity.B1;
                if (((TLObject) obj2) instanceof TLRPC.TL_boolTrue) {
                    MediaDataController.getInstance(i13).loadAttachMenuBots(false, true, new g90(launchActivity3, tyVar, n2Var2, user2, str4, 1));
                    break;
                }
                break;
            case 12:
                fg0 fg0Var = (fg0) obj6;
                String str5 = (String) obj5;
                c5.h hVar = (c5.h) obj4;
                List list = (List) obj3;
                String str6 = (String) obj2;
                String str7 = (String) obj;
                wg0 wg0Var = fg0Var.v;
                StringBuilder w10 = a1.g.w("LoginBilling queried \"", str5, "\" product: ");
                w10.append(BillingController.getResponseCodeString(hVar.a));
                FileLog.d(w10.toString());
                if (hVar.a != 0) {
                    fg0Var.e = "BILLING_" + BillingController.getResponseCodeString(hVar.a);
                    new ad(wg0Var.Z, null).H(R.raw.error, LocaleController.formatString(R.string.UnknownErrorCode, BillingController.getResponseCodeString(hVar.a)));
                    break;
                } else if (list != null && !list.isEmpty()) {
                    c5.o oVar = (c5.o) list.get(0);
                    c5.k a2 = oVar.a();
                    TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode = new TLRPC.TL_inputStorePaymentAuthCode();
                    tL_inputStorePaymentAuthCode.currency = a2.c;
                    tL_inputStorePaymentAuthCode.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_inputStorePaymentAuthCode.currency)) * (a2.b / Math.pow(10.0d, 6.0d)));
                    tL_inputStorePaymentAuthCode.phone_code_hash = TextUtils.isEmpty(str6) ? "" : str6;
                    tL_inputStorePaymentAuthCode.phone_number = str7;
                    int i17 = this.b;
                    tL_inputStorePaymentAuthCode.premium_days = i17;
                    StringBuilder w11 = a1.g.w("LoginBilling found \"", str5, "\" product, with currency=");
                    w11.append(tL_inputStorePaymentAuthCode.currency);
                    w11.append(" amount=");
                    w11.append(tL_inputStorePaymentAuthCode.amount);
                    w11.append("; phone=");
                    w11.append(str7);
                    w11.append(", phone_code_hash=");
                    w11.append(str6);
                    FileLog.d(w11.toString());
                    TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore = new TLRPC.TL_payments_canPurchaseStore();
                    tL_payments_canPurchaseStore.purpose = tL_inputStorePaymentAuthCode;
                    i11 = ((n2) wg0Var).currentAccount;
                    ConnectionsManager.getInstance(i11).sendRequest(tL_payments_canPurchaseStore, new t8(fg0Var, a2, i17, oVar, tL_inputStorePaymentAuthCode, str5, tL_payments_canPurchaseStore, 3), 10);
                    break;
                } else {
                    fg0Var.e = "PRODUCT_NOT_FOUND";
                    new ad(wg0Var.Z, null).H(R.raw.error, LocaleController.formatString(R.string.UnknownErrorCode, "PRODUCT_NOT_FOUND"));
                    break;
                }
                break;
            case 13:
                ProfileActivity profileActivity = (ProfileActivity) obj6;
                View view = (View) obj5;
                String str8 = (String) obj4;
                boolean[] zArr2 = (boolean[]) obj3;
                String[] strArr = (String[]) obj2;
                String str9 = (String) obj;
                if (profileActivity.getParentActivity() != null) {
                    p80 H = p80.H(profileActivity, view);
                    H.W(profileActivity.a.V0(view, false));
                    H.w = false;
                    H.c(R.drawable.msg_copy, LocaleController.getString(R.string.Copy), new bi0(profileActivity, str8, i13, 6), false);
                    H.l(R.drawable.msg_translate, LocaleController.getString(R.string.TranslateMessage), new rr0(profileActivity, strArr, str9, str8, 9), zArr2[0]);
                    H.Z();
                    break;
                }
                break;
            case 14:
                org.telegram.ui.Wallet.d2 d2Var = (org.telegram.ui.Wallet.d2) obj6;
                org.telegram.ui.Wallet.z1 z1Var = (org.telegram.ui.Wallet.z1) obj5;
                String str10 = (String) obj3;
                org.telegram.ui.Wallet.h0 h0Var = (org.telegram.ui.Wallet.h0) obj2;
                Utilities.Callback callback = (Utilities.Callback) obj;
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    String str11 = z1Var.d;
                    tonconnectsession = z1Var.a;
                    JSONObject put2 = jSONObject2.put("id", str11);
                    if (i13 < 0) {
                        put2.put("result", obj4);
                    } else {
                        if (str10 == null) {
                            str10 = "Could not complete request";
                        }
                        put2.put("error", new JSONObject().put("code", i13).put("message", str10));
                    }
                    JSONObject put3 = new JSONObject().put("body", WalletEngine2.tonConnectCrypto(h0Var, tonconnectsession, z1Var.h, z1Var.g, new JSONObject().put("encrypt", put2)).getString("body")).put("traceId", z1Var.i);
                    if (i13 < 0 && "disconnect".equals(z1Var.e)) {
                        z10 = true;
                    }
                    put = put3.put("disconnect", z10);
                } catch (Exception e11) {
                    h = org.telegram.ui.Wallet.d2.h("encrypt response", e11);
                    jSONObject = null;
                }
                if (!MessagesController.getMainSettings(d2Var.a).edit().putString(org.telegram.ui.Wallet.d2.j(tonconnectsession.id, z1Var.b), put.toString()).commit()) {
                    throw new IllegalStateException("Could not save TON Connect response");
                }
                jSONObject = put;
                h = null;
                AndroidUtilities.runOnUIThread(new g90(d2Var, jSONObject, callback, h, z1Var, 26));
                break;
            case 15:
                org.telegram.ui.web.b1 b1Var = (org.telegram.ui.web.b1) obj6;
                String str12 = (String) obj5;
                TLObject tLObject8 = (TLObject) obj2;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) obj3;
                org.telegram.ui.web.y0 y0Var = (org.telegram.ui.web.y0) obj4;
                ea eaVar = (ea) obj;
                b1Var.getClass();
                try {
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put("req_id", str12);
                    if (tLObject8 instanceof TLRPC.TL_dataJSON) {
                        jSONObject3.put("result", new JSONTokener(((TLRPC.TL_dataJSON) tLObject8).data).nextValue());
                    } else if (tL_error5 != null) {
                        jSONObject3.put("error", tL_error5.text);
                    }
                    org.telegram.ui.web.b1.w(i13, y0Var, eaVar, "custom_method_invoked", jSONObject3);
                    break;
                } catch (Exception e12) {
                    FileLog.e(e12);
                    b1Var.Y(null);
                    return;
                }
            default:
                StringBuilder sb2 = new StringBuilder();
                a1.g.A(sb2, MessagesController.getInstance(i13).linkPrefix, "/", (String) obj5, "/c/");
                sb2.append(((TL_stars.TL_starGiftCollection) obj4).collection_id);
                String sb3 = sb2.toString();
                new xh.z1((rs0) obj6, (Context) obj3, sb3, sb3, (e6) obj2, (n2) obj).show();
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

    public /* synthetic */ d1(TLObject tLObject, org.telegram.ui.ActionBar.b2 b2Var, Context context, int i10, TL_phone.exportGroupCallInvite exportgroupcallinvite, e6 e6Var, s60 s60Var) {
        this.a = 5;
        this.h = tLObject;
        this.d = b2Var;
        this.c = context;
        this.b = i10;
        this.e = exportgroupcallinvite;
        this.f = e6Var;
        this.n = s60Var;
    }

    public /* synthetic */ d1(TLRPC.TL_error tL_error, TLObject tLObject, ArrayList arrayList, int i10, AtomicInteger atomicInteger, ArrayList arrayList2, vq vqVar) {
        this.a = 6;
        this.f = tL_error;
        this.h = tLObject;
        this.c = arrayList;
        this.b = i10;
        this.d = atomicInteger;
        this.e = arrayList2;
        this.n = vqVar;
    }

    public /* synthetic */ d1(org.telegram.ui.ActionBar.b2 b2Var, of.e eVar, TLObject tLObject, int i10, Context context, TLRPC.TL_inputGroupCallSlug tL_inputGroupCallSlug, TLRPC.TL_error tL_error) {
        this.a = 8;
        this.d = b2Var;
        this.c = eVar;
        this.h = tLObject;
        this.b = i10;
        this.e = context;
        this.n = tL_inputGroupCallSlug;
        this.f = tL_error;
    }

    public /* synthetic */ d1(org.telegram.ui.ActionBar.b2 b2Var, TLObject tLObject, int i10, TLRPC.Document document, TLRPC.TL_error tL_error, Object obj, TLRPC.TL_stickers_addStickerToSet tL_stickers_addStickerToSet) {
        this.a = 7;
        this.d = b2Var;
        this.h = tLObject;
        this.b = i10;
        this.c = document;
        this.f = tL_error;
        this.e = obj;
        this.n = tL_stickers_addStickerToSet;
    }

    public /* synthetic */ d1(i4 i4Var, int i10, of.e eVar, TLObject tLObject, String str, org.telegram.ui.g0 g0Var, TLRPC.TL_messages_getWebPage tL_messages_getWebPage) {
        this.a = 3;
        this.d = i4Var;
        this.b = i10;
        this.c = eVar;
        this.h = tLObject;
        this.e = str;
        this.f = g0Var;
        this.n = tL_messages_getWebPage;
    }

    public /* synthetic */ d1(LaunchActivity launchActivity, TLObject tLObject, int i10, ty tyVar, n2 n2Var, TLRPC.User user, String str) {
        this.a = 11;
        this.d = launchActivity;
        this.h = tLObject;
        this.b = i10;
        this.c = tyVar;
        this.e = n2Var;
        this.f = user;
        this.n = str;
    }

    public /* synthetic */ d1(LaunchActivity launchActivity, TLRPC.TL_error tL_error, TLObject tLObject, int i10, org.telegram.ui.ActionBar.b2 b2Var, m70 m70Var, String str) {
        this.a = 9;
        this.d = launchActivity;
        this.f = tL_error;
        this.h = tLObject;
        this.b = i10;
        this.c = b2Var;
        this.e = m70Var;
        this.n = str;
    }

    public /* synthetic */ d1(LaunchActivity launchActivity, TLRPC.TL_error tL_error, TLObject tLObject, TLRPC.TL_inputInvoiceSlug tL_inputInvoiceSlug, m70 m70Var, int i10, String str) {
        this.a = 10;
        this.d = launchActivity;
        this.f = tL_error;
        this.h = tLObject;
        this.c = tL_inputInvoiceSlug;
        this.e = m70Var;
        this.b = i10;
        this.n = str;
    }

    public /* synthetic */ d1(fg0 fg0Var, String str, c5.h hVar, List list, String str2, String str3, int i10) {
        this.a = 12;
        this.d = fg0Var;
        this.c = str;
        this.e = hVar;
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

    public /* synthetic */ d1(org.telegram.ui.Wallet.d2 d2Var, org.telegram.ui.Wallet.z1 z1Var, int i10, Object obj, String str, org.telegram.ui.Wallet.h0 h0Var, Utilities.Callback callback) {
        this.a = 14;
        this.d = d2Var;
        this.c = z1Var;
        this.b = i10;
        this.e = obj;
        this.f = str;
        this.h = h0Var;
        this.n = callback;
    }

    public /* synthetic */ d1(org.telegram.ui.web.b1 b1Var, String str, TLObject tLObject, TLRPC.TL_error tL_error, int i10, org.telegram.ui.web.y0 y0Var, ea eaVar) {
        this.a = 15;
        this.d = b1Var;
        this.c = str;
        this.h = tLObject;
        this.f = tL_error;
        this.b = i10;
        this.e = y0Var;
        this.n = eaVar;
    }
}
