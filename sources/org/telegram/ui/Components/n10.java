package org.telegram.ui.Components;

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
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PrivacyControlActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.tc1;
import org.telegram.ui.x71;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class n10 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ n10(View view, View view2, WindowManager windowManager, View view3, View view4) {
        this.a = 0;
        this.b = view;
        this.c = view2;
        this.f = windowManager;
        this.d = view3;
        this.e = view4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        String str;
        TLRPC.GroupCall groupCall;
        int i7;
        TLRPC.TL_wallPaper tL_wallPaper;
        org.telegram.ui.kl0 kl0Var;
        gc d;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        org.telegram.ui.xq0 xq0Var;
        String str2;
        org.telegram.ui.ActionBar.h6 h6Var;
        int i17 = this.a;
        int i18 = 10;
        final int i19 = 1;
        final int i20 = 0;
        int i21 = 2;
        Object obj = this.f;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.c;
        Object obj5 = this.b;
        switch (i17) {
            case 0:
                View view = (View) obj5;
                View view2 = (View) obj4;
                WindowManager windowManager = (WindowManager) obj;
                view.setVisibility(8);
                view2.setVisibility(8);
                windowManager.removeView(view);
                windowManager.removeView(view2);
                windowManager.removeView((View) obj3);
                windowManager.removeView((View) obj2);
                break;
            case 1:
                yv0 yv0Var = (yv0) obj5;
                String str3 = (String) obj4;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj3;
                TLObject tLObject = (TLObject) obj2;
                TextView textView = (TextView) obj;
                yv0Var.j2 = 0;
                String str4 = yv0Var.i2;
                if (str4 != null && str4.equals(str3)) {
                    if (tL_error != null || !(tLObject instanceof TLRPC.TL_boolTrue)) {
                        textView.setText(org.telegram.messenger.id.M0(2131749230, null));
                        org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.p7, yv0Var.I0);
                        yv0Var.k2 = false;
                        break;
                    } else {
                        textView.setText(org.telegram.messenger.id.M0(2131749235, null));
                        org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.w6, yv0Var.I0);
                        yv0Var.k2 = true;
                        break;
                    }
                }
                break;
            case 2:
                jw0 jw0Var = (jw0) obj5;
                TLObject tLObject2 = (TLObject) obj4;
                TLRPC.UserFull userFull = (TLRPC.UserFull) obj3;
                TL_account.TL_birthday tL_birthday = (TL_account.TL_birthday) obj2;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj;
                org.telegram.ui.ActionBar.f2 T = LaunchActivity.T();
                if (T != null) {
                    if (tLObject2 instanceof TLRPC.TL_boolTrue) {
                        bc I = gc.a0(T).I(R.raw.gift, org.telegram.messenger.id.M0(2131746856, null), org.telegram.messenger.id.M0(2131746855, null));
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
                            org.telegram.messenger.yr.a0(jw0Var.a).j2(userFull, false);
                        }
                        if (tL_error2 != null && (str = tL_error2.text) != null && str.startsWith("FLOOD_WAIT_")) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(jw0Var.b.getContext());
                            alertDialog$Builder.a.R = org.telegram.messenger.id.M0(2131746852, null);
                            alertDialog$Builder.a.T = org.telegram.messenger.id.M0(2131746853, null);
                            jg.g.C(null, 2131747831, alertDialog$Builder, null);
                            break;
                        } else {
                            org.telegram.messenger.k5.o(null, 2131743879, gc.a0(T), R.raw.error, 36);
                            break;
                        }
                    }
                }
                break;
            case 3:
                m11 m11Var = (m11) obj5;
                TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) obj3;
                k60 k60Var = (k60) obj2;
                k60 k60Var2 = (k60) obj;
                org.telegram.ui.cn cnVar = m11Var.s;
                if (((org.telegram.messenger.qp) obj4).r2(m11Var.f, tL_forumTopic.id, null)) {
                    k60Var.u();
                    org.telegram.messenger.dt.t(m11Var.e).G(m11Var.f, tL_forumTopic.id, false);
                    if (gc.a(cnVar)) {
                        gc.z(cnVar, 4, 0, m11Var.h).j();
                        break;
                    }
                } else {
                    k60Var.K(k60Var2);
                    break;
                }
                break;
            case 4:
                org.telegram.ui.ns nsVar = (org.telegram.ui.ns) obj5;
                TLObject tLObject3 = (TLObject) obj3;
                ArrayList arrayList = (ArrayList) obj2;
                TLRPC.TL_messages_getMyStickers tL_messages_getMyStickers = (TLRPC.TL_messages_getMyStickers) obj;
                if (((TLRPC.TL_error) obj4) == null && (tLObject3 instanceof TLRPC.TL_messages_myStickers)) {
                    TLRPC.TL_messages_myStickers tL_messages_myStickers = (TLRPC.TL_messages_myStickers) tLObject3;
                    ArrayList<TLRPC.StickerSetCovered> arrayList2 = tL_messages_myStickers.sets;
                    int size = arrayList2.size();
                    while (i20 < size) {
                        TLRPC.StickerSetCovered stickerSetCovered = arrayList2.get(i20);
                        i20++;
                        TLRPC.StickerSetCovered stickerSetCovered2 = stickerSetCovered;
                        TLRPC.StickerSet stickerSet = stickerSetCovered2.set;
                        if (!stickerSet.emojis && !stickerSet.masks) {
                            TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                            tL_inputStickerSetID.id = stickerSetCovered2.set.id;
                            TLRPC.TL_messages_stickerSet m0 = org.telegram.messenger.ui.b0(nsVar.r).m0(tL_inputStickerSetID, true);
                            if (m0 == null || m0.documents.size() < 120) {
                                arrayList.add(stickerSetCovered2);
                            }
                        }
                    }
                    if (tL_messages_myStickers.sets.size() == tL_messages_getMyStickers.limit) {
                        tL_messages_getMyStickers.offset_id = ((TLRPC.StickerSetCovered) jg.g.i(1, tL_messages_myStickers.sets)).set.id;
                        ConnectionsManager.getInstance(nsVar.r).sendRequest(tL_messages_getMyStickers, new org.telegram.ui.z9(nsVar, arrayList, tL_messages_getMyStickers, 7));
                        break;
                    }
                }
                break;
            case 5:
                org.telegram.ui.zw.J0((org.telegram.ui.zw) obj5, (TLObject) obj4, (TLRPC.UserFull) obj3, (TL_account.TL_birthday) obj2, (TLRPC.TL_error) obj);
                break;
            case 6:
                org.telegram.ui.f40 f40Var = (org.telegram.ui.f40) obj5;
                TLObject tLObject4 = (TLObject) obj3;
                TL_phone.exportGroupCallInvite exportgroupcallinvite = (TL_phone.exportGroupCallInvite) obj2;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj;
                f40Var.getClass();
                ((org.telegram.ui.ActionBar.u1) obj4).dismiss();
                if (tLObject4 instanceof TL_phone.exportedGroupCallInvite) {
                    Context context = f40Var.getContext();
                    int i22 = f40Var.a;
                    TLRPC.InputGroupCall inputGroupCall = exportgroupcallinvite.call;
                    String str5 = ((TL_phone.exportedGroupCallInvite) tLObject4).link;
                    org.telegram.ui.ActionBar.h6 h6Var2 = f40Var.I0;
                    org.telegram.messenger.r3 r3Var = f40Var.U2;
                    org.telegram.ui.i9.n0(context, i22, inputGroupCall, str5, h6Var2, false, (r3Var == null || (groupCall = r3Var.b) == null || !groupCall.creator) ? false : true);
                    break;
                } else if (tL_error3 != null) {
                    new gc(f40Var.E, new di.i0()).f0(tL_error3, false);
                    break;
                }
                break;
            case 7:
                org.telegram.ui.f40 f40Var2 = (org.telegram.ui.f40) obj5;
                ArrayList arrayList3 = (ArrayList) obj4;
                ArrayList arrayList4 = (ArrayList) obj3;
                ArrayList arrayList5 = (ArrayList) obj2;
                String str6 = (String) obj;
                f40Var2.getClass();
                org.telegram.ui.ActionBar.f2 T2 = LaunchActivity.T();
                if (T2 != null) {
                    ug.i0 i0Var = new ug.i0(34, f40Var2.a, T2.getContext(), T2, new di.i0());
                    i0Var.C1(null, arrayList3, arrayList4, arrayList5, str6);
                    i0Var.show();
                    break;
                }
                break;
            case 8:
                LaunchActivity launchActivity = (LaunchActivity) obj5;
                org.telegram.ui.f10 f10Var = (org.telegram.ui.f10) obj4;
                TLObject tLObject5 = (TLObject) obj3;
                TLRPC.TL_wallPaper tL_wallPaper2 = (TLRPC.TL_wallPaper) obj2;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) obj;
                String str7 = LaunchActivity.B1;
                try {
                    f10Var.run();
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                }
                if (tLObject5 instanceof TLRPC.TL_wallPaper) {
                    TLRPC.TL_wallPaper tL_wallPaper3 = (TLRPC.TL_wallPaper) tLObject5;
                    if (tL_wallPaper3.pattern) {
                        String str8 = tL_wallPaper3.slug;
                        TLRPC.WallPaperSettings wallPaperSettings = tL_wallPaper2.settings;
                        tc1 tc1Var = new tc1(str8, wallPaperSettings.background_color, wallPaperSettings.second_background_color, wallPaperSettings.third_background_color, wallPaperSettings.fourth_background_color, org.telegram.messenger.g0.s1(wallPaperSettings.rotation, false), r2.intensity / 100.0f, tL_wallPaper2.settings.motion, null);
                        tc1Var.g = tL_wallPaper3;
                        tL_wallPaper3 = tc1Var;
                    }
                    x71 x71Var = new x71(tL_wallPaper3, null, true);
                    TLRPC.WallPaperSettings wallPaperSettings2 = tL_wallPaper2.settings;
                    boolean z9 = wallPaperSettings2.blur;
                    boolean z10 = wallPaperSettings2.motion;
                    float f10 = wallPaperSettings2.intensity;
                    x71Var.G1 = z9;
                    x71Var.F1 = z10;
                    x71Var.o1 = f10;
                    launchActivity.t0(x71Var);
                    break;
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    org.telegram.messenger.camera.q.q(null, 2131751105, sb2, "\n");
                    sb2.append(tL_error4.text);
                    launchActivity.F0(u4.K(launchActivity, null, sb2.toString()));
                    break;
                }
            case 9:
                LaunchActivity launchActivity2 = (LaunchActivity) obj5;
                org.telegram.ui.zw zwVar = (org.telegram.ui.zw) obj4;
                org.telegram.ui.ActionBar.f2 f2Var = (org.telegram.ui.ActionBar.f2) obj3;
                TLRPC.User user = (TLRPC.User) obj2;
                String str9 = (String) obj;
                ArrayList arrayList6 = launchActivity2.C0;
                if (zwVar != null) {
                    if (f2Var != null) {
                        f2Var.dismissCurrentDialog();
                    }
                    while (i20 < arrayList6.size()) {
                        if (((Dialog) arrayList6.get(i20)).isShowing()) {
                            ((Dialog) arrayList6.get(i20)).dismiss();
                        }
                        i20++;
                    }
                    arrayList6.clear();
                    launchActivity2.t0(zwVar);
                    break;
                } else if (f2Var instanceof org.telegram.ui.cn) {
                    ((org.telegram.ui.cn) f2Var).ya(user.id, str9, true);
                    break;
                }
                break;
            case 10:
                LaunchActivity launchActivity3 = (LaunchActivity) obj5;
                TLObject tLObject6 = (TLObject) obj4;
                TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = (TLRPC.TL_messages_requestUrlAuth) obj3;
                String str10 = (String) obj2;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) obj;
                org.telegram.ui.ActionBar.f2 T3 = LaunchActivity.T();
                if (tLObject6 != null) {
                    if (tLObject6 instanceof TLRPC.TL_urlAuthResultRequest) {
                        org.telegram.ui.ei0.b(false, launchActivity3.O, tL_messages_requestUrlAuth, (TLRPC.TL_urlAuthResultRequest) tLObject6, null, null, null, false, null);
                        break;
                    } else if (tLObject6 instanceof TLRPC.TL_urlAuthResultAccepted) {
                        org.telegram.ui.ei0.b(false, launchActivity3.O, tL_messages_requestUrlAuth, (TLRPC.TL_urlAuthResultAccepted) tLObject6, null, null, null, false, null);
                        break;
                    } else if (tLObject6 instanceof TLRPC.TL_urlAuthResultDefault) {
                        u4.n0(T3, str10, false, true);
                        break;
                    }
                } else if (tL_error5 != null) {
                    if ("URL_EXPIRED".equalsIgnoreCase(tL_error5.text)) {
                        org.telegram.ui.ei0.a().I(R.raw.error, org.telegram.messenger.id.M0(2131753128, null), org.telegram.messenger.id.M0(2131753129, null)).j();
                        break;
                    } else {
                        org.telegram.ui.ei0.a().f0(tL_error5, false);
                        break;
                    }
                }
                break;
            case 11:
                LaunchActivity launchActivity4 = (LaunchActivity) obj5;
                TLObject tLObject7 = (TLObject) obj4;
                org.telegram.ui.ActionBar.u1 u1Var = (org.telegram.ui.ActionBar.u1) obj3;
                org.telegram.ui.f10 f10Var2 = (org.telegram.ui.f10) obj2;
                TLRPC.TL_error tL_error6 = (TLRPC.TL_error) obj;
                String str11 = LaunchActivity.B1;
                if (tLObject7 instanceof TLRPC.TL_theme) {
                    TLRPC.TL_theme tL_theme = (TLRPC.TL_theme) tLObject7;
                    TLRPC.ThemeSettings themeSettings = tL_theme.settings.size() > 0 ? tL_theme.settings.get(0) : null;
                    if (themeSettings != null) {
                        org.telegram.ui.ActionBar.l6 Q0 = org.telegram.ui.ActionBar.m6.Q0(org.telegram.ui.ActionBar.m6.r0(themeSettings));
                        if (Q0 != null) {
                            TLRPC.WallPaper wallPaper = themeSettings.wallpaper;
                            if (wallPaper instanceof TLRPC.TL_wallPaper) {
                                TLRPC.TL_wallPaper tL_wallPaper4 = (TLRPC.TL_wallPaper) wallPaper;
                                org.telegram.messenger.w7.G(launchActivity4.O);
                                if (!org.telegram.messenger.w7.J(tL_wallPaper4.document, null, true, true).exists()) {
                                    launchActivity4.U0 = u1Var;
                                    launchActivity4.T0 = true;
                                    launchActivity4.R0 = Q0;
                                    launchActivity4.S0 = tL_theme;
                                    launchActivity4.Q0 = tL_wallPaper4;
                                    launchActivity4.P0 = org.telegram.messenger.w7.r(null, tL_wallPaper4.document);
                                    org.telegram.messenger.w7.G(launchActivity4.O).W(tL_wallPaper4.document, tL_wallPaper4, 1, 1);
                                    break;
                                } else {
                                    tL_wallPaper = tL_wallPaper4;
                                }
                            } else {
                                tL_wallPaper = null;
                            }
                            try {
                                f10Var2.run();
                            } catch (Exception e11) {
                                org.telegram.messenger.a8.g(e11, true);
                            }
                            launchActivity4.r0(tL_theme, tL_wallPaper, Q0);
                        } else {
                            i20 = 1;
                        }
                    } else {
                        TLRPC.Document document = tL_theme.document;
                        if (document != null) {
                            launchActivity4.T0 = false;
                            launchActivity4.S0 = tL_theme;
                            launchActivity4.O0 = org.telegram.messenger.w7.r(null, document);
                            launchActivity4.U0 = u1Var;
                            org.telegram.messenger.w7.G(launchActivity4.O).W(launchActivity4.S0.document, tL_theme, 1, 1);
                        }
                        i7 = 1;
                    }
                    i7 = i20;
                } else {
                    if (tL_error6 == null || !"THEME_FORMAT_INVALID".equals(tL_error6.text)) {
                        i7 = 2;
                    }
                    i7 = 1;
                }
                if (i7 != 0) {
                    try {
                        f10Var2.run();
                    } catch (Exception e12) {
                        org.telegram.messenger.a8.g(e12, true);
                    }
                    if (i7 == 1) {
                        launchActivity4.F0(u4.K(launchActivity4, org.telegram.messenger.id.M0(2131744190, null), org.telegram.messenger.id.M0(2131744173, null)));
                        break;
                    } else {
                        launchActivity4.F0(u4.K(launchActivity4, org.telegram.messenger.id.M0(2131744190, null), org.telegram.messenger.id.M0(2131744174, null)));
                        break;
                    }
                }
                break;
            case 12:
                org.telegram.ui.s90 s90Var = (org.telegram.ui.s90) obj5;
                TLRPC.TL_error tL_error7 = (TLRPC.TL_error) obj4;
                TLObject tLObject8 = (TLObject) obj3;
                TLRPC.TL_inputInvoiceSlug tL_inputInvoiceSlug = (TLRPC.TL_inputInvoiceSlug) obj2;
                String str12 = (String) obj;
                int i23 = s90Var.b;
                LaunchActivity launchActivity5 = s90Var.a;
                if (tL_error7 != null) {
                    if ("SUBSCRIPTION_ALREADY_ACTIVE".equalsIgnoreCase(tL_error7.text)) {
                        d = org.telegram.ui.s90.d();
                        i10 = 2131747395;
                    } else {
                        d = org.telegram.ui.s90.d();
                        i10 = 2131747396;
                    }
                    org.telegram.messenger.k5.p(null, i10, d, null);
                } else if (!launchActivity5.isFinishing()) {
                    if (tLObject8 instanceof TLRPC.TL_payments_paymentFormStars) {
                        zh.r3 r3Var2 = launchActivity5.X0;
                        launchActivity5.X0 = null;
                        bi.ea.y(i23, false).X(null, tL_inputInvoiceSlug, (TLRPC.TL_payments_paymentFormStars) tLObject8, new org.telegram.ui.n90(s90Var, 1), new org.telegram.ui.o70(r3Var2, i19));
                        break;
                    } else {
                        if (tLObject8 instanceof TLRPC.PaymentForm) {
                            TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject8;
                            org.telegram.messenger.qp.s1(i23).Y3(paymentForm.users, false);
                            kl0Var = new org.telegram.ui.kl0(paymentForm, null, str12, LaunchActivity.T());
                        } else {
                            kl0Var = tLObject8 instanceof TLRPC.PaymentReceipt ? new org.telegram.ui.kl0((TLRPC.PaymentReceipt) tLObject8) : null;
                        }
                        if (kl0Var != null) {
                            zh.r3 r3Var3 = launchActivity5.X0;
                            if (r3Var3 != null) {
                                launchActivity5.X0 = null;
                                kl0Var.Z0 = new org.telegram.ui.we(i18, r3Var3);
                            }
                            s90Var.u(kl0Var, false);
                        }
                    }
                }
                s90Var.c();
                break;
            case 13:
                org.telegram.ui.fe0.b0((org.telegram.ui.fe0) obj5, (TLRPC.TL_error) obj4, (String) obj3, (String) obj2, (String) obj);
                break;
            case 14:
                TLObject tLObject9 = (TLObject) obj4;
                Bundle bundle = (Bundle) obj3;
                TLRPC.TL_error tL_error8 = (TLRPC.TL_error) obj2;
                TLRPC.TL_auth_resendCode tL_auth_resendCode = (TLRPC.TL_auth_resendCode) obj;
                org.telegram.ui.fe0 fe0Var = ((org.telegram.ui.rb0) obj5).W;
                if (tLObject9 instanceof TLRPC.TL_auth_sentCode) {
                    fe0Var.y1(bundle, (TLRPC.TL_auth_sentCode) tLObject9, true);
                    break;
                } else if (tL_error8 != null && tL_error8.text != null) {
                    i11 = ((org.telegram.ui.ActionBar.f2) fe0Var).currentAccount;
                    u4.c0(i11, tL_error8, fe0Var, tL_auth_resendCode, new Object[0]);
                    break;
                }
                break;
            case 15:
                org.telegram.ui.wc0 wc0Var = (org.telegram.ui.wc0) obj5;
                TLObject tLObject10 = (TLObject) obj4;
                Bundle bundle2 = (Bundle) obj3;
                TLRPC.TL_error tL_error9 = (TLRPC.TL_error) obj2;
                TL_account.sendVerifyEmailCode sendverifyemailcode = (TL_account.sendVerifyEmailCode) obj;
                org.telegram.ui.fe0 fe0Var2 = wc0Var.E;
                fe0Var2.C1(false, true);
                wc0Var.r = false;
                if (tLObject10 instanceof TL_account.sentEmailCode) {
                    TL_account.sentEmailCode sentemailcode = (TL_account.sentEmailCode) tLObject10;
                    bundle2.putString("emailPattern", sentemailcode.email_pattern);
                    bundle2.putInt("length", sentemailcode.length);
                    fe0Var2.M1(13, true, bundle2, false);
                    break;
                } else {
                    String str13 = tL_error9.text;
                    if (str13 != null) {
                        if (str13.contains("EMAIL_INVALID")) {
                            wc0Var.n();
                            break;
                        } else if (tL_error9.text.contains("EMAIL_NOT_ALLOWED")) {
                            fe0Var2.D1(org.telegram.messenger.id.M0(2131746071, null), org.telegram.messenger.id.M0(2131751200, null));
                            break;
                        } else if (tL_error9.text.contains("PHONE_PASSWORD_FLOOD")) {
                            fe0Var2.D1(org.telegram.messenger.id.M0(2131746071, null), org.telegram.messenger.id.M0(2131750687, "FloodWait"));
                            break;
                        } else if (tL_error9.text.contains("PHONE_NUMBER_FLOOD")) {
                            fe0Var2.D1(org.telegram.messenger.id.M0(2131746071, null), org.telegram.messenger.id.M0(2131747286, "PhoneNumberFlood"));
                            break;
                        } else if (!tL_error9.text.contains("PHONE_CODE_EMPTY") && !tL_error9.text.contains("PHONE_CODE_INVALID")) {
                            if (tL_error9.text.contains("PHONE_CODE_EXPIRED")) {
                                fe0Var2.M1(0, true, null, true);
                                fe0Var2.D1(org.telegram.messenger.id.M0(2131746071, null), org.telegram.messenger.id.M0(2131752021, "CodeExpired"));
                                break;
                            } else if (tL_error9.text.startsWith("FLOOD_WAIT")) {
                                fe0Var2.D1(org.telegram.messenger.id.M0(2131746071, null), org.telegram.messenger.id.M0(2131750687, "FloodWait"));
                                break;
                            } else if (tL_error9.code != -1000) {
                                i12 = ((org.telegram.ui.ActionBar.f2) fe0Var2).currentAccount;
                                u4.c0(i12, tL_error9, fe0Var2, sendverifyemailcode, wc0Var.x);
                                break;
                            }
                        } else {
                            fe0Var2.D1(org.telegram.messenger.id.M0(2131746071, null), org.telegram.messenger.id.M0(2131749183, "InvalidCode"));
                            break;
                        }
                    }
                }
                break;
            case 16:
                TLObject tLObject11 = (TLObject) obj4;
                Bundle bundle3 = (Bundle) obj3;
                TLRPC.TL_error tL_error10 = (TLRPC.TL_error) obj2;
                TL_account.verifyEmail verifyemail = (TL_account.verifyEmail) obj;
                org.telegram.ui.fe0 fe0Var3 = ((org.telegram.ui.wc0) obj5).E;
                if (!(tLObject11 instanceof TL_account.TL_emailVerified) || fe0Var3.F != 3) {
                    if (tLObject11 instanceof TL_account.TL_emailVerifiedLogin) {
                        TL_account.TL_emailVerifiedLogin tL_emailVerifiedLogin = (TL_account.TL_emailVerifiedLogin) tLObject11;
                        bundle3.putString("email", tL_emailVerifiedLogin.email);
                        fe0Var3.y1(bundle3, tL_emailVerifiedLogin.sent_code, true);
                        break;
                    } else if (tL_error10 != null) {
                        if (tL_error10.text.contains("EMAIL_NOT_ALLOWED")) {
                            fe0Var3.D1(org.telegram.messenger.id.M0(2131746071, null), org.telegram.messenger.id.M0(2131751200, null));
                            break;
                        } else if (tL_error10.text.contains("EMAIL_TOKEN_INVALID")) {
                            fe0Var3.D1(org.telegram.messenger.id.M0(2131746071, null), org.telegram.messenger.id.M0(2131751197, null));
                            break;
                        } else if (tL_error10.code != -1000) {
                            i13 = ((org.telegram.ui.ActionBar.f2) fe0Var3).currentAccount;
                            u4.c0(i13, tL_error10, fe0Var3, verifyemail, new Object[0]);
                            break;
                        }
                    }
                } else {
                    fe0Var3.finishFragment();
                    fe0Var3.d0.run();
                    break;
                }
                break;
            case 17:
                final org.telegram.ui.od0 od0Var = (org.telegram.ui.od0) obj5;
                TLObject tLObject12 = (TLObject) obj4;
                TLRPC.TL_inputInvoicePremiumAuthCode tL_inputInvoicePremiumAuthCode = (TLRPC.TL_inputInvoicePremiumAuthCode) obj3;
                final TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode = (TLRPC.TL_inputStorePaymentAuthCode) obj2;
                TLRPC.TL_error tL_error11 = (TLRPC.TL_error) obj;
                org.telegram.ui.fe0 fe0Var4 = od0Var.w;
                od0Var.b.setLoading(false);
                if (tLObject12 instanceof TLRPC.PaymentForm) {
                    final TLRPC.PaymentForm paymentForm2 = (TLRPC.PaymentForm) tLObject12;
                    fe0Var4.getMessagesController().Y3(paymentForm2.users, false);
                    org.telegram.ui.kl0 kl0Var2 = new org.telegram.ui.kl0(tL_inputInvoicePremiumAuthCode, paymentForm2, null, null, 4, null, null, null, null, null, null, false, null, fe0Var4, true);
                    kl0Var2.V0 = true;
                    kl0Var2.c1 = new org.telegram.messenger.c20() { // from class: org.telegram.ui.ld0
                        @Override // org.telegram.messenger.c20
                        public final void a(Object obj6) {
                            switch (i20) {
                                case 0:
                                    final int i24 = 0;
                                    final od0 od0Var2 = od0Var;
                                    final TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode2 = tL_inputStorePaymentAuthCode;
                                    final TLRPC.PaymentForm paymentForm3 = paymentForm2;
                                    org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.md0
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i24) {
                                                case 0:
                                                    TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode3 = tL_inputStorePaymentAuthCode2;
                                                    String str14 = tL_inputStorePaymentAuthCode3.phone_number;
                                                    String str15 = tL_inputStorePaymentAuthCode3.phone_code_hash;
                                                    long j3 = paymentForm3.form_id;
                                                    od0 od0Var3 = od0Var2;
                                                    if (!od0Var3.f) {
                                                        od0Var3.f = true;
                                                        od0Var3.h = str14;
                                                        od0Var3.n = str15;
                                                        od0Var3.r = j3;
                                                        od0Var3.b.setLoading(true);
                                                        od0Var3.o();
                                                        break;
                                                    }
                                                    break;
                                                default:
                                                    TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode4 = tL_inputStorePaymentAuthCode2;
                                                    String str16 = tL_inputStorePaymentAuthCode4.phone_number;
                                                    String str17 = tL_inputStorePaymentAuthCode4.phone_code_hash;
                                                    long j10 = paymentForm3.form_id;
                                                    od0 od0Var4 = od0Var2;
                                                    if (!od0Var4.f) {
                                                        od0Var4.f = true;
                                                        od0Var4.h = str16;
                                                        od0Var4.n = str17;
                                                        od0Var4.r = j10;
                                                        od0Var4.b.setLoading(true);
                                                        od0Var4.o();
                                                        break;
                                                    }
                                                    break;
                                            }
                                        }
                                    });
                                    break;
                                default:
                                    final int i25 = 1;
                                    final od0 od0Var3 = od0Var;
                                    final TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode3 = tL_inputStorePaymentAuthCode;
                                    final TLRPC.PaymentForm paymentForm4 = paymentForm2;
                                    org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.md0
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i25) {
                                                case 0:
                                                    TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode32 = tL_inputStorePaymentAuthCode3;
                                                    String str14 = tL_inputStorePaymentAuthCode32.phone_number;
                                                    String str15 = tL_inputStorePaymentAuthCode32.phone_code_hash;
                                                    long j3 = paymentForm4.form_id;
                                                    od0 od0Var32 = od0Var3;
                                                    if (!od0Var32.f) {
                                                        od0Var32.f = true;
                                                        od0Var32.h = str14;
                                                        od0Var32.n = str15;
                                                        od0Var32.r = j3;
                                                        od0Var32.b.setLoading(true);
                                                        od0Var32.o();
                                                        break;
                                                    }
                                                    break;
                                                default:
                                                    TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode4 = tL_inputStorePaymentAuthCode3;
                                                    String str16 = tL_inputStorePaymentAuthCode4.phone_number;
                                                    String str17 = tL_inputStorePaymentAuthCode4.phone_code_hash;
                                                    long j10 = paymentForm4.form_id;
                                                    od0 od0Var4 = od0Var3;
                                                    if (!od0Var4.f) {
                                                        od0Var4.f = true;
                                                        od0Var4.h = str16;
                                                        od0Var4.n = str17;
                                                        od0Var4.r = j10;
                                                        od0Var4.b.setLoading(true);
                                                        od0Var4.o();
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
                    kl0Var2.d1 = new org.telegram.messenger.c20() { // from class: org.telegram.ui.ld0
                        @Override // org.telegram.messenger.c20
                        public final void a(Object obj6) {
                            switch (i19) {
                                case 0:
                                    final int i24 = 0;
                                    final od0 od0Var2 = od0Var;
                                    final TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode2 = tL_inputStorePaymentAuthCode;
                                    final TLRPC.PaymentForm paymentForm3 = paymentForm2;
                                    org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.md0
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i24) {
                                                case 0:
                                                    TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode32 = tL_inputStorePaymentAuthCode2;
                                                    String str14 = tL_inputStorePaymentAuthCode32.phone_number;
                                                    String str15 = tL_inputStorePaymentAuthCode32.phone_code_hash;
                                                    long j3 = paymentForm3.form_id;
                                                    od0 od0Var32 = od0Var2;
                                                    if (!od0Var32.f) {
                                                        od0Var32.f = true;
                                                        od0Var32.h = str14;
                                                        od0Var32.n = str15;
                                                        od0Var32.r = j3;
                                                        od0Var32.b.setLoading(true);
                                                        od0Var32.o();
                                                        break;
                                                    }
                                                    break;
                                                default:
                                                    TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode4 = tL_inputStorePaymentAuthCode2;
                                                    String str16 = tL_inputStorePaymentAuthCode4.phone_number;
                                                    String str17 = tL_inputStorePaymentAuthCode4.phone_code_hash;
                                                    long j10 = paymentForm3.form_id;
                                                    od0 od0Var4 = od0Var2;
                                                    if (!od0Var4.f) {
                                                        od0Var4.f = true;
                                                        od0Var4.h = str16;
                                                        od0Var4.n = str17;
                                                        od0Var4.r = j10;
                                                        od0Var4.b.setLoading(true);
                                                        od0Var4.o();
                                                        break;
                                                    }
                                                    break;
                                            }
                                        }
                                    });
                                    break;
                                default:
                                    final int i25 = 1;
                                    final od0 od0Var3 = od0Var;
                                    final TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode3 = tL_inputStorePaymentAuthCode;
                                    final TLRPC.PaymentForm paymentForm4 = paymentForm2;
                                    org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.md0
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i25) {
                                                case 0:
                                                    TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode32 = tL_inputStorePaymentAuthCode3;
                                                    String str14 = tL_inputStorePaymentAuthCode32.phone_number;
                                                    String str15 = tL_inputStorePaymentAuthCode32.phone_code_hash;
                                                    long j3 = paymentForm4.form_id;
                                                    od0 od0Var32 = od0Var3;
                                                    if (!od0Var32.f) {
                                                        od0Var32.f = true;
                                                        od0Var32.h = str14;
                                                        od0Var32.n = str15;
                                                        od0Var32.r = j3;
                                                        od0Var32.b.setLoading(true);
                                                        od0Var32.o();
                                                        break;
                                                    }
                                                    break;
                                                default:
                                                    TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode4 = tL_inputStorePaymentAuthCode3;
                                                    String str16 = tL_inputStorePaymentAuthCode4.phone_number;
                                                    String str17 = tL_inputStorePaymentAuthCode4.phone_code_hash;
                                                    long j10 = paymentForm4.form_id;
                                                    od0 od0Var4 = od0Var3;
                                                    if (!od0Var4.f) {
                                                        od0Var4.f = true;
                                                        od0Var4.h = str16;
                                                        od0Var4.n = str17;
                                                        od0Var4.r = j10;
                                                        od0Var4.b.setLoading(true);
                                                        od0Var4.o();
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
                    kl0Var2.e1 = new org.telegram.ui.m00(od0Var, i19);
                    fe0Var4.presentFragment(kl0Var2);
                    break;
                } else if (tL_error11 != null) {
                    if ("PHONE_CODE_EXPIRED".equalsIgnoreCase(tL_error11.text)) {
                        org.telegram.messenger.g0.h3(new org.telegram.ui.kd0(od0Var, i21));
                        break;
                    } else {
                        String str14 = tL_error11.text;
                        od0Var.e = str14;
                        new gc(fe0Var4.Z, null).H(R.raw.error, org.telegram.messenger.id.a0(null, null, 2131743878, str14));
                        break;
                    }
                } else {
                    new gc(fe0Var4.Z, null).H(R.raw.error, org.telegram.messenger.id.M0(2131743879, null));
                    break;
                }
            case 18:
                org.telegram.ui.mg0 mg0Var = (org.telegram.ui.mg0) obj5;
                TLRPC.TL_error tL_error12 = (TLRPC.TL_error) obj4;
                mg.b bVar = (mg.b) obj3;
                String str15 = (String) obj2;
                TL_stats.TL_loadAsyncGraph tL_loadAsyncGraph = (TL_stats.TL_loadAsyncGraph) obj;
                mg0Var.D = true;
                if (tL_error12 != null || bVar == null) {
                    mg0Var.m0();
                    break;
                } else {
                    mg0Var.w.l(str15, bVar);
                    org.telegram.ui.q41 q41Var = mg0Var.r;
                    q41Var.e = bVar;
                    q41Var.c = tL_loadAsyncGraph.x;
                    mg0Var.m0();
                    break;
                }
            case 19:
                org.telegram.ui.dh0 dh0Var = (org.telegram.ui.dh0) obj5;
                TLRPC.TL_contacts_importedContacts tL_contacts_importedContacts = (TLRPC.TL_contacts_importedContacts) obj4;
                TLRPC.TL_inputPhoneContact tL_inputPhoneContact = (TLRPC.TL_inputPhoneContact) obj3;
                TLRPC.TL_error tL_error13 = (TLRPC.TL_error) obj2;
                TLRPC.TL_contacts_importContacts tL_contacts_importContacts = (TLRPC.TL_contacts_importContacts) obj;
                org.telegram.ui.ActionBar.f2 f2Var2 = dh0Var.F1;
                dh0Var.A1 = false;
                if (tL_contacts_importedContacts == null) {
                    org.telegram.messenger.g0.Z3(dh0Var.Q1, true, 0.5f, true, true);
                    org.telegram.messenger.g0.Z3(dh0Var.R1, false, 0.5f, true, true);
                    u4.c0(dh0Var.a, tL_error13, f2Var2, tL_contacts_importContacts, new Object[0]);
                    break;
                } else if (!tL_contacts_importedContacts.users.isEmpty()) {
                    org.telegram.messenger.qp.s1(dh0Var.a).Y3(tL_contacts_importedContacts.users, false);
                    org.telegram.messenger.qp.s1(dh0Var.a).z3(tL_contacts_importedContacts.users.get(0), null, f2Var2, 1);
                    dh0Var.dismiss();
                    break;
                } else if (f2Var2.getParentActivity() != null) {
                    org.telegram.messenger.g0.Z3(dh0Var.Q1, true, 0.5f, true, true);
                    org.telegram.messenger.g0.Z3(dh0Var.R1, false, 0.5f, true, true);
                    u4.u(f2Var2, tL_inputPhoneContact.first_name, tL_inputPhoneContact.last_name, tL_inputPhoneContact.phone);
                    break;
                }
                break;
            case 20:
                TLRPC.TL_error tL_error14 = (TLRPC.TL_error) obj4;
                org.telegram.ui.hf0 hf0Var = (org.telegram.ui.hf0) obj3;
                m4.d0 d0Var = (m4.d0) obj2;
                TL_account.verifyEmail verifyemail2 = (TL_account.verifyEmail) obj;
                org.telegram.ui.ek0 ek0Var = ((org.telegram.ui.nj0) obj5).a;
                if (tL_error14 == null) {
                    ((org.telegram.ui.jj0) ek0Var.B1).c(ek0Var.E, (String) ek0Var.s1.get("email"), null, null, null, null, null, null, null, null, hf0Var, d0Var);
                    break;
                } else {
                    i14 = ((org.telegram.ui.ActionBar.f2) ek0Var).currentAccount;
                    u4.c0(i14, tL_error14, ek0Var, verifyemail2, new Object[0]);
                    d0Var.a(null, null);
                    break;
                }
            case 21:
                org.telegram.ui.ak0 ak0Var = (org.telegram.ui.ak0) obj5;
                TLRPC.TL_error tL_error15 = (TLRPC.TL_error) obj4;
                Bundle bundle4 = (Bundle) obj3;
                TLObject tLObject13 = (TLObject) obj2;
                TLRPC.TL_auth_resendCode tL_auth_resendCode2 = (TLRPC.TL_auth_resendCode) obj;
                org.telegram.ui.ek0 ek0Var2 = ak0Var.Q;
                ak0Var.J = false;
                if (tL_error15 == null) {
                    ek0Var2.p1(bundle4, (TLRPC.TL_auth_sentCode) tLObject13, true);
                } else {
                    i15 = ((org.telegram.ui.ActionBar.f2) ek0Var2).currentAccount;
                    org.telegram.ui.ActionBar.u1 c02 = u4.c0(i15, tL_error15, ek0Var2, tL_auth_resendCode2, new Object[0]);
                    if (c02 != null && tL_error15.text.contains("PHONE_CODE_EXPIRED")) {
                        c02.m0 = new org.telegram.ui.wj0(ak0Var, i20);
                    }
                }
                ek0Var2.B1();
                break;
            case 22:
                org.telegram.ui.kl0.k0((org.telegram.ui.kl0) obj5, (TLRPC.TL_error) obj4, (TLObject) obj3, (String) obj2, (TL_account.getPassword) obj);
                break;
            case 23:
                ClippingImageView[] clippingImageViewArr = (ClippingImageView[]) obj4;
                ArrayList arrayList7 = (ArrayList) obj3;
                Integer num = (Integer) obj2;
                org.telegram.ui.xq0 xq0Var2 = (org.telegram.ui.xq0) obj;
                PhotoViewer photoViewer = ((org.telegram.ui.cq0) obj5).r;
                photoViewer.o4 = null;
                org.telegram.ui.sq0 sq0Var = photoViewer.e0;
                if (sq0Var != null && photoViewer.g0 != null) {
                    sq0Var.setLayerType(0, null);
                    photoViewer.m4 = 0;
                    photoViewer.D1();
                    photoViewer.n4 = 0L;
                    photoViewer.G1 = null;
                    photoViewer.E1.a = false;
                    photoViewer.H1 = null;
                    photoViewer.F1.a = false;
                    photoViewer.A2();
                    photoViewer.w2();
                    photoViewer.e0.invalidate();
                    for (ClippingImageView clippingImageView : clippingImageViewArr) {
                        clippingImageView.setVisibility(8);
                    }
                    org.telegram.ui.zq0 zq0Var = photoViewer.p4;
                    if (zq0Var != null) {
                        zq0Var.a.O0(true, true);
                    }
                    org.telegram.ui.zq0 zq0Var2 = photoViewer.q4;
                    if (zq0Var2 != null && !zq0Var2.s) {
                        zq0Var2.a.O0(false, true);
                    }
                    if (arrayList7 != null && (i16 = photoViewer.c2) != 3 && i16 != 1 && ((xq0Var = photoViewer.d) == null || !xq0Var.P())) {
                        photoViewer.Q1();
                    }
                    t51 t51Var = photoViewer.F2;
                    if (t51Var != null && t51Var.d0() && photoViewer.r1 && !photoViewer.f7.isEmpty()) {
                        PhotoViewer.R(photoViewer, photoViewer.F2.S());
                        PhotoViewer.Q(photoViewer, true);
                    }
                    if (photoViewer.s4) {
                        PhotoViewer.S(photoViewer, num.intValue());
                    }
                    if (xq0Var2 != null) {
                        xq0Var2.d();
                        break;
                    }
                }
                break;
            case 24:
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
                        int i24 = globalPrivacySettings2.flags;
                        globalPrivacySettings.flags = i24;
                        globalPrivacySettings.disallowed_stargifts = globalPrivacySettings2.disallowed_stargifts;
                        long j3 = globalPrivacySettings2.noncontact_peers_paid_stars;
                        if (j3 > 0) {
                            globalPrivacySettings.flags = i24 | 32;
                            globalPrivacySettings.noncontact_peers_paid_stars = j3;
                        } else {
                            globalPrivacySettings.flags = i24 & (-33);
                            globalPrivacySettings.noncontact_peers_paid_stars = 0L;
                        }
                    }
                    if (zArr[0]) {
                        privacyControlActivity.I0();
                    }
                    privacyControlActivity.getNotificationCenter().k(47, new Object[0]);
                    break;
                }
            case 25:
                TLRPC.UserFull userFull2 = (TLRPC.UserFull) obj3;
                TL_account.TL_birthday tL_birthday2 = (TL_account.TL_birthday) obj2;
                TLRPC.TL_error tL_error16 = (TLRPC.TL_error) obj;
                PrivacyControlActivity privacyControlActivity2 = ((org.telegram.ui.mt0) obj5).d;
                if (((TLObject) obj4) instanceof TLRPC.TL_boolTrue) {
                    bc Q = gc.a0(privacyControlActivity2).Q(R.raw.contact_check, 36, org.telegram.messenger.id.M0(2131746856, null));
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
                            h6Var = ((org.telegram.ui.ActionBar.f2) privacyControlActivity2).resourceProvider;
                            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(0, parentActivity, h6Var);
                            String M0 = org.telegram.messenger.id.M0(2131746852, null);
                            org.telegram.ui.ActionBar.u1 u1Var2 = alertDialog$Builder2.a;
                            u1Var2.R = M0;
                            u1Var2.T = org.telegram.messenger.id.M0(2131746853, null);
                            alertDialog$Builder2.k(org.telegram.messenger.id.M0(2131747831, null), null);
                            privacyControlActivity2.showDialog(u1Var2);
                            break;
                        }
                    } else {
                        org.telegram.messenger.k5.o(null, 2131743879, gc.a0(privacyControlActivity2), R.raw.error, 36);
                        break;
                    }
                }
                break;
            case 26:
                ProfileActivity profileActivity = (ProfileActivity) obj5;
                TLRPC.ChatParticipant chatParticipant = (TLRPC.ChatParticipant) obj3;
                TLRPC.User user2 = (TLRPC.User) obj2;
                org.telegram.ui.xt0 xt0Var = (org.telegram.ui.xt0) obj;
                RectF rectF = ProfileActivity.V6;
                if (!(((TLRPC.ChannelParticipant) obj4) instanceof TLRPC.TL_channelParticipantAdmin) && !(chatParticipant instanceof TLRPC.TL_chatParticipantAdmin)) {
                    xt0Var.a(1);
                    break;
                } else {
                    AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(0, profileActivity.getParentActivity(), profileActivity.z0);
                    String M02 = org.telegram.messenger.id.M0(R.string.AppName, null);
                    org.telegram.ui.ActionBar.u1 u1Var3 = alertDialog$Builder3.a;
                    u1Var3.R = M02;
                    u1Var3.T = org.telegram.messenger.id.a0(null, null, 2131754350, org.telegram.messenger.g5.m(0, user2.first_name, user2.last_name));
                    alertDialog$Builder3.k(org.telegram.messenger.id.M0(2131747831, null), new org.telegram.ui.oi0(xt0Var, i18));
                    alertDialog$Builder3.h(org.telegram.messenger.id.M0(2131752589, null), null);
                    profileActivity.showDialog(u1Var3);
                    break;
                }
                break;
            case 27:
                ProfileActivity profileActivity2 = (ProfileActivity) obj5;
                TLObject tLObject14 = (TLObject) obj4;
                TLRPC.TL_username tL_username = (TLRPC.TL_username) obj3;
                org.telegram.ui.nv0 nv0Var = (org.telegram.ui.nv0) obj2;
                TLRPC.TL_error tL_error17 = (TLRPC.TL_error) obj;
                if (tLObject14 instanceof TL_fragment.TL_collectibleInfo) {
                    TL_fragment.TL_collectibleInfo tL_collectibleInfo = (TL_fragment.TL_collectibleInfo) tLObject14;
                    if (profileActivity2.d1 != 0) {
                        profileActivity2.getMessagesController().a2(Long.valueOf(profileActivity2.d1));
                    } else {
                        profileActivity2.getMessagesController().M0(Long.valueOf(profileActivity2.e1));
                    }
                    String str16 = "@" + tL_username.username;
                    String format = org.telegram.messenger.id.E0().o0().format(new Date(tL_collectibleInfo.purchase_date * 1000));
                    String f11 = org.telegram.messenger.r1.i().f(tL_collectibleInfo.crypto_amount, tL_collectibleInfo.crypto_currency);
                    String f12 = org.telegram.messenger.r1.i().f(tL_collectibleInfo.amount, tL_collectibleInfo.currency);
                    bc w10 = new gc(nv0Var.w1, profileActivity2.z0).w(R.drawable.filled_username, org.telegram.messenger.g0.d4(org.telegram.messenger.g0.X2(org.telegram.messenger.id.a0(null, null, 2131750519, str16, format, f11, TextUtils.isEmpty(f12) ? "" : a8.p0.p("(", f12, ")"))), new org.telegram.ui.tn0(19, profileActivity2, tL_collectibleInfo)));
                    org.telegram.ui.ik0 ik0Var = new org.telegram.ui.ik0(5, profileActivity2, tL_collectibleInfo);
                    fb fbVar = w10.e;
                    if (fbVar != null) {
                        fbVar.setOnClickListener(ik0Var);
                    }
                    w10.k(false);
                    break;
                } else {
                    RectF rectF2 = ProfileActivity.V6;
                    gc.d0(tL_error17);
                    break;
                }
            case 28:
                ProfileActivity profileActivity3 = (ProfileActivity) obj5;
                TLObject tLObject15 = (TLObject) obj4;
                String str17 = (String) obj3;
                TLRPC.User user3 = (TLRPC.User) obj2;
                TLRPC.TL_error tL_error18 = (TLRPC.TL_error) obj;
                RectF rectF3 = ProfileActivity.V6;
                if (tLObject15 instanceof TL_fragment.TL_collectibleInfo) {
                    org.telegram.ui.k00.a(profileActivity3.getParentActivity(), 1, str17, user3, (TL_fragment.TL_collectibleInfo) tLObject15, profileActivity3.z0);
                    break;
                } else {
                    gc.d0(tL_error18);
                    break;
                }
            default:
                ProfileActivity.o0((ProfileActivity) obj5, (TLObject) obj4, (TLRPC.UserFull) obj3, (TL_account.TL_birthday) obj2, (TLRPC.TL_error) obj);
                break;
        }
    }

    public /* synthetic */ n10(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i7) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
    }
}
