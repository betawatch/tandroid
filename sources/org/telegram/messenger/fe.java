package org.telegram.messenger;

import android.content.Context;
import android.graphics.RectF;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Pattern;
import org.json.JSONObject;
import org.json.JSONTokener;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.gi0;
import org.telegram.ui.Components.ji0;
import org.telegram.ui.Components.p80;
import org.telegram.ui.Components.u70;
import org.telegram.ui.Components.vq0;
import org.telegram.ui.Components.z60;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.Wallet.WalletEngine2;
import org.telegram.ui.a80;
import org.telegram.ui.d50;
import org.telegram.ui.f70;
import org.telegram.ui.hf0;
import org.telegram.ui.l50;
import org.telegram.ui.l80;
import org.telegram.ui.m90;
import org.telegram.ui.pb1;
import org.telegram.ui.s90;
import org.telegram.ui.se0;
import org.telegram.ui.sm0;
import org.telegram.ui.w50;
import org.telegram.ui.y70;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class fe implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object n;

    public /* synthetic */ fe(int i10, ArrayList arrayList, ArrayList arrayList2, Integer num, we weVar, we weVar2, we weVar3) {
        this.a = 0;
        this.b = i10;
        this.c = arrayList;
        this.d = arrayList2;
        this.e = num;
        this.f = weVar;
        this.h = weVar2;
        this.n = weVar3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:210:0x0583, code lost:
    
        if (r11.chat.has_geo != false) goto L187;
     */
    /* JADX WARN: Type inference failed for: r3v36 */
    /* JADX WARN: Type inference failed for: r3v37, types: [java.lang.String, org.telegram.ui.ActionBar.p6] */
    /* JADX WARN: Type inference failed for: r3v38 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        sm0 sm0Var;
        ?? r32;
        org.telegram.ui.Components.cc a02;
        int i10;
        int i11;
        String i12;
        JSONObject jSONObject;
        TL_wallet.tonConnectSession tonconnectsession;
        JSONObject put;
        int i13 = this.a;
        int i14 = this.b;
        boolean z10 = false;
        z10 = false;
        Object obj = this.n;
        Object obj2 = this.h;
        Object obj3 = this.f;
        Object obj4 = this.e;
        Object obj5 = this.c;
        Object obj6 = this.d;
        switch (i13) {
            case 0:
                ArrayList arrayList = (ArrayList) obj5;
                ArrayList arrayList2 = (ArrayList) obj6;
                Integer num = (Integer) obj4;
                we weVar = (we) obj3;
                we weVar2 = (we) obj2;
                we weVar3 = (we) obj;
                String[] strArr = MediaController.U1;
                boolean U1 = PhotoViewer.v1().U1();
                int i15 = this.b;
                if (!U1 || MediaController.f2) {
                    MediaController.a2 = arrayList;
                    MediaController.b2 = arrayList2;
                    MediaController.c2 = null;
                    MediaController.Z1 = weVar2;
                    MediaController.Y1 = weVar;
                    zs.e().k(zs.r2, Integer.valueOf(i15), arrayList, arrayList2, num);
                    break;
                } else {
                    fe feVar = MediaController.c2;
                    if (feVar != null) {
                        i0.r(feVar);
                    }
                    fe feVar2 = new fe(i15, arrayList, arrayList2, num, weVar, weVar2, weVar3);
                    MediaController.c2 = feVar2;
                    i0.h3(feVar2, 1000);
                    break;
                }
                break;
            case 1:
                qz qzVar = (qz) obj5;
                TLObject tLObject = (TLObject) obj6;
                TLRPC.InputFile inputFile = (TLRPC.InputFile) obj4;
                TLRPC.InputMedia inputMedia = (TLRPC.InputMedia) obj3;
                cz czVar = (cz) obj2;
                String str = (String) obj;
                qzVar.getClass();
                if (tLObject instanceof TLRPC.TL_messageMediaDocument) {
                    TLRPC.TL_inputMediaUploadedPhoto tL_inputMediaUploadedPhoto = new TLRPC.TL_inputMediaUploadedPhoto();
                    tL_inputMediaUploadedPhoto.live_photo = true;
                    tL_inputMediaUploadedPhoto.file = inputFile;
                    tL_inputMediaUploadedPhoto.spoiler = inputMedia.spoiler;
                    TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                    tL_inputMediaUploadedPhoto.video = tL_inputDocument;
                    TLRPC.Document document = ((TLRPC.TL_messageMediaDocument) tLObject).document;
                    tL_inputDocument.id = document.id;
                    tL_inputDocument.access_hash = document.access_hash;
                    byte[] bArr = document.file_reference;
                    tL_inputDocument.file_reference = bArr;
                    if (bArr == null) {
                        tL_inputDocument.file_reference = new byte[0];
                    }
                    TLRPC.TL_messages_sendMultiMedia tL_messages_sendMultiMedia = (TLRPC.TL_messages_sendMultiMedia) czVar.c;
                    if (i14 >= 0 && i14 < tL_messages_sendMultiMedia.multi_media.size()) {
                        tL_messages_sendMultiMedia.multi_media.get(i14).media = tL_inputMediaUploadedPhoto;
                    }
                    ArrayList arrayList3 = czVar.A;
                    if (arrayList3 != null && i14 >= 0 && i14 < arrayList3.size()) {
                        czVar.A.set(i14, tL_inputMediaUploadedPhoto);
                    }
                    czVar.j = null;
                    czVar.i = null;
                    HashMap hashMap = czVar.E;
                    if (hashMap != null) {
                        hashMap.remove(str + "_ct");
                    }
                    qzVar.A0(czVar, tL_inputMediaUploadedPhoto, null, str);
                    break;
                } else {
                    czVar.c();
                    break;
                }
                break;
            case 2:
                org.telegram.ui.h4 h4Var = (org.telegram.ui.h4) obj5;
                gf.e eVar = (gf.e) obj6;
                TLObject tLObject2 = (TLObject) obj4;
                String str2 = (String) obj3;
                org.telegram.ui.g0 g0Var = (org.telegram.ui.g0) obj2;
                TLRPC.TL_messages_getWebPage tL_messages_getWebPage = (TLRPC.TL_messages_getWebPage) obj;
                if (h4Var.G0 != 0 && i14 == h4Var.I0) {
                    if (eVar != null) {
                        eVar.b();
                    }
                    h4Var.G0 = 0;
                    h4Var.Z(false);
                    if (h4Var.V) {
                        if (tLObject2 instanceof TLRPC.TL_messages_webPage) {
                            TLRPC.TL_messages_webPage tL_messages_webPage = (TLRPC.TL_messages_webPage) tLObject2;
                            vp.r1(h4Var.X).V3(tL_messages_webPage.users, false);
                            vp.r1(h4Var.X).P3(tL_messages_webPage.chats, false);
                            TLRPC.WebPage webPage = tL_messages_webPage.webpage;
                            if (webPage == null || !(webPage.cached_page instanceof TL_iv.TL_page)) {
                                if (!((Boolean) g0Var.run()).booleanValue()) {
                                    if (vp.r1(h4Var.X).L2(tL_messages_getWebPage.url)) {
                                        h4Var.e(1, tL_messages_getWebPage.url);
                                        break;
                                    } else {
                                        gf.f.r(h4Var.L, tL_messages_getWebPage.url);
                                        break;
                                    }
                                }
                            } else {
                                h4Var.f(webPage, str2, 1);
                                break;
                            }
                        } else {
                            if (tLObject2 instanceof TLRPC.TL_webPage) {
                                TLRPC.TL_webPage tL_webPage = (TLRPC.TL_webPage) tLObject2;
                                if (tL_webPage.cached_page instanceof TL_iv.TL_page) {
                                    h4Var.f(tL_webPage, str2, 1);
                                    break;
                                }
                            }
                            if (!((Boolean) g0Var.run()).booleanValue()) {
                                if (vp.r1(h4Var.X).L2(tL_messages_getWebPage.url)) {
                                    h4Var.e(1, tL_messages_getWebPage.url);
                                    break;
                                } else {
                                    gf.f.r(h4Var.L, tL_messages_getWebPage.url);
                                    break;
                                }
                            }
                        }
                    }
                }
                break;
            case 3:
                TLRPC.InputGroupCall inputGroupCall = (TLRPC.InputGroupCall) obj5;
                TL_phone.toggleGroupCallSettings togglegroupcallsettings = new TL_phone.toggleGroupCallSettings();
                togglegroupcallsettings.call = inputGroupCall;
                togglegroupcallsettings.reset_invite_hash = true;
                int i16 = this.b;
                ConnectionsManager.getInstance(i16).sendRequest(togglegroupcallsettings, new org.telegram.ui.t8(i16, inputGroupCall, (String[]) obj6, (FrameLayout) obj4, (p80) obj3, (org.telegram.ui.ActionBar.z2) obj2, (org.telegram.ui.ActionBar.p6) obj));
                break;
            case 4:
                TLObject tLObject3 = (TLObject) obj5;
                org.telegram.ui.ActionBar.x1 x1Var = (org.telegram.ui.ActionBar.x1) obj6;
                Context context = (Context) obj4;
                TL_phone.exportGroupCallInvite exportgroupcallinvite = (TL_phone.exportGroupCallInvite) obj3;
                org.telegram.ui.ActionBar.p6 p6Var = (org.telegram.ui.ActionBar.p6) obj2;
                l50 l50Var = (l50) obj;
                if (tLObject3 instanceof TL_phone.exportedGroupCallInvite) {
                    x1Var.dismiss();
                    org.telegram.ui.j9.m0(context, this.b, exportgroupcallinvite.call, ((TL_phone.exportedGroupCallInvite) tLObject3).link, p6Var, true, true);
                } else {
                    x1Var.dismiss();
                }
                i0.g3(l50Var);
                break;
            case 5:
                TLObject tLObject4 = (TLObject) obj3;
                ArrayList arrayList4 = (ArrayList) obj5;
                AtomicInteger atomicInteger = (AtomicInteger) obj2;
                ArrayList arrayList5 = (ArrayList) obj6;
                org.telegram.ui.qq qqVar = (org.telegram.ui.qq) obj;
                if (((TLRPC.TL_error) obj4) == null && (tLObject4 instanceof TLRPC.TL_channels_channelParticipants)) {
                    arrayList4.set(i14, (TLRPC.TL_channels_channelParticipants) tLObject4);
                }
                atomicInteger.getAndIncrement();
                if (atomicInteger.get() == arrayList5.size()) {
                    qqVar.run();
                    break;
                }
                break;
            case 6:
                TLObject tLObject5 = (TLObject) obj6;
                TLRPC.Document document2 = (TLRPC.Document) obj4;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj3;
                TLRPC.TL_stickers_addStickerToSet tL_stickers_addStickerToSet = (TLRPC.TL_stickers_addStickerToSet) obj;
                ((org.telegram.ui.ActionBar.x1) obj5).dismiss();
                if (tLObject5 instanceof TLRPC.TL_messages_stickerSet) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject5;
                    ui.b0(i14).I1(tL_messages_stickerSet, true);
                    if (!ui.b0(i14).B0(tL_messages_stickerSet.set.id, true)) {
                        ui.b0(i14).f2(null, tLObject5, 2, null, false, false);
                    }
                    i0.h3(new gi0(13, tLObject5, document2), 250L);
                    break;
                } else if (tL_error != null) {
                    if (w8.r(tL_error.text)) {
                        w8.n(i14).u(new Object[]{tL_stickers_addStickerToSet}, obj2);
                        break;
                    } else {
                        org.telegram.ui.Components.cc.d0(tL_error);
                        break;
                    }
                }
                break;
            case 7:
                d50.a((org.telegram.ui.ActionBar.x1) obj5, (gf.e) obj6, (TLObject) obj4, this.b, (Context) obj3, (TLRPC.TL_inputGroupCallSlug) obj2, (TLRPC.TL_error) obj);
                break;
            case 8:
                LaunchActivity launchActivity = (LaunchActivity) obj5;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj6;
                TLObject tLObject6 = (TLObject) obj4;
                org.telegram.ui.ActionBar.x1 x1Var2 = (org.telegram.ui.ActionBar.x1) obj3;
                f70 f70Var = (f70) obj2;
                String str3 = (String) obj;
                ArrayList arrayList6 = launchActivity.d0;
                if (!launchActivity.isFinishing()) {
                    if (tL_error2 != null || launchActivity.q0 == null) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(launchActivity);
                        String L0 = cd.L0(R.string.AppName, null);
                        org.telegram.ui.ActionBar.x1 x1Var3 = alertDialog$Builder.a;
                        x1Var3.R = L0;
                        if (tL_error2.text.startsWith("FLOOD_WAIT")) {
                            x1Var3.T = cd.L0(2131750688, null);
                        } else if (tL_error2.text.startsWith("INVITE_HASH_EXPIRED")) {
                            x1Var3.R = cd.L0(2131750876, null);
                            x1Var3.T = cd.L0(2131749162, null);
                        } else {
                            x1Var3.T = cd.L0(2131749085, null);
                        }
                        alertDialog$Builder.k(cd.L0(2131747847, null), null);
                        launchActivity.F0(alertDialog$Builder);
                    } else {
                        TLRPC.ChatInvite chatInvite = (TLRPC.ChatInvite) tLObject6;
                        TLRPC.Chat chat = chatInvite.chat;
                        if (chat != null) {
                            if (w3.l0(chat)) {
                                TLRPC.Chat chat2 = chatInvite.chat;
                                if (!chat2.kicked) {
                                    if (!w3.t0(chat2)) {
                                        if (!(chatInvite instanceof TLRPC.TL_chatInvitePeek)) {
                                            break;
                                        }
                                    }
                                }
                            }
                            vp.r1(i14).N3(chatInvite.chat, false);
                            ArrayList arrayList7 = new ArrayList();
                            arrayList7.add(chatInvite.chat);
                            int i17 = 1;
                            hs.a0(i14).m1(null, arrayList7, false, true);
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", chatInvite.chat.id);
                            if (arrayList6.isEmpty() || vp.r1(i14).E(bundle, (org.telegram.ui.ActionBar.k2) i0.a.g(1, arrayList6), null, null)) {
                                boolean[] zArr = new boolean[1];
                                x1Var2.setOnCancelListener(new org.telegram.ui.xg(i17, zArr));
                                if (!chatInvite.chat.forum) {
                                    vp.r1(i14).s0(-chatInvite.chat.id, 0, new s90(launchActivity, f70Var, zArr, bundle, chatInvite));
                                    break;
                                } else {
                                    Bundle bundle2 = new Bundle();
                                    bundle2.putLong("chat_id", chatInvite.chat.id);
                                    launchActivity.t0(pb1.I0(launchActivity, bundle2));
                                }
                            }
                        }
                        TL_stars.TL_starsSubscriptionPricing tL_starsSubscriptionPricing = chatInvite.subscription_pricing;
                        if (tL_starsSubscriptionPricing == null || chatInvite.can_refulfill_subscription) {
                            org.telegram.ui.ActionBar.k2 k2Var = (org.telegram.ui.ActionBar.k2) i0.a.g(1, arrayList6);
                            k2Var.showDialog(new u70(launchActivity, chatInvite, str3, k2Var, k2Var instanceof org.telegram.ui.un ? ((org.telegram.ui.un) k2Var).xa : null));
                        } else {
                            long j10 = tL_starsSubscriptionPricing.amount;
                            vp.r1(i14).N3(chatInvite.chat, false);
                            rh.e6.y(launchActivity.O, false).h0(str3, chatInvite, new a80(launchActivity, j10, z10 ? 1 : 0));
                        }
                    }
                    try {
                        f70Var.run();
                        break;
                    } catch (Exception e) {
                        f8.g(e, true);
                        return;
                    }
                }
                break;
            case 9:
                LaunchActivity launchActivity2 = (LaunchActivity) obj5;
                TLObject tLObject7 = (TLObject) obj6;
                gf.e eVar2 = (gf.e) obj4;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj3;
                vp vpVar = (vp) obj2;
                String str4 = (String) obj;
                Pattern pattern = LaunchActivity.D1;
                if (tLObject7 instanceof TLRPC.User) {
                    TLRPC.User user = (TLRPC.User) tLObject7;
                    vpVar.U3(user, false, false);
                    if (h20.B(user)) {
                        if (eVar2 != null) {
                            eVar2.b();
                        }
                        launchActivity2.m0(i14, user.id, null);
                        break;
                    } else {
                        launchActivity2.Y(i14, user, str4, eVar2);
                        break;
                    }
                } else {
                    if (eVar2 != null) {
                        eVar2.b();
                    }
                    StringBuilder sb2 = new StringBuilder("cant import contact token, err=");
                    sb2.append(tL_error3 == null ? null : tL_error3.text);
                    f8.d(sb2.toString());
                    org.telegram.ui.ActionBar.k2 Q = LaunchActivity.Q();
                    if (Q != null) {
                        m5.o(null, 2131748150, org.telegram.ui.Components.cc.a0(Q), null);
                        break;
                    }
                }
                break;
            case 10:
                LaunchActivity launchActivity3 = (LaunchActivity) obj5;
                org.telegram.ui.ay ayVar = (org.telegram.ui.ay) obj4;
                org.telegram.ui.ActionBar.k2 k2Var2 = (org.telegram.ui.ActionBar.k2) obj3;
                TLRPC.User user2 = (TLRPC.User) obj2;
                String str5 = (String) obj;
                Pattern pattern2 = LaunchActivity.D1;
                if (((TLObject) obj6) instanceof TLRPC.TL_boolTrue) {
                    ui.b0(i14).E0(false, true, new ag.e3(launchActivity3, ayVar, k2Var2, user2, str5, 28));
                    break;
                }
                break;
            case 11:
                LaunchActivity launchActivity4 = (LaunchActivity) obj5;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) obj6;
                TLObject tLObject8 = (TLObject) obj4;
                TLRPC.TL_inputInvoiceSlug tL_inputInvoiceSlug = (TLRPC.TL_inputInvoiceSlug) obj3;
                f70 f70Var2 = (f70) obj2;
                String str6 = (String) obj;
                ArrayList arrayList8 = launchActivity4.d0;
                if (tL_error4 != null) {
                    if ("SUBSCRIPTION_ALREADY_ACTIVE".equalsIgnoreCase(tL_error4.text)) {
                        a02 = org.telegram.ui.Components.cc.a0((org.telegram.ui.ActionBar.k2) i0.a.g(1, arrayList8));
                        i10 = 2131747411;
                        r32 = 0;
                    } else {
                        r32 = 0;
                        a02 = org.telegram.ui.Components.cc.a0((org.telegram.ui.ActionBar.k2) i0.a.g(1, arrayList8));
                        i10 = 2131747412;
                    }
                    m5.o(r32, i10, a02, r32);
                } else if (!launchActivity4.isFinishing()) {
                    if (tLObject8 instanceof TLRPC.TL_payments_paymentFormStars) {
                        ph.w3 w3Var = launchActivity4.Z0;
                        launchActivity4.Z0 = null;
                        rh.e6.y(launchActivity4.O, false).X(null, tL_inputInvoiceSlug, (TLRPC.TL_payments_paymentFormStars) tLObject8, new y70(f70Var2, 1), new l80(w3Var, z10 ? 1 : 0));
                        break;
                    } else {
                        if (tLObject8 instanceof TLRPC.PaymentForm) {
                            TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject8;
                            vp.r1(i14).V3(paymentForm.users, false);
                            sm0Var = new sm0(paymentForm, null, str6, launchActivity4.M().getLastFragment());
                        } else {
                            sm0Var = tLObject8 instanceof TLRPC.PaymentReceipt ? new sm0((TLRPC.PaymentReceipt) tLObject8) : null;
                        }
                        if (sm0Var != null) {
                            ph.w3 w3Var2 = launchActivity4.Z0;
                            if (w3Var2 != null) {
                                launchActivity4.Z0 = null;
                                sm0Var.Z0 = new org.telegram.ui.jf(9, w3Var2);
                            }
                            launchActivity4.t0(sm0Var);
                        }
                    }
                }
                try {
                    f70Var2.run();
                    break;
                } catch (Exception e7) {
                    f8.g(e7, true);
                    return;
                }
            case 12:
                se0 se0Var = (se0) obj5;
                String str7 = (String) obj6;
                c5.g gVar = (c5.g) obj4;
                List list = (List) obj3;
                String str8 = (String) obj2;
                String str9 = (String) obj;
                hf0 hf0Var = se0Var.w;
                StringBuilder u10 = a1.g.u("LoginBilling queried \"", str7, "\" product: ");
                u10.append(u1.j(gVar.a));
                f8.b(u10.toString());
                int i18 = gVar.a;
                if (i18 != 0) {
                    se0Var.e = "BILLING_".concat(u1.j(i18));
                    new org.telegram.ui.Components.cc(hf0Var.Z, null).H(R.raw.error, cd.a0(null, null, 2131743903, u1.j(gVar.a)));
                    break;
                } else if (list != null && !list.isEmpty()) {
                    c5.m mVar = (c5.m) list.get(0);
                    c5.i a2 = mVar.a();
                    TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode = new TLRPC.TL_inputStorePaymentAuthCode();
                    tL_inputStorePaymentAuthCode.currency = a2.c;
                    tL_inputStorePaymentAuthCode.amount = (long) (Math.pow(10.0d, u1.i().h(tL_inputStorePaymentAuthCode.currency)) * (a2.b / Math.pow(10.0d, 6.0d)));
                    tL_inputStorePaymentAuthCode.phone_code_hash = TextUtils.isEmpty(str8) ? "" : str8;
                    tL_inputStorePaymentAuthCode.phone_number = str9;
                    int i19 = this.b;
                    tL_inputStorePaymentAuthCode.premium_days = i19;
                    StringBuilder u11 = a1.g.u("LoginBilling found \"", str7, "\" product, with currency=");
                    u11.append(tL_inputStorePaymentAuthCode.currency);
                    u11.append(" amount=");
                    u11.append(tL_inputStorePaymentAuthCode.amount);
                    u11.append("; phone=");
                    u11.append(str9);
                    u11.append(", phone_code_hash=");
                    u11.append(str8);
                    f8.b(u11.toString());
                    TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore = new TLRPC.TL_payments_canPurchaseStore();
                    tL_payments_canPurchaseStore.purpose = tL_inputStorePaymentAuthCode;
                    i11 = ((org.telegram.ui.ActionBar.k2) hf0Var).currentAccount;
                    ConnectionsManager.getInstance(i11).sendRequest(tL_payments_canPurchaseStore, new org.telegram.ui.t8(se0Var, a2, i19, mVar, tL_inputStorePaymentAuthCode, str7, tL_payments_canPurchaseStore, 3), 10);
                    break;
                } else {
                    se0Var.e = "PRODUCT_NOT_FOUND";
                    new org.telegram.ui.Components.cc(hf0Var.Z, null).H(R.raw.error, cd.a0(null, null, 2131743903, "PRODUCT_NOT_FOUND"));
                    break;
                }
                break;
            case 13:
                ProfileActivity profileActivity = (ProfileActivity) obj5;
                View view = (View) obj6;
                String str10 = (String) obj4;
                boolean[] zArr2 = (boolean[]) obj3;
                String[] strArr2 = (String[]) obj2;
                String str11 = (String) obj;
                RectF rectF = ProfileActivity.R6;
                if (profileActivity.getParentActivity() != null) {
                    z60 H = z60.H(profileActivity, view);
                    H.W(profileActivity.a.U0(view, false));
                    H.w = false;
                    H.c(R.drawable.msg_copy, cd.L0(2131751767, null), new ji0(profileActivity, str10, i14, 25), false);
                    H.l(R.drawable.msg_translate, cd.L0(2131743981, null), new w50(profileActivity, strArr2, str11, str10, 26), zArr2[0]);
                    H.Z();
                    break;
                }
                break;
            case 14:
                org.telegram.ui.Wallet.e2 e2Var = (org.telegram.ui.Wallet.e2) obj5;
                org.telegram.ui.Wallet.a2 a2Var = (org.telegram.ui.Wallet.a2) obj6;
                String str12 = (String) obj3;
                org.telegram.ui.Wallet.h0 h0Var = (org.telegram.ui.Wallet.h0) obj2;
                q20 q20Var = (q20) obj;
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    String str13 = a2Var.d;
                    tonconnectsession = a2Var.a;
                    JSONObject put2 = jSONObject2.put("id", str13);
                    if (i14 < 0) {
                        put2.put("result", obj4);
                    } else {
                        if (str12 == null) {
                            str12 = "Could not complete request";
                        }
                        put2.put("error", new JSONObject().put("code", i14).put("message", str12));
                    }
                    JSONObject put3 = new JSONObject().put("body", WalletEngine2.tonConnectCrypto(h0Var, tonconnectsession, a2Var.h, a2Var.g, new JSONObject().put("encrypt", put2)).getString("body")).put("traceId", a2Var.i);
                    if (i14 < 0 && "disconnect".equals(a2Var.e)) {
                        z10 = true;
                    }
                    put = put3.put("disconnect", z10);
                } catch (Exception e10) {
                    i12 = org.telegram.ui.Wallet.e2.i("encrypt response", e10);
                    jSONObject = null;
                }
                if (!vp.r1(e2Var.a).f7.edit().putString(org.telegram.ui.Wallet.e2.l(tonconnectsession.id, a2Var.b), put.toString()).commit()) {
                    throw new IllegalStateException("Could not save TON Connect response");
                }
                jSONObject = put;
                i12 = null;
                i0.g3(new m90(e2Var, jSONObject, q20Var, i12, a2Var, 23));
                break;
                break;
            case 15:
                boolean[] zArr3 = (boolean[]) obj5;
                Context context2 = (Context) obj6;
                TLRPC.User user3 = (TLRPC.User) obj4;
                JSONObject jSONObject3 = (JSONObject) obj3;
                org.telegram.ui.ActionBar.p6 p6Var2 = (org.telegram.ui.ActionBar.p6) obj2;
                org.telegram.ui.Wallet.r2 r2Var = (org.telegram.ui.Wallet.r2) obj;
                if (!zArr3[0]) {
                    zArr3[0] = true;
                    int i20 = this.b;
                    org.telegram.ui.Wallet.k0 x10 = org.telegram.ui.Wallet.k0.x(i20);
                    String t10 = x10.t();
                    byte[] y3 = x10.y();
                    if (t10 == null || y3 == null || x10.b == null) {
                        org.telegram.ui.Components.cc.b0(cd.L0(2131742985, null));
                        r2Var.a();
                        break;
                    } else {
                        int currentTime = ConnectionsManager.getInstance(i20).getCurrentTime();
                        try {
                            if ("signData".equals(jSONObject3.optString("method"))) {
                                JSONObject jSONObject4 = jSONObject3.getJSONObject("payload");
                                org.telegram.ui.Wallet.e2.G(t10, jSONObject4);
                                org.telegram.ui.Wallet.u2.c(context2, i20, user3, jSONObject4, t10, (byte[]) y3.clone(), p6Var2, r2Var);
                            } else {
                                JSONObject jSONObject5 = jSONObject3.getJSONObject("transaction");
                                org.telegram.ui.Wallet.e2.I(jSONObject5, t10, currentTime);
                                org.telegram.ui.Wallet.u2.d(context2, i20, user3, new org.telegram.ui.Wallet.d2(jSONObject5), t10, (byte[]) y3.clone(), p6Var2, r2Var);
                            }
                            break;
                        } catch (Exception e11) {
                            org.telegram.ui.Components.cc.b0(org.telegram.ui.Wallet.e2.i("widget call", e11));
                            r2Var.a();
                            return;
                        }
                    }
                }
                break;
            case 16:
                org.telegram.ui.web.z0 z0Var = (org.telegram.ui.web.z0) obj5;
                String str14 = (String) obj6;
                TLObject tLObject9 = (TLObject) obj4;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) obj3;
                org.telegram.ui.web.v0 v0Var = (org.telegram.ui.web.v0) obj2;
                org.telegram.ui.web.x0 x0Var = (org.telegram.ui.web.x0) obj;
                try {
                    JSONObject jSONObject6 = new JSONObject();
                    jSONObject6.put("req_id", str14);
                    if (tLObject9 instanceof TLRPC.TL_dataJSON) {
                        jSONObject6.put("result", new JSONTokener(((TLRPC.TL_dataJSON) tLObject9).data).nextValue());
                    } else if (tL_error5 != null) {
                        jSONObject6.put("error", tL_error5.text);
                    }
                    org.telegram.ui.web.z0.w(i14, v0Var, x0Var, "custom_method_invoked", jSONObject6);
                    break;
                } catch (Exception e12) {
                    f8.g(e12, true);
                    z0Var.Y(null);
                    return;
                }
            case 17:
                StringBuilder sb3 = new StringBuilder();
                c3.i0.r(sb3, vp.r1(i14).U2, "/", (String) obj6, "/c/");
                sb3.append(((TL_stars.TL_starGiftCollection) obj4).collection_id);
                String sb4 = sb3.toString();
                new ph.s1((vq0) obj5, (Context) obj3, sb4, sb4, (org.telegram.ui.ActionBar.p6) obj2, (org.telegram.ui.ActionBar.k2) obj).show();
                break;
            default:
                ArrayList arrayList9 = (ArrayList) obj5;
                a0.h hVar = (a0.h) obj4;
                TLRPC.TL_error tL_error6 = (TLRPC.TL_error) obj3;
                TLObject tLObject10 = (TLObject) obj2;
                vp vpVar2 = (vp) obj;
                zf.x0 x0Var2 = ((zf.s0) obj6).h;
                if (x0Var2.j0 != 0 && i14 == x0Var2.i0 && x0Var2.D != null && x0Var2.y != null) {
                    x0Var2.Y(hVar, arrayList9, false);
                    if (tL_error6 == null) {
                        TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject10;
                        vpVar2.V3(tL_channels_channelParticipants.users, false);
                        vpVar2.P3(tL_channels_channelParticipants.chats, false);
                        x0Var2.y.isEmpty();
                        if (!tL_channels_channelParticipants.participants.isEmpty()) {
                            long e13 = d20.i(x0Var2.f).e();
                            for (int i21 = 0; i21 < tL_channels_channelParticipants.participants.size(); i21++) {
                                long C1 = jj.C1(tL_channels_channelParticipants.participants.get(i21).peer);
                                if (x0Var2.D.h(C1) < 0 && ((C1 != 0 || x0Var2.D.h(e13) < 0) && (x0Var2.k0 || (C1 != e13 && C1 != 0)))) {
                                    if (C1 >= 0) {
                                        TLRPC.User Z1 = vpVar2.Z1(Long.valueOf(C1));
                                        if (Z1 == null) {
                                            break;
                                        } else {
                                            x0Var2.y.add(Z1);
                                        }
                                    } else {
                                        TLRPC.Chat L02 = vpVar2.L0(Long.valueOf(-C1));
                                        if (L02 == null) {
                                            break;
                                        } else {
                                            x0Var2.y.add(L02);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    x0Var2.f();
                    x0Var2.V.a(!x0Var2.y.isEmpty());
                }
                x0Var2.j0 = 0;
                break;
        }
    }

    public /* synthetic */ fe(Object obj, int i10, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i11) {
        this.a = i11;
        this.c = obj;
        this.b = i10;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
        this.h = obj5;
        this.n = obj6;
    }

    public /* synthetic */ fe(Object obj, Object obj2, int i10, Object obj3, Object obj4, Object obj5, Object obj6, int i11) {
        this.a = i11;
        this.c = obj;
        this.d = obj2;
        this.b = i10;
        this.e = obj3;
        this.f = obj4;
        this.h = obj5;
        this.n = obj6;
    }

    public /* synthetic */ fe(Object obj, Object obj2, Object obj3, int i10, Object obj4, Object obj5, Object obj6, int i11) {
        this.a = i11;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = i10;
        this.f = obj4;
        this.h = obj5;
        this.n = obj6;
    }

    public /* synthetic */ fe(us usVar, TLObject tLObject, Object obj, TLObject tLObject2, Object obj2, int i10, String str, int i11) {
        this.a = i11;
        this.c = usVar;
        this.d = tLObject;
        this.e = obj;
        this.f = tLObject2;
        this.h = obj2;
        this.b = i10;
        this.n = str;
    }

    public /* synthetic */ fe(TLRPC.TL_error tL_error, TLObject tLObject, ArrayList arrayList, int i10, AtomicInteger atomicInteger, ArrayList arrayList2, org.telegram.ui.qq qqVar) {
        this.a = 5;
        this.e = tL_error;
        this.f = tLObject;
        this.c = arrayList;
        this.b = i10;
        this.h = atomicInteger;
        this.d = arrayList2;
        this.n = qqVar;
    }

    public /* synthetic */ fe(se0 se0Var, String str, c5.g gVar, List list, String str2, String str3, int i10) {
        this.a = 12;
        this.c = se0Var;
        this.d = str;
        this.e = gVar;
        this.f = list;
        this.h = str2;
        this.n = str3;
        this.b = i10;
    }

    public /* synthetic */ fe(org.telegram.ui.web.z0 z0Var, String str, TLObject tLObject, TLRPC.TL_error tL_error, int i10, org.telegram.ui.web.v0 v0Var, org.telegram.ui.web.x0 x0Var) {
        this.a = 16;
        this.c = z0Var;
        this.d = str;
        this.e = tLObject;
        this.f = tL_error;
        this.b = i10;
        this.h = v0Var;
        this.n = x0Var;
    }

    public /* synthetic */ fe(zf.s0 s0Var, int i10, ArrayList arrayList, a0.h hVar, TLRPC.TL_error tL_error, TLObject tLObject, vp vpVar) {
        this.a = 18;
        this.d = s0Var;
        this.b = i10;
        this.c = arrayList;
        this.e = hVar;
        this.f = tL_error;
        this.h = tLObject;
        this.n = vpVar;
    }
}
