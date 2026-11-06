package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import android.telephony.TelephonyManager;
import android.text.InputFilter;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.method.PasswordTransformationMethod;
import android.util.Property;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.CookieManager;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;
import j$.util.Objects;
import j$.util.Optional;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class hl0 extends org.telegram.ui.ActionBar.f2 implements org.telegram.messenger.ls {
    public static final List g1 = Arrays.asList("http", "https");
    public static final List h1 = Collections.singletonList("tg");
    public ms A0;
    public String B0;
    public TLRPC.PaymentForm C0;
    public boolean D;
    public final TLRPC.PaymentReceipt D0;
    public ScrollView E;
    public TLRPC.TL_payments_validatedRequestedInfo E0;
    public boolean F;
    public TLRPC.TL_paymentFormMethod F0;
    public boolean G;
    public TLRPC.TL_shippingOption G0;
    public TextView H;
    public Long H0;
    public final org.telegram.ui.Cells.n4[] I;
    public TLRPC.TL_payments_validateRequestedInfo I0;
    public final ArrayList J;
    public TLRPC.TL_inputPaymentCredentialsGooglePay J0;
    public final org.telegram.ui.Cells.y6[] K;
    public String K0;
    public org.telegram.ui.Cells.r8 L;
    public String L0;
    public final org.telegram.ui.Cells.z8[] M;
    public JSONObject M0;
    public final org.telegram.ui.Cells.w9[] N;
    public org.telegram.messenger.ij N0;
    public FrameLayout O;
    public String O0;
    public FrameLayout P;
    public boolean P0;
    public LinearLayout Q;
    public boolean Q0;
    public org.telegram.ui.Cells.a9 R;
    public String[] R0;
    public org.telegram.ui.Cells.l3 S;
    public boolean S0;
    public fl0 T;
    public boolean T0;
    public TextView U;
    public boolean U0;
    public org.telegram.ui.Cells.n6 V;
    public boolean V0;
    public dl0 W;
    public boolean W0;
    public org.telegram.ui.Cells.j5 X;
    public boolean X0;
    public final org.telegram.ui.Cells.y8[] Y;
    public org.telegram.ui.ActionBar.f6 Y0;
    public float Z;
    public gl0 Z0;
    public final ArrayList a;
    public TL_account.Password a0;
    public boolean a1;
    public final HashMap b;
    public boolean b0;
    public TLRPC.InputInvoice b1;
    public final HashMap c;
    public int c0;
    public org.telegram.messenger.c20 c1;
    public final HashMap d;
    public ik0 d0;
    public org.telegram.messenger.c20 d1;
    public b9.j0 e;
    public boolean e0;
    public j00 e1;
    public EditTextBoldCursor[] f;
    public hl0 f0;
    public int f1;
    public boolean g0;
    public org.telegram.ui.Cells.i6[] h;
    public boolean h0;
    public boolean i0;
    public String j0;
    public boolean k0;
    public TLRPC.User l0;
    public boolean m0;
    public org.telegram.ui.ActionBar.r0 n;
    public boolean n0;
    public boolean o0;
    public String p0;
    public String q0;
    public org.telegram.ui.Components.zp r;
    public org.telegram.ui.ActionBar.f2 r0;
    public org.telegram.ui.Components.zp s;
    public nk0 s0;
    public ArrayList t0;
    public int u0;
    public boolean v0;
    public AnimatorSet w;
    public String w0;
    public WebView x;
    public String x0;
    public String y;
    public TLRPC.TL_paymentSavedCredentialsCard y0;
    public boolean z0;

    public hl0(TLRPC.InputInvoice inputInvoice, TLRPC.PaymentForm paymentForm, org.telegram.messenger.ij ijVar, String str, int i7, TLRPC.TL_payments_validatedRequestedInfo tL_payments_validatedRequestedInfo, TLRPC.TL_shippingOption tL_shippingOption, Long l10, String str2, String str3, TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo, boolean z9, TLRPC.TL_inputPaymentCredentialsGooglePay tL_inputPaymentCredentialsGooglePay, org.telegram.ui.ActionBar.f2 f2Var, boolean z10) {
        super(null);
        this.a = new ArrayList();
        this.b = new HashMap();
        this.c = new HashMap();
        this.d = new HashMap();
        this.G = true;
        this.I = new org.telegram.ui.Cells.n4[3];
        this.J = new ArrayList();
        this.K = new org.telegram.ui.Cells.y6[3];
        this.M = new org.telegram.ui.Cells.z8[3];
        this.N = new org.telegram.ui.Cells.w9[2];
        this.Y = new org.telegram.ui.Cells.y8[7];
        this.Z = -4.5f;
        this.c0 = 6;
        A0(inputInvoice, paymentForm, ijVar, str, i7, tL_payments_validatedRequestedInfo, tL_shippingOption, l10, str2, str3, tL_payments_validateRequestedInfo, z9, tL_inputPaymentCredentialsGooglePay, f2Var, z10);
    }

    public static /* synthetic */ void Z(hl0 hl0Var, TL_account.Password password, byte[] bArr) {
        TLRPC.PasswordKdfAlgo passwordKdfAlgo = password.current_algo;
        byte[] c10 = passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow ? org.telegram.messenger.pv.c(bArr, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo) : null;
        TL_account.getTmpPassword gettmppassword = new TL_account.getTmpPassword();
        gettmppassword.period = 1800;
        h50 h50Var = new h50(17, hl0Var, gettmppassword);
        TLRPC.PasswordKdfAlgo passwordKdfAlgo2 = password.current_algo;
        if (!(passwordKdfAlgo2 instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow)) {
            TLRPC.TL_error tL_error = new TLRPC.TL_error();
            tL_error.text = "PASSWORD_HASH_INVALID";
            h50Var.run(null, tL_error);
            return;
        }
        TLRPC.TL_inputCheckPasswordSRP d = org.telegram.messenger.pv.d(c10, password.srp_id, password.srp_B, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo2);
        gettmppassword.password = d;
        if (d != null) {
            ConnectionsManager.getInstance(hl0Var.currentAccount).sendRequest(gettmppassword, h50Var, 10);
            return;
        }
        TLRPC.TL_error tL_error2 = new TLRPC.TL_error();
        tL_error2.text = "ALGO_INVALID";
        h50Var.run(null, tL_error2);
    }

    public static /* synthetic */ void a0(hl0 hl0Var, TLRPC.TL_error tL_error, TLObject tLObject) {
        hl0Var.J0(false);
        hl0Var.N0(true, false);
        if (tL_error != null) {
            String str = tL_error.text;
            str.getClass();
            switch (str) {
                case "ADDRESS_CITY_INVALID":
                    hl0Var.K0(2);
                    break;
                case "ADDRESS_STREET_LINE1_INVALID":
                    hl0Var.K0(0);
                    break;
                case "ADDRESS_COUNTRY_INVALID":
                    hl0Var.K0(4);
                    break;
                case "REQ_INFO_NAME_INVALID":
                    hl0Var.K0(6);
                    break;
                case "ADDRESS_POSTCODE_INVALID":
                    hl0Var.K0(5);
                    break;
                case "ADDRESS_STATE_INVALID":
                    hl0Var.K0(3);
                    break;
                case "REQ_INFO_PHONE_INVALID":
                    hl0Var.K0(9);
                    break;
                case "ADDRESS_STREET_LINE2_INVALID":
                    hl0Var.K0(1);
                    break;
                case "REQ_INFO_EMAIL_INVALID":
                    hl0Var.K0(7);
                    break;
                default:
                    org.telegram.ui.Components.v4.c0(hl0Var.currentAccount, tL_error, hl0Var, tLObject, new Object[0]);
                    break;
            }
        }
    }

    public static /* synthetic */ void b0(hl0 hl0Var, TLRPC.TL_payments_validatedRequestedInfo tL_payments_validatedRequestedInfo) {
        hl0Var.E0 = tL_payments_validatedRequestedInfo;
        if (hl0Var.C0.saved_info != null && !hl0Var.T0) {
            TLRPC.TL_payments_clearSavedInfo tL_payments_clearSavedInfo = new TLRPC.TL_payments_clearSavedInfo();
            tL_payments_clearSavedInfo.info = true;
            ConnectionsManager.getInstance(hl0Var.currentAccount).sendRequest(tL_payments_clearSavedInfo, new di.u5(26), hl0Var.W0 ? 8 : 0);
        }
        hl0Var.z0();
        hl0Var.J0(false);
        hl0Var.N0(true, false);
    }

    public static /* synthetic */ void c0(hl0 hl0Var, TLRPC.TL_error tL_error, TLObject tLObject) {
        hl0Var.J0(false);
        hl0Var.N0(true, false);
        if (tL_error != null) {
            org.telegram.ui.Components.v4.c0(hl0Var.currentAccount, tL_error, hl0Var, tLObject, new Object[0]);
        }
    }

    public static /* synthetic */ void d0(hl0 hl0Var, org.telegram.ui.Components.cc ccVar, boolean z9, TLRPC.Message message) {
        ccVar.b();
        if (!z9) {
            TLRPC.TL_payments_getPaymentReceipt tL_payments_getPaymentReceipt = new TLRPC.TL_payments_getPaymentReceipt();
            tL_payments_getPaymentReceipt.msg_id = message.id;
            tL_payments_getPaymentReceipt.peer = org.telegram.messenger.qp.s1(hl0Var.currentAccount).m1(message.peer_id);
            ConnectionsManager.getInstance(hl0Var.currentAccount).sendRequest(tL_payments_getPaymentReceipt, new ck0(hl0Var, 0), 2);
            return;
        }
        org.telegram.ui.ActionBar.f2 T = LaunchActivity.T();
        if (T != null) {
            T.presentFragment(an.qa(message.id, org.telegram.messenger.ij.B0(message)));
        }
    }

    public static void e0(hl0 hl0Var) {
        ConnectionsManager.getInstance(hl0Var.currentAccount).sendRequest(new TL_account.resendPasswordEmail(), new di.u5(26), hl0Var.W0 ? 8 : 0);
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(hl0Var.getParentActivity());
        String M0 = org.telegram.messenger.hd.M0(2131746121, null);
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
        u1Var.T = M0;
        u1Var.R = org.telegram.messenger.hd.M0(R.string.AppName, null);
        alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131747830, null), null);
        hl0Var.showDialog(u1Var);
    }

    public static /* synthetic */ void f0(hl0 hl0Var, boolean z9, String str, String str2, TL_account.updatePasswordSettings updatepasswordsettings) {
        bi.u9 u9Var = new bi.u9(hl0Var, z9, str, 8);
        if (z9) {
            ConnectionsManager.getInstance(hl0Var.currentAccount).sendRequest(updatepasswordsettings, u9Var, 10);
            return;
        }
        byte[] h12 = org.telegram.messenger.g0.h1(str2);
        TLRPC.PasswordKdfAlgo passwordKdfAlgo = hl0Var.a0.new_algo;
        if (!(passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow)) {
            TLRPC.TL_error tL_error = new TLRPC.TL_error();
            tL_error.text = "PASSWORD_HASH_INVALID";
            u9Var.run(null, tL_error);
            return;
        }
        updatepasswordsettings.new_settings.new_password_hash = org.telegram.messenger.pv.b(h12, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
        if (updatepasswordsettings.new_settings.new_password_hash == null) {
            TLRPC.TL_error tL_error2 = new TLRPC.TL_error();
            tL_error2.text = "ALGO_INVALID";
            u9Var.run(null, tL_error2);
        }
        ConnectionsManager.getInstance(hl0Var.currentAccount).sendRequest(updatepasswordsettings, u9Var, 10);
    }

    public static /* synthetic */ void g0(hl0 hl0Var, TLRPC.TL_error tL_error, TLRPC.TL_payments_sendPaymentForm tL_payments_sendPaymentForm) {
        org.telegram.ui.Components.v4.c0(hl0Var.currentAccount, tL_error, hl0Var, tL_payments_sendPaymentForm, new Object[0]);
        hl0Var.J0(false);
        hl0Var.N0(false, false);
        hl0Var.a1 = true;
        hl0Var.f1 = 4;
        gl0 gl0Var = hl0Var.Z0;
        if (gl0Var != null) {
            gl0Var.b(4);
        }
    }

    public static void h0(hl0 hl0Var, TLObject tLObject) {
        org.telegram.ui.ActionBar.f2 Q;
        if (tLObject instanceof TLRPC.TL_payments_paymentReceiptStars) {
            bi.dd.m1(hl0Var.getParentActivity(), hl0Var.currentAccount, (TLRPC.TL_payments_paymentReceiptStars) tLObject, hl0Var.Y0);
            return;
        }
        if (!(tLObject instanceof TLRPC.PaymentReceipt) || (Q = LaunchActivity.Q()) == null) {
            return;
        }
        org.telegram.ui.ActionBar.d2 d2Var = new org.telegram.ui.ActionBar.d2();
        d2Var.a = true;
        hl0 hl0Var2 = new hl0((TLRPC.PaymentReceipt) tLObject);
        hl0Var2.c1 = hl0Var.c1;
        hl0Var2.d1 = hl0Var.d1;
        Q.showAsSheet(hl0Var2, d2Var);
    }

    public static void i0(hl0 hl0Var, TLObject tLObject, TLRPC.TL_error tL_error, TL_account.getTmpPassword gettmppassword) {
        hl0Var.N0(true, false);
        hl0Var.J0(false);
        if (tLObject != null) {
            hl0Var.v0 = true;
            org.telegram.messenger.p10.i(hl0Var.currentAccount).y = (TL_account.tmpPassword) tLObject;
            org.telegram.messenger.p10.i(hl0Var.currentAccount).v(false);
            hl0Var.z0();
            return;
        }
        if (!tL_error.text.equals("PASSWORD_HASH_INVALID")) {
            org.telegram.ui.Components.v4.c0(hl0Var.currentAccount, tL_error, hl0Var, gettmppassword, new Object[0]);
            return;
        }
        try {
            hl0Var.f[1].performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        org.telegram.messenger.g0.G3(3.25f, hl0Var.f[1], null);
        hl0Var.f[1].setText("");
    }

    public static void j0(hl0 hl0Var, TLObject tLObject) {
        org.telegram.ui.ActionBar.f2 Q;
        if (tLObject instanceof TLRPC.TL_payments_paymentReceiptStars) {
            bi.dd.m1(hl0Var.getParentActivity(), hl0Var.currentAccount, (TLRPC.TL_payments_paymentReceiptStars) tLObject, hl0Var.Y0);
            return;
        }
        if (!(tLObject instanceof TLRPC.PaymentReceipt) || (Q = LaunchActivity.Q()) == null) {
            return;
        }
        org.telegram.ui.ActionBar.d2 d2Var = new org.telegram.ui.ActionBar.d2();
        d2Var.a = true;
        hl0 hl0Var2 = new hl0((TLRPC.PaymentReceipt) tLObject);
        hl0Var2.c1 = hl0Var.c1;
        hl0Var2.d1 = hl0Var.d1;
        Q.showAsSheet(hl0Var2, d2Var);
    }

    public static void k0(hl0 hl0Var, TLRPC.TL_error tL_error, TLObject tLObject, String str, TL_account.getPassword getpassword) {
        if (tL_error != null) {
            org.telegram.ui.Components.v4.c0(hl0Var.currentAccount, tL_error, hl0Var, getpassword, new Object[0]);
            hl0Var.N0(true, false);
            hl0Var.J0(false);
            return;
        }
        TL_account.Password password = (TL_account.Password) tLObject;
        if (!TwoStepVerificationActivity.n0(password, false)) {
            org.telegram.ui.Components.v4.u0(hl0Var.getParentActivity(), org.telegram.messenger.hd.M0(2131743821, null), true);
        } else if (password.has_password) {
            Utilities.e.c(new mc0(hl0Var, password, org.telegram.messenger.g0.h1(str), 16));
        } else {
            hl0Var.v0 = false;
            hl0Var.z0();
        }
    }

    public static /* synthetic */ void l0(hl0 hl0Var, org.telegram.ui.Components.cc ccVar, boolean z9, TLRPC.Message[] messageArr) {
        ccVar.b();
        if (!z9) {
            TLRPC.TL_payments_getPaymentReceipt tL_payments_getPaymentReceipt = new TLRPC.TL_payments_getPaymentReceipt();
            tL_payments_getPaymentReceipt.msg_id = messageArr[0].id;
            tL_payments_getPaymentReceipt.peer = org.telegram.messenger.qp.s1(hl0Var.currentAccount).m1(messageArr[0].peer_id);
            ConnectionsManager.getInstance(hl0Var.currentAccount).sendRequest(tL_payments_getPaymentReceipt, new ck0(hl0Var, 2), 2);
            return;
        }
        org.telegram.ui.ActionBar.f2 T = LaunchActivity.T();
        if (T != null) {
            T.presentFragment(an.qa(messageArr[0].id, org.telegram.messenger.ij.B0(messageArr[0])));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x00cc, code lost:
    
        if (r8.phone_requested == false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x00d8, code lost:
    
        if (r23.J0 == null) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x00e2, code lost:
    
        if (r2.invoice.flexible != false) goto L51;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m0(hl0 hl0Var, String str, View view) {
        int i7;
        org.telegram.ui.Cells.n6 n6Var = hl0Var.V;
        if (n6Var != null && !hl0Var.F) {
            hl0Var.Z = -hl0Var.Z;
            org.telegram.messenger.g0.G3(hl0Var.Z, n6Var.getTextView(), null);
            org.telegram.messenger.g0.G3(hl0Var.Z, hl0Var.V.getCheckBox(), null);
            try {
                hl0Var.V.performHapticFeedback(3, 2);
                return;
            } catch (Exception unused) {
                return;
            }
        }
        boolean z9 = hl0Var.V0;
        int i10 = 1;
        if (z9 && hl0Var.C0.saved_info != null && hl0Var.I0 == null) {
            hl0Var.J0(true);
            zc0 zc0Var = new zc0(23, hl0Var, view);
            if (hl0Var.Q0) {
                return;
            }
            hl0Var.N0(true, true);
            TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo = new TLRPC.TL_payments_validateRequestedInfo();
            hl0Var.I0 = tL_payments_validateRequestedInfo;
            TLRPC.InputInvoice inputInvoice = hl0Var.b1;
            if (inputInvoice != null) {
                tL_payments_validateRequestedInfo.invoice = inputInvoice;
            } else if (hl0Var.N0 != null) {
                TLRPC.TL_inputInvoiceMessage tL_inputInvoiceMessage = new TLRPC.TL_inputInvoiceMessage();
                tL_inputInvoiceMessage.peer = hl0Var.getMessagesController().m1(hl0Var.N0.k.peer_id);
                tL_inputInvoiceMessage.msg_id = hl0Var.N0.f1();
                hl0Var.I0.invoice = tL_inputInvoiceMessage;
            } else {
                TLRPC.TL_inputInvoiceSlug tL_inputInvoiceSlug = new TLRPC.TL_inputInvoiceSlug();
                tL_inputInvoiceSlug.slug = hl0Var.O0;
                hl0Var.I0.invoice = tL_inputInvoiceSlug;
            }
            TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo2 = hl0Var.I0;
            tL_payments_validateRequestedInfo2.save = true;
            tL_payments_validateRequestedInfo2.info = hl0Var.C0.saved_info;
            ConnectionsManager.getInstance(hl0Var.currentAccount).sendRequest(tL_payments_validateRequestedInfo2, new z9(hl0Var, zc0Var, tL_payments_validateRequestedInfo2, 29), (hl0Var.W0 ? 8 : 0) | 2);
            return;
        }
        if (z9) {
            TLRPC.PaymentForm paymentForm = hl0Var.C0;
            TLRPC.TL_paymentRequestedInfo tL_paymentRequestedInfo = paymentForm.saved_info;
            if (tL_paymentRequestedInfo == null) {
                TLRPC.TL_invoice tL_invoice = paymentForm.invoice;
                if (!tL_invoice.shipping_address_requested) {
                    if (!tL_invoice.email_requested) {
                        if (!tL_invoice.name_requested) {
                        }
                    }
                }
                if (tL_paymentRequestedInfo == null) {
                    TLRPC.TL_invoice tL_invoice2 = paymentForm.invoice;
                    if (tL_invoice2.shipping_address_requested || tL_invoice2.email_requested || tL_invoice2.name_requested || tL_invoice2.phone_requested) {
                        i7 = 0;
                        if (i7 != 2 && !paymentForm.additional_methods.isEmpty()) {
                            Objects.requireNonNull(view);
                            hl0Var.M0(new org.telegram.ui.Components.nt(0, view));
                            return;
                        } else {
                            hl0 hl0Var2 = new hl0(hl0Var.b1, hl0Var.C0, hl0Var.N0, hl0Var.O0, i7, hl0Var.E0, hl0Var.G0, hl0Var.H0, hl0Var.w0, hl0Var.x0, hl0Var.I0, hl0Var.U0, null, hl0Var.r0, hl0Var.W0);
                            hl0Var2.c1 = hl0Var.c1;
                            hl0Var2.d1 = hl0Var.d1;
                            hl0Var.presentFragment(hl0Var2);
                            return;
                        }
                    }
                }
                i7 = (hl0Var.y0 == null && hl0Var.w0 == null && hl0Var.J0 == null) ? 2 : 1;
                if (i7 != 2) {
                }
                hl0 hl0Var22 = new hl0(hl0Var.b1, hl0Var.C0, hl0Var.N0, hl0Var.O0, i7, hl0Var.E0, hl0Var.G0, hl0Var.H0, hl0Var.w0, hl0Var.x0, hl0Var.I0, hl0Var.U0, null, hl0Var.r0, hl0Var.W0);
                hl0Var22.c1 = hl0Var.c1;
                hl0Var22.d1 = hl0Var.d1;
                hl0Var.presentFragment(hl0Var22);
                return;
            }
            if (hl0Var.y0 == null) {
                if (hl0Var.w0 == null) {
                }
            }
            if (hl0Var.G0 == null) {
            }
        }
        if (!hl0Var.C0.password_missing && hl0Var.y0 != null) {
            if (org.telegram.messenger.p10.i(hl0Var.currentAccount).y != null && org.telegram.messenger.p10.i(hl0Var.currentAccount).y.valid_until < ConnectionsManager.getInstance(hl0Var.currentAccount).getCurrentTime() + 60) {
                org.telegram.messenger.p10.i(hl0Var.currentAccount).y = null;
                org.telegram.messenger.p10.i(hl0Var.currentAccount).v(false);
            }
            if (org.telegram.messenger.p10.i(hl0Var.currentAccount).y == null) {
                hl0Var.X0 = true;
                hl0 hl0Var3 = new hl0(hl0Var.b1, hl0Var.C0, hl0Var.N0, hl0Var.O0, 3, hl0Var.E0, hl0Var.G0, hl0Var.H0, null, hl0Var.x0, hl0Var.I0, hl0Var.U0, null, hl0Var.r0, hl0Var.W0);
                hl0Var3.c1 = hl0Var.c1;
                hl0Var3.d1 = hl0Var.d1;
                hl0Var.presentFragment(hl0Var3);
                hl0Var.X0 = false;
                return;
            }
            if (hl0Var.V0) {
                hl0Var.V0 = false;
                org.telegram.messenger.qs.f(hl0Var.currentAccount).n(hl0Var, org.telegram.messenger.qs.a1);
            }
        }
        TLRPC.User user = hl0Var.l0;
        if (user == null || user.verified) {
            hl0Var.O0(hl0Var.R0[0]);
            return;
        }
        String str2 = "payment_warning_" + hl0Var.l0.id;
        SharedPreferences sharedPreferences = org.telegram.messenger.qp.s1(hl0Var.currentAccount).d7;
        if (sharedPreferences.getBoolean(str2, false)) {
            hl0Var.O0(hl0Var.R0[0]);
            return;
        }
        sharedPreferences.edit().putBoolean(str2, true).commit();
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(hl0Var.getParentActivity());
        String M0 = org.telegram.messenger.hd.M0(2131747351, null);
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
        u1Var.R = M0;
        u1Var.T = org.telegram.messenger.hd.a0("PaymentWarningText", null, 2131747350, hl0Var.p0, str);
        alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131751771, null), new jk0(hl0Var, i10));
        hl0Var.showDialog(u1Var);
    }

    public static void n0(hl0 hl0Var, TLRPC.TL_error tL_error, boolean z9, TLObject tLObject, String str) {
        if (tL_error != null && "SRP_ID_INVALID".equals(tL_error.text)) {
            ConnectionsManager.getInstance(hl0Var.currentAccount).sendRequest(new TL_account.getPassword(), new fi.d3(9, hl0Var, z9), 8);
            return;
        }
        int i7 = 0;
        hl0Var.N0(true, false);
        if (z9) {
            TL_account.Password password = hl0Var.a0;
            password.has_password = false;
            password.current_algo = null;
            hl0Var.T.a(password);
            hl0Var.finishFragment();
            return;
        }
        if (tL_error == null && (tLObject instanceof TLRPC.TL_boolTrue)) {
            if (hl0Var.getParentActivity() == null) {
                return;
            }
            hl0Var.z0();
            return;
        }
        if (tL_error != null) {
            if (!tL_error.text.equals("EMAIL_UNCONFIRMED") && !tL_error.text.startsWith("EMAIL_UNCONFIRMED_")) {
                if (tL_error.text.equals("EMAIL_INVALID")) {
                    hl0Var.L0(org.telegram.messenger.hd.M0(R.string.AppName, null), org.telegram.messenger.hd.M0(2131747444, null));
                    return;
                } else if (!tL_error.text.startsWith("FLOOD_WAIT")) {
                    hl0Var.L0(org.telegram.messenger.hd.M0(R.string.AppName, null), tL_error.text);
                    return;
                } else {
                    int intValue = Utilities.z(tL_error.text).intValue();
                    hl0Var.L0(org.telegram.messenger.hd.M0(R.string.AppName, null), org.telegram.messenger.hd.a0("FloodWaitTime", null, 2131750687, intValue < 60 ? org.telegram.messenger.hd.G(intValue, "Seconds", new Object[0]) : org.telegram.messenger.hd.G(intValue / 60, "Minutes", new Object[0])));
                    return;
                }
            }
            hl0Var.c0 = Utilities.z(tL_error.text).intValue();
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(hl0Var.getParentActivity());
            alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131747830, null), new lk0(i7, hl0Var, str));
            String M0 = org.telegram.messenger.hd.M0(2131742822, null);
            org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
            u1Var.T = M0;
            u1Var.R = org.telegram.messenger.hd.M0(2131742823, null);
            Dialog showDialog = hl0Var.showDialog(u1Var);
            if (showDialog != null) {
                showDialog.setCanceledOnTouchOutside(false);
                showDialog.setCancelable(false);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:79:0x020a, code lost:
    
        if (r5 == false) goto L95;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0278  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void o0(hl0 hl0Var) {
        Integer num;
        Integer num2;
        int i7;
        boolean z9;
        boolean z10;
        Integer num3;
        boolean z11;
        boolean z12;
        String[] split = hl0Var.f[1].getText().toString().split("/");
        if (split.length == 2) {
            Integer z13 = Utilities.z(split[0]);
            num2 = Utilities.z(split[1]);
            num = z13;
        } else {
            num = null;
            num2 = null;
        }
        uc.a aVar = new uc.a(hl0Var.f[0].getText().toString(), num, num2, hl0Var.f[3].getText().toString(), hl0Var.f[2].getText().toString(), null, null, null, null, hl0Var.f[5].getText().toString(), hl0Var.f[4].getText().toString(), null, null, null, null, null, null);
        hl0Var.x0 = aVar.a() + " *" + aVar.b();
        boolean z14 = num != null && num2 != null && org.telegram.messenger.p10.i(hl0Var.currentAccount).d().startsWith("7") && "smartglocal".equals(hl0Var.C0.native_provider) && (num2.intValue() > 22 || (num2.intValue() == 22 && num.intValue() > 1));
        String str = aVar.a;
        if (c8.qd.d(str)) {
            i7 = 0;
        } else {
            String replaceAll = str.trim().replaceAll("\\s+|-", "");
            if (!c8.qd.d(replaceAll) && replaceAll != null) {
                int i10 = 0;
                while (true) {
                    if (i10 >= replaceAll.length()) {
                        int length = replaceAll.length() - 1;
                        boolean z15 = true;
                        int i11 = 0;
                        while (true) {
                            if (length >= 0) {
                                char charAt = replaceAll.charAt(length);
                                if (!Character.isDigit(charAt)) {
                                    break;
                                }
                                int parseInt = Integer.parseInt("" + charAt);
                                boolean z16 = z15 ^ true;
                                if (!z15) {
                                    parseInt *= 2;
                                }
                                if (parseInt > 9) {
                                    parseInt -= 9;
                                }
                                i11 += parseInt;
                                length--;
                                z15 = z16;
                            } else if (i11 % 10 == 0) {
                                String a10 = aVar.a();
                                if (!"American Express".equals(a10) ? !(!"Diners Club".equals(a10) ? replaceAll.length() != 16 : replaceAll.length() != 14) : replaceAll.length() == 15) {
                                    if (!z14) {
                                        Integer num4 = aVar.c;
                                        if (num4 != null && num4.intValue() >= 1 && num4.intValue() <= 12 && (num3 = aVar.d) != null && c8.nd.a(num3.intValue()) >= qb.a.u4().get(1)) {
                                            if (num4 == null || num4.intValue() < 1 || num4.intValue() > 12 || num3 == null || c8.nd.a(num3.intValue()) < qb.a.u4().get(1)) {
                                                z11 = false;
                                            } else {
                                                int intValue = num3.intValue();
                                                int intValue2 = num4.intValue();
                                                if (c8.nd.a(intValue) >= qb.a.u4().get(1)) {
                                                    Calendar u42 = qb.a.u4();
                                                    if (c8.nd.a(intValue) != u42.get(1) || intValue2 >= u42.get(2) + 1) {
                                                        z12 = false;
                                                        z11 = !z12;
                                                    }
                                                }
                                                z12 = true;
                                                z11 = !z12;
                                            }
                                        }
                                        hl0Var.K0(1);
                                        return;
                                    }
                                    if (hl0Var.i0 && hl0Var.f[2].length() == 0) {
                                        hl0Var.K0(2);
                                        return;
                                    }
                                    String str2 = aVar.b;
                                    if (!c8.qd.d(str2)) {
                                        String trim = str2.trim();
                                        String a11 = aVar.a();
                                        boolean z17 = (a11 == null && trim.length() >= 3 && trim.length() <= 4) || ("American Express".equals(a11) && trim.length() == 4) || trim.length() == 3;
                                        if (trim != null) {
                                            for (int i12 = 0; i12 < trim.length(); i12++) {
                                                if (Character.isDigit(trim.charAt(i12))) {
                                                }
                                            }
                                            z9 = true;
                                            if (z9 && z17) {
                                                z10 = true;
                                                if (!z10) {
                                                    hl0Var.K0(3);
                                                    return;
                                                }
                                                if (hl0Var.g0 && hl0Var.f[4].length() == 0) {
                                                    hl0Var.K0(4);
                                                    return;
                                                }
                                                if (hl0Var.h0 && hl0Var.f[5].length() == 0) {
                                                    hl0Var.K0(5);
                                                    return;
                                                }
                                                hl0Var.N0(true, true);
                                                try {
                                                    if ("stripe".equals(hl0Var.C0.native_provider)) {
                                                        String str3 = hl0Var.j0;
                                                        org.telegram.ui.Components.n nVar = new org.telegram.ui.Components.n(new nb.a(24));
                                                        nb.a.r0(str3);
                                                        f fVar = new f(hl0Var, 28);
                                                        try {
                                                            nb.a.r0(str3);
                                                            new sc.a(nVar, str3, aVar, fVar).execute(new Void[0]);
                                                        } catch (tc.c e10) {
                                                            fVar.Y1(e10);
                                                        }
                                                    } else if ("smartglocal".equals(hl0Var.C0.native_provider)) {
                                                        new zk0(hl0Var, aVar).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, null, null, null);
                                                    }
                                                    return;
                                                } catch (Exception e11) {
                                                    org.telegram.messenger.a8.g(e11, true);
                                                    return;
                                                }
                                            }
                                        }
                                        z9 = false;
                                        if (z9) {
                                            z10 = true;
                                            if (!z10) {
                                            }
                                        }
                                    }
                                    z10 = false;
                                    if (!z10) {
                                    }
                                }
                            }
                        }
                    } else if (!Character.isDigit(replaceAll.charAt(i10))) {
                        break;
                    } else {
                        i10++;
                    }
                }
            }
            i7 = 0;
        }
        hl0Var.K0(i7);
    }

    public static void p0(hl0 hl0Var) {
        if (org.telegram.messenger.p10.i(hl0Var.currentAccount).y != null && org.telegram.messenger.p10.i(hl0Var.currentAccount).y.valid_until < ConnectionsManager.getInstance(hl0Var.currentAccount).getCurrentTime() + 60) {
            org.telegram.messenger.p10.i(hl0Var.currentAccount).y = null;
            org.telegram.messenger.p10.i(hl0Var.currentAccount).v(false);
        }
        if (org.telegram.messenger.p10.i(hl0Var.currentAccount).y != null) {
            hl0Var.F0();
            return;
        }
        if (hl0Var.f[1].length() == 0) {
            try {
                hl0Var.f[1].performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
            org.telegram.messenger.g0.G3(2.5f, hl0Var.f[1], null);
            return;
        }
        String obj = hl0Var.f[1].getText().toString();
        hl0Var.N0(true, true);
        hl0Var.J0(true);
        TL_account.getPassword getpassword = new TL_account.getPassword();
        ConnectionsManager.getInstance(hl0Var.currentAccount).sendRequest(getpassword, new z9(hl0Var, obj, getpassword, 28), (hl0Var.W0 ? 8 : 0) | 2);
    }

    public static void r0(hl0 hl0Var) {
        if (hl0Var.Q0) {
            return;
        }
        hl0Var.N0(true, true);
        TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo = new TLRPC.TL_payments_validateRequestedInfo();
        hl0Var.I0 = tL_payments_validateRequestedInfo;
        TLRPC.InputInvoice inputInvoice = hl0Var.b1;
        if (inputInvoice != null) {
            tL_payments_validateRequestedInfo.invoice = inputInvoice;
        } else if (hl0Var.N0 != null) {
            TLRPC.TL_inputInvoiceMessage tL_inputInvoiceMessage = new TLRPC.TL_inputInvoiceMessage();
            tL_inputInvoiceMessage.peer = hl0Var.getMessagesController().m1(hl0Var.N0.k.peer_id);
            tL_inputInvoiceMessage.msg_id = hl0Var.N0.f1();
            hl0Var.I0.invoice = tL_inputInvoiceMessage;
        } else {
            TLRPC.TL_inputInvoiceSlug tL_inputInvoiceSlug = new TLRPC.TL_inputInvoiceSlug();
            tL_inputInvoiceSlug.slug = hl0Var.O0;
            hl0Var.I0.invoice = tL_inputInvoiceSlug;
        }
        TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo2 = hl0Var.I0;
        tL_payments_validateRequestedInfo2.save = hl0Var.T0;
        tL_payments_validateRequestedInfo2.info = new TLRPC.TL_paymentRequestedInfo();
        if (hl0Var.C0.invoice.name_requested) {
            hl0Var.I0.info.name = hl0Var.f[6].getText().toString();
            hl0Var.I0.info.flags |= 1;
        }
        if (hl0Var.C0.invoice.phone_requested) {
            hl0Var.I0.info.phone = "+" + hl0Var.f[8].getText().toString() + hl0Var.f[9].getText().toString();
            TLRPC.TL_paymentRequestedInfo tL_paymentRequestedInfo = hl0Var.I0.info;
            tL_paymentRequestedInfo.flags = tL_paymentRequestedInfo.flags | 2;
        }
        if (hl0Var.C0.invoice.email_requested) {
            hl0Var.I0.info.email = hl0Var.f[7].getText().toString().trim();
            hl0Var.I0.info.flags |= 4;
        }
        if (hl0Var.C0.invoice.shipping_address_requested) {
            hl0Var.I0.info.shipping_address = new TLRPC.TL_postAddress();
            hl0Var.I0.info.shipping_address.street_line1 = hl0Var.f[0].getText().toString();
            hl0Var.I0.info.shipping_address.street_line2 = hl0Var.f[1].getText().toString();
            hl0Var.I0.info.shipping_address.city = hl0Var.f[2].getText().toString();
            hl0Var.I0.info.shipping_address.state = hl0Var.f[3].getText().toString();
            TLRPC.TL_postAddress tL_postAddress = hl0Var.I0.info.shipping_address;
            String str = hl0Var.B0;
            if (str == null) {
                str = "";
            }
            tL_postAddress.country_iso2 = str;
            tL_postAddress.post_code = hl0Var.f[5].getText().toString();
            hl0Var.I0.info.flags |= 8;
        }
        ConnectionsManager.getInstance(hl0Var.currentAccount).sendRequest(hl0Var.I0, new h50(15, hl0Var, hl0Var.I0), (hl0Var.W0 ? 8 : 0) | 2);
    }

    public static JSONObject u0() {
        List asList = Arrays.asList("AMEX", "DISCOVER", "JCB", "MASTERCARD", "VISA");
        List asList2 = Arrays.asList("PAN_ONLY", "CRYPTOGRAM_3DS");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(TeXSymbolParser.TYPE_ATTR, "CARD");
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("allowedAuthMethods", new JSONArray((Collection) asList2));
        jSONObject2.put("allowedCardNetworks", new JSONArray((Collection) asList));
        jSONObject.put("parameters", jSONObject2);
        return jSONObject;
    }

    public final void A0(TLRPC.InputInvoice inputInvoice, TLRPC.PaymentForm paymentForm, org.telegram.messenger.ij ijVar, String str, int i7, TLRPC.TL_payments_validatedRequestedInfo tL_payments_validatedRequestedInfo, TLRPC.TL_shippingOption tL_shippingOption, Long l10, String str2, String str3, TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo, boolean z9, TLRPC.TL_inputPaymentCredentialsGooglePay tL_inputPaymentCredentialsGooglePay, org.telegram.ui.ActionBar.f2 f2Var, boolean z10) {
        if (f2Var != null) {
            this.currentAccount = f2Var.getCurrentAccount();
        }
        this.u0 = i7;
        this.r0 = f2Var;
        this.w0 = str2;
        this.J0 = tL_inputPaymentCredentialsGooglePay;
        this.E0 = tL_payments_validatedRequestedInfo;
        this.C0 = paymentForm;
        this.G0 = tL_shippingOption;
        this.H0 = l10;
        this.N0 = ijVar;
        this.O0 = str;
        this.b1 = inputInvoice;
        this.U0 = z9;
        this.W0 = z10;
        this.S0 = ("stripe".equals(paymentForm.native_provider) || "smartglocal".equals(this.C0.native_provider)) ? false : true;
        TLRPC.User a22 = getMessagesController().a2(Long.valueOf(paymentForm.bot_id));
        this.l0 = a22;
        if (a22 != null) {
            this.p0 = a22.first_name;
        } else {
            this.p0 = "";
        }
        this.q0 = paymentForm.title;
        this.I0 = tL_payments_validateRequestedInfo;
        this.T0 = true;
        if (z9 || this.u0 == 4) {
            this.U0 = z9;
        } else {
            this.U0 = !this.C0.saved_credentials.isEmpty();
        }
        if (str3 != null) {
            this.x0 = str3;
        } else {
            if (this.C0.saved_credentials.isEmpty()) {
                return;
            }
            TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard = this.C0.saved_credentials.get(0);
            this.y0 = tL_paymentSavedCredentialsCard;
            this.x0 = tL_paymentSavedCredentialsCard.title;
        }
    }

    public final void B0(Context context) {
        Optional empty;
        if (getParentActivity() == null) {
            return;
        }
        b7.l lVar = new b7.l();
        int i7 = this.C0.invoice.test ? 3 : 1;
        if (i7 != 2 && i7 != 1 && i7 != 3) {
            Locale locale = Locale.US;
            throw new IllegalArgumentException(jg.g.j(i7, "Invalid environment value "));
        }
        lVar.a = i7;
        this.e = new b9.j0(context, y8.p.a, new y8.o(lVar), com.google.android.gms.common.api.i.c);
        try {
            JSONObject put = new JSONObject().put("apiVersion", 2).put("apiVersionMinor", 0);
            put.put("allowedPaymentMethods", new JSONArray().put(u0()));
            empty = Optional.of(put);
        } catch (JSONException unused) {
            empty = Optional.empty();
        }
        if (empty.isPresent()) {
            String jSONObject = ((JSONObject) empty.get()).toString();
            y8.e eVar = new y8.e();
            q6.m.h(jSONObject, "isReadyToPayRequestJson cannot be null!");
            eVar.f = jSONObject;
            b9.j0 j0Var = this.e;
            j0Var.getClass();
            com.google.android.gms.common.api.internal.s b10 = com.google.android.gms.common.api.internal.t.b();
            b10.a = 23705;
            b10.c = new y7.i6(eVar, 1);
            j0Var.e(0, b10.a()).addOnCompleteListener(getParentActivity(), new jk0(this, 0));
        }
    }

    public final void C0() {
        if (this.e0) {
            return;
        }
        this.e0 = true;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_account.getPassword(), new ck0(this, 3), 10);
    }

    public final boolean D0(org.telegram.ui.ActionBar.q4 q4Var, Activity activity) {
        int i7 = 0;
        if (this.b1 != null) {
            if (q4Var != null) {
                ArrayList arrayList = new ArrayList(q4Var.getFragmentStack());
                int size = arrayList.size();
                while (i7 < size) {
                    Object obj = arrayList.get(i7);
                    i7++;
                    org.telegram.ui.ActionBar.f2 f2Var = (org.telegram.ui.ActionBar.f2) obj;
                    if (f2Var instanceof hl0) {
                        f2Var.removeSelfFromStack();
                    }
                }
                return true;
            }
            return false;
        }
        String str = this.l0.username;
        if (((str != null && str.equalsIgnoreCase(getMessagesController().s6) && this.O0 == null) || (this.O0 != null && getMessagesController().t6 != null && Objects.equals(this.O0, getMessagesController().t6))) && q4Var != null) {
            ArrayList arrayList2 = new ArrayList(q4Var.getFragmentStack());
            int size2 = arrayList2.size();
            int i10 = 0;
            while (i10 < size2) {
                Object obj2 = arrayList2.get(i10);
                i10++;
                org.telegram.ui.ActionBar.f2 f2Var2 = (org.telegram.ui.ActionBar.f2) obj2;
                if ((f2Var2 instanceof an) || (f2Var2 instanceof PremiumPreviewFragment)) {
                    f2Var2.removeSelfFromStack();
                }
            }
            PremiumPreviewFragment premiumPreviewFragment = new PremiumPreviewFragment(0, null);
            premiumPreviewFragment.p0 = true;
            ((ActionBarLayout) q4Var).T(premiumPreviewFragment, !isFinishing());
            if (activity instanceof LaunchActivity) {
                try {
                    this.fragmentView.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                ((LaunchActivity) activity).v0.c(false);
            }
            return true;
        }
        return false;
    }

    public final void E0(org.telegram.ui.ActionBar.f2 f2Var) {
        org.telegram.messenger.g0.v1(this.fragmentView);
        if (f2Var instanceof hl0) {
            hl0 hl0Var = (hl0) f2Var;
            hl0Var.Z0 = this.Z0;
            hl0Var.Y0 = this.Y0;
            hl0Var.X0 = this.X0;
            hl0Var.y0 = this.y0;
        }
    }

    public final void F0() {
        String str;
        if (this.Q0) {
            return;
        }
        N0(false, true);
        TLRPC.TL_payments_sendPaymentForm tL_payments_sendPaymentForm = new TLRPC.TL_payments_sendPaymentForm();
        TLRPC.InputInvoice inputInvoice = this.b1;
        if (inputInvoice != null) {
            tL_payments_sendPaymentForm.invoice = inputInvoice;
        } else if (this.N0 != null) {
            TLRPC.TL_inputInvoiceMessage tL_inputInvoiceMessage = new TLRPC.TL_inputInvoiceMessage();
            tL_inputInvoiceMessage.peer = getMessagesController().m1(this.N0.k.peer_id);
            tL_inputInvoiceMessage.msg_id = this.N0.f1();
            tL_payments_sendPaymentForm.invoice = tL_inputInvoiceMessage;
        } else {
            TLRPC.TL_inputInvoiceSlug tL_inputInvoiceSlug = new TLRPC.TL_inputInvoiceSlug();
            tL_inputInvoiceSlug.slug = this.O0;
            tL_payments_sendPaymentForm.invoice = tL_inputInvoiceSlug;
        }
        tL_payments_sendPaymentForm.form_id = this.C0.form_id;
        if (org.telegram.messenger.p10.i(this.currentAccount).y == null || this.y0 == null) {
            TLRPC.TL_inputPaymentCredentialsGooglePay tL_inputPaymentCredentialsGooglePay = this.J0;
            if (tL_inputPaymentCredentialsGooglePay != null) {
                tL_payments_sendPaymentForm.credentials = tL_inputPaymentCredentialsGooglePay;
            } else {
                TLRPC.TL_inputPaymentCredentials tL_inputPaymentCredentials = new TLRPC.TL_inputPaymentCredentials();
                tL_payments_sendPaymentForm.credentials = tL_inputPaymentCredentials;
                tL_inputPaymentCredentials.save = this.U0;
                tL_inputPaymentCredentials.data = new TLRPC.TL_dataJSON();
                tL_payments_sendPaymentForm.credentials.data.data = this.w0;
            }
        } else {
            TLRPC.TL_inputPaymentCredentialsSaved tL_inputPaymentCredentialsSaved = new TLRPC.TL_inputPaymentCredentialsSaved();
            tL_payments_sendPaymentForm.credentials = tL_inputPaymentCredentialsSaved;
            tL_inputPaymentCredentialsSaved.id = this.y0.id;
            tL_inputPaymentCredentialsSaved.tmp_password = org.telegram.messenger.p10.i(this.currentAccount).y.tmp_password;
        }
        TLRPC.TL_payments_validatedRequestedInfo tL_payments_validatedRequestedInfo = this.E0;
        if (tL_payments_validatedRequestedInfo != null && (str = tL_payments_validatedRequestedInfo.id) != null) {
            tL_payments_sendPaymentForm.requested_info_id = str;
            tL_payments_sendPaymentForm.flags = 1 | tL_payments_sendPaymentForm.flags;
        }
        TLRPC.TL_shippingOption tL_shippingOption = this.G0;
        if (tL_shippingOption != null) {
            tL_payments_sendPaymentForm.shipping_option_id = tL_shippingOption.id;
            tL_payments_sendPaymentForm.flags |= 2;
        }
        if ((this.C0.invoice.flags & 256) != 0) {
            Long l10 = this.H0;
            tL_payments_sendPaymentForm.tip_amount = l10 != null ? l10.longValue() : 0L;
            tL_payments_sendPaymentForm.flags |= 4;
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_payments_sendPaymentForm, new h50(16, this, tL_payments_sendPaymentForm), (this.W0 ? 8 : 0) | 2);
    }

    public final void G0(boolean z9) {
        String str;
        String str2;
        int i7 = 1;
        if (!z9 && this.S.getVisibility() == 0) {
            String text = this.S.getText();
            if (text.length() == 0) {
                org.telegram.ui.Cells.l3 l3Var = this.S;
                try {
                    l3Var.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                org.telegram.messenger.g0.G3(2.5f, l3Var, null);
                return;
            } else {
                N0(true, true);
                TL_account.confirmPasswordEmail confirmpasswordemail = new TL_account.confirmPasswordEmail();
                confirmpasswordemail.code = text;
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(confirmpasswordemail, new ck0(this, i7), 10);
                return;
            }
        }
        TL_account.updatePasswordSettings updatepasswordsettings = new TL_account.updatePasswordSettings();
        if (z9) {
            this.n.setVisibility(0);
            TL_account.passwordInputSettings passwordinputsettings = new TL_account.passwordInputSettings();
            updatepasswordsettings.new_settings = passwordinputsettings;
            passwordinputsettings.flags = 2;
            passwordinputsettings.email = "";
            updatepasswordsettings.password = new TLRPC.TL_inputCheckPasswordEmpty();
            str2 = null;
            str = null;
        } else {
            String obj = this.f[0].getText().toString();
            if (TextUtils.isEmpty(obj)) {
                K0(0);
                return;
            }
            if (!obj.equals(this.f[1].getText().toString())) {
                try {
                    Toast.makeText(getParentActivity(), org.telegram.messenger.hd.M0(2131747445, null), 0).show();
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                }
                K0(1);
                return;
            }
            String obj2 = this.f[2].getText().toString();
            if (obj2.length() < 3) {
                K0(2);
                return;
            }
            int lastIndexOf = obj2.lastIndexOf(46);
            int lastIndexOf2 = obj2.lastIndexOf(64);
            if (lastIndexOf2 < 0 || lastIndexOf < lastIndexOf2) {
                K0(2);
                return;
            }
            updatepasswordsettings.password = new TLRPC.TL_inputCheckPasswordEmpty();
            TL_account.passwordInputSettings passwordinputsettings2 = new TL_account.passwordInputSettings();
            updatepasswordsettings.new_settings = passwordinputsettings2;
            int i10 = passwordinputsettings2.flags;
            passwordinputsettings2.flags = i10 | 1;
            passwordinputsettings2.hint = "";
            passwordinputsettings2.new_algo = this.a0.new_algo;
            passwordinputsettings2.flags = 3 | i10;
            passwordinputsettings2.email = obj2.trim();
            str = obj;
            str2 = obj2;
        }
        N0(true, true);
        Utilities.e.c(new fi.q1(this, z9, str2, str, updatepasswordsettings));
    }

    public final void H0(TLRPC.TL_paymentRequestedInfo tL_paymentRequestedInfo) {
        TLRPC.TL_postAddress tL_postAddress = tL_paymentRequestedInfo.shipping_address;
        org.telegram.ui.Cells.y8[] y8VarArr = this.Y;
        if (tL_postAddress != null) {
            String str = tL_postAddress.street_line1;
            String str2 = tL_postAddress.street_line2;
            String str3 = tL_postAddress.city;
            String str4 = tL_postAddress.state;
            String str5 = tL_postAddress.country_iso2;
            String str6 = tL_postAddress.post_code;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append(" ");
            sb2.append(str2);
            sb2.append(", ");
            sb2.append(str3);
            com.google.android.recaptcha.internal.a.s(sb2, ", ", str4, ", ", str5);
            y8VarArr[2].b(R.drawable.msg_payment_address, a8.p0.s(sb2, ", ", str6), org.telegram.messenger.hd.M0(2131747380, null), true);
        }
        y8VarArr[2].setVisibility(tL_paymentRequestedInfo.shipping_address != null ? 0 : 8);
        String str7 = tL_paymentRequestedInfo.name;
        if (str7 != null) {
            y8VarArr[3].b(R.drawable.msg_contacts, str7, org.telegram.messenger.hd.M0(2131747411, null), true);
        }
        y8VarArr[3].setVisibility(tL_paymentRequestedInfo.name != null ? 0 : 8);
        if (tL_paymentRequestedInfo.phone != null) {
            y8VarArr[4].b(R.drawable.msg_calls, pf.b.c().b(tL_paymentRequestedInfo.phone), org.telegram.messenger.hd.M0(2131747409, null), (tL_paymentRequestedInfo.email == null && this.G0 == null) ? false : true);
        }
        y8VarArr[4].setVisibility(tL_paymentRequestedInfo.phone != null ? 0 : 8);
        String str8 = tL_paymentRequestedInfo.email;
        if (str8 != null) {
            y8VarArr[5].b(R.drawable.msg_mention, str8, org.telegram.messenger.hd.M0(2131747414, null), this.G0 != null);
        }
        y8VarArr[5].setVisibility(tL_paymentRequestedInfo.email != null ? 0 : 8);
    }

    public final void I0(TL_account.Password password) {
        if (password == null || !password.has_password) {
            this.a0 = password;
            this.b0 = (password == null || TextUtils.isEmpty(password.email_unconfirmed_pattern)) ? false : true;
            P0();
        } else {
            if (getParentActivity() == null) {
                return;
            }
            z0();
        }
    }

    public final void J0(boolean z9) {
        this.P0 = z9;
        this.G = !z9;
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        if (kVar != null && kVar.getBackButton() != null) {
            this.actionBar.getBackButton().setEnabled(!this.P0);
        }
        org.telegram.ui.Cells.y8 y8Var = this.Y[0];
        if (y8Var != null) {
            y8Var.setEnabled(!this.P0);
        }
    }

    public final void K0(int i7) {
        EditTextBoldCursor editTextBoldCursor = this.f[i7];
        try {
            editTextBoldCursor.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        org.telegram.messenger.g0.G3(2.5f, editTextBoldCursor, null);
    }

    public final void L0(String str, String str2) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131747830, null), null);
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
        u1Var.R = str;
        u1Var.T = str2;
        showDialog(u1Var);
    }

    public final void M0(Runnable runnable) {
        Integer valueOf = Integer.valueOf(R.drawable.msg_payment_card);
        org.telegram.ui.ActionBar.v2 h = org.telegram.messenger.camera.q.h(getParentActivity(), false, 1, null);
        h.O = org.telegram.messenger.hd.M0(2131747413, null);
        h.P = true;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard = this.y0;
        if (tL_paymentSavedCredentialsCard != null) {
            arrayList.add(tL_paymentSavedCredentialsCard.title);
            arrayList2.add(valueOf);
        } else {
            String str = this.x0;
            if (str != null) {
                arrayList.add(str);
                arrayList2.add(valueOf);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        ArrayList<TLRPC.TL_paymentSavedCredentialsCard> arrayList4 = this.C0.saved_credentials;
        int size = arrayList4.size();
        int i7 = 0;
        while (i7 < size) {
            TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard2 = arrayList4.get(i7);
            i7++;
            TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard3 = tL_paymentSavedCredentialsCard2;
            TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard4 = this.y0;
            if (tL_paymentSavedCredentialsCard4 == null || !Objects.equals(tL_paymentSavedCredentialsCard3.id, tL_paymentSavedCredentialsCard4.id)) {
                arrayList.add(tL_paymentSavedCredentialsCard3.title);
                arrayList2.add(valueOf);
                arrayList3.add(tL_paymentSavedCredentialsCard3);
            }
        }
        ArrayList<TLRPC.TL_paymentFormMethod> arrayList5 = this.C0.additional_methods;
        int size2 = arrayList5.size();
        int i10 = 0;
        while (i10 < size2) {
            TLRPC.TL_paymentFormMethod tL_paymentFormMethod = arrayList5.get(i10);
            i10++;
            arrayList.add(tL_paymentFormMethod.title);
            arrayList2.add(Integer.valueOf(R.drawable.msg_payment_provider));
        }
        arrayList.add(org.telegram.messenger.hd.M0(2131747412, null));
        arrayList2.add(Integer.valueOf(R.drawable.msg_addbot));
        int[] iArr = new int[arrayList2.size()];
        for (int i11 = 0; i11 < arrayList2.size(); i11++) {
            iArr[i11] = ((Integer) arrayList2.get(i11)).intValue();
        }
        CharSequence[] charSequenceArr = (CharSequence[]) arrayList.toArray(new CharSequence[0]);
        org.telegram.ui.Components.t2 t2Var = new org.telegram.ui.Components.t2(this, runnable, arrayList3, arrayList, 1);
        h.L = charSequenceArr;
        h.M = iArr;
        h.K = t2Var;
        showDialog(h);
    }

    public final void N0(boolean z9, boolean z10) {
        AnimatorSet animatorSet = this.w;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        int i7 = 1;
        int i10 = 0;
        if (!z9 || this.n == null) {
            if (this.U != null) {
                this.w = new AnimatorSet();
                if (z10) {
                    this.s.setVisibility(0);
                    this.W.setEnabled(false);
                    AnimatorSet animatorSet2 = this.w;
                    TextView textView = this.U;
                    Property property = View.SCALE_X;
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property, 0.1f);
                    TextView textView2 = this.U;
                    Property property2 = View.SCALE_Y;
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) property2, 0.1f);
                    TextView textView3 = this.U;
                    Property property3 = View.ALPHA;
                    animatorSet2.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(textView3, (Property<TextView, Float>) property3, 0.0f), ObjectAnimator.ofFloat(this.s, (Property<org.telegram.ui.Components.zp, Float>) property, 1.0f), ObjectAnimator.ofFloat(this.s, (Property<org.telegram.ui.Components.zp, Float>) property2, 1.0f), ObjectAnimator.ofFloat(this.s, (Property<org.telegram.ui.Components.zp, Float>) property3, 1.0f));
                } else {
                    this.U.setVisibility(0);
                    this.W.setEnabled(true);
                    AnimatorSet animatorSet3 = this.w;
                    org.telegram.ui.Components.zp zpVar = this.s;
                    Property property4 = View.SCALE_X;
                    ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(zpVar, (Property<org.telegram.ui.Components.zp, Float>) property4, 0.1f);
                    org.telegram.ui.Components.zp zpVar2 = this.s;
                    Property property5 = View.SCALE_Y;
                    ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(zpVar2, (Property<org.telegram.ui.Components.zp, Float>) property5, 0.1f);
                    org.telegram.ui.Components.zp zpVar3 = this.s;
                    Property property6 = View.ALPHA;
                    animatorSet3.playTogether(ofFloat3, ofFloat4, ObjectAnimator.ofFloat(zpVar3, (Property<org.telegram.ui.Components.zp, Float>) property6, 0.0f), ObjectAnimator.ofFloat(this.U, (Property<TextView, Float>) property4, 1.0f), ObjectAnimator.ofFloat(this.U, (Property<TextView, Float>) property5, 1.0f), ObjectAnimator.ofFloat(this.U, (Property<TextView, Float>) property6, 1.0f));
                }
                this.w.addListener(new al0(this, z10, i7));
                this.w.setDuration(150L);
                this.w.start();
                return;
            }
            return;
        }
        AnimatorSet animatorSet4 = new AnimatorSet();
        this.w = animatorSet4;
        if (z10) {
            this.r.setVisibility(0);
            this.n.setEnabled(false);
            AnimatorSet animatorSet5 = this.w;
            View contentView = this.n.getContentView();
            Property property7 = View.SCALE_X;
            ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(contentView, (Property<View, Float>) property7, 0.1f);
            View contentView2 = this.n.getContentView();
            Property property8 = View.SCALE_Y;
            ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(contentView2, (Property<View, Float>) property8, 0.1f);
            View contentView3 = this.n.getContentView();
            Property property9 = View.ALPHA;
            animatorSet5.playTogether(ofFloat5, ofFloat6, ObjectAnimator.ofFloat(contentView3, (Property<View, Float>) property9, 0.0f), ObjectAnimator.ofFloat(this.r, (Property<org.telegram.ui.Components.zp, Float>) property7, 1.0f), ObjectAnimator.ofFloat(this.r, (Property<org.telegram.ui.Components.zp, Float>) property8, 1.0f), ObjectAnimator.ofFloat(this.r, (Property<org.telegram.ui.Components.zp, Float>) property9, 1.0f));
        } else if (this.x != null) {
            animatorSet4.playTogether(ObjectAnimator.ofFloat(this.r, (Property<org.telegram.ui.Components.zp, Float>) View.SCALE_X, 0.1f), ObjectAnimator.ofFloat(this.r, (Property<org.telegram.ui.Components.zp, Float>) View.SCALE_Y, 0.1f), ObjectAnimator.ofFloat(this.r, (Property<org.telegram.ui.Components.zp, Float>) View.ALPHA, 0.0f));
        } else {
            this.n.getContentView().setVisibility(0);
            this.n.setEnabled(true);
            AnimatorSet animatorSet6 = this.w;
            org.telegram.ui.Components.zp zpVar4 = this.r;
            Property property10 = View.SCALE_X;
            ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(zpVar4, (Property<org.telegram.ui.Components.zp, Float>) property10, 0.1f);
            org.telegram.ui.Components.zp zpVar5 = this.r;
            Property property11 = View.SCALE_Y;
            ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(zpVar5, (Property<org.telegram.ui.Components.zp, Float>) property11, 0.1f);
            org.telegram.ui.Components.zp zpVar6 = this.r;
            Property property12 = View.ALPHA;
            animatorSet6.playTogether(ofFloat7, ofFloat8, ObjectAnimator.ofFloat(zpVar6, (Property<org.telegram.ui.Components.zp, Float>) property12, 0.0f));
            if (!isFinishing()) {
                this.w.playTogether(ObjectAnimator.ofFloat(this.n.getContentView(), (Property<View, Float>) property10, 1.0f), ObjectAnimator.ofFloat(this.n.getContentView(), (Property<View, Float>) property11, 1.0f), ObjectAnimator.ofFloat(this.n.getContentView(), (Property<View, Float>) property12, 1.0f));
            }
        }
        this.w.addListener(new al0(this, z10, i10));
        this.w.setDuration(150L);
        this.w.start();
    }

    public final void O0(String str) {
        if (getParentActivity() == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        String M0 = org.telegram.messenger.hd.M0(2131747353, null);
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
        u1Var.R = M0;
        u1Var.T = org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0("PaymentTransactionMessage2", null, 2131747354, str, this.p0, this.q0));
        alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131751771, null), new jk0(this, 5));
        alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
        showDialog(u1Var);
    }

    public final void P0() {
        if (this.u0 == 6) {
            org.telegram.ui.Cells.z8[] z8VarArr = this.M;
            if (z8VarArr[2] == null) {
                return;
            }
            int i7 = 0;
            this.n.setVisibility(0);
            TL_account.Password password = this.a0;
            ArrayList arrayList = this.J;
            org.telegram.ui.Cells.n4[] n4VarArr = this.I;
            org.telegram.ui.Cells.w9[] w9VarArr = this.N;
            if (password == null) {
                N0(true, true);
                z8VarArr[2].setVisibility(8);
                w9VarArr[0].setVisibility(8);
                w9VarArr[1].setVisibility(8);
                this.S.setVisibility(8);
                n4VarArr[0].setVisibility(8);
                n4VarArr[1].setVisibility(8);
                z8VarArr[0].setVisibility(8);
                for (int i10 = 0; i10 < 3; i10++) {
                    ((View) this.f[i10].getParent()).setVisibility(8);
                }
                while (i7 < arrayList.size()) {
                    ((View) arrayList.get(i7)).setVisibility(8);
                    i7++;
                }
                return;
            }
            N0(true, false);
            if (!this.b0) {
                z8VarArr[2].setVisibility(8);
                w9VarArr[0].setVisibility(8);
                w9VarArr[1].setVisibility(8);
                z8VarArr[1].setText(org.telegram.messenger.hd.M0(2131747390, null));
                this.S.setVisibility(8);
                n4VarArr[0].setVisibility(0);
                n4VarArr[1].setVisibility(0);
                z8VarArr[0].setVisibility(0);
                for (int i11 = 0; i11 < 3; i11++) {
                    ((View) this.f[i11].getParent()).setVisibility(0);
                }
                for (int i12 = 0; i12 < arrayList.size(); i12++) {
                    ((View) arrayList.get(i12)).setVisibility(0);
                }
                return;
            }
            org.telegram.ui.Cells.z8 z8Var = z8VarArr[2];
            String str = this.a0.email_unconfirmed_pattern;
            if (str == null) {
                str = "";
            }
            z8Var.setText(org.telegram.messenger.hd.a0("EmailPasswordConfirmText2", null, 2131751200, str));
            z8VarArr[2].setVisibility(0);
            w9VarArr[0].setVisibility(0);
            w9VarArr[1].setVisibility(0);
            this.S.setVisibility(0);
            z8VarArr[1].setText("");
            n4VarArr[0].setVisibility(8);
            n4VarArr[1].setVisibility(8);
            z8VarArr[0].setVisibility(8);
            for (int i13 = 0; i13 < 3; i13++) {
                ((View) this.f[i13].getParent()).setVisibility(8);
            }
            while (i7 < arrayList.size()) {
                ((View) arrayList.get(i7)).setVisibility(8);
                i7++;
            }
        }
    }

    public final void Q0() {
        org.telegram.ui.Cells.z8[] z8VarArr = this.M;
        if (z8VarArr[0] != null) {
            org.telegram.ui.Cells.y6[] y6VarArr = this.K;
            if (y6VarArr[2] == null) {
                return;
            }
            TLRPC.PaymentForm paymentForm = this.C0;
            if ((!paymentForm.password_missing && !paymentForm.can_save_credentials) || (this.x != null && this.z0)) {
                this.L.setVisibility(8);
                z8VarArr[0].setVisibility(8);
                org.telegram.ui.Cells.y6 y6Var = y6VarArr[2];
                org.telegram.ui.ActionBar.r6.a0(y6Var, y6Var.getContext(), R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.k6.b7);
                return;
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(org.telegram.messenger.hd.M0(2131747420, null));
            if (this.C0.password_missing) {
                C0();
                spannableStringBuilder.append((CharSequence) "\n");
                int length = spannableStringBuilder.length();
                String M0 = org.telegram.messenger.hd.M0(2131747419, null);
                int indexOf = M0.indexOf(42);
                int lastIndexOf = M0.lastIndexOf(42);
                spannableStringBuilder.append((CharSequence) M0);
                if (indexOf != -1 && lastIndexOf != -1) {
                    int i7 = indexOf + length;
                    int i10 = lastIndexOf + length;
                    z8VarArr[0].getTextView().setMovementMethod(new org.telegram.messenger.c0(false));
                    spannableStringBuilder.replace(i10, i10 + 1, (CharSequence) "");
                    spannableStringBuilder.replace(i7, i7 + 1, (CharSequence) "");
                    spannableStringBuilder.setSpan(new el0(this), i7, i10 - 1, 33);
                }
            }
            this.L.setEnabled(true);
            z8VarArr[0].setText(spannableStringBuilder);
            this.L.setVisibility(0);
            z8VarArr[0].setVisibility(0);
            org.telegram.ui.Cells.y6 y6Var2 = y6VarArr[2];
            org.telegram.ui.ActionBar.r6.a0(y6Var2, y6Var2.getContext(), R.drawable.greydivider, org.telegram.ui.ActionBar.k6.b7);
        }
    }

    public final void R0() {
        this.R0[0] = y0(this.t0);
        this.R.a(org.telegram.messenger.hd.M0(2131747352, null), this.R0[0], true);
        TextView textView = this.U;
        if (textView != null) {
            textView.setText(org.telegram.messenger.hd.a0("PaymentCheckoutPay", null, 2131747410, this.R0[0]));
        }
        if (this.s0 != null) {
            int themedColor = getThemedColor(org.telegram.ui.ActionBar.k6.Si);
            int childCount = this.s0.getChildCount();
            for (int i7 = 0; i7 < childCount; i7++) {
                TextView textView2 = (TextView) this.s0.getChildAt(i7);
                if (textView2.getTag().equals(this.H0)) {
                    org.telegram.ui.ActionBar.k6.C1(themedColor, textView2.getBackground());
                    org.telegram.ui.ActionBar.r6.V(textView2, org.telegram.ui.ActionBar.k6.Ti, this.Y0);
                } else {
                    org.telegram.ui.ActionBar.k6.C1(536870911 & themedColor, textView2.getBackground());
                    org.telegram.ui.ActionBar.r6.V(textView2, org.telegram.ui.ActionBar.k6.Z8, this.Y0);
                }
                textView2.invalidate();
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.J6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.h7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.g7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.E7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.D7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.s8));
    }

    /* JADX WARN: Code restructure failed: missing block: B:178:0x031c, code lost:
    
        if (r10.email_requested == false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:481:0x1023, code lost:
    
        if (r14.email_requested == false) goto L464;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0796  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x07b0  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x07c5  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x07dc  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0817  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0876  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0906  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0830  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x07e9  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x07a6  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x0bb6  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x0c1b  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x0c4b  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x0c79  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x0d44  */
    /* JADX WARN: Removed duplicated region for block: B:352:0x0c97  */
    /* JADX WARN: Removed duplicated region for block: B:361:0x0c4d  */
    /* JADX WARN: Removed duplicated region for block: B:362:0x0c28  */
    /* JADX WARN: Removed duplicated region for block: B:369:0x0c0b  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0220  */
    /* JADX WARN: Type inference failed for: r3v271, types: [android.view.View, android.view.ViewGroup, android.widget.FrameLayout] */
    /* JADX WARN: Type inference failed for: r3v275, types: [android.view.ViewGroup] */
    /* JADX WARN: Type inference failed for: r3v276, types: [android.view.ViewGroup] */
    /* JADX WARN: Type inference failed for: r3v312, types: [android.view.View, android.view.ViewGroup, android.widget.LinearLayout] */
    /* JADX WARN: Type inference failed for: r4v240, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v241, types: [android.view.ViewGroup, android.widget.LinearLayout] */
    /* JADX WARN: Type inference failed for: r4v99, types: [android.view.ViewGroup, android.widget.LinearLayout] */
    @Override // org.telegram.ui.ActionBar.f2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View createView(Context context) {
        String str;
        char c10;
        TLRPC.PaymentForm paymentForm;
        SpannableStringBuilder spannableStringBuilder;
        TLRPC.PaymentForm paymentForm2;
        TLRPC.TL_paymentRequestedInfo tL_paymentRequestedInfo;
        boolean z9;
        int i7;
        int i10;
        int i11;
        TLRPC.TL_invoice tL_invoice;
        org.telegram.ui.Cells.y6 y6Var;
        TLRPC.TL_paymentRequestedInfo tL_paymentRequestedInfo2;
        TLRPC.TL_paymentRequestedInfo tL_paymentRequestedInfo3;
        String str2;
        String str3;
        TelephonyManager telephonyManager;
        ?? frameLayout;
        int i12;
        int i13;
        TLRPC.TL_postAddress tL_postAddress;
        TLRPC.TL_postAddress tL_postAddress2;
        TLRPC.TL_postAddress tL_postAddress3;
        TLRPC.TL_postAddress tL_postAddress4;
        TLRPC.TL_postAddress tL_postAddress5;
        TLRPC.TL_postAddress tL_postAddress6;
        String str4;
        String str5;
        BufferedReader bufferedReader;
        switch (this.u0) {
            case 0:
                this.actionBar.setTitle(org.telegram.messenger.hd.L0(2131747374));
                break;
            case 1:
                this.actionBar.setTitle(org.telegram.messenger.hd.L0(2131747373));
                break;
            case 2:
            case 3:
                TLRPC.TL_paymentFormMethod tL_paymentFormMethod = this.F0;
                if (tL_paymentFormMethod != null && !TextUtils.isEmpty(tL_paymentFormMethod.title)) {
                    this.actionBar.setTitle(this.F0.title);
                    break;
                } else {
                    this.actionBar.setTitle(org.telegram.messenger.hd.L0(2131747424));
                    break;
                }
                break;
            case 4:
                if (this.C0.invoice.test) {
                    this.actionBar.setTitle("Test " + org.telegram.messenger.hd.L0(2131747417));
                    break;
                } else {
                    this.actionBar.setTitle(org.telegram.messenger.hd.L0(2131747417));
                    break;
                }
            case 5:
                if (this.C0.invoice.test) {
                    this.actionBar.setTitle("Test " + org.telegram.messenger.hd.L0(2131747381));
                    break;
                } else {
                    this.actionBar.setTitle(org.telegram.messenger.hd.L0(2131747381));
                    break;
                }
            case 6:
                this.actionBar.setTitle(org.telegram.messenger.hd.L0(2131747392));
                break;
        }
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new vk0(this));
        org.telegram.ui.ActionBar.y q10 = this.actionBar.q();
        int i14 = this.u0;
        int i15 = 6;
        int i16 = 3;
        if (i14 == 0 || i14 == 1 || i14 == 2 || i14 == 3 || i14 == 4 || i14 == 6) {
            this.n = q10.h(1, R.drawable.ic_ab_done, org.telegram.messenger.g0.L(56.0f), org.telegram.messenger.hd.L0(2131751355));
            org.telegram.ui.Components.zp zpVar = new org.telegram.ui.Components.zp(context, 1);
            this.r = zpVar;
            zpVar.setAlpha(0.0f);
            this.r.setScaleX(0.1f);
            this.r.setScaleY(0.1f);
            this.r.setVisibility(4);
            this.n.addView(this.r, c8.ha.c(-1.0f, -1));
        }
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.fragmentView = frameLayout2;
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.a7, frameLayout2, getResourceProvider());
        ScrollView scrollView = new ScrollView(context);
        this.E = scrollView;
        scrollView.setFillViewport(true);
        org.telegram.messenger.g0.z3(this.E, getThemedColor(org.telegram.ui.ActionBar.k6.s8));
        frameLayout2.addView(this.E, c8.ha.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, this.u0 == 4 ? 48.0f : 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.Q = linearLayout;
        linearLayout.setOrientation(1);
        int i17 = 0;
        this.Q.setClipChildren(false);
        int i18 = -2;
        this.E.addView(this.Q, new FrameLayout.LayoutParams(-1, -2));
        int i19 = this.u0;
        int i20 = 29;
        int i21 = 2;
        int i22 = 10;
        int i23 = 1;
        String str6 = "";
        if (i19 == 0) {
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            try {
                bufferedReader = new BufferedReader(new InputStreamReader(context.getResources().getAssets().open("countries.txt")));
            } catch (Exception e10) {
                e = e10;
                i7 = i17;
            }
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine != null) {
                    String[] split = readLine.split(";");
                    this.a.add(i17, split[2]);
                    i7 = i17;
                    try {
                        this.b.put(split[2], split[i7]);
                        this.c.put(split[i7], split[2]);
                        hashMap2.put(split[1], split[2]);
                        if (split.length > 3) {
                            this.d.put(split[i7], split[3]);
                        }
                        hashMap.put(split[1], split[2]);
                        i17 = i7;
                    } catch (Exception e11) {
                        e = e11;
                    }
                } else {
                    i7 = i17;
                    bufferedReader.close();
                    Collections.sort(this.a, new oe(i20));
                    this.f = new EditTextBoldCursor[10];
                    i10 = i7;
                    while (i10 < i22) {
                        if (i10 == 0) {
                            this.I[i7] = new org.telegram.ui.Cells.n4(context, this.Y0);
                            org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d6, this.I[i7], getResourceProvider());
                            this.I[i7].setText(org.telegram.messenger.hd.L0(2131747380));
                            this.Q.addView(this.I[i7], c8.ha.o(-1, -2));
                        } else if (i10 == i15) {
                            this.K[i7] = new org.telegram.ui.Cells.y6(context, (Object) null);
                            this.Q.addView(this.K[i7], c8.ha.o(-1, -2));
                            this.I[i23] = new org.telegram.ui.Cells.n4(context, this.Y0);
                            org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d6, this.I[i23], getResourceProvider());
                            this.I[i23].setText(org.telegram.messenger.hd.L0(2131747370));
                            this.Q.addView(this.I[i23], c8.ha.o(-1, -2));
                        }
                        if (i10 == 8) {
                            frameLayout = new LinearLayout(context);
                            ?? r42 = i7;
                            frameLayout.setClipChildren(r42);
                            frameLayout.setOrientation(r42 == true ? 1 : 0);
                            this.Q.addView(frameLayout, c8.ha.o(-1, 50));
                            org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d6, frameLayout, getResourceProvider());
                        } else if (i10 == 9) {
                            frameLayout = (ViewGroup) this.f[8].getParent();
                        } else {
                            frameLayout = new FrameLayout(context);
                            frameLayout.setClipChildren(false);
                            this.Q.addView(frameLayout, c8.ha.o(-1, 50));
                            int i24 = org.telegram.ui.ActionBar.k6.d6;
                            org.telegram.ui.ActionBar.r6.i(i24, frameLayout, getResourceProvider());
                            int i25 = i10 != 5 ? i23 : 0;
                            if (i25 != 0) {
                                if (i10 != 7 || this.C0.invoice.phone_requested) {
                                    if (i10 == i15) {
                                        TLRPC.TL_invoice tL_invoice2 = this.C0.invoice;
                                        if (!tL_invoice2.phone_requested) {
                                        }
                                    }
                                }
                                i25 = 0;
                            }
                            if (i25 != 0) {
                                org.telegram.ui.Components.tm tmVar = new org.telegram.ui.Components.tm(context, 17);
                                org.telegram.ui.ActionBar.r6.i(i24, tmVar, getResourceProvider());
                                this.J.add(tmVar);
                                frameLayout.addView(tmVar, new FrameLayout.LayoutParams(-1, i23, 83));
                            }
                        }
                        if (i10 == 9) {
                            this.f[i10] = new org.telegram.ui.Components.v20(context);
                        } else {
                            this.f[i10] = new EditTextBoldCursor(context);
                        }
                        this.f[i10].setTag(Integer.valueOf(i10));
                        this.f[i10].setTextSize(1, 16.0f);
                        org.telegram.ui.ActionBar.r6.E(this.f[i10], org.telegram.ui.ActionBar.k6.H6, getResourceProvider());
                        EditTextBoldCursor editTextBoldCursor = this.f[i10];
                        int i26 = org.telegram.ui.ActionBar.k6.G6;
                        org.telegram.ui.ActionBar.r6.V(editTextBoldCursor, i26, getResourceProvider());
                        this.f[i10].setBackgroundDrawable(null);
                        org.telegram.ui.ActionBar.r6.w(this.f[i10], i26, getResourceProvider());
                        this.f[i10].setCursorSize(org.telegram.messenger.g0.L(20.0f));
                        this.f[i10].setCursorWidth(1.5f);
                        if (i10 == 4) {
                            final int i27 = 0;
                            this.f[i10].setOnTouchListener(new View.OnTouchListener(this) { // from class: org.telegram.ui.ek0
                                public final /* synthetic */ hl0 b;

                                {
                                    this.b = this;
                                }

                                @Override // android.view.View.OnTouchListener
                                public final boolean onTouch(View view, MotionEvent motionEvent) {
                                    switch (i27) {
                                        case 0:
                                            hl0 hl0Var = this.b;
                                            if (hl0Var.getParentActivity() != null) {
                                                if (motionEvent.getAction() == 1) {
                                                    qs qsVar = new qs(null, false);
                                                    qsVar.n = true;
                                                    qsVar.r = new jk0(hl0Var, 4);
                                                    hl0Var.presentFragment(qsVar);
                                                }
                                                break;
                                            }
                                            break;
                                        default:
                                            hl0 hl0Var2 = this.b;
                                            if (hl0Var2.getParentActivity() != null) {
                                                if (motionEvent.getAction() == 1) {
                                                    qs qsVar2 = new qs(null, false);
                                                    qsVar2.n = true;
                                                    qsVar2.r = new jk0(hl0Var2, 2);
                                                    hl0Var2.presentFragment(qsVar2);
                                                }
                                                break;
                                            }
                                            break;
                                    }
                                    return true;
                                }
                            });
                            this.f[i10].setInputType(0);
                        }
                        if (i10 == 9 || i10 == 8) {
                            this.f[i10].setInputType(i16);
                        } else if (i10 == 7) {
                            this.f[i10].setInputType(1);
                        } else {
                            this.f[i10].setInputType(16385);
                        }
                        this.f[i10].setImeOptions(268435461);
                        switch (i10) {
                            case 0:
                                this.f[i10].setHint(org.telegram.messenger.hd.L0(2131747379));
                                TLRPC.TL_paymentRequestedInfo tL_paymentRequestedInfo4 = this.C0.saved_info;
                                if (tL_paymentRequestedInfo4 != null && (tL_postAddress = tL_paymentRequestedInfo4.shipping_address) != null) {
                                    this.f[i10].setText(tL_postAddress.street_line1);
                                    break;
                                }
                                break;
                            case 1:
                                this.f[i10].setHint(org.telegram.messenger.hd.L0(2131747378));
                                TLRPC.TL_paymentRequestedInfo tL_paymentRequestedInfo5 = this.C0.saved_info;
                                if (tL_paymentRequestedInfo5 != null && (tL_postAddress2 = tL_paymentRequestedInfo5.shipping_address) != null) {
                                    this.f[i10].setText(tL_postAddress2.street_line2);
                                    break;
                                }
                                break;
                            case 2:
                                this.f[i10].setHint(org.telegram.messenger.hd.L0(2131747377));
                                TLRPC.TL_paymentRequestedInfo tL_paymentRequestedInfo6 = this.C0.saved_info;
                                if (tL_paymentRequestedInfo6 != null && (tL_postAddress3 = tL_paymentRequestedInfo6.shipping_address) != null) {
                                    this.f[i10].setText(tL_postAddress3.city);
                                    break;
                                }
                                break;
                            case 3:
                                this.f[i10].setHint(org.telegram.messenger.hd.L0(2131747367));
                                TLRPC.TL_paymentRequestedInfo tL_paymentRequestedInfo7 = this.C0.saved_info;
                                if (tL_paymentRequestedInfo7 != null && (tL_postAddress4 = tL_paymentRequestedInfo7.shipping_address) != null) {
                                    this.f[i10].setText(tL_postAddress4.state);
                                    break;
                                }
                                break;
                            case 4:
                                this.f[i10].setHint(org.telegram.messenger.hd.L0(2131747376));
                                TLRPC.TL_paymentRequestedInfo tL_paymentRequestedInfo8 = this.C0.saved_info;
                                if (tL_paymentRequestedInfo8 != null && (tL_postAddress5 = tL_paymentRequestedInfo8.shipping_address) != null) {
                                    String str7 = (String) hashMap2.get(tL_postAddress5.country_iso2);
                                    String str8 = this.C0.saved_info.shipping_address.country_iso2;
                                    this.B0 = str8;
                                    EditTextBoldCursor editTextBoldCursor2 = this.f[i10];
                                    if (str7 == null) {
                                        str7 = str8;
                                    }
                                    editTextBoldCursor2.setText(str7);
                                    break;
                                }
                                break;
                            case 5:
                                this.f[i10].setHint(org.telegram.messenger.hd.L0(2131747366));
                                TLRPC.TL_paymentRequestedInfo tL_paymentRequestedInfo9 = this.C0.saved_info;
                                if (tL_paymentRequestedInfo9 != null && (tL_postAddress6 = tL_paymentRequestedInfo9.shipping_address) != null) {
                                    this.f[i10].setText(tL_postAddress6.post_code);
                                    break;
                                }
                                break;
                            case 6:
                                this.f[i10].setHint(org.telegram.messenger.hd.L0(2131747372));
                                TLRPC.TL_paymentRequestedInfo tL_paymentRequestedInfo10 = this.C0.saved_info;
                                if (tL_paymentRequestedInfo10 != null && (str4 = tL_paymentRequestedInfo10.name) != null) {
                                    this.f[i10].setText(str4);
                                    break;
                                }
                                break;
                            case 7:
                                this.f[i10].setHint(org.telegram.messenger.hd.L0(2131747375));
                                TLRPC.TL_paymentRequestedInfo tL_paymentRequestedInfo11 = this.C0.saved_info;
                                if (tL_paymentRequestedInfo11 != null && (str5 = tL_paymentRequestedInfo11.email) != null) {
                                    this.f[i10].setText(str5);
                                    break;
                                }
                                break;
                        }
                        EditTextBoldCursor editTextBoldCursor3 = this.f[i10];
                        editTextBoldCursor3.setSelection(editTextBoldCursor3.length());
                        if (i10 == 8) {
                            TextView textView = new TextView(context);
                            this.H = textView;
                            textView.setText("+");
                            org.telegram.ui.ActionBar.r6.V(this.H, i26, getResourceProvider());
                            this.H.setTextSize(1, 16.0f);
                            frameLayout.addView(this.H, c8.ha.k(21.0f, 12.0f, 0.0f, 6.0f, -2, -2));
                            this.f[i10].setPadding(org.telegram.messenger.g0.L(10.0f), 0, 0, 0);
                            this.f[i10].setGravity(19);
                            this.f[i10].setFilters(new InputFilter[]{new InputFilter.LengthFilter(5)});
                            frameLayout.addView(this.f[i10], c8.ha.k(0.0f, 12.0f, 21.0f, 6.0f, 55, -2));
                            this.f[i10].addTextChangedListener(new wk0(this, 1));
                        } else if (i10 == 9) {
                            this.f[i10].setPadding(0, 0, 0, 0);
                            this.f[i10].setGravity(19);
                            frameLayout.addView(this.f[i10], c8.ha.k(0.0f, 12.0f, 21.0f, 6.0f, -1, -2));
                            this.f[i10].addTextChangedListener(new xq(this, 4));
                        } else {
                            this.f[i10].setPadding(0, 0, 0, org.telegram.messenger.g0.L(6.0f));
                            this.f[i10].setGravity(org.telegram.messenger.hd.a0 ? 5 : i16);
                            frameLayout.addView(this.f[i10], c8.ha.d(-1, -2.0f, 51, 21.0f, 12.0f, 21.0f, 6.0f));
                        }
                        final int i28 = i21;
                        this.f[i10].setOnEditorActionListener(new TextView.OnEditorActionListener(this) { // from class: org.telegram.ui.hk0
                            public final /* synthetic */ hl0 b;

                            {
                                this.b = this;
                            }

                            @Override // android.widget.TextView.OnEditorActionListener
                            public final boolean onEditorAction(TextView textView2, int i29, KeyEvent keyEvent) {
                                EditTextBoldCursor[] editTextBoldCursorArr;
                                switch (i28) {
                                    case 0:
                                        hl0 hl0Var = this.b;
                                        if (i29 != 6) {
                                            hl0Var.getClass();
                                            break;
                                        } else {
                                            hl0Var.G0(false);
                                            break;
                                        }
                                    case 1:
                                        hl0 hl0Var2 = this.b;
                                        if (i29 != 6) {
                                            hl0Var2.getClass();
                                            if (i29 == 5) {
                                                int intValue = ((Integer) textView2.getTag()).intValue();
                                                if (intValue != 0) {
                                                    if (intValue == 1) {
                                                        hl0Var2.f[2].requestFocus();
                                                        break;
                                                    }
                                                } else {
                                                    hl0Var2.f[1].requestFocus();
                                                    break;
                                                }
                                            }
                                        } else {
                                            hl0Var2.n.performClick();
                                            break;
                                        }
                                        break;
                                    case 2:
                                        hl0 hl0Var3 = this.b;
                                        hl0Var3.getClass();
                                        if (i29 != 5) {
                                            if (i29 == 6) {
                                                hl0Var3.n.performClick();
                                                break;
                                            }
                                        } else {
                                            int intValue2 = ((Integer) textView2.getTag()).intValue();
                                            while (true) {
                                                intValue2++;
                                                EditTextBoldCursor[] editTextBoldCursorArr2 = hl0Var3.f;
                                                if (intValue2 >= editTextBoldCursorArr2.length) {
                                                    break;
                                                } else if (intValue2 != 4 && ((View) editTextBoldCursorArr2[intValue2].getParent()).getVisibility() == 0) {
                                                    hl0Var3.f[intValue2].requestFocus();
                                                    break;
                                                }
                                            }
                                        }
                                        break;
                                    case 3:
                                        hl0 hl0Var4 = this.b;
                                        hl0Var4.getClass();
                                        if (i29 != 5) {
                                            if (i29 == 6) {
                                                hl0Var4.n.performClick();
                                                break;
                                            }
                                        } else {
                                            int intValue3 = ((Integer) textView2.getTag()).intValue();
                                            do {
                                                int i30 = intValue3 + 1;
                                                editTextBoldCursorArr = hl0Var4.f;
                                                if (i30 >= editTextBoldCursorArr.length) {
                                                    break;
                                                } else {
                                                    intValue3 = i30 == 4 ? intValue3 + 2 : i30;
                                                }
                                            } while (((View) editTextBoldCursorArr[intValue3].getParent()).getVisibility() != 0);
                                            hl0Var4.f[intValue3].requestFocus();
                                            break;
                                        }
                                        break;
                                    default:
                                        hl0 hl0Var5 = this.b;
                                        if (i29 != 6) {
                                            hl0Var5.getClass();
                                            break;
                                        } else {
                                            hl0Var5.n.performClick();
                                            break;
                                        }
                                }
                                return false;
                            }
                        });
                        if (i10 == 9) {
                            TLRPC.TL_invoice tL_invoice3 = this.C0.invoice;
                            if (tL_invoice3.email_to_provider || tL_invoice3.phone_to_provider) {
                                TLRPC.User user = null;
                                int i29 = 0;
                                while (i29 < this.C0.users.size()) {
                                    TLRPC.User user2 = this.C0.users.get(i29);
                                    int i30 = i16;
                                    int i31 = i15;
                                    if (user2.id == this.C0.provider_id) {
                                        user = user2;
                                    }
                                    i29++;
                                    i16 = i30;
                                    i15 = i31;
                                }
                                i12 = i15;
                                i13 = i16;
                                String n10 = user != null ? org.telegram.messenger.g5.n(user.first_name, user.last_name) : "";
                                this.M[1] = new org.telegram.ui.Cells.z8(context, this.Y0);
                                org.telegram.ui.ActionBar.r6.a0(this.M[1], context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.k6.b7);
                                this.Q.addView(this.M[1], c8.ha.o(-1, -2));
                                TLRPC.TL_invoice tL_invoice4 = this.C0.invoice;
                                boolean z10 = tL_invoice4.email_to_provider;
                                if (z10 && tL_invoice4.phone_to_provider) {
                                    this.M[1].setText(org.telegram.messenger.hd.Y(2131747384, "PaymentPhoneEmailToProvider", n10));
                                } else if (z10) {
                                    this.M[1].setText(org.telegram.messenger.hd.Y(2131747402, "PaymentEmailToProvider", n10));
                                } else {
                                    this.M[1].setText(org.telegram.messenger.hd.Y(2131747383, "PaymentPhoneToProvider", n10));
                                }
                            } else {
                                this.K[1] = new org.telegram.ui.Cells.y6(context, (Object) null);
                                this.Q.addView(this.K[1], c8.ha.o(-1, -2));
                                i12 = i15;
                                i13 = i16;
                            }
                            org.telegram.ui.Cells.r8 r8Var = new org.telegram.ui.Cells.r8(context, this.Y0);
                            this.L = r8Var;
                            org.telegram.ui.ActionBar.r6.S(r8Var, org.telegram.ui.ActionBar.k6.N0(true), org.telegram.ui.ActionBar.r6.N(org.telegram.ui.ActionBar.k6.d6), org.telegram.ui.ActionBar.r6.N(org.telegram.ui.ActionBar.k6.i6));
                            this.L.f(org.telegram.messenger.hd.L0(2131747369), this.T0, false);
                            this.Q.addView(this.L, c8.ha.o(-1, -2));
                            this.L.setOnClickListener(new dk0(this, 9));
                            this.M[0] = new org.telegram.ui.Cells.z8(context, this.Y0);
                            org.telegram.ui.ActionBar.r6.a0(this.M[0], context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.k6.b7);
                            this.M[0].setText(org.telegram.messenger.hd.L0(2131747368));
                            this.Q.addView(this.M[0], c8.ha.o(-1, -2));
                        } else {
                            i12 = i15;
                            i13 = i16;
                        }
                        i10++;
                        i16 = i13;
                        i15 = i12;
                        i22 = 10;
                        i21 = 2;
                        i23 = 1;
                        i7 = 0;
                    }
                    int i32 = i15;
                    int i33 = i16;
                    if (this.C0.invoice.name_requested) {
                        i11 = 8;
                        ((ViewGroup) this.f[i32].getParent()).setVisibility(8);
                    } else {
                        i11 = 8;
                    }
                    if (!this.C0.invoice.phone_requested) {
                        ((ViewGroup) this.f[i11].getParent()).setVisibility(i11);
                    }
                    if (!this.C0.invoice.email_requested) {
                        ((ViewGroup) this.f[7].getParent()).setVisibility(i11);
                    }
                    tL_invoice = this.C0.invoice;
                    if (!tL_invoice.phone_requested) {
                        this.f[9].setImeOptions(268435462);
                    } else if (tL_invoice.email_requested) {
                        this.f[7].setImeOptions(268435462);
                    } else if (tL_invoice.name_requested) {
                        this.f[i32].setImeOptions(268435462);
                    } else {
                        this.f[5].setImeOptions(268435462);
                    }
                    y6Var = this.K[1];
                    if (y6Var == null) {
                        TLRPC.TL_invoice tL_invoice5 = this.C0.invoice;
                        y6Var.setVisibility((tL_invoice5.name_requested || tL_invoice5.phone_requested || tL_invoice5.email_requested) ? 0 : 8);
                    } else {
                        org.telegram.ui.Cells.z8 z8Var = this.M[1];
                        if (z8Var != null) {
                            TLRPC.TL_invoice tL_invoice6 = this.C0.invoice;
                            z8Var.setVisibility((tL_invoice6.name_requested || tL_invoice6.phone_requested || tL_invoice6.email_requested) ? 0 : 8);
                        }
                    }
                    org.telegram.ui.Cells.n4 n4Var = this.I[1];
                    TLRPC.TL_invoice tL_invoice7 = this.C0.invoice;
                    n4Var.setVisibility((!tL_invoice7.name_requested || tL_invoice7.phone_requested || tL_invoice7.email_requested) ? 0 : 8);
                    if (!this.C0.invoice.shipping_address_requested) {
                        this.I[0].setVisibility(8);
                        this.K[0].setVisibility(8);
                        ((ViewGroup) this.f[0].getParent()).setVisibility(8);
                        ((ViewGroup) this.f[1].getParent()).setVisibility(8);
                        ((ViewGroup) this.f[2].getParent()).setVisibility(8);
                        ((ViewGroup) this.f[i33].getParent()).setVisibility(8);
                        ((ViewGroup) this.f[4].getParent()).setVisibility(8);
                        ((ViewGroup) this.f[5].getParent()).setVisibility(8);
                    }
                    tL_paymentRequestedInfo2 = this.C0.saved_info;
                    if (tL_paymentRequestedInfo2 != null || TextUtils.isEmpty(tL_paymentRequestedInfo2.phone)) {
                        t0(null);
                    } else {
                        t0(this.C0.saved_info.phone);
                    }
                    if (this.f[8].length() == 0) {
                        TLRPC.PaymentForm paymentForm3 = this.C0;
                        if (paymentForm3.invoice.phone_requested && ((tL_paymentRequestedInfo3 = paymentForm3.saved_info) == null || TextUtils.isEmpty(tL_paymentRequestedInfo3.phone))) {
                            try {
                                telephonyManager = (TelephonyManager) org.telegram.messenger.t0.b.getSystemService("phone");
                            } catch (Exception e12) {
                                org.telegram.messenger.a8.f(e12);
                            }
                            if (telephonyManager != null) {
                                str2 = telephonyManager.getSimCountryIso().toUpperCase();
                                if (str2 != null && (str3 = (String) hashMap.get(str2)) != null && this.a.indexOf(str3) != -1) {
                                    this.f[8].setText((CharSequence) this.b.get(str3));
                                }
                            }
                            str2 = null;
                            if (str2 != null) {
                                this.f[8].setText((CharSequence) this.b.get(str3));
                            }
                        }
                    }
                }
                e = e11;
                org.telegram.messenger.a8.f(e);
                Collections.sort(this.a, new oe(i20));
                this.f = new EditTextBoldCursor[10];
                i10 = i7;
                while (i10 < i22) {
                }
                int i322 = i15;
                int i332 = i16;
                if (this.C0.invoice.name_requested) {
                }
                if (!this.C0.invoice.phone_requested) {
                }
                if (!this.C0.invoice.email_requested) {
                }
                tL_invoice = this.C0.invoice;
                if (!tL_invoice.phone_requested) {
                }
                y6Var = this.K[1];
                if (y6Var == null) {
                }
                org.telegram.ui.Cells.n4 n4Var2 = this.I[1];
                TLRPC.TL_invoice tL_invoice72 = this.C0.invoice;
                n4Var2.setVisibility((!tL_invoice72.name_requested || tL_invoice72.phone_requested || tL_invoice72.email_requested) ? 0 : 8);
                if (!this.C0.invoice.shipping_address_requested) {
                }
                tL_paymentRequestedInfo2 = this.C0.saved_info;
                if (tL_paymentRequestedInfo2 != null) {
                }
                t0(null);
                if (this.f[8].length() == 0) {
                }
            }
        } else {
            int i34 = 3;
            int i35 = 2131747418;
            if (i19 == 2) {
                if (this.C0.native_params != null) {
                    try {
                        JSONObject jSONObject = new JSONObject(this.C0.native_params.data);
                        String optString = jSONObject.optString("google_pay_public_key");
                        if (!TextUtils.isEmpty(optString)) {
                            this.K0 = optString;
                        }
                        this.L0 = jSONObject.optString("acquirer_bank_country");
                        this.M0 = jSONObject.optJSONObject("gpay_parameters");
                    } catch (Exception e13) {
                        org.telegram.messenger.a8.f(e13);
                    }
                }
                if (this.S0 || this.F0 != null) {
                    if (this.K0 != null || this.M0 != null) {
                        B0(context);
                    }
                    s0(context);
                    this.Q.addView(this.O, c8.ha.o(-1, 50));
                    this.z0 = true;
                    N0(true, true);
                    this.r.setVisibility(0);
                    this.n.setEnabled(false);
                    this.n.getContentView().setVisibility(4);
                    org.telegram.messenger.g0.u(context, true);
                    org.telegram.ui.Components.e71 e71Var = new org.telegram.ui.Components.e71(this, context);
                    this.x = e71Var;
                    e71Var.getSettings().setJavaScriptEnabled(true);
                    this.x.getSettings().setDomStorageEnabled(true);
                    this.x.getSettings().setSupportZoom(true);
                    this.x.getSettings().setBuiltInZoomControls(true);
                    this.x.getSettings().setDisplayZoomControls(false);
                    this.x.getSettings().setUseWideViewPort(true);
                    this.x.getSettings().setMixedContentMode(0);
                    CookieManager.getInstance().setAcceptThirdPartyCookies(this.x, true);
                    this.x.addJavascriptInterface(new PaymentFormActivity$TelegramWebviewProxy(this), "TelegramWebviewProxy");
                    this.x.setWebViewClient(new uk0(this, context, 1));
                    this.Q.addView(this.x, c8.ha.c(-2.0f, -1));
                    this.K[2] = new org.telegram.ui.Cells.y6(context, (Object) null);
                    this.Q.addView(this.K[2], c8.ha.o(-1, -2));
                    org.telegram.ui.Cells.r8 r8Var2 = new org.telegram.ui.Cells.r8(context, this.Y0);
                    this.L = r8Var2;
                    org.telegram.ui.ActionBar.r6.S(r8Var2, org.telegram.ui.ActionBar.k6.N0(true), org.telegram.ui.ActionBar.r6.N(org.telegram.ui.ActionBar.k6.d6), org.telegram.ui.ActionBar.r6.N(org.telegram.ui.ActionBar.k6.i6));
                    this.L.f(org.telegram.messenger.hd.L0(2131747421), this.U0, false);
                    this.Q.addView(this.L, c8.ha.o(-1, -2));
                    this.L.setOnClickListener(new dk0(this, 10));
                    this.M[0] = new org.telegram.ui.Cells.z8(context, this.Y0);
                    org.telegram.ui.ActionBar.r6.a0(this.M[0], context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.k6.b7);
                    Q0();
                    this.Q.addView(this.M[0], c8.ha.o(-1, -2));
                } else {
                    if (this.C0.native_params != null) {
                        try {
                            JSONObject jSONObject2 = new JSONObject(this.C0.native_params.data);
                            try {
                                this.g0 = jSONObject2.getBoolean("need_country");
                            } catch (Exception unused) {
                                this.g0 = false;
                            }
                            try {
                                this.h0 = jSONObject2.getBoolean("need_zip");
                            } catch (Exception unused2) {
                                this.h0 = false;
                            }
                            try {
                                this.i0 = jSONObject2.getBoolean("need_cardholder_name");
                            } catch (Exception unused3) {
                                this.i0 = false;
                            }
                            if (jSONObject2.has("public_token")) {
                                this.j0 = jSONObject2.getString("public_token");
                            } else {
                                try {
                                    this.j0 = jSONObject2.getString("publishable_key");
                                } catch (Exception unused4) {
                                    this.j0 = "";
                                }
                            }
                            this.k0 = !jSONObject2.optBoolean("google_pay_hidden", false);
                        } catch (Exception e14) {
                            org.telegram.messenger.a8.f(e14);
                        }
                    }
                    if (this.k0 && ((!TextUtils.isEmpty(this.j0) && "stripe".equals(this.C0.native_provider)) || this.M0 != null)) {
                        B0(context);
                    }
                    int i36 = 6;
                    this.f = new EditTextBoldCursor[6];
                    int i37 = 0;
                    while (i37 < i36) {
                        if (i37 == 0) {
                            this.I[0] = new org.telegram.ui.Cells.n4(context, this.Y0);
                            org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d6, this.I[0], getResourceProvider());
                            this.I[0].setText(org.telegram.messenger.hd.L0(2131747418));
                            this.Q.addView(this.I[0], c8.ha.o(-1, -2));
                        } else if (i37 == 4) {
                            this.I[1] = new org.telegram.ui.Cells.n4(context, this.Y0);
                            org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d6, this.I[1], getResourceProvider());
                            this.I[1].setText(org.telegram.messenger.hd.L0(2131747427));
                            this.Q.addView(this.I[1], c8.ha.o(-1, -2));
                        }
                        boolean z11 = (i37 == i34 || i37 == 5 || (i37 == 4 && !this.h0)) ? false : true;
                        FrameLayout frameLayout3 = new FrameLayout(context);
                        frameLayout3.setClipChildren(false);
                        int i38 = org.telegram.ui.ActionBar.k6.d6;
                        org.telegram.ui.ActionBar.r6.i(i38, frameLayout3, getResourceProvider());
                        this.Q.addView(frameLayout3, c8.ha.o(-1, 50));
                        this.f[i37] = new EditTextBoldCursor(context);
                        this.f[i37].setTag(Integer.valueOf(i37));
                        this.f[i37].setTextSize(1, 16.0f);
                        org.telegram.ui.ActionBar.r6.E(this.f[i37], org.telegram.ui.ActionBar.k6.H6, getResourceProvider());
                        EditTextBoldCursor editTextBoldCursor4 = this.f[i37];
                        int i39 = org.telegram.ui.ActionBar.k6.G6;
                        org.telegram.ui.ActionBar.r6.V(editTextBoldCursor4, i39, getResourceProvider());
                        this.f[i37].setBackgroundDrawable(null);
                        org.telegram.ui.ActionBar.r6.w(this.f[i37], i39, getResourceProvider());
                        this.f[i37].setCursorSize(org.telegram.messenger.g0.L(20.0f));
                        this.f[i37].setCursorWidth(1.5f);
                        if (i37 == 3) {
                            this.f[i37].setFilters(new InputFilter[]{new InputFilter.LengthFilter(3)});
                            this.f[i37].setInputType(org.telegram.messenger.qs.O1);
                            this.f[i37].setTypeface(Typeface.DEFAULT);
                            this.f[i37].setTransformationMethod(PasswordTransformationMethod.getInstance());
                        } else if (i37 == 0) {
                            this.f[i37].setInputType(3);
                        } else if (i37 == 4) {
                            final int i40 = 1;
                            this.f[i37].setOnTouchListener(new View.OnTouchListener(this) { // from class: org.telegram.ui.ek0
                                public final /* synthetic */ hl0 b;

                                {
                                    this.b = this;
                                }

                                @Override // android.view.View.OnTouchListener
                                public final boolean onTouch(View view, MotionEvent motionEvent) {
                                    switch (i40) {
                                        case 0:
                                            hl0 hl0Var = this.b;
                                            if (hl0Var.getParentActivity() != null) {
                                                if (motionEvent.getAction() == 1) {
                                                    qs qsVar = new qs(null, false);
                                                    qsVar.n = true;
                                                    qsVar.r = new jk0(hl0Var, 4);
                                                    hl0Var.presentFragment(qsVar);
                                                }
                                                break;
                                            }
                                            break;
                                        default:
                                            hl0 hl0Var2 = this.b;
                                            if (hl0Var2.getParentActivity() != null) {
                                                if (motionEvent.getAction() == 1) {
                                                    qs qsVar2 = new qs(null, false);
                                                    qsVar2.n = true;
                                                    qsVar2.r = new jk0(hl0Var2, 2);
                                                    hl0Var2.presentFragment(qsVar2);
                                                }
                                                break;
                                            }
                                            break;
                                    }
                                    return true;
                                }
                            });
                            this.f[i37].setInputType(0);
                        } else if (i37 == 1) {
                            this.f[i37].setInputType(16386);
                        } else if (i37 == 2) {
                            this.f[i37].setInputType(4097);
                        } else {
                            this.f[i37].setInputType(16385);
                            this.f[i37].setImeOptions(268435461);
                            if (i37 != 0) {
                                this.f[i37].setHint(org.telegram.messenger.hd.L0(2131747422));
                            } else if (i37 == 1) {
                                this.f[i37].setHint(org.telegram.messenger.hd.L0(2131747425));
                            } else if (i37 == 2) {
                                this.f[i37].setHint(org.telegram.messenger.hd.L0(2131747423));
                            } else if (i37 == 3) {
                                this.f[i37].setHint(org.telegram.messenger.hd.L0(2131747426));
                            } else if (i37 == 4) {
                                this.f[i37].setHint(org.telegram.messenger.hd.L0(2131747376));
                            } else if (i37 == 5) {
                                this.f[i37].setHint(org.telegram.messenger.hd.L0(2131747366));
                            }
                            if (i37 != 0) {
                                this.f[i37].addTextChangedListener(new bl0(this));
                            } else if (i37 == 1) {
                                this.f[i37].addTextChangedListener(new cl0(this));
                            }
                            this.f[i37].setPadding(0, 0, 0, org.telegram.messenger.g0.L(6.0f));
                            this.f[i37].setGravity(!org.telegram.messenger.hd.a0 ? 5 : 3);
                            frameLayout3.addView(this.f[i37], c8.ha.d(-1, -2.0f, 51, 21.0f, 12.0f, 21.0f, 6.0f));
                            final int i41 = 3;
                            this.f[i37].setOnEditorActionListener(new TextView.OnEditorActionListener(this) { // from class: org.telegram.ui.hk0
                                public final /* synthetic */ hl0 b;

                                {
                                    this.b = this;
                                }

                                @Override // android.widget.TextView.OnEditorActionListener
                                public final boolean onEditorAction(TextView textView2, int i292, KeyEvent keyEvent) {
                                    EditTextBoldCursor[] editTextBoldCursorArr;
                                    switch (i41) {
                                        case 0:
                                            hl0 hl0Var = this.b;
                                            if (i292 != 6) {
                                                hl0Var.getClass();
                                                break;
                                            } else {
                                                hl0Var.G0(false);
                                                break;
                                            }
                                        case 1:
                                            hl0 hl0Var2 = this.b;
                                            if (i292 != 6) {
                                                hl0Var2.getClass();
                                                if (i292 == 5) {
                                                    int intValue = ((Integer) textView2.getTag()).intValue();
                                                    if (intValue != 0) {
                                                        if (intValue == 1) {
                                                            hl0Var2.f[2].requestFocus();
                                                            break;
                                                        }
                                                    } else {
                                                        hl0Var2.f[1].requestFocus();
                                                        break;
                                                    }
                                                }
                                            } else {
                                                hl0Var2.n.performClick();
                                                break;
                                            }
                                            break;
                                        case 2:
                                            hl0 hl0Var3 = this.b;
                                            hl0Var3.getClass();
                                            if (i292 != 5) {
                                                if (i292 == 6) {
                                                    hl0Var3.n.performClick();
                                                    break;
                                                }
                                            } else {
                                                int intValue2 = ((Integer) textView2.getTag()).intValue();
                                                while (true) {
                                                    intValue2++;
                                                    EditTextBoldCursor[] editTextBoldCursorArr2 = hl0Var3.f;
                                                    if (intValue2 >= editTextBoldCursorArr2.length) {
                                                        break;
                                                    } else if (intValue2 != 4 && ((View) editTextBoldCursorArr2[intValue2].getParent()).getVisibility() == 0) {
                                                        hl0Var3.f[intValue2].requestFocus();
                                                        break;
                                                    }
                                                }
                                            }
                                            break;
                                        case 3:
                                            hl0 hl0Var4 = this.b;
                                            hl0Var4.getClass();
                                            if (i292 != 5) {
                                                if (i292 == 6) {
                                                    hl0Var4.n.performClick();
                                                    break;
                                                }
                                            } else {
                                                int intValue3 = ((Integer) textView2.getTag()).intValue();
                                                do {
                                                    int i302 = intValue3 + 1;
                                                    editTextBoldCursorArr = hl0Var4.f;
                                                    if (i302 >= editTextBoldCursorArr.length) {
                                                        break;
                                                    } else {
                                                        intValue3 = i302 == 4 ? intValue3 + 2 : i302;
                                                    }
                                                } while (((View) editTextBoldCursorArr[intValue3].getParent()).getVisibility() != 0);
                                                hl0Var4.f[intValue3].requestFocus();
                                                break;
                                            }
                                            break;
                                        default:
                                            hl0 hl0Var5 = this.b;
                                            if (i292 != 6) {
                                                hl0Var5.getClass();
                                                break;
                                            } else {
                                                hl0Var5.n.performClick();
                                                break;
                                            }
                                    }
                                    return false;
                                }
                            });
                            if (i37 != 3) {
                                this.K[0] = new org.telegram.ui.Cells.y6(context, (Object) null);
                                this.Q.addView(this.K[0], c8.ha.o(-1, -2));
                            } else if (i37 == 5) {
                                this.K[2] = new org.telegram.ui.Cells.y6(context, (Object) null);
                                this.Q.addView(this.K[2], c8.ha.o(-1, -2));
                                org.telegram.ui.Cells.r8 r8Var3 = new org.telegram.ui.Cells.r8(context, this.Y0);
                                this.L = r8Var3;
                                org.telegram.ui.ActionBar.r6.S(r8Var3, org.telegram.ui.ActionBar.k6.N0(true), org.telegram.ui.ActionBar.r6.N(i38), org.telegram.ui.ActionBar.r6.N(org.telegram.ui.ActionBar.k6.i6));
                                this.L.f(org.telegram.messenger.hd.L0(2131747421), this.U0, false);
                                this.Q.addView(this.L, c8.ha.o(-1, -2));
                                this.L.setOnClickListener(new dk0(this, 11));
                                this.M[0] = new org.telegram.ui.Cells.z8(context, this.Y0);
                                org.telegram.ui.ActionBar.r6.a0(this.M[0], context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.k6.b7);
                                Q0();
                                this.Q.addView(this.M[0], c8.ha.o(-1, -2));
                            } else if (i37 == 0) {
                                s0(context);
                                frameLayout3.addView(this.O, c8.ha.d(-2, -2.0f, (org.telegram.messenger.hd.a0 ? 3 : 5) | 16, 0.0f, 0.0f, 4.0f, 0.0f));
                            }
                            if (z11) {
                                org.telegram.ui.Components.tm tmVar2 = new org.telegram.ui.Components.tm(context, 18);
                                org.telegram.ui.ActionBar.r6.i(i38, tmVar2, getResourceProvider());
                                this.J.add(tmVar2);
                                frameLayout3.addView(tmVar2, new FrameLayout.LayoutParams(-1, 1, 83));
                            }
                            if ((i37 == 4 && !this.g0) || ((i37 == 5 && !this.h0) || (i37 == 2 && !this.i0))) {
                                frameLayout3.setVisibility(8);
                            }
                            i37++;
                            i36 = 6;
                            i34 = 3;
                        }
                        this.f[i37].setImeOptions(268435461);
                        if (i37 != 0) {
                        }
                        if (i37 != 0) {
                        }
                        this.f[i37].setPadding(0, 0, 0, org.telegram.messenger.g0.L(6.0f));
                        this.f[i37].setGravity(!org.telegram.messenger.hd.a0 ? 5 : 3);
                        frameLayout3.addView(this.f[i37], c8.ha.d(-1, -2.0f, 51, 21.0f, 12.0f, 21.0f, 6.0f));
                        final int i412 = 3;
                        this.f[i37].setOnEditorActionListener(new TextView.OnEditorActionListener(this) { // from class: org.telegram.ui.hk0
                            public final /* synthetic */ hl0 b;

                            {
                                this.b = this;
                            }

                            @Override // android.widget.TextView.OnEditorActionListener
                            public final boolean onEditorAction(TextView textView2, int i292, KeyEvent keyEvent) {
                                EditTextBoldCursor[] editTextBoldCursorArr;
                                switch (i412) {
                                    case 0:
                                        hl0 hl0Var = this.b;
                                        if (i292 != 6) {
                                            hl0Var.getClass();
                                            break;
                                        } else {
                                            hl0Var.G0(false);
                                            break;
                                        }
                                    case 1:
                                        hl0 hl0Var2 = this.b;
                                        if (i292 != 6) {
                                            hl0Var2.getClass();
                                            if (i292 == 5) {
                                                int intValue = ((Integer) textView2.getTag()).intValue();
                                                if (intValue != 0) {
                                                    if (intValue == 1) {
                                                        hl0Var2.f[2].requestFocus();
                                                        break;
                                                    }
                                                } else {
                                                    hl0Var2.f[1].requestFocus();
                                                    break;
                                                }
                                            }
                                        } else {
                                            hl0Var2.n.performClick();
                                            break;
                                        }
                                        break;
                                    case 2:
                                        hl0 hl0Var3 = this.b;
                                        hl0Var3.getClass();
                                        if (i292 != 5) {
                                            if (i292 == 6) {
                                                hl0Var3.n.performClick();
                                                break;
                                            }
                                        } else {
                                            int intValue2 = ((Integer) textView2.getTag()).intValue();
                                            while (true) {
                                                intValue2++;
                                                EditTextBoldCursor[] editTextBoldCursorArr2 = hl0Var3.f;
                                                if (intValue2 >= editTextBoldCursorArr2.length) {
                                                    break;
                                                } else if (intValue2 != 4 && ((View) editTextBoldCursorArr2[intValue2].getParent()).getVisibility() == 0) {
                                                    hl0Var3.f[intValue2].requestFocus();
                                                    break;
                                                }
                                            }
                                        }
                                        break;
                                    case 3:
                                        hl0 hl0Var4 = this.b;
                                        hl0Var4.getClass();
                                        if (i292 != 5) {
                                            if (i292 == 6) {
                                                hl0Var4.n.performClick();
                                                break;
                                            }
                                        } else {
                                            int intValue3 = ((Integer) textView2.getTag()).intValue();
                                            do {
                                                int i302 = intValue3 + 1;
                                                editTextBoldCursorArr = hl0Var4.f;
                                                if (i302 >= editTextBoldCursorArr.length) {
                                                    break;
                                                } else {
                                                    intValue3 = i302 == 4 ? intValue3 + 2 : i302;
                                                }
                                            } while (((View) editTextBoldCursorArr[intValue3].getParent()).getVisibility() != 0);
                                            hl0Var4.f[intValue3].requestFocus();
                                            break;
                                        }
                                        break;
                                    default:
                                        hl0 hl0Var5 = this.b;
                                        if (i292 != 6) {
                                            hl0Var5.getClass();
                                            break;
                                        } else {
                                            hl0Var5.n.performClick();
                                            break;
                                        }
                                }
                                return false;
                            }
                        });
                        if (i37 != 3) {
                        }
                        if (z11) {
                        }
                        if (i37 == 4) {
                            frameLayout3.setVisibility(8);
                            i37++;
                            i36 = 6;
                            i34 = 3;
                        }
                        frameLayout3.setVisibility(8);
                        i37++;
                        i36 = 6;
                        i34 = 3;
                    }
                    if (!this.g0 && !this.h0) {
                        this.I[1].setVisibility(8);
                        this.K[0].setVisibility(8);
                    }
                    if (this.h0) {
                        this.f[5].setImeOptions(268435462);
                    } else {
                        this.f[3].setImeOptions(268435462);
                    }
                }
            } else if (i19 == 1) {
                ArrayList<TLRPC.TL_shippingOption> arrayList = this.E0.shipping_options;
                int size = arrayList == null ? 0 : arrayList.size();
                this.h = new org.telegram.ui.Cells.i6[size];
                int i42 = 0;
                while (i42 < size) {
                    TLRPC.TL_shippingOption tL_shippingOption = this.E0.shipping_options.get(i42);
                    this.h[i42] = new org.telegram.ui.Cells.i6(context);
                    this.h[i42].setTag(Integer.valueOf(i42));
                    org.telegram.ui.ActionBar.r6.S(this.h[i42], org.telegram.ui.ActionBar.k6.N0(true), org.telegram.ui.ActionBar.r6.N(org.telegram.ui.ActionBar.k6.d6), org.telegram.ui.ActionBar.r6.N(org.telegram.ui.ActionBar.k6.i6));
                    this.h[i42].c(a8.p0.D(y0(tL_shippingOption.prices), " - ", tL_shippingOption.title), i42 == 0, i42 != size + (-1));
                    this.h[i42].setOnClickListener(new dk0(this, 12));
                    this.Q.addView(this.h[i42]);
                    i42++;
                }
                this.M[0] = new org.telegram.ui.Cells.z8(context, this.Y0);
                org.telegram.ui.ActionBar.r6.a0(this.M[0], context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.k6.b7);
                this.Q.addView(this.M[0], c8.ha.o(-1, -2));
            } else {
                int i43 = org.telegram.messenger.qs.N1;
                if (i19 == 3) {
                    this.f = new EditTextBoldCursor[2];
                    int i44 = 0;
                    for (int i45 = 2; i44 < i45; i45 = 2) {
                        if (i44 == 0) {
                            z9 = false;
                            this.I[0] = new org.telegram.ui.Cells.n4(context, this.Y0);
                            org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d6, this.I[0], getResourceProvider());
                            this.I[0].setText(org.telegram.messenger.hd.L0(i35));
                            this.Q.addView(this.I[0], c8.ha.o(-1, -2));
                        } else {
                            z9 = false;
                        }
                        FrameLayout frameLayout4 = new FrameLayout(context);
                        frameLayout4.setClipChildren(z9);
                        this.Q.addView(frameLayout4, c8.ha.o(-1, 50));
                        int i46 = org.telegram.ui.ActionBar.k6.d6;
                        org.telegram.ui.ActionBar.r6.i(i46, frameLayout4, getResourceProvider());
                        boolean z12 = i44 != 1;
                        if (z12) {
                            if (i44 != 7 || this.C0.invoice.phone_requested) {
                                if (i44 == 6) {
                                    TLRPC.TL_invoice tL_invoice8 = this.C0.invoice;
                                    if (!tL_invoice8.phone_requested) {
                                    }
                                }
                            }
                            z12 = false;
                        }
                        if (z12) {
                            org.telegram.ui.Components.tm tmVar3 = new org.telegram.ui.Components.tm(context, 15);
                            org.telegram.ui.ActionBar.r6.i(i46, tmVar3, getResourceProvider());
                            this.J.add(tmVar3);
                            frameLayout4.addView(tmVar3, new FrameLayout.LayoutParams(-1, 1, 83));
                        }
                        this.f[i44] = new EditTextBoldCursor(context);
                        this.f[i44].setTag(Integer.valueOf(i44));
                        this.f[i44].setTextSize(1, 16.0f);
                        org.telegram.ui.ActionBar.r6.E(this.f[i44], org.telegram.ui.ActionBar.k6.H6, getResourceProvider());
                        EditTextBoldCursor editTextBoldCursor5 = this.f[i44];
                        int i47 = org.telegram.ui.ActionBar.k6.G6;
                        org.telegram.ui.ActionBar.r6.V(editTextBoldCursor5, i47, getResourceProvider());
                        this.f[i44].setBackgroundDrawable(null);
                        org.telegram.ui.ActionBar.r6.w(this.f[i44], i47, getResourceProvider());
                        this.f[i44].setCursorSize(org.telegram.messenger.g0.L(20.0f));
                        this.f[i44].setCursorWidth(1.5f);
                        if (i44 == 0) {
                            this.f[i44].setOnTouchListener(new ei.b(29));
                            this.f[i44].setInputType(0);
                        } else {
                            this.f[i44].setInputType(org.telegram.messenger.qs.N1);
                            this.f[i44].setTypeface(Typeface.DEFAULT);
                        }
                        this.f[i44].setImeOptions(268435462);
                        if (i44 == 0) {
                            EditTextBoldCursor editTextBoldCursor6 = this.f[i44];
                            TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard = this.y0;
                            editTextBoldCursor6.setText(tL_paymentSavedCredentialsCard == null ? "" : tL_paymentSavedCredentialsCard.title);
                        } else if (i44 == 1) {
                            this.f[i44].setHint(org.telegram.messenger.hd.L0(2131748725));
                            this.f[i44].requestFocus();
                        }
                        this.f[i44].setPadding(0, 0, 0, org.telegram.messenger.g0.L(6.0f));
                        this.f[i44].setGravity(org.telegram.messenger.hd.a0 ? 5 : 3);
                        frameLayout4.addView(this.f[i44], c8.ha.d(-1, -2.0f, 51, 21.0f, 12.0f, 21.0f, 6.0f));
                        final int i48 = 4;
                        this.f[i44].setOnEditorActionListener(new TextView.OnEditorActionListener(this) { // from class: org.telegram.ui.hk0
                            public final /* synthetic */ hl0 b;

                            {
                                this.b = this;
                            }

                            @Override // android.widget.TextView.OnEditorActionListener
                            public final boolean onEditorAction(TextView textView2, int i292, KeyEvent keyEvent) {
                                EditTextBoldCursor[] editTextBoldCursorArr;
                                switch (i48) {
                                    case 0:
                                        hl0 hl0Var = this.b;
                                        if (i292 != 6) {
                                            hl0Var.getClass();
                                            break;
                                        } else {
                                            hl0Var.G0(false);
                                            break;
                                        }
                                    case 1:
                                        hl0 hl0Var2 = this.b;
                                        if (i292 != 6) {
                                            hl0Var2.getClass();
                                            if (i292 == 5) {
                                                int intValue = ((Integer) textView2.getTag()).intValue();
                                                if (intValue != 0) {
                                                    if (intValue == 1) {
                                                        hl0Var2.f[2].requestFocus();
                                                        break;
                                                    }
                                                } else {
                                                    hl0Var2.f[1].requestFocus();
                                                    break;
                                                }
                                            }
                                        } else {
                                            hl0Var2.n.performClick();
                                            break;
                                        }
                                        break;
                                    case 2:
                                        hl0 hl0Var3 = this.b;
                                        hl0Var3.getClass();
                                        if (i292 != 5) {
                                            if (i292 == 6) {
                                                hl0Var3.n.performClick();
                                                break;
                                            }
                                        } else {
                                            int intValue2 = ((Integer) textView2.getTag()).intValue();
                                            while (true) {
                                                intValue2++;
                                                EditTextBoldCursor[] editTextBoldCursorArr2 = hl0Var3.f;
                                                if (intValue2 >= editTextBoldCursorArr2.length) {
                                                    break;
                                                } else if (intValue2 != 4 && ((View) editTextBoldCursorArr2[intValue2].getParent()).getVisibility() == 0) {
                                                    hl0Var3.f[intValue2].requestFocus();
                                                    break;
                                                }
                                            }
                                        }
                                        break;
                                    case 3:
                                        hl0 hl0Var4 = this.b;
                                        hl0Var4.getClass();
                                        if (i292 != 5) {
                                            if (i292 == 6) {
                                                hl0Var4.n.performClick();
                                                break;
                                            }
                                        } else {
                                            int intValue3 = ((Integer) textView2.getTag()).intValue();
                                            do {
                                                int i302 = intValue3 + 1;
                                                editTextBoldCursorArr = hl0Var4.f;
                                                if (i302 >= editTextBoldCursorArr.length) {
                                                    break;
                                                } else {
                                                    intValue3 = i302 == 4 ? intValue3 + 2 : i302;
                                                }
                                            } while (((View) editTextBoldCursorArr[intValue3].getParent()).getVisibility() != 0);
                                            hl0Var4.f[intValue3].requestFocus();
                                            break;
                                        }
                                        break;
                                    default:
                                        hl0 hl0Var5 = this.b;
                                        if (i292 != 6) {
                                            hl0Var5.getClass();
                                            break;
                                        } else {
                                            hl0Var5.n.performClick();
                                            break;
                                        }
                                }
                                return false;
                            }
                        });
                        if (i44 == 1) {
                            this.M[0] = new org.telegram.ui.Cells.z8(context, this.Y0);
                            org.telegram.ui.Cells.z8 z8Var2 = this.M[0];
                            TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard2 = this.y0;
                            z8Var2.setText(org.telegram.messenger.hd.Y(2131747405, "PaymentConfirmationMessage", tL_paymentSavedCredentialsCard2 == null ? "" : tL_paymentSavedCredentialsCard2.title));
                            org.telegram.ui.Cells.z8 z8Var3 = this.M[0];
                            int i49 = org.telegram.ui.ActionBar.k6.b7;
                            org.telegram.ui.ActionBar.r6.a0(z8Var3, context, R.drawable.greydivider, i49);
                            this.Q.addView(this.M[0], c8.ha.o(-1, -2));
                            this.N[0] = new org.telegram.ui.Cells.w9(context, this.Y0);
                            org.telegram.ui.ActionBar.r6.S(this.N[0], org.telegram.ui.ActionBar.k6.N0(true), org.telegram.ui.ActionBar.r6.N(i46), org.telegram.ui.ActionBar.r6.N(org.telegram.ui.ActionBar.k6.i6));
                            this.N[0].b(org.telegram.messenger.hd.L0(2131747404), false);
                            this.Q.addView(this.N[0], c8.ha.o(-1, -2));
                            this.N[0].setOnClickListener(new dk0(this, 14));
                            this.M[1] = new org.telegram.ui.Cells.z8(context, this.Y0);
                            org.telegram.ui.ActionBar.r6.a0(this.M[1], context, R.drawable.greydivider_bottom, i49);
                            this.Q.addView(this.M[1], c8.ha.o(-1, -2));
                        }
                        i44++;
                        i35 = 2131747418;
                    }
                } else if (i19 == 4 || i19 == 5) {
                    org.telegram.ui.Cells.j5 j5Var = new org.telegram.ui.Cells.j5(context);
                    this.X = j5Var;
                    org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d6, j5Var, getResourceProvider());
                    org.telegram.messenger.ij ijVar = this.N0;
                    if (ijVar != null) {
                        this.X.b((TLRPC.TL_messageMediaInvoice) ijVar.k.media, this.p0);
                    } else {
                        TLRPC.PaymentReceipt paymentReceipt = this.D0;
                        if (paymentReceipt != null) {
                            this.X.c(paymentReceipt, this.p0);
                        } else if (this.O0 != null || this.b1 != null) {
                            org.telegram.ui.Cells.j5 j5Var2 = this.X;
                            TLRPC.PaymentForm paymentForm4 = this.C0;
                            j5Var2.a(paymentForm4.title, paymentForm4.description, paymentForm4.photo, this.p0, paymentForm4);
                        }
                    }
                    this.Q.addView(this.X, c8.ha.o(-1, -2));
                    this.K[0] = new org.telegram.ui.Cells.y6(context, (Object) null);
                    this.Q.addView(this.K[0], c8.ha.o(-1, -2));
                    ArrayList arrayList2 = new ArrayList(this.C0.invoice.prices);
                    this.t0 = arrayList2;
                    TLRPC.TL_shippingOption tL_shippingOption2 = this.G0;
                    if (tL_shippingOption2 != null) {
                        arrayList2.addAll(tL_shippingOption2.prices);
                    }
                    this.R0 = new String[1];
                    for (int i50 = 0; i50 < this.t0.size(); i50++) {
                        TLRPC.TL_labeledPrice tL_labeledPrice = (TLRPC.TL_labeledPrice) this.t0.get(i50);
                        org.telegram.ui.Cells.a9 a9Var = new org.telegram.ui.Cells.a9(context);
                        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d6, a9Var, getResourceProvider());
                        a9Var.a(tL_labeledPrice.label, org.telegram.messenger.hd.E0().p(tL_labeledPrice.amount, this.C0.invoice.currency), false);
                        this.Q.addView(a9Var);
                    }
                    if (this.u0 == 5 && this.H0 != null) {
                        org.telegram.ui.Cells.a9 a9Var2 = new org.telegram.ui.Cells.a9(context);
                        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d6, a9Var2, getResourceProvider());
                        a9Var2.a(org.telegram.messenger.hd.L0(2131747356), org.telegram.messenger.hd.E0().p(this.H0.longValue(), this.C0.invoice.currency), false);
                        this.Q.addView(a9Var2);
                    }
                    org.telegram.ui.Cells.a9 a9Var3 = new org.telegram.ui.Cells.a9(context);
                    this.R = a9Var3;
                    int i51 = org.telegram.ui.ActionBar.k6.d6;
                    org.telegram.ui.ActionBar.r6.i(i51, a9Var3, getResourceProvider());
                    this.R0[0] = y0(this.t0);
                    this.R.a(org.telegram.messenger.hd.L0(2131747352), this.R0[0], true);
                    float f10 = 14.0f;
                    if (this.u0 == 4 && (this.C0.invoice.flags & 256) != 0) {
                        FrameLayout frameLayout5 = new FrameLayout(context);
                        frameLayout5.setClipChildren(false);
                        org.telegram.ui.ActionBar.r6.i(i51, frameLayout5, getResourceProvider());
                        this.Q.addView(frameLayout5, c8.ha.o(-1, this.C0.invoice.suggested_tip_amounts.isEmpty() ? 40 : 78));
                        frameLayout5.setOnClickListener(new dk0(this, 0));
                        org.telegram.ui.Cells.a9 a9Var4 = new org.telegram.ui.Cells.a9(context);
                        org.telegram.ui.ActionBar.r6.i(i51, a9Var4, getResourceProvider());
                        a9Var4.a(org.telegram.messenger.hd.L0(2131747355), "", false);
                        frameLayout5.addView(a9Var4);
                        this.f = new EditTextBoldCursor[]{new EditTextBoldCursor(context)};
                        this.f[0].setTag(0);
                        this.f[0].setTextSize(1, 16.0f);
                        EditTextBoldCursor editTextBoldCursor7 = this.f[0];
                        int i52 = org.telegram.ui.ActionBar.k6.z6;
                        org.telegram.ui.ActionBar.r6.E(editTextBoldCursor7, i52, getResourceProvider());
                        org.telegram.ui.ActionBar.r6.V(this.f[0], i52, getResourceProvider());
                        this.f[0].setBackgroundDrawable(null);
                        org.telegram.ui.ActionBar.r6.w(this.f[0], org.telegram.ui.ActionBar.k6.G6, getResourceProvider());
                        this.f[0].setCursorSize(org.telegram.messenger.g0.L(20.0f));
                        this.f[0].setCursorWidth(1.5f);
                        this.f[0].setInputType(3);
                        this.f[0].setImeOptions(268435462);
                        this.f[0].setHint(org.telegram.messenger.hd.E0().p(0L, this.C0.invoice.currency));
                        this.f[0].setPadding(0, 0, 0, org.telegram.messenger.g0.L(6.0f));
                        this.f[0].setGravity(org.telegram.messenger.hd.a0 ? 3 : 5);
                        frameLayout5.addView(this.f[0], c8.ha.d(-1, -2.0f, 51, 21.0f, 9.0f, 21.0f, 1.0f));
                        this.f[0].addTextChangedListener(new mk0(this));
                        this.f[0].setOnEditorActionListener(new org.telegram.ui.Components.l2(3));
                        this.f[0].requestFocus();
                        if (!this.C0.invoice.suggested_tip_amounts.isEmpty()) {
                            HorizontalScrollView horizontalScrollView = new HorizontalScrollView(context);
                            horizontalScrollView.setHorizontalScrollBarEnabled(false);
                            horizontalScrollView.setVerticalScrollBarEnabled(false);
                            horizontalScrollView.setClipToPadding(false);
                            horizontalScrollView.setPadding(org.telegram.messenger.g0.L(21.0f), 0, org.telegram.messenger.g0.L(21.0f), 0);
                            horizontalScrollView.setFillViewport(true);
                            frameLayout5.addView(horizontalScrollView, c8.ha.d(-1, 30.0f, 51, 0.0f, 44.0f, 0.0f, 0.0f));
                            int[] iArr = new int[1];
                            int[] iArr2 = new int[1];
                            int size2 = this.C0.invoice.suggested_tip_amounts.size();
                            nk0 nk0Var = new nk0(context, size2, iArr, iArr2);
                            this.s0 = nk0Var;
                            nk0Var.setOrientation(0);
                            horizontalScrollView.addView(this.s0, c8.ha.x(-1, 30, 51));
                            int themedColor = getThemedColor(org.telegram.ui.ActionBar.k6.Si);
                            int i53 = 0;
                            while (i53 < size2) {
                                long longValue = org.telegram.messenger.hd.a0 ? this.C0.invoice.suggested_tip_amounts.get((size2 - i53) - 1).longValue() : this.C0.invoice.suggested_tip_amounts.get(i53).longValue();
                                String p10 = org.telegram.messenger.hd.E0().p(longValue, this.C0.invoice.currency);
                                TextView g10 = org.telegram.messenger.k5.g(context, 1, f10);
                                g10.setTypeface(org.telegram.messenger.g0.o());
                                g10.setLines(1);
                                g10.setTag(Long.valueOf(longValue));
                                g10.setMaxLines(1);
                                g10.setText(p10);
                                g10.setPadding(org.telegram.messenger.g0.L(15.0f), 0, org.telegram.messenger.g0.L(15.0f), 0);
                                org.telegram.ui.ActionBar.r6.V(g10, org.telegram.ui.ActionBar.k6.Z8, getResourceProvider());
                                g10.setBackground(org.telegram.ui.ActionBar.k6.d0(org.telegram.messenger.g0.L(15.0f), themedColor & 536870911));
                                g10.setSingleLine(true);
                                g10.setGravity(17);
                                this.s0.addView(g10, c8.ha.t(-2, -1, 19, 0, 0, i53 != size2 + (-1) ? 9 : 0, 0));
                                g10.setOnClickListener(new bi.p3(this, g10, longValue, 6));
                                int L = org.telegram.messenger.g0.L(30.0f) + ((int) Math.ceil(g10.getPaint().measureText(p10)));
                                g10.setTag(R.id.width_tag, Integer.valueOf(L));
                                iArr[0] = Math.max(iArr[0], L);
                                iArr2[0] = iArr2[0] + L;
                                i53++;
                                i18 = -2;
                                f10 = 14.0f;
                            }
                        }
                    }
                    this.Q.addView(this.R);
                    this.K[2] = new org.telegram.ui.Cells.y6(context, (Object) null);
                    org.telegram.ui.ActionBar.r6.a0(this.K[2], context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.k6.b7);
                    this.Q.addView(this.K[2], c8.ha.o(-1, i18));
                    this.Y[0] = new ok0(context);
                    org.telegram.ui.ActionBar.r6.S(this.Y[0], org.telegram.ui.ActionBar.k6.N0(true), org.telegram.ui.ActionBar.r6.N(org.telegram.ui.ActionBar.k6.d6), org.telegram.ui.ActionBar.r6.N(org.telegram.ui.ActionBar.k6.i6));
                    org.telegram.ui.Cells.y8 y8Var = this.Y[0];
                    String str9 = this.x0;
                    y8Var.b(R.drawable.msg_payment_card, (str9 == null || str9.length() <= 1) ? this.x0 : this.x0.substring(0, 1).toUpperCase() + this.x0.substring(1), org.telegram.messenger.hd.L0(2131747413), true);
                    int i54 = ((this.V0 || this.W0) && ((str = this.x0) == null || str.length() <= 1)) ? 8 : 0;
                    this.Y[0].setVisibility(i54);
                    this.Q.addView(this.Y[0]);
                    if (this.u0 == 4) {
                        this.Y[0].setOnClickListener(new dk0(this, 1));
                    }
                    TLRPC.User user3 = null;
                    for (int i55 = 0; i55 < this.C0.users.size(); i55++) {
                        TLRPC.User user4 = this.C0.users.get(i55);
                        if (user4.id == this.C0.provider_id) {
                            user3 = user4;
                        }
                    }
                    char c11 = 1;
                    this.Y[1] = new org.telegram.ui.Cells.y8(context);
                    org.telegram.ui.Cells.y8 y8Var2 = this.Y[1];
                    org.telegram.ui.Cells.y N0 = org.telegram.ui.ActionBar.k6.N0(true);
                    int i56 = org.telegram.ui.ActionBar.k6.d6;
                    org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i56);
                    int i57 = org.telegram.ui.ActionBar.k6.i6;
                    org.telegram.ui.ActionBar.r6.S(y8Var2, N0, N, org.telegram.ui.ActionBar.r6.N(i57));
                    if (user3 != null) {
                        org.telegram.ui.Cells.y8 y8Var3 = this.Y[1];
                        str6 = org.telegram.messenger.g5.n(user3.first_name, user3.last_name);
                        String L0 = org.telegram.messenger.hd.L0(2131747408);
                        TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo = this.I0;
                        y8Var3.b(R.drawable.msg_payment_provider, str6, L0, ((tL_payments_validateRequestedInfo == null || (tL_payments_validateRequestedInfo.info.shipping_address == null && this.G0 == null)) && ((tL_paymentRequestedInfo = this.C0.saved_info) == null || tL_paymentRequestedInfo.shipping_address == null)) ? false : true);
                        c11 = 1;
                        this.Q.addView(this.Y[1]);
                    }
                    this.Y[c11].setVisibility(user3 != null ? i54 : 8);
                    TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo2 = this.I0;
                    if (tL_payments_validateRequestedInfo2 != null || (this.V0 && (paymentForm2 = this.C0) != null && paymentForm2.saved_info != null)) {
                        TLRPC.TL_paymentRequestedInfo tL_paymentRequestedInfo12 = tL_payments_validateRequestedInfo2 != null ? tL_payments_validateRequestedInfo2.info : this.C0.saved_info;
                        int i58 = 2;
                        this.Y[2] = new org.telegram.ui.Cells.y8(context);
                        this.Y[2].setVisibility(8);
                        this.Q.addView(this.Y[2]);
                        if (tL_paymentRequestedInfo12.shipping_address != null) {
                            this.Y[2].setVisibility(0);
                            if (this.u0 == 4) {
                                org.telegram.ui.ActionBar.r6.S(this.Y[2], org.telegram.ui.ActionBar.k6.N0(true), org.telegram.ui.ActionBar.r6.N(i56), org.telegram.ui.ActionBar.r6.N(i57));
                                this.Y[2].setOnClickListener(new dk0(this, i58));
                            } else {
                                org.telegram.ui.ActionBar.r6.i(i56, this.Y[2], getResourceProvider());
                            }
                        }
                        int i59 = 3;
                        this.Y[3] = new org.telegram.ui.Cells.y8(context);
                        this.Y[3].setVisibility(8);
                        this.Q.addView(this.Y[3]);
                        if (tL_paymentRequestedInfo12.name != null) {
                            this.Y[3].setVisibility(0);
                            if (this.u0 == 4) {
                                org.telegram.ui.ActionBar.r6.S(this.Y[3], org.telegram.ui.ActionBar.k6.N0(true), org.telegram.ui.ActionBar.r6.N(i56), org.telegram.ui.ActionBar.r6.N(i57));
                                this.Y[3].setOnClickListener(new dk0(this, i59));
                            } else {
                                org.telegram.ui.ActionBar.r6.i(i56, this.Y[3], getResourceProvider());
                            }
                        }
                        int i60 = 4;
                        this.Y[4] = new org.telegram.ui.Cells.y8(context);
                        this.Y[4].setVisibility(8);
                        this.Q.addView(this.Y[4]);
                        if (tL_paymentRequestedInfo12.phone != null) {
                            this.Y[4].setVisibility(0);
                            if (this.u0 == 4) {
                                org.telegram.ui.ActionBar.r6.S(this.Y[4], org.telegram.ui.ActionBar.k6.N0(true), org.telegram.ui.ActionBar.r6.N(i56), org.telegram.ui.ActionBar.r6.N(i57));
                                this.Y[4].setOnClickListener(new dk0(this, i60));
                            } else {
                                org.telegram.ui.ActionBar.r6.i(i56, this.Y[4], getResourceProvider());
                            }
                        }
                        int i61 = 5;
                        this.Y[5] = new org.telegram.ui.Cells.y8(context);
                        this.Y[5].setVisibility(8);
                        this.Q.addView(this.Y[5]);
                        if (tL_paymentRequestedInfo12.email != null) {
                            this.Y[5].setVisibility(0);
                            if (this.u0 == 4) {
                                org.telegram.ui.ActionBar.r6.S(this.Y[5], org.telegram.ui.ActionBar.k6.N0(true), org.telegram.ui.ActionBar.r6.N(i56), org.telegram.ui.ActionBar.r6.N(i57));
                                this.Y[5].setOnClickListener(new dk0(this, i61));
                            } else {
                                org.telegram.ui.ActionBar.r6.i(i56, this.Y[5], getResourceProvider());
                            }
                        }
                        if (this.G0 != null) {
                            this.Y[6] = new org.telegram.ui.Cells.y8(context);
                            org.telegram.ui.ActionBar.r6.i(i56, this.Y[6], getResourceProvider());
                            this.Y[6].b(R.drawable.msg_payment_delivery, this.G0.title, org.telegram.messenger.hd.L0(2131747407), false);
                            this.Q.addView(this.Y[6]);
                        }
                        H0(tL_paymentRequestedInfo12);
                    }
                    if (this.u0 == 4) {
                        this.F = !this.V0;
                        if (this.b1 instanceof TLRPC.TL_inputInvoiceStars) {
                            this.F = true;
                        }
                        this.W = new dl0(this, context);
                        View view = new View(context);
                        org.telegram.ui.ActionBar.r6.R(view, org.telegram.ui.ActionBar.k6.h0(getThemedColor(i57), 2, -1), null, org.telegram.ui.ActionBar.r6.N(i57), this.Y0);
                        this.W.addView(view, c8.ha.c(-1.0f, -1));
                        frameLayout2.addView(this.W, c8.ha.e(-1, 48, 80));
                        this.W.setOnClickListener(new fk0(0, this, str6));
                        TextView textView2 = new TextView(context);
                        this.U = textView2;
                        int i62 = org.telegram.ui.ActionBar.k6.Ti;
                        org.telegram.ui.ActionBar.r6.V(textView2, i62, getResourceProvider());
                        this.U.setText(org.telegram.messenger.hd.Z(2131747410, this.R0[0]));
                        this.U.setTextSize(1, 14.0f);
                        this.U.setGravity(17);
                        this.U.setTypeface(org.telegram.messenger.g0.o());
                        this.W.addView(this.U, c8.ha.c(-1.0f, -1));
                        org.telegram.ui.Components.zp zpVar2 = new org.telegram.ui.Components.zp(context, 0);
                        this.s = zpVar2;
                        zpVar2.setVisibility(4);
                        int themedColor2 = getThemedColor(i62);
                        this.s.a(805306367 & themedColor2, themedColor2);
                        this.W.addView(this.s, c8.ha.c(-1.0f, -1));
                        this.W.a(this.F, false);
                        this.U.setAlpha(!this.F ? 0.8f : 1.0f);
                        this.n.setEnabled(false);
                        this.n.getContentView().setVisibility(4);
                        org.telegram.messenger.g0.u(context, true);
                        try {
                            tk0 tk0Var = new tk0(context);
                            this.x = tk0Var;
                            tk0Var.setBackgroundColor(-1);
                            this.x.getSettings().setJavaScriptEnabled(true);
                            this.x.getSettings().setDomStorageEnabled(true);
                            this.x.getSettings().setSupportZoom(true);
                            this.x.getSettings().setBuiltInZoomControls(true);
                            this.x.getSettings().setDisplayZoomControls(false);
                            this.x.getSettings().setUseWideViewPort(true);
                            this.x.getSettings().setMixedContentMode(0);
                            CookieManager.getInstance().setAcceptThirdPartyCookies(this.x, true);
                            this.x.setWebViewClient(new uk0(this, context, 0));
                        } catch (Exception e15) {
                            org.telegram.messenger.a8.f(e15);
                        }
                        this.V = null;
                        if (this.C0.invoice.terms_url != null) {
                            org.telegram.ui.Cells.n6 n6Var = new org.telegram.ui.Cells.n6(context, getResourceProvider());
                            this.V = n6Var;
                            n6Var.setChecked(this.F);
                            if (TextUtils.isEmpty(this.p0)) {
                                String L02 = org.telegram.messenger.hd.L0(2131747415);
                                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(L02);
                                int indexOf = L02.indexOf(42);
                                int lastIndexOf = L02.lastIndexOf(42);
                                spannableStringBuilder = spannableStringBuilder2;
                                spannableStringBuilder = spannableStringBuilder2;
                                if (indexOf != -1 && lastIndexOf != -1) {
                                    SpannableString spannableString = new SpannableString(L02.substring(indexOf + 1, lastIndexOf));
                                    spannableString.setSpan(new org.telegram.ui.Components.b41(this.C0.invoice.terms_url), 0, spannableString.length(), 33);
                                    int i63 = lastIndexOf + 1;
                                    spannableStringBuilder2.replace(indexOf, i63, (CharSequence) spannableString);
                                    L02.substring(0, indexOf);
                                    spannableString.toString();
                                    L02.substring(i63);
                                    spannableStringBuilder = spannableStringBuilder2;
                                }
                            } else {
                                String L03 = org.telegram.messenger.hd.L0(2131747416);
                                SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(L03);
                                int indexOf2 = L03.indexOf(42);
                                int lastIndexOf2 = L03.lastIndexOf(42);
                                if (indexOf2 != -1 && lastIndexOf2 != -1) {
                                    SpannableString spannableString2 = new SpannableString(L03.substring(indexOf2 + 1, lastIndexOf2));
                                    spannableString2.setSpan(new org.telegram.ui.Components.b41(this.C0.invoice.terms_url), 0, spannableString2.length(), 33);
                                    int i64 = lastIndexOf2 + 1;
                                    spannableStringBuilder3.replace(indexOf2, i64, (CharSequence) spannableString2);
                                    L03 = L03.substring(0, indexOf2) + ((Object) spannableString2) + L03.substring(i64);
                                }
                                int indexOf3 = L03.indexOf("%1$s");
                                spannableStringBuilder = spannableStringBuilder3;
                                if (indexOf3 != -1) {
                                    spannableStringBuilder3.replace(indexOf3, indexOf3 + 4, (CharSequence) this.p0);
                                    spannableStringBuilder3.setSpan(new org.telegram.ui.Components.u31(org.telegram.messenger.g0.o()), indexOf3, this.p0.length() + indexOf3, 33);
                                    spannableStringBuilder = spannableStringBuilder3;
                                }
                            }
                            this.V.setText(spannableStringBuilder);
                            org.telegram.ui.Cells.n6 n6Var2 = this.V;
                            int i65 = org.telegram.ui.ActionBar.k6.d6;
                            int themedColor3 = getThemedColor(i65);
                            int i66 = org.telegram.ui.ActionBar.k6.i6;
                            org.telegram.ui.ActionBar.r6.R(n6Var2, org.telegram.ui.ActionBar.k6.i0(themedColor3, getThemedColor(i66)), org.telegram.ui.ActionBar.r6.N(i65), org.telegram.ui.ActionBar.r6.N(i66), getResourceProvider());
                            this.V.setOnClickListener(new dk0(this, 6));
                            frameLayout2.addView(this.V, c8.ha.d(-1, -2.0f, 80, 0.0f, 0.0f, 0.0f, 48.0f));
                        }
                        WebView webView = this.x;
                        if (webView != null) {
                            frameLayout2.addView(webView, c8.ha.c(-1.0f, -1));
                            this.x.setVisibility(8);
                        }
                    }
                    this.K[1] = new org.telegram.ui.Cells.y6(context, (Object) null);
                    org.telegram.ui.ActionBar.r6.a0(this.K[1], context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.k6.b7);
                    if (i54 != 0 && this.u0 == 4 && this.I0 == null && ((paymentForm = this.C0) == null || paymentForm.saved_info == null)) {
                        c10 = 1;
                        this.K[1].setVisibility(i54);
                    } else {
                        c10 = 1;
                    }
                    this.Q.addView(this.K[c10], c8.ha.o(-1, -2));
                } else if (i19 == 6) {
                    org.telegram.ui.Cells.l3 l3Var = new org.telegram.ui.Cells.l3(context);
                    this.S = l3Var;
                    l3Var.a(org.telegram.messenger.hd.L0(2131747446));
                    org.telegram.ui.Cells.l3 l3Var2 = this.S;
                    int i67 = org.telegram.ui.ActionBar.k6.d6;
                    org.telegram.ui.ActionBar.r6.i(i67, l3Var2, getResourceProvider());
                    EditTextBoldCursor textView3 = this.S.getTextView();
                    textView3.setInputType(3);
                    textView3.setImeOptions(6);
                    final int i68 = 0;
                    textView3.setOnEditorActionListener(new TextView.OnEditorActionListener(this) { // from class: org.telegram.ui.hk0
                        public final /* synthetic */ hl0 b;

                        {
                            this.b = this;
                        }

                        @Override // android.widget.TextView.OnEditorActionListener
                        public final boolean onEditorAction(TextView textView22, int i292, KeyEvent keyEvent) {
                            EditTextBoldCursor[] editTextBoldCursorArr;
                            switch (i68) {
                                case 0:
                                    hl0 hl0Var = this.b;
                                    if (i292 != 6) {
                                        hl0Var.getClass();
                                        break;
                                    } else {
                                        hl0Var.G0(false);
                                        break;
                                    }
                                case 1:
                                    hl0 hl0Var2 = this.b;
                                    if (i292 != 6) {
                                        hl0Var2.getClass();
                                        if (i292 == 5) {
                                            int intValue = ((Integer) textView22.getTag()).intValue();
                                            if (intValue != 0) {
                                                if (intValue == 1) {
                                                    hl0Var2.f[2].requestFocus();
                                                    break;
                                                }
                                            } else {
                                                hl0Var2.f[1].requestFocus();
                                                break;
                                            }
                                        }
                                    } else {
                                        hl0Var2.n.performClick();
                                        break;
                                    }
                                    break;
                                case 2:
                                    hl0 hl0Var3 = this.b;
                                    hl0Var3.getClass();
                                    if (i292 != 5) {
                                        if (i292 == 6) {
                                            hl0Var3.n.performClick();
                                            break;
                                        }
                                    } else {
                                        int intValue2 = ((Integer) textView22.getTag()).intValue();
                                        while (true) {
                                            intValue2++;
                                            EditTextBoldCursor[] editTextBoldCursorArr2 = hl0Var3.f;
                                            if (intValue2 >= editTextBoldCursorArr2.length) {
                                                break;
                                            } else if (intValue2 != 4 && ((View) editTextBoldCursorArr2[intValue2].getParent()).getVisibility() == 0) {
                                                hl0Var3.f[intValue2].requestFocus();
                                                break;
                                            }
                                        }
                                    }
                                    break;
                                case 3:
                                    hl0 hl0Var4 = this.b;
                                    hl0Var4.getClass();
                                    if (i292 != 5) {
                                        if (i292 == 6) {
                                            hl0Var4.n.performClick();
                                            break;
                                        }
                                    } else {
                                        int intValue3 = ((Integer) textView22.getTag()).intValue();
                                        do {
                                            int i302 = intValue3 + 1;
                                            editTextBoldCursorArr = hl0Var4.f;
                                            if (i302 >= editTextBoldCursorArr.length) {
                                                break;
                                            } else {
                                                intValue3 = i302 == 4 ? intValue3 + 2 : i302;
                                            }
                                        } while (((View) editTextBoldCursorArr[intValue3].getParent()).getVisibility() != 0);
                                        hl0Var4.f[intValue3].requestFocus();
                                        break;
                                    }
                                    break;
                                default:
                                    hl0 hl0Var5 = this.b;
                                    if (i292 != 6) {
                                        hl0Var5.getClass();
                                        break;
                                    } else {
                                        hl0Var5.n.performClick();
                                        break;
                                    }
                            }
                            return false;
                        }
                    });
                    textView3.addTextChangedListener(new wk0(this, i68));
                    this.Q.addView(this.S, c8.ha.o(-1, -2));
                    this.M[2] = new org.telegram.ui.Cells.z8(context, this.Y0);
                    org.telegram.ui.ActionBar.r6.a0(this.M[2], context, R.drawable.greydivider, org.telegram.ui.ActionBar.k6.b7);
                    this.Q.addView(this.M[2], c8.ha.o(-1, -2));
                    this.N[1] = new org.telegram.ui.Cells.w9(context, this.Y0);
                    org.telegram.ui.Cells.w9 w9Var = this.N[1];
                    org.telegram.ui.Cells.y N02 = org.telegram.ui.ActionBar.k6.N0(true);
                    org.telegram.ui.ActionBar.n6 N2 = org.telegram.ui.ActionBar.r6.N(i67);
                    int i69 = org.telegram.ui.ActionBar.k6.i6;
                    org.telegram.ui.ActionBar.r6.S(w9Var, N02, N2, org.telegram.ui.ActionBar.r6.N(i69));
                    org.telegram.ui.Cells.w9 w9Var2 = this.N[1];
                    int i70 = org.telegram.ui.ActionBar.k6.G6;
                    w9Var2.setTag(Integer.valueOf(i70));
                    org.telegram.ui.ActionBar.r6.V(this.N[1].getTextView(), i70, getResourceProvider());
                    this.N[1].b(org.telegram.messenger.hd.L0(2131746122), true);
                    this.Q.addView(this.N[1], c8.ha.o(-1, -2));
                    this.N[1].setOnClickListener(new dk0(this, 7));
                    this.N[0] = new org.telegram.ui.Cells.w9(context, this.Y0);
                    org.telegram.ui.ActionBar.r6.S(this.N[0], org.telegram.ui.ActionBar.k6.N0(true), org.telegram.ui.ActionBar.r6.N(i67), org.telegram.ui.ActionBar.r6.N(i69));
                    org.telegram.ui.Cells.w9 w9Var3 = this.N[0];
                    int i71 = org.telegram.ui.ActionBar.k6.p7;
                    w9Var3.setTag(Integer.valueOf(i71));
                    org.telegram.ui.ActionBar.r6.V(this.N[0].getTextView(), i71, getResourceProvider());
                    this.N[0].b(org.telegram.messenger.hd.L0(2131754948), false);
                    this.Q.addView(this.N[0], c8.ha.o(-1, -2));
                    this.N[0].setOnClickListener(new dk0(this, 8));
                    this.f = new EditTextBoldCursor[3];
                    int i72 = 0;
                    for (int i73 = 3; i72 < i73; i73 = 3) {
                        if (i72 == 0) {
                            this.I[0] = new org.telegram.ui.Cells.n4(context, this.Y0);
                            org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d6, this.I[0], getResourceProvider());
                            this.I[0].setText(org.telegram.messenger.hd.L0(2131747385));
                            this.Q.addView(this.I[0], c8.ha.o(-1, -2));
                        } else if (i72 == 2) {
                            this.I[1] = new org.telegram.ui.Cells.n4(context, this.Y0);
                            org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d6, this.I[1], getResourceProvider());
                            this.I[1].setText(org.telegram.messenger.hd.L0(2131747389));
                            this.Q.addView(this.I[1], c8.ha.o(-1, -2));
                        }
                        FrameLayout frameLayout6 = new FrameLayout(context);
                        frameLayout6.setClipChildren(false);
                        this.Q.addView(frameLayout6, c8.ha.o(-1, 50));
                        int i74 = org.telegram.ui.ActionBar.k6.d6;
                        org.telegram.ui.ActionBar.r6.i(i74, frameLayout6, getResourceProvider());
                        if (i72 == 0) {
                            org.telegram.ui.Components.tm tmVar4 = new org.telegram.ui.Components.tm(context, 16);
                            org.telegram.ui.ActionBar.r6.i(i74, tmVar4, getResourceProvider());
                            this.J.add(tmVar4);
                            frameLayout6.addView(tmVar4, new FrameLayout.LayoutParams(-1, 1, 83));
                        }
                        this.f[i72] = new EditTextBoldCursor(context);
                        this.f[i72].setTag(Integer.valueOf(i72));
                        this.f[i72].setTextSize(1, 16.0f);
                        org.telegram.ui.ActionBar.r6.E(this.f[i72], org.telegram.ui.ActionBar.k6.H6, getResourceProvider());
                        EditTextBoldCursor editTextBoldCursor8 = this.f[i72];
                        int i75 = org.telegram.ui.ActionBar.k6.G6;
                        org.telegram.ui.ActionBar.r6.V(editTextBoldCursor8, i75, getResourceProvider());
                        this.f[i72].setBackgroundDrawable(null);
                        org.telegram.ui.ActionBar.r6.w(this.f[i72], i75, getResourceProvider());
                        this.f[i72].setCursorSize(org.telegram.messenger.g0.L(20.0f));
                        this.f[i72].setCursorWidth(1.5f);
                        if (i72 == 0 || i72 == 1) {
                            this.f[i72].setInputType(i43);
                            this.f[i72].setTypeface(Typeface.DEFAULT);
                            this.f[i72].setImeOptions(268435461);
                        } else {
                            this.f[i72].setInputType(33);
                            this.f[i72].setImeOptions(268435462);
                        }
                        if (i72 == 0) {
                            this.f[i72].setHint(org.telegram.messenger.hd.L0(2131747388));
                            this.f[i72].requestFocus();
                        } else if (i72 == 1) {
                            this.f[i72].setHint(org.telegram.messenger.hd.L0(2131747386));
                        } else if (i72 == 2) {
                            this.f[i72].setHint(org.telegram.messenger.hd.L0(2131747391));
                        }
                        this.f[i72].setPadding(0, 0, 0, org.telegram.messenger.g0.L(6.0f));
                        this.f[i72].setGravity(org.telegram.messenger.hd.a0 ? 5 : 3);
                        frameLayout6.addView(this.f[i72], c8.ha.d(-1, -2.0f, 51, 21.0f, 12.0f, 21.0f, 6.0f));
                        final int i76 = 1;
                        this.f[i72].setOnEditorActionListener(new TextView.OnEditorActionListener(this) { // from class: org.telegram.ui.hk0
                            public final /* synthetic */ hl0 b;

                            {
                                this.b = this;
                            }

                            @Override // android.widget.TextView.OnEditorActionListener
                            public final boolean onEditorAction(TextView textView22, int i292, KeyEvent keyEvent) {
                                EditTextBoldCursor[] editTextBoldCursorArr;
                                switch (i76) {
                                    case 0:
                                        hl0 hl0Var = this.b;
                                        if (i292 != 6) {
                                            hl0Var.getClass();
                                            break;
                                        } else {
                                            hl0Var.G0(false);
                                            break;
                                        }
                                    case 1:
                                        hl0 hl0Var2 = this.b;
                                        if (i292 != 6) {
                                            hl0Var2.getClass();
                                            if (i292 == 5) {
                                                int intValue = ((Integer) textView22.getTag()).intValue();
                                                if (intValue != 0) {
                                                    if (intValue == 1) {
                                                        hl0Var2.f[2].requestFocus();
                                                        break;
                                                    }
                                                } else {
                                                    hl0Var2.f[1].requestFocus();
                                                    break;
                                                }
                                            }
                                        } else {
                                            hl0Var2.n.performClick();
                                            break;
                                        }
                                        break;
                                    case 2:
                                        hl0 hl0Var3 = this.b;
                                        hl0Var3.getClass();
                                        if (i292 != 5) {
                                            if (i292 == 6) {
                                                hl0Var3.n.performClick();
                                                break;
                                            }
                                        } else {
                                            int intValue2 = ((Integer) textView22.getTag()).intValue();
                                            while (true) {
                                                intValue2++;
                                                EditTextBoldCursor[] editTextBoldCursorArr2 = hl0Var3.f;
                                                if (intValue2 >= editTextBoldCursorArr2.length) {
                                                    break;
                                                } else if (intValue2 != 4 && ((View) editTextBoldCursorArr2[intValue2].getParent()).getVisibility() == 0) {
                                                    hl0Var3.f[intValue2].requestFocus();
                                                    break;
                                                }
                                            }
                                        }
                                        break;
                                    case 3:
                                        hl0 hl0Var4 = this.b;
                                        hl0Var4.getClass();
                                        if (i292 != 5) {
                                            if (i292 == 6) {
                                                hl0Var4.n.performClick();
                                                break;
                                            }
                                        } else {
                                            int intValue3 = ((Integer) textView22.getTag()).intValue();
                                            do {
                                                int i302 = intValue3 + 1;
                                                editTextBoldCursorArr = hl0Var4.f;
                                                if (i302 >= editTextBoldCursorArr.length) {
                                                    break;
                                                } else {
                                                    intValue3 = i302 == 4 ? intValue3 + 2 : i302;
                                                }
                                            } while (((View) editTextBoldCursorArr[intValue3].getParent()).getVisibility() != 0);
                                            hl0Var4.f[intValue3].requestFocus();
                                            break;
                                        }
                                        break;
                                    default:
                                        hl0 hl0Var5 = this.b;
                                        if (i292 != 6) {
                                            hl0Var5.getClass();
                                            break;
                                        } else {
                                            hl0Var5.n.performClick();
                                            break;
                                        }
                                }
                                return false;
                            }
                        });
                        if (i72 == 1) {
                            this.M[0] = new org.telegram.ui.Cells.z8(context, this.Y0);
                            this.M[0].setText(org.telegram.messenger.hd.L0(2131747387));
                            org.telegram.ui.ActionBar.r6.a0(this.M[0], context, R.drawable.greydivider, org.telegram.ui.ActionBar.k6.b7);
                            this.Q.addView(this.M[0], c8.ha.o(-1, -2));
                        } else if (i72 == 2) {
                            this.M[1] = new org.telegram.ui.Cells.z8(context, this.Y0);
                            this.M[1].setText(org.telegram.messenger.hd.L0(2131747390));
                            org.telegram.ui.ActionBar.r6.a0(this.M[1], context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.k6.b7);
                            this.Q.addView(this.M[1], c8.ha.o(-1, -2));
                        }
                        i72++;
                        i43 = org.telegram.messenger.qs.N1;
                    }
                    P0();
                }
            }
        }
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.ls
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.qs.p0) {
            TLRPC.PaymentForm paymentForm = this.C0;
            paymentForm.password_missing = false;
            paymentForm.can_save_credentials = true;
            Q0();
            return;
        }
        if (i7 == org.telegram.messenger.qs.r0) {
            TLRPC.PaymentForm paymentForm2 = this.C0;
            paymentForm2.password_missing = true;
            paymentForm2.can_save_credentials = false;
            Q0();
            return;
        }
        if (i7 == org.telegram.messenger.qs.a1) {
            this.a1 = true;
            removeSelfFromStack();
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final org.telegram.ui.ActionBar.f6 getResourceProvider() {
        return this.Y0;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.E, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.s8));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.actionBar, TLObject.FLAG_27, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.C8));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.actionBar, 67108864, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.D8));
        if (this.f != null) {
            int i7 = 0;
            while (true) {
                EditTextBoldCursor[] editTextBoldCursorArr = this.f;
                if (i7 >= editTextBoldCursorArr.length) {
                    break;
                }
                arrayList.add(new org.telegram.ui.ActionBar.t6((View) editTextBoldCursorArr[i7].getParent(), 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.d6));
                i7++;
            }
        } else {
            arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.G6));
            arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, TLObject.FLAG_23, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.H6));
        }
        if (this.h != null) {
            for (int i10 = 0; i10 < this.h.length; i10++) {
            }
        }
        int i11 = 0;
        while (true) {
            org.telegram.ui.Cells.n4[] n4VarArr = this.I;
            if (i11 >= n4VarArr.length) {
                break;
            }
            arrayList.add(new org.telegram.ui.ActionBar.t6(n4VarArr[i11], 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.d6));
            i11++;
        }
        for (int i12 = 0; i12 < this.K.length; i12++) {
        }
        for (int i13 = 0; i13 < this.M.length; i13++) {
        }
        int i14 = 0;
        while (true) {
            ArrayList arrayList2 = this.J;
            if (i14 >= arrayList2.size()) {
                break;
            }
            arrayList.add(new org.telegram.ui.ActionBar.t6((View) arrayList2.get(i14), 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.d6));
            i14++;
        }
        int i15 = 1;
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.L, 0, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.M6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.L, 0, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.N6));
        for (int i16 = 0; i16 < this.N.length; i16++) {
        }
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.U, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.s6));
        while (true) {
            org.telegram.ui.Cells.y8[] y8VarArr = this.Y;
            if (i15 >= y8VarArr.length) {
                arrayList.add(new org.telegram.ui.ActionBar.t6(this.W, TLObject.FLAG_28, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.d6));
                arrayList.add(new org.telegram.ui.ActionBar.t6(this.W, TLObject.FLAG_28, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.i6));
                return arrayList;
            }
            arrayList.add(new org.telegram.ui.ActionBar.t6(y8VarArr[i15], 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.d6));
            i15++;
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return this.G;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onActivityResultFragment(int i7, int i10, Intent intent) {
        if (i7 == 991) {
            org.telegram.messenger.g0.h3(new d10(this, i10, intent, 4));
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean onBackPressed(boolean z9) {
        WebView webView = this.x;
        if (webView == null || !this.D) {
            return !this.P0;
        }
        if (z9) {
            webView.loadUrl(this.y);
            this.D = false;
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        if (this.u0 == 4 && this.X0) {
            this.X0 = false;
            this.W.callOnClick();
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean onFragmentCreate() {
        org.telegram.messenger.qs.f(this.currentAccount).c(this, org.telegram.messenger.qs.p0);
        org.telegram.messenger.qs.f(this.currentAccount).c(this, org.telegram.messenger.qs.r0);
        if (this.u0 != 4 || this.V0) {
            org.telegram.messenger.qs.f(this.currentAccount).b(this, org.telegram.messenger.qs.a1);
        }
        return super.onFragmentCreate();
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00c5, code lost:
    
        if (r0 != 6) goto L56;
     */
    @Override // org.telegram.ui.ActionBar.f2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onFragmentDestroy() {
        fl0 fl0Var = this.T;
        if (fl0Var != null) {
            fl0Var.b();
        }
        int i7 = 0;
        org.telegram.messenger.g0.u(getParentActivity(), false);
        if (!this.a1) {
            this.f1 = 2;
            if (this.Z0 != null) {
                org.telegram.ui.ActionBar.q4 q4Var = this.parentLayout;
                if (q4Var != null && q4Var.getFragmentStack() != null) {
                    int indexOf = this.parentLayout.getFragmentStack().indexOf(this);
                    if (indexOf == -1) {
                        indexOf = this.parentLayout.getFragmentStack().size();
                    }
                    while (true) {
                        if (i7 >= this.parentLayout.getFragmentStack().size()) {
                            i7 = indexOf;
                            break;
                        } else if (((org.telegram.ui.ActionBar.f2) this.parentLayout.getFragmentStack().get(i7)) instanceof hl0) {
                            break;
                        } else {
                            i7++;
                        }
                    }
                    i7 -= indexOf;
                }
                if (i7 == 0) {
                    this.Z0.b(this.f1);
                }
            }
        }
        org.telegram.messenger.qs.f(this.currentAccount).n(this, org.telegram.messenger.qs.p0);
        org.telegram.messenger.qs.f(this.currentAccount).n(this, org.telegram.messenger.qs.r0);
        if (this.u0 != 4 || this.V0) {
            org.telegram.messenger.qs.f(this.currentAccount).n(this, org.telegram.messenger.qs.a1);
        }
        WebView webView = this.x;
        if (webView != null) {
            try {
                ViewParent parent = webView.getParent();
                if (parent != null) {
                    ((ViewGroup) parent).removeView(this.x);
                }
                this.x.stopLoading();
                this.x.loadUrl("about:blank");
                this.y = null;
                this.x.destroy();
                this.x = null;
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
        try {
            int i10 = this.u0;
            if (i10 != 2) {
            }
        } catch (Throwable th2) {
            org.telegram.messenger.a8.g(th2, true);
        }
        if (org.telegram.messenger.iz.s.length() != 0) {
            if (org.telegram.messenger.iz.A) {
            }
            super.onFragmentDestroy();
            this.Q0 = true;
        }
        getParentActivity().getWindow().clearFlags(TLObject.FLAG_13);
        org.telegram.messenger.g0.h2();
        super.onFragmentDestroy();
        this.Q0 = true;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onResume() {
        super.onResume();
        org.telegram.messenger.g0.a3(getParentActivity(), this.classGuid);
        try {
            int i7 = this.u0;
            if ((i7 == 2 || i7 == 6) && !this.C0.invoice.test) {
                getParentActivity().getWindow().setFlags(TLObject.FLAG_13, TLObject.FLAG_13);
                org.telegram.messenger.g0.h2();
                return;
            }
            if (org.telegram.messenger.iz.s.length() != 0 && !org.telegram.messenger.iz.A) {
                return;
            }
            getParentActivity().getWindow().clearFlags(TLObject.FLAG_13);
            org.telegram.messenger.g0.h2();
        } catch (Throwable th2) {
            org.telegram.messenger.a8.g(th2, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onThemeColorsChanged() {
        try {
            ScrollView scrollView = this.E;
            if (scrollView != null) {
                org.telegram.messenger.g0.z3(scrollView, getThemedColor(org.telegram.ui.ActionBar.k6.s8));
            }
            if (this.f == null) {
                return;
            }
            getThemedColor(org.telegram.ui.ActionBar.k6.G6);
            int i7 = 0;
            while (true) {
                EditTextBoldCursor[] editTextBoldCursorArr = this.f;
                if (i7 >= editTextBoldCursorArr.length) {
                    return;
                }
                EditTextBoldCursor editTextBoldCursor = editTextBoldCursorArr[i7];
                if (editTextBoldCursor != null) {
                    org.telegram.ui.ActionBar.r6.m(editTextBoldCursor, 30, org.telegram.ui.ActionBar.k6.G6, this.Y0);
                }
                i7++;
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onTransitionAnimationEnd(boolean z9, boolean z10) {
        if (!z9 || z10) {
            return;
        }
        WebView webView = this.x;
        if (webView != null) {
            if (this.u0 != 4) {
                TLRPC.TL_paymentFormMethod tL_paymentFormMethod = this.F0;
                if (tL_paymentFormMethod != null) {
                    String str = tL_paymentFormMethod.url;
                    this.y = str;
                    webView.loadUrl(str);
                    return;
                } else {
                    String str2 = this.C0.url;
                    this.y = str2;
                    webView.loadUrl(str2);
                    return;
                }
            }
            return;
        }
        int i7 = this.u0;
        if (i7 == 2) {
            org.telegram.messenger.g0.i3(new ik0(this, 3), 100L);
            return;
        }
        if (i7 == 3) {
            this.f[1].requestFocus();
            org.telegram.messenger.g0.K3(this.f[1]);
            return;
        }
        if (i7 == 4) {
            EditTextBoldCursor[] editTextBoldCursorArr = this.f;
            if (editTextBoldCursorArr != null) {
                editTextBoldCursorArr[0].requestFocus();
                return;
            }
            return;
        }
        if (i7 != 6 || this.b0) {
            return;
        }
        this.f[0].requestFocus();
        org.telegram.messenger.g0.K3(this.f[0]);
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean presentFragment(org.telegram.ui.ActionBar.f2 f2Var) {
        E0(f2Var);
        return super.presentFragment(f2Var);
    }

    public final void s0(Context context) {
        FrameLayout frameLayout = new FrameLayout(context);
        this.O = frameLayout;
        org.telegram.ui.Cells.y N0 = org.telegram.ui.ActionBar.k6.N0(true);
        org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(org.telegram.ui.ActionBar.k6.d6);
        org.telegram.ui.ActionBar.n6 N2 = org.telegram.ui.ActionBar.r6.N(org.telegram.ui.ActionBar.k6.i6);
        frameLayout.setBackground(N0);
        org.telegram.ui.ActionBar.r6.k(frameLayout, N0, N, N2, null);
        this.O.setVisibility(8);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.P = frameLayout2;
        frameLayout2.setClickable(true);
        this.P.setFocusable(true);
        this.P.setBackgroundResource(R.drawable.googlepay_button_no_shadow_background);
        if (this.K0 == null) {
            this.P.setPadding(org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(2.0f));
        } else {
            this.P.setPadding(org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f));
        }
        this.O.addView(this.P, c8.ha.c(48.0f, -1));
        this.P.setOnClickListener(new dk0(this, 13));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setWeightSum(2.0f);
        linearLayout.setGravity(16);
        linearLayout.setOrientation(1);
        linearLayout.setDuplicateParentStateEnabled(true);
        this.P.addView(linearLayout, c8.ha.c(-1.0f, -1));
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageView.setDuplicateParentStateEnabled(true);
        imageView.setImageResource(R.drawable.buy_with_googlepay_button_content);
        linearLayout.addView(imageView, c8.ha.l(1.0f, -1, 0));
        ImageView imageView2 = new ImageView(context);
        imageView2.setScaleType(ImageView.ScaleType.FIT_XY);
        imageView2.setDuplicateParentStateEnabled(true);
        imageView2.setImageResource(R.drawable.googlepay_button_overlay);
        this.P.addView(imageView2, c8.ha.c(-1.0f, -1));
    }

    public final void t0(String str) {
        boolean z9;
        try {
            TelephonyManager telephonyManager = (TelephonyManager) org.telegram.messenger.t0.b.getSystemService("phone");
            if (str == null && (telephonyManager.getSimState() == 1 || telephonyManager.getPhoneType() == 0)) {
                return;
            }
            boolean z10 = getParentActivity().checkSelfPermission("android.permission.READ_PHONE_STATE") == 0;
            if (str != null || z10) {
                if (str == null) {
                    str = pf.b.d(telephonyManager.getLine1Number(), false);
                }
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                int i7 = 4;
                String str2 = null;
                if (str.length() > 4) {
                    while (true) {
                        if (i7 < 1) {
                            z9 = false;
                            break;
                        }
                        String substring = str.substring(0, i7);
                        if (((String) this.c.get(substring)) != null) {
                            str2 = str.substring(i7);
                            this.f[8].setText(substring);
                            z9 = true;
                            break;
                        }
                        i7--;
                    }
                    if (!z9) {
                        str2 = str.substring(1);
                        this.f[8].setText(str.substring(0, 1));
                    }
                }
                if (str2 != null) {
                    this.f[9].setText(str2);
                    EditTextBoldCursor editTextBoldCursor = this.f[9];
                    editTextBoldCursor.setSelection(editTextBoldCursor.length());
                }
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public final long v0() {
        TLRPC.InputInvoice inputInvoice = this.b1;
        if (!(inputInvoice instanceof TLRPC.TL_inputInvoiceStars)) {
            return 0L;
        }
        TLRPC.InputStorePaymentPurpose inputStorePaymentPurpose = ((TLRPC.TL_inputInvoiceStars) inputInvoice).purpose;
        if (inputStorePaymentPurpose instanceof TLRPC.TL_inputStorePaymentStarsGift) {
            return ((TLRPC.TL_inputStorePaymentStarsGift) inputStorePaymentPurpose).stars;
        }
        if (inputStorePaymentPurpose instanceof TLRPC.TL_inputStorePaymentStarsTopup) {
            return ((TLRPC.TL_inputStorePaymentStarsTopup) inputStorePaymentPurpose).stars;
        }
        if (inputStorePaymentPurpose instanceof TLRPC.TL_inputStorePaymentStarsGiveaway) {
            return ((TLRPC.TL_inputStorePaymentStarsGiveaway) inputStorePaymentPurpose).stars;
        }
        return 0L;
    }

    public final long w0() {
        TLRPC.InputPeer inputPeer;
        TLRPC.InputInvoice inputInvoice = this.b1;
        if (!(inputInvoice instanceof TLRPC.TL_inputInvoiceStars)) {
            return 0L;
        }
        TLRPC.InputStorePaymentPurpose inputStorePaymentPurpose = ((TLRPC.TL_inputInvoiceStars) inputInvoice).purpose;
        if (inputStorePaymentPurpose instanceof TLRPC.TL_inputStorePaymentStarsGift) {
            TLRPC.InputUser inputUser = ((TLRPC.TL_inputStorePaymentStarsGift) inputStorePaymentPurpose).user_id;
            if (inputUser != null) {
                return inputUser.user_id;
            }
            return 0L;
        }
        if (!(inputStorePaymentPurpose instanceof TLRPC.TL_inputStorePaymentStarsGiveaway) || (inputPeer = ((TLRPC.TL_inputStorePaymentStarsGiveaway) inputStorePaymentPurpose).boost_peer) == null) {
            return 0L;
        }
        return org.telegram.messenger.m5.n(inputPeer);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final String x0(ArrayList arrayList) {
        String str;
        double d;
        long j3 = 0;
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            j3 += ((TLRPC.TL_labeledPrice) arrayList.get(i7)).amount;
        }
        org.telegram.messenger.hd.E0();
        String upperCase = this.C0.invoice.currency.toUpperCase();
        long abs = Math.abs(j3);
        upperCase.getClass();
        char c10 = 65535;
        switch (upperCase.hashCode()) {
            case 65726:
                if (upperCase.equals("BHD")) {
                    c10 = 0;
                    break;
                }
                break;
            case 65759:
                if (upperCase.equals("BIF")) {
                    c10 = 1;
                    break;
                }
                break;
            case 66267:
                if (upperCase.equals("BYR")) {
                    c10 = 2;
                    break;
                }
                break;
            case 66813:
                if (upperCase.equals("CLF")) {
                    c10 = 3;
                    break;
                }
                break;
            case 66823:
                if (upperCase.equals("CLP")) {
                    c10 = 4;
                    break;
                }
                break;
            case 67122:
                if (upperCase.equals("CVE")) {
                    c10 = 5;
                    break;
                }
                break;
            case 67712:
                if (upperCase.equals("DJF")) {
                    c10 = 6;
                    break;
                }
                break;
            case 70719:
                if (upperCase.equals("GNF")) {
                    c10 = 7;
                    break;
                }
                break;
            case 72732:
                if (upperCase.equals("IQD")) {
                    c10 = '\b';
                    break;
                }
                break;
            case 72777:
                if (upperCase.equals("IRR")) {
                    c10 = '\t';
                    break;
                }
                break;
            case 72801:
                if (upperCase.equals("ISK")) {
                    c10 = '\n';
                    break;
                }
                break;
            case 73631:
                if (upperCase.equals("JOD")) {
                    c10 = 11;
                    break;
                }
                break;
            case 73683:
                if (upperCase.equals("JPY")) {
                    c10 = '\f';
                    break;
                }
                break;
            case 74532:
                if (upperCase.equals("KMF")) {
                    c10 = '\r';
                    break;
                }
                break;
            case 74704:
                if (upperCase.equals("KRW")) {
                    c10 = 14;
                    break;
                }
                break;
            case 74840:
                if (upperCase.equals("KWD")) {
                    c10 = 15;
                    break;
                }
                break;
            case 75863:
                if (upperCase.equals("LYD")) {
                    c10 = 16;
                    break;
                }
                break;
            case 76263:
                if (upperCase.equals("MGA")) {
                    c10 = 17;
                    break;
                }
                break;
            case 76618:
                if (upperCase.equals("MRO")) {
                    c10 = 18;
                    break;
                }
                break;
            case 78388:
                if (upperCase.equals("OMR")) {
                    c10 = 19;
                    break;
                }
                break;
            case 79710:
                if (upperCase.equals("PYG")) {
                    c10 = 20;
                    break;
                }
                break;
            case 81569:
                if (upperCase.equals("RWF")) {
                    c10 = 21;
                    break;
                }
                break;
            case 83210:
                if (upperCase.equals("TND")) {
                    c10 = 22;
                    break;
                }
                break;
            case 83974:
                if (upperCase.equals("UGX")) {
                    c10 = 23;
                    break;
                }
                break;
            case 84517:
                if (upperCase.equals("UYI")) {
                    c10 = 24;
                    break;
                }
                break;
            case 85132:
                if (upperCase.equals("VND")) {
                    c10 = 25;
                    break;
                }
                break;
            case 85367:
                if (upperCase.equals("VUV")) {
                    c10 = 26;
                    break;
                }
                break;
            case 86653:
                if (upperCase.equals("XAF")) {
                    c10 = 27;
                    break;
                }
                break;
            case 87087:
                if (upperCase.equals("XOF")) {
                    c10 = 28;
                    break;
                }
                break;
            case 87118:
                if (upperCase.equals("XPF")) {
                    c10 = 29;
                    break;
                }
                break;
        }
        str = " %.0f";
        switch (c10) {
            case 0:
            case '\b':
            case 11:
            case 15:
            case 16:
            case 19:
            case 22:
                d = abs / 1000.0d;
                str = " %.3f";
                break;
            case 1:
            case 2:
            case 4:
            case 5:
            case 6:
            case 7:
            case '\n':
            case '\f':
            case '\r':
            case 14:
            case 17:
            case 20:
            case 21:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
                d = abs;
                break;
            case 3:
                d = abs / 10000.0d;
                str = " %.4f";
                break;
            case '\t':
                double d2 = abs / 100.0f;
                str = abs % 100 != 0 ? " %.2f" : " %.0f";
                d = d2;
                break;
            case 18:
                d = abs / 10.0d;
                str = " %.1f";
                break;
            default:
                d = abs / 100.0d;
                str = " %.2f";
                break;
        }
        return String.format(Locale.US, str, Double.valueOf(d)).trim();
    }

    public final String y0(ArrayList arrayList) {
        long j3 = 0;
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            j3 += ((TLRPC.TL_labeledPrice) arrayList.get(i7)).amount;
        }
        Long l10 = this.H0;
        if (l10 != null) {
            j3 += l10.longValue();
        }
        return org.telegram.messenger.hd.E0().p(j3, this.C0.invoice.currency);
    }

    public final void z0() {
        int i7;
        int i10;
        boolean z9;
        int i11 = this.u0;
        if (i11 == 0) {
            fl0 fl0Var = this.T;
            if (fl0Var != null) {
                fl0Var.d(this.I0);
                finishFragment();
                return;
            }
            if (this.C0.invoice.flexible) {
                i7 = 1;
            } else if (this.y0 == null && this.w0 == null) {
                i7 = 2;
            } else {
                if (org.telegram.messenger.p10.i(this.currentAccount).y != null && org.telegram.messenger.p10.i(this.currentAccount).y.valid_until < ConnectionsManager.getInstance(this.currentAccount).getCurrentTime() + 60) {
                    org.telegram.messenger.p10.i(this.currentAccount).y = null;
                    org.telegram.messenger.p10.i(this.currentAccount).v(false);
                }
                i7 = org.telegram.messenger.p10.i(this.currentAccount).y != null ? 4 : 3;
            }
            if (i7 == 2 && this.y0 == null && this.w0 == null && !this.C0.additional_methods.isEmpty()) {
                M0(new ik0(this, 0));
                return;
            }
            hl0 hl0Var = new hl0(this.b1, this.C0, this.N0, this.O0, i7, this.E0, null, null, this.w0, this.x0, this.I0, this.U0, this.J0, this.r0, this.W0);
            hl0Var.c1 = this.c1;
            hl0Var.d1 = this.d1;
            presentFragment(hl0Var, this.S0);
            return;
        }
        if (i11 == 1) {
            if (this.w0 == null && this.x0 == null) {
                if (this.y0 != null) {
                    if (org.telegram.messenger.p10.i(this.currentAccount).y != null && org.telegram.messenger.p10.i(this.currentAccount).y.valid_until < ConnectionsManager.getInstance(this.currentAccount).getCurrentTime() + 60) {
                        org.telegram.messenger.p10.i(this.currentAccount).y = null;
                        org.telegram.messenger.p10.i(this.currentAccount).v(false);
                    }
                    if (org.telegram.messenger.p10.i(this.currentAccount).y == null) {
                        i10 = 3;
                    }
                } else {
                    i10 = 2;
                }
                if (i10 != 2 && this.x0 == null && this.y0 == null && this.w0 == null && !this.C0.additional_methods.isEmpty()) {
                    M0(new ik0(this, 0));
                    return;
                }
                hl0 hl0Var2 = new hl0(this.b1, this.C0, this.N0, this.O0, i10, this.E0, this.G0, this.H0, this.w0, this.x0, this.I0, this.U0, this.J0, this.r0, this.W0);
                hl0Var2.c1 = this.c1;
                hl0Var2.d1 = this.d1;
                presentFragment(hl0Var2, this.S0);
                return;
            }
            i10 = 4;
            if (i10 != 2) {
            }
            hl0 hl0Var22 = new hl0(this.b1, this.C0, this.N0, this.O0, i10, this.E0, this.G0, this.H0, this.w0, this.x0, this.I0, this.U0, this.J0, this.r0, this.W0);
            hl0Var22.c1 = this.c1;
            hl0Var22.d1 = this.d1;
            presentFragment(hl0Var22, this.S0);
            return;
        }
        if (i11 == 2) {
            TLRPC.PaymentForm paymentForm = this.C0;
            if (paymentForm.password_missing && (z9 = this.U0)) {
                hl0 hl0Var3 = new hl0(this.b1, paymentForm, this.N0, this.O0, 6, this.E0, this.G0, this.H0, this.w0, this.x0, this.I0, z9, this.J0, this.r0, this.W0);
                this.f0 = hl0Var3;
                hl0Var3.c1 = this.c1;
                hl0Var3.d1 = this.d1;
                hl0Var3.I0(this.a0);
                hl0 hl0Var4 = this.f0;
                hl0Var4.T = new yk0(this);
                presentFragment(hl0Var4, this.S0);
                return;
            }
            fl0 fl0Var2 = this.T;
            if (fl0Var2 != null) {
                fl0Var2.c(this.w0, this.x0, this.U0, this.J0, null);
                finishFragment();
                return;
            } else {
                hl0 hl0Var5 = new hl0(this.b1, paymentForm, this.N0, this.O0, 4, this.E0, this.G0, this.H0, this.w0, this.x0, this.I0, this.U0, this.J0, this.r0, this.W0);
                hl0Var5.c1 = this.c1;
                hl0Var5.d1 = this.d1;
                presentFragment(hl0Var5, this.S0);
                return;
            }
        }
        if (i11 == 3) {
            hl0 hl0Var6 = new hl0(this.b1, this.C0, this.N0, this.O0, this.v0 ? 4 : 2, this.E0, this.G0, this.H0, this.w0, this.x0, this.I0, this.U0, this.J0, this.r0, this.W0);
            hl0Var6.c1 = this.c1;
            hl0Var6.d1 = this.d1;
            presentFragment(hl0Var6, true);
            return;
        }
        if (i11 != 4) {
            if (i11 != 6) {
                return;
            }
            if (this.T.c(this.w0, this.x0, this.U0, this.J0, this.y0)) {
                finishFragment();
                return;
            }
            hl0 hl0Var7 = new hl0(this.b1, this.C0, this.N0, this.O0, 4, this.E0, this.G0, this.H0, this.w0, this.x0, this.I0, this.U0, this.J0, this.r0, false);
            hl0Var7.c1 = this.c1;
            hl0Var7.d1 = this.d1;
            presentFragment(hl0Var7, true);
            return;
        }
        boolean z10 = this.V0;
        int i12 = org.telegram.messenger.qs.a1;
        if (z10) {
            org.telegram.messenger.qs.f(this.currentAccount).n(this, i12);
        }
        org.telegram.messenger.qs.f(this.currentAccount).k(i12, new Object[0]);
        if (getMessagesController().l7 != null) {
            org.telegram.messenger.g0.i3(new ik0(this, 1), 500L);
        } else {
            if (D0(getParentLayout(), getParentActivity()) || isFinishing()) {
                return;
            }
            finishFragment();
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean presentFragment(org.telegram.ui.ActionBar.f2 f2Var, boolean z9) {
        E0(f2Var);
        return super.presentFragment(f2Var, z9);
    }

    public hl0(TLRPC.PaymentForm paymentForm, org.telegram.messenger.ij ijVar, String str, org.telegram.ui.ActionBar.f2 f2Var) {
        super(null);
        this.a = new ArrayList();
        this.b = new HashMap();
        this.c = new HashMap();
        this.d = new HashMap();
        this.G = true;
        this.I = new org.telegram.ui.Cells.n4[3];
        this.J = new ArrayList();
        this.K = new org.telegram.ui.Cells.y6[3];
        this.M = new org.telegram.ui.Cells.z8[3];
        this.N = new org.telegram.ui.Cells.w9[2];
        this.Y = new org.telegram.ui.Cells.y8[7];
        this.Z = -4.5f;
        this.c0 = 6;
        this.V0 = true;
        A0(null, paymentForm, ijVar, str, 4, null, null, null, null, null, null, false, null, f2Var, false);
    }

    public hl0(TLRPC.PaymentReceipt paymentReceipt) {
        super(null);
        this.a = new ArrayList();
        this.b = new HashMap();
        this.c = new HashMap();
        this.d = new HashMap();
        this.G = true;
        this.I = new org.telegram.ui.Cells.n4[3];
        this.J = new ArrayList();
        this.K = new org.telegram.ui.Cells.y6[3];
        this.M = new org.telegram.ui.Cells.z8[3];
        this.N = new org.telegram.ui.Cells.w9[2];
        this.Y = new org.telegram.ui.Cells.y8[7];
        this.Z = -4.5f;
        this.c0 = 6;
        this.u0 = 5;
        TLRPC.PaymentForm paymentForm = new TLRPC.PaymentForm();
        this.C0 = paymentForm;
        this.D0 = paymentReceipt;
        paymentForm.bot_id = paymentReceipt.bot_id;
        paymentForm.invoice = paymentReceipt.invoice;
        paymentForm.provider_id = paymentReceipt.provider_id;
        paymentForm.users = paymentReceipt.users;
        this.G0 = paymentReceipt.shipping;
        long j3 = paymentReceipt.tip_amount;
        if (j3 != 0) {
            this.H0 = Long.valueOf(j3);
        }
        TLRPC.User a22 = getMessagesController().a2(Long.valueOf(paymentReceipt.bot_id));
        this.l0 = a22;
        if (a22 != null) {
            this.p0 = a22.first_name;
        } else {
            this.p0 = "";
        }
        this.q0 = paymentReceipt.title;
        if (paymentReceipt.info != null) {
            this.I0 = new TLRPC.TL_payments_validateRequestedInfo();
            if (this.N0 != null) {
                TLRPC.TL_inputInvoiceMessage tL_inputInvoiceMessage = new TLRPC.TL_inputInvoiceMessage();
                tL_inputInvoiceMessage.peer = getMessagesController().j1(paymentReceipt.bot_id);
                this.I0.invoice = tL_inputInvoiceMessage;
            } else {
                TLRPC.TL_inputInvoiceSlug tL_inputInvoiceSlug = new TLRPC.TL_inputInvoiceSlug();
                tL_inputInvoiceSlug.slug = this.O0;
                this.I0.invoice = tL_inputInvoiceSlug;
            }
            this.I0.info = paymentReceipt.info;
        }
        this.x0 = paymentReceipt.credentials_title;
    }

    public hl0(TLRPC.PaymentForm paymentForm, TLRPC.InputInvoice inputInvoice, org.telegram.ui.ActionBar.f2 f2Var) {
        this(inputInvoice, paymentForm, null, null, 4, null, null, null, null, null, null, false, null, f2Var, false);
        this.V0 = true;
    }
}
