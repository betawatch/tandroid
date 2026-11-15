package org.telegram.ui;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.graphics.RectF;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;
import j$.util.Objects;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.ClippingImageView;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class hp implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ hp(KeyEvent.Callback callback, TLObject tLObject, Object obj, TLRPC.TL_error tL_error, TLObject tLObject2, int i7) {
        this.a = i7;
        this.b = callback;
        this.d = tLObject;
        this.e = obj;
        this.c = tL_error;
        this.f = tLObject2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        String str;
        TLRPC.GroupCall groupCall;
        int i7;
        TLRPC.TL_wallPaper tL_wallPaper;
        jl0 jl0Var;
        org.telegram.ui.Components.cc d;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        sq0 sq0Var;
        String str2;
        org.telegram.ui.ActionBar.e6 e6Var;
        int i17 = this.a;
        int i18 = 10;
        final int i19 = 1;
        final int i20 = 0;
        Object obj = this.f;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.c;
        Object obj5 = this.b;
        switch (i17) {
            case 0:
                mp.d0((mp) obj5, (TLRPC.TL_error) obj4, (TLRPC.InputCheckPasswordSRP) obj3, (TwoStepVerificationActivity) obj2, (TLRPC.TL_channels_editCreator) obj);
                break;
            case 1:
                pq pqVar = (pq) obj5;
                ArrayList arrayList = (ArrayList) obj4;
                a0.h hVar = (a0.h) obj3;
                ArrayList arrayList2 = (ArrayList) obj2;
                ArrayList arrayList3 = (ArrayList) obj;
                jg.z1 z1Var = pqVar.h;
                qq qqVar = pqVar.E;
                if (qqVar.o1) {
                    pqVar.s = false;
                    pqVar.d = arrayList;
                    pqVar.e = hVar;
                    pqVar.f = arrayList2;
                    z1Var.f(arrayList, null);
                    if (!org.telegram.messenger.t3.T(qqVar.n)) {
                        ArrayList arrayList4 = z1Var.g;
                        arrayList4.clear();
                        arrayList4.addAll(arrayList3);
                    }
                    int i21 = pqVar.r;
                    pqVar.f();
                    if (pqVar.r > i21) {
                        qqVar.D0(i21);
                    }
                    if (!z1Var.e() && pqVar.r == 0) {
                        qqVar.b.e(false, true);
                        break;
                    }
                }
                break;
            case 2:
                org.telegram.ui.Components.gf gfVar = (org.telegram.ui.Components.gf) obj5;
                ji.n nVar = (ji.n) obj4;
                ji.h hVar2 = (ji.h) obj2;
                ji.p pVar = (ji.p) obj;
                ChatActivityEnterView chatActivityEnterView = gfVar.a;
                org.telegram.ui.Components.de0 a82 = chatActivityEnterView.x3.a8(nVar, (org.telegram.messenger.ou) obj3);
                if (a82 == null) {
                    org.telegram.messenger.g0.E2(nVar);
                    break;
                } else {
                    int u02 = chatActivityEnterView.u0(org.telegram.ui.ActionBar.j6.E8);
                    ArrayList y10 = chatActivityEnterView.o0().y();
                    int size = y10.size();
                    while (i20 < size) {
                        Object obj6 = y10.get(i20);
                        i20++;
                        ai.h hVar3 = (ai.h) obj6;
                        a82.c(new ai.l0(chatActivityEnterView.getContext(), hVar3, u02, chatActivityEnterView.R, false), 48, new org.telegram.ui.Components.od(i19, hVar2, hVar3));
                    }
                    a82.I = new org.telegram.ui.Components.od(2, gfVar, nVar);
                    chatActivityEnterView.m1 = true;
                    ChatActivityEnterView.RecordCircle recordCircle = chatActivityEnterView.v2;
                    if (recordCircle != null) {
                        recordCircle.invalidate();
                    }
                    Objects.requireNonNull(pVar);
                    a82.J = new org.telegram.ui.Components.q2(pVar, 3);
                    int[] iArr = new int[2];
                    chatActivityEnterView.getLocationInWindow(iArr);
                    a82.E = iArr[1];
                    a82.G = org.telegram.messenger.g0.L(org.telegram.messenger.ns.n5);
                    a82.i();
                    break;
                }
            case 3:
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
            case 4:
                org.telegram.ui.Components.bw0 bw0Var = (org.telegram.ui.Components.bw0) obj5;
                String str3 = (String) obj3;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj4;
                TLObject tLObject = (TLObject) obj2;
                TextView textView = (TextView) obj;
                bw0Var.k2 = 0;
                String str4 = bw0Var.j2;
                if (str4 != null && str4.equals(str3)) {
                    if (tL_error != null || !(tLObject instanceof TLRPC.TL_boolTrue)) {
                        textView.setText(org.telegram.messenger.hd.M0(2131749230, null));
                        org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.p7, bw0Var.J0);
                        bw0Var.l2 = false;
                        break;
                    } else {
                        textView.setText(org.telegram.messenger.hd.M0(2131749235, null));
                        org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.w6, bw0Var.J0);
                        bw0Var.l2 = true;
                        break;
                    }
                }
                break;
            case 5:
                org.telegram.ui.Components.mw0 mw0Var = (org.telegram.ui.Components.mw0) obj5;
                TLObject tLObject2 = (TLObject) obj3;
                TLRPC.UserFull userFull = (TLRPC.UserFull) obj2;
                TL_account.TL_birthday tL_birthday = (TL_account.TL_birthday) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj4;
                org.telegram.ui.ActionBar.e2 T = LaunchActivity.T();
                if (T != null) {
                    if (tLObject2 instanceof TLRPC.TL_boolTrue) {
                        org.telegram.ui.Components.xb I = org.telegram.ui.Components.cc.a0(T).I(R.raw.gift, org.telegram.messenger.hd.M0(2131746856, null), org.telegram.messenger.hd.M0(2131746855, null));
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
                            org.telegram.messenger.vr.a0(mw0Var.a).j2(userFull, false);
                        }
                        if (tL_error2 != null && (str = tL_error2.text) != null && str.startsWith("FLOOD_WAIT_")) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(mw0Var.b.getContext());
                            alertDialog$Builder.a.S = org.telegram.messenger.hd.M0(2131746852, null);
                            alertDialog$Builder.a.U = org.telegram.messenger.hd.M0(2131746853, null);
                            i5.c.C(null, 2131747831, alertDialog$Builder, null);
                            break;
                        } else {
                            org.telegram.messenger.k5.n(null, 2131743879, org.telegram.ui.Components.cc.a0(T), R.raw.error, 36);
                            break;
                        }
                    }
                }
                break;
            case 6:
                org.telegram.ui.Components.p11 p11Var = (org.telegram.ui.Components.p11) obj5;
                TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) obj3;
                org.telegram.ui.Components.m60 m60Var = (org.telegram.ui.Components.m60) obj2;
                org.telegram.ui.Components.m60 m60Var2 = (org.telegram.ui.Components.m60) obj;
                an anVar = p11Var.s;
                if (((org.telegram.messenger.np) obj4).r2(p11Var.f, tL_forumTopic.id, null)) {
                    m60Var.u();
                    org.telegram.messenger.at.t(p11Var.e).G(p11Var.f, tL_forumTopic.id, false);
                    if (org.telegram.ui.Components.cc.a(anVar)) {
                        org.telegram.ui.Components.cc.z(anVar, 4, 0, p11Var.h).j();
                        break;
                    }
                } else {
                    m60Var.K(m60Var2);
                    break;
                }
                break;
            case 7:
                ns nsVar = (ns) obj5;
                TLObject tLObject3 = (TLObject) obj3;
                ArrayList arrayList5 = (ArrayList) obj2;
                TLRPC.TL_messages_getMyStickers tL_messages_getMyStickers = (TLRPC.TL_messages_getMyStickers) obj;
                if (((TLRPC.TL_error) obj4) == null && (tLObject3 instanceof TLRPC.TL_messages_myStickers)) {
                    TLRPC.TL_messages_myStickers tL_messages_myStickers = (TLRPC.TL_messages_myStickers) tLObject3;
                    ArrayList<TLRPC.StickerSetCovered> arrayList6 = tL_messages_myStickers.sets;
                    int size2 = arrayList6.size();
                    while (i20 < size2) {
                        TLRPC.StickerSetCovered stickerSetCovered = arrayList6.get(i20);
                        i20++;
                        TLRPC.StickerSetCovered stickerSetCovered2 = stickerSetCovered;
                        TLRPC.StickerSet stickerSet = stickerSetCovered2.set;
                        if (!stickerSet.emojis && !stickerSet.masks) {
                            TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                            tL_inputStickerSetID.id = stickerSetCovered2.set.id;
                            TLRPC.TL_messages_stickerSet m0 = org.telegram.messenger.si.b0(nsVar.r).m0(tL_inputStickerSetID, true);
                            if (m0 == null || m0.documents.size() < 120) {
                                arrayList5.add(stickerSetCovered2);
                            }
                        }
                    }
                    if (tL_messages_myStickers.sets.size() == tL_messages_getMyStickers.limit) {
                        tL_messages_getMyStickers.offset_id = ((TLRPC.StickerSetCovered) i5.c.h(1, tL_messages_myStickers.sets)).set.id;
                        ConnectionsManager.getInstance(nsVar.r).sendRequest(tL_messages_getMyStickers, new z9(nsVar, arrayList5, tL_messages_getMyStickers, 7));
                        break;
                    }
                }
                break;
            case 8:
                yw.J0((yw) obj5, (TLObject) obj3, (TLRPC.UserFull) obj2, (TL_account.TL_birthday) obj, (TLRPC.TL_error) obj4);
                break;
            case 9:
                c40 c40Var = (c40) obj5;
                TLObject tLObject4 = (TLObject) obj2;
                TL_phone.exportGroupCallInvite exportgroupcallinvite = (TL_phone.exportGroupCallInvite) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj4;
                c40Var.getClass();
                ((org.telegram.ui.ActionBar.t1) obj3).dismiss();
                if (tLObject4 instanceof TL_phone.exportedGroupCallInvite) {
                    Context context = c40Var.getContext();
                    int i22 = c40Var.a;
                    TLRPC.InputGroupCall inputGroupCall = exportgroupcallinvite.call;
                    String str5 = ((TL_phone.exportedGroupCallInvite) tLObject4).link;
                    org.telegram.ui.ActionBar.e6 e6Var2 = c40Var.J0;
                    org.telegram.messenger.r3 r3Var = c40Var.V2;
                    i9.n0(context, i22, inputGroupCall, str5, e6Var2, false, (r3Var == null || (groupCall = r3Var.b) == null || !groupCall.creator) ? false : true);
                    break;
                } else if (tL_error3 != null) {
                    new org.telegram.ui.Components.cc(c40Var.F, new fi.i0()).f0(tL_error3, false);
                    break;
                }
                break;
            case 10:
                c40 c40Var2 = (c40) obj5;
                ArrayList arrayList7 = (ArrayList) obj4;
                ArrayList arrayList8 = (ArrayList) obj3;
                ArrayList arrayList9 = (ArrayList) obj2;
                String str6 = (String) obj;
                c40Var2.getClass();
                org.telegram.ui.ActionBar.e2 T2 = LaunchActivity.T();
                if (T2 != null) {
                    ug.j0 j0Var = new ug.j0(34, c40Var2.a, T2.getContext(), T2, new fi.i0());
                    j0Var.C1(null, arrayList7, arrayList8, arrayList9, str6);
                    j0Var.show();
                    break;
                }
                break;
            case 11:
                LaunchActivity launchActivity = (LaunchActivity) obj5;
                g50 g50Var = (g50) obj3;
                TLObject tLObject5 = (TLObject) obj2;
                TLRPC.TL_wallPaper tL_wallPaper2 = (TLRPC.TL_wallPaper) obj;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) obj4;
                String str7 = LaunchActivity.C1;
                try {
                    g50Var.run();
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                }
                if (tLObject5 instanceof TLRPC.TL_wallPaper) {
                    TLRPC.TL_wallPaper tL_wallPaper3 = (TLRPC.TL_wallPaper) tLObject5;
                    if (tL_wallPaper3.pattern) {
                        String str8 = tL_wallPaper3.slug;
                        TLRPC.WallPaperSettings wallPaperSettings = tL_wallPaper2.settings;
                        oc1 oc1Var = new oc1(str8, wallPaperSettings.background_color, wallPaperSettings.second_background_color, wallPaperSettings.third_background_color, wallPaperSettings.fourth_background_color, org.telegram.messenger.g0.s1(wallPaperSettings.rotation, false), r2.intensity / 100.0f, tL_wallPaper2.settings.motion, null);
                        oc1Var.g = tL_wallPaper3;
                        tL_wallPaper3 = oc1Var;
                    }
                    t71 t71Var = new t71(tL_wallPaper3, null, true);
                    TLRPC.WallPaperSettings wallPaperSettings2 = tL_wallPaper2.settings;
                    boolean z10 = wallPaperSettings2.blur;
                    boolean z11 = wallPaperSettings2.motion;
                    float f10 = wallPaperSettings2.intensity;
                    t71Var.H1 = z10;
                    t71Var.G1 = z11;
                    t71Var.p1 = f10;
                    launchActivity.t0(t71Var);
                    break;
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    org.telegram.ui.Cells.y0.r(null, 2131751105, sb2, "\n");
                    sb2.append(tL_error4.text);
                    launchActivity.F0(org.telegram.ui.Components.t4.K(launchActivity, null, sb2.toString()));
                    break;
                }
            case 12:
                LaunchActivity launchActivity2 = (LaunchActivity) obj5;
                yw ywVar = (yw) obj4;
                org.telegram.ui.ActionBar.e2 e2Var = (org.telegram.ui.ActionBar.e2) obj3;
                TLRPC.User user = (TLRPC.User) obj2;
                String str9 = (String) obj;
                ArrayList arrayList10 = launchActivity2.D0;
                if (ywVar != null) {
                    if (e2Var != null) {
                        e2Var.dismissCurrentDialog();
                    }
                    while (i20 < arrayList10.size()) {
                        if (((Dialog) arrayList10.get(i20)).isShowing()) {
                            ((Dialog) arrayList10.get(i20)).dismiss();
                        }
                        i20++;
                    }
                    arrayList10.clear();
                    launchActivity2.t0(ywVar);
                    break;
                } else if (e2Var instanceof an) {
                    ((an) e2Var).za(user.id, str9, true);
                    break;
                }
                break;
            case 13:
                LaunchActivity launchActivity3 = (LaunchActivity) obj5;
                TLObject tLObject6 = (TLObject) obj3;
                TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = (TLRPC.TL_messages_requestUrlAuth) obj2;
                String str10 = (String) obj;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) obj4;
                org.telegram.ui.ActionBar.e2 T3 = LaunchActivity.T();
                if (tLObject6 != null) {
                    if (tLObject6 instanceof TLRPC.TL_urlAuthResultRequest) {
                        di0.b(false, launchActivity3.P, tL_messages_requestUrlAuth, (TLRPC.TL_urlAuthResultRequest) tLObject6, null, null, null, false, null);
                        break;
                    } else if (tLObject6 instanceof TLRPC.TL_urlAuthResultAccepted) {
                        di0.b(false, launchActivity3.P, tL_messages_requestUrlAuth, (TLRPC.TL_urlAuthResultAccepted) tLObject6, null, null, null, false, null);
                        break;
                    } else if (tLObject6 instanceof TLRPC.TL_urlAuthResultDefault) {
                        org.telegram.ui.Components.t4.n0(T3, str10, false, true);
                        break;
                    }
                } else if (tL_error5 != null) {
                    if ("URL_EXPIRED".equalsIgnoreCase(tL_error5.text)) {
                        di0.a().I(R.raw.error, org.telegram.messenger.hd.M0(2131753128, null), org.telegram.messenger.hd.M0(2131753129, null)).j();
                        break;
                    } else {
                        di0.a().f0(tL_error5, false);
                        break;
                    }
                }
                break;
            case 14:
                LaunchActivity launchActivity4 = (LaunchActivity) obj5;
                TLObject tLObject7 = (TLObject) obj3;
                org.telegram.ui.ActionBar.t1 t1Var = (org.telegram.ui.ActionBar.t1) obj2;
                g50 g50Var2 = (g50) obj;
                TLRPC.TL_error tL_error6 = (TLRPC.TL_error) obj4;
                String str11 = LaunchActivity.C1;
                if (tLObject7 instanceof TLRPC.TL_theme) {
                    TLRPC.TL_theme tL_theme = (TLRPC.TL_theme) tLObject7;
                    TLRPC.ThemeSettings themeSettings = tL_theme.settings.size() > 0 ? tL_theme.settings.get(0) : null;
                    if (themeSettings != null) {
                        org.telegram.ui.ActionBar.i6 Q0 = org.telegram.ui.ActionBar.j6.Q0(org.telegram.ui.ActionBar.j6.r0(themeSettings));
                        if (Q0 != null) {
                            TLRPC.WallPaper wallPaper = themeSettings.wallpaper;
                            if (wallPaper instanceof TLRPC.TL_wallPaper) {
                                TLRPC.TL_wallPaper tL_wallPaper4 = (TLRPC.TL_wallPaper) wallPaper;
                                org.telegram.messenger.w7.G(launchActivity4.P);
                                if (!org.telegram.messenger.w7.J(tL_wallPaper4.document, null, true, true).exists()) {
                                    launchActivity4.V0 = t1Var;
                                    launchActivity4.U0 = true;
                                    launchActivity4.S0 = Q0;
                                    launchActivity4.T0 = tL_theme;
                                    launchActivity4.R0 = tL_wallPaper4;
                                    launchActivity4.Q0 = org.telegram.messenger.w7.r(null, tL_wallPaper4.document);
                                    org.telegram.messenger.w7.G(launchActivity4.P).W(tL_wallPaper4.document, tL_wallPaper4, 1, 1);
                                    break;
                                } else {
                                    tL_wallPaper = tL_wallPaper4;
                                }
                            } else {
                                tL_wallPaper = null;
                            }
                            try {
                                g50Var2.run();
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
                            launchActivity4.U0 = false;
                            launchActivity4.T0 = tL_theme;
                            launchActivity4.P0 = org.telegram.messenger.w7.r(null, document);
                            launchActivity4.V0 = t1Var;
                            org.telegram.messenger.w7.G(launchActivity4.P).W(launchActivity4.T0.document, tL_theme, 1, 1);
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
                        g50Var2.run();
                    } catch (Exception e12) {
                        org.telegram.messenger.a8.g(e12, true);
                    }
                    if (i7 == 1) {
                        launchActivity4.F0(org.telegram.ui.Components.t4.K(launchActivity4, org.telegram.messenger.hd.M0(2131744190, null), org.telegram.messenger.hd.M0(2131744173, null)));
                        break;
                    } else {
                        launchActivity4.F0(org.telegram.ui.Components.t4.K(launchActivity4, org.telegram.messenger.hd.M0(2131744190, null), org.telegram.messenger.hd.M0(2131744174, null)));
                        break;
                    }
                }
                break;
            case 15:
                q90 q90Var = (q90) obj5;
                TLRPC.TL_error tL_error7 = (TLRPC.TL_error) obj4;
                TLObject tLObject8 = (TLObject) obj3;
                TLRPC.TL_inputInvoiceSlug tL_inputInvoiceSlug = (TLRPC.TL_inputInvoiceSlug) obj2;
                String str12 = (String) obj;
                int i23 = q90Var.b;
                LaunchActivity launchActivity5 = q90Var.a;
                if (tL_error7 != null) {
                    if ("SUBSCRIPTION_ALREADY_ACTIVE".equalsIgnoreCase(tL_error7.text)) {
                        d = q90.d();
                        i10 = 2131747395;
                    } else {
                        d = q90.d();
                        i10 = 2131747396;
                    }
                    org.telegram.messenger.k5.o(null, i10, d, null);
                } else if (!launchActivity5.isFinishing()) {
                    if (tLObject8 instanceof TLRPC.TL_payments_paymentFormStars) {
                        bi.h6 h6Var = launchActivity5.Y0;
                        launchActivity5.Y0 = null;
                        di.v8.y(i23, false).X(null, tL_inputInvoiceSlug, (TLRPC.TL_payments_paymentFormStars) tLObject8, new l90(q90Var, 1), new j70(h6Var, i19));
                        break;
                    } else {
                        if (tLObject8 instanceof TLRPC.PaymentForm) {
                            TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject8;
                            org.telegram.messenger.np.s1(i23).Y3(paymentForm.users, false);
                            jl0Var = new jl0(paymentForm, null, str12, LaunchActivity.T());
                        } else {
                            jl0Var = tLObject8 instanceof TLRPC.PaymentReceipt ? new jl0((TLRPC.PaymentReceipt) tLObject8) : null;
                        }
                        if (jl0Var != null) {
                            bi.h6 h6Var2 = launchActivity5.Y0;
                            if (h6Var2 != null) {
                                launchActivity5.Y0 = null;
                                jl0Var.a1 = new te(i18, h6Var2);
                            }
                            q90Var.u(jl0Var, false);
                        }
                    }
                }
                q90Var.c();
                break;
            case 16:
                ce0.b0((ce0) obj5, (TLRPC.TL_error) obj4, (String) obj3, (String) obj2, (String) obj);
                break;
            case 17:
                TLObject tLObject9 = (TLObject) obj3;
                Bundle bundle = (Bundle) obj2;
                TLRPC.TL_error tL_error8 = (TLRPC.TL_error) obj4;
                TLRPC.TL_auth_resendCode tL_auth_resendCode = (TLRPC.TL_auth_resendCode) obj;
                ce0 ce0Var = ((ob0) obj5).a0;
                if (tLObject9 instanceof TLRPC.TL_auth_sentCode) {
                    ce0Var.y1(bundle, (TLRPC.TL_auth_sentCode) tLObject9, true);
                    break;
                } else if (tL_error8 != null && tL_error8.text != null) {
                    i11 = ((org.telegram.ui.ActionBar.e2) ce0Var).currentAccount;
                    org.telegram.ui.Components.t4.c0(i11, tL_error8, ce0Var, tL_auth_resendCode, new Object[0]);
                    break;
                }
                break;
            case 18:
                rc0 rc0Var = (rc0) obj5;
                TLObject tLObject10 = (TLObject) obj3;
                Bundle bundle2 = (Bundle) obj2;
                TLRPC.TL_error tL_error9 = (TLRPC.TL_error) obj4;
                TL_account.sendVerifyEmailCode sendverifyemailcode = (TL_account.sendVerifyEmailCode) obj;
                ce0 ce0Var2 = rc0Var.F;
                ce0Var2.C1(false, true);
                rc0Var.r = false;
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
                            rc0Var.n();
                            break;
                        } else if (tL_error9.text.contains("EMAIL_NOT_ALLOWED")) {
                            ce0Var2.D1(org.telegram.messenger.hd.M0(2131746071, null), org.telegram.messenger.hd.M0(2131751200, null));
                            break;
                        } else if (tL_error9.text.contains("PHONE_PASSWORD_FLOOD")) {
                            ce0Var2.D1(org.telegram.messenger.hd.M0(2131746071, null), org.telegram.messenger.hd.M0(2131750687, "FloodWait"));
                            break;
                        } else if (tL_error9.text.contains("PHONE_NUMBER_FLOOD")) {
                            ce0Var2.D1(org.telegram.messenger.hd.M0(2131746071, null), org.telegram.messenger.hd.M0(2131747286, "PhoneNumberFlood"));
                            break;
                        } else if (!tL_error9.text.contains("PHONE_CODE_EMPTY") && !tL_error9.text.contains("PHONE_CODE_INVALID")) {
                            if (tL_error9.text.contains("PHONE_CODE_EXPIRED")) {
                                ce0Var2.M1(0, true, null, true);
                                ce0Var2.D1(org.telegram.messenger.hd.M0(2131746071, null), org.telegram.messenger.hd.M0(2131752021, "CodeExpired"));
                                break;
                            } else if (tL_error9.text.startsWith("FLOOD_WAIT")) {
                                ce0Var2.D1(org.telegram.messenger.hd.M0(2131746071, null), org.telegram.messenger.hd.M0(2131750687, "FloodWait"));
                                break;
                            } else if (tL_error9.code != -1000) {
                                i12 = ((org.telegram.ui.ActionBar.e2) ce0Var2).currentAccount;
                                org.telegram.ui.Components.t4.c0(i12, tL_error9, ce0Var2, sendverifyemailcode, rc0Var.x);
                                break;
                            }
                        } else {
                            ce0Var2.D1(org.telegram.messenger.hd.M0(2131746071, null), org.telegram.messenger.hd.M0(2131749183, "InvalidCode"));
                            break;
                        }
                    }
                }
                break;
            case 19:
                TLObject tLObject11 = (TLObject) obj3;
                Bundle bundle3 = (Bundle) obj2;
                TLRPC.TL_error tL_error10 = (TLRPC.TL_error) obj4;
                TL_account.verifyEmail verifyemail = (TL_account.verifyEmail) obj;
                ce0 ce0Var3 = ((rc0) obj5).F;
                if (!(tLObject11 instanceof TL_account.TL_emailVerified) || ce0Var3.G != 3) {
                    if (tLObject11 instanceof TL_account.TL_emailVerifiedLogin) {
                        TL_account.TL_emailVerifiedLogin tL_emailVerifiedLogin = (TL_account.TL_emailVerifiedLogin) tLObject11;
                        bundle3.putString("email", tL_emailVerifiedLogin.email);
                        ce0Var3.y1(bundle3, tL_emailVerifiedLogin.sent_code, true);
                        break;
                    } else if (tL_error10 != null) {
                        if (tL_error10.text.contains("EMAIL_NOT_ALLOWED")) {
                            ce0Var3.D1(org.telegram.messenger.hd.M0(2131746071, null), org.telegram.messenger.hd.M0(2131751200, null));
                            break;
                        } else if (tL_error10.text.contains("EMAIL_TOKEN_INVALID")) {
                            ce0Var3.D1(org.telegram.messenger.hd.M0(2131746071, null), org.telegram.messenger.hd.M0(2131751197, null));
                            break;
                        } else if (tL_error10.code != -1000) {
                            i13 = ((org.telegram.ui.ActionBar.e2) ce0Var3).currentAccount;
                            org.telegram.ui.Components.t4.c0(i13, tL_error10, ce0Var3, verifyemail, new Object[0]);
                            break;
                        }
                    }
                } else {
                    ce0Var3.finishFragment();
                    ce0Var3.e0.run();
                    break;
                }
                break;
            case 20:
                final kd0 kd0Var = (kd0) obj5;
                TLObject tLObject12 = (TLObject) obj3;
                TLRPC.TL_inputInvoicePremiumAuthCode tL_inputInvoicePremiumAuthCode = (TLRPC.TL_inputInvoicePremiumAuthCode) obj2;
                final TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode = (TLRPC.TL_inputStorePaymentAuthCode) obj;
                TLRPC.TL_error tL_error11 = (TLRPC.TL_error) obj4;
                ce0 ce0Var4 = kd0Var.w;
                kd0Var.b.setLoading(false);
                if (tLObject12 instanceof TLRPC.PaymentForm) {
                    final TLRPC.PaymentForm paymentForm2 = (TLRPC.PaymentForm) tLObject12;
                    ce0Var4.getMessagesController().Y3(paymentForm2.users, false);
                    jl0 jl0Var2 = new jl0(tL_inputInvoicePremiumAuthCode, paymentForm2, null, null, 4, null, null, null, null, null, null, false, null, ce0Var4, true);
                    jl0Var2.W0 = true;
                    jl0Var2.d1 = new org.telegram.messenger.z10() { // from class: org.telegram.ui.gd0
                        @Override // org.telegram.messenger.z10
                        public final void a(Object obj7) {
                            switch (i20) {
                                case 0:
                                    final int i24 = 0;
                                    final kd0 kd0Var2 = kd0Var;
                                    final TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode2 = tL_inputStorePaymentAuthCode;
                                    final TLRPC.PaymentForm paymentForm3 = paymentForm2;
                                    org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.hd0
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i24) {
                                                case 0:
                                                    TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode3 = tL_inputStorePaymentAuthCode2;
                                                    String str14 = tL_inputStorePaymentAuthCode3.phone_number;
                                                    String str15 = tL_inputStorePaymentAuthCode3.phone_code_hash;
                                                    long j3 = paymentForm3.form_id;
                                                    kd0 kd0Var3 = kd0Var2;
                                                    if (!kd0Var3.f) {
                                                        kd0Var3.f = true;
                                                        kd0Var3.h = str14;
                                                        kd0Var3.n = str15;
                                                        kd0Var3.r = j3;
                                                        kd0Var3.b.setLoading(true);
                                                        kd0Var3.o();
                                                        break;
                                                    }
                                                    break;
                                                default:
                                                    TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode4 = tL_inputStorePaymentAuthCode2;
                                                    String str16 = tL_inputStorePaymentAuthCode4.phone_number;
                                                    String str17 = tL_inputStorePaymentAuthCode4.phone_code_hash;
                                                    long j10 = paymentForm3.form_id;
                                                    kd0 kd0Var4 = kd0Var2;
                                                    if (!kd0Var4.f) {
                                                        kd0Var4.f = true;
                                                        kd0Var4.h = str16;
                                                        kd0Var4.n = str17;
                                                        kd0Var4.r = j10;
                                                        kd0Var4.b.setLoading(true);
                                                        kd0Var4.o();
                                                        break;
                                                    }
                                                    break;
                                            }
                                        }
                                    });
                                    break;
                                default:
                                    final int i25 = 1;
                                    final kd0 kd0Var3 = kd0Var;
                                    final TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode3 = tL_inputStorePaymentAuthCode;
                                    final TLRPC.PaymentForm paymentForm4 = paymentForm2;
                                    org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.hd0
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i25) {
                                                case 0:
                                                    TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode32 = tL_inputStorePaymentAuthCode3;
                                                    String str14 = tL_inputStorePaymentAuthCode32.phone_number;
                                                    String str15 = tL_inputStorePaymentAuthCode32.phone_code_hash;
                                                    long j3 = paymentForm4.form_id;
                                                    kd0 kd0Var32 = kd0Var3;
                                                    if (!kd0Var32.f) {
                                                        kd0Var32.f = true;
                                                        kd0Var32.h = str14;
                                                        kd0Var32.n = str15;
                                                        kd0Var32.r = j3;
                                                        kd0Var32.b.setLoading(true);
                                                        kd0Var32.o();
                                                        break;
                                                    }
                                                    break;
                                                default:
                                                    TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode4 = tL_inputStorePaymentAuthCode3;
                                                    String str16 = tL_inputStorePaymentAuthCode4.phone_number;
                                                    String str17 = tL_inputStorePaymentAuthCode4.phone_code_hash;
                                                    long j10 = paymentForm4.form_id;
                                                    kd0 kd0Var4 = kd0Var3;
                                                    if (!kd0Var4.f) {
                                                        kd0Var4.f = true;
                                                        kd0Var4.h = str16;
                                                        kd0Var4.n = str17;
                                                        kd0Var4.r = j10;
                                                        kd0Var4.b.setLoading(true);
                                                        kd0Var4.o();
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
                    jl0Var2.e1 = new org.telegram.messenger.z10() { // from class: org.telegram.ui.gd0
                        @Override // org.telegram.messenger.z10
                        public final void a(Object obj7) {
                            switch (i19) {
                                case 0:
                                    final int i24 = 0;
                                    final kd0 kd0Var2 = kd0Var;
                                    final TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode2 = tL_inputStorePaymentAuthCode;
                                    final TLRPC.PaymentForm paymentForm3 = paymentForm2;
                                    org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.hd0
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i24) {
                                                case 0:
                                                    TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode32 = tL_inputStorePaymentAuthCode2;
                                                    String str14 = tL_inputStorePaymentAuthCode32.phone_number;
                                                    String str15 = tL_inputStorePaymentAuthCode32.phone_code_hash;
                                                    long j3 = paymentForm3.form_id;
                                                    kd0 kd0Var32 = kd0Var2;
                                                    if (!kd0Var32.f) {
                                                        kd0Var32.f = true;
                                                        kd0Var32.h = str14;
                                                        kd0Var32.n = str15;
                                                        kd0Var32.r = j3;
                                                        kd0Var32.b.setLoading(true);
                                                        kd0Var32.o();
                                                        break;
                                                    }
                                                    break;
                                                default:
                                                    TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode4 = tL_inputStorePaymentAuthCode2;
                                                    String str16 = tL_inputStorePaymentAuthCode4.phone_number;
                                                    String str17 = tL_inputStorePaymentAuthCode4.phone_code_hash;
                                                    long j10 = paymentForm3.form_id;
                                                    kd0 kd0Var4 = kd0Var2;
                                                    if (!kd0Var4.f) {
                                                        kd0Var4.f = true;
                                                        kd0Var4.h = str16;
                                                        kd0Var4.n = str17;
                                                        kd0Var4.r = j10;
                                                        kd0Var4.b.setLoading(true);
                                                        kd0Var4.o();
                                                        break;
                                                    }
                                                    break;
                                            }
                                        }
                                    });
                                    break;
                                default:
                                    final int i25 = 1;
                                    final kd0 kd0Var3 = kd0Var;
                                    final TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode3 = tL_inputStorePaymentAuthCode;
                                    final TLRPC.PaymentForm paymentForm4 = paymentForm2;
                                    org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.hd0
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i25) {
                                                case 0:
                                                    TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode32 = tL_inputStorePaymentAuthCode3;
                                                    String str14 = tL_inputStorePaymentAuthCode32.phone_number;
                                                    String str15 = tL_inputStorePaymentAuthCode32.phone_code_hash;
                                                    long j3 = paymentForm4.form_id;
                                                    kd0 kd0Var32 = kd0Var3;
                                                    if (!kd0Var32.f) {
                                                        kd0Var32.f = true;
                                                        kd0Var32.h = str14;
                                                        kd0Var32.n = str15;
                                                        kd0Var32.r = j3;
                                                        kd0Var32.b.setLoading(true);
                                                        kd0Var32.o();
                                                        break;
                                                    }
                                                    break;
                                                default:
                                                    TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode4 = tL_inputStorePaymentAuthCode3;
                                                    String str16 = tL_inputStorePaymentAuthCode4.phone_number;
                                                    String str17 = tL_inputStorePaymentAuthCode4.phone_code_hash;
                                                    long j10 = paymentForm4.form_id;
                                                    kd0 kd0Var4 = kd0Var3;
                                                    if (!kd0Var4.f) {
                                                        kd0Var4.f = true;
                                                        kd0Var4.h = str16;
                                                        kd0Var4.n = str17;
                                                        kd0Var4.r = j10;
                                                        kd0Var4.b.setLoading(true);
                                                        kd0Var4.o();
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
                    jl0Var2.f1 = new l00(kd0Var, i19);
                    ce0Var4.presentFragment(jl0Var2);
                    break;
                } else if (tL_error11 != null) {
                    if ("PHONE_CODE_EXPIRED".equalsIgnoreCase(tL_error11.text)) {
                        org.telegram.messenger.g0.h3(new fd0(kd0Var, 2));
                        break;
                    } else {
                        String str14 = tL_error11.text;
                        kd0Var.e = str14;
                        new org.telegram.ui.Components.cc(ce0Var4.a0, null).H(R.raw.error, org.telegram.messenger.hd.a0(null, null, 2131743878, str14));
                        break;
                    }
                } else {
                    new org.telegram.ui.Components.cc(ce0Var4.a0, null).H(R.raw.error, org.telegram.messenger.hd.M0(2131743879, null));
                    break;
                }
            case 21:
                jg0 jg0Var = (jg0) obj5;
                TLRPC.TL_error tL_error12 = (TLRPC.TL_error) obj4;
                mg.b bVar = (mg.b) obj3;
                String str15 = (String) obj2;
                TL_stats.TL_loadAsyncGraph tL_loadAsyncGraph = (TL_stats.TL_loadAsyncGraph) obj;
                jg0Var.E = true;
                if (tL_error12 != null || bVar == null) {
                    jg0Var.m0();
                    break;
                } else {
                    jg0Var.w.l(str15, bVar);
                    l41 l41Var = jg0Var.r;
                    l41Var.e = bVar;
                    l41Var.c = tL_loadAsyncGraph.x;
                    jg0Var.m0();
                    break;
                }
            case 22:
                bh0 bh0Var = (bh0) obj5;
                TLRPC.TL_contacts_importedContacts tL_contacts_importedContacts = (TLRPC.TL_contacts_importedContacts) obj3;
                TLRPC.TL_inputPhoneContact tL_inputPhoneContact = (TLRPC.TL_inputPhoneContact) obj2;
                TLRPC.TL_error tL_error13 = (TLRPC.TL_error) obj4;
                TLRPC.TL_contacts_importContacts tL_contacts_importContacts = (TLRPC.TL_contacts_importContacts) obj;
                org.telegram.ui.ActionBar.e2 e2Var2 = bh0Var.G1;
                bh0Var.B1 = false;
                if (tL_contacts_importedContacts == null) {
                    org.telegram.messenger.g0.Y3(bh0Var.R1, true, 0.5f, true, true);
                    org.telegram.messenger.g0.Y3(bh0Var.S1, false, 0.5f, true, true);
                    org.telegram.ui.Components.t4.c0(bh0Var.a, tL_error13, e2Var2, tL_contacts_importContacts, new Object[0]);
                    break;
                } else if (!tL_contacts_importedContacts.users.isEmpty()) {
                    org.telegram.messenger.np.s1(bh0Var.a).Y3(tL_contacts_importedContacts.users, false);
                    org.telegram.messenger.np.s1(bh0Var.a).z3(tL_contacts_importedContacts.users.get(0), null, e2Var2, 1);
                    bh0Var.dismiss();
                    break;
                } else if (e2Var2.getParentActivity() != null) {
                    org.telegram.messenger.g0.Y3(bh0Var.R1, true, 0.5f, true, true);
                    org.telegram.messenger.g0.Y3(bh0Var.S1, false, 0.5f, true, true);
                    org.telegram.ui.Components.t4.u(e2Var2, tL_inputPhoneContact.first_name, tL_inputPhoneContact.last_name, tL_inputPhoneContact.phone);
                    break;
                }
                break;
            case 23:
                TLRPC.TL_error tL_error14 = (TLRPC.TL_error) obj4;
                ef0 ef0Var = (ef0) obj3;
                k8.a aVar = (k8.a) obj2;
                TL_account.verifyEmail verifyemail2 = (TL_account.verifyEmail) obj;
                ek0 ek0Var = ((nj0) obj5).a;
                if (tL_error14 == null) {
                    ((jj0) ek0Var.C1).c(ek0Var.F, (String) ek0Var.t1.get("email"), null, null, null, null, null, null, null, null, ef0Var, aVar);
                    break;
                } else {
                    i14 = ((org.telegram.ui.ActionBar.e2) ek0Var).currentAccount;
                    org.telegram.ui.Components.t4.c0(i14, tL_error14, ek0Var, verifyemail2, new Object[0]);
                    aVar.d(null, null);
                    break;
                }
            case 24:
                ak0 ak0Var = (ak0) obj5;
                TLRPC.TL_error tL_error15 = (TLRPC.TL_error) obj4;
                Bundle bundle4 = (Bundle) obj3;
                TLObject tLObject13 = (TLObject) obj2;
                TLRPC.TL_auth_resendCode tL_auth_resendCode2 = (TLRPC.TL_auth_resendCode) obj;
                ek0 ek0Var2 = ak0Var.R;
                ak0Var.K = false;
                if (tL_error15 == null) {
                    ek0Var2.p1(bundle4, (TLRPC.TL_auth_sentCode) tLObject13, true);
                } else {
                    i15 = ((org.telegram.ui.ActionBar.e2) ek0Var2).currentAccount;
                    org.telegram.ui.ActionBar.t1 c02 = org.telegram.ui.Components.t4.c0(i15, tL_error15, ek0Var2, tL_auth_resendCode2, new Object[0]);
                    if (c02 != null && tL_error15.text.contains("PHONE_CODE_EXPIRED")) {
                        c02.n0 = new wj0(ak0Var, i20);
                    }
                }
                ek0Var2.B1();
                break;
            case 25:
                jl0.k0((jl0) obj5, (TLRPC.TL_error) obj4, (TLObject) obj3, (String) obj2, (TL_account.getPassword) obj);
                break;
            case 26:
                ClippingImageView[] clippingImageViewArr = (ClippingImageView[]) obj4;
                ArrayList arrayList11 = (ArrayList) obj3;
                Integer num = (Integer) obj2;
                sq0 sq0Var2 = (sq0) obj;
                PhotoViewer photoViewer = ((yp0) obj5).r;
                photoViewer.p4 = null;
                oq0 oq0Var = photoViewer.f0;
                if (oq0Var != null && photoViewer.h0 != null) {
                    oq0Var.setLayerType(0, null);
                    photoViewer.n4 = 0;
                    photoViewer.D1();
                    photoViewer.o4 = 0L;
                    photoViewer.H1 = null;
                    photoViewer.F1.a = false;
                    photoViewer.I1 = null;
                    photoViewer.G1.a = false;
                    photoViewer.B2();
                    photoViewer.x2();
                    photoViewer.f0.invalidate();
                    for (ClippingImageView clippingImageView : clippingImageViewArr) {
                        clippingImageView.setVisibility(8);
                    }
                    uq0 uq0Var = photoViewer.q4;
                    if (uq0Var != null) {
                        uq0Var.a.O0(true, true);
                    }
                    uq0 uq0Var2 = photoViewer.r4;
                    if (uq0Var2 != null && !uq0Var2.s) {
                        uq0Var2.a.O0(false, true);
                    }
                    if (arrayList11 != null && (i16 = photoViewer.d2) != 3 && i16 != 1 && ((sq0Var = photoViewer.d) == null || !sq0Var.P())) {
                        photoViewer.Q1();
                    }
                    org.telegram.ui.Components.u51 u51Var = photoViewer.G2;
                    if (u51Var != null && u51Var.d0() && photoViewer.s1 && !photoViewer.g7.isEmpty()) {
                        PhotoViewer.S(photoViewer, photoViewer.G2.S());
                        PhotoViewer.R(photoViewer, true);
                    }
                    if (photoViewer.t4) {
                        PhotoViewer.T(photoViewer, num.intValue());
                    }
                    if (sq0Var2 != null) {
                        sq0Var2.d();
                        break;
                    }
                }
                break;
            case 27:
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
            case 28:
                TLRPC.UserFull userFull2 = (TLRPC.UserFull) obj2;
                TL_account.TL_birthday tL_birthday2 = (TL_account.TL_birthday) obj;
                TLRPC.TL_error tL_error16 = (TLRPC.TL_error) obj4;
                PrivacyControlActivity privacyControlActivity2 = ((ht0) obj5).d;
                if (((TLObject) obj3) instanceof TLRPC.TL_boolTrue) {
                    org.telegram.ui.Components.xb Q = org.telegram.ui.Components.cc.a0(privacyControlActivity2).Q(R.raw.contact_check, 36, org.telegram.messenger.hd.M0(2131746856, null));
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
                            e6Var = ((org.telegram.ui.ActionBar.e2) privacyControlActivity2).resourceProvider;
                            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(0, parentActivity, e6Var);
                            String M0 = org.telegram.messenger.hd.M0(2131746852, null);
                            org.telegram.ui.ActionBar.t1 t1Var2 = alertDialog$Builder2.a;
                            t1Var2.S = M0;
                            t1Var2.U = org.telegram.messenger.hd.M0(2131746853, null);
                            alertDialog$Builder2.k(org.telegram.messenger.hd.M0(2131747831, null), null);
                            privacyControlActivity2.showDialog(t1Var2);
                            break;
                        }
                    } else {
                        org.telegram.messenger.k5.n(null, 2131743879, org.telegram.ui.Components.cc.a0(privacyControlActivity2), R.raw.error, 36);
                        break;
                    }
                }
                break;
            default:
                ProfileActivity profileActivity = (ProfileActivity) obj5;
                TLRPC.ChatParticipant chatParticipant = (TLRPC.ChatParticipant) obj3;
                TLRPC.User user2 = (TLRPC.User) obj2;
                rt0 rt0Var = (rt0) obj;
                RectF rectF = ProfileActivity.X6;
                if (!(((TLRPC.ChannelParticipant) obj4) instanceof TLRPC.TL_channelParticipantAdmin) && !(chatParticipant instanceof TLRPC.TL_chatParticipantAdmin)) {
                    rt0Var.a(1);
                    break;
                } else {
                    AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(0, profileActivity.getParentActivity(), profileActivity.A0);
                    String M02 = org.telegram.messenger.hd.M0(R.string.AppName, null);
                    org.telegram.ui.ActionBar.t1 t1Var3 = alertDialog$Builder3.a;
                    t1Var3.S = M02;
                    t1Var3.U = org.telegram.messenger.hd.a0(null, null, 2131754350, org.telegram.messenger.g5.m(0, user2.first_name, user2.last_name));
                    alertDialog$Builder3.k(org.telegram.messenger.hd.M0(2131747831, null), new ni0(rt0Var, i18));
                    alertDialog$Builder3.h(org.telegram.messenger.hd.M0(2131752589, null), null);
                    profileActivity.showDialog(t1Var3);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ hp(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i7) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
    }

    public /* synthetic */ hp(Object obj, Object obj2, Object obj3, Object obj4, TLRPC.TL_error tL_error, int i7) {
        this.a = i7;
        this.b = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
        this.c = tL_error;
    }

    public /* synthetic */ hp(org.telegram.ui.Components.bw0 bw0Var, String str, TLRPC.TL_error tL_error, TLObject tLObject, TextView textView) {
        this.a = 4;
        this.b = bw0Var;
        this.d = str;
        this.c = tL_error;
        this.e = tLObject;
        this.f = textView;
    }
}
