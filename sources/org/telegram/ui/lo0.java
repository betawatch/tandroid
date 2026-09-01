package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import android.os.Build;
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
import java.util.List;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SRPHelper;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class lo0 extends org.telegram.ui.ActionBar.p2 implements NotificationCenter.NotificationCenterDelegate {
    public static final List d1 = Arrays.asList("http", "https");
    public static final List e1 = Collections.singletonList("tg");
    public final TLRPC.PaymentReceipt A0;
    public ScrollView B;
    public TLRPC.TL_payments_validatedRequestedInfo B0;
    public boolean C;
    public TLRPC.TL_paymentFormMethod C0;
    public boolean D;
    public TLRPC.TL_shippingOption D0;
    public TextView E;
    public Long E0;
    public final org.telegram.ui.Cells.m4[] F;
    public TLRPC.TL_payments_validateRequestedInfo F0;
    public final ArrayList G;
    public TLRPC.TL_inputPaymentCredentialsGooglePay G0;
    public final org.telegram.ui.Cells.z6[] H;
    public String H0;
    public org.telegram.ui.Cells.s8 I;
    public String I0;
    public final org.telegram.ui.Cells.a9[] J;
    public JSONObject J0;
    public final org.telegram.ui.Cells.aa[] K;
    public MessageObject K0;
    public FrameLayout L;
    public String L0;
    public FrameLayout M;
    public boolean M0;
    public LinearLayout N;
    public boolean N0;
    public org.telegram.ui.Cells.b9 O;
    public String[] O0;
    public org.telegram.ui.Cells.j3 P;
    public boolean P0;
    public jo0 Q;
    public boolean Q0;
    public TextView R;
    public boolean R0;
    public org.telegram.ui.Cells.o6 S;
    public boolean S0;
    public ho0 T;
    public boolean T0;
    public org.telegram.ui.Cells.l5 U;
    public boolean U0;
    public final org.telegram.ui.Cells.z8[] V;
    public org.telegram.ui.ActionBar.g6 V0;
    public float W;
    public ko0 W0;
    public TL_account.Password X;
    public boolean X0;
    public boolean Y;
    public TLRPC.InputInvoice Y0;
    public int Z;
    public Utilities.Callback Z0;
    public final ArrayList a;
    public kn0 a0;
    public Utilities.Callback a1;
    public final HashMap b;
    public boolean b0;
    public i20 b1;
    public final HashMap c;
    public lo0 c0;
    public int c1;
    public final HashMap d;
    public boolean d0;
    public a8.e e;
    public boolean e0;
    public EditTextBoldCursor[] f;
    public boolean f0;
    public String g0;
    public org.telegram.ui.Cells.j6[] h;
    public boolean h0;
    public TLRPC.User i0;
    public boolean j0;
    public boolean k0;
    public boolean l0;
    public String m0;
    public org.telegram.ui.ActionBar.w0 n;
    public String n0;
    public org.telegram.ui.ActionBar.p2 o0;
    public pn0 p0;
    public ArrayList q0;
    public org.telegram.ui.Components.tq r;
    public int r0;
    public org.telegram.ui.Components.tq s;
    public boolean s0;
    public String t0;
    public String u0;
    public AnimatorSet v;
    public TLRPC.TL_paymentSavedCredentialsCard v0;
    public WebView w;
    public boolean w0;
    public String x;
    public tt x0;
    public boolean y;
    public String y0;
    public TLRPC.PaymentForm z0;

    public lo0(TLRPC.InputInvoice inputInvoice, TLRPC.PaymentForm paymentForm, MessageObject messageObject, String str, int i10, TLRPC.TL_payments_validatedRequestedInfo tL_payments_validatedRequestedInfo, TLRPC.TL_shippingOption tL_shippingOption, Long l10, String str2, String str3, TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo, boolean z4, TLRPC.TL_inputPaymentCredentialsGooglePay tL_inputPaymentCredentialsGooglePay, org.telegram.ui.ActionBar.p2 p2Var, boolean z10) {
        super(null);
        this.a = new ArrayList();
        this.b = new HashMap();
        this.c = new HashMap();
        this.d = new HashMap();
        this.D = true;
        this.F = new org.telegram.ui.Cells.m4[3];
        this.G = new ArrayList();
        this.H = new org.telegram.ui.Cells.z6[3];
        this.J = new org.telegram.ui.Cells.a9[3];
        this.K = new org.telegram.ui.Cells.aa[2];
        this.V = new org.telegram.ui.Cells.z8[7];
        this.W = -4.5f;
        this.Z = 6;
        u0(inputInvoice, paymentForm, messageObject, str, i10, tL_payments_validatedRequestedInfo, tL_shippingOption, l10, str2, str3, tL_payments_validateRequestedInfo, z4, tL_inputPaymentCredentialsGooglePay, p2Var, z10);
    }

    public static /* synthetic */ void U(lo0 lo0Var, TL_account.Password password, byte[] bArr) {
        TLRPC.PasswordKdfAlgo passwordKdfAlgo = password.current_algo;
        byte[] x10 = passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow ? SRPHelper.getX(bArr, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo) : null;
        TL_account.getTmpPassword gettmppassword = new TL_account.getTmpPassword();
        gettmppassword.period = 1800;
        tb0 tb0Var = new tb0(11, lo0Var, gettmppassword);
        TLRPC.PasswordKdfAlgo passwordKdfAlgo2 = password.current_algo;
        if (!(passwordKdfAlgo2 instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow)) {
            TLRPC.TL_error tL_error = new TLRPC.TL_error();
            tL_error.text = "PASSWORD_HASH_INVALID";
            tb0Var.run(null, tL_error);
            return;
        }
        TLRPC.TL_inputCheckPasswordSRP startCheck = SRPHelper.startCheck(x10, password.srp_id, password.srp_B, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo2);
        gettmppassword.password = startCheck;
        if (startCheck != null) {
            ConnectionsManager.getInstance(lo0Var.currentAccount).sendRequest(gettmppassword, tb0Var, 10);
            return;
        }
        TLRPC.TL_error tL_error2 = new TLRPC.TL_error();
        tL_error2.text = "ALGO_INVALID";
        tb0Var.run(null, tL_error2);
    }

    public static /* synthetic */ void V(lo0 lo0Var, TLRPC.TL_error tL_error, TLObject tLObject) {
        lo0Var.D0(false);
        lo0Var.H0(true, false);
        if (tL_error != null) {
            String str = tL_error.text;
            str.getClass();
            switch (str) {
                case "ADDRESS_CITY_INVALID":
                    lo0Var.E0(2);
                    break;
                case "ADDRESS_STREET_LINE1_INVALID":
                    lo0Var.E0(0);
                    break;
                case "ADDRESS_COUNTRY_INVALID":
                    lo0Var.E0(4);
                    break;
                case "REQ_INFO_NAME_INVALID":
                    lo0Var.E0(6);
                    break;
                case "ADDRESS_POSTCODE_INVALID":
                    lo0Var.E0(5);
                    break;
                case "ADDRESS_STATE_INVALID":
                    lo0Var.E0(3);
                    break;
                case "REQ_INFO_PHONE_INVALID":
                    lo0Var.E0(9);
                    break;
                case "ADDRESS_STREET_LINE2_INVALID":
                    lo0Var.E0(1);
                    break;
                case "REQ_INFO_EMAIL_INVALID":
                    lo0Var.E0(7);
                    break;
                default:
                    org.telegram.ui.Components.z4.f0(lo0Var.currentAccount, tL_error, lo0Var, tLObject, new Object[0]);
                    break;
            }
        }
    }

    public static /* synthetic */ void W(lo0 lo0Var, TLRPC.TL_payments_validatedRequestedInfo tL_payments_validatedRequestedInfo) {
        lo0Var.B0 = tL_payments_validatedRequestedInfo;
        if (lo0Var.z0.saved_info != null && !lo0Var.Q0) {
            TLRPC.TL_payments_clearSavedInfo tL_payments_clearSavedInfo = new TLRPC.TL_payments_clearSavedInfo();
            tL_payments_clearSavedInfo.info = true;
            ConnectionsManager.getInstance(lo0Var.currentAccount).sendRequest(tL_payments_clearSavedInfo, new oh.p5(16), lo0Var.T0 ? 8 : 0);
        }
        lo0Var.t0();
        lo0Var.D0(false);
        lo0Var.H0(true, false);
    }

    public static /* synthetic */ void X(lo0 lo0Var, TLRPC.TL_error tL_error, TLObject tLObject) {
        lo0Var.D0(false);
        lo0Var.H0(true, false);
        if (tL_error != null) {
            org.telegram.ui.Components.z4.f0(lo0Var.currentAccount, tL_error, lo0Var, tLObject, new Object[0]);
        }
    }

    public static /* synthetic */ void Y(lo0 lo0Var, org.telegram.ui.Components.ic icVar, boolean z4, TLRPC.Message message) {
        icVar.b();
        if (!z4) {
            TLRPC.TL_payments_getPaymentReceipt tL_payments_getPaymentReceipt = new TLRPC.TL_payments_getPaymentReceipt();
            tL_payments_getPaymentReceipt.msg_id = message.id;
            tL_payments_getPaymentReceipt.peer = MessagesController.getInstance(lo0Var.currentAccount).getInputPeer(message.peer_id);
            ConnectionsManager.getInstance(lo0Var.currentAccount).sendRequest(tL_payments_getPaymentReceipt, new nn0(lo0Var, 3), 2);
            return;
        }
        org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
        if (U != null) {
            U.presentFragment(xn.Q9(message.id, MessageObject.getDialogId(message)));
        }
    }

    public static void Z(lo0 lo0Var) {
        ConnectionsManager.getInstance(lo0Var.currentAccount).sendRequest(new TL_account.resendPasswordEmail(), new oh.p5(16), lo0Var.T0 ? 8 : 0);
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(lo0Var.getParentActivity());
        alertDialog$Builder.a.Q = LocaleController.getString(R.string.ResendCodeInfo);
        alertDialog$Builder.a.O = LocaleController.getString(R.string.AppName);
        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
        lo0Var.showDialog(alertDialog$Builder.a);
    }

    public static /* synthetic */ void a0(lo0 lo0Var, boolean z4, String str, String str2, TL_account.updatePasswordSettings updatepasswordsettings) {
        mh.k7 k7Var = new mh.k7(lo0Var, z4, str, 6);
        if (z4) {
            ConnectionsManager.getInstance(lo0Var.currentAccount).sendRequest(updatepasswordsettings, k7Var, 10);
            return;
        }
        byte[] stringBytes = AndroidUtilities.getStringBytes(str2);
        TLRPC.PasswordKdfAlgo passwordKdfAlgo = lo0Var.X.new_algo;
        if (!(passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow)) {
            TLRPC.TL_error tL_error = new TLRPC.TL_error();
            tL_error.text = "PASSWORD_HASH_INVALID";
            k7Var.run(null, tL_error);
            return;
        }
        updatepasswordsettings.new_settings.new_password_hash = SRPHelper.getVBytes(stringBytes, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
        if (updatepasswordsettings.new_settings.new_password_hash == null) {
            TLRPC.TL_error tL_error2 = new TLRPC.TL_error();
            tL_error2.text = "ALGO_INVALID";
            k7Var.run(null, tL_error2);
        }
        ConnectionsManager.getInstance(lo0Var.currentAccount).sendRequest(updatepasswordsettings, k7Var, 10);
    }

    public static /* synthetic */ void b0(lo0 lo0Var, TLRPC.TL_error tL_error, TLRPC.TL_payments_sendPaymentForm tL_payments_sendPaymentForm) {
        org.telegram.ui.Components.z4.f0(lo0Var.currentAccount, tL_error, lo0Var, tL_payments_sendPaymentForm, new Object[0]);
        lo0Var.D0(false);
        lo0Var.H0(false, false);
        lo0Var.X0 = true;
        lo0Var.c1 = 4;
        ko0 ko0Var = lo0Var.W0;
        if (ko0Var != null) {
            ko0Var.a(4);
        }
    }

    public static void c0(lo0 lo0Var, TLObject tLObject) {
        org.telegram.ui.ActionBar.p2 R;
        if (tLObject instanceof TLRPC.TL_payments_paymentReceiptStars) {
            mh.ja.j1(lo0Var.getParentActivity(), lo0Var.currentAccount, (TLRPC.TL_payments_paymentReceiptStars) tLObject, lo0Var.V0);
            return;
        }
        if (!(tLObject instanceof TLRPC.PaymentReceipt) || (R = LaunchActivity.R()) == null) {
            return;
        }
        org.telegram.ui.ActionBar.n2 n2Var = new org.telegram.ui.ActionBar.n2();
        n2Var.a = true;
        lo0 lo0Var2 = new lo0((TLRPC.PaymentReceipt) tLObject);
        lo0Var2.Z0 = lo0Var.Z0;
        lo0Var2.a1 = lo0Var.a1;
        R.showAsSheet(lo0Var2, n2Var);
    }

    public static /* synthetic */ void d0(lo0 lo0Var, TLObject tLObject, TLRPC.TL_error tL_error, TL_account.getTmpPassword gettmppassword) {
        lo0Var.H0(true, false);
        lo0Var.D0(false);
        if (tLObject != null) {
            lo0Var.s0 = true;
            UserConfig.getInstance(lo0Var.currentAccount).tmpPassword = (TL_account.tmpPassword) tLObject;
            UserConfig.getInstance(lo0Var.currentAccount).saveConfig(false);
            lo0Var.t0();
            return;
        }
        if (!tL_error.text.equals("PASSWORD_HASH_INVALID")) {
            org.telegram.ui.Components.z4.f0(lo0Var.currentAccount, tL_error, lo0Var, gettmppassword, new Object[0]);
            return;
        }
        try {
            lo0Var.f[1].performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        AndroidUtilities.shakeViewSpring(lo0Var.f[1], 3.25f);
        lo0Var.f[1].setText("");
    }

    public static void e0(lo0 lo0Var, TLObject tLObject) {
        org.telegram.ui.ActionBar.p2 R;
        if (tLObject instanceof TLRPC.TL_payments_paymentReceiptStars) {
            mh.ja.j1(lo0Var.getParentActivity(), lo0Var.currentAccount, (TLRPC.TL_payments_paymentReceiptStars) tLObject, lo0Var.V0);
            return;
        }
        if (!(tLObject instanceof TLRPC.PaymentReceipt) || (R = LaunchActivity.R()) == null) {
            return;
        }
        org.telegram.ui.ActionBar.n2 n2Var = new org.telegram.ui.ActionBar.n2();
        n2Var.a = true;
        lo0 lo0Var2 = new lo0((TLRPC.PaymentReceipt) tLObject);
        lo0Var2.Z0 = lo0Var.Z0;
        lo0Var2.a1 = lo0Var.a1;
        R.showAsSheet(lo0Var2, n2Var);
    }

    public static /* synthetic */ void f0(lo0 lo0Var, TLRPC.TL_error tL_error, TLObject tLObject, String str, TL_account.getPassword getpassword) {
        if (tL_error != null) {
            org.telegram.ui.Components.z4.f0(lo0Var.currentAccount, tL_error, lo0Var, getpassword, new Object[0]);
            lo0Var.H0(true, false);
            lo0Var.D0(false);
            return;
        }
        TL_account.Password password = (TL_account.Password) tLObject;
        if (!TwoStepVerificationActivity.i0(password, false)) {
            org.telegram.ui.Components.z4.x0(lo0Var.getParentActivity(), LocaleController.getString(R.string.UpdateAppAlert), true);
        } else if (password.has_password) {
            Utilities.globalQueue.postRunnable(new if0(lo0Var, password, AndroidUtilities.getStringBytes(str), 14));
        } else {
            lo0Var.s0 = false;
            lo0Var.t0();
        }
    }

    public static /* synthetic */ void g0(lo0 lo0Var, org.telegram.ui.Components.ic icVar, boolean z4, TLRPC.Message[] messageArr) {
        icVar.b();
        if (!z4) {
            TLRPC.TL_payments_getPaymentReceipt tL_payments_getPaymentReceipt = new TLRPC.TL_payments_getPaymentReceipt();
            tL_payments_getPaymentReceipt.msg_id = messageArr[0].id;
            tL_payments_getPaymentReceipt.peer = MessagesController.getInstance(lo0Var.currentAccount).getInputPeer(messageArr[0].peer_id);
            ConnectionsManager.getInstance(lo0Var.currentAccount).sendRequest(tL_payments_getPaymentReceipt, new nn0(lo0Var, 2), 2);
            return;
        }
        org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
        if (U != null) {
            U.presentFragment(xn.Q9(messageArr[0].id, MessageObject.getDialogId(messageArr[0])));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x00cb, code lost:
    
        if (r7.phone_requested == false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x00d7, code lost:
    
        if (r23.G0 == null) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x00e1, code lost:
    
        if (r2.invoice.flexible != false) goto L51;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void h0(lo0 lo0Var, String str, View view) {
        int i10;
        org.telegram.ui.Cells.o6 o6Var = lo0Var.S;
        if (o6Var != null && !lo0Var.C) {
            lo0Var.W = -lo0Var.W;
            AndroidUtilities.shakeViewSpring(o6Var.getTextView(), lo0Var.W);
            AndroidUtilities.shakeViewSpring(lo0Var.S.getCheckBox(), lo0Var.W);
            try {
                lo0Var.S.performHapticFeedback(3, 2);
                return;
            } catch (Exception unused) {
                return;
            }
        }
        boolean z4 = lo0Var.S0;
        int i11 = 1;
        if (z4 && lo0Var.z0.saved_info != null && lo0Var.F0 == null) {
            lo0Var.D0(true);
            he0 he0Var = new he0(23, lo0Var, view);
            if (lo0Var.N0) {
                return;
            }
            lo0Var.H0(true, true);
            TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo = new TLRPC.TL_payments_validateRequestedInfo();
            lo0Var.F0 = tL_payments_validateRequestedInfo;
            TLRPC.InputInvoice inputInvoice = lo0Var.Y0;
            if (inputInvoice != null) {
                tL_payments_validateRequestedInfo.invoice = inputInvoice;
            } else if (lo0Var.K0 != null) {
                TLRPC.TL_inputInvoiceMessage tL_inputInvoiceMessage = new TLRPC.TL_inputInvoiceMessage();
                tL_inputInvoiceMessage.peer = lo0Var.getMessagesController().getInputPeer(lo0Var.K0.messageOwner.peer_id);
                tL_inputInvoiceMessage.msg_id = lo0Var.K0.getId();
                lo0Var.F0.invoice = tL_inputInvoiceMessage;
            } else {
                TLRPC.TL_inputInvoiceSlug tL_inputInvoiceSlug = new TLRPC.TL_inputInvoiceSlug();
                tL_inputInvoiceSlug.slug = lo0Var.L0;
                lo0Var.F0.invoice = tL_inputInvoiceSlug;
            }
            TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo2 = lo0Var.F0;
            tL_payments_validateRequestedInfo2.save = true;
            tL_payments_validateRequestedInfo2.info = lo0Var.z0.saved_info;
            ConnectionsManager.getInstance(lo0Var.currentAccount).sendRequest(tL_payments_validateRequestedInfo2, new ba(lo0Var, he0Var, tL_payments_validateRequestedInfo2, 29), (lo0Var.T0 ? 8 : 0) | 2);
            return;
        }
        if (z4) {
            TLRPC.PaymentForm paymentForm = lo0Var.z0;
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
                        i10 = 0;
                        if (i10 != 2 && !paymentForm.additional_methods.isEmpty()) {
                            Objects.requireNonNull(view);
                            lo0Var.G0(new org.telegram.ui.Components.ju(0, view));
                            return;
                        } else {
                            lo0 lo0Var2 = new lo0(lo0Var.Y0, lo0Var.z0, lo0Var.K0, lo0Var.L0, i10, lo0Var.B0, lo0Var.D0, lo0Var.E0, lo0Var.t0, lo0Var.u0, lo0Var.F0, lo0Var.R0, null, lo0Var.o0, lo0Var.T0);
                            lo0Var2.Z0 = lo0Var.Z0;
                            lo0Var2.a1 = lo0Var.a1;
                            lo0Var.presentFragment(lo0Var2);
                            return;
                        }
                    }
                }
                i10 = (lo0Var.v0 == null && lo0Var.t0 == null && lo0Var.G0 == null) ? 2 : 1;
                if (i10 != 2) {
                }
                lo0 lo0Var22 = new lo0(lo0Var.Y0, lo0Var.z0, lo0Var.K0, lo0Var.L0, i10, lo0Var.B0, lo0Var.D0, lo0Var.E0, lo0Var.t0, lo0Var.u0, lo0Var.F0, lo0Var.R0, null, lo0Var.o0, lo0Var.T0);
                lo0Var22.Z0 = lo0Var.Z0;
                lo0Var22.a1 = lo0Var.a1;
                lo0Var.presentFragment(lo0Var22);
                return;
            }
            if (lo0Var.v0 == null) {
                if (lo0Var.t0 == null) {
                }
            }
            if (lo0Var.D0 == null) {
            }
        }
        if (!lo0Var.z0.password_missing && lo0Var.v0 != null) {
            if (UserConfig.getInstance(lo0Var.currentAccount).tmpPassword != null && UserConfig.getInstance(lo0Var.currentAccount).tmpPassword.valid_until < ConnectionsManager.getInstance(lo0Var.currentAccount).getCurrentTime() + 60) {
                UserConfig.getInstance(lo0Var.currentAccount).tmpPassword = null;
                UserConfig.getInstance(lo0Var.currentAccount).saveConfig(false);
            }
            if (UserConfig.getInstance(lo0Var.currentAccount).tmpPassword == null) {
                lo0Var.U0 = true;
                lo0 lo0Var3 = new lo0(lo0Var.Y0, lo0Var.z0, lo0Var.K0, lo0Var.L0, 3, lo0Var.B0, lo0Var.D0, lo0Var.E0, null, lo0Var.u0, lo0Var.F0, lo0Var.R0, null, lo0Var.o0, lo0Var.T0);
                lo0Var3.Z0 = lo0Var.Z0;
                lo0Var3.a1 = lo0Var.a1;
                lo0Var.presentFragment(lo0Var3);
                lo0Var.U0 = false;
                return;
            }
            if (lo0Var.S0) {
                lo0Var.S0 = false;
                NotificationCenter.getInstance(lo0Var.currentAccount).removeObserver(lo0Var, NotificationCenter.paymentFinished);
            }
        }
        TLRPC.User user = lo0Var.i0;
        if (user == null || user.verified) {
            lo0Var.I0(lo0Var.O0[0]);
            return;
        }
        String str2 = "payment_warning_" + lo0Var.i0.id;
        SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(lo0Var.currentAccount);
        if (notificationsSettings.getBoolean(str2, false)) {
            lo0Var.I0(lo0Var.O0[0]);
            return;
        }
        notificationsSettings.edit().putBoolean(str2, true).commit();
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(lo0Var.getParentActivity());
        String string = LocaleController.getString(R.string.PaymentWarning);
        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
        d2Var.O = string;
        d2Var.Q = LocaleController.formatString("PaymentWarningText", R.string.PaymentWarningText, lo0Var.m0, str);
        alertDialog$Builder.k(LocaleController.getString(R.string.Continue), new ln0(lo0Var, i11));
        lo0Var.showDialog(d2Var);
    }

    public static void i0(lo0 lo0Var, TLRPC.TL_error tL_error, boolean z4, TLObject tLObject, String str) {
        if (tL_error != null && "SRP_ID_INVALID".equals(tL_error.text)) {
            ConnectionsManager.getInstance(lo0Var.currentAccount).sendRequest(new TL_account.getPassword(), new org.telegram.messenger.zd(9, lo0Var, z4), 8);
            return;
        }
        lo0Var.H0(true, false);
        if (z4) {
            TL_account.Password password = lo0Var.X;
            password.has_password = false;
            password.current_algo = null;
            lo0Var.Q.a(password);
            lo0Var.finishFragment();
            return;
        }
        if (tL_error == null && (tLObject instanceof TLRPC.TL_boolTrue)) {
            if (lo0Var.getParentActivity() == null) {
                return;
            }
            lo0Var.t0();
            return;
        }
        if (tL_error != null) {
            if (!tL_error.text.equals("EMAIL_UNCONFIRMED") && !tL_error.text.startsWith("EMAIL_UNCONFIRMED_")) {
                if (tL_error.text.equals("EMAIL_INVALID")) {
                    lo0Var.F0(LocaleController.getString(R.string.AppName), LocaleController.getString(R.string.PasswordEmailInvalid));
                    return;
                } else if (!tL_error.text.startsWith("FLOOD_WAIT")) {
                    lo0Var.F0(LocaleController.getString(R.string.AppName), tL_error.text);
                    return;
                } else {
                    int intValue = Utilities.parseInt((CharSequence) tL_error.text).intValue();
                    lo0Var.F0(LocaleController.getString(R.string.AppName), LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, intValue < 60 ? LocaleController.formatPluralString("Seconds", intValue, new Object[0]) : LocaleController.formatPluralString("Minutes", intValue / 60, new Object[0])));
                    return;
                }
            }
            lo0Var.Z = Utilities.parseInt((CharSequence) tL_error.text).intValue();
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(lo0Var.getParentActivity());
            alertDialog$Builder.k(LocaleController.getString(R.string.OK), new vl0(3, lo0Var, str));
            String string = LocaleController.getString(R.string.YourEmailAlmostThereText);
            org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
            d2Var.Q = string;
            d2Var.O = LocaleController.getString(R.string.YourEmailAlmostThere);
            Dialog showDialog = lo0Var.showDialog(d2Var);
            if (showDialog != null) {
                showDialog.setCanceledOnTouchOutside(false);
                showDialog.setCancelable(false);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:79:0x0206, code lost:
    
        if (r9 == false) goto L94;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0274  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void j0(lo0 lo0Var) {
        Integer num;
        Integer num2;
        boolean z4;
        boolean z10;
        Integer num3;
        boolean z11;
        boolean z12;
        String[] split = lo0Var.f[1].getText().toString().split("/");
        if (split.length == 2) {
            Integer parseInt = Utilities.parseInt((CharSequence) split[0]);
            num2 = Utilities.parseInt((CharSequence) split[1]);
            num = parseInt;
        } else {
            num = null;
            num2 = null;
        }
        gc.a aVar = new gc.a(lo0Var.f[0].getText().toString(), num, num2, lo0Var.f[3].getText().toString(), lo0Var.f[2].getText().toString(), null, null, null, null, lo0Var.f[5].getText().toString(), lo0Var.f[4].getText().toString(), null, null, null, null, null, null);
        lo0Var.u0 = aVar.a() + " *" + aVar.b();
        boolean z13 = num != null && num2 != null && UserConfig.getInstance(lo0Var.currentAccount).getClientPhone().startsWith("7") && "smartglocal".equals(lo0Var.z0.native_provider) && (num2.intValue() > 22 || (num2.intValue() == 22 && num.intValue() > 1));
        String str = aVar.a;
        if (!j7.q8.d(str)) {
            String replaceAll = str.trim().replaceAll("\\s+|-", "");
            if (!j7.q8.d(replaceAll) && replaceAll != null) {
                int i10 = 0;
                while (true) {
                    if (i10 >= replaceAll.length()) {
                        int length = replaceAll.length() - 1;
                        int i11 = 0;
                        boolean z14 = true;
                        while (true) {
                            if (length >= 0) {
                                char charAt = replaceAll.charAt(length);
                                if (!Character.isDigit(charAt)) {
                                    break;
                                }
                                int parseInt2 = Integer.parseInt("" + charAt);
                                boolean z15 = z14 ^ true;
                                if (!z14) {
                                    parseInt2 *= 2;
                                }
                                if (parseInt2 > 9) {
                                    parseInt2 -= 9;
                                }
                                i11 += parseInt2;
                                length--;
                                z14 = z15;
                            } else {
                                int i12 = 10;
                                if (i11 % 10 == 0) {
                                    String a2 = aVar.a();
                                    if (!"American Express".equals(a2) ? !(!"Diners Club".equals(a2) ? replaceAll.length() != 16 : replaceAll.length() != 14) : replaceAll.length() == 15) {
                                        if (!z13) {
                                            Integer num4 = aVar.c;
                                            if (num4 != null && num4.intValue() >= 1 && num4.intValue() <= 12 && (num3 = aVar.d) != null && j7.n8.a(num3.intValue()) >= h7.u.K2().get(1)) {
                                                if (num4 == null || num4.intValue() < 1 || num4.intValue() > 12 || num3 == null || j7.n8.a(num3.intValue()) < h7.u.K2().get(1)) {
                                                    z11 = false;
                                                } else {
                                                    int intValue = num3.intValue();
                                                    int intValue2 = num4.intValue();
                                                    if (j7.n8.a(intValue) >= h7.u.K2().get(1)) {
                                                        Calendar K2 = h7.u.K2();
                                                        if (j7.n8.a(intValue) != K2.get(1) || intValue2 >= K2.get(2) + 1) {
                                                            z12 = false;
                                                            z11 = !z12;
                                                        }
                                                    }
                                                    z12 = true;
                                                    z11 = !z12;
                                                }
                                            }
                                            lo0Var.E0(1);
                                            return;
                                        }
                                        if (lo0Var.f0 && lo0Var.f[2].length() == 0) {
                                            lo0Var.E0(2);
                                            return;
                                        }
                                        String str2 = aVar.b;
                                        if (!j7.q8.d(str2)) {
                                            String trim = str2.trim();
                                            String a10 = aVar.a();
                                            boolean z16 = (a10 == null && trim.length() >= 3 && trim.length() <= 4) || ("American Express".equals(a10) && trim.length() == 4) || trim.length() == 3;
                                            if (trim != null) {
                                                for (int i13 = 0; i13 < trim.length(); i13++) {
                                                    if (Character.isDigit(trim.charAt(i13))) {
                                                    }
                                                }
                                                z4 = true;
                                                if (z4 && z16) {
                                                    z10 = true;
                                                    if (!z10) {
                                                        lo0Var.E0(3);
                                                        return;
                                                    }
                                                    if (lo0Var.d0 && lo0Var.f[4].length() == 0) {
                                                        lo0Var.E0(4);
                                                        return;
                                                    }
                                                    if (lo0Var.e0 && lo0Var.f[5].length() == 0) {
                                                        lo0Var.E0(5);
                                                        return;
                                                    }
                                                    lo0Var.H0(true, true);
                                                    try {
                                                        if ("stripe".equals(lo0Var.z0.native_provider)) {
                                                            String str3 = lo0Var.g0;
                                                            o5.i iVar = new o5.i(new cb.b(6), i12);
                                                            cb.b.l(str3);
                                                            ao0 ao0Var = new ao0(lo0Var);
                                                            try {
                                                                cb.b.l(str3);
                                                                new ec.a(iVar, str3, aVar, ao0Var).execute(new Void[0]);
                                                            } catch (fc.c e6) {
                                                                ao0Var.a(e6);
                                                            }
                                                        } else if ("smartglocal".equals(lo0Var.z0.native_provider)) {
                                                            new bo0(lo0Var, aVar).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, null, null, null);
                                                        }
                                                        return;
                                                    } catch (Exception e10) {
                                                        FileLog.e(e10);
                                                        return;
                                                    }
                                                }
                                            }
                                            z4 = false;
                                            if (z4) {
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
                        }
                    } else if (!Character.isDigit(replaceAll.charAt(i10))) {
                        break;
                    } else {
                        i10++;
                    }
                }
            }
        }
        lo0Var.E0(0);
    }

    public static void k0(lo0 lo0Var) {
        if (UserConfig.getInstance(lo0Var.currentAccount).tmpPassword != null && UserConfig.getInstance(lo0Var.currentAccount).tmpPassword.valid_until < ConnectionsManager.getInstance(lo0Var.currentAccount).getCurrentTime() + 60) {
            UserConfig.getInstance(lo0Var.currentAccount).tmpPassword = null;
            UserConfig.getInstance(lo0Var.currentAccount).saveConfig(false);
        }
        if (UserConfig.getInstance(lo0Var.currentAccount).tmpPassword != null) {
            lo0Var.z0();
            return;
        }
        if (lo0Var.f[1].length() == 0) {
            try {
                lo0Var.f[1].performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
            AndroidUtilities.shakeViewSpring(lo0Var.f[1], 2.5f);
            return;
        }
        String obj = lo0Var.f[1].getText().toString();
        lo0Var.H0(true, true);
        lo0Var.D0(true);
        TL_account.getPassword getpassword = new TL_account.getPassword();
        ConnectionsManager.getInstance(lo0Var.currentAccount).sendRequest(getpassword, new ba(lo0Var, obj, getpassword, 28), (lo0Var.T0 ? 8 : 0) | 2);
    }

    public static void m0(lo0 lo0Var) {
        if (lo0Var.N0) {
            return;
        }
        lo0Var.H0(true, true);
        TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo = new TLRPC.TL_payments_validateRequestedInfo();
        lo0Var.F0 = tL_payments_validateRequestedInfo;
        TLRPC.InputInvoice inputInvoice = lo0Var.Y0;
        if (inputInvoice != null) {
            tL_payments_validateRequestedInfo.invoice = inputInvoice;
        } else if (lo0Var.K0 != null) {
            TLRPC.TL_inputInvoiceMessage tL_inputInvoiceMessage = new TLRPC.TL_inputInvoiceMessage();
            tL_inputInvoiceMessage.peer = lo0Var.getMessagesController().getInputPeer(lo0Var.K0.messageOwner.peer_id);
            tL_inputInvoiceMessage.msg_id = lo0Var.K0.getId();
            lo0Var.F0.invoice = tL_inputInvoiceMessage;
        } else {
            TLRPC.TL_inputInvoiceSlug tL_inputInvoiceSlug = new TLRPC.TL_inputInvoiceSlug();
            tL_inputInvoiceSlug.slug = lo0Var.L0;
            lo0Var.F0.invoice = tL_inputInvoiceSlug;
        }
        TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo2 = lo0Var.F0;
        tL_payments_validateRequestedInfo2.save = lo0Var.Q0;
        tL_payments_validateRequestedInfo2.info = new TLRPC.TL_paymentRequestedInfo();
        if (lo0Var.z0.invoice.name_requested) {
            lo0Var.F0.info.name = lo0Var.f[6].getText().toString();
            lo0Var.F0.info.flags |= 1;
        }
        if (lo0Var.z0.invoice.phone_requested) {
            lo0Var.F0.info.phone = "+" + lo0Var.f[8].getText().toString() + lo0Var.f[9].getText().toString();
            TLRPC.TL_paymentRequestedInfo tL_paymentRequestedInfo = lo0Var.F0.info;
            tL_paymentRequestedInfo.flags = tL_paymentRequestedInfo.flags | 2;
        }
        if (lo0Var.z0.invoice.email_requested) {
            lo0Var.F0.info.email = lo0Var.f[7].getText().toString().trim();
            lo0Var.F0.info.flags |= 4;
        }
        if (lo0Var.z0.invoice.shipping_address_requested) {
            lo0Var.F0.info.shipping_address = new TLRPC.TL_postAddress();
            lo0Var.F0.info.shipping_address.street_line1 = lo0Var.f[0].getText().toString();
            lo0Var.F0.info.shipping_address.street_line2 = lo0Var.f[1].getText().toString();
            lo0Var.F0.info.shipping_address.city = lo0Var.f[2].getText().toString();
            lo0Var.F0.info.shipping_address.state = lo0Var.f[3].getText().toString();
            TLRPC.TL_postAddress tL_postAddress = lo0Var.F0.info.shipping_address;
            String str = lo0Var.y0;
            if (str == null) {
                str = "";
            }
            tL_postAddress.country_iso2 = str;
            tL_postAddress.post_code = lo0Var.f[5].getText().toString();
            lo0Var.F0.info.flags |= 8;
        }
        ConnectionsManager.getInstance(lo0Var.currentAccount).sendRequest(lo0Var.F0, new tb0(9, lo0Var, lo0Var.F0), (lo0Var.T0 ? 8 : 0) | 2);
    }

    public static JSONObject p0() {
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

    public final void A0(boolean z4) {
        String str;
        String str2;
        if (!z4 && this.P.getVisibility() == 0) {
            String text = this.P.getText();
            if (text.length() == 0) {
                org.telegram.ui.Cells.j3 j3Var = this.P;
                try {
                    j3Var.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                AndroidUtilities.shakeViewSpring(j3Var, 2.5f);
                return;
            } else {
                H0(true, true);
                TL_account.confirmPasswordEmail confirmpasswordemail = new TL_account.confirmPasswordEmail();
                confirmpasswordemail.code = text;
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(confirmpasswordemail, new nn0(this, 0), 10);
                return;
            }
        }
        TL_account.updatePasswordSettings updatepasswordsettings = new TL_account.updatePasswordSettings();
        if (z4) {
            this.n.setVisibility(0);
            TL_account.passwordInputSettings passwordinputsettings = new TL_account.passwordInputSettings();
            updatepasswordsettings.new_settings = passwordinputsettings;
            passwordinputsettings.flags = 2;
            passwordinputsettings.email = "";
            updatepasswordsettings.password = new TLRPC.TL_inputCheckPasswordEmpty();
            str = null;
            str2 = null;
        } else {
            String obj = this.f[0].getText().toString();
            if (TextUtils.isEmpty(obj)) {
                E0(0);
                return;
            }
            if (!obj.equals(this.f[1].getText().toString())) {
                try {
                    Toast.makeText(getParentActivity(), LocaleController.getString(R.string.PasswordDoNotMatch), 0).show();
                } catch (Exception e6) {
                    FileLog.e(e6);
                }
                E0(1);
                return;
            }
            String obj2 = this.f[2].getText().toString();
            if (obj2.length() < 3) {
                E0(2);
                return;
            }
            int lastIndexOf = obj2.lastIndexOf(46);
            int lastIndexOf2 = obj2.lastIndexOf(64);
            if (lastIndexOf2 < 0 || lastIndexOf < lastIndexOf2) {
                E0(2);
                return;
            }
            updatepasswordsettings.password = new TLRPC.TL_inputCheckPasswordEmpty();
            TL_account.passwordInputSettings passwordinputsettings2 = new TL_account.passwordInputSettings();
            updatepasswordsettings.new_settings = passwordinputsettings2;
            int i10 = passwordinputsettings2.flags;
            passwordinputsettings2.flags = i10 | 1;
            passwordinputsettings2.hint = "";
            passwordinputsettings2.new_algo = this.X.new_algo;
            passwordinputsettings2.flags = 3 | i10;
            passwordinputsettings2.email = obj2.trim();
            str = obj2;
            str2 = obj;
        }
        H0(true, true);
        Utilities.globalQueue.postRunnable(new hg.j(this, z4, str, str2, updatepasswordsettings));
    }

    public final void B0(TLRPC.TL_paymentRequestedInfo tL_paymentRequestedInfo) {
        TLRPC.TL_postAddress tL_postAddress = tL_paymentRequestedInfo.shipping_address;
        org.telegram.ui.Cells.z8[] z8VarArr = this.V;
        if (tL_postAddress != null) {
            String str = tL_postAddress.street_line1;
            String str2 = tL_postAddress.street_line2;
            String str3 = tL_postAddress.city;
            String str4 = tL_postAddress.state;
            String str5 = tL_postAddress.country_iso2;
            String str6 = tL_postAddress.post_code;
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(" ");
            sb.append(str2);
            sb.append(", ");
            sb.append(str3);
            yh.w(sb, ", ", str4, ", ", str5);
            z8VarArr[2].b(R.drawable.msg_payment_address, android.support.v4.media.a.r(sb, ", ", str6), LocaleController.getString(R.string.PaymentShippingAddress), true);
        }
        z8VarArr[2].setVisibility(tL_paymentRequestedInfo.shipping_address != null ? 0 : 8);
        String str7 = tL_paymentRequestedInfo.name;
        if (str7 != null) {
            z8VarArr[3].b(R.drawable.msg_contacts, str7, LocaleController.getString(R.string.PaymentCheckoutName), true);
        }
        z8VarArr[3].setVisibility(tL_paymentRequestedInfo.name != null ? 0 : 8);
        if (tL_paymentRequestedInfo.phone != null) {
            z8VarArr[4].b(R.drawable.msg_calls, se.b.c().b(tL_paymentRequestedInfo.phone), LocaleController.getString(R.string.PaymentCheckoutPhoneNumber), (tL_paymentRequestedInfo.email == null && this.D0 == null) ? false : true);
        }
        z8VarArr[4].setVisibility(tL_paymentRequestedInfo.phone != null ? 0 : 8);
        String str8 = tL_paymentRequestedInfo.email;
        if (str8 != null) {
            z8VarArr[5].b(R.drawable.msg_mention, str8, LocaleController.getString(R.string.PaymentCheckoutEmail), this.D0 != null);
        }
        z8VarArr[5].setVisibility(tL_paymentRequestedInfo.email != null ? 0 : 8);
    }

    public final void C0(TL_account.Password password) {
        if (password == null || !password.has_password) {
            this.X = password;
            this.Y = (password == null || TextUtils.isEmpty(password.email_unconfirmed_pattern)) ? false : true;
            J0();
        } else {
            if (getParentActivity() == null) {
                return;
            }
            t0();
        }
    }

    public final void D0(boolean z4) {
        this.M0 = z4;
        this.D = !z4;
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        if (kVar != null && kVar.getBackButton() != null) {
            this.actionBar.getBackButton().setEnabled(!this.M0);
        }
        org.telegram.ui.Cells.z8 z8Var = this.V[0];
        if (z8Var != null) {
            z8Var.setEnabled(!this.M0);
        }
    }

    public final void E0(int i10) {
        EditTextBoldCursor editTextBoldCursor = this.f[i10];
        try {
            editTextBoldCursor.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        AndroidUtilities.shakeViewSpring(editTextBoldCursor, 2.5f);
    }

    public final void F0(String str, String str2) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
        d2Var.O = str;
        d2Var.Q = str2;
        showDialog(d2Var);
    }

    public final void G0(Runnable runnable) {
        org.telegram.ui.ActionBar.h3 h3Var = new org.telegram.ui.ActionBar.h3(getParentActivity(), null, false, false);
        h3Var.fixNavigationBar();
        h3Var.title = LocaleController.getString(R.string.PaymentCheckoutMethod);
        h3Var.bigTitle = true;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard = this.v0;
        if (tL_paymentSavedCredentialsCard != null) {
            arrayList.add(tL_paymentSavedCredentialsCard.title);
            arrayList2.add(Integer.valueOf(R.drawable.msg_payment_card));
        } else {
            String str = this.u0;
            if (str != null) {
                arrayList.add(str);
                arrayList2.add(Integer.valueOf(R.drawable.msg_payment_card));
            }
        }
        ArrayList arrayList3 = new ArrayList();
        ArrayList<TLRPC.TL_paymentSavedCredentialsCard> arrayList4 = this.z0.saved_credentials;
        int size = arrayList4.size();
        int i10 = 0;
        while (i10 < size) {
            TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard2 = arrayList4.get(i10);
            i10++;
            TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard3 = tL_paymentSavedCredentialsCard2;
            TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard4 = this.v0;
            if (tL_paymentSavedCredentialsCard4 == null || !Objects.equals(tL_paymentSavedCredentialsCard3.id, tL_paymentSavedCredentialsCard4.id)) {
                arrayList.add(tL_paymentSavedCredentialsCard3.title);
                arrayList2.add(Integer.valueOf(R.drawable.msg_payment_card));
                arrayList3.add(tL_paymentSavedCredentialsCard3);
            }
        }
        ArrayList<TLRPC.TL_paymentFormMethod> arrayList5 = this.z0.additional_methods;
        int size2 = arrayList5.size();
        int i11 = 0;
        while (i11 < size2) {
            TLRPC.TL_paymentFormMethod tL_paymentFormMethod = arrayList5.get(i11);
            i11++;
            arrayList.add(tL_paymentFormMethod.title);
            arrayList2.add(Integer.valueOf(R.drawable.msg_payment_provider));
        }
        arrayList.add(LocaleController.getString(R.string.PaymentCheckoutMethodNewCard));
        arrayList2.add(Integer.valueOf(R.drawable.msg_addbot));
        int[] iArr = new int[arrayList2.size()];
        for (int i12 = 0; i12 < arrayList2.size(); i12++) {
            iArr[i12] = ((Integer) arrayList2.get(i12)).intValue();
        }
        CharSequence[] charSequenceArr = (CharSequence[]) arrayList.toArray(new CharSequence[0]);
        org.telegram.ui.Components.x2 x2Var = new org.telegram.ui.Components.x2(this, runnable, arrayList3, arrayList, 1);
        h3Var.items = charSequenceArr;
        h3Var.itemIcons = iArr;
        h3Var.onClickListener = x2Var;
        showDialog(h3Var);
    }

    public final void H0(boolean z4, boolean z10) {
        AnimatorSet animatorSet = this.v;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        int i10 = 1;
        int i11 = 0;
        if (!z4 || this.n == null) {
            if (this.R != null) {
                this.v = new AnimatorSet();
                if (z10) {
                    this.s.setVisibility(0);
                    this.T.setEnabled(false);
                    AnimatorSet animatorSet2 = this.v;
                    TextView textView = this.R;
                    Property property = View.SCALE_X;
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property, 0.1f);
                    TextView textView2 = this.R;
                    Property property2 = View.SCALE_Y;
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) property2, 0.1f);
                    TextView textView3 = this.R;
                    Property property3 = View.ALPHA;
                    animatorSet2.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(textView3, (Property<TextView, Float>) property3, 0.0f), ObjectAnimator.ofFloat(this.s, (Property<org.telegram.ui.Components.tq, Float>) property, 1.0f), ObjectAnimator.ofFloat(this.s, (Property<org.telegram.ui.Components.tq, Float>) property2, 1.0f), ObjectAnimator.ofFloat(this.s, (Property<org.telegram.ui.Components.tq, Float>) property3, 1.0f));
                } else {
                    this.R.setVisibility(0);
                    this.T.setEnabled(true);
                    AnimatorSet animatorSet3 = this.v;
                    org.telegram.ui.Components.tq tqVar = this.s;
                    Property property4 = View.SCALE_X;
                    ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(tqVar, (Property<org.telegram.ui.Components.tq, Float>) property4, 0.1f);
                    org.telegram.ui.Components.tq tqVar2 = this.s;
                    Property property5 = View.SCALE_Y;
                    ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(tqVar2, (Property<org.telegram.ui.Components.tq, Float>) property5, 0.1f);
                    org.telegram.ui.Components.tq tqVar3 = this.s;
                    Property property6 = View.ALPHA;
                    animatorSet3.playTogether(ofFloat3, ofFloat4, ObjectAnimator.ofFloat(tqVar3, (Property<org.telegram.ui.Components.tq, Float>) property6, 0.0f), ObjectAnimator.ofFloat(this.R, (Property<TextView, Float>) property4, 1.0f), ObjectAnimator.ofFloat(this.R, (Property<TextView, Float>) property5, 1.0f), ObjectAnimator.ofFloat(this.R, (Property<TextView, Float>) property6, 1.0f));
                }
                this.v.addListener(new co0(this, z10, i10));
                this.v.setDuration(150L);
                this.v.start();
                return;
            }
            return;
        }
        AnimatorSet animatorSet4 = new AnimatorSet();
        this.v = animatorSet4;
        if (z10) {
            this.r.setVisibility(0);
            this.n.setEnabled(false);
            AnimatorSet animatorSet5 = this.v;
            View contentView = this.n.getContentView();
            Property property7 = View.SCALE_X;
            ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(contentView, (Property<View, Float>) property7, 0.1f);
            View contentView2 = this.n.getContentView();
            Property property8 = View.SCALE_Y;
            ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(contentView2, (Property<View, Float>) property8, 0.1f);
            View contentView3 = this.n.getContentView();
            Property property9 = View.ALPHA;
            animatorSet5.playTogether(ofFloat5, ofFloat6, ObjectAnimator.ofFloat(contentView3, (Property<View, Float>) property9, 0.0f), ObjectAnimator.ofFloat(this.r, (Property<org.telegram.ui.Components.tq, Float>) property7, 1.0f), ObjectAnimator.ofFloat(this.r, (Property<org.telegram.ui.Components.tq, Float>) property8, 1.0f), ObjectAnimator.ofFloat(this.r, (Property<org.telegram.ui.Components.tq, Float>) property9, 1.0f));
        } else if (this.w != null) {
            animatorSet4.playTogether(ObjectAnimator.ofFloat(this.r, (Property<org.telegram.ui.Components.tq, Float>) View.SCALE_X, 0.1f), ObjectAnimator.ofFloat(this.r, (Property<org.telegram.ui.Components.tq, Float>) View.SCALE_Y, 0.1f), ObjectAnimator.ofFloat(this.r, (Property<org.telegram.ui.Components.tq, Float>) View.ALPHA, 0.0f));
        } else {
            this.n.getContentView().setVisibility(0);
            this.n.setEnabled(true);
            AnimatorSet animatorSet6 = this.v;
            org.telegram.ui.Components.tq tqVar4 = this.r;
            Property property10 = View.SCALE_X;
            ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(tqVar4, (Property<org.telegram.ui.Components.tq, Float>) property10, 0.1f);
            org.telegram.ui.Components.tq tqVar5 = this.r;
            Property property11 = View.SCALE_Y;
            ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(tqVar5, (Property<org.telegram.ui.Components.tq, Float>) property11, 0.1f);
            org.telegram.ui.Components.tq tqVar6 = this.r;
            Property property12 = View.ALPHA;
            animatorSet6.playTogether(ofFloat7, ofFloat8, ObjectAnimator.ofFloat(tqVar6, (Property<org.telegram.ui.Components.tq, Float>) property12, 0.0f));
            if (!isFinishing()) {
                this.v.playTogether(ObjectAnimator.ofFloat(this.n.getContentView(), (Property<View, Float>) property10, 1.0f), ObjectAnimator.ofFloat(this.n.getContentView(), (Property<View, Float>) property11, 1.0f), ObjectAnimator.ofFloat(this.n.getContentView(), (Property<View, Float>) property12, 1.0f));
            }
        }
        this.v.addListener(new co0(this, z10, i11));
        this.v.setDuration(150L);
        this.v.start();
    }

    public final void I0(String str) {
        if (getParentActivity() == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        String string = LocaleController.getString(R.string.PaymentTransactionReview);
        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
        d2Var.O = string;
        d2Var.Q = AndroidUtilities.replaceTags(LocaleController.formatString("PaymentTransactionMessage2", R.string.PaymentTransactionMessage2, str, this.m0, this.n0));
        alertDialog$Builder.k(LocaleController.getString(R.string.Continue), new ln0(this, 5));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        showDialog(d2Var);
    }

    public final void J0() {
        if (this.r0 == 6) {
            org.telegram.ui.Cells.a9[] a9VarArr = this.J;
            if (a9VarArr[2] == null) {
                return;
            }
            int i10 = 0;
            this.n.setVisibility(0);
            TL_account.Password password = this.X;
            ArrayList arrayList = this.G;
            org.telegram.ui.Cells.m4[] m4VarArr = this.F;
            org.telegram.ui.Cells.aa[] aaVarArr = this.K;
            if (password == null) {
                H0(true, true);
                a9VarArr[2].setVisibility(8);
                aaVarArr[0].setVisibility(8);
                aaVarArr[1].setVisibility(8);
                this.P.setVisibility(8);
                m4VarArr[0].setVisibility(8);
                m4VarArr[1].setVisibility(8);
                a9VarArr[0].setVisibility(8);
                for (int i11 = 0; i11 < 3; i11++) {
                    ((View) this.f[i11].getParent()).setVisibility(8);
                }
                while (i10 < arrayList.size()) {
                    ((View) arrayList.get(i10)).setVisibility(8);
                    i10++;
                }
                return;
            }
            H0(true, false);
            if (!this.Y) {
                a9VarArr[2].setVisibility(8);
                aaVarArr[0].setVisibility(8);
                aaVarArr[1].setVisibility(8);
                a9VarArr[1].setText(LocaleController.getString(R.string.PaymentPasswordEmailInfo));
                this.P.setVisibility(8);
                m4VarArr[0].setVisibility(0);
                m4VarArr[1].setVisibility(0);
                a9VarArr[0].setVisibility(0);
                for (int i12 = 0; i12 < 3; i12++) {
                    ((View) this.f[i12].getParent()).setVisibility(0);
                }
                for (int i13 = 0; i13 < arrayList.size(); i13++) {
                    ((View) arrayList.get(i13)).setVisibility(0);
                }
                return;
            }
            org.telegram.ui.Cells.a9 a9Var = a9VarArr[2];
            int i14 = R.string.EmailPasswordConfirmText2;
            String str = this.X.email_unconfirmed_pattern;
            if (str == null) {
                str = "";
            }
            a9Var.setText(LocaleController.formatString("EmailPasswordConfirmText2", i14, str));
            a9VarArr[2].setVisibility(0);
            aaVarArr[0].setVisibility(0);
            aaVarArr[1].setVisibility(0);
            this.P.setVisibility(0);
            a9VarArr[1].setText("");
            m4VarArr[0].setVisibility(8);
            m4VarArr[1].setVisibility(8);
            a9VarArr[0].setVisibility(8);
            for (int i15 = 0; i15 < 3; i15++) {
                ((View) this.f[i15].getParent()).setVisibility(8);
            }
            while (i10 < arrayList.size()) {
                ((View) arrayList.get(i10)).setVisibility(8);
                i10++;
            }
        }
    }

    public final void K0() {
        org.telegram.ui.Cells.a9[] a9VarArr = this.J;
        if (a9VarArr[0] != null) {
            org.telegram.ui.Cells.z6[] z6VarArr = this.H;
            if (z6VarArr[2] == null) {
                return;
            }
            TLRPC.PaymentForm paymentForm = this.z0;
            if ((!paymentForm.password_missing && !paymentForm.can_save_credentials) || (this.w != null && this.w0)) {
                this.I.setVisibility(8);
                a9VarArr[0].setVisibility(8);
                org.telegram.ui.Cells.z6 z6Var = z6VarArr[2];
                z6Var.setBackground(org.telegram.ui.ActionBar.k6.V0(z6Var.getContext(), R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.k6.b7));
                return;
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(R.string.PaymentCardSavePaymentInformationInfoLine1));
            if (this.z0.password_missing) {
                w0();
                spannableStringBuilder.append((CharSequence) "\n");
                int length = spannableStringBuilder.length();
                String string = LocaleController.getString(R.string.PaymentCardSavePaymentInformationInfoLine2);
                int indexOf = string.indexOf(42);
                int lastIndexOf = string.lastIndexOf(42);
                spannableStringBuilder.append((CharSequence) string);
                if (indexOf != -1 && lastIndexOf != -1) {
                    int i10 = indexOf + length;
                    int i11 = lastIndexOf + length;
                    a9VarArr[0].getTextView().setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
                    spannableStringBuilder.replace(i11, i11 + 1, (CharSequence) "");
                    spannableStringBuilder.replace(i10, i10 + 1, (CharSequence) "");
                    spannableStringBuilder.setSpan(new io0(this), i10, i11 - 1, 33);
                }
            }
            this.I.setEnabled(true);
            a9VarArr[0].setText(spannableStringBuilder);
            this.I.setVisibility(0);
            a9VarArr[0].setVisibility(0);
            org.telegram.ui.Cells.z6 z6Var2 = z6VarArr[2];
            z6Var2.setBackground(org.telegram.ui.ActionBar.k6.V0(z6Var2.getContext(), R.drawable.greydivider, org.telegram.ui.ActionBar.k6.b7));
        }
    }

    public final void L0() {
        this.O0[0] = s0(this.q0);
        this.O.a(LocaleController.getString(R.string.PaymentTransactionTotal), this.O0[0], true);
        TextView textView = this.R;
        if (textView != null) {
            textView.setText(LocaleController.formatString("PaymentCheckoutPay", R.string.PaymentCheckoutPay, this.O0[0]));
        }
        if (this.p0 != null) {
            int themedColor = getThemedColor(org.telegram.ui.ActionBar.k6.ei);
            int childCount = this.p0.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                TextView textView2 = (TextView) this.p0.getChildAt(i10);
                if (textView2.getTag().equals(this.E0)) {
                    org.telegram.ui.ActionBar.k6.w1(themedColor, textView2.getBackground());
                    textView2.setTextColor(getThemedColor(org.telegram.ui.ActionBar.k6.fi));
                } else {
                    org.telegram.ui.ActionBar.k6.w1(536870911 & themedColor, textView2.getBackground());
                    textView2.setTextColor(getThemedColor(org.telegram.ui.ActionBar.k6.Z8));
                }
                textView2.invalidate();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:178:0x030c, code lost:
    
        if (r15.email_requested == false) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:481:0x0fe5, code lost:
    
        if (r10.email_requested == false) goto L466;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0775  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x078f  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x07a4  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x07bb  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x07f6  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0855  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x08e5  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x080f  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x07c8  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x0785  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x0b8b  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x0bf0  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x0c20  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x0c50  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x0d14  */
    /* JADX WARN: Removed duplicated region for block: B:352:0x0c6d  */
    /* JADX WARN: Removed duplicated region for block: B:362:0x0c22  */
    /* JADX WARN: Removed duplicated region for block: B:363:0x0bfd  */
    /* JADX WARN: Removed duplicated region for block: B:370:0x0be1  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0215  */
    /* JADX WARN: Type inference failed for: r3v188, types: [android.view.View, android.view.ViewGroup, android.widget.FrameLayout] */
    /* JADX WARN: Type inference failed for: r3v192, types: [android.view.ViewGroup] */
    /* JADX WARN: Type inference failed for: r3v193, types: [android.view.ViewGroup] */
    /* JADX WARN: Type inference failed for: r3v228, types: [android.view.View, android.view.ViewGroup, android.widget.LinearLayout] */
    /* JADX WARN: Type inference failed for: r4v312 */
    /* JADX WARN: Type inference failed for: r4v313, types: [org.telegram.tgnet.TLRPC$User] */
    /* JADX WARN: Type inference failed for: r4v328 */
    /* JADX WARN: Type inference failed for: r4v329 */
    /* JADX WARN: Type inference failed for: r4v415 */
    /* JADX WARN: Type inference failed for: r7v214, types: [android.view.ViewGroup, android.widget.LinearLayout] */
    /* JADX WARN: Type inference failed for: r7v272, types: [android.view.ViewGroup, android.widget.LinearLayout] */
    @Override // org.telegram.ui.ActionBar.p2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View createView(Context context) {
        String str;
        char c3;
        TLRPC.PaymentForm paymentForm;
        SpannableStringBuilder spannableStringBuilder;
        TLRPC.PaymentForm paymentForm2;
        TLRPC.TL_paymentRequestedInfo tL_paymentRequestedInfo;
        boolean z4;
        char c10;
        int i10;
        int i11;
        TLRPC.TL_invoice tL_invoice;
        org.telegram.ui.Cells.z6 z6Var;
        TLRPC.TL_paymentRequestedInfo tL_paymentRequestedInfo2;
        TLRPC.TL_paymentRequestedInfo tL_paymentRequestedInfo3;
        String str2;
        String str3;
        TelephonyManager telephonyManager;
        ?? frameLayout;
        String str4;
        boolean z10;
        TLRPC.TL_postAddress tL_postAddress;
        TLRPC.TL_postAddress tL_postAddress2;
        TLRPC.TL_postAddress tL_postAddress3;
        TLRPC.TL_postAddress tL_postAddress4;
        TLRPC.TL_postAddress tL_postAddress5;
        TLRPC.TL_postAddress tL_postAddress6;
        String str5;
        String str6;
        BufferedReader bufferedReader;
        switch (this.r0) {
            case 0:
                this.actionBar.setTitle(LocaleController.getString(R.string.PaymentShippingInfo));
                break;
            case 1:
                this.actionBar.setTitle(LocaleController.getString(R.string.PaymentShippingMethod));
                break;
            case 2:
            case 3:
                TLRPC.TL_paymentFormMethod tL_paymentFormMethod = this.C0;
                if (tL_paymentFormMethod != null && !TextUtils.isEmpty(tL_paymentFormMethod.title)) {
                    this.actionBar.setTitle(this.C0.title);
                    break;
                } else {
                    this.actionBar.setTitle(LocaleController.getString(R.string.PaymentCardInfo));
                    break;
                }
                break;
            case 4:
                if (this.z0.invoice.test) {
                    this.actionBar.setTitle("Test " + LocaleController.getString(R.string.PaymentCheckout));
                    break;
                } else {
                    this.actionBar.setTitle(LocaleController.getString(R.string.PaymentCheckout));
                    break;
                }
            case 5:
                if (this.z0.invoice.test) {
                    this.actionBar.setTitle("Test " + LocaleController.getString(R.string.PaymentReceipt));
                    break;
                } else {
                    this.actionBar.setTitle(LocaleController.getString(R.string.PaymentReceipt));
                    break;
                }
            case 6:
                this.actionBar.setTitle(LocaleController.getString(R.string.PaymentPassword));
                break;
        }
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new xn0(this));
        org.telegram.ui.ActionBar.z n10 = this.actionBar.n();
        int i12 = this.r0;
        int i13 = 6;
        int i14 = 3;
        if (i12 == 0 || i12 == 1 || i12 == 2 || i12 == 3 || i12 == 4 || i12 == 6) {
            this.n = n10.h(1, R.drawable.ic_ab_done, LocaleController.getString(R.string.Done), AndroidUtilities.dp(56.0f));
            org.telegram.ui.Components.tq tqVar = new org.telegram.ui.Components.tq(context, 1);
            this.r = tqVar;
            tqVar.setAlpha(0.0f);
            this.r.setScaleX(0.1f);
            this.r.setScaleY(0.1f);
            this.r.setVisibility(4);
            this.n.addView(this.r, k7.c6.c(-1.0f, -1));
        }
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.fragmentView = frameLayout2;
        frameLayout2.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.k6.a7));
        ScrollView scrollView = new ScrollView(context);
        this.B = scrollView;
        scrollView.setFillViewport(true);
        AndroidUtilities.setScrollViewEdgeEffectColor(this.B, getThemedColor(org.telegram.ui.ActionBar.k6.s8));
        frameLayout2.addView(this.B, k7.c6.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, this.r0 == 4 ? 48.0f : 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.N = linearLayout;
        linearLayout.setOrientation(1);
        int i15 = 0;
        this.N.setClipChildren(false);
        this.B.addView(this.N, new FrameLayout.LayoutParams(-1, -2));
        int i16 = this.r0;
        int i17 = 10;
        String str7 = "";
        char c11 = 1;
        Drawable drawable = null;
        if (i16 == 0) {
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            try {
                bufferedReader = new BufferedReader(new InputStreamReader(context.getResources().getAssets().open("countries.txt")));
            } catch (Exception e6) {
                e = e6;
                c10 = 0;
            }
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine != null) {
                    String[] split = readLine.split(";");
                    this.a.add(i15, split[2]);
                    c10 = 0;
                    try {
                        this.b.put(split[2], split[0]);
                        this.c.put(split[0], split[2]);
                        hashMap2.put(split[1], split[2]);
                        if (split.length > 3) {
                            this.d.put(split[0], split[3]);
                        }
                        hashMap.put(split[1], split[2]);
                        i15 = 0;
                    } catch (Exception e10) {
                        e = e10;
                    }
                } else {
                    c10 = 0;
                    bufferedReader.close();
                    Collections.sort(this.a, new du(i13));
                    this.f = new EditTextBoldCursor[10];
                    i10 = 0;
                    while (i10 < i17) {
                        if (i10 == 0) {
                            this.F[c10] = new org.telegram.ui.Cells.m4(context, this.V0);
                            this.F[c10].setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.k6.d6));
                            this.F[c10].setText(LocaleController.getString(R.string.PaymentShippingAddress));
                            this.N.addView(this.F[c10], k7.c6.n(-1, -2));
                        } else if (i10 == i13) {
                            this.H[c10] = new org.telegram.ui.Cells.z6(context, drawable);
                            this.N.addView(this.H[c10], k7.c6.n(-1, -2));
                            this.F[c11] = new org.telegram.ui.Cells.m4(context, this.V0);
                            this.F[c11].setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.k6.d6));
                            this.F[c11].setText(LocaleController.getString(R.string.PaymentShippingReceiver));
                            this.N.addView(this.F[c11], k7.c6.n(-1, -2));
                        }
                        if (i10 == 8) {
                            frameLayout = new LinearLayout(context);
                            frameLayout.setClipChildren(false);
                            frameLayout.setOrientation(0);
                            this.N.addView(frameLayout, k7.c6.n(-1, 50));
                            frameLayout.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.k6.d6));
                        } else if (i10 == 9) {
                            frameLayout = (ViewGroup) this.f[8].getParent();
                        } else {
                            frameLayout = new FrameLayout(context);
                            frameLayout.setClipChildren(false);
                            this.N.addView(frameLayout, k7.c6.n(-1, 50));
                            int i18 = org.telegram.ui.ActionBar.k6.d6;
                            frameLayout.setBackgroundColor(getThemedColor(i18));
                            boolean z11 = i10 != 5;
                            if (z11) {
                                if (i10 != 7 || this.z0.invoice.phone_requested) {
                                    if (i10 == i13) {
                                        TLRPC.TL_invoice tL_invoice2 = this.z0.invoice;
                                        if (!tL_invoice2.phone_requested) {
                                        }
                                    }
                                }
                                z11 = false;
                            }
                            if (z11) {
                                org.telegram.ui.Components.jn jnVar = new org.telegram.ui.Components.jn(context, 15);
                                jnVar.setBackgroundColor(getThemedColor(i18));
                                this.G.add(jnVar);
                                frameLayout.addView(jnVar, new FrameLayout.LayoutParams(-1, 1, 83));
                            }
                        }
                        if (i10 == 9) {
                            this.f[i10] = new org.telegram.ui.Components.j40(context);
                        } else {
                            this.f[i10] = new EditTextBoldCursor(context);
                        }
                        this.f[i10].setTag(Integer.valueOf(i10));
                        this.f[i10].setTextSize(1, 16.0f);
                        this.f[i10].setHintTextColor(getThemedColor(org.telegram.ui.ActionBar.k6.H6));
                        EditTextBoldCursor editTextBoldCursor = this.f[i10];
                        int i19 = org.telegram.ui.ActionBar.k6.G6;
                        editTextBoldCursor.setTextColor(getThemedColor(i19));
                        this.f[i10].setBackgroundDrawable(drawable);
                        this.f[i10].setCursorColor(getThemedColor(i19));
                        this.f[i10].setCursorSize(AndroidUtilities.dp(20.0f));
                        this.f[i10].setCursorWidth(1.5f);
                        if (i10 == 4) {
                            final int i20 = 0;
                            this.f[i10].setOnTouchListener(new View.OnTouchListener(this) { // from class: org.telegram.ui.in0
                                public final /* synthetic */ lo0 b;

                                {
                                    this.b = this;
                                }

                                @Override // android.view.View.OnTouchListener
                                public final boolean onTouch(View view, MotionEvent motionEvent) {
                                    switch (i20) {
                                        case 0:
                                            lo0 lo0Var = this.b;
                                            if (lo0Var.getParentActivity() != null) {
                                                if (motionEvent.getAction() == 1) {
                                                    zt ztVar = new zt(null, false);
                                                    ztVar.n = true;
                                                    ztVar.r = new ln0(lo0Var, 4);
                                                    lo0Var.presentFragment(ztVar);
                                                    break;
                                                }
                                            }
                                            break;
                                        default:
                                            lo0 lo0Var2 = this.b;
                                            if (lo0Var2.getParentActivity() != null) {
                                                if (motionEvent.getAction() == 1) {
                                                    zt ztVar2 = new zt(null, false);
                                                    ztVar2.n = true;
                                                    ztVar2.r = new ln0(lo0Var2, 2);
                                                    lo0Var2.presentFragment(ztVar2);
                                                    break;
                                                }
                                            }
                                            break;
                                    }
                                    return false;
                                }
                            });
                            this.f[i10].setInputType(0);
                        }
                        if (i10 == 9 || i10 == 8) {
                            this.f[i10].setInputType(i14);
                        } else if (i10 == 7) {
                            this.f[i10].setInputType(1);
                        } else {
                            this.f[i10].setInputType(16385);
                        }
                        this.f[i10].setImeOptions(268435461);
                        switch (i10) {
                            case 0:
                                this.f[i10].setHint(LocaleController.getString(R.string.PaymentShippingAddress1Placeholder));
                                TLRPC.TL_paymentRequestedInfo tL_paymentRequestedInfo4 = this.z0.saved_info;
                                if (tL_paymentRequestedInfo4 != null && (tL_postAddress = tL_paymentRequestedInfo4.shipping_address) != null) {
                                    this.f[i10].setText(tL_postAddress.street_line1);
                                    break;
                                }
                                break;
                            case 1:
                                this.f[i10].setHint(LocaleController.getString(R.string.PaymentShippingAddress2Placeholder));
                                TLRPC.TL_paymentRequestedInfo tL_paymentRequestedInfo5 = this.z0.saved_info;
                                if (tL_paymentRequestedInfo5 != null && (tL_postAddress2 = tL_paymentRequestedInfo5.shipping_address) != null) {
                                    this.f[i10].setText(tL_postAddress2.street_line2);
                                    break;
                                }
                                break;
                            case 2:
                                this.f[i10].setHint(LocaleController.getString(R.string.PaymentShippingCityPlaceholder));
                                TLRPC.TL_paymentRequestedInfo tL_paymentRequestedInfo6 = this.z0.saved_info;
                                if (tL_paymentRequestedInfo6 != null && (tL_postAddress3 = tL_paymentRequestedInfo6.shipping_address) != null) {
                                    this.f[i10].setText(tL_postAddress3.city);
                                    break;
                                }
                                break;
                            case 3:
                                this.f[i10].setHint(LocaleController.getString(R.string.PaymentShippingStatePlaceholder));
                                TLRPC.TL_paymentRequestedInfo tL_paymentRequestedInfo7 = this.z0.saved_info;
                                if (tL_paymentRequestedInfo7 != null && (tL_postAddress4 = tL_paymentRequestedInfo7.shipping_address) != null) {
                                    this.f[i10].setText(tL_postAddress4.state);
                                    break;
                                }
                                break;
                            case 4:
                                this.f[i10].setHint(LocaleController.getString(R.string.PaymentShippingCountry));
                                TLRPC.TL_paymentRequestedInfo tL_paymentRequestedInfo8 = this.z0.saved_info;
                                if (tL_paymentRequestedInfo8 != null && (tL_postAddress5 = tL_paymentRequestedInfo8.shipping_address) != null) {
                                    String str8 = (String) hashMap2.get(tL_postAddress5.country_iso2);
                                    String str9 = this.z0.saved_info.shipping_address.country_iso2;
                                    this.y0 = str9;
                                    EditTextBoldCursor editTextBoldCursor2 = this.f[i10];
                                    if (str8 == null) {
                                        str8 = str9;
                                    }
                                    editTextBoldCursor2.setText(str8);
                                    break;
                                }
                                break;
                            case 5:
                                this.f[i10].setHint(LocaleController.getString(R.string.PaymentShippingZipPlaceholder));
                                TLRPC.TL_paymentRequestedInfo tL_paymentRequestedInfo9 = this.z0.saved_info;
                                if (tL_paymentRequestedInfo9 != null && (tL_postAddress6 = tL_paymentRequestedInfo9.shipping_address) != null) {
                                    this.f[i10].setText(tL_postAddress6.post_code);
                                    break;
                                }
                                break;
                            case 6:
                                this.f[i10].setHint(LocaleController.getString(R.string.PaymentShippingName));
                                TLRPC.TL_paymentRequestedInfo tL_paymentRequestedInfo10 = this.z0.saved_info;
                                if (tL_paymentRequestedInfo10 != null && (str5 = tL_paymentRequestedInfo10.name) != null) {
                                    this.f[i10].setText(str5);
                                    break;
                                }
                                break;
                            case 7:
                                this.f[i10].setHint(LocaleController.getString(R.string.PaymentShippingEmailPlaceholder));
                                TLRPC.TL_paymentRequestedInfo tL_paymentRequestedInfo11 = this.z0.saved_info;
                                if (tL_paymentRequestedInfo11 != null && (str6 = tL_paymentRequestedInfo11.email) != null) {
                                    this.f[i10].setText(str6);
                                    break;
                                }
                                break;
                        }
                        EditTextBoldCursor editTextBoldCursor3 = this.f[i10];
                        editTextBoldCursor3.setSelection(editTextBoldCursor3.length());
                        if (i10 == 8) {
                            TextView textView = new TextView(context);
                            this.E = textView;
                            textView.setText("+");
                            this.E.setTextColor(getThemedColor(i19));
                            this.E.setTextSize(1, 16.0f);
                            frameLayout.addView(this.E, k7.c6.k(21.0f, 12.0f, 0.0f, 6.0f, -2, -2));
                            this.f[i10].setPadding(AndroidUtilities.dp(10.0f), 0, 0, 0);
                            this.f[i10].setGravity(19);
                            this.f[i10].setFilters(new InputFilter[]{new InputFilter.LengthFilter(5)});
                            frameLayout.addView(this.f[i10], k7.c6.k(0.0f, 12.0f, 21.0f, 6.0f, 55, -2));
                            this.f[i10].addTextChangedListener(new do0(this));
                        } else if (i10 == 9) {
                            this.f[i10].setPadding(0, 0, 0, 0);
                            this.f[i10].setGravity(19);
                            frameLayout.addView(this.f[i10], k7.c6.k(0.0f, 12.0f, 21.0f, 6.0f, -1, -2));
                            this.f[i10].addTextChangedListener(new yr(this, 4));
                        } else {
                            this.f[i10].setPadding(0, 0, 0, AndroidUtilities.dp(6.0f));
                            this.f[i10].setGravity(LocaleController.isRTL ? 5 : 3);
                            frameLayout.addView(this.f[i10], k7.c6.d(-1, -2.0f, 51, 21.0f, 12.0f, 21.0f, 6.0f));
                        }
                        final int i21 = 2;
                        this.f[i10].setOnEditorActionListener(new TextView.OnEditorActionListener(this) { // from class: org.telegram.ui.jn0
                            public final /* synthetic */ lo0 b;

                            {
                                this.b = this;
                            }

                            @Override // android.widget.TextView.OnEditorActionListener
                            public final boolean onEditorAction(TextView textView2, int i22, KeyEvent keyEvent) {
                                EditTextBoldCursor[] editTextBoldCursorArr;
                                switch (i21) {
                                    case 0:
                                        lo0 lo0Var = this.b;
                                        if (i22 != 6) {
                                            lo0Var.getClass();
                                            break;
                                        } else {
                                            lo0Var.A0(false);
                                            break;
                                        }
                                    case 1:
                                        lo0 lo0Var2 = this.b;
                                        if (i22 != 6) {
                                            lo0Var2.getClass();
                                            if (i22 == 5) {
                                                int intValue = ((Integer) textView2.getTag()).intValue();
                                                if (intValue != 0) {
                                                    if (intValue == 1) {
                                                        lo0Var2.f[2].requestFocus();
                                                        break;
                                                    }
                                                } else {
                                                    lo0Var2.f[1].requestFocus();
                                                    break;
                                                }
                                            }
                                        } else {
                                            lo0Var2.n.performClick();
                                            break;
                                        }
                                        break;
                                    case 2:
                                        lo0 lo0Var3 = this.b;
                                        lo0Var3.getClass();
                                        if (i22 != 5) {
                                            if (i22 == 6) {
                                                lo0Var3.n.performClick();
                                                break;
                                            }
                                        } else {
                                            int intValue2 = ((Integer) textView2.getTag()).intValue();
                                            while (true) {
                                                intValue2++;
                                                EditTextBoldCursor[] editTextBoldCursorArr2 = lo0Var3.f;
                                                if (intValue2 >= editTextBoldCursorArr2.length) {
                                                    break;
                                                } else if (intValue2 != 4 && ((View) editTextBoldCursorArr2[intValue2].getParent()).getVisibility() == 0) {
                                                    lo0Var3.f[intValue2].requestFocus();
                                                    break;
                                                }
                                            }
                                        }
                                        break;
                                    case 3:
                                        lo0 lo0Var4 = this.b;
                                        lo0Var4.getClass();
                                        if (i22 != 5) {
                                            if (i22 == 6) {
                                                lo0Var4.n.performClick();
                                                break;
                                            }
                                        } else {
                                            int intValue3 = ((Integer) textView2.getTag()).intValue();
                                            do {
                                                int i23 = intValue3 + 1;
                                                editTextBoldCursorArr = lo0Var4.f;
                                                if (i23 >= editTextBoldCursorArr.length) {
                                                    break;
                                                } else {
                                                    intValue3 = i23 == 4 ? intValue3 + 2 : i23;
                                                }
                                            } while (((View) editTextBoldCursorArr[intValue3].getParent()).getVisibility() != 0);
                                            lo0Var4.f[intValue3].requestFocus();
                                            break;
                                        }
                                        break;
                                    default:
                                        lo0 lo0Var5 = this.b;
                                        if (i22 != 6) {
                                            lo0Var5.getClass();
                                            break;
                                        } else {
                                            lo0Var5.n.performClick();
                                            break;
                                        }
                                }
                                return false;
                            }
                        });
                        if (i10 == 9) {
                            TLRPC.TL_invoice tL_invoice3 = this.z0.invoice;
                            if (tL_invoice3.email_to_provider || tL_invoice3.phone_to_provider) {
                                ?? r42 = drawable;
                                int i22 = 0;
                                while (i22 < this.z0.users.size()) {
                                    TLRPC.User user = this.z0.users.get(i22);
                                    String str10 = str7;
                                    if (user.id == this.z0.provider_id) {
                                        r42 = user;
                                    }
                                    i22++;
                                    str7 = str10;
                                    r42 = r42;
                                }
                                str4 = str7;
                                String formatName = r42 != 0 ? ContactsController.formatName(r42.first_name, r42.last_name) : str4;
                                z10 = true;
                                this.J[1] = new org.telegram.ui.Cells.a9(context, this.V0);
                                this.J[1].setBackgroundDrawable(org.telegram.ui.ActionBar.k6.V0(context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.k6.b7));
                                this.N.addView(this.J[1], k7.c6.n(-1, -2));
                                TLRPC.TL_invoice tL_invoice4 = this.z0.invoice;
                                boolean z12 = tL_invoice4.email_to_provider;
                                if (z12 && tL_invoice4.phone_to_provider) {
                                    this.J[1].setText(LocaleController.formatString("PaymentPhoneEmailToProvider", R.string.PaymentPhoneEmailToProvider, formatName));
                                } else if (z12) {
                                    this.J[1].setText(LocaleController.formatString("PaymentEmailToProvider", R.string.PaymentEmailToProvider, formatName));
                                } else {
                                    this.J[1].setText(LocaleController.formatString("PaymentPhoneToProvider", R.string.PaymentPhoneToProvider, formatName));
                                }
                            } else {
                                this.H[1] = new org.telegram.ui.Cells.z6(context, drawable);
                                this.N.addView(this.H[1], k7.c6.n(-1, -2));
                                str4 = str7;
                                z10 = true;
                            }
                            org.telegram.ui.Cells.s8 s8Var = new org.telegram.ui.Cells.s8(context, this.V0);
                            this.I = s8Var;
                            s8Var.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.K0(z10));
                            this.I.f(LocaleController.getString(R.string.PaymentShippingSave), this.Q0, false);
                            this.N.addView(this.I, k7.c6.n(-1, -2));
                            this.I.setOnClickListener(new hn0(this, 8));
                            this.J[0] = new org.telegram.ui.Cells.a9(context, this.V0);
                            this.J[0].setBackgroundDrawable(org.telegram.ui.ActionBar.k6.V0(context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.k6.b7));
                            this.J[0].setText(LocaleController.getString(R.string.PaymentShippingSaveInfo));
                            this.N.addView(this.J[0], k7.c6.n(-1, -2));
                        } else {
                            str4 = str7;
                        }
                        i10++;
                        str7 = str4;
                        i17 = 10;
                        i13 = 6;
                        i14 = 3;
                        drawable = null;
                        c11 = 1;
                        c10 = 0;
                    }
                    if (this.z0.invoice.name_requested) {
                        i11 = 8;
                        ((ViewGroup) this.f[6].getParent()).setVisibility(8);
                    } else {
                        i11 = 8;
                    }
                    if (!this.z0.invoice.phone_requested) {
                        ((ViewGroup) this.f[i11].getParent()).setVisibility(i11);
                    }
                    if (!this.z0.invoice.email_requested) {
                        ((ViewGroup) this.f[7].getParent()).setVisibility(i11);
                    }
                    tL_invoice = this.z0.invoice;
                    if (!tL_invoice.phone_requested) {
                        this.f[9].setImeOptions(268435462);
                    } else if (tL_invoice.email_requested) {
                        this.f[7].setImeOptions(268435462);
                    } else if (tL_invoice.name_requested) {
                        this.f[6].setImeOptions(268435462);
                    } else {
                        this.f[5].setImeOptions(268435462);
                    }
                    z6Var = this.H[1];
                    if (z6Var == null) {
                        TLRPC.TL_invoice tL_invoice5 = this.z0.invoice;
                        z6Var.setVisibility((tL_invoice5.name_requested || tL_invoice5.phone_requested || tL_invoice5.email_requested) ? 0 : 8);
                    } else {
                        org.telegram.ui.Cells.a9 a9Var = this.J[1];
                        if (a9Var != null) {
                            TLRPC.TL_invoice tL_invoice6 = this.z0.invoice;
                            a9Var.setVisibility((tL_invoice6.name_requested || tL_invoice6.phone_requested || tL_invoice6.email_requested) ? 0 : 8);
                        }
                    }
                    org.telegram.ui.Cells.m4 m4Var = this.F[1];
                    TLRPC.TL_invoice tL_invoice7 = this.z0.invoice;
                    m4Var.setVisibility((!tL_invoice7.name_requested || tL_invoice7.phone_requested || tL_invoice7.email_requested) ? 0 : 8);
                    if (!this.z0.invoice.shipping_address_requested) {
                        this.F[0].setVisibility(8);
                        this.H[0].setVisibility(8);
                        ((ViewGroup) this.f[0].getParent()).setVisibility(8);
                        ((ViewGroup) this.f[1].getParent()).setVisibility(8);
                        ((ViewGroup) this.f[2].getParent()).setVisibility(8);
                        ((ViewGroup) this.f[3].getParent()).setVisibility(8);
                        ((ViewGroup) this.f[4].getParent()).setVisibility(8);
                        ((ViewGroup) this.f[5].getParent()).setVisibility(8);
                    }
                    tL_paymentRequestedInfo2 = this.z0.saved_info;
                    if (tL_paymentRequestedInfo2 != null || TextUtils.isEmpty(tL_paymentRequestedInfo2.phone)) {
                        o0(null);
                    } else {
                        o0(this.z0.saved_info.phone);
                    }
                    if (this.f[8].length() == 0) {
                        TLRPC.PaymentForm paymentForm3 = this.z0;
                        if (paymentForm3.invoice.phone_requested && ((tL_paymentRequestedInfo3 = paymentForm3.saved_info) == null || TextUtils.isEmpty(tL_paymentRequestedInfo3.phone))) {
                            try {
                                telephonyManager = (TelephonyManager) ApplicationLoader.applicationContext.getSystemService("phone");
                            } catch (Exception e11) {
                                FileLog.e(e11);
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
                e = e10;
                FileLog.e(e);
                Collections.sort(this.a, new du(i13));
                this.f = new EditTextBoldCursor[10];
                i10 = 0;
                while (i10 < i17) {
                }
                if (this.z0.invoice.name_requested) {
                }
                if (!this.z0.invoice.phone_requested) {
                }
                if (!this.z0.invoice.email_requested) {
                }
                tL_invoice = this.z0.invoice;
                if (!tL_invoice.phone_requested) {
                }
                z6Var = this.H[1];
                if (z6Var == null) {
                }
                org.telegram.ui.Cells.m4 m4Var2 = this.F[1];
                TLRPC.TL_invoice tL_invoice72 = this.z0.invoice;
                m4Var2.setVisibility((!tL_invoice72.name_requested || tL_invoice72.phone_requested || tL_invoice72.email_requested) ? 0 : 8);
                if (!this.z0.invoice.shipping_address_requested) {
                }
                tL_paymentRequestedInfo2 = this.z0.saved_info;
                if (tL_paymentRequestedInfo2 != null) {
                }
                o0(null);
                if (this.f[8].length() == 0) {
                }
            }
        } else {
            String str11 = "";
            if (i16 == 2) {
                if (this.z0.native_params != null) {
                    try {
                        JSONObject jSONObject = new JSONObject(this.z0.native_params.data);
                        String optString = jSONObject.optString("google_pay_public_key");
                        if (!TextUtils.isEmpty(optString)) {
                            this.H0 = optString;
                        }
                        this.I0 = jSONObject.optString("acquirer_bank_country");
                        this.J0 = jSONObject.optJSONObject("gpay_parameters");
                    } catch (Exception e12) {
                        FileLog.e(e12);
                    }
                }
                if (this.P0 || this.C0 != null) {
                    if (this.H0 != null || this.J0 != null) {
                        v0(context);
                    }
                    n0(context);
                    this.N.addView(this.L, k7.c6.n(-1, 50));
                    this.w0 = true;
                    H0(true, true);
                    this.r.setVisibility(0);
                    this.n.setEnabled(false);
                    this.n.getContentView().setVisibility(4);
                    AndroidUtilities.checkAndroidTheme(context, true);
                    org.telegram.ui.Components.y81 y81Var = new org.telegram.ui.Components.y81(this, context);
                    this.w = y81Var;
                    y81Var.getSettings().setJavaScriptEnabled(true);
                    this.w.getSettings().setDomStorageEnabled(true);
                    this.w.getSettings().setSupportZoom(true);
                    this.w.getSettings().setBuiltInZoomControls(true);
                    this.w.getSettings().setDisplayZoomControls(false);
                    this.w.getSettings().setUseWideViewPort(true);
                    this.w.getSettings().setMixedContentMode(0);
                    CookieManager.getInstance().setAcceptThirdPartyCookies(this.w, true);
                    this.w.addJavascriptInterface(new PaymentFormActivity$TelegramWebviewProxy(this), "TelegramWebviewProxy");
                    this.w.setWebViewClient(new eo0(this, context));
                    this.N.addView(this.w, k7.c6.c(-2.0f, -1));
                    this.H[2] = new org.telegram.ui.Cells.z6(context, (Object) null);
                    this.N.addView(this.H[2], k7.c6.n(-1, -2));
                    org.telegram.ui.Cells.s8 s8Var2 = new org.telegram.ui.Cells.s8(context, this.V0);
                    this.I = s8Var2;
                    s8Var2.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.K0(true));
                    this.I.f(LocaleController.getString(R.string.PaymentCardSavePaymentInformation), this.R0, false);
                    this.N.addView(this.I, k7.c6.n(-1, -2));
                    this.I.setOnClickListener(new hn0(this, 9));
                    this.J[0] = new org.telegram.ui.Cells.a9(context, this.V0);
                    this.J[0].setBackgroundDrawable(org.telegram.ui.ActionBar.k6.V0(context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.k6.b7));
                    K0();
                    this.N.addView(this.J[0], k7.c6.n(-1, -2));
                } else {
                    if (this.z0.native_params != null) {
                        try {
                            JSONObject jSONObject2 = new JSONObject(this.z0.native_params.data);
                            try {
                                this.d0 = jSONObject2.getBoolean("need_country");
                            } catch (Exception unused) {
                                this.d0 = false;
                            }
                            try {
                                this.e0 = jSONObject2.getBoolean("need_zip");
                            } catch (Exception unused2) {
                                this.e0 = false;
                            }
                            try {
                                this.f0 = jSONObject2.getBoolean("need_cardholder_name");
                            } catch (Exception unused3) {
                                this.f0 = false;
                            }
                            if (jSONObject2.has("public_token")) {
                                this.g0 = jSONObject2.getString("public_token");
                            } else {
                                try {
                                    this.g0 = jSONObject2.getString("publishable_key");
                                } catch (Exception unused4) {
                                    this.g0 = str11;
                                }
                            }
                            this.h0 = !jSONObject2.optBoolean("google_pay_hidden", false);
                        } catch (Exception e13) {
                            FileLog.e(e13);
                        }
                    }
                    if (this.h0 && ((!TextUtils.isEmpty(this.g0) && "stripe".equals(this.z0.native_provider)) || this.J0 != null)) {
                        v0(context);
                    }
                    this.f = new EditTextBoldCursor[6];
                    int i23 = 0;
                    for (int i24 = 6; i23 < i24; i24 = 6) {
                        if (i23 == 0) {
                            this.F[0] = new org.telegram.ui.Cells.m4(context, this.V0);
                            this.F[0].setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.k6.d6));
                            this.F[0].setText(LocaleController.getString(R.string.PaymentCardTitle));
                            this.N.addView(this.F[0], k7.c6.n(-1, -2));
                        } else if (i23 == 4) {
                            this.F[1] = new org.telegram.ui.Cells.m4(context, this.V0);
                            this.F[1].setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.k6.d6));
                            this.F[1].setText(LocaleController.getString(R.string.PaymentBillingAddress));
                            this.N.addView(this.F[1], k7.c6.n(-1, -2));
                        }
                        boolean z13 = (i23 == 3 || i23 == 5 || (i23 == 4 && !this.e0)) ? false : true;
                        FrameLayout frameLayout3 = new FrameLayout(context);
                        frameLayout3.setClipChildren(false);
                        int i25 = org.telegram.ui.ActionBar.k6.d6;
                        frameLayout3.setBackgroundColor(getThemedColor(i25));
                        this.N.addView(frameLayout3, k7.c6.n(-1, 50));
                        this.f[i23] = new EditTextBoldCursor(context);
                        this.f[i23].setTag(Integer.valueOf(i23));
                        this.f[i23].setTextSize(1, 16.0f);
                        this.f[i23].setHintTextColor(getThemedColor(org.telegram.ui.ActionBar.k6.H6));
                        EditTextBoldCursor editTextBoldCursor4 = this.f[i23];
                        int i26 = org.telegram.ui.ActionBar.k6.G6;
                        editTextBoldCursor4.setTextColor(getThemedColor(i26));
                        this.f[i23].setBackgroundDrawable(null);
                        this.f[i23].setCursorColor(getThemedColor(i26));
                        this.f[i23].setCursorSize(AndroidUtilities.dp(20.0f));
                        this.f[i23].setCursorWidth(1.5f);
                        if (i23 == 3) {
                            this.f[i23].setFilters(new InputFilter[]{new InputFilter.LengthFilter(3)});
                            this.f[i23].setInputType(130);
                            this.f[i23].setTypeface(Typeface.DEFAULT);
                            this.f[i23].setTransformationMethod(PasswordTransformationMethod.getInstance());
                        } else if (i23 == 0) {
                            this.f[i23].setInputType(3);
                        } else if (i23 == 4) {
                            final int i27 = 1;
                            this.f[i23].setOnTouchListener(new View.OnTouchListener(this) { // from class: org.telegram.ui.in0
                                public final /* synthetic */ lo0 b;

                                {
                                    this.b = this;
                                }

                                @Override // android.view.View.OnTouchListener
                                public final boolean onTouch(View view, MotionEvent motionEvent) {
                                    switch (i27) {
                                        case 0:
                                            lo0 lo0Var = this.b;
                                            if (lo0Var.getParentActivity() != null) {
                                                if (motionEvent.getAction() == 1) {
                                                    zt ztVar = new zt(null, false);
                                                    ztVar.n = true;
                                                    ztVar.r = new ln0(lo0Var, 4);
                                                    lo0Var.presentFragment(ztVar);
                                                    break;
                                                }
                                            }
                                            break;
                                        default:
                                            lo0 lo0Var2 = this.b;
                                            if (lo0Var2.getParentActivity() != null) {
                                                if (motionEvent.getAction() == 1) {
                                                    zt ztVar2 = new zt(null, false);
                                                    ztVar2.n = true;
                                                    ztVar2.r = new ln0(lo0Var2, 2);
                                                    lo0Var2.presentFragment(ztVar2);
                                                    break;
                                                }
                                            }
                                            break;
                                    }
                                    return false;
                                }
                            });
                            this.f[i23].setInputType(0);
                        } else if (i23 == 1) {
                            this.f[i23].setInputType(16386);
                        } else if (i23 == 2) {
                            this.f[i23].setInputType(4097);
                        } else {
                            this.f[i23].setInputType(16385);
                            this.f[i23].setImeOptions(268435461);
                            if (i23 != 0) {
                                this.f[i23].setHint(LocaleController.getString(R.string.PaymentCardNumber));
                            } else if (i23 == 1) {
                                this.f[i23].setHint(LocaleController.getString(R.string.PaymentCardExpireDate));
                            } else if (i23 == 2) {
                                this.f[i23].setHint(LocaleController.getString(R.string.PaymentCardName));
                            } else if (i23 == 3) {
                                this.f[i23].setHint(LocaleController.getString(R.string.PaymentCardCvv));
                            } else if (i23 == 4) {
                                this.f[i23].setHint(LocaleController.getString(R.string.PaymentShippingCountry));
                            } else if (i23 == 5) {
                                this.f[i23].setHint(LocaleController.getString(R.string.PaymentShippingZipPlaceholder));
                            }
                            if (i23 != 0) {
                                this.f[i23].addTextChangedListener(new fo0(this));
                            } else if (i23 == 1) {
                                this.f[i23].addTextChangedListener(new go0(this));
                            }
                            this.f[i23].setPadding(0, 0, 0, AndroidUtilities.dp(6.0f));
                            this.f[i23].setGravity(!LocaleController.isRTL ? 5 : 3);
                            frameLayout3.addView(this.f[i23], k7.c6.d(-1, -2.0f, 51, 21.0f, 12.0f, 21.0f, 6.0f));
                            final int i28 = 3;
                            this.f[i23].setOnEditorActionListener(new TextView.OnEditorActionListener(this) { // from class: org.telegram.ui.jn0
                                public final /* synthetic */ lo0 b;

                                {
                                    this.b = this;
                                }

                                @Override // android.widget.TextView.OnEditorActionListener
                                public final boolean onEditorAction(TextView textView2, int i222, KeyEvent keyEvent) {
                                    EditTextBoldCursor[] editTextBoldCursorArr;
                                    switch (i28) {
                                        case 0:
                                            lo0 lo0Var = this.b;
                                            if (i222 != 6) {
                                                lo0Var.getClass();
                                                break;
                                            } else {
                                                lo0Var.A0(false);
                                                break;
                                            }
                                        case 1:
                                            lo0 lo0Var2 = this.b;
                                            if (i222 != 6) {
                                                lo0Var2.getClass();
                                                if (i222 == 5) {
                                                    int intValue = ((Integer) textView2.getTag()).intValue();
                                                    if (intValue != 0) {
                                                        if (intValue == 1) {
                                                            lo0Var2.f[2].requestFocus();
                                                            break;
                                                        }
                                                    } else {
                                                        lo0Var2.f[1].requestFocus();
                                                        break;
                                                    }
                                                }
                                            } else {
                                                lo0Var2.n.performClick();
                                                break;
                                            }
                                            break;
                                        case 2:
                                            lo0 lo0Var3 = this.b;
                                            lo0Var3.getClass();
                                            if (i222 != 5) {
                                                if (i222 == 6) {
                                                    lo0Var3.n.performClick();
                                                    break;
                                                }
                                            } else {
                                                int intValue2 = ((Integer) textView2.getTag()).intValue();
                                                while (true) {
                                                    intValue2++;
                                                    EditTextBoldCursor[] editTextBoldCursorArr2 = lo0Var3.f;
                                                    if (intValue2 >= editTextBoldCursorArr2.length) {
                                                        break;
                                                    } else if (intValue2 != 4 && ((View) editTextBoldCursorArr2[intValue2].getParent()).getVisibility() == 0) {
                                                        lo0Var3.f[intValue2].requestFocus();
                                                        break;
                                                    }
                                                }
                                            }
                                            break;
                                        case 3:
                                            lo0 lo0Var4 = this.b;
                                            lo0Var4.getClass();
                                            if (i222 != 5) {
                                                if (i222 == 6) {
                                                    lo0Var4.n.performClick();
                                                    break;
                                                }
                                            } else {
                                                int intValue3 = ((Integer) textView2.getTag()).intValue();
                                                do {
                                                    int i232 = intValue3 + 1;
                                                    editTextBoldCursorArr = lo0Var4.f;
                                                    if (i232 >= editTextBoldCursorArr.length) {
                                                        break;
                                                    } else {
                                                        intValue3 = i232 == 4 ? intValue3 + 2 : i232;
                                                    }
                                                } while (((View) editTextBoldCursorArr[intValue3].getParent()).getVisibility() != 0);
                                                lo0Var4.f[intValue3].requestFocus();
                                                break;
                                            }
                                            break;
                                        default:
                                            lo0 lo0Var5 = this.b;
                                            if (i222 != 6) {
                                                lo0Var5.getClass();
                                                break;
                                            } else {
                                                lo0Var5.n.performClick();
                                                break;
                                            }
                                    }
                                    return false;
                                }
                            });
                            if (i23 != 3) {
                                this.H[0] = new org.telegram.ui.Cells.z6(context, (Object) null);
                                this.N.addView(this.H[0], k7.c6.n(-1, -2));
                            } else if (i23 == 5) {
                                this.H[2] = new org.telegram.ui.Cells.z6(context, (Object) null);
                                this.N.addView(this.H[2], k7.c6.n(-1, -2));
                                org.telegram.ui.Cells.s8 s8Var3 = new org.telegram.ui.Cells.s8(context, this.V0);
                                this.I = s8Var3;
                                s8Var3.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.K0(true));
                                this.I.f(LocaleController.getString(R.string.PaymentCardSavePaymentInformation), this.R0, false);
                                this.N.addView(this.I, k7.c6.n(-1, -2));
                                this.I.setOnClickListener(new hn0(this, 10));
                                this.J[0] = new org.telegram.ui.Cells.a9(context, this.V0);
                                this.J[0].setBackgroundDrawable(org.telegram.ui.ActionBar.k6.V0(context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.k6.b7));
                                K0();
                                this.N.addView(this.J[0], k7.c6.n(-1, -2));
                            } else if (i23 == 0) {
                                n0(context);
                                frameLayout3.addView(this.L, k7.c6.d(-2, -2.0f, (LocaleController.isRTL ? 3 : 5) | 16, 0.0f, 0.0f, 4.0f, 0.0f));
                            }
                            if (z13) {
                                org.telegram.ui.Components.jn jnVar2 = new org.telegram.ui.Components.jn(context, 16);
                                jnVar2.setBackgroundColor(getThemedColor(i25));
                                this.G.add(jnVar2);
                                frameLayout3.addView(jnVar2, new FrameLayout.LayoutParams(-1, 1, 83));
                            }
                            if ((i23 == 4 && !this.d0) || ((i23 == 5 && !this.e0) || (i23 == 2 && !this.f0))) {
                                frameLayout3.setVisibility(8);
                            }
                            i23++;
                        }
                        this.f[i23].setImeOptions(268435461);
                        if (i23 != 0) {
                        }
                        if (i23 != 0) {
                        }
                        this.f[i23].setPadding(0, 0, 0, AndroidUtilities.dp(6.0f));
                        this.f[i23].setGravity(!LocaleController.isRTL ? 5 : 3);
                        frameLayout3.addView(this.f[i23], k7.c6.d(-1, -2.0f, 51, 21.0f, 12.0f, 21.0f, 6.0f));
                        final int i282 = 3;
                        this.f[i23].setOnEditorActionListener(new TextView.OnEditorActionListener(this) { // from class: org.telegram.ui.jn0
                            public final /* synthetic */ lo0 b;

                            {
                                this.b = this;
                            }

                            @Override // android.widget.TextView.OnEditorActionListener
                            public final boolean onEditorAction(TextView textView2, int i222, KeyEvent keyEvent) {
                                EditTextBoldCursor[] editTextBoldCursorArr;
                                switch (i282) {
                                    case 0:
                                        lo0 lo0Var = this.b;
                                        if (i222 != 6) {
                                            lo0Var.getClass();
                                            break;
                                        } else {
                                            lo0Var.A0(false);
                                            break;
                                        }
                                    case 1:
                                        lo0 lo0Var2 = this.b;
                                        if (i222 != 6) {
                                            lo0Var2.getClass();
                                            if (i222 == 5) {
                                                int intValue = ((Integer) textView2.getTag()).intValue();
                                                if (intValue != 0) {
                                                    if (intValue == 1) {
                                                        lo0Var2.f[2].requestFocus();
                                                        break;
                                                    }
                                                } else {
                                                    lo0Var2.f[1].requestFocus();
                                                    break;
                                                }
                                            }
                                        } else {
                                            lo0Var2.n.performClick();
                                            break;
                                        }
                                        break;
                                    case 2:
                                        lo0 lo0Var3 = this.b;
                                        lo0Var3.getClass();
                                        if (i222 != 5) {
                                            if (i222 == 6) {
                                                lo0Var3.n.performClick();
                                                break;
                                            }
                                        } else {
                                            int intValue2 = ((Integer) textView2.getTag()).intValue();
                                            while (true) {
                                                intValue2++;
                                                EditTextBoldCursor[] editTextBoldCursorArr2 = lo0Var3.f;
                                                if (intValue2 >= editTextBoldCursorArr2.length) {
                                                    break;
                                                } else if (intValue2 != 4 && ((View) editTextBoldCursorArr2[intValue2].getParent()).getVisibility() == 0) {
                                                    lo0Var3.f[intValue2].requestFocus();
                                                    break;
                                                }
                                            }
                                        }
                                        break;
                                    case 3:
                                        lo0 lo0Var4 = this.b;
                                        lo0Var4.getClass();
                                        if (i222 != 5) {
                                            if (i222 == 6) {
                                                lo0Var4.n.performClick();
                                                break;
                                            }
                                        } else {
                                            int intValue3 = ((Integer) textView2.getTag()).intValue();
                                            do {
                                                int i232 = intValue3 + 1;
                                                editTextBoldCursorArr = lo0Var4.f;
                                                if (i232 >= editTextBoldCursorArr.length) {
                                                    break;
                                                } else {
                                                    intValue3 = i232 == 4 ? intValue3 + 2 : i232;
                                                }
                                            } while (((View) editTextBoldCursorArr[intValue3].getParent()).getVisibility() != 0);
                                            lo0Var4.f[intValue3].requestFocus();
                                            break;
                                        }
                                        break;
                                    default:
                                        lo0 lo0Var5 = this.b;
                                        if (i222 != 6) {
                                            lo0Var5.getClass();
                                            break;
                                        } else {
                                            lo0Var5.n.performClick();
                                            break;
                                        }
                                }
                                return false;
                            }
                        });
                        if (i23 != 3) {
                        }
                        if (z13) {
                        }
                        if (i23 == 4) {
                            frameLayout3.setVisibility(8);
                            i23++;
                        }
                        frameLayout3.setVisibility(8);
                        i23++;
                    }
                    if (!this.d0 && !this.e0) {
                        this.F[1].setVisibility(8);
                        this.H[0].setVisibility(8);
                    }
                    if (this.e0) {
                        this.f[5].setImeOptions(268435462);
                    } else {
                        this.f[3].setImeOptions(268435462);
                    }
                }
            } else if (i16 == 1) {
                ArrayList<TLRPC.TL_shippingOption> arrayList = this.B0.shipping_options;
                int size = arrayList == null ? 0 : arrayList.size();
                this.h = new org.telegram.ui.Cells.j6[size];
                int i29 = 0;
                while (i29 < size) {
                    TLRPC.TL_shippingOption tL_shippingOption = this.B0.shipping_options.get(i29);
                    this.h[i29] = new org.telegram.ui.Cells.j6(context);
                    this.h[i29].setTag(Integer.valueOf(i29));
                    this.h[i29].setBackgroundDrawable(org.telegram.ui.ActionBar.k6.K0(true));
                    this.h[i29].c(android.support.v4.media.a.z(s0(tL_shippingOption.prices), " - ", tL_shippingOption.title), i29 == 0, i29 != size + (-1));
                    this.h[i29].setOnClickListener(new hn0(this, 11));
                    this.N.addView(this.h[i29]);
                    i29++;
                }
                this.J[0] = new org.telegram.ui.Cells.a9(context, this.V0);
                this.J[0].setBackgroundDrawable(org.telegram.ui.ActionBar.k6.V0(context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.k6.b7));
                this.N.addView(this.J[0], k7.c6.n(-1, -2));
            } else {
                int i30 = 13;
                if (i16 == 3) {
                    this.f = new EditTextBoldCursor[2];
                    int i31 = 0;
                    for (int i32 = 2; i31 < i32; i32 = 2) {
                        if (i31 == 0) {
                            z4 = false;
                            this.F[0] = new org.telegram.ui.Cells.m4(context, this.V0);
                            this.F[0].setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.k6.d6));
                            this.F[0].setText(LocaleController.getString(R.string.PaymentCardTitle));
                            this.N.addView(this.F[0], k7.c6.n(-1, -2));
                        } else {
                            z4 = false;
                        }
                        FrameLayout frameLayout4 = new FrameLayout(context);
                        frameLayout4.setClipChildren(z4);
                        this.N.addView(frameLayout4, k7.c6.n(-1, 50));
                        int i33 = org.telegram.ui.ActionBar.k6.d6;
                        frameLayout4.setBackgroundColor(getThemedColor(i33));
                        boolean z14 = i31 != 1;
                        if (z14) {
                            if (i31 != 7 || this.z0.invoice.phone_requested) {
                                if (i31 == 6) {
                                    TLRPC.TL_invoice tL_invoice8 = this.z0.invoice;
                                    if (!tL_invoice8.phone_requested) {
                                    }
                                }
                            }
                            z14 = false;
                        }
                        if (z14) {
                            org.telegram.ui.Components.jn jnVar3 = new org.telegram.ui.Components.jn(context, 13);
                            jnVar3.setBackgroundColor(getThemedColor(i33));
                            this.G.add(jnVar3);
                            frameLayout4.addView(jnVar3, new FrameLayout.LayoutParams(-1, 1, 83));
                        }
                        this.f[i31] = new EditTextBoldCursor(context);
                        this.f[i31].setTag(Integer.valueOf(i31));
                        this.f[i31].setTextSize(1, 16.0f);
                        this.f[i31].setHintTextColor(getThemedColor(org.telegram.ui.ActionBar.k6.H6));
                        EditTextBoldCursor editTextBoldCursor5 = this.f[i31];
                        int i34 = org.telegram.ui.ActionBar.k6.G6;
                        editTextBoldCursor5.setTextColor(getThemedColor(i34));
                        this.f[i31].setBackgroundDrawable(null);
                        this.f[i31].setCursorColor(getThemedColor(i34));
                        this.f[i31].setCursorSize(AndroidUtilities.dp(20.0f));
                        this.f[i31].setCursorWidth(1.5f);
                        if (i31 == 0) {
                            this.f[i31].setOnTouchListener(new org.telegram.ui.ActionBar.s2(27));
                            this.f[i31].setInputType(0);
                        } else {
                            this.f[i31].setInputType(129);
                            this.f[i31].setTypeface(Typeface.DEFAULT);
                        }
                        this.f[i31].setImeOptions(268435462);
                        if (i31 == 0) {
                            EditTextBoldCursor editTextBoldCursor6 = this.f[i31];
                            TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard = this.v0;
                            editTextBoldCursor6.setText(tL_paymentSavedCredentialsCard == null ? str11 : tL_paymentSavedCredentialsCard.title);
                        } else if (i31 == 1) {
                            this.f[i31].setHint(LocaleController.getString(R.string.LoginPassword));
                            this.f[i31].requestFocus();
                        }
                        this.f[i31].setPadding(0, 0, 0, AndroidUtilities.dp(6.0f));
                        this.f[i31].setGravity(LocaleController.isRTL ? 5 : 3);
                        frameLayout4.addView(this.f[i31], k7.c6.d(-1, -2.0f, 51, 21.0f, 12.0f, 21.0f, 6.0f));
                        final int i35 = 4;
                        this.f[i31].setOnEditorActionListener(new TextView.OnEditorActionListener(this) { // from class: org.telegram.ui.jn0
                            public final /* synthetic */ lo0 b;

                            {
                                this.b = this;
                            }

                            @Override // android.widget.TextView.OnEditorActionListener
                            public final boolean onEditorAction(TextView textView2, int i222, KeyEvent keyEvent) {
                                EditTextBoldCursor[] editTextBoldCursorArr;
                                switch (i35) {
                                    case 0:
                                        lo0 lo0Var = this.b;
                                        if (i222 != 6) {
                                            lo0Var.getClass();
                                            break;
                                        } else {
                                            lo0Var.A0(false);
                                            break;
                                        }
                                    case 1:
                                        lo0 lo0Var2 = this.b;
                                        if (i222 != 6) {
                                            lo0Var2.getClass();
                                            if (i222 == 5) {
                                                int intValue = ((Integer) textView2.getTag()).intValue();
                                                if (intValue != 0) {
                                                    if (intValue == 1) {
                                                        lo0Var2.f[2].requestFocus();
                                                        break;
                                                    }
                                                } else {
                                                    lo0Var2.f[1].requestFocus();
                                                    break;
                                                }
                                            }
                                        } else {
                                            lo0Var2.n.performClick();
                                            break;
                                        }
                                        break;
                                    case 2:
                                        lo0 lo0Var3 = this.b;
                                        lo0Var3.getClass();
                                        if (i222 != 5) {
                                            if (i222 == 6) {
                                                lo0Var3.n.performClick();
                                                break;
                                            }
                                        } else {
                                            int intValue2 = ((Integer) textView2.getTag()).intValue();
                                            while (true) {
                                                intValue2++;
                                                EditTextBoldCursor[] editTextBoldCursorArr2 = lo0Var3.f;
                                                if (intValue2 >= editTextBoldCursorArr2.length) {
                                                    break;
                                                } else if (intValue2 != 4 && ((View) editTextBoldCursorArr2[intValue2].getParent()).getVisibility() == 0) {
                                                    lo0Var3.f[intValue2].requestFocus();
                                                    break;
                                                }
                                            }
                                        }
                                        break;
                                    case 3:
                                        lo0 lo0Var4 = this.b;
                                        lo0Var4.getClass();
                                        if (i222 != 5) {
                                            if (i222 == 6) {
                                                lo0Var4.n.performClick();
                                                break;
                                            }
                                        } else {
                                            int intValue3 = ((Integer) textView2.getTag()).intValue();
                                            do {
                                                int i232 = intValue3 + 1;
                                                editTextBoldCursorArr = lo0Var4.f;
                                                if (i232 >= editTextBoldCursorArr.length) {
                                                    break;
                                                } else {
                                                    intValue3 = i232 == 4 ? intValue3 + 2 : i232;
                                                }
                                            } while (((View) editTextBoldCursorArr[intValue3].getParent()).getVisibility() != 0);
                                            lo0Var4.f[intValue3].requestFocus();
                                            break;
                                        }
                                        break;
                                    default:
                                        lo0 lo0Var5 = this.b;
                                        if (i222 != 6) {
                                            lo0Var5.getClass();
                                            break;
                                        } else {
                                            lo0Var5.n.performClick();
                                            break;
                                        }
                                }
                                return false;
                            }
                        });
                        if (i31 == 1) {
                            this.J[0] = new org.telegram.ui.Cells.a9(context, this.V0);
                            org.telegram.ui.Cells.a9 a9Var2 = this.J[0];
                            int i36 = R.string.PaymentConfirmationMessage;
                            TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard2 = this.v0;
                            a9Var2.setText(LocaleController.formatString("PaymentConfirmationMessage", i36, tL_paymentSavedCredentialsCard2 == null ? str11 : tL_paymentSavedCredentialsCard2.title));
                            org.telegram.ui.Cells.a9 a9Var3 = this.J[0];
                            int i37 = R.drawable.greydivider;
                            int i38 = org.telegram.ui.ActionBar.k6.b7;
                            a9Var3.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.V0(context, i37, i38));
                            this.N.addView(this.J[0], k7.c6.n(-1, -2));
                            this.K[0] = new org.telegram.ui.Cells.aa(context, this.V0);
                            this.K[0].setBackgroundDrawable(org.telegram.ui.ActionBar.k6.K0(true));
                            this.K[0].b(LocaleController.getString(R.string.PaymentConfirmationNewCard), false);
                            this.N.addView(this.K[0], k7.c6.n(-1, -2));
                            this.K[0].setOnClickListener(new hn0(this, i30));
                            this.J[1] = new org.telegram.ui.Cells.a9(context, this.V0);
                            this.J[1].setBackgroundDrawable(org.telegram.ui.ActionBar.k6.V0(context, R.drawable.greydivider_bottom, i38));
                            this.N.addView(this.J[1], k7.c6.n(-1, -2));
                        }
                        i31++;
                    }
                } else {
                    int i39 = 14;
                    if (i16 == 4 || i16 == 5) {
                        org.telegram.ui.Cells.l5 l5Var = new org.telegram.ui.Cells.l5(context);
                        this.U = l5Var;
                        l5Var.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.k6.d6));
                        MessageObject messageObject = this.K0;
                        if (messageObject != null) {
                            this.U.b((TLRPC.TL_messageMediaInvoice) messageObject.messageOwner.media, this.m0);
                        } else {
                            TLRPC.PaymentReceipt paymentReceipt = this.A0;
                            if (paymentReceipt != null) {
                                this.U.c(paymentReceipt, this.m0);
                            } else if (this.L0 != null || this.Y0 != null) {
                                org.telegram.ui.Cells.l5 l5Var2 = this.U;
                                TLRPC.PaymentForm paymentForm4 = this.z0;
                                l5Var2.a(paymentForm4.title, paymentForm4.description, paymentForm4.photo, this.m0, paymentForm4);
                            }
                        }
                        this.N.addView(this.U, k7.c6.n(-1, -2));
                        this.H[0] = new org.telegram.ui.Cells.z6(context, (Object) null);
                        this.N.addView(this.H[0], k7.c6.n(-1, -2));
                        ArrayList arrayList2 = new ArrayList(this.z0.invoice.prices);
                        this.q0 = arrayList2;
                        TLRPC.TL_shippingOption tL_shippingOption2 = this.D0;
                        if (tL_shippingOption2 != null) {
                            arrayList2.addAll(tL_shippingOption2.prices);
                        }
                        this.O0 = new String[1];
                        for (int i40 = 0; i40 < this.q0.size(); i40++) {
                            TLRPC.TL_labeledPrice tL_labeledPrice = (TLRPC.TL_labeledPrice) this.q0.get(i40);
                            org.telegram.ui.Cells.b9 b9Var = new org.telegram.ui.Cells.b9(context);
                            b9Var.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.k6.d6));
                            b9Var.a(tL_labeledPrice.label, LocaleController.getInstance().formatCurrencyString(tL_labeledPrice.amount, this.z0.invoice.currency), false);
                            this.N.addView(b9Var);
                        }
                        if (this.r0 == 5 && this.E0 != null) {
                            org.telegram.ui.Cells.b9 b9Var2 = new org.telegram.ui.Cells.b9(context);
                            b9Var2.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.k6.d6));
                            b9Var2.a(LocaleController.getString(R.string.PaymentTip), LocaleController.getInstance().formatCurrencyString(this.E0.longValue(), this.z0.invoice.currency), false);
                            this.N.addView(b9Var2);
                        }
                        org.telegram.ui.Cells.b9 b9Var3 = new org.telegram.ui.Cells.b9(context);
                        this.O = b9Var3;
                        int i41 = org.telegram.ui.ActionBar.k6.d6;
                        b9Var3.setBackgroundColor(getThemedColor(i41));
                        this.O0[0] = s0(this.q0);
                        this.O.a(LocaleController.getString(R.string.PaymentTransactionTotal), this.O0[0], true);
                        int i42 = 17;
                        float f10 = 14.0f;
                        if (this.r0 == 4 && (this.z0.invoice.flags & 256) != 0) {
                            FrameLayout frameLayout5 = new FrameLayout(context);
                            frameLayout5.setClipChildren(false);
                            frameLayout5.setBackgroundColor(getThemedColor(i41));
                            this.N.addView(frameLayout5, k7.c6.n(-1, this.z0.invoice.suggested_tip_amounts.isEmpty() ? 40 : 78));
                            frameLayout5.setOnClickListener(new hn0(this, i39));
                            org.telegram.ui.Cells.b9 b9Var4 = new org.telegram.ui.Cells.b9(context);
                            b9Var4.setBackgroundColor(getThemedColor(i41));
                            b9Var4.a(LocaleController.getString(R.string.PaymentTipOptional), str11, false);
                            frameLayout5.addView(b9Var4);
                            this.f = new EditTextBoldCursor[]{new EditTextBoldCursor(context)};
                            this.f[0].setTag(0);
                            this.f[0].setTextSize(1, 16.0f);
                            EditTextBoldCursor editTextBoldCursor7 = this.f[0];
                            int i43 = org.telegram.ui.ActionBar.k6.z6;
                            editTextBoldCursor7.setHintTextColor(getThemedColor(i43));
                            this.f[0].setTextColor(getThemedColor(i43));
                            this.f[0].setBackgroundDrawable(null);
                            this.f[0].setCursorColor(getThemedColor(org.telegram.ui.ActionBar.k6.G6));
                            this.f[0].setCursorSize(AndroidUtilities.dp(20.0f));
                            this.f[0].setCursorWidth(1.5f);
                            this.f[0].setInputType(3);
                            this.f[0].setImeOptions(268435462);
                            this.f[0].setHint(LocaleController.getInstance().formatCurrencyString(0L, this.z0.invoice.currency));
                            this.f[0].setPadding(0, 0, 0, AndroidUtilities.dp(6.0f));
                            this.f[0].setGravity(LocaleController.isRTL ? 3 : 5);
                            frameLayout5.addView(this.f[0], k7.c6.d(-1, -2.0f, 51, 21.0f, 9.0f, 21.0f, 1.0f));
                            this.f[0].addTextChangedListener(new on0(this));
                            this.f[0].setOnEditorActionListener(new dg.a0(5));
                            this.f[0].requestFocus();
                            if (!this.z0.invoice.suggested_tip_amounts.isEmpty()) {
                                HorizontalScrollView horizontalScrollView = new HorizontalScrollView(context);
                                horizontalScrollView.setHorizontalScrollBarEnabled(false);
                                horizontalScrollView.setVerticalScrollBarEnabled(false);
                                horizontalScrollView.setClipToPadding(false);
                                horizontalScrollView.setPadding(AndroidUtilities.dp(21.0f), 0, AndroidUtilities.dp(21.0f), 0);
                                horizontalScrollView.setFillViewport(true);
                                frameLayout5.addView(horizontalScrollView, k7.c6.d(-1, 30.0f, 51, 0.0f, 44.0f, 0.0f, 0.0f));
                                int[] iArr = new int[1];
                                int[] iArr2 = new int[1];
                                int size2 = this.z0.invoice.suggested_tip_amounts.size();
                                pn0 pn0Var = new pn0(context, size2, iArr, iArr2);
                                this.p0 = pn0Var;
                                pn0Var.setOrientation(0);
                                horizontalScrollView.addView(this.p0, k7.c6.x(-1, 30, 51));
                                int themedColor = getThemedColor(org.telegram.ui.ActionBar.k6.ei);
                                int i44 = 0;
                                while (i44 < size2) {
                                    long longValue = LocaleController.isRTL ? this.z0.invoice.suggested_tip_amounts.get((size2 - i44) - 1).longValue() : this.z0.invoice.suggested_tip_amounts.get(i44).longValue();
                                    String formatCurrencyString = LocaleController.getInstance().formatCurrencyString(longValue, this.z0.invoice.currency);
                                    TextView g10 = org.telegram.messenger.y3.g(context, 1, f10);
                                    g10.setTypeface(AndroidUtilities.bold());
                                    g10.setLines(1);
                                    g10.setTag(Long.valueOf(longValue));
                                    g10.setMaxLines(1);
                                    g10.setText(formatCurrencyString);
                                    g10.setPadding(AndroidUtilities.dp(15.0f), 0, AndroidUtilities.dp(15.0f), 0);
                                    g10.setTextColor(getThemedColor(org.telegram.ui.ActionBar.k6.Z8));
                                    g10.setBackground(org.telegram.ui.ActionBar.k6.b0(AndroidUtilities.dp(15.0f), themedColor & 536870911));
                                    g10.setSingleLine(true);
                                    g10.setGravity(i42);
                                    this.p0.addView(g10, k7.c6.t(-2, -1, 19, 0, 0, i44 != size2 + (-1) ? 9 : 0, 0));
                                    int[] iArr3 = iArr2;
                                    g10.setOnClickListener(new mh.q2(this, g10, longValue, 6));
                                    int dp = AndroidUtilities.dp(30.0f) + ((int) Math.ceil(g10.getPaint().measureText(formatCurrencyString)));
                                    g10.setTag(R.id.width_tag, Integer.valueOf(dp));
                                    iArr[0] = Math.max(iArr[0], dp);
                                    iArr3[0] = iArr3[0] + dp;
                                    i44++;
                                    iArr2 = iArr3;
                                    i42 = 17;
                                    f10 = 14.0f;
                                }
                            }
                        }
                        this.N.addView(this.O);
                        this.H[2] = new org.telegram.ui.Cells.z6(context, (Object) null);
                        this.H[2].setBackgroundDrawable(org.telegram.ui.ActionBar.k6.V0(context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.k6.b7));
                        this.N.addView(this.H[2], k7.c6.n(-1, -2));
                        this.V[0] = new qn0(context);
                        this.V[0].setBackground(org.telegram.ui.ActionBar.k6.K0(true));
                        org.telegram.ui.Cells.z8 z8Var = this.V[0];
                        String str12 = this.u0;
                        z8Var.b(R.drawable.msg_payment_card, (str12 == null || str12.length() <= 1) ? this.u0 : this.u0.substring(0, 1).toUpperCase() + this.u0.substring(1), LocaleController.getString(R.string.PaymentCheckoutMethod), true);
                        int i45 = ((this.S0 || this.T0) && ((str = this.u0) == null || str.length() <= 1)) ? 8 : 0;
                        int i46 = 0;
                        this.V[0].setVisibility(i45);
                        this.N.addView(this.V[0]);
                        if (this.r0 == 4) {
                            this.V[0].setOnClickListener(new hn0(this, i46));
                        }
                        TLRPC.User user2 = null;
                        for (int i47 = 0; i47 < this.z0.users.size(); i47++) {
                            TLRPC.User user3 = this.z0.users.get(i47);
                            if (user3.id == this.z0.provider_id) {
                                user2 = user3;
                            }
                        }
                        char c12 = 1;
                        this.V[1] = new org.telegram.ui.Cells.z8(context);
                        this.V[1].setBackground(org.telegram.ui.ActionBar.k6.K0(true));
                        if (user2 != null) {
                            org.telegram.ui.Cells.z8 z8Var2 = this.V[1];
                            String formatName2 = ContactsController.formatName(user2.first_name, user2.last_name);
                            String string = LocaleController.getString(R.string.PaymentCheckoutProvider);
                            int i48 = R.drawable.msg_payment_provider;
                            TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo = this.F0;
                            z8Var2.b(i48, formatName2, string, ((tL_payments_validateRequestedInfo == null || (tL_payments_validateRequestedInfo.info.shipping_address == null && this.D0 == null)) && ((tL_paymentRequestedInfo = this.z0.saved_info) == null || tL_paymentRequestedInfo.shipping_address == null)) ? false : true);
                            c12 = 1;
                            this.N.addView(this.V[1]);
                            str11 = formatName2;
                        }
                        this.V[c12].setVisibility(user2 != null ? i45 : 8);
                        TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo2 = this.F0;
                        if (tL_payments_validateRequestedInfo2 != null || (this.S0 && (paymentForm2 = this.z0) != null && paymentForm2.saved_info != null)) {
                            TLRPC.TL_paymentRequestedInfo tL_paymentRequestedInfo12 = tL_payments_validateRequestedInfo2 != null ? tL_payments_validateRequestedInfo2.info : this.z0.saved_info;
                            this.V[2] = new org.telegram.ui.Cells.z8(context);
                            this.V[2].setVisibility(8);
                            this.N.addView(this.V[2]);
                            if (tL_paymentRequestedInfo12.shipping_address != null) {
                                this.V[2].setVisibility(0);
                                if (this.r0 == 4) {
                                    this.V[2].setBackgroundDrawable(org.telegram.ui.ActionBar.k6.K0(true));
                                    this.V[2].setOnClickListener(new hn0(this, 1));
                                } else {
                                    this.V[2].setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.k6.d6));
                                }
                            }
                            this.V[3] = new org.telegram.ui.Cells.z8(context);
                            this.V[3].setVisibility(8);
                            this.N.addView(this.V[3]);
                            if (tL_paymentRequestedInfo12.name != null) {
                                this.V[3].setVisibility(0);
                                if (this.r0 == 4) {
                                    this.V[3].setBackgroundDrawable(org.telegram.ui.ActionBar.k6.K0(true));
                                    this.V[3].setOnClickListener(new hn0(this, 2));
                                } else {
                                    this.V[3].setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.k6.d6));
                                }
                            }
                            this.V[4] = new org.telegram.ui.Cells.z8(context);
                            this.V[4].setVisibility(8);
                            this.N.addView(this.V[4]);
                            if (tL_paymentRequestedInfo12.phone != null) {
                                this.V[4].setVisibility(0);
                                if (this.r0 == 4) {
                                    this.V[4].setBackgroundDrawable(org.telegram.ui.ActionBar.k6.K0(true));
                                    this.V[4].setOnClickListener(new hn0(this, 3));
                                } else {
                                    this.V[4].setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.k6.d6));
                                }
                            }
                            this.V[5] = new org.telegram.ui.Cells.z8(context);
                            this.V[5].setVisibility(8);
                            this.N.addView(this.V[5]);
                            if (tL_paymentRequestedInfo12.email != null) {
                                this.V[5].setVisibility(0);
                                int i49 = 4;
                                if (this.r0 == 4) {
                                    this.V[5].setBackgroundDrawable(org.telegram.ui.ActionBar.k6.K0(true));
                                    this.V[5].setOnClickListener(new hn0(this, i49));
                                } else {
                                    this.V[5].setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.k6.d6));
                                }
                            }
                            if (this.D0 != null) {
                                this.V[6] = new org.telegram.ui.Cells.z8(context);
                                this.V[6].setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.k6.d6));
                                this.V[6].b(R.drawable.msg_payment_delivery, this.D0.title, LocaleController.getString(R.string.PaymentCheckoutShippingMethod), false);
                                this.N.addView(this.V[6]);
                            }
                            B0(tL_paymentRequestedInfo12);
                        }
                        if (this.r0 == 4) {
                            this.C = !this.S0;
                            if (this.Y0 instanceof TLRPC.TL_inputInvoiceStars) {
                                this.C = true;
                            }
                            this.T = new ho0(this, context);
                            View view = new View(context);
                            view.setBackground(org.telegram.ui.ActionBar.k6.f0(getThemedColor(org.telegram.ui.ActionBar.k6.i6), 2, -1));
                            this.T.addView(view, k7.c6.c(-1.0f, -1));
                            frameLayout2.addView(this.T, k7.c6.e(-1, 48, 80));
                            this.T.setOnClickListener(new hb0(9, this, str11));
                            TextView textView2 = new TextView(context);
                            this.R = textView2;
                            int i50 = org.telegram.ui.ActionBar.k6.fi;
                            textView2.setTextColor(getThemedColor(i50));
                            this.R.setText(LocaleController.formatString(R.string.PaymentCheckoutPay, this.O0[0]));
                            this.R.setTextSize(1, 14.0f);
                            this.R.setGravity(17);
                            this.R.setTypeface(AndroidUtilities.bold());
                            this.T.addView(this.R, k7.c6.c(-1.0f, -1));
                            org.telegram.ui.Components.tq tqVar2 = new org.telegram.ui.Components.tq(context, 0);
                            this.s = tqVar2;
                            tqVar2.setVisibility(4);
                            int themedColor2 = getThemedColor(i50);
                            this.s.a(805306367 & themedColor2, themedColor2);
                            this.T.addView(this.s, k7.c6.c(-1.0f, -1));
                            this.T.a(this.C, false);
                            this.R.setAlpha(!this.C ? 0.8f : 1.0f);
                            this.n.setEnabled(false);
                            this.n.getContentView().setVisibility(4);
                            AndroidUtilities.checkAndroidTheme(context, true);
                            try {
                                vn0 vn0Var = new vn0(context);
                                this.w = vn0Var;
                                vn0Var.setBackgroundColor(-1);
                                this.w.getSettings().setJavaScriptEnabled(true);
                                this.w.getSettings().setDomStorageEnabled(true);
                                this.w.getSettings().setSupportZoom(true);
                                this.w.getSettings().setBuiltInZoomControls(true);
                                this.w.getSettings().setDisplayZoomControls(false);
                                this.w.getSettings().setUseWideViewPort(true);
                                this.w.getSettings().setMixedContentMode(0);
                                CookieManager.getInstance().setAcceptThirdPartyCookies(this.w, true);
                                this.w.setWebViewClient(new wn0(this, context));
                            } catch (Exception e14) {
                                FileLog.e(e14);
                            }
                            this.S = null;
                            if (this.z0.invoice.terms_url != null) {
                                org.telegram.ui.Cells.o6 o6Var = new org.telegram.ui.Cells.o6(context, getResourceProvider());
                                this.S = o6Var;
                                o6Var.setChecked(this.C);
                                if (TextUtils.isEmpty(this.m0)) {
                                    String string2 = LocaleController.getString(R.string.PaymentCheckoutAcceptRecurrentFee);
                                    spannableStringBuilder = new SpannableStringBuilder(string2);
                                    int indexOf = string2.indexOf(42);
                                    int lastIndexOf = string2.lastIndexOf(42);
                                    if (indexOf != -1 && lastIndexOf != -1) {
                                        SpannableString spannableString = new SpannableString(string2.substring(indexOf + 1, lastIndexOf));
                                        spannableString.setSpan(new org.telegram.ui.Components.n51(this.z0.invoice.terms_url), 0, spannableString.length(), 33);
                                        int i51 = lastIndexOf + 1;
                                        spannableStringBuilder.replace(indexOf, i51, (CharSequence) spannableString);
                                        string2.substring(0, indexOf);
                                        spannableString.toString();
                                        string2.substring(i51);
                                    }
                                } else {
                                    String string3 = LocaleController.getString(R.string.PaymentCheckoutAcceptRecurrent);
                                    spannableStringBuilder = new SpannableStringBuilder(string3);
                                    int indexOf2 = string3.indexOf(42);
                                    int lastIndexOf2 = string3.lastIndexOf(42);
                                    if (indexOf2 != -1 && lastIndexOf2 != -1) {
                                        SpannableString spannableString2 = new SpannableString(string3.substring(indexOf2 + 1, lastIndexOf2));
                                        spannableString2.setSpan(new org.telegram.ui.Components.n51(this.z0.invoice.terms_url), 0, spannableString2.length(), 33);
                                        int i52 = lastIndexOf2 + 1;
                                        spannableStringBuilder.replace(indexOf2, i52, (CharSequence) spannableString2);
                                        string3 = string3.substring(0, indexOf2) + ((Object) spannableString2) + string3.substring(i52);
                                    }
                                    int indexOf3 = string3.indexOf("%1$s");
                                    if (indexOf3 != -1) {
                                        spannableStringBuilder.replace(indexOf3, indexOf3 + 4, (CharSequence) this.m0);
                                        spannableStringBuilder.setSpan(new org.telegram.ui.Components.g51(AndroidUtilities.bold()), indexOf3, this.m0.length() + indexOf3, 33);
                                    }
                                }
                                this.S.setText(spannableStringBuilder);
                                this.S.setBackground(org.telegram.ui.ActionBar.k6.g0(getThemedColor(org.telegram.ui.ActionBar.k6.d6), getThemedColor(org.telegram.ui.ActionBar.k6.i6)));
                                this.S.setOnClickListener(new hn0(this, 5));
                                frameLayout2.addView(this.S, k7.c6.d(-1, -2.0f, 80, 0.0f, 0.0f, 0.0f, 48.0f));
                            }
                            WebView webView = this.w;
                            if (webView != null) {
                                frameLayout2.addView(webView, k7.c6.c(-1.0f, -1));
                                this.w.setVisibility(8);
                            }
                        }
                        this.H[1] = new org.telegram.ui.Cells.z6(context, (Object) null);
                        this.H[1].setBackgroundDrawable(org.telegram.ui.ActionBar.k6.V0(context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.k6.b7));
                        if (i45 != 0 && this.r0 == 4 && this.F0 == null && ((paymentForm = this.z0) == null || paymentForm.saved_info == null)) {
                            c3 = 1;
                            this.H[1].setVisibility(i45);
                        } else {
                            c3 = 1;
                        }
                        this.N.addView(this.H[c3], k7.c6.n(-1, -2));
                    } else if (i16 == 6) {
                        org.telegram.ui.Cells.j3 j3Var = new org.telegram.ui.Cells.j3(context);
                        this.P = j3Var;
                        String string4 = LocaleController.getString(R.string.PasswordCode);
                        EditTextBoldCursor editTextBoldCursor8 = j3Var.a;
                        editTextBoldCursor8.setText(str11);
                        editTextBoldCursor8.setHint(string4);
                        final int i53 = 0;
                        j3Var.b = false;
                        j3Var.setWillNotDraw(true);
                        this.P.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.k6.d6));
                        EditTextBoldCursor textView3 = this.P.getTextView();
                        textView3.setInputType(3);
                        textView3.setImeOptions(6);
                        textView3.setOnEditorActionListener(new TextView.OnEditorActionListener(this) { // from class: org.telegram.ui.jn0
                            public final /* synthetic */ lo0 b;

                            {
                                this.b = this;
                            }

                            @Override // android.widget.TextView.OnEditorActionListener
                            public final boolean onEditorAction(TextView textView22, int i222, KeyEvent keyEvent) {
                                EditTextBoldCursor[] editTextBoldCursorArr;
                                switch (i53) {
                                    case 0:
                                        lo0 lo0Var = this.b;
                                        if (i222 != 6) {
                                            lo0Var.getClass();
                                            break;
                                        } else {
                                            lo0Var.A0(false);
                                            break;
                                        }
                                    case 1:
                                        lo0 lo0Var2 = this.b;
                                        if (i222 != 6) {
                                            lo0Var2.getClass();
                                            if (i222 == 5) {
                                                int intValue = ((Integer) textView22.getTag()).intValue();
                                                if (intValue != 0) {
                                                    if (intValue == 1) {
                                                        lo0Var2.f[2].requestFocus();
                                                        break;
                                                    }
                                                } else {
                                                    lo0Var2.f[1].requestFocus();
                                                    break;
                                                }
                                            }
                                        } else {
                                            lo0Var2.n.performClick();
                                            break;
                                        }
                                        break;
                                    case 2:
                                        lo0 lo0Var3 = this.b;
                                        lo0Var3.getClass();
                                        if (i222 != 5) {
                                            if (i222 == 6) {
                                                lo0Var3.n.performClick();
                                                break;
                                            }
                                        } else {
                                            int intValue2 = ((Integer) textView22.getTag()).intValue();
                                            while (true) {
                                                intValue2++;
                                                EditTextBoldCursor[] editTextBoldCursorArr2 = lo0Var3.f;
                                                if (intValue2 >= editTextBoldCursorArr2.length) {
                                                    break;
                                                } else if (intValue2 != 4 && ((View) editTextBoldCursorArr2[intValue2].getParent()).getVisibility() == 0) {
                                                    lo0Var3.f[intValue2].requestFocus();
                                                    break;
                                                }
                                            }
                                        }
                                        break;
                                    case 3:
                                        lo0 lo0Var4 = this.b;
                                        lo0Var4.getClass();
                                        if (i222 != 5) {
                                            if (i222 == 6) {
                                                lo0Var4.n.performClick();
                                                break;
                                            }
                                        } else {
                                            int intValue3 = ((Integer) textView22.getTag()).intValue();
                                            do {
                                                int i232 = intValue3 + 1;
                                                editTextBoldCursorArr = lo0Var4.f;
                                                if (i232 >= editTextBoldCursorArr.length) {
                                                    break;
                                                } else {
                                                    intValue3 = i232 == 4 ? intValue3 + 2 : i232;
                                                }
                                            } while (((View) editTextBoldCursorArr[intValue3].getParent()).getVisibility() != 0);
                                            lo0Var4.f[intValue3].requestFocus();
                                            break;
                                        }
                                        break;
                                    default:
                                        lo0 lo0Var5 = this.b;
                                        if (i222 != 6) {
                                            lo0Var5.getClass();
                                            break;
                                        } else {
                                            lo0Var5.n.performClick();
                                            break;
                                        }
                                }
                                return false;
                            }
                        });
                        textView3.addTextChangedListener(new n0(this, i30));
                        this.N.addView(this.P, k7.c6.n(-1, -2));
                        this.J[2] = new org.telegram.ui.Cells.a9(context, this.V0);
                        this.J[2].setBackgroundDrawable(org.telegram.ui.ActionBar.k6.V0(context, R.drawable.greydivider, org.telegram.ui.ActionBar.k6.b7));
                        this.N.addView(this.J[2], k7.c6.n(-1, -2));
                        this.K[1] = new org.telegram.ui.Cells.aa(context, this.V0);
                        this.K[1].setBackgroundDrawable(org.telegram.ui.ActionBar.k6.K0(true));
                        org.telegram.ui.Cells.aa aaVar = this.K[1];
                        int i54 = org.telegram.ui.ActionBar.k6.G6;
                        aaVar.setTag(Integer.valueOf(i54));
                        this.K[1].setTextColor(getThemedColor(i54));
                        this.K[1].b(LocaleController.getString(R.string.ResendCode), true);
                        this.N.addView(this.K[1], k7.c6.n(-1, -2));
                        this.K[1].setOnClickListener(new hn0(this, 6));
                        this.K[0] = new org.telegram.ui.Cells.aa(context, this.V0);
                        this.K[0].setBackgroundDrawable(org.telegram.ui.ActionBar.k6.K0(true));
                        org.telegram.ui.Cells.aa aaVar2 = this.K[0];
                        int i55 = org.telegram.ui.ActionBar.k6.p7;
                        aaVar2.setTag(Integer.valueOf(i55));
                        this.K[0].setTextColor(getThemedColor(i55));
                        this.K[0].b(LocaleController.getString(R.string.AbortPassword), false);
                        this.N.addView(this.K[0], k7.c6.n(-1, -2));
                        this.K[0].setOnClickListener(new hn0(this, 7));
                        this.f = new EditTextBoldCursor[3];
                        int i56 = 0;
                        for (int i57 = 3; i56 < i57; i57 = 3) {
                            if (i56 == 0) {
                                this.F[0] = new org.telegram.ui.Cells.m4(context, this.V0);
                                this.F[0].setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.k6.d6));
                                this.F[0].setText(LocaleController.getString(R.string.PaymentPasswordTitle));
                                this.N.addView(this.F[0], k7.c6.n(-1, -2));
                            } else if (i56 == 2) {
                                this.F[1] = new org.telegram.ui.Cells.m4(context, this.V0);
                                this.F[1].setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.k6.d6));
                                this.F[1].setText(LocaleController.getString(R.string.PaymentPasswordEmailTitle));
                                this.N.addView(this.F[1], k7.c6.n(-1, -2));
                            }
                            FrameLayout frameLayout6 = new FrameLayout(context);
                            frameLayout6.setClipChildren(false);
                            this.N.addView(frameLayout6, k7.c6.n(-1, 50));
                            int i58 = org.telegram.ui.ActionBar.k6.d6;
                            frameLayout6.setBackgroundColor(getThemedColor(i58));
                            if (i56 == 0) {
                                org.telegram.ui.Components.jn jnVar4 = new org.telegram.ui.Components.jn(context, 14);
                                jnVar4.setBackgroundColor(getThemedColor(i58));
                                this.G.add(jnVar4);
                                frameLayout6.addView(jnVar4, new FrameLayout.LayoutParams(-1, 1, 83));
                            }
                            this.f[i56] = new EditTextBoldCursor(context);
                            this.f[i56].setTag(Integer.valueOf(i56));
                            this.f[i56].setTextSize(1, 16.0f);
                            this.f[i56].setHintTextColor(getThemedColor(org.telegram.ui.ActionBar.k6.H6));
                            EditTextBoldCursor editTextBoldCursor9 = this.f[i56];
                            int i59 = org.telegram.ui.ActionBar.k6.G6;
                            editTextBoldCursor9.setTextColor(getThemedColor(i59));
                            this.f[i56].setBackgroundDrawable(null);
                            this.f[i56].setCursorColor(getThemedColor(i59));
                            this.f[i56].setCursorSize(AndroidUtilities.dp(20.0f));
                            this.f[i56].setCursorWidth(1.5f);
                            if (i56 == 0 || i56 == 1) {
                                this.f[i56].setInputType(129);
                                this.f[i56].setTypeface(Typeface.DEFAULT);
                                this.f[i56].setImeOptions(268435461);
                            } else {
                                this.f[i56].setInputType(33);
                                this.f[i56].setImeOptions(268435462);
                            }
                            if (i56 == 0) {
                                this.f[i56].setHint(LocaleController.getString(R.string.PaymentPasswordEnter));
                                this.f[i56].requestFocus();
                            } else if (i56 == 1) {
                                this.f[i56].setHint(LocaleController.getString(R.string.PaymentPasswordReEnter));
                            } else if (i56 == 2) {
                                this.f[i56].setHint(LocaleController.getString(R.string.PaymentPasswordEmail));
                            }
                            this.f[i56].setPadding(0, 0, 0, AndroidUtilities.dp(6.0f));
                            this.f[i56].setGravity(LocaleController.isRTL ? 5 : 3);
                            frameLayout6.addView(this.f[i56], k7.c6.d(-1, -2.0f, 51, 21.0f, 12.0f, 21.0f, 6.0f));
                            final int i60 = 1;
                            this.f[i56].setOnEditorActionListener(new TextView.OnEditorActionListener(this) { // from class: org.telegram.ui.jn0
                                public final /* synthetic */ lo0 b;

                                {
                                    this.b = this;
                                }

                                @Override // android.widget.TextView.OnEditorActionListener
                                public final boolean onEditorAction(TextView textView22, int i222, KeyEvent keyEvent) {
                                    EditTextBoldCursor[] editTextBoldCursorArr;
                                    switch (i60) {
                                        case 0:
                                            lo0 lo0Var = this.b;
                                            if (i222 != 6) {
                                                lo0Var.getClass();
                                                break;
                                            } else {
                                                lo0Var.A0(false);
                                                break;
                                            }
                                        case 1:
                                            lo0 lo0Var2 = this.b;
                                            if (i222 != 6) {
                                                lo0Var2.getClass();
                                                if (i222 == 5) {
                                                    int intValue = ((Integer) textView22.getTag()).intValue();
                                                    if (intValue != 0) {
                                                        if (intValue == 1) {
                                                            lo0Var2.f[2].requestFocus();
                                                            break;
                                                        }
                                                    } else {
                                                        lo0Var2.f[1].requestFocus();
                                                        break;
                                                    }
                                                }
                                            } else {
                                                lo0Var2.n.performClick();
                                                break;
                                            }
                                            break;
                                        case 2:
                                            lo0 lo0Var3 = this.b;
                                            lo0Var3.getClass();
                                            if (i222 != 5) {
                                                if (i222 == 6) {
                                                    lo0Var3.n.performClick();
                                                    break;
                                                }
                                            } else {
                                                int intValue2 = ((Integer) textView22.getTag()).intValue();
                                                while (true) {
                                                    intValue2++;
                                                    EditTextBoldCursor[] editTextBoldCursorArr2 = lo0Var3.f;
                                                    if (intValue2 >= editTextBoldCursorArr2.length) {
                                                        break;
                                                    } else if (intValue2 != 4 && ((View) editTextBoldCursorArr2[intValue2].getParent()).getVisibility() == 0) {
                                                        lo0Var3.f[intValue2].requestFocus();
                                                        break;
                                                    }
                                                }
                                            }
                                            break;
                                        case 3:
                                            lo0 lo0Var4 = this.b;
                                            lo0Var4.getClass();
                                            if (i222 != 5) {
                                                if (i222 == 6) {
                                                    lo0Var4.n.performClick();
                                                    break;
                                                }
                                            } else {
                                                int intValue3 = ((Integer) textView22.getTag()).intValue();
                                                do {
                                                    int i232 = intValue3 + 1;
                                                    editTextBoldCursorArr = lo0Var4.f;
                                                    if (i232 >= editTextBoldCursorArr.length) {
                                                        break;
                                                    } else {
                                                        intValue3 = i232 == 4 ? intValue3 + 2 : i232;
                                                    }
                                                } while (((View) editTextBoldCursorArr[intValue3].getParent()).getVisibility() != 0);
                                                lo0Var4.f[intValue3].requestFocus();
                                                break;
                                            }
                                            break;
                                        default:
                                            lo0 lo0Var5 = this.b;
                                            if (i222 != 6) {
                                                lo0Var5.getClass();
                                                break;
                                            } else {
                                                lo0Var5.n.performClick();
                                                break;
                                            }
                                    }
                                    return false;
                                }
                            });
                            if (i56 == 1) {
                                this.J[0] = new org.telegram.ui.Cells.a9(context, this.V0);
                                this.J[0].setText(LocaleController.getString(R.string.PaymentPasswordInfo));
                                this.J[0].setBackgroundDrawable(org.telegram.ui.ActionBar.k6.V0(context, R.drawable.greydivider, org.telegram.ui.ActionBar.k6.b7));
                                this.N.addView(this.J[0], k7.c6.n(-1, -2));
                            } else if (i56 == 2) {
                                this.J[1] = new org.telegram.ui.Cells.a9(context, this.V0);
                                this.J[1].setText(LocaleController.getString(R.string.PaymentPasswordEmailInfo));
                                this.J[1].setBackgroundDrawable(org.telegram.ui.ActionBar.k6.V0(context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.k6.b7));
                                this.N.addView(this.J[1], k7.c6.n(-1, -2));
                            }
                            i56++;
                        }
                        J0();
                    }
                }
            }
        }
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.twoStepPasswordChanged) {
            TLRPC.PaymentForm paymentForm = this.z0;
            paymentForm.password_missing = false;
            paymentForm.can_save_credentials = true;
            K0();
            return;
        }
        if (i10 == NotificationCenter.didRemoveTwoStepPassword) {
            TLRPC.PaymentForm paymentForm2 = this.z0;
            paymentForm2.password_missing = true;
            paymentForm2.can_save_credentials = false;
            K0();
            return;
        }
        if (i10 == NotificationCenter.paymentFinished) {
            this.X0 = true;
            removeSelfFromStack();
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final org.telegram.ui.ActionBar.g6 getResourceProvider() {
        return this.V0;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.k6.a7));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.k6.s8;
        arrayList.add(new org.telegram.ui.ActionBar.m6(kVar, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 32768, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.k6.v8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.k6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.k6.t8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, TLObject.FLAG_27, null, null, null, null, org.telegram.ui.ActionBar.k6.C8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, 67108864, null, null, null, null, org.telegram.ui.ActionBar.k6.D8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.N, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.k6.k0, null, null, org.telegram.ui.ActionBar.k6.d7));
        org.telegram.ui.Components.tq tqVar = this.r;
        int i11 = org.telegram.ui.ActionBar.k6.D7;
        arrayList.add(new org.telegram.ui.ActionBar.m6(tqVar, 0, null, null, null, null, i11));
        org.telegram.ui.Components.tq tqVar2 = this.r;
        int i12 = org.telegram.ui.ActionBar.k6.E7;
        arrayList.add(new org.telegram.ui.ActionBar.m6(tqVar2, 0, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.s, 0, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.s, 0, null, null, null, null, i12));
        if (this.f != null) {
            int i13 = 0;
            while (true) {
                EditTextBoldCursor[] editTextBoldCursorArr = this.f;
                if (i13 >= editTextBoldCursorArr.length) {
                    break;
                }
                arrayList.add(new org.telegram.ui.ActionBar.m6((View) editTextBoldCursorArr[i13].getParent(), 1, null, null, null, null, org.telegram.ui.ActionBar.k6.d6));
                arrayList.add(new org.telegram.ui.ActionBar.m6(this.f[i13], 4, null, null, null, null, org.telegram.ui.ActionBar.k6.G6));
                arrayList.add(new org.telegram.ui.ActionBar.m6(this.f[i13], TLObject.FLAG_23, null, null, null, null, org.telegram.ui.ActionBar.k6.H6));
                i13++;
            }
        } else {
            arrayList.add(new org.telegram.ui.ActionBar.m6(null, 4, null, null, null, null, org.telegram.ui.ActionBar.k6.G6));
            arrayList.add(new org.telegram.ui.ActionBar.m6(null, TLObject.FLAG_23, null, null, null, null, org.telegram.ui.ActionBar.k6.H6));
        }
        if (this.h != null) {
            int i14 = 0;
            while (true) {
                org.telegram.ui.Cells.j6[] j6VarArr = this.h;
                if (i14 >= j6VarArr.length) {
                    break;
                }
                arrayList.add(new org.telegram.ui.ActionBar.m6(j6VarArr[i14], TLObject.FLAG_28, null, null, null, null, org.telegram.ui.ActionBar.k6.d6));
                arrayList.add(new org.telegram.ui.ActionBar.m6(this.h[i14], TLObject.FLAG_28, null, null, null, null, org.telegram.ui.ActionBar.k6.i6));
                arrayList.add(new org.telegram.ui.ActionBar.m6(this.h[i14], 0, new Class[]{org.telegram.ui.Cells.j6.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.G6));
                arrayList.add(new org.telegram.ui.ActionBar.m6(this.h[i14], 8192, new Class[]{org.telegram.ui.Cells.j6.class}, new String[]{"radioButton"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.g7));
                arrayList.add(new org.telegram.ui.ActionBar.m6(this.h[i14], 16384, new Class[]{org.telegram.ui.Cells.j6.class}, new String[]{"radioButton"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.h7));
                i14++;
            }
        } else {
            arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, new Class[]{org.telegram.ui.Cells.j6.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.G6));
            arrayList.add(new org.telegram.ui.ActionBar.m6(null, 8192, new Class[]{org.telegram.ui.Cells.j6.class}, new String[]{"radioButton"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.g7));
            arrayList.add(new org.telegram.ui.ActionBar.m6(null, 16384, new Class[]{org.telegram.ui.Cells.j6.class}, new String[]{"radioButton"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.h7));
        }
        int i15 = 0;
        while (true) {
            org.telegram.ui.Cells.m4[] m4VarArr = this.F;
            if (i15 >= m4VarArr.length) {
                break;
            }
            arrayList.add(new org.telegram.ui.ActionBar.m6(m4VarArr[i15], 1, null, null, null, null, org.telegram.ui.ActionBar.k6.d6));
            arrayList.add(new org.telegram.ui.ActionBar.m6(m4VarArr[i15], 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.L6));
            i15++;
        }
        int i16 = 0;
        while (true) {
            org.telegram.ui.Cells.z6[] z6VarArr = this.H;
            if (i16 >= z6VarArr.length) {
                break;
            }
            arrayList.add(new org.telegram.ui.ActionBar.m6(z6VarArr[i16], 32, new Class[]{org.telegram.ui.Cells.z6.class}, null, null, null, org.telegram.ui.ActionBar.k6.b7));
            i16++;
        }
        int i17 = 0;
        while (true) {
            org.telegram.ui.Cells.a9[] a9VarArr = this.J;
            if (i17 >= a9VarArr.length) {
                break;
            }
            arrayList.add(new org.telegram.ui.ActionBar.m6(a9VarArr[i17], 32, new Class[]{org.telegram.ui.Cells.a9.class}, null, null, null, org.telegram.ui.ActionBar.k6.b7));
            arrayList.add(new org.telegram.ui.ActionBar.m6(a9VarArr[i17], 0, new Class[]{org.telegram.ui.Cells.a9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.B6));
            arrayList.add(new org.telegram.ui.ActionBar.m6(a9VarArr[i17], 2, new Class[]{org.telegram.ui.Cells.a9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.J6));
            i17++;
        }
        int i18 = 0;
        while (true) {
            ArrayList arrayList2 = this.G;
            if (i18 >= arrayList2.size()) {
                break;
            }
            arrayList.add(new org.telegram.ui.ActionBar.m6((View) arrayList2.get(i18), 1, null, null, null, null, org.telegram.ui.ActionBar.k6.d6));
            i18++;
        }
        org.telegram.ui.Cells.j3 j3Var = this.P;
        int i19 = org.telegram.ui.ActionBar.k6.d6;
        arrayList.add(new org.telegram.ui.ActionBar.m6(j3Var, 1, null, null, null, null, i19));
        int i20 = org.telegram.ui.ActionBar.k6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.P, 4, new Class[]{org.telegram.ui.Cells.j3.class}, new String[]{"textView"}, null, null, -1, null, i20));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.P, TLObject.FLAG_23, new Class[]{org.telegram.ui.Cells.j3.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.H6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.E, 4, null, null, null, null, i20));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.I, 0, new Class[]{org.telegram.ui.Cells.s8.class}, new String[]{"textView"}, null, null, -1, null, i20));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.I, 0, new Class[]{org.telegram.ui.Cells.s8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.M6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.I, 0, new Class[]{org.telegram.ui.Cells.s8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.N6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.I, TLObject.FLAG_28, null, null, null, null, i19));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.I, TLObject.FLAG_28, null, null, null, null, org.telegram.ui.ActionBar.k6.i6));
        int i21 = 0;
        while (true) {
            org.telegram.ui.Cells.aa[] aaVarArr = this.K;
            if (i21 >= aaVarArr.length) {
                break;
            }
            arrayList.add(new org.telegram.ui.ActionBar.m6(aaVarArr[i21], TLObject.FLAG_28, null, null, null, null, org.telegram.ui.ActionBar.k6.d6));
            arrayList.add(new org.telegram.ui.ActionBar.m6(aaVarArr[i21], TLObject.FLAG_28, null, null, null, null, org.telegram.ui.ActionBar.k6.i6));
            arrayList.add(new org.telegram.ui.ActionBar.m6(aaVarArr[i21], 0, new Class[]{org.telegram.ui.Cells.aa.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.G6));
            i21++;
        }
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.R, 4, null, null, null, null, org.telegram.ui.ActionBar.k6.s6));
        int i22 = org.telegram.ui.ActionBar.k6.d6;
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.N, 16, new Class[]{org.telegram.ui.Cells.b9.class}, null, null, null, i22));
        int i23 = org.telegram.ui.ActionBar.k6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.N, 262144, new Class[]{org.telegram.ui.Cells.b9.class}, new String[]{"textView"}, null, null, -1, null, i23));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.N, 262144, new Class[]{org.telegram.ui.Cells.b9.class}, new String[]{"valueTextView"}, null, null, -1, null, i23));
        int i24 = org.telegram.ui.ActionBar.k6.z6;
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.N, 262144, new Class[]{org.telegram.ui.Cells.b9.class}, new String[]{"textView"}, null, null, -1, null, i24));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.N, 262144, new Class[]{org.telegram.ui.Cells.b9.class}, new String[]{"valueTextView"}, null, null, -1, null, i24));
        org.telegram.ui.Cells.z8[] z8VarArr = this.V;
        arrayList.add(new org.telegram.ui.ActionBar.m6(z8VarArr[0], TLObject.FLAG_28, null, null, null, null, i22));
        arrayList.add(new org.telegram.ui.ActionBar.m6(z8VarArr[0], TLObject.FLAG_28, null, null, null, null, org.telegram.ui.ActionBar.k6.i6));
        for (int i25 = 1; i25 < z8VarArr.length; i25++) {
            arrayList.add(new org.telegram.ui.ActionBar.m6(z8VarArr[i25], 1, null, null, null, null, org.telegram.ui.ActionBar.k6.d6));
            arrayList.add(new org.telegram.ui.ActionBar.m6(z8VarArr[i25], 0, new Class[]{org.telegram.ui.Cells.z8.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.G6));
            arrayList.add(new org.telegram.ui.ActionBar.m6(z8VarArr[i25], 0, new Class[]{org.telegram.ui.Cells.z8.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.z6));
        }
        org.telegram.ui.Cells.l5 l5Var = this.U;
        int i26 = org.telegram.ui.ActionBar.k6.d6;
        arrayList.add(new org.telegram.ui.ActionBar.m6(l5Var, 1, null, null, null, null, i26));
        int i27 = org.telegram.ui.ActionBar.k6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.U, 0, new Class[]{org.telegram.ui.Cells.l5.class}, new String[]{"nameTextView"}, null, null, -1, null, i27));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.U, 0, new Class[]{org.telegram.ui.Cells.l5.class}, new String[]{"detailTextView"}, null, null, -1, null, i27));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.U, 0, new Class[]{org.telegram.ui.Cells.l5.class}, new String[]{"detailExTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.z6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.T, TLObject.FLAG_28, null, null, null, null, i26));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.T, TLObject.FLAG_28, null, null, null, null, org.telegram.ui.ActionBar.k6.i6));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return this.D;
    }

    public final void n0(Context context) {
        FrameLayout frameLayout = new FrameLayout(context);
        this.L = frameLayout;
        frameLayout.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.K0(true));
        this.L.setVisibility(8);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.M = frameLayout2;
        frameLayout2.setClickable(true);
        this.M.setFocusable(true);
        this.M.setBackgroundResource(R.drawable.googlepay_button_no_shadow_background);
        if (this.H0 == null) {
            this.M.setPadding(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(2.0f));
        } else {
            this.M.setPadding(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f));
        }
        this.L.addView(this.M, k7.c6.c(48.0f, -1));
        this.M.setOnClickListener(new hn0(this, 12));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setWeightSum(2.0f);
        linearLayout.setGravity(16);
        linearLayout.setOrientation(1);
        linearLayout.setDuplicateParentStateEnabled(true);
        this.M.addView(linearLayout, k7.c6.c(-1.0f, -1));
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageView.setDuplicateParentStateEnabled(true);
        imageView.setImageResource(R.drawable.buy_with_googlepay_button_content);
        linearLayout.addView(imageView, k7.c6.l(1.0f, -1, 0));
        ImageView imageView2 = new ImageView(context);
        imageView2.setScaleType(ImageView.ScaleType.FIT_XY);
        imageView2.setDuplicateParentStateEnabled(true);
        imageView2.setImageResource(R.drawable.googlepay_button_overlay);
        this.M.addView(imageView2, k7.c6.c(-1.0f, -1));
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x003a A[Catch: Exception -> 0x001a, TryCatch #0 {Exception -> 0x001a, blocks: (B:2:0x0000, B:4:0x000d, B:6:0x0013, B:12:0x001d, B:14:0x0024, B:22:0x003a, B:23:0x0042, B:25:0x0048, B:29:0x0054, B:33:0x0062, B:35:0x0075, B:31:0x006f, B:39:0x0086), top: B:1:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0048 A[Catch: Exception -> 0x001a, TryCatch #0 {Exception -> 0x001a, blocks: (B:2:0x0000, B:4:0x000d, B:6:0x0013, B:12:0x001d, B:14:0x0024, B:22:0x003a, B:23:0x0042, B:25:0x0048, B:29:0x0054, B:33:0x0062, B:35:0x0075, B:31:0x006f, B:39:0x0086), top: B:1:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void o0(String str) {
        boolean z4;
        boolean z10;
        try {
            TelephonyManager telephonyManager = (TelephonyManager) ApplicationLoader.applicationContext.getSystemService("phone");
            if (str == null && (telephonyManager.getSimState() == 1 || telephonyManager.getPhoneType() == 0)) {
                return;
            }
            if (Build.VERSION.SDK_INT >= 23 && getParentActivity().checkSelfPermission("android.permission.READ_PHONE_STATE") != 0) {
                z4 = false;
                if (str == null || z4) {
                    if (str == null) {
                        str = se.b.d(telephonyManager.getLine1Number(), false);
                    }
                    if (TextUtils.isEmpty(str)) {
                        int i10 = 4;
                        String str2 = null;
                        if (str.length() > 4) {
                            while (true) {
                                if (i10 < 1) {
                                    z10 = false;
                                    break;
                                }
                                String substring = str.substring(0, i10);
                                if (((String) this.c.get(substring)) != null) {
                                    str2 = str.substring(i10);
                                    this.f[8].setText(substring);
                                    z10 = true;
                                    break;
                                }
                                i10--;
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
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            z4 = true;
            if (str == null) {
            }
            if (str == null) {
            }
            if (TextUtils.isEmpty(str)) {
            }
        } catch (Exception e6) {
            FileLog.e(e6);
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onActivityResultFragment(int i10, int i11, Intent intent) {
        if (i10 == 991) {
            AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.gy(this, i11, intent, 29));
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean onBackPressed(boolean z4) {
        WebView webView = this.w;
        if (webView == null || !this.y) {
            return !this.M0;
        }
        if (z4) {
            webView.loadUrl(this.x);
            this.y = false;
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        if (this.r0 == 4 && this.U0) {
            this.U0 = false;
            this.T.callOnClick();
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean onFragmentCreate() {
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.twoStepPasswordChanged);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.didRemoveTwoStepPassword);
        if (this.r0 != 4 || this.S0) {
            NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.paymentFinished);
        }
        return super.onFragmentCreate();
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00c4, code lost:
    
        if (r0 != 6) goto L58;
     */
    @Override // org.telegram.ui.ActionBar.p2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onFragmentDestroy() {
        jo0 jo0Var = this.Q;
        if (jo0Var != null) {
            jo0Var.b();
        }
        int i10 = 0;
        AndroidUtilities.checkAndroidTheme(getParentActivity(), false);
        if (!this.X0) {
            this.c1 = 2;
            if (this.W0 != null) {
                org.telegram.ui.ActionBar.f5 f5Var = this.parentLayout;
                if (f5Var != null && f5Var.getFragmentStack() != null) {
                    int indexOf = this.parentLayout.getFragmentStack().indexOf(this);
                    if (indexOf == -1) {
                        indexOf = this.parentLayout.getFragmentStack().size();
                    }
                    while (true) {
                        if (i10 >= this.parentLayout.getFragmentStack().size()) {
                            i10 = indexOf;
                            break;
                        } else if (((org.telegram.ui.ActionBar.p2) this.parentLayout.getFragmentStack().get(i10)) instanceof lo0) {
                            break;
                        } else {
                            i10++;
                        }
                    }
                    i10 -= indexOf;
                }
                if (i10 == 0) {
                    this.W0.a(this.c1);
                }
            }
        }
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.twoStepPasswordChanged);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.didRemoveTwoStepPassword);
        if (this.r0 != 4 || this.S0) {
            NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.paymentFinished);
        }
        WebView webView = this.w;
        if (webView != null) {
            try {
                ViewParent parent = webView.getParent();
                if (parent != null) {
                    ((ViewGroup) parent).removeView(this.w);
                }
                this.w.stopLoading();
                this.w.loadUrl("about:blank");
                this.x = null;
                this.w.destroy();
                this.w = null;
            } catch (Exception e6) {
                FileLog.e(e6);
            }
        }
        try {
            int i11 = this.r0;
            if (i11 != 2) {
            }
            if (Build.VERSION.SDK_INT >= 23) {
                if (SharedConfig.passcodeHash.length() != 0) {
                    if (SharedConfig.allowScreenCapture) {
                    }
                }
                getParentActivity().getWindow().clearFlags(8192);
                AndroidUtilities.logFlagSecure();
            }
        } catch (Throwable th2) {
            FileLog.e(th2);
        }
        super.onFragmentDestroy();
        this.N0 = true;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onResume() {
        super.onResume();
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
        if (Build.VERSION.SDK_INT >= 23) {
            try {
                int i10 = this.r0;
                if ((i10 == 2 || i10 == 6) && !this.z0.invoice.test) {
                    getParentActivity().getWindow().setFlags(8192, 8192);
                    AndroidUtilities.logFlagSecure();
                } else if (SharedConfig.passcodeHash.length() == 0 || SharedConfig.allowScreenCapture) {
                    getParentActivity().getWindow().clearFlags(8192);
                    AndroidUtilities.logFlagSecure();
                }
            } catch (Throwable th2) {
                FileLog.e(th2);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onTransitionAnimationEnd(boolean z4, boolean z10) {
        if (!z4 || z10) {
            return;
        }
        WebView webView = this.w;
        if (webView != null) {
            if (this.r0 != 4) {
                TLRPC.TL_paymentFormMethod tL_paymentFormMethod = this.C0;
                if (tL_paymentFormMethod != null) {
                    String str = tL_paymentFormMethod.url;
                    this.x = str;
                    webView.loadUrl(str);
                    return;
                } else {
                    String str2 = this.z0.url;
                    this.x = str2;
                    webView.loadUrl(str2);
                    return;
                }
            }
            return;
        }
        int i10 = this.r0;
        if (i10 == 2) {
            AndroidUtilities.runOnUIThread(new kn0(this, 0), 100L);
            return;
        }
        if (i10 == 3) {
            this.f[1].requestFocus();
            AndroidUtilities.showKeyboard(this.f[1]);
            return;
        }
        if (i10 == 4) {
            EditTextBoldCursor[] editTextBoldCursorArr = this.f;
            if (editTextBoldCursorArr != null) {
                editTextBoldCursorArr[0].requestFocus();
                return;
            }
            return;
        }
        if (i10 != 6 || this.Y) {
            return;
        }
        this.f[0].requestFocus();
        AndroidUtilities.showKeyboard(this.f[0]);
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean presentFragment(org.telegram.ui.ActionBar.p2 p2Var) {
        y0(p2Var);
        return super.presentFragment(p2Var);
    }

    public final long q0() {
        TLRPC.InputInvoice inputInvoice = this.Y0;
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

    public final long r0() {
        TLRPC.InputPeer inputPeer;
        TLRPC.InputInvoice inputInvoice = this.Y0;
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
        return DialogObject.getPeerDialogId(inputPeer);
    }

    public final String s0(ArrayList arrayList) {
        long j10 = 0;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            j10 += ((TLRPC.TL_labeledPrice) arrayList.get(i10)).amount;
        }
        Long l10 = this.E0;
        if (l10 != null) {
            j10 += l10.longValue();
        }
        return LocaleController.getInstance().formatCurrencyString(j10, this.z0.invoice.currency);
    }

    public final void t0() {
        int i10;
        int i11;
        boolean z4;
        int i12 = this.r0;
        if (i12 == 0) {
            jo0 jo0Var = this.Q;
            if (jo0Var != null) {
                jo0Var.d(this.F0);
                finishFragment();
                return;
            }
            if (this.z0.invoice.flexible) {
                i10 = 1;
            } else if (this.v0 == null && this.t0 == null) {
                i10 = 2;
            } else {
                if (UserConfig.getInstance(this.currentAccount).tmpPassword != null && UserConfig.getInstance(this.currentAccount).tmpPassword.valid_until < ConnectionsManager.getInstance(this.currentAccount).getCurrentTime() + 60) {
                    UserConfig.getInstance(this.currentAccount).tmpPassword = null;
                    UserConfig.getInstance(this.currentAccount).saveConfig(false);
                }
                i10 = UserConfig.getInstance(this.currentAccount).tmpPassword != null ? 4 : 3;
            }
            if (i10 == 2 && this.v0 == null && this.t0 == null && !this.z0.additional_methods.isEmpty()) {
                G0(new kn0(this, 1));
                return;
            }
            lo0 lo0Var = new lo0(this.Y0, this.z0, this.K0, this.L0, i10, this.B0, null, null, this.t0, this.u0, this.F0, this.R0, this.G0, this.o0, this.T0);
            lo0Var.Z0 = this.Z0;
            lo0Var.a1 = this.a1;
            presentFragment(lo0Var, this.P0);
            return;
        }
        if (i12 == 1) {
            if (this.t0 == null && this.u0 == null) {
                if (this.v0 != null) {
                    if (UserConfig.getInstance(this.currentAccount).tmpPassword != null && UserConfig.getInstance(this.currentAccount).tmpPassword.valid_until < ConnectionsManager.getInstance(this.currentAccount).getCurrentTime() + 60) {
                        UserConfig.getInstance(this.currentAccount).tmpPassword = null;
                        UserConfig.getInstance(this.currentAccount).saveConfig(false);
                    }
                    if (UserConfig.getInstance(this.currentAccount).tmpPassword == null) {
                        i11 = 3;
                    }
                } else {
                    i11 = 2;
                }
                if (i11 != 2 && this.u0 == null && this.v0 == null && this.t0 == null && !this.z0.additional_methods.isEmpty()) {
                    G0(new kn0(this, 1));
                    return;
                }
                lo0 lo0Var2 = new lo0(this.Y0, this.z0, this.K0, this.L0, i11, this.B0, this.D0, this.E0, this.t0, this.u0, this.F0, this.R0, this.G0, this.o0, this.T0);
                lo0Var2.Z0 = this.Z0;
                lo0Var2.a1 = this.a1;
                presentFragment(lo0Var2, this.P0);
                return;
            }
            i11 = 4;
            if (i11 != 2) {
            }
            lo0 lo0Var22 = new lo0(this.Y0, this.z0, this.K0, this.L0, i11, this.B0, this.D0, this.E0, this.t0, this.u0, this.F0, this.R0, this.G0, this.o0, this.T0);
            lo0Var22.Z0 = this.Z0;
            lo0Var22.a1 = this.a1;
            presentFragment(lo0Var22, this.P0);
            return;
        }
        if (i12 == 2) {
            TLRPC.PaymentForm paymentForm = this.z0;
            if (paymentForm.password_missing && (z4 = this.R0)) {
                lo0 lo0Var3 = new lo0(this.Y0, paymentForm, this.K0, this.L0, 6, this.B0, this.D0, this.E0, this.t0, this.u0, this.F0, z4, this.G0, this.o0, this.T0);
                this.c0 = lo0Var3;
                lo0Var3.Z0 = this.Z0;
                lo0Var3.a1 = this.a1;
                lo0Var3.C0(this.X);
                lo0 lo0Var4 = this.c0;
                lo0Var4.Q = new zn0(this);
                presentFragment(lo0Var4, this.P0);
                return;
            }
            jo0 jo0Var2 = this.Q;
            if (jo0Var2 != null) {
                jo0Var2.c(this.t0, this.u0, this.R0, this.G0, null);
                finishFragment();
                return;
            } else {
                lo0 lo0Var5 = new lo0(this.Y0, paymentForm, this.K0, this.L0, 4, this.B0, this.D0, this.E0, this.t0, this.u0, this.F0, this.R0, this.G0, this.o0, this.T0);
                lo0Var5.Z0 = this.Z0;
                lo0Var5.a1 = this.a1;
                presentFragment(lo0Var5, this.P0);
                return;
            }
        }
        if (i12 == 3) {
            lo0 lo0Var6 = new lo0(this.Y0, this.z0, this.K0, this.L0, this.s0 ? 4 : 2, this.B0, this.D0, this.E0, this.t0, this.u0, this.F0, this.R0, this.G0, this.o0, this.T0);
            lo0Var6.Z0 = this.Z0;
            lo0Var6.a1 = this.a1;
            presentFragment(lo0Var6, true);
            return;
        }
        if (i12 != 4) {
            if (i12 != 6) {
                return;
            }
            if (this.Q.c(this.t0, this.u0, this.R0, this.G0, this.v0)) {
                finishFragment();
                return;
            }
            lo0 lo0Var7 = new lo0(this.Y0, this.z0, this.K0, this.L0, 4, this.B0, this.D0, this.E0, this.t0, this.u0, this.F0, this.R0, this.G0, this.o0, false);
            lo0Var7.Z0 = this.Z0;
            lo0Var7.a1 = this.a1;
            presentFragment(lo0Var7, true);
            return;
        }
        if (this.S0) {
            NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.paymentFinished);
        }
        NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.paymentFinished, new Object[0]);
        if (getMessagesController().newMessageCallback != null) {
            AndroidUtilities.runOnUIThread(new kn0(this, 2), 500L);
        } else {
            if (x0(getParentLayout(), getParentActivity()) || isFinishing()) {
                return;
            }
            finishFragment();
        }
    }

    public final void u0(TLRPC.InputInvoice inputInvoice, TLRPC.PaymentForm paymentForm, MessageObject messageObject, String str, int i10, TLRPC.TL_payments_validatedRequestedInfo tL_payments_validatedRequestedInfo, TLRPC.TL_shippingOption tL_shippingOption, Long l10, String str2, String str3, TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo, boolean z4, TLRPC.TL_inputPaymentCredentialsGooglePay tL_inputPaymentCredentialsGooglePay, org.telegram.ui.ActionBar.p2 p2Var, boolean z10) {
        if (p2Var != null) {
            this.currentAccount = p2Var.getCurrentAccount();
        }
        this.r0 = i10;
        this.o0 = p2Var;
        this.t0 = str2;
        this.G0 = tL_inputPaymentCredentialsGooglePay;
        this.B0 = tL_payments_validatedRequestedInfo;
        this.z0 = paymentForm;
        this.D0 = tL_shippingOption;
        this.E0 = l10;
        this.K0 = messageObject;
        this.L0 = str;
        this.Y0 = inputInvoice;
        this.R0 = z4;
        this.T0 = z10;
        this.P0 = ("stripe".equals(paymentForm.native_provider) || "smartglocal".equals(this.z0.native_provider)) ? false : true;
        TLRPC.User user = getMessagesController().getUser(Long.valueOf(paymentForm.bot_id));
        this.i0 = user;
        if (user != null) {
            this.m0 = user.first_name;
        } else {
            this.m0 = "";
        }
        this.n0 = paymentForm.title;
        this.F0 = tL_payments_validateRequestedInfo;
        this.Q0 = true;
        if (z4 || this.r0 == 4) {
            this.R0 = z4;
        } else {
            this.R0 = !this.z0.saved_credentials.isEmpty();
        }
        if (str3 != null) {
            this.u0 = str3;
        } else {
            if (this.z0.saved_credentials.isEmpty()) {
                return;
            }
            TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard = this.z0.saved_credentials.get(0);
            this.v0 = tL_paymentSavedCredentialsCard;
            this.u0 = tL_paymentSavedCredentialsCard.title;
        }
    }

    public final void v0(Context context) {
        Optional empty;
        if (getParentActivity() == null) {
            return;
        }
        c5.c cVar = new c5.c();
        int i10 = this.z0.invoice.test ? 3 : 1;
        if (i10 != 2 && i10 != 1 && i10 != 3) {
            Locale locale = Locale.US;
            throw new IllegalArgumentException(l.d.j(i10, "Invalid environment value "));
        }
        cVar.a = i10;
        this.e = new a8.e(context, j8.p.a, new j8.o(cVar), com.google.android.gms.common.api.i.c);
        try {
            JSONObject put = new JSONObject().put("apiVersion", 2).put("apiVersionMinor", 0);
            put.put("allowedPaymentMethods", new JSONArray().put(p0()));
            empty = Optional.of(put);
        } catch (JSONException unused) {
            empty = Optional.empty();
        }
        if (empty.isPresent()) {
            String jSONObject = ((JSONObject) empty.get()).toString();
            j8.e eVar = new j8.e();
            b6.m.i(jSONObject, "isReadyToPayRequestJson cannot be null!");
            eVar.f = jSONObject;
            a8.e eVar2 = this.e;
            eVar2.getClass();
            com.google.android.gms.common.api.internal.v e6 = com.google.android.gms.common.api.internal.w.e();
            e6.a = 23705;
            e6.c = new o5.i(eVar, 18);
            eVar2.e(0, e6.e()).addOnCompleteListener(getParentActivity(), new ln0(this, 0));
        }
    }

    public final void w0() {
        if (this.b0) {
            return;
        }
        this.b0 = true;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_account.getPassword(), new nn0(this, 1), 10);
    }

    public final boolean x0(org.telegram.ui.ActionBar.f5 f5Var, Activity activity) {
        int i10 = 0;
        if (this.Y0 != null) {
            if (f5Var != null) {
                ArrayList arrayList = new ArrayList(f5Var.getFragmentStack());
                int size = arrayList.size();
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) obj;
                    if (p2Var instanceof lo0) {
                        p2Var.removeSelfFromStack();
                    }
                }
                return true;
            }
            return false;
        }
        String str = this.i0.username;
        if (((str != null && str.equalsIgnoreCase(getMessagesController().premiumBotUsername) && this.L0 == null) || (this.L0 != null && getMessagesController().premiumInvoiceSlug != null && Objects.equals(this.L0, getMessagesController().premiumInvoiceSlug))) && f5Var != null) {
            ArrayList arrayList2 = new ArrayList(f5Var.getFragmentStack());
            int size2 = arrayList2.size();
            int i11 = 0;
            while (i11 < size2) {
                Object obj2 = arrayList2.get(i11);
                i11++;
                org.telegram.ui.ActionBar.p2 p2Var2 = (org.telegram.ui.ActionBar.p2) obj2;
                if ((p2Var2 instanceof xn) || (p2Var2 instanceof PremiumPreviewFragment)) {
                    p2Var2.removeSelfFromStack();
                }
            }
            PremiumPreviewFragment premiumPreviewFragment = new PremiumPreviewFragment(0, null);
            premiumPreviewFragment.m0 = true;
            ((ActionBarLayout) f5Var).Q(premiumPreviewFragment, !isFinishing());
            if (activity instanceof LaunchActivity) {
                try {
                    this.fragmentView.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                ((LaunchActivity) activity).u0.c(false);
            }
            return true;
        }
        return false;
    }

    public final void y0(org.telegram.ui.ActionBar.p2 p2Var) {
        AndroidUtilities.hideKeyboard(this.fragmentView);
        if (p2Var instanceof lo0) {
            lo0 lo0Var = (lo0) p2Var;
            lo0Var.W0 = this.W0;
            lo0Var.V0 = this.V0;
            lo0Var.U0 = this.U0;
            lo0Var.v0 = this.v0;
        }
    }

    public final void z0() {
        String str;
        if (this.N0) {
            return;
        }
        H0(false, true);
        TLRPC.TL_payments_sendPaymentForm tL_payments_sendPaymentForm = new TLRPC.TL_payments_sendPaymentForm();
        TLRPC.InputInvoice inputInvoice = this.Y0;
        if (inputInvoice != null) {
            tL_payments_sendPaymentForm.invoice = inputInvoice;
        } else if (this.K0 != null) {
            TLRPC.TL_inputInvoiceMessage tL_inputInvoiceMessage = new TLRPC.TL_inputInvoiceMessage();
            tL_inputInvoiceMessage.peer = getMessagesController().getInputPeer(this.K0.messageOwner.peer_id);
            tL_inputInvoiceMessage.msg_id = this.K0.getId();
            tL_payments_sendPaymentForm.invoice = tL_inputInvoiceMessage;
        } else {
            TLRPC.TL_inputInvoiceSlug tL_inputInvoiceSlug = new TLRPC.TL_inputInvoiceSlug();
            tL_inputInvoiceSlug.slug = this.L0;
            tL_payments_sendPaymentForm.invoice = tL_inputInvoiceSlug;
        }
        tL_payments_sendPaymentForm.form_id = this.z0.form_id;
        if (UserConfig.getInstance(this.currentAccount).tmpPassword == null || this.v0 == null) {
            TLRPC.TL_inputPaymentCredentialsGooglePay tL_inputPaymentCredentialsGooglePay = this.G0;
            if (tL_inputPaymentCredentialsGooglePay != null) {
                tL_payments_sendPaymentForm.credentials = tL_inputPaymentCredentialsGooglePay;
            } else {
                TLRPC.TL_inputPaymentCredentials tL_inputPaymentCredentials = new TLRPC.TL_inputPaymentCredentials();
                tL_payments_sendPaymentForm.credentials = tL_inputPaymentCredentials;
                tL_inputPaymentCredentials.save = this.R0;
                tL_inputPaymentCredentials.data = new TLRPC.TL_dataJSON();
                tL_payments_sendPaymentForm.credentials.data.data = this.t0;
            }
        } else {
            TLRPC.TL_inputPaymentCredentialsSaved tL_inputPaymentCredentialsSaved = new TLRPC.TL_inputPaymentCredentialsSaved();
            tL_payments_sendPaymentForm.credentials = tL_inputPaymentCredentialsSaved;
            tL_inputPaymentCredentialsSaved.id = this.v0.id;
            tL_inputPaymentCredentialsSaved.tmp_password = UserConfig.getInstance(this.currentAccount).tmpPassword.tmp_password;
        }
        TLRPC.TL_payments_validatedRequestedInfo tL_payments_validatedRequestedInfo = this.B0;
        if (tL_payments_validatedRequestedInfo != null && (str = tL_payments_validatedRequestedInfo.id) != null) {
            tL_payments_sendPaymentForm.requested_info_id = str;
            tL_payments_sendPaymentForm.flags = 1 | tL_payments_sendPaymentForm.flags;
        }
        TLRPC.TL_shippingOption tL_shippingOption = this.D0;
        if (tL_shippingOption != null) {
            tL_payments_sendPaymentForm.shipping_option_id = tL_shippingOption.id;
            tL_payments_sendPaymentForm.flags |= 2;
        }
        if ((this.z0.invoice.flags & 256) != 0) {
            Long l10 = this.E0;
            tL_payments_sendPaymentForm.tip_amount = l10 != null ? l10.longValue() : 0L;
            tL_payments_sendPaymentForm.flags |= 4;
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_payments_sendPaymentForm, new tb0(10, this, tL_payments_sendPaymentForm), (this.T0 ? 8 : 0) | 2);
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean presentFragment(org.telegram.ui.ActionBar.p2 p2Var, boolean z4) {
        y0(p2Var);
        return super.presentFragment(p2Var, z4);
    }

    public lo0(TLRPC.PaymentForm paymentForm, MessageObject messageObject, String str, org.telegram.ui.ActionBar.p2 p2Var) {
        super(null);
        this.a = new ArrayList();
        this.b = new HashMap();
        this.c = new HashMap();
        this.d = new HashMap();
        this.D = true;
        this.F = new org.telegram.ui.Cells.m4[3];
        this.G = new ArrayList();
        this.H = new org.telegram.ui.Cells.z6[3];
        this.J = new org.telegram.ui.Cells.a9[3];
        this.K = new org.telegram.ui.Cells.aa[2];
        this.V = new org.telegram.ui.Cells.z8[7];
        this.W = -4.5f;
        this.Z = 6;
        this.S0 = true;
        u0(null, paymentForm, messageObject, str, 4, null, null, null, null, null, null, false, null, p2Var, false);
    }

    public lo0(TLRPC.PaymentReceipt paymentReceipt) {
        super(null);
        this.a = new ArrayList();
        this.b = new HashMap();
        this.c = new HashMap();
        this.d = new HashMap();
        this.D = true;
        this.F = new org.telegram.ui.Cells.m4[3];
        this.G = new ArrayList();
        this.H = new org.telegram.ui.Cells.z6[3];
        this.J = new org.telegram.ui.Cells.a9[3];
        this.K = new org.telegram.ui.Cells.aa[2];
        this.V = new org.telegram.ui.Cells.z8[7];
        this.W = -4.5f;
        this.Z = 6;
        this.r0 = 5;
        TLRPC.PaymentForm paymentForm = new TLRPC.PaymentForm();
        this.z0 = paymentForm;
        this.A0 = paymentReceipt;
        paymentForm.bot_id = paymentReceipt.bot_id;
        paymentForm.invoice = paymentReceipt.invoice;
        paymentForm.provider_id = paymentReceipt.provider_id;
        paymentForm.users = paymentReceipt.users;
        this.D0 = paymentReceipt.shipping;
        long j10 = paymentReceipt.tip_amount;
        if (j10 != 0) {
            this.E0 = Long.valueOf(j10);
        }
        TLRPC.User user = getMessagesController().getUser(Long.valueOf(paymentReceipt.bot_id));
        this.i0 = user;
        if (user != null) {
            this.m0 = user.first_name;
        } else {
            this.m0 = "";
        }
        this.n0 = paymentReceipt.title;
        if (paymentReceipt.info != null) {
            this.F0 = new TLRPC.TL_payments_validateRequestedInfo();
            if (this.K0 != null) {
                TLRPC.TL_inputInvoiceMessage tL_inputInvoiceMessage = new TLRPC.TL_inputInvoiceMessage();
                tL_inputInvoiceMessage.peer = getMessagesController().getInputPeer(paymentReceipt.bot_id);
                this.F0.invoice = tL_inputInvoiceMessage;
            } else {
                TLRPC.TL_inputInvoiceSlug tL_inputInvoiceSlug = new TLRPC.TL_inputInvoiceSlug();
                tL_inputInvoiceSlug.slug = this.L0;
                this.F0.invoice = tL_inputInvoiceSlug;
            }
            this.F0.info = paymentReceipt.info;
        }
        this.u0 = paymentReceipt.credentials_title;
    }

    public lo0(TLRPC.PaymentForm paymentForm, TLRPC.InputInvoice inputInvoice, org.telegram.ui.ActionBar.p2 p2Var) {
        this(inputInvoice, paymentForm, null, null, 4, null, null, null, null, null, null, false, null, p2Var, false);
        this.S0 = true;
    }
}
