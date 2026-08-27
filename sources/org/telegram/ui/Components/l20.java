package org.telegram.ui.Components;

import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Date;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.NotificationsController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
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
import org.telegram.ui.c91;
import org.telegram.ui.nc1;
import org.telegram.ui.wh1;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class l20 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ l20(View view, View view2, WindowManager windowManager, View view3, View view4) {
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
        int i10;
        org.telegram.ui.do0 do0Var;
        mc b10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        org.telegram.ui.au0 au0Var;
        String str2;
        org.telegram.ui.ActionBar.c6 c6Var;
        int i18 = this.a;
        TLRPC.TL_wallPaper tL_wallPaper = null;
        final int i19 = 1;
        final int i20 = 0;
        Object obj = this.f;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.c;
        Object obj5 = this.b;
        switch (i18) {
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
                ex0 ex0Var = (ex0) obj5;
                String str3 = (String) obj4;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj3;
                TLObject tLObject = (TLObject) obj2;
                TextView textView = (TextView) obj;
                ex0Var.l0 = 0;
                String str4 = ex0Var.k0;
                if (str4 != null && str4.equals(str3)) {
                    if (tL_error != null || !(tLObject instanceof TLRPC.TL_boolTrue)) {
                        textView.setText(LocaleController.getString(R.string.ImportStickersLinkTaken));
                        textView.setTextColor(ex0Var.getThemedColor(org.telegram.ui.ActionBar.g6.p7));
                        ex0Var.m0 = false;
                        break;
                    } else {
                        textView.setText(LocaleController.getString(R.string.ImportStickersLinkAvailable));
                        textView.setTextColor(ex0Var.getThemedColor(org.telegram.ui.ActionBar.g6.w6));
                        ex0Var.m0 = true;
                        break;
                    }
                }
                break;
            case 2:
                qx0 qx0Var = (qx0) obj5;
                TLObject tLObject2 = (TLObject) obj4;
                TLRPC.UserFull userFull = (TLRPC.UserFull) obj3;
                TL_account.TL_birthday tL_birthday = (TL_account.TL_birthday) obj2;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj;
                org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                if (U != null) {
                    if (tLObject2 instanceof TLRPC.TL_boolTrue) {
                        ec M = mc.a0(U).M(LocaleController.getString(R.string.PrivacyBirthdaySetDone), LocaleController.getString(R.string.PrivacyBirthdaySetDoneInfo), R.raw.gift);
                        M.j = 5000;
                        M.j();
                        break;
                    } else {
                        if (userFull != null) {
                            if (tL_birthday == null) {
                                userFull.flags2 &= -33;
                            } else {
                                userFull.flags2 |= 32;
                            }
                            userFull.birthday = tL_birthday;
                            MessagesStorage.getInstance(qx0Var.a).updateUserInfo(userFull, false);
                        }
                        if (tL_error2 != null && (str = tL_error2.text) != null && str.startsWith("FLOOD_WAIT_")) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(qx0Var.b.getContext());
                            alertDialog$Builder.a.N = LocaleController.getString(R.string.PrivacyBirthdayTooOftenTitle);
                            alertDialog$Builder.a.P = LocaleController.getString(R.string.PrivacyBirthdayTooOftenMessage);
                            i0.a.C(R.string.OK, alertDialog$Builder, null);
                            break;
                        } else {
                            org.telegram.messenger.y1.q(R.string.UnknownError, mc.a0(U), R.raw.error, 36);
                            break;
                        }
                    }
                }
                break;
            case 3:
                d21 d21Var = (d21) obj5;
                TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) obj3;
                b70 b70Var = (b70) obj2;
                b70 b70Var2 = (b70) obj;
                org.telegram.ui.rn rnVar = d21Var.h;
                if (((MessagesController) obj4).isDialogMuted(d21Var.c, tL_forumTopic.id)) {
                    b70Var.u();
                    NotificationsController.getInstance(d21Var.b).muteDialog(d21Var.c, tL_forumTopic.id, false);
                    if (mc.a(rnVar)) {
                        mc.z(rnVar, 4, 0, d21Var.d).j();
                        break;
                    }
                } else {
                    b70Var.K(b70Var2);
                    break;
                }
                break;
            case 4:
                org.telegram.ui.kt ktVar = (org.telegram.ui.kt) obj5;
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
                            TLRPC.TL_messages_stickerSet stickerSet2 = MediaDataController.getInstance(ktVar.r).getStickerSet((TLRPC.InputStickerSet) tL_inputStickerSetID, true);
                            if (stickerSet2 == null || stickerSet2.documents.size() < 120) {
                                arrayList.add(stickerSetCovered2);
                            }
                        }
                    }
                    if (tL_messages_myStickers.sets.size() == tL_messages_getMyStickers.limit) {
                        tL_messages_getMyStickers.offset_id = ((TLRPC.StickerSetCovered) i0.a.i(1, tL_messages_myStickers.sets)).set.id;
                        ConnectionsManager.getInstance(ktVar.r).sendRequest(tL_messages_getMyStickers, new org.telegram.ui.z9(ktVar, arrayList, tL_messages_getMyStickers, 7));
                        break;
                    }
                }
                break;
            case 5:
                org.telegram.ui.gy.I0((org.telegram.ui.gy) obj5, (TLObject) obj4, (TLRPC.UserFull) obj3, (TL_account.TL_birthday) obj2, (TLRPC.TL_error) obj);
                break;
            case 6:
                org.telegram.ui.s50.C((org.telegram.ui.s50) obj5, (org.telegram.ui.ActionBar.b2) obj4, (TLObject) obj3, (TL_phone.exportGroupCallInvite) obj2, (TLRPC.TL_error) obj);
                break;
            case 7:
                org.telegram.ui.s50.y((org.telegram.ui.s50) obj5, (ArrayList) obj4, (ArrayList) obj3, (ArrayList) obj2, (String) obj);
                break;
            case 8:
                LaunchActivity launchActivity = (LaunchActivity) obj5;
                org.telegram.ui.a30 a30Var = (org.telegram.ui.a30) obj4;
                TLObject tLObject4 = (TLObject) obj3;
                TLRPC.TL_wallPaper tL_wallPaper2 = (TLRPC.TL_wallPaper) obj2;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj;
                Pattern pattern = LaunchActivity.x1;
                try {
                    a30Var.run();
                } catch (Exception e9) {
                    FileLog.e(e9);
                }
                if (tLObject4 instanceof TLRPC.TL_wallPaper) {
                    TLRPC.TL_wallPaper tL_wallPaper3 = (TLRPC.TL_wallPaper) tLObject4;
                    if (tL_wallPaper3.pattern) {
                        String str5 = tL_wallPaper3.slug;
                        TLRPC.WallPaperSettings wallPaperSettings = tL_wallPaper2.settings;
                        wh1 wh1Var = new wh1(str5, wallPaperSettings.background_color, wallPaperSettings.second_background_color, wallPaperSettings.third_background_color, wallPaperSettings.fourth_background_color, AndroidUtilities.getWallpaperRotation(wallPaperSettings.rotation, false), r2.intensity / 100.0f, tL_wallPaper2.settings.motion, null);
                        wh1Var.g = tL_wallPaper3;
                        tL_wallPaper3 = wh1Var;
                    }
                    nc1 nc1Var = new nc1(tL_wallPaper3, null, true);
                    TLRPC.WallPaperSettings wallPaperSettings2 = tL_wallPaper2.settings;
                    boolean z10 = wallPaperSettings2.blur;
                    boolean z11 = wallPaperSettings2.motion;
                    float f10 = wallPaperSettings2.intensity;
                    nc1Var.B1 = z10;
                    nc1Var.A1 = z11;
                    nc1Var.j1 = f10;
                    launchActivity.p0(nc1Var);
                    break;
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    org.telegram.messenger.rl.j(R.string.ErrorOccurred, "\n", sb2);
                    sb2.append(tL_error3.text);
                    launchActivity.B0(y4.N(launchActivity, null, sb2.toString()));
                    break;
                }
            case 9:
                LaunchActivity launchActivity2 = (LaunchActivity) obj5;
                org.telegram.ui.gy gyVar = (org.telegram.ui.gy) obj4;
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) obj3;
                TLRPC.User user = (TLRPC.User) obj2;
                String str6 = (String) obj;
                ArrayList arrayList3 = launchActivity2.A0;
                if (gyVar != null) {
                    if (n2Var != null) {
                        n2Var.dismissCurrentDialog();
                    }
                    while (i20 < arrayList3.size()) {
                        if (((Dialog) arrayList3.get(i20)).isShowing()) {
                            ((Dialog) arrayList3.get(i20)).dismiss();
                        }
                        i20++;
                    }
                    arrayList3.clear();
                    launchActivity2.p0(gyVar);
                    break;
                } else if (n2Var instanceof org.telegram.ui.rn) {
                    ((org.telegram.ui.rn) n2Var).W9(user.id, str6, true);
                    break;
                }
                break;
            case 10:
                LaunchActivity launchActivity3 = (LaunchActivity) obj5;
                TLObject tLObject5 = (TLObject) obj4;
                TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = (TLRPC.TL_messages_requestUrlAuth) obj3;
                String str7 = (String) obj2;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) obj;
                org.telegram.ui.ActionBar.n2 U2 = LaunchActivity.U();
                if (tLObject5 != null) {
                    if (tLObject5 instanceof TLRPC.TL_urlAuthResultRequest) {
                        org.telegram.ui.tk0.b(false, launchActivity3.K, tL_messages_requestUrlAuth, (TLRPC.TL_urlAuthResultRequest) tLObject5, null, null, null, false, null);
                        break;
                    } else if (tLObject5 instanceof TLRPC.TL_urlAuthResultAccepted) {
                        org.telegram.ui.tk0.b(false, launchActivity3.K, tL_messages_requestUrlAuth, (TLRPC.TL_urlAuthResultAccepted) tLObject5, null, null, null, false, null);
                        break;
                    } else if (tLObject5 instanceof TLRPC.TL_urlAuthResultDefault) {
                        y4.q0(U2, str7, false, true);
                        break;
                    }
                } else if (tL_error4 != null) {
                    if ("URL_EXPIRED".equalsIgnoreCase(tL_error4.text)) {
                        org.telegram.ui.tk0.a().M(launchActivity3.getString(R.string.BotAuthLoggedInFailTitle), launchActivity3.getString(R.string.BotAuthLoggedInFailNoDomain), R.raw.error).j();
                        break;
                    } else {
                        org.telegram.ui.tk0.a().d0(tL_error4, false);
                        break;
                    }
                }
                break;
            case 11:
                LaunchActivity launchActivity4 = (LaunchActivity) obj5;
                TLObject tLObject6 = (TLObject) obj4;
                org.telegram.ui.ActionBar.b2 b2Var = (org.telegram.ui.ActionBar.b2) obj3;
                org.telegram.ui.a30 a30Var2 = (org.telegram.ui.a30) obj2;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) obj;
                Pattern pattern2 = LaunchActivity.x1;
                if (tLObject6 instanceof TLRPC.TL_theme) {
                    TLRPC.TL_theme tL_theme = (TLRPC.TL_theme) tLObject6;
                    TLRPC.ThemeSettings themeSettings = tL_theme.settings.size() > 0 ? tL_theme.settings.get(0) : null;
                    if (themeSettings != null) {
                        org.telegram.ui.ActionBar.f6 N0 = org.telegram.ui.ActionBar.g6.N0(org.telegram.ui.ActionBar.g6.q0(themeSettings));
                        if (N0 != null) {
                            TLRPC.WallPaper wallPaper = themeSettings.wallpaper;
                            if (wallPaper instanceof TLRPC.TL_wallPaper) {
                                tL_wallPaper = (TLRPC.TL_wallPaper) wallPaper;
                                if (!FileLoader.getInstance(launchActivity4.K).getPathToAttach(tL_wallPaper.document, true).exists()) {
                                    launchActivity4.R0 = b2Var;
                                    launchActivity4.Q0 = true;
                                    launchActivity4.O0 = N0;
                                    launchActivity4.P0 = tL_theme;
                                    launchActivity4.N0 = tL_wallPaper;
                                    launchActivity4.M0 = FileLoader.getAttachFileName(tL_wallPaper.document);
                                    FileLoader.getInstance(launchActivity4.K).loadFile(tL_wallPaper.document, tL_wallPaper, 1, 1);
                                    break;
                                }
                            }
                            try {
                                a30Var2.run();
                            } catch (Exception e10) {
                                FileLog.e(e10);
                            }
                            launchActivity4.n0(tL_theme, tL_wallPaper, N0);
                        } else {
                            i20 = 1;
                        }
                        i10 = i20;
                    } else {
                        TLRPC.Document document = tL_theme.document;
                        if (document != null) {
                            launchActivity4.Q0 = false;
                            launchActivity4.P0 = tL_theme;
                            launchActivity4.L0 = FileLoader.getAttachFileName(document);
                            launchActivity4.R0 = b2Var;
                            FileLoader.getInstance(launchActivity4.K).loadFile(launchActivity4.P0.document, tL_theme, 1, 1);
                            i10 = 0;
                        }
                        i10 = 1;
                    }
                } else {
                    if (tL_error5 == null || !"THEME_FORMAT_INVALID".equals(tL_error5.text)) {
                        i10 = 2;
                    }
                    i10 = 1;
                }
                if (i10 != 0) {
                    try {
                        a30Var2.run();
                    } catch (Exception e11) {
                        FileLog.e(e11);
                    }
                    if (i10 == 1) {
                        launchActivity4.B0(y4.N(launchActivity4, LocaleController.getString(R.string.Theme), LocaleController.getString(R.string.ThemeNotSupported)));
                        break;
                    } else {
                        launchActivity4.B0(y4.N(launchActivity4, LocaleController.getString(R.string.Theme), LocaleController.getString(R.string.ThemeNotFound)));
                        break;
                    }
                }
                break;
            case 12:
                org.telegram.ui.ob0 ob0Var = (org.telegram.ui.ob0) obj5;
                TLRPC.TL_error tL_error6 = (TLRPC.TL_error) obj4;
                TLObject tLObject7 = (TLObject) obj3;
                TLRPC.TL_inputInvoiceSlug tL_inputInvoiceSlug = (TLRPC.TL_inputInvoiceSlug) obj2;
                String str8 = (String) obj;
                int i21 = ob0Var.b;
                LaunchActivity launchActivity5 = ob0Var.a;
                if (tL_error6 != null) {
                    if ("SUBSCRIPTION_ALREADY_ACTIVE".equalsIgnoreCase(tL_error6.text)) {
                        b10 = org.telegram.ui.ob0.b();
                        i11 = R.string.PaymentInvoiceSubscriptionLinkAlreadyPaid;
                    } else {
                        b10 = org.telegram.ui.ob0.b();
                        i11 = R.string.PaymentInvoiceLinkInvalid;
                    }
                    org.telegram.messenger.y1.r(i11, b10, null);
                } else if (!launchActivity5.isFinishing()) {
                    if (tLObject7 instanceof TLRPC.TL_payments_paymentFormStars) {
                        gh.b6 b6Var = launchActivity5.U0;
                        launchActivity5.U0 = null;
                        hh.u7.y(i21, false).Y(null, tL_inputInvoiceSlug, (TLRPC.TL_payments_paymentFormStars) tLObject7, new org.telegram.ui.hb0(ob0Var, 1), new org.telegram.ui.s80(b6Var, i19));
                        break;
                    } else {
                        if (tLObject7 instanceof TLRPC.PaymentForm) {
                            TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject7;
                            MessagesController.getInstance(i21).putUsers(paymentForm.users, false);
                            do0Var = new org.telegram.ui.do0(paymentForm, null, str8, LaunchActivity.U());
                        } else {
                            do0Var = tLObject7 instanceof TLRPC.PaymentReceipt ? new org.telegram.ui.do0((TLRPC.PaymentReceipt) tLObject7) : null;
                        }
                        if (do0Var != null) {
                            gh.b6 b6Var2 = launchActivity5.U0;
                            if (b6Var2 != null) {
                                launchActivity5.U0 = null;
                                do0Var.V0 = new org.telegram.ui.bf(10, b6Var2);
                            }
                            ob0Var.n(do0Var, false);
                        }
                    }
                }
                ob0Var.a();
                break;
            case 13:
                org.telegram.ui.ig0.U((org.telegram.ui.ig0) obj5, (TLRPC.TL_error) obj4, (String) obj3, (String) obj2, (String) obj);
                break;
            case 14:
                TLObject tLObject8 = (TLObject) obj4;
                Bundle bundle = (Bundle) obj3;
                TLRPC.TL_error tL_error7 = (TLRPC.TL_error) obj2;
                TLRPC.TL_auth_resendCode tL_auth_resendCode = (TLRPC.TL_auth_resendCode) obj;
                org.telegram.ui.ig0 ig0Var = ((org.telegram.ui.sd0) obj5).S;
                if (tLObject8 instanceof TLRPC.TL_auth_sentCode) {
                    ig0Var.g1(bundle, (TLRPC.TL_auth_sentCode) tLObject8, true);
                    break;
                } else if (tL_error7 != null && tL_error7.text != null) {
                    i12 = ((org.telegram.ui.ActionBar.n2) ig0Var).currentAccount;
                    y4.f0(i12, tL_error7, ig0Var, tL_auth_resendCode, new Object[0]);
                    break;
                }
                break;
            case 15:
                org.telegram.ui.xe0 xe0Var = (org.telegram.ui.xe0) obj5;
                TLObject tLObject9 = (TLObject) obj4;
                Bundle bundle2 = (Bundle) obj3;
                TLRPC.TL_error tL_error8 = (TLRPC.TL_error) obj2;
                TL_account.sendVerifyEmailCode sendverifyemailcode = (TL_account.sendVerifyEmailCode) obj;
                org.telegram.ui.ig0 ig0Var2 = xe0Var.A;
                ig0Var2.k1(false, true);
                xe0Var.r = false;
                if (tLObject9 instanceof TL_account.sentEmailCode) {
                    TL_account.sentEmailCode sentemailcode = (TL_account.sentEmailCode) tLObject9;
                    bundle2.putString("emailPattern", sentemailcode.email_pattern);
                    bundle2.putInt("length", sentemailcode.length);
                    ig0Var2.u1(13, true, bundle2, false);
                    break;
                } else {
                    String str9 = tL_error8.text;
                    if (str9 != null) {
                        if (str9.contains("EMAIL_INVALID")) {
                            xe0Var.o();
                            break;
                        } else if (tL_error8.text.contains("EMAIL_NOT_ALLOWED")) {
                            ig0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.EmailNotAllowed));
                            break;
                        } else if (tL_error8.text.contains("PHONE_PASSWORD_FLOOD")) {
                            ig0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("FloodWait", R.string.FloodWait));
                            break;
                        } else if (tL_error8.text.contains("PHONE_NUMBER_FLOOD")) {
                            ig0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("PhoneNumberFlood", R.string.PhoneNumberFlood));
                            break;
                        } else if (!tL_error8.text.contains("PHONE_CODE_EMPTY") && !tL_error8.text.contains("PHONE_CODE_INVALID")) {
                            if (tL_error8.text.contains("PHONE_CODE_EXPIRED")) {
                                ig0Var2.u1(0, true, null, true);
                                ig0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("CodeExpired", R.string.CodeExpired));
                                break;
                            } else if (tL_error8.text.startsWith("FLOOD_WAIT")) {
                                ig0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("FloodWait", R.string.FloodWait));
                                break;
                            } else if (tL_error8.code != -1000) {
                                i13 = ((org.telegram.ui.ActionBar.n2) ig0Var2).currentAccount;
                                y4.f0(i13, tL_error8, ig0Var2, sendverifyemailcode, xe0Var.w);
                                break;
                            }
                        } else {
                            ig0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("InvalidCode", R.string.InvalidCode));
                            break;
                        }
                    }
                }
                break;
            case 16:
                TLObject tLObject10 = (TLObject) obj4;
                Bundle bundle3 = (Bundle) obj3;
                TLRPC.TL_error tL_error9 = (TLRPC.TL_error) obj2;
                TL_account.verifyEmail verifyemail = (TL_account.verifyEmail) obj;
                org.telegram.ui.ig0 ig0Var3 = ((org.telegram.ui.xe0) obj5).A;
                if (!(tLObject10 instanceof TL_account.TL_emailVerified) || ig0Var3.B != 3) {
                    if (tLObject10 instanceof TL_account.TL_emailVerifiedLogin) {
                        TL_account.TL_emailVerifiedLogin tL_emailVerifiedLogin = (TL_account.TL_emailVerifiedLogin) tLObject10;
                        bundle3.putString("email", tL_emailVerifiedLogin.email);
                        ig0Var3.g1(bundle3, tL_emailVerifiedLogin.sent_code, true);
                        break;
                    } else if (tL_error9 != null) {
                        if (tL_error9.text.contains("EMAIL_NOT_ALLOWED")) {
                            ig0Var3.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.EmailNotAllowed));
                            break;
                        } else if (tL_error9.text.contains("EMAIL_TOKEN_INVALID")) {
                            ig0Var3.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.EmailTokenInvalid));
                            break;
                        } else if (tL_error9.code != -1000) {
                            i14 = ((org.telegram.ui.ActionBar.n2) ig0Var3).currentAccount;
                            y4.f0(i14, tL_error9, ig0Var3, verifyemail, new Object[0]);
                            break;
                        }
                    }
                } else {
                    ig0Var3.finishFragment();
                    ig0Var3.Z.run();
                    break;
                }
                break;
            case 17:
                final org.telegram.ui.rf0 rf0Var = (org.telegram.ui.rf0) obj5;
                TLObject tLObject11 = (TLObject) obj4;
                TLRPC.TL_inputInvoicePremiumAuthCode tL_inputInvoicePremiumAuthCode = (TLRPC.TL_inputInvoicePremiumAuthCode) obj3;
                final TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode = (TLRPC.TL_inputStorePaymentAuthCode) obj2;
                TLRPC.TL_error tL_error10 = (TLRPC.TL_error) obj;
                org.telegram.ui.ig0 ig0Var4 = rf0Var.v;
                rf0Var.b.setLoading(false);
                if (tLObject11 instanceof TLRPC.PaymentForm) {
                    final TLRPC.PaymentForm paymentForm2 = (TLRPC.PaymentForm) tLObject11;
                    ig0Var4.getMessagesController().putUsers(paymentForm2.users, false);
                    org.telegram.ui.do0 do0Var2 = new org.telegram.ui.do0(tL_inputInvoicePremiumAuthCode, paymentForm2, null, null, 4, null, null, null, null, null, null, false, null, ig0Var4, true);
                    do0Var2.R0 = true;
                    do0Var2.Y0 = new Utilities.Callback() { // from class: org.telegram.ui.nf0
                        @Override // org.telegram.messenger.Utilities.Callback
                        public final void run(Object obj6) {
                            switch (i20) {
                                case 0:
                                    final int i22 = 0;
                                    final rf0 rf0Var2 = rf0Var;
                                    final TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode2 = tL_inputStorePaymentAuthCode;
                                    final TLRPC.PaymentForm paymentForm3 = paymentForm2;
                                    AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.pf0
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i22) {
                                                case 0:
                                                    TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode3 = tL_inputStorePaymentAuthCode2;
                                                    String str10 = tL_inputStorePaymentAuthCode3.phone_number;
                                                    String str11 = tL_inputStorePaymentAuthCode3.phone_code_hash;
                                                    long j10 = paymentForm3.form_id;
                                                    rf0 rf0Var3 = rf0Var2;
                                                    if (!rf0Var3.f) {
                                                        rf0Var3.f = true;
                                                        rf0Var3.h = str10;
                                                        rf0Var3.n = str11;
                                                        rf0Var3.r = j10;
                                                        rf0Var3.b.setLoading(true);
                                                        rf0Var3.p();
                                                        break;
                                                    }
                                                    break;
                                                default:
                                                    TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode4 = tL_inputStorePaymentAuthCode2;
                                                    String str12 = tL_inputStorePaymentAuthCode4.phone_number;
                                                    String str13 = tL_inputStorePaymentAuthCode4.phone_code_hash;
                                                    long j11 = paymentForm3.form_id;
                                                    rf0 rf0Var4 = rf0Var2;
                                                    if (!rf0Var4.f) {
                                                        rf0Var4.f = true;
                                                        rf0Var4.h = str12;
                                                        rf0Var4.n = str13;
                                                        rf0Var4.r = j11;
                                                        rf0Var4.b.setLoading(true);
                                                        rf0Var4.p();
                                                        break;
                                                    }
                                                    break;
                                            }
                                        }
                                    });
                                    break;
                                default:
                                    final int i23 = 1;
                                    final rf0 rf0Var3 = rf0Var;
                                    final TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode3 = tL_inputStorePaymentAuthCode;
                                    final TLRPC.PaymentForm paymentForm4 = paymentForm2;
                                    AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.pf0
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i23) {
                                                case 0:
                                                    TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode32 = tL_inputStorePaymentAuthCode3;
                                                    String str10 = tL_inputStorePaymentAuthCode32.phone_number;
                                                    String str11 = tL_inputStorePaymentAuthCode32.phone_code_hash;
                                                    long j10 = paymentForm4.form_id;
                                                    rf0 rf0Var32 = rf0Var3;
                                                    if (!rf0Var32.f) {
                                                        rf0Var32.f = true;
                                                        rf0Var32.h = str10;
                                                        rf0Var32.n = str11;
                                                        rf0Var32.r = j10;
                                                        rf0Var32.b.setLoading(true);
                                                        rf0Var32.p();
                                                        break;
                                                    }
                                                    break;
                                                default:
                                                    TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode4 = tL_inputStorePaymentAuthCode3;
                                                    String str12 = tL_inputStorePaymentAuthCode4.phone_number;
                                                    String str13 = tL_inputStorePaymentAuthCode4.phone_code_hash;
                                                    long j11 = paymentForm4.form_id;
                                                    rf0 rf0Var4 = rf0Var3;
                                                    if (!rf0Var4.f) {
                                                        rf0Var4.f = true;
                                                        rf0Var4.h = str12;
                                                        rf0Var4.n = str13;
                                                        rf0Var4.r = j11;
                                                        rf0Var4.b.setLoading(true);
                                                        rf0Var4.p();
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
                    do0Var2.Z0 = new Utilities.Callback() { // from class: org.telegram.ui.nf0
                        @Override // org.telegram.messenger.Utilities.Callback
                        public final void run(Object obj6) {
                            switch (i19) {
                                case 0:
                                    final int i22 = 0;
                                    final rf0 rf0Var2 = rf0Var;
                                    final TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode2 = tL_inputStorePaymentAuthCode;
                                    final TLRPC.PaymentForm paymentForm3 = paymentForm2;
                                    AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.pf0
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i22) {
                                                case 0:
                                                    TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode32 = tL_inputStorePaymentAuthCode2;
                                                    String str10 = tL_inputStorePaymentAuthCode32.phone_number;
                                                    String str11 = tL_inputStorePaymentAuthCode32.phone_code_hash;
                                                    long j10 = paymentForm3.form_id;
                                                    rf0 rf0Var32 = rf0Var2;
                                                    if (!rf0Var32.f) {
                                                        rf0Var32.f = true;
                                                        rf0Var32.h = str10;
                                                        rf0Var32.n = str11;
                                                        rf0Var32.r = j10;
                                                        rf0Var32.b.setLoading(true);
                                                        rf0Var32.p();
                                                        break;
                                                    }
                                                    break;
                                                default:
                                                    TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode4 = tL_inputStorePaymentAuthCode2;
                                                    String str12 = tL_inputStorePaymentAuthCode4.phone_number;
                                                    String str13 = tL_inputStorePaymentAuthCode4.phone_code_hash;
                                                    long j11 = paymentForm3.form_id;
                                                    rf0 rf0Var4 = rf0Var2;
                                                    if (!rf0Var4.f) {
                                                        rf0Var4.f = true;
                                                        rf0Var4.h = str12;
                                                        rf0Var4.n = str13;
                                                        rf0Var4.r = j11;
                                                        rf0Var4.b.setLoading(true);
                                                        rf0Var4.p();
                                                        break;
                                                    }
                                                    break;
                                            }
                                        }
                                    });
                                    break;
                                default:
                                    final int i23 = 1;
                                    final rf0 rf0Var3 = rf0Var;
                                    final TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode3 = tL_inputStorePaymentAuthCode;
                                    final TLRPC.PaymentForm paymentForm4 = paymentForm2;
                                    AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.pf0
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i23) {
                                                case 0:
                                                    TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode32 = tL_inputStorePaymentAuthCode3;
                                                    String str10 = tL_inputStorePaymentAuthCode32.phone_number;
                                                    String str11 = tL_inputStorePaymentAuthCode32.phone_code_hash;
                                                    long j10 = paymentForm4.form_id;
                                                    rf0 rf0Var32 = rf0Var3;
                                                    if (!rf0Var32.f) {
                                                        rf0Var32.f = true;
                                                        rf0Var32.h = str10;
                                                        rf0Var32.n = str11;
                                                        rf0Var32.r = j10;
                                                        rf0Var32.b.setLoading(true);
                                                        rf0Var32.p();
                                                        break;
                                                    }
                                                    break;
                                                default:
                                                    TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode4 = tL_inputStorePaymentAuthCode3;
                                                    String str12 = tL_inputStorePaymentAuthCode4.phone_number;
                                                    String str13 = tL_inputStorePaymentAuthCode4.phone_code_hash;
                                                    long j11 = paymentForm4.form_id;
                                                    rf0 rf0Var4 = rf0Var3;
                                                    if (!rf0Var4.f) {
                                                        rf0Var4.f = true;
                                                        rf0Var4.h = str12;
                                                        rf0Var4.n = str13;
                                                        rf0Var4.r = j11;
                                                        rf0Var4.b.setLoading(true);
                                                        rf0Var4.p();
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
                    do0Var2.a1 = new org.telegram.ui.w10(rf0Var, i19);
                    ig0Var4.presentFragment(do0Var2);
                    break;
                } else if (tL_error10 != null) {
                    if ("PHONE_CODE_EXPIRED".equalsIgnoreCase(tL_error10.text)) {
                        AndroidUtilities.runOnUIThread(new org.telegram.ui.of0(rf0Var, i20));
                        break;
                    } else {
                        String str10 = tL_error10.text;
                        rf0Var.e = str10;
                        new mc(ig0Var4.V, null).H(R.raw.error, LocaleController.formatString(R.string.UnknownErrorCode, str10));
                        break;
                    }
                } else {
                    new mc(ig0Var4.V, null).H(R.raw.error, LocaleController.getString(R.string.UnknownError));
                    break;
                }
            case 18:
                org.telegram.ui.vi0 vi0Var = (org.telegram.ui.vi0) obj5;
                TLRPC.TL_error tL_error11 = (TLRPC.TL_error) obj4;
                sf.b bVar = (sf.b) obj3;
                String str11 = (String) obj2;
                TL_stats.TL_loadAsyncGraph tL_loadAsyncGraph = (TL_stats.TL_loadAsyncGraph) obj;
                vi0Var.y = true;
                if (tL_error11 != null || bVar == null) {
                    vi0Var.g0();
                    break;
                } else {
                    vi0Var.v.put(str11, bVar);
                    c91 c91Var = vi0Var.r;
                    c91Var.e = bVar;
                    c91Var.c = tL_loadAsyncGraph.x;
                    vi0Var.g0();
                    break;
                }
            case 19:
                org.telegram.ui.oj0.n((org.telegram.ui.oj0) obj5, (TLRPC.TL_contacts_importedContacts) obj4, (TLRPC.TL_inputPhoneContact) obj3, (TLRPC.TL_error) obj2, (TLRPC.TL_contacts_importContacts) obj);
                break;
            case 20:
                TLRPC.TL_error tL_error12 = (TLRPC.TL_error) obj4;
                org.telegram.ui.zk0 zk0Var = (org.telegram.ui.zk0) obj3;
                org.telegram.ui.i6 i6Var = (org.telegram.ui.i6) obj2;
                TL_account.verifyEmail verifyemail2 = (TL_account.verifyEmail) obj;
                org.telegram.ui.xm0 xm0Var = ((org.telegram.ui.gm0) obj5).a;
                if (tL_error12 == null) {
                    ((org.telegram.ui.bm0) xm0Var.x1).c(xm0Var.A, (String) xm0Var.o1.get("email"), null, null, null, null, null, null, null, null, zk0Var, i6Var);
                    break;
                } else {
                    i15 = ((org.telegram.ui.ActionBar.n2) xm0Var).currentAccount;
                    y4.f0(i15, tL_error12, xm0Var, verifyemail2, new Object[0]);
                    i6Var.S(null, null);
                    break;
                }
            case 21:
                org.telegram.ui.tm0 tm0Var = (org.telegram.ui.tm0) obj5;
                TLRPC.TL_error tL_error13 = (TLRPC.TL_error) obj4;
                Bundle bundle4 = (Bundle) obj3;
                TLObject tLObject12 = (TLObject) obj2;
                TLRPC.TL_auth_resendCode tL_auth_resendCode2 = (TLRPC.TL_auth_resendCode) obj;
                org.telegram.ui.xm0 xm0Var2 = tm0Var.M;
                tm0Var.F = false;
                if (tL_error13 == null) {
                    xm0Var2.l1(bundle4, (TLRPC.TL_auth_sentCode) tLObject12, true);
                } else {
                    i16 = ((org.telegram.ui.ActionBar.n2) xm0Var2).currentAccount;
                    org.telegram.ui.ActionBar.b2 f02 = y4.f0(i16, tL_error13, xm0Var2, tL_auth_resendCode2, new Object[0]);
                    if (f02 != null && tL_error13.text.contains("PHONE_CODE_EXPIRED")) {
                        f02.i0 = new org.telegram.ui.pm0(tm0Var, 0);
                    }
                }
                xm0Var2.x1();
                break;
            case 22:
                org.telegram.ui.do0.f0((org.telegram.ui.do0) obj5, (TLRPC.TL_error) obj4, (TLObject) obj3, (String) obj2, (TL_account.getPassword) obj);
                break;
            case 23:
                ClippingImageView[] clippingImageViewArr = (ClippingImageView[]) obj4;
                ArrayList arrayList4 = (ArrayList) obj3;
                Integer num = (Integer) obj2;
                org.telegram.ui.au0 au0Var2 = (org.telegram.ui.au0) obj;
                PhotoViewer photoViewer = ((org.telegram.ui.et0) obj5).r;
                photoViewer.l4 = null;
                org.telegram.ui.ut0 ut0Var = photoViewer.a0;
                if (ut0Var != null && photoViewer.c0 != null) {
                    ut0Var.setLayerType(0, null);
                    photoViewer.j4 = 0;
                    photoViewer.F1();
                    photoViewer.k4 = 0L;
                    photoViewer.C1 = null;
                    photoViewer.A1.a = false;
                    photoViewer.D1 = null;
                    photoViewer.B1.a = false;
                    photoViewer.D2();
                    photoViewer.z2();
                    photoViewer.a0.invalidate();
                    for (ClippingImageView clippingImageView : clippingImageViewArr) {
                        clippingImageView.setVisibility(8);
                    }
                    org.telegram.ui.cu0 cu0Var = photoViewer.m4;
                    if (cu0Var != null) {
                        cu0Var.a.setVisible(true, true);
                    }
                    org.telegram.ui.cu0 cu0Var2 = photoViewer.n4;
                    if (cu0Var2 != null && !cu0Var2.s) {
                        cu0Var2.a.setVisible(false, true);
                    }
                    if (arrayList4 != null && (i17 = photoViewer.Y1) != 3 && i17 != 1 && ((au0Var = photoViewer.d) == null || !au0Var.O())) {
                        photoViewer.R1();
                    }
                    m61 m61Var = photoViewer.B2;
                    if (m61Var != null && m61Var.z() && photoViewer.n1 && !photoViewer.c7.isEmpty()) {
                        PhotoViewer.Z(photoViewer, photoViewer.B2.o());
                        PhotoViewer.Y(photoViewer, true);
                    }
                    if (photoViewer.p4) {
                        PhotoViewer.a0(photoViewer, num.intValue());
                    }
                    if (au0Var2 != null) {
                        au0Var2.d();
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
                    privacyControlActivity.B0();
                    break;
                } else {
                    privacyControlActivity.getClass();
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
                        privacyControlActivity.x0();
                    }
                    privacyControlActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.privacyRulesUpdated, new Object[0]);
                    break;
                }
            case 25:
                TLRPC.UserFull userFull2 = (TLRPC.UserFull) obj3;
                TL_account.TL_birthday tL_birthday2 = (TL_account.TL_birthday) obj2;
                TLRPC.TL_error tL_error14 = (TLRPC.TL_error) obj;
                PrivacyControlActivity privacyControlActivity2 = ((org.telegram.ui.uw0) obj5).d;
                if (((TLObject) obj4) instanceof TLRPC.TL_boolTrue) {
                    ec Q = mc.a0(privacyControlActivity2).Q(R.raw.contact_check, 36, LocaleController.getString(R.string.PrivacyBirthdaySetDone));
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
                        privacyControlActivity2.getMessagesStorage().updateUserInfo(userFull2, false);
                    }
                    if (tL_error14 != null && (str2 = tL_error14.text) != null && str2.startsWith("FLOOD_WAIT_")) {
                        if (privacyControlActivity2.getParentActivity() != null) {
                            Activity parentActivity = privacyControlActivity2.getParentActivity();
                            c6Var = ((org.telegram.ui.ActionBar.n2) privacyControlActivity2).resourceProvider;
                            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(parentActivity, 0, c6Var);
                            String string = LocaleController.getString(R.string.PrivacyBirthdayTooOftenTitle);
                            org.telegram.ui.ActionBar.b2 b2Var2 = alertDialog$Builder2.a;
                            b2Var2.N = string;
                            b2Var2.P = LocaleController.getString(R.string.PrivacyBirthdayTooOftenMessage);
                            alertDialog$Builder2.k(LocaleController.getString(R.string.OK), null);
                            privacyControlActivity2.showDialog(b2Var2);
                            break;
                        }
                    } else {
                        org.telegram.messenger.y1.q(R.string.UnknownError, mc.a0(privacyControlActivity2), R.raw.error, 36);
                        break;
                    }
                }
                break;
            case 26:
                ProfileActivity profileActivity = (ProfileActivity) obj5;
                TLRPC.ChatParticipant chatParticipant = (TLRPC.ChatParticipant) obj3;
                TLRPC.User user2 = (TLRPC.User) obj2;
                org.telegram.messenger.hk hkVar = (org.telegram.messenger.hk) obj;
                if (!(((TLRPC.ChannelParticipant) obj4) instanceof TLRPC.TL_channelParticipantAdmin) && !(chatParticipant instanceof TLRPC.TL_chatParticipantAdmin)) {
                    hkVar.run(1);
                    break;
                } else {
                    AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(profileActivity.getParentActivity(), 0, profileActivity.v0);
                    String string2 = LocaleController.getString(R.string.AppName);
                    org.telegram.ui.ActionBar.b2 b2Var3 = alertDialog$Builder3.a;
                    b2Var3.N = string2;
                    b2Var3.P = LocaleController.formatString(R.string.AdminWillBeRemoved, ContactsController.formatName(user2.first_name, user2.last_name));
                    alertDialog$Builder3.k(LocaleController.getString(R.string.OK), new org.telegram.ui.dl0(hkVar, 11));
                    alertDialog$Builder3.h(LocaleController.getString(R.string.Cancel), null);
                    profileActivity.showDialog(b2Var3);
                    break;
                }
            case 27:
                ProfileActivity profileActivity2 = (ProfileActivity) obj5;
                TLObject tLObject13 = (TLObject) obj4;
                TLRPC.TL_username tL_username = (TLRPC.TL_username) obj3;
                org.telegram.ui.vy0 vy0Var = (org.telegram.ui.vy0) obj2;
                TLRPC.TL_error tL_error15 = (TLRPC.TL_error) obj;
                if (tLObject13 instanceof TL_fragment.TL_collectibleInfo) {
                    TL_fragment.TL_collectibleInfo tL_collectibleInfo = (TL_fragment.TL_collectibleInfo) tLObject13;
                    if (profileActivity2.a1 != 0) {
                        profileActivity2.getMessagesController().getUser(Long.valueOf(profileActivity2.a1));
                    } else {
                        profileActivity2.getMessagesController().getChat(Long.valueOf(profileActivity2.b1));
                    }
                    String str12 = "@" + tL_username.username;
                    String format = LocaleController.getInstance().getFormatterBoostExpired().format(new Date(tL_collectibleInfo.purchase_date * 1000));
                    String formatCurrency = BillingController.getInstance().formatCurrency(tL_collectibleInfo.crypto_amount, tL_collectibleInfo.crypto_currency);
                    String formatCurrency2 = BillingController.getInstance().formatCurrency(tL_collectibleInfo.amount, tL_collectibleInfo.currency);
                    ec w10 = new mc(vy0Var.w, profileActivity2.v0).w(R.drawable.filled_username, AndroidUtilities.withLearnMore(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.FragmentChannelUsername, str12, format, formatCurrency, TextUtils.isEmpty(formatCurrency2) ? "" : a9.p.m("(", formatCurrency2, ")"))), new org.telegram.ui.zs0(14, profileActivity2, tL_collectibleInfo)));
                    org.telegram.ui.u70 u70Var = new org.telegram.ui.u70(17, profileActivity2, tL_collectibleInfo);
                    jb jbVar = w10.e;
                    if (jbVar != null) {
                        jbVar.setOnClickListener(u70Var);
                    }
                    w10.k(false);
                    break;
                } else {
                    mc.b0(tL_error15);
                    break;
                }
            case 28:
                ProfileActivity profileActivity3 = (ProfileActivity) obj5;
                TLObject tLObject14 = (TLObject) obj4;
                String str13 = (String) obj3;
                TLRPC.User user3 = (TLRPC.User) obj2;
                TLRPC.TL_error tL_error16 = (TLRPC.TL_error) obj;
                if (tLObject14 instanceof TL_fragment.TL_collectibleInfo) {
                    org.telegram.ui.s10.a(profileActivity3.getParentActivity(), 1, str13, user3, (TL_fragment.TL_collectibleInfo) tLObject14, profileActivity3.v0);
                    break;
                } else {
                    mc.b0(tL_error16);
                    break;
                }
            default:
                ProfileActivity.X((ProfileActivity) obj5, (TLObject) obj4, (TLRPC.UserFull) obj3, (TL_account.TL_birthday) obj2, (TLRPC.TL_error) obj);
                break;
        }
    }

    public /* synthetic */ l20(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
    }
}
