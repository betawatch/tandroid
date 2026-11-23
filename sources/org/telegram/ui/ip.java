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

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class ip implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ ip(KeyEvent.Callback callback, TLObject tLObject, Object obj, TLRPC.TL_error tL_error, TLObject tLObject2, int i7) {
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
        kl0 kl0Var;
        org.telegram.ui.Components.kc d;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        uq0 uq0Var;
        String str2;
        org.telegram.ui.ActionBar.i6 i6Var;
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
                np.d0((np) obj5, (TLRPC.TL_error) obj4, (TLRPC.InputCheckPasswordSRP) obj3, (TwoStepVerificationActivity) obj2, (TLRPC.TL_channels_editCreator) obj);
                break;
            case 1:
                qq qqVar = (qq) obj5;
                ArrayList arrayList = (ArrayList) obj4;
                a0.h hVar = (a0.h) obj3;
                ArrayList arrayList2 = (ArrayList) obj2;
                ArrayList arrayList3 = (ArrayList) obj;
                jg.z1 z1Var = qqVar.h;
                rq rqVar = qqVar.E;
                if (rqVar.o1) {
                    qqVar.s = false;
                    qqVar.d = arrayList;
                    qqVar.e = hVar;
                    qqVar.f = arrayList2;
                    z1Var.f(arrayList, null);
                    if (!org.telegram.messenger.v3.T(rqVar.n)) {
                        ArrayList arrayList4 = z1Var.g;
                        arrayList4.clear();
                        arrayList4.addAll(arrayList3);
                    }
                    int i21 = qqVar.r;
                    qqVar.f();
                    if (qqVar.r > i21) {
                        rqVar.D0(i21);
                    }
                    if (!z1Var.e() && qqVar.r == 0) {
                        rqVar.b.e(false, true);
                        break;
                    }
                }
                break;
            case 2:
                org.telegram.ui.Components.qf qfVar = (org.telegram.ui.Components.qf) obj5;
                ji.o oVar = (ji.o) obj4;
                ji.h hVar2 = (ji.h) obj2;
                ji.q qVar = (ji.q) obj;
                ChatActivityEnterView chatActivityEnterView = qfVar.a;
                org.telegram.ui.Components.oe0 a82 = chatActivityEnterView.F3.a8(oVar, (org.telegram.ui.Cells.aa) obj3);
                if (a82 == null) {
                    org.telegram.messenger.g0.E2(oVar);
                    break;
                } else {
                    int G0 = chatActivityEnterView.G0(org.telegram.ui.ActionBar.n6.E8);
                    ArrayList H = chatActivityEnterView.A0().H();
                    int size = H.size();
                    while (i20 < size) {
                        Object obj6 = H.get(i20);
                        i20++;
                        ai.c cVar = (ai.c) obj6;
                        a82.c(new ai.k0(chatActivityEnterView.getContext(), cVar, G0, chatActivityEnterView.R, false), 48, new org.telegram.ui.Components.xd(i19, hVar2, cVar));
                    }
                    int i22 = 2;
                    a82.J = new org.telegram.ui.Components.xd(i22, qfVar, oVar);
                    chatActivityEnterView.t1 = true;
                    ChatActivityEnterView.RecordCircle recordCircle = chatActivityEnterView.D2;
                    if (recordCircle != null) {
                        recordCircle.invalidate();
                    }
                    Objects.requireNonNull(qVar);
                    a82.K = new org.telegram.ui.Components.y2(qVar, i22);
                    int[] iArr = new int[2];
                    chatActivityEnterView.getLocationInWindow(iArr);
                    a82.F = iArr[1];
                    a82.H = org.telegram.messenger.g0.L(org.telegram.messenger.ks.n5);
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
                org.telegram.ui.Components.jw0 jw0Var = (org.telegram.ui.Components.jw0) obj5;
                String str3 = (String) obj3;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj4;
                TLObject tLObject = (TLObject) obj2;
                TextView textView = (TextView) obj;
                jw0Var.k2 = 0;
                String str4 = jw0Var.j2;
                if (str4 != null && str4.equals(str3)) {
                    if (tL_error != null || !(tLObject instanceof TLRPC.TL_boolTrue)) {
                        textView.setText(org.telegram.messenger.gd.N0(2131749037, null));
                        org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.p7, jw0Var.J0);
                        jw0Var.l2 = false;
                        break;
                    } else {
                        textView.setText(org.telegram.messenger.gd.N0(2131749042, null));
                        org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.w6, jw0Var.J0);
                        jw0Var.l2 = true;
                        break;
                    }
                }
                break;
            case 5:
                org.telegram.ui.Components.uw0 uw0Var = (org.telegram.ui.Components.uw0) obj5;
                TLObject tLObject2 = (TLObject) obj3;
                TLRPC.UserFull userFull = (TLRPC.UserFull) obj2;
                TL_account.TL_birthday tL_birthday = (TL_account.TL_birthday) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj4;
                org.telegram.ui.ActionBar.g2 T = LaunchActivity.T();
                if (T != null) {
                    if (tLObject2 instanceof TLRPC.TL_boolTrue) {
                        org.telegram.ui.Components.fc I = org.telegram.ui.Components.kc.b0(T).I(R.raw.gift, org.telegram.messenger.gd.N0(2131746662, null), org.telegram.messenger.gd.N0(2131746661, null));
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
                            org.telegram.messenger.tr.a0(uw0Var.a).j2(userFull, false);
                        }
                        if (tL_error2 != null && (str = tL_error2.text) != null && str.startsWith("FLOOD_WAIT_")) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(uw0Var.b.getContext());
                            alertDialog$Builder.a.S = org.telegram.messenger.gd.N0(2131746658, null);
                            alertDialog$Builder.a.U = org.telegram.messenger.gd.N0(2131746659, null);
                            org.telegram.messenger.f3.m(null, 2131747637, alertDialog$Builder, null);
                            break;
                        } else {
                            org.telegram.messenger.f3.n(null, 2131743632, org.telegram.ui.Components.kc.b0(T), R.raw.error, 36);
                            break;
                        }
                    }
                }
                break;
            case 6:
                org.telegram.ui.Components.z11 z11Var = (org.telegram.ui.Components.z11) obj5;
                TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) obj3;
                org.telegram.ui.Components.x60 x60Var = (org.telegram.ui.Components.x60) obj2;
                org.telegram.ui.Components.x60 x60Var2 = (org.telegram.ui.Components.x60) obj;
                bn bnVar = z11Var.s;
                if (((org.telegram.messenger.mp) obj4).u2(z11Var.f, tL_forumTopic.id, null)) {
                    x60Var.v();
                    org.telegram.messenger.xs.t(z11Var.e).G(z11Var.f, tL_forumTopic.id, false);
                    if (org.telegram.ui.Components.kc.a(bnVar)) {
                        org.telegram.ui.Components.kc.z(bnVar, 4, 0, z11Var.h).j();
                        break;
                    }
                } else {
                    x60Var.L(x60Var2);
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
                            TLRPC.TL_messages_stickerSet o02 = org.telegram.messenger.ri.d0(nsVar.r).o0(tL_inputStickerSetID, true);
                            if (o02 == null || o02.documents.size() < 120) {
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
                bx.l0((bx) obj5, (TLObject) obj3, (TLRPC.UserFull) obj2, (TL_account.TL_birthday) obj, (TLRPC.TL_error) obj4);
                break;
            case 9:
                e40 e40Var = (e40) obj5;
                TLObject tLObject4 = (TLObject) obj2;
                TL_phone.exportGroupCallInvite exportgroupcallinvite = (TL_phone.exportGroupCallInvite) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj4;
                e40Var.getClass();
                ((org.telegram.ui.ActionBar.t1) obj3).dismiss();
                if (tLObject4 instanceof TL_phone.exportedGroupCallInvite) {
                    Context context = e40Var.getContext();
                    int i23 = e40Var.a;
                    TLRPC.InputGroupCall inputGroupCall = exportgroupcallinvite.call;
                    String str5 = ((TL_phone.exportedGroupCallInvite) tLObject4).link;
                    org.telegram.ui.ActionBar.i6 i6Var2 = e40Var.J0;
                    org.telegram.messenger.t3 t3Var = e40Var.V2;
                    j9.n0(context, i23, inputGroupCall, str5, i6Var2, false, (t3Var == null || (groupCall = t3Var.b) == null || !groupCall.creator) ? false : true);
                    break;
                } else if (tL_error3 != null) {
                    new org.telegram.ui.Components.kc(e40Var.F, new fi.h0()).g0(tL_error3, false);
                    break;
                }
                break;
            case 10:
                e40 e40Var2 = (e40) obj5;
                ArrayList arrayList7 = (ArrayList) obj4;
                ArrayList arrayList8 = (ArrayList) obj3;
                ArrayList arrayList9 = (ArrayList) obj2;
                String str6 = (String) obj;
                e40Var2.getClass();
                org.telegram.ui.ActionBar.g2 T2 = LaunchActivity.T();
                if (T2 != null) {
                    ug.k0 k0Var = new ug.k0(34, e40Var2.a, T2.getContext(), T2, new fi.h0());
                    k0Var.D1(null, arrayList7, arrayList8, arrayList9, str6);
                    k0Var.show();
                    break;
                }
                break;
            case 11:
                LaunchActivity launchActivity = (LaunchActivity) obj5;
                i50 i50Var = (i50) obj3;
                TLObject tLObject5 = (TLObject) obj2;
                TLRPC.TL_wallPaper tL_wallPaper2 = (TLRPC.TL_wallPaper) obj;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) obj4;
                String str7 = LaunchActivity.C1;
                try {
                    i50Var.run();
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
                    boolean z10 = wallPaperSettings2.blur;
                    boolean z11 = wallPaperSettings2.motion;
                    float f10 = wallPaperSettings2.intensity;
                    v71Var.H1 = z10;
                    v71Var.G1 = z11;
                    v71Var.p1 = f10;
                    launchActivity.t0(v71Var);
                    break;
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    org.telegram.ui.Cells.c0.u(null, 2131751093, sb2, "\n");
                    sb2.append(tL_error4.text);
                    launchActivity.F0(org.telegram.ui.Components.b5.K(launchActivity, null, sb2.toString()));
                    break;
                }
            case 12:
                LaunchActivity launchActivity2 = (LaunchActivity) obj5;
                bx bxVar = (bx) obj4;
                org.telegram.ui.ActionBar.g2 g2Var = (org.telegram.ui.ActionBar.g2) obj3;
                TLRPC.User user = (TLRPC.User) obj2;
                String str9 = (String) obj;
                ArrayList arrayList10 = launchActivity2.D0;
                if (bxVar != null) {
                    if (g2Var != null) {
                        g2Var.dismissCurrentDialog();
                    }
                    while (i20 < arrayList10.size()) {
                        if (((Dialog) arrayList10.get(i20)).isShowing()) {
                            ((Dialog) arrayList10.get(i20)).dismiss();
                        }
                        i20++;
                    }
                    arrayList10.clear();
                    launchActivity2.t0(bxVar);
                    break;
                } else if (g2Var instanceof bn) {
                    ((bn) g2Var).za(user.id, str9, true);
                    break;
                }
                break;
            case 13:
                LaunchActivity launchActivity3 = (LaunchActivity) obj5;
                TLObject tLObject6 = (TLObject) obj3;
                TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = (TLRPC.TL_messages_requestUrlAuth) obj2;
                String str10 = (String) obj;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) obj4;
                org.telegram.ui.ActionBar.g2 T3 = LaunchActivity.T();
                if (tLObject6 != null) {
                    if (tLObject6 instanceof TLRPC.TL_urlAuthResultRequest) {
                        ei0.b(false, launchActivity3.P, tL_messages_requestUrlAuth, (TLRPC.TL_urlAuthResultRequest) tLObject6, null, null, null, false, null);
                        break;
                    } else if (tLObject6 instanceof TLRPC.TL_urlAuthResultAccepted) {
                        ei0.b(false, launchActivity3.P, tL_messages_requestUrlAuth, (TLRPC.TL_urlAuthResultAccepted) tLObject6, null, null, null, false, null);
                        break;
                    } else if (tLObject6 instanceof TLRPC.TL_urlAuthResultDefault) {
                        org.telegram.ui.Components.b5.n0(T3, str10, false, true);
                        break;
                    }
                } else if (tL_error5 != null) {
                    if ("URL_EXPIRED".equalsIgnoreCase(tL_error5.text)) {
                        ei0.a().I(R.raw.error, org.telegram.messenger.gd.N0(2131753125, null), org.telegram.messenger.gd.N0(2131753126, null)).j();
                        break;
                    } else {
                        ei0.a().g0(tL_error5, false);
                        break;
                    }
                }
                break;
            case 14:
                LaunchActivity launchActivity4 = (LaunchActivity) obj5;
                TLObject tLObject7 = (TLObject) obj3;
                org.telegram.ui.ActionBar.t1 t1Var = (org.telegram.ui.ActionBar.t1) obj2;
                i50 i50Var2 = (i50) obj;
                TLRPC.TL_error tL_error6 = (TLRPC.TL_error) obj4;
                String str11 = LaunchActivity.C1;
                if (tLObject7 instanceof TLRPC.TL_theme) {
                    TLRPC.TL_theme tL_theme = (TLRPC.TL_theme) tLObject7;
                    TLRPC.ThemeSettings themeSettings = tL_theme.settings.size() > 0 ? tL_theme.settings.get(0) : null;
                    if (themeSettings != null) {
                        org.telegram.ui.ActionBar.m6 Q0 = org.telegram.ui.ActionBar.n6.Q0(org.telegram.ui.ActionBar.n6.r0(themeSettings));
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
                                i50Var2.run();
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
                        i50Var2.run();
                    } catch (Exception e12) {
                        org.telegram.messenger.a8.g(e12, true);
                    }
                    if (i7 == 1) {
                        launchActivity4.F0(org.telegram.ui.Components.b5.K(launchActivity4, org.telegram.messenger.gd.N0(2131743945, null), org.telegram.messenger.gd.N0(2131743928, null)));
                        break;
                    } else {
                        launchActivity4.F0(org.telegram.ui.Components.b5.K(launchActivity4, org.telegram.messenger.gd.N0(2131743945, null), org.telegram.messenger.gd.N0(2131743929, null)));
                        break;
                    }
                }
                break;
            case 15:
                r90 r90Var = (r90) obj5;
                TLRPC.TL_error tL_error7 = (TLRPC.TL_error) obj4;
                TLObject tLObject8 = (TLObject) obj3;
                TLRPC.TL_inputInvoiceSlug tL_inputInvoiceSlug = (TLRPC.TL_inputInvoiceSlug) obj2;
                String str12 = (String) obj;
                int i24 = r90Var.b;
                LaunchActivity launchActivity5 = r90Var.a;
                if (tL_error7 != null) {
                    if ("SUBSCRIPTION_ALREADY_ACTIVE".equalsIgnoreCase(tL_error7.text)) {
                        d = r90.d();
                        i10 = 2131747201;
                    } else {
                        d = r90.d();
                        i10 = 2131747202;
                    }
                    org.telegram.messenger.f3.o(null, i10, d, null);
                } else if (!launchActivity5.isFinishing()) {
                    if (tLObject8 instanceof TLRPC.TL_payments_paymentFormStars) {
                        bi.t8 t8Var = launchActivity5.Y0;
                        launchActivity5.Y0 = null;
                        di.y8.y(i24, false).W(null, tL_inputInvoiceSlug, (TLRPC.TL_payments_paymentFormStars) tLObject8, new n90(r90Var, 1), new l70(t8Var, i19));
                        break;
                    } else {
                        if (tLObject8 instanceof TLRPC.PaymentForm) {
                            TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject8;
                            org.telegram.messenger.mp.u1(i24).f4(paymentForm.users, false);
                            kl0Var = new kl0(paymentForm, null, str12, LaunchActivity.T());
                        } else {
                            kl0Var = tLObject8 instanceof TLRPC.PaymentReceipt ? new kl0((TLRPC.PaymentReceipt) tLObject8) : null;
                        }
                        if (kl0Var != null) {
                            bi.t8 t8Var2 = launchActivity5.Y0;
                            if (t8Var2 != null) {
                                launchActivity5.Y0 = null;
                                kl0Var.a1 = new ve(i18, t8Var2);
                            }
                            r90Var.u(kl0Var, false);
                        }
                    }
                }
                r90Var.c();
                break;
            case 16:
                de0.b0((de0) obj5, (TLRPC.TL_error) obj4, (String) obj3, (String) obj2, (String) obj);
                break;
            case 17:
                TLObject tLObject9 = (TLObject) obj3;
                Bundle bundle = (Bundle) obj2;
                TLRPC.TL_error tL_error8 = (TLRPC.TL_error) obj4;
                TLRPC.TL_auth_resendCode tL_auth_resendCode = (TLRPC.TL_auth_resendCode) obj;
                de0 de0Var = ((ob0) obj5).a0;
                if (tLObject9 instanceof TLRPC.TL_auth_sentCode) {
                    de0Var.y1(bundle, (TLRPC.TL_auth_sentCode) tLObject9, true);
                    break;
                } else if (tL_error8 != null && tL_error8.text != null) {
                    i11 = ((org.telegram.ui.ActionBar.g2) de0Var).currentAccount;
                    org.telegram.ui.Components.b5.c0(i11, tL_error8, de0Var, tL_auth_resendCode, new Object[0]);
                    break;
                }
                break;
            case 18:
                rc0 rc0Var = (rc0) obj5;
                TLObject tLObject10 = (TLObject) obj3;
                Bundle bundle2 = (Bundle) obj2;
                TLRPC.TL_error tL_error9 = (TLRPC.TL_error) obj4;
                TL_account.sendVerifyEmailCode sendverifyemailcode = (TL_account.sendVerifyEmailCode) obj;
                de0 de0Var2 = rc0Var.F;
                de0Var2.C1(false, true);
                rc0Var.r = false;
                if (tLObject10 instanceof TL_account.sentEmailCode) {
                    TL_account.sentEmailCode sentemailcode = (TL_account.sentEmailCode) tLObject10;
                    bundle2.putString("emailPattern", sentemailcode.email_pattern);
                    bundle2.putInt("length", sentemailcode.length);
                    de0Var2.M1(13, true, bundle2, false);
                    break;
                } else {
                    String str13 = tL_error9.text;
                    if (str13 != null) {
                        if (str13.contains("EMAIL_INVALID")) {
                            rc0Var.n();
                            break;
                        } else if (tL_error9.text.contains("EMAIL_NOT_ALLOWED")) {
                            de0Var2.D1(org.telegram.messenger.gd.N0(2131745875, null), org.telegram.messenger.gd.N0(2131751188, null));
                            break;
                        } else if (tL_error9.text.contains("PHONE_PASSWORD_FLOOD")) {
                            de0Var2.D1(org.telegram.messenger.gd.N0(2131745875, null), org.telegram.messenger.gd.N0(2131750670, "FloodWait"));
                            break;
                        } else if (tL_error9.text.contains("PHONE_NUMBER_FLOOD")) {
                            de0Var2.D1(org.telegram.messenger.gd.N0(2131745875, null), org.telegram.messenger.gd.N0(2131747092, "PhoneNumberFlood"));
                            break;
                        } else if (!tL_error9.text.contains("PHONE_CODE_EMPTY") && !tL_error9.text.contains("PHONE_CODE_INVALID")) {
                            if (tL_error9.text.contains("PHONE_CODE_EXPIRED")) {
                                de0Var2.M1(0, true, null, true);
                                de0Var2.D1(org.telegram.messenger.gd.N0(2131745875, null), org.telegram.messenger.gd.N0(2131752009, "CodeExpired"));
                                break;
                            } else if (tL_error9.text.startsWith("FLOOD_WAIT")) {
                                de0Var2.D1(org.telegram.messenger.gd.N0(2131745875, null), org.telegram.messenger.gd.N0(2131750670, "FloodWait"));
                                break;
                            } else if (tL_error9.code != -1000) {
                                i12 = ((org.telegram.ui.ActionBar.g2) de0Var2).currentAccount;
                                org.telegram.ui.Components.b5.c0(i12, tL_error9, de0Var2, sendverifyemailcode, rc0Var.x);
                                break;
                            }
                        } else {
                            de0Var2.D1(org.telegram.messenger.gd.N0(2131745875, null), org.telegram.messenger.gd.N0(2131748990, "InvalidCode"));
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
                de0 de0Var3 = ((rc0) obj5).F;
                if (!(tLObject11 instanceof TL_account.TL_emailVerified) || de0Var3.G != 3) {
                    if (tLObject11 instanceof TL_account.TL_emailVerifiedLogin) {
                        TL_account.TL_emailVerifiedLogin tL_emailVerifiedLogin = (TL_account.TL_emailVerifiedLogin) tLObject11;
                        bundle3.putString("email", tL_emailVerifiedLogin.email);
                        de0Var3.y1(bundle3, tL_emailVerifiedLogin.sent_code, true);
                        break;
                    } else if (tL_error10 != null) {
                        if (tL_error10.text.contains("EMAIL_NOT_ALLOWED")) {
                            de0Var3.D1(org.telegram.messenger.gd.N0(2131745875, null), org.telegram.messenger.gd.N0(2131751188, null));
                            break;
                        } else if (tL_error10.text.contains("EMAIL_TOKEN_INVALID")) {
                            de0Var3.D1(org.telegram.messenger.gd.N0(2131745875, null), org.telegram.messenger.gd.N0(2131751185, null));
                            break;
                        } else if (tL_error10.code != -1000) {
                            i13 = ((org.telegram.ui.ActionBar.g2) de0Var3).currentAccount;
                            org.telegram.ui.Components.b5.c0(i13, tL_error10, de0Var3, verifyemail, new Object[0]);
                            break;
                        }
                    }
                } else {
                    de0Var3.finishFragment();
                    de0Var3.e0.run();
                    break;
                }
                break;
            case 20:
                final ld0 ld0Var = (ld0) obj5;
                TLObject tLObject12 = (TLObject) obj3;
                TLRPC.TL_inputInvoicePremiumAuthCode tL_inputInvoicePremiumAuthCode = (TLRPC.TL_inputInvoicePremiumAuthCode) obj2;
                final TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode = (TLRPC.TL_inputStorePaymentAuthCode) obj;
                TLRPC.TL_error tL_error11 = (TLRPC.TL_error) obj4;
                de0 de0Var4 = ld0Var.w;
                ld0Var.b.setLoading(false);
                if (tLObject12 instanceof TLRPC.PaymentForm) {
                    final TLRPC.PaymentForm paymentForm2 = (TLRPC.PaymentForm) tLObject12;
                    de0Var4.getMessagesController().f4(paymentForm2.users, false);
                    kl0 kl0Var2 = new kl0(tL_inputInvoicePremiumAuthCode, paymentForm2, null, null, 4, null, null, null, null, null, null, false, null, de0Var4, true);
                    kl0Var2.W0 = true;
                    kl0Var2.d1 = new org.telegram.messenger.w10() { // from class: org.telegram.ui.id0
                        @Override // org.telegram.messenger.w10
                        public final void a(Object obj7) {
                            switch (i20) {
                                case 0:
                                    final int i25 = 0;
                                    final ld0 ld0Var2 = ld0Var;
                                    final TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode2 = tL_inputStorePaymentAuthCode;
                                    final TLRPC.PaymentForm paymentForm3 = paymentForm2;
                                    org.telegram.messenger.g0.g3(new Runnable() { // from class: org.telegram.ui.jd0
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i25) {
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
                                    final int i26 = 1;
                                    final ld0 ld0Var3 = ld0Var;
                                    final TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode3 = tL_inputStorePaymentAuthCode;
                                    final TLRPC.PaymentForm paymentForm4 = paymentForm2;
                                    org.telegram.messenger.g0.g3(new Runnable() { // from class: org.telegram.ui.jd0
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i26) {
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
                    kl0Var2.e1 = new org.telegram.messenger.w10() { // from class: org.telegram.ui.id0
                        @Override // org.telegram.messenger.w10
                        public final void a(Object obj7) {
                            switch (i19) {
                                case 0:
                                    final int i25 = 0;
                                    final ld0 ld0Var2 = ld0Var;
                                    final TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode2 = tL_inputStorePaymentAuthCode;
                                    final TLRPC.PaymentForm paymentForm3 = paymentForm2;
                                    org.telegram.messenger.g0.g3(new Runnable() { // from class: org.telegram.ui.jd0
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i25) {
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
                                    final int i26 = 1;
                                    final ld0 ld0Var3 = ld0Var;
                                    final TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode3 = tL_inputStorePaymentAuthCode;
                                    final TLRPC.PaymentForm paymentForm4 = paymentForm2;
                                    org.telegram.messenger.g0.g3(new Runnable() { // from class: org.telegram.ui.jd0
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i26) {
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
                    kl0Var2.f1 = new n00(ld0Var, i19);
                    de0Var4.presentFragment(kl0Var2);
                    break;
                } else if (tL_error11 != null) {
                    if ("PHONE_CODE_EXPIRED".equalsIgnoreCase(tL_error11.text)) {
                        org.telegram.messenger.g0.g3(new hd0(ld0Var, 2));
                        break;
                    } else {
                        String str14 = tL_error11.text;
                        ld0Var.e = str14;
                        new org.telegram.ui.Components.kc(de0Var4.a0, null).H(R.raw.error, org.telegram.messenger.gd.a0(null, null, 2131743631, str14));
                        break;
                    }
                } else {
                    new org.telegram.ui.Components.kc(de0Var4.a0, null).H(R.raw.error, org.telegram.messenger.gd.N0(2131743632, null));
                    break;
                }
            case 21:
                mg0 mg0Var = (mg0) obj5;
                TLRPC.TL_error tL_error12 = (TLRPC.TL_error) obj4;
                mg.b bVar = (mg.b) obj3;
                String str15 = (String) obj2;
                TL_stats.TL_loadAsyncGraph tL_loadAsyncGraph = (TL_stats.TL_loadAsyncGraph) obj;
                mg0Var.E = true;
                if (tL_error12 != null || bVar == null) {
                    mg0Var.m0();
                    break;
                } else {
                    mg0Var.w.l(str15, bVar);
                    n41 n41Var = mg0Var.r;
                    n41Var.e = bVar;
                    n41Var.c = tL_loadAsyncGraph.x;
                    mg0Var.m0();
                    break;
                }
            case 22:
                dh0 dh0Var = (dh0) obj5;
                TLRPC.TL_contacts_importedContacts tL_contacts_importedContacts = (TLRPC.TL_contacts_importedContacts) obj3;
                TLRPC.TL_inputPhoneContact tL_inputPhoneContact = (TLRPC.TL_inputPhoneContact) obj2;
                TLRPC.TL_error tL_error13 = (TLRPC.TL_error) obj4;
                TLRPC.TL_contacts_importContacts tL_contacts_importContacts = (TLRPC.TL_contacts_importContacts) obj;
                org.telegram.ui.ActionBar.g2 g2Var2 = dh0Var.G1;
                dh0Var.B1 = false;
                if (tL_contacts_importedContacts == null) {
                    org.telegram.messenger.g0.X3(dh0Var.R1, true, 0.5f, true, true);
                    org.telegram.messenger.g0.X3(dh0Var.S1, false, 0.5f, true, true);
                    org.telegram.ui.Components.b5.c0(dh0Var.a, tL_error13, g2Var2, tL_contacts_importContacts, new Object[0]);
                    break;
                } else if (!tL_contacts_importedContacts.users.isEmpty()) {
                    org.telegram.messenger.mp.u1(dh0Var.a).f4(tL_contacts_importedContacts.users, false);
                    org.telegram.messenger.mp.u1(dh0Var.a).G3(tL_contacts_importedContacts.users.get(0), null, g2Var2, 1);
                    dh0Var.dismiss();
                    break;
                } else if (g2Var2.getParentActivity() != null) {
                    org.telegram.messenger.g0.X3(dh0Var.R1, true, 0.5f, true, true);
                    org.telegram.messenger.g0.X3(dh0Var.S1, false, 0.5f, true, true);
                    org.telegram.ui.Components.b5.u(g2Var2, tL_inputPhoneContact.first_name, tL_inputPhoneContact.last_name, tL_inputPhoneContact.phone);
                    break;
                }
                break;
            case 23:
                TLRPC.TL_error tL_error14 = (TLRPC.TL_error) obj4;
                gf0 gf0Var = (gf0) obj3;
                jb.m mVar = (jb.m) obj2;
                TL_account.verifyEmail verifyemail2 = (TL_account.verifyEmail) obj;
                fk0 fk0Var = ((oj0) obj5).a;
                if (tL_error14 == null) {
                    ((kj0) fk0Var.C1).c(fk0Var.F, (String) fk0Var.t1.get("email"), null, null, null, null, null, null, null, null, gf0Var, mVar);
                    break;
                } else {
                    i14 = ((org.telegram.ui.ActionBar.g2) fk0Var).currentAccount;
                    org.telegram.ui.Components.b5.c0(i14, tL_error14, fk0Var, verifyemail2, new Object[0]);
                    mVar.f(null, null);
                    break;
                }
            case 24:
                bk0 bk0Var = (bk0) obj5;
                TLRPC.TL_error tL_error15 = (TLRPC.TL_error) obj4;
                Bundle bundle4 = (Bundle) obj3;
                TLObject tLObject13 = (TLObject) obj2;
                TLRPC.TL_auth_resendCode tL_auth_resendCode2 = (TLRPC.TL_auth_resendCode) obj;
                fk0 fk0Var2 = bk0Var.R;
                bk0Var.K = false;
                if (tL_error15 == null) {
                    fk0Var2.p1(bundle4, (TLRPC.TL_auth_sentCode) tLObject13, true);
                } else {
                    i15 = ((org.telegram.ui.ActionBar.g2) fk0Var2).currentAccount;
                    org.telegram.ui.ActionBar.t1 c02 = org.telegram.ui.Components.b5.c0(i15, tL_error15, fk0Var2, tL_auth_resendCode2, new Object[0]);
                    if (c02 != null && tL_error15.text.contains("PHONE_CODE_EXPIRED")) {
                        c02.n0 = new xj0(bk0Var, i20);
                    }
                }
                fk0Var2.B1();
                break;
            case 25:
                kl0.k0((kl0) obj5, (TLRPC.TL_error) obj4, (TLObject) obj3, (String) obj2, (TL_account.getPassword) obj);
                break;
            case 26:
                ClippingImageView[] clippingImageViewArr = (ClippingImageView[]) obj4;
                ArrayList arrayList11 = (ArrayList) obj3;
                Integer num = (Integer) obj2;
                uq0 uq0Var2 = (uq0) obj;
                PhotoViewer photoViewer = ((aq0) obj5).r;
                photoViewer.p4 = null;
                qq0 qq0Var = photoViewer.f0;
                if (qq0Var != null && photoViewer.h0 != null) {
                    qq0Var.setLayerType(0, null);
                    photoViewer.n4 = 0;
                    photoViewer.D1();
                    photoViewer.o4 = 0L;
                    photoViewer.H1 = null;
                    photoViewer.F1.a = false;
                    photoViewer.I1 = null;
                    photoViewer.G1.a = false;
                    photoViewer.C2();
                    photoViewer.y2();
                    photoViewer.f0.invalidate();
                    for (ClippingImageView clippingImageView : clippingImageViewArr) {
                        clippingImageView.setVisibility(8);
                    }
                    wq0 wq0Var = photoViewer.q4;
                    if (wq0Var != null) {
                        wq0Var.a.P0(true, true);
                    }
                    wq0 wq0Var2 = photoViewer.r4;
                    if (wq0Var2 != null && !wq0Var2.s) {
                        wq0Var2.a.P0(false, true);
                    }
                    if (arrayList11 != null && (i16 = photoViewer.d2) != 3 && i16 != 1 && ((uq0Var = photoViewer.d) == null || !uq0Var.P())) {
                        photoViewer.R1();
                    }
                    org.telegram.ui.Components.h61 h61Var = photoViewer.G2;
                    if (h61Var != null && h61Var.d0() && photoViewer.s1 && !photoViewer.g7.isEmpty()) {
                        PhotoViewer.S(photoViewer, photoViewer.G2.S());
                        PhotoViewer.R(photoViewer, true);
                    }
                    if (photoViewer.t4) {
                        PhotoViewer.T(photoViewer, num.intValue());
                    }
                    if (uq0Var2 != null) {
                        uq0Var2.d();
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
                        int i25 = globalPrivacySettings2.flags;
                        globalPrivacySettings.flags = i25;
                        globalPrivacySettings.disallowed_stargifts = globalPrivacySettings2.disallowed_stargifts;
                        long j3 = globalPrivacySettings2.noncontact_peers_paid_stars;
                        if (j3 > 0) {
                            globalPrivacySettings.flags = i25 | 32;
                            globalPrivacySettings.noncontact_peers_paid_stars = j3;
                        } else {
                            globalPrivacySettings.flags = i25 & (-33);
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
                PrivacyControlActivity privacyControlActivity2 = ((jt0) obj5).d;
                if (((TLObject) obj3) instanceof TLRPC.TL_boolTrue) {
                    org.telegram.ui.Components.fc Q = org.telegram.ui.Components.kc.b0(privacyControlActivity2).Q(R.raw.contact_check, 36, org.telegram.messenger.gd.N0(2131746662, null));
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
                            i6Var = ((org.telegram.ui.ActionBar.g2) privacyControlActivity2).resourceProvider;
                            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(0, parentActivity, i6Var);
                            String N0 = org.telegram.messenger.gd.N0(2131746658, null);
                            org.telegram.ui.ActionBar.t1 t1Var2 = alertDialog$Builder2.a;
                            t1Var2.S = N0;
                            t1Var2.U = org.telegram.messenger.gd.N0(2131746659, null);
                            alertDialog$Builder2.k(org.telegram.messenger.gd.N0(2131747637, null), null);
                            privacyControlActivity2.showDialog(t1Var2);
                            break;
                        }
                    } else {
                        org.telegram.messenger.f3.n(null, 2131743632, org.telegram.ui.Components.kc.b0(privacyControlActivity2), R.raw.error, 36);
                        break;
                    }
                }
                break;
            default:
                ProfileActivity profileActivity = (ProfileActivity) obj5;
                TLRPC.ChatParticipant chatParticipant = (TLRPC.ChatParticipant) obj3;
                TLRPC.User user2 = (TLRPC.User) obj2;
                tt0 tt0Var = (tt0) obj;
                RectF rectF = ProfileActivity.Z6;
                if (!(((TLRPC.ChannelParticipant) obj4) instanceof TLRPC.TL_channelParticipantAdmin) && !(chatParticipant instanceof TLRPC.TL_chatParticipantAdmin)) {
                    tt0Var.a(1);
                    break;
                } else {
                    AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(0, profileActivity.getParentActivity(), profileActivity.A0);
                    String N02 = org.telegram.messenger.gd.N0(R.string.AppName, null);
                    org.telegram.ui.ActionBar.t1 t1Var3 = alertDialog$Builder3.a;
                    t1Var3.S = N02;
                    t1Var3.U = org.telegram.messenger.gd.a0(null, null, 2131754347, org.telegram.messenger.i5.m(0, user2.first_name, user2.last_name));
                    alertDialog$Builder3.k(org.telegram.messenger.gd.N0(2131747637, null), new oi0(tt0Var, i18));
                    alertDialog$Builder3.h(org.telegram.messenger.gd.N0(2131752577, null), null);
                    profileActivity.showDialog(t1Var3);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ ip(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i7) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
    }

    public /* synthetic */ ip(Object obj, Object obj2, Object obj3, Object obj4, TLRPC.TL_error tL_error, int i7) {
        this.a = i7;
        this.b = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
        this.c = tL_error;
    }

    public /* synthetic */ ip(org.telegram.ui.Components.jw0 jw0Var, String str, TLRPC.TL_error tL_error, TLObject tLObject, TextView textView) {
        this.a = 4;
        this.b = jw0Var;
        this.d = str;
        this.c = tL_error;
        this.e = tLObject;
        this.f = textView;
    }
}
