package org.telegram.ui;

import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.DialogObject;
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

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class ac0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ ac0(KeyEvent.Callback callback, TLObject tLObject, Object obj, TLRPC.TL_error tL_error, TLObject tLObject2, int i10) {
        this.a = i10;
        this.d = callback;
        this.e = tLObject;
        this.f = obj;
        this.b = tL_error;
        this.c = tLObject2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        wo0 wo0Var;
        org.telegram.ui.Components.wc b10;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        cv0 cv0Var;
        String str;
        org.telegram.ui.ActionBar.f6 f6Var;
        int i17 = this.a;
        wo0 wo0Var2 = null;
        final int i18 = 1;
        boolean z10 = false;
        Object obj = this.f;
        Object obj2 = this.e;
        Object obj3 = this.c;
        Object obj4 = this.b;
        Object obj5 = this.d;
        switch (i17) {
            case 0:
                fc0 fc0Var = (fc0) obj5;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj4;
                TLObject tLObject = (TLObject) obj2;
                TLRPC.TL_inputInvoiceSlug tL_inputInvoiceSlug = (TLRPC.TL_inputInvoiceSlug) obj;
                String str2 = (String) obj3;
                int i19 = fc0Var.b;
                LaunchActivity launchActivity = fc0Var.a;
                if (tL_error != null) {
                    if ("SUBSCRIPTION_ALREADY_ACTIVE".equalsIgnoreCase(tL_error.text)) {
                        b10 = fc0.b();
                        i10 = R.string.PaymentInvoiceSubscriptionLinkAlreadyPaid;
                    } else {
                        b10 = fc0.b();
                        i10 = R.string.PaymentInvoiceLinkInvalid;
                    }
                    org.telegram.messenger.a2.p(i10, b10, null);
                } else if (!launchActivity.isFinishing()) {
                    if (tLObject instanceof TLRPC.TL_payments_paymentFormStars) {
                        wh.o4 o4Var = launchActivity.Y0;
                        launchActivity.Y0 = null;
                        xh.v5.y(i19, false).Y(null, tL_inputInvoiceSlug, (TLRPC.TL_payments_paymentFormStars) tLObject, new zb0(fc0Var, 1), new j90(o4Var, i18));
                        break;
                    } else {
                        if (tLObject instanceof TLRPC.PaymentForm) {
                            TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject;
                            MessagesController.getInstance(i19).putUsers(paymentForm.users, false);
                            wo0Var = new wo0(paymentForm, null, str2, LaunchActivity.U());
                        } else {
                            wo0Var = tLObject instanceof TLRPC.PaymentReceipt ? new wo0((TLRPC.PaymentReceipt) tLObject) : null;
                        }
                        if (wo0Var != null) {
                            wh.o4 o4Var2 = launchActivity.Y0;
                            if (o4Var2 != null) {
                                launchActivity.Y0 = null;
                                wo0Var.Z0 = new nf(10, o4Var2);
                            }
                            fc0Var.n(wo0Var, false);
                        }
                    }
                }
                fc0Var.a();
                break;
            case 1:
                xg0.U((xg0) obj5, (TLRPC.TL_error) obj4, (String) obj3, (String) obj2, (String) obj);
                break;
            case 2:
                TLObject tLObject2 = (TLObject) obj2;
                Bundle bundle = (Bundle) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj4;
                TLRPC.TL_auth_resendCode tL_auth_resendCode = (TLRPC.TL_auth_resendCode) obj3;
                xg0 xg0Var = ((ge0) obj5).W;
                if (tLObject2 instanceof TLRPC.TL_auth_sentCode) {
                    xg0Var.g1(bundle, (TLRPC.TL_auth_sentCode) tLObject2, true);
                    break;
                } else if (tL_error2 != null && tL_error2.text != null) {
                    i11 = ((org.telegram.ui.ActionBar.p2) xg0Var).currentAccount;
                    org.telegram.ui.Components.d5.f0(i11, tL_error2, xg0Var, tL_auth_resendCode, new Object[0]);
                    break;
                }
                break;
            case 3:
                lf0 lf0Var = (lf0) obj5;
                TLObject tLObject3 = (TLObject) obj2;
                Bundle bundle2 = (Bundle) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj4;
                TL_account.sendVerifyEmailCode sendverifyemailcode = (TL_account.sendVerifyEmailCode) obj3;
                xg0 xg0Var2 = lf0Var.E;
                xg0Var2.k1(false, true);
                lf0Var.r = false;
                if (tLObject3 instanceof TL_account.sentEmailCode) {
                    TL_account.sentEmailCode sentemailcode = (TL_account.sentEmailCode) tLObject3;
                    bundle2.putString("emailPattern", sentemailcode.email_pattern);
                    bundle2.putInt("length", sentemailcode.length);
                    xg0Var2.u1(13, true, bundle2, false);
                    break;
                } else {
                    String str3 = tL_error3.text;
                    if (str3 != null) {
                        if (str3.contains("EMAIL_INVALID")) {
                            lf0Var.o();
                            break;
                        } else if (tL_error3.text.contains("EMAIL_NOT_ALLOWED")) {
                            xg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.EmailNotAllowed));
                            break;
                        } else if (tL_error3.text.contains("PHONE_PASSWORD_FLOOD")) {
                            xg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("FloodWait", R.string.FloodWait));
                            break;
                        } else if (tL_error3.text.contains("PHONE_NUMBER_FLOOD")) {
                            xg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("PhoneNumberFlood", R.string.PhoneNumberFlood));
                            break;
                        } else if (!tL_error3.text.contains("PHONE_CODE_EMPTY") && !tL_error3.text.contains("PHONE_CODE_INVALID")) {
                            if (tL_error3.text.contains("PHONE_CODE_EXPIRED")) {
                                xg0Var2.u1(0, true, null, true);
                                xg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("CodeExpired", R.string.CodeExpired));
                                break;
                            } else if (tL_error3.text.startsWith("FLOOD_WAIT")) {
                                xg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("FloodWait", R.string.FloodWait));
                                break;
                            } else if (tL_error3.code != -1000) {
                                i12 = ((org.telegram.ui.ActionBar.p2) xg0Var2).currentAccount;
                                org.telegram.ui.Components.d5.f0(i12, tL_error3, xg0Var2, sendverifyemailcode, lf0Var.w);
                                break;
                            }
                        } else {
                            xg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("InvalidCode", R.string.InvalidCode));
                            break;
                        }
                    }
                }
                break;
            case 4:
                TLObject tLObject4 = (TLObject) obj2;
                Bundle bundle3 = (Bundle) obj;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) obj4;
                TL_account.verifyEmail verifyemail = (TL_account.verifyEmail) obj3;
                xg0 xg0Var3 = ((lf0) obj5).E;
                if (!(tLObject4 instanceof TL_account.TL_emailVerified) || xg0Var3.F != 3) {
                    if (tLObject4 instanceof TL_account.TL_emailVerifiedLogin) {
                        TL_account.TL_emailVerifiedLogin tL_emailVerifiedLogin = (TL_account.TL_emailVerifiedLogin) tLObject4;
                        bundle3.putString("email", tL_emailVerifiedLogin.email);
                        xg0Var3.g1(bundle3, tL_emailVerifiedLogin.sent_code, true);
                        break;
                    } else if (tL_error4 != null) {
                        if (tL_error4.text.contains("EMAIL_NOT_ALLOWED")) {
                            xg0Var3.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.EmailNotAllowed));
                            break;
                        } else if (tL_error4.text.contains("EMAIL_TOKEN_INVALID")) {
                            xg0Var3.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.EmailTokenInvalid));
                            break;
                        } else if (tL_error4.code != -1000) {
                            i13 = ((org.telegram.ui.ActionBar.p2) xg0Var3).currentAccount;
                            org.telegram.ui.Components.d5.f0(i13, tL_error4, xg0Var3, verifyemail, new Object[0]);
                            break;
                        }
                    }
                } else {
                    xg0Var3.finishFragment();
                    xg0Var3.d0.run();
                    break;
                }
                break;
            case 5:
                final fg0 fg0Var = (fg0) obj5;
                TLObject tLObject5 = (TLObject) obj2;
                TLRPC.TL_inputInvoicePremiumAuthCode tL_inputInvoicePremiumAuthCode = (TLRPC.TL_inputInvoicePremiumAuthCode) obj;
                final TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode = (TLRPC.TL_inputStorePaymentAuthCode) obj3;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) obj4;
                xg0 xg0Var4 = fg0Var.v;
                fg0Var.b.setLoading(false);
                if (tLObject5 instanceof TLRPC.PaymentForm) {
                    final TLRPC.PaymentForm paymentForm2 = (TLRPC.PaymentForm) tLObject5;
                    xg0Var4.getMessagesController().putUsers(paymentForm2.users, false);
                    wo0 wo0Var3 = new wo0(tL_inputInvoicePremiumAuthCode, paymentForm2, null, null, 4, null, null, null, null, null, null, false, null, xg0Var4, true);
                    wo0Var3.V0 = true;
                    final Object[] objArr = null == true ? 1 : 0;
                    wo0Var3.c1 = new Utilities.Callback() { // from class: org.telegram.ui.ag0
                        @Override // org.telegram.messenger.Utilities.Callback
                        public final void run(Object obj6) {
                            switch (objArr) {
                                case 0:
                                    final int i20 = 0;
                                    final fg0 fg0Var2 = fg0Var;
                                    final TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode2 = tL_inputStorePaymentAuthCode;
                                    final TLRPC.PaymentForm paymentForm3 = paymentForm2;
                                    AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.cg0
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i20) {
                                                case 0:
                                                    TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode3 = tL_inputStorePaymentAuthCode2;
                                                    String str4 = tL_inputStorePaymentAuthCode3.phone_number;
                                                    String str5 = tL_inputStorePaymentAuthCode3.phone_code_hash;
                                                    long j3 = paymentForm3.form_id;
                                                    fg0 fg0Var3 = fg0Var2;
                                                    if (!fg0Var3.f) {
                                                        fg0Var3.f = true;
                                                        fg0Var3.h = str4;
                                                        fg0Var3.n = str5;
                                                        fg0Var3.r = j3;
                                                        fg0Var3.b.setLoading(true);
                                                        fg0Var3.p();
                                                        break;
                                                    }
                                                    break;
                                                default:
                                                    TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode4 = tL_inputStorePaymentAuthCode2;
                                                    String str6 = tL_inputStorePaymentAuthCode4.phone_number;
                                                    String str7 = tL_inputStorePaymentAuthCode4.phone_code_hash;
                                                    long j10 = paymentForm3.form_id;
                                                    fg0 fg0Var4 = fg0Var2;
                                                    if (!fg0Var4.f) {
                                                        fg0Var4.f = true;
                                                        fg0Var4.h = str6;
                                                        fg0Var4.n = str7;
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
                                    final int i21 = 1;
                                    final fg0 fg0Var3 = fg0Var;
                                    final TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode3 = tL_inputStorePaymentAuthCode;
                                    final TLRPC.PaymentForm paymentForm4 = paymentForm2;
                                    AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.cg0
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i21) {
                                                case 0:
                                                    TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode32 = tL_inputStorePaymentAuthCode3;
                                                    String str4 = tL_inputStorePaymentAuthCode32.phone_number;
                                                    String str5 = tL_inputStorePaymentAuthCode32.phone_code_hash;
                                                    long j3 = paymentForm4.form_id;
                                                    fg0 fg0Var32 = fg0Var3;
                                                    if (!fg0Var32.f) {
                                                        fg0Var32.f = true;
                                                        fg0Var32.h = str4;
                                                        fg0Var32.n = str5;
                                                        fg0Var32.r = j3;
                                                        fg0Var32.b.setLoading(true);
                                                        fg0Var32.p();
                                                        break;
                                                    }
                                                    break;
                                                default:
                                                    TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode4 = tL_inputStorePaymentAuthCode3;
                                                    String str6 = tL_inputStorePaymentAuthCode4.phone_number;
                                                    String str7 = tL_inputStorePaymentAuthCode4.phone_code_hash;
                                                    long j10 = paymentForm4.form_id;
                                                    fg0 fg0Var4 = fg0Var3;
                                                    if (!fg0Var4.f) {
                                                        fg0Var4.f = true;
                                                        fg0Var4.h = str6;
                                                        fg0Var4.n = str7;
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
                    wo0Var3.d1 = new Utilities.Callback() { // from class: org.telegram.ui.ag0
                        @Override // org.telegram.messenger.Utilities.Callback
                        public final void run(Object obj6) {
                            switch (i18) {
                                case 0:
                                    final int i20 = 0;
                                    final fg0 fg0Var2 = fg0Var;
                                    final TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode2 = tL_inputStorePaymentAuthCode;
                                    final TLRPC.PaymentForm paymentForm3 = paymentForm2;
                                    AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.cg0
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i20) {
                                                case 0:
                                                    TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode32 = tL_inputStorePaymentAuthCode2;
                                                    String str4 = tL_inputStorePaymentAuthCode32.phone_number;
                                                    String str5 = tL_inputStorePaymentAuthCode32.phone_code_hash;
                                                    long j3 = paymentForm3.form_id;
                                                    fg0 fg0Var32 = fg0Var2;
                                                    if (!fg0Var32.f) {
                                                        fg0Var32.f = true;
                                                        fg0Var32.h = str4;
                                                        fg0Var32.n = str5;
                                                        fg0Var32.r = j3;
                                                        fg0Var32.b.setLoading(true);
                                                        fg0Var32.p();
                                                        break;
                                                    }
                                                    break;
                                                default:
                                                    TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode4 = tL_inputStorePaymentAuthCode2;
                                                    String str6 = tL_inputStorePaymentAuthCode4.phone_number;
                                                    String str7 = tL_inputStorePaymentAuthCode4.phone_code_hash;
                                                    long j10 = paymentForm3.form_id;
                                                    fg0 fg0Var4 = fg0Var2;
                                                    if (!fg0Var4.f) {
                                                        fg0Var4.f = true;
                                                        fg0Var4.h = str6;
                                                        fg0Var4.n = str7;
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
                                    final int i21 = 1;
                                    final fg0 fg0Var3 = fg0Var;
                                    final TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode3 = tL_inputStorePaymentAuthCode;
                                    final TLRPC.PaymentForm paymentForm4 = paymentForm2;
                                    AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.cg0
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i21) {
                                                case 0:
                                                    TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode32 = tL_inputStorePaymentAuthCode3;
                                                    String str4 = tL_inputStorePaymentAuthCode32.phone_number;
                                                    String str5 = tL_inputStorePaymentAuthCode32.phone_code_hash;
                                                    long j3 = paymentForm4.form_id;
                                                    fg0 fg0Var32 = fg0Var3;
                                                    if (!fg0Var32.f) {
                                                        fg0Var32.f = true;
                                                        fg0Var32.h = str4;
                                                        fg0Var32.n = str5;
                                                        fg0Var32.r = j3;
                                                        fg0Var32.b.setLoading(true);
                                                        fg0Var32.p();
                                                        break;
                                                    }
                                                    break;
                                                default:
                                                    TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode4 = tL_inputStorePaymentAuthCode3;
                                                    String str6 = tL_inputStorePaymentAuthCode4.phone_number;
                                                    String str7 = tL_inputStorePaymentAuthCode4.phone_code_hash;
                                                    long j10 = paymentForm4.form_id;
                                                    fg0 fg0Var4 = fg0Var3;
                                                    if (!fg0Var4.f) {
                                                        fg0Var4.f = true;
                                                        fg0Var4.h = str6;
                                                        fg0Var4.n = str7;
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
                    wo0Var3.e1 = new n20(fg0Var, i18);
                    xg0Var4.presentFragment(wo0Var3);
                    break;
                } else if (tL_error5 != null) {
                    if ("PHONE_CODE_EXPIRED".equalsIgnoreCase(tL_error5.text)) {
                        AndroidUtilities.runOnUIThread(new bg0(fg0Var, null == true ? 1 : 0));
                        break;
                    } else {
                        String str4 = tL_error5.text;
                        fg0Var.e = str4;
                        new org.telegram.ui.Components.wc(xg0Var4.Z, null).H(R.raw.error, LocaleController.formatString(R.string.UnknownErrorCode, str4));
                        break;
                    }
                } else {
                    new org.telegram.ui.Components.wc(xg0Var4.Z, null).H(R.raw.error, LocaleController.getString(R.string.UnknownError));
                    break;
                }
            case 6:
                kj0 kj0Var = (kj0) obj5;
                TLRPC.TL_error tL_error6 = (TLRPC.TL_error) obj4;
                ig.b bVar = (ig.b) obj2;
                String str5 = (String) obj3;
                TL_stats.TL_loadAsyncGraph tL_loadAsyncGraph = (TL_stats.TL_loadAsyncGraph) obj;
                kj0Var.y = true;
                if (tL_error6 != null || bVar == null) {
                    kj0Var.g0();
                    break;
                } else {
                    kj0Var.v.put(str5, bVar);
                    ra1 ra1Var = kj0Var.r;
                    ra1Var.e = bVar;
                    ra1Var.c = tL_loadAsyncGraph.x;
                    kj0Var.g0();
                    break;
                }
            case 7:
                ek0.n((ek0) obj5, (TLRPC.TL_contacts_importedContacts) obj2, (TLRPC.TL_inputPhoneContact) obj, (TLRPC.TL_error) obj4, (TLRPC.TL_contacts_importContacts) obj3);
                break;
            case 8:
                TLRPC.TL_error tL_error7 = (TLRPC.TL_error) obj4;
                ql0 ql0Var = (ql0) obj2;
                n7.a1 a1Var = (n7.a1) obj;
                TL_account.verifyEmail verifyemail2 = (TL_account.verifyEmail) obj3;
                on0 on0Var = ((wm0) obj5).a;
                if (tL_error7 == null) {
                    ((rm0) on0Var.B1).c(on0Var.E, (String) on0Var.s1.get("email"), null, null, null, null, null, null, null, null, ql0Var, a1Var);
                    break;
                } else {
                    i14 = ((org.telegram.ui.ActionBar.p2) on0Var).currentAccount;
                    org.telegram.ui.Components.d5.f0(i14, tL_error7, on0Var, verifyemail2, new Object[0]);
                    a1Var.d(null, null);
                    break;
                }
            case 9:
                kn0 kn0Var = (kn0) obj5;
                TLRPC.TL_error tL_error8 = (TLRPC.TL_error) obj4;
                Bundle bundle4 = (Bundle) obj;
                TLObject tLObject6 = (TLObject) obj2;
                TLRPC.TL_auth_resendCode tL_auth_resendCode2 = (TLRPC.TL_auth_resendCode) obj3;
                on0 on0Var2 = kn0Var.Q;
                kn0Var.J = false;
                if (tL_error8 == null) {
                    on0Var2.l1(bundle4, (TLRPC.TL_auth_sentCode) tLObject6, true);
                } else {
                    i15 = ((org.telegram.ui.ActionBar.p2) on0Var2).currentAccount;
                    org.telegram.ui.ActionBar.d2 f02 = org.telegram.ui.Components.d5.f0(i15, tL_error8, on0Var2, tL_auth_resendCode2, new Object[0]);
                    if (f02 != null && tL_error8.text.contains("PHONE_CODE_EXPIRED")) {
                        f02.m0 = new fn0(kn0Var, null == true ? 1 : 0);
                    }
                }
                on0Var2.x1();
                break;
            case 10:
                wo0.f0((wo0) obj5, (TLRPC.TL_error) obj4, (TLObject) obj2, (String) obj3, (TL_account.getPassword) obj);
                break;
            case 11:
                ClippingImageView[] clippingImageViewArr = (ClippingImageView[]) obj4;
                ArrayList arrayList = (ArrayList) obj2;
                Integer num = (Integer) obj;
                cv0 cv0Var2 = (cv0) obj3;
                PhotoViewer photoViewer = ((eu0) obj5).r;
                photoViewer.p4 = null;
                wu0 wu0Var = photoViewer.e0;
                if (wu0Var != null && photoViewer.g0 != null) {
                    wu0Var.setLayerType(0, null);
                    photoViewer.n4 = 0;
                    photoViewer.F1();
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
                    if (arrayList != null && (i16 = photoViewer.c2) != 3 && i16 != 1 && ((cv0Var = photoViewer.d) == null || !cv0Var.O())) {
                        photoViewer.R1();
                    }
                    org.telegram.ui.Components.t71 t71Var = photoViewer.F2;
                    if (t71Var != null && t71Var.y() && photoViewer.r1 && !photoViewer.g7.isEmpty()) {
                        PhotoViewer.Z(photoViewer, photoViewer.F2.n());
                        PhotoViewer.Y(photoViewer, true);
                    }
                    if (photoViewer.t4) {
                        PhotoViewer.a0(photoViewer, num.intValue());
                    }
                    if (cv0Var2 != null) {
                        cv0Var2.d();
                        break;
                    }
                }
                break;
            case 12:
                PrivacyControlActivity privacyControlActivity = (PrivacyControlActivity) obj5;
                boolean[] zArr = (boolean[]) obj2;
                TLRPC.GlobalPrivacySettings globalPrivacySettings = (TLRPC.GlobalPrivacySettings) obj;
                TL_account.setGlobalPrivacySettings setglobalprivacysettings = (TL_account.setGlobalPrivacySettings) obj3;
                if (((TLRPC.TL_error) obj4) != null) {
                    privacyControlActivity.B0();
                    break;
                } else {
                    privacyControlActivity.getClass();
                    zArr[1] = true;
                    if (globalPrivacySettings != null) {
                        TLRPC.GlobalPrivacySettings globalPrivacySettings2 = setglobalprivacysettings.settings;
                        globalPrivacySettings.new_noncontact_peers_require_premium = globalPrivacySettings2.new_noncontact_peers_require_premium;
                        int i20 = globalPrivacySettings2.flags;
                        globalPrivacySettings.flags = i20;
                        globalPrivacySettings.disallowed_stargifts = globalPrivacySettings2.disallowed_stargifts;
                        long j3 = globalPrivacySettings2.noncontact_peers_paid_stars;
                        if (j3 > 0) {
                            globalPrivacySettings.flags = i20 | 32;
                            globalPrivacySettings.noncontact_peers_paid_stars = j3;
                        } else {
                            globalPrivacySettings.flags = i20 & (-33);
                            globalPrivacySettings.noncontact_peers_paid_stars = 0L;
                        }
                    }
                    if (zArr[0]) {
                        privacyControlActivity.x0();
                    }
                    privacyControlActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.privacyRulesUpdated, new Object[0]);
                    break;
                }
            case 13:
                TLRPC.UserFull userFull = (TLRPC.UserFull) obj;
                TL_account.TL_birthday tL_birthday = (TL_account.TL_birthday) obj3;
                TLRPC.TL_error tL_error9 = (TLRPC.TL_error) obj4;
                PrivacyControlActivity privacyControlActivity2 = ((ay0) obj5).d;
                if (((TLObject) obj2) instanceof TLRPC.TL_boolTrue) {
                    org.telegram.ui.Components.pc Q = org.telegram.ui.Components.wc.a0(privacyControlActivity2).Q(R.raw.contact_check, 36, LocaleController.getString(R.string.PrivacyBirthdaySetDone));
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
                        privacyControlActivity2.getMessagesStorage().updateUserInfo(userFull, false);
                    }
                    if (tL_error9 != null && (str = tL_error9.text) != null && str.startsWith("FLOOD_WAIT_")) {
                        if (privacyControlActivity2.getParentActivity() != null) {
                            Activity parentActivity = privacyControlActivity2.getParentActivity();
                            f6Var = ((org.telegram.ui.ActionBar.p2) privacyControlActivity2).resourceProvider;
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(parentActivity, 0, f6Var);
                            String string = LocaleController.getString(R.string.PrivacyBirthdayTooOftenTitle);
                            org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
                            d2Var.R = string;
                            d2Var.T = LocaleController.getString(R.string.PrivacyBirthdayTooOftenMessage);
                            alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                            privacyControlActivity2.showDialog(d2Var);
                            break;
                        }
                    } else {
                        org.telegram.messenger.a2.o(R.string.UnknownError, org.telegram.ui.Components.wc.a0(privacyControlActivity2), R.raw.error, 36);
                        break;
                    }
                }
                break;
            case 14:
                ProfileActivity profileActivity = (ProfileActivity) obj5;
                TLRPC.ChatParticipant chatParticipant = (TLRPC.ChatParticipant) obj2;
                TLRPC.User user = (TLRPC.User) obj;
                org.telegram.messenger.vk vkVar = (org.telegram.messenger.vk) obj3;
                if (!(((TLRPC.ChannelParticipant) obj4) instanceof TLRPC.TL_channelParticipantAdmin) && !(chatParticipant instanceof TLRPC.TL_chatParticipantAdmin)) {
                    vkVar.run(1);
                    break;
                } else {
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(profileActivity.getParentActivity(), 0, profileActivity.z0);
                    String string2 = LocaleController.getString(R.string.AppName);
                    org.telegram.ui.ActionBar.d2 d2Var2 = alertDialog$Builder2.a;
                    d2Var2.R = string2;
                    d2Var2.T = LocaleController.formatString(R.string.AdminWillBeRemoved, ContactsController.formatName(user.first_name, user.last_name));
                    alertDialog$Builder2.k(LocaleController.getString(R.string.OK), new ul0(vkVar, 11));
                    alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                    profileActivity.showDialog(d2Var2);
                    break;
                }
            case 15:
                ProfileActivity profileActivity2 = (ProfileActivity) obj5;
                TLObject tLObject7 = (TLObject) obj2;
                TLRPC.TL_username tL_username = (TLRPC.TL_username) obj;
                c01 c01Var = (c01) obj3;
                TLRPC.TL_error tL_error10 = (TLRPC.TL_error) obj4;
                if (tLObject7 instanceof TL_fragment.TL_collectibleInfo) {
                    TL_fragment.TL_collectibleInfo tL_collectibleInfo = (TL_fragment.TL_collectibleInfo) tLObject7;
                    if (profileActivity2.e1 != 0) {
                        profileActivity2.getMessagesController().getUser(Long.valueOf(profileActivity2.e1));
                    } else {
                        profileActivity2.getMessagesController().getChat(Long.valueOf(profileActivity2.f1));
                    }
                    String str6 = "@" + tL_username.username;
                    String format = LocaleController.getInstance().getFormatterBoostExpired().format(new Date(tL_collectibleInfo.purchase_date * 1000));
                    String formatCurrency = BillingController.getInstance().formatCurrency(tL_collectibleInfo.crypto_amount, tL_collectibleInfo.crypto_currency);
                    String formatCurrency2 = BillingController.getInstance().formatCurrency(tL_collectibleInfo.amount, tL_collectibleInfo.currency);
                    org.telegram.ui.Components.pc w10 = new org.telegram.ui.Components.wc(c01Var.w, profileActivity2.z0).w(R.drawable.filled_username, AndroidUtilities.withLearnMore(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.FragmentChannelUsername, str6, format, formatCurrency, TextUtils.isEmpty(formatCurrency2) ? "" : a4.a.p("(", formatCurrency2, ")"))), new ey0(5, profileActivity2, tL_collectibleInfo)));
                    ow owVar = new ow(26, profileActivity2, tL_collectibleInfo);
                    org.telegram.ui.Components.tb tbVar = w10.e;
                    if (tbVar != null) {
                        tbVar.setOnClickListener(owVar);
                    }
                    w10.k(false);
                    break;
                } else {
                    org.telegram.ui.Components.wc.b0(tL_error10);
                    break;
                }
            case 16:
                ProfileActivity profileActivity3 = (ProfileActivity) obj5;
                TLObject tLObject8 = (TLObject) obj2;
                String str7 = (String) obj3;
                TLRPC.User user2 = (TLRPC.User) obj;
                TLRPC.TL_error tL_error11 = (TLRPC.TL_error) obj4;
                if (tLObject8 instanceof TL_fragment.TL_collectibleInfo) {
                    j20.a(profileActivity3.getParentActivity(), 1, str7, user2, (TL_fragment.TL_collectibleInfo) tLObject8, profileActivity3.z0);
                    break;
                } else {
                    org.telegram.ui.Components.wc.b0(tL_error11);
                    break;
                }
            case 17:
                ProfileActivity.X((ProfileActivity) obj5, (TLObject) obj2, (TLRPC.UserFull) obj, (TL_account.TL_birthday) obj3, (TLRPC.TL_error) obj4);
                break;
            case 18:
                p11 p11Var = (p11) obj5;
                ArrayList arrayList2 = (ArrayList) obj4;
                ArrayList arrayList3 = (ArrayList) obj2;
                ArrayList arrayList4 = (ArrayList) obj;
                org.telegram.ui.ActionBar.p2 p2Var = p11Var.e;
                if (((String) obj3).equals(p11Var.y)) {
                    if (!p11Var.w && (p2Var instanceof ProfileActivity)) {
                        try {
                            ((ProfileActivity) p2Var).P.b.getImageReceiver().startAnimation();
                            ((ProfileActivity) p2Var).P.d.setText(LocaleController.getString(R.string.SettingsNoResults));
                        } catch (Exception e) {
                            FileLog.e(e);
                        }
                    }
                    p11Var.w = true;
                    p11Var.r = arrayList2;
                    p11Var.s = arrayList3;
                    p11Var.n = arrayList4;
                    p11Var.l();
                    if (p2Var instanceof ProfileActivity) {
                        try {
                            ((ProfileActivity) p2Var).P.b.getImageReceiver().startAnimation();
                            break;
                        } catch (Exception e7) {
                            FileLog.e(e7);
                            return;
                        }
                    }
                }
                break;
            case 19:
                l71 l71Var = (l71) obj5;
                l71Var.getClass();
                l71Var.p((View) obj4, Long.valueOf(((org.telegram.ui.Components.y5) obj2).documentId), (TLRPC.Document) obj, ((u61) obj3).v, null);
                break;
            case 20:
                v71 v71Var = (v71) obj5;
                TLRPC.TL_error tL_error12 = (TLRPC.TL_error) obj4;
                TLObject tLObject9 = (TLObject) obj2;
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) obj;
                TLRPC.User user3 = (TLRPC.User) obj3;
                v71Var.getClass();
                if (tL_error12 == null) {
                    TL_account.Password password = (TL_account.Password) tLObject9;
                    twoStepVerificationActivity.I = password;
                    TwoStepVerificationActivity.m0(password);
                    v71Var.T(user3, twoStepVerificationActivity.l0(), twoStepVerificationActivity);
                    break;
                }
                break;
            case 21:
                TLRPC.TL_error tL_error13 = (TLRPC.TL_error) obj4;
                Utilities.Callback callback = (Utilities.Callback) obj5;
                TLObject tLObject10 = (TLObject) obj2;
                MessagesController messagesController = (MessagesController) obj;
                Utilities.Callback callback2 = (Utilities.Callback) obj3;
                if (tL_error13 != null) {
                    callback.run(tL_error13);
                    break;
                } else if (tLObject10 instanceof TL_stories.TL_premium_myBoosts) {
                    TL_stories.TL_premium_myBoosts tL_premium_myBoosts = (TL_stories.TL_premium_myBoosts) tLObject10;
                    messagesController.putUsers(tL_premium_myBoosts.users, false);
                    messagesController.putChats(tL_premium_myBoosts.chats, false);
                    callback2.run(tL_premium_myBoosts);
                    break;
                }
                break;
            case 22:
                TLRPC.TL_error tL_error14 = (TLRPC.TL_error) obj4;
                org.telegram.messenger.v vVar = (org.telegram.messenger.v) obj5;
                TLObject tLObject11 = (TLObject) obj2;
                MessagesController messagesController2 = (MessagesController) obj;
                org.telegram.messenger.k2 k2Var = (org.telegram.messenger.k2) obj3;
                if (tL_error14 != null) {
                    vVar.run(tL_error14);
                    break;
                } else if (tLObject11 instanceof TL_stories.TL_premium_myBoosts) {
                    TL_stories.TL_premium_myBoosts tL_premium_myBoosts2 = (TL_stories.TL_premium_myBoosts) tLObject11;
                    messagesController2.putUsers(tL_premium_myBoosts2.users, false);
                    messagesController2.putChats(tL_premium_myBoosts2.chats, false);
                    k2Var.run(tL_premium_myBoosts2);
                    break;
                }
                break;
            case 23:
                TLObject tLObject12 = (TLObject) obj2;
                MessagesController messagesController3 = (MessagesController) obj5;
                gg.u1 u1Var = (gg.u1) obj;
                sg.f fVar = (sg.f) obj3;
                TLRPC.TL_error tL_error15 = (TLRPC.TL_error) obj4;
                if (tLObject12 instanceof TLRPC.TL_payments_checkedGiftCode) {
                    TLRPC.TL_payments_checkedGiftCode tL_payments_checkedGiftCode = (TLRPC.TL_payments_checkedGiftCode) tLObject12;
                    messagesController3.putChats(tL_payments_checkedGiftCode.chats, false);
                    messagesController3.putUsers(tL_payments_checkedGiftCode.users, false);
                    u1Var.run(tL_payments_checkedGiftCode);
                }
                fVar.run(tL_error15);
                break;
            case 24:
                sg.p1.R((sg.p1) obj5, (TLObject) obj2, (TLRPC.UserFull) obj, (TL_account.TL_birthday) obj3, (TLRPC.TL_error) obj4);
                break;
            case 25:
                wh.y4 y4Var = (wh.y4) obj5;
                TLRPC.TL_inputStorePaymentGiftPremium tL_inputStorePaymentGiftPremium = (TLRPC.TL_inputStorePaymentGiftPremium) obj;
                TLRPC.TL_error tL_error16 = (TLRPC.TL_error) obj4;
                TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore = (TLRPC.TL_payments_canPurchaseStore) obj3;
                int i21 = y4Var.Y;
                org.telegram.ui.ActionBar.p2 p2Var2 = y4Var.n;
                if (((TLObject) obj2) instanceof TLRPC.TL_boolTrue) {
                    BillingController billingController = BillingController.getInstance();
                    Activity parentActivity2 = p2Var2.getParentActivity();
                    AccountInstance accountInstance = AccountInstance.getInstance(i21);
                    n4.y yVar = new n4.y(7, z10);
                    yVar.z(y4Var.e0.h);
                    billingController.launchBillingFlow(parentActivity2, accountInstance, tL_inputStorePaymentGiftPremium, Collections.singletonList(yVar.d()));
                    break;
                } else if (tL_error16 != null) {
                    org.telegram.ui.Components.d5.f0(i21, tL_error16, p2Var2, tL_payments_canPurchaseStore, new Object[0]);
                    break;
                }
                break;
            case 26:
                xh.a0 a0Var = (xh.a0) obj5;
                nf.e eVar = (nf.e) obj2;
                org.telegram.ui.ActionBar.d2 d2Var3 = (org.telegram.ui.ActionBar.d2) obj;
                TLRPC.Updates updates = (TLRPC.Updates) obj3;
                TLRPC.TL_error tL_error17 = (TLRPC.TL_error) obj4;
                xh.b1 b1Var = a0Var.q0;
                if (b1Var != null) {
                    b1Var.run();
                }
                eVar.c(false);
                d2Var3.dismiss();
                a0Var.dismiss();
                org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
                if (U != null) {
                    if (updates != null) {
                        org.telegram.ui.Components.pc M = org.telegram.ui.Components.wc.a0(U).M(LocaleController.getString(R.string.GiftOfferSentTitle), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftOfferSentText, a0Var.Z, DialogObject.getShortName(a0Var.a0))), R.raw.forward);
                        M.t = true;
                        M.j();
                        break;
                    } else {
                        org.telegram.ui.Components.wc.a0(U).d0(tL_error17, false);
                        break;
                    }
                }
                break;
            case 27:
                xh.v5 v5Var = (xh.v5) obj5;
                TLRPC.TL_error tL_error18 = (TLRPC.TL_error) obj4;
                bi.k6 k6Var = (bi.k6) obj;
                TLObject tLObject13 = (TLObject) obj2;
                TLRPC.TL_inputInvoiceStars tL_inputInvoiceStars = (TLRPC.TL_inputInvoiceStars) obj3;
                if (tL_error18 != null) {
                    k6Var.run(Boolean.FALSE, tL_error18.text);
                    break;
                } else {
                    if (tLObject13 instanceof TLRPC.PaymentForm) {
                        TLRPC.PaymentForm paymentForm3 = (TLRPC.PaymentForm) tLObject13;
                        paymentForm3.invoice.recurring = true;
                        MessagesController.getInstance(v5Var.a).putUsers(paymentForm3.users, false);
                        wo0Var2 = new wo0(paymentForm3, tL_inputInvoiceStars, null);
                    } else if (tLObject13 instanceof TLRPC.PaymentReceipt) {
                        wo0Var2 = new wo0((TLRPC.PaymentReceipt) tLObject13);
                    }
                    if (wo0Var2 == null) {
                        k6Var.run(Boolean.FALSE, "UNKNOWN_RESPONSE");
                        break;
                    } else {
                        wo0Var2.Z0 = new th.e(k6Var, 15);
                        org.telegram.ui.ActionBar.p2 R = LaunchActivity.R();
                        if (R != null) {
                            if (AndroidUtilities.hasDialogOnTop(R)) {
                                org.telegram.ui.ActionBar.n2 n2Var = new org.telegram.ui.ActionBar.n2();
                                n2Var.a = true;
                                R.showAsSheet(wo0Var2, n2Var);
                                break;
                            } else {
                                R.presentFragment(wo0Var2);
                                break;
                            }
                        }
                    }
                }
                break;
            case 28:
                xh.v5 v5Var2 = (xh.v5) obj5;
                TLRPC.TL_error tL_error19 = (TLRPC.TL_error) obj4;
                org.telegram.ui.Components.n80 n80Var = (org.telegram.ui.Components.n80) obj;
                TLObject tLObject14 = (TLObject) obj2;
                TLRPC.TL_inputInvoiceStars tL_inputInvoiceStars2 = (TLRPC.TL_inputInvoiceStars) obj3;
                if (tL_error19 != null) {
                    n80Var.run(Boolean.FALSE, tL_error19.text);
                    break;
                } else {
                    if (tLObject14 instanceof TLRPC.PaymentForm) {
                        TLRPC.PaymentForm paymentForm4 = (TLRPC.PaymentForm) tLObject14;
                        paymentForm4.invoice.recurring = true;
                        MessagesController.getInstance(v5Var2.a).putUsers(paymentForm4.users, false);
                        wo0Var2 = new wo0(paymentForm4, tL_inputInvoiceStars2, null);
                    } else if (tLObject14 instanceof TLRPC.PaymentReceipt) {
                        wo0Var2 = new wo0((TLRPC.PaymentReceipt) tLObject14);
                    }
                    if (wo0Var2 == null) {
                        n80Var.run(Boolean.FALSE, "UNKNOWN_RESPONSE");
                        break;
                    } else {
                        wo0Var2.Z0 = new th.e(n80Var, 16);
                        org.telegram.ui.ActionBar.p2 R2 = LaunchActivity.R();
                        if (R2 != null) {
                            if (AndroidUtilities.hasDialogOnTop(R2)) {
                                org.telegram.ui.ActionBar.n2 n2Var2 = new org.telegram.ui.ActionBar.n2();
                                n2Var2.a = true;
                                R2.showAsSheet(wo0Var2, n2Var2);
                                break;
                            } else {
                                R2.presentFragment(wo0Var2);
                                break;
                            }
                        }
                    }
                }
                break;
            default:
                ((boolean[]) obj4)[0] = true;
                ((xh.v5) obj5).Z((String) obj3, (TLRPC.ChatInvite) obj2, new gi.a((Utilities.Callback2) obj, 25));
                break;
        }
    }

    public /* synthetic */ ac0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i10) {
        this.a = i10;
        this.d = obj;
        this.b = obj2;
        this.e = obj3;
        this.f = obj4;
        this.c = obj5;
    }

    public /* synthetic */ ac0(Object obj, Object obj2, Object obj3, Object obj4, TLRPC.TL_error tL_error, int i10) {
        this.a = i10;
        this.d = obj;
        this.e = obj2;
        this.f = obj3;
        this.c = obj4;
        this.b = tL_error;
    }

    public /* synthetic */ ac0(Object obj, Object obj2, String str, Object obj3, Object obj4, int i10) {
        this.a = i10;
        this.d = obj;
        this.b = obj2;
        this.c = str;
        this.e = obj3;
        this.f = obj4;
    }

    public /* synthetic */ ac0(Object obj, TLRPC.TL_error tL_error, Object obj2, TLObject tLObject, TLObject tLObject2, int i10) {
        this.a = i10;
        this.d = obj;
        this.b = tL_error;
        this.f = obj2;
        this.e = tLObject;
        this.c = tLObject2;
    }

    public /* synthetic */ ac0(TLObject tLObject, MessagesController messagesController, gg.u1 u1Var, sg.f fVar, TLRPC.TL_error tL_error) {
        this.a = 23;
        this.e = tLObject;
        this.d = messagesController;
        this.f = u1Var;
        this.c = fVar;
        this.b = tL_error;
    }

    public /* synthetic */ ac0(TLRPC.TL_error tL_error, Utilities.Callback callback, TLObject tLObject, MessagesController messagesController, Utilities.Callback callback2, int i10) {
        this.a = i10;
        this.b = tL_error;
        this.d = callback;
        this.e = tLObject;
        this.f = messagesController;
        this.c = callback2;
    }

    public /* synthetic */ ac0(org.telegram.ui.ActionBar.p2 p2Var, TLRPC.TL_error tL_error, Object obj, String str, TLObject tLObject, int i10) {
        this.a = i10;
        this.d = p2Var;
        this.b = tL_error;
        this.e = obj;
        this.c = str;
        this.f = tLObject;
    }

    public /* synthetic */ ac0(p11 p11Var, String str, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3) {
        this.a = 18;
        this.d = p11Var;
        this.c = str;
        this.b = arrayList;
        this.e = arrayList2;
        this.f = arrayList3;
    }

    public /* synthetic */ ac0(ProfileActivity profileActivity, TLObject tLObject, String str, TLRPC.User user, TLRPC.TL_error tL_error) {
        this.a = 16;
        this.d = profileActivity;
        this.e = tLObject;
        this.c = str;
        this.f = user;
        this.b = tL_error;
    }
}
