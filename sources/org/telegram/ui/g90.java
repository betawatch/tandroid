package org.telegram.ui;

import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import java.util.ArrayList;
import java.util.Date;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_fragment;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.ClippingImageView;
import org.telegram.ui.Wallet.WalletEngine2;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class g90 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ g90(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
    }

    private final void a() {
        String h;
        String jSONObject;
        org.telegram.ui.Wallet.d2 d2Var = (org.telegram.ui.Wallet.d2) this.b;
        TL_wallet.sendTransfer sendtransfer = (TL_wallet.sendTransfer) this.c;
        org.telegram.ui.Wallet.z1 z1Var = (org.telegram.ui.Wallet.z1) this.d;
        Utilities.Callback callback = (Utilities.Callback) this.e;
        org.telegram.ui.Wallet.h0 h0Var = (org.telegram.ui.Wallet.h0) this.f;
        try {
            jSONObject = new JSONObject().put("boc", Base64.encodeToString(sendtransfer.data_normal, 2)).put("randomId", sendtransfer.random_id).toString();
        } catch (Exception e7) {
            h = org.telegram.ui.Wallet.d2.h("save transfer", e7);
        }
        if (!MessagesController.getMainSettings(d2Var.a).edit().putString(org.telegram.ui.Wallet.d2.j(z1Var.a.id, z1Var.b) + ".transfer", jSONObject).commit()) {
            throw new IllegalStateException("Could not save signed transfer");
        }
        h = null;
        AndroidUtilities.runOnUIThread(new ai.a9(d2Var, h, callback, z1Var, h0Var, sendtransfer, 15));
    }

    /* JADX WARN: Code restructure failed: missing block: B:382:0x08bf, code lost:
    
        if ("THEME_FORMAT_INVALID".equals(r14.text) != false) goto L324;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        vo0 vo0Var;
        org.telegram.ui.Components.ad d;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        cv0 cv0Var;
        String str;
        org.telegram.ui.ActionBar.e6 e6Var;
        org.telegram.ui.Wallet.h0 h0Var;
        org.telegram.ui.Wallet.p0 p0Var;
        String h;
        byte[] bArr;
        int i17 = this.a;
        int i18 = 10;
        int i19 = 2;
        TLRPC.TL_wallPaper tL_wallPaper = null;
        final int i20 = 1;
        final int i21 = 0;
        Object obj = this.f;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.c;
        Object obj5 = this.b;
        switch (i17) {
            case 0:
                LaunchActivity launchActivity = (LaunchActivity) obj5;
                m70 m70Var = (m70) obj4;
                TLObject tLObject = (TLObject) obj3;
                TLRPC.TL_wallPaper tL_wallPaper2 = (TLRPC.TL_wallPaper) obj2;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                Pattern pattern = LaunchActivity.B1;
                try {
                    m70Var.run();
                } catch (Exception e7) {
                    FileLog.e(e7);
                }
                if (!(tLObject instanceof TLRPC.TL_wallPaper)) {
                    StringBuilder sb2 = new StringBuilder();
                    org.telegram.ui.Cells.c1.l(R.string.ErrorOccurred, "\n", sb2);
                    sb2.append(tL_error.text);
                    launchActivity.B0(org.telegram.ui.Components.g5.M(launchActivity, null, sb2.toString()));
                    return;
                }
                TLRPC.TL_wallPaper tL_wallPaper3 = (TLRPC.TL_wallPaper) tLObject;
                if (tL_wallPaper3.pattern) {
                    String str2 = tL_wallPaper3.slug;
                    TLRPC.WallPaperSettings wallPaperSettings = tL_wallPaper2.settings;
                    ij1 ij1Var = new ij1(str2, wallPaperSettings.background_color, wallPaperSettings.second_background_color, wallPaperSettings.third_background_color, wallPaperSettings.fourth_background_color, AndroidUtilities.getWallpaperRotation(wallPaperSettings.rotation, false), r3.intensity / 100.0f, tL_wallPaper2.settings.motion, null);
                    ij1Var.g = tL_wallPaper3;
                    tL_wallPaper3 = ij1Var;
                }
                xd1 xd1Var = new xd1(tL_wallPaper3, null, true);
                TLRPC.WallPaperSettings wallPaperSettings2 = tL_wallPaper2.settings;
                boolean z10 = wallPaperSettings2.blur;
                boolean z11 = wallPaperSettings2.motion;
                float f7 = wallPaperSettings2.intensity;
                xd1Var.F1 = z10;
                xd1Var.E1 = z11;
                xd1Var.n1 = f7;
                launchActivity.p0(xd1Var);
                return;
            case 1:
                LaunchActivity launchActivity2 = (LaunchActivity) obj5;
                ty tyVar = (ty) obj4;
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) obj3;
                TLRPC.User user = (TLRPC.User) obj2;
                String str3 = (String) obj;
                ArrayList arrayList = launchActivity2.E0;
                if (tyVar == null) {
                    if (n2Var instanceof zn) {
                        ((zn) n2Var).ba(user.id, str3, true);
                        return;
                    }
                    return;
                }
                if (n2Var != null) {
                    n2Var.dismissCurrentDialog();
                }
                while (i21 < arrayList.size()) {
                    if (((Dialog) arrayList.get(i21)).isShowing()) {
                        ((Dialog) arrayList.get(i21)).dismiss();
                    }
                    i21++;
                }
                arrayList.clear();
                launchActivity2.p0(tyVar);
                return;
            case 2:
                LaunchActivity launchActivity3 = (LaunchActivity) obj5;
                TLObject tLObject2 = (TLObject) obj3;
                TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = (TLRPC.TL_messages_requestUrlAuth) obj4;
                String str4 = (String) obj2;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj;
                org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                if (tLObject2 == null) {
                    if (tL_error2 != null) {
                        if ("URL_EXPIRED".equalsIgnoreCase(tL_error2.text)) {
                            ml0.a().M(LocaleController.getString(R.string.BotAuthLoggedInFailTitle), LocaleController.getString(R.string.BotAuthLoggedInFailNoDomain), R.raw.error).j();
                            return;
                        } else {
                            ml0.a().f0(tL_error2, false);
                            return;
                        }
                    }
                    return;
                }
                if (tLObject2 instanceof TLRPC.TL_urlAuthResultRequest) {
                    ml0.b(false, launchActivity3.O, tL_messages_requestUrlAuth, (TLRPC.TL_urlAuthResultRequest) tLObject2, null, null, null, false, null);
                    return;
                } else if (tLObject2 instanceof TLRPC.TL_urlAuthResultAccepted) {
                    ml0.b(false, launchActivity3.O, tL_messages_requestUrlAuth, (TLRPC.TL_urlAuthResultAccepted) tLObject2, null, null, null, false, null);
                    return;
                } else {
                    if (tLObject2 instanceof TLRPC.TL_urlAuthResultDefault) {
                        org.telegram.ui.Components.g5.p0(U, str4, false, true);
                        return;
                    }
                    return;
                }
            case 3:
                LaunchActivity launchActivity4 = (LaunchActivity) obj5;
                TLObject tLObject3 = (TLObject) obj3;
                org.telegram.ui.ActionBar.b2 b2Var = (org.telegram.ui.ActionBar.b2) obj2;
                m70 m70Var2 = (m70) obj4;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj;
                Pattern pattern2 = LaunchActivity.B1;
                if (tLObject3 instanceof TLRPC.TL_theme) {
                    TLRPC.TL_theme tL_theme = (TLRPC.TL_theme) tLObject3;
                    TLRPC.ThemeSettings themeSettings = tL_theme.settings.size() > 0 ? tL_theme.settings.get(0) : null;
                    if (themeSettings != null) {
                        org.telegram.ui.ActionBar.h6 O0 = org.telegram.ui.ActionBar.i6.O0(org.telegram.ui.ActionBar.i6.r0(themeSettings));
                        if (O0 != null) {
                            TLRPC.WallPaper wallPaper = themeSettings.wallpaper;
                            if (wallPaper instanceof TLRPC.TL_wallPaper) {
                                tL_wallPaper = (TLRPC.TL_wallPaper) wallPaper;
                                if (!FileLoader.getInstance(launchActivity4.O).getPathToAttach(tL_wallPaper.document, true).exists()) {
                                    launchActivity4.V0 = b2Var;
                                    launchActivity4.U0 = true;
                                    launchActivity4.S0 = O0;
                                    launchActivity4.T0 = tL_theme;
                                    launchActivity4.R0 = tL_wallPaper;
                                    launchActivity4.Q0 = FileLoader.getAttachFileName(tL_wallPaper.document);
                                    FileLoader.getInstance(launchActivity4.O).loadFile(tL_wallPaper.document, tL_wallPaper, 1, 1);
                                    return;
                                }
                            }
                            try {
                                m70Var2.run();
                            } catch (Exception e10) {
                                FileLog.e(e10);
                            }
                            launchActivity4.n0(tL_theme, tL_wallPaper, O0);
                        } else {
                            i21 = 1;
                        }
                    } else {
                        TLRPC.Document document = tL_theme.document;
                        if (document != null) {
                            launchActivity4.U0 = false;
                            launchActivity4.T0 = tL_theme;
                            launchActivity4.P0 = FileLoader.getAttachFileName(document);
                            launchActivity4.V0 = b2Var;
                            FileLoader.getInstance(launchActivity4.O).loadFile(launchActivity4.T0.document, tL_theme, 1, 1);
                        }
                        i19 = 1;
                    }
                    i19 = i21;
                } else if (tL_error3 != null) {
                    break;
                }
                if (i19 != 0) {
                    try {
                        m70Var2.run();
                    } catch (Exception e11) {
                        FileLog.e(e11);
                    }
                    if (i19 == 1) {
                        launchActivity4.B0(org.telegram.ui.Components.g5.M(launchActivity4, LocaleController.getString(R.string.Theme), LocaleController.getString(R.string.ThemeNotSupported)));
                        return;
                    } else {
                        launchActivity4.B0(org.telegram.ui.Components.g5.M(launchActivity4, LocaleController.getString(R.string.Theme), LocaleController.getString(R.string.ThemeNotFound)));
                        return;
                    }
                }
                return;
            case 4:
                ec0 ec0Var = (ec0) obj5;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) obj;
                TLObject tLObject4 = (TLObject) obj3;
                TLRPC.TL_inputInvoiceSlug tL_inputInvoiceSlug = (TLRPC.TL_inputInvoiceSlug) obj4;
                String str5 = (String) obj2;
                int i22 = ec0Var.b;
                LaunchActivity launchActivity5 = ec0Var.a;
                if (tL_error4 != null) {
                    if ("SUBSCRIPTION_ALREADY_ACTIVE".equalsIgnoreCase(tL_error4.text)) {
                        d = ec0.d();
                        i10 = R.string.PaymentInvoiceSubscriptionLinkAlreadyPaid;
                    } else {
                        d = ec0.d();
                        i10 = R.string.PaymentInvoiceLinkInvalid;
                    }
                    org.telegram.messenger.bi.q(i10, d, null);
                } else if (!launchActivity5.isFinishing()) {
                    if (tLObject4 instanceof TLRPC.TL_payments_paymentFormStars) {
                        xh.p4 p4Var = launchActivity5.Y0;
                        launchActivity5.Y0 = null;
                        yh.m5.y(i22, false).Y(null, tL_inputInvoiceSlug, (TLRPC.TL_payments_paymentFormStars) tLObject4, new yb0(ec0Var, 1), new j90(p4Var, i20));
                        return;
                    }
                    if (tLObject4 instanceof TLRPC.PaymentForm) {
                        TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject4;
                        MessagesController.getInstance(i22).putUsers(paymentForm.users, false);
                        vo0Var = new vo0(paymentForm, null, str5, LaunchActivity.U());
                    } else {
                        vo0Var = tLObject4 instanceof TLRPC.PaymentReceipt ? new vo0((TLRPC.PaymentReceipt) tLObject4) : null;
                    }
                    if (vo0Var != null) {
                        xh.p4 p4Var2 = launchActivity5.Y0;
                        if (p4Var2 != null) {
                            launchActivity5.Y0 = null;
                            vo0Var.Z0 = new of(i18, p4Var2);
                        }
                        ec0Var.u(vo0Var, false);
                    }
                }
                ec0Var.c();
                return;
            case 5:
                wg0.U((wg0) obj5, (TLRPC.TL_error) obj, (String) obj4, (String) obj3, (String) obj2);
                return;
            case 6:
                TLObject tLObject5 = (TLObject) obj3;
                Bundle bundle = (Bundle) obj4;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) obj;
                TLRPC.TL_auth_resendCode tL_auth_resendCode = (TLRPC.TL_auth_resendCode) obj2;
                wg0 wg0Var = ((fe0) obj5).W;
                if (tLObject5 instanceof TLRPC.TL_auth_sentCode) {
                    wg0Var.g1(bundle, (TLRPC.TL_auth_sentCode) tLObject5, true);
                    return;
                } else {
                    if (tL_error5 == null || tL_error5.text == null) {
                        return;
                    }
                    i11 = ((org.telegram.ui.ActionBar.n2) wg0Var).currentAccount;
                    org.telegram.ui.Components.g5.e0(i11, tL_error5, wg0Var, tL_auth_resendCode, new Object[0]);
                    return;
                }
            case 7:
                kf0 kf0Var = (kf0) obj5;
                TLObject tLObject6 = (TLObject) obj3;
                Bundle bundle2 = (Bundle) obj4;
                TLRPC.TL_error tL_error6 = (TLRPC.TL_error) obj;
                TL_account.sendVerifyEmailCode sendverifyemailcode = (TL_account.sendVerifyEmailCode) obj2;
                wg0 wg0Var2 = kf0Var.E;
                wg0Var2.k1(false, true);
                kf0Var.r = false;
                if (tLObject6 instanceof TL_account.sentEmailCode) {
                    TL_account.sentEmailCode sentemailcode = (TL_account.sentEmailCode) tLObject6;
                    bundle2.putString("emailPattern", sentemailcode.email_pattern);
                    bundle2.putInt("length", sentemailcode.length);
                    wg0Var2.u1(13, true, bundle2, false);
                    return;
                }
                String str6 = tL_error6.text;
                if (str6 != null) {
                    if (str6.contains("EMAIL_INVALID")) {
                        kf0Var.o();
                        return;
                    }
                    if (tL_error6.text.contains("EMAIL_NOT_ALLOWED")) {
                        wg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.EmailNotAllowed));
                        return;
                    }
                    if (tL_error6.text.contains("PHONE_PASSWORD_FLOOD")) {
                        wg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("FloodWait", R.string.FloodWait));
                        return;
                    }
                    if (tL_error6.text.contains("PHONE_NUMBER_FLOOD")) {
                        wg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("PhoneNumberFlood", R.string.PhoneNumberFlood));
                        return;
                    }
                    if (tL_error6.text.contains("PHONE_CODE_EMPTY") || tL_error6.text.contains("PHONE_CODE_INVALID")) {
                        wg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("InvalidCode", R.string.InvalidCode));
                        return;
                    }
                    if (tL_error6.text.contains("PHONE_CODE_EXPIRED")) {
                        wg0Var2.u1(0, true, null, true);
                        wg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("CodeExpired", R.string.CodeExpired));
                        return;
                    } else if (tL_error6.text.startsWith("FLOOD_WAIT")) {
                        wg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("FloodWait", R.string.FloodWait));
                        return;
                    } else {
                        if (tL_error6.code != -1000) {
                            i12 = ((org.telegram.ui.ActionBar.n2) wg0Var2).currentAccount;
                            org.telegram.ui.Components.g5.e0(i12, tL_error6, wg0Var2, sendverifyemailcode, kf0Var.w);
                            return;
                        }
                        return;
                    }
                }
                return;
            case 8:
                TLObject tLObject7 = (TLObject) obj3;
                Bundle bundle3 = (Bundle) obj4;
                TLRPC.TL_error tL_error7 = (TLRPC.TL_error) obj;
                TL_account.verifyEmail verifyemail = (TL_account.verifyEmail) obj2;
                wg0 wg0Var3 = ((kf0) obj5).E;
                if ((tLObject7 instanceof TL_account.TL_emailVerified) && wg0Var3.F == 3) {
                    wg0Var3.finishFragment();
                    wg0Var3.d0.run();
                    return;
                }
                if (tLObject7 instanceof TL_account.TL_emailVerifiedLogin) {
                    TL_account.TL_emailVerifiedLogin tL_emailVerifiedLogin = (TL_account.TL_emailVerifiedLogin) tLObject7;
                    bundle3.putString("email", tL_emailVerifiedLogin.email);
                    wg0Var3.g1(bundle3, tL_emailVerifiedLogin.sent_code, true);
                    return;
                } else {
                    if (tL_error7 != null) {
                        if (tL_error7.text.contains("EMAIL_NOT_ALLOWED")) {
                            wg0Var3.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.EmailNotAllowed));
                            return;
                        }
                        if (tL_error7.text.contains("EMAIL_TOKEN_INVALID")) {
                            wg0Var3.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.EmailTokenInvalid));
                            return;
                        } else {
                            if (tL_error7.code != -1000) {
                                i13 = ((org.telegram.ui.ActionBar.n2) wg0Var3).currentAccount;
                                org.telegram.ui.Components.g5.e0(i13, tL_error7, wg0Var3, verifyemail, new Object[0]);
                                return;
                            }
                            return;
                        }
                    }
                    return;
                }
            case 9:
                final fg0 fg0Var = (fg0) obj5;
                TLObject tLObject8 = (TLObject) obj3;
                TLRPC.TL_inputInvoicePremiumAuthCode tL_inputInvoicePremiumAuthCode = (TLRPC.TL_inputInvoicePremiumAuthCode) obj4;
                final TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode = (TLRPC.TL_inputStorePaymentAuthCode) obj2;
                TLRPC.TL_error tL_error8 = (TLRPC.TL_error) obj;
                wg0 wg0Var4 = fg0Var.v;
                fg0Var.b.setLoading(false);
                if (tLObject8 instanceof TLRPC.PaymentForm) {
                    final TLRPC.PaymentForm paymentForm2 = (TLRPC.PaymentForm) tLObject8;
                    wg0Var4.getMessagesController().putUsers(paymentForm2.users, false);
                    vo0 vo0Var2 = new vo0(tL_inputInvoicePremiumAuthCode, paymentForm2, null, null, 4, null, null, null, null, null, null, false, null, wg0Var4, true);
                    vo0Var2.V0 = true;
                    vo0Var2.c1 = new Utilities.Callback() { // from class: org.telegram.ui.ag0
                        @Override // org.telegram.messenger.Utilities.Callback
                        public final void run(Object obj6) {
                            switch (i21) {
                                case 0:
                                    final int i23 = 0;
                                    final fg0 fg0Var2 = fg0Var;
                                    final TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode2 = tL_inputStorePaymentAuthCode;
                                    final TLRPC.PaymentForm paymentForm3 = paymentForm2;
                                    AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.cg0
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i23) {
                                                case 0:
                                                    TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode3 = tL_inputStorePaymentAuthCode2;
                                                    String str7 = tL_inputStorePaymentAuthCode3.phone_number;
                                                    String str8 = tL_inputStorePaymentAuthCode3.phone_code_hash;
                                                    long j3 = paymentForm3.form_id;
                                                    fg0 fg0Var3 = fg0Var2;
                                                    if (!fg0Var3.f) {
                                                        fg0Var3.f = true;
                                                        fg0Var3.h = str7;
                                                        fg0Var3.n = str8;
                                                        fg0Var3.r = j3;
                                                        fg0Var3.b.setLoading(true);
                                                        fg0Var3.p();
                                                        break;
                                                    }
                                                    break;
                                                default:
                                                    TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode4 = tL_inputStorePaymentAuthCode2;
                                                    String str9 = tL_inputStorePaymentAuthCode4.phone_number;
                                                    String str10 = tL_inputStorePaymentAuthCode4.phone_code_hash;
                                                    long j10 = paymentForm3.form_id;
                                                    fg0 fg0Var4 = fg0Var2;
                                                    if (!fg0Var4.f) {
                                                        fg0Var4.f = true;
                                                        fg0Var4.h = str9;
                                                        fg0Var4.n = str10;
                                                        fg0Var4.r = j10;
                                                        fg0Var4.b.setLoading(true);
                                                        fg0Var4.p();
                                                        break;
                                                    }
                                                    break;
                                            }
                                        }
                                    });
                                    break;
                                default:
                                    final int i24 = 1;
                                    final fg0 fg0Var3 = fg0Var;
                                    final TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode3 = tL_inputStorePaymentAuthCode;
                                    final TLRPC.PaymentForm paymentForm4 = paymentForm2;
                                    AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.cg0
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i24) {
                                                case 0:
                                                    TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode32 = tL_inputStorePaymentAuthCode3;
                                                    String str7 = tL_inputStorePaymentAuthCode32.phone_number;
                                                    String str8 = tL_inputStorePaymentAuthCode32.phone_code_hash;
                                                    long j3 = paymentForm4.form_id;
                                                    fg0 fg0Var32 = fg0Var3;
                                                    if (!fg0Var32.f) {
                                                        fg0Var32.f = true;
                                                        fg0Var32.h = str7;
                                                        fg0Var32.n = str8;
                                                        fg0Var32.r = j3;
                                                        fg0Var32.b.setLoading(true);
                                                        fg0Var32.p();
                                                        break;
                                                    }
                                                    break;
                                                default:
                                                    TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode4 = tL_inputStorePaymentAuthCode3;
                                                    String str9 = tL_inputStorePaymentAuthCode4.phone_number;
                                                    String str10 = tL_inputStorePaymentAuthCode4.phone_code_hash;
                                                    long j10 = paymentForm4.form_id;
                                                    fg0 fg0Var4 = fg0Var3;
                                                    if (!fg0Var4.f) {
                                                        fg0Var4.f = true;
                                                        fg0Var4.h = str9;
                                                        fg0Var4.n = str10;
                                                        fg0Var4.r = j10;
                                                        fg0Var4.b.setLoading(true);
                                                        fg0Var4.p();
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
                    vo0Var2.d1 = new Utilities.Callback() { // from class: org.telegram.ui.ag0
                        @Override // org.telegram.messenger.Utilities.Callback
                        public final void run(Object obj6) {
                            switch (i20) {
                                case 0:
                                    final int i23 = 0;
                                    final fg0 fg0Var2 = fg0Var;
                                    final TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode2 = tL_inputStorePaymentAuthCode;
                                    final TLRPC.PaymentForm paymentForm3 = paymentForm2;
                                    AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.cg0
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i23) {
                                                case 0:
                                                    TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode32 = tL_inputStorePaymentAuthCode2;
                                                    String str7 = tL_inputStorePaymentAuthCode32.phone_number;
                                                    String str8 = tL_inputStorePaymentAuthCode32.phone_code_hash;
                                                    long j3 = paymentForm3.form_id;
                                                    fg0 fg0Var32 = fg0Var2;
                                                    if (!fg0Var32.f) {
                                                        fg0Var32.f = true;
                                                        fg0Var32.h = str7;
                                                        fg0Var32.n = str8;
                                                        fg0Var32.r = j3;
                                                        fg0Var32.b.setLoading(true);
                                                        fg0Var32.p();
                                                        break;
                                                    }
                                                    break;
                                                default:
                                                    TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode4 = tL_inputStorePaymentAuthCode2;
                                                    String str9 = tL_inputStorePaymentAuthCode4.phone_number;
                                                    String str10 = tL_inputStorePaymentAuthCode4.phone_code_hash;
                                                    long j10 = paymentForm3.form_id;
                                                    fg0 fg0Var4 = fg0Var2;
                                                    if (!fg0Var4.f) {
                                                        fg0Var4.f = true;
                                                        fg0Var4.h = str9;
                                                        fg0Var4.n = str10;
                                                        fg0Var4.r = j10;
                                                        fg0Var4.b.setLoading(true);
                                                        fg0Var4.p();
                                                        break;
                                                    }
                                                    break;
                                            }
                                        }
                                    });
                                    break;
                                default:
                                    final int i24 = 1;
                                    final fg0 fg0Var3 = fg0Var;
                                    final TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode3 = tL_inputStorePaymentAuthCode;
                                    final TLRPC.PaymentForm paymentForm4 = paymentForm2;
                                    AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.cg0
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i24) {
                                                case 0:
                                                    TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode32 = tL_inputStorePaymentAuthCode3;
                                                    String str7 = tL_inputStorePaymentAuthCode32.phone_number;
                                                    String str8 = tL_inputStorePaymentAuthCode32.phone_code_hash;
                                                    long j3 = paymentForm4.form_id;
                                                    fg0 fg0Var32 = fg0Var3;
                                                    if (!fg0Var32.f) {
                                                        fg0Var32.f = true;
                                                        fg0Var32.h = str7;
                                                        fg0Var32.n = str8;
                                                        fg0Var32.r = j3;
                                                        fg0Var32.b.setLoading(true);
                                                        fg0Var32.p();
                                                        break;
                                                    }
                                                    break;
                                                default:
                                                    TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode4 = tL_inputStorePaymentAuthCode3;
                                                    String str9 = tL_inputStorePaymentAuthCode4.phone_number;
                                                    String str10 = tL_inputStorePaymentAuthCode4.phone_code_hash;
                                                    long j10 = paymentForm4.form_id;
                                                    fg0 fg0Var4 = fg0Var3;
                                                    if (!fg0Var4.f) {
                                                        fg0Var4.f = true;
                                                        fg0Var4.h = str9;
                                                        fg0Var4.n = str10;
                                                        fg0Var4.r = j10;
                                                        fg0Var4.b.setLoading(true);
                                                        fg0Var4.p();
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
                    vo0Var2.e1 = new k20(fg0Var, i20);
                    wg0Var4.presentFragment(vo0Var2);
                    return;
                }
                if (tL_error8 == null) {
                    new org.telegram.ui.Components.ad(wg0Var4.Z, null).H(R.raw.error, LocaleController.getString(R.string.UnknownError));
                    return;
                } else {
                    if ("PHONE_CODE_EXPIRED".equalsIgnoreCase(tL_error8.text)) {
                        AndroidUtilities.runOnUIThread(new bg0(fg0Var, i21));
                        return;
                    }
                    String str7 = tL_error8.text;
                    fg0Var.e = str7;
                    new org.telegram.ui.Components.ad(wg0Var4.Z, null).H(R.raw.error, LocaleController.formatString(R.string.UnknownErrorCode, str7));
                    return;
                }
            case 10:
                lj0 lj0Var = (lj0) obj5;
                TLRPC.TL_error tL_error9 = (TLRPC.TL_error) obj;
                jg.b bVar = (jg.b) obj4;
                String str8 = (String) obj3;
                TL_stats.TL_loadAsyncGraph tL_loadAsyncGraph = (TL_stats.TL_loadAsyncGraph) obj2;
                lj0Var.y = true;
                if (tL_error9 != null || bVar == null) {
                    lj0Var.g0();
                    return;
                }
                lj0Var.v.put(str8, bVar);
                na1 na1Var = lj0Var.r;
                na1Var.e = bVar;
                na1Var.c = tL_loadAsyncGraph.x;
                lj0Var.g0();
                return;
            case 11:
                dk0.p((dk0) obj5, (TLRPC.TL_contacts_importedContacts) obj4, (TLRPC.TL_inputPhoneContact) obj3, (TLRPC.TL_error) obj, (TLRPC.TL_contacts_importContacts) obj2);
                return;
            case 12:
                TLRPC.TL_error tL_error10 = (TLRPC.TL_error) obj;
                tk0 tk0Var = (tk0) obj4;
                org.telegram.ui.ActionBar.b5 b5Var = (org.telegram.ui.ActionBar.b5) obj3;
                TL_account.verifyEmail verifyemail2 = (TL_account.verifyEmail) obj2;
                nn0 nn0Var = ((vm0) obj5).a;
                if (tL_error10 == null) {
                    ((qm0) nn0Var.B1).c(nn0Var.E, (String) nn0Var.s1.get("email"), null, null, null, null, null, null, null, null, tk0Var, b5Var);
                    return;
                }
                i14 = ((org.telegram.ui.ActionBar.n2) nn0Var).currentAccount;
                org.telegram.ui.Components.g5.e0(i14, tL_error10, nn0Var, verifyemail2, new Object[0]);
                b5Var.c(null, null);
                return;
            case 13:
                jn0 jn0Var = (jn0) obj5;
                TLRPC.TL_error tL_error11 = (TLRPC.TL_error) obj;
                Bundle bundle4 = (Bundle) obj4;
                TLObject tLObject9 = (TLObject) obj3;
                TLRPC.TL_auth_resendCode tL_auth_resendCode2 = (TLRPC.TL_auth_resendCode) obj2;
                nn0 nn0Var2 = jn0Var.Q;
                jn0Var.J = false;
                if (tL_error11 == null) {
                    nn0Var2.k1(bundle4, (TLRPC.TL_auth_sentCode) tLObject9, true);
                } else {
                    i15 = ((org.telegram.ui.ActionBar.n2) nn0Var2).currentAccount;
                    org.telegram.ui.ActionBar.b2 e02 = org.telegram.ui.Components.g5.e0(i15, tL_error11, nn0Var2, tL_auth_resendCode2, new Object[0]);
                    if (e02 != null && tL_error11.text.contains("PHONE_CODE_EXPIRED")) {
                        e02.m0 = new en0(jn0Var, i21);
                    }
                }
                nn0Var2.w1();
                return;
            case 14:
                vo0.f0((vo0) obj5, (TLRPC.TL_error) obj, (TLObject) obj3, (String) obj4, (TL_account.getPassword) obj2);
                return;
            case 15:
                ClippingImageView[] clippingImageViewArr = (ClippingImageView[]) obj4;
                ArrayList arrayList2 = (ArrayList) obj3;
                Integer num = (Integer) obj2;
                cv0 cv0Var2 = (cv0) obj;
                PhotoViewer photoViewer = ((gu0) obj5).r;
                photoViewer.p4 = null;
                wu0 wu0Var = photoViewer.e0;
                if (wu0Var == null || photoViewer.g0 == null) {
                    return;
                }
                wu0Var.setLayerType(0, null);
                photoViewer.n4 = 0;
                photoViewer.G1();
                photoViewer.o4 = 0L;
                photoViewer.G1 = null;
                photoViewer.E1.a = false;
                photoViewer.H1 = null;
                photoViewer.F1.a = false;
                photoViewer.D2();
                photoViewer.z2();
                photoViewer.e0.invalidate();
                for (ClippingImageView clippingImageView : clippingImageViewArr) {
                    clippingImageView.setVisibility(8);
                }
                ev0 ev0Var = photoViewer.q4;
                if (ev0Var != null) {
                    ev0Var.a.setVisible(true, true);
                }
                ev0 ev0Var2 = photoViewer.r4;
                if (ev0Var2 != null && !ev0Var2.s) {
                    ev0Var2.a.setVisible(false, true);
                }
                if (arrayList2 != null && (i16 = photoViewer.c2) != 3 && i16 != 1 && ((cv0Var = photoViewer.d) == null || !cv0Var.O())) {
                    photoViewer.S1();
                }
                org.telegram.ui.Components.k81 k81Var = photoViewer.F2;
                if (k81Var != null && k81Var.y() && photoViewer.r1 && !photoViewer.g7.isEmpty()) {
                    PhotoViewer.Z(photoViewer, photoViewer.F2.n());
                    PhotoViewer.Y(photoViewer, true);
                }
                if (photoViewer.t4) {
                    PhotoViewer.a0(photoViewer, num.intValue());
                }
                if (cv0Var2 != null) {
                    cv0Var2.d();
                    return;
                }
                return;
            case 16:
                PrivacyControlActivity privacyControlActivity = (PrivacyControlActivity) obj5;
                boolean[] zArr = (boolean[]) obj4;
                TLRPC.GlobalPrivacySettings globalPrivacySettings = (TLRPC.GlobalPrivacySettings) obj3;
                TL_account.setGlobalPrivacySettings setglobalprivacysettings = (TL_account.setGlobalPrivacySettings) obj2;
                if (((TLRPC.TL_error) obj) != null) {
                    privacyControlActivity.B0();
                    return;
                }
                privacyControlActivity.getClass();
                zArr[1] = true;
                if (globalPrivacySettings != null) {
                    TLRPC.GlobalPrivacySettings globalPrivacySettings2 = setglobalprivacysettings.settings;
                    globalPrivacySettings.new_noncontact_peers_require_premium = globalPrivacySettings2.new_noncontact_peers_require_premium;
                    int i23 = globalPrivacySettings2.flags;
                    globalPrivacySettings.flags = i23;
                    globalPrivacySettings.disallowed_stargifts = globalPrivacySettings2.disallowed_stargifts;
                    long j3 = globalPrivacySettings2.noncontact_peers_paid_stars;
                    if (j3 > 0) {
                        globalPrivacySettings.flags = i23 | 32;
                        globalPrivacySettings.noncontact_peers_paid_stars = j3;
                    } else {
                        globalPrivacySettings.flags = i23 & (-33);
                        globalPrivacySettings.noncontact_peers_paid_stars = 0L;
                    }
                }
                if (zArr[0]) {
                    privacyControlActivity.x0();
                }
                privacyControlActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.privacyRulesUpdated, new Object[0]);
                return;
            case 17:
                TLRPC.UserFull userFull = (TLRPC.UserFull) obj4;
                TL_account.TL_birthday tL_birthday = (TL_account.TL_birthday) obj2;
                TLRPC.TL_error tL_error12 = (TLRPC.TL_error) obj;
                PrivacyControlActivity privacyControlActivity2 = ((yx0) obj5).d;
                if (((TLObject) obj3) instanceof TLRPC.TL_boolTrue) {
                    org.telegram.ui.Components.tc Q = org.telegram.ui.Components.ad.a0(privacyControlActivity2).Q(R.raw.contact_check, 36, LocaleController.getString(R.string.PrivacyBirthdaySetDone));
                    Q.j = 5000;
                    Q.j();
                    return;
                }
                if (userFull != null) {
                    if (tL_birthday == null) {
                        userFull.flags2 &= -33;
                    } else {
                        userFull.flags2 |= 32;
                    }
                    userFull.birthday = tL_birthday;
                    privacyControlActivity2.getMessagesStorage().updateUserInfo(userFull, false);
                }
                if (tL_error12 == null || (str = tL_error12.text) == null || !str.startsWith("FLOOD_WAIT_")) {
                    org.telegram.messenger.q.q(R.string.UnknownError, org.telegram.ui.Components.ad.a0(privacyControlActivity2), R.raw.error, 36);
                    return;
                }
                if (privacyControlActivity2.getParentActivity() != null) {
                    Activity parentActivity = privacyControlActivity2.getParentActivity();
                    e6Var = ((org.telegram.ui.ActionBar.n2) privacyControlActivity2).resourceProvider;
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(parentActivity, 0, e6Var);
                    String string = LocaleController.getString(R.string.PrivacyBirthdayTooOftenTitle);
                    org.telegram.ui.ActionBar.b2 b2Var2 = alertDialog$Builder.a;
                    b2Var2.R = string;
                    b2Var2.T = LocaleController.getString(R.string.PrivacyBirthdayTooOftenMessage);
                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                    privacyControlActivity2.showDialog(b2Var2);
                    return;
                }
                return;
            case 18:
                ProfileActivity profileActivity = (ProfileActivity) obj5;
                TLRPC.ChatParticipant chatParticipant = (TLRPC.ChatParticipant) obj3;
                TLRPC.User user2 = (TLRPC.User) obj2;
                org.telegram.messenger.jk jkVar = (org.telegram.messenger.jk) obj;
                if (!(((TLRPC.ChannelParticipant) obj4) instanceof TLRPC.TL_channelParticipantAdmin) && !(chatParticipant instanceof TLRPC.TL_chatParticipantAdmin)) {
                    jkVar.run(1);
                    return;
                }
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(profileActivity.getParentActivity(), 0, profileActivity.z0);
                String string2 = LocaleController.getString(R.string.AppName);
                org.telegram.ui.ActionBar.b2 b2Var3 = alertDialog$Builder2.a;
                b2Var3.R = string2;
                b2Var3.T = LocaleController.formatString(R.string.AdminWillBeRemoved, ContactsController.formatName(user2.first_name, user2.last_name));
                alertDialog$Builder2.k(LocaleController.getString(R.string.OK), new hq0(jkVar, i18));
                alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                profileActivity.showDialog(b2Var3);
                return;
            case 19:
                ProfileActivity profileActivity2 = (ProfileActivity) obj5;
                TLObject tLObject10 = (TLObject) obj3;
                TLRPC.TL_username tL_username = (TLRPC.TL_username) obj4;
                yz0 yz0Var = (yz0) obj2;
                TLRPC.TL_error tL_error13 = (TLRPC.TL_error) obj;
                if (!(tLObject10 instanceof TL_fragment.TL_collectibleInfo)) {
                    org.telegram.ui.Components.ad.d0(tL_error13);
                    return;
                }
                TL_fragment.TL_collectibleInfo tL_collectibleInfo = (TL_fragment.TL_collectibleInfo) tLObject10;
                if (profileActivity2.e1 != 0) {
                    profileActivity2.getMessagesController().getUser(Long.valueOf(profileActivity2.e1));
                } else {
                    profileActivity2.getMessagesController().getChat(Long.valueOf(profileActivity2.f1));
                }
                String str9 = "@" + tL_username.username;
                String format = LocaleController.getInstance().getFormatterBoostExpired().format(new Date(tL_collectibleInfo.purchase_date * 1000));
                String formatCurrency = BillingController.getInstance().formatCurrency(tL_collectibleInfo.crypto_amount, tL_collectibleInfo.crypto_currency);
                String formatCurrency2 = BillingController.getInstance().formatCurrency(tL_collectibleInfo.amount, tL_collectibleInfo.currency);
                org.telegram.ui.Components.tc w10 = new org.telegram.ui.Components.ad(yz0Var.w, profileActivity2.z0).w(R.drawable.filled_username, AndroidUtilities.withLearnMore(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.FragmentChannelUsername, str9, format, formatCurrency, TextUtils.isEmpty(formatCurrency2) ? "" : a1.g.q("(", formatCurrency2, ")"))), new rt0(16, profileActivity2, tL_collectibleInfo)));
                rv rvVar = new rv(29, profileActivity2, tL_collectibleInfo);
                org.telegram.ui.Components.xb xbVar = w10.e;
                if (xbVar != null) {
                    xbVar.setOnClickListener(rvVar);
                }
                w10.k(false);
                return;
            case 20:
                ProfileActivity profileActivity3 = (ProfileActivity) obj5;
                TLObject tLObject11 = (TLObject) obj3;
                String str10 = (String) obj4;
                TLRPC.User user3 = (TLRPC.User) obj2;
                TLRPC.TL_error tL_error14 = (TLRPC.TL_error) obj;
                if (tLObject11 instanceof TL_fragment.TL_collectibleInfo) {
                    g20.a(profileActivity3.getParentActivity(), 1, str10, user3, (TL_fragment.TL_collectibleInfo) tLObject11, profileActivity3.z0);
                    return;
                } else {
                    org.telegram.ui.Components.ad.d0(tL_error14);
                    return;
                }
            case 21:
                ProfileActivity.X((ProfileActivity) obj5, (TLObject) obj3, (TLRPC.UserFull) obj4, (TL_account.TL_birthday) obj2, (TLRPC.TL_error) obj);
                return;
            case 22:
                i11 i11Var = (i11) obj5;
                ArrayList arrayList3 = (ArrayList) obj3;
                ArrayList arrayList4 = (ArrayList) obj2;
                ArrayList arrayList5 = (ArrayList) obj;
                org.telegram.ui.ActionBar.n2 n2Var2 = i11Var.e;
                if (((String) obj4).equals(i11Var.y)) {
                    if (!i11Var.w && (n2Var2 instanceof ProfileActivity)) {
                        try {
                            ((ProfileActivity) n2Var2).P.b.getImageReceiver().startAnimation();
                            ((ProfileActivity) n2Var2).P.d.setText(LocaleController.getString(R.string.SettingsNoResults));
                        } catch (Exception e12) {
                            FileLog.e(e12);
                        }
                    }
                    i11Var.w = true;
                    i11Var.r = arrayList3;
                    i11Var.s = arrayList4;
                    i11Var.n = arrayList5;
                    i11Var.l();
                    if (n2Var2 instanceof ProfileActivity) {
                        try {
                            ((ProfileActivity) n2Var2).P.b.getImageReceiver().startAnimation();
                            return;
                        } catch (Exception e13) {
                            FileLog.e(e13);
                            return;
                        }
                    }
                    return;
                }
                return;
            case 23:
                k71 k71Var = (k71) obj5;
                k71Var.getClass();
                k71Var.p((View) obj4, Long.valueOf(((org.telegram.ui.Components.b6) obj3).documentId), (TLRPC.Document) obj2, ((t61) obj).v, null);
                return;
            case 24:
                u71 u71Var = (u71) obj5;
                TLRPC.TL_error tL_error15 = (TLRPC.TL_error) obj;
                TLObject tLObject12 = (TLObject) obj3;
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) obj4;
                TLRPC.User user4 = (TLRPC.User) obj2;
                u71Var.getClass();
                if (tL_error15 == null) {
                    TL_account.Password password = (TL_account.Password) tLObject12;
                    twoStepVerificationActivity.I = password;
                    TwoStepVerificationActivity.m0(password);
                    u71Var.U(user4, twoStepVerificationActivity.l0(), twoStepVerificationActivity);
                    return;
                }
                return;
            case 25:
                org.telegram.ui.Wallet.k0 k0Var = (org.telegram.ui.Wallet.k0) obj5;
                org.telegram.ui.Wallet.h0 h0Var2 = (org.telegram.ui.Wallet.h0) obj4;
                org.telegram.ui.Wallet.d dVar = (org.telegram.ui.Wallet.d) obj2;
                String str11 = (String) obj;
                try {
                    ((org.telegram.ui.ActionBar.b2) obj3).dismiss();
                    try {
                        if (h0Var2 != null && !h0Var2.e()) {
                            TL_wallet.WalletState walletState = k0Var.e;
                            if ((walletState instanceof TL_wallet.TL_walletState) && (p0Var = k0Var.c) != null && !p0Var.f(((TL_wallet.TL_walletState) walletState).public_key)) {
                                k0Var.c.p(UserConfig.getInstance(k0Var.a).getClientUserId(), ((TL_wallet.TL_walletState) k0Var.e).public_key, h0Var2, null);
                                h0Var = h0Var2;
                                dVar.run(h0Var, str11);
                                if (h0Var == null) {
                                    h0Var.close();
                                    return;
                                }
                                return;
                            }
                        }
                        dVar.run(h0Var, str11);
                        if (h0Var == null) {
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        if (h0Var != null) {
                            h0Var.close();
                        }
                        throw th;
                    }
                    h0Var = h0Var2;
                } catch (Throwable th3) {
                    th = th3;
                    h0Var = h0Var2;
                }
                break;
            case 26:
                org.telegram.ui.Wallet.d2 d2Var = (org.telegram.ui.Wallet.d2) obj5;
                JSONObject jSONObject = (JSONObject) obj4;
                Utilities.Callback callback = (Utilities.Callback) obj3;
                String str12 = (String) obj2;
                org.telegram.ui.Wallet.z1 z1Var = (org.telegram.ui.Wallet.z1) obj;
                d2Var.getClass();
                if (jSONObject == null) {
                    callback.run(str12);
                    return;
                } else {
                    d2Var.C(z1Var.a.id, z1Var.b, jSONObject, callback);
                    return;
                }
            case 27:
                org.telegram.ui.Wallet.z1 z1Var2 = (org.telegram.ui.Wallet.z1) obj4;
                ft ftVar = (ft) obj2;
                org.telegram.ui.Wallet.s1 s1Var = (org.telegram.ui.Wallet.s1) obj;
                try {
                    bArr = Base64.decode(WalletEngine2.tonConnectCrypto((org.telegram.ui.Wallet.h0) obj5, z1Var2.a, z1Var2.h, z1Var2.g, new JSONObject().put("challenge", Base64.encodeToString(((TL_wallet.tonConnectChallenge) obj3).challenge, 2))).getString("challengeAnswer"), 2);
                    h = null;
                } catch (Exception e14) {
                    h = org.telegram.ui.Wallet.d2.h("decrypt challenge", e14);
                    bArr = null;
                }
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Wallet.m6((Object) bArr, (Object) ftVar, h, (Object) s1Var, 7));
                return;
            case 28:
                a();
                return;
            default:
                ((WalletEngine2) obj5).lambda$emulateSendNFT$19((AtomicBoolean) obj4, (Utilities.Callback2) obj3, (TL_wallet.walletTransaction) obj2, (String) obj);
                return;
        }
    }

    public /* synthetic */ g90(Object obj, TLObject tLObject, Object obj2, Object obj3, TLRPC.TL_error tL_error, int i10) {
        this.a = i10;
        this.b = obj;
        this.d = tLObject;
        this.c = obj2;
        this.e = obj3;
        this.f = tL_error;
    }

    public /* synthetic */ g90(Object obj, TLRPC.TL_error tL_error, Object obj2, Object obj3, Object obj4, int i10) {
        this.a = i10;
        this.b = obj;
        this.f = tL_error;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    public /* synthetic */ g90(Object obj, TLRPC.TL_error tL_error, TLObject tLObject, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.b = obj;
        this.f = tL_error;
        this.d = tLObject;
        this.c = obj2;
        this.e = obj3;
    }

    public /* synthetic */ g90(org.telegram.ui.Components.xw0 xw0Var, TLObject tLObject, Bundle bundle, TLRPC.TL_error tL_error, TLObject tLObject2, int i10) {
        this.a = i10;
        this.b = xw0Var;
        this.d = tLObject;
        this.c = bundle;
        this.f = tL_error;
        this.e = tLObject2;
    }

    public /* synthetic */ g90(LaunchActivity launchActivity, TLObject tLObject, org.telegram.ui.ActionBar.b2 b2Var, m70 m70Var, TLRPC.TL_error tL_error) {
        this.a = 3;
        this.b = launchActivity;
        this.d = tLObject;
        this.e = b2Var;
        this.c = m70Var;
        this.f = tL_error;
    }

    public /* synthetic */ g90(dk0 dk0Var, TLRPC.TL_contacts_importedContacts tL_contacts_importedContacts, TLRPC.TL_inputPhoneContact tL_inputPhoneContact, TLRPC.TL_error tL_error, TLRPC.TL_contacts_importContacts tL_contacts_importContacts) {
        this.a = 11;
        this.b = dk0Var;
        this.c = tL_contacts_importedContacts;
        this.d = tL_inputPhoneContact;
        this.f = tL_error;
        this.e = tL_contacts_importContacts;
    }
}
