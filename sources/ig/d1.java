package ig;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import bi.ca;
import di.x7;
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
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.vh;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.e2;
import org.telegram.ui.ActionBar.k3;
import org.telegram.ui.ActionBar.r2;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Components.c90;
import org.telegram.ui.Components.i30;
import org.telegram.ui.Components.k80;
import org.telegram.ui.Components.t90;
import org.telegram.ui.Components.vs0;
import org.telegram.ui.Components.wc;
import org.telegram.ui.Components.z90;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.Wallet.WalletEngine2;
import org.telegram.ui.af1;
import org.telegram.ui.ag0;
import org.telegram.ui.cy;
import org.telegram.ui.ff;
import org.telegram.ui.g90;
import org.telegram.ui.gg0;
import org.telegram.ui.h60;
import org.telegram.ui.j4;
import org.telegram.ui.ka0;
import org.telegram.ui.nq;
import org.telegram.ui.o01;
import org.telegram.ui.o9;
import org.telegram.ui.of0;
import org.telegram.ui.po0;
import org.telegram.ui.sz;
import org.telegram.ui.un;
import org.telegram.ui.v80;
import org.telegram.ui.y50;
import org.telegram.ui.y8;
import org.telegram.ui.yg;
import org.telegram.ui.yx;
import zh.o4;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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

    /* JADX WARN: Code restructure failed: missing block: B:140:0x042f, code lost:
    
        if (r10.chat.has_geo != false) goto L130;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        sz szVar;
        po0 po0Var;
        u6 u6Var;
        wc b02;
        int i10;
        int i11;
        String h;
        JSONObject jSONObject;
        TL_wallet.tonConnectSession tonconnectsession;
        JSONObject put;
        int i12 = this.a;
        int i13 = 9;
        int i14 = this.b;
        int i15 = 0;
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
                if (j1Var.j0 != 0 && i14 == j1Var.i0 && j1Var.y != null && j1Var.x != null) {
                    j1Var.Y(hVar, arrayList, false);
                    if (tL_error == null) {
                        TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject;
                        messagesController.putUsers(tL_channels_channelParticipants.users, false);
                        messagesController.putChats(tL_channels_channelParticipants.chats, false);
                        j1Var.x.isEmpty();
                        if (!tL_channels_channelParticipants.participants.isEmpty()) {
                            long clientUserId = UserConfig.getInstance(j1Var.f).getClientUserId();
                            for (int i16 = 0; i16 < tL_channels_channelParticipants.participants.size(); i16++) {
                                long peerId = MessageObject.getPeerId(tL_channels_channelParticipants.participants.get(i16).peer);
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
                MediaController.lambda$broadcastNewPhotos$61(this.b, (ArrayList) obj5, (ArrayList) obj6, (Integer) obj4, (MediaController.AlbumEntry) obj3, (MediaController.AlbumEntry) obj2, (MediaController.AlbumEntry) obj);
                break;
            case 2:
                ((SendMessagesHelper) obj6).lambda$performSendDelayedMessage$56((TLObject) obj2, (TLRPC.InputFile) obj5, (TLRPC.InputMedia) obj4, (SendMessagesHelper.DelayedMessage) obj3, this.b, (String) obj);
                break;
            case 3:
                j4 j4Var = (j4) obj6;
                qf.c cVar = (qf.c) obj5;
                TLObject tLObject2 = (TLObject) obj2;
                String str = (String) obj4;
                org.telegram.ui.f0 f0Var = (org.telegram.ui.f0) obj3;
                TLRPC.TL_messages_getWebPage tL_messages_getWebPage = (TLRPC.TL_messages_getWebPage) obj;
                if (j4Var.G0 != 0 && i14 == j4Var.I0) {
                    if (cVar != null) {
                        cVar.b();
                    }
                    j4Var.G0 = 0;
                    j4Var.b0(false);
                    if (j4Var.V) {
                        if (tLObject2 instanceof TLRPC.TL_messages_webPage) {
                            TLRPC.TL_messages_webPage tL_messages_webPage = (TLRPC.TL_messages_webPage) tLObject2;
                            MessagesController.getInstance(j4Var.X).putUsers(tL_messages_webPage.users, false);
                            MessagesController.getInstance(j4Var.X).putChats(tL_messages_webPage.chats, false);
                            TLRPC.WebPage webPage = tL_messages_webPage.webpage;
                            if (webPage == null || !(webPage.cached_page instanceof TL_iv.TL_page)) {
                                if (!((Boolean) f0Var.run()).booleanValue()) {
                                    if (MessagesController.getInstance(j4Var.X).isWebBrowserOpenInApp(tL_messages_getWebPage.url)) {
                                        j4Var.g(1, tL_messages_getWebPage.url);
                                        break;
                                    } else {
                                        qf.d.r(j4Var.L, tL_messages_getWebPage.url);
                                        break;
                                    }
                                }
                            } else {
                                j4Var.h(webPage, str, 1);
                                break;
                            }
                        } else {
                            if (tLObject2 instanceof TLRPC.TL_webPage) {
                                TLRPC.TL_webPage tL_webPage = (TLRPC.TL_webPage) tLObject2;
                                if (tL_webPage.cached_page instanceof TL_iv.TL_page) {
                                    j4Var.h(tL_webPage, str, 1);
                                    break;
                                }
                            }
                            if (!((Boolean) f0Var.run()).booleanValue()) {
                                if (MessagesController.getInstance(j4Var.X).isWebBrowserOpenInApp(tL_messages_getWebPage.url)) {
                                    j4Var.g(1, tL_messages_getWebPage.url);
                                    break;
                                } else {
                                    qf.d.r(j4Var.L, tL_messages_getWebPage.url);
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
                int i17 = this.b;
                ConnectionsManager.getInstance(i17).sendRequest(togglegroupcallsettings, new y8(i17, inputGroupCall, (String[]) obj5, (FrameLayout) obj4, (z90) obj3, (k3) obj2, (u6) obj));
                break;
            case 5:
                TLObject tLObject3 = (TLObject) obj2;
                e2 e2Var = (e2) obj6;
                Context context = (Context) obj5;
                TL_phone.exportGroupCallInvite exportgroupcallinvite = (TL_phone.exportGroupCallInvite) obj4;
                u6 u6Var2 = (u6) obj3;
                h60 h60Var = (h60) obj;
                if (tLObject3 instanceof TL_phone.exportedGroupCallInvite) {
                    e2Var.dismiss();
                    o9.i0(context, this.b, exportgroupcallinvite.call, ((TL_phone.exportedGroupCallInvite) tLObject3).link, u6Var2, true, true);
                } else {
                    e2Var.dismiss();
                }
                AndroidUtilities.runOnUIThread(h60Var);
                break;
            case 6:
                TLObject tLObject4 = (TLObject) obj2;
                ArrayList arrayList2 = (ArrayList) obj5;
                AtomicInteger atomicInteger = (AtomicInteger) obj6;
                ArrayList arrayList3 = (ArrayList) obj4;
                nq nqVar = (nq) obj;
                if (((TLRPC.TL_error) obj3) == null && (tLObject4 instanceof TLRPC.TL_channels_channelParticipants)) {
                    arrayList2.set(i14, (TLRPC.TL_channels_channelParticipants) tLObject4);
                }
                atomicInteger.getAndIncrement();
                if (atomicInteger.get() == arrayList3.size()) {
                    nqVar.run();
                    break;
                }
                break;
            case 7:
                TLObject tLObject5 = (TLObject) obj2;
                TLRPC.Document document = (TLRPC.Document) obj5;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj3;
                TLRPC.TL_stickers_addStickerToSet tL_stickers_addStickerToSet = (TLRPC.TL_stickers_addStickerToSet) obj;
                ((e2) obj6).dismiss();
                if (tLObject5 instanceof TLRPC.TL_messages_stickerSet) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject5;
                    MediaDataController.getInstance(i14).putStickerSet(tL_messages_stickerSet);
                    if (!MediaDataController.getInstance(i14).isStickerPackInstalled(tL_messages_stickerSet.set.id)) {
                        MediaDataController.getInstance(i14).toggleStickerSet(null, tLObject5, 2, null, false, false);
                    }
                    AndroidUtilities.runOnUIThread(new t90(22, tLObject5, document), 250L);
                    break;
                } else if (tL_error2 != null) {
                    if (FileRefController.isFileRefError(tL_error2.text)) {
                        FileRefController.getInstance(i14).requestReference(obj4, tL_stickers_addStickerToSet);
                        break;
                    } else {
                        wc.e0(tL_error2);
                        break;
                    }
                }
                break;
            case 8:
                y50.a((e2) obj6, (qf.c) obj5, (TLObject) obj2, this.b, (Context) obj4, (TLRPC.TL_inputGroupCallSlug) obj, (TLRPC.TL_error) obj3);
                break;
            case 9:
                LaunchActivity launchActivity = (LaunchActivity) obj6;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj3;
                TLObject tLObject6 = (TLObject) obj2;
                e2 e2Var2 = (e2) obj5;
                sz szVar2 = (sz) obj4;
                String str2 = (String) obj;
                ArrayList arrayList4 = launchActivity.d0;
                if (!launchActivity.isFinishing()) {
                    if (tL_error3 != null || launchActivity.q0 == null) {
                        szVar = szVar2;
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(launchActivity);
                        String string = LocaleController.getString(R.string.AppName);
                        e2 e2Var3 = alertDialog$Builder.a;
                        e2Var3.R = string;
                        if (tL_error3.text.startsWith("FLOOD_WAIT")) {
                            e2Var3.T = LocaleController.getString(R.string.FloodWait);
                        } else if (tL_error3.text.startsWith("INVITE_HASH_EXPIRED")) {
                            e2Var3.R = LocaleController.getString(R.string.ExpiredLink);
                            e2Var3.T = LocaleController.getString(R.string.InviteExpired);
                        } else {
                            e2Var3.T = LocaleController.getString(R.string.JoinToGroupErrorNotExist);
                        }
                        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                        launchActivity.G0(alertDialog$Builder);
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
                            MessagesController.getInstance(i14).putChat(chatInvite.chat, false);
                            ArrayList arrayList5 = new ArrayList();
                            arrayList5.add(chatInvite.chat);
                            int i18 = 1;
                            MessagesStorage.getInstance(i14).putUsersAndChats(null, arrayList5, false, true);
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", chatInvite.chat.id);
                            if (arrayList4.isEmpty() || MessagesController.getInstance(i14).checkCanOpenChat(bundle, (r2) ic.a.g(1, arrayList4))) {
                                boolean[] zArr = new boolean[1];
                                e2Var2.setOnCancelListener(new yg(i18, zArr));
                                if (!chatInvite.chat.forum) {
                                    MessagesController.getInstance(i14).ensureMessagesLoaded(-chatInvite.chat.id, 0, new ka0(launchActivity, szVar2, zArr, bundle, chatInvite));
                                    break;
                                } else {
                                    Bundle bundle2 = new Bundle();
                                    bundle2.putLong("chat_id", chatInvite.chat.id);
                                    launchActivity.u0(af1.F0(launchActivity, bundle2));
                                }
                            }
                            szVar = szVar2;
                        }
                        szVar = szVar2;
                        TL_stars.TL_starsSubscriptionPricing tL_starsSubscriptionPricing = chatInvite.subscription_pricing;
                        if (tL_starsSubscriptionPricing == null || chatInvite.can_refulfill_subscription) {
                            r2 r2Var = (r2) ic.a.g(1, arrayList4);
                            r2Var.showDialog(new c90(launchActivity, chatInvite, str2, r2Var, r2Var instanceof un ? ((un) r2Var).qa : null));
                        } else {
                            long j10 = tL_starsSubscriptionPricing.amount;
                            MessagesController.getInstance(i14).putChat(chatInvite.chat, false);
                            ca.y(launchActivity.O, false).j0(str2, chatInvite, new ii.m0(launchActivity, j10, 2));
                        }
                    }
                    try {
                        szVar.run();
                        break;
                    } catch (Exception e) {
                        FileLog.e(e);
                        return;
                    }
                }
                break;
            case 10:
                LaunchActivity launchActivity2 = (LaunchActivity) obj6;
                TLObject tLObject7 = (TLObject) obj2;
                qf.c cVar2 = (qf.c) obj5;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) obj3;
                MessagesController messagesController2 = (MessagesController) obj;
                String str3 = (String) obj4;
                Pattern pattern = LaunchActivity.D1;
                if (tLObject7 instanceof TLRPC.User) {
                    TLRPC.User user2 = (TLRPC.User) tLObject7;
                    messagesController2.putUser(user2, false);
                    if (UserObject.isUserSelf(user2)) {
                        if (cVar2 != null) {
                            cVar2.b();
                        }
                        launchActivity2.n0(i14, user2.id, null);
                        break;
                    } else {
                        launchActivity2.Z(i14, user2, str3, cVar2);
                        break;
                    }
                } else {
                    if (cVar2 != null) {
                        cVar2.b();
                    }
                    StringBuilder sb2 = new StringBuilder("cant import contact token, err=");
                    sb2.append(tL_error4 == null ? null : tL_error4.text);
                    FileLog.e(sb2.toString());
                    r2 R = LaunchActivity.R();
                    if (R != null) {
                        vh.n(R.string.NoUsernameFound, wc.b0(R), null);
                        break;
                    }
                }
                break;
            case 11:
                LaunchActivity launchActivity3 = (LaunchActivity) obj6;
                cy cyVar = (cy) obj5;
                r2 r2Var2 = (r2) obj4;
                TLRPC.User user3 = (TLRPC.User) obj3;
                String str4 = (String) obj;
                Pattern pattern2 = LaunchActivity.D1;
                if (((TLObject) obj2) instanceof TLRPC.TL_boolTrue) {
                    MediaDataController.getInstance(i14).loadAttachMenuBots(false, true, new i30(launchActivity3, cyVar, r2Var2, user3, str4, 9));
                    break;
                }
                break;
            case 12:
                LaunchActivity launchActivity4 = (LaunchActivity) obj6;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) obj3;
                TLObject tLObject8 = (TLObject) obj2;
                TLRPC.TL_inputInvoiceSlug tL_inputInvoiceSlug = (TLRPC.TL_inputInvoiceSlug) obj5;
                sz szVar3 = (sz) obj4;
                String str5 = (String) obj;
                ArrayList arrayList6 = launchActivity4.d0;
                if (tL_error5 != null) {
                    if ("SUBSCRIPTION_ALREADY_ACTIVE".equalsIgnoreCase(tL_error5.text)) {
                        b02 = wc.b0((r2) ic.a.g(1, arrayList6));
                        i10 = R.string.PaymentInvoiceSubscriptionLinkAlreadyPaid;
                        u6Var = null;
                    } else {
                        u6Var = null;
                        b02 = wc.b0((r2) ic.a.g(1, arrayList6));
                        i10 = R.string.PaymentInvoiceLinkInvalid;
                    }
                    vh.n(i10, b02, u6Var);
                } else if (!launchActivity4.isFinishing()) {
                    if (tLObject8 instanceof TLRPC.TL_payments_paymentFormStars) {
                        o4 o4Var = launchActivity4.Z0;
                        launchActivity4.Z0 = null;
                        ca.y(launchActivity4.O, false).Y(null, tL_inputInvoiceSlug, (TLRPC.TL_payments_paymentFormStars) tLObject8, new v80(szVar3, 1), new g90(o4Var, i15));
                        break;
                    } else {
                        if (tLObject8 instanceof TLRPC.PaymentForm) {
                            TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject8;
                            MessagesController.getInstance(i14).putUsers(paymentForm.users, false);
                            po0Var = new po0(paymentForm, null, str5, launchActivity4.O().getLastFragment());
                        } else {
                            po0Var = tLObject8 instanceof TLRPC.PaymentReceipt ? new po0((TLRPC.PaymentReceipt) tLObject8) : null;
                        }
                        if (po0Var != null) {
                            o4 o4Var2 = launchActivity4.Z0;
                            if (o4Var2 != null) {
                                launchActivity4.Z0 = null;
                                po0Var.Z0 = new ff(i13, o4Var2);
                            }
                            launchActivity4.u0(po0Var);
                        }
                    }
                }
                try {
                    szVar3.run();
                    break;
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return;
                }
            case 13:
                of0 of0Var = (of0) obj6;
                String str6 = (String) obj5;
                d5.i iVar = (d5.i) obj4;
                List list = (List) obj3;
                String str7 = (String) obj2;
                String str8 = (String) obj;
                gg0 gg0Var = of0Var.v;
                StringBuilder v = a1.g.v("LoginBilling queried \"", str6, "\" product: ");
                v.append(BillingController.getResponseCodeString(iVar.a));
                FileLog.d(v.toString());
                if (iVar.a != 0) {
                    of0Var.e = "BILLING_" + BillingController.getResponseCodeString(iVar.a);
                    new wc(gg0Var.Z, null).H(R.raw.error, LocaleController.formatString(R.string.UnknownErrorCode, BillingController.getResponseCodeString(iVar.a)));
                    break;
                } else if (list != null && !list.isEmpty()) {
                    d5.o oVar = (d5.o) list.get(0);
                    d5.l a2 = oVar.a();
                    TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode = new TLRPC.TL_inputStorePaymentAuthCode();
                    tL_inputStorePaymentAuthCode.currency = a2.c;
                    tL_inputStorePaymentAuthCode.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_inputStorePaymentAuthCode.currency)) * (a2.b / Math.pow(10.0d, 6.0d)));
                    tL_inputStorePaymentAuthCode.phone_code_hash = TextUtils.isEmpty(str7) ? "" : str7;
                    tL_inputStorePaymentAuthCode.phone_number = str8;
                    int i19 = this.b;
                    tL_inputStorePaymentAuthCode.premium_days = i19;
                    StringBuilder v10 = a1.g.v("LoginBilling found \"", str6, "\" product, with currency=");
                    v10.append(tL_inputStorePaymentAuthCode.currency);
                    v10.append(" amount=");
                    v10.append(tL_inputStorePaymentAuthCode.amount);
                    v10.append("; phone=");
                    v10.append(str8);
                    v10.append(", phone_code_hash=");
                    v10.append(str7);
                    FileLog.d(v10.toString());
                    TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore = new TLRPC.TL_payments_canPurchaseStore();
                    tL_payments_canPurchaseStore.purpose = tL_inputStorePaymentAuthCode;
                    i11 = ((r2) gg0Var).currentAccount;
                    ConnectionsManager.getInstance(i11).sendRequest(tL_payments_canPurchaseStore, new y8(of0Var, a2, i19, oVar, tL_inputStorePaymentAuthCode, str6, tL_payments_canPurchaseStore, 3), 10);
                    break;
                } else {
                    of0Var.e = "PRODUCT_NOT_FOUND";
                    new wc(gg0Var.Z, null).H(R.raw.error, LocaleController.formatString(R.string.UnknownErrorCode, "PRODUCT_NOT_FOUND"));
                    break;
                }
                break;
            case 14:
                ProfileActivity profileActivity = (ProfileActivity) obj6;
                View view = (View) obj5;
                String str9 = (String) obj4;
                boolean[] zArr2 = (boolean[]) obj3;
                String[] strArr = (String[]) obj2;
                String str10 = (String) obj;
                int i20 = ProfileActivity.R6;
                if (profileActivity.getParentActivity() != null) {
                    k80 H = k80.H(profileActivity, view);
                    H.W(profileActivity.a.V0(view, false));
                    H.w = false;
                    H.c(R.drawable.msg_copy, LocaleController.getString(R.string.Copy), new yx(profileActivity, str9, i14, i13), false);
                    H.l(R.drawable.msg_translate, LocaleController.getString(R.string.TranslateMessage), new ag0((Object) profileActivity, (Object) strArr, str10, (Object) str9, 16), zArr2[0]);
                    H.Z();
                    break;
                }
                break;
            case 15:
                org.telegram.ui.Wallet.e2 e2Var4 = (org.telegram.ui.Wallet.e2) obj6;
                org.telegram.ui.Wallet.a2 a2Var = (org.telegram.ui.Wallet.a2) obj5;
                String str11 = (String) obj3;
                org.telegram.ui.Wallet.i0 i0Var = (org.telegram.ui.Wallet.i0) obj2;
                Utilities.Callback callback = (Utilities.Callback) obj;
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    String str12 = a2Var.d;
                    tonconnectsession = a2Var.a;
                    JSONObject put2 = jSONObject2.put("id", str12);
                    if (i14 < 0) {
                        put2.put("result", obj4);
                    } else {
                        if (str11 == null) {
                            str11 = "Could not complete request";
                        }
                        put2.put("error", new JSONObject().put("code", i14).put("message", str11));
                    }
                    put = new JSONObject().put("body", WalletEngine2.tonConnectCrypto(i0Var, tonconnectsession, a2Var.h, a2Var.g, new JSONObject().put("encrypt", put2)).getString("body")).put("traceId", a2Var.i).put("disconnect", i14 < 0 && "disconnect".equals(a2Var.e));
                } catch (Exception e11) {
                    h = org.telegram.ui.Wallet.e2.h("encrypt response", e11);
                    jSONObject = null;
                }
                if (!MessagesController.getMainSettings(e2Var4.a).edit().putString(org.telegram.ui.Wallet.e2.j(tonconnectsession.id, a2Var.b), put.toString()).commit()) {
                    throw new IllegalStateException("Could not save TON Connect response");
                }
                jSONObject = put;
                h = null;
                AndroidUtilities.runOnUIThread(new o01((Object) e2Var4, (Object) jSONObject, (Object) callback, h, (Object) a2Var, 4));
                break;
                break;
            case 16:
                org.telegram.ui.web.a1 a1Var = (org.telegram.ui.web.a1) obj6;
                String str13 = (String) obj5;
                TLObject tLObject9 = (TLObject) obj2;
                TLRPC.TL_error tL_error6 = (TLRPC.TL_error) obj3;
                org.telegram.ui.web.x0 x0Var = (org.telegram.ui.web.x0) obj4;
                x7 x7Var = (x7) obj;
                a1Var.getClass();
                try {
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put("req_id", str13);
                    if (tLObject9 instanceof TLRPC.TL_dataJSON) {
                        jSONObject3.put("result", new JSONTokener(((TLRPC.TL_dataJSON) tLObject9).data).nextValue());
                    } else if (tL_error6 != null) {
                        jSONObject3.put("error", tL_error6.text);
                    }
                    org.telegram.ui.web.a1.w(i14, x0Var, x7Var, "custom_method_invoked", jSONObject3);
                    break;
                } catch (Exception e12) {
                    FileLog.e(e12);
                    a1Var.Y(null);
                    return;
                }
            default:
                StringBuilder sb3 = new StringBuilder();
                c3.h0.r(sb3, MessagesController.getInstance(i14).linkPrefix, "/", (String) obj5, "/c/");
                sb3.append(((TL_stars.TL_starGiftCollection) obj4).collection_id);
                String sb4 = sb3.toString();
                new zh.x1((vs0) obj6, (Context) obj3, sb4, sb4, (u6) obj2, (r2) obj).show();
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

    public /* synthetic */ d1(TLObject tLObject, e2 e2Var, Context context, int i10, TL_phone.exportGroupCallInvite exportgroupcallinvite, u6 u6Var, h60 h60Var) {
        this.a = 5;
        this.h = tLObject;
        this.d = e2Var;
        this.c = context;
        this.b = i10;
        this.e = exportgroupcallinvite;
        this.f = u6Var;
        this.n = h60Var;
    }

    public /* synthetic */ d1(TLRPC.TL_error tL_error, TLObject tLObject, ArrayList arrayList, int i10, AtomicInteger atomicInteger, ArrayList arrayList2, nq nqVar) {
        this.a = 6;
        this.f = tL_error;
        this.h = tLObject;
        this.c = arrayList;
        this.b = i10;
        this.d = atomicInteger;
        this.e = arrayList2;
        this.n = nqVar;
    }

    public /* synthetic */ d1(e2 e2Var, TLObject tLObject, int i10, TLRPC.Document document, TLRPC.TL_error tL_error, Object obj, TLRPC.TL_stickers_addStickerToSet tL_stickers_addStickerToSet) {
        this.a = 7;
        this.d = e2Var;
        this.h = tLObject;
        this.b = i10;
        this.c = document;
        this.f = tL_error;
        this.e = obj;
        this.n = tL_stickers_addStickerToSet;
    }

    public /* synthetic */ d1(e2 e2Var, qf.c cVar, TLObject tLObject, int i10, Context context, TLRPC.TL_inputGroupCallSlug tL_inputGroupCallSlug, TLRPC.TL_error tL_error) {
        this.a = 8;
        this.d = e2Var;
        this.c = cVar;
        this.h = tLObject;
        this.b = i10;
        this.e = context;
        this.n = tL_inputGroupCallSlug;
        this.f = tL_error;
    }

    public /* synthetic */ d1(j4 j4Var, int i10, qf.c cVar, TLObject tLObject, String str, org.telegram.ui.f0 f0Var, TLRPC.TL_messages_getWebPage tL_messages_getWebPage) {
        this.a = 3;
        this.d = j4Var;
        this.b = i10;
        this.c = cVar;
        this.h = tLObject;
        this.e = str;
        this.f = f0Var;
        this.n = tL_messages_getWebPage;
    }

    public /* synthetic */ d1(LaunchActivity launchActivity, TLObject tLObject, int i10, cy cyVar, r2 r2Var, TLRPC.User user, String str) {
        this.a = 11;
        this.d = launchActivity;
        this.h = tLObject;
        this.b = i10;
        this.c = cyVar;
        this.e = r2Var;
        this.f = user;
        this.n = str;
    }

    public /* synthetic */ d1(LaunchActivity launchActivity, TLObject tLObject, qf.c cVar, TLRPC.TL_error tL_error, MessagesController messagesController, int i10, String str) {
        this.a = 10;
        this.d = launchActivity;
        this.h = tLObject;
        this.c = cVar;
        this.f = tL_error;
        this.n = messagesController;
        this.b = i10;
        this.e = str;
    }

    public /* synthetic */ d1(LaunchActivity launchActivity, TLRPC.TL_error tL_error, TLObject tLObject, int i10, e2 e2Var, sz szVar, String str) {
        this.a = 9;
        this.d = launchActivity;
        this.f = tL_error;
        this.h = tLObject;
        this.b = i10;
        this.c = e2Var;
        this.e = szVar;
        this.n = str;
    }

    public /* synthetic */ d1(LaunchActivity launchActivity, TLRPC.TL_error tL_error, TLObject tLObject, TLRPC.TL_inputInvoiceSlug tL_inputInvoiceSlug, sz szVar, int i10, String str) {
        this.a = 12;
        this.d = launchActivity;
        this.f = tL_error;
        this.h = tLObject;
        this.c = tL_inputInvoiceSlug;
        this.e = szVar;
        this.b = i10;
        this.n = str;
    }

    public /* synthetic */ d1(of0 of0Var, String str, d5.i iVar, List list, String str2, String str3, int i10) {
        this.a = 13;
        this.d = of0Var;
        this.c = str;
        this.e = iVar;
        this.f = list;
        this.h = str2;
        this.n = str3;
        this.b = i10;
    }

    public /* synthetic */ d1(ProfileActivity profileActivity, View view, String str, int i10, boolean[] zArr, String[] strArr, String str2) {
        this.a = 14;
        this.d = profileActivity;
        this.c = view;
        this.e = str;
        this.b = i10;
        this.f = zArr;
        this.h = strArr;
        this.n = str2;
    }

    public /* synthetic */ d1(org.telegram.ui.Wallet.e2 e2Var, org.telegram.ui.Wallet.a2 a2Var, int i10, Object obj, String str, org.telegram.ui.Wallet.i0 i0Var, Utilities.Callback callback) {
        this.a = 15;
        this.d = e2Var;
        this.c = a2Var;
        this.b = i10;
        this.e = obj;
        this.f = str;
        this.h = i0Var;
        this.n = callback;
    }

    public /* synthetic */ d1(org.telegram.ui.web.a1 a1Var, String str, TLObject tLObject, TLRPC.TL_error tL_error, int i10, org.telegram.ui.web.x0 x0Var, x7 x7Var) {
        this.a = 16;
        this.d = a1Var;
        this.c = str;
        this.h = tLObject;
        this.f = tL_error;
        this.b = i10;
        this.e = x0Var;
        this.n = x7Var;
    }
}
