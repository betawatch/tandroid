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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class dl0 extends org.telegram.ui.ActionBar.d2 implements org.telegram.messenger.cs {
    public static final List h1 = Arrays.asList("http", "https");
    public static final List i1 = Collections.singletonList("tg");
    public boolean A0;
    public ks B0;
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
    public final org.telegram.ui.Cells.n4[] J;
    public TLRPC.TL_payments_validateRequestedInfo J0;
    public final ArrayList K;
    public TLRPC.TL_inputPaymentCredentialsGooglePay K0;
    public final org.telegram.ui.Cells.x6[] L;
    public String L0;
    public org.telegram.ui.Cells.q8 M;
    public String M0;
    public final org.telegram.ui.Cells.y8[] N;
    public JSONObject N0;
    public final org.telegram.ui.Cells.v9[] O;
    public org.telegram.messenger.zi O0;
    public FrameLayout P;
    public String P0;
    public FrameLayout Q;
    public boolean Q0;
    public LinearLayout R;
    public boolean R0;
    public org.telegram.ui.Cells.z8 S;
    public String[] S0;
    public org.telegram.ui.Cells.l3 T;
    public boolean T0;
    public bl0 U;
    public boolean U0;
    public TextView V;
    public boolean V0;
    public org.telegram.ui.Cells.m6 W;
    public boolean W0;
    public zk0 X;
    public boolean X0;
    public org.telegram.ui.Cells.j5 Y;
    public boolean Y0;
    public final org.telegram.ui.Cells.x8[] Z;
    public org.telegram.ui.ActionBar.e6 Z0;
    public final ArrayList a;
    public float a0;
    public cl0 a1;
    public final HashMap b;
    public TL_account.Password b0;
    public boolean b1;
    public final HashMap c;
    public boolean c0;
    public TLRPC.InputInvoice c1;
    public final HashMap d;
    public int d0;
    public org.telegram.messenger.u10 d1;
    public a9.j0 e;
    public ek0 e0;
    public org.telegram.messenger.u10 e1;
    public EditTextBoldCursor[] f;
    public boolean f0;
    public h00 f1;
    public dl0 g0;
    public int g1;
    public org.telegram.ui.Cells.h6[] h;
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
    public org.telegram.ui.Components.aq r;
    public String r0;
    public org.telegram.ui.Components.aq s;
    public org.telegram.ui.ActionBar.d2 s0;
    public jk0 t0;
    public ArrayList u0;
    public int v0;
    public AnimatorSet w;
    public boolean w0;
    public WebView x;
    public String x0;
    public String y;
    public String y0;
    public TLRPC.TL_paymentSavedCredentialsCard z0;

    public dl0(TLRPC.InputInvoice inputInvoice, TLRPC.PaymentForm paymentForm, org.telegram.messenger.zi ziVar, String str, int i3, TLRPC.TL_payments_validatedRequestedInfo tL_payments_validatedRequestedInfo, TLRPC.TL_shippingOption tL_shippingOption, Long l10, String str2, String str3, TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo, boolean z10, TLRPC.TL_inputPaymentCredentialsGooglePay tL_inputPaymentCredentialsGooglePay, org.telegram.ui.ActionBar.d2 d2Var, boolean z11) {
        super(null);
        this.a = new ArrayList();
        this.b = new HashMap();
        this.c = new HashMap();
        this.d = new HashMap();
        this.H = true;
        this.J = new org.telegram.ui.Cells.n4[3];
        this.K = new ArrayList();
        this.L = new org.telegram.ui.Cells.x6[3];
        this.N = new org.telegram.ui.Cells.y8[3];
        this.O = new org.telegram.ui.Cells.v9[2];
        this.Z = new org.telegram.ui.Cells.x8[7];
        this.a0 = -4.5f;
        this.d0 = 6;
        A0(inputInvoice, paymentForm, ziVar, str, i3, tL_payments_validatedRequestedInfo, tL_shippingOption, l10, str2, str3, tL_payments_validateRequestedInfo, z10, tL_inputPaymentCredentialsGooglePay, d2Var, z11);
    }

    public static /* synthetic */ void Z(dl0 dl0Var, TL_account.Password password, byte[] bArr) {
        TLRPC.PasswordKdfAlgo passwordKdfAlgo = password.current_algo;
        byte[] c2 = passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow ? org.telegram.messenger.hv.c(bArr, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo) : null;
        TL_account.getTmpPassword gettmppassword = new TL_account.getTmpPassword();
        gettmppassword.period = 1800;
        xy xyVar = new xy(20, dl0Var, gettmppassword);
        TLRPC.PasswordKdfAlgo passwordKdfAlgo2 = password.current_algo;
        if (!(passwordKdfAlgo2 instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow)) {
            TLRPC.TL_error tL_error = new TLRPC.TL_error();
            tL_error.text = "PASSWORD_HASH_INVALID";
            xyVar.run(null, tL_error);
            return;
        }
        TLRPC.TL_inputCheckPasswordSRP d = org.telegram.messenger.hv.d(c2, password.srp_id, password.srp_B, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo2);
        gettmppassword.password = d;
        if (d != null) {
            ConnectionsManager.getInstance(dl0Var.currentAccount).sendRequest(gettmppassword, xyVar, 10);
            return;
        }
        TLRPC.TL_error tL_error2 = new TLRPC.TL_error();
        tL_error2.text = "ALGO_INVALID";
        xyVar.run(null, tL_error2);
    }

    public static /* synthetic */ void a0(dl0 dl0Var, TLRPC.TL_error tL_error, TLObject tLObject) {
        dl0Var.J0(false);
        dl0Var.N0(true, false);
        if (tL_error != null) {
            String str = tL_error.text;
            str.getClass();
            switch (str) {
                case "ADDRESS_CITY_INVALID":
                    dl0Var.K0(2);
                    break;
                case "ADDRESS_STREET_LINE1_INVALID":
                    dl0Var.K0(0);
                    break;
                case "ADDRESS_COUNTRY_INVALID":
                    dl0Var.K0(4);
                    break;
                case "REQ_INFO_NAME_INVALID":
                    dl0Var.K0(6);
                    break;
                case "ADDRESS_POSTCODE_INVALID":
                    dl0Var.K0(5);
                    break;
                case "ADDRESS_STATE_INVALID":
                    dl0Var.K0(3);
                    break;
                case "REQ_INFO_PHONE_INVALID":
                    dl0Var.K0(9);
                    break;
                case "ADDRESS_STREET_LINE2_INVALID":
                    dl0Var.K0(1);
                    break;
                case "REQ_INFO_EMAIL_INVALID":
                    dl0Var.K0(7);
                    break;
                default:
                    org.telegram.ui.Components.t4.e0(dl0Var.currentAccount, tL_error, dl0Var, tLObject, new Object[0]);
                    break;
            }
        }
    }

    public static /* synthetic */ void b0(dl0 dl0Var, TLRPC.TL_payments_validatedRequestedInfo tL_payments_validatedRequestedInfo) {
        dl0Var.F0 = tL_payments_validatedRequestedInfo;
        if (dl0Var.D0.saved_info != null && !dl0Var.U0) {
            TLRPC.TL_payments_clearSavedInfo tL_payments_clearSavedInfo = new TLRPC.TL_payments_clearSavedInfo();
            tL_payments_clearSavedInfo.info = true;
            ConnectionsManager.getInstance(dl0Var.currentAccount).sendRequest(tL_payments_clearSavedInfo, new ei.u5(26), dl0Var.X0 ? 8 : 0);
        }
        dl0Var.z0();
        dl0Var.J0(false);
        dl0Var.N0(true, false);
    }

    public static /* synthetic */ void c0(dl0 dl0Var, TLRPC.TL_error tL_error, TLObject tLObject) {
        dl0Var.J0(false);
        dl0Var.N0(true, false);
        if (tL_error != null) {
            org.telegram.ui.Components.t4.e0(dl0Var.currentAccount, tL_error, dl0Var, tLObject, new Object[0]);
        }
    }

    public static /* synthetic */ void d0(dl0 dl0Var, org.telegram.ui.Components.ac acVar, boolean z10, TLRPC.Message message) {
        acVar.b();
        if (!z10) {
            TLRPC.TL_payments_getPaymentReceipt tL_payments_getPaymentReceipt = new TLRPC.TL_payments_getPaymentReceipt();
            tL_payments_getPaymentReceipt.msg_id = message.id;
            tL_payments_getPaymentReceipt.peer = org.telegram.messenger.hp.s1(dl0Var.currentAccount).m1(message.peer_id);
            ConnectionsManager.getInstance(dl0Var.currentAccount).sendRequest(tL_payments_getPaymentReceipt, new zj0(dl0Var, 0), 2);
            return;
        }
        org.telegram.ui.ActionBar.d2 T = LaunchActivity.T();
        if (T != null) {
            T.presentFragment(wm.qa(message.id, org.telegram.messenger.zi.B0(message)));
        }
    }

    public static void e0(dl0 dl0Var) {
        ConnectionsManager.getInstance(dl0Var.currentAccount).sendRequest(new TL_account.resendPasswordEmail(), new ei.u5(26), dl0Var.X0 ? 8 : 0);
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(dl0Var.getParentActivity());
        String M0 = org.telegram.messenger.bd.M0(2131746130, null);
        org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.a;
        s1Var.U = M0;
        s1Var.S = org.telegram.messenger.bd.M0(R.string.AppName, null);
        alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131747839, null), null);
        dl0Var.showDialog(s1Var);
    }

    public static /* synthetic */ void f0(dl0 dl0Var, boolean z10, String str, String str2, TL_account.updatePasswordSettings updatepasswordsettings) {
        ci.t8 t8Var = new ci.t8(dl0Var, z10, str, 8);
        if (z10) {
            ConnectionsManager.getInstance(dl0Var.currentAccount).sendRequest(updatepasswordsettings, t8Var, 10);
            return;
        }
        byte[] h12 = org.telegram.messenger.g0.h1(str2);
        TLRPC.PasswordKdfAlgo passwordKdfAlgo = dl0Var.b0.new_algo;
        if (!(passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow)) {
            TLRPC.TL_error tL_error = new TLRPC.TL_error();
            tL_error.text = "PASSWORD_HASH_INVALID";
            t8Var.run(null, tL_error);
            return;
        }
        updatepasswordsettings.new_settings.new_password_hash = org.telegram.messenger.hv.b(h12, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
        if (updatepasswordsettings.new_settings.new_password_hash == null) {
            TLRPC.TL_error tL_error2 = new TLRPC.TL_error();
            tL_error2.text = "ALGO_INVALID";
            t8Var.run(null, tL_error2);
        }
        ConnectionsManager.getInstance(dl0Var.currentAccount).sendRequest(updatepasswordsettings, t8Var, 10);
    }

    public static /* synthetic */ void g0(dl0 dl0Var, TLRPC.TL_error tL_error, TLRPC.TL_payments_sendPaymentForm tL_payments_sendPaymentForm) {
        org.telegram.ui.Components.t4.e0(dl0Var.currentAccount, tL_error, dl0Var, tL_payments_sendPaymentForm, new Object[0]);
        dl0Var.J0(false);
        dl0Var.N0(false, false);
        dl0Var.b1 = true;
        dl0Var.g1 = 4;
        cl0 cl0Var = dl0Var.a1;
        if (cl0Var != null) {
            cl0Var.e(4);
        }
    }

    public static void h0(dl0 dl0Var, TLObject tLObject) {
        org.telegram.ui.ActionBar.d2 Q;
        if (tLObject instanceof TLRPC.TL_payments_paymentReceiptStars) {
            ci.wb.m1(dl0Var.getParentActivity(), dl0Var.currentAccount, (TLRPC.TL_payments_paymentReceiptStars) tLObject, dl0Var.Z0);
            return;
        }
        if (!(tLObject instanceof TLRPC.PaymentReceipt) || (Q = LaunchActivity.Q()) == null) {
            return;
        }
        org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2();
        b2Var.a = true;
        dl0 dl0Var2 = new dl0((TLRPC.PaymentReceipt) tLObject);
        dl0Var2.d1 = dl0Var.d1;
        dl0Var2.e1 = dl0Var.e1;
        Q.showAsSheet(dl0Var2, b2Var);
    }

    public static void i0(dl0 dl0Var, TLObject tLObject, TLRPC.TL_error tL_error, TL_account.getTmpPassword gettmppassword) {
        dl0Var.N0(true, false);
        dl0Var.J0(false);
        if (tLObject != null) {
            dl0Var.w0 = true;
            org.telegram.messenger.h10.i(dl0Var.currentAccount).y = (TL_account.tmpPassword) tLObject;
            org.telegram.messenger.h10.i(dl0Var.currentAccount).v(false);
            dl0Var.z0();
            return;
        }
        if (!tL_error.text.equals("PASSWORD_HASH_INVALID")) {
            org.telegram.ui.Components.t4.e0(dl0Var.currentAccount, tL_error, dl0Var, gettmppassword, new Object[0]);
            return;
        }
        try {
            dl0Var.f[1].performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        org.telegram.messenger.g0.G3(3.25f, dl0Var.f[1], null);
        dl0Var.f[1].setText("");
    }

    public static void j0(dl0 dl0Var, TLObject tLObject) {
        org.telegram.ui.ActionBar.d2 Q;
        if (tLObject instanceof TLRPC.TL_payments_paymentReceiptStars) {
            ci.wb.m1(dl0Var.getParentActivity(), dl0Var.currentAccount, (TLRPC.TL_payments_paymentReceiptStars) tLObject, dl0Var.Z0);
            return;
        }
        if (!(tLObject instanceof TLRPC.PaymentReceipt) || (Q = LaunchActivity.Q()) == null) {
            return;
        }
        org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2();
        b2Var.a = true;
        dl0 dl0Var2 = new dl0((TLRPC.PaymentReceipt) tLObject);
        dl0Var2.d1 = dl0Var.d1;
        dl0Var2.e1 = dl0Var.e1;
        Q.showAsSheet(dl0Var2, b2Var);
    }

    public static void k0(dl0 dl0Var, TLRPC.TL_error tL_error, TLObject tLObject, String str, TL_account.getPassword getpassword) {
        if (tL_error != null) {
            org.telegram.ui.Components.t4.e0(dl0Var.currentAccount, tL_error, dl0Var, getpassword, new Object[0]);
            dl0Var.N0(true, false);
            dl0Var.J0(false);
            return;
        }
        TL_account.Password password = (TL_account.Password) tLObject;
        if (!TwoStepVerificationActivity.n0(password, false)) {
            org.telegram.ui.Components.t4.w0(dl0Var.getParentActivity(), org.telegram.messenger.bd.M0(2131743830, null), true);
        } else if (password.has_password) {
            Utilities.e.c(new hc0(dl0Var, password, org.telegram.messenger.g0.h1(str), 17));
        } else {
            dl0Var.w0 = false;
            dl0Var.z0();
        }
    }

    public static /* synthetic */ void l0(dl0 dl0Var, org.telegram.ui.Components.ac acVar, boolean z10, TLRPC.Message[] messageArr) {
        acVar.b();
        if (!z10) {
            TLRPC.TL_payments_getPaymentReceipt tL_payments_getPaymentReceipt = new TLRPC.TL_payments_getPaymentReceipt();
            tL_payments_getPaymentReceipt.msg_id = messageArr[0].id;
            tL_payments_getPaymentReceipt.peer = org.telegram.messenger.hp.s1(dl0Var.currentAccount).m1(messageArr[0].peer_id);
            ConnectionsManager.getInstance(dl0Var.currentAccount).sendRequest(tL_payments_getPaymentReceipt, new zj0(dl0Var, 2), 2);
            return;
        }
        org.telegram.ui.ActionBar.d2 T = LaunchActivity.T();
        if (T != null) {
            T.presentFragment(wm.qa(messageArr[0].id, org.telegram.messenger.zi.B0(messageArr[0])));
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
    public static void m0(dl0 dl0Var, String str, View view) {
        int i3;
        org.telegram.ui.Cells.m6 m6Var = dl0Var.W;
        if (m6Var != null && !dl0Var.G) {
            dl0Var.a0 = -dl0Var.a0;
            org.telegram.messenger.g0.G3(dl0Var.a0, m6Var.getTextView(), null);
            org.telegram.messenger.g0.G3(dl0Var.a0, dl0Var.W.getCheckBox(), null);
            try {
                dl0Var.W.performHapticFeedback(3, 2);
                return;
            } catch (Exception unused) {
                return;
            }
        }
        boolean z10 = dl0Var.W0;
        int i10 = 1;
        if (z10 && dl0Var.D0.saved_info != null && dl0Var.J0 == null) {
            dl0Var.J0(true);
            tb0 tb0Var = new tb0(27, dl0Var, view);
            if (dl0Var.R0) {
                return;
            }
            dl0Var.N0(true, true);
            TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo = new TLRPC.TL_payments_validateRequestedInfo();
            dl0Var.J0 = tL_payments_validateRequestedInfo;
            TLRPC.InputInvoice inputInvoice = dl0Var.c1;
            if (inputInvoice != null) {
                tL_payments_validateRequestedInfo.invoice = inputInvoice;
            } else if (dl0Var.O0 != null) {
                TLRPC.TL_inputInvoiceMessage tL_inputInvoiceMessage = new TLRPC.TL_inputInvoiceMessage();
                tL_inputInvoiceMessage.peer = dl0Var.getMessagesController().m1(dl0Var.O0.k.peer_id);
                tL_inputInvoiceMessage.msg_id = dl0Var.O0.f1();
                dl0Var.J0.invoice = tL_inputInvoiceMessage;
            } else {
                TLRPC.TL_inputInvoiceSlug tL_inputInvoiceSlug = new TLRPC.TL_inputInvoiceSlug();
                tL_inputInvoiceSlug.slug = dl0Var.P0;
                dl0Var.J0.invoice = tL_inputInvoiceSlug;
            }
            TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo2 = dl0Var.J0;
            tL_payments_validateRequestedInfo2.save = true;
            tL_payments_validateRequestedInfo2.info = dl0Var.D0.saved_info;
            ConnectionsManager.getInstance(dl0Var.currentAccount).sendRequest(tL_payments_validateRequestedInfo2, new y9(dl0Var, tb0Var, tL_payments_validateRequestedInfo2, 29), (dl0Var.X0 ? 8 : 0) | 2);
            return;
        }
        if (z10) {
            TLRPC.PaymentForm paymentForm = dl0Var.D0;
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
                        i3 = 0;
                        if (i3 != 2 && !paymentForm.additional_methods.isEmpty()) {
                            Objects.requireNonNull(view);
                            dl0Var.M0(new org.telegram.ui.Components.nt(0, view));
                            return;
                        } else {
                            dl0 dl0Var2 = new dl0(dl0Var.c1, dl0Var.D0, dl0Var.O0, dl0Var.P0, i3, dl0Var.F0, dl0Var.H0, dl0Var.I0, dl0Var.x0, dl0Var.y0, dl0Var.J0, dl0Var.V0, null, dl0Var.s0, dl0Var.X0);
                            dl0Var2.d1 = dl0Var.d1;
                            dl0Var2.e1 = dl0Var.e1;
                            dl0Var.presentFragment(dl0Var2);
                            return;
                        }
                    }
                }
                i3 = (dl0Var.z0 == null && dl0Var.x0 == null && dl0Var.K0 == null) ? 2 : 1;
                if (i3 != 2) {
                }
                dl0 dl0Var22 = new dl0(dl0Var.c1, dl0Var.D0, dl0Var.O0, dl0Var.P0, i3, dl0Var.F0, dl0Var.H0, dl0Var.I0, dl0Var.x0, dl0Var.y0, dl0Var.J0, dl0Var.V0, null, dl0Var.s0, dl0Var.X0);
                dl0Var22.d1 = dl0Var.d1;
                dl0Var22.e1 = dl0Var.e1;
                dl0Var.presentFragment(dl0Var22);
                return;
            }
            if (dl0Var.z0 == null) {
                if (dl0Var.x0 == null) {
                }
            }
            if (dl0Var.H0 == null) {
            }
        }
        if (!dl0Var.D0.password_missing && dl0Var.z0 != null) {
            if (org.telegram.messenger.h10.i(dl0Var.currentAccount).y != null && org.telegram.messenger.h10.i(dl0Var.currentAccount).y.valid_until < ConnectionsManager.getInstance(dl0Var.currentAccount).getCurrentTime() + 60) {
                org.telegram.messenger.h10.i(dl0Var.currentAccount).y = null;
                org.telegram.messenger.h10.i(dl0Var.currentAccount).v(false);
            }
            if (org.telegram.messenger.h10.i(dl0Var.currentAccount).y == null) {
                dl0Var.Y0 = true;
                dl0 dl0Var3 = new dl0(dl0Var.c1, dl0Var.D0, dl0Var.O0, dl0Var.P0, 3, dl0Var.F0, dl0Var.H0, dl0Var.I0, null, dl0Var.y0, dl0Var.J0, dl0Var.V0, null, dl0Var.s0, dl0Var.X0);
                dl0Var3.d1 = dl0Var.d1;
                dl0Var3.e1 = dl0Var.e1;
                dl0Var.presentFragment(dl0Var3);
                dl0Var.Y0 = false;
                return;
            }
            if (dl0Var.W0) {
                dl0Var.W0 = false;
                org.telegram.messenger.hs.f(dl0Var.currentAccount).n(dl0Var, org.telegram.messenger.hs.a1);
            }
        }
        TLRPC.User user = dl0Var.m0;
        if (user == null || user.verified) {
            dl0Var.O0(dl0Var.S0[0]);
            return;
        }
        String str2 = "payment_warning_" + dl0Var.m0.id;
        SharedPreferences sharedPreferences = org.telegram.messenger.hp.s1(dl0Var.currentAccount).d7;
        if (sharedPreferences.getBoolean(str2, false)) {
            dl0Var.O0(dl0Var.S0[0]);
            return;
        }
        sharedPreferences.edit().putBoolean(str2, true).commit();
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(dl0Var.getParentActivity());
        String M0 = org.telegram.messenger.bd.M0(2131747360, null);
        org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.a;
        s1Var.S = M0;
        s1Var.U = org.telegram.messenger.bd.a0("PaymentWarningText", null, 2131747359, dl0Var.q0, str);
        alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131751771, null), new fk0(dl0Var, i10));
        dl0Var.showDialog(s1Var);
    }

    public static void n0(dl0 dl0Var, TLRPC.TL_error tL_error, boolean z10, TLObject tLObject, String str) {
        int i3 = 8;
        if (tL_error != null && "SRP_ID_INVALID".equals(tL_error.text)) {
            ConnectionsManager.getInstance(dl0Var.currentAccount).sendRequest(new TL_account.getPassword(), new gi.b3(9, dl0Var, z10), 8);
            return;
        }
        dl0Var.N0(true, false);
        if (z10) {
            TL_account.Password password = dl0Var.b0;
            password.has_password = false;
            password.current_algo = null;
            dl0Var.U.a(password);
            dl0Var.finishFragment();
            return;
        }
        if (tL_error == null && (tLObject instanceof TLRPC.TL_boolTrue)) {
            if (dl0Var.getParentActivity() == null) {
                return;
            }
            dl0Var.z0();
            return;
        }
        if (tL_error != null) {
            if (!tL_error.text.equals("EMAIL_UNCONFIRMED") && !tL_error.text.startsWith("EMAIL_UNCONFIRMED_")) {
                if (tL_error.text.equals("EMAIL_INVALID")) {
                    dl0Var.L0(org.telegram.messenger.bd.M0(R.string.AppName, null), org.telegram.messenger.bd.M0(2131747453, null));
                    return;
                } else if (!tL_error.text.startsWith("FLOOD_WAIT")) {
                    dl0Var.L0(org.telegram.messenger.bd.M0(R.string.AppName, null), tL_error.text);
                    return;
                } else {
                    int intValue = Utilities.z(tL_error.text).intValue();
                    dl0Var.L0(org.telegram.messenger.bd.M0(R.string.AppName, null), org.telegram.messenger.bd.a0("FloodWaitTime", null, 2131750687, intValue < 60 ? org.telegram.messenger.bd.G(intValue, "Seconds", new Object[0]) : org.telegram.messenger.bd.G(intValue / 60, "Minutes", new Object[0])));
                    return;
                }
            }
            dl0Var.d0 = Utilities.z(tL_error.text).intValue();
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(dl0Var.getParentActivity());
            alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131747839, null), new rb0(i3, dl0Var, str));
            String M0 = org.telegram.messenger.bd.M0(2131742831, null);
            org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.a;
            s1Var.U = M0;
            s1Var.S = org.telegram.messenger.bd.M0(2131742832, null);
            Dialog showDialog = dl0Var.showDialog(s1Var);
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
    public static void o0(dl0 dl0Var) {
        Integer num;
        Integer num2;
        int i3;
        boolean z10;
        boolean z11;
        Integer num3;
        boolean z12;
        boolean z13;
        String[] split = dl0Var.f[1].getText().toString().split("/");
        if (split.length == 2) {
            Integer z14 = Utilities.z(split[0]);
            num2 = Utilities.z(split[1]);
            num = z14;
        } else {
            num = null;
            num2 = null;
        }
        rc.a aVar = new rc.a(dl0Var.f[0].getText().toString(), num, num2, dl0Var.f[3].getText().toString(), dl0Var.f[2].getText().toString(), null, null, null, null, dl0Var.f[5].getText().toString(), dl0Var.f[4].getText().toString(), null, null, null, null, null, null);
        dl0Var.y0 = aVar.a() + " *" + aVar.b();
        boolean z15 = num != null && num2 != null && org.telegram.messenger.h10.i(dl0Var.currentAccount).d().startsWith("7") && "smartglocal".equals(dl0Var.D0.native_provider) && (num2.intValue() > 22 || (num2.intValue() == 22 && num.intValue() > 1));
        String str = aVar.a;
        if (x7.d5.d(str)) {
            i3 = 0;
        } else {
            String replaceAll = str.trim().replaceAll("\\s+|-", "");
            if (!x7.d5.d(replaceAll) && replaceAll != null) {
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
                                        if (num4 != null && num4.intValue() >= 1 && num4.intValue() <= 12 && (num3 = aVar.d) != null && x7.h0.a(num3.intValue()) >= v7.s.C0().get(1)) {
                                            if (num4 == null || num4.intValue() < 1 || num4.intValue() > 12 || num3 == null || x7.h0.a(num3.intValue()) < v7.s.C0().get(1)) {
                                                z12 = false;
                                            } else {
                                                int intValue = num3.intValue();
                                                int intValue2 = num4.intValue();
                                                if (x7.h0.a(intValue) >= v7.s.C0().get(1)) {
                                                    Calendar C0 = v7.s.C0();
                                                    if (x7.h0.a(intValue) != C0.get(1) || intValue2 >= C0.get(2) + 1) {
                                                        z13 = false;
                                                        z12 = !z13;
                                                    }
                                                }
                                                z13 = true;
                                                z12 = !z13;
                                            }
                                        }
                                        dl0Var.K0(1);
                                        return;
                                    }
                                    if (dl0Var.j0 && dl0Var.f[2].length() == 0) {
                                        dl0Var.K0(2);
                                        return;
                                    }
                                    String str2 = aVar.b;
                                    if (!x7.d5.d(str2)) {
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
                                                    dl0Var.K0(3);
                                                    return;
                                                }
                                                if (dl0Var.h0 && dl0Var.f[4].length() == 0) {
                                                    dl0Var.K0(4);
                                                    return;
                                                }
                                                if (dl0Var.i0 && dl0Var.f[5].length() == 0) {
                                                    dl0Var.K0(5);
                                                    return;
                                                }
                                                dl0Var.N0(true, true);
                                                try {
                                                    if ("stripe".equals(dl0Var.D0.native_provider)) {
                                                        String str3 = dl0Var.k0;
                                                        org.telegram.ui.Components.i9 i9Var = new org.telegram.ui.Components.i9(new v7.s(21), 11);
                                                        v7.s.O0(str3);
                                                        f fVar = new f(dl0Var, 28);
                                                        try {
                                                            v7.s.O0(str3);
                                                            new pc.a(i9Var, str3, aVar, fVar).execute(new Void[0]);
                                                        } catch (qc.c e10) {
                                                            fVar.R1(e10);
                                                        }
                                                    } else if ("smartglocal".equals(dl0Var.D0.native_provider)) {
                                                        new vk0(dl0Var, aVar).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, null, null, null);
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
            i3 = 0;
        }
        dl0Var.K0(i3);
    }

    public static void p0(dl0 dl0Var) {
        if (org.telegram.messenger.h10.i(dl0Var.currentAccount).y != null && org.telegram.messenger.h10.i(dl0Var.currentAccount).y.valid_until < ConnectionsManager.getInstance(dl0Var.currentAccount).getCurrentTime() + 60) {
            org.telegram.messenger.h10.i(dl0Var.currentAccount).y = null;
            org.telegram.messenger.h10.i(dl0Var.currentAccount).v(false);
        }
        if (org.telegram.messenger.h10.i(dl0Var.currentAccount).y != null) {
            dl0Var.F0();
            return;
        }
        if (dl0Var.f[1].length() == 0) {
            try {
                dl0Var.f[1].performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
            org.telegram.messenger.g0.G3(2.5f, dl0Var.f[1], null);
            return;
        }
        String obj = dl0Var.f[1].getText().toString();
        dl0Var.N0(true, true);
        dl0Var.J0(true);
        TL_account.getPassword getpassword = new TL_account.getPassword();
        ConnectionsManager.getInstance(dl0Var.currentAccount).sendRequest(getpassword, new y9(dl0Var, obj, getpassword, 28), (dl0Var.X0 ? 8 : 0) | 2);
    }

    public static void r0(dl0 dl0Var) {
        if (dl0Var.R0) {
            return;
        }
        dl0Var.N0(true, true);
        TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo = new TLRPC.TL_payments_validateRequestedInfo();
        dl0Var.J0 = tL_payments_validateRequestedInfo;
        TLRPC.InputInvoice inputInvoice = dl0Var.c1;
        if (inputInvoice != null) {
            tL_payments_validateRequestedInfo.invoice = inputInvoice;
        } else if (dl0Var.O0 != null) {
            TLRPC.TL_inputInvoiceMessage tL_inputInvoiceMessage = new TLRPC.TL_inputInvoiceMessage();
            tL_inputInvoiceMessage.peer = dl0Var.getMessagesController().m1(dl0Var.O0.k.peer_id);
            tL_inputInvoiceMessage.msg_id = dl0Var.O0.f1();
            dl0Var.J0.invoice = tL_inputInvoiceMessage;
        } else {
            TLRPC.TL_inputInvoiceSlug tL_inputInvoiceSlug = new TLRPC.TL_inputInvoiceSlug();
            tL_inputInvoiceSlug.slug = dl0Var.P0;
            dl0Var.J0.invoice = tL_inputInvoiceSlug;
        }
        TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo2 = dl0Var.J0;
        tL_payments_validateRequestedInfo2.save = dl0Var.U0;
        tL_payments_validateRequestedInfo2.info = new TLRPC.TL_paymentRequestedInfo();
        if (dl0Var.D0.invoice.name_requested) {
            dl0Var.J0.info.name = dl0Var.f[6].getText().toString();
            dl0Var.J0.info.flags |= 1;
        }
        if (dl0Var.D0.invoice.phone_requested) {
            dl0Var.J0.info.phone = "+" + dl0Var.f[8].getText().toString() + dl0Var.f[9].getText().toString();
            TLRPC.TL_paymentRequestedInfo tL_paymentRequestedInfo = dl0Var.J0.info;
            tL_paymentRequestedInfo.flags = tL_paymentRequestedInfo.flags | 2;
        }
        if (dl0Var.D0.invoice.email_requested) {
            dl0Var.J0.info.email = dl0Var.f[7].getText().toString().trim();
            dl0Var.J0.info.flags |= 4;
        }
        if (dl0Var.D0.invoice.shipping_address_requested) {
            dl0Var.J0.info.shipping_address = new TLRPC.TL_postAddress();
            dl0Var.J0.info.shipping_address.street_line1 = dl0Var.f[0].getText().toString();
            dl0Var.J0.info.shipping_address.street_line2 = dl0Var.f[1].getText().toString();
            dl0Var.J0.info.shipping_address.city = dl0Var.f[2].getText().toString();
            dl0Var.J0.info.shipping_address.state = dl0Var.f[3].getText().toString();
            TLRPC.TL_postAddress tL_postAddress = dl0Var.J0.info.shipping_address;
            String str = dl0Var.C0;
            if (str == null) {
                str = "";
            }
            tL_postAddress.country_iso2 = str;
            tL_postAddress.post_code = dl0Var.f[5].getText().toString();
            dl0Var.J0.info.flags |= 8;
        }
        ConnectionsManager.getInstance(dl0Var.currentAccount).sendRequest(dl0Var.J0, new xy(18, dl0Var, dl0Var.J0), (dl0Var.X0 ? 8 : 0) | 2);
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

    public final void A0(TLRPC.InputInvoice inputInvoice, TLRPC.PaymentForm paymentForm, org.telegram.messenger.zi ziVar, String str, int i3, TLRPC.TL_payments_validatedRequestedInfo tL_payments_validatedRequestedInfo, TLRPC.TL_shippingOption tL_shippingOption, Long l10, String str2, String str3, TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo, boolean z10, TLRPC.TL_inputPaymentCredentialsGooglePay tL_inputPaymentCredentialsGooglePay, org.telegram.ui.ActionBar.d2 d2Var, boolean z11) {
        if (d2Var != null) {
            this.currentAccount = d2Var.getCurrentAccount();
        }
        this.v0 = i3;
        this.s0 = d2Var;
        this.x0 = str2;
        this.K0 = tL_inputPaymentCredentialsGooglePay;
        this.F0 = tL_payments_validatedRequestedInfo;
        this.D0 = paymentForm;
        this.H0 = tL_shippingOption;
        this.I0 = l10;
        this.O0 = ziVar;
        this.P0 = str;
        this.c1 = inputInvoice;
        this.V0 = z10;
        this.X0 = z11;
        this.T0 = ("stripe".equals(paymentForm.native_provider) || "smartglocal".equals(this.D0.native_provider)) ? false : true;
        TLRPC.User a22 = getMessagesController().a2(Long.valueOf(paymentForm.bot_id));
        this.m0 = a22;
        if (a22 != null) {
            this.q0 = a22.first_name;
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
        a7.l lVar = new a7.l();
        int i3 = this.D0.invoice.test ? 3 : 1;
        if (i3 != 2 && i3 != 1 && i3 != 3) {
            Locale locale = Locale.US;
            throw new IllegalArgumentException(k2.p1.i(i3, "Invalid environment value "));
        }
        lVar.a = i3;
        this.e = new a9.j0(context, x8.p.a, new x8.o(lVar), com.google.android.gms.common.api.i.c);
        try {
            JSONObject put = new JSONObject().put("apiVersion", 2).put("apiVersionMinor", 0);
            put.put("allowedPaymentMethods", new JSONArray().put(u0()));
            empty = Optional.of(put);
        } catch (JSONException unused) {
            empty = Optional.empty();
        }
        if (empty.isPresent()) {
            String jSONObject = ((JSONObject) empty.get()).toString();
            x8.e eVar = new x8.e();
            p6.m.h(jSONObject, "isReadyToPayRequestJson cannot be null!");
            eVar.f = jSONObject;
            a9.j0 j0Var = this.e;
            j0Var.getClass();
            com.google.android.gms.common.api.internal.s b10 = com.google.android.gms.common.api.internal.t.b();
            b10.a = 23705;
            b10.c = new org.telegram.ui.Components.y00(eVar);
            j0Var.e(0, b10.a()).addOnCompleteListener(getParentActivity(), new fk0(this, 0));
        }
    }

    public final void C0() {
        if (this.f0) {
            return;
        }
        this.f0 = true;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_account.getPassword(), new zj0(this, 3), 10);
    }

    public final boolean D0(org.telegram.ui.ActionBar.q4 q4Var, Activity activity) {
        int i3 = 0;
        if (this.c1 != null) {
            if (q4Var != null) {
                ArrayList arrayList = new ArrayList(q4Var.getFragmentStack());
                int size = arrayList.size();
                while (i3 < size) {
                    Object obj = arrayList.get(i3);
                    i3++;
                    org.telegram.ui.ActionBar.d2 d2Var = (org.telegram.ui.ActionBar.d2) obj;
                    if (d2Var instanceof dl0) {
                        d2Var.removeSelfFromStack();
                    }
                }
                return true;
            }
            return false;
        }
        String str = this.m0.username;
        if (((str != null && str.equalsIgnoreCase(getMessagesController().s6) && this.P0 == null) || (this.P0 != null && getMessagesController().t6 != null && Objects.equals(this.P0, getMessagesController().t6))) && q4Var != null) {
            ArrayList arrayList2 = new ArrayList(q4Var.getFragmentStack());
            int size2 = arrayList2.size();
            int i10 = 0;
            while (i10 < size2) {
                Object obj2 = arrayList2.get(i10);
                i10++;
                org.telegram.ui.ActionBar.d2 d2Var2 = (org.telegram.ui.ActionBar.d2) obj2;
                if ((d2Var2 instanceof wm) || (d2Var2 instanceof PremiumPreviewFragment)) {
                    d2Var2.removeSelfFromStack();
                }
            }
            PremiumPreviewFragment premiumPreviewFragment = new PremiumPreviewFragment(0, null);
            premiumPreviewFragment.q0 = true;
            ((ActionBarLayout) q4Var).T(premiumPreviewFragment, !isFinishing());
            if (activity instanceof LaunchActivity) {
                try {
                    this.fragmentView.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                ((LaunchActivity) activity).y0.c(false);
            }
            return true;
        }
        return false;
    }

    public final void E0(org.telegram.ui.ActionBar.d2 d2Var) {
        org.telegram.messenger.g0.v1(this.fragmentView);
        if (d2Var instanceof dl0) {
            dl0 dl0Var = (dl0) d2Var;
            dl0Var.a1 = this.a1;
            dl0Var.Z0 = this.Z0;
            dl0Var.Y0 = this.Y0;
            dl0Var.z0 = this.z0;
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
            tL_inputInvoiceMessage.peer = getMessagesController().m1(this.O0.k.peer_id);
            tL_inputInvoiceMessage.msg_id = this.O0.f1();
            tL_payments_sendPaymentForm.invoice = tL_inputInvoiceMessage;
        } else {
            TLRPC.TL_inputInvoiceSlug tL_inputInvoiceSlug = new TLRPC.TL_inputInvoiceSlug();
            tL_inputInvoiceSlug.slug = this.P0;
            tL_payments_sendPaymentForm.invoice = tL_inputInvoiceSlug;
        }
        tL_payments_sendPaymentForm.form_id = this.D0.form_id;
        if (org.telegram.messenger.h10.i(this.currentAccount).y == null || this.z0 == null) {
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
            tL_inputPaymentCredentialsSaved.tmp_password = org.telegram.messenger.h10.i(this.currentAccount).y.tmp_password;
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
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_payments_sendPaymentForm, new xy(19, this, tL_payments_sendPaymentForm), (this.X0 ? 8 : 0) | 2);
    }

    public final void G0(boolean z10) {
        String str;
        String str2;
        int i3 = 1;
        if (!z10 && this.T.getVisibility() == 0) {
            String text = this.T.getText();
            if (text.length() == 0) {
                org.telegram.ui.Cells.l3 l3Var = this.T;
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
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(confirmpasswordemail, new zj0(this, i3), 10);
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
                    Toast.makeText(getParentActivity(), org.telegram.messenger.bd.M0(2131747454, null), 0).show();
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
        Utilities.e.c(new gi.q1(this, z10, str2, str, updatepasswordsettings));
    }

    public final void H0(TLRPC.TL_paymentRequestedInfo tL_paymentRequestedInfo) {
        TLRPC.TL_postAddress tL_postAddress = tL_paymentRequestedInfo.shipping_address;
        org.telegram.ui.Cells.x8[] x8VarArr = this.Z;
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
            x8VarArr[2].b(R.drawable.msg_payment_address, a1.g.s(sb2, ", ", str6), org.telegram.messenger.bd.M0(2131747389, null), true);
        }
        x8VarArr[2].setVisibility(tL_paymentRequestedInfo.shipping_address != null ? 0 : 8);
        String str7 = tL_paymentRequestedInfo.name;
        if (str7 != null) {
            x8VarArr[3].b(R.drawable.msg_contacts, str7, org.telegram.messenger.bd.M0(2131747420, null), true);
        }
        x8VarArr[3].setVisibility(tL_paymentRequestedInfo.name != null ? 0 : 8);
        if (tL_paymentRequestedInfo.phone != null) {
            x8VarArr[4].b(R.drawable.msg_calls, mf.b.c().b(tL_paymentRequestedInfo.phone), org.telegram.messenger.bd.M0(2131747418, null), (tL_paymentRequestedInfo.email == null && this.H0 == null) ? false : true);
        }
        x8VarArr[4].setVisibility(tL_paymentRequestedInfo.phone != null ? 0 : 8);
        String str8 = tL_paymentRequestedInfo.email;
        if (str8 != null) {
            x8VarArr[5].b(R.drawable.msg_mention, str8, org.telegram.messenger.bd.M0(2131747423, null), this.H0 != null);
        }
        x8VarArr[5].setVisibility(tL_paymentRequestedInfo.email != null ? 0 : 8);
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
        org.telegram.ui.Cells.x8 x8Var = this.Z[0];
        if (x8Var != null) {
            x8Var.setEnabled(!this.Q0);
        }
    }

    public final void K0(int i3) {
        EditTextBoldCursor editTextBoldCursor = this.f[i3];
        try {
            editTextBoldCursor.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        org.telegram.messenger.g0.G3(2.5f, editTextBoldCursor, null);
    }

    public final void L0(String str, String str2) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131747839, null), null);
        org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.a;
        s1Var.S = str;
        s1Var.U = str2;
        showDialog(s1Var);
    }

    public final void M0(Runnable runnable) {
        Integer valueOf = Integer.valueOf(R.drawable.msg_payment_card);
        org.telegram.ui.ActionBar.t2 h = org.telegram.messenger.camera.q.h(getParentActivity(), false, 1, null);
        h.P = org.telegram.messenger.bd.M0(2131747422, null);
        h.Q = true;
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
        int i3 = 0;
        while (i3 < size) {
            TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard2 = arrayList4.get(i3);
            i3++;
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
        arrayList.add(org.telegram.messenger.bd.M0(2131747421, null));
        arrayList2.add(Integer.valueOf(R.drawable.msg_addbot));
        int[] iArr = new int[arrayList2.size()];
        for (int i11 = 0; i11 < arrayList2.size(); i11++) {
            iArr[i11] = ((Integer) arrayList2.get(i11)).intValue();
        }
        CharSequence[] charSequenceArr = (CharSequence[]) arrayList.toArray(new CharSequence[0]);
        org.telegram.ui.Components.r2 r2Var = new org.telegram.ui.Components.r2(this, runnable, arrayList3, arrayList, 1);
        h.M = charSequenceArr;
        h.N = iArr;
        h.L = r2Var;
        showDialog(h);
    }

    public final void N0(boolean z10, boolean z11) {
        AnimatorSet animatorSet = this.w;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        int i3 = 1;
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
                    animatorSet2.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(textView3, (Property<TextView, Float>) property3, 0.0f), ObjectAnimator.ofFloat(this.s, (Property<org.telegram.ui.Components.aq, Float>) property, 1.0f), ObjectAnimator.ofFloat(this.s, (Property<org.telegram.ui.Components.aq, Float>) property2, 1.0f), ObjectAnimator.ofFloat(this.s, (Property<org.telegram.ui.Components.aq, Float>) property3, 1.0f));
                } else {
                    this.V.setVisibility(0);
                    this.X.setEnabled(true);
                    AnimatorSet animatorSet3 = this.w;
                    org.telegram.ui.Components.aq aqVar = this.s;
                    Property property4 = View.SCALE_X;
                    ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(aqVar, (Property<org.telegram.ui.Components.aq, Float>) property4, 0.1f);
                    org.telegram.ui.Components.aq aqVar2 = this.s;
                    Property property5 = View.SCALE_Y;
                    ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(aqVar2, (Property<org.telegram.ui.Components.aq, Float>) property5, 0.1f);
                    org.telegram.ui.Components.aq aqVar3 = this.s;
                    Property property6 = View.ALPHA;
                    animatorSet3.playTogether(ofFloat3, ofFloat4, ObjectAnimator.ofFloat(aqVar3, (Property<org.telegram.ui.Components.aq, Float>) property6, 0.0f), ObjectAnimator.ofFloat(this.V, (Property<TextView, Float>) property4, 1.0f), ObjectAnimator.ofFloat(this.V, (Property<TextView, Float>) property5, 1.0f), ObjectAnimator.ofFloat(this.V, (Property<TextView, Float>) property6, 1.0f));
                }
                this.w.addListener(new wk0(this, z11, i3));
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
            animatorSet5.playTogether(ofFloat5, ofFloat6, ObjectAnimator.ofFloat(contentView3, (Property<View, Float>) property9, 0.0f), ObjectAnimator.ofFloat(this.r, (Property<org.telegram.ui.Components.aq, Float>) property7, 1.0f), ObjectAnimator.ofFloat(this.r, (Property<org.telegram.ui.Components.aq, Float>) property8, 1.0f), ObjectAnimator.ofFloat(this.r, (Property<org.telegram.ui.Components.aq, Float>) property9, 1.0f));
        } else if (this.x != null) {
            animatorSet4.playTogether(ObjectAnimator.ofFloat(this.r, (Property<org.telegram.ui.Components.aq, Float>) View.SCALE_X, 0.1f), ObjectAnimator.ofFloat(this.r, (Property<org.telegram.ui.Components.aq, Float>) View.SCALE_Y, 0.1f), ObjectAnimator.ofFloat(this.r, (Property<org.telegram.ui.Components.aq, Float>) View.ALPHA, 0.0f));
        } else {
            this.n.getContentView().setVisibility(0);
            this.n.setEnabled(true);
            AnimatorSet animatorSet6 = this.w;
            org.telegram.ui.Components.aq aqVar4 = this.r;
            Property property10 = View.SCALE_X;
            ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(aqVar4, (Property<org.telegram.ui.Components.aq, Float>) property10, 0.1f);
            org.telegram.ui.Components.aq aqVar5 = this.r;
            Property property11 = View.SCALE_Y;
            ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(aqVar5, (Property<org.telegram.ui.Components.aq, Float>) property11, 0.1f);
            org.telegram.ui.Components.aq aqVar6 = this.r;
            Property property12 = View.ALPHA;
            animatorSet6.playTogether(ofFloat7, ofFloat8, ObjectAnimator.ofFloat(aqVar6, (Property<org.telegram.ui.Components.aq, Float>) property12, 0.0f));
            if (!isFinishing()) {
                this.w.playTogether(ObjectAnimator.ofFloat(this.n.getContentView(), (Property<View, Float>) property10, 1.0f), ObjectAnimator.ofFloat(this.n.getContentView(), (Property<View, Float>) property11, 1.0f), ObjectAnimator.ofFloat(this.n.getContentView(), (Property<View, Float>) property12, 1.0f));
            }
        }
        this.w.addListener(new wk0(this, z11, i10));
        this.w.setDuration(150L);
        this.w.start();
    }

    public final void O0(String str) {
        if (getParentActivity() == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        String M0 = org.telegram.messenger.bd.M0(2131747362, null);
        org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.a;
        s1Var.S = M0;
        s1Var.U = org.telegram.messenger.g0.X2(org.telegram.messenger.bd.a0("PaymentTransactionMessage2", null, 2131747363, str, this.q0, this.r0));
        alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131751771, null), new fk0(this, 5));
        alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, null), null);
        showDialog(s1Var);
    }

    public final void P0() {
        if (this.v0 == 6) {
            org.telegram.ui.Cells.y8[] y8VarArr = this.N;
            if (y8VarArr[2] == null) {
                return;
            }
            int i3 = 0;
            this.n.setVisibility(0);
            TL_account.Password password = this.b0;
            ArrayList arrayList = this.K;
            org.telegram.ui.Cells.n4[] n4VarArr = this.J;
            org.telegram.ui.Cells.v9[] v9VarArr = this.O;
            if (password == null) {
                N0(true, true);
                y8VarArr[2].setVisibility(8);
                v9VarArr[0].setVisibility(8);
                v9VarArr[1].setVisibility(8);
                this.T.setVisibility(8);
                n4VarArr[0].setVisibility(8);
                n4VarArr[1].setVisibility(8);
                y8VarArr[0].setVisibility(8);
                for (int i10 = 0; i10 < 3; i10++) {
                    ((View) this.f[i10].getParent()).setVisibility(8);
                }
                while (i3 < arrayList.size()) {
                    ((View) arrayList.get(i3)).setVisibility(8);
                    i3++;
                }
                return;
            }
            N0(true, false);
            if (!this.c0) {
                y8VarArr[2].setVisibility(8);
                v9VarArr[0].setVisibility(8);
                v9VarArr[1].setVisibility(8);
                y8VarArr[1].setText(org.telegram.messenger.bd.M0(2131747399, null));
                this.T.setVisibility(8);
                n4VarArr[0].setVisibility(0);
                n4VarArr[1].setVisibility(0);
                y8VarArr[0].setVisibility(0);
                for (int i11 = 0; i11 < 3; i11++) {
                    ((View) this.f[i11].getParent()).setVisibility(0);
                }
                for (int i12 = 0; i12 < arrayList.size(); i12++) {
                    ((View) arrayList.get(i12)).setVisibility(0);
                }
                return;
            }
            org.telegram.ui.Cells.y8 y8Var = y8VarArr[2];
            String str = this.b0.email_unconfirmed_pattern;
            if (str == null) {
                str = "";
            }
            y8Var.setText(org.telegram.messenger.bd.a0("EmailPasswordConfirmText2", null, 2131751200, str));
            y8VarArr[2].setVisibility(0);
            v9VarArr[0].setVisibility(0);
            v9VarArr[1].setVisibility(0);
            this.T.setVisibility(0);
            y8VarArr[1].setText("");
            n4VarArr[0].setVisibility(8);
            n4VarArr[1].setVisibility(8);
            y8VarArr[0].setVisibility(8);
            for (int i13 = 0; i13 < 3; i13++) {
                ((View) this.f[i13].getParent()).setVisibility(8);
            }
            while (i3 < arrayList.size()) {
                ((View) arrayList.get(i3)).setVisibility(8);
                i3++;
            }
        }
    }

    public final void Q0() {
        org.telegram.ui.Cells.y8[] y8VarArr = this.N;
        if (y8VarArr[0] != null) {
            org.telegram.ui.Cells.x6[] x6VarArr = this.L;
            if (x6VarArr[2] == null) {
                return;
            }
            TLRPC.PaymentForm paymentForm = this.D0;
            if ((!paymentForm.password_missing && !paymentForm.can_save_credentials) || (this.x != null && this.A0)) {
                this.M.setVisibility(8);
                y8VarArr[0].setVisibility(8);
                org.telegram.ui.Cells.x6 x6Var = x6VarArr[2];
                org.telegram.ui.ActionBar.r6.a0(x6Var, x6Var.getContext(), R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.k6.b7);
                return;
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(org.telegram.messenger.bd.M0(2131747429, null));
            if (this.D0.password_missing) {
                C0();
                spannableStringBuilder.append((CharSequence) "\n");
                int length = spannableStringBuilder.length();
                String M0 = org.telegram.messenger.bd.M0(2131747428, null);
                int indexOf = M0.indexOf(42);
                int lastIndexOf = M0.lastIndexOf(42);
                spannableStringBuilder.append((CharSequence) M0);
                if (indexOf != -1 && lastIndexOf != -1) {
                    int i3 = indexOf + length;
                    int i10 = lastIndexOf + length;
                    y8VarArr[0].getTextView().setMovementMethod(new org.telegram.messenger.c0(false));
                    spannableStringBuilder.replace(i10, i10 + 1, (CharSequence) "");
                    spannableStringBuilder.replace(i3, i3 + 1, (CharSequence) "");
                    spannableStringBuilder.setSpan(new al0(this), i3, i10 - 1, 33);
                }
            }
            this.M.setEnabled(true);
            y8VarArr[0].setText(spannableStringBuilder);
            this.M.setVisibility(0);
            y8VarArr[0].setVisibility(0);
            org.telegram.ui.Cells.x6 x6Var2 = x6VarArr[2];
            org.telegram.ui.ActionBar.r6.a0(x6Var2, x6Var2.getContext(), R.drawable.greydivider, org.telegram.ui.ActionBar.k6.b7);
        }
    }

    public final void R0() {
        this.S0[0] = y0(this.u0);
        this.S.a(org.telegram.messenger.bd.M0(2131747361, null), this.S0[0], true);
        TextView textView = this.V;
        if (textView != null) {
            textView.setText(org.telegram.messenger.bd.a0("PaymentCheckoutPay", null, 2131747419, this.S0[0]));
        }
        if (this.t0 != null) {
            int themedColor = getThemedColor(org.telegram.ui.ActionBar.k6.Si);
            int childCount = this.t0.getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                TextView textView2 = (TextView) this.t0.getChildAt(i3);
                if (textView2.getTag().equals(this.I0)) {
                    org.telegram.ui.ActionBar.k6.C1(themedColor, textView2.getBackground());
                    org.telegram.ui.ActionBar.r6.V(textView2, org.telegram.ui.ActionBar.k6.Ti, this.Z0);
                } else {
                    org.telegram.ui.ActionBar.k6.C1(536870911 & themedColor, textView2.getBackground());
                    org.telegram.ui.ActionBar.r6.V(textView2, org.telegram.ui.ActionBar.k6.Z8, this.Z0);
                }
                textView2.invalidate();
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.d2
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
    /* JADX WARN: Code restructure failed: missing block: B:481:0x1029, code lost:
    
        if (r12.email_requested == false) goto L465;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0798  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x07b2  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x07c7  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x07de  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0819  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0878  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0908  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0832  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x07eb  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x07a8  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x0bb6  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x0c1b  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x0c4b  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x0c79  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x0d42  */
    /* JADX WARN: Removed duplicated region for block: B:352:0x0d62  */
    /* JADX WARN: Removed duplicated region for block: B:353:0x0c96  */
    /* JADX WARN: Removed duplicated region for block: B:362:0x0c4d  */
    /* JADX WARN: Removed duplicated region for block: B:363:0x0c28  */
    /* JADX WARN: Removed duplicated region for block: B:370:0x0c0b  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:618:0x1a06  */
    /* JADX WARN: Removed duplicated region for block: B:622:0x1a1f  */
    /* JADX WARN: Removed duplicated region for block: B:631:0x1a5b  */
    /* JADX WARN: Removed duplicated region for block: B:641:0x1aa3  */
    /* JADX WARN: Removed duplicated region for block: B:652:0x1c6b  */
    /* JADX WARN: Removed duplicated region for block: B:700:0x1f0a  */
    /* JADX WARN: Removed duplicated region for block: B:702:0x1abc  */
    /* JADX WARN: Removed duplicated region for block: B:705:0x1ae3  */
    /* JADX WARN: Removed duplicated region for block: B:711:0x1b3d  */
    /* JADX WARN: Removed duplicated region for block: B:717:0x1b97  */
    /* JADX WARN: Removed duplicated region for block: B:723:0x1bf0  */
    /* JADX WARN: Removed duplicated region for block: B:729:0x1c2e  */
    /* JADX WARN: Removed duplicated region for block: B:731:0x1abf  */
    /* JADX WARN: Removed duplicated region for block: B:732:0x1aa5  */
    /* JADX WARN: Removed duplicated region for block: B:738:0x1a9b  */
    /* JADX WARN: Type inference failed for: r0v115, types: [org.telegram.ui.Cells.m6] */
    /* JADX WARN: Type inference failed for: r0v148, types: [android.view.View, android.view.ViewGroup, android.widget.FrameLayout] */
    /* JADX WARN: Type inference failed for: r0v24, types: [org.telegram.ui.Cells.j5] */
    /* JADX WARN: Type inference failed for: r2v296, types: [java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r3v202, types: [android.view.View, android.view.ViewGroup, android.widget.FrameLayout] */
    /* JADX WARN: Type inference failed for: r3v206, types: [android.view.ViewGroup] */
    /* JADX WARN: Type inference failed for: r3v207, types: [android.view.ViewGroup] */
    /* JADX WARN: Type inference failed for: r3v243, types: [android.view.View, android.view.ViewGroup, android.widget.LinearLayout] */
    /* JADX WARN: Type inference failed for: r3v55, types: [android.text.SpannableStringBuilder] */
    /* JADX WARN: Type inference failed for: r3v69, types: [android.view.ViewGroup, android.widget.LinearLayout] */
    /* JADX WARN: Type inference failed for: r7v223, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v224, types: [android.view.ViewGroup, android.widget.LinearLayout] */
    /* JADX WARN: Type inference failed for: r7v69, types: [android.view.ViewGroup, android.widget.LinearLayout] */
    @Override // org.telegram.ui.ActionBar.d2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View createView(Context context) {
        String str;
        int i3;
        int i10;
        TLRPC.User user;
        int i11;
        String str2;
        TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo;
        TLRPC.TL_paymentRequestedInfo tL_paymentRequestedInfo;
        int i12;
        char c2;
        TLRPC.PaymentForm paymentForm;
        SpannableStringBuilder spannableStringBuilder;
        TLRPC.PaymentForm paymentForm2;
        TLRPC.TL_paymentRequestedInfo tL_paymentRequestedInfo2;
        boolean z10;
        int i13;
        int i14;
        int i15;
        int i16;
        TLRPC.TL_invoice tL_invoice;
        org.telegram.ui.Cells.x6 x6Var;
        TLRPC.TL_paymentRequestedInfo tL_paymentRequestedInfo3;
        TLRPC.TL_paymentRequestedInfo tL_paymentRequestedInfo4;
        String str3;
        String str4;
        TelephonyManager telephonyManager;
        ?? frameLayout;
        int i17;
        int i18;
        TLRPC.TL_postAddress tL_postAddress;
        TLRPC.TL_postAddress tL_postAddress2;
        TLRPC.TL_postAddress tL_postAddress3;
        TLRPC.TL_postAddress tL_postAddress4;
        TLRPC.TL_postAddress tL_postAddress5;
        TLRPC.TL_postAddress tL_postAddress6;
        String str5;
        String str6;
        BufferedReader bufferedReader;
        switch (this.v0) {
            case 0:
                this.actionBar.setTitle(org.telegram.messenger.bd.L0(2131747383));
                break;
            case 1:
                this.actionBar.setTitle(org.telegram.messenger.bd.L0(2131747382));
                break;
            case 2:
            case 3:
                TLRPC.TL_paymentFormMethod tL_paymentFormMethod = this.G0;
                if (tL_paymentFormMethod != null && !TextUtils.isEmpty(tL_paymentFormMethod.title)) {
                    this.actionBar.setTitle(this.G0.title);
                    break;
                } else {
                    this.actionBar.setTitle(org.telegram.messenger.bd.L0(2131747433));
                    break;
                }
                break;
            case 4:
                if (this.D0.invoice.test) {
                    this.actionBar.setTitle("Test " + org.telegram.messenger.bd.L0(2131747426));
                    break;
                } else {
                    this.actionBar.setTitle(org.telegram.messenger.bd.L0(2131747426));
                    break;
                }
            case 5:
                if (this.D0.invoice.test) {
                    this.actionBar.setTitle("Test " + org.telegram.messenger.bd.L0(2131747390));
                    break;
                } else {
                    this.actionBar.setTitle(org.telegram.messenger.bd.L0(2131747390));
                    break;
                }
            case 6:
                this.actionBar.setTitle(org.telegram.messenger.bd.L0(2131747401));
                break;
        }
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new rk0(this));
        org.telegram.ui.ActionBar.x q10 = this.actionBar.q();
        int i19 = this.v0;
        int i20 = 6;
        int i21 = 3;
        if (i19 == 0 || i19 == 1 || i19 == 2 || i19 == 3 || i19 == 4 || i19 == 6) {
            this.n = q10.h(1, R.drawable.ic_ab_done, org.telegram.messenger.g0.L(56.0f), org.telegram.messenger.bd.L0(2131751355));
            org.telegram.ui.Components.aq aqVar = new org.telegram.ui.Components.aq(context, 1);
            this.r = aqVar;
            aqVar.setAlpha(0.0f);
            this.r.setScaleX(0.1f);
            this.r.setScaleY(0.1f);
            this.r.setVisibility(4);
            this.n.addView(this.r, b8.mf.c(-1.0f, -1));
        }
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.fragmentView = frameLayout2;
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.a7, frameLayout2, getResourceProvider());
        ScrollView scrollView = new ScrollView(context);
        this.F = scrollView;
        scrollView.setFillViewport(true);
        org.telegram.messenger.g0.z3(this.F, getThemedColor(org.telegram.ui.ActionBar.k6.s8));
        frameLayout2.addView(this.F, b8.mf.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, this.v0 == 4 ? 48.0f : 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.R = linearLayout;
        linearLayout.setOrientation(1);
        int i22 = 0;
        this.R.setClipChildren(false);
        this.F.addView(this.R, new FrameLayout.LayoutParams(-1, -2));
        int i23 = this.v0;
        int i24 = 16;
        int i25 = 2;
        int i26 = 10;
        String str7 = "";
        int i27 = 1;
        if (i23 == 0) {
            ?? hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            try {
                bufferedReader = new BufferedReader(new InputStreamReader(context.getResources().getAssets().open("countries.txt")));
            } catch (Exception e10) {
                e = e10;
                i14 = i22;
            }
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine != null) {
                    String[] split = readLine.split(";");
                    this.a.add(i22, split[2]);
                    i14 = i22;
                    try {
                        this.b.put(split[2], split[i14]);
                        this.c.put(split[i14], split[2]);
                        hashMap2.put(split[1], split[2]);
                        if (split.length > 3) {
                            this.d.put(split[i14], split[3]);
                        }
                        hashMap.put(split[1], split[2]);
                        i22 = i14;
                    } catch (Exception e11) {
                        e = e11;
                    }
                } else {
                    i14 = i22;
                    bufferedReader.close();
                    Collections.sort(this.a, new org.telegram.ui.Components.d80(i24));
                    this.f = new EditTextBoldCursor[10];
                    i15 = i14;
                    while (i15 < i26) {
                        if (i15 == 0) {
                            this.J[i14] = new org.telegram.ui.Cells.n4(context, this.Z0);
                            org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d6, this.J[i14], getResourceProvider());
                            this.J[i14].setText(org.telegram.messenger.bd.L0(2131747389));
                            this.R.addView(this.J[i14], b8.mf.o(-1, -2));
                        } else if (i15 == i20) {
                            this.L[i14] = new org.telegram.ui.Cells.x6(context, (Object) null);
                            this.R.addView(this.L[i14], b8.mf.o(-1, -2));
                            this.J[i27] = new org.telegram.ui.Cells.n4(context, this.Z0);
                            org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d6, this.J[i27], getResourceProvider());
                            this.J[i27].setText(org.telegram.messenger.bd.L0(2131747379));
                            this.R.addView(this.J[i27], b8.mf.o(-1, -2));
                        }
                        if (i15 == 8) {
                            frameLayout = new LinearLayout(context);
                            ?? r72 = i14;
                            frameLayout.setClipChildren(r72);
                            frameLayout.setOrientation(r72 == true ? 1 : 0);
                            this.R.addView(frameLayout, b8.mf.o(-1, 50));
                            org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d6, frameLayout, getResourceProvider());
                        } else if (i15 == 9) {
                            frameLayout = (ViewGroup) this.f[8].getParent();
                        } else {
                            frameLayout = new FrameLayout(context);
                            frameLayout.setClipChildren(false);
                            this.R.addView(frameLayout, b8.mf.o(-1, 50));
                            int i28 = org.telegram.ui.ActionBar.k6.d6;
                            org.telegram.ui.ActionBar.r6.i(i28, frameLayout, getResourceProvider());
                            int i29 = i15 != 5 ? i27 : 0;
                            if (i29 != 0) {
                                if (i15 != 7 || this.D0.invoice.phone_requested) {
                                    if (i15 == i20) {
                                        TLRPC.TL_invoice tL_invoice2 = this.D0.invoice;
                                        if (!tL_invoice2.phone_requested) {
                                        }
                                    }
                                }
                                i29 = 0;
                            }
                            if (i29 != 0) {
                                org.telegram.ui.Components.sm smVar = new org.telegram.ui.Components.sm(context, 18);
                                org.telegram.ui.ActionBar.r6.i(i28, smVar, getResourceProvider());
                                this.K.add(smVar);
                                frameLayout.addView(smVar, new FrameLayout.LayoutParams(-1, i27, 83));
                            }
                        }
                        if (i15 == 9) {
                            this.f[i15] = new org.telegram.ui.Components.r20(context);
                        } else {
                            this.f[i15] = new EditTextBoldCursor(context);
                        }
                        this.f[i15].setTag(Integer.valueOf(i15));
                        this.f[i15].setTextSize(1, 16.0f);
                        org.telegram.ui.ActionBar.r6.E(this.f[i15], org.telegram.ui.ActionBar.k6.H6, getResourceProvider());
                        EditTextBoldCursor editTextBoldCursor = this.f[i15];
                        int i30 = org.telegram.ui.ActionBar.k6.G6;
                        org.telegram.ui.ActionBar.r6.V(editTextBoldCursor, i30, getResourceProvider());
                        this.f[i15].setBackgroundDrawable(null);
                        org.telegram.ui.ActionBar.r6.w(this.f[i15], i30, getResourceProvider());
                        this.f[i15].setCursorSize(org.telegram.messenger.g0.L(20.0f));
                        this.f[i15].setCursorWidth(1.5f);
                        if (i15 == 4) {
                            final int i31 = 0;
                            this.f[i15].setOnTouchListener(new View.OnTouchListener(this) { // from class: org.telegram.ui.bk0
                                public final /* synthetic */ dl0 b;

                                {
                                    this.b = this;
                                }

                                @Override // android.view.View.OnTouchListener
                                public final boolean onTouch(View view, MotionEvent motionEvent) {
                                    switch (i31) {
                                        case 0:
                                            dl0 dl0Var = this.b;
                                            if (dl0Var.getParentActivity() != null) {
                                                if (motionEvent.getAction() == 1) {
                                                    os osVar = new os(null, false);
                                                    osVar.n = true;
                                                    osVar.r = new fk0(dl0Var, 4);
                                                    dl0Var.presentFragment(osVar);
                                                }
                                                break;
                                            }
                                            break;
                                        default:
                                            dl0 dl0Var2 = this.b;
                                            if (dl0Var2.getParentActivity() != null) {
                                                if (motionEvent.getAction() == 1) {
                                                    os osVar2 = new os(null, false);
                                                    osVar2.n = true;
                                                    osVar2.r = new fk0(dl0Var2, 2);
                                                    dl0Var2.presentFragment(osVar2);
                                                }
                                                break;
                                            }
                                            break;
                                    }
                                    return true;
                                }
                            });
                            this.f[i15].setInputType(0);
                        }
                        if (i15 == 9 || i15 == 8) {
                            this.f[i15].setInputType(i21);
                        } else if (i15 == 7) {
                            this.f[i15].setInputType(1);
                        } else {
                            this.f[i15].setInputType(16385);
                        }
                        this.f[i15].setImeOptions(268435461);
                        switch (i15) {
                            case 0:
                                this.f[i15].setHint(org.telegram.messenger.bd.L0(2131747388));
                                TLRPC.TL_paymentRequestedInfo tL_paymentRequestedInfo5 = this.D0.saved_info;
                                if (tL_paymentRequestedInfo5 != null && (tL_postAddress = tL_paymentRequestedInfo5.shipping_address) != null) {
                                    this.f[i15].setText(tL_postAddress.street_line1);
                                    break;
                                }
                                break;
                            case 1:
                                this.f[i15].setHint(org.telegram.messenger.bd.L0(2131747387));
                                TLRPC.TL_paymentRequestedInfo tL_paymentRequestedInfo6 = this.D0.saved_info;
                                if (tL_paymentRequestedInfo6 != null && (tL_postAddress2 = tL_paymentRequestedInfo6.shipping_address) != null) {
                                    this.f[i15].setText(tL_postAddress2.street_line2);
                                    break;
                                }
                                break;
                            case 2:
                                this.f[i15].setHint(org.telegram.messenger.bd.L0(2131747386));
                                TLRPC.TL_paymentRequestedInfo tL_paymentRequestedInfo7 = this.D0.saved_info;
                                if (tL_paymentRequestedInfo7 != null && (tL_postAddress3 = tL_paymentRequestedInfo7.shipping_address) != null) {
                                    this.f[i15].setText(tL_postAddress3.city);
                                    break;
                                }
                                break;
                            case 3:
                                this.f[i15].setHint(org.telegram.messenger.bd.L0(2131747376));
                                TLRPC.TL_paymentRequestedInfo tL_paymentRequestedInfo8 = this.D0.saved_info;
                                if (tL_paymentRequestedInfo8 != null && (tL_postAddress4 = tL_paymentRequestedInfo8.shipping_address) != null) {
                                    this.f[i15].setText(tL_postAddress4.state);
                                    break;
                                }
                                break;
                            case 4:
                                this.f[i15].setHint(org.telegram.messenger.bd.L0(2131747385));
                                TLRPC.TL_paymentRequestedInfo tL_paymentRequestedInfo9 = this.D0.saved_info;
                                if (tL_paymentRequestedInfo9 != null && (tL_postAddress5 = tL_paymentRequestedInfo9.shipping_address) != null) {
                                    String str8 = (String) hashMap2.get(tL_postAddress5.country_iso2);
                                    String str9 = this.D0.saved_info.shipping_address.country_iso2;
                                    this.C0 = str9;
                                    EditTextBoldCursor editTextBoldCursor2 = this.f[i15];
                                    if (str8 == null) {
                                        str8 = str9;
                                    }
                                    editTextBoldCursor2.setText(str8);
                                    break;
                                }
                                break;
                            case 5:
                                this.f[i15].setHint(org.telegram.messenger.bd.L0(2131747375));
                                TLRPC.TL_paymentRequestedInfo tL_paymentRequestedInfo10 = this.D0.saved_info;
                                if (tL_paymentRequestedInfo10 != null && (tL_postAddress6 = tL_paymentRequestedInfo10.shipping_address) != null) {
                                    this.f[i15].setText(tL_postAddress6.post_code);
                                    break;
                                }
                                break;
                            case 6:
                                this.f[i15].setHint(org.telegram.messenger.bd.L0(2131747381));
                                TLRPC.TL_paymentRequestedInfo tL_paymentRequestedInfo11 = this.D0.saved_info;
                                if (tL_paymentRequestedInfo11 != null && (str5 = tL_paymentRequestedInfo11.name) != null) {
                                    this.f[i15].setText(str5);
                                    break;
                                }
                                break;
                            case 7:
                                this.f[i15].setHint(org.telegram.messenger.bd.L0(2131747384));
                                TLRPC.TL_paymentRequestedInfo tL_paymentRequestedInfo12 = this.D0.saved_info;
                                if (tL_paymentRequestedInfo12 != null && (str6 = tL_paymentRequestedInfo12.email) != null) {
                                    this.f[i15].setText(str6);
                                    break;
                                }
                                break;
                        }
                        EditTextBoldCursor editTextBoldCursor3 = this.f[i15];
                        editTextBoldCursor3.setSelection(editTextBoldCursor3.length());
                        if (i15 == 8) {
                            TextView textView = new TextView(context);
                            this.I = textView;
                            textView.setText("+");
                            org.telegram.ui.ActionBar.r6.V(this.I, i30, getResourceProvider());
                            this.I.setTextSize(1, 16.0f);
                            frameLayout.addView(this.I, b8.mf.k(21.0f, 12.0f, 0.0f, 6.0f, -2, -2));
                            this.f[i15].setPadding(org.telegram.messenger.g0.L(10.0f), 0, 0, 0);
                            this.f[i15].setGravity(19);
                            this.f[i15].setFilters(new InputFilter[]{new InputFilter.LengthFilter(5)});
                            frameLayout.addView(this.f[i15], b8.mf.k(0.0f, 12.0f, 21.0f, 6.0f, 55, -2));
                            this.f[i15].addTextChangedListener(new sk0(this, 1));
                        } else if (i15 == 9) {
                            this.f[i15].setPadding(0, 0, 0, 0);
                            this.f[i15].setGravity(19);
                            frameLayout.addView(this.f[i15], b8.mf.k(0.0f, 12.0f, 21.0f, 6.0f, -1, -2));
                            this.f[i15].addTextChangedListener(new wq(this, 4));
                        } else {
                            this.f[i15].setPadding(0, 0, 0, org.telegram.messenger.g0.L(6.0f));
                            this.f[i15].setGravity(org.telegram.messenger.bd.a0 ? 5 : i21);
                            frameLayout.addView(this.f[i15], b8.mf.d(-1, -2.0f, 51, 21.0f, 12.0f, 21.0f, 6.0f));
                        }
                        final int i32 = i25;
                        this.f[i15].setOnEditorActionListener(new TextView.OnEditorActionListener(this) { // from class: org.telegram.ui.dk0
                            public final /* synthetic */ dl0 b;

                            {
                                this.b = this;
                            }

                            @Override // android.widget.TextView.OnEditorActionListener
                            public final boolean onEditorAction(TextView textView2, int i33, KeyEvent keyEvent) {
                                EditTextBoldCursor[] editTextBoldCursorArr;
                                switch (i32) {
                                    case 0:
                                        dl0 dl0Var = this.b;
                                        if (i33 != 6) {
                                            dl0Var.getClass();
                                            break;
                                        } else {
                                            dl0Var.G0(false);
                                            break;
                                        }
                                    case 1:
                                        dl0 dl0Var2 = this.b;
                                        if (i33 != 6) {
                                            dl0Var2.getClass();
                                            if (i33 == 5) {
                                                int intValue = ((Integer) textView2.getTag()).intValue();
                                                if (intValue != 0) {
                                                    if (intValue == 1) {
                                                        dl0Var2.f[2].requestFocus();
                                                        break;
                                                    }
                                                } else {
                                                    dl0Var2.f[1].requestFocus();
                                                    break;
                                                }
                                            }
                                        } else {
                                            dl0Var2.n.performClick();
                                            break;
                                        }
                                        break;
                                    case 2:
                                        dl0 dl0Var3 = this.b;
                                        dl0Var3.getClass();
                                        if (i33 != 5) {
                                            if (i33 == 6) {
                                                dl0Var3.n.performClick();
                                                break;
                                            }
                                        } else {
                                            int intValue2 = ((Integer) textView2.getTag()).intValue();
                                            while (true) {
                                                intValue2++;
                                                EditTextBoldCursor[] editTextBoldCursorArr2 = dl0Var3.f;
                                                if (intValue2 >= editTextBoldCursorArr2.length) {
                                                    break;
                                                } else if (intValue2 != 4 && ((View) editTextBoldCursorArr2[intValue2].getParent()).getVisibility() == 0) {
                                                    dl0Var3.f[intValue2].requestFocus();
                                                    break;
                                                }
                                            }
                                        }
                                        break;
                                    case 3:
                                        dl0 dl0Var4 = this.b;
                                        dl0Var4.getClass();
                                        if (i33 != 5) {
                                            if (i33 == 6) {
                                                dl0Var4.n.performClick();
                                                break;
                                            }
                                        } else {
                                            int intValue3 = ((Integer) textView2.getTag()).intValue();
                                            do {
                                                int i34 = intValue3 + 1;
                                                editTextBoldCursorArr = dl0Var4.f;
                                                if (i34 >= editTextBoldCursorArr.length) {
                                                    break;
                                                } else {
                                                    intValue3 = i34 == 4 ? intValue3 + 2 : i34;
                                                }
                                            } while (((View) editTextBoldCursorArr[intValue3].getParent()).getVisibility() != 0);
                                            dl0Var4.f[intValue3].requestFocus();
                                            break;
                                        }
                                        break;
                                    default:
                                        dl0 dl0Var5 = this.b;
                                        if (i33 != 6) {
                                            dl0Var5.getClass();
                                            break;
                                        } else {
                                            dl0Var5.n.performClick();
                                            break;
                                        }
                                }
                                return false;
                            }
                        });
                        if (i15 == 9) {
                            TLRPC.TL_invoice tL_invoice3 = this.D0.invoice;
                            if (tL_invoice3.email_to_provider || tL_invoice3.phone_to_provider) {
                                TLRPC.User user2 = null;
                                int i33 = 0;
                                while (i33 < this.D0.users.size()) {
                                    TLRPC.User user3 = this.D0.users.get(i33);
                                    int i34 = i21;
                                    int i35 = i20;
                                    if (user3.id == this.D0.provider_id) {
                                        user2 = user3;
                                    }
                                    i33++;
                                    i21 = i34;
                                    i20 = i35;
                                }
                                i17 = i20;
                                i18 = i21;
                                String n4 = user2 != null ? org.telegram.messenger.g5.n(user2.first_name, user2.last_name) : "";
                                this.N[1] = new org.telegram.ui.Cells.y8(context, this.Z0);
                                org.telegram.ui.ActionBar.r6.a0(this.N[1], context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.k6.b7);
                                this.R.addView(this.N[1], b8.mf.o(-1, -2));
                                TLRPC.TL_invoice tL_invoice4 = this.D0.invoice;
                                boolean z11 = tL_invoice4.email_to_provider;
                                if (z11 && tL_invoice4.phone_to_provider) {
                                    this.N[1].setText(org.telegram.messenger.bd.Y(2131747393, "PaymentPhoneEmailToProvider", n4));
                                } else if (z11) {
                                    this.N[1].setText(org.telegram.messenger.bd.Y(2131747411, "PaymentEmailToProvider", n4));
                                } else {
                                    this.N[1].setText(org.telegram.messenger.bd.Y(2131747392, "PaymentPhoneToProvider", n4));
                                }
                            } else {
                                this.L[1] = new org.telegram.ui.Cells.x6(context, (Object) null);
                                this.R.addView(this.L[1], b8.mf.o(-1, -2));
                                i17 = i20;
                                i18 = i21;
                            }
                            org.telegram.ui.Cells.q8 q8Var = new org.telegram.ui.Cells.q8(context, this.Z0);
                            this.M = q8Var;
                            org.telegram.ui.ActionBar.r6.S(q8Var, org.telegram.ui.ActionBar.k6.N0(true), org.telegram.ui.ActionBar.r6.N(org.telegram.ui.ActionBar.k6.d6), org.telegram.ui.ActionBar.r6.N(org.telegram.ui.ActionBar.k6.i6));
                            this.M.f(org.telegram.messenger.bd.L0(2131747378), this.U0, false);
                            this.R.addView(this.M, b8.mf.o(-1, -2));
                            this.M.setOnClickListener(new ak0(this, 9));
                            this.N[0] = new org.telegram.ui.Cells.y8(context, this.Z0);
                            org.telegram.ui.ActionBar.r6.a0(this.N[0], context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.k6.b7);
                            this.N[0].setText(org.telegram.messenger.bd.L0(2131747377));
                            this.R.addView(this.N[0], b8.mf.o(-1, -2));
                        } else {
                            i17 = i20;
                            i18 = i21;
                        }
                        i15++;
                        i21 = i18;
                        i20 = i17;
                        i26 = 10;
                        i25 = 2;
                        i27 = 1;
                        i14 = 0;
                    }
                    int i36 = i20;
                    int i37 = i21;
                    if (this.D0.invoice.name_requested) {
                        i16 = 8;
                        ((ViewGroup) this.f[i36].getParent()).setVisibility(8);
                    } else {
                        i16 = 8;
                    }
                    if (!this.D0.invoice.phone_requested) {
                        ((ViewGroup) this.f[i16].getParent()).setVisibility(i16);
                    }
                    if (!this.D0.invoice.email_requested) {
                        ((ViewGroup) this.f[7].getParent()).setVisibility(i16);
                    }
                    tL_invoice = this.D0.invoice;
                    if (!tL_invoice.phone_requested) {
                        this.f[9].setImeOptions(268435462);
                    } else if (tL_invoice.email_requested) {
                        this.f[7].setImeOptions(268435462);
                    } else if (tL_invoice.name_requested) {
                        this.f[i36].setImeOptions(268435462);
                    } else {
                        this.f[5].setImeOptions(268435462);
                    }
                    x6Var = this.L[1];
                    if (x6Var == null) {
                        TLRPC.TL_invoice tL_invoice5 = this.D0.invoice;
                        x6Var.setVisibility((tL_invoice5.name_requested || tL_invoice5.phone_requested || tL_invoice5.email_requested) ? 0 : 8);
                    } else {
                        org.telegram.ui.Cells.y8 y8Var = this.N[1];
                        if (y8Var != null) {
                            TLRPC.TL_invoice tL_invoice6 = this.D0.invoice;
                            y8Var.setVisibility((tL_invoice6.name_requested || tL_invoice6.phone_requested || tL_invoice6.email_requested) ? 0 : 8);
                        }
                    }
                    org.telegram.ui.Cells.n4 n4Var = this.J[1];
                    TLRPC.TL_invoice tL_invoice7 = this.D0.invoice;
                    n4Var.setVisibility((!tL_invoice7.name_requested || tL_invoice7.phone_requested || tL_invoice7.email_requested) ? 0 : 8);
                    if (!this.D0.invoice.shipping_address_requested) {
                        this.J[0].setVisibility(8);
                        this.L[0].setVisibility(8);
                        ((ViewGroup) this.f[0].getParent()).setVisibility(8);
                        ((ViewGroup) this.f[1].getParent()).setVisibility(8);
                        ((ViewGroup) this.f[2].getParent()).setVisibility(8);
                        ((ViewGroup) this.f[i37].getParent()).setVisibility(8);
                        ((ViewGroup) this.f[4].getParent()).setVisibility(8);
                        ((ViewGroup) this.f[5].getParent()).setVisibility(8);
                    }
                    tL_paymentRequestedInfo3 = this.D0.saved_info;
                    if (tL_paymentRequestedInfo3 != null || TextUtils.isEmpty(tL_paymentRequestedInfo3.phone)) {
                        t0(null);
                    } else {
                        t0(this.D0.saved_info.phone);
                    }
                    if (this.f[8].length() == 0) {
                        TLRPC.PaymentForm paymentForm3 = this.D0;
                        if (paymentForm3.invoice.phone_requested && ((tL_paymentRequestedInfo4 = paymentForm3.saved_info) == null || TextUtils.isEmpty(tL_paymentRequestedInfo4.phone))) {
                            try {
                                telephonyManager = (TelephonyManager) org.telegram.messenger.t0.b.getSystemService("phone");
                            } catch (Exception e12) {
                                org.telegram.messenger.a8.f(e12);
                            }
                            if (telephonyManager != null) {
                                str3 = telephonyManager.getSimCountryIso().toUpperCase();
                                if (str3 != null && (str4 = (String) hashMap.get(str3)) != null && this.a.indexOf(str4) != -1) {
                                    this.f[8].setText((CharSequence) this.b.get(str4));
                                }
                            }
                            str3 = null;
                            if (str3 != null) {
                                this.f[8].setText((CharSequence) this.b.get(str4));
                            }
                        }
                    }
                }
                e = e11;
                org.telegram.messenger.a8.f(e);
                Collections.sort(this.a, new org.telegram.ui.Components.d80(i24));
                this.f = new EditTextBoldCursor[10];
                i15 = i14;
                while (i15 < i26) {
                }
                int i362 = i20;
                int i372 = i21;
                if (this.D0.invoice.name_requested) {
                }
                if (!this.D0.invoice.phone_requested) {
                }
                if (!this.D0.invoice.email_requested) {
                }
                tL_invoice = this.D0.invoice;
                if (!tL_invoice.phone_requested) {
                }
                x6Var = this.L[1];
                if (x6Var == null) {
                }
                org.telegram.ui.Cells.n4 n4Var2 = this.J[1];
                TLRPC.TL_invoice tL_invoice72 = this.D0.invoice;
                n4Var2.setVisibility((!tL_invoice72.name_requested || tL_invoice72.phone_requested || tL_invoice72.email_requested) ? 0 : 8);
                if (!this.D0.invoice.shipping_address_requested) {
                }
                tL_paymentRequestedInfo3 = this.D0.saved_info;
                if (tL_paymentRequestedInfo3 != null) {
                }
                t0(null);
                if (this.f[8].length() == 0) {
                }
            }
        } else {
            int i38 = 3;
            int i39 = 2131747427;
            if (i23 == 2) {
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
                    this.R.addView(this.P, b8.mf.o(-1, 50));
                    this.A0 = true;
                    N0(true, true);
                    this.r.setVisibility(0);
                    this.n.setEnabled(false);
                    this.n.getContentView().setVisibility(4);
                    org.telegram.messenger.g0.u(context, true);
                    org.telegram.ui.Components.w61 w61Var = new org.telegram.ui.Components.w61(this, context);
                    this.x = w61Var;
                    w61Var.getSettings().setJavaScriptEnabled(true);
                    this.x.getSettings().setDomStorageEnabled(true);
                    this.x.getSettings().setSupportZoom(true);
                    this.x.getSettings().setBuiltInZoomControls(true);
                    this.x.getSettings().setDisplayZoomControls(false);
                    this.x.getSettings().setUseWideViewPort(true);
                    this.x.getSettings().setMixedContentMode(0);
                    CookieManager.getInstance().setAcceptThirdPartyCookies(this.x, true);
                    this.x.addJavascriptInterface(new PaymentFormActivity$TelegramWebviewProxy(this), "TelegramWebviewProxy");
                    this.x.setWebViewClient(new qk0(this, context, 1));
                    this.R.addView(this.x, b8.mf.c(-2.0f, -1));
                    this.L[2] = new org.telegram.ui.Cells.x6(context, (Object) null);
                    this.R.addView(this.L[2], b8.mf.o(-1, -2));
                    org.telegram.ui.Cells.q8 q8Var2 = new org.telegram.ui.Cells.q8(context, this.Z0);
                    this.M = q8Var2;
                    org.telegram.ui.ActionBar.r6.S(q8Var2, org.telegram.ui.ActionBar.k6.N0(true), org.telegram.ui.ActionBar.r6.N(org.telegram.ui.ActionBar.k6.d6), org.telegram.ui.ActionBar.r6.N(org.telegram.ui.ActionBar.k6.i6));
                    this.M.f(org.telegram.messenger.bd.L0(2131747430), this.V0, false);
                    this.R.addView(this.M, b8.mf.o(-1, -2));
                    this.M.setOnClickListener(new ak0(this, 10));
                    this.N[0] = new org.telegram.ui.Cells.y8(context, this.Z0);
                    org.telegram.ui.ActionBar.r6.a0(this.N[0], context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.k6.b7);
                    Q0();
                    this.R.addView(this.N[0], b8.mf.o(-1, -2));
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
                    int i40 = 6;
                    this.f = new EditTextBoldCursor[6];
                    int i41 = 0;
                    while (i41 < i40) {
                        if (i41 == 0) {
                            this.J[0] = new org.telegram.ui.Cells.n4(context, this.Z0);
                            org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d6, this.J[0], getResourceProvider());
                            this.J[0].setText(org.telegram.messenger.bd.L0(i39));
                            this.R.addView(this.J[0], b8.mf.o(-1, -2));
                        } else if (i41 == 4) {
                            this.J[1] = new org.telegram.ui.Cells.n4(context, this.Z0);
                            org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d6, this.J[1], getResourceProvider());
                            this.J[1].setText(org.telegram.messenger.bd.L0(2131747436));
                            this.R.addView(this.J[1], b8.mf.o(-1, -2));
                        }
                        boolean z12 = (i41 == i38 || i41 == 5 || (i41 == 4 && !this.i0)) ? false : true;
                        FrameLayout frameLayout3 = new FrameLayout(context);
                        frameLayout3.setClipChildren(false);
                        int i42 = org.telegram.ui.ActionBar.k6.d6;
                        org.telegram.ui.ActionBar.r6.i(i42, frameLayout3, getResourceProvider());
                        this.R.addView(frameLayout3, b8.mf.o(-1, 50));
                        this.f[i41] = new EditTextBoldCursor(context);
                        this.f[i41].setTag(Integer.valueOf(i41));
                        this.f[i41].setTextSize(1, 16.0f);
                        org.telegram.ui.ActionBar.r6.E(this.f[i41], org.telegram.ui.ActionBar.k6.H6, getResourceProvider());
                        EditTextBoldCursor editTextBoldCursor4 = this.f[i41];
                        int i43 = org.telegram.ui.ActionBar.k6.G6;
                        org.telegram.ui.ActionBar.r6.V(editTextBoldCursor4, i43, getResourceProvider());
                        this.f[i41].setBackgroundDrawable(null);
                        org.telegram.ui.ActionBar.r6.w(this.f[i41], i43, getResourceProvider());
                        this.f[i41].setCursorSize(org.telegram.messenger.g0.L(20.0f));
                        this.f[i41].setCursorWidth(1.5f);
                        if (i41 == 3) {
                            this.f[i41].setFilters(new InputFilter[]{new InputFilter.LengthFilter(3)});
                            this.f[i41].setInputType(org.telegram.messenger.hs.O1);
                            this.f[i41].setTypeface(Typeface.DEFAULT);
                            this.f[i41].setTransformationMethod(PasswordTransformationMethod.getInstance());
                        } else if (i41 == 0) {
                            this.f[i41].setInputType(3);
                        } else if (i41 == 4) {
                            final int i44 = 1;
                            this.f[i41].setOnTouchListener(new View.OnTouchListener(this) { // from class: org.telegram.ui.bk0
                                public final /* synthetic */ dl0 b;

                                {
                                    this.b = this;
                                }

                                @Override // android.view.View.OnTouchListener
                                public final boolean onTouch(View view, MotionEvent motionEvent) {
                                    switch (i44) {
                                        case 0:
                                            dl0 dl0Var = this.b;
                                            if (dl0Var.getParentActivity() != null) {
                                                if (motionEvent.getAction() == 1) {
                                                    os osVar = new os(null, false);
                                                    osVar.n = true;
                                                    osVar.r = new fk0(dl0Var, 4);
                                                    dl0Var.presentFragment(osVar);
                                                }
                                                break;
                                            }
                                            break;
                                        default:
                                            dl0 dl0Var2 = this.b;
                                            if (dl0Var2.getParentActivity() != null) {
                                                if (motionEvent.getAction() == 1) {
                                                    os osVar2 = new os(null, false);
                                                    osVar2.n = true;
                                                    osVar2.r = new fk0(dl0Var2, 2);
                                                    dl0Var2.presentFragment(osVar2);
                                                }
                                                break;
                                            }
                                            break;
                                    }
                                    return true;
                                }
                            });
                            this.f[i41].setInputType(0);
                        } else if (i41 == 1) {
                            this.f[i41].setInputType(16386);
                        } else if (i41 == 2) {
                            this.f[i41].setInputType(4097);
                        } else {
                            this.f[i41].setInputType(16385);
                            this.f[i41].setImeOptions(268435461);
                            if (i41 != 0) {
                                this.f[i41].setHint(org.telegram.messenger.bd.L0(2131747431));
                            } else if (i41 == 1) {
                                this.f[i41].setHint(org.telegram.messenger.bd.L0(2131747434));
                            } else if (i41 == 2) {
                                this.f[i41].setHint(org.telegram.messenger.bd.L0(2131747432));
                            } else if (i41 == 3) {
                                this.f[i41].setHint(org.telegram.messenger.bd.L0(2131747435));
                            } else if (i41 == 4) {
                                this.f[i41].setHint(org.telegram.messenger.bd.L0(2131747385));
                            } else if (i41 == 5) {
                                this.f[i41].setHint(org.telegram.messenger.bd.L0(2131747375));
                            }
                            if (i41 != 0) {
                                this.f[i41].addTextChangedListener(new xk0(this));
                            } else if (i41 == 1) {
                                this.f[i41].addTextChangedListener(new yk0(this));
                            }
                            this.f[i41].setPadding(0, 0, 0, org.telegram.messenger.g0.L(6.0f));
                            this.f[i41].setGravity(!org.telegram.messenger.bd.a0 ? 5 : 3);
                            frameLayout3.addView(this.f[i41], b8.mf.d(-1, -2.0f, 51, 21.0f, 12.0f, 21.0f, 6.0f));
                            final int i45 = 3;
                            this.f[i41].setOnEditorActionListener(new TextView.OnEditorActionListener(this) { // from class: org.telegram.ui.dk0
                                public final /* synthetic */ dl0 b;

                                {
                                    this.b = this;
                                }

                                @Override // android.widget.TextView.OnEditorActionListener
                                public final boolean onEditorAction(TextView textView2, int i332, KeyEvent keyEvent) {
                                    EditTextBoldCursor[] editTextBoldCursorArr;
                                    switch (i45) {
                                        case 0:
                                            dl0 dl0Var = this.b;
                                            if (i332 != 6) {
                                                dl0Var.getClass();
                                                break;
                                            } else {
                                                dl0Var.G0(false);
                                                break;
                                            }
                                        case 1:
                                            dl0 dl0Var2 = this.b;
                                            if (i332 != 6) {
                                                dl0Var2.getClass();
                                                if (i332 == 5) {
                                                    int intValue = ((Integer) textView2.getTag()).intValue();
                                                    if (intValue != 0) {
                                                        if (intValue == 1) {
                                                            dl0Var2.f[2].requestFocus();
                                                            break;
                                                        }
                                                    } else {
                                                        dl0Var2.f[1].requestFocus();
                                                        break;
                                                    }
                                                }
                                            } else {
                                                dl0Var2.n.performClick();
                                                break;
                                            }
                                            break;
                                        case 2:
                                            dl0 dl0Var3 = this.b;
                                            dl0Var3.getClass();
                                            if (i332 != 5) {
                                                if (i332 == 6) {
                                                    dl0Var3.n.performClick();
                                                    break;
                                                }
                                            } else {
                                                int intValue2 = ((Integer) textView2.getTag()).intValue();
                                                while (true) {
                                                    intValue2++;
                                                    EditTextBoldCursor[] editTextBoldCursorArr2 = dl0Var3.f;
                                                    if (intValue2 >= editTextBoldCursorArr2.length) {
                                                        break;
                                                    } else if (intValue2 != 4 && ((View) editTextBoldCursorArr2[intValue2].getParent()).getVisibility() == 0) {
                                                        dl0Var3.f[intValue2].requestFocus();
                                                        break;
                                                    }
                                                }
                                            }
                                            break;
                                        case 3:
                                            dl0 dl0Var4 = this.b;
                                            dl0Var4.getClass();
                                            if (i332 != 5) {
                                                if (i332 == 6) {
                                                    dl0Var4.n.performClick();
                                                    break;
                                                }
                                            } else {
                                                int intValue3 = ((Integer) textView2.getTag()).intValue();
                                                do {
                                                    int i342 = intValue3 + 1;
                                                    editTextBoldCursorArr = dl0Var4.f;
                                                    if (i342 >= editTextBoldCursorArr.length) {
                                                        break;
                                                    } else {
                                                        intValue3 = i342 == 4 ? intValue3 + 2 : i342;
                                                    }
                                                } while (((View) editTextBoldCursorArr[intValue3].getParent()).getVisibility() != 0);
                                                dl0Var4.f[intValue3].requestFocus();
                                                break;
                                            }
                                            break;
                                        default:
                                            dl0 dl0Var5 = this.b;
                                            if (i332 != 6) {
                                                dl0Var5.getClass();
                                                break;
                                            } else {
                                                dl0Var5.n.performClick();
                                                break;
                                            }
                                    }
                                    return false;
                                }
                            });
                            if (i41 != 3) {
                                this.L[0] = new org.telegram.ui.Cells.x6(context, (Object) null);
                                i13 = i39;
                                this.R.addView(this.L[0], b8.mf.o(-1, -2));
                            } else {
                                i13 = i39;
                                if (i41 == 5) {
                                    this.L[2] = new org.telegram.ui.Cells.x6(context, (Object) null);
                                    this.R.addView(this.L[2], b8.mf.o(-1, -2));
                                    org.telegram.ui.Cells.q8 q8Var3 = new org.telegram.ui.Cells.q8(context, this.Z0);
                                    this.M = q8Var3;
                                    org.telegram.ui.ActionBar.r6.S(q8Var3, org.telegram.ui.ActionBar.k6.N0(true), org.telegram.ui.ActionBar.r6.N(i42), org.telegram.ui.ActionBar.r6.N(org.telegram.ui.ActionBar.k6.i6));
                                    this.M.f(org.telegram.messenger.bd.L0(2131747430), this.V0, false);
                                    this.R.addView(this.M, b8.mf.o(-1, -2));
                                    this.M.setOnClickListener(new ak0(this, 11));
                                    this.N[0] = new org.telegram.ui.Cells.y8(context, this.Z0);
                                    org.telegram.ui.ActionBar.r6.a0(this.N[0], context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.k6.b7);
                                    Q0();
                                    this.R.addView(this.N[0], b8.mf.o(-1, -2));
                                } else if (i41 == 0) {
                                    s0(context);
                                    frameLayout3.addView(this.P, b8.mf.d(-2, -2.0f, (org.telegram.messenger.bd.a0 ? 3 : 5) | 16, 0.0f, 0.0f, 4.0f, 0.0f));
                                }
                            }
                            if (!z12) {
                                org.telegram.ui.Components.sm smVar2 = new org.telegram.ui.Components.sm(context, 19);
                                org.telegram.ui.ActionBar.r6.i(i42, smVar2, getResourceProvider());
                                this.K.add(smVar2);
                                frameLayout3.addView(smVar2, new FrameLayout.LayoutParams(-1, 1, 83));
                            }
                            if ((i41 == 4 && !this.h0) || ((i41 == 5 && !this.i0) || (i41 == 2 && !this.j0))) {
                                frameLayout3.setVisibility(8);
                            }
                            i41++;
                            i39 = i13;
                            i40 = 6;
                            i38 = 3;
                        }
                        this.f[i41].setImeOptions(268435461);
                        if (i41 != 0) {
                        }
                        if (i41 != 0) {
                        }
                        this.f[i41].setPadding(0, 0, 0, org.telegram.messenger.g0.L(6.0f));
                        this.f[i41].setGravity(!org.telegram.messenger.bd.a0 ? 5 : 3);
                        frameLayout3.addView(this.f[i41], b8.mf.d(-1, -2.0f, 51, 21.0f, 12.0f, 21.0f, 6.0f));
                        final int i452 = 3;
                        this.f[i41].setOnEditorActionListener(new TextView.OnEditorActionListener(this) { // from class: org.telegram.ui.dk0
                            public final /* synthetic */ dl0 b;

                            {
                                this.b = this;
                            }

                            @Override // android.widget.TextView.OnEditorActionListener
                            public final boolean onEditorAction(TextView textView2, int i332, KeyEvent keyEvent) {
                                EditTextBoldCursor[] editTextBoldCursorArr;
                                switch (i452) {
                                    case 0:
                                        dl0 dl0Var = this.b;
                                        if (i332 != 6) {
                                            dl0Var.getClass();
                                            break;
                                        } else {
                                            dl0Var.G0(false);
                                            break;
                                        }
                                    case 1:
                                        dl0 dl0Var2 = this.b;
                                        if (i332 != 6) {
                                            dl0Var2.getClass();
                                            if (i332 == 5) {
                                                int intValue = ((Integer) textView2.getTag()).intValue();
                                                if (intValue != 0) {
                                                    if (intValue == 1) {
                                                        dl0Var2.f[2].requestFocus();
                                                        break;
                                                    }
                                                } else {
                                                    dl0Var2.f[1].requestFocus();
                                                    break;
                                                }
                                            }
                                        } else {
                                            dl0Var2.n.performClick();
                                            break;
                                        }
                                        break;
                                    case 2:
                                        dl0 dl0Var3 = this.b;
                                        dl0Var3.getClass();
                                        if (i332 != 5) {
                                            if (i332 == 6) {
                                                dl0Var3.n.performClick();
                                                break;
                                            }
                                        } else {
                                            int intValue2 = ((Integer) textView2.getTag()).intValue();
                                            while (true) {
                                                intValue2++;
                                                EditTextBoldCursor[] editTextBoldCursorArr2 = dl0Var3.f;
                                                if (intValue2 >= editTextBoldCursorArr2.length) {
                                                    break;
                                                } else if (intValue2 != 4 && ((View) editTextBoldCursorArr2[intValue2].getParent()).getVisibility() == 0) {
                                                    dl0Var3.f[intValue2].requestFocus();
                                                    break;
                                                }
                                            }
                                        }
                                        break;
                                    case 3:
                                        dl0 dl0Var4 = this.b;
                                        dl0Var4.getClass();
                                        if (i332 != 5) {
                                            if (i332 == 6) {
                                                dl0Var4.n.performClick();
                                                break;
                                            }
                                        } else {
                                            int intValue3 = ((Integer) textView2.getTag()).intValue();
                                            do {
                                                int i342 = intValue3 + 1;
                                                editTextBoldCursorArr = dl0Var4.f;
                                                if (i342 >= editTextBoldCursorArr.length) {
                                                    break;
                                                } else {
                                                    intValue3 = i342 == 4 ? intValue3 + 2 : i342;
                                                }
                                            } while (((View) editTextBoldCursorArr[intValue3].getParent()).getVisibility() != 0);
                                            dl0Var4.f[intValue3].requestFocus();
                                            break;
                                        }
                                        break;
                                    default:
                                        dl0 dl0Var5 = this.b;
                                        if (i332 != 6) {
                                            dl0Var5.getClass();
                                            break;
                                        } else {
                                            dl0Var5.n.performClick();
                                            break;
                                        }
                                }
                                return false;
                            }
                        });
                        if (i41 != 3) {
                        }
                        if (!z12) {
                        }
                        if (i41 == 4) {
                            frameLayout3.setVisibility(8);
                            i41++;
                            i39 = i13;
                            i40 = 6;
                            i38 = 3;
                        }
                        frameLayout3.setVisibility(8);
                        i41++;
                        i39 = i13;
                        i40 = 6;
                        i38 = 3;
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
            } else if (i23 == 1) {
                ArrayList<TLRPC.TL_shippingOption> arrayList = this.F0.shipping_options;
                int size = arrayList == null ? 0 : arrayList.size();
                this.h = new org.telegram.ui.Cells.h6[size];
                int i46 = 0;
                while (i46 < size) {
                    TLRPC.TL_shippingOption tL_shippingOption = this.F0.shipping_options.get(i46);
                    this.h[i46] = new org.telegram.ui.Cells.h6(context);
                    this.h[i46].setTag(Integer.valueOf(i46));
                    org.telegram.ui.ActionBar.r6.S(this.h[i46], org.telegram.ui.ActionBar.k6.N0(true), org.telegram.ui.ActionBar.r6.N(org.telegram.ui.ActionBar.k6.d6), org.telegram.ui.ActionBar.r6.N(org.telegram.ui.ActionBar.k6.i6));
                    this.h[i46].c(a1.g.C(y0(tL_shippingOption.prices), " - ", tL_shippingOption.title), i46 == 0, i46 != size + (-1));
                    this.h[i46].setOnClickListener(new ak0(this, 12));
                    this.R.addView(this.h[i46]);
                    i46++;
                }
                this.N[0] = new org.telegram.ui.Cells.y8(context, this.Z0);
                org.telegram.ui.ActionBar.r6.a0(this.N[0], context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.k6.b7);
                this.R.addView(this.N[0], b8.mf.o(-1, -2));
            } else {
                int i47 = org.telegram.messenger.hs.N1;
                if (i23 == 3) {
                    this.f = new EditTextBoldCursor[2];
                    int i48 = 0;
                    for (int i49 = 2; i48 < i49; i49 = 2) {
                        if (i48 == 0) {
                            z10 = false;
                            this.J[0] = new org.telegram.ui.Cells.n4(context, this.Z0);
                            org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d6, this.J[0], getResourceProvider());
                            this.J[0].setText(org.telegram.messenger.bd.L0(2131747427));
                            this.R.addView(this.J[0], b8.mf.o(-1, -2));
                        } else {
                            z10 = false;
                        }
                        FrameLayout frameLayout4 = new FrameLayout(context);
                        frameLayout4.setClipChildren(z10);
                        this.R.addView(frameLayout4, b8.mf.o(-1, 50));
                        int i50 = org.telegram.ui.ActionBar.k6.d6;
                        org.telegram.ui.ActionBar.r6.i(i50, frameLayout4, getResourceProvider());
                        boolean z13 = i48 != 1;
                        if (z13) {
                            if (i48 != 7 || this.D0.invoice.phone_requested) {
                                if (i48 == 6) {
                                    TLRPC.TL_invoice tL_invoice8 = this.D0.invoice;
                                    if (!tL_invoice8.phone_requested) {
                                    }
                                }
                            }
                            z13 = false;
                        }
                        if (z13) {
                            org.telegram.ui.Components.sm smVar3 = new org.telegram.ui.Components.sm(context, 16);
                            org.telegram.ui.ActionBar.r6.i(i50, smVar3, getResourceProvider());
                            this.K.add(smVar3);
                            frameLayout4.addView(smVar3, new FrameLayout.LayoutParams(-1, 1, 83));
                        }
                        this.f[i48] = new EditTextBoldCursor(context);
                        this.f[i48].setTag(Integer.valueOf(i48));
                        this.f[i48].setTextSize(1, 16.0f);
                        org.telegram.ui.ActionBar.r6.E(this.f[i48], org.telegram.ui.ActionBar.k6.H6, getResourceProvider());
                        EditTextBoldCursor editTextBoldCursor5 = this.f[i48];
                        int i51 = org.telegram.ui.ActionBar.k6.G6;
                        org.telegram.ui.ActionBar.r6.V(editTextBoldCursor5, i51, getResourceProvider());
                        this.f[i48].setBackgroundDrawable(null);
                        org.telegram.ui.ActionBar.r6.w(this.f[i48], i51, getResourceProvider());
                        this.f[i48].setCursorSize(org.telegram.messenger.g0.L(20.0f));
                        this.f[i48].setCursorWidth(1.5f);
                        if (i48 == 0) {
                            this.f[i48].setOnTouchListener(new fi.a(29));
                            this.f[i48].setInputType(0);
                        } else {
                            this.f[i48].setInputType(org.telegram.messenger.hs.N1);
                            this.f[i48].setTypeface(Typeface.DEFAULT);
                        }
                        this.f[i48].setImeOptions(268435462);
                        if (i48 == 0) {
                            EditTextBoldCursor editTextBoldCursor6 = this.f[i48];
                            TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard = this.z0;
                            editTextBoldCursor6.setText(tL_paymentSavedCredentialsCard == null ? "" : tL_paymentSavedCredentialsCard.title);
                        } else if (i48 == 1) {
                            this.f[i48].setHint(org.telegram.messenger.bd.L0(2131748734));
                            this.f[i48].requestFocus();
                        }
                        this.f[i48].setPadding(0, 0, 0, org.telegram.messenger.g0.L(6.0f));
                        this.f[i48].setGravity(org.telegram.messenger.bd.a0 ? 5 : 3);
                        frameLayout4.addView(this.f[i48], b8.mf.d(-1, -2.0f, 51, 21.0f, 12.0f, 21.0f, 6.0f));
                        final int i52 = 4;
                        this.f[i48].setOnEditorActionListener(new TextView.OnEditorActionListener(this) { // from class: org.telegram.ui.dk0
                            public final /* synthetic */ dl0 b;

                            {
                                this.b = this;
                            }

                            @Override // android.widget.TextView.OnEditorActionListener
                            public final boolean onEditorAction(TextView textView2, int i332, KeyEvent keyEvent) {
                                EditTextBoldCursor[] editTextBoldCursorArr;
                                switch (i52) {
                                    case 0:
                                        dl0 dl0Var = this.b;
                                        if (i332 != 6) {
                                            dl0Var.getClass();
                                            break;
                                        } else {
                                            dl0Var.G0(false);
                                            break;
                                        }
                                    case 1:
                                        dl0 dl0Var2 = this.b;
                                        if (i332 != 6) {
                                            dl0Var2.getClass();
                                            if (i332 == 5) {
                                                int intValue = ((Integer) textView2.getTag()).intValue();
                                                if (intValue != 0) {
                                                    if (intValue == 1) {
                                                        dl0Var2.f[2].requestFocus();
                                                        break;
                                                    }
                                                } else {
                                                    dl0Var2.f[1].requestFocus();
                                                    break;
                                                }
                                            }
                                        } else {
                                            dl0Var2.n.performClick();
                                            break;
                                        }
                                        break;
                                    case 2:
                                        dl0 dl0Var3 = this.b;
                                        dl0Var3.getClass();
                                        if (i332 != 5) {
                                            if (i332 == 6) {
                                                dl0Var3.n.performClick();
                                                break;
                                            }
                                        } else {
                                            int intValue2 = ((Integer) textView2.getTag()).intValue();
                                            while (true) {
                                                intValue2++;
                                                EditTextBoldCursor[] editTextBoldCursorArr2 = dl0Var3.f;
                                                if (intValue2 >= editTextBoldCursorArr2.length) {
                                                    break;
                                                } else if (intValue2 != 4 && ((View) editTextBoldCursorArr2[intValue2].getParent()).getVisibility() == 0) {
                                                    dl0Var3.f[intValue2].requestFocus();
                                                    break;
                                                }
                                            }
                                        }
                                        break;
                                    case 3:
                                        dl0 dl0Var4 = this.b;
                                        dl0Var4.getClass();
                                        if (i332 != 5) {
                                            if (i332 == 6) {
                                                dl0Var4.n.performClick();
                                                break;
                                            }
                                        } else {
                                            int intValue3 = ((Integer) textView2.getTag()).intValue();
                                            do {
                                                int i342 = intValue3 + 1;
                                                editTextBoldCursorArr = dl0Var4.f;
                                                if (i342 >= editTextBoldCursorArr.length) {
                                                    break;
                                                } else {
                                                    intValue3 = i342 == 4 ? intValue3 + 2 : i342;
                                                }
                                            } while (((View) editTextBoldCursorArr[intValue3].getParent()).getVisibility() != 0);
                                            dl0Var4.f[intValue3].requestFocus();
                                            break;
                                        }
                                        break;
                                    default:
                                        dl0 dl0Var5 = this.b;
                                        if (i332 != 6) {
                                            dl0Var5.getClass();
                                            break;
                                        } else {
                                            dl0Var5.n.performClick();
                                            break;
                                        }
                                }
                                return false;
                            }
                        });
                        if (i48 == 1) {
                            this.N[0] = new org.telegram.ui.Cells.y8(context, this.Z0);
                            org.telegram.ui.Cells.y8 y8Var2 = this.N[0];
                            TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard2 = this.z0;
                            y8Var2.setText(org.telegram.messenger.bd.Y(2131747414, "PaymentConfirmationMessage", tL_paymentSavedCredentialsCard2 == null ? "" : tL_paymentSavedCredentialsCard2.title));
                            org.telegram.ui.Cells.y8 y8Var3 = this.N[0];
                            int i53 = org.telegram.ui.ActionBar.k6.b7;
                            org.telegram.ui.ActionBar.r6.a0(y8Var3, context, R.drawable.greydivider, i53);
                            this.R.addView(this.N[0], b8.mf.o(-1, -2));
                            this.O[0] = new org.telegram.ui.Cells.v9(context, this.Z0);
                            org.telegram.ui.ActionBar.r6.S(this.O[0], org.telegram.ui.ActionBar.k6.N0(true), org.telegram.ui.ActionBar.r6.N(i50), org.telegram.ui.ActionBar.r6.N(org.telegram.ui.ActionBar.k6.i6));
                            this.O[0].b(org.telegram.messenger.bd.L0(2131747413), false);
                            this.R.addView(this.O[0], b8.mf.o(-1, -2));
                            this.O[0].setOnClickListener(new ak0(this, 14));
                            this.N[1] = new org.telegram.ui.Cells.y8(context, this.Z0);
                            org.telegram.ui.ActionBar.r6.a0(this.N[1], context, R.drawable.greydivider_bottom, i53);
                            this.R.addView(this.N[1], b8.mf.o(-1, -2));
                        }
                        i48++;
                    }
                } else if (i23 == 4 || i23 == 5) {
                    org.telegram.ui.Cells.j5 j5Var = new org.telegram.ui.Cells.j5(context);
                    this.Y = j5Var;
                    org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d6, j5Var, getResourceProvider());
                    org.telegram.messenger.zi ziVar = this.O0;
                    if (ziVar != null) {
                        this.Y.b((TLRPC.TL_messageMediaInvoice) ziVar.k.media, this.q0);
                    } else {
                        TLRPC.PaymentReceipt paymentReceipt = this.E0;
                        if (paymentReceipt != null) {
                            this.Y.c(paymentReceipt, this.q0);
                        } else if (this.P0 != null || this.c1 != null) {
                            ?? r02 = this.Y;
                            TLRPC.PaymentForm paymentForm4 = this.D0;
                            r02.a(paymentForm4.title, paymentForm4.description, paymentForm4.photo, this.q0, paymentForm4);
                        }
                    }
                    this.R.addView(this.Y, b8.mf.o(-1, -2));
                    this.L[0] = new org.telegram.ui.Cells.x6(context, (Object) null);
                    this.R.addView(this.L[0], b8.mf.o(-1, -2));
                    ArrayList arrayList2 = new ArrayList(this.D0.invoice.prices);
                    this.u0 = arrayList2;
                    TLRPC.TL_shippingOption tL_shippingOption2 = this.H0;
                    if (tL_shippingOption2 != null) {
                        arrayList2.addAll(tL_shippingOption2.prices);
                    }
                    this.S0 = new String[1];
                    for (int i54 = 0; i54 < this.u0.size(); i54++) {
                        TLRPC.TL_labeledPrice tL_labeledPrice = (TLRPC.TL_labeledPrice) this.u0.get(i54);
                        org.telegram.ui.Cells.z8 z8Var = new org.telegram.ui.Cells.z8(context);
                        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d6, z8Var, getResourceProvider());
                        z8Var.a(tL_labeledPrice.label, org.telegram.messenger.bd.E0().p(tL_labeledPrice.amount, this.D0.invoice.currency), false);
                        this.R.addView(z8Var);
                    }
                    if (this.v0 == 5 && this.I0 != null) {
                        org.telegram.ui.Cells.z8 z8Var2 = new org.telegram.ui.Cells.z8(context);
                        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d6, z8Var2, getResourceProvider());
                        z8Var2.a(org.telegram.messenger.bd.L0(2131747365), org.telegram.messenger.bd.E0().p(this.I0.longValue(), this.D0.invoice.currency), false);
                        this.R.addView(z8Var2);
                    }
                    org.telegram.ui.Cells.z8 z8Var3 = new org.telegram.ui.Cells.z8(context);
                    this.S = z8Var3;
                    int i55 = org.telegram.ui.ActionBar.k6.d6;
                    org.telegram.ui.ActionBar.r6.i(i55, z8Var3, getResourceProvider());
                    this.S0[0] = y0(this.u0);
                    this.S.a(org.telegram.messenger.bd.L0(2131747361), this.S0[0], true);
                    float f10 = 14.0f;
                    if (this.v0 == 4 && (this.D0.invoice.flags & 256) != 0) {
                        ?? frameLayout5 = new FrameLayout(context);
                        frameLayout5.setClipChildren(false);
                        org.telegram.ui.ActionBar.r6.i(i55, frameLayout5, getResourceProvider());
                        this.R.addView(frameLayout5, b8.mf.o(-1, this.D0.invoice.suggested_tip_amounts.isEmpty() ? 40 : 78));
                        frameLayout5.setOnClickListener(new ak0(this, 0));
                        org.telegram.ui.Cells.z8 z8Var4 = new org.telegram.ui.Cells.z8(context);
                        org.telegram.ui.ActionBar.r6.i(i55, z8Var4, getResourceProvider());
                        z8Var4.a(org.telegram.messenger.bd.L0(2131747364), "", false);
                        frameLayout5.addView(z8Var4);
                        this.f = new EditTextBoldCursor[]{new EditTextBoldCursor(context)};
                        this.f[0].setTag(0);
                        this.f[0].setTextSize(1, 16.0f);
                        EditTextBoldCursor editTextBoldCursor7 = this.f[0];
                        int i56 = org.telegram.ui.ActionBar.k6.z6;
                        org.telegram.ui.ActionBar.r6.E(editTextBoldCursor7, i56, getResourceProvider());
                        org.telegram.ui.ActionBar.r6.V(this.f[0], i56, getResourceProvider());
                        this.f[0].setBackgroundDrawable(null);
                        org.telegram.ui.ActionBar.r6.w(this.f[0], org.telegram.ui.ActionBar.k6.G6, getResourceProvider());
                        this.f[0].setCursorSize(org.telegram.messenger.g0.L(20.0f));
                        this.f[0].setCursorWidth(1.5f);
                        this.f[0].setInputType(3);
                        this.f[0].setImeOptions(268435462);
                        this.f[0].setHint(org.telegram.messenger.bd.E0().p(0L, this.D0.invoice.currency));
                        this.f[0].setPadding(0, 0, 0, org.telegram.messenger.g0.L(6.0f));
                        this.f[0].setGravity(org.telegram.messenger.bd.a0 ? 3 : 5);
                        frameLayout5.addView(this.f[0], b8.mf.d(-1, -2.0f, 51, 21.0f, 9.0f, 21.0f, 1.0f));
                        this.f[0].addTextChangedListener(new ik0(this));
                        this.f[0].setOnEditorActionListener(new org.telegram.ui.Components.i2(3));
                        this.f[0].requestFocus();
                        if (!this.D0.invoice.suggested_tip_amounts.isEmpty()) {
                            HorizontalScrollView horizontalScrollView = new HorizontalScrollView(context);
                            horizontalScrollView.setHorizontalScrollBarEnabled(false);
                            horizontalScrollView.setVerticalScrollBarEnabled(false);
                            horizontalScrollView.setClipToPadding(false);
                            horizontalScrollView.setPadding(org.telegram.messenger.g0.L(21.0f), 0, org.telegram.messenger.g0.L(21.0f), 0);
                            horizontalScrollView.setFillViewport(true);
                            frameLayout5.addView(horizontalScrollView, b8.mf.d(-1, 30.0f, 51, 0.0f, 44.0f, 0.0f, 0.0f));
                            int[] iArr = new int[1];
                            int[] iArr2 = new int[1];
                            int size2 = this.D0.invoice.suggested_tip_amounts.size();
                            jk0 jk0Var = new jk0(context, size2, iArr, iArr2);
                            this.t0 = jk0Var;
                            jk0Var.setOrientation(0);
                            horizontalScrollView.addView(this.t0, b8.mf.x(-1, 30, 51));
                            int themedColor = getThemedColor(org.telegram.ui.ActionBar.k6.Si);
                            int i57 = 0;
                            while (i57 < size2) {
                                long longValue = org.telegram.messenger.bd.a0 ? this.D0.invoice.suggested_tip_amounts.get((size2 - i57) - 1).longValue() : this.D0.invoice.suggested_tip_amounts.get(i57).longValue();
                                String p10 = org.telegram.messenger.bd.E0().p(longValue, this.D0.invoice.currency);
                                String str10 = str7;
                                long j10 = longValue;
                                TextView g7 = org.telegram.messenger.k5.g(context, 1, f10);
                                g7.setTypeface(org.telegram.messenger.g0.o());
                                g7.setLines(1);
                                g7.setTag(Long.valueOf(j10));
                                g7.setMaxLines(1);
                                g7.setText(p10);
                                g7.setPadding(org.telegram.messenger.g0.L(15.0f), 0, org.telegram.messenger.g0.L(15.0f), 0);
                                org.telegram.ui.ActionBar.r6.V(g7, org.telegram.ui.ActionBar.k6.Z8, getResourceProvider());
                                g7.setBackground(org.telegram.ui.ActionBar.k6.d0(org.telegram.messenger.g0.L(15.0f), themedColor & 536870911));
                                g7.setSingleLine(true);
                                g7.setGravity(17);
                                this.t0.addView(g7, b8.mf.t(-2, -1, 19, 0, 0, i57 != size2 + (-1) ? 9 : 0, 0));
                                g7.setOnClickListener(new ci.c3(this, g7, j10, 6));
                                int L = org.telegram.messenger.g0.L(30.0f) + ((int) Math.ceil(g7.getPaint().measureText(p10)));
                                g7.setTag(R.id.width_tag, Integer.valueOf(L));
                                iArr[0] = Math.max(iArr[0], L);
                                iArr2[0] = iArr2[0] + L;
                                i57++;
                                str7 = str10;
                                f10 = 14.0f;
                            }
                            str = str7;
                            i3 = -2;
                            this.R.addView(this.S);
                            this.L[2] = new org.telegram.ui.Cells.x6(context, (Object) null);
                            org.telegram.ui.ActionBar.r6.a0(this.L[2], context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.k6.b7);
                            this.R.addView(this.L[2], b8.mf.o(-1, i3));
                            this.Z[0] = new kk0(context);
                            org.telegram.ui.ActionBar.r6.S(this.Z[0], org.telegram.ui.ActionBar.k6.N0(true), org.telegram.ui.ActionBar.r6.N(org.telegram.ui.ActionBar.k6.d6), org.telegram.ui.ActionBar.r6.N(org.telegram.ui.ActionBar.k6.i6));
                            org.telegram.ui.Cells.x8 x8Var = this.Z[0];
                            String str11 = this.y0;
                            x8Var.b(R.drawable.msg_payment_card, (str11 != null || str11.length() <= 1) ? this.y0 : this.y0.substring(0, 1).toUpperCase() + this.y0.substring(1), org.telegram.messenger.bd.L0(2131747422), true);
                            if (!this.W0 || this.X0) {
                                String str12 = this.y0;
                                i10 = (str12 != null || str12.length() <= 1) ? 8 : 0;
                            } else {
                                i10 = 0;
                            }
                            this.Z[0].setVisibility(i10);
                            this.R.addView(this.Z[0]);
                            if (this.v0 == 4) {
                                this.Z[0].setOnClickListener(new ak0(this, 1));
                            }
                            user = null;
                            for (i11 = 0; i11 < this.D0.users.size(); i11++) {
                                TLRPC.User user4 = this.D0.users.get(i11);
                                if (user4.id == this.D0.provider_id) {
                                    user = user4;
                                }
                            }
                            char c10 = 1;
                            this.Z[1] = new org.telegram.ui.Cells.x8(context);
                            org.telegram.ui.Cells.x8 x8Var2 = this.Z[1];
                            org.telegram.ui.Cells.y N0 = org.telegram.ui.ActionBar.k6.N0(true);
                            int i58 = org.telegram.ui.ActionBar.k6.d6;
                            org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i58);
                            int i59 = org.telegram.ui.ActionBar.k6.i6;
                            org.telegram.ui.ActionBar.r6.S(x8Var2, N0, N, org.telegram.ui.ActionBar.r6.N(i59));
                            if (user == null) {
                                org.telegram.ui.Cells.x8 x8Var3 = this.Z[1];
                                str2 = org.telegram.messenger.g5.n(user.first_name, user.last_name);
                                String L0 = org.telegram.messenger.bd.L0(2131747417);
                                TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo2 = this.J0;
                                x8Var3.b(R.drawable.msg_payment_provider, str2, L0, ((tL_payments_validateRequestedInfo2 == null || (tL_payments_validateRequestedInfo2.info.shipping_address == null && this.H0 == null)) && ((tL_paymentRequestedInfo2 = this.D0.saved_info) == null || tL_paymentRequestedInfo2.shipping_address == null)) ? false : true);
                                c10 = 1;
                                this.R.addView(this.Z[1]);
                            } else {
                                str2 = str;
                            }
                            this.Z[c10].setVisibility(user == null ? i10 : 8);
                            tL_payments_validateRequestedInfo = this.J0;
                            if (tL_payments_validateRequestedInfo == null || (this.W0 && (paymentForm2 = this.D0) != null && paymentForm2.saved_info != null)) {
                                tL_paymentRequestedInfo = tL_payments_validateRequestedInfo == null ? tL_payments_validateRequestedInfo.info : this.D0.saved_info;
                                int i60 = 2;
                                this.Z[2] = new org.telegram.ui.Cells.x8(context);
                                this.Z[2].setVisibility(8);
                                this.R.addView(this.Z[2]);
                                if (tL_paymentRequestedInfo.shipping_address != null) {
                                    this.Z[2].setVisibility(0);
                                    if (this.v0 == 4) {
                                        org.telegram.ui.ActionBar.r6.S(this.Z[2], org.telegram.ui.ActionBar.k6.N0(true), org.telegram.ui.ActionBar.r6.N(i58), org.telegram.ui.ActionBar.r6.N(i59));
                                        this.Z[2].setOnClickListener(new ak0(this, i60));
                                    } else {
                                        org.telegram.ui.ActionBar.r6.i(i58, this.Z[2], getResourceProvider());
                                    }
                                }
                                int i61 = 3;
                                this.Z[3] = new org.telegram.ui.Cells.x8(context);
                                this.Z[3].setVisibility(8);
                                this.R.addView(this.Z[3]);
                                if (tL_paymentRequestedInfo.name != null) {
                                    this.Z[3].setVisibility(0);
                                    if (this.v0 == 4) {
                                        org.telegram.ui.ActionBar.r6.S(this.Z[3], org.telegram.ui.ActionBar.k6.N0(true), org.telegram.ui.ActionBar.r6.N(i58), org.telegram.ui.ActionBar.r6.N(i59));
                                        this.Z[3].setOnClickListener(new ak0(this, i61));
                                    } else {
                                        org.telegram.ui.ActionBar.r6.i(i58, this.Z[3], getResourceProvider());
                                    }
                                }
                                int i62 = 4;
                                this.Z[4] = new org.telegram.ui.Cells.x8(context);
                                this.Z[4].setVisibility(8);
                                this.R.addView(this.Z[4]);
                                if (tL_paymentRequestedInfo.phone != null) {
                                    this.Z[4].setVisibility(0);
                                    if (this.v0 == 4) {
                                        org.telegram.ui.ActionBar.r6.S(this.Z[4], org.telegram.ui.ActionBar.k6.N0(true), org.telegram.ui.ActionBar.r6.N(i58), org.telegram.ui.ActionBar.r6.N(i59));
                                        this.Z[4].setOnClickListener(new ak0(this, i62));
                                    } else {
                                        org.telegram.ui.ActionBar.r6.i(i58, this.Z[4], getResourceProvider());
                                    }
                                }
                                int i63 = 5;
                                this.Z[5] = new org.telegram.ui.Cells.x8(context);
                                this.Z[5].setVisibility(8);
                                this.R.addView(this.Z[5]);
                                if (tL_paymentRequestedInfo.email != null) {
                                    this.Z[5].setVisibility(0);
                                    if (this.v0 == 4) {
                                        org.telegram.ui.ActionBar.r6.S(this.Z[5], org.telegram.ui.ActionBar.k6.N0(true), org.telegram.ui.ActionBar.r6.N(i58), org.telegram.ui.ActionBar.r6.N(i59));
                                        this.Z[5].setOnClickListener(new ak0(this, i63));
                                    } else {
                                        org.telegram.ui.ActionBar.r6.i(i58, this.Z[5], getResourceProvider());
                                    }
                                }
                                if (this.H0 != null) {
                                    this.Z[6] = new org.telegram.ui.Cells.x8(context);
                                    org.telegram.ui.ActionBar.r6.i(i58, this.Z[6], getResourceProvider());
                                    this.Z[6].b(R.drawable.msg_payment_delivery, this.H0.title, org.telegram.messenger.bd.L0(2131747416), false);
                                    this.R.addView(this.Z[6]);
                                }
                                H0(tL_paymentRequestedInfo);
                            }
                            if (this.v0 != 4) {
                                this.G = !this.W0;
                                if (this.c1 instanceof TLRPC.TL_inputInvoiceStars) {
                                    this.G = true;
                                }
                                this.X = new zk0(this, context);
                                View view = new View(context);
                                org.telegram.ui.ActionBar.r6.R(view, org.telegram.ui.ActionBar.k6.h0(getThemedColor(i59), 2, -1), null, org.telegram.ui.ActionBar.r6.N(i59), this.Z0);
                                this.X.addView(view, b8.mf.c(-1.0f, -1));
                                frameLayout2.addView(this.X, b8.mf.e(-1, 48, 80));
                                this.X.setOnClickListener(new hb0(6, this, str2));
                                TextView textView2 = new TextView(context);
                                this.V = textView2;
                                int i64 = org.telegram.ui.ActionBar.k6.Ti;
                                org.telegram.ui.ActionBar.r6.V(textView2, i64, getResourceProvider());
                                this.V.setText(org.telegram.messenger.bd.Z(2131747419, this.S0[0]));
                                this.V.setTextSize(1, 14.0f);
                                this.V.setGravity(17);
                                this.V.setTypeface(org.telegram.messenger.g0.o());
                                this.X.addView(this.V, b8.mf.c(-1.0f, -1));
                                org.telegram.ui.Components.aq aqVar2 = new org.telegram.ui.Components.aq(context, 0);
                                this.s = aqVar2;
                                aqVar2.setVisibility(4);
                                int themedColor2 = getThemedColor(i64);
                                this.s.a(805306367 & themedColor2, themedColor2);
                                this.X.addView(this.s, b8.mf.c(-1.0f, -1));
                                this.X.a(this.G, false);
                                this.V.setAlpha(!this.G ? 0.8f : 1.0f);
                                this.n.setEnabled(false);
                                this.n.getContentView().setVisibility(4);
                                org.telegram.messenger.g0.u(context, true);
                                try {
                                    pk0 pk0Var = new pk0(context);
                                    this.x = pk0Var;
                                    pk0Var.setBackgroundColor(-1);
                                    this.x.getSettings().setJavaScriptEnabled(true);
                                    this.x.getSettings().setDomStorageEnabled(true);
                                    this.x.getSettings().setSupportZoom(true);
                                    this.x.getSettings().setBuiltInZoomControls(true);
                                    this.x.getSettings().setDisplayZoomControls(false);
                                    this.x.getSettings().setUseWideViewPort(true);
                                    this.x.getSettings().setMixedContentMode(0);
                                    CookieManager.getInstance().setAcceptThirdPartyCookies(this.x, true);
                                    this.x.setWebViewClient(new qk0(this, context, 0));
                                } catch (Exception e15) {
                                    org.telegram.messenger.a8.f(e15);
                                }
                                this.W = null;
                                if (this.D0.invoice.terms_url != null) {
                                    org.telegram.ui.Cells.m6 m6Var = new org.telegram.ui.Cells.m6(context, getResourceProvider());
                                    this.W = m6Var;
                                    m6Var.setChecked(this.G);
                                    if (TextUtils.isEmpty(this.q0)) {
                                        String L02 = org.telegram.messenger.bd.L0(2131747424);
                                        ?? spannableStringBuilder2 = new SpannableStringBuilder(L02);
                                        int indexOf = L02.indexOf(42);
                                        int lastIndexOf = L02.lastIndexOf(42);
                                        if (indexOf != -1 && lastIndexOf != -1) {
                                            SpannableString spannableString = new SpannableString(L02.substring(indexOf + 1, lastIndexOf));
                                            spannableString.setSpan(new org.telegram.ui.Components.v31(this.D0.invoice.terms_url), 0, spannableString.length(), 33);
                                            int i65 = lastIndexOf + 1;
                                            spannableStringBuilder2.replace(indexOf, i65, spannableString);
                                            L02.substring(0, indexOf);
                                            spannableString.toString();
                                            L02.substring(i65);
                                        }
                                        spannableStringBuilder = spannableStringBuilder2;
                                        i12 = i3;
                                    } else {
                                        i12 = i3;
                                        String L03 = org.telegram.messenger.bd.L0(2131747425);
                                        spannableStringBuilder = new SpannableStringBuilder(L03);
                                        int indexOf2 = L03.indexOf(42);
                                        int lastIndexOf2 = L03.lastIndexOf(42);
                                        if (indexOf2 != -1 && lastIndexOf2 != -1) {
                                            SpannableString spannableString2 = new SpannableString(L03.substring(indexOf2 + 1, lastIndexOf2));
                                            spannableString2.setSpan(new org.telegram.ui.Components.v31(this.D0.invoice.terms_url), 0, spannableString2.length(), 33);
                                            int i66 = lastIndexOf2 + 1;
                                            spannableStringBuilder.replace(indexOf2, i66, (CharSequence) spannableString2);
                                            L03 = L03.substring(0, indexOf2) + ((Object) spannableString2) + L03.substring(i66);
                                        }
                                        int indexOf3 = L03.indexOf("%1$s");
                                        if (indexOf3 != -1) {
                                            spannableStringBuilder.replace(indexOf3, indexOf3 + 4, (CharSequence) this.q0);
                                            spannableStringBuilder.setSpan(new org.telegram.ui.Components.o31(org.telegram.messenger.g0.o()), indexOf3, this.q0.length() + indexOf3, 33);
                                        }
                                    }
                                    this.W.setText(spannableStringBuilder);
                                    org.telegram.ui.Cells.m6 m6Var2 = this.W;
                                    int i67 = org.telegram.ui.ActionBar.k6.d6;
                                    int themedColor3 = getThemedColor(i67);
                                    int i68 = org.telegram.ui.ActionBar.k6.i6;
                                    org.telegram.ui.ActionBar.r6.R(m6Var2, org.telegram.ui.ActionBar.k6.i0(themedColor3, getThemedColor(i68)), org.telegram.ui.ActionBar.r6.N(i67), org.telegram.ui.ActionBar.r6.N(i68), getResourceProvider());
                                    this.W.setOnClickListener(new ak0(this, 6));
                                    frameLayout2.addView(this.W, b8.mf.d(-1, -2.0f, 80, 0.0f, 0.0f, 0.0f, 48.0f));
                                } else {
                                    i12 = i3;
                                }
                                WebView webView = this.x;
                                if (webView != null) {
                                    frameLayout2.addView(webView, b8.mf.c(-1.0f, -1));
                                    this.x.setVisibility(8);
                                }
                            } else {
                                i12 = i3;
                            }
                            this.L[1] = new org.telegram.ui.Cells.x6(context, (Object) null);
                            org.telegram.ui.ActionBar.r6.a0(this.L[1], context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.k6.b7);
                            if (i10 == 0 && this.v0 == 4 && this.J0 == null && ((paymentForm = this.D0) == null || paymentForm.saved_info == null)) {
                                c2 = 1;
                                this.L[1].setVisibility(i10);
                            } else {
                                c2 = 1;
                            }
                            this.R.addView(this.L[c2], b8.mf.o(-1, i12));
                        }
                    }
                    str = "";
                    i3 = -2;
                    this.R.addView(this.S);
                    this.L[2] = new org.telegram.ui.Cells.x6(context, (Object) null);
                    org.telegram.ui.ActionBar.r6.a0(this.L[2], context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.k6.b7);
                    this.R.addView(this.L[2], b8.mf.o(-1, i3));
                    this.Z[0] = new kk0(context);
                    org.telegram.ui.ActionBar.r6.S(this.Z[0], org.telegram.ui.ActionBar.k6.N0(true), org.telegram.ui.ActionBar.r6.N(org.telegram.ui.ActionBar.k6.d6), org.telegram.ui.ActionBar.r6.N(org.telegram.ui.ActionBar.k6.i6));
                    org.telegram.ui.Cells.x8 x8Var4 = this.Z[0];
                    String str112 = this.y0;
                    if (str112 != null) {
                    }
                    x8Var4.b(R.drawable.msg_payment_card, (str112 != null || str112.length() <= 1) ? this.y0 : this.y0.substring(0, 1).toUpperCase() + this.y0.substring(1), org.telegram.messenger.bd.L0(2131747422), true);
                    if (this.W0) {
                    }
                    String str122 = this.y0;
                    i10 = (str122 != null || str122.length() <= 1) ? 8 : 0;
                    this.Z[0].setVisibility(i10);
                    this.R.addView(this.Z[0]);
                    if (this.v0 == 4) {
                    }
                    user = null;
                    while (i11 < this.D0.users.size()) {
                    }
                    char c102 = 1;
                    this.Z[1] = new org.telegram.ui.Cells.x8(context);
                    org.telegram.ui.Cells.x8 x8Var22 = this.Z[1];
                    org.telegram.ui.Cells.y N02 = org.telegram.ui.ActionBar.k6.N0(true);
                    int i582 = org.telegram.ui.ActionBar.k6.d6;
                    org.telegram.ui.ActionBar.n6 N2 = org.telegram.ui.ActionBar.r6.N(i582);
                    int i592 = org.telegram.ui.ActionBar.k6.i6;
                    org.telegram.ui.ActionBar.r6.S(x8Var22, N02, N2, org.telegram.ui.ActionBar.r6.N(i592));
                    if (user == null) {
                    }
                    this.Z[c102].setVisibility(user == null ? i10 : 8);
                    tL_payments_validateRequestedInfo = this.J0;
                    if (tL_payments_validateRequestedInfo == null) {
                    }
                    if (tL_payments_validateRequestedInfo == null) {
                    }
                    int i602 = 2;
                    this.Z[2] = new org.telegram.ui.Cells.x8(context);
                    this.Z[2].setVisibility(8);
                    this.R.addView(this.Z[2]);
                    if (tL_paymentRequestedInfo.shipping_address != null) {
                    }
                    int i612 = 3;
                    this.Z[3] = new org.telegram.ui.Cells.x8(context);
                    this.Z[3].setVisibility(8);
                    this.R.addView(this.Z[3]);
                    if (tL_paymentRequestedInfo.name != null) {
                    }
                    int i622 = 4;
                    this.Z[4] = new org.telegram.ui.Cells.x8(context);
                    this.Z[4].setVisibility(8);
                    this.R.addView(this.Z[4]);
                    if (tL_paymentRequestedInfo.phone != null) {
                    }
                    int i632 = 5;
                    this.Z[5] = new org.telegram.ui.Cells.x8(context);
                    this.Z[5].setVisibility(8);
                    this.R.addView(this.Z[5]);
                    if (tL_paymentRequestedInfo.email != null) {
                    }
                    if (this.H0 != null) {
                    }
                    H0(tL_paymentRequestedInfo);
                    if (this.v0 != 4) {
                    }
                    this.L[1] = new org.telegram.ui.Cells.x6(context, (Object) null);
                    org.telegram.ui.ActionBar.r6.a0(this.L[1], context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.k6.b7);
                    if (i10 == 0) {
                    }
                    c2 = 1;
                    this.R.addView(this.L[c2], b8.mf.o(-1, i12));
                } else if (i23 == 6) {
                    org.telegram.ui.Cells.l3 l3Var = new org.telegram.ui.Cells.l3(context);
                    this.T = l3Var;
                    l3Var.a(org.telegram.messenger.bd.L0(2131747455));
                    org.telegram.ui.Cells.l3 l3Var2 = this.T;
                    int i69 = org.telegram.ui.ActionBar.k6.d6;
                    org.telegram.ui.ActionBar.r6.i(i69, l3Var2, getResourceProvider());
                    EditTextBoldCursor textView3 = this.T.getTextView();
                    textView3.setInputType(3);
                    textView3.setImeOptions(6);
                    final int i70 = 0;
                    textView3.setOnEditorActionListener(new TextView.OnEditorActionListener(this) { // from class: org.telegram.ui.dk0
                        public final /* synthetic */ dl0 b;

                        {
                            this.b = this;
                        }

                        @Override // android.widget.TextView.OnEditorActionListener
                        public final boolean onEditorAction(TextView textView22, int i332, KeyEvent keyEvent) {
                            EditTextBoldCursor[] editTextBoldCursorArr;
                            switch (i70) {
                                case 0:
                                    dl0 dl0Var = this.b;
                                    if (i332 != 6) {
                                        dl0Var.getClass();
                                        break;
                                    } else {
                                        dl0Var.G0(false);
                                        break;
                                    }
                                case 1:
                                    dl0 dl0Var2 = this.b;
                                    if (i332 != 6) {
                                        dl0Var2.getClass();
                                        if (i332 == 5) {
                                            int intValue = ((Integer) textView22.getTag()).intValue();
                                            if (intValue != 0) {
                                                if (intValue == 1) {
                                                    dl0Var2.f[2].requestFocus();
                                                    break;
                                                }
                                            } else {
                                                dl0Var2.f[1].requestFocus();
                                                break;
                                            }
                                        }
                                    } else {
                                        dl0Var2.n.performClick();
                                        break;
                                    }
                                    break;
                                case 2:
                                    dl0 dl0Var3 = this.b;
                                    dl0Var3.getClass();
                                    if (i332 != 5) {
                                        if (i332 == 6) {
                                            dl0Var3.n.performClick();
                                            break;
                                        }
                                    } else {
                                        int intValue2 = ((Integer) textView22.getTag()).intValue();
                                        while (true) {
                                            intValue2++;
                                            EditTextBoldCursor[] editTextBoldCursorArr2 = dl0Var3.f;
                                            if (intValue2 >= editTextBoldCursorArr2.length) {
                                                break;
                                            } else if (intValue2 != 4 && ((View) editTextBoldCursorArr2[intValue2].getParent()).getVisibility() == 0) {
                                                dl0Var3.f[intValue2].requestFocus();
                                                break;
                                            }
                                        }
                                    }
                                    break;
                                case 3:
                                    dl0 dl0Var4 = this.b;
                                    dl0Var4.getClass();
                                    if (i332 != 5) {
                                        if (i332 == 6) {
                                            dl0Var4.n.performClick();
                                            break;
                                        }
                                    } else {
                                        int intValue3 = ((Integer) textView22.getTag()).intValue();
                                        do {
                                            int i342 = intValue3 + 1;
                                            editTextBoldCursorArr = dl0Var4.f;
                                            if (i342 >= editTextBoldCursorArr.length) {
                                                break;
                                            } else {
                                                intValue3 = i342 == 4 ? intValue3 + 2 : i342;
                                            }
                                        } while (((View) editTextBoldCursorArr[intValue3].getParent()).getVisibility() != 0);
                                        dl0Var4.f[intValue3].requestFocus();
                                        break;
                                    }
                                    break;
                                default:
                                    dl0 dl0Var5 = this.b;
                                    if (i332 != 6) {
                                        dl0Var5.getClass();
                                        break;
                                    } else {
                                        dl0Var5.n.performClick();
                                        break;
                                    }
                            }
                            return false;
                        }
                    });
                    textView3.addTextChangedListener(new sk0(this, i70));
                    this.R.addView(this.T, b8.mf.o(-1, -2));
                    this.N[2] = new org.telegram.ui.Cells.y8(context, this.Z0);
                    org.telegram.ui.ActionBar.r6.a0(this.N[2], context, R.drawable.greydivider, org.telegram.ui.ActionBar.k6.b7);
                    this.R.addView(this.N[2], b8.mf.o(-1, -2));
                    this.O[1] = new org.telegram.ui.Cells.v9(context, this.Z0);
                    org.telegram.ui.Cells.v9 v9Var = this.O[1];
                    org.telegram.ui.Cells.y N03 = org.telegram.ui.ActionBar.k6.N0(true);
                    org.telegram.ui.ActionBar.n6 N3 = org.telegram.ui.ActionBar.r6.N(i69);
                    int i71 = org.telegram.ui.ActionBar.k6.i6;
                    org.telegram.ui.ActionBar.r6.S(v9Var, N03, N3, org.telegram.ui.ActionBar.r6.N(i71));
                    org.telegram.ui.Cells.v9 v9Var2 = this.O[1];
                    int i72 = org.telegram.ui.ActionBar.k6.G6;
                    v9Var2.setTag(Integer.valueOf(i72));
                    org.telegram.ui.ActionBar.r6.V(this.O[1].getTextView(), i72, getResourceProvider());
                    this.O[1].b(org.telegram.messenger.bd.L0(2131746131), true);
                    this.R.addView(this.O[1], b8.mf.o(-1, -2));
                    this.O[1].setOnClickListener(new ak0(this, 7));
                    this.O[0] = new org.telegram.ui.Cells.v9(context, this.Z0);
                    org.telegram.ui.ActionBar.r6.S(this.O[0], org.telegram.ui.ActionBar.k6.N0(true), org.telegram.ui.ActionBar.r6.N(i69), org.telegram.ui.ActionBar.r6.N(i71));
                    org.telegram.ui.Cells.v9 v9Var3 = this.O[0];
                    int i73 = org.telegram.ui.ActionBar.k6.p7;
                    v9Var3.setTag(Integer.valueOf(i73));
                    org.telegram.ui.ActionBar.r6.V(this.O[0].getTextView(), i73, getResourceProvider());
                    this.O[0].b(org.telegram.messenger.bd.L0(2131754948), false);
                    this.R.addView(this.O[0], b8.mf.o(-1, -2));
                    this.O[0].setOnClickListener(new ak0(this, 8));
                    this.f = new EditTextBoldCursor[3];
                    int i74 = 0;
                    for (int i75 = 3; i74 < i75; i75 = 3) {
                        if (i74 == 0) {
                            this.J[0] = new org.telegram.ui.Cells.n4(context, this.Z0);
                            org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d6, this.J[0], getResourceProvider());
                            this.J[0].setText(org.telegram.messenger.bd.L0(2131747394));
                            this.R.addView(this.J[0], b8.mf.o(-1, -2));
                        } else if (i74 == 2) {
                            this.J[1] = new org.telegram.ui.Cells.n4(context, this.Z0);
                            org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d6, this.J[1], getResourceProvider());
                            this.J[1].setText(org.telegram.messenger.bd.L0(2131747398));
                            this.R.addView(this.J[1], b8.mf.o(-1, -2));
                        }
                        FrameLayout frameLayout6 = new FrameLayout(context);
                        frameLayout6.setClipChildren(false);
                        this.R.addView(frameLayout6, b8.mf.o(-1, 50));
                        int i76 = org.telegram.ui.ActionBar.k6.d6;
                        org.telegram.ui.ActionBar.r6.i(i76, frameLayout6, getResourceProvider());
                        if (i74 == 0) {
                            org.telegram.ui.Components.sm smVar4 = new org.telegram.ui.Components.sm(context, 17);
                            org.telegram.ui.ActionBar.r6.i(i76, smVar4, getResourceProvider());
                            this.K.add(smVar4);
                            frameLayout6.addView(smVar4, new FrameLayout.LayoutParams(-1, 1, 83));
                        }
                        this.f[i74] = new EditTextBoldCursor(context);
                        this.f[i74].setTag(Integer.valueOf(i74));
                        this.f[i74].setTextSize(1, 16.0f);
                        org.telegram.ui.ActionBar.r6.E(this.f[i74], org.telegram.ui.ActionBar.k6.H6, getResourceProvider());
                        EditTextBoldCursor editTextBoldCursor8 = this.f[i74];
                        int i77 = org.telegram.ui.ActionBar.k6.G6;
                        org.telegram.ui.ActionBar.r6.V(editTextBoldCursor8, i77, getResourceProvider());
                        this.f[i74].setBackgroundDrawable(null);
                        org.telegram.ui.ActionBar.r6.w(this.f[i74], i77, getResourceProvider());
                        this.f[i74].setCursorSize(org.telegram.messenger.g0.L(20.0f));
                        this.f[i74].setCursorWidth(1.5f);
                        if (i74 == 0 || i74 == 1) {
                            this.f[i74].setInputType(i47);
                            this.f[i74].setTypeface(Typeface.DEFAULT);
                            this.f[i74].setImeOptions(268435461);
                        } else {
                            this.f[i74].setInputType(33);
                            this.f[i74].setImeOptions(268435462);
                        }
                        if (i74 == 0) {
                            this.f[i74].setHint(org.telegram.messenger.bd.L0(2131747397));
                            this.f[i74].requestFocus();
                        } else if (i74 == 1) {
                            this.f[i74].setHint(org.telegram.messenger.bd.L0(2131747395));
                        } else if (i74 == 2) {
                            this.f[i74].setHint(org.telegram.messenger.bd.L0(2131747400));
                        }
                        this.f[i74].setPadding(0, 0, 0, org.telegram.messenger.g0.L(6.0f));
                        this.f[i74].setGravity(org.telegram.messenger.bd.a0 ? 5 : 3);
                        frameLayout6.addView(this.f[i74], b8.mf.d(-1, -2.0f, 51, 21.0f, 12.0f, 21.0f, 6.0f));
                        final int i78 = 1;
                        this.f[i74].setOnEditorActionListener(new TextView.OnEditorActionListener(this) { // from class: org.telegram.ui.dk0
                            public final /* synthetic */ dl0 b;

                            {
                                this.b = this;
                            }

                            @Override // android.widget.TextView.OnEditorActionListener
                            public final boolean onEditorAction(TextView textView22, int i332, KeyEvent keyEvent) {
                                EditTextBoldCursor[] editTextBoldCursorArr;
                                switch (i78) {
                                    case 0:
                                        dl0 dl0Var = this.b;
                                        if (i332 != 6) {
                                            dl0Var.getClass();
                                            break;
                                        } else {
                                            dl0Var.G0(false);
                                            break;
                                        }
                                    case 1:
                                        dl0 dl0Var2 = this.b;
                                        if (i332 != 6) {
                                            dl0Var2.getClass();
                                            if (i332 == 5) {
                                                int intValue = ((Integer) textView22.getTag()).intValue();
                                                if (intValue != 0) {
                                                    if (intValue == 1) {
                                                        dl0Var2.f[2].requestFocus();
                                                        break;
                                                    }
                                                } else {
                                                    dl0Var2.f[1].requestFocus();
                                                    break;
                                                }
                                            }
                                        } else {
                                            dl0Var2.n.performClick();
                                            break;
                                        }
                                        break;
                                    case 2:
                                        dl0 dl0Var3 = this.b;
                                        dl0Var3.getClass();
                                        if (i332 != 5) {
                                            if (i332 == 6) {
                                                dl0Var3.n.performClick();
                                                break;
                                            }
                                        } else {
                                            int intValue2 = ((Integer) textView22.getTag()).intValue();
                                            while (true) {
                                                intValue2++;
                                                EditTextBoldCursor[] editTextBoldCursorArr2 = dl0Var3.f;
                                                if (intValue2 >= editTextBoldCursorArr2.length) {
                                                    break;
                                                } else if (intValue2 != 4 && ((View) editTextBoldCursorArr2[intValue2].getParent()).getVisibility() == 0) {
                                                    dl0Var3.f[intValue2].requestFocus();
                                                    break;
                                                }
                                            }
                                        }
                                        break;
                                    case 3:
                                        dl0 dl0Var4 = this.b;
                                        dl0Var4.getClass();
                                        if (i332 != 5) {
                                            if (i332 == 6) {
                                                dl0Var4.n.performClick();
                                                break;
                                            }
                                        } else {
                                            int intValue3 = ((Integer) textView22.getTag()).intValue();
                                            do {
                                                int i342 = intValue3 + 1;
                                                editTextBoldCursorArr = dl0Var4.f;
                                                if (i342 >= editTextBoldCursorArr.length) {
                                                    break;
                                                } else {
                                                    intValue3 = i342 == 4 ? intValue3 + 2 : i342;
                                                }
                                            } while (((View) editTextBoldCursorArr[intValue3].getParent()).getVisibility() != 0);
                                            dl0Var4.f[intValue3].requestFocus();
                                            break;
                                        }
                                        break;
                                    default:
                                        dl0 dl0Var5 = this.b;
                                        if (i332 != 6) {
                                            dl0Var5.getClass();
                                            break;
                                        } else {
                                            dl0Var5.n.performClick();
                                            break;
                                        }
                                }
                                return false;
                            }
                        });
                        if (i74 == 1) {
                            this.N[0] = new org.telegram.ui.Cells.y8(context, this.Z0);
                            this.N[0].setText(org.telegram.messenger.bd.L0(2131747396));
                            org.telegram.ui.ActionBar.r6.a0(this.N[0], context, R.drawable.greydivider, org.telegram.ui.ActionBar.k6.b7);
                            this.R.addView(this.N[0], b8.mf.o(-1, -2));
                        } else if (i74 == 2) {
                            this.N[1] = new org.telegram.ui.Cells.y8(context, this.Z0);
                            this.N[1].setText(org.telegram.messenger.bd.L0(2131747399));
                            org.telegram.ui.ActionBar.r6.a0(this.N[1], context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.k6.b7);
                            this.R.addView(this.N[1], b8.mf.o(-1, -2));
                        }
                        i74++;
                        i47 = org.telegram.messenger.hs.N1;
                    }
                    P0();
                }
            }
        }
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.cs
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        if (i3 == org.telegram.messenger.hs.p0) {
            TLRPC.PaymentForm paymentForm = this.D0;
            paymentForm.password_missing = false;
            paymentForm.can_save_credentials = true;
            Q0();
            return;
        }
        if (i3 == org.telegram.messenger.hs.r0) {
            TLRPC.PaymentForm paymentForm2 = this.D0;
            paymentForm2.password_missing = true;
            paymentForm2.can_save_credentials = false;
            Q0();
            return;
        }
        if (i3 == org.telegram.messenger.hs.a1) {
            this.b1 = true;
            removeSelfFromStack();
        }
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final org.telegram.ui.ActionBar.e6 getResourceProvider() {
        return this.Z0;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.F, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.s8));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.actionBar, TLObject.FLAG_27, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.C8));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.actionBar, 67108864, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.D8));
        if (this.f != null) {
            int i3 = 0;
            while (true) {
                EditTextBoldCursor[] editTextBoldCursorArr = this.f;
                if (i3 >= editTextBoldCursorArr.length) {
                    break;
                }
                arrayList.add(new org.telegram.ui.ActionBar.t6((View) editTextBoldCursorArr[i3].getParent(), 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.d6));
                i3++;
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
            org.telegram.ui.Cells.n4[] n4VarArr = this.J;
            if (i11 >= n4VarArr.length) {
                break;
            }
            arrayList.add(new org.telegram.ui.ActionBar.t6(n4VarArr[i11], 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.d6));
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
            arrayList.add(new org.telegram.ui.ActionBar.t6((View) arrayList2.get(i14), 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.d6));
            i14++;
        }
        int i15 = 1;
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.M, 0, new Class[]{org.telegram.ui.Cells.q8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.M6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.M, 0, new Class[]{org.telegram.ui.Cells.q8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.N6));
        for (int i16 = 0; i16 < this.O.length; i16++) {
        }
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.V, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.s6));
        while (true) {
            org.telegram.ui.Cells.x8[] x8VarArr = this.Z;
            if (i15 >= x8VarArr.length) {
                arrayList.add(new org.telegram.ui.ActionBar.t6(this.X, TLObject.FLAG_28, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.d6));
                arrayList.add(new org.telegram.ui.ActionBar.t6(this.X, TLObject.FLAG_28, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.i6));
                return arrayList;
            }
            arrayList.add(new org.telegram.ui.ActionBar.t6(x8VarArr[i15], 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.d6));
            i15++;
        }
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return this.H;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onActivityResultFragment(int i3, int i10, Intent intent) {
        if (i3 == 991) {
            org.telegram.messenger.g0.h3(new rw(this, i10, intent, 5));
        }
    }

    @Override // org.telegram.ui.ActionBar.d2
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

    @Override // org.telegram.ui.ActionBar.d2
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        if (this.v0 == 4 && this.Y0) {
            this.Y0 = false;
            this.X.callOnClick();
        }
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean onFragmentCreate() {
        org.telegram.messenger.hs.f(this.currentAccount).c(this, org.telegram.messenger.hs.p0);
        org.telegram.messenger.hs.f(this.currentAccount).c(this, org.telegram.messenger.hs.r0);
        if (this.v0 != 4 || this.W0) {
            org.telegram.messenger.hs.f(this.currentAccount).b(this, org.telegram.messenger.hs.a1);
        }
        return super.onFragmentCreate();
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00c5, code lost:
    
        if (r0 != 6) goto L56;
     */
    @Override // org.telegram.ui.ActionBar.d2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onFragmentDestroy() {
        bl0 bl0Var = this.U;
        if (bl0Var != null) {
            bl0Var.b();
        }
        int i3 = 0;
        org.telegram.messenger.g0.u(getParentActivity(), false);
        if (!this.b1) {
            this.g1 = 2;
            if (this.a1 != null) {
                org.telegram.ui.ActionBar.q4 q4Var = this.parentLayout;
                if (q4Var != null && q4Var.getFragmentStack() != null) {
                    int indexOf = this.parentLayout.getFragmentStack().indexOf(this);
                    if (indexOf == -1) {
                        indexOf = this.parentLayout.getFragmentStack().size();
                    }
                    while (true) {
                        if (i3 >= this.parentLayout.getFragmentStack().size()) {
                            i3 = indexOf;
                            break;
                        } else if (((org.telegram.ui.ActionBar.d2) this.parentLayout.getFragmentStack().get(i3)) instanceof dl0) {
                            break;
                        } else {
                            i3++;
                        }
                    }
                    i3 -= indexOf;
                }
                if (i3 == 0) {
                    this.a1.e(this.g1);
                }
            }
        }
        org.telegram.messenger.hs.f(this.currentAccount).n(this, org.telegram.messenger.hs.p0);
        org.telegram.messenger.hs.f(this.currentAccount).n(this, org.telegram.messenger.hs.r0);
        if (this.v0 != 4 || this.W0) {
            org.telegram.messenger.hs.f(this.currentAccount).n(this, org.telegram.messenger.hs.a1);
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
        if (org.telegram.messenger.az.s.length() != 0) {
            if (org.telegram.messenger.az.A) {
            }
            super.onFragmentDestroy();
            this.R0 = true;
        }
        getParentActivity().getWindow().clearFlags(TLObject.FLAG_13);
        org.telegram.messenger.g0.h2();
        super.onFragmentDestroy();
        this.R0 = true;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onResume() {
        super.onResume();
        org.telegram.messenger.g0.a3(getParentActivity(), this.classGuid);
        try {
            int i3 = this.v0;
            if ((i3 == 2 || i3 == 6) && !this.D0.invoice.test) {
                getParentActivity().getWindow().setFlags(TLObject.FLAG_13, TLObject.FLAG_13);
                org.telegram.messenger.g0.h2();
                return;
            }
            if (org.telegram.messenger.az.s.length() != 0 && !org.telegram.messenger.az.A) {
                return;
            }
            getParentActivity().getWindow().clearFlags(TLObject.FLAG_13);
            org.telegram.messenger.g0.h2();
        } catch (Throwable th2) {
            org.telegram.messenger.a8.g(th2, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onThemeColorsChanged() {
        try {
            ScrollView scrollView = this.F;
            if (scrollView != null) {
                org.telegram.messenger.g0.z3(scrollView, getThemedColor(org.telegram.ui.ActionBar.k6.s8));
            }
            if (this.f == null) {
                return;
            }
            getThemedColor(org.telegram.ui.ActionBar.k6.G6);
            int i3 = 0;
            while (true) {
                EditTextBoldCursor[] editTextBoldCursorArr = this.f;
                if (i3 >= editTextBoldCursorArr.length) {
                    return;
                }
                EditTextBoldCursor editTextBoldCursor = editTextBoldCursorArr[i3];
                if (editTextBoldCursor != null) {
                    org.telegram.ui.ActionBar.r6.m(editTextBoldCursor, 30, org.telegram.ui.ActionBar.k6.G6, this.Z0);
                }
                i3++;
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.d2
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
        int i3 = this.v0;
        if (i3 == 2) {
            org.telegram.messenger.g0.i3(new ek0(this, 3), 100L);
            return;
        }
        if (i3 == 3) {
            this.f[1].requestFocus();
            org.telegram.messenger.g0.K3(this.f[1]);
            return;
        }
        if (i3 == 4) {
            EditTextBoldCursor[] editTextBoldCursorArr = this.f;
            if (editTextBoldCursorArr != null) {
                editTextBoldCursorArr[0].requestFocus();
                return;
            }
            return;
        }
        if (i3 != 6 || this.c0) {
            return;
        }
        this.f[0].requestFocus();
        org.telegram.messenger.g0.K3(this.f[0]);
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean presentFragment(org.telegram.ui.ActionBar.d2 d2Var) {
        E0(d2Var);
        return super.presentFragment(d2Var);
    }

    public final void s0(Context context) {
        FrameLayout frameLayout = new FrameLayout(context);
        this.P = frameLayout;
        org.telegram.ui.Cells.y N0 = org.telegram.ui.ActionBar.k6.N0(true);
        org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(org.telegram.ui.ActionBar.k6.d6);
        org.telegram.ui.ActionBar.n6 N2 = org.telegram.ui.ActionBar.r6.N(org.telegram.ui.ActionBar.k6.i6);
        frameLayout.setBackground(N0);
        org.telegram.ui.ActionBar.r6.k(frameLayout, N0, N, N2, null);
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
        this.P.addView(this.Q, b8.mf.c(48.0f, -1));
        this.Q.setOnClickListener(new ak0(this, 13));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setWeightSum(2.0f);
        linearLayout.setGravity(16);
        linearLayout.setOrientation(1);
        linearLayout.setDuplicateParentStateEnabled(true);
        this.Q.addView(linearLayout, b8.mf.c(-1.0f, -1));
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageView.setDuplicateParentStateEnabled(true);
        imageView.setImageResource(R.drawable.buy_with_googlepay_button_content);
        linearLayout.addView(imageView, b8.mf.l(1.0f, -1, 0));
        ImageView imageView2 = new ImageView(context);
        imageView2.setScaleType(ImageView.ScaleType.FIT_XY);
        imageView2.setDuplicateParentStateEnabled(true);
        imageView2.setImageResource(R.drawable.googlepay_button_overlay);
        this.Q.addView(imageView2, b8.mf.c(-1.0f, -1));
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
                    str = mf.b.d(telephonyManager.getLine1Number(), false);
                }
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                int i3 = 4;
                String str2 = null;
                if (str.length() > 4) {
                    while (true) {
                        if (i3 < 1) {
                            z10 = false;
                            break;
                        }
                        String substring = str.substring(0, i3);
                        if (((String) this.c.get(substring)) != null) {
                            str2 = str.substring(i3);
                            this.f[8].setText(substring);
                            z10 = true;
                            break;
                        }
                        i3--;
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
        return org.telegram.messenger.m5.n(inputPeer);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final String x0(ArrayList arrayList) {
        String str;
        double d;
        long j10 = 0;
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            j10 += ((TLRPC.TL_labeledPrice) arrayList.get(i3)).amount;
        }
        org.telegram.messenger.bd.E0();
        String upperCase = this.D0.invoice.currency.toUpperCase();
        long abs = Math.abs(j10);
        upperCase.getClass();
        char c2 = 65535;
        switch (upperCase.hashCode()) {
            case 65726:
                if (upperCase.equals("BHD")) {
                    c2 = 0;
                    break;
                }
                break;
            case 65759:
                if (upperCase.equals("BIF")) {
                    c2 = 1;
                    break;
                }
                break;
            case 66267:
                if (upperCase.equals("BYR")) {
                    c2 = 2;
                    break;
                }
                break;
            case 66813:
                if (upperCase.equals("CLF")) {
                    c2 = 3;
                    break;
                }
                break;
            case 66823:
                if (upperCase.equals("CLP")) {
                    c2 = 4;
                    break;
                }
                break;
            case 67122:
                if (upperCase.equals("CVE")) {
                    c2 = 5;
                    break;
                }
                break;
            case 67712:
                if (upperCase.equals("DJF")) {
                    c2 = 6;
                    break;
                }
                break;
            case 70719:
                if (upperCase.equals("GNF")) {
                    c2 = 7;
                    break;
                }
                break;
            case 72732:
                if (upperCase.equals("IQD")) {
                    c2 = '\b';
                    break;
                }
                break;
            case 72777:
                if (upperCase.equals("IRR")) {
                    c2 = '\t';
                    break;
                }
                break;
            case 72801:
                if (upperCase.equals("ISK")) {
                    c2 = '\n';
                    break;
                }
                break;
            case 73631:
                if (upperCase.equals("JOD")) {
                    c2 = 11;
                    break;
                }
                break;
            case 73683:
                if (upperCase.equals("JPY")) {
                    c2 = '\f';
                    break;
                }
                break;
            case 74532:
                if (upperCase.equals("KMF")) {
                    c2 = '\r';
                    break;
                }
                break;
            case 74704:
                if (upperCase.equals("KRW")) {
                    c2 = 14;
                    break;
                }
                break;
            case 74840:
                if (upperCase.equals("KWD")) {
                    c2 = 15;
                    break;
                }
                break;
            case 75863:
                if (upperCase.equals("LYD")) {
                    c2 = 16;
                    break;
                }
                break;
            case 76263:
                if (upperCase.equals("MGA")) {
                    c2 = 17;
                    break;
                }
                break;
            case 76618:
                if (upperCase.equals("MRO")) {
                    c2 = 18;
                    break;
                }
                break;
            case 78388:
                if (upperCase.equals("OMR")) {
                    c2 = 19;
                    break;
                }
                break;
            case 79710:
                if (upperCase.equals("PYG")) {
                    c2 = 20;
                    break;
                }
                break;
            case 81569:
                if (upperCase.equals("RWF")) {
                    c2 = 21;
                    break;
                }
                break;
            case 83210:
                if (upperCase.equals("TND")) {
                    c2 = 22;
                    break;
                }
                break;
            case 83974:
                if (upperCase.equals("UGX")) {
                    c2 = 23;
                    break;
                }
                break;
            case 84517:
                if (upperCase.equals("UYI")) {
                    c2 = 24;
                    break;
                }
                break;
            case 85132:
                if (upperCase.equals("VND")) {
                    c2 = 25;
                    break;
                }
                break;
            case 85367:
                if (upperCase.equals("VUV")) {
                    c2 = 26;
                    break;
                }
                break;
            case 86653:
                if (upperCase.equals("XAF")) {
                    c2 = 27;
                    break;
                }
                break;
            case 87087:
                if (upperCase.equals("XOF")) {
                    c2 = 28;
                    break;
                }
                break;
            case 87118:
                if (upperCase.equals("XPF")) {
                    c2 = 29;
                    break;
                }
                break;
        }
        str = " %.0f";
        switch (c2) {
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
                double d10 = abs / 100.0f;
                str = abs % 100 != 0 ? " %.2f" : " %.0f";
                d = d10;
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
        long j10 = 0;
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            j10 += ((TLRPC.TL_labeledPrice) arrayList.get(i3)).amount;
        }
        Long l10 = this.I0;
        if (l10 != null) {
            j10 += l10.longValue();
        }
        return org.telegram.messenger.bd.E0().p(j10, this.D0.invoice.currency);
    }

    public final void z0() {
        int i3;
        int i10;
        boolean z10;
        int i11 = this.v0;
        if (i11 == 0) {
            bl0 bl0Var = this.U;
            if (bl0Var != null) {
                bl0Var.d(this.J0);
                finishFragment();
                return;
            }
            if (this.D0.invoice.flexible) {
                i3 = 1;
            } else if (this.z0 == null && this.x0 == null) {
                i3 = 2;
            } else {
                if (org.telegram.messenger.h10.i(this.currentAccount).y != null && org.telegram.messenger.h10.i(this.currentAccount).y.valid_until < ConnectionsManager.getInstance(this.currentAccount).getCurrentTime() + 60) {
                    org.telegram.messenger.h10.i(this.currentAccount).y = null;
                    org.telegram.messenger.h10.i(this.currentAccount).v(false);
                }
                i3 = org.telegram.messenger.h10.i(this.currentAccount).y != null ? 4 : 3;
            }
            if (i3 == 2 && this.z0 == null && this.x0 == null && !this.D0.additional_methods.isEmpty()) {
                M0(new ek0(this, 0));
                return;
            }
            dl0 dl0Var = new dl0(this.c1, this.D0, this.O0, this.P0, i3, this.F0, null, null, this.x0, this.y0, this.J0, this.V0, this.K0, this.s0, this.X0);
            dl0Var.d1 = this.d1;
            dl0Var.e1 = this.e1;
            presentFragment(dl0Var, this.T0);
            return;
        }
        if (i11 == 1) {
            if (this.x0 == null && this.y0 == null) {
                if (this.z0 != null) {
                    if (org.telegram.messenger.h10.i(this.currentAccount).y != null && org.telegram.messenger.h10.i(this.currentAccount).y.valid_until < ConnectionsManager.getInstance(this.currentAccount).getCurrentTime() + 60) {
                        org.telegram.messenger.h10.i(this.currentAccount).y = null;
                        org.telegram.messenger.h10.i(this.currentAccount).v(false);
                    }
                    if (org.telegram.messenger.h10.i(this.currentAccount).y == null) {
                        i10 = 3;
                    }
                } else {
                    i10 = 2;
                }
                if (i10 != 2 && this.y0 == null && this.z0 == null && this.x0 == null && !this.D0.additional_methods.isEmpty()) {
                    M0(new ek0(this, 0));
                    return;
                }
                dl0 dl0Var2 = new dl0(this.c1, this.D0, this.O0, this.P0, i10, this.F0, this.H0, this.I0, this.x0, this.y0, this.J0, this.V0, this.K0, this.s0, this.X0);
                dl0Var2.d1 = this.d1;
                dl0Var2.e1 = this.e1;
                presentFragment(dl0Var2, this.T0);
                return;
            }
            i10 = 4;
            if (i10 != 2) {
            }
            dl0 dl0Var22 = new dl0(this.c1, this.D0, this.O0, this.P0, i10, this.F0, this.H0, this.I0, this.x0, this.y0, this.J0, this.V0, this.K0, this.s0, this.X0);
            dl0Var22.d1 = this.d1;
            dl0Var22.e1 = this.e1;
            presentFragment(dl0Var22, this.T0);
            return;
        }
        if (i11 == 2) {
            TLRPC.PaymentForm paymentForm = this.D0;
            if (paymentForm.password_missing && (z10 = this.V0)) {
                dl0 dl0Var3 = new dl0(this.c1, paymentForm, this.O0, this.P0, 6, this.F0, this.H0, this.I0, this.x0, this.y0, this.J0, z10, this.K0, this.s0, this.X0);
                this.g0 = dl0Var3;
                dl0Var3.d1 = this.d1;
                dl0Var3.e1 = this.e1;
                dl0Var3.I0(this.b0);
                dl0 dl0Var4 = this.g0;
                dl0Var4.U = new uk0(this);
                presentFragment(dl0Var4, this.T0);
                return;
            }
            bl0 bl0Var2 = this.U;
            if (bl0Var2 != null) {
                bl0Var2.c(this.x0, this.y0, this.V0, this.K0, null);
                finishFragment();
                return;
            } else {
                dl0 dl0Var5 = new dl0(this.c1, paymentForm, this.O0, this.P0, 4, this.F0, this.H0, this.I0, this.x0, this.y0, this.J0, this.V0, this.K0, this.s0, this.X0);
                dl0Var5.d1 = this.d1;
                dl0Var5.e1 = this.e1;
                presentFragment(dl0Var5, this.T0);
                return;
            }
        }
        if (i11 == 3) {
            dl0 dl0Var6 = new dl0(this.c1, this.D0, this.O0, this.P0, this.w0 ? 4 : 2, this.F0, this.H0, this.I0, this.x0, this.y0, this.J0, this.V0, this.K0, this.s0, this.X0);
            dl0Var6.d1 = this.d1;
            dl0Var6.e1 = this.e1;
            presentFragment(dl0Var6, true);
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
            dl0 dl0Var7 = new dl0(this.c1, this.D0, this.O0, this.P0, 4, this.F0, this.H0, this.I0, this.x0, this.y0, this.J0, this.V0, this.K0, this.s0, false);
            dl0Var7.d1 = this.d1;
            dl0Var7.e1 = this.e1;
            presentFragment(dl0Var7, true);
            return;
        }
        boolean z11 = this.W0;
        int i12 = org.telegram.messenger.hs.a1;
        if (z11) {
            org.telegram.messenger.hs.f(this.currentAccount).n(this, i12);
        }
        org.telegram.messenger.hs.f(this.currentAccount).k(i12, new Object[0]);
        if (getMessagesController().l7 != null) {
            org.telegram.messenger.g0.i3(new ek0(this, 1), 500L);
        } else {
            if (D0(getParentLayout(), getParentActivity()) || isFinishing()) {
                return;
            }
            finishFragment();
        }
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean presentFragment(org.telegram.ui.ActionBar.d2 d2Var, boolean z10) {
        E0(d2Var);
        return super.presentFragment(d2Var, z10);
    }

    public dl0(TLRPC.PaymentForm paymentForm, org.telegram.messenger.zi ziVar, String str, org.telegram.ui.ActionBar.d2 d2Var) {
        super(null);
        this.a = new ArrayList();
        this.b = new HashMap();
        this.c = new HashMap();
        this.d = new HashMap();
        this.H = true;
        this.J = new org.telegram.ui.Cells.n4[3];
        this.K = new ArrayList();
        this.L = new org.telegram.ui.Cells.x6[3];
        this.N = new org.telegram.ui.Cells.y8[3];
        this.O = new org.telegram.ui.Cells.v9[2];
        this.Z = new org.telegram.ui.Cells.x8[7];
        this.a0 = -4.5f;
        this.d0 = 6;
        this.W0 = true;
        A0(null, paymentForm, ziVar, str, 4, null, null, null, null, null, null, false, null, d2Var, false);
    }

    public dl0(TLRPC.PaymentReceipt paymentReceipt) {
        super(null);
        this.a = new ArrayList();
        this.b = new HashMap();
        this.c = new HashMap();
        this.d = new HashMap();
        this.H = true;
        this.J = new org.telegram.ui.Cells.n4[3];
        this.K = new ArrayList();
        this.L = new org.telegram.ui.Cells.x6[3];
        this.N = new org.telegram.ui.Cells.y8[3];
        this.O = new org.telegram.ui.Cells.v9[2];
        this.Z = new org.telegram.ui.Cells.x8[7];
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
        long j10 = paymentReceipt.tip_amount;
        if (j10 != 0) {
            this.I0 = Long.valueOf(j10);
        }
        TLRPC.User a22 = getMessagesController().a2(Long.valueOf(paymentReceipt.bot_id));
        this.m0 = a22;
        if (a22 != null) {
            this.q0 = a22.first_name;
        } else {
            this.q0 = "";
        }
        this.r0 = paymentReceipt.title;
        if (paymentReceipt.info != null) {
            this.J0 = new TLRPC.TL_payments_validateRequestedInfo();
            if (this.O0 != null) {
                TLRPC.TL_inputInvoiceMessage tL_inputInvoiceMessage = new TLRPC.TL_inputInvoiceMessage();
                tL_inputInvoiceMessage.peer = getMessagesController().j1(paymentReceipt.bot_id);
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

    public dl0(TLRPC.PaymentForm paymentForm, TLRPC.InputInvoice inputInvoice, org.telegram.ui.ActionBar.d2 d2Var) {
        this(inputInvoice, paymentForm, null, null, 4, null, null, null, null, null, null, false, null, d2Var, false);
        this.W0 = true;
    }
}
