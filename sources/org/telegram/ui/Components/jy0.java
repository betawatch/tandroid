package org.telegram.ui.Components;

import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
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
import org.telegram.ui.aa1;
import org.telegram.ui.jd1;
import org.telegram.ui.ui1;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class jy0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ jy0(int i10, Object obj, Object obj2, Object obj3, Object obj4, TLRPC.TL_error tL_error) {
        this.a = i10;
        this.b = obj;
        this.f = tL_error;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        String str;
        int i10;
        org.telegram.ui.lo0 lo0Var;
        qc b10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        org.telegram.ui.ou0 ou0Var;
        String str2;
        org.telegram.ui.ActionBar.f6 f6Var;
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
                ky0 ky0Var = (ky0) obj5;
                TLObject tLObject = (TLObject) obj4;
                TLRPC.UserFull userFull = (TLRPC.UserFull) obj3;
                TL_account.TL_birthday tL_birthday = (TL_account.TL_birthday) obj2;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
                if (U != null) {
                    if (tLObject instanceof TLRPC.TL_boolTrue) {
                        ic M = qc.a0(U).M(LocaleController.getString(R.string.PrivacyBirthdaySetDone), LocaleController.getString(R.string.PrivacyBirthdaySetDoneInfo), R.raw.gift);
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
                            MessagesStorage.getInstance(ky0Var.a).updateUserInfo(userFull, false);
                        }
                        if (tL_error != null && (str = tL_error.text) != null && str.startsWith("FLOOD_WAIT_")) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ky0Var.b.getContext());
                            alertDialog$Builder.a.O = LocaleController.getString(R.string.PrivacyBirthdayTooOftenTitle);
                            alertDialog$Builder.a.Q = LocaleController.getString(R.string.PrivacyBirthdayTooOftenMessage);
                            kf.k0.C(R.string.OK, alertDialog$Builder, null);
                            break;
                        } else {
                            kf.k0.v(R.string.UnknownError, qc.a0(U), R.raw.error, 36);
                            break;
                        }
                    }
                }
                break;
            case 1:
                w21 w21Var = (w21) obj5;
                TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) obj3;
                p70 p70Var = (p70) obj2;
                p70 p70Var2 = (p70) obj;
                org.telegram.ui.zn znVar = w21Var.h;
                if (((MessagesController) obj4).isDialogMuted(w21Var.c, tL_forumTopic.id)) {
                    p70Var.u();
                    NotificationsController.getInstance(w21Var.b).muteDialog(w21Var.c, tL_forumTopic.id, false);
                    if (qc.a(znVar)) {
                        qc.z(znVar, 4, 0, w21Var.d).j();
                        break;
                    }
                } else {
                    p70Var.K(p70Var2);
                    break;
                }
                break;
            case 2:
                org.telegram.ui.rt rtVar = (org.telegram.ui.rt) obj5;
                TLObject tLObject2 = (TLObject) obj4;
                ArrayList arrayList = (ArrayList) obj3;
                TLRPC.TL_messages_getMyStickers tL_messages_getMyStickers = (TLRPC.TL_messages_getMyStickers) obj2;
                if (((TLRPC.TL_error) obj) == null && (tLObject2 instanceof TLRPC.TL_messages_myStickers)) {
                    TLRPC.TL_messages_myStickers tL_messages_myStickers = (TLRPC.TL_messages_myStickers) tLObject2;
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
                            TLRPC.TL_messages_stickerSet stickerSet2 = MediaDataController.getInstance(rtVar.r).getStickerSet((TLRPC.InputStickerSet) tL_inputStickerSetID, true);
                            if (stickerSet2 == null || stickerSet2.documents.size() < 120) {
                                arrayList.add(stickerSetCovered2);
                            }
                        }
                    }
                    if (tL_messages_myStickers.sets.size() == tL_messages_getMyStickers.limit) {
                        tL_messages_getMyStickers.offset_id = ((TLRPC.StickerSetCovered) kf.k0.i(1, tL_messages_myStickers.sets)).set.id;
                        ConnectionsManager.getInstance(rtVar.r).sendRequest(tL_messages_getMyStickers, new org.telegram.ui.da(rtVar, arrayList, tL_messages_getMyStickers, 7));
                        break;
                    }
                }
                break;
            case 3:
                org.telegram.ui.qy.I0((org.telegram.ui.qy) obj5, (TLObject) obj4, (TLRPC.UserFull) obj3, (TL_account.TL_birthday) obj2, (TLRPC.TL_error) obj);
                break;
            case 4:
                org.telegram.ui.e60.B((org.telegram.ui.e60) obj5, (org.telegram.ui.ActionBar.d2) obj3, (TLObject) obj4, (TL_phone.exportGroupCallInvite) obj2, (TLRPC.TL_error) obj);
                break;
            case 5:
                org.telegram.ui.e60.x((org.telegram.ui.e60) obj5, (ArrayList) obj4, (ArrayList) obj3, (ArrayList) obj2, (String) obj);
                break;
            case 6:
                LaunchActivity launchActivity = (LaunchActivity) obj5;
                org.telegram.ui.w10 w10Var = (org.telegram.ui.w10) obj3;
                TLObject tLObject3 = (TLObject) obj4;
                TLRPC.TL_wallPaper tL_wallPaper2 = (TLRPC.TL_wallPaper) obj2;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj;
                Pattern pattern = LaunchActivity.y1;
                try {
                    w10Var.run();
                } catch (Exception e) {
                    FileLog.e(e);
                }
                if (tLObject3 instanceof TLRPC.TL_wallPaper) {
                    TLRPC.TL_wallPaper tL_wallPaper3 = (TLRPC.TL_wallPaper) tLObject3;
                    if (tL_wallPaper3.pattern) {
                        String str3 = tL_wallPaper3.slug;
                        TLRPC.WallPaperSettings wallPaperSettings = tL_wallPaper2.settings;
                        ui1 ui1Var = new ui1(str3, wallPaperSettings.background_color, wallPaperSettings.second_background_color, wallPaperSettings.third_background_color, wallPaperSettings.fourth_background_color, AndroidUtilities.getWallpaperRotation(wallPaperSettings.rotation, false), r2.intensity / 100.0f, tL_wallPaper2.settings.motion, null);
                        ui1Var.g = tL_wallPaper3;
                        tL_wallPaper3 = ui1Var;
                    }
                    jd1 jd1Var = new jd1(tL_wallPaper3, null, true);
                    TLRPC.WallPaperSettings wallPaperSettings2 = tL_wallPaper2.settings;
                    boolean z4 = wallPaperSettings2.blur;
                    boolean z10 = wallPaperSettings2.motion;
                    float f10 = wallPaperSettings2.intensity;
                    jd1Var.C1 = z4;
                    jd1Var.B1 = z10;
                    jd1Var.k1 = f10;
                    launchActivity.p0(jd1Var);
                    break;
                } else {
                    StringBuilder sb = new StringBuilder();
                    org.telegram.ui.b.i(R.string.ErrorOccurred, "\n", sb);
                    sb.append(tL_error2.text);
                    launchActivity.B0(z4.N(launchActivity, null, sb.toString()));
                    break;
                }
            case 7:
                LaunchActivity launchActivity2 = (LaunchActivity) obj5;
                org.telegram.ui.qy qyVar = (org.telegram.ui.qy) obj4;
                org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) obj3;
                TLRPC.User user = (TLRPC.User) obj2;
                String str4 = (String) obj;
                ArrayList arrayList3 = launchActivity2.B0;
                if (qyVar != null) {
                    if (p2Var != null) {
                        p2Var.dismissCurrentDialog();
                    }
                    while (i20 < arrayList3.size()) {
                        if (((Dialog) arrayList3.get(i20)).isShowing()) {
                            ((Dialog) arrayList3.get(i20)).dismiss();
                        }
                        i20++;
                    }
                    arrayList3.clear();
                    launchActivity2.p0(qyVar);
                    break;
                } else if (p2Var instanceof org.telegram.ui.zn) {
                    ((org.telegram.ui.zn) p2Var).W9(user.id, str4, true);
                    break;
                }
                break;
            case 8:
                LaunchActivity launchActivity3 = (LaunchActivity) obj5;
                TLObject tLObject4 = (TLObject) obj4;
                TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = (TLRPC.TL_messages_requestUrlAuth) obj3;
                String str5 = (String) obj2;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj;
                org.telegram.ui.ActionBar.p2 U2 = LaunchActivity.U();
                if (tLObject4 != null) {
                    if (tLObject4 instanceof TLRPC.TL_urlAuthResultRequest) {
                        org.telegram.ui.zk0.b(false, launchActivity3.L, tL_messages_requestUrlAuth, (TLRPC.TL_urlAuthResultRequest) tLObject4, null, null, null, false, null);
                        break;
                    } else if (tLObject4 instanceof TLRPC.TL_urlAuthResultAccepted) {
                        org.telegram.ui.zk0.b(false, launchActivity3.L, tL_messages_requestUrlAuth, (TLRPC.TL_urlAuthResultAccepted) tLObject4, null, null, null, false, null);
                        break;
                    } else if (tLObject4 instanceof TLRPC.TL_urlAuthResultDefault) {
                        z4.q0(U2, str5, false, true);
                        break;
                    }
                } else if (tL_error3 != null) {
                    if ("URL_EXPIRED".equalsIgnoreCase(tL_error3.text)) {
                        org.telegram.ui.zk0.a().M(LocaleController.getString(R.string.BotAuthLoggedInFailTitle), LocaleController.getString(R.string.BotAuthLoggedInFailNoDomain), R.raw.error).j();
                        break;
                    } else {
                        org.telegram.ui.zk0.a().d0(tL_error3, false);
                        break;
                    }
                }
                break;
            case 9:
                LaunchActivity launchActivity4 = (LaunchActivity) obj5;
                TLObject tLObject5 = (TLObject) obj4;
                org.telegram.ui.ActionBar.d2 d2Var = (org.telegram.ui.ActionBar.d2) obj3;
                org.telegram.ui.w10 w10Var2 = (org.telegram.ui.w10) obj2;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) obj;
                Pattern pattern2 = LaunchActivity.y1;
                if (tLObject5 instanceof TLRPC.TL_theme) {
                    TLRPC.TL_theme tL_theme = (TLRPC.TL_theme) tLObject5;
                    TLRPC.ThemeSettings themeSettings = tL_theme.settings.size() > 0 ? tL_theme.settings.get(0) : null;
                    if (themeSettings != null) {
                        org.telegram.ui.ActionBar.i6 N0 = org.telegram.ui.ActionBar.j6.N0(org.telegram.ui.ActionBar.j6.q0(themeSettings));
                        if (N0 != null) {
                            TLRPC.WallPaper wallPaper = themeSettings.wallpaper;
                            if (wallPaper instanceof TLRPC.TL_wallPaper) {
                                tL_wallPaper = (TLRPC.TL_wallPaper) wallPaper;
                                if (!FileLoader.getInstance(launchActivity4.L).getPathToAttach(tL_wallPaper.document, true).exists()) {
                                    launchActivity4.S0 = d2Var;
                                    launchActivity4.R0 = true;
                                    launchActivity4.P0 = N0;
                                    launchActivity4.Q0 = tL_theme;
                                    launchActivity4.O0 = tL_wallPaper;
                                    launchActivity4.N0 = FileLoader.getAttachFileName(tL_wallPaper.document);
                                    FileLoader.getInstance(launchActivity4.L).loadFile(tL_wallPaper.document, tL_wallPaper, 1, 1);
                                    break;
                                }
                            }
                            try {
                                w10Var2.run();
                            } catch (Exception e6) {
                                FileLog.e(e6);
                            }
                            launchActivity4.n0(tL_theme, tL_wallPaper, N0);
                        } else {
                            i20 = 1;
                        }
                        i10 = i20;
                    } else {
                        TLRPC.Document document = tL_theme.document;
                        if (document != null) {
                            launchActivity4.R0 = false;
                            launchActivity4.Q0 = tL_theme;
                            launchActivity4.M0 = FileLoader.getAttachFileName(document);
                            launchActivity4.S0 = d2Var;
                            FileLoader.getInstance(launchActivity4.L).loadFile(launchActivity4.Q0.document, tL_theme, 1, 1);
                            i10 = 0;
                        }
                        i10 = 1;
                    }
                } else {
                    if (tL_error4 == null || !"THEME_FORMAT_INVALID".equals(tL_error4.text)) {
                        i10 = 2;
                    }
                    i10 = 1;
                }
                if (i10 != 0) {
                    try {
                        w10Var2.run();
                    } catch (Exception e10) {
                        FileLog.e(e10);
                    }
                    if (i10 == 1) {
                        launchActivity4.B0(z4.N(launchActivity4, LocaleController.getString(R.string.Theme), LocaleController.getString(R.string.ThemeNotSupported)));
                        break;
                    } else {
                        launchActivity4.B0(z4.N(launchActivity4, LocaleController.getString(R.string.Theme), LocaleController.getString(R.string.ThemeNotFound)));
                        break;
                    }
                }
                break;
            case 10:
                org.telegram.ui.yb0 yb0Var = (org.telegram.ui.yb0) obj5;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) obj;
                TLObject tLObject6 = (TLObject) obj4;
                TLRPC.TL_inputInvoiceSlug tL_inputInvoiceSlug = (TLRPC.TL_inputInvoiceSlug) obj3;
                String str6 = (String) obj2;
                int i21 = yb0Var.b;
                LaunchActivity launchActivity5 = yb0Var.a;
                if (tL_error5 != null) {
                    if ("SUBSCRIPTION_ALREADY_ACTIVE".equalsIgnoreCase(tL_error5.text)) {
                        b10 = org.telegram.ui.yb0.b();
                        i11 = R.string.PaymentInvoiceSubscriptionLinkAlreadyPaid;
                    } else {
                        b10 = org.telegram.ui.yb0.b();
                        i11 = R.string.PaymentInvoiceLinkInvalid;
                    }
                    org.telegram.messenger.y3.s(i11, b10, null);
                } else if (!launchActivity5.isFinishing()) {
                    if (tLObject6 instanceof TLRPC.TL_payments_paymentFormStars) {
                        kh.t5 t5Var = launchActivity5.V0;
                        launchActivity5.V0 = null;
                        lh.t7.y(i21, false).Y(null, tL_inputInvoiceSlug, (TLRPC.TL_payments_paymentFormStars) tLObject6, new org.telegram.ui.rb0(yb0Var, 1), new org.telegram.ui.c90(t5Var, i19));
                        break;
                    } else {
                        if (tLObject6 instanceof TLRPC.PaymentForm) {
                            TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject6;
                            MessagesController.getInstance(i21).putUsers(paymentForm.users, false);
                            lo0Var = new org.telegram.ui.lo0(paymentForm, null, str6, LaunchActivity.U());
                        } else {
                            lo0Var = tLObject6 instanceof TLRPC.PaymentReceipt ? new org.telegram.ui.lo0((TLRPC.PaymentReceipt) tLObject6) : null;
                        }
                        if (lo0Var != null) {
                            kh.t5 t5Var2 = launchActivity5.V0;
                            if (t5Var2 != null) {
                                launchActivity5.V0 = null;
                                lo0Var.W0 = new org.telegram.ui.jf(10, t5Var2);
                            }
                            yb0Var.n(lo0Var, false);
                        }
                    }
                }
                yb0Var.a();
                break;
            case 11:
                org.telegram.ui.pg0.U((org.telegram.ui.pg0) obj5, (TLRPC.TL_error) obj, (String) obj4, (String) obj3, (String) obj2);
                break;
            case 12:
                TLObject tLObject7 = (TLObject) obj4;
                Bundle bundle = (Bundle) obj3;
                TLRPC.TL_error tL_error6 = (TLRPC.TL_error) obj;
                TLRPC.TL_auth_resendCode tL_auth_resendCode = (TLRPC.TL_auth_resendCode) obj2;
                org.telegram.ui.pg0 pg0Var = ((org.telegram.ui.ae0) obj5).T;
                if (tLObject7 instanceof TLRPC.TL_auth_sentCode) {
                    pg0Var.g1(bundle, (TLRPC.TL_auth_sentCode) tLObject7, true);
                    break;
                } else if (tL_error6 != null && tL_error6.text != null) {
                    i12 = ((org.telegram.ui.ActionBar.p2) pg0Var).currentAccount;
                    z4.f0(i12, tL_error6, pg0Var, tL_auth_resendCode, new Object[0]);
                    break;
                }
                break;
            case 13:
                org.telegram.ui.ff0 ff0Var = (org.telegram.ui.ff0) obj5;
                TLObject tLObject8 = (TLObject) obj4;
                Bundle bundle2 = (Bundle) obj3;
                TLRPC.TL_error tL_error7 = (TLRPC.TL_error) obj;
                TL_account.sendVerifyEmailCode sendverifyemailcode = (TL_account.sendVerifyEmailCode) obj2;
                org.telegram.ui.pg0 pg0Var2 = ff0Var.B;
                pg0Var2.k1(false, true);
                ff0Var.r = false;
                if (tLObject8 instanceof TL_account.sentEmailCode) {
                    TL_account.sentEmailCode sentemailcode = (TL_account.sentEmailCode) tLObject8;
                    bundle2.putString("emailPattern", sentemailcode.email_pattern);
                    bundle2.putInt("length", sentemailcode.length);
                    pg0Var2.u1(13, true, bundle2, false);
                    break;
                } else {
                    String str7 = tL_error7.text;
                    if (str7 != null) {
                        if (str7.contains("EMAIL_INVALID")) {
                            ff0Var.o();
                            break;
                        } else if (tL_error7.text.contains("EMAIL_NOT_ALLOWED")) {
                            pg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.EmailNotAllowed));
                            break;
                        } else if (tL_error7.text.contains("PHONE_PASSWORD_FLOOD")) {
                            pg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("FloodWait", R.string.FloodWait));
                            break;
                        } else if (tL_error7.text.contains("PHONE_NUMBER_FLOOD")) {
                            pg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("PhoneNumberFlood", R.string.PhoneNumberFlood));
                            break;
                        } else if (!tL_error7.text.contains("PHONE_CODE_EMPTY") && !tL_error7.text.contains("PHONE_CODE_INVALID")) {
                            if (tL_error7.text.contains("PHONE_CODE_EXPIRED")) {
                                pg0Var2.u1(0, true, null, true);
                                pg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("CodeExpired", R.string.CodeExpired));
                                break;
                            } else if (tL_error7.text.startsWith("FLOOD_WAIT")) {
                                pg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("FloodWait", R.string.FloodWait));
                                break;
                            } else if (tL_error7.code != -1000) {
                                i13 = ((org.telegram.ui.ActionBar.p2) pg0Var2).currentAccount;
                                z4.f0(i13, tL_error7, pg0Var2, sendverifyemailcode, ff0Var.w);
                                break;
                            }
                        } else {
                            pg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("InvalidCode", R.string.InvalidCode));
                            break;
                        }
                    }
                }
                break;
            case 14:
                TLObject tLObject9 = (TLObject) obj4;
                Bundle bundle3 = (Bundle) obj3;
                TLRPC.TL_error tL_error8 = (TLRPC.TL_error) obj;
                TL_account.verifyEmail verifyemail = (TL_account.verifyEmail) obj2;
                org.telegram.ui.pg0 pg0Var3 = ((org.telegram.ui.ff0) obj5).B;
                if (!(tLObject9 instanceof TL_account.TL_emailVerified) || pg0Var3.C != 3) {
                    if (tLObject9 instanceof TL_account.TL_emailVerifiedLogin) {
                        TL_account.TL_emailVerifiedLogin tL_emailVerifiedLogin = (TL_account.TL_emailVerifiedLogin) tLObject9;
                        bundle3.putString("email", tL_emailVerifiedLogin.email);
                        pg0Var3.g1(bundle3, tL_emailVerifiedLogin.sent_code, true);
                        break;
                    } else if (tL_error8 != null) {
                        if (tL_error8.text.contains("EMAIL_NOT_ALLOWED")) {
                            pg0Var3.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.EmailNotAllowed));
                            break;
                        } else if (tL_error8.text.contains("EMAIL_TOKEN_INVALID")) {
                            pg0Var3.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.EmailTokenInvalid));
                            break;
                        } else if (tL_error8.code != -1000) {
                            i14 = ((org.telegram.ui.ActionBar.p2) pg0Var3).currentAccount;
                            z4.f0(i14, tL_error8, pg0Var3, verifyemail, new Object[0]);
                            break;
                        }
                    }
                } else {
                    pg0Var3.finishFragment();
                    pg0Var3.a0.run();
                    break;
                }
                break;
            case 15:
                final org.telegram.ui.yf0 yf0Var = (org.telegram.ui.yf0) obj5;
                TLObject tLObject10 = (TLObject) obj4;
                TLRPC.TL_inputInvoicePremiumAuthCode tL_inputInvoicePremiumAuthCode = (TLRPC.TL_inputInvoicePremiumAuthCode) obj3;
                final TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode = (TLRPC.TL_inputStorePaymentAuthCode) obj2;
                TLRPC.TL_error tL_error9 = (TLRPC.TL_error) obj;
                org.telegram.ui.pg0 pg0Var4 = yf0Var.v;
                yf0Var.b.setLoading(false);
                if (tLObject10 instanceof TLRPC.PaymentForm) {
                    final TLRPC.PaymentForm paymentForm2 = (TLRPC.PaymentForm) tLObject10;
                    pg0Var4.getMessagesController().putUsers(paymentForm2.users, false);
                    org.telegram.ui.lo0 lo0Var2 = new org.telegram.ui.lo0(tL_inputInvoicePremiumAuthCode, paymentForm2, null, null, 4, null, null, null, null, null, null, false, null, pg0Var4, true);
                    lo0Var2.S0 = true;
                    lo0Var2.Z0 = new Utilities.Callback() { // from class: org.telegram.ui.uf0
                        @Override // org.telegram.messenger.Utilities.Callback
                        public final void run(Object obj6) {
                            switch (i20) {
                                case 0:
                                    final int i22 = 0;
                                    final yf0 yf0Var2 = yf0Var;
                                    final TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode2 = tL_inputStorePaymentAuthCode;
                                    final TLRPC.PaymentForm paymentForm3 = paymentForm2;
                                    AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.wf0
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i22) {
                                                case 0:
                                                    TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode3 = tL_inputStorePaymentAuthCode2;
                                                    String str8 = tL_inputStorePaymentAuthCode3.phone_number;
                                                    String str9 = tL_inputStorePaymentAuthCode3.phone_code_hash;
                                                    long j10 = paymentForm3.form_id;
                                                    yf0 yf0Var3 = yf0Var2;
                                                    if (!yf0Var3.f) {
                                                        yf0Var3.f = true;
                                                        yf0Var3.h = str8;
                                                        yf0Var3.n = str9;
                                                        yf0Var3.r = j10;
                                                        yf0Var3.b.setLoading(true);
                                                        yf0Var3.p();
                                                        break;
                                                    }
                                                    break;
                                                default:
                                                    TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode4 = tL_inputStorePaymentAuthCode2;
                                                    String str10 = tL_inputStorePaymentAuthCode4.phone_number;
                                                    String str11 = tL_inputStorePaymentAuthCode4.phone_code_hash;
                                                    long j11 = paymentForm3.form_id;
                                                    yf0 yf0Var4 = yf0Var2;
                                                    if (!yf0Var4.f) {
                                                        yf0Var4.f = true;
                                                        yf0Var4.h = str10;
                                                        yf0Var4.n = str11;
                                                        yf0Var4.r = j11;
                                                        yf0Var4.b.setLoading(true);
                                                        yf0Var4.p();
                                                        break;
                                                    }
                                                    break;
                                            }
                                        }
                                    });
                                    break;
                                default:
                                    final int i23 = 1;
                                    final yf0 yf0Var3 = yf0Var;
                                    final TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode3 = tL_inputStorePaymentAuthCode;
                                    final TLRPC.PaymentForm paymentForm4 = paymentForm2;
                                    AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.wf0
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i23) {
                                                case 0:
                                                    TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode32 = tL_inputStorePaymentAuthCode3;
                                                    String str8 = tL_inputStorePaymentAuthCode32.phone_number;
                                                    String str9 = tL_inputStorePaymentAuthCode32.phone_code_hash;
                                                    long j10 = paymentForm4.form_id;
                                                    yf0 yf0Var32 = yf0Var3;
                                                    if (!yf0Var32.f) {
                                                        yf0Var32.f = true;
                                                        yf0Var32.h = str8;
                                                        yf0Var32.n = str9;
                                                        yf0Var32.r = j10;
                                                        yf0Var32.b.setLoading(true);
                                                        yf0Var32.p();
                                                        break;
                                                    }
                                                    break;
                                                default:
                                                    TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode4 = tL_inputStorePaymentAuthCode3;
                                                    String str10 = tL_inputStorePaymentAuthCode4.phone_number;
                                                    String str11 = tL_inputStorePaymentAuthCode4.phone_code_hash;
                                                    long j11 = paymentForm4.form_id;
                                                    yf0 yf0Var4 = yf0Var3;
                                                    if (!yf0Var4.f) {
                                                        yf0Var4.f = true;
                                                        yf0Var4.h = str10;
                                                        yf0Var4.n = str11;
                                                        yf0Var4.r = j11;
                                                        yf0Var4.b.setLoading(true);
                                                        yf0Var4.p();
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
                    lo0Var2.a1 = new Utilities.Callback() { // from class: org.telegram.ui.uf0
                        @Override // org.telegram.messenger.Utilities.Callback
                        public final void run(Object obj6) {
                            switch (i19) {
                                case 0:
                                    final int i22 = 0;
                                    final yf0 yf0Var2 = yf0Var;
                                    final TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode2 = tL_inputStorePaymentAuthCode;
                                    final TLRPC.PaymentForm paymentForm3 = paymentForm2;
                                    AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.wf0
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i22) {
                                                case 0:
                                                    TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode32 = tL_inputStorePaymentAuthCode2;
                                                    String str8 = tL_inputStorePaymentAuthCode32.phone_number;
                                                    String str9 = tL_inputStorePaymentAuthCode32.phone_code_hash;
                                                    long j10 = paymentForm3.form_id;
                                                    yf0 yf0Var32 = yf0Var2;
                                                    if (!yf0Var32.f) {
                                                        yf0Var32.f = true;
                                                        yf0Var32.h = str8;
                                                        yf0Var32.n = str9;
                                                        yf0Var32.r = j10;
                                                        yf0Var32.b.setLoading(true);
                                                        yf0Var32.p();
                                                        break;
                                                    }
                                                    break;
                                                default:
                                                    TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode4 = tL_inputStorePaymentAuthCode2;
                                                    String str10 = tL_inputStorePaymentAuthCode4.phone_number;
                                                    String str11 = tL_inputStorePaymentAuthCode4.phone_code_hash;
                                                    long j11 = paymentForm3.form_id;
                                                    yf0 yf0Var4 = yf0Var2;
                                                    if (!yf0Var4.f) {
                                                        yf0Var4.f = true;
                                                        yf0Var4.h = str10;
                                                        yf0Var4.n = str11;
                                                        yf0Var4.r = j11;
                                                        yf0Var4.b.setLoading(true);
                                                        yf0Var4.p();
                                                        break;
                                                    }
                                                    break;
                                            }
                                        }
                                    });
                                    break;
                                default:
                                    final int i23 = 1;
                                    final yf0 yf0Var3 = yf0Var;
                                    final TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode3 = tL_inputStorePaymentAuthCode;
                                    final TLRPC.PaymentForm paymentForm4 = paymentForm2;
                                    AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.wf0
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i23) {
                                                case 0:
                                                    TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode32 = tL_inputStorePaymentAuthCode3;
                                                    String str8 = tL_inputStorePaymentAuthCode32.phone_number;
                                                    String str9 = tL_inputStorePaymentAuthCode32.phone_code_hash;
                                                    long j10 = paymentForm4.form_id;
                                                    yf0 yf0Var32 = yf0Var3;
                                                    if (!yf0Var32.f) {
                                                        yf0Var32.f = true;
                                                        yf0Var32.h = str8;
                                                        yf0Var32.n = str9;
                                                        yf0Var32.r = j10;
                                                        yf0Var32.b.setLoading(true);
                                                        yf0Var32.p();
                                                        break;
                                                    }
                                                    break;
                                                default:
                                                    TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode4 = tL_inputStorePaymentAuthCode3;
                                                    String str10 = tL_inputStorePaymentAuthCode4.phone_number;
                                                    String str11 = tL_inputStorePaymentAuthCode4.phone_code_hash;
                                                    long j11 = paymentForm4.form_id;
                                                    yf0 yf0Var4 = yf0Var3;
                                                    if (!yf0Var4.f) {
                                                        yf0Var4.f = true;
                                                        yf0Var4.h = str10;
                                                        yf0Var4.n = str11;
                                                        yf0Var4.r = j11;
                                                        yf0Var4.b.setLoading(true);
                                                        yf0Var4.p();
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
                    lo0Var2.b1 = new org.telegram.ui.j20(yf0Var, i19);
                    pg0Var4.presentFragment(lo0Var2);
                    break;
                } else if (tL_error9 != null) {
                    if ("PHONE_CODE_EXPIRED".equalsIgnoreCase(tL_error9.text)) {
                        AndroidUtilities.runOnUIThread(new org.telegram.ui.vf0(yf0Var, i20));
                        break;
                    } else {
                        String str8 = tL_error9.text;
                        yf0Var.e = str8;
                        new qc(pg0Var4.W, null).H(R.raw.error, LocaleController.formatString(R.string.UnknownErrorCode, str8));
                        break;
                    }
                } else {
                    new qc(pg0Var4.W, null).H(R.raw.error, LocaleController.getString(R.string.UnknownError));
                    break;
                }
            case 16:
                org.telegram.ui.cj0 cj0Var = (org.telegram.ui.cj0) obj5;
                TLRPC.TL_error tL_error10 = (TLRPC.TL_error) obj;
                wf.b bVar = (wf.b) obj4;
                String str9 = (String) obj3;
                TL_stats.TL_loadAsyncGraph tL_loadAsyncGraph = (TL_stats.TL_loadAsyncGraph) obj2;
                cj0Var.y = true;
                if (tL_error10 != null || bVar == null) {
                    cj0Var.g0();
                    break;
                } else {
                    cj0Var.v.put(str9, bVar);
                    aa1 aa1Var = cj0Var.r;
                    aa1Var.e = bVar;
                    aa1Var.c = tL_loadAsyncGraph.x;
                    cj0Var.g0();
                    break;
                }
            case 17:
                org.telegram.ui.uj0.n((org.telegram.ui.uj0) obj5, (TLRPC.TL_contacts_importedContacts) obj4, (TLRPC.TL_inputPhoneContact) obj3, (TLRPC.TL_error) obj, (TLRPC.TL_contacts_importContacts) obj2);
                break;
            case 18:
                TLRPC.TL_error tL_error11 = (TLRPC.TL_error) obj;
                org.telegram.ui.gl0 gl0Var = (org.telegram.ui.gl0) obj4;
                n7.qa qaVar = (n7.qa) obj3;
                TL_account.verifyEmail verifyemail2 = (TL_account.verifyEmail) obj2;
                org.telegram.ui.fn0 fn0Var = ((org.telegram.ui.nm0) obj5).a;
                if (tL_error11 == null) {
                    ((org.telegram.ui.im0) fn0Var.y1).c(fn0Var.B, (String) fn0Var.p1.get("email"), null, null, null, null, null, null, null, null, gl0Var, qaVar);
                    break;
                } else {
                    i15 = ((org.telegram.ui.ActionBar.p2) fn0Var).currentAccount;
                    z4.f0(i15, tL_error11, fn0Var, verifyemail2, new Object[0]);
                    qaVar.D(null, null);
                    break;
                }
            case 19:
                org.telegram.ui.bn0 bn0Var = (org.telegram.ui.bn0) obj5;
                TLRPC.TL_error tL_error12 = (TLRPC.TL_error) obj;
                Bundle bundle4 = (Bundle) obj3;
                TLObject tLObject11 = (TLObject) obj4;
                TLRPC.TL_auth_resendCode tL_auth_resendCode2 = (TLRPC.TL_auth_resendCode) obj2;
                org.telegram.ui.fn0 fn0Var2 = bn0Var.N;
                bn0Var.G = false;
                if (tL_error12 == null) {
                    fn0Var2.l1(bundle4, (TLRPC.TL_auth_sentCode) tLObject11, true);
                } else {
                    i16 = ((org.telegram.ui.ActionBar.p2) fn0Var2).currentAccount;
                    org.telegram.ui.ActionBar.d2 f02 = z4.f0(i16, tL_error12, fn0Var2, tL_auth_resendCode2, new Object[0]);
                    if (f02 != null && tL_error12.text.contains("PHONE_CODE_EXPIRED")) {
                        f02.j0 = new org.telegram.ui.wm0(bn0Var, i20);
                    }
                }
                fn0Var2.x1();
                break;
            case 20:
                org.telegram.ui.lo0.f0((org.telegram.ui.lo0) obj5, (TLRPC.TL_error) obj, (TLObject) obj4, (String) obj3, (TL_account.getPassword) obj2);
                break;
            case 21:
                ClippingImageView[] clippingImageViewArr = (ClippingImageView[]) obj4;
                ArrayList arrayList4 = (ArrayList) obj3;
                Integer num = (Integer) obj2;
                org.telegram.ui.ou0 ou0Var2 = (org.telegram.ui.ou0) obj;
                PhotoViewer photoViewer = ((org.telegram.ui.rt0) obj5).r;
                photoViewer.m4 = null;
                org.telegram.ui.iu0 iu0Var = photoViewer.b0;
                if (iu0Var != null && photoViewer.d0 != null) {
                    iu0Var.setLayerType(0, null);
                    photoViewer.k4 = 0;
                    photoViewer.F1();
                    photoViewer.l4 = 0L;
                    photoViewer.D1 = null;
                    photoViewer.B1.a = false;
                    photoViewer.E1 = null;
                    photoViewer.C1.a = false;
                    photoViewer.D2();
                    photoViewer.z2();
                    photoViewer.b0.invalidate();
                    for (ClippingImageView clippingImageView : clippingImageViewArr) {
                        clippingImageView.setVisibility(8);
                    }
                    org.telegram.ui.qu0 qu0Var = photoViewer.n4;
                    if (qu0Var != null) {
                        qu0Var.a.setVisible(true, true);
                    }
                    org.telegram.ui.qu0 qu0Var2 = photoViewer.o4;
                    if (qu0Var2 != null && !qu0Var2.s) {
                        qu0Var2.a.setVisible(false, true);
                    }
                    if (arrayList4 != null && (i17 = photoViewer.Z1) != 3 && i17 != 1 && ((ou0Var = photoViewer.d) == null || !ou0Var.O())) {
                        photoViewer.R1();
                    }
                    i71 i71Var = photoViewer.C2;
                    if (i71Var != null && i71Var.y() && photoViewer.o1 && !photoViewer.d7.isEmpty()) {
                        PhotoViewer.Z(photoViewer, photoViewer.C2.n());
                        PhotoViewer.Y(photoViewer, true);
                    }
                    if (photoViewer.q4) {
                        PhotoViewer.a0(photoViewer, num.intValue());
                    }
                    if (ou0Var2 != null) {
                        ou0Var2.d();
                        break;
                    }
                }
                break;
            case 22:
                PrivacyControlActivity privacyControlActivity = (PrivacyControlActivity) obj5;
                boolean[] zArr = (boolean[]) obj4;
                TLRPC.GlobalPrivacySettings globalPrivacySettings = (TLRPC.GlobalPrivacySettings) obj3;
                TL_account.setGlobalPrivacySettings setglobalprivacysettings = (TL_account.setGlobalPrivacySettings) obj2;
                if (((TLRPC.TL_error) obj) != null) {
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
            case 23:
                TLRPC.UserFull userFull2 = (TLRPC.UserFull) obj3;
                TL_account.TL_birthday tL_birthday2 = (TL_account.TL_birthday) obj2;
                TLRPC.TL_error tL_error13 = (TLRPC.TL_error) obj;
                PrivacyControlActivity privacyControlActivity2 = ((org.telegram.ui.lx0) obj5).d;
                if (((TLObject) obj4) instanceof TLRPC.TL_boolTrue) {
                    ic Q = qc.a0(privacyControlActivity2).Q(R.raw.contact_check, 36, LocaleController.getString(R.string.PrivacyBirthdaySetDone));
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
                            f6Var = ((org.telegram.ui.ActionBar.p2) privacyControlActivity2).resourceProvider;
                            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(parentActivity, 0, f6Var);
                            String string = LocaleController.getString(R.string.PrivacyBirthdayTooOftenTitle);
                            org.telegram.ui.ActionBar.d2 d2Var2 = alertDialog$Builder2.a;
                            d2Var2.O = string;
                            d2Var2.Q = LocaleController.getString(R.string.PrivacyBirthdayTooOftenMessage);
                            alertDialog$Builder2.k(LocaleController.getString(R.string.OK), null);
                            privacyControlActivity2.showDialog(d2Var2);
                            break;
                        }
                    } else {
                        kf.k0.v(R.string.UnknownError, qc.a0(privacyControlActivity2), R.raw.error, 36);
                        break;
                    }
                }
                break;
            case 24:
                ProfileActivity profileActivity = (ProfileActivity) obj5;
                TLRPC.ChatParticipant chatParticipant = (TLRPC.ChatParticipant) obj3;
                TLRPC.User user2 = (TLRPC.User) obj2;
                org.telegram.messenger.ok okVar = (org.telegram.messenger.ok) obj;
                if (!(((TLRPC.ChannelParticipant) obj4) instanceof TLRPC.TL_channelParticipantAdmin) && !(chatParticipant instanceof TLRPC.TL_chatParticipantAdmin)) {
                    okVar.run(1);
                    break;
                } else {
                    AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(profileActivity.getParentActivity(), 0, profileActivity.w0);
                    String string2 = LocaleController.getString(R.string.AppName);
                    org.telegram.ui.ActionBar.d2 d2Var3 = alertDialog$Builder3.a;
                    d2Var3.O = string2;
                    d2Var3.Q = LocaleController.formatString(R.string.AdminWillBeRemoved, ContactsController.formatName(user2.first_name, user2.last_name));
                    alertDialog$Builder3.k(LocaleController.getString(R.string.OK), new org.telegram.ui.kl0(okVar, 11));
                    alertDialog$Builder3.h(LocaleController.getString(R.string.Cancel), null);
                    profileActivity.showDialog(d2Var3);
                    break;
                }
                break;
            case 25:
                ProfileActivity profileActivity2 = (ProfileActivity) obj5;
                TLObject tLObject12 = (TLObject) obj4;
                TLRPC.TL_username tL_username = (TLRPC.TL_username) obj3;
                org.telegram.ui.mz0 mz0Var = (org.telegram.ui.mz0) obj2;
                TLRPC.TL_error tL_error14 = (TLRPC.TL_error) obj;
                if (tLObject12 instanceof TL_fragment.TL_collectibleInfo) {
                    TL_fragment.TL_collectibleInfo tL_collectibleInfo = (TL_fragment.TL_collectibleInfo) tLObject12;
                    if (profileActivity2.b1 != 0) {
                        profileActivity2.getMessagesController().getUser(Long.valueOf(profileActivity2.b1));
                    } else {
                        profileActivity2.getMessagesController().getChat(Long.valueOf(profileActivity2.c1));
                    }
                    String str10 = "@" + tL_username.username;
                    String format = LocaleController.getInstance().getFormatterBoostExpired().format(new Date(tL_collectibleInfo.purchase_date * 1000));
                    String formatCurrency = BillingController.getInstance().formatCurrency(tL_collectibleInfo.crypto_amount, tL_collectibleInfo.crypto_currency);
                    String formatCurrency2 = BillingController.getInstance().formatCurrency(tL_collectibleInfo.amount, tL_collectibleInfo.currency);
                    ic w10 = new qc(mz0Var.w, profileActivity2.w0).w(R.drawable.filled_username, AndroidUtilities.withLearnMore(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.FragmentChannelUsername, str10, format, formatCurrency, TextUtils.isEmpty(formatCurrency2) ? "" : android.support.v4.media.a.o("(", formatCurrency2, ")"))), new org.telegram.ui.gr0(19, profileActivity2, tL_collectibleInfo)));
                    org.telegram.ui.ib0 ib0Var = new org.telegram.ui.ib0(14, profileActivity2, tL_collectibleInfo);
                    nb nbVar = w10.e;
                    if (nbVar != null) {
                        nbVar.setOnClickListener(ib0Var);
                    }
                    w10.k(false);
                    break;
                } else {
                    qc.b0(tL_error14);
                    break;
                }
            case 26:
                ProfileActivity profileActivity3 = (ProfileActivity) obj5;
                TLObject tLObject13 = (TLObject) obj4;
                String str11 = (String) obj3;
                TLRPC.User user3 = (TLRPC.User) obj2;
                TLRPC.TL_error tL_error15 = (TLRPC.TL_error) obj;
                if (tLObject13 instanceof TL_fragment.TL_collectibleInfo) {
                    org.telegram.ui.f20.a(profileActivity3.getParentActivity(), 1, str11, user3, (TL_fragment.TL_collectibleInfo) tLObject13, profileActivity3.w0);
                    break;
                } else {
                    qc.b0(tL_error15);
                    break;
                }
            case 27:
                ProfileActivity.X((ProfileActivity) obj5, (TLObject) obj4, (TLRPC.UserFull) obj3, (TL_account.TL_birthday) obj2, (TLRPC.TL_error) obj);
                break;
            case 28:
                org.telegram.ui.x01 x01Var = (org.telegram.ui.x01) obj5;
                ArrayList arrayList5 = (ArrayList) obj3;
                ArrayList arrayList6 = (ArrayList) obj2;
                ArrayList arrayList7 = (ArrayList) obj;
                org.telegram.ui.ActionBar.p2 p2Var2 = x01Var.e;
                if (((String) obj4).equals(x01Var.y)) {
                    if (!x01Var.w && (p2Var2 instanceof ProfileActivity)) {
                        try {
                            ((ProfileActivity) p2Var2).M.b.getImageReceiver().startAnimation();
                            ((ProfileActivity) p2Var2).M.d.setText(LocaleController.getString(R.string.SettingsNoResults));
                        } catch (Exception e11) {
                            FileLog.e(e11);
                        }
                    }
                    x01Var.w = true;
                    x01Var.r = arrayList5;
                    x01Var.s = arrayList6;
                    x01Var.n = arrayList7;
                    x01Var.l();
                    if (p2Var2 instanceof ProfileActivity) {
                        try {
                            ((ProfileActivity) p2Var2).M.b.getImageReceiver().startAnimation();
                            break;
                        } catch (Exception e12) {
                            FileLog.e(e12);
                            return;
                        }
                    }
                }
                break;
            default:
                org.telegram.ui.x61 x61Var = (org.telegram.ui.x61) obj5;
                x61Var.getClass();
                x61Var.p((View) obj4, Long.valueOf(((u5) obj3).documentId), (TLRPC.Document) obj2, ((org.telegram.ui.f61) obj).v, null);
                break;
        }
    }

    public /* synthetic */ jy0(KeyEvent.Callback callback, TLObject tLObject, Object obj, TLRPC.TL_error tL_error, TLObject tLObject2, int i10) {
        this.a = i10;
        this.b = callback;
        this.c = tLObject;
        this.d = obj;
        this.f = tL_error;
        this.e = tLObject2;
    }

    public /* synthetic */ jy0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
    }

    public /* synthetic */ jy0(Object obj, Object obj2, TLObject tLObject, TLObject tLObject2, TLRPC.TL_error tL_error, int i10) {
        this.a = i10;
        this.b = obj;
        this.d = obj2;
        this.c = tLObject;
        this.e = tLObject2;
        this.f = tL_error;
    }

    public /* synthetic */ jy0(org.telegram.ui.bn0 bn0Var, TLRPC.TL_error tL_error, Bundle bundle, TLObject tLObject, TLRPC.TL_auth_resendCode tL_auth_resendCode) {
        this.a = 19;
        this.b = bn0Var;
        this.f = tL_error;
        this.d = bundle;
        this.c = tLObject;
        this.e = tL_auth_resendCode;
    }
}
