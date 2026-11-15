package bi;

import android.content.Context;
import android.graphics.RectF;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import di.u8;
import fi.i7;
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
import org.telegram.messenger.ez;
import org.telegram.messenger.gj;
import org.telegram.messenger.hd;
import org.telegram.messenger.is;
import org.telegram.messenger.m10;
import org.telegram.messenger.np;
import org.telegram.messenger.ns;
import org.telegram.messenger.q10;
import org.telegram.messenger.qy;
import org.telegram.messenger.r8;
import org.telegram.messenger.si;
import org.telegram.messenger.ve;
import org.telegram.messenger.vr;
import org.telegram.messenger.z10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.e70;
import org.telegram.ui.Components.hh0;
import org.telegram.ui.Components.m60;
import org.telegram.ui.Components.u11;
import org.telegram.ui.Components.wp0;
import org.telegram.ui.Components.z70;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.Wallet.WalletEngine2;
import org.telegram.ui.an;
import org.telegram.ui.ce0;
import org.telegram.ui.cu0;
import org.telegram.ui.e40;
import org.telegram.ui.fg;
import org.telegram.ui.g50;
import org.telegram.ui.hp;
import org.telegram.ui.i9;
import org.telegram.ui.j70;
import org.telegram.ui.kd0;
import org.telegram.ui.kl0;
import org.telegram.ui.m40;
import org.telegram.ui.o80;
import org.telegram.ui.ok0;
import org.telegram.ui.t8;
import org.telegram.ui.te;
import org.telegram.ui.tp;
import org.telegram.ui.u91;
import org.telegram.ui.x60;
import org.telegram.ui.yw;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class u2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object n;

    public /* synthetic */ u2(int i7, FrameLayout frameLayout, TLRPC.InputGroupCall inputGroupCall, org.telegram.ui.ActionBar.u2 u2Var, org.telegram.ui.ActionBar.e6 e6Var, z70 z70Var, String[] strArr) {
        this.a = 5;
        this.c = inputGroupCall;
        this.b = i7;
        this.d = strArr;
        this.e = frameLayout;
        this.f = z70Var;
        this.n = u2Var;
        this.h = e6Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:160:0x0495, code lost:
    
        if (r11.chat.has_geo != false) goto L147;
     */
    /* JADX WARN: Type inference failed for: r3v44 */
    /* JADX WARN: Type inference failed for: r3v45, types: [java.lang.String, org.telegram.ui.ActionBar.e6] */
    /* JADX WARN: Type inference failed for: r3v46 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        g50 g50Var;
        kl0 kl0Var;
        ?? r32;
        cc a02;
        int i7;
        int i10;
        String i11;
        JSONObject jSONObject;
        TL_wallet.tonConnectSession tonconnectsession;
        JSONObject put;
        int i12 = this.a;
        int i13 = 2;
        int i14 = this.b;
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
                com.google.android.gms.internal.vision.e2.r(sb2, np.s1(i14).V2, "/", (String) obj5, "/c/");
                sb2.append(((TL_stars.TL_starGiftCollection) obj4).collection_id);
                String sb3 = sb2.toString();
                new i3((wp0) obj6, (Context) obj3, sb3, sb3, (org.telegram.ui.ActionBar.e6) obj2, (org.telegram.ui.ActionBar.e2) obj).show();
                break;
            case 1:
                ArrayList arrayList = (ArrayList) obj5;
                a0.h hVar = (a0.h) obj4;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj3;
                TLObject tLObject = (TLObject) obj2;
                np npVar = (np) obj;
                jg.h1 h1Var = ((jg.c1) obj6).h;
                if (h1Var.k0 != 0 && i14 == h1Var.j0 && h1Var.E != null && h1Var.y != null) {
                    h1Var.Y(hVar, arrayList, false);
                    if (tL_error == null) {
                        TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject;
                        npVar.Y3(tL_channels_channelParticipants.users, false);
                        npVar.S3(tL_channels_channelParticipants.chats, false);
                        h1Var.y.isEmpty();
                        if (!tL_channels_channelParticipants.participants.isEmpty()) {
                            long e10 = m10.i(h1Var.f).e();
                            for (int i15 = 0; i15 < tL_channels_channelParticipants.participants.size(); i15++) {
                                long B1 = gj.B1(tL_channels_channelParticipants.participants.get(i15).peer);
                                if (h1Var.E.h(B1) < 0 && ((B1 != 0 || h1Var.E.h(e10) < 0) && (h1Var.l0 || (B1 != e10 && B1 != 0)))) {
                                    if (B1 >= 0) {
                                        TLRPC.User a22 = npVar.a2(Long.valueOf(B1));
                                        if (a22 == null) {
                                            break;
                                        } else {
                                            h1Var.y.add(a22);
                                        }
                                    } else {
                                        TLRPC.Chat M0 = npVar.M0(Long.valueOf(-B1));
                                        if (M0 == null) {
                                            break;
                                        } else {
                                            h1Var.y.add(M0);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    h1Var.f();
                    h1Var.W.a(!h1Var.y.isEmpty());
                }
                h1Var.k0 = 0;
                break;
            case 2:
                ArrayList arrayList2 = (ArrayList) obj6;
                ArrayList arrayList3 = (ArrayList) obj5;
                Integer num = (Integer) obj4;
                ve veVar = (ve) obj3;
                ve veVar2 = (ve) obj2;
                ve veVar3 = (ve) obj;
                String[] strArr = MediaController.W1;
                boolean P1 = PhotoViewer.p1().P1();
                int i16 = this.b;
                if (!P1 || MediaController.h2) {
                    MediaController.c2 = arrayList2;
                    MediaController.d2 = arrayList3;
                    MediaController.e2 = null;
                    MediaController.b2 = veVar2;
                    MediaController.a2 = veVar;
                    ns.e().k(ns.r2, Integer.valueOf(i16), arrayList2, arrayList3, num);
                    break;
                } else {
                    u2 u2Var = MediaController.e2;
                    if (u2Var != null) {
                        org.telegram.messenger.g0.r(u2Var);
                    }
                    u2 u2Var2 = new u2(i16, arrayList2, arrayList3, num, veVar, veVar2, veVar3);
                    MediaController.e2 = u2Var2;
                    org.telegram.messenger.g0.i3(u2Var2, 1000);
                    break;
                }
            case 3:
                ez ezVar = (ez) obj6;
                TLObject tLObject2 = (TLObject) obj4;
                TLRPC.InputFile inputFile = (TLRPC.InputFile) obj3;
                TLRPC.InputMedia inputMedia = (TLRPC.InputMedia) obj2;
                qy qyVar = (qy) obj;
                String str = (String) obj5;
                ezVar.getClass();
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
                    TLRPC.TL_messages_sendMultiMedia tL_messages_sendMultiMedia = (TLRPC.TL_messages_sendMultiMedia) qyVar.c;
                    if (i14 >= 0 && i14 < tL_messages_sendMultiMedia.multi_media.size()) {
                        tL_messages_sendMultiMedia.multi_media.get(i14).media = tL_inputMediaUploadedPhoto;
                    }
                    ArrayList arrayList4 = qyVar.A;
                    if (arrayList4 != null && i14 >= 0 && i14 < arrayList4.size()) {
                        qyVar.A.set(i14, tL_inputMediaUploadedPhoto);
                    }
                    qyVar.j = null;
                    qyVar.i = null;
                    HashMap hashMap = qyVar.E;
                    if (hashMap != null) {
                        hashMap.remove(str + "_ct");
                    }
                    ezVar.A0(qyVar, tL_inputMediaUploadedPhoto, null, str);
                    break;
                } else {
                    qyVar.c();
                    break;
                }
                break;
            case 4:
                org.telegram.ui.g4 g4Var = (org.telegram.ui.g4) obj6;
                vf.b bVar = (vf.b) obj4;
                TLObject tLObject3 = (TLObject) obj3;
                String str2 = (String) obj5;
                org.telegram.ui.e0 e0Var = (org.telegram.ui.e0) obj2;
                TLRPC.TL_messages_getWebPage tL_messages_getWebPage = (TLRPC.TL_messages_getWebPage) obj;
                if (g4Var.H0 != 0 && i14 == g4Var.J0) {
                    if (bVar != null) {
                        bVar.b();
                    }
                    g4Var.H0 = 0;
                    g4Var.Z(false);
                    if (g4Var.W) {
                        if (tLObject3 instanceof TLRPC.TL_messages_webPage) {
                            TLRPC.TL_messages_webPage tL_messages_webPage = (TLRPC.TL_messages_webPage) tLObject3;
                            np.s1(g4Var.Y).Y3(tL_messages_webPage.users, false);
                            np.s1(g4Var.Y).S3(tL_messages_webPage.chats, false);
                            TLRPC.WebPage webPage = tL_messages_webPage.webpage;
                            if (webPage == null || !(webPage.cached_page instanceof TL_iv.TL_page)) {
                                if (!((Boolean) e0Var.run()).booleanValue()) {
                                    if (np.s1(g4Var.Y).N2(tL_messages_getWebPage.url)) {
                                        g4Var.e(1, tL_messages_getWebPage.url);
                                        break;
                                    } else {
                                        vf.c.t(g4Var.M, tL_messages_getWebPage.url);
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
                            if (!((Boolean) e0Var.run()).booleanValue()) {
                                if (np.s1(g4Var.Y).N2(tL_messages_getWebPage.url)) {
                                    g4Var.e(1, tL_messages_getWebPage.url);
                                    break;
                                } else {
                                    vf.c.t(g4Var.M, tL_messages_getWebPage.url);
                                    break;
                                }
                            }
                        }
                    }
                }
                break;
            case 5:
                TLRPC.InputGroupCall inputGroupCall = (TLRPC.InputGroupCall) obj6;
                z70 z70Var = (z70) obj3;
                TL_phone.toggleGroupCallSettings togglegroupcallsettings = new TL_phone.toggleGroupCallSettings();
                togglegroupcallsettings.call = inputGroupCall;
                togglegroupcallsettings.reset_invite_hash = true;
                int i17 = this.b;
                ConnectionsManager.getInstance(i17).sendRequest(togglegroupcallsettings, new t8(i17, (FrameLayout) obj4, inputGroupCall, (org.telegram.ui.ActionBar.u2) obj, (org.telegram.ui.ActionBar.e6) obj2, z70Var, (String[]) obj5));
                break;
            case 6:
                TLObject tLObject4 = (TLObject) obj6;
                org.telegram.ui.ActionBar.t1 t1Var = (org.telegram.ui.ActionBar.t1) obj5;
                Context context = (Context) obj3;
                TL_phone.exportGroupCallInvite exportgroupcallinvite = (TL_phone.exportGroupCallInvite) obj4;
                org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) obj2;
                m40 m40Var = (m40) obj;
                if (tLObject4 instanceof TL_phone.exportedGroupCallInvite) {
                    t1Var.dismiss();
                    i9.n0(context, this.b, exportgroupcallinvite.call, ((TL_phone.exportedGroupCallInvite) tLObject4).link, e6Var, true, true);
                } else {
                    t1Var.dismiss();
                }
                org.telegram.messenger.g0.h3(m40Var);
                break;
            case 7:
                TLObject tLObject5 = (TLObject) obj5;
                ArrayList arrayList5 = (ArrayList) obj4;
                AtomicInteger atomicInteger = (AtomicInteger) obj3;
                ArrayList arrayList6 = (ArrayList) obj2;
                tp tpVar = (tp) obj;
                if (((TLRPC.TL_error) obj6) == null && (tLObject5 instanceof TLRPC.TL_channels_channelParticipants)) {
                    arrayList5.set(i14, (TLRPC.TL_channels_channelParticipants) tLObject5);
                }
                atomicInteger.getAndIncrement();
                if (atomicInteger.get() == arrayList6.size()) {
                    tpVar.run();
                    break;
                }
                break;
            case 8:
                TLObject tLObject6 = (TLObject) obj5;
                TLRPC.Document document2 = (TLRPC.Document) obj4;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj3;
                TLRPC.TL_stickers_addStickerToSet tL_stickers_addStickerToSet = (TLRPC.TL_stickers_addStickerToSet) obj;
                ((org.telegram.ui.ActionBar.t1) obj6).dismiss();
                if (tLObject6 instanceof TLRPC.TL_messages_stickerSet) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject6;
                    si.b0(i14).I1(tL_messages_stickerSet, true);
                    if (!si.b0(i14).B0(tL_messages_stickerSet.set.id, true)) {
                        si.b0(i14).f2(null, tLObject6, 2, null, false, false);
                    }
                    org.telegram.messenger.g0.i3(new hh0(13, tLObject6, document2), 250L);
                    break;
                } else if (tL_error2 != null) {
                    if (r8.r(tL_error2.text)) {
                        r8.n(i14).u(new Object[]{tL_stickers_addStickerToSet}, obj2);
                        break;
                    } else {
                        cc.d0(tL_error2);
                        break;
                    }
                }
                break;
            case 9:
                e40.a((org.telegram.ui.ActionBar.t1) obj6, (vf.b) obj5, (TLObject) obj4, this.b, (Context) obj3, (TLRPC.TL_inputGroupCallSlug) obj2, (TLRPC.TL_error) obj);
                break;
            case 10:
                LaunchActivity launchActivity = (LaunchActivity) obj6;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj4;
                TLObject tLObject7 = (TLObject) obj3;
                org.telegram.ui.ActionBar.t1 t1Var2 = (org.telegram.ui.ActionBar.t1) obj2;
                g50 g50Var2 = (g50) obj;
                String str3 = (String) obj5;
                ArrayList arrayList7 = launchActivity.e0;
                if (!launchActivity.isFinishing()) {
                    if (tL_error3 != null || launchActivity.p0 == null) {
                        g50Var = g50Var2;
                        if (tL_error3 == null || !tL_error3.text.startsWith("INVITE_HASH_EXPIRED") || LaunchActivity.T() == null) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(launchActivity);
                            String M02 = hd.M0(R.string.AppName, null);
                            org.telegram.ui.ActionBar.t1 t1Var3 = alertDialog$Builder.a;
                            t1Var3.S = M02;
                            if (tL_error3.text.startsWith("FLOOD_WAIT")) {
                                t1Var3.U = hd.M0(2131750687, null);
                            } else if (tL_error3.text.startsWith("INVITE_HASH_EXPIRED")) {
                                t1Var3.S = hd.M0(2131750875, null);
                                t1Var3.U = hd.M0(2131749152, null);
                            } else {
                                t1Var3.U = hd.M0(2131749075, null);
                            }
                            alertDialog$Builder.k(hd.M0(2131747831, null), null);
                            launchActivity.F0(alertDialog$Builder);
                        } else {
                            org.telegram.messenger.k5.n(null, 2131749152, cc.a0(LaunchActivity.T()), R.raw.linkbroken, 36);
                        }
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
                            np.s1(i14).Q3(chatInvite.chat, false);
                            ArrayList arrayList8 = new ArrayList();
                            arrayList8.add(chatInvite.chat);
                            int i18 = 1;
                            vr.a0(i14).m1(null, arrayList8, false, true);
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", chatInvite.chat.id);
                            if (arrayList7.isEmpty() || np.s1(i14).E(bundle, (org.telegram.ui.ActionBar.e2) i5.c.h(1, arrayList7), null, null)) {
                                boolean[] zArr = new boolean[1];
                                t1Var2.setOnCancelListener(new fg(i18, zArr));
                                if (!chatInvite.chat.forum) {
                                    np.s1(i14).s0(-chatInvite.chat.id, 0, new o80(launchActivity, g50Var2, zArr, bundle, chatInvite));
                                    break;
                                } else {
                                    Bundle bundle2 = new Bundle();
                                    bundle2.putLong("chat_id", chatInvite.chat.id);
                                    launchActivity.t0(u91.J0(launchActivity, bundle2));
                                }
                            }
                            g50Var = g50Var2;
                        }
                        g50Var = g50Var2;
                        TL_stars.TL_starsSubscriptionPricing tL_starsSubscriptionPricing = chatInvite.subscription_pricing;
                        if (tL_starsSubscriptionPricing == null || chatInvite.can_refulfill_subscription) {
                            org.telegram.ui.ActionBar.e2 e2Var = (org.telegram.ui.ActionBar.e2) i5.c.h(1, arrayList7);
                            e2Var.showDialog(new e70(launchActivity, chatInvite, str3, e2Var, e2Var instanceof an ? ((an) e2Var).Aa : null));
                        } else {
                            long j3 = tL_starsSubscriptionPricing.amount;
                            np.s1(i14).Q3(chatInvite.chat, false);
                            u8.y(launchActivity.P, false).h0(str3, chatInvite, new n(launchActivity, j3, i13));
                        }
                    }
                    try {
                        g50Var.run();
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
                vf.b bVar2 = (vf.b) obj3;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) obj2;
                np npVar2 = (np) obj;
                String str4 = (String) obj5;
                String str5 = LaunchActivity.C1;
                if (tLObject8 instanceof TLRPC.User) {
                    TLRPC.User user = (TLRPC.User) tLObject8;
                    npVar2.X3(user, false, false);
                    if (q10.B(user)) {
                        if (bVar2 != null) {
                            bVar2.b();
                        }
                        launchActivity2.m0(i14, user.id, null);
                        break;
                    } else {
                        launchActivity2.Y(i14, user, str4, bVar2);
                        break;
                    }
                } else {
                    if (bVar2 != null) {
                        bVar2.b();
                    }
                    StringBuilder sb4 = new StringBuilder("cant import contact token, err=");
                    sb4.append(tL_error4 == null ? null : tL_error4.text);
                    a8.d(sb4.toString());
                    org.telegram.ui.ActionBar.e2 Q = LaunchActivity.Q();
                    if (Q != null) {
                        org.telegram.messenger.k5.o(null, 2131748134, cc.a0(Q), null);
                        break;
                    }
                }
                break;
            case 12:
                LaunchActivity launchActivity3 = (LaunchActivity) obj6;
                yw ywVar = (yw) obj3;
                org.telegram.ui.ActionBar.e2 e2Var2 = (org.telegram.ui.ActionBar.e2) obj;
                TLRPC.User user2 = (TLRPC.User) obj2;
                String str6 = (String) obj5;
                String str7 = LaunchActivity.C1;
                if (((TLObject) obj4) instanceof TLRPC.TL_boolTrue) {
                    si.b0(i14).E0(false, true, new hp(launchActivity3, ywVar, e2Var2, user2, str6, 12));
                    break;
                }
                break;
            case 13:
                LaunchActivity launchActivity4 = (LaunchActivity) obj6;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) obj4;
                TLObject tLObject9 = (TLObject) obj3;
                TLRPC.TL_inputInvoiceSlug tL_inputInvoiceSlug = (TLRPC.TL_inputInvoiceSlug) obj2;
                g50 g50Var3 = (g50) obj;
                String str8 = (String) obj5;
                ArrayList arrayList9 = launchActivity4.e0;
                if (tL_error5 != null) {
                    if ("SUBSCRIPTION_ALREADY_ACTIVE".equalsIgnoreCase(tL_error5.text)) {
                        a02 = cc.a0((org.telegram.ui.ActionBar.e2) i5.c.h(1, arrayList9));
                        i7 = 2131747395;
                        r32 = 0;
                    } else {
                        r32 = 0;
                        a02 = cc.a0((org.telegram.ui.ActionBar.e2) i5.c.h(1, arrayList9));
                        i7 = 2131747396;
                    }
                    org.telegram.messenger.k5.o(r32, i7, a02, r32);
                } else if (!launchActivity4.isFinishing()) {
                    if (tLObject9 instanceof TLRPC.TL_payments_paymentFormStars) {
                        h6 h6Var = launchActivity4.Y0;
                        launchActivity4.Y0 = null;
                        u8.y(launchActivity4.P, false).X(null, tL_inputInvoiceSlug, (TLRPC.TL_payments_paymentFormStars) tLObject9, new x60(g50Var3, 1), new j70(h6Var, z10 ? 1 : 0));
                        break;
                    } else {
                        if (tLObject9 instanceof TLRPC.PaymentForm) {
                            TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject9;
                            np.s1(i14).Y3(paymentForm.users, false);
                            kl0Var = new kl0(paymentForm, null, str8, launchActivity4.M().getLastFragment());
                        } else {
                            kl0Var = tLObject9 instanceof TLRPC.PaymentReceipt ? new kl0((TLRPC.PaymentReceipt) tLObject9) : null;
                        }
                        if (kl0Var != null) {
                            h6 h6Var2 = launchActivity4.Y0;
                            if (h6Var2 != null) {
                                launchActivity4.Y0 = null;
                                kl0Var.a1 = new te(9, h6Var2);
                            }
                            launchActivity4.t0(kl0Var);
                        }
                    }
                }
                try {
                    g50Var3.run();
                    break;
                } catch (Exception e12) {
                    a8.g(e12, true);
                    return;
                }
            case 14:
                kd0 kd0Var = (kd0) obj6;
                String str9 = (String) obj5;
                f5.f fVar = (f5.f) obj4;
                List list = (List) obj3;
                String str10 = (String) obj2;
                String str11 = (String) obj;
                ce0 ce0Var = kd0Var.w;
                StringBuilder u10 = a8.p0.u("LoginBilling queried \"", str9, "\" product: ");
                u10.append(org.telegram.messenger.r1.j(fVar.a));
                a8.b(u10.toString());
                int i19 = fVar.a;
                if (i19 != 0) {
                    kd0Var.e = "BILLING_".concat(org.telegram.messenger.r1.j(i19));
                    new cc(ce0Var.a0, null).H(R.raw.error, hd.a0(null, null, 2131743878, org.telegram.messenger.r1.j(fVar.a)));
                    break;
                } else if (list != null && !list.isEmpty()) {
                    f5.m mVar = (f5.m) list.get(0);
                    f5.i a10 = mVar.a();
                    TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode = new TLRPC.TL_inputStorePaymentAuthCode();
                    tL_inputStorePaymentAuthCode.currency = a10.c;
                    tL_inputStorePaymentAuthCode.amount = (long) (Math.pow(10.0d, org.telegram.messenger.r1.i().h(tL_inputStorePaymentAuthCode.currency)) * (a10.b / Math.pow(10.0d, 6.0d)));
                    tL_inputStorePaymentAuthCode.phone_code_hash = TextUtils.isEmpty(str10) ? "" : str10;
                    tL_inputStorePaymentAuthCode.phone_number = str11;
                    int i20 = this.b;
                    tL_inputStorePaymentAuthCode.premium_days = i20;
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
                    i10 = ((org.telegram.ui.ActionBar.e2) ce0Var).currentAccount;
                    ConnectionsManager.getInstance(i10).sendRequest(tL_payments_canPurchaseStore, new t8(kd0Var, a10, i20, mVar, tL_inputStorePaymentAuthCode, str9, tL_payments_canPurchaseStore, 3), 10);
                    break;
                } else {
                    kd0Var.e = "PRODUCT_NOT_FOUND";
                    new cc(ce0Var.a0, null).H(R.raw.error, hd.a0(null, null, 2131743878, "PRODUCT_NOT_FOUND"));
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
                RectF rectF = ProfileActivity.X6;
                if (profileActivity.getParentActivity() != null) {
                    m60 H = m60.H(profileActivity, view);
                    H.W(profileActivity.a.U0(view, false));
                    H.w = false;
                    H.c(R.drawable.msg_copy, hd.M0(2131751767, null), new u11(profileActivity, str12, i14, 11), false);
                    H.l(R.drawable.msg_translate, hd.M0(2131743956, null), new ok0(profileActivity, strArr2, str13, str12, 11), zArr2[0]);
                    H.Z();
                    break;
                }
                break;
            case 16:
                org.telegram.ui.Wallet.d2 d2Var = (org.telegram.ui.Wallet.d2) obj6;
                org.telegram.ui.Wallet.z1 z1Var = (org.telegram.ui.Wallet.z1) obj4;
                String str14 = (String) obj5;
                org.telegram.ui.Wallet.i0 i0Var = (org.telegram.ui.Wallet.i0) obj2;
                z10 z10Var = (z10) obj;
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    String str15 = z1Var.d;
                    tonconnectsession = z1Var.a;
                    JSONObject put2 = jSONObject2.put("id", str15);
                    if (i14 < 0) {
                        put2.put("result", obj3);
                    } else {
                        if (str14 == null) {
                            str14 = "Could not complete request";
                        }
                        put2.put("error", new JSONObject().put("code", i14).put("message", str14));
                    }
                    JSONObject put3 = new JSONObject().put("body", WalletEngine2.tonConnectCrypto(i0Var, tonconnectsession, z1Var.h, z1Var.g, new JSONObject().put("encrypt", put2)).getString("body")).put("traceId", z1Var.i);
                    if (i14 < 0 && "disconnect".equals(z1Var.e)) {
                        z10 = true;
                    }
                    put = put3.put("disconnect", z10);
                } catch (Exception e13) {
                    i11 = org.telegram.ui.Wallet.d2.i("encrypt response", e13);
                    jSONObject = null;
                }
                if (!np.s1(d2Var.a).f7.edit().putString(org.telegram.ui.Wallet.d2.l(tonconnectsession.id, z1Var.b), put.toString()).commit()) {
                    throw new IllegalStateException("Could not save TON Connect response");
                }
                jSONObject = put;
                i11 = null;
                org.telegram.messenger.g0.h3(new cu0(d2Var, jSONObject, z10Var, i11, z1Var, 7));
                break;
                break;
            case 17:
                boolean[] zArr3 = (boolean[]) obj6;
                Context context2 = (Context) obj3;
                TLRPC.User user3 = (TLRPC.User) obj5;
                JSONObject jSONObject3 = (JSONObject) obj4;
                org.telegram.ui.ActionBar.e6 e6Var2 = (org.telegram.ui.ActionBar.e6) obj2;
                org.telegram.ui.Wallet.p2 p2Var = (org.telegram.ui.Wallet.p2) obj;
                if (!zArr3[0]) {
                    zArr3[0] = true;
                    int i21 = this.b;
                    org.telegram.ui.Wallet.l0 x10 = org.telegram.ui.Wallet.l0.x(i21);
                    String t6 = x10.t();
                    byte[] y10 = x10.y();
                    if (t6 == null || y10 == null || x10.b == null) {
                        cc.b0(hd.M0(2131742959, null));
                        p2Var.a();
                        break;
                    } else {
                        int currentTime = ConnectionsManager.getInstance(i21).getCurrentTime();
                        try {
                            if ("signData".equals(jSONObject3.optString("method"))) {
                                JSONObject jSONObject4 = jSONObject3.getJSONObject("payload");
                                org.telegram.ui.Wallet.d2.G(t6, jSONObject4);
                                org.telegram.ui.Wallet.s2.c(context2, i21, user3, jSONObject4, t6, (byte[]) y10.clone(), e6Var2, p2Var);
                            } else {
                                JSONObject jSONObject5 = jSONObject3.getJSONObject("transaction");
                                org.telegram.ui.Wallet.d2.I(jSONObject5, t6, currentTime);
                                org.telegram.ui.Wallet.s2.d(context2, i21, user3, new org.telegram.ui.Wallet.c2(jSONObject5), t6, (byte[]) y10.clone(), e6Var2, p2Var);
                            }
                            break;
                        } catch (Exception e14) {
                            cc.b0(org.telegram.ui.Wallet.d2.i("widget call", e14));
                            p2Var.a();
                            return;
                        }
                    }
                }
                break;
            default:
                org.telegram.ui.web.v0 v0Var = (org.telegram.ui.web.v0) obj6;
                String str16 = (String) obj5;
                TLObject tLObject10 = (TLObject) obj4;
                TLRPC.TL_error tL_error6 = (TLRPC.TL_error) obj3;
                org.telegram.ui.web.s0 s0Var = (org.telegram.ui.web.s0) obj2;
                i7 i7Var = (i7) obj;
                try {
                    JSONObject jSONObject6 = new JSONObject();
                    jSONObject6.put("req_id", str16);
                    if (tLObject10 instanceof TLRPC.TL_dataJSON) {
                        jSONObject6.put("result", new JSONTokener(((TLRPC.TL_dataJSON) tLObject10).data).nextValue());
                    } else if (tL_error6 != null) {
                        jSONObject6.put("error", tL_error6.text);
                    }
                    org.telegram.ui.web.v0.w(i14, s0Var, i7Var, "custom_method_invoked", jSONObject6);
                    break;
                } catch (Exception e15) {
                    a8.g(e15, true);
                    v0Var.Z(null);
                }
        }
    }

    public /* synthetic */ u2(int i7, ArrayList arrayList, ArrayList arrayList2, Integer num, ve veVar, ve veVar2, ve veVar3) {
        this.a = 2;
        this.b = i7;
        this.c = arrayList;
        this.d = arrayList2;
        this.e = num;
        this.f = veVar;
        this.h = veVar2;
        this.n = veVar3;
    }

    public /* synthetic */ u2(Object obj, int i7, Serializable serializable, Object obj2, Object obj3, Object obj4, Object obj5, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = i7;
        this.d = serializable;
        this.e = obj2;
        this.f = obj3;
        this.h = obj4;
        this.n = obj5;
    }

    public /* synthetic */ u2(Object obj, Object obj2, Object obj3, int i7, Object obj4, Object obj5, Object obj6, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = i7;
        this.f = obj4;
        this.h = obj5;
        this.n = obj6;
    }

    public /* synthetic */ u2(is isVar, TLObject tLObject, Object obj, TLObject tLObject2, Object obj2, int i7, String str, int i10) {
        this.a = i10;
        this.c = isVar;
        this.e = tLObject;
        this.f = obj;
        this.h = tLObject2;
        this.n = obj2;
        this.b = i7;
        this.d = str;
    }

    public /* synthetic */ u2(TLObject tLObject, org.telegram.ui.ActionBar.t1 t1Var, Context context, int i7, TL_phone.exportGroupCallInvite exportgroupcallinvite, org.telegram.ui.ActionBar.e6 e6Var, m40 m40Var) {
        this.a = 6;
        this.c = tLObject;
        this.d = t1Var;
        this.f = context;
        this.b = i7;
        this.e = exportgroupcallinvite;
        this.h = e6Var;
        this.n = m40Var;
    }

    public /* synthetic */ u2(org.telegram.ui.ActionBar.t1 t1Var, TLObject tLObject, int i7, TLRPC.Document document, TLRPC.TL_error tL_error, Object obj, TLRPC.TL_stickers_addStickerToSet tL_stickers_addStickerToSet) {
        this.a = 8;
        this.c = t1Var;
        this.d = tLObject;
        this.b = i7;
        this.e = document;
        this.f = tL_error;
        this.h = obj;
        this.n = tL_stickers_addStickerToSet;
    }

    public /* synthetic */ u2(org.telegram.ui.g4 g4Var, int i7, vf.b bVar, TLObject tLObject, String str, org.telegram.ui.e0 e0Var, TLRPC.TL_messages_getWebPage tL_messages_getWebPage) {
        this.a = 4;
        this.c = g4Var;
        this.b = i7;
        this.e = bVar;
        this.f = tLObject;
        this.d = str;
        this.h = e0Var;
        this.n = tL_messages_getWebPage;
    }

    public /* synthetic */ u2(LaunchActivity launchActivity, TLObject tLObject, int i7, yw ywVar, org.telegram.ui.ActionBar.e2 e2Var, TLRPC.User user, String str) {
        this.a = 12;
        this.c = launchActivity;
        this.e = tLObject;
        this.b = i7;
        this.f = ywVar;
        this.n = e2Var;
        this.h = user;
        this.d = str;
    }

    public /* synthetic */ u2(LaunchActivity launchActivity, TLRPC.TL_error tL_error, TLObject tLObject, int i7, org.telegram.ui.ActionBar.t1 t1Var, g50 g50Var, String str) {
        this.a = 10;
        this.c = launchActivity;
        this.e = tL_error;
        this.f = tLObject;
        this.b = i7;
        this.h = t1Var;
        this.n = g50Var;
        this.d = str;
    }

    public /* synthetic */ u2(kd0 kd0Var, String str, f5.f fVar, List list, String str2, String str3, int i7) {
        this.a = 14;
        this.c = kd0Var;
        this.d = str;
        this.e = fVar;
        this.f = list;
        this.h = str2;
        this.n = str3;
        this.b = i7;
    }

    public /* synthetic */ u2(ProfileActivity profileActivity, View view, String str, int i7, boolean[] zArr, String[] strArr, String str2) {
        this.a = 15;
        this.c = profileActivity;
        this.e = view;
        this.d = str;
        this.b = i7;
        this.f = zArr;
        this.h = strArr;
        this.n = str2;
    }

    public /* synthetic */ u2(org.telegram.ui.Wallet.d2 d2Var, org.telegram.ui.Wallet.z1 z1Var, int i7, Object obj, String str, org.telegram.ui.Wallet.i0 i0Var, z10 z10Var) {
        this.a = 16;
        this.c = d2Var;
        this.e = z1Var;
        this.b = i7;
        this.f = obj;
        this.d = str;
        this.h = i0Var;
        this.n = z10Var;
    }

    public /* synthetic */ u2(org.telegram.ui.web.v0 v0Var, String str, TLObject tLObject, TLRPC.TL_error tL_error, int i7, org.telegram.ui.web.s0 s0Var, i7 i7Var) {
        this.a = 18;
        this.c = v0Var;
        this.d = str;
        this.e = tLObject;
        this.f = tL_error;
        this.b = i7;
        this.h = s0Var;
        this.n = i7Var;
    }

    public /* synthetic */ u2(boolean[] zArr, Context context, int i7, TLRPC.User user, JSONObject jSONObject, org.telegram.ui.ActionBar.e6 e6Var, org.telegram.ui.Wallet.p2 p2Var) {
        this.a = 17;
        this.c = zArr;
        this.f = context;
        this.b = i7;
        this.d = user;
        this.e = jSONObject;
        this.h = e6Var;
        this.n = p2Var;
    }
}
