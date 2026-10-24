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
import org.telegram.ui.qc1;
import org.telegram.ui.zh1;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final /* synthetic */ class g30 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ g30(View view, View view2, WindowManager windowManager, View view3, View view4) {
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
        org.telegram.ui.io0 io0Var;
        xc d;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        org.telegram.ui.ku0 ku0Var;
        String str2;
        org.telegram.ui.ActionBar.g6 g6Var;
        int i18 = this.a;
        int i19 = 10;
        TLRPC.TL_wallPaper tL_wallPaper = null;
        final int i20 = 1;
        final int i21 = 0;
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
                ty0.w((ty0) obj5, (String) obj4, (TLRPC.TL_error) obj3, (TLObject) obj2, (TextView) obj);
                break;
            case 2:
                ez0 ez0Var = (ez0) obj5;
                TLObject tLObject = (TLObject) obj4;
                TLRPC.UserFull userFull = (TLRPC.UserFull) obj3;
                TL_account.TL_birthday tL_birthday = (TL_account.TL_birthday) obj2;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                if (U != null) {
                    if (tLObject instanceof TLRPC.TL_boolTrue) {
                        qc M = xc.a0(U).M(LocaleController.getString(R.string.PrivacyBirthdaySetDone), LocaleController.getString(R.string.PrivacyBirthdaySetDoneInfo), R.raw.gift);
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
                            MessagesStorage.getInstance(ez0Var.a).updateUserInfo(userFull, false);
                        }
                        if (tL_error != null && (str = tL_error.text) != null && str.startsWith("FLOOD_WAIT_")) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ez0Var.b.getContext());
                            alertDialog$Builder.a.R = LocaleController.getString(R.string.PrivacyBirthdayTooOftenTitle);
                            alertDialog$Builder.a.T = LocaleController.getString(R.string.PrivacyBirthdayTooOftenMessage);
                            org.telegram.messenger.v0.o(R.string.OK, alertDialog$Builder, null);
                            break;
                        } else {
                            org.telegram.messenger.v0.p(R.string.UnknownError, xc.a0(U), R.raw.error, 36);
                            break;
                        }
                    }
                }
                break;
            case 3:
                w31 w31Var = (w31) obj5;
                TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) obj3;
                j80 j80Var = (j80) obj2;
                j80 j80Var2 = (j80) obj;
                org.telegram.ui.sn snVar = w31Var.h;
                if (((MessagesController) obj4).isDialogMuted(w31Var.c, tL_forumTopic.id)) {
                    j80Var.u();
                    NotificationsController.getInstance(w31Var.b).muteDialog(w31Var.c, tL_forumTopic.id, false);
                    if (xc.a(snVar)) {
                        xc.z(snVar, 4, 0, w31Var.d).j();
                        break;
                    }
                } else {
                    j80Var.K(j80Var2);
                    break;
                }
                break;
            case 4:
                org.telegram.ui.ht htVar = (org.telegram.ui.ht) obj5;
                TLObject tLObject2 = (TLObject) obj3;
                ArrayList arrayList = (ArrayList) obj2;
                TLRPC.TL_messages_getMyStickers tL_messages_getMyStickers = (TLRPC.TL_messages_getMyStickers) obj;
                if (((TLRPC.TL_error) obj4) == null && (tLObject2 instanceof TLRPC.TL_messages_myStickers)) {
                    TLRPC.TL_messages_myStickers tL_messages_myStickers = (TLRPC.TL_messages_myStickers) tLObject2;
                    ArrayList<TLRPC.StickerSetCovered> arrayList2 = tL_messages_myStickers.sets;
                    int size = arrayList2.size();
                    while (i21 < size) {
                        TLRPC.StickerSetCovered stickerSetCovered = arrayList2.get(i21);
                        i21++;
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
                        tL_messages_getMyStickers.offset_id = ((TLRPC.StickerSetCovered) i2.o1.i(1, tL_messages_myStickers.sets)).set.id;
                        ConnectionsManager.getInstance(htVar.r).sendRequest(tL_messages_getMyStickers, new org.telegram.ui.ca(htVar, arrayList, tL_messages_getMyStickers, 7));
                        break;
                    }
                }
                break;
            case 5:
                org.telegram.ui.ey.E0((org.telegram.ui.ey) obj5, (TLObject) obj4, (TLRPC.UserFull) obj3, (TL_account.TL_birthday) obj2, (TLRPC.TL_error) obj);
                break;
            case 6:
                org.telegram.ui.u50.B((org.telegram.ui.u50) obj5, (org.telegram.ui.ActionBar.c2) obj4, (TLObject) obj3, (TL_phone.exportGroupCallInvite) obj2, (TLRPC.TL_error) obj);
                break;
            case 7:
                org.telegram.ui.u50.y((org.telegram.ui.u50) obj5, (ArrayList) obj4, (ArrayList) obj3, (ArrayList) obj2, (String) obj);
                break;
            case 8:
                LaunchActivity launchActivity = (LaunchActivity) obj5;
                org.telegram.ui.f80 f80Var = (org.telegram.ui.f80) obj4;
                TLObject tLObject3 = (TLObject) obj3;
                TLRPC.TL_wallPaper tL_wallPaper2 = (TLRPC.TL_wallPaper) obj2;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj;
                Pattern pattern = LaunchActivity.E1;
                try {
                    f80Var.run();
                } catch (Exception e) {
                    FileLog.e(e);
                }
                if (tLObject3 instanceof TLRPC.TL_wallPaper) {
                    TLRPC.TL_wallPaper tL_wallPaper3 = (TLRPC.TL_wallPaper) tLObject3;
                    if (tL_wallPaper3.pattern) {
                        String str3 = tL_wallPaper3.slug;
                        TLRPC.WallPaperSettings wallPaperSettings = tL_wallPaper2.settings;
                        zh1 zh1Var = new zh1(str3, wallPaperSettings.background_color, wallPaperSettings.second_background_color, wallPaperSettings.third_background_color, wallPaperSettings.fourth_background_color, AndroidUtilities.getWallpaperRotation(wallPaperSettings.rotation, false), r3.intensity / 100.0f, tL_wallPaper2.settings.motion, null);
                        zh1Var.g = tL_wallPaper3;
                        tL_wallPaper3 = zh1Var;
                    }
                    qc1 qc1Var = new qc1(tL_wallPaper3, null, true);
                    TLRPC.WallPaperSettings wallPaperSettings2 = tL_wallPaper2.settings;
                    boolean z10 = wallPaperSettings2.blur;
                    boolean z11 = wallPaperSettings2.motion;
                    float f7 = wallPaperSettings2.intensity;
                    qc1Var.G1 = z10;
                    qc1Var.F1 = z11;
                    qc1Var.o1 = f7;
                    launchActivity.u0(qc1Var);
                    break;
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    org.telegram.ui.Cells.b1.o(R.string.ErrorOccurred, "\n", sb2);
                    sb2.append(tL_error2.text);
                    launchActivity.G0(f5.N(launchActivity, null, sb2.toString()));
                    break;
                }
            case 9:
                LaunchActivity launchActivity2 = (LaunchActivity) obj5;
                org.telegram.ui.ey eyVar = (org.telegram.ui.ey) obj4;
                org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) obj3;
                TLRPC.User user = (TLRPC.User) obj2;
                String str4 = (String) obj;
                ArrayList arrayList3 = launchActivity2.E0;
                if (eyVar != null) {
                    if (o2Var != null) {
                        o2Var.dismissCurrentDialog();
                    }
                    while (i21 < arrayList3.size()) {
                        if (((Dialog) arrayList3.get(i21)).isShowing()) {
                            ((Dialog) arrayList3.get(i21)).dismiss();
                        }
                        i21++;
                    }
                    arrayList3.clear();
                    launchActivity2.u0(eyVar);
                    break;
                } else if (o2Var instanceof org.telegram.ui.sn) {
                    ((org.telegram.ui.sn) o2Var).ba(user.id, str4, true);
                    break;
                }
                break;
            case 10:
                LaunchActivity launchActivity3 = (LaunchActivity) obj5;
                TLObject tLObject4 = (TLObject) obj4;
                TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = (TLRPC.TL_messages_requestUrlAuth) obj3;
                String str5 = (String) obj2;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj;
                org.telegram.ui.ActionBar.o2 U2 = LaunchActivity.U();
                if (tLObject4 != null) {
                    if (tLObject4 instanceof TLRPC.TL_urlAuthResultRequest) {
                        org.telegram.ui.xk0.b(false, launchActivity3.O, tL_messages_requestUrlAuth, (TLRPC.TL_urlAuthResultRequest) tLObject4, null, null, null, false, null);
                        break;
                    } else if (tLObject4 instanceof TLRPC.TL_urlAuthResultAccepted) {
                        org.telegram.ui.xk0.b(false, launchActivity3.O, tL_messages_requestUrlAuth, (TLRPC.TL_urlAuthResultAccepted) tLObject4, null, null, null, false, null);
                        break;
                    } else if (tLObject4 instanceof TLRPC.TL_urlAuthResultDefault) {
                        f5.q0(U2, str5, false, true);
                        break;
                    }
                } else if (tL_error3 != null) {
                    if ("URL_EXPIRED".equalsIgnoreCase(tL_error3.text)) {
                        org.telegram.ui.xk0.a().M(LocaleController.getString(R.string.BotAuthLoggedInFailTitle), LocaleController.getString(R.string.BotAuthLoggedInFailNoDomain), R.raw.error).j();
                        break;
                    } else {
                        org.telegram.ui.xk0.a().f0(tL_error3, false);
                        break;
                    }
                }
                break;
            case 11:
                LaunchActivity launchActivity4 = (LaunchActivity) obj5;
                TLObject tLObject5 = (TLObject) obj4;
                org.telegram.ui.ActionBar.c2 c2Var = (org.telegram.ui.ActionBar.c2) obj3;
                org.telegram.ui.f80 f80Var2 = (org.telegram.ui.f80) obj2;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) obj;
                Pattern pattern2 = LaunchActivity.E1;
                if (tLObject5 instanceof TLRPC.TL_theme) {
                    TLRPC.TL_theme tL_theme = (TLRPC.TL_theme) tLObject5;
                    TLRPC.ThemeSettings themeSettings = tL_theme.settings.size() > 0 ? tL_theme.settings.get(0) : null;
                    if (themeSettings != null) {
                        org.telegram.ui.ActionBar.j6 P0 = org.telegram.ui.ActionBar.k6.P0(org.telegram.ui.ActionBar.k6.r0(themeSettings));
                        if (P0 != null) {
                            TLRPC.WallPaper wallPaper = themeSettings.wallpaper;
                            if (wallPaper instanceof TLRPC.TL_wallPaper) {
                                tL_wallPaper = (TLRPC.TL_wallPaper) wallPaper;
                                if (!FileLoader.getInstance(launchActivity4.O).getPathToAttach(tL_wallPaper.document, true).exists()) {
                                    launchActivity4.W0 = c2Var;
                                    launchActivity4.V0 = true;
                                    launchActivity4.T0 = P0;
                                    launchActivity4.U0 = tL_theme;
                                    launchActivity4.S0 = tL_wallPaper;
                                    launchActivity4.R0 = FileLoader.getAttachFileName(tL_wallPaper.document);
                                    FileLoader.getInstance(launchActivity4.O).loadFile(tL_wallPaper.document, tL_wallPaper, 1, 1);
                                    break;
                                }
                            }
                            try {
                                f80Var2.run();
                            } catch (Exception e7) {
                                FileLog.e(e7);
                            }
                            launchActivity4.s0(tL_theme, tL_wallPaper, P0);
                        } else {
                            i21 = 1;
                        }
                    } else {
                        TLRPC.Document document = tL_theme.document;
                        if (document != null) {
                            launchActivity4.V0 = false;
                            launchActivity4.U0 = tL_theme;
                            launchActivity4.Q0 = FileLoader.getAttachFileName(document);
                            launchActivity4.W0 = c2Var;
                            FileLoader.getInstance(launchActivity4.O).loadFile(launchActivity4.U0.document, tL_theme, 1, 1);
                        }
                        i10 = 1;
                    }
                    i10 = i21;
                } else {
                    if (tL_error4 == null || !"THEME_FORMAT_INVALID".equals(tL_error4.text)) {
                        i10 = 2;
                    }
                    i10 = 1;
                }
                if (i10 != 0) {
                    try {
                        f80Var2.run();
                    } catch (Exception e10) {
                        FileLog.e(e10);
                    }
                    if (i10 == 1) {
                        launchActivity4.G0(f5.N(launchActivity4, LocaleController.getString(R.string.Theme), LocaleController.getString(R.string.ThemeNotSupported)));
                        break;
                    } else {
                        launchActivity4.G0(f5.N(launchActivity4, LocaleController.getString(R.string.Theme), LocaleController.getString(R.string.ThemeNotFound)));
                        break;
                    }
                }
                break;
            case 12:
                org.telegram.ui.ob0 ob0Var = (org.telegram.ui.ob0) obj5;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) obj4;
                TLObject tLObject6 = (TLObject) obj3;
                TLRPC.TL_inputInvoiceSlug tL_inputInvoiceSlug = (TLRPC.TL_inputInvoiceSlug) obj2;
                String str6 = (String) obj;
                int i22 = ob0Var.b;
                LaunchActivity launchActivity5 = ob0Var.a;
                if (tL_error5 != null) {
                    if ("SUBSCRIPTION_ALREADY_ACTIVE".equalsIgnoreCase(tL_error5.text)) {
                        d = org.telegram.ui.ob0.d();
                        i11 = R.string.PaymentInvoiceSubscriptionLinkAlreadyPaid;
                    } else {
                        d = org.telegram.ui.ob0.d();
                        i11 = R.string.PaymentInvoiceLinkInvalid;
                    }
                    org.telegram.messenger.sl.q(i11, d, null);
                } else if (!launchActivity5.isFinishing()) {
                    if (tLObject6 instanceof TLRPC.TL_payments_paymentFormStars) {
                        yh.n4 n4Var = launchActivity5.Z0;
                        launchActivity5.Z0 = null;
                        ai.ha.y(i22, false).Y(null, tL_inputInvoiceSlug, (TLRPC.TL_payments_paymentFormStars) tLObject6, new org.telegram.ui.jb0(ob0Var, 1), new org.telegram.ui.h90(n4Var, i20));
                        break;
                    } else {
                        if (tLObject6 instanceof TLRPC.PaymentForm) {
                            TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject6;
                            MessagesController.getInstance(i22).putUsers(paymentForm.users, false);
                            io0Var = new org.telegram.ui.io0(paymentForm, null, str6, LaunchActivity.U());
                        } else {
                            io0Var = tLObject6 instanceof TLRPC.PaymentReceipt ? new org.telegram.ui.io0((TLRPC.PaymentReceipt) tLObject6) : null;
                        }
                        if (io0Var != null) {
                            yh.n4 n4Var2 = launchActivity5.Z0;
                            if (n4Var2 != null) {
                                launchActivity5.Z0 = null;
                                io0Var.Z0 = new org.telegram.ui.gf(i19, n4Var2);
                            }
                            ob0Var.u(io0Var, false);
                        }
                    }
                }
                ob0Var.c();
                break;
            case 13:
                org.telegram.ui.ig0.U((org.telegram.ui.ig0) obj5, (TLRPC.TL_error) obj4, (String) obj3, (String) obj2, (String) obj);
                break;
            case 14:
                TLObject tLObject7 = (TLObject) obj4;
                Bundle bundle = (Bundle) obj3;
                TLRPC.TL_error tL_error6 = (TLRPC.TL_error) obj2;
                TLRPC.TL_auth_resendCode tL_auth_resendCode = (TLRPC.TL_auth_resendCode) obj;
                org.telegram.ui.ig0 ig0Var = ((org.telegram.ui.rd0) obj5).W;
                if (tLObject7 instanceof TLRPC.TL_auth_sentCode) {
                    ig0Var.k1(bundle, (TLRPC.TL_auth_sentCode) tLObject7, true);
                    break;
                } else if (tL_error6 != null && tL_error6.text != null) {
                    i12 = ((org.telegram.ui.ActionBar.o2) ig0Var).currentAccount;
                    f5.f0(i12, tL_error6, ig0Var, tL_auth_resendCode, new Object[0]);
                    break;
                }
                break;
            case 15:
                org.telegram.ui.ye0 ye0Var = (org.telegram.ui.ye0) obj5;
                TLObject tLObject8 = (TLObject) obj4;
                Bundle bundle2 = (Bundle) obj3;
                TLRPC.TL_error tL_error7 = (TLRPC.TL_error) obj2;
                TL_account.sendVerifyEmailCode sendverifyemailcode = (TL_account.sendVerifyEmailCode) obj;
                org.telegram.ui.ig0 ig0Var2 = ye0Var.E;
                ig0Var2.o1(false, true);
                ye0Var.r = false;
                if (tLObject8 instanceof TL_account.sentEmailCode) {
                    TL_account.sentEmailCode sentemailcode = (TL_account.sentEmailCode) tLObject8;
                    bundle2.putString("emailPattern", sentemailcode.email_pattern);
                    bundle2.putInt("length", sentemailcode.length);
                    ig0Var2.y1(13, true, bundle2, false);
                    break;
                } else {
                    String str7 = tL_error7.text;
                    if (str7 != null) {
                        if (str7.contains("EMAIL_INVALID")) {
                            ye0Var.n();
                            break;
                        } else if (tL_error7.text.contains("EMAIL_NOT_ALLOWED")) {
                            ig0Var2.p1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.EmailNotAllowed));
                            break;
                        } else if (tL_error7.text.contains("PHONE_PASSWORD_FLOOD")) {
                            ig0Var2.p1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("FloodWait", R.string.FloodWait));
                            break;
                        } else if (tL_error7.text.contains("PHONE_NUMBER_FLOOD")) {
                            ig0Var2.p1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("PhoneNumberFlood", R.string.PhoneNumberFlood));
                            break;
                        } else if (!tL_error7.text.contains("PHONE_CODE_EMPTY") && !tL_error7.text.contains("PHONE_CODE_INVALID")) {
                            if (tL_error7.text.contains("PHONE_CODE_EXPIRED")) {
                                ig0Var2.y1(0, true, null, true);
                                ig0Var2.p1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("CodeExpired", R.string.CodeExpired));
                                break;
                            } else if (tL_error7.text.startsWith("FLOOD_WAIT")) {
                                ig0Var2.p1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("FloodWait", R.string.FloodWait));
                                break;
                            } else if (tL_error7.code != -1000) {
                                i13 = ((org.telegram.ui.ActionBar.o2) ig0Var2).currentAccount;
                                f5.f0(i13, tL_error7, ig0Var2, sendverifyemailcode, ye0Var.w);
                                break;
                            }
                        } else {
                            ig0Var2.p1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("InvalidCode", R.string.InvalidCode));
                            break;
                        }
                    }
                }
                break;
            case 16:
                TLObject tLObject9 = (TLObject) obj4;
                Bundle bundle3 = (Bundle) obj3;
                TLRPC.TL_error tL_error8 = (TLRPC.TL_error) obj2;
                TL_account.verifyEmail verifyemail = (TL_account.verifyEmail) obj;
                org.telegram.ui.ig0 ig0Var3 = ((org.telegram.ui.ye0) obj5).E;
                if (!(tLObject9 instanceof TL_account.TL_emailVerified) || ig0Var3.F != 3) {
                    if (tLObject9 instanceof TL_account.TL_emailVerifiedLogin) {
                        TL_account.TL_emailVerifiedLogin tL_emailVerifiedLogin = (TL_account.TL_emailVerifiedLogin) tLObject9;
                        bundle3.putString("email", tL_emailVerifiedLogin.email);
                        ig0Var3.k1(bundle3, tL_emailVerifiedLogin.sent_code, true);
                        break;
                    } else if (tL_error8 != null) {
                        if (tL_error8.text.contains("EMAIL_NOT_ALLOWED")) {
                            ig0Var3.p1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.EmailNotAllowed));
                            break;
                        } else if (tL_error8.text.contains("EMAIL_TOKEN_INVALID")) {
                            ig0Var3.p1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.EmailTokenInvalid));
                            break;
                        } else if (tL_error8.code != -1000) {
                            i14 = ((org.telegram.ui.ActionBar.o2) ig0Var3).currentAccount;
                            f5.f0(i14, tL_error8, ig0Var3, verifyemail, new Object[0]);
                            break;
                        }
                    }
                } else {
                    ig0Var3.finishFragment();
                    ig0Var3.d0.run();
                    break;
                }
                break;
            case 17:
                final org.telegram.ui.rf0 rf0Var = (org.telegram.ui.rf0) obj5;
                TLObject tLObject10 = (TLObject) obj4;
                TLRPC.TL_inputInvoicePremiumAuthCode tL_inputInvoicePremiumAuthCode = (TLRPC.TL_inputInvoicePremiumAuthCode) obj3;
                final TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode = (TLRPC.TL_inputStorePaymentAuthCode) obj2;
                TLRPC.TL_error tL_error9 = (TLRPC.TL_error) obj;
                org.telegram.ui.ig0 ig0Var4 = rf0Var.v;
                rf0Var.b.setLoading(false);
                if (tLObject10 instanceof TLRPC.PaymentForm) {
                    final TLRPC.PaymentForm paymentForm2 = (TLRPC.PaymentForm) tLObject10;
                    ig0Var4.getMessagesController().putUsers(paymentForm2.users, false);
                    org.telegram.ui.io0 io0Var2 = new org.telegram.ui.io0(tL_inputInvoicePremiumAuthCode, paymentForm2, null, null, 4, null, null, null, null, null, null, false, null, ig0Var4, true);
                    io0Var2.V0 = true;
                    io0Var2.c1 = new Utilities.Callback() { // from class: org.telegram.ui.nf0
                        @Override // org.telegram.messenger.Utilities.Callback
                        public final void run(Object obj6) {
                            switch (i21) {
                                case 0:
                                    final int i23 = 0;
                                    final rf0 rf0Var2 = rf0Var;
                                    final TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode2 = tL_inputStorePaymentAuthCode;
                                    final TLRPC.PaymentForm paymentForm3 = paymentForm2;
                                    AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.pf0
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i23) {
                                                case 0:
                                                    TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode3 = tL_inputStorePaymentAuthCode2;
                                                    String str8 = tL_inputStorePaymentAuthCode3.phone_number;
                                                    String str9 = tL_inputStorePaymentAuthCode3.phone_code_hash;
                                                    long j10 = paymentForm3.form_id;
                                                    rf0 rf0Var3 = rf0Var2;
                                                    if (!rf0Var3.f) {
                                                        rf0Var3.f = true;
                                                        rf0Var3.h = str8;
                                                        rf0Var3.n = str9;
                                                        rf0Var3.r = j10;
                                                        rf0Var3.b.setLoading(true);
                                                        rf0Var3.o();
                                                        break;
                                                    }
                                                    break;
                                                default:
                                                    TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode4 = tL_inputStorePaymentAuthCode2;
                                                    String str10 = tL_inputStorePaymentAuthCode4.phone_number;
                                                    String str11 = tL_inputStorePaymentAuthCode4.phone_code_hash;
                                                    long j11 = paymentForm3.form_id;
                                                    rf0 rf0Var4 = rf0Var2;
                                                    if (!rf0Var4.f) {
                                                        rf0Var4.f = true;
                                                        rf0Var4.h = str10;
                                                        rf0Var4.n = str11;
                                                        rf0Var4.r = j11;
                                                        rf0Var4.b.setLoading(true);
                                                        rf0Var4.o();
                                                        break;
                                                    }
                                                    break;
                                            }
                                        }
                                    });
                                    break;
                                default:
                                    final int i24 = 1;
                                    final rf0 rf0Var3 = rf0Var;
                                    final TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode3 = tL_inputStorePaymentAuthCode;
                                    final TLRPC.PaymentForm paymentForm4 = paymentForm2;
                                    AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.pf0
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i24) {
                                                case 0:
                                                    TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode32 = tL_inputStorePaymentAuthCode3;
                                                    String str8 = tL_inputStorePaymentAuthCode32.phone_number;
                                                    String str9 = tL_inputStorePaymentAuthCode32.phone_code_hash;
                                                    long j10 = paymentForm4.form_id;
                                                    rf0 rf0Var32 = rf0Var3;
                                                    if (!rf0Var32.f) {
                                                        rf0Var32.f = true;
                                                        rf0Var32.h = str8;
                                                        rf0Var32.n = str9;
                                                        rf0Var32.r = j10;
                                                        rf0Var32.b.setLoading(true);
                                                        rf0Var32.o();
                                                        break;
                                                    }
                                                    break;
                                                default:
                                                    TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode4 = tL_inputStorePaymentAuthCode3;
                                                    String str10 = tL_inputStorePaymentAuthCode4.phone_number;
                                                    String str11 = tL_inputStorePaymentAuthCode4.phone_code_hash;
                                                    long j11 = paymentForm4.form_id;
                                                    rf0 rf0Var4 = rf0Var3;
                                                    if (!rf0Var4.f) {
                                                        rf0Var4.f = true;
                                                        rf0Var4.h = str10;
                                                        rf0Var4.n = str11;
                                                        rf0Var4.r = j11;
                                                        rf0Var4.b.setLoading(true);
                                                        rf0Var4.o();
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
                    io0Var2.d1 = new Utilities.Callback() { // from class: org.telegram.ui.nf0
                        @Override // org.telegram.messenger.Utilities.Callback
                        public final void run(Object obj6) {
                            switch (i20) {
                                case 0:
                                    final int i23 = 0;
                                    final rf0 rf0Var2 = rf0Var;
                                    final TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode2 = tL_inputStorePaymentAuthCode;
                                    final TLRPC.PaymentForm paymentForm3 = paymentForm2;
                                    AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.pf0
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i23) {
                                                case 0:
                                                    TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode32 = tL_inputStorePaymentAuthCode2;
                                                    String str8 = tL_inputStorePaymentAuthCode32.phone_number;
                                                    String str9 = tL_inputStorePaymentAuthCode32.phone_code_hash;
                                                    long j10 = paymentForm3.form_id;
                                                    rf0 rf0Var32 = rf0Var2;
                                                    if (!rf0Var32.f) {
                                                        rf0Var32.f = true;
                                                        rf0Var32.h = str8;
                                                        rf0Var32.n = str9;
                                                        rf0Var32.r = j10;
                                                        rf0Var32.b.setLoading(true);
                                                        rf0Var32.o();
                                                        break;
                                                    }
                                                    break;
                                                default:
                                                    TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode4 = tL_inputStorePaymentAuthCode2;
                                                    String str10 = tL_inputStorePaymentAuthCode4.phone_number;
                                                    String str11 = tL_inputStorePaymentAuthCode4.phone_code_hash;
                                                    long j11 = paymentForm3.form_id;
                                                    rf0 rf0Var4 = rf0Var2;
                                                    if (!rf0Var4.f) {
                                                        rf0Var4.f = true;
                                                        rf0Var4.h = str10;
                                                        rf0Var4.n = str11;
                                                        rf0Var4.r = j11;
                                                        rf0Var4.b.setLoading(true);
                                                        rf0Var4.o();
                                                        break;
                                                    }
                                                    break;
                                            }
                                        }
                                    });
                                    break;
                                default:
                                    final int i24 = 1;
                                    final rf0 rf0Var3 = rf0Var;
                                    final TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode3 = tL_inputStorePaymentAuthCode;
                                    final TLRPC.PaymentForm paymentForm4 = paymentForm2;
                                    AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.pf0
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i24) {
                                                case 0:
                                                    TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode32 = tL_inputStorePaymentAuthCode3;
                                                    String str8 = tL_inputStorePaymentAuthCode32.phone_number;
                                                    String str9 = tL_inputStorePaymentAuthCode32.phone_code_hash;
                                                    long j10 = paymentForm4.form_id;
                                                    rf0 rf0Var32 = rf0Var3;
                                                    if (!rf0Var32.f) {
                                                        rf0Var32.f = true;
                                                        rf0Var32.h = str8;
                                                        rf0Var32.n = str9;
                                                        rf0Var32.r = j10;
                                                        rf0Var32.b.setLoading(true);
                                                        rf0Var32.o();
                                                        break;
                                                    }
                                                    break;
                                                default:
                                                    TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode4 = tL_inputStorePaymentAuthCode3;
                                                    String str10 = tL_inputStorePaymentAuthCode4.phone_number;
                                                    String str11 = tL_inputStorePaymentAuthCode4.phone_code_hash;
                                                    long j11 = paymentForm4.form_id;
                                                    rf0 rf0Var4 = rf0Var3;
                                                    if (!rf0Var4.f) {
                                                        rf0Var4.f = true;
                                                        rf0Var4.h = str10;
                                                        rf0Var4.n = str11;
                                                        rf0Var4.r = j11;
                                                        rf0Var4.b.setLoading(true);
                                                        rf0Var4.o();
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
                    io0Var2.e1 = new org.telegram.ui.x10(rf0Var, i20);
                    ig0Var4.presentFragment(io0Var2);
                    break;
                } else if (tL_error9 != null) {
                    if ("PHONE_CODE_EXPIRED".equalsIgnoreCase(tL_error9.text)) {
                        AndroidUtilities.runOnUIThread(new org.telegram.ui.of0(rf0Var, i21));
                        break;
                    } else {
                        String str8 = tL_error9.text;
                        rf0Var.e = str8;
                        new xc(ig0Var4.Z, null).H(R.raw.error, LocaleController.formatString(R.string.UnknownErrorCode, str8));
                        break;
                    }
                } else {
                    new xc(ig0Var4.Z, null).H(R.raw.error, LocaleController.getString(R.string.UnknownError));
                    break;
                }
            case 18:
                org.telegram.ui.yi0 yi0Var = (org.telegram.ui.yi0) obj5;
                TLRPC.TL_error tL_error10 = (TLRPC.TL_error) obj4;
                kg.b bVar = (kg.b) obj3;
                String str9 = (String) obj2;
                TL_stats.TL_loadAsyncGraph tL_loadAsyncGraph = (TL_stats.TL_loadAsyncGraph) obj;
                yi0Var.y = true;
                if (tL_error10 != null || bVar == null) {
                    yi0Var.h0();
                    break;
                } else {
                    yi0Var.v.put(str9, bVar);
                    org.telegram.ui.g91 g91Var = yi0Var.r;
                    g91Var.e = bVar;
                    g91Var.c = tL_loadAsyncGraph.x;
                    yi0Var.h0();
                    break;
                }
            case 19:
                org.telegram.ui.rj0.n((org.telegram.ui.rj0) obj5, (TLRPC.TL_contacts_importedContacts) obj4, (TLRPC.TL_inputPhoneContact) obj3, (TLRPC.TL_error) obj2, (TLRPC.TL_contacts_importContacts) obj);
                break;
            case 20:
                TLRPC.TL_error tL_error11 = (TLRPC.TL_error) obj4;
                org.telegram.ui.oj0 oj0Var = (org.telegram.ui.oj0) obj3;
                n2.e eVar = (n2.e) obj2;
                TL_account.verifyEmail verifyemail2 = (TL_account.verifyEmail) obj;
                org.telegram.ui.an0 an0Var = ((org.telegram.ui.im0) obj5).a;
                if (tL_error11 == null) {
                    ((org.telegram.ui.dm0) an0Var.B1).c(an0Var.E, (String) an0Var.s1.get("email"), null, null, null, null, null, null, null, null, oj0Var, eVar);
                    break;
                } else {
                    i15 = ((org.telegram.ui.ActionBar.o2) an0Var).currentAccount;
                    f5.f0(i15, tL_error11, an0Var, verifyemail2, new Object[0]);
                    eVar.a(null, null);
                    break;
                }
            case 21:
                org.telegram.ui.wm0 wm0Var = (org.telegram.ui.wm0) obj5;
                TLRPC.TL_error tL_error12 = (TLRPC.TL_error) obj4;
                Bundle bundle4 = (Bundle) obj3;
                TLObject tLObject11 = (TLObject) obj2;
                TLRPC.TL_auth_resendCode tL_auth_resendCode2 = (TLRPC.TL_auth_resendCode) obj;
                org.telegram.ui.an0 an0Var2 = wm0Var.Q;
                wm0Var.J = false;
                if (tL_error12 == null) {
                    an0Var2.k1(bundle4, (TLRPC.TL_auth_sentCode) tLObject11, true);
                } else {
                    i16 = ((org.telegram.ui.ActionBar.o2) an0Var2).currentAccount;
                    org.telegram.ui.ActionBar.c2 f02 = f5.f0(i16, tL_error12, an0Var2, tL_auth_resendCode2, new Object[0]);
                    if (f02 != null && tL_error12.text.contains("PHONE_CODE_EXPIRED")) {
                        f02.o0 = new org.telegram.ui.rm0(wm0Var, i21);
                    }
                }
                an0Var2.w1();
                break;
            case 22:
                org.telegram.ui.io0.f0((org.telegram.ui.io0) obj5, (TLRPC.TL_error) obj4, (TLObject) obj3, (String) obj2, (TL_account.getPassword) obj);
                break;
            case 23:
                ClippingImageView[] clippingImageViewArr = (ClippingImageView[]) obj4;
                ArrayList arrayList4 = (ArrayList) obj3;
                Integer num = (Integer) obj2;
                org.telegram.ui.ku0 ku0Var2 = (org.telegram.ui.ku0) obj;
                PhotoViewer photoViewer = ((org.telegram.ui.ot0) obj5).r;
                photoViewer.p4 = null;
                org.telegram.ui.eu0 eu0Var = photoViewer.e0;
                if (eu0Var != null && photoViewer.g0 != null) {
                    eu0Var.setLayerType(0, null);
                    photoViewer.n4 = 0;
                    photoViewer.H1();
                    photoViewer.o4 = 0L;
                    photoViewer.G1 = null;
                    photoViewer.E1.a = false;
                    photoViewer.H1 = null;
                    photoViewer.F1.a = false;
                    photoViewer.F2();
                    photoViewer.B2();
                    photoViewer.e0.invalidate();
                    for (ClippingImageView clippingImageView : clippingImageViewArr) {
                        clippingImageView.setVisibility(8);
                    }
                    org.telegram.ui.mu0 mu0Var = photoViewer.q4;
                    if (mu0Var != null) {
                        mu0Var.a.setVisible(true, true);
                    }
                    org.telegram.ui.mu0 mu0Var2 = photoViewer.r4;
                    if (mu0Var2 != null && !mu0Var2.s) {
                        mu0Var2.a.setVisible(false, true);
                    }
                    if (arrayList4 != null && (i17 = photoViewer.c2) != 3 && i17 != 1 && ((ku0Var = photoViewer.d) == null || !ku0Var.P())) {
                        photoViewer.U1();
                    }
                    j81 j81Var = photoViewer.F2;
                    if (j81Var != null && j81Var.y() && photoViewer.r1 && !photoViewer.g7.isEmpty()) {
                        PhotoViewer.a0(photoViewer, photoViewer.F2.n());
                        PhotoViewer.Z(photoViewer, true);
                    }
                    if (photoViewer.t4) {
                        PhotoViewer.b0(photoViewer, num.intValue());
                    }
                    if (ku0Var2 != null) {
                        ku0Var2.d();
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
                        int i23 = globalPrivacySettings2.flags;
                        globalPrivacySettings.flags = i23;
                        globalPrivacySettings.disallowed_stargifts = globalPrivacySettings2.disallowed_stargifts;
                        long j10 = globalPrivacySettings2.noncontact_peers_paid_stars;
                        if (j10 > 0) {
                            globalPrivacySettings.flags = i23 | 32;
                            globalPrivacySettings.noncontact_peers_paid_stars = j10;
                        } else {
                            globalPrivacySettings.flags = i23 & (-33);
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
                TLRPC.TL_error tL_error13 = (TLRPC.TL_error) obj;
                PrivacyControlActivity privacyControlActivity2 = ((org.telegram.ui.gx0) obj5).d;
                if (((TLObject) obj4) instanceof TLRPC.TL_boolTrue) {
                    qc Q = xc.a0(privacyControlActivity2).Q(R.raw.contact_check, 36, LocaleController.getString(R.string.PrivacyBirthdaySetDone));
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
                    if (tL_error13 != null && (str2 = tL_error13.text) != null && str2.startsWith("FLOOD_WAIT_")) {
                        if (privacyControlActivity2.getParentActivity() != null) {
                            Activity parentActivity = privacyControlActivity2.getParentActivity();
                            g6Var = ((org.telegram.ui.ActionBar.o2) privacyControlActivity2).resourceProvider;
                            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(parentActivity, 0, g6Var);
                            String string = LocaleController.getString(R.string.PrivacyBirthdayTooOftenTitle);
                            org.telegram.ui.ActionBar.c2 c2Var2 = alertDialog$Builder2.a;
                            c2Var2.R = string;
                            c2Var2.T = LocaleController.getString(R.string.PrivacyBirthdayTooOftenMessage);
                            alertDialog$Builder2.k(LocaleController.getString(R.string.OK), null);
                            privacyControlActivity2.showDialog(c2Var2);
                            break;
                        }
                    } else {
                        org.telegram.messenger.v0.p(R.string.UnknownError, xc.a0(privacyControlActivity2), R.raw.error, 36);
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
                    AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(profileActivity.getParentActivity(), 0, profileActivity.A0);
                    String string2 = LocaleController.getString(R.string.AppName);
                    org.telegram.ui.ActionBar.c2 c2Var3 = alertDialog$Builder3.a;
                    c2Var3.R = string2;
                    c2Var3.T = LocaleController.formatString(R.string.AdminWillBeRemoved, ContactsController.formatName(user2.first_name, user2.last_name));
                    alertDialog$Builder3.k(LocaleController.getString(R.string.OK), new org.telegram.ui.sp0(hkVar, 10));
                    alertDialog$Builder3.h(LocaleController.getString(R.string.Cancel), null);
                    profileActivity.showDialog(c2Var3);
                    break;
                }
                break;
            case 27:
                ProfileActivity profileActivity2 = (ProfileActivity) obj5;
                TLObject tLObject12 = (TLObject) obj4;
                TLRPC.TL_username tL_username = (TLRPC.TL_username) obj3;
                org.telegram.ui.fz0 fz0Var = (org.telegram.ui.fz0) obj2;
                TLRPC.TL_error tL_error14 = (TLRPC.TL_error) obj;
                if (tLObject12 instanceof TL_fragment.TL_collectibleInfo) {
                    TL_fragment.TL_collectibleInfo tL_collectibleInfo = (TL_fragment.TL_collectibleInfo) tLObject12;
                    if (profileActivity2.f1 != 0) {
                        profileActivity2.getMessagesController().getUser(Long.valueOf(profileActivity2.f1));
                    } else {
                        profileActivity2.getMessagesController().getChat(Long.valueOf(profileActivity2.g1));
                    }
                    String str10 = "@" + tL_username.username;
                    String format = LocaleController.getInstance().getFormatterBoostExpired().format(new Date(tL_collectibleInfo.purchase_date * 1000));
                    String formatCurrency = BillingController.getInstance().formatCurrency(tL_collectibleInfo.crypto_amount, tL_collectibleInfo.crypto_currency);
                    String formatCurrency2 = BillingController.getInstance().formatCurrency(tL_collectibleInfo.amount, tL_collectibleInfo.currency);
                    qc w9 = new xc(fz0Var.x, profileActivity2.A0).w(R.drawable.filled_username, AndroidUtilities.withLearnMore(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.FragmentChannelUsername, str10, format, formatCurrency, TextUtils.isEmpty(formatCurrency2) ? "" : a1.g.p("(", formatCurrency2, ")"))), new org.telegram.ui.mv0(i19, profileActivity2, tL_collectibleInfo)));
                    org.telegram.ui.ae0 ae0Var = new org.telegram.ui.ae0(i19, profileActivity2, tL_collectibleInfo);
                    ub ubVar = w9.e;
                    if (ubVar != null) {
                        ubVar.setOnClickListener(ae0Var);
                    }
                    w9.k(false);
                    break;
                } else {
                    xc.d0(tL_error14);
                    break;
                }
            case 28:
                ProfileActivity profileActivity3 = (ProfileActivity) obj5;
                TLObject tLObject13 = (TLObject) obj4;
                String str11 = (String) obj3;
                TLRPC.User user3 = (TLRPC.User) obj2;
                TLRPC.TL_error tL_error15 = (TLRPC.TL_error) obj;
                if (tLObject13 instanceof TL_fragment.TL_collectibleInfo) {
                    org.telegram.ui.t10.a(profileActivity3.getParentActivity(), 1, str11, user3, (TL_fragment.TL_collectibleInfo) tLObject13, profileActivity3.A0);
                    break;
                } else {
                    xc.d0(tL_error15);
                    break;
                }
            default:
                ProfileActivity.Y((ProfileActivity) obj5, (TLObject) obj4, (TLRPC.UserFull) obj3, (TL_account.TL_birthday) obj2, (TLRPC.TL_error) obj);
                break;
        }
    }

    public /* synthetic */ g30(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
    }
}
