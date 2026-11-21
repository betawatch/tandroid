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

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class ml0 extends org.telegram.ui.ActionBar.g2 implements org.telegram.messenger.fs {
    public static final List h1 = Arrays.asList("http", "https");
    public static final List i1 = Collections.singletonList("tg");
    public boolean A0;
    public ps B0;
    public String C0;
    public TLRPC.PaymentForm D0;
    public boolean E;
    public final TLRPC.PaymentReceipt E0;
    public ScrollView F;
    public TLRPC.TL_payments_validatedRequestedInfo F0;
    public boolean G;
    public TLRPC.TL_paymentFormMethod G0;
    public boolean H;
    public TLRPC.TL_shippingOption H0;
    public TextView I;
    public Long I0;
    public final org.telegram.ui.Cells.o4[] J;
    public TLRPC.TL_payments_validateRequestedInfo J0;
    public final ArrayList K;
    public TLRPC.TL_inputPaymentCredentialsGooglePay K0;
    public final org.telegram.ui.Cells.z6[] L;
    public String L0;
    public org.telegram.ui.Cells.s8 M;
    public String M0;
    public final org.telegram.ui.Cells.a9[] N;
    public JSONObject N0;
    public final org.telegram.ui.Cells.x9[] O;
    public org.telegram.messenger.fj O0;
    public FrameLayout P;
    public String P0;
    public FrameLayout Q;
    public boolean Q0;
    public LinearLayout R;
    public boolean R0;
    public org.telegram.ui.Cells.b9 S;
    public String[] S0;
    public org.telegram.ui.Cells.m3 T;
    public boolean T0;
    public kl0 U;
    public boolean U0;
    public TextView V;
    public boolean V0;
    public org.telegram.ui.Cells.o6 W;
    public boolean W0;
    public il0 X;
    public boolean X0;
    public org.telegram.ui.Cells.l5 Y;
    public boolean Y0;
    public final org.telegram.ui.Cells.z8[] Z;
    public org.telegram.ui.ActionBar.h6 Z0;
    public final ArrayList a;
    public float a0;
    public ll0 a1;
    public final HashMap b;
    public TL_account.Password b0;
    public boolean b1;
    public final HashMap c;
    public boolean c0;
    public TLRPC.InputInvoice c1;
    public final HashMap d;
    public int d0;
    public org.telegram.messenger.x10 d1;
    public b9.k0 e;
    public nk0 e0;
    public org.telegram.messenger.x10 e1;
    public EditTextBoldCursor[] f;
    public boolean f0;
    public o00 f1;
    public ml0 g0;
    public int g1;
    public org.telegram.ui.Cells.j6[] h;
    public boolean h0;
    public boolean i0;
    public boolean j0;
    public String k0;
    public boolean l0;
    public TLRPC.User m0;
    public org.telegram.ui.ActionBar.q0 n;
    public boolean n0;
    public boolean o0;
    public boolean p0;
    public String q0;
    public org.telegram.ui.Components.qq r;
    public String r0;
    public org.telegram.ui.Components.qq s;
    public org.telegram.ui.ActionBar.g2 s0;
    public sk0 t0;
    public ArrayList u0;
    public int v0;
    public AnimatorSet w;
    public boolean w0;
    public WebView x;
    public String x0;
    public String y;
    public String y0;
    public TLRPC.TL_paymentSavedCredentialsCard z0;

    public ml0(TLRPC.InputInvoice inputInvoice, TLRPC.PaymentForm paymentForm, org.telegram.messenger.fj fjVar, String str, int i7, TLRPC.TL_payments_validatedRequestedInfo tL_payments_validatedRequestedInfo, TLRPC.TL_shippingOption tL_shippingOption, Long l10, String str2, String str3, TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo, boolean z10, TLRPC.TL_inputPaymentCredentialsGooglePay tL_inputPaymentCredentialsGooglePay, org.telegram.ui.ActionBar.g2 g2Var, boolean z11) {
        super(null);
        this.a = new ArrayList();
        this.b = new HashMap();
        this.c = new HashMap();
        this.d = new HashMap();
        this.H = true;
        this.J = new org.telegram.ui.Cells.o4[3];
        this.K = new ArrayList();
        this.L = new org.telegram.ui.Cells.z6[3];
        this.N = new org.telegram.ui.Cells.a9[3];
        this.O = new org.telegram.ui.Cells.x9[2];
        this.Z = new org.telegram.ui.Cells.z8[7];
        this.a0 = -4.5f;
        this.d0 = 6;
        A0(inputInvoice, paymentForm, fjVar, str, i7, tL_payments_validatedRequestedInfo, tL_shippingOption, l10, str2, str3, tL_payments_validateRequestedInfo, z10, tL_inputPaymentCredentialsGooglePay, g2Var, z11);
    }

    public static /* synthetic */ void Z(ml0 ml0Var, TL_account.Password password, byte[] bArr) {
        TLRPC.PasswordKdfAlgo passwordKdfAlgo = password.current_algo;
        byte[] c10 = passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow ? org.telegram.messenger.jv.c(bArr, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo) : null;
        TL_account.getTmpPassword gettmppassword = new TL_account.getTmpPassword();
        gettmppassword.period = 1800;
        e00 e00Var = new e00(19, ml0Var, gettmppassword);
        TLRPC.PasswordKdfAlgo passwordKdfAlgo2 = password.current_algo;
        if (!(passwordKdfAlgo2 instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow)) {
            TLRPC.TL_error tL_error = new TLRPC.TL_error();
            tL_error.text = "PASSWORD_HASH_INVALID";
            e00Var.run(null, tL_error);
            return;
        }
        TLRPC.TL_inputCheckPasswordSRP d = org.telegram.messenger.jv.d(c10, password.srp_id, password.srp_B, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo2);
        gettmppassword.password = d;
        if (d != null) {
            ConnectionsManager.getInstance(ml0Var.currentAccount).sendRequest(gettmppassword, e00Var, 10);
            return;
        }
        TLRPC.TL_error tL_error2 = new TLRPC.TL_error();
        tL_error2.text = "ALGO_INVALID";
        e00Var.run(null, tL_error2);
    }

    public static /* synthetic */ void a0(ml0 ml0Var, TLRPC.TL_error tL_error, TLObject tLObject) {
        ml0Var.J0(false);
        ml0Var.N0(true, false);
        if (tL_error != null) {
            String str = tL_error.text;
            str.getClass();
            switch (str) {
                case "ADDRESS_CITY_INVALID":
                    ml0Var.K0(2);
                    break;
                case "ADDRESS_STREET_LINE1_INVALID":
                    ml0Var.K0(0);
                    break;
                case "ADDRESS_COUNTRY_INVALID":
                    ml0Var.K0(4);
                    break;
                case "REQ_INFO_NAME_INVALID":
                    ml0Var.K0(6);
                    break;
                case "ADDRESS_POSTCODE_INVALID":
                    ml0Var.K0(5);
                    break;
                case "ADDRESS_STATE_INVALID":
                    ml0Var.K0(3);
                    break;
                case "REQ_INFO_PHONE_INVALID":
                    ml0Var.K0(9);
                    break;
                case "ADDRESS_STREET_LINE2_INVALID":
                    ml0Var.K0(1);
                    break;
                case "REQ_INFO_EMAIL_INVALID":
                    ml0Var.K0(7);
                    break;
                default:
                    org.telegram.ui.Components.c5.c0(ml0Var.currentAccount, tL_error, ml0Var, tLObject, new Object[0]);
                    break;
            }
        }
    }

    public static /* synthetic */ void b0(ml0 ml0Var, TLRPC.TL_payments_validatedRequestedInfo tL_payments_validatedRequestedInfo) {
        ml0Var.F0 = tL_payments_validatedRequestedInfo;
        if (ml0Var.D0.saved_info != null && !ml0Var.U0) {
            TLRPC.TL_payments_clearSavedInfo tL_payments_clearSavedInfo = new TLRPC.TL_payments_clearSavedInfo();
            tL_payments_clearSavedInfo.info = true;
            ConnectionsManager.getInstance(ml0Var.currentAccount).sendRequest(tL_payments_clearSavedInfo, new fi.l5(26), ml0Var.X0 ? 8 : 0);
        }
        ml0Var.z0();
        ml0Var.J0(false);
        ml0Var.N0(true, false);
    }

    public static /* synthetic */ void c0(ml0 ml0Var, TLRPC.TL_error tL_error, TLObject tLObject) {
        ml0Var.J0(false);
        ml0Var.N0(true, false);
        if (tL_error != null) {
            org.telegram.ui.Components.c5.c0(ml0Var.currentAccount, tL_error, ml0Var, tLObject, new Object[0]);
        }
    }

    public static /* synthetic */ void d0(ml0 ml0Var, org.telegram.ui.Components.gc gcVar, boolean z10, TLRPC.Message message) {
        gcVar.b();
        if (!z10) {
            TLRPC.TL_payments_getPaymentReceipt tL_payments_getPaymentReceipt = new TLRPC.TL_payments_getPaymentReceipt();
            tL_payments_getPaymentReceipt.msg_id = message.id;
            tL_payments_getPaymentReceipt.peer = org.telegram.messenger.mp.u1(ml0Var.currentAccount).o1(message.peer_id);
            ConnectionsManager.getInstance(ml0Var.currentAccount).sendRequest(tL_payments_getPaymentReceipt, new ik0(ml0Var, 0), 2);
            return;
        }
        org.telegram.ui.ActionBar.g2 T = LaunchActivity.T();
        if (T != null) {
            T.presentFragment(bn.ta(message.id, org.telegram.messenger.fj.B0(message)));
        }
    }

    public static void e0(ml0 ml0Var) {
        ConnectionsManager.getInstance(ml0Var.currentAccount).sendRequest(new TL_account.resendPasswordEmail(), new fi.l5(26), ml0Var.X0 ? 8 : 0);
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ml0Var.getParentActivity());
        String N0 = org.telegram.messenger.gd.N0(2131745924, null);
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
        t1Var.U = N0;
        t1Var.S = org.telegram.messenger.gd.N0(R.string.AppName, null);
        alertDialog$Builder.k(org.telegram.messenger.gd.N0(2131747637, null), null);
        ml0Var.showDialog(t1Var);
    }

    public static /* synthetic */ void f0(ml0 ml0Var, boolean z10, String str, String str2, TL_account.updatePasswordSettings updatepasswordsettings) {
        di.o8 o8Var = new di.o8(ml0Var, z10, str, 8);
        if (z10) {
            ConnectionsManager.getInstance(ml0Var.currentAccount).sendRequest(updatepasswordsettings, o8Var, 10);
            return;
        }
        byte[] h12 = org.telegram.messenger.g0.h1(str2);
        TLRPC.PasswordKdfAlgo passwordKdfAlgo = ml0Var.b0.new_algo;
        if (!(passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow)) {
            TLRPC.TL_error tL_error = new TLRPC.TL_error();
            tL_error.text = "PASSWORD_HASH_INVALID";
            o8Var.run(null, tL_error);
            return;
        }
        updatepasswordsettings.new_settings.new_password_hash = org.telegram.messenger.jv.b(h12, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
        if (updatepasswordsettings.new_settings.new_password_hash == null) {
            TLRPC.TL_error tL_error2 = new TLRPC.TL_error();
            tL_error2.text = "ALGO_INVALID";
            o8Var.run(null, tL_error2);
        }
        ConnectionsManager.getInstance(ml0Var.currentAccount).sendRequest(updatepasswordsettings, o8Var, 10);
    }

    public static /* synthetic */ void g0(ml0 ml0Var, TLRPC.TL_error tL_error, TLRPC.TL_payments_sendPaymentForm tL_payments_sendPaymentForm) {
        org.telegram.ui.Components.c5.c0(ml0Var.currentAccount, tL_error, ml0Var, tL_payments_sendPaymentForm, new Object[0]);
        ml0Var.J0(false);
        ml0Var.N0(false, false);
        ml0Var.b1 = true;
        ml0Var.g1 = 4;
        ll0 ll0Var = ml0Var.a1;
        if (ll0Var != null) {
            ll0Var.d(4);
        }
    }

    public static void h0(ml0 ml0Var, TLObject tLObject) {
        org.telegram.ui.ActionBar.g2 Q;
        if (tLObject instanceof TLRPC.TL_payments_paymentReceiptStars) {
            di.pb.n1(ml0Var.getParentActivity(), ml0Var.currentAccount, (TLRPC.TL_payments_paymentReceiptStars) tLObject, ml0Var.Z0);
            return;
        }
        if (!(tLObject instanceof TLRPC.PaymentReceipt) || (Q = LaunchActivity.Q()) == null) {
            return;
        }
        org.telegram.ui.ActionBar.e2 e2Var = new org.telegram.ui.ActionBar.e2();
        e2Var.a = true;
        ml0 ml0Var2 = new ml0((TLRPC.PaymentReceipt) tLObject);
        ml0Var2.d1 = ml0Var.d1;
        ml0Var2.e1 = ml0Var.e1;
        Q.showAsSheet(ml0Var2, e2Var);
    }

    public static void i0(ml0 ml0Var, TLObject tLObject, TLRPC.TL_error tL_error, TL_account.getTmpPassword gettmppassword) {
        ml0Var.N0(true, false);
        ml0Var.J0(false);
        if (tLObject != null) {
            ml0Var.w0 = true;
            org.telegram.messenger.j10.i(ml0Var.currentAccount).y = (TL_account.tmpPassword) tLObject;
            org.telegram.messenger.j10.i(ml0Var.currentAccount).v(false);
            ml0Var.z0();
            return;
        }
        if (!tL_error.text.equals("PASSWORD_HASH_INVALID")) {
            org.telegram.ui.Components.c5.c0(ml0Var.currentAccount, tL_error, ml0Var, gettmppassword, new Object[0]);
            return;
        }
        try {
            ml0Var.f[1].performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        org.telegram.messenger.g0.E3(3.25f, ml0Var.f[1], null);
        ml0Var.f[1].setText("");
    }

    public static void j0(ml0 ml0Var, TLObject tLObject) {
        org.telegram.ui.ActionBar.g2 Q;
        if (tLObject instanceof TLRPC.TL_payments_paymentReceiptStars) {
            di.pb.n1(ml0Var.getParentActivity(), ml0Var.currentAccount, (TLRPC.TL_payments_paymentReceiptStars) tLObject, ml0Var.Z0);
            return;
        }
        if (!(tLObject instanceof TLRPC.PaymentReceipt) || (Q = LaunchActivity.Q()) == null) {
            return;
        }
        org.telegram.ui.ActionBar.e2 e2Var = new org.telegram.ui.ActionBar.e2();
        e2Var.a = true;
        ml0 ml0Var2 = new ml0((TLRPC.PaymentReceipt) tLObject);
        ml0Var2.d1 = ml0Var.d1;
        ml0Var2.e1 = ml0Var.e1;
        Q.showAsSheet(ml0Var2, e2Var);
    }

    public static void k0(ml0 ml0Var, TLRPC.TL_error tL_error, TLObject tLObject, String str, TL_account.getPassword getpassword) {
        if (tL_error != null) {
            org.telegram.ui.Components.c5.c0(ml0Var.currentAccount, tL_error, ml0Var, getpassword, new Object[0]);
            ml0Var.N0(true, false);
            ml0Var.J0(false);
            return;
        }
        TL_account.Password password = (TL_account.Password) tLObject;
        if (!TwoStepVerificationActivity.n0(password, false)) {
            org.telegram.ui.Components.c5.u0(ml0Var.getParentActivity(), org.telegram.messenger.gd.N0(2131743577, null), true);
        } else if (password.has_password) {
            Utilities.e.c(new mc0(ml0Var, password, org.telegram.messenger.g0.h1(str), 16));
        } else {
            ml0Var.w0 = false;
            ml0Var.z0();
        }
    }

    public static /* synthetic */ void l0(ml0 ml0Var, org.telegram.ui.Components.gc gcVar, boolean z10, TLRPC.Message[] messageArr) {
        gcVar.b();
        if (!z10) {
            TLRPC.TL_payments_getPaymentReceipt tL_payments_getPaymentReceipt = new TLRPC.TL_payments_getPaymentReceipt();
            tL_payments_getPaymentReceipt.msg_id = messageArr[0].id;
            tL_payments_getPaymentReceipt.peer = org.telegram.messenger.mp.u1(ml0Var.currentAccount).o1(messageArr[0].peer_id);
            ConnectionsManager.getInstance(ml0Var.currentAccount).sendRequest(tL_payments_getPaymentReceipt, new ik0(ml0Var, 2), 2);
            return;
        }
        org.telegram.ui.ActionBar.g2 T = LaunchActivity.T();
        if (T != null) {
            T.presentFragment(bn.ta(messageArr[0].id, org.telegram.messenger.fj.B0(messageArr[0])));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x00cc, code lost:
    
        if (r8.phone_requested == false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x00d8, code lost:
    
        if (r23.K0 == null) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x00e2, code lost:
    
        if (r2.invoice.flexible != false) goto L51;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m0(ml0 ml0Var, String str, View view) {
        int i7;
        org.telegram.ui.Cells.o6 o6Var = ml0Var.W;
        if (o6Var != null && !ml0Var.G) {
            ml0Var.a0 = -ml0Var.a0;
            org.telegram.messenger.g0.E3(ml0Var.a0, o6Var.getTextView(), null);
            org.telegram.messenger.g0.E3(ml0Var.a0, ml0Var.W.getCheckBox(), null);
            try {
                ml0Var.W.performHapticFeedback(3, 2);
                return;
            } catch (Exception unused) {
                return;
            }
        }
        boolean z10 = ml0Var.W0;
        int i10 = 1;
        if (z10 && ml0Var.D0.saved_info != null && ml0Var.J0 == null) {
            ml0Var.J0(true);
            fe0 fe0Var = new fe0(16, ml0Var, view);
            if (ml0Var.R0) {
                return;
            }
            ml0Var.N0(true, true);
            TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo = new TLRPC.TL_payments_validateRequestedInfo();
            ml0Var.J0 = tL_payments_validateRequestedInfo;
            TLRPC.InputInvoice inputInvoice = ml0Var.c1;
            if (inputInvoice != null) {
                tL_payments_validateRequestedInfo.invoice = inputInvoice;
            } else if (ml0Var.O0 != null) {
                TLRPC.TL_inputInvoiceMessage tL_inputInvoiceMessage = new TLRPC.TL_inputInvoiceMessage();
                tL_inputInvoiceMessage.peer = ml0Var.getMessagesController().o1(ml0Var.O0.k.peer_id);
                tL_inputInvoiceMessage.msg_id = ml0Var.O0.e1();
                ml0Var.J0.invoice = tL_inputInvoiceMessage;
            } else {
                TLRPC.TL_inputInvoiceSlug tL_inputInvoiceSlug = new TLRPC.TL_inputInvoiceSlug();
                tL_inputInvoiceSlug.slug = ml0Var.P0;
                ml0Var.J0.invoice = tL_inputInvoiceSlug;
            }
            TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo2 = ml0Var.J0;
            tL_payments_validateRequestedInfo2.save = true;
            tL_payments_validateRequestedInfo2.info = ml0Var.D0.saved_info;
            ConnectionsManager.getInstance(ml0Var.currentAccount).sendRequest(tL_payments_validateRequestedInfo2, new z9(ml0Var, fe0Var, tL_payments_validateRequestedInfo2, 29), (ml0Var.X0 ? 8 : 0) | 2);
            return;
        }
        if (z10) {
            TLRPC.PaymentForm paymentForm = ml0Var.D0;
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
                            ml0Var.M0(new org.telegram.ui.Components.bu(0, view));
                            return;
                        } else {
                            ml0 ml0Var2 = new ml0(ml0Var.c1, ml0Var.D0, ml0Var.O0, ml0Var.P0, i7, ml0Var.F0, ml0Var.H0, ml0Var.I0, ml0Var.x0, ml0Var.y0, ml0Var.J0, ml0Var.V0, null, ml0Var.s0, ml0Var.X0);
                            ml0Var2.d1 = ml0Var.d1;
                            ml0Var2.e1 = ml0Var.e1;
                            ml0Var.presentFragment(ml0Var2);
                            return;
                        }
                    }
                }
                i7 = (ml0Var.z0 == null && ml0Var.x0 == null && ml0Var.K0 == null) ? 2 : 1;
                if (i7 != 2) {
                }
                ml0 ml0Var22 = new ml0(ml0Var.c1, ml0Var.D0, ml0Var.O0, ml0Var.P0, i7, ml0Var.F0, ml0Var.H0, ml0Var.I0, ml0Var.x0, ml0Var.y0, ml0Var.J0, ml0Var.V0, null, ml0Var.s0, ml0Var.X0);
                ml0Var22.d1 = ml0Var.d1;
                ml0Var22.e1 = ml0Var.e1;
                ml0Var.presentFragment(ml0Var22);
                return;
            }
            if (ml0Var.z0 == null) {
                if (ml0Var.x0 == null) {
                }
            }
            if (ml0Var.H0 == null) {
            }
        }
        if (!ml0Var.D0.password_missing && ml0Var.z0 != null) {
            if (org.telegram.messenger.j10.i(ml0Var.currentAccount).y != null && org.telegram.messenger.j10.i(ml0Var.currentAccount).y.valid_until < ConnectionsManager.getInstance(ml0Var.currentAccount).getCurrentTime() + 60) {
                org.telegram.messenger.j10.i(ml0Var.currentAccount).y = null;
                org.telegram.messenger.j10.i(ml0Var.currentAccount).v(false);
            }
            if (org.telegram.messenger.j10.i(ml0Var.currentAccount).y == null) {
                ml0Var.Y0 = true;
                ml0 ml0Var3 = new ml0(ml0Var.c1, ml0Var.D0, ml0Var.O0, ml0Var.P0, 3, ml0Var.F0, ml0Var.H0, ml0Var.I0, null, ml0Var.y0, ml0Var.J0, ml0Var.V0, null, ml0Var.s0, ml0Var.X0);
                ml0Var3.d1 = ml0Var.d1;
                ml0Var3.e1 = ml0Var.e1;
                ml0Var.presentFragment(ml0Var3);
                ml0Var.Y0 = false;
                return;
            }
            if (ml0Var.W0) {
                ml0Var.W0 = false;
                org.telegram.messenger.ks.f(ml0Var.currentAccount).n(ml0Var, org.telegram.messenger.ks.a1);
            }
        }
        TLRPC.User user = ml0Var.m0;
        if (user == null || user.verified) {
            ml0Var.O0(ml0Var.S0[0]);
            return;
        }
        String str2 = "payment_warning_" + ml0Var.m0.id;
        SharedPreferences sharedPreferences = org.telegram.messenger.mp.u1(ml0Var.currentAccount).g7;
        if (sharedPreferences.getBoolean(str2, false)) {
            ml0Var.O0(ml0Var.S0[0]);
            return;
        }
        sharedPreferences.edit().putBoolean(str2, true).commit();
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ml0Var.getParentActivity());
        String N0 = org.telegram.messenger.gd.N0(2131747158, null);
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
        t1Var.S = N0;
        t1Var.U = org.telegram.messenger.gd.a0("PaymentWarningText", null, 2131747157, ml0Var.q0, str);
        alertDialog$Builder.k(org.telegram.messenger.gd.N0(2131751759, null), new pk0(ml0Var, i10));
        ml0Var.showDialog(t1Var);
    }

    public static void n0(ml0 ml0Var, TLRPC.TL_error tL_error, boolean z10, TLObject tLObject, String str) {
        if (tL_error != null && "SRP_ID_INVALID".equals(tL_error.text)) {
            ConnectionsManager.getInstance(ml0Var.currentAccount).sendRequest(new TL_account.getPassword(), new hi.b3(9, ml0Var, z10), 8);
            return;
        }
        ml0Var.N0(true, false);
        if (z10) {
            TL_account.Password password = ml0Var.b0;
            password.has_password = false;
            password.current_algo = null;
            ml0Var.U.a(password);
            ml0Var.finishFragment();
            return;
        }
        if (tL_error == null && (tLObject instanceof TLRPC.TL_boolTrue)) {
            if (ml0Var.getParentActivity() == null) {
                return;
            }
            ml0Var.z0();
            return;
        }
        if (tL_error != null) {
            if (!tL_error.text.equals("EMAIL_UNCONFIRMED") && !tL_error.text.startsWith("EMAIL_UNCONFIRMED_")) {
                if (tL_error.text.equals("EMAIL_INVALID")) {
                    ml0Var.L0(org.telegram.messenger.gd.N0(R.string.AppName, null), org.telegram.messenger.gd.N0(2131747251, null));
                    return;
                } else if (!tL_error.text.startsWith("FLOOD_WAIT")) {
                    ml0Var.L0(org.telegram.messenger.gd.N0(R.string.AppName, null), tL_error.text);
                    return;
                } else {
                    int intValue = Utilities.z(tL_error.text).intValue();
                    ml0Var.L0(org.telegram.messenger.gd.N0(R.string.AppName, null), org.telegram.messenger.gd.a0("FloodWaitTime", null, 2131750669, intValue < 60 ? org.telegram.messenger.gd.G(intValue, "Seconds", new Object[0]) : org.telegram.messenger.gd.G(intValue / 60, "Minutes", new Object[0])));
                    return;
                }
            }
            ml0Var.d0 = Utilities.z(tL_error.text).intValue();
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ml0Var.getParentActivity());
            alertDialog$Builder.k(org.telegram.messenger.gd.N0(2131747637, null), new aj0(3, ml0Var, str));
            String N0 = org.telegram.messenger.gd.N0(2131742557, null);
            org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
            t1Var.U = N0;
            t1Var.S = org.telegram.messenger.gd.N0(2131742558, null);
            Dialog showDialog = ml0Var.showDialog(t1Var);
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
    public static void o0(ml0 ml0Var) {
        Integer num;
        Integer num2;
        int i7;
        boolean z10;
        boolean z11;
        Integer num3;
        boolean z12;
        boolean z13;
        String[] split = ml0Var.f[1].getText().toString().split("/");
        if (split.length == 2) {
            Integer z14 = Utilities.z(split[0]);
            num2 = Utilities.z(split[1]);
            num = z14;
        } else {
            num = null;
            num2 = null;
        }
        uc.a aVar = new uc.a(ml0Var.f[0].getText().toString(), num, num2, ml0Var.f[3].getText().toString(), ml0Var.f[2].getText().toString(), null, null, null, null, ml0Var.f[5].getText().toString(), ml0Var.f[4].getText().toString(), null, null, null, null, null, null);
        ml0Var.y0 = aVar.a() + " *" + aVar.b();
        boolean z15 = num != null && num2 != null && org.telegram.messenger.j10.i(ml0Var.currentAccount).d().startsWith("7") && "smartglocal".equals(ml0Var.D0.native_provider) && (num2.intValue() > 22 || (num2.intValue() == 22 && num.intValue() > 1));
        String str = aVar.a;
        if (c8.td.d(str)) {
            i7 = 0;
        } else {
            String replaceAll = str.trim().replaceAll("\\s+|-", "");
            if (!c8.td.d(replaceAll) && replaceAll != null) {
                int i10 = 0;
                while (true) {
                    if (i10 >= replaceAll.length()) {
                        int length = replaceAll.length() - 1;
                        boolean z16 = true;
                        int i11 = 0;
                        while (true) {
                            if (length >= 0) {
                                char charAt = replaceAll.charAt(length);
                                if (!Character.isDigit(charAt)) {
                                    break;
                                }
                                int parseInt = Integer.parseInt("" + charAt);
                                boolean z17 = z16 ^ true;
                                if (!z16) {
                                    parseInt *= 2;
                                }
                                if (parseInt > 9) {
                                    parseInt -= 9;
                                }
                                i11 += parseInt;
                                length--;
                                z16 = z17;
                            } else if (i11 % 10 == 0) {
                                String a10 = aVar.a();
                                if (!"American Express".equals(a10) ? !(!"Diners Club".equals(a10) ? replaceAll.length() != 16 : replaceAll.length() != 14) : replaceAll.length() == 15) {
                                    if (!z15) {
                                        Integer num4 = aVar.c;
                                        if (num4 != null && num4.intValue() >= 1 && num4.intValue() <= 12 && (num3 = aVar.d) != null && c8.qd.a(num3.intValue()) >= w7.s.b0().get(1)) {
                                            if (num4 == null || num4.intValue() < 1 || num4.intValue() > 12 || num3 == null || c8.qd.a(num3.intValue()) < w7.s.b0().get(1)) {
                                                z12 = false;
                                            } else {
                                                int intValue = num3.intValue();
                                                int intValue2 = num4.intValue();
                                                if (c8.qd.a(intValue) >= w7.s.b0().get(1)) {
                                                    Calendar b02 = w7.s.b0();
                                                    if (c8.qd.a(intValue) != b02.get(1) || intValue2 >= b02.get(2) + 1) {
                                                        z13 = false;
                                                        z12 = !z13;
                                                    }
                                                }
                                                z13 = true;
                                                z12 = !z13;
                                            }
                                        }
                                        ml0Var.K0(1);
                                        return;
                                    }
                                    if (ml0Var.j0 && ml0Var.f[2].length() == 0) {
                                        ml0Var.K0(2);
                                        return;
                                    }
                                    String str2 = aVar.b;
                                    if (!c8.td.d(str2)) {
                                        String trim = str2.trim();
                                        String a11 = aVar.a();
                                        boolean z18 = (a11 == null && trim.length() >= 3 && trim.length() <= 4) || ("American Express".equals(a11) && trim.length() == 4) || trim.length() == 3;
                                        if (trim != null) {
                                            for (int i12 = 0; i12 < trim.length(); i12++) {
                                                if (Character.isDigit(trim.charAt(i12))) {
                                                }
                                            }
                                            z10 = true;
                                            if (z10 && z18) {
                                                z11 = true;
                                                if (!z11) {
                                                    ml0Var.K0(3);
                                                    return;
                                                }
                                                if (ml0Var.h0 && ml0Var.f[4].length() == 0) {
                                                    ml0Var.K0(4);
                                                    return;
                                                }
                                                if (ml0Var.i0 && ml0Var.f[5].length() == 0) {
                                                    ml0Var.K0(5);
                                                    return;
                                                }
                                                ml0Var.N0(true, true);
                                                try {
                                                    if ("stripe".equals(ml0Var.D0.native_provider)) {
                                                        String str3 = ml0Var.k0;
                                                        org.telegram.ui.Cells.c5 c5Var = new org.telegram.ui.Cells.c5(new sa.d(24));
                                                        sa.d.E2(str3);
                                                        f fVar = new f(ml0Var, 28);
                                                        try {
                                                            sa.d.E2(str3);
                                                            new sc.a(c5Var, str3, aVar, fVar).execute(new Void[0]);
                                                        } catch (tc.c e10) {
                                                            fVar.y1(e10);
                                                        }
                                                    } else if ("smartglocal".equals(ml0Var.D0.native_provider)) {
                                                        new el0(ml0Var, aVar).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, null, null, null);
                                                    }
                                                    return;
                                                } catch (Exception e11) {
                                                    org.telegram.messenger.a8.g(e11, true);
                                                    return;
                                                }
                                            }
                                        }
                                        z10 = false;
                                        if (z10) {
                                            z11 = true;
                                            if (!z11) {
                                            }
                                        }
                                    }
                                    z11 = false;
                                    if (!z11) {
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
        ml0Var.K0(i7);
    }

    public static void p0(ml0 ml0Var) {
        if (org.telegram.messenger.j10.i(ml0Var.currentAccount).y != null && org.telegram.messenger.j10.i(ml0Var.currentAccount).y.valid_until < ConnectionsManager.getInstance(ml0Var.currentAccount).getCurrentTime() + 60) {
            org.telegram.messenger.j10.i(ml0Var.currentAccount).y = null;
            org.telegram.messenger.j10.i(ml0Var.currentAccount).v(false);
        }
        if (org.telegram.messenger.j10.i(ml0Var.currentAccount).y != null) {
            ml0Var.F0();
            return;
        }
        if (ml0Var.f[1].length() == 0) {
            try {
                ml0Var.f[1].performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
            org.telegram.messenger.g0.E3(2.5f, ml0Var.f[1], null);
            return;
        }
        String obj = ml0Var.f[1].getText().toString();
        ml0Var.N0(true, true);
        ml0Var.J0(true);
        TL_account.getPassword getpassword = new TL_account.getPassword();
        ConnectionsManager.getInstance(ml0Var.currentAccount).sendRequest(getpassword, new z9(ml0Var, obj, getpassword, 28), (ml0Var.X0 ? 8 : 0) | 2);
    }

    public static void r0(ml0 ml0Var) {
        if (ml0Var.R0) {
            return;
        }
        ml0Var.N0(true, true);
        TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo = new TLRPC.TL_payments_validateRequestedInfo();
        ml0Var.J0 = tL_payments_validateRequestedInfo;
        TLRPC.InputInvoice inputInvoice = ml0Var.c1;
        if (inputInvoice != null) {
            tL_payments_validateRequestedInfo.invoice = inputInvoice;
        } else if (ml0Var.O0 != null) {
            TLRPC.TL_inputInvoiceMessage tL_inputInvoiceMessage = new TLRPC.TL_inputInvoiceMessage();
            tL_inputInvoiceMessage.peer = ml0Var.getMessagesController().o1(ml0Var.O0.k.peer_id);
            tL_inputInvoiceMessage.msg_id = ml0Var.O0.e1();
            ml0Var.J0.invoice = tL_inputInvoiceMessage;
        } else {
            TLRPC.TL_inputInvoiceSlug tL_inputInvoiceSlug = new TLRPC.TL_inputInvoiceSlug();
            tL_inputInvoiceSlug.slug = ml0Var.P0;
            ml0Var.J0.invoice = tL_inputInvoiceSlug;
        }
        TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo2 = ml0Var.J0;
        tL_payments_validateRequestedInfo2.save = ml0Var.U0;
        tL_payments_validateRequestedInfo2.info = new TLRPC.TL_paymentRequestedInfo();
        if (ml0Var.D0.invoice.name_requested) {
            ml0Var.J0.info.name = ml0Var.f[6].getText().toString();
            ml0Var.J0.info.flags |= 1;
        }
        if (ml0Var.D0.invoice.phone_requested) {
            ml0Var.J0.info.phone = "+" + ml0Var.f[8].getText().toString() + ml0Var.f[9].getText().toString();
            TLRPC.TL_paymentRequestedInfo tL_paymentRequestedInfo = ml0Var.J0.info;
            tL_paymentRequestedInfo.flags = tL_paymentRequestedInfo.flags | 2;
        }
        if (ml0Var.D0.invoice.email_requested) {
            ml0Var.J0.info.email = ml0Var.f[7].getText().toString().trim();
            ml0Var.J0.info.flags |= 4;
        }
        if (ml0Var.D0.invoice.shipping_address_requested) {
            ml0Var.J0.info.shipping_address = new TLRPC.TL_postAddress();
            ml0Var.J0.info.shipping_address.street_line1 = ml0Var.f[0].getText().toString();
            ml0Var.J0.info.shipping_address.street_line2 = ml0Var.f[1].getText().toString();
            ml0Var.J0.info.shipping_address.city = ml0Var.f[2].getText().toString();
            ml0Var.J0.info.shipping_address.state = ml0Var.f[3].getText().toString();
            TLRPC.TL_postAddress tL_postAddress = ml0Var.J0.info.shipping_address;
            String str = ml0Var.C0;
            if (str == null) {
                str = "";
            }
            tL_postAddress.country_iso2 = str;
            tL_postAddress.post_code = ml0Var.f[5].getText().toString();
            ml0Var.J0.info.flags |= 8;
        }
        ConnectionsManager.getInstance(ml0Var.currentAccount).sendRequest(ml0Var.J0, new e00(17, ml0Var, ml0Var.J0), (ml0Var.X0 ? 8 : 0) | 2);
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

    public final void A0(TLRPC.InputInvoice inputInvoice, TLRPC.PaymentForm paymentForm, org.telegram.messenger.fj fjVar, String str, int i7, TLRPC.TL_payments_validatedRequestedInfo tL_payments_validatedRequestedInfo, TLRPC.TL_shippingOption tL_shippingOption, Long l10, String str2, String str3, TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo, boolean z10, TLRPC.TL_inputPaymentCredentialsGooglePay tL_inputPaymentCredentialsGooglePay, org.telegram.ui.ActionBar.g2 g2Var, boolean z11) {
        if (g2Var != null) {
            this.currentAccount = g2Var.getCurrentAccount();
        }
        this.v0 = i7;
        this.s0 = g2Var;
        this.x0 = str2;
        this.K0 = tL_inputPaymentCredentialsGooglePay;
        this.F0 = tL_payments_validatedRequestedInfo;
        this.D0 = paymentForm;
        this.H0 = tL_shippingOption;
        this.I0 = l10;
        this.O0 = fjVar;
        this.P0 = str;
        this.c1 = inputInvoice;
        this.V0 = z10;
        this.X0 = z11;
        this.T0 = ("stripe".equals(paymentForm.native_provider) || "smartglocal".equals(this.D0.native_provider)) ? false : true;
        TLRPC.User c22 = getMessagesController().c2(Long.valueOf(paymentForm.bot_id));
        this.m0 = c22;
        if (c22 != null) {
            this.q0 = c22.first_name;
        } else {
            this.q0 = "";
        }
        this.r0 = paymentForm.title;
        this.J0 = tL_payments_validateRequestedInfo;
        this.U0 = true;
        if (z10 || this.v0 == 4) {
            this.V0 = z10;
        } else {
            this.V0 = !this.D0.saved_credentials.isEmpty();
        }
        if (str3 != null) {
            this.y0 = str3;
        } else {
            if (this.D0.saved_credentials.isEmpty()) {
                return;
            }
            TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard = this.D0.saved_credentials.get(0);
            this.z0 = tL_paymentSavedCredentialsCard;
            this.y0 = tL_paymentSavedCredentialsCard.title;
        }
    }

    public final void B0(Context context) {
        Optional empty;
        if (getParentActivity() == null) {
            return;
        }
        b7.l lVar = new b7.l();
        int i7 = this.D0.invoice.test ? 3 : 1;
        if (i7 != 2 && i7 != 1 && i7 != 3) {
            Locale locale = Locale.US;
            throw new IllegalArgumentException(i5.c.i(i7, "Invalid environment value "));
        }
        lVar.a = i7;
        this.e = new b9.k0(context, y8.p.a, new y8.o(lVar), com.google.android.gms.common.api.i.c);
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
            q6.m.i(jSONObject, "isReadyToPayRequestJson cannot be null!");
            eVar.f = jSONObject;
            b9.k0 k0Var = this.e;
            k0Var.getClass();
            com.google.android.gms.common.api.internal.t b10 = com.google.android.gms.common.api.internal.u.b();
            b10.a = 23705;
            b10.c = new org.telegram.ui.Components.qf(eVar, 28);
            k0Var.e(0, b10.a()).addOnCompleteListener(getParentActivity(), new pk0(this, 0));
        }
    }

    public final void C0() {
        if (this.f0) {
            return;
        }
        this.f0 = true;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_account.getPassword(), new ik0(this, 3), 10);
    }

    public final boolean D0(org.telegram.ui.ActionBar.r4 r4Var, Activity activity) {
        int i7 = 0;
        if (this.c1 != null) {
            if (r4Var != null) {
                ArrayList arrayList = new ArrayList(r4Var.getFragmentStack());
                int size = arrayList.size();
                while (i7 < size) {
                    Object obj = arrayList.get(i7);
                    i7++;
                    org.telegram.ui.ActionBar.g2 g2Var = (org.telegram.ui.ActionBar.g2) obj;
                    if (g2Var instanceof ml0) {
                        g2Var.removeSelfFromStack();
                    }
                }
                return true;
            }
            return false;
        }
        String str = this.m0.username;
        if (((str != null && str.equalsIgnoreCase(getMessagesController().v6) && this.P0 == null) || (this.P0 != null && getMessagesController().w6 != null && Objects.equals(this.P0, getMessagesController().w6))) && r4Var != null) {
            ArrayList arrayList2 = new ArrayList(r4Var.getFragmentStack());
            int size2 = arrayList2.size();
            int i10 = 0;
            while (i10 < size2) {
                Object obj2 = arrayList2.get(i10);
                i10++;
                org.telegram.ui.ActionBar.g2 g2Var2 = (org.telegram.ui.ActionBar.g2) obj2;
                if ((g2Var2 instanceof bn) || (g2Var2 instanceof PremiumPreviewFragment)) {
                    g2Var2.removeSelfFromStack();
                }
            }
            PremiumPreviewFragment premiumPreviewFragment = new PremiumPreviewFragment(0, null);
            premiumPreviewFragment.q0 = true;
            ((ActionBarLayout) r4Var).T(premiumPreviewFragment, !isFinishing());
            if (activity instanceof LaunchActivity) {
                try {
                    this.fragmentView.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                ((LaunchActivity) activity).w0.c(false);
            }
            return true;
        }
        return false;
    }

    public final void E0(org.telegram.ui.ActionBar.g2 g2Var) {
        org.telegram.messenger.g0.v1(this.fragmentView);
        if (g2Var instanceof ml0) {
            ml0 ml0Var = (ml0) g2Var;
            ml0Var.a1 = this.a1;
            ml0Var.Z0 = this.Z0;
            ml0Var.Y0 = this.Y0;
            ml0Var.z0 = this.z0;
        }
    }

    public final void F0() {
        String str;
        if (this.R0) {
            return;
        }
        N0(false, true);
        TLRPC.TL_payments_sendPaymentForm tL_payments_sendPaymentForm = new TLRPC.TL_payments_sendPaymentForm();
        TLRPC.InputInvoice inputInvoice = this.c1;
        if (inputInvoice != null) {
            tL_payments_sendPaymentForm.invoice = inputInvoice;
        } else if (this.O0 != null) {
            TLRPC.TL_inputInvoiceMessage tL_inputInvoiceMessage = new TLRPC.TL_inputInvoiceMessage();
            tL_inputInvoiceMessage.peer = getMessagesController().o1(this.O0.k.peer_id);
            tL_inputInvoiceMessage.msg_id = this.O0.e1();
            tL_payments_sendPaymentForm.invoice = tL_inputInvoiceMessage;
        } else {
            TLRPC.TL_inputInvoiceSlug tL_inputInvoiceSlug = new TLRPC.TL_inputInvoiceSlug();
            tL_inputInvoiceSlug.slug = this.P0;
            tL_payments_sendPaymentForm.invoice = tL_inputInvoiceSlug;
        }
        tL_payments_sendPaymentForm.form_id = this.D0.form_id;
        if (org.telegram.messenger.j10.i(this.currentAccount).y == null || this.z0 == null) {
            TLRPC.TL_inputPaymentCredentialsGooglePay tL_inputPaymentCredentialsGooglePay = this.K0;
            if (tL_inputPaymentCredentialsGooglePay != null) {
                tL_payments_sendPaymentForm.credentials = tL_inputPaymentCredentialsGooglePay;
            } else {
                TLRPC.TL_inputPaymentCredentials tL_inputPaymentCredentials = new TLRPC.TL_inputPaymentCredentials();
                tL_payments_sendPaymentForm.credentials = tL_inputPaymentCredentials;
                tL_inputPaymentCredentials.save = this.V0;
                tL_inputPaymentCredentials.data = new TLRPC.TL_dataJSON();
                tL_payments_sendPaymentForm.credentials.data.data = this.x0;
            }
        } else {
            TLRPC.TL_inputPaymentCredentialsSaved tL_inputPaymentCredentialsSaved = new TLRPC.TL_inputPaymentCredentialsSaved();
            tL_payments_sendPaymentForm.credentials = tL_inputPaymentCredentialsSaved;
            tL_inputPaymentCredentialsSaved.id = this.z0.id;
            tL_inputPaymentCredentialsSaved.tmp_password = org.telegram.messenger.j10.i(this.currentAccount).y.tmp_password;
        }
        TLRPC.TL_payments_validatedRequestedInfo tL_payments_validatedRequestedInfo = this.F0;
        if (tL_payments_validatedRequestedInfo != null && (str = tL_payments_validatedRequestedInfo.id) != null) {
            tL_payments_sendPaymentForm.requested_info_id = str;
            tL_payments_sendPaymentForm.flags = 1 | tL_payments_sendPaymentForm.flags;
        }
        TLRPC.TL_shippingOption tL_shippingOption = this.H0;
        if (tL_shippingOption != null) {
            tL_payments_sendPaymentForm.shipping_option_id = tL_shippingOption.id;
            tL_payments_sendPaymentForm.flags |= 2;
        }
        if ((this.D0.invoice.flags & 256) != 0) {
            Long l10 = this.I0;
            tL_payments_sendPaymentForm.tip_amount = l10 != null ? l10.longValue() : 0L;
            tL_payments_sendPaymentForm.flags |= 4;
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_payments_sendPaymentForm, new e00(18, this, tL_payments_sendPaymentForm), (this.X0 ? 8 : 0) | 2);
    }

    public final void G0(boolean z10) {
        String str;
        String str2;
        int i7 = 1;
        if (!z10 && this.T.getVisibility() == 0) {
            String text = this.T.getText();
            if (text.length() == 0) {
                org.telegram.ui.Cells.m3 m3Var = this.T;
                try {
                    m3Var.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                org.telegram.messenger.g0.E3(2.5f, m3Var, null);
                return;
            } else {
                N0(true, true);
                TL_account.confirmPasswordEmail confirmpasswordemail = new TL_account.confirmPasswordEmail();
                confirmpasswordemail.code = text;
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(confirmpasswordemail, new ik0(this, i7), 10);
                return;
            }
        }
        TL_account.updatePasswordSettings updatepasswordsettings = new TL_account.updatePasswordSettings();
        if (z10) {
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
                    Toast.makeText(getParentActivity(), org.telegram.messenger.gd.N0(2131747252, null), 0).show();
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
            passwordinputsettings2.new_algo = this.b0.new_algo;
            passwordinputsettings2.flags = 3 | i10;
            passwordinputsettings2.email = obj2.trim();
            str = obj;
            str2 = obj2;
        }
        N0(true, true);
        Utilities.e.c(new ai.i(this, z10, str2, str, updatepasswordsettings));
    }

    public final void H0(TLRPC.TL_paymentRequestedInfo tL_paymentRequestedInfo) {
        TLRPC.TL_postAddress tL_postAddress = tL_paymentRequestedInfo.shipping_address;
        org.telegram.ui.Cells.z8[] z8VarArr = this.Z;
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
            com.google.android.gms.internal.vision.e2.r(sb2, ", ", str4, ", ", str5);
            z8VarArr[2].b(R.drawable.msg_payment_address, a8.p0.s(sb2, ", ", str6), org.telegram.messenger.gd.N0(2131747187, null), true);
        }
        z8VarArr[2].setVisibility(tL_paymentRequestedInfo.shipping_address != null ? 0 : 8);
        String str7 = tL_paymentRequestedInfo.name;
        if (str7 != null) {
            z8VarArr[3].b(R.drawable.msg_contacts, str7, org.telegram.messenger.gd.N0(2131747218, null), true);
        }
        z8VarArr[3].setVisibility(tL_paymentRequestedInfo.name != null ? 0 : 8);
        if (tL_paymentRequestedInfo.phone != null) {
            z8VarArr[4].b(R.drawable.msg_calls, pf.b.c().b(tL_paymentRequestedInfo.phone), org.telegram.messenger.gd.N0(2131747216, null), (tL_paymentRequestedInfo.email == null && this.H0 == null) ? false : true);
        }
        z8VarArr[4].setVisibility(tL_paymentRequestedInfo.phone != null ? 0 : 8);
        String str8 = tL_paymentRequestedInfo.email;
        if (str8 != null) {
            z8VarArr[5].b(R.drawable.msg_mention, str8, org.telegram.messenger.gd.N0(2131747221, null), this.H0 != null);
        }
        z8VarArr[5].setVisibility(tL_paymentRequestedInfo.email != null ? 0 : 8);
    }

    public final void I0(TL_account.Password password) {
        if (password == null || !password.has_password) {
            this.b0 = password;
            this.c0 = (password == null || TextUtils.isEmpty(password.email_unconfirmed_pattern)) ? false : true;
            P0();
        } else {
            if (getParentActivity() == null) {
                return;
            }
            z0();
        }
    }

    public final void J0(boolean z10) {
        this.Q0 = z10;
        this.H = !z10;
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        if (kVar != null && kVar.getBackButton() != null) {
            this.actionBar.getBackButton().setEnabled(!this.Q0);
        }
        org.telegram.ui.Cells.z8 z8Var = this.Z[0];
        if (z8Var != null) {
            z8Var.setEnabled(!this.Q0);
        }
    }

    public final void K0(int i7) {
        EditTextBoldCursor editTextBoldCursor = this.f[i7];
        try {
            editTextBoldCursor.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        org.telegram.messenger.g0.E3(2.5f, editTextBoldCursor, null);
    }

    public final void L0(String str, String str2) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        alertDialog$Builder.k(org.telegram.messenger.gd.N0(2131747637, null), null);
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
        t1Var.S = str;
        t1Var.U = str2;
        showDialog(t1Var);
    }

    public final void M0(Runnable runnable) {
        Integer valueOf = Integer.valueOf(R.drawable.msg_payment_card);
        org.telegram.ui.ActionBar.w2 j3 = org.telegram.messenger.n10.j(getParentActivity(), false, 1, null);
        j3.P = org.telegram.messenger.gd.N0(2131747220, null);
        j3.Q = true;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard = this.z0;
        if (tL_paymentSavedCredentialsCard != null) {
            arrayList.add(tL_paymentSavedCredentialsCard.title);
            arrayList2.add(valueOf);
        } else {
            String str = this.y0;
            if (str != null) {
                arrayList.add(str);
                arrayList2.add(valueOf);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        ArrayList<TLRPC.TL_paymentSavedCredentialsCard> arrayList4 = this.D0.saved_credentials;
        int size = arrayList4.size();
        int i7 = 0;
        while (i7 < size) {
            TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard2 = arrayList4.get(i7);
            i7++;
            TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard3 = tL_paymentSavedCredentialsCard2;
            TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard4 = this.z0;
            if (tL_paymentSavedCredentialsCard4 == null || !Objects.equals(tL_paymentSavedCredentialsCard3.id, tL_paymentSavedCredentialsCard4.id)) {
                arrayList.add(tL_paymentSavedCredentialsCard3.title);
                arrayList2.add(valueOf);
                arrayList3.add(tL_paymentSavedCredentialsCard3);
            }
        }
        ArrayList<TLRPC.TL_paymentFormMethod> arrayList5 = this.D0.additional_methods;
        int size2 = arrayList5.size();
        int i10 = 0;
        while (i10 < size2) {
            TLRPC.TL_paymentFormMethod tL_paymentFormMethod = arrayList5.get(i10);
            i10++;
            arrayList.add(tL_paymentFormMethod.title);
            arrayList2.add(Integer.valueOf(R.drawable.msg_payment_provider));
        }
        arrayList.add(org.telegram.messenger.gd.N0(2131747219, null));
        arrayList2.add(Integer.valueOf(R.drawable.msg_addbot));
        int[] iArr = new int[arrayList2.size()];
        for (int i11 = 0; i11 < arrayList2.size(); i11++) {
            iArr[i11] = ((Integer) arrayList2.get(i11)).intValue();
        }
        CharSequence[] charSequenceArr = (CharSequence[]) arrayList.toArray(new CharSequence[0]);
        org.telegram.ui.Components.a3 a3Var = new org.telegram.ui.Components.a3(this, runnable, arrayList3, arrayList, 1);
        j3.M = charSequenceArr;
        j3.N = iArr;
        j3.L = a3Var;
        showDialog(j3);
    }

    public final void N0(boolean z10, boolean z11) {
        AnimatorSet animatorSet = this.w;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        int i7 = 1;
        int i10 = 0;
        if (!z10 || this.n == null) {
            if (this.V != null) {
                this.w = new AnimatorSet();
                if (z11) {
                    this.s.setVisibility(0);
                    this.X.setEnabled(false);
                    AnimatorSet animatorSet2 = this.w;
                    TextView textView = this.V;
                    Property property = View.SCALE_X;
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property, 0.1f);
                    TextView textView2 = this.V;
                    Property property2 = View.SCALE_Y;
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) property2, 0.1f);
                    TextView textView3 = this.V;
                    Property property3 = View.ALPHA;
                    animatorSet2.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(textView3, (Property<TextView, Float>) property3, 0.0f), ObjectAnimator.ofFloat(this.s, (Property<org.telegram.ui.Components.qq, Float>) property, 1.0f), ObjectAnimator.ofFloat(this.s, (Property<org.telegram.ui.Components.qq, Float>) property2, 1.0f), ObjectAnimator.ofFloat(this.s, (Property<org.telegram.ui.Components.qq, Float>) property3, 1.0f));
                } else {
                    this.V.setVisibility(0);
                    this.X.setEnabled(true);
                    AnimatorSet animatorSet3 = this.w;
                    org.telegram.ui.Components.qq qqVar = this.s;
                    Property property4 = View.SCALE_X;
                    ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(qqVar, (Property<org.telegram.ui.Components.qq, Float>) property4, 0.1f);
                    org.telegram.ui.Components.qq qqVar2 = this.s;
                    Property property5 = View.SCALE_Y;
                    ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(qqVar2, (Property<org.telegram.ui.Components.qq, Float>) property5, 0.1f);
                    org.telegram.ui.Components.qq qqVar3 = this.s;
                    Property property6 = View.ALPHA;
                    animatorSet3.playTogether(ofFloat3, ofFloat4, ObjectAnimator.ofFloat(qqVar3, (Property<org.telegram.ui.Components.qq, Float>) property6, 0.0f), ObjectAnimator.ofFloat(this.V, (Property<TextView, Float>) property4, 1.0f), ObjectAnimator.ofFloat(this.V, (Property<TextView, Float>) property5, 1.0f), ObjectAnimator.ofFloat(this.V, (Property<TextView, Float>) property6, 1.0f));
                }
                this.w.addListener(new fl0(this, z11, i7));
                this.w.setDuration(150L);
                this.w.start();
                return;
            }
            return;
        }
        AnimatorSet animatorSet4 = new AnimatorSet();
        this.w = animatorSet4;
        if (z11) {
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
            animatorSet5.playTogether(ofFloat5, ofFloat6, ObjectAnimator.ofFloat(contentView3, (Property<View, Float>) property9, 0.0f), ObjectAnimator.ofFloat(this.r, (Property<org.telegram.ui.Components.qq, Float>) property7, 1.0f), ObjectAnimator.ofFloat(this.r, (Property<org.telegram.ui.Components.qq, Float>) property8, 1.0f), ObjectAnimator.ofFloat(this.r, (Property<org.telegram.ui.Components.qq, Float>) property9, 1.0f));
        } else if (this.x != null) {
            animatorSet4.playTogether(ObjectAnimator.ofFloat(this.r, (Property<org.telegram.ui.Components.qq, Float>) View.SCALE_X, 0.1f), ObjectAnimator.ofFloat(this.r, (Property<org.telegram.ui.Components.qq, Float>) View.SCALE_Y, 0.1f), ObjectAnimator.ofFloat(this.r, (Property<org.telegram.ui.Components.qq, Float>) View.ALPHA, 0.0f));
        } else {
            this.n.getContentView().setVisibility(0);
            this.n.setEnabled(true);
            AnimatorSet animatorSet6 = this.w;
            org.telegram.ui.Components.qq qqVar4 = this.r;
            Property property10 = View.SCALE_X;
            ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(qqVar4, (Property<org.telegram.ui.Components.qq, Float>) property10, 0.1f);
            org.telegram.ui.Components.qq qqVar5 = this.r;
            Property property11 = View.SCALE_Y;
            ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(qqVar5, (Property<org.telegram.ui.Components.qq, Float>) property11, 0.1f);
            org.telegram.ui.Components.qq qqVar6 = this.r;
            Property property12 = View.ALPHA;
            animatorSet6.playTogether(ofFloat7, ofFloat8, ObjectAnimator.ofFloat(qqVar6, (Property<org.telegram.ui.Components.qq, Float>) property12, 0.0f));
            if (!isFinishing()) {
                this.w.playTogether(ObjectAnimator.ofFloat(this.n.getContentView(), (Property<View, Float>) property10, 1.0f), ObjectAnimator.ofFloat(this.n.getContentView(), (Property<View, Float>) property11, 1.0f), ObjectAnimator.ofFloat(this.n.getContentView(), (Property<View, Float>) property12, 1.0f));
            }
        }
        this.w.addListener(new fl0(this, z11, i10));
        this.w.setDuration(150L);
        this.w.start();
    }

    public final void O0(String str) {
        if (getParentActivity() == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        String N0 = org.telegram.messenger.gd.N0(2131747160, null);
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
        t1Var.S = N0;
        t1Var.U = org.telegram.messenger.g0.W2(org.telegram.messenger.gd.a0("PaymentTransactionMessage2", null, 2131747161, str, this.q0, this.r0));
        alertDialog$Builder.k(org.telegram.messenger.gd.N0(2131751759, null), new pk0(this, 5));
        alertDialog$Builder.h(org.telegram.messenger.gd.N0(2131752577, null), null);
        showDialog(t1Var);
    }

    public final void P0() {
        if (this.v0 == 6) {
            org.telegram.ui.Cells.a9[] a9VarArr = this.N;
            if (a9VarArr[2] == null) {
                return;
            }
            int i7 = 0;
            this.n.setVisibility(0);
            TL_account.Password password = this.b0;
            ArrayList arrayList = this.K;
            org.telegram.ui.Cells.o4[] o4VarArr = this.J;
            org.telegram.ui.Cells.x9[] x9VarArr = this.O;
            if (password == null) {
                N0(true, true);
                a9VarArr[2].setVisibility(8);
                x9VarArr[0].setVisibility(8);
                x9VarArr[1].setVisibility(8);
                this.T.setVisibility(8);
                o4VarArr[0].setVisibility(8);
                o4VarArr[1].setVisibility(8);
                a9VarArr[0].setVisibility(8);
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
            if (!this.c0) {
                a9VarArr[2].setVisibility(8);
                x9VarArr[0].setVisibility(8);
                x9VarArr[1].setVisibility(8);
                a9VarArr[1].setText(org.telegram.messenger.gd.N0(2131747197, null));
                this.T.setVisibility(8);
                o4VarArr[0].setVisibility(0);
                o4VarArr[1].setVisibility(0);
                a9VarArr[0].setVisibility(0);
                for (int i11 = 0; i11 < 3; i11++) {
                    ((View) this.f[i11].getParent()).setVisibility(0);
                }
                for (int i12 = 0; i12 < arrayList.size(); i12++) {
                    ((View) arrayList.get(i12)).setVisibility(0);
                }
                return;
            }
            org.telegram.ui.Cells.a9 a9Var = a9VarArr[2];
            String str = this.b0.email_unconfirmed_pattern;
            if (str == null) {
                str = "";
            }
            a9Var.setText(org.telegram.messenger.gd.a0("EmailPasswordConfirmText2", null, 2131751187, str));
            a9VarArr[2].setVisibility(0);
            x9VarArr[0].setVisibility(0);
            x9VarArr[1].setVisibility(0);
            this.T.setVisibility(0);
            a9VarArr[1].setText("");
            o4VarArr[0].setVisibility(8);
            o4VarArr[1].setVisibility(8);
            a9VarArr[0].setVisibility(8);
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
        org.telegram.ui.Cells.a9[] a9VarArr = this.N;
        if (a9VarArr[0] != null) {
            org.telegram.ui.Cells.z6[] z6VarArr = this.L;
            if (z6VarArr[2] == null) {
                return;
            }
            TLRPC.PaymentForm paymentForm = this.D0;
            if ((!paymentForm.password_missing && !paymentForm.can_save_credentials) || (this.x != null && this.A0)) {
                this.M.setVisibility(8);
                a9VarArr[0].setVisibility(8);
                org.telegram.ui.Cells.z6 z6Var = z6VarArr[2];
                org.telegram.ui.ActionBar.t6.Z(z6Var, z6Var.getContext(), R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.m6.b7);
                return;
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(org.telegram.messenger.gd.N0(2131747227, null));
            if (this.D0.password_missing) {
                C0();
                spannableStringBuilder.append((CharSequence) "\n");
                int length = spannableStringBuilder.length();
                String N0 = org.telegram.messenger.gd.N0(2131747226, null);
                int indexOf = N0.indexOf(42);
                int lastIndexOf = N0.lastIndexOf(42);
                spannableStringBuilder.append((CharSequence) N0);
                if (indexOf != -1 && lastIndexOf != -1) {
                    int i7 = indexOf + length;
                    int i10 = lastIndexOf + length;
                    a9VarArr[0].getTextView().setMovementMethod(new org.telegram.messenger.c0(false));
                    spannableStringBuilder.replace(i10, i10 + 1, (CharSequence) "");
                    spannableStringBuilder.replace(i7, i7 + 1, (CharSequence) "");
                    spannableStringBuilder.setSpan(new jl0(this), i7, i10 - 1, 33);
                }
            }
            this.M.setEnabled(true);
            a9VarArr[0].setText(spannableStringBuilder);
            this.M.setVisibility(0);
            a9VarArr[0].setVisibility(0);
            org.telegram.ui.Cells.z6 z6Var2 = z6VarArr[2];
            org.telegram.ui.ActionBar.t6.Z(z6Var2, z6Var2.getContext(), R.drawable.greydivider, org.telegram.ui.ActionBar.m6.b7);
        }
    }

    public final void R0() {
        this.S0[0] = y0(this.u0);
        this.S.a(org.telegram.messenger.gd.N0(2131747159, null), this.S0[0], true);
        TextView textView = this.V;
        if (textView != null) {
            textView.setText(org.telegram.messenger.gd.a0("PaymentCheckoutPay", null, 2131747217, this.S0[0]));
        }
        if (this.t0 != null) {
            int themedColor = getThemedColor(org.telegram.ui.ActionBar.m6.Vi);
            int childCount = this.t0.getChildCount();
            for (int i7 = 0; i7 < childCount; i7++) {
                TextView textView2 = (TextView) this.t0.getChildAt(i7);
                if (textView2.getTag().equals(this.I0)) {
                    org.telegram.ui.ActionBar.m6.C1(themedColor, textView2.getBackground());
                    org.telegram.ui.ActionBar.t6.U(textView2, org.telegram.ui.ActionBar.m6.Wi, this.Z0);
                } else {
                    org.telegram.ui.ActionBar.m6.C1(536870911 & themedColor, textView2.getBackground());
                    org.telegram.ui.ActionBar.t6.U(textView2, org.telegram.ui.ActionBar.m6.Z8, this.Z0);
                }
                textView2.invalidate();
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.J6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.h7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.g7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.E7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.D7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.s8));
    }

    /* JADX WARN: Code restructure failed: missing block: B:178:0x031c, code lost:
    
        if (r15.email_requested == false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:481:0x1025, code lost:
    
        if (r11.email_requested == false) goto L464;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0795  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x07af  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x07c4  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x07db  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0816  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0875  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0904  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x082f  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x07e8  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x07a5  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x0bb2  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x0c17  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x0c49  */
    /* JADX WARN: Removed duplicated region for block: B:330:0x0c77  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x0d43  */
    /* JADX WARN: Removed duplicated region for block: B:351:0x0c94  */
    /* JADX WARN: Removed duplicated region for block: B:361:0x0c4b  */
    /* JADX WARN: Removed duplicated region for block: B:362:0x0c24  */
    /* JADX WARN: Removed duplicated region for block: B:369:0x0c07  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0221  */
    /* JADX WARN: Type inference failed for: r10v177, types: [android.view.ViewGroup, android.widget.LinearLayout] */
    /* JADX WARN: Type inference failed for: r10v227, types: [boolean] */
    /* JADX WARN: Type inference failed for: r10v228, types: [android.view.ViewGroup, android.widget.LinearLayout] */
    /* JADX WARN: Type inference failed for: r13v1, types: [java.lang.Object, org.telegram.ui.ActionBar.p6, org.telegram.ui.Cells.o6] */
    /* JADX WARN: Type inference failed for: r4v314, types: [android.view.View, android.view.ViewGroup, android.widget.FrameLayout] */
    /* JADX WARN: Type inference failed for: r4v318, types: [android.view.ViewGroup] */
    /* JADX WARN: Type inference failed for: r4v319, types: [android.view.ViewGroup] */
    /* JADX WARN: Type inference failed for: r4v354, types: [android.view.View, android.view.ViewGroup, android.widget.LinearLayout] */
    @Override // org.telegram.ui.ActionBar.g2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View createView(Context context) {
        int i7;
        char c10;
        TLRPC.PaymentForm paymentForm;
        SpannableStringBuilder spannableStringBuilder;
        TLRPC.PaymentForm paymentForm2;
        TLRPC.TL_paymentRequestedInfo tL_paymentRequestedInfo;
        boolean z10;
        int i10;
        int i11;
        int i12;
        TLRPC.TL_invoice tL_invoice;
        org.telegram.ui.Cells.z6 z6Var;
        TLRPC.TL_paymentRequestedInfo tL_paymentRequestedInfo2;
        TLRPC.TL_paymentRequestedInfo tL_paymentRequestedInfo3;
        String str;
        ?? frameLayout;
        int i13;
        int i14;
        TLRPC.TL_postAddress tL_postAddress;
        TLRPC.TL_postAddress tL_postAddress2;
        TLRPC.TL_postAddress tL_postAddress3;
        TLRPC.TL_postAddress tL_postAddress4;
        TLRPC.TL_postAddress tL_postAddress5;
        TLRPC.TL_postAddress tL_postAddress6;
        String str2;
        String str3;
        BufferedReader bufferedReader;
        switch (this.v0) {
            case 0:
                this.actionBar.setTitle(org.telegram.messenger.gd.M0(2131747181));
                break;
            case 1:
                this.actionBar.setTitle(org.telegram.messenger.gd.M0(2131747180));
                break;
            case 2:
            case 3:
                TLRPC.TL_paymentFormMethod tL_paymentFormMethod = this.G0;
                if (tL_paymentFormMethod != null && !TextUtils.isEmpty(tL_paymentFormMethod.title)) {
                    this.actionBar.setTitle(this.G0.title);
                    break;
                } else {
                    this.actionBar.setTitle(org.telegram.messenger.gd.M0(2131747231));
                    break;
                }
                break;
            case 4:
                if (this.D0.invoice.test) {
                    this.actionBar.setTitle("Test " + org.telegram.messenger.gd.M0(2131747224));
                    break;
                } else {
                    this.actionBar.setTitle(org.telegram.messenger.gd.M0(2131747224));
                    break;
                }
            case 5:
                if (this.D0.invoice.test) {
                    this.actionBar.setTitle("Test " + org.telegram.messenger.gd.M0(2131747188));
                    break;
                } else {
                    this.actionBar.setTitle(org.telegram.messenger.gd.M0(2131747188));
                    break;
                }
            case 6:
                this.actionBar.setTitle(org.telegram.messenger.gd.M0(2131747199));
                break;
        }
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new al0(this));
        org.telegram.ui.ActionBar.y s5 = this.actionBar.s();
        int i15 = this.v0;
        int i16 = 6;
        int i17 = 3;
        if (i15 == 0 || i15 == 1 || i15 == 2 || i15 == 3 || i15 == 4 || i15 == 6) {
            this.n = s5.h(1, R.drawable.ic_ab_done, org.telegram.messenger.g0.L(56.0f), org.telegram.messenger.gd.M0(2131751342));
            org.telegram.ui.Components.qq qqVar = new org.telegram.ui.Components.qq(context, 1);
            this.r = qqVar;
            qqVar.setAlpha(0.0f);
            this.r.setScaleX(0.1f);
            this.r.setScaleY(0.1f);
            this.r.setVisibility(4);
            this.n.addView(this.r, c8.ma.c(-1.0f, -1));
        }
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.fragmentView = frameLayout2;
        org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.a7, frameLayout2, getResourceProvider());
        ScrollView scrollView = new ScrollView(context);
        this.F = scrollView;
        scrollView.setFillViewport(true);
        org.telegram.messenger.g0.x3(this.F, getThemedColor(org.telegram.ui.ActionBar.m6.s8));
        frameLayout2.addView(this.F, c8.ma.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, this.v0 == 4 ? 48.0f : 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.R = linearLayout;
        linearLayout.setOrientation(1);
        int i18 = 0;
        this.R.setClipChildren(false);
        this.F.addView(this.R, new FrameLayout.LayoutParams(-1, -2));
        int i19 = this.v0;
        int i20 = 10;
        int i21 = 2;
        int i22 = 1;
        String str4 = "";
        String str5 = null;
        if (i19 == 0) {
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            try {
                bufferedReader = new BufferedReader(new InputStreamReader(context.getResources().getAssets().open("countries.txt")));
            } catch (Exception e10) {
                e = e10;
                i10 = i18;
            }
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine != null) {
                    String[] split = readLine.split(";");
                    this.a.add(i18, split[2]);
                    i10 = i18;
                    try {
                        this.b.put(split[2], split[i10]);
                        this.c.put(split[i10], split[2]);
                        hashMap2.put(split[1], split[2]);
                        if (split.length > 3) {
                            this.d.put(split[i10], split[3]);
                        }
                        hashMap.put(split[1], split[2]);
                        i18 = i10;
                    } catch (Exception e11) {
                        e = e11;
                    }
                } else {
                    i10 = i18;
                    bufferedReader.close();
                    Collections.sort(this.a, new pe(27));
                    this.f = new EditTextBoldCursor[10];
                    i11 = i10;
                    while (i11 < i20) {
                        if (i11 == 0) {
                            this.J[i10] = new org.telegram.ui.Cells.o4(context, this.Z0);
                            org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.d6, this.J[i10], getResourceProvider());
                            this.J[i10].setText(org.telegram.messenger.gd.M0(2131747187));
                            this.R.addView(this.J[i10], c8.ma.o(-1, -2));
                        } else if (i11 == i16) {
                            this.L[i10] = new org.telegram.ui.Cells.z6(context, (Object) null);
                            this.R.addView(this.L[i10], c8.ma.o(-1, -2));
                            this.J[i22] = new org.telegram.ui.Cells.o4(context, this.Z0);
                            org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.d6, this.J[i22], getResourceProvider());
                            this.J[i22].setText(org.telegram.messenger.gd.M0(2131747177));
                            this.R.addView(this.J[i22], c8.ma.o(-1, -2));
                        }
                        if (i11 == 8) {
                            frameLayout = new LinearLayout(context);
                            ?? r10 = i10;
                            frameLayout.setClipChildren(r10);
                            frameLayout.setOrientation(r10 == true ? 1 : 0);
                            this.R.addView(frameLayout, c8.ma.o(-1, 50));
                            org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.d6, frameLayout, getResourceProvider());
                        } else if (i11 == 9) {
                            frameLayout = (ViewGroup) this.f[8].getParent();
                        } else {
                            frameLayout = new FrameLayout(context);
                            frameLayout.setClipChildren(false);
                            this.R.addView(frameLayout, c8.ma.o(-1, 50));
                            int i23 = org.telegram.ui.ActionBar.m6.d6;
                            org.telegram.ui.ActionBar.t6.h(i23, frameLayout, getResourceProvider());
                            int i24 = i11 != 5 ? i22 : 0;
                            if (i24 != 0) {
                                if (i11 != 7 || this.D0.invoice.phone_requested) {
                                    if (i11 == i16) {
                                        TLRPC.TL_invoice tL_invoice2 = this.D0.invoice;
                                        if (!tL_invoice2.phone_requested) {
                                        }
                                    }
                                }
                                i24 = 0;
                            }
                            if (i24 != 0) {
                                org.telegram.ui.Components.ln lnVar = new org.telegram.ui.Components.ln(context, 17);
                                org.telegram.ui.ActionBar.t6.h(i23, lnVar, getResourceProvider());
                                this.K.add(lnVar);
                                frameLayout.addView(lnVar, new FrameLayout.LayoutParams(-1, i22, 83));
                            }
                        }
                        if (i11 == 9) {
                            this.f[i11] = new org.telegram.ui.Components.j30(context);
                        } else {
                            this.f[i11] = new EditTextBoldCursor(context);
                        }
                        this.f[i11].setTag(Integer.valueOf(i11));
                        this.f[i11].setTextSize(1, 16.0f);
                        org.telegram.ui.ActionBar.t6.D(this.f[i11], org.telegram.ui.ActionBar.m6.H6, getResourceProvider());
                        EditTextBoldCursor editTextBoldCursor = this.f[i11];
                        int i25 = org.telegram.ui.ActionBar.m6.G6;
                        org.telegram.ui.ActionBar.t6.U(editTextBoldCursor, i25, getResourceProvider());
                        this.f[i11].setBackgroundDrawable(null);
                        org.telegram.ui.ActionBar.t6.v(this.f[i11], i25, getResourceProvider());
                        this.f[i11].setCursorSize(org.telegram.messenger.g0.L(20.0f));
                        this.f[i11].setCursorWidth(1.5f);
                        if (i11 == 4) {
                            final int i26 = 0;
                            this.f[i11].setOnTouchListener(new View.OnTouchListener(this) { // from class: org.telegram.ui.kk0
                                public final /* synthetic */ ml0 b;

                                {
                                    this.b = this;
                                }

                                @Override // android.view.View.OnTouchListener
                                public final boolean onTouch(View view, MotionEvent motionEvent) {
                                    switch (i26) {
                                        case 0:
                                            ml0 ml0Var = this.b;
                                            if (ml0Var.getParentActivity() != null) {
                                                if (motionEvent.getAction() == 1) {
                                                    us usVar = new us(null, false);
                                                    usVar.n = true;
                                                    usVar.r = new pk0(ml0Var, 4);
                                                    ml0Var.presentFragment(usVar);
                                                }
                                                break;
                                            }
                                            break;
                                        default:
                                            ml0 ml0Var2 = this.b;
                                            if (ml0Var2.getParentActivity() != null) {
                                                if (motionEvent.getAction() == 1) {
                                                    us usVar2 = new us(null, false);
                                                    usVar2.n = true;
                                                    usVar2.r = new pk0(ml0Var2, 2);
                                                    ml0Var2.presentFragment(usVar2);
                                                }
                                                break;
                                            }
                                            break;
                                    }
                                    return true;
                                }
                            });
                            this.f[i11].setInputType(0);
                        }
                        if (i11 == 9 || i11 == 8) {
                            this.f[i11].setInputType(i17);
                        } else if (i11 == 7) {
                            this.f[i11].setInputType(1);
                        } else {
                            this.f[i11].setInputType(16385);
                        }
                        this.f[i11].setImeOptions(268435461);
                        switch (i11) {
                            case 0:
                                this.f[i11].setHint(org.telegram.messenger.gd.M0(2131747186));
                                TLRPC.TL_paymentRequestedInfo tL_paymentRequestedInfo4 = this.D0.saved_info;
                                if (tL_paymentRequestedInfo4 != null && (tL_postAddress = tL_paymentRequestedInfo4.shipping_address) != null) {
                                    this.f[i11].setText(tL_postAddress.street_line1);
                                    break;
                                }
                                break;
                            case 1:
                                this.f[i11].setHint(org.telegram.messenger.gd.M0(2131747185));
                                TLRPC.TL_paymentRequestedInfo tL_paymentRequestedInfo5 = this.D0.saved_info;
                                if (tL_paymentRequestedInfo5 != null && (tL_postAddress2 = tL_paymentRequestedInfo5.shipping_address) != null) {
                                    this.f[i11].setText(tL_postAddress2.street_line2);
                                    break;
                                }
                                break;
                            case 2:
                                this.f[i11].setHint(org.telegram.messenger.gd.M0(2131747184));
                                TLRPC.TL_paymentRequestedInfo tL_paymentRequestedInfo6 = this.D0.saved_info;
                                if (tL_paymentRequestedInfo6 != null && (tL_postAddress3 = tL_paymentRequestedInfo6.shipping_address) != null) {
                                    this.f[i11].setText(tL_postAddress3.city);
                                    break;
                                }
                                break;
                            case 3:
                                this.f[i11].setHint(org.telegram.messenger.gd.M0(2131747174));
                                TLRPC.TL_paymentRequestedInfo tL_paymentRequestedInfo7 = this.D0.saved_info;
                                if (tL_paymentRequestedInfo7 != null && (tL_postAddress4 = tL_paymentRequestedInfo7.shipping_address) != null) {
                                    this.f[i11].setText(tL_postAddress4.state);
                                    break;
                                }
                                break;
                            case 4:
                                this.f[i11].setHint(org.telegram.messenger.gd.M0(2131747183));
                                TLRPC.TL_paymentRequestedInfo tL_paymentRequestedInfo8 = this.D0.saved_info;
                                if (tL_paymentRequestedInfo8 != null && (tL_postAddress5 = tL_paymentRequestedInfo8.shipping_address) != null) {
                                    String str6 = (String) hashMap2.get(tL_postAddress5.country_iso2);
                                    String str7 = this.D0.saved_info.shipping_address.country_iso2;
                                    this.C0 = str7;
                                    EditTextBoldCursor editTextBoldCursor2 = this.f[i11];
                                    if (str6 == null) {
                                        str6 = str7;
                                    }
                                    editTextBoldCursor2.setText(str6);
                                    break;
                                }
                                break;
                            case 5:
                                this.f[i11].setHint(org.telegram.messenger.gd.M0(2131747173));
                                TLRPC.TL_paymentRequestedInfo tL_paymentRequestedInfo9 = this.D0.saved_info;
                                if (tL_paymentRequestedInfo9 != null && (tL_postAddress6 = tL_paymentRequestedInfo9.shipping_address) != null) {
                                    this.f[i11].setText(tL_postAddress6.post_code);
                                    break;
                                }
                                break;
                            case 6:
                                this.f[i11].setHint(org.telegram.messenger.gd.M0(2131747179));
                                TLRPC.TL_paymentRequestedInfo tL_paymentRequestedInfo10 = this.D0.saved_info;
                                if (tL_paymentRequestedInfo10 != null && (str2 = tL_paymentRequestedInfo10.name) != null) {
                                    this.f[i11].setText(str2);
                                    break;
                                }
                                break;
                            case 7:
                                this.f[i11].setHint(org.telegram.messenger.gd.M0(2131747182));
                                TLRPC.TL_paymentRequestedInfo tL_paymentRequestedInfo11 = this.D0.saved_info;
                                if (tL_paymentRequestedInfo11 != null && (str3 = tL_paymentRequestedInfo11.email) != null) {
                                    this.f[i11].setText(str3);
                                    break;
                                }
                                break;
                        }
                        EditTextBoldCursor editTextBoldCursor3 = this.f[i11];
                        editTextBoldCursor3.setSelection(editTextBoldCursor3.length());
                        if (i11 == 8) {
                            TextView textView = new TextView(context);
                            this.I = textView;
                            textView.setText("+");
                            org.telegram.ui.ActionBar.t6.U(this.I, i25, getResourceProvider());
                            this.I.setTextSize(1, 16.0f);
                            frameLayout.addView(this.I, c8.ma.k(21.0f, 12.0f, 0.0f, 6.0f, -2, -2));
                            this.f[i11].setPadding(org.telegram.messenger.g0.L(10.0f), 0, 0, 0);
                            this.f[i11].setGravity(19);
                            this.f[i11].setFilters(new InputFilter[]{new InputFilter.LengthFilter(5)});
                            frameLayout.addView(this.f[i11], c8.ma.k(0.0f, 12.0f, 21.0f, 6.0f, 55, -2));
                            this.f[i11].addTextChangedListener(new bl0(this, 1));
                        } else if (i11 == 9) {
                            this.f[i11].setPadding(0, 0, 0, 0);
                            this.f[i11].setGravity(19);
                            frameLayout.addView(this.f[i11], c8.ma.k(0.0f, 12.0f, 21.0f, 6.0f, -1, -2));
                            this.f[i11].addTextChangedListener(new ar(this, 4));
                        } else {
                            this.f[i11].setPadding(0, 0, 0, org.telegram.messenger.g0.L(6.0f));
                            this.f[i11].setGravity(org.telegram.messenger.gd.a0 ? 5 : i17);
                            frameLayout.addView(this.f[i11], c8.ma.d(-1, -2.0f, 51, 21.0f, 12.0f, 21.0f, 6.0f));
                        }
                        final int i27 = i21;
                        this.f[i11].setOnEditorActionListener(new TextView.OnEditorActionListener(this) { // from class: org.telegram.ui.mk0
                            public final /* synthetic */ ml0 b;

                            {
                                this.b = this;
                            }

                            @Override // android.widget.TextView.OnEditorActionListener
                            public final boolean onEditorAction(TextView textView2, int i28, KeyEvent keyEvent) {
                                EditTextBoldCursor[] editTextBoldCursorArr;
                                switch (i27) {
                                    case 0:
                                        ml0 ml0Var = this.b;
                                        if (i28 != 6) {
                                            ml0Var.getClass();
                                            break;
                                        } else {
                                            ml0Var.G0(false);
                                            break;
                                        }
                                    case 1:
                                        ml0 ml0Var2 = this.b;
                                        if (i28 != 6) {
                                            ml0Var2.getClass();
                                            if (i28 == 5) {
                                                int intValue = ((Integer) textView2.getTag()).intValue();
                                                if (intValue != 0) {
                                                    if (intValue == 1) {
                                                        ml0Var2.f[2].requestFocus();
                                                        break;
                                                    }
                                                } else {
                                                    ml0Var2.f[1].requestFocus();
                                                    break;
                                                }
                                            }
                                        } else {
                                            ml0Var2.n.performClick();
                                            break;
                                        }
                                        break;
                                    case 2:
                                        ml0 ml0Var3 = this.b;
                                        ml0Var3.getClass();
                                        if (i28 != 5) {
                                            if (i28 == 6) {
                                                ml0Var3.n.performClick();
                                                break;
                                            }
                                        } else {
                                            int intValue2 = ((Integer) textView2.getTag()).intValue();
                                            while (true) {
                                                intValue2++;
                                                EditTextBoldCursor[] editTextBoldCursorArr2 = ml0Var3.f;
                                                if (intValue2 >= editTextBoldCursorArr2.length) {
                                                    break;
                                                } else if (intValue2 != 4 && ((View) editTextBoldCursorArr2[intValue2].getParent()).getVisibility() == 0) {
                                                    ml0Var3.f[intValue2].requestFocus();
                                                    break;
                                                }
                                            }
                                        }
                                        break;
                                    case 3:
                                        ml0 ml0Var4 = this.b;
                                        ml0Var4.getClass();
                                        if (i28 != 5) {
                                            if (i28 == 6) {
                                                ml0Var4.n.performClick();
                                                break;
                                            }
                                        } else {
                                            int intValue3 = ((Integer) textView2.getTag()).intValue();
                                            do {
                                                int i29 = intValue3 + 1;
                                                editTextBoldCursorArr = ml0Var4.f;
                                                if (i29 >= editTextBoldCursorArr.length) {
                                                    break;
                                                } else {
                                                    intValue3 = i29 == 4 ? intValue3 + 2 : i29;
                                                }
                                            } while (((View) editTextBoldCursorArr[intValue3].getParent()).getVisibility() != 0);
                                            ml0Var4.f[intValue3].requestFocus();
                                            break;
                                        }
                                        break;
                                    default:
                                        ml0 ml0Var5 = this.b;
                                        if (i28 != 6) {
                                            ml0Var5.getClass();
                                            break;
                                        } else {
                                            ml0Var5.n.performClick();
                                            break;
                                        }
                                }
                                return false;
                            }
                        });
                        if (i11 == 9) {
                            TLRPC.TL_invoice tL_invoice3 = this.D0.invoice;
                            if (tL_invoice3.email_to_provider || tL_invoice3.phone_to_provider) {
                                TLRPC.User user = null;
                                int i28 = 0;
                                while (i28 < this.D0.users.size()) {
                                    TLRPC.User user2 = this.D0.users.get(i28);
                                    int i29 = i17;
                                    int i30 = i16;
                                    if (user2.id == this.D0.provider_id) {
                                        user = user2;
                                    }
                                    i28++;
                                    i17 = i29;
                                    i16 = i30;
                                }
                                i13 = i16;
                                i14 = i17;
                                String n10 = user != null ? org.telegram.messenger.i5.n(user.first_name, user.last_name) : "";
                                this.N[1] = new org.telegram.ui.Cells.a9(context, this.Z0);
                                org.telegram.ui.ActionBar.t6.Z(this.N[1], context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.m6.b7);
                                this.R.addView(this.N[1], c8.ma.o(-1, -2));
                                TLRPC.TL_invoice tL_invoice4 = this.D0.invoice;
                                boolean z11 = tL_invoice4.email_to_provider;
                                if (z11 && tL_invoice4.phone_to_provider) {
                                    this.N[1].setText(org.telegram.messenger.gd.Y(2131747191, "PaymentPhoneEmailToProvider", n10));
                                } else if (z11) {
                                    this.N[1].setText(org.telegram.messenger.gd.Y(2131747209, "PaymentEmailToProvider", n10));
                                } else {
                                    this.N[1].setText(org.telegram.messenger.gd.Y(2131747190, "PaymentPhoneToProvider", n10));
                                }
                            } else {
                                this.L[1] = new org.telegram.ui.Cells.z6(context, (Object) null);
                                this.R.addView(this.L[1], c8.ma.o(-1, -2));
                                i13 = i16;
                                i14 = i17;
                            }
                            org.telegram.ui.Cells.s8 s8Var = new org.telegram.ui.Cells.s8(context, this.Z0);
                            this.M = s8Var;
                            org.telegram.ui.ActionBar.t6.R(s8Var, org.telegram.ui.ActionBar.m6.N0(true), org.telegram.ui.ActionBar.t6.M(org.telegram.ui.ActionBar.m6.d6), org.telegram.ui.ActionBar.t6.M(org.telegram.ui.ActionBar.m6.i6));
                            this.M.f(org.telegram.messenger.gd.M0(2131747176), this.U0, false);
                            this.R.addView(this.M, c8.ma.o(-1, -2));
                            this.M.setOnClickListener(new jk0(this, 9));
                            this.N[0] = new org.telegram.ui.Cells.a9(context, this.Z0);
                            org.telegram.ui.ActionBar.t6.Z(this.N[0], context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.m6.b7);
                            this.N[0].setText(org.telegram.messenger.gd.M0(2131747175));
                            this.R.addView(this.N[0], c8.ma.o(-1, -2));
                        } else {
                            i13 = i16;
                            i14 = i17;
                        }
                        i11++;
                        i17 = i14;
                        i16 = i13;
                        i20 = 10;
                        i21 = 2;
                        i22 = 1;
                        i10 = 0;
                    }
                    int i31 = i16;
                    int i32 = i17;
                    if (this.D0.invoice.name_requested) {
                        i12 = 8;
                        ((ViewGroup) this.f[i31].getParent()).setVisibility(8);
                    } else {
                        i12 = 8;
                    }
                    if (!this.D0.invoice.phone_requested) {
                        ((ViewGroup) this.f[i12].getParent()).setVisibility(i12);
                    }
                    if (!this.D0.invoice.email_requested) {
                        ((ViewGroup) this.f[7].getParent()).setVisibility(i12);
                    }
                    tL_invoice = this.D0.invoice;
                    if (!tL_invoice.phone_requested) {
                        this.f[9].setImeOptions(268435462);
                    } else if (tL_invoice.email_requested) {
                        this.f[7].setImeOptions(268435462);
                    } else if (tL_invoice.name_requested) {
                        this.f[i31].setImeOptions(268435462);
                    } else {
                        this.f[5].setImeOptions(268435462);
                    }
                    z6Var = this.L[1];
                    if (z6Var == null) {
                        TLRPC.TL_invoice tL_invoice5 = this.D0.invoice;
                        z6Var.setVisibility((tL_invoice5.name_requested || tL_invoice5.phone_requested || tL_invoice5.email_requested) ? 0 : 8);
                    } else {
                        org.telegram.ui.Cells.a9 a9Var = this.N[1];
                        if (a9Var != null) {
                            TLRPC.TL_invoice tL_invoice6 = this.D0.invoice;
                            a9Var.setVisibility((tL_invoice6.name_requested || tL_invoice6.phone_requested || tL_invoice6.email_requested) ? 0 : 8);
                        }
                    }
                    org.telegram.ui.Cells.o4 o4Var = this.J[1];
                    TLRPC.TL_invoice tL_invoice7 = this.D0.invoice;
                    o4Var.setVisibility((!tL_invoice7.name_requested || tL_invoice7.phone_requested || tL_invoice7.email_requested) ? 0 : 8);
                    if (!this.D0.invoice.shipping_address_requested) {
                        this.J[0].setVisibility(8);
                        this.L[0].setVisibility(8);
                        ((ViewGroup) this.f[0].getParent()).setVisibility(8);
                        ((ViewGroup) this.f[1].getParent()).setVisibility(8);
                        ((ViewGroup) this.f[2].getParent()).setVisibility(8);
                        ((ViewGroup) this.f[i32].getParent()).setVisibility(8);
                        ((ViewGroup) this.f[4].getParent()).setVisibility(8);
                        ((ViewGroup) this.f[5].getParent()).setVisibility(8);
                    }
                    tL_paymentRequestedInfo2 = this.D0.saved_info;
                    if (tL_paymentRequestedInfo2 != null || TextUtils.isEmpty(tL_paymentRequestedInfo2.phone)) {
                        t0(null);
                    } else {
                        t0(this.D0.saved_info.phone);
                    }
                    if (this.f[8].length() == 0) {
                        TLRPC.PaymentForm paymentForm3 = this.D0;
                        if (paymentForm3.invoice.phone_requested && ((tL_paymentRequestedInfo3 = paymentForm3.saved_info) == null || TextUtils.isEmpty(tL_paymentRequestedInfo3.phone))) {
                            try {
                                TelephonyManager telephonyManager = (TelephonyManager) org.telegram.messenger.t0.b.getSystemService("phone");
                                if (telephonyManager != null) {
                                    str5 = telephonyManager.getSimCountryIso().toUpperCase();
                                }
                            } catch (Exception e12) {
                                org.telegram.messenger.a8.f(e12);
                            }
                            if (str5 != null && (str = (String) hashMap.get(str5)) != null && this.a.indexOf(str) != -1) {
                                this.f[8].setText((CharSequence) this.b.get(str));
                            }
                        }
                    }
                }
                e = e11;
                org.telegram.messenger.a8.f(e);
                Collections.sort(this.a, new pe(27));
                this.f = new EditTextBoldCursor[10];
                i11 = i10;
                while (i11 < i20) {
                }
                int i312 = i16;
                int i322 = i17;
                if (this.D0.invoice.name_requested) {
                }
                if (!this.D0.invoice.phone_requested) {
                }
                if (!this.D0.invoice.email_requested) {
                }
                tL_invoice = this.D0.invoice;
                if (!tL_invoice.phone_requested) {
                }
                z6Var = this.L[1];
                if (z6Var == null) {
                }
                org.telegram.ui.Cells.o4 o4Var2 = this.J[1];
                TLRPC.TL_invoice tL_invoice72 = this.D0.invoice;
                o4Var2.setVisibility((!tL_invoice72.name_requested || tL_invoice72.phone_requested || tL_invoice72.email_requested) ? 0 : 8);
                if (!this.D0.invoice.shipping_address_requested) {
                }
                tL_paymentRequestedInfo2 = this.D0.saved_info;
                if (tL_paymentRequestedInfo2 != null) {
                }
                t0(null);
                if (this.f[8].length() == 0) {
                }
            }
        } else {
            int i33 = 3;
            int i34 = 16;
            int i35 = 2131747225;
            if (i19 == 2) {
                if (this.D0.native_params != null) {
                    try {
                        JSONObject jSONObject = new JSONObject(this.D0.native_params.data);
                        String optString = jSONObject.optString("google_pay_public_key");
                        if (!TextUtils.isEmpty(optString)) {
                            this.L0 = optString;
                        }
                        this.M0 = jSONObject.optString("acquirer_bank_country");
                        this.N0 = jSONObject.optJSONObject("gpay_parameters");
                    } catch (Exception e13) {
                        org.telegram.messenger.a8.f(e13);
                    }
                }
                if (this.T0 || this.G0 != null) {
                    if (this.L0 != null || this.N0 != null) {
                        B0(context);
                    }
                    s0(context);
                    this.R.addView(this.P, c8.ma.o(-1, 50));
                    this.A0 = true;
                    N0(true, true);
                    this.r.setVisibility(0);
                    this.n.setEnabled(false);
                    this.n.getContentView().setVisibility(4);
                    org.telegram.messenger.g0.u(context, true);
                    org.telegram.ui.Components.s71 s71Var = new org.telegram.ui.Components.s71(this, context);
                    this.x = s71Var;
                    s71Var.getSettings().setJavaScriptEnabled(true);
                    this.x.getSettings().setDomStorageEnabled(true);
                    this.x.getSettings().setSupportZoom(true);
                    this.x.getSettings().setBuiltInZoomControls(true);
                    this.x.getSettings().setDisplayZoomControls(false);
                    this.x.getSettings().setUseWideViewPort(true);
                    this.x.getSettings().setMixedContentMode(0);
                    CookieManager.getInstance().setAcceptThirdPartyCookies(this.x, true);
                    this.x.addJavascriptInterface(new PaymentFormActivity$TelegramWebviewProxy(this), "TelegramWebviewProxy");
                    this.x.setWebViewClient(new zk0(this, context, 1));
                    this.R.addView(this.x, c8.ma.c(-2.0f, -1));
                    this.L[2] = new org.telegram.ui.Cells.z6(context, (Object) null);
                    this.R.addView(this.L[2], c8.ma.o(-1, -2));
                    org.telegram.ui.Cells.s8 s8Var2 = new org.telegram.ui.Cells.s8(context, this.Z0);
                    this.M = s8Var2;
                    org.telegram.ui.ActionBar.t6.R(s8Var2, org.telegram.ui.ActionBar.m6.N0(true), org.telegram.ui.ActionBar.t6.M(org.telegram.ui.ActionBar.m6.d6), org.telegram.ui.ActionBar.t6.M(org.telegram.ui.ActionBar.m6.i6));
                    this.M.f(org.telegram.messenger.gd.M0(2131747228), this.V0, false);
                    this.R.addView(this.M, c8.ma.o(-1, -2));
                    this.M.setOnClickListener(new jk0(this, 10));
                    this.N[0] = new org.telegram.ui.Cells.a9(context, this.Z0);
                    org.telegram.ui.ActionBar.t6.Z(this.N[0], context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.m6.b7);
                    Q0();
                    this.R.addView(this.N[0], c8.ma.o(-1, -2));
                } else {
                    if (this.D0.native_params != null) {
                        try {
                            JSONObject jSONObject2 = new JSONObject(this.D0.native_params.data);
                            try {
                                this.h0 = jSONObject2.getBoolean("need_country");
                            } catch (Exception unused) {
                                this.h0 = false;
                            }
                            try {
                                this.i0 = jSONObject2.getBoolean("need_zip");
                            } catch (Exception unused2) {
                                this.i0 = false;
                            }
                            try {
                                this.j0 = jSONObject2.getBoolean("need_cardholder_name");
                            } catch (Exception unused3) {
                                this.j0 = false;
                            }
                            if (jSONObject2.has("public_token")) {
                                this.k0 = jSONObject2.getString("public_token");
                            } else {
                                try {
                                    this.k0 = jSONObject2.getString("publishable_key");
                                } catch (Exception unused4) {
                                    this.k0 = "";
                                }
                            }
                            this.l0 = !jSONObject2.optBoolean("google_pay_hidden", false);
                        } catch (Exception e14) {
                            org.telegram.messenger.a8.f(e14);
                        }
                    }
                    if (this.l0 && ((!TextUtils.isEmpty(this.k0) && "stripe".equals(this.D0.native_provider)) || this.N0 != null)) {
                        B0(context);
                    }
                    int i36 = 6;
                    this.f = new EditTextBoldCursor[6];
                    int i37 = 0;
                    while (i37 < i36) {
                        if (i37 == 0) {
                            this.J[0] = new org.telegram.ui.Cells.o4(context, this.Z0);
                            org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.d6, this.J[0], getResourceProvider());
                            this.J[0].setText(org.telegram.messenger.gd.M0(i35));
                            this.R.addView(this.J[0], c8.ma.o(-1, -2));
                        } else if (i37 == 4) {
                            this.J[1] = new org.telegram.ui.Cells.o4(context, this.Z0);
                            org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.d6, this.J[1], getResourceProvider());
                            this.J[1].setText(org.telegram.messenger.gd.M0(2131747234));
                            this.R.addView(this.J[1], c8.ma.o(-1, -2));
                        }
                        boolean z12 = (i37 == i33 || i37 == 5 || (i37 == 4 && !this.i0)) ? false : true;
                        FrameLayout frameLayout3 = new FrameLayout(context);
                        frameLayout3.setClipChildren(false);
                        int i38 = org.telegram.ui.ActionBar.m6.d6;
                        org.telegram.ui.ActionBar.t6.h(i38, frameLayout3, getResourceProvider());
                        this.R.addView(frameLayout3, c8.ma.o(-1, 50));
                        this.f[i37] = new EditTextBoldCursor(context);
                        this.f[i37].setTag(Integer.valueOf(i37));
                        this.f[i37].setTextSize(1, 16.0f);
                        org.telegram.ui.ActionBar.t6.D(this.f[i37], org.telegram.ui.ActionBar.m6.H6, getResourceProvider());
                        EditTextBoldCursor editTextBoldCursor4 = this.f[i37];
                        int i39 = org.telegram.ui.ActionBar.m6.G6;
                        org.telegram.ui.ActionBar.t6.U(editTextBoldCursor4, i39, getResourceProvider());
                        this.f[i37].setBackgroundDrawable(null);
                        org.telegram.ui.ActionBar.t6.v(this.f[i37], i39, getResourceProvider());
                        this.f[i37].setCursorSize(org.telegram.messenger.g0.L(20.0f));
                        this.f[i37].setCursorWidth(1.5f);
                        if (i37 == 3) {
                            this.f[i37].setFilters(new InputFilter[]{new InputFilter.LengthFilter(3)});
                            this.f[i37].setInputType(org.telegram.messenger.ks.O1);
                            this.f[i37].setTypeface(Typeface.DEFAULT);
                            this.f[i37].setTransformationMethod(PasswordTransformationMethod.getInstance());
                        } else if (i37 == 0) {
                            this.f[i37].setInputType(3);
                        } else if (i37 == 4) {
                            final int i40 = 1;
                            this.f[i37].setOnTouchListener(new View.OnTouchListener(this) { // from class: org.telegram.ui.kk0
                                public final /* synthetic */ ml0 b;

                                {
                                    this.b = this;
                                }

                                @Override // android.view.View.OnTouchListener
                                public final boolean onTouch(View view, MotionEvent motionEvent) {
                                    switch (i40) {
                                        case 0:
                                            ml0 ml0Var = this.b;
                                            if (ml0Var.getParentActivity() != null) {
                                                if (motionEvent.getAction() == 1) {
                                                    us usVar = new us(null, false);
                                                    usVar.n = true;
                                                    usVar.r = new pk0(ml0Var, 4);
                                                    ml0Var.presentFragment(usVar);
                                                }
                                                break;
                                            }
                                            break;
                                        default:
                                            ml0 ml0Var2 = this.b;
                                            if (ml0Var2.getParentActivity() != null) {
                                                if (motionEvent.getAction() == 1) {
                                                    us usVar2 = new us(null, false);
                                                    usVar2.n = true;
                                                    usVar2.r = new pk0(ml0Var2, 2);
                                                    ml0Var2.presentFragment(usVar2);
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
                                this.f[i37].setHint(org.telegram.messenger.gd.M0(2131747229));
                            } else if (i37 == 1) {
                                this.f[i37].setHint(org.telegram.messenger.gd.M0(2131747232));
                            } else if (i37 == 2) {
                                this.f[i37].setHint(org.telegram.messenger.gd.M0(2131747230));
                            } else if (i37 == 3) {
                                this.f[i37].setHint(org.telegram.messenger.gd.M0(2131747233));
                            } else if (i37 == 4) {
                                this.f[i37].setHint(org.telegram.messenger.gd.M0(2131747183));
                            } else if (i37 == 5) {
                                this.f[i37].setHint(org.telegram.messenger.gd.M0(2131747173));
                            }
                            if (i37 != 0) {
                                this.f[i37].addTextChangedListener(new gl0(this));
                            } else if (i37 == 1) {
                                this.f[i37].addTextChangedListener(new hl0(this));
                            }
                            int i41 = i35;
                            this.f[i37].setPadding(0, 0, 0, org.telegram.messenger.g0.L(6.0f));
                            this.f[i37].setGravity(!org.telegram.messenger.gd.a0 ? 5 : 3);
                            frameLayout3.addView(this.f[i37], c8.ma.d(-1, -2.0f, 51, 21.0f, 12.0f, 21.0f, 6.0f));
                            final int i42 = 3;
                            this.f[i37].setOnEditorActionListener(new TextView.OnEditorActionListener(this) { // from class: org.telegram.ui.mk0
                                public final /* synthetic */ ml0 b;

                                {
                                    this.b = this;
                                }

                                @Override // android.widget.TextView.OnEditorActionListener
                                public final boolean onEditorAction(TextView textView2, int i282, KeyEvent keyEvent) {
                                    EditTextBoldCursor[] editTextBoldCursorArr;
                                    switch (i42) {
                                        case 0:
                                            ml0 ml0Var = this.b;
                                            if (i282 != 6) {
                                                ml0Var.getClass();
                                                break;
                                            } else {
                                                ml0Var.G0(false);
                                                break;
                                            }
                                        case 1:
                                            ml0 ml0Var2 = this.b;
                                            if (i282 != 6) {
                                                ml0Var2.getClass();
                                                if (i282 == 5) {
                                                    int intValue = ((Integer) textView2.getTag()).intValue();
                                                    if (intValue != 0) {
                                                        if (intValue == 1) {
                                                            ml0Var2.f[2].requestFocus();
                                                            break;
                                                        }
                                                    } else {
                                                        ml0Var2.f[1].requestFocus();
                                                        break;
                                                    }
                                                }
                                            } else {
                                                ml0Var2.n.performClick();
                                                break;
                                            }
                                            break;
                                        case 2:
                                            ml0 ml0Var3 = this.b;
                                            ml0Var3.getClass();
                                            if (i282 != 5) {
                                                if (i282 == 6) {
                                                    ml0Var3.n.performClick();
                                                    break;
                                                }
                                            } else {
                                                int intValue2 = ((Integer) textView2.getTag()).intValue();
                                                while (true) {
                                                    intValue2++;
                                                    EditTextBoldCursor[] editTextBoldCursorArr2 = ml0Var3.f;
                                                    if (intValue2 >= editTextBoldCursorArr2.length) {
                                                        break;
                                                    } else if (intValue2 != 4 && ((View) editTextBoldCursorArr2[intValue2].getParent()).getVisibility() == 0) {
                                                        ml0Var3.f[intValue2].requestFocus();
                                                        break;
                                                    }
                                                }
                                            }
                                            break;
                                        case 3:
                                            ml0 ml0Var4 = this.b;
                                            ml0Var4.getClass();
                                            if (i282 != 5) {
                                                if (i282 == 6) {
                                                    ml0Var4.n.performClick();
                                                    break;
                                                }
                                            } else {
                                                int intValue3 = ((Integer) textView2.getTag()).intValue();
                                                do {
                                                    int i292 = intValue3 + 1;
                                                    editTextBoldCursorArr = ml0Var4.f;
                                                    if (i292 >= editTextBoldCursorArr.length) {
                                                        break;
                                                    } else {
                                                        intValue3 = i292 == 4 ? intValue3 + 2 : i292;
                                                    }
                                                } while (((View) editTextBoldCursorArr[intValue3].getParent()).getVisibility() != 0);
                                                ml0Var4.f[intValue3].requestFocus();
                                                break;
                                            }
                                            break;
                                        default:
                                            ml0 ml0Var5 = this.b;
                                            if (i282 != 6) {
                                                ml0Var5.getClass();
                                                break;
                                            } else {
                                                ml0Var5.n.performClick();
                                                break;
                                            }
                                    }
                                    return false;
                                }
                            });
                            if (i37 != 3) {
                                this.L[0] = new org.telegram.ui.Cells.z6(context, (Object) null);
                                this.R.addView(this.L[0], c8.ma.o(-1, -2));
                            } else if (i37 == 5) {
                                this.L[2] = new org.telegram.ui.Cells.z6(context, (Object) null);
                                this.R.addView(this.L[2], c8.ma.o(-1, -2));
                                org.telegram.ui.Cells.s8 s8Var3 = new org.telegram.ui.Cells.s8(context, this.Z0);
                                this.M = s8Var3;
                                org.telegram.ui.ActionBar.t6.R(s8Var3, org.telegram.ui.ActionBar.m6.N0(true), org.telegram.ui.ActionBar.t6.M(i38), org.telegram.ui.ActionBar.t6.M(org.telegram.ui.ActionBar.m6.i6));
                                this.M.f(org.telegram.messenger.gd.M0(2131747228), this.V0, false);
                                this.R.addView(this.M, c8.ma.o(-1, -2));
                                this.M.setOnClickListener(new jk0(this, 11));
                                this.N[0] = new org.telegram.ui.Cells.a9(context, this.Z0);
                                org.telegram.ui.ActionBar.t6.Z(this.N[0], context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.m6.b7);
                                Q0();
                                this.R.addView(this.N[0], c8.ma.o(-1, -2));
                            } else if (i37 == 0) {
                                s0(context);
                                frameLayout3.addView(this.P, c8.ma.d(-2, -2.0f, (org.telegram.messenger.gd.a0 ? 3 : 5) | 16, 0.0f, 0.0f, 4.0f, 0.0f));
                            }
                            if (z12) {
                                org.telegram.ui.Components.ln lnVar2 = new org.telegram.ui.Components.ln(context, 18);
                                org.telegram.ui.ActionBar.t6.h(i38, lnVar2, getResourceProvider());
                                this.K.add(lnVar2);
                                frameLayout3.addView(lnVar2, new FrameLayout.LayoutParams(-1, 1, 83));
                            }
                            if ((i37 == 4 && !this.h0) || ((i37 == 5 && !this.i0) || (i37 == 2 && !this.j0))) {
                                frameLayout3.setVisibility(8);
                            }
                            i37++;
                            i35 = i41;
                            i36 = 6;
                            i33 = 3;
                        }
                        this.f[i37].setImeOptions(268435461);
                        if (i37 != 0) {
                        }
                        if (i37 != 0) {
                        }
                        int i412 = i35;
                        this.f[i37].setPadding(0, 0, 0, org.telegram.messenger.g0.L(6.0f));
                        this.f[i37].setGravity(!org.telegram.messenger.gd.a0 ? 5 : 3);
                        frameLayout3.addView(this.f[i37], c8.ma.d(-1, -2.0f, 51, 21.0f, 12.0f, 21.0f, 6.0f));
                        final int i422 = 3;
                        this.f[i37].setOnEditorActionListener(new TextView.OnEditorActionListener(this) { // from class: org.telegram.ui.mk0
                            public final /* synthetic */ ml0 b;

                            {
                                this.b = this;
                            }

                            @Override // android.widget.TextView.OnEditorActionListener
                            public final boolean onEditorAction(TextView textView2, int i282, KeyEvent keyEvent) {
                                EditTextBoldCursor[] editTextBoldCursorArr;
                                switch (i422) {
                                    case 0:
                                        ml0 ml0Var = this.b;
                                        if (i282 != 6) {
                                            ml0Var.getClass();
                                            break;
                                        } else {
                                            ml0Var.G0(false);
                                            break;
                                        }
                                    case 1:
                                        ml0 ml0Var2 = this.b;
                                        if (i282 != 6) {
                                            ml0Var2.getClass();
                                            if (i282 == 5) {
                                                int intValue = ((Integer) textView2.getTag()).intValue();
                                                if (intValue != 0) {
                                                    if (intValue == 1) {
                                                        ml0Var2.f[2].requestFocus();
                                                        break;
                                                    }
                                                } else {
                                                    ml0Var2.f[1].requestFocus();
                                                    break;
                                                }
                                            }
                                        } else {
                                            ml0Var2.n.performClick();
                                            break;
                                        }
                                        break;
                                    case 2:
                                        ml0 ml0Var3 = this.b;
                                        ml0Var3.getClass();
                                        if (i282 != 5) {
                                            if (i282 == 6) {
                                                ml0Var3.n.performClick();
                                                break;
                                            }
                                        } else {
                                            int intValue2 = ((Integer) textView2.getTag()).intValue();
                                            while (true) {
                                                intValue2++;
                                                EditTextBoldCursor[] editTextBoldCursorArr2 = ml0Var3.f;
                                                if (intValue2 >= editTextBoldCursorArr2.length) {
                                                    break;
                                                } else if (intValue2 != 4 && ((View) editTextBoldCursorArr2[intValue2].getParent()).getVisibility() == 0) {
                                                    ml0Var3.f[intValue2].requestFocus();
                                                    break;
                                                }
                                            }
                                        }
                                        break;
                                    case 3:
                                        ml0 ml0Var4 = this.b;
                                        ml0Var4.getClass();
                                        if (i282 != 5) {
                                            if (i282 == 6) {
                                                ml0Var4.n.performClick();
                                                break;
                                            }
                                        } else {
                                            int intValue3 = ((Integer) textView2.getTag()).intValue();
                                            do {
                                                int i292 = intValue3 + 1;
                                                editTextBoldCursorArr = ml0Var4.f;
                                                if (i292 >= editTextBoldCursorArr.length) {
                                                    break;
                                                } else {
                                                    intValue3 = i292 == 4 ? intValue3 + 2 : i292;
                                                }
                                            } while (((View) editTextBoldCursorArr[intValue3].getParent()).getVisibility() != 0);
                                            ml0Var4.f[intValue3].requestFocus();
                                            break;
                                        }
                                        break;
                                    default:
                                        ml0 ml0Var5 = this.b;
                                        if (i282 != 6) {
                                            ml0Var5.getClass();
                                            break;
                                        } else {
                                            ml0Var5.n.performClick();
                                            break;
                                        }
                                }
                                return false;
                            }
                        });
                        if (i37 != 3) {
                        }
                        if (z12) {
                        }
                        if (i37 == 4) {
                            frameLayout3.setVisibility(8);
                            i37++;
                            i35 = i412;
                            i36 = 6;
                            i33 = 3;
                        }
                        frameLayout3.setVisibility(8);
                        i37++;
                        i35 = i412;
                        i36 = 6;
                        i33 = 3;
                    }
                    if (!this.h0 && !this.i0) {
                        this.J[1].setVisibility(8);
                        this.L[0].setVisibility(8);
                    }
                    if (this.i0) {
                        this.f[5].setImeOptions(268435462);
                    } else {
                        this.f[3].setImeOptions(268435462);
                    }
                }
            } else if (i19 == 1) {
                ArrayList<TLRPC.TL_shippingOption> arrayList = this.F0.shipping_options;
                int size = arrayList == null ? 0 : arrayList.size();
                this.h = new org.telegram.ui.Cells.j6[size];
                int i43 = 0;
                while (i43 < size) {
                    TLRPC.TL_shippingOption tL_shippingOption = this.F0.shipping_options.get(i43);
                    this.h[i43] = new org.telegram.ui.Cells.j6(context);
                    this.h[i43].setTag(Integer.valueOf(i43));
                    org.telegram.ui.ActionBar.t6.R(this.h[i43], org.telegram.ui.ActionBar.m6.N0(true), org.telegram.ui.ActionBar.t6.M(org.telegram.ui.ActionBar.m6.d6), org.telegram.ui.ActionBar.t6.M(org.telegram.ui.ActionBar.m6.i6));
                    this.h[i43].c(a8.p0.E(y0(tL_shippingOption.prices), " - ", tL_shippingOption.title), i43 == 0, i43 != size + (-1));
                    this.h[i43].setOnClickListener(new jk0(this, 12));
                    this.R.addView(this.h[i43]);
                    i43++;
                }
                this.N[0] = new org.telegram.ui.Cells.a9(context, this.Z0);
                org.telegram.ui.ActionBar.t6.Z(this.N[0], context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.m6.b7);
                this.R.addView(this.N[0], c8.ma.o(-1, -2));
            } else {
                int i44 = org.telegram.messenger.ks.N1;
                if (i19 == 3) {
                    this.f = new EditTextBoldCursor[2];
                    int i45 = 0;
                    for (int i46 = 2; i45 < i46; i46 = 2) {
                        if (i45 == 0) {
                            z10 = false;
                            this.J[0] = new org.telegram.ui.Cells.o4(context, this.Z0);
                            org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.d6, this.J[0], getResourceProvider());
                            this.J[0].setText(org.telegram.messenger.gd.M0(2131747225));
                            this.R.addView(this.J[0], c8.ma.o(-1, -2));
                        } else {
                            z10 = false;
                        }
                        FrameLayout frameLayout4 = new FrameLayout(context);
                        frameLayout4.setClipChildren(z10);
                        this.R.addView(frameLayout4, c8.ma.o(-1, 50));
                        int i47 = org.telegram.ui.ActionBar.m6.d6;
                        org.telegram.ui.ActionBar.t6.h(i47, frameLayout4, getResourceProvider());
                        boolean z13 = i45 != 1;
                        if (z13) {
                            if (i45 != 7 || this.D0.invoice.phone_requested) {
                                if (i45 == 6) {
                                    TLRPC.TL_invoice tL_invoice8 = this.D0.invoice;
                                    if (!tL_invoice8.phone_requested) {
                                    }
                                }
                            }
                            z13 = false;
                        }
                        if (z13) {
                            org.telegram.ui.Components.ln lnVar3 = new org.telegram.ui.Components.ln(context, 15);
                            org.telegram.ui.ActionBar.t6.h(i47, lnVar3, getResourceProvider());
                            this.K.add(lnVar3);
                            frameLayout4.addView(lnVar3, new FrameLayout.LayoutParams(-1, 1, 83));
                        }
                        this.f[i45] = new EditTextBoldCursor(context);
                        this.f[i45].setTag(Integer.valueOf(i45));
                        this.f[i45].setTextSize(1, 16.0f);
                        org.telegram.ui.ActionBar.t6.D(this.f[i45], org.telegram.ui.ActionBar.m6.H6, getResourceProvider());
                        EditTextBoldCursor editTextBoldCursor5 = this.f[i45];
                        int i48 = org.telegram.ui.ActionBar.m6.G6;
                        org.telegram.ui.ActionBar.t6.U(editTextBoldCursor5, i48, getResourceProvider());
                        this.f[i45].setBackgroundDrawable(null);
                        org.telegram.ui.ActionBar.t6.v(this.f[i45], i48, getResourceProvider());
                        this.f[i45].setCursorSize(org.telegram.messenger.g0.L(20.0f));
                        this.f[i45].setCursorWidth(1.5f);
                        if (i45 == 0) {
                            this.f[i45].setOnTouchListener(new ok0(0));
                            this.f[i45].setInputType(0);
                        } else {
                            this.f[i45].setInputType(org.telegram.messenger.ks.N1);
                            this.f[i45].setTypeface(Typeface.DEFAULT);
                        }
                        this.f[i45].setImeOptions(268435462);
                        if (i45 == 0) {
                            EditTextBoldCursor editTextBoldCursor6 = this.f[i45];
                            TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard = this.z0;
                            editTextBoldCursor6.setText(tL_paymentSavedCredentialsCard == null ? "" : tL_paymentSavedCredentialsCard.title);
                        } else if (i45 == 1) {
                            this.f[i45].setHint(org.telegram.messenger.gd.M0(2131748533));
                            this.f[i45].requestFocus();
                        }
                        this.f[i45].setPadding(0, 0, 0, org.telegram.messenger.g0.L(6.0f));
                        this.f[i45].setGravity(org.telegram.messenger.gd.a0 ? 5 : 3);
                        frameLayout4.addView(this.f[i45], c8.ma.d(-1, -2.0f, 51, 21.0f, 12.0f, 21.0f, 6.0f));
                        final int i49 = 4;
                        this.f[i45].setOnEditorActionListener(new TextView.OnEditorActionListener(this) { // from class: org.telegram.ui.mk0
                            public final /* synthetic */ ml0 b;

                            {
                                this.b = this;
                            }

                            @Override // android.widget.TextView.OnEditorActionListener
                            public final boolean onEditorAction(TextView textView2, int i282, KeyEvent keyEvent) {
                                EditTextBoldCursor[] editTextBoldCursorArr;
                                switch (i49) {
                                    case 0:
                                        ml0 ml0Var = this.b;
                                        if (i282 != 6) {
                                            ml0Var.getClass();
                                            break;
                                        } else {
                                            ml0Var.G0(false);
                                            break;
                                        }
                                    case 1:
                                        ml0 ml0Var2 = this.b;
                                        if (i282 != 6) {
                                            ml0Var2.getClass();
                                            if (i282 == 5) {
                                                int intValue = ((Integer) textView2.getTag()).intValue();
                                                if (intValue != 0) {
                                                    if (intValue == 1) {
                                                        ml0Var2.f[2].requestFocus();
                                                        break;
                                                    }
                                                } else {
                                                    ml0Var2.f[1].requestFocus();
                                                    break;
                                                }
                                            }
                                        } else {
                                            ml0Var2.n.performClick();
                                            break;
                                        }
                                        break;
                                    case 2:
                                        ml0 ml0Var3 = this.b;
                                        ml0Var3.getClass();
                                        if (i282 != 5) {
                                            if (i282 == 6) {
                                                ml0Var3.n.performClick();
                                                break;
                                            }
                                        } else {
                                            int intValue2 = ((Integer) textView2.getTag()).intValue();
                                            while (true) {
                                                intValue2++;
                                                EditTextBoldCursor[] editTextBoldCursorArr2 = ml0Var3.f;
                                                if (intValue2 >= editTextBoldCursorArr2.length) {
                                                    break;
                                                } else if (intValue2 != 4 && ((View) editTextBoldCursorArr2[intValue2].getParent()).getVisibility() == 0) {
                                                    ml0Var3.f[intValue2].requestFocus();
                                                    break;
                                                }
                                            }
                                        }
                                        break;
                                    case 3:
                                        ml0 ml0Var4 = this.b;
                                        ml0Var4.getClass();
                                        if (i282 != 5) {
                                            if (i282 == 6) {
                                                ml0Var4.n.performClick();
                                                break;
                                            }
                                        } else {
                                            int intValue3 = ((Integer) textView2.getTag()).intValue();
                                            do {
                                                int i292 = intValue3 + 1;
                                                editTextBoldCursorArr = ml0Var4.f;
                                                if (i292 >= editTextBoldCursorArr.length) {
                                                    break;
                                                } else {
                                                    intValue3 = i292 == 4 ? intValue3 + 2 : i292;
                                                }
                                            } while (((View) editTextBoldCursorArr[intValue3].getParent()).getVisibility() != 0);
                                            ml0Var4.f[intValue3].requestFocus();
                                            break;
                                        }
                                        break;
                                    default:
                                        ml0 ml0Var5 = this.b;
                                        if (i282 != 6) {
                                            ml0Var5.getClass();
                                            break;
                                        } else {
                                            ml0Var5.n.performClick();
                                            break;
                                        }
                                }
                                return false;
                            }
                        });
                        if (i45 == 1) {
                            this.N[0] = new org.telegram.ui.Cells.a9(context, this.Z0);
                            org.telegram.ui.Cells.a9 a9Var2 = this.N[0];
                            TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard2 = this.z0;
                            a9Var2.setText(org.telegram.messenger.gd.Y(2131747212, "PaymentConfirmationMessage", tL_paymentSavedCredentialsCard2 == null ? "" : tL_paymentSavedCredentialsCard2.title));
                            org.telegram.ui.Cells.a9 a9Var3 = this.N[0];
                            int i50 = org.telegram.ui.ActionBar.m6.b7;
                            org.telegram.ui.ActionBar.t6.Z(a9Var3, context, R.drawable.greydivider, i50);
                            this.R.addView(this.N[0], c8.ma.o(-1, -2));
                            this.O[0] = new org.telegram.ui.Cells.x9(context, this.Z0);
                            org.telegram.ui.ActionBar.t6.R(this.O[0], org.telegram.ui.ActionBar.m6.N0(true), org.telegram.ui.ActionBar.t6.M(i47), org.telegram.ui.ActionBar.t6.M(org.telegram.ui.ActionBar.m6.i6));
                            this.O[0].b(org.telegram.messenger.gd.M0(2131747211), false);
                            this.R.addView(this.O[0], c8.ma.o(-1, -2));
                            this.O[0].setOnClickListener(new jk0(this, 14));
                            this.N[1] = new org.telegram.ui.Cells.a9(context, this.Z0);
                            org.telegram.ui.ActionBar.t6.Z(this.N[1], context, R.drawable.greydivider_bottom, i50);
                            this.R.addView(this.N[1], c8.ma.o(-1, -2));
                        }
                        i45++;
                    }
                } else if (i19 == 4 || i19 == 5) {
                    org.telegram.ui.Cells.l5 l5Var = new org.telegram.ui.Cells.l5(context);
                    this.Y = l5Var;
                    org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.d6, l5Var, getResourceProvider());
                    org.telegram.messenger.fj fjVar = this.O0;
                    if (fjVar != null) {
                        this.Y.b((TLRPC.TL_messageMediaInvoice) fjVar.k.media, this.q0);
                    } else {
                        TLRPC.PaymentReceipt paymentReceipt = this.E0;
                        if (paymentReceipt != null) {
                            this.Y.c(paymentReceipt, this.q0);
                        } else if (this.P0 != null || this.c1 != null) {
                            org.telegram.ui.Cells.l5 l5Var2 = this.Y;
                            TLRPC.PaymentForm paymentForm4 = this.D0;
                            l5Var2.a(paymentForm4.title, paymentForm4.description, paymentForm4.photo, this.q0, paymentForm4);
                        }
                    }
                    this.R.addView(this.Y, c8.ma.o(-1, -2));
                    this.L[0] = new org.telegram.ui.Cells.z6(context, (Object) null);
                    this.R.addView(this.L[0], c8.ma.o(-1, -2));
                    ArrayList arrayList2 = new ArrayList(this.D0.invoice.prices);
                    this.u0 = arrayList2;
                    TLRPC.TL_shippingOption tL_shippingOption2 = this.H0;
                    if (tL_shippingOption2 != null) {
                        arrayList2.addAll(tL_shippingOption2.prices);
                    }
                    this.S0 = new String[1];
                    for (int i51 = 0; i51 < this.u0.size(); i51++) {
                        TLRPC.TL_labeledPrice tL_labeledPrice = (TLRPC.TL_labeledPrice) this.u0.get(i51);
                        org.telegram.ui.Cells.b9 b9Var = new org.telegram.ui.Cells.b9(context);
                        org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.d6, b9Var, getResourceProvider());
                        b9Var.a(tL_labeledPrice.label, org.telegram.messenger.gd.E0().p(tL_labeledPrice.amount, this.D0.invoice.currency), false);
                        this.R.addView(b9Var);
                    }
                    if (this.v0 == 5 && this.I0 != null) {
                        org.telegram.ui.Cells.b9 b9Var2 = new org.telegram.ui.Cells.b9(context);
                        org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.d6, b9Var2, getResourceProvider());
                        b9Var2.a(org.telegram.messenger.gd.M0(2131747163), org.telegram.messenger.gd.E0().p(this.I0.longValue(), this.D0.invoice.currency), false);
                        this.R.addView(b9Var2);
                    }
                    org.telegram.ui.Cells.b9 b9Var3 = new org.telegram.ui.Cells.b9(context);
                    this.S = b9Var3;
                    int i52 = org.telegram.ui.ActionBar.m6.d6;
                    org.telegram.ui.ActionBar.t6.h(i52, b9Var3, getResourceProvider());
                    this.S0[0] = y0(this.u0);
                    this.S.a(org.telegram.messenger.gd.M0(2131747159), this.S0[0], true);
                    if (this.v0 == 4 && (this.D0.invoice.flags & 256) != 0) {
                        FrameLayout frameLayout5 = new FrameLayout(context);
                        frameLayout5.setClipChildren(false);
                        org.telegram.ui.ActionBar.t6.h(i52, frameLayout5, getResourceProvider());
                        this.R.addView(frameLayout5, c8.ma.o(-1, this.D0.invoice.suggested_tip_amounts.isEmpty() ? 40 : 78));
                        frameLayout5.setOnClickListener(new jk0(this, 0));
                        org.telegram.ui.Cells.b9 b9Var4 = new org.telegram.ui.Cells.b9(context);
                        org.telegram.ui.ActionBar.t6.h(i52, b9Var4, getResourceProvider());
                        b9Var4.a(org.telegram.messenger.gd.M0(2131747162), "", false);
                        frameLayout5.addView(b9Var4);
                        this.f = new EditTextBoldCursor[]{new EditTextBoldCursor(context)};
                        this.f[0].setTag(0);
                        this.f[0].setTextSize(1, 16.0f);
                        EditTextBoldCursor editTextBoldCursor7 = this.f[0];
                        int i53 = org.telegram.ui.ActionBar.m6.z6;
                        org.telegram.ui.ActionBar.t6.D(editTextBoldCursor7, i53, getResourceProvider());
                        org.telegram.ui.ActionBar.t6.U(this.f[0], i53, getResourceProvider());
                        this.f[0].setBackgroundDrawable(null);
                        org.telegram.ui.ActionBar.t6.v(this.f[0], org.telegram.ui.ActionBar.m6.G6, getResourceProvider());
                        this.f[0].setCursorSize(org.telegram.messenger.g0.L(20.0f));
                        this.f[0].setCursorWidth(1.5f);
                        this.f[0].setInputType(3);
                        this.f[0].setImeOptions(268435462);
                        this.f[0].setHint(org.telegram.messenger.gd.E0().p(0L, this.D0.invoice.currency));
                        this.f[0].setPadding(0, 0, 0, org.telegram.messenger.g0.L(6.0f));
                        this.f[0].setGravity(org.telegram.messenger.gd.a0 ? 3 : 5);
                        frameLayout5.addView(this.f[0], c8.ma.d(-1, -2.0f, 51, 21.0f, 9.0f, 21.0f, 1.0f));
                        this.f[0].addTextChangedListener(new rk0(this));
                        this.f[0].setOnEditorActionListener(new org.telegram.ui.Components.t2(3));
                        this.f[0].requestFocus();
                        if (!this.D0.invoice.suggested_tip_amounts.isEmpty()) {
                            HorizontalScrollView horizontalScrollView = new HorizontalScrollView(context);
                            horizontalScrollView.setHorizontalScrollBarEnabled(false);
                            horizontalScrollView.setVerticalScrollBarEnabled(false);
                            horizontalScrollView.setClipToPadding(false);
                            horizontalScrollView.setPadding(org.telegram.messenger.g0.L(21.0f), 0, org.telegram.messenger.g0.L(21.0f), 0);
                            horizontalScrollView.setFillViewport(true);
                            frameLayout5.addView(horizontalScrollView, c8.ma.d(-1, 30.0f, 51, 0.0f, 44.0f, 0.0f, 0.0f));
                            int[] iArr = new int[1];
                            int[] iArr2 = new int[1];
                            int size2 = this.D0.invoice.suggested_tip_amounts.size();
                            sk0 sk0Var = new sk0(context, size2, iArr, iArr2);
                            this.t0 = sk0Var;
                            sk0Var.setOrientation(0);
                            horizontalScrollView.addView(this.t0, c8.ma.x(-1, 30, 51));
                            int themedColor = getThemedColor(org.telegram.ui.ActionBar.m6.Vi);
                            int i54 = 0;
                            while (i54 < size2) {
                                long longValue = org.telegram.messenger.gd.a0 ? this.D0.invoice.suggested_tip_amounts.get((size2 - i54) - 1).longValue() : this.D0.invoice.suggested_tip_amounts.get(i54).longValue();
                                String p10 = org.telegram.messenger.gd.E0().p(longValue, this.D0.invoice.currency);
                                TextView textView2 = new TextView(context);
                                textView2.setTextSize(1, 14.0f);
                                textView2.setTypeface(org.telegram.messenger.g0.o());
                                textView2.setLines(1);
                                textView2.setTag(Long.valueOf(longValue));
                                textView2.setMaxLines(1);
                                textView2.setText(p10);
                                textView2.setPadding(org.telegram.messenger.g0.L(15.0f), 0, org.telegram.messenger.g0.L(15.0f), 0);
                                org.telegram.ui.ActionBar.t6.U(textView2, org.telegram.ui.ActionBar.m6.Z8, getResourceProvider());
                                textView2.setBackground(org.telegram.ui.ActionBar.m6.d0(org.telegram.messenger.g0.L(15.0f), 536870911 & themedColor));
                                textView2.setSingleLine(true);
                                textView2.setGravity(17);
                                this.t0.addView(textView2, c8.ma.t(-2, -1, 19, 0, 0, i54 != size2 + (-1) ? 9 : 0, 0));
                                textView2.setOnClickListener(new di.d3(this, textView2, longValue, 6));
                                int L = org.telegram.messenger.g0.L(30.0f) + ((int) Math.ceil(textView2.getPaint().measureText(p10)));
                                textView2.setTag(R.id.width_tag, Integer.valueOf(L));
                                iArr[0] = Math.max(iArr[0], L);
                                iArr2[0] = iArr2[0] + L;
                                i54++;
                                str5 = null;
                            }
                        }
                    }
                    ?? r13 = str5;
                    this.R.addView(this.S);
                    this.L[2] = new org.telegram.ui.Cells.z6(context, (Object) r13);
                    org.telegram.ui.ActionBar.t6.Z(this.L[2], context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.m6.b7);
                    this.R.addView(this.L[2], c8.ma.o(-1, -2));
                    this.Z[0] = new tk0(context);
                    org.telegram.ui.ActionBar.t6.R(this.Z[0], org.telegram.ui.ActionBar.m6.N0(true), org.telegram.ui.ActionBar.t6.M(org.telegram.ui.ActionBar.m6.d6), org.telegram.ui.ActionBar.t6.M(org.telegram.ui.ActionBar.m6.i6));
                    org.telegram.ui.Cells.z8 z8Var = this.Z[0];
                    String str8 = this.y0;
                    z8Var.b(R.drawable.msg_payment_card, (str8 == null || str8.length() <= 1) ? this.y0 : this.y0.substring(0, 1).toUpperCase() + this.y0.substring(1), org.telegram.messenger.gd.M0(2131747220), true);
                    if (this.W0 || this.X0) {
                        String str9 = this.y0;
                        i7 = (str9 == null || str9.length() <= 1) ? 8 : 0;
                    } else {
                        i7 = 0;
                    }
                    this.Z[0].setVisibility(i7);
                    this.R.addView(this.Z[0]);
                    if (this.v0 == 4) {
                        this.Z[0].setOnClickListener(new jk0(this, 1));
                    }
                    TLRPC.User user3 = r13;
                    for (int i55 = 0; i55 < this.D0.users.size(); i55++) {
                        TLRPC.User user4 = this.D0.users.get(i55);
                        if (user4.id == this.D0.provider_id) {
                            user3 = user4;
                        }
                    }
                    char c11 = 1;
                    this.Z[1] = new org.telegram.ui.Cells.z8(context);
                    org.telegram.ui.Cells.z8 z8Var2 = this.Z[1];
                    org.telegram.ui.Cells.y N0 = org.telegram.ui.ActionBar.m6.N0(true);
                    int i56 = org.telegram.ui.ActionBar.m6.d6;
                    org.telegram.ui.ActionBar.p6 M = org.telegram.ui.ActionBar.t6.M(i56);
                    int i57 = org.telegram.ui.ActionBar.m6.i6;
                    org.telegram.ui.ActionBar.t6.R(z8Var2, N0, M, org.telegram.ui.ActionBar.t6.M(i57));
                    if (user3 != null) {
                        org.telegram.ui.Cells.z8 z8Var3 = this.Z[1];
                        str4 = org.telegram.messenger.i5.n(user3.first_name, user3.last_name);
                        String M0 = org.telegram.messenger.gd.M0(2131747215);
                        TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo = this.J0;
                        z8Var3.b(R.drawable.msg_payment_provider, str4, M0, ((tL_payments_validateRequestedInfo == null || (tL_payments_validateRequestedInfo.info.shipping_address == null && this.H0 == null)) && ((tL_paymentRequestedInfo = this.D0.saved_info) == null || tL_paymentRequestedInfo.shipping_address == null)) ? false : true);
                        c11 = 1;
                        this.R.addView(this.Z[1]);
                    }
                    this.Z[c11].setVisibility(user3 != null ? i7 : 8);
                    TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo2 = this.J0;
                    if (tL_payments_validateRequestedInfo2 != null || (this.W0 && (paymentForm2 = this.D0) != null && paymentForm2.saved_info != null)) {
                        TLRPC.TL_paymentRequestedInfo tL_paymentRequestedInfo12 = tL_payments_validateRequestedInfo2 != null ? tL_payments_validateRequestedInfo2.info : this.D0.saved_info;
                        int i58 = 2;
                        this.Z[2] = new org.telegram.ui.Cells.z8(context);
                        this.Z[2].setVisibility(8);
                        this.R.addView(this.Z[2]);
                        if (tL_paymentRequestedInfo12.shipping_address != null) {
                            this.Z[2].setVisibility(0);
                            if (this.v0 == 4) {
                                org.telegram.ui.ActionBar.t6.R(this.Z[2], org.telegram.ui.ActionBar.m6.N0(true), org.telegram.ui.ActionBar.t6.M(i56), org.telegram.ui.ActionBar.t6.M(i57));
                                this.Z[2].setOnClickListener(new jk0(this, i58));
                            } else {
                                org.telegram.ui.ActionBar.t6.h(i56, this.Z[2], getResourceProvider());
                            }
                        }
                        int i59 = 3;
                        this.Z[3] = new org.telegram.ui.Cells.z8(context);
                        this.Z[3].setVisibility(8);
                        this.R.addView(this.Z[3]);
                        if (tL_paymentRequestedInfo12.name != null) {
                            this.Z[3].setVisibility(0);
                            if (this.v0 == 4) {
                                org.telegram.ui.ActionBar.t6.R(this.Z[3], org.telegram.ui.ActionBar.m6.N0(true), org.telegram.ui.ActionBar.t6.M(i56), org.telegram.ui.ActionBar.t6.M(i57));
                                this.Z[3].setOnClickListener(new jk0(this, i59));
                            } else {
                                org.telegram.ui.ActionBar.t6.h(i56, this.Z[3], getResourceProvider());
                            }
                        }
                        int i60 = 4;
                        this.Z[4] = new org.telegram.ui.Cells.z8(context);
                        this.Z[4].setVisibility(8);
                        this.R.addView(this.Z[4]);
                        if (tL_paymentRequestedInfo12.phone != null) {
                            this.Z[4].setVisibility(0);
                            if (this.v0 == 4) {
                                org.telegram.ui.ActionBar.t6.R(this.Z[4], org.telegram.ui.ActionBar.m6.N0(true), org.telegram.ui.ActionBar.t6.M(i56), org.telegram.ui.ActionBar.t6.M(i57));
                                this.Z[4].setOnClickListener(new jk0(this, i60));
                            } else {
                                org.telegram.ui.ActionBar.t6.h(i56, this.Z[4], getResourceProvider());
                            }
                        }
                        int i61 = 5;
                        this.Z[5] = new org.telegram.ui.Cells.z8(context);
                        this.Z[5].setVisibility(8);
                        this.R.addView(this.Z[5]);
                        if (tL_paymentRequestedInfo12.email != null) {
                            this.Z[5].setVisibility(0);
                            if (this.v0 == 4) {
                                org.telegram.ui.ActionBar.t6.R(this.Z[5], org.telegram.ui.ActionBar.m6.N0(true), org.telegram.ui.ActionBar.t6.M(i56), org.telegram.ui.ActionBar.t6.M(i57));
                                this.Z[5].setOnClickListener(new jk0(this, i61));
                            } else {
                                org.telegram.ui.ActionBar.t6.h(i56, this.Z[5], getResourceProvider());
                            }
                        }
                        if (this.H0 != null) {
                            this.Z[6] = new org.telegram.ui.Cells.z8(context);
                            org.telegram.ui.ActionBar.t6.h(i56, this.Z[6], getResourceProvider());
                            this.Z[6].b(R.drawable.msg_payment_delivery, this.H0.title, org.telegram.messenger.gd.M0(2131747214), false);
                            this.R.addView(this.Z[6]);
                        }
                        H0(tL_paymentRequestedInfo12);
                    }
                    if (this.v0 == 4) {
                        this.G = !this.W0;
                        if (this.c1 instanceof TLRPC.TL_inputInvoiceStars) {
                            this.G = true;
                        }
                        this.X = new il0(this, context);
                        View view = new View(context);
                        org.telegram.ui.ActionBar.t6.Q(view, org.telegram.ui.ActionBar.m6.h0(getThemedColor(i57), 2, -1), r13, org.telegram.ui.ActionBar.t6.M(i57), this.Z0);
                        this.X.addView(view, c8.ma.c(-1.0f, -1));
                        frameLayout2.addView(this.X, c8.ma.e(-1, 48, 80));
                        this.X.setOnClickListener(new jg0(2, this, str4));
                        TextView textView3 = new TextView(context);
                        this.V = textView3;
                        int i62 = org.telegram.ui.ActionBar.m6.Wi;
                        org.telegram.ui.ActionBar.t6.U(textView3, i62, getResourceProvider());
                        this.V.setText(org.telegram.messenger.gd.Z(2131747217, this.S0[0]));
                        this.V.setTextSize(1, 14.0f);
                        this.V.setGravity(17);
                        this.V.setTypeface(org.telegram.messenger.g0.o());
                        this.X.addView(this.V, c8.ma.c(-1.0f, -1));
                        org.telegram.ui.Components.qq qqVar2 = new org.telegram.ui.Components.qq(context, 0);
                        this.s = qqVar2;
                        qqVar2.setVisibility(4);
                        int themedColor2 = getThemedColor(i62);
                        this.s.a(805306367 & themedColor2, themedColor2);
                        this.X.addView(this.s, c8.ma.c(-1.0f, -1));
                        this.X.a(this.G, false);
                        this.V.setAlpha(!this.G ? 0.8f : 1.0f);
                        this.n.setEnabled(false);
                        this.n.getContentView().setVisibility(4);
                        org.telegram.messenger.g0.u(context, true);
                        try {
                            yk0 yk0Var = new yk0(context);
                            this.x = yk0Var;
                            yk0Var.setBackgroundColor(-1);
                            this.x.getSettings().setJavaScriptEnabled(true);
                            this.x.getSettings().setDomStorageEnabled(true);
                            this.x.getSettings().setSupportZoom(true);
                            this.x.getSettings().setBuiltInZoomControls(true);
                            this.x.getSettings().setDisplayZoomControls(false);
                            this.x.getSettings().setUseWideViewPort(true);
                            this.x.getSettings().setMixedContentMode(0);
                            CookieManager.getInstance().setAcceptThirdPartyCookies(this.x, true);
                            this.x.setWebViewClient(new zk0(this, context, 0));
                        } catch (Exception e15) {
                            org.telegram.messenger.a8.f(e15);
                        }
                        this.W = r13;
                        if (this.D0.invoice.terms_url != null) {
                            org.telegram.ui.Cells.o6 o6Var = new org.telegram.ui.Cells.o6(context, getResourceProvider());
                            this.W = o6Var;
                            o6Var.setChecked(this.G);
                            if (TextUtils.isEmpty(this.q0)) {
                                String M02 = org.telegram.messenger.gd.M0(2131747222);
                                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(M02);
                                int indexOf = M02.indexOf(42);
                                int lastIndexOf = M02.lastIndexOf(42);
                                spannableStringBuilder = spannableStringBuilder2;
                                spannableStringBuilder = spannableStringBuilder2;
                                if (indexOf != -1 && lastIndexOf != -1) {
                                    SpannableString spannableString = new SpannableString(M02.substring(indexOf + 1, lastIndexOf));
                                    spannableString.setSpan(new org.telegram.ui.Components.s41(this.D0.invoice.terms_url), 0, spannableString.length(), 33);
                                    int i63 = lastIndexOf + 1;
                                    spannableStringBuilder2.replace(indexOf, i63, (CharSequence) spannableString);
                                    M02.substring(0, indexOf);
                                    spannableString.toString();
                                    M02.substring(i63);
                                    spannableStringBuilder = spannableStringBuilder2;
                                }
                            } else {
                                String M03 = org.telegram.messenger.gd.M0(2131747223);
                                SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(M03);
                                int indexOf2 = M03.indexOf(42);
                                int lastIndexOf2 = M03.lastIndexOf(42);
                                if (indexOf2 != -1 && lastIndexOf2 != -1) {
                                    SpannableString spannableString2 = new SpannableString(M03.substring(indexOf2 + 1, lastIndexOf2));
                                    spannableString2.setSpan(new org.telegram.ui.Components.s41(this.D0.invoice.terms_url), 0, spannableString2.length(), 33);
                                    int i64 = lastIndexOf2 + 1;
                                    spannableStringBuilder3.replace(indexOf2, i64, (CharSequence) spannableString2);
                                    M03 = M03.substring(0, indexOf2) + ((Object) spannableString2) + M03.substring(i64);
                                }
                                int indexOf3 = M03.indexOf("%1$s");
                                spannableStringBuilder = spannableStringBuilder3;
                                if (indexOf3 != -1) {
                                    spannableStringBuilder3.replace(indexOf3, indexOf3 + 4, (CharSequence) this.q0);
                                    spannableStringBuilder3.setSpan(new org.telegram.ui.Components.l41(org.telegram.messenger.g0.o()), indexOf3, this.q0.length() + indexOf3, 33);
                                    spannableStringBuilder = spannableStringBuilder3;
                                }
                            }
                            this.W.setText(spannableStringBuilder);
                            org.telegram.ui.Cells.o6 o6Var2 = this.W;
                            int i65 = org.telegram.ui.ActionBar.m6.d6;
                            int themedColor3 = getThemedColor(i65);
                            int i66 = org.telegram.ui.ActionBar.m6.i6;
                            org.telegram.ui.ActionBar.t6.Q(o6Var2, org.telegram.ui.ActionBar.m6.i0(themedColor3, getThemedColor(i66)), org.telegram.ui.ActionBar.t6.M(i65), org.telegram.ui.ActionBar.t6.M(i66), getResourceProvider());
                            this.W.setOnClickListener(new jk0(this, 6));
                            frameLayout2.addView(this.W, c8.ma.d(-1, -2.0f, 80, 0.0f, 0.0f, 0.0f, 48.0f));
                        }
                        WebView webView = this.x;
                        if (webView != null) {
                            frameLayout2.addView(webView, c8.ma.c(-1.0f, -1));
                            this.x.setVisibility(8);
                        }
                    }
                    this.L[1] = new org.telegram.ui.Cells.z6(context, (Object) r13);
                    org.telegram.ui.ActionBar.t6.Z(this.L[1], context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.m6.b7);
                    if (i7 != 0 && this.v0 == 4 && this.J0 == null && ((paymentForm = this.D0) == null || paymentForm.saved_info == null)) {
                        c10 = 1;
                        this.L[1].setVisibility(i7);
                    } else {
                        c10 = 1;
                    }
                    this.R.addView(this.L[c10], c8.ma.o(-1, -2));
                } else if (i19 == 6) {
                    org.telegram.ui.Cells.m3 m3Var = new org.telegram.ui.Cells.m3(context);
                    this.T = m3Var;
                    m3Var.a(org.telegram.messenger.gd.M0(2131747253));
                    org.telegram.ui.Cells.m3 m3Var2 = this.T;
                    int i67 = org.telegram.ui.ActionBar.m6.d6;
                    org.telegram.ui.ActionBar.t6.h(i67, m3Var2, getResourceProvider());
                    EditTextBoldCursor textView4 = this.T.getTextView();
                    textView4.setInputType(3);
                    textView4.setImeOptions(6);
                    final int i68 = 0;
                    textView4.setOnEditorActionListener(new TextView.OnEditorActionListener(this) { // from class: org.telegram.ui.mk0
                        public final /* synthetic */ ml0 b;

                        {
                            this.b = this;
                        }

                        @Override // android.widget.TextView.OnEditorActionListener
                        public final boolean onEditorAction(TextView textView22, int i282, KeyEvent keyEvent) {
                            EditTextBoldCursor[] editTextBoldCursorArr;
                            switch (i68) {
                                case 0:
                                    ml0 ml0Var = this.b;
                                    if (i282 != 6) {
                                        ml0Var.getClass();
                                        break;
                                    } else {
                                        ml0Var.G0(false);
                                        break;
                                    }
                                case 1:
                                    ml0 ml0Var2 = this.b;
                                    if (i282 != 6) {
                                        ml0Var2.getClass();
                                        if (i282 == 5) {
                                            int intValue = ((Integer) textView22.getTag()).intValue();
                                            if (intValue != 0) {
                                                if (intValue == 1) {
                                                    ml0Var2.f[2].requestFocus();
                                                    break;
                                                }
                                            } else {
                                                ml0Var2.f[1].requestFocus();
                                                break;
                                            }
                                        }
                                    } else {
                                        ml0Var2.n.performClick();
                                        break;
                                    }
                                    break;
                                case 2:
                                    ml0 ml0Var3 = this.b;
                                    ml0Var3.getClass();
                                    if (i282 != 5) {
                                        if (i282 == 6) {
                                            ml0Var3.n.performClick();
                                            break;
                                        }
                                    } else {
                                        int intValue2 = ((Integer) textView22.getTag()).intValue();
                                        while (true) {
                                            intValue2++;
                                            EditTextBoldCursor[] editTextBoldCursorArr2 = ml0Var3.f;
                                            if (intValue2 >= editTextBoldCursorArr2.length) {
                                                break;
                                            } else if (intValue2 != 4 && ((View) editTextBoldCursorArr2[intValue2].getParent()).getVisibility() == 0) {
                                                ml0Var3.f[intValue2].requestFocus();
                                                break;
                                            }
                                        }
                                    }
                                    break;
                                case 3:
                                    ml0 ml0Var4 = this.b;
                                    ml0Var4.getClass();
                                    if (i282 != 5) {
                                        if (i282 == 6) {
                                            ml0Var4.n.performClick();
                                            break;
                                        }
                                    } else {
                                        int intValue3 = ((Integer) textView22.getTag()).intValue();
                                        do {
                                            int i292 = intValue3 + 1;
                                            editTextBoldCursorArr = ml0Var4.f;
                                            if (i292 >= editTextBoldCursorArr.length) {
                                                break;
                                            } else {
                                                intValue3 = i292 == 4 ? intValue3 + 2 : i292;
                                            }
                                        } while (((View) editTextBoldCursorArr[intValue3].getParent()).getVisibility() != 0);
                                        ml0Var4.f[intValue3].requestFocus();
                                        break;
                                    }
                                    break;
                                default:
                                    ml0 ml0Var5 = this.b;
                                    if (i282 != 6) {
                                        ml0Var5.getClass();
                                        break;
                                    } else {
                                        ml0Var5.n.performClick();
                                        break;
                                    }
                            }
                            return false;
                        }
                    });
                    textView4.addTextChangedListener(new bl0(this, i68));
                    this.R.addView(this.T, c8.ma.o(-1, -2));
                    this.N[2] = new org.telegram.ui.Cells.a9(context, this.Z0);
                    org.telegram.ui.ActionBar.t6.Z(this.N[2], context, R.drawable.greydivider, org.telegram.ui.ActionBar.m6.b7);
                    this.R.addView(this.N[2], c8.ma.o(-1, -2));
                    this.O[1] = new org.telegram.ui.Cells.x9(context, this.Z0);
                    org.telegram.ui.Cells.x9 x9Var = this.O[1];
                    org.telegram.ui.Cells.y N02 = org.telegram.ui.ActionBar.m6.N0(true);
                    org.telegram.ui.ActionBar.p6 M2 = org.telegram.ui.ActionBar.t6.M(i67);
                    int i69 = org.telegram.ui.ActionBar.m6.i6;
                    org.telegram.ui.ActionBar.t6.R(x9Var, N02, M2, org.telegram.ui.ActionBar.t6.M(i69));
                    org.telegram.ui.Cells.x9 x9Var2 = this.O[1];
                    int i70 = org.telegram.ui.ActionBar.m6.G6;
                    x9Var2.setTag(Integer.valueOf(i70));
                    org.telegram.ui.ActionBar.t6.U(this.O[1].getTextView(), i70, getResourceProvider());
                    this.O[1].b(org.telegram.messenger.gd.M0(2131745925), true);
                    this.R.addView(this.O[1], c8.ma.o(-1, -2));
                    this.O[1].setOnClickListener(new jk0(this, 7));
                    this.O[0] = new org.telegram.ui.Cells.x9(context, this.Z0);
                    org.telegram.ui.ActionBar.t6.R(this.O[0], org.telegram.ui.ActionBar.m6.N0(true), org.telegram.ui.ActionBar.t6.M(i67), org.telegram.ui.ActionBar.t6.M(i69));
                    org.telegram.ui.Cells.x9 x9Var3 = this.O[0];
                    int i71 = org.telegram.ui.ActionBar.m6.p7;
                    x9Var3.setTag(Integer.valueOf(i71));
                    org.telegram.ui.ActionBar.t6.U(this.O[0].getTextView(), i71, getResourceProvider());
                    this.O[0].b(org.telegram.messenger.gd.M0(2131754948), false);
                    this.R.addView(this.O[0], c8.ma.o(-1, -2));
                    this.O[0].setOnClickListener(new jk0(this, 8));
                    this.f = new EditTextBoldCursor[3];
                    int i72 = 0;
                    for (int i73 = 3; i72 < i73; i73 = 3) {
                        if (i72 == 0) {
                            this.J[0] = new org.telegram.ui.Cells.o4(context, this.Z0);
                            org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.d6, this.J[0], getResourceProvider());
                            this.J[0].setText(org.telegram.messenger.gd.M0(2131747192));
                            this.R.addView(this.J[0], c8.ma.o(-1, -2));
                        } else if (i72 == 2) {
                            this.J[1] = new org.telegram.ui.Cells.o4(context, this.Z0);
                            org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.d6, this.J[1], getResourceProvider());
                            this.J[1].setText(org.telegram.messenger.gd.M0(2131747196));
                            this.R.addView(this.J[1], c8.ma.o(-1, -2));
                        }
                        FrameLayout frameLayout6 = new FrameLayout(context);
                        frameLayout6.setClipChildren(false);
                        this.R.addView(frameLayout6, c8.ma.o(-1, 50));
                        int i74 = org.telegram.ui.ActionBar.m6.d6;
                        org.telegram.ui.ActionBar.t6.h(i74, frameLayout6, getResourceProvider());
                        if (i72 == 0) {
                            org.telegram.ui.Components.ln lnVar4 = new org.telegram.ui.Components.ln(context, i34);
                            org.telegram.ui.ActionBar.t6.h(i74, lnVar4, getResourceProvider());
                            this.K.add(lnVar4);
                            frameLayout6.addView(lnVar4, new FrameLayout.LayoutParams(-1, 1, 83));
                        }
                        this.f[i72] = new EditTextBoldCursor(context);
                        this.f[i72].setTag(Integer.valueOf(i72));
                        this.f[i72].setTextSize(1, 16.0f);
                        org.telegram.ui.ActionBar.t6.D(this.f[i72], org.telegram.ui.ActionBar.m6.H6, getResourceProvider());
                        EditTextBoldCursor editTextBoldCursor8 = this.f[i72];
                        int i75 = org.telegram.ui.ActionBar.m6.G6;
                        org.telegram.ui.ActionBar.t6.U(editTextBoldCursor8, i75, getResourceProvider());
                        this.f[i72].setBackgroundDrawable(null);
                        org.telegram.ui.ActionBar.t6.v(this.f[i72], i75, getResourceProvider());
                        this.f[i72].setCursorSize(org.telegram.messenger.g0.L(20.0f));
                        this.f[i72].setCursorWidth(1.5f);
                        if (i72 == 0 || i72 == 1) {
                            this.f[i72].setInputType(i44);
                            this.f[i72].setTypeface(Typeface.DEFAULT);
                            this.f[i72].setImeOptions(268435461);
                        } else {
                            this.f[i72].setInputType(33);
                            this.f[i72].setImeOptions(268435462);
                        }
                        if (i72 == 0) {
                            this.f[i72].setHint(org.telegram.messenger.gd.M0(2131747195));
                            this.f[i72].requestFocus();
                        } else if (i72 == 1) {
                            this.f[i72].setHint(org.telegram.messenger.gd.M0(2131747193));
                        } else if (i72 == 2) {
                            this.f[i72].setHint(org.telegram.messenger.gd.M0(2131747198));
                        }
                        this.f[i72].setPadding(0, 0, 0, org.telegram.messenger.g0.L(6.0f));
                        this.f[i72].setGravity(org.telegram.messenger.gd.a0 ? 5 : 3);
                        frameLayout6.addView(this.f[i72], c8.ma.d(-1, -2.0f, 51, 21.0f, 12.0f, 21.0f, 6.0f));
                        final int i76 = 1;
                        this.f[i72].setOnEditorActionListener(new TextView.OnEditorActionListener(this) { // from class: org.telegram.ui.mk0
                            public final /* synthetic */ ml0 b;

                            {
                                this.b = this;
                            }

                            @Override // android.widget.TextView.OnEditorActionListener
                            public final boolean onEditorAction(TextView textView22, int i282, KeyEvent keyEvent) {
                                EditTextBoldCursor[] editTextBoldCursorArr;
                                switch (i76) {
                                    case 0:
                                        ml0 ml0Var = this.b;
                                        if (i282 != 6) {
                                            ml0Var.getClass();
                                            break;
                                        } else {
                                            ml0Var.G0(false);
                                            break;
                                        }
                                    case 1:
                                        ml0 ml0Var2 = this.b;
                                        if (i282 != 6) {
                                            ml0Var2.getClass();
                                            if (i282 == 5) {
                                                int intValue = ((Integer) textView22.getTag()).intValue();
                                                if (intValue != 0) {
                                                    if (intValue == 1) {
                                                        ml0Var2.f[2].requestFocus();
                                                        break;
                                                    }
                                                } else {
                                                    ml0Var2.f[1].requestFocus();
                                                    break;
                                                }
                                            }
                                        } else {
                                            ml0Var2.n.performClick();
                                            break;
                                        }
                                        break;
                                    case 2:
                                        ml0 ml0Var3 = this.b;
                                        ml0Var3.getClass();
                                        if (i282 != 5) {
                                            if (i282 == 6) {
                                                ml0Var3.n.performClick();
                                                break;
                                            }
                                        } else {
                                            int intValue2 = ((Integer) textView22.getTag()).intValue();
                                            while (true) {
                                                intValue2++;
                                                EditTextBoldCursor[] editTextBoldCursorArr2 = ml0Var3.f;
                                                if (intValue2 >= editTextBoldCursorArr2.length) {
                                                    break;
                                                } else if (intValue2 != 4 && ((View) editTextBoldCursorArr2[intValue2].getParent()).getVisibility() == 0) {
                                                    ml0Var3.f[intValue2].requestFocus();
                                                    break;
                                                }
                                            }
                                        }
                                        break;
                                    case 3:
                                        ml0 ml0Var4 = this.b;
                                        ml0Var4.getClass();
                                        if (i282 != 5) {
                                            if (i282 == 6) {
                                                ml0Var4.n.performClick();
                                                break;
                                            }
                                        } else {
                                            int intValue3 = ((Integer) textView22.getTag()).intValue();
                                            do {
                                                int i292 = intValue3 + 1;
                                                editTextBoldCursorArr = ml0Var4.f;
                                                if (i292 >= editTextBoldCursorArr.length) {
                                                    break;
                                                } else {
                                                    intValue3 = i292 == 4 ? intValue3 + 2 : i292;
                                                }
                                            } while (((View) editTextBoldCursorArr[intValue3].getParent()).getVisibility() != 0);
                                            ml0Var4.f[intValue3].requestFocus();
                                            break;
                                        }
                                        break;
                                    default:
                                        ml0 ml0Var5 = this.b;
                                        if (i282 != 6) {
                                            ml0Var5.getClass();
                                            break;
                                        } else {
                                            ml0Var5.n.performClick();
                                            break;
                                        }
                                }
                                return false;
                            }
                        });
                        if (i72 == 1) {
                            this.N[0] = new org.telegram.ui.Cells.a9(context, this.Z0);
                            this.N[0].setText(org.telegram.messenger.gd.M0(2131747194));
                            org.telegram.ui.ActionBar.t6.Z(this.N[0], context, R.drawable.greydivider, org.telegram.ui.ActionBar.m6.b7);
                            this.R.addView(this.N[0], c8.ma.o(-1, -2));
                        } else if (i72 == 2) {
                            this.N[1] = new org.telegram.ui.Cells.a9(context, this.Z0);
                            this.N[1].setText(org.telegram.messenger.gd.M0(2131747197));
                            org.telegram.ui.ActionBar.t6.Z(this.N[1], context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.m6.b7);
                            this.R.addView(this.N[1], c8.ma.o(-1, -2));
                            i72++;
                            i44 = org.telegram.messenger.ks.N1;
                            i34 = 16;
                        }
                        i72++;
                        i44 = org.telegram.messenger.ks.N1;
                        i34 = 16;
                    }
                    P0();
                }
            }
        }
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.fs
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.ks.p0) {
            TLRPC.PaymentForm paymentForm = this.D0;
            paymentForm.password_missing = false;
            paymentForm.can_save_credentials = true;
            Q0();
            return;
        }
        if (i7 == org.telegram.messenger.ks.r0) {
            TLRPC.PaymentForm paymentForm2 = this.D0;
            paymentForm2.password_missing = true;
            paymentForm2.can_save_credentials = false;
            Q0();
            return;
        }
        if (i7 == org.telegram.messenger.ks.a1) {
            this.b1 = true;
            removeSelfFromStack();
        }
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final org.telegram.ui.ActionBar.h6 getResourceProvider() {
        return this.Z0;
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.F, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.s8));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.actionBar, TLObject.FLAG_27, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.C8));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.actionBar, 67108864, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.D8));
        if (this.f != null) {
            int i7 = 0;
            while (true) {
                EditTextBoldCursor[] editTextBoldCursorArr = this.f;
                if (i7 >= editTextBoldCursorArr.length) {
                    break;
                }
                arrayList.add(new org.telegram.ui.ActionBar.v6((View) editTextBoldCursorArr[i7].getParent(), 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.d6));
                i7++;
            }
        } else {
            arrayList.add(new org.telegram.ui.ActionBar.v6((View) null, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.G6));
            arrayList.add(new org.telegram.ui.ActionBar.v6((View) null, TLObject.FLAG_23, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.H6));
        }
        if (this.h != null) {
            for (int i10 = 0; i10 < this.h.length; i10++) {
            }
        }
        int i11 = 0;
        while (true) {
            org.telegram.ui.Cells.o4[] o4VarArr = this.J;
            if (i11 >= o4VarArr.length) {
                break;
            }
            arrayList.add(new org.telegram.ui.ActionBar.v6(o4VarArr[i11], 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.d6));
            i11++;
        }
        for (int i12 = 0; i12 < this.L.length; i12++) {
        }
        for (int i13 = 0; i13 < this.N.length; i13++) {
        }
        int i14 = 0;
        while (true) {
            ArrayList arrayList2 = this.K;
            if (i14 >= arrayList2.size()) {
                break;
            }
            arrayList.add(new org.telegram.ui.ActionBar.v6((View) arrayList2.get(i14), 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.d6));
            i14++;
        }
        int i15 = 1;
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.M, 0, new Class[]{org.telegram.ui.Cells.s8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.M6));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.M, 0, new Class[]{org.telegram.ui.Cells.s8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.N6));
        for (int i16 = 0; i16 < this.O.length; i16++) {
        }
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.V, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.s6));
        while (true) {
            org.telegram.ui.Cells.z8[] z8VarArr = this.Z;
            if (i15 >= z8VarArr.length) {
                arrayList.add(new org.telegram.ui.ActionBar.v6(this.X, TLObject.FLAG_28, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.d6));
                arrayList.add(new org.telegram.ui.ActionBar.v6(this.X, TLObject.FLAG_28, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.i6));
                return arrayList;
            }
            arrayList.add(new org.telegram.ui.ActionBar.v6(z8VarArr[i15], 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.d6));
            i15++;
        }
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return this.H;
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final void onActivityResultFragment(int i7, int i10, Intent intent) {
        if (i7 == 991) {
            org.telegram.messenger.g0.g3(new org.telegram.ui.Components.j01(this, i10, intent, 8));
        }
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final boolean onBackPressed(boolean z10) {
        WebView webView = this.x;
        if (webView == null || !this.E) {
            return !this.Q0;
        }
        if (z10) {
            webView.loadUrl(this.y);
            this.E = false;
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        if (this.v0 == 4 && this.Y0) {
            this.Y0 = false;
            this.X.callOnClick();
        }
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final boolean onFragmentCreate() {
        org.telegram.messenger.ks.f(this.currentAccount).c(this, org.telegram.messenger.ks.p0);
        org.telegram.messenger.ks.f(this.currentAccount).c(this, org.telegram.messenger.ks.r0);
        if (this.v0 != 4 || this.W0) {
            org.telegram.messenger.ks.f(this.currentAccount).b(this, org.telegram.messenger.ks.a1);
        }
        return super.onFragmentCreate();
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00c5, code lost:
    
        if (r0 != 6) goto L56;
     */
    @Override // org.telegram.ui.ActionBar.g2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onFragmentDestroy() {
        kl0 kl0Var = this.U;
        if (kl0Var != null) {
            kl0Var.b();
        }
        int i7 = 0;
        org.telegram.messenger.g0.u(getParentActivity(), false);
        if (!this.b1) {
            this.g1 = 2;
            if (this.a1 != null) {
                org.telegram.ui.ActionBar.r4 r4Var = this.parentLayout;
                if (r4Var != null && r4Var.getFragmentStack() != null) {
                    int indexOf = this.parentLayout.getFragmentStack().indexOf(this);
                    if (indexOf == -1) {
                        indexOf = this.parentLayout.getFragmentStack().size();
                    }
                    while (true) {
                        if (i7 >= this.parentLayout.getFragmentStack().size()) {
                            i7 = indexOf;
                            break;
                        } else if (((org.telegram.ui.ActionBar.g2) this.parentLayout.getFragmentStack().get(i7)) instanceof ml0) {
                            break;
                        } else {
                            i7++;
                        }
                    }
                    i7 -= indexOf;
                }
                if (i7 == 0) {
                    this.a1.d(this.g1);
                }
            }
        }
        org.telegram.messenger.ks.f(this.currentAccount).n(this, org.telegram.messenger.ks.p0);
        org.telegram.messenger.ks.f(this.currentAccount).n(this, org.telegram.messenger.ks.r0);
        if (this.v0 != 4 || this.W0) {
            org.telegram.messenger.ks.f(this.currentAccount).n(this, org.telegram.messenger.ks.a1);
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
            int i10 = this.v0;
            if (i10 != 2) {
            }
        } catch (Throwable th2) {
            org.telegram.messenger.a8.g(th2, true);
        }
        if (org.telegram.messenger.bz.s.length() != 0) {
            if (org.telegram.messenger.bz.A) {
            }
            super.onFragmentDestroy();
            this.R0 = true;
        }
        getParentActivity().getWindow().clearFlags(TLObject.FLAG_13);
        org.telegram.messenger.g0.h2();
        super.onFragmentDestroy();
        this.R0 = true;
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final void onResume() {
        super.onResume();
        org.telegram.messenger.g0.Z2(getParentActivity(), this.classGuid);
        try {
            int i7 = this.v0;
            if ((i7 == 2 || i7 == 6) && !this.D0.invoice.test) {
                getParentActivity().getWindow().setFlags(TLObject.FLAG_13, TLObject.FLAG_13);
                org.telegram.messenger.g0.h2();
                return;
            }
            if (org.telegram.messenger.bz.s.length() != 0 && !org.telegram.messenger.bz.A) {
                return;
            }
            getParentActivity().getWindow().clearFlags(TLObject.FLAG_13);
            org.telegram.messenger.g0.h2();
        } catch (Throwable th2) {
            org.telegram.messenger.a8.g(th2, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final void onThemeColorsChanged() {
        try {
            ScrollView scrollView = this.F;
            if (scrollView != null) {
                org.telegram.messenger.g0.x3(scrollView, getThemedColor(org.telegram.ui.ActionBar.m6.s8));
            }
            if (this.f == null) {
                return;
            }
            getThemedColor(org.telegram.ui.ActionBar.m6.G6);
            int i7 = 0;
            while (true) {
                EditTextBoldCursor[] editTextBoldCursorArr = this.f;
                if (i7 >= editTextBoldCursorArr.length) {
                    return;
                }
                EditTextBoldCursor editTextBoldCursor = editTextBoldCursorArr[i7];
                if (editTextBoldCursor != null) {
                    org.telegram.ui.ActionBar.t6.l(editTextBoldCursor, 30, org.telegram.ui.ActionBar.m6.G6, this.Z0);
                }
                i7++;
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (!z10 || z11) {
            return;
        }
        WebView webView = this.x;
        if (webView != null) {
            if (this.v0 != 4) {
                TLRPC.TL_paymentFormMethod tL_paymentFormMethod = this.G0;
                if (tL_paymentFormMethod != null) {
                    String str = tL_paymentFormMethod.url;
                    this.y = str;
                    webView.loadUrl(str);
                    return;
                } else {
                    String str2 = this.D0.url;
                    this.y = str2;
                    webView.loadUrl(str2);
                    return;
                }
            }
            return;
        }
        int i7 = this.v0;
        if (i7 == 2) {
            org.telegram.messenger.g0.h3(new nk0(this, 3), 100L);
            return;
        }
        if (i7 == 3) {
            this.f[1].requestFocus();
            org.telegram.messenger.g0.I3(this.f[1]);
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
        if (i7 != 6 || this.c0) {
            return;
        }
        this.f[0].requestFocus();
        org.telegram.messenger.g0.I3(this.f[0]);
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final boolean presentFragment(org.telegram.ui.ActionBar.g2 g2Var) {
        E0(g2Var);
        return super.presentFragment(g2Var);
    }

    public final void s0(Context context) {
        FrameLayout frameLayout = new FrameLayout(context);
        this.P = frameLayout;
        org.telegram.ui.Cells.y N0 = org.telegram.ui.ActionBar.m6.N0(true);
        org.telegram.ui.ActionBar.p6 M = org.telegram.ui.ActionBar.t6.M(org.telegram.ui.ActionBar.m6.d6);
        org.telegram.ui.ActionBar.p6 M2 = org.telegram.ui.ActionBar.t6.M(org.telegram.ui.ActionBar.m6.i6);
        frameLayout.setBackground(N0);
        org.telegram.ui.ActionBar.t6.j(frameLayout, N0, M, M2, null);
        this.P.setVisibility(8);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.Q = frameLayout2;
        frameLayout2.setClickable(true);
        this.Q.setFocusable(true);
        this.Q.setBackgroundResource(R.drawable.googlepay_button_no_shadow_background);
        if (this.L0 == null) {
            this.Q.setPadding(org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(2.0f));
        } else {
            this.Q.setPadding(org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f));
        }
        this.P.addView(this.Q, c8.ma.c(48.0f, -1));
        this.Q.setOnClickListener(new jk0(this, 13));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setWeightSum(2.0f);
        linearLayout.setGravity(16);
        linearLayout.setOrientation(1);
        linearLayout.setDuplicateParentStateEnabled(true);
        this.Q.addView(linearLayout, c8.ma.c(-1.0f, -1));
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageView.setDuplicateParentStateEnabled(true);
        imageView.setImageResource(R.drawable.buy_with_googlepay_button_content);
        linearLayout.addView(imageView, c8.ma.l(1.0f, -1, 0));
        ImageView imageView2 = new ImageView(context);
        imageView2.setScaleType(ImageView.ScaleType.FIT_XY);
        imageView2.setDuplicateParentStateEnabled(true);
        imageView2.setImageResource(R.drawable.googlepay_button_overlay);
        this.Q.addView(imageView2, c8.ma.c(-1.0f, -1));
    }

    public final void t0(String str) {
        boolean z10;
        try {
            TelephonyManager telephonyManager = (TelephonyManager) org.telegram.messenger.t0.b.getSystemService("phone");
            if (str == null && (telephonyManager.getSimState() == 1 || telephonyManager.getPhoneType() == 0)) {
                return;
            }
            boolean z11 = getParentActivity().checkSelfPermission("android.permission.READ_PHONE_STATE") == 0;
            if (str != null || z11) {
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
                            z10 = false;
                            break;
                        }
                        String substring = str.substring(0, i7);
                        if (((String) this.c.get(substring)) != null) {
                            str2 = str.substring(i7);
                            this.f[8].setText(substring);
                            z10 = true;
                            break;
                        }
                        i7--;
                    }
                    if (!z10) {
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
        TLRPC.InputInvoice inputInvoice = this.c1;
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
        TLRPC.InputInvoice inputInvoice = this.c1;
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
        return org.telegram.messenger.n5.n(inputPeer);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final String x0(ArrayList arrayList) {
        String str;
        double d;
        long j3 = 0;
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            j3 += ((TLRPC.TL_labeledPrice) arrayList.get(i7)).amount;
        }
        org.telegram.messenger.gd.E0();
        String upperCase = this.D0.invoice.currency.toUpperCase();
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
        Long l10 = this.I0;
        if (l10 != null) {
            j3 += l10.longValue();
        }
        return org.telegram.messenger.gd.E0().p(j3, this.D0.invoice.currency);
    }

    public final void z0() {
        int i7;
        int i10;
        boolean z10;
        int i11 = this.v0;
        if (i11 == 0) {
            kl0 kl0Var = this.U;
            if (kl0Var != null) {
                kl0Var.d(this.J0);
                finishFragment();
                return;
            }
            if (this.D0.invoice.flexible) {
                i7 = 1;
            } else if (this.z0 == null && this.x0 == null) {
                i7 = 2;
            } else {
                if (org.telegram.messenger.j10.i(this.currentAccount).y != null && org.telegram.messenger.j10.i(this.currentAccount).y.valid_until < ConnectionsManager.getInstance(this.currentAccount).getCurrentTime() + 60) {
                    org.telegram.messenger.j10.i(this.currentAccount).y = null;
                    org.telegram.messenger.j10.i(this.currentAccount).v(false);
                }
                i7 = org.telegram.messenger.j10.i(this.currentAccount).y != null ? 4 : 3;
            }
            if (i7 == 2 && this.z0 == null && this.x0 == null && !this.D0.additional_methods.isEmpty()) {
                M0(new nk0(this, 0));
                return;
            }
            ml0 ml0Var = new ml0(this.c1, this.D0, this.O0, this.P0, i7, this.F0, null, null, this.x0, this.y0, this.J0, this.V0, this.K0, this.s0, this.X0);
            ml0Var.d1 = this.d1;
            ml0Var.e1 = this.e1;
            presentFragment(ml0Var, this.T0);
            return;
        }
        if (i11 == 1) {
            if (this.x0 == null && this.y0 == null) {
                if (this.z0 != null) {
                    if (org.telegram.messenger.j10.i(this.currentAccount).y != null && org.telegram.messenger.j10.i(this.currentAccount).y.valid_until < ConnectionsManager.getInstance(this.currentAccount).getCurrentTime() + 60) {
                        org.telegram.messenger.j10.i(this.currentAccount).y = null;
                        org.telegram.messenger.j10.i(this.currentAccount).v(false);
                    }
                    if (org.telegram.messenger.j10.i(this.currentAccount).y == null) {
                        i10 = 3;
                    }
                } else {
                    i10 = 2;
                }
                if (i10 != 2 && this.y0 == null && this.z0 == null && this.x0 == null && !this.D0.additional_methods.isEmpty()) {
                    M0(new nk0(this, 0));
                    return;
                }
                ml0 ml0Var2 = new ml0(this.c1, this.D0, this.O0, this.P0, i10, this.F0, this.H0, this.I0, this.x0, this.y0, this.J0, this.V0, this.K0, this.s0, this.X0);
                ml0Var2.d1 = this.d1;
                ml0Var2.e1 = this.e1;
                presentFragment(ml0Var2, this.T0);
                return;
            }
            i10 = 4;
            if (i10 != 2) {
            }
            ml0 ml0Var22 = new ml0(this.c1, this.D0, this.O0, this.P0, i10, this.F0, this.H0, this.I0, this.x0, this.y0, this.J0, this.V0, this.K0, this.s0, this.X0);
            ml0Var22.d1 = this.d1;
            ml0Var22.e1 = this.e1;
            presentFragment(ml0Var22, this.T0);
            return;
        }
        if (i11 == 2) {
            TLRPC.PaymentForm paymentForm = this.D0;
            if (paymentForm.password_missing && (z10 = this.V0)) {
                ml0 ml0Var3 = new ml0(this.c1, paymentForm, this.O0, this.P0, 6, this.F0, this.H0, this.I0, this.x0, this.y0, this.J0, z10, this.K0, this.s0, this.X0);
                this.g0 = ml0Var3;
                ml0Var3.d1 = this.d1;
                ml0Var3.e1 = this.e1;
                ml0Var3.I0(this.b0);
                ml0 ml0Var4 = this.g0;
                ml0Var4.U = new dl0(this);
                presentFragment(ml0Var4, this.T0);
                return;
            }
            kl0 kl0Var2 = this.U;
            if (kl0Var2 != null) {
                kl0Var2.c(this.x0, this.y0, this.V0, this.K0, null);
                finishFragment();
                return;
            } else {
                ml0 ml0Var5 = new ml0(this.c1, paymentForm, this.O0, this.P0, 4, this.F0, this.H0, this.I0, this.x0, this.y0, this.J0, this.V0, this.K0, this.s0, this.X0);
                ml0Var5.d1 = this.d1;
                ml0Var5.e1 = this.e1;
                presentFragment(ml0Var5, this.T0);
                return;
            }
        }
        if (i11 == 3) {
            ml0 ml0Var6 = new ml0(this.c1, this.D0, this.O0, this.P0, this.w0 ? 4 : 2, this.F0, this.H0, this.I0, this.x0, this.y0, this.J0, this.V0, this.K0, this.s0, this.X0);
            ml0Var6.d1 = this.d1;
            ml0Var6.e1 = this.e1;
            presentFragment(ml0Var6, true);
            return;
        }
        if (i11 != 4) {
            if (i11 != 6) {
                return;
            }
            if (this.U.c(this.x0, this.y0, this.V0, this.K0, this.z0)) {
                finishFragment();
                return;
            }
            ml0 ml0Var7 = new ml0(this.c1, this.D0, this.O0, this.P0, 4, this.F0, this.H0, this.I0, this.x0, this.y0, this.J0, this.V0, this.K0, this.s0, false);
            ml0Var7.d1 = this.d1;
            ml0Var7.e1 = this.e1;
            presentFragment(ml0Var7, true);
            return;
        }
        boolean z11 = this.W0;
        int i12 = org.telegram.messenger.ks.a1;
        if (z11) {
            org.telegram.messenger.ks.f(this.currentAccount).n(this, i12);
        }
        org.telegram.messenger.ks.f(this.currentAccount).k(i12, new Object[0]);
        if (getMessagesController().o7 != null) {
            org.telegram.messenger.g0.h3(new nk0(this, 1), 500L);
        } else {
            if (D0(getParentLayout(), getParentActivity()) || isFinishing()) {
                return;
            }
            finishFragment();
        }
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final boolean presentFragment(org.telegram.ui.ActionBar.g2 g2Var, boolean z10) {
        E0(g2Var);
        return super.presentFragment(g2Var, z10);
    }

    public ml0(TLRPC.PaymentForm paymentForm, org.telegram.messenger.fj fjVar, String str, org.telegram.ui.ActionBar.g2 g2Var) {
        super(null);
        this.a = new ArrayList();
        this.b = new HashMap();
        this.c = new HashMap();
        this.d = new HashMap();
        this.H = true;
        this.J = new org.telegram.ui.Cells.o4[3];
        this.K = new ArrayList();
        this.L = new org.telegram.ui.Cells.z6[3];
        this.N = new org.telegram.ui.Cells.a9[3];
        this.O = new org.telegram.ui.Cells.x9[2];
        this.Z = new org.telegram.ui.Cells.z8[7];
        this.a0 = -4.5f;
        this.d0 = 6;
        this.W0 = true;
        A0(null, paymentForm, fjVar, str, 4, null, null, null, null, null, null, false, null, g2Var, false);
    }

    public ml0(TLRPC.PaymentReceipt paymentReceipt) {
        super(null);
        this.a = new ArrayList();
        this.b = new HashMap();
        this.c = new HashMap();
        this.d = new HashMap();
        this.H = true;
        this.J = new org.telegram.ui.Cells.o4[3];
        this.K = new ArrayList();
        this.L = new org.telegram.ui.Cells.z6[3];
        this.N = new org.telegram.ui.Cells.a9[3];
        this.O = new org.telegram.ui.Cells.x9[2];
        this.Z = new org.telegram.ui.Cells.z8[7];
        this.a0 = -4.5f;
        this.d0 = 6;
        this.v0 = 5;
        TLRPC.PaymentForm paymentForm = new TLRPC.PaymentForm();
        this.D0 = paymentForm;
        this.E0 = paymentReceipt;
        paymentForm.bot_id = paymentReceipt.bot_id;
        paymentForm.invoice = paymentReceipt.invoice;
        paymentForm.provider_id = paymentReceipt.provider_id;
        paymentForm.users = paymentReceipt.users;
        this.H0 = paymentReceipt.shipping;
        long j3 = paymentReceipt.tip_amount;
        if (j3 != 0) {
            this.I0 = Long.valueOf(j3);
        }
        TLRPC.User c22 = getMessagesController().c2(Long.valueOf(paymentReceipt.bot_id));
        this.m0 = c22;
        if (c22 != null) {
            this.q0 = c22.first_name;
        } else {
            this.q0 = "";
        }
        this.r0 = paymentReceipt.title;
        if (paymentReceipt.info != null) {
            this.J0 = new TLRPC.TL_payments_validateRequestedInfo();
            if (this.O0 != null) {
                TLRPC.TL_inputInvoiceMessage tL_inputInvoiceMessage = new TLRPC.TL_inputInvoiceMessage();
                tL_inputInvoiceMessage.peer = getMessagesController().l1(paymentReceipt.bot_id);
                this.J0.invoice = tL_inputInvoiceMessage;
            } else {
                TLRPC.TL_inputInvoiceSlug tL_inputInvoiceSlug = new TLRPC.TL_inputInvoiceSlug();
                tL_inputInvoiceSlug.slug = this.P0;
                this.J0.invoice = tL_inputInvoiceSlug;
            }
            this.J0.info = paymentReceipt.info;
        }
        this.y0 = paymentReceipt.credentials_title;
    }

    public ml0(TLRPC.PaymentForm paymentForm, TLRPC.InputInvoice inputInvoice, org.telegram.ui.ActionBar.g2 g2Var) {
        this(inputInvoice, paymentForm, null, null, 4, null, null, null, null, null, null, false, null, g2Var, false);
        this.W0 = true;
    }
}
