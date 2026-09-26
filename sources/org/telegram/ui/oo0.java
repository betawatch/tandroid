package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Typeface;
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

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class oo0 extends org.telegram.ui.ActionBar.m2 implements NotificationCenter.NotificationCenterDelegate {
    public static final List g1 = Arrays.asList("http", "https");
    public static final List h1 = Collections.singletonList("tg");
    public qt A0;
    public String B0;
    public TLRPC.PaymentForm C0;
    public final TLRPC.PaymentReceipt D0;
    public ScrollView E;
    public TLRPC.TL_payments_validatedRequestedInfo E0;
    public boolean F;
    public TLRPC.TL_paymentFormMethod F0;
    public boolean G;
    public TLRPC.TL_shippingOption G0;
    public TextView H;
    public Long H0;
    public final org.telegram.ui.Cells.m4[] I;
    public TLRPC.TL_payments_validateRequestedInfo I0;
    public final ArrayList J;
    public TLRPC.TL_inputPaymentCredentialsGooglePay J0;
    public final org.telegram.ui.Cells.b7[] K;
    public String K0;
    public org.telegram.ui.Cells.w8 L;
    public String L0;
    public final org.telegram.ui.Cells.e9[] M;
    public JSONObject M0;
    public final org.telegram.ui.Cells.ea[] N;
    public MessageObject N0;
    public FrameLayout O;
    public String O0;
    public FrameLayout P;
    public boolean P0;
    public LinearLayout Q;
    public boolean Q0;
    public org.telegram.ui.Cells.f9 R;
    public String[] R0;
    public org.telegram.ui.Cells.k3 S;
    public boolean S0;
    public mo0 T;
    public boolean T0;
    public TextView U;
    public boolean U0;
    public org.telegram.ui.Cells.p6 V;
    public boolean V0;
    public ko0 W;
    public boolean W0;
    public org.telegram.ui.Cells.l5 X;
    public boolean X0;
    public final org.telegram.ui.Cells.d9[] Y;
    public org.telegram.ui.ActionBar.d6 Y0;
    public float Z;
    public no0 Z0;
    public final ArrayList a;
    public TL_account.Password a0;
    public boolean a1;
    public final HashMap b;
    public boolean b0;
    public TLRPC.InputInvoice b1;
    public final HashMap c;
    public int c0;
    public Utilities.Callback c1;
    public final HashMap d;
    public ln0 d0;
    public Utilities.Callback d1;
    public com.google.android.gms.internal.clearcut.v0 e;
    public boolean e0;
    public h20 e1;
    public EditTextBoldCursor[] f;
    public oo0 f0;
    public int f1;
    public boolean g0;
    public org.telegram.ui.Cells.k6[] h;
    public boolean h0;
    public boolean i0;
    public String j0;
    public boolean k0;
    public TLRPC.User l0;
    public boolean m0;
    public org.telegram.ui.ActionBar.u0 n;
    public boolean n0;
    public boolean o0;
    public String p0;
    public String q0;
    public org.telegram.ui.Components.uq r;
    public org.telegram.ui.ActionBar.m2 r0;
    public org.telegram.ui.Components.uq s;
    public rn0 s0;
    public ArrayList t0;
    public int u0;
    public AnimatorSet v;
    public boolean v0;
    public WebView w;
    public String w0;
    public String x;
    public String x0;
    public boolean y;
    public TLRPC.TL_paymentSavedCredentialsCard y0;
    public boolean z0;

    public oo0(TLRPC.InputInvoice inputInvoice, TLRPC.PaymentForm paymentForm, MessageObject messageObject, String str, int i10, TLRPC.TL_payments_validatedRequestedInfo tL_payments_validatedRequestedInfo, TLRPC.TL_shippingOption tL_shippingOption, Long l4, String str2, String str3, TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo, boolean z10, TLRPC.TL_inputPaymentCredentialsGooglePay tL_inputPaymentCredentialsGooglePay, org.telegram.ui.ActionBar.m2 m2Var, boolean z11) {
        super(null);
        this.a = new ArrayList();
        this.b = new HashMap();
        this.c = new HashMap();
        this.d = new HashMap();
        this.G = true;
        this.I = new org.telegram.ui.Cells.m4[3];
        this.J = new ArrayList();
        this.K = new org.telegram.ui.Cells.b7[3];
        this.M = new org.telegram.ui.Cells.e9[3];
        this.N = new org.telegram.ui.Cells.ea[2];
        this.Y = new org.telegram.ui.Cells.d9[7];
        this.Z = -4.5f;
        this.c0 = 6;
        u0(inputInvoice, paymentForm, messageObject, str, i10, tL_payments_validatedRequestedInfo, tL_shippingOption, l4, str2, str3, tL_payments_validateRequestedInfo, z10, tL_inputPaymentCredentialsGooglePay, m2Var, z11);
    }

    public static /* synthetic */ void U(oo0 oo0Var, TL_account.Password password, byte[] bArr) {
        TLRPC.PasswordKdfAlgo passwordKdfAlgo = password.current_algo;
        byte[] x10 = passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow ? SRPHelper.getX(bArr, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo) : null;
        TL_account.getTmpPassword gettmppassword = new TL_account.getTmpPassword();
        gettmppassword.period = 1800;
        vb0 vb0Var = new vb0(11, oo0Var, gettmppassword);
        TLRPC.PasswordKdfAlgo passwordKdfAlgo2 = password.current_algo;
        if (!(passwordKdfAlgo2 instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow)) {
            TLRPC.TL_error tL_error = new TLRPC.TL_error();
            tL_error.text = "PASSWORD_HASH_INVALID";
            vb0Var.run(null, tL_error);
            return;
        }
        TLRPC.TL_inputCheckPasswordSRP startCheck = SRPHelper.startCheck(x10, password.srp_id, password.srp_B, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo2);
        gettmppassword.password = startCheck;
        if (startCheck != null) {
            ConnectionsManager.getInstance(oo0Var.currentAccount).sendRequest(gettmppassword, vb0Var, 10);
            return;
        }
        TLRPC.TL_error tL_error2 = new TLRPC.TL_error();
        tL_error2.text = "ALGO_INVALID";
        vb0Var.run(null, tL_error2);
    }

    public static /* synthetic */ void V(oo0 oo0Var, TLRPC.TL_error tL_error, TLObject tLObject) {
        oo0Var.D0(false);
        oo0Var.H0(true, false);
        if (tL_error != null) {
            String str = tL_error.text;
            str.getClass();
            switch (str) {
                case "ADDRESS_CITY_INVALID":
                    oo0Var.E0(2);
                    break;
                case "ADDRESS_STREET_LINE1_INVALID":
                    oo0Var.E0(0);
                    break;
                case "ADDRESS_COUNTRY_INVALID":
                    oo0Var.E0(4);
                    break;
                case "REQ_INFO_NAME_INVALID":
                    oo0Var.E0(6);
                    break;
                case "ADDRESS_POSTCODE_INVALID":
                    oo0Var.E0(5);
                    break;
                case "ADDRESS_STATE_INVALID":
                    oo0Var.E0(3);
                    break;
                case "REQ_INFO_PHONE_INVALID":
                    oo0Var.E0(9);
                    break;
                case "ADDRESS_STREET_LINE2_INVALID":
                    oo0Var.E0(1);
                    break;
                case "REQ_INFO_EMAIL_INVALID":
                    oo0Var.E0(7);
                    break;
                default:
                    org.telegram.ui.Components.e5.f0(oo0Var.currentAccount, tL_error, oo0Var, tLObject, new Object[0]);
                    break;
            }
        }
    }

    public static /* synthetic */ void W(oo0 oo0Var, TLRPC.TL_payments_validatedRequestedInfo tL_payments_validatedRequestedInfo) {
        oo0Var.E0 = tL_payments_validatedRequestedInfo;
        if (oo0Var.C0.saved_info != null && !oo0Var.T0) {
            TLRPC.TL_payments_clearSavedInfo tL_payments_clearSavedInfo = new TLRPC.TL_payments_clearSavedInfo();
            tL_payments_clearSavedInfo.info = true;
            ConnectionsManager.getInstance(oo0Var.currentAccount).sendRequest(tL_payments_clearSavedInfo, new ai.u7(20), oo0Var.W0 ? 8 : 0);
        }
        oo0Var.t0();
        oo0Var.D0(false);
        oo0Var.H0(true, false);
    }

    public static /* synthetic */ void X(oo0 oo0Var, TLRPC.TL_error tL_error, TLObject tLObject) {
        oo0Var.D0(false);
        oo0Var.H0(true, false);
        if (tL_error != null) {
            org.telegram.ui.Components.e5.f0(oo0Var.currentAccount, tL_error, oo0Var, tLObject, new Object[0]);
        }
    }

    public static /* synthetic */ void Y(oo0 oo0Var, org.telegram.ui.Components.qc qcVar, boolean z10, TLRPC.Message message) {
        qcVar.b();
        if (!z10) {
            TLRPC.TL_payments_getPaymentReceipt tL_payments_getPaymentReceipt = new TLRPC.TL_payments_getPaymentReceipt();
            tL_payments_getPaymentReceipt.msg_id = message.id;
            tL_payments_getPaymentReceipt.peer = MessagesController.getInstance(oo0Var.currentAccount).getInputPeer(message.peer_id);
            ConnectionsManager.getInstance(oo0Var.currentAccount).sendRequest(tL_payments_getPaymentReceipt, new on0(oo0Var, 3), 2);
            return;
        }
        org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
        if (U != null) {
            U.presentFragment(wn.Q9(message.id, MessageObject.getDialogId(message)));
        }
    }

    public static void Z(oo0 oo0Var) {
        ConnectionsManager.getInstance(oo0Var.currentAccount).sendRequest(new TL_account.resendPasswordEmail(), new ai.u7(20), oo0Var.W0 ? 8 : 0);
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(oo0Var.getParentActivity());
        alertDialog$Builder.a.T = LocaleController.getString(R.string.ResendCodeInfo);
        alertDialog$Builder.a.R = LocaleController.getString(R.string.AppName);
        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
        oo0Var.showDialog(alertDialog$Builder.a);
    }

    public static /* synthetic */ void a0(oo0 oo0Var, boolean z10, String str, String str2, TL_account.updatePasswordSettings updatepasswordsettings) {
        ci.v1 v1Var = new ci.v1(oo0Var, z10, str, 7);
        if (z10) {
            ConnectionsManager.getInstance(oo0Var.currentAccount).sendRequest(updatepasswordsettings, v1Var, 10);
            return;
        }
        byte[] stringBytes = AndroidUtilities.getStringBytes(str2);
        TLRPC.PasswordKdfAlgo passwordKdfAlgo = oo0Var.a0.new_algo;
        if (!(passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow)) {
            TLRPC.TL_error tL_error = new TLRPC.TL_error();
            tL_error.text = "PASSWORD_HASH_INVALID";
            v1Var.run(null, tL_error);
            return;
        }
        updatepasswordsettings.new_settings.new_password_hash = SRPHelper.getVBytes(stringBytes, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
        if (updatepasswordsettings.new_settings.new_password_hash == null) {
            TLRPC.TL_error tL_error2 = new TLRPC.TL_error();
            tL_error2.text = "ALGO_INVALID";
            v1Var.run(null, tL_error2);
        }
        ConnectionsManager.getInstance(oo0Var.currentAccount).sendRequest(updatepasswordsettings, v1Var, 10);
    }

    public static /* synthetic */ void b0(oo0 oo0Var, TLRPC.TL_error tL_error, TLRPC.TL_payments_sendPaymentForm tL_payments_sendPaymentForm) {
        org.telegram.ui.Components.e5.f0(oo0Var.currentAccount, tL_error, oo0Var, tL_payments_sendPaymentForm, new Object[0]);
        oo0Var.D0(false);
        oo0Var.H0(false, false);
        oo0Var.a1 = true;
        oo0Var.f1 = 4;
        no0 no0Var = oo0Var.Z0;
        if (no0Var != null) {
            no0Var.a(4);
        }
    }

    public static void c0(oo0 oo0Var, TLObject tLObject) {
        org.telegram.ui.ActionBar.m2 R;
        if (tLObject instanceof TLRPC.TL_payments_paymentReceiptStars) {
            yh.w7.j1(oo0Var.getParentActivity(), oo0Var.currentAccount, (TLRPC.TL_payments_paymentReceiptStars) tLObject, oo0Var.Y0);
            return;
        }
        if (!(tLObject instanceof TLRPC.PaymentReceipt) || (R = LaunchActivity.R()) == null) {
            return;
        }
        org.telegram.ui.ActionBar.k2 k2Var = new org.telegram.ui.ActionBar.k2();
        k2Var.a = true;
        oo0 oo0Var2 = new oo0((TLRPC.PaymentReceipt) tLObject);
        oo0Var2.c1 = oo0Var.c1;
        oo0Var2.d1 = oo0Var.d1;
        R.showAsSheet(oo0Var2, k2Var);
    }

    public static /* synthetic */ void d0(oo0 oo0Var, TLObject tLObject, TLRPC.TL_error tL_error, TL_account.getTmpPassword gettmppassword) {
        oo0Var.H0(true, false);
        oo0Var.D0(false);
        if (tLObject != null) {
            oo0Var.v0 = true;
            UserConfig.getInstance(oo0Var.currentAccount).tmpPassword = (TL_account.tmpPassword) tLObject;
            UserConfig.getInstance(oo0Var.currentAccount).saveConfig(false);
            oo0Var.t0();
            return;
        }
        if (!tL_error.text.equals("PASSWORD_HASH_INVALID")) {
            org.telegram.ui.Components.e5.f0(oo0Var.currentAccount, tL_error, oo0Var, gettmppassword, new Object[0]);
            return;
        }
        try {
            oo0Var.f[1].performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        AndroidUtilities.shakeViewSpring(oo0Var.f[1], 3.25f);
        oo0Var.f[1].setText("");
    }

    public static void e0(oo0 oo0Var, TLObject tLObject) {
        org.telegram.ui.ActionBar.m2 R;
        if (tLObject instanceof TLRPC.TL_payments_paymentReceiptStars) {
            yh.w7.j1(oo0Var.getParentActivity(), oo0Var.currentAccount, (TLRPC.TL_payments_paymentReceiptStars) tLObject, oo0Var.Y0);
            return;
        }
        if (!(tLObject instanceof TLRPC.PaymentReceipt) || (R = LaunchActivity.R()) == null) {
            return;
        }
        org.telegram.ui.ActionBar.k2 k2Var = new org.telegram.ui.ActionBar.k2();
        k2Var.a = true;
        oo0 oo0Var2 = new oo0((TLRPC.PaymentReceipt) tLObject);
        oo0Var2.c1 = oo0Var.c1;
        oo0Var2.d1 = oo0Var.d1;
        R.showAsSheet(oo0Var2, k2Var);
    }

    public static /* synthetic */ void f0(oo0 oo0Var, TLRPC.TL_error tL_error, TLObject tLObject, String str, TL_account.getPassword getpassword) {
        if (tL_error != null) {
            org.telegram.ui.Components.e5.f0(oo0Var.currentAccount, tL_error, oo0Var, getpassword, new Object[0]);
            oo0Var.H0(true, false);
            oo0Var.D0(false);
            return;
        }
        TL_account.Password password = (TL_account.Password) tLObject;
        if (!TwoStepVerificationActivity.i0(password, false)) {
            org.telegram.ui.Components.e5.x0(oo0Var.getParentActivity(), LocaleController.getString(R.string.UpdateAppAlert), true);
        } else if (password.has_password) {
            Utilities.globalQueue.postRunnable(new jf0(oo0Var, password, AndroidUtilities.getStringBytes(str), 14));
        } else {
            oo0Var.v0 = false;
            oo0Var.t0();
        }
    }

    public static /* synthetic */ void g0(oo0 oo0Var, org.telegram.ui.Components.qc qcVar, boolean z10, TLRPC.Message[] messageArr) {
        qcVar.b();
        if (!z10) {
            TLRPC.TL_payments_getPaymentReceipt tL_payments_getPaymentReceipt = new TLRPC.TL_payments_getPaymentReceipt();
            tL_payments_getPaymentReceipt.msg_id = messageArr[0].id;
            tL_payments_getPaymentReceipt.peer = MessagesController.getInstance(oo0Var.currentAccount).getInputPeer(messageArr[0].peer_id);
            ConnectionsManager.getInstance(oo0Var.currentAccount).sendRequest(tL_payments_getPaymentReceipt, new on0(oo0Var, 2), 2);
            return;
        }
        org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
        if (U != null) {
            U.presentFragment(wn.Q9(messageArr[0].id, MessageObject.getDialogId(messageArr[0])));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x00cb, code lost:
    
        if (r7.phone_requested == false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x00d7, code lost:
    
        if (r23.J0 == null) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x00e1, code lost:
    
        if (r2.invoice.flexible != false) goto L51;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void h0(oo0 oo0Var, String str, View view) {
        int i10;
        org.telegram.ui.Cells.p6 p6Var = oo0Var.V;
        if (p6Var != null && !oo0Var.F) {
            oo0Var.Z = -oo0Var.Z;
            AndroidUtilities.shakeViewSpring(p6Var.getTextView(), oo0Var.Z);
            AndroidUtilities.shakeViewSpring(oo0Var.V.getCheckBox(), oo0Var.Z);
            try {
                oo0Var.V.performHapticFeedback(3, 2);
                return;
            } catch (Exception unused) {
                return;
            }
        }
        boolean z10 = oo0Var.V0;
        int i11 = 1;
        if (z10 && oo0Var.C0.saved_info != null && oo0Var.I0 == null) {
            oo0Var.D0(true);
            sj0 sj0Var = new sj0(11, oo0Var, view);
            if (oo0Var.Q0) {
                return;
            }
            oo0Var.H0(true, true);
            TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo = new TLRPC.TL_payments_validateRequestedInfo();
            oo0Var.I0 = tL_payments_validateRequestedInfo;
            TLRPC.InputInvoice inputInvoice = oo0Var.b1;
            if (inputInvoice != null) {
                tL_payments_validateRequestedInfo.invoice = inputInvoice;
            } else if (oo0Var.N0 != null) {
                TLRPC.TL_inputInvoiceMessage tL_inputInvoiceMessage = new TLRPC.TL_inputInvoiceMessage();
                tL_inputInvoiceMessage.peer = oo0Var.getMessagesController().getInputPeer(oo0Var.N0.messageOwner.peer_id);
                tL_inputInvoiceMessage.msg_id = oo0Var.N0.getId();
                oo0Var.I0.invoice = tL_inputInvoiceMessage;
            } else {
                TLRPC.TL_inputInvoiceSlug tL_inputInvoiceSlug = new TLRPC.TL_inputInvoiceSlug();
                tL_inputInvoiceSlug.slug = oo0Var.O0;
                oo0Var.I0.invoice = tL_inputInvoiceSlug;
            }
            TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo2 = oo0Var.I0;
            tL_payments_validateRequestedInfo2.save = true;
            tL_payments_validateRequestedInfo2.info = oo0Var.C0.saved_info;
            ConnectionsManager.getInstance(oo0Var.currentAccount).sendRequest(tL_payments_validateRequestedInfo2, new aa(oo0Var, sj0Var, tL_payments_validateRequestedInfo2, 29), (oo0Var.W0 ? 8 : 0) | 2);
            return;
        }
        if (z10) {
            TLRPC.PaymentForm paymentForm = oo0Var.C0;
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
                            oo0Var.G0(new org.telegram.ui.Components.ou(0, view));
                            return;
                        } else {
                            oo0 oo0Var2 = new oo0(oo0Var.b1, oo0Var.C0, oo0Var.N0, oo0Var.O0, i10, oo0Var.E0, oo0Var.G0, oo0Var.H0, oo0Var.w0, oo0Var.x0, oo0Var.I0, oo0Var.U0, null, oo0Var.r0, oo0Var.W0);
                            oo0Var2.c1 = oo0Var.c1;
                            oo0Var2.d1 = oo0Var.d1;
                            oo0Var.presentFragment(oo0Var2);
                            return;
                        }
                    }
                }
                i10 = (oo0Var.y0 == null && oo0Var.w0 == null && oo0Var.J0 == null) ? 2 : 1;
                if (i10 != 2) {
                }
                oo0 oo0Var22 = new oo0(oo0Var.b1, oo0Var.C0, oo0Var.N0, oo0Var.O0, i10, oo0Var.E0, oo0Var.G0, oo0Var.H0, oo0Var.w0, oo0Var.x0, oo0Var.I0, oo0Var.U0, null, oo0Var.r0, oo0Var.W0);
                oo0Var22.c1 = oo0Var.c1;
                oo0Var22.d1 = oo0Var.d1;
                oo0Var.presentFragment(oo0Var22);
                return;
            }
            if (oo0Var.y0 == null) {
                if (oo0Var.w0 == null) {
                }
            }
            if (oo0Var.G0 == null) {
            }
        }
        if (!oo0Var.C0.password_missing && oo0Var.y0 != null) {
            if (UserConfig.getInstance(oo0Var.currentAccount).tmpPassword != null && UserConfig.getInstance(oo0Var.currentAccount).tmpPassword.valid_until < ConnectionsManager.getInstance(oo0Var.currentAccount).getCurrentTime() + 60) {
                UserConfig.getInstance(oo0Var.currentAccount).tmpPassword = null;
                UserConfig.getInstance(oo0Var.currentAccount).saveConfig(false);
            }
            if (UserConfig.getInstance(oo0Var.currentAccount).tmpPassword == null) {
                oo0Var.X0 = true;
                oo0 oo0Var3 = new oo0(oo0Var.b1, oo0Var.C0, oo0Var.N0, oo0Var.O0, 3, oo0Var.E0, oo0Var.G0, oo0Var.H0, null, oo0Var.x0, oo0Var.I0, oo0Var.U0, null, oo0Var.r0, oo0Var.W0);
                oo0Var3.c1 = oo0Var.c1;
                oo0Var3.d1 = oo0Var.d1;
                oo0Var.presentFragment(oo0Var3);
                oo0Var.X0 = false;
                return;
            }
            if (oo0Var.V0) {
                oo0Var.V0 = false;
                NotificationCenter.getInstance(oo0Var.currentAccount).removeObserver(oo0Var, NotificationCenter.paymentFinished);
            }
        }
        TLRPC.User user = oo0Var.l0;
        if (user == null || user.verified) {
            oo0Var.I0(oo0Var.R0[0]);
            return;
        }
        String str2 = "payment_warning_" + oo0Var.l0.id;
        SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(oo0Var.currentAccount);
        if (notificationsSettings.getBoolean(str2, false)) {
            oo0Var.I0(oo0Var.R0[0]);
            return;
        }
        notificationsSettings.edit().putBoolean(str2, true).commit();
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(oo0Var.getParentActivity());
        String string = LocaleController.getString(R.string.PaymentWarning);
        org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.a;
        a2Var.R = string;
        a2Var.T = LocaleController.formatString("PaymentWarningText", R.string.PaymentWarningText, oo0Var.p0, str);
        alertDialog$Builder.k(LocaleController.getString(R.string.Continue), new mn0(oo0Var, i11));
        oo0Var.showDialog(a2Var);
    }

    public static void i0(oo0 oo0Var, TLRPC.TL_error tL_error, boolean z10, TLObject tLObject, String str) {
        if (tL_error != null && "SRP_ID_INVALID".equals(tL_error.text)) {
            ConnectionsManager.getInstance(oo0Var.currentAccount).sendRequest(new TL_account.getPassword(), new ci.t3(10, oo0Var, z10), 8);
            return;
        }
        oo0Var.H0(true, false);
        if (z10) {
            TL_account.Password password = oo0Var.a0;
            password.has_password = false;
            password.current_algo = null;
            oo0Var.T.a(password);
            oo0Var.finishFragment();
            return;
        }
        if (tL_error == null && (tLObject instanceof TLRPC.TL_boolTrue)) {
            if (oo0Var.getParentActivity() == null) {
                return;
            }
            oo0Var.t0();
            return;
        }
        if (tL_error != null) {
            if (!tL_error.text.equals("EMAIL_UNCONFIRMED") && !tL_error.text.startsWith("EMAIL_UNCONFIRMED_")) {
                if (tL_error.text.equals("EMAIL_INVALID")) {
                    oo0Var.F0(LocaleController.getString(R.string.AppName), LocaleController.getString(R.string.PasswordEmailInvalid));
                    return;
                } else if (!tL_error.text.startsWith("FLOOD_WAIT")) {
                    oo0Var.F0(LocaleController.getString(R.string.AppName), tL_error.text);
                    return;
                } else {
                    int intValue = Utilities.parseInt((CharSequence) tL_error.text).intValue();
                    oo0Var.F0(LocaleController.getString(R.string.AppName), LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, intValue < 60 ? LocaleController.formatPluralString("Seconds", intValue, new Object[0]) : LocaleController.formatPluralString("Minutes", intValue / 60, new Object[0])));
                    return;
                }
            }
            oo0Var.c0 = Utilities.parseInt((CharSequence) tL_error.text).intValue();
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(oo0Var.getParentActivity());
            alertDialog$Builder.k(LocaleController.getString(R.string.OK), new ow(26, oo0Var, str));
            String string = LocaleController.getString(R.string.YourEmailAlmostThereText);
            org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.a;
            a2Var.T = string;
            a2Var.R = LocaleController.getString(R.string.YourEmailAlmostThere);
            Dialog showDialog = oo0Var.showDialog(a2Var);
            if (showDialog != null) {
                showDialog.setCanceledOnTouchOutside(false);
                showDialog.setCancelable(false);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:79:0x0207, code lost:
    
        if (r5 == false) goto L94;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0275  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void j0(oo0 oo0Var) {
        Integer num;
        Integer num2;
        boolean z10;
        boolean z11;
        Integer num3;
        boolean z12;
        boolean z13;
        String[] split = oo0Var.f[1].getText().toString().split("/");
        if (split.length == 2) {
            Integer parseInt = Utilities.parseInt((CharSequence) split[0]);
            num2 = Utilities.parseInt((CharSequence) split[1]);
            num = parseInt;
        } else {
            num = null;
            num2 = null;
        }
        uc.a aVar = new uc.a(oo0Var.f[0].getText().toString(), num, num2, oo0Var.f[3].getText().toString(), oo0Var.f[2].getText().toString(), null, null, null, null, oo0Var.f[5].getText().toString(), oo0Var.f[4].getText().toString(), null, null, null, null, null, null);
        oo0Var.x0 = aVar.a() + " *" + aVar.b();
        boolean z14 = num != null && num2 != null && UserConfig.getInstance(oo0Var.currentAccount).getClientPhone().startsWith("7") && "smartglocal".equals(oo0Var.C0.native_provider) && (num2.intValue() > 22 || (num2.intValue() == 22 && num.intValue() > 1));
        String str = aVar.a;
        if (!w7.t8.d(str)) {
            String replaceAll = str.trim().replaceAll("\\s+|-", "");
            if (!w7.t8.d(replaceAll) && replaceAll != null) {
                int i10 = 0;
                while (true) {
                    if (i10 >= replaceAll.length()) {
                        int length = replaceAll.length() - 1;
                        int i11 = 0;
                        boolean z15 = true;
                        while (true) {
                            if (length >= 0) {
                                char charAt = replaceAll.charAt(length);
                                if (!Character.isDigit(charAt)) {
                                    break;
                                }
                                int parseInt2 = Integer.parseInt("" + charAt);
                                boolean z16 = z15 ^ true;
                                if (!z15) {
                                    parseInt2 *= 2;
                                }
                                if (parseInt2 > 9) {
                                    parseInt2 -= 9;
                                }
                                i11 += parseInt2;
                                length--;
                                z15 = z16;
                            } else if (i11 % 10 == 0) {
                                String a2 = aVar.a();
                                if (!"American Express".equals(a2) ? !(!"Diners Club".equals(a2) ? replaceAll.length() != 16 : replaceAll.length() != 14) : replaceAll.length() == 15) {
                                    if (!z14) {
                                        Integer num4 = aVar.c;
                                        if (num4 != null && num4.intValue() >= 1 && num4.intValue() <= 12 && (num3 = aVar.d) != null && w7.q8.a(num3.intValue()) >= ob.a.D2().get(1)) {
                                            if (num4 == null || num4.intValue() < 1 || num4.intValue() > 12 || num3 == null || w7.q8.a(num3.intValue()) < ob.a.D2().get(1)) {
                                                z12 = false;
                                            } else {
                                                int intValue = num3.intValue();
                                                int intValue2 = num4.intValue();
                                                if (w7.q8.a(intValue) >= ob.a.D2().get(1)) {
                                                    Calendar D2 = ob.a.D2();
                                                    if (w7.q8.a(intValue) != D2.get(1) || intValue2 >= D2.get(2) + 1) {
                                                        z13 = false;
                                                        z12 = !z13;
                                                    }
                                                }
                                                z13 = true;
                                                z12 = !z13;
                                            }
                                        }
                                        oo0Var.E0(1);
                                        return;
                                    }
                                    if (oo0Var.i0 && oo0Var.f[2].length() == 0) {
                                        oo0Var.E0(2);
                                        return;
                                    }
                                    String str2 = aVar.b;
                                    if (!w7.t8.d(str2)) {
                                        String trim = str2.trim();
                                        String a10 = aVar.a();
                                        boolean z17 = (a10 == null && trim.length() >= 3 && trim.length() <= 4) || ("American Express".equals(a10) && trim.length() == 4) || trim.length() == 3;
                                        if (trim != null) {
                                            for (int i12 = 0; i12 < trim.length(); i12++) {
                                                if (Character.isDigit(trim.charAt(i12))) {
                                                }
                                            }
                                            z10 = true;
                                            if (z10 && z17) {
                                                z11 = true;
                                                if (!z11) {
                                                    oo0Var.E0(3);
                                                    return;
                                                }
                                                if (oo0Var.g0 && oo0Var.f[4].length() == 0) {
                                                    oo0Var.E0(4);
                                                    return;
                                                }
                                                if (oo0Var.h0 && oo0Var.f[5].length() == 0) {
                                                    oo0Var.E0(5);
                                                    return;
                                                }
                                                oo0Var.H0(true, true);
                                                try {
                                                    if ("stripe".equals(oo0Var.C0.native_provider)) {
                                                        String str3 = oo0Var.j0;
                                                        k2.u uVar = new k2.u(new ob.a(22), 26);
                                                        ob.a.E2(str3);
                                                        do0 do0Var = new do0(oo0Var);
                                                        try {
                                                            ob.a.E2(str3);
                                                            new sc.a(uVar, str3, aVar, do0Var).execute(new Void[0]);
                                                        } catch (tc.c e) {
                                                            do0Var.a(e);
                                                        }
                                                    } else if ("smartglocal".equals(oo0Var.C0.native_provider)) {
                                                        new eo0(oo0Var, aVar).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, null, null, null);
                                                    }
                                                    return;
                                                } catch (Exception e7) {
                                                    FileLog.e(e7);
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
        }
        oo0Var.E0(0);
    }

    public static void k0(oo0 oo0Var) {
        if (UserConfig.getInstance(oo0Var.currentAccount).tmpPassword != null && UserConfig.getInstance(oo0Var.currentAccount).tmpPassword.valid_until < ConnectionsManager.getInstance(oo0Var.currentAccount).getCurrentTime() + 60) {
            UserConfig.getInstance(oo0Var.currentAccount).tmpPassword = null;
            UserConfig.getInstance(oo0Var.currentAccount).saveConfig(false);
        }
        if (UserConfig.getInstance(oo0Var.currentAccount).tmpPassword != null) {
            oo0Var.z0();
            return;
        }
        if (oo0Var.f[1].length() == 0) {
            try {
                oo0Var.f[1].performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
            AndroidUtilities.shakeViewSpring(oo0Var.f[1], 2.5f);
            return;
        }
        String obj = oo0Var.f[1].getText().toString();
        oo0Var.H0(true, true);
        oo0Var.D0(true);
        TL_account.getPassword getpassword = new TL_account.getPassword();
        ConnectionsManager.getInstance(oo0Var.currentAccount).sendRequest(getpassword, new aa(oo0Var, obj, getpassword, 28), (oo0Var.W0 ? 8 : 0) | 2);
    }

    public static void m0(oo0 oo0Var) {
        if (oo0Var.Q0) {
            return;
        }
        oo0Var.H0(true, true);
        TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo = new TLRPC.TL_payments_validateRequestedInfo();
        oo0Var.I0 = tL_payments_validateRequestedInfo;
        TLRPC.InputInvoice inputInvoice = oo0Var.b1;
        if (inputInvoice != null) {
            tL_payments_validateRequestedInfo.invoice = inputInvoice;
        } else if (oo0Var.N0 != null) {
            TLRPC.TL_inputInvoiceMessage tL_inputInvoiceMessage = new TLRPC.TL_inputInvoiceMessage();
            tL_inputInvoiceMessage.peer = oo0Var.getMessagesController().getInputPeer(oo0Var.N0.messageOwner.peer_id);
            tL_inputInvoiceMessage.msg_id = oo0Var.N0.getId();
            oo0Var.I0.invoice = tL_inputInvoiceMessage;
        } else {
            TLRPC.TL_inputInvoiceSlug tL_inputInvoiceSlug = new TLRPC.TL_inputInvoiceSlug();
            tL_inputInvoiceSlug.slug = oo0Var.O0;
            oo0Var.I0.invoice = tL_inputInvoiceSlug;
        }
        TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo2 = oo0Var.I0;
        tL_payments_validateRequestedInfo2.save = oo0Var.T0;
        tL_payments_validateRequestedInfo2.info = new TLRPC.TL_paymentRequestedInfo();
        if (oo0Var.C0.invoice.name_requested) {
            oo0Var.I0.info.name = oo0Var.f[6].getText().toString();
            oo0Var.I0.info.flags |= 1;
        }
        if (oo0Var.C0.invoice.phone_requested) {
            oo0Var.I0.info.phone = "+" + oo0Var.f[8].getText().toString() + oo0Var.f[9].getText().toString();
            TLRPC.TL_paymentRequestedInfo tL_paymentRequestedInfo = oo0Var.I0.info;
            tL_paymentRequestedInfo.flags = tL_paymentRequestedInfo.flags | 2;
        }
        if (oo0Var.C0.invoice.email_requested) {
            oo0Var.I0.info.email = oo0Var.f[7].getText().toString().trim();
            oo0Var.I0.info.flags |= 4;
        }
        if (oo0Var.C0.invoice.shipping_address_requested) {
            oo0Var.I0.info.shipping_address = new TLRPC.TL_postAddress();
            oo0Var.I0.info.shipping_address.street_line1 = oo0Var.f[0].getText().toString();
            oo0Var.I0.info.shipping_address.street_line2 = oo0Var.f[1].getText().toString();
            oo0Var.I0.info.shipping_address.city = oo0Var.f[2].getText().toString();
            oo0Var.I0.info.shipping_address.state = oo0Var.f[3].getText().toString();
            TLRPC.TL_postAddress tL_postAddress = oo0Var.I0.info.shipping_address;
            String str = oo0Var.B0;
            if (str == null) {
                str = "";
            }
            tL_postAddress.country_iso2 = str;
            tL_postAddress.post_code = oo0Var.f[5].getText().toString();
            oo0Var.I0.info.flags |= 8;
        }
        ConnectionsManager.getInstance(oo0Var.currentAccount).sendRequest(oo0Var.I0, new vb0(9, oo0Var, oo0Var.I0), (oo0Var.W0 ? 8 : 0) | 2);
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

    public final void A0(boolean z10) {
        String str;
        String str2;
        if (!z10 && this.S.getVisibility() == 0) {
            String text = this.S.getText();
            if (text.length() == 0) {
                org.telegram.ui.Cells.k3 k3Var = this.S;
                try {
                    k3Var.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                AndroidUtilities.shakeViewSpring(k3Var, 2.5f);
                return;
            } else {
                H0(true, true);
                TL_account.confirmPasswordEmail confirmpasswordemail = new TL_account.confirmPasswordEmail();
                confirmpasswordemail.code = text;
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(confirmpasswordemail, new on0(this, 0), 10);
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
                } catch (Exception e) {
                    FileLog.e(e);
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
            passwordinputsettings2.new_algo = this.a0.new_algo;
            passwordinputsettings2.flags = 3 | i10;
            passwordinputsettings2.email = obj2.trim();
            str = obj2;
            str2 = obj;
        }
        H0(true, true);
        Utilities.globalQueue.postRunnable(new ci.u1(this, z10, str, str2, updatepasswordsettings));
    }

    public final void B0(TLRPC.TL_paymentRequestedInfo tL_paymentRequestedInfo) {
        TLRPC.TL_postAddress tL_postAddress = tL_paymentRequestedInfo.shipping_address;
        org.telegram.ui.Cells.d9[] d9VarArr = this.Y;
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
            a4.a.A(sb2, ", ", str4, ", ", str5);
            d9VarArr[2].b(R.drawable.msg_payment_address, a4.a.t(sb2, ", ", str6), LocaleController.getString(R.string.PaymentShippingAddress), true);
        }
        d9VarArr[2].setVisibility(tL_paymentRequestedInfo.shipping_address != null ? 0 : 8);
        String str7 = tL_paymentRequestedInfo.name;
        if (str7 != null) {
            d9VarArr[3].b(R.drawable.msg_contacts, str7, LocaleController.getString(R.string.PaymentCheckoutName), true);
        }
        d9VarArr[3].setVisibility(tL_paymentRequestedInfo.name != null ? 0 : 8);
        if (tL_paymentRequestedInfo.phone != null) {
            d9VarArr[4].b(R.drawable.msg_calls, gf.b.c().b(tL_paymentRequestedInfo.phone), LocaleController.getString(R.string.PaymentCheckoutPhoneNumber), (tL_paymentRequestedInfo.email == null && this.G0 == null) ? false : true);
        }
        d9VarArr[4].setVisibility(tL_paymentRequestedInfo.phone != null ? 0 : 8);
        String str8 = tL_paymentRequestedInfo.email;
        if (str8 != null) {
            d9VarArr[5].b(R.drawable.msg_mention, str8, LocaleController.getString(R.string.PaymentCheckoutEmail), this.G0 != null);
        }
        d9VarArr[5].setVisibility(tL_paymentRequestedInfo.email != null ? 0 : 8);
    }

    public final void C0(TL_account.Password password) {
        if (password == null || !password.has_password) {
            this.a0 = password;
            this.b0 = (password == null || TextUtils.isEmpty(password.email_unconfirmed_pattern)) ? false : true;
            J0();
        } else {
            if (getParentActivity() == null) {
                return;
            }
            t0();
        }
    }

    public final void D0(boolean z10) {
        this.P0 = z10;
        this.G = !z10;
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        if (kVar != null && kVar.getBackButton() != null) {
            this.actionBar.getBackButton().setEnabled(!this.P0);
        }
        org.telegram.ui.Cells.d9 d9Var = this.Y[0];
        if (d9Var != null) {
            d9Var.setEnabled(!this.P0);
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
        org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.a;
        a2Var.R = str;
        a2Var.T = str2;
        showDialog(a2Var);
    }

    public final void G0(Runnable runnable) {
        org.telegram.ui.ActionBar.e3 e3Var = new org.telegram.ui.ActionBar.e3(1, (Context) getParentActivity(), (org.telegram.ui.ActionBar.d6) null, false);
        e3Var.fixNavigationBar();
        e3Var.title = LocaleController.getString(R.string.PaymentCheckoutMethod);
        e3Var.bigTitle = true;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard = this.y0;
        if (tL_paymentSavedCredentialsCard != null) {
            arrayList.add(tL_paymentSavedCredentialsCard.title);
            arrayList2.add(Integer.valueOf(R.drawable.msg_payment_card));
        } else {
            String str = this.x0;
            if (str != null) {
                arrayList.add(str);
                arrayList2.add(Integer.valueOf(R.drawable.msg_payment_card));
            }
        }
        ArrayList arrayList3 = new ArrayList();
        ArrayList<TLRPC.TL_paymentSavedCredentialsCard> arrayList4 = this.C0.saved_credentials;
        int size = arrayList4.size();
        int i10 = 0;
        while (i10 < size) {
            TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard2 = arrayList4.get(i10);
            i10++;
            TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard3 = tL_paymentSavedCredentialsCard2;
            TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard4 = this.y0;
            if (tL_paymentSavedCredentialsCard4 == null || !Objects.equals(tL_paymentSavedCredentialsCard3.id, tL_paymentSavedCredentialsCard4.id)) {
                arrayList.add(tL_paymentSavedCredentialsCard3.title);
                arrayList2.add(Integer.valueOf(R.drawable.msg_payment_card));
                arrayList3.add(tL_paymentSavedCredentialsCard3);
            }
        }
        ArrayList<TLRPC.TL_paymentFormMethod> arrayList5 = this.C0.additional_methods;
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
        org.telegram.ui.Components.a3 a3Var = new org.telegram.ui.Components.a3(this, runnable, arrayList3, arrayList, 1);
        e3Var.items = charSequenceArr;
        e3Var.itemIcons = iArr;
        e3Var.onClickListener = a3Var;
        showDialog(e3Var);
    }

    public final void H0(boolean z10, boolean z11) {
        AnimatorSet animatorSet = this.v;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        int i10 = 1;
        int i11 = 0;
        if (!z10 || this.n == null) {
            if (this.U != null) {
                this.v = new AnimatorSet();
                if (z11) {
                    this.s.setVisibility(0);
                    this.W.setEnabled(false);
                    AnimatorSet animatorSet2 = this.v;
                    TextView textView = this.U;
                    Property property = View.SCALE_X;
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property, 0.1f);
                    TextView textView2 = this.U;
                    Property property2 = View.SCALE_Y;
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) property2, 0.1f);
                    TextView textView3 = this.U;
                    Property property3 = View.ALPHA;
                    animatorSet2.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(textView3, (Property<TextView, Float>) property3, 0.0f), ObjectAnimator.ofFloat(this.s, (Property<org.telegram.ui.Components.uq, Float>) property, 1.0f), ObjectAnimator.ofFloat(this.s, (Property<org.telegram.ui.Components.uq, Float>) property2, 1.0f), ObjectAnimator.ofFloat(this.s, (Property<org.telegram.ui.Components.uq, Float>) property3, 1.0f));
                } else {
                    this.U.setVisibility(0);
                    this.W.setEnabled(true);
                    AnimatorSet animatorSet3 = this.v;
                    org.telegram.ui.Components.uq uqVar = this.s;
                    Property property4 = View.SCALE_X;
                    ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(uqVar, (Property<org.telegram.ui.Components.uq, Float>) property4, 0.1f);
                    org.telegram.ui.Components.uq uqVar2 = this.s;
                    Property property5 = View.SCALE_Y;
                    ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(uqVar2, (Property<org.telegram.ui.Components.uq, Float>) property5, 0.1f);
                    org.telegram.ui.Components.uq uqVar3 = this.s;
                    Property property6 = View.ALPHA;
                    animatorSet3.playTogether(ofFloat3, ofFloat4, ObjectAnimator.ofFloat(uqVar3, (Property<org.telegram.ui.Components.uq, Float>) property6, 0.0f), ObjectAnimator.ofFloat(this.U, (Property<TextView, Float>) property4, 1.0f), ObjectAnimator.ofFloat(this.U, (Property<TextView, Float>) property5, 1.0f), ObjectAnimator.ofFloat(this.U, (Property<TextView, Float>) property6, 1.0f));
                }
                this.v.addListener(new fo0(this, z11, i10));
                this.v.setDuration(150L);
                this.v.start();
                return;
            }
            return;
        }
        AnimatorSet animatorSet4 = new AnimatorSet();
        this.v = animatorSet4;
        if (z11) {
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
            animatorSet5.playTogether(ofFloat5, ofFloat6, ObjectAnimator.ofFloat(contentView3, (Property<View, Float>) property9, 0.0f), ObjectAnimator.ofFloat(this.r, (Property<org.telegram.ui.Components.uq, Float>) property7, 1.0f), ObjectAnimator.ofFloat(this.r, (Property<org.telegram.ui.Components.uq, Float>) property8, 1.0f), ObjectAnimator.ofFloat(this.r, (Property<org.telegram.ui.Components.uq, Float>) property9, 1.0f));
        } else if (this.w != null) {
            animatorSet4.playTogether(ObjectAnimator.ofFloat(this.r, (Property<org.telegram.ui.Components.uq, Float>) View.SCALE_X, 0.1f), ObjectAnimator.ofFloat(this.r, (Property<org.telegram.ui.Components.uq, Float>) View.SCALE_Y, 0.1f), ObjectAnimator.ofFloat(this.r, (Property<org.telegram.ui.Components.uq, Float>) View.ALPHA, 0.0f));
        } else {
            this.n.getContentView().setVisibility(0);
            this.n.setEnabled(true);
            AnimatorSet animatorSet6 = this.v;
            org.telegram.ui.Components.uq uqVar4 = this.r;
            Property property10 = View.SCALE_X;
            ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(uqVar4, (Property<org.telegram.ui.Components.uq, Float>) property10, 0.1f);
            org.telegram.ui.Components.uq uqVar5 = this.r;
            Property property11 = View.SCALE_Y;
            ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(uqVar5, (Property<org.telegram.ui.Components.uq, Float>) property11, 0.1f);
            org.telegram.ui.Components.uq uqVar6 = this.r;
            Property property12 = View.ALPHA;
            animatorSet6.playTogether(ofFloat7, ofFloat8, ObjectAnimator.ofFloat(uqVar6, (Property<org.telegram.ui.Components.uq, Float>) property12, 0.0f));
            if (!isFinishing()) {
                this.v.playTogether(ObjectAnimator.ofFloat(this.n.getContentView(), (Property<View, Float>) property10, 1.0f), ObjectAnimator.ofFloat(this.n.getContentView(), (Property<View, Float>) property11, 1.0f), ObjectAnimator.ofFloat(this.n.getContentView(), (Property<View, Float>) property12, 1.0f));
            }
        }
        this.v.addListener(new fo0(this, z11, i11));
        this.v.setDuration(150L);
        this.v.start();
    }

    public final void I0(String str) {
        if (getParentActivity() == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        String string = LocaleController.getString(R.string.PaymentTransactionReview);
        org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.a;
        a2Var.R = string;
        a2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("PaymentTransactionMessage2", R.string.PaymentTransactionMessage2, str, this.p0, this.q0));
        alertDialog$Builder.k(LocaleController.getString(R.string.Continue), new mn0(this, 5));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        showDialog(a2Var);
    }

    public final void J0() {
        if (this.u0 == 6) {
            org.telegram.ui.Cells.e9[] e9VarArr = this.M;
            if (e9VarArr[2] == null) {
                return;
            }
            int i10 = 0;
            this.n.setVisibility(0);
            TL_account.Password password = this.a0;
            ArrayList arrayList = this.J;
            org.telegram.ui.Cells.m4[] m4VarArr = this.I;
            org.telegram.ui.Cells.ea[] eaVarArr = this.N;
            if (password == null) {
                H0(true, true);
                e9VarArr[2].setVisibility(8);
                eaVarArr[0].setVisibility(8);
                eaVarArr[1].setVisibility(8);
                this.S.setVisibility(8);
                m4VarArr[0].setVisibility(8);
                m4VarArr[1].setVisibility(8);
                e9VarArr[0].setVisibility(8);
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
            if (!this.b0) {
                e9VarArr[2].setVisibility(8);
                eaVarArr[0].setVisibility(8);
                eaVarArr[1].setVisibility(8);
                e9VarArr[1].setText(LocaleController.getString(R.string.PaymentPasswordEmailInfo));
                this.S.setVisibility(8);
                m4VarArr[0].setVisibility(0);
                m4VarArr[1].setVisibility(0);
                e9VarArr[0].setVisibility(0);
                for (int i12 = 0; i12 < 3; i12++) {
                    ((View) this.f[i12].getParent()).setVisibility(0);
                }
                for (int i13 = 0; i13 < arrayList.size(); i13++) {
                    ((View) arrayList.get(i13)).setVisibility(0);
                }
                return;
            }
            org.telegram.ui.Cells.e9 e9Var = e9VarArr[2];
            int i14 = R.string.EmailPasswordConfirmText2;
            String str = this.a0.email_unconfirmed_pattern;
            if (str == null) {
                str = "";
            }
            e9Var.setText(LocaleController.formatString("EmailPasswordConfirmText2", i14, str));
            e9VarArr[2].setVisibility(0);
            eaVarArr[0].setVisibility(0);
            eaVarArr[1].setVisibility(0);
            this.S.setVisibility(0);
            e9VarArr[1].setText("");
            m4VarArr[0].setVisibility(8);
            m4VarArr[1].setVisibility(8);
            e9VarArr[0].setVisibility(8);
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
        org.telegram.ui.Cells.e9[] e9VarArr = this.M;
        if (e9VarArr[0] != null) {
            org.telegram.ui.Cells.b7[] b7VarArr = this.K;
            if (b7VarArr[2] == null) {
                return;
            }
            TLRPC.PaymentForm paymentForm = this.C0;
            if ((!paymentForm.password_missing && !paymentForm.can_save_credentials) || (this.w != null && this.z0)) {
                this.L.setVisibility(8);
                e9VarArr[0].setVisibility(8);
                org.telegram.ui.Cells.b7 b7Var = b7VarArr[2];
                b7Var.setBackground(org.telegram.ui.ActionBar.h6.V0(b7Var.getContext(), R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.h6.b7));
                return;
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(R.string.PaymentCardSavePaymentInformationInfoLine1));
            if (this.C0.password_missing) {
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
                    e9VarArr[0].getTextView().setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
                    spannableStringBuilder.replace(i11, i11 + 1, (CharSequence) "");
                    spannableStringBuilder.replace(i10, i10 + 1, (CharSequence) "");
                    spannableStringBuilder.setSpan(new lo0(this), i10, i11 - 1, 33);
                }
            }
            this.L.setEnabled(true);
            e9VarArr[0].setText(spannableStringBuilder);
            this.L.setVisibility(0);
            e9VarArr[0].setVisibility(0);
            org.telegram.ui.Cells.b7 b7Var2 = b7VarArr[2];
            b7Var2.setBackground(org.telegram.ui.ActionBar.h6.V0(b7Var2.getContext(), R.drawable.greydivider, org.telegram.ui.ActionBar.h6.b7));
        }
    }

    public final void L0() {
        this.R0[0] = s0(this.t0);
        this.R.a(LocaleController.getString(R.string.PaymentTransactionTotal), this.R0[0], true);
        TextView textView = this.U;
        if (textView != null) {
            textView.setText(LocaleController.formatString("PaymentCheckoutPay", R.string.PaymentCheckoutPay, this.R0[0]));
        }
        if (this.s0 != null) {
            int themedColor = getThemedColor(org.telegram.ui.ActionBar.h6.ei);
            int childCount = this.s0.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                TextView textView2 = (TextView) this.s0.getChildAt(i10);
                if (textView2.getTag().equals(this.H0)) {
                    org.telegram.ui.ActionBar.h6.w1(themedColor, textView2.getBackground());
                    textView2.setTextColor(getThemedColor(org.telegram.ui.ActionBar.h6.fi));
                } else {
                    org.telegram.ui.ActionBar.h6.w1(536870911 & themedColor, textView2.getBackground());
                    textView2.setTextColor(getThemedColor(org.telegram.ui.ActionBar.h6.Z8));
                }
                textView2.invalidate();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:178:0x030e, code lost:
    
        if (r15.email_requested == false) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:482:0x0ff4, code lost:
    
        if (r12.email_requested == false) goto L467;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:187:0x077e  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0798  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x07ad  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x07c4  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x07ff  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x085e  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x08ed  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0818  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x07d1  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x078e  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x0b96  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x0bfb  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x0c2b  */
    /* JADX WARN: Removed duplicated region for block: B:330:0x0c59  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x0d1b  */
    /* JADX WARN: Removed duplicated region for block: B:351:0x0d3b  */
    /* JADX WARN: Removed duplicated region for block: B:352:0x0c75  */
    /* JADX WARN: Removed duplicated region for block: B:362:0x0c2d  */
    /* JADX WARN: Removed duplicated region for block: B:363:0x0c08  */
    /* JADX WARN: Removed duplicated region for block: B:370:0x0bec  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0217  */
    /* JADX WARN: Type inference failed for: r3v299, types: [android.view.View, android.view.ViewGroup, android.widget.FrameLayout] */
    /* JADX WARN: Type inference failed for: r3v303, types: [android.view.ViewGroup] */
    /* JADX WARN: Type inference failed for: r3v304, types: [android.view.ViewGroup] */
    /* JADX WARN: Type inference failed for: r3v339, types: [android.view.View, android.view.ViewGroup, android.widget.LinearLayout] */
    /* JADX WARN: Type inference failed for: r4v155, types: [android.view.ViewGroup, android.widget.LinearLayout] */
    /* JADX WARN: Type inference failed for: r4v313, types: [android.view.ViewGroup, android.widget.LinearLayout] */
    @Override // org.telegram.ui.ActionBar.m2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View createView(Context context) {
        String str;
        String str2;
        String str3;
        char c10;
        TLRPC.PaymentForm paymentForm;
        SpannableStringBuilder spannableStringBuilder;
        TLRPC.PaymentForm paymentForm2;
        TLRPC.TL_paymentRequestedInfo tL_paymentRequestedInfo;
        boolean z10;
        char c11;
        int i10;
        int i11;
        TLRPC.TL_invoice tL_invoice;
        org.telegram.ui.Cells.b7 b7Var;
        TLRPC.TL_paymentRequestedInfo tL_paymentRequestedInfo2;
        TLRPC.TL_paymentRequestedInfo tL_paymentRequestedInfo3;
        String str4;
        ?? frameLayout;
        String str5;
        boolean z11;
        TLRPC.TL_postAddress tL_postAddress;
        TLRPC.TL_postAddress tL_postAddress2;
        TLRPC.TL_postAddress tL_postAddress3;
        TLRPC.TL_postAddress tL_postAddress4;
        TLRPC.TL_postAddress tL_postAddress5;
        TLRPC.TL_postAddress tL_postAddress6;
        String str6;
        String str7;
        BufferedReader bufferedReader;
        switch (this.u0) {
            case 0:
                this.actionBar.setTitle(LocaleController.getString(R.string.PaymentShippingInfo));
                break;
            case 1:
                this.actionBar.setTitle(LocaleController.getString(R.string.PaymentShippingMethod));
                break;
            case 2:
            case 3:
                TLRPC.TL_paymentFormMethod tL_paymentFormMethod = this.F0;
                if (tL_paymentFormMethod != null && !TextUtils.isEmpty(tL_paymentFormMethod.title)) {
                    this.actionBar.setTitle(this.F0.title);
                    break;
                } else {
                    this.actionBar.setTitle(LocaleController.getString(R.string.PaymentCardInfo));
                    break;
                }
                break;
            case 4:
                if (this.C0.invoice.test) {
                    this.actionBar.setTitle("Test " + LocaleController.getString(R.string.PaymentCheckout));
                    break;
                } else {
                    this.actionBar.setTitle(LocaleController.getString(R.string.PaymentCheckout));
                    break;
                }
            case 5:
                if (this.C0.invoice.test) {
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
        this.actionBar.setActionBarMenuOnItemClick(new zn0(this));
        org.telegram.ui.ActionBar.y n10 = this.actionBar.n();
        int i12 = this.u0;
        int i13 = 6;
        int i14 = 3;
        if (i12 == 0 || i12 == 1 || i12 == 2 || i12 == 3 || i12 == 4 || i12 == 6) {
            this.n = n10.h(1, R.drawable.ic_ab_done, LocaleController.getString(R.string.Done), AndroidUtilities.dp(56.0f));
            org.telegram.ui.Components.uq uqVar = new org.telegram.ui.Components.uq(context, 1);
            this.r = uqVar;
            uqVar.setAlpha(0.0f);
            this.r.setScaleX(0.1f);
            this.r.setScaleY(0.1f);
            this.r.setVisibility(4);
            this.n.addView(this.r, w7.y5.c(-1.0f, -1));
        }
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.fragmentView = frameLayout2;
        frameLayout2.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.h6.a7));
        ScrollView scrollView = new ScrollView(context);
        this.E = scrollView;
        scrollView.setFillViewport(true);
        AndroidUtilities.setScrollViewEdgeEffectColor(this.E, getThemedColor(org.telegram.ui.ActionBar.h6.s8));
        frameLayout2.addView(this.E, w7.y5.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, this.u0 == 4 ? 48.0f : 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.Q = linearLayout;
        linearLayout.setOrientation(1);
        int i15 = 0;
        this.Q.setClipChildren(false);
        this.E.addView(this.Q, new FrameLayout.LayoutParams(-1, -2));
        int i16 = this.u0;
        int i17 = 10;
        String str8 = "";
        char c12 = 1;
        String str9 = null;
        if (i16 == 0) {
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            try {
                bufferedReader = new BufferedReader(new InputStreamReader(context.getResources().getAssets().open("countries.txt")));
            } catch (Exception e) {
                e = e;
                c11 = 0;
            }
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine != null) {
                    String[] split = readLine.split(";");
                    this.a.add(i15, split[2]);
                    c11 = 0;
                    try {
                        this.b.put(split[2], split[0]);
                        this.c.put(split[0], split[2]);
                        hashMap2.put(split[1], split[2]);
                        if (split.length > 3) {
                            this.d.put(split[0], split[3]);
                        }
                        hashMap.put(split[1], split[2]);
                        i15 = 0;
                    } catch (Exception e7) {
                        e = e7;
                    }
                } else {
                    c11 = 0;
                    bufferedReader.close();
                    Collections.sort(this.a, new cf(25));
                    this.f = new EditTextBoldCursor[10];
                    i10 = 0;
                    while (i10 < i17) {
                        if (i10 == 0) {
                            this.I[c11] = new org.telegram.ui.Cells.m4(context, this.Y0);
                            this.I[c11].setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.h6.d6));
                            this.I[c11].setText(LocaleController.getString(R.string.PaymentShippingAddress));
                            this.Q.addView(this.I[c11], w7.y5.n(-1, -2));
                        } else if (i10 == i13) {
                            this.K[c11] = new org.telegram.ui.Cells.b7(context, (Object) null);
                            this.Q.addView(this.K[c11], w7.y5.n(-1, -2));
                            this.I[c12] = new org.telegram.ui.Cells.m4(context, this.Y0);
                            this.I[c12].setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.h6.d6));
                            this.I[c12].setText(LocaleController.getString(R.string.PaymentShippingReceiver));
                            this.Q.addView(this.I[c12], w7.y5.n(-1, -2));
                        }
                        if (i10 == 8) {
                            frameLayout = new LinearLayout(context);
                            frameLayout.setClipChildren(false);
                            frameLayout.setOrientation(0);
                            this.Q.addView(frameLayout, w7.y5.n(-1, 50));
                            frameLayout.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.h6.d6));
                        } else if (i10 == 9) {
                            frameLayout = (ViewGroup) this.f[8].getParent();
                        } else {
                            frameLayout = new FrameLayout(context);
                            frameLayout.setClipChildren(false);
                            this.Q.addView(frameLayout, w7.y5.n(-1, 50));
                            int i18 = org.telegram.ui.ActionBar.h6.d6;
                            frameLayout.setBackgroundColor(getThemedColor(i18));
                            boolean z12 = i10 != 5;
                            if (z12) {
                                if (i10 != 7 || this.C0.invoice.phone_requested) {
                                    if (i10 == i13) {
                                        TLRPC.TL_invoice tL_invoice2 = this.C0.invoice;
                                        if (!tL_invoice2.phone_requested) {
                                        }
                                    }
                                }
                                z12 = false;
                            }
                            if (z12) {
                                org.telegram.ui.Components.ln lnVar = new org.telegram.ui.Components.ln(context, 18);
                                lnVar.setBackgroundColor(getThemedColor(i18));
                                this.J.add(lnVar);
                                frameLayout.addView(lnVar, new FrameLayout.LayoutParams(-1, 1, 83));
                            }
                        }
                        if (i10 == 9) {
                            this.f[i10] = new org.telegram.ui.Components.g40(context);
                        } else {
                            this.f[i10] = new EditTextBoldCursor(context);
                        }
                        this.f[i10].setTag(Integer.valueOf(i10));
                        this.f[i10].setTextSize(1, 16.0f);
                        this.f[i10].setHintTextColor(getThemedColor(org.telegram.ui.ActionBar.h6.H6));
                        EditTextBoldCursor editTextBoldCursor = this.f[i10];
                        int i19 = org.telegram.ui.ActionBar.h6.G6;
                        editTextBoldCursor.setTextColor(getThemedColor(i19));
                        this.f[i10].setBackgroundDrawable(null);
                        this.f[i10].setCursorColor(getThemedColor(i19));
                        this.f[i10].setCursorSize(AndroidUtilities.dp(20.0f));
                        this.f[i10].setCursorWidth(1.5f);
                        if (i10 == 4) {
                            final int i20 = 0;
                            this.f[i10].setOnTouchListener(new View.OnTouchListener(this) { // from class: org.telegram.ui.jn0
                                public final /* synthetic */ oo0 b;

                                {
                                    this.b = this;
                                }

                                @Override // android.view.View.OnTouchListener
                                public final boolean onTouch(View view, MotionEvent motionEvent) {
                                    switch (i20) {
                                        case 0:
                                            oo0 oo0Var = this.b;
                                            if (oo0Var.getParentActivity() != null) {
                                                if (motionEvent.getAction() == 1) {
                                                    wt wtVar = new wt(null, false);
                                                    wtVar.n = true;
                                                    wtVar.r = new mn0(oo0Var, 4);
                                                    oo0Var.presentFragment(wtVar);
                                                    break;
                                                }
                                            }
                                            break;
                                        default:
                                            oo0 oo0Var2 = this.b;
                                            if (oo0Var2.getParentActivity() != null) {
                                                if (motionEvent.getAction() == 1) {
                                                    wt wtVar2 = new wt(null, false);
                                                    wtVar2.n = true;
                                                    wtVar2.r = new mn0(oo0Var2, 2);
                                                    oo0Var2.presentFragment(wtVar2);
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
                                TLRPC.TL_paymentRequestedInfo tL_paymentRequestedInfo4 = this.C0.saved_info;
                                if (tL_paymentRequestedInfo4 != null && (tL_postAddress = tL_paymentRequestedInfo4.shipping_address) != null) {
                                    this.f[i10].setText(tL_postAddress.street_line1);
                                    break;
                                }
                                break;
                            case 1:
                                this.f[i10].setHint(LocaleController.getString(R.string.PaymentShippingAddress2Placeholder));
                                TLRPC.TL_paymentRequestedInfo tL_paymentRequestedInfo5 = this.C0.saved_info;
                                if (tL_paymentRequestedInfo5 != null && (tL_postAddress2 = tL_paymentRequestedInfo5.shipping_address) != null) {
                                    this.f[i10].setText(tL_postAddress2.street_line2);
                                    break;
                                }
                                break;
                            case 2:
                                this.f[i10].setHint(LocaleController.getString(R.string.PaymentShippingCityPlaceholder));
                                TLRPC.TL_paymentRequestedInfo tL_paymentRequestedInfo6 = this.C0.saved_info;
                                if (tL_paymentRequestedInfo6 != null && (tL_postAddress3 = tL_paymentRequestedInfo6.shipping_address) != null) {
                                    this.f[i10].setText(tL_postAddress3.city);
                                    break;
                                }
                                break;
                            case 3:
                                this.f[i10].setHint(LocaleController.getString(R.string.PaymentShippingStatePlaceholder));
                                TLRPC.TL_paymentRequestedInfo tL_paymentRequestedInfo7 = this.C0.saved_info;
                                if (tL_paymentRequestedInfo7 != null && (tL_postAddress4 = tL_paymentRequestedInfo7.shipping_address) != null) {
                                    this.f[i10].setText(tL_postAddress4.state);
                                    break;
                                }
                                break;
                            case 4:
                                this.f[i10].setHint(LocaleController.getString(R.string.PaymentShippingCountry));
                                TLRPC.TL_paymentRequestedInfo tL_paymentRequestedInfo8 = this.C0.saved_info;
                                if (tL_paymentRequestedInfo8 != null && (tL_postAddress5 = tL_paymentRequestedInfo8.shipping_address) != null) {
                                    String str10 = (String) hashMap2.get(tL_postAddress5.country_iso2);
                                    String str11 = this.C0.saved_info.shipping_address.country_iso2;
                                    this.B0 = str11;
                                    EditTextBoldCursor editTextBoldCursor2 = this.f[i10];
                                    if (str10 == null) {
                                        str10 = str11;
                                    }
                                    editTextBoldCursor2.setText(str10);
                                    break;
                                }
                                break;
                            case 5:
                                this.f[i10].setHint(LocaleController.getString(R.string.PaymentShippingZipPlaceholder));
                                TLRPC.TL_paymentRequestedInfo tL_paymentRequestedInfo9 = this.C0.saved_info;
                                if (tL_paymentRequestedInfo9 != null && (tL_postAddress6 = tL_paymentRequestedInfo9.shipping_address) != null) {
                                    this.f[i10].setText(tL_postAddress6.post_code);
                                    break;
                                }
                                break;
                            case 6:
                                this.f[i10].setHint(LocaleController.getString(R.string.PaymentShippingName));
                                TLRPC.TL_paymentRequestedInfo tL_paymentRequestedInfo10 = this.C0.saved_info;
                                if (tL_paymentRequestedInfo10 != null && (str6 = tL_paymentRequestedInfo10.name) != null) {
                                    this.f[i10].setText(str6);
                                    break;
                                }
                                break;
                            case 7:
                                this.f[i10].setHint(LocaleController.getString(R.string.PaymentShippingEmailPlaceholder));
                                TLRPC.TL_paymentRequestedInfo tL_paymentRequestedInfo11 = this.C0.saved_info;
                                if (tL_paymentRequestedInfo11 != null && (str7 = tL_paymentRequestedInfo11.email) != null) {
                                    this.f[i10].setText(str7);
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
                            this.H.setTextColor(getThemedColor(i19));
                            this.H.setTextSize(1, 16.0f);
                            frameLayout.addView(this.H, w7.y5.k(21.0f, 12.0f, 0.0f, 6.0f, -2, -2));
                            this.f[i10].setPadding(AndroidUtilities.dp(10.0f), 0, 0, 0);
                            this.f[i10].setGravity(19);
                            this.f[i10].setFilters(new InputFilter[]{new InputFilter.LengthFilter(5)});
                            frameLayout.addView(this.f[i10], w7.y5.k(0.0f, 12.0f, 21.0f, 6.0f, 55, -2));
                            this.f[i10].addTextChangedListener(new go0(this));
                        } else if (i10 == 9) {
                            this.f[i10].setPadding(0, 0, 0, 0);
                            this.f[i10].setGravity(19);
                            frameLayout.addView(this.f[i10], w7.y5.k(0.0f, 12.0f, 21.0f, 6.0f, -1, -2));
                            this.f[i10].addTextChangedListener(new xr(this, 4));
                        } else {
                            this.f[i10].setPadding(0, 0, 0, AndroidUtilities.dp(6.0f));
                            this.f[i10].setGravity(LocaleController.isRTL ? 5 : 3);
                            frameLayout.addView(this.f[i10], w7.y5.d(-1, -2.0f, 51, 21.0f, 12.0f, 21.0f, 6.0f));
                        }
                        final int i21 = 2;
                        this.f[i10].setOnEditorActionListener(new TextView.OnEditorActionListener(this) { // from class: org.telegram.ui.kn0
                            public final /* synthetic */ oo0 b;

                            {
                                this.b = this;
                            }

                            @Override // android.widget.TextView.OnEditorActionListener
                            public final boolean onEditorAction(TextView textView2, int i22, KeyEvent keyEvent) {
                                EditTextBoldCursor[] editTextBoldCursorArr;
                                switch (i21) {
                                    case 0:
                                        oo0 oo0Var = this.b;
                                        if (i22 != 6) {
                                            oo0Var.getClass();
                                            break;
                                        } else {
                                            oo0Var.A0(false);
                                            break;
                                        }
                                    case 1:
                                        oo0 oo0Var2 = this.b;
                                        if (i22 != 6) {
                                            oo0Var2.getClass();
                                            if (i22 == 5) {
                                                int intValue = ((Integer) textView2.getTag()).intValue();
                                                if (intValue != 0) {
                                                    if (intValue == 1) {
                                                        oo0Var2.f[2].requestFocus();
                                                        break;
                                                    }
                                                } else {
                                                    oo0Var2.f[1].requestFocus();
                                                    break;
                                                }
                                            }
                                        } else {
                                            oo0Var2.n.performClick();
                                            break;
                                        }
                                        break;
                                    case 2:
                                        oo0 oo0Var3 = this.b;
                                        oo0Var3.getClass();
                                        if (i22 != 5) {
                                            if (i22 == 6) {
                                                oo0Var3.n.performClick();
                                                break;
                                            }
                                        } else {
                                            int intValue2 = ((Integer) textView2.getTag()).intValue();
                                            while (true) {
                                                intValue2++;
                                                EditTextBoldCursor[] editTextBoldCursorArr2 = oo0Var3.f;
                                                if (intValue2 >= editTextBoldCursorArr2.length) {
                                                    break;
                                                } else if (intValue2 != 4 && ((View) editTextBoldCursorArr2[intValue2].getParent()).getVisibility() == 0) {
                                                    oo0Var3.f[intValue2].requestFocus();
                                                    break;
                                                }
                                            }
                                        }
                                        break;
                                    case 3:
                                        oo0 oo0Var4 = this.b;
                                        oo0Var4.getClass();
                                        if (i22 != 5) {
                                            if (i22 == 6) {
                                                oo0Var4.n.performClick();
                                                break;
                                            }
                                        } else {
                                            int intValue3 = ((Integer) textView2.getTag()).intValue();
                                            do {
                                                int i23 = intValue3 + 1;
                                                editTextBoldCursorArr = oo0Var4.f;
                                                if (i23 >= editTextBoldCursorArr.length) {
                                                    break;
                                                } else {
                                                    intValue3 = i23 == 4 ? intValue3 + 2 : i23;
                                                }
                                            } while (((View) editTextBoldCursorArr[intValue3].getParent()).getVisibility() != 0);
                                            oo0Var4.f[intValue3].requestFocus();
                                            break;
                                        }
                                        break;
                                    default:
                                        oo0 oo0Var5 = this.b;
                                        if (i22 != 6) {
                                            oo0Var5.getClass();
                                            break;
                                        } else {
                                            oo0Var5.n.performClick();
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
                                int i22 = 0;
                                while (i22 < this.C0.users.size()) {
                                    TLRPC.User user2 = this.C0.users.get(i22);
                                    String str12 = str8;
                                    if (user2.id == this.C0.provider_id) {
                                        user = user2;
                                    }
                                    i22++;
                                    str8 = str12;
                                }
                                str5 = str8;
                                String formatName = user != null ? ContactsController.formatName(user.first_name, user.last_name) : str5;
                                z11 = true;
                                this.M[1] = new org.telegram.ui.Cells.e9(context, this.Y0);
                                this.M[1].setBackgroundDrawable(org.telegram.ui.ActionBar.h6.V0(context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.h6.b7));
                                this.Q.addView(this.M[1], w7.y5.n(-1, -2));
                                TLRPC.TL_invoice tL_invoice4 = this.C0.invoice;
                                boolean z13 = tL_invoice4.email_to_provider;
                                if (z13 && tL_invoice4.phone_to_provider) {
                                    this.M[1].setText(LocaleController.formatString("PaymentPhoneEmailToProvider", R.string.PaymentPhoneEmailToProvider, formatName));
                                } else if (z13) {
                                    this.M[1].setText(LocaleController.formatString("PaymentEmailToProvider", R.string.PaymentEmailToProvider, formatName));
                                } else {
                                    this.M[1].setText(LocaleController.formatString("PaymentPhoneToProvider", R.string.PaymentPhoneToProvider, formatName));
                                }
                            } else {
                                this.K[1] = new org.telegram.ui.Cells.b7(context, (Object) null);
                                this.Q.addView(this.K[1], w7.y5.n(-1, -2));
                                str5 = str8;
                                z11 = true;
                            }
                            org.telegram.ui.Cells.w8 w8Var = new org.telegram.ui.Cells.w8(context, this.Y0);
                            this.L = w8Var;
                            w8Var.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.K0(z11));
                            this.L.f(LocaleController.getString(R.string.PaymentShippingSave), this.T0, false);
                            this.Q.addView(this.L, w7.y5.n(-1, -2));
                            this.L.setOnClickListener(new in0(this, 8));
                            this.M[0] = new org.telegram.ui.Cells.e9(context, this.Y0);
                            this.M[0].setBackgroundDrawable(org.telegram.ui.ActionBar.h6.V0(context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.h6.b7));
                            this.M[0].setText(LocaleController.getString(R.string.PaymentShippingSaveInfo));
                            this.Q.addView(this.M[0], w7.y5.n(-1, -2));
                        } else {
                            str5 = str8;
                        }
                        i10++;
                        str8 = str5;
                        i17 = 10;
                        i13 = 6;
                        i14 = 3;
                        c12 = 1;
                        c11 = 0;
                    }
                    if (this.C0.invoice.name_requested) {
                        i11 = 8;
                        ((ViewGroup) this.f[6].getParent()).setVisibility(8);
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
                        this.f[6].setImeOptions(268435462);
                    } else {
                        this.f[5].setImeOptions(268435462);
                    }
                    b7Var = this.K[1];
                    if (b7Var == null) {
                        TLRPC.TL_invoice tL_invoice5 = this.C0.invoice;
                        b7Var.setVisibility((tL_invoice5.name_requested || tL_invoice5.phone_requested || tL_invoice5.email_requested) ? 0 : 8);
                    } else {
                        org.telegram.ui.Cells.e9 e9Var = this.M[1];
                        if (e9Var != null) {
                            TLRPC.TL_invoice tL_invoice6 = this.C0.invoice;
                            e9Var.setVisibility((tL_invoice6.name_requested || tL_invoice6.phone_requested || tL_invoice6.email_requested) ? 0 : 8);
                        }
                    }
                    org.telegram.ui.Cells.m4 m4Var = this.I[1];
                    TLRPC.TL_invoice tL_invoice7 = this.C0.invoice;
                    m4Var.setVisibility((!tL_invoice7.name_requested || tL_invoice7.phone_requested || tL_invoice7.email_requested) ? 0 : 8);
                    if (!this.C0.invoice.shipping_address_requested) {
                        this.I[0].setVisibility(8);
                        this.K[0].setVisibility(8);
                        ((ViewGroup) this.f[0].getParent()).setVisibility(8);
                        ((ViewGroup) this.f[1].getParent()).setVisibility(8);
                        ((ViewGroup) this.f[2].getParent()).setVisibility(8);
                        ((ViewGroup) this.f[3].getParent()).setVisibility(8);
                        ((ViewGroup) this.f[4].getParent()).setVisibility(8);
                        ((ViewGroup) this.f[5].getParent()).setVisibility(8);
                    }
                    tL_paymentRequestedInfo2 = this.C0.saved_info;
                    if (tL_paymentRequestedInfo2 != null || TextUtils.isEmpty(tL_paymentRequestedInfo2.phone)) {
                        o0(null);
                    } else {
                        o0(this.C0.saved_info.phone);
                    }
                    if (this.f[8].length() == 0) {
                        TLRPC.PaymentForm paymentForm3 = this.C0;
                        if (paymentForm3.invoice.phone_requested && ((tL_paymentRequestedInfo3 = paymentForm3.saved_info) == null || TextUtils.isEmpty(tL_paymentRequestedInfo3.phone))) {
                            try {
                                TelephonyManager telephonyManager = (TelephonyManager) ApplicationLoader.applicationContext.getSystemService("phone");
                                if (telephonyManager != null) {
                                    str9 = telephonyManager.getSimCountryIso().toUpperCase();
                                }
                            } catch (Exception e10) {
                                FileLog.e(e10);
                            }
                            if (str9 != null && (str4 = (String) hashMap.get(str9)) != null && this.a.indexOf(str4) != -1) {
                                this.f[8].setText((CharSequence) this.b.get(str4));
                            }
                        }
                    }
                }
                e = e7;
                FileLog.e(e);
                Collections.sort(this.a, new cf(25));
                this.f = new EditTextBoldCursor[10];
                i10 = 0;
                while (i10 < i17) {
                }
                if (this.C0.invoice.name_requested) {
                }
                if (!this.C0.invoice.phone_requested) {
                }
                if (!this.C0.invoice.email_requested) {
                }
                tL_invoice = this.C0.invoice;
                if (!tL_invoice.phone_requested) {
                }
                b7Var = this.K[1];
                if (b7Var == null) {
                }
                org.telegram.ui.Cells.m4 m4Var2 = this.I[1];
                TLRPC.TL_invoice tL_invoice72 = this.C0.invoice;
                m4Var2.setVisibility((!tL_invoice72.name_requested || tL_invoice72.phone_requested || tL_invoice72.email_requested) ? 0 : 8);
                if (!this.C0.invoice.shipping_address_requested) {
                }
                tL_paymentRequestedInfo2 = this.C0.saved_info;
                if (tL_paymentRequestedInfo2 != null) {
                }
                o0(null);
                if (this.f[8].length() == 0) {
                }
            }
        } else {
            int i23 = 16;
            if (i16 == 2) {
                if (this.C0.native_params != null) {
                    try {
                        JSONObject jSONObject = new JSONObject(this.C0.native_params.data);
                        String optString = jSONObject.optString("google_pay_public_key");
                        if (!TextUtils.isEmpty(optString)) {
                            this.K0 = optString;
                        }
                        this.L0 = jSONObject.optString("acquirer_bank_country");
                        this.M0 = jSONObject.optJSONObject("gpay_parameters");
                    } catch (Exception e11) {
                        FileLog.e(e11);
                    }
                }
                if (this.S0 || this.F0 != null) {
                    if (this.K0 != null || this.M0 != null) {
                        v0(context);
                    }
                    n0(context);
                    this.Q.addView(this.O, w7.y5.n(-1, 50));
                    this.z0 = true;
                    H0(true, true);
                    this.r.setVisibility(0);
                    this.n.setEnabled(false);
                    this.n.getContentView().setVisibility(4);
                    AndroidUtilities.checkAndroidTheme(context, true);
                    org.telegram.ui.Components.h91 h91Var = new org.telegram.ui.Components.h91(this, context);
                    this.w = h91Var;
                    h91Var.getSettings().setJavaScriptEnabled(true);
                    this.w.getSettings().setDomStorageEnabled(true);
                    this.w.getSettings().setSupportZoom(true);
                    this.w.getSettings().setBuiltInZoomControls(true);
                    this.w.getSettings().setDisplayZoomControls(false);
                    this.w.getSettings().setUseWideViewPort(true);
                    this.w.getSettings().setMixedContentMode(0);
                    CookieManager.getInstance().setAcceptThirdPartyCookies(this.w, true);
                    this.w.addJavascriptInterface(new PaymentFormActivity$TelegramWebviewProxy(this), "TelegramWebviewProxy");
                    this.w.setWebViewClient(new ho0(this, context));
                    this.Q.addView(this.w, w7.y5.c(-2.0f, -1));
                    this.K[2] = new org.telegram.ui.Cells.b7(context, (Object) null);
                    this.Q.addView(this.K[2], w7.y5.n(-1, -2));
                    org.telegram.ui.Cells.w8 w8Var2 = new org.telegram.ui.Cells.w8(context, this.Y0);
                    this.L = w8Var2;
                    w8Var2.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.K0(true));
                    this.L.f(LocaleController.getString(R.string.PaymentCardSavePaymentInformation), this.U0, false);
                    this.Q.addView(this.L, w7.y5.n(-1, -2));
                    this.L.setOnClickListener(new in0(this, 9));
                    this.M[0] = new org.telegram.ui.Cells.e9(context, this.Y0);
                    this.M[0].setBackgroundDrawable(org.telegram.ui.ActionBar.h6.V0(context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.h6.b7));
                    K0();
                    this.Q.addView(this.M[0], w7.y5.n(-1, -2));
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
                        } catch (Exception e12) {
                            FileLog.e(e12);
                        }
                    }
                    if (this.k0 && ((!TextUtils.isEmpty(this.j0) && "stripe".equals(this.C0.native_provider)) || this.M0 != null)) {
                        v0(context);
                    }
                    this.f = new EditTextBoldCursor[6];
                    int i24 = 0;
                    for (int i25 = 6; i24 < i25; i25 = 6) {
                        if (i24 == 0) {
                            this.I[0] = new org.telegram.ui.Cells.m4(context, this.Y0);
                            this.I[0].setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.h6.d6));
                            this.I[0].setText(LocaleController.getString(R.string.PaymentCardTitle));
                            this.Q.addView(this.I[0], w7.y5.n(-1, -2));
                        } else if (i24 == 4) {
                            this.I[1] = new org.telegram.ui.Cells.m4(context, this.Y0);
                            this.I[1].setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.h6.d6));
                            this.I[1].setText(LocaleController.getString(R.string.PaymentBillingAddress));
                            this.Q.addView(this.I[1], w7.y5.n(-1, -2));
                        }
                        boolean z14 = (i24 == 3 || i24 == 5 || (i24 == 4 && !this.h0)) ? false : true;
                        FrameLayout frameLayout3 = new FrameLayout(context);
                        frameLayout3.setClipChildren(false);
                        int i26 = org.telegram.ui.ActionBar.h6.d6;
                        frameLayout3.setBackgroundColor(getThemedColor(i26));
                        this.Q.addView(frameLayout3, w7.y5.n(-1, 50));
                        this.f[i24] = new EditTextBoldCursor(context);
                        this.f[i24].setTag(Integer.valueOf(i24));
                        this.f[i24].setTextSize(1, 16.0f);
                        this.f[i24].setHintTextColor(getThemedColor(org.telegram.ui.ActionBar.h6.H6));
                        EditTextBoldCursor editTextBoldCursor4 = this.f[i24];
                        int i27 = org.telegram.ui.ActionBar.h6.G6;
                        editTextBoldCursor4.setTextColor(getThemedColor(i27));
                        this.f[i24].setBackgroundDrawable(null);
                        this.f[i24].setCursorColor(getThemedColor(i27));
                        this.f[i24].setCursorSize(AndroidUtilities.dp(20.0f));
                        this.f[i24].setCursorWidth(1.5f);
                        if (i24 == 3) {
                            this.f[i24].setFilters(new InputFilter[]{new InputFilter.LengthFilter(3)});
                            this.f[i24].setInputType(130);
                            this.f[i24].setTypeface(Typeface.DEFAULT);
                            this.f[i24].setTransformationMethod(PasswordTransformationMethod.getInstance());
                        } else if (i24 == 0) {
                            this.f[i24].setInputType(3);
                        } else if (i24 == 4) {
                            final int i28 = 1;
                            this.f[i24].setOnTouchListener(new View.OnTouchListener(this) { // from class: org.telegram.ui.jn0
                                public final /* synthetic */ oo0 b;

                                {
                                    this.b = this;
                                }

                                @Override // android.view.View.OnTouchListener
                                public final boolean onTouch(View view, MotionEvent motionEvent) {
                                    switch (i28) {
                                        case 0:
                                            oo0 oo0Var = this.b;
                                            if (oo0Var.getParentActivity() != null) {
                                                if (motionEvent.getAction() == 1) {
                                                    wt wtVar = new wt(null, false);
                                                    wtVar.n = true;
                                                    wtVar.r = new mn0(oo0Var, 4);
                                                    oo0Var.presentFragment(wtVar);
                                                    break;
                                                }
                                            }
                                            break;
                                        default:
                                            oo0 oo0Var2 = this.b;
                                            if (oo0Var2.getParentActivity() != null) {
                                                if (motionEvent.getAction() == 1) {
                                                    wt wtVar2 = new wt(null, false);
                                                    wtVar2.n = true;
                                                    wtVar2.r = new mn0(oo0Var2, 2);
                                                    oo0Var2.presentFragment(wtVar2);
                                                    break;
                                                }
                                            }
                                            break;
                                    }
                                    return false;
                                }
                            });
                            this.f[i24].setInputType(0);
                        } else if (i24 == 1) {
                            this.f[i24].setInputType(16386);
                        } else if (i24 == 2) {
                            this.f[i24].setInputType(4097);
                        } else {
                            this.f[i24].setInputType(16385);
                            this.f[i24].setImeOptions(268435461);
                            if (i24 != 0) {
                                this.f[i24].setHint(LocaleController.getString(R.string.PaymentCardNumber));
                            } else if (i24 == 1) {
                                this.f[i24].setHint(LocaleController.getString(R.string.PaymentCardExpireDate));
                            } else if (i24 == 2) {
                                this.f[i24].setHint(LocaleController.getString(R.string.PaymentCardName));
                            } else if (i24 == 3) {
                                this.f[i24].setHint(LocaleController.getString(R.string.PaymentCardCvv));
                            } else if (i24 == 4) {
                                this.f[i24].setHint(LocaleController.getString(R.string.PaymentShippingCountry));
                            } else if (i24 == 5) {
                                this.f[i24].setHint(LocaleController.getString(R.string.PaymentShippingZipPlaceholder));
                            }
                            if (i24 != 0) {
                                this.f[i24].addTextChangedListener(new io0(this));
                            } else if (i24 == 1) {
                                this.f[i24].addTextChangedListener(new jo0(this));
                            }
                            this.f[i24].setPadding(0, 0, 0, AndroidUtilities.dp(6.0f));
                            this.f[i24].setGravity(!LocaleController.isRTL ? 5 : 3);
                            frameLayout3.addView(this.f[i24], w7.y5.d(-1, -2.0f, 51, 21.0f, 12.0f, 21.0f, 6.0f));
                            final int i29 = 3;
                            this.f[i24].setOnEditorActionListener(new TextView.OnEditorActionListener(this) { // from class: org.telegram.ui.kn0
                                public final /* synthetic */ oo0 b;

                                {
                                    this.b = this;
                                }

                                @Override // android.widget.TextView.OnEditorActionListener
                                public final boolean onEditorAction(TextView textView2, int i222, KeyEvent keyEvent) {
                                    EditTextBoldCursor[] editTextBoldCursorArr;
                                    switch (i29) {
                                        case 0:
                                            oo0 oo0Var = this.b;
                                            if (i222 != 6) {
                                                oo0Var.getClass();
                                                break;
                                            } else {
                                                oo0Var.A0(false);
                                                break;
                                            }
                                        case 1:
                                            oo0 oo0Var2 = this.b;
                                            if (i222 != 6) {
                                                oo0Var2.getClass();
                                                if (i222 == 5) {
                                                    int intValue = ((Integer) textView2.getTag()).intValue();
                                                    if (intValue != 0) {
                                                        if (intValue == 1) {
                                                            oo0Var2.f[2].requestFocus();
                                                            break;
                                                        }
                                                    } else {
                                                        oo0Var2.f[1].requestFocus();
                                                        break;
                                                    }
                                                }
                                            } else {
                                                oo0Var2.n.performClick();
                                                break;
                                            }
                                            break;
                                        case 2:
                                            oo0 oo0Var3 = this.b;
                                            oo0Var3.getClass();
                                            if (i222 != 5) {
                                                if (i222 == 6) {
                                                    oo0Var3.n.performClick();
                                                    break;
                                                }
                                            } else {
                                                int intValue2 = ((Integer) textView2.getTag()).intValue();
                                                while (true) {
                                                    intValue2++;
                                                    EditTextBoldCursor[] editTextBoldCursorArr2 = oo0Var3.f;
                                                    if (intValue2 >= editTextBoldCursorArr2.length) {
                                                        break;
                                                    } else if (intValue2 != 4 && ((View) editTextBoldCursorArr2[intValue2].getParent()).getVisibility() == 0) {
                                                        oo0Var3.f[intValue2].requestFocus();
                                                        break;
                                                    }
                                                }
                                            }
                                            break;
                                        case 3:
                                            oo0 oo0Var4 = this.b;
                                            oo0Var4.getClass();
                                            if (i222 != 5) {
                                                if (i222 == 6) {
                                                    oo0Var4.n.performClick();
                                                    break;
                                                }
                                            } else {
                                                int intValue3 = ((Integer) textView2.getTag()).intValue();
                                                do {
                                                    int i232 = intValue3 + 1;
                                                    editTextBoldCursorArr = oo0Var4.f;
                                                    if (i232 >= editTextBoldCursorArr.length) {
                                                        break;
                                                    } else {
                                                        intValue3 = i232 == 4 ? intValue3 + 2 : i232;
                                                    }
                                                } while (((View) editTextBoldCursorArr[intValue3].getParent()).getVisibility() != 0);
                                                oo0Var4.f[intValue3].requestFocus();
                                                break;
                                            }
                                            break;
                                        default:
                                            oo0 oo0Var5 = this.b;
                                            if (i222 != 6) {
                                                oo0Var5.getClass();
                                                break;
                                            } else {
                                                oo0Var5.n.performClick();
                                                break;
                                            }
                                    }
                                    return false;
                                }
                            });
                            if (i24 != 3) {
                                this.K[0] = new org.telegram.ui.Cells.b7(context, (Object) null);
                                this.Q.addView(this.K[0], w7.y5.n(-1, -2));
                            } else if (i24 == 5) {
                                this.K[2] = new org.telegram.ui.Cells.b7(context, (Object) null);
                                this.Q.addView(this.K[2], w7.y5.n(-1, -2));
                                org.telegram.ui.Cells.w8 w8Var3 = new org.telegram.ui.Cells.w8(context, this.Y0);
                                this.L = w8Var3;
                                w8Var3.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.K0(true));
                                this.L.f(LocaleController.getString(R.string.PaymentCardSavePaymentInformation), this.U0, false);
                                this.Q.addView(this.L, w7.y5.n(-1, -2));
                                this.L.setOnClickListener(new in0(this, 10));
                                this.M[0] = new org.telegram.ui.Cells.e9(context, this.Y0);
                                this.M[0].setBackgroundDrawable(org.telegram.ui.ActionBar.h6.V0(context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.h6.b7));
                                K0();
                                this.Q.addView(this.M[0], w7.y5.n(-1, -2));
                            } else if (i24 == 0) {
                                n0(context);
                                frameLayout3.addView(this.O, w7.y5.d(-2, -2.0f, (LocaleController.isRTL ? 3 : 5) | 16, 0.0f, 0.0f, 4.0f, 0.0f));
                            }
                            if (!z14) {
                                org.telegram.ui.Components.ln lnVar2 = new org.telegram.ui.Components.ln(context, 19);
                                lnVar2.setBackgroundColor(getThemedColor(i26));
                                this.J.add(lnVar2);
                                frameLayout3.addView(lnVar2, new FrameLayout.LayoutParams(-1, 1, 83));
                            }
                            if ((i24 == 4 && !this.g0) || ((i24 == 5 && !this.h0) || (i24 == 2 && !this.i0))) {
                                frameLayout3.setVisibility(8);
                            }
                            i24++;
                        }
                        this.f[i24].setImeOptions(268435461);
                        if (i24 != 0) {
                        }
                        if (i24 != 0) {
                        }
                        this.f[i24].setPadding(0, 0, 0, AndroidUtilities.dp(6.0f));
                        this.f[i24].setGravity(!LocaleController.isRTL ? 5 : 3);
                        frameLayout3.addView(this.f[i24], w7.y5.d(-1, -2.0f, 51, 21.0f, 12.0f, 21.0f, 6.0f));
                        final int i292 = 3;
                        this.f[i24].setOnEditorActionListener(new TextView.OnEditorActionListener(this) { // from class: org.telegram.ui.kn0
                            public final /* synthetic */ oo0 b;

                            {
                                this.b = this;
                            }

                            @Override // android.widget.TextView.OnEditorActionListener
                            public final boolean onEditorAction(TextView textView2, int i222, KeyEvent keyEvent) {
                                EditTextBoldCursor[] editTextBoldCursorArr;
                                switch (i292) {
                                    case 0:
                                        oo0 oo0Var = this.b;
                                        if (i222 != 6) {
                                            oo0Var.getClass();
                                            break;
                                        } else {
                                            oo0Var.A0(false);
                                            break;
                                        }
                                    case 1:
                                        oo0 oo0Var2 = this.b;
                                        if (i222 != 6) {
                                            oo0Var2.getClass();
                                            if (i222 == 5) {
                                                int intValue = ((Integer) textView2.getTag()).intValue();
                                                if (intValue != 0) {
                                                    if (intValue == 1) {
                                                        oo0Var2.f[2].requestFocus();
                                                        break;
                                                    }
                                                } else {
                                                    oo0Var2.f[1].requestFocus();
                                                    break;
                                                }
                                            }
                                        } else {
                                            oo0Var2.n.performClick();
                                            break;
                                        }
                                        break;
                                    case 2:
                                        oo0 oo0Var3 = this.b;
                                        oo0Var3.getClass();
                                        if (i222 != 5) {
                                            if (i222 == 6) {
                                                oo0Var3.n.performClick();
                                                break;
                                            }
                                        } else {
                                            int intValue2 = ((Integer) textView2.getTag()).intValue();
                                            while (true) {
                                                intValue2++;
                                                EditTextBoldCursor[] editTextBoldCursorArr2 = oo0Var3.f;
                                                if (intValue2 >= editTextBoldCursorArr2.length) {
                                                    break;
                                                } else if (intValue2 != 4 && ((View) editTextBoldCursorArr2[intValue2].getParent()).getVisibility() == 0) {
                                                    oo0Var3.f[intValue2].requestFocus();
                                                    break;
                                                }
                                            }
                                        }
                                        break;
                                    case 3:
                                        oo0 oo0Var4 = this.b;
                                        oo0Var4.getClass();
                                        if (i222 != 5) {
                                            if (i222 == 6) {
                                                oo0Var4.n.performClick();
                                                break;
                                            }
                                        } else {
                                            int intValue3 = ((Integer) textView2.getTag()).intValue();
                                            do {
                                                int i232 = intValue3 + 1;
                                                editTextBoldCursorArr = oo0Var4.f;
                                                if (i232 >= editTextBoldCursorArr.length) {
                                                    break;
                                                } else {
                                                    intValue3 = i232 == 4 ? intValue3 + 2 : i232;
                                                }
                                            } while (((View) editTextBoldCursorArr[intValue3].getParent()).getVisibility() != 0);
                                            oo0Var4.f[intValue3].requestFocus();
                                            break;
                                        }
                                        break;
                                    default:
                                        oo0 oo0Var5 = this.b;
                                        if (i222 != 6) {
                                            oo0Var5.getClass();
                                            break;
                                        } else {
                                            oo0Var5.n.performClick();
                                            break;
                                        }
                                }
                                return false;
                            }
                        });
                        if (i24 != 3) {
                        }
                        if (!z14) {
                        }
                        if (i24 == 4) {
                            frameLayout3.setVisibility(8);
                            i24++;
                        }
                        frameLayout3.setVisibility(8);
                        i24++;
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
            } else if (i16 == 1) {
                ArrayList<TLRPC.TL_shippingOption> arrayList = this.E0.shipping_options;
                int size = arrayList == null ? 0 : arrayList.size();
                this.h = new org.telegram.ui.Cells.k6[size];
                int i30 = 0;
                while (i30 < size) {
                    TLRPC.TL_shippingOption tL_shippingOption = this.E0.shipping_options.get(i30);
                    this.h[i30] = new org.telegram.ui.Cells.k6(context);
                    this.h[i30].setTag(Integer.valueOf(i30));
                    this.h[i30].setBackgroundDrawable(org.telegram.ui.ActionBar.h6.K0(true));
                    this.h[i30].c(a4.a.D(s0(tL_shippingOption.prices), " - ", tL_shippingOption.title), i30 == 0, i30 != size + (-1));
                    this.h[i30].setOnClickListener(new in0(this, 11));
                    this.Q.addView(this.h[i30]);
                    i30++;
                }
                this.M[0] = new org.telegram.ui.Cells.e9(context, this.Y0);
                this.M[0].setBackgroundDrawable(org.telegram.ui.ActionBar.h6.V0(context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.h6.b7));
                this.Q.addView(this.M[0], w7.y5.n(-1, -2));
            } else {
                int i31 = 13;
                if (i16 == 3) {
                    this.f = new EditTextBoldCursor[2];
                    int i32 = 0;
                    for (int i33 = 2; i32 < i33; i33 = 2) {
                        if (i32 == 0) {
                            z10 = false;
                            this.I[0] = new org.telegram.ui.Cells.m4(context, this.Y0);
                            this.I[0].setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.h6.d6));
                            this.I[0].setText(LocaleController.getString(R.string.PaymentCardTitle));
                            this.Q.addView(this.I[0], w7.y5.n(-1, -2));
                        } else {
                            z10 = false;
                        }
                        FrameLayout frameLayout4 = new FrameLayout(context);
                        frameLayout4.setClipChildren(z10);
                        this.Q.addView(frameLayout4, w7.y5.n(-1, 50));
                        int i34 = org.telegram.ui.ActionBar.h6.d6;
                        frameLayout4.setBackgroundColor(getThemedColor(i34));
                        boolean z15 = i32 != 1;
                        if (z15) {
                            if (i32 != 7 || this.C0.invoice.phone_requested) {
                                if (i32 == 6) {
                                    TLRPC.TL_invoice tL_invoice8 = this.C0.invoice;
                                    if (!tL_invoice8.phone_requested) {
                                    }
                                }
                            }
                            z15 = false;
                        }
                        if (z15) {
                            org.telegram.ui.Components.ln lnVar3 = new org.telegram.ui.Components.ln(context, i23);
                            lnVar3.setBackgroundColor(getThemedColor(i34));
                            this.J.add(lnVar3);
                            frameLayout4.addView(lnVar3, new FrameLayout.LayoutParams(-1, 1, 83));
                        }
                        this.f[i32] = new EditTextBoldCursor(context);
                        this.f[i32].setTag(Integer.valueOf(i32));
                        this.f[i32].setTextSize(1, 16.0f);
                        this.f[i32].setHintTextColor(getThemedColor(org.telegram.ui.ActionBar.h6.H6));
                        EditTextBoldCursor editTextBoldCursor5 = this.f[i32];
                        int i35 = org.telegram.ui.ActionBar.h6.G6;
                        editTextBoldCursor5.setTextColor(getThemedColor(i35));
                        this.f[i32].setBackgroundDrawable(null);
                        this.f[i32].setCursorColor(getThemedColor(i35));
                        this.f[i32].setCursorSize(AndroidUtilities.dp(20.0f));
                        this.f[i32].setCursorWidth(1.5f);
                        if (i32 == 0) {
                            this.f[i32].setOnTouchListener(new bi.d(28));
                            this.f[i32].setInputType(0);
                        } else {
                            this.f[i32].setInputType(129);
                            this.f[i32].setTypeface(Typeface.DEFAULT);
                        }
                        this.f[i32].setImeOptions(268435462);
                        if (i32 == 0) {
                            EditTextBoldCursor editTextBoldCursor6 = this.f[i32];
                            TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard = this.y0;
                            editTextBoldCursor6.setText(tL_paymentSavedCredentialsCard == null ? "" : tL_paymentSavedCredentialsCard.title);
                        } else if (i32 == 1) {
                            this.f[i32].setHint(LocaleController.getString(R.string.LoginPassword));
                            this.f[i32].requestFocus();
                        }
                        this.f[i32].setPadding(0, 0, 0, AndroidUtilities.dp(6.0f));
                        this.f[i32].setGravity(LocaleController.isRTL ? 5 : 3);
                        frameLayout4.addView(this.f[i32], w7.y5.d(-1, -2.0f, 51, 21.0f, 12.0f, 21.0f, 6.0f));
                        final int i36 = 4;
                        this.f[i32].setOnEditorActionListener(new TextView.OnEditorActionListener(this) { // from class: org.telegram.ui.kn0
                            public final /* synthetic */ oo0 b;

                            {
                                this.b = this;
                            }

                            @Override // android.widget.TextView.OnEditorActionListener
                            public final boolean onEditorAction(TextView textView2, int i222, KeyEvent keyEvent) {
                                EditTextBoldCursor[] editTextBoldCursorArr;
                                switch (i36) {
                                    case 0:
                                        oo0 oo0Var = this.b;
                                        if (i222 != 6) {
                                            oo0Var.getClass();
                                            break;
                                        } else {
                                            oo0Var.A0(false);
                                            break;
                                        }
                                    case 1:
                                        oo0 oo0Var2 = this.b;
                                        if (i222 != 6) {
                                            oo0Var2.getClass();
                                            if (i222 == 5) {
                                                int intValue = ((Integer) textView2.getTag()).intValue();
                                                if (intValue != 0) {
                                                    if (intValue == 1) {
                                                        oo0Var2.f[2].requestFocus();
                                                        break;
                                                    }
                                                } else {
                                                    oo0Var2.f[1].requestFocus();
                                                    break;
                                                }
                                            }
                                        } else {
                                            oo0Var2.n.performClick();
                                            break;
                                        }
                                        break;
                                    case 2:
                                        oo0 oo0Var3 = this.b;
                                        oo0Var3.getClass();
                                        if (i222 != 5) {
                                            if (i222 == 6) {
                                                oo0Var3.n.performClick();
                                                break;
                                            }
                                        } else {
                                            int intValue2 = ((Integer) textView2.getTag()).intValue();
                                            while (true) {
                                                intValue2++;
                                                EditTextBoldCursor[] editTextBoldCursorArr2 = oo0Var3.f;
                                                if (intValue2 >= editTextBoldCursorArr2.length) {
                                                    break;
                                                } else if (intValue2 != 4 && ((View) editTextBoldCursorArr2[intValue2].getParent()).getVisibility() == 0) {
                                                    oo0Var3.f[intValue2].requestFocus();
                                                    break;
                                                }
                                            }
                                        }
                                        break;
                                    case 3:
                                        oo0 oo0Var4 = this.b;
                                        oo0Var4.getClass();
                                        if (i222 != 5) {
                                            if (i222 == 6) {
                                                oo0Var4.n.performClick();
                                                break;
                                            }
                                        } else {
                                            int intValue3 = ((Integer) textView2.getTag()).intValue();
                                            do {
                                                int i232 = intValue3 + 1;
                                                editTextBoldCursorArr = oo0Var4.f;
                                                if (i232 >= editTextBoldCursorArr.length) {
                                                    break;
                                                } else {
                                                    intValue3 = i232 == 4 ? intValue3 + 2 : i232;
                                                }
                                            } while (((View) editTextBoldCursorArr[intValue3].getParent()).getVisibility() != 0);
                                            oo0Var4.f[intValue3].requestFocus();
                                            break;
                                        }
                                        break;
                                    default:
                                        oo0 oo0Var5 = this.b;
                                        if (i222 != 6) {
                                            oo0Var5.getClass();
                                            break;
                                        } else {
                                            oo0Var5.n.performClick();
                                            break;
                                        }
                                }
                                return false;
                            }
                        });
                        if (i32 == 1) {
                            this.M[0] = new org.telegram.ui.Cells.e9(context, this.Y0);
                            org.telegram.ui.Cells.e9 e9Var2 = this.M[0];
                            int i37 = R.string.PaymentConfirmationMessage;
                            TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard2 = this.y0;
                            e9Var2.setText(LocaleController.formatString("PaymentConfirmationMessage", i37, tL_paymentSavedCredentialsCard2 == null ? "" : tL_paymentSavedCredentialsCard2.title));
                            org.telegram.ui.Cells.e9 e9Var3 = this.M[0];
                            int i38 = R.drawable.greydivider;
                            int i39 = org.telegram.ui.ActionBar.h6.b7;
                            e9Var3.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.V0(context, i38, i39));
                            this.Q.addView(this.M[0], w7.y5.n(-1, -2));
                            this.N[0] = new org.telegram.ui.Cells.ea(context, this.Y0);
                            this.N[0].setBackgroundDrawable(org.telegram.ui.ActionBar.h6.K0(true));
                            this.N[0].b(LocaleController.getString(R.string.PaymentConfirmationNewCard), false);
                            this.Q.addView(this.N[0], w7.y5.n(-1, -2));
                            this.N[0].setOnClickListener(new in0(this, i31));
                            this.M[1] = new org.telegram.ui.Cells.e9(context, this.Y0);
                            this.M[1].setBackgroundDrawable(org.telegram.ui.ActionBar.h6.V0(context, R.drawable.greydivider_bottom, i39));
                            this.Q.addView(this.M[1], w7.y5.n(-1, -2));
                        }
                        i32++;
                        i23 = 16;
                    }
                } else if (i16 == 4 || i16 == 5) {
                    org.telegram.ui.Cells.l5 l5Var = new org.telegram.ui.Cells.l5(context);
                    this.X = l5Var;
                    l5Var.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.h6.d6));
                    MessageObject messageObject = this.N0;
                    if (messageObject != null) {
                        this.X.b((TLRPC.TL_messageMediaInvoice) messageObject.messageOwner.media, this.p0);
                    } else {
                        TLRPC.PaymentReceipt paymentReceipt = this.D0;
                        if (paymentReceipt != null) {
                            this.X.c(paymentReceipt, this.p0);
                        } else if (this.O0 != null || this.b1 != null) {
                            org.telegram.ui.Cells.l5 l5Var2 = this.X;
                            TLRPC.PaymentForm paymentForm4 = this.C0;
                            l5Var2.a(paymentForm4.title, paymentForm4.description, paymentForm4.photo, this.p0, paymentForm4);
                        }
                    }
                    this.Q.addView(this.X, w7.y5.n(-1, -2));
                    this.K[0] = new org.telegram.ui.Cells.b7(context, (Object) null);
                    this.Q.addView(this.K[0], w7.y5.n(-1, -2));
                    ArrayList arrayList2 = new ArrayList(this.C0.invoice.prices);
                    this.t0 = arrayList2;
                    TLRPC.TL_shippingOption tL_shippingOption2 = this.G0;
                    if (tL_shippingOption2 != null) {
                        arrayList2.addAll(tL_shippingOption2.prices);
                    }
                    this.R0 = new String[1];
                    for (int i40 = 0; i40 < this.t0.size(); i40++) {
                        TLRPC.TL_labeledPrice tL_labeledPrice = (TLRPC.TL_labeledPrice) this.t0.get(i40);
                        org.telegram.ui.Cells.f9 f9Var = new org.telegram.ui.Cells.f9(context);
                        f9Var.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.h6.d6));
                        f9Var.a(tL_labeledPrice.label, LocaleController.getInstance().formatCurrencyString(tL_labeledPrice.amount, this.C0.invoice.currency), false);
                        this.Q.addView(f9Var);
                    }
                    if (this.u0 == 5 && this.H0 != null) {
                        org.telegram.ui.Cells.f9 f9Var2 = new org.telegram.ui.Cells.f9(context);
                        f9Var2.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.h6.d6));
                        f9Var2.a(LocaleController.getString(R.string.PaymentTip), LocaleController.getInstance().formatCurrencyString(this.H0.longValue(), this.C0.invoice.currency), false);
                        this.Q.addView(f9Var2);
                    }
                    org.telegram.ui.Cells.f9 f9Var3 = new org.telegram.ui.Cells.f9(context);
                    this.R = f9Var3;
                    int i41 = org.telegram.ui.ActionBar.h6.d6;
                    f9Var3.setBackgroundColor(getThemedColor(i41));
                    this.R0[0] = s0(this.t0);
                    this.R.a(LocaleController.getString(R.string.PaymentTransactionTotal), this.R0[0], true);
                    float f7 = 14.0f;
                    if (this.u0 != 4 || (this.C0.invoice.flags & 256) == 0) {
                        str = "";
                    } else {
                        FrameLayout frameLayout5 = new FrameLayout(context);
                        frameLayout5.setClipChildren(false);
                        frameLayout5.setBackgroundColor(getThemedColor(i41));
                        this.Q.addView(frameLayout5, w7.y5.n(-1, this.C0.invoice.suggested_tip_amounts.isEmpty() ? 40 : 78));
                        frameLayout5.setOnClickListener(new in0(this, 14));
                        org.telegram.ui.Cells.f9 f9Var4 = new org.telegram.ui.Cells.f9(context);
                        f9Var4.setBackgroundColor(getThemedColor(i41));
                        f9Var4.a(LocaleController.getString(R.string.PaymentTipOptional), "", false);
                        frameLayout5.addView(f9Var4);
                        this.f = new EditTextBoldCursor[]{new EditTextBoldCursor(context)};
                        this.f[0].setTag(0);
                        this.f[0].setTextSize(1, 16.0f);
                        EditTextBoldCursor editTextBoldCursor7 = this.f[0];
                        int i42 = org.telegram.ui.ActionBar.h6.z6;
                        editTextBoldCursor7.setHintTextColor(getThemedColor(i42));
                        this.f[0].setTextColor(getThemedColor(i42));
                        this.f[0].setBackgroundDrawable(null);
                        this.f[0].setCursorColor(getThemedColor(org.telegram.ui.ActionBar.h6.G6));
                        this.f[0].setCursorSize(AndroidUtilities.dp(20.0f));
                        this.f[0].setCursorWidth(1.5f);
                        this.f[0].setInputType(3);
                        this.f[0].setImeOptions(268435462);
                        str = "";
                        this.f[0].setHint(LocaleController.getInstance().formatCurrencyString(0L, this.C0.invoice.currency));
                        this.f[0].setPadding(0, 0, 0, AndroidUtilities.dp(6.0f));
                        this.f[0].setGravity(LocaleController.isRTL ? 3 : 5);
                        frameLayout5.addView(this.f[0], w7.y5.d(-1, -2.0f, 51, 21.0f, 9.0f, 21.0f, 1.0f));
                        this.f[0].addTextChangedListener(new qn0(this));
                        this.f[0].setOnEditorActionListener(new org.telegram.ui.Components.r2(3));
                        this.f[0].requestFocus();
                        if (!this.C0.invoice.suggested_tip_amounts.isEmpty()) {
                            HorizontalScrollView horizontalScrollView = new HorizontalScrollView(context);
                            horizontalScrollView.setHorizontalScrollBarEnabled(false);
                            horizontalScrollView.setVerticalScrollBarEnabled(false);
                            horizontalScrollView.setClipToPadding(false);
                            horizontalScrollView.setPadding(AndroidUtilities.dp(21.0f), 0, AndroidUtilities.dp(21.0f), 0);
                            horizontalScrollView.setFillViewport(true);
                            frameLayout5.addView(horizontalScrollView, w7.y5.d(-1, 30.0f, 51, 0.0f, 44.0f, 0.0f, 0.0f));
                            int[] iArr = new int[1];
                            int[] iArr2 = new int[1];
                            int size2 = this.C0.invoice.suggested_tip_amounts.size();
                            rn0 rn0Var = new rn0(context, size2, iArr, iArr2);
                            this.s0 = rn0Var;
                            rn0Var.setOrientation(0);
                            horizontalScrollView.addView(this.s0, w7.y5.x(-1, 30, 51));
                            int themedColor = getThemedColor(org.telegram.ui.ActionBar.h6.ei);
                            int i43 = 0;
                            while (i43 < size2) {
                                long longValue = LocaleController.isRTL ? this.C0.invoice.suggested_tip_amounts.get((size2 - i43) - 1).longValue() : this.C0.invoice.suggested_tip_amounts.get(i43).longValue();
                                String formatCurrencyString = LocaleController.getInstance().formatCurrencyString(longValue, this.C0.invoice.currency);
                                TextView f10 = org.telegram.messenger.f0.f(context, 1, f7);
                                f10.setTypeface(AndroidUtilities.bold());
                                f10.setLines(1);
                                f10.setTag(Long.valueOf(longValue));
                                f10.setMaxLines(1);
                                f10.setText(formatCurrencyString);
                                f10.setPadding(AndroidUtilities.dp(15.0f), 0, AndroidUtilities.dp(15.0f), 0);
                                f10.setTextColor(getThemedColor(org.telegram.ui.ActionBar.h6.Z8));
                                f10.setBackground(org.telegram.ui.ActionBar.h6.b0(AndroidUtilities.dp(15.0f), themedColor & 536870911));
                                f10.setSingleLine(true);
                                f10.setGravity(17);
                                this.s0.addView(f10, w7.y5.t(-2, -1, 19, 0, 0, i43 != size2 + (-1) ? 9 : 0, 0));
                                int[] iArr3 = iArr2;
                                f10.setOnClickListener(new bo(this, f10, longValue, 5));
                                int dp = AndroidUtilities.dp(30.0f) + ((int) Math.ceil(f10.getPaint().measureText(formatCurrencyString)));
                                f10.setTag(R.id.width_tag, Integer.valueOf(dp));
                                iArr[0] = Math.max(iArr[0], dp);
                                iArr3[0] = iArr3[0] + dp;
                                i43++;
                                iArr2 = iArr3;
                                f7 = 14.0f;
                            }
                        }
                    }
                    this.Q.addView(this.R);
                    this.K[2] = new org.telegram.ui.Cells.b7(context, (Object) null);
                    this.K[2].setBackgroundDrawable(org.telegram.ui.ActionBar.h6.V0(context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.h6.b7));
                    this.Q.addView(this.K[2], w7.y5.n(-1, -2));
                    this.Y[0] = new sn0(context);
                    this.Y[0].setBackground(org.telegram.ui.ActionBar.h6.K0(true));
                    org.telegram.ui.Cells.d9 d9Var = this.Y[0];
                    String str13 = this.x0;
                    d9Var.b(R.drawable.msg_payment_card, (str13 == null || str13.length() <= 1) ? this.x0 : this.x0.substring(0, 1).toUpperCase() + this.x0.substring(1), LocaleController.getString(R.string.PaymentCheckoutMethod), true);
                    int i44 = ((this.V0 || this.W0) && ((str2 = this.x0) == null || str2.length() <= 1)) ? 8 : 0;
                    int i45 = 0;
                    this.Y[0].setVisibility(i44);
                    this.Q.addView(this.Y[0]);
                    if (this.u0 == 4) {
                        this.Y[0].setOnClickListener(new in0(this, i45));
                    }
                    TLRPC.User user3 = null;
                    for (int i46 = 0; i46 < this.C0.users.size(); i46++) {
                        TLRPC.User user4 = this.C0.users.get(i46);
                        if (user4.id == this.C0.provider_id) {
                            user3 = user4;
                        }
                    }
                    char c13 = 1;
                    this.Y[1] = new org.telegram.ui.Cells.d9(context);
                    this.Y[1].setBackground(org.telegram.ui.ActionBar.h6.K0(true));
                    if (user3 != null) {
                        org.telegram.ui.Cells.d9 d9Var2 = this.Y[1];
                        str3 = ContactsController.formatName(user3.first_name, user3.last_name);
                        String string = LocaleController.getString(R.string.PaymentCheckoutProvider);
                        int i47 = R.drawable.msg_payment_provider;
                        TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo = this.I0;
                        d9Var2.b(i47, str3, string, ((tL_payments_validateRequestedInfo == null || (tL_payments_validateRequestedInfo.info.shipping_address == null && this.G0 == null)) && ((tL_paymentRequestedInfo = this.C0.saved_info) == null || tL_paymentRequestedInfo.shipping_address == null)) ? false : true);
                        c13 = 1;
                        this.Q.addView(this.Y[1]);
                    } else {
                        str3 = str;
                    }
                    this.Y[c13].setVisibility(user3 != null ? i44 : 8);
                    TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo2 = this.I0;
                    if (tL_payments_validateRequestedInfo2 != null || (this.V0 && (paymentForm2 = this.C0) != null && paymentForm2.saved_info != null)) {
                        TLRPC.TL_paymentRequestedInfo tL_paymentRequestedInfo12 = tL_payments_validateRequestedInfo2 != null ? tL_payments_validateRequestedInfo2.info : this.C0.saved_info;
                        this.Y[2] = new org.telegram.ui.Cells.d9(context);
                        this.Y[2].setVisibility(8);
                        this.Q.addView(this.Y[2]);
                        if (tL_paymentRequestedInfo12.shipping_address != null) {
                            this.Y[2].setVisibility(0);
                            if (this.u0 == 4) {
                                this.Y[2].setBackgroundDrawable(org.telegram.ui.ActionBar.h6.K0(true));
                                this.Y[2].setOnClickListener(new in0(this, 1));
                            } else {
                                this.Y[2].setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.h6.d6));
                            }
                        }
                        this.Y[3] = new org.telegram.ui.Cells.d9(context);
                        this.Y[3].setVisibility(8);
                        this.Q.addView(this.Y[3]);
                        if (tL_paymentRequestedInfo12.name != null) {
                            this.Y[3].setVisibility(0);
                            if (this.u0 == 4) {
                                this.Y[3].setBackgroundDrawable(org.telegram.ui.ActionBar.h6.K0(true));
                                this.Y[3].setOnClickListener(new in0(this, 2));
                            } else {
                                this.Y[3].setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.h6.d6));
                            }
                        }
                        this.Y[4] = new org.telegram.ui.Cells.d9(context);
                        this.Y[4].setVisibility(8);
                        this.Q.addView(this.Y[4]);
                        if (tL_paymentRequestedInfo12.phone != null) {
                            this.Y[4].setVisibility(0);
                            if (this.u0 == 4) {
                                this.Y[4].setBackgroundDrawable(org.telegram.ui.ActionBar.h6.K0(true));
                                this.Y[4].setOnClickListener(new in0(this, 3));
                            } else {
                                this.Y[4].setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.h6.d6));
                            }
                        }
                        this.Y[5] = new org.telegram.ui.Cells.d9(context);
                        this.Y[5].setVisibility(8);
                        this.Q.addView(this.Y[5]);
                        if (tL_paymentRequestedInfo12.email != null) {
                            this.Y[5].setVisibility(0);
                            int i48 = 4;
                            if (this.u0 == 4) {
                                this.Y[5].setBackgroundDrawable(org.telegram.ui.ActionBar.h6.K0(true));
                                this.Y[5].setOnClickListener(new in0(this, i48));
                            } else {
                                this.Y[5].setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.h6.d6));
                            }
                        }
                        if (this.G0 != null) {
                            this.Y[6] = new org.telegram.ui.Cells.d9(context);
                            this.Y[6].setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.h6.d6));
                            this.Y[6].b(R.drawable.msg_payment_delivery, this.G0.title, LocaleController.getString(R.string.PaymentCheckoutShippingMethod), false);
                            this.Q.addView(this.Y[6]);
                        }
                        B0(tL_paymentRequestedInfo12);
                    }
                    if (this.u0 == 4) {
                        this.F = !this.V0;
                        if (this.b1 instanceof TLRPC.TL_inputInvoiceStars) {
                            this.F = true;
                        }
                        this.W = new ko0(this, context);
                        View view = new View(context);
                        view.setBackground(org.telegram.ui.ActionBar.h6.f0(getThemedColor(org.telegram.ui.ActionBar.h6.i6), 2, -1));
                        this.W.addView(view, w7.y5.c(-1.0f, -1));
                        frameLayout2.addView(this.W, w7.y5.e(-1, 48, 80));
                        this.W.setOnClickListener(new ov(24, this, str3));
                        TextView textView2 = new TextView(context);
                        this.U = textView2;
                        int i49 = org.telegram.ui.ActionBar.h6.fi;
                        textView2.setTextColor(getThemedColor(i49));
                        this.U.setText(LocaleController.formatString(R.string.PaymentCheckoutPay, this.R0[0]));
                        this.U.setTextSize(1, 14.0f);
                        this.U.setGravity(17);
                        this.U.setTypeface(AndroidUtilities.bold());
                        this.W.addView(this.U, w7.y5.c(-1.0f, -1));
                        org.telegram.ui.Components.uq uqVar2 = new org.telegram.ui.Components.uq(context, 0);
                        this.s = uqVar2;
                        uqVar2.setVisibility(4);
                        int themedColor2 = getThemedColor(i49);
                        this.s.a(805306367 & themedColor2, themedColor2);
                        this.W.addView(this.s, w7.y5.c(-1.0f, -1));
                        this.W.a(this.F, false);
                        this.U.setAlpha(!this.F ? 0.8f : 1.0f);
                        this.n.setEnabled(false);
                        this.n.getContentView().setVisibility(4);
                        AndroidUtilities.checkAndroidTheme(context, true);
                        try {
                            xn0 xn0Var = new xn0(context);
                            this.w = xn0Var;
                            xn0Var.setBackgroundColor(-1);
                            this.w.getSettings().setJavaScriptEnabled(true);
                            this.w.getSettings().setDomStorageEnabled(true);
                            this.w.getSettings().setSupportZoom(true);
                            this.w.getSettings().setBuiltInZoomControls(true);
                            this.w.getSettings().setDisplayZoomControls(false);
                            this.w.getSettings().setUseWideViewPort(true);
                            this.w.getSettings().setMixedContentMode(0);
                            CookieManager.getInstance().setAcceptThirdPartyCookies(this.w, true);
                            this.w.setWebViewClient(new yn0(this, context));
                        } catch (Exception e13) {
                            FileLog.e(e13);
                        }
                        this.V = null;
                        if (this.C0.invoice.terms_url != null) {
                            org.telegram.ui.Cells.p6 p6Var = new org.telegram.ui.Cells.p6(context, getResourceProvider());
                            this.V = p6Var;
                            p6Var.setChecked(this.F);
                            if (TextUtils.isEmpty(this.p0)) {
                                String string2 = LocaleController.getString(R.string.PaymentCheckoutAcceptRecurrentFee);
                                spannableStringBuilder = new SpannableStringBuilder(string2);
                                int indexOf = string2.indexOf(42);
                                int lastIndexOf = string2.lastIndexOf(42);
                                if (indexOf != -1 && lastIndexOf != -1) {
                                    SpannableString spannableString = new SpannableString(string2.substring(indexOf + 1, lastIndexOf));
                                    spannableString.setSpan(new org.telegram.ui.Components.z51(this.C0.invoice.terms_url), 0, spannableString.length(), 33);
                                    int i50 = lastIndexOf + 1;
                                    spannableStringBuilder.replace(indexOf, i50, (CharSequence) spannableString);
                                    string2.substring(0, indexOf);
                                    spannableString.toString();
                                    string2.substring(i50);
                                }
                            } else {
                                String string3 = LocaleController.getString(R.string.PaymentCheckoutAcceptRecurrent);
                                spannableStringBuilder = new SpannableStringBuilder(string3);
                                int indexOf2 = string3.indexOf(42);
                                int lastIndexOf2 = string3.lastIndexOf(42);
                                if (indexOf2 != -1 && lastIndexOf2 != -1) {
                                    SpannableString spannableString2 = new SpannableString(string3.substring(indexOf2 + 1, lastIndexOf2));
                                    spannableString2.setSpan(new org.telegram.ui.Components.z51(this.C0.invoice.terms_url), 0, spannableString2.length(), 33);
                                    int i51 = lastIndexOf2 + 1;
                                    spannableStringBuilder.replace(indexOf2, i51, (CharSequence) spannableString2);
                                    string3 = string3.substring(0, indexOf2) + ((Object) spannableString2) + string3.substring(i51);
                                }
                                int indexOf3 = string3.indexOf("%1$s");
                                if (indexOf3 != -1) {
                                    spannableStringBuilder.replace(indexOf3, indexOf3 + 4, (CharSequence) this.p0);
                                    spannableStringBuilder.setSpan(new org.telegram.ui.Components.s51(AndroidUtilities.bold()), indexOf3, this.p0.length() + indexOf3, 33);
                                }
                            }
                            this.V.setText(spannableStringBuilder);
                            this.V.setBackground(org.telegram.ui.ActionBar.h6.g0(getThemedColor(org.telegram.ui.ActionBar.h6.d6), getThemedColor(org.telegram.ui.ActionBar.h6.i6)));
                            this.V.setOnClickListener(new in0(this, 5));
                            frameLayout2.addView(this.V, w7.y5.d(-1, -2.0f, 80, 0.0f, 0.0f, 0.0f, 48.0f));
                        }
                        WebView webView = this.w;
                        if (webView != null) {
                            frameLayout2.addView(webView, w7.y5.c(-1.0f, -1));
                            this.w.setVisibility(8);
                        }
                    }
                    this.K[1] = new org.telegram.ui.Cells.b7(context, (Object) null);
                    this.K[1].setBackgroundDrawable(org.telegram.ui.ActionBar.h6.V0(context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.h6.b7));
                    if (i44 != 0 && this.u0 == 4 && this.I0 == null && ((paymentForm = this.C0) == null || paymentForm.saved_info == null)) {
                        c10 = 1;
                        this.K[1].setVisibility(i44);
                    } else {
                        c10 = 1;
                    }
                    this.Q.addView(this.K[c10], w7.y5.n(-1, -2));
                } else if (i16 == 6) {
                    org.telegram.ui.Cells.k3 k3Var = new org.telegram.ui.Cells.k3(context);
                    this.S = k3Var;
                    String string4 = LocaleController.getString(R.string.PasswordCode);
                    EditTextBoldCursor editTextBoldCursor8 = k3Var.a;
                    editTextBoldCursor8.setText("");
                    editTextBoldCursor8.setHint(string4);
                    final int i52 = 0;
                    k3Var.b = false;
                    k3Var.setWillNotDraw(true);
                    this.S.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.h6.d6));
                    EditTextBoldCursor textView3 = this.S.getTextView();
                    textView3.setInputType(3);
                    textView3.setImeOptions(6);
                    textView3.setOnEditorActionListener(new TextView.OnEditorActionListener(this) { // from class: org.telegram.ui.kn0
                        public final /* synthetic */ oo0 b;

                        {
                            this.b = this;
                        }

                        @Override // android.widget.TextView.OnEditorActionListener
                        public final boolean onEditorAction(TextView textView22, int i222, KeyEvent keyEvent) {
                            EditTextBoldCursor[] editTextBoldCursorArr;
                            switch (i52) {
                                case 0:
                                    oo0 oo0Var = this.b;
                                    if (i222 != 6) {
                                        oo0Var.getClass();
                                        break;
                                    } else {
                                        oo0Var.A0(false);
                                        break;
                                    }
                                case 1:
                                    oo0 oo0Var2 = this.b;
                                    if (i222 != 6) {
                                        oo0Var2.getClass();
                                        if (i222 == 5) {
                                            int intValue = ((Integer) textView22.getTag()).intValue();
                                            if (intValue != 0) {
                                                if (intValue == 1) {
                                                    oo0Var2.f[2].requestFocus();
                                                    break;
                                                }
                                            } else {
                                                oo0Var2.f[1].requestFocus();
                                                break;
                                            }
                                        }
                                    } else {
                                        oo0Var2.n.performClick();
                                        break;
                                    }
                                    break;
                                case 2:
                                    oo0 oo0Var3 = this.b;
                                    oo0Var3.getClass();
                                    if (i222 != 5) {
                                        if (i222 == 6) {
                                            oo0Var3.n.performClick();
                                            break;
                                        }
                                    } else {
                                        int intValue2 = ((Integer) textView22.getTag()).intValue();
                                        while (true) {
                                            intValue2++;
                                            EditTextBoldCursor[] editTextBoldCursorArr2 = oo0Var3.f;
                                            if (intValue2 >= editTextBoldCursorArr2.length) {
                                                break;
                                            } else if (intValue2 != 4 && ((View) editTextBoldCursorArr2[intValue2].getParent()).getVisibility() == 0) {
                                                oo0Var3.f[intValue2].requestFocus();
                                                break;
                                            }
                                        }
                                    }
                                    break;
                                case 3:
                                    oo0 oo0Var4 = this.b;
                                    oo0Var4.getClass();
                                    if (i222 != 5) {
                                        if (i222 == 6) {
                                            oo0Var4.n.performClick();
                                            break;
                                        }
                                    } else {
                                        int intValue3 = ((Integer) textView22.getTag()).intValue();
                                        do {
                                            int i232 = intValue3 + 1;
                                            editTextBoldCursorArr = oo0Var4.f;
                                            if (i232 >= editTextBoldCursorArr.length) {
                                                break;
                                            } else {
                                                intValue3 = i232 == 4 ? intValue3 + 2 : i232;
                                            }
                                        } while (((View) editTextBoldCursorArr[intValue3].getParent()).getVisibility() != 0);
                                        oo0Var4.f[intValue3].requestFocus();
                                        break;
                                    }
                                    break;
                                default:
                                    oo0 oo0Var5 = this.b;
                                    if (i222 != 6) {
                                        oo0Var5.getClass();
                                        break;
                                    } else {
                                        oo0Var5.n.performClick();
                                        break;
                                    }
                            }
                            return false;
                        }
                    });
                    textView3.addTextChangedListener(new m0(this, i31));
                    this.Q.addView(this.S, w7.y5.n(-1, -2));
                    this.M[2] = new org.telegram.ui.Cells.e9(context, this.Y0);
                    this.M[2].setBackgroundDrawable(org.telegram.ui.ActionBar.h6.V0(context, R.drawable.greydivider, org.telegram.ui.ActionBar.h6.b7));
                    this.Q.addView(this.M[2], w7.y5.n(-1, -2));
                    this.N[1] = new org.telegram.ui.Cells.ea(context, this.Y0);
                    this.N[1].setBackgroundDrawable(org.telegram.ui.ActionBar.h6.K0(true));
                    org.telegram.ui.Cells.ea eaVar = this.N[1];
                    int i53 = org.telegram.ui.ActionBar.h6.G6;
                    eaVar.setTag(Integer.valueOf(i53));
                    this.N[1].setTextColor(getThemedColor(i53));
                    this.N[1].b(LocaleController.getString(R.string.ResendCode), true);
                    this.Q.addView(this.N[1], w7.y5.n(-1, -2));
                    this.N[1].setOnClickListener(new in0(this, 6));
                    this.N[0] = new org.telegram.ui.Cells.ea(context, this.Y0);
                    this.N[0].setBackgroundDrawable(org.telegram.ui.ActionBar.h6.K0(true));
                    org.telegram.ui.Cells.ea eaVar2 = this.N[0];
                    int i54 = org.telegram.ui.ActionBar.h6.p7;
                    eaVar2.setTag(Integer.valueOf(i54));
                    this.N[0].setTextColor(getThemedColor(i54));
                    this.N[0].b(LocaleController.getString(R.string.AbortPassword), false);
                    this.Q.addView(this.N[0], w7.y5.n(-1, -2));
                    this.N[0].setOnClickListener(new in0(this, 7));
                    this.f = new EditTextBoldCursor[3];
                    int i55 = 0;
                    for (int i56 = 3; i55 < i56; i56 = 3) {
                        if (i55 == 0) {
                            this.I[0] = new org.telegram.ui.Cells.m4(context, this.Y0);
                            this.I[0].setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.h6.d6));
                            this.I[0].setText(LocaleController.getString(R.string.PaymentPasswordTitle));
                            this.Q.addView(this.I[0], w7.y5.n(-1, -2));
                        } else if (i55 == 2) {
                            this.I[1] = new org.telegram.ui.Cells.m4(context, this.Y0);
                            this.I[1].setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.h6.d6));
                            this.I[1].setText(LocaleController.getString(R.string.PaymentPasswordEmailTitle));
                            this.Q.addView(this.I[1], w7.y5.n(-1, -2));
                        }
                        FrameLayout frameLayout6 = new FrameLayout(context);
                        frameLayout6.setClipChildren(false);
                        this.Q.addView(frameLayout6, w7.y5.n(-1, 50));
                        int i57 = org.telegram.ui.ActionBar.h6.d6;
                        frameLayout6.setBackgroundColor(getThemedColor(i57));
                        if (i55 == 0) {
                            org.telegram.ui.Components.ln lnVar4 = new org.telegram.ui.Components.ln(context, 17);
                            lnVar4.setBackgroundColor(getThemedColor(i57));
                            this.J.add(lnVar4);
                            frameLayout6.addView(lnVar4, new FrameLayout.LayoutParams(-1, 1, 83));
                        }
                        this.f[i55] = new EditTextBoldCursor(context);
                        this.f[i55].setTag(Integer.valueOf(i55));
                        this.f[i55].setTextSize(1, 16.0f);
                        this.f[i55].setHintTextColor(getThemedColor(org.telegram.ui.ActionBar.h6.H6));
                        EditTextBoldCursor editTextBoldCursor9 = this.f[i55];
                        int i58 = org.telegram.ui.ActionBar.h6.G6;
                        editTextBoldCursor9.setTextColor(getThemedColor(i58));
                        this.f[i55].setBackgroundDrawable(null);
                        this.f[i55].setCursorColor(getThemedColor(i58));
                        this.f[i55].setCursorSize(AndroidUtilities.dp(20.0f));
                        this.f[i55].setCursorWidth(1.5f);
                        if (i55 == 0 || i55 == 1) {
                            this.f[i55].setInputType(129);
                            this.f[i55].setTypeface(Typeface.DEFAULT);
                            this.f[i55].setImeOptions(268435461);
                        } else {
                            this.f[i55].setInputType(33);
                            this.f[i55].setImeOptions(268435462);
                        }
                        if (i55 == 0) {
                            this.f[i55].setHint(LocaleController.getString(R.string.PaymentPasswordEnter));
                            this.f[i55].requestFocus();
                        } else if (i55 == 1) {
                            this.f[i55].setHint(LocaleController.getString(R.string.PaymentPasswordReEnter));
                        } else if (i55 == 2) {
                            this.f[i55].setHint(LocaleController.getString(R.string.PaymentPasswordEmail));
                        }
                        this.f[i55].setPadding(0, 0, 0, AndroidUtilities.dp(6.0f));
                        this.f[i55].setGravity(LocaleController.isRTL ? 5 : 3);
                        frameLayout6.addView(this.f[i55], w7.y5.d(-1, -2.0f, 51, 21.0f, 12.0f, 21.0f, 6.0f));
                        final int i59 = 1;
                        this.f[i55].setOnEditorActionListener(new TextView.OnEditorActionListener(this) { // from class: org.telegram.ui.kn0
                            public final /* synthetic */ oo0 b;

                            {
                                this.b = this;
                            }

                            @Override // android.widget.TextView.OnEditorActionListener
                            public final boolean onEditorAction(TextView textView22, int i222, KeyEvent keyEvent) {
                                EditTextBoldCursor[] editTextBoldCursorArr;
                                switch (i59) {
                                    case 0:
                                        oo0 oo0Var = this.b;
                                        if (i222 != 6) {
                                            oo0Var.getClass();
                                            break;
                                        } else {
                                            oo0Var.A0(false);
                                            break;
                                        }
                                    case 1:
                                        oo0 oo0Var2 = this.b;
                                        if (i222 != 6) {
                                            oo0Var2.getClass();
                                            if (i222 == 5) {
                                                int intValue = ((Integer) textView22.getTag()).intValue();
                                                if (intValue != 0) {
                                                    if (intValue == 1) {
                                                        oo0Var2.f[2].requestFocus();
                                                        break;
                                                    }
                                                } else {
                                                    oo0Var2.f[1].requestFocus();
                                                    break;
                                                }
                                            }
                                        } else {
                                            oo0Var2.n.performClick();
                                            break;
                                        }
                                        break;
                                    case 2:
                                        oo0 oo0Var3 = this.b;
                                        oo0Var3.getClass();
                                        if (i222 != 5) {
                                            if (i222 == 6) {
                                                oo0Var3.n.performClick();
                                                break;
                                            }
                                        } else {
                                            int intValue2 = ((Integer) textView22.getTag()).intValue();
                                            while (true) {
                                                intValue2++;
                                                EditTextBoldCursor[] editTextBoldCursorArr2 = oo0Var3.f;
                                                if (intValue2 >= editTextBoldCursorArr2.length) {
                                                    break;
                                                } else if (intValue2 != 4 && ((View) editTextBoldCursorArr2[intValue2].getParent()).getVisibility() == 0) {
                                                    oo0Var3.f[intValue2].requestFocus();
                                                    break;
                                                }
                                            }
                                        }
                                        break;
                                    case 3:
                                        oo0 oo0Var4 = this.b;
                                        oo0Var4.getClass();
                                        if (i222 != 5) {
                                            if (i222 == 6) {
                                                oo0Var4.n.performClick();
                                                break;
                                            }
                                        } else {
                                            int intValue3 = ((Integer) textView22.getTag()).intValue();
                                            do {
                                                int i232 = intValue3 + 1;
                                                editTextBoldCursorArr = oo0Var4.f;
                                                if (i232 >= editTextBoldCursorArr.length) {
                                                    break;
                                                } else {
                                                    intValue3 = i232 == 4 ? intValue3 + 2 : i232;
                                                }
                                            } while (((View) editTextBoldCursorArr[intValue3].getParent()).getVisibility() != 0);
                                            oo0Var4.f[intValue3].requestFocus();
                                            break;
                                        }
                                        break;
                                    default:
                                        oo0 oo0Var5 = this.b;
                                        if (i222 != 6) {
                                            oo0Var5.getClass();
                                            break;
                                        } else {
                                            oo0Var5.n.performClick();
                                            break;
                                        }
                                }
                                return false;
                            }
                        });
                        if (i55 == 1) {
                            this.M[0] = new org.telegram.ui.Cells.e9(context, this.Y0);
                            this.M[0].setText(LocaleController.getString(R.string.PaymentPasswordInfo));
                            this.M[0].setBackgroundDrawable(org.telegram.ui.ActionBar.h6.V0(context, R.drawable.greydivider, org.telegram.ui.ActionBar.h6.b7));
                            this.Q.addView(this.M[0], w7.y5.n(-1, -2));
                        } else if (i55 == 2) {
                            this.M[1] = new org.telegram.ui.Cells.e9(context, this.Y0);
                            this.M[1].setText(LocaleController.getString(R.string.PaymentPasswordEmailInfo));
                            this.M[1].setBackgroundDrawable(org.telegram.ui.ActionBar.h6.V0(context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.h6.b7));
                            this.Q.addView(this.M[1], w7.y5.n(-1, -2));
                        }
                        i55++;
                    }
                    J0();
                }
            }
        }
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.twoStepPasswordChanged) {
            TLRPC.PaymentForm paymentForm = this.C0;
            paymentForm.password_missing = false;
            paymentForm.can_save_credentials = true;
            K0();
            return;
        }
        if (i10 == NotificationCenter.didRemoveTwoStepPassword) {
            TLRPC.PaymentForm paymentForm2 = this.C0;
            paymentForm2.password_missing = true;
            paymentForm2.can_save_credentials = false;
            K0();
            return;
        }
        if (i10 == NotificationCenter.paymentFinished) {
            this.a1 = true;
            removeSelfFromStack();
        }
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final org.telegram.ui.ActionBar.d6 getResourceProvider() {
        return this.Y0;
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.h6.a7));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.h6.s8;
        arrayList.add(new org.telegram.ui.ActionBar.j6(kVar, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.E, 32768, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.h6.v8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.h6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.h6.t8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, TLObject.FLAG_27, null, null, null, null, org.telegram.ui.ActionBar.h6.C8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 67108864, null, null, null, null, org.telegram.ui.ActionBar.h6.D8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.Q, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.h6.k0, null, null, org.telegram.ui.ActionBar.h6.d7));
        org.telegram.ui.Components.uq uqVar = this.r;
        int i11 = org.telegram.ui.ActionBar.h6.D7;
        arrayList.add(new org.telegram.ui.ActionBar.j6(uqVar, 0, null, null, null, null, i11));
        org.telegram.ui.Components.uq uqVar2 = this.r;
        int i12 = org.telegram.ui.ActionBar.h6.E7;
        arrayList.add(new org.telegram.ui.ActionBar.j6(uqVar2, 0, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.s, 0, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.s, 0, null, null, null, null, i12));
        if (this.f != null) {
            int i13 = 0;
            while (true) {
                EditTextBoldCursor[] editTextBoldCursorArr = this.f;
                if (i13 >= editTextBoldCursorArr.length) {
                    break;
                }
                arrayList.add(new org.telegram.ui.ActionBar.j6((View) editTextBoldCursorArr[i13].getParent(), 1, null, null, null, null, org.telegram.ui.ActionBar.h6.d6));
                arrayList.add(new org.telegram.ui.ActionBar.j6(this.f[i13], 4, null, null, null, null, org.telegram.ui.ActionBar.h6.G6));
                arrayList.add(new org.telegram.ui.ActionBar.j6(this.f[i13], TLObject.FLAG_23, null, null, null, null, org.telegram.ui.ActionBar.h6.H6));
                i13++;
            }
        } else {
            arrayList.add(new org.telegram.ui.ActionBar.j6(null, 4, null, null, null, null, org.telegram.ui.ActionBar.h6.G6));
            arrayList.add(new org.telegram.ui.ActionBar.j6(null, TLObject.FLAG_23, null, null, null, null, org.telegram.ui.ActionBar.h6.H6));
        }
        if (this.h != null) {
            int i14 = 0;
            while (true) {
                org.telegram.ui.Cells.k6[] k6VarArr = this.h;
                if (i14 >= k6VarArr.length) {
                    break;
                }
                arrayList.add(new org.telegram.ui.ActionBar.j6(k6VarArr[i14], TLObject.FLAG_28, null, null, null, null, org.telegram.ui.ActionBar.h6.d6));
                arrayList.add(new org.telegram.ui.ActionBar.j6(this.h[i14], TLObject.FLAG_28, null, null, null, null, org.telegram.ui.ActionBar.h6.i6));
                arrayList.add(new org.telegram.ui.ActionBar.j6(this.h[i14], 0, new Class[]{org.telegram.ui.Cells.k6.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.G6));
                arrayList.add(new org.telegram.ui.ActionBar.j6(this.h[i14], 8192, new Class[]{org.telegram.ui.Cells.k6.class}, new String[]{"radioButton"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.g7));
                arrayList.add(new org.telegram.ui.ActionBar.j6(this.h[i14], 16384, new Class[]{org.telegram.ui.Cells.k6.class}, new String[]{"radioButton"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.h7));
                i14++;
            }
        } else {
            arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, new Class[]{org.telegram.ui.Cells.k6.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.G6));
            arrayList.add(new org.telegram.ui.ActionBar.j6(null, 8192, new Class[]{org.telegram.ui.Cells.k6.class}, new String[]{"radioButton"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.g7));
            arrayList.add(new org.telegram.ui.ActionBar.j6(null, 16384, new Class[]{org.telegram.ui.Cells.k6.class}, new String[]{"radioButton"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.h7));
        }
        int i15 = 0;
        while (true) {
            org.telegram.ui.Cells.m4[] m4VarArr = this.I;
            if (i15 >= m4VarArr.length) {
                break;
            }
            arrayList.add(new org.telegram.ui.ActionBar.j6(m4VarArr[i15], 1, null, null, null, null, org.telegram.ui.ActionBar.h6.d6));
            arrayList.add(new org.telegram.ui.ActionBar.j6(m4VarArr[i15], 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.L6));
            i15++;
        }
        int i16 = 0;
        while (true) {
            org.telegram.ui.Cells.b7[] b7VarArr = this.K;
            if (i16 >= b7VarArr.length) {
                break;
            }
            arrayList.add(new org.telegram.ui.ActionBar.j6(b7VarArr[i16], 32, new Class[]{org.telegram.ui.Cells.b7.class}, null, null, null, org.telegram.ui.ActionBar.h6.b7));
            i16++;
        }
        int i17 = 0;
        while (true) {
            org.telegram.ui.Cells.e9[] e9VarArr = this.M;
            if (i17 >= e9VarArr.length) {
                break;
            }
            arrayList.add(new org.telegram.ui.ActionBar.j6(e9VarArr[i17], 32, new Class[]{org.telegram.ui.Cells.e9.class}, null, null, null, org.telegram.ui.ActionBar.h6.b7));
            arrayList.add(new org.telegram.ui.ActionBar.j6(e9VarArr[i17], 0, new Class[]{org.telegram.ui.Cells.e9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.B6));
            arrayList.add(new org.telegram.ui.ActionBar.j6(e9VarArr[i17], 2, new Class[]{org.telegram.ui.Cells.e9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.J6));
            i17++;
        }
        int i18 = 0;
        while (true) {
            ArrayList arrayList2 = this.J;
            if (i18 >= arrayList2.size()) {
                break;
            }
            arrayList.add(new org.telegram.ui.ActionBar.j6((View) arrayList2.get(i18), 1, null, null, null, null, org.telegram.ui.ActionBar.h6.d6));
            i18++;
        }
        org.telegram.ui.Cells.k3 k3Var = this.S;
        int i19 = org.telegram.ui.ActionBar.h6.d6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(k3Var, 1, null, null, null, null, i19));
        int i20 = org.telegram.ui.ActionBar.h6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.S, 4, new Class[]{org.telegram.ui.Cells.k3.class}, new String[]{"textView"}, null, null, -1, null, i20));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.S, TLObject.FLAG_23, new Class[]{org.telegram.ui.Cells.k3.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.H6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.H, 4, null, null, null, null, i20));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.L, 0, new Class[]{org.telegram.ui.Cells.w8.class}, new String[]{"textView"}, null, null, -1, null, i20));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.L, 0, new Class[]{org.telegram.ui.Cells.w8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.M6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.L, 0, new Class[]{org.telegram.ui.Cells.w8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.N6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.L, TLObject.FLAG_28, null, null, null, null, i19));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.L, TLObject.FLAG_28, null, null, null, null, org.telegram.ui.ActionBar.h6.i6));
        int i21 = 0;
        while (true) {
            org.telegram.ui.Cells.ea[] eaVarArr = this.N;
            if (i21 >= eaVarArr.length) {
                break;
            }
            arrayList.add(new org.telegram.ui.ActionBar.j6(eaVarArr[i21], TLObject.FLAG_28, null, null, null, null, org.telegram.ui.ActionBar.h6.d6));
            arrayList.add(new org.telegram.ui.ActionBar.j6(eaVarArr[i21], TLObject.FLAG_28, null, null, null, null, org.telegram.ui.ActionBar.h6.i6));
            arrayList.add(new org.telegram.ui.ActionBar.j6(eaVarArr[i21], 0, new Class[]{org.telegram.ui.Cells.ea.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.G6));
            i21++;
        }
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.U, 4, null, null, null, null, org.telegram.ui.ActionBar.h6.s6));
        int i22 = org.telegram.ui.ActionBar.h6.d6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.Q, 16, new Class[]{org.telegram.ui.Cells.f9.class}, null, null, null, i22));
        int i23 = org.telegram.ui.ActionBar.h6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.Q, 262144, new Class[]{org.telegram.ui.Cells.f9.class}, new String[]{"textView"}, null, null, -1, null, i23));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.Q, 262144, new Class[]{org.telegram.ui.Cells.f9.class}, new String[]{"valueTextView"}, null, null, -1, null, i23));
        int i24 = org.telegram.ui.ActionBar.h6.z6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.Q, 262144, new Class[]{org.telegram.ui.Cells.f9.class}, new String[]{"textView"}, null, null, -1, null, i24));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.Q, 262144, new Class[]{org.telegram.ui.Cells.f9.class}, new String[]{"valueTextView"}, null, null, -1, null, i24));
        org.telegram.ui.Cells.d9[] d9VarArr = this.Y;
        arrayList.add(new org.telegram.ui.ActionBar.j6(d9VarArr[0], TLObject.FLAG_28, null, null, null, null, i22));
        arrayList.add(new org.telegram.ui.ActionBar.j6(d9VarArr[0], TLObject.FLAG_28, null, null, null, null, org.telegram.ui.ActionBar.h6.i6));
        for (int i25 = 1; i25 < d9VarArr.length; i25++) {
            arrayList.add(new org.telegram.ui.ActionBar.j6(d9VarArr[i25], 1, null, null, null, null, org.telegram.ui.ActionBar.h6.d6));
            arrayList.add(new org.telegram.ui.ActionBar.j6(d9VarArr[i25], 0, new Class[]{org.telegram.ui.Cells.d9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.G6));
            arrayList.add(new org.telegram.ui.ActionBar.j6(d9VarArr[i25], 0, new Class[]{org.telegram.ui.Cells.d9.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.z6));
        }
        org.telegram.ui.Cells.l5 l5Var = this.X;
        int i26 = org.telegram.ui.ActionBar.h6.d6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(l5Var, 1, null, null, null, null, i26));
        int i27 = org.telegram.ui.ActionBar.h6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.X, 0, new Class[]{org.telegram.ui.Cells.l5.class}, new String[]{"nameTextView"}, null, null, -1, null, i27));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.X, 0, new Class[]{org.telegram.ui.Cells.l5.class}, new String[]{"detailTextView"}, null, null, -1, null, i27));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.X, 0, new Class[]{org.telegram.ui.Cells.l5.class}, new String[]{"detailExTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.z6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.W, TLObject.FLAG_28, null, null, null, null, i26));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.W, TLObject.FLAG_28, null, null, null, null, org.telegram.ui.ActionBar.h6.i6));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return this.G;
    }

    public final void n0(Context context) {
        FrameLayout frameLayout = new FrameLayout(context);
        this.O = frameLayout;
        frameLayout.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.K0(true));
        this.O.setVisibility(8);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.P = frameLayout2;
        frameLayout2.setClickable(true);
        this.P.setFocusable(true);
        this.P.setBackgroundResource(R.drawable.googlepay_button_no_shadow_background);
        if (this.K0 == null) {
            this.P.setPadding(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(2.0f));
        } else {
            this.P.setPadding(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f));
        }
        this.O.addView(this.P, w7.y5.c(48.0f, -1));
        this.P.setOnClickListener(new in0(this, 12));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setWeightSum(2.0f);
        linearLayout.setGravity(16);
        linearLayout.setOrientation(1);
        linearLayout.setDuplicateParentStateEnabled(true);
        this.P.addView(linearLayout, w7.y5.c(-1.0f, -1));
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageView.setDuplicateParentStateEnabled(true);
        imageView.setImageResource(R.drawable.buy_with_googlepay_button_content);
        linearLayout.addView(imageView, w7.y5.l(1.0f, -1, 0));
        ImageView imageView2 = new ImageView(context);
        imageView2.setScaleType(ImageView.ScaleType.FIT_XY);
        imageView2.setDuplicateParentStateEnabled(true);
        imageView2.setImageResource(R.drawable.googlepay_button_overlay);
        this.P.addView(imageView2, w7.y5.c(-1.0f, -1));
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x003a A[Catch: Exception -> 0x001a, TryCatch #0 {Exception -> 0x001a, blocks: (B:2:0x0000, B:4:0x000d, B:6:0x0013, B:12:0x001d, B:14:0x0024, B:22:0x003a, B:23:0x0042, B:25:0x0048, B:29:0x0054, B:33:0x0062, B:35:0x0075, B:31:0x006f, B:39:0x0086), top: B:1:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0048 A[Catch: Exception -> 0x001a, TryCatch #0 {Exception -> 0x001a, blocks: (B:2:0x0000, B:4:0x000d, B:6:0x0013, B:12:0x001d, B:14:0x0024, B:22:0x003a, B:23:0x0042, B:25:0x0048, B:29:0x0054, B:33:0x0062, B:35:0x0075, B:31:0x006f, B:39:0x0086), top: B:1:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void o0(String str) {
        boolean z10;
        boolean z11;
        try {
            TelephonyManager telephonyManager = (TelephonyManager) ApplicationLoader.applicationContext.getSystemService("phone");
            if (str == null && (telephonyManager.getSimState() == 1 || telephonyManager.getPhoneType() == 0)) {
                return;
            }
            if (Build.VERSION.SDK_INT >= 23 && getParentActivity().checkSelfPermission("android.permission.READ_PHONE_STATE") != 0) {
                z10 = false;
                if (str == null || z10) {
                    if (str == null) {
                        str = gf.b.d(telephonyManager.getLine1Number(), false);
                    }
                    if (TextUtils.isEmpty(str)) {
                        int i10 = 4;
                        String str2 = null;
                        if (str.length() > 4) {
                            while (true) {
                                if (i10 < 1) {
                                    z11 = false;
                                    break;
                                }
                                String substring = str.substring(0, i10);
                                if (((String) this.c.get(substring)) != null) {
                                    str2 = str.substring(i10);
                                    this.f[8].setText(substring);
                                    z11 = true;
                                    break;
                                }
                                i10--;
                            }
                            if (!z11) {
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
            z10 = true;
            if (str == null) {
            }
            if (str == null) {
            }
            if (TextUtils.isEmpty(str)) {
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final void onActivityResultFragment(int i10, int i11, Intent intent) {
        if (i10 == 991) {
            AndroidUtilities.runOnUIThread(new wl0(this, i11, intent, 1));
        }
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final boolean onBackPressed(boolean z10) {
        WebView webView = this.w;
        if (webView == null || !this.y) {
            return !this.P0;
        }
        if (z10) {
            webView.loadUrl(this.x);
            this.y = false;
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        if (this.u0 == 4 && this.X0) {
            this.X0 = false;
            this.W.callOnClick();
        }
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final boolean onFragmentCreate() {
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.twoStepPasswordChanged);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.didRemoveTwoStepPassword);
        if (this.u0 != 4 || this.V0) {
            NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.paymentFinished);
        }
        return super.onFragmentCreate();
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00c4, code lost:
    
        if (r0 != 6) goto L58;
     */
    @Override // org.telegram.ui.ActionBar.m2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onFragmentDestroy() {
        mo0 mo0Var = this.T;
        if (mo0Var != null) {
            mo0Var.b();
        }
        int i10 = 0;
        AndroidUtilities.checkAndroidTheme(getParentActivity(), false);
        if (!this.a1) {
            this.f1 = 2;
            if (this.Z0 != null) {
                org.telegram.ui.ActionBar.b5 b5Var = this.parentLayout;
                if (b5Var != null && b5Var.getFragmentStack() != null) {
                    int indexOf = this.parentLayout.getFragmentStack().indexOf(this);
                    if (indexOf == -1) {
                        indexOf = this.parentLayout.getFragmentStack().size();
                    }
                    while (true) {
                        if (i10 >= this.parentLayout.getFragmentStack().size()) {
                            i10 = indexOf;
                            break;
                        } else if (((org.telegram.ui.ActionBar.m2) this.parentLayout.getFragmentStack().get(i10)) instanceof oo0) {
                            break;
                        } else {
                            i10++;
                        }
                    }
                    i10 -= indexOf;
                }
                if (i10 == 0) {
                    this.Z0.a(this.f1);
                }
            }
        }
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.twoStepPasswordChanged);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.didRemoveTwoStepPassword);
        if (this.u0 != 4 || this.V0) {
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
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
        try {
            int i11 = this.u0;
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
        this.Q0 = true;
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final void onResume() {
        super.onResume();
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
        if (Build.VERSION.SDK_INT >= 23) {
            try {
                int i10 = this.u0;
                if ((i10 == 2 || i10 == 6) && !this.C0.invoice.test) {
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

    @Override // org.telegram.ui.ActionBar.m2
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (!z10 || z11) {
            return;
        }
        WebView webView = this.w;
        if (webView != null) {
            if (this.u0 != 4) {
                TLRPC.TL_paymentFormMethod tL_paymentFormMethod = this.F0;
                if (tL_paymentFormMethod != null) {
                    String str = tL_paymentFormMethod.url;
                    this.x = str;
                    webView.loadUrl(str);
                    return;
                } else {
                    String str2 = this.C0.url;
                    this.x = str2;
                    webView.loadUrl(str2);
                    return;
                }
            }
            return;
        }
        int i10 = this.u0;
        if (i10 == 2) {
            AndroidUtilities.runOnUIThread(new ln0(this, 0), 100L);
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
        if (i10 != 6 || this.b0) {
            return;
        }
        this.f[0].requestFocus();
        AndroidUtilities.showKeyboard(this.f[0]);
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final boolean presentFragment(org.telegram.ui.ActionBar.m2 m2Var) {
        y0(m2Var);
        return super.presentFragment(m2Var);
    }

    public final long q0() {
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

    public final long r0() {
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
        return DialogObject.getPeerDialogId(inputPeer);
    }

    public final String s0(ArrayList arrayList) {
        long j3 = 0;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            j3 += ((TLRPC.TL_labeledPrice) arrayList.get(i10)).amount;
        }
        Long l4 = this.H0;
        if (l4 != null) {
            j3 += l4.longValue();
        }
        return LocaleController.getInstance().formatCurrencyString(j3, this.C0.invoice.currency);
    }

    public final void t0() {
        int i10;
        int i11;
        boolean z10;
        int i12 = this.u0;
        if (i12 == 0) {
            mo0 mo0Var = this.T;
            if (mo0Var != null) {
                mo0Var.d(this.I0);
                finishFragment();
                return;
            }
            if (this.C0.invoice.flexible) {
                i10 = 1;
            } else if (this.y0 == null && this.w0 == null) {
                i10 = 2;
            } else {
                if (UserConfig.getInstance(this.currentAccount).tmpPassword != null && UserConfig.getInstance(this.currentAccount).tmpPassword.valid_until < ConnectionsManager.getInstance(this.currentAccount).getCurrentTime() + 60) {
                    UserConfig.getInstance(this.currentAccount).tmpPassword = null;
                    UserConfig.getInstance(this.currentAccount).saveConfig(false);
                }
                i10 = UserConfig.getInstance(this.currentAccount).tmpPassword != null ? 4 : 3;
            }
            if (i10 == 2 && this.y0 == null && this.w0 == null && !this.C0.additional_methods.isEmpty()) {
                G0(new ln0(this, 1));
                return;
            }
            oo0 oo0Var = new oo0(this.b1, this.C0, this.N0, this.O0, i10, this.E0, null, null, this.w0, this.x0, this.I0, this.U0, this.J0, this.r0, this.W0);
            oo0Var.c1 = this.c1;
            oo0Var.d1 = this.d1;
            presentFragment(oo0Var, this.S0);
            return;
        }
        if (i12 == 1) {
            if (this.w0 == null && this.x0 == null) {
                if (this.y0 != null) {
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
                if (i11 != 2 && this.x0 == null && this.y0 == null && this.w0 == null && !this.C0.additional_methods.isEmpty()) {
                    G0(new ln0(this, 1));
                    return;
                }
                oo0 oo0Var2 = new oo0(this.b1, this.C0, this.N0, this.O0, i11, this.E0, this.G0, this.H0, this.w0, this.x0, this.I0, this.U0, this.J0, this.r0, this.W0);
                oo0Var2.c1 = this.c1;
                oo0Var2.d1 = this.d1;
                presentFragment(oo0Var2, this.S0);
                return;
            }
            i11 = 4;
            if (i11 != 2) {
            }
            oo0 oo0Var22 = new oo0(this.b1, this.C0, this.N0, this.O0, i11, this.E0, this.G0, this.H0, this.w0, this.x0, this.I0, this.U0, this.J0, this.r0, this.W0);
            oo0Var22.c1 = this.c1;
            oo0Var22.d1 = this.d1;
            presentFragment(oo0Var22, this.S0);
            return;
        }
        if (i12 == 2) {
            TLRPC.PaymentForm paymentForm = this.C0;
            if (paymentForm.password_missing && (z10 = this.U0)) {
                oo0 oo0Var3 = new oo0(this.b1, paymentForm, this.N0, this.O0, 6, this.E0, this.G0, this.H0, this.w0, this.x0, this.I0, z10, this.J0, this.r0, this.W0);
                this.f0 = oo0Var3;
                oo0Var3.c1 = this.c1;
                oo0Var3.d1 = this.d1;
                oo0Var3.C0(this.a0);
                oo0 oo0Var4 = this.f0;
                oo0Var4.T = new co0(this);
                presentFragment(oo0Var4, this.S0);
                return;
            }
            mo0 mo0Var2 = this.T;
            if (mo0Var2 != null) {
                mo0Var2.c(this.w0, this.x0, this.U0, this.J0, null);
                finishFragment();
                return;
            } else {
                oo0 oo0Var5 = new oo0(this.b1, paymentForm, this.N0, this.O0, 4, this.E0, this.G0, this.H0, this.w0, this.x0, this.I0, this.U0, this.J0, this.r0, this.W0);
                oo0Var5.c1 = this.c1;
                oo0Var5.d1 = this.d1;
                presentFragment(oo0Var5, this.S0);
                return;
            }
        }
        if (i12 == 3) {
            oo0 oo0Var6 = new oo0(this.b1, this.C0, this.N0, this.O0, this.v0 ? 4 : 2, this.E0, this.G0, this.H0, this.w0, this.x0, this.I0, this.U0, this.J0, this.r0, this.W0);
            oo0Var6.c1 = this.c1;
            oo0Var6.d1 = this.d1;
            presentFragment(oo0Var6, true);
            return;
        }
        if (i12 != 4) {
            if (i12 != 6) {
                return;
            }
            if (this.T.c(this.w0, this.x0, this.U0, this.J0, this.y0)) {
                finishFragment();
                return;
            }
            oo0 oo0Var7 = new oo0(this.b1, this.C0, this.N0, this.O0, 4, this.E0, this.G0, this.H0, this.w0, this.x0, this.I0, this.U0, this.J0, this.r0, false);
            oo0Var7.c1 = this.c1;
            oo0Var7.d1 = this.d1;
            presentFragment(oo0Var7, true);
            return;
        }
        if (this.V0) {
            NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.paymentFinished);
        }
        NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.paymentFinished, new Object[0]);
        if (getMessagesController().newMessageCallback != null) {
            AndroidUtilities.runOnUIThread(new ln0(this, 2), 500L);
        } else {
            if (x0(getParentLayout(), getParentActivity()) || isFinishing()) {
                return;
            }
            finishFragment();
        }
    }

    public final void u0(TLRPC.InputInvoice inputInvoice, TLRPC.PaymentForm paymentForm, MessageObject messageObject, String str, int i10, TLRPC.TL_payments_validatedRequestedInfo tL_payments_validatedRequestedInfo, TLRPC.TL_shippingOption tL_shippingOption, Long l4, String str2, String str3, TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo, boolean z10, TLRPC.TL_inputPaymentCredentialsGooglePay tL_inputPaymentCredentialsGooglePay, org.telegram.ui.ActionBar.m2 m2Var, boolean z11) {
        if (m2Var != null) {
            this.currentAccount = m2Var.getCurrentAccount();
        }
        this.u0 = i10;
        this.r0 = m2Var;
        this.w0 = str2;
        this.J0 = tL_inputPaymentCredentialsGooglePay;
        this.E0 = tL_payments_validatedRequestedInfo;
        this.C0 = paymentForm;
        this.G0 = tL_shippingOption;
        this.H0 = l4;
        this.N0 = messageObject;
        this.O0 = str;
        this.b1 = inputInvoice;
        this.U0 = z10;
        this.W0 = z11;
        this.S0 = ("stripe".equals(paymentForm.native_provider) || "smartglocal".equals(this.C0.native_provider)) ? false : true;
        TLRPC.User user = getMessagesController().getUser(Long.valueOf(paymentForm.bot_id));
        this.l0 = user;
        if (user != null) {
            this.p0 = user.first_name;
        } else {
            this.p0 = "";
        }
        this.q0 = paymentForm.title;
        this.I0 = tL_payments_validateRequestedInfo;
        this.T0 = true;
        if (z10 || this.u0 == 4) {
            this.U0 = z10;
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

    public final void v0(Context context) {
        Optional empty;
        if (getParentActivity() == null) {
            return;
        }
        com.google.android.gms.internal.cast.a aVar = new com.google.android.gms.internal.cast.a();
        int i10 = this.C0.invoice.test ? 3 : 1;
        if (i10 != 2 && i10 != 1 && i10 != 3) {
            Locale locale = Locale.US;
            throw new IllegalArgumentException(hg.c.h(i10, "Invalid environment value "));
        }
        aVar.a = i10;
        this.e = new com.google.android.gms.internal.clearcut.v0(context, v8.p.a, new v8.o(aVar), com.google.android.gms.common.api.i.c);
        try {
            JSONObject put = new JSONObject().put("apiVersion", 2).put("apiVersionMinor", 0);
            put.put("allowedPaymentMethods", new JSONArray().put(p0()));
            empty = Optional.of(put);
        } catch (JSONException unused) {
            empty = Optional.empty();
        }
        if (empty.isPresent()) {
            String jSONObject = ((JSONObject) empty.get()).toString();
            v8.e eVar = new v8.e();
            n6.l.i(jSONObject, "isReadyToPayRequestJson cannot be null!");
            eVar.f = jSONObject;
            com.google.android.gms.internal.clearcut.v0 v0Var = this.e;
            v0Var.getClass();
            com.google.android.gms.common.api.internal.v e = com.google.android.gms.common.api.internal.w.e();
            e.a = 23705;
            e.c = new ka.c(eVar, 26);
            v0Var.e(0, e.a()).addOnCompleteListener(getParentActivity(), new mn0(this, 0));
        }
    }

    public final void w0() {
        if (this.e0) {
            return;
        }
        this.e0 = true;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_account.getPassword(), new on0(this, 1), 10);
    }

    public final boolean x0(org.telegram.ui.ActionBar.b5 b5Var, Activity activity) {
        int i10 = 0;
        if (this.b1 != null) {
            if (b5Var != null) {
                ArrayList arrayList = new ArrayList(b5Var.getFragmentStack());
                int size = arrayList.size();
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    org.telegram.ui.ActionBar.m2 m2Var = (org.telegram.ui.ActionBar.m2) obj;
                    if (m2Var instanceof oo0) {
                        m2Var.removeSelfFromStack();
                    }
                }
                return true;
            }
            return false;
        }
        String str = this.l0.username;
        if (((str != null && str.equalsIgnoreCase(getMessagesController().premiumBotUsername) && this.O0 == null) || (this.O0 != null && getMessagesController().premiumInvoiceSlug != null && Objects.equals(this.O0, getMessagesController().premiumInvoiceSlug))) && b5Var != null) {
            ArrayList arrayList2 = new ArrayList(b5Var.getFragmentStack());
            int size2 = arrayList2.size();
            int i11 = 0;
            while (i11 < size2) {
                Object obj2 = arrayList2.get(i11);
                i11++;
                org.telegram.ui.ActionBar.m2 m2Var2 = (org.telegram.ui.ActionBar.m2) obj2;
                if ((m2Var2 instanceof wn) || (m2Var2 instanceof PremiumPreviewFragment)) {
                    m2Var2.removeSelfFromStack();
                }
            }
            PremiumPreviewFragment premiumPreviewFragment = new PremiumPreviewFragment(0, null);
            premiumPreviewFragment.p0 = true;
            ((ActionBarLayout) b5Var).Q(premiumPreviewFragment, !isFinishing());
            if (activity instanceof LaunchActivity) {
                try {
                    this.fragmentView.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                ((LaunchActivity) activity).x0.c(false);
            }
            return true;
        }
        return false;
    }

    public final void y0(org.telegram.ui.ActionBar.m2 m2Var) {
        AndroidUtilities.hideKeyboard(this.fragmentView);
        if (m2Var instanceof oo0) {
            oo0 oo0Var = (oo0) m2Var;
            oo0Var.Z0 = this.Z0;
            oo0Var.Y0 = this.Y0;
            oo0Var.X0 = this.X0;
            oo0Var.y0 = this.y0;
        }
    }

    public final void z0() {
        String str;
        if (this.Q0) {
            return;
        }
        H0(false, true);
        TLRPC.TL_payments_sendPaymentForm tL_payments_sendPaymentForm = new TLRPC.TL_payments_sendPaymentForm();
        TLRPC.InputInvoice inputInvoice = this.b1;
        if (inputInvoice != null) {
            tL_payments_sendPaymentForm.invoice = inputInvoice;
        } else if (this.N0 != null) {
            TLRPC.TL_inputInvoiceMessage tL_inputInvoiceMessage = new TLRPC.TL_inputInvoiceMessage();
            tL_inputInvoiceMessage.peer = getMessagesController().getInputPeer(this.N0.messageOwner.peer_id);
            tL_inputInvoiceMessage.msg_id = this.N0.getId();
            tL_payments_sendPaymentForm.invoice = tL_inputInvoiceMessage;
        } else {
            TLRPC.TL_inputInvoiceSlug tL_inputInvoiceSlug = new TLRPC.TL_inputInvoiceSlug();
            tL_inputInvoiceSlug.slug = this.O0;
            tL_payments_sendPaymentForm.invoice = tL_inputInvoiceSlug;
        }
        tL_payments_sendPaymentForm.form_id = this.C0.form_id;
        if (UserConfig.getInstance(this.currentAccount).tmpPassword == null || this.y0 == null) {
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
            tL_inputPaymentCredentialsSaved.tmp_password = UserConfig.getInstance(this.currentAccount).tmpPassword.tmp_password;
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
            Long l4 = this.H0;
            tL_payments_sendPaymentForm.tip_amount = l4 != null ? l4.longValue() : 0L;
            tL_payments_sendPaymentForm.flags |= 4;
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_payments_sendPaymentForm, new vb0(10, this, tL_payments_sendPaymentForm), (this.W0 ? 8 : 0) | 2);
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final boolean presentFragment(org.telegram.ui.ActionBar.m2 m2Var, boolean z10) {
        y0(m2Var);
        return super.presentFragment(m2Var, z10);
    }

    public oo0(TLRPC.PaymentForm paymentForm, MessageObject messageObject, String str, org.telegram.ui.ActionBar.m2 m2Var) {
        super(null);
        this.a = new ArrayList();
        this.b = new HashMap();
        this.c = new HashMap();
        this.d = new HashMap();
        this.G = true;
        this.I = new org.telegram.ui.Cells.m4[3];
        this.J = new ArrayList();
        this.K = new org.telegram.ui.Cells.b7[3];
        this.M = new org.telegram.ui.Cells.e9[3];
        this.N = new org.telegram.ui.Cells.ea[2];
        this.Y = new org.telegram.ui.Cells.d9[7];
        this.Z = -4.5f;
        this.c0 = 6;
        this.V0 = true;
        u0(null, paymentForm, messageObject, str, 4, null, null, null, null, null, null, false, null, m2Var, false);
    }

    public oo0(TLRPC.PaymentReceipt paymentReceipt) {
        super(null);
        this.a = new ArrayList();
        this.b = new HashMap();
        this.c = new HashMap();
        this.d = new HashMap();
        this.G = true;
        this.I = new org.telegram.ui.Cells.m4[3];
        this.J = new ArrayList();
        this.K = new org.telegram.ui.Cells.b7[3];
        this.M = new org.telegram.ui.Cells.e9[3];
        this.N = new org.telegram.ui.Cells.ea[2];
        this.Y = new org.telegram.ui.Cells.d9[7];
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
        TLRPC.User user = getMessagesController().getUser(Long.valueOf(paymentReceipt.bot_id));
        this.l0 = user;
        if (user != null) {
            this.p0 = user.first_name;
        } else {
            this.p0 = "";
        }
        this.q0 = paymentReceipt.title;
        if (paymentReceipt.info != null) {
            this.I0 = new TLRPC.TL_payments_validateRequestedInfo();
            if (this.N0 != null) {
                TLRPC.TL_inputInvoiceMessage tL_inputInvoiceMessage = new TLRPC.TL_inputInvoiceMessage();
                tL_inputInvoiceMessage.peer = getMessagesController().getInputPeer(paymentReceipt.bot_id);
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

    public oo0(TLRPC.PaymentForm paymentForm, TLRPC.InputInvoice inputInvoice, org.telegram.ui.ActionBar.m2 m2Var) {
        this(inputInvoice, paymentForm, null, null, 4, null, null, null, null, null, null, false, null, m2Var, false);
        this.V0 = true;
    }
}
