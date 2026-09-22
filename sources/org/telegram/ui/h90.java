package org.telegram.ui;

import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.regex.Pattern;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_fragment;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.ClippingImageView;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final /* synthetic */ class h90 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ h90(KeyEvent.Callback callback, TLObject tLObject, Object obj, TLRPC.TL_error tL_error, TLObject tLObject2, int i10) {
        this.a = i10;
        this.b = callback;
        this.d = tLObject;
        this.c = obj;
        this.f = tL_error;
        this.e = tLObject2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v69, types: [org.telegram.ui.ActionBar.n2, org.telegram.ui.yg0] */
    /* JADX WARN: Type inference failed for: r0v88, types: [org.telegram.ui.ActionBar.n2, org.telegram.ui.PrivacyControlActivity] */
    /* JADX WARN: Type inference failed for: r13v0, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r13v1, types: [int] */
    /* JADX WARN: Type inference failed for: r13v2, types: [int] */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r14v26, types: [org.telegram.messenger.g2] */
    /* JADX WARN: Type inference failed for: r15v2, types: [org.telegram.ui.fj1] */
    /* JADX WARN: Type inference failed for: r6v32, types: [ai.e4] */
    /* JADX WARN: Type inference failed for: r8v1, types: [android.content.Context, org.telegram.ui.LaunchActivity] */
    /* JADX WARN: Type inference failed for: r8v19, types: [org.telegram.ui.ActionBar.n2, org.telegram.ui.ProfileActivity] */
    /* JADX WARN: Type inference failed for: r8v5, types: [org.telegram.ui.hc0] */
    @Override // java.lang.Runnable
    public final void run() {
        xo0 xo0Var;
        org.telegram.ui.Components.xc b10;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        bv0 bv0Var;
        String str;
        org.telegram.ui.ActionBar.f6 f6Var;
        int i17 = this.a;
        int i18 = 8;
        TLRPC.TL_wallPaper tL_wallPaper = null;
        final int i19 = 1;
        final ?? r13 = 0;
        r13 = 0;
        ?? r132 = 0;
        Object obj = this.e;
        Object obj2 = this.f;
        Object obj3 = this.c;
        Object obj4 = this.d;
        Object obj5 = this.b;
        switch (i17) {
            case 0:
                ?? r82 = (LaunchActivity) obj5;
                r80 r80Var = (r80) obj3;
                TLObject tLObject = (TLObject) obj4;
                TLRPC.TL_wallPaper tL_wallPaper2 = (TLRPC.TL_wallPaper) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                Pattern pattern = LaunchActivity.B1;
                try {
                    r80Var.run();
                } catch (Exception e) {
                    FileLog.e(e);
                }
                if (tLObject instanceof TLRPC.TL_wallPaper) {
                    TLRPC.TL_wallPaper tL_wallPaper3 = (TLRPC.TL_wallPaper) tLObject;
                    if (tL_wallPaper3.pattern) {
                        String str2 = tL_wallPaper3.slug;
                        TLRPC.WallPaperSettings wallPaperSettings = tL_wallPaper2.settings;
                        ?? fj1Var = new fj1(str2, wallPaperSettings.background_color, wallPaperSettings.second_background_color, wallPaperSettings.third_background_color, wallPaperSettings.fourth_background_color, AndroidUtilities.getWallpaperRotation(wallPaperSettings.rotation, false), r3.intensity / 100.0f, tL_wallPaper2.settings.motion, null);
                        fj1Var.g = tL_wallPaper3;
                        tL_wallPaper3 = fj1Var;
                    }
                    xd1 xd1Var = new xd1(tL_wallPaper3, null, true);
                    TLRPC.WallPaperSettings wallPaperSettings2 = tL_wallPaper2.settings;
                    boolean z10 = wallPaperSettings2.blur;
                    boolean z11 = wallPaperSettings2.motion;
                    float f7 = wallPaperSettings2.intensity;
                    xd1Var.F1 = z10;
                    xd1Var.E1 = z11;
                    xd1Var.n1 = f7;
                    r82.p0(xd1Var);
                    break;
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    org.telegram.ui.Cells.c1.o(R.string.ErrorOccurred, "\n", sb2);
                    sb2.append(tL_error.text);
                    r82.B0(org.telegram.ui.Components.d5.N(r82, null, sb2.toString()));
                    break;
                }
            case 1:
                LaunchActivity launchActivity = (LaunchActivity) obj5;
                uy uyVar = (uy) obj3;
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) obj4;
                TLRPC.User user = (TLRPC.User) obj;
                String str3 = (String) obj2;
                ?? r02 = launchActivity.E0;
                if (uyVar != null) {
                    if (n2Var != null) {
                        n2Var.dismissCurrentDialog();
                    }
                    while (r13 < r02.size()) {
                        if (((Dialog) r02.get(r13)).isShowing()) {
                            ((Dialog) r02.get(r13)).dismiss();
                        }
                        r13++;
                    }
                    r02.clear();
                    launchActivity.p0(uyVar);
                    break;
                } else if (n2Var instanceof zn) {
                    ((zn) n2Var).W9(user.id, str3, true);
                    break;
                }
                break;
            case 2:
                LaunchActivity launchActivity2 = (LaunchActivity) obj5;
                TLObject tLObject2 = (TLObject) obj4;
                TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = (TLRPC.TL_messages_requestUrlAuth) obj3;
                String str4 = (String) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                if (tLObject2 != null) {
                    if (tLObject2 instanceof TLRPC.TL_urlAuthResultRequest) {
                        ll0.b(false, launchActivity2.O, tL_messages_requestUrlAuth, (TLRPC.TL_urlAuthResultRequest) tLObject2, null, null, null, false, null);
                        break;
                    } else if (tLObject2 instanceof TLRPC.TL_urlAuthResultAccepted) {
                        ll0.b(false, launchActivity2.O, tL_messages_requestUrlAuth, (TLRPC.TL_urlAuthResultAccepted) tLObject2, null, null, null, false, null);
                        break;
                    } else if (tLObject2 instanceof TLRPC.TL_urlAuthResultDefault) {
                        org.telegram.ui.Components.d5.q0(U, str4, false, true);
                        break;
                    }
                } else if (tL_error2 != null) {
                    if ("URL_EXPIRED".equalsIgnoreCase(tL_error2.text)) {
                        ll0.a().M(LocaleController.getString(R.string.BotAuthLoggedInFailTitle), LocaleController.getString(R.string.BotAuthLoggedInFailNoDomain), R.raw.error).j();
                        break;
                    } else {
                        ll0.a().d0(tL_error2, false);
                        break;
                    }
                }
                break;
            case 3:
                LaunchActivity launchActivity3 = (LaunchActivity) obj5;
                TLObject tLObject3 = (TLObject) obj4;
                org.telegram.ui.ActionBar.b2 b2Var = (org.telegram.ui.ActionBar.b2) obj;
                r80 r80Var2 = (r80) obj3;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                Pattern pattern2 = LaunchActivity.B1;
                if (tLObject3 instanceof TLRPC.TL_theme) {
                    TLRPC.TL_theme tL_theme = (TLRPC.TL_theme) tLObject3;
                    TLRPC.ThemeSettings themeSettings = tL_theme.settings.size() > 0 ? tL_theme.settings.get(0) : null;
                    if (themeSettings != null) {
                        org.telegram.ui.ActionBar.i6 N0 = org.telegram.ui.ActionBar.j6.N0(org.telegram.ui.ActionBar.j6.q0(themeSettings));
                        if (N0 != null) {
                            TLRPC.WallPaper wallPaper = themeSettings.wallpaper;
                            if (wallPaper instanceof TLRPC.TL_wallPaper) {
                                tL_wallPaper = (TLRPC.TL_wallPaper) wallPaper;
                                if (!FileLoader.getInstance(launchActivity3.O).getPathToAttach(tL_wallPaper.document, true).exists()) {
                                    launchActivity3.V0 = b2Var;
                                    launchActivity3.U0 = true;
                                    launchActivity3.S0 = N0;
                                    launchActivity3.T0 = tL_theme;
                                    launchActivity3.R0 = tL_wallPaper;
                                    launchActivity3.Q0 = FileLoader.getAttachFileName(tL_wallPaper.document);
                                    FileLoader.getInstance(launchActivity3.O).loadFile(tL_wallPaper.document, tL_wallPaper, 1, 1);
                                    break;
                                }
                            }
                            try {
                                r80Var2.run();
                            } catch (Exception e7) {
                                FileLog.e(e7);
                            }
                            launchActivity3.n0(tL_theme, tL_wallPaper, N0);
                        }
                        r132 = 1;
                    } else {
                        TLRPC.Document document = tL_theme.document;
                        if (document != null) {
                            launchActivity3.U0 = false;
                            launchActivity3.T0 = tL_theme;
                            launchActivity3.P0 = FileLoader.getAttachFileName(document);
                            launchActivity3.V0 = b2Var;
                            FileLoader.getInstance(launchActivity3.O).loadFile(launchActivity3.T0.document, tL_theme, 1, 1);
                        }
                        r132 = 1;
                    }
                } else {
                    if (tL_error3 == null || !"THEME_FORMAT_INVALID".equals(tL_error3.text)) {
                        r132 = 2;
                    }
                    r132 = 1;
                }
                if (r132 != 0) {
                    try {
                        r80Var2.run();
                    } catch (Exception e10) {
                        FileLog.e(e10);
                    }
                    if (r132 == 1) {
                        launchActivity3.B0(org.telegram.ui.Components.d5.N(launchActivity3, LocaleController.getString(R.string.Theme), LocaleController.getString(R.string.ThemeNotSupported)));
                        break;
                    } else {
                        launchActivity3.B0(org.telegram.ui.Components.d5.N(launchActivity3, LocaleController.getString(R.string.Theme), LocaleController.getString(R.string.ThemeNotFound)));
                        break;
                    }
                }
                break;
            case 4:
                ?? r83 = (hc0) obj5;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) obj2;
                TLObject tLObject4 = (TLObject) obj4;
                TLRPC.TL_inputInvoiceSlug tL_inputInvoiceSlug = (TLRPC.TL_inputInvoiceSlug) obj3;
                String str5 = (String) obj;
                int i20 = r83.b;
                LaunchActivity launchActivity4 = r83.a;
                if (tL_error4 != null) {
                    if ("SUBSCRIPTION_ALREADY_ACTIVE".equalsIgnoreCase(tL_error4.text)) {
                        b10 = hc0.b();
                        i10 = R.string.PaymentInvoiceSubscriptionLinkAlreadyPaid;
                    } else {
                        b10 = hc0.b();
                        i10 = R.string.PaymentInvoiceLinkInvalid;
                    }
                    org.telegram.messenger.rk.p(i10, b10, null);
                } else if (!launchActivity4.isFinishing()) {
                    if (tLObject4 instanceof TLRPC.TL_payments_paymentFormStars) {
                        xh.p4 p4Var = launchActivity4.Y0;
                        launchActivity4.Y0 = null;
                        yh.u5.y(i20, false).Y(null, tL_inputInvoiceSlug, (TLRPC.TL_payments_paymentFormStars) tLObject4, new bc0(r83, 1), new k90(p4Var, i19));
                        break;
                    } else {
                        if (tLObject4 instanceof TLRPC.PaymentForm) {
                            TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject4;
                            MessagesController.getInstance(i20).putUsers(paymentForm.users, false);
                            xo0Var = new xo0(paymentForm, null, str5, LaunchActivity.U());
                        } else {
                            xo0Var = tLObject4 instanceof TLRPC.PaymentReceipt ? new xo0((TLRPC.PaymentReceipt) tLObject4) : null;
                        }
                        if (xo0Var != null) {
                            xh.p4 p4Var2 = launchActivity4.Y0;
                            if (p4Var2 != null) {
                                launchActivity4.Y0 = null;
                                xo0Var.Z0 = new mf(10, p4Var2);
                            }
                            r83.n(xo0Var, false);
                        }
                    }
                }
                r83.a();
                break;
            case 5:
                yg0.U((yg0) obj5, (TLRPC.TL_error) obj2, (String) obj3, (String) obj4, (String) obj);
                break;
            case 6:
                TLObject tLObject5 = (TLObject) obj4;
                Bundle bundle = (Bundle) obj3;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) obj2;
                TLRPC.TL_auth_resendCode tL_auth_resendCode = (TLRPC.TL_auth_resendCode) obj;
                yg0 yg0Var = ((ie0) obj5).W;
                if (tLObject5 instanceof TLRPC.TL_auth_sentCode) {
                    yg0Var.g1(bundle, (TLRPC.TL_auth_sentCode) tLObject5, true);
                    break;
                } else if (tL_error5 != null && tL_error5.text != null) {
                    i11 = ((org.telegram.ui.ActionBar.n2) yg0Var).currentAccount;
                    org.telegram.ui.Components.d5.f0(i11, tL_error5, yg0Var, tL_auth_resendCode, new Object[0]);
                    break;
                }
                break;
            case 7:
                nf0 nf0Var = (nf0) obj5;
                TLObject tLObject6 = (TLObject) obj4;
                Bundle bundle2 = (Bundle) obj3;
                TLRPC.TL_error tL_error6 = (TLRPC.TL_error) obj2;
                TL_account.sendVerifyEmailCode sendverifyemailcode = (TL_account.sendVerifyEmailCode) obj;
                yg0 yg0Var2 = nf0Var.E;
                yg0Var2.k1(false, true);
                nf0Var.r = false;
                if (tLObject6 instanceof TL_account.sentEmailCode) {
                    TL_account.sentEmailCode sentemailcode = (TL_account.sentEmailCode) tLObject6;
                    bundle2.putString("emailPattern", sentemailcode.email_pattern);
                    bundle2.putInt("length", sentemailcode.length);
                    yg0Var2.u1(13, true, bundle2, false);
                    break;
                } else {
                    String str6 = tL_error6.text;
                    if (str6 != null) {
                        if (str6.contains("EMAIL_INVALID")) {
                            nf0Var.o();
                            break;
                        } else if (tL_error6.text.contains("EMAIL_NOT_ALLOWED")) {
                            yg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.EmailNotAllowed));
                            break;
                        } else if (tL_error6.text.contains("PHONE_PASSWORD_FLOOD")) {
                            yg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("FloodWait", R.string.FloodWait));
                            break;
                        } else if (tL_error6.text.contains("PHONE_NUMBER_FLOOD")) {
                            yg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("PhoneNumberFlood", R.string.PhoneNumberFlood));
                            break;
                        } else if (!tL_error6.text.contains("PHONE_CODE_EMPTY") && !tL_error6.text.contains("PHONE_CODE_INVALID")) {
                            if (tL_error6.text.contains("PHONE_CODE_EXPIRED")) {
                                yg0Var2.u1(0, true, null, true);
                                yg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("CodeExpired", R.string.CodeExpired));
                                break;
                            } else if (tL_error6.text.startsWith("FLOOD_WAIT")) {
                                yg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("FloodWait", R.string.FloodWait));
                                break;
                            } else if (tL_error6.code != -1000) {
                                i12 = ((org.telegram.ui.ActionBar.n2) yg0Var2).currentAccount;
                                org.telegram.ui.Components.d5.f0(i12, tL_error6, yg0Var2, sendverifyemailcode, nf0Var.w);
                                break;
                            }
                        } else {
                            yg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("InvalidCode", R.string.InvalidCode));
                            break;
                        }
                    }
                }
                break;
            case 8:
                TLObject tLObject7 = (TLObject) obj4;
                Bundle bundle3 = (Bundle) obj3;
                TLRPC.TL_error tL_error7 = (TLRPC.TL_error) obj2;
                TL_account.verifyEmail verifyemail = (TL_account.verifyEmail) obj;
                yg0 yg0Var3 = ((nf0) obj5).E;
                if (!(tLObject7 instanceof TL_account.TL_emailVerified) || yg0Var3.F != 3) {
                    if (tLObject7 instanceof TL_account.TL_emailVerifiedLogin) {
                        TL_account.TL_emailVerifiedLogin tL_emailVerifiedLogin = (TL_account.TL_emailVerifiedLogin) tLObject7;
                        bundle3.putString("email", tL_emailVerifiedLogin.email);
                        yg0Var3.g1(bundle3, tL_emailVerifiedLogin.sent_code, true);
                        break;
                    } else if (tL_error7 != null) {
                        if (tL_error7.text.contains("EMAIL_NOT_ALLOWED")) {
                            yg0Var3.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.EmailNotAllowed));
                            break;
                        } else if (tL_error7.text.contains("EMAIL_TOKEN_INVALID")) {
                            yg0Var3.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.EmailTokenInvalid));
                            break;
                        } else if (tL_error7.code != -1000) {
                            i13 = ((org.telegram.ui.ActionBar.n2) yg0Var3).currentAccount;
                            org.telegram.ui.Components.d5.f0(i13, tL_error7, yg0Var3, verifyemail, new Object[0]);
                            break;
                        }
                    }
                } else {
                    yg0Var3.finishFragment();
                    yg0Var3.d0.run();
                    break;
                }
                break;
            case 9:
                final hg0 hg0Var = (hg0) obj5;
                TLObject tLObject8 = (TLObject) obj4;
                TLRPC.TL_inputInvoicePremiumAuthCode tL_inputInvoicePremiumAuthCode = (TLRPC.TL_inputInvoicePremiumAuthCode) obj3;
                final TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode = (TLRPC.TL_inputStorePaymentAuthCode) obj;
                TLRPC.TL_error tL_error8 = (TLRPC.TL_error) obj2;
                ?? r03 = hg0Var.v;
                hg0Var.b.setLoading(false);
                if (tLObject8 instanceof TLRPC.PaymentForm) {
                    final TLRPC.PaymentForm paymentForm2 = (TLRPC.PaymentForm) tLObject8;
                    r03.getMessagesController().putUsers(paymentForm2.users, false);
                    xo0 xo0Var2 = new xo0(tL_inputInvoicePremiumAuthCode, paymentForm2, null, null, 4, null, null, null, null, null, null, false, null, r03, true);
                    xo0Var2.V0 = true;
                    xo0Var2.c1 = new Utilities.Callback() { // from class: org.telegram.ui.cg0
                        @Override // org.telegram.messenger.Utilities.Callback
                        public final void run(Object obj6) {
                            switch (r13) {
                                case 0:
                                    final int i21 = 0;
                                    final hg0 hg0Var2 = hg0Var;
                                    final TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode2 = tL_inputStorePaymentAuthCode;
                                    final TLRPC.PaymentForm paymentForm3 = paymentForm2;
                                    AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.eg0
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i21) {
                                                case 0:
                                                    TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode3 = tL_inputStorePaymentAuthCode2;
                                                    String str7 = tL_inputStorePaymentAuthCode3.phone_number;
                                                    String str8 = tL_inputStorePaymentAuthCode3.phone_code_hash;
                                                    long j3 = paymentForm3.form_id;
                                                    hg0 hg0Var3 = hg0Var2;
                                                    if (!hg0Var3.f) {
                                                        hg0Var3.f = true;
                                                        hg0Var3.h = str7;
                                                        hg0Var3.n = str8;
                                                        hg0Var3.r = j3;
                                                        hg0Var3.b.setLoading(true);
                                                        hg0Var3.p();
                                                        break;
                                                    }
                                                    break;
                                                default:
                                                    TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode4 = tL_inputStorePaymentAuthCode2;
                                                    String str9 = tL_inputStorePaymentAuthCode4.phone_number;
                                                    String str10 = tL_inputStorePaymentAuthCode4.phone_code_hash;
                                                    long j10 = paymentForm3.form_id;
                                                    hg0 hg0Var4 = hg0Var2;
                                                    if (!hg0Var4.f) {
                                                        hg0Var4.f = true;
                                                        hg0Var4.h = str9;
                                                        hg0Var4.n = str10;
                                                        hg0Var4.r = j10;
                                                        hg0Var4.b.setLoading(true);
                                                        hg0Var4.p();
                                                        break;
                                                    }
                                                    break;
                                            }
                                        }
                                    });
                                    break;
                                default:
                                    final int i22 = 1;
                                    final hg0 hg0Var3 = hg0Var;
                                    final TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode3 = tL_inputStorePaymentAuthCode;
                                    final TLRPC.PaymentForm paymentForm4 = paymentForm2;
                                    AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.eg0
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i22) {
                                                case 0:
                                                    TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode32 = tL_inputStorePaymentAuthCode3;
                                                    String str7 = tL_inputStorePaymentAuthCode32.phone_number;
                                                    String str8 = tL_inputStorePaymentAuthCode32.phone_code_hash;
                                                    long j3 = paymentForm4.form_id;
                                                    hg0 hg0Var32 = hg0Var3;
                                                    if (!hg0Var32.f) {
                                                        hg0Var32.f = true;
                                                        hg0Var32.h = str7;
                                                        hg0Var32.n = str8;
                                                        hg0Var32.r = j3;
                                                        hg0Var32.b.setLoading(true);
                                                        hg0Var32.p();
                                                        break;
                                                    }
                                                    break;
                                                default:
                                                    TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode4 = tL_inputStorePaymentAuthCode3;
                                                    String str9 = tL_inputStorePaymentAuthCode4.phone_number;
                                                    String str10 = tL_inputStorePaymentAuthCode4.phone_code_hash;
                                                    long j10 = paymentForm4.form_id;
                                                    hg0 hg0Var4 = hg0Var3;
                                                    if (!hg0Var4.f) {
                                                        hg0Var4.f = true;
                                                        hg0Var4.h = str9;
                                                        hg0Var4.n = str10;
                                                        hg0Var4.r = j10;
                                                        hg0Var4.b.setLoading(true);
                                                        hg0Var4.p();
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
                    xo0Var2.d1 = new Utilities.Callback() { // from class: org.telegram.ui.cg0
                        @Override // org.telegram.messenger.Utilities.Callback
                        public final void run(Object obj6) {
                            switch (i19) {
                                case 0:
                                    final int i21 = 0;
                                    final hg0 hg0Var2 = hg0Var;
                                    final TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode2 = tL_inputStorePaymentAuthCode;
                                    final TLRPC.PaymentForm paymentForm3 = paymentForm2;
                                    AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.eg0
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i21) {
                                                case 0:
                                                    TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode32 = tL_inputStorePaymentAuthCode2;
                                                    String str7 = tL_inputStorePaymentAuthCode32.phone_number;
                                                    String str8 = tL_inputStorePaymentAuthCode32.phone_code_hash;
                                                    long j3 = paymentForm3.form_id;
                                                    hg0 hg0Var32 = hg0Var2;
                                                    if (!hg0Var32.f) {
                                                        hg0Var32.f = true;
                                                        hg0Var32.h = str7;
                                                        hg0Var32.n = str8;
                                                        hg0Var32.r = j3;
                                                        hg0Var32.b.setLoading(true);
                                                        hg0Var32.p();
                                                        break;
                                                    }
                                                    break;
                                                default:
                                                    TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode4 = tL_inputStorePaymentAuthCode2;
                                                    String str9 = tL_inputStorePaymentAuthCode4.phone_number;
                                                    String str10 = tL_inputStorePaymentAuthCode4.phone_code_hash;
                                                    long j10 = paymentForm3.form_id;
                                                    hg0 hg0Var4 = hg0Var2;
                                                    if (!hg0Var4.f) {
                                                        hg0Var4.f = true;
                                                        hg0Var4.h = str9;
                                                        hg0Var4.n = str10;
                                                        hg0Var4.r = j10;
                                                        hg0Var4.b.setLoading(true);
                                                        hg0Var4.p();
                                                        break;
                                                    }
                                                    break;
                                            }
                                        }
                                    });
                                    break;
                                default:
                                    final int i22 = 1;
                                    final hg0 hg0Var3 = hg0Var;
                                    final TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode3 = tL_inputStorePaymentAuthCode;
                                    final TLRPC.PaymentForm paymentForm4 = paymentForm2;
                                    AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.eg0
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i22) {
                                                case 0:
                                                    TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode32 = tL_inputStorePaymentAuthCode3;
                                                    String str7 = tL_inputStorePaymentAuthCode32.phone_number;
                                                    String str8 = tL_inputStorePaymentAuthCode32.phone_code_hash;
                                                    long j3 = paymentForm4.form_id;
                                                    hg0 hg0Var32 = hg0Var3;
                                                    if (!hg0Var32.f) {
                                                        hg0Var32.f = true;
                                                        hg0Var32.h = str7;
                                                        hg0Var32.n = str8;
                                                        hg0Var32.r = j3;
                                                        hg0Var32.b.setLoading(true);
                                                        hg0Var32.p();
                                                        break;
                                                    }
                                                    break;
                                                default:
                                                    TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode4 = tL_inputStorePaymentAuthCode3;
                                                    String str9 = tL_inputStorePaymentAuthCode4.phone_number;
                                                    String str10 = tL_inputStorePaymentAuthCode4.phone_code_hash;
                                                    long j10 = paymentForm4.form_id;
                                                    hg0 hg0Var4 = hg0Var3;
                                                    if (!hg0Var4.f) {
                                                        hg0Var4.f = true;
                                                        hg0Var4.h = str9;
                                                        hg0Var4.n = str10;
                                                        hg0Var4.r = j10;
                                                        hg0Var4.b.setLoading(true);
                                                        hg0Var4.p();
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
                    xo0Var2.e1 = new m20(hg0Var, i19);
                    r03.presentFragment(xo0Var2);
                    break;
                } else if (tL_error8 != null) {
                    if ("PHONE_CODE_EXPIRED".equalsIgnoreCase(tL_error8.text)) {
                        AndroidUtilities.runOnUIThread(new dg0(hg0Var, r13));
                        break;
                    } else {
                        String str7 = tL_error8.text;
                        hg0Var.e = str7;
                        new org.telegram.ui.Components.xc(r03.Z, null).H(R.raw.error, LocaleController.formatString(R.string.UnknownErrorCode, str7));
                        break;
                    }
                } else {
                    new org.telegram.ui.Components.xc(r03.Z, null).H(R.raw.error, LocaleController.getString(R.string.UnknownError));
                    break;
                }
            case 10:
                mj0 mj0Var = (mj0) obj5;
                TLRPC.TL_error tL_error9 = (TLRPC.TL_error) obj2;
                jg.b bVar = (jg.b) obj3;
                String str8 = (String) obj4;
                TL_stats.TL_loadAsyncGraph tL_loadAsyncGraph = (TL_stats.TL_loadAsyncGraph) obj;
                mj0Var.y = true;
                if (tL_error9 != null || bVar == null) {
                    mj0Var.g0();
                    break;
                } else {
                    mj0Var.v.put(str8, bVar);
                    na1 na1Var = mj0Var.r;
                    na1Var.e = bVar;
                    na1Var.c = tL_loadAsyncGraph.x;
                    mj0Var.g0();
                    break;
                }
            case 11:
                fk0.n((fk0) obj5, (TLRPC.TL_contacts_importedContacts) obj3, (TLRPC.TL_inputPhoneContact) obj4, (TLRPC.TL_error) obj2, (TLRPC.TL_contacts_importContacts) obj);
                break;
            case 12:
                TLRPC.TL_error tL_error10 = (TLRPC.TL_error) obj2;
                sl0 sl0Var = (sl0) obj3;
                m5.e eVar = (m5.e) obj4;
                TL_account.verifyEmail verifyemail2 = (TL_account.verifyEmail) obj;
                pn0 pn0Var = ((xm0) obj5).a;
                if (tL_error10 == null) {
                    ((sm0) pn0Var.B1).c(pn0Var.E, (String) pn0Var.s1.get("email"), null, null, null, null, null, null, null, null, sl0Var, eVar);
                    break;
                } else {
                    i14 = ((org.telegram.ui.ActionBar.n2) pn0Var).currentAccount;
                    org.telegram.ui.Components.d5.f0(i14, tL_error10, pn0Var, verifyemail2, new Object[0]);
                    eVar.b(null, null);
                    break;
                }
            case 13:
                ln0 ln0Var = (ln0) obj5;
                TLRPC.TL_error tL_error11 = (TLRPC.TL_error) obj2;
                Bundle bundle4 = (Bundle) obj3;
                TLObject tLObject9 = (TLObject) obj4;
                TLRPC.TL_auth_resendCode tL_auth_resendCode2 = (TLRPC.TL_auth_resendCode) obj;
                pn0 pn0Var2 = ln0Var.Q;
                ln0Var.J = false;
                if (tL_error11 == null) {
                    pn0Var2.l1(bundle4, (TLRPC.TL_auth_sentCode) tLObject9, true);
                } else {
                    i15 = ((org.telegram.ui.ActionBar.n2) pn0Var2).currentAccount;
                    org.telegram.ui.ActionBar.b2 f02 = org.telegram.ui.Components.d5.f0(i15, tL_error11, pn0Var2, tL_auth_resendCode2, new Object[0]);
                    if (f02 != null && tL_error11.text.contains("PHONE_CODE_EXPIRED")) {
                        f02.m0 = new gn0(ln0Var, r13);
                    }
                }
                pn0Var2.x1();
                break;
            case 14:
                xo0.f0((xo0) obj5, (TLRPC.TL_error) obj2, (TLObject) obj4, (String) obj3, (TL_account.getPassword) obj);
                break;
            case 15:
                ClippingImageView[] clippingImageViewArr = (ClippingImageView[]) obj3;
                ArrayList arrayList = (ArrayList) obj4;
                Integer num = (Integer) obj;
                bv0 bv0Var2 = (bv0) obj2;
                PhotoViewer photoViewer = ((fu0) obj5).r;
                photoViewer.p4 = null;
                vu0 vu0Var = photoViewer.e0;
                if (vu0Var != null && photoViewer.g0 != null) {
                    vu0Var.setLayerType(0, null);
                    photoViewer.n4 = 0;
                    photoViewer.F1();
                    photoViewer.o4 = 0L;
                    photoViewer.G1 = null;
                    photoViewer.E1.a = false;
                    photoViewer.H1 = null;
                    photoViewer.F1.a = false;
                    photoViewer.C2();
                    photoViewer.y2();
                    photoViewer.e0.invalidate();
                    for (ClippingImageView clippingImageView : clippingImageViewArr) {
                        clippingImageView.setVisibility(8);
                    }
                    dv0 dv0Var = photoViewer.q4;
                    if (dv0Var != null) {
                        dv0Var.a.setVisible(true, true);
                    }
                    dv0 dv0Var2 = photoViewer.r4;
                    if (dv0Var2 != null && !dv0Var2.s) {
                        dv0Var2.a.setVisible(false, true);
                    }
                    if (arrayList != null && (i16 = photoViewer.c2) != 3 && i16 != 1 && ((bv0Var = photoViewer.d) == null || !bv0Var.O())) {
                        photoViewer.R1();
                    }
                    org.telegram.ui.Components.v71 v71Var = photoViewer.F2;
                    if (v71Var != null && v71Var.y() && photoViewer.r1 && !photoViewer.g7.isEmpty()) {
                        PhotoViewer.Z(photoViewer, photoViewer.F2.n());
                        PhotoViewer.Y(photoViewer, true);
                    }
                    if (photoViewer.t4) {
                        PhotoViewer.a0(photoViewer, num.intValue());
                    }
                    if (bv0Var2 != null) {
                        bv0Var2.d();
                        break;
                    }
                }
                break;
            case 16:
                PrivacyControlActivity privacyControlActivity = (PrivacyControlActivity) obj5;
                boolean[] zArr = (boolean[]) obj3;
                TLRPC.GlobalPrivacySettings globalPrivacySettings = (TLRPC.GlobalPrivacySettings) obj4;
                TL_account.setGlobalPrivacySettings setglobalprivacysettings = (TL_account.setGlobalPrivacySettings) obj;
                if (((TLRPC.TL_error) obj2) != null) {
                    privacyControlActivity.B0();
                    break;
                } else {
                    privacyControlActivity.getClass();
                    zArr[1] = true;
                    if (globalPrivacySettings != null) {
                        TLRPC.GlobalPrivacySettings globalPrivacySettings2 = setglobalprivacysettings.settings;
                        globalPrivacySettings.new_noncontact_peers_require_premium = globalPrivacySettings2.new_noncontact_peers_require_premium;
                        int i21 = globalPrivacySettings2.flags;
                        globalPrivacySettings.flags = i21;
                        globalPrivacySettings.disallowed_stargifts = globalPrivacySettings2.disallowed_stargifts;
                        long j3 = globalPrivacySettings2.noncontact_peers_paid_stars;
                        if (j3 > 0) {
                            globalPrivacySettings.flags = i21 | 32;
                            globalPrivacySettings.noncontact_peers_paid_stars = j3;
                        } else {
                            globalPrivacySettings.flags = i21 & (-33);
                            globalPrivacySettings.noncontact_peers_paid_stars = 0L;
                        }
                    }
                    if (zArr[0]) {
                        privacyControlActivity.x0();
                    }
                    privacyControlActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.privacyRulesUpdated, new Object[0]);
                    break;
                }
            case 17:
                TLRPC.UserFull userFull = (TLRPC.UserFull) obj3;
                TL_account.TL_birthday tL_birthday = (TL_account.TL_birthday) obj;
                TLRPC.TL_error tL_error12 = (TLRPC.TL_error) obj2;
                ?? r04 = ((zx0) obj5).d;
                if (((TLObject) obj4) instanceof TLRPC.TL_boolTrue) {
                    org.telegram.ui.Components.pc Q = org.telegram.ui.Components.xc.a0(r04).Q(R.raw.contact_check, 36, LocaleController.getString(R.string.PrivacyBirthdaySetDone));
                    Q.j = 5000;
                    Q.j();
                    break;
                } else {
                    if (userFull != null) {
                        if (tL_birthday == null) {
                            userFull.flags2 &= -33;
                        } else {
                            userFull.flags2 |= 32;
                        }
                        userFull.birthday = tL_birthday;
                        r04.getMessagesStorage().updateUserInfo(userFull, false);
                    }
                    if (tL_error12 != null && (str = tL_error12.text) != null && str.startsWith("FLOOD_WAIT_")) {
                        if (r04.getParentActivity() != null) {
                            Activity parentActivity = r04.getParentActivity();
                            f6Var = ((org.telegram.ui.ActionBar.n2) r04).resourceProvider;
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(parentActivity, 0, f6Var);
                            String string = LocaleController.getString(R.string.PrivacyBirthdayTooOftenTitle);
                            org.telegram.ui.ActionBar.b2 b2Var2 = alertDialog$Builder.a;
                            b2Var2.R = string;
                            b2Var2.T = LocaleController.getString(R.string.PrivacyBirthdayTooOftenMessage);
                            alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                            r04.showDialog(b2Var2);
                            break;
                        }
                    } else {
                        org.telegram.messenger.l0.o(R.string.UnknownError, org.telegram.ui.Components.xc.a0(r04), R.raw.error, 36);
                        break;
                    }
                }
                break;
            case 18:
                ?? r84 = (ProfileActivity) obj5;
                TLRPC.ChatParticipant chatParticipant = (TLRPC.ChatParticipant) obj4;
                TLRPC.User user2 = (TLRPC.User) obj;
                org.telegram.messenger.mk mkVar = (org.telegram.messenger.mk) obj2;
                if (!(((TLRPC.ChannelParticipant) obj3) instanceof TLRPC.TL_channelParticipantAdmin) && !(chatParticipant instanceof TLRPC.TL_chatParticipantAdmin)) {
                    mkVar.run(1);
                    break;
                } else {
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(r84.getParentActivity(), 0, r84.z0);
                    String string2 = LocaleController.getString(R.string.AppName);
                    org.telegram.ui.ActionBar.b2 b2Var3 = alertDialog$Builder2.a;
                    b2Var3.R = string2;
                    b2Var3.T = LocaleController.formatString(R.string.AdminWillBeRemoved, ContactsController.formatName(user2.first_name, user2.last_name));
                    alertDialog$Builder2.k(LocaleController.getString(R.string.OK), new ol0(mkVar, 12));
                    alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                    r84.showDialog(b2Var3);
                    break;
                }
                break;
            case 19:
                ProfileActivity profileActivity = (ProfileActivity) obj5;
                TLObject tLObject10 = (TLObject) obj4;
                TLRPC.TL_username tL_username = (TLRPC.TL_username) obj3;
                yz0 yz0Var = (yz0) obj;
                TLRPC.TL_error tL_error13 = (TLRPC.TL_error) obj2;
                if (tLObject10 instanceof TL_fragment.TL_collectibleInfo) {
                    TL_fragment.TL_collectibleInfo tL_collectibleInfo = (TL_fragment.TL_collectibleInfo) tLObject10;
                    if (profileActivity.e1 != 0) {
                        profileActivity.getMessagesController().getUser(Long.valueOf(profileActivity.e1));
                    } else {
                        profileActivity.getMessagesController().getChat(Long.valueOf(profileActivity.f1));
                    }
                    String str9 = "@" + tL_username.username;
                    String format = LocaleController.getInstance().getFormatterBoostExpired().format(new Date(tL_collectibleInfo.purchase_date * 1000));
                    String formatCurrency = BillingController.getInstance().formatCurrency(tL_collectibleInfo.crypto_amount, tL_collectibleInfo.crypto_currency);
                    String formatCurrency2 = BillingController.getInstance().formatCurrency(tL_collectibleInfo.amount, tL_collectibleInfo.currency);
                    org.telegram.ui.Components.pc w10 = new org.telegram.ui.Components.xc(yz0Var.w, profileActivity.z0).w(R.drawable.filled_username, AndroidUtilities.withLearnMore(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.FragmentChannelUsername, str9, format, formatCurrency, TextUtils.isEmpty(formatCurrency2) ? "" : a4.a.p("(", formatCurrency2, ")"))), new rx0(i18, profileActivity, tL_collectibleInfo)));
                    tv tvVar = new tv(29, profileActivity, tL_collectibleInfo);
                    org.telegram.ui.Components.tb tbVar = w10.e;
                    if (tbVar != null) {
                        tbVar.setOnClickListener(tvVar);
                    }
                    w10.k(false);
                    break;
                } else {
                    org.telegram.ui.Components.xc.b0(tL_error13);
                    break;
                }
            case 20:
                ProfileActivity profileActivity2 = (ProfileActivity) obj5;
                TLObject tLObject11 = (TLObject) obj4;
                String str10 = (String) obj3;
                TLRPC.User user3 = (TLRPC.User) obj;
                TLRPC.TL_error tL_error14 = (TLRPC.TL_error) obj2;
                if (tLObject11 instanceof TL_fragment.TL_collectibleInfo) {
                    i20.a(profileActivity2.getParentActivity(), 1, str10, user3, (TL_fragment.TL_collectibleInfo) tLObject11, profileActivity2.z0);
                    break;
                } else {
                    org.telegram.ui.Components.xc.b0(tL_error14);
                    break;
                }
            case 21:
                ProfileActivity.X((ProfileActivity) obj5, (TLObject) obj4, (TLRPC.UserFull) obj3, (TL_account.TL_birthday) obj, (TLRPC.TL_error) obj2);
                break;
            case 22:
                j11 j11Var = (j11) obj5;
                ArrayList arrayList2 = (ArrayList) obj4;
                ArrayList arrayList3 = (ArrayList) obj;
                ArrayList arrayList4 = (ArrayList) obj2;
                org.telegram.ui.ActionBar.n2 n2Var2 = j11Var.e;
                if (((String) obj3).equals(j11Var.y)) {
                    if (!j11Var.w && (n2Var2 instanceof ProfileActivity)) {
                        try {
                            ((ProfileActivity) n2Var2).P.b.getImageReceiver().startAnimation();
                            ((ProfileActivity) n2Var2).P.d.setText(LocaleController.getString(R.string.SettingsNoResults));
                        } catch (Exception e11) {
                            FileLog.e(e11);
                        }
                    }
                    j11Var.w = true;
                    j11Var.r = arrayList2;
                    j11Var.s = arrayList3;
                    j11Var.n = arrayList4;
                    j11Var.l();
                    if (n2Var2 instanceof ProfileActivity) {
                        try {
                            ((ProfileActivity) n2Var2).P.b.getImageReceiver().startAnimation();
                            break;
                        } catch (Exception e12) {
                            FileLog.e(e12);
                            return;
                        }
                    }
                }
                break;
            case 23:
                j71 j71Var = (j71) obj5;
                j71Var.getClass();
                j71Var.p((View) obj3, Long.valueOf(((org.telegram.ui.Components.y5) obj4).documentId), (TLRPC.Document) obj, ((s61) obj2).v, null);
                break;
            case 24:
                t71 t71Var = (t71) obj5;
                TLRPC.TL_error tL_error15 = (TLRPC.TL_error) obj2;
                TLObject tLObject12 = (TLObject) obj4;
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) obj3;
                TLRPC.User user4 = (TLRPC.User) obj;
                t71Var.getClass();
                if (tL_error15 == null) {
                    TL_account.Password password = (TL_account.Password) tLObject12;
                    twoStepVerificationActivity.I = password;
                    TwoStepVerificationActivity.m0(password);
                    t71Var.T(user4, twoStepVerificationActivity.l0(), twoStepVerificationActivity);
                    break;
                }
                break;
            case 25:
                TLRPC.TL_error tL_error16 = (TLRPC.TL_error) obj2;
                Utilities.Callback callback = (Utilities.Callback) obj5;
                TLObject tLObject13 = (TLObject) obj4;
                MessagesController messagesController = (MessagesController) obj3;
                Utilities.Callback callback2 = (Utilities.Callback) obj;
                if (tL_error16 != null) {
                    callback.run(tL_error16);
                    break;
                } else if (tLObject13 instanceof TL_stories.TL_premium_myBoosts) {
                    TL_stories.TL_premium_myBoosts tL_premium_myBoosts = (TL_stories.TL_premium_myBoosts) tLObject13;
                    messagesController.putUsers(tL_premium_myBoosts.users, false);
                    messagesController.putChats(tL_premium_myBoosts.chats, false);
                    callback2.run(tL_premium_myBoosts);
                    break;
                }
                break;
            case 26:
                TLRPC.TL_error tL_error17 = (TLRPC.TL_error) obj2;
                org.telegram.messenger.v vVar = (org.telegram.messenger.v) obj5;
                TLObject tLObject14 = (TLObject) obj4;
                MessagesController messagesController2 = (MessagesController) obj3;
                ?? r14 = (org.telegram.messenger.g2) obj;
                if (tL_error17 != null) {
                    vVar.run(tL_error17);
                    break;
                } else if (tLObject14 instanceof TL_stories.TL_premium_myBoosts) {
                    TL_stories.TL_premium_myBoosts tL_premium_myBoosts2 = (TL_stories.TL_premium_myBoosts) tLObject14;
                    messagesController2.putUsers(tL_premium_myBoosts2.users, false);
                    messagesController2.putChats(tL_premium_myBoosts2.chats, false);
                    r14.run(tL_premium_myBoosts2);
                    break;
                }
                break;
            case 27:
                TLObject tLObject15 = (TLObject) obj4;
                MessagesController messagesController3 = (MessagesController) obj5;
                ?? r62 = (ai.e4) obj3;
                tg.f fVar = (tg.f) obj;
                TLRPC.TL_error tL_error18 = (TLRPC.TL_error) obj2;
                if (tLObject15 instanceof TLRPC.TL_payments_checkedGiftCode) {
                    TLRPC.TL_payments_checkedGiftCode tL_payments_checkedGiftCode = (TLRPC.TL_payments_checkedGiftCode) tLObject15;
                    messagesController3.putChats(tL_payments_checkedGiftCode.chats, false);
                    messagesController3.putUsers(tL_payments_checkedGiftCode.users, false);
                    r62.run(tL_payments_checkedGiftCode);
                }
                fVar.run(tL_error18);
                break;
            case 28:
                tg.m1.R((tg.m1) obj5, (TLObject) obj4, (TLRPC.UserFull) obj3, (TL_account.TL_birthday) obj, (TLRPC.TL_error) obj2);
                break;
            default:
                xh.z4 z4Var = (xh.z4) obj5;
                TLRPC.TL_inputStorePaymentGiftPremium tL_inputStorePaymentGiftPremium = (TLRPC.TL_inputStorePaymentGiftPremium) obj3;
                TLRPC.TL_error tL_error19 = (TLRPC.TL_error) obj2;
                TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore = (TLRPC.TL_payments_canPurchaseStore) obj;
                int i22 = z4Var.Y;
                org.telegram.ui.ActionBar.n2 n2Var3 = z4Var.n;
                if (((TLObject) obj4) instanceof TLRPC.TL_boolTrue) {
                    BillingController billingController = BillingController.getInstance();
                    Activity parentActivity2 = n2Var3.getParentActivity();
                    AccountInstance accountInstance = AccountInstance.getInstance(i22);
                    of.b bVar2 = new of.b(7, (boolean) r13);
                    bVar2.X(z4Var.e0.h);
                    billingController.launchBillingFlow(parentActivity2, accountInstance, tL_inputStorePaymentGiftPremium, Collections.singletonList(bVar2.H()));
                    break;
                } else if (tL_error19 != null) {
                    org.telegram.ui.Components.d5.f0(i22, tL_error19, n2Var3, tL_payments_canPurchaseStore, new Object[0]);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ h90(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
    }

    public /* synthetic */ h90(Object obj, TLObject tLObject, Object obj2, Object obj3, TLRPC.TL_error tL_error, int i10) {
        this.a = i10;
        this.b = obj;
        this.d = tLObject;
        this.c = obj2;
        this.e = obj3;
        this.f = tL_error;
    }

    public /* synthetic */ h90(Object obj, TLRPC.TL_error tL_error, Object obj2, Object obj3, Object obj4, int i10) {
        this.a = i10;
        this.b = obj;
        this.f = tL_error;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    public /* synthetic */ h90(Object obj, TLRPC.TL_error tL_error, TLObject tLObject, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.b = obj;
        this.f = tL_error;
        this.d = tLObject;
        this.c = obj2;
        this.e = obj3;
    }

    public /* synthetic */ h90(TLObject tLObject, MessagesController messagesController, ai.e4 e4Var, tg.f fVar, TLRPC.TL_error tL_error) {
        this.a = 27;
        this.d = tLObject;
        this.b = messagesController;
        this.c = e4Var;
        this.e = fVar;
        this.f = tL_error;
    }

    public /* synthetic */ h90(TLRPC.TL_error tL_error, Utilities.Callback callback, TLObject tLObject, MessagesController messagesController, Utilities.Callback callback2, int i10) {
        this.a = i10;
        this.f = tL_error;
        this.b = callback;
        this.d = tLObject;
        this.c = messagesController;
        this.e = callback2;
    }

    public /* synthetic */ h90(LaunchActivity launchActivity, TLObject tLObject, org.telegram.ui.ActionBar.b2 b2Var, r80 r80Var, TLRPC.TL_error tL_error) {
        this.a = 3;
        this.b = launchActivity;
        this.d = tLObject;
        this.e = b2Var;
        this.c = r80Var;
        this.f = tL_error;
    }

    public /* synthetic */ h90(fk0 fk0Var, TLRPC.TL_contacts_importedContacts tL_contacts_importedContacts, TLRPC.TL_inputPhoneContact tL_inputPhoneContact, TLRPC.TL_error tL_error, TLRPC.TL_contacts_importContacts tL_contacts_importContacts) {
        this.a = 11;
        this.b = fk0Var;
        this.c = tL_contacts_importedContacts;
        this.d = tL_inputPhoneContact;
        this.f = tL_error;
        this.e = tL_contacts_importContacts;
    }
}
