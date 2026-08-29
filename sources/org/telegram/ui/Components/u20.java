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
import org.telegram.ui.f91;
import org.telegram.ui.qc1;
import org.telegram.ui.zh1;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class u20 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ u20(View view, View view2, WindowManager windowManager, View view3, View view4) {
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
        char c3;
        char c6;
        org.telegram.ui.bo0 bo0Var;
        tc b10;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        boolean z10;
        int i16;
        org.telegram.ui.xt0 xt0Var;
        String str2;
        org.telegram.ui.ActionBar.c6 c6Var;
        int i17 = this.a;
        int i18 = 11;
        TLRPC.TL_wallPaper tL_wallPaper = null;
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
                nx0 nx0Var = (nx0) obj5;
                String str3 = (String) obj4;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj3;
                TLObject tLObject = (TLObject) obj2;
                TextView textView = (TextView) obj;
                nx0Var.l0 = 0;
                String str4 = nx0Var.k0;
                if (str4 != null && str4.equals(str3)) {
                    if (tL_error != null || !(tLObject instanceof TLRPC.TL_boolTrue)) {
                        textView.setText(LocaleController.getString(R.string.ImportStickersLinkTaken));
                        textView.setTextColor(nx0Var.getThemedColor(org.telegram.ui.ActionBar.g6.p7));
                        nx0Var.m0 = false;
                        break;
                    } else {
                        textView.setText(LocaleController.getString(R.string.ImportStickersLinkAvailable));
                        textView.setTextColor(nx0Var.getThemedColor(org.telegram.ui.ActionBar.g6.w6));
                        nx0Var.m0 = true;
                        break;
                    }
                }
                break;
            case 2:
                zx0 zx0Var = (zx0) obj5;
                TLObject tLObject2 = (TLObject) obj4;
                TLRPC.UserFull userFull = (TLRPC.UserFull) obj3;
                TL_account.TL_birthday tL_birthday = (TL_account.TL_birthday) obj2;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj;
                org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                if (U != null) {
                    if (tLObject2 instanceof TLRPC.TL_boolTrue) {
                        mc M = tc.a0(U).M(LocaleController.getString(R.string.PrivacyBirthdaySetDone), LocaleController.getString(R.string.PrivacyBirthdaySetDoneInfo), R.raw.gift);
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
                            MessagesStorage.getInstance(zx0Var.a).updateUserInfo(userFull, false);
                        }
                        if (tL_error2 != null && (str = tL_error2.text) != null && str.startsWith("FLOOD_WAIT_")) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(zx0Var.b.getContext());
                            alertDialog$Builder.a.N = LocaleController.getString(R.string.PrivacyBirthdayTooOftenTitle);
                            alertDialog$Builder.a.P = LocaleController.getString(R.string.PrivacyBirthdayTooOftenMessage);
                            j7.l1.C(R.string.OK, alertDialog$Builder, null);
                            break;
                        } else {
                            j7.l1.v(R.string.UnknownError, tc.a0(U), R.raw.error, 36);
                            break;
                        }
                    }
                }
                break;
            case 3:
                m21 m21Var = (m21) obj5;
                TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) obj3;
                j70 j70Var = (j70) obj2;
                j70 j70Var2 = (j70) obj;
                org.telegram.ui.tn tnVar = m21Var.h;
                if (((MessagesController) obj4).isDialogMuted(m21Var.c, tL_forumTopic.id)) {
                    j70Var.u();
                    NotificationsController.getInstance(m21Var.b).muteDialog(m21Var.c, tL_forumTopic.id, false);
                    if (tc.a(tnVar)) {
                        tc.z(tnVar, 4, 0, m21Var.d).j();
                        break;
                    }
                } else {
                    j70Var.K(j70Var2);
                    break;
                }
                break;
            case 4:
                org.telegram.ui.ht htVar = (org.telegram.ui.ht) obj5;
                TLObject tLObject3 = (TLObject) obj3;
                ArrayList arrayList = (ArrayList) obj2;
                TLRPC.TL_messages_getMyStickers tL_messages_getMyStickers = (TLRPC.TL_messages_getMyStickers) obj;
                if (((TLRPC.TL_error) obj4) == null && (tLObject3 instanceof TLRPC.TL_messages_myStickers)) {
                    TLRPC.TL_messages_myStickers tL_messages_myStickers = (TLRPC.TL_messages_myStickers) tLObject3;
                    ArrayList<TLRPC.StickerSetCovered> arrayList2 = tL_messages_myStickers.sets;
                    int size = arrayList2.size();
                    int i19 = 0;
                    while (i19 < size) {
                        TLRPC.StickerSetCovered stickerSetCovered = arrayList2.get(i19);
                        i19++;
                        TLRPC.StickerSetCovered stickerSetCovered2 = stickerSetCovered;
                        TLRPC.StickerSet stickerSet = stickerSetCovered2.set;
                        if (!stickerSet.emojis && !stickerSet.masks) {
                            TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                            tL_inputStickerSetID.id = stickerSetCovered2.set.id;
                            TLRPC.TL_messages_stickerSet stickerSet2 = MediaDataController.getInstance(htVar.r).getStickerSet((TLRPC.InputStickerSet) tL_inputStickerSetID, true);
                            if (stickerSet2 == null || stickerSet2.documents.size() < 120) {
                                arrayList.add(stickerSetCovered2);
                            }
                        }
                    }
                    if (tL_messages_myStickers.sets.size() == tL_messages_getMyStickers.limit) {
                        tL_messages_getMyStickers.offset_id = ((TLRPC.StickerSetCovered) j7.l1.i(1, tL_messages_myStickers.sets)).set.id;
                        ConnectionsManager.getInstance(htVar.r).sendRequest(tL_messages_getMyStickers, new org.telegram.ui.x9(htVar, arrayList, tL_messages_getMyStickers, 7));
                        break;
                    }
                }
                break;
            case 5:
                org.telegram.ui.fy.I0((org.telegram.ui.fy) obj5, (TLObject) obj4, (TLRPC.UserFull) obj3, (TL_account.TL_birthday) obj2, (TLRPC.TL_error) obj);
                break;
            case 6:
                org.telegram.ui.r50.B((org.telegram.ui.r50) obj5, (org.telegram.ui.ActionBar.c2) obj4, (TLObject) obj3, (TL_phone.exportGroupCallInvite) obj2, (TLRPC.TL_error) obj);
                break;
            case 7:
                org.telegram.ui.r50.x((org.telegram.ui.r50) obj5, (ArrayList) obj4, (ArrayList) obj3, (ArrayList) obj2, (String) obj);
                break;
            case 8:
                LaunchActivity launchActivity = (LaunchActivity) obj5;
                org.telegram.ui.x60 x60Var = (org.telegram.ui.x60) obj4;
                TLObject tLObject4 = (TLObject) obj3;
                TLRPC.TL_wallPaper tL_wallPaper2 = (TLRPC.TL_wallPaper) obj2;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj;
                Pattern pattern = LaunchActivity.x1;
                try {
                    x60Var.run();
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
                if (tLObject4 instanceof TLRPC.TL_wallPaper) {
                    TLRPC.TL_wallPaper tL_wallPaper3 = (TLRPC.TL_wallPaper) tLObject4;
                    if (tL_wallPaper3.pattern) {
                        String str5 = tL_wallPaper3.slug;
                        TLRPC.WallPaperSettings wallPaperSettings = tL_wallPaper2.settings;
                        zh1 zh1Var = new zh1(str5, wallPaperSettings.background_color, wallPaperSettings.second_background_color, wallPaperSettings.third_background_color, wallPaperSettings.fourth_background_color, AndroidUtilities.getWallpaperRotation(wallPaperSettings.rotation, false), r3.intensity / 100.0f, tL_wallPaper2.settings.motion, null);
                        zh1Var.g = tL_wallPaper3;
                        tL_wallPaper3 = zh1Var;
                    }
                    qc1 qc1Var = new qc1(tL_wallPaper3, null, true);
                    TLRPC.WallPaperSettings wallPaperSettings2 = tL_wallPaper2.settings;
                    boolean z11 = wallPaperSettings2.blur;
                    boolean z12 = wallPaperSettings2.motion;
                    float f9 = wallPaperSettings2.intensity;
                    qc1Var.B1 = z11;
                    qc1Var.A1 = z12;
                    qc1Var.j1 = f9;
                    launchActivity.p0(qc1Var);
                    break;
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    org.telegram.ui.b.j(R.string.ErrorOccurred, "\n", sb2);
                    sb2.append(tL_error3.text);
                    launchActivity.B0(c5.N(launchActivity, null, sb2.toString()));
                    break;
                }
            case 9:
                LaunchActivity launchActivity2 = (LaunchActivity) obj5;
                org.telegram.ui.fy fyVar = (org.telegram.ui.fy) obj4;
                org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) obj3;
                TLRPC.User user = (TLRPC.User) obj2;
                String str6 = (String) obj;
                ArrayList arrayList3 = launchActivity2.A0;
                if (fyVar != null) {
                    if (o2Var != null) {
                        o2Var.dismissCurrentDialog();
                    }
                    for (int i20 = 0; i20 < arrayList3.size(); i20++) {
                        if (((Dialog) arrayList3.get(i20)).isShowing()) {
                            ((Dialog) arrayList3.get(i20)).dismiss();
                        }
                    }
                    arrayList3.clear();
                    launchActivity2.p0(fyVar);
                    break;
                } else if (o2Var instanceof org.telegram.ui.tn) {
                    ((org.telegram.ui.tn) o2Var).W9(user.id, str6, true);
                    break;
                }
                break;
            case 10:
                LaunchActivity launchActivity3 = (LaunchActivity) obj5;
                TLObject tLObject5 = (TLObject) obj4;
                TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = (TLRPC.TL_messages_requestUrlAuth) obj3;
                String str7 = (String) obj2;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) obj;
                org.telegram.ui.ActionBar.o2 U2 = LaunchActivity.U();
                if (tLObject5 != null) {
                    if (tLObject5 instanceof TLRPC.TL_urlAuthResultRequest) {
                        org.telegram.ui.pk0.b(false, launchActivity3.K, tL_messages_requestUrlAuth, (TLRPC.TL_urlAuthResultRequest) tLObject5, null, null, null, false, null);
                        break;
                    } else if (tLObject5 instanceof TLRPC.TL_urlAuthResultAccepted) {
                        org.telegram.ui.pk0.b(false, launchActivity3.K, tL_messages_requestUrlAuth, (TLRPC.TL_urlAuthResultAccepted) tLObject5, null, null, null, false, null);
                        break;
                    } else if (tLObject5 instanceof TLRPC.TL_urlAuthResultDefault) {
                        c5.q0(U2, str7, false, true);
                        break;
                    }
                } else if (tL_error4 != null) {
                    if ("URL_EXPIRED".equalsIgnoreCase(tL_error4.text)) {
                        org.telegram.ui.pk0.a().M(launchActivity3.getString(R.string.BotAuthLoggedInFailTitle), launchActivity3.getString(R.string.BotAuthLoggedInFailNoDomain), R.raw.error).j();
                        break;
                    } else {
                        org.telegram.ui.pk0.a().d0(tL_error4, false);
                        break;
                    }
                }
                break;
            case 11:
                LaunchActivity launchActivity4 = (LaunchActivity) obj5;
                TLObject tLObject6 = (TLObject) obj4;
                org.telegram.ui.ActionBar.c2 c2Var = (org.telegram.ui.ActionBar.c2) obj3;
                org.telegram.ui.x60 x60Var2 = (org.telegram.ui.x60) obj2;
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
                                    launchActivity4.R0 = c2Var;
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
                                x60Var2.run();
                            } catch (Exception e11) {
                                FileLog.e(e11);
                            }
                            launchActivity4.n0(tL_theme, tL_wallPaper, N0);
                            c6 = 0;
                        } else {
                            c6 = 1;
                        }
                        c3 = c6;
                    } else {
                        TLRPC.Document document = tL_theme.document;
                        if (document != null) {
                            launchActivity4.Q0 = false;
                            launchActivity4.P0 = tL_theme;
                            launchActivity4.L0 = FileLoader.getAttachFileName(document);
                            launchActivity4.R0 = c2Var;
                            FileLoader.getInstance(launchActivity4.K).loadFile(launchActivity4.P0.document, tL_theme, 1, 1);
                            c3 = 0;
                        }
                        c3 = 1;
                    }
                } else {
                    if (tL_error5 == null || !"THEME_FORMAT_INVALID".equals(tL_error5.text)) {
                        c3 = 2;
                    }
                    c3 = 1;
                }
                if (c3 != 0) {
                    try {
                        x60Var2.run();
                    } catch (Exception e12) {
                        FileLog.e(e12);
                    }
                    if (c3 == 1) {
                        launchActivity4.B0(c5.N(launchActivity4, LocaleController.getString(R.string.Theme), LocaleController.getString(R.string.ThemeNotSupported)));
                        break;
                    } else {
                        launchActivity4.B0(c5.N(launchActivity4, LocaleController.getString(R.string.Theme), LocaleController.getString(R.string.ThemeNotFound)));
                        break;
                    }
                }
                break;
            case 12:
                org.telegram.ui.mb0 mb0Var = (org.telegram.ui.mb0) obj5;
                TLRPC.TL_error tL_error6 = (TLRPC.TL_error) obj4;
                TLObject tLObject7 = (TLObject) obj3;
                TLRPC.TL_inputInvoiceSlug tL_inputInvoiceSlug = (TLRPC.TL_inputInvoiceSlug) obj2;
                String str8 = (String) obj;
                int i21 = mb0Var.b;
                LaunchActivity launchActivity5 = mb0Var.a;
                if (tL_error6 != null) {
                    if ("SUBSCRIPTION_ALREADY_ACTIVE".equalsIgnoreCase(tL_error6.text)) {
                        b10 = org.telegram.ui.mb0.b();
                        i10 = R.string.PaymentInvoiceSubscriptionLinkAlreadyPaid;
                    } else {
                        b10 = org.telegram.ui.mb0.b();
                        i10 = R.string.PaymentInvoiceLinkInvalid;
                    }
                    org.telegram.messenger.x3.s(i10, b10, null);
                } else if (!launchActivity5.isFinishing()) {
                    if (tLObject7 instanceof TLRPC.TL_payments_paymentFormStars) {
                        ih.u5 u5Var = launchActivity5.U0;
                        launchActivity5.U0 = null;
                        jh.s7.y(i21, false).Y(null, tL_inputInvoiceSlug, (TLRPC.TL_payments_paymentFormStars) tLObject7, new org.telegram.ui.gb0(mb0Var, 1), new org.telegram.ui.r80(u5Var, 1));
                        break;
                    } else {
                        if (tLObject7 instanceof TLRPC.PaymentForm) {
                            TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject7;
                            MessagesController.getInstance(i21).putUsers(paymentForm.users, false);
                            bo0Var = new org.telegram.ui.bo0(paymentForm, null, str8, LaunchActivity.U());
                        } else {
                            bo0Var = tLObject7 instanceof TLRPC.PaymentReceipt ? new org.telegram.ui.bo0((TLRPC.PaymentReceipt) tLObject7) : null;
                        }
                        if (bo0Var != null) {
                            ih.u5 u5Var2 = launchActivity5.U0;
                            if (u5Var2 != null) {
                                launchActivity5.U0 = null;
                                bo0Var.V0 = new org.telegram.ui.ze(10, u5Var2);
                            }
                            mb0Var.n(bo0Var, false);
                        }
                    }
                }
                mb0Var.a();
                break;
            case 13:
                org.telegram.ui.fg0.U((org.telegram.ui.fg0) obj5, (TLRPC.TL_error) obj4, (String) obj3, (String) obj2, (String) obj);
                break;
            case 14:
                TLObject tLObject8 = (TLObject) obj4;
                Bundle bundle = (Bundle) obj3;
                TLRPC.TL_error tL_error7 = (TLRPC.TL_error) obj2;
                TLRPC.TL_auth_resendCode tL_auth_resendCode = (TLRPC.TL_auth_resendCode) obj;
                org.telegram.ui.fg0 fg0Var = ((org.telegram.ui.pd0) obj5).S;
                if (tLObject8 instanceof TLRPC.TL_auth_sentCode) {
                    fg0Var.g1(bundle, (TLRPC.TL_auth_sentCode) tLObject8, true);
                    break;
                } else if (tL_error7 != null && tL_error7.text != null) {
                    i11 = ((org.telegram.ui.ActionBar.o2) fg0Var).currentAccount;
                    c5.f0(i11, tL_error7, fg0Var, tL_auth_resendCode, new Object[0]);
                    break;
                }
                break;
            case 15:
                org.telegram.ui.te0 te0Var = (org.telegram.ui.te0) obj5;
                TLObject tLObject9 = (TLObject) obj4;
                Bundle bundle2 = (Bundle) obj3;
                TLRPC.TL_error tL_error8 = (TLRPC.TL_error) obj2;
                TL_account.sendVerifyEmailCode sendverifyemailcode = (TL_account.sendVerifyEmailCode) obj;
                org.telegram.ui.fg0 fg0Var2 = te0Var.A;
                fg0Var2.k1(false, true);
                te0Var.r = false;
                if (tLObject9 instanceof TL_account.sentEmailCode) {
                    TL_account.sentEmailCode sentemailcode = (TL_account.sentEmailCode) tLObject9;
                    bundle2.putString("emailPattern", sentemailcode.email_pattern);
                    bundle2.putInt("length", sentemailcode.length);
                    fg0Var2.u1(13, true, bundle2, false);
                    break;
                } else {
                    String str9 = tL_error8.text;
                    if (str9 != null) {
                        if (str9.contains("EMAIL_INVALID")) {
                            te0Var.o();
                            break;
                        } else if (tL_error8.text.contains("EMAIL_NOT_ALLOWED")) {
                            fg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.EmailNotAllowed));
                            break;
                        } else if (tL_error8.text.contains("PHONE_PASSWORD_FLOOD")) {
                            fg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("FloodWait", R.string.FloodWait));
                            break;
                        } else if (tL_error8.text.contains("PHONE_NUMBER_FLOOD")) {
                            fg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("PhoneNumberFlood", R.string.PhoneNumberFlood));
                            break;
                        } else if (!tL_error8.text.contains("PHONE_CODE_EMPTY") && !tL_error8.text.contains("PHONE_CODE_INVALID")) {
                            if (tL_error8.text.contains("PHONE_CODE_EXPIRED")) {
                                fg0Var2.u1(0, true, null, true);
                                fg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("CodeExpired", R.string.CodeExpired));
                                break;
                            } else if (tL_error8.text.startsWith("FLOOD_WAIT")) {
                                fg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("FloodWait", R.string.FloodWait));
                                break;
                            } else if (tL_error8.code != -1000) {
                                i12 = ((org.telegram.ui.ActionBar.o2) fg0Var2).currentAccount;
                                c5.f0(i12, tL_error8, fg0Var2, sendverifyemailcode, te0Var.w);
                                break;
                            }
                        } else {
                            fg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("InvalidCode", R.string.InvalidCode));
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
                org.telegram.ui.fg0 fg0Var3 = ((org.telegram.ui.te0) obj5).A;
                if (!(tLObject10 instanceof TL_account.TL_emailVerified) || fg0Var3.B != 3) {
                    if (tLObject10 instanceof TL_account.TL_emailVerifiedLogin) {
                        TL_account.TL_emailVerifiedLogin tL_emailVerifiedLogin = (TL_account.TL_emailVerifiedLogin) tLObject10;
                        bundle3.putString("email", tL_emailVerifiedLogin.email);
                        fg0Var3.g1(bundle3, tL_emailVerifiedLogin.sent_code, true);
                        break;
                    } else if (tL_error9 != null) {
                        if (tL_error9.text.contains("EMAIL_NOT_ALLOWED")) {
                            fg0Var3.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.EmailNotAllowed));
                            break;
                        } else if (tL_error9.text.contains("EMAIL_TOKEN_INVALID")) {
                            fg0Var3.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.EmailTokenInvalid));
                            break;
                        } else if (tL_error9.code != -1000) {
                            i13 = ((org.telegram.ui.ActionBar.o2) fg0Var3).currentAccount;
                            c5.f0(i13, tL_error9, fg0Var3, verifyemail, new Object[0]);
                            break;
                        }
                    }
                } else {
                    fg0Var3.finishFragment();
                    fg0Var3.Z.run();
                    break;
                }
                break;
            case 17:
                final org.telegram.ui.of0 of0Var = (org.telegram.ui.of0) obj5;
                TLObject tLObject11 = (TLObject) obj4;
                TLRPC.TL_inputInvoicePremiumAuthCode tL_inputInvoicePremiumAuthCode = (TLRPC.TL_inputInvoicePremiumAuthCode) obj3;
                final TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode = (TLRPC.TL_inputStorePaymentAuthCode) obj2;
                TLRPC.TL_error tL_error10 = (TLRPC.TL_error) obj;
                org.telegram.ui.fg0 fg0Var4 = of0Var.v;
                of0Var.b.setLoading(false);
                if (tLObject11 instanceof TLRPC.PaymentForm) {
                    final TLRPC.PaymentForm paymentForm2 = (TLRPC.PaymentForm) tLObject11;
                    fg0Var4.getMessagesController().putUsers(paymentForm2.users, false);
                    org.telegram.ui.bo0 bo0Var2 = new org.telegram.ui.bo0(tL_inputInvoicePremiumAuthCode, paymentForm2, null, null, 4, null, null, null, null, null, null, false, null, fg0Var4, true);
                    bo0Var2.R0 = true;
                    final int i22 = 0;
                    bo0Var2.Y0 = new Utilities.Callback() { // from class: org.telegram.ui.jf0
                        @Override // org.telegram.messenger.Utilities.Callback
                        public final void run(Object obj6) {
                            switch (i22) {
                                case 0:
                                    final int i23 = 0;
                                    final of0 of0Var2 = of0Var;
                                    final TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode2 = tL_inputStorePaymentAuthCode;
                                    final TLRPC.PaymentForm paymentForm3 = paymentForm2;
                                    AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.mf0
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i23) {
                                                case 0:
                                                    TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode3 = tL_inputStorePaymentAuthCode2;
                                                    String str10 = tL_inputStorePaymentAuthCode3.phone_number;
                                                    String str11 = tL_inputStorePaymentAuthCode3.phone_code_hash;
                                                    long j10 = paymentForm3.form_id;
                                                    of0 of0Var3 = of0Var2;
                                                    if (!of0Var3.f) {
                                                        of0Var3.f = true;
                                                        of0Var3.h = str10;
                                                        of0Var3.n = str11;
                                                        of0Var3.r = j10;
                                                        of0Var3.b.setLoading(true);
                                                        of0Var3.p();
                                                        break;
                                                    }
                                                    break;
                                                default:
                                                    TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode4 = tL_inputStorePaymentAuthCode2;
                                                    String str12 = tL_inputStorePaymentAuthCode4.phone_number;
                                                    String str13 = tL_inputStorePaymentAuthCode4.phone_code_hash;
                                                    long j11 = paymentForm3.form_id;
                                                    of0 of0Var4 = of0Var2;
                                                    if (!of0Var4.f) {
                                                        of0Var4.f = true;
                                                        of0Var4.h = str12;
                                                        of0Var4.n = str13;
                                                        of0Var4.r = j11;
                                                        of0Var4.b.setLoading(true);
                                                        of0Var4.p();
                                                        break;
                                                    }
                                                    break;
                                            }
                                        }
                                    });
                                    break;
                                default:
                                    final int i24 = 1;
                                    final of0 of0Var3 = of0Var;
                                    final TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode3 = tL_inputStorePaymentAuthCode;
                                    final TLRPC.PaymentForm paymentForm4 = paymentForm2;
                                    AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.mf0
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i24) {
                                                case 0:
                                                    TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode32 = tL_inputStorePaymentAuthCode3;
                                                    String str10 = tL_inputStorePaymentAuthCode32.phone_number;
                                                    String str11 = tL_inputStorePaymentAuthCode32.phone_code_hash;
                                                    long j10 = paymentForm4.form_id;
                                                    of0 of0Var32 = of0Var3;
                                                    if (!of0Var32.f) {
                                                        of0Var32.f = true;
                                                        of0Var32.h = str10;
                                                        of0Var32.n = str11;
                                                        of0Var32.r = j10;
                                                        of0Var32.b.setLoading(true);
                                                        of0Var32.p();
                                                        break;
                                                    }
                                                    break;
                                                default:
                                                    TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode4 = tL_inputStorePaymentAuthCode3;
                                                    String str12 = tL_inputStorePaymentAuthCode4.phone_number;
                                                    String str13 = tL_inputStorePaymentAuthCode4.phone_code_hash;
                                                    long j11 = paymentForm4.form_id;
                                                    of0 of0Var4 = of0Var3;
                                                    if (!of0Var4.f) {
                                                        of0Var4.f = true;
                                                        of0Var4.h = str12;
                                                        of0Var4.n = str13;
                                                        of0Var4.r = j11;
                                                        of0Var4.b.setLoading(true);
                                                        of0Var4.p();
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
                    final int i23 = 1;
                    bo0Var2.Z0 = new Utilities.Callback() { // from class: org.telegram.ui.jf0
                        @Override // org.telegram.messenger.Utilities.Callback
                        public final void run(Object obj6) {
                            switch (i23) {
                                case 0:
                                    final int i232 = 0;
                                    final of0 of0Var2 = of0Var;
                                    final TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode2 = tL_inputStorePaymentAuthCode;
                                    final TLRPC.PaymentForm paymentForm3 = paymentForm2;
                                    AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.mf0
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i232) {
                                                case 0:
                                                    TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode32 = tL_inputStorePaymentAuthCode2;
                                                    String str10 = tL_inputStorePaymentAuthCode32.phone_number;
                                                    String str11 = tL_inputStorePaymentAuthCode32.phone_code_hash;
                                                    long j10 = paymentForm3.form_id;
                                                    of0 of0Var32 = of0Var2;
                                                    if (!of0Var32.f) {
                                                        of0Var32.f = true;
                                                        of0Var32.h = str10;
                                                        of0Var32.n = str11;
                                                        of0Var32.r = j10;
                                                        of0Var32.b.setLoading(true);
                                                        of0Var32.p();
                                                        break;
                                                    }
                                                    break;
                                                default:
                                                    TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode4 = tL_inputStorePaymentAuthCode2;
                                                    String str12 = tL_inputStorePaymentAuthCode4.phone_number;
                                                    String str13 = tL_inputStorePaymentAuthCode4.phone_code_hash;
                                                    long j11 = paymentForm3.form_id;
                                                    of0 of0Var4 = of0Var2;
                                                    if (!of0Var4.f) {
                                                        of0Var4.f = true;
                                                        of0Var4.h = str12;
                                                        of0Var4.n = str13;
                                                        of0Var4.r = j11;
                                                        of0Var4.b.setLoading(true);
                                                        of0Var4.p();
                                                        break;
                                                    }
                                                    break;
                                            }
                                        }
                                    });
                                    break;
                                default:
                                    final int i24 = 1;
                                    final of0 of0Var3 = of0Var;
                                    final TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode3 = tL_inputStorePaymentAuthCode;
                                    final TLRPC.PaymentForm paymentForm4 = paymentForm2;
                                    AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.mf0
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i24) {
                                                case 0:
                                                    TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode32 = tL_inputStorePaymentAuthCode3;
                                                    String str10 = tL_inputStorePaymentAuthCode32.phone_number;
                                                    String str11 = tL_inputStorePaymentAuthCode32.phone_code_hash;
                                                    long j10 = paymentForm4.form_id;
                                                    of0 of0Var32 = of0Var3;
                                                    if (!of0Var32.f) {
                                                        of0Var32.f = true;
                                                        of0Var32.h = str10;
                                                        of0Var32.n = str11;
                                                        of0Var32.r = j10;
                                                        of0Var32.b.setLoading(true);
                                                        of0Var32.p();
                                                        break;
                                                    }
                                                    break;
                                                default:
                                                    TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode4 = tL_inputStorePaymentAuthCode3;
                                                    String str12 = tL_inputStorePaymentAuthCode4.phone_number;
                                                    String str13 = tL_inputStorePaymentAuthCode4.phone_code_hash;
                                                    long j11 = paymentForm4.form_id;
                                                    of0 of0Var4 = of0Var3;
                                                    if (!of0Var4.f) {
                                                        of0Var4.f = true;
                                                        of0Var4.h = str12;
                                                        of0Var4.n = str13;
                                                        of0Var4.r = j11;
                                                        of0Var4.b.setLoading(true);
                                                        of0Var4.p();
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
                    bo0Var2.a1 = new org.telegram.ui.v10(of0Var, i23);
                    fg0Var4.presentFragment(bo0Var2);
                    break;
                } else if (tL_error10 != null) {
                    if ("PHONE_CODE_EXPIRED".equalsIgnoreCase(tL_error10.text)) {
                        AndroidUtilities.runOnUIThread(new org.telegram.ui.kf0(of0Var, 0));
                        break;
                    } else {
                        String str10 = tL_error10.text;
                        of0Var.e = str10;
                        new tc(fg0Var4.V, null).H(R.raw.error, LocaleController.formatString(R.string.UnknownErrorCode, str10));
                        break;
                    }
                } else {
                    new tc(fg0Var4.V, null).H(R.raw.error, LocaleController.getString(R.string.UnknownError));
                    break;
                }
            case 18:
                org.telegram.ui.si0 si0Var = (org.telegram.ui.si0) obj5;
                TLRPC.TL_error tL_error11 = (TLRPC.TL_error) obj4;
                uf.b bVar = (uf.b) obj3;
                String str11 = (String) obj2;
                TL_stats.TL_loadAsyncGraph tL_loadAsyncGraph = (TL_stats.TL_loadAsyncGraph) obj;
                si0Var.y = true;
                if (tL_error11 != null || bVar == null) {
                    si0Var.g0();
                    break;
                } else {
                    si0Var.v.put(str11, bVar);
                    f91 f91Var = si0Var.r;
                    f91Var.e = bVar;
                    f91Var.c = tL_loadAsyncGraph.x;
                    si0Var.g0();
                    break;
                }
            case 19:
                org.telegram.ui.kj0.n((org.telegram.ui.kj0) obj5, (TLRPC.TL_contacts_importedContacts) obj4, (TLRPC.TL_inputPhoneContact) obj3, (TLRPC.TL_error) obj2, (TLRPC.TL_contacts_importContacts) obj);
                break;
            case 20:
                TLRPC.TL_error tL_error12 = (TLRPC.TL_error) obj4;
                org.telegram.ui.vk0 vk0Var = (org.telegram.ui.vk0) obj3;
                oc.i iVar = (oc.i) obj2;
                TL_account.verifyEmail verifyemail2 = (TL_account.verifyEmail) obj;
                org.telegram.ui.vm0 vm0Var = ((org.telegram.ui.dm0) obj5).a;
                if (tL_error12 == null) {
                    ((org.telegram.ui.yl0) vm0Var.x1).c(vm0Var.A, (String) vm0Var.o1.get("email"), null, null, null, null, null, null, null, null, vk0Var, iVar);
                    break;
                } else {
                    i14 = ((org.telegram.ui.ActionBar.o2) vm0Var).currentAccount;
                    c5.f0(i14, tL_error12, vm0Var, verifyemail2, new Object[0]);
                    iVar.M(null, null);
                    break;
                }
            case 21:
                org.telegram.ui.rm0 rm0Var = (org.telegram.ui.rm0) obj5;
                TLRPC.TL_error tL_error13 = (TLRPC.TL_error) obj4;
                Bundle bundle4 = (Bundle) obj3;
                TLObject tLObject12 = (TLObject) obj2;
                TLRPC.TL_auth_resendCode tL_auth_resendCode2 = (TLRPC.TL_auth_resendCode) obj;
                org.telegram.ui.vm0 vm0Var2 = rm0Var.M;
                rm0Var.F = false;
                if (tL_error13 == null) {
                    vm0Var2.l1(bundle4, (TLRPC.TL_auth_sentCode) tLObject12, true);
                } else {
                    i15 = ((org.telegram.ui.ActionBar.o2) vm0Var2).currentAccount;
                    org.telegram.ui.ActionBar.c2 f02 = c5.f0(i15, tL_error13, vm0Var2, tL_auth_resendCode2, new Object[0]);
                    if (f02 != null && tL_error13.text.contains("PHONE_CODE_EXPIRED")) {
                        f02.i0 = new org.telegram.ui.mm0(rm0Var, 0);
                    }
                }
                vm0Var2.x1();
                break;
            case 22:
                org.telegram.ui.bo0.f0((org.telegram.ui.bo0) obj5, (TLRPC.TL_error) obj4, (TLObject) obj3, (String) obj2, (TL_account.getPassword) obj);
                break;
            case 23:
                ClippingImageView[] clippingImageViewArr = (ClippingImageView[]) obj4;
                ArrayList arrayList4 = (ArrayList) obj3;
                Integer num = (Integer) obj2;
                org.telegram.ui.xt0 xt0Var2 = (org.telegram.ui.xt0) obj;
                PhotoViewer photoViewer = ((org.telegram.ui.bt0) obj5).r;
                photoViewer.l4 = null;
                org.telegram.ui.rt0 rt0Var = photoViewer.a0;
                if (rt0Var != null && photoViewer.c0 != null) {
                    rt0Var.setLayerType(0, null);
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
                    org.telegram.ui.zt0 zt0Var = photoViewer.m4;
                    if (zt0Var != null) {
                        z10 = true;
                        zt0Var.a.setVisible(true, true);
                    } else {
                        z10 = true;
                    }
                    org.telegram.ui.zt0 zt0Var2 = photoViewer.n4;
                    if (zt0Var2 != null && !zt0Var2.s) {
                        zt0Var2.a.setVisible(false, z10);
                    }
                    if (arrayList4 != null && (i16 = photoViewer.Y1) != 3 && i16 != z10 && ((xt0Var = photoViewer.d) == null || !xt0Var.O())) {
                        photoViewer.R1();
                    }
                    x61 x61Var = photoViewer.B2;
                    if (x61Var != null && x61Var.z() && photoViewer.n1 && !photoViewer.c7.isEmpty()) {
                        PhotoViewer.Z(photoViewer, photoViewer.B2.o());
                        PhotoViewer.Y(photoViewer, true);
                    }
                    if (photoViewer.p4) {
                        PhotoViewer.a0(photoViewer, num.intValue());
                    }
                    if (xt0Var2 != null) {
                        xt0Var2.d();
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
                        int i24 = globalPrivacySettings2.flags;
                        globalPrivacySettings.flags = i24;
                        globalPrivacySettings.disallowed_stargifts = globalPrivacySettings2.disallowed_stargifts;
                        long j10 = globalPrivacySettings2.noncontact_peers_paid_stars;
                        if (j10 > 0) {
                            globalPrivacySettings.flags = i24 | 32;
                            globalPrivacySettings.noncontact_peers_paid_stars = j10;
                        } else {
                            globalPrivacySettings.flags = i24 & (-33);
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
                PrivacyControlActivity privacyControlActivity2 = ((org.telegram.ui.tw0) obj5).d;
                if (((TLObject) obj4) instanceof TLRPC.TL_boolTrue) {
                    mc Q = tc.a0(privacyControlActivity2).Q(R.raw.contact_check, 36, LocaleController.getString(R.string.PrivacyBirthdaySetDone));
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
                            c6Var = ((org.telegram.ui.ActionBar.o2) privacyControlActivity2).resourceProvider;
                            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(parentActivity, 0, c6Var);
                            String string = LocaleController.getString(R.string.PrivacyBirthdayTooOftenTitle);
                            org.telegram.ui.ActionBar.c2 c2Var2 = alertDialog$Builder2.a;
                            c2Var2.N = string;
                            c2Var2.P = LocaleController.getString(R.string.PrivacyBirthdayTooOftenMessage);
                            alertDialog$Builder2.k(LocaleController.getString(R.string.OK), null);
                            privacyControlActivity2.showDialog(c2Var2);
                            break;
                        }
                    } else {
                        j7.l1.v(R.string.UnknownError, tc.a0(privacyControlActivity2), R.raw.error, 36);
                        break;
                    }
                }
                break;
            case 26:
                ProfileActivity profileActivity = (ProfileActivity) obj5;
                TLRPC.ChatParticipant chatParticipant = (TLRPC.ChatParticipant) obj3;
                TLRPC.User user2 = (TLRPC.User) obj2;
                org.telegram.messenger.kk kkVar = (org.telegram.messenger.kk) obj;
                if (!(((TLRPC.ChannelParticipant) obj4) instanceof TLRPC.TL_channelParticipantAdmin) && !(chatParticipant instanceof TLRPC.TL_chatParticipantAdmin)) {
                    kkVar.run(1);
                    break;
                } else {
                    AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(profileActivity.getParentActivity(), 0, profileActivity.v0);
                    String string2 = LocaleController.getString(R.string.AppName);
                    org.telegram.ui.ActionBar.c2 c2Var3 = alertDialog$Builder3.a;
                    c2Var3.N = string2;
                    c2Var3.P = LocaleController.formatString(R.string.AdminWillBeRemoved, ContactsController.formatName(user2.first_name, user2.last_name));
                    alertDialog$Builder3.k(LocaleController.getString(R.string.OK), new org.telegram.ui.zk0(kkVar, 11));
                    alertDialog$Builder3.h(LocaleController.getString(R.string.Cancel), null);
                    profileActivity.showDialog(c2Var3);
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
                    mc w10 = new tc(vy0Var.w, profileActivity2.v0).w(R.drawable.filled_username, AndroidUtilities.withLearnMore(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.FragmentChannelUsername, str12, format, formatCurrency, TextUtils.isEmpty(formatCurrency2) ? "" : a4.w.n("(", formatCurrency2, ")"))), new org.telegram.ui.av0(i18, profileActivity2, tL_collectibleInfo)));
                    org.telegram.ui.t70 t70Var = new org.telegram.ui.t70(17, profileActivity2, tL_collectibleInfo);
                    rb rbVar = w10.e;
                    if (rbVar != null) {
                        rbVar.setOnClickListener(t70Var);
                    }
                    w10.k(false);
                    break;
                } else {
                    tc.b0(tL_error15);
                    break;
                }
            case 28:
                ProfileActivity profileActivity3 = (ProfileActivity) obj5;
                TLObject tLObject14 = (TLObject) obj4;
                String str13 = (String) obj3;
                TLRPC.User user3 = (TLRPC.User) obj2;
                TLRPC.TL_error tL_error16 = (TLRPC.TL_error) obj;
                if (tLObject14 instanceof TL_fragment.TL_collectibleInfo) {
                    org.telegram.ui.r10.a(profileActivity3.getParentActivity(), 1, str13, user3, (TL_fragment.TL_collectibleInfo) tLObject14, profileActivity3.v0);
                    break;
                } else {
                    tc.b0(tL_error16);
                    break;
                }
            default:
                ProfileActivity.X((ProfileActivity) obj5, (TLObject) obj4, (TLRPC.UserFull) obj3, (TL_account.TL_birthday) obj2, (TLRPC.TL_error) obj);
                break;
        }
    }

    public /* synthetic */ u20(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
    }
}
