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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class m90 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ m90(KeyEvent.Callback callback, TLObject tLObject, Object obj, TLRPC.TL_error tL_error, TLObject tLObject2, int i10) {
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

    /* JADX WARN: Code restructure failed: missing block: B:425:0x0a4e, code lost:
    
        if ("THEME_FORMAT_INVALID".equals(r2.text) != false) goto L358;
     */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:67:? A[RETURN, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i10;
        int i11;
        boolean z10;
        TLRPC.TL_wallPaper tL_wallPaper;
        sm0 sm0Var;
        org.telegram.ui.Components.cc d;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        boolean z11;
        int i18;
        es0 es0Var;
        String str;
        org.telegram.ui.ActionBar.p6 p6Var;
        org.telegram.ui.Wallet.h0 h0Var;
        org.telegram.ui.Wallet.p0 p0Var;
        String i19;
        byte[] bArr;
        int i20 = this.a;
        int i21 = 11;
        int i22 = 2;
        String str2 = null;
        Object obj = this.b;
        Object obj2 = this.f;
        Object obj3 = this.e;
        Object obj4 = this.c;
        Object obj5 = this.d;
        switch (i20) {
            case 0:
                LaunchActivity launchActivity = (LaunchActivity) obj5;
                TLObject tLObject = (TLObject) obj4;
                org.telegram.ui.ActionBar.x1 x1Var = (org.telegram.ui.ActionBar.x1) obj3;
                f70 f70Var = (f70) obj2;
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
                                z10 = true;
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
                                z10 = true;
                                tL_wallPaper = null;
                            }
                            try {
                                f70Var.run();
                            } catch (Exception e) {
                                org.telegram.messenger.f8.g(e, z10);
                            }
                            launchActivity.r0(tL_theme, tL_wallPaper, Q0);
                            i11 = 0;
                        } else {
                            i11 = 1;
                        }
                        i22 = i11;
                    } else {
                        TLRPC.Document document = tL_theme.document;
                        if (document != null) {
                            launchActivity.V0 = false;
                            launchActivity.U0 = tL_theme;
                            launchActivity.Q0 = org.telegram.messenger.b8.r(null, document);
                            launchActivity.W0 = x1Var;
                            org.telegram.messenger.b8.G(launchActivity.O).X(launchActivity.U0.document, tL_theme, 1, 1);
                            i22 = 0;
                        }
                        i22 = 1;
                    }
                } else if (tL_error != null) {
                    break;
                }
                if (i22 != 0) {
                    try {
                        f70Var.run();
                        i10 = 1;
                    } catch (Exception e7) {
                        i10 = 1;
                        org.telegram.messenger.f8.g(e7, true);
                    }
                    if (i22 == i10) {
                        launchActivity.F0(org.telegram.ui.Components.s4.M(launchActivity, org.telegram.messenger.cd.L0(2131744215, null), org.telegram.messenger.cd.L0(2131744198, null)));
                        return;
                    } else {
                        launchActivity.F0(org.telegram.ui.Components.s4.M(launchActivity, org.telegram.messenger.cd.L0(2131744215, null), org.telegram.messenger.cd.L0(2131744199, null)));
                        return;
                    }
                }
                return;
            case 1:
                ua0 ua0Var = (ua0) obj5;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj;
                TLObject tLObject2 = (TLObject) obj4;
                TLRPC.TL_inputInvoiceSlug tL_inputInvoiceSlug = (TLRPC.TL_inputInvoiceSlug) obj3;
                String str3 = (String) obj2;
                int i23 = ua0Var.b;
                LaunchActivity launchActivity2 = ua0Var.a;
                if (tL_error2 != null) {
                    if ("SUBSCRIPTION_ALREADY_ACTIVE".equalsIgnoreCase(tL_error2.text)) {
                        d = ua0.d();
                        i12 = 2131747411;
                    } else {
                        d = ua0.d();
                        i12 = 2131747412;
                    }
                    org.telegram.messenger.m5.o(null, i12, d, null);
                } else if (!launchActivity2.isFinishing()) {
                    if (tLObject2 instanceof TLRPC.TL_payments_paymentFormStars) {
                        ph.w3 w3Var = launchActivity2.Z0;
                        launchActivity2.Z0 = null;
                        rh.e6.y(i23, false).X(null, tL_inputInvoiceSlug, (TLRPC.TL_payments_paymentFormStars) tLObject2, new pa0(ua0Var, 1), new l80(w3Var, 1));
                        return;
                    }
                    if (tLObject2 instanceof TLRPC.PaymentForm) {
                        TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject2;
                        org.telegram.messenger.vp.r1(i23).V3(paymentForm.users, false);
                        sm0Var = new sm0(paymentForm, null, str3, LaunchActivity.T());
                    } else {
                        sm0Var = tLObject2 instanceof TLRPC.PaymentReceipt ? new sm0((TLRPC.PaymentReceipt) tLObject2) : null;
                    }
                    if (sm0Var != null) {
                        ph.w3 w3Var2 = launchActivity2.Z0;
                        if (w3Var2 != null) {
                            launchActivity2.Z0 = null;
                            sm0Var.Z0 = new jf(10, w3Var2);
                        }
                        ua0Var.u(sm0Var, false);
                    }
                }
                ua0Var.c();
                return;
            case 2:
                hf0.a0((hf0) obj5, (TLRPC.TL_error) obj, (String) obj4, (String) obj3, (String) obj2);
                return;
            case 3:
                TLObject tLObject3 = (TLObject) obj4;
                Bundle bundle = (Bundle) obj3;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj;
                TLRPC.TL_auth_resendCode tL_auth_resendCode = (TLRPC.TL_auth_resendCode) obj2;
                hf0 hf0Var = ((wc0) obj5).W;
                if (tLObject3 instanceof TLRPC.TL_auth_sentCode) {
                    hf0Var.o1(bundle, (TLRPC.TL_auth_sentCode) tLObject3, true);
                    return;
                } else {
                    if (tL_error3 == null || tL_error3.text == null) {
                        return;
                    }
                    i13 = ((org.telegram.ui.ActionBar.k2) hf0Var).currentAccount;
                    org.telegram.ui.Components.s4.e0(i13, tL_error3, hf0Var, tL_auth_resendCode, new Object[0]);
                    return;
                }
            case 4:
                zd0 zd0Var = (zd0) obj5;
                TLObject tLObject4 = (TLObject) obj4;
                Bundle bundle2 = (Bundle) obj3;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) obj;
                TL_account.sendVerifyEmailCode sendverifyemailcode = (TL_account.sendVerifyEmailCode) obj2;
                hf0 hf0Var2 = zd0Var.E;
                hf0Var2.s1(false, true);
                zd0Var.r = false;
                if (tLObject4 instanceof TL_account.sentEmailCode) {
                    TL_account.sentEmailCode sentemailcode = (TL_account.sentEmailCode) tLObject4;
                    bundle2.putString("emailPattern", sentemailcode.email_pattern);
                    bundle2.putInt("length", sentemailcode.length);
                    hf0Var2.C1(13, true, bundle2, false);
                    return;
                }
                String str4 = tL_error4.text;
                if (str4 != null) {
                    if (str4.contains("EMAIL_INVALID")) {
                        zd0Var.n();
                        return;
                    }
                    if (tL_error4.text.contains("EMAIL_NOT_ALLOWED")) {
                        hf0Var2.t1(org.telegram.messenger.cd.L0(2131746088, null), org.telegram.messenger.cd.L0(2131751201, null));
                        return;
                    }
                    if (tL_error4.text.contains("PHONE_PASSWORD_FLOOD")) {
                        hf0Var2.t1(org.telegram.messenger.cd.L0(2131746088, null), org.telegram.messenger.cd.L0(2131750688, "FloodWait"));
                        return;
                    }
                    if (tL_error4.text.contains("PHONE_NUMBER_FLOOD")) {
                        hf0Var2.t1(org.telegram.messenger.cd.L0(2131746088, null), org.telegram.messenger.cd.L0(2131747302, "PhoneNumberFlood"));
                        return;
                    }
                    if (tL_error4.text.contains("PHONE_CODE_EMPTY") || tL_error4.text.contains("PHONE_CODE_INVALID")) {
                        hf0Var2.t1(org.telegram.messenger.cd.L0(2131746088, null), org.telegram.messenger.cd.L0(2131749193, "InvalidCode"));
                        return;
                    }
                    if (tL_error4.text.contains("PHONE_CODE_EXPIRED")) {
                        hf0Var2.C1(0, true, null, true);
                        hf0Var2.t1(org.telegram.messenger.cd.L0(2131746088, null), org.telegram.messenger.cd.L0(2131752021, "CodeExpired"));
                        return;
                    } else if (tL_error4.text.startsWith("FLOOD_WAIT")) {
                        hf0Var2.t1(org.telegram.messenger.cd.L0(2131746088, null), org.telegram.messenger.cd.L0(2131750688, "FloodWait"));
                        return;
                    } else {
                        if (tL_error4.code != -1000) {
                            i14 = ((org.telegram.ui.ActionBar.k2) hf0Var2).currentAccount;
                            org.telegram.ui.Components.s4.e0(i14, tL_error4, hf0Var2, sendverifyemailcode, zd0Var.x);
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
                hf0 hf0Var3 = ((zd0) obj5).E;
                if ((tLObject5 instanceof TL_account.TL_emailVerified) && hf0Var3.F == 3) {
                    hf0Var3.finishFragment();
                    hf0Var3.d0.run();
                    return;
                }
                if (tLObject5 instanceof TL_account.TL_emailVerifiedLogin) {
                    TL_account.TL_emailVerifiedLogin tL_emailVerifiedLogin = (TL_account.TL_emailVerifiedLogin) tLObject5;
                    bundle3.putString("email", tL_emailVerifiedLogin.email);
                    hf0Var3.o1(bundle3, tL_emailVerifiedLogin.sent_code, true);
                    return;
                } else {
                    if (tL_error5 != null) {
                        if (tL_error5.text.contains("EMAIL_NOT_ALLOWED")) {
                            hf0Var3.t1(org.telegram.messenger.cd.L0(2131746088, null), org.telegram.messenger.cd.L0(2131751201, null));
                            return;
                        }
                        if (tL_error5.text.contains("EMAIL_TOKEN_INVALID")) {
                            hf0Var3.t1(org.telegram.messenger.cd.L0(2131746088, null), org.telegram.messenger.cd.L0(2131751198, null));
                            return;
                        } else {
                            if (tL_error5.code != -1000) {
                                i15 = ((org.telegram.ui.ActionBar.k2) hf0Var3).currentAccount;
                                org.telegram.ui.Components.s4.e0(i15, tL_error5, hf0Var3, verifyemail, new Object[0]);
                                return;
                            }
                            return;
                        }
                    }
                    return;
                }
            case 6:
                final se0 se0Var = (se0) obj5;
                TLObject tLObject6 = (TLObject) obj4;
                TLRPC.TL_inputInvoicePremiumAuthCode tL_inputInvoicePremiumAuthCode = (TLRPC.TL_inputInvoicePremiumAuthCode) obj3;
                final TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode = (TLRPC.TL_inputStorePaymentAuthCode) obj2;
                TLRPC.TL_error tL_error6 = (TLRPC.TL_error) obj;
                hf0 hf0Var4 = se0Var.w;
                se0Var.b.setLoading(false);
                if (!(tLObject6 instanceof TLRPC.PaymentForm)) {
                    if (tL_error6 == null) {
                        new org.telegram.ui.Components.cc(hf0Var4.Z, null).H(R.raw.error, org.telegram.messenger.cd.L0(2131743904, null));
                        return;
                    } else {
                        if ("PHONE_CODE_EXPIRED".equalsIgnoreCase(tL_error6.text)) {
                            org.telegram.messenger.i0.g3(new ne0(se0Var, i22));
                            return;
                        }
                        String str5 = tL_error6.text;
                        se0Var.e = str5;
                        new org.telegram.ui.Components.cc(hf0Var4.Z, null).H(R.raw.error, org.telegram.messenger.cd.a0(null, null, 2131743903, str5));
                        return;
                    }
                }
                final TLRPC.PaymentForm paymentForm2 = (TLRPC.PaymentForm) tLObject6;
                hf0Var4.getMessagesController().V3(paymentForm2.users, false);
                sm0 sm0Var2 = new sm0(tL_inputInvoicePremiumAuthCode, paymentForm2, null, null, 4, null, null, null, null, null, null, false, null, hf0Var4, true);
                sm0Var2.V0 = true;
                final int i24 = 0;
                sm0Var2.c1 = new org.telegram.messenger.q20() { // from class: org.telegram.ui.pe0
                    @Override // org.telegram.messenger.q20
                    public final void a(Object obj6) {
                        switch (i24) {
                            case 0:
                                final int i25 = 0;
                                final se0 se0Var2 = se0Var;
                                final TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode2 = tL_inputStorePaymentAuthCode;
                                final TLRPC.PaymentForm paymentForm3 = paymentForm2;
                                org.telegram.messenger.i0.g3(new Runnable() { // from class: org.telegram.ui.qe0
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i25) {
                                            case 0:
                                                TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode3 = tL_inputStorePaymentAuthCode2;
                                                String str6 = tL_inputStorePaymentAuthCode3.phone_number;
                                                String str7 = tL_inputStorePaymentAuthCode3.phone_code_hash;
                                                long j10 = paymentForm3.form_id;
                                                se0 se0Var3 = se0Var2;
                                                if (!se0Var3.f) {
                                                    se0Var3.f = true;
                                                    se0Var3.h = str6;
                                                    se0Var3.n = str7;
                                                    se0Var3.r = j10;
                                                    se0Var3.b.setLoading(true);
                                                    se0Var3.o();
                                                    break;
                                                }
                                                break;
                                            default:
                                                TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode4 = tL_inputStorePaymentAuthCode2;
                                                String str8 = tL_inputStorePaymentAuthCode4.phone_number;
                                                String str9 = tL_inputStorePaymentAuthCode4.phone_code_hash;
                                                long j11 = paymentForm3.form_id;
                                                se0 se0Var4 = se0Var2;
                                                if (!se0Var4.f) {
                                                    se0Var4.f = true;
                                                    se0Var4.h = str8;
                                                    se0Var4.n = str9;
                                                    se0Var4.r = j11;
                                                    se0Var4.b.setLoading(true);
                                                    se0Var4.o();
                                                    break;
                                                }
                                                break;
                                        }
                                    }
                                });
                                break;
                            default:
                                final int i26 = 1;
                                final se0 se0Var3 = se0Var;
                                final TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode3 = tL_inputStorePaymentAuthCode;
                                final TLRPC.PaymentForm paymentForm4 = paymentForm2;
                                org.telegram.messenger.i0.g3(new Runnable() { // from class: org.telegram.ui.qe0
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i26) {
                                            case 0:
                                                TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode32 = tL_inputStorePaymentAuthCode3;
                                                String str6 = tL_inputStorePaymentAuthCode32.phone_number;
                                                String str7 = tL_inputStorePaymentAuthCode32.phone_code_hash;
                                                long j10 = paymentForm4.form_id;
                                                se0 se0Var32 = se0Var3;
                                                if (!se0Var32.f) {
                                                    se0Var32.f = true;
                                                    se0Var32.h = str6;
                                                    se0Var32.n = str7;
                                                    se0Var32.r = j10;
                                                    se0Var32.b.setLoading(true);
                                                    se0Var32.o();
                                                    break;
                                                }
                                                break;
                                            default:
                                                TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode4 = tL_inputStorePaymentAuthCode3;
                                                String str8 = tL_inputStorePaymentAuthCode4.phone_number;
                                                String str9 = tL_inputStorePaymentAuthCode4.phone_code_hash;
                                                long j11 = paymentForm4.form_id;
                                                se0 se0Var4 = se0Var3;
                                                if (!se0Var4.f) {
                                                    se0Var4.f = true;
                                                    se0Var4.h = str8;
                                                    se0Var4.n = str9;
                                                    se0Var4.r = j11;
                                                    se0Var4.b.setLoading(true);
                                                    se0Var4.o();
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
                final int i25 = 1;
                sm0Var2.d1 = new org.telegram.messenger.q20() { // from class: org.telegram.ui.pe0
                    @Override // org.telegram.messenger.q20
                    public final void a(Object obj6) {
                        switch (i25) {
                            case 0:
                                final int i252 = 0;
                                final se0 se0Var2 = se0Var;
                                final TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode2 = tL_inputStorePaymentAuthCode;
                                final TLRPC.PaymentForm paymentForm3 = paymentForm2;
                                org.telegram.messenger.i0.g3(new Runnable() { // from class: org.telegram.ui.qe0
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i252) {
                                            case 0:
                                                TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode32 = tL_inputStorePaymentAuthCode2;
                                                String str6 = tL_inputStorePaymentAuthCode32.phone_number;
                                                String str7 = tL_inputStorePaymentAuthCode32.phone_code_hash;
                                                long j10 = paymentForm3.form_id;
                                                se0 se0Var32 = se0Var2;
                                                if (!se0Var32.f) {
                                                    se0Var32.f = true;
                                                    se0Var32.h = str6;
                                                    se0Var32.n = str7;
                                                    se0Var32.r = j10;
                                                    se0Var32.b.setLoading(true);
                                                    se0Var32.o();
                                                    break;
                                                }
                                                break;
                                            default:
                                                TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode4 = tL_inputStorePaymentAuthCode2;
                                                String str8 = tL_inputStorePaymentAuthCode4.phone_number;
                                                String str9 = tL_inputStorePaymentAuthCode4.phone_code_hash;
                                                long j11 = paymentForm3.form_id;
                                                se0 se0Var4 = se0Var2;
                                                if (!se0Var4.f) {
                                                    se0Var4.f = true;
                                                    se0Var4.h = str8;
                                                    se0Var4.n = str9;
                                                    se0Var4.r = j11;
                                                    se0Var4.b.setLoading(true);
                                                    se0Var4.o();
                                                    break;
                                                }
                                                break;
                                        }
                                    }
                                });
                                break;
                            default:
                                final int i26 = 1;
                                final se0 se0Var3 = se0Var;
                                final TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode3 = tL_inputStorePaymentAuthCode;
                                final TLRPC.PaymentForm paymentForm4 = paymentForm2;
                                org.telegram.messenger.i0.g3(new Runnable() { // from class: org.telegram.ui.qe0
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i26) {
                                            case 0:
                                                TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode32 = tL_inputStorePaymentAuthCode3;
                                                String str6 = tL_inputStorePaymentAuthCode32.phone_number;
                                                String str7 = tL_inputStorePaymentAuthCode32.phone_code_hash;
                                                long j10 = paymentForm4.form_id;
                                                se0 se0Var32 = se0Var3;
                                                if (!se0Var32.f) {
                                                    se0Var32.f = true;
                                                    se0Var32.h = str6;
                                                    se0Var32.n = str7;
                                                    se0Var32.r = j10;
                                                    se0Var32.b.setLoading(true);
                                                    se0Var32.o();
                                                    break;
                                                }
                                                break;
                                            default:
                                                TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode4 = tL_inputStorePaymentAuthCode3;
                                                String str8 = tL_inputStorePaymentAuthCode4.phone_number;
                                                String str9 = tL_inputStorePaymentAuthCode4.phone_code_hash;
                                                long j11 = paymentForm4.form_id;
                                                se0 se0Var4 = se0Var3;
                                                if (!se0Var4.f) {
                                                    se0Var4.f = true;
                                                    se0Var4.h = str8;
                                                    se0Var4.n = str9;
                                                    se0Var4.r = j11;
                                                    se0Var4.b.setLoading(true);
                                                    se0Var4.o();
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
                sm0Var2.e1 = new k10(se0Var, i25);
                hf0Var4.presentFragment(sm0Var2);
                return;
            case 7:
                sh0 sh0Var = (sh0) obj5;
                TLRPC.TL_error tL_error7 = (TLRPC.TL_error) obj;
                cg.b bVar = (cg.b) obj4;
                String str6 = (String) obj3;
                TL_stats.TL_loadAsyncGraph tL_loadAsyncGraph = (TL_stats.TL_loadAsyncGraph) obj2;
                sh0Var.D = true;
                if (tL_error7 != null || bVar == null) {
                    sh0Var.l0();
                    return;
                }
                sh0Var.w.l(str6, bVar);
                g61 g61Var = sh0Var.r;
                g61Var.e = bVar;
                g61Var.c = tL_loadAsyncGraph.x;
                sh0Var.l0();
                return;
            case 8:
                gi0 gi0Var = (gi0) obj5;
                TLRPC.TL_contacts_importedContacts tL_contacts_importedContacts = (TLRPC.TL_contacts_importedContacts) obj4;
                TLRPC.TL_inputPhoneContact tL_inputPhoneContact = (TLRPC.TL_inputPhoneContact) obj3;
                TLRPC.TL_error tL_error8 = (TLRPC.TL_error) obj;
                TLRPC.TL_contacts_importContacts tL_contacts_importContacts = (TLRPC.TL_contacts_importContacts) obj2;
                org.telegram.ui.ActionBar.k2 k2Var = gi0Var.C1;
                gi0Var.x1 = false;
                if (tL_contacts_importedContacts == null) {
                    org.telegram.messenger.i0.Y3(gi0Var.N1, true, 0.5f, true, true);
                    org.telegram.messenger.i0.Y3(gi0Var.O1, false, 0.5f, true, true);
                    org.telegram.ui.Components.s4.e0(gi0Var.a, tL_error8, k2Var, tL_contacts_importContacts, new Object[0]);
                    return;
                } else if (!tL_contacts_importedContacts.users.isEmpty()) {
                    org.telegram.messenger.vp.r1(gi0Var.a).V3(tL_contacts_importedContacts.users, false);
                    org.telegram.messenger.vp.r1(gi0Var.a).w3(tL_contacts_importedContacts.users.get(0), null, k2Var, 1);
                    gi0Var.dismiss();
                    return;
                } else {
                    if (k2Var.getParentActivity() == null) {
                        return;
                    }
                    org.telegram.messenger.i0.Y3(gi0Var.N1, true, 0.5f, true, true);
                    org.telegram.messenger.i0.Y3(gi0Var.O1, false, 0.5f, true, true);
                    org.telegram.ui.Components.s4.u(k2Var, tL_inputPhoneContact.first_name, tL_inputPhoneContact.last_name, tL_inputPhoneContact.phone);
                    return;
                }
            case 9:
                TLRPC.TL_error tL_error9 = (TLRPC.TL_error) obj;
                mg0 mg0Var = (mg0) obj4;
                m4.c cVar = (m4.c) obj3;
                TL_account.verifyEmail verifyemail2 = (TL_account.verifyEmail) obj2;
                ll0 ll0Var = ((tk0) obj5).a;
                if (tL_error9 == null) {
                    ((pk0) ll0Var.B1).c(ll0Var.E, (String) ll0Var.s1.get("email"), null, null, null, null, null, null, null, null, mg0Var, cVar);
                    return;
                }
                i16 = ((org.telegram.ui.ActionBar.k2) ll0Var).currentAccount;
                org.telegram.ui.Components.s4.e0(i16, tL_error9, ll0Var, verifyemail2, new Object[0]);
                cVar.d(null, null);
                return;
            case 10:
                hl0 hl0Var = (hl0) obj5;
                TLRPC.TL_error tL_error10 = (TLRPC.TL_error) obj;
                Bundle bundle4 = (Bundle) obj3;
                TLObject tLObject7 = (TLObject) obj4;
                TLRPC.TL_auth_resendCode tL_auth_resendCode2 = (TLRPC.TL_auth_resendCode) obj2;
                ll0 ll0Var2 = hl0Var.Q;
                int i26 = 0;
                hl0Var.J = false;
                if (tL_error10 == null) {
                    ll0Var2.o1(bundle4, (TLRPC.TL_auth_sentCode) tLObject7, true);
                } else {
                    i17 = ((org.telegram.ui.ActionBar.k2) ll0Var2).currentAccount;
                    org.telegram.ui.ActionBar.x1 e02 = org.telegram.ui.Components.s4.e0(i17, tL_error10, ll0Var2, tL_auth_resendCode2, new Object[0]);
                    if (e02 != null && tL_error10.text.contains("PHONE_CODE_EXPIRED")) {
                        e02.o0 = new cl0(hl0Var, i26);
                    }
                }
                ll0Var2.A1();
                return;
            case 11:
                sm0.j0((sm0) obj5, (TLRPC.TL_error) obj, (TLObject) obj4, (String) obj3, (TL_account.getPassword) obj2);
                return;
            case 12:
                ClippingImageView[] clippingImageViewArr = (ClippingImageView[]) obj4;
                ArrayList arrayList = (ArrayList) obj3;
                Integer num = (Integer) obj2;
                es0 es0Var2 = (es0) obj;
                PhotoViewer photoViewer = ((jr0) obj5).r;
                photoViewer.p4 = null;
                as0 as0Var = photoViewer.e0;
                if (as0Var == null || photoViewer.g0 == null) {
                    return;
                }
                as0Var.setLayerType(0, null);
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
                gs0 gs0Var = photoViewer.q4;
                if (gs0Var != null) {
                    z11 = true;
                    gs0Var.a.O0(true, true);
                } else {
                    z11 = true;
                }
                gs0 gs0Var2 = photoViewer.r4;
                if (gs0Var2 != null && !gs0Var2.s) {
                    gs0Var2.a.O0(false, z11);
                }
                if (arrayList != null && (i18 = photoViewer.c2) != 3 && i18 != z11 && ((es0Var = photoViewer.d) == null || !es0Var.P())) {
                    photoViewer.V1();
                }
                org.telegram.ui.Components.u61 u61Var = photoViewer.F2;
                if (u61Var != null && u61Var.d0() && photoViewer.r1 && !photoViewer.g7.isEmpty()) {
                    PhotoViewer.a0(photoViewer, photoViewer.F2.S());
                    PhotoViewer.Z(photoViewer, true);
                }
                if (photoViewer.t4) {
                    PhotoViewer.b0(photoViewer, num.intValue());
                }
                if (es0Var2 != null) {
                    es0Var2.d();
                    return;
                }
                return;
            case 13:
                PrivacyControlActivity privacyControlActivity = (PrivacyControlActivity) obj5;
                boolean[] zArr = (boolean[]) obj4;
                TLRPC.GlobalPrivacySettings globalPrivacySettings = (TLRPC.GlobalPrivacySettings) obj3;
                TL_account.setGlobalPrivacySettings setglobalprivacysettings = (TL_account.setGlobalPrivacySettings) obj2;
                if (((TLRPC.TL_error) obj) != null) {
                    privacyControlActivity.F0();
                    return;
                }
                zArr[1] = true;
                if (globalPrivacySettings != null) {
                    TLRPC.GlobalPrivacySettings globalPrivacySettings2 = setglobalprivacysettings.settings;
                    globalPrivacySettings.new_noncontact_peers_require_premium = globalPrivacySettings2.new_noncontact_peers_require_premium;
                    int i27 = globalPrivacySettings2.flags;
                    globalPrivacySettings.flags = i27;
                    globalPrivacySettings.disallowed_stargifts = globalPrivacySettings2.disallowed_stargifts;
                    long j10 = globalPrivacySettings2.noncontact_peers_paid_stars;
                    if (j10 > 0) {
                        globalPrivacySettings.flags = i27 | 32;
                        globalPrivacySettings.noncontact_peers_paid_stars = j10;
                    } else {
                        globalPrivacySettings.flags = i27 & (-33);
                        globalPrivacySettings.noncontact_peers_paid_stars = 0L;
                    }
                }
                if (zArr[0]) {
                    privacyControlActivity.B0();
                }
                privacyControlActivity.getNotificationCenter().k(47, new Object[0]);
                return;
            case 14:
                TLRPC.UserFull userFull = (TLRPC.UserFull) obj3;
                TL_account.TL_birthday tL_birthday = (TL_account.TL_birthday) obj2;
                TLRPC.TL_error tL_error11 = (TLRPC.TL_error) obj;
                PrivacyControlActivity privacyControlActivity2 = ((su0) obj5).d;
                if (((TLObject) obj4) instanceof TLRPC.TL_boolTrue) {
                    org.telegram.ui.Components.wb Q = org.telegram.ui.Components.cc.a0(privacyControlActivity2).Q(R.raw.contact_check, 36, org.telegram.messenger.cd.L0(2131746871, null));
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
                    String L0 = org.telegram.messenger.cd.L0(2131746867, null);
                    org.telegram.ui.ActionBar.x1 x1Var2 = alertDialog$Builder.a;
                    x1Var2.R = L0;
                    x1Var2.T = org.telegram.messenger.cd.L0(2131746868, null);
                    alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131747847, null), null);
                    privacyControlActivity2.showDialog(x1Var2);
                    return;
                }
                return;
            case 15:
                ProfileActivity profileActivity = (ProfileActivity) obj5;
                TLRPC.ChatParticipant chatParticipant = (TLRPC.ChatParticipant) obj3;
                TLRPC.User user = (TLRPC.User) obj2;
                dv0 dv0Var = (dv0) obj;
                RectF rectF = ProfileActivity.R6;
                if (!(((TLRPC.ChannelParticipant) obj4) instanceof TLRPC.TL_channelParticipantAdmin) && !(chatParticipant instanceof TLRPC.TL_chatParticipantAdmin)) {
                    dv0Var.a(1);
                    return;
                }
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(0, profileActivity.getParentActivity(), profileActivity.z0);
                String L02 = org.telegram.messenger.cd.L0(R.string.AppName, null);
                org.telegram.ui.ActionBar.x1 x1Var3 = alertDialog$Builder2.a;
                x1Var3.R = L02;
                x1Var3.T = org.telegram.messenger.cd.a0(null, null, 2131754350, org.telegram.messenger.i5.m(0, user.first_name, user.last_name));
                alertDialog$Builder2.k(org.telegram.messenger.cd.L0(2131747847, null), new tj0(dv0Var, i21));
                alertDialog$Builder2.h(org.telegram.messenger.cd.L0(2131752589, null), null);
                profileActivity.showDialog(x1Var3);
                return;
            case 16:
                ProfileActivity profileActivity2 = (ProfileActivity) obj5;
                TLObject tLObject8 = (TLObject) obj4;
                TLRPC.TL_username tL_username = (TLRPC.TL_username) obj3;
                uw0 uw0Var = (uw0) obj2;
                TLRPC.TL_error tL_error12 = (TLRPC.TL_error) obj;
                if (!(tLObject8 instanceof TL_fragment.TL_collectibleInfo)) {
                    RectF rectF2 = ProfileActivity.R6;
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
                String format = org.telegram.messenger.cd.D0().n0().format(new Date(tL_collectibleInfo.purchase_date * 1000));
                String f7 = org.telegram.messenger.u1.i().f(tL_collectibleInfo.crypto_amount, tL_collectibleInfo.crypto_currency);
                String f10 = org.telegram.messenger.u1.i().f(tL_collectibleInfo.amount, tL_collectibleInfo.currency);
                org.telegram.ui.Components.wb w9 = new org.telegram.ui.Components.cc(uw0Var.t1, profileActivity2.z0).w(R.drawable.filled_username, org.telegram.messenger.i0.c4(org.telegram.messenger.i0.W2(org.telegram.messenger.cd.a0(null, null, 2131750528, str7, format, f7, TextUtils.isEmpty(f10) ? "" : a1.g.n("(", f10, ")"))), new et0(i21, profileActivity2, tL_collectibleInfo)));
                wu wuVar = new wu(29, profileActivity2, tL_collectibleInfo);
                org.telegram.ui.Components.bb bbVar = w9.e;
                if (bbVar != null) {
                    bbVar.setOnClickListener(wuVar);
                }
                w9.k(false);
                return;
            case 17:
                ProfileActivity profileActivity3 = (ProfileActivity) obj5;
                TLObject tLObject9 = (TLObject) obj4;
                String str8 = (String) obj3;
                TLRPC.User user2 = (TLRPC.User) obj2;
                TLRPC.TL_error tL_error13 = (TLRPC.TL_error) obj;
                RectF rectF3 = ProfileActivity.R6;
                if (tLObject9 instanceof TL_fragment.TL_collectibleInfo) {
                    i10.a(profileActivity3.getParentActivity(), 1, str8, user2, (TL_fragment.TL_collectibleInfo) tLObject9, profileActivity3.z0);
                    return;
                } else {
                    org.telegram.ui.Components.cc.d0(tL_error13);
                    return;
                }
            case 18:
                ProfileActivity.g0((ProfileActivity) obj5, (TLObject) obj4, (TLRPC.UserFull) obj3, (TL_account.TL_birthday) obj2, (TLRPC.TL_error) obj);
                return;
            case 19:
                hy0 hy0Var = (hy0) obj5;
                ArrayList arrayList2 = (ArrayList) obj3;
                ArrayList arrayList3 = (ArrayList) obj2;
                ArrayList arrayList4 = (ArrayList) obj;
                org.telegram.ui.ActionBar.k2 k2Var2 = hy0Var.e;
                if (((String) obj4).equals(hy0Var.D)) {
                    if (!hy0Var.x && (k2Var2 instanceof ProfileActivity)) {
                        try {
                            ((ProfileActivity) k2Var2).O.b.getImageReceiver().P0(false);
                            ((ProfileActivity) k2Var2).O.d.setText(org.telegram.messenger.cd.L0(2131745494, null));
                        } catch (Exception e10) {
                            org.telegram.messenger.f8.g(e10, true);
                        }
                    }
                    hy0Var.x = true;
                    hy0Var.r = arrayList2;
                    hy0Var.s = arrayList3;
                    hy0Var.n = arrayList4;
                    hy0Var.f();
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
                i31 i31Var = (i31) obj5;
                i31Var.getClass();
                i31Var.p((View) obj4, Long.valueOf(((org.telegram.ui.Components.o5) obj3).documentId), (TLRPC.Document) obj2, ((s21) obj).w, null);
                return;
            case 21:
                s31 s31Var = (s31) obj5;
                TLRPC.TL_error tL_error14 = (TLRPC.TL_error) obj;
                TLObject tLObject10 = (TLObject) obj4;
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) obj3;
                TLRPC.User user3 = (TLRPC.User) obj2;
                s31Var.getClass();
                if (tL_error14 == null) {
                    TL_account.Password password = (TL_account.Password) tLObject10;
                    twoStepVerificationActivity.I = password;
                    TwoStepVerificationActivity.q0(password);
                    s31Var.e1(user3, twoStepVerificationActivity.p0(), twoStepVerificationActivity);
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
                                k0Var.c.p(org.telegram.messenger.d20.i(k0Var.a).e(), ((TL_wallet.TL_walletState) k0Var.e).public_key, h0Var2, null);
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
                org.telegram.messenger.q20 q20Var = (org.telegram.messenger.q20) obj3;
                String str10 = (String) obj2;
                org.telegram.ui.Wallet.a2 a2Var = (org.telegram.ui.Wallet.a2) obj;
                e2Var.getClass();
                if (jSONObject == null) {
                    q20Var.a(str10);
                    return;
                } else {
                    e2Var.E(a2Var.a.id, a2Var.b, jSONObject, q20Var);
                    return;
                }
            case 24:
                org.telegram.ui.Wallet.a2 a2Var2 = (org.telegram.ui.Wallet.a2) obj4;
                f11 f11Var = (f11) obj2;
                org.telegram.ui.Wallet.u1 u1Var = (org.telegram.ui.Wallet.u1) obj;
                try {
                    bArr = Base64.decode(WalletEngine2.tonConnectCrypto((org.telegram.ui.Wallet.h0) obj5, a2Var2.a, a2Var2.h, a2Var2.g, new JSONObject().put("challenge", Base64.encodeToString(((TL_wallet.tonConnectChallenge) obj3).challenge, 2))).getString("challengeAnswer"), 2);
                    i19 = null;
                } catch (Exception e12) {
                    i19 = org.telegram.ui.Wallet.e2.i("decrypt challenge", e12);
                    bArr = null;
                }
                org.telegram.messenger.i0.g3(new org.telegram.ui.Wallet.k7((Object) bArr, (Object) f11Var, i19, (Object) u1Var, 7));
                return;
            case 25:
                org.telegram.ui.Wallet.e2 e2Var2 = (org.telegram.ui.Wallet.e2) obj5;
                TL_wallet.sendTransfer sendtransfer = (TL_wallet.sendTransfer) obj4;
                org.telegram.ui.Wallet.a2 a2Var3 = (org.telegram.ui.Wallet.a2) obj3;
                org.telegram.messenger.q20 q20Var2 = (org.telegram.messenger.q20) obj2;
                org.telegram.ui.Wallet.h0 h0Var3 = (org.telegram.ui.Wallet.h0) obj;
                try {
                    if (!org.telegram.messenger.vp.r1(e2Var2.a).f7.edit().putString(org.telegram.ui.Wallet.e2.l(a2Var3.a.id, a2Var3.b) + ".transfer", new JSONObject().put("boc", Base64.encodeToString(sendtransfer.data_normal, 2)).put("randomId", sendtransfer.random_id).toString()).commit()) {
                        throw new IllegalStateException("Could not save signed transfer");
                    }
                } catch (Exception e13) {
                    str2 = org.telegram.ui.Wallet.e2.i("save transfer", e13);
                }
                org.telegram.messenger.i0.g3(new v8(e2Var2, str2, q20Var2, a2Var3, h0Var3, sendtransfer, 12));
                return;
            case 26:
                ((WalletEngine2) obj5).lambda$emulateSendNFT$19((AtomicBoolean) obj4, (org.telegram.messenger.j20) obj3, (TL_wallet.walletTransaction) obj2, (String) obj);
                return;
            case 27:
                ((WalletEngine2) obj5).lambda$prepareSend$49((org.telegram.messenger.l20) obj4, (TL_wallet.sendTransfer) obj3, (String) obj2, (String) obj);
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
                    org.telegram.ui.Components.wb I = org.telegram.ui.Components.cc.a0(T).I(R.raw.forward, org.telegram.messenger.cd.L0(2131749709, null), org.telegram.messenger.i0.W2(org.telegram.messenger.cd.a0(null, null, 2131749710, b0Var.S1, org.telegram.messenger.o5.t(b0Var.T1))));
                    I.t = true;
                    I.j();
                    return;
                }
                return;
        }
    }

    public /* synthetic */ m90(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i10) {
        this.a = i10;
        this.d = obj;
        this.c = obj2;
        this.e = obj3;
        this.f = obj4;
        this.b = obj5;
    }

    public /* synthetic */ m90(Object obj, TLRPC.TL_error tL_error, Object obj2, Object obj3, Object obj4, int i10) {
        this.a = i10;
        this.d = obj;
        this.b = tL_error;
        this.c = obj2;
        this.e = obj3;
        this.f = obj4;
    }

    public /* synthetic */ m90(hl0 hl0Var, TLRPC.TL_error tL_error, Bundle bundle, TLObject tLObject, TLRPC.TL_auth_resendCode tL_auth_resendCode) {
        this.a = 10;
        this.d = hl0Var;
        this.b = tL_error;
        this.e = bundle;
        this.c = tLObject;
        this.f = tL_auth_resendCode;
    }
}
