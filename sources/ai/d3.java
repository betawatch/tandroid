package ai;

import android.content.Context;
import android.graphics.RectF;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import ci.e9;
import ei.p7;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;
import org.json.JSONTokener;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.a8;
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cs;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.messenger.hs;
import org.telegram.messenger.ky;
import org.telegram.messenger.l10;
import org.telegram.messenger.li;
import org.telegram.messenger.pe;
import org.telegram.messenger.qr;
import org.telegram.messenger.r8;
import org.telegram.messenger.u10;
import org.telegram.messenger.yy;
import org.telegram.messenger.zi;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.f60;
import org.telegram.ui.Components.fc;
import org.telegram.ui.Components.j50;
import org.telegram.ui.Components.s70;
import org.telegram.ui.Components.vp0;
import org.telegram.ui.Components.x60;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.Wallet.WalletEngine2;
import org.telegram.ui.dl0;
import org.telegram.ui.eg;
import org.telegram.ui.f70;
import org.telegram.ui.h40;
import org.telegram.ui.h9;
import org.telegram.ui.id0;
import org.telegram.ui.ih0;
import org.telegram.ui.l80;
import org.telegram.ui.lq;
import org.telegram.ui.ly;
import org.telegram.ui.m91;
import org.telegram.ui.pp;
import org.telegram.ui.rw;
import org.telegram.ui.se;
import org.telegram.ui.t60;
import org.telegram.ui.t8;
import org.telegram.ui.uw;
import org.telegram.ui.wm;
import org.telegram.ui.xd0;
import org.telegram.ui.xt0;
import org.telegram.ui.z30;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class d3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object n;

    public /* synthetic */ d3(int i3, FrameLayout frameLayout, TLRPC.InputGroupCall inputGroupCall, org.telegram.ui.ActionBar.t2 t2Var, org.telegram.ui.ActionBar.e6 e6Var, s70 s70Var, String[] strArr) {
        this.a = 5;
        this.c = inputGroupCall;
        this.b = i3;
        this.d = strArr;
        this.e = frameLayout;
        this.f = s70Var;
        this.n = t2Var;
        this.h = e6Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:160:0x0493, code lost:
    
        if (r12.chat.has_geo != false) goto L147;
     */
    /* JADX WARN: Type inference failed for: r9v19 */
    /* JADX WARN: Type inference failed for: r9v20, types: [java.lang.String, org.telegram.ui.ActionBar.e6] */
    /* JADX WARN: Type inference failed for: r9v21 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        ly lyVar;
        dl0 dl0Var;
        ?? r9;
        fc a02;
        int i3;
        int i10;
        String i11;
        JSONObject jSONObject;
        TL_wallet.tonConnectSession tonconnectsession;
        JSONObject put;
        int i12 = this.a;
        int i13 = 2;
        int i14 = 9;
        int i15 = this.b;
        boolean z10 = false;
        z10 = false;
        Object obj = this.n;
        Object obj2 = this.h;
        Object obj3 = this.f;
        Object obj4 = this.e;
        Object obj5 = this.d;
        Object obj6 = this.c;
        switch (i12) {
            case 0:
                StringBuilder sb2 = new StringBuilder();
                com.google.android.recaptcha.internal.a.s(sb2, hp.s1(i15).V2, "/", (String) obj5, "/c/");
                sb2.append(((TL_stars.TL_starGiftCollection) obj4).collection_id);
                String sb3 = sb2.toString();
                new t3((vp0) obj6, (Context) obj3, sb3, sb3, (org.telegram.ui.ActionBar.e6) obj2, (org.telegram.ui.ActionBar.d2) obj).show();
                break;
            case 1:
                ArrayList arrayList = (ArrayList) obj5;
                a0.h hVar = (a0.h) obj4;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj3;
                TLObject tLObject = (TLObject) obj2;
                hp hpVar = (hp) obj;
                kg.e1 e1Var = ((kg.z0) obj6).h;
                if (e1Var.k0 != 0 && i15 == e1Var.j0 && e1Var.E != null && e1Var.y != null) {
                    e1Var.Y(hVar, arrayList, false);
                    if (tL_error == null) {
                        TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject;
                        hpVar.Y3(tL_channels_channelParticipants.users, false);
                        hpVar.S3(tL_channels_channelParticipants.chats, false);
                        e1Var.y.isEmpty();
                        if (!tL_channels_channelParticipants.participants.isEmpty()) {
                            long e10 = h10.i(e1Var.f).e();
                            for (int i16 = 0; i16 < tL_channels_channelParticipants.participants.size(); i16++) {
                                long C1 = zi.C1(tL_channels_channelParticipants.participants.get(i16).peer);
                                if (e1Var.E.h(C1) < 0 && ((C1 != 0 || e1Var.E.h(e10) < 0) && (e1Var.l0 || (C1 != e10 && C1 != 0)))) {
                                    if (C1 >= 0) {
                                        TLRPC.User a22 = hpVar.a2(Long.valueOf(C1));
                                        if (a22 == null) {
                                            break;
                                        } else {
                                            e1Var.y.add(a22);
                                        }
                                    } else {
                                        TLRPC.Chat M0 = hpVar.M0(Long.valueOf(-C1));
                                        if (M0 == null) {
                                            break;
                                        } else {
                                            e1Var.y.add(M0);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    e1Var.f();
                    e1Var.W.a(!e1Var.y.isEmpty());
                }
                e1Var.k0 = 0;
                break;
            case 2:
                ArrayList arrayList2 = (ArrayList) obj6;
                ArrayList arrayList3 = (ArrayList) obj5;
                Integer num = (Integer) obj4;
                pe peVar = (pe) obj3;
                pe peVar2 = (pe) obj2;
                pe peVar3 = (pe) obj;
                String[] strArr = MediaController.W1;
                boolean U1 = PhotoViewer.v1().U1();
                int i17 = this.b;
                if (!U1 || MediaController.h2) {
                    MediaController.c2 = arrayList2;
                    MediaController.d2 = arrayList3;
                    MediaController.e2 = null;
                    MediaController.b2 = peVar2;
                    MediaController.a2 = peVar;
                    hs.e().k(hs.r2, Integer.valueOf(i17), arrayList2, arrayList3, num);
                    break;
                } else {
                    d3 d3Var = MediaController.e2;
                    if (d3Var != null) {
                        org.telegram.messenger.g0.r(d3Var);
                    }
                    d3 d3Var2 = new d3(i17, arrayList2, arrayList3, num, peVar, peVar2, peVar3);
                    MediaController.e2 = d3Var2;
                    org.telegram.messenger.g0.i3(d3Var2, 1000);
                    break;
                }
                break;
            case 3:
                yy yyVar = (yy) obj6;
                TLObject tLObject2 = (TLObject) obj4;
                TLRPC.InputFile inputFile = (TLRPC.InputFile) obj3;
                TLRPC.InputMedia inputMedia = (TLRPC.InputMedia) obj2;
                ky kyVar = (ky) obj;
                String str = (String) obj5;
                yyVar.getClass();
                if (tLObject2 instanceof TLRPC.TL_messageMediaDocument) {
                    TLRPC.TL_inputMediaUploadedPhoto tL_inputMediaUploadedPhoto = new TLRPC.TL_inputMediaUploadedPhoto();
                    tL_inputMediaUploadedPhoto.live_photo = true;
                    tL_inputMediaUploadedPhoto.file = inputFile;
                    tL_inputMediaUploadedPhoto.spoiler = inputMedia.spoiler;
                    TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                    tL_inputMediaUploadedPhoto.video = tL_inputDocument;
                    TLRPC.Document document = ((TLRPC.TL_messageMediaDocument) tLObject2).document;
                    tL_inputDocument.id = document.id;
                    tL_inputDocument.access_hash = document.access_hash;
                    byte[] bArr = document.file_reference;
                    tL_inputDocument.file_reference = bArr;
                    if (bArr == null) {
                        tL_inputDocument.file_reference = new byte[0];
                    }
                    TLRPC.TL_messages_sendMultiMedia tL_messages_sendMultiMedia = (TLRPC.TL_messages_sendMultiMedia) kyVar.c;
                    if (i15 >= 0 && i15 < tL_messages_sendMultiMedia.multi_media.size()) {
                        tL_messages_sendMultiMedia.multi_media.get(i15).media = tL_inputMediaUploadedPhoto;
                    }
                    ArrayList arrayList4 = kyVar.A;
                    if (arrayList4 != null && i15 >= 0 && i15 < arrayList4.size()) {
                        kyVar.A.set(i15, tL_inputMediaUploadedPhoto);
                    }
                    kyVar.j = null;
                    kyVar.i = null;
                    HashMap hashMap = kyVar.E;
                    if (hashMap != null) {
                        hashMap.remove(str + "_ct");
                    }
                    yyVar.A0(kyVar, tL_inputMediaUploadedPhoto, null, str);
                    break;
                } else {
                    kyVar.c();
                    break;
                }
                break;
            case 4:
                org.telegram.ui.i4 i4Var = (org.telegram.ui.i4) obj6;
                sf.b bVar = (sf.b) obj4;
                TLObject tLObject3 = (TLObject) obj3;
                String str2 = (String) obj5;
                org.telegram.ui.g0 g0Var = (org.telegram.ui.g0) obj2;
                TLRPC.TL_messages_getWebPage tL_messages_getWebPage = (TLRPC.TL_messages_getWebPage) obj;
                if (i4Var.H0 != 0 && i15 == i4Var.J0) {
                    if (bVar != null) {
                        bVar.b();
                    }
                    i4Var.H0 = 0;
                    i4Var.Z(false);
                    if (i4Var.W) {
                        if (tLObject3 instanceof TLRPC.TL_messages_webPage) {
                            TLRPC.TL_messages_webPage tL_messages_webPage = (TLRPC.TL_messages_webPage) tLObject3;
                            hp.s1(i4Var.Y).Y3(tL_messages_webPage.users, false);
                            hp.s1(i4Var.Y).S3(tL_messages_webPage.chats, false);
                            TLRPC.WebPage webPage = tL_messages_webPage.webpage;
                            if (webPage == null || !(webPage.cached_page instanceof TL_iv.TL_page)) {
                                if (!((Boolean) g0Var.run()).booleanValue()) {
                                    if (hp.s1(i4Var.Y).N2(tL_messages_getWebPage.url)) {
                                        i4Var.e(1, tL_messages_getWebPage.url);
                                        break;
                                    } else {
                                        sf.c.t(i4Var.M, tL_messages_getWebPage.url);
                                        break;
                                    }
                                }
                            } else {
                                i4Var.f(webPage, str2, 1);
                                break;
                            }
                        } else {
                            if (tLObject3 instanceof TLRPC.TL_webPage) {
                                TLRPC.TL_webPage tL_webPage = (TLRPC.TL_webPage) tLObject3;
                                if (tL_webPage.cached_page instanceof TL_iv.TL_page) {
                                    i4Var.f(tL_webPage, str2, 1);
                                    break;
                                }
                            }
                            if (!((Boolean) g0Var.run()).booleanValue()) {
                                if (hp.s1(i4Var.Y).N2(tL_messages_getWebPage.url)) {
                                    i4Var.e(1, tL_messages_getWebPage.url);
                                    break;
                                } else {
                                    sf.c.t(i4Var.M, tL_messages_getWebPage.url);
                                    break;
                                }
                            }
                        }
                    }
                }
                break;
            case 5:
                TLRPC.InputGroupCall inputGroupCall = (TLRPC.InputGroupCall) obj6;
                s70 s70Var = (s70) obj3;
                TL_phone.toggleGroupCallSettings togglegroupcallsettings = new TL_phone.toggleGroupCallSettings();
                togglegroupcallsettings.call = inputGroupCall;
                togglegroupcallsettings.reset_invite_hash = true;
                int i18 = this.b;
                ConnectionsManager.getInstance(i18).sendRequest(togglegroupcallsettings, new t8(i18, (FrameLayout) obj4, inputGroupCall, (org.telegram.ui.ActionBar.t2) obj, (org.telegram.ui.ActionBar.e6) obj2, s70Var, (String[]) obj5));
                break;
            case 6:
                TLObject tLObject4 = (TLObject) obj6;
                org.telegram.ui.ActionBar.s1 s1Var = (org.telegram.ui.ActionBar.s1) obj5;
                Context context = (Context) obj3;
                TL_phone.exportGroupCallInvite exportgroupcallinvite = (TL_phone.exportGroupCallInvite) obj4;
                org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) obj2;
                h40 h40Var = (h40) obj;
                if (tLObject4 instanceof TL_phone.exportedGroupCallInvite) {
                    s1Var.dismiss();
                    h9.n0(context, this.b, exportgroupcallinvite.call, ((TL_phone.exportedGroupCallInvite) tLObject4).link, e6Var, true, true);
                } else {
                    s1Var.dismiss();
                }
                org.telegram.messenger.g0.h3(h40Var);
                break;
            case 7:
                TLObject tLObject5 = (TLObject) obj5;
                ArrayList arrayList5 = (ArrayList) obj4;
                AtomicInteger atomicInteger = (AtomicInteger) obj3;
                ArrayList arrayList6 = (ArrayList) obj2;
                pp ppVar = (pp) obj;
                if (((TLRPC.TL_error) obj6) == null && (tLObject5 instanceof TLRPC.TL_channels_channelParticipants)) {
                    arrayList5.set(i15, (TLRPC.TL_channels_channelParticipants) tLObject5);
                }
                atomicInteger.getAndIncrement();
                if (atomicInteger.get() == arrayList6.size()) {
                    ppVar.run();
                    break;
                }
                break;
            case 8:
                TLObject tLObject6 = (TLObject) obj5;
                TLRPC.Document document2 = (TLRPC.Document) obj4;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj3;
                TLRPC.TL_stickers_addStickerToSet tL_stickers_addStickerToSet = (TLRPC.TL_stickers_addStickerToSet) obj;
                ((org.telegram.ui.ActionBar.s1) obj6).dismiss();
                if (tLObject6 instanceof TLRPC.TL_messages_stickerSet) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject6;
                    li.b0(i15).I1(tL_messages_stickerSet, true);
                    if (!li.b0(i15).B0(tL_messages_stickerSet.set.id, true)) {
                        li.b0(i15).f2(null, tLObject6, 2, null, false, false);
                    }
                    org.telegram.messenger.g0.i3(new j50(24, tLObject6, document2), 250L);
                    break;
                } else if (tL_error2 != null) {
                    if (r8.r(tL_error2.text)) {
                        r8.n(i15).u(new Object[]{tL_stickers_addStickerToSet}, obj2);
                        break;
                    } else {
                        fc.d0(tL_error2);
                        break;
                    }
                }
                break;
            case 9:
                z30.a((org.telegram.ui.ActionBar.s1) obj6, (sf.b) obj5, (TLObject) obj4, this.b, (Context) obj3, (TLRPC.TL_inputGroupCallSlug) obj2, (TLRPC.TL_error) obj);
                break;
            case 10:
                LaunchActivity launchActivity = (LaunchActivity) obj6;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj4;
                TLObject tLObject7 = (TLObject) obj3;
                org.telegram.ui.ActionBar.s1 s1Var2 = (org.telegram.ui.ActionBar.s1) obj2;
                ly lyVar2 = (ly) obj;
                String str3 = (String) obj5;
                ArrayList arrayList7 = launchActivity.e0;
                if (!launchActivity.isFinishing()) {
                    if (tL_error3 != null || launchActivity.r0 == null) {
                        lyVar = lyVar2;
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(launchActivity);
                        String M02 = bd.M0(R.string.AppName, null);
                        org.telegram.ui.ActionBar.s1 s1Var3 = alertDialog$Builder.a;
                        s1Var3.S = M02;
                        if (tL_error3.text.startsWith("FLOOD_WAIT")) {
                            s1Var3.U = bd.M0(2131750688, null);
                        } else if (tL_error3.text.startsWith("INVITE_HASH_EXPIRED")) {
                            s1Var3.S = bd.M0(2131750876, null);
                            s1Var3.U = bd.M0(2131749160, null);
                        } else {
                            s1Var3.U = bd.M0(2131749083, null);
                        }
                        alertDialog$Builder.k(bd.M0(2131747839, null), null);
                        launchActivity.F0(alertDialog$Builder);
                    } else {
                        TLRPC.ChatInvite chatInvite = (TLRPC.ChatInvite) tLObject7;
                        TLRPC.Chat chat = chatInvite.chat;
                        if (chat != null) {
                            if (org.telegram.messenger.t3.l0(chat)) {
                                TLRPC.Chat chat2 = chatInvite.chat;
                                if (!chat2.kicked) {
                                    if (!org.telegram.messenger.t3.t0(chat2)) {
                                        if (!(chatInvite instanceof TLRPC.TL_chatInvitePeek)) {
                                            break;
                                        }
                                    }
                                }
                            }
                            hp.s1(i15).Q3(chatInvite.chat, false);
                            ArrayList arrayList8 = new ArrayList();
                            arrayList8.add(chatInvite.chat);
                            int i19 = 1;
                            qr.a0(i15).m1(null, arrayList8, false, true);
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", chatInvite.chat.id);
                            if (arrayList7.isEmpty() || hp.s1(i15).E(bundle, (org.telegram.ui.ActionBar.d2) k2.p1.h(1, arrayList7), null, null)) {
                                boolean[] zArr = new boolean[1];
                                s1Var2.setOnCancelListener(new eg(i19, zArr));
                                if (!chatInvite.chat.forum) {
                                    hp.s1(i15).s0(-chatInvite.chat.id, 0, new l80(launchActivity, lyVar2, zArr, bundle, chatInvite));
                                    break;
                                } else {
                                    Bundle bundle2 = new Bundle();
                                    bundle2.putLong("chat_id", chatInvite.chat.id);
                                    launchActivity.t0(m91.J0(launchActivity, bundle2));
                                }
                            }
                            lyVar = lyVar2;
                        }
                        lyVar = lyVar2;
                        TL_stars.TL_starsSubscriptionPricing tL_starsSubscriptionPricing = chatInvite.subscription_pricing;
                        if (tL_starsSubscriptionPricing == null || chatInvite.can_refulfill_subscription) {
                            org.telegram.ui.ActionBar.d2 d2Var = (org.telegram.ui.ActionBar.d2) k2.p1.h(1, arrayList7);
                            d2Var.showDialog(new x60(launchActivity, chatInvite, str3, d2Var, d2Var instanceof wm ? ((wm) d2Var).ya : null));
                        } else {
                            long j10 = tL_starsSubscriptionPricing.amount;
                            hp.s1(i15).Q3(chatInvite.chat, false);
                            e9.y(launchActivity.P, false).h0(str3, chatInvite, new r(launchActivity, j10, i13));
                        }
                    }
                    try {
                        lyVar.run();
                        break;
                    } catch (Exception e11) {
                        a8.g(e11, true);
                        return;
                    }
                }
                break;
            case 11:
                LaunchActivity launchActivity2 = (LaunchActivity) obj6;
                TLObject tLObject8 = (TLObject) obj4;
                sf.b bVar2 = (sf.b) obj3;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) obj2;
                hp hpVar2 = (hp) obj;
                String str4 = (String) obj5;
                String str5 = LaunchActivity.E1;
                if (tLObject8 instanceof TLRPC.User) {
                    TLRPC.User user = (TLRPC.User) tLObject8;
                    hpVar2.X3(user, false, false);
                    if (l10.B(user)) {
                        if (bVar2 != null) {
                            bVar2.b();
                        }
                        launchActivity2.m0(i15, user.id, null);
                        break;
                    } else {
                        launchActivity2.Y(i15, user, str4, bVar2);
                        break;
                    }
                } else {
                    if (bVar2 != null) {
                        bVar2.b();
                    }
                    StringBuilder sb4 = new StringBuilder("cant import contact token, err=");
                    sb4.append(tL_error4 == null ? null : tL_error4.text);
                    a8.d(sb4.toString());
                    org.telegram.ui.ActionBar.d2 Q = LaunchActivity.Q();
                    if (Q != null) {
                        org.telegram.messenger.k5.p(null, 2131748142, fc.a0(Q), null);
                        break;
                    }
                }
                break;
            case 12:
                LaunchActivity launchActivity3 = (LaunchActivity) obj6;
                uw uwVar = (uw) obj3;
                org.telegram.ui.ActionBar.d2 d2Var2 = (org.telegram.ui.ActionBar.d2) obj;
                TLRPC.User user2 = (TLRPC.User) obj2;
                String str6 = (String) obj5;
                String str7 = LaunchActivity.E1;
                if (((TLObject) obj4) instanceof TLRPC.TL_boolTrue) {
                    li.b0(i15).E0(false, true, new lq(launchActivity3, uwVar, d2Var2, user2, str6, 10));
                    break;
                }
                break;
            case 13:
                LaunchActivity launchActivity4 = (LaunchActivity) obj6;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) obj4;
                TLObject tLObject9 = (TLObject) obj3;
                TLRPC.TL_inputInvoiceSlug tL_inputInvoiceSlug = (TLRPC.TL_inputInvoiceSlug) obj2;
                ly lyVar3 = (ly) obj;
                String str8 = (String) obj5;
                ArrayList arrayList9 = launchActivity4.e0;
                if (tL_error5 != null) {
                    if ("SUBSCRIPTION_ALREADY_ACTIVE".equalsIgnoreCase(tL_error5.text)) {
                        a02 = fc.a0((org.telegram.ui.ActionBar.d2) k2.p1.h(1, arrayList9));
                        i3 = 2131747403;
                        r9 = 0;
                    } else {
                        r9 = 0;
                        a02 = fc.a0((org.telegram.ui.ActionBar.d2) k2.p1.h(1, arrayList9));
                        i3 = 2131747404;
                    }
                    org.telegram.messenger.k5.p(r9, i3, a02, r9);
                } else if (!launchActivity4.isFinishing()) {
                    if (tLObject9 instanceof TLRPC.TL_payments_paymentFormStars) {
                        p6 p6Var = launchActivity4.a1;
                        launchActivity4.a1 = null;
                        e9.y(launchActivity4.P, false).X(null, tL_inputInvoiceSlug, (TLRPC.TL_payments_paymentFormStars) tLObject9, new t60(lyVar3, 1), new f70(p6Var, z10 ? 1 : 0));
                        break;
                    } else {
                        if (tLObject9 instanceof TLRPC.PaymentForm) {
                            TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject9;
                            hp.s1(i15).Y3(paymentForm.users, false);
                            dl0Var = new dl0(paymentForm, null, str8, launchActivity4.M().getLastFragment());
                        } else {
                            dl0Var = tLObject9 instanceof TLRPC.PaymentReceipt ? new dl0((TLRPC.PaymentReceipt) tLObject9) : null;
                        }
                        if (dl0Var != null) {
                            p6 p6Var2 = launchActivity4.a1;
                            if (p6Var2 != null) {
                                launchActivity4.a1 = null;
                                dl0Var.a1 = new se(i14, p6Var2);
                            }
                            launchActivity4.t0(dl0Var);
                        }
                    }
                }
                try {
                    lyVar3.run();
                    break;
                } catch (Exception e12) {
                    a8.g(e12, true);
                    return;
                }
            case 14:
                id0 id0Var = (id0) obj6;
                String str9 = (String) obj5;
                e5.f fVar = (e5.f) obj4;
                List list = (List) obj3;
                String str10 = (String) obj2;
                String str11 = (String) obj;
                xd0 xd0Var = id0Var.w;
                StringBuilder u10 = a1.g.u("LoginBilling queried \"", str9, "\" product: ");
                u10.append(org.telegram.messenger.r1.j(fVar.a));
                a8.b(u10.toString());
                int i20 = fVar.a;
                if (i20 != 0) {
                    id0Var.e = "BILLING_".concat(org.telegram.messenger.r1.j(i20));
                    new fc(xd0Var.a0, null).H(R.raw.error, bd.a0(null, null, 2131743888, org.telegram.messenger.r1.j(fVar.a)));
                    break;
                } else if (list != null && !list.isEmpty()) {
                    e5.l lVar = (e5.l) list.get(0);
                    e5.h a10 = lVar.a();
                    TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode = new TLRPC.TL_inputStorePaymentAuthCode();
                    tL_inputStorePaymentAuthCode.currency = a10.c;
                    tL_inputStorePaymentAuthCode.amount = (long) (Math.pow(10.0d, org.telegram.messenger.r1.i().h(tL_inputStorePaymentAuthCode.currency)) * (a10.b / Math.pow(10.0d, 6.0d)));
                    tL_inputStorePaymentAuthCode.phone_code_hash = TextUtils.isEmpty(str10) ? "" : str10;
                    tL_inputStorePaymentAuthCode.phone_number = str11;
                    int i21 = this.b;
                    tL_inputStorePaymentAuthCode.premium_days = i21;
                    StringBuilder u11 = a1.g.u("LoginBilling found \"", str9, "\" product, with currency=");
                    u11.append(tL_inputStorePaymentAuthCode.currency);
                    u11.append(" amount=");
                    u11.append(tL_inputStorePaymentAuthCode.amount);
                    u11.append("; phone=");
                    u11.append(str11);
                    u11.append(", phone_code_hash=");
                    u11.append(str10);
                    a8.b(u11.toString());
                    TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore = new TLRPC.TL_payments_canPurchaseStore();
                    tL_payments_canPurchaseStore.purpose = tL_inputStorePaymentAuthCode;
                    i10 = ((org.telegram.ui.ActionBar.d2) xd0Var).currentAccount;
                    ConnectionsManager.getInstance(i10).sendRequest(tL_payments_canPurchaseStore, new t8(id0Var, a10, i21, lVar, tL_inputStorePaymentAuthCode, str9, tL_payments_canPurchaseStore, 3), 10);
                    break;
                } else {
                    id0Var.e = "PRODUCT_NOT_FOUND";
                    new fc(xd0Var.a0, null).H(R.raw.error, bd.a0(null, null, 2131743888, "PRODUCT_NOT_FOUND"));
                    break;
                }
                break;
            case 15:
                ProfileActivity profileActivity = (ProfileActivity) obj6;
                View view = (View) obj4;
                String str12 = (String) obj5;
                boolean[] zArr2 = (boolean[]) obj3;
                String[] strArr2 = (String[]) obj2;
                String str13 = (String) obj;
                RectF rectF = ProfileActivity.T6;
                if (profileActivity.getParentActivity() != null) {
                    f60 H = f60.H(profileActivity, view);
                    H.W(profileActivity.a.U0(view, false));
                    H.w = false;
                    H.c(R.drawable.msg_copy, bd.M0(2131751767, null), new rw(profileActivity, str12, i15, i14), false);
                    H.l(R.drawable.msg_translate, bd.M0(2131743966, null), new ih0(profileActivity, strArr2, str13, str12, 12), zArr2[0]);
                    H.Z();
                    break;
                }
                break;
            case 16:
                org.telegram.ui.Wallet.c2 c2Var = (org.telegram.ui.Wallet.c2) obj6;
                org.telegram.ui.Wallet.y1 y1Var = (org.telegram.ui.Wallet.y1) obj4;
                String str14 = (String) obj5;
                org.telegram.ui.Wallet.h0 h0Var = (org.telegram.ui.Wallet.h0) obj2;
                u10 u10Var = (u10) obj;
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    String str15 = y1Var.d;
                    tonconnectsession = y1Var.a;
                    JSONObject put2 = jSONObject2.put("id", str15);
                    if (i15 < 0) {
                        put2.put("result", obj3);
                    } else {
                        if (str14 == null) {
                            str14 = "Could not complete request";
                        }
                        put2.put("error", new JSONObject().put("code", i15).put("message", str14));
                    }
                    JSONObject put3 = new JSONObject().put("body", WalletEngine2.tonConnectCrypto(h0Var, tonconnectsession, y1Var.h, y1Var.g, new JSONObject().put("encrypt", put2)).getString("body")).put("traceId", y1Var.i);
                    if (i15 < 0 && "disconnect".equals(y1Var.e)) {
                        z10 = true;
                    }
                    put = put3.put("disconnect", z10);
                } catch (Exception e13) {
                    i11 = org.telegram.ui.Wallet.c2.i("encrypt response", e13);
                    jSONObject = null;
                }
                if (!hp.s1(c2Var.a).e7.edit().putString(org.telegram.ui.Wallet.c2.l(tonconnectsession.id, y1Var.b), put.toString()).commit()) {
                    throw new IllegalStateException("Could not save TON Connect response");
                }
                jSONObject = put;
                i11 = null;
                org.telegram.messenger.g0.h3(new xt0(c2Var, jSONObject, u10Var, i11, y1Var, 5));
                break;
                break;
            case 17:
                boolean[] zArr3 = (boolean[]) obj6;
                Context context2 = (Context) obj3;
                TLRPC.User user3 = (TLRPC.User) obj5;
                JSONObject jSONObject3 = (JSONObject) obj4;
                org.telegram.ui.ActionBar.e6 e6Var2 = (org.telegram.ui.ActionBar.e6) obj2;
                org.telegram.ui.Wallet.q2 q2Var = (org.telegram.ui.Wallet.q2) obj;
                if (!zArr3[0]) {
                    zArr3[0] = true;
                    int i22 = this.b;
                    org.telegram.ui.Wallet.k0 x10 = org.telegram.ui.Wallet.k0.x(i22);
                    String t10 = x10.t();
                    byte[] y9 = x10.y();
                    if (t10 == null || y9 == null || x10.b == null) {
                        fc.b0(bd.M0(2131742969, null));
                        q2Var.a();
                        break;
                    } else {
                        int currentTime = ConnectionsManager.getInstance(i22).getCurrentTime();
                        try {
                            if ("signData".equals(jSONObject3.optString("method"))) {
                                JSONObject jSONObject4 = jSONObject3.getJSONObject("payload");
                                org.telegram.ui.Wallet.c2.G(t10, jSONObject4);
                                org.telegram.ui.Wallet.t2.c(context2, i22, user3, jSONObject4, t10, (byte[]) y9.clone(), e6Var2, q2Var);
                            } else {
                                JSONObject jSONObject5 = jSONObject3.getJSONObject("transaction");
                                org.telegram.ui.Wallet.c2.I(jSONObject5, t10, currentTime);
                                org.telegram.ui.Wallet.t2.d(context2, i22, user3, new org.telegram.ui.Wallet.b2(jSONObject5), t10, (byte[]) y9.clone(), e6Var2, q2Var);
                            }
                            break;
                        } catch (Exception e14) {
                            fc.b0(org.telegram.ui.Wallet.c2.i("widget call", e14));
                            q2Var.a();
                            return;
                        }
                    }
                }
                break;
            default:
                org.telegram.ui.web.w0 w0Var = (org.telegram.ui.web.w0) obj6;
                String str16 = (String) obj5;
                TLObject tLObject10 = (TLObject) obj4;
                TLRPC.TL_error tL_error6 = (TLRPC.TL_error) obj3;
                org.telegram.ui.web.t0 t0Var = (org.telegram.ui.web.t0) obj2;
                p7 p7Var = (p7) obj;
                try {
                    JSONObject jSONObject6 = new JSONObject();
                    jSONObject6.put("req_id", str16);
                    if (tLObject10 instanceof TLRPC.TL_dataJSON) {
                        jSONObject6.put("result", new JSONTokener(((TLRPC.TL_dataJSON) tLObject10).data).nextValue());
                    } else if (tL_error6 != null) {
                        jSONObject6.put("error", tL_error6.text);
                    }
                    org.telegram.ui.web.w0.w(i15, t0Var, p7Var, "custom_method_invoked", jSONObject6);
                    break;
                } catch (Exception e15) {
                    a8.g(e15, true);
                    w0Var.Y(null);
                }
        }
    }

    public /* synthetic */ d3(int i3, ArrayList arrayList, ArrayList arrayList2, Integer num, pe peVar, pe peVar2, pe peVar3) {
        this.a = 2;
        this.b = i3;
        this.c = arrayList;
        this.d = arrayList2;
        this.e = num;
        this.f = peVar;
        this.h = peVar2;
        this.n = peVar3;
    }

    public /* synthetic */ d3(Object obj, int i3, Serializable serializable, Object obj2, Object obj3, Object obj4, Object obj5, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = i3;
        this.d = serializable;
        this.e = obj2;
        this.f = obj3;
        this.h = obj4;
        this.n = obj5;
    }

    public /* synthetic */ d3(Object obj, Object obj2, Object obj3, int i3, Object obj4, Object obj5, Object obj6, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = i3;
        this.f = obj4;
        this.h = obj5;
        this.n = obj6;
    }

    public /* synthetic */ d3(cs csVar, TLObject tLObject, Object obj, TLObject tLObject2, Object obj2, int i3, String str, int i10) {
        this.a = i10;
        this.c = csVar;
        this.e = tLObject;
        this.f = obj;
        this.h = tLObject2;
        this.n = obj2;
        this.b = i3;
        this.d = str;
    }

    public /* synthetic */ d3(TLObject tLObject, org.telegram.ui.ActionBar.s1 s1Var, Context context, int i3, TL_phone.exportGroupCallInvite exportgroupcallinvite, org.telegram.ui.ActionBar.e6 e6Var, h40 h40Var) {
        this.a = 6;
        this.c = tLObject;
        this.d = s1Var;
        this.f = context;
        this.b = i3;
        this.e = exportgroupcallinvite;
        this.h = e6Var;
        this.n = h40Var;
    }

    public /* synthetic */ d3(org.telegram.ui.ActionBar.s1 s1Var, TLObject tLObject, int i3, TLRPC.Document document, TLRPC.TL_error tL_error, Object obj, TLRPC.TL_stickers_addStickerToSet tL_stickers_addStickerToSet) {
        this.a = 8;
        this.c = s1Var;
        this.d = tLObject;
        this.b = i3;
        this.e = document;
        this.f = tL_error;
        this.h = obj;
        this.n = tL_stickers_addStickerToSet;
    }

    public /* synthetic */ d3(org.telegram.ui.i4 i4Var, int i3, sf.b bVar, TLObject tLObject, String str, org.telegram.ui.g0 g0Var, TLRPC.TL_messages_getWebPage tL_messages_getWebPage) {
        this.a = 4;
        this.c = i4Var;
        this.b = i3;
        this.e = bVar;
        this.f = tLObject;
        this.d = str;
        this.h = g0Var;
        this.n = tL_messages_getWebPage;
    }

    public /* synthetic */ d3(LaunchActivity launchActivity, TLObject tLObject, int i3, uw uwVar, org.telegram.ui.ActionBar.d2 d2Var, TLRPC.User user, String str) {
        this.a = 12;
        this.c = launchActivity;
        this.e = tLObject;
        this.b = i3;
        this.f = uwVar;
        this.n = d2Var;
        this.h = user;
        this.d = str;
    }

    public /* synthetic */ d3(LaunchActivity launchActivity, TLRPC.TL_error tL_error, TLObject tLObject, int i3, org.telegram.ui.ActionBar.s1 s1Var, ly lyVar, String str) {
        this.a = 10;
        this.c = launchActivity;
        this.e = tL_error;
        this.f = tLObject;
        this.b = i3;
        this.h = s1Var;
        this.n = lyVar;
        this.d = str;
    }

    public /* synthetic */ d3(id0 id0Var, String str, e5.f fVar, List list, String str2, String str3, int i3) {
        this.a = 14;
        this.c = id0Var;
        this.d = str;
        this.e = fVar;
        this.f = list;
        this.h = str2;
        this.n = str3;
        this.b = i3;
    }

    public /* synthetic */ d3(ProfileActivity profileActivity, View view, String str, int i3, boolean[] zArr, String[] strArr, String str2) {
        this.a = 15;
        this.c = profileActivity;
        this.e = view;
        this.d = str;
        this.b = i3;
        this.f = zArr;
        this.h = strArr;
        this.n = str2;
    }

    public /* synthetic */ d3(org.telegram.ui.Wallet.c2 c2Var, org.telegram.ui.Wallet.y1 y1Var, int i3, Object obj, String str, org.telegram.ui.Wallet.h0 h0Var, u10 u10Var) {
        this.a = 16;
        this.c = c2Var;
        this.e = y1Var;
        this.b = i3;
        this.f = obj;
        this.d = str;
        this.h = h0Var;
        this.n = u10Var;
    }

    public /* synthetic */ d3(org.telegram.ui.web.w0 w0Var, String str, TLObject tLObject, TLRPC.TL_error tL_error, int i3, org.telegram.ui.web.t0 t0Var, p7 p7Var) {
        this.a = 18;
        this.c = w0Var;
        this.d = str;
        this.e = tLObject;
        this.f = tL_error;
        this.b = i3;
        this.h = t0Var;
        this.n = p7Var;
    }

    public /* synthetic */ d3(boolean[] zArr, Context context, int i3, TLRPC.User user, JSONObject jSONObject, org.telegram.ui.ActionBar.e6 e6Var, org.telegram.ui.Wallet.q2 q2Var) {
        this.a = 17;
        this.c = zArr;
        this.f = context;
        this.b = i3;
        this.d = user;
        this.e = jSONObject;
        this.h = e6Var;
        this.n = q2Var;
    }
}
