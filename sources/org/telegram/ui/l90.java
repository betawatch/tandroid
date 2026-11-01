package org.telegram.ui;

import android.app.Activity;
import android.graphics.RectF;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.view.KeyEvent;
import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;
import org.json.JSONObject;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_fragment;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.ClippingImageView;
import org.telegram.ui.Wallet.WalletEngine2;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class l90 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ l90(KeyEvent.Callback callback, TLObject tLObject, Object obj, TLRPC.TL_error tL_error, TLObject tLObject2, int i10) {
        this.a = i10;
        this.d = callback;
        this.c = tLObject;
        this.e = obj;
        this.b = tL_error;
        this.f = tLObject2;
    }

    private final void a() {
        ph.g4 g4Var = (ph.g4) this.d;
        TLObject tLObject = (TLObject) this.c;
        TLRPC.TL_inputStorePaymentGiftPremium tL_inputStorePaymentGiftPremium = (TLRPC.TL_inputStorePaymentGiftPremium) this.e;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.b;
        TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore = (TLRPC.TL_payments_canPurchaseStore) this.f;
        int i10 = g4Var.Q1;
        org.telegram.ui.ActionBar.k2 k2Var = g4Var.o1;
        if (!(tLObject instanceof TLRPC.TL_boolTrue)) {
            if (tL_error != null) {
                org.telegram.ui.Components.s4.e0(i10, tL_error, k2Var, tL_payments_canPurchaseStore, new Object[0]);
            }
        } else {
            org.telegram.messenger.u1 i11 = org.telegram.messenger.u1.i();
            Activity parentActivity = k2Var.getParentActivity();
            org.telegram.messenger.c a2 = org.telegram.messenger.c.a(i10);
            hf.b bVar = new hf.b(9, false);
            bVar.m0(g4Var.W1.h);
            i11.l(parentActivity, a2, tL_inputStorePaymentGiftPremium, Collections.singletonList(bVar.K()));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:422:0x0a14, code lost:
    
        if ("THEME_FORMAT_INVALID".equals(r3.text) != false) goto L356;
     */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:67:? A[RETURN, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        TLRPC.TL_wallPaper tL_wallPaper;
        qm0 qm0Var;
        org.telegram.ui.Components.cc d;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        ds0 ds0Var;
        String str;
        org.telegram.ui.ActionBar.p6 p6Var;
        org.telegram.ui.Wallet.h0 h0Var;
        org.telegram.ui.Wallet.p0 p0Var;
        String i17;
        byte[] bArr;
        int i18 = this.a;
        int i19 = 2;
        String str2 = null;
        final int i20 = 1;
        final int i21 = 0;
        Object obj = this.b;
        Object obj2 = this.f;
        Object obj3 = this.e;
        Object obj4 = this.c;
        Object obj5 = this.d;
        switch (i18) {
            case 0:
                LaunchActivity launchActivity = (LaunchActivity) obj5;
                TLObject tLObject = (TLObject) obj4;
                org.telegram.ui.ActionBar.x1 x1Var = (org.telegram.ui.ActionBar.x1) obj3;
                y60 y60Var = (y60) obj2;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                Pattern pattern = LaunchActivity.D1;
                if (tLObject instanceof TLRPC.TL_theme) {
                    TLRPC.TL_theme tL_theme = (TLRPC.TL_theme) tLObject;
                    TLRPC.ThemeSettings themeSettings = tL_theme.settings.size() > 0 ? tL_theme.settings.get(0) : null;
                    if (themeSettings != null) {
                        org.telegram.ui.ActionBar.s6 Q0 = org.telegram.ui.ActionBar.t6.Q0(org.telegram.ui.ActionBar.t6.r0(themeSettings));
                        if (Q0 != null) {
                            TLRPC.WallPaper wallPaper = themeSettings.wallpaper;
                            if (wallPaper instanceof TLRPC.TL_wallPaper) {
                                TLRPC.TL_wallPaper tL_wallPaper2 = (TLRPC.TL_wallPaper) wallPaper;
                                org.telegram.messenger.b8.G(launchActivity.O);
                                if (!org.telegram.messenger.b8.K(tL_wallPaper2.document, null, true, true).exists()) {
                                    launchActivity.W0 = x1Var;
                                    launchActivity.V0 = true;
                                    launchActivity.T0 = Q0;
                                    launchActivity.U0 = tL_theme;
                                    launchActivity.S0 = tL_wallPaper2;
                                    launchActivity.R0 = org.telegram.messenger.b8.r(null, tL_wallPaper2.document);
                                    org.telegram.messenger.b8.G(launchActivity.O).X(tL_wallPaper2.document, tL_wallPaper2, 1, 1);
                                    return;
                                }
                                tL_wallPaper = tL_wallPaper2;
                            } else {
                                tL_wallPaper = null;
                            }
                            try {
                                y60Var.run();
                            } catch (Exception e) {
                                org.telegram.messenger.f8.g(e, true);
                            }
                            launchActivity.r0(tL_theme, tL_wallPaper, Q0);
                        } else {
                            i21 = 1;
                        }
                    } else {
                        TLRPC.Document document = tL_theme.document;
                        if (document != null) {
                            launchActivity.V0 = false;
                            launchActivity.U0 = tL_theme;
                            launchActivity.Q0 = org.telegram.messenger.b8.r(null, document);
                            launchActivity.W0 = x1Var;
                            org.telegram.messenger.b8.G(launchActivity.O).X(launchActivity.U0.document, tL_theme, 1, 1);
                        }
                        i19 = 1;
                    }
                    i19 = i21;
                } else if (tL_error != null) {
                    break;
                }
                if (i19 != 0) {
                    try {
                        y60Var.run();
                    } catch (Exception e7) {
                        org.telegram.messenger.f8.g(e7, true);
                    }
                    if (i19 == 1) {
                        launchActivity.F0(org.telegram.ui.Components.s4.M(launchActivity, org.telegram.messenger.dd.L0(2131744215, null), org.telegram.messenger.dd.L0(2131744198, null)));
                        return;
                    } else {
                        launchActivity.F0(org.telegram.ui.Components.s4.M(launchActivity, org.telegram.messenger.dd.L0(2131744215, null), org.telegram.messenger.dd.L0(2131744199, null)));
                        return;
                    }
                }
                return;
            case 1:
                ta0 ta0Var = (ta0) obj5;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj;
                TLObject tLObject2 = (TLObject) obj4;
                TLRPC.TL_inputInvoiceSlug tL_inputInvoiceSlug = (TLRPC.TL_inputInvoiceSlug) obj3;
                String str3 = (String) obj2;
                int i22 = ta0Var.b;
                LaunchActivity launchActivity2 = ta0Var.a;
                if (tL_error2 != null) {
                    if ("SUBSCRIPTION_ALREADY_ACTIVE".equalsIgnoreCase(tL_error2.text)) {
                        d = ta0.d();
                        i10 = 2131747411;
                    } else {
                        d = ta0.d();
                        i10 = 2131747412;
                    }
                    org.telegram.messenger.m5.o(null, i10, d, null);
                } else if (!launchActivity2.isFinishing()) {
                    if (tLObject2 instanceof TLRPC.TL_payments_paymentFormStars) {
                        ph.w3 w3Var = launchActivity2.Z0;
                        launchActivity2.Z0 = null;
                        rh.e6.y(i22, false).X(null, tL_inputInvoiceSlug, (TLRPC.TL_payments_paymentFormStars) tLObject2, new oa0(ta0Var, 1), new k80(w3Var, i20));
                        return;
                    }
                    if (tLObject2 instanceof TLRPC.PaymentForm) {
                        TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject2;
                        org.telegram.messenger.wp.r1(i22).V3(paymentForm.users, false);
                        qm0Var = new qm0(paymentForm, null, str3, LaunchActivity.T());
                    } else {
                        qm0Var = tLObject2 instanceof TLRPC.PaymentReceipt ? new qm0((TLRPC.PaymentReceipt) tLObject2) : null;
                    }
                    if (qm0Var != null) {
                        ph.w3 w3Var2 = launchActivity2.Z0;
                        if (w3Var2 != null) {
                            launchActivity2.Z0 = null;
                            qm0Var.Z0 = new hf(10, w3Var2);
                        }
                        ta0Var.u(qm0Var, false);
                    }
                }
                ta0Var.c();
                return;
            case 2:
                gf0.b0((gf0) obj5, (TLRPC.TL_error) obj, (String) obj4, (String) obj3, (String) obj2);
                return;
            case 3:
                TLObject tLObject3 = (TLObject) obj4;
                Bundle bundle = (Bundle) obj3;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj;
                TLRPC.TL_auth_resendCode tL_auth_resendCode = (TLRPC.TL_auth_resendCode) obj2;
                gf0 gf0Var = ((vc0) obj5).W;
                if (tLObject3 instanceof TLRPC.TL_auth_sentCode) {
                    gf0Var.p1(bundle, (TLRPC.TL_auth_sentCode) tLObject3, true);
                    return;
                } else {
                    if (tL_error3 == null || tL_error3.text == null) {
                        return;
                    }
                    i11 = ((org.telegram.ui.ActionBar.k2) gf0Var).currentAccount;
                    org.telegram.ui.Components.s4.e0(i11, tL_error3, gf0Var, tL_auth_resendCode, new Object[0]);
                    return;
                }
            case 4:
                yd0 yd0Var = (yd0) obj5;
                TLObject tLObject4 = (TLObject) obj4;
                Bundle bundle2 = (Bundle) obj3;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) obj;
                TL_account.sendVerifyEmailCode sendverifyemailcode = (TL_account.sendVerifyEmailCode) obj2;
                gf0 gf0Var2 = yd0Var.E;
                gf0Var2.t1(false, true);
                yd0Var.r = false;
                if (tLObject4 instanceof TL_account.sentEmailCode) {
                    TL_account.sentEmailCode sentemailcode = (TL_account.sentEmailCode) tLObject4;
                    bundle2.putString("emailPattern", sentemailcode.email_pattern);
                    bundle2.putInt("length", sentemailcode.length);
                    gf0Var2.D1(13, true, bundle2, false);
                    return;
                }
                String str4 = tL_error4.text;
                if (str4 != null) {
                    if (str4.contains("EMAIL_INVALID")) {
                        yd0Var.n();
                        return;
                    }
                    if (tL_error4.text.contains("EMAIL_NOT_ALLOWED")) {
                        gf0Var2.u1(org.telegram.messenger.dd.L0(2131746088, null), org.telegram.messenger.dd.L0(2131751201, null));
                        return;
                    }
                    if (tL_error4.text.contains("PHONE_PASSWORD_FLOOD")) {
                        gf0Var2.u1(org.telegram.messenger.dd.L0(2131746088, null), org.telegram.messenger.dd.L0(2131750688, "FloodWait"));
                        return;
                    }
                    if (tL_error4.text.contains("PHONE_NUMBER_FLOOD")) {
                        gf0Var2.u1(org.telegram.messenger.dd.L0(2131746088, null), org.telegram.messenger.dd.L0(2131747302, "PhoneNumberFlood"));
                        return;
                    }
                    if (tL_error4.text.contains("PHONE_CODE_EMPTY") || tL_error4.text.contains("PHONE_CODE_INVALID")) {
                        gf0Var2.u1(org.telegram.messenger.dd.L0(2131746088, null), org.telegram.messenger.dd.L0(2131749193, "InvalidCode"));
                        return;
                    }
                    if (tL_error4.text.contains("PHONE_CODE_EXPIRED")) {
                        gf0Var2.D1(0, true, null, true);
                        gf0Var2.u1(org.telegram.messenger.dd.L0(2131746088, null), org.telegram.messenger.dd.L0(2131752021, "CodeExpired"));
                        return;
                    } else if (tL_error4.text.startsWith("FLOOD_WAIT")) {
                        gf0Var2.u1(org.telegram.messenger.dd.L0(2131746088, null), org.telegram.messenger.dd.L0(2131750688, "FloodWait"));
                        return;
                    } else {
                        if (tL_error4.code != -1000) {
                            i12 = ((org.telegram.ui.ActionBar.k2) gf0Var2).currentAccount;
                            org.telegram.ui.Components.s4.e0(i12, tL_error4, gf0Var2, sendverifyemailcode, yd0Var.x);
                            return;
                        }
                        return;
                    }
                }
                return;
            case 5:
                TLObject tLObject5 = (TLObject) obj4;
                Bundle bundle3 = (Bundle) obj3;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) obj;
                TL_account.verifyEmail verifyemail = (TL_account.verifyEmail) obj2;
                gf0 gf0Var3 = ((yd0) obj5).E;
                if ((tLObject5 instanceof TL_account.TL_emailVerified) && gf0Var3.F == 3) {
                    gf0Var3.finishFragment();
                    gf0Var3.d0.run();
                    return;
                }
                if (tLObject5 instanceof TL_account.TL_emailVerifiedLogin) {
                    TL_account.TL_emailVerifiedLogin tL_emailVerifiedLogin = (TL_account.TL_emailVerifiedLogin) tLObject5;
                    bundle3.putString("email", tL_emailVerifiedLogin.email);
                    gf0Var3.p1(bundle3, tL_emailVerifiedLogin.sent_code, true);
                    return;
                } else {
                    if (tL_error5 != null) {
                        if (tL_error5.text.contains("EMAIL_NOT_ALLOWED")) {
                            gf0Var3.u1(org.telegram.messenger.dd.L0(2131746088, null), org.telegram.messenger.dd.L0(2131751201, null));
                            return;
                        }
                        if (tL_error5.text.contains("EMAIL_TOKEN_INVALID")) {
                            gf0Var3.u1(org.telegram.messenger.dd.L0(2131746088, null), org.telegram.messenger.dd.L0(2131751198, null));
                            return;
                        } else {
                            if (tL_error5.code != -1000) {
                                i13 = ((org.telegram.ui.ActionBar.k2) gf0Var3).currentAccount;
                                org.telegram.ui.Components.s4.e0(i13, tL_error5, gf0Var3, verifyemail, new Object[0]);
                                return;
                            }
                            return;
                        }
                    }
                    return;
                }
            case 6:
                final re0 re0Var = (re0) obj5;
                TLObject tLObject6 = (TLObject) obj4;
                TLRPC.TL_inputInvoicePremiumAuthCode tL_inputInvoicePremiumAuthCode = (TLRPC.TL_inputInvoicePremiumAuthCode) obj3;
                final TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode = (TLRPC.TL_inputStorePaymentAuthCode) obj2;
                TLRPC.TL_error tL_error6 = (TLRPC.TL_error) obj;
                gf0 gf0Var4 = re0Var.w;
                re0Var.b.setLoading(false);
                if (tLObject6 instanceof TLRPC.PaymentForm) {
                    final TLRPC.PaymentForm paymentForm2 = (TLRPC.PaymentForm) tLObject6;
                    gf0Var4.getMessagesController().V3(paymentForm2.users, false);
                    qm0 qm0Var2 = new qm0(tL_inputInvoicePremiumAuthCode, paymentForm2, null, null, 4, null, null, null, null, null, null, false, null, gf0Var4, true);
                    qm0Var2.V0 = true;
                    qm0Var2.c1 = new org.telegram.messenger.r20() { // from class: org.telegram.ui.oe0
                        @Override // org.telegram.messenger.r20
                        public final void a(Object obj6) {
                            switch (i21) {
                                case 0:
                                    final int i23 = 0;
                                    final re0 re0Var2 = re0Var;
                                    final TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode2 = tL_inputStorePaymentAuthCode;
                                    final TLRPC.PaymentForm paymentForm3 = paymentForm2;
                                    org.telegram.messenger.i0.g3(new Runnable() { // from class: org.telegram.ui.pe0
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i23) {
                                                case 0:
                                                    TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode3 = tL_inputStorePaymentAuthCode2;
                                                    String str5 = tL_inputStorePaymentAuthCode3.phone_number;
                                                    String str6 = tL_inputStorePaymentAuthCode3.phone_code_hash;
                                                    long j10 = paymentForm3.form_id;
                                                    re0 re0Var3 = re0Var2;
                                                    if (!re0Var3.f) {
                                                        re0Var3.f = true;
                                                        re0Var3.h = str5;
                                                        re0Var3.n = str6;
                                                        re0Var3.r = j10;
                                                        re0Var3.b.setLoading(true);
                                                        re0Var3.o();
                                                        break;
                                                    }
                                                    break;
                                                default:
                                                    TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode4 = tL_inputStorePaymentAuthCode2;
                                                    String str7 = tL_inputStorePaymentAuthCode4.phone_number;
                                                    String str8 = tL_inputStorePaymentAuthCode4.phone_code_hash;
                                                    long j11 = paymentForm3.form_id;
                                                    re0 re0Var4 = re0Var2;
                                                    if (!re0Var4.f) {
                                                        re0Var4.f = true;
                                                        re0Var4.h = str7;
                                                        re0Var4.n = str8;
                                                        re0Var4.r = j11;
                                                        re0Var4.b.setLoading(true);
                                                        re0Var4.o();
                                                        break;
                                                    }
                                                    break;
                                            }
                                        }
                                    });
                                    break;
                                default:
                                    final int i24 = 1;
                                    final re0 re0Var3 = re0Var;
                                    final TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode3 = tL_inputStorePaymentAuthCode;
                                    final TLRPC.PaymentForm paymentForm4 = paymentForm2;
                                    org.telegram.messenger.i0.g3(new Runnable() { // from class: org.telegram.ui.pe0
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i24) {
                                                case 0:
                                                    TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode32 = tL_inputStorePaymentAuthCode3;
                                                    String str5 = tL_inputStorePaymentAuthCode32.phone_number;
                                                    String str6 = tL_inputStorePaymentAuthCode32.phone_code_hash;
                                                    long j10 = paymentForm4.form_id;
                                                    re0 re0Var32 = re0Var3;
                                                    if (!re0Var32.f) {
                                                        re0Var32.f = true;
                                                        re0Var32.h = str5;
                                                        re0Var32.n = str6;
                                                        re0Var32.r = j10;
                                                        re0Var32.b.setLoading(true);
                                                        re0Var32.o();
                                                        break;
                                                    }
                                                    break;
                                                default:
                                                    TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode4 = tL_inputStorePaymentAuthCode3;
                                                    String str7 = tL_inputStorePaymentAuthCode4.phone_number;
                                                    String str8 = tL_inputStorePaymentAuthCode4.phone_code_hash;
                                                    long j11 = paymentForm4.form_id;
                                                    re0 re0Var4 = re0Var3;
                                                    if (!re0Var4.f) {
                                                        re0Var4.f = true;
                                                        re0Var4.h = str7;
                                                        re0Var4.n = str8;
                                                        re0Var4.r = j11;
                                                        re0Var4.b.setLoading(true);
                                                        re0Var4.o();
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
                    qm0Var2.d1 = new org.telegram.messenger.r20() { // from class: org.telegram.ui.oe0
                        @Override // org.telegram.messenger.r20
                        public final void a(Object obj6) {
                            switch (i20) {
                                case 0:
                                    final int i23 = 0;
                                    final re0 re0Var2 = re0Var;
                                    final TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode2 = tL_inputStorePaymentAuthCode;
                                    final TLRPC.PaymentForm paymentForm3 = paymentForm2;
                                    org.telegram.messenger.i0.g3(new Runnable() { // from class: org.telegram.ui.pe0
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i23) {
                                                case 0:
                                                    TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode32 = tL_inputStorePaymentAuthCode2;
                                                    String str5 = tL_inputStorePaymentAuthCode32.phone_number;
                                                    String str6 = tL_inputStorePaymentAuthCode32.phone_code_hash;
                                                    long j10 = paymentForm3.form_id;
                                                    re0 re0Var32 = re0Var2;
                                                    if (!re0Var32.f) {
                                                        re0Var32.f = true;
                                                        re0Var32.h = str5;
                                                        re0Var32.n = str6;
                                                        re0Var32.r = j10;
                                                        re0Var32.b.setLoading(true);
                                                        re0Var32.o();
                                                        break;
                                                    }
                                                    break;
                                                default:
                                                    TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode4 = tL_inputStorePaymentAuthCode2;
                                                    String str7 = tL_inputStorePaymentAuthCode4.phone_number;
                                                    String str8 = tL_inputStorePaymentAuthCode4.phone_code_hash;
                                                    long j11 = paymentForm3.form_id;
                                                    re0 re0Var4 = re0Var2;
                                                    if (!re0Var4.f) {
                                                        re0Var4.f = true;
                                                        re0Var4.h = str7;
                                                        re0Var4.n = str8;
                                                        re0Var4.r = j11;
                                                        re0Var4.b.setLoading(true);
                                                        re0Var4.o();
                                                        break;
                                                    }
                                                    break;
                                            }
                                        }
                                    });
                                    break;
                                default:
                                    final int i24 = 1;
                                    final re0 re0Var3 = re0Var;
                                    final TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode3 = tL_inputStorePaymentAuthCode;
                                    final TLRPC.PaymentForm paymentForm4 = paymentForm2;
                                    org.telegram.messenger.i0.g3(new Runnable() { // from class: org.telegram.ui.pe0
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i24) {
                                                case 0:
                                                    TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode32 = tL_inputStorePaymentAuthCode3;
                                                    String str5 = tL_inputStorePaymentAuthCode32.phone_number;
                                                    String str6 = tL_inputStorePaymentAuthCode32.phone_code_hash;
                                                    long j10 = paymentForm4.form_id;
                                                    re0 re0Var32 = re0Var3;
                                                    if (!re0Var32.f) {
                                                        re0Var32.f = true;
                                                        re0Var32.h = str5;
                                                        re0Var32.n = str6;
                                                        re0Var32.r = j10;
                                                        re0Var32.b.setLoading(true);
                                                        re0Var32.o();
                                                        break;
                                                    }
                                                    break;
                                                default:
                                                    TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode4 = tL_inputStorePaymentAuthCode3;
                                                    String str7 = tL_inputStorePaymentAuthCode4.phone_number;
                                                    String str8 = tL_inputStorePaymentAuthCode4.phone_code_hash;
                                                    long j11 = paymentForm4.form_id;
                                                    re0 re0Var4 = re0Var3;
                                                    if (!re0Var4.f) {
                                                        re0Var4.f = true;
                                                        re0Var4.h = str7;
                                                        re0Var4.n = str8;
                                                        re0Var4.r = j11;
                                                        re0Var4.b.setLoading(true);
                                                        re0Var4.o();
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
                    qm0Var2.e1 = new j10(re0Var, i20);
                    gf0Var4.presentFragment(qm0Var2);
                    return;
                }
                if (tL_error6 == null) {
                    new org.telegram.ui.Components.cc(gf0Var4.Z, null).H(R.raw.error, org.telegram.messenger.dd.L0(2131743904, null));
                    return;
                } else {
                    if ("PHONE_CODE_EXPIRED".equalsIgnoreCase(tL_error6.text)) {
                        org.telegram.messenger.i0.g3(new me0(re0Var, i19));
                        return;
                    }
                    String str5 = tL_error6.text;
                    re0Var.e = str5;
                    new org.telegram.ui.Components.cc(gf0Var4.Z, null).H(R.raw.error, org.telegram.messenger.dd.a0(null, null, 2131743903, str5));
                    return;
                }
            case 7:
                qh0 qh0Var = (qh0) obj5;
                TLRPC.TL_error tL_error7 = (TLRPC.TL_error) obj;
                cg.b bVar = (cg.b) obj4;
                String str6 = (String) obj3;
                TL_stats.TL_loadAsyncGraph tL_loadAsyncGraph = (TL_stats.TL_loadAsyncGraph) obj2;
                qh0Var.D = true;
                if (tL_error7 != null || bVar == null) {
                    qh0Var.m0();
                    return;
                }
                qh0Var.w.l(str6, bVar);
                e61 e61Var = qh0Var.r;
                e61Var.e = bVar;
                e61Var.c = tL_loadAsyncGraph.x;
                qh0Var.m0();
                return;
            case 8:
                ei0 ei0Var = (ei0) obj5;
                TLRPC.TL_contacts_importedContacts tL_contacts_importedContacts = (TLRPC.TL_contacts_importedContacts) obj4;
                TLRPC.TL_inputPhoneContact tL_inputPhoneContact = (TLRPC.TL_inputPhoneContact) obj3;
                TLRPC.TL_error tL_error8 = (TLRPC.TL_error) obj;
                TLRPC.TL_contacts_importContacts tL_contacts_importContacts = (TLRPC.TL_contacts_importContacts) obj2;
                org.telegram.ui.ActionBar.k2 k2Var = ei0Var.C1;
                ei0Var.x1 = false;
                if (tL_contacts_importedContacts == null) {
                    org.telegram.messenger.i0.Y3(ei0Var.N1, true, 0.5f, true, true);
                    org.telegram.messenger.i0.Y3(ei0Var.O1, false, 0.5f, true, true);
                    org.telegram.ui.Components.s4.e0(ei0Var.a, tL_error8, k2Var, tL_contacts_importContacts, new Object[0]);
                    return;
                } else if (!tL_contacts_importedContacts.users.isEmpty()) {
                    org.telegram.messenger.wp.r1(ei0Var.a).V3(tL_contacts_importedContacts.users, false);
                    org.telegram.messenger.wp.r1(ei0Var.a).w3(tL_contacts_importedContacts.users.get(0), null, k2Var, 1);
                    ei0Var.dismiss();
                    return;
                } else {
                    if (k2Var.getParentActivity() == null) {
                        return;
                    }
                    org.telegram.messenger.i0.Y3(ei0Var.N1, true, 0.5f, true, true);
                    org.telegram.messenger.i0.Y3(ei0Var.O1, false, 0.5f, true, true);
                    org.telegram.ui.Components.s4.u(k2Var, tL_inputPhoneContact.first_name, tL_inputPhoneContact.last_name, tL_inputPhoneContact.phone);
                    return;
                }
            case 9:
                TLRPC.TL_error tL_error9 = (TLRPC.TL_error) obj;
                kg0 kg0Var = (kg0) obj4;
                m4.c cVar = (m4.c) obj3;
                TL_account.verifyEmail verifyemail2 = (TL_account.verifyEmail) obj2;
                jl0 jl0Var = ((rk0) obj5).a;
                if (tL_error9 == null) {
                    ((nk0) jl0Var.B1).c(jl0Var.E, (String) jl0Var.s1.get("email"), null, null, null, null, null, null, null, null, kg0Var, cVar);
                    return;
                }
                i14 = ((org.telegram.ui.ActionBar.k2) jl0Var).currentAccount;
                org.telegram.ui.Components.s4.e0(i14, tL_error9, jl0Var, verifyemail2, new Object[0]);
                cVar.d(null, null);
                return;
            case 10:
                fl0 fl0Var = (fl0) obj5;
                TLRPC.TL_error tL_error10 = (TLRPC.TL_error) obj;
                Bundle bundle4 = (Bundle) obj3;
                TLObject tLObject7 = (TLObject) obj4;
                TLRPC.TL_auth_resendCode tL_auth_resendCode2 = (TLRPC.TL_auth_resendCode) obj2;
                jl0 jl0Var2 = fl0Var.Q;
                fl0Var.J = false;
                if (tL_error10 == null) {
                    jl0Var2.p1(bundle4, (TLRPC.TL_auth_sentCode) tLObject7, true);
                } else {
                    i15 = ((org.telegram.ui.ActionBar.k2) jl0Var2).currentAccount;
                    org.telegram.ui.ActionBar.x1 e02 = org.telegram.ui.Components.s4.e0(i15, tL_error10, jl0Var2, tL_auth_resendCode2, new Object[0]);
                    if (e02 != null && tL_error10.text.contains("PHONE_CODE_EXPIRED")) {
                        e02.o0 = new al0(fl0Var, i21);
                    }
                }
                jl0Var2.B1();
                return;
            case 11:
                qm0.k0((qm0) obj5, (TLRPC.TL_error) obj, (TLObject) obj4, (String) obj3, (TL_account.getPassword) obj2);
                return;
            case 12:
                ClippingImageView[] clippingImageViewArr = (ClippingImageView[]) obj4;
                ArrayList arrayList = (ArrayList) obj3;
                Integer num = (Integer) obj2;
                ds0 ds0Var2 = (ds0) obj;
                PhotoViewer photoViewer = ((ir0) obj5).r;
                photoViewer.p4 = null;
                zr0 zr0Var = photoViewer.e0;
                if (zr0Var == null || photoViewer.g0 == null) {
                    return;
                }
                zr0Var.setLayerType(0, null);
                photoViewer.n4 = 0;
                photoViewer.I1();
                photoViewer.o4 = 0L;
                photoViewer.G1 = null;
                photoViewer.E1.a = false;
                photoViewer.H1 = null;
                photoViewer.F1.a = false;
                photoViewer.G2();
                photoViewer.C2();
                photoViewer.e0.invalidate();
                for (ClippingImageView clippingImageView : clippingImageViewArr) {
                    clippingImageView.setVisibility(8);
                }
                fs0 fs0Var = photoViewer.q4;
                if (fs0Var != null) {
                    fs0Var.a.O0(true, true);
                }
                fs0 fs0Var2 = photoViewer.r4;
                if (fs0Var2 != null && !fs0Var2.s) {
                    fs0Var2.a.O0(false, true);
                }
                if (arrayList != null && (i16 = photoViewer.c2) != 3 && i16 != 1 && ((ds0Var = photoViewer.d) == null || !ds0Var.P())) {
                    photoViewer.V1();
                }
                org.telegram.ui.Components.v61 v61Var = photoViewer.F2;
                if (v61Var != null && v61Var.d0() && photoViewer.r1 && !photoViewer.g7.isEmpty()) {
                    PhotoViewer.a0(photoViewer, photoViewer.F2.S());
                    PhotoViewer.Z(photoViewer, true);
                }
                if (photoViewer.t4) {
                    PhotoViewer.b0(photoViewer, num.intValue());
                }
                if (ds0Var2 != null) {
                    ds0Var2.d();
                    return;
                }
                return;
            case 13:
                PrivacyControlActivity privacyControlActivity = (PrivacyControlActivity) obj5;
                boolean[] zArr = (boolean[]) obj4;
                TLRPC.GlobalPrivacySettings globalPrivacySettings = (TLRPC.GlobalPrivacySettings) obj3;
                TL_account.setGlobalPrivacySettings setglobalprivacysettings = (TL_account.setGlobalPrivacySettings) obj2;
                if (((TLRPC.TL_error) obj) != null) {
                    privacyControlActivity.G0();
                    return;
                }
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
                    privacyControlActivity.C0();
                }
                privacyControlActivity.getNotificationCenter().k(47, new Object[0]);
                return;
            case 14:
                TLRPC.UserFull userFull = (TLRPC.UserFull) obj3;
                TL_account.TL_birthday tL_birthday = (TL_account.TL_birthday) obj2;
                TLRPC.TL_error tL_error11 = (TLRPC.TL_error) obj;
                PrivacyControlActivity privacyControlActivity2 = ((ru0) obj5).d;
                if (((TLObject) obj4) instanceof TLRPC.TL_boolTrue) {
                    org.telegram.ui.Components.wb Q = org.telegram.ui.Components.cc.a0(privacyControlActivity2).Q(R.raw.contact_check, 36, org.telegram.messenger.dd.L0(2131746871, null));
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
                    privacyControlActivity2.getMessagesStorage().j2(userFull, false);
                }
                if (tL_error11 == null || (str = tL_error11.text) == null || !str.startsWith("FLOOD_WAIT_")) {
                    org.telegram.messenger.m5.n(null, 2131743904, org.telegram.ui.Components.cc.a0(privacyControlActivity2), R.raw.error, 36);
                    return;
                }
                if (privacyControlActivity2.getParentActivity() != null) {
                    Activity parentActivity = privacyControlActivity2.getParentActivity();
                    p6Var = ((org.telegram.ui.ActionBar.k2) privacyControlActivity2).resourceProvider;
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, parentActivity, p6Var);
                    String L0 = org.telegram.messenger.dd.L0(2131746867, null);
                    org.telegram.ui.ActionBar.x1 x1Var2 = alertDialog$Builder.a;
                    x1Var2.R = L0;
                    x1Var2.T = org.telegram.messenger.dd.L0(2131746868, null);
                    alertDialog$Builder.k(org.telegram.messenger.dd.L0(2131747847, null), null);
                    privacyControlActivity2.showDialog(x1Var2);
                    return;
                }
                return;
            case 15:
                ProfileActivity profileActivity = (ProfileActivity) obj5;
                TLRPC.ChatParticipant chatParticipant = (TLRPC.ChatParticipant) obj3;
                TLRPC.User user = (TLRPC.User) obj2;
                cv0 cv0Var = (cv0) obj;
                RectF rectF = ProfileActivity.S6;
                if (!(((TLRPC.ChannelParticipant) obj4) instanceof TLRPC.TL_channelParticipantAdmin) && !(chatParticipant instanceof TLRPC.TL_chatParticipantAdmin)) {
                    cv0Var.a(1);
                    return;
                }
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(0, profileActivity.getParentActivity(), profileActivity.z0);
                String L02 = org.telegram.messenger.dd.L0(R.string.AppName, null);
                org.telegram.ui.ActionBar.x1 x1Var3 = alertDialog$Builder2.a;
                x1Var3.R = L02;
                x1Var3.T = org.telegram.messenger.dd.a0(null, null, 2131754350, org.telegram.messenger.i5.m(0, user.first_name, user.last_name));
                alertDialog$Builder2.k(org.telegram.messenger.dd.L0(2131747847, null), new rj0(cv0Var, 11));
                alertDialog$Builder2.h(org.telegram.messenger.dd.L0(2131752589, null), null);
                profileActivity.showDialog(x1Var3);
                return;
            case 16:
                ProfileActivity profileActivity2 = (ProfileActivity) obj5;
                TLObject tLObject8 = (TLObject) obj4;
                TLRPC.TL_username tL_username = (TLRPC.TL_username) obj3;
                tw0 tw0Var = (tw0) obj2;
                TLRPC.TL_error tL_error12 = (TLRPC.TL_error) obj;
                if (!(tLObject8 instanceof TL_fragment.TL_collectibleInfo)) {
                    RectF rectF2 = ProfileActivity.S6;
                    org.telegram.ui.Components.cc.d0(tL_error12);
                    return;
                }
                TL_fragment.TL_collectibleInfo tL_collectibleInfo = (TL_fragment.TL_collectibleInfo) tLObject8;
                if (profileActivity2.d1 != 0) {
                    profileActivity2.getMessagesController().Z1(Long.valueOf(profileActivity2.d1));
                } else {
                    profileActivity2.getMessagesController().L0(Long.valueOf(profileActivity2.e1));
                }
                String str7 = "@" + tL_username.username;
                String format = org.telegram.messenger.dd.D0().n0().format(new Date(tL_collectibleInfo.purchase_date * 1000));
                String f7 = org.telegram.messenger.u1.i().f(tL_collectibleInfo.crypto_amount, tL_collectibleInfo.crypto_currency);
                String f10 = org.telegram.messenger.u1.i().f(tL_collectibleInfo.amount, tL_collectibleInfo.currency);
                org.telegram.ui.Components.wb w9 = new org.telegram.ui.Components.cc(tw0Var.t1, profileActivity2.z0).w(R.drawable.filled_username, org.telegram.messenger.i0.c4(org.telegram.messenger.i0.W2(org.telegram.messenger.dd.a0(null, null, 2131750528, str7, format, f7, TextUtils.isEmpty(f10) ? "" : a1.g.n("(", f10, ")"))), new hr0(12, profileActivity2, tL_collectibleInfo)));
                vu vuVar = new vu(29, profileActivity2, tL_collectibleInfo);
                org.telegram.ui.Components.bb bbVar = w9.e;
                if (bbVar != null) {
                    bbVar.setOnClickListener(vuVar);
                }
                w9.k(false);
                return;
            case 17:
                ProfileActivity profileActivity3 = (ProfileActivity) obj5;
                TLObject tLObject9 = (TLObject) obj4;
                String str8 = (String) obj3;
                TLRPC.User user2 = (TLRPC.User) obj2;
                TLRPC.TL_error tL_error13 = (TLRPC.TL_error) obj;
                RectF rectF3 = ProfileActivity.S6;
                if (tLObject9 instanceof TL_fragment.TL_collectibleInfo) {
                    h10.a(profileActivity3.getParentActivity(), 1, str8, user2, (TL_fragment.TL_collectibleInfo) tLObject9, profileActivity3.z0);
                    return;
                } else {
                    org.telegram.ui.Components.cc.d0(tL_error13);
                    return;
                }
            case 18:
                ProfileActivity.h0((ProfileActivity) obj5, (TLObject) obj4, (TLRPC.UserFull) obj3, (TL_account.TL_birthday) obj2, (TLRPC.TL_error) obj);
                return;
            case 19:
                gy0 gy0Var = (gy0) obj5;
                ArrayList arrayList2 = (ArrayList) obj3;
                ArrayList arrayList3 = (ArrayList) obj2;
                ArrayList arrayList4 = (ArrayList) obj;
                org.telegram.ui.ActionBar.k2 k2Var2 = gy0Var.e;
                if (((String) obj4).equals(gy0Var.D)) {
                    if (!gy0Var.x && (k2Var2 instanceof ProfileActivity)) {
                        try {
                            ((ProfileActivity) k2Var2).O.b.getImageReceiver().P0(false);
                            ((ProfileActivity) k2Var2).O.d.setText(org.telegram.messenger.dd.L0(2131745494, null));
                        } catch (Exception e10) {
                            org.telegram.messenger.f8.g(e10, true);
                        }
                    }
                    gy0Var.x = true;
                    gy0Var.r = arrayList2;
                    gy0Var.s = arrayList3;
                    gy0Var.n = arrayList4;
                    gy0Var.f();
                    if (k2Var2 instanceof ProfileActivity) {
                        try {
                            ((ProfileActivity) k2Var2).O.b.getImageReceiver().P0(false);
                            return;
                        } catch (Exception e11) {
                            org.telegram.messenger.f8.g(e11, true);
                            return;
                        }
                    }
                    return;
                }
                return;
            case 20:
                g31 g31Var = (g31) obj5;
                g31Var.getClass();
                g31Var.p((View) obj4, Long.valueOf(((org.telegram.ui.Components.o5) obj3).documentId), (TLRPC.Document) obj2, ((q21) obj).w, null);
                return;
            case 21:
                q31 q31Var = (q31) obj5;
                TLRPC.TL_error tL_error14 = (TLRPC.TL_error) obj;
                TLObject tLObject10 = (TLObject) obj4;
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) obj3;
                TLRPC.User user3 = (TLRPC.User) obj2;
                q31Var.getClass();
                if (tL_error14 == null) {
                    TL_account.Password password = (TL_account.Password) tLObject10;
                    twoStepVerificationActivity.I = password;
                    TwoStepVerificationActivity.r0(password);
                    q31Var.e1(user3, twoStepVerificationActivity.q0(), twoStepVerificationActivity);
                    return;
                }
                return;
            case 22:
                org.telegram.ui.Wallet.k0 k0Var = (org.telegram.ui.Wallet.k0) obj5;
                org.telegram.ui.Wallet.h0 h0Var2 = (org.telegram.ui.Wallet.h0) obj4;
                org.telegram.ui.Wallet.d dVar = (org.telegram.ui.Wallet.d) obj2;
                String str9 = (String) obj;
                try {
                    ((org.telegram.ui.ActionBar.x1) obj3).dismiss();
                    try {
                        if (h0Var2 != null && !h0Var2.d()) {
                            TL_wallet.WalletState walletState = k0Var.e;
                            if ((walletState instanceof TL_wallet.TL_walletState) && (p0Var = k0Var.c) != null && !p0Var.f(((TL_wallet.TL_walletState) walletState).public_key)) {
                                k0Var.c.p(org.telegram.messenger.e20.i(k0Var.a).e(), ((TL_wallet.TL_walletState) k0Var.e).public_key, h0Var2, null);
                                h0Var = h0Var2;
                                dVar.a(h0Var, str9);
                                if (h0Var == null) {
                                    h0Var.close();
                                    return;
                                }
                                return;
                            }
                        }
                        dVar.a(h0Var, str9);
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
            case 23:
                org.telegram.ui.Wallet.e2 e2Var = (org.telegram.ui.Wallet.e2) obj5;
                JSONObject jSONObject = (JSONObject) obj4;
                org.telegram.messenger.r20 r20Var = (org.telegram.messenger.r20) obj3;
                String str10 = (String) obj2;
                org.telegram.ui.Wallet.a2 a2Var = (org.telegram.ui.Wallet.a2) obj;
                e2Var.getClass();
                if (jSONObject == null) {
                    r20Var.a(str10);
                    return;
                } else {
                    e2Var.E(a2Var.a.id, a2Var.b, jSONObject, r20Var);
                    return;
                }
            case 24:
                org.telegram.ui.Wallet.a2 a2Var2 = (org.telegram.ui.Wallet.a2) obj4;
                d01 d01Var = (d01) obj2;
                org.telegram.ui.Wallet.u1 u1Var = (org.telegram.ui.Wallet.u1) obj;
                try {
                    bArr = Base64.decode(WalletEngine2.tonConnectCrypto((org.telegram.ui.Wallet.h0) obj5, a2Var2.a, a2Var2.h, a2Var2.g, new JSONObject().put("challenge", Base64.encodeToString(((TL_wallet.tonConnectChallenge) obj3).challenge, 2))).getString("challengeAnswer"), 2);
                    i17 = null;
                } catch (Exception e12) {
                    i17 = org.telegram.ui.Wallet.e2.i("decrypt challenge", e12);
                    bArr = null;
                }
                org.telegram.messenger.i0.g3(new org.telegram.ui.Wallet.k7((Object) bArr, (Object) d01Var, i17, (Object) u1Var, 7));
                return;
            case 25:
                org.telegram.ui.Wallet.e2 e2Var2 = (org.telegram.ui.Wallet.e2) obj5;
                TL_wallet.sendTransfer sendtransfer = (TL_wallet.sendTransfer) obj4;
                org.telegram.ui.Wallet.a2 a2Var3 = (org.telegram.ui.Wallet.a2) obj3;
                org.telegram.messenger.r20 r20Var2 = (org.telegram.messenger.r20) obj2;
                org.telegram.ui.Wallet.h0 h0Var3 = (org.telegram.ui.Wallet.h0) obj;
                try {
                    if (!org.telegram.messenger.wp.r1(e2Var2.a).f7.edit().putString(org.telegram.ui.Wallet.e2.l(a2Var3.a.id, a2Var3.b) + ".transfer", new JSONObject().put("boc", Base64.encodeToString(sendtransfer.data_normal, 2)).put("randomId", sendtransfer.random_id).toString()).commit()) {
                        throw new IllegalStateException("Could not save signed transfer");
                    }
                } catch (Exception e13) {
                    str2 = org.telegram.ui.Wallet.e2.i("save transfer", e13);
                }
                org.telegram.messenger.i0.g3(new v8(e2Var2, str2, r20Var2, a2Var3, h0Var3, sendtransfer, 12));
                return;
            case 26:
                ((WalletEngine2) obj5).lambda$emulateSendNFT$19((AtomicBoolean) obj4, (org.telegram.messenger.k20) obj3, (TL_wallet.walletTransaction) obj2, (String) obj);
                return;
            case 27:
                ((WalletEngine2) obj5).lambda$prepareSend$49((org.telegram.messenger.m20) obj4, (TL_wallet.sendTransfer) obj3, (String) obj2, (String) obj);
                return;
            case 28:
                a();
                return;
            default:
                rh.b0 b0Var = (rh.b0) obj5;
                gf.e eVar = (gf.e) obj4;
                org.telegram.ui.ActionBar.x1 x1Var4 = (org.telegram.ui.ActionBar.x1) obj3;
                TLRPC.Updates updates = (TLRPC.Updates) obj2;
                TLRPC.TL_error tL_error15 = (TLRPC.TL_error) obj;
                rh.w0 w0Var = b0Var.j2;
                if (w0Var != null) {
                    w0Var.run();
                }
                eVar.c(false);
                x1Var4.dismiss();
                b0Var.dismiss();
                org.telegram.ui.ActionBar.k2 T = LaunchActivity.T();
                if (T != null) {
                    if (updates == null) {
                        org.telegram.ui.Components.cc.a0(T).f0(tL_error15, false);
                        return;
                    }
                    org.telegram.ui.Components.wb I = org.telegram.ui.Components.cc.a0(T).I(R.raw.forward, org.telegram.messenger.dd.L0(2131749709, null), org.telegram.messenger.i0.W2(org.telegram.messenger.dd.a0(null, null, 2131749710, b0Var.S1, org.telegram.messenger.o5.t(b0Var.T1))));
                    I.t = true;
                    I.j();
                    return;
                }
                return;
        }
    }

    public /* synthetic */ l90(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i10) {
        this.a = i10;
        this.d = obj;
        this.c = obj2;
        this.e = obj3;
        this.f = obj4;
        this.b = obj5;
    }

    public /* synthetic */ l90(Object obj, TLRPC.TL_error tL_error, Object obj2, Object obj3, Object obj4, int i10) {
        this.a = i10;
        this.d = obj;
        this.b = tL_error;
        this.c = obj2;
        this.e = obj3;
        this.f = obj4;
    }

    public /* synthetic */ l90(fl0 fl0Var, TLRPC.TL_error tL_error, Bundle bundle, TLObject tLObject, TLRPC.TL_auth_resendCode tL_auth_resendCode) {
        this.a = 10;
        this.d = fl0Var;
        this.b = tL_error;
        this.e = bundle;
        this.c = tLObject;
        this.f = tL_auth_resendCode;
    }
}
