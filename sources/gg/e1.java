package gg;

import ai.da;
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
import org.telegram.messenger.ok;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.e3;
import org.telegram.ui.ActionBar.m2;
import org.telegram.ui.Components.n90;
import org.telegram.ui.Components.r80;
import org.telegram.ui.Components.wn0;
import org.telegram.ui.Components.xc;
import org.telegram.ui.Components.y70;
import org.telegram.ui.Components.zr0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.c90;
import org.telegram.ui.f90;
import org.telegram.ui.g60;
import org.telegram.ui.gh;
import org.telegram.ui.i4;
import org.telegram.ui.jr0;
import org.telegram.ui.k9;
import org.telegram.ui.kf;
import org.telegram.ui.n80;
import org.telegram.ui.oo0;
import org.telegram.ui.p60;
import org.telegram.ui.qg0;
import org.telegram.ui.qy;
import org.telegram.ui.s80;
import org.telegram.ui.sq;
import org.telegram.ui.u8;
import org.telegram.ui.va0;
import org.telegram.ui.wf1;
import org.telegram.ui.wl0;
import org.telegram.ui.wn;
import org.telegram.ui.zf0;
import xh.p4;
import yh.s5;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final /* synthetic */ class e1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object n;

    public /* synthetic */ e1(int i10, ArrayList arrayList, ArrayList arrayList2, Integer num, MediaController.AlbumEntry albumEntry, MediaController.AlbumEntry albumEntry2, MediaController.AlbumEntry albumEntry3) {
        this.a = 1;
        this.b = i10;
        this.c = arrayList;
        this.d = arrayList2;
        this.e = num;
        this.f = albumEntry;
        this.h = albumEntry2;
        this.n = albumEntry3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:93:0x0311, code lost:
    
        if (r8.chat.has_geo != false) goto L88;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        n80 n80Var;
        oo0 oo0Var;
        xc a02;
        int i10;
        int i11;
        int i12 = this.a;
        int i13 = this.b;
        int i14 = 1;
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
                a0.i iVar = (a0.i) obj4;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj3;
                TLObject tLObject = (TLObject) obj2;
                MessagesController messagesController = (MessagesController) obj;
                k1 k1Var = ((f1) obj6).h;
                if (k1Var.j0 != 0 && i13 == k1Var.i0 && k1Var.y != null && k1Var.x != null) {
                    k1Var.Y(iVar, arrayList, false);
                    if (tL_error == null) {
                        TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject;
                        messagesController.putUsers(tL_channels_channelParticipants.users, false);
                        messagesController.putChats(tL_channels_channelParticipants.chats, false);
                        k1Var.x.isEmpty();
                        if (!tL_channels_channelParticipants.participants.isEmpty()) {
                            long clientUserId = UserConfig.getInstance(k1Var.f).getClientUserId();
                            for (int i16 = 0; i16 < tL_channels_channelParticipants.participants.size(); i16++) {
                                long peerId = MessageObject.getPeerId(tL_channels_channelParticipants.participants.get(i16).peer);
                                if (k1Var.y.h(peerId) < 0 && ((peerId != 0 || k1Var.y.h(clientUserId) < 0) && (k1Var.k0 || (peerId != clientUserId && peerId != 0)))) {
                                    if (peerId >= 0) {
                                        TLRPC.User user = messagesController.getUser(Long.valueOf(peerId));
                                        if (user == null) {
                                            break;
                                        } else {
                                            k1Var.x.add(user);
                                        }
                                    } else {
                                        TLRPC.Chat chat = messagesController.getChat(Long.valueOf(-peerId));
                                        if (chat == null) {
                                            break;
                                        } else {
                                            k1Var.x.add(chat);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    k1Var.l();
                    k1Var.V.a(!k1Var.x.isEmpty());
                }
                k1Var.j0 = 0;
                break;
            case 1:
                MediaController.lambda$broadcastNewPhotos$58(this.b, (ArrayList) obj5, (ArrayList) obj6, (Integer) obj4, (MediaController.AlbumEntry) obj3, (MediaController.AlbumEntry) obj2, (MediaController.AlbumEntry) obj);
                break;
            case 2:
                ((SendMessagesHelper) obj6).lambda$performSendDelayedMessage$53((TLObject) obj2, (TLRPC.InputFile) obj5, (TLRPC.InputMedia) obj4, (SendMessagesHelper.DelayedMessage) obj3, this.b, (String) obj);
                break;
            case 3:
                i4 i4Var = (i4) obj6;
                nf.e eVar = (nf.e) obj5;
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
                                        nf.f.s(i4Var.L, tL_messages_getWebPage.url);
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
                                    nf.f.s(i4Var.L, tL_messages_getWebPage.url);
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
                ConnectionsManager.getInstance(i17).sendRequest(togglegroupcallsettings, new u8(i17, inputGroupCall, (String[]) obj5, (FrameLayout) obj4, (n90) obj3, (e3) obj2, (d6) obj));
                break;
            case 5:
                TLObject tLObject3 = (TLObject) obj2;
                org.telegram.ui.ActionBar.a2 a2Var = (org.telegram.ui.ActionBar.a2) obj6;
                Context context = (Context) obj5;
                TL_phone.exportGroupCallInvite exportgroupcallinvite = (TL_phone.exportGroupCallInvite) obj4;
                d6 d6Var = (d6) obj3;
                p60 p60Var = (p60) obj;
                if (tLObject3 instanceof TL_phone.exportedGroupCallInvite) {
                    a2Var.dismiss();
                    k9.o0(context, this.b, exportgroupcallinvite.call, ((TL_phone.exportedGroupCallInvite) tLObject3).link, d6Var, true, true);
                } else {
                    a2Var.dismiss();
                }
                AndroidUtilities.runOnUIThread(p60Var);
                break;
            case 6:
                TLObject tLObject4 = (TLObject) obj2;
                ArrayList arrayList2 = (ArrayList) obj5;
                AtomicInteger atomicInteger = (AtomicInteger) obj6;
                ArrayList arrayList3 = (ArrayList) obj4;
                sq sqVar = (sq) obj;
                if (((TLRPC.TL_error) obj3) == null && (tLObject4 instanceof TLRPC.TL_channels_channelParticipants)) {
                    arrayList2.set(i13, (TLRPC.TL_channels_channelParticipants) tLObject4);
                }
                atomicInteger.getAndIncrement();
                if (atomicInteger.get() == arrayList3.size()) {
                    sqVar.run();
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
                    AndroidUtilities.runOnUIThread(new wn0(10, tLObject5, document), 250L);
                    break;
                } else if (tL_error2 != null) {
                    if (FileRefController.isFileRefError(tL_error2.text)) {
                        FileRefController.getInstance(i13).requestReference(obj4, tL_stickers_addStickerToSet);
                        break;
                    } else {
                        xc.b0(tL_error2);
                        break;
                    }
                }
                break;
            case 8:
                g60.a((org.telegram.ui.ActionBar.a2) obj6, (nf.e) obj5, (TLObject) obj2, this.b, (Context) obj4, (TLRPC.TL_inputGroupCallSlug) obj, (TLRPC.TL_error) obj3);
                break;
            case 9:
                LaunchActivity launchActivity = (LaunchActivity) obj6;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj3;
                TLObject tLObject6 = (TLObject) obj2;
                org.telegram.ui.ActionBar.a2 a2Var2 = (org.telegram.ui.ActionBar.a2) obj5;
                n80 n80Var2 = (n80) obj4;
                String str2 = (String) obj;
                ArrayList arrayList4 = launchActivity.d0;
                if (!launchActivity.isFinishing()) {
                    if (tL_error3 != null || launchActivity.q0 == null) {
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
                            MessagesStorage.getInstance(i13).putUsersAndChats(null, arrayList5, false, true);
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", chatInvite.chat.id);
                            if (arrayList4.isEmpty() || MessagesController.getInstance(i13).checkCanOpenChat(bundle, (m2) hg.c.g(1, arrayList4))) {
                                n80Var = n80Var2;
                                boolean[] zArr = new boolean[1];
                                a2Var2.setOnCancelListener(new gh(i14, zArr));
                                if (!chatInvite.chat.forum) {
                                    MessagesController.getInstance(i13).ensureMessagesLoaded(-chatInvite.chat.id, 0, new va0(launchActivity, n80Var, zArr, bundle, chatInvite));
                                    break;
                                } else {
                                    Bundle bundle2 = new Bundle();
                                    bundle2.putLong("chat_id", chatInvite.chat.id);
                                    launchActivity.p0(wf1.F0(launchActivity, bundle2));
                                }
                            } else {
                                n80Var = n80Var2;
                            }
                            n80Var2 = n80Var;
                        }
                        TL_stars.TL_starsSubscriptionPricing tL_starsSubscriptionPricing = chatInvite.subscription_pricing;
                        if (tL_starsSubscriptionPricing == null || chatInvite.can_refulfill_subscription) {
                            m2 m2Var = (m2) hg.c.g(1, arrayList4);
                            m2Var.showDialog(new r80(launchActivity, chatInvite, str2, m2Var, m2Var instanceof wn ? ((wn) m2Var).ea : null));
                        } else {
                            long j3 = tL_starsSubscriptionPricing.amount;
                            MessagesController.getInstance(i13).putChat(chatInvite.chat, false);
                            s5.y(launchActivity.O, false).j0(str2, chatInvite, new fi.o0(launchActivity, j3, 2));
                        }
                    }
                    try {
                        n80Var2.run();
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
                n80 n80Var3 = (n80) obj4;
                String str3 = (String) obj;
                ArrayList arrayList6 = launchActivity2.d0;
                if (tL_error4 != null) {
                    if ("SUBSCRIPTION_ALREADY_ACTIVE".equalsIgnoreCase(tL_error4.text)) {
                        a02 = xc.a0((m2) hg.c.g(1, arrayList6));
                        i10 = R.string.PaymentInvoiceSubscriptionLinkAlreadyPaid;
                    } else {
                        a02 = xc.a0((m2) hg.c.g(1, arrayList6));
                        i10 = R.string.PaymentInvoiceLinkInvalid;
                    }
                    ok.p(i10, a02, null);
                } else if (!launchActivity2.isFinishing()) {
                    if (tLObject7 instanceof TLRPC.TL_payments_paymentFormStars) {
                        p4 p4Var = launchActivity2.Y0;
                        launchActivity2.Y0 = null;
                        s5.y(launchActivity2.O, false).Y(null, tL_inputInvoiceSlug, (TLRPC.TL_payments_paymentFormStars) tLObject7, new s80(n80Var3, 1), new f90(p4Var, i15));
                        break;
                    } else {
                        if (tLObject7 instanceof TLRPC.PaymentForm) {
                            TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject7;
                            MessagesController.getInstance(i13).putUsers(paymentForm.users, false);
                            oo0Var = new oo0(paymentForm, null, str3, launchActivity2.O().getLastFragment());
                        } else {
                            oo0Var = tLObject7 instanceof TLRPC.PaymentReceipt ? new oo0((TLRPC.PaymentReceipt) tLObject7) : null;
                        }
                        if (oo0Var != null) {
                            p4 p4Var2 = launchActivity2.Y0;
                            if (p4Var2 != null) {
                                launchActivity2.Y0 = null;
                                oo0Var.Z0 = new kf(9, p4Var2);
                            }
                            launchActivity2.p0(oo0Var);
                        }
                    }
                }
                try {
                    n80Var3.run();
                    break;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
            case 11:
                LaunchActivity launchActivity3 = (LaunchActivity) obj6;
                qy qyVar = (qy) obj5;
                m2 m2Var2 = (m2) obj4;
                TLRPC.User user2 = (TLRPC.User) obj3;
                String str4 = (String) obj;
                Pattern pattern = LaunchActivity.B1;
                if (((TLObject) obj2) instanceof TLRPC.TL_boolTrue) {
                    MediaDataController.getInstance(i13).loadAttachMenuBots(false, true, new c90(launchActivity3, qyVar, m2Var2, user2, str4, 1));
                    break;
                }
                break;
            case 12:
                zf0 zf0Var = (zf0) obj6;
                String str5 = (String) obj5;
                c5.h hVar = (c5.h) obj4;
                List list = (List) obj3;
                String str6 = (String) obj2;
                String str7 = (String) obj;
                qg0 qg0Var = zf0Var.v;
                StringBuilder w10 = a4.a.w("LoginBilling queried \"", str5, "\" product: ");
                w10.append(BillingController.getResponseCodeString(hVar.a));
                FileLog.d(w10.toString());
                if (hVar.a != 0) {
                    zf0Var.e = "BILLING_" + BillingController.getResponseCodeString(hVar.a);
                    new xc(qg0Var.Z, null).H(R.raw.error, LocaleController.formatString(R.string.UnknownErrorCode, BillingController.getResponseCodeString(hVar.a)));
                    break;
                } else if (list != null && !list.isEmpty()) {
                    c5.o oVar = (c5.o) list.get(0);
                    c5.k a2 = oVar.a();
                    TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode = new TLRPC.TL_inputStorePaymentAuthCode();
                    tL_inputStorePaymentAuthCode.currency = a2.c;
                    tL_inputStorePaymentAuthCode.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_inputStorePaymentAuthCode.currency)) * (a2.b / Math.pow(10.0d, 6.0d)));
                    tL_inputStorePaymentAuthCode.phone_code_hash = TextUtils.isEmpty(str6) ? "" : str6;
                    tL_inputStorePaymentAuthCode.phone_number = str7;
                    int i18 = this.b;
                    tL_inputStorePaymentAuthCode.premium_days = i18;
                    StringBuilder w11 = a4.a.w("LoginBilling found \"", str5, "\" product, with currency=");
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
                    i11 = ((m2) qg0Var).currentAccount;
                    ConnectionsManager.getInstance(i11).sendRequest(tL_payments_canPurchaseStore, new u8(zf0Var, a2, i18, oVar, tL_inputStorePaymentAuthCode, str5, tL_payments_canPurchaseStore, 3), 10);
                    break;
                } else {
                    zf0Var.e = "PRODUCT_NOT_FOUND";
                    new xc(qg0Var.Z, null).H(R.raw.error, LocaleController.formatString(R.string.UnknownErrorCode, "PRODUCT_NOT_FOUND"));
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
                    y70 H = y70.H(profileActivity, view);
                    H.W(profileActivity.a.V0(view, false));
                    H.w = false;
                    H.c(R.drawable.msg_copy, LocaleController.getString(R.string.Copy), new wl0(profileActivity, str8, i13, 5), false);
                    H.l(R.drawable.msg_translate, LocaleController.getString(R.string.TranslateMessage), new jr0(profileActivity, strArr, str9, str8, 9), zArr2[0]);
                    H.Z();
                    break;
                }
                break;
            case 14:
                org.telegram.ui.web.b1 b1Var = (org.telegram.ui.web.b1) obj6;
                String str10 = (String) obj5;
                TLObject tLObject8 = (TLObject) obj2;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) obj3;
                org.telegram.ui.web.y0 y0Var = (org.telegram.ui.web.y0) obj4;
                da daVar = (da) obj;
                b1Var.getClass();
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("req_id", str10);
                    if (tLObject8 instanceof TLRPC.TL_dataJSON) {
                        jSONObject.put("result", new JSONTokener(((TLRPC.TL_dataJSON) tLObject8).data).nextValue());
                    } else if (tL_error5 != null) {
                        jSONObject.put("error", tL_error5.text);
                    }
                    org.telegram.ui.web.b1.x(i13, y0Var, daVar, "custom_method_invoked", jSONObject);
                    break;
                } catch (Exception e10) {
                    FileLog.e(e10);
                    b1Var.Z(null);
                    return;
                }
            default:
                StringBuilder sb2 = new StringBuilder();
                a4.a.A(sb2, MessagesController.getInstance(i13).linkPrefix, "/", (String) obj5, "/c/");
                sb2.append(((TL_stars.TL_starGiftCollection) obj4).collection_id);
                String sb3 = sb2.toString();
                new xh.z1((zr0) obj6, (Context) obj3, sb3, sb3, (d6) obj2, (m2) obj).show();
                break;
        }
    }

    public /* synthetic */ e1(Object obj, int i10, Serializable serializable, Object obj2, Object obj3, Object obj4, Object obj5, int i11) {
        this.a = i11;
        this.d = obj;
        this.b = i10;
        this.c = serializable;
        this.e = obj2;
        this.f = obj3;
        this.h = obj4;
        this.n = obj5;
    }

    public /* synthetic */ e1(SendMessagesHelper sendMessagesHelper, TLObject tLObject, TLRPC.InputFile inputFile, TLRPC.InputMedia inputMedia, SendMessagesHelper.DelayedMessage delayedMessage, int i10, String str) {
        this.a = 2;
        this.d = sendMessagesHelper;
        this.h = tLObject;
        this.c = inputFile;
        this.e = inputMedia;
        this.f = delayedMessage;
        this.b = i10;
        this.n = str;
    }

    public /* synthetic */ e1(TLObject tLObject, org.telegram.ui.ActionBar.a2 a2Var, Context context, int i10, TL_phone.exportGroupCallInvite exportgroupcallinvite, d6 d6Var, p60 p60Var) {
        this.a = 5;
        this.h = tLObject;
        this.d = a2Var;
        this.c = context;
        this.b = i10;
        this.e = exportgroupcallinvite;
        this.f = d6Var;
        this.n = p60Var;
    }

    public /* synthetic */ e1(TLRPC.TL_error tL_error, TLObject tLObject, ArrayList arrayList, int i10, AtomicInteger atomicInteger, ArrayList arrayList2, sq sqVar) {
        this.a = 6;
        this.f = tL_error;
        this.h = tLObject;
        this.c = arrayList;
        this.b = i10;
        this.d = atomicInteger;
        this.e = arrayList2;
        this.n = sqVar;
    }

    public /* synthetic */ e1(org.telegram.ui.ActionBar.a2 a2Var, nf.e eVar, TLObject tLObject, int i10, Context context, TLRPC.TL_inputGroupCallSlug tL_inputGroupCallSlug, TLRPC.TL_error tL_error) {
        this.a = 8;
        this.d = a2Var;
        this.c = eVar;
        this.h = tLObject;
        this.b = i10;
        this.e = context;
        this.n = tL_inputGroupCallSlug;
        this.f = tL_error;
    }

    public /* synthetic */ e1(org.telegram.ui.ActionBar.a2 a2Var, TLObject tLObject, int i10, TLRPC.Document document, TLRPC.TL_error tL_error, Object obj, TLRPC.TL_stickers_addStickerToSet tL_stickers_addStickerToSet) {
        this.a = 7;
        this.d = a2Var;
        this.h = tLObject;
        this.b = i10;
        this.c = document;
        this.f = tL_error;
        this.e = obj;
        this.n = tL_stickers_addStickerToSet;
    }

    public /* synthetic */ e1(i4 i4Var, int i10, nf.e eVar, TLObject tLObject, String str, org.telegram.ui.g0 g0Var, TLRPC.TL_messages_getWebPage tL_messages_getWebPage) {
        this.a = 3;
        this.d = i4Var;
        this.b = i10;
        this.c = eVar;
        this.h = tLObject;
        this.e = str;
        this.f = g0Var;
        this.n = tL_messages_getWebPage;
    }

    public /* synthetic */ e1(LaunchActivity launchActivity, TLObject tLObject, int i10, qy qyVar, m2 m2Var, TLRPC.User user, String str) {
        this.a = 11;
        this.d = launchActivity;
        this.h = tLObject;
        this.b = i10;
        this.c = qyVar;
        this.e = m2Var;
        this.f = user;
        this.n = str;
    }

    public /* synthetic */ e1(LaunchActivity launchActivity, TLRPC.TL_error tL_error, TLObject tLObject, int i10, org.telegram.ui.ActionBar.a2 a2Var, n80 n80Var, String str) {
        this.a = 9;
        this.d = launchActivity;
        this.f = tL_error;
        this.h = tLObject;
        this.b = i10;
        this.c = a2Var;
        this.e = n80Var;
        this.n = str;
    }

    public /* synthetic */ e1(LaunchActivity launchActivity, TLRPC.TL_error tL_error, TLObject tLObject, TLRPC.TL_inputInvoiceSlug tL_inputInvoiceSlug, n80 n80Var, int i10, String str) {
        this.a = 10;
        this.d = launchActivity;
        this.f = tL_error;
        this.h = tLObject;
        this.c = tL_inputInvoiceSlug;
        this.e = n80Var;
        this.b = i10;
        this.n = str;
    }

    public /* synthetic */ e1(zf0 zf0Var, String str, c5.h hVar, List list, String str2, String str3, int i10) {
        this.a = 12;
        this.d = zf0Var;
        this.c = str;
        this.e = hVar;
        this.f = list;
        this.h = str2;
        this.n = str3;
        this.b = i10;
    }

    public /* synthetic */ e1(ProfileActivity profileActivity, View view, String str, int i10, boolean[] zArr, String[] strArr, String str2) {
        this.a = 13;
        this.d = profileActivity;
        this.c = view;
        this.e = str;
        this.b = i10;
        this.f = zArr;
        this.h = strArr;
        this.n = str2;
    }

    public /* synthetic */ e1(org.telegram.ui.web.b1 b1Var, String str, TLObject tLObject, TLRPC.TL_error tL_error, int i10, org.telegram.ui.web.y0 y0Var, da daVar) {
        this.a = 14;
        this.d = b1Var;
        this.c = str;
        this.h = tLObject;
        this.f = tL_error;
        this.b = i10;
        this.e = y0Var;
        this.n = daVar;
    }
}
