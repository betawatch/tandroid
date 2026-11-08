package org.telegram.ui.Components;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.graphics.RectF;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.TextView;
import java.io.Serializable;
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
import org.telegram.ui.pc1;
import org.telegram.ui.v71;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class jv0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ jv0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i7) {
        this.a = i7;
        this.d = obj;
        this.e = obj2;
        this.c = obj3;
        this.b = obj4;
        this.f = obj5;
    }

    private final void a() {
        ProfileActivity profileActivity = (ProfileActivity) this.d;
        TLObject tLObject = (TLObject) this.b;
        TLRPC.TL_username tL_username = (TLRPC.TL_username) this.e;
        org.telegram.ui.kv0 kv0Var = (org.telegram.ui.kv0) this.f;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.c;
        if (!(tLObject instanceof TL_fragment.TL_collectibleInfo)) {
            RectF rectF = ProfileActivity.S6;
            hc.d0(tL_error);
            return;
        }
        TL_fragment.TL_collectibleInfo tL_collectibleInfo = (TL_fragment.TL_collectibleInfo) tLObject;
        if (profileActivity.d1 != 0) {
            profileActivity.getMessagesController().a2(Long.valueOf(profileActivity.d1));
        } else {
            profileActivity.getMessagesController().M0(Long.valueOf(profileActivity.e1));
        }
        String str = "@" + tL_username.username;
        String format = org.telegram.messenger.id.E0().o0().format(new Date(tL_collectibleInfo.purchase_date * 1000));
        String f10 = org.telegram.messenger.r1.i().f(tL_collectibleInfo.crypto_amount, tL_collectibleInfo.crypto_currency);
        String f11 = org.telegram.messenger.r1.i().f(tL_collectibleInfo.amount, tL_collectibleInfo.currency);
        cc w10 = new hc(kv0Var.t1, profileActivity.z0).w(R.drawable.filled_username, org.telegram.messenger.g0.d4(org.telegram.messenger.g0.X2(org.telegram.messenger.id.a0(null, null, 2131750520, str, format, f10, TextUtils.isEmpty(f11) ? "" : a8.p0.p("(", f11, ")"))), new org.telegram.ui.qn0(18, profileActivity, tL_collectibleInfo)));
        org.telegram.ui.fk0 fk0Var = new org.telegram.ui.fk0(5, profileActivity, tL_collectibleInfo);
        gb gbVar = w10.e;
        if (gbVar != null) {
            gbVar.setOnClickListener(fk0Var);
        }
        w10.k(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        String str;
        TLRPC.GroupCall groupCall;
        TLRPC.TL_wallPaper tL_wallPaper;
        org.telegram.ui.hl0 hl0Var;
        hc d;
        int i7;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        org.telegram.ui.uq0 uq0Var;
        String str2;
        org.telegram.ui.ActionBar.f6 f6Var;
        int i16 = this.a;
        int i17 = 10;
        final int i18 = 1;
        final int i19 = 0;
        Object obj = this.f;
        Object obj2 = this.b;
        Object obj3 = this.c;
        Object obj4 = this.e;
        Object obj5 = this.d;
        switch (i16) {
            case 0:
                yv0 yv0Var = (yv0) obj5;
                String str3 = (String) obj4;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj3;
                TLObject tLObject = (TLObject) obj2;
                TextView textView = (TextView) obj;
                yv0Var.g2 = 0;
                String str4 = yv0Var.f2;
                if (str4 != null && str4.equals(str3)) {
                    if (tL_error != null || !(tLObject instanceof TLRPC.TL_boolTrue)) {
                        textView.setText(org.telegram.messenger.id.M0(2131749231, null));
                        org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.p7, yv0Var.I0);
                        yv0Var.h2 = false;
                        break;
                    } else {
                        textView.setText(org.telegram.messenger.id.M0(2131749236, null));
                        org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.w6, yv0Var.I0);
                        yv0Var.h2 = true;
                        break;
                    }
                }
                break;
            case 1:
                jw0 jw0Var = (jw0) obj5;
                TLObject tLObject2 = (TLObject) obj2;
                TLRPC.UserFull userFull = (TLRPC.UserFull) obj4;
                TL_account.TL_birthday tL_birthday = (TL_account.TL_birthday) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj3;
                org.telegram.ui.ActionBar.f2 T = LaunchActivity.T();
                if (T != null) {
                    if (tLObject2 instanceof TLRPC.TL_boolTrue) {
                        cc I = hc.a0(T).I(R.raw.gift, org.telegram.messenger.id.M0(2131746857, null), org.telegram.messenger.id.M0(2131746856, null));
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
                            alertDialog$Builder.a.R = org.telegram.messenger.id.M0(2131746853, null);
                            alertDialog$Builder.a.T = org.telegram.messenger.id.M0(2131746854, null);
                            jg.g.C(null, 2131747832, alertDialog$Builder, null);
                            break;
                        } else {
                            org.telegram.messenger.k5.o(null, 2131743882, hc.a0(T), R.raw.error, 36);
                            break;
                        }
                    }
                }
                break;
            case 2:
                m11 m11Var = (m11) obj5;
                TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) obj3;
                k60 k60Var = (k60) obj2;
                k60 k60Var2 = (k60) obj;
                org.telegram.ui.an anVar = m11Var.s;
                if (((org.telegram.messenger.qp) obj4).r2(m11Var.f, tL_forumTopic.id, null)) {
                    k60Var.u();
                    org.telegram.messenger.dt.t(m11Var.e).G(m11Var.f, tL_forumTopic.id, false);
                    if (hc.a(anVar)) {
                        hc.z(anVar, 4, 0, m11Var.h).j();
                        break;
                    }
                } else {
                    k60Var.K(k60Var2);
                    break;
                }
                break;
            case 3:
                org.telegram.ui.ks ksVar = (org.telegram.ui.ks) obj5;
                TLObject tLObject3 = (TLObject) obj2;
                ArrayList arrayList = (ArrayList) obj4;
                TLRPC.TL_messages_getMyStickers tL_messages_getMyStickers = (TLRPC.TL_messages_getMyStickers) obj;
                if (((TLRPC.TL_error) obj3) == null && (tLObject3 instanceof TLRPC.TL_messages_myStickers)) {
                    TLRPC.TL_messages_myStickers tL_messages_myStickers = (TLRPC.TL_messages_myStickers) tLObject3;
                    ArrayList<TLRPC.StickerSetCovered> arrayList2 = tL_messages_myStickers.sets;
                    int size = arrayList2.size();
                    while (i19 < size) {
                        TLRPC.StickerSetCovered stickerSetCovered = arrayList2.get(i19);
                        i19++;
                        TLRPC.StickerSetCovered stickerSetCovered2 = stickerSetCovered;
                        TLRPC.StickerSet stickerSet = stickerSetCovered2.set;
                        if (!stickerSet.emojis && !stickerSet.masks) {
                            TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                            tL_inputStickerSetID.id = stickerSetCovered2.set.id;
                            TLRPC.TL_messages_stickerSet m0 = org.telegram.messenger.ui.b0(ksVar.r).m0(tL_inputStickerSetID, true);
                            if (m0 == null || m0.documents.size() < 120) {
                                arrayList.add(stickerSetCovered2);
                            }
                        }
                    }
                    if (tL_messages_myStickers.sets.size() == tL_messages_getMyStickers.limit) {
                        tL_messages_getMyStickers.offset_id = ((TLRPC.StickerSetCovered) jg.g.i(1, tL_messages_myStickers.sets)).set.id;
                        ConnectionsManager.getInstance(ksVar.r).sendRequest(tL_messages_getMyStickers, new org.telegram.ui.z9(ksVar, arrayList, tL_messages_getMyStickers, 7));
                        break;
                    }
                }
                break;
            case 4:
                org.telegram.ui.ww.J0((org.telegram.ui.ww) obj5, (TLObject) obj2, (TLRPC.UserFull) obj4, (TL_account.TL_birthday) obj, (TLRPC.TL_error) obj3);
                break;
            case 5:
                org.telegram.ui.c40 c40Var = (org.telegram.ui.c40) obj5;
                TLObject tLObject4 = (TLObject) obj2;
                TL_phone.exportGroupCallInvite exportgroupcallinvite = (TL_phone.exportGroupCallInvite) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj3;
                c40Var.getClass();
                ((org.telegram.ui.ActionBar.u1) obj4).dismiss();
                if (tLObject4 instanceof TL_phone.exportedGroupCallInvite) {
                    Context context = c40Var.getContext();
                    int i20 = c40Var.a;
                    TLRPC.InputGroupCall inputGroupCall = exportgroupcallinvite.call;
                    String str5 = ((TL_phone.exportedGroupCallInvite) tLObject4).link;
                    org.telegram.ui.ActionBar.f6 f6Var2 = c40Var.I0;
                    org.telegram.messenger.r3 r3Var = c40Var.R2;
                    org.telegram.ui.i9.n0(context, i20, inputGroupCall, str5, f6Var2, false, (r3Var == null || (groupCall = r3Var.b) == null || !groupCall.creator) ? false : true);
                    break;
                } else if (tL_error3 != null) {
                    new hc(c40Var.E, new di.i0()).f0(tL_error3, false);
                    break;
                }
                break;
            case 6:
                org.telegram.ui.c40 c40Var2 = (org.telegram.ui.c40) obj5;
                ArrayList arrayList3 = (ArrayList) obj3;
                ArrayList arrayList4 = (ArrayList) obj2;
                ArrayList arrayList5 = (ArrayList) obj;
                String str6 = (String) obj4;
                c40Var2.getClass();
                org.telegram.ui.ActionBar.f2 T2 = LaunchActivity.T();
                if (T2 != null) {
                    ug.i0 i0Var = new ug.i0(34, c40Var2.a, T2.getContext(), T2, new di.i0());
                    i0Var.C1(null, arrayList3, arrayList4, arrayList5, str6);
                    i0Var.show();
                    break;
                }
                break;
            case 7:
                LaunchActivity launchActivity = (LaunchActivity) obj5;
                org.telegram.ui.q10 q10Var = (org.telegram.ui.q10) obj4;
                TLObject tLObject5 = (TLObject) obj2;
                TLRPC.TL_wallPaper tL_wallPaper2 = (TLRPC.TL_wallPaper) obj;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) obj3;
                String str7 = LaunchActivity.B1;
                try {
                    q10Var.run();
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                }
                if (tLObject5 instanceof TLRPC.TL_wallPaper) {
                    TLRPC.TL_wallPaper tL_wallPaper3 = (TLRPC.TL_wallPaper) tLObject5;
                    if (tL_wallPaper3.pattern) {
                        String str8 = tL_wallPaper3.slug;
                        TLRPC.WallPaperSettings wallPaperSettings = tL_wallPaper2.settings;
                        pc1 pc1Var = new pc1(str8, wallPaperSettings.background_color, wallPaperSettings.second_background_color, wallPaperSettings.third_background_color, wallPaperSettings.fourth_background_color, org.telegram.messenger.g0.s1(wallPaperSettings.rotation, false), r2.intensity / 100.0f, tL_wallPaper2.settings.motion, null);
                        pc1Var.g = tL_wallPaper3;
                        tL_wallPaper3 = pc1Var;
                    }
                    v71 v71Var = new v71(tL_wallPaper3, null, true);
                    TLRPC.WallPaperSettings wallPaperSettings2 = tL_wallPaper2.settings;
                    boolean z9 = wallPaperSettings2.blur;
                    boolean z10 = wallPaperSettings2.motion;
                    float f10 = wallPaperSettings2.intensity;
                    v71Var.G1 = z9;
                    v71Var.F1 = z10;
                    v71Var.o1 = f10;
                    launchActivity.t0(v71Var);
                    break;
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    org.telegram.messenger.camera.q.q(null, 2131751106, sb2, "\n");
                    sb2.append(tL_error4.text);
                    launchActivity.F0(v4.K(launchActivity, null, sb2.toString()));
                    break;
                }
            case 8:
                LaunchActivity launchActivity2 = (LaunchActivity) obj5;
                org.telegram.ui.ww wwVar = (org.telegram.ui.ww) obj3;
                org.telegram.ui.ActionBar.f2 f2Var = (org.telegram.ui.ActionBar.f2) obj2;
                TLRPC.User user = (TLRPC.User) obj;
                String str9 = (String) obj4;
                ArrayList arrayList6 = launchActivity2.C0;
                if (wwVar != null) {
                    if (f2Var != null) {
                        f2Var.dismissCurrentDialog();
                    }
                    while (i19 < arrayList6.size()) {
                        if (((Dialog) arrayList6.get(i19)).isShowing()) {
                            ((Dialog) arrayList6.get(i19)).dismiss();
                        }
                        i19++;
                    }
                    arrayList6.clear();
                    launchActivity2.t0(wwVar);
                    break;
                } else if (f2Var instanceof org.telegram.ui.an) {
                    ((org.telegram.ui.an) f2Var).wa(user.id, str9, true);
                    break;
                }
                break;
            case 9:
                LaunchActivity launchActivity3 = (LaunchActivity) obj5;
                TLObject tLObject6 = (TLObject) obj2;
                TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = (TLRPC.TL_messages_requestUrlAuth) obj;
                String str10 = (String) obj4;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) obj3;
                org.telegram.ui.ActionBar.f2 T3 = LaunchActivity.T();
                if (tLObject6 != null) {
                    if (tLObject6 instanceof TLRPC.TL_urlAuthResultRequest) {
                        org.telegram.ui.bi0.b(false, launchActivity3.O, tL_messages_requestUrlAuth, (TLRPC.TL_urlAuthResultRequest) tLObject6, null, null, null, false, null);
                        break;
                    } else if (tLObject6 instanceof TLRPC.TL_urlAuthResultAccepted) {
                        org.telegram.ui.bi0.b(false, launchActivity3.O, tL_messages_requestUrlAuth, (TLRPC.TL_urlAuthResultAccepted) tLObject6, null, null, null, false, null);
                        break;
                    } else if (tLObject6 instanceof TLRPC.TL_urlAuthResultDefault) {
                        v4.n0(T3, str10, false, true);
                        break;
                    }
                } else if (tL_error5 != null) {
                    if ("URL_EXPIRED".equalsIgnoreCase(tL_error5.text)) {
                        org.telegram.ui.bi0.a().I(R.raw.error, org.telegram.messenger.id.M0(2131753128, null), org.telegram.messenger.id.M0(2131753129, null)).j();
                        break;
                    } else {
                        org.telegram.ui.bi0.a().f0(tL_error5, false);
                        break;
                    }
                }
                break;
            case 10:
                LaunchActivity launchActivity4 = (LaunchActivity) obj5;
                TLObject tLObject7 = (TLObject) obj2;
                org.telegram.ui.ActionBar.u1 u1Var = (org.telegram.ui.ActionBar.u1) obj4;
                org.telegram.ui.q10 q10Var2 = (org.telegram.ui.q10) obj;
                TLRPC.TL_error tL_error6 = (TLRPC.TL_error) obj3;
                String str11 = LaunchActivity.B1;
                if (tLObject7 instanceof TLRPC.TL_theme) {
                    TLRPC.TL_theme tL_theme = (TLRPC.TL_theme) tLObject7;
                    TLRPC.ThemeSettings themeSettings = tL_theme.settings.size() > 0 ? tL_theme.settings.get(0) : null;
                    if (themeSettings != null) {
                        org.telegram.ui.ActionBar.j6 Q0 = org.telegram.ui.ActionBar.k6.Q0(org.telegram.ui.ActionBar.k6.r0(themeSettings));
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
                                q10Var2.run();
                            } catch (Exception e11) {
                                org.telegram.messenger.a8.g(e11, true);
                            }
                            launchActivity4.r0(tL_theme, tL_wallPaper, Q0);
                        }
                        i19 = 1;
                    } else {
                        TLRPC.Document document = tL_theme.document;
                        if (document != null) {
                            launchActivity4.T0 = false;
                            launchActivity4.S0 = tL_theme;
                            launchActivity4.O0 = org.telegram.messenger.w7.r(null, document);
                            launchActivity4.U0 = u1Var;
                            org.telegram.messenger.w7.G(launchActivity4.O).W(launchActivity4.S0.document, tL_theme, 1, 1);
                        }
                        i19 = 1;
                    }
                } else {
                    if (tL_error6 == null || !"THEME_FORMAT_INVALID".equals(tL_error6.text)) {
                        i19 = 2;
                    }
                    i19 = 1;
                }
                if (i19 != 0) {
                    try {
                        q10Var2.run();
                    } catch (Exception e12) {
                        org.telegram.messenger.a8.g(e12, true);
                    }
                    if (i19 == 1) {
                        launchActivity4.F0(v4.K(launchActivity4, org.telegram.messenger.id.M0(2131744193, null), org.telegram.messenger.id.M0(2131744176, null)));
                        break;
                    } else {
                        launchActivity4.F0(v4.K(launchActivity4, org.telegram.messenger.id.M0(2131744193, null), org.telegram.messenger.id.M0(2131744177, null)));
                        break;
                    }
                }
                break;
            case 11:
                org.telegram.ui.p90 p90Var = (org.telegram.ui.p90) obj5;
                TLRPC.TL_error tL_error7 = (TLRPC.TL_error) obj3;
                TLObject tLObject8 = (TLObject) obj2;
                TLRPC.TL_inputInvoiceSlug tL_inputInvoiceSlug = (TLRPC.TL_inputInvoiceSlug) obj;
                String str12 = (String) obj4;
                int i21 = p90Var.b;
                LaunchActivity launchActivity5 = p90Var.a;
                if (tL_error7 != null) {
                    if ("SUBSCRIPTION_ALREADY_ACTIVE".equalsIgnoreCase(tL_error7.text)) {
                        d = org.telegram.ui.p90.d();
                        i7 = 2131747396;
                    } else {
                        d = org.telegram.ui.p90.d();
                        i7 = 2131747397;
                    }
                    org.telegram.messenger.k5.p(null, i7, d, null);
                } else if (!launchActivity5.isFinishing()) {
                    if (tLObject8 instanceof TLRPC.TL_payments_paymentFormStars) {
                        zh.q3 q3Var = launchActivity5.X0;
                        launchActivity5.X0 = null;
                        bi.ea.y(i21, false).X(null, tL_inputInvoiceSlug, (TLRPC.TL_payments_paymentFormStars) tLObject8, new org.telegram.ui.k90(p90Var, 1), new org.telegram.ui.l70(q3Var, i18));
                        break;
                    } else {
                        if (tLObject8 instanceof TLRPC.PaymentForm) {
                            TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject8;
                            org.telegram.messenger.qp.s1(i21).Y3(paymentForm.users, false);
                            hl0Var = new org.telegram.ui.hl0(paymentForm, null, str12, LaunchActivity.T());
                        } else {
                            hl0Var = tLObject8 instanceof TLRPC.PaymentReceipt ? new org.telegram.ui.hl0((TLRPC.PaymentReceipt) tLObject8) : null;
                        }
                        if (hl0Var != null) {
                            zh.q3 q3Var2 = launchActivity5.X0;
                            if (q3Var2 != null) {
                                launchActivity5.X0 = null;
                                hl0Var.Z0 = new org.telegram.ui.ve(i17, q3Var2);
                            }
                            p90Var.u(hl0Var, false);
                        }
                    }
                }
                p90Var.c();
                break;
            case 12:
                org.telegram.ui.ce0.b0((org.telegram.ui.ce0) obj5, (TLRPC.TL_error) obj3, (String) obj4, (String) obj2, (String) obj);
                break;
            case 13:
                TLObject tLObject9 = (TLObject) obj2;
                Bundle bundle = (Bundle) obj4;
                TLRPC.TL_error tL_error8 = (TLRPC.TL_error) obj3;
                TLRPC.TL_auth_resendCode tL_auth_resendCode = (TLRPC.TL_auth_resendCode) obj;
                org.telegram.ui.ce0 ce0Var = ((org.telegram.ui.ob0) obj5).W;
                if (tLObject9 instanceof TLRPC.TL_auth_sentCode) {
                    ce0Var.y1(bundle, (TLRPC.TL_auth_sentCode) tLObject9, true);
                    break;
                } else if (tL_error8 != null && tL_error8.text != null) {
                    i10 = ((org.telegram.ui.ActionBar.f2) ce0Var).currentAccount;
                    v4.c0(i10, tL_error8, ce0Var, tL_auth_resendCode, new Object[0]);
                    break;
                }
                break;
            case 14:
                org.telegram.ui.sc0 sc0Var = (org.telegram.ui.sc0) obj5;
                TLObject tLObject10 = (TLObject) obj2;
                Bundle bundle2 = (Bundle) obj4;
                TLRPC.TL_error tL_error9 = (TLRPC.TL_error) obj3;
                TL_account.sendVerifyEmailCode sendverifyemailcode = (TL_account.sendVerifyEmailCode) obj;
                org.telegram.ui.ce0 ce0Var2 = sc0Var.E;
                ce0Var2.C1(false, true);
                sc0Var.r = false;
                if (tLObject10 instanceof TL_account.sentEmailCode) {
                    TL_account.sentEmailCode sentemailcode = (TL_account.sentEmailCode) tLObject10;
                    bundle2.putString("emailPattern", sentemailcode.email_pattern);
                    bundle2.putInt("length", sentemailcode.length);
                    ce0Var2.M1(13, true, bundle2, false);
                    break;
                } else {
                    String str13 = tL_error9.text;
                    if (str13 != null) {
                        if (str13.contains("EMAIL_INVALID")) {
                            sc0Var.n();
                            break;
                        } else if (tL_error9.text.contains("EMAIL_NOT_ALLOWED")) {
                            ce0Var2.D1(org.telegram.messenger.id.M0(2131746074, null), org.telegram.messenger.id.M0(2131751201, null));
                            break;
                        } else if (tL_error9.text.contains("PHONE_PASSWORD_FLOOD")) {
                            ce0Var2.D1(org.telegram.messenger.id.M0(2131746074, null), org.telegram.messenger.id.M0(2131750688, "FloodWait"));
                            break;
                        } else if (tL_error9.text.contains("PHONE_NUMBER_FLOOD")) {
                            ce0Var2.D1(org.telegram.messenger.id.M0(2131746074, null), org.telegram.messenger.id.M0(2131747287, "PhoneNumberFlood"));
                            break;
                        } else if (!tL_error9.text.contains("PHONE_CODE_EMPTY") && !tL_error9.text.contains("PHONE_CODE_INVALID")) {
                            if (tL_error9.text.contains("PHONE_CODE_EXPIRED")) {
                                ce0Var2.M1(0, true, null, true);
                                ce0Var2.D1(org.telegram.messenger.id.M0(2131746074, null), org.telegram.messenger.id.M0(2131752021, "CodeExpired"));
                                break;
                            } else if (tL_error9.text.startsWith("FLOOD_WAIT")) {
                                ce0Var2.D1(org.telegram.messenger.id.M0(2131746074, null), org.telegram.messenger.id.M0(2131750688, "FloodWait"));
                                break;
                            } else if (tL_error9.code != -1000) {
                                i11 = ((org.telegram.ui.ActionBar.f2) ce0Var2).currentAccount;
                                v4.c0(i11, tL_error9, ce0Var2, sendverifyemailcode, sc0Var.x);
                                break;
                            }
                        } else {
                            ce0Var2.D1(org.telegram.messenger.id.M0(2131746074, null), org.telegram.messenger.id.M0(2131749184, "InvalidCode"));
                            break;
                        }
                    }
                }
                break;
            case 15:
                TLObject tLObject11 = (TLObject) obj2;
                Bundle bundle3 = (Bundle) obj4;
                TLRPC.TL_error tL_error10 = (TLRPC.TL_error) obj3;
                TL_account.verifyEmail verifyemail = (TL_account.verifyEmail) obj;
                org.telegram.ui.ce0 ce0Var3 = ((org.telegram.ui.sc0) obj5).E;
                if (!(tLObject11 instanceof TL_account.TL_emailVerified) || ce0Var3.F != 3) {
                    if (tLObject11 instanceof TL_account.TL_emailVerifiedLogin) {
                        TL_account.TL_emailVerifiedLogin tL_emailVerifiedLogin = (TL_account.TL_emailVerifiedLogin) tLObject11;
                        bundle3.putString("email", tL_emailVerifiedLogin.email);
                        ce0Var3.y1(bundle3, tL_emailVerifiedLogin.sent_code, true);
                        break;
                    } else if (tL_error10 != null) {
                        if (tL_error10.text.contains("EMAIL_NOT_ALLOWED")) {
                            ce0Var3.D1(org.telegram.messenger.id.M0(2131746074, null), org.telegram.messenger.id.M0(2131751201, null));
                            break;
                        } else if (tL_error10.text.contains("EMAIL_TOKEN_INVALID")) {
                            ce0Var3.D1(org.telegram.messenger.id.M0(2131746074, null), org.telegram.messenger.id.M0(2131751198, null));
                            break;
                        } else if (tL_error10.code != -1000) {
                            i12 = ((org.telegram.ui.ActionBar.f2) ce0Var3).currentAccount;
                            v4.c0(i12, tL_error10, ce0Var3, verifyemail, new Object[0]);
                            break;
                        }
                    }
                } else {
                    ce0Var3.finishFragment();
                    ce0Var3.d0.run();
                    break;
                }
                break;
            case 16:
                final org.telegram.ui.ld0 ld0Var = (org.telegram.ui.ld0) obj5;
                TLObject tLObject12 = (TLObject) obj2;
                TLRPC.TL_inputInvoicePremiumAuthCode tL_inputInvoicePremiumAuthCode = (TLRPC.TL_inputInvoicePremiumAuthCode) obj4;
                final TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode = (TLRPC.TL_inputStorePaymentAuthCode) obj;
                TLRPC.TL_error tL_error11 = (TLRPC.TL_error) obj3;
                org.telegram.ui.ce0 ce0Var4 = ld0Var.w;
                ld0Var.b.setLoading(false);
                if (tLObject12 instanceof TLRPC.PaymentForm) {
                    final TLRPC.PaymentForm paymentForm2 = (TLRPC.PaymentForm) tLObject12;
                    ce0Var4.getMessagesController().Y3(paymentForm2.users, false);
                    org.telegram.ui.hl0 hl0Var2 = new org.telegram.ui.hl0(tL_inputInvoicePremiumAuthCode, paymentForm2, null, null, 4, null, null, null, null, null, null, false, null, ce0Var4, true);
                    hl0Var2.V0 = true;
                    hl0Var2.c1 = new org.telegram.messenger.c20() { // from class: org.telegram.ui.id0
                        @Override // org.telegram.messenger.c20
                        public final void a(Object obj6) {
                            switch (i19) {
                                case 0:
                                    final int i22 = 0;
                                    final ld0 ld0Var2 = ld0Var;
                                    final TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode2 = tL_inputStorePaymentAuthCode;
                                    final TLRPC.PaymentForm paymentForm3 = paymentForm2;
                                    org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.jd0
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i22) {
                                                case 0:
                                                    TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode3 = tL_inputStorePaymentAuthCode2;
                                                    String str14 = tL_inputStorePaymentAuthCode3.phone_number;
                                                    String str15 = tL_inputStorePaymentAuthCode3.phone_code_hash;
                                                    long j3 = paymentForm3.form_id;
                                                    ld0 ld0Var3 = ld0Var2;
                                                    if (!ld0Var3.f) {
                                                        ld0Var3.f = true;
                                                        ld0Var3.h = str14;
                                                        ld0Var3.n = str15;
                                                        ld0Var3.r = j3;
                                                        ld0Var3.b.setLoading(true);
                                                        ld0Var3.o();
                                                        break;
                                                    }
                                                    break;
                                                default:
                                                    TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode4 = tL_inputStorePaymentAuthCode2;
                                                    String str16 = tL_inputStorePaymentAuthCode4.phone_number;
                                                    String str17 = tL_inputStorePaymentAuthCode4.phone_code_hash;
                                                    long j10 = paymentForm3.form_id;
                                                    ld0 ld0Var4 = ld0Var2;
                                                    if (!ld0Var4.f) {
                                                        ld0Var4.f = true;
                                                        ld0Var4.h = str16;
                                                        ld0Var4.n = str17;
                                                        ld0Var4.r = j10;
                                                        ld0Var4.b.setLoading(true);
                                                        ld0Var4.o();
                                                        break;
                                                    }
                                                    break;
                                            }
                                        }
                                    });
                                    break;
                                default:
                                    final int i23 = 1;
                                    final ld0 ld0Var3 = ld0Var;
                                    final TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode3 = tL_inputStorePaymentAuthCode;
                                    final TLRPC.PaymentForm paymentForm4 = paymentForm2;
                                    org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.jd0
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i23) {
                                                case 0:
                                                    TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode32 = tL_inputStorePaymentAuthCode3;
                                                    String str14 = tL_inputStorePaymentAuthCode32.phone_number;
                                                    String str15 = tL_inputStorePaymentAuthCode32.phone_code_hash;
                                                    long j3 = paymentForm4.form_id;
                                                    ld0 ld0Var32 = ld0Var3;
                                                    if (!ld0Var32.f) {
                                                        ld0Var32.f = true;
                                                        ld0Var32.h = str14;
                                                        ld0Var32.n = str15;
                                                        ld0Var32.r = j3;
                                                        ld0Var32.b.setLoading(true);
                                                        ld0Var32.o();
                                                        break;
                                                    }
                                                    break;
                                                default:
                                                    TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode4 = tL_inputStorePaymentAuthCode3;
                                                    String str16 = tL_inputStorePaymentAuthCode4.phone_number;
                                                    String str17 = tL_inputStorePaymentAuthCode4.phone_code_hash;
                                                    long j10 = paymentForm4.form_id;
                                                    ld0 ld0Var4 = ld0Var3;
                                                    if (!ld0Var4.f) {
                                                        ld0Var4.f = true;
                                                        ld0Var4.h = str16;
                                                        ld0Var4.n = str17;
                                                        ld0Var4.r = j10;
                                                        ld0Var4.b.setLoading(true);
                                                        ld0Var4.o();
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
                    hl0Var2.d1 = new org.telegram.messenger.c20() { // from class: org.telegram.ui.id0
                        @Override // org.telegram.messenger.c20
                        public final void a(Object obj6) {
                            switch (i18) {
                                case 0:
                                    final int i22 = 0;
                                    final ld0 ld0Var2 = ld0Var;
                                    final TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode2 = tL_inputStorePaymentAuthCode;
                                    final TLRPC.PaymentForm paymentForm3 = paymentForm2;
                                    org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.jd0
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i22) {
                                                case 0:
                                                    TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode32 = tL_inputStorePaymentAuthCode2;
                                                    String str14 = tL_inputStorePaymentAuthCode32.phone_number;
                                                    String str15 = tL_inputStorePaymentAuthCode32.phone_code_hash;
                                                    long j3 = paymentForm3.form_id;
                                                    ld0 ld0Var32 = ld0Var2;
                                                    if (!ld0Var32.f) {
                                                        ld0Var32.f = true;
                                                        ld0Var32.h = str14;
                                                        ld0Var32.n = str15;
                                                        ld0Var32.r = j3;
                                                        ld0Var32.b.setLoading(true);
                                                        ld0Var32.o();
                                                        break;
                                                    }
                                                    break;
                                                default:
                                                    TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode4 = tL_inputStorePaymentAuthCode2;
                                                    String str16 = tL_inputStorePaymentAuthCode4.phone_number;
                                                    String str17 = tL_inputStorePaymentAuthCode4.phone_code_hash;
                                                    long j10 = paymentForm3.form_id;
                                                    ld0 ld0Var4 = ld0Var2;
                                                    if (!ld0Var4.f) {
                                                        ld0Var4.f = true;
                                                        ld0Var4.h = str16;
                                                        ld0Var4.n = str17;
                                                        ld0Var4.r = j10;
                                                        ld0Var4.b.setLoading(true);
                                                        ld0Var4.o();
                                                        break;
                                                    }
                                                    break;
                                            }
                                        }
                                    });
                                    break;
                                default:
                                    final int i23 = 1;
                                    final ld0 ld0Var3 = ld0Var;
                                    final TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode3 = tL_inputStorePaymentAuthCode;
                                    final TLRPC.PaymentForm paymentForm4 = paymentForm2;
                                    org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.jd0
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i23) {
                                                case 0:
                                                    TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode32 = tL_inputStorePaymentAuthCode3;
                                                    String str14 = tL_inputStorePaymentAuthCode32.phone_number;
                                                    String str15 = tL_inputStorePaymentAuthCode32.phone_code_hash;
                                                    long j3 = paymentForm4.form_id;
                                                    ld0 ld0Var32 = ld0Var3;
                                                    if (!ld0Var32.f) {
                                                        ld0Var32.f = true;
                                                        ld0Var32.h = str14;
                                                        ld0Var32.n = str15;
                                                        ld0Var32.r = j3;
                                                        ld0Var32.b.setLoading(true);
                                                        ld0Var32.o();
                                                        break;
                                                    }
                                                    break;
                                                default:
                                                    TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode4 = tL_inputStorePaymentAuthCode3;
                                                    String str16 = tL_inputStorePaymentAuthCode4.phone_number;
                                                    String str17 = tL_inputStorePaymentAuthCode4.phone_code_hash;
                                                    long j10 = paymentForm4.form_id;
                                                    ld0 ld0Var4 = ld0Var3;
                                                    if (!ld0Var4.f) {
                                                        ld0Var4.f = true;
                                                        ld0Var4.h = str16;
                                                        ld0Var4.n = str17;
                                                        ld0Var4.r = j10;
                                                        ld0Var4.b.setLoading(true);
                                                        ld0Var4.o();
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
                    hl0Var2.e1 = new org.telegram.ui.j00(ld0Var, i18);
                    ce0Var4.presentFragment(hl0Var2);
                    break;
                } else if (tL_error11 != null) {
                    if ("PHONE_CODE_EXPIRED".equalsIgnoreCase(tL_error11.text)) {
                        org.telegram.messenger.g0.h3(new org.telegram.ui.hd0(ld0Var, 2));
                        break;
                    } else {
                        String str14 = tL_error11.text;
                        ld0Var.e = str14;
                        new hc(ce0Var4.Z, null).H(R.raw.error, org.telegram.messenger.id.a0(null, null, 2131743881, str14));
                        break;
                    }
                } else {
                    new hc(ce0Var4.Z, null).H(R.raw.error, org.telegram.messenger.id.M0(2131743882, null));
                    break;
                }
            case 17:
                org.telegram.ui.jg0 jg0Var = (org.telegram.ui.jg0) obj5;
                TLRPC.TL_error tL_error12 = (TLRPC.TL_error) obj3;
                mg.b bVar = (mg.b) obj2;
                String str15 = (String) obj4;
                TL_stats.TL_loadAsyncGraph tL_loadAsyncGraph = (TL_stats.TL_loadAsyncGraph) obj;
                jg0Var.D = true;
                if (tL_error12 != null || bVar == null) {
                    jg0Var.m0();
                    break;
                } else {
                    jg0Var.w.l(str15, bVar);
                    org.telegram.ui.o41 o41Var = jg0Var.r;
                    o41Var.e = bVar;
                    o41Var.c = tL_loadAsyncGraph.x;
                    jg0Var.m0();
                    break;
                }
            case 18:
                org.telegram.ui.ah0 ah0Var = (org.telegram.ui.ah0) obj5;
                TLRPC.TL_contacts_importedContacts tL_contacts_importedContacts = (TLRPC.TL_contacts_importedContacts) obj4;
                TLRPC.TL_inputPhoneContact tL_inputPhoneContact = (TLRPC.TL_inputPhoneContact) obj2;
                TLRPC.TL_error tL_error13 = (TLRPC.TL_error) obj3;
                TLRPC.TL_contacts_importContacts tL_contacts_importContacts = (TLRPC.TL_contacts_importContacts) obj;
                org.telegram.ui.ActionBar.f2 f2Var2 = ah0Var.C1;
                ah0Var.x1 = false;
                if (tL_contacts_importedContacts == null) {
                    org.telegram.messenger.g0.Z3(ah0Var.N1, true, 0.5f, true, true);
                    org.telegram.messenger.g0.Z3(ah0Var.O1, false, 0.5f, true, true);
                    v4.c0(ah0Var.a, tL_error13, f2Var2, tL_contacts_importContacts, new Object[0]);
                    break;
                } else if (!tL_contacts_importedContacts.users.isEmpty()) {
                    org.telegram.messenger.qp.s1(ah0Var.a).Y3(tL_contacts_importedContacts.users, false);
                    org.telegram.messenger.qp.s1(ah0Var.a).z3(tL_contacts_importedContacts.users.get(0), null, f2Var2, 1);
                    ah0Var.dismiss();
                    break;
                } else if (f2Var2.getParentActivity() != null) {
                    org.telegram.messenger.g0.Z3(ah0Var.N1, true, 0.5f, true, true);
                    org.telegram.messenger.g0.Z3(ah0Var.O1, false, 0.5f, true, true);
                    v4.u(f2Var2, tL_inputPhoneContact.first_name, tL_inputPhoneContact.last_name, tL_inputPhoneContact.phone);
                    break;
                }
                break;
            case 19:
                TLRPC.TL_error tL_error14 = (TLRPC.TL_error) obj3;
                org.telegram.ui.ef0 ef0Var = (org.telegram.ui.ef0) obj4;
                m4.d0 d0Var = (m4.d0) obj2;
                TL_account.verifyEmail verifyemail2 = (TL_account.verifyEmail) obj;
                org.telegram.ui.bk0 bk0Var = ((org.telegram.ui.kj0) obj5).a;
                if (tL_error14 == null) {
                    ((org.telegram.ui.gj0) bk0Var.B1).c(bk0Var.E, (String) bk0Var.s1.get("email"), null, null, null, null, null, null, null, null, ef0Var, d0Var);
                    break;
                } else {
                    i13 = ((org.telegram.ui.ActionBar.f2) bk0Var).currentAccount;
                    v4.c0(i13, tL_error14, bk0Var, verifyemail2, new Object[0]);
                    d0Var.a(null, null);
                    break;
                }
            case 20:
                org.telegram.ui.xj0 xj0Var = (org.telegram.ui.xj0) obj5;
                TLRPC.TL_error tL_error15 = (TLRPC.TL_error) obj3;
                Bundle bundle4 = (Bundle) obj4;
                TLObject tLObject13 = (TLObject) obj2;
                TLRPC.TL_auth_resendCode tL_auth_resendCode2 = (TLRPC.TL_auth_resendCode) obj;
                org.telegram.ui.bk0 bk0Var2 = xj0Var.Q;
                xj0Var.J = false;
                if (tL_error15 == null) {
                    bk0Var2.p1(bundle4, (TLRPC.TL_auth_sentCode) tLObject13, true);
                } else {
                    i14 = ((org.telegram.ui.ActionBar.f2) bk0Var2).currentAccount;
                    org.telegram.ui.ActionBar.u1 c02 = v4.c0(i14, tL_error15, bk0Var2, tL_auth_resendCode2, new Object[0]);
                    if (c02 != null && tL_error15.text.contains("PHONE_CODE_EXPIRED")) {
                        c02.m0 = new org.telegram.ui.tj0(xj0Var, i19);
                    }
                }
                bk0Var2.B1();
                break;
            case 21:
                org.telegram.ui.hl0.k0((org.telegram.ui.hl0) obj5, (TLRPC.TL_error) obj3, (TLObject) obj2, (String) obj4, (TL_account.getPassword) obj);
                break;
            case 22:
                ClippingImageView[] clippingImageViewArr = (ClippingImageView[]) obj4;
                ArrayList arrayList7 = (ArrayList) obj3;
                Integer num = (Integer) obj2;
                org.telegram.ui.uq0 uq0Var2 = (org.telegram.ui.uq0) obj;
                PhotoViewer photoViewer = ((org.telegram.ui.zp0) obj5).r;
                photoViewer.o4 = null;
                org.telegram.ui.pq0 pq0Var = photoViewer.e0;
                if (pq0Var != null && photoViewer.g0 != null) {
                    pq0Var.setLayerType(0, null);
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
                    org.telegram.ui.wq0 wq0Var = photoViewer.p4;
                    if (wq0Var != null) {
                        wq0Var.a.O0(true, true);
                    }
                    org.telegram.ui.wq0 wq0Var2 = photoViewer.q4;
                    if (wq0Var2 != null && !wq0Var2.s) {
                        wq0Var2.a.O0(false, true);
                    }
                    if (arrayList7 != null && (i15 = photoViewer.c2) != 3 && i15 != 1 && ((uq0Var = photoViewer.d) == null || !uq0Var.P())) {
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
                    if (uq0Var2 != null) {
                        uq0Var2.d();
                        break;
                    }
                }
                break;
            case 23:
                PrivacyControlActivity privacyControlActivity = (PrivacyControlActivity) obj5;
                boolean[] zArr = (boolean[]) obj4;
                TLRPC.GlobalPrivacySettings globalPrivacySettings = (TLRPC.GlobalPrivacySettings) obj2;
                TL_account.setGlobalPrivacySettings setglobalprivacysettings = (TL_account.setGlobalPrivacySettings) obj;
                if (((TLRPC.TL_error) obj3) != null) {
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
                        long j3 = globalPrivacySettings2.noncontact_peers_paid_stars;
                        if (j3 > 0) {
                            globalPrivacySettings.flags = i22 | 32;
                            globalPrivacySettings.noncontact_peers_paid_stars = j3;
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
            case 24:
                TLRPC.UserFull userFull2 = (TLRPC.UserFull) obj4;
                TL_account.TL_birthday tL_birthday2 = (TL_account.TL_birthday) obj;
                TLRPC.TL_error tL_error16 = (TLRPC.TL_error) obj3;
                PrivacyControlActivity privacyControlActivity2 = ((org.telegram.ui.jt0) obj5).d;
                if (((TLObject) obj2) instanceof TLRPC.TL_boolTrue) {
                    cc Q = hc.a0(privacyControlActivity2).Q(R.raw.contact_check, 36, org.telegram.messenger.id.M0(2131746857, null));
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
                            f6Var = ((org.telegram.ui.ActionBar.f2) privacyControlActivity2).resourceProvider;
                            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(0, parentActivity, f6Var);
                            String M0 = org.telegram.messenger.id.M0(2131746853, null);
                            org.telegram.ui.ActionBar.u1 u1Var2 = alertDialog$Builder2.a;
                            u1Var2.R = M0;
                            u1Var2.T = org.telegram.messenger.id.M0(2131746854, null);
                            alertDialog$Builder2.k(org.telegram.messenger.id.M0(2131747832, null), null);
                            privacyControlActivity2.showDialog(u1Var2);
                            break;
                        }
                    } else {
                        org.telegram.messenger.k5.o(null, 2131743882, hc.a0(privacyControlActivity2), R.raw.error, 36);
                        break;
                    }
                }
                break;
            case 25:
                ProfileActivity profileActivity = (ProfileActivity) obj5;
                TLRPC.ChatParticipant chatParticipant = (TLRPC.ChatParticipant) obj3;
                TLRPC.User user2 = (TLRPC.User) obj2;
                org.telegram.ui.ut0 ut0Var = (org.telegram.ui.ut0) obj;
                RectF rectF = ProfileActivity.S6;
                if (!(((TLRPC.ChannelParticipant) obj4) instanceof TLRPC.TL_channelParticipantAdmin) && !(chatParticipant instanceof TLRPC.TL_chatParticipantAdmin)) {
                    ut0Var.a(1);
                    break;
                } else {
                    AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(0, profileActivity.getParentActivity(), profileActivity.z0);
                    String M02 = org.telegram.messenger.id.M0(R.string.AppName, null);
                    org.telegram.ui.ActionBar.u1 u1Var3 = alertDialog$Builder3.a;
                    u1Var3.R = M02;
                    u1Var3.T = org.telegram.messenger.id.a0(null, null, 2131754350, org.telegram.messenger.g5.m(0, user2.first_name, user2.last_name));
                    alertDialog$Builder3.k(org.telegram.messenger.id.M0(2131747832, null), new org.telegram.ui.li0(ut0Var, i17));
                    alertDialog$Builder3.h(org.telegram.messenger.id.M0(2131752589, null), null);
                    profileActivity.showDialog(u1Var3);
                    break;
                }
            case 26:
                a();
                break;
            case 27:
                ProfileActivity profileActivity2 = (ProfileActivity) obj5;
                TLObject tLObject14 = (TLObject) obj2;
                String str16 = (String) obj4;
                TLRPC.User user3 = (TLRPC.User) obj;
                TLRPC.TL_error tL_error17 = (TLRPC.TL_error) obj3;
                RectF rectF2 = ProfileActivity.S6;
                if (tLObject14 instanceof TL_fragment.TL_collectibleInfo) {
                    org.telegram.ui.h00.a(profileActivity2.getParentActivity(), 1, str16, user3, (TL_fragment.TL_collectibleInfo) tLObject14, profileActivity2.z0);
                    break;
                } else {
                    hc.d0(tL_error17);
                    break;
                }
            case 28:
                ProfileActivity.h0((ProfileActivity) obj5, (TLObject) obj2, (TLRPC.UserFull) obj4, (TL_account.TL_birthday) obj, (TLRPC.TL_error) obj3);
                break;
            default:
                org.telegram.ui.tw0 tw0Var = (org.telegram.ui.tw0) obj5;
                ArrayList arrayList8 = (ArrayList) obj3;
                ArrayList arrayList9 = (ArrayList) obj2;
                ArrayList arrayList10 = (ArrayList) obj;
                org.telegram.ui.ActionBar.f2 f2Var3 = tw0Var.e;
                if (((String) obj4).equals(tw0Var.D)) {
                    if (!tw0Var.x && (f2Var3 instanceof ProfileActivity)) {
                        try {
                            ((ProfileActivity) f2Var3).O.b.getImageReceiver().P0(false);
                            ((ProfileActivity) f2Var3).O.d.setText(org.telegram.messenger.id.M0(2131745479, null));
                        } catch (Exception e13) {
                            org.telegram.messenger.a8.g(e13, true);
                        }
                    }
                    tw0Var.x = true;
                    tw0Var.r = arrayList8;
                    tw0Var.s = arrayList9;
                    tw0Var.n = arrayList10;
                    tw0Var.f();
                    if (f2Var3 instanceof ProfileActivity) {
                        try {
                            ((ProfileActivity) f2Var3).O.b.getImageReceiver().P0(false);
                            break;
                        } catch (Exception e14) {
                            org.telegram.messenger.a8.g(e14, true);
                        }
                    }
                }
                break;
        }
    }

    public /* synthetic */ jv0(Object obj, Object obj2, Object obj3, Object obj4, String str, int i7) {
        this.a = i7;
        this.d = obj;
        this.c = obj2;
        this.b = obj3;
        this.f = obj4;
        this.e = str;
    }

    public /* synthetic */ jv0(Object obj, Object obj2, TLObject tLObject, TLObject tLObject2, TLRPC.TL_error tL_error, int i7) {
        this.a = i7;
        this.d = obj;
        this.e = obj2;
        this.b = tLObject;
        this.f = tLObject2;
        this.c = tL_error;
    }

    public /* synthetic */ jv0(Object obj, Object obj2, TLRPC.TL_error tL_error, TLObject tLObject, Object obj3, int i7) {
        this.a = i7;
        this.d = obj;
        this.b = tLObject;
        this.e = obj2;
        this.f = obj3;
        this.c = tL_error;
    }

    public /* synthetic */ jv0(Object obj, TLRPC.TL_error tL_error, Object obj2, Serializable serializable, TLObject tLObject, int i7) {
        this.a = i7;
        this.d = obj;
        this.c = tL_error;
        this.b = obj2;
        this.e = serializable;
        this.f = tLObject;
    }

    public /* synthetic */ jv0(Object obj, TLRPC.TL_error tL_error, Object obj2, Object obj3, Object obj4, int i7) {
        this.a = i7;
        this.d = obj;
        this.c = tL_error;
        this.e = obj2;
        this.b = obj3;
        this.f = obj4;
    }

    public /* synthetic */ jv0(wt0 wt0Var, TLObject tLObject, Bundle bundle, TLRPC.TL_error tL_error, TLObject tLObject2, int i7) {
        this.a = i7;
        this.d = wt0Var;
        this.b = tLObject;
        this.e = bundle;
        this.c = tL_error;
        this.f = tLObject2;
    }

    public /* synthetic */ jv0(LaunchActivity launchActivity, TLObject tLObject, TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth, String str, TLRPC.TL_error tL_error) {
        this.a = 9;
        this.d = launchActivity;
        this.b = tLObject;
        this.f = tL_messages_requestUrlAuth;
        this.e = str;
        this.c = tL_error;
    }

    public /* synthetic */ jv0(org.telegram.ui.ah0 ah0Var, TLRPC.TL_contacts_importedContacts tL_contacts_importedContacts, TLRPC.TL_inputPhoneContact tL_inputPhoneContact, TLRPC.TL_error tL_error, TLRPC.TL_contacts_importContacts tL_contacts_importContacts) {
        this.a = 18;
        this.d = ah0Var;
        this.e = tL_contacts_importedContacts;
        this.b = tL_inputPhoneContact;
        this.c = tL_error;
        this.f = tL_contacts_importContacts;
    }
}
