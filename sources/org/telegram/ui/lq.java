package org.telegram.ui;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.graphics.RectF;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Date;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_fragment;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.ClippingImageView;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class lq implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ lq(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i3) {
        this.a = i3;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
    }

    private final void a() {
        ProfileActivity profileActivity = (ProfileActivity) this.b;
        TLObject tLObject = (TLObject) this.c;
        TLRPC.TL_username tL_username = (TLRPC.TL_username) this.d;
        bv0 bv0Var = (bv0) this.e;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f;
        if (!(tLObject instanceof TL_fragment.TL_collectibleInfo)) {
            RectF rectF = ProfileActivity.T6;
            org.telegram.ui.Components.fc.d0(tL_error);
            return;
        }
        TL_fragment.TL_collectibleInfo tL_collectibleInfo = (TL_fragment.TL_collectibleInfo) tLObject;
        if (profileActivity.e1 != 0) {
            profileActivity.getMessagesController().a2(Long.valueOf(profileActivity.e1));
        } else {
            profileActivity.getMessagesController().M0(Long.valueOf(profileActivity.f1));
        }
        String str = "@" + tL_username.username;
        String format = org.telegram.messenger.bd.E0().o0().format(new Date(tL_collectibleInfo.purchase_date * 1000));
        String f10 = org.telegram.messenger.r1.i().f(tL_collectibleInfo.crypto_amount, tL_collectibleInfo.crypto_currency);
        String f11 = org.telegram.messenger.r1.i().f(tL_collectibleInfo.amount, tL_collectibleInfo.currency);
        org.telegram.ui.Components.ac w10 = new org.telegram.ui.Components.fc(bv0Var.u1, profileActivity.A0).w(R.drawable.filled_username, org.telegram.messenger.g0.d4(org.telegram.messenger.g0.X2(org.telegram.messenger.bd.a0(null, null, 2131750527, str, format, f10, TextUtils.isEmpty(f11) ? "" : a1.g.q("(", f11, ")"))), new hk0(23, profileActivity, tL_collectibleInfo)));
        hb0 hb0Var = new hb0(11, profileActivity, tL_collectibleInfo);
        org.telegram.ui.Components.fb fbVar = w10.e;
        if (fbVar != null) {
            fbVar.setOnClickListener(hb0Var);
        }
        w10.k(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        String str;
        TLRPC.GroupCall groupCall;
        TLRPC.TL_wallPaper tL_wallPaper;
        dl0 dl0Var;
        org.telegram.ui.Components.fc d;
        int i3;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        kq0 kq0Var;
        String str2;
        org.telegram.ui.ActionBar.e6 e6Var;
        int i16 = this.a;
        final int i17 = 1;
        final int i18 = 0;
        Object obj = this.f;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.c;
        Object obj5 = this.b;
        switch (i16) {
            case 0:
                mq mqVar = (mq) obj5;
                ArrayList arrayList = (ArrayList) obj4;
                a0.h hVar = (a0.h) obj;
                ArrayList arrayList2 = (ArrayList) obj3;
                ArrayList arrayList3 = (ArrayList) obj2;
                kg.v1 v1Var = mqVar.h;
                nq nqVar = mqVar.E;
                if (nqVar.o1) {
                    mqVar.s = false;
                    mqVar.d = arrayList;
                    mqVar.e = hVar;
                    mqVar.f = arrayList2;
                    v1Var.f(arrayList, null);
                    if (!org.telegram.messenger.t3.T(nqVar.n)) {
                        ArrayList arrayList4 = v1Var.g;
                        arrayList4.clear();
                        arrayList4.addAll(arrayList3);
                    }
                    int i19 = mqVar.r;
                    mqVar.f();
                    if (mqVar.r > i19) {
                        nqVar.D0(i19);
                    }
                    if (!v1Var.e() && mqVar.r == 0) {
                        nqVar.b.e(false, true);
                        break;
                    }
                }
                break;
            case 1:
                View view = (View) obj5;
                View view2 = (View) obj4;
                WindowManager windowManager = (WindowManager) obj3;
                view.setVisibility(8);
                view2.setVisibility(8);
                windowManager.removeView(view);
                windowManager.removeView(view2);
                windowManager.removeView((View) obj2);
                windowManager.removeView((View) obj);
                break;
            case 2:
                org.telegram.ui.Components.xv0 xv0Var = (org.telegram.ui.Components.xv0) obj5;
                String str3 = (String) obj4;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj3;
                TLObject tLObject = (TLObject) obj2;
                TextView textView = (TextView) obj;
                xv0Var.h2 = 0;
                String str4 = xv0Var.g2;
                if (str4 != null && str4.equals(str3)) {
                    if (tL_error != null || !(tLObject instanceof TLRPC.TL_boolTrue)) {
                        textView.setText(org.telegram.messenger.bd.M0(2131749238, null));
                        org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.p7, xv0Var.J0);
                        xv0Var.i2 = false;
                        break;
                    } else {
                        textView.setText(org.telegram.messenger.bd.M0(2131749243, null));
                        org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.w6, xv0Var.J0);
                        xv0Var.i2 = true;
                        break;
                    }
                }
                break;
            case 3:
                org.telegram.ui.Components.iw0 iw0Var = (org.telegram.ui.Components.iw0) obj5;
                TLObject tLObject2 = (TLObject) obj4;
                TLRPC.UserFull userFull = (TLRPC.UserFull) obj3;
                TL_account.TL_birthday tL_birthday = (TL_account.TL_birthday) obj2;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj;
                org.telegram.ui.ActionBar.d2 T = LaunchActivity.T();
                if (T != null) {
                    if (tLObject2 instanceof TLRPC.TL_boolTrue) {
                        org.telegram.ui.Components.ac I = org.telegram.ui.Components.fc.a0(T).I(R.raw.gift, org.telegram.messenger.bd.M0(2131746864, null), org.telegram.messenger.bd.M0(2131746863, null));
                        I.j = 5000;
                        I.j();
                        break;
                    } else {
                        if (userFull != null) {
                            if (tL_birthday == null) {
                                userFull.flags2 &= -33;
                            } else {
                                userFull.flags2 |= 32;
                            }
                            userFull.birthday = tL_birthday;
                            org.telegram.messenger.qr.a0(iw0Var.a).j2(userFull, false);
                        }
                        if (tL_error2 != null && (str = tL_error2.text) != null && str.startsWith("FLOOD_WAIT_")) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(iw0Var.b.getContext());
                            alertDialog$Builder.a.S = org.telegram.messenger.bd.M0(2131746860, null);
                            alertDialog$Builder.a.U = org.telegram.messenger.bd.M0(2131746861, null);
                            k2.p1.B(null, 2131747839, alertDialog$Builder, null);
                            break;
                        } else {
                            org.telegram.messenger.k5.o(null, 2131743889, org.telegram.ui.Components.fc.a0(T), R.raw.error, 36);
                            break;
                        }
                    }
                }
                break;
            case 4:
                org.telegram.ui.Components.g11 g11Var = (org.telegram.ui.Components.g11) obj5;
                TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) obj3;
                org.telegram.ui.Components.f60 f60Var = (org.telegram.ui.Components.f60) obj2;
                org.telegram.ui.Components.f60 f60Var2 = (org.telegram.ui.Components.f60) obj;
                wm wmVar = g11Var.s;
                if (((org.telegram.messenger.hp) obj4).r2(g11Var.f, tL_forumTopic.id, null)) {
                    f60Var.u();
                    org.telegram.messenger.us.t(g11Var.e).G(g11Var.f, tL_forumTopic.id, false);
                    if (org.telegram.ui.Components.fc.a(wmVar)) {
                        org.telegram.ui.Components.fc.z(wmVar, 4, 0, g11Var.h).j();
                        break;
                    }
                } else {
                    f60Var.K(f60Var2);
                    break;
                }
                break;
            case 5:
                is isVar = (is) obj5;
                TLObject tLObject3 = (TLObject) obj2;
                ArrayList arrayList5 = (ArrayList) obj4;
                TLRPC.TL_messages_getMyStickers tL_messages_getMyStickers = (TLRPC.TL_messages_getMyStickers) obj;
                if (((TLRPC.TL_error) obj3) == null && (tLObject3 instanceof TLRPC.TL_messages_myStickers)) {
                    TLRPC.TL_messages_myStickers tL_messages_myStickers = (TLRPC.TL_messages_myStickers) tLObject3;
                    ArrayList<TLRPC.StickerSetCovered> arrayList6 = tL_messages_myStickers.sets;
                    int size = arrayList6.size();
                    while (i18 < size) {
                        TLRPC.StickerSetCovered stickerSetCovered = arrayList6.get(i18);
                        i18++;
                        TLRPC.StickerSetCovered stickerSetCovered2 = stickerSetCovered;
                        TLRPC.StickerSet stickerSet = stickerSetCovered2.set;
                        if (!stickerSet.emojis && !stickerSet.masks) {
                            TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                            tL_inputStickerSetID.id = stickerSetCovered2.set.id;
                            TLRPC.TL_messages_stickerSet m0 = org.telegram.messenger.li.b0(isVar.r).m0(tL_inputStickerSetID, true);
                            if (m0 == null || m0.documents.size() < 120) {
                                arrayList5.add(stickerSetCovered2);
                            }
                        }
                    }
                    if (tL_messages_myStickers.sets.size() == tL_messages_getMyStickers.limit) {
                        tL_messages_getMyStickers.offset_id = ((TLRPC.StickerSetCovered) k2.p1.h(1, tL_messages_myStickers.sets)).set.id;
                        ConnectionsManager.getInstance(isVar.r).sendRequest(tL_messages_getMyStickers, new y9(isVar, arrayList5, tL_messages_getMyStickers, 7));
                        break;
                    }
                }
                break;
            case 6:
                uw.J0((uw) obj5, (TLObject) obj4, (TLRPC.UserFull) obj3, (TL_account.TL_birthday) obj2, (TLRPC.TL_error) obj);
                break;
            case 7:
                x30 x30Var = (x30) obj5;
                TLObject tLObject4 = (TLObject) obj3;
                TL_phone.exportGroupCallInvite exportgroupcallinvite = (TL_phone.exportGroupCallInvite) obj2;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj;
                x30Var.getClass();
                ((org.telegram.ui.ActionBar.s1) obj4).dismiss();
                if (tLObject4 instanceof TL_phone.exportedGroupCallInvite) {
                    Context context = x30Var.getContext();
                    int i20 = x30Var.a;
                    TLRPC.InputGroupCall inputGroupCall = exportgroupcallinvite.call;
                    String str5 = ((TL_phone.exportedGroupCallInvite) tLObject4).link;
                    org.telegram.ui.ActionBar.e6 e6Var2 = x30Var.J0;
                    org.telegram.messenger.r3 r3Var = x30Var.S2;
                    h9.n0(context, i20, inputGroupCall, str5, e6Var2, false, (r3Var == null || (groupCall = r3Var.b) == null || !groupCall.creator) ? false : true);
                    break;
                } else if (tL_error3 != null) {
                    new org.telegram.ui.Components.fc(x30Var.F, new ei.k0()).f0(tL_error3, false);
                    break;
                }
                break;
            case 8:
                x30 x30Var2 = (x30) obj5;
                ArrayList arrayList7 = (ArrayList) obj4;
                ArrayList arrayList8 = (ArrayList) obj3;
                ArrayList arrayList9 = (ArrayList) obj2;
                String str6 = (String) obj;
                x30Var2.getClass();
                org.telegram.ui.ActionBar.d2 T2 = LaunchActivity.T();
                if (T2 != null) {
                    vg.i0 i0Var = new vg.i0(34, x30Var2.a, T2.getContext(), T2, new ei.k0());
                    i0Var.C1(null, arrayList7, arrayList8, arrayList9, str6);
                    i0Var.show();
                    break;
                }
                break;
            case 9:
                LaunchActivity launchActivity = (LaunchActivity) obj5;
                ly lyVar = (ly) obj4;
                TLObject tLObject5 = (TLObject) obj3;
                TLRPC.TL_wallPaper tL_wallPaper2 = (TLRPC.TL_wallPaper) obj2;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) obj;
                String str7 = LaunchActivity.E1;
                try {
                    lyVar.run();
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                }
                if (tLObject5 instanceof TLRPC.TL_wallPaper) {
                    TLRPC.TL_wallPaper tL_wallPaper3 = (TLRPC.TL_wallPaper) tLObject5;
                    if (tL_wallPaper3.pattern) {
                        String str8 = tL_wallPaper3.slug;
                        TLRPC.WallPaperSettings wallPaperSettings = tL_wallPaper2.settings;
                        kc1 kc1Var = new kc1(str8, wallPaperSettings.background_color, wallPaperSettings.second_background_color, wallPaperSettings.third_background_color, wallPaperSettings.fourth_background_color, org.telegram.messenger.g0.s1(wallPaperSettings.rotation, false), r2.intensity / 100.0f, tL_wallPaper2.settings.motion, null);
                        kc1Var.g = tL_wallPaper3;
                        tL_wallPaper3 = kc1Var;
                    }
                    l71 l71Var = new l71(tL_wallPaper3, null, true);
                    TLRPC.WallPaperSettings wallPaperSettings2 = tL_wallPaper2.settings;
                    boolean z10 = wallPaperSettings2.blur;
                    boolean z11 = wallPaperSettings2.motion;
                    float f10 = wallPaperSettings2.intensity;
                    l71Var.H1 = z10;
                    l71Var.G1 = z11;
                    l71Var.p1 = f10;
                    launchActivity.t0(l71Var);
                    break;
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    org.telegram.messenger.camera.q.q(null, 2131751106, sb2, "\n");
                    sb2.append(tL_error4.text);
                    launchActivity.F0(org.telegram.ui.Components.t4.M(launchActivity, null, sb2.toString()));
                    break;
                }
            case 10:
                LaunchActivity launchActivity2 = (LaunchActivity) obj5;
                uw uwVar = (uw) obj4;
                org.telegram.ui.ActionBar.d2 d2Var = (org.telegram.ui.ActionBar.d2) obj3;
                TLRPC.User user = (TLRPC.User) obj2;
                String str9 = (String) obj;
                ArrayList arrayList10 = launchActivity2.F0;
                if (uwVar != null) {
                    if (d2Var != null) {
                        d2Var.dismissCurrentDialog();
                    }
                    while (i18 < arrayList10.size()) {
                        if (((Dialog) arrayList10.get(i18)).isShowing()) {
                            ((Dialog) arrayList10.get(i18)).dismiss();
                        }
                        i18++;
                    }
                    arrayList10.clear();
                    launchActivity2.t0(uwVar);
                    break;
                } else if (d2Var instanceof wm) {
                    ((wm) d2Var).wa(user.id, str9, true);
                    break;
                }
                break;
            case 11:
                LaunchActivity launchActivity3 = (LaunchActivity) obj5;
                TLObject tLObject6 = (TLObject) obj4;
                TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = (TLRPC.TL_messages_requestUrlAuth) obj3;
                String str10 = (String) obj2;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) obj;
                org.telegram.ui.ActionBar.d2 T3 = LaunchActivity.T();
                if (tLObject6 != null) {
                    if (tLObject6 instanceof TLRPC.TL_urlAuthResultRequest) {
                        yh0.b(false, launchActivity3.P, tL_messages_requestUrlAuth, (TLRPC.TL_urlAuthResultRequest) tLObject6, null, null, null, false, null);
                        break;
                    } else if (tLObject6 instanceof TLRPC.TL_urlAuthResultAccepted) {
                        yh0.b(false, launchActivity3.P, tL_messages_requestUrlAuth, (TLRPC.TL_urlAuthResultAccepted) tLObject6, null, null, null, false, null);
                        break;
                    } else if (tLObject6 instanceof TLRPC.TL_urlAuthResultDefault) {
                        org.telegram.ui.Components.t4.p0(T3, str10, false, true);
                        break;
                    }
                } else if (tL_error5 != null) {
                    if ("URL_EXPIRED".equalsIgnoreCase(tL_error5.text)) {
                        yh0.a().I(R.raw.error, org.telegram.messenger.bd.M0(2131753128, null), org.telegram.messenger.bd.M0(2131753129, null)).j();
                        break;
                    } else {
                        yh0.a().f0(tL_error5, false);
                        break;
                    }
                }
                break;
            case 12:
                LaunchActivity launchActivity4 = (LaunchActivity) obj5;
                TLObject tLObject7 = (TLObject) obj4;
                org.telegram.ui.ActionBar.s1 s1Var = (org.telegram.ui.ActionBar.s1) obj3;
                ly lyVar2 = (ly) obj2;
                TLRPC.TL_error tL_error6 = (TLRPC.TL_error) obj;
                String str11 = LaunchActivity.E1;
                if (tLObject7 instanceof TLRPC.TL_theme) {
                    TLRPC.TL_theme tL_theme = (TLRPC.TL_theme) tLObject7;
                    TLRPC.ThemeSettings themeSettings = tL_theme.settings.size() > 0 ? tL_theme.settings.get(0) : null;
                    if (themeSettings != null) {
                        org.telegram.ui.ActionBar.j6 Q0 = org.telegram.ui.ActionBar.k6.Q0(org.telegram.ui.ActionBar.k6.r0(themeSettings));
                        if (Q0 != null) {
                            TLRPC.WallPaper wallPaper = themeSettings.wallpaper;
                            if (wallPaper instanceof TLRPC.TL_wallPaper) {
                                TLRPC.TL_wallPaper tL_wallPaper4 = (TLRPC.TL_wallPaper) wallPaper;
                                org.telegram.messenger.w7.G(launchActivity4.P);
                                if (!org.telegram.messenger.w7.K(tL_wallPaper4.document, null, true, true).exists()) {
                                    launchActivity4.X0 = s1Var;
                                    launchActivity4.W0 = true;
                                    launchActivity4.U0 = Q0;
                                    launchActivity4.V0 = tL_theme;
                                    launchActivity4.T0 = tL_wallPaper4;
                                    launchActivity4.S0 = org.telegram.messenger.w7.r(null, tL_wallPaper4.document);
                                    org.telegram.messenger.w7.G(launchActivity4.P).X(tL_wallPaper4.document, tL_wallPaper4, 1, 1);
                                    break;
                                } else {
                                    tL_wallPaper = tL_wallPaper4;
                                }
                            } else {
                                tL_wallPaper = null;
                            }
                            try {
                                lyVar2.run();
                            } catch (Exception e11) {
                                org.telegram.messenger.a8.g(e11, true);
                            }
                            launchActivity4.r0(tL_theme, tL_wallPaper, Q0);
                        }
                        i18 = 1;
                    } else {
                        TLRPC.Document document = tL_theme.document;
                        if (document != null) {
                            launchActivity4.W0 = false;
                            launchActivity4.V0 = tL_theme;
                            launchActivity4.R0 = org.telegram.messenger.w7.r(null, document);
                            launchActivity4.X0 = s1Var;
                            org.telegram.messenger.w7.G(launchActivity4.P).X(launchActivity4.V0.document, tL_theme, 1, 1);
                        }
                        i18 = 1;
                    }
                } else {
                    if (tL_error6 == null || !"THEME_FORMAT_INVALID".equals(tL_error6.text)) {
                        i18 = 2;
                    }
                    i18 = 1;
                }
                if (i18 != 0) {
                    try {
                        lyVar2.run();
                    } catch (Exception e12) {
                        org.telegram.messenger.a8.g(e12, true);
                    }
                    if (i18 == 1) {
                        launchActivity4.F0(org.telegram.ui.Components.t4.M(launchActivity4, org.telegram.messenger.bd.M0(2131744200, null), org.telegram.messenger.bd.M0(2131744183, null)));
                        break;
                    } else {
                        launchActivity4.F0(org.telegram.ui.Components.t4.M(launchActivity4, org.telegram.messenger.bd.M0(2131744200, null), org.telegram.messenger.bd.M0(2131744184, null)));
                        break;
                    }
                }
                break;
            case 13:
                m90 m90Var = (m90) obj5;
                TLRPC.TL_error tL_error7 = (TLRPC.TL_error) obj4;
                TLObject tLObject8 = (TLObject) obj3;
                TLRPC.TL_inputInvoiceSlug tL_inputInvoiceSlug = (TLRPC.TL_inputInvoiceSlug) obj2;
                String str12 = (String) obj;
                int i21 = m90Var.b;
                LaunchActivity launchActivity5 = m90Var.a;
                if (tL_error7 != null) {
                    if ("SUBSCRIPTION_ALREADY_ACTIVE".equalsIgnoreCase(tL_error7.text)) {
                        d = m90.d();
                        i3 = 2131747403;
                    } else {
                        d = m90.d();
                        i3 = 2131747404;
                    }
                    org.telegram.messenger.k5.p(null, i3, d, null);
                } else if (!launchActivity5.isFinishing()) {
                    if (tLObject8 instanceof TLRPC.TL_payments_paymentFormStars) {
                        ai.p6 p6Var = launchActivity5.a1;
                        launchActivity5.a1 = null;
                        ci.e9.y(i21, false).X(null, tL_inputInvoiceSlug, (TLRPC.TL_payments_paymentFormStars) tLObject8, new h90(m90Var, 1), new f70(p6Var, i17));
                        break;
                    } else {
                        if (tLObject8 instanceof TLRPC.PaymentForm) {
                            TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject8;
                            org.telegram.messenger.hp.s1(i21).Y3(paymentForm.users, false);
                            dl0Var = new dl0(paymentForm, null, str12, LaunchActivity.T());
                        } else {
                            dl0Var = tLObject8 instanceof TLRPC.PaymentReceipt ? new dl0((TLRPC.PaymentReceipt) tLObject8) : null;
                        }
                        if (dl0Var != null) {
                            ai.p6 p6Var2 = launchActivity5.a1;
                            if (p6Var2 != null) {
                                launchActivity5.a1 = null;
                                dl0Var.a1 = new se(10, p6Var2);
                            }
                            m90Var.u(dl0Var, false);
                        }
                    }
                }
                m90Var.c();
                break;
            case 14:
                xd0.b0((xd0) obj5, (TLRPC.TL_error) obj4, (String) obj3, (String) obj2, (String) obj);
                break;
            case 15:
                TLObject tLObject9 = (TLObject) obj4;
                Bundle bundle = (Bundle) obj3;
                TLRPC.TL_error tL_error8 = (TLRPC.TL_error) obj2;
                TLRPC.TL_auth_resendCode tL_auth_resendCode = (TLRPC.TL_auth_resendCode) obj;
                xd0 xd0Var = ((lb0) obj5).a0;
                if (tLObject9 instanceof TLRPC.TL_auth_sentCode) {
                    xd0Var.p1(bundle, (TLRPC.TL_auth_sentCode) tLObject9, true);
                    break;
                } else if (tL_error8 != null && tL_error8.text != null) {
                    i10 = ((org.telegram.ui.ActionBar.d2) xd0Var).currentAccount;
                    org.telegram.ui.Components.t4.e0(i10, tL_error8, xd0Var, tL_auth_resendCode, new Object[0]);
                    break;
                }
                break;
            case 16:
                qc0 qc0Var = (qc0) obj5;
                TLObject tLObject10 = (TLObject) obj4;
                Bundle bundle2 = (Bundle) obj3;
                TLRPC.TL_error tL_error9 = (TLRPC.TL_error) obj2;
                TL_account.sendVerifyEmailCode sendverifyemailcode = (TL_account.sendVerifyEmailCode) obj;
                xd0 xd0Var2 = qc0Var.F;
                xd0Var2.t1(false, true);
                qc0Var.r = false;
                if (tLObject10 instanceof TL_account.sentEmailCode) {
                    TL_account.sentEmailCode sentemailcode = (TL_account.sentEmailCode) tLObject10;
                    bundle2.putString("emailPattern", sentemailcode.email_pattern);
                    bundle2.putInt("length", sentemailcode.length);
                    xd0Var2.D1(13, true, bundle2, false);
                    break;
                } else {
                    String str13 = tL_error9.text;
                    if (str13 != null) {
                        if (str13.contains("EMAIL_INVALID")) {
                            qc0Var.n();
                            break;
                        } else if (tL_error9.text.contains("EMAIL_NOT_ALLOWED")) {
                            xd0Var2.u1(org.telegram.messenger.bd.M0(2131746081, null), org.telegram.messenger.bd.M0(2131751201, null));
                            break;
                        } else if (tL_error9.text.contains("PHONE_PASSWORD_FLOOD")) {
                            xd0Var2.u1(org.telegram.messenger.bd.M0(2131746081, null), org.telegram.messenger.bd.M0(2131750688, "FloodWait"));
                            break;
                        } else if (tL_error9.text.contains("PHONE_NUMBER_FLOOD")) {
                            xd0Var2.u1(org.telegram.messenger.bd.M0(2131746081, null), org.telegram.messenger.bd.M0(2131747294, "PhoneNumberFlood"));
                            break;
                        } else if (!tL_error9.text.contains("PHONE_CODE_EMPTY") && !tL_error9.text.contains("PHONE_CODE_INVALID")) {
                            if (tL_error9.text.contains("PHONE_CODE_EXPIRED")) {
                                xd0Var2.D1(0, true, null, true);
                                xd0Var2.u1(org.telegram.messenger.bd.M0(2131746081, null), org.telegram.messenger.bd.M0(2131752021, "CodeExpired"));
                                break;
                            } else if (tL_error9.text.startsWith("FLOOD_WAIT")) {
                                xd0Var2.u1(org.telegram.messenger.bd.M0(2131746081, null), org.telegram.messenger.bd.M0(2131750688, "FloodWait"));
                                break;
                            } else if (tL_error9.code != -1000) {
                                i11 = ((org.telegram.ui.ActionBar.d2) xd0Var2).currentAccount;
                                org.telegram.ui.Components.t4.e0(i11, tL_error9, xd0Var2, sendverifyemailcode, qc0Var.x);
                                break;
                            }
                        } else {
                            xd0Var2.u1(org.telegram.messenger.bd.M0(2131746081, null), org.telegram.messenger.bd.M0(2131749191, "InvalidCode"));
                            break;
                        }
                    }
                }
                break;
            case 17:
                TLObject tLObject11 = (TLObject) obj4;
                Bundle bundle3 = (Bundle) obj3;
                TLRPC.TL_error tL_error10 = (TLRPC.TL_error) obj2;
                TL_account.verifyEmail verifyemail = (TL_account.verifyEmail) obj;
                xd0 xd0Var3 = ((qc0) obj5).F;
                if (!(tLObject11 instanceof TL_account.TL_emailVerified) || xd0Var3.G != 3) {
                    if (tLObject11 instanceof TL_account.TL_emailVerifiedLogin) {
                        TL_account.TL_emailVerifiedLogin tL_emailVerifiedLogin = (TL_account.TL_emailVerifiedLogin) tLObject11;
                        bundle3.putString("email", tL_emailVerifiedLogin.email);
                        xd0Var3.p1(bundle3, tL_emailVerifiedLogin.sent_code, true);
                        break;
                    } else if (tL_error10 != null) {
                        if (tL_error10.text.contains("EMAIL_NOT_ALLOWED")) {
                            xd0Var3.u1(org.telegram.messenger.bd.M0(2131746081, null), org.telegram.messenger.bd.M0(2131751201, null));
                            break;
                        } else if (tL_error10.text.contains("EMAIL_TOKEN_INVALID")) {
                            xd0Var3.u1(org.telegram.messenger.bd.M0(2131746081, null), org.telegram.messenger.bd.M0(2131751198, null));
                            break;
                        } else if (tL_error10.code != -1000) {
                            i12 = ((org.telegram.ui.ActionBar.d2) xd0Var3).currentAccount;
                            org.telegram.ui.Components.t4.e0(i12, tL_error10, xd0Var3, verifyemail, new Object[0]);
                            break;
                        }
                    }
                } else {
                    xd0Var3.finishFragment();
                    xd0Var3.e0.run();
                    break;
                }
                break;
            case 18:
                final id0 id0Var = (id0) obj5;
                TLObject tLObject12 = (TLObject) obj4;
                TLRPC.TL_inputInvoicePremiumAuthCode tL_inputInvoicePremiumAuthCode = (TLRPC.TL_inputInvoicePremiumAuthCode) obj3;
                final TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode = (TLRPC.TL_inputStorePaymentAuthCode) obj2;
                TLRPC.TL_error tL_error11 = (TLRPC.TL_error) obj;
                xd0 xd0Var4 = id0Var.w;
                id0Var.b.setLoading(false);
                if (tLObject12 instanceof TLRPC.PaymentForm) {
                    final TLRPC.PaymentForm paymentForm2 = (TLRPC.PaymentForm) tLObject12;
                    xd0Var4.getMessagesController().Y3(paymentForm2.users, false);
                    dl0 dl0Var2 = new dl0(tL_inputInvoicePremiumAuthCode, paymentForm2, null, null, 4, null, null, null, null, null, null, false, null, xd0Var4, true);
                    dl0Var2.W0 = true;
                    dl0Var2.d1 = new org.telegram.messenger.u10() { // from class: org.telegram.ui.fd0
                        @Override // org.telegram.messenger.u10
                        public final void a(Object obj6) {
                            switch (i18) {
                                case 0:
                                    final int i22 = 0;
                                    final id0 id0Var2 = id0Var;
                                    final TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode2 = tL_inputStorePaymentAuthCode;
                                    final TLRPC.PaymentForm paymentForm3 = paymentForm2;
                                    org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.gd0
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i22) {
                                                case 0:
                                                    TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode3 = tL_inputStorePaymentAuthCode2;
                                                    String str14 = tL_inputStorePaymentAuthCode3.phone_number;
                                                    String str15 = tL_inputStorePaymentAuthCode3.phone_code_hash;
                                                    long j10 = paymentForm3.form_id;
                                                    id0 id0Var3 = id0Var2;
                                                    if (!id0Var3.f) {
                                                        id0Var3.f = true;
                                                        id0Var3.h = str14;
                                                        id0Var3.n = str15;
                                                        id0Var3.r = j10;
                                                        id0Var3.b.setLoading(true);
                                                        id0Var3.o();
                                                        break;
                                                    }
                                                    break;
                                                default:
                                                    TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode4 = tL_inputStorePaymentAuthCode2;
                                                    String str16 = tL_inputStorePaymentAuthCode4.phone_number;
                                                    String str17 = tL_inputStorePaymentAuthCode4.phone_code_hash;
                                                    long j11 = paymentForm3.form_id;
                                                    id0 id0Var4 = id0Var2;
                                                    if (!id0Var4.f) {
                                                        id0Var4.f = true;
                                                        id0Var4.h = str16;
                                                        id0Var4.n = str17;
                                                        id0Var4.r = j11;
                                                        id0Var4.b.setLoading(true);
                                                        id0Var4.o();
                                                        break;
                                                    }
                                                    break;
                                            }
                                        }
                                    });
                                    break;
                                default:
                                    final int i23 = 1;
                                    final id0 id0Var3 = id0Var;
                                    final TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode3 = tL_inputStorePaymentAuthCode;
                                    final TLRPC.PaymentForm paymentForm4 = paymentForm2;
                                    org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.gd0
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i23) {
                                                case 0:
                                                    TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode32 = tL_inputStorePaymentAuthCode3;
                                                    String str14 = tL_inputStorePaymentAuthCode32.phone_number;
                                                    String str15 = tL_inputStorePaymentAuthCode32.phone_code_hash;
                                                    long j10 = paymentForm4.form_id;
                                                    id0 id0Var32 = id0Var3;
                                                    if (!id0Var32.f) {
                                                        id0Var32.f = true;
                                                        id0Var32.h = str14;
                                                        id0Var32.n = str15;
                                                        id0Var32.r = j10;
                                                        id0Var32.b.setLoading(true);
                                                        id0Var32.o();
                                                        break;
                                                    }
                                                    break;
                                                default:
                                                    TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode4 = tL_inputStorePaymentAuthCode3;
                                                    String str16 = tL_inputStorePaymentAuthCode4.phone_number;
                                                    String str17 = tL_inputStorePaymentAuthCode4.phone_code_hash;
                                                    long j11 = paymentForm4.form_id;
                                                    id0 id0Var4 = id0Var3;
                                                    if (!id0Var4.f) {
                                                        id0Var4.f = true;
                                                        id0Var4.h = str16;
                                                        id0Var4.n = str17;
                                                        id0Var4.r = j11;
                                                        id0Var4.b.setLoading(true);
                                                        id0Var4.o();
                                                        break;
                                                    }
                                                    break;
                                            }
                                        }
                                    });
                                    break;
                            }
                        }
                    };
                    dl0Var2.e1 = new org.telegram.messenger.u10() { // from class: org.telegram.ui.fd0
                        @Override // org.telegram.messenger.u10
                        public final void a(Object obj6) {
                            switch (i17) {
                                case 0:
                                    final int i22 = 0;
                                    final id0 id0Var2 = id0Var;
                                    final TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode2 = tL_inputStorePaymentAuthCode;
                                    final TLRPC.PaymentForm paymentForm3 = paymentForm2;
                                    org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.gd0
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i22) {
                                                case 0:
                                                    TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode32 = tL_inputStorePaymentAuthCode2;
                                                    String str14 = tL_inputStorePaymentAuthCode32.phone_number;
                                                    String str15 = tL_inputStorePaymentAuthCode32.phone_code_hash;
                                                    long j10 = paymentForm3.form_id;
                                                    id0 id0Var32 = id0Var2;
                                                    if (!id0Var32.f) {
                                                        id0Var32.f = true;
                                                        id0Var32.h = str14;
                                                        id0Var32.n = str15;
                                                        id0Var32.r = j10;
                                                        id0Var32.b.setLoading(true);
                                                        id0Var32.o();
                                                        break;
                                                    }
                                                    break;
                                                default:
                                                    TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode4 = tL_inputStorePaymentAuthCode2;
                                                    String str16 = tL_inputStorePaymentAuthCode4.phone_number;
                                                    String str17 = tL_inputStorePaymentAuthCode4.phone_code_hash;
                                                    long j11 = paymentForm3.form_id;
                                                    id0 id0Var4 = id0Var2;
                                                    if (!id0Var4.f) {
                                                        id0Var4.f = true;
                                                        id0Var4.h = str16;
                                                        id0Var4.n = str17;
                                                        id0Var4.r = j11;
                                                        id0Var4.b.setLoading(true);
                                                        id0Var4.o();
                                                        break;
                                                    }
                                                    break;
                                            }
                                        }
                                    });
                                    break;
                                default:
                                    final int i23 = 1;
                                    final id0 id0Var3 = id0Var;
                                    final TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode3 = tL_inputStorePaymentAuthCode;
                                    final TLRPC.PaymentForm paymentForm4 = paymentForm2;
                                    org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.gd0
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i23) {
                                                case 0:
                                                    TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode32 = tL_inputStorePaymentAuthCode3;
                                                    String str14 = tL_inputStorePaymentAuthCode32.phone_number;
                                                    String str15 = tL_inputStorePaymentAuthCode32.phone_code_hash;
                                                    long j10 = paymentForm4.form_id;
                                                    id0 id0Var32 = id0Var3;
                                                    if (!id0Var32.f) {
                                                        id0Var32.f = true;
                                                        id0Var32.h = str14;
                                                        id0Var32.n = str15;
                                                        id0Var32.r = j10;
                                                        id0Var32.b.setLoading(true);
                                                        id0Var32.o();
                                                        break;
                                                    }
                                                    break;
                                                default:
                                                    TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode4 = tL_inputStorePaymentAuthCode3;
                                                    String str16 = tL_inputStorePaymentAuthCode4.phone_number;
                                                    String str17 = tL_inputStorePaymentAuthCode4.phone_code_hash;
                                                    long j11 = paymentForm4.form_id;
                                                    id0 id0Var4 = id0Var3;
                                                    if (!id0Var4.f) {
                                                        id0Var4.f = true;
                                                        id0Var4.h = str16;
                                                        id0Var4.n = str17;
                                                        id0Var4.r = j11;
                                                        id0Var4.b.setLoading(true);
                                                        id0Var4.o();
                                                        break;
                                                    }
                                                    break;
                                            }
                                        }
                                    });
                                    break;
                            }
                        }
                    };
                    dl0Var2.f1 = new h00(id0Var, i17);
                    xd0Var4.presentFragment(dl0Var2);
                    break;
                } else if (tL_error11 != null) {
                    if ("PHONE_CODE_EXPIRED".equalsIgnoreCase(tL_error11.text)) {
                        org.telegram.messenger.g0.h3(new ed0(id0Var, 2));
                        break;
                    } else {
                        String str14 = tL_error11.text;
                        id0Var.e = str14;
                        new org.telegram.ui.Components.fc(xd0Var4.a0, null).H(R.raw.error, org.telegram.messenger.bd.a0(null, null, 2131743888, str14));
                        break;
                    }
                } else {
                    new org.telegram.ui.Components.fc(xd0Var4.a0, null).H(R.raw.error, org.telegram.messenger.bd.M0(2131743889, null));
                    break;
                }
            case 19:
                dg0 dg0Var = (dg0) obj5;
                TLRPC.TL_error tL_error12 = (TLRPC.TL_error) obj4;
                ng.b bVar = (ng.b) obj3;
                String str15 = (String) obj2;
                TL_stats.TL_loadAsyncGraph tL_loadAsyncGraph = (TL_stats.TL_loadAsyncGraph) obj;
                dg0Var.E = true;
                if (tL_error12 != null || bVar == null) {
                    dg0Var.m0();
                    break;
                } else {
                    dg0Var.w.l(str15, bVar);
                    d41 d41Var = dg0Var.r;
                    d41Var.e = bVar;
                    d41Var.c = tL_loadAsyncGraph.x;
                    dg0Var.m0();
                    break;
                }
            case 20:
                vg0 vg0Var = (vg0) obj5;
                TLRPC.TL_contacts_importedContacts tL_contacts_importedContacts = (TLRPC.TL_contacts_importedContacts) obj4;
                TLRPC.TL_inputPhoneContact tL_inputPhoneContact = (TLRPC.TL_inputPhoneContact) obj3;
                TLRPC.TL_error tL_error13 = (TLRPC.TL_error) obj2;
                TLRPC.TL_contacts_importContacts tL_contacts_importContacts = (TLRPC.TL_contacts_importContacts) obj;
                org.telegram.ui.ActionBar.d2 d2Var2 = vg0Var.D1;
                vg0Var.y1 = false;
                if (tL_contacts_importedContacts == null) {
                    org.telegram.messenger.g0.Z3(vg0Var.O1, true, 0.5f, true, true);
                    org.telegram.messenger.g0.Z3(vg0Var.P1, false, 0.5f, true, true);
                    org.telegram.ui.Components.t4.e0(vg0Var.a, tL_error13, d2Var2, tL_contacts_importContacts, new Object[0]);
                    break;
                } else if (!tL_contacts_importedContacts.users.isEmpty()) {
                    org.telegram.messenger.hp.s1(vg0Var.a).Y3(tL_contacts_importedContacts.users, false);
                    org.telegram.messenger.hp.s1(vg0Var.a).z3(tL_contacts_importedContacts.users.get(0), null, d2Var2, 1);
                    vg0Var.dismiss();
                    break;
                } else if (d2Var2.getParentActivity() != null) {
                    org.telegram.messenger.g0.Z3(vg0Var.O1, true, 0.5f, true, true);
                    org.telegram.messenger.g0.Z3(vg0Var.P1, false, 0.5f, true, true);
                    org.telegram.ui.Components.t4.u(d2Var2, tL_inputPhoneContact.first_name, tL_inputPhoneContact.last_name, tL_inputPhoneContact.phone);
                    break;
                }
                break;
            case 21:
                TLRPC.TL_error tL_error14 = (TLRPC.TL_error) obj4;
                sg0 sg0Var = (sg0) obj3;
                m2.t tVar = (m2.t) obj2;
                TL_account.verifyEmail verifyemail2 = (TL_account.verifyEmail) obj;
                yj0 yj0Var = ((hj0) obj5).a;
                if (tL_error14 == null) {
                    ((dj0) yj0Var.C1).c(yj0Var.F, (String) yj0Var.t1.get("email"), null, null, null, null, null, null, null, null, sg0Var, tVar);
                    break;
                } else {
                    i13 = ((org.telegram.ui.ActionBar.d2) yj0Var).currentAccount;
                    org.telegram.ui.Components.t4.e0(i13, tL_error14, yj0Var, verifyemail2, new Object[0]);
                    tVar.f(null, null);
                    break;
                }
            case 22:
                uj0 uj0Var = (uj0) obj5;
                TLRPC.TL_error tL_error15 = (TLRPC.TL_error) obj4;
                Bundle bundle4 = (Bundle) obj3;
                TLObject tLObject13 = (TLObject) obj2;
                TLRPC.TL_auth_resendCode tL_auth_resendCode2 = (TLRPC.TL_auth_resendCode) obj;
                yj0 yj0Var2 = uj0Var.R;
                uj0Var.K = false;
                if (tL_error15 == null) {
                    yj0Var2.p1(bundle4, (TLRPC.TL_auth_sentCode) tLObject13, true);
                } else {
                    i14 = ((org.telegram.ui.ActionBar.d2) yj0Var2).currentAccount;
                    org.telegram.ui.ActionBar.s1 e02 = org.telegram.ui.Components.t4.e0(i14, tL_error15, yj0Var2, tL_auth_resendCode2, new Object[0]);
                    if (e02 != null && tL_error15.text.contains("PHONE_CODE_EXPIRED")) {
                        e02.p0 = new qj0(uj0Var, i18);
                    }
                }
                yj0Var2.B1();
                break;
            case 23:
                dl0.k0((dl0) obj5, (TLRPC.TL_error) obj4, (TLObject) obj3, (String) obj2, (TL_account.getPassword) obj);
                break;
            case 24:
                ClippingImageView[] clippingImageViewArr = (ClippingImageView[]) obj3;
                ArrayList arrayList11 = (ArrayList) obj4;
                Integer num = (Integer) obj2;
                kq0 kq0Var2 = (kq0) obj;
                PhotoViewer photoViewer = ((qp0) obj5).r;
                photoViewer.q4 = null;
                gq0 gq0Var = photoViewer.f0;
                if (gq0Var != null && photoViewer.h0 != null) {
                    gq0Var.setLayerType(0, null);
                    photoViewer.o4 = 0;
                    photoViewer.I1();
                    photoViewer.p4 = 0L;
                    photoViewer.H1 = null;
                    photoViewer.F1.a = false;
                    photoViewer.I1 = null;
                    photoViewer.G1.a = false;
                    photoViewer.G2();
                    photoViewer.C2();
                    photoViewer.f0.invalidate();
                    for (ClippingImageView clippingImageView : clippingImageViewArr) {
                        clippingImageView.setVisibility(8);
                    }
                    mq0 mq0Var = photoViewer.r4;
                    if (mq0Var != null) {
                        mq0Var.a.O0(true, true);
                    }
                    mq0 mq0Var2 = photoViewer.s4;
                    if (mq0Var2 != null && !mq0Var2.s) {
                        mq0Var2.a.O0(false, true);
                    }
                    if (arrayList11 != null && (i15 = photoViewer.d2) != 3 && i15 != 1 && ((kq0Var = photoViewer.d) == null || !kq0Var.P())) {
                        photoViewer.V1();
                    }
                    org.telegram.ui.Components.m51 m51Var = photoViewer.G2;
                    if (m51Var != null && m51Var.d0() && photoViewer.s1 && !photoViewer.h7.isEmpty()) {
                        PhotoViewer.a0(photoViewer, photoViewer.G2.S());
                        PhotoViewer.Z(photoViewer, true);
                    }
                    if (photoViewer.u4) {
                        PhotoViewer.b0(photoViewer, num.intValue());
                    }
                    if (kq0Var2 != null) {
                        kq0Var2.d();
                        break;
                    }
                }
                break;
            case 25:
                PrivacyControlActivity privacyControlActivity = (PrivacyControlActivity) obj5;
                boolean[] zArr = (boolean[]) obj3;
                TLRPC.GlobalPrivacySettings globalPrivacySettings = (TLRPC.GlobalPrivacySettings) obj2;
                TL_account.setGlobalPrivacySettings setglobalprivacysettings = (TL_account.setGlobalPrivacySettings) obj;
                if (((TLRPC.TL_error) obj4) != null) {
                    privacyControlActivity.M0();
                    break;
                } else {
                    zArr[1] = true;
                    if (globalPrivacySettings != null) {
                        TLRPC.GlobalPrivacySettings globalPrivacySettings2 = setglobalprivacysettings.settings;
                        globalPrivacySettings.new_noncontact_peers_require_premium = globalPrivacySettings2.new_noncontact_peers_require_premium;
                        int i22 = globalPrivacySettings2.flags;
                        globalPrivacySettings.flags = i22;
                        globalPrivacySettings.disallowed_stargifts = globalPrivacySettings2.disallowed_stargifts;
                        long j10 = globalPrivacySettings2.noncontact_peers_paid_stars;
                        if (j10 > 0) {
                            globalPrivacySettings.flags = i22 | 32;
                            globalPrivacySettings.noncontact_peers_paid_stars = j10;
                        } else {
                            globalPrivacySettings.flags = i22 & (-33);
                            globalPrivacySettings.noncontact_peers_paid_stars = 0L;
                        }
                    }
                    if (zArr[0]) {
                        privacyControlActivity.I0();
                    }
                    privacyControlActivity.getNotificationCenter().k(47, new Object[0]);
                    break;
                }
            case 26:
                TLRPC.UserFull userFull2 = (TLRPC.UserFull) obj3;
                TL_account.TL_birthday tL_birthday2 = (TL_account.TL_birthday) obj2;
                TLRPC.TL_error tL_error16 = (TLRPC.TL_error) obj;
                PrivacyControlActivity privacyControlActivity2 = ((at0) obj5).d;
                if (((TLObject) obj4) instanceof TLRPC.TL_boolTrue) {
                    org.telegram.ui.Components.ac Q = org.telegram.ui.Components.fc.a0(privacyControlActivity2).Q(R.raw.contact_check, 36, org.telegram.messenger.bd.M0(2131746864, null));
                    Q.j = 5000;
                    Q.j();
                    break;
                } else {
                    if (userFull2 != null) {
                        if (tL_birthday2 == null) {
                            userFull2.flags2 &= -33;
                        } else {
                            userFull2.flags2 |= 32;
                        }
                        userFull2.birthday = tL_birthday2;
                        privacyControlActivity2.getMessagesStorage().j2(userFull2, false);
                    }
                    if (tL_error16 != null && (str2 = tL_error16.text) != null && str2.startsWith("FLOOD_WAIT_")) {
                        if (privacyControlActivity2.getParentActivity() != null) {
                            Activity parentActivity = privacyControlActivity2.getParentActivity();
                            e6Var = ((org.telegram.ui.ActionBar.d2) privacyControlActivity2).resourceProvider;
                            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(0, parentActivity, e6Var);
                            String M0 = org.telegram.messenger.bd.M0(2131746860, null);
                            org.telegram.ui.ActionBar.s1 s1Var2 = alertDialog$Builder2.a;
                            s1Var2.S = M0;
                            s1Var2.U = org.telegram.messenger.bd.M0(2131746861, null);
                            alertDialog$Builder2.k(org.telegram.messenger.bd.M0(2131747839, null), null);
                            privacyControlActivity2.showDialog(s1Var2);
                            break;
                        }
                    } else {
                        org.telegram.messenger.k5.o(null, 2131743889, org.telegram.ui.Components.fc.a0(privacyControlActivity2), R.raw.error, 36);
                        break;
                    }
                }
                break;
            case 27:
                ProfileActivity profileActivity = (ProfileActivity) obj5;
                TLRPC.ChatParticipant chatParticipant = (TLRPC.ChatParticipant) obj3;
                TLRPC.User user2 = (TLRPC.User) obj2;
                kt0 kt0Var = (kt0) obj;
                RectF rectF = ProfileActivity.T6;
                if (!(((TLRPC.ChannelParticipant) obj4) instanceof TLRPC.TL_channelParticipantAdmin) && !(chatParticipant instanceof TLRPC.TL_chatParticipantAdmin)) {
                    kt0Var.a(1);
                    break;
                } else {
                    AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(0, profileActivity.getParentActivity(), profileActivity.A0);
                    String M02 = org.telegram.messenger.bd.M0(R.string.AppName, null);
                    org.telegram.ui.ActionBar.s1 s1Var3 = alertDialog$Builder3.a;
                    s1Var3.S = M02;
                    s1Var3.U = org.telegram.messenger.bd.a0(null, null, 2131754350, org.telegram.messenger.g5.m(0, user2.first_name, user2.last_name));
                    alertDialog$Builder3.k(org.telegram.messenger.bd.M0(2131747839, null), new ci0(kt0Var, 11));
                    alertDialog$Builder3.h(org.telegram.messenger.bd.M0(2131752589, null), null);
                    profileActivity.showDialog(s1Var3);
                    break;
                }
            case 28:
                a();
                break;
            default:
                ProfileActivity profileActivity2 = (ProfileActivity) obj5;
                TLObject tLObject14 = (TLObject) obj4;
                String str16 = (String) obj3;
                TLRPC.User user3 = (TLRPC.User) obj2;
                TLRPC.TL_error tL_error17 = (TLRPC.TL_error) obj;
                RectF rectF2 = ProfileActivity.T6;
                if (tLObject14 instanceof TL_fragment.TL_collectibleInfo) {
                    f00.a(profileActivity2.getParentActivity(), 1, str16, user3, (TL_fragment.TL_collectibleInfo) tLObject14, profileActivity2.A0);
                    break;
                } else {
                    org.telegram.ui.Components.fc.d0(tL_error17);
                    break;
                }
        }
    }

    public /* synthetic */ lq(mq mqVar, ArrayList arrayList, a0.h hVar, ArrayList arrayList2, ArrayList arrayList3) {
        this.a = 0;
        this.b = mqVar;
        this.c = arrayList;
        this.f = hVar;
        this.d = arrayList2;
        this.e = arrayList3;
    }

    public /* synthetic */ lq(is isVar, TLRPC.TL_error tL_error, TLObject tLObject, ArrayList arrayList, TLRPC.TL_messages_getMyStickers tL_messages_getMyStickers) {
        this.a = 5;
        this.b = isVar;
        this.d = tL_error;
        this.e = tLObject;
        this.c = arrayList;
        this.f = tL_messages_getMyStickers;
    }

    public /* synthetic */ lq(qp0 qp0Var, ClippingImageView[] clippingImageViewArr, ArrayList arrayList, Integer num, kq0 kq0Var) {
        this.a = 24;
        this.b = qp0Var;
        this.d = clippingImageViewArr;
        this.c = arrayList;
        this.e = num;
        this.f = kq0Var;
    }
}
