package bi;

import android.content.Context;
import android.graphics.RectF;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;
import org.json.JSONTokener;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.az;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.gj;
import org.telegram.messenger.gs;
import org.telegram.messenger.hd;
import org.telegram.messenger.k10;
import org.telegram.messenger.ls;
import org.telegram.messenger.my;
import org.telegram.messenger.np;
import org.telegram.messenger.p10;
import org.telegram.messenger.si;
import org.telegram.messenger.ur;
import org.telegram.messenger.ve;
import org.telegram.messenger.y10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.f21;
import org.telegram.ui.Components.fm0;
import org.telegram.ui.Components.gq0;
import org.telegram.ui.Components.lc;
import org.telegram.ui.Components.m80;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.og;
import org.telegram.ui.Components.pe0;
import org.telegram.ui.Components.r70;
import org.telegram.ui.Components.rf;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.Wallet.WalletEngine2;
import org.telegram.ui.a70;
import org.telegram.ui.bn;
import org.telegram.ui.cx;
import org.telegram.ui.de0;
import org.telegram.ui.h40;
import org.telegram.ui.h60;
import org.telegram.ui.hg;
import org.telegram.ui.ii;
import org.telegram.ui.j9;
import org.telegram.ui.kg0;
import org.telegram.ui.ld0;
import org.telegram.ui.m70;
import org.telegram.ui.ml0;
import org.telegram.ui.p40;
import org.telegram.ui.r80;
import org.telegram.ui.up;
import org.telegram.ui.wn;
import org.telegram.ui.wt0;
import org.telegram.ui.y91;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class f5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object n;

    public /* synthetic */ f5(int i7, FrameLayout frameLayout, TLRPC.InputGroupCall inputGroupCall, org.telegram.ui.ActionBar.w2 w2Var, org.telegram.ui.ActionBar.h6 h6Var, m80 m80Var, String[] strArr) {
        this.a = 5;
        this.c = inputGroupCall;
        this.b = i7;
        this.d = strArr;
        this.e = frameLayout;
        this.f = m80Var;
        this.n = w2Var;
        this.h = h6Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:160:0x0494, code lost:
    
        if (r13.chat.has_geo != false) goto L147;
     */
    /* JADX WARN: Type inference failed for: r10v19 */
    /* JADX WARN: Type inference failed for: r10v20, types: [java.lang.String, org.telegram.ui.ActionBar.h6] */
    /* JADX WARN: Type inference failed for: r10v21 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        rf rfVar;
        h60 h60Var;
        ml0 ml0Var;
        ?? r10;
        lc b02;
        int i7;
        int i10;
        String i11;
        JSONObject jSONObject;
        TL_wallet.tonConnectSession tonconnectsession;
        JSONObject put;
        int i12 = this.a;
        int i13 = 9;
        int i14 = 11;
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
                com.google.android.gms.internal.vision.e2.r(sb2, np.u1(i15).X2, "/", (String) obj5, "/c/");
                sb2.append(((TL_stars.TL_starGiftCollection) obj4).collection_id);
                String sb3 = sb2.toString();
                new s5((gq0) obj6, (Context) obj3, sb3, sb3, (org.telegram.ui.ActionBar.h6) obj2, (org.telegram.ui.ActionBar.g2) obj).show();
                break;
            case 1:
                ArrayList arrayList = (ArrayList) obj5;
                a0.h hVar = (a0.h) obj4;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj3;
                TLObject tLObject = (TLObject) obj2;
                np npVar = (np) obj;
                jg.h1 h1Var = ((jg.c1) obj6).h;
                if (h1Var.k0 != 0 && i15 == h1Var.j0 && h1Var.E != null && h1Var.y != null) {
                    h1Var.Y(hVar, arrayList, false);
                    if (tL_error == null) {
                        TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject;
                        npVar.f4(tL_channels_channelParticipants.users, false);
                        npVar.Z3(tL_channels_channelParticipants.chats, false);
                        h1Var.y.isEmpty();
                        if (!tL_channels_channelParticipants.participants.isEmpty()) {
                            long e10 = k10.i(h1Var.f).e();
                            for (int i16 = 0; i16 < tL_channels_channelParticipants.participants.size(); i16++) {
                                long B1 = gj.B1(tL_channels_channelParticipants.participants.get(i16).peer);
                                if (h1Var.E.h(B1) < 0 && ((B1 != 0 || h1Var.E.h(e10) < 0) && (h1Var.l0 || (B1 != e10 && B1 != 0)))) {
                                    if (B1 >= 0) {
                                        TLRPC.User c22 = npVar.c2(Long.valueOf(B1));
                                        if (c22 == null) {
                                            break;
                                        } else {
                                            h1Var.y.add(c22);
                                        }
                                    } else {
                                        TLRPC.Chat O0 = npVar.O0(Long.valueOf(-B1));
                                        if (O0 == null) {
                                            break;
                                        } else {
                                            h1Var.y.add(O0);
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
                int i17 = this.b;
                if (!P1 || MediaController.h2) {
                    MediaController.c2 = arrayList2;
                    MediaController.d2 = arrayList3;
                    MediaController.e2 = null;
                    MediaController.b2 = veVar2;
                    MediaController.a2 = veVar;
                    ls.e().k(ls.r2, Integer.valueOf(i17), arrayList2, arrayList3, num);
                    break;
                } else {
                    f5 f5Var = MediaController.e2;
                    if (f5Var != null) {
                        org.telegram.messenger.g0.r(f5Var);
                    }
                    f5 f5Var2 = new f5(i17, arrayList2, arrayList3, num, veVar, veVar2, veVar3);
                    MediaController.e2 = f5Var2;
                    org.telegram.messenger.g0.h3(f5Var2, 1000);
                    break;
                }
                break;
            case 3:
                az azVar = (az) obj6;
                TLObject tLObject2 = (TLObject) obj4;
                TLRPC.InputFile inputFile = (TLRPC.InputFile) obj3;
                TLRPC.InputMedia inputMedia = (TLRPC.InputMedia) obj2;
                my myVar = (my) obj;
                String str = (String) obj5;
                azVar.getClass();
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
                    TLRPC.TL_messages_sendMultiMedia tL_messages_sendMultiMedia = (TLRPC.TL_messages_sendMultiMedia) myVar.c;
                    if (i15 >= 0 && i15 < tL_messages_sendMultiMedia.multi_media.size()) {
                        tL_messages_sendMultiMedia.multi_media.get(i15).media = tL_inputMediaUploadedPhoto;
                    }
                    ArrayList arrayList4 = myVar.A;
                    if (arrayList4 != null && i15 >= 0 && i15 < arrayList4.size()) {
                        myVar.A.set(i15, tL_inputMediaUploadedPhoto);
                    }
                    myVar.j = null;
                    myVar.i = null;
                    HashMap hashMap = myVar.E;
                    if (hashMap != null) {
                        hashMap.remove(str + "_ct");
                    }
                    azVar.A0(myVar, tL_inputMediaUploadedPhoto, null, str);
                    break;
                } else {
                    myVar.c();
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
                if (g4Var.H0 != 0 && i15 == g4Var.J0) {
                    if (bVar != null) {
                        bVar.b();
                    }
                    g4Var.H0 = 0;
                    g4Var.Z(false);
                    if (g4Var.W) {
                        if (tLObject3 instanceof TLRPC.TL_messages_webPage) {
                            TLRPC.TL_messages_webPage tL_messages_webPage = (TLRPC.TL_messages_webPage) tLObject3;
                            np.u1(g4Var.Y).f4(tL_messages_webPage.users, false);
                            np.u1(g4Var.Y).Z3(tL_messages_webPage.chats, false);
                            TLRPC.WebPage webPage = tL_messages_webPage.webpage;
                            if (webPage == null || !(webPage.cached_page instanceof TL_iv.TL_page)) {
                                if (!((Boolean) e0Var.run()).booleanValue()) {
                                    if (np.u1(g4Var.Y).T2(tL_messages_getWebPage.url)) {
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
                                if (np.u1(g4Var.Y).T2(tL_messages_getWebPage.url)) {
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
                TL_phone.toggleGroupCallSettings togglegroupcallsettings = new TL_phone.toggleGroupCallSettings();
                togglegroupcallsettings.call = inputGroupCall;
                togglegroupcallsettings.reset_invite_hash = true;
                int i18 = this.b;
                ConnectionsManager.getInstance(i18).sendRequest(togglegroupcallsettings, new org.telegram.ui.t8(i18, (FrameLayout) obj4, inputGroupCall, (org.telegram.ui.ActionBar.w2) obj, (org.telegram.ui.ActionBar.h6) obj2, (m80) obj3, (String[]) obj5));
                break;
            case 6:
                TLObject tLObject4 = (TLObject) obj6;
                org.telegram.ui.ActionBar.t1 t1Var = (org.telegram.ui.ActionBar.t1) obj5;
                Context context = (Context) obj3;
                TL_phone.exportGroupCallInvite exportgroupcallinvite = (TL_phone.exportGroupCallInvite) obj4;
                org.telegram.ui.ActionBar.h6 h6Var = (org.telegram.ui.ActionBar.h6) obj2;
                p40 p40Var = (p40) obj;
                if (tLObject4 instanceof TL_phone.exportedGroupCallInvite) {
                    t1Var.dismiss();
                    j9.n0(context, this.b, exportgroupcallinvite.call, ((TL_phone.exportedGroupCallInvite) tLObject4).link, h6Var, true, true);
                } else {
                    t1Var.dismiss();
                }
                org.telegram.messenger.g0.g3(p40Var);
                break;
            case 7:
                TLObject tLObject5 = (TLObject) obj5;
                ArrayList arrayList5 = (ArrayList) obj4;
                AtomicInteger atomicInteger = (AtomicInteger) obj3;
                ArrayList arrayList6 = (ArrayList) obj2;
                up upVar = (up) obj;
                if (((TLRPC.TL_error) obj6) == null && (tLObject5 instanceof TLRPC.TL_channels_channelParticipants)) {
                    arrayList5.set(i15, (TLRPC.TL_channels_channelParticipants) tLObject5);
                }
                atomicInteger.getAndIncrement();
                if (atomicInteger.get() == arrayList6.size()) {
                    upVar.run();
                    break;
                }
                break;
            case 8:
                rf rfVar2 = (rf) obj6;
                ji.p pVar = (ji.p) obj5;
                ArrayList arrayList7 = (ArrayList) obj3;
                ArrayList arrayList8 = (ArrayList) obj2;
                ji.f fVar = (ji.f) obj;
                ChatActivityEnterView chatActivityEnterView = rfVar2.a;
                pe0 a82 = chatActivityEnterView.F3.a8(pVar, (org.telegram.ui.Cells.c5) obj4);
                if (a82 == null) {
                    org.telegram.messenger.g0.E2(pVar);
                    break;
                } else {
                    int G0 = chatActivityEnterView.G0(org.telegram.ui.ActionBar.m6.E8);
                    int i19 = 0;
                    while (i19 < arrayList7.size()) {
                        ji.k kVar = i19 < arrayList8.size() ? (ji.k) arrayList8.get(i19) : null;
                        if (kVar == null) {
                            Context context2 = chatActivityEnterView.getContext();
                            CharSequence charSequence = (CharSequence) arrayList7.get(i19);
                            boolean z11 = i19 == i15;
                            nr nrVar = ai.p0.I0;
                            a82.c(new ai.m0(context2, charSequence, null, G0, z11), 44, new ii(fVar, i19, i13));
                            rfVar = rfVar2;
                        } else {
                            Context context3 = chatActivityEnterView.getContext();
                            CharSequence charSequence2 = (CharSequence) arrayList7.get(i19);
                            CharSequence charSequence3 = kVar.a;
                            boolean z12 = i19 == i15;
                            nr nrVar2 = ai.p0.I0;
                            ai.m0 m0Var = new ai.m0(context3, charSequence2, charSequence3, G0, z12);
                            a82.c(m0Var, 54, null);
                            rfVar = rfVar2;
                            int i20 = G0;
                            G0 = i20;
                            m0Var.setOnClickListener(new fi.k5(rfVar, kVar, i20, a82, 4));
                        }
                        i19++;
                        rfVar2 = rfVar;
                    }
                    a82.J = new og(pVar, 22);
                    int[] iArr = new int[2];
                    chatActivityEnterView.getLocationInWindow(iArr);
                    a82.F = iArr[1];
                    a82.H = org.telegram.messenger.g0.L(ls.n5);
                    a82.i();
                    break;
                }
            case 9:
                TLObject tLObject6 = (TLObject) obj5;
                TLRPC.Document document2 = (TLRPC.Document) obj4;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj3;
                TLRPC.TL_stickers_addStickerToSet tL_stickers_addStickerToSet = (TLRPC.TL_stickers_addStickerToSet) obj;
                ((org.telegram.ui.ActionBar.t1) obj6).dismiss();
                if (tLObject6 instanceof TLRPC.TL_messages_stickerSet) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject6;
                    si.d0(i15).N1(tL_messages_stickerSet, true);
                    if (!si.d0(i15).E0(tL_messages_stickerSet.set.id, true)) {
                        si.d0(i15).k2(null, tLObject6, 2, null, false, false);
                    }
                    org.telegram.messenger.g0.h3(new fm0(i14, tLObject6, document2), 250L);
                    break;
                } else if (tL_error2 != null) {
                    if (org.telegram.messenger.r8.r(tL_error2.text)) {
                        org.telegram.messenger.r8.n(i15).u(new Object[]{tL_stickers_addStickerToSet}, obj2);
                        break;
                    } else {
                        lc.e0(tL_error2);
                        break;
                    }
                }
                break;
            case 10:
                h40.a((org.telegram.ui.ActionBar.t1) obj6, (vf.b) obj5, (TLObject) obj4, this.b, (Context) obj3, (TLRPC.TL_inputGroupCallSlug) obj2, (TLRPC.TL_error) obj);
                break;
            case 11:
                LaunchActivity launchActivity = (LaunchActivity) obj6;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj4;
                TLObject tLObject7 = (TLObject) obj3;
                org.telegram.ui.ActionBar.t1 t1Var2 = (org.telegram.ui.ActionBar.t1) obj2;
                h60 h60Var2 = (h60) obj;
                String str3 = (String) obj5;
                ArrayList arrayList9 = launchActivity.e0;
                if (!launchActivity.isFinishing()) {
                    if (tL_error3 != null || launchActivity.p0 == null) {
                        h60Var = h60Var2;
                        if (tL_error3 == null || !tL_error3.text.startsWith("INVITE_HASH_EXPIRED") || LaunchActivity.T() == null) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(launchActivity);
                            String N0 = hd.N0(R.string.AppName, null);
                            org.telegram.ui.ActionBar.t1 t1Var3 = alertDialog$Builder.a;
                            t1Var3.S = N0;
                            if (tL_error3.text.startsWith("FLOOD_WAIT")) {
                                t1Var3.U = hd.N0(2131750670, null);
                            } else if (tL_error3.text.startsWith("INVITE_HASH_EXPIRED")) {
                                t1Var3.S = hd.N0(2131750863, null);
                                t1Var3.U = hd.N0(2131748959, null);
                            } else {
                                t1Var3.U = hd.N0(2131748882, null);
                            }
                            alertDialog$Builder.k(hd.N0(2131747637, null), null);
                            launchActivity.F0(alertDialog$Builder);
                        } else {
                            org.telegram.messenger.f3.n(null, 2131748959, lc.b0(LaunchActivity.T()), R.raw.linkbroken, 36);
                        }
                    } else {
                        TLRPC.ChatInvite chatInvite = (TLRPC.ChatInvite) tLObject7;
                        TLRPC.Chat chat = chatInvite.chat;
                        if (chat != null) {
                            if (org.telegram.messenger.v3.l0(chat)) {
                                TLRPC.Chat chat2 = chatInvite.chat;
                                if (!chat2.kicked) {
                                    if (!org.telegram.messenger.v3.t0(chat2)) {
                                        if (!(chatInvite instanceof TLRPC.TL_chatInvitePeek)) {
                                            break;
                                        }
                                    }
                                }
                            }
                            np.u1(i15).X3(chatInvite.chat, false);
                            ArrayList arrayList10 = new ArrayList();
                            arrayList10.add(chatInvite.chat);
                            int i21 = 1;
                            ur.a0(i15).m1(null, arrayList10, false, true);
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", chatInvite.chat.id);
                            if (arrayList9.isEmpty() || np.u1(i15).E(bundle, (org.telegram.ui.ActionBar.g2) i5.c.h(1, arrayList9), null, null)) {
                                boolean[] zArr = new boolean[1];
                                t1Var2.setOnCancelListener(new hg(i21, zArr));
                                if (!chatInvite.chat.forum) {
                                    np.u1(i15).t0(-chatInvite.chat.id, 0, new r80(launchActivity, h60Var2, zArr, bundle, chatInvite));
                                    break;
                                } else {
                                    Bundle bundle2 = new Bundle();
                                    bundle2.putLong("chat_id", chatInvite.chat.id);
                                    launchActivity.t0(y91.J0(launchActivity, bundle2));
                                }
                            }
                            h60Var = h60Var2;
                        }
                        h60Var = h60Var2;
                        TL_stars.TL_starsSubscriptionPricing tL_starsSubscriptionPricing = chatInvite.subscription_pricing;
                        if (tL_starsSubscriptionPricing == null || chatInvite.can_refulfill_subscription) {
                            org.telegram.ui.ActionBar.g2 g2Var = (org.telegram.ui.ActionBar.g2) i5.c.h(1, arrayList9);
                            g2Var.showDialog(new r70(launchActivity, chatInvite, str3, g2Var, g2Var instanceof bn ? ((bn) g2Var).Ba : null));
                        } else {
                            long j3 = tL_starsSubscriptionPricing.amount;
                            np.u1(i15).X3(chatInvite.chat, false);
                            di.y8.y(launchActivity.P, false).h0(str3, chatInvite, new n(launchActivity, j3, 2));
                        }
                    }
                    try {
                        h60Var.run();
                        break;
                    } catch (Exception e11) {
                        org.telegram.messenger.a8.g(e11, true);
                        return;
                    }
                }
                break;
            case 12:
                LaunchActivity launchActivity2 = (LaunchActivity) obj6;
                TLObject tLObject8 = (TLObject) obj4;
                vf.b bVar2 = (vf.b) obj3;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) obj2;
                np npVar2 = (np) obj;
                String str4 = (String) obj5;
                String str5 = LaunchActivity.C1;
                if (tLObject8 instanceof TLRPC.User) {
                    TLRPC.User user = (TLRPC.User) tLObject8;
                    npVar2.e4(user, false, false);
                    if (p10.C(user)) {
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
                    org.telegram.messenger.a8.d(sb4.toString());
                    org.telegram.ui.ActionBar.g2 Q = LaunchActivity.Q();
                    if (Q != null) {
                        org.telegram.messenger.f3.o(null, 2131747941, lc.b0(Q), null);
                        break;
                    }
                }
                break;
            case 13:
                LaunchActivity launchActivity3 = (LaunchActivity) obj6;
                cx cxVar = (cx) obj3;
                org.telegram.ui.ActionBar.g2 g2Var2 = (org.telegram.ui.ActionBar.g2) obj;
                TLRPC.User user2 = (TLRPC.User) obj2;
                String str6 = (String) obj5;
                String str7 = LaunchActivity.C1;
                if (((TLObject) obj4) instanceof TLRPC.TL_boolTrue) {
                    si.d0(i15).H0(false, true, new wn((Object) launchActivity3, (Object) cxVar, (Object) g2Var2, (Object) user2, str6, 13));
                    break;
                }
                break;
            case 14:
                LaunchActivity launchActivity4 = (LaunchActivity) obj6;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) obj4;
                TLObject tLObject9 = (TLObject) obj3;
                TLRPC.TL_inputInvoiceSlug tL_inputInvoiceSlug = (TLRPC.TL_inputInvoiceSlug) obj2;
                h60 h60Var3 = (h60) obj;
                String str8 = (String) obj5;
                ArrayList arrayList11 = launchActivity4.e0;
                if (tL_error5 != null) {
                    if ("SUBSCRIPTION_ALREADY_ACTIVE".equalsIgnoreCase(tL_error5.text)) {
                        b02 = lc.b0((org.telegram.ui.ActionBar.g2) i5.c.h(1, arrayList11));
                        i7 = 2131747201;
                        r10 = 0;
                    } else {
                        r10 = 0;
                        b02 = lc.b0((org.telegram.ui.ActionBar.g2) i5.c.h(1, arrayList11));
                        i7 = 2131747202;
                    }
                    org.telegram.messenger.f3.o(r10, i7, b02, r10);
                } else if (!launchActivity4.isFinishing()) {
                    if (tLObject9 instanceof TLRPC.TL_payments_paymentFormStars) {
                        q8 q8Var = launchActivity4.Y0;
                        launchActivity4.Y0 = null;
                        di.y8.y(launchActivity4.P, false).W(null, tL_inputInvoiceSlug, (TLRPC.TL_payments_paymentFormStars) tLObject9, new a70(h60Var3, 1), new m70(q8Var, z10 ? 1 : 0));
                        break;
                    } else {
                        if (tLObject9 instanceof TLRPC.PaymentForm) {
                            TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject9;
                            np.u1(i15).f4(paymentForm.users, false);
                            ml0Var = new ml0(paymentForm, null, str8, launchActivity4.M().getLastFragment());
                        } else {
                            ml0Var = tLObject9 instanceof TLRPC.PaymentReceipt ? new ml0((TLRPC.PaymentReceipt) tLObject9) : null;
                        }
                        if (ml0Var != null) {
                            q8 q8Var2 = launchActivity4.Y0;
                            if (q8Var2 != null) {
                                launchActivity4.Y0 = null;
                                ml0Var.a1 = new org.telegram.ui.ve(i13, q8Var2);
                            }
                            launchActivity4.t0(ml0Var);
                        }
                    }
                }
                try {
                    h60Var3.run();
                    break;
                } catch (Exception e12) {
                    org.telegram.messenger.a8.g(e12, true);
                    return;
                }
            case 15:
                ld0 ld0Var = (ld0) obj6;
                String str9 = (String) obj5;
                f5.f fVar2 = (f5.f) obj4;
                List list = (List) obj3;
                String str10 = (String) obj2;
                String str11 = (String) obj;
                de0 de0Var = ld0Var.w;
                StringBuilder u10 = a8.p0.u("LoginBilling queried \"", str9, "\" product: ");
                u10.append(org.telegram.messenger.r1.j(fVar2.a));
                org.telegram.messenger.a8.b(u10.toString());
                int i22 = fVar2.a;
                if (i22 != 0) {
                    ld0Var.e = "BILLING_".concat(org.telegram.messenger.r1.j(i22));
                    new lc(de0Var.a0, null).H(R.raw.error, hd.a0(null, null, 2131743633, org.telegram.messenger.r1.j(fVar2.a)));
                    break;
                } else if (list != null && !list.isEmpty()) {
                    f5.m mVar = (f5.m) list.get(0);
                    f5.i a10 = mVar.a();
                    TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode = new TLRPC.TL_inputStorePaymentAuthCode();
                    tL_inputStorePaymentAuthCode.currency = a10.c;
                    tL_inputStorePaymentAuthCode.amount = (long) (Math.pow(10.0d, org.telegram.messenger.r1.i().h(tL_inputStorePaymentAuthCode.currency)) * (a10.b / Math.pow(10.0d, 6.0d)));
                    tL_inputStorePaymentAuthCode.phone_code_hash = TextUtils.isEmpty(str10) ? "" : str10;
                    tL_inputStorePaymentAuthCode.phone_number = str11;
                    int i23 = this.b;
                    tL_inputStorePaymentAuthCode.premium_days = i23;
                    StringBuilder u11 = a8.p0.u("LoginBilling found \"", str9, "\" product, with currency=");
                    u11.append(tL_inputStorePaymentAuthCode.currency);
                    u11.append(" amount=");
                    u11.append(tL_inputStorePaymentAuthCode.amount);
                    u11.append("; phone=");
                    u11.append(str11);
                    u11.append(", phone_code_hash=");
                    u11.append(str10);
                    org.telegram.messenger.a8.b(u11.toString());
                    TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore = new TLRPC.TL_payments_canPurchaseStore();
                    tL_payments_canPurchaseStore.purpose = tL_inputStorePaymentAuthCode;
                    i10 = ((org.telegram.ui.ActionBar.g2) de0Var).currentAccount;
                    ConnectionsManager.getInstance(i10).sendRequest(tL_payments_canPurchaseStore, new org.telegram.ui.t8(ld0Var, a10, i23, mVar, tL_inputStorePaymentAuthCode, str9, tL_payments_canPurchaseStore, 3), 10);
                    break;
                } else {
                    ld0Var.e = "PRODUCT_NOT_FOUND";
                    new lc(de0Var.a0, null).H(R.raw.error, hd.a0(null, null, 2131743633, "PRODUCT_NOT_FOUND"));
                    break;
                }
                break;
            case 16:
                ProfileActivity profileActivity = (ProfileActivity) obj6;
                View view = (View) obj4;
                String str12 = (String) obj5;
                boolean[] zArr2 = (boolean[]) obj3;
                String[] strArr2 = (String[]) obj2;
                String str13 = (String) obj;
                RectF rectF = ProfileActivity.Z6;
                if (profileActivity.getParentActivity() != null) {
                    org.telegram.ui.Components.a70 I = org.telegram.ui.Components.a70.I(profileActivity, view);
                    I.X(profileActivity.a.U0(view, false));
                    I.w = false;
                    I.c(R.drawable.msg_copy, hd.N0(2131751755, null), new f21(profileActivity, str12, i15, i14), false);
                    I.l(R.drawable.msg_translate, hd.N0(2131743711, null), new kg0((Object) profileActivity, (Object) strArr2, (Object) str13, (Object) str12, 14), zArr2[0]);
                    I.a0();
                    break;
                }
                break;
            case 17:
                org.telegram.ui.Wallet.l2 l2Var = (org.telegram.ui.Wallet.l2) obj6;
                org.telegram.ui.Wallet.h2 h2Var = (org.telegram.ui.Wallet.h2) obj4;
                String str14 = (String) obj5;
                org.telegram.ui.Wallet.r0 r0Var = (org.telegram.ui.Wallet.r0) obj2;
                y10 y10Var = (y10) obj;
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    String str15 = h2Var.d;
                    tonconnectsession = h2Var.a;
                    JSONObject put2 = jSONObject2.put("id", str15);
                    if (i15 < 0) {
                        put2.put("result", obj3);
                    } else {
                        if (str14 == null) {
                            str14 = "Could not complete request";
                        }
                        put2.put("error", new JSONObject().put("code", i15).put("message", str14));
                    }
                    JSONObject put3 = new JSONObject().put("body", WalletEngine2.tonConnectCrypto(r0Var, tonconnectsession, h2Var.h, h2Var.g, new JSONObject().put("encrypt", put2)).getString("body")).put("traceId", h2Var.i);
                    if (i15 < 0 && "disconnect".equals(h2Var.e)) {
                        z10 = true;
                    }
                    put = put3.put("disconnect", z10);
                } catch (Exception e13) {
                    i11 = org.telegram.ui.Wallet.l2.i("encrypt response", e13);
                    jSONObject = null;
                }
                if (!np.u1(l2Var.a).h7.edit().putString(org.telegram.ui.Wallet.l2.l(tonconnectsession.id, h2Var.b), put.toString()).commit()) {
                    throw new IllegalStateException("Could not save TON Connect response");
                }
                jSONObject = put;
                i11 = null;
                org.telegram.messenger.g0.g3(new wt0(l2Var, jSONObject, y10Var, i11, h2Var, 8));
                break;
                break;
            case 18:
                boolean[] zArr3 = (boolean[]) obj6;
                Context context4 = (Context) obj3;
                TLRPC.User user3 = (TLRPC.User) obj5;
                JSONObject jSONObject3 = (JSONObject) obj4;
                org.telegram.ui.ActionBar.h6 h6Var2 = (org.telegram.ui.ActionBar.h6) obj2;
                org.telegram.ui.Wallet.w2 w2Var = (org.telegram.ui.Wallet.w2) obj;
                if (!zArr3[0]) {
                    zArr3[0] = true;
                    int i24 = this.b;
                    org.telegram.ui.Wallet.u0 D = org.telegram.ui.Wallet.u0.D(i24);
                    String y10 = D.y();
                    byte[] E = D.E();
                    if (y10 == null || E == null || D.b == null) {
                        lc.c0(hd.N0(2131742693, null));
                        w2Var.a();
                        break;
                    } else {
                        int currentTime = ConnectionsManager.getInstance(i24).getCurrentTime();
                        try {
                            if ("signData".equals(jSONObject3.optString("method"))) {
                                JSONObject jSONObject4 = jSONObject3.getJSONObject("payload");
                                org.telegram.ui.Wallet.l2.G(y10, jSONObject4);
                                org.telegram.ui.Wallet.z2.c(context4, i24, user3, jSONObject4, y10, (byte[]) E.clone(), h6Var2, w2Var);
                            } else {
                                JSONObject jSONObject5 = jSONObject3.getJSONObject("transaction");
                                org.telegram.ui.Wallet.l2.I(jSONObject5, y10, currentTime);
                                org.telegram.ui.Wallet.z2.d(context4, i24, user3, new org.telegram.ui.Wallet.k2(jSONObject5), y10, (byte[]) E.clone(), h6Var2, w2Var);
                            }
                            break;
                        } catch (Exception e14) {
                            lc.c0(org.telegram.ui.Wallet.l2.i("widget call", e14));
                            w2Var.a();
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
                fi.f7 f7Var = (fi.f7) obj;
                try {
                    JSONObject jSONObject6 = new JSONObject();
                    jSONObject6.put("req_id", str16);
                    if (tLObject10 instanceof TLRPC.TL_dataJSON) {
                        jSONObject6.put("result", new JSONTokener(((TLRPC.TL_dataJSON) tLObject10).data).nextValue());
                    } else if (tL_error6 != null) {
                        jSONObject6.put("error", tL_error6.text);
                    }
                    org.telegram.ui.web.v0.w(i15, s0Var, f7Var, "custom_method_invoked", jSONObject6);
                    break;
                } catch (Exception e15) {
                    org.telegram.messenger.a8.g(e15, true);
                    v0Var.Z(null);
                }
        }
    }

    public /* synthetic */ f5(int i7, ArrayList arrayList, ArrayList arrayList2, Integer num, ve veVar, ve veVar2, ve veVar3) {
        this.a = 2;
        this.b = i7;
        this.c = arrayList;
        this.d = arrayList2;
        this.e = num;
        this.f = veVar;
        this.h = veVar2;
        this.n = veVar3;
    }

    public /* synthetic */ f5(Object obj, int i7, Serializable serializable, Object obj2, Object obj3, Object obj4, Object obj5, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = i7;
        this.d = serializable;
        this.e = obj2;
        this.f = obj3;
        this.h = obj4;
        this.n = obj5;
    }

    public /* synthetic */ f5(Object obj, Object obj2, Object obj3, int i7, Object obj4, Object obj5, Object obj6, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = i7;
        this.f = obj4;
        this.h = obj5;
        this.n = obj6;
    }

    public /* synthetic */ f5(gs gsVar, TLObject tLObject, Object obj, TLObject tLObject2, Object obj2, int i7, String str, int i10) {
        this.a = i10;
        this.c = gsVar;
        this.e = tLObject;
        this.f = obj;
        this.h = tLObject2;
        this.n = obj2;
        this.b = i7;
        this.d = str;
    }

    public /* synthetic */ f5(TLObject tLObject, org.telegram.ui.ActionBar.t1 t1Var, Context context, int i7, TL_phone.exportGroupCallInvite exportgroupcallinvite, org.telegram.ui.ActionBar.h6 h6Var, p40 p40Var) {
        this.a = 6;
        this.c = tLObject;
        this.d = t1Var;
        this.f = context;
        this.b = i7;
        this.e = exportgroupcallinvite;
        this.h = h6Var;
        this.n = p40Var;
    }

    public /* synthetic */ f5(org.telegram.ui.ActionBar.t1 t1Var, TLObject tLObject, int i7, TLRPC.Document document, TLRPC.TL_error tL_error, Object obj, TLRPC.TL_stickers_addStickerToSet tL_stickers_addStickerToSet) {
        this.a = 9;
        this.c = t1Var;
        this.d = tLObject;
        this.b = i7;
        this.e = document;
        this.f = tL_error;
        this.h = obj;
        this.n = tL_stickers_addStickerToSet;
    }

    public /* synthetic */ f5(org.telegram.ui.g4 g4Var, int i7, vf.b bVar, TLObject tLObject, String str, org.telegram.ui.e0 e0Var, TLRPC.TL_messages_getWebPage tL_messages_getWebPage) {
        this.a = 4;
        this.c = g4Var;
        this.b = i7;
        this.e = bVar;
        this.f = tLObject;
        this.d = str;
        this.h = e0Var;
        this.n = tL_messages_getWebPage;
    }

    public /* synthetic */ f5(rf rfVar, ji.p pVar, org.telegram.ui.Cells.c5 c5Var, ArrayList arrayList, ArrayList arrayList2, int i7, ji.f fVar) {
        this.a = 8;
        this.c = rfVar;
        this.d = pVar;
        this.e = c5Var;
        this.f = arrayList;
        this.h = arrayList2;
        this.b = i7;
        this.n = fVar;
    }

    public /* synthetic */ f5(LaunchActivity launchActivity, TLObject tLObject, int i7, cx cxVar, org.telegram.ui.ActionBar.g2 g2Var, TLRPC.User user, String str) {
        this.a = 13;
        this.c = launchActivity;
        this.e = tLObject;
        this.b = i7;
        this.f = cxVar;
        this.n = g2Var;
        this.h = user;
        this.d = str;
    }

    public /* synthetic */ f5(LaunchActivity launchActivity, TLRPC.TL_error tL_error, TLObject tLObject, int i7, org.telegram.ui.ActionBar.t1 t1Var, h60 h60Var, String str) {
        this.a = 11;
        this.c = launchActivity;
        this.e = tL_error;
        this.f = tLObject;
        this.b = i7;
        this.h = t1Var;
        this.n = h60Var;
        this.d = str;
    }

    public /* synthetic */ f5(ld0 ld0Var, String str, f5.f fVar, List list, String str2, String str3, int i7) {
        this.a = 15;
        this.c = ld0Var;
        this.d = str;
        this.e = fVar;
        this.f = list;
        this.h = str2;
        this.n = str3;
        this.b = i7;
    }

    public /* synthetic */ f5(ProfileActivity profileActivity, View view, String str, int i7, boolean[] zArr, String[] strArr, String str2) {
        this.a = 16;
        this.c = profileActivity;
        this.e = view;
        this.d = str;
        this.b = i7;
        this.f = zArr;
        this.h = strArr;
        this.n = str2;
    }

    public /* synthetic */ f5(org.telegram.ui.Wallet.l2 l2Var, org.telegram.ui.Wallet.h2 h2Var, int i7, Object obj, String str, org.telegram.ui.Wallet.r0 r0Var, y10 y10Var) {
        this.a = 17;
        this.c = l2Var;
        this.e = h2Var;
        this.b = i7;
        this.f = obj;
        this.d = str;
        this.h = r0Var;
        this.n = y10Var;
    }

    public /* synthetic */ f5(org.telegram.ui.web.v0 v0Var, String str, TLObject tLObject, TLRPC.TL_error tL_error, int i7, org.telegram.ui.web.s0 s0Var, fi.f7 f7Var) {
        this.a = 19;
        this.c = v0Var;
        this.d = str;
        this.e = tLObject;
        this.f = tL_error;
        this.b = i7;
        this.h = s0Var;
        this.n = f7Var;
    }

    public /* synthetic */ f5(boolean[] zArr, Context context, int i7, TLRPC.User user, JSONObject jSONObject, org.telegram.ui.ActionBar.h6 h6Var, org.telegram.ui.Wallet.w2 w2Var) {
        this.a = 18;
        this.c = zArr;
        this.f = context;
        this.b = i7;
        this.d = user;
        this.e = jSONObject;
        this.h = h6Var;
        this.n = w2Var;
    }
}
