package jg;

import android.content.Context;
import android.graphics.RectF;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import bi.ea;
import di.p7;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;
import org.json.JSONTokener;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.a8;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.c20;
import org.telegram.messenger.gz;
import org.telegram.messenger.id;
import org.telegram.messenger.ij;
import org.telegram.messenger.k5;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.messenger.r8;
import org.telegram.messenger.sy;
import org.telegram.messenger.t10;
import org.telegram.messenger.t3;
import org.telegram.messenger.ui;
import org.telegram.messenger.we;
import org.telegram.messenger.yr;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.f2;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.v2;
import org.telegram.ui.Components.c70;
import org.telegram.ui.Components.hc;
import org.telegram.ui.Components.l60;
import org.telegram.ui.Components.o10;
import org.telegram.ui.Components.vp0;
import org.telegram.ui.Components.w80;
import org.telegram.ui.Components.x70;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.Wallet.WalletEngine2;
import org.telegram.ui.Wallet.q2;
import org.telegram.ui.Wallet.t2;
import org.telegram.ui.b70;
import org.telegram.ui.cn;
import org.telegram.ui.ee0;
import org.telegram.ui.f10;
import org.telegram.ui.g4;
import org.telegram.ui.g40;
import org.telegram.ui.i9;
import org.telegram.ui.ig;
import org.telegram.ui.jl0;
import org.telegram.ui.lo0;
import org.telegram.ui.n70;
import org.telegram.ui.nd0;
import org.telegram.ui.o40;
import org.telegram.ui.q80;
import org.telegram.ui.qw0;
import org.telegram.ui.s10;
import org.telegram.ui.t8;
import org.telegram.ui.tp;
import org.telegram.ui.ve;
import org.telegram.ui.y91;
import org.telegram.ui.yw;
import zh.r3;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class c1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object n;

    public /* synthetic */ c1(int i7, ArrayList arrayList, ArrayList arrayList2, Integer num, we weVar, we weVar2, we weVar3) {
        this.a = 1;
        this.b = i7;
        this.c = arrayList;
        this.d = arrayList2;
        this.e = num;
        this.f = weVar;
        this.h = weVar2;
        this.n = weVar3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:162:0x04ca, code lost:
    
        if (r9.chat.has_geo != false) goto L147;
     */
    /* JADX WARN: Type inference failed for: r3v39 */
    /* JADX WARN: Type inference failed for: r3v40, types: [java.lang.String, org.telegram.ui.ActionBar.g6] */
    /* JADX WARN: Type inference failed for: r3v41 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        jl0 jl0Var;
        ?? r32;
        hc a02;
        int i7;
        int i10;
        String i11;
        JSONObject jSONObject;
        TL_wallet.tonConnectSession tonconnectsession;
        JSONObject put;
        int i12 = this.a;
        int i13 = this.b;
        boolean z9 = false;
        z9 = false;
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
                qp qpVar = (qp) obj;
                i1 i1Var = ((d1) obj6).h;
                if (i1Var.j0 != 0 && i13 == i1Var.i0 && i1Var.D != null && i1Var.y != null) {
                    i1Var.Y(hVar, arrayList, false);
                    if (tL_error == null) {
                        TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject;
                        qpVar.Y3(tL_channels_channelParticipants.users, false);
                        qpVar.S3(tL_channels_channelParticipants.chats, false);
                        i1Var.y.isEmpty();
                        if (!tL_channels_channelParticipants.participants.isEmpty()) {
                            long e10 = p10.i(i1Var.f).e();
                            for (int i14 = 0; i14 < tL_channels_channelParticipants.participants.size(); i14++) {
                                long B1 = ij.B1(tL_channels_channelParticipants.participants.get(i14).peer);
                                if (i1Var.D.h(B1) < 0 && ((B1 != 0 || i1Var.D.h(e10) < 0) && (i1Var.k0 || (B1 != e10 && B1 != 0)))) {
                                    if (B1 >= 0) {
                                        TLRPC.User a22 = qpVar.a2(Long.valueOf(B1));
                                        if (a22 == null) {
                                            break;
                                        } else {
                                            i1Var.y.add(a22);
                                        }
                                    } else {
                                        TLRPC.Chat M0 = qpVar.M0(Long.valueOf(-B1));
                                        if (M0 == null) {
                                            break;
                                        } else {
                                            i1Var.y.add(M0);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    i1Var.f();
                    i1Var.V.a(!i1Var.y.isEmpty());
                }
                i1Var.j0 = 0;
                break;
            case 1:
                ArrayList arrayList2 = (ArrayList) obj5;
                ArrayList arrayList3 = (ArrayList) obj6;
                Integer num = (Integer) obj4;
                we weVar = (we) obj3;
                we weVar2 = (we) obj2;
                we weVar3 = (we) obj;
                String[] strArr = MediaController.V1;
                boolean P1 = PhotoViewer.p1().P1();
                int i15 = this.b;
                if (!P1 || MediaController.g2) {
                    MediaController.b2 = arrayList2;
                    MediaController.c2 = arrayList3;
                    MediaController.d2 = null;
                    MediaController.a2 = weVar2;
                    MediaController.Z1 = weVar;
                    qs.e().k(qs.r2, Integer.valueOf(i15), arrayList2, arrayList3, num);
                    break;
                } else {
                    c1 c1Var = MediaController.d2;
                    if (c1Var != null) {
                        org.telegram.messenger.g0.r(c1Var);
                    }
                    c1 c1Var2 = new c1(i15, arrayList2, arrayList3, num, weVar, weVar2, weVar3);
                    MediaController.d2 = c1Var2;
                    org.telegram.messenger.g0.i3(c1Var2, 1000);
                    break;
                }
            case 2:
                gz gzVar = (gz) obj6;
                TLObject tLObject2 = (TLObject) obj2;
                TLRPC.InputFile inputFile = (TLRPC.InputFile) obj5;
                TLRPC.InputMedia inputMedia = (TLRPC.InputMedia) obj4;
                sy syVar = (sy) obj3;
                String str = (String) obj;
                gzVar.getClass();
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
                    TLRPC.TL_messages_sendMultiMedia tL_messages_sendMultiMedia = (TLRPC.TL_messages_sendMultiMedia) syVar.c;
                    if (i13 >= 0 && i13 < tL_messages_sendMultiMedia.multi_media.size()) {
                        tL_messages_sendMultiMedia.multi_media.get(i13).media = tL_inputMediaUploadedPhoto;
                    }
                    ArrayList arrayList4 = syVar.A;
                    if (arrayList4 != null && i13 >= 0 && i13 < arrayList4.size()) {
                        syVar.A.set(i13, tL_inputMediaUploadedPhoto);
                    }
                    syVar.j = null;
                    syVar.i = null;
                    HashMap hashMap = syVar.E;
                    if (hashMap != null) {
                        hashMap.remove(str + "_ct");
                    }
                    gzVar.A0(syVar, tL_inputMediaUploadedPhoto, null, str);
                    break;
                } else {
                    syVar.c();
                    break;
                }
                break;
            case 3:
                g4 g4Var = (g4) obj6;
                vf.b bVar = (vf.b) obj5;
                TLObject tLObject3 = (TLObject) obj2;
                String str2 = (String) obj4;
                org.telegram.ui.f0 f0Var = (org.telegram.ui.f0) obj3;
                TLRPC.TL_messages_getWebPage tL_messages_getWebPage = (TLRPC.TL_messages_getWebPage) obj;
                if (g4Var.G0 != 0 && i13 == g4Var.I0) {
                    if (bVar != null) {
                        bVar.b();
                    }
                    g4Var.G0 = 0;
                    g4Var.Z(false);
                    if (g4Var.V) {
                        if (tLObject3 instanceof TLRPC.TL_messages_webPage) {
                            TLRPC.TL_messages_webPage tL_messages_webPage = (TLRPC.TL_messages_webPage) tLObject3;
                            qp.s1(g4Var.X).Y3(tL_messages_webPage.users, false);
                            qp.s1(g4Var.X).S3(tL_messages_webPage.chats, false);
                            TLRPC.WebPage webPage = tL_messages_webPage.webpage;
                            if (webPage == null || !(webPage.cached_page instanceof TL_iv.TL_page)) {
                                if (!((Boolean) f0Var.run()).booleanValue()) {
                                    if (qp.s1(g4Var.X).N2(tL_messages_getWebPage.url)) {
                                        g4Var.e(1, tL_messages_getWebPage.url);
                                        break;
                                    } else {
                                        vf.c.t(g4Var.L, tL_messages_getWebPage.url);
                                        break;
                                    }
                                }
                            } else {
                                g4Var.f(webPage, str2, 1);
                                break;
                            }
                        } else {
                            if (tLObject3 instanceof TLRPC.TL_webPage) {
                                TLRPC.TL_webPage tL_webPage = (TLRPC.TL_webPage) tLObject3;
                                if (tL_webPage.cached_page instanceof TL_iv.TL_page) {
                                    g4Var.f(tL_webPage, str2, 1);
                                    break;
                                }
                            }
                            if (!((Boolean) f0Var.run()).booleanValue()) {
                                if (qp.s1(g4Var.X).N2(tL_messages_getWebPage.url)) {
                                    g4Var.e(1, tL_messages_getWebPage.url);
                                    break;
                                } else {
                                    vf.c.t(g4Var.L, tL_messages_getWebPage.url);
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
                ConnectionsManager.getInstance(i16).sendRequest(togglegroupcallsettings, new t8(i16, inputGroupCall, (String[]) obj5, (FrameLayout) obj4, (x70) obj3, (v2) obj2, (g6) obj));
                break;
            case 5:
                TLObject tLObject4 = (TLObject) obj2;
                org.telegram.ui.ActionBar.u1 u1Var = (org.telegram.ui.ActionBar.u1) obj6;
                Context context = (Context) obj5;
                TL_phone.exportGroupCallInvite exportgroupcallinvite = (TL_phone.exportGroupCallInvite) obj4;
                g6 g6Var = (g6) obj3;
                o40 o40Var = (o40) obj;
                if (tLObject4 instanceof TL_phone.exportedGroupCallInvite) {
                    u1Var.dismiss();
                    i9.n0(context, this.b, exportgroupcallinvite.call, ((TL_phone.exportedGroupCallInvite) tLObject4).link, g6Var, true, true);
                } else {
                    u1Var.dismiss();
                }
                org.telegram.messenger.g0.h3(o40Var);
                break;
            case 6:
                TLObject tLObject5 = (TLObject) obj2;
                ArrayList arrayList5 = (ArrayList) obj5;
                AtomicInteger atomicInteger = (AtomicInteger) obj6;
                ArrayList arrayList6 = (ArrayList) obj4;
                tp tpVar = (tp) obj;
                if (((TLRPC.TL_error) obj3) == null && (tLObject5 instanceof TLRPC.TL_channels_channelParticipants)) {
                    arrayList5.set(i13, (TLRPC.TL_channels_channelParticipants) tLObject5);
                }
                atomicInteger.getAndIncrement();
                if (atomicInteger.get() == arrayList6.size()) {
                    tpVar.run();
                    break;
                }
                break;
            case 7:
                TLObject tLObject6 = (TLObject) obj2;
                TLRPC.Document document2 = (TLRPC.Document) obj5;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj3;
                TLRPC.TL_stickers_addStickerToSet tL_stickers_addStickerToSet = (TLRPC.TL_stickers_addStickerToSet) obj;
                ((org.telegram.ui.ActionBar.u1) obj6).dismiss();
                if (tLObject6 instanceof TLRPC.TL_messages_stickerSet) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject6;
                    ui.b0(i13).I1(tL_messages_stickerSet, true);
                    if (!ui.b0(i13).B0(tL_messages_stickerSet.set.id, true)) {
                        ui.b0(i13).f2(null, tLObject6, 2, null, false, false);
                    }
                    org.telegram.messenger.g0.i3(new w80(19, tLObject6, document2), 250L);
                    break;
                } else if (tL_error2 != null) {
                    if (r8.r(tL_error2.text)) {
                        r8.n(i13).u(new Object[]{tL_stickers_addStickerToSet}, obj4);
                        break;
                    } else {
                        hc.d0(tL_error2);
                        break;
                    }
                }
                break;
            case 8:
                g40.a((org.telegram.ui.ActionBar.u1) obj6, (vf.b) obj5, (TLObject) obj2, this.b, (Context) obj4, (TLRPC.TL_inputGroupCallSlug) obj, (TLRPC.TL_error) obj3);
                break;
            case 9:
                LaunchActivity launchActivity = (LaunchActivity) obj6;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj3;
                TLObject tLObject7 = (TLObject) obj2;
                org.telegram.ui.ActionBar.u1 u1Var2 = (org.telegram.ui.ActionBar.u1) obj5;
                s10 s10Var = (s10) obj4;
                String str3 = (String) obj;
                ArrayList arrayList7 = launchActivity.d0;
                if (!launchActivity.isFinishing()) {
                    if (tL_error3 == null && launchActivity.o0 != null) {
                        TLRPC.ChatInvite chatInvite = (TLRPC.ChatInvite) tLObject7;
                        TLRPC.Chat chat = chatInvite.chat;
                        if (chat != null) {
                            if (t3.l0(chat)) {
                                TLRPC.Chat chat2 = chatInvite.chat;
                                if (!chat2.kicked) {
                                    if (!t3.t0(chat2)) {
                                        if (!(chatInvite instanceof TLRPC.TL_chatInvitePeek)) {
                                            break;
                                        }
                                    }
                                }
                            }
                            qp.s1(i13).Q3(chatInvite.chat, false);
                            ArrayList arrayList8 = new ArrayList();
                            arrayList8.add(chatInvite.chat);
                            int i17 = 1;
                            yr.a0(i13).m1(null, arrayList8, false, true);
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", chatInvite.chat.id);
                            if (arrayList7.isEmpty() || qp.s1(i13).E(bundle, (f2) g.i(1, arrayList7), null, null)) {
                                boolean[] zArr = new boolean[1];
                                u1Var2.setOnCancelListener(new ig(i17, zArr));
                                if (!chatInvite.chat.forum) {
                                    qp.s1(i13).s0(-chatInvite.chat.id, 0, new q80(launchActivity, s10Var, zArr, bundle, chatInvite));
                                    break;
                                } else {
                                    Bundle bundle2 = new Bundle();
                                    bundle2.putLong("chat_id", chatInvite.chat.id);
                                    launchActivity.t0(y91.J0(launchActivity, bundle2));
                                }
                            }
                        }
                        TL_stars.TL_starsSubscriptionPricing tL_starsSubscriptionPricing = chatInvite.subscription_pricing;
                        if (tL_starsSubscriptionPricing == null || chatInvite.can_refulfill_subscription) {
                            f2 f2Var = (f2) g.i(1, arrayList7);
                            f2Var.showDialog(new c70(launchActivity, chatInvite, str3, f2Var, f2Var instanceof cn ? ((cn) f2Var).za : null));
                        } else {
                            long j3 = tL_starsSubscriptionPricing.amount;
                            qp.s1(i13).Q3(chatInvite.chat, false);
                            ea.y(launchActivity.O, false).h0(str3, chatInvite, new ii.g0(launchActivity, j3, 1));
                        }
                    } else if (tL_error3 == null || !tL_error3.text.startsWith("INVITE_HASH_EXPIRED") || LaunchActivity.T() == null) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(launchActivity);
                        String M02 = id.M0(R.string.AppName, null);
                        org.telegram.ui.ActionBar.u1 u1Var3 = alertDialog$Builder.a;
                        u1Var3.R = M02;
                        if (tL_error3.text.startsWith("FLOOD_WAIT")) {
                            u1Var3.T = id.M0(2131750687, null);
                        } else if (tL_error3.text.startsWith("INVITE_HASH_EXPIRED")) {
                            u1Var3.R = id.M0(2131750875, null);
                            u1Var3.T = id.M0(2131749152, null);
                        } else {
                            u1Var3.T = id.M0(2131749075, null);
                        }
                        alertDialog$Builder.k(id.M0(2131747831, null), null);
                        launchActivity.F0(alertDialog$Builder);
                    } else {
                        k5.o(null, 2131749152, hc.a0(LaunchActivity.T()), R.raw.linkbroken, 36);
                    }
                    try {
                        s10Var.run();
                        break;
                    } catch (Exception e11) {
                        a8.g(e11, true);
                        return;
                    }
                }
                break;
            case 10:
                LaunchActivity launchActivity2 = (LaunchActivity) obj6;
                TLObject tLObject8 = (TLObject) obj2;
                vf.b bVar2 = (vf.b) obj5;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) obj3;
                qp qpVar2 = (qp) obj;
                String str4 = (String) obj4;
                String str5 = LaunchActivity.B1;
                if (tLObject8 instanceof TLRPC.User) {
                    TLRPC.User user = (TLRPC.User) tLObject8;
                    qpVar2.X3(user, false, false);
                    if (t10.B(user)) {
                        if (bVar2 != null) {
                            bVar2.b();
                        }
                        launchActivity2.m0(i13, user.id, null);
                        break;
                    } else {
                        launchActivity2.Y(i13, user, str4, bVar2);
                        break;
                    }
                } else {
                    if (bVar2 != null) {
                        bVar2.b();
                    }
                    StringBuilder sb2 = new StringBuilder("cant import contact token, err=");
                    sb2.append(tL_error4 == null ? null : tL_error4.text);
                    a8.d(sb2.toString());
                    f2 Q = LaunchActivity.Q();
                    if (Q != null) {
                        k5.p(null, 2131748134, hc.a0(Q), null);
                        break;
                    }
                }
                break;
            case 11:
                LaunchActivity launchActivity3 = (LaunchActivity) obj6;
                yw ywVar = (yw) obj5;
                f2 f2Var2 = (f2) obj4;
                TLRPC.User user2 = (TLRPC.User) obj3;
                String str6 = (String) obj;
                String str7 = LaunchActivity.B1;
                if (((TLObject) obj2) instanceof TLRPC.TL_boolTrue) {
                    ui.b0(i13).E0(false, true, new o10(launchActivity3, ywVar, f2Var2, user2, str6, 9));
                    break;
                }
                break;
            case 12:
                LaunchActivity launchActivity4 = (LaunchActivity) obj6;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) obj3;
                TLObject tLObject9 = (TLObject) obj2;
                TLRPC.TL_inputInvoiceSlug tL_inputInvoiceSlug = (TLRPC.TL_inputInvoiceSlug) obj5;
                s10 s10Var2 = (s10) obj4;
                String str8 = (String) obj;
                ArrayList arrayList9 = launchActivity4.d0;
                if (tL_error5 != null) {
                    if ("SUBSCRIPTION_ALREADY_ACTIVE".equalsIgnoreCase(tL_error5.text)) {
                        a02 = hc.a0((f2) g.i(1, arrayList9));
                        i7 = 2131747395;
                        r32 = 0;
                    } else {
                        r32 = 0;
                        a02 = hc.a0((f2) g.i(1, arrayList9));
                        i7 = 2131747396;
                    }
                    k5.p(r32, i7, a02, r32);
                } else if (!launchActivity4.isFinishing()) {
                    if (tLObject9 instanceof TLRPC.TL_payments_paymentFormStars) {
                        r3 r3Var = launchActivity4.X0;
                        launchActivity4.X0 = null;
                        ea.y(launchActivity4.O, false).X(null, tL_inputInvoiceSlug, (TLRPC.TL_payments_paymentFormStars) tLObject9, new b70(s10Var2, 1), new n70(r3Var, z9 ? 1 : 0));
                        break;
                    } else {
                        if (tLObject9 instanceof TLRPC.PaymentForm) {
                            TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject9;
                            qp.s1(i13).Y3(paymentForm.users, false);
                            jl0Var = new jl0(paymentForm, null, str8, launchActivity4.M().getLastFragment());
                        } else {
                            jl0Var = tLObject9 instanceof TLRPC.PaymentReceipt ? new jl0((TLRPC.PaymentReceipt) tLObject9) : null;
                        }
                        if (jl0Var != null) {
                            r3 r3Var2 = launchActivity4.X0;
                            if (r3Var2 != null) {
                                launchActivity4.X0 = null;
                                jl0Var.Z0 = new ve(9, r3Var2);
                            }
                            launchActivity4.t0(jl0Var);
                        }
                    }
                }
                try {
                    s10Var2.run();
                    break;
                } catch (Exception e12) {
                    a8.g(e12, true);
                    return;
                }
            case 13:
                nd0 nd0Var = (nd0) obj6;
                String str9 = (String) obj5;
                f5.f fVar = (f5.f) obj4;
                List list = (List) obj3;
                String str10 = (String) obj2;
                String str11 = (String) obj;
                ee0 ee0Var = nd0Var.w;
                StringBuilder u10 = a8.p0.u("LoginBilling queried \"", str9, "\" product: ");
                u10.append(org.telegram.messenger.r1.j(fVar.a));
                a8.b(u10.toString());
                int i18 = fVar.a;
                if (i18 != 0) {
                    nd0Var.e = "BILLING_".concat(org.telegram.messenger.r1.j(i18));
                    new hc(ee0Var.Z, null).H(R.raw.error, id.a0(null, null, 2131743878, org.telegram.messenger.r1.j(fVar.a)));
                    break;
                } else if (list != null && !list.isEmpty()) {
                    f5.l lVar = (f5.l) list.get(0);
                    f5.h a10 = lVar.a();
                    TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode = new TLRPC.TL_inputStorePaymentAuthCode();
                    tL_inputStorePaymentAuthCode.currency = a10.c;
                    tL_inputStorePaymentAuthCode.amount = (long) (Math.pow(10.0d, org.telegram.messenger.r1.i().h(tL_inputStorePaymentAuthCode.currency)) * (a10.b / Math.pow(10.0d, 6.0d)));
                    tL_inputStorePaymentAuthCode.phone_code_hash = TextUtils.isEmpty(str10) ? "" : str10;
                    tL_inputStorePaymentAuthCode.phone_number = str11;
                    int i19 = this.b;
                    tL_inputStorePaymentAuthCode.premium_days = i19;
                    StringBuilder u11 = a8.p0.u("LoginBilling found \"", str9, "\" product, with currency=");
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
                    i10 = ((f2) ee0Var).currentAccount;
                    ConnectionsManager.getInstance(i10).sendRequest(tL_payments_canPurchaseStore, new t8(nd0Var, a10, i19, lVar, tL_inputStorePaymentAuthCode, str9, tL_payments_canPurchaseStore, 3), 10);
                    break;
                } else {
                    nd0Var.e = "PRODUCT_NOT_FOUND";
                    new hc(ee0Var.Z, null).H(R.raw.error, id.a0(null, null, 2131743878, "PRODUCT_NOT_FOUND"));
                    break;
                }
                break;
            case 14:
                ProfileActivity profileActivity = (ProfileActivity) obj6;
                View view = (View) obj5;
                String str12 = (String) obj4;
                boolean[] zArr2 = (boolean[]) obj3;
                String[] strArr2 = (String[]) obj2;
                String str13 = (String) obj;
                RectF rectF = ProfileActivity.V6;
                if (profileActivity.getParentActivity() != null) {
                    l60 H = l60.H(profileActivity, view);
                    H.W(profileActivity.a.U0(view, false));
                    H.w = false;
                    H.c(R.drawable.msg_copy, id.M0(2131751767, null), new f10(profileActivity, str12, i13, 8), false);
                    H.l(R.drawable.msg_translate, id.M0(2131743956, null), new lo0(profileActivity, strArr2, str13, str12, 7), zArr2[0]);
                    H.Z();
                    break;
                }
                break;
            case 15:
                org.telegram.ui.Wallet.d2 d2Var = (org.telegram.ui.Wallet.d2) obj6;
                org.telegram.ui.Wallet.z1 z1Var = (org.telegram.ui.Wallet.z1) obj5;
                String str14 = (String) obj3;
                org.telegram.ui.Wallet.i0 i0Var = (org.telegram.ui.Wallet.i0) obj2;
                c20 c20Var = (c20) obj;
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    String str15 = z1Var.d;
                    tonconnectsession = z1Var.a;
                    JSONObject put2 = jSONObject2.put("id", str15);
                    if (i13 < 0) {
                        put2.put("result", obj4);
                    } else {
                        if (str14 == null) {
                            str14 = "Could not complete request";
                        }
                        put2.put("error", new JSONObject().put("code", i13).put("message", str14));
                    }
                    JSONObject put3 = new JSONObject().put("body", WalletEngine2.tonConnectCrypto(i0Var, tonconnectsession, z1Var.h, z1Var.g, new JSONObject().put("encrypt", put2)).getString("body")).put("traceId", z1Var.i);
                    if (i13 < 0 && "disconnect".equals(z1Var.e)) {
                        z9 = true;
                    }
                    put = put3.put("disconnect", z9);
                } catch (Exception e13) {
                    i11 = org.telegram.ui.Wallet.d2.i("encrypt response", e13);
                    jSONObject = null;
                }
                if (!qp.s1(d2Var.a).e7.edit().putString(org.telegram.ui.Wallet.d2.l(tonconnectsession.id, z1Var.b), put.toString()).commit()) {
                    throw new IllegalStateException("Could not save TON Connect response");
                }
                jSONObject = put;
                i11 = null;
                org.telegram.messenger.g0.h3(new qw0((Object) d2Var, (Object) jSONObject, (Object) c20Var, i11, (Object) z1Var, 4));
                break;
                break;
            case 16:
                boolean[] zArr3 = (boolean[]) obj6;
                Context context2 = (Context) obj5;
                TLRPC.User user3 = (TLRPC.User) obj4;
                JSONObject jSONObject3 = (JSONObject) obj3;
                g6 g6Var2 = (g6) obj2;
                q2 q2Var = (q2) obj;
                if (!zArr3[0]) {
                    zArr3[0] = true;
                    int i20 = this.b;
                    org.telegram.ui.Wallet.l0 x10 = org.telegram.ui.Wallet.l0.x(i20);
                    String t6 = x10.t();
                    byte[] y10 = x10.y();
                    if (t6 == null || y10 == null || x10.b == null) {
                        hc.b0(id.M0(2131742959, null));
                        q2Var.a();
                        break;
                    } else {
                        int currentTime = ConnectionsManager.getInstance(i20).getCurrentTime();
                        try {
                            if ("signData".equals(jSONObject3.optString("method"))) {
                                JSONObject jSONObject4 = jSONObject3.getJSONObject("payload");
                                org.telegram.ui.Wallet.d2.G(t6, jSONObject4);
                                t2.c(context2, i20, user3, jSONObject4, t6, (byte[]) y10.clone(), g6Var2, q2Var);
                            } else {
                                JSONObject jSONObject5 = jSONObject3.getJSONObject("transaction");
                                org.telegram.ui.Wallet.d2.I(jSONObject5, t6, currentTime);
                                t2.d(context2, i20, user3, new org.telegram.ui.Wallet.c2(jSONObject5), t6, (byte[]) y10.clone(), g6Var2, q2Var);
                            }
                            break;
                        } catch (Exception e14) {
                            hc.b0(org.telegram.ui.Wallet.d2.i("widget call", e14));
                            q2Var.a();
                            return;
                        }
                    }
                }
                break;
            case 17:
                org.telegram.ui.web.x0 x0Var = (org.telegram.ui.web.x0) obj6;
                String str16 = (String) obj5;
                TLObject tLObject10 = (TLObject) obj2;
                TLRPC.TL_error tL_error6 = (TLRPC.TL_error) obj3;
                org.telegram.ui.web.u0 u0Var = (org.telegram.ui.web.u0) obj4;
                p7 p7Var = (p7) obj;
                try {
                    JSONObject jSONObject6 = new JSONObject();
                    jSONObject6.put("req_id", str16);
                    if (tLObject10 instanceof TLRPC.TL_dataJSON) {
                        jSONObject6.put("result", new JSONTokener(((TLRPC.TL_dataJSON) tLObject10).data).nextValue());
                    } else if (tL_error6 != null) {
                        jSONObject6.put("error", tL_error6.text);
                    }
                    org.telegram.ui.web.x0.w(i13, u0Var, p7Var, "custom_method_invoked", jSONObject6);
                    break;
                } catch (Exception e15) {
                    a8.g(e15, true);
                    x0Var.Z(null);
                    return;
                }
            default:
                StringBuilder sb3 = new StringBuilder();
                com.google.android.recaptcha.internal.a.s(sb3, qp.s1(i13).U2, "/", (String) obj5, "/c/");
                sb3.append(((TL_stars.TL_starGiftCollection) obj4).collection_id);
                String sb4 = sb3.toString();
                new zh.m1((vp0) obj6, (Context) obj3, sb4, sb4, (g6) obj2, (f2) obj).show();
                break;
        }
    }

    public /* synthetic */ c1(Object obj, int i7, Serializable serializable, Object obj2, Object obj3, Object obj4, Object obj5, int i10) {
        this.a = i10;
        this.d = obj;
        this.b = i7;
        this.c = serializable;
        this.e = obj2;
        this.f = obj3;
        this.h = obj4;
        this.n = obj5;
    }

    public /* synthetic */ c1(Object obj, Object obj2, int i7, Object obj3, Object obj4, Object obj5, Object obj6, int i10) {
        this.a = i10;
        this.d = obj;
        this.c = obj2;
        this.b = i7;
        this.e = obj3;
        this.f = obj4;
        this.h = obj5;
        this.n = obj6;
    }

    public /* synthetic */ c1(gz gzVar, TLObject tLObject, TLRPC.InputFile inputFile, TLRPC.InputMedia inputMedia, sy syVar, int i7, String str) {
        this.a = 2;
        this.d = gzVar;
        this.h = tLObject;
        this.c = inputFile;
        this.e = inputMedia;
        this.f = syVar;
        this.b = i7;
        this.n = str;
    }

    public /* synthetic */ c1(TLObject tLObject, org.telegram.ui.ActionBar.u1 u1Var, Context context, int i7, TL_phone.exportGroupCallInvite exportgroupcallinvite, g6 g6Var, o40 o40Var) {
        this.a = 5;
        this.h = tLObject;
        this.d = u1Var;
        this.c = context;
        this.b = i7;
        this.e = exportgroupcallinvite;
        this.f = g6Var;
        this.n = o40Var;
    }

    public /* synthetic */ c1(TLRPC.TL_error tL_error, TLObject tLObject, ArrayList arrayList, int i7, AtomicInteger atomicInteger, ArrayList arrayList2, tp tpVar) {
        this.a = 6;
        this.f = tL_error;
        this.h = tLObject;
        this.c = arrayList;
        this.b = i7;
        this.d = atomicInteger;
        this.e = arrayList2;
        this.n = tpVar;
    }

    public /* synthetic */ c1(org.telegram.ui.ActionBar.u1 u1Var, TLObject tLObject, int i7, TLRPC.Document document, TLRPC.TL_error tL_error, Object obj, TLRPC.TL_stickers_addStickerToSet tL_stickers_addStickerToSet) {
        this.a = 7;
        this.d = u1Var;
        this.h = tLObject;
        this.b = i7;
        this.c = document;
        this.f = tL_error;
        this.e = obj;
        this.n = tL_stickers_addStickerToSet;
    }

    public /* synthetic */ c1(org.telegram.ui.ActionBar.u1 u1Var, vf.b bVar, TLObject tLObject, int i7, Context context, TLRPC.TL_inputGroupCallSlug tL_inputGroupCallSlug, TLRPC.TL_error tL_error) {
        this.a = 8;
        this.d = u1Var;
        this.c = bVar;
        this.h = tLObject;
        this.b = i7;
        this.e = context;
        this.n = tL_inputGroupCallSlug;
        this.f = tL_error;
    }

    public /* synthetic */ c1(g4 g4Var, int i7, vf.b bVar, TLObject tLObject, String str, org.telegram.ui.f0 f0Var, TLRPC.TL_messages_getWebPage tL_messages_getWebPage) {
        this.a = 3;
        this.d = g4Var;
        this.b = i7;
        this.c = bVar;
        this.h = tLObject;
        this.e = str;
        this.f = f0Var;
        this.n = tL_messages_getWebPage;
    }

    public /* synthetic */ c1(LaunchActivity launchActivity, TLObject tLObject, int i7, yw ywVar, f2 f2Var, TLRPC.User user, String str) {
        this.a = 11;
        this.d = launchActivity;
        this.h = tLObject;
        this.b = i7;
        this.c = ywVar;
        this.e = f2Var;
        this.f = user;
        this.n = str;
    }

    public /* synthetic */ c1(LaunchActivity launchActivity, TLObject tLObject, vf.b bVar, TLRPC.TL_error tL_error, qp qpVar, int i7, String str) {
        this.a = 10;
        this.d = launchActivity;
        this.h = tLObject;
        this.c = bVar;
        this.f = tL_error;
        this.n = qpVar;
        this.b = i7;
        this.e = str;
    }

    public /* synthetic */ c1(LaunchActivity launchActivity, TLRPC.TL_error tL_error, TLObject tLObject, int i7, org.telegram.ui.ActionBar.u1 u1Var, s10 s10Var, String str) {
        this.a = 9;
        this.d = launchActivity;
        this.f = tL_error;
        this.h = tLObject;
        this.b = i7;
        this.c = u1Var;
        this.e = s10Var;
        this.n = str;
    }

    public /* synthetic */ c1(LaunchActivity launchActivity, TLRPC.TL_error tL_error, TLObject tLObject, TLRPC.TL_inputInvoiceSlug tL_inputInvoiceSlug, s10 s10Var, int i7, String str) {
        this.a = 12;
        this.d = launchActivity;
        this.f = tL_error;
        this.h = tLObject;
        this.c = tL_inputInvoiceSlug;
        this.e = s10Var;
        this.b = i7;
        this.n = str;
    }

    public /* synthetic */ c1(nd0 nd0Var, String str, f5.f fVar, List list, String str2, String str3, int i7) {
        this.a = 13;
        this.d = nd0Var;
        this.c = str;
        this.e = fVar;
        this.f = list;
        this.h = str2;
        this.n = str3;
        this.b = i7;
    }

    public /* synthetic */ c1(ProfileActivity profileActivity, View view, String str, int i7, boolean[] zArr, String[] strArr, String str2) {
        this.a = 14;
        this.d = profileActivity;
        this.c = view;
        this.e = str;
        this.b = i7;
        this.f = zArr;
        this.h = strArr;
        this.n = str2;
    }

    public /* synthetic */ c1(org.telegram.ui.web.x0 x0Var, String str, TLObject tLObject, TLRPC.TL_error tL_error, int i7, org.telegram.ui.web.u0 u0Var, p7 p7Var) {
        this.a = 17;
        this.d = x0Var;
        this.c = str;
        this.h = tLObject;
        this.f = tL_error;
        this.b = i7;
        this.e = u0Var;
        this.n = p7Var;
    }
}
